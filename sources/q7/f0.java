package q7;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z9;
        if (obj instanceof f0) {
            byte[] bArr = ((e0) this).b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((e0) ((f0) obj)).b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z9 = true;
                    for (int i7 = 0; i7 < bArr.length; i7++) {
                        z9 &= bArr[i7] == bArr2[i7];
                    }
                } else {
                    z9 = false;
                }
                if (z9) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((e0) this).b;
        if (bArr.length * 8 < 32) {
            int i7 = bArr[0] & 255;
            for (int i10 = 1; i10 < bArr.length; i10++) {
                i7 |= (bArr[i10] & 255) << (i10 * 8);
            }
            return i7;
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
