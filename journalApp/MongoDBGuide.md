## MongoDB Shell (mongosh) Step-by-Step Instructions

### 1. Installing and Starting mongosh

Ensure MongoDB is installed on your system.

Open a terminal or command prompt.

Start MongoDB shell by running:

```sh
mongosh
```

This connects to the MongoDB server.

---

### 2. Viewing Databases

To list all databases:

```sh
show dbs
```

To switch to a specific database or create a new one:

```sh
use database_name
```

---

### 3. Creating and Viewing Collections

To create or switch to a collection (MongoDB automatically creates it when inserting a document):

```sh
db.createCollection("collection_name")
```

To list all collections in the current database:

```sh
show collections
```

---

### 4. Inserting Documents

Insert a single document:

```sh
db.collection_name.insertOne({ "field1": "value1", "field2": "value2" })
```

Insert multiple documents:

```sh
db.collection_name.insertMany([
  { "field1": "value1", "field2": "value2" },
  { "field1": "value3", "field2": "value4" }
])
```

---

### 5. Querying Documents

Retrieve all documents in a collection:

```sh
db.collection_name.find()
```

Retrieve documents with specific criteria:

```sh
db.collection_name.find({ "field1": "value1" })
```

Retrieve a single document:

```sh
db.collection_name.findOne({ "field1": "value1" })
```

---

### 6. Updating Documents

Update a single document:

```sh
db.collection_name.updateOne(
  { "field1": "value1" },
  { $set: { "field2": "new_value" } }
)
```

Update multiple documents:

```sh
db.collection_name.updateMany(
  { "field1": "value1" },
  { $set: { "field2": "new_value" } }
)
```

---

### 7. Deleting Documents

Delete a single document:

```sh
db.collection_name.deleteOne({ "field1": "value1" })
```

Delete multiple documents:

```sh
db.collection_name.deleteMany({ "field1": "value1" })
```

---

### 8. Dropping a Collection

To remove an entire collection:

```sh
db.collection_name.drop()
```

---

### 9. Dropping a Database

To delete the current database:

```sh
db.dropDatabase()
```

---

### 10. Exiting mongosh

Type the following command to exit:

```sh
exit
```
