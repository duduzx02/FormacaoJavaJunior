import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

	@Test
	void bonusZeroParaSalariosMuitoAltoDeFuncionarios(){
		BonusService service = new BonusService();
		BigDecimal bonus =  service.calcularBonus(new Funcionario("Eduardo", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(BigDecimal.ZERO, bonus);
	}

	@Test
	void bonusZeroParaSalariosBaixosDeFuncionarios(){
		BonusService service = new BonusService();
		BigDecimal bonus =  service.calcularBonus(new Funcionario("Eduardo", LocalDate.now(), new BigDecimal("9000")));

		assertEquals(new BigDecimal("900.0"), bonus);
	}

}
