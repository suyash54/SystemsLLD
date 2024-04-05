package InterpreterDesignPattern;

   public class Client{
        public static void main(String[] args){

                Context context = new Context();
                context.put("a",2);
                context.put("b",4);
                context.put("c",8);
                context.put("d",10);

                AbstractExpression expression = new BinaryNonTerminalExpression(
                        new BinaryNonTerminalExpression(
                                new NumberTerminalExpression("a"),new NumberTerminalExpression("b"),'*'),
                                new BinaryNonTerminalExpression(
                                        new NumberTerminalExpression("c"),new NumberTerminalExpression("d"),'*'),'+'
                );

                System.out.println(expression.interpret(context));
        }
   }