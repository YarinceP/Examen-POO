package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public Button btn1;
    public TextField tforacion;
    public Text respuesta;

    public void lectura(ActionEvent actionEvent) {
        tforacion.getText();
        respuesta.setText(tforacion.getText());
    }
}
