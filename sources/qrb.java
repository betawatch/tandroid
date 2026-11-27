// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
