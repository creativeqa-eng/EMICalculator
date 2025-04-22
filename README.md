# EMICalculator
This EMI Calculator (Equated Monthly Installment Calculator) helps you figure out the monthly payment you’ll need to make when you take a loan.

---

```markdown
# 💸 EMICalculator – Java Program

## 📌 Overview

The **EMICalculator** is a simple Java console application that calculates the **Equated Monthly Installment (EMI)** for a loan based on:

- **Principal Loan Amount**
- **Annual Interest Rate**
- **Loan Tenure in Years**

This tool is useful for users looking to estimate their monthly loan repayment amount, whether it's for a home loan, car loan, or personal loan.

---

## 🧮 EMI Formula

The EMI is calculated using the standard formula:

```
EMI = [P × R × (1 + R)^N] / [(1 + R)^N – 1]
```

Where:  
- **P** = Loan amount (Principal)  
- **R** = Monthly interest rate (Annual rate / 12 / 100)  
- **N** = Loan tenure in months

---

## 🛠️ How to Run

### Requirements:
- Java JDK 8 or above
- A terminal or IDE (e.g., Eclipse, IntelliJ)

### Steps:

1. **Compile the program:**

   ```bash
   javac day4/EMICalculator.java
   ```

2. **Run the program:**

   ```bash
   java day4.EMICalculator
   ```

3. **Follow the prompts:**  
   The program will ask you to input:
   - Loan amount (in USD)
   - Annual interest rate (in %)
   - Loan tenure (in years)

4. **Output:**  
   Displays your **monthly EMI** in USD.

---

## 🧾 Example

```
Enter loan amount in USD
50000
Enter annual interest rate (in %)
7.5
Enter loan tenure in years
5
Your monthly EMI is: 1001.90
```

---

## 📂 File Structure

```
day4/
└── EMICalculator.java
```

---

## ✍️ Author

Created by Lotunja Wright  
Feel free to contribute or modify for your own learning and projects.

---

## 📜 License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).

