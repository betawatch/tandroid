package w3;

import d5.g0;
import h3.s0;
import h3.t0;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements h {
    public final /* synthetic */ int a;
    public final d5.y b;
    public final d5.z c;
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

    public b(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                d5.y yVar = new d5.y(new byte[16], 16);
                this.b = yVar;
                this.c = new d5.z(yVar.b);
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
            default:
                d5.y yVar2 = new d5.y(new byte[128], 128);
                this.b = yVar2;
                this.c = new d5.z(yVar2.b);
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
    public final void b(d5.z zVar) {
        int i10;
        int i11;
        String str;
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
        int i25;
        switch (this.a) {
            case 0:
                d5.a.j(this.f);
                while (zVar.a() > 0) {
                    int i26 = this.g;
                    d5.z zVar2 = this.c;
                    if (i26 == 0) {
                        while (true) {
                            if (zVar.a() <= 0) {
                                break;
                            }
                            if (this.i) {
                                int r10 = zVar.r();
                                if (r10 == 119) {
                                    this.i = false;
                                    this.g = 1;
                                    byte[] bArr = zVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.h = 2;
                                } else {
                                    this.i = r10 == 11;
                                }
                            } else {
                                this.i = zVar.r() == 11;
                            }
                        }
                    } else if (i26 == 1) {
                        byte[] bArr2 = zVar2.a;
                        int min = Math.min(zVar.a(), 128 - this.h);
                        zVar.c(this.h, min, bArr2);
                        int i27 = this.h + min;
                        this.h = i27;
                        if (i27 == 128) {
                            d5.y yVar = this.b;
                            yVar.p(0);
                            int[] iArr = j3.b.f;
                            int[] iArr2 = j3.b.d;
                            int g10 = yVar.g();
                            yVar.s(40);
                            boolean z10 = yVar.i(5) > 10;
                            yVar.p(g10);
                            if (z10) {
                                yVar.s(16);
                                int i28 = yVar.i(2);
                                char c10 = i28 != 0 ? i28 != 1 ? i28 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                yVar.s(3);
                                i12 = (yVar.i(11) + 1) * 2;
                                int i29 = yVar.i(2);
                                if (i29 == 3) {
                                    i14 = j3.b.e[yVar.i(2)];
                                    i17 = 6;
                                    i16 = 3;
                                } else {
                                    int i30 = yVar.i(2);
                                    int i31 = j3.b.c[i30];
                                    i14 = iArr2[i29];
                                    i16 = i30;
                                    i17 = i31;
                                }
                                i15 = i17 * 256;
                                int i32 = (i12 * i14) / (i17 * 32);
                                int i33 = yVar.i(3);
                                boolean h = yVar.h();
                                i11 = iArr[i33] + (h ? 1 : 0);
                                yVar.s(10);
                                if (yVar.h()) {
                                    yVar.s(8);
                                }
                                if (i33 == 0) {
                                    yVar.s(5);
                                    if (yVar.h()) {
                                        yVar.s(8);
                                    }
                                }
                                if (c10 == 1 && yVar.h()) {
                                    yVar.s(16);
                                }
                                if (yVar.h()) {
                                    if (i33 > 2) {
                                        yVar.s(2);
                                    }
                                    if ((i33 & 1) == 0 || i33 <= 2) {
                                        i22 = 6;
                                    } else {
                                        i22 = 6;
                                        yVar.s(6);
                                    }
                                    if ((i33 & 4) != 0) {
                                        yVar.s(i22);
                                    }
                                    if (h && yVar.h()) {
                                        yVar.s(5);
                                    }
                                    if (c10 == 0) {
                                        if (yVar.h()) {
                                            i23 = 6;
                                            yVar.s(6);
                                        } else {
                                            i23 = 6;
                                        }
                                        if (i33 == 0 && yVar.h()) {
                                            yVar.s(i23);
                                        }
                                        if (yVar.h()) {
                                            yVar.s(i23);
                                        }
                                        int i34 = yVar.i(2);
                                        if (i34 == 1) {
                                            yVar.s(5);
                                        } else if (i34 == 2) {
                                            yVar.s(12);
                                        } else if (i34 == 3) {
                                            int i35 = yVar.i(5);
                                            if (yVar.h()) {
                                                yVar.s(5);
                                                if (yVar.h()) {
                                                    i25 = 4;
                                                    yVar.s(4);
                                                } else {
                                                    i25 = 4;
                                                }
                                                if (yVar.h()) {
                                                    yVar.s(i25);
                                                }
                                                if (yVar.h()) {
                                                    yVar.s(i25);
                                                }
                                                if (yVar.h()) {
                                                    yVar.s(i25);
                                                }
                                                if (yVar.h()) {
                                                    yVar.s(i25);
                                                }
                                                if (yVar.h()) {
                                                    yVar.s(i25);
                                                }
                                                if (yVar.h()) {
                                                    yVar.s(i25);
                                                }
                                                if (yVar.h()) {
                                                    if (yVar.h()) {
                                                        yVar.s(i25);
                                                    }
                                                    if (yVar.h()) {
                                                        yVar.s(i25);
                                                    }
                                                }
                                            }
                                            if (yVar.h()) {
                                                yVar.s(5);
                                                if (yVar.h()) {
                                                    yVar.s(7);
                                                    if (yVar.h()) {
                                                        yVar.s(8);
                                                        i24 = 2;
                                                        yVar.s((i35 + 2) * 8);
                                                        yVar.c();
                                                        if (i33 < i24) {
                                                            if (yVar.h()) {
                                                                yVar.s(14);
                                                            }
                                                            if (i33 == 0 && yVar.h()) {
                                                                yVar.s(14);
                                                            }
                                                        }
                                                        if (yVar.h()) {
                                                            i18 = i16;
                                                            if (i18 == 0) {
                                                                yVar.s(5);
                                                            } else {
                                                                for (int i36 = 0; i36 < i17; i36++) {
                                                                    if (yVar.h()) {
                                                                        yVar.s(5);
                                                                    }
                                                                }
                                                            }
                                                            if (yVar.h()) {
                                                                i19 = 3;
                                                            } else {
                                                                yVar.s(5);
                                                                if (i33 == 2) {
                                                                    yVar.s(4);
                                                                }
                                                                if (i33 >= 6) {
                                                                    yVar.s(2);
                                                                }
                                                                if (yVar.h()) {
                                                                    i21 = 8;
                                                                    yVar.s(8);
                                                                } else {
                                                                    i21 = 8;
                                                                }
                                                                if (i33 == 0 && yVar.h()) {
                                                                    yVar.s(i21);
                                                                }
                                                                i19 = 3;
                                                                if (i29 < 3) {
                                                                    yVar.r();
                                                                }
                                                            }
                                                            if (c10 == 0 && i18 != i19) {
                                                                yVar.r();
                                                            }
                                                            if (c10 == 2 || !(i18 == i19 || yVar.h())) {
                                                                i20 = 6;
                                                            } else {
                                                                i20 = 6;
                                                                yVar.s(6);
                                                            }
                                                            str = (!yVar.h() && yVar.i(i20) == 1 && yVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                                            i13 = i32;
                                                        }
                                                    }
                                                }
                                            }
                                            i24 = 2;
                                            yVar.s((i35 + 2) * 8);
                                            yVar.c();
                                            if (i33 < i24) {
                                            }
                                            if (yVar.h()) {
                                            }
                                        }
                                        i24 = 2;
                                        if (i33 < i24) {
                                        }
                                        if (yVar.h()) {
                                        }
                                    }
                                }
                                i18 = i16;
                                if (yVar.h()) {
                                }
                                if (c10 == 0) {
                                    yVar.r();
                                }
                                if (c10 == 2) {
                                }
                                i20 = 6;
                                if (!yVar.h()) {
                                }
                                i13 = i32;
                            } else {
                                yVar.s(32);
                                int i37 = yVar.i(2);
                                String str2 = i37 == 3 ? null : "audio/ac3";
                                int i38 = yVar.i(6);
                                int i39 = j3.b.g[i38 / 2] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                int b10 = j3.b.b(i37, i38);
                                yVar.s(8);
                                int i40 = yVar.i(3);
                                if ((i40 & 1) == 0 || i40 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    yVar.s(2);
                                }
                                if ((i40 & 4) != 0) {
                                    yVar.s(i10);
                                }
                                if (i40 == i10) {
                                    yVar.s(i10);
                                }
                                int i41 = i37 < 3 ? iArr2[i37] : -1;
                                i11 = iArr[i40] + (yVar.h() ? 1 : 0);
                                str = str2;
                                i12 = b10;
                                i13 = i39;
                                i14 = i41;
                                i15 = 1536;
                            }
                            t0 t0Var = this.k;
                            if (t0Var == null || i11 != t0Var.O || i14 != t0Var.P || !g0.a(str, t0Var.B)) {
                                s0 s0Var = new s0();
                                s0Var.a = this.e;
                                s0Var.o = str;
                                s0Var.B = i11;
                                s0Var.C = i14;
                                s0Var.c = this.d;
                                s0Var.g = i13;
                                if ("audio/ac3".equals(str)) {
                                    s0Var.f = i13;
                                }
                                t0 t0Var2 = new t0(s0Var);
                                this.k = t0Var2;
                                this.f.c(t0Var2);
                            }
                            this.l = i12;
                            this.j = (i15 * 1000000) / this.k.P;
                            zVar2.C(0);
                            this.f.a(128, zVar2);
                            this.g = 2;
                        }
                    } else if (i26 == 2) {
                        int min2 = Math.min(zVar.a(), this.l - this.h);
                        this.f.a(min2, zVar);
                        int i42 = this.h + min2;
                        this.h = i42;
                        int i43 = this.l;
                        if (i42 == i43) {
                            long j10 = this.m;
                            if (j10 != -9223372036854775807L) {
                                this.f.e(j10, 1, i43, 0, null);
                                this.m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                break;
            default:
                d5.a.j(this.f);
                while (zVar.a() > 0) {
                    int i44 = this.g;
                    d5.z zVar3 = this.c;
                    if (i44 == 0) {
                        while (zVar.a() > 0) {
                            if (this.i) {
                                int r11 = zVar.r();
                                this.i = r11 == 172;
                                if (r11 == 64 || r11 == 65) {
                                    boolean z11 = r11 == 65;
                                    this.g = 1;
                                    byte[] bArr3 = zVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z11 ? 65 : 64);
                                    this.h = 2;
                                }
                            } else {
                                this.i = zVar.r() == 172;
                            }
                        }
                    } else if (i44 == 1) {
                        byte[] bArr4 = zVar3.a;
                        int min3 = Math.min(zVar.a(), 16 - this.h);
                        zVar.c(this.h, min3, bArr4);
                        int i45 = this.h + min3;
                        this.h = i45;
                        if (i45 == 16) {
                            d5.y yVar2 = this.b;
                            yVar2.p(0);
                            b8.b g11 = j3.b.g(yVar2);
                            int i46 = g11.a;
                            t0 t0Var3 = this.k;
                            if (t0Var3 == null || 2 != t0Var3.O || i46 != t0Var3.P || !"audio/ac4".equals(t0Var3.B)) {
                                s0 s0Var2 = new s0();
                                s0Var2.a = this.e;
                                s0Var2.o = "audio/ac4";
                                s0Var2.B = 2;
                                s0Var2.C = i46;
                                s0Var2.c = this.d;
                                t0 t0Var4 = new t0(s0Var2);
                                this.k = t0Var4;
                                this.f.c(t0Var4);
                            }
                            this.l = g11.b;
                            this.j = (g11.c * 1000000) / this.k.P;
                            zVar3.C(0);
                            this.f.a(16, zVar3);
                            this.g = 2;
                        }
                    } else if (i44 == 2) {
                        int min4 = Math.min(zVar.a(), this.l - this.h);
                        this.f.a(min4, zVar);
                        int i47 = this.h + min4;
                        this.h = i47;
                        int i48 = this.l;
                        if (i47 == i48) {
                            long j11 = this.m;
                            if (j11 != -9223372036854775807L) {
                                this.f.e(j11, 1, i48, 0, null);
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
    public final void c() {
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
    public final void d() {
        int i10 = this.a;
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        switch (this.a) {
            case 0:
                e0Var.a();
                e0Var.b();
                this.e = e0Var.e;
                e0Var.b();
                this.f = mVar.C(e0Var.d, 1);
                break;
            default:
                e0Var.a();
                e0Var.b();
                this.e = e0Var.e;
                e0Var.b();
                this.f = mVar.C(e0Var.d, 1);
                break;
        }
    }

    @Override // w3.h
    public final void f(int i10, long j10) {
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

    private final void g() {
    }
}
