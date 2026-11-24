// default package

import com.google.android.gms.location.LocationRequest;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oy4 implements oh5 {
    public LocationRequest a;

    public final void a() {
        this.a.c = 1000L;
    }

    public final void b() {
        LocationRequest locationRequest = this.a;
        long j = locationRequest.c;
        long j2 = locationRequest.b;
        if (j == j2 / 6) {
            locationRequest.c = 166L;
        }
        if (locationRequest.r == j2) {
            locationRequest.r = 1000L;
        }
        locationRequest.b = 1000L;
    }

    public final void c() {
        this.a.a = 100;
    }
}
