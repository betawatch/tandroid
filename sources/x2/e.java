package x2;

import android.text.TextUtils;
import b2.l1;
import b2.o1;
import e2.d0;
import e9.i0;
import e9.x0;
import e9.y0;
import e9.z;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e extends n implements Comparable {
    public final int E;
    public final int F;
    public final boolean G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final int e;
    public final boolean f;
    public final String h;
    public final i n;
    public final boolean r;
    public final int s;
    public final int v;
    public final int w;
    public final boolean x;
    public final boolean y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(int i10, l1 l1Var, int i11, i iVar, int i12, boolean z10, d dVar, int i13) {
        super(i10, l1Var, i11);
        int i14;
        int i15;
        boolean z11;
        String[] D;
        int i16;
        int i17;
        int i18;
        b2.s sVar;
        boolean z12;
        i iVar2;
        boolean z13;
        o1 o1Var;
        boolean z14;
        this.n = iVar;
        boolean z15 = iVar.r0;
        i0 i0Var = iVar.t;
        i0 i0Var2 = iVar.p;
        int i19 = z15 ? 24 : 16;
        int i20 = 0;
        this.x = false;
        this.h = p.g(this.d.d);
        this.r = hg.c.d(i12, false);
        int i21 = 0;
        while (true) {
            int size = i0Var2.size();
            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i21 >= size) {
                i15 = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                i15 = p.d(this.d, (String) i0Var2.get(i21), false);
                if (i15 > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.v = i21;
        this.s = i15;
        int i22 = this.d.f;
        int i23 = iVar.q;
        this.w = (i22 == 0 || i22 != i23) ? Integer.bitCount(i22 & i23) : Integer.MAX_VALUE;
        b2.s sVar2 = this.d;
        int i24 = sVar2.f;
        this.y = i24 == 0 || (i24 & 1) != 0;
        this.G = (sVar2.e & 1) != 0;
        String str = sVar2.r;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        z14 = false;
                        break;
                    }
                    z14 = -1;
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        z14 = true;
                        break;
                    }
                    z14 = -1;
                    break;
                case 1504698186:
                    if (str.equals("audio/iamf")) {
                        z14 = 2;
                        break;
                    }
                    z14 = -1;
                    break;
                default:
                    z14 = -1;
                    break;
            }
            switch (z14) {
                case false:
                case true:
                case true:
                    z11 = true;
                    break;
            }
            this.N = z11;
            int i25 = sVar2.J;
            this.H = i25;
            this.I = sVar2.K;
            int i26 = sVar2.j;
            this.J = i26;
            this.f = (i26 != -1 || i26 <= iVar.s) && (i25 == -1 || i25 <= iVar.r) && dVar.apply(sVar2);
            D = d0.D();
            i16 = 0;
            while (true) {
                if (i16 >= D.length) {
                    i17 = p.d(this.d, D[i16], false);
                    if (i17 <= 0) {
                        i16++;
                    }
                } else {
                    i17 = 0;
                    i16 = Integer.MAX_VALUE;
                }
            }
            this.E = i16;
            this.F = i17;
            i18 = 0;
            while (true) {
                if (i18 < i0Var.size()) {
                    String str2 = this.d.r;
                    if (str2 == null || !str2.equals(i0Var.get(i18))) {
                        i18++;
                    } else {
                        i14 = i18;
                    }
                }
            }
            this.K = i14;
            this.L = (i12 & 384) != 128;
            this.M = (i12 & 64) != 64;
            sVar = this.d;
            z12 = this.f;
            iVar2 = this.n;
            z13 = iVar2.t0;
            o1Var = iVar2.u;
            if (hg.c.d(i12, z13) && ((z12 || iVar2.q0) && (o1Var.a != 2 || p.i(iVar2, i12, sVar)))) {
                i20 = (hg.c.d(i12, false) || !z12 || sVar.j == -1 || iVar2.C || iVar2.B || (!iVar2.u0 && z10) || o1Var.a == 2 || (i19 & i12) == 0) ? 1 : 2;
            }
            this.e = i20;
        }
        z11 = false;
        this.N = z11;
        int i252 = sVar2.J;
        this.H = i252;
        this.I = sVar2.K;
        int i262 = sVar2.j;
        this.J = i262;
        this.f = (i262 != -1 || i262 <= iVar.s) && (i252 == -1 || i252 <= iVar.r) && dVar.apply(sVar2);
        D = d0.D();
        i16 = 0;
        while (true) {
            if (i16 >= D.length) {
            }
            i16++;
        }
        this.E = i16;
        this.F = i17;
        i18 = 0;
        while (true) {
            if (i18 < i0Var.size()) {
            }
            i18++;
        }
        this.K = i14;
        this.L = (i12 & 384) != 128;
        this.M = (i12 & 64) != 64;
        sVar = this.d;
        z12 = this.f;
        iVar2 = this.n;
        z13 = iVar2.t0;
        o1Var = iVar2.u;
        if (hg.c.d(i12, z13)) {
            if (hg.c.d(i12, false)) {
            }
        }
        this.e = i20;
    }

    @Override // x2.n
    public final int a() {
        return this.e;
    }

    @Override // x2.n
    public final boolean b(n nVar) {
        int i10;
        String str;
        e eVar = (e) nVar;
        b2.s sVar = eVar.d;
        this.n.getClass();
        b2.s sVar2 = this.d;
        int i11 = sVar2.J;
        if (i11 == -1 || i11 != sVar.J) {
            return false;
        }
        return (this.x || ((str = sVar2.r) != null && TextUtils.equals(str, sVar.r))) && (i10 = sVar2.K) != -1 && i10 == sVar.K && this.L == eVar.L && this.M == eVar.M;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        boolean z10 = this.r;
        boolean z11 = this.f;
        y0 a2 = (z11 && z10) ? p.l : p.l.a();
        boolean z12 = eVar.r;
        int i10 = eVar.J;
        z c10 = z.a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(eVar.v);
        x0 x0Var = x0.c;
        z b10 = c10.b(valueOf, valueOf2, x0Var).a(this.s, eVar.s).a(this.w, eVar.w).c(this.G, eVar.G).c(this.y, eVar.y).b(Integer.valueOf(this.E), Integer.valueOf(eVar.E), x0Var).a(this.F, eVar.F).c(z11, eVar.f).b(Integer.valueOf(this.K), Integer.valueOf(eVar.K), x0Var);
        boolean z13 = this.n.B;
        int i11 = this.J;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), p.l.a());
        }
        z b11 = b10.c(this.L, eVar.L).c(this.M, eVar.M).c(this.N, eVar.N).b(Integer.valueOf(this.H), Integer.valueOf(eVar.H), a2).b(Integer.valueOf(this.I), Integer.valueOf(eVar.I), a2);
        if (Objects.equals(this.h, eVar.h)) {
            b11 = b11.b(Integer.valueOf(i11), Integer.valueOf(i10), a2);
        }
        return b11.e();
    }
}
