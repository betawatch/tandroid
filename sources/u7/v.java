package u7;

import android.os.Parcel;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class v extends a8.q implements w {
    public v() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 11);
    }

    @Override // a8.q
    public final boolean l1(Parcel parcel, int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            zze();
            return true;
        }
        t tVar = (t) d.a(parcel, t.CREATOR);
        d.b(parcel);
        P0(tVar);
        return true;
    }
}
