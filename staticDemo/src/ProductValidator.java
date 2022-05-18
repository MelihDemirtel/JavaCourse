public class ProductValidator {
    static {
        System.out.println("Static Block Runned");
    }
    public ProductValidator(){
        System.out.println("Block Runned");
    }
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public void other(){

    }
}
