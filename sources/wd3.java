// default package

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wd3 extends de3 implements Comparable {
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
    public final byte e;
    public final boolean f;
    public final String h;
    public final ae3 n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wd3(int i, uzb uzbVar, int i2, ae3 ae3Var, int i3, boolean z, vd3 vd3Var, int i4) {
        super(i, uzbVar, i2);
        int i5;
        int i6;
        boolean z2;
        String[] I;
        int i7;
        int i8;
        int i9;
        go4 go4Var;
        boolean z3;
        ae3 ae3Var2;
        boolean z4;
        b0c b0cVar;
        boolean z5;
        this.n = ae3Var;
        boolean z6 = ae3Var.z0;
        y79 y79Var = ae3Var.v;
        y79 y79Var2 = ae3Var.q;
        int i10 = z6 ? 24 : 16;
        byte b = 0;
        this.E = false;
        this.h = fe3.h(this.d.d);
        this.r = kt6.c(i3, false);
        int i11 = 0;
        while (true) {
            int i12 = y79Var2.d;
            i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i11 >= i12) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = fe3.g(this.d, (String) y79Var2.get(i11), false);
                if (i6 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.w = i11;
        this.s = i6;
        int i13 = this.d.f;
        int i14 = ae3Var.s;
        this.x = (i13 == 0 || i13 != i14) ? Integer.bitCount(i13 & i14) : Integer.MAX_VALUE;
        this.y = fe3.f(this.d, ae3Var.r);
        go4 go4Var2 = this.d;
        int i15 = go4Var2.f;
        this.F = i15 == 0 || (i15 & 1) != 0;
        this.I = (go4Var2.e & 1) != 0;
        String str = go4Var2.t;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        z5 = false;
                        break;
                    }
                    z5 = -1;
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        z5 = true;
                        break;
                    }
                    z5 = -1;
                    break;
                case 1504698186:
                    if (str.equals("audio/iamf")) {
                        z5 = 2;
                        break;
                    }
                    z5 = -1;
                    break;
                default:
                    z5 = -1;
                    break;
            }
            switch (z5) {
                case false:
                case true:
                case true:
                    z2 = true;
                    break;
            }
            this.P = z2;
            int i16 = go4Var2.N;
            this.J = i16;
            this.K = go4Var2.P;
            int i17 = go4Var2.k;
            this.L = i17;
            this.f = (i17 != -1 || i17 <= ae3Var.u) && (i16 == -1 || i16 <= ae3Var.t) && vd3Var.apply(go4Var2);
            I = hac.I();
            i7 = 0;
            while (true) {
                if (i7 >= I.length) {
                    i8 = fe3.g(this.d, I[i7], false);
                    if (i8 <= 0) {
                        i7++;
                    }
                } else {
                    i8 = 0;
                    i7 = Integer.MAX_VALUE;
                }
            }
            this.G = i7;
            this.H = i8;
            i9 = 0;
            while (true) {
                if (i9 < y79Var.d) {
                    String str2 = this.d.t;
                    if (str2 == null || !str2.equals(y79Var.get(i9))) {
                        i9++;
                    } else {
                        i5 = i9;
                    }
                }
            }
            this.M = i5;
            this.N = (i3 & 384) != 128;
            this.O = (i3 & 64) != 64;
            go4Var = this.d;
            z3 = this.f;
            ae3Var2 = this.n;
            z4 = ae3Var2.B0;
            b0cVar = ae3Var2.w;
            if (kt6.c(i3, z4) && ((z3 || ae3Var2.y0) && (b0cVar.a != 2 || fe3.j(ae3Var2, i3, go4Var)))) {
                b = (kt6.c(i3, false) || !z3 || go4Var.k == -1 || ae3Var2.G || ae3Var2.F || (!ae3Var2.C0 && z) || b0cVar.a == 2 || (i3 & i10) == 0) ? (byte) 1 : (byte) 2;
            }
            this.e = b;
        }
        z2 = false;
        this.P = z2;
        int i162 = go4Var2.N;
        this.J = i162;
        this.K = go4Var2.P;
        int i172 = go4Var2.k;
        this.L = i172;
        this.f = (i172 != -1 || i172 <= ae3Var.u) && (i162 == -1 || i162 <= ae3Var.t) && vd3Var.apply(go4Var2);
        I = hac.I();
        i7 = 0;
        while (true) {
            if (i7 >= I.length) {
            }
            i7++;
        }
        this.G = i7;
        this.H = i8;
        i9 = 0;
        while (true) {
            if (i9 < y79Var.d) {
            }
            i9++;
        }
        this.M = i5;
        this.N = (i3 & 384) != 128;
        this.O = (i3 & 64) != 64;
        go4Var = this.d;
        z3 = this.f;
        ae3Var2 = this.n;
        z4 = ae3Var2.B0;
        b0cVar = ae3Var2.w;
        if (kt6.c(i3, z4)) {
            if (kt6.c(i3, false)) {
            }
        }
        this.e = b;
    }

    @Override // de3
    public final int a() {
        return this.e;
    }

    @Override // de3
    public final boolean b(de3 de3Var) {
        int i;
        String str;
        wd3 wd3Var = (wd3) de3Var;
        go4 go4Var = wd3Var.d;
        this.n.getClass();
        go4 go4Var2 = this.d;
        int i2 = go4Var2.N;
        if (i2 == -1 || i2 != go4Var.N) {
            return false;
        }
        return (this.E || ((str = go4Var2.t) != null && TextUtils.equals(str, go4Var.t))) && (i = go4Var2.P) != -1 && i == go4Var.P && this.N == wd3Var.N && this.O == wd3Var.O;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wd3 wd3Var) {
        at7 at7Var;
        at7 a;
        boolean z = this.r;
        boolean z2 = this.f;
        if (z2 && z) {
            a = fe3.l;
            at7Var = a;
        } else {
            at7 at7Var2 = fe3.l;
            at7Var = at7Var2;
            a = at7Var2.a();
        }
        boolean z3 = wd3Var.r;
        int i = wd3Var.L;
        hq2 c = hq2.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(wd3Var.w);
        jk7 jk7Var = jk7.c;
        hq2 b = c.b(valueOf, valueOf2, jk7Var).a(this.s, wd3Var.s).a(this.x, wd3Var.x).b(Integer.valueOf(this.y), Integer.valueOf(wd3Var.y), jk7Var).c(this.I, wd3Var.I).c(this.F, wd3Var.F).b(Integer.valueOf(this.G), Integer.valueOf(wd3Var.G), jk7Var).a(this.H, wd3Var.H).c(z2, wd3Var.f).b(Integer.valueOf(this.M), Integer.valueOf(wd3Var.M), jk7Var);
        boolean z4 = this.n.F;
        int i2 = this.L;
        if (z4) {
            b = b.b(Integer.valueOf(i2), Integer.valueOf(i), at7Var.a());
        }
        hq2 b2 = b.c(this.N, wd3Var.N).c(this.O, wd3Var.O).c(this.P, wd3Var.P).b(Integer.valueOf(this.J), Integer.valueOf(wd3Var.J), a).b(Integer.valueOf(this.K), Integer.valueOf(wd3Var.K), a);
        if (Objects.equals(this.h, wd3Var.h)) {
            b2 = b2.b(Integer.valueOf(i2), Integer.valueOf(i), a);
        }
        return b2.e();
    }
}
