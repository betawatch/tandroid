// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ym8 extends wl5 {
    public final String b;
    public final byte[] c;

    public ym8(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ym8.class != obj.getClass()) {
            return false;
        }
        ym8 ym8Var = (ym8) obj;
        return this.b.equals(ym8Var.b) && Arrays.equals(this.c, ym8Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + bs2.j(527, 31, this.b);
    }

    @Override // wl5
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
