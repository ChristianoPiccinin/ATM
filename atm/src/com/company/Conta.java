package com.company;

public class Conta {

    private int idConta;
    private String nome;
    private double saldo;

    public Conta(String nome) {
        setNome(nome);


    }

    public int getIdConta() {

        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }



    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saque Realizado!");
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito Realizado!");
    }

    public void visualizaSaldo() {
        System.out.println("Seu saldo é : R$ " +  this.saldo);
    }

}
