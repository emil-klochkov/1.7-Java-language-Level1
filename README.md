# 📄 README: Java Inheritance and Method Overriding Exercises
# 🧩 Ex1 — Salary Calculation with Inheritance
## 1. Worker.java

Base class representing a generic worker.

Stores name, surname, and hourly rate.

Method calculateSalary returns salary based on hours worked.

## 2. OnsiteWorker.java

Subclass of Worker.

Overrides calculateSalary to include a fixed fuel cost (50.0).

## 3. OnlineWorker.java

Subclass of Worker.

Overrides calculateSalary to include a fixed internet fee (30.0).

## 4. Main.java

Creates and compares salary calculations for each worker type using 160 hours.

# 🧩 Ex2 — Deprecated Methods and Extended Behavior
## 1. Worker.java

Same as in Ex1: base class with common fields and salary calculation.

## 2. OnsiteWorker.java

Extends Worker.

Overrides calculateSalary and includes a deprecated method worksInStore() to show legacy behavior.

## 3. OnlineWorker.java

Extends Worker.

Overrides calculateSalary and includes a deprecated method worksFromHome().

## 4. Main.java

Demonstrates usage of deprecated methods with suppression of warnings.
