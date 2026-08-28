package w3;

import d5.f0;
import f2.i0;
import h3.s0;
import h3.t0;
import java.util.Collections;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r implements h {
    public final a0 a;
    public String b;
    public m3.w c;
    public q d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final i0 g = new i0(32);
    public final i0 h = new i0(33);
    public final i0 i = new i0(34);
    public final i0 j = new i0(39);
    public final i0 k = new i0(40);
    public long m = -9223372036854775807L;
    public final d5.y n = new d5.y();

    public r(a0 a0Var) {
        this.a = a0Var;
    }

    public final void a(int i9, int i10, byte[] bArr) {
        q qVar = this.d;
        if (qVar.f) {
            int i11 = qVar.d;
            int i12 = (i9 + 2) - i11;
            if (i12 < i10) {
                qVar.g = (bArr[i12] & 128) != 0;
                qVar.f = false;
            } else {
                qVar.d = (i10 - i9) + i11;
            }
        }
        if (!this.e) {
            this.g.a(i9, i10, bArr);
            this.h.a(i9, i10, bArr);
            this.i.a(i9, i10, bArr);
        }
        this.j.a(i9, i10, bArr);
        this.k.a(i9, i10, bArr);
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
    public final void g(d5.y yVar) {
        int i9;
        byte[] bArr;
        int i10;
        int i11;
        long j10;
        int i12;
        boolean e10;
        i0 i0Var;
        int i13;
        i0 i0Var2;
        boolean z10;
        boolean z11;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        float f10;
        int i17;
        int i18;
        int i19;
        d5.y yVar2 = yVar;
        d5.a.j(this.c);
        int i20 = f0.a;
        while (yVar2.a() > 0) {
            int i21 = yVar2.b;
            int i22 = yVar2.c;
            byte[] bArr2 = yVar2.a;
            this.l += yVar2.a();
            this.c.a(yVar2.a(), yVar2);
            while (i21 < i22) {
                int r10 = d5.a.r(bArr2, i21, i22, this.f);
                if (r10 == i22) {
                    a(i21, i22, bArr2);
                    return;
                }
                int i23 = r10 + 3;
                int i24 = (bArr2[i23] & 126) >> 1;
                int i25 = r10 - i21;
                if (i25 > 0) {
                    a(i21, r10, bArr2);
                }
                int i26 = i22 - r10;
                long j11 = this.l - i26;
                int i27 = i25 < 0 ? -i25 : 0;
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
                        int i28 = i26 + ((int) (j11 - j13));
                        long j14 = qVar.l;
                        if (j14 != -9223372036854775807L) {
                            qVar.a.e(j14, qVar.m ? 1 : 0, (int) (j13 - qVar.k), i28, null);
                        }
                    }
                    qVar.k = qVar.b;
                    qVar.l = qVar.e;
                    qVar.m = qVar.c;
                    qVar.i = true;
                }
                boolean z13 = this.e;
                i0 i0Var3 = this.g;
                i0 i0Var4 = this.h;
                i0 i0Var5 = this.i;
                if (!z13) {
                    i0Var3.e(i27);
                    i0Var4.e(i27);
                    i0Var5.e(i27);
                    if (i0Var3.d && i0Var4.d && i0Var5.d) {
                        m3.w wVar = this.c;
                        i9 = i22;
                        String str = this.b;
                        bArr = bArr2;
                        int i29 = i0Var3.e;
                        i10 = i23;
                        byte[] bArr3 = new byte[i0Var4.e + i29 + i0Var5.e];
                        i12 = i26;
                        i11 = i24;
                        System.arraycopy((byte[]) i0Var3.f, 0, bArr3, 0, i29);
                        j10 = j11;
                        System.arraycopy((byte[]) i0Var4.f, 0, bArr3, i0Var3.e, i0Var4.e);
                        System.arraycopy((byte[]) i0Var5.f, 0, bArr3, i0Var3.e + i0Var4.e, i0Var5.e);
                        d5.x xVar = new d5.x((byte[]) i0Var4.f, 0, i0Var4.e);
                        xVar.s(44);
                        int i30 = xVar.i(3);
                        xVar.r();
                        int i31 = xVar.i(2);
                        boolean h = xVar.h();
                        int i32 = xVar.i(5);
                        int i33 = 0;
                        for (int i34 = 0; i34 < 32; i34++) {
                            if (xVar.h()) {
                                i33 |= 1 << i34;
                            }
                        }
                        int[] iArr2 = new int[6];
                        for (int i35 = 0; i35 < 6; i35++) {
                            iArr2[i35] = xVar.i(8);
                        }
                        int i36 = xVar.i(8);
                        int i37 = 0;
                        for (int i38 = 0; i38 < i30; i38++) {
                            if (xVar.h()) {
                                i37 += 89;
                            }
                            if (xVar.h()) {
                                i37 += 8;
                            }
                        }
                        xVar.s(i37);
                        if (i30 > 0) {
                            xVar.s((8 - i30) * 2);
                        }
                        xVar.l();
                        int l10 = xVar.l();
                        if (l10 == 3) {
                            xVar.r();
                        }
                        int l11 = xVar.l();
                        int l12 = xVar.l();
                        if (xVar.h()) {
                            int l13 = xVar.l();
                            int l14 = xVar.l();
                            int l15 = xVar.l();
                            int l16 = xVar.l();
                            i14 = i36;
                            l11 -= (l13 + l14) * ((l10 == 1 || l10 == 2) ? 2 : 1);
                            l12 -= (l15 + l16) * (l10 == 1 ? 2 : 1);
                        } else {
                            i14 = i36;
                        }
                        xVar.l();
                        xVar.l();
                        int l17 = xVar.l();
                        for (int i39 = xVar.h() ? 0 : i30; i39 <= i30; i39++) {
                            xVar.l();
                            xVar.l();
                            xVar.l();
                        }
                        xVar.l();
                        xVar.l();
                        xVar.l();
                        xVar.l();
                        xVar.l();
                        xVar.l();
                        if (xVar.h() && xVar.h()) {
                            int i40 = 0;
                            for (int i41 = 4; i40 < i41; i41 = 4) {
                                int i42 = l17;
                                for (int i43 = 0; i43 < 6; i43 = i19 + (i40 == 3 ? 3 : 1)) {
                                    if (xVar.h()) {
                                        i19 = i43;
                                        int min = Math.min(64, 1 << ((i40 << 1) + 4));
                                        if (i40 > 1) {
                                            xVar.m();
                                        }
                                        for (int i44 = 0; i44 < min; i44++) {
                                            xVar.m();
                                        }
                                    } else {
                                        xVar.l();
                                        i19 = i43;
                                    }
                                }
                                i40++;
                                l17 = i42;
                            }
                        }
                        int i45 = l17;
                        xVar.s(2);
                        if (xVar.h()) {
                            xVar.s(8);
                            xVar.l();
                            xVar.l();
                            xVar.r();
                        }
                        int l18 = xVar.l();
                        int i46 = 0;
                        int i47 = 0;
                        boolean z14 = false;
                        while (i46 < l18) {
                            if (i46 != 0) {
                                z14 = xVar.h();
                            }
                            if (z14) {
                                xVar.r();
                                xVar.l();
                                i17 = l18;
                                for (int i48 = 0; i48 <= i47; i48++) {
                                    if (xVar.h()) {
                                        xVar.r();
                                    }
                                }
                                i18 = i46;
                            } else {
                                i17 = l18;
                                int l19 = xVar.l();
                                int l20 = xVar.l();
                                int i49 = l19 + l20;
                                i18 = i46;
                                for (int i50 = 0; i50 < l19; i50++) {
                                    xVar.l();
                                    xVar.r();
                                }
                                for (int i51 = 0; i51 < l20; i51++) {
                                    xVar.l();
                                    xVar.r();
                                }
                                i47 = i49;
                            }
                            i46 = i18 + 1;
                            l18 = i17;
                        }
                        if (xVar.h()) {
                            for (int i52 = 0; i52 < xVar.l(); i52++) {
                                xVar.s(i45 + 5);
                            }
                        }
                        xVar.s(2);
                        if (xVar.h()) {
                            if (xVar.h()) {
                                int i53 = xVar.i(8);
                                if (i53 == 255) {
                                    int i54 = xVar.i(16);
                                    int i55 = xVar.i(16);
                                    if (i54 != 0 && i55 != 0) {
                                        f10 = i54 / i55;
                                        if (xVar.h()) {
                                            xVar.r();
                                        }
                                        if (xVar.h()) {
                                            xVar.s(4);
                                            if (xVar.h()) {
                                                xVar.s(24);
                                            }
                                        }
                                        if (xVar.h()) {
                                            xVar.l();
                                            xVar.l();
                                        }
                                        xVar.r();
                                        if (xVar.h()) {
                                            l12 *= 2;
                                        }
                                        iArr = iArr2;
                                        i15 = l12;
                                        i16 = i14;
                                    }
                                } else {
                                    float[] fArr = d5.a.e;
                                    if (i53 < 17) {
                                        f10 = fArr[i53];
                                        if (xVar.h()) {
                                        }
                                        if (xVar.h()) {
                                        }
                                        if (xVar.h()) {
                                        }
                                        xVar.r();
                                        if (xVar.h()) {
                                        }
                                        iArr = iArr2;
                                        i15 = l12;
                                        i16 = i14;
                                    } else {
                                        e2.c.t(i53, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                                    }
                                }
                                i0 i0Var6 = this.j;
                                e10 = i0Var6.e(i27);
                                d5.y yVar3 = this.n;
                                if (e10) {
                                    yVar3.A(d5.a.J(i0Var6.e, (byte[]) i0Var6.f), (byte[]) i0Var6.f);
                                    yVar3.D(5);
                                    g7.p.a(j12, yVar3, wVarArr);
                                }
                                i0Var = this.k;
                                if (i0Var.e(i27)) {
                                    yVar3.A(d5.a.J(i0Var.e, (byte[]) i0Var.f), (byte[]) i0Var.f);
                                    yVar3.D(5);
                                    g7.p.a(j12, yVar3, wVarArr);
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
                                i13 = i11;
                                if (i13 >= 32 || i13 == 40) {
                                    i0Var2 = i0Var3;
                                    z10 = false;
                                } else {
                                    if (!qVar2.i || qVar2.j) {
                                        i0Var2 = i0Var3;
                                        z10 = false;
                                    } else {
                                        if (z15) {
                                            long j17 = qVar2.l;
                                            if (j17 != -9223372036854775807L) {
                                                i0Var2 = i0Var3;
                                                qVar2.a.e(j17, qVar2.m ? 1 : 0, (int) (j16 - qVar2.k), i12, null);
                                                z10 = false;
                                                qVar2.i = false;
                                            }
                                        }
                                        i0Var2 = i0Var3;
                                        z10 = false;
                                        qVar2.i = false;
                                    }
                                    if ((32 <= i13 && i13 <= 35) || i13 == 39) {
                                        qVar2.h = !qVar2.j;
                                        qVar2.j = true;
                                        z11 = i13 < 16 && i13 <= 21;
                                        qVar2.c = z11;
                                        if (!z11 || i13 <= 9) {
                                            z10 = true;
                                        }
                                        qVar2.f = z10;
                                        if (this.e) {
                                            i0Var2.g(i13);
                                            i0Var4.g(i13);
                                            i0Var5.g(i13);
                                        }
                                        i0Var6.g(i13);
                                        i0Var.g(i13);
                                        i22 = i9;
                                        bArr2 = bArr;
                                        i21 = i10;
                                    }
                                }
                                if (i13 < 16) {
                                }
                                qVar2.c = z11;
                                if (!z11) {
                                }
                                z10 = true;
                                qVar2.f = z10;
                                if (this.e) {
                                }
                                i0Var6.g(i13);
                                i0Var.g(i13);
                                i22 = i9;
                                bArr2 = bArr;
                                i21 = i10;
                            }
                            f10 = 1.0f;
                            if (xVar.h()) {
                            }
                            if (xVar.h()) {
                            }
                            if (xVar.h()) {
                            }
                            xVar.r();
                            if (xVar.h()) {
                            }
                            iArr = iArr2;
                            i15 = l12;
                            i16 = i14;
                        } else {
                            iArr = iArr2;
                            i15 = l12;
                            i16 = i14;
                            f10 = 1.0f;
                        }
                        String d = d5.a.d(i31, i32, i33, i16, h, iArr);
                        s0 s0Var = new s0();
                        s0Var.a = str;
                        s0Var.o = "video/hevc";
                        s0Var.h = d;
                        s0Var.t = l11;
                        s0Var.u = i15;
                        s0Var.x = f10;
                        s0Var.q = Collections.singletonList(bArr3);
                        wVar.c(new t0(s0Var));
                        this.e = true;
                        i0 i0Var62 = this.j;
                        e10 = i0Var62.e(i27);
                        d5.y yVar32 = this.n;
                        if (e10) {
                        }
                        i0Var = this.k;
                        if (i0Var.e(i27)) {
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
                        i13 = i11;
                        if (i13 >= 32) {
                        }
                        i0Var2 = i0Var3;
                        z10 = false;
                        if (i13 < 16) {
                        }
                        qVar22.c = z11;
                        if (!z11) {
                        }
                        z10 = true;
                        qVar22.f = z10;
                        if (this.e) {
                        }
                        i0Var62.g(i13);
                        i0Var.g(i13);
                        i22 = i9;
                        bArr2 = bArr;
                        i21 = i10;
                    }
                }
                i9 = i22;
                bArr = bArr2;
                i10 = i23;
                i11 = i24;
                j10 = j11;
                i12 = i26;
                i0 i0Var622 = this.j;
                e10 = i0Var622.e(i27);
                d5.y yVar322 = this.n;
                if (e10) {
                }
                i0Var = this.k;
                if (i0Var.e(i27)) {
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
                i13 = i11;
                if (i13 >= 32) {
                }
                i0Var2 = i0Var3;
                z10 = false;
                if (i13 < 16) {
                }
                qVar222.c = z11;
                if (!z11) {
                }
                z10 = true;
                qVar222.f = z10;
                if (this.e) {
                }
                i0Var622.g(i13);
                i0Var.g(i13);
                i22 = i9;
                bArr2 = bArr;
                i21 = i10;
            }
            yVar2 = yVar;
        }
    }

    @Override // w3.h
    public final void h() {
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
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.b = d0Var.e;
        d0Var.b();
        m3.w I = mVar.I(d0Var.d, 2);
        this.c = I;
        this.d = new q(I);
        this.a.b(mVar, d0Var);
    }

    @Override // w3.h
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.m = j10;
        }
    }

    @Override // w3.h
    public final void i() {
    }
}
