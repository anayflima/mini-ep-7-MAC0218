package domain
import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

    private lateinit var criterioAprovacao: CriterioDeAprovacao
    fun defineCriterio(criterio: CriterioDeAprovacao) {
        this.criterioAprovacao = criterio
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado {
        return BoletimFechado(boletim.mediaEPs,boletim.mediaMiniEPs,
            criterioAprovacao.mediaFinal(boletim), criterioAprovacao.estaAprovado(boletim))
    }

}