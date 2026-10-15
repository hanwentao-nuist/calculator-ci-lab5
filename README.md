# Calculator CI Lab 5

[![Calculator CI](https://github.com/hanwentao-nuist/calculator-ci-lab5/actions/workflows/ci-calculator.yml/badge.svg?branch=main)](https://github.com/hanwentao-nuist/calculator-ci-lab5/actions/workflows/ci-calculator.yml)

Java 17 Maven calculator for Software Development Tools, Lab 5.

## Build and test

```sh
mvn clean test
mvn package
java -jar target/calculator-1.0.0.jar
```

Enter a number, an operator, and another number, for example `10 + 25`.
The 12 JUnit 5 tests cover arithmetic, negative results, zero boundaries,
and division-by-zero exceptions. JaCoCo output is in `target/site/jacoco/`.

## Continuous integration

The workflow `.github/workflows/ci-calculator.yml` runs automatically on
pushes to `main` and pull requests targeting `main`. Each run checks out
source, sets up Temurin JDK 17 and 21 with Maven caching, resolves Maven
dependencies, compiles cleanly, and runs the tests. Dependency resolution
checks artifact availability; it is not a vulnerability scan. The badge
above reflects the latest main-branch workflow status.

This lab implements continuous integration, not automatic deployment.
See the experiment history for the deliberate subtraction regression
and its subsequent repair. Do not merge the demonstration bug into new work.
