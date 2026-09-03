package w6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c extends b6.g {
    public final Bundle R;

    public c(Context context, Looper looper, k kVar, l lVar, r3 r3Var) {
        super(context, looper, 212, r3Var, kVar, lVar, 0);
        this.R = new Bundle();
    }

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
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 10);
    }

    @Override // b6.g
    public final y5.c[] r() {
        return d.b;
    }

    @Override // b6.g
    public final Bundle t() {
        return this.R;
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // b6.g
    public final boolean y() {
        return true;
    }
}
