package LAB4;
import java.sql.*;

public class LAB4_Q6 {
    protected int accountId;
    protected double balance;
    // Other account properties and methods
    public static void main(String[] args){
        // Create BankAccount objects for sender and recipient
        BankAccount sender = new BankAccount(1, 1000.0);
        BankAccount recipient = new BankAccount(2, 500.0);
        
        // Transfer funds from sender to recipient
        double amount = 200.0; // Example transfer amount
        try {
            sender.transfer(recipient, amount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class BankAccount extends LAB4_Q6 {
    // Constructor
    public BankAccount(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    // Method to transfer funds between two accounts
    public void transfer(BankAccount recipient, double amount) throws SQLException {
        Connection conn = null;
        PreparedStatement updateSender = null;
        PreparedStatement updateRecipient = null;

        try {
            // Get database connection
            ;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/java_db", "username", "password");
            conn.setAutoCommit(false); // Start transaction

            // Update sender's balance
            String updateSenderQuery = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
            updateSender = conn.prepareStatement(updateSenderQuery);
            updateSender.setDouble(1, amount);
            updateSender.setInt(2, accountId);
            updateSender.executeUpdate();

            // Update recipient's balance
            String updateRecipientQuery = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";
            updateRecipient = conn.prepareStatement(updateRecipientQuery);
            updateRecipient.setDouble(1, amount);
            updateRecipient.setInt(2, recipient.getAccountId());
            updateRecipient.executeUpdate();

            // Commit transaction
            conn.commit();
            System.out.println("Successfully transferred $" + amount + " from Account ID " + accountId + " to Account ID " + recipient.getAccountId());
        } catch (SQLException e) {
            // Rollback transaction on exception
            if (conn != null) {
                conn.rollback();
            }
            System.err.println("Error during balance transfer: " + e.getMessage());
            throw e;
        } finally {
            // Close resources
            if (updateSender != null) {
                updateSender.close();
            }
            if (updateRecipient != null) {
                updateRecipient.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // Getter for accountId
    public int getAccountId() {
        return accountId;
    }
}
