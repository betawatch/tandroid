// default package

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xo extends yo {
    public final /* synthetic */ byte c = 0;
    public final /* synthetic */ bp d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo(bp bpVar, Context context) {
        super(bpVar);
        this.d = bpVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // yo
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

    @Override // yo
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
                vk9 vk9Var = (vk9) obj;
                tab tabVar = (tab) vk9Var.d;
                LocationManager locationManager = (LocationManager) vk9Var.c;
                if (tabVar.a > System.currentTimeMillis()) {
                    z = tabVar.b;
                } else {
                    Context context = (Context) vk9Var.b;
                    Location location3 = null;
                    if (qqe.b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (qqe.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        s2c s2cVar = s2c.d;
                        if (s2cVar == null) {
                            s2cVar = new s2c();
                            s2c.d = s2cVar;
                        }
                        s2c s2cVar2 = s2cVar;
                        s2cVar2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        s2cVar2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z = s2cVar2.c;
                        long j2 = s2cVar2.b;
                        long j3 = s2cVar2.a;
                        s2cVar2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = s2cVar2.b;
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
                        tabVar.b = z;
                        tabVar.a = j;
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

    @Override // yo
    public final void k() {
        byte b = this.c;
        bp bpVar = this.d;
        switch (b) {
            case 0:
                bpVar.d(true);
                break;
            default:
                bpVar.d(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo(bp bpVar, vk9 vk9Var) {
        super(bpVar);
        this.d = bpVar;
        this.e = vk9Var;
    }
}
