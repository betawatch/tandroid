package x2;

import b8.uc;
import b8.zb;
import d2.v;
import i2.c0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends f {
    public final e s;
    public ua.b w;
    public long x;
    public volatile boolean y;

    public k(i2.h hVar, i2.n nVar, v vVar, int i3, Object obj, e eVar) {
        super(hVar, nVar, 2, vVar, i3, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = eVar;
    }

    @Override // a3.m
    public final void X1() {
        this.y = true;
    }

    @Override // a3.m
    public final void a() {
        if (this.x == 0) {
            this.s.b(this.w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            i2.n b10 = this.b.b(this.x);
            c0 c0Var = this.r;
            e3.l lVar = new e3.l(c0Var, b10.e, c0Var.open(b10));
            while (!this.y) {
                try {
                    int f10 = this.s.a.f(lVar, e.w);
                    boolean z10 = false;
                    zb.p(f10 != 1);
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
            uc.a(this.r);
        }
    }
}
