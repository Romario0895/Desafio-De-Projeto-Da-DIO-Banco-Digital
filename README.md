# Desafio-De-Projeto-Da-DIO-Banco-Digital
# Sistema Bancário em Java

Este projeto é uma simulação de um sistema bancário simples, desenvolvido em Java, utilizando os conceitos de orientação a objetos.

## Descrição

O sistema permite a criação de contas correntes e poupança para clientes de um banco. As contas possuem funcionalidades de depósito, saque e transferência entre contas da mesma instituição. 

## Funcionalidades

- Criação de contas correntes e poupança
- Depósito em contas
- Saque de contas
- Transferência entre contas
- Impressão de extrato bancário

## Estrutura do Projeto

O projeto está organizado em várias classes, cada uma representando um componente do sistema bancário:

- **Banco:** Representa o banco que contém uma lista de contas.
- **Conta:** Classe abstrata que define os métodos e atributos comuns às contas.
- **ContaCorrente:** Herda de `Conta` e representa uma conta corrente.
- **ContaPoupanca:** Herda de `Conta` e representa uma conta poupança.
- **Cliente:** Representa um cliente do banco.
- **IConta:** Interface que define os métodos principais das contas.
- **Main:** Classe principal que contém o método `main` para execução do programa.
- ## mudança Feitas
- ### 1. Adição da Classe `Banco`

- **Descrição:** A classe `Banco` foi adicionada para gerenciar as contas dos clientes.
- **Funcionalidades:**
  - **Lista de Contas:** Adiciona uma lista de contas (`List<Conta>`) para armazenar todas as contas do banco.
  - **Métodos:**
    - `adicionarConta: Adiciona uma nova conta à lista de contas do banco.
    - `buscarConta(int numero)`: Busca uma conta pelo número e retorna a conta correspondente.
