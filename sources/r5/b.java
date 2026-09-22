package r5;

import java.util.Set;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class b {
    public final long a;
    public final long b;
    public final Set c;

    public b(long j3, long j10, Set set) {
        this.a = j3;
        this.b = j10;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c.equals(bVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        int i10 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.b;
        return this.c.hashCode() ^ ((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
