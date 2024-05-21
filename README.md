# Mini Project using JDBC Connectivity 
 
## Objective of this Assignment:  
>> To design a miniature Project for a Banking Management System using Java, Oracle and 
JDBC. 
 
## Requisite: 
>> Completion of IDB Laboratory Assignment-4  
>> Basic Java Programming knowledge 
 
## Overview of the Project:  
>> A Banking Management System is to be designed, putting together the concepts learnt in 
theory and practised in laboratory. The Project will integrate a Java frontend menu driven 
program to the backend Banking Database designed in Oracle through JDBC 
connectivity.

# OUTPUT
Test Cases: 
 
The program should be able to produce correct answer or appropriate error message 
corresponding to 
 the following testcases:   
1. Show Customer Records 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 1 
Customer Records:  ------------------------------------------------------------------------------------- 
Customer_No  | Name                                 | Phone_No        | City       ------------------------------------------------------------------------------------- 
C0001                  | RAJ ANAND SINGH      | 9861258466   | DELHI      
C0002                  | ANKITA SINGH               | 9879958651   | BANGALORE  
C0003                  | SOUMYA JHA                  | 9885623344   | MUMBAI     
C0004                  | ABHIJIT MISHRA           | 9455845425    | MUMBAI     
C0005                  | YASH SARAF                   | 9665854585   | KOLKATA    
C0006                  | SWAROOP RAY              | 9437855466   | CHENNAI    
C0007                  | SURYA NARAYAN          | 9937955212   | GURGAON    
C0008                  | PRANAV PRAVEEN       | 9336652441   | PUNE       
C0009                  | STUTI MISRA                   | 7870266534   | DELHI      
C0010                  | ASLESHA TIWARI          | null                     | MUMBAI     ------------------------------------------------------------------------------------- 
 2. Add Customer Record: <C0011, ANWESHA DAS, 9999999999, BHUB>,  < c0012, SACHIN 
SINGH, 9898989898, CTC>,  <C0013, ARJUN MISHRA, 7777777777, BBSR> 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 2 
Enter Customer Number: C0011 
Enter Name: ANWESHA DAS 
Enter Phone Number: 9999999999 
Enter City: BHUB 
Customer added successfully. 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 2 
Enter Customer Number: c0012 
Enter Name:  SACHIN SINGH 
Enter Phone Number: 9898989898 
Enter City: CTC 
 
java.sql.SQLIntegrityConstraintViolationException: ORA-02290: check constraint 
(SCOTT.SYS_C008292) violated 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 2 
Enter Customer Number: C0013 
Enter Name: ARJUN MISHRA 
Enter Phone Number: 7777777777 
Enter City: BBSR 
Customer added successfully. 
 
 
 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 1 
Customer Records:  ------------------------------------------------------------------------------------- 
Customer_No  | Name                                 | Phone_No        | City       ------------------------------------------------------------------------------------- 
C0001                  | RAJ ANAND SINGH      | 9861258466   | DELHI      
C0002                  | ANKITA SINGH               | 9879958651   | BANGALORE  
C0003                  | SOUMYA JHA                  | 9885623344   | MUMBAI     
C0004                  | ABHIJIT MISHRA           | 9455845425    | MUMBAI     
C0005                  | YASH SARAF                   | 9665854585   | KOLKATA    
C0006                  | SWAROOP RAY              | 9437855466   | CHENNAI    
C0007                  | SURYA NARAYAN          | 9937955212   | GURGAON    
C0008                  | PRANAV PRAVEEN       | 9336652441   | PUNE       
C0009                  | STUTI MISRA                   | 7870266534   | DELHI      
C0010                  | ASLESHA TIWARI          | null                     | MUMBAI     
C0011                  | ANWESHA DAS             | 9999999999   | BHUB       
C0013                  | ARJUN MISHRA             | 7777777777   | BBSR       ------------------------------------------------------------------------------------- 
 
 3. Delete Customer Record: <C0013>, <C0016> 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 3 
Enter Customer Number to delete: C0013 
Customer deleted successfully. 
 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 3 
Enter Customer Number to delete: C0016 
Customer not found. 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 1 
Customer Records:  ------------------------------------------------------------------------------------- 
Customer_No  | Name                                 | Phone_No        | City       ------------------------------------------------------------------------------------- 
C0001                  | RAJ ANAND SINGH      | 9861258466   | DELHI      
C0002                  | ANKITA SINGH               | 9879958651   | BANGALORE  
C0003                  | SOUMYA JHA                  | 9885623344   | MUMBAI     
C0004                  | ABHIJIT MISHRA           | 9455845425    | MUMBAI     
C0005                  | YASH SARAF                   | 9665854585   | KOLKATA    
C0006                  | SWAROOP RAY              | 9437855466   | CHENNAI    
C0007                  | SURYA NARAYAN          | 9937955212   | GURGAON    
C0008                  | PRANAV PRAVEEN       | 9336652441   | PUNE       
C0009                  | STUTI MISRA                   | 7870266534   | DELHI      
C0010                  | ASLESHA TIWARI          | null                     | MUMBAI     
C0011                  | ANWESHA DAS             | 9999999999   | BHUB       ------------------------------------------------------------------------------------- 
 
 
 
 
 
 4. Update Customer Record for any attribute except Customer Number: <C0011>  
[ Update each column once] 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 4 
Enter Customer Number to update: C0001 
Enter 1: For Name 2: For Phone no 3: For City to update: 
2 
Enter new Phone Number: 7327888730 
Customer information updated successfully. 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 1 
Customer Records:  ------------------------------------------------------------------------------------- 
Customer_No  | Name                                 | Phone_No        | City       ------------------------------------------------------------------------------------- 
C0001                  | RAJ ANAND SINGH      | 7327888730   | DELHI      
C0002                  | ANKITA SINGH               | 9879958651   | BANGALORE  
C0003                  | SOUMYA JHA                  | 9885623344   | MUMBAI     
C0004                  | ABHIJIT MISHRA           | 9455845425    | MUMBAI     
C0005                  | YASH SARAF                   | 9665854585   | KOLKATA    
C0006                  | SWAROOP RAY              | 9437855466   | CHENNAI    
C0007                  | SURYA NARAYAN          | 9937955212   | GURGAON    
C0008                  | PRANAV PRAVEEN       | 9336652441   | PUNE       
C0009                  | STUTI MISRA                   | 7870266534   | DELHI      
C0010                  | ASLESHA TIWARI          | null                     | MUMBAI     
C0011                  | ANWESHA DAS             | 9999999999   | BHUB       ------------------------------------------------------------------------------------- 
 5. Show Account Details of a Customer: <C0003>, <c0005>, <C0016> 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 5 
Enter Customer Number: C0003 -------------------------------------------------------------------------------------------------------------------------- 
Customer_No  |  Account_No  |  Type  |  Balance   |  Branch_Code  |  Branch_Name      | Branch_City -------------------------------------------------------------------------------------------------------------------------- 
C0003                 |  A0001                |  SB      |  200000.0 |  B003                    |  JUHU BRANCH    | MUMBAI     -------------------------------------------------------------------------------------------------------------------------- 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 5 
Enter Customer Number: c0005 ---------------------------------------------------------------------------------------------------------------------- 
Customer_No | Account_No | Type | Balance  | Branch_Code | Branch_Name          | Branch_City ---------------------------------------------------------------------------------------------------------------------- ---------------------------------------------------------------------------------------------------------------------- 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 5 
Enter Customer Number: C0016 ------------------------------------------------------------------------------------------------------------------------ 
Customer_No | Account_No | Type | Balance  | Branch_Code | Branch_Name          | Branch_City ------------------------------------------------------------------------------------------------------------------------ ------------------------------------------------------------------------------------------------------------------------ 
 
 6. Show Loan Details of a Customer: <C0003>, <c0005>, <C0008>, <C0016> 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 6 
Enter Customer Number: C0003 ------------------------------------------------------------------------------------------------------------ 
Customer_No | Loan_No | Amount   | Branch_Code | Branch_Name          | Branch_City ------------------------------------------------------------------------------------------------------------ ------------------------------------------------------------------------------------------------------------ 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 6 
Enter Customer Number: c0005 ----------------------------------------------------------------------------------------------------------- 
Customer_No | Loan_No | Amount   | Branch_Code | Branch_Name          | Branch_City ----------------------------------------------------------------------------------------------------------- ----------------------------------------------------------------------------------------------------------- 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 6 
Enter Customer Number: C0008 ----------------------------------------------------------------------------------------------------------------------- 
Customer_No  | Loan_No  | Amount    | Branch_Code  | Branch_Name                          | Branch_City ----------------------------------------------------------------------------------------------------------------------- 
C0008                  | L0006        | 25000.0   | B006                     | SRIRAMPURAM BRANCH   | CHENNAI    ----------------------------------------------------------------------------------------------------------------------- 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 6 
Enter Customer Number: C0016 ----------------------------------------------------------------------------------------------------------- 
Customer_No | Loan_No | Amount   | Branch_Code | Branch_Name          | Branch_City ----------------------------------------------------------------------------------------------------------- ----------------------------------------------------------------------------------------------------------- 
 
 7. Deposit Money to an Account: <A0008, 800>, <a0005, 10000> 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 7 
Enter Account Number: A0008 
Enter Amount to Deposit: 800 
Deposit successful. 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 7 
Enter Account Number: a0005 
Enter Amount to Deposit: 10000 
Account not found. 
 
 8. Withdraw Money from an Account: <A0008, 800>, <A0008, 8000><a0005, 10000> 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 8 
Enter Account Number: A0008 
Enter Amount to Withdraw: 800 
Withdrawal successful. 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 8 
Enter Account Number: A0008 
Enter Amount to Withdraw: 8000 
Insufficient balance. 
 
 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 8 
Enter Account Number: a0005 
Enter Amount to Withdraw: 10000 
Insufficient balance. 
 
 9. Exit the Program 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 9 
 
Process finished with exit code 0 
 
 10.Enter choice 10 
***** Banking Management System ***** 
1. Show Customer Records 
2. Add Customer Record 
3. Delete Customer Record 
4. Update Customer Information 
5. Show Account Details of a Customer 
6. Show Loan Details of a Customer 
7. Deposit Money to an Account 
8. Withdraw Money from an Account 
9. Exit 
Enter your choice (1-9): 10 
 
Invalid choice. Please try again.
