package w2;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public static u2.b a() {
        u2.b bVar = new u2.b(4);
        bVar.d = t2.d.a;
        return bVar;
    }

    public final i b(t2.d dVar) {
        u2.b a2 = a();
        a2.h(this.a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a2.d = dVar;
        a2.c = this.b;
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
        return a9.p.p(sb2, encodeToString, ")");
    }
}
