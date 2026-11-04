package p7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m1 extends p6.h {
    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 13000000;
    }

    @Override // p6.d
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof n1 ? (n1) queryLocalInterface : new n1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // p6.d
    public final m6.c[] i() {
        return new m6.c[]{b7.a.b, b7.a.a};
    }

    @Override // p6.d
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // p6.d
    public final boolean w() {
        return true;
    }
}
