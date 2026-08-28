package s3;

import m3.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(int i9, boolean z10, byte[] bArr) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~d[i9 - 1];
        }
        for (int i10 = 1; i10 < i9; i10++) {
            j10 = (j10 << 8) | (bArr[i10] & 255);
        }
        return j10;
    }

    public final long b(l lVar, boolean z10, boolean z11, int i9) {
        int i10;
        int i11 = this.b;
        byte[] bArr = this.a;
        if (i11 == 0) {
            if (!lVar.d(bArr, 0, 1, z10)) {
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
        if (i14 > i9) {
            this.b = 0;
            return -2L;
        }
        if (i14 != 1) {
            lVar.readFully(bArr, 1, i14 - 1);
        }
        this.b = 0;
        return a(this.c, z11, bArr);
    }
}
