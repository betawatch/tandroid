package x6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l1 extends x5.g {
    @Override // x5.g
    public final boolean C() {
        return true;
    }

    @Override // x5.g, com.google.android.gms.common.api.c
    public final int l() {
        return 13000000;
    }

    @Override // x5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof m1 ? (m1) queryLocalInterface : new m1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // x5.g
    public final u5.c[] r() {
        return new u5.c[]{j6.a.b, j6.a.a};
    }

    @Override // x5.g
    public final Bundle t() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }
}
