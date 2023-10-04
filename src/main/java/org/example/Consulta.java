package org.example;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;


public class Consulta {

    public int idConsulta;

    public LocalDateTime dataHora;

    public Paciente paciente;

    public Medico medico;

    public boolean status;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void visualizarInformacoesConsulta() {
        System.out.println("ID da consulta: " + idConsulta);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Status: " + (status ? "Agendada" : "Cancelada"));
        System.out.println("Médico: " + (medico != null ? medico.getNomeMedico() : "Não atribuído"));
        System.out.println("Paciente: " + (paciente != null ? paciente.getNomePaciente() : "Não atribuído"));
    }

    public void atualizarDataHoraConsulta(LocalDateTime novaDataHora) {
        if (!status) {
            dataHora = novaDataHora;
        } else {
            System.out.println("A consulta não pode ter sua data e hora alteradas porque ja esta agendada.");
        }
    }

    public void confirmarConsulta() {
        if (!status) {
            status = true;
            System.out.println("Consulta confirmada.");
        } else {
            System.out.println("A consulta já está confirmada.");
        }
    }

    public void cancelarConsultaConfirmada() {
        if (status) {
            status = false;
            System.out.println("Consulta cancelada.");
        } else {
            System.out.println("A consulta não está confirmada para ser cancelada.");
        }
    }

    public boolean veSeEstaConsultaConfirmada() {
        return status;
    }

}
