-> Services generally don't take DTOs because they might call by different controllers and the DTOs are 
   very specific to the one Controller. So the services should be generic. 
   DTOs primary work to take input from frontend and pass output to frontend.

-> Controller does not throw the exception, they give well response.
-> Optional help to avoid Null Pointer Exception.