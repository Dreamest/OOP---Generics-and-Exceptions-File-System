package filesystem;

/**
 * TextFile defines a File with <B>String</B> content
 */
public class TextFile extends File<String> {
	public TextFile() {
		super();
	}

	public TextFile(String name, String content) {
		super(name, content);
	}

	/**
	 * @return the number of characters in the String content, or 0 if there is no
	 *         content
	 */
	@Override
	public int getSize() {
		try {
			return this.getContent().length();
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * 
	 * @return the String in the content, or null if there is no content
	 */
	@Override
	public String toString() {
		try {
			return this.getContent();
		} catch (Exception e) {
			return null;
		}
	}
}
