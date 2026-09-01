package w6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g extends b6.g {
    public final k5.b R;

    public g(Context context, Looper looper, r3 r3Var, k5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, r3Var, kVar, lVar, 0);
        bVar = bVar == null ? k5.b.c : bVar;
        f7.b bVar2 = new f7.b((char) 0, 20);
        bVar2.b = Boolean.FALSE;
        k5.b bVar3 = k5.b.c;
        bVar.getClass();
        bVar2.b = Boolean.valueOf(bVar.a);
        bVar2.c = bVar.b;
        bVar2.c = e.a();
        this.R = new k5.b(bVar2);
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 12800000;
    }

    @Override // b6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 10);
    }

    @Override // b6.g
    public final Bundle t() {
        k5.b bVar = this.R;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.a);
        bundle.putString("log_session_id", bVar.b);
        return bundle;
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
