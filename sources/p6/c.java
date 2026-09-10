package p6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;
import n6.g;
import n6.p;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c extends g {
    public final p U;

    public c(Context context, Looper looper, r3 r3Var, p pVar, k kVar, l lVar) {
        super(context, looper, 270, r3Var, kVar, lVar, 0);
        this.U = pVar;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 203400000;
    }

    @Override // n6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 6);
    }

    @Override // n6.g
    public final k6.c[] r() {
        return k7.b.b;
    }

    @Override // n6.g
    public final Bundle t() {
        p pVar = this.U;
        pVar.getClass();
        Bundle bundle = new Bundle();
        String str = pVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // n6.g
    public final boolean y() {
        return true;
    }
}
