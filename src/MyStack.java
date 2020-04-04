import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {

        Stack<Integer> number = new Stack();
        number.push(5);
        number.push(4);
        number.push(3);
        number.push(2);
        number.push(1);
        System.out.print("Mảng ban đầu: ");
        for (Integer elements : number) {
            System.out.print(elements + "\t");
        }
        System.out.print("\nMảng sau khi đảo: ");
        while (!number.isEmpty()) {
            System.out.print(number.pop() + "\t");
        }

        String first = "Codegym";
        Stack<Character> string = new Stack<>();
        System.out.print("\nMảng ban đầu: " + first);
        for (int i = 0; i < first.length(); i++) {
            string.push(first.charAt(i));
        }
        System.out.print("\nMảng sau khi đảo: ");
        while (!string.isEmpty()) {
            System.out.print(string.pop());
        }
    }

}
