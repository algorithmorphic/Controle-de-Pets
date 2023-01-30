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
	
	
	public ArrayList<LocalDate> getDatasAplicacao() {
		return datasAplicacao;
	
	}

	public void setDatasAplicacao(ArrayList<LocalDate> datasAplicacao) {
		this.datasAplicacao = datasAplicacao;
	
	}

	public ArrayList<LocalDate> getDatasReforco() {
		return datasReforco;
	
	}

	public void setDatasReforco(ArrayList<LocalDate> datasReforco) {
		this.datasReforco = datasReforco;
	
	}

	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	
	}

	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	
	}

	public ArrayList<Vermifugo> getVermifugos() {
		return vermifugos;
	
	}

	public void setVermifugos(ArrayList<Vermifugo> vermifugos) {
		this.vermifugos = vermifugos;
	
	}

	public void adicionaDataAplicacao(LocalDate dataAplicacao) {
		datasAplicacao.add(dataAplicacao);
	
	}
	
	public void removeDataAplicacao(LocalDate dataAplicacao) {
		datasAplicacao.remove(dataAplicacao);
	}
	
	public void adicionaDataReforco(LocalDate dataReforco) {
		datasReforco.add(dataReforco);
	
	}
	
	public void removeDataReforco(LocalDate dataReforco) {
		datasReforco.remove(dataReforco);
	}
	
	public void adicionaVacina(Vacina vacina) {
		vacinas.add(vacina);
	
	}
	
	public void removeVacina(Vacina vacina) {
		vacinas.remove(vacina);
	}
	
	public void adicionaVermifugo(Vermifugo vermifugo) {
		vermifugos.add(vermifugo);
	
	}
	
	public void removeVermifugo(Vermifugo vermifugo) {
		vermifugos.remove(vermifugo);
	}
	
 }