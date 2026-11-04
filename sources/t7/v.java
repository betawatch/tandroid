package t7;

import android.os.Parcel;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class v extends com.google.android.gms.internal.cast.o implements w {
    public v() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean L0(Parcel parcel, int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
            zze();
            return true;
        }
        t tVar = (t) d.a(parcel, t.CREATOR);
        d.b(parcel);
        X(tVar);
        return true;
    }
}
