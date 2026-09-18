package org.telegram.ui;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yb1 implements LocationListener {
    public final /* synthetic */ ThemeActivity a;

    public yb1(ThemeActivity themeActivity) {
        this.a = themeActivity;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        ThemeActivity themeActivity = this.a;
        if (location == null) {
            return;
        }
        themeActivity.K0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(themeActivity.Q0);
        locationManager.removeUpdates(themeActivity.R0);
        themeActivity.B0(location, false);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
