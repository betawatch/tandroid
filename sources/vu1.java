// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
