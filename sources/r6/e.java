package r6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import org.telegram.messenger.hs;
import p6.h;
import p6.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends h {
    public final q F;

    public e(Context context, Looper looper, o3 o3Var, q qVar, k kVar, l lVar) {
        super(context, looper, hs.t4, o3Var, kVar, lVar, 0);
        this.F = qVar;
    }

    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 203400000;
    }

    @Override // p6.d
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 7);
    }

    @Override // p6.d
    public final m6.c[] i() {
        return m7.b.c;
    }

    @Override // p6.d
    public final Bundle k() {
        q qVar = this.F;
        qVar.getClass();
        Bundle bundle = new Bundle();
        String str = qVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p6.d
    public final boolean q() {
        return true;
    }
}
