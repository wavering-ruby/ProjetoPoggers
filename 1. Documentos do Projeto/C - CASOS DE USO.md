# Casos de Uso

## 1. Definições de Casos de Uso

Casos de uso é um tipo de modelagem de *software* que permite definir quais são as interações na ferramenta, mapeando os perfis de acesso (como "usuário organizador") com ações de que ele pode realizar. Cada balão simboliza um tipo de execução que um agente (exemplo: "usuário cadastrador") consegue realizar em determinado perfis de acesso. 

### 1.1. Interações entre o usuário

![Documentação - EventLn (1)](https://github.com/user-attachments/assets/c0d8fd42-081b-4b44-a4b6-1adf9b08b6bc)

O caso de uso acima, reflete as interações entre dois perfis de usuários, de modo que um "Usuário Organizador" que é capaz de criar eventos, consegue realizar diversas ações, enquanto um "Usuário Participante" pode apenas participar de um evento ou realizar um login.

Cada usuário fica trocando de "Participante" para "Organizador", ele se torna um "Organizador" quando cria algum tipo de evento e somente naquele evento criado. Quando ele é convidado para um evento, ele assume um cargo de "Participante" daquele evento. Por isso, a mesma tabela (no caso, "Usuários") teria diferenças de acesso por causa desse tipo de cargo.
