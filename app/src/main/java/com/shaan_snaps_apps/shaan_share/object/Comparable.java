package com.shaan_snaps_apps.shaan_share.object;

/**
 * created by: Veli
 * date: 18.01.2018 20:53
 */

public interface Comparable
{
    boolean comparisonSupported();

    String getComparableName();

    long getComparableDate();

    long getComparableSize();
}
