package com.shaan_snaps_apps.shaan_share.dialog;

import android.app.Activity;
import android.content.DialogInterface;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.shaan_snaps_apps.shaan_share.object.NetworkDevice;
import com.shaan_snaps_apps.shaan_share.R;
import com.shaan_snaps_apps.shaan_share.util.AppUtils;

public class RemoveDeviceDialog extends AlertDialog.Builder
{
    public RemoveDeviceDialog(@NonNull final Activity activity, final NetworkDevice device)
    {
        super(activity);

        setTitle(R.string.ques_removeDevice);
        setMessage(R.string.text_removeDeviceNotice);
        setNegativeButton(R.string.butn_cancel, null);
        setPositiveButton(R.string.butn_proceed, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                AppUtils.getDatabase(getContext()).removeAsynchronous(activity, device);
            }
        });
    }
}
