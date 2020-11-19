import java.util.ArrayList;
import java.util.Date;

interface TransactionList {

  Transaction getLastTransaction();

  void addTransaction(Transaction transaction);

  Transaction getTransactionByDate(Date date);

  ArrayList<Transaction> getAllTransactions();
  
}