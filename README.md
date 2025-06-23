# TP4 Backlog - Integración Continua con GitHub Actions

---

## Descripción del Proyecto

Este proyecto es un trabajo práctico para la materia que consiste en aplicar Integración Continua (CI) usando GitHub Actions sobre un proyecto Java con Gradle.

Se desarrollaron dos clases principales:

- `Usuario`: con funcionalidades relacionadas a usuarios premium, validación de email y nombre.
- `Pato`: con métodos que simulan comportamientos (nadar, volar, caminar) y propiedades como región, tamaño y migración.

---

## Pruebas Unitarias

Se implementaron múltiples pruebas unitarias para garantizar la calidad del código:

### Tests de Usuario

- Verificación de usuario premium para poder simular (`puedeSimular`).
- Validación básica del email (`emailValido`).
- Validación del nombre (primera letra mayúscula).
- Setters y getters.

### Tests de Pato

- Métodos `swim()`, `walk()`, `fly()` que retornan strings específicos.
- Comprobación de región, tamaño en rango y migración.
- Formato de nombre para ficha.
- Setters y getters.


---

## Integración Continua (CI) con GitHub Actions

Se configuró un pipeline en `.github/workflows/ci.yml` que:

- Se ejecuta automáticamente en cada push o pull request.
- Configura JDK 17 (Temurin).
- Usa Gradle con caching para optimizar tiempos.
- Ejecuta `./gradlew build`, que compila el proyecto y corre los tests.
- Envía el grafo de dependencias para alertas de seguridad (requiere habilitar el *Dependency graph* en la configuración del repositorio).

Esto garantiza que cada cambio pase por un proceso automatizado que asegura la compilación correcta y la validación mediante pruebas.

---

## Resultados

- El pipeline de GitHub Actions corre sin errores y valida cada cambio.
- Los tests unitarios se ejecutan correctamente, asegurando la estabilidad del código.
- Se habilitó el grafo de dependencias para mantener la seguridad del proyecto.

---

## Ventajas y Desventajas de GitHub Actions en proyectos

| Ventajas                                       | Desventajas                                    |
|------------------------------------------------|-----------------------------------------------|
| Automatiza compilación y pruebas                | Requiere configuración inicial                |
| Detecta errores antes de mergear                | Puede aumentar tiempo de ejecución             |
| Mejora la calidad del código y colaboración     | Necesita aprendizaje para usuarios nuevos      |
| Permite alertas de seguridad en dependencias    | Algunos jobs pueden consumir recursos          |



