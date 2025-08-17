# 📱 Projeto Mobile + Back-End E-commerce

Este repositório contém **dois projetos integrados**:
- 🛠️ **Back-End**: API de e-commerce em **Spring Boot** (pasta `back-end/`)
- 📲 **Front-End Mobile**: aplicativo Android em **Kotlin + Jetpack Compose** (pasta `front-end/`)

---

## 🚀 Estrutura do Repositório
```
/
├── back-end/   → Back-end em Spring Boot
└── front-end/      → Front-end em Android (Kotlin/Compose)
```

---

## ⚙️ Como abrir os projetos

### 🔹 Para trabalhar no **Front-End (Mobile)**
- Abra a pasta `front-end/` diretamente no **Android Studio**.
- O Android Studio só entende bem o projeto Android (Gradle).
- Aqui você vai encontrar as telas (Jetpack Compose), ViewModels, Repositórios e integração com a API.

### 🔹 Para trabalhar no **Back-End (API)**
- Abra a raiz do repositório no **IntelliJ IDEA** ou **VS Code**.
- Eles reconhecem o **Maven** (Spring Boot) e permitem rodar/testar o back normalmente.
- O back-end sobe localmente na porta configurada (`8080` em `application.properties`).

---

## 🌍 Conexão entre Front e Back
- O **Back-End** está hospedado no Render:
  ```
  https://project-ecommerce-api.onrender.com/api/v1/
  ```
- O **Mobile** consome essa API automaticamente (já configurado via `BuildConfig.BASE_URL`).
- Ao subir novas versões do back, o mobile já usa o novo comportamento sem precisar mudar nada no código.

---

## 👥 Responsabilidades da Equipe
| Pessoa  | Responsabilidade Principal | Tarefas |
|---------|----------------------------|---------|
| Pessoa 1 | 🖼️ **Banner** | Criar identidade visual, slogan, problema/solução, mockups no Canva/Figma |
| Pessoa 2 | 📲 **UI/Navegação (Front)** | Criar telas em Compose/XML, implementar navegação, seguir Material Design |
| Pessoa 3 | ⚙️ **ViewModel (Estados)** | Criar estados (loading, erro, dados) e conectar com Repository |
| Pessoa 4 | 🔁 **ViewModel (Eventos/Ações)** | Tratar cliques/formulários, processar intents, login/cadastro/busca |
| Pessoa 5 | 🗃️ **Persistência/API** | Integrar Room ou Firebase, Retrofit para consumir API, repositórios |
| Pessoa 6 | 🧪 **Testes/Publicação** | Testes unitários (JUnit/MockK), testes instrumentados (Espresso), gerar APK/AAB |

---

## 🛠️ Como rodar

### Back-End
```bash
cd back-end
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```
Acesse: [http://localhost:8080/api/v1/health](http://localhost:8080/api/v1/health)

### Front-End
```bash
cd front-end
# Abra no Android Studio
# Escolha o flavor:
# - devDebug → conecta no back local (http://10.0.2.2:8080/api/v1/)
# - stagingDebug → conecta no Render (https://project-ecommerce-api.onrender.com/api/v1/)
```

---

## ✅ Convenção de Branches
- `main` → produção
- `develop` → integração
- `feature/...` → novas features
- `fix/...` → correções

---

📌 **Resumo:**  
- Para **front-end mobile**: abra no **Android Studio** → apenas `front/`.  
- Para **back-end**: abra a **raiz** no IntelliJ/VS Code → vê back e front juntos.  


