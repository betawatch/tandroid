package r7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.p3;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k extends n6.g {
    public final a0.l U;
    public final a0.l V;
    public final a0.l W;

    public k(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, p3 p3Var) {
        super(context, looper, 23, p3Var, kVar, lVar, 0);
        this.U = new a0.l(0);
        this.V = new a0.l(0);
        this.W = new a0.l(0);
    }

    @Override // n6.g
    public final void A(int i10) {
        super.A(i10);
        synchronized (this.U) {
            this.U.clear();
        }
        synchronized (this.V) {
            this.V.clear();
        }
        synchronized (this.W) {
            this.W.clear();
        }
    }

    @Override // n6.g
    public final boolean C() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 11717000;
    }

    @Override // n6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof z ? (z) queryLocalInterface : new z(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 8);
    }

    @Override // n6.g
    public final k6.c[] r() {
        return g8.l.a;
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
