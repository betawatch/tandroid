// default package

import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rc3 extends qc3 {
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final byte K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final byte O;
    public final boolean P;
    public final String Q;
    public final boolean e;
    public final nc3 f;
    public final boolean h;
    public final boolean n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0119 A[EDGE_INSN: B:162:0x0119->B:84:0x0119 BREAK  A[LOOP:1: B:77:0x0104->B:160:0x0116], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rc3(int i, sxb sxbVar, int i2, nc3 nc3Var, int i3, String str, int i4, boolean z) {
        super(i, sxbVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        boolean z4;
        byte b;
        boolean z5;
        boolean z6;
        nc3 nc3Var2;
        fm4 fm4Var;
        boolean z7;
        String c;
        int i11;
        fm4 fm4Var2;
        int i12;
        int i13;
        float f;
        int i14;
        fm4 fm4Var3;
        int i15;
        int i16;
        int i17;
        this.f = nc3Var;
        boolean z8 = nc3Var.x0;
        w59 w59Var = nc3Var.m;
        w59 w59Var2 = nc3Var.o;
        int i18 = z8 ? 24 : 16;
        byte b2 = 0;
        this.J = false;
        if (z && (((i15 = (fm4Var3 = this.d).A) == -1 || i15 <= nc3Var.a) && ((i16 = fm4Var3.B) == -1 || i16 <= nc3Var.b))) {
            float f2 = fm4Var3.F;
            if ((f2 == -1.0f || f2 <= nc3Var.c) && ((i17 = fm4Var3.k) == -1 || i17 <= nc3Var.d)) {
                z2 = true;
                this.e = z2;
                if (z && (((i12 = (fm4Var2 = this.d).A) == -1 || i12 >= nc3Var.e) && ((i13 = fm4Var2.B) == -1 || i13 >= nc3Var.f))) {
                    f = fm4Var2.F;
                    if ((f != -1.0f || f >= nc3Var.g) && ((i14 = fm4Var2.k) == -1 || i14 >= nc3Var.h)) {
                        z3 = true;
                        this.h = z3;
                        this.n = ls6.c(i3, false);
                        fm4 fm4Var4 = this.d;
                        float f3 = fm4Var4.F;
                        this.r = f3 == -1.0f && f3 >= 10.0f;
                        this.s = fm4Var4.k;
                        int i19 = fm4Var4.A;
                        this.w = (i19 != -1 || (i11 = fm4Var4.B) == -1) ? -1 : i19 * i11;
                        i5 = 0;
                        while (true) {
                            i6 = w59Var2.d;
                            i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            if (i5 < i6) {
                                i8 = 0;
                                i5 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i8 = sc3.g(this.d, (String) w59Var2.get(i5), false);
                                if (i8 > 0) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        this.y = i5;
                        this.E = i8;
                        int i20 = this.d.f;
                        int i21 = nc3Var.p;
                        yq7 yq7Var = sc3.l;
                        this.F = (i20 == 0 && i20 == i21) ? Integer.MAX_VALUE : Integer.bitCount(i20 & i21);
                        int i22 = this.d.f;
                        this.H = (i22 == 0 && (i22 & 1) == 0) ? false : true;
                        this.I = sc3.g(this.d, str, sc3.h(str) != null);
                        fm4 fm4Var5 = this.d;
                        str2 = fm4Var5.t;
                        i9 = i3 & 384;
                        if (i9 == 256 && (c = qk6.c(fm4Var5)) != null) {
                            str2 = c;
                        }
                        i10 = 0;
                        while (true) {
                            if (i10 < w59Var.d) {
                                if (str2 != null && str2.equals(w59Var.get(i10))) {
                                    i7 = i10;
                                    break;
                                }
                                i10++;
                            } else {
                                break;
                            }
                        }
                        this.x = i7;
                        this.G = sc3.f(this.d, nc3Var.n);
                        this.L = i9 != 128 || i9 == 256;
                        z4 = i9 != 128;
                        this.M = z4;
                        this.N = (i3 & 64) != 64;
                        this.Q = str2;
                        if (str2 != null) {
                            b = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        z7 = false;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        z7 = true;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        z7 = 2;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        z7 = 3;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        z7 = 4;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                default:
                                    z7 = -1;
                                    break;
                            }
                            switch (z7) {
                                case false:
                                    b = 5;
                                    break;
                                case true:
                                    b = 3;
                                    break;
                                case true:
                                    b = 1;
                                    break;
                                case true:
                                    b = 2;
                                    break;
                            }
                            this.O = b;
                            if (z4) {
                                hl2 hl2Var = this.d.L;
                                if (hl2Var != null) {
                                    int i23 = hl2Var.c;
                                    if (i23 == 7 || i23 == 6) {
                                        z5 = true;
                                        this.P = z5;
                                        z6 = this.e;
                                        nc3Var2 = this.f;
                                        fm4Var = this.d;
                                        if ((fm4Var.f & TLObject.FLAG_14) == 0 && ls6.c(i3, nc3Var2.B0) && (z6 || nc3Var2.w0)) {
                                            b2 = (ls6.c(i3, false) || !this.h || !z6 || fm4Var.k == -1 || nc3Var2.G || nc3Var2.F || (i3 & i18) == 0) ? (byte) 1 : (byte) 2;
                                        }
                                        this.K = b2;
                                    }
                                } else {
                                    hl2 hl2Var2 = hl2.h;
                                }
                            }
                            z5 = false;
                            this.P = z5;
                            z6 = this.e;
                            nc3Var2 = this.f;
                            fm4Var = this.d;
                            if ((fm4Var.f & TLObject.FLAG_14) == 0) {
                                if (ls6.c(i3, false)) {
                                }
                            }
                            this.K = b2;
                        }
                        b = 0;
                        this.O = b;
                        if (z4) {
                        }
                        z5 = false;
                        this.P = z5;
                        z6 = this.e;
                        nc3Var2 = this.f;
                        fm4Var = this.d;
                        if ((fm4Var.f & TLObject.FLAG_14) == 0) {
                        }
                        this.K = b2;
                    }
                }
                z3 = false;
                this.h = z3;
                this.n = ls6.c(i3, false);
                fm4 fm4Var42 = this.d;
                float f32 = fm4Var42.F;
                this.r = f32 == -1.0f && f32 >= 10.0f;
                this.s = fm4Var42.k;
                int i192 = fm4Var42.A;
                this.w = (i192 != -1 || (i11 = fm4Var42.B) == -1) ? -1 : i192 * i11;
                i5 = 0;
                while (true) {
                    i6 = w59Var2.d;
                    i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i5 < i6) {
                    }
                    i5++;
                }
                this.y = i5;
                this.E = i8;
                int i202 = this.d.f;
                int i212 = nc3Var.p;
                yq7 yq7Var2 = sc3.l;
                this.F = (i202 == 0 && i202 == i212) ? Integer.MAX_VALUE : Integer.bitCount(i202 & i212);
                int i222 = this.d.f;
                this.H = (i222 == 0 && (i222 & 1) == 0) ? false : true;
                this.I = sc3.g(this.d, str, sc3.h(str) != null);
                fm4 fm4Var52 = this.d;
                str2 = fm4Var52.t;
                i9 = i3 & 384;
                if (i9 == 256) {
                    str2 = c;
                }
                i10 = 0;
                while (true) {
                    if (i10 < w59Var.d) {
                    }
                    i10++;
                }
                this.x = i7;
                this.G = sc3.f(this.d, nc3Var.n);
                this.L = i9 != 128 || i9 == 256;
                if (i9 != 128) {
                }
                this.M = z4;
                this.N = (i3 & 64) != 64;
                this.Q = str2;
                if (str2 != null) {
                }
                b = 0;
                this.O = b;
                if (z4) {
                }
                z5 = false;
                this.P = z5;
                z6 = this.e;
                nc3Var2 = this.f;
                fm4Var = this.d;
                if ((fm4Var.f & TLObject.FLAG_14) == 0) {
                }
                this.K = b2;
            }
        }
        z2 = false;
        this.e = z2;
        if (z) {
            f = fm4Var2.F;
            if (f != -1.0f) {
            }
            z3 = true;
            this.h = z3;
            this.n = ls6.c(i3, false);
            fm4 fm4Var422 = this.d;
            float f322 = fm4Var422.F;
            this.r = f322 == -1.0f && f322 >= 10.0f;
            this.s = fm4Var422.k;
            int i1922 = fm4Var422.A;
            this.w = (i1922 != -1 || (i11 = fm4Var422.B) == -1) ? -1 : i1922 * i11;
            i5 = 0;
            while (true) {
                i6 = w59Var2.d;
                i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i5 < i6) {
                }
                i5++;
            }
            this.y = i5;
            this.E = i8;
            int i2022 = this.d.f;
            int i2122 = nc3Var.p;
            yq7 yq7Var22 = sc3.l;
            this.F = (i2022 == 0 && i2022 == i2122) ? Integer.MAX_VALUE : Integer.bitCount(i2022 & i2122);
            int i2222 = this.d.f;
            this.H = (i2222 == 0 && (i2222 & 1) == 0) ? false : true;
            this.I = sc3.g(this.d, str, sc3.h(str) != null);
            fm4 fm4Var522 = this.d;
            str2 = fm4Var522.t;
            i9 = i3 & 384;
            if (i9 == 256) {
            }
            i10 = 0;
            while (true) {
                if (i10 < w59Var.d) {
                }
                i10++;
            }
            this.x = i7;
            this.G = sc3.f(this.d, nc3Var.n);
            this.L = i9 != 128 || i9 == 256;
            if (i9 != 128) {
            }
            this.M = z4;
            this.N = (i3 & 64) != 64;
            this.Q = str2;
            if (str2 != null) {
            }
            b = 0;
            this.O = b;
            if (z4) {
            }
            z5 = false;
            this.P = z5;
            z6 = this.e;
            nc3Var2 = this.f;
            fm4Var = this.d;
            if ((fm4Var.f & TLObject.FLAG_14) == 0) {
            }
            this.K = b2;
        }
        z3 = false;
        this.h = z3;
        this.n = ls6.c(i3, false);
        fm4 fm4Var4222 = this.d;
        float f3222 = fm4Var4222.F;
        this.r = f3222 == -1.0f && f3222 >= 10.0f;
        this.s = fm4Var4222.k;
        int i19222 = fm4Var4222.A;
        this.w = (i19222 != -1 || (i11 = fm4Var4222.B) == -1) ? -1 : i19222 * i11;
        i5 = 0;
        while (true) {
            i6 = w59Var2.d;
            i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i5 < i6) {
            }
            i5++;
        }
        this.y = i5;
        this.E = i8;
        int i20222 = this.d.f;
        int i21222 = nc3Var.p;
        yq7 yq7Var222 = sc3.l;
        this.F = (i20222 == 0 && i20222 == i21222) ? Integer.MAX_VALUE : Integer.bitCount(i20222 & i21222);
        int i22222 = this.d.f;
        this.H = (i22222 == 0 && (i22222 & 1) == 0) ? false : true;
        this.I = sc3.g(this.d, str, sc3.h(str) != null);
        fm4 fm4Var5222 = this.d;
        str2 = fm4Var5222.t;
        i9 = i3 & 384;
        if (i9 == 256) {
        }
        i10 = 0;
        while (true) {
            if (i10 < w59Var.d) {
            }
            i10++;
        }
        this.x = i7;
        this.G = sc3.f(this.d, nc3Var.n);
        this.L = i9 != 128 || i9 == 256;
        if (i9 != 128) {
        }
        this.M = z4;
        this.N = (i3 & 64) != 64;
        this.Q = str2;
        if (str2 != null) {
        }
        b = 0;
        this.O = b;
        if (z4) {
        }
        z5 = false;
        this.P = z5;
        z6 = this.e;
        nc3Var2 = this.f;
        fm4Var = this.d;
        if ((fm4Var.f & TLObject.FLAG_14) == 0) {
        }
        this.K = b2;
    }

    public static int c(rc3 rc3Var, rc3 rc3Var2) {
        wo2 c = wo2.a.c(rc3Var.n, rc3Var2.n);
        Integer valueOf = Integer.valueOf(rc3Var.y);
        Integer valueOf2 = Integer.valueOf(rc3Var2.y);
        hi7 hi7Var = hi7.c;
        return c.b(valueOf, valueOf2, hi7Var).a(rc3Var.E, rc3Var2.E).a(rc3Var.F, rc3Var2.F).b(Integer.valueOf(rc3Var.G), Integer.valueOf(rc3Var2.G), hi7Var).c(rc3Var.H, rc3Var2.H).a(rc3Var.I, rc3Var2.I).c(rc3Var.r, rc3Var2.r).c(rc3Var.e, rc3Var2.e).c(rc3Var.h, rc3Var2.h).b(Integer.valueOf(rc3Var.x), Integer.valueOf(rc3Var2.x), hi7Var).c(rc3Var.L, rc3Var2.L).c(rc3Var.N, rc3Var2.N).e();
    }

    @Override // qc3
    public final int a() {
        return this.K;
    }

    @Override // qc3
    public final boolean b(qc3 qc3Var) {
        rc3 rc3Var = (rc3) qc3Var;
        if (!this.J && !Objects.equals(this.Q, rc3Var.Q)) {
            return false;
        }
        this.f.getClass();
        return this.L == rc3Var.L && this.N == rc3Var.N;
    }
}
