package u2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k1 implements d1 {
    public int a;
    public boolean b;
    public final /* synthetic */ m1 c;

    public k1(m1 m1Var) {
        this.c = m1Var;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        m1 m1Var = this.c;
        m1Var.e.l(b2.w0.h(m1Var.s.s), m1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // u2.d1
    public final void d() {
        m1 m1Var = this.c;
        if (m1Var.v) {
            return;
        }
        m1Var.r.d();
    }

    @Override // u2.d1
    public final boolean e() {
        return this.c.w;
    }

    @Override // u2.d1
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        a();
        m1 m1Var = this.c;
        boolean z10 = m1Var.w;
        if (z10 && m1Var.x == null) {
            this.a = 2;
        }
        int i11 = this.a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            sVar.c = m1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        m1Var.x.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i10 & 4) == 0) {
            hVar.b(m1Var.y);
            hVar.c.put(m1Var.x, 0, m1Var.y);
        }
        if ((i10 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // u2.d1
    public final int j(long j10) {
        a();
        if (j10 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
