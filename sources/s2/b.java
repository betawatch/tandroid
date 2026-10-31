package s2;

import a1.c;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b2.r0;
import b2.s0;
import b2.t0;
import b2.u0;
import b2.x;
import e2.l0;
import e2.r;
import i2.c0;
import i2.i0;
import java.util.ArrayList;
import u2.g0;
import v7.t6;
import w7.l;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends i2.b implements Handler.Callback {
    public final a I;
    public final c0 J;
    public final Handler K;
    public final l3.a L;
    public l M;
    public boolean N;
    public boolean O;
    public long P;
    public u0 Q;
    public long R;

    public b(c0 c0Var, Looper looper) {
        super(5);
        Handler handler;
        this.J = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = l0.a;
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
            return i0.a.a(xVar.T == 0 ? 4 : 2, 0, 0, 0);
        }
        return i0.a.a(0, 0, 0, 0);
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
                    l a10 = aVar.a(a2);
                    byte[] c10 = t0VarArr[i10].c();
                    c10.getClass();
                    l3.a aVar2 = this.L;
                    aVar2.clear();
                    aVar2.c(c10.length);
                    aVar2.c.put(c10);
                    aVar2.d();
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
        t6.p(j10 != -9223372036854775807L);
        t6.p(this.R != -9223372036854775807L);
        return j10 - this.R;
    }

    public final void H(u0 u0Var) {
        c0 c0Var = this.J;
        i0 i0Var = c0Var.a;
        s0 s0Var = i0Var.o0;
        r rVar = i0Var.m;
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
        i0Var.o0 = new s0(a2);
        s0 f12 = i0Var.f1();
        if (!f12.equals(i0Var.Q)) {
            i0Var.Q = f12;
            rVar.c(14, new c(c0Var, 27));
        }
        rVar.c(28, new c(u0Var, 28));
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
                hf.b bVar = this.c;
                bVar.L();
                int w9 = w(bVar, aVar, 0);
                if (w9 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.N = true;
                    } else if (aVar.e >= this.x) {
                        aVar.r = this.P;
                        aVar.d();
                        l lVar = this.M;
                        String str = l0.a;
                        u0 a2 = lVar.a(aVar);
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
