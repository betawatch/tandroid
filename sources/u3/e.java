package u3;

import c3.p;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(int i10, boolean z10, byte[] bArr) {
        long j3 = bArr[0] & 255;
        if (z10) {
            j3 &= ~d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }

    public final long b(p pVar, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = this.b;
        byte[] bArr = this.a;
        if (i12 == 0) {
            if (!pVar.d(bArr, 0, 1, z10)) {
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
            pVar.readFully(bArr, 1, i15 - 1);
        }
        this.b = 0;
        return a(this.c, z11, bArr);
    }
}
