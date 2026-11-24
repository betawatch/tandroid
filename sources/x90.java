// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x90 extends d03 {
    public final String a;
    public final String b;
    public final long c;

    public x90(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d03) {
            x90 x90Var = (x90) ((d03) obj);
            if (this.a.equals(x90Var.a) && this.b.equals(x90Var.b) && this.c == x90Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return kt6.q(sb, this.c, "}");
    }
}
