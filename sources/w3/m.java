package w3;

import f2.g0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m implements h {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final a0 a;
    public final d5.z b;
    public final boolean[] c = new boolean[4];
    public final k d;
    public final g0 e;
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
        this.e = new g0(178);
        this.b = new d5.z();
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
    public final void b(d5.z zVar) {
        int i10;
        int i11;
        l lVar;
        long j10;
        int i12;
        int i13;
        float f10;
        d5.a.j(this.f);
        d5.a.j(this.i);
        int i14 = zVar.b;
        int i15 = zVar.c;
        byte[] bArr = zVar.a;
        this.g += zVar.a();
        this.i.a(zVar.a(), zVar);
        while (true) {
            int r10 = d5.a.r(bArr, i14, i15, this.c);
            k kVar = this.d;
            g0 g0Var = this.e;
            if (r10 == i15) {
                if (!this.j) {
                    kVar.a(i14, i15, bArr);
                }
                this.f.a(i14, i15, bArr);
                if (g0Var != null) {
                    g0Var.a(i14, i15, bArr);
                    return;
                }
                return;
            }
            int i16 = r10 + 3;
            byte b10 = zVar.a[i16];
            int i17 = b10 & 255;
            int i18 = r10 - i14;
            if (this.j) {
                i10 = i15;
                i11 = i16;
            } else {
                if (i18 > 0) {
                    kVar.a(i14, r10, bArr);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = kVar.b;
                if (i20 != 0) {
                    i10 = i15;
                    if (i20 == 1) {
                        i11 = i16;
                        i13 = 0;
                        if (i17 != 181) {
                            d5.a.K("H263Reader", "Unexpected start code value");
                            kVar.a = false;
                            kVar.c = 0;
                            kVar.b = 0;
                        } else {
                            kVar.b = 2;
                        }
                    } else if (i20 != 2) {
                        i11 = i16;
                        if (i20 != 3) {
                            if (i20 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i17 == 179 || i17 == 181) {
                                kVar.c -= i19;
                                kVar.a = false;
                                m3.w wVar = this.i;
                                int i21 = kVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(kVar.e, kVar.c);
                                d5.y yVar = new d5.y(copyOf, copyOf.length);
                                yVar.t(i21);
                                yVar.t(4);
                                yVar.r();
                                yVar.s(8);
                                if (yVar.h()) {
                                    yVar.s(4);
                                    yVar.s(3);
                                }
                                int i22 = yVar.i(4);
                                if (i22 == 15) {
                                    int i23 = yVar.i(8);
                                    int i24 = yVar.i(8);
                                    if (i24 == 0) {
                                        d5.a.K("H263Reader", "Invalid aspect ratio");
                                        f10 = 1.0f;
                                        if (yVar.h()) {
                                            yVar.s(2);
                                            yVar.s(1);
                                            if (yVar.h()) {
                                                yVar.s(15);
                                                yVar.r();
                                                yVar.s(15);
                                                yVar.r();
                                                yVar.s(15);
                                                yVar.r();
                                                yVar.s(3);
                                                yVar.s(11);
                                                yVar.r();
                                                yVar.s(15);
                                                yVar.r();
                                            }
                                        }
                                        if (yVar.i(2) != 0) {
                                            d5.a.K("H263Reader", "Unhandled video object layer shape");
                                        }
                                        yVar.r();
                                        int i25 = yVar.i(16);
                                        yVar.r();
                                        if (yVar.h()) {
                                            if (i25 == 0) {
                                                d5.a.K("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i26 = 0;
                                                for (int i27 = i25 - 1; i27 > 0; i27 >>= 1) {
                                                    i26++;
                                                }
                                                yVar.s(i26);
                                            }
                                        }
                                        yVar.r();
                                        int i28 = yVar.i(13);
                                        yVar.r();
                                        int i29 = yVar.i(13);
                                        yVar.r();
                                        yVar.r();
                                        s0 s0Var = new s0();
                                        s0Var.a = str;
                                        s0Var.o = "video/mp4v-es";
                                        s0Var.t = i28;
                                        s0Var.u = i29;
                                        s0Var.x = f10;
                                        s0Var.q = Collections.singletonList(copyOf);
                                        wVar.c(new t0(s0Var));
                                        this.j = true;
                                    } else {
                                        f10 = i23 / i24;
                                        if (yVar.h()) {
                                        }
                                        if (yVar.i(2) != 0) {
                                        }
                                        yVar.r();
                                        int i252 = yVar.i(16);
                                        yVar.r();
                                        if (yVar.h()) {
                                        }
                                        yVar.r();
                                        int i282 = yVar.i(13);
                                        yVar.r();
                                        int i292 = yVar.i(13);
                                        yVar.r();
                                        yVar.r();
                                        s0 s0Var2 = new s0();
                                        s0Var2.a = str;
                                        s0Var2.o = "video/mp4v-es";
                                        s0Var2.t = i282;
                                        s0Var2.u = i292;
                                        s0Var2.x = f10;
                                        s0Var2.q = Collections.singletonList(copyOf);
                                        wVar.c(new t0(s0Var2));
                                        this.j = true;
                                    }
                                } else if (i22 < 7) {
                                    f10 = l[i22];
                                    if (yVar.h()) {
                                    }
                                    if (yVar.i(2) != 0) {
                                    }
                                    yVar.r();
                                    int i2522 = yVar.i(16);
                                    yVar.r();
                                    if (yVar.h()) {
                                    }
                                    yVar.r();
                                    int i2822 = yVar.i(13);
                                    yVar.r();
                                    int i2922 = yVar.i(13);
                                    yVar.r();
                                    yVar.r();
                                    s0 s0Var22 = new s0();
                                    s0Var22.a = str;
                                    s0Var22.o = "video/mp4v-es";
                                    s0Var22.t = i2822;
                                    s0Var22.u = i2922;
                                    s0Var22.x = f10;
                                    s0Var22.q = Collections.singletonList(copyOf);
                                    wVar.c(new t0(s0Var22));
                                    this.j = true;
                                } else {
                                    d5.a.K("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                    if (yVar.h()) {
                                    }
                                    if (yVar.i(2) != 0) {
                                    }
                                    yVar.r();
                                    int i25222 = yVar.i(16);
                                    yVar.r();
                                    if (yVar.h()) {
                                    }
                                    yVar.r();
                                    int i28222 = yVar.i(13);
                                    yVar.r();
                                    int i29222 = yVar.i(13);
                                    yVar.r();
                                    yVar.r();
                                    s0 s0Var222 = new s0();
                                    s0Var222.a = str;
                                    s0Var222.o = "video/mp4v-es";
                                    s0Var222.t = i28222;
                                    s0Var222.u = i29222;
                                    s0Var222.x = f10;
                                    s0Var222.q = Collections.singletonList(copyOf);
                                    wVar.c(new t0(s0Var222));
                                    this.j = true;
                                }
                            } else {
                                i13 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            d5.a.K("H263Reader", "Unexpected start code value");
                            i13 = 0;
                            kVar.a = false;
                            kVar.c = 0;
                            kVar.b = 0;
                        } else {
                            i13 = 0;
                            kVar.d = kVar.c;
                            kVar.b = 4;
                        }
                    } else {
                        i11 = i16;
                        i13 = 0;
                        if (i17 > 31) {
                            d5.a.K("H263Reader", "Unexpected start code value");
                            kVar.a = false;
                            kVar.c = 0;
                            kVar.b = 0;
                        } else {
                            kVar.b = 3;
                        }
                    }
                } else {
                    i10 = i15;
                    i11 = i16;
                    i13 = 0;
                    if (i17 == 176) {
                        kVar.b = 1;
                        kVar.a = true;
                    }
                }
                kVar.a(i13, 3, k.f);
            }
            this.f.a(i14, r10, bArr);
            if (g0Var != null) {
                if (i18 > 0) {
                    g0Var.a(i14, r10, bArr);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (g0Var.e(i12)) {
                    int J = d5.a.J(g0Var.e, (byte[]) g0Var.f);
                    int i30 = d5.g0.a;
                    byte[] bArr2 = (byte[]) g0Var.f;
                    d5.z zVar2 = this.b;
                    zVar2.A(J, bArr2);
                    this.a.a(this.k, zVar2);
                }
                if (i17 == 178) {
                    if (zVar.a[r10 + 2] == 1) {
                        g0Var.g(i17);
                    }
                    int i31 = i10 - r10;
                    long j11 = this.g - i31;
                    lVar = this.f;
                    boolean z10 = this.j;
                    if (lVar.e == 182 && z10 && lVar.b) {
                        j10 = lVar.h;
                        if (j10 != -9223372036854775807L) {
                            lVar.a.e(j10, lVar.d ? 1 : 0, (int) (j11 - lVar.g), i31, null);
                        }
                    }
                    if (lVar.e != 179) {
                        lVar.g = j11;
                    }
                    l lVar2 = this.f;
                    long j12 = this.k;
                    lVar2.e = i17;
                    lVar2.d = false;
                    lVar2.b = i17 != 182 || i17 == 179;
                    lVar2.c = i17 != 182;
                    lVar2.f = 0;
                    lVar2.h = j12;
                    i15 = i10;
                    i14 = i11;
                }
            }
            int i312 = i10 - r10;
            long j112 = this.g - i312;
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
            lVar22.e = i17;
            lVar22.d = false;
            lVar22.b = i17 != 182 || i17 == 179;
            lVar22.c = i17 != 182;
            lVar22.f = 0;
            lVar22.h = j122;
            i15 = i10;
            i14 = i11;
        }
    }

    @Override // w3.h
    public final void c() {
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
        g0 g0Var = this.e;
        if (g0Var != null) {
            g0Var.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.h = e0Var.e;
        e0Var.b();
        m3.w C = mVar.C(e0Var.d, 2);
        this.i = C;
        this.f = new l(C);
        this.a.b(mVar, e0Var);
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
