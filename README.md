# import-rate-quote

App works comfortable in Desktop and Mobile.

Part 1: Calculation
-------------------
A Spring Boot application designed to calculate the estimated cost of a quote in a freight shipping industry.

path : /import-quote/v1/main

Possible input values:
  1. Weight (Kg)
  2. Volume (m3)
  
Possible Output values:
  1. Estimated Quote rate (AUD)

---
Part 2: Configuration
---------------------
Same application, where values for each quote calculation parameters are configured.

path : /import-quote/v1/configure


How to Run
----------
Just fork and build the war. Run the war with the below command.

<code> java -jar <<path_of_the_built_war>> </code>
