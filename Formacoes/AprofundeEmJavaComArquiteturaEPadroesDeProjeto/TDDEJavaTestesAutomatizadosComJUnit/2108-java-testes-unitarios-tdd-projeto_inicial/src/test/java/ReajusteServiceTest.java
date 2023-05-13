import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {
    @Test
    public void reajusteDeTresPorcentoDesempenhoForAdesejar(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Eduardo", LocalDate.now(), new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }
}
