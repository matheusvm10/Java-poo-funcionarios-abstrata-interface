# Projeto Sistema de Funcionários - Classe Abstrata e Interface em Java
## Atividade da matéria de Programação de Aplicativos
## DS/SENAI-BA
Este projeto demonstra a combinação de **Classes Abstratas** e **Interfaces** em Java para construir um sistema extensível de gestão de funcionários (`Gerente` e `Desenvolvedor`).

## Tecnologias Utilizadas
- **Linguagem:** Java
- **IDE:** IntelliJ IDEA
- **Controlo de Versão:** Git & GitHub

## Conceitos de POO Aplicados
- **Classe Abstrata (`abstract class`):** A classe `Funcionario` serve como modelo base e não pode ser instanciada diretamente, contendo o método abstrato `calcularSalario()`.
- **Interface (`interface`):** O contrato `Autenticavel` estabelece a regra para classes que exigem controlo de acesso (ex.: `Gerente`).
- **Herança e Multi-implementação:** A classe `Gerente` herda de `Funcionario` (`extends`) e implementa `Autenticavel` (`implements`).
- **Polimorfismo / Sobrescrita (`@Override`):** Implementação específica do cálculo salarial para cada tipo de funcionário.
- **Encapsulamento e Validação:** Atributos privados com regras de validação nos *setters* (garantindo valores não negativos para salários e bónus).

## Como Executar
1. Clona este repositório: https://github.com/matheusvm10/Java-poo-funcionarios-abstrata-interface.git
2. Abre o projeto no IntelliJ IDEA.
3. Executa a classe `Main.java`.
