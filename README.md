# hibernate-03-saving-collections
Saving a collection in hibernate using @ElementCollection

In this example, we are going to save an collection as a dependent list of entity from another entity class.

Postman request details for saving an employee with list of addresses related to paricular employee.

- **Method :** POST
- **Request URL :** http://localhost:8080/hibernate-03-saving-collections/api/employee
- **Request Body :**

```
{
	"employeeId": 0,
	"employeeName":"Chandru R",
	"department":"Development",
	"gender": "Male",
	"addressList": [{
		"streetName":"Sankara Madam Street",
		"city":"Emakandanur",
		"state": "Tamil Nadu",
		"country": "India"
	},
	{
		"streetName":"Sanjeevi Street",
		"city":"Chennai",
		"state": "Tamil Nadu",
		"country": "India"
		
	}]
}
```

**Response Body :**

```{
    "data": {
        "employeeId": 1,
        "employeeName": "Chandru R",
        "gender": "Male",
        "department": "Development",
        "addressList": [
            {
                "streetName": "Sankara Madam Street",
                "city": "Emakandanur",
                "state": "Tamil Nadu",
                "country": "India"
            },
            {
                "streetName": "Sanjeevi Street",
                "city": "Chennai",
                "state": "Tamil Nadu",
                "country": "India"
            }
        ]
    },
    "message": "Employee saved successfully",
    "exception": false,
    "success": true
}
```
