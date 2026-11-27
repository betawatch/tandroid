// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class sy0 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final ey7 f;
    public final ey7 g;
    public int h;
    public int i;

    public sy0(ey7 ey7Var, ey7 ey7Var2, boolean z) {
        this.g = ey7Var;
        this.f = ey7Var2;
        this.e = z;
        ey7Var2.N(12);
        this.a = ey7Var2.E();
        ey7Var.N(12);
        this.i = ey7Var.E();
        pke.a("first_chunk must be 1", ey7Var.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        ey7 ey7Var = this.f;
        this.d = z ? ey7Var.G() : ey7Var.C();
        if (this.b == this.h) {
            ey7 ey7Var2 = this.g;
            this.c = ey7Var2.E();
            ey7Var2.O(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? ey7Var2.E() - 1 : -1;
        }
        return true;
    }
}
