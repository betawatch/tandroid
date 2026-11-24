// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uh7 implements lf7 {
    public final long a;
    public final long b;
    public final long c;

    public uh7(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
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
        if (!(obj instanceof uh7)) {
            return false;
        }
        uh7 uh7Var = (uh7) obj;
        return this.a == uh7Var.a && this.b == uh7Var.b && this.c == uh7Var.c;
    }

    public final int hashCode() {
        return cqe.b(this.c) + ((cqe.b(this.b) + ((cqe.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}
