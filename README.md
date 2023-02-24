# OS-Thread-Synchronisation

To run the application simply run the main method in the main class.

## Customers:
- Xiangming is booking 3 tickets
- Ilaria is booking 2 tickets
- Sam is booking 3 tickets
- Andreas is booking 4 tickets

Observations from running application without synchronizing bookTicket method.

![image](https://user-images.githubusercontent.com/97608891/221267928-6efd6c0e-444f-48d8-a1e9-0c45d5703f13.png)

Observations from running application after synchronizing bookTicket method.

![image](https://user-images.githubusercontent.com/97608891/221273033-f55f89b7-71dc-4f70-a237-cf2b7e604801.png)

When the bookTicket method not synchronized every thread returns 10 available seats and grants all requests since they are made at the same time.

After syncronizing the method all the threads have to wait for their turn to all the method and will thus return the corrct amount of available seats and 
not grant the requests which include more seats than what is available.
