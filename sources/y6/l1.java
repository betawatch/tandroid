package y6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l1 extends y5.g {
    @Override // y5.g
    public final boolean C() {
        return true;
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 13000000;
    }

    @Override // y5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof m1 ? (m1) queryLocalInterface : new m1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // y5.g
    public final v5.c[] r() {
        return new v5.c[]{k6.a.b, k6.a.a};
    }

    @Override // y5.g
    public final Bundle t() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // y5.g
    public final String v() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // y5.g
    public final String w() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }
}
