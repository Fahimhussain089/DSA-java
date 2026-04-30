# DSA-Java

A personal collection of **Data Structures & Algorithms** problems solved in **Java**.
Topics covered include recursion, backtracking, sorting, searching, patterns,
2-D arrays, linked lists, mazes, and many LeetCode-style practice problems.

---

## Project Structure

```
DSA-Java/
├── DSA_WITH_JAVA/
│   └── src/                      <-- Main source folder (all .java files)
│       ├── Main.java
│       ├── Backtracking/
│       │   └── sudoko.java
│       ├── LinkedList/
│       ├── TwoDArray/
│       │   ├── ExitPoint.java
│       │   ├── MatrixMult.java
│       │   ├── rotateNinty.java
│       │   ├── shellRotate.java
│       │   ├── spiralTraversal.java
│       │   └── wavetravel.java
│       ├── maze/
│       │   └── backtracking.java
│       └── recursion/
│           ├── Knight.java
│           ├── Nqueen.java
│           ├── allPath.java
│           ├── basic.java
│           ├── bubleshot.java
│           ├── combinationString.java
│           ├── dice.java
│           ├── isPrime.java
│           ├── keyboard.java
│           ├── mergshort.java
│           ├── pathRes.java
│           ├── quicksort.java
│           ├── selectionsort.java
│           ├── stringsort.java
│           ├── subArrayString.java
│           ├── subseq.java
│           ├── subset.java
│           └── triangle.java
├── IdeaProjects/                 <-- Older practice (compiled .class only, see note)
├── .gitignore
└── README.md
```

> **Note about `IdeaProjects/`:** this folder currently contains only
> compiled `.class` files (no `.java` source). They are ignored by Git via
> `.gitignore`. If you still have the original `.java` files, drop them
> into the matching folder and they will be picked up automatically.

---

## Requirements

- **JDK 8** or higher (JDK 17+ recommended)
- Any of these (optional):
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/) (Community Edition is free)
  - [VS Code](https://code.visualstudio.com/) with the *Extension Pack for Java*
  - Plain terminal (`javac` + `java`)

Check your Java version:

```bash
java -version
javac -version
```

---

## How to Clone and Run

### 1. Clone the repository

```bash
git clone https://github.com/<your-username>/DSA-Java.git
cd DSA-Java
```

### 2. Run from the terminal

Compile and run any single file. Example for `Main.java`:

```bash
cd DSA_WITH_JAVA/src
javac Main.java
java Main
```

Example for a file inside a package folder (e.g. `recursion/Nqueen.java`):

```bash
cd DSA_WITH_JAVA/src
javac recursion/Nqueen.java
java recursion.Nqueen
```

> The folder name (e.g. `recursion`) acts as the Java package, so use a
> dot (`.`) instead of a slash when running with `java`.

### 3. Run in IntelliJ IDEA

1. Open IntelliJ IDEA → **File → Open** → select the `DSA-Java` folder.
2. IntelliJ will detect the Java module automatically.
3. If it doesn't, right-click `DSA_WITH_JAVA/src` → **Mark Directory as → Sources Root**.
4. Open any `.java` file and press the green ▶ button (or `Ctrl+Shift+F10`).

### 4. Run in VS Code

1. Install the **Extension Pack for Java**.
2. Open the `DSA-Java` folder.
3. Open any `.java` file and click **Run** above the `main` method.

---

## Topics Covered

- Basics of Java
- Patterns (number, alphabet, shape patterns)
- Searching (Linear, Binary, Order-Agnostic Binary Search)
- Sorting (Bubble, Selection, Merge, Quick)
- Recursion (factorial, prime, dice throws, subsequences, subsets, permutations)
- Backtracking (N-Queen, Sudoku, Maze, Knight's Tour)
- 2-D Arrays (spiral traversal, wave traversal, rotate 90°, matrix multiplication)
- Linked Lists
- LeetCode practice problems (Two Sum, Palindrome, etc.)

---

## Author

Made while learning DSA in Java. Contributions / suggestions are welcome.
