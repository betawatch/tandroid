package p4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import c8.jb;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class c0 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ e0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, Looper looper) {
        super(looper);
        this.c = e0Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12 = false;
        this.a = this.a && z10;
        if (this.b && z11) {
            z12 = true;
        }
        this.b = z12;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        v vVar;
        int i7;
        g1 g1Var;
        e0 e0Var = this.c;
        e1 e1Var = e0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        g1 c10 = e0Var.s.c(e0Var.t.T0(), e0Var.t.R0(), e0Var.s.k);
        e0Var.s = c10;
        boolean z10 = this.a;
        boolean z11 = this.b;
        g1 A1 = e1Var.A1(c10);
        ab.c0 c0Var = e1Var.b;
        h9.i0 p10 = c0Var.p();
        for (int i10 = 0; i10 < p10.size(); i10++) {
            v vVar2 = (v) p10.get(i10);
            try {
                com.google.android.gms.common.api.internal.t v = c0Var.v(vVar2);
                if (v != null) {
                    i7 = v.e();
                } else if (!e0Var.h(vVar2)) {
                    break;
                } else {
                    i7 = 0;
                }
                g1 u10 = c0Var.u(vVar2);
                if (u10 == null) {
                    c0Var.t(vVar2);
                    e2.y0 a10 = jb.a(c0Var.n(vVar2), e0Var.t.t());
                    try {
                        u uVar = vVar2.d;
                        uVar.getClass();
                        if (u10 == null) {
                            vVar = vVar2;
                            g1Var = A1;
                        } else {
                            vVar = vVar2;
                            g1Var = u10;
                        }
                        try {
                            uVar.a(i7, g1Var, a10, z10, z11);
                        } catch (DeadObjectException unused) {
                            e1Var.b.K(vVar);
                        } catch (RemoteException e10) {
                            e = e10;
                            h2.a.m("MediaSessionImpl", "Exception in " + vVar, e);
                        }
                    } catch (DeadObjectException unused2) {
                        vVar = vVar2;
                    } catch (RemoteException e11) {
                        e = e11;
                        vVar = vVar2;
                    }
                }
            } catch (DeadObjectException unused3) {
                vVar = vVar2;
            } catch (RemoteException e12) {
                e = e12;
                vVar = vVar2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
