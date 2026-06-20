# Projeto Tabela FIPE

Este projeto foi desenvolvido como desafio no curso de Java da Alura, com o objetivo de consumir dados da Tabela FIPE por meio de uma API pública. A aplicação permite ao usuário analisar os preços de automóveis de forma mais amigável via terminal, com base em parâmetros como ano e modelo.

---

## Objetivos

- Consumir uma API REST externa utilizando as classes nativas do Java (`HttpClient`, `HttpRequest` e `HttpResponse`).
- Realizar a conversão de JSON para objetos e listas Java (DTOs) utilizando a biblioteca Jackson, sem o uso de um gerenciador de dependências.
- Implementar uma interface de terminal interativa com múltiplos níveis de filtros (Tipo -> Marca -> Modelo -> Ano).
- Aplicar o conceito de Generics no Java para criar um conversor de dados reutilizável.

---

## Tecnologias Utilizadas:
- **Java 21**
- **Jackson** (biblioteca para serialização e desserialização de JSON)

---

## API Pública Utilizada
[https://deividfortuna.github.io/fipe/](https://deividfortuna.github.io/fipe/?ref=dr-pa&utm_medium=public-apis-website)

---

## Como Executar

1. Certifique-se de ter o **Java 21+** instalado.
2. Clone o repositório.
3. Adicionar a dependência do Jackson ao projeto.
4. Executar a classe principal pela IDE a escolha.

---

## Imagens da Execução do Programa

### 1. Tipo de Veículo (há 3 tipos de veículos possíveis para pesquisar no sistema: carro, moto e caminhão):
<img width="493" height="638" alt="image" src="https://github.com/user-attachments/assets/ad54c993-0964-40e9-8101-f000b77d1077" />



### 2. Marca do Veículo:
<img width="541" height="603" alt="image" src="https://github.com/user-attachments/assets/04e4d93d-5c1a-45fc-8ad0-b1126693921d" />



### 3. Modelo do Veículo:
<img width="489" height="308" alt="image" src="https://github.com/user-attachments/assets/9bfd637d-9e26-4873-a35f-c33a8e48c74c" />



### 4. Ano do Veículo:
<img width="488" height="370" alt="image" src="https://github.com/user-attachments/assets/bddabe25-ec29-424f-9998-8c0958831b7e" />
