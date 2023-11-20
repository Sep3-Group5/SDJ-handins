package via.sdj3.slaughterhousepart2.generated.animal;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: animal.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhousepart2.generated.animal.AnimalObj,
      via.sdj3.slaughterhousepart2.generated.animal.AnimalObj> getAddAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addAnimal",
      requestType = via.sdj3.slaughterhousepart2.generated.animal.AnimalObj.class,
      responseType = via.sdj3.slaughterhousepart2.generated.animal.AnimalObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhousepart2.generated.animal.AnimalObj,
      via.sdj3.slaughterhousepart2.generated.animal.AnimalObj> getAddAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhousepart2.generated.animal.AnimalObj, via.sdj3.slaughterhousepart2.generated.animal.AnimalObj> getAddAnimalMethod;
    if ((getAddAnimalMethod = ProductServiceGrpc.getAddAnimalMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getAddAnimalMethod = ProductServiceGrpc.getAddAnimalMethod) == null) {
          ProductServiceGrpc.getAddAnimalMethod = getAddAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhousepart2.generated.animal.AnimalObj, via.sdj3.slaughterhousepart2.generated.animal.AnimalObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousepart2.generated.animal.AnimalObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousepart2.generated.animal.AnimalObj.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("addAnimal"))
              .build();
        }
      }
    }
    return getAddAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhousepart2.generated.animal.RequestText,
      via.sdj3.slaughterhousepart2.generated.animal.ResponseText> getGetAnimalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalById",
      requestType = via.sdj3.slaughterhousepart2.generated.animal.RequestText.class,
      responseType = via.sdj3.slaughterhousepart2.generated.animal.ResponseText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhousepart2.generated.animal.RequestText,
      via.sdj3.slaughterhousepart2.generated.animal.ResponseText> getGetAnimalByIdMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhousepart2.generated.animal.RequestText, via.sdj3.slaughterhousepart2.generated.animal.ResponseText> getGetAnimalByIdMethod;
    if ((getGetAnimalByIdMethod = ProductServiceGrpc.getGetAnimalByIdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetAnimalByIdMethod = ProductServiceGrpc.getGetAnimalByIdMethod) == null) {
          ProductServiceGrpc.getGetAnimalByIdMethod = getGetAnimalByIdMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhousepart2.generated.animal.RequestText, via.sdj3.slaughterhousepart2.generated.animal.ResponseText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousepart2.generated.animal.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousepart2.generated.animal.ResponseText.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("getAnimalById"))
              .build();
        }
      }
    }
    return getGetAnimalByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addAnimal(via.sdj3.slaughterhousepart2.generated.animal.AnimalObj request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousepart2.generated.animal.AnimalObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAnimalMethod(), responseObserver);
    }

    /**
     */
    default void getAnimalById(via.sdj3.slaughterhousepart2.generated.animal.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousepart2.generated.animal.ResponseText> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductService.
   */
  public static abstract class ProductServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void addAnimal(via.sdj3.slaughterhousepart2.generated.animal.AnimalObj request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousepart2.generated.animal.AnimalObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalById(via.sdj3.slaughterhousepart2.generated.animal.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousepart2.generated.animal.ResponseText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.slaughterhousepart2.generated.animal.AnimalObj addAnimal(via.sdj3.slaughterhousepart2.generated.animal.AnimalObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.slaughterhousepart2.generated.animal.ResponseText getAnimalById(via.sdj3.slaughterhousepart2.generated.animal.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductService.
   */
  public static final class ProductServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhousepart2.generated.animal.AnimalObj> addAnimal(
        via.sdj3.slaughterhousepart2.generated.animal.AnimalObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhousepart2.generated.animal.ResponseText> getAnimalById(
        via.sdj3.slaughterhousepart2.generated.animal.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ANIMAL = 0;
  private static final int METHODID_GET_ANIMAL_BY_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ANIMAL:
          serviceImpl.addAnimal((via.sdj3.slaughterhousepart2.generated.animal.AnimalObj) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhousepart2.generated.animal.AnimalObj>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_BY_ID:
          serviceImpl.getAnimalById((via.sdj3.slaughterhousepart2.generated.animal.RequestText) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhousepart2.generated.animal.ResponseText>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.slaughterhousepart2.generated.animal.AnimalObj,
              via.sdj3.slaughterhousepart2.generated.animal.AnimalObj>(
                service, METHODID_ADD_ANIMAL)))
        .addMethod(
          getGetAnimalByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              via.sdj3.slaughterhousepart2.generated.animal.RequestText,
              via.sdj3.slaughterhousepart2.generated.animal.ResponseText>(
                service, METHODID_GET_ANIMAL_BY_ID)))
        .build();
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.slaughterhousepart2.generated.animal.Animal.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getAddAnimalMethod())
              .addMethod(getGetAnimalByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
