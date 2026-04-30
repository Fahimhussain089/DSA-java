# DSA-Java

A personal collection of **Data Structures & Algorithms** problems solved in **Java**.
Topics covered include patterns, searching, sorting, recursion, backtracking,
2-D arrays, mazes, strings, linked lists, and LeetCode-style practice problems.

**69 Java programs** organized into clean, runnable packages.

---

## Project Structure

```
DSA-Java/
├── DSA_WITH_JAVA/
│   └── src/                          <-- All Java source code lives here
│       ├── Main.java                 (default-package starter)
│       │
│       ├── basics/                   (13 files) — first steps in Java
│       │   ├── BinarySearch.java
│       │   ├── basic.java
│       │   ├── findArray_odd_even.java
│       │   ├── findmaxelement.java
│       │   ├── findmaxelementArray.java
│       │   ├── largestnumber.java
│       │   ├── linearsearchwithrange.java
│       │   ├── orderAgnosticBS.java
│       │   ├── passingFunaction.java
│       │   ├── printarray.java
│       │   ├── searchin2Darray.java
│       │   ├── swapArray.java
│       │   └── target_find_element_Arrray.java
│       │
│       ├── patterns/                 (11 files) — pattern-printing problems
│       │   ├── firstpattern.java
│       │   ├── pattern1.java … pattern5.java
│       │   ├── pattern_DOG.java
│       │   ├── pattern_ILU.java
│       │   ├── patter_alphabate.java
│       │   ├── patter_webkul.java
│       │   └── square_pattern.java
│       │
│       ├── sorting/                  (1 file)
│       │   └── bubbleshort.java
│       │
│       ├── recursion/                (18 files) — current recursion practice
│       │   ├── Knight.java       Nqueen.java        allPath.java
│       │   ├── basic.java        bubleshot.java     combinationString.java
│       │   ├── dice.java         isPrime.java       keyboard.java
│       │   ├── mergshort.java    pathRes.java       quicksort.java
│       │   ├── selectionsort.java                   stringsort.java
│       │   ├── subArrayString.java                  subseq.java
│       │   ├── subset.java                          triangle.java
│       │
│       ├── recursionOld/             (9 files) — earlier recursion attempts
│       │   ├── PATTERN.java      RBS.java       bubble.java
│       │   ├── diceThrow.java    findPrime.java findfactoralNumber.java
│       │   ├── mergshort.java    mergshort2.java quickShort.java
│       │
│       ├── revisionRecursion/        (1 file)
│       │   └── revison.java
│       │
│       ├── Backtracking/             (1 file)
│       │   └── sudoko.java
│       │
│       ├── maze/                     (1 file) — recursive maze solver
│       │   └── backtracking.java
│       │
│       ├── mazeProblems/             (1 file) — earlier maze practice
│       │   └── mazeProblem.java
│       │
│       ├── TwoDArray/                (6 files) — 2-D matrix problems
│       │   ├── ExitPoint.java        MatrixMult.java
│       │   ├── rotateNinty.java      shellRotate.java
│       │   ├── spiralTraversal.java  wavetravel.java
│       │
│       ├── strings/                  (1 file)
│       │   └── StringQuestion.java
│       │
│       ├── leetcode/                 (5 files) — LeetCode-style problems
│       │   ├── Main.java         (second-largest number)
│       │   ├── Palindrome.java   palimdrom.java
│       │   ├── newquestion.java  TwoSum.java
│       │
│       └── LinkedList/               (placeholder for future work)
│
├── .gitignore
└── README.md
```

> Older `.class`-only artifacts have been **decompiled back into editable
> `.java` files** and merged into the appropriate packages above, so every
> single problem is now runnable from source.

---

## Requirements

- **JDK 8** or higher (JDK 17+ recommended)
- One of the following (optional):
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/) — Community Edition is free
  - [VS Code](https://code.visualstudio.com/) with the *Extension Pack for Java*
  - Plain terminal (`javac` + `java`)

Check that Java is installed:

```bash
java -version
javac -version
```

---

## Clone and Run

### 1. Clone the repository

```bash
git clone https://github.com/Fahimhussain1089/DSA-java.git
cd DSA-java
```

### 2. Run from the terminal

Compile **everything** at once:

```bash
cd DSA_WITH_JAVA/src
mkdir -p ../out
javac -d ../out $(find . -name "*.java")
```

Then run any class by its fully-qualified name (package + class):

```bash
# Top-level class (no package)
java -cp ../out Main

# Class inside a package — use a DOT, not a slash
java -cp ../out basics.BinarySearch
java -cp ../out patterns.pattern_DOG
java -cp ../out leetcode.TwoSum
java -cp ../out recursion.Nqueen
java -cp ../out TwoDArray.spiralTraversal
java -cp ../out sorting.bubbleshort
java -cp ../out strings.StringQuestion
```

### 3. Run a single file (without compiling everything)

```bash
cd DSA_WITH_JAVA/src
javac basics/BinarySearch.java
java basics.BinarySearch
```

### 4. Run in IntelliJ IDEA

1. **File → Open** → select the `DSA-Java` folder.
2. IntelliJ auto-detects the Java module (`DSA_WITH_JAVA`).
3. If the `src` folder isn't blue, right-click it →
   **Mark Directory as → Sources Root**.
4. Open any `.java` file with a `main` method and press the green ▶ button
   (or `Ctrl+Shift+F10` / `^⇧R` on macOS).

### 5. Run in VS Code

1. Install the **Extension Pack for Java**.
2. Open the `DSA-Java` folder.
3. Open any `.java` file and click the **Run** action above the `main` method.

---

## Topics Covered

| Topic                     | Folder              | Files |
|---------------------------|---------------------|-------|
| Java basics               | `basics/`           | 13    |
| Pattern printing          | `patterns/`         | 11    |
| Sorting                   | `sorting/`          | 1     |
| Recursion (current)       | `recursion/`        | 18    |
| Recursion (older)         | `recursionOld/`     | 9     |
| Recursion revision        | `revisionRecursion/`| 1     |
| Backtracking              | `Backtracking/`     | 1     |
| Maze (current)            | `maze/`             | 1     |
| Maze (older)              | `mazeProblems/`     | 1     |
| 2-D Arrays                | `TwoDArray/`        | 6     |
| Strings                   | `strings/`          | 1     |
| LeetCode practice         | `leetcode/`         | 5     |
| Linked Lists              | `LinkedList/`       | TBD   |
| Default package           | `Main.java`         | 1     |
| **Total**                 |                     | **69**|

---

## Author

Made while practicing DSA in Java. Suggestions and pull requests welcome.
