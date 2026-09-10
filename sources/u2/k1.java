package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        if (m1Var.v) {
            return;
        }
        m1Var.r.a();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        m1 m1Var = this.c;
        m1Var.e.i(b2.r0.h(m1Var.s.r), m1Var.s, 0, null, 0L);
        this.b = true;
    }

    @Override // u2.d1
    public final boolean e() {
        return this.c.w;
    }

    @Override // u2.d1
    public final int g(long j3) {
        b();
        if (j3 <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // u2.d1
    public final int t(of.b bVar, h2.h hVar, int i10) {
        b();
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
            bVar.c = m1Var.s;
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
}
