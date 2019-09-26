package filesystem;

/**
 * FSElement represents an element in a File System.<BR/>
 * Such element can be a File or a Directory
 */
public interface FSElement {
	/**
	 * @return the name of the element
	 */
	public String getName();

	/**
	 * @return the size of the element:<BR/>
	 * <UL>
	 * <LI>For files, the method is expected to return the size of the file</LI> 
	 * <LI>For directories, the method is expected to return the total size of all files in the directory and in its sub-directories</LI>
	 * </UL> 
	 */
	public int getSize(); 
}
