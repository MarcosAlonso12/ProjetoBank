/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobank;

import projetobank.Banco1;
import projetobank.Banco1;
import projetobank.Account;
import java.util.ArrayList;

/**
 *
 * @author Geral
 */
public class Agencia {
  private ArrayList<Account> contas = new ArrayList<>();
  private Banco1 banco;
  private int id; //Identificação da agencia no sistema.nao pode repetir.
  private String numero; //numero da agencia.
  private String cidade; //cidade da agencia.
  public static int contadorAgencias = 0; //auto incremento para o identificar de cada agencia//
                                                             //Construtor vazio//

    public Agencia() {
       // Contrutor personalized
    }

    public Agencia(Banco1 banco, int id, String numero, String cidade) {
        this.banco = banco;
        this.id = id;
        this.numero = numero;
        this.cidade = cidade;
    }

    public ArrayList<Account> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Account> contas) {
        this.contas = contas;
    }

    public Banco1 getBanco() {
        return banco;
    }

    public void setBanco(Banco1 banco) {
        this.banco = banco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public static int getContadorAgencias() {
        return contadorAgencias;
    }

    public static void setContadorAgencias(int contadorAgencias) {
        Agencia.contadorAgencias = contadorAgencias;
    }
}
