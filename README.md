# 🩺 Trabalho Prático - P2 (Substitutiva) | Java - CBTLPR1 (ADS 371)

## Trabalo realizado em dupla por Gustavo e Igor Murai

## 👨‍🏫 Professor
Wellington Tuler Moraes  
Instituto Federal de Educação, Ciência e Tecnologia de São Paulo - Campus Cubatão

---

## 📚 Descrição

Este repositório contém o desenvolvimento das classes Java exigidas no **Trabalho Prático Substitutivo da P2**, da disciplina de Java (CBTLPR1).

Foram implementadas as seguintes funcionalidades:

- Classe `Data` com métodos para manipulação e validação de datas.
- Classe `ConsultaAgendada` com agendamento de consultas médicas.
- Programa de teste (`Main.java`) que simula e valida os comportamentos exigidos.
- Escrita de informações em arquivo texto, conforme solicitado.

---

## 📁 Estrutura do Projeto


---

## 🧩 Funcionalidades Implementadas

### 📆 Classe `Data`

- Construtores com entrada via teclado ou por parâmetro
- Getters e Setters padrão UML
- Validação de valores (dia, mês, ano)
- Métodos:
  - `mostra1()` – formato `dd/mm/aaaa`
  - `mostra2()` – formato `dd/mêsPorExtenso/aaaa`
  - `bissexto()` – verifica se o ano é bissexto
  - `diasTranscorridos()` – retorna dias passados no ano
  - `apresentaDataAtual()` – exibe a data atual com `DateFormat`

### 🕒 Classe `Hora` *(presumida como suporte)*

- Propriedades: hora, minuto, segundo
- Getters e Setters
- Validação de intervalo
- Método para exibir hora formatada

### 👨‍⚕️ Classe `ConsultaAgendada`

- Três construtores (com entrada manual ou por parâmetros)
- Propriedades:
  - `data: Data`
  - `hora: Hora`
  - `nomePaciente: String`
  - `nomeMedico: String`
  - `quantidade: int (static)`
- Métodos:
  - `setData`, `setHora`, `setNomePaciente`, `setNomeMedico` (digitado ou por parâmetro)
  - `getData()`, `getHora()`, `getNomePaciente()`, `getNomeMedico()`
  - `getAmostra()` – retorna a quantidade de consultas

---

## 🧪 Testes

O programa principal (`Main.java`) realiza os seguintes testes:

1. Criação do objeto `p1` com dados via construtor parametrizado
2. Exibição de todas as propriedades de `p1`
3. Criação do objeto `p2` com entrada manual via teclado
4. Alteração de valores de `p1` com os métodos `set`
5. Reexibição de `p1`
6. Impressão da quantidade total de consultas
7. Escrita do resultado final em `resultado.txt`

---
