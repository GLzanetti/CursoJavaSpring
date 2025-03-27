package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	
	private int contador = 0;
	
	private void trocarCor(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		} else if(contador < 0) {
			label.getStyleClass().add("vermelho");
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botao");
		botaoIncremento.setOnAction(e -> {
			contador++;
			trocarCor(labelNumero);
		});
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botao");
		botaoDecremento.setOnAction(e -> {
			contador--;
			trocarCor(labelNumero);
		});
		
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(20);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.getStyleClass().add("conteudo");
		boxPrincipal.setSpacing(30);
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		String caminhoDoCss = getClass()
				.getResource("/basico/Contador.css")
				.toExternalForm();
		Scene cenaPrincipal = new Scene(boxPrincipal, 500, 500);
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Winky+Sans");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
