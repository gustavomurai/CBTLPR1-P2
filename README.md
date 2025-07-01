# Trabalho Prático P2 - Linguagem de Programação 1

---

## Sobre o Trabalho

Este repositório contém a solução do Trabalho Prático P2 da disciplina **Linguagem de Programação 1** (CBTLPR1 – ADS 371), ministrada pelo professor Wellington Tuler Moraes no Instituto Federal de Educação, Ciência e Tecnologia de São Paulo - Campus Cubatão.

O trabalho consiste na implementação e teste das classes `Data`, `Hora` e `ConsultaAgendada` em Java, conforme as especificações abaixo.

---

## Exercícios

### Exercício 01 (1,0 ponto)

Reescrever as propriedades e métodos da classe `Data`, adequando-os ao padrão UML com os métodos **getter** e **setter**.

---

### Exercício 02 (5,0 pontos)

Criar a classe `ConsultaAgendada` com os seguintes requisitos:

- Atributos:
  - `data` (do tipo `Data`)
  - `hora` (do tipo `Hora`)
  - `nomePaciente` (String)
  - `quantidade` (static int)
  - `nomeMedico` (String)

- Construtores:
  - `ConsultaAgendada()` — permite digitar valores de data, hora, nome do paciente e do médico.
  - `ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String m)`
  - `ConsultaAgendada(Data d, Hora h, String p, String m)`

- Métodos setters e getters para alterar e acessar os valores das propriedades, inclusive métodos para entrada via teclado para alterar os atributos (sem parâmetros).

- O construtor deve incrementar o atributo estático `quantidade` a cada nova instância criada.

- Métodos `getData()` e `getHora()` devem retornar string formatada: `dd/mm/aa` e `hh:mm:ss`, respectivamente.

---

### Exercício 03 (2,0 pontos)

Testar a classe `ConsultaAgendada` seguindo estes passos:

- Instanciar o objeto `p1` usando o construtor com parâmetros `int h, int mi, int s, int d, int m, int a, String p, String m`.
- Exibir todas as propriedades de `p1`.
- Instanciar o objeto `p2` usando o construtor sem parâmetros.
- Exibir todas as propriedades de `p2`.
- Usar os métodos `setData()`, `setHora()`, `setNomePaciente()`, `setNomeMedico()` para alterar as propriedades de `p1`.
- Exibir as propriedades de `p1` novamente.
- Exibir a quantidade final de consultas.

---

### Exercício 04 (2,0 pontos)

Gravar todo o resultado do Exercício 03 em um arquivo texto.

---

## Como executar

- Certifique-se de ter o JDK instalado e configurado no seu sistema.
- Compile as classes usando o terminal ou VS Code.
- Execute o programa de teste para validar a funcionalidade.

---

## Autores

- Gustavo Murai  
- Igor Murai

---


