package model.service;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import model.service.common.AppModule;

import model.view.CWPLDefaultProcessesVOImpl;
import model.view.PocStylesVOImpl;
import model.view.PopulateProcessVOImpl;
import model.view.SamVOImpl;


import model.view.WpStyleSetupVOImpl;
import model.view.WpStyleWiseProcessSamVOImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 01 11:19:25 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }
    
    
    public void setSessionValues(String orgId, String userId, String respId,
                                 String respApplId) {  
        
    //    System.out.println("====================  set session values    ================================");

    //       System.out.println(" orgId "+ orgId  + "  data type  "+ orgId.getClass().getName());
    //
//       orgId = "343";
//       userId = "5219";
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);

        if (orgId != null) {
            userSession.setAttribute("orgId", orgId);
        }

        if (userId != null) {
            userSession.setAttribute("userId", userId);
        }

        if (respId != null) {
            userSession.setAttribute("respId", respId);
        }

        if (respApplId != null) {
            userSession.setAttribute("respApplId", respApplId);
        }         
         
      }


    /**
     * Container's getter for OrgVO1.
     * @return OrgVO1
     */
    public ViewObjectImpl getOrgVO1() {
        return (ViewObjectImpl)findViewObject("OrgVO1");
    }

    /**
     * Container's getter for SamVO1.
     * @return SamVO1
     */
    public ViewObjectImpl getSamVO1() {
        return (ViewObjectImpl)findViewObject("SamVO1");
    }

    /**
     * Container's getter for OrgVO_vs_SamVO_VL1.
     * @return OrgVO_vs_SamVO_VL1
     */
    public ViewLinkImpl getOrgVO_vs_SamVO_VL1() {
        return (ViewLinkImpl)findViewLink("OrgVO_vs_SamVO_VL1");
    }

    /**
     * Container's getter for PocStylesVO1.
     * @return PocStylesVO1
     */
    public PocStylesVOImpl getPocStylesVO1() {
        return (PocStylesVOImpl)findViewObject("PocStylesVO1");
    }

    /**
     * Container's getter for PopulateProcessVO1.
     * @return PopulateProcessVO1
     */
    public ViewObjectImpl getPopulateProcessVO1() {
        return (ViewObjectImpl)findViewObject("PopulateProcessVO1");
    }

    /**
     * Container's getter for OrgVO_vs_PopluateProcessesVO_vl1.
     * @return OrgVO_vs_PopluateProcessesVO_vl1
     */
    public ViewLinkImpl getOrgVO_vs_PopluateProcessesVO_vl1() {
        return (ViewLinkImpl)findViewLink("OrgVO_vs_PopluateProcessesVO_vl1");
    }

    /**
     * Container's getter for WpProjectionStyleVO1.
     * @return WpProjectionStyleVO1
     */
    public ViewObjectImpl getWpProjectionStyleVO1() {
        return (ViewObjectImpl)findViewObject("WpProjectionStyleVO1");
    }

    /**
     * Container's getter for CWPLDefaultProcessesVO1.
     * @return CWPLDefaultProcessesVO1
     */
    public CWPLDefaultProcessesVOImpl getCWPLDefaultProcessesVO1() {
        return (CWPLDefaultProcessesVOImpl)findViewObject("CWPLDefaultProcessesVO1");
    }

    /**
     * Container's getter for WpStyleSetupVO1.
     * @return WpStyleSetupVO1
     */
    public WpStyleSetupVOImpl getWpStyleSetupVO1() {
        return (WpStyleSetupVOImpl)findViewObject("WpStyleSetupVO1");
    }

    /**
     * Container's getter for OrgVO_vs_WpStyleSetupVO_vl1.
     * @return OrgVO_vs_WpStyleSetupVO_vl1
     */
    public ViewLinkImpl getOrgVO_vs_WpStyleSetupVO_vl1() {
        return (ViewLinkImpl)findViewLink("OrgVO_vs_WpStyleSetupVO_vl1");
    }

    /**
     * Container's getter for WpStyleWiseProcessSamVO1.
     * @return WpStyleWiseProcessSamVO1
     */
    public WpStyleWiseProcessSamVOImpl getWpStyleWiseProcessSamVO1() {
        return (WpStyleWiseProcessSamVOImpl)findViewObject("WpStyleWiseProcessSamVO1");
    }

    /**
     * Container's getter for WpStyleWiseProcessSamR01Link1.
     * @return WpStyleWiseProcessSamR01Link1
     */
    public ViewLinkImpl getWpStyleWiseProcessSamR01Link1() {
        return (ViewLinkImpl)findViewLink("WpStyleWiseProcessSamR01Link1");
    }

    /**
     * Container's getter for CurrentSamVsAvailableSamVO1.
     * @return CurrentSamVsAvailableSamVO1
     */
    public ViewObjectImpl getCurrentSamVsAvailableSamVO1() {
        return (ViewObjectImpl)findViewObject("CurrentSamVsAvailableSamVO1");
    }

    /**
     * Container's getter for WpStyleSetupVO_vs_CurrentSamVsAvailableSamVO_vl1.
     * @return WpStyleSetupVO_vs_CurrentSamVsAvailableSamVO_vl1
     */
    public ViewLinkImpl getWpStyleSetupVO_vs_CurrentSamVsAvailableSamVO_vl1() {
        return (ViewLinkImpl)findViewLink("WpStyleSetupVO_vs_CurrentSamVsAvailableSamVO_vl1");
    }


    /**
     * Container's getter for WpStyleSetupVO2.
     * @return WpStyleSetupVO2
     */
    public WpStyleSetupVOImpl getWpStyleSetupVO2() {
        return (WpStyleSetupVOImpl)findViewObject("WpStyleSetupVO2");
    }

    /**
     * Container's getter for OrgVO_vs_WpStyleSetupVO_vl2.
     * @return OrgVO_vs_WpStyleSetupVO_vl2
     */
    public ViewLinkImpl getOrgVO_vs_WpStyleSetupVO_vl2() {
        return (ViewLinkImpl)findViewLink("OrgVO_vs_WpStyleSetupVO_vl2");
    }

    /**
     * Container's getter for WpStyleWiseProcessSamVO2.
     * @return WpStyleWiseProcessSamVO2
     */
    public WpStyleWiseProcessSamVOImpl getWpStyleWiseProcessSamVO2() {
        return (WpStyleWiseProcessSamVOImpl)findViewObject("WpStyleWiseProcessSamVO2");
    }

    /**
     * Container's getter for WpStyleWiseProcessSamR01Link2.
     * @return WpStyleWiseProcessSamR01Link2
     */
    public ViewLinkImpl getWpStyleWiseProcessSamR01Link2() {
        return (ViewLinkImpl)findViewLink("WpStyleWiseProcessSamR01Link2");
    }
}
