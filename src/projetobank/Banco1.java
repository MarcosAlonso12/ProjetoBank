/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobank;

import projetobank.Agencia;
import java.util.ArrayList;

public class Banco1 {
  private ArrayList<Agencia> contas = new ArrayList<>();
  private Banco1 banco;
  private int id; //Identificação da agencia no sistema.nao pode repetir.
  private String numero; //numero da agencia.
  private String cidade; //cidade da agencia.
  public static int contadorAgencias = 0; //auto incremento para o identificar de cada agencia//
                                                             //Construtor vazio//

    public Banco1() {
        
    }

    public Banco1(Banco1 banco, int id, String numero, String cidade) {
        this.banco = banco;
        this.id = id;
        this.numero = numero;
        this.cidade = cidade;
    }

    public ArrayList<Agencia> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Agencia> contas) {
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
        Banco1.contadorAgencias = contadorAgencias;
    }
    
}
