package com.shaan_snaps_apps.shaan_share.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;

import com.shaan_snaps_apps.shaan_share.app.Activity;
import com.shaan_snaps_apps.shaan_share.R;

/**
 * created by: veli
 * date: 9/12/18 6:09 PM
 */
public class ChangelogActivity extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changelog);

        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == android.R.id.home)
            finish();
        else
            return super.onOptionsItemSelected(item);

        return true;
    }
}
