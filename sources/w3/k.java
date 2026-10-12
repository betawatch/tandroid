package w3;

import c3.a0;
import c3.b0;
import c3.c0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class k implements b0 {
    public final long a;
    public final l[] b;
    public final int c;

    public k(long j10, l[] lVarArr, int i10) {
        this.a = j10;
        this.b = lVarArr;
        this.c = i10;
    }

    @Override // c3.b0
    public final boolean d() {
        return true;
    }

    @Override // c3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.b0
    public final a0 f(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        int b10;
        long j16 = j10;
        l[] lVarArr = this.b;
        int length = lVarArr.length;
        c0 c0Var = c0.c;
        if (length == 0) {
            return new a0(c0Var, c0Var);
        }
        int i10 = this.c;
        int i11 = -1;
        if (i10 != -1) {
            u uVar = lVarArr[i10].b;
            int a2 = uVar.a(j16);
            if (a2 == -1) {
                a2 = uVar.b(j16);
            }
            long[] jArr = uVar.c;
            long[] jArr2 = uVar.f;
            if (a2 == -1) {
                return new a0(c0Var, c0Var);
            }
            long j17 = jArr2[a2];
            j11 = jArr[a2];
            if (j17 >= j16 || a2 >= uVar.b - 1 || (b10 = uVar.b(j16)) == -1 || b10 == a2) {
                j15 = -1;
                j13 = -9223372036854775807L;
            } else {
                j13 = jArr2[b10];
                j15 = jArr[b10];
            }
            j12 = j15;
            j16 = j17;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i12 = 0;
        long j18 = j11;
        while (i12 < lVarArr.length) {
            if (i12 != i10) {
                u uVar2 = lVarArr[i12].b;
                long[] jArr3 = uVar2.c;
                int a10 = uVar2.a(j16);
                if (a10 == i11) {
                    a10 = uVar2.b(j16);
                }
                if (a10 == i11) {
                    j14 = j13;
                } else {
                    j14 = j13;
                    j18 = Math.min(jArr3[a10], j18);
                }
                if (j14 != -9223372036854775807L) {
                    long j19 = j14;
                    int a11 = uVar2.a(j19);
                    if (a11 == -1) {
                        a11 = uVar2.b(j19);
                    }
                    if (a11 == -1) {
                        j14 = j19;
                    } else {
                        j14 = j19;
                        j12 = Math.min(jArr3[a11], j12);
                    }
                }
            } else {
                j14 = j13;
            }
            i12++;
            j13 = j14;
            i11 = -1;
        }
        long j20 = j13;
        c0 c0Var2 = new c0(j16, j18);
        return j20 == -9223372036854775807L ? new a0(c0Var2, c0Var2) : new a0(c0Var2, new c0(j20, j12));
    }

    @Override // c3.b0
    public final long h() {
        return this.a;
    }
}
