# CSA-Lab-2B-Loops

## Grades

Write a program that allows the user to input the number of grades he or she wants to be averaged.  Then use a for loop structure to have the user input all the test grades individually, calculating the sum of these grades as they are being entered.  These amounts, including the sum, are to be all ints.  After all the grades have been entered, the program will calculate the average (decide what data type this variable should be?).  Print out the average for the number of grades entered.

## Concert Tickets Redux

Recall the Concert Tickets program from earlier, where the user chooses a seat based on the location with the costs listed below (remember that these values should be used as ints).

| Seat Location | Concert ticket price ($) |
|---------------|--------------------------|
| B (box)       | $75                      |
| P (pavilion)  | $30                      |
| L (lawn)      | $21                      |

This will be a similar operation, where the user will enter an upper or lowercase B, P, or L to choose a seat.  Include the following:
* Allow the user to continue buying tickets (one at a time)  until a sentinel value is inputted (Example:  Q for quit) using a while loop.
* When prompting the user for a ticket type, if the user inputs an invalid type, use a loop to prompt the user to keep entering a seat type until a valid input is received.  This is to be done with a while data verification loop.
* Keep a running total of the number of each type of ticket purchased and the subtotals for the costs of each type of ticket (these will need to be stored as ints)
* Calculate a convenience fee of $1.50 per ticket (this will need to be a double).
* Calculate the total cost of all tickets, including the convenience fee (this will need to be a double).

After all tickets have been purchased, display the quantity and type of each ticket bought with a subtotal, the total convenience fee, and a total price for all the tickets.

Example output:

```
2     box tickets         $150
4     pavillion tickets   $120
1     lawn ticket         $21
      convenience fee     $10.50
      total               $301.50
```

**Be sure to put a $ in front of all monetary amounts and be sure to use String formatting on the convenience fee and total so that you will ensure two decimal places.**
