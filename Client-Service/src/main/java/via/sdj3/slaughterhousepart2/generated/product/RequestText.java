// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package via.sdj3.slaughterhousepart2.generated.product;

/**
 * Protobuf type {@code RequestText}
 */
public  final class RequestText extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RequestText)
    RequestTextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestText.newBuilder() to construct.
  private RequestText(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestText() {
    inputText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestText();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestText(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            inputText_ = s;
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
    return via.sdj3.slaughterhousepart2.generated.product.Product.internal_static_RequestText_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.slaughterhousepart2.generated.product.Product.internal_static_RequestText_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.slaughterhousepart2.generated.product.RequestText.class, via.sdj3.slaughterhousepart2.generated.product.RequestText.Builder.class);
  }

  public static final int INPUT_TEXT_FIELD_NUMBER = 1;
  private volatile java.lang.Object inputText_;
  /**
   * <code>string input_text = 1;</code>
   * @return The inputText.
   */
  public java.lang.String getInputText() {
    java.lang.Object ref = inputText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputText_ = s;
      return s;
    }
  }
  /**
   * <code>string input_text = 1;</code>
   * @return The bytes for inputText.
   */
  public com.google.protobuf.ByteString
      getInputTextBytes() {
    java.lang.Object ref = inputText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inputText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getInputTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inputText_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInputTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inputText_);
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
    if (!(obj instanceof via.sdj3.slaughterhousepart2.generated.product.RequestText)) {
      return super.equals(obj);
    }
    via.sdj3.slaughterhousepart2.generated.product.RequestText other = (via.sdj3.slaughterhousepart2.generated.product.RequestText) obj;

    if (!getInputText()
        .equals(other.getInputText())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INPUT_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getInputText().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhousepart2.generated.product.RequestText parseFrom(
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
  public static Builder newBuilder(via.sdj3.slaughterhousepart2.generated.product.RequestText prototype) {
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
   * Protobuf type {@code RequestText}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RequestText)
      via.sdj3.slaughterhousepart2.generated.product.RequestTextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.slaughterhousepart2.generated.product.Product.internal_static_RequestText_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.slaughterhousepart2.generated.product.Product.internal_static_RequestText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.slaughterhousepart2.generated.product.RequestText.class, via.sdj3.slaughterhousepart2.generated.product.RequestText.Builder.class);
    }

    // Construct using via.sdj3.slaughterhousepart2.generated.product.RequestText.newBuilder()
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
      inputText_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.slaughterhousepart2.generated.product.Product.internal_static_RequestText_descriptor;
    }

    @java.lang.Override
    public via.sdj3.slaughterhousepart2.generated.product.RequestText getDefaultInstanceForType() {
      return via.sdj3.slaughterhousepart2.generated.product.RequestText.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.slaughterhousepart2.generated.product.RequestText build() {
      via.sdj3.slaughterhousepart2.generated.product.RequestText result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.slaughterhousepart2.generated.product.RequestText buildPartial() {
      via.sdj3.slaughterhousepart2.generated.product.RequestText result = new via.sdj3.slaughterhousepart2.generated.product.RequestText(this);
      result.inputText_ = inputText_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sdj3.slaughterhousepart2.generated.product.RequestText) {
        return mergeFrom((via.sdj3.slaughterhousepart2.generated.product.RequestText)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.slaughterhousepart2.generated.product.RequestText other) {
      if (other == via.sdj3.slaughterhousepart2.generated.product.RequestText.getDefaultInstance()) return this;
      if (!other.getInputText().isEmpty()) {
        inputText_ = other.inputText_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sdj3.slaughterhousepart2.generated.product.RequestText parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.slaughterhousepart2.generated.product.RequestText) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object inputText_ = "";
    /**
     * <code>string input_text = 1;</code>
     * @return The inputText.
     */
    public java.lang.String getInputText() {
      java.lang.Object ref = inputText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string input_text = 1;</code>
     * @return The bytes for inputText.
     */
    public com.google.protobuf.ByteString
        getInputTextBytes() {
      java.lang.Object ref = inputText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string input_text = 1;</code>
     * @param value The inputText to set.
     * @return This builder for chaining.
     */
    public Builder setInputText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      inputText_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string input_text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputText() {
      
      inputText_ = getDefaultInstance().getInputText();
      onChanged();
      return this;
    }
    /**
     * <code>string input_text = 1;</code>
     * @param value The bytes for inputText to set.
     * @return This builder for chaining.
     */
    public Builder setInputTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      inputText_ = value;
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


    // @@protoc_insertion_point(builder_scope:RequestText)
  }

  // @@protoc_insertion_point(class_scope:RequestText)
  private static final via.sdj3.slaughterhousepart2.generated.product.RequestText DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.slaughterhousepart2.generated.product.RequestText();
  }

  public static via.sdj3.slaughterhousepart2.generated.product.RequestText getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestText>
      PARSER = new com.google.protobuf.AbstractParser<RequestText>() {
    @java.lang.Override
    public RequestText parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestText(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestText> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestText> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.slaughterhousepart2.generated.product.RequestText getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

