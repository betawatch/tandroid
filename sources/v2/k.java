package v2;

import a8.hc;
import a8.yb;
import b2.x;
import g2.b0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k extends f {
    public final e s;
    public m4.c v;
    public long w;
    public volatile boolean x;

    public k(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, e eVar) {
        super(hVar, mVar, 2, xVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = eVar;
    }

    @Override // y2.i
    public final void b() {
        if (this.w == 0) {
            this.s.b(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.b.b(this.w);
            b0 b0Var = this.r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.x) {
                try {
                    int f7 = this.s.a.f(lVar, e.v);
                    boolean z10 = false;
                    yb.p(f7 != 1);
                    if (f7 == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.w = lVar.d - this.b.e;
                    this.s.a();
                }
            }
        } finally {
            hc.a(this.r);
        }
    }

    @Override // y2.i
    public final void f0() {
        this.x = true;
    }
}
