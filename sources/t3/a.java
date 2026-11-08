package t3;

import e2.n0;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a extends i {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i7;
        this.e = bArr;
    }

    @Override // t3.i, e2.p0
    public final void b(n0 n0Var) {
        n0Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && Objects.equals(this.b, aVar.b) && Objects.equals(this.c, aVar.c) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (527 + this.d) * 31;
        String str = this.b;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // t3.i
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
