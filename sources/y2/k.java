package y2;

import a8.ma;
import c8.t0;
import e2.u;
import j2.b0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k extends f {
    public final e s;
    public s2.e w;
    public long x;
    public volatile boolean y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = eVar;
    }

    @Override // b3.m
    public final void a() {
        if (this.x == 0) {
            this.s.b(this.w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.b.b(this.x);
            b0 b0Var = this.r;
            f3.l lVar = new f3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.y) {
                try {
                    int f10 = this.s.a.f(lVar, e.w);
                    boolean z10 = false;
                    ma.p(f10 != 1);
                    if (f10 == 0) {
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
            t0.a(this.r);
        }
    }

    @Override // b3.m
    public final void y() {
        this.y = true;
    }
}
