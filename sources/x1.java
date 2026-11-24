// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class x1 {
    public boolean b(gl0 gl0Var) {
        return this instanceof kl0;
    }

    public boolean c() {
        return this instanceof ggb;
    }

    public abstract gl0 e();

    public boolean f() {
        return this instanceof kl0;
    }

    public il2 h(fq3 fq3Var) {
        char charAt;
        int i = fq3Var.e;
        String str = fq3Var.a;
        if (fq3Var.g >= 4 || i >= str.length() || str.charAt(i) != '>') {
            return null;
        }
        int i2 = fq3Var.c + fq3Var.g;
        int i3 = i2 + 1;
        String str2 = fq3Var.a;
        int i4 = i + 1;
        if (i4 < str2.length() && ((charAt = str2.charAt(i4)) == '\t' || charAt == ' ')) {
            i3 = i2 + 2;
        }
        return new il2(-1, i3, false);
    }

    public void d() {
    }

    public void a(CharSequence charSequence) {
    }

    public void g(qp5 qp5Var) {
    }
}
