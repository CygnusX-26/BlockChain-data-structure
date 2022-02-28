import java.util.ArrayList;

/**
 * Constructs a BlockChain.
 * Each block contains a transaction of specified type.
 * @author Neil Hommes
 * @version 0.0.1 - 2/27/2022
 */
class BlockChain<E>{

    private Block<E> genesisBlock;
    private Block<E> last;
    //for toString
    private ArrayList<Block<E>> blocks = new ArrayList<Block<E>>(); //temp, find better way to iterate through...
    //TODO implement iterable and add BlockChainIterator. Replaces previous line.
    
    /**
     * Constructs a default blockchain containing default genesis block.
     * Mainly for testing purposes.
     */
    public BlockChain(){
        this(new Block<E>());
    }

    /**
     * Constructs a blockchain.
     * @param block Specififed genesis block.
     */
    public BlockChain(Block<E> block){
        this.genesisBlock = block;
        this.last = block;
        blocks.add(block);
    }

    /**
     * @return genesis block.
     */
    public Block<E> getGenesisBlock(){
        return genesisBlock;
    }

    /**
     * Adds a new block to the end of the blockchain.
     * @param transactions Transaction of new block.
     * @return true if the addition is successful, false otherwise.
     * @throws IllegalArgumentException
     */
    public boolean add(E[] transactions) throws IllegalArgumentException{
        try{
            Block<E> add = new Block<E>(last.getBlockHash(), transactions);
            last = add;
            blocks.add(add);
            return true;
        }
        catch (IllegalArgumentException ex){
            return false;
        }
        
    }

    /**
     * For testing purposes only
     * will be updated in the future.
     */
    public String toString(){
        String str = "";
        for (Block<E>  b : blocks){
            str += b.toString() + ", ";
        }
        return str;
    }
}