package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/10 20:40
 */
class CheckingAccount(initialBalance: Double) extends BankAccountNew(initialBalance) {

  var balance = initialBalance

  override def deposit(amount: Double) = {
    balance -= 1
    balance += amount
    balance
  }

  override def withdraw(amount: Double) = {
    balance -= 1
    balance -= amount
    balance
  }
}
