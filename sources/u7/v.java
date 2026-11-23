package u7;

import android.os.Parcel;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
