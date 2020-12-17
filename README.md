# MyParkingLot

I own a multi-storey parking lot that can hold up to 'n' cars at any given point in time.
Each slot is given an auto incrementing sequential number to uniquely identify itself. I
want to create an automated ticketing system that allows my customers to use my
parking lot without human intervention.

When a car enters my parking lot from any one of the multiple entry points, I want to
have a ticket issued to the driver. The ticket issuing process includes us documenting
the registration number (number plate) and the colour of the car and allocating an
available parking slot to the car before actually handing over a ticket to the driver (we
assume that our customers are nice enough to always park in the slots allocated to
them). The customer should be allocated a parking slot which is nearest to the entry.
At the exit the customer returns the ticket which then marks the slot they were using
as being available.

Due to government regulation, the system should provide me with the ability to find
out:

● Registration numbers of all cars of a particular colour.

● Slot number in which a car with a given registration number is parked.

● Slot numbers of all slots where a car of a particular colour is parked.

Expectations :

● We are really interested in your low level design, object oriented skills so please
keep that in mind.

● Please follow coding conventions and directory structure in whichever language
you use.

● Input to your system can be done using a file, sysin or through test cases whichever way you want to choose.

Expected Input / Output :

Input:

create 6 3

Output:

Created a parking lot with 6 slots and 3 entry points

Input:

park RJ13-CA-1234 White <entrypoint_id>

Output:

parked slot number: 1

Input:

park MH12-AK-9999 White <entrypoint_id>

Output:

parked slot number: 2

Input:

park KA01-BB-0001 Black <entrypoint_id>

Output:

parked slot number: 3

Input:

leave 2

Output:

slot number 2 is free

Input:

Status

Output (Tab delimited output):

No Registration Slot No. Colour

1 RJ13-CA-1234 1 White

2 KA01-BB-0001 3 Black

Input:

park DL-12-AA-9999 White <entrypoint_id>

Output:

Sorry, parking lot is full

Input:

Register_with_colour KA01-HH-1234,KA01-HH-9999 White

Output:

Registered KA01-HH-1234,KA01-HH-9999

Input:

slot_check

Output:

1

Input:

slot_check_with_color White

Output:

RJ13-CA-1234

Input:

slot_check_with_number RJ13-CA-1234

Output:

1