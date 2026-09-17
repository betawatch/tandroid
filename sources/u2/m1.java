package u2;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class m1 implements b1 {
    public final b1 a;
    public final long b;

    public m1(b1 b1Var, long j3) {
        this.a = b1Var;
        this.b = j3;
    }

    @Override // u2.b1
    public final void b() {
        this.a.b();
    }

    @Override // u2.b1
    public final boolean e() {
        return this.a.e();
    }

    @Override // u2.b1
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        int f7 = this.a.f(yVar, gVar, i10);
        if (f7 == -4) {
            gVar.h += this.b;
        }
        return f7;
    }

    @Override // u2.b1
    public final int m(long j3) {
        return this.a.m(j3 - this.b);
    }
}
