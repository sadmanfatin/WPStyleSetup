package model.view;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 04 22:07:06 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PocStylesVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SystemId {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getSystemId();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setSystemId((Number)value);
            }
        }
        ,
        LcUnit {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getLcUnit();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setLcUnit((Number)value);
            }
        }
        ,
        LcUnitName {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getLcUnitName();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setLcUnitName((String)value);
            }
        }
        ,
        ProductionUnit {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getProductionUnit();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setProductionUnit((Number)value);
            }
        }
        ,
        ProductionUnitName {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getProductionUnitName();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setProductionUnitName((String)value);
            }
        }
        ,
        BuyerId {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getBuyerId();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        BuyerName {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getBuyerName();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setBuyerName((String)value);
            }
        }
        ,
        Season {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getSeason();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        Style {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getStyle();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        Color {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getColor();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        WashName {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getWashName();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setWashName((String)value);
            }
        }
        ,
        OrderQty {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getOrderQty();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setOrderQty((Number)value);
            }
        }
        ,
        SamVersion {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getSamVersion();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setSamVersion((Number)value);
            }
        }
        ,
        ItemDescription {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getItemDescription();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setItemDescription((String)value);
            }
        }
        ,
        Fabrication {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getFabrication();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setFabrication((String)value);
            }
        }
        ,
        CheckBox {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getCheckBox();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setCheckBox((String)value);
            }
        }
        ,
        BuyerLOV1 {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getBuyerLOV1();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        SeasonLOV1 {
            public Object get(PocStylesVORowImpl obj) {
                return obj.getSeasonLOV1();
            }

            public void put(PocStylesVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PocStylesVORowImpl object);

        public abstract void put(PocStylesVORowImpl object, Object value);

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
    public static final int LCUNIT = AttributesEnum.LcUnit.index();
    public static final int LCUNITNAME = AttributesEnum.LcUnitName.index();
    public static final int PRODUCTIONUNIT = AttributesEnum.ProductionUnit.index();
    public static final int PRODUCTIONUNITNAME = AttributesEnum.ProductionUnitName.index();
    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int BUYERNAME = AttributesEnum.BuyerName.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int WASHNAME = AttributesEnum.WashName.index();
    public static final int ORDERQTY = AttributesEnum.OrderQty.index();
    public static final int SAMVERSION = AttributesEnum.SamVersion.index();
    public static final int ITEMDESCRIPTION = AttributesEnum.ItemDescription.index();
    public static final int FABRICATION = AttributesEnum.Fabrication.index();
    public static final int CHECKBOX = AttributesEnum.CheckBox.index();
    public static final int BUYERLOV1 = AttributesEnum.BuyerLOV1.index();
    public static final int SEASONLOV1 = AttributesEnum.SeasonLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PocStylesVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute SystemId.
     * @return the SystemId
     */
    public Number getSystemId() {
        return (Number) getAttributeInternal(SYSTEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SystemId.
     * @param value value to set the  SystemId
     */
    public void setSystemId(Number value) {
        setAttributeInternal(SYSTEMID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LcUnit.
     * @return the LcUnit
     */
    public Number getLcUnit() {
        return (Number) getAttributeInternal(LCUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LcUnit.
     * @param value value to set the  LcUnit
     */
    public void setLcUnit(Number value) {
        setAttributeInternal(LCUNIT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LcUnitName.
     * @return the LcUnitName
     */
    public String getLcUnitName() {
        return (String) getAttributeInternal(LCUNITNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LcUnitName.
     * @param value value to set the  LcUnitName
     */
    public void setLcUnitName(String value) {
        setAttributeInternal(LCUNITNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductionUnit.
     * @return the ProductionUnit
     */
    public Number getProductionUnit() {
        return (Number) getAttributeInternal(PRODUCTIONUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductionUnit.
     * @param value value to set the  ProductionUnit
     */
    public void setProductionUnit(Number value) {
        setAttributeInternal(PRODUCTIONUNIT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductionUnitName.
     * @return the ProductionUnitName
     */
    public String getProductionUnitName() {
        return (String) getAttributeInternal(PRODUCTIONUNITNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductionUnitName.
     * @param value value to set the  ProductionUnitName
     */
    public void setProductionUnitName(String value) {
        setAttributeInternal(PRODUCTIONUNITNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuyerId.
     * @return the BuyerId
     */
    public Number getBuyerId() {
        return (Number) getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuyerId.
     * @param value value to set the  BuyerId
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuyerName.
     * @return the BuyerName
     */
    public String getBuyerName() {
        return (String) getAttributeInternal(BUYERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuyerName.
     * @param value value to set the  BuyerName
     */
    public void setBuyerName(String value) {
        setAttributeInternal(BUYERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Season.
     * @return the Season
     */
    public String getSeason() {
        return (String) getAttributeInternal(SEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Season.
     * @param value value to set the  Season
     */
    public void setSeason(String value) {
        setAttributeInternal(SEASON, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Style.
     * @return the Style
     */
    public String getStyle() {
        return (String) getAttributeInternal(STYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Style.
     * @param value value to set the  Style
     */
    public void setStyle(String value) {
        setAttributeInternal(STYLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Color.
     * @return the Color
     */
    public String getColor() {
        return (String) getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Color.
     * @param value value to set the  Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WashName.
     * @return the WashName
     */
    public String getWashName() {
        return (String) getAttributeInternal(WASHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WashName.
     * @param value value to set the  WashName
     */
    public void setWashName(String value) {
        setAttributeInternal(WASHNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderQty.
     * @return the OrderQty
     */
    public Number getOrderQty() {
        return (Number) getAttributeInternal(ORDERQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderQty.
     * @param value value to set the  OrderQty
     */
    public void setOrderQty(Number value) {
        setAttributeInternal(ORDERQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SamVersion.
     * @return the SamVersion
     */
    public Number getSamVersion() {
        return (Number) getAttributeInternal(SAMVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SamVersion.
     * @param value value to set the  SamVersion
     */
    public void setSamVersion(Number value) {
        setAttributeInternal(SAMVERSION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItemDescription.
     * @return the ItemDescription
     */
    public String getItemDescription() {
        return (String) getAttributeInternal(ITEMDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItemDescription.
     * @param value value to set the  ItemDescription
     */
    public void setItemDescription(String value) {
        setAttributeInternal(ITEMDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Fabrication.
     * @return the Fabrication
     */
    public String getFabrication() {
        return (String) getAttributeInternal(FABRICATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Fabrication.
     * @param value value to set the  Fabrication
     */
    public void setFabrication(String value) {
        setAttributeInternal(FABRICATION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SelectProcess.
     * @return the SelectProcess
     */
    public String getCheckBox() {
        return (String) getAttributeInternal(CHECKBOX);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SelectProcess.
     * @param value value to set the  SelectProcess
     */
    public void setCheckBox(String value) {
        setAttributeInternal(CHECKBOX, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> BuyerLOV1.
     */
    public RowSet getBuyerLOV1() {
        return (RowSet)getAttributeInternal(BUYERLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> SeasonLOV1.
     */
    public RowSet getSeasonLOV1() {
        return (RowSet)getAttributeInternal(SEASONLOV1);
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
}
