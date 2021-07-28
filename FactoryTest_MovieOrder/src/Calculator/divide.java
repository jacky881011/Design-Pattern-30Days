package Calculator;

public class divide implements FunctionSelect {
    @Override
    public int inputVariable(int a, int b){
        int ans = a/b;

        return ans;
    }
}
