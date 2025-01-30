package testexamples;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

    public class SpamDetection {

        // Define a set of spam keywords
        private static final Set<String> SPAM_KEYWORDS = new HashSet<>(Arrays.asList(
                "win", "prize", "free", "money", "cash", "offer", "urgent",
                "lottery", "winner", "guaranteed", "click here", "buy now",
                "unsubscribe", "claim", "bonus", "earn"
        ));

        /**
         * Check if an email is spam.
         *
         * @param emailSubject the subject of the email
         * @param emailBody    the body of the email
         * @return true if the email is spam, false otherwise
         */
        public static boolean isSpam(String emailSubject, String emailBody) {
            // Combine subject and body into one text for scanning
            String emailContent = (emailSubject + " " + emailBody).toLowerCase();

            // Check for spam keywords
            for (String keyword : SPAM_KEYWORDS) {
                if (emailContent.contains(keyword)) {
                    return true; // Spam detected
                }
            }

            return false; // No spam detected
        }

        public static void main(String[] args) {
            // Sample email inputs
            String emailSubject1 = "Congratulations! You are a winner!";
            String emailBody1 = "You have won a cash prize. Click here to claim your reward.";

            String emailSubject2 = "Meeting Reminder";
            String emailBody2 = "Don't forget our meeting scheduled for tomorrow at 3 PM.";

            // Check if the emails are spam
            System.out.println("Email 1 is spam: " + isSpam(emailSubject1, emailBody1));
            System.out.println("Email 2 is spam: " + isSpam(emailSubject2, emailBody2));
        }
    }


