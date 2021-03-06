/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.bliss.framework.thriftgen.xgame.tcommon;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TClientInfo implements org.apache.thrift.TBase<TClientInfo, TClientInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TClientInfo");

  private static final org.apache.thrift.protocol.TField USERID_FIELD_DESC = new org.apache.thrift.protocol.TField("userid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField IS_VN_FIELD_DESC = new org.apache.thrift.protocol.TField("isVN", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField OS_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("osType", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TClientInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TClientInfoTupleSchemeFactory());
  }

  public int userid; // required
  public int version; // required
  public boolean isVN; // required
  public int osType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USERID((short)1, "userid"),
    VERSION((short)2, "version"),
    IS_VN((short)3, "isVN"),
    OS_TYPE((short)4, "osType");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USERID
          return USERID;
        case 2: // VERSION
          return VERSION;
        case 3: // IS_VN
          return IS_VN;
        case 4: // OS_TYPE
          return OS_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USERID_ISSET_ID = 0;
  private static final int __VERSION_ISSET_ID = 1;
  private static final int __ISVN_ISSET_ID = 2;
  private static final int __OSTYPE_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USERID, new org.apache.thrift.meta_data.FieldMetaData("userid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_VN, new org.apache.thrift.meta_data.FieldMetaData("isVN", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.OS_TYPE, new org.apache.thrift.meta_data.FieldMetaData("osType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TClientInfo.class, metaDataMap);
  }

  public TClientInfo() {
  }

  public TClientInfo(
    int userid,
    int version,
    boolean isVN,
    int osType)
  {
    this();
    this.userid = userid;
    setUseridIsSet(true);
    this.version = version;
    setVersionIsSet(true);
    this.isVN = isVN;
    setIsVNIsSet(true);
    this.osType = osType;
    setOsTypeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TClientInfo(TClientInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.userid = other.userid;
    this.version = other.version;
    this.isVN = other.isVN;
    this.osType = other.osType;
  }

  public TClientInfo deepCopy() {
    return new TClientInfo(this);
  }

  @Override
  public void clear() {
    setUseridIsSet(false);
    this.userid = 0;
    setVersionIsSet(false);
    this.version = 0;
    setIsVNIsSet(false);
    this.isVN = false;
    setOsTypeIsSet(false);
    this.osType = 0;
  }

  public int getUserid() {
    return this.userid;
  }

  public TClientInfo setUserid(int userid) {
    this.userid = userid;
    setUseridIsSet(true);
    return this;
  }

  public void unsetUserid() {
    __isset_bit_vector.clear(__USERID_ISSET_ID);
  }

  /** Returns true if field userid is set (has been assigned a value) and false otherwise */
  public boolean isSetUserid() {
    return __isset_bit_vector.get(__USERID_ISSET_ID);
  }

  public void setUseridIsSet(boolean value) {
    __isset_bit_vector.set(__USERID_ISSET_ID, value);
  }

  public int getVersion() {
    return this.version;
  }

  public TClientInfo setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bit_vector.clear(__VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return __isset_bit_vector.get(__VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bit_vector.set(__VERSION_ISSET_ID, value);
  }

  public boolean isIsVN() {
    return this.isVN;
  }

  public TClientInfo setIsVN(boolean isVN) {
    this.isVN = isVN;
    setIsVNIsSet(true);
    return this;
  }

  public void unsetIsVN() {
    __isset_bit_vector.clear(__ISVN_ISSET_ID);
  }

  /** Returns true if field isVN is set (has been assigned a value) and false otherwise */
  public boolean isSetIsVN() {
    return __isset_bit_vector.get(__ISVN_ISSET_ID);
  }

  public void setIsVNIsSet(boolean value) {
    __isset_bit_vector.set(__ISVN_ISSET_ID, value);
  }

  public int getOsType() {
    return this.osType;
  }

  public TClientInfo setOsType(int osType) {
    this.osType = osType;
    setOsTypeIsSet(true);
    return this;
  }

  public void unsetOsType() {
    __isset_bit_vector.clear(__OSTYPE_ISSET_ID);
  }

  /** Returns true if field osType is set (has been assigned a value) and false otherwise */
  public boolean isSetOsType() {
    return __isset_bit_vector.get(__OSTYPE_ISSET_ID);
  }

  public void setOsTypeIsSet(boolean value) {
    __isset_bit_vector.set(__OSTYPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USERID:
      if (value == null) {
        unsetUserid();
      } else {
        setUserid((Integer)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case IS_VN:
      if (value == null) {
        unsetIsVN();
      } else {
        setIsVN((Boolean)value);
      }
      break;

    case OS_TYPE:
      if (value == null) {
        unsetOsType();
      } else {
        setOsType((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USERID:
      return Integer.valueOf(getUserid());

    case VERSION:
      return Integer.valueOf(getVersion());

    case IS_VN:
      return Boolean.valueOf(isIsVN());

    case OS_TYPE:
      return Integer.valueOf(getOsType());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USERID:
      return isSetUserid();
    case VERSION:
      return isSetVersion();
    case IS_VN:
      return isSetIsVN();
    case OS_TYPE:
      return isSetOsType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TClientInfo)
      return this.equals((TClientInfo)that);
    return false;
  }

  public boolean equals(TClientInfo that) {
    if (that == null)
      return false;

    boolean this_present_userid = true;
    boolean that_present_userid = true;
    if (this_present_userid || that_present_userid) {
      if (!(this_present_userid && that_present_userid))
        return false;
      if (this.userid != that.userid)
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_isVN = true;
    boolean that_present_isVN = true;
    if (this_present_isVN || that_present_isVN) {
      if (!(this_present_isVN && that_present_isVN))
        return false;
      if (this.isVN != that.isVN)
        return false;
    }

    boolean this_present_osType = true;
    boolean that_present_osType = true;
    if (this_present_osType || that_present_osType) {
      if (!(this_present_osType && that_present_osType))
        return false;
      if (this.osType != that.osType)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TClientInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TClientInfo typedOther = (TClientInfo)other;

    lastComparison = Boolean.valueOf(isSetUserid()).compareTo(typedOther.isSetUserid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userid, typedOther.userid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsVN()).compareTo(typedOther.isSetIsVN());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsVN()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isVN, typedOther.isVN);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOsType()).compareTo(typedOther.isSetOsType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOsType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.osType, typedOther.osType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TClientInfo(");
    boolean first = true;

    sb.append("userid:");
    sb.append(this.userid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isVN:");
    sb.append(this.isVN);
    first = false;
    if (!first) sb.append(", ");
    sb.append("osType:");
    sb.append(this.osType);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TClientInfoStandardSchemeFactory implements SchemeFactory {
    public TClientInfoStandardScheme getScheme() {
      return new TClientInfoStandardScheme();
    }
  }

  private static class TClientInfoStandardScheme extends StandardScheme<TClientInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TClientInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USERID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.userid = iprot.readI32();
              struct.setUseridIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = iprot.readI32();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_VN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isVN = iprot.readBool();
              struct.setIsVNIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OS_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.osType = iprot.readI32();
              struct.setOsTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TClientInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USERID_FIELD_DESC);
      oprot.writeI32(struct.userid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_VN_FIELD_DESC);
      oprot.writeBool(struct.isVN);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(OS_TYPE_FIELD_DESC);
      oprot.writeI32(struct.osType);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TClientInfoTupleSchemeFactory implements SchemeFactory {
    public TClientInfoTupleScheme getScheme() {
      return new TClientInfoTupleScheme();
    }
  }

  private static class TClientInfoTupleScheme extends TupleScheme<TClientInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TClientInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserid()) {
        optionals.set(0);
      }
      if (struct.isSetVersion()) {
        optionals.set(1);
      }
      if (struct.isSetIsVN()) {
        optionals.set(2);
      }
      if (struct.isSetOsType()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUserid()) {
        oprot.writeI32(struct.userid);
      }
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
      if (struct.isSetIsVN()) {
        oprot.writeBool(struct.isVN);
      }
      if (struct.isSetOsType()) {
        oprot.writeI32(struct.osType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TClientInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.userid = iprot.readI32();
        struct.setUseridIsSet(true);
      }
      if (incoming.get(1)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.isVN = iprot.readBool();
        struct.setIsVNIsSet(true);
      }
      if (incoming.get(3)) {
        struct.osType = iprot.readI32();
        struct.setOsTypeIsSet(true);
      }
    }
  }

}

