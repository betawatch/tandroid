package z5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.t3;
import x5.g;
import x5.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends g {
    public final p Q;

    public c(Context context, Looper looper, t3 t3Var, p pVar, k kVar, l lVar) {
        super(context, looper, 270, t3Var, kVar, lVar, 0);
        this.Q = pVar;
    }

    @Override // x5.g, com.google.android.gms.common.api.c
    public final int l() {
        return 203400000;
    }

    @Override // x5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 10);
    }

    @Override // x5.g
    public final u5.c[] r() {
        return u6.b.b;
    }

    @Override // x5.g
    public final Bundle t() {
        p pVar = this.Q;
        pVar.getClass();
        Bundle bundle = new Bundle();
        String str = pVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // x5.g
    public final boolean y() {
        return true;
    }
}
