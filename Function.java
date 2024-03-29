import java.util.LinkedList;

public class Function {
    private String name ;
    private int def_vars =0;
    private int total_vars =0;
    private LinkedList<Integer> var_of_same_type ; //variables that are in the addition or substraction of a return statement and need to be of the same type
    private LinkedList<String> var_types ;
    private LinkedList<String> original_var_types ;
    private LinkedList<String> vars ;
    private String returnType;
    String variableOfReturn = "null";
    //this variable will describe if the function's return type is not fixed. 
    //if the type is not fixed then after every function call the return type will be set to unknown again.
    private Boolean isReturnUnknown; 
    
    public LinkedList<String> gettVar_types() {
        return var_types;
    }
    
    public LinkedList<Integer> getVarOfSameType () {
        return var_of_same_type ; 
    }

    public LinkedList<String> getVars() {
        return vars;
    }

    public Boolean getIsReturnUnknown()
    {
        return this.isReturnUnknown;
    }

    public void decideIfIsReturnUnknown()
    {
        //This function will be called at the end of the definition of a function to decide if it is of not fixed return type.
        //If at the end of the definition of the function the return type is still unknown then the function's type is not fixed.
        if(this.returnType.equals("UNKNOWN"))
        {
            this.isReturnUnknown = true;
        }
        else
        {
            this.isReturnUnknown = false;
        }
    }

    public void makeUnknownVarsUnknownAgain()
    {
        for(int i=0; i<var_types.size();i++)
        {
            if(!this.var_types.get(i).equals(this.original_var_types.get(i)))
            {
                this.var_types.set(i,this.original_var_types.get(i));
            }
        }
    }

    public void makeReturnTypeUnknown()
    {
        this.returnType = "UNKNOWN";
    }

    public void addVar_type(String var_type) {
        var_types.add(var_type);
    }
    public void addOriginalVar_type(String var_type) {
        original_var_types.add(var_type);
    }

    public void addVar(String var) {
        vars.add(var);
    }

    public void addVarOfSameType(Integer var) {
        var_of_same_type.add(var);
    }

    public void setDef_vars(int def_vars) {
        this.def_vars = def_vars;
    }

    public void setTotal_vars(int total_vars) {
        this.total_vars = total_vars;
    }

    public void setReturnType(String type){
        this.returnType = type;
    }

    public String getReturnType(){
        return this.returnType;
    }
    
    public int getDef_vars() {
        return def_vars;
    }
   
    public int getTotal_vars() {
        return total_vars;
    }
   
    public String getName() {
        return name;
    }


    public String getVariableOfReturn() {
        return variableOfReturn;
    }

    public void setVariableOfReturn(String variableOfReturn) {
        this.variableOfReturn = variableOfReturn;
    }
   
    Function(int dv, int tv, String name)
    {
        this.def_vars=dv;
        this.total_vars=tv;
        this.name = name;
        this.var_types = new LinkedList<String>();
        this.original_var_types = new LinkedList<String>();
        this.vars = new LinkedList<String>();
        this.var_of_same_type = new LinkedList<Integer>();
        this.returnType = "UNKNOWN";
        this.isReturnUnknown = false;
    }
    
}
