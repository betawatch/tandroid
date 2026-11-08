package v2;

import a8.ia;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c8.ca;
import e2.n0;
import e2.o0;
import e2.p0;
import e2.q0;
import e2.u;
import h2.m0;
import h2.r;
import java.util.ArrayList;
import jg.g;
import l2.c0;
import l2.i0;
import l2.y;
import x2.g0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b extends l2.b implements Handler.Callback {
    public final a I;
    public final c0 J;
    public final Handler K;
    public final o3.a L;
    public ca M;
    public boolean N;
    public boolean O;
    public long P;
    public q0 Q;
    public long R;

    public b(c0 c0Var, Looper looper) {
        super(5);
        Handler handler;
        this.J = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = m0.a;
            handler = new Handler(looper, this);
        }
        this.K = handler;
        this.I = a.a;
        this.L = new o3.a();
        this.R = -9223372036854775807L;
    }

    @Override // l2.b
    public final int C(u uVar) {
        if (this.I.b(uVar)) {
            return g.b(uVar.T == 0 ? 4 : 2, 0, 0, 0);
        }
        return g.b(0, 0, 0, 0);
    }

    public final void F(q0 q0Var, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            p0[] p0VarArr = q0Var.a;
            if (i7 >= p0VarArr.length) {
                return;
            }
            u a10 = p0VarArr[i7].a();
            if (a10 != null) {
                a aVar = this.I;
                if (aVar.b(a10)) {
                    ca a11 = aVar.a(a10);
                    byte[] c10 = p0VarArr[i7].c();
                    c10.getClass();
                    o3.a aVar2 = this.L;
                    aVar2.clear();
                    aVar2.b(c10.length);
                    aVar2.c.put(c10);
                    aVar2.c();
                    q0 a12 = a11.a(aVar2);
                    if (a12 != null) {
                        F(a12, arrayList);
                    }
                    i7++;
                }
            }
            arrayList.add(p0VarArr[i7]);
            i7++;
        }
    }

    public final long G(long j3) {
        ia.p(j3 != -9223372036854775807L);
        ia.p(this.R != -9223372036854775807L);
        return j3 - this.R;
    }

    public final void H(q0 q0Var) {
        c0 c0Var = this.J;
        i0 i0Var = c0Var.a;
        o0 o0Var = i0Var.o0;
        r rVar = i0Var.m;
        n0 a10 = o0Var.a();
        int i7 = 0;
        while (true) {
            p0[] p0VarArr = q0Var.a;
            if (i7 >= p0VarArr.length) {
                break;
            }
            p0VarArr[i7].b(a10);
            i7++;
        }
        i0Var.o0 = new o0(a10);
        o0 f12 = i0Var.f1();
        if (!f12.equals(i0Var.Q)) {
            i0Var.Q = f12;
            rVar.c(14, new y(c0Var, 1));
        }
        rVar.c(28, new y(q0Var, 2));
        rVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        H((q0) message.obj);
        return true;
    }

    @Override // l2.b
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // l2.b
    public final boolean l() {
        return this.O;
    }

    @Override // l2.b
    public final boolean m() {
        return true;
    }

    @Override // l2.b
    public final void n() {
        this.Q = null;
        this.M = null;
        this.R = -9223372036854775807L;
    }

    @Override // l2.b
    public final void p(long j3, boolean z9, boolean z10) {
        this.Q = null;
        this.N = false;
        this.O = false;
    }

    @Override // l2.b
    public final void u(u[] uVarArr, long j3, long j10, g0 g0Var) {
        this.M = this.I.a(uVarArr[0]);
        q0 q0Var = this.Q;
        if (q0Var != null) {
            long j11 = q0Var.b;
            long j12 = (this.R + j11) - j10;
            if (j11 != j12) {
                q0Var = new q0(j12, q0Var.a);
            }
            this.Q = q0Var;
        }
        this.R = j10;
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        boolean z9 = true;
        while (z9) {
            if (!this.N && this.Q == null) {
                o3.a aVar = this.L;
                aVar.clear();
                wf.b bVar = this.c;
                bVar.A();
                int w10 = w(bVar, aVar, 0);
                if (w10 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.N = true;
                    } else if (aVar.e >= this.x) {
                        aVar.r = this.P;
                        aVar.c();
                        ca caVar = this.M;
                        String str = m0.a;
                        q0 a10 = caVar.a(aVar);
                        if (a10 != null) {
                            ArrayList arrayList = new ArrayList(a10.a.length);
                            F(a10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new q0(G(aVar.e), (p0[]) arrayList.toArray(new p0[0]));
                            }
                        }
                    }
                } else if (w10 == -5) {
                    u uVar = (u) bVar.c;
                    uVar.getClass();
                    this.P = uVar.x;
                }
            }
            q0 q0Var = this.Q;
            if (q0Var == null || q0Var.b > G(j3)) {
                z9 = false;
            } else {
                q0 q0Var2 = this.Q;
                Handler handler = this.K;
                if (handler != null) {
                    handler.obtainMessage(1, q0Var2).sendToTarget();
                } else {
                    H(q0Var2);
                }
                this.Q = null;
                z9 = true;
            }
            if (this.N && this.Q == null) {
                this.O = true;
            }
        }
    }
}
