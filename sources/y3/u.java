package y3;

import b8.zb;
import g2.n0;
import k2.p1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u {
    public final r a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final int[] h;
    public final long i;
    public final boolean j;

    public u(r rVar, long[] jArr, int[] iArr, int i3, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j10, int i10) {
        zb.f(iArr.length == jArr2.length);
        zb.f(jArr.length == jArr2.length);
        zb.f(iArr2.length == jArr2.length);
        this.a = rVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i3;
        this.f = jArr2;
        this.g = iArr2;
        this.h = iArr3;
        this.j = z10;
        this.i = j10;
        this.b = i10;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | TLObject.FLAG_29;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i3 = 0;
        if (this.j) {
            return n0.f(jArr, j10, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i3 <= length) {
            int e10 = p1.e(length, i3, 2, i3);
            if (jArr[iArr[e10]] <= j10) {
                i3 = e10 + 1;
                i10 = e10;
            } else {
                length = e10 - 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i10]];
        if (j11 == j10) {
            while (i10 > 0 && jArr[iArr[i10 - 1]] == j11) {
                i10--;
            }
        }
        return iArr[i10];
    }

    public final int b(long j10) {
        long[] jArr = this.f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.j) {
            return n0.b(jArr, j10, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i3 = 0;
        int i10 = -1;
        while (i3 <= length) {
            int e10 = p1.e(length, i3, 2, i3);
            if (jArr[iArr[e10]] >= j10) {
                length = e10 - 1;
                i10 = e10;
            } else {
                i3 = e10 + 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i10]];
        if (j11 == j10) {
            while (i10 < iArr.length - 1) {
                int i11 = i10 + 1;
                if (jArr[iArr[i11]] != j11) {
                    break;
                }
                i10 = i11;
            }
        }
        return iArr[i10];
    }
}
