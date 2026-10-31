package x2;

import android.text.TextUtils;
import b2.p1;
import b2.s1;
import b2.x;
import e2.l0;
import e9.b0;
import e9.n0;
import e9.v1;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends m implements Comparable {
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final int e;
    public final boolean f;
    public final String h;
    public final j n;
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
    public f(int i10, p1 p1Var, int i11, j jVar, int i12, boolean z10, d dVar, int i13) {
        super(i10, p1Var, i11);
        int i14;
        int i15;
        boolean z11;
        String[] G;
        int i16;
        int i17;
        int i18;
        x xVar;
        boolean z12;
        j jVar2;
        boolean z13;
        s1 s1Var;
        boolean z14;
        this.n = jVar;
        boolean z15 = jVar.z0;
        n0 n0Var = jVar.v;
        n0 n0Var2 = jVar.q;
        int i19 = z15 ? 24 : 16;
        int i20 = 0;
        this.D = false;
        this.h = o.l(this.d.d);
        this.r = i0.a.b(i12, false);
        int i21 = 0;
        while (true) {
            int size = n0Var2.size();
            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i21 >= size) {
                i15 = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                i15 = o.i(this.d, (String) n0Var2.get(i21), false);
                if (i15 > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.w = i21;
        this.s = i15;
        int i22 = this.d.f;
        int i23 = jVar.s;
        this.x = (i22 == 0 || i22 != i23) ? Integer.bitCount(i22 & i23) : Integer.MAX_VALUE;
        this.y = o.c(this.d, jVar.r);
        x xVar2 = this.d;
        int i24 = xVar2.f;
        this.E = i24 == 0 || (i24 & 1) != 0;
        this.H = (xVar2.e & 1) != 0;
        String str = xVar2.s;
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
            this.O = z11;
            int i25 = xVar2.K;
            this.I = i25;
            this.J = xVar2.L;
            int i26 = xVar2.j;
            this.K = i26;
            this.f = (i26 != -1 || i26 <= jVar.u) && (i25 == -1 || i25 <= jVar.t) && dVar.apply(xVar2);
            G = l0.G();
            i16 = 0;
            while (true) {
                if (i16 >= G.length) {
                    i17 = o.i(this.d, G[i16], false);
                    if (i17 <= 0) {
                        i16++;
                    }
                } else {
                    i17 = 0;
                    i16 = Integer.MAX_VALUE;
                }
            }
            this.F = i16;
            this.G = i17;
            i18 = 0;
            while (true) {
                if (i18 < n0Var.size()) {
                    String str2 = this.d.s;
                    if (str2 == null || !str2.equals(n0Var.get(i18))) {
                        i18++;
                    } else {
                        i14 = i18;
                    }
                }
            }
            this.L = i14;
            this.M = (i12 & 384) != 128;
            this.N = (i12 & 64) != 64;
            xVar = this.d;
            z12 = this.f;
            jVar2 = this.n;
            z13 = jVar2.B0;
            s1Var = jVar2.w;
            if (i0.a.b(i12, z13) && ((z12 || jVar2.y0) && (s1Var.a != 2 || o.n(jVar2, i12, xVar)))) {
                i20 = (i0.a.b(i12, false) || !z12 || xVar.j == -1 || jVar2.G || jVar2.F || (!jVar2.C0 && z10) || s1Var.a == 2 || (i19 & i12) == 0) ? 1 : 2;
            }
            this.e = i20;
        }
        z11 = false;
        this.O = z11;
        int i252 = xVar2.K;
        this.I = i252;
        this.J = xVar2.L;
        int i262 = xVar2.j;
        this.K = i262;
        this.f = (i262 != -1 || i262 <= jVar.u) && (i252 == -1 || i252 <= jVar.t) && dVar.apply(xVar2);
        G = l0.G();
        i16 = 0;
        while (true) {
            if (i16 >= G.length) {
            }
            i16++;
        }
        this.F = i16;
        this.G = i17;
        i18 = 0;
        while (true) {
            if (i18 < n0Var.size()) {
            }
            i18++;
        }
        this.L = i14;
        this.M = (i12 & 384) != 128;
        this.N = (i12 & 64) != 64;
        xVar = this.d;
        z12 = this.f;
        jVar2 = this.n;
        z13 = jVar2.B0;
        s1Var = jVar2.w;
        if (i0.a.b(i12, z13)) {
            if (i0.a.b(i12, false)) {
            }
        }
        this.e = i20;
    }

    @Override // x2.m
    public final int a() {
        return this.e;
    }

    @Override // x2.m
    public final boolean b(m mVar) {
        int i10;
        String str;
        f fVar = (f) mVar;
        x xVar = fVar.d;
        this.n.getClass();
        x xVar2 = this.d;
        int i11 = xVar2.K;
        if (i11 == -1 || i11 != xVar.K) {
            return false;
        }
        return (this.D || ((str = xVar2.s) != null && TextUtils.equals(str, xVar.s))) && (i10 = xVar2.L) != -1 && i10 == xVar.L && this.M == fVar.M && this.N == fVar.N;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z10 = this.r;
        boolean z11 = this.f;
        v1 a2 = (z11 && z10) ? o.l : o.l.a();
        boolean z12 = fVar.r;
        int i10 = fVar.K;
        b0 c10 = b0.a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(fVar.w);
        e9.s1 s1Var = e9.s1.c;
        b0 b10 = c10.b(valueOf, valueOf2, s1Var).a(this.s, fVar.s).a(this.x, fVar.x).b(Integer.valueOf(this.y), Integer.valueOf(fVar.y), s1Var).c(this.H, fVar.H).c(this.E, fVar.E).b(Integer.valueOf(this.F), Integer.valueOf(fVar.F), s1Var).a(this.G, fVar.G).c(z11, fVar.f).b(Integer.valueOf(this.L), Integer.valueOf(fVar.L), s1Var);
        boolean z13 = this.n.F;
        int i11 = this.K;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i11), Integer.valueOf(i10), o.l.a());
        }
        b0 b11 = b10.c(this.M, fVar.M).c(this.N, fVar.N).c(this.O, fVar.O).b(Integer.valueOf(this.I), Integer.valueOf(fVar.I), a2).b(Integer.valueOf(this.J), Integer.valueOf(fVar.J), a2);
        if (Objects.equals(this.h, fVar.h)) {
            b11 = b11.b(Integer.valueOf(i11), Integer.valueOf(i10), a2);
        }
        return b11.e();
    }
}
