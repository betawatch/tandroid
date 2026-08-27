package w3;

import android.util.Pair;
import f2.g0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j implements h {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public m3.w b;
    public final a0 c;
    public final d5.z d;
    public final g0 e;
    public final boolean[] f = new boolean[4];
    public final i g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public j(a0 a0Var) {
        this.c = a0Var;
        i iVar = new i();
        iVar.d = new byte[128];
        this.g = iVar;
        if (a0Var != null) {
            this.e = new g0(178);
            this.d = new d5.z();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01db  */
    @Override // w3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d5.z zVar) {
        i iVar;
        g0 g0Var;
        int i10;
        boolean z10;
        long j10;
        long j11;
        long j12;
        int i11;
        float f10;
        int i12;
        float f11;
        int i13;
        long j13;
        d5.a.j(this.b);
        int i14 = zVar.b;
        int i15 = zVar.c;
        byte[] bArr = zVar.a;
        this.h += zVar.a();
        this.b.a(zVar.a(), zVar);
        while (true) {
            int r10 = d5.a.r(bArr, i14, i15, this.f);
            iVar = this.g;
            g0Var = this.e;
            if (r10 == i15) {
                break;
            }
            int i16 = r10 + 3;
            int i17 = zVar.a[i16] & 255;
            int i18 = r10 - i14;
            if (this.j) {
                i10 = i15;
            } else {
                if (i18 > 0) {
                    iVar.a(i14, r10, bArr);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                if (iVar.a) {
                    int i20 = iVar.b - i19;
                    iVar.b = i20;
                    if (iVar.c == 0 && i17 == 181) {
                        iVar.c = i20;
                        i10 = i15;
                    } else {
                        iVar.a = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(iVar.d, iVar.b);
                        int i21 = copyOf[4] & 255;
                        byte b10 = copyOf[5];
                        i10 = i15;
                        int i22 = ((b10 & 255) >> 4) | (i21 << 4);
                        int i23 = (copyOf[6] & 255) | ((b10 & 15) << 8);
                        int i24 = (copyOf[7] & 240) >> 4;
                        if (i24 == 2) {
                            f10 = i23 * 4;
                            i12 = i22 * 3;
                        } else if (i24 == 3) {
                            f10 = i23 * 16;
                            i12 = i22 * 9;
                        } else if (i24 != 4) {
                            f11 = 1.0f;
                            s0 s0Var = new s0();
                            s0Var.a = str;
                            s0Var.o = "video/mpeg2";
                            s0Var.t = i22;
                            s0Var.u = i23;
                            s0Var.x = f11;
                            s0Var.q = Collections.singletonList(copyOf);
                            t0 t0Var = new t0(s0Var);
                            i13 = (copyOf[7] & 15) - 1;
                            if (i13 >= 0 || i13 >= 8) {
                                j13 = 0;
                            } else {
                                double d = q[i13];
                                byte b11 = copyOf[iVar.c + 9];
                                int i25 = (b11 & 96) >> 5;
                                if (i25 != (b11 & 31)) {
                                    d = ((i25 + 1.0d) / (r6 + 1)) * d;
                                }
                                j13 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(t0Var, Long.valueOf(j13));
                            this.b.c((t0) create.first);
                            this.k = ((Long) create.second).longValue();
                            this.j = true;
                        } else {
                            f10 = i23 * 121;
                            i12 = i22 * 100;
                        }
                        f11 = f10 / i12;
                        s0 s0Var2 = new s0();
                        s0Var2.a = str;
                        s0Var2.o = "video/mpeg2";
                        s0Var2.t = i22;
                        s0Var2.u = i23;
                        s0Var2.x = f11;
                        s0Var2.q = Collections.singletonList(copyOf);
                        t0 t0Var2 = new t0(s0Var2);
                        i13 = (copyOf[7] & 15) - 1;
                        if (i13 >= 0) {
                        }
                        j13 = 0;
                        Pair create2 = Pair.create(t0Var2, Long.valueOf(j13));
                        this.b.c((t0) create2.first);
                        this.k = ((Long) create2.second).longValue();
                        this.j = true;
                    }
                } else {
                    i10 = i15;
                    if (i17 == 179) {
                        iVar.a = true;
                    }
                }
                iVar.a(0, 3, i.e);
            }
            if (g0Var != null) {
                if (i18 > 0) {
                    g0Var.a(i14, r10, bArr);
                    i11 = 0;
                } else {
                    i11 = -i18;
                }
                if (g0Var.e(i11)) {
                    int J = d5.a.J(g0Var.e, (byte[]) g0Var.f);
                    int i26 = d5.g0.a;
                    byte[] bArr2 = (byte[]) g0Var.f;
                    d5.z zVar2 = this.d;
                    zVar2.A(J, bArr2);
                    this.c.a(this.n, zVar2);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (zVar.a[r10 + 2] == 1) {
                        g0Var.g(i17);
                    }
                    if (i17 != 0 || i17 == 179) {
                        int i27 = i10 - r10;
                        if (this.p && this.j) {
                            j12 = this.n;
                            if (j12 != -9223372036854775807L) {
                                j10 = -9223372036854775807L;
                                this.b.e(j12, this.o ? 1 : 0, ((int) (this.h - this.m)) - i27, i27, null);
                                if (this.i || this.p) {
                                    this.m = this.h - i27;
                                    j11 = this.l;
                                    if (j11 == j10) {
                                        long j14 = this.n;
                                        j11 = j14 != j10 ? j14 + this.k : j10;
                                    }
                                    this.n = j11;
                                    this.o = false;
                                    this.l = j10;
                                    this.i = true;
                                }
                                this.p = i17 == 0;
                            }
                        }
                        j10 = -9223372036854775807L;
                        if (this.i) {
                        }
                        this.m = this.h - i27;
                        j11 = this.l;
                        if (j11 == j10) {
                        }
                        this.n = j11;
                        this.o = false;
                        this.l = j10;
                        this.i = true;
                        this.p = i17 == 0;
                    } else if (i17 == 184) {
                        this.o = z10;
                    }
                    i14 = i16;
                    i15 = i10;
                }
            }
            z10 = true;
            if (i17 != 0) {
            }
            int i272 = i10 - r10;
            if (this.p) {
                j12 = this.n;
                if (j12 != -9223372036854775807L) {
                }
            }
            j10 = -9223372036854775807L;
            if (this.i) {
            }
            this.m = this.h - i272;
            j11 = this.l;
            if (j11 == j10) {
            }
            this.n = j11;
            this.o = false;
            this.l = j10;
            this.i = true;
            this.p = i17 == 0;
            i14 = i16;
            i15 = i10;
        }
        if (!this.j) {
            iVar.a(i14, i15, bArr);
        }
        if (g0Var != null) {
            g0Var.a(i14, i15, bArr);
        }
    }

    @Override // w3.h
    public final void c() {
        d5.a.m(this.f);
        i iVar = this.g;
        iVar.a = false;
        iVar.b = 0;
        iVar.c = 0;
        g0 g0Var = this.e;
        if (g0Var != null) {
            g0Var.f();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.a = e0Var.e;
        e0Var.b();
        this.b = mVar.C(e0Var.d, 2);
        a0 a0Var = this.c;
        if (a0Var != null) {
            a0Var.b(mVar, e0Var);
        }
    }

    @Override // w3.h
    public final void f(int i10, long j10) {
        this.l = j10;
    }

    @Override // w3.h
    public final void d() {
    }
}
