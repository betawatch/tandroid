// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class r80 extends dz2 {
    public final long a;
    public final String b;
    public final t80 c;
    public final d90 d;
    public final e90 e;
    public final i90 f;

    public r80(long j, String str, t80 t80Var, d90 d90Var, e90 e90Var, i90 i90Var) {
        this.a = j;
        this.b = str;
        this.c = t80Var;
        this.d = d90Var;
        this.e = e90Var;
        this.f = i90Var;
    }

    public final q80 a() {
        q80 q80Var = new q80();
        q80Var.a = this.a;
        q80Var.b = this.b;
        q80Var.c = this.c;
        q80Var.d = this.d;
        q80Var.e = this.e;
        q80Var.f = this.f;
        q80Var.g = (byte) 1;
        return q80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dz2)) {
            return false;
        }
        r80 r80Var = (r80) ((dz2) obj);
        if (this.a != r80Var.a || !this.b.equals(r80Var.b) || !this.c.equals(r80Var.c) || !this.d.equals(r80Var.d)) {
            return false;
        }
        e90 e90Var = r80Var.e;
        e90 e90Var2 = this.e;
        if (e90Var2 == null) {
            if (e90Var != null) {
                return false;
            }
        } else if (!e90Var2.equals(e90Var)) {
            return false;
        }
        i90 i90Var = r80Var.f;
        i90 i90Var2 = this.f;
        return i90Var2 == null ? i90Var == null : i90Var2.equals(i90Var);
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        e90 e90Var = this.e;
        int hashCode2 = (hashCode ^ (e90Var == null ? 0 : e90Var.hashCode())) * 1000003;
        i90 i90Var = this.f;
        return hashCode2 ^ (i90Var != null ? i90Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
