package com.shaan_snaps_apps.shaan_share.ui.callback;

import com.shaan_snaps_apps.shaan_share.object.NetworkDevice;

/**
 * created by: veli
 * date: 16/04/18 03:18
 */
public interface NetworkDeviceSelectedListener
{
    boolean onNetworkDeviceSelected(NetworkDevice networkDevice, NetworkDevice.Connection connection);

    boolean isListenerEffective();
}
