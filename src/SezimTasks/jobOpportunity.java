package SezimTasks;

public class jobOpportunity {

    public static void sendJobOpportunityAlert(String email) {
        // Extract the domain part of the email
        String domain = email.substring(email.lastIndexOf("@") + 1);

        // Check if the domain is a professional domain
        boolean isProfessional = !domain.equalsIgnoreCase("gmail.com") &&
                !domain.equalsIgnoreCase("yahoo.com") &&
                !domain.equalsIgnoreCase("hotmail.com");

        // Print the appropriate message based on whether it's a professional email or not
        if (isProfessional) {
            System.out.println("Job Alert, $200k/year opportunity, apply now");
        } else {
            System.out.println("No open positions");
        }
    }

    public static void main(String[] args) {
        sendJobOpportunityAlert("askar@apple.com"); // Job Alert, $200k/year opportunity, apply now
        sendJobOpportunityAlert("jane.smith@gmail.com"); // No open positions
        sendJobOpportunityAlert("bob.johnson@hotmail.com"); // No open positions
    }

}
