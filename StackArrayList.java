package collecttions;
import java.util.ArrayList;
import java.util.List;
public class StackArrayList<O> {
    List<O> stack = new ArrayList<>();
    public void push(O element) {
        boolean ele = stack.add(element);
        System.out.println("Item inserted");
    }
    public Object pop() {
        if (stack.isEmpty()) {
            return null;
        }
        String top = (String) stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return (Object) top;
    }
    public Object peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return (Object) stack.get(size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int contain(Object item){
        int con = stack.indexOf(item);
        return con;
    }
}