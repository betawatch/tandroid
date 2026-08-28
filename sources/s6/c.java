package s6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.t3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends x5.g {
    public final Bundle Q;

    public c(Context context, Looper looper, k kVar, l lVar, t3 t3Var) {
        super(context, looper, 212, t3Var, kVar, lVar, 0);
        this.Q = new Bundle();
    }

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
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 9);
    }

    @Override // x5.g
    public final u5.c[] r() {
        return d.b;
    }

    @Override // x5.g
    public final Bundle t() {
        return this.Q;
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // x5.g
    public final boolean y() {
        return true;
    }
}
