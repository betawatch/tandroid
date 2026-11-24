// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ta4 extends x1 {
    public final sa4 a;
    public String b;
    public final StringBuilder c;

    public ta4(char c, int i, int i2) {
        sa4 sa4Var = new sa4();
        this.a = sa4Var;
        this.c = new StringBuilder();
        sa4Var.g = c;
        sa4Var.h = i;
        sa4Var.i = i2;
    }

    @Override // x1
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // x1
    public final void d() {
        String a = j54.a(this.b.trim());
        sa4 sa4Var = this.a;
        sa4Var.j = a;
        sa4Var.k = this.c.toString();
    }

    @Override // x1
    public final gl0 e() {
        return this.a;
    }

    @Override // x1
    public final il2 h(fq3 fq3Var) {
        int i = fq3Var.e;
        int i2 = fq3Var.b;
        String str = fq3Var.a;
        int i3 = fq3Var.g;
        sa4 sa4Var = this.a;
        if (i3 < 4) {
            char c = sa4Var.g;
            int i4 = sa4Var.h;
            int b = ose.b(c, str, i, str.length()) - i;
            if (b >= i4 && ose.c(i + b, str.length(), str) == str.length()) {
                return new il2(-1, -1, true);
            }
        }
        int length = str.length();
        for (int i5 = sa4Var.i; i5 > 0 && i2 < length && str.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return il2.a(i2);
    }
}
