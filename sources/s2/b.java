package s2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b2.r0;
import b2.s0;
import b2.t0;
import b2.u0;
import b2.x;
import e2.m0;
import e2.r;
import i2.b0;
import i2.d;
import i2.h0;
import java.util.ArrayList;
import u2.g0;
import v7.u6;
import w7.m;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b extends i2.b implements Handler.Callback {
    public final a I;
    public final b0 J;
    public final Handler K;
    public final l3.a L;
    public m M;
    public boolean N;
    public boolean O;
    public long P;
    public u0 Q;
    public long R;

    public b(b0 b0Var, Looper looper) {
        super(5);
        Handler handler;
        this.J = b0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = m0.a;
            handler = new Handler(looper, this);
        }
        this.K = handler;
        this.I = a.a;
        this.L = new l3.a();
        this.R = -9223372036854775807L;
    }

    @Override // i2.b
    public final int C(x xVar) {
        if (this.I.b(xVar)) {
            return d.c(xVar.T == 0 ? 4 : 2, 0, 0, 0);
        }
        return d.c(0, 0, 0, 0);
    }

    public final void F(u0 u0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            t0[] t0VarArr = u0Var.a;
            if (i10 >= t0VarArr.length) {
                return;
            }
            x a2 = t0VarArr[i10].a();
            if (a2 != null) {
                a aVar = this.I;
                if (aVar.b(a2)) {
                    m a10 = aVar.a(a2);
                    byte[] c10 = t0VarArr[i10].c();
                    c10.getClass();
                    l3.a aVar2 = this.L;
                    aVar2.clear();
                    aVar2.b(c10.length);
                    aVar2.c.put(c10);
                    aVar2.e();
                    u0 a11 = a10.a(aVar2);
                    if (a11 != null) {
                        F(a11, arrayList);
                    }
                    i10++;
                }
            }
            arrayList.add(t0VarArr[i10]);
            i10++;
        }
    }

    public final long G(long j10) {
        u6.p(j10 != -9223372036854775807L);
        u6.p(this.R != -9223372036854775807L);
        return j10 - this.R;
    }

    public final void H(u0 u0Var) {
        b0 b0Var = this.J;
        h0 h0Var = b0Var.a;
        s0 s0Var = h0Var.o0;
        r rVar = h0Var.m;
        r0 a2 = s0Var.a();
        int i10 = 0;
        while (true) {
            t0[] t0VarArr = u0Var.a;
            if (i10 >= t0VarArr.length) {
                break;
            }
            t0VarArr[i10].b(a2);
            i10++;
        }
        h0Var.o0 = new s0(a2);
        s0 f12 = h0Var.f1();
        if (!f12.equals(h0Var.Q)) {
            h0Var.Q = f12;
            rVar.c(14, new f1.a(b0Var, 8));
        }
        rVar.c(28, new f1.a(u0Var, 9));
        rVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        H((u0) message.obj);
        return true;
    }

    @Override // i2.b
    public final String j() {
        return "MetadataRenderer";
    }

    @Override // i2.b
    public final boolean l() {
        return this.O;
    }

    @Override // i2.b
    public final boolean m() {
        return true;
    }

    @Override // i2.b
    public final void n() {
        this.Q = null;
        this.M = null;
        this.R = -9223372036854775807L;
    }

    @Override // i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.Q = null;
        this.N = false;
        this.O = false;
    }

    @Override // i2.b
    public final void u(x[] xVarArr, long j10, long j11, g0 g0Var) {
        this.M = this.I.a(xVarArr[0]);
        u0 u0Var = this.Q;
        if (u0Var != null) {
            long j12 = u0Var.b;
            long j13 = (this.R + j12) - j11;
            if (j12 != j13) {
                u0Var = new u0(j13, u0Var.a);
            }
            this.Q = u0Var;
        }
        this.R = j11;
    }

    @Override // i2.b
    public final void x(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.N && this.Q == null) {
                l3.a aVar = this.L;
                aVar.clear();
                qf.b bVar = this.c;
                bVar.y();
                int w9 = w(bVar, aVar, 0);
                if (w9 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.N = true;
                    } else if (aVar.e >= this.w) {
                        aVar.r = this.P;
                        aVar.e();
                        m mVar = this.M;
                        String str = m0.a;
                        u0 a2 = mVar.a(aVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.a.length);
                            F(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new u0(G(aVar.e), (t0[]) arrayList.toArray(new t0[0]));
                            }
                        }
                    }
                } else if (w9 == -5) {
                    x xVar = (x) bVar.c;
                    xVar.getClass();
                    this.P = xVar.x;
                }
            }
            u0 u0Var = this.Q;
            if (u0Var == null || u0Var.b > G(j10)) {
                z10 = false;
            } else {
                u0 u0Var2 = this.Q;
                Handler handler = this.K;
                if (handler != null) {
                    handler.obtainMessage(1, u0Var2).sendToTarget();
                } else {
                    H(u0Var2);
                }
                this.Q = null;
                z10 = true;
            }
            if (this.N && this.Q == null) {
                this.O = true;
            }
        }
    }
}
