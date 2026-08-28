package w2;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final byte[] b;
    public final t2.d c;

    public i(String str, byte[] bArr, t2.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public static t5.c a() {
        t5.c cVar = new t5.c(4);
        cVar.d = t2.d.a;
        return cVar;
    }

    public final i b(t2.d dVar) {
        t5.c a2 = a();
        a2.h(this.a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a2.d = dVar;
        a2.b = this.b;
        return a2.b();
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
        return aa.d.r(sb2, encodeToString, ")");
    }
}
