# Who is that monster - Backend

## 🧩 Branches structure
- **Main branches:**
    - `main` → Stable code (production)
    - `develop` → New functionality integration (development)
- **Temporary branches (each member):**
    - `feature/` → New functionalities
    - `fix/` → Error fixing
    - `hotfix/` → Urgent fixing on `main`

## 🔄 Workflow (Git Flow Simplified)
1. Clone the repository:
   ```bash
   git clone <URL-del-repo>
   git checkout develop
   git pull
   ```

2. Create your temporary branch from `develop`:
   ```bash
   git checkout -b feature/new-feature
   ```

3. Do your work and make commits following the **Conventional Commits** format.

4. Push your branch:
   ```bash
   git push origin feature/new-feature
   ```

5. Open a **Pull Request** → `develop`
   - The `PR` must have a clear description of the new functionality.
   - Don't do a push to `develop` or `main` directly.

6. Wait for the leader's review and approval before merging.

7. When `develop` is stable, a `release/*` branch will be created then, merged to `main`.


## 🏷️ Naming Conventions

Use short, clear and lowercase names:

- `feature/login-api`
- `feature/create-event`
- `fix/validation-error`
- `hotfix/bug-deploy`


## ✍️ Conventional Commits

Format:
```
<type>: <short description>
```

**Most used types:**
- `feat:` new functionality
- `fix:` Error fixing
- `refactor:` code improvement without changing functionality
- `docs:` changes in documentation
- `style:` format or style (spaces, commas, etc.)
- `test:` add or modify tests

**Examples:**
```bash
git commit -m "feat: add endpoint to new user creation"
git commit -m "fix: mail validation fix"
```

## 🧠 Good practices
- Pull frequently from `develop` to avoid conflicts:
  ```bash
  git pull origin develop
  ```
- Small and descriptive commits.
- Review and comment other's PRs.
- Don't work directly in `develop` or `main`.
- Resolve conversations before merging.

---

## 👑 Roles
- **Backend Leader:** manage merges to `develop` and `main`.
- **Collaborators:** create branches, make PRs and wait for approval.

---

**💬 Reminder:**

The order, names, and revisions ensure a clean, collaborative, and conflict-free flow.
If you have any questions, please ask before merging.
