package org.example;

import java.time.LocalDateTime;

public class Paciente {

    private String nomePaciente;
    private int idPaciente;
    private String endereco;
    private int numero;
    private String telefone;
    private String historicoMedico;

    public int prioridadePaciente = 0;
    public String classificacaoPrioridade;
    private Medico medico;
    private Consulta consulta;


    public Paciente(String nomePaciente, int idPaciente, String endereco, int numero, String telefone, String historicoMedico, int prioridadePaciente, String classificacaoPrioridade) {
        this.nomePaciente = nomePaciente;
        this.idPaciente = idPaciente;
        this.endereco = endereco;
        this.numero = numero;
        this.telefone = telefone;
        this.historicoMedico = historicoMedico;
        this.prioridadePaciente = prioridadePaciente;
        this.classificacaoPrioridade = classificacaoPrioridade;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nome) {
        this.nomePaciente = nomePaciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public int getPrioridadePaciente() {
        return prioridadePaciente;
    }
    public void setPrioridadePaciente(int prioridadePaciente) {
        this.prioridadePaciente = prioridadePaciente;
    }

    public String getClassificacaoPrioridade() {
        return classificacaoPrioridade;
    }

    public void setClassificacaoPrioridade(String classificacaoPrioridade) {
        this.classificacaoPrioridade = classificacaoPrioridade;
    }

    // METODOS
    // METODOS
    // METODOS
    private void agendarConsulta(Medico medico, Consulta consulta) {

        consulta.setStatus(true);
    }

    private void cancelarConsulta(Consulta consulta) {
        consulta.setStatus(false);
    }

    public void adicionarSintoma(Sintomas sintoma) {
        int gravidadeSintoma = sintoma.getGravidade();
        setPrioridadePaciente(getPrioridadePaciente() + gravidadeSintoma);
        if (this.getPrioridadePaciente() <= 10) {
            this.setClassificacaoPrioridade("Prioridade baixa");
        } else if (getPrioridadePaciente() <= 20) {
            this.setClassificacaoPrioridade("Prioridade média");
        } else {
            this.setClassificacaoPrioridade("Prioridade alta");
        }
    }
        public void exibirInformacoesPaciente() {
            System.out.println("Nome: " + getNomePaciente());
            System.out.println("ID: " + getIdPaciente());
            System.out.println("Endereço: " + getEndereco() + ", Número: " + getNumero());
            System.out.println("Telefone: " + getTelefone());
            System.out.println("Histórico Médico: " + getHistoricoMedico());
            System.out.println("Prioridade: " + getPrioridadePaciente());
            System.out.println("Classificação de Prioridade: " + getClassificacaoPrioridade());
        }

    public void atualizarInformacoesPessoais(String nome, String endereco, int numero, String telefone) {
        setNomePaciente(nome);
        setEndereco(endereco);
        setNumero(numero);
        setTelefone(telefone);
    }

    
}



