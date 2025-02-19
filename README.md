M-Com Application Overview
The M-Com application is a Spring Boot-based web application designed to manage products. It provides RESTful APIs to perform CRUD (Create, Read, Update, Delete) operations on products, including handling product images.

Features
Product Management:

Add new products with details such as name, description, brand, price, category, release date, availability, stock quantity, and an image.

Retrieve a list of all products.

Fetch details of a specific product by its ID.

Update existing product details.

Delete a product by its ID.

Image Handling:

Upload and store product images.

Retrieve product images by product ID.

Technologies Used
Spring Boot: For building the application.

Spring Data JPA: For database operations.

H2 Database: An in-memory database for development purposes.

Lombok: For reducing boilerplate code.

Jackson: For JSON serialization and deserialization.

Maven: For dependency management and building the project.

Getting Started
Prerequisites
Java 21

Maven 3.x
<table>
        <thead>
            <tr>
                <th>Endpoint</th>
                <th>Method</th>
                <th>Description</th>
                <th>Parameters</th>
                <th>Request Body</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>/api/products</td>
                <td>GET</td>
                <td>Retrieve all products</td>
                <td>None</td>
                <td>None</td>
            </tr>
            <tr>
                <td>/api/product/{id}</td>
                <td>GET</td>
                <td>Retrieve a specific product by ID</td>
                <td>id (int): Product ID</td>
                <td>None</td>
            </tr>
            <tr>
                <td>/api/product</td>
                <td>POST</td>
                <td>Add a new product</td>
                <td>None</td>
                <td>product (JSON): Product details<br>imageFile (MultipartFile): Product image</td>
            </tr>
            <tr>
                <td>/api/product/{id}</td>
                <td>PUT</td>
                <td>Update an existing product</td>
                <td>id (int): Product ID</td>
                <td>product (JSON): Updated product details<br>imageFile (MultipartFile): Product image</td>
            </tr>
            <tr>
                <td>/api/product/{id}</td>
                <td>DELETE</td>
                <td>Delete a product by ID</td>
                <td>id (int): Product ID</td>
                <td>None</td>
            </tr>
            <tr>
                <td>/api/product/{productId}/image</td>
                <td>GET</td>
                <td>Retrieve the image of a product by its ID</td>
                <td>productId (int): Product ID</td>
                <td>None</td>
            </tr>
        </tbody>
    </table>
