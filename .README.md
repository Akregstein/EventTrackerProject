#Project overview

ThisProject was an exercise in building a single table database and then creating a REST project that has full CRUD capability with the ability to search ,create, edit, and delete elements of the database.
For this project I created a database that contains Colorado mountains over 14 thousand feet that I would like to summit. The table contains columns for the mountains name, the range the mountain is in, the summits elevation, the most popular route to climb it and the estimated round trip time to climb it.


##Technologies Used

* MYSQL Workbench
* Spring Tool Suite 4
* Spring Framework Boot
* REST
* Gradle
* PostMan
* Service
* Repository


##Lessons Learned

In this project I had the opportunity to implement and test full CRUD functionality using a database that I created myself. It was my first solo project utilizing services and repositories. I was amazed at the magic provided by repositories and how simplified manipulating a database can be using these technologies.

### URLs For Postman Tests

* GET index  http://localhost:8086/api/index

* GET Find mountain by name http://localhost:8086/api/mountains/searchName/Peak

* GET Find mountain by round trip time http://localhost:8086/api/mountains/time/4/5

* GET Find mountain by Range http://localhost:8086/api/mountains/search/cristo

* GET Find mountain by Id http://localhost:8086/api/mountains/3

* POST Create mountain http://localhost:8086/api/mountains/create

* PUT Update mountain http://localhost:8086/api/mountains/5

* DEL Delete mountain http://localhost:8086/api/mountains/9
