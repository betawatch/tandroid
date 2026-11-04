package z2;

import d2.o1;
import d2.v;
import g9.i0;
import g9.n1;
import g9.q1;
import j$.util.Objects;
import k2.p1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import t2.w;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends l {
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final int O;
    public final boolean P;
    public final String Q;
    public final boolean e;
    public final i f;
    public final boolean h;
    public final boolean n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c3  */
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
    public m(int i3, o1 o1Var, int i10, i iVar, int i11, String str, int i12, boolean z10) {
        super(i3, o1Var, i10);
        boolean z11;
        boolean z12;
        int i13;
        int size;
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        boolean z15;
        i iVar2;
        v vVar;
        boolean z16;
        String c2;
        int i19;
        v vVar2;
        int i20;
        int i21;
        float f10;
        int i22;
        v vVar3;
        int i23;
        int i24;
        int i25;
        this.f = iVar;
        boolean z17 = iVar.x0;
        i0 i0Var = iVar.m;
        i0 i0Var2 = iVar.o;
        int i26 = z17 ? 24 : 16;
        int i27 = 0;
        this.J = false;
        if (z10 && (((i23 = (vVar3 = this.d).z) == -1 || i23 <= iVar.a) && ((i24 = vVar3.A) == -1 || i24 <= iVar.b))) {
            float f11 = vVar3.D;
            if ((f11 == -1.0f || f11 <= iVar.c) && ((i25 = vVar3.j) == -1 || i25 <= iVar.d)) {
                z11 = true;
                this.e = z11;
                if (z10 && (((i20 = (vVar2 = this.d).z) == -1 || i20 >= iVar.e) && ((i21 = vVar2.A) == -1 || i21 >= iVar.f))) {
                    f10 = vVar2.D;
                    if ((f10 != -1.0f || f10 >= iVar.g) && ((i22 = vVar2.j) == -1 || i22 >= iVar.h)) {
                        z12 = true;
                        this.h = z12;
                        this.n = p1.b(i11, false);
                        v vVar4 = this.d;
                        float f12 = vVar4.D;
                        this.r = f12 == -1.0f && f12 >= 10.0f;
                        this.s = vVar4.j;
                        int i28 = vVar4.z;
                        this.w = (i28 != -1 || (i19 = vVar4.A) == -1) ? -1 : i28 * i19;
                        i13 = 0;
                        while (true) {
                            size = i0Var2.size();
                            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            if (i13 < size) {
                                i15 = 0;
                                i13 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i15 = n.i(this.d, (String) i0Var2.get(i13), false);
                                if (i15 > 0) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        this.y = i13;
                        this.E = i15;
                        int i29 = this.d.f;
                        int i30 = iVar.p;
                        q1 q1Var = n.l;
                        this.F = (i29 == 0 && i29 == i30) ? Integer.MAX_VALUE : Integer.bitCount(i29 & i30);
                        int i31 = this.d.f;
                        this.H = (i31 == 0 && (i31 & 1) == 0) ? false : true;
                        this.I = n.i(this.d, str, n.l(str) != null);
                        v vVar5 = this.d;
                        str2 = vVar5.s;
                        i16 = i11 & 384;
                        if (i16 == 256 && (c2 = w.c(vVar5)) != null) {
                            str2 = c2;
                        }
                        i17 = 0;
                        while (true) {
                            if (i17 < i0Var.size()) {
                                if (str2 != null && str2.equals(i0Var.get(i17))) {
                                    i14 = i17;
                                    break;
                                }
                                i17++;
                            } else {
                                break;
                            }
                        }
                        this.x = i14;
                        this.G = n.c(this.d, iVar.n);
                        this.L = i16 != 128 || i16 == 256;
                        z13 = i16 != 128;
                        this.M = z13;
                        this.N = (i11 & 64) != 64;
                        this.Q = str2;
                        if (str2 != null) {
                            i18 = 4;
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
                                    if (str2.equals("video/avc")) {
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
                                    i18 = 5;
                                    break;
                                case true:
                                    i18 = 3;
                                    break;
                                case true:
                                    i18 = 1;
                                    break;
                                case true:
                                    i18 = 2;
                                    break;
                            }
                            this.O = i18;
                            if (z13) {
                                d2.n nVar = this.d.I;
                                if (nVar != null) {
                                    int i32 = nVar.c;
                                    if (i32 == 7 || i32 == 6) {
                                        z14 = true;
                                        this.P = z14;
                                        z15 = this.e;
                                        iVar2 = this.f;
                                        vVar = this.d;
                                        if ((vVar.f & TLObject.FLAG_14) == 0 && p1.b(i11, iVar2.B0) && (z15 || iVar2.w0)) {
                                            i27 = (p1.b(i11, false) || !this.h || !z15 || vVar.j == -1 || iVar2.G || iVar2.F || (i26 & i11) == 0) ? 1 : 2;
                                        }
                                        this.K = i27;
                                    }
                                } else {
                                    d2.n nVar2 = d2.n.h;
                                }
                            }
                            z14 = false;
                            this.P = z14;
                            z15 = this.e;
                            iVar2 = this.f;
                            vVar = this.d;
                            if ((vVar.f & TLObject.FLAG_14) == 0) {
                                if (p1.b(i11, false)) {
                                }
                            }
                            this.K = i27;
                        }
                        i18 = 0;
                        this.O = i18;
                        if (z13) {
                        }
                        z14 = false;
                        this.P = z14;
                        z15 = this.e;
                        iVar2 = this.f;
                        vVar = this.d;
                        if ((vVar.f & TLObject.FLAG_14) == 0) {
                        }
                        this.K = i27;
                    }
                }
                z12 = false;
                this.h = z12;
                this.n = p1.b(i11, false);
                v vVar42 = this.d;
                float f122 = vVar42.D;
                this.r = f122 == -1.0f && f122 >= 10.0f;
                this.s = vVar42.j;
                int i282 = vVar42.z;
                this.w = (i282 != -1 || (i19 = vVar42.A) == -1) ? -1 : i282 * i19;
                i13 = 0;
                while (true) {
                    size = i0Var2.size();
                    i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i13 < size) {
                    }
                    i13++;
                }
                this.y = i13;
                this.E = i15;
                int i292 = this.d.f;
                int i302 = iVar.p;
                q1 q1Var2 = n.l;
                this.F = (i292 == 0 && i292 == i302) ? Integer.MAX_VALUE : Integer.bitCount(i292 & i302);
                int i312 = this.d.f;
                this.H = (i312 == 0 && (i312 & 1) == 0) ? false : true;
                this.I = n.i(this.d, str, n.l(str) != null);
                v vVar52 = this.d;
                str2 = vVar52.s;
                i16 = i11 & 384;
                if (i16 == 256) {
                    str2 = c2;
                }
                i17 = 0;
                while (true) {
                    if (i17 < i0Var.size()) {
                    }
                    i17++;
                }
                this.x = i14;
                this.G = n.c(this.d, iVar.n);
                this.L = i16 != 128 || i16 == 256;
                if (i16 != 128) {
                }
                this.M = z13;
                this.N = (i11 & 64) != 64;
                this.Q = str2;
                if (str2 != null) {
                }
                i18 = 0;
                this.O = i18;
                if (z13) {
                }
                z14 = false;
                this.P = z14;
                z15 = this.e;
                iVar2 = this.f;
                vVar = this.d;
                if ((vVar.f & TLObject.FLAG_14) == 0) {
                }
                this.K = i27;
            }
        }
        z11 = false;
        this.e = z11;
        if (z10) {
            f10 = vVar2.D;
            if (f10 != -1.0f) {
            }
            z12 = true;
            this.h = z12;
            this.n = p1.b(i11, false);
            v vVar422 = this.d;
            float f1222 = vVar422.D;
            this.r = f1222 == -1.0f && f1222 >= 10.0f;
            this.s = vVar422.j;
            int i2822 = vVar422.z;
            this.w = (i2822 != -1 || (i19 = vVar422.A) == -1) ? -1 : i2822 * i19;
            i13 = 0;
            while (true) {
                size = i0Var2.size();
                i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i13 < size) {
                }
                i13++;
            }
            this.y = i13;
            this.E = i15;
            int i2922 = this.d.f;
            int i3022 = iVar.p;
            q1 q1Var22 = n.l;
            this.F = (i2922 == 0 && i2922 == i3022) ? Integer.MAX_VALUE : Integer.bitCount(i2922 & i3022);
            int i3122 = this.d.f;
            this.H = (i3122 == 0 && (i3122 & 1) == 0) ? false : true;
            this.I = n.i(this.d, str, n.l(str) != null);
            v vVar522 = this.d;
            str2 = vVar522.s;
            i16 = i11 & 384;
            if (i16 == 256) {
            }
            i17 = 0;
            while (true) {
                if (i17 < i0Var.size()) {
                }
                i17++;
            }
            this.x = i14;
            this.G = n.c(this.d, iVar.n);
            this.L = i16 != 128 || i16 == 256;
            if (i16 != 128) {
            }
            this.M = z13;
            this.N = (i11 & 64) != 64;
            this.Q = str2;
            if (str2 != null) {
            }
            i18 = 0;
            this.O = i18;
            if (z13) {
            }
            z14 = false;
            this.P = z14;
            z15 = this.e;
            iVar2 = this.f;
            vVar = this.d;
            if ((vVar.f & TLObject.FLAG_14) == 0) {
            }
            this.K = i27;
        }
        z12 = false;
        this.h = z12;
        this.n = p1.b(i11, false);
        v vVar4222 = this.d;
        float f12222 = vVar4222.D;
        this.r = f12222 == -1.0f && f12222 >= 10.0f;
        this.s = vVar4222.j;
        int i28222 = vVar4222.z;
        this.w = (i28222 != -1 || (i19 = vVar4222.A) == -1) ? -1 : i28222 * i19;
        i13 = 0;
        while (true) {
            size = i0Var2.size();
            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i13 < size) {
            }
            i13++;
        }
        this.y = i13;
        this.E = i15;
        int i29222 = this.d.f;
        int i30222 = iVar.p;
        q1 q1Var222 = n.l;
        this.F = (i29222 == 0 && i29222 == i30222) ? Integer.MAX_VALUE : Integer.bitCount(i29222 & i30222);
        int i31222 = this.d.f;
        this.H = (i31222 == 0 && (i31222 & 1) == 0) ? false : true;
        this.I = n.i(this.d, str, n.l(str) != null);
        v vVar5222 = this.d;
        str2 = vVar5222.s;
        i16 = i11 & 384;
        if (i16 == 256) {
        }
        i17 = 0;
        while (true) {
            if (i17 < i0Var.size()) {
            }
            i17++;
        }
        this.x = i14;
        this.G = n.c(this.d, iVar.n);
        this.L = i16 != 128 || i16 == 256;
        if (i16 != 128) {
        }
        this.M = z13;
        this.N = (i11 & 64) != 64;
        this.Q = str2;
        if (str2 != null) {
        }
        i18 = 0;
        this.O = i18;
        if (z13) {
        }
        z14 = false;
        this.P = z14;
        z15 = this.e;
        iVar2 = this.f;
        vVar = this.d;
        if ((vVar.f & TLObject.FLAG_14) == 0) {
        }
        this.K = i27;
    }

    public static int c(m mVar, m mVar2) {
        g9.w c2 = g9.w.a.c(mVar.n, mVar2.n);
        Integer valueOf = Integer.valueOf(mVar.y);
        Integer valueOf2 = Integer.valueOf(mVar2.y);
        n1 n1Var = n1.c;
        return c2.b(valueOf, valueOf2, n1Var).a(mVar.E, mVar2.E).a(mVar.F, mVar2.F).b(Integer.valueOf(mVar.G), Integer.valueOf(mVar2.G), n1Var).c(mVar.H, mVar2.H).a(mVar.I, mVar2.I).c(mVar.r, mVar2.r).c(mVar.e, mVar2.e).c(mVar.h, mVar2.h).b(Integer.valueOf(mVar.x), Integer.valueOf(mVar2.x), n1Var).c(mVar.L, mVar2.L).c(mVar.N, mVar2.N).e();
    }

    @Override // z2.l
    public final int a() {
        return this.K;
    }

    @Override // z2.l
    public final boolean b(l lVar) {
        m mVar = (m) lVar;
        if (!this.J && !Objects.equals(this.Q, mVar.Q)) {
            return false;
        }
        this.f.getClass();
        return this.L == mVar.L && this.N == mVar.N;
    }
}
