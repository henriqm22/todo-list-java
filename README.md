# 📝 To-Do List em Java (Console)

Um projeto simples de **lista de tarefas (To-Do List)** feito em **Java**, rodando no console.
Foi desenvolvido com foco em praticar **Programação Orientada a Objetos (POO)**, entrada/saída de dados e persistência em arquivo.

---

## 🚀 Funcionalidades

* ➕ Adicionar novas tarefas
* 📋 Listar todas as tarefas
* ✅ Marcar tarefas como concluídas
* ❌ Remover tarefas
* 💾 Salvar e carregar automaticamente as tarefas no arquivo `tasks.txt`

---

## 🛠️ Tecnologias Utilizadas

* **Java 17**
* **IntelliJ IDEA Community** (IDE recomendada, mas pode rodar em qualquer IDE como Eclipse ou NetBeans)

---

## 📂 Estrutura do Projeto

```
todo-list/
 ├─ src/
 │   ├─ Main.java        → ponto de entrada do programa (menu no console)
 │   ├─ Task.java        → classe que representa uma tarefa
 │   ├─ TaskManager.java → gerencia as tarefas e interação com o arquivo
 ├─ tasks.txt            → arquivo onde as tarefas são salvas
 └─ README.md            → documentação do projeto
```

---

## ▶️ Como Executar

1. Certifique-se de ter o **Java 17+** instalado.
2. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/todo-list-java.git
   ```
3. Abra o projeto em sua IDE ou compile pelo terminal:

   ```bash
   javac src/*.java
   java -cp src Main
   ```
4. Use o menu interativo no console para gerenciar suas tarefas.

---

## 📸 Exemplo de Uso

```
==== TO-DO LIST ====
1. Adicionar tarefa
2. Listar tarefas
3. Marcar tarefa como concluída
4. Remover tarefa
5. Sair
Escolha uma opção: 1
Digite a descrição da tarefa: Estudar Java

==== TO-DO LIST ====
1. Adicionar tarefa
2. Listar tarefas
3. Marcar tarefa como concluída
4. Remover tarefa
5. Sair
Escolha uma opção: 2
1. [ ] Estudar Java
```

---

## 🌟 Possíveis Melhorias Futuras

* Interface gráfica com **JavaFX**
* Exportar/Importar tarefas em **JSON**
* Organização das tarefas por **prioridade** ou **data de entrega**
* Testes automatizados com **JUnit**

---

## 👤 Autor

Feito por **[Mateus Henrique](https://github.com/henriqm22)**
Sinta-se à vontade para dar sugestões ou contribuir!
