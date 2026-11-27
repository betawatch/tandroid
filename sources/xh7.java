// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xh7 implements zy9 {
    public final long a;
    public final yh7[] b;
    public final int c;

    public xh7(long j, yh7[] yh7VarArr, int i) {
        this.a = j;
        this.b = yh7VarArr;
        this.c = i;
    }

    @Override // zy9
    public final boolean c() {
        return true;
    }

    @Override // zy9
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    @Override // zy9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yy9 e(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int b;
        yh7[] yh7VarArr = this.b;
        int length = yh7VarArr.length;
        bz9 bz9Var = bz9.c;
        if (length == 0) {
            return new yy9(bz9Var, bz9Var);
        }
        int i2 = this.c;
        if (i2 != -1) {
            y1c y1cVar = yh7VarArr[i2].b;
            int a = y1cVar.a(j);
            if (a == -1) {
                a = y1cVar.b(j);
            }
            long[] jArr = y1cVar.c;
            long[] jArr2 = y1cVar.f;
            if (a == -1) {
                return new yy9(bz9Var, bz9Var);
            }
            j3 = jArr2[a];
            j2 = jArr[a];
            if (j3 < j && a < y1cVar.b - 1 && (b = y1cVar.b(j)) != -1 && b != a) {
                j5 = jArr2[b];
                j4 = jArr[b];
                long j6 = j2;
                for (i = 0; i < yh7VarArr.length; i++) {
                    if (i != i2) {
                        y1c y1cVar2 = yh7VarArr[i].b;
                        long[] jArr3 = y1cVar2.c;
                        int a2 = y1cVar2.a(j3);
                        if (a2 == -1) {
                            a2 = y1cVar2.b(j3);
                        }
                        if (a2 != -1) {
                            j6 = Math.min(jArr3[a2], j6);
                        }
                        if (j5 != -9223372036854775807L) {
                            int a3 = y1cVar2.a(j5);
                            if (a3 == -1) {
                                a3 = y1cVar2.b(j5);
                            }
                            if (a3 != -1) {
                                j4 = Math.min(jArr3[a3], j4);
                            }
                        }
                    }
                }
                bz9 bz9Var2 = new bz9(j3, j6);
                return j5 != -9223372036854775807L ? new yy9(bz9Var2, bz9Var2) : new yy9(bz9Var2, new bz9(j5, j4));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = -1;
        j5 = -9223372036854775807L;
        long j62 = j2;
        while (i < yh7VarArr.length) {
        }
        bz9 bz9Var22 = new bz9(j3, j62);
        if (j5 != -9223372036854775807L) {
        }
    }

    @Override // zy9
    public final long h() {
        return this.a;
    }
}
