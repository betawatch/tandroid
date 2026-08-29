package u6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends z5.g {
    public final i5.b Q;

    public g(Context context, Looper looper, s3 s3Var, i5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, s3Var, kVar, lVar, 0);
        bVar = bVar == null ? i5.b.c : bVar;
        g9.l lVar2 = new g9.l(7, (byte) 0);
        lVar2.b = Boolean.FALSE;
        i5.b bVar2 = i5.b.c;
        bVar.getClass();
        lVar2.b = Boolean.valueOf(bVar.a);
        lVar2.c = bVar.b;
        lVar2.c = e.a();
        this.Q = new i5.b(lVar2);
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 12800000;
    }

    @Override // z5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 9);
    }

    @Override // z5.g
    public final Bundle t() {
        i5.b bVar = this.Q;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.a);
        bundle.putString("log_session_id", bVar.b);
        return bundle;
    }

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
