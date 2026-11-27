// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class v9f extends d05 {
    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof gcd ? (gcd) queryLocalInterface : new gcd(iBinder, "com.google.android.gms.cast.internal.ICastService", (byte) 3);
    }

    @Override // hg0
    public final a94[] f() {
        return zid.e;
    }

    @Override // hg0
    public final int i() {
        return 12451000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
