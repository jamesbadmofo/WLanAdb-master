// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package com.wlanadb.data;

public final class ClientProto {
  private ClientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ClientOrBuilder
      extends com.google.protobuf.MessageLiteOrBuilder {
    
    // required string id = 1;
    boolean hasId();
    String getId();
    
    // optional string ip = 2;
    boolean hasIp();
    String getIp();
    
    // optional int32 port = 3;
    boolean hasPort();
    int getPort();
    
    // optional string name = 4;
    boolean hasName();
    String getName();
    
    // optional string model = 5;
    boolean hasModel();
    String getModel();
    
    // optional string firmware = 6;
    boolean hasFirmware();
    String getFirmware();
    
    // optional bool use_pin = 7;
    boolean hasUsePin();
    boolean getUsePin();
  }
  public static final class Client extends
      com.google.protobuf.GeneratedMessageLite
      implements ClientOrBuilder {
    // Use Client.newBuilder() to construct.
    private Client(Builder builder) {
      super(builder);
    }
    private Client(boolean noInit) {}
    
    private static final Client defaultInstance;
    public static Client getDefaultInstance() {
      return defaultInstance;
    }
    
    public Client getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    private int bitField0_;
    // required string id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          id_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string ip = 2;
    public static final int IP_FIELD_NUMBER = 2;
    private java.lang.Object ip_;
    public boolean hasIp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getIp() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          ip_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 port = 3;
    public static final int PORT_FIELD_NUMBER = 3;
    private int port_;
    public boolean hasPort() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getPort() {
      return port_;
    }
    
    // optional string name = 4;
    public static final int NAME_FIELD_NUMBER = 4;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string model = 5;
    public static final int MODEL_FIELD_NUMBER = 5;
    private java.lang.Object model_;
    public boolean hasModel() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getModel() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          model_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string firmware = 6;
    public static final int FIRMWARE_FIELD_NUMBER = 6;
    private java.lang.Object firmware_;
    public boolean hasFirmware() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getFirmware() {
      java.lang.Object ref = firmware_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          firmware_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getFirmwareBytes() {
      java.lang.Object ref = firmware_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        firmware_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional bool use_pin = 7;
    public static final int USE_PIN_FIELD_NUMBER = 7;
    private boolean usePin_;
    public boolean hasUsePin() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public boolean getUsePin() {
      return usePin_;
    }
    
    private void initFields() {
      id_ = "";
      ip_ = "";
      port_ = 0;
      name_ = "";
      model_ = "";
      firmware_ = "";
      usePin_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getIpBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, port_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getModelBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getFirmwareBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, usePin_);
      }
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getIpBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, port_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getModelBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getFirmwareBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, usePin_);
      }
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.wlanadb.data.ClientProto.Client parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.wlanadb.data.ClientProto.Client parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.wlanadb.data.ClientProto.Client parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.wlanadb.data.ClientProto.Client parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.wlanadb.data.ClientProto.Client parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.wlanadb.data.ClientProto.Client parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.wlanadb.data.ClientProto.Client parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.wlanadb.data.ClientProto.Client parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.wlanadb.data.ClientProto.Client parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.wlanadb.data.ClientProto.Client parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.wlanadb.data.ClientProto.Client prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.wlanadb.data.ClientProto.Client, Builder>
        implements com.wlanadb.data.ClientProto.ClientOrBuilder {
      // Construct using com.wlanadb.data.ClientProto.Client.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private void maybeForceBuilderInitialization() {
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        ip_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        port_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        model_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        firmware_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        usePin_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.wlanadb.data.ClientProto.Client getDefaultInstanceForType() {
        return com.wlanadb.data.ClientProto.Client.getDefaultInstance();
      }
      
      public com.wlanadb.data.ClientProto.Client build() {
        com.wlanadb.data.ClientProto.Client result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.wlanadb.data.ClientProto.Client buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.wlanadb.data.ClientProto.Client result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.wlanadb.data.ClientProto.Client buildPartial() {
        com.wlanadb.data.ClientProto.Client result = new com.wlanadb.data.ClientProto.Client(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.ip_ = ip_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.port_ = port_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.model_ = model_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.firmware_ = firmware_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.usePin_ = usePin_;
        result.bitField0_ = to_bitField0_;
        return result;
      }
      
      public Builder mergeFrom(com.wlanadb.data.ClientProto.Client other) {
        if (other == com.wlanadb.data.ClientProto.Client.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasIp()) {
          setIp(other.getIp());
        }
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasModel()) {
          setModel(other.getModel());
        }
        if (other.hasFirmware()) {
          setFirmware(other.getFirmware());
        }
        if (other.hasUsePin()) {
          setUsePin(other.getUsePin());
        }
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              
              return this;
            default: {
              if (!parseUnknownField(input, extensionRegistry, tag)) {
                
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              id_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              ip_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              port_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              name_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              model_ = input.readBytes();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              firmware_ = input.readBytes();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              usePin_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string id = 1;
      private java.lang.Object id_ = "";
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        
        return this;
      }
      void setId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        
      }
      
      // optional string ip = 2;
      private java.lang.Object ip_ = "";
      public boolean hasIp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getIp() {
        java.lang.Object ref = ip_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          ip_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setIp(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        ip_ = value;
        
        return this;
      }
      public Builder clearIp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ip_ = getDefaultInstance().getIp();
        
        return this;
      }
      void setIp(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        ip_ = value;
        
      }
      
      // optional int32 port = 3;
      private int port_ ;
      public boolean hasPort() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getPort() {
        return port_;
      }
      public Builder setPort(int value) {
        bitField0_ |= 0x00000004;
        port_ = value;
        
        return this;
      }
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000004);
        port_ = 0;
        
        return this;
      }
      
      // optional string name = 4;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        name_ = getDefaultInstance().getName();
        
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        name_ = value;
        
      }
      
      // optional string model = 5;
      private java.lang.Object model_ = "";
      public boolean hasModel() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getModel() {
        java.lang.Object ref = model_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          model_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setModel(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        model_ = value;
        
        return this;
      }
      public Builder clearModel() {
        bitField0_ = (bitField0_ & ~0x00000010);
        model_ = getDefaultInstance().getModel();
        
        return this;
      }
      void setModel(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        model_ = value;
        
      }
      
      // optional string firmware = 6;
      private java.lang.Object firmware_ = "";
      public boolean hasFirmware() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getFirmware() {
        java.lang.Object ref = firmware_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          firmware_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setFirmware(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        firmware_ = value;
        
        return this;
      }
      public Builder clearFirmware() {
        bitField0_ = (bitField0_ & ~0x00000020);
        firmware_ = getDefaultInstance().getFirmware();
        
        return this;
      }
      void setFirmware(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        firmware_ = value;
        
      }
      
      // optional bool use_pin = 7;
      private boolean usePin_ ;
      public boolean hasUsePin() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public boolean getUsePin() {
        return usePin_;
      }
      public Builder setUsePin(boolean value) {
        bitField0_ |= 0x00000040;
        usePin_ = value;
        
        return this;
      }
      public Builder clearUsePin() {
        bitField0_ = (bitField0_ & ~0x00000040);
        usePin_ = false;
        
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.wlanadb.data.Client)
    }
    
    static {
      defaultInstance = new Client(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.wlanadb.data.Client)
  }
  
  
  static {
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
