package com.marianhello.bgloc.service;

import android.location.Location;

import com.marianhello.bgloc.Config;

public interface LocationService {
    void start();
    void startForegroundService();
    void stop();
    void startForeground();
    void stopForeground();
    void configure(Config config);
    void registerHeadlessTask(String jsFunction);
    void startHeadlessTask();
    void stopHeadlessTask();
    void executeProviderCommand(int command, int arg);

    /**
     * Called when a location has been received by an external source that may be relevant to this service.
     * The service may decide to accept this location and handle it as if it had produced this location event itself.
     * @param location
     */
    void setLocation(Location location);
}
