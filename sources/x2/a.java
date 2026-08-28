package x2;

import m1.j;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final long b;

    public a(int i9, long j10) {
        if (i9 == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i9;
        this.b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        int b10 = (j.b(this.a) ^ 1000003) * 1000003;
        long j10 = this.b;
        return b10 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i9 = this.a;
        sb2.append(i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? BuildConfig.BETA_URL : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return aa.d.q(sb2, this.b, "}");
    }
}
