# 💳 Card Validator

### Project Developed by P. Saravanan

---

## 📑 Table of Contents

1. [Overview](#overview)
2. [Purpose](#purpose)
3. [Requirements](#requirements)
4. [Design](#design)
5. [Technical Details](#technical-details)
6. [Usage](#usage)
7. [Dependencies](#dependencies)
8. [Notes](#notes)

---

## 📝 Overview

- **Language:** Java
- **Framework:** Spring Boot
- **Tools:** SpringToolSuite4

---

## 🎯 Purpose

Validate Credit/Debit Card Numbers using the Luhn Algorithm and PAN Card Numbers using the Indian PAN Card Algorithm.

---

## 🛠️ Requirements

### Credit Card Validator
- **Algorithm:** Luhn Algorithm
- **Input:** 16-digit card number

### PAN Card Validator
- **Algorithm:** Indian PAN Card Algorithm
- **Inputs:**
  - 10-character PAN number
  - PAN Holder's Last Name

---

## 🖌️ Design

### Web Pages
1. **Home Page:** Main entry point
2. **Credit/Debit Card Validator Page:** Input and validate card number
3. **PAN Card Validator Page:** Input and validate PAN number and name
4. **Result Pages:** Display validation results

---

## 🔍 Technical Details

### Core Classes
1. **`input_collect`**: Stores user inputs
2. **`string_to_Array`**: Converts strings to arrays
3. **`Credit_or_Debit_Validation`**: Validates card numbers
4. **`Pan_Validation`**: Validates PAN numbers
5. **`CardValidatorApplication`**: Entry point for Spring Boot application
6. **`Card_Controller`**: Handles HTTP requests

---

## 🚀 Usage

1. **Run the Application**: Start with Spring Boot and go to `localhost:8080/cardvalidator`.
2. **Home Page**: Choose validation type.
3. **Validator Pages**: Enter required details and validate.
4. **Result Pages**: Display validation results with options to retry or return home.

### Example

**Credit Card Validation:**
- **Input:** `1234 5678 9012 3456`
- **Output:** "Your Card is Valid" or "Your Card is Invalid"

**PAN Card Validation:**
- **Input:** `ABCDE1234F, LastName`
- **Output:** "Your PAN Card is Valid" or "Your PAN Card is Invalid"

---

## 📦 Dependencies

- **Spring Boot Starter Web**
- **Tomcat Jasper**
- **Spring Boot Starter Test**

Add these dependencies to your `pom.xml`.

---

## 📝 Notes

This application uses the Luhn Algorithm for credit card validation and the Indian PAN Card Algorithm for PAN validation.

## Detailed 👇 Documentation here       
[Card Validator Document](CardValidator_Documentation.pdf)

