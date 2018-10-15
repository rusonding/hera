// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: socket_message.proto

package com.dfire.protocol;

public final class RpcSocketMessage {
  private RpcSocketMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SocketMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SocketMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .SocketMessage.Kind kind = 1;</code>
     */
    boolean hasKind();
    /**
     * <code>required .SocketMessage.Kind kind = 1;</code>
     */
    com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind getKind();

    /**
     * <pre>
     *消息体数据，字节码存储
     * </pre>
     *
     * <code>required bytes body = 2;</code>
     */
    boolean hasBody();
    /**
     * <pre>
     *消息体数据，字节码存储
     * </pre>
     *
     * <code>required bytes body = 2;</code>
     */
    com.google.protobuf.ByteString getBody();
  }
  /**
   * <pre>
   *netty rpc通信消息体
   * </pre>
   *
   * Protobuf type {@code SocketMessage}
   */
  public  static final class SocketMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SocketMessage)
      SocketMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SocketMessage.newBuilder() to construct.
    private SocketMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SocketMessage() {
      kind_ = 0;
      body_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SocketMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind value = com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                kind_ = rawValue;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              body_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dfire.protocol.RpcSocketMessage.internal_static_SocketMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dfire.protocol.RpcSocketMessage.internal_static_SocketMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dfire.protocol.RpcSocketMessage.SocketMessage.class, com.dfire.protocol.RpcSocketMessage.SocketMessage.Builder.class);
    }

    /**
     * <pre>
     *rpc通信消息类型
     * </pre>
     *
     * Protobuf enum {@code SocketMessage.Kind}
     */
    public enum Kind
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>REQUEST = 0;</code>
       */
      REQUEST(0),
      /**
       * <code>RESPONSE = 1;</code>
       */
      RESPONSE(1),
      /**
       * <code>WEB_REQUEST = 2;</code>
       */
      WEB_REQUEST(2),
      /**
       * <code>WEB_RESPONSE = 3;</code>
       */
      WEB_RESPONSE(3),
      ;

      /**
       * <code>REQUEST = 0;</code>
       */
      public static final int REQUEST_VALUE = 0;
      /**
       * <code>RESPONSE = 1;</code>
       */
      public static final int RESPONSE_VALUE = 1;
      /**
       * <code>WEB_REQUEST = 2;</code>
       */
      public static final int WEB_REQUEST_VALUE = 2;
      /**
       * <code>WEB_RESPONSE = 3;</code>
       */
      public static final int WEB_RESPONSE_VALUE = 3;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Kind valueOf(int value) {
        return forNumber(value);
      }

      public static Kind forNumber(int value) {
        switch (value) {
          case 0: return REQUEST;
          case 1: return RESPONSE;
          case 2: return WEB_REQUEST;
          case 3: return WEB_RESPONSE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Kind> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
              public Kind findValueByNumber(int number) {
                return Kind.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.dfire.protocol.RpcSocketMessage.SocketMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final Kind[] VALUES = values();

      public static Kind valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Kind(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SocketMessage.Kind)
    }

    private int bitField0_;
    public static final int KIND_FIELD_NUMBER = 1;
    private int kind_;
    /**
     * <code>required .SocketMessage.Kind kind = 1;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .SocketMessage.Kind kind = 1;</code>
     */
    public com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind getKind() {
      @SuppressWarnings("deprecation")
      com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind result = com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind.valueOf(kind_);
      return result == null ? com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind.REQUEST : result;
    }

    public static final int BODY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString body_;
    /**
     * <pre>
     *消息体数据，字节码存储
     * </pre>
     *
     * <code>required bytes body = 2;</code>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     *消息体数据，字节码存储
     * </pre>
     *
     * <code>required bytes body = 2;</code>
     */
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasKind()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBody()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, kind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, body_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, kind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, body_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.dfire.protocol.RpcSocketMessage.SocketMessage)) {
        return super.equals(obj);
      }
      com.dfire.protocol.RpcSocketMessage.SocketMessage other = (com.dfire.protocol.RpcSocketMessage.SocketMessage) obj;

      boolean result = true;
      result = result && (hasKind() == other.hasKind());
      if (hasKind()) {
        result = result && kind_ == other.kind_;
      }
      result = result && (hasBody() == other.hasBody());
      if (hasBody()) {
        result = result && getBody()
            .equals(other.getBody());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasKind()) {
        hash = (37 * hash) + KIND_FIELD_NUMBER;
        hash = (53 * hash) + kind_;
      }
      if (hasBody()) {
        hash = (37 * hash) + BODY_FIELD_NUMBER;
        hash = (53 * hash) + getBody().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcSocketMessage.SocketMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.dfire.protocol.RpcSocketMessage.SocketMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *netty rpc通信消息体
     * </pre>
     *
     * Protobuf type {@code SocketMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SocketMessage)
        com.dfire.protocol.RpcSocketMessage.SocketMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dfire.protocol.RpcSocketMessage.internal_static_SocketMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dfire.protocol.RpcSocketMessage.internal_static_SocketMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dfire.protocol.RpcSocketMessage.SocketMessage.class, com.dfire.protocol.RpcSocketMessage.SocketMessage.Builder.class);
      }

      // Construct using com.dfire.protocol.RpcSocketMessage.SocketMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        kind_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        body_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dfire.protocol.RpcSocketMessage.internal_static_SocketMessage_descriptor;
      }

      @java.lang.Override
      public com.dfire.protocol.RpcSocketMessage.SocketMessage getDefaultInstanceForType() {
        return com.dfire.protocol.RpcSocketMessage.SocketMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.dfire.protocol.RpcSocketMessage.SocketMessage build() {
        com.dfire.protocol.RpcSocketMessage.SocketMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.dfire.protocol.RpcSocketMessage.SocketMessage buildPartial() {
        com.dfire.protocol.RpcSocketMessage.SocketMessage result = new com.dfire.protocol.RpcSocketMessage.SocketMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.kind_ = kind_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.body_ = body_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dfire.protocol.RpcSocketMessage.SocketMessage) {
          return mergeFrom((com.dfire.protocol.RpcSocketMessage.SocketMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dfire.protocol.RpcSocketMessage.SocketMessage other) {
        if (other == com.dfire.protocol.RpcSocketMessage.SocketMessage.getDefaultInstance()) return this;
        if (other.hasKind()) {
          setKind(other.getKind());
        }
        if (other.hasBody()) {
          setBody(other.getBody());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasKind()) {
          return false;
        }
        if (!hasBody()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dfire.protocol.RpcSocketMessage.SocketMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dfire.protocol.RpcSocketMessage.SocketMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int kind_ = 0;
      /**
       * <code>required .SocketMessage.Kind kind = 1;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .SocketMessage.Kind kind = 1;</code>
       */
      public com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind getKind() {
        @SuppressWarnings("deprecation")
        com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind result = com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind.valueOf(kind_);
        return result == null ? com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind.REQUEST : result;
      }
      /**
       * <code>required .SocketMessage.Kind kind = 1;</code>
       */
      public Builder setKind(com.dfire.protocol.RpcSocketMessage.SocketMessage.Kind value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .SocketMessage.Kind kind = 1;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       *消息体数据，字节码存储
       * </pre>
       *
       * <code>required bytes body = 2;</code>
       */
      public boolean hasBody() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <pre>
       *消息体数据，字节码存储
       * </pre>
       *
       * <code>required bytes body = 2;</code>
       */
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }
      /**
       * <pre>
       *消息体数据，字节码存储
       * </pre>
       *
       * <code>required bytes body = 2;</code>
       */
      public Builder setBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息体数据，字节码存储
       * </pre>
       *
       * <code>required bytes body = 2;</code>
       */
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~0x00000002);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SocketMessage)
    }

    // @@protoc_insertion_point(class_scope:SocketMessage)
    private static final com.dfire.protocol.RpcSocketMessage.SocketMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.dfire.protocol.RpcSocketMessage.SocketMessage();
    }

    public static com.dfire.protocol.RpcSocketMessage.SocketMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SocketMessage>
        PARSER = new com.google.protobuf.AbstractParser<SocketMessage>() {
      @java.lang.Override
      public SocketMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SocketMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SocketMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SocketMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.dfire.protocol.RpcSocketMessage.SocketMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SocketMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SocketMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024socket_message.proto\"\206\001\n\rSocketMessage" +
      "\022!\n\004kind\030\001 \002(\0162\023.SocketMessage.Kind\022\014\n\004b" +
      "ody\030\002 \002(\014\"D\n\004Kind\022\013\n\007REQUEST\020\000\022\014\n\010RESPON" +
      "SE\020\001\022\017\n\013WEB_REQUEST\020\002\022\020\n\014WEB_RESPONSE\020\003B" +
      "(\n\022com.dfire.protocolB\020RpcSocketMessageH" +
      "\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SocketMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SocketMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SocketMessage_descriptor,
        new java.lang.String[] { "Kind", "Body", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
