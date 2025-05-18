# 💱 Conversor de Moedas - Java Console

Um conversor de moedas simples e interativo via terminal, desenvolvido em Java. O sistema consome taxas de câmbio em tempo real a partir da [ExchangeRate API](https://www.exchangerate-api.com/), garantindo precisão nas conversões.

---

## 🚀 Funcionalidades

- Menu interativo com 6 conversões pré-definidas:
    - USD ⇄ BRL
    - EUR ⇄ BRL
    - GBP ⇄ BRL
- Busca **online** da taxa de câmbio mais recente.
- Conversão em tempo real de qualquer valor informado.
- Leitura segura da API KEY via arquivo `api.properties`.

---

## 🛠️ Tecnologias Utilizadas

- Java 11+
- Maven
- Gson (para leitura do JSON)
- ExchangeRate API

---

## 🧩 Pré-requisitos

- Java 11 ou superior
- Maven instalado
- Conta gratuita na [ExchangeRate API](https://app.exchangerate-api.com/) para gerar sua API KEY

---

## ⚙️ Como rodar

1. **Clone o projeto:**

```bash
git clone https://github.com/seu-usuario/conversor-moedas.git
cd conversor-moedas


Claro, Mestre! Aqui está um `README.md` completinho e elegante para o seu projeto **Conversor de Moedas em Java**, com tudo bem explicado para desenvolvedores entenderem como rodar, configurar e usar:

---

### 📄 `README.md`

````markdown
# 💱 Conversor de Moedas - Java Console

Um conversor de moedas simples e interativo via terminal, desenvolvido em Java. O sistema consome taxas de câmbio em tempo real a partir da [ExchangeRate API](https://www.exchangerate-api.com/), garantindo precisão nas conversões.

---

## 🚀 Funcionalidades

- Menu interativo com 6 conversões pré-definidas:
  - USD ⇄ BRL
  - EUR ⇄ BRL
  - GBP ⇄ BRL
- Busca **online** da taxa de câmbio mais recente.
- Conversão em tempo real de qualquer valor informado.
- Leitura segura da API KEY via arquivo `api.properties`.

---

## 🛠️ Tecnologias Utilizadas

- Java 11+
- Maven
- Gson (para leitura do JSON)
- ExchangeRate API

---

## 🧩 Pré-requisitos

- Java 11 ou superior
- Maven instalado
- Conta gratuita na [ExchangeRate API](https://app.exchangerate-api.com/) para gerar sua API KEY

---

## ⚙️ Como rodar

1. **Clone o projeto:**

```bash
git clone https://github.com/seu-usuario/conversor-moedas.git
cd conversor-moedas
````

2. **Configure sua chave de API:**

Crie o arquivo `src/main/resources/api.properties` com o seguinte conteúdo:

```properties
API_KEY=sua_api_key_aqui
```

> 🔐 Não versionar esse arquivo! Ele já está no `.gitignore`.

3. **Compile o projeto:**

```bash
mvn package
```

4. **Execute o conversor:**

```bash
java -cp target/conversor-moedas-1.0-SNAPSHOT.jar ConversorApp
```

---

## 🧪 Exemplo de uso

```
=== Conversor de Moedas ===
1. USD -> BRL
2. BRL -> USD
...
Escolha uma opção: 1
Digite o valor a converter: 100
100.00 USD = 507.53 BRL (Taxa: 5.0753)
```

---

## 🔐 Segurança

Sua chave de API está armazenada no arquivo `api.properties`, que **não deve ser commitado**. Use o `api.example.properties` como modelo para compartilhar com outros devs.

---

## 📄 Licença

Este projeto é livre para fins de estudo e aprendizado. Fique à vontade para modificar e expandir!

---

## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar PRs.
