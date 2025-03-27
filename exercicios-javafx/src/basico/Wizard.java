package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Wizard extends Application{
	
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
	}
	
	private void criarPasso1() {
		Button proximoPasso = new Button("Ir p/ Passo 2 >>");
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);
		});
		
		Label titulo = new Label("Passo 1");
		
		HBox box2 = new HBox();
		box2.setAlignment(Pos.CENTER);
		box2.setSpacing(20);
		box2.getChildren().add(proximoPasso);
		
		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(30);
		box.getChildren().add(titulo);
		box.getChildren().add(box2);
		
		passo1 = new Scene(box, 400, 400);
	}
	
	private void criarPasso2() {
		Button passoAnterior = new Button("<< Voltar p/ Passo 1");
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo1);
		});
		Button proximoPasso = new Button("Ir p/ Passo 3 >>");
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo3);
		});
		
		Label titulo = new Label("Passo 2");
		
		HBox box2 = new HBox();
		box2.setAlignment(Pos.CENTER);
		box2.setSpacing(20);
		box2.getChildren().add(passoAnterior);
		box2.getChildren().add(proximoPasso);
		
		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(30);
		box.getChildren().add(titulo);
		box.getChildren().add(box2);
		
		passo2 = new Scene(box, 400, 400);
	}
	
	private void criarPasso3() {
		Button passoAnterior = new Button("<< Voltar p/ Passo 2");
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo2);
		});
		
		Label titulo = new Label("Passo 3");
		
		HBox box2 = new HBox();
		box2.setSpacing(20);
		box2.setAlignment(Pos.CENTER);
		box2.getChildren().add(passoAnterior);
		
		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(30);
		box.getChildren().add(titulo);
		box.getChildren().add(box2);
		
		passo3 = new Scene(box, 400, 400);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
