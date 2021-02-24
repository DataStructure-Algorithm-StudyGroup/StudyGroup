/** The interface for an ATM. */
public interface ATM {
    /** verifies a usre's PIN.
     * @param pin The user's PIN
     * @return Whether or not the user's PIN is verified
     */
    boolean verifyPIN(String pin);

    /** Allows the user to select an account.
     * @return a String representing the account selected
     */
    String selectAccount();

    /** Withdraws a specified amount of money
     * @param account The acount from which the money comes
     * @param amount The amount of moeny withdrawn
     * @return whether or not the operation is successful
     */
    boolean withdraw(String account, double amount);

    /** Display the result of an operation
     * @param account The account for the operation
     * @param amount The amount of money
     * @param success whether or not the operation was successful
     */
    void display(String account, double amount, boolean success);

    /** Display the result of a PIN verification
     * @param pin The user's pin
     * @param success Whether or not the PIN was valid
     */
    void display(String pin, boolean success);

    /**Displays an account balance
     * @param account The account selected
     */
    void showBalance(String account);
}
