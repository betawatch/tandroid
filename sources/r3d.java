// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class r3d extends xx4 {
    public final Bundle F;

    public r3d(ey4 ey4Var, fy4 fy4Var, ntb ntbVar, Context context, Looper looper) {
        super(kk7.o3, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = new Bundle();
    }

    @Override // gg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof l4d ? (l4d) queryLocalInterface : new l4d(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", (byte) 2);
    }

    @Override // gg0
    public final f84[] f() {
        return aed.b;
    }

    @Override // gg0
    public final Bundle h() {
        return this.F;
    }

    @Override // gg0
    public final int i() {
        return 17895000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // gg0
    public final boolean p() {
        return true;
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
