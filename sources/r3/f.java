package r3;

import h5.d0;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f implements s {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // r3.s
    public final boolean c() {
        return true;
    }

    @Override // r3.s
    public final r f(long j10) {
        long[] jArr = this.e;
        int e6 = d0.e(jArr, j10, true);
        long j11 = jArr[e6];
        long[] jArr2 = this.c;
        t tVar = new t(j11, jArr2[e6]);
        if (j11 >= j10 || e6 == this.a - 1) {
            return new r(tVar, tVar);
        }
        int i10 = e6 + 1;
        return new r(tVar, new t(jArr[i10], jArr2[i10]));
    }

    @Override // r3.s
    public final long g() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
