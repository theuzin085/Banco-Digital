package com.BootCamp;


public  class Conta {

    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor){


    }



}
