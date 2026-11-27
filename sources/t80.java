// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class t80 extends yz2 {
    public final long a;
    public final String b;
    public final v80 c;
    public final f90 d;
    public final g90 e;
    public final k90 f;

    public t80(long j, String str, v80 v80Var, f90 f90Var, g90 g90Var, k90 k90Var) {
        this.a = j;
        this.b = str;
        this.c = v80Var;
        this.d = f90Var;
        this.e = g90Var;
        this.f = k90Var;
    }

    public final s80 a() {
        s80 s80Var = new s80();
        s80Var.a = this.a;
        s80Var.b = this.b;
        s80Var.c = this.c;
        s80Var.d = this.d;
        s80Var.e = this.e;
        s80Var.f = this.f;
        s80Var.g = (byte) 1;
        return s80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yz2)) {
            return false;
        }
        t80 t80Var = (t80) ((yz2) obj);
        if (this.a != t80Var.a || !this.b.equals(t80Var.b) || !this.c.equals(t80Var.c) || !this.d.equals(t80Var.d)) {
            return false;
        }
        g90 g90Var = t80Var.e;
        g90 g90Var2 = this.e;
        if (g90Var2 == null) {
            if (g90Var != null) {
                return false;
            }
        } else if (!g90Var2.equals(g90Var)) {
            return false;
        }
        k90 k90Var = t80Var.f;
        k90 k90Var2 = this.f;
        return k90Var2 == null ? k90Var == null : k90Var2.equals(k90Var);
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        g90 g90Var = this.e;
        int hashCode2 = (hashCode ^ (g90Var == null ? 0 : g90Var.hashCode())) * 1000003;
        k90 k90Var = this.f;
        return hashCode2 ^ (k90Var != null ? k90Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
