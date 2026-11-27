// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yy9 {
    public final bz9 a;
    public final bz9 b;

    public yy9(bz9 bz9Var, bz9 bz9Var2) {
        this.a = bz9Var;
        this.b = bz9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yy9.class != obj.getClass()) {
            return false;
        }
        yy9 yy9Var = (yy9) obj;
        return this.a.equals(yy9Var.a) && this.b.equals(yy9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        bz9 bz9Var = this.a;
        sb.append(bz9Var);
        bz9 bz9Var2 = this.b;
        if (bz9Var.equals(bz9Var2)) {
            str = "";
        } else {
            str = ", " + bz9Var2;
        }
        return c00.k(sb, str, "]");
    }
}
