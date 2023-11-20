package via.sdj3.slaughterhousepart2.grpcClient.product;

import com.example.slaughterhousepart3.generated.product.Product;
import com.example.slaughterhousepart3.generated.product.ProductServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.ArrayList;

public class GRPCProductClientImpl implements ProductClient {

//    private ProductServiceGrpc.ProductServiceBlockingStub productBlockingStub;
//
//    public ProductServiceGrpc.ProductServiceBlockingStub getProductBlockingStub()
//    {
//        if (productBlockingStub == null)
//        {
//            ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 5021).usePlaintext().build();
//            productBlockingStub = ProductServiceGrpc.newBlockingStub(managedChannel);
//        }
//        return productBlockingStub;
//    }
//
//    @Override
//    public void addProduct(Product product)
//    {
//
//    }
//
//    @Override
//    public Product getProduct(int productId) {
//        return null;
//    }
//
//    @Override
//    public ArrayList<Product> getProducts() {
//        return null;
//    }
}
