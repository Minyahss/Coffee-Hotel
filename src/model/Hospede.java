package model;

import java.time.LocalDate;

public class Hospede {
    private int idHospede;
    private String nome_completo;
    private String e_mailHospede;
    private int cpf;
    private LocalDate dtNasc;
    private String telefone_Hosp;

    

    public Hospede(int idHosp, String nome, String e_mail, int cpf, LocalDate dtNasc,
            String telHosp) {
        this.idHospede = idHosp;
        this.nome_completo = nome;
        this.e_mailHospede = e_mail;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.telefone_Hosp = telHosp;
    }
    public int getIdHospede() {
        return idHospede;
    }
    public void setIdHospede(int idHospede) {
        this.idHospede = idHospede;
    }
    public String getNome_completo() {
        return nome_completo;
    }
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    public String getE_mailHospede() {
        return e_mailHospede;
    }
    public void setE_mailHospede(String e_mailHospede) {
        this.e_mailHospede = e_mailHospede;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDtNasc() {
        return dtNasc;
    }
    public void setDtNasc(LocalDate dtNasc) {
        this.dtNasc = dtNasc;
    }
    public String getTelefone_Hosp() {
        return telefone_Hosp;
    }
    public void setTelefone_Hosp(String telefone_Hosp) {
        this.telefone_Hosp = telefone_Hosp;
    }
}
