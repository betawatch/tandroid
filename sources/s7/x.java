package s7;

import android.os.Parcel;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class x extends c8.b implements y {
    public x() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
    }

    @Override // c8.b
    public final boolean J0(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
            return true;
        }
        v vVar = (v) d.a(parcel, v.CREATOR);
        d.b(parcel);
        v0(vVar);
        return true;
    }
}
