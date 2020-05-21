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

To get people by age there are two parameters that can be used:
* ageMin
* ageMax
```
GET http://{host}:9080/testService/api/v1/people?ageMin=33
GET http://{host}:9080/testService/api/v1/people?ageMax=40
GET http://{host}:9080/testService/api/v1/people?ageMin=33&ageMax=40
```


