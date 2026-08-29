package y3;

import android.util.Pair;
import f2.f0;
import j3.s0;
import j3.t0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j implements h {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public o3.w b;
    public final a0 c;
    public final f5.w d;
    public final f0 e;
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
            this.e = new f0(178);
            this.d = new f5.w();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // y3.h
    public final void a() {
        f5.a.m(this.f);
        i iVar = this.g;
        iVar.a = false;
        iVar.b = 0;
        iVar.c = 0;
        f0 f0Var = this.e;
        if (f0Var != null) {
            f0Var.f();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01db  */
    @Override // y3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(f5.w wVar) {
        i iVar;
        f0 f0Var;
        int i10;
        boolean z10;
        long j10;
        long j11;
        long j12;
        int i11;
        float f9;
        int i12;
        float f10;
        int i13;
        long j13;
        f5.a.j(this.b);
        int i14 = wVar.b;
        int i15 = wVar.c;
        byte[] bArr = wVar.a;
        this.h += wVar.a();
        this.b.e(wVar.a(), wVar);
        while (true) {
            int r6 = f5.a.r(bArr, i14, i15, this.f);
            iVar = this.g;
            f0Var = this.e;
            if (r6 == i15) {
                break;
            }
            int i16 = r6 + 3;
            int i17 = wVar.a[i16] & 255;
            int i18 = r6 - i14;
            if (this.j) {
                i10 = i15;
            } else {
                if (i18 > 0) {
                    iVar.a(i14, r6, bArr);
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
                            f9 = i23 * 4;
                            i12 = i22 * 3;
                        } else if (i24 == 3) {
                            f9 = i23 * 16;
                            i12 = i22 * 9;
                        } else if (i24 != 4) {
                            f10 = 1.0f;
                            s0 s0Var = new s0();
                            s0Var.a = str;
                            s0Var.o = "video/mpeg2";
                            s0Var.t = i22;
                            s0Var.u = i23;
                            s0Var.x = f10;
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
                            this.b.b((t0) create.first);
                            this.k = ((Long) create.second).longValue();
                            this.j = true;
                        } else {
                            f9 = i23 * 121;
                            i12 = i22 * 100;
                        }
                        f10 = f9 / i12;
                        s0 s0Var2 = new s0();
                        s0Var2.a = str;
                        s0Var2.o = "video/mpeg2";
                        s0Var2.t = i22;
                        s0Var2.u = i23;
                        s0Var2.x = f10;
                        s0Var2.q = Collections.singletonList(copyOf);
                        t0 t0Var2 = new t0(s0Var2);
                        i13 = (copyOf[7] & 15) - 1;
                        if (i13 >= 0) {
                        }
                        j13 = 0;
                        Pair create2 = Pair.create(t0Var2, Long.valueOf(j13));
                        this.b.b((t0) create2.first);
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
            if (f0Var != null) {
                if (i18 > 0) {
                    f0Var.a(i14, r6, bArr);
                    i11 = 0;
                } else {
                    i11 = -i18;
                }
                if (f0Var.e(i11)) {
                    int J = f5.a.J(f0Var.e, (byte[]) f0Var.f);
                    int i26 = f5.d0.a;
                    byte[] bArr2 = (byte[]) f0Var.f;
                    f5.w wVar2 = this.d;
                    wVar2.A(J, bArr2);
                    this.c.a(this.n, wVar2);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (wVar.a[r6 + 2] == 1) {
                        f0Var.g(i17);
                    }
                    if (i17 != 0 || i17 == 179) {
                        int i27 = i10 - r6;
                        if (this.p && this.j) {
                            j12 = this.n;
                            if (j12 != -9223372036854775807L) {
                                j10 = -9223372036854775807L;
                                this.b.c(j12, this.o ? 1 : 0, ((int) (this.h - this.m)) - i27, i27, null);
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
            int i272 = i10 - r6;
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
        if (f0Var != null) {
            f0Var.a(i14, i15, bArr);
        }
    }

    @Override // y3.h
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.a = d0Var.e;
        d0Var.b();
        this.b = mVar.Z1(d0Var.d, 2);
        a0 a0Var = this.c;
        if (a0Var != null) {
            a0Var.b(mVar, d0Var);
        }
    }

    @Override // y3.h
    public final void f(int i10, long j10) {
        this.l = j10;
    }

    @Override // y3.h
    public final void d() {
    }
}
