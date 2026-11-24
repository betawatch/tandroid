// default package

import java.util.function.IntSupplier;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class us2 extends ns2 {
    public int d;
    public IntSupplier e;
    public int f;
    public int g;

    public final vs2 u(bt2 bt2Var) {
        IntSupplier zo9Var;
        IntSupplier intSupplier = this.e;
        if (intSupplier != null) {
            zo9Var = intSupplier;
        } else {
            int i = this.d;
            r(i >= this.f && i <= this.g, Integer.valueOf(i));
            zo9Var = new zo9(this.d);
        }
        vs2 vs2Var = new vs2(s(), zo9Var, this.f, this.g, this.a);
        q(bt2Var, vs2Var);
        return vs2Var;
    }

    public final void v(int i) {
        this.d = i;
        this.e = null;
    }

    public final void w(int i, int i2) {
        if (i > i2) {
            u36.j(b10.g(i, i2, "range ", ".."));
        } else {
            this.f = i;
            this.g = i2;
        }
    }
}
