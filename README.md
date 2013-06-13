Rally Software Interview Question:
======

Crazy Train Exercize: 

As a savvy computer enthusiast, I’d like to develop a tool to help potential computer
buyers evaluate the various options and configurations that are available on the
market. I’ve encoded my vast knowledge as a few simple rules:

Everything relevant about a computer can be modeled by the properties

- model name

- memory (in GB)

- CPU speed (in GHz)

- the type of video card: one of none, average, or premium

- the price of the system (in dollars)

- if a computer has a graphics card and a CPU over 3 GHz, it is loud.

- If a computer has over 16 GB of memory, it is loud

- If a computer costs less than $1k, it is cheap

- If a computer costs more than $4k, it is expensive

- If a computer has more than 8GB of memory or a CPU faster than 4GHz, it is hot

- If a computer is cheap and hot, it is risky.

- If a computer has a premium graphics card, it can game

- If a computer has a graphics card and a CPU>2GHz, it can game

- If a computer has a CPU over 4 GHz and over 4GB memory, it can crunch numbers

- If a computer has a premium graphics card, it can crunch numbers

============

For the current market, the available computers are:

MACHINE 1:

- 2GB
- 5 GHz
- none
- $800

MACHINE 2:

- 8 GB
- 3 GHz
- average
- $1500

MACHINE 3:

- 1 GB
- 1GHz
- none
- $400

MACHINE 4:

- 16GB
- 4 GHz
- premium
- $3000

MACHINE 5:

- 32GB
- 5GHz
- none
- $8000

============

1.) Using drools, encode the above information. Using this model, answer
these questions:

- What are my options for a safe gaming computer?

- Are there any number crunchers that are risky?

- Are all gaming computers hot?

======

2.) Using your model, what can you tell me about this new model:

MACHINE 6:

- 2 GB
- 2GHz
- Premium
- $5500

=====


3.) Extend your model with rules asserting that:

- Gaming computers are better buys than number crunchers

- Expensive computers are worse buys than cheap computers

- Computers that can’t game or crunch numbers are worse than computers that can do either

- Risky computers are the worst buys

Use your model to find the best and worst buys. Assume that these rules are in low-
to-high priority order (ie, given 2 computers A and B where A can’t game or crunch
numbers, and B can game but is risky, A is the better buy).

=====

BONUS: Name the machines something more amusing than ‘MACHINE 1’ -
‘MACHINE 6’ in your implementation. If you can make us laugh, you’re more likely to
get a call back.
