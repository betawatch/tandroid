package y2;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final byte[] b;
    public final v2.d c;

    public i(String str, byte[] bArr, v2.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public static s5.m a() {
        s5.m mVar = new s5.m();
        mVar.d = v2.d.a;
        return mVar;
    }

    public final i b(v2.d dVar) {
        s5.m a2 = a();
        a2.n(this.a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a2.d = dVar;
        a2.c = this.b;
        return a2.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.a.equals(iVar.a) && Arrays.equals(this.b, iVar.b) && this.c.equals(iVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return android.support.v4.media.a.r(sb, encodeToString, ")");
    }
}
