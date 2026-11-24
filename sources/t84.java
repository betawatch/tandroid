// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t84 extends x1 {
    public final s84 a;
    public String b;
    public final StringBuilder c;

    public t84(char c, int i, int i2) {
        s84 s84Var = new s84();
        this.a = s84Var;
        this.c = new StringBuilder();
        s84Var.g = c;
        s84Var.h = i;
        s84Var.i = i2;
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
        String a = z34.a(this.b.trim());
        s84 s84Var = this.a;
        s84Var.j = a;
        s84Var.k = this.c.toString();
    }

    @Override // x1
    public final gk0 e() {
        return this.a;
    }

    @Override // x1
    public final vj2 h(vo3 vo3Var) {
        int i = vo3Var.e;
        int i2 = vo3Var.b;
        String str = vo3Var.a;
        int i3 = vo3Var.g;
        s84 s84Var = this.a;
        if (i3 < 4) {
            char c = s84Var.g;
            int i4 = s84Var.h;
            int b = lqe.b(c, str, i, str.length()) - i;
            if (b >= i4 && lqe.c(i + b, str.length(), str) == str.length()) {
                return new vj2(-1, -1, true);
            }
        }
        int length = str.length();
        for (int i5 = s84Var.i; i5 > 0 && i2 < length && str.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return vj2.a(i2);
    }
}
