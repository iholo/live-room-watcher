// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/SyncStreamMessage.proto

package cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im;

/**
 * <pre>
 *更新时间 : 2023-01-10
 * </pre>
 *
 * Protobuf type {@code SyncStreamMessage}
 */
public final class SyncStreamMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SyncStreamMessage)
    SyncStreamMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SyncStreamMessage.newBuilder() to construct.
  private SyncStreamMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SyncStreamMessage() {
    common_ = "";
    infoListList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SyncStreamMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessageOuterClass.internal_static_SyncStreamMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessageOuterClass.internal_static_SyncStreamMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage.class, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage.Builder.class);
  }

  public static final int COMMON_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object common_ = "";
  /**
   * <code>string common = 1;</code>
   * @return The common.
   */
  @java.lang.Override
  public java.lang.String getCommon() {
    java.lang.Object ref = common_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      common_ = s;
      return s;
    }
  }
  /**
   * <code>string common = 1;</code>
   * @return The bytes for common.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommonBytes() {
    java.lang.Object ref = common_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      common_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFOLISTLIST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage> infoListList_;
  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  @java.lang.Override
  public java.util.List<cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage> getInfoListListList() {
    return infoListList_;
  }
  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessageOrBuilder> 
      getInfoListListOrBuilderList() {
    return infoListList_;
  }
  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  @java.lang.Override
  public int getInfoListListCount() {
    return infoListList_.size();
  }
  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage getInfoListList(int index) {
    return infoListList_.get(index);
  }
  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessageOrBuilder getInfoListListOrBuilder(
      int index) {
    return infoListList_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(common_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, common_);
    }
    for (int i = 0; i < infoListList_.size(); i++) {
      output.writeMessage(2, infoListList_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(common_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, common_);
    }
    for (int i = 0; i < infoListList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, infoListList_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage other = (cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage) obj;

    if (!getCommon()
        .equals(other.getCommon())) return false;
    if (!getInfoListListList()
        .equals(other.getInfoListListList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COMMON_FIELD_NUMBER;
    hash = (53 * hash) + getCommon().hashCode();
    if (getInfoListListCount() > 0) {
      hash = (37 * hash) + INFOLISTLIST_FIELD_NUMBER;
      hash = (53 * hash) + getInfoListListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage prototype) {
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
   *更新时间 : 2023-01-10
   * </pre>
   *
   * Protobuf type {@code SyncStreamMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SyncStreamMessage)
      cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessageOuterClass.internal_static_SyncStreamMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessageOuterClass.internal_static_SyncStreamMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage.class, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      common_ = "";
      if (infoListListBuilder_ == null) {
        infoListList_ = java.util.Collections.emptyList();
      } else {
        infoListList_ = null;
        infoListListBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessageOuterClass.internal_static_SyncStreamMessage_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage build() {
      cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage buildPartial() {
      cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage result = new cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage result) {
      if (infoListListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          infoListList_ = java.util.Collections.unmodifiableList(infoListList_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.infoListList_ = infoListList_;
      } else {
        result.infoListList_ = infoListListBuilder_.build();
      }
    }

    private void buildPartial0(cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.common_ = common_;
      }
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
      if (other instanceof cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage) {
        return mergeFrom((cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage other) {
      if (other == cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage.getDefaultInstance()) return this;
      if (!other.getCommon().isEmpty()) {
        common_ = other.common_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (infoListListBuilder_ == null) {
        if (!other.infoListList_.isEmpty()) {
          if (infoListList_.isEmpty()) {
            infoListList_ = other.infoListList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureInfoListListIsMutable();
            infoListList_.addAll(other.infoListList_);
          }
          onChanged();
        }
      } else {
        if (!other.infoListList_.isEmpty()) {
          if (infoListListBuilder_.isEmpty()) {
            infoListListBuilder_.dispose();
            infoListListBuilder_ = null;
            infoListList_ = other.infoListList_;
            bitField0_ = (bitField0_ & ~0x00000002);
            infoListListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInfoListListFieldBuilder() : null;
          } else {
            infoListListBuilder_.addAllMessages(other.infoListList_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              common_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage m =
                  input.readMessage(
                      cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.parser(),
                      extensionRegistry);
              if (infoListListBuilder_ == null) {
                ensureInfoListListIsMutable();
                infoListList_.add(m);
              } else {
                infoListListBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object common_ = "";
    /**
     * <code>string common = 1;</code>
     * @return The common.
     */
    public java.lang.String getCommon() {
      java.lang.Object ref = common_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        common_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string common = 1;</code>
     * @return The bytes for common.
     */
    public com.google.protobuf.ByteString
        getCommonBytes() {
      java.lang.Object ref = common_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        common_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string common = 1;</code>
     * @param value The common to set.
     * @return This builder for chaining.
     */
    public Builder setCommon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      common_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string common = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommon() {
      common_ = getDefaultInstance().getCommon();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string common = 1;</code>
     * @param value The bytes for common to set.
     * @return This builder for chaining.
     */
    public Builder setCommonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      common_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage> infoListList_ =
      java.util.Collections.emptyList();
    private void ensureInfoListListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        infoListList_ = new java.util.ArrayList<cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage>(infoListList_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessageOrBuilder> infoListListBuilder_;

    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public java.util.List<cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage> getInfoListListList() {
      if (infoListListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(infoListList_);
      } else {
        return infoListListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public int getInfoListListCount() {
      if (infoListListBuilder_ == null) {
        return infoListList_.size();
      } else {
        return infoListListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage getInfoListList(int index) {
      if (infoListListBuilder_ == null) {
        return infoListList_.get(index);
      } else {
        return infoListListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public Builder setInfoListList(
        int index, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage value) {
      if (infoListListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoListListIsMutable();
        infoListList_.set(index, value);
        onChanged();
      } else {
        infoListListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public Builder setInfoListList(
        int index, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder builderForValue) {
      if (infoListListBuilder_ == null) {
        ensureInfoListListIsMutable();
        infoListList_.set(index, builderForValue.build());
        onChanged();
      } else {
        infoListListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public Builder addInfoListList(cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage value) {
      if (infoListListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoListListIsMutable();
        infoListList_.add(value);
        onChanged();
      } else {
        infoListListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public Builder addInfoListList(
        int index, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage value) {
      if (infoListListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoListListIsMutable();
        infoListList_.add(index, value);
        onChanged();
      } else {
        infoListListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public Builder addInfoListList(
        cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder builderForValue) {
      if (infoListListBuilder_ == null) {
        ensureInfoListListIsMutable();
        infoListList_.add(builderForValue.build());
        onChanged();
      } else {
        infoListListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public Builder addInfoListList(
        int index, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder builderForValue) {
      if (infoListListBuilder_ == null) {
        ensureInfoListListIsMutable();
        infoListList_.add(index, builderForValue.build());
        onChanged();
      } else {
        infoListListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public Builder addAllInfoListList(
        java.lang.Iterable<? extends cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage> values) {
      if (infoListListBuilder_ == null) {
        ensureInfoListListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, infoListList_);
        onChanged();
      } else {
        infoListListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public Builder clearInfoListList() {
      if (infoListListBuilder_ == null) {
        infoListList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        infoListListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public Builder removeInfoListList(int index) {
      if (infoListListBuilder_ == null) {
        ensureInfoListListIsMutable();
        infoListList_.remove(index);
        onChanged();
      } else {
        infoListListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder getInfoListListBuilder(
        int index) {
      return getInfoListListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessageOrBuilder getInfoListListOrBuilder(
        int index) {
      if (infoListListBuilder_ == null) {
        return infoListList_.get(index);  } else {
        return infoListListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public java.util.List<? extends cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessageOrBuilder> 
         getInfoListListOrBuilderList() {
      if (infoListListBuilder_ != null) {
        return infoListListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(infoListList_);
      }
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder addInfoListListBuilder() {
      return getInfoListListFieldBuilder().addBuilder(
          cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder addInfoListListBuilder(
        int index) {
      return getInfoListListFieldBuilder().addBuilder(
          index, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
     */
    public java.util.List<cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder> 
         getInfoListListBuilderList() {
      return getInfoListListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessageOrBuilder> 
        getInfoListListFieldBuilder() {
      if (infoListListBuilder_ == null) {
        infoListListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage.Builder, cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessageOrBuilder>(
                infoListList_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        infoListList_ = null;
      }
      return infoListListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:SyncStreamMessage)
  }

  // @@protoc_insertion_point(class_scope:SyncStreamMessage)
  private static final cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage();
  }

  public static cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SyncStreamMessage>
      PARSER = new com.google.protobuf.AbstractParser<SyncStreamMessage>() {
    @java.lang.Override
    public SyncStreamMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SyncStreamMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SyncStreamMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.SyncStreamMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
