package r6;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends x5.g {
    @Override // x5.g
    public final boolean C() {
        return true;
    }

    @Override // x5.g, com.google.android.gms.common.api.c
    public final int l() {
        return 17895000;
    }

    @Override // x5.g
    public final IInterface q(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        int i9 = c.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // x5.g
    public final u5.c[] r() {
        return a7.c.c;
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // x5.g
    public final boolean y() {
        return true;
    }
}
