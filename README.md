# Demo Spring Boot

Projeto educacional com endpoint de diagnóstico `GET /api/status`.

## Executar
Instale um JDK compatível com o projeto (Java 23 na versão atual), baixe e extraia o ZIP, entre na pasta `demo` e execute `./mvnw spring-boot:run` (Windows: `mvnw.cmd spring-boot:run`). Abra `http://localhost:8080/api/status`.

Testes: `./mvnw test`. Não é uma API de produção: não há cadastro de usuários ou autenticação. Migração para JDK LTS e atualização de Spring Boot devem ser testadas antes de uso público.
