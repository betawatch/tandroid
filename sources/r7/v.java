package r7;

import android.os.Parcel;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class v extends b8.b implements w {
    public v() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
    }

    @Override // b8.b
    public final boolean L0(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
            return true;
        }
        t tVar = (t) d.a(parcel, t.CREATOR);
        d.b(parcel);
        r0(tVar);
        return true;
    }
}
