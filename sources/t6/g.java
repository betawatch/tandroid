package t6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.t3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends y5.g {
    public final g5.c Q;

    public g(Context context, Looper looper, t3 t3Var, g5.c cVar, k kVar, l lVar) {
        super(context, looper, 68, t3Var, kVar, lVar, 0);
        cVar = cVar == null ? g5.c.c : cVar;
        g5.b bVar = new g5.b(0);
        bVar.b = Boolean.FALSE;
        g5.c cVar2 = g5.c.c;
        cVar.getClass();
        bVar.b = Boolean.valueOf(cVar.a);
        bVar.c = cVar.b;
        bVar.c = e.a();
        this.Q = new g5.c(bVar);
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 12800000;
    }

    @Override // y5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 9);
    }

    @Override // y5.g
    public final Bundle t() {
        g5.c cVar = this.Q;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", cVar.a);
        bundle.putString("log_session_id", cVar.b);
        return bundle;
    }

    @Override // y5.g
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // y5.g
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
