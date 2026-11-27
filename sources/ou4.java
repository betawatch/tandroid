// default package

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ou4 extends wl5 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public ou4(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ou4.class != obj.getClass()) {
            return false;
        }
        ou4 ou4Var = (ou4) obj;
        return Objects.equals(this.b, ou4Var.b) && this.c.equals(ou4Var.c) && this.d.equals(ou4Var.d) && Arrays.equals(this.e, ou4Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + bs2.j(bs2.j((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // wl5
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
