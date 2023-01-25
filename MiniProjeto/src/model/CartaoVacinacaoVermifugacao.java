package model;
import java.time.LocalDate;
import java.util.ArrayList;

public class CartaoVacinacaoVermifugacao {
	private ArrayList<LocalDate> datasAplicacao;
	private ArrayList<LocalDate> datasReforco;
	private ArrayList<Vacina> vacinas;
	private ArrayList<Vermifugo> vermifugos;
	
	public CartaoVacinacaoVermifugacao() {
		datasAplicacao = new ArrayList<LocalDate>();
		datasReforco = new ArrayList<LocalDate>();
		vacinas = new ArrayList<Vacina>();
		vermifugos = new ArrayList<Vermifugo>();
	}
	
	public void adicionaDataAplicacao(LocalDate dataAplicacao) {
		datasAplicacao.add(dataAplicacao);
	}
	
	public ArrayList<LocalDate> mostraDatasAplicacao() {
		return datasAplicacao;
	}
	
	public void adicionaDataReforco(LocalDate dataReforco) {
		datasReforco.add(dataReforco);
	}
	
	public ArrayList<LocalDate> mostraDatasReforco() {
		return datasReforco;
	}
	
	public void adicionaVacina(Vacina vacina) {
		vacinas.add(vacina);
	}
	
	public ArrayList<Vacina> mostraVacinas() {
		return vacinas;
	}
	
	public void adicionaVermifugo(Vermifugo vermifugo) {
		vermifugos.add(vermifugo);
	}
	
	public ArrayList<Vermifugo> mostraVermifugos() {
		return vermifugos;
	}
	
 }