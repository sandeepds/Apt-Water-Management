# Apt-Water-Management

GeekHeights community has approached you to use your software to manage their water bills efficiently.

Each GeekHeights apartment is allotted with corporation and borewell water in a specific ratio at the start of the month. There are 2 bedroom and 3 bedroom apartments in the community and it is assumed that they will hold 3 and 5 people respectively.

Each person is allotted 10L of water per day. So a 2 BHK apartment will be allotted 900 L (31030) of water per month and a 3 BHK apartment will be allotted 1500L (51030) of water per month. The total water consumption is then split between corporation and borewell based on a ratio.

If there are additional guests in the apartment, the total allotted water will not suffice and the apartment has to ask for tanker water.

Costs

Corporation Water - Flat rate of Rs. 1 per litre

Borewell Water - Flat rate of Rs. 1.5 per litre

Tanker Water - Slab rate:

  • 0 to 500L - Rs. 2 per litre   • 501L to 1500L - Rs. 3 per litre   • 1501 to 3000L - Rs. 5 per litre   • 3001L+ - Rs. 8 per litre

Tanker water has a slab rate similar to income tax slabs, which means you pay different amounts for each slab. For e.g if you have consumed 2000L of tanker water then your cost is 5002 + 10003 + 500*5 = Rs. 6500

Your task

Find out the total cost of water for a month for an apartment.

Input Commands

ALLOT_WATER

Allots the water from corporation and borewell based on the apartment type and ratio passed. Here the ratio is always of the format Corporation Water : Borewell Water. This command will be executed only once a month per house and also at the start of the input command set.

Example- ALLOT_WATER 3 1:5

ADD_GUESTS <no_of_guests>

Adds the number of guests to a house. ADD_GUESTS command can be given multiple times in a month and total guests is the sum of all ADD_GUESTS numbers for that month.

Example - ADD_GUESTS 10

BILL

Prints the total water consumed in litres and the total cost, after cumulatively adding up all the guests cost to the bill. This command will be executed only once and at the end of the input set.

It should print the total water consumption and the cost in the format

<TOTAL_WATER_CONSUMED_IN_LITERS> <TOTAL_COST>

Example - BILL

4500 13450

Assumptions

All the calculations are done for a single apartment in a month. Number of days in the month is assumed to be 30.

The water consumption is measured in litres.

All calculations should be rounded off to the nearest integer. No decimal values are used.

Allotment based on ratio is done only once at the start of the month.

Guests can be added a multiple number of times.

The command BILL can be executed only once, which is at the end of the month. It should be a part of the input set.

SAMPLE INPUT-OUTPUT 1

INPUT: ALLOT_WATER 2 3:7 ADD_GUESTS 2 ADD_GUESTS 3 BILL

OUTPUT: 2400 5215

SAMPLE INPUT-OUTPUT 2

INPUT: ALLOT_WATER 3 2:1 ADD_GUESTS 4 ADD_GUESTS 1 BILL

OUTPUT: 3000 5750

SAMPLE INPUT-OUTPUT 3

INPUT: ALLOT_WATER 2 1:2 BILL

OUTPUT: 900 1200
