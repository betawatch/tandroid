package w3;

import android.util.SparseArray;
import d5.f0;
import f2.i0;
import h3.s0;
import h3.t0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final i0 d = new i0(7);
    public final i0 e = new i0(8);
    public final i0 f = new i0(6);
    public long m = -9223372036854775807L;
    public final d5.y o = new d5.y();

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
    public final void a(int i9, int i10, byte[] bArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!this.l || this.k.c) {
            this.d.a(i9, i10, bArr);
            this.e.a(i9, i10, bArr);
        }
        this.f.a(i9, i10, bArr);
        o oVar = this.k;
        SparseArray sparseArray = oVar.e;
        d5.x xVar = oVar.f;
        if (oVar.k) {
            int i17 = i10 - i9;
            byte[] bArr2 = oVar.g;
            int length = bArr2.length;
            int i18 = oVar.h + i17;
            if (length < i18) {
                oVar.g = Arrays.copyOf(bArr2, i18 * 2);
            }
            System.arraycopy(bArr, i9, oVar.g, oVar.h, i17);
            int i19 = oVar.h + i17;
            oVar.h = i19;
            xVar.b = oVar.g;
            xVar.d = 0;
            xVar.c = i19;
            xVar.e = 0;
            xVar.a();
            if (xVar.d(8)) {
                xVar.r();
                int i20 = xVar.i(2);
                xVar.s(5);
                if (xVar.e()) {
                    xVar.l();
                    if (xVar.e()) {
                        int l10 = xVar.l();
                        if (!oVar.c) {
                            oVar.k = false;
                            n nVar = oVar.n;
                            nVar.e = l10;
                            nVar.b = true;
                            return;
                        }
                        if (xVar.e()) {
                            int l11 = xVar.l();
                            if (sparseArray.indexOfKey(l11) < 0) {
                                oVar.k = false;
                                return;
                            }
                            d5.s sVar = (d5.s) sparseArray.get(l11);
                            SparseArray sparseArray2 = oVar.d;
                            int i21 = sVar.a;
                            boolean z14 = sVar.b;
                            d5.t tVar = (d5.t) sparseArray2.get(i21);
                            boolean z15 = tVar.h;
                            int i22 = tVar.l;
                            int i23 = tVar.j;
                            if (z15) {
                                if (!xVar.d(2)) {
                                    return;
                                } else {
                                    xVar.s(2);
                                }
                            }
                            if (xVar.d(i23)) {
                                int i24 = xVar.i(i23);
                                if (tVar.i) {
                                    z10 = false;
                                } else {
                                    if (!xVar.d(1)) {
                                        return;
                                    }
                                    z10 = xVar.h();
                                    if (z10) {
                                        if (xVar.d(1)) {
                                            z11 = xVar.h();
                                            z12 = true;
                                            z13 = oVar.i != 5;
                                            if (z13) {
                                                i11 = 0;
                                            } else if (!xVar.e()) {
                                                return;
                                            } else {
                                                i11 = xVar.l();
                                            }
                                            i12 = tVar.k;
                                            if (i12 != 0) {
                                                if (!xVar.d(i22)) {
                                                    return;
                                                }
                                                i15 = xVar.i(i22);
                                                if (!z14 || z10) {
                                                    i13 = 0;
                                                } else if (!xVar.e()) {
                                                    return;
                                                } else {
                                                    i13 = xVar.m();
                                                }
                                                i14 = 0;
                                            } else {
                                                if (i12 == 1 && !tVar.m) {
                                                    if (xVar.e()) {
                                                        int m10 = xVar.m();
                                                        if (!z14 || z10) {
                                                            i16 = m10;
                                                            i13 = 0;
                                                            i14 = 0;
                                                        } else {
                                                            if (!xVar.e()) {
                                                                return;
                                                            }
                                                            i14 = xVar.m();
                                                            i16 = m10;
                                                            i13 = 0;
                                                        }
                                                        i15 = 0;
                                                        n nVar2 = oVar.n;
                                                        nVar2.c = tVar;
                                                        nVar2.d = i20;
                                                        nVar2.e = l10;
                                                        nVar2.f = i24;
                                                        nVar2.g = l11;
                                                        nVar2.h = z10;
                                                        nVar2.i = z12;
                                                        nVar2.j = z11;
                                                        nVar2.k = z13;
                                                        nVar2.l = i11;
                                                        nVar2.m = i15;
                                                        nVar2.n = i13;
                                                        nVar2.o = i16;
                                                        nVar2.p = i14;
                                                        nVar2.a = true;
                                                        nVar2.b = true;
                                                        oVar.k = false;
                                                    }
                                                    return;
                                                }
                                                i13 = 0;
                                                i14 = 0;
                                                i15 = 0;
                                            }
                                            i16 = 0;
                                            n nVar22 = oVar.n;
                                            nVar22.c = tVar;
                                            nVar22.d = i20;
                                            nVar22.e = l10;
                                            nVar22.f = i24;
                                            nVar22.g = l11;
                                            nVar22.h = z10;
                                            nVar22.i = z12;
                                            nVar22.j = z11;
                                            nVar22.k = z13;
                                            nVar22.l = i11;
                                            nVar22.m = i15;
                                            nVar22.n = i13;
                                            nVar22.o = i16;
                                            nVar22.p = i14;
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
                                i12 = tVar.k;
                                if (i12 != 0) {
                                }
                                i16 = 0;
                                n nVar222 = oVar.n;
                                nVar222.c = tVar;
                                nVar222.d = i20;
                                nVar222.e = l10;
                                nVar222.f = i24;
                                nVar222.g = l11;
                                nVar222.h = z10;
                                nVar222.i = z12;
                                nVar222.j = z11;
                                nVar222.k = z13;
                                nVar222.l = i11;
                                nVar222.m = i15;
                                nVar222.n = i13;
                                nVar222.o = i16;
                                nVar222.p = i14;
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
    public final void g(d5.y yVar) {
        int i9;
        int i10;
        byte[] bArr;
        int i11;
        long j10;
        i0 i0Var;
        o oVar;
        boolean z10;
        long j11;
        boolean z11;
        o oVar2;
        int i12;
        d5.a.j(this.j);
        int i13 = f0.a;
        int i14 = yVar.b;
        int i15 = yVar.c;
        byte[] bArr2 = yVar.a;
        this.g += yVar.a();
        this.j.a(yVar.a(), yVar);
        while (true) {
            int r10 = d5.a.r(bArr2, i14, i15, this.h);
            if (r10 == i15) {
                a(i14, i15, bArr2);
                return;
            }
            int i16 = r10 + 3;
            int i17 = bArr2[i16] & 31;
            int i18 = r10 - i14;
            if (i18 > 0) {
                a(i14, r10, bArr2);
            }
            int i19 = i15 - r10;
            long j12 = this.g - i19;
            int i20 = i18 < 0 ? -i18 : 0;
            long j13 = this.m;
            boolean z12 = this.l;
            i0 i0Var2 = this.d;
            i0 i0Var3 = this.e;
            if (!z12 || this.k.c) {
                i0Var2.e(i20);
                i0Var3.e(i20);
                if (this.l) {
                    i9 = i19;
                    i10 = i15;
                    bArr = bArr2;
                    i11 = i16;
                    j10 = j12;
                    if (i0Var2.d) {
                        d5.t C = d5.a.C(3, i0Var2.e, (byte[]) i0Var2.f);
                        this.k.d.append(C.d, C);
                        i0Var2.f();
                    } else if (i0Var3.d) {
                        d5.x xVar = new d5.x((byte[]) i0Var3.f, 4, i0Var3.e);
                        int l10 = xVar.l();
                        int l11 = xVar.l();
                        xVar.r();
                        this.k.e.append(l10, new d5.s(l10, l11, xVar.h()));
                        i0Var3.f();
                    }
                } else if (i0Var2.d && i0Var3.d) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) i0Var2.f, i0Var2.e));
                    arrayList.add(Arrays.copyOf((byte[]) i0Var3.f, i0Var3.e));
                    i9 = i19;
                    d5.t C2 = d5.a.C(3, i0Var2.e, (byte[]) i0Var2.f);
                    i10 = i15;
                    bArr = bArr2;
                    d5.x xVar2 = new d5.x((byte[]) i0Var3.f, 4, i0Var3.e);
                    int l12 = xVar2.l();
                    int l13 = xVar2.l();
                    xVar2.r();
                    d5.s sVar = new d5.s(l12, l13, xVar2.h());
                    String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(C2.a), Integer.valueOf(C2.b), Integer.valueOf(C2.c));
                    m3.w wVar = this.j;
                    i11 = i16;
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
                    i0Var2.f();
                    i0Var3.f();
                }
                i0Var = this.f;
                if (i0Var.e(i20)) {
                    int J = d5.a.J(i0Var.e, (byte[]) i0Var.f);
                    byte[] bArr3 = (byte[]) i0Var.f;
                    d5.y yVar2 = this.o;
                    yVar2.A(J, bArr3);
                    yVar2.C(4);
                    g7.p.a(j13, yVar2, this.a.c);
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
                                int i21 = tVar2.k;
                                if (nVar.f == nVar2.f) {
                                    if (nVar.g == nVar2.g) {
                                        if (nVar.h == nVar2.h) {
                                            if (nVar.i) {
                                                if (nVar2.i) {
                                                }
                                            }
                                            int i22 = nVar.d;
                                            int i23 = nVar2.d;
                                            if (i22 != i23) {
                                                if (i22 != 0) {
                                                }
                                            }
                                            int i24 = tVar.k;
                                            if (i24 == 0) {
                                                if (i21 == 0) {
                                                    if (nVar.m == nVar2.m) {
                                                    }
                                                }
                                            }
                                            if (i24 == 1) {
                                                if (i21 == 1) {
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
                        z13 = nVar3.b && ((i12 = nVar3.e) == 7 || i12 == 2);
                    }
                    boolean z15 = oVar.r;
                    int i25 = oVar.i;
                    z11 = z15 | (i25 != 5 || (z13 && i25 == 1));
                    oVar.r = z11;
                    if (z11) {
                        this.n = false;
                    }
                    long j14 = this.m;
                    if (this.l || this.k.c) {
                        i0Var2.g(i17);
                        i0Var3.g(i17);
                    }
                    i0Var.g(i17);
                    oVar2 = this.k;
                    oVar2.i = i17;
                    oVar2.l = j14;
                    oVar2.j = j10;
                    if ((oVar2.b && i17 == 1) || (oVar2.c && (i17 == 5 || i17 == 1 || i17 == 2))) {
                        n nVar4 = oVar2.m;
                        oVar2.m = oVar2.n;
                        oVar2.n = nVar4;
                        nVar4.b = false;
                        nVar4.a = false;
                        oVar2.h = 0;
                        oVar2.k = true;
                    }
                    i15 = i10;
                    bArr2 = bArr;
                    i14 = i11;
                }
                if (z10 && oVar.o) {
                    long j15 = oVar.j;
                    int i26 = i9 + ((int) (j10 - j15));
                    j11 = oVar.q;
                    if (j11 != -9223372036854775807L) {
                        oVar.a.e(j11, oVar.r ? 1 : 0, (int) (j15 - oVar.p), i26, null);
                    }
                }
                oVar.p = oVar.j;
                oVar.q = oVar.l;
                oVar.r = false;
                oVar.o = true;
                if (oVar.b) {
                }
                boolean z152 = oVar.r;
                int i252 = oVar.i;
                z11 = z152 | (i252 != 5 || (z13 && i252 == 1));
                oVar.r = z11;
                if (z11) {
                }
                long j142 = this.m;
                if (this.l) {
                }
                i0Var2.g(i17);
                i0Var3.g(i17);
                i0Var.g(i17);
                oVar2 = this.k;
                oVar2.i = i17;
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
                    i15 = i10;
                    bArr2 = bArr;
                    i14 = i11;
                }
                n nVar422 = oVar2.m;
                oVar2.m = oVar2.n;
                oVar2.n = nVar422;
                nVar422.b = false;
                nVar422.a = false;
                oVar2.h = 0;
                oVar2.k = true;
                i15 = i10;
                bArr2 = bArr;
                i14 = i11;
            }
            i9 = i19;
            i10 = i15;
            bArr = bArr2;
            i11 = i16;
            j10 = j12;
            i0Var = this.f;
            if (i0Var.e(i20)) {
            }
            oVar = this.k;
            z10 = this.l;
            boolean z132 = this.n;
            if (oVar.i != 9) {
            }
            if (z10) {
                long j152 = oVar.j;
                int i262 = i9 + ((int) (j10 - j152));
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
            int i2522 = oVar.i;
            z11 = z1522 | (i2522 != 5 || (z132 && i2522 == 1));
            oVar.r = z11;
            if (z11) {
            }
            long j1422 = this.m;
            if (this.l) {
            }
            i0Var2.g(i17);
            i0Var3.g(i17);
            i0Var.g(i17);
            oVar2 = this.k;
            oVar2.i = i17;
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
            i15 = i10;
            bArr2 = bArr;
            i14 = i11;
        }
    }

    @Override // w3.h
    public final void h() {
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
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.i = d0Var.e;
        d0Var.b();
        m3.w I = mVar.I(d0Var.d, 2);
        this.j = I;
        this.k = new o(I, this.b, this.c);
        this.a.b(mVar, d0Var);
    }

    @Override // w3.h
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.m = j10;
        }
        this.n = ((i9 & 2) != 0) | this.n;
    }

    @Override // w3.h
    public final void i() {
    }
}
