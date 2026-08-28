package w3;

import h3.s0;
import h3.t0;
import h3.t1;
import java.util.Collections;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s implements h {
    public final String a;
    public final d5.y b;
    public final d5.x c;
    public m3.w d;
    public String e;
    public t0 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public s(String str) {
        this.a = str;
        d5.y yVar = new d5.y(1024);
        this.b = yVar;
        byte[] bArr = yVar.a;
        this.c = new d5.x(bArr, bArr.length);
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0191, code lost:
    
        if (r23.l == false) goto L88;
     */
    @Override // w3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(d5.y yVar) {
        int i9;
        boolean h;
        d5.a.j(this.d);
        while (yVar.a() > 0) {
            int i10 = this.g;
            if (i10 != 0) {
                if (i10 != 1) {
                    d5.y yVar2 = this.b;
                    d5.x xVar = this.c;
                    if (i10 == 2) {
                        int r10 = ((this.j & (-225)) << 8) | yVar.r();
                        this.i = r10;
                        if (r10 > yVar2.a.length) {
                            yVar2.z(r10);
                            byte[] bArr = yVar2.a;
                            xVar.getClass();
                            xVar.n(bArr.length, bArr);
                        }
                        this.h = 0;
                        this.g = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(yVar.a(), this.i - this.h);
                        yVar.c(this.h, min, xVar.b);
                        int i11 = this.h + min;
                        this.h = i11;
                        if (i11 == this.i) {
                            xVar.p(0);
                            if (!xVar.h()) {
                                this.l = true;
                                int i12 = xVar.i(1);
                                int i13 = i12 == 1 ? xVar.i(1) : 0;
                                this.m = i13;
                                if (i13 != 0) {
                                    throw t1.a(null, null);
                                }
                                if (i12 == 1) {
                                    xVar.i((xVar.i(2) + 1) * 8);
                                }
                                if (!xVar.h()) {
                                    throw t1.a(null, null);
                                }
                                this.n = xVar.i(6);
                                int i14 = xVar.i(4);
                                int i15 = xVar.i(3);
                                if (i14 != 0 || i15 != 0) {
                                    throw t1.a(null, null);
                                }
                                if (i12 == 0) {
                                    int g10 = xVar.g();
                                    int b10 = xVar.b();
                                    j3.a h10 = j3.b.h(xVar, true);
                                    this.u = h10.c;
                                    this.r = h10.a;
                                    this.t = h10.b;
                                    int b11 = b10 - xVar.b();
                                    xVar.p(g10);
                                    byte[] bArr2 = new byte[(b11 + 7) / 8];
                                    xVar.j(b11, bArr2);
                                    s0 s0Var = new s0();
                                    s0Var.a = this.e;
                                    s0Var.o = MediaController.AUDIO_MIME_TYPE;
                                    s0Var.h = this.u;
                                    s0Var.B = this.t;
                                    s0Var.C = this.r;
                                    s0Var.q = Collections.singletonList(bArr2);
                                    s0Var.c = this.a;
                                    t0 t0Var = new t0(s0Var);
                                    if (!t0Var.equals(this.f)) {
                                        this.f = t0Var;
                                        this.s = 1024000000 / t0Var.P;
                                        this.d.c(t0Var);
                                    }
                                } else {
                                    int b12 = xVar.b();
                                    j3.a h11 = j3.b.h(xVar, true);
                                    this.u = h11.c;
                                    this.r = h11.a;
                                    this.t = h11.b;
                                    xVar.s(xVar.i((xVar.i(2) + 1) * 8) - (b12 - xVar.b()));
                                }
                                int i16 = xVar.i(3);
                                this.o = i16;
                                if (i16 == 0) {
                                    xVar.s(8);
                                } else if (i16 == 1) {
                                    xVar.s(9);
                                } else if (i16 == 3 || i16 == 4 || i16 == 5) {
                                    xVar.s(6);
                                } else {
                                    if (i16 != 6 && i16 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    xVar.s(1);
                                }
                                boolean h12 = xVar.h();
                                this.p = h12;
                                this.q = 0L;
                                if (h12) {
                                    if (i12 == 1) {
                                        this.q = xVar.i((xVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h = xVar.h();
                                            this.q = (this.q << 8) + xVar.i(8);
                                        } while (h);
                                    }
                                }
                                if (xVar.h()) {
                                    xVar.s(8);
                                }
                            }
                            if (this.m != 0) {
                                throw t1.a(null, null);
                            }
                            if (this.n != 0) {
                                throw t1.a(null, null);
                            }
                            if (this.o != 0) {
                                throw t1.a(null, null);
                            }
                            int i17 = 0;
                            do {
                                i9 = xVar.i(8);
                                i17 += i9;
                            } while (i9 == 255);
                            int g11 = xVar.g();
                            if ((g11 & 7) == 0) {
                                yVar2.C(g11 >> 3);
                            } else {
                                xVar.j(i17 * 8, yVar2.a);
                                yVar2.C(0);
                            }
                            this.d.a(i17, yVar2);
                            long j10 = this.k;
                            if (j10 != -9223372036854775807L) {
                                this.d.e(j10, 1, i17, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                xVar.s((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int r11 = yVar.r();
                    if ((r11 & 224) == 224) {
                        this.j = r11;
                        this.g = 2;
                    } else if (r11 != 86) {
                        this.g = 0;
                    }
                }
            } else if (yVar.r() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // w3.h
    public final void h() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // w3.h
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.d = mVar.I(d0Var.d, 1);
        d0Var.b();
        this.e = d0Var.e;
    }

    @Override // w3.h
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.k = j10;
        }
    }

    @Override // w3.h
    public final void i() {
    }
}
