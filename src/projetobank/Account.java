/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobank;

import projetobank.Agencia;
import projetobank.Pessoa2;

/**
 *
 * @author Geral
 */
public class Account {
   private int id;
   private int Number;
   private Agencia Agencia;
   private Pessoa2 Pessoa;
   private double saldo;
   private double limite;

    public Account(int id, int Number, Agencia Agencia, Pessoa2 Pessoa, double saldo, double limite, int ContadorAgencia) {
        this.id = id;
        this.Number = Number;
        this.Agencia = Agencia;
        this.Pessoa = Pessoa;
        this.saldo = saldo;
        this.limite = limite;
        this.ContadorAgencia = ContadorAgencia;
    }
   private int ContadorAgencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public Agencia getAgencia() {
        return Agencia;
    }

    public void setAgencia(Agencia Agencia) {
        this.Agencia = Agencia;
    }

    public Pessoa2 getPessoa() {
        return Pessoa;
    }

    public void setPessoa(Pessoa2 Pessoa) {
        this.Pessoa = Pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getContadorAgencia() {
        return ContadorAgencia;
    }

    public void setContadorAgencia(int ContadorAgencia) {
        this.ContadorAgencia = ContadorAgencia;
    }
}
