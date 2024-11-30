# NimaphProjectRepository
# Machine Test Project

This project implements a Spring Boot-based CRUD application with the following features:
- REST APIs for managing categories and products.
- Relational database (RDB) configuration using JPA and Hibernate.
- Annotation-based configuration (no XML).
- Server-side pagination for API endpoints.
- One-to-many relationship between categories and products.

---

## **Features**
1. **Category CRUD Operations**
   - **GET**: Fetch all categories with pagination.
   - **POST**: Create a new category.
   - **GET**: Fetch a category by ID.
   - **PUT**: Update a category by ID.
   - **DELETE**: Delete a category by ID.

2. **Product CRUD Operations**
   - **GET**: Fetch all products with pagination.
   - **POST**: Create a new product.
   - **GET**: Fetch a product by ID (includes category details).
   - **PUT**: Update a product by ID.
   - **DELETE**: Delete a product by ID.

3. **Database Relationship**
   - One-to-many relationship: A single category can have multiple products.

---

## **Endpoints**

### **Category APIs**
- `GET /api/categories?page={pageNumber}`: Get paginated categories.
- `POST /api/categories`: Create a new category.
- `GET /api/categories/{id}`: Fetch a category by ID.
- `PUT /api/categories/{id}`: Update a category by ID.
- `DELETE /api/categories/{id}`: Delete a category by ID.

### **Product APIs**
- `GET /api/products?page={pageNumber}`: Get paginated products.
- `POST /api/products`: Create a new product.
- `GET /api/products/{id}`: Fetch a product by ID (includes category details).
- `PUT /api/products/{id}`: Update a product by ID.
- `DELETE /api/products/{id}`: Delete a product by ID.

---

## **Technologies Used**
- **Spring Boot**: For application development.
- **Spring Data JPA**: For database operations.
- **Hibernate**: For ORM (Object Relational Mapping).
- **MySQL**: Relational database.
- **Postman**: For API testing.

---

## **Database Design**
### **Category Table**
| Column Name | Data Type   | Constraints       |
|-------------|-------------|-------------------|
| id          | Long        | Primary Key       |
| name        | String      | Not Null, Unique  |
| description | String      | Nullable          |

### **Product Table**
| Column Name     | Data Type   | Constraints       |
|-----------------|-------------|-------------------|
| id              | Long        | Primary Key       |
| name            | String      | Not Null, Unique  |
| description     | String      | Nullable          |
| price           | Double      | Not Null          |
| category_id     | Long        | Foreign Key       |

- **Relationships**:
  - `Category` ↔ `Product`: One-to-Many.

---

