package com.example;

public class FakeSecretExample {

    public static void main(String[] args) {
        System.out.println("This file contains a fake secret for testing GitHub Secret Scanning.");

        // --- 🧩 Fake secrets below (do NOT use real ones) ---

        // Fake AWS key pattern
        String awsAccessKey = "AKIA1234567890FAKEKEY";

        // Fake GitHub token pattern
        String githubToken = "ghp_FAKESECRET1234567890TOKEN1234567890";

        // Fake Slack token pattern
        String slackToken = "xoxb-123456789012-1234567890123-FAKETOKEN";

        // Fake Azure key pattern
        String azureKey = "AZURE_FAKE_KEY_1234567890ABCDEF";

        System.out.println("Secrets (fake) have been defined.");
        //Recommit

        // DON'T DO THIS: Hardcoded AWS credentials
    public static final String AWS_ACCESS_KEY_ID = "AKIAQZDF2P5I9Z4S7F8L";
    public static final String AWS_SECRET_ACCESS_KEY = "v5+QnBw3JzYyX6rT8fL9K8/W2t7D4hE5eF6gH7I0j";

    // DON'T DO THIS: Hardcoded Stripe API key
    // Secret keys have the prefix `sk_live_`
    public static final String STRIPE_SECRET_KEY = "sk_live_x5y6z7a8b9c0d1e2f3g4h5i6j7k8l9m0n1o2p3q4r5s6t7u8v9w0x1y2z3a4b5c6d";

    // DON'T DO THIS: Hardcoded database credentials
    public static final String DB_USER = "admin";
    public static final String DB_PASSWORD = "Password1234!";

    // DON'T DO THIS: Hardcoded JWT secret
    private static final String JWT_SECRET = "MySuperSecretKeyThatIsExactly32BytesLongForHS256";

    // An example of hardcoded keys used for encryption
    private static final String ENCRYPTION_KEY = "MyHardcodedEncryptionKey123";

        
    }
}


