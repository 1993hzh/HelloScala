package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/10 20:48
 */
class SavingAccount(initialBalance: Double) extends BankAccountNew(initialBalance) {

  var dealCount: Int = 0
  var balance: Double = initialBalance

  def earnMonthlyInterest() = {
    dealCount = 0
  }

  override def deposit(amount: Double) = {
    if (dealCount >= 3)
      balance -= 1
    balance += amount
    dealCount += 1
    balance
  }

  override def withdraw(amount: Double) = {
    if (dealCount >= 3)
      balance -= 1
    balance -= amount
    dealCount += 1
    balance
  }

  override def toString = {
    "balance=" + balance + ", dealCount=" + dealCount
  }

}
