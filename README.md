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

Installation
Clone the repository:

sh
git clone https://github.com/your-repo/M-Com.git
cd M-Com
Build the project:

sh
mvn clean install
Run the application:

sh
mvn spring-boot:run
API Endpoints
Retrieve all products
GET /api/products

Description: Fetches a list of all products.

Retrieve a specific product by ID
GET /api/product/{id}

Description: Fetches a product by its ID.

Parameters:

id (int): The ID of the product.

Add a new product
POST /api/product

Description: Adds a new product along with an image file.

Request Body:

product (JSON): Object containing product details.

imageFile (MultipartFile): The product image file.

Example Request:
sh
curl -X POST -H "Content-Type: multipart/form-data" -F "product={\"name\":\"Sample Product\",\"description\":\"This is a sample product\",\"brand\":\"Sample Brand\",\"price\":19.99,\"category\":\"Sample Category\",\"releaseDate\":\"2023-10-01\",\"productAvailable\":true,\"stockQuantity\":100,\"imageName\":\"sample.jpg\",\"imageType\":\"image/jpeg\"};type=application/json" -F "imageFile=@sample.jpg" http://localhost:8080/api/product
Update an existing product
PUT /api/product/{id}

Description: Updates a product and its image by ID.

Parameters:

id (int): The ID of the product.

Request Body:

product (JSON): Object containing updated product details.

imageFile (MultipartFile): The updated product image file.

Example Request:
sh
curl -X PUT -H "Content-Type: multipart/form-data" -F "product={\"name\":\"Updated Product\",\"description\":\"This is an updated product\",\"brand\":\"Updated Brand\",\"price\":29.99,\"category\":\"Updated Category\",\"releaseDate\":\"2023-10-01\",\"productAvailable\":true,\"stockQuantity\":50,\"imageName\":\"updated.jpg\",\"imageType\":\"image/jpeg\"};type=application/json" -F "imageFile=@updated.jpg" http://localhost:8080/api/product/1
Delete a product by ID
DELETE /api/product/{id}

Description: Deletes a product by its ID.

Parameters:

id (int): The ID of the product.

Example Request:
sh
curl -X DELETE http://localhost:8080/api/product/1
Retrieve the image of a product by its ID
GET /api/product/{productId}/image

Description: Fetches the image of a product by its ID.

Parameters:

productId (int): The ID of the product.

Example Request:
sh
curl -X GET http://localhost:8080/api/product/1/image --output product_image.jpg
Configuration
The application uses an H2 in-memory database by default. You can configure a different database by modifying the application.properties file.

Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgments
Spring Boot

Lombok

H2 Database

Maven
