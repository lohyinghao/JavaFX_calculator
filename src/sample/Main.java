package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;


public class Main extends Application implements EventHandler<KeyEvent> {

    static Controller myControllerHandle;


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));

        Parent root = loader.load();
        myControllerHandle = loader.getController();
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Calculator");
        Scene scene = new Scene(root, 400, 400);
        scene.setOnKeyPressed(this);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @Override
    public void handle(KeyEvent event) {
        System.out.println(event.getCode());
        switch (event.getCode()) {
            case NUMPAD1:
                myControllerHandle.buttonOne();
                break;
            case NUMPAD2:
                myControllerHandle.buttonTwo();
                break;
            case NUMPAD3:
                myControllerHandle.buttonThree();
                break;
            case NUMPAD4:
                myControllerHandle.buttonFour();
                break;
            case NUMPAD5:
                myControllerHandle.buttonFive();
                break;
            case NUMPAD6:
                myControllerHandle.buttonSix();
                break;
            case NUMPAD7:
                myControllerHandle.buttonSeven();
                break;
            case NUMPAD8:
                myControllerHandle.buttonEight();
                break;
            case NUMPAD9:
                myControllerHandle.buttonNine();
                break;
            case NUMPAD0:
                myControllerHandle.buttonZero();
                break;
            case DECIMAL:
                myControllerHandle.buttonDot();
                break;
            case ADD:
                myControllerHandle.buttonPlus();
                break;
            case SUBTRACT:
                myControllerHandle.buttonMinus();
                break;
            case MULTIPLY:
                myControllerHandle.buttonMultiply();
                break;
            case DIVIDE:
                myControllerHandle.buttonDivide();
                break;
            case ENTER:
                myControllerHandle.buttonEqual();
                break;
            case ESCAPE:
                myControllerHandle.buttonClear();
                break;
            default:
                break;


        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

