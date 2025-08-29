package school.sptech;

public class Time {
    Integer vitorias = 0, empates = 0, derrotas = 0;
    String nome;

    public void registrarVitoria() {
    vitorias += 1;
    }

    public void registrarDerrota() {
    derrotas += 1;
    }

    public void registrarEmpate() {
    empates += 1;
    }

    public Integer getPontos() {
        Integer pontos = 0;
        Integer pontosVitorias = vitorias * 3;
        Integer pontosEmpates = empates;
        pontos += (pontosEmpates + pontosVitorias);

        return pontos;
    }


    public Integer getTotalPartidas() {
        Integer partidas = empates + vitorias + derrotas;

        return partidas;
    }


    public Integer getAproveitamento() {
        Integer aproveitamento = (vitorias * 100) / getTotalPartidas();

        return aproveitamento;
    }

    public void compararAproveitamento(Time adversario) {
        if (getAproveitamento() > adversario.getAproveitamento()) {
            System.out.println("O time %s tem um aproveitamento maior que o time %s".formatted(nome, adversario.nome));
        } else if (getAproveitamento() < adversario.getAproveitamento()) {
            System.out.println("O time %s tem um aproveitamento menor que o time %s".formatted(nome, adversario.nome));
        } else {
            System.out.println("O time %s tem um aproveitamento igual ao time %s".formatted(nome, adversario.nome));
        }
    }


    public void exibirInformacoes() {
        System.out.println(("Time 1: %a \nVitórias: %a \nDerrotas: %a \nEmpates: %a \n\nPontos: %a \nTotal de partidas: %a \nAproveitamento: %a").formatted(nome, vitorias, derrotas, empates, getPontos(), getTotalPartidas(), getAproveitamento()));
    }
}
