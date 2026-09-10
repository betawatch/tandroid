package y9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w0 extends y1 {
    public final x1 a;
    public final String b;
    public final String c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.a = x0Var;
        this.b = str;
        this.c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.a.equals(w0Var.a) && this.b.equals(w0Var.b) && this.c.equals(w0Var.c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j3 = this.d;
        return hashCode ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.a);
        sb2.append(", parameterKey=");
        sb2.append(this.b);
        sb2.append(", parameterValue=");
        sb2.append(this.c);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.d, "}");
    }
}
