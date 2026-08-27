package w3;

import h3.s0;
import h3.t0;
import h3.t1;
import java.util.Collections;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s implements h {
    public final String a;
    public final d5.z b;
    public final d5.y c;
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
        d5.z zVar = new d5.z(1024);
        this.b = zVar;
        byte[] bArr = zVar.a;
        this.c = new d5.y(bArr, bArr.length);
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0191, code lost:
    
        if (r23.l == false) goto L88;
     */
    @Override // w3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d5.z zVar) {
        int i10;
        boolean h;
        d5.a.j(this.d);
        while (zVar.a() > 0) {
            int i11 = this.g;
            if (i11 != 0) {
                if (i11 != 1) {
                    d5.z zVar2 = this.b;
                    d5.y yVar = this.c;
                    if (i11 == 2) {
                        int r10 = ((this.j & (-225)) << 8) | zVar.r();
                        this.i = r10;
                        if (r10 > zVar2.a.length) {
                            zVar2.z(r10);
                            byte[] bArr = zVar2.a;
                            yVar.getClass();
                            yVar.n(bArr.length, bArr);
                        }
                        this.h = 0;
                        this.g = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(zVar.a(), this.i - this.h);
                        zVar.c(this.h, min, yVar.b);
                        int i12 = this.h + min;
                        this.h = i12;
                        if (i12 == this.i) {
                            yVar.p(0);
                            if (!yVar.h()) {
                                this.l = true;
                                int i13 = yVar.i(1);
                                int i14 = i13 == 1 ? yVar.i(1) : 0;
                                this.m = i14;
                                if (i14 != 0) {
                                    throw t1.a(null, null);
                                }
                                if (i13 == 1) {
                                    yVar.i((yVar.i(2) + 1) * 8);
                                }
                                if (!yVar.h()) {
                                    throw t1.a(null, null);
                                }
                                this.n = yVar.i(6);
                                int i15 = yVar.i(4);
                                int i16 = yVar.i(3);
                                if (i15 != 0 || i16 != 0) {
                                    throw t1.a(null, null);
                                }
                                if (i13 == 0) {
                                    int g10 = yVar.g();
                                    int b10 = yVar.b();
                                    j3.a h10 = j3.b.h(yVar, true);
                                    this.u = h10.c;
                                    this.r = h10.a;
                                    this.t = h10.b;
                                    int b11 = b10 - yVar.b();
                                    yVar.p(g10);
                                    byte[] bArr2 = new byte[(b11 + 7) / 8];
                                    yVar.j(b11, bArr2);
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
                                    int b12 = yVar.b();
                                    j3.a h11 = j3.b.h(yVar, true);
                                    this.u = h11.c;
                                    this.r = h11.a;
                                    this.t = h11.b;
                                    yVar.s(yVar.i((yVar.i(2) + 1) * 8) - (b12 - yVar.b()));
                                }
                                int i17 = yVar.i(3);
                                this.o = i17;
                                if (i17 == 0) {
                                    yVar.s(8);
                                } else if (i17 == 1) {
                                    yVar.s(9);
                                } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                                    yVar.s(6);
                                } else {
                                    if (i17 != 6 && i17 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    yVar.s(1);
                                }
                                boolean h12 = yVar.h();
                                this.p = h12;
                                this.q = 0L;
                                if (h12) {
                                    if (i13 == 1) {
                                        this.q = yVar.i((yVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h = yVar.h();
                                            this.q = (this.q << 8) + yVar.i(8);
                                        } while (h);
                                    }
                                }
                                if (yVar.h()) {
                                    yVar.s(8);
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
                            int i18 = 0;
                            do {
                                i10 = yVar.i(8);
                                i18 += i10;
                            } while (i10 == 255);
                            int g11 = yVar.g();
                            if ((g11 & 7) == 0) {
                                zVar2.C(g11 >> 3);
                            } else {
                                yVar.j(i18 * 8, zVar2.a);
                                zVar2.C(0);
                            }
                            this.d.a(i18, zVar2);
                            long j10 = this.k;
                            if (j10 != -9223372036854775807L) {
                                this.d.e(j10, 1, i18, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                yVar.s((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int r11 = zVar.r();
                    if ((r11 & 224) == 224) {
                        this.j = r11;
                        this.g = 2;
                    } else if (r11 != 86) {
                        this.g = 0;
                    }
                }
            } else if (zVar.r() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // w3.h
    public final void c() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.d = mVar.C(e0Var.d, 1);
        e0Var.b();
        this.e = e0Var.e;
    }

    @Override // w3.h
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.k = j10;
        }
    }

    @Override // w3.h
    public final void d() {
    }
}
