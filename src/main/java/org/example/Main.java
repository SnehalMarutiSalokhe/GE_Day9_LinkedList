package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(70);
        list.insertAt(1, 30);
        System.out.println("LinkedList  ");
        list.display();

        System.out.println("LinkedList  after Pop Last");
        list.popLast();
        list.display();

    }
}