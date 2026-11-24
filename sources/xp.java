// default package

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xp extends yp {
    public final /* synthetic */ byte c = 0;
    public final /* synthetic */ bq d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(bq bqVar, Context context) {
        super(bqVar);
        this.d = bqVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // yp
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // yp
    public final int e() {
        Location location;
        boolean z;
        long j;
        Location location2;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (!((PowerManager) obj).isPowerSaveMode()) {
                    break;
                }
                break;
            default:
                wm9 wm9Var = (wm9) obj;
                ucb ucbVar = (ucb) wm9Var.d;
                LocationManager locationManager = (LocationManager) wm9Var.c;
                if (ucbVar.a > System.currentTimeMillis()) {
                    z = ucbVar.b;
                } else {
                    Context context = (Context) wm9Var.b;
                    Location location3 = null;
                    if (tse.b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (tse.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (location3 != null && (location == null || location3.getTime() > location.getTime())) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        s4c s4cVar = s4c.d;
                        if (s4cVar == null) {
                            s4cVar = new s4c();
                            s4c.d = s4cVar;
                        }
                        s4c s4cVar2 = s4cVar;
                        s4cVar2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        s4cVar2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z = s4cVar2.c;
                        long j2 = s4cVar2.b;
                        long j3 = s4cVar2.a;
                        s4cVar2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = s4cVar2.b;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        ucbVar.b = z;
                        ucbVar.a = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    @Override // yp
    public final void k() {
        byte b = this.c;
        bq bqVar = this.d;
        switch (b) {
            case 0:
                bqVar.d(true);
                break;
            default:
                bqVar.d(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(bq bqVar, wm9 wm9Var) {
        super(bqVar);
        this.d = bqVar;
        this.e = wm9Var;
    }
}
