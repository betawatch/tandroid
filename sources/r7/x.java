package r7;

import android.os.Parcel;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class x extends b8.b implements y {
    public x() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
    }

    @Override // b8.b
    public final boolean K0(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
            return true;
        }
        v vVar = (v) d.a(parcel, v.CREATOR);
        d.b(parcel);
        p0(vVar);
        return true;
    }
}
