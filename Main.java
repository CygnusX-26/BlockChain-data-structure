public class Main {
    public static void main(String[] args){
        //testing implementation
        BlockChain<String> blockChain = new BlockChain<String>(new Block<String>(new String[]{"foo", "bar"}));
        blockChain.add(new String[]{"Hello World!"});
        System.out.println(blockChain.toString());
        BlockChain<Integer> blockChain2 = new BlockChain<Integer>(new Block<Integer>(new Integer[]{4, 6}));
        blockChain2.add(new Integer[]{1, 2});
        System.out.println(blockChain2.toString());
        //delete this
    }
}
