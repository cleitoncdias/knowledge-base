package br.com.cleiton.inf008.l1;

public class AppConfig {
    private String appName;
    private String version;
    private int maxConnections;
    private int timeoutSeconds = 30;
    private boolean isDebugMode;

    public AppConfig(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }

    public AppConfig(String appName, String version, boolean isDebugMode) {
        this(appName, version);
        this.isDebugMode = isDebugMode;
    }

    public AppConfig(String appName, String version, int maxConnections, int timeoutSeconds, boolean isDebugMode) {
        this(appName, version, isDebugMode);
        this.maxConnections = maxConnections;
        this.timeoutSeconds = timeoutSeconds;
    }
    
    public void updateSettings(int maxConnections, int timeoutSeconds) {
        this.maxConnections = maxConnections;
        this.timeoutSeconds = timeoutSeconds;
    }

    public void updateSettings(boolean isDebugMode) {
        this.isDebugMode = isDebugMode;
    }

    public boolean validateConfig() {
        if(this.appName == null || (this.appName).isBlank()){
            return false;
        } else if(this.version == null || (this.version).isBlank()){
            return false;            
        } else if((this.maxConnections < 0) || (this.timeoutSeconds <= 0)){
            return false;
        } else if((this.isDebugMode && this.maxConnections > 5) || (this.isDebugMode && this.timeoutSeconds < 300)){
            return false;
        } else{
            return true;
        }
    }
}
