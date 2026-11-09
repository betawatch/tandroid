package y2;

import a8.ia;
import c8.p0;
import e2.u;
import j2.c0;
import sg.i0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class k extends f {
    public final e s;
    public i0 w;
    public long x;
    public volatile boolean y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = eVar;
    }

    @Override // b3.l
    public final void a() {
        if (this.x == 0) {
            this.s.b(this.w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.b.b(this.x);
            c0 c0Var = this.r;
            f3.l lVar = new f3.l(c0Var, b10.e, c0Var.open(b10));
            while (!this.y) {
                try {
                    int f10 = this.s.a.f(lVar, e.w);
                    boolean z9 = false;
                    ia.p(f10 != 1);
                    if (f10 == 0) {
                        z9 = true;
                    }
                    if (!z9) {
                        break;
                    }
                } finally {
                    this.x = lVar.d - this.b.e;
                    this.s.a();
                }
            }
        } finally {
            p0.a(this.r);
        }
    }

    @Override // b3.l
    public final void q0() {
        this.y = true;
    }
}
