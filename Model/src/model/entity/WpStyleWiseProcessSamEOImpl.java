package model.entity;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 01 10:58:41 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WpStyleWiseProcessSamEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SamId {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getSamId();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setSamId((Number)value);
            }
        }
        ,
        StyleSetupId {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getStyleSetupId();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setStyleSetupId((Number)value);
            }
        }
        ,
        WpProcessId {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getWpProcessId();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setWpProcessId((Number)value);
            }
        }
        ,
        ProcessSeq {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getProcessSeq();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setProcessSeq((Number)value);
            }
        }
        ,
        PlanDay {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getPlanDay();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setPlanDay((Number)value);
            }
        }
        ,
        BatchQty {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getBatchQty();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setBatchQty((Number)value);
            }
        }
        ,
        BatchTime {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getBatchTime();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setBatchTime((Number)value);
            }
        }
        ,
        Sam {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getSam();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setSam((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        SamVersion {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getSamVersion();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setSamVersion((Number)value);
            }
        }
        ,
        SystemId {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getSystemId();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setSystemId((Number)value);
            }
        }
        ,
        OriginalBatchQty {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getOriginalBatchQty();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setOriginalBatchQty((Number)value);
            }
        }
        ,
        OriginalBatchTime {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getOriginalBatchTime();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setOriginalBatchTime((Number)value);
            }
        }
        ,
        OriginalSam {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getOriginalSam();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setOriginalSam((Number)value);
            }
        }
        ,
        WpStyleSetupEO {
            public Object get(WpStyleWiseProcessSamEOImpl obj) {
                return obj.getWpStyleSetupEO();
            }

            public void put(WpStyleWiseProcessSamEOImpl obj, Object value) {
                obj.setWpStyleSetupEO((WpStyleSetupEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WpStyleWiseProcessSamEOImpl object);

        public abstract void put(WpStyleWiseProcessSamEOImpl object,
                                 Object value);

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


    public static final int WPSTYLESETUPEO1 = AttributesEnum.WpStyleSetupEO.index();

    public static final int SAMID = AttributesEnum.SamId.index();
    public static final int STYLESETUPID = AttributesEnum.StyleSetupId.index();
    public static final int WPPROCESSID = AttributesEnum.WpProcessId.index();
    public static final int PROCESSSEQ = AttributesEnum.ProcessSeq.index();
    public static final int PLANDAY = AttributesEnum.PlanDay.index();
    public static final int BATCHQTY = AttributesEnum.BatchQty.index();
    public static final int BATCHTIME = AttributesEnum.BatchTime.index();
    public static final int SAM = AttributesEnum.Sam.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int SAMVERSION = AttributesEnum.SamVersion.index();
    public static final int SYSTEMID = AttributesEnum.SystemId.index();
    public static final int ORIGINALBATCHQTY = AttributesEnum.OriginalBatchQty.index();
    public static final int ORIGINALBATCHTIME = AttributesEnum.OriginalBatchTime.index();
    public static final int ORIGINALSAM = AttributesEnum.OriginalSam.index();
    public static final int WPSTYLESETUPEO = AttributesEnum.WpStyleSetupEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WpStyleWiseProcessSamEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.WpStyleWiseProcessSamEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for SamId, using the alias name SamId.
     * @return the SamId
     */
    public Number getSamId() {
        return (Number)getAttributeInternal(SAMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SamId.
     * @param value value to set the SamId
     */
    public void setSamId(Number value) {
        setAttributeInternal(SAMID, value);
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
     * Gets the attribute value for WpProcessId, using the alias name WpProcessId.
     * @return the WpProcessId
     */
    public Number getWpProcessId() {
        return (Number)getAttributeInternal(WPPROCESSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WpProcessId.
     * @param value value to set the WpProcessId
     */
    public void setWpProcessId(Number value) {
        setAttributeInternal(WPPROCESSID, value);
    }

    /**
     * Gets the attribute value for ProcessSeq, using the alias name ProcessSeq.
     * @return the ProcessSeq
     */
    public Number getProcessSeq() {
        return (Number)getAttributeInternal(PROCESSSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProcessSeq.
     * @param value value to set the ProcessSeq
     */
    public void setProcessSeq(Number value) {
        setAttributeInternal(PROCESSSEQ, value);
    }

    /**
     * Gets the attribute value for PlanDay, using the alias name PlanDay.
     * @return the PlanDay
     */
    public Number getPlanDay() {
        return (Number)getAttributeInternal(PLANDAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PlanDay.
     * @param value value to set the PlanDay
     */
    public void setPlanDay(Number value) {
        setAttributeInternal(PLANDAY, value);
    }

    /**
     * Gets the attribute value for BatchQty, using the alias name BatchQty.
     * @return the BatchQty
     */
    public Number getBatchQty() {
        return (Number)getAttributeInternal(BATCHQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BatchQty.
     * @param value value to set the BatchQty
     */
    public void setBatchQty(Number value) {
        setAttributeInternal(BATCHQTY, value);
    }

    /**
     * Gets the attribute value for BatchTime, using the alias name BatchTime.
     * @return the BatchTime
     */
    public Number getBatchTime() {
        return (Number)getAttributeInternal(BATCHTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for BatchTime.
     * @param value value to set the BatchTime
     */
    public void setBatchTime(Number value) {
        setAttributeInternal(BATCHTIME, value);
    }

    /**
     * Gets the attribute value for Sam, using the alias name Sam.
     * @return the Sam
     */
    public Number getSam() {
        return (Number)getAttributeInternal(SAM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Sam.
     * @param value value to set the Sam
     */
    public void setSam(Number value) {
        setAttributeInternal(SAM, value);
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
     * Gets the attribute value for OriginalBatchQty, using the alias name OriginalBatchQty.
     * @return the OriginalBatchQty
     */
    public Number getOriginalBatchQty() {
        return (Number)getAttributeInternal(ORIGINALBATCHQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for OriginalBatchQty.
     * @param value value to set the OriginalBatchQty
     */
    public void setOriginalBatchQty(Number value) {
        setAttributeInternal(ORIGINALBATCHQTY, value);
    }

    /**
     * Gets the attribute value for OriginalBatchTime, using the alias name OriginalBatchTime.
     * @return the OriginalBatchTime
     */
    public Number getOriginalBatchTime() {
        return (Number)getAttributeInternal(ORIGINALBATCHTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for OriginalBatchTime.
     * @param value value to set the OriginalBatchTime
     */
    public void setOriginalBatchTime(Number value) {
        setAttributeInternal(ORIGINALBATCHTIME, value);
    }

    /**
     * Gets the attribute value for OriginalSam, using the alias name OriginalSam.
     * @return the OriginalSam
     */
    public Number getOriginalSam() {
        return (Number)getAttributeInternal(ORIGINALSAM);
    }

    /**
     * Sets <code>value</code> as the attribute value for OriginalSam.
     * @param value value to set the OriginalSam
     */
    public void setOriginalSam(Number value) {
        setAttributeInternal(ORIGINALSAM, value);
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
     * @return the associated entity WpStyleSetupEOImpl.
     */
    public WpStyleSetupEOImpl getWpStyleSetupEO() {
        return (WpStyleSetupEOImpl)getAttributeInternal(WPSTYLESETUPEO);
    }

    /**
     * Sets <code>value</code> as the associated entity WpStyleSetupEOImpl.
     */
    public void setWpStyleSetupEO(WpStyleSetupEOImpl value) {
        setAttributeInternal(WPSTYLESETUPEO, value);
    }


    /**
     * @param samId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number samId) {
        return new Key(new Object[]{samId});
    }

    /**
     * @return the associated entity WpStyleSetupEOImpl.
     */
    public WpStyleSetupEOImpl getWpStyleSetupEO1() {
        return (WpStyleSetupEOImpl)getAttributeInternal(WPSTYLESETUPEO1);
    }

    /**
     * Sets <code>value</code> as the associated entity WpStyleSetupEOImpl.
     */
    public void setWpStyleSetupEO1(WpStyleSetupEOImpl value) {
        setAttributeInternal(WPSTYLESETUPEO1, value);
    }


    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
     protected void create(AttributeList attributeList) {
         
         Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String orgId = (String)sessionScope.get("orgId");
         
            super.create(attributeList);
     
             oracle.jbo.server.SequenceImpl s=
             new oracle.jbo.server.SequenceImpl("WP_STYLE_WISE_PROCESS_SAM_SEQ",  getDBTransaction());
            oracle.jbo.domain.Number sVal = s.getSequenceNumber();
             this.setSamId(sVal);
               
          

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
