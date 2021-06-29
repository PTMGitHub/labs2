class BankAccount:
    def __init__(self, customername, accountnumber, balance):
        self.customername =str(customername)
        self.accountnumber = int(accountnumber)
        self.balance = "{:.2f}".format(balance)



    def NewCustomer(name, openbal):
        custArray = []
        custArray.append(BankAccount(name, 11111, openbal))
        print(custArray[0].customername)


    def GenerateAccNo(self) -> int:
        highest = 100000
        return highest + 1

inputName = input("Give me the name bitch")
inputInitialBal = float(input("How much dough"))
# print(f"Name: {p1.customername}    balance:{str(p1.balance)}    account number:{str(p1.accountnumber)}")
BankAccount.NewCustomer(inputName,inputInitialBal)
