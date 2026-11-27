// default package

import com.google.android.gms.location.LocationRequest;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class t05 implements qj5 {
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
