package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/10 20:38
 */
class BankAccountNew(initialBalance: Double) {

  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }

}
