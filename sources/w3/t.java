package w3;

import h3.s0;
import h3.t0;
import j3.o0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t implements h {
    public final d5.z a;
    public final o0 b;
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
        d5.z zVar = new d5.z(4);
        this.a = zVar;
        zVar.a[0] = -1;
        this.b = new o0();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // w3.h
    public final void b(d5.z zVar) {
        d5.a.j(this.d);
        while (zVar.a() > 0) {
            int i10 = this.f;
            d5.z zVar2 = this.a;
            if (i10 == 0) {
                byte[] bArr = zVar.a;
                int i11 = zVar.b;
                int i12 = zVar.c;
                while (true) {
                    if (i11 >= i12) {
                        zVar.C(i12);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.i && (b10 & 224) == 224;
                    this.i = z10;
                    if (z11) {
                        zVar.C(i11 + 1);
                        this.i = false;
                        zVar2.a[1] = bArr[i11];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int min = Math.min(zVar.a(), 4 - this.g);
                zVar.c(this.g, min, zVar2.a);
                int i13 = this.g + min;
                this.g = i13;
                if (i13 >= 4) {
                    zVar2.C(0);
                    int e9 = zVar2.e();
                    o0 o0Var = this.b;
                    if (o0Var.a(e9)) {
                        this.k = o0Var.b;
                        if (!this.h) {
                            int i14 = o0Var.c;
                            this.j = (o0Var.f * 1000000) / i14;
                            s0 s0Var = new s0();
                            s0Var.a = this.e;
                            s0Var.o = (String) o0Var.g;
                            s0Var.p = 4096;
                            s0Var.B = o0Var.d;
                            s0Var.C = i14;
                            s0Var.c = this.c;
                            this.d.c(new t0(s0Var));
                            this.h = true;
                        }
                        zVar2.C(0);
                        this.d.a(4, zVar2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(zVar.a(), this.k - this.g);
                this.d.a(min2, zVar);
                int i15 = this.g + min2;
                this.g = i15;
                int i16 = this.k;
                if (i15 >= i16) {
                    long j10 = this.l;
                    if (j10 != -9223372036854775807L) {
                        this.d.e(j10, 1, i16, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // w3.h
    public final void c() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.e = e0Var.e;
        e0Var.b();
        this.d = mVar.C(e0Var.d, 1);
    }

    @Override // w3.h
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.l = j10;
        }
    }

    @Override // w3.h
    public final void d() {
    }
}
