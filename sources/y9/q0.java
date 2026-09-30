package y9;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class q0 extends p1 {
    public final String a;
    public final String b;
    public final long c;

    public q0(long j3, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.a.equals(q0Var.a) && this.b.equals(q0Var.b) && this.c == q0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j3 = this.c;
        return hashCode ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.a);
        sb2.append(", code=");
        sb2.append(this.b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.c, "}");
    }
}
