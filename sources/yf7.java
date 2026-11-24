// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yf7 {
    public final ig7 a;
    public final int b;
    public final int c;
    public final byte d;
    public final yf7 e;
    public final int f;

    /* JADX WARN: Multi-variable type inference failed */
    public yf7(yh4 yh4Var, ig7 ig7Var, int i, int i2, int i3, yf7 yf7Var, ybc ybcVar) {
        this.a = ig7Var;
        this.b = i;
        ig7 ig7Var2 = ig7.h;
        int i4 = (ig7Var == ig7Var2 || yf7Var == null) ? i2 : yf7Var.c;
        this.c = i4;
        this.d = i3;
        this.e = yf7Var;
        boolean z = false;
        int i5 = yf7Var != null ? yf7Var.f : 0;
        if ((ig7Var == ig7Var2 && yf7Var == null && i4 != 0) || (yf7Var != null && i4 != yf7Var.c)) {
            z = true;
        }
        i5 = (yf7Var == null || ig7Var != yf7Var.a || z) ? i5 + ig7Var.a(ybcVar) + 4 : i5;
        int ordinal = ig7Var.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i5 += i3 != 1 ? 11 : 6;
            } else if (ordinal == 4) {
                i5 += ((String) yh4Var.b).substring(i, i3 + i).getBytes(((pt3) yh4Var.c).a[i2].charset()).length << 3;
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
