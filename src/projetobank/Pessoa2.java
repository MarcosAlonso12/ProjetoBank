/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobank;

import projetobank.Conta;
import projetobank.Banco1;
import projetobank.Agencia;
import projetobank.Banco1;
import java.util.ArrayList;


public class Pessoa2 {
    private int id;
    private int idade;
    private String nome;
    private char sexo;
    private int pessoa;
    public static int contadorPessoas = 0; //Auto incremento

    public Pessoa2() {
    }

    public Pessoa2(int id, int idade, String nome, char sexo, int pessoa) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    public static int getContadorPessoas() {
        return contadorPessoas;
    }

    public static void setContadorPessoas(int contadorPessoas) {
        Pessoa2.contadorPessoas = contadorPessoas;
    }
    /*/Permitir construir a lista de contas/*/
    
    public ArrayList<Conta> getContas (ArrayList<Banco1>bancos){
        ArrayList<Conta> contas = new ArrayList<>;
         Banco banco = bancos.get(id);
         for (int i = 0; i < banco.getAgencias().size(); i++){
             Agencia agencia = banco.getAgencias().get(i);
             
             for(int j = 0; j < 10; j++){
                 Conta contas = agencias.getContas().get(j);
                 if(conta.getCliente().getId()==this getId()){
                 contas.add(conta);
               }
             }
         }
     }
}
