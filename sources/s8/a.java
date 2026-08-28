package s8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final long b;
    public final long c;

    public a(long j10, long j11, long j12) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.a;
        long j11 = this.b;
        int i9 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ i9;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.b);
        sb2.append(", uptimeMillis=");
        return aa.d.q(sb2, this.c, "}");
    }
}
