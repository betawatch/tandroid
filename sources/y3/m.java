package y3;

import f2.f0;
import j3.s0;
import j3.t0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m implements h {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final a0 a;
    public final f5.w b;
    public final boolean[] c = new boolean[4];
    public final k d;
    public final f0 e;
    public l f;
    public long g;
    public String h;
    public o3.w i;
    public boolean j;
    public long k;

    public m(a0 a0Var) {
        this.a = a0Var;
        k kVar = new k();
        kVar.e = new byte[128];
        this.d = kVar;
        this.k = -9223372036854775807L;
        this.e = new f0(178);
        this.b = new f5.w();
    }

    @Override // y3.h
    public final void a() {
        f5.a.m(this.c);
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
        f0 f0Var = this.e;
        if (f0Var != null) {
            f0Var.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    @Override // y3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(f5.w wVar) {
        int i10;
        int i11;
        l lVar;
        long j10;
        int i12;
        int i13;
        float f9;
        f5.a.j(this.f);
        f5.a.j(this.i);
        int i14 = wVar.b;
        int i15 = wVar.c;
        byte[] bArr = wVar.a;
        this.g += wVar.a();
        this.i.e(wVar.a(), wVar);
        while (true) {
            int r6 = f5.a.r(bArr, i14, i15, this.c);
            k kVar = this.d;
            f0 f0Var = this.e;
            if (r6 == i15) {
                if (!this.j) {
                    kVar.a(i14, i15, bArr);
                }
                this.f.a(i14, i15, bArr);
                if (f0Var != null) {
                    f0Var.a(i14, i15, bArr);
                    return;
                }
                return;
            }
            int i16 = r6 + 3;
            byte b10 = wVar.a[i16];
            int i17 = b10 & 255;
            int i18 = r6 - i14;
            if (this.j) {
                i10 = i15;
                i11 = i16;
            } else {
                if (i18 > 0) {
                    kVar.a(i14, r6, bArr);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = kVar.b;
                if (i20 != 0) {
                    i10 = i15;
                    if (i20 == 1) {
                        i11 = i16;
                        i13 = 0;
                        if (i17 != 181) {
                            f5.a.K("H263Reader", "Unexpected start code value");
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
                                o3.w wVar2 = this.i;
                                int i21 = kVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(kVar.e, kVar.c);
                                f5.v vVar = new f5.v(copyOf, copyOf.length);
                                vVar.t(i21);
                                vVar.t(4);
                                vVar.r();
                                vVar.s(8);
                                if (vVar.h()) {
                                    vVar.s(4);
                                    vVar.s(3);
                                }
                                int i22 = vVar.i(4);
                                if (i22 == 15) {
                                    int i23 = vVar.i(8);
                                    int i24 = vVar.i(8);
                                    if (i24 == 0) {
                                        f5.a.K("H263Reader", "Invalid aspect ratio");
                                        f9 = 1.0f;
                                        if (vVar.h()) {
                                            vVar.s(2);
                                            vVar.s(1);
                                            if (vVar.h()) {
                                                vVar.s(15);
                                                vVar.r();
                                                vVar.s(15);
                                                vVar.r();
                                                vVar.s(15);
                                                vVar.r();
                                                vVar.s(3);
                                                vVar.s(11);
                                                vVar.r();
                                                vVar.s(15);
                                                vVar.r();
                                            }
                                        }
                                        if (vVar.i(2) != 0) {
                                            f5.a.K("H263Reader", "Unhandled video object layer shape");
                                        }
                                        vVar.r();
                                        int i25 = vVar.i(16);
                                        vVar.r();
                                        if (vVar.h()) {
                                            if (i25 == 0) {
                                                f5.a.K("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i26 = 0;
                                                for (int i27 = i25 - 1; i27 > 0; i27 >>= 1) {
                                                    i26++;
                                                }
                                                vVar.s(i26);
                                            }
                                        }
                                        vVar.r();
                                        int i28 = vVar.i(13);
                                        vVar.r();
                                        int i29 = vVar.i(13);
                                        vVar.r();
                                        vVar.r();
                                        s0 s0Var = new s0();
                                        s0Var.a = str;
                                        s0Var.o = "video/mp4v-es";
                                        s0Var.t = i28;
                                        s0Var.u = i29;
                                        s0Var.x = f9;
                                        s0Var.q = Collections.singletonList(copyOf);
                                        wVar2.b(new t0(s0Var));
                                        this.j = true;
                                    } else {
                                        f9 = i23 / i24;
                                        if (vVar.h()) {
                                        }
                                        if (vVar.i(2) != 0) {
                                        }
                                        vVar.r();
                                        int i252 = vVar.i(16);
                                        vVar.r();
                                        if (vVar.h()) {
                                        }
                                        vVar.r();
                                        int i282 = vVar.i(13);
                                        vVar.r();
                                        int i292 = vVar.i(13);
                                        vVar.r();
                                        vVar.r();
                                        s0 s0Var2 = new s0();
                                        s0Var2.a = str;
                                        s0Var2.o = "video/mp4v-es";
                                        s0Var2.t = i282;
                                        s0Var2.u = i292;
                                        s0Var2.x = f9;
                                        s0Var2.q = Collections.singletonList(copyOf);
                                        wVar2.b(new t0(s0Var2));
                                        this.j = true;
                                    }
                                } else if (i22 < 7) {
                                    f9 = l[i22];
                                    if (vVar.h()) {
                                    }
                                    if (vVar.i(2) != 0) {
                                    }
                                    vVar.r();
                                    int i2522 = vVar.i(16);
                                    vVar.r();
                                    if (vVar.h()) {
                                    }
                                    vVar.r();
                                    int i2822 = vVar.i(13);
                                    vVar.r();
                                    int i2922 = vVar.i(13);
                                    vVar.r();
                                    vVar.r();
                                    s0 s0Var22 = new s0();
                                    s0Var22.a = str;
                                    s0Var22.o = "video/mp4v-es";
                                    s0Var22.t = i2822;
                                    s0Var22.u = i2922;
                                    s0Var22.x = f9;
                                    s0Var22.q = Collections.singletonList(copyOf);
                                    wVar2.b(new t0(s0Var22));
                                    this.j = true;
                                } else {
                                    f5.a.K("H263Reader", "Invalid aspect ratio");
                                    f9 = 1.0f;
                                    if (vVar.h()) {
                                    }
                                    if (vVar.i(2) != 0) {
                                    }
                                    vVar.r();
                                    int i25222 = vVar.i(16);
                                    vVar.r();
                                    if (vVar.h()) {
                                    }
                                    vVar.r();
                                    int i28222 = vVar.i(13);
                                    vVar.r();
                                    int i29222 = vVar.i(13);
                                    vVar.r();
                                    vVar.r();
                                    s0 s0Var222 = new s0();
                                    s0Var222.a = str;
                                    s0Var222.o = "video/mp4v-es";
                                    s0Var222.t = i28222;
                                    s0Var222.u = i29222;
                                    s0Var222.x = f9;
                                    s0Var222.q = Collections.singletonList(copyOf);
                                    wVar2.b(new t0(s0Var222));
                                    this.j = true;
                                }
                            } else {
                                i13 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            f5.a.K("H263Reader", "Unexpected start code value");
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
                            f5.a.K("H263Reader", "Unexpected start code value");
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
            this.f.a(i14, r6, bArr);
            if (f0Var != null) {
                if (i18 > 0) {
                    f0Var.a(i14, r6, bArr);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (f0Var.e(i12)) {
                    int J = f5.a.J(f0Var.e, (byte[]) f0Var.f);
                    int i30 = f5.d0.a;
                    byte[] bArr2 = (byte[]) f0Var.f;
                    f5.w wVar3 = this.b;
                    wVar3.A(J, bArr2);
                    this.a.a(this.k, wVar3);
                }
                if (i17 == 178) {
                    if (wVar.a[r6 + 2] == 1) {
                        f0Var.g(i17);
                    }
                    int i31 = i10 - r6;
                    long j11 = this.g - i31;
                    lVar = this.f;
                    boolean z10 = this.j;
                    if (lVar.e == 182 && z10 && lVar.b) {
                        j10 = lVar.h;
                        if (j10 != -9223372036854775807L) {
                            lVar.a.c(j10, lVar.d ? 1 : 0, (int) (j11 - lVar.g), i31, null);
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
            int i312 = i10 - r6;
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

    @Override // y3.h
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.h = d0Var.e;
        d0Var.b();
        o3.w Z1 = mVar.Z1(d0Var.d, 2);
        this.i = Z1;
        this.f = new l(Z1);
        this.a.b(mVar, d0Var);
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
