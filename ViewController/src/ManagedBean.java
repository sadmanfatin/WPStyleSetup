import java.sql.CallableStatement;

import java.util.Iterator;
import java.util.Map;

import javax.faces.event.ActionEvent;

import model.service.AppModuleImpl;

import model.view.CWPLDefaultProcessesVOImpl;
import model.view.CWPLDefaultProcessesVORowImpl;
import model.view.PocStylesVORowImpl;

import model.view.PopulateProcessVOImpl;
import model.view.PopulateProcessVORowImpl;
import model.view.SamVOImpl;
import model.view.SamVORowImpl;
import model.view.WpStyleSetupVOImpl;
import model.view.WpStyleSetupVORowImpl;

import model.view.WpStyleWiseProcessSamVOImpl;

import model.view.WpStyleWiseProcessSamVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.adf.view.rich.event.PopupFetchEvent;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class ManagedBean {
    private RichTable styleSetupTable;
    private RichTable processSamTable;
    private RichTable populateStyleTable;

    public ManagedBean() {
    }
    
    AppModuleImpl appM = getAppModuleImpl();

    public AppModuleImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
        AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
        return appM;
    }

    public void populateStyleDialogueListener(DialogEvent dialogEvent) {
        // Add event code here...
        if (dialogEvent.getOutcome().name().equals("ok")) {
         //   System.out.println("dialogEvent.getOutcome().name().equals(\"ok\")" );
        
            populateStyle();
            
         AdfFacesContext.getCurrentInstance().addPartialTarget(this.getStyleSetupTable());
            AdfFacesContext.getCurrentInstance().addPartialTarget(this.getProcessSamTable());
            
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
        
        
    }
    
    public void populateStyleActionListener(ActionEvent e){
        populateStyle();
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getStyleSetupTable());
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getProcessSamTable());
    }
    
    

    private void populateStyle() {
        
        
        
        ViewObject pocStylesVo = appM.getPocStylesVO1();
        ViewObject  wpStyleSetupVo = appM.getWpStyleSetupVO1();
        
          PocStylesVORowImpl   pocStylesRow = null;
           WpStyleSetupVORowImpl wpStyleSetupRow = null; 
            
           String flag= null;

        Row rows[] =  pocStylesVo.getAllRowsInRange();
        for (Row row : rows) {
            pocStylesRow = (PocStylesVORowImpl)row;
            
         //   System.out.println("=======  loop count  ====================");
            try {
                flag =   pocStylesRow.getCheckBox();
                
                if ( flag != null &&  flag.equals("y")) {
                    
                 //  System.out.println(  "flag != null &&  flag.equals(\"y\")");
                    
                    wpStyleSetupRow = (WpStyleSetupVORowImpl)wpStyleSetupVo.createRow();
                
                 //    wpStyleSetupRow.setOrgId(   new Number (pocStylesRow.getOrgId()));
                 //   wpStyleSetupRow.setOrgName(pocStylesRow.getOrgName());
                    wpStyleSetupRow.setSystemId(pocStylesRow.getSystemId());   
                    wpStyleSetupRow.setBuyerId(pocStylesRow.getBuyerId());
                    wpStyleSetupRow.setBuyerName(pocStylesRow.getBuyerName());
                    wpStyleSetupRow.setSeason(pocStylesRow.getSeason());
                    wpStyleSetupRow.setStyle(pocStylesRow.getStyle());
                    wpStyleSetupRow.setColor(pocStylesRow.getColor());
                    wpStyleSetupRow.setWashName(pocStylesRow.getWashName());
                    wpStyleSetupRow.setLcUnit(pocStylesRow.getLcUnit());
                    wpStyleSetupRow.setLcUnitName(pocStylesRow.getLcUnitName());
                    wpStyleSetupRow.setProductionUnit(pocStylesRow.getProductionUnit());
                    wpStyleSetupRow.setProductionUnitName(pocStylesRow.getProductionUnitName());
                    wpStyleSetupRow.setOrderQty(pocStylesRow.getOrderQty());
                    wpStyleSetupRow.setFabrication(pocStylesRow.getFabrication());
                    wpStyleSetupRow.setItemDescription(pocStylesRow.getItemDescription());
                    Number samVersion = pocStylesRow.getSamVersion();
                    if (samVersion != null){
                        wpStyleSetupRow.setSamVersion(pocStylesRow.getSamVersion());
                    }
                    else{
                        wpStyleSetupRow.setSamVersion(new Number(0));
                    }

                    wpStyleSetupVo.insertRow(wpStyleSetupRow);
                    
                   populateStyleWiseProcesses(pocStylesRow.getSystemId() , wpStyleSetupRow.getOrgId().toString() );
                
                //   populateProcesses(pocStylesRow.getSectionId(),   new Number(pocStylesRow.getOrgId())   );
                }
                    
            } catch (Exception e) {
               e.printStackTrace() ;
            }

        }
        
   
        
        
    }

    public void setStyleSetupTable(RichTable styleSetupTable) {
        this.styleSetupTable = styleSetupTable;
    }

    public RichTable getStyleSetupTable() {
        return styleSetupTable;
    }

    public void setProcessSamTable(RichTable processSamTable) {
        this.processSamTable = processSamTable;
    }

    public RichTable getProcessSamTable() {
        return processSamTable;
    }


    private void populateStyleWiseProcesses(Number systemId , String orgId) {
        WpStyleWiseProcessSamVOImpl styleWiseProcessSamVo = (WpStyleWiseProcessSamVOImpl)appM.getWpStyleWiseProcessSamVO1();
        WpStyleWiseProcessSamVORowImpl styleWiseProcessSamVoRow = null;
        CWPLDefaultProcessesVOImpl cwplDefaultProcessesVo = (CWPLDefaultProcessesVOImpl)appM.getCWPLDefaultProcessesVO1();
        CWPLDefaultProcessesVORowImpl   cwplDefaultProcessesVoRow = null ; 
        
        SamVOImpl samVo = (SamVOImpl)appM.getSamVO1();
        samVo.setp_system_id(systemId.toString());
        samVo.setRangeSize(100);
        samVo.executeQuery();       
        SamVORowImpl SamVoRow = null;
        
        Row[] samVoRows =  samVo.getAllRowsInRange();
             
       String samVoSectionType = null;
         
             
        for(Row row: samVoRows){
          
            SamVoRow = (SamVORowImpl)row;
         //     samVoSectionType = (String)row.getAttribute("SectionType");
           samVoSectionType  =   SamVoRow.getSectionType();
             
           //  /** populate all process for GWL and only dry processes for CWPL from samView   */
            
          //if( orgId.equals("344")  || (orgId.equals("343")  && samVoSectionType.equals("Dry") )    ) {
                
                styleWiseProcessSamVoRow = (WpStyleWiseProcessSamVORowImpl)styleWiseProcessSamVo.createRow();   
            
                styleWiseProcessSamVoRow.setWpProcessId(SamVoRow.getWpProcessId());


                       if (! orgId.equals("343")) {  // populate all for all units
                           styleWiseProcessSamVoRow.setBatchQty(SamVoRow.getBatchQty());
                           styleWiseProcessSamVoRow.setBatchTime(SamVoRow.getBatchTime());
                           styleWiseProcessSamVoRow.setSam(SamVoRow.getSam());
                           styleWiseProcessSamVoRow.setProcessSeq(SamVoRow.getSeqNo());
                           styleWiseProcessSamVoRow.setProcessName(SamVoRow.getProcessName());
                           styleWiseProcessSamVoRow.setSectionType(SamVoRow.getSectionType());
                            styleWiseProcessSamVo.insertRow(styleWiseProcessSamVoRow);
                       
                       
                       }

                       else if (orgId.equals("343") && samVoSectionType.equals("Dry")) { 
                           // for cwpl only populate sam for dry process
                           styleWiseProcessSamVoRow.setSam(SamVoRow.getSam());
                           styleWiseProcessSamVoRow.setOriginalSam(SamVoRow.getSam());
                       } 
                       else if (orgId.equals("343") && samVoSectionType.equals("Wet")) {
                           
                           // for cwpl only populate batch info in original field  for dry process
                           styleWiseProcessSamVoRow.setOriginalBatchQty(SamVoRow.getBatchQty());
                           styleWiseProcessSamVoRow.setOriginalBatchTime(SamVoRow.getBatchTime());
                          
                       }

                       styleWiseProcessSamVoRow.setProcessSeq(SamVoRow.getSeqNo());
                       styleWiseProcessSamVoRow.setProcessName(SamVoRow.getProcessName());
                       styleWiseProcessSamVoRow.setSectionType(SamVoRow.getSectionType());
                          
                      
                      styleWiseProcessSamVo.insertRow(styleWiseProcessSamVoRow);
            
            
                
        //  }
            
                        
        }   
        
        
   
        
    }

    public void updateStyleSamVersion(ActionEvent actionEvent) {
        // Add event code here...
        
        String statement = "BEGIN APPS.UPDATE_WP_STYLE_SETUP_VERSION(:1,:2, :3); END;";
        CallableStatement cs =  appM.getDBTransaction().createCallableStatement(statement, 1);
        WpStyleSetupVOImpl styleSetupVo = (WpStyleSetupVOImpl)appM.getWpStyleSetupVO1();
        WpStyleSetupVORowImpl styleSetupVoRow = (WpStyleSetupVORowImpl)styleSetupVo.getCurrentRow();
        String styleSetupId =   styleSetupVoRow.getStyleSetupId().toString();
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String userId = (String)sessionScope.get("userId");
        String orgId = styleSetupVoRow.getOrgId().toString();
        
        try {
            cs.setInt(1, Integer.parseInt(styleSetupId));
            cs.setInt(2, Integer.parseInt(userId));
            cs.setInt(3, Integer.parseInt(orgId));
            cs.execute();
        }
        catch(Exception e){
            e.printStackTrace();
            ;
        }              
        
       this.refreshQueryKeepingCurrentRow(styleSetupVo);
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getStyleSetupTable());
        
    }
    
    
    public void refreshQueryKeepingCurrentRow(ViewObject viewObject )  {
        
        
         Row currentRow;
         Key currentRowKey;
         
         // added on 7.jan.18 to handle exception if view object has no current row
        try{
           currentRow = viewObject.getCurrentRow();
           currentRowKey = currentRow.getKey();
        }
        catch(Exception e){
            return;
        }     
       int rangePosOfCurrentRow = viewObject.getRangeIndexOf(currentRow);
       int rangeStartBeforeQuery = viewObject.getRangeStart();
       viewObject.executeQuery();
       viewObject.setRangeStart(rangeStartBeforeQuery);
       /*
        * In 10.1.2, there is this convenience method we could use
        * instead of the remaining lines of code
        *
        *  findAndSetCurrentRowByKey(currentRowKey,rangePosOfCurrentRow);
        *  
        */
       
         
       Row[] rows = viewObject.findByKey(currentRowKey, 1);
       if (rows != null && rows.length == 1)
       {
          viewObject.scrollRangeTo(rows[0], rangePosOfCurrentRow);
          viewObject.setCurrentRowAtRangeIndex(viewObject.getRangeIndexOf(rows[0]));
       }
       
               
     }

    public void populateProjectionStyle(ActionEvent actionEvent) {
        // Add event code here...
       // System.out.println("populate projection style method");
        
        ViewObject projectionStyleVo = appM.getWpProjectionStyleVO1();
        Row projectionStyleVoCurrentRow = projectionStyleVo.getCurrentRow();
       // System.out.println(projectionStyleVoCurrentRow.getAttribute("Style"));

         
        ViewObject styleSetupVo = appM.getWpStyleSetupVO1();
        Row styleSetupVoRow ;
        styleSetupVoRow = styleSetupVo.getCurrentRow();

         //   System.out.println("! projectionStyleSystemId.equals(styleSetupSystemId) ");
       styleSetupVoRow = styleSetupVo.createRow();
           

       styleSetupVoRow.setAttribute("SystemId", projectionStyleVoCurrentRow.getAttribute("SystemId"));        
        styleSetupVoRow.setAttribute("BuyerName",projectionStyleVoCurrentRow.getAttribute("BuyerName"));
        styleSetupVoRow.setAttribute("Season",projectionStyleVoCurrentRow.getAttribute("Season"));
        styleSetupVoRow.setAttribute("Style",projectionStyleVoCurrentRow.getAttribute("Style"));
        styleSetupVoRow.setAttribute("Color",projectionStyleVoCurrentRow.getAttribute("Color"));
        styleSetupVoRow.setAttribute("WashName",projectionStyleVoCurrentRow.getAttribute("Wash"));
        styleSetupVoRow.setAttribute("LcUnit",projectionStyleVoCurrentRow.getAttribute("LcUnit"));
        styleSetupVoRow.setAttribute("LcUnitName",projectionStyleVoCurrentRow.getAttribute("LcUnitName"));
        styleSetupVoRow.setAttribute("ProductionUnit",projectionStyleVoCurrentRow.getAttribute("LcUnit"));
        styleSetupVoRow.setAttribute("ProductionUnitName",projectionStyleVoCurrentRow.getAttribute("LcUnitName"));
        styleSetupVoRow.setAttribute("OrderQty",projectionStyleVoCurrentRow.getAttribute("OrderedQty"));  
        styleSetupVoRow.setAttribute("SamVersion",0);  
       // styleSetupVoRow.setAttribute("AvailableSamVersion",0);  
        styleSetupVoRow.setAttribute("ProjectionStyle","y");  
        styleSetupVo.insertRow(styleSetupVoRow);
        styleSetupVo.setCurrentRow(styleSetupVoRow);
        
        
    }

    public void populateProcessesForStyle(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
                 //   System.out.println("dialogEvent.getOutcome().name().equals(\"ok\")" );
                
                    populateSelectedProcesse();
                    
                 AdfFacesContext.getCurrentInstance().addPartialTarget(this.getStyleSetupTable());
                    AdfFacesContext.getCurrentInstance().addPartialTarget(this.getProcessSamTable());
                    
                } else if (dialogEvent.getOutcome().name().equals("cancel")) {
                    ;
                }
    }

    private void populateSelectedProcesse() {
        WpStyleWiseProcessSamVOImpl styleWiseProcessSamVo =
            (WpStyleWiseProcessSamVOImpl)appM.getWpStyleWiseProcessSamVO1();
        WpStyleWiseProcessSamVORowImpl styleWiseProcessSamVoRow = null;

        PopulateProcessVOImpl populateProcessVo =
            (PopulateProcessVOImpl)appM.getPopulateProcessVO1();
        PopulateProcessVORowImpl populateProcessVoRow = null;

        String flag = null;
        Row[] populateProcessVoRows = populateProcessVo.getAllRowsInRange();
        
        
        
        

        for (Row row : populateProcessVoRows) {

            populateProcessVoRow = (PopulateProcessVORowImpl)row;

            try {
                flag = populateProcessVoRow.getSelectProcess();

                if (flag != null && flag.equals("y")) {
                    styleWiseProcessSamVoRow =
                            (WpStyleWiseProcessSamVORowImpl)styleWiseProcessSamVo.createRow();
                    styleWiseProcessSamVoRow.setWpProcessId(populateProcessVoRow.getWpProcessId());
                    styleWiseProcessSamVoRow.setProcessName(populateProcessVoRow.getProcessName());
                    styleWiseProcessSamVoRow.setSectionType(populateProcessVoRow.getSectionType());
                    styleWiseProcessSamVo.insertRow(styleWiseProcessSamVoRow);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }


    public void populateProcessPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        String currentSystemId = null ;
            
            try{
                currentSystemId = appM.getWpStyleSetupVO1().getCurrentRow().getAttribute("SystemId").toString();
            }
            catch(Exception e){
                e.printStackTrace();
                currentSystemId = "NoSystemId" ;
                
            }
        PopulateProcessVOImpl populateProcessVo = (PopulateProcessVOImpl)appM.getPopulateProcessVO1(); 
        populateProcessVo.setp_system_id(currentSystemId);
        populateProcessVo.executeQuery();
        
    }



    public void updateProjectionStyle(ActionEvent actionEvent) {
        // Add event code here...
        
        ViewObject projectionStyleVo = appM.getWpProjectionStyleVO1();
        Row projectionStyleVoCurrentRow = projectionStyleVo.getCurrentRow();
        // System.out.println(projectionStyleVoCurrentRow.getAttribute("Style"));
        // Number  projectionStyleSystemId = (Number)projectionStyleVoCurrentRow.getAttribute("SystemId");
        
        ViewObject styleSetupVo = appM.getWpStyleSetupVO1();
        Row styleSetupVoRow ;
        styleSetupVoRow = styleSetupVo.getCurrentRow();
       // Number styleSetupSystemId = (Number)styleSetupVoRow.getAttribute("SystemId");
               
       styleSetupVoRow.setAttribute("BuyerName",projectionStyleVoCurrentRow.getAttribute("BuyerName"));
       styleSetupVoRow.setAttribute("Season",projectionStyleVoCurrentRow.getAttribute("Season"));
       styleSetupVoRow.setAttribute("Style",projectionStyleVoCurrentRow.getAttribute("Style"));
       styleSetupVoRow.setAttribute("Color",projectionStyleVoCurrentRow.getAttribute("Color"));
       styleSetupVoRow.setAttribute("WashName",projectionStyleVoCurrentRow.getAttribute("Wash"));
       styleSetupVoRow.setAttribute("LcUnit",projectionStyleVoCurrentRow.getAttribute("LcUnit"));
       styleSetupVoRow.setAttribute("LcUnitName",projectionStyleVoCurrentRow.getAttribute("LcUnitName"));
       styleSetupVoRow.setAttribute("ProductionUnit",projectionStyleVoCurrentRow.getAttribute("LcUnit"));
       styleSetupVoRow.setAttribute("ProductionUnitName",projectionStyleVoCurrentRow.getAttribute("LcUnitName"));
       styleSetupVoRow.setAttribute("OrderQty",projectionStyleVoCurrentRow.getAttribute("OrderedQty"));  
     
    }

    public void populateProcessFromStyleDialogeListener(DialogEvent dialogEvent) {
        // Add event code here...
        
        if (dialogEvent.getOutcome().name().equals("ok")) {
         //   System.out.println("dialogEvent.getOutcome().name().equals(\"ok\")" );
         ViewObject styleSetupVo2  = appM.getWpStyleSetupVO2();
         ViewObject populatingToProcessVo = appM.getWpStyleWiseProcessSamVO1();
         ViewObject populatingFromProcessVo = appM.getWpStyleWiseProcessSamVO2();
         ViewObject populatingFromStyleVo = appM.getWpStyleSetupVO2();
         Row populatingFromStyleVoCurrentRow = populatingFromStyleVo.getCurrentRow();
         Row[] matchedProcessRows ;
        Number wpProcessId = null;
 
                if( populatingFromStyleVoCurrentRow  !=  null){
                                                                                
                        Row populatingToProcessVoRow;
                        Row[]  populatingFromProcessVoRows = populatingFromProcessVo.getAllRowsInRange();
                        
                        for (Row populatingFromProcessVoRow : populatingFromProcessVoRows ) {
                            
                            wpProcessId = (Number)populatingFromProcessVoRow.getAttribute("WpProcessId");
                          //  System.out.println("  wpProcessId "  + wpProcessId + " processName   "+populatingFromProcessVoRow.getAttribute("ProcessName"));                          
                            
                            matchedProcessRows =  populatingToProcessVo.getFilteredRows("WpProcessId", wpProcessId);
                           //   System.out.println("  matchedProcessRows.length "+  matchedProcessRows.length);
                                                       
                            if ( matchedProcessRows.length == 0){         // if process doesn't already exist then populate                       
                                
                                populatingToProcessVoRow  =  populatingToProcessVo.createRow();                                
                                populatingToProcessVoRow.setAttribute("WpProcessId", populatingFromProcessVoRow.getAttribute("WpProcessId"));
                                populatingToProcessVoRow.setAttribute("ProcessName", populatingFromProcessVoRow.getAttribute("ProcessName"));
                                populatingToProcessVoRow.setAttribute("ProcessSeq", populatingFromProcessVoRow.getAttribute("ProcessSeq"));
                                populatingToProcessVoRow.setAttribute("SectionType", populatingFromProcessVoRow.getAttribute("SectionType"));
                                populatingToProcessVoRow.setAttribute("Sam", populatingFromProcessVoRow.getAttribute("Sam"));
                                populatingToProcessVoRow.setAttribute("BatchQty", populatingFromProcessVoRow.getAttribute("BatchQty"));
                                populatingToProcessVoRow.setAttribute("BatchTime", populatingFromProcessVoRow.getAttribute("BatchTime"));
                                populatingToProcessVo.insertRow(populatingToProcessVoRow);                                
                                
                            }                                                    
                       
                        }                                                               
                    
                    }             
         
            AdfFacesContext.getCurrentInstance().addPartialTarget(this.getProcessSamTable());
            
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
    }


    public void populateStylePopupFetchListener(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        appM.getPocStylesVO1().executeQuery();
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPopulateStyleTable());
    }

    public void setPopulateStyleTable(RichTable populateStyleTable) {
        this.populateStyleTable = populateStyleTable;
    }

    public RichTable getPopulateStyleTable() {
        return populateStyleTable;
    }
}
