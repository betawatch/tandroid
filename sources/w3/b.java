package w3;

import d5.f0;
import h3.s0;
import h3.t0;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements h {
    public final /* synthetic */ int a;
    public final d5.x b;
    public final d5.y c;
    public final String d;
    public String e;
    public m3.w f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public t0 k;
    public int l;
    public long m;

    public b(String str, int i9) {
        this.a = i9;
        switch (i9) {
            case 1:
                d5.x xVar = new d5.x(new byte[16], 16);
                this.b = xVar;
                this.c = new d5.y(xVar.b);
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
            default:
                d5.x xVar2 = new d5.x(new byte[128], 128);
                this.b = xVar2;
                this.c = new d5.y(xVar2.b);
                this.g = 0;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x039a  */
    @Override // w3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(d5.y yVar) {
        int i9;
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        switch (this.a) {
            case 0:
                d5.a.j(this.f);
                while (yVar.a() > 0) {
                    int i25 = this.g;
                    d5.y yVar2 = this.c;
                    if (i25 == 0) {
                        while (true) {
                            if (yVar.a() <= 0) {
                                break;
                            }
                            if (this.i) {
                                int r10 = yVar.r();
                                if (r10 == 119) {
                                    this.i = false;
                                    this.g = 1;
                                    byte[] bArr = yVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.h = 2;
                                } else {
                                    this.i = r10 == 11;
                                }
                            } else {
                                this.i = yVar.r() == 11;
                            }
                        }
                    } else if (i25 == 1) {
                        byte[] bArr2 = yVar2.a;
                        int min = Math.min(yVar.a(), 128 - this.h);
                        yVar.c(this.h, min, bArr2);
                        int i26 = this.h + min;
                        this.h = i26;
                        if (i26 == 128) {
                            d5.x xVar = this.b;
                            xVar.p(0);
                            int[] iArr = j3.b.f;
                            int[] iArr2 = j3.b.d;
                            int g10 = xVar.g();
                            xVar.s(40);
                            boolean z10 = xVar.i(5) > 10;
                            xVar.p(g10);
                            if (z10) {
                                xVar.s(16);
                                int i27 = xVar.i(2);
                                char c10 = i27 != 0 ? i27 != 1 ? i27 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                xVar.s(3);
                                i11 = (xVar.i(11) + 1) * 2;
                                int i28 = xVar.i(2);
                                if (i28 == 3) {
                                    i13 = j3.b.e[xVar.i(2)];
                                    i16 = 6;
                                    i15 = 3;
                                } else {
                                    int i29 = xVar.i(2);
                                    int i30 = j3.b.c[i29];
                                    i13 = iArr2[i28];
                                    i15 = i29;
                                    i16 = i30;
                                }
                                i14 = i16 * 256;
                                int i31 = (i11 * i13) / (i16 * 32);
                                int i32 = xVar.i(3);
                                boolean h = xVar.h();
                                i10 = iArr[i32] + (h ? 1 : 0);
                                xVar.s(10);
                                if (xVar.h()) {
                                    xVar.s(8);
                                }
                                if (i32 == 0) {
                                    xVar.s(5);
                                    if (xVar.h()) {
                                        xVar.s(8);
                                    }
                                }
                                if (c10 == 1 && xVar.h()) {
                                    xVar.s(16);
                                }
                                if (xVar.h()) {
                                    if (i32 > 2) {
                                        xVar.s(2);
                                    }
                                    if ((i32 & 1) == 0 || i32 <= 2) {
                                        i21 = 6;
                                    } else {
                                        i21 = 6;
                                        xVar.s(6);
                                    }
                                    if ((i32 & 4) != 0) {
                                        xVar.s(i21);
                                    }
                                    if (h && xVar.h()) {
                                        xVar.s(5);
                                    }
                                    if (c10 == 0) {
                                        if (xVar.h()) {
                                            i22 = 6;
                                            xVar.s(6);
                                        } else {
                                            i22 = 6;
                                        }
                                        if (i32 == 0 && xVar.h()) {
                                            xVar.s(i22);
                                        }
                                        if (xVar.h()) {
                                            xVar.s(i22);
                                        }
                                        int i33 = xVar.i(2);
                                        if (i33 == 1) {
                                            xVar.s(5);
                                        } else if (i33 == 2) {
                                            xVar.s(12);
                                        } else if (i33 == 3) {
                                            int i34 = xVar.i(5);
                                            if (xVar.h()) {
                                                xVar.s(5);
                                                if (xVar.h()) {
                                                    i24 = 4;
                                                    xVar.s(4);
                                                } else {
                                                    i24 = 4;
                                                }
                                                if (xVar.h()) {
                                                    xVar.s(i24);
                                                }
                                                if (xVar.h()) {
                                                    xVar.s(i24);
                                                }
                                                if (xVar.h()) {
                                                    xVar.s(i24);
                                                }
                                                if (xVar.h()) {
                                                    xVar.s(i24);
                                                }
                                                if (xVar.h()) {
                                                    xVar.s(i24);
                                                }
                                                if (xVar.h()) {
                                                    xVar.s(i24);
                                                }
                                                if (xVar.h()) {
                                                    if (xVar.h()) {
                                                        xVar.s(i24);
                                                    }
                                                    if (xVar.h()) {
                                                        xVar.s(i24);
                                                    }
                                                }
                                            }
                                            if (xVar.h()) {
                                                xVar.s(5);
                                                if (xVar.h()) {
                                                    xVar.s(7);
                                                    if (xVar.h()) {
                                                        xVar.s(8);
                                                        i23 = 2;
                                                        xVar.s((i34 + 2) * 8);
                                                        xVar.c();
                                                        if (i32 < i23) {
                                                            if (xVar.h()) {
                                                                xVar.s(14);
                                                            }
                                                            if (i32 == 0 && xVar.h()) {
                                                                xVar.s(14);
                                                            }
                                                        }
                                                        if (xVar.h()) {
                                                            i17 = i15;
                                                            if (i17 == 0) {
                                                                xVar.s(5);
                                                            } else {
                                                                for (int i35 = 0; i35 < i16; i35++) {
                                                                    if (xVar.h()) {
                                                                        xVar.s(5);
                                                                    }
                                                                }
                                                            }
                                                            if (xVar.h()) {
                                                                i18 = 3;
                                                            } else {
                                                                xVar.s(5);
                                                                if (i32 == 2) {
                                                                    xVar.s(4);
                                                                }
                                                                if (i32 >= 6) {
                                                                    xVar.s(2);
                                                                }
                                                                if (xVar.h()) {
                                                                    i20 = 8;
                                                                    xVar.s(8);
                                                                } else {
                                                                    i20 = 8;
                                                                }
                                                                if (i32 == 0 && xVar.h()) {
                                                                    xVar.s(i20);
                                                                }
                                                                i18 = 3;
                                                                if (i28 < 3) {
                                                                    xVar.r();
                                                                }
                                                            }
                                                            if (c10 == 0 && i17 != i18) {
                                                                xVar.r();
                                                            }
                                                            if (c10 == 2 || !(i17 == i18 || xVar.h())) {
                                                                i19 = 6;
                                                            } else {
                                                                i19 = 6;
                                                                xVar.s(6);
                                                            }
                                                            str = (!xVar.h() && xVar.i(i19) == 1 && xVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                                            i12 = i31;
                                                        }
                                                    }
                                                }
                                            }
                                            i23 = 2;
                                            xVar.s((i34 + 2) * 8);
                                            xVar.c();
                                            if (i32 < i23) {
                                            }
                                            if (xVar.h()) {
                                            }
                                        }
                                        i23 = 2;
                                        if (i32 < i23) {
                                        }
                                        if (xVar.h()) {
                                        }
                                    }
                                }
                                i17 = i15;
                                if (xVar.h()) {
                                }
                                if (c10 == 0) {
                                    xVar.r();
                                }
                                if (c10 == 2) {
                                }
                                i19 = 6;
                                if (!xVar.h()) {
                                }
                                i12 = i31;
                            } else {
                                xVar.s(32);
                                int i36 = xVar.i(2);
                                String str2 = i36 == 3 ? null : "audio/ac3";
                                int i37 = xVar.i(6);
                                int i38 = j3.b.g[i37 / 2] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                int b10 = j3.b.b(i36, i37);
                                xVar.s(8);
                                int i39 = xVar.i(3);
                                if ((i39 & 1) == 0 || i39 == 1) {
                                    i9 = 2;
                                } else {
                                    i9 = 2;
                                    xVar.s(2);
                                }
                                if ((i39 & 4) != 0) {
                                    xVar.s(i9);
                                }
                                if (i39 == i9) {
                                    xVar.s(i9);
                                }
                                int i40 = i36 < 3 ? iArr2[i36] : -1;
                                i10 = iArr[i39] + (xVar.h() ? 1 : 0);
                                str = str2;
                                i11 = b10;
                                i12 = i38;
                                i13 = i40;
                                i14 = 1536;
                            }
                            t0 t0Var = this.k;
                            if (t0Var == null || i10 != t0Var.O || i13 != t0Var.P || !f0.a(str, t0Var.B)) {
                                s0 s0Var = new s0();
                                s0Var.a = this.e;
                                s0Var.o = str;
                                s0Var.B = i10;
                                s0Var.C = i13;
                                s0Var.c = this.d;
                                s0Var.g = i12;
                                if ("audio/ac3".equals(str)) {
                                    s0Var.f = i12;
                                }
                                t0 t0Var2 = new t0(s0Var);
                                this.k = t0Var2;
                                this.f.c(t0Var2);
                            }
                            this.l = i11;
                            this.j = (i14 * 1000000) / this.k.P;
                            yVar2.C(0);
                            this.f.a(128, yVar2);
                            this.g = 2;
                        }
                    } else if (i25 == 2) {
                        int min2 = Math.min(yVar.a(), this.l - this.h);
                        this.f.a(min2, yVar);
                        int i41 = this.h + min2;
                        this.h = i41;
                        int i42 = this.l;
                        if (i41 == i42) {
                            long j10 = this.m;
                            if (j10 != -9223372036854775807L) {
                                this.f.e(j10, 1, i42, 0, null);
                                this.m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                break;
            default:
                d5.a.j(this.f);
                while (yVar.a() > 0) {
                    int i43 = this.g;
                    d5.y yVar3 = this.c;
                    if (i43 == 0) {
                        while (yVar.a() > 0) {
                            if (this.i) {
                                int r11 = yVar.r();
                                this.i = r11 == 172;
                                if (r11 == 64 || r11 == 65) {
                                    boolean z11 = r11 == 65;
                                    this.g = 1;
                                    byte[] bArr3 = yVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z11 ? 65 : 64);
                                    this.h = 2;
                                }
                            } else {
                                this.i = yVar.r() == 172;
                            }
                        }
                    } else if (i43 == 1) {
                        byte[] bArr4 = yVar3.a;
                        int min3 = Math.min(yVar.a(), 16 - this.h);
                        yVar.c(this.h, min3, bArr4);
                        int i44 = this.h + min3;
                        this.h = i44;
                        if (i44 == 16) {
                            d5.x xVar2 = this.b;
                            xVar2.p(0);
                            a8.b g11 = j3.b.g(xVar2);
                            int i45 = g11.a;
                            t0 t0Var3 = this.k;
                            if (t0Var3 == null || 2 != t0Var3.O || i45 != t0Var3.P || !"audio/ac4".equals(t0Var3.B)) {
                                s0 s0Var2 = new s0();
                                s0Var2.a = this.e;
                                s0Var2.o = "audio/ac4";
                                s0Var2.B = 2;
                                s0Var2.C = i45;
                                s0Var2.c = this.d;
                                t0 t0Var4 = new t0(s0Var2);
                                this.k = t0Var4;
                                this.f.c(t0Var4);
                            }
                            this.l = g11.b;
                            this.j = (g11.c * 1000000) / this.k.P;
                            yVar3.C(0);
                            this.f.a(16, yVar3);
                            this.g = 2;
                        }
                    } else if (i43 == 2) {
                        int min4 = Math.min(yVar.a(), this.l - this.h);
                        this.f.a(min4, yVar);
                        int i46 = this.h + min4;
                        this.h = i46;
                        int i47 = this.l;
                        if (i46 == i47) {
                            long j11 = this.m;
                            if (j11 != -9223372036854775807L) {
                                this.f.e(j11, 1, i47, 0, null);
                                this.m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // w3.h
    public final void h() {
        switch (this.a) {
            case 0:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
            default:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
        }
    }

    @Override // w3.h
    public final void i() {
        int i9 = this.a;
    }

    @Override // w3.h
    public final void j(m3.m mVar, d0 d0Var) {
        switch (this.a) {
            case 0:
                d0Var.a();
                d0Var.b();
                this.e = d0Var.e;
                d0Var.b();
                this.f = mVar.I(d0Var.d, 1);
                break;
            default:
                d0Var.a();
                d0Var.b();
                this.e = d0Var.e;
                d0Var.b();
                this.f = mVar.I(d0Var.d, 1);
                break;
        }
    }

    @Override // w3.h
    public final void k(int i9, long j10) {
        switch (this.a) {
            case 0:
                if (j10 != -9223372036854775807L) {
                    this.m = j10;
                    break;
                }
                break;
            default:
                if (j10 != -9223372036854775807L) {
                    this.m = j10;
                    break;
                }
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
