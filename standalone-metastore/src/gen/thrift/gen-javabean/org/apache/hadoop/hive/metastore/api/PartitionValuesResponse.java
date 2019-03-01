/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class PartitionValuesResponse implements org.apache.thrift.TBase<PartitionValuesResponse, PartitionValuesResponse._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionValuesResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionValuesResponse");

  private static final org.apache.thrift.protocol.TField PARTITION_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionValues", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionValuesResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionValuesResponseTupleSchemeFactory());
  }

  private List<PartitionValuesRow> partitionValues; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_VALUES((short)1, "partitionValues");

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
        case 1: // PARTITION_VALUES
          return PARTITION_VALUES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_VALUES, new org.apache.thrift.meta_data.FieldMetaData("partitionValues", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PartitionValuesRow.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionValuesResponse.class, metaDataMap);
  }

  public PartitionValuesResponse() {
  }

  public PartitionValuesResponse(
    List<PartitionValuesRow> partitionValues)
  {
    this();
    this.partitionValues = partitionValues;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionValuesResponse(PartitionValuesResponse other) {
    if (other.isSetPartitionValues()) {
      List<PartitionValuesRow> __this__partitionValues = new ArrayList<PartitionValuesRow>(other.partitionValues.size());
      for (PartitionValuesRow other_element : other.partitionValues) {
        __this__partitionValues.add(new PartitionValuesRow(other_element));
      }
      this.partitionValues = __this__partitionValues;
    }
  }

  public PartitionValuesResponse deepCopy() {
    return new PartitionValuesResponse(this);
  }

  @Override
  public void clear() {
    this.partitionValues = null;
  }

  public int getPartitionValuesSize() {
    return (this.partitionValues == null) ? 0 : this.partitionValues.size();
  }

  public java.util.Iterator<PartitionValuesRow> getPartitionValuesIterator() {
    return (this.partitionValues == null) ? null : this.partitionValues.iterator();
  }

  public void addToPartitionValues(PartitionValuesRow elem) {
    if (this.partitionValues == null) {
      this.partitionValues = new ArrayList<PartitionValuesRow>();
    }
    this.partitionValues.add(elem);
  }

  public List<PartitionValuesRow> getPartitionValues() {
    return this.partitionValues;
  }

  public void setPartitionValues(List<PartitionValuesRow> partitionValues) {
    this.partitionValues = partitionValues;
  }

  public void unsetPartitionValues() {
    this.partitionValues = null;
  }

  /** Returns true if field partitionValues is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionValues() {
    return this.partitionValues != null;
  }

  public void setPartitionValuesIsSet(boolean value) {
    if (!value) {
      this.partitionValues = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_VALUES:
      if (value == null) {
        unsetPartitionValues();
      } else {
        setPartitionValues((List<PartitionValuesRow>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_VALUES:
      return getPartitionValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_VALUES:
      return isSetPartitionValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionValuesResponse)
      return this.equals((PartitionValuesResponse)that);
    return false;
  }

  public boolean equals(PartitionValuesResponse that) {
    if (that == null)
      return false;

    boolean this_present_partitionValues = true && this.isSetPartitionValues();
    boolean that_present_partitionValues = true && that.isSetPartitionValues();
    if (this_present_partitionValues || that_present_partitionValues) {
      if (!(this_present_partitionValues && that_present_partitionValues))
        return false;
      if (!this.partitionValues.equals(that.partitionValues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_partitionValues = true && (isSetPartitionValues());
    list.add(present_partitionValues);
    if (present_partitionValues)
      list.add(partitionValues);

    return list.hashCode();
  }

  @Override
  public int compareTo(PartitionValuesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartitionValues()).compareTo(other.isSetPartitionValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionValues, other.partitionValues);
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
    StringBuilder sb = new StringBuilder("PartitionValuesResponse(");
    boolean first = true;

    sb.append("partitionValues:");
    if (this.partitionValues == null) {
      sb.append("null");
    } else {
      sb.append(this.partitionValues);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetPartitionValues()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partitionValues' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PartitionValuesResponseStandardSchemeFactory implements SchemeFactory {
    public PartitionValuesResponseStandardScheme getScheme() {
      return new PartitionValuesResponseStandardScheme();
    }
  }

  private static class PartitionValuesResponseStandardScheme extends StandardScheme<PartitionValuesResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionValuesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list538 = iprot.readListBegin();
                struct.partitionValues = new ArrayList<PartitionValuesRow>(_list538.size);
                PartitionValuesRow _elem539;
                for (int _i540 = 0; _i540 < _list538.size; ++_i540)
                {
                  _elem539 = new PartitionValuesRow();
                  _elem539.read(iprot);
                  struct.partitionValues.add(_elem539);
                }
                iprot.readListEnd();
              }
              struct.setPartitionValuesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionValuesResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partitionValues != null) {
        oprot.writeFieldBegin(PARTITION_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partitionValues.size()));
          for (PartitionValuesRow _iter541 : struct.partitionValues)
          {
            _iter541.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionValuesResponseTupleSchemeFactory implements SchemeFactory {
    public PartitionValuesResponseTupleScheme getScheme() {
      return new PartitionValuesResponseTupleScheme();
    }
  }

  private static class PartitionValuesResponseTupleScheme extends TupleScheme<PartitionValuesResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionValuesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.partitionValues.size());
        for (PartitionValuesRow _iter542 : struct.partitionValues)
        {
          _iter542.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionValuesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list543 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.partitionValues = new ArrayList<PartitionValuesRow>(_list543.size);
        PartitionValuesRow _elem544;
        for (int _i545 = 0; _i545 < _list543.size; ++_i545)
        {
          _elem544 = new PartitionValuesRow();
          _elem544.read(iprot);
          struct.partitionValues.add(_elem544);
        }
      }
      struct.setPartitionValuesIsSet(true);
    }
  }

}
