// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qh7 implements ix9 {
    public final long a;
    public final rh7[] b;
    public final int c;

    public qh7(long j, rh7[] rh7VarArr, int i) {
        this.a = j;
        this.b = rh7VarArr;
        this.c = i;
    }

    @Override // ix9
    public final boolean c() {
        return true;
    }

    @Override // ix9
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    @Override // ix9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hx9 f(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int b;
        rh7[] rh7VarArr = this.b;
        int length = rh7VarArr.length;
        kx9 kx9Var = kx9.c;
        if (length == 0) {
            return new hx9(kx9Var, kx9Var);
        }
        int i2 = this.c;
        if (i2 != -1) {
            zzb zzbVar = rh7VarArr[i2].b;
            int a = zzbVar.a(j);
            if (a == -1) {
                a = zzbVar.b(j);
            }
            long[] jArr = zzbVar.c;
            long[] jArr2 = zzbVar.f;
            if (a == -1) {
                return new hx9(kx9Var, kx9Var);
            }
            j3 = jArr2[a];
            j2 = jArr[a];
            if (j3 < j && a < zzbVar.b - 1 && (b = zzbVar.b(j)) != -1 && b != a) {
                j5 = jArr2[b];
                j4 = jArr[b];
                long j6 = j2;
                for (i = 0; i < rh7VarArr.length; i++) {
                    if (i != i2) {
                        zzb zzbVar2 = rh7VarArr[i].b;
                        long[] jArr3 = zzbVar2.c;
                        int a2 = zzbVar2.a(j3);
                        if (a2 == -1) {
                            a2 = zzbVar2.b(j3);
                        }
                        if (a2 != -1) {
                            j6 = Math.min(jArr3[a2], j6);
                        }
                        if (j5 != -9223372036854775807L) {
                            int a3 = zzbVar2.a(j5);
                            if (a3 == -1) {
                                a3 = zzbVar2.b(j5);
                            }
                            if (a3 != -1) {
                                j4 = Math.min(jArr3[a3], j4);
                            }
                        }
                    }
                }
                kx9 kx9Var2 = new kx9(j3, j6);
                return j5 != -9223372036854775807L ? new hx9(kx9Var2, kx9Var2) : new hx9(kx9Var2, new kx9(j5, j4));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = -1;
        j5 = -9223372036854775807L;
        long j62 = j2;
        while (i < rh7VarArr.length) {
        }
        kx9 kx9Var22 = new kx9(j3, j62);
        if (j5 != -9223372036854775807L) {
        }
    }

    @Override // ix9
    public final long h() {
        return this.a;
    }
}
