package Calculator;

public class multiply implements FunctionSelect {
    @Override
    public int inputVariable(int a, int b){
        int ans = a*b;

        return ans;
    }
}
