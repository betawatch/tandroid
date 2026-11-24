// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y3d extends xx4 {
    public final x3d F;

    public y3d(Context context, Looper looper, ntb ntbVar, x3d x3dVar, ey4 ey4Var, fy4 fy4Var) {
        super(68, ey4Var, fy4Var, ntbVar, context, looper);
        x3dVar = x3dVar == null ? x3d.c : x3dVar;
        aec aecVar = new aec((byte) 7, false);
        aecVar.b = Boolean.FALSE;
        x3d x3dVar2 = x3d.c;
        x3dVar.getClass();
        aecVar.b = Boolean.valueOf(x3dVar.a);
        aecVar.c = x3dVar.b;
        aecVar.c = s3d.a();
        this.F = new x3d(aecVar);
    }

    @Override // gg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof a4d ? (a4d) queryLocalInterface : new a4d(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", (byte) 2);
    }

    @Override // gg0
    public final Bundle h() {
        x3d x3dVar = this.F;
        x3dVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", x3dVar.a);
        bundle.putString("log_session_id", x3dVar.b);
        return bundle;
    }

    @Override // gg0
    public final int i() {
        return 12800000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
