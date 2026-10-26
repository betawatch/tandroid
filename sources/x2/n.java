package x2;

import b2.q1;
import b2.x;
import c3.h0;
import f9.i0;
import f9.n1;
import j$.util.Objects;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import r2.w;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n extends m {
    public final int E;
    public final int F;
    public final boolean G;
    public final int H;
    public final boolean I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final int N;
    public final boolean O;
    public final String P;
    public final boolean e;
    public final j f;
    public final boolean h;
    public final boolean n;
    public final boolean r;
    public final int s;
    public final int v;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0120 A[EDGE_INSN: B:162:0x0120->B:84:0x0120 BREAK  A[LOOP:1: B:77:0x0109->B:160:0x011d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(int i10, q1 q1Var, int i11, j jVar, int i12, String str, int i13, boolean z10) {
        super(i10, q1Var, i11);
        boolean z11;
        boolean z12;
        int i14;
        int size;
        int i15;
        int i16;
        String str2;
        int i17;
        int i18;
        boolean z13;
        int i19;
        boolean z14;
        boolean z15;
        j jVar2;
        x xVar;
        boolean z16;
        String c10;
        int i20;
        x xVar2;
        int i21;
        int i22;
        float f7;
        int i23;
        x xVar3;
        int i24;
        int i25;
        int i26;
        this.f = jVar;
        boolean z17 = jVar.x0;
        i0 i0Var = jVar.m;
        i0 i0Var2 = jVar.o;
        int i27 = z17 ? 24 : 16;
        int i28 = 0;
        this.I = false;
        if (z10 && (((i24 = (xVar3 = this.d).z) == -1 || i24 <= jVar.a) && ((i25 = xVar3.A) == -1 || i25 <= jVar.b))) {
            float f10 = xVar3.D;
            if ((f10 == -1.0f || f10 <= jVar.c) && ((i26 = xVar3.j) == -1 || i26 <= jVar.d)) {
                z11 = true;
                this.e = z11;
                if (z10 && (((i21 = (xVar2 = this.d).z) == -1 || i21 >= jVar.e) && ((i22 = xVar2.A) == -1 || i22 >= jVar.f))) {
                    f7 = xVar2.D;
                    if ((f7 != -1.0f || f7 >= jVar.g) && ((i23 = xVar2.j) == -1 || i23 >= jVar.h)) {
                        z12 = true;
                        this.h = z12;
                        this.n = h0.e(i12, false);
                        x xVar4 = this.d;
                        float f11 = xVar4.D;
                        this.r = f11 == -1.0f && f11 >= 10.0f;
                        this.s = xVar4.j;
                        int i29 = xVar4.z;
                        this.v = (i29 != -1 || (i20 = xVar4.A) == -1) ? -1 : i29 * i20;
                        i14 = 0;
                        while (true) {
                            size = i0Var2.size();
                            i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            if (i14 < size) {
                                i16 = 0;
                                i14 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i16 = o.i(this.d, (String) i0Var2.get(i14), false);
                                if (i16 > 0) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                        this.x = i14;
                        this.y = i16;
                        int i30 = this.d.f;
                        int i31 = jVar.p;
                        f9.q1 q1Var2 = o.l;
                        this.E = (i30 == 0 && i30 == i31) ? Integer.MAX_VALUE : Integer.bitCount(i30 & i31);
                        int i32 = this.d.f;
                        this.G = (i32 == 0 && (i32 & 1) == 0) ? false : true;
                        this.H = o.i(this.d, str, o.l(str) != null);
                        x xVar5 = this.d;
                        str2 = xVar5.s;
                        i17 = i12 & 384;
                        if (i17 == 256 && (c10 = w.c(xVar5)) != null) {
                            str2 = c10;
                        }
                        i18 = 0;
                        while (true) {
                            if (i18 < i0Var.size()) {
                                if (str2 != null && str2.equals(i0Var.get(i18))) {
                                    i15 = i18;
                                    break;
                                }
                                i18++;
                            } else {
                                break;
                            }
                        }
                        this.w = i15;
                        this.F = o.c(this.d, jVar.n);
                        this.K = i17 != 128 || i17 == 256;
                        z13 = i17 != 128;
                        this.L = z13;
                        this.M = (i12 & 64) != 64;
                        this.P = str2;
                        if (str2 != null) {
                            i19 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        z16 = false;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        z16 = true;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        z16 = 2;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                case 1331836730:
                                    if (str2.equals(MediaController.VIDEO_MIME_TYPE)) {
                                        z16 = 3;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        z16 = 4;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                default:
                                    z16 = -1;
                                    break;
                            }
                            switch (z16) {
                                case false:
                                    i19 = 5;
                                    break;
                                case true:
                                    i19 = 3;
                                    break;
                                case true:
                                    i19 = 1;
                                    break;
                                case true:
                                    i19 = 2;
                                    break;
                            }
                            this.N = i19;
                            if (z13) {
                                b2.o oVar = this.d.I;
                                if (oVar != null) {
                                    int i33 = oVar.c;
                                    if (i33 == 7 || i33 == 6) {
                                        z14 = true;
                                        this.O = z14;
                                        z15 = this.e;
                                        jVar2 = this.f;
                                        xVar = this.d;
                                        if ((xVar.f & 16384) == 0 && h0.e(i12, jVar2.B0) && (z15 || jVar2.w0)) {
                                            i28 = (h0.e(i12, false) || !this.h || !z15 || xVar.j == -1 || jVar2.G || jVar2.F || (i27 & i12) == 0) ? 1 : 2;
                                        }
                                        this.J = i28;
                                    }
                                } else {
                                    b2.o oVar2 = b2.o.h;
                                }
                            }
                            z14 = false;
                            this.O = z14;
                            z15 = this.e;
                            jVar2 = this.f;
                            xVar = this.d;
                            if ((xVar.f & 16384) == 0) {
                                if (h0.e(i12, false)) {
                                }
                            }
                            this.J = i28;
                        }
                        i19 = 0;
                        this.N = i19;
                        if (z13) {
                        }
                        z14 = false;
                        this.O = z14;
                        z15 = this.e;
                        jVar2 = this.f;
                        xVar = this.d;
                        if ((xVar.f & 16384) == 0) {
                        }
                        this.J = i28;
                    }
                }
                z12 = false;
                this.h = z12;
                this.n = h0.e(i12, false);
                x xVar42 = this.d;
                float f112 = xVar42.D;
                this.r = f112 == -1.0f && f112 >= 10.0f;
                this.s = xVar42.j;
                int i292 = xVar42.z;
                this.v = (i292 != -1 || (i20 = xVar42.A) == -1) ? -1 : i292 * i20;
                i14 = 0;
                while (true) {
                    size = i0Var2.size();
                    i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i14 < size) {
                    }
                    i14++;
                }
                this.x = i14;
                this.y = i16;
                int i302 = this.d.f;
                int i312 = jVar.p;
                f9.q1 q1Var22 = o.l;
                this.E = (i302 == 0 && i302 == i312) ? Integer.MAX_VALUE : Integer.bitCount(i302 & i312);
                int i322 = this.d.f;
                this.G = (i322 == 0 && (i322 & 1) == 0) ? false : true;
                this.H = o.i(this.d, str, o.l(str) != null);
                x xVar52 = this.d;
                str2 = xVar52.s;
                i17 = i12 & 384;
                if (i17 == 256) {
                    str2 = c10;
                }
                i18 = 0;
                while (true) {
                    if (i18 < i0Var.size()) {
                    }
                    i18++;
                }
                this.w = i15;
                this.F = o.c(this.d, jVar.n);
                this.K = i17 != 128 || i17 == 256;
                if (i17 != 128) {
                }
                this.L = z13;
                this.M = (i12 & 64) != 64;
                this.P = str2;
                if (str2 != null) {
                }
                i19 = 0;
                this.N = i19;
                if (z13) {
                }
                z14 = false;
                this.O = z14;
                z15 = this.e;
                jVar2 = this.f;
                xVar = this.d;
                if ((xVar.f & 16384) == 0) {
                }
                this.J = i28;
            }
        }
        z11 = false;
        this.e = z11;
        if (z10) {
            f7 = xVar2.D;
            if (f7 != -1.0f) {
            }
            z12 = true;
            this.h = z12;
            this.n = h0.e(i12, false);
            x xVar422 = this.d;
            float f1122 = xVar422.D;
            this.r = f1122 == -1.0f && f1122 >= 10.0f;
            this.s = xVar422.j;
            int i2922 = xVar422.z;
            this.v = (i2922 != -1 || (i20 = xVar422.A) == -1) ? -1 : i2922 * i20;
            i14 = 0;
            while (true) {
                size = i0Var2.size();
                i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i14 < size) {
                }
                i14++;
            }
            this.x = i14;
            this.y = i16;
            int i3022 = this.d.f;
            int i3122 = jVar.p;
            f9.q1 q1Var222 = o.l;
            this.E = (i3022 == 0 && i3022 == i3122) ? Integer.MAX_VALUE : Integer.bitCount(i3022 & i3122);
            int i3222 = this.d.f;
            this.G = (i3222 == 0 && (i3222 & 1) == 0) ? false : true;
            this.H = o.i(this.d, str, o.l(str) != null);
            x xVar522 = this.d;
            str2 = xVar522.s;
            i17 = i12 & 384;
            if (i17 == 256) {
            }
            i18 = 0;
            while (true) {
                if (i18 < i0Var.size()) {
                }
                i18++;
            }
            this.w = i15;
            this.F = o.c(this.d, jVar.n);
            this.K = i17 != 128 || i17 == 256;
            if (i17 != 128) {
            }
            this.L = z13;
            this.M = (i12 & 64) != 64;
            this.P = str2;
            if (str2 != null) {
            }
            i19 = 0;
            this.N = i19;
            if (z13) {
            }
            z14 = false;
            this.O = z14;
            z15 = this.e;
            jVar2 = this.f;
            xVar = this.d;
            if ((xVar.f & 16384) == 0) {
            }
            this.J = i28;
        }
        z12 = false;
        this.h = z12;
        this.n = h0.e(i12, false);
        x xVar4222 = this.d;
        float f11222 = xVar4222.D;
        this.r = f11222 == -1.0f && f11222 >= 10.0f;
        this.s = xVar4222.j;
        int i29222 = xVar4222.z;
        this.v = (i29222 != -1 || (i20 = xVar4222.A) == -1) ? -1 : i29222 * i20;
        i14 = 0;
        while (true) {
            size = i0Var2.size();
            i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i14 < size) {
            }
            i14++;
        }
        this.x = i14;
        this.y = i16;
        int i30222 = this.d.f;
        int i31222 = jVar.p;
        f9.q1 q1Var2222 = o.l;
        this.E = (i30222 == 0 && i30222 == i31222) ? Integer.MAX_VALUE : Integer.bitCount(i30222 & i31222);
        int i32222 = this.d.f;
        this.G = (i32222 == 0 && (i32222 & 1) == 0) ? false : true;
        this.H = o.i(this.d, str, o.l(str) != null);
        x xVar5222 = this.d;
        str2 = xVar5222.s;
        i17 = i12 & 384;
        if (i17 == 256) {
        }
        i18 = 0;
        while (true) {
            if (i18 < i0Var.size()) {
            }
            i18++;
        }
        this.w = i15;
        this.F = o.c(this.d, jVar.n);
        this.K = i17 != 128 || i17 == 256;
        if (i17 != 128) {
        }
        this.L = z13;
        this.M = (i12 & 64) != 64;
        this.P = str2;
        if (str2 != null) {
        }
        i19 = 0;
        this.N = i19;
        if (z13) {
        }
        z14 = false;
        this.O = z14;
        z15 = this.e;
        jVar2 = this.f;
        xVar = this.d;
        if ((xVar.f & 16384) == 0) {
        }
        this.J = i28;
    }

    public static int c(n nVar, n nVar2) {
        f9.w c10 = f9.w.a.c(nVar.n, nVar2.n);
        Integer valueOf = Integer.valueOf(nVar.x);
        Integer valueOf2 = Integer.valueOf(nVar2.x);
        n1 n1Var = n1.c;
        return c10.b(valueOf, valueOf2, n1Var).a(nVar.y, nVar2.y).a(nVar.E, nVar2.E).b(Integer.valueOf(nVar.F), Integer.valueOf(nVar2.F), n1Var).c(nVar.G, nVar2.G).a(nVar.H, nVar2.H).c(nVar.r, nVar2.r).c(nVar.e, nVar2.e).c(nVar.h, nVar2.h).b(Integer.valueOf(nVar.w), Integer.valueOf(nVar2.w), n1Var).c(nVar.K, nVar2.K).c(nVar.M, nVar2.M).e();
    }

    @Override // x2.m
    public final int a() {
        return this.J;
    }

    @Override // x2.m
    public final boolean b(m mVar) {
        n nVar = (n) mVar;
        if (!this.I && !Objects.equals(this.P, nVar.P)) {
            return false;
        }
        this.f.getClass();
        return this.K == nVar.K && this.M == nVar.M;
    }
}
