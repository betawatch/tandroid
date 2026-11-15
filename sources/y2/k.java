package y2;

import a8.ja;
import c8.q0;
import e2.u;
import j2.b0;
import sg.h0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    @Override // b3.l
    public final void D() {
        this.y = true;
    }

    @Override // b3.l
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
                    ja.p(f10 != 1);
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
            q0.a(this.r);
        }
    }
}
