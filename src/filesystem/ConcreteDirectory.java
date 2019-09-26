package filesystem;

import java.util.ArrayList;

/**
 * ConcreteDirectory implements the interface Directory.
 * 
 * @see Directory
 */
public class ConcreteDirectory implements Directory {
	private String name;
	private int totalSize;
	private ArrayList<FSElement> list;

	public ConcreteDirectory() {
		list = new ArrayList<>();
	}

	public ConcreteDirectory(String name) {
		list = new ArrayList<>();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		totalSize = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Directory) {
				totalSize += ((ConcreteDirectory) list.get(i)).getSize();
			}
			if (list.get(i) instanceof File) {
				totalSize += ((File<?>) list.get(i)).getSize();
			}
		}
		return totalSize;
	}

	@Override
	public void add(FSElement element) {
	/*	if (element == null) {
			return;
		}*/
		list.add(element);
	}

	@Override
	public void remove(FSElement element) throws Exception {
		if(!list.contains(element)) {
			throw new Exception("invalid element");
		}
		list.remove(element);
	}

	@Override
	public int getElementsCount() {
		return list.size();
	}

	@Override
	public FSElement getByIndex(int index) throws Exception {
		if(index>=this.getElementsCount() || index < 0) {
			throw new Exception("Invalid index");
		}
		return list.get(index);
	}

	@Override
	public String toString() {
		return name+ ":" + list.toString();
	}
}
