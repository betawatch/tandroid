package r3;

import h5.d0;
import q5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class n implements s {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ n(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // r3.s
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // r3.s
    public final r f(long j10) {
        switch (this.a) {
            case 0:
                o oVar = (o) this.c;
                h5.a.j(oVar.k);
                c0 c0Var = oVar.k;
                long[] jArr = (long[]) c0Var.c;
                long[] jArr2 = (long[]) c0Var.b;
                int e6 = d0.e(jArr, d0.i((oVar.e * j10) / 1000000, 0L, oVar.j - 1), false);
                long j11 = e6 == -1 ? 0L : jArr[e6];
                long j12 = e6 != -1 ? jArr2[e6] : 0L;
                int i10 = oVar.e;
                long j13 = (j11 * 1000000) / i10;
                long j14 = this.b;
                t tVar = new t(j13, j12 + j14);
                if (j13 == j10 || e6 == jArr.length - 1) {
                    return new r(tVar, tVar);
                }
                int i11 = e6 + 1;
                return new r(tVar, new t((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
            case 1:
                return (r) this.c;
            default:
                t3.b bVar = (t3.b) this.c;
                r b10 = bVar.g[0].b(j10);
                int i12 = 1;
                while (true) {
                    t3.e[] eVarArr = bVar.g;
                    if (i12 >= eVarArr.length) {
                        return b10;
                    }
                    r b11 = eVarArr[i12].b(j10);
                    if (b11.a.b < b10.a.b) {
                        b10 = b11;
                    }
                    i12++;
                }
        }
    }

    @Override // r3.s
    public final long g() {
        switch (this.a) {
        }
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(long j10) {
        this(j10, 0L);
        this.a = 1;
    }

    public n(long j10, long j11) {
        this.a = 1;
        this.b = j10;
        t tVar = j11 == 0 ? t.c : new t(0L, j11);
        this.c = new r(tVar, tVar);
    }
}
