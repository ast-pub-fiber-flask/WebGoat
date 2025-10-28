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
    }
}

