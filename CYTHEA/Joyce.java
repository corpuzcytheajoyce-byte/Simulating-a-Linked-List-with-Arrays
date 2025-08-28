/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joyce;

public class Joyce  {
    private int[] data;
    private int size;

    
    // Constructor
    public Joyce(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // Add to the end
    public void add(int value) {
        if (size == data.length) {
            System.out.println("List is full!");
            return;
        }
        data[size++] = value;
    }

    // Peek at the front (index 0)
    public int peek() {
        if (size == 0) {
            System.out.println("List is empty!");
            return -1;
        }
        return data[0];
    }

    // Remove from front (index 0)
    public int poll() {
        if (size == 0) {
            System.out.println("List is empty!");
            return -1;
        }
        int first = data[0];
        // Shift all elements to the left
        for (int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return first;
    }

    // Remove from end (last element)
    public int pop() {
        if (size == 0) {
            System.out.println("List is empty!");
            return -1;
        }
        return data[--size];
    }

    // Display list contents
    public void print() {
        System.out.print("List: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        Joyce list = new Joyce(10);

        list.add(10);
        list.add(20);
        list.add(30);
        list.print(); // List: 10 20 30

        System.out.println("Peek: " + list.peek()); // 10
        System.out.println("Poll: " + list.poll()); // 10
        list.print(); // List: 20 30

        System.out.println("Pop: " + list.pop()); // 30
        list.print(); // List: 20
    }
}
