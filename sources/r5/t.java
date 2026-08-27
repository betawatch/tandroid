package r5;

import android.os.IBinder;
import android.os.IInterface;
import m5.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t extends y5.g {
    @Override // y5.g
    public final boolean C() {
        return true;
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 12451000;
    }

    @Override // y5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.cast.internal.ICastService", 1);
    }

    @Override // y5.g
    public final v5.c[] r() {
        return z.e;
    }

    @Override // y5.g
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // y5.g
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
