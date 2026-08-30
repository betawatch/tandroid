package z2;

import m1.j;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final long b;

    public a(int i10, long j10) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i10;
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
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i10 = this.a;
        sb.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.BETA_URL : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return android.support.v4.media.a.q(sb, this.b, "}");
    }
}
