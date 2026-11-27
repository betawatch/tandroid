// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qe3 {
    public final h09 a;
    public final byte b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public qe3(h09 h09Var, int i, int i2) {
        bwe.a(h09Var, "Null dependency anInterface.");
        this.a = h09Var;
        this.b = i;
        this.c = i2;
    }

    public static qe3 a(h09 h09Var) {
        return new qe3(h09Var, 1, 0);
    }

    public static qe3 b(Class cls) {
        return new qe3(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qe3)) {
            return false;
        }
        qe3 qe3Var = (qe3) obj;
        return this.a.equals(qe3Var.a) && this.b == qe3Var.b && this.c == qe3Var.c;
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
                hz6.e(uh9.k(b2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return c00.k(sb, str, "}");
    }

    public qe3(int i, int i2, Class cls) {
        this(h09.a(cls), i, i2);
    }
}
