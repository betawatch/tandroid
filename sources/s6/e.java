package s6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import org.telegram.messenger.ks;
import q6.h;
import q6.q;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class e extends h {
    public final q F;

    public e(Context context, Looper looper, o3 o3Var, q qVar, k kVar, l lVar) {
        super(context, looper, ks.t4, o3Var, kVar, lVar, 0);
        this.F = qVar;
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 203400000;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 8);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return n7.b.c;
    }

    @Override // q6.d
    public final Bundle m() {
        q qVar = this.F;
        qVar.getClass();
        Bundle bundle = new Bundle();
        String str = qVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // q6.d
    public final boolean r() {
        return true;
    }
}
