package x2;

import b2.p1;
import b2.w;
import e9.b0;
import e9.n0;
import e9.s1;
import e9.v1;
import i2.o1;
import j$.util.Objects;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class m extends l {
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
    public final i f;
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
    public m(int i10, p1 p1Var, int i11, i iVar, int i12, String str, int i13, boolean z10) {
        super(i10, p1Var, i11);
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
        i iVar2;
        w wVar;
        boolean z16;
        String c10;
        int i20;
        w wVar2;
        int i21;
        int i22;
        float f7;
        int i23;
        w wVar3;
        int i24;
        int i25;
        int i26;
        this.f = iVar;
        boolean z17 = iVar.x0;
        n0 n0Var = iVar.m;
        n0 n0Var2 = iVar.o;
        int i27 = z17 ? 24 : 16;
        int i28 = 0;
        this.I = false;
        if (z10 && (((i24 = (wVar3 = this.d).z) == -1 || i24 <= iVar.a) && ((i25 = wVar3.A) == -1 || i25 <= iVar.b))) {
            float f10 = wVar3.D;
            if ((f10 == -1.0f || f10 <= iVar.c) && ((i26 = wVar3.j) == -1 || i26 <= iVar.d)) {
                z11 = true;
                this.e = z11;
                if (z10 && (((i21 = (wVar2 = this.d).z) == -1 || i21 >= iVar.e) && ((i22 = wVar2.A) == -1 || i22 >= iVar.f))) {
                    f7 = wVar2.D;
                    if ((f7 != -1.0f || f7 >= iVar.g) && ((i23 = wVar2.j) == -1 || i23 >= iVar.h)) {
                        z12 = true;
                        this.h = z12;
                        this.n = o1.e(i12, false);
                        w wVar4 = this.d;
                        float f11 = wVar4.D;
                        this.r = f11 == -1.0f && f11 >= 10.0f;
                        this.s = wVar4.j;
                        int i29 = wVar4.z;
                        this.v = (i29 != -1 || (i20 = wVar4.A) == -1) ? -1 : i29 * i20;
                        i14 = 0;
                        while (true) {
                            size = n0Var2.size();
                            i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            if (i14 < size) {
                                i16 = 0;
                                i14 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i16 = n.i(this.d, (String) n0Var2.get(i14), false);
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
                        int i31 = iVar.p;
                        v1 v1Var = n.l;
                        this.E = (i30 == 0 && i30 == i31) ? Integer.MAX_VALUE : Integer.bitCount(i30 & i31);
                        int i32 = this.d.f;
                        this.G = (i32 == 0 && (i32 & 1) == 0) ? false : true;
                        this.H = n.i(this.d, str, n.l(str) != null);
                        w wVar5 = this.d;
                        str2 = wVar5.s;
                        i17 = i12 & 384;
                        if (i17 == 256 && (c10 = r2.w.c(wVar5)) != null) {
                            str2 = c10;
                        }
                        i18 = 0;
                        while (true) {
                            if (i18 < n0Var.size()) {
                                if (str2 != null && str2.equals(n0Var.get(i18))) {
                                    i15 = i18;
                                    break;
                                }
                                i18++;
                            } else {
                                break;
                            }
                        }
                        this.w = i15;
                        this.F = n.c(this.d, iVar.n);
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
                                b2.n nVar = this.d.I;
                                if (nVar != null) {
                                    int i33 = nVar.c;
                                    if (i33 == 7 || i33 == 6) {
                                        z14 = true;
                                        this.O = z14;
                                        z15 = this.e;
                                        iVar2 = this.f;
                                        wVar = this.d;
                                        if ((wVar.f & 16384) == 0 && o1.e(i12, iVar2.B0) && (z15 || iVar2.w0)) {
                                            i28 = (o1.e(i12, false) || !this.h || !z15 || wVar.j == -1 || iVar2.G || iVar2.F || (i27 & i12) == 0) ? 1 : 2;
                                        }
                                        this.J = i28;
                                    }
                                } else {
                                    b2.n nVar2 = b2.n.h;
                                }
                            }
                            z14 = false;
                            this.O = z14;
                            z15 = this.e;
                            iVar2 = this.f;
                            wVar = this.d;
                            if ((wVar.f & 16384) == 0) {
                                if (o1.e(i12, false)) {
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
                        iVar2 = this.f;
                        wVar = this.d;
                        if ((wVar.f & 16384) == 0) {
                        }
                        this.J = i28;
                    }
                }
                z12 = false;
                this.h = z12;
                this.n = o1.e(i12, false);
                w wVar42 = this.d;
                float f112 = wVar42.D;
                this.r = f112 == -1.0f && f112 >= 10.0f;
                this.s = wVar42.j;
                int i292 = wVar42.z;
                this.v = (i292 != -1 || (i20 = wVar42.A) == -1) ? -1 : i292 * i20;
                i14 = 0;
                while (true) {
                    size = n0Var2.size();
                    i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i14 < size) {
                    }
                    i14++;
                }
                this.x = i14;
                this.y = i16;
                int i302 = this.d.f;
                int i312 = iVar.p;
                v1 v1Var2 = n.l;
                this.E = (i302 == 0 && i302 == i312) ? Integer.MAX_VALUE : Integer.bitCount(i302 & i312);
                int i322 = this.d.f;
                this.G = (i322 == 0 && (i322 & 1) == 0) ? false : true;
                this.H = n.i(this.d, str, n.l(str) != null);
                w wVar52 = this.d;
                str2 = wVar52.s;
                i17 = i12 & 384;
                if (i17 == 256) {
                    str2 = c10;
                }
                i18 = 0;
                while (true) {
                    if (i18 < n0Var.size()) {
                    }
                    i18++;
                }
                this.w = i15;
                this.F = n.c(this.d, iVar.n);
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
                iVar2 = this.f;
                wVar = this.d;
                if ((wVar.f & 16384) == 0) {
                }
                this.J = i28;
            }
        }
        z11 = false;
        this.e = z11;
        if (z10) {
            f7 = wVar2.D;
            if (f7 != -1.0f) {
            }
            z12 = true;
            this.h = z12;
            this.n = o1.e(i12, false);
            w wVar422 = this.d;
            float f1122 = wVar422.D;
            this.r = f1122 == -1.0f && f1122 >= 10.0f;
            this.s = wVar422.j;
            int i2922 = wVar422.z;
            this.v = (i2922 != -1 || (i20 = wVar422.A) == -1) ? -1 : i2922 * i20;
            i14 = 0;
            while (true) {
                size = n0Var2.size();
                i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i14 < size) {
                }
                i14++;
            }
            this.x = i14;
            this.y = i16;
            int i3022 = this.d.f;
            int i3122 = iVar.p;
            v1 v1Var22 = n.l;
            this.E = (i3022 == 0 && i3022 == i3122) ? Integer.MAX_VALUE : Integer.bitCount(i3022 & i3122);
            int i3222 = this.d.f;
            this.G = (i3222 == 0 && (i3222 & 1) == 0) ? false : true;
            this.H = n.i(this.d, str, n.l(str) != null);
            w wVar522 = this.d;
            str2 = wVar522.s;
            i17 = i12 & 384;
            if (i17 == 256) {
            }
            i18 = 0;
            while (true) {
                if (i18 < n0Var.size()) {
                }
                i18++;
            }
            this.w = i15;
            this.F = n.c(this.d, iVar.n);
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
            iVar2 = this.f;
            wVar = this.d;
            if ((wVar.f & 16384) == 0) {
            }
            this.J = i28;
        }
        z12 = false;
        this.h = z12;
        this.n = o1.e(i12, false);
        w wVar4222 = this.d;
        float f11222 = wVar4222.D;
        this.r = f11222 == -1.0f && f11222 >= 10.0f;
        this.s = wVar4222.j;
        int i29222 = wVar4222.z;
        this.v = (i29222 != -1 || (i20 = wVar4222.A) == -1) ? -1 : i29222 * i20;
        i14 = 0;
        while (true) {
            size = n0Var2.size();
            i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i14 < size) {
            }
            i14++;
        }
        this.x = i14;
        this.y = i16;
        int i30222 = this.d.f;
        int i31222 = iVar.p;
        v1 v1Var222 = n.l;
        this.E = (i30222 == 0 && i30222 == i31222) ? Integer.MAX_VALUE : Integer.bitCount(i30222 & i31222);
        int i32222 = this.d.f;
        this.G = (i32222 == 0 && (i32222 & 1) == 0) ? false : true;
        this.H = n.i(this.d, str, n.l(str) != null);
        w wVar5222 = this.d;
        str2 = wVar5222.s;
        i17 = i12 & 384;
        if (i17 == 256) {
        }
        i18 = 0;
        while (true) {
            if (i18 < n0Var.size()) {
            }
            i18++;
        }
        this.w = i15;
        this.F = n.c(this.d, iVar.n);
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
        iVar2 = this.f;
        wVar = this.d;
        if ((wVar.f & 16384) == 0) {
        }
        this.J = i28;
    }

    public static int c(m mVar, m mVar2) {
        b0 c10 = b0.a.c(mVar.n, mVar2.n);
        Integer valueOf = Integer.valueOf(mVar.x);
        Integer valueOf2 = Integer.valueOf(mVar2.x);
        s1 s1Var = s1.c;
        return c10.b(valueOf, valueOf2, s1Var).a(mVar.y, mVar2.y).a(mVar.E, mVar2.E).b(Integer.valueOf(mVar.F), Integer.valueOf(mVar2.F), s1Var).c(mVar.G, mVar2.G).a(mVar.H, mVar2.H).c(mVar.r, mVar2.r).c(mVar.e, mVar2.e).c(mVar.h, mVar2.h).b(Integer.valueOf(mVar.w), Integer.valueOf(mVar2.w), s1Var).c(mVar.K, mVar2.K).c(mVar.M, mVar2.M).e();
    }

    @Override // x2.l
    public final int a() {
        return this.J;
    }

    @Override // x2.l
    public final boolean b(l lVar) {
        m mVar = (m) lVar;
        if (!this.I && !Objects.equals(this.P, mVar.P)) {
            return false;
        }
        this.f.getClass();
        return this.K == mVar.K && this.M == mVar.M;
    }
}
