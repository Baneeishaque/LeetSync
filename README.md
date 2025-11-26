<div align="center">

# 🚀 LeetSync - LeetCode Solutions

[![LeetCode Profile](https://img.shields.io/badge/LeetCode-Baneeishaque-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/u/Baneeishaque/)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Baneeishaque/LeetSync)
[![License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](#-license)

**A curated collection of LeetCode solutions, automatically synchronized using [LeetSync](https://github.com/LeetSync/LeetSync).**

*Solving algorithms one commit at a time* 🧠

---

[📊 Problems](#-problems-solved) •
[🏗️ Technical Details](#️-technical-details) •
[🚀 Getting Started](#-getting-started) •
[🤝 Contributing](#-contributing) •
[📖 Resources](#-resources)

</div>

---

## 📊 Problems Solved

| # | Problem | Solution | Difficulty | Topics | Time Complexity | Space Complexity |
|---|---------|----------|------------|--------|-----------------|------------------|
| 69 | [Sqrt(x)](https://leetcode.com/problems/sqrtx) | [Java](./69-sqrtx/sqrtx.java) | 🟢 Easy | Binary Search, Math | O(log n) | O(1) |
| 1646 | [Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number) | [Java](./1646-kth-missing-positive-number/kth-missing-positive-number.java) | 🟢 Easy | Array, Binary Search | O(log n) | O(1) |
| 1781 | [Check If Two String Arrays are Equivalent](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent) | [Java](./1781-check-if-two-string-arrays-are-equivalent/check-if-two-string-arrays-are-equivalent.java) | 🟢 Easy | Array, String, Two Pointers | O(n + m) | O(1) |
| 2058 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array) | [Java](./2058-concatenation-of-array/concatenation-of-array.java) | 🟢 Easy | Array | O(n) | O(n) |
| 2491 | [Smallest Even Multiple](https://leetcode.com/problems/smallest-even-multiple) | [Java](./2491-smallest-even-multiple/smallest-even-multiple.java) | 🟢 Easy | Math, Number Theory | O(1) | O(1) |
| 2624 | [Difference Between Element Sum and Digit Sum](https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array) | [Java](./2624-difference-between-element-sum-and-digit-sum-of-an-array/difference-between-element-sum-and-digit-sum-of-an-array.java) | 🟢 Easy | Array, Math | O(n × d) | O(1) |
| 2876 | [Number of Employees Who Met the Target](https://leetcode.com/problems/number-of-employees-who-met-the-target) | [Java](./2876-number-of-employees-who-met-the-target/number-of-employees-who-met-the-target.java) | 🟢 Easy | Array | O(n) | O(1) |
| 3172 | [Divisible and Non-divisible Sums Difference](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference) | [Java](./3172-divisible-and-non-divisible-sums-difference/divisible-and-non-divisible-sums-difference.java) | 🟢 Easy | Math | O(1) | O(1) |

### 📈 Statistics

```
Total Problems Solved: 8
Languages Used: Java
Difficulty Distribution: 🟢 Easy (8)
```

### 🏷️ Topics Covered

<div align="center">

| Category | Count | Topics |
|----------|-------|--------|
| 🔢 **Arrays** | 5 | Array manipulation, traversal, copying |
| 🔍 **Binary Search** | 2 | Search optimization, logarithmic complexity |
| ➕ **Math** | 4 | Number theory, arithmetic operations |
| 📝 **Strings** | 1 | Character comparison, concatenation |
| 👆 **Two Pointers** | 1 | Simultaneous traversal |

</div>

---

## 🏗️ Technical Details

### Algorithm Patterns Used

<details>
<summary><b>🔍 Binary Search</b></summary>

**Problems:** [Sqrt(x)](./69-sqrtx/sqrtx.java), [Kth Missing Positive Number](./1646-kth-missing-positive-number/kth-missing-positive-number.java)

Binary search is used for problems requiring O(log n) time complexity. The key pattern:

```java
int left = 0, right = n;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (condition(mid)) {
        right = mid;
    } else {
        left = mid + 1;
    }
}
return left;
```

**Key insight:** Use `mid = left + (right - left) / 2` to prevent integer overflow.

</details>

<details>
<summary><b>👆 Two Pointers</b></summary>

**Problem:** [Check If Two String Arrays are Equivalent](./1781-check-if-two-string-arrays-are-equivalent/check-if-two-string-arrays-are-equivalent.java)

Four-pointer technique for comparing characters across multiple strings:

```java
int i1 = 0, j1 = 0;  // word1: string index, char index
int i2 = 0, j2 = 0;  // word2: string index, char index

while (i1 < word1.length && i2 < word2.length) {
    // Compare and advance pointers
}
```

**Key insight:** Track both array indices and character positions within strings.

</details>

<details>
<summary><b>➕ Mathematical Formulas</b></summary>

**Problems:** [Smallest Even Multiple](./2491-smallest-even-multiple/smallest-even-multiple.java), [Divisible and Non-divisible Sums Difference](./3172-divisible-and-non-divisible-sums-difference/divisible-and-non-divisible-sums-difference.java)

Using mathematical formulas for O(1) solutions:

- **Sum of first n numbers:** `n × (n + 1) / 2`
- **Sum of multiples:** `m × (count × (count + 1) / 2)` where `count = n / m`
- **LCM of n and 2:** Simply `n` if even, otherwise `2n`

</details>

<details>
<summary><b>🔢 Digit Manipulation</b></summary>

**Problem:** [Difference Between Element Sum and Digit Sum](./2624-difference-between-element-sum-and-digit-sum-of-an-array/difference-between-element-sum-and-digit-sum-of-an-array.java)

Extract individual digits using modulo and division:

```java
int getDigitSum(int number) {
    int sum = 0;
    while (number != 0) {
        sum += number % 10;  // Get last digit
        number /= 10;        // Remove last digit
    }
    return sum;
}
```

</details>

### Time & Space Complexity Analysis

| Complexity Class | Problems | Description |
|------------------|----------|-------------|
| **O(1) / O(1)** | 2491, 3172 | Pure mathematical solutions |
| **O(n) / O(1)** | 2876, 2624 | Single array traversal |
| **O(n) / O(n)** | 2058 | Array copying/creation |
| **O(log n) / O(1)** | 69, 1646 | Binary search optimization |
| **O(n + m) / O(1)** | 1781 | Two-array comparison |

---

## 🚀 Getting Started

### Prerequisites

- **Java JDK 11+** - [Download](https://adoptium.net/)
- **Git** - [Download](https://git-scm.com/)
- **IDE** (Recommended):
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [VS Code](https://code.visualstudio.com/) with [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  - [Eclipse](https://www.eclipse.org/downloads/)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Baneeishaque/LeetSync.git
   cd LeetSync
   ```

2. **Navigate to a solution**
   ```bash
   cd 69-sqrtx
   ```

3. **Compile and run** (example)
   ```bash
   # Add a main method for testing, then:
   javac sqrtx.java
   java Solution
   ```

### Project Structure

```
LeetSync/
├── 📁 69-sqrtx/
│   ├── README.md               # Problem description
│   └── sqrtx.java              # Solution implementation
├── 📁 1646-kth-missing-positive-number/
│   ├── README.md
│   └── kth-missing-positive-number.java
├── 📁 1781-check-if-two-string-arrays-are-equivalent/
│   ├── README.md
│   └── check-if-two-string-arrays-are-equivalent.java
├── 📁 2058-concatenation-of-array/
│   ├── README.md
│   └── concatenation-of-array.java
├── 📁 2491-smallest-even-multiple/
│   ├── README.md
│   └── smallest-even-multiple.java
├── 📁 2624-difference-between-element-sum-and-digit-sum-of-an-array/
│   ├── README.md
│   └── difference-between-element-sum-and-digit-sum-of-an-array.java
├── 📁 2876-number-of-employees-who-met-the-target/
│   ├── README.md
│   └── number-of-employees-who-met-the-target.java
├── 📁 3172-divisible-and-non-divisible-sums-difference/
│   ├── README.md
│   └── divisible-and-non-divisible-sums-difference.java
├── 📄 .whitesource             # Security scanning configuration
└── 📄 README.md                # This file
```

### Using with LeetSync Extension

This repository is automatically synchronized using the [LeetSync](https://github.com/LeetSync/LeetSync) browser extension.

1. **Install the extension** - Available for Chrome/Firefox
2. **Connect your GitHub** - Authorize the extension
3. **Solve problems on LeetCode** - Solutions are automatically committed

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

### Ways to Contribute

- 🐛 **Report bugs** - Open an issue describing the problem
- 💡 **Suggest improvements** - Better algorithms or cleaner code
- 📝 **Improve documentation** - Fix typos, add explanations
- ⭐ **Star the repository** - Help others discover this collection

### Contribution Guidelines

1. **Fork the repository**
   ```bash
   # Click 'Fork' on GitHub, then:
   git clone https://github.com/YOUR_USERNAME/LeetSync.git
   ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/improve-solution-69
   ```

3. **Make your changes**
   - Follow existing code style
   - Add comments for complex logic
   - Ensure code compiles without errors

4. **Commit your changes**
   ```bash
   git commit -m "Improve: Optimize Sqrt(x) solution with better edge case handling"
   ```

5. **Push and create a Pull Request**
   ```bash
   git push origin feature/improve-solution-69
   ```

### Code Style Guidelines

```java
// ✅ Good: Clear variable names
int leftPointer = 0;
int rightPointer = array.length - 1;

// ❌ Bad: Single letter names (except loop counters)
int l = 0;
int r = array.length - 1;

// ✅ Good: Proper spacing and formatting
if (condition) {
    doSomething();
} else {
    doSomethingElse();
}

// ✅ Good: Meaningful comments
// Binary search: find the position where arr[mid] - mid - 1 >= k
int mid = left + (right - left) / 2;
```

### Adding a New Solution

When adding a new LeetCode solution manually:

1. Create a folder with format: `{problem-number}-{problem-name-kebab-case}/`
2. Add the solution file: `{problem-name-kebab-case}.java`
3. Add the problem README.md with the problem description
4. Update the main README.md table (optional - done automatically by maintainers)

---

## 📖 Resources

### Learning Resources

| Resource | Description |
|----------|-------------|
| 📚 [NeetCode](https://neetcode.io/) | Curated problem lists and video explanations |
| 📘 [Algorithms by Sedgewick](https://algs4.cs.princeton.edu/) | Comprehensive algorithms textbook |
| 🎥 [LeetCode YouTube](https://www.youtube.com/@LeetCode) | Official problem walkthroughs |
| 📝 [Big-O Cheat Sheet](https://www.bigocheatsheet.com/) | Time complexity reference |

### Related Tools

| Tool | Purpose |
|------|---------|
| 🔄 [LeetSync](https://github.com/LeetSync/LeetSync) | Auto-sync solutions to GitHub |
| 📊 [LeetCode Stats Card](https://github.com/JacobLinCool/LeetCode-Stats-Card) | GitHub profile stats |
| 🧪 [LeetCode CLI](https://github.com/skygragon/leetcode-cli) | Command-line interface |

---

## 📜 License

This project is licensed under the MIT License.

```
MIT License

Copyright (c) 2024 Baneeishaque

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

---

## 🙏 Acknowledgments

- [LeetCode](https://leetcode.com/) for the amazing platform
- [LeetSync](https://github.com/LeetSync/LeetSync) for automatic synchronization
- The open-source community for continuous inspiration

---

<div align="center">

**⭐ If you find this repository helpful, please consider giving it a star! ⭐**

[![GitHub stars](https://img.shields.io/github/stars/Baneeishaque/LeetSync?style=social)](https://github.com/Baneeishaque/LeetSync/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Baneeishaque/LeetSync?style=social)](https://github.com/Baneeishaque/LeetSync/network/members)

*Made with ❤️ and ☕*

</div>
