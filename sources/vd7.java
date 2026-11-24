// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class vd7 {
    public final char a;
    public final int b;
    public final vd7 c;
    public final int d;

    public vd7(char c, fs3 fs3Var, int i, vd7 vd7Var) {
        char c2 = c == 65535 ? (char) 1000 : c;
        this.a = c2;
        this.b = i;
        this.c = vd7Var;
        int length = c2 == 1000 ? 1 : String.valueOf(c).getBytes(fs3Var.a[i].charset()).length;
        length = (vd7Var == null ? 0 : vd7Var.b) != i ? length + 3 : length;
        this.d = vd7Var != null ? length + vd7Var.d : length;
    }
}
