# restaurant-system-java

O "restaurant-system" é um microsserviço implementado em Java 17 com Spring Boot. Ele disponibiliza uma API para gerir o espaço físico de um restaurante, começando pela criação de uma comanda de cliente.

## Tecnologias Utilizadas

- Java 17
- Spring Boot

## Funcionalidades

- Criar uma comanda de cliente

## Endpoints

### Criar uma Comanda

#### URL

`POST /check`

#### Descrição

Cria uma nova comanda de cliente.

#### Corpo da Requisição

O corpo da requisição deve ser um JSON no seguinte formato:

```json
{
  "customerName": "Nome do Cliente",
  "customerPhoneNumber": "Telefone do Cliente",
  "items": [
    {
      "productCode": "ABC123",
      "amount": 2
    },
    {
      "productCode": "XYZ456",
      "amount": 1
    }
  ]
}
