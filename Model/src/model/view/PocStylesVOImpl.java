package model.view;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 04 22:07:06 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PocStylesVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public PocStylesVOImpl() {
    }

    /**
     * Returns the bind variable value for p_org_id.
     * @return bind variable value for p_org_id
     */
    public String getp_org_id() {
        return (String)getNamedWhereClauseParam("p_org_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_org_id.
     * @param value value to bind as p_org_id
     */
    public void setp_org_id(String value) {
        setNamedWhereClauseParam("p_org_id", value);
    }
}
