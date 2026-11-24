// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xd7 {
    public final ge7 a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ xl3 e;

    public xd7(xl3 xl3Var, ge7 ge7Var, int i, int i2, int i3) {
        this.e = xl3Var;
        this.a = ge7Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        ge7 ge7Var = this.a;
        ge7 ge7Var2 = ge7.h;
        int i = this.d;
        if (ge7Var != ge7Var2) {
            return i;
        }
        xf4 xf4Var = (xf4) this.e.c;
        fs3 fs3Var = (fs3) xf4Var.c;
        String str = (String) xf4Var.b;
        int i2 = this.b;
        return str.substring(i2, i + i2).getBytes(fs3Var.a[this.c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ge7 ge7Var = this.a;
        sb.append(ge7Var);
        sb.append('(');
        xf4 xf4Var = (xf4) this.e.c;
        if (ge7Var == ge7.n) {
            fs3 fs3Var = (fs3) xf4Var.c;
            sb.append(fs3Var.a[this.c].charset().displayName());
        } else {
            String str = (String) xf4Var.b;
            int i = this.d;
            int i2 = this.b;
            String substring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < substring.length(); i3++) {
                if (substring.charAt(i3) < ' ' || substring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(substring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
