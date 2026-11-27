// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xg0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public xg0(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg0)) {
            return false;
        }
        xg0 xg0Var = (xg0) obj;
        return this.c == xg0Var.c && this.d == xg0Var.d && Objects.equals(this.a, xg0Var.a) && Objects.equals(this.b, xg0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
