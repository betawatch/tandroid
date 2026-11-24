// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ppb {
    public static final opb Companion = new opb();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ ppb(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            dte.a(i, 1, npb.a.d());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppb) && this.a == ((ppb) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public ppb(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
