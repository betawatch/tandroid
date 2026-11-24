// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tb3 {
    public final String a;
    public int b;
    public long c;
    public final rx6 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ ub3 g;

    public tb3(ub3 ub3Var, String str, int i, rx6 rx6Var) {
        this.g = ub3Var;
        this.a = str;
        this.b = i;
        this.c = rx6Var == null ? -1L : rx6Var.d;
        if (rx6Var == null || !rx6Var.c()) {
            return;
        }
        this.d = rx6Var;
    }

    public final boolean a(tj tjVar) {
        rx6 rx6Var = tjVar.d;
        aob aobVar = tjVar.b;
        if (rx6Var == null) {
            return this.b != tjVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (rx6Var.d > j) {
            return true;
        }
        rx6 rx6Var2 = this.d;
        if (rx6Var2 == null) {
            return false;
        }
        int i = rx6Var2.b;
        int b = aobVar.b(rx6Var.a);
        int b2 = aobVar.b(rx6Var2.a);
        if (rx6Var.d < rx6Var2.d || b < b2) {
            return false;
        }
        if (b > b2) {
            return true;
        }
        if (!rx6Var.c()) {
            int i2 = rx6Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = rx6Var.b;
        int i4 = rx6Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > rx6Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(aob aobVar, aob aobVar2) {
        rx6 rx6Var;
        int i = this.b;
        if (i < aobVar.o()) {
            ub3 ub3Var = this.g;
            znb znbVar = ub3Var.a;
            aobVar.n(i, znbVar);
            for (int i2 = znbVar.m; i2 <= znbVar.n; i2++) {
                int b = aobVar2.b(aobVar.l(i2));
                if (b != -1) {
                    i = aobVar2.f(b, ub3Var.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        return i != -1 && ((rx6Var = this.d) == null || aobVar2.b(rx6Var.a) != -1);
    }
}
