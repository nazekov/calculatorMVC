public class Model {
    private Viewer viewer;
    private String leftValue;
    private String rightValue;
    private String temp;
    private char action;

    private double answer;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
        action = '#';
        leftValue = "";
        rightValue = "";
        answer = 0.0;
    }

    public void doAction(String command) {
        if (command.equals("Сlear")) {
            temp = "";
            action = '#';
            leftValue = "";
            rightValue = "";
        } else if (command.equals("One")) {
            if (!temp.equals("0")) {
                temp = temp + "1";
            }
        } else if (command.equals("Two")) {
            if (!temp.equals("0")) {
                temp = temp + "2";
            }
        } else if (command.equals("Three")) {
            if (!temp.equals("0")) {
                temp = temp + "3";
            }
        } else if (command.equals("Four")) {
            if (!temp.equals("0")) {
                temp = temp + "4";
            }
        } else if (command.equals("Five")) {
            if (!temp.equals("0")) {
                temp = temp + "5";
            }
        } else if (command.equals("Six")) {
            if (!temp.equals("0")) {
                temp = temp + "6";
            }
        } else if (command.equals("Seven")) {
            if (!temp.equals("0")) {
                temp = temp + "7";
            }
        } else if (command.equals("Eight")) {
            if (!temp.equals("0")) {
                temp = temp + "8";
            }
        } else if (command.equals("Nine")) {
            if (!temp.equals("0")) {
                temp = temp + "9";
            }
        } else if (command.equals("Zero")) {
            if (temp.equals("") || temp.equals("0")) {
                temp = "0";
            } else {
                if (!temp.equals("0")) {
                    temp = temp + "0";
                }
            }
        } else if (command.equals("Point")) {
            if(temp.equals("")) {
                temp = "0.";
            } else {
                for (int i = 0; i < temp.length(); i++) {
                    if(temp.charAt(i) == '.') {
                        return;
                    }
                }
                temp = temp + '.';
            }
        } else if (command.equals("Multiply")) {
            leftValue = temp;
            temp = "";
            action = '*';
            return;
        } else if (command.equals("Division")) {
            leftValue = temp;
            temp = "";
            action = '/';
            return;
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
        } else if (command.equals("PlusMinus")) {
            if(temp.equals("") || temp.charAt(0) != '-') {
                String newTemp = "-" + temp;
                temp = newTemp;
            } else {
                temp = temp.substring(1);
            }
        } else if (command.equals("BackSpace")) {
            if (!temp.equals("")) {
                temp = temp.substring(0, temp.length() - 1);
            }
        } else if (command.equals("OneDivX")) {
            if (temp.equals("") || temp.equals("0")) {
                temp = "division by zero is forbidden";
            } else {
                answer = 1.0 / Double.parseDouble(temp);
                temp = "" + answer;

                char point = temp.charAt(temp.length() - 2);
                char zero = temp.charAt(temp.length() - 1);
                if (zero == '0' && point == '.') {
                    temp = temp.substring(0, temp.length() - 2);
                }
            }
        } else if (command.equals("Sqrt")) {
            answer = Math.sqrt(Double.parseDouble(temp));
            temp = "" + answer;

            char point = temp.charAt(temp.length() - 2);
            char zero = temp.charAt(temp.length() - 1);
            if (zero == '0' && point == '.') {
                temp = temp.substring(0, temp.length() - 2);
            }
        } else if(command.equals("Percent")) {
            rightValue = temp;
            double percent = Double.parseDouble(rightValue) / 100 * Double.parseDouble(leftValue);
            temp = "" + percent;

            char point = temp.charAt(temp.length() - 2);
            char zero = temp.charAt(temp.length() - 1);
            if (zero == '0' && point == '.') {
                temp = temp.substring(0, temp.length() - 2);
            }
        } else if (command.equals("Equal")) {
            rightValue = temp;
            double numberLeft = Double.parseDouble(leftValue);
            double numberRight = Double.parseDouble(rightValue);
            //double answer = 0.0;
            switch (action) {
                case '+':
                    answer = numberLeft + numberRight;
                    break;
                case '/':
                    if(numberRight != 0) {
                        answer = numberLeft / numberRight;
                    }
                    break;
                case '-':
                    answer = numberLeft - numberRight;
                    break;
                case '*':
                    answer = numberLeft * numberRight;
                    break;
                default:
            }

            if (action == '/' && numberRight == 0) {
                temp = "division by zero is forbidden";
            } else {
                temp = "" + answer;
            }

            char point = temp.charAt(temp.length() - 2);
            char zero = temp.charAt(temp.length() - 1);
            if (zero == '0' && point == '.') {
                temp = temp.substring(0, temp.length() - 2);
            }
        }

        viewer.update(temp);
    }
}
