package v5;

import a8.p0;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a {
    public static final a f = new a(qs.e3, 10485760, 604800000, 10000, 81920);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public a(int i7, long j3, long j10, int i10, int i11) {
        this.a = j3;
        this.b = i7;
        this.c = i10;
        this.d = j10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        int i7 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j10 = this.d;
        return ((i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.n(this.e, "}", sb2);
    }
}
