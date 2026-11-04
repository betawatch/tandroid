package w3;

import e3.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(int i3, boolean z10, byte[] bArr) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~d[i3 - 1];
        }
        for (int i10 = 1; i10 < i3; i10++) {
            j10 = (j10 << 8) | (bArr[i10] & 255);
        }
        return j10;
    }

    public final long b(p pVar, boolean z10, boolean z11, int i3) {
        int i10;
        int i11 = this.b;
        byte[] bArr = this.a;
        if (i11 == 0) {
            if (!pVar.d(bArr, 0, 1, z10)) {
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
        if (i14 > i3) {
            this.b = 0;
            return -2L;
        }
        if (i14 != 1) {
            pVar.readFully(bArr, 1, i14 - 1);
        }
        this.b = 0;
        return a(this.c, z11, bArr);
    }
}
