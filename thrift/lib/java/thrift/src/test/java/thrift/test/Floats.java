/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class Floats implements TBase, java.io.Serializable, Cloneable, Comparable<Floats> {
  private static final TStruct STRUCT_DESC = new TStruct("Floats");
  private static final TField NAN_FIELD_DESC = new TField("nan", TType.FLOAT, (short)1);
  private static final TField INF_FIELD_DESC = new TField("inf", TType.FLOAT, (short)2);
  private static final TField NEGINF_FIELD_DESC = new TField("neginf", TType.FLOAT, (short)3);
  private static final TField REPEATING_FIELD_DESC = new TField("repeating", TType.FLOAT, (short)4);
  private static final TField BIG_FIELD_DESC = new TField("big", TType.FLOAT, (short)5);
  private static final TField SMALL_FIELD_DESC = new TField("small", TType.FLOAT, (short)6);
  private static final TField ZERO_FIELD_DESC = new TField("zero", TType.FLOAT, (short)7);
  private static final TField NEGZERO_FIELD_DESC = new TField("negzero", TType.FLOAT, (short)8);

  public float nan;
  public float inf;
  public float neginf;
  public float repeating;
  public float big;
  public float small;
  public float zero;
  public float negzero;
  public static final int NAN = 1;
  public static final int INF = 2;
  public static final int NEGINF = 3;
  public static final int REPEATING = 4;
  public static final int BIG = 5;
  public static final int SMALL = 6;
  public static final int ZERO = 7;
  public static final int NEGZERO = 8;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __NAN_ISSET_ID = 0;
  private static final int __INF_ISSET_ID = 1;
  private static final int __NEGINF_ISSET_ID = 2;
  private static final int __REPEATING_ISSET_ID = 3;
  private static final int __BIG_ISSET_ID = 4;
  private static final int __SMALL_ISSET_ID = 5;
  private static final int __ZERO_ISSET_ID = 6;
  private static final int __NEGZERO_ISSET_ID = 7;
  private BitSet __isset_bit_vector = new BitSet(8);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(NAN, new FieldMetaData("nan", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.FLOAT)));
    tmpMetaDataMap.put(INF, new FieldMetaData("inf", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.FLOAT)));
    tmpMetaDataMap.put(NEGINF, new FieldMetaData("neginf", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.FLOAT)));
    tmpMetaDataMap.put(REPEATING, new FieldMetaData("repeating", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.FLOAT)));
    tmpMetaDataMap.put(BIG, new FieldMetaData("big", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.FLOAT)));
    tmpMetaDataMap.put(SMALL, new FieldMetaData("small", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.FLOAT)));
    tmpMetaDataMap.put(ZERO, new FieldMetaData("zero", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.FLOAT)));
    tmpMetaDataMap.put(NEGZERO, new FieldMetaData("negzero", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.FLOAT)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Floats.class, metaDataMap);
  }

  public Floats() {
  }

  public Floats(
    float nan,
    float inf,
    float neginf,
    float repeating,
    float big,
    float small,
    float zero,
    float negzero)
  {
    this();
    this.nan = nan;
    setNanIsSet(true);
    this.inf = inf;
    setInfIsSet(true);
    this.neginf = neginf;
    setNeginfIsSet(true);
    this.repeating = repeating;
    setRepeatingIsSet(true);
    this.big = big;
    setBigIsSet(true);
    this.small = small;
    setSmallIsSet(true);
    this.zero = zero;
    setZeroIsSet(true);
    this.negzero = negzero;
    setNegzeroIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Floats(Floats other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.nan = TBaseHelper.deepCopy(other.nan);
    this.inf = TBaseHelper.deepCopy(other.inf);
    this.neginf = TBaseHelper.deepCopy(other.neginf);
    this.repeating = TBaseHelper.deepCopy(other.repeating);
    this.big = TBaseHelper.deepCopy(other.big);
    this.small = TBaseHelper.deepCopy(other.small);
    this.zero = TBaseHelper.deepCopy(other.zero);
    this.negzero = TBaseHelper.deepCopy(other.negzero);
  }

  public Floats deepCopy() {
    return new Floats(this);
  }

  @Deprecated
  public Floats clone() {
    return new Floats(this);
  }

  public float  getNan() {
    return this.nan;
  }

  public Floats setNan(float nan) {
    this.nan = nan;
    setNanIsSet(true);
    return this;
  }

  public void unsetNan() {
    __isset_bit_vector.clear(__NAN_ISSET_ID);
  }

  // Returns true if field nan is set (has been assigned a value) and false otherwise
  public boolean isSetNan() {
    return __isset_bit_vector.get(__NAN_ISSET_ID);
  }

  public void setNanIsSet(boolean value) {
    __isset_bit_vector.set(__NAN_ISSET_ID, value);
  }

  public float  getInf() {
    return this.inf;
  }

  public Floats setInf(float inf) {
    this.inf = inf;
    setInfIsSet(true);
    return this;
  }

  public void unsetInf() {
    __isset_bit_vector.clear(__INF_ISSET_ID);
  }

  // Returns true if field inf is set (has been assigned a value) and false otherwise
  public boolean isSetInf() {
    return __isset_bit_vector.get(__INF_ISSET_ID);
  }

  public void setInfIsSet(boolean value) {
    __isset_bit_vector.set(__INF_ISSET_ID, value);
  }

  public float  getNeginf() {
    return this.neginf;
  }

  public Floats setNeginf(float neginf) {
    this.neginf = neginf;
    setNeginfIsSet(true);
    return this;
  }

  public void unsetNeginf() {
    __isset_bit_vector.clear(__NEGINF_ISSET_ID);
  }

  // Returns true if field neginf is set (has been assigned a value) and false otherwise
  public boolean isSetNeginf() {
    return __isset_bit_vector.get(__NEGINF_ISSET_ID);
  }

  public void setNeginfIsSet(boolean value) {
    __isset_bit_vector.set(__NEGINF_ISSET_ID, value);
  }

  public float  getRepeating() {
    return this.repeating;
  }

  public Floats setRepeating(float repeating) {
    this.repeating = repeating;
    setRepeatingIsSet(true);
    return this;
  }

  public void unsetRepeating() {
    __isset_bit_vector.clear(__REPEATING_ISSET_ID);
  }

  // Returns true if field repeating is set (has been assigned a value) and false otherwise
  public boolean isSetRepeating() {
    return __isset_bit_vector.get(__REPEATING_ISSET_ID);
  }

  public void setRepeatingIsSet(boolean value) {
    __isset_bit_vector.set(__REPEATING_ISSET_ID, value);
  }

  public float  getBig() {
    return this.big;
  }

  public Floats setBig(float big) {
    this.big = big;
    setBigIsSet(true);
    return this;
  }

  public void unsetBig() {
    __isset_bit_vector.clear(__BIG_ISSET_ID);
  }

  // Returns true if field big is set (has been assigned a value) and false otherwise
  public boolean isSetBig() {
    return __isset_bit_vector.get(__BIG_ISSET_ID);
  }

  public void setBigIsSet(boolean value) {
    __isset_bit_vector.set(__BIG_ISSET_ID, value);
  }

  public float  getSmall() {
    return this.small;
  }

  public Floats setSmall(float small) {
    this.small = small;
    setSmallIsSet(true);
    return this;
  }

  public void unsetSmall() {
    __isset_bit_vector.clear(__SMALL_ISSET_ID);
  }

  // Returns true if field small is set (has been assigned a value) and false otherwise
  public boolean isSetSmall() {
    return __isset_bit_vector.get(__SMALL_ISSET_ID);
  }

  public void setSmallIsSet(boolean value) {
    __isset_bit_vector.set(__SMALL_ISSET_ID, value);
  }

  public float  getZero() {
    return this.zero;
  }

  public Floats setZero(float zero) {
    this.zero = zero;
    setZeroIsSet(true);
    return this;
  }

  public void unsetZero() {
    __isset_bit_vector.clear(__ZERO_ISSET_ID);
  }

  // Returns true if field zero is set (has been assigned a value) and false otherwise
  public boolean isSetZero() {
    return __isset_bit_vector.get(__ZERO_ISSET_ID);
  }

  public void setZeroIsSet(boolean value) {
    __isset_bit_vector.set(__ZERO_ISSET_ID, value);
  }

  public float  getNegzero() {
    return this.negzero;
  }

  public Floats setNegzero(float negzero) {
    this.negzero = negzero;
    setNegzeroIsSet(true);
    return this;
  }

  public void unsetNegzero() {
    __isset_bit_vector.clear(__NEGZERO_ISSET_ID);
  }

  // Returns true if field negzero is set (has been assigned a value) and false otherwise
  public boolean isSetNegzero() {
    return __isset_bit_vector.get(__NEGZERO_ISSET_ID);
  }

  public void setNegzeroIsSet(boolean value) {
    __isset_bit_vector.set(__NEGZERO_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case NAN:
      if (value == null) {
        unsetNan();
      } else {
        setNan((Float)value);
      }
      break;

    case INF:
      if (value == null) {
        unsetInf();
      } else {
        setInf((Float)value);
      }
      break;

    case NEGINF:
      if (value == null) {
        unsetNeginf();
      } else {
        setNeginf((Float)value);
      }
      break;

    case REPEATING:
      if (value == null) {
        unsetRepeating();
      } else {
        setRepeating((Float)value);
      }
      break;

    case BIG:
      if (value == null) {
        unsetBig();
      } else {
        setBig((Float)value);
      }
      break;

    case SMALL:
      if (value == null) {
        unsetSmall();
      } else {
        setSmall((Float)value);
      }
      break;

    case ZERO:
      if (value == null) {
        unsetZero();
      } else {
        setZero((Float)value);
      }
      break;

    case NEGZERO:
      if (value == null) {
        unsetNegzero();
      } else {
        setNegzero((Float)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case NAN:
      return new Float(getNan());

    case INF:
      return new Float(getInf());

    case NEGINF:
      return new Float(getNeginf());

    case REPEATING:
      return new Float(getRepeating());

    case BIG:
      return new Float(getBig());

    case SMALL:
      return new Float(getSmall());

    case ZERO:
      return new Float(getZero());

    case NEGZERO:
      return new Float(getNegzero());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case NAN:
      return isSetNan();
    case INF:
      return isSetInf();
    case NEGINF:
      return isSetNeginf();
    case REPEATING:
      return isSetRepeating();
    case BIG:
      return isSetBig();
    case SMALL:
      return isSetSmall();
    case ZERO:
      return isSetZero();
    case NEGZERO:
      return isSetNegzero();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Floats)
      return this.equals((Floats)that);
    return false;
  }

  public boolean equals(Floats that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nan = true;
    boolean that_present_nan = true;
    if (this_present_nan || that_present_nan) {
      if (!(this_present_nan && that_present_nan))
        return false;
      if (!TBaseHelper.equalsNobinary(this.nan, that.nan))
        return false;
    }

    boolean this_present_inf = true;
    boolean that_present_inf = true;
    if (this_present_inf || that_present_inf) {
      if (!(this_present_inf && that_present_inf))
        return false;
      if (!TBaseHelper.equalsNobinary(this.inf, that.inf))
        return false;
    }

    boolean this_present_neginf = true;
    boolean that_present_neginf = true;
    if (this_present_neginf || that_present_neginf) {
      if (!(this_present_neginf && that_present_neginf))
        return false;
      if (!TBaseHelper.equalsNobinary(this.neginf, that.neginf))
        return false;
    }

    boolean this_present_repeating = true;
    boolean that_present_repeating = true;
    if (this_present_repeating || that_present_repeating) {
      if (!(this_present_repeating && that_present_repeating))
        return false;
      if (!TBaseHelper.equalsNobinary(this.repeating, that.repeating))
        return false;
    }

    boolean this_present_big = true;
    boolean that_present_big = true;
    if (this_present_big || that_present_big) {
      if (!(this_present_big && that_present_big))
        return false;
      if (!TBaseHelper.equalsNobinary(this.big, that.big))
        return false;
    }

    boolean this_present_small = true;
    boolean that_present_small = true;
    if (this_present_small || that_present_small) {
      if (!(this_present_small && that_present_small))
        return false;
      if (!TBaseHelper.equalsNobinary(this.small, that.small))
        return false;
    }

    boolean this_present_zero = true;
    boolean that_present_zero = true;
    if (this_present_zero || that_present_zero) {
      if (!(this_present_zero && that_present_zero))
        return false;
      if (!TBaseHelper.equalsNobinary(this.zero, that.zero))
        return false;
    }

    boolean this_present_negzero = true;
    boolean that_present_negzero = true;
    if (this_present_negzero || that_present_negzero) {
      if (!(this_present_negzero && that_present_negzero))
        return false;
      if (!TBaseHelper.equalsNobinary(this.negzero, that.negzero))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Floats other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNan()).compareTo(other.isSetNan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(nan, other.nan);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetInf()).compareTo(other.isSetInf());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(inf, other.inf);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetNeginf()).compareTo(other.isSetNeginf());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(neginf, other.neginf);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRepeating()).compareTo(other.isSetRepeating());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(repeating, other.repeating);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetBig()).compareTo(other.isSetBig());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(big, other.big);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSmall()).compareTo(other.isSetSmall());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(small, other.small);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetZero()).compareTo(other.isSetZero());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(zero, other.zero);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetNegzero()).compareTo(other.isSetNegzero());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(negzero, other.negzero);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case NAN:
          if (field.type == TType.FLOAT) {
            this.nan = iprot.readFloat();
            setNanIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INF:
          if (field.type == TType.FLOAT) {
            this.inf = iprot.readFloat();
            setInfIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NEGINF:
          if (field.type == TType.FLOAT) {
            this.neginf = iprot.readFloat();
            setNeginfIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REPEATING:
          if (field.type == TType.FLOAT) {
            this.repeating = iprot.readFloat();
            setRepeatingIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case BIG:
          if (field.type == TType.FLOAT) {
            this.big = iprot.readFloat();
            setBigIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SMALL:
          if (field.type == TType.FLOAT) {
            this.small = iprot.readFloat();
            setSmallIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ZERO:
          if (field.type == TType.FLOAT) {
            this.zero = iprot.readFloat();
            setZeroIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NEGZERO:
          if (field.type == TType.FLOAT) {
            this.negzero = iprot.readFloat();
            setNegzeroIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(NAN_FIELD_DESC);
    oprot.writeFloat(this.nan);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(INF_FIELD_DESC);
    oprot.writeFloat(this.inf);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(NEGINF_FIELD_DESC);
    oprot.writeFloat(this.neginf);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(REPEATING_FIELD_DESC);
    oprot.writeFloat(this.repeating);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(BIG_FIELD_DESC);
    oprot.writeFloat(this.big);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SMALL_FIELD_DESC);
    oprot.writeFloat(this.small);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ZERO_FIELD_DESC);
    oprot.writeFloat(this.zero);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(NEGZERO_FIELD_DESC);
    oprot.writeFloat(this.negzero);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("Floats");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("nan");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getNan(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("inf");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getInf(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("neginf");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getNeginf(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("repeating");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getRepeating(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("big");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getBig(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("small");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSmall(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("zero");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getZero(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("negzero");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getNegzero(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

