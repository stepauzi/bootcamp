# Copilot Instructions for the Bootcamp Java Codebase

## Overview
This workspace contains multiple Java demo projects, each in its own folder (`demo-apie`, `demo-array`, `demo-basics`, `demo-class-object`). Each project is organized with a `src` directory for source code and may include a `README.md` for project-specific notes. There is no monolithic application; instead, each folder demonstrates a distinct Java concept or feature.

## Architecture & Structure
- **Project Folders:** Each subfolder under the workspace root is a separate Java demo. There is no cross-project dependency.
- **Source Code:** Java files are located in `src/` within each demo folder. Some demos use further subfolders for package organization (e.g., `customer/`, `hero/`, `library/`, etc.).
- **No Build Scripts:** There are no Maven/Gradle build files. Compilation is typically managed by the VS Code Java extension or manually via `javac`.
- **No External Dependencies:** All code is pure Java, except for standard library usage (e.g., `BigDecimal`).

## Developer Workflows
- **Editing:** Open the relevant `src/` folder and edit Java files directly.
- **Compiling:** Use VS Code's Java extension (automatic build) or run `javac src/**/*.java` from the terminal in the demo folder.
- **Running:** Use VS Code's Run/Debug features or run `java -cp src <MainClass>` from the terminal.
- **Testing:** There are no formal unit tests; validation is done by running the `main` method in each demo file.

## Conventions & Patterns
- **Single-Class Demos:** Most files contain a single class with a `main` method for demonstration.
- **Package Structure:** Some demos use subfolders to group related classes (e.g., `customer/Order.java`).
- **No Frameworks:** All code is written in plain Java, focusing on language features and basic OOP.
- **README Files:** Each demo folder has a `README.md` with setup and usage notes. The root `README.md` is minimal.
- **Settings:** Project structure can be customized via `.vscode/settings.json` (not present by default).

## Examples
- To demonstrate inheritance, see `demo-apie/src/inheritance/Animal.java`, `Cat.java`, `Dog.java`.
- For array operations, see `demo-array/src/DemoArray1.java`, `DemoArray2.java`.
- For OOP and class/object patterns, see `demo-class-object/src/customer/Customer.java`, `Order.java`.

## Integration Points
- **VS Code Java Extension:** The workspace is designed for use with VS Code's Java support. No other integrations are present.

## Tips for AI Agents
- Focus on the `src/` directory in each demo folder for code changes.
- When adding new demos, follow the existing folder and file naming conventions.
- Use the `main` method for demonstration and validation.
- Reference the relevant `README.md` for project-specific instructions.

---

If any section is unclear or missing, please provide feedback to improve these instructions.
