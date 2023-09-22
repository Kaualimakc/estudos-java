package util;

public class Meta {

	public static final int META = 600;
	public static final double BONIFICACAO_POR_PONTO = 0.50;
	
	public static double mediaAtual(int diasTrabalhados , int quantPontosAtuais) {
		return quantPontosAtuais / diasTrabalhados;
		
	}
	public static double faltaParaMeta(int quantPontosAtuais) {
		return META - quantPontosAtuais;
	}
	public static double pontosDiarioParaMeta(int diasRestantes, double missingMeta) {
		return missingMeta / diasRestantes;
	}
	public static double bonificacaoDoMes(int quantPontosAtuais) {
		if (quantPontosAtuais >= META) {
		return quantPontosAtuais * BONIFICACAO_POR_PONTO;
		}
		else {
			return quantPontosAtuais;
		}
	}
}
