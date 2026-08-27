package w3;

import f2.g0;
import h3.s0;
import h3.t0;
import java.util.Collections;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r implements h {
    public final a0 a;
    public String b;
    public m3.w c;
    public q d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final g0 g = new g0(32);
    public final g0 h = new g0(33);
    public final g0 i = new g0(34);
    public final g0 j = new g0(39);
    public final g0 k = new g0(40);
    public long m = -9223372036854775807L;
    public final d5.z n = new d5.z();

    public r(a0 a0Var) {
        this.a = a0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        q qVar = this.d;
        if (qVar.f) {
            int i12 = qVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                qVar.g = (bArr[i13] & 128) != 0;
                qVar.f = false;
            } else {
                qVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.i.a(i10, i11, bArr);
        }
        this.j.a(i10, i11, bArr);
        this.k.a(i10, i11, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0473 A[SYNTHETIC] */
    @Override // w3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d5.z zVar) {
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        long j10;
        int i13;
        boolean e9;
        g0 g0Var;
        int i14;
        g0 g0Var2;
        boolean z10;
        boolean z11;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        float f10;
        int i18;
        int i19;
        int i20;
        d5.z zVar2 = zVar;
        d5.a.j(this.c);
        int i21 = d5.g0.a;
        while (zVar2.a() > 0) {
            int i22 = zVar2.b;
            int i23 = zVar2.c;
            byte[] bArr2 = zVar2.a;
            this.l += zVar2.a();
            this.c.a(zVar2.a(), zVar2);
            while (i22 < i23) {
                int r10 = d5.a.r(bArr2, i22, i23, this.f);
                if (r10 == i23) {
                    a(i22, i23, bArr2);
                    return;
                }
                int i24 = r10 + 3;
                int i25 = (bArr2[i24] & 126) >> 1;
                int i26 = r10 - i22;
                if (i26 > 0) {
                    a(i22, r10, bArr2);
                }
                int i27 = i23 - r10;
                long j11 = this.l - i27;
                int i28 = i26 < 0 ? -i26 : 0;
                long j12 = this.m;
                m3.w[] wVarArr = this.a.c;
                q qVar = this.d;
                boolean z12 = this.e;
                if (qVar.j && qVar.g) {
                    qVar.m = qVar.c;
                    qVar.j = false;
                } else if (qVar.h || qVar.g) {
                    if (z12 && qVar.i) {
                        long j13 = qVar.b;
                        int i29 = i27 + ((int) (j11 - j13));
                        long j14 = qVar.l;
                        if (j14 != -9223372036854775807L) {
                            qVar.a.e(j14, qVar.m ? 1 : 0, (int) (j13 - qVar.k), i29, null);
                        }
                    }
                    qVar.k = qVar.b;
                    qVar.l = qVar.e;
                    qVar.m = qVar.c;
                    qVar.i = true;
                }
                boolean z13 = this.e;
                g0 g0Var3 = this.g;
                g0 g0Var4 = this.h;
                g0 g0Var5 = this.i;
                if (!z13) {
                    g0Var3.e(i28);
                    g0Var4.e(i28);
                    g0Var5.e(i28);
                    if (g0Var3.d && g0Var4.d && g0Var5.d) {
                        m3.w wVar = this.c;
                        i10 = i23;
                        String str = this.b;
                        bArr = bArr2;
                        int i30 = g0Var3.e;
                        i11 = i24;
                        byte[] bArr3 = new byte[g0Var4.e + i30 + g0Var5.e];
                        i13 = i27;
                        i12 = i25;
                        System.arraycopy((byte[]) g0Var3.f, 0, bArr3, 0, i30);
                        j10 = j11;
                        System.arraycopy((byte[]) g0Var4.f, 0, bArr3, g0Var3.e, g0Var4.e);
                        System.arraycopy((byte[]) g0Var5.f, 0, bArr3, g0Var3.e + g0Var4.e, g0Var5.e);
                        d5.y yVar = new d5.y((byte[]) g0Var4.f, 0, g0Var4.e);
                        yVar.s(44);
                        int i31 = yVar.i(3);
                        yVar.r();
                        int i32 = yVar.i(2);
                        boolean h = yVar.h();
                        int i33 = yVar.i(5);
                        int i34 = 0;
                        for (int i35 = 0; i35 < 32; i35++) {
                            if (yVar.h()) {
                                i34 |= 1 << i35;
                            }
                        }
                        int[] iArr2 = new int[6];
                        for (int i36 = 0; i36 < 6; i36++) {
                            iArr2[i36] = yVar.i(8);
                        }
                        int i37 = yVar.i(8);
                        int i38 = 0;
                        for (int i39 = 0; i39 < i31; i39++) {
                            if (yVar.h()) {
                                i38 += 89;
                            }
                            if (yVar.h()) {
                                i38 += 8;
                            }
                        }
                        yVar.s(i38);
                        if (i31 > 0) {
                            yVar.s((8 - i31) * 2);
                        }
                        yVar.l();
                        int l10 = yVar.l();
                        if (l10 == 3) {
                            yVar.r();
                        }
                        int l11 = yVar.l();
                        int l12 = yVar.l();
                        if (yVar.h()) {
                            int l13 = yVar.l();
                            int l14 = yVar.l();
                            int l15 = yVar.l();
                            int l16 = yVar.l();
                            i15 = i37;
                            l11 -= (l13 + l14) * ((l10 == 1 || l10 == 2) ? 2 : 1);
                            l12 -= (l15 + l16) * (l10 == 1 ? 2 : 1);
                        } else {
                            i15 = i37;
                        }
                        yVar.l();
                        yVar.l();
                        int l17 = yVar.l();
                        for (int i40 = yVar.h() ? 0 : i31; i40 <= i31; i40++) {
                            yVar.l();
                            yVar.l();
                            yVar.l();
                        }
                        yVar.l();
                        yVar.l();
                        yVar.l();
                        yVar.l();
                        yVar.l();
                        yVar.l();
                        if (yVar.h() && yVar.h()) {
                            int i41 = 0;
                            for (int i42 = 4; i41 < i42; i42 = 4) {
                                int i43 = l17;
                                for (int i44 = 0; i44 < 6; i44 = i20 + (i41 == 3 ? 3 : 1)) {
                                    if (yVar.h()) {
                                        i20 = i44;
                                        int min = Math.min(64, 1 << ((i41 << 1) + 4));
                                        if (i41 > 1) {
                                            yVar.m();
                                        }
                                        for (int i45 = 0; i45 < min; i45++) {
                                            yVar.m();
                                        }
                                    } else {
                                        yVar.l();
                                        i20 = i44;
                                    }
                                }
                                i41++;
                                l17 = i43;
                            }
                        }
                        int i46 = l17;
                        yVar.s(2);
                        if (yVar.h()) {
                            yVar.s(8);
                            yVar.l();
                            yVar.l();
                            yVar.r();
                        }
                        int l18 = yVar.l();
                        int i47 = 0;
                        int i48 = 0;
                        boolean z14 = false;
                        while (i47 < l18) {
                            if (i47 != 0) {
                                z14 = yVar.h();
                            }
                            if (z14) {
                                yVar.r();
                                yVar.l();
                                i18 = l18;
                                for (int i49 = 0; i49 <= i48; i49++) {
                                    if (yVar.h()) {
                                        yVar.r();
                                    }
                                }
                                i19 = i47;
                            } else {
                                i18 = l18;
                                int l19 = yVar.l();
                                int l20 = yVar.l();
                                int i50 = l19 + l20;
                                i19 = i47;
                                for (int i51 = 0; i51 < l19; i51++) {
                                    yVar.l();
                                    yVar.r();
                                }
                                for (int i52 = 0; i52 < l20; i52++) {
                                    yVar.l();
                                    yVar.r();
                                }
                                i48 = i50;
                            }
                            i47 = i19 + 1;
                            l18 = i18;
                        }
                        if (yVar.h()) {
                            for (int i53 = 0; i53 < yVar.l(); i53++) {
                                yVar.s(i46 + 5);
                            }
                        }
                        yVar.s(2);
                        if (yVar.h()) {
                            if (yVar.h()) {
                                int i54 = yVar.i(8);
                                if (i54 == 255) {
                                    int i55 = yVar.i(16);
                                    int i56 = yVar.i(16);
                                    if (i55 != 0 && i56 != 0) {
                                        f10 = i55 / i56;
                                        if (yVar.h()) {
                                            yVar.r();
                                        }
                                        if (yVar.h()) {
                                            yVar.s(4);
                                            if (yVar.h()) {
                                                yVar.s(24);
                                            }
                                        }
                                        if (yVar.h()) {
                                            yVar.l();
                                            yVar.l();
                                        }
                                        yVar.r();
                                        if (yVar.h()) {
                                            l12 *= 2;
                                        }
                                        iArr = iArr2;
                                        i16 = l12;
                                        i17 = i15;
                                    }
                                } else {
                                    float[] fArr = d5.a.e;
                                    if (i54 < 17) {
                                        f10 = fArr[i54];
                                        if (yVar.h()) {
                                        }
                                        if (yVar.h()) {
                                        }
                                        if (yVar.h()) {
                                        }
                                        yVar.r();
                                        if (yVar.h()) {
                                        }
                                        iArr = iArr2;
                                        i16 = l12;
                                        i17 = i15;
                                    } else {
                                        com.google.android.recaptcha.internal.a.s(i54, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                                    }
                                }
                                g0 g0Var6 = this.j;
                                e9 = g0Var6.e(i28);
                                d5.z zVar3 = this.n;
                                if (e9) {
                                    zVar3.A(d5.a.J(g0Var6.e, (byte[]) g0Var6.f), (byte[]) g0Var6.f);
                                    zVar3.D(5);
                                    h7.p.a(j12, zVar3, wVarArr);
                                }
                                g0Var = this.k;
                                if (g0Var.e(i28)) {
                                    zVar3.A(d5.a.J(g0Var.e, (byte[]) g0Var.f), (byte[]) g0Var.f);
                                    zVar3.D(5);
                                    h7.p.a(j12, zVar3, wVarArr);
                                }
                                long j15 = this.m;
                                q qVar2 = this.d;
                                boolean z15 = this.e;
                                qVar2.g = false;
                                qVar2.h = false;
                                qVar2.e = j15;
                                qVar2.d = 0;
                                long j16 = j10;
                                qVar2.b = j16;
                                i14 = i12;
                                if (i14 >= 32 || i14 == 40) {
                                    g0Var2 = g0Var3;
                                    z10 = false;
                                } else {
                                    if (!qVar2.i || qVar2.j) {
                                        g0Var2 = g0Var3;
                                        z10 = false;
                                    } else {
                                        if (z15) {
                                            long j17 = qVar2.l;
                                            if (j17 != -9223372036854775807L) {
                                                g0Var2 = g0Var3;
                                                qVar2.a.e(j17, qVar2.m ? 1 : 0, (int) (j16 - qVar2.k), i13, null);
                                                z10 = false;
                                                qVar2.i = false;
                                            }
                                        }
                                        g0Var2 = g0Var3;
                                        z10 = false;
                                        qVar2.i = false;
                                    }
                                    if ((32 <= i14 && i14 <= 35) || i14 == 39) {
                                        qVar2.h = !qVar2.j;
                                        qVar2.j = true;
                                        z11 = i14 < 16 && i14 <= 21;
                                        qVar2.c = z11;
                                        if (!z11 || i14 <= 9) {
                                            z10 = true;
                                        }
                                        qVar2.f = z10;
                                        if (this.e) {
                                            g0Var2.g(i14);
                                            g0Var4.g(i14);
                                            g0Var5.g(i14);
                                        }
                                        g0Var6.g(i14);
                                        g0Var.g(i14);
                                        i23 = i10;
                                        bArr2 = bArr;
                                        i22 = i11;
                                    }
                                }
                                if (i14 < 16) {
                                }
                                qVar2.c = z11;
                                if (!z11) {
                                }
                                z10 = true;
                                qVar2.f = z10;
                                if (this.e) {
                                }
                                g0Var6.g(i14);
                                g0Var.g(i14);
                                i23 = i10;
                                bArr2 = bArr;
                                i22 = i11;
                            }
                            f10 = 1.0f;
                            if (yVar.h()) {
                            }
                            if (yVar.h()) {
                            }
                            if (yVar.h()) {
                            }
                            yVar.r();
                            if (yVar.h()) {
                            }
                            iArr = iArr2;
                            i16 = l12;
                            i17 = i15;
                        } else {
                            iArr = iArr2;
                            i16 = l12;
                            i17 = i15;
                            f10 = 1.0f;
                        }
                        String d = d5.a.d(i32, i33, i34, i17, h, iArr);
                        s0 s0Var = new s0();
                        s0Var.a = str;
                        s0Var.o = "video/hevc";
                        s0Var.h = d;
                        s0Var.t = l11;
                        s0Var.u = i16;
                        s0Var.x = f10;
                        s0Var.q = Collections.singletonList(bArr3);
                        wVar.c(new t0(s0Var));
                        this.e = true;
                        g0 g0Var62 = this.j;
                        e9 = g0Var62.e(i28);
                        d5.z zVar32 = this.n;
                        if (e9) {
                        }
                        g0Var = this.k;
                        if (g0Var.e(i28)) {
                        }
                        long j152 = this.m;
                        q qVar22 = this.d;
                        boolean z152 = this.e;
                        qVar22.g = false;
                        qVar22.h = false;
                        qVar22.e = j152;
                        qVar22.d = 0;
                        long j162 = j10;
                        qVar22.b = j162;
                        i14 = i12;
                        if (i14 >= 32) {
                        }
                        g0Var2 = g0Var3;
                        z10 = false;
                        if (i14 < 16) {
                        }
                        qVar22.c = z11;
                        if (!z11) {
                        }
                        z10 = true;
                        qVar22.f = z10;
                        if (this.e) {
                        }
                        g0Var62.g(i14);
                        g0Var.g(i14);
                        i23 = i10;
                        bArr2 = bArr;
                        i22 = i11;
                    }
                }
                i10 = i23;
                bArr = bArr2;
                i11 = i24;
                i12 = i25;
                j10 = j11;
                i13 = i27;
                g0 g0Var622 = this.j;
                e9 = g0Var622.e(i28);
                d5.z zVar322 = this.n;
                if (e9) {
                }
                g0Var = this.k;
                if (g0Var.e(i28)) {
                }
                long j1522 = this.m;
                q qVar222 = this.d;
                boolean z1522 = this.e;
                qVar222.g = false;
                qVar222.h = false;
                qVar222.e = j1522;
                qVar222.d = 0;
                long j1622 = j10;
                qVar222.b = j1622;
                i14 = i12;
                if (i14 >= 32) {
                }
                g0Var2 = g0Var3;
                z10 = false;
                if (i14 < 16) {
                }
                qVar222.c = z11;
                if (!z11) {
                }
                z10 = true;
                qVar222.f = z10;
                if (this.e) {
                }
                g0Var622.g(i14);
                g0Var.g(i14);
                i23 = i10;
                bArr2 = bArr;
                i22 = i11;
            }
            zVar2 = zVar;
        }
    }

    @Override // w3.h
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        d5.a.m(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        q qVar = this.d;
        if (qVar != null) {
            qVar.f = false;
            qVar.g = false;
            qVar.h = false;
            qVar.i = false;
            qVar.j = false;
        }
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.b = e0Var.e;
        e0Var.b();
        m3.w C = mVar.C(e0Var.d, 2);
        this.c = C;
        this.d = new q(C);
        this.a.b(mVar, e0Var);
    }

    @Override // w3.h
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.m = j10;
        }
    }

    @Override // w3.h
    public final void d() {
    }
}
