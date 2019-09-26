package filesystem;

/**
 * Directory represents the interface of a directory in a File System<BR/>
 * Note that this interface inherits all the methods in the FSElement interface
 * @see FSElement 
 */
public interface Directory extends FSElement {
	/**
	 * This method enables adding an FSElement to the Directory.<BR/>
	 * Note that there is no limit on the number of FSElement in a Directory.
	 * @param element a File or Directory to be added to this Directory.<BR/>
	 */
	public void add (FSElement element);
	
	/**
	 * @param element a File or Directory to be added to this Directory.
	 * @throws Exception If the input element does not exist in the directory
	 */
	public void remove (FSElement element) throws Exception;
	
	/**
	 * @return the number of files and sub-directories that are <B>directly</B> stores in this directory 
	 */
	public int getElementsCount ();
	
	/**
	 * @param index - an index of internal FSElement
	 * @return the file or sub-directory in the required index
	 * @throws Exception if the index is illegal
	 */
	public FSElement getByIndex (int index) throws Exception;

}
