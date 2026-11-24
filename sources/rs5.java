// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rs5 extends x1 {
    public final qs5 a = new qs5();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public rs5(int i) {
        this.c = i;
    }

    @Override // x1
    public final void a(CharSequence charSequence) {
        StringBuilder sb = this.b;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // x1
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // x1
    public final gk0 e() {
        return this.a;
    }

    @Override // x1
    public final vj2 h(vo3 vo3Var) {
        int i;
        int i2 = vo3Var.e;
        String str = vo3Var.a;
        int length = str.length();
        if (vo3Var.g < 4) {
            int i3 = i2;
            while (true) {
                if (i3 >= length) {
                    i = length - i2;
                    break;
                }
                if ('$' != str.charAt(i3)) {
                    i = i3 - i2;
                    break;
                }
                i3++;
            }
            int i4 = this.c;
            if (i == i4 && lqe.b(' ', str, i2 + i4, length) == length) {
                return new vj2(-1, -1, true);
            }
        }
        return vj2.a(vo3Var.b);
    }
}
