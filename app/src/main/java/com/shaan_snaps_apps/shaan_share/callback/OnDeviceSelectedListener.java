package com.shaan_snaps_apps.shaan_share.callback;

import com.shaan_snaps_apps.shaan_share.object.NetworkDevice;

import java.util.List;

public interface OnDeviceSelectedListener
{
    void onDeviceSelected(NetworkDevice.Connection connection, List<NetworkDevice.Connection> availableInterfaces);
}
