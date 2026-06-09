# Projeto Tabela FIPE

Este projeto foi desenvolvido como desafio no curso de Java da Alura, com o objetivo de consumir dados da Tabela FIPE por meio de uma API pública. A aplicação permite ao usuário analisar os preços de automóveis de forma mais amigável via terminal, com base em parâmetros como ano e modelo.

---

### Detalhes do Projeto
- Consumo de API pública
- Desserialização de dados JSON com Jackson
- Manipulação e filtragem de dados
- Criação de uma interface amigável via terminal

---

### Boas Práticas e Padrões Aplicados

- **Uso de Generics:** Criação de interface e classe de conversão genéricas para desserializar qualquer tipo de JSON com Jackson.
- **Java Streams:** Uso de `.filter()` e `.map()` para processar, filtrar e exibir os dados de preços de forma limpa.

---

### Tecnologias:
- **Java 21**

---

### API Utilizada
[https://deividfortuna.github.io/fipe/](https://deividfortuna.github.io/fipe/?ref=dr-pa&utm_medium=public-apis-website)

---

### Como Executar

- Adicionar a dependência do Jackson ao projeto
- Executar a classe principal pela IDE

---

### Imagens da Execução do Programa

#### 1. Tipo de Veículo (há 3 tipos de veículos possíveis para pesquisar no sistema: carro, moto e caminhão):
<img width="493" height="638" alt="image" src="https://github.com/user-attachments/assets/ad54c993-0964-40e9-8101-f000b77d1077" />



#### 2. Marca do Veículo:
<img width="541" height="603" alt="image" src="https://github.com/user-attachments/assets/04e4d93d-5c1a-45fc-8ad0-b1126693921d" />



#### 3. Modelo do Veículo:
<img width="489" height="308" alt="image" src="https://github.com/user-attachments/assets/9bfd637d-9e26-4873-a35f-c33a8e48c74c" />



#### 4. Ano do Veículo:
<img width="488" height="370" alt="image" src="https://github.com/user-attachments/assets/bddabe25-ec29-424f-9998-8c0958831b7e" />
