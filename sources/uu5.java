// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class uu5 extends y1 {
    public final tu5 a = new tu5();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public uu5(int i) {
        this.c = i;
    }

    @Override // y1
    public final void a(CharSequence charSequence) {
        StringBuilder sb = this.b;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // y1
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // y1
    public final hk0 e() {
        return this.a;
    }

    @Override // y1
    public final qk2 h(mp3 mp3Var) {
        int i;
        int i2 = mp3Var.e;
        String str = mp3Var.a;
        int length = str.length();
        if (mp3Var.g < 4) {
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
            if (i == i4 && dve.b(' ', str, i2 + i4, length) == length) {
                return new qk2(-1, -1, true);
            }
        }
        return qk2.a(mp3Var.b);
    }
}
