package x2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class k1 implements d1 {
    public int a;
    public boolean b;
    public final /* synthetic */ m1 c;

    public k1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // x2.d1
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
        m1Var.e.j(e2.s0.h(m1Var.s.s), m1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // x2.d1
    public final boolean h() {
        return this.c.x;
    }

    @Override // x2.d1
    public final int j(long j3) {
        b();
        if (j3 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // x2.d1
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        b();
        m1 m1Var = this.c;
        boolean z10 = m1Var.x;
        if (z10 && m1Var.y == null) {
            this.a = 2;
        }
        int i10 = this.a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i7 & 2) != 0 || i10 == 0) {
            aVar.c = m1Var.s;
            this.a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        m1Var.y.getClass();
        hVar.addFlag(1);
        hVar.e = 0L;
        if ((i7 & 4) == 0) {
            hVar.b(m1Var.E);
            hVar.c.put(m1Var.y, 0, m1Var.E);
        }
        if ((i7 & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }
}
