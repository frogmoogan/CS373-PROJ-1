public class configuration {
    int state;
    String remainingInput;
    String stack;

    public configuration(int state, String remainingInput, String stack) {
        this.state = state;
        this.remainingInput = remainingInput;
        this.stack = stack;
    }
    
    //print func to be used for easier debugging//
    @Override
    public String toString() {
        //change this later 
        return "(" + state + ": " + remainingInput + " " + stack + ")";
    } 
    
    @Override
    public boolean equals(Object o) { 
        //change this later
        return true;
    }

    @Override
    public int hashCode() { 
        //change this later
        return 0;

     }

    

}
