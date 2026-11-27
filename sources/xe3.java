// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xe3 {
    public static final xe3 c = new xe3(new rg7(18));
    public static final String d;
    public static final String e;
    public final int a = 0;
    public final int b = 0;

    static {
        String str = gcc.a;
        d = "1";
        e = "2";
    }

    public xe3(rg7 rg7Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe3)) {
            return false;
        }
        xe3 xe3Var = (xe3) obj;
        return this.a == xe3Var.a && this.b == xe3Var.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
