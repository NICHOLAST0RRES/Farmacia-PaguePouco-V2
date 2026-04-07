# 💊 Farmácia PaguePouco — API REST

API RESTful desenvolvida com **Spring Boot 3** para gerenciamento de uma farmácia fictícia. O projeto foi criado com fins de estudo, aplicando boas práticas de desenvolvimento back-end, autenticação com JWT e documentação automática via Swagger.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Versão | Descrição |
|---|---|---|
| Java | 17 | Linguagem principal |
| Spring Boot | 3.2.5 | Framework base |
| Spring Security | — | Autenticação e autorização |
| Spring Data JPA | — | Persistência de dados |
| Spring Validation | — | Validação de dados nas requisições |
| MySQL | — | Banco de dados relacional |
| Flyway | — | Migrations e versionamento do banco |
| Auth0 Java JWT | 4.2.1 | Geração e validação de tokens JWT |
| Lombok | — | Redução de boilerplate |
| SpringDoc OpenAPI | 2.0.2 | Documentação interativa (Swagger UI) |
| Maven | — | Gerenciamento de dependências e build |

---

## 📋 Pré-requisitos

Antes de rodar o projeto, certifique-se de ter instalado:

- Java 17+
- Maven 3.8+
- MySQL 8.0+

---

## ⚙️ Configuração

### 1. Clone o repositório

```bash
git clone https://github.com/NICHOLAST0RRES/Farmacia-PaguePouco-V2.git
cd Farmacia-PaguePouco-V2
```

### 2. Configure o banco de dados

Crie um banco de dados MySQL:

```sql
CREATE DATABASE farmacia_paguepouco;
```

### 3. Configure o `application.properties`

Edite o arquivo `src/main/resources/application.properties` com suas credenciais:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/farmacia_paguepouco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

api.security.token.secret=seu_secret_jwt_aqui
```

### 4. Execute as migrations

O Flyway executa as migrations automaticamente ao subir a aplicação.

### 5. Rode a aplicação

```bash
./mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 📖 Documentação (Swagger UI)

Após subir a aplicação, acesse a documentação interativa:

```
http://localhost:8080/swagger-ui.html
```

---

## 🔐 Autenticação

A API utiliza **JWT (JSON Web Token)** para autenticação. O fluxo é:

1. Faça login no endpoint de autenticação e receba um token.
2. Inclua o token no header de todas as requisições protegidas:

```
Authorization: Bearer <seu_token_aqui>
```

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    ├── java/com/paguepouco/api/
    │   ├── controller/       # Endpoints REST
    │   ├── domain/           # Entidades e regras de negócio
    │   ├── infra/
    │   │   ├── security/     # Configurações de segurança e JWT
    │   │   └── exception/    # Tratamento de exceções
    │   └── repository/       # Interfaces de acesso ao banco
    └── resources/
        ├── application.properties
        └── db/migration/     # Scripts SQL do Flyway
```

---

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

---

## 👤 Autor

**Nicholas Lima de Queiroz Tôrres**
- GitHub: [@NICHOLAST0RRES](https://github.com/NICHOLAST0RRES)

---

## 📄 Licença

Este projeto foi desenvolvido para fins de estudo e aprendizado.
