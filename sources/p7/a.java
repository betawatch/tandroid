package p7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b6.g;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends g {
    public final Context R;

    public a(Context context, Looper looper, k kVar, l lVar, s3 s3Var) {
        super(context, looper, 45, s3Var, kVar, lVar, 0);
        this.R = context;
    }

    @Override // b6.g
    public final boolean C() {
        return true;
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 12200000;
    }

    @Override // b6.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.gms.safetynet.service.START";
    }
}
