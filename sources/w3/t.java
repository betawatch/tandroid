package w3;

import h3.s0;
import h3.t0;
import j3.n0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t implements h {
    public final d5.y a;
    public final n0 b;
    public final String c;
    public m3.w d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public t(String str) {
        d5.y yVar = new d5.y(4);
        this.a = yVar;
        yVar.a[0] = -1;
        this.b = new n0();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // w3.h
    public final void g(d5.y yVar) {
        d5.a.j(this.d);
        while (yVar.a() > 0) {
            int i9 = this.f;
            d5.y yVar2 = this.a;
            if (i9 == 0) {
                byte[] bArr = yVar.a;
                int i10 = yVar.b;
                int i11 = yVar.c;
                while (true) {
                    if (i10 >= i11) {
                        yVar.C(i11);
                        break;
                    }
                    byte b10 = bArr[i10];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.i && (b10 & 224) == 224;
                    this.i = z10;
                    if (z11) {
                        yVar.C(i10 + 1);
                        this.i = false;
                        yVar2.a[1] = bArr[i10];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i9 == 1) {
                int min = Math.min(yVar.a(), 4 - this.g);
                yVar.c(this.g, min, yVar2.a);
                int i12 = this.g + min;
                this.g = i12;
                if (i12 >= 4) {
                    yVar2.C(0);
                    int e10 = yVar2.e();
                    n0 n0Var = this.b;
                    if (n0Var.a(e10)) {
                        this.k = n0Var.b;
                        if (!this.h) {
                            int i13 = n0Var.c;
                            this.j = (n0Var.f * 1000000) / i13;
                            s0 s0Var = new s0();
                            s0Var.a = this.e;
                            s0Var.o = (String) n0Var.g;
                            s0Var.p = 4096;
                            s0Var.B = n0Var.d;
                            s0Var.C = i13;
                            s0Var.c = this.c;
                            this.d.c(new t0(s0Var));
                            this.h = true;
                        }
                        yVar2.C(0);
                        this.d.a(4, yVar2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(yVar.a(), this.k - this.g);
                this.d.a(min2, yVar);
                int i14 = this.g + min2;
                this.g = i14;
                int i15 = this.k;
                if (i14 >= i15) {
                    long j10 = this.l;
                    if (j10 != -9223372036854775807L) {
                        this.d.e(j10, 1, i15, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // w3.h
    public final void h() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // w3.h
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.e = d0Var.e;
        d0Var.b();
        this.d = mVar.I(d0Var.d, 1);
    }

    @Override // w3.h
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.l = j10;
        }
    }

    @Override // w3.h
    public final void i() {
    }
}
