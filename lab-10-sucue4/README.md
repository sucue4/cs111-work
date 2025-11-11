# Lab 10

A simple Company metric system

In today's lab, the focus is on reading the "users.csv" file. You will read and store the different kind of employees into the company.

## Task

### Utility

#### readFile

Implement the read file function. The function should try to open the file using the Scanner. If it can open it, read each line and append the line into the StringBuilder. Add a new line after each line appended. Close the file once complete. If the file doesn't exist, print out "file not found". Return the string builder as a string and split by "\n" characters.

#### fillCompany

Create a new "Company" object, iterate through the file contents passed into the method. Parse the sections out using the string split method, separating each section by the comma, and create new Employees, Managers, and Developers based on the type parsed out.

If the line is an Employee, create a new employee with the name and id.
If the line is a Manager, create a new manager with the name, id, and details.

If the line is a Developer, create a new Developer with the name, id, and splitting the details by the "-".

Add these new types of employees into your company object. Return the company object in the end.

##### Sections

The contents of the line will follow one of the following formats:
 
```name,id,employee,none
name,id,manager,department
name,id,developer,programminglanguage1-programminglanguage2-...-programminglanguageN
```

### Developer

#### knowsLanguage

Iterate through the programming languages and return true if the programming language from the parameter is found in the array of programming languages known by the developer. Return false otherwise.

### Company

#### getAllDevelopers

Create a new array of Developers. Iterate through the array of employees. If the employee is an instance of a Developer, cast the employee into a developer and add it into the array of developers. Return the array of developers in the end.

#### findDevelopersByLanguage

Create an array of Developers. You may call the `getAllDevelopers` method to get all of the developers. Return the developers that know the programming language passed into the function. The resulting array should have no null values and should only contain the Developers that know the specific language.

#### getAllManagers

Create a new array of Managers. Iterate through the array of employees. If the employee is an instance of a Manager, cast the employee into a manager and add it into the array of managers. Return the array of managers in the end.

## Submission

Your code output should match the output in the assignment itself. Push all of your code to GitHub and upload the link to Canvas.

