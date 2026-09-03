package v6;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends b6.g {
    @Override // b6.g
    public final boolean C() {
        return true;
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 17895000;
    }

    @Override // b6.g
    public final IInterface q(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        int i10 = c.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // b6.g
    public final y5.c[] r() {
        return e7.b.c;
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // b6.g
    public final boolean y() {
        return true;
    }
}
