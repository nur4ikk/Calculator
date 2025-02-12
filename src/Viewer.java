import javax.swing.*;
import java.awt.*;


public class Viewer {

    private JTextField textField;
    public Viewer() {

        Controller controller = new Controller(this);

        Font fontForTextField = new Font("Inter", Font.PLAIN, 50);

        Font fontForButtons = new Font("Inter", Font.TRUETYPE_FONT, 20);

        Color colorForButtons = (new Color(255, 159, 10));

        Color colorForDigitsButtons = (new Color(99, 98, 99));




        textField = new JTextField("0");
        textField.setBounds(0,0,400,90);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(fontForTextField);
        textField.setBackground(new Color(119, 118, 119));
        textField.setOpaque(true);
        textField.setBorder(BorderFactory.createLineBorder(new Color(119, 118, 119)));
        textField.setForeground(Color.WHITE);

        int x = 18;
        int y = 100;
        int width = 70;
        int height = 68;
        int offset = 4;
        int startY = y;
        int startX = x;


        JButton[] arrayButtons = new JButton[23];
        int index = 0;


        // 5th Row of Buttons
        JButton buttonLeftArrow = new JButton("←");
        buttonLeftArrow.setBounds(x,y,width,height);
        buttonLeftArrow.addActionListener(controller);
        buttonLeftArrow.setActionCommand("LeftArrow");
        buttonLeftArrow.setFont(fontForButtons);
        buttonLeftArrow.setBackground(colorForButtons);
        buttonLeftArrow.setOpaque(true);
        buttonLeftArrow.setBorderPainted(false);
        arrayButtons[index++] = buttonLeftArrow;

        x = x + width + offset;
        y = startY;

        JButton buttonCE = new JButton("CE");
        buttonCE.setBounds(x,y,width,height);
        buttonCE.addActionListener(controller);
        buttonCE.setActionCommand("CE");
        buttonCE.setFont(fontForButtons);
        buttonCE.setBackground(colorForButtons);
        buttonCE.setOpaque(true);
        buttonCE.setBorderPainted(false);
        arrayButtons[index++] = buttonCE;

        x = x + width + offset;
        y = startY;

        JButton buttonC = new JButton("C");
        buttonC.setBounds(x,y,width,height);
        buttonC.addActionListener(controller);
        buttonC.setActionCommand("C");
        buttonC.setFont(fontForButtons);
        buttonC.setBackground(colorForButtons);
        buttonC.setOpaque(true);
        buttonC.setBorderPainted(false);
        arrayButtons[index++] = buttonC;
        x = x + width + offset;
        y = startY;


        JButton buttonPlusMinus = new JButton("+-");
        buttonPlusMinus.setBounds(x,y,width,height);
        buttonPlusMinus.addActionListener(controller);
        buttonPlusMinus.setActionCommand("PlusMinus");
        buttonPlusMinus.setFont(new Font("Inter", Font.TRUETYPE_FONT, 18));
        buttonPlusMinus.setBackground(colorForButtons);
        buttonPlusMinus.setOpaque(true);
        buttonPlusMinus.setBorderPainted(false);
        arrayButtons[index++] = buttonPlusMinus;

        x = x + width + offset;
        y = startY;

        JButton buttonSqrRoot = new JButton("√");
        buttonSqrRoot.setBounds(x,y,width,height);
        buttonSqrRoot.addActionListener(controller);
        buttonSqrRoot.setActionCommand("SqrRoot");
        buttonSqrRoot.setFont(fontForButtons);
        buttonSqrRoot.setBackground(colorForButtons);
        buttonSqrRoot.setOpaque(true);
        buttonSqrRoot.setBorderPainted(false);
        arrayButtons[index++] = buttonSqrRoot;

        startY = startY + 70;
        x = startX;
        y = startY;

        // 4th Row of Buttons

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(x,y,width,height);
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("Seven");
        buttonSeven.setFont(fontForButtons);
        buttonSeven.setBackground(colorForDigitsButtons);
        buttonSeven.setOpaque(true);
        buttonSeven.setBorderPainted(false);

        arrayButtons[index++] = buttonSeven;
        x = x + width + offset;
        y = startY;

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(x,y,width,height);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("Eight");
        buttonEight.setFont(fontForButtons);
        buttonEight.setBackground(colorForDigitsButtons);
        buttonEight.setOpaque(true);
        buttonEight.setBorderPainted(false);
        arrayButtons[index++] = buttonEight;
        x = x + width + offset;
        y = startY;

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(x,y,width,height);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("Nine");
        buttonNine.setFont(fontForButtons);
        buttonNine.setBackground(colorForDigitsButtons);
        buttonNine.setOpaque(true);
        buttonNine.setBorderPainted(false);
        arrayButtons[index++] = buttonNine;
        x = x + width + offset;
        y = startY;

        JButton buttonDivision = new JButton("/");
        buttonDivision.setBounds(x,y,width,height);
        buttonDivision.addActionListener(controller);
        buttonDivision.setActionCommand("Division");
        buttonDivision.setFont(fontForButtons);
        buttonDivision.setBackground(colorForButtons);
        buttonDivision.setOpaque(true);
        buttonDivision.setBorderPainted(false);
        arrayButtons[index++] = buttonDivision;
        x = x + width + offset;
        y = startY;

        JButton buttonPercent = new JButton("%");
        buttonPercent.setBounds(x,y,width,height);
        buttonPercent.addActionListener(controller);
        buttonPercent.setActionCommand("Modulo");
        buttonPercent.setFont(fontForButtons);
        buttonPercent.setBackground(colorForButtons);
        buttonPercent.setOpaque(true);
        buttonPercent.setBorderPainted(false);
        arrayButtons[index++] = buttonPercent;
        startY = startY + 70;
        x = startX;
        y = startY;


        // 3rd Row of Buttons
        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(x,y,width,height);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("Four");
        buttonFour.setFont(fontForButtons);
        buttonFour.setBackground(colorForDigitsButtons);
        buttonFour.setOpaque(true);
        buttonFour.setBorderPainted(false);
        arrayButtons[index++] = buttonFour;
        x = x + width + offset;
        y = startY;

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(x,y,width,height);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("Five");
        buttonFive.setFont(fontForButtons);
        buttonFive.setBackground(colorForDigitsButtons);
        buttonFive.setOpaque(true);
        buttonFive.setBorderPainted(false);
        arrayButtons[index++] = buttonFive;
        x = x + width + offset;
        y = startY;

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(x,y,width,height);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("Six");
        buttonSix.setFont(fontForButtons);
        buttonSix.setBackground(colorForDigitsButtons);
        buttonSix.setOpaque(true);
        buttonSix.setBorderPainted(false);
        arrayButtons[index++] = buttonSix;
        x = x + width + offset;
        y = startY;

        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.setBounds(x,y,width,height);
        buttonMultiplication.addActionListener(controller);
        buttonMultiplication.setActionCommand("Multiplication");
        buttonMultiplication.setFont(fontForButtons);
        buttonMultiplication.setBackground(colorForButtons);
        buttonMultiplication.setOpaque(true);
        buttonMultiplication.setBorderPainted(false);
        arrayButtons[index++] = buttonMultiplication;
        x = x + width + offset;
        y = startY;

        JButton buttonDivideX = new JButton("1/x");
        buttonDivideX.setBounds(x,y,width,height);
        buttonDivideX.addActionListener(controller);
        buttonDivideX.setActionCommand("DivideX");
        buttonDivideX.setFont(new Font("Inter", Font.TRUETYPE_FONT, 15));
        buttonDivideX.setBackground(colorForButtons);
        buttonDivideX.setOpaque(true);
        buttonDivideX.setBorderPainted(false);
        arrayButtons[index++] = buttonDivideX;
        startY = startY + 70;
        x = startX;
        y = startY;


        // 2nd Row of Buttons

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(x,y,width,height);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");
        buttonOne.setFont(fontForButtons);
        buttonOne.setBackground(colorForDigitsButtons);
        buttonOne.setOpaque(true);
        buttonOne.setBorderPainted(false);
        arrayButtons[index++] = buttonOne;
        x = x + width + offset;
        y = startY;

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(x,y,width,height);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("Two");
        buttonTwo.setFont(fontForButtons);
        buttonTwo.setBackground(colorForDigitsButtons);
        buttonTwo.setOpaque(true);
        buttonTwo.setBorderPainted(false);
        arrayButtons[index++] = buttonTwo;
        x = x + width + offset;
        y = startY;

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(x,y,width,height);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("Three");
        buttonThree.setFont(fontForButtons);
        buttonThree.setBackground(colorForDigitsButtons);
        buttonThree.setOpaque(true);
        buttonThree.setBorderPainted(false);
        arrayButtons[index++] = buttonThree;
        x = x + width + offset;
        y = startY;

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(x, y, width, height);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("Minus");
        buttonMinus.setFont(fontForButtons);
        buttonMinus.setBackground(colorForButtons);
        buttonMinus.setOpaque(true);
        buttonMinus.setBorderPainted(false);
        arrayButtons[index++] = buttonMinus;

        x = x + width + offset;
        y = startY;

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(x,y,width,height * 2 );
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("Equal");
        buttonEqual.setFont(fontForButtons);
        buttonEqual.setBackground(colorForButtons);
        buttonEqual.setOpaque(true);
        buttonEqual.setBorderPainted(false);
        arrayButtons[index++] = buttonEqual;
        startY = startY + 70;
        x = startX;
        y = startY;

        // 1st row of Buttons
        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(x,y,width * 2 + offset,height);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("Zero");
        buttonZero.setFont(fontForButtons);
        buttonZero.setBackground(colorForDigitsButtons);
        buttonZero.setOpaque(true);
        buttonZero.setBorderPainted(false);
        arrayButtons[index++] = buttonZero;
        x = x + (width * 2) + (offset * 2);
        y = startY;


        JButton buttonComma = new JButton(",");
        buttonComma.setBounds(x,y,width,height);
        buttonComma.addActionListener(controller);
        buttonComma.setActionCommand("Comma");
        buttonComma.setFont(fontForButtons);
        buttonComma.setBackground(colorForDigitsButtons);
        buttonComma.setOpaque(true);
        buttonComma.setBorderPainted(false);
        arrayButtons[index++] = buttonComma;
        x = x + width + offset;
        y = startY;

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(x,y,width,height);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("Plus");
        buttonPlus.setFont(fontForButtons);
        buttonPlus.setBackground(colorForButtons);
        buttonPlus.setOpaque(true);
        buttonPlus.setBorderPainted(false);
        arrayButtons[index++] = buttonPlus;
        x = x + width + offset;
        y = startY;




        JFrame frame = new JFrame("Calculator MVC Pattern");
        frame.setSize(400, 500);
        frame.setLocation(500,190);
        frame.getContentPane().setBackground(new Color(119, 118, 119));
        frame.add(textField);
        for(int i = 0; i < arrayButtons.length; i++) {
            JButton element  = arrayButtons[i];
            if(element != null) {
                frame.add(element);
            }

        }


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);


        for(JButton button : arrayButtons) {
            if(button != null) {
                button.setForeground(Color.WHITE);
            }
        }

    }

    public void update (String text){
        textField.setText(text);
    }
}
