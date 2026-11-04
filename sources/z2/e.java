package z2;

import android.text.TextUtils;
import d2.o1;
import d2.q1;
import d2.v;
import g2.n0;
import g9.i0;
import g9.n1;
import g9.w;
import j$.util.Objects;
import k2.p1;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends l implements Comparable {
    public final boolean E;
    public final boolean F;
    public final int G;
    public final int H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int e;
    public final boolean f;
    public final String h;
    public final i n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(int i3, o1 o1Var, int i10, i iVar, int i11, boolean z10, d dVar, int i12) {
        super(i3, o1Var, i10);
        int i13;
        int i14;
        boolean z11;
        String[] G;
        int i15;
        int i16;
        int i17;
        v vVar;
        boolean z12;
        i iVar2;
        boolean z13;
        q1 q1Var;
        boolean z14;
        this.n = iVar;
        boolean z15 = iVar.z0;
        i0 i0Var = iVar.v;
        i0 i0Var2 = iVar.q;
        int i18 = z15 ? 24 : 16;
        int i19 = 0;
        this.E = false;
        this.h = n.l(this.d.d);
        this.r = p1.b(i11, false);
        int i20 = 0;
        while (true) {
            int size = i0Var2.size();
            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i20 >= size) {
                i14 = 0;
                i20 = Integer.MAX_VALUE;
                break;
            } else {
                i14 = n.i(this.d, (String) i0Var2.get(i20), false);
                if (i14 > 0) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.w = i20;
        this.s = i14;
        int i21 = this.d.f;
        int i22 = iVar.s;
        this.x = (i21 == 0 || i21 != i22) ? Integer.bitCount(i21 & i22) : Integer.MAX_VALUE;
        this.y = n.c(this.d, iVar.r);
        v vVar2 = this.d;
        int i23 = vVar2.f;
        this.F = i23 == 0 || (i23 & 1) != 0;
        this.I = (vVar2.e & 1) != 0;
        String str = vVar2.s;
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
            this.P = z11;
            int i24 = vVar2.K;
            this.J = i24;
            this.K = vVar2.L;
            int i25 = vVar2.j;
            this.L = i25;
            this.f = (i25 != -1 || i25 <= iVar.u) && (i24 == -1 || i24 <= iVar.t) && dVar.apply(vVar2);
            G = n0.G();
            i15 = 0;
            while (true) {
                if (i15 >= G.length) {
                    i16 = n.i(this.d, G[i15], false);
                    if (i16 <= 0) {
                        i15++;
                    }
                } else {
                    i16 = 0;
                    i15 = Integer.MAX_VALUE;
                }
            }
            this.G = i15;
            this.H = i16;
            i17 = 0;
            while (true) {
                if (i17 < i0Var.size()) {
                    String str2 = this.d.s;
                    if (str2 == null || !str2.equals(i0Var.get(i17))) {
                        i17++;
                    } else {
                        i13 = i17;
                    }
                }
            }
            this.M = i13;
            this.N = (i11 & 384) != 128;
            this.O = (i11 & 64) != 64;
            vVar = this.d;
            z12 = this.f;
            iVar2 = this.n;
            z13 = iVar2.B0;
            q1Var = iVar2.w;
            if (p1.b(i11, z13) && ((z12 || iVar2.y0) && (q1Var.a != 2 || n.n(iVar2, i11, vVar)))) {
                i19 = (p1.b(i11, false) || !z12 || vVar.j == -1 || iVar2.G || iVar2.F || (!iVar2.C0 && z10) || q1Var.a == 2 || (i18 & i11) == 0) ? 1 : 2;
            }
            this.e = i19;
        }
        z11 = false;
        this.P = z11;
        int i242 = vVar2.K;
        this.J = i242;
        this.K = vVar2.L;
        int i252 = vVar2.j;
        this.L = i252;
        this.f = (i252 != -1 || i252 <= iVar.u) && (i242 == -1 || i242 <= iVar.t) && dVar.apply(vVar2);
        G = n0.G();
        i15 = 0;
        while (true) {
            if (i15 >= G.length) {
            }
            i15++;
        }
        this.G = i15;
        this.H = i16;
        i17 = 0;
        while (true) {
            if (i17 < i0Var.size()) {
            }
            i17++;
        }
        this.M = i13;
        this.N = (i11 & 384) != 128;
        this.O = (i11 & 64) != 64;
        vVar = this.d;
        z12 = this.f;
        iVar2 = this.n;
        z13 = iVar2.B0;
        q1Var = iVar2.w;
        if (p1.b(i11, z13)) {
            if (p1.b(i11, false)) {
            }
        }
        this.e = i19;
    }

    @Override // z2.l
    public final int a() {
        return this.e;
    }

    @Override // z2.l
    public final boolean b(l lVar) {
        int i3;
        String str;
        e eVar = (e) lVar;
        v vVar = eVar.d;
        this.n.getClass();
        v vVar2 = this.d;
        int i10 = vVar2.K;
        if (i10 == -1 || i10 != vVar.K) {
            return false;
        }
        return (this.E || ((str = vVar2.s) != null && TextUtils.equals(str, vVar.s))) && (i3 = vVar2.L) != -1 && i3 == vVar.L && this.N == eVar.N && this.O == eVar.O;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        boolean z10 = this.r;
        boolean z11 = this.f;
        g9.q1 a10 = (z11 && z10) ? n.l : n.l.a();
        boolean z12 = eVar.r;
        int i3 = eVar.L;
        w c2 = w.a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(eVar.w);
        n1 n1Var = n1.c;
        w b10 = c2.b(valueOf, valueOf2, n1Var).a(this.s, eVar.s).a(this.x, eVar.x).b(Integer.valueOf(this.y), Integer.valueOf(eVar.y), n1Var).c(this.I, eVar.I).c(this.F, eVar.F).b(Integer.valueOf(this.G), Integer.valueOf(eVar.G), n1Var).a(this.H, eVar.H).c(z11, eVar.f).b(Integer.valueOf(this.M), Integer.valueOf(eVar.M), n1Var);
        boolean z13 = this.n.F;
        int i10 = this.L;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i10), Integer.valueOf(i3), n.l.a());
        }
        w b11 = b10.c(this.N, eVar.N).c(this.O, eVar.O).c(this.P, eVar.P).b(Integer.valueOf(this.J), Integer.valueOf(eVar.J), a10).b(Integer.valueOf(this.K), Integer.valueOf(eVar.K), a10);
        if (Objects.equals(this.h, eVar.h)) {
            b11 = b11.b(Integer.valueOf(i10), Integer.valueOf(i3), a10);
        }
        return b11.e();
    }
}
