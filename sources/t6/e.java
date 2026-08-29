package t6;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends z5.g {
    @Override // z5.g
    public final boolean C() {
        return true;
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 17895000;
    }

    @Override // z5.g
    public final IInterface q(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        int i10 = c.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // z5.g
    public final w5.c[] r() {
        return c7.c.c;
    }

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // z5.g
    public final boolean y() {
        return true;
    }
}
