package x2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
