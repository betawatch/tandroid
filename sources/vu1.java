// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vu1 {
    public jq1 a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(k27 k27Var) {
        if (k27Var == null) {
            return false;
        }
        if (k27Var.e1() != this.b) {
            return this.c != 0 && k27Var.c1() == this.c;
        }
        return true;
    }

    public final boolean b(int i, long j) {
        if (this.b == i && this.c == j) {
            return false;
        }
        this.b = i;
        this.c = j;
        if (i != 0) {
            return true;
        }
        this.e = false;
        return true;
    }
}
