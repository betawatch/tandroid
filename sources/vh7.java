// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vh7 implements rv3 {
    public final yw7 a;
    public final wh7 b;
    public final String c;
    public final int d;
    public final String e;
    public yzb f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public vh7(String str, int i, String str2) {
        yw7 yw7Var = new yw7(4);
        this.a = yw7Var;
        yw7Var.a[0] = -1;
        this.b = new wh7();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // rv3
    public final void b(yw7 yw7Var) {
        this.f.getClass();
        while (yw7Var.a() > 0) {
            byte b = this.h;
            yw7 yw7Var2 = this.a;
            if (b == 0) {
                byte[] bArr = yw7Var.a;
                int i = yw7Var.b;
                int i2 = yw7Var.c;
                while (true) {
                    if (i >= i2) {
                        yw7Var.N(i2);
                        break;
                    }
                    byte b2 = bArr[i];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.k && (b2 & 224) == 224;
                    this.k = z;
                    if (z2) {
                        yw7Var.N(i + 1);
                        this.k = false;
                        yw7Var2.a[1] = bArr[i];
                        this.i = 2;
                        this.h = (byte) 1;
                        break;
                    }
                    i++;
                }
            } else if (b == 1) {
                int min = Math.min(yw7Var.a(), 4 - this.i);
                yw7Var.k(this.i, min, yw7Var2.a);
                int i3 = this.i + min;
                this.i = i3;
                if (i3 >= 4) {
                    yw7Var2.N(0);
                    int m = yw7Var2.m();
                    wh7 wh7Var = this.b;
                    if (wh7Var.a(m)) {
                        this.m = wh7Var.c;
                        if (!this.j) {
                            this.l = (wh7Var.g * 1000000) / wh7Var.d;
                            fo4 fo4Var = new fo4();
                            fo4Var.a = this.g;
                            fo4Var.r = wf7.n(this.e);
                            fo4Var.s = wf7.n(wh7Var.b);
                            fo4Var.t = TLObject.FLAG_12;
                            fo4Var.M = wh7Var.e;
                            fo4Var.O = wh7Var.d;
                            fo4Var.d = this.c;
                            fo4Var.f = this.d;
                            this.f.g(new go4(fo4Var));
                            this.j = true;
                        }
                        yw7Var2.N(0);
                        this.f.e(4, yw7Var2);
                        this.h = (byte) 2;
                    } else {
                        this.i = 0;
                        this.h = (byte) 1;
                    }
                }
            } else {
                if (b != 2) {
                    rjb.h();
                    return;
                }
                int min2 = Math.min(yw7Var.a(), this.m - this.i);
                this.f.e(min2, yw7Var);
                int i4 = this.i + min2;
                this.i = i4;
                if (i4 >= this.m) {
                    jte.p(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = (byte) 0;
                }
            }
        }
    }

    @Override // rv3
    public final void d() {
        this.h = (byte) 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // rv3
    public final void g(int i, long j) {
        this.n = j;
    }

    @Override // rv3
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.g = l4cVar.e;
        l4cVar.b();
        this.f = u84Var.c0(l4cVar.d, 1);
    }

    @Override // rv3
    public final void e() {
    }

    @Override // rv3
    public final void f() {
    }
}
