# 📋 Painel Administrativo - Produtos (JavaFX + API REST)

Este é um aplicativo JavaFX que funciona como um painel administrativo para gerenciamento de produtos. Ele consome uma API RESTful (desenvolvida em Spring Boot) para realizar operações de **CRUD (Create, Read, Update, Delete)** via JSON.

---

### 🎯 Funcionalidades

✅ Listagem de produtos  
✅ Cadastro de novos produtos  
✅ Edição de produtos existentes  
✅ Exclusão de produtos  
✅ Busca por ID  
✅ Contador de registros (Total de produtos)  
✅ Validação de campos obrigatórios  
✅ Interface com CSS personalizado (cores, fontes e botões)  
✅ Comunicação com a API via requisições HTTP (GET, POST, PUT, DELETE)

---

### 🔗 Link da API REST (Trabalho 1 - N2)

- API local rodando na porta: `http://localhost:8083/api/produtos`
- Você precisa ter a API rodando antes de abrir o JavaFX.

---

### ▶️ Como executar o projeto

#### Pré-requisitos:

- Java 17 ou superior ✅  
- JavaFX SDK ✅  
- Biblioteca Jackson (para JSON) ✅  
- API REST de Produtos já rodando ✅  

---

#### Passos para executar:

1. Clone o projeto:

```bash
git clone https://github.com/rafaelaziegler/paineladminprodutos.git
```

2. Abra no IntelliJ IDEA (ou Eclipse).

3. Configure o SDK do Java e o módulo path do JavaFX.

4. Compile e rode a classe:

```
Main.java
```

5. **Antes de executar:**  
Certifique-se de que a API REST está rodando localmente em:

```
http://localhost:8083
```

---

### 🎨 Interface Personalizada

- Cores predominantes: Azul escuro nos botões  
- Layout simples com uso de JavaFX + CSS  
- Validações de campos  
- Mensagens de sucesso e erro com `Alert`

---

### 📁 Estrutura de Pastas (camadas):

```
src/
├── com.paineladminprodutos
│    ├── Main.java
│    ├── model/
│    ├── controller/
│    ├── css/
│    └── view/
```

---


