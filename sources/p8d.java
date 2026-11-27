// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class p8d extends d05 {
    public final o8d F;

    public p8d(Context context, Looper looper, oxb oxbVar, o8d o8dVar, k05 k05Var, l05 l05Var) {
        super(68, k05Var, l05Var, oxbVar, context, looper);
        o8dVar = o8dVar == null ? o8d.c : o8dVar;
        zhc zhcVar = new zhc((byte) 7, false);
        zhcVar.b = Boolean.FALSE;
        o8d o8dVar2 = o8d.c;
        o8dVar.getClass();
        zhcVar.b = Boolean.valueOf(o8dVar.a);
        zhcVar.c = o8dVar.b;
        zhcVar.c = j8d.a();
        this.F = new o8d(zhcVar);
    }

    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof r8d ? (r8d) queryLocalInterface : new r8d(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", (byte) 2);
    }

    @Override // hg0
    public final Bundle h() {
        o8d o8dVar = this.F;
        o8dVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", o8dVar.a);
        bundle.putString("log_session_id", o8dVar.b);
        return bundle;
    }

    @Override // hg0
    public final int i() {
        return 12800000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
