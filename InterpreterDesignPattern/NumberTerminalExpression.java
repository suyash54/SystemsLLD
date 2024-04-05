package InterpreterDesignPattern;


        public class NumberTerminalExpression implements AbstractExpression{

            String stringValue;

            public NumberTerminalExpression(String stringVal){
                this.stringValue = stringVal;
            }

            public int interpret(Context context){
                return context.get(stringValue);
            }
        }