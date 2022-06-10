import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Viewer {

    private JTextField textField;

    public Viewer() {
        Controller controller = new Controller(this);

        Font font = new Font("Arial", Font.PLAIN, 30);

        int widthGeneral = 90;
        int heightGeneral = 75;
        int stepGeneral = 5;

        int xTextField = 10;
        int yTextField = 10;
        int widthTextField = 375;
        int heightTextField = 80;
        textField = new JTextField();
        textField.setBounds(xTextField, yTextField, widthTextField, heightTextField);
        textField.setFont(new Font("Arial", Font.BOLD, 25));

        int xButtonCE = xTextField;
        int yButtonCE = yTextField + heightTextField + stepGeneral;
        JButton buttonCE = new JButton("CE");
        buttonCE.setBounds(xButtonCE, yButtonCE, widthGeneral, heightGeneral);
        buttonCE.setFont(font);
        buttonCE.addActionListener(controller);
        buttonCE.setActionCommand("Сlear");


        int xButtonOneDivX = xButtonCE + widthGeneral + stepGeneral;
        int yButtonOneDivX = yButtonCE;
        JButton buttonOneDivX = new JButton("1/x");
        buttonOneDivX.setBounds(xButtonOneDivX, yButtonOneDivX, widthGeneral, heightGeneral);
        buttonOneDivX.setFont(font);
        buttonOneDivX.addActionListener(controller);
        buttonOneDivX.setActionCommand("OneDivX");


        int xButtonSqrt = xButtonOneDivX + widthGeneral + stepGeneral;
        int yButtonSqrt = yButtonCE;
        JButton buttonSqrt = new JButton("\u221A");
        buttonSqrt.setBounds(xButtonSqrt, yButtonSqrt, widthGeneral, heightGeneral);
        buttonSqrt.setFont(font);
        buttonSqrt.addActionListener(controller);
        buttonSqrt.setActionCommand("Sqrt");


        int xButtonBackspace = xButtonSqrt + widthGeneral + stepGeneral;
        int yButtonBackspace = yButtonCE;
        JButton buttonBackspace = new JButton("\u25C4"); //\uF0E7  232b    \u25C4
        buttonBackspace.setBounds(xButtonBackspace, yButtonBackspace, widthGeneral, heightGeneral);
        buttonBackspace.setFont(font);
        buttonBackspace.addActionListener(controller);
        buttonBackspace.setActionCommand("BackSpace");


        int xButtonPlusMinus = xTextField;
        int yButtonPlusMinus = yButtonCE + heightGeneral + stepGeneral;
        JButton buttonPlusMinus = new JButton("\u00B1"); //+-
        buttonPlusMinus.setBounds(xButtonPlusMinus, yButtonPlusMinus, widthGeneral, heightGeneral);
        buttonPlusMinus.setFont(font);
        buttonPlusMinus.addActionListener(controller);
        buttonPlusMinus.setActionCommand("PlusMinus");


        int xButtonPercent = xButtonPlusMinus + widthGeneral + stepGeneral;
        int yButtonPercent = yButtonPlusMinus;
        JButton buttonPercent = new JButton("%");
        buttonPercent.setBounds(xButtonPercent, yButtonPercent, widthGeneral, heightGeneral);
        buttonPercent.setFont(font);
        buttonPercent.addActionListener(controller);
        buttonPercent.setActionCommand("Percent");


        int xButtonMultiply = xButtonPercent + widthGeneral + stepGeneral;
        int yButtonMultiply = yButtonPlusMinus;
        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(xButtonMultiply, yButtonMultiply, widthGeneral, heightGeneral);
        buttonMultiply.setFont(font);
        buttonMultiply.addActionListener(controller);
        buttonMultiply.setActionCommand("Multiply");


        int xButtonDivision = xButtonMultiply + widthGeneral + stepGeneral;
        int yButtonDivision = yButtonPlusMinus;
        JButton buttonDivision = new JButton("\u00F7");
        buttonDivision.setBounds(xButtonDivision, yButtonDivision, widthGeneral, heightGeneral);
        buttonDivision.setFont(font);
        buttonDivision.addActionListener(controller);
        buttonDivision.setActionCommand("Division");


        int xButtonSeven = xTextField;
        int yButtonSeven = yButtonPlusMinus + heightGeneral + stepGeneral;
        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(xButtonSeven, yButtonSeven, widthGeneral, heightGeneral);
        buttonSeven.setFont(font);
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("Seven");

        int xButtonEight = xButtonSeven + widthGeneral + stepGeneral;
        int yButtonEight = yButtonSeven;
        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(xButtonEight, yButtonEight, widthGeneral, heightGeneral);
        buttonEight.setFont(font);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("Eight");

        int xButtonNine = xButtonEight + widthGeneral + stepGeneral;
        int yButtonNine = yButtonSeven;
        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(xButtonNine, yButtonNine, widthGeneral, heightGeneral);
        buttonNine.setFont(font);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("Nine");


        int xButtonPlus = xButtonNine + widthGeneral + stepGeneral;
        int yButtonPlus = yButtonSeven;
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(xButtonPlus, yButtonPlus, widthGeneral, heightGeneral);
        buttonPlus.setFont(font);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("Plus");


        int xButtonFour = xTextField;
        int yButtonFour = yButtonSeven + heightGeneral + stepGeneral;
        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(xButtonFour, yButtonFour, widthGeneral, heightGeneral);
        buttonFour.setFont(font);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("Four");


        int xButtonFive = xButtonFour + widthGeneral + stepGeneral;
        int yButtonFive = yButtonFour;
        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(xButtonFive, yButtonFive, widthGeneral, heightGeneral);
        buttonFive.setFont(font);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("Five");


        int xButtonSix = xButtonFive + widthGeneral + stepGeneral;
        int yButtonSix = yButtonFour;
        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(xButtonSix, yButtonSix, widthGeneral, heightGeneral);
        buttonSix.setFont(font);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("Six");


        int xButtonMinus = xButtonSix + widthGeneral + stepGeneral;
        int yButtonMinus = yButtonFour;
        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(xButtonMinus, yButtonMinus, widthGeneral, heightGeneral);
        buttonMinus.setFont(font);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("Minus");


        int xButtonOne = xTextField;
        int yButtonOne = yButtonFour + heightGeneral + stepGeneral;
        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(xButtonOne, yButtonOne, widthGeneral, heightGeneral);
        buttonOne.setFont(font);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");

        int xButtonTwo = xButtonOne + widthGeneral + stepGeneral;
        int yButtonTwo = yButtonOne;
        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(xButtonTwo, yButtonTwo, widthGeneral, heightGeneral);
        buttonTwo.setFont(font);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("Two");


        int xButtonThree = xButtonTwo + widthGeneral + stepGeneral;
        int yButtonThree = yButtonOne;
        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(xButtonThree, yButtonThree, widthGeneral, heightGeneral);
        buttonThree.setFont(font);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("Three");

        int xButtonEqual = xButtonThree + widthGeneral + stepGeneral;
        int yButtonEqual = yButtonOne;
        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(xButtonEqual, yButtonEqual, widthGeneral, 2 * heightGeneral + stepGeneral);
        buttonEqual.setFont(font);
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("Equal");


        int xButtonZero = xTextField;
        int yButtonZero = yButtonOne + heightGeneral + stepGeneral;
        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(xButtonZero, yButtonZero, 2 * widthGeneral + stepGeneral, heightGeneral);
        buttonZero.setFont(font);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("Zero");

        int xButtonPoint = xButtonZero + (2 * widthGeneral + stepGeneral) + stepGeneral;
        int yButtonPoint = yButtonZero;
        JButton buttonPoint = new JButton(".");
        buttonPoint.setBounds(xButtonPoint, yButtonPoint, widthGeneral, heightGeneral);
        buttonPoint.setFont(font);
        buttonPoint.addActionListener(controller);
        buttonPoint.setActionCommand("Point");


        JFrame frame = new JFrame("Calculator MVC");
        frame.setSize(415, 635);
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(textField);
        frame.add(buttonCE);
        frame.add(buttonOneDivX);
        frame.add(buttonSqrt);
        frame.add(buttonBackspace);
        frame.add(buttonPlusMinus);
        frame.add(buttonPercent);
        frame.add(buttonMultiply);
        frame.add(buttonDivision);
        frame.add(buttonPoint);
        frame.add(buttonEqual);
        frame.add(buttonZero);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonSeven);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(buttonPlus);
        frame.add(buttonMinus);
        frame.setVisible(true);
    }

    public void update(String text) {
        textField.setText(text);
    }
}
