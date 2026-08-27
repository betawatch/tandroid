package s6;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends y5.g {
    @Override // y5.g
    public final boolean C() {
        return true;
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 17895000;
    }

    @Override // y5.g
    public final IInterface q(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        int i10 = c.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // y5.g
    public final v5.c[] r() {
        return b7.c.c;
    }

    @Override // y5.g
    public final String v() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // y5.g
    public final String w() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // y5.g
    public final boolean y() {
        return true;
    }
}
