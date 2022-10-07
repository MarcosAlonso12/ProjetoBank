/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobank;

import projetobank.Pessoa2;
import projetobank.Transação;
import projetobank.Agencia;
import java.util.ArrayList;

public class Conta {
   Agencia agencia;
   Pessoa2 Cliente;
   ArrayList<Transação> transações = new ArrayList<>();
   int id;
   String numero;
   double saldo;
   double limite;
   public static int contadorContas = 0;

    public Conta() {
    }

    public Conta(Agencia agencia, Pessoa2 pessoa, int id, String numero, double saldo, double limite) {
        this.agencia = agencia;
        this.Cliente = pessoa;
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Pessoa2 getCliente() {
        return Cliente;
    }

    public void setCliente(Pessoa2 Cliente) {
        this.Cliente = Cliente;
    }

    public ArrayList<Transação> getTransações() {
        return transações;
    }

    public void setTransações(ArrayList<Transação> transações) {
        this.transações = transações;
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


    public double getSaldo() {
        return saldo;
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public static int getContadorContas() {
        return contadorContas;
    }

    public static void setContadorContas(int contadorContas) {
        Conta.contadorContas = contadorContas;
    }
   
}
