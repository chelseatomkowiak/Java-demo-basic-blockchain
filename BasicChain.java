public class BasicChain {

	public static void main(String[] args) {
		
		Block genesisBlock = new Block("Anna transferred 3 bitcoin to Sherri.", "0");
		System.out.println("Hash for block 1: " + genesisBlock.hash);
		
		Block secondBlock = new Block("Kyle transferred 5 Ether to Amber.",genesisBlock.hash);
		System.out.println("Hash for block 2: " + secondBlock.hash);
		
		Block thirdBlock = new Block("Amber refunded 1 Ether to Kyle.",secondBlock.hash);
		System.out.println("Hash for block 3: " + thirdBlock.hash);
		
	}
}