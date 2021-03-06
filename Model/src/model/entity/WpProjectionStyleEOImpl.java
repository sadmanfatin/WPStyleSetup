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
// ---    Sat Sep 25 11:22:32 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WpProjectionStyleEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SystemId {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getSystemId();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setSystemId((Number)value);
            }
        }
        ,
        BuyerId {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getBuyerId();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        Style {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getStyle();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        Season {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getSeason();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        Color {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getColor();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        Wash {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getWash();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setWash((String)value);
            }
        }
        ,
        OrgId {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        OrderedQty {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getOrderedQty();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setOrderedQty((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LcUnit {
            public Object get(WpProjectionStyleEOImpl obj) {
                return obj.getLcUnit();
            }

            public void put(WpProjectionStyleEOImpl obj, Object value) {
                obj.setLcUnit((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WpProjectionStyleEOImpl object);

        public abstract void put(WpProjectionStyleEOImpl object, Object value);

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


    public static final int SYSTEMID = AttributesEnum.SystemId.index();
    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int WASH = AttributesEnum.Wash.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int ORDEREDQTY = AttributesEnum.OrderedQty.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LCUNIT = AttributesEnum.LcUnit.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WpProjectionStyleEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.WpProjectionStyleEO");
        }
        return mDefinitionObject;
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
     * Gets the attribute value for BuyerId, using the alias name BuyerId.
     * @return the BuyerId
     */
    public Number getBuyerId() {
        return (Number)getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuyerId.
     * @param value value to set the BuyerId
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
    }

    /**
     * Gets the attribute value for Style, using the alias name Style.
     * @return the Style
     */
    public String getStyle() {
        return (String)getAttributeInternal(STYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Style.
     * @param value value to set the Style
     */
    public void setStyle(String value) {
        setAttributeInternal(STYLE, value);
    }

    /**
     * Gets the attribute value for Season, using the alias name Season.
     * @return the Season
     */
    public String getSeason() {
        return (String)getAttributeInternal(SEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for Season.
     * @param value value to set the Season
     */
    public void setSeason(String value) {
        setAttributeInternal(SEASON, value);
    }

    /**
     * Gets the attribute value for Color, using the alias name Color.
     * @return the Color
     */
    public String getColor() {
        return (String)getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Color.
     * @param value value to set the Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for Wash, using the alias name Wash.
     * @return the Wash
     */
    public String getWash() {
        return (String)getAttributeInternal(WASH);
    }

    /**
     * Sets <code>value</code> as the attribute value for Wash.
     * @param value value to set the Wash
     */
    public void setWash(String value) {
        setAttributeInternal(WASH, value);
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
     * Gets the attribute value for OrderedQty, using the alias name OrderedQty.
     * @return the OrderedQty
     */
    public Number getOrderedQty() {
        return (Number)getAttributeInternal(ORDEREDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderedQty.
     * @param value value to set the OrderedQty
     */
    public void setOrderedQty(Number value) {
        setAttributeInternal(ORDEREDQTY, value);
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
     * Gets the attribute value for LcUnit, using the alias name LcUnit.
     * @return the LcUnit
     */
    public Number getLcUnit() {
        return (Number)getAttributeInternal(LCUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcUnit.
     * @param value value to set the LcUnit
     */
    public void setLcUnit(Number value) {
        setAttributeInternal(LCUNIT, value);
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
     * @param systemId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number systemId) {
        return new Key(new Object[]{systemId});
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
             new oracle.jbo.server.SequenceImpl("WP_PROJETION_STYLE_SEQ",  getDBTransaction());
            oracle.jbo.domain.Number sVal = s.getSequenceNumber();
             this.setSystemId(sVal );


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
