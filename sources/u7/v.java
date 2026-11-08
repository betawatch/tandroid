package u7;

import android.os.Parcel;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
