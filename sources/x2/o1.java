package x2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o1 implements d1 {
    public final d1 a;
    public final long b;

    public o1(d1 d1Var, long j3) {
        this.a = d1Var;
        this.b = j3;
    }

    @Override // x2.d1
    public final void a() {
        this.a.a();
    }

    @Override // x2.d1
    public final int b(jb.m mVar, k2.h hVar, int i7) {
        int b10 = this.a.b(mVar, hVar, i7);
        if (b10 == -4) {
            hVar.e += this.b;
        }
        return b10;
    }

    @Override // x2.d1
    public final boolean h() {
        return this.a.h();
    }

    @Override // x2.d1
    public final int o(long j3) {
        return this.a.o(j3 - this.b);
    }
}
