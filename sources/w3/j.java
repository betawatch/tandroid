package w3;

import android.util.Pair;
import d5.f0;
import f2.i0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements h {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public m3.w b;
    public final a0 c;
    public final d5.y d;
    public final i0 e;
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
            this.e = new i0(178);
            this.d = new d5.y();
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
    public final void g(d5.y yVar) {
        i iVar;
        i0 i0Var;
        int i9;
        boolean z10;
        long j10;
        long j11;
        long j12;
        int i10;
        float f10;
        int i11;
        float f11;
        int i12;
        long j13;
        d5.a.j(this.b);
        int i13 = yVar.b;
        int i14 = yVar.c;
        byte[] bArr = yVar.a;
        this.h += yVar.a();
        this.b.a(yVar.a(), yVar);
        while (true) {
            int r10 = d5.a.r(bArr, i13, i14, this.f);
            iVar = this.g;
            i0Var = this.e;
            if (r10 == i14) {
                break;
            }
            int i15 = r10 + 3;
            int i16 = yVar.a[i15] & 255;
            int i17 = r10 - i13;
            if (this.j) {
                i9 = i14;
            } else {
                if (i17 > 0) {
                    iVar.a(i13, r10, bArr);
                }
                int i18 = i17 < 0 ? -i17 : 0;
                if (iVar.a) {
                    int i19 = iVar.b - i18;
                    iVar.b = i19;
                    if (iVar.c == 0 && i16 == 181) {
                        iVar.c = i19;
                        i9 = i14;
                    } else {
                        iVar.a = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(iVar.d, iVar.b);
                        int i20 = copyOf[4] & 255;
                        byte b10 = copyOf[5];
                        i9 = i14;
                        int i21 = ((b10 & 255) >> 4) | (i20 << 4);
                        int i22 = (copyOf[6] & 255) | ((b10 & 15) << 8);
                        int i23 = (copyOf[7] & 240) >> 4;
                        if (i23 == 2) {
                            f10 = i22 * 4;
                            i11 = i21 * 3;
                        } else if (i23 == 3) {
                            f10 = i22 * 16;
                            i11 = i21 * 9;
                        } else if (i23 != 4) {
                            f11 = 1.0f;
                            s0 s0Var = new s0();
                            s0Var.a = str;
                            s0Var.o = "video/mpeg2";
                            s0Var.t = i21;
                            s0Var.u = i22;
                            s0Var.x = f11;
                            s0Var.q = Collections.singletonList(copyOf);
                            t0 t0Var = new t0(s0Var);
                            i12 = (copyOf[7] & 15) - 1;
                            if (i12 >= 0 || i12 >= 8) {
                                j13 = 0;
                            } else {
                                double d = q[i12];
                                byte b11 = copyOf[iVar.c + 9];
                                int i24 = (b11 & 96) >> 5;
                                if (i24 != (b11 & 31)) {
                                    d = ((i24 + 1.0d) / (r6 + 1)) * d;
                                }
                                j13 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(t0Var, Long.valueOf(j13));
                            this.b.c((t0) create.first);
                            this.k = ((Long) create.second).longValue();
                            this.j = true;
                        } else {
                            f10 = i22 * 121;
                            i11 = i21 * 100;
                        }
                        f11 = f10 / i11;
                        s0 s0Var2 = new s0();
                        s0Var2.a = str;
                        s0Var2.o = "video/mpeg2";
                        s0Var2.t = i21;
                        s0Var2.u = i22;
                        s0Var2.x = f11;
                        s0Var2.q = Collections.singletonList(copyOf);
                        t0 t0Var2 = new t0(s0Var2);
                        i12 = (copyOf[7] & 15) - 1;
                        if (i12 >= 0) {
                        }
                        j13 = 0;
                        Pair create2 = Pair.create(t0Var2, Long.valueOf(j13));
                        this.b.c((t0) create2.first);
                        this.k = ((Long) create2.second).longValue();
                        this.j = true;
                    }
                } else {
                    i9 = i14;
                    if (i16 == 179) {
                        iVar.a = true;
                    }
                }
                iVar.a(0, 3, i.e);
            }
            if (i0Var != null) {
                if (i17 > 0) {
                    i0Var.a(i13, r10, bArr);
                    i10 = 0;
                } else {
                    i10 = -i17;
                }
                if (i0Var.e(i10)) {
                    int J = d5.a.J(i0Var.e, (byte[]) i0Var.f);
                    int i25 = f0.a;
                    byte[] bArr2 = (byte[]) i0Var.f;
                    d5.y yVar2 = this.d;
                    yVar2.A(J, bArr2);
                    this.c.a(this.n, yVar2);
                }
                if (i16 == 178) {
                    z10 = true;
                    if (yVar.a[r10 + 2] == 1) {
                        i0Var.g(i16);
                    }
                    if (i16 != 0 || i16 == 179) {
                        int i26 = i9 - r10;
                        if (this.p && this.j) {
                            j12 = this.n;
                            if (j12 != -9223372036854775807L) {
                                j10 = -9223372036854775807L;
                                this.b.e(j12, this.o ? 1 : 0, ((int) (this.h - this.m)) - i26, i26, null);
                                if (this.i || this.p) {
                                    this.m = this.h - i26;
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
                                this.p = i16 == 0;
                            }
                        }
                        j10 = -9223372036854775807L;
                        if (this.i) {
                        }
                        this.m = this.h - i26;
                        j11 = this.l;
                        if (j11 == j10) {
                        }
                        this.n = j11;
                        this.o = false;
                        this.l = j10;
                        this.i = true;
                        this.p = i16 == 0;
                    } else if (i16 == 184) {
                        this.o = z10;
                    }
                    i13 = i15;
                    i14 = i9;
                }
            }
            z10 = true;
            if (i16 != 0) {
            }
            int i262 = i9 - r10;
            if (this.p) {
                j12 = this.n;
                if (j12 != -9223372036854775807L) {
                }
            }
            j10 = -9223372036854775807L;
            if (this.i) {
            }
            this.m = this.h - i262;
            j11 = this.l;
            if (j11 == j10) {
            }
            this.n = j11;
            this.o = false;
            this.l = j10;
            this.i = true;
            this.p = i16 == 0;
            i13 = i15;
            i14 = i9;
        }
        if (!this.j) {
            iVar.a(i13, i14, bArr);
        }
        if (i0Var != null) {
            i0Var.a(i13, i14, bArr);
        }
    }

    @Override // w3.h
    public final void h() {
        d5.a.m(this.f);
        i iVar = this.g;
        iVar.a = false;
        iVar.b = 0;
        iVar.c = 0;
        i0 i0Var = this.e;
        if (i0Var != null) {
            i0Var.f();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // w3.h
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.a = d0Var.e;
        d0Var.b();
        this.b = mVar.I(d0Var.d, 2);
        a0 a0Var = this.c;
        if (a0Var != null) {
            a0Var.b(mVar, d0Var);
        }
    }

    @Override // w3.h
    public final void k(int i9, long j10) {
        this.l = j10;
    }

    @Override // w3.h
    public final void i() {
    }
}
