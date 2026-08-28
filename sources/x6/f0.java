package x6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof f0) {
            byte[] bArr = ((e0) this).b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((e0) ((f0) obj)).b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z10 = true;
                    for (int i9 = 0; i9 < bArr.length; i9++) {
                        z10 &= bArr[i9] == bArr2[i9];
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((e0) this).b;
        if (bArr.length * 8 < 32) {
            int i9 = bArr[0] & 255;
            for (int i10 = 1; i10 < bArr.length; i10++) {
                i9 |= (bArr[i10] & 255) << (i10 * 8);
            }
            return i9;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(a.c("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public final String toString() {
        byte[] bArr = ((e0) this).b;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
