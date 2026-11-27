// default package

import com.google.android.gms.location.LocationRequest;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
