// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class y1 {
    public boolean b(hk0 hk0Var) {
        return this instanceof lk0;
    }

    public boolean c() {
        return this instanceof bib;
    }

    public abstract hk0 e();

    public boolean f() {
        return this instanceof lk0;
    }

    public qk2 h(mp3 mp3Var) {
        char charAt;
        int i = mp3Var.e;
        String str = mp3Var.a;
        if (mp3Var.g >= 4 || i >= str.length() || str.charAt(i) != '>') {
            return null;
        }
        int i2 = mp3Var.c + mp3Var.g;
        int i3 = i2 + 1;
        String str2 = mp3Var.a;
        int i4 = i + 1;
        if (i4 < str2.length() && ((charAt = str2.charAt(i4)) == '\t' || charAt == ' ')) {
            i3 = i2 + 2;
        }
        return new qk2(-1, i3, false);
    }

    public void d() {
    }

    public void a(CharSequence charSequence) {
    }

    public void g(tp5 tp5Var) {
    }
}
