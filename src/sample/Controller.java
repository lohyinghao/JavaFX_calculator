package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller {

    calculatorLogic calculatorLogic = new calculatorLogic();
    private boolean input = true;
    private boolean operadActivated = false;


    public void inputNumber(String number) {
        if (calculatorField.getText().length() == 9) {
            return;
        }
        double fieldNumber = Double.parseDouble(calculatorField.getText());
        if (calculatorField.getText().contains(".") && !input) {
            calculatorField.appendText(number);
        } else if (input || fieldNumber == 0) {
            calculatorField.setText(number);
            input = false;
        } else {
            calculatorField.appendText(number);
        }

    }

    public void inputDot() {
        if (calculatorField.getText().length() == 9) {
            return;
        }
        double fieldNumber = Double.parseDouble(calculatorField.getText());
        if (input || fieldNumber == 0) { //set 0 to 0.
            calculatorField.setText("0.");
        } else if (!input && !(calculatorField.getText().contains("."))) { //set X to X.
            calculatorField.appendText(".");
        }
        input = false;
    }

    @FXML
    private Pane mainPanel;

    public TextField calculatorField;

    public void initialize() {
        calculatorField.setText("0");
        calculatorField.setEditable(false);
    }


    public void buttonOne() {
        inputNumber("1");
    }

    public void buttonTwo() {
        inputNumber("2");
    }

    public void buttonThree() {
        inputNumber("3");
    }

    public void buttonFour() {
        inputNumber("4");
    }

    public void buttonFive() {
        inputNumber("5");
    }

    public void buttonSix() {
        inputNumber("6");
    }

    public void buttonSeven() {
        inputNumber("7");
    }

    public void buttonEight() {
        inputNumber("8");
    }

    public void buttonNine() {
        inputNumber("9");
    }

    public void buttonZero() {
        inputNumber("0");
    }

    public void buttonDot() {
        inputDot();
    }

    public void buttonPlus() {
        System.out.println("Plus");
        if (!input) {
            buttonEqual();
        }
        calculatorLogic.setOperation('+', Double.parseDouble(calculatorField.getText()));
        input = true;
        operadActivated = true;
    }

    public void buttonMinus() {
        System.out.println("Minus");
        if (!input) {
            buttonEqual();
        }
        calculatorLogic.setOperation('-', Double.parseDouble(calculatorField.getText()));
        input = true;
        operadActivated = true;
    }

    public void buttonMultiply() {
        System.out.println("Multiply");
        if (!input) {
            buttonEqual();
        }
        calculatorLogic.setOperation('*', Double.parseDouble(calculatorField.getText()));
        input = true;
        operadActivated = true;
    }

    public void buttonDivide() {
        System.out.println("Divide");
        if (!input) {
            buttonEqual();
        }
        calculatorLogic.setOperation('/', Double.parseDouble(calculatorField.getText()));
        input = true;
        operadActivated = true;
    }

    public void buttonEqual() {
        if (operadActivated) {
            System.out.println("Equal");
            calculatorLogic.calculate(Double.parseDouble(calculatorField.getText()));
            String truncatedInt = SignificantFigures.getSignificant(calculatorLogic.getMemoryVar(), 9);
            calculatorField.setText(truncatedInt);
            input = true;
            operadActivated = false;
        }
    }

    public void buttonClear() {
        System.out.println("Clear");
        calculatorField.setText("0");
        calculatorLogic.setMemoryVar(0);
        calculatorLogic.setOperation('+', 0);
        input = true;
        operadActivated = false;
    }
}
