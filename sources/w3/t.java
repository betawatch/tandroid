package w3;

import e2.m0;
import org.telegram.tgnet.TLObject;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class t {
    public final q a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final int[] h;
    public final long i;
    public final boolean j;

    public t(q qVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j10, int i11) {
        u6.g(iArr.length == jArr2.length);
        u6.g(jArr.length == jArr2.length);
        u6.g(iArr2.length == jArr2.length);
        this.a = qVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i10;
        this.f = jArr2;
        this.g = iArr2;
        this.h = iArr3;
        this.j = z10;
        this.i = j10;
        this.b = i11;
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
        int i10 = 0;
        if (this.j) {
            return m0.f(jArr, j10, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int C = i2.d.C(length, i10, 2, i10);
            if (jArr[iArr[C]] <= j10) {
                i10 = C + 1;
                i11 = C;
            } else {
                length = C - 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 > 0 && jArr[iArr[i11 - 1]] == j11) {
                i11--;
            }
        }
        return iArr[i11];
    }

    public final int b(long j10) {
        long[] jArr = this.f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.j) {
            return m0.b(jArr, j10, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = 0;
        int i11 = -1;
        while (i10 <= length) {
            int C = i2.d.C(length, i10, 2, i10);
            if (jArr[iArr[C]] >= j10) {
                length = C - 1;
                i11 = C;
            } else {
                i10 = C + 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 < iArr.length - 1) {
                int i12 = i11 + 1;
                if (jArr[iArr[i12]] != j11) {
                    break;
                }
                i11 = i12;
            }
        }
        return iArr[i11];
    }
}
