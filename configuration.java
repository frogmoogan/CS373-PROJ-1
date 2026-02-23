import java.util.Stack;

public class configuration {
    int state;
    String remainingInput;
    Stack<String> stack = new Stack<>();


    public configuration(int state, String remainingInput, Stack stack) {
        this.state = state;
        this.remainingInput = remainingInput;
        this.stack = stack;
    }
    
    //print func to be used for easier debugging//
    @Override
    public String toString() {
        //change this later 
        return ( state + ": " + remainingInput );
    } 

    public boolean equals(CharSequence state, String stack) { 
        if (stack.contains(state) ){
            return true;
        }
        return false;
    }

    //not sure why we need this tbh
    //means of comparison against equals ??
    @Override
    public int hashCode() { 
        //change this later
        return 0;

     }

    

}
