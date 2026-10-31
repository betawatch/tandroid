package r5;

import java.util.Set;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c {
    public final long a;
    public final long b;
    public final Set c;

    public c(long j10, long j11, Set set) {
        this.a = j10;
        this.b = j11;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.a == cVar.a && this.b == cVar.b && this.c.equals(cVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.b;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
