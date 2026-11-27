// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
