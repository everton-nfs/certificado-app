package main.java.com.everton.certificadoapp;

import java.util.Date;

public class Process {
      private String protocolo;
      private String autorNome;
      private String autorCpf;
      private String tituloTrabalho;
      private Date dataProducao;
      private Date dataAnalise;
      private String matriculaAnalista;
      private String status;
  
      public Process(String protocolo, String autorNome, String autorCpf, String tituloTrabalho, Date dataProducao) {
          this.protocolo = protocolo;
          this.autorNome = autorNome;
          this.autorCpf = autorCpf;
          this.tituloTrabalho = tituloTrabalho;
          this.dataProducao = dataProducao;
      }
  
      public String getProtocolo() {
          return protocolo;
      }
  
      public void setProtocolo(String protocolo) {
          this.protocolo = protocolo;
      }
  
      public String getAutorNome() {
          return autorNome;
      }
  
      public void setAutorNome(String autorNome) {
          this.autorNome = autorNome;
      }
  
      public String getAutorCpf() {
          return autorCpf;
      }
  
      public void setAutorCpf(String autorCpf) {
          this.autorCpf = autorCpf;
      }
  
      public String getTituloTrabalho() {
          return tituloTrabalho;
      }
  
      public void setTituloTrabalho(String tituloTrabalho) {
          this.tituloTrabalho = tituloTrabalho;
      }
  
      public Date getDataProducao() {
          return dataProducao;
      }
  
      public void setDataProducao(Date dataProducao) {
          this.dataProducao = dataProducao;
      }
  
      public Date getDataAnalise() {
          return dataAnalise;
      }
  
      public void setDataAnalise(Date dataAnalise) {
          this.dataAnalise = dataAnalise;
      }
  
      public String getMatriculaAnalista() {
          return matriculaAnalista;
      }
  
      public void setMatriculaAnalista(String matriculaAnalista) {
          this.matriculaAnalista = matriculaAnalista;
      }
  
      public String getStatus() {
          return status;
      }
  
      public void setStatus(String status) {
          this.status = status;
      }
  }
