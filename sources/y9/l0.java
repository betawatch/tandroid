package y9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l0 extends a2 {
    public final long a;
    public final String b;
    public final u1 c;
    public final v1 d;
    public final w1 e;
    public final z1 f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.a = j3;
        this.b = str;
        this.c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
        nVar.a = Long.valueOf(this.a);
        nVar.b = this.b;
        nVar.c = this.c;
        nVar.d = this.d;
        nVar.e = this.e;
        nVar.f = this.f;
        return nVar;
    }

    public final boolean equals(Object obj) {
        w1 w1Var;
        z1 z1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            l0 l0Var = (l0) ((a2) obj);
            z1 z1Var2 = l0Var.f;
            w1 w1Var2 = l0Var.e;
            if (this.a == l0Var.a && this.b.equals(l0Var.b) && this.c.equals(l0Var.c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        int hashCode = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        w1 w1Var = this.e;
        int hashCode2 = (hashCode ^ (w1Var == null ? 0 : w1Var.hashCode())) * 1000003;
        z1 z1Var = this.f;
        return hashCode2 ^ (z1Var != null ? z1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
