
# 📌 Mobile App Development Practical 5  
## 🌍 Countries List Application  

This Android application stores a list of countries in an array and displays them using a `ListView`. When a user clicks on a country, they are redirected to an activity or a web browser with more information about the selected country.

## 📂 Project Structure  

The project consists of the following main files:  

- **`MainActivity.java`** – Displays the list of countries in a `ListView`.  
- **`CountryDetailActivity.java`** – Handles the display of more information about a selected country.  
- **`activity_main.xml`** – Defines the layout for the main screen, including the `ListView`.  
- **`activity_country_detail.xml`** – Defines the layout for the detail screen.  
- **`strings.xml`** – Contains string resources for better localization.  

## 🚀 Features  

- Displays a list of countries using `ListView`.  
- Click on a country to open a new `Activity` with more details.  
- One country links to a website for additional information.  
- Uses an `ArrayAdapter` to populate the `ListView` dynamically.

## 🔍 Code Inspection
### Declaring and populating a list of items
```java
String[] items = {"Labrador Retriever", "German Shepherd", "Golden Retriever", "Bulldog", "Poodle"};
```
### Setting up a ListView with an ArrayAdapter

```java

ListView listView = findViewById(R.id.listView);
ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
listView.setAdapter(adapter);
```

### Handling item clicks in a ListView
```java

listView.setOnItemClickListener((parent, view, position, id) -> {
    String selectedItem = items[position];
    Toast.makeText(this, "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();
});
```





