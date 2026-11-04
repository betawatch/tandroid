package u2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b8.te;
import b8.zb;
import d2.p0;
import d2.q0;
import d2.r0;
import d2.s0;
import d2.v;
import ei.y8;
import g2.n0;
import g2.s;
import java.util.ArrayList;
import k2.c0;
import k2.i0;
import k2.p1;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends k2.b implements Handler.Callback {
    public final a J;
    public final c0 K;
    public final Handler L;
    public final n3.a M;
    public te N;
    public boolean O;
    public boolean P;
    public long Q;
    public s0 R;
    public long S;

    public b(c0 c0Var, Looper looper) {
        super(5);
        Handler handler;
        this.K = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = n0.a;
            handler = new Handler(looper, this);
        }
        this.L = handler;
        this.J = a.a;
        this.M = new n3.a();
        this.S = -9223372036854775807L;
    }

    @Override // k2.b
    public final int C(v vVar) {
        if (this.J.b(vVar)) {
            return p1.a(vVar.T == 0 ? 4 : 2, 0, 0, 0);
        }
        return p1.a(0, 0, 0, 0);
    }

    public final void F(s0 s0Var, ArrayList arrayList) {
        int i3 = 0;
        while (true) {
            r0[] r0VarArr = s0Var.a;
            if (i3 >= r0VarArr.length) {
                return;
            }
            v b10 = r0VarArr[i3].b();
            if (b10 != null) {
                a aVar = this.J;
                if (aVar.b(b10)) {
                    te a10 = aVar.a(b10);
                    byte[] c2 = r0VarArr[i3].c();
                    c2.getClass();
                    n3.a aVar2 = this.M;
                    aVar2.clear();
                    aVar2.b(c2.length);
                    aVar2.c.put(c2);
                    aVar2.c();
                    s0 a11 = a10.a(aVar2);
                    if (a11 != null) {
                        F(a11, arrayList);
                    }
                    i3++;
                }
            }
            arrayList.add(r0VarArr[i3]);
            i3++;
        }
    }

    public final long G(long j10) {
        zb.p(j10 != -9223372036854775807L);
        zb.p(this.S != -9223372036854775807L);
        return j10 - this.S;
    }

    public final void H(s0 s0Var) {
        c0 c0Var = this.K;
        i0 i0Var = c0Var.a;
        q0 q0Var = i0Var.o0;
        s sVar = i0Var.m;
        p0 a10 = q0Var.a();
        int i3 = 0;
        while (true) {
            r0[] r0VarArr = s0Var.a;
            if (i3 >= r0VarArr.length) {
                break;
            }
            r0VarArr[i3].a(a10);
            i3++;
        }
        i0Var.o0 = new q0(a10);
        q0 f12 = i0Var.f1();
        if (!f12.equals(i0Var.Q)) {
            i0Var.Q = f12;
            sVar.c(14, new y8(c0Var, 21));
        }
        sVar.c(28, new y8(s0Var, 22));
        sVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        H((s0) message.obj);
        return true;
    }

    @Override // k2.b
    public final String j() {
        return "MetadataRenderer";
    }

    @Override // k2.b
    public final boolean l() {
        return this.P;
    }

    @Override // k2.b
    public final boolean m() {
        return true;
    }

    @Override // k2.b
    public final void n() {
        this.R = null;
        this.N = null;
        this.S = -9223372036854775807L;
    }

    @Override // k2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.R = null;
        this.O = false;
        this.P = false;
    }

    @Override // k2.b
    public final void u(v[] vVarArr, long j10, long j11, g0 g0Var) {
        this.N = this.J.a(vVarArr[0]);
        s0 s0Var = this.R;
        if (s0Var != null) {
            long j12 = s0Var.b;
            long j13 = (this.S + j12) - j11;
            if (j12 != j13) {
                s0Var = new s0(j13, s0Var.a);
            }
            this.R = s0Var;
        }
        this.S = j11;
    }

    @Override // k2.b
    public final void x(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.O && this.R == null) {
                n3.a aVar = this.M;
                aVar.clear();
                tf.b bVar = this.c;
                bVar.q();
                int w10 = w(bVar, aVar, 0);
                if (w10 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.O = true;
                    } else if (aVar.e >= this.x) {
                        aVar.r = this.Q;
                        aVar.c();
                        te teVar = this.N;
                        String str = n0.a;
                        s0 a10 = teVar.a(aVar);
                        if (a10 != null) {
                            ArrayList arrayList = new ArrayList(a10.a.length);
                            F(a10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.R = new s0(G(aVar.e), (r0[]) arrayList.toArray(new r0[0]));
                            }
                        }
                    }
                } else if (w10 == -5) {
                    v vVar = (v) bVar.b;
                    vVar.getClass();
                    this.Q = vVar.x;
                }
            }
            s0 s0Var = this.R;
            if (s0Var == null || s0Var.b > G(j10)) {
                z10 = false;
            } else {
                s0 s0Var2 = this.R;
                Handler handler = this.L;
                if (handler != null) {
                    handler.obtainMessage(1, s0Var2).sendToTarget();
                } else {
                    H(s0Var2);
                }
                this.R = null;
                z10 = true;
            }
            if (this.O && this.R == null) {
                this.P = true;
            }
        }
    }
}
