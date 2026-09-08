package v2;

import b2.s;
import g2.b0;
import v7.m7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j extends e {
    public final d s;
    public o0.a v;
    public long w;
    public volatile boolean x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = dVar;
    }

    @Override // y2.j
    public final void W() {
        this.x = true;
    }

    @Override // y2.j
    public final void a() {
        if (this.w == 0) {
            this.s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.b.b(this.w);
            b0 b0Var = this.r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.x) {
                try {
                    int m10 = this.s.a.m(lVar, d.s);
                    boolean z10 = false;
                    e2.d.g(m10 != 1);
                    if (m10 == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.w = lVar.d - this.b.e;
                    c3.b0 b0Var2 = this.s.n;
                }
            }
        } finally {
            m7.a(this.r);
        }
    }
}
