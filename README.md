# OS-Thread-Synchronisation

Observations from running application without synchronizing bookTicket method.

![image](https://user-images.githubusercontent.com/97608891/221267928-6efd6c0e-444f-48d8-a1e9-0c45d5703f13.png)

Observations from running application after synchronizing bookTicket method.

![image](https://user-images.githubusercontent.com/97608891/221268034-ed6180a3-0ed0-41bb-a695-7b233a685a71.png)

When the bookThicket method not syncronized every thread returns 10 available seats and grants all requests since they are made at the same time.

After syncronizing the method all the threads have to wait for their turn to all the method and will thus return the corrct amount of available seats and 
not grant the requests which include more seats than what is available.
