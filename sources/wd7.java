// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wd7 {
    public final ge7 a;
    public final int b;
    public final int c;
    public final byte d;
    public final wd7 e;
    public final int f;

    /* JADX WARN: Multi-variable type inference failed */
    public wd7(xf4 xf4Var, ge7 ge7Var, int i, int i2, int i3, wd7 wd7Var, x9c x9cVar) {
        this.a = ge7Var;
        this.b = i;
        ge7 ge7Var2 = ge7.h;
        int i4 = (ge7Var == ge7Var2 || wd7Var == null) ? i2 : wd7Var.c;
        this.c = i4;
        this.d = i3;
        this.e = wd7Var;
        boolean z = false;
        int i5 = wd7Var != null ? wd7Var.f : 0;
        if ((ge7Var == ge7Var2 && wd7Var == null && i4 != 0) || (wd7Var != null && i4 != wd7Var.c)) {
            z = true;
        }
        i5 = (wd7Var == null || ge7Var != wd7Var.a || z) ? i5 + ge7Var.a(x9cVar) + 4 : i5;
        int ordinal = ge7Var.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i5 += i3 != 1 ? 11 : 6;
            } else if (ordinal == 4) {
                i5 += ((String) xf4Var.b).substring(i, i3 + i).getBytes(((fs3) xf4Var.c).a[i2].charset()).length << 3;
                if (z) {
                    i5 += 12;
                }
            } else if (ordinal == 6) {
                i5 += 13;
            }
        } else {
            i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        }
        this.f = i5;
    }
}
