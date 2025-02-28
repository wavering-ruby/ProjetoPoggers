# Gestão das Ações

## 1. Objetivo Geral

Este documento visa explicar e registrar todas as etapas de criação, além de sua organização e definições. Esse procedimento também irá mostrar como funciona a criação de *sprints* que gerará - ao seu término - uma nova versão do *software* desenvolvido, com os registros das ações que o geraram. 

---

## 2. Metodologias Ágeis

### 2.1. Definição Geral

A Metologia Ágil (conhecida como Scrum) é um metodologia que permite gerir projetos de uma forma rápida e receptiva a mudanças (incluindo reorganizações) de ações ou suas priorizações. Um dos principais ganhos fora da agilidade, também foi a possível presença e auditorias diretas do cliente durante um determinado *sprint*.

Essas ações são armazenadas dentro de um *backlog*, onde eles podem ser priorizados e reorganizado conforme as organizações dos *sprints* geralmente, eles são alimentados pela própria equipe com específicações dos clientes. 

### 2.2. Sprint

O *sprint* é um compilado de ações que tem como objetivo organizar todas as ações que deverão ser feitas para concluir o produto ou a versão. Cada *sprint* tem uma data de término definida (geralmente, no máximo até duas semanas) com ações para entregar um produto pronto no final.

### 2.3. Backlog

O *backlog* é uma lista com todas as ações que deverão ser entregues junto com o projeto. Ele pode ser organizado de várias formas e serve de alimentação para um *sprint*, que antes, recebe um priorização das principais e mais importantes atividades que devem ser entregues. Essas ações são priorizadas conforme expectativa do cliente, do *Product Owner* (voz do cliente), pelos desenvolvedores ou por requisitos (segurança, normas etc). 

Nem todo *backlog* funciona da mesma maneira, no caso deste projeto, as ações são armazenadas dentro das *Issues* e o *sprint* é armazenado em *Milestone* que serão melhor explicados em ações.

### 2.4. Kanban

O Kanban é um quadro que permite a organização visual dos status das ações, permitindo que tanto os gerentes quanto os clientes consigam ver o andamento do projeto de forma ágil e direta. No caso do projeto, não há maneira clara de ver isso, mas por meio do *Milestone* o cliente poderia ver a conclusão e como está os andamentos das ações nos comentários de cada *Issue*.

---

## 3. Gestão

### 3.1. Objetivo Geral

O objetivo geral é dividirmos a criação de um *software* em ações que servem para criar uma nova versão ou o produto em si. Dessa maneira, podemos determinar responsáveis por cada uma dessas atividades além de definir prazos para a resolução da versão ou do produto.

### 3.2. Issues

### 3.2.1. Objetivo Geral

O objetivo geral é definir e atribuir responsabilidade nas atividades que deverão ser realizadas para término do projeto ou da versão do projeto, permitindo que tenha um controle consistente e fácil das ações. Com as *Issues* é possível colocar *Labels* para organizar qual o tipo de ação é aquela e possibilitando a atribuição de responsáveis.

Além disso, é possível utilizá-las para servir como alimentação para uma *Milestone* que servirá como um *sprint* para esse projeto, sendo as *Issues* o backlog.

#### 3.2.2. Label

Cada ação tem um indicativo colorido e escrito chamado de *label* que permite filtrar o seu tipo. A tabela abaixo trás o significado da *label*.

<table>
  <thead>
    <tr>
      <th>Label</th>
      <th>Descrição</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>Action</strong></td>
      <td>
        Define ações normais que foram planejadas e incluídas no sprint.
      </td>
    </tr>
    <tr>
      <td><strong>Bug</strong></td>
      <td>
        Quando há algum tipo de erro dentro do software, que deverá ser concertado.
      </td>
    </tr>
    <tr>
      <td><strong>Documentation</strong></td>
      <td>
        Qualquer tipo de ação que poderá mexer com algum tipo de documentação. Tal como: "Revisar documento sobre determinado assunto".
      </td>
    </tr>
  </tbody>
</table> 

## 3.3. Milestone

### 3.3.1. Objetivo Geral

As *Milestone* são os *sprints* do projeto, onde estará determinadas todas as ações que pertecem a determinada versão do *software*. Podemos atribuir prazos e quais ações queremos priorizar para aquela versão.

Quando finalizados uma Milestone podemos criar um novo *Release* que seria o local para marcar quando foi finalizado uma versão ou o produto final e lançá-lo para um cliente.

### 3.3.2. Métrica de Conclusão de Ações

É uma métrica utilizada para medir a velocidade de finalização de ações do projeto do projeto. Entregando um valor em procentagem que podemos separar em períodos para ver como está o atendimento aos prazos do cronograma do projeto. 

Um exemplo real é a primeira versão do *software* dedicada para um protótipo do banco de dados para começar a trabalhar por módulos dentro do projeto na versão "v0.0.1.", a métrica ficaria da seguinte forma:

Percentual de Conclusão do Projeto = Quantidade de Ações do Projeto / Quantidade de Ações Finalizadas do Projeto

Dia 01: 15% - De Conclusão
Dia 02: 50% - De Conclusão
Dia 03: 100% - De Conclusão

Para cada um dos módulos podemos ter cada um dessas métricas.

## 3.4. Realeses

### 3.4.1. Objetivo Geral

Os *Realeses* servem para armazenar novas versões ou produtos que foram finalizados após o término de um *sprint*. Permitindo uma organização dinâmica para os lançamentos do *software* que é construído. 

---