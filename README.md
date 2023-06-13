This can be used as an Account Management Application.

The AccountRecord class contains the following attributes:
    charge - integer representing the amount of the charge
    chargeDate - string representing the date when the charge was made
    
The Customer class contains the following attributes and methods:
    id - integer representing the customer ID
    name - string representing the customer's name
    charges - list of type AccountRecord which contains the list of charge records
    
    getBalance() - calculates and returns the total of all the charges of the customer
    toString() - returns a string with the ID, name, and balance of the customer
    
