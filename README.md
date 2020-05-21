# Test application

### Api Guide
Get all people:
```
GET http://{host}:9080/testService/api/v1/people
```

Get one person by ID:
```
GET http://{host}:9080/testService/api/v1/people/{id}
```

There are two parameters that can be used to get people by age:
* ageMin
* ageMax
```
GET http://{host}:9080/testService/api/v1/people?ageMin=33
GET http://{host}:9080/testService/api/v1/people?ageMax=40
GET http://{host}:9080/testService/api/v1/people?ageMin=33&ageMax=40
```


