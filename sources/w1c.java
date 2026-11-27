// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class w1c {
    public final byte a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public w1c(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w1c.class != obj.getClass()) {
            return false;
        }
        w1c w1cVar = (w1c) obj;
        return this.a == w1cVar.a && this.c == w1cVar.c && this.d == w1cVar.d && Arrays.equals(this.b, w1cVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
