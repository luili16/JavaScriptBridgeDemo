package com.llx278.jsbridge;

public class PluginResult {
    private final CommandStatus status;
    private final Object message;

    public static PluginResult resultWithStatus(CommandStatus status) {
        return new PluginResult(status,null);
    }

    public static PluginResult resultWithString(CommandStatus status,String message) {
        return null;
    }

    public static PluginResult resultWithInt(CommandStatus status,int message) {
        return null;
    }

    public PluginResult(CommandStatus status,Object message) {
        this.status = status;
        this.message = message;
    }
    public String argumentsAsJson() {
        return null;
    }
}
