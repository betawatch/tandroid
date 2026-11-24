// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class rl2 {
    public final sl2 a;
    public final int b;
    public final int c;

    public rl2(sl2 sl2Var, int i, int i2) {
        this.a = sl2Var;
        this.b = i;
        this.c = i2;
    }

    public final float a(float f) {
        return (f / this.a.d[this.c]) * this.b;
    }

    public final float b(float f) {
        return (f / this.a.d[this.c]) * (this.b + 1);
    }
}
