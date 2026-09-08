package qa;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final long b;
    public final long c;

    public a(long j3, long j10, String str) {
        this.a = str;
        this.b = j3;
        this.c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j3 = this.b;
        long j10 = this.c;
        return ((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.c, "}");
    }
}
