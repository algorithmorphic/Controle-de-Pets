package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import controller.ControlePet;
import controller.ControleVacina;
import model.Vacina;



public class TesteControlePet {
	Vacina vacina = new Vacina("V8", "Lema-Injex Biologic", LocalDate.parse("2021-03-03"), LocalDate.parse("2023-03-03"), "000000", true, "Fulano Sobrenome Aleatório", "567890123456789", "1234567");
	
	ControleVacina controleVacina = new ControleVacina();
	ControlePet controlePet = new ControlePet(controleVacina);
	
	@Test
	void testeAdicionaPet() {
		controlePet.adicionaPet("Jake", "Cachorro", "Buldogue", "Macho", "Amarelo", LocalDate.parse("2010-04-11"), "6172839485172839", "4851672");
		
		// Verifica se a lista de pets está vazia.
		assertNotNull(controlePet.getPets());

	}
	
	@Test
	void testeAdionaVacinaPet() {
		controlePet.adicionaVacinaPet(vacina);
		
		// Verifica se a lista de vacinas contém uma vacina específica.
		assertTrue(controlePet.getVacinas().contains(vacina));
	}
	
	@Test
	void testeRemoveVacinaPet() {
		
		// Adiciona uma vacina específica a um determinado animal de estimação.
		controlePet.adicionaVacinaPet(vacina);
		
		// Remove uma determinada vacina da lista de vacinas de um determinado animal de estimação.
		controlePet.removeVacinaPet(vacina);
		
		// Verifica se uma vacina específica foi realmente removida da lista de vacinas de um determinado animald e estimação.
		assertFalse(controlePet.getVacinas().contains(vacina));
	}
	
}