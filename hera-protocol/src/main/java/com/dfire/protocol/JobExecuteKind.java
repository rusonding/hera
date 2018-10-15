// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: execute_kind.proto

package com.dfire.protocol;

public final class JobExecuteKind {
  private JobExecuteKind() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ExecuteKind}
   */
  public enum ExecuteKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ScheduleKind = 0;</code>
     */
    ScheduleKind(0),
    /**
     * <code>ManualKind = 1;</code>
     */
    ManualKind(1),
    /**
     * <code>DebugKind = 2;</code>
     */
    DebugKind(2),
    ;

    /**
     * <code>ScheduleKind = 0;</code>
     */
    public static final int ScheduleKind_VALUE = 0;
    /**
     * <code>ManualKind = 1;</code>
     */
    public static final int ManualKind_VALUE = 1;
    /**
     * <code>DebugKind = 2;</code>
     */
    public static final int DebugKind_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ExecuteKind valueOf(int value) {
      return forNumber(value);
    }

    public static ExecuteKind forNumber(int value) {
      switch (value) {
        case 0: return ScheduleKind;
        case 1: return ManualKind;
        case 2: return DebugKind;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExecuteKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExecuteKind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExecuteKind>() {
            public ExecuteKind findValueByNumber(int number) {
              return ExecuteKind.forNumber(number);
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
      return com.dfire.protocol.JobExecuteKind.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExecuteKind[] VALUES = values();

    public static ExecuteKind valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ExecuteKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ExecuteKind)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022execute_kind.proto*>\n\013ExecuteKind\022\020\n\014S" +
      "cheduleKind\020\000\022\016\n\nManualKind\020\001\022\r\n\tDebugKi" +
      "nd\020\002B&\n\022com.dfire.protocolB\016JobExecuteKi" +
      "ndH\001"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
