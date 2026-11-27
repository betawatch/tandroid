// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class z7d extends d05 {
    public final jkb F;

    public z7d(Context context, Looper looper, oxb oxbVar, jkb jkbVar, k05 k05Var, l05 l05Var) {
        super(jn7.s4, k05Var, l05Var, oxbVar, context, looper);
        this.F = jkbVar;
    }

    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof r7d ? (r7d) queryLocalInterface : new r7d(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 1);
    }

    @Override // hg0
    public final a94[] f() {
        return mid.c;
    }

    @Override // hg0
    public final Bundle h() {
        jkb jkbVar = this.F;
        jkbVar.getClass();
        Bundle bundle = new Bundle();
        String str = jkbVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // hg0
    public final int i() {
        return 203400000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // hg0
    public final boolean p() {
        return true;
    }
}
