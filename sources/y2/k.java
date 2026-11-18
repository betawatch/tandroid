package y2;

import a8.la;
import c8.s0;
import e2.u;
import j2.b0;
import sg.h0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class k extends f {
    public final e s;
    public h0 w;
    public long x;
    public volatile boolean y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = eVar;
    }

    @Override // b3.m
    public final void A() {
        this.y = true;
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
                    la.p(f10 != 1);
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
            s0.a(this.r);
        }
    }
}
