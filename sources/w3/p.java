package w3;

import android.util.SparseArray;
import f2.g0;
import h3.s0;
import h3.t0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p implements h {
    public final a0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public m3.w j;
    public o k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final g0 d = new g0(7);
    public final g0 e = new g0(8);
    public final g0 f = new g0(6);
    public long m = -9223372036854775807L;
    public final d5.z o = new d5.z();

    public p(a0 a0Var, boolean z10, boolean z11) {
        this.a = a0Var;
        this.b = z10;
        this.c = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (!this.l || this.k.c) {
            this.d.a(i10, i11, bArr);
            this.e.a(i10, i11, bArr);
        }
        this.f.a(i10, i11, bArr);
        o oVar = this.k;
        SparseArray sparseArray = oVar.e;
        d5.y yVar = oVar.f;
        if (oVar.k) {
            int i18 = i11 - i10;
            byte[] bArr2 = oVar.g;
            int length = bArr2.length;
            int i19 = oVar.h + i18;
            if (length < i19) {
                oVar.g = Arrays.copyOf(bArr2, i19 * 2);
            }
            System.arraycopy(bArr, i10, oVar.g, oVar.h, i18);
            int i20 = oVar.h + i18;
            oVar.h = i20;
            yVar.b = oVar.g;
            yVar.d = 0;
            yVar.c = i20;
            yVar.e = 0;
            yVar.a();
            if (yVar.d(8)) {
                yVar.r();
                int i21 = yVar.i(2);
                yVar.s(5);
                if (yVar.e()) {
                    yVar.l();
                    if (yVar.e()) {
                        int l10 = yVar.l();
                        if (!oVar.c) {
                            oVar.k = false;
                            n nVar = oVar.n;
                            nVar.e = l10;
                            nVar.b = true;
                            return;
                        }
                        if (yVar.e()) {
                            int l11 = yVar.l();
                            if (sparseArray.indexOfKey(l11) < 0) {
                                oVar.k = false;
                                return;
                            }
                            d5.s sVar = (d5.s) sparseArray.get(l11);
                            SparseArray sparseArray2 = oVar.d;
                            int i22 = sVar.a;
                            boolean z14 = sVar.b;
                            d5.t tVar = (d5.t) sparseArray2.get(i22);
                            boolean z15 = tVar.h;
                            int i23 = tVar.l;
                            int i24 = tVar.j;
                            if (z15) {
                                if (!yVar.d(2)) {
                                    return;
                                } else {
                                    yVar.s(2);
                                }
                            }
                            if (yVar.d(i24)) {
                                int i25 = yVar.i(i24);
                                if (tVar.i) {
                                    z10 = false;
                                } else {
                                    if (!yVar.d(1)) {
                                        return;
                                    }
                                    z10 = yVar.h();
                                    if (z10) {
                                        if (yVar.d(1)) {
                                            z11 = yVar.h();
                                            z12 = true;
                                            z13 = oVar.i != 5;
                                            if (z13) {
                                                i12 = 0;
                                            } else if (!yVar.e()) {
                                                return;
                                            } else {
                                                i12 = yVar.l();
                                            }
                                            i13 = tVar.k;
                                            if (i13 != 0) {
                                                if (!yVar.d(i23)) {
                                                    return;
                                                }
                                                i16 = yVar.i(i23);
                                                if (!z14 || z10) {
                                                    i14 = 0;
                                                } else if (!yVar.e()) {
                                                    return;
                                                } else {
                                                    i14 = yVar.m();
                                                }
                                                i15 = 0;
                                            } else {
                                                if (i13 == 1 && !tVar.m) {
                                                    if (yVar.e()) {
                                                        int m10 = yVar.m();
                                                        if (!z14 || z10) {
                                                            i17 = m10;
                                                            i14 = 0;
                                                            i15 = 0;
                                                        } else {
                                                            if (!yVar.e()) {
                                                                return;
                                                            }
                                                            i15 = yVar.m();
                                                            i17 = m10;
                                                            i14 = 0;
                                                        }
                                                        i16 = 0;
                                                        n nVar2 = oVar.n;
                                                        nVar2.c = tVar;
                                                        nVar2.d = i21;
                                                        nVar2.e = l10;
                                                        nVar2.f = i25;
                                                        nVar2.g = l11;
                                                        nVar2.h = z10;
                                                        nVar2.i = z12;
                                                        nVar2.j = z11;
                                                        nVar2.k = z13;
                                                        nVar2.l = i12;
                                                        nVar2.m = i16;
                                                        nVar2.n = i14;
                                                        nVar2.o = i17;
                                                        nVar2.p = i15;
                                                        nVar2.a = true;
                                                        nVar2.b = true;
                                                        oVar.k = false;
                                                    }
                                                    return;
                                                }
                                                i14 = 0;
                                                i15 = 0;
                                                i16 = 0;
                                            }
                                            i17 = 0;
                                            n nVar22 = oVar.n;
                                            nVar22.c = tVar;
                                            nVar22.d = i21;
                                            nVar22.e = l10;
                                            nVar22.f = i25;
                                            nVar22.g = l11;
                                            nVar22.h = z10;
                                            nVar22.i = z12;
                                            nVar22.j = z11;
                                            nVar22.k = z13;
                                            nVar22.l = i12;
                                            nVar22.m = i16;
                                            nVar22.n = i14;
                                            nVar22.o = i17;
                                            nVar22.p = i15;
                                            nVar22.a = true;
                                            nVar22.b = true;
                                            oVar.k = false;
                                        }
                                        return;
                                    }
                                }
                                z11 = false;
                                z12 = false;
                                if (oVar.i != 5) {
                                }
                                if (z13) {
                                }
                                i13 = tVar.k;
                                if (i13 != 0) {
                                }
                                i17 = 0;
                                n nVar222 = oVar.n;
                                nVar222.c = tVar;
                                nVar222.d = i21;
                                nVar222.e = l10;
                                nVar222.f = i25;
                                nVar222.g = l11;
                                nVar222.h = z10;
                                nVar222.i = z12;
                                nVar222.j = z11;
                                nVar222.k = z13;
                                nVar222.l = i12;
                                nVar222.m = i16;
                                nVar222.n = i14;
                                nVar222.o = i17;
                                nVar222.p = i15;
                                nVar222.a = true;
                                nVar222.b = true;
                                oVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fb, code lost:
    
        if (r5.j == r7.j) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0205, code lost:
    
        if (r11 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0217, code lost:
    
        if (r5.n == r7.n) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0228, code lost:
    
        if (r5.p == r7.p) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0236, code lost:
    
        if (r5.l == r7.l) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c6 A[ADDED_TO_REGION] */
    @Override // w3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d5.z zVar) {
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        long j10;
        g0 g0Var;
        o oVar;
        boolean z10;
        long j11;
        boolean z11;
        o oVar2;
        int i13;
        d5.a.j(this.j);
        int i14 = d5.g0.a;
        int i15 = zVar.b;
        int i16 = zVar.c;
        byte[] bArr2 = zVar.a;
        this.g += zVar.a();
        this.j.a(zVar.a(), zVar);
        while (true) {
            int r10 = d5.a.r(bArr2, i15, i16, this.h);
            if (r10 == i16) {
                a(i15, i16, bArr2);
                return;
            }
            int i17 = r10 + 3;
            int i18 = bArr2[i17] & 31;
            int i19 = r10 - i15;
            if (i19 > 0) {
                a(i15, r10, bArr2);
            }
            int i20 = i16 - r10;
            long j12 = this.g - i20;
            int i21 = i19 < 0 ? -i19 : 0;
            long j13 = this.m;
            boolean z12 = this.l;
            g0 g0Var2 = this.d;
            g0 g0Var3 = this.e;
            if (!z12 || this.k.c) {
                g0Var2.e(i21);
                g0Var3.e(i21);
                if (this.l) {
                    i10 = i20;
                    i11 = i16;
                    bArr = bArr2;
                    i12 = i17;
                    j10 = j12;
                    if (g0Var2.d) {
                        d5.t C = d5.a.C(3, g0Var2.e, (byte[]) g0Var2.f);
                        this.k.d.append(C.d, C);
                        g0Var2.f();
                    } else if (g0Var3.d) {
                        d5.y yVar = new d5.y((byte[]) g0Var3.f, 4, g0Var3.e);
                        int l10 = yVar.l();
                        int l11 = yVar.l();
                        yVar.r();
                        this.k.e.append(l10, new d5.s(l10, l11, yVar.h()));
                        g0Var3.f();
                    }
                } else if (g0Var2.d && g0Var3.d) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) g0Var2.f, g0Var2.e));
                    arrayList.add(Arrays.copyOf((byte[]) g0Var3.f, g0Var3.e));
                    i10 = i20;
                    d5.t C2 = d5.a.C(3, g0Var2.e, (byte[]) g0Var2.f);
                    i11 = i16;
                    bArr = bArr2;
                    d5.y yVar2 = new d5.y((byte[]) g0Var3.f, 4, g0Var3.e);
                    int l12 = yVar2.l();
                    int l13 = yVar2.l();
                    yVar2.r();
                    d5.s sVar = new d5.s(l12, l13, yVar2.h());
                    String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(C2.a), Integer.valueOf(C2.b), Integer.valueOf(C2.c));
                    m3.w wVar = this.j;
                    i12 = i17;
                    s0 s0Var = new s0();
                    j10 = j12;
                    s0Var.a = this.i;
                    s0Var.o = MediaController.VIDEO_MIME_TYPE;
                    s0Var.h = format;
                    s0Var.t = C2.e;
                    s0Var.u = C2.f;
                    s0Var.x = C2.g;
                    s0Var.q = arrayList;
                    wVar.c(new t0(s0Var));
                    this.l = true;
                    this.k.d.append(C2.d, C2);
                    this.k.e.append(l12, sVar);
                    g0Var2.f();
                    g0Var3.f();
                }
                g0Var = this.f;
                if (g0Var.e(i21)) {
                    int J = d5.a.J(g0Var.e, (byte[]) g0Var.f);
                    byte[] bArr3 = (byte[]) g0Var.f;
                    d5.z zVar2 = this.o;
                    zVar2.A(J, bArr3);
                    zVar2.C(4);
                    h7.p.a(j13, zVar2, this.a.c);
                }
                oVar = this.k;
                z10 = this.l;
                boolean z13 = this.n;
                if (oVar.i != 9) {
                    if (oVar.c) {
                        n nVar = oVar.n;
                        n nVar2 = oVar.m;
                        if (nVar.a) {
                            if (nVar2.a) {
                                d5.t tVar = nVar.c;
                                d5.a.j(tVar);
                                d5.t tVar2 = nVar2.c;
                                d5.a.j(tVar2);
                                int i22 = tVar2.k;
                                if (nVar.f == nVar2.f) {
                                    if (nVar.g == nVar2.g) {
                                        if (nVar.h == nVar2.h) {
                                            if (nVar.i) {
                                                if (nVar2.i) {
                                                }
                                            }
                                            int i23 = nVar.d;
                                            int i24 = nVar2.d;
                                            if (i23 != i24) {
                                                if (i23 != 0) {
                                                }
                                            }
                                            int i25 = tVar.k;
                                            if (i25 == 0) {
                                                if (i22 == 0) {
                                                    if (nVar.m == nVar2.m) {
                                                    }
                                                }
                                            }
                                            if (i25 == 1) {
                                                if (i22 == 1) {
                                                    if (nVar.o == nVar2.o) {
                                                    }
                                                }
                                            }
                                            boolean z14 = nVar.k;
                                            if (z14 == nVar2.k) {
                                                if (z14) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (oVar.b) {
                        n nVar3 = oVar.n;
                        z13 = nVar3.b && ((i13 = nVar3.e) == 7 || i13 == 2);
                    }
                    boolean z15 = oVar.r;
                    int i26 = oVar.i;
                    z11 = z15 | (i26 != 5 || (z13 && i26 == 1));
                    oVar.r = z11;
                    if (z11) {
                        this.n = false;
                    }
                    long j14 = this.m;
                    if (this.l || this.k.c) {
                        g0Var2.g(i18);
                        g0Var3.g(i18);
                    }
                    g0Var.g(i18);
                    oVar2 = this.k;
                    oVar2.i = i18;
                    oVar2.l = j14;
                    oVar2.j = j10;
                    if ((oVar2.b && i18 == 1) || (oVar2.c && (i18 == 5 || i18 == 1 || i18 == 2))) {
                        n nVar4 = oVar2.m;
                        oVar2.m = oVar2.n;
                        oVar2.n = nVar4;
                        nVar4.b = false;
                        nVar4.a = false;
                        oVar2.h = 0;
                        oVar2.k = true;
                    }
                    i16 = i11;
                    bArr2 = bArr;
                    i15 = i12;
                }
                if (z10 && oVar.o) {
                    long j15 = oVar.j;
                    int i27 = i10 + ((int) (j10 - j15));
                    j11 = oVar.q;
                    if (j11 != -9223372036854775807L) {
                        oVar.a.e(j11, oVar.r ? 1 : 0, (int) (j15 - oVar.p), i27, null);
                    }
                }
                oVar.p = oVar.j;
                oVar.q = oVar.l;
                oVar.r = false;
                oVar.o = true;
                if (oVar.b) {
                }
                boolean z152 = oVar.r;
                int i262 = oVar.i;
                z11 = z152 | (i262 != 5 || (z13 && i262 == 1));
                oVar.r = z11;
                if (z11) {
                }
                long j142 = this.m;
                if (this.l) {
                }
                g0Var2.g(i18);
                g0Var3.g(i18);
                g0Var.g(i18);
                oVar2 = this.k;
                oVar2.i = i18;
                oVar2.l = j142;
                oVar2.j = j10;
                if (oVar2.b) {
                    n nVar42 = oVar2.m;
                    oVar2.m = oVar2.n;
                    oVar2.n = nVar42;
                    nVar42.b = false;
                    nVar42.a = false;
                    oVar2.h = 0;
                    oVar2.k = true;
                    i16 = i11;
                    bArr2 = bArr;
                    i15 = i12;
                }
                n nVar422 = oVar2.m;
                oVar2.m = oVar2.n;
                oVar2.n = nVar422;
                nVar422.b = false;
                nVar422.a = false;
                oVar2.h = 0;
                oVar2.k = true;
                i16 = i11;
                bArr2 = bArr;
                i15 = i12;
            }
            i10 = i20;
            i11 = i16;
            bArr = bArr2;
            i12 = i17;
            j10 = j12;
            g0Var = this.f;
            if (g0Var.e(i21)) {
            }
            oVar = this.k;
            z10 = this.l;
            boolean z132 = this.n;
            if (oVar.i != 9) {
            }
            if (z10) {
                long j152 = oVar.j;
                int i272 = i10 + ((int) (j10 - j152));
                j11 = oVar.q;
                if (j11 != -9223372036854775807L) {
                }
            }
            oVar.p = oVar.j;
            oVar.q = oVar.l;
            oVar.r = false;
            oVar.o = true;
            if (oVar.b) {
            }
            boolean z1522 = oVar.r;
            int i2622 = oVar.i;
            z11 = z1522 | (i2622 != 5 || (z132 && i2622 == 1));
            oVar.r = z11;
            if (z11) {
            }
            long j1422 = this.m;
            if (this.l) {
            }
            g0Var2.g(i18);
            g0Var3.g(i18);
            g0Var.g(i18);
            oVar2 = this.k;
            oVar2.i = i18;
            oVar2.l = j1422;
            oVar2.j = j10;
            if (oVar2.b) {
            }
            n nVar4222 = oVar2.m;
            oVar2.m = oVar2.n;
            oVar2.n = nVar4222;
            nVar4222.b = false;
            nVar4222.a = false;
            oVar2.h = 0;
            oVar2.k = true;
            i16 = i11;
            bArr2 = bArr;
            i15 = i12;
        }
    }

    @Override // w3.h
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        d5.a.m(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        o oVar = this.k;
        if (oVar != null) {
            oVar.k = false;
            oVar.o = false;
            n nVar = oVar.n;
            nVar.b = false;
            nVar.a = false;
        }
    }

    @Override // w3.h
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.i = e0Var.e;
        e0Var.b();
        m3.w C = mVar.C(e0Var.d, 2);
        this.j = C;
        this.k = new o(C, this.b, this.c);
        this.a.b(mVar, e0Var);
    }

    @Override // w3.h
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.m = j10;
        }
        this.n = ((i10 & 2) != 0) | this.n;
    }

    @Override // w3.h
    public final void d() {
    }
}
