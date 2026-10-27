package ua;

import a8.ng;
import m1.j;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final long b;
    public final int c;

    public b(String str, long j10, int i10) {
        this.a = str;
        this.b = j10;
        this.c = i10;
    }

    public static ng a() {
        ng ngVar = new ng((char) 0, 24);
        ngVar.d = 0L;
        return ngVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = bVar.c;
        String str = bVar.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.b != bVar.b) {
            return false;
        }
        int i11 = this.c;
        return i11 == 0 ? i10 == 0 : j.b(i11, i10);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i11 = this.c;
        return (i11 != 0 ? j.c(i11) : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.b);
        sb2.append(", responseCode=");
        int i10 = this.c;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? BuildConfig.BETA_URL : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
