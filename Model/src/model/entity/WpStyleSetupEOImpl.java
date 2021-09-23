package model.entity;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 01 10:58:32 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WpStyleSetupEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        StyleSetupId {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getStyleSetupId();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setStyleSetupId((Number)value);
            }
        }
        ,
        SystemId {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getSystemId();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setSystemId((Number)value);
            }
        }
        ,
        ProductionUnit {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getProductionUnit();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setProductionUnit((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        SamVersion {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getSamVersion();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setSamVersion((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        PbFlag {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getPbFlag();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setPbFlag((String)value);
            }
        }
        ,
        ProjectionStyle {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getProjectionStyle();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setProjectionStyle((String)value);
            }
        }
        ,
        WpStyleWiseProcessSamEO {
            public Object get(WpStyleSetupEOImpl obj) {
                return obj.getWpStyleWiseProcessSamEO();
            }

            public void put(WpStyleSetupEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WpStyleSetupEOImpl object);

        public abstract void put(WpStyleSetupEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int STYLESETUPID = AttributesEnum.StyleSetupId.index();
    public static final int SYSTEMID = AttributesEnum.SystemId.index();
    public static final int PRODUCTIONUNIT = AttributesEnum.ProductionUnit.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int SAMVERSION = AttributesEnum.SamVersion.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int PBFLAG = AttributesEnum.PbFlag.index();
    public static final int PROJECTIONSTYLE = AttributesEnum.ProjectionStyle.index();
    public static final int WPSTYLEWISEPROCESSSAMEO = AttributesEnum.WpStyleWiseProcessSamEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WpStyleSetupEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.WpStyleSetupEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for StyleSetupId, using the alias name StyleSetupId.
     * @return the StyleSetupId
     */
    public Number getStyleSetupId() {
        return (Number)getAttributeInternal(STYLESETUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StyleSetupId.
     * @param value value to set the StyleSetupId
     */
    public void setStyleSetupId(Number value) {
        setAttributeInternal(STYLESETUPID, value);
    }

    /**
     * Gets the attribute value for SystemId, using the alias name SystemId.
     * @return the SystemId
     */
    public Number getSystemId() {
        return (Number)getAttributeInternal(SYSTEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SystemId.
     * @param value value to set the SystemId
     */
    public void setSystemId(Number value) {
        setAttributeInternal(SYSTEMID, value);
    }


    /**
     * Gets the attribute value for ProductionUnit, using the alias name ProductionUnit.
     * @return the ProductionUnit
     */
    public Number getProductionUnit() {
        return (Number)getAttributeInternal(PRODUCTIONUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductionUnit.
     * @param value value to set the ProductionUnit
     */
    public void setProductionUnit(Number value) {
        setAttributeInternal(PRODUCTIONUNIT, value);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for SamVersion, using the alias name SamVersion.
     * @return the SamVersion
     */
    public Number getSamVersion() {
        return (Number)getAttributeInternal(SAMVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for SamVersion.
     * @param value value to set the SamVersion
     */
    public void setSamVersion(Number value) {
        setAttributeInternal(SAMVERSION, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for PbFlag, using the alias name PbFlag.
     * @return the PbFlag
     */
    public String getPbFlag() {
        return (String)getAttributeInternal(PBFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for PbFlag.
     * @param value value to set the PbFlag
     */
    public void setPbFlag(String value) {
        setAttributeInternal(PBFLAG, value);
    }

    /**
     * Gets the attribute value for ProjectionStyle, using the alias name ProjectionStyle.
     * @return the ProjectionStyle
     */
    public String getProjectionStyle() {
        return (String)getAttributeInternal(PROJECTIONSTYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectionStyle.
     * @param value value to set the ProjectionStyle
     */
    public void setProjectionStyle(String value) {
        setAttributeInternal(PROJECTIONSTYLE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getWpStyleWiseProcessSamEO() {
        return (RowIterator)getAttributeInternal(WPSTYLEWISEPROCESSSAMEO);
    }


    /**
     * @param styleSetupId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number styleSetupId) {
        return new Key(new Object[]{styleSetupId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
     protected void create(AttributeList attributeList) {
         
         Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String orgId = (String)sessionScope.get("orgId");
         
            super.create(attributeList);
  
             oracle.jbo.server.SequenceImpl s =
             new oracle.jbo.server.SequenceImpl("WP_STYLE_SETUP_SEQ",  getDBTransaction());
            oracle.jbo.domain.Number sVal = s.getSequenceNumber();
             this.setStyleSetupId(sVal);


        try {
            this.setOrgId( new Number(orgId)  );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     /**
      * Add locking logic here.
      */
     public void lock() {
         super.lock();
     }

     /**
      * Custom DML update/insert/delete logic here.
      * @param operation the operation type
      * @param e the transaction event
      */
     protected void doDML(int operation, TransactionEvent e) {
         Map sessionScope = ADFContext.getCurrent().getSessionScope();
              String user = (String)sessionScope.get("userId");
              
         //        System.out.println("Document No -->" + getSrNoString());
               
              if (DML_UPDATE == operation) {
                  try {
                      setLastUpdatedDate((Date)Date.getCurrentDate());
                      setLastUpdatedBy(new oracle.jbo.domain.Number(user));              
                      
                  } catch (SQLException f) {
                      f.printStackTrace();
                  }
              } else if (DML_INSERT == operation) {

                  try {
                    
                      setCreationDate((Date)Date.getCurrentDate());
                      setCreatedBy(new oracle.jbo.domain.Number(user));

                  } catch (SQLException f) {
                      f.printStackTrace();
                  }
              }
              
          
         super.doDML(operation, e);
     }
}
