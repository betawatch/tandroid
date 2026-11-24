// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t5d extends zz4 {
    public final Bundle F;

    public t5d(f05 f05Var, g05 g05Var, ovb ovbVar, Context context, Looper looper) {
        super(nm7.o3, f05Var, g05Var, ovbVar, context, looper);
        this.F = new Bundle();
    }

    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof n6d ? (n6d) queryLocalInterface : new n6d(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", (byte) 2);
    }

    @Override // hh0
    public final o94[] f() {
        return bgd.b;
    }

    @Override // hh0
    public final Bundle h() {
        return this.F;
    }

    @Override // hh0
    public final int i() {
        return 17895000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // hh0
    public final boolean p() {
        return true;
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
