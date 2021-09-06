import java.sql.CallableStatement;

import java.util.Map;

import javax.faces.event.ActionEvent;

import model.service.AppModuleImpl;

import model.view.PocStylesVORowImpl;

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

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class ManagedBean {
    private RichTable styleSetupTable;
    private RichTable processSamTable;

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
            System.out.println("dialogEvent.getOutcome().name().equals(\"ok\")" );
        
            populateStyle();
            
         AdfFacesContext.getCurrentInstance().addPartialTarget(this.getStyleSetupTable());
            AdfFacesContext.getCurrentInstance().addPartialTarget(this.getProcessSamTable());
            
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
        
        
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
                    
                   System.out.println(  "flag != null &&  flag.equals(\"y\")");
                    
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
                    
                    Number samVersion = pocStylesRow.getSamVersion();
                    if (samVersion != null){
                        wpStyleSetupRow.setSamVersion(pocStylesRow.getSamVersion());
                    }
                    else{
                        wpStyleSetupRow.setSamVersion(new Number(0));
                    }

                    wpStyleSetupVo.insertRow(wpStyleSetupRow);
                    
                   populateStyleWiseProcesses(pocStylesRow.getSystemId());
                
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


    private void populateStyleWiseProcesses(Number systemId) {
        WpStyleWiseProcessSamVOImpl styleWiseProcessSamVo = (WpStyleWiseProcessSamVOImpl)appM.getWpStyleWiseProcessSamVO1();
        WpStyleWiseProcessSamVORowImpl styleWiseProcessSamVoRow = null;
        
        SamVOImpl samVo = (SamVOImpl)appM.getSamVO1();
        samVo.setp_system_id(systemId.toString());
        samVo.setRangeSize(100);
        samVo.executeQuery();       
        SamVORowImpl SamVoRow = null;
        
        Row[] samVoRows =  samVo.getAllRowsInRange();
             
        for(Row row: samVoRows){
            SamVoRow = (SamVORowImpl)row;
            
            styleWiseProcessSamVoRow = (WpStyleWiseProcessSamVORowImpl)styleWiseProcessSamVo.createRow();
            
            styleWiseProcessSamVoRow.setWpProcessId(SamVoRow.getWpProcessId());
            styleWiseProcessSamVoRow.setBatchQty(SamVoRow.getBatchQty());
            styleWiseProcessSamVoRow.setBatchTime(SamVoRow.getBatchTime());
            styleWiseProcessSamVoRow.setSam(SamVoRow.getSam());
            styleWiseProcessSamVoRow.setProcessSeq(SamVoRow.getSeqNo());
            styleWiseProcessSamVoRow.setProcessName(SamVoRow.getProcessName());
        }
        
        
    }

    public void updateStyleVersion(ActionEvent actionEvent) {
        // Add event code here...
        
        String statement = "BEGIN APPS.UPDATE_WP_STYLE_SETUP_VERSION(:1,:2); END;";
        CallableStatement cs =  appM.getDBTransaction().createCallableStatement(statement, 1);
        WpStyleSetupVOImpl styleSetupVo = (WpStyleSetupVOImpl)appM.getWpStyleSetupVO1();
        WpStyleSetupVORowImpl styleSetupVoRow = (WpStyleSetupVORowImpl)styleSetupVo.getCurrentRow();
        String styleSetupId =   styleSetupVoRow.getStyleSetupId().toString();
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String userId = (String)sessionScope.get("userId");
        
        
        try {
            cs.setInt(1, Integer.parseInt(styleSetupId));
            cs.setInt(2, Integer.parseInt(userId));
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
}
