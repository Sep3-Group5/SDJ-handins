// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package via.sdj3.slaughterhousepart2.generated.product;

public final class Product {
  private Product() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestText_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseText_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rproduct.proto\"!\n\013RequestText\022\022\n\ninput_" +
      "text\030\001 \001(\t\"#\n\014ResponseText\022\023\n\013output_tex" +
      "t\030\001 \001(\t2o\n\016ProductService\022,\n\013getPackages" +
      "\022\014.RequestText\032\r.ResponseText\"\000\022/\n\016getAn" +
      "imalParts\022\014.RequestText\032\r.ResponseText\"\000" +
      "B2\n.via.sdj3.slaughterhousepart2.generat" +
      "ed.productP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RequestText_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RequestText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestText_descriptor,
        new java.lang.String[] { "InputText", });
    internal_static_ResponseText_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ResponseText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseText_descriptor,
        new java.lang.String[] { "OutputText", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
