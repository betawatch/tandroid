package z3;

import a8.ja;
import h2.l0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    public t(q qVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j3, int i10) {
        ja.f(iArr.length == jArr2.length);
        ja.f(jArr.length == jArr2.length);
        ja.f(iArr2.length == jArr2.length);
        this.a = qVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i7;
        this.f = jArr2;
        this.g = iArr2;
        this.h = iArr3;
        this.j = z10;
        this.i = j3;
        this.b = i10;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | TLObject.FLAG_29;
        }
    }

    public final int a(long j3) {
        long[] jArr = this.f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i7 = 0;
        if (this.j) {
            return l0.f(jArr, j3, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i7 <= length) {
            int e10 = i5.c.e(length, i7, 2, i7);
            if (jArr[iArr[e10]] <= j3) {
                i7 = e10 + 1;
                i10 = e10;
            } else {
                length = e10 - 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j10 = jArr[iArr[i10]];
        if (j10 == j3) {
            while (i10 > 0 && jArr[iArr[i10 - 1]] == j10) {
                i10--;
            }
        }
        return iArr[i10];
    }

    public final int b(long j3) {
        long[] jArr = this.f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.j) {
            return l0.b(jArr, j3, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i7 = 0;
        int i10 = -1;
        while (i7 <= length) {
            int e10 = i5.c.e(length, i7, 2, i7);
            if (jArr[iArr[e10]] >= j3) {
                length = e10 - 1;
                i10 = e10;
            } else {
                i7 = e10 + 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j10 = jArr[iArr[i10]];
        if (j10 == j3) {
            while (i10 < iArr.length - 1) {
                int i11 = i10 + 1;
                if (jArr[iArr[i11]] != j10) {
                    break;
                }
                i10 = i11;
            }
        }
        return iArr[i10];
    }
}
