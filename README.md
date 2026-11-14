# Task26-Build-a-Multithreaded-Number-Processor
java calculation

# Multithreaded Number Processor (Java)

## 📌 Project Overview
The Multithreaded Number Processor is a Java application that demonstrates the use of multithreading to improve program execution.

The program counts prime numbers within a given range using two approaches:
1. Single-threaded processing
2. Multithreaded processing

It compares the execution time of both approaches to understand the performance differences.

## 🎯 Objectives
- Understand Java multithreading.
- Implement single-threaded processing.
- Implement multithreaded processing.
- Divide a large task into smaller tasks.
- Compare execution time.
- Understand thread safety.

## 🛠️ Technologies Used
- **Programming Language:** Java
- **Concepts:** Multithreading, ExecutorService, Future, Thread Safety
- **IDE:** VS Code / IntelliJ IDEA / Online Java Compiler

## ⚙️ Features
- Checks whether a number is prime.
- Counts prime numbers using a single thread.
- Processes number ranges using multiple threads.
- Combines results from all threads.
- Measures execution time using `System.nanoTime()`.
- Compares single-threaded and multithreaded performance.

## 📂 Project Structure

```text
NumberProcessor/
│
├── Task26.java
└── README.md
```

## 🚀 How to Run the Project

**Step 1:** Install Java JDK.

**Step 2:** Create a file named `Task26.java`.

**Step 3:** Copy the Java source code into the file.

**Step 4:** Open the terminal in the project folder.

**Step 5:** Compile the program.

```bash
javac Task26.java
```

**Step 6:** Run the program.

```bash
java Task26
```

## 📊 Sample Output

```text
Number Processor
------------------------
Limit: 1000000
Threads: 8

Single Thread Result: 78498
Single Thread Time: ... ms

Multi Thread Result: 78498
Multi Thread Time: ... ms

Execution Comparison:
Multithreading is faster in this run.

Both results are equal: true
```

*Note: Execution time and number of threads may vary depending on the system.*

## 🧵 Concepts Learned

### 1. Multithreading
Executing multiple tasks concurrently using multiple threads.

### 2. ExecutorService
Manages and executes multiple threads efficiently.

### 3. Future
Retrieves the result of a task executed by another thread.

### 4. Thread Safety
Ensures that multiple threads execute without producing incorrect results.

### 5. Performance Comparison
Measures and compares the execution time of single-threaded and multithreaded processing.

## 📈 Conclusion

This project helped me understand how Java multithreading works and how a large task can be divided into smaller tasks.

By comparing single-threaded and multithreaded execution, I learned how multiple threads can improve processing performance depending on system resources and workload.
