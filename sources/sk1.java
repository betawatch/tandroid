// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sk1 implements qk1 {
    public final long a;
    public final long b;
    public final boolean c;
    public final sy5 d;

    public sk1(long j, long j2, boolean z, sy5 sy5Var) {
        jte.f(j == -9223372036854775807L || j2 == -9223372036854775807L || j <= j2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = sy5Var;
    }

    @Override // lf7
    public final go4 a() {
        return null;
    }

    @Override // lf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sk1.class != obj.getClass()) {
            return false;
        }
        sk1 sk1Var = (sk1) obj;
        return this.a == sk1Var.a && this.b == sk1Var.b && this.c == sk1Var.c && Objects.equals(this.d, sk1Var.d);
    }

    public final int hashCode() {
        int b = (((cqe.b(this.b) + ((cqe.b(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0)) * 31;
        sy5 sy5Var = this.d;
        return b + (sy5Var != null ? sy5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chapter: startTimeMs=");
        long j = this.a;
        sb.append(j == -9223372036854775807L ? "UNSET" : Long.valueOf(j));
        long j2 = this.b;
        String str = "";
        sb.append(j2 == -9223372036854775807L ? "" : kt6.n(j2, ", endTimeMs="));
        sb.append(this.c ? ", hidden" : "");
        sy5 sy5Var = this.d;
        if (sy5Var != null) {
            str = ", title=" + sy5Var;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}
