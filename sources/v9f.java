// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
