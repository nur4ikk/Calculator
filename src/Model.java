public class Model {


    private Viewer viewer;
    private String temp;
    private String leftValue;
    private String rightValue;
    private char action;


    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
        rightValue = "";
        leftValue = "";
        action = '@';

    }


    public void doAction(String command) {

        if(command.equals("One")) {
            temp = temp + "1";
        }else if(command.equals("Two")) {
            temp = temp + "2";
        }else if(command.equals("Three")) {
            temp = temp + "3";
        } else if (command.equals("Four")) {
            temp = temp + "4";
        } else if (command.equals("Five")) {
            temp = temp + "5";
        } else if (command.equals("Six")) {
            temp = temp + "6";
        } else if (command.equals("Seven")) {
            temp = temp + "7";
        } else if (command.equals("Eight")) {
            temp = temp + "8";
        } else if (command.equals("Nine")) {
            temp = temp + "9";
        } else if (command.equals("CE")) {
            temp = "";
            rightValue = "";
            leftValue = "";
            action = '@';

        } else if (command.equals("Plus")) {
            leftValue = temp;
            temp = "";
            action = '+';
            return;
        } else if (command.equals("Minus")) {
            leftValue = temp;
            temp = "";
            action = '-';
            return;

        } else if (command.equals("Multiplication")) {
            leftValue = temp;
            temp = "";
            action = '*';
            return;

        } else if (command.equals("DivideX")) {
            if(!temp.isEmpty()) {
                double result = Double.parseDouble(temp);
                result = 1.0 / result;
                temp = "" + result;
                temp = castDouble(temp);
            }
        } else if (command.equals("LeftArrow")) {
            if(!temp.isEmpty()) {
                temp = temp.substring(0, temp.length() - 1);
            }
        } else if(command.equals("SqrRoot")) {
            if(!temp.isEmpty()) {
                double sqrRoot = Double.parseDouble(temp);
                double sqrResult = Math.sqrt(sqrRoot);
                temp = "" + sqrResult;
                temp = castDouble(temp);
            }

        } else if (command.equals("Division")) {
            leftValue = temp;
            temp ="";
            action = '/';
            return;
        } else if (command.equals("Zero")) {
            temp = temp + "0";
        } else if (command.equals("Comma")) {
            if (temp.isEmpty()) {
                temp = "0.";
            } else if (!temp.contains(".")) {
                temp = temp + ".";
            }
        }  else if (command.equals("Modulo")) {
            if(!temp.isEmpty()) {
                double resultModulo = Double.parseDouble(temp);
                resultModulo = resultModulo / 100;
                temp = "" + resultModulo;
                temp = castDouble(temp);
            }

        }  else if (command.equals("PlusMinus")) {
            if(!temp.isEmpty()) {
                if(!(temp.charAt(0) == '-')){
                    temp = "-" + temp;
                    
                } else {
                    temp = temp.substring(1, temp.length());
                }

            }

        } else if (command.equals("Equal")) {
            if(!rightValue.isEmpty()){
                leftValue = temp;
            } else {
                rightValue = temp;
            }

             double leftIntValue = Double.parseDouble(leftValue);
             double rightIntValue = Double.parseDouble(rightValue);

            double answer = 0.0;

            switch(action){
                case '+':
                    answer = leftIntValue + rightIntValue;
                 break;

                case '-':
                    answer = leftIntValue - rightIntValue;
                    break;

                case '*':
                    answer = leftIntValue * rightIntValue;
                    break;

                case '/':
                    answer = leftIntValue / rightIntValue;
                    break;

            }

            temp = "" + answer;
            temp = castDouble(temp);
            leftValue = temp;



            leftValue = temp;
            System.out.println(leftValue + " " + action + " " + rightValue);
        }
        viewer.update(temp);

    }
    private String castDouble(String value){
        char comma = temp.charAt(value.length() - 2);
        char zero = temp.charAt(value.length() - 1);

        if (comma == '.' && zero == '0'){
            value = value.substring(0, value.length() - 2);
        }
        return value;

    }
}
