package Modelo;

public class Queue<T> {

	private Node<T> head, tail;

	public Queue() {
		head = tail = null;
	}

	public void add(T data) {

		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(null);

		if (head == null) {
			head = node;
		} else
			tail.setNext(node);

		tail = node;
	}
	
	public T poll() {

		T data;
		Node<T> aux = head;

		head = aux.getNext();
		data = aux.getData();
		aux = null;

		return data;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	@Override
	protected void finalize() throws Throwable {

		Node<T> aux;

		while (head != null) {
			aux = head;
			head = aux.getNext();
			aux = null;
		}

		head = null;
		System.gc();
	}
}
