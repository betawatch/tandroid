package x3;

import r3.l;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(int i10, boolean z4, byte[] bArr) {
        long j10 = bArr[0] & 255;
        if (z4) {
            j10 &= ~d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public final long b(l lVar, boolean z4, boolean z10, int i10) {
        int i11;
        int i12 = this.b;
        byte[] bArr = this.a;
        if (i12 == 0) {
            if (!lVar.c(bArr, 0, 1, z4)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((d[i14] & i13) != 0) {
                    i11 = i14 + 1;
                    break;
                }
                i14++;
            }
            this.c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i15 = this.c;
        if (i15 > i10) {
            this.b = 0;
            return -2L;
        }
        if (i15 != 1) {
            lVar.readFully(bArr, 1, i15 - 1);
        }
        this.b = 0;
        return a(this.c, z10, bArr);
    }
}
