package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField emailField;
	
	@FXML
	private PasswordField senhaField;
	
	public void entrar() {
		boolean emailValido = emailField.getText().equals("aluno@cod3r.com.br");
		boolean senhaValida = senhaField.getText().equals("12345678");
		
		if(emailValido && senhaValida) {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Sucesso")
			.showInformation();
		} else {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Falha")
			.showError();
		}
	}
}
