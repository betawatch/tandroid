package y2;

import a4.w;
import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public static v5.c a() {
        v5.c cVar = new v5.c(4);
        cVar.d = v2.d.a;
        return cVar;
    }

    public final i b(v2.d dVar) {
        v5.c a2 = a();
        a2.h(this.a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a2.d = dVar;
        a2.b = this.b;
        return a2.d();
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
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.c);
        sb2.append(", ");
        return w.q(sb2, encodeToString, ")");
    }
}
