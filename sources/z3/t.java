package z3;

import a8.ia;
import h2.m0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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

    public t(q qVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, int[] iArr3, boolean z9, long j3, int i10) {
        ia.f(iArr.length == jArr2.length);
        ia.f(jArr.length == jArr2.length);
        ia.f(iArr2.length == jArr2.length);
        this.a = qVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i7;
        this.f = jArr2;
        this.g = iArr2;
        this.h = iArr3;
        this.j = z9;
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
            return m0.f(jArr, j3, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i7 <= length) {
            int D = jg.g.D(length, i7, 2, i7);
            if (jArr[iArr[D]] <= j3) {
                i7 = D + 1;
                i10 = D;
            } else {
                length = D - 1;
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
            return m0.b(jArr, j3, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i7 = 0;
        int i10 = -1;
        while (i7 <= length) {
            int D = jg.g.D(length, i7, 2, i7);
            if (jArr[iArr[D]] >= j3) {
                length = D - 1;
                i10 = D;
            } else {
                i7 = D + 1;
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
