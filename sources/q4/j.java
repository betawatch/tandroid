package q4;

import g5.p;
import g5.u0;
import j3.n0;
import j7.p7;
import n7.qa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j extends e {
    public final d s;
    public qa v;
    public long w;
    public volatile boolean x;

    public j(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, d dVar) {
        super(mVar, pVar, 2, n0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.s = dVar;
    }

    @Override // g5.j0
    public final void a() {
        if (this.w == 0) {
            this.s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p b10 = this.b.b(this.w);
            u0 u0Var = this.r;
            r3.h hVar = new r3.h(u0Var, b10.e, u0Var.open(b10));
            while (!this.x) {
                try {
                    int h = this.s.a.h(hVar, d.s);
                    boolean z4 = false;
                    h5.a.i(h != 1);
                    if (h == 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        break;
                    }
                } finally {
                    this.w = hVar.d - this.b.e;
                }
            }
        } finally {
            p7.a(this.r);
        }
    }

    @Override // g5.j0
    public final void b() {
        this.x = true;
    }
}
