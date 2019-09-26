package filesystem;

/**
 * NumberFile defines a File with <B>Long</B> content
 */
public class NumberFile extends File<Long> {
	private final int LONG_BYTE_SIZE = 8;
	
	public NumberFile() {
		super();
	}
	
	public NumberFile(String name, Long content) {
		super(name, content);
	}
	
	/**
	 * @return the number bytes in a java long type, event if there is no content
	 */
	@Override
	public int getSize() {
		return LONG_BYTE_SIZE;
	}
	
	/**
	 * @return the a String containing the content in the file, or null if there is no content
	 */
	@Override
	public String toString() {
		try {
			return ""+this.getContent();
		} catch (Exception e) {
			return null;
		}
	}
}
