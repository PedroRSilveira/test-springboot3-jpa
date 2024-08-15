# test-spring-boot3
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/PedroRSilveira/test-springboot3-jpa/blob/main/LICENSE)
# Sobre o projeto

O projeto "Demo Spring Boot" é uma aplicação web para gerenciamento de produtos, categorias, usuários e pedidos. O sistema foi desenvolvido utilizando o Spring Boot, permitindo a realização de operações CRUD e a visualização de dados interativos.

O software é voltado para a demonstração de operações básicas em um e-commerce, incluindo a criação, leitura, atualização e exclusão de produtos, categorias, usuários e pedidos.

# Modelo Conceitual

A aplicação utiliza um modelo conceitual baseado em um design de domínio com entidades relacionadas como Category, Product, User, Order, OrderItem e Payment. O relacionamento entre essas entidades é gerenciado pelo JPA (Java Persistence API), e a aplicação inclui também um controlador de exceções para tratamento de erros.

Adcicionar imagem :)

# Tecnologias Utilizadas

- Java - Linguagem de programação utilizada para o backend.
- Spring Boot - Framework para criar aplicações Java baseadas em Spring com configuração mínima.
- MySQL - Sistema de gerenciamento de banco de dados utilizado para armazenar as informações.
- JPA/Hibernate - Para o mapeamento objeto-relacional (ORM) e persistência de dados.

 # Funcionalidades do Software

## Category:

- findAll: Retorna uma lista com todas as categorias cadastradas no banco de dados.
- findById: Procura no banco de dados a categoria com o ID especificado e retorna suas informações.

## Order:

- findAll: Retorna uma lista com todos os pedidos cadastrados no banco de dados.
- findById: Procura no banco de dados o pedido com o ID especificado e retorna suas informações.

## Product:

- findAll: Retorna uma lista com todos os produtos cadastrados no banco de dados.
- findById: Procura no banco de dados o produto com o ID especificado e retorna suas informações.

## User:

- findAll: Retorna uma lista com todos os usuários cadastrados no banco de dados.
- findById: Procura no banco de dados o usuário com o ID especificado e retorna suas informações.
- insert: Adiciona um novo usuário ao banco de dados.
- delete: Exclui o usuário especificado do banco de dados.
- update: Atualiza as informações de um usuário existente.
