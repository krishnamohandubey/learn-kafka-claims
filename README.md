# Learn Kafka Claims

This project demonstrates a microservices architecture using Spring Boot and Kafka. It consists of two main services:

- **Claim Service**: Handles claim submissions and produces claim events to Kafka.
- **Notification Service**: Listens to claim events from Kafka and sends notifications.

## Claim Submission Endpoint

Submit a claim using the following HTTP POST endpoint:

- **URL**: `http://localhost:9030/claims/api/claims/submit-claim`
- **Method**: POST
- **Content-Type**: `application/json`
- **Sample Payload**:
  ```json
  {
    "netDearnessAllowance": 2500.75,
    "travelExpense": 5600.00,
    "hotelExpense": 4300.50,
    "mealExpense": 1200.25,
    "localConveyanceExpense": 800.00,
    "otherExpense": 500.00,
    "payableAmount": 30000.00
  }
  ```

## Kafka Visualization

Monitor Kafka topics and events using Confluent Control Center:

- **URL**: [http://127.0.0.1:9021](http://127.0.0.1:9021)
