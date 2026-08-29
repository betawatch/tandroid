package y3;

import f2.f0;
import i7.g0;
import j3.s0;
import j3.t0;
import java.util.Collections;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r implements h {
    public final a0 a;
    public String b;
    public o3.w c;
    public q d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final f0 g = new f0(32);
    public final f0 h = new f0(33);
    public final f0 i = new f0(34);
    public final f0 j = new f0(39);
    public final f0 k = new f0(40);
    public long m = -9223372036854775807L;
    public final f5.w n = new f5.w();

    public r(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // y3.h
    public final void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        f5.a.m(this.f);
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

    public final void b(int i10, int i11, byte[] bArr) {
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
    @Override // y3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(f5.w wVar) {
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        long j10;
        int i13;
        boolean e10;
        f0 f0Var;
        int i14;
        f0 f0Var2;
        boolean z10;
        boolean z11;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        float f9;
        int i18;
        int i19;
        int i20;
        f5.w wVar2 = wVar;
        f5.a.j(this.c);
        int i21 = f5.d0.a;
        while (wVar2.a() > 0) {
            int i22 = wVar2.b;
            int i23 = wVar2.c;
            byte[] bArr2 = wVar2.a;
            this.l += wVar2.a();
            this.c.e(wVar2.a(), wVar2);
            while (i22 < i23) {
                int r6 = f5.a.r(bArr2, i22, i23, this.f);
                if (r6 == i23) {
                    b(i22, i23, bArr2);
                    return;
                }
                int i24 = r6 + 3;
                int i25 = (bArr2[i24] & 126) >> 1;
                int i26 = r6 - i22;
                if (i26 > 0) {
                    b(i22, r6, bArr2);
                }
                int i27 = i23 - r6;
                long j11 = this.l - i27;
                int i28 = i26 < 0 ? -i26 : 0;
                long j12 = this.m;
                o3.w[] wVarArr = this.a.c;
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
                            qVar.a.c(j14, qVar.m ? 1 : 0, (int) (j13 - qVar.k), i29, null);
                        }
                    }
                    qVar.k = qVar.b;
                    qVar.l = qVar.e;
                    qVar.m = qVar.c;
                    qVar.i = true;
                }
                boolean z13 = this.e;
                f0 f0Var3 = this.g;
                f0 f0Var4 = this.h;
                f0 f0Var5 = this.i;
                if (!z13) {
                    f0Var3.e(i28);
                    f0Var4.e(i28);
                    f0Var5.e(i28);
                    if (f0Var3.d && f0Var4.d && f0Var5.d) {
                        o3.w wVar3 = this.c;
                        i10 = i23;
                        String str = this.b;
                        bArr = bArr2;
                        int i30 = f0Var3.e;
                        i11 = i24;
                        byte[] bArr3 = new byte[f0Var4.e + i30 + f0Var5.e];
                        i13 = i27;
                        i12 = i25;
                        System.arraycopy((byte[]) f0Var3.f, 0, bArr3, 0, i30);
                        j10 = j11;
                        System.arraycopy((byte[]) f0Var4.f, 0, bArr3, f0Var3.e, f0Var4.e);
                        System.arraycopy((byte[]) f0Var5.f, 0, bArr3, f0Var3.e + f0Var4.e, f0Var5.e);
                        f5.v vVar = new f5.v((byte[]) f0Var4.f, 0, f0Var4.e);
                        vVar.s(44);
                        int i31 = vVar.i(3);
                        vVar.r();
                        int i32 = vVar.i(2);
                        boolean h = vVar.h();
                        int i33 = vVar.i(5);
                        int i34 = 0;
                        for (int i35 = 0; i35 < 32; i35++) {
                            if (vVar.h()) {
                                i34 |= 1 << i35;
                            }
                        }
                        int[] iArr2 = new int[6];
                        for (int i36 = 0; i36 < 6; i36++) {
                            iArr2[i36] = vVar.i(8);
                        }
                        int i37 = vVar.i(8);
                        int i38 = 0;
                        for (int i39 = 0; i39 < i31; i39++) {
                            if (vVar.h()) {
                                i38 += 89;
                            }
                            if (vVar.h()) {
                                i38 += 8;
                            }
                        }
                        vVar.s(i38);
                        if (i31 > 0) {
                            vVar.s((8 - i31) * 2);
                        }
                        vVar.l();
                        int l10 = vVar.l();
                        if (l10 == 3) {
                            vVar.r();
                        }
                        int l11 = vVar.l();
                        int l12 = vVar.l();
                        if (vVar.h()) {
                            int l13 = vVar.l();
                            int l14 = vVar.l();
                            int l15 = vVar.l();
                            int l16 = vVar.l();
                            i15 = i37;
                            l11 -= (l13 + l14) * ((l10 == 1 || l10 == 2) ? 2 : 1);
                            l12 -= (l15 + l16) * (l10 == 1 ? 2 : 1);
                        } else {
                            i15 = i37;
                        }
                        vVar.l();
                        vVar.l();
                        int l17 = vVar.l();
                        for (int i40 = vVar.h() ? 0 : i31; i40 <= i31; i40++) {
                            vVar.l();
                            vVar.l();
                            vVar.l();
                        }
                        vVar.l();
                        vVar.l();
                        vVar.l();
                        vVar.l();
                        vVar.l();
                        vVar.l();
                        if (vVar.h() && vVar.h()) {
                            int i41 = 0;
                            for (int i42 = 4; i41 < i42; i42 = 4) {
                                int i43 = l17;
                                for (int i44 = 0; i44 < 6; i44 = i20 + (i41 == 3 ? 3 : 1)) {
                                    if (vVar.h()) {
                                        i20 = i44;
                                        int min = Math.min(64, 1 << ((i41 << 1) + 4));
                                        if (i41 > 1) {
                                            vVar.m();
                                        }
                                        for (int i45 = 0; i45 < min; i45++) {
                                            vVar.m();
                                        }
                                    } else {
                                        vVar.l();
                                        i20 = i44;
                                    }
                                }
                                i41++;
                                l17 = i43;
                            }
                        }
                        int i46 = l17;
                        vVar.s(2);
                        if (vVar.h()) {
                            vVar.s(8);
                            vVar.l();
                            vVar.l();
                            vVar.r();
                        }
                        int l18 = vVar.l();
                        int i47 = 0;
                        int i48 = 0;
                        boolean z14 = false;
                        while (i47 < l18) {
                            if (i47 != 0) {
                                z14 = vVar.h();
                            }
                            if (z14) {
                                vVar.r();
                                vVar.l();
                                i18 = l18;
                                for (int i49 = 0; i49 <= i48; i49++) {
                                    if (vVar.h()) {
                                        vVar.r();
                                    }
                                }
                                i19 = i47;
                            } else {
                                i18 = l18;
                                int l19 = vVar.l();
                                int l20 = vVar.l();
                                int i50 = l19 + l20;
                                i19 = i47;
                                for (int i51 = 0; i51 < l19; i51++) {
                                    vVar.l();
                                    vVar.r();
                                }
                                for (int i52 = 0; i52 < l20; i52++) {
                                    vVar.l();
                                    vVar.r();
                                }
                                i48 = i50;
                            }
                            i47 = i19 + 1;
                            l18 = i18;
                        }
                        if (vVar.h()) {
                            for (int i53 = 0; i53 < vVar.l(); i53++) {
                                vVar.s(i46 + 5);
                            }
                        }
                        vVar.s(2);
                        if (vVar.h()) {
                            if (vVar.h()) {
                                int i54 = vVar.i(8);
                                if (i54 == 255) {
                                    int i55 = vVar.i(16);
                                    int i56 = vVar.i(16);
                                    if (i55 != 0 && i56 != 0) {
                                        f9 = i55 / i56;
                                        if (vVar.h()) {
                                            vVar.r();
                                        }
                                        if (vVar.h()) {
                                            vVar.s(4);
                                            if (vVar.h()) {
                                                vVar.s(24);
                                            }
                                        }
                                        if (vVar.h()) {
                                            vVar.l();
                                            vVar.l();
                                        }
                                        vVar.r();
                                        if (vVar.h()) {
                                            l12 *= 2;
                                        }
                                        iArr = iArr2;
                                        i16 = l12;
                                        i17 = i15;
                                    }
                                } else {
                                    float[] fArr = f5.a.e;
                                    if (i54 < 17) {
                                        f9 = fArr[i54];
                                        if (vVar.h()) {
                                        }
                                        if (vVar.h()) {
                                        }
                                        if (vVar.h()) {
                                        }
                                        vVar.r();
                                        if (vVar.h()) {
                                        }
                                        iArr = iArr2;
                                        i16 = l12;
                                        i17 = i15;
                                    } else {
                                        com.google.android.recaptcha.internal.a.s(i54, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                                    }
                                }
                                f0 f0Var6 = this.j;
                                e10 = f0Var6.e(i28);
                                f5.w wVar4 = this.n;
                                if (e10) {
                                    wVar4.A(f5.a.J(f0Var6.e, (byte[]) f0Var6.f), (byte[]) f0Var6.f);
                                    wVar4.D(5);
                                    g0.a(j12, wVar4, wVarArr);
                                }
                                f0Var = this.k;
                                if (f0Var.e(i28)) {
                                    wVar4.A(f5.a.J(f0Var.e, (byte[]) f0Var.f), (byte[]) f0Var.f);
                                    wVar4.D(5);
                                    g0.a(j12, wVar4, wVarArr);
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
                                    f0Var2 = f0Var3;
                                    z10 = false;
                                } else {
                                    if (!qVar2.i || qVar2.j) {
                                        f0Var2 = f0Var3;
                                        z10 = false;
                                    } else {
                                        if (z15) {
                                            long j17 = qVar2.l;
                                            if (j17 != -9223372036854775807L) {
                                                f0Var2 = f0Var3;
                                                qVar2.a.c(j17, qVar2.m ? 1 : 0, (int) (j16 - qVar2.k), i13, null);
                                                z10 = false;
                                                qVar2.i = false;
                                            }
                                        }
                                        f0Var2 = f0Var3;
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
                                            f0Var2.g(i14);
                                            f0Var4.g(i14);
                                            f0Var5.g(i14);
                                        }
                                        f0Var6.g(i14);
                                        f0Var.g(i14);
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
                                f0Var6.g(i14);
                                f0Var.g(i14);
                                i23 = i10;
                                bArr2 = bArr;
                                i22 = i11;
                            }
                            f9 = 1.0f;
                            if (vVar.h()) {
                            }
                            if (vVar.h()) {
                            }
                            if (vVar.h()) {
                            }
                            vVar.r();
                            if (vVar.h()) {
                            }
                            iArr = iArr2;
                            i16 = l12;
                            i17 = i15;
                        } else {
                            iArr = iArr2;
                            i16 = l12;
                            i17 = i15;
                            f9 = 1.0f;
                        }
                        String d = f5.a.d(i32, i33, i34, i17, h, iArr);
                        s0 s0Var = new s0();
                        s0Var.a = str;
                        s0Var.o = "video/hevc";
                        s0Var.h = d;
                        s0Var.t = l11;
                        s0Var.u = i16;
                        s0Var.x = f9;
                        s0Var.q = Collections.singletonList(bArr3);
                        wVar3.b(new t0(s0Var));
                        this.e = true;
                        f0 f0Var62 = this.j;
                        e10 = f0Var62.e(i28);
                        f5.w wVar42 = this.n;
                        if (e10) {
                        }
                        f0Var = this.k;
                        if (f0Var.e(i28)) {
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
                        f0Var2 = f0Var3;
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
                        f0Var62.g(i14);
                        f0Var.g(i14);
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
                f0 f0Var622 = this.j;
                e10 = f0Var622.e(i28);
                f5.w wVar422 = this.n;
                if (e10) {
                }
                f0Var = this.k;
                if (f0Var.e(i28)) {
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
                f0Var2 = f0Var3;
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
                f0Var622.g(i14);
                f0Var.g(i14);
                i23 = i10;
                bArr2 = bArr;
                i22 = i11;
            }
            wVar2 = wVar;
        }
    }

    @Override // y3.h
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.b = d0Var.e;
        d0Var.b();
        o3.w Z1 = mVar.Z1(d0Var.d, 2);
        this.c = Z1;
        this.d = new q(Z1);
        this.a.b(mVar, d0Var);
    }

    @Override // y3.h
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.m = j10;
        }
    }

    @Override // y3.h
    public final void d() {
    }
}
