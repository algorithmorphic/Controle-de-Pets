package model;
import java.time.LocalDate;

public abstract class Medicamento {
	private String nome;
	private String fabricante;
	private LocalDate dataFabricacao;
	private LocalDate dataValidade;
	private String lote; // Geralmente contém de 6 a 11 dígitos.
	private boolean status; // Para verificação de usabilidade.
	
	
}