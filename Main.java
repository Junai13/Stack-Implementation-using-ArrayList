package collecttions;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            StackArrayList stack = new StackArrayList();
            char option;
            do {
                System.out.println("___________________________________________");
                System.out.println("1 : To add data");
                System.out.println("2 : To delete data");
                System.out.println("3 : To search the elements");
                System.out.println("4 : to view the top element");
                System.out.println("5 : To know the size of the stack");
                System.out.println("6 : To know stack is empty or not");
                System.out.println("7 : Exit");
                System.out.println("___________________________________________");
                System.out.println("Enter your option");
                option = sc.next().charAt(0);                      //To store option
                switch(option)                                     // to perform a task which we choose
                {
                    case '1':
                        System.out.println("Please enter the item to be insert: ");
                        String item = sc.next();
                        stack.push(item);
                        break;
                    case '2':
                        Object del = stack.pop();
                        System.out.println("Deleted item is " + del);
                        break;
                    case '3':
                        System.out.println("Enter the element to be search");
                        String element = sc.next();
                        System.out.println("Element at the index "+stack.contain(element));
                        break;
                    case '4':
                        System.out.println(stack.peek());
                        break;
                    case '5':
                        System.out.println(stack.size());
                        break;
                    case '6':
                        System.out.println(stack.isEmpty());
                        break;
                    case '7':
                        System.out.println("Tasks are performed successfully");
                        break;
                    default:
                        System.out.println("The choice is invalid...!\n");
                        break;
                    }

                } while (option != '7');
            }
        catch (InputMismatchException e){
                System.out.println("Enter valid choice");
        }
    }
}
