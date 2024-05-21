<h1>Password Validator API</h1>
 
O **password_validador_api** é uma REST API que realiza validação de uma senha conforme as seguintes regras:

- Nove ou mais caracteres.
- Ao menos 1 dígito.
- Ao menos 1 letra minúscula.
- Ao menos 1 letra maiúscula.
- Ao menos 1 caractere especial (!@#$%^&*()-+).
- Não possuir caracteres repetidos dentro do conjunto.
- Espaços em branco não são considerados caracteres válidos.

<h1>Tecnologias Utilizadas</h1>

- Java 17
- Spring Boot
- Maven

<h1>Estrutura do Projeto</h1>

- **ControllerValidator**: Controlador REST que expõe a API para validação de senhas.
- **ServicePassword**: Classe que contém a lógica para a validação de senhas.
- **ServicePasswordTest**: Testes de unidade para validar a lógica da classe ServicePassword.

<h1>Configuração e Execução</h1>

<h2>Pré-Requisitos</h2>

- JDK 17 instalado
- Maven instalado
- Postman Instalado

<h2>Passos para executar</h2>

1. Clone o repositório:

   ```
   git clone https://github.com/seu_usuário/password_validator_api.git
   cd password_validator_api
   ```

2. Construa o projeto com Maven:

   ```
   mvn clean install
   ```

3. Execute a aplicação:

    ```
    mvn spring-boot:run
    ```

4. Acesse a API no Postman e use o endpoint:

    ```
    POST http://localhost:8080/api/validate
    ```

   No corpo da requisição, passe uma senha para a validação, envie a solicitação e verifique a resposta.

   ```
    {password:"senha a ser validada"};
   ```

<h1>Racional ultilizado</h1>

Por se tratar de apenas duas possíveis respostas, se a senha é válida(**TRUE**), se não é válida(**FALSE**), foi ultilizado o tipo de dados Boolean por motivos de uma variável booleana poder assumir apenas um entre dois valores: true ou false.
Devido a permição em definir e validar critérios de forma clara e flexível, foi ultilizado regex. Pensando na simplificação e também na manutenção do código.

No caso da REST API, foi ultilizado Spring Framework, especificamente o Spring Boot por simplicidade na sua configuração inicial do projeto e produtividade pois ele oferece **"starters"** que agrupam as dependências comuns em uma configuração pronta para uso. No caso, **spring-boot-starter-web** já incluiu tudo o que foi preciso para criar uma aplicação web.


