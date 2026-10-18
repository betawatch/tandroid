package u2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class p1 implements e1 {
    public final e1 a;
    public final long b;

    public p1(e1 e1Var, long j10) {
        this.a = e1Var;
        this.b = j10;
    }

    @Override // u2.e1
    public final void a() {
        this.a.a();
    }

    @Override // u2.e1
    public final boolean e() {
        return this.a.e();
    }

    @Override // u2.e1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        int f7 = this.a.f(bVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.b;
        }
        return f7;
    }

    @Override // u2.e1
    public final int h(long j10) {
        return this.a.h(j10 - this.b);
    }
}
