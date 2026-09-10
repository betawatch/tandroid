package x2;

import b2.l1;
import e9.i0;
import e9.x0;
import e9.y0;
import e9.z;
import j$.util.Objects;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o extends n {
    public final int E;
    public final boolean F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final int L;
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
    /* JADX WARN: Removed duplicated region for block: B:137:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0118 A[EDGE_INSN: B:142:0x0118->B:80:0x0118 BREAK  A[LOOP:1: B:72:0x00fd->B:140:0x0115], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(int i10, l1 l1Var, int i11, i iVar, int i12, String str, int i13, boolean z10) {
        super(i10, l1Var, i11);
        boolean z11;
        boolean z12;
        int i14;
        int size;
        int i15;
        int i16;
        int i17;
        b2.s sVar;
        String str2;
        int i18;
        boolean z13;
        i iVar2;
        char c10;
        int i19;
        b2.s sVar2;
        int i20;
        int i21;
        float f7;
        int i22;
        b2.s sVar3;
        int i23;
        int i24;
        int i25;
        this.f = iVar;
        boolean z14 = iVar.p0;
        i0 i0Var = iVar.m;
        i0 i0Var2 = iVar.n;
        int i26 = z14 ? 24 : 16;
        int i27 = 0;
        this.H = false;
        if (z10 && (((i23 = (sVar3 = this.d).y) == -1 || i23 <= iVar.a) && ((i24 = sVar3.z) == -1 || i24 <= iVar.b))) {
            float f10 = sVar3.C;
            if ((f10 == -1.0f || f10 <= iVar.c) && ((i25 = sVar3.j) == -1 || i25 <= iVar.d)) {
                z11 = true;
                this.e = z11;
                if (z10 && (((i20 = (sVar2 = this.d).y) == -1 || i20 >= iVar.e) && ((i21 = sVar2.z) == -1 || i21 >= iVar.f))) {
                    f7 = sVar2.C;
                    if ((f7 != -1.0f || f7 >= iVar.g) && ((i22 = sVar2.j) == -1 || i22 >= iVar.h)) {
                        z12 = true;
                        this.h = z12;
                        this.n = hc.b.e(i12, false);
                        b2.s sVar4 = this.d;
                        float f11 = sVar4.C;
                        this.r = f11 == -1.0f && f11 >= 10.0f;
                        this.s = sVar4.j;
                        int i28 = sVar4.y;
                        this.v = (i28 != -1 || (i19 = sVar4.z) == -1) ? -1 : i28 * i19;
                        i14 = 0;
                        while (true) {
                            size = i0Var2.size();
                            i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            if (i14 < size) {
                                i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                i16 = 0;
                                break;
                            } else {
                                i16 = p.d(this.d, (String) i0Var2.get(i14), false);
                                if (i16 > 0) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                        this.x = i14;
                        this.y = i16;
                        int i29 = this.d.f;
                        int i30 = iVar.o;
                        y0 y0Var = p.l;
                        this.E = (i29 == 0 && i29 == i30) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i29 & i30);
                        int i31 = this.d.f;
                        this.F = (i31 == 0 && (i31 & 1) == 0) ? false : true;
                        this.G = p.d(this.d, str, p.g(str) != null);
                        i17 = 0;
                        while (true) {
                            if (i17 < i0Var.size()) {
                                String str3 = this.d.r;
                                if (str3 != null && str3.equals(i0Var.get(i17))) {
                                    i15 = i17;
                                    break;
                                }
                                i17++;
                            } else {
                                break;
                            }
                        }
                        this.w = i15;
                        this.J = (i12 & 384) != 128;
                        this.K = (i12 & 64) != 64;
                        sVar = this.d;
                        str2 = sVar.r;
                        if (str2 != null) {
                            i18 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1331836730:
                                    if (str2.equals(MediaController.VIDEO_MIME_TYPE)) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    i18 = 5;
                                    break;
                                case 2:
                                    i18 = 3;
                                    break;
                                case 3:
                                    i18 = 1;
                                    break;
                                case 4:
                                    i18 = 2;
                                    break;
                            }
                            this.L = i18;
                            z13 = this.e;
                            iVar2 = this.f;
                            if ((sVar.f & 16384) == 0 && hc.b.e(i12, iVar2.t0) && (z13 || iVar2.o0)) {
                                i27 = (hc.b.e(i12, false) || !this.h || !z13 || sVar.j == -1 || iVar2.C || iVar2.B || (i26 & i12) == 0) ? 1 : 2;
                            }
                            this.I = i27;
                        }
                        i18 = 0;
                        this.L = i18;
                        z13 = this.e;
                        iVar2 = this.f;
                        if ((sVar.f & 16384) == 0) {
                            if (hc.b.e(i12, false)) {
                            }
                        }
                        this.I = i27;
                    }
                }
                z12 = false;
                this.h = z12;
                this.n = hc.b.e(i12, false);
                b2.s sVar42 = this.d;
                float f112 = sVar42.C;
                this.r = f112 == -1.0f && f112 >= 10.0f;
                this.s = sVar42.j;
                int i282 = sVar42.y;
                this.v = (i282 != -1 || (i19 = sVar42.z) == -1) ? -1 : i282 * i19;
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
                int i292 = this.d.f;
                int i302 = iVar.o;
                y0 y0Var2 = p.l;
                this.E = (i292 == 0 && i292 == i302) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i292 & i302);
                int i312 = this.d.f;
                this.F = (i312 == 0 && (i312 & 1) == 0) ? false : true;
                this.G = p.d(this.d, str, p.g(str) != null);
                i17 = 0;
                while (true) {
                    if (i17 < i0Var.size()) {
                    }
                    i17++;
                }
                this.w = i15;
                this.J = (i12 & 384) != 128;
                this.K = (i12 & 64) != 64;
                sVar = this.d;
                str2 = sVar.r;
                if (str2 != null) {
                }
                i18 = 0;
                this.L = i18;
                z13 = this.e;
                iVar2 = this.f;
                if ((sVar.f & 16384) == 0) {
                }
                this.I = i27;
            }
        }
        z11 = false;
        this.e = z11;
        if (z10) {
            f7 = sVar2.C;
            if (f7 != -1.0f) {
            }
            z12 = true;
            this.h = z12;
            this.n = hc.b.e(i12, false);
            b2.s sVar422 = this.d;
            float f1122 = sVar422.C;
            this.r = f1122 == -1.0f && f1122 >= 10.0f;
            this.s = sVar422.j;
            int i2822 = sVar422.y;
            this.v = (i2822 != -1 || (i19 = sVar422.z) == -1) ? -1 : i2822 * i19;
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
            int i2922 = this.d.f;
            int i3022 = iVar.o;
            y0 y0Var22 = p.l;
            this.E = (i2922 == 0 && i2922 == i3022) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i2922 & i3022);
            int i3122 = this.d.f;
            this.F = (i3122 == 0 && (i3122 & 1) == 0) ? false : true;
            this.G = p.d(this.d, str, p.g(str) != null);
            i17 = 0;
            while (true) {
                if (i17 < i0Var.size()) {
                }
                i17++;
            }
            this.w = i15;
            this.J = (i12 & 384) != 128;
            this.K = (i12 & 64) != 64;
            sVar = this.d;
            str2 = sVar.r;
            if (str2 != null) {
            }
            i18 = 0;
            this.L = i18;
            z13 = this.e;
            iVar2 = this.f;
            if ((sVar.f & 16384) == 0) {
            }
            this.I = i27;
        }
        z12 = false;
        this.h = z12;
        this.n = hc.b.e(i12, false);
        b2.s sVar4222 = this.d;
        float f11222 = sVar4222.C;
        this.r = f11222 == -1.0f && f11222 >= 10.0f;
        this.s = sVar4222.j;
        int i28222 = sVar4222.y;
        this.v = (i28222 != -1 || (i19 = sVar4222.z) == -1) ? -1 : i28222 * i19;
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
        int i29222 = this.d.f;
        int i30222 = iVar.o;
        y0 y0Var222 = p.l;
        this.E = (i29222 == 0 && i29222 == i30222) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i29222 & i30222);
        int i31222 = this.d.f;
        this.F = (i31222 == 0 && (i31222 & 1) == 0) ? false : true;
        this.G = p.d(this.d, str, p.g(str) != null);
        i17 = 0;
        while (true) {
            if (i17 < i0Var.size()) {
            }
            i17++;
        }
        this.w = i15;
        this.J = (i12 & 384) != 128;
        this.K = (i12 & 64) != 64;
        sVar = this.d;
        str2 = sVar.r;
        if (str2 != null) {
        }
        i18 = 0;
        this.L = i18;
        z13 = this.e;
        iVar2 = this.f;
        if ((sVar.f & 16384) == 0) {
        }
        this.I = i27;
    }

    public static int c(o oVar, o oVar2) {
        z c10 = z.a.c(oVar.n, oVar2.n);
        Integer valueOf = Integer.valueOf(oVar.x);
        Integer valueOf2 = Integer.valueOf(oVar2.x);
        x0 x0Var = x0.c;
        z b10 = c10.b(valueOf, valueOf2, x0Var).a(oVar.y, oVar2.y).a(oVar.E, oVar2.E).c(oVar.F, oVar2.F).a(oVar.G, oVar2.G).c(oVar.r, oVar2.r).c(oVar.e, oVar2.e).c(oVar.h, oVar2.h).b(Integer.valueOf(oVar.w), Integer.valueOf(oVar2.w), x0Var);
        boolean z10 = oVar.J;
        z c11 = b10.c(z10, oVar2.J);
        boolean z11 = oVar.K;
        z c12 = c11.c(z11, oVar2.K);
        if (z10 && z11) {
            c12 = c12.a(oVar.L, oVar2.L);
        }
        return c12.e();
    }

    @Override // x2.n
    public final int a() {
        return this.I;
    }

    @Override // x2.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (!this.H && !Objects.equals(this.d.r, oVar.d.r)) {
            return false;
        }
        this.f.getClass();
        return this.J == oVar.J && this.K == oVar.K;
    }
}
