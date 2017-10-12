package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField usuario;
    public TextField password;
    public Button btnsesion;
    public Text alerta;
    public int intentos=0;

    public void inicio(ActionEvent actionEvent) {
        if (usuario.getText().isEmpty() || password.getText().isEmpty()) {
            alerta.setText("Introduzca los valores correctos");
        }
        if (usuario.getText().equals("admin") && password.getText().equals("123456")) {
            alerta.setText("FELICIDADES INGRESO CORRECTAMENTE TIENE 20%");
        }
        if (!(usuario.getText().equals("admin")) || !(password.getText().equals("123456"))) {
            intentos=intentos+1;
            if (intentos>=3) {
                alerta.setText("Usted ha superado el limite de Intentos");
                 btnsesion.disabledProperty();
            }
        }
    }
}

