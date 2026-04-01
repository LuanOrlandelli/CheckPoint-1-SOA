# 📦 Pedido Service (SOAP)

## Integrantes
 - Luan Orlandelli Ramos (554747)
 - Arthur Bobadilla Franchi (555056)

## 📌 Descrição

O **Pedido Service** é um Web Service desenvolvido com base na arquitetura orientada a serviços (SOA), utilizando o protocolo SOAP para comunicação entre sistemas distribuídos.

A aplicação foi desenvolvida em **Java 21** com **Jakarta JAX-WS**, permitindo a publicação e consumo de serviços para gerenciamento de pedidos.

---

## 🚀 Contexto de Implantação

O serviço é executado localmente através do endpoint:

http://localhost:8080/pedidos?wsdl

O WSDL (Web Services Description Language) define o contrato do serviço, incluindo:
- Operações disponíveis
- Estrutura das mensagens
- Tipos de dados

Em ambientes de produção, o serviço pode ser implantado em servidores como:
- Apache Tomcat
- Eclipse GlassFish

---

## ❗ Problema Resolvido

O projeto resolve o problema de **integração entre sistemas heterogêneos**, especialmente em ambientes corporativos com sistemas legados.

### 📌 Cenário

Um sistema de e-commerce envia pedidos para um sistema legado de faturamento via SOAP, garantindo:
- Padronização
- Interoperabilidade
- Comunicação confiável via XML

---

## 📋 Regras de Negócio

- Um pedido deve possuir:
  - ID único
  - Nome do cliente
  - Valor maior que zero

### ✅ Validações
- Cliente não pode ser vazio
- Valor deve ser maior que zero

### 🔄 Status do Pedido
- CRIADO
- PROCESSADO

---

## 🧠 Arquitetura e Boas Práticas

- Separação entre contrato e implementação
- Uso de interface (PedidoService)
- Baixo acoplamento (Loose Coupling)
- Comunicação baseada em contrato (WSDL)
- Padronização via XML (SOAP)
- Gerenciamento com Maven

---

## 🔄 Exemplo de Requisição SOAP

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Body>
      <ped:criarPedido>
         <id>1</id>
         <cliente>João</cliente>
         <valor>150.0</valor>
      </ped:criarPedido>
   </soapenv:Body>
</soapenv:Envelope>

---

## 🔁 Exemplo de Resposta

<soapenv:Envelope>
   <soapenv:Body>
      <return>Pedido criado com sucesso</return>
   </soapenv:Body>
</soapenv:Envelope>

---

## 💻 Tecnologias Utilizadas

- Java 21
- Jakarta JAX-WS
- Maven
- SOAP / XML

---

## ▶️ Como Executar

### 1. Rodar o servidor
Publisher.java

### 2. Acessar o WSDL
http://localhost:8080/pedidos?wsdl

### 3. Rodar o cliente
ClienteSOAP.java

---

## ✅ Resultado Esperado

Pedido criado com sucesso
Pedido processado com sucesso
[Pedido{id=1, cliente='João', valor=200.0, status='PROCESSADO'}]

---

## 🔮 Próximas Melhorias

- Persistência em banco de dados
- Autenticação (WS-Security)
- Versionamento de serviços
- Deploy em cloud
- Monitoramento

---
## 🎥 Vídeo Demonstrativo:
https://drive.google.com/file/d/1304Oa2ifWl3UcRkXVwB3bNrPn2CEsXu6/view?usp=sharing

---
## 📚 Conclusão

O projeto demonstra na prática a aplicação de SOA com SOAP, evidenciando conceitos como interoperabilidade, baixo acoplamento e comunicação baseada em contrato.
