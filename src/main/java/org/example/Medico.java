package org.example;
import java.time.LocalDateTime;


public class Medico {

    private String nomeMedico;
    private int IdMedico;
    private String especialidade;
    private String horarioTrabalho;

    public Medico(String nome, int idMedico, String especialidade, String horarioTrabalho) {
        this.nomeMedico = nomeMedico;
        IdMedico = idMedico;
        this.especialidade = especialidade;
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public int getIdMedico() {
        return IdMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setNome(String nome) {
        this.nomeMedico = nomeMedico;
    }

    public void setIdMedico(int idMedico) {
        IdMedico = idMedico;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public void realizarConsulta() {
    }

    public void atualizarInformacoesPaciente(Paciente paciente, String historicoMedico) {
        paciente.setHistoricoMedico(historicoMedico);
    }

    public void exibirInformacoesMedico() {
        System.out.println("Nome: " + getNomeMedico());
        System.out.println("ID: " + getIdMedico());
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Horário de Trabalho: " + getHorarioTrabalho());
    }

    private void agendarConsulta(Medico medico, Consulta consulta) {

        consulta.setStatus(true);
    }

    private void cancelarConsulta(Consulta consulta) {
        consulta.setStatus(false);
    }

}
