// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/LinkerEnlargeGuestApplyContent.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

/**
 * <pre>
 *更新时间 : 2023-01-11
 * </pre>
 *
 * Protobuf type {@code LinkerEnlargeGuestApplyContent}
 */
public final class LinkerEnlargeGuestApplyContent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LinkerEnlargeGuestApplyContent)
    LinkerEnlargeGuestApplyContentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LinkerEnlargeGuestApplyContent.newBuilder() to construct.
  private LinkerEnlargeGuestApplyContent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LinkerEnlargeGuestApplyContent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LinkerEnlargeGuestApplyContent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LinkerEnlargeGuestApplyContent(
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
    return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContentOuterClass.internal_static_LinkerEnlargeGuestApplyContent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContentOuterClass.internal_static_LinkerEnlargeGuestApplyContent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent.class, cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent other = (cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent prototype) {
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
   *更新时间 : 2023-01-11
   * </pre>
   *
   * Protobuf type {@code LinkerEnlargeGuestApplyContent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LinkerEnlargeGuestApplyContent)
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContentOuterClass.internal_static_LinkerEnlargeGuestApplyContent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContentOuterClass.internal_static_LinkerEnlargeGuestApplyContent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent.class, cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContentOuterClass.internal_static_LinkerEnlargeGuestApplyContent_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent build() {
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent buildPartial() {
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent result = new cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent(this);
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
      if (other instanceof cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent) {
        return mergeFrom((cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent other) {
      if (other == cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent.getDefaultInstance()) return this;
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
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:LinkerEnlargeGuestApplyContent)
  }

  // @@protoc_insertion_point(class_scope:LinkerEnlargeGuestApplyContent)
  private static final cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent();
  }

  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinkerEnlargeGuestApplyContent>
      PARSER = new com.google.protobuf.AbstractParser<LinkerEnlargeGuestApplyContent>() {
    @java.lang.Override
    public LinkerEnlargeGuestApplyContent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LinkerEnlargeGuestApplyContent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LinkerEnlargeGuestApplyContent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinkerEnlargeGuestApplyContent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.LinkerEnlargeGuestApplyContent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
