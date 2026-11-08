package p4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import c8.ab;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b0 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ d0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, Looper looper) {
        super(looper);
        this.c = d0Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z9, boolean z10) {
        boolean z11 = false;
        this.a = this.a && z9;
        if (this.b && z10) {
            z11 = true;
        }
        this.b = z11;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        v vVar;
        int i7;
        e1 e1Var;
        d0 d0Var = this.c;
        c1 c1Var = d0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        e1 c10 = d0Var.s.c(d0Var.t.T0(), d0Var.t.R0(), d0Var.s.k);
        d0Var.s = c10;
        boolean z9 = this.a;
        boolean z10 = this.b;
        e1 A1 = c1Var.A1(c10);
        ui.e eVar = c1Var.b;
        h9.i0 w10 = eVar.w();
        for (int i10 = 0; i10 < w10.size(); i10++) {
            v vVar2 = (v) w10.get(i10);
            try {
                com.google.android.gms.common.api.internal.s C = eVar.C(vVar2);
                if (C != null) {
                    i7 = C.e();
                } else if (!d0Var.h(vVar2)) {
                    break;
                } else {
                    i7 = 0;
                }
                e1 B = eVar.B(vVar2);
                if (B == null) {
                    eVar.A(vVar2);
                    e2.y0 a10 = ab.a(eVar.u(vVar2), d0Var.t.t());
                    try {
                        u uVar = vVar2.d;
                        uVar.getClass();
                        if (B == null) {
                            vVar = vVar2;
                            e1Var = A1;
                        } else {
                            vVar = vVar2;
                            e1Var = B;
                        }
                        try {
                            uVar.a(i7, e1Var, a10, z9, z10);
                        } catch (DeadObjectException unused) {
                            c1Var.b.T(vVar);
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
