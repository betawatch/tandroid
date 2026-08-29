package u6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends z5.g {
    public final Bundle Q;

    public c(Context context, Looper looper, k kVar, l lVar, s3 s3Var) {
        super(context, looper, 212, s3Var, kVar, lVar, 0);
        this.Q = new Bundle();
    }

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
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 9);
    }

    @Override // z5.g
    public final w5.c[] r() {
        return d.b;
    }

    @Override // z5.g
    public final Bundle t() {
        return this.Q;
    }

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // z5.g
    public final boolean y() {
        return true;
    }
}
