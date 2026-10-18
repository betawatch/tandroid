package v2;

import b2.w;
import g2.b0;
import v7.k7;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class k extends f {
    public final e s;
    public n2.e v;
    public long w;
    public volatile boolean x;

    public k(g2.h hVar, g2.m mVar, w wVar, int i10, Object obj, e eVar) {
        super(hVar, mVar, 2, wVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = eVar;
    }

    @Override // y2.i
    public final void O() {
        this.x = true;
    }

    @Override // y2.i
    public final void a() {
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
                    u6.p(f7 != 1);
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
            k7.a(this.r);
        }
    }
}
