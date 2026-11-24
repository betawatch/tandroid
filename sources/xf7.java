// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xf7 {
    public final char a;
    public final int b;
    public final xf7 c;
    public final int d;

    public xf7(char c, pt3 pt3Var, int i, xf7 xf7Var) {
        char c2 = c == 65535 ? (char) 1000 : c;
        this.a = c2;
        this.b = i;
        this.c = xf7Var;
        int length = c2 == 1000 ? 1 : String.valueOf(c).getBytes(pt3Var.a[i].charset()).length;
        length = (xf7Var == null ? 0 : xf7Var.b) != i ? length + 3 : length;
        this.d = xf7Var != null ? length + xf7Var.d : length;
    }
}
