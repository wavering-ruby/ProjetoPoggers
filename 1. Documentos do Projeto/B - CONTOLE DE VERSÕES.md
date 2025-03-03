# Controle de Versões

## 1. Objetivo Geral

Esse documento visa explicar como será o controle de versão, armazenando quais ações foram realizadas para a isso e quais documentações estão ligadas com elas. Ele também irá compilar em apenas um documento como é feito a documentação de versão além de servir como um guia para pesquisas específicas, já que irá guardar um histórico de modificações completo e de fácil acesso.

---

### 1.1. Definições de Modificações

Cada alteração em linhas de código pode ser considerados uma modificação, já que há uma mudança com relação ao antigo *software*. Cada uma dessas modificações possuem diferentes níveis de complexidade com relação as interações com outros componentes do projeto, de modo que seja necessário um esforço maior seja necessário para solução do caso. Para modificações maiores, elas deverão ser dividas em planos de ações menores para que seja melhor distribuído.

Sabendo que as modificações podem ter diferentes níveis de complexidades, é divido as ações que sejam de modificações em três definições que irão refletir diretamente dentro de uma versão de um *software* ou projeto.

Elas estão conectadas diretamente ao último dígito do código de versionamento, onde cada um dessas depend

X demonstra o *sprint* do projeto;

Y demonstra a quantidade de modificações de emergência realizadas;

Z demonstra a quantidade de modificações realizadas.

---

### 1.2. Quantidade de sprint

O projeto será orientado por *sprints* imitado pela ferramenta *Milestone* dentro do *software* de versionamento do GitHub, de modo que contabilize qual o número do *sprint* do projeto, nos dando uma organização e mostrando ao usuário qual grande atualização ele está atualmente.

---

### 1.3. Quantidade de modificações de emergência

Uma atualização no projeto que seja necessário pular etapas no planejamento do *sprint* é chamada como Modificação de Emergência, de modo que seja necessário entrar no ambiente de produção o mais rápido possível. Ela é mapeada nesse código da versão, além disso, ele é sobrescrita quando uma nova versão é liberada.

---

### 1.4. Modificações

As Modificações correspondem a qualquer modificação que é feita no *software*. Incluíndo requisitos de cliente e outros requisitos vigentes (como segurança, qualidade etc). Ela estão diretamente ligadas a quantidade de *Issues* resolvidas dentro do *sprint*. 

---
