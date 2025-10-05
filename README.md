# Web Services com Spring Boot e JPA

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=spring)
![JPA / Hibernate](https://img.shields.io/badge/JPA-Hibernate-blueviolet?style=for-the-badge&logo=hibernate)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue?style=for-the-badge&logo=postgresql)
![Heroku](https://img.shields.io/badge/Deploy-Heroku-purple?style=for-the-badge&logo=heroku)

## 📄 Sobre o Projeto

Este projeto é uma API RESTful completa, desenvolvida como parte do curso **Java COMPLETO**
da [DevSuperior](https://devsuperior.com.br). A aplicação simula o back-end de um sistema de e-commerce, implementando
um modelo de domínio robusto e uma arquitetura em camadas bem definida.

O objetivo principal é demonstrar a construção de um serviço web do zero, cobrindo desde a modelagem de dados
relacionais com **JPA/Hibernate** até o deploy em um ambiente de produção na nuvem com **Heroku**.

## ✨ Funcionalidades Principais

- **Arquitetura em Camadas**: O projeto é estruturado em camadas lógicas (Resource, Service, Repository) para garantir a
  separação de responsabilidades e a manutenibilidade.
- **Modelo de Domínio Complexo**: Implementação de diversas entidades (`User`, `Order`, `Product`, `Category`, etc.) com
  múltiplos tipos de relacionamentos JPA:
    - `@OneToOne`
    - `@OneToMany`
    - `@ManyToMany` (com tabela de junção)
    - Associação Many-to-Many com atributos extras (usando chave primária composta).
- **Operações CRUD**: Endpoints para Criar, Ler, Atualizar e Deletar usuários, seguindo os princípios REST.
- **Tratamento de Exceções**: Implementação de um sistema de tratamento de exceções personalizado e centralizado para a
  camada de recursos, retornando erros HTTP apropriados.
- **Spring Profiles**: Configuração de múltiplos ambientes (`test`, `dev`, `prod`) para gerenciar bancos de dados e
  configurações diferentes (H2, PostgreSQL local e PostgreSQL na nuvem).
- **Database Seeding**: Povoamento automático do banco de dados com dados de teste ao iniciar a aplicação em perfis de
  desenvolvimento.
- **Deploy na Nuvem**: Roteiro completo para realizar o deploy da aplicação na plataforma Heroku.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Hibernate**
- **Banco de Dados H2 (Perfil de Teste)**
- **PostgreSQL (Perfis de Desenvolvimento e Produção)**
- **Maven**
- **Heroku**

## 🚀 Como Executar Localmente

Siga os passos abaixo para configurar e executar o projeto em seu ambiente de desenvolvimento.

### Pré-requisitos

- **JDK 17** ou superior
- **Maven 3.8+**
- **PostgreSQL 14** ou superior (instalado e em execução)

### Passos

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/juniorSousa14/workshop-springBoot-JPA.git
   ```

2. **Crie o banco de dados no PostgreSQL:**
   Utilize uma ferramenta como o pgAdmin ou o DBeaver e crie um novo banco de dados. O nome esperado no arquivo de
   configuração é `springboot_course`.

3. **Configure o Perfil de Desenvolvimento:**
   No arquivo `src/main/resources/application.properties`, defina o perfil ativo como `dev`:
   ```properties
   spring.profiles.active=dev
   ```
   As credenciais do seu banco de dados local devem ser ajustadas no arquivo
   `src/main/resources/application-dev.properties`.

4. **Execute a aplicação:**
   Utilize o Maven para iniciar o servidor.
   ```bash
   mvn spring-boot:run
   ```

5. **Acesse a API:**
   A aplicação estará disponível em `http://localhost:8080`. O banco de dados H2 (para o perfil `test`) pode ser
   acessado em `http://localhost:8080/h2-console`.

## 📖 Endpoints da API (CRUD de Usuários)

| Método   | Endpoint      | Descrição                                 | Corpo da Requisição de Exemplo                |
| :------- | :------------ | :---------------------------------------- | :-------------------------------------------- |
| **`GET`** | `/users`      | Retorna uma lista de todos os usuários.   | N/A                                           |
| **`GET`** | `/users/{id}` | Busca um usuário específico pelo ID.      | N/A                                           |
| **`POST`** | `/users`      | Cria um novo usuário.                     | `{ "name": "Bob", "email": "bob@gmail.com" }` |
| **`PUT`** | `/users/{id}` | Atualiza os dados de um usuário.          | `{ "name": "Bob Brown", "phone": "987654321" }` |
| **`DELETE`** | `/users/{id}` | Deleta um usuário pelo ID.                | N/A                                           |

---
_Este projeto é baseado no material didático do curso **Java COMPLETO** do Dr. Nelio Alves._