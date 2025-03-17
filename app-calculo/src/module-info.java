module app.calculo {
	
	exports br.com.glZanetti.app.calculo;
	requires transitive app.logging;
	
	exports br.com.glZanetti.app.calculo.interno to app.financeiro;
	
	opens br.com.glZanetti.app.calculo to app.financeiro, app.logging;
	
	requires app.api;
	provides br.com.glZanetti.app.Calculadora 
		with br.com.glZanetti.app.calculo.CalculadoraImpl;
		
}
// Transitive serve para que o modulo passe adiante para outra classe