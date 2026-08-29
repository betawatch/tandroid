package y3;

import j3.s0;
import j3.t0;
import l3.p0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t implements h {
    public final f5.w a;
    public final p0 b;
    public final String c;
    public o3.w d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public t(String str) {
        f5.w wVar = new f5.w(4);
        this.a = wVar;
        wVar.a[0] = -1;
        this.b = new p0();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // y3.h
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // y3.h
    public final void c(f5.w wVar) {
        f5.a.j(this.d);
        while (wVar.a() > 0) {
            int i10 = this.f;
            f5.w wVar2 = this.a;
            if (i10 == 0) {
                byte[] bArr = wVar.a;
                int i11 = wVar.b;
                int i12 = wVar.c;
                while (true) {
                    if (i11 >= i12) {
                        wVar.C(i12);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.i && (b10 & 224) == 224;
                    this.i = z10;
                    if (z11) {
                        wVar.C(i11 + 1);
                        this.i = false;
                        wVar2.a[1] = bArr[i11];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int min = Math.min(wVar.a(), 4 - this.g);
                wVar.c(this.g, min, wVar2.a);
                int i13 = this.g + min;
                this.g = i13;
                if (i13 >= 4) {
                    wVar2.C(0);
                    int e10 = wVar2.e();
                    p0 p0Var = this.b;
                    if (p0Var.a(e10)) {
                        this.k = p0Var.b;
                        if (!this.h) {
                            int i14 = p0Var.c;
                            this.j = (p0Var.f * 1000000) / i14;
                            s0 s0Var = new s0();
                            s0Var.a = this.e;
                            s0Var.o = (String) p0Var.g;
                            s0Var.p = 4096;
                            s0Var.B = p0Var.d;
                            s0Var.C = i14;
                            s0Var.c = this.c;
                            this.d.b(new t0(s0Var));
                            this.h = true;
                        }
                        wVar2.C(0);
                        this.d.e(4, wVar2);
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
                int min2 = Math.min(wVar.a(), this.k - this.g);
                this.d.e(min2, wVar);
                int i15 = this.g + min2;
                this.g = i15;
                int i16 = this.k;
                if (i15 >= i16) {
                    long j10 = this.l;
                    if (j10 != -9223372036854775807L) {
                        this.d.c(j10, 1, i16, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // y3.h
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.e = d0Var.e;
        d0Var.b();
        this.d = mVar.Z1(d0Var.d, 1);
    }

    @Override // y3.h
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.l = j10;
        }
    }

    @Override // y3.h
    public final void d() {
    }
}
