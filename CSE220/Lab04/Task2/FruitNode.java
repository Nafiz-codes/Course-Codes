public class FruitNode {
    Object[] fruit = new Object[2];
    FruitNode next;

    public FruitNode(String name, Integer price){
        fruit[0]=name;
        fruit[1]=price;
    }
    
}
