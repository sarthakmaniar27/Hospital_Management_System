# Hospital_Management_System
Created a basic hospital management system using Java in order to get familiar with OOPs concepts.

# Class diagram
In order to make a class diagram, first you need to identify the actors and their functions in the system.
What are the actors in Hospital Management System?
Patient, Doctor, Receptionist, Billing, Department, Staff, etc.

I'm considering only 4 classes in my system: Patient, Doctor, Receptionist, Billing.
Now we need to identify the responsibility of each class

1.) Patient Class
attributes: Patient Id (int), Patient Name (String)
operations(methods): Patient will pay the bill. 

2.) Doctor Class
attributes: Doctor Id (int), Doctor Name (String)
operations(methods): Doctor  will check  the patient.

3.) Receptionist Class
attributes: Receptionist Id (int), Receptionist Name (String)
operations(methods): Give appointments to the students, Generate bills, etc.  

4.) Billing Class
attributes: Bill no (int), Bill amount (Float), Patient Id (int), Patient Name (String) 
operations(methods): Give appointments to the students, Generate bills, etc. 


