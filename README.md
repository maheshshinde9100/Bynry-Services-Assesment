
# 📦 StockFlow Technical Assessment – Spring Boot Solution

This repository contains Mahesh Shinde's professional solutions to the **StockFlow Technical Case Study**, covering:

1. 🔧 Fixing and rewriting a buggy API.
2. 🗄️ Designing a scalable database schema.
3. 🚨 Creating a low stock alert API with proper validation and edge case handling.

---

## 📁 Folder Structure

```
stockflow-case-study/
│
├── src/
│   └── main/
│       └── java/
│           └── com/mahesh/stockflow/
│               ├── controller/
│               ├── model/
│               ├── repository/
│               └── service/
│
├── resources/
│   └── application.properties
│
├── README.md
└── StockFlow_Technical_Assessment_Mahesh_Shinde.pdf
```

---

## ✅ Task 1 – Bug Fix and Spring Boot Rewrite

### 🔍 Problem

The original Python API:
- Used incorrect logic (`OR` instead of `AND`) when checking stock.
- Lacked error handling and status codes.
- Was not production-grade.

### 🛠️ Fixes Implemented

- Rewritten using **Java + Spring Boot**.
- Correct logical condition for stock check.
- HTTP status codes and exception handling added.
- Validations on query parameters and input.

### 📡 API Endpoint

```
GET /api/products/low-stock?minStockLevel=10
```

---

## 🗄️ Task 2 – Database Schema Design

### 🧩 Tables Designed

- `products` – Main product table
- `categories` – Classifies products
- `suppliers` – Stores vendor details
- `stock_logs` – Tracks stock updates

### 💡 Design Highlights

- Normalized structure to avoid redundancy.
- Foreign keys and constraints for integrity.
- Optimized for scalability (can add orders, inventory, etc.).

---

## 🚨 Task 3 – Low Stock Alert API

### 📡 API Endpoint

```
GET /api/products/low-stock?minStockLevel=10
```

### ✅ Features

- Returns all products with stock below the specified level.
- Validates query parameter presence and type.
- Handles empty results gracefully.

### 🧪 Sample Response

```json
[
  {
    "productId": 101,
    "productName": "Wireless Mouse",
    "stockQuantity": 3
  },
  {
    "productId": 102,
    "productName": "USB Keyboard",
    "stockQuantity": 5
  }
]
```

---

## 👨‍💻 Developed By

**Mahesh Shinde**  
[LinkedIn](https://www.linkedin.com/in/maheshshinde9100) | [GitHub](https://github.com/maheshshinde9100)

