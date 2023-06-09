package br.com.alura.rh.service.Reajuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriocidadeEntreReajustes  implements ValidacaoReajuste{
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataultimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataultimoReajuste, dataAtual);
        if(mesesDesdeUltimoReajuste < 6){
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no minimo 6 meses!");
        }
    }
}