package w3;

import d5.f0;
import f2.i0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m implements h {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final a0 a;
    public final d5.y b;
    public final boolean[] c = new boolean[4];
    public final k d;
    public final i0 e;
    public l f;
    public long g;
    public String h;
    public m3.w i;
    public boolean j;
    public long k;

    public m(a0 a0Var) {
        this.a = a0Var;
        k kVar = new k();
        kVar.e = new byte[128];
        this.d = kVar;
        this.k = -9223372036854775807L;
        this.e = new i0(178);
        this.b = new d5.y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    @Override // w3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(d5.y yVar) {
        int i9;
        int i10;
        l lVar;
        long j10;
        int i11;
        int i12;
        float f10;
        d5.a.j(this.f);
        d5.a.j(this.i);
        int i13 = yVar.b;
        int i14 = yVar.c;
        byte[] bArr = yVar.a;
        this.g += yVar.a();
        this.i.a(yVar.a(), yVar);
        while (true) {
            int r10 = d5.a.r(bArr, i13, i14, this.c);
            k kVar = this.d;
            i0 i0Var = this.e;
            if (r10 == i14) {
                if (!this.j) {
                    kVar.a(i13, i14, bArr);
                }
                this.f.a(i13, i14, bArr);
                if (i0Var != null) {
                    i0Var.a(i13, i14, bArr);
                    return;
                }
                return;
            }
            int i15 = r10 + 3;
            byte b10 = yVar.a[i15];
            int i16 = b10 & 255;
            int i17 = r10 - i13;
            if (this.j) {
                i9 = i14;
                i10 = i15;
            } else {
                if (i17 > 0) {
                    kVar.a(i13, r10, bArr);
                }
                int i18 = i17 < 0 ? -i17 : 0;
                int i19 = kVar.b;
                if (i19 != 0) {
                    i9 = i14;
                    if (i19 == 1) {
                        i10 = i15;
                        i12 = 0;
                        if (i16 != 181) {
                            d5.a.K("H263Reader", "Unexpected start code value");
                            kVar.a = false;
                            kVar.c = 0;
                            kVar.b = 0;
                        } else {
                            kVar.b = 2;
                        }
                    } else if (i19 != 2) {
                        i10 = i15;
                        if (i19 != 3) {
                            if (i19 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i16 == 179 || i16 == 181) {
                                kVar.c -= i18;
                                kVar.a = false;
                                m3.w wVar = this.i;
                                int i20 = kVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(kVar.e, kVar.c);
                                d5.x xVar = new d5.x(copyOf, copyOf.length);
                                xVar.t(i20);
                                xVar.t(4);
                                xVar.r();
                                xVar.s(8);
                                if (xVar.h()) {
                                    xVar.s(4);
                                    xVar.s(3);
                                }
                                int i21 = xVar.i(4);
                                if (i21 == 15) {
                                    int i22 = xVar.i(8);
                                    int i23 = xVar.i(8);
                                    if (i23 == 0) {
                                        d5.a.K("H263Reader", "Invalid aspect ratio");
                                        f10 = 1.0f;
                                        if (xVar.h()) {
                                            xVar.s(2);
                                            xVar.s(1);
                                            if (xVar.h()) {
                                                xVar.s(15);
                                                xVar.r();
                                                xVar.s(15);
                                                xVar.r();
                                                xVar.s(15);
                                                xVar.r();
                                                xVar.s(3);
                                                xVar.s(11);
                                                xVar.r();
                                                xVar.s(15);
                                                xVar.r();
                                            }
                                        }
                                        if (xVar.i(2) != 0) {
                                            d5.a.K("H263Reader", "Unhandled video object layer shape");
                                        }
                                        xVar.r();
                                        int i24 = xVar.i(16);
                                        xVar.r();
                                        if (xVar.h()) {
                                            if (i24 == 0) {
                                                d5.a.K("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i25 = 0;
                                                for (int i26 = i24 - 1; i26 > 0; i26 >>= 1) {
                                                    i25++;
                                                }
                                                xVar.s(i25);
                                            }
                                        }
                                        xVar.r();
                                        int i27 = xVar.i(13);
                                        xVar.r();
                                        int i28 = xVar.i(13);
                                        xVar.r();
                                        xVar.r();
                                        s0 s0Var = new s0();
                                        s0Var.a = str;
                                        s0Var.o = "video/mp4v-es";
                                        s0Var.t = i27;
                                        s0Var.u = i28;
                                        s0Var.x = f10;
                                        s0Var.q = Collections.singletonList(copyOf);
                                        wVar.c(new t0(s0Var));
                                        this.j = true;
                                    } else {
                                        f10 = i22 / i23;
                                        if (xVar.h()) {
                                        }
                                        if (xVar.i(2) != 0) {
                                        }
                                        xVar.r();
                                        int i242 = xVar.i(16);
                                        xVar.r();
                                        if (xVar.h()) {
                                        }
                                        xVar.r();
                                        int i272 = xVar.i(13);
                                        xVar.r();
                                        int i282 = xVar.i(13);
                                        xVar.r();
                                        xVar.r();
                                        s0 s0Var2 = new s0();
                                        s0Var2.a = str;
                                        s0Var2.o = "video/mp4v-es";
                                        s0Var2.t = i272;
                                        s0Var2.u = i282;
                                        s0Var2.x = f10;
                                        s0Var2.q = Collections.singletonList(copyOf);
                                        wVar.c(new t0(s0Var2));
                                        this.j = true;
                                    }
                                } else if (i21 < 7) {
                                    f10 = l[i21];
                                    if (xVar.h()) {
                                    }
                                    if (xVar.i(2) != 0) {
                                    }
                                    xVar.r();
                                    int i2422 = xVar.i(16);
                                    xVar.r();
                                    if (xVar.h()) {
                                    }
                                    xVar.r();
                                    int i2722 = xVar.i(13);
                                    xVar.r();
                                    int i2822 = xVar.i(13);
                                    xVar.r();
                                    xVar.r();
                                    s0 s0Var22 = new s0();
                                    s0Var22.a = str;
                                    s0Var22.o = "video/mp4v-es";
                                    s0Var22.t = i2722;
                                    s0Var22.u = i2822;
                                    s0Var22.x = f10;
                                    s0Var22.q = Collections.singletonList(copyOf);
                                    wVar.c(new t0(s0Var22));
                                    this.j = true;
                                } else {
                                    d5.a.K("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                    if (xVar.h()) {
                                    }
                                    if (xVar.i(2) != 0) {
                                    }
                                    xVar.r();
                                    int i24222 = xVar.i(16);
                                    xVar.r();
                                    if (xVar.h()) {
                                    }
                                    xVar.r();
                                    int i27222 = xVar.i(13);
                                    xVar.r();
                                    int i28222 = xVar.i(13);
                                    xVar.r();
                                    xVar.r();
                                    s0 s0Var222 = new s0();
                                    s0Var222.a = str;
                                    s0Var222.o = "video/mp4v-es";
                                    s0Var222.t = i27222;
                                    s0Var222.u = i28222;
                                    s0Var222.x = f10;
                                    s0Var222.q = Collections.singletonList(copyOf);
                                    wVar.c(new t0(s0Var222));
                                    this.j = true;
                                }
                            } else {
                                i12 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            d5.a.K("H263Reader", "Unexpected start code value");
                            i12 = 0;
                            kVar.a = false;
                            kVar.c = 0;
                            kVar.b = 0;
                        } else {
                            i12 = 0;
                            kVar.d = kVar.c;
                            kVar.b = 4;
                        }
                    } else {
                        i10 = i15;
                        i12 = 0;
                        if (i16 > 31) {
                            d5.a.K("H263Reader", "Unexpected start code value");
                            kVar.a = false;
                            kVar.c = 0;
                            kVar.b = 0;
                        } else {
                            kVar.b = 3;
                        }
                    }
                } else {
                    i9 = i14;
                    i10 = i15;
                    i12 = 0;
                    if (i16 == 176) {
                        kVar.b = 1;
                        kVar.a = true;
                    }
                }
                kVar.a(i12, 3, k.f);
            }
            this.f.a(i13, r10, bArr);
            if (i0Var != null) {
                if (i17 > 0) {
                    i0Var.a(i13, r10, bArr);
                    i11 = 0;
                } else {
                    i11 = -i17;
                }
                if (i0Var.e(i11)) {
                    int J = d5.a.J(i0Var.e, (byte[]) i0Var.f);
                    int i29 = f0.a;
                    byte[] bArr2 = (byte[]) i0Var.f;
                    d5.y yVar2 = this.b;
                    yVar2.A(J, bArr2);
                    this.a.a(this.k, yVar2);
                }
                if (i16 == 178) {
                    if (yVar.a[r10 + 2] == 1) {
                        i0Var.g(i16);
                    }
                    int i30 = i9 - r10;
                    long j11 = this.g - i30;
                    lVar = this.f;
                    boolean z10 = this.j;
                    if (lVar.e == 182 && z10 && lVar.b) {
                        j10 = lVar.h;
                        if (j10 != -9223372036854775807L) {
                            lVar.a.e(j10, lVar.d ? 1 : 0, (int) (j11 - lVar.g), i30, null);
                        }
                    }
                    if (lVar.e != 179) {
                        lVar.g = j11;
                    }
                    l lVar2 = this.f;
                    long j12 = this.k;
                    lVar2.e = i16;
                    lVar2.d = false;
                    lVar2.b = i16 != 182 || i16 == 179;
                    lVar2.c = i16 != 182;
                    lVar2.f = 0;
                    lVar2.h = j12;
                    i14 = i9;
                    i13 = i10;
                }
            }
            int i302 = i9 - r10;
            long j112 = this.g - i302;
            lVar = this.f;
            boolean z102 = this.j;
            if (lVar.e == 182) {
                j10 = lVar.h;
                if (j10 != -9223372036854775807L) {
                }
            }
            if (lVar.e != 179) {
            }
            l lVar22 = this.f;
            long j122 = this.k;
            lVar22.e = i16;
            lVar22.d = false;
            lVar22.b = i16 != 182 || i16 == 179;
            lVar22.c = i16 != 182;
            lVar22.f = 0;
            lVar22.h = j122;
            i14 = i9;
            i13 = i10;
        }
    }

    @Override // w3.h
    public final void h() {
        d5.a.m(this.c);
        k kVar = this.d;
        kVar.a = false;
        kVar.c = 0;
        kVar.b = 0;
        l lVar = this.f;
        if (lVar != null) {
            lVar.b = false;
            lVar.c = false;
            lVar.d = false;
            lVar.e = -1;
        }
        i0 i0Var = this.e;
        if (i0Var != null) {
            i0Var.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // w3.h
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.h = d0Var.e;
        d0Var.b();
        m3.w I = mVar.I(d0Var.d, 2);
        this.i = I;
        this.f = new l(I);
        this.a.b(mVar, d0Var);
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
