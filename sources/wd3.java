// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wd3 {
    public final xw8 a;
    public final byte b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public wd3(xw8 xw8Var, int i, int i2) {
        hre.a(xw8Var, "Null dependency anInterface.");
        this.a = xw8Var;
        this.b = i;
        this.c = i2;
    }

    public static wd3 a(xw8 xw8Var) {
        return new wd3(xw8Var, 1, 0);
    }

    public static wd3 b(Class cls) {
        return new wd3(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wd3)) {
            return false;
        }
        wd3 wd3Var = (wd3) obj;
        return this.a.equals(wd3Var.a) && this.b == wd3Var.b && this.c == wd3Var.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        byte b = this.b;
        sb.append(b == 1 ? "required" : b == 0 ? "optional" : "set");
        sb.append(", injection=");
        byte b2 = this.c;
        if (b2 == 0) {
            str = "direct";
        } else if (b2 == 1) {
            str = "provider";
        } else {
            if (b2 != 2) {
                fi7.g(de9.k(b2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return b00.j(sb, str, "}");
    }

    public wd3(int i, int i2, Class cls) {
        this(xw8.a(cls), i, i2);
    }
}
