// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vxb {
    public final byte a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public vxb(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vxb.class != obj.getClass()) {
            return false;
        }
        vxb vxbVar = (vxb) obj;
        return this.a == vxbVar.a && this.c == vxbVar.c && this.d == vxbVar.d && Arrays.equals(this.b, vxbVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
