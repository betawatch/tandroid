package v2;

import b2.x;
import g2.c0;
import v7.l7;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends f {
    public final e s;
    public u9.b w;
    public long x;
    public volatile boolean y;

    public k(g2.h hVar, g2.n nVar, x xVar, int i10, Object obj, e eVar) {
        super(hVar, nVar, 2, xVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = eVar;
    }

    @Override // y2.i
    public final void R1() {
        this.y = true;
    }

    @Override // y2.i
    public final void b() {
        if (this.x == 0) {
            this.s.b(this.w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.n b10 = this.b.b(this.x);
            c0 c0Var = this.r;
            c3.l lVar = new c3.l(c0Var, b10.e, c0Var.open(b10));
            while (!this.y) {
                try {
                    int f7 = this.s.a.f(lVar, e.w);
                    boolean z10 = false;
                    t6.p(f7 != 1);
                    if (f7 == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.x = lVar.d - this.b.e;
                    this.s.a();
                }
            }
        } finally {
            l7.a(this.r);
        }
    }
}
