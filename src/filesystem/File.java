package filesystem;

/**
 * Abstract File representing a Generic File.<BR/>
 * Every file has a name and content. The content is <B>Generic</B> and should be determined when defining files with specific generic.<BR/>
 * For instance:
 * <UL>
 * <LI>A <B>File&lt;String&gt;</B> will represent a text file with <B>String</B> content.</LI>
 * <LI>A <B>File&lt;Long&gt;</B> will represent a file with numeric content that can contain <B>Long</B> values.</LI>
 * </UL>
 * @param <T> A Generic that defines the type of the file
 */
public abstract class File<T> implements FSElement{
	private String name;
	private T content;
	/**
	 * Create a file with no name and no content
	 */
	public File () {
		// implement this constructor
		
		//do nothing??
	}

	/**
	 * Create a file with specific name and content
	 * @param name the name of the new file
	 * @param content the content of the new file
	 */
	public File (String name, T content) {
		this.name = name;
		this.content = content;
	}
	
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @return the content of the file
	 * @throws Exception if the file contains no content
	 */
	public T getContent() throws Exception {
		if(content==null) {
			throw new Exception("File content is null");
		}
		return content;
	}

	/**
	 * @param content content to be set in this file, overriding the old content, if exists
	 * @throws Exception if the content parameter is null, the method
	 */
	public void setContent (T content) throws Exception  {
		if(content==null) {
			throw new Exception("Invalid content - null.");
		}
		this.content = content;
	}

	
}
