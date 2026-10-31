package u2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k1 implements d1 {
    public int a;
    public boolean b;
    public final /* synthetic */ m1 c;

    public k1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // u2.d1
    public final void a() {
        m1 m1Var = this.c;
        if (m1Var.w) {
            return;
        }
        m1Var.r.a();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        m1 m1Var = this.c;
        m1Var.e.l(b2.v0.h(m1Var.s.s), m1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // u2.d1
    public final boolean e() {
        return this.c.x;
    }

    @Override // u2.d1
    public final int i(long j10) {
        b();
        if (j10 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // u2.d1
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        b();
        m1 m1Var = this.c;
        boolean z10 = m1Var.x;
        if (z10 && m1Var.y == null) {
            this.a = 2;
        }
        int i11 = this.a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            bVar.c = m1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        m1Var.y.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i10 & 4) == 0) {
            hVar.c(m1Var.D);
            hVar.c.put(m1Var.y, 0, m1Var.D);
        }
        if ((i10 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }
}
