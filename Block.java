import java.util.Arrays;

/**
 * Constructs a block containing specified type,
 * Used to create blocks in the BlockChain.
 * No parameter argument contains null.
 * @author Neil Hommes
 * @version 0.0.1 - 2/27/2022
 */
public class Block<E>{

    private int prevHash;
    private E[] transaction;
    private int hash;

    /**
     * Constructs a basic block with transaction null.
     * Mainly used for testing purposes.
     */
    public Block(){
        this(0, null); //fix this, what is usually stored in genesis block?
    }
    
    /**
     * Constructs a genesis block with specified transaction.
     * @param transation Transaction to store.
     */
    public Block(E[] transation){
        this(0, transation);
    }

    /**
     * Constructs a block with specified transaction. 
     * Block not intended to be genesis block.
     * @param previousHash Hash of the previous block.
     * @param transation Transaction to store.
     */
    public Block(int previousHash, E[] transation){
        this.prevHash = previousHash;
        this.transaction = transation;

        Object[] contens = {Arrays.hashCode(transation), previousHash};
        this.hash = Arrays.hashCode(contens);
    }

    /**
     * @return hash of previous block.
     */
    public int getPreviousHash(){
        return prevHash;
    }

    /**
     * @return stored transaction.
     */
    public E[] getTransaction(){
        return transaction;
    }
    
    /**
     * @return block hash.
     */
    public int getBlockHash(){
        return hash;
    }




    
    /**
     * For testing purposes
     * Will be updated once transactions are specified
     */
    public String toString(){
        String str = "[";
        for (E string : transaction){
            str += string + ", ";
        }
        return prevHash + " " + str + "] " + hash;
    }
}
