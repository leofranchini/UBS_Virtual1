package org.example;
 public enum Sintomas {
        FEBRE(7),
        TOSSE(5),
        DOR_DE_GARGANTA(4),
        DOR_DE_CABECA(3),
        FALTA_DE_AR (8),
        DOR_NO_PEITO(9),
        FADIGA(6),
        NAUSEA(4),
        VOMITO(5),
        DIARREIA(4),
        CONGESTAO_NASAL(3),
        ESPIRROS(2),
        DOR_MUSCULAR(5),
        PERDA_DE_PALADAR(7),
        PERDA_DE_OLFATO(7),
        COCEIRA_NA_GARGANTA(3),
        DIFICULDADE_PARA_ENGOLIR(4),
        CORIZA(3),
        DOR_NAS_ARTICULACOES(5),
        OLHOS_VERMELHOS(3),
        ERUPCOES_CUTANEAS(6),
        SANGRAMENTO_NASAL(3),
        DOR_ABDOMINAL(5),
        CALAFRIOS(4),
        SENSACAO_DE_MAL_ESTAR(5);
        private final int gravidade;

        Sintomas(int gravidade) {
            this.gravidade = gravidade;
        }

        public int getGravidade() {
            return gravidade;
        }
  }


