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
        return ( "state " + state + ", " + remainingInput + " stack content: " + stack );
    } 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        configuration other = (configuration) obj;

        return this.state == other.state &&
            this.remainingInput.equals(other.remainingInput) &&
            this.stack.equals(other.stack);
    }

    //not sure why we need this tbh
    //means of comparison against equals ??
    @Override
    public int hashCode() { 
        //change this later
        return 0;

     }

    

}
