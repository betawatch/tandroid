package s2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b2.m0;
import b2.n0;
import b2.o0;
import b2.p0;
import b2.s;
import e2.d;
import e2.d0;
import e2.p;
import i2.c0;
import i2.f;
import i2.f0;
import i2.g;
import java.util.ArrayList;
import n4.y;
import w7.l;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b extends f implements Handler.Callback {
    public final a I;
    public final c0 J;
    public final Handler K;
    public final l3.a L;
    public l M;
    public boolean N;
    public boolean O;
    public long P;
    public p0 Q;
    public long R;

    public b(c0 c0Var, Looper looper) {
        super(5);
        Handler handler;
        this.J = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = d0.a;
            handler = new Handler(looper, this);
        }
        this.K = handler;
        this.I = a.a;
        this.L = new l3.a();
        this.R = -9223372036854775807L;
    }

    public final void B(p0 p0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.a;
            if (i10 >= o0VarArr.length) {
                return;
            }
            s a2 = o0VarArr[i10].a();
            if (a2 != null) {
                a aVar = this.I;
                if (aVar.b(a2)) {
                    l a10 = aVar.a(a2);
                    byte[] c10 = o0VarArr[i10].c();
                    c10.getClass();
                    l3.a aVar2 = this.L;
                    aVar2.i();
                    aVar2.l(c10.length);
                    aVar2.e.put(c10);
                    aVar2.m();
                    p0 a11 = a10.a(aVar2);
                    if (a11 != null) {
                        B(a11, arrayList);
                    }
                    i10++;
                }
            }
            arrayList.add(o0VarArr[i10]);
            i10++;
        }
    }

    public final long C(long j3) {
        d.g(j3 != -9223372036854775807L);
        d.g(this.R != -9223372036854775807L);
        return j3 - this.R;
    }

    public final void D(p0 p0Var) {
        c0 c0Var = this.J;
        f0 f0Var = c0Var.a;
        n0 n0Var = f0Var.i0;
        p pVar = f0Var.m;
        m0 a2 = n0Var.a();
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.a;
            if (i10 >= o0VarArr.length) {
                break;
            }
            o0VarArr[i10].b(a2);
            i10++;
        }
        f0Var.i0 = new n0(a2);
        n0 b12 = f0Var.b1();
        if (!b12.equals(f0Var.O)) {
            f0Var.O = b12;
            pVar.c(14, new fi.f(c0Var, 8));
        }
        pVar.c(28, new fi.f(p0Var, 9));
        pVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        D((p0) message.obj);
        return true;
    }

    @Override // i2.f
    public final String j() {
        return "MetadataRenderer";
    }

    @Override // i2.f
    public final boolean l() {
        return this.O;
    }

    @Override // i2.f
    public final boolean m() {
        return true;
    }

    @Override // i2.f
    public final void n() {
        this.Q = null;
        this.M = null;
        this.R = -9223372036854775807L;
    }

    @Override // i2.f
    public final void p(long j3, boolean z10) {
        this.Q = null;
        this.N = false;
        this.O = false;
    }

    @Override // i2.f
    public final void u(s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        this.M = this.I.a(sVarArr[0]);
        p0 p0Var = this.Q;
        if (p0Var != null) {
            long j11 = p0Var.b;
            long j12 = (this.R + j11) - j10;
            if (j11 != j12) {
                p0Var = new p0(j12, p0Var.a);
            }
            this.Q = p0Var;
        }
        this.R = j10;
    }

    @Override // i2.f
    public final void w(long j3, long j10) {
        boolean z10 = true;
        while (z10) {
            if (!this.N && this.Q == null) {
                l3.a aVar = this.L;
                aVar.i();
                y yVar = this.c;
                yVar.A();
                int v = v(yVar, aVar, 0);
                if (v == -4) {
                    if (aVar.c(4)) {
                        this.N = true;
                    } else if (aVar.h >= this.w) {
                        aVar.v = this.P;
                        aVar.m();
                        l lVar = this.M;
                        String str = d0.a;
                        p0 a2 = lVar.a(aVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.a.length);
                            B(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new p0(C(aVar.h), (o0[]) arrayList.toArray(new o0[0]));
                            }
                        }
                    }
                } else if (v == -5) {
                    s sVar = (s) yVar.c;
                    sVar.getClass();
                    this.P = sVar.w;
                }
            }
            p0 p0Var = this.Q;
            if (p0Var == null || p0Var.b > C(j3)) {
                z10 = false;
            } else {
                p0 p0Var2 = this.Q;
                Handler handler = this.K;
                if (handler != null) {
                    handler.obtainMessage(1, p0Var2).sendToTarget();
                } else {
                    D(p0Var2);
                }
                this.Q = null;
                z10 = true;
            }
            if (this.N && this.Q == null) {
                this.O = true;
            }
        }
    }

    @Override // i2.f
    public final int z(s sVar) {
        if (this.I.b(sVar)) {
            return g.b(sVar.S == 0 ? 4 : 2, 0, 0, 0);
        }
        return g.b(0, 0, 0, 0);
    }
}
