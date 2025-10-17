package br.com.cleiton.inf008.l1;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- 1. Testing the basic constructor (appName, version) ---");
        // State: maxConnections=0, timeoutSeconds=30, isDebugMode=false
        // Should be VALID, because maxConnections (0) is not < 0 and timeout (30) is not <= 0.
        AppConfig basicConfig = new AppConfig("Simple WebApp", "v1.0");
        System.out.println("Is the basic configuration valid? " + basicConfig.validateConfig()); // Expected: true

        System.out.println("\n--- 2. Testing the debug constructor (appName, version, isDebugMode) ---");
        // State: maxConnections=0, timeoutSeconds=30, isDebugMode=true
        // Should be INVALID, because it's in debug mode and the default timeout (30) is less than 300.
        AppConfig debugConfig = new AppConfig("Debug Tool", "v0.1-beta", true);
        System.out.println("Is the initial debug configuration valid? " + debugConfig.validateConfig()); // Expected: false

        System.out.println("\n--- 3. Testing the complete constructor (VALID production configuration) ---");
        // All values are explicitly set and are consistent for a production environment.
        AppConfig productionConfig = new AppConfig("API Gateway", "v3.5.1", 200, 60, false);
        System.out.println("Is the production configuration valid? " + productionConfig.validateConfig()); // Expected: true

        System.out.println("\n--- 4. Testing the complete constructor (VALID debug configuration) ---");
        // Values are consistent for debug mode (connections <= 5, timeout >= 300).
        AppConfig validDebugConfig = new AppConfig("Analysis Service", "v1.2-debug", 5, 300, true);
        System.out.println("Is the complete debug configuration valid? " + validDebugConfig.validateConfig()); // Expected: true

        System.out.println("\n-------------------------------------------------");

        System.out.println("\n--- 5. Testing the updateSettings methods ---");
        // We start with the basicConfig object, which was initially valid.
        System.out.println("Initial validity: " + basicConfig.validateConfig()); // Expected: true

        System.out.println("Enabling debug mode...");
        basicConfig.updateSettings(true); // This sets isDebugMode to true
        // It should now become INVALID because the default timeout of 30 is not suitable for debug mode.
        System.out.println("Validity after enabling debug mode: " + basicConfig.validateConfig()); // Expected: false

        System.out.println("Correcting the settings for debug mode...");
        basicConfig.updateSettings(4, 450); // Sets valid values for a debug environment
        System.out.println("Validity after correction: " + basicConfig.validateConfig()); // Expected: true
    }
}