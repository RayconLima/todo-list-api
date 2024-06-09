Desafio: API Todo List com Spring Boot

Introdução:

Este desafio visa desenvolver uma API RESTful para gerenciar uma lista de tarefas utilizando Spring Boot. A API deve permitir a criação, leitura, atualização e exclusão de tarefas, além de outras funcionalidades relevantes.

Tecnologias:
- Spring Boot
- Spring Data JPA
- Banco de dados relacional (h2database)

Funcionalidades:
- Criar uma tarefa (Todo: name, description, priority, finish)
- Ler todas as tarefas
- Ler uma tarefa específica por ID
- Atualizar uma tarefa (Todo: name, description, priority, finish)
- Excluir uma tarefa
- Marcar uma tarefa como finalizada
- Criar uma subtarefa (Task: name, description, finish)
- Ler todas as subtarefas
- Ler uma subtarefa específica por ID
- Atualizar uma subtarefa (Task: name, description, finish)
- Excluir uma subtarefa
- Marcar uma subtarefa como finalizada

Requisitos:
- Criar um projeto Spring Boot
- Definir entidades para representar tarefas e outros dados relevantes
- Implementar repositórios Spring Data JPA para acesso ao banco de dados
- Criar controladores RESTful para lidar com requisições HTTP
- Testar a API com ferramentas como Postman, Insomnia, Hoppscotch ou swagger-ui

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```
A API poderá ser acessada em localhost:8080. O Swagger poderá ser visualizado em localhost:8080/swagger-ui.html

Recursos Úteis:
- Documentação Spring Boot: https://start.spring.io/
- Documentação Spring Data JPA: https://spring.io/projects/spring-data-jpa
- Exemplos de API Todo List: https://github.com/osopromadze/Spring-Boot-Blog-REST-API