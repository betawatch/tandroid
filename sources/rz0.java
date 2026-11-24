// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rz0 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final yw7 f;
    public final yw7 g;
    public int h;
    public int i;

    public rz0(yw7 yw7Var, yw7 yw7Var2, boolean z) {
        this.g = yw7Var;
        this.f = yw7Var2;
        this.e = z;
        yw7Var2.N(12);
        this.a = yw7Var2.E();
        yw7Var.N(12);
        this.i = yw7Var.E();
        zhe.a("first_chunk must be 1", yw7Var.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        yw7 yw7Var = this.f;
        this.d = z ? yw7Var.G() : yw7Var.C();
        if (this.b == this.h) {
            yw7 yw7Var2 = this.g;
            this.c = yw7Var2.E();
            yw7Var2.O(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? yw7Var2.E() - 1 : -1;
        }
        return true;
    }
}
