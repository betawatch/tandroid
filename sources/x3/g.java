package x3;

import f3.p;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(int i7, boolean z9, byte[] bArr) {
        long j3 = bArr[0] & 255;
        if (z9) {
            j3 &= ~d[i7 - 1];
        }
        for (int i10 = 1; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }

    public final long b(p pVar, boolean z9, boolean z10, int i7) {
        int i10;
        int i11 = this.b;
        byte[] bArr = this.a;
        if (i11 == 0) {
            if (!pVar.c(bArr, 0, 1, z9)) {
                return -1L;
            }
            int i12 = bArr[0] & 255;
            int i13 = 0;
            while (true) {
                if (i13 >= 8) {
                    i10 = -1;
                    break;
                }
                if ((d[i13] & i12) != 0) {
                    i10 = i13 + 1;
                    break;
                }
                i13++;
            }
            this.c = i10;
            if (i10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i14 = this.c;
        if (i14 > i7) {
            this.b = 0;
            return -2L;
        }
        if (i14 != 1) {
            pVar.readFully(bArr, 1, i14 - 1);
        }
        this.b = 0;
        return a(this.c, z10, bArr);
    }
}
