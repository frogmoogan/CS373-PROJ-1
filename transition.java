public class transition {
    int fromState;
    char readSymbol; 
    char popSymbol;
    int toState;
    String pushSymbol;

    //constructor//
    public transition(int fromState, char readSymbol, char popSymbol, 
                      int toState, String pushSymbol) {
        this.fromState = fromState;
        this.readSymbol = readSymbol;
        this.popSymbol = popSymbol;
        this.toState = toState;
        this.pushSymbol = pushSymbol;
    }

    //print func to be used for easier debugging//
    @Override
    public String toString() {
        return "(" + fromState + ", " + readSymbol + ", " + popSymbol + 
           ") -> (" + toState + ", " + pushSymbol + ")";

    }

}
