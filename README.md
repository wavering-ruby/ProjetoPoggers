# Projeto do Enari

# Desenvolvedores

- Angelo Salvatti
- Caio Viana de Jesus
- Mateus Gabriel Mendes de Paula
- Victor Giordano Damiani

---

# Resumo

<p align="center">
  <img src="./Projeto/imgs/logo.png" width="50%" height="50%" alt="EventLn-Logo">
</p>

O objetivo do *software* é a criação de um site que permita que os usuários crie eventos dos mais variados tipos facilmente, com um status público (qualquer pessoa pode se inscrever nesse evento) ou privado (somente pessoas que foram convidadas diretamente para esse evento). Contém diversas ferramentas para filtragem para eventos, aprovação de usuário, geradores de listas de presença, entre outras ferramentas baseadas em dificuldades comuns no gerenciamento de eventos. EventLn serve para todos os típos de festas, sendo elas familiares ou eventos públicos. 

---

# Tecnologias Utilizadas


## Tag's das Tecnologias

![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB)
![Vite](https://img.shields.io/badge/Vite-646CFF?style=for-the-badge&logo=vite&logoColor=white)
![Canva](https://img.shields.io/badge/Canva-00C4CC?style=for-the-badge&logo=canva&logoColor=white)
![HTML](https://img.shields.io/badge/HTML-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS](https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![Node.js](https://img.shields.io/badge/Node.js-43853D?style=for-the-badge&logo=node.js&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)


---

## Modelagem de Software

---

## Front-end

---

### HTML

Para HTML, não é necessário nenhum tipo de *download* de linguagem.

---

### CSS

Para CSS, não é necessário nenhum tipo de *download* de linguagem.

---

### React + Vite

### Vite

Em poucas palavras, o Vite é uma ferramenta de construção JavaScript moderna que fornece suporte pronto para uso para padrões comuns da web, oferecendo compilações otimizadas com a flexibilidade e maturidade do rollup , juntamente com um servidor de desenvolvimento rápido e sem pacotes.

---

#### Instalação

Primeiramente, deve-se criar uma configuração para o Vite. Geralmente, nós colocamos dentro da pasta do projeto. Para isso, precisamos utilizar o comando abaixo para mudar o diretório:

```powershell
cd "./Project"
```

Depois disso, você pode criar a configuração mais recente do Vite utilizando o comando abaixo:

```powershell
npm create vite@latest .
```

Em seguida, ele perguntará como proceder com a instalação. Nesse caso, você deve escolher a opção `Ignore Files and continue`.

Depois, você precisará escolher o nome do projeto. Você pode escolher qualquer nome que desejar.

Uma tela aparecerá para selecionar o framework. Nesse caso, selecione React.

Por fim, selecione a linguagem como JavaScript. Após isso, você verá que vários arquivos base apareceram dentro das pastas.

Para instalar as dependências do pacote, você precisará prosseguir com o comando abaixo:

```powershell
npm install
```

Ele deve ter criado um pacote com os módulos do node, chamado: `node_modules`.

Depois disso, você pode usar o seguinte comando para testar como estão as configurações do seu projeto e verificar se a instalação foi bem-sucedida:

```powershell
npm run dev
```

Isso levará você a um site simples que permite clicar em um botão e contar quantas vezes você clicou.

#### Bibliotecas

##### react-router-dom

Use o comando abaixo:

```powershell
npm install react-router-dom
```

---

#### Documentação

---

#### Cuidados

Recomenda-se dar uma lida em alguns comandos de CMD e PowerShell pois será necessário utilizá-los no projeto.

---

## Back-end

---

### Postman

---

### Node.js

### Instalação

**1:** Primeiramente entre no site **https://nodejs.org/pt** para que assim baixe o instalador

**2:** Após instalar execute o **node-v22.14.0-x64** ao fazer isso irá aparecer guias referentes ao download 
 
**3:** Aceite os termos até que em uma das paginas apareça uma caixinha que apareça a palavra **chocolatey** e marque-a e proxima
  
**4:** Depois disso aceite o pedido para abrir o powershell e deixe ele terminar o projeto
 
**5:** Depois de um tempo o powershell não fará mais nada então abra o vscode e crie um terminal novo

**6:** No terminal novo digite 
```
node -v
```

**7:** Se ao fazer isso e der a versão **v22.14.0** então está tudo certo.


### Spring Boot

---

## Banco de Dados

---

### PostgreSQL

---

## Extensões do VSCode (extensões recomendadas)

### Front
- Language Support for Java
- .NET Install Tool
- Auto Rename Tag
- autoSave
- ES7 + React/Redux/React-Native snippets
- Image preview
- Material Icon Theme

### Back
- Database Cliente JDBC
- Spring Boot Dashboard
- Spring Boot Extension Pack
- Spring Initializer Java Support
- PostgreSQL
- Postman


## Versionamento

---

## GitHub

### Objetivo Geral

Para organizarmos o projeto era necessário uma ferramenta que seja capaz de armazenar ações e os arquivos, organizar o *backlog* e ter uma sistemática de versionamento e metas. Para utilizar cada um desses aspectos do desenvolvimento do sistema, o GitHub foi a ferramenta ideal, pois, com as devidas adaptações e extensões, ele consegue simplificar e organizar tudo o que é necessário dentro de apenas um site. 

O controle de ações foi implementado em *Issues* onde é possível localizar o *"To do"* do *software* e distribuir as responsabilidades do software. Uma das possibilidades de se organizar o *sprint* do projeto é utilizando o *Milestone*, onde é possível atribuir prazos (meta para finalização) e nele você consegue inserir todas as ações que são necessárias para a conclusão do *sprint* retornando a porcentagem de participação.

Para o versionamento do *software*, será utilizado o *Releases* - criado exatamente para isso - onde é possível organizar os arquivos por versões e ficar armazenados dentro de um *Release*.

### Instalação

**1:** Aplicativos necessarios: **github desktop: https://desktop.github.com/download/** (link direto para download), **vscode**

**2:** Depois de instalar abra o github desktop e logge com a sua conta
 
**3:** Depois de loggar debaixo de Let's Get Started selecione a opção: **wavering-ruby/ProjetoPoggers**
 
**4:** Após isso aparece as opções para clonar o repositorio selecione a parte de **github.com** e clique em clonar
 
**5:** Após isso só **clicar Ctrl + Shift + A** que abrirá o VScode, por onde poderá começar a programar.

---

## Versão X

<table align="center">
  <thead>
    <tr>
      <th>Código da Modificação</th>
      <th>Título</th>
      <th>Data de Modificação</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>CÓDIGO DO PROCEDIMENTO </strong></td>
      <td>(Texto template)</td>
      <td>DD/MM/AAAA</td>
    </tr>
  </tbody>
</table>

---

## Versão Y

---

## Versão Z

---
