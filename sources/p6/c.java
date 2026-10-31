package p6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.p3;
import n6.g;
import n6.p;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends g {
    public final p U;

    public c(Context context, Looper looper, p3 p3Var, p pVar, k kVar, l lVar) {
        super(context, looper, zs.t4, p3Var, kVar, lVar, 0);
        this.U = pVar;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int m() {
        return 203400000;
    }

    @Override // n6.g
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 6);
    }

    @Override // n6.g
    public final k6.c[] s() {
        return k7.b.b;
    }

    @Override // n6.g
    public final Bundle u() {
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
    public final String w() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // n6.g
    public final String x() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // n6.g
    public final boolean z() {
        return true;
    }
}
