// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ska implements s84 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public byte e;
    public u84 f;
    public yzb g;

    public ska(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // s84
    public final int b(t84 t84Var, u21 u21Var) {
        byte b = this.e;
        if (b != 1) {
            if (b == 2) {
                return -1;
            }
            rjb.h();
            return 0;
        }
        yzb yzbVar = this.g;
        yzbVar.getClass();
        int f = yzbVar.f(t84Var, 1024, true);
        if (f != -1) {
            this.d += f;
            return 0;
        }
        this.e = (byte) 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        int i = this.b;
        int i2 = this.a;
        jte.p((i2 == -1 || i == -1) ? false : true);
        yw7 yw7Var = new yw7(i);
        ((vb3) t84Var).d(yw7Var.a, 0, i, false);
        return yw7Var.H() == i2;
    }

    @Override // s84
    public final void d(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = (byte) 1;
            this.d = 0;
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.f = u84Var;
        yzb c0 = u84Var.c0(1024, 4);
        this.g = c0;
        fo4 fo4Var = new fo4();
        String str = this.c;
        fo4Var.r = wf7.n(str);
        fo4Var.s = wf7.n(str);
        mlb.w(fo4Var, c0);
        this.f.B();
        this.f.f0(new uka());
        this.e = (byte) 1;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
