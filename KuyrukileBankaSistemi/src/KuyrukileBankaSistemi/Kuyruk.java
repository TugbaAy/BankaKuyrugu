package KuyrukileBankaSistemi;

public class Kuyruk<E> {

    LinkedList<E> list = new LinkedList<>();
    int size;

    float end = System.currentTimeMillis();
    float start = System.currentTimeMillis();

    void enqueue(E data) {
        list.addLast(data);
        size++;
    }

    E dequeue() {
        if (size == 0) {
            System.out.println("The queue is empty");
        }

        Node temp = list.removeFirst();
        size--;
        return (E) temp.data;
    }


}
