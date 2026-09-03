package r4;

import android.os.Handler;
import g5.q;
import h5.d0;
import h5.w;
import j3.n0;
import j3.r1;
import o4.g0;
import o4.k0;
import org.telegram.ui.yh;
import r3.u;
import r3.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n implements v {
    public final k0 a;
    public final f7.b b = new f7.b((char) 0, 16);
    public final e4.e c = new e4.e();
    public long d = -9223372036854775807L;
    public final /* synthetic */ o e;

    public n(o oVar, q qVar) {
        this.e = oVar;
        this.a = new k0(qVar, null, null);
    }

    @Override // r3.v
    public final void a(int i10, w wVar) {
        k0 k0Var = this.a;
        k0Var.getClass();
        k0Var.a(i10, wVar);
    }

    @Override // r3.v
    public final void b(n0 n0Var) {
        this.a.b(n0Var);
    }

    @Override // r3.v
    public final void c(long j10, int i10, int i11, int i12, u uVar) {
        long g10;
        long j11;
        this.a.c(j10, i10, i11, i12, uVar);
        while (this.a.u(false)) {
            e4.e eVar = this.c;
            eVar.b();
            if (this.a.z(this.b, eVar, 0, false) == -4) {
                eVar.k();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long j12 = eVar.f;
                e4.c a2 = this.e.c.a(eVar);
                if (a2 != null) {
                    g4.a aVar = (g4.a) a2.a[0];
                    String str = aVar.a;
                    String str2 = aVar.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = d0.J(d0.m(aVar.e));
                        } catch (r1 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            m mVar = new m(j12, j11);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        k0 k0Var = this.a;
        g0 g0Var = k0Var.a;
        synchronized (k0Var) {
            int i13 = k0Var.s;
            g10 = i13 == 0 ? -1L : k0Var.g(i13);
        }
        g0Var.b(g10);
    }

    @Override // r3.v
    public final /* synthetic */ void d(int i10, w wVar) {
        yh.a(this, wVar, i10);
    }

    @Override // r3.v
    public final int e(g5.j jVar, int i10, boolean z4) {
        k0 k0Var = this.a;
        k0Var.getClass();
        return k0Var.C(jVar, i10, z4);
    }
}
