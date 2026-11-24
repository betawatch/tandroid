// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rrc implements qrc {
    public final l74 a;
    public final wxb b;
    public final sk9 c;
    public final fm4 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public rrc(l74 l74Var, wxb wxbVar, sk9 sk9Var, String str, int i) {
        this.a = l74Var;
        this.b = wxbVar;
        this.c = sk9Var;
        int i2 = sk9Var.a;
        int i3 = sk9Var.b;
        int i4 = (sk9Var.d * i2) / 8;
        int i5 = sk9Var.c;
        if (i5 != i4) {
            throw av7.a("Expected block size: " + i4 + "; got: " + i5, null);
        }
        int i6 = i3 * i4;
        int i7 = i6 << 3;
        int max = Math.max(i4, i6 / 10);
        this.e = max;
        em4 em4Var = new em4();
        em4Var.r = ud7.n("audio/wav");
        em4Var.s = ud7.n(str);
        em4Var.i = i7;
        em4Var.j = i7;
        em4Var.t = max;
        em4Var.M = i2;
        int i8 = sk9Var.e;
        em4Var.N = i8 == 0 ? -1 : i8 << 2;
        em4Var.O = i3;
        em4Var.P = i;
        this.d = new fm4(em4Var);
    }

    @Override // qrc
    public final boolean a(ja3 ja3Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int f = this.b.f(ja3Var, (int) Math.min(i2 - i, j2), true);
            if (f == -1) {
                j2 = 0;
            } else {
                this.g += f;
                j2 -= f;
            }
        }
        sk9 sk9Var = this.c;
        int i3 = sk9Var.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = sk9Var.b;
            String str = g8c.a;
            long b0 = j3 + g8c.b0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(b0, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // qrc
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // qrc
    public final void c(int i, long j) {
        urc urcVar = new urc(this.c, 1, i, j);
        this.a.g0(urcVar);
        fm4 fm4Var = this.d;
        wxb wxbVar = this.b;
        wxbVar.g(fm4Var);
        wxbVar.d(urcVar.e);
    }
}
