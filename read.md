
Email Notification Service (ENS)
---

Usage
--
1. Email without any attachements
    
    Call the endpoint `emails` with the following body:
    ```json
    {
        "subject": "[Test] Taylor & Francis Group has updated the following IP range(s)",
        "body": "Taylor & Francis Group has updated the following IP range(s):<br/><br/>      From: 192.168.0.1 - 192.168.0.1<br/>      To: 192.168.0.2 - 192.168.0.2",
        "from": "noreply@taylorfrancis.com",
        "to": [
            "nobrainer@yopmail.com"
        ],
        "cc": [
            "noobcc@yopmail.com"
        ],
        "bcc": [
            "blindperson@yopmail.com"
        ]
    }
    ``` 
   
 2. Email with attachment file
 
    Call the endpoint `attachment` using the above request body in form data field `emailRequest` and the array of file attachments in multipart request forma data `file`
    
Development
---
The application is built using springboot (2.2.5) framework and microservices architecture.

Build
--
`mvn clean package`

Execute
--
`mvn spring-boot:run`

