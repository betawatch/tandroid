// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xg5 {
    public final String a;
    public final byte b;
    public final double c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public xg5(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        yve.p(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg5)) {
            return false;
        }
        xg5 xg5Var = (xg5) obj;
        return this.b == xg5Var.b && Double.compare(this.c, xg5Var.c) == 0 && this.a.equals(xg5Var.a) && Objects.equals(this.d, xg5Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public xg5(String str, double d) {
        this.a = str;
        this.b = (byte) 2;
        this.c = d;
        this.d = null;
    }
}
