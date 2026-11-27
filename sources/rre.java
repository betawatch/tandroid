// default package

import android.os.Parcel;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class rre extends u3d implements xwe {
    public rre() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 8);
    }

    @Override // u3d
    public final boolean e(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zze();
            return true;
        }
        mae maeVar = (mae) ild.a(parcel, mae.CREATOR);
        ild.b(parcel);
        t(maeVar);
        return true;
    }
}
