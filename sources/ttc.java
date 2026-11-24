// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ttc implements stc {
    public final u84 a;
    public final yzb b;
    public final tm9 c;
    public final go4 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public ttc(u84 u84Var, yzb yzbVar, tm9 tm9Var, String str, int i) {
        this.a = u84Var;
        this.b = yzbVar;
        this.c = tm9Var;
        int i2 = tm9Var.a;
        int i3 = tm9Var.b;
        int i4 = (tm9Var.d * i2) / 8;
        int i5 = tm9Var.c;
        if (i5 != i4) {
            throw bx7.a("Expected block size: " + i4 + "; got: " + i5, null);
        }
        int i6 = i3 * i4;
        int i7 = i6 << 3;
        int max = Math.max(i4, i6 / 10);
        this.e = max;
        fo4 fo4Var = new fo4();
        fo4Var.r = wf7.n("audio/wav");
        fo4Var.s = wf7.n(str);
        fo4Var.i = i7;
        fo4Var.j = i7;
        fo4Var.t = max;
        fo4Var.M = i2;
        int i8 = tm9Var.e;
        fo4Var.N = i8 == 0 ? -1 : i8 << 2;
        fo4Var.O = i3;
        fo4Var.P = i;
        this.d = new go4(fo4Var);
    }

    @Override // stc
    public final boolean a(vb3 vb3Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int f = this.b.f(vb3Var, (int) Math.min(i2 - i, j2), true);
            if (f == -1) {
                j2 = 0;
            } else {
                this.g += f;
                j2 -= f;
            }
        }
        tm9 tm9Var = this.c;
        int i3 = tm9Var.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = tm9Var.b;
            String str = hac.a;
            long b0 = j3 + hac.b0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(b0, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // stc
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // stc
    public final void c(int i, long j) {
        wtc wtcVar = new wtc(this.c, 1, i, j);
        this.a.f0(wtcVar);
        go4 go4Var = this.d;
        yzb yzbVar = this.b;
        yzbVar.g(go4Var);
        yzbVar.d(wtcVar.e);
    }
}
