// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xzb {
    public final byte a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public xzb(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xzb.class != obj.getClass()) {
            return false;
        }
        xzb xzbVar = (xzb) obj;
        return this.a == xzbVar.a && this.c == xzbVar.c && this.d == xzbVar.d && Arrays.equals(this.b, xzbVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
