🚀 MR_DEL | Sistema de Pedidos e Produtos

Uma API RESTful para um sistema de pedidos e gerenciamento de produtos, desenvolvida com Spring Boot 3 e focada em segurança utilizando JSON Web Tokens (JWT).

🎯 Funcionalidades Principais

    Autenticação JWT: Login (ADMIN e CLIENTE) e registro de novos usuários (CLIENTE).

    Autorização Baseada em Papéis: Diferenciação de permissões via ROLE_ADMIN e ROLE_CLIENTE.

    Gerenciamento de Produtos: CRUD completo, protegido por autenticação (acessível apenas por ADMINs).

    Catálogo Público: Rota pública para visualização de produtos (sem necessidade de token).

    Persistência de Dados: Utiliza PostgreSQL com JPA/Hibernate.

🛠️ Tecnologias Utilizadas

Categoria	Tecnologia	Versão
Backend	Spring Boot	3.2.0
Linguagem	Java	21+
Segurança	Spring Security, JJWT (JWT)	6.2.0
Banco de Dados	PostgreSQL	-
Persistência	Spring Data JPA, Hibernate	-

⚙️ Configuração e Execução

1. Pré-requisitos

Você precisará ter instalado:

    JDK (Java Development Kit) 21 ou superior.

    Maven (para gerenciamento de dependências).

    PostgreSQL (servidor de banco de dados).

    Postman ou ferramenta similar para testar os endpoints.
