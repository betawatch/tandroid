// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qrb implements at9 {
    public final at9 a;
    public final long b;

    public qrb(at9 at9Var, long j) {
        this.a = at9Var;
        this.b = j;
    }

    @Override // at9
    public final int a() {
        return this.a.a();
    }

    @Override // at9
    public final void g() {
        this.a.g();
    }

    @Override // at9
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        int i2 = this.a.i(ym4Var, s93Var, i);
        if (i2 == -4) {
            s93Var.e += this.b;
        }
        return i2;
    }

    @Override // at9
    public final boolean k() {
        return this.a.k();
    }

    @Override // at9
    public final int o(long j) {
        return this.a.o(j - this.b);
    }
}
