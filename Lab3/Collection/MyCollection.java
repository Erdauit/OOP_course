package Collection;

public interface MyCollection {
	boolean add(Object o);

	boolean remove(Object o);

	boolean empty();

	int size();

	void clear();
	
	void addAll(MyCollection a);
	
	boolean contains(Object o);
	
	boolean containsAll(MyCollection a);
	
}
