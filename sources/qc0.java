// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class qc0 implements zy9 {
    public final /* synthetic */ byte a;
    public final long b;
    public final Object c;

    public qc0(long j, long j2) {
        this.a = (byte) 2;
        this.b = j;
        bz9 bz9Var = j2 == 0 ? bz9.c : new bz9(0L, j2);
        this.c = new yy9(bz9Var, bz9Var);
    }

    @Override // zy9
    public final boolean c() {
        switch (this.a) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // zy9
    public final boolean d() {
        byte b = this.a;
        return false;
    }

    @Override // zy9
    public final yy9 e(long j) {
        long j2;
        long j3;
        byte b = this.a;
        int i = 1;
        Object obj = this.c;
        switch (b) {
            case 0:
                sc0 sc0Var = (sc0) obj;
                yy9 b2 = sc0Var.i[0].b(j);
                while (true) {
                    uh2[] uh2VarArr = sc0Var.i;
                    if (i >= uh2VarArr.length) {
                        return b2;
                    }
                    yy9 b3 = uh2VarArr[i].b(j);
                    if (b3.a.b < b2.a.b) {
                        b2 = b3;
                    }
                    i++;
                }
            case 1:
                gk4 gk4Var = (gk4) obj;
                gk4Var.k.getClass();
                lh2 lh2Var = gk4Var.k;
                long[] jArr = (long[]) lh2Var.b;
                long[] jArr2 = (long[]) lh2Var.c;
                int f = gcc.f(jArr, gcc.j((gk4Var.e * j) / 1000000, 0L, gk4Var.j - 1), false);
                if (f == -1) {
                    j3 = 0;
                    j2 = 0;
                } else {
                    j2 = jArr[f];
                    j3 = jArr2[f];
                }
                int i2 = gk4Var.e;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                bz9 bz9Var = new bz9(j4, j3 + j5);
                if (j4 == j || f == jArr.length - 1) {
                    return new yy9(bz9Var, bz9Var);
                }
                int i3 = f + 1;
                return new yy9(bz9Var, new bz9((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
            default:
                return (yy9) obj;
        }
    }

    @Override // zy9
    public final long h() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((gk4) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qc0(long j) {
        this(j, 0L);
        this.a = (byte) 2;
    }

    public /* synthetic */ qc0(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
