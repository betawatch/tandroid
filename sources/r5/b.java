package r5;

import java.util.Set;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
