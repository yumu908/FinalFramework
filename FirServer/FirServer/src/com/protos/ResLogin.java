// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pbuser.proto

package com.protos;

/**
 * Protobuf type {@code pb_user.ResLogin}
 */
public  final class ResLogin extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb_user.ResLogin)
    ResLoginOrBuilder {
  // Use ResLogin.newBuilder() to construct.
  private ResLogin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResLogin() {
    result_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ResLogin(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            result_ = rawValue;
            break;
          }
          case 18: {
            com.protos.UserInfo.Builder subBuilder = null;
            if (userinfo_ != null) {
              subBuilder = userinfo_.toBuilder();
            }
            userinfo_ = input.readMessage(com.protos.UserInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userinfo_);
              userinfo_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.protos.pbuser.internal_static_pb_user_ResLogin_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.protos.pbuser.internal_static_pb_user_ResLogin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.protos.ResLogin.class, com.protos.ResLogin.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>optional .pb_common.ResultCode result = 1;</code>
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>optional .pb_common.ResultCode result = 1;</code>
   */
  public com.protos.ResultCode getResult() {
    com.protos.ResultCode result = com.protos.ResultCode.valueOf(result_);
    return result == null ? com.protos.ResultCode.UNRECOGNIZED : result;
  }

  public static final int USERINFO_FIELD_NUMBER = 2;
  private com.protos.UserInfo userinfo_;
  /**
   * <code>optional .pb_common.UserInfo userinfo = 2;</code>
   */
  public boolean hasUserinfo() {
    return userinfo_ != null;
  }
  /**
   * <code>optional .pb_common.UserInfo userinfo = 2;</code>
   */
  public com.protos.UserInfo getUserinfo() {
    return userinfo_ == null ? com.protos.UserInfo.getDefaultInstance() : userinfo_;
  }
  /**
   * <code>optional .pb_common.UserInfo userinfo = 2;</code>
   */
  public com.protos.UserInfoOrBuilder getUserinfoOrBuilder() {
    return getUserinfo();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (result_ != com.protos.ResultCode.Success.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (userinfo_ != null) {
      output.writeMessage(2, getUserinfo());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != com.protos.ResultCode.Success.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (userinfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUserinfo());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.protos.ResLogin)) {
      return super.equals(obj);
    }
    com.protos.ResLogin other = (com.protos.ResLogin) obj;

    boolean result = true;
    result = result && result_ == other.result_;
    result = result && (hasUserinfo() == other.hasUserinfo());
    if (hasUserinfo()) {
      result = result && getUserinfo()
          .equals(other.getUserinfo());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (hasUserinfo()) {
      hash = (37 * hash) + USERINFO_FIELD_NUMBER;
      hash = (53 * hash) + getUserinfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.protos.ResLogin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.protos.ResLogin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.protos.ResLogin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.protos.ResLogin parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.protos.ResLogin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.protos.ResLogin parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.protos.ResLogin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.protos.ResLogin parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.protos.ResLogin parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.protos.ResLogin parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.protos.ResLogin prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code pb_user.ResLogin}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb_user.ResLogin)
      com.protos.ResLoginOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.protos.pbuser.internal_static_pb_user_ResLogin_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.protos.pbuser.internal_static_pb_user_ResLogin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.protos.ResLogin.class, com.protos.ResLogin.Builder.class);
    }

    // Construct using com.protos.ResLogin.newBuilder()
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
    public Builder clear() {
      super.clear();
      result_ = 0;

      if (userinfoBuilder_ == null) {
        userinfo_ = null;
      } else {
        userinfo_ = null;
        userinfoBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.protos.pbuser.internal_static_pb_user_ResLogin_descriptor;
    }

    public com.protos.ResLogin getDefaultInstanceForType() {
      return com.protos.ResLogin.getDefaultInstance();
    }

    public com.protos.ResLogin build() {
      com.protos.ResLogin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.protos.ResLogin buildPartial() {
      com.protos.ResLogin result = new com.protos.ResLogin(this);
      result.result_ = result_;
      if (userinfoBuilder_ == null) {
        result.userinfo_ = userinfo_;
      } else {
        result.userinfo_ = userinfoBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.protos.ResLogin) {
        return mergeFrom((com.protos.ResLogin)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.protos.ResLogin other) {
      if (other == com.protos.ResLogin.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasUserinfo()) {
        mergeUserinfo(other.getUserinfo());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.protos.ResLogin parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.protos.ResLogin) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <code>optional .pb_common.ResultCode result = 1;</code>
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>optional .pb_common.ResultCode result = 1;</code>
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .pb_common.ResultCode result = 1;</code>
     */
    public com.protos.ResultCode getResult() {
      com.protos.ResultCode result = com.protos.ResultCode.valueOf(result_);
      return result == null ? com.protos.ResultCode.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .pb_common.ResultCode result = 1;</code>
     */
    public Builder setResult(com.protos.ResultCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .pb_common.ResultCode result = 1;</code>
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private com.protos.UserInfo userinfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.protos.UserInfo, com.protos.UserInfo.Builder, com.protos.UserInfoOrBuilder> userinfoBuilder_;
    /**
     * <code>optional .pb_common.UserInfo userinfo = 2;</code>
     */
    public boolean hasUserinfo() {
      return userinfoBuilder_ != null || userinfo_ != null;
    }
    /**
     * <code>optional .pb_common.UserInfo userinfo = 2;</code>
     */
    public com.protos.UserInfo getUserinfo() {
      if (userinfoBuilder_ == null) {
        return userinfo_ == null ? com.protos.UserInfo.getDefaultInstance() : userinfo_;
      } else {
        return userinfoBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .pb_common.UserInfo userinfo = 2;</code>
     */
    public Builder setUserinfo(com.protos.UserInfo value) {
      if (userinfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userinfo_ = value;
        onChanged();
      } else {
        userinfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .pb_common.UserInfo userinfo = 2;</code>
     */
    public Builder setUserinfo(
        com.protos.UserInfo.Builder builderForValue) {
      if (userinfoBuilder_ == null) {
        userinfo_ = builderForValue.build();
        onChanged();
      } else {
        userinfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .pb_common.UserInfo userinfo = 2;</code>
     */
    public Builder mergeUserinfo(com.protos.UserInfo value) {
      if (userinfoBuilder_ == null) {
        if (userinfo_ != null) {
          userinfo_ =
            com.protos.UserInfo.newBuilder(userinfo_).mergeFrom(value).buildPartial();
        } else {
          userinfo_ = value;
        }
        onChanged();
      } else {
        userinfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .pb_common.UserInfo userinfo = 2;</code>
     */
    public Builder clearUserinfo() {
      if (userinfoBuilder_ == null) {
        userinfo_ = null;
        onChanged();
      } else {
        userinfo_ = null;
        userinfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .pb_common.UserInfo userinfo = 2;</code>
     */
    public com.protos.UserInfo.Builder getUserinfoBuilder() {
      
      onChanged();
      return getUserinfoFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .pb_common.UserInfo userinfo = 2;</code>
     */
    public com.protos.UserInfoOrBuilder getUserinfoOrBuilder() {
      if (userinfoBuilder_ != null) {
        return userinfoBuilder_.getMessageOrBuilder();
      } else {
        return userinfo_ == null ?
            com.protos.UserInfo.getDefaultInstance() : userinfo_;
      }
    }
    /**
     * <code>optional .pb_common.UserInfo userinfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.protos.UserInfo, com.protos.UserInfo.Builder, com.protos.UserInfoOrBuilder> 
        getUserinfoFieldBuilder() {
      if (userinfoBuilder_ == null) {
        userinfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.protos.UserInfo, com.protos.UserInfo.Builder, com.protos.UserInfoOrBuilder>(
                getUserinfo(),
                getParentForChildren(),
                isClean());
        userinfo_ = null;
      }
      return userinfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:pb_user.ResLogin)
  }

  // @@protoc_insertion_point(class_scope:pb_user.ResLogin)
  private static final com.protos.ResLogin DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.protos.ResLogin();
  }

  public static com.protos.ResLogin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResLogin>
      PARSER = new com.google.protobuf.AbstractParser<ResLogin>() {
    public ResLogin parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResLogin(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResLogin> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResLogin> getParserForType() {
    return PARSER;
  }

  public com.protos.ResLogin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

