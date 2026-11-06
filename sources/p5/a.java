package p5;

import a8.p0;
import p1.g;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final long b;

    public a(int i7, long j3) {
        if (i7 == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i7;
        this.b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        int c10 = (g.c(this.a) ^ 1000003) * 1000003;
        long j3 = this.b;
        return c10 ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i7 = this.a;
        sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return p0.r(sb2, this.b, "}");
    }
}
