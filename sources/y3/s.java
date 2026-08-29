package y3;

import j3.s0;
import j3.t0;
import j3.t1;
import java.util.Collections;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s implements h {
    public final String a;
    public final f5.w b;
    public final f5.v c;
    public o3.w d;
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
        f5.w wVar = new f5.w(1024);
        this.b = wVar;
        byte[] bArr = wVar.a;
        this.c = new f5.v(bArr, bArr.length);
        this.k = -9223372036854775807L;
    }

    @Override // y3.h
    public final void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0191, code lost:
    
        if (r23.l == false) goto L88;
     */
    @Override // y3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(f5.w wVar) {
        int i10;
        boolean h;
        f5.a.j(this.d);
        while (wVar.a() > 0) {
            int i11 = this.g;
            if (i11 != 0) {
                if (i11 != 1) {
                    f5.w wVar2 = this.b;
                    f5.v vVar = this.c;
                    if (i11 == 2) {
                        int r6 = ((this.j & (-225)) << 8) | wVar.r();
                        this.i = r6;
                        if (r6 > wVar2.a.length) {
                            wVar2.z(r6);
                            byte[] bArr = wVar2.a;
                            vVar.getClass();
                            vVar.n(bArr.length, bArr);
                        }
                        this.h = 0;
                        this.g = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(wVar.a(), this.i - this.h);
                        wVar.c(this.h, min, vVar.b);
                        int i12 = this.h + min;
                        this.h = i12;
                        if (i12 == this.i) {
                            vVar.p(0);
                            if (!vVar.h()) {
                                this.l = true;
                                int i13 = vVar.i(1);
                                int i14 = i13 == 1 ? vVar.i(1) : 0;
                                this.m = i14;
                                if (i14 != 0) {
                                    throw t1.a(null, null);
                                }
                                if (i13 == 1) {
                                    vVar.i((vVar.i(2) + 1) * 8);
                                }
                                if (!vVar.h()) {
                                    throw t1.a(null, null);
                                }
                                this.n = vVar.i(6);
                                int i15 = vVar.i(4);
                                int i16 = vVar.i(3);
                                if (i15 != 0 || i16 != 0) {
                                    throw t1.a(null, null);
                                }
                                if (i13 == 0) {
                                    int g10 = vVar.g();
                                    int b10 = vVar.b();
                                    l3.a h10 = l3.b.h(vVar, true);
                                    this.u = h10.c;
                                    this.r = h10.a;
                                    this.t = h10.b;
                                    int b11 = b10 - vVar.b();
                                    vVar.p(g10);
                                    byte[] bArr2 = new byte[(b11 + 7) / 8];
                                    vVar.j(b11, bArr2);
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
                                        this.d.b(t0Var);
                                    }
                                } else {
                                    int b12 = vVar.b();
                                    l3.a h11 = l3.b.h(vVar, true);
                                    this.u = h11.c;
                                    this.r = h11.a;
                                    this.t = h11.b;
                                    vVar.s(vVar.i((vVar.i(2) + 1) * 8) - (b12 - vVar.b()));
                                }
                                int i17 = vVar.i(3);
                                this.o = i17;
                                if (i17 == 0) {
                                    vVar.s(8);
                                } else if (i17 == 1) {
                                    vVar.s(9);
                                } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                                    vVar.s(6);
                                } else {
                                    if (i17 != 6 && i17 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    vVar.s(1);
                                }
                                boolean h12 = vVar.h();
                                this.p = h12;
                                this.q = 0L;
                                if (h12) {
                                    if (i13 == 1) {
                                        this.q = vVar.i((vVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h = vVar.h();
                                            this.q = (this.q << 8) + vVar.i(8);
                                        } while (h);
                                    }
                                }
                                if (vVar.h()) {
                                    vVar.s(8);
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
                                i10 = vVar.i(8);
                                i18 += i10;
                            } while (i10 == 255);
                            int g11 = vVar.g();
                            if ((g11 & 7) == 0) {
                                wVar2.C(g11 >> 3);
                            } else {
                                vVar.j(i18 * 8, wVar2.a);
                                wVar2.C(0);
                            }
                            this.d.e(i18, wVar2);
                            long j10 = this.k;
                            if (j10 != -9223372036854775807L) {
                                this.d.c(j10, 1, i18, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                vVar.s((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int r9 = wVar.r();
                    if ((r9 & 224) == 224) {
                        this.j = r9;
                        this.g = 2;
                    } else if (r9 != 86) {
                        this.g = 0;
                    }
                }
            } else if (wVar.r() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // y3.h
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.d = mVar.Z1(d0Var.d, 1);
        d0Var.b();
        this.e = d0Var.e;
    }

    @Override // y3.h
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.k = j10;
        }
    }

    @Override // y3.h
    public final void d() {
    }
}
