package r7;

import android.os.Parcel;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
