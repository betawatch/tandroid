package x2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    public final boolean h() {
        return this.a.h();
    }

    @Override // x2.d1
    public final int j(long j3) {
        return this.a.j(j3 - this.b);
    }

    @Override // x2.d1
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        int m10 = this.a.m(aVar, hVar, i7);
        if (m10 == -4) {
            hVar.e += this.b;
        }
        return m10;
    }
}
