package s7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.r3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k extends o6.g {
    public final a0.l U;
    public final a0.l V;
    public final a0.l W;

    public k(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, r3 r3Var) {
        super(context, looper, 23, r3Var, kVar, lVar, 0);
        this.U = new a0.l(0);
        this.V = new a0.l(0);
        this.W = new a0.l(0);
    }

    @Override // o6.g
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

    @Override // o6.g
    public final boolean C() {
        return true;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 11717000;
    }

    @Override // o6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof z ? (z) queryLocalInterface : new z(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 9);
    }

    @Override // o6.g
    public final l6.c[] r() {
        return h8.l.a;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
