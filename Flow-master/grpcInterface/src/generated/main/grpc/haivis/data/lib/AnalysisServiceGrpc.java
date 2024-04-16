package haivis.data.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: analysis.proto")
public final class AnalysisServiceGrpc {

  private AnalysisServiceGrpc() {}

  public static final String SERVICE_NAME = "AnalysisService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<haivis.data.lib.AnalysisRequest,
      haivis.data.lib.AnalysisResponse> getSendAnalysisDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAnalysisData",
      requestType = haivis.data.lib.AnalysisRequest.class,
      responseType = haivis.data.lib.AnalysisResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<haivis.data.lib.AnalysisRequest,
      haivis.data.lib.AnalysisResponse> getSendAnalysisDataMethod() {
    io.grpc.MethodDescriptor<haivis.data.lib.AnalysisRequest, haivis.data.lib.AnalysisResponse> getSendAnalysisDataMethod;
    if ((getSendAnalysisDataMethod = AnalysisServiceGrpc.getSendAnalysisDataMethod) == null) {
      synchronized (AnalysisServiceGrpc.class) {
        if ((getSendAnalysisDataMethod = AnalysisServiceGrpc.getSendAnalysisDataMethod) == null) {
          AnalysisServiceGrpc.getSendAnalysisDataMethod = getSendAnalysisDataMethod =
              io.grpc.MethodDescriptor.<haivis.data.lib.AnalysisRequest, haivis.data.lib.AnalysisResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendAnalysisData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  haivis.data.lib.AnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  haivis.data.lib.AnalysisResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnalysisServiceMethodDescriptorSupplier("SendAnalysisData"))
              .build();
        }
      }
    }
    return getSendAnalysisDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnalysisServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnalysisServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnalysisServiceStub>() {
        @java.lang.Override
        public AnalysisServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnalysisServiceStub(channel, callOptions);
        }
      };
    return AnalysisServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnalysisServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnalysisServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnalysisServiceBlockingStub>() {
        @java.lang.Override
        public AnalysisServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnalysisServiceBlockingStub(channel, callOptions);
        }
      };
    return AnalysisServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnalysisServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnalysisServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnalysisServiceFutureStub>() {
        @java.lang.Override
        public AnalysisServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnalysisServiceFutureStub(channel, callOptions);
        }
      };
    return AnalysisServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnalysisServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<haivis.data.lib.AnalysisRequest> sendAnalysisData(
        io.grpc.stub.StreamObserver<haivis.data.lib.AnalysisResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendAnalysisDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendAnalysisDataMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                haivis.data.lib.AnalysisRequest,
                haivis.data.lib.AnalysisResponse>(
                  this, METHODID_SEND_ANALYSIS_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class AnalysisServiceStub extends io.grpc.stub.AbstractAsyncStub<AnalysisServiceStub> {
    private AnalysisServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalysisServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnalysisServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<haivis.data.lib.AnalysisRequest> sendAnalysisData(
        io.grpc.stub.StreamObserver<haivis.data.lib.AnalysisResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendAnalysisDataMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AnalysisServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnalysisServiceBlockingStub> {
    private AnalysisServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalysisServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnalysisServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class AnalysisServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnalysisServiceFutureStub> {
    private AnalysisServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalysisServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnalysisServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_ANALYSIS_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnalysisServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnalysisServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_ANALYSIS_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendAnalysisData(
              (io.grpc.stub.StreamObserver<haivis.data.lib.AnalysisResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AnalysisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnalysisServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return haivis.data.lib.GeneralProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnalysisService");
    }
  }

  private static final class AnalysisServiceFileDescriptorSupplier
      extends AnalysisServiceBaseDescriptorSupplier {
    AnalysisServiceFileDescriptorSupplier() {}
  }

  private static final class AnalysisServiceMethodDescriptorSupplier
      extends AnalysisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnalysisServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnalysisServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnalysisServiceFileDescriptorSupplier())
              .addMethod(getSendAnalysisDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
