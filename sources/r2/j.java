package r2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.util.SparseArray;
import c8.e1;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.t;
import e2.t0;
import h2.m0;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l2.u0;
import l2.v0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.rt;
import p4.r0;
import s2.u;
import s2.w;
import x2.c1;
import x2.d0;
import x2.e0;
import x2.q1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class j implements e0, u {
    public final int D;
    public final m2.j E;
    public final rt F = new rt(this, 12);
    public d0 G;
    public int H;
    public q1 I;
    public p[] J;
    public p[] K;
    public int L;
    public x2.n M;
    public final long N;
    public final c a;
    public final s2.d b;
    public final org.telegram.ui.Components.n c;
    public final j2.d0 d;
    public final q2.m e;
    public final q2.j f;
    public final pb.b h;
    public final wa n;
    public final h6.m r;
    public final IdentityHashMap s;
    public final org.telegram.ui.Components.n w;
    public final sa.d x;
    public final boolean y;

    public j(c cVar, s2.d dVar, org.telegram.ui.Components.n nVar, j2.d0 d0Var, q2.m mVar, q2.j jVar, pb.b bVar, wa waVar, h6.m mVar2, sa.d dVar2, boolean z9, int i7, m2.j jVar2) {
        this.a = cVar;
        this.b = dVar;
        this.c = nVar;
        this.d = d0Var;
        this.e = mVar;
        this.f = jVar;
        this.h = bVar;
        this.n = waVar;
        this.r = mVar2;
        this.x = dVar2;
        this.y = z9;
        this.D = i7;
        this.E = jVar2;
        dVar2.getClass();
        g0 g0Var = i0.b;
        t1 t1Var = t1.e;
        this.M = new x2.n(t1Var, t1Var);
        this.s = new IdentityHashMap();
        this.w = new org.telegram.ui.Components.n(15);
        this.J = new p[0];
        this.K = new p[0];
        this.N = Long.MIN_VALUE;
    }

    public static e2.u l(e2.u uVar, e2.u uVar2, boolean z9) {
        q0 q0Var;
        int i7;
        String str;
        String str2;
        i0 i0Var;
        int i10;
        int i11;
        String str3;
        g0 g0Var = i0.b;
        t1 t1Var = t1.e;
        if (uVar2 != null) {
            str2 = uVar2.k;
            q0Var = uVar2.l;
            i10 = uVar2.K;
            i7 = uVar2.e;
            i11 = uVar2.f;
            str = uVar2.d;
            str3 = uVar2.b;
            i0Var = uVar2.c;
        } else {
            String w10 = m0.w(1, uVar.k);
            q0Var = uVar.l;
            if (z9) {
                i10 = uVar.K;
                i7 = uVar.e;
                i11 = uVar.f;
                str = uVar.d;
                str3 = uVar.b;
                str2 = w10;
                i0Var = uVar.c;
            } else {
                i7 = 0;
                str = null;
                str2 = w10;
                i0Var = t1Var;
                i10 = -1;
                i11 = 0;
                str3 = null;
            }
        }
        String d = s0.d(str2);
        int i12 = z9 ? uVar.h : -1;
        int i13 = z9 ? uVar.i : -1;
        t tVar = new t();
        tVar.a = uVar.a;
        tVar.b = str3;
        tVar.c = i0.q(i0Var);
        tVar.q = s0.n(uVar.r);
        tVar.r = s0.n(d);
        tVar.j = str2;
        tVar.k = q0Var;
        tVar.h = i12;
        tVar.i = i13;
        tVar.J = i10;
        tVar.e = i7;
        tVar.f = i11;
        tVar.d = str;
        return new e2.u(tVar);
    }

    @Override // s2.u
    public final void a() {
        for (p pVar : this.J) {
            b3.o oVar = pVar.s;
            h hVar = pVar.d;
            ArrayList arrayList = pVar.D;
            if (!arrayList.isEmpty()) {
                i iVar = (i) h9.o.n(arrayList);
                int c10 = hVar.c(iVar);
                int i7 = iVar.E;
                if (c10 == 1) {
                    if (!iVar.g()) {
                        ia.p(i7 != -1);
                        s2.m b10 = hVar.g.b(iVar.y, false);
                        b10.getClass();
                        i0 i0Var = b10.r;
                        int i10 = (int) (iVar.s - b10.k);
                        iVar.a0 = i10 < 0 ? 0L : ((s2.h) (i10 < i0Var.size() ? ((s2.j) i0Var.get(i10)).y : b10.s).get(i7)).c;
                    }
                } else if (c10 == 0) {
                    pVar.H.post(new org.telegram.ui.web.s(17, pVar, iVar));
                } else if (c10 == 2 && !pVar.j0 && oVar.d()) {
                    oVar.b();
                }
            }
        }
        this.G.d(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0120, code lost:
    
        if (r44 != r3.f0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // x2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(a3.u[] uVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        c1[] c1VarArr2;
        int[] iArr;
        boolean z9;
        ?? r92;
        h hVar;
        int i7;
        int i10;
        c1[] c1VarArr3;
        int i11;
        int[] iArr2;
        p[] pVarArr;
        p pVar;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        ?? r10;
        int i15;
        int i16;
        a3.u[] uVarArr2;
        int[] iArr3 = new int[uVarArr.length];
        int[] iArr4 = new int[uVarArr.length];
        int i17 = 0;
        while (true) {
            int length = uVarArr.length;
            identityHashMap = this.s;
            if (i17 >= length) {
                break;
            }
            c1 c1Var = c1VarArr[i17];
            iArr3[i17] = c1Var == null ? -1 : ((Integer) identityHashMap.get(c1Var)).intValue();
            iArr4[i17] = -1;
            a3.u uVar = uVarArr[i17];
            if (uVar != null) {
                m1 c10 = uVar.c();
                int i18 = 0;
                while (true) {
                    p[] pVarArr2 = this.J;
                    if (i18 < pVarArr2.length) {
                        p pVar2 = pVarArr2[i18];
                        pVar2.l();
                        if (pVar2.Y.b(c10) != -1) {
                            iArr4[i17] = i18;
                            break;
                        }
                        i18++;
                    }
                }
            }
            i17++;
        }
        identityHashMap.clear();
        int length2 = uVarArr.length;
        c1[] c1VarArr4 = new c1[length2];
        int length3 = uVarArr.length;
        c1[] c1VarArr5 = new c1[length3];
        int length4 = uVarArr.length;
        a3.u[] uVarArr3 = new a3.u[length4];
        boolean z13 = false;
        p[] pVarArr3 = new p[this.J.length];
        int i19 = length3;
        int i20 = 0;
        int i21 = 0;
        boolean z14 = false;
        while (i20 < this.J.length) {
            int i22 = length2;
            ?? r72 = z13;
            while (true) {
                c1VarArr2 = c1VarArr4;
                if (r72 >= uVarArr.length) {
                    break;
                }
                c1VarArr5[r72] = iArr3[r72] == i20 ? c1VarArr[r72] : null;
                uVarArr3[r72] = iArr4[r72] == i20 ? uVarArr[r72] : null;
                c1VarArr4 = c1VarArr2;
                r72++;
            }
            p pVar3 = this.J[i20];
            b3.o oVar = pVar3.s;
            int i23 = i20;
            h hVar2 = pVar3.d;
            w[] wVarArr = hVar2.e;
            s2.d dVar = hVar2.g;
            ArrayList arrayList = pVar3.D;
            pVar3.l();
            int i24 = pVar3.U;
            ?? r29 = c1VarArr5;
            ?? r73 = z13;
            while (r73 < length4) {
                l lVar = (l) r29[r73];
                if (lVar == null || (uVarArr3[r73] != null && zArr[r73])) {
                    i16 = r73;
                    uVarArr2 = uVarArr3;
                } else {
                    i16 = r73;
                    pVar3.U--;
                    uVarArr2 = uVarArr3;
                    if (lVar.c != -1) {
                        p pVar4 = lVar.b;
                        int i25 = lVar.a;
                        pVar4.l();
                        pVar4.a0.getClass();
                        int i26 = pVar4.a0[i25];
                        if (i26 >= 0) {
                            ia.p(pVar4.d0[i26]);
                            pVar4.d0[i26] = z13;
                        }
                        lVar.c = -1;
                    }
                    r29[i16] = 0;
                }
                uVarArr3 = uVarArr2;
                r73 = i16 + 1;
            }
            a3.u[] uVarArr4 = uVarArr3;
            boolean z15 = true;
            if (!z14) {
                if (!pVar3.i0) {
                    iArr = iArr3;
                } else if (i24 != 0) {
                    iArr = iArr3;
                }
                z9 = z13;
                a3.u uVar2 = hVar2.r;
                boolean z16 = z9;
                a3.u uVar3 = uVar2;
                r92 = z13;
                while (r92 < length4) {
                    int i27 = r92;
                    a3.u uVar4 = uVarArr4[i27];
                    if (uVar4 == null) {
                        i15 = length4;
                    } else {
                        i15 = length4;
                        boolean z17 = z16;
                        int b10 = pVar3.Y.b(uVar4.c());
                        if (b10 == pVar3.b0) {
                            Uri c11 = wVarArr[hVar2.r.m()].c();
                            s2.c cVar = (s2.c) dVar.d.get(c11);
                            if (cVar != null) {
                                s2.b bVar = (s2.b) f1.l(cVar.b, c11, c11);
                                bVar.getClass();
                                bVar.x = z13;
                            }
                            hVar2.r = uVar4;
                            uVar3 = uVar4;
                        }
                        if (r29[i27] == 0) {
                            pVar3.U++;
                            l lVar2 = new l(pVar3, b10);
                            r29[i27] = lVar2;
                            zArr2[i27] = z15;
                            if (pVar3.a0 != null) {
                                lVar2.b();
                                int i28 = pVar3.a0[b10];
                                if (!z17 && i28 >= 0) {
                                    o oVar2 = pVar3.L[i28];
                                    z16 = (oVar2.v() == 0 || oVar2.J(j3, z15)) ? false : true;
                                }
                            }
                        }
                        z16 = z17;
                    }
                    length4 = i15;
                    z13 = false;
                    z15 = true;
                    r92 = i27 + 1;
                }
                int i29 = length4;
                boolean z18 = z16;
                if (pVar3.U != 0) {
                    Uri c12 = wVarArr[hVar2.r.m()].c();
                    s2.c cVar2 = (s2.c) dVar.d.get(c12);
                    if (cVar2 != null) {
                        s2.b bVar2 = (s2.b) f1.l(cVar2.b, c12, c12);
                        bVar2.getClass();
                        bVar2.x = false;
                    }
                    hVar2.n = null;
                    pVar3.W = null;
                    pVar3.h0 = true;
                    arrayList.clear();
                    if (oVar.d()) {
                        if (pVar3.S) {
                            for (o oVar3 : pVar3.L) {
                                oVar3.l();
                            }
                        }
                        oVar.b();
                    } else {
                        pVar3.C();
                    }
                    hVar = hVar2;
                    i12 = i19;
                    i10 = i22;
                    c1VarArr3 = c1VarArr2;
                    i11 = i23;
                    z11 = z18;
                    iArr2 = iArr4;
                    pVarArr = pVarArr3;
                    pVar = pVar3;
                } else {
                    boolean z19 = true;
                    if (arrayList.isEmpty() || Objects.equals(uVar3, uVar2)) {
                        hVar = hVar2;
                        i7 = i19;
                        i10 = i22;
                        c1VarArr3 = c1VarArr2;
                        i11 = i23;
                        iArr2 = iArr4;
                        pVarArr = pVarArr3;
                        pVar = pVar3;
                    } else {
                        if (pVar3.i0) {
                            hVar = hVar2;
                            i7 = i19;
                            i10 = i22;
                            c1VarArr3 = c1VarArr2;
                            i11 = i23;
                            iArr2 = iArr4;
                            pVarArr = pVarArr3;
                            pVar = pVar3;
                        } else {
                            long j10 = j3 < 0 ? -j3 : 0L;
                            i w10 = pVar3.w();
                            long j11 = j10;
                            y2.m[] b11 = hVar2.b(w10, j3);
                            hVar = hVar2;
                            List list = pVar3.E;
                            i7 = i19;
                            i10 = i22;
                            c1VarArr3 = c1VarArr2;
                            i11 = i23;
                            iArr2 = iArr4;
                            pVarArr = pVarArr3;
                            pVar = pVar3;
                            a3.u uVar5 = uVar3;
                            uVar5.e(j3, j11, -9223372036854775807L, list, b11);
                            if (uVar5.m() != hVar.h.a(w10.d)) {
                                z19 = true;
                            } else {
                                z19 = true;
                            }
                        }
                        pVar.h0 = z19;
                        z10 = z19;
                        z11 = z10;
                        if (z11) {
                            i12 = i7;
                        } else {
                            pVar.D(j3, z10);
                            i12 = i7;
                            int i30 = 0;
                            while (i30 < i12) {
                                if (r29[i30] != 0) {
                                    zArr2[i30] = z19;
                                }
                                i30++;
                                z19 = true;
                            }
                        }
                    }
                    z10 = z14;
                    z11 = z18;
                    if (z11) {
                    }
                }
                ArrayList arrayList2 = pVar.I;
                arrayList2.clear();
                for (i13 = 0; i13 < i12; i13++) {
                    ?? r82 = r29[i13];
                    if (r82 != 0) {
                        arrayList2.add((l) r82);
                    }
                }
                pVar.i0 = true;
                i14 = 0;
                z12 = false;
                while (i14 < uVarArr.length) {
                    ?? r83 = r29[i14];
                    int i31 = i11;
                    if (iArr2[i14] == i31) {
                        r83.getClass();
                        r10 = c1VarArr3;
                        r10[i14] = r83;
                        identityHashMap.put(r83, Integer.valueOf(i31));
                        z12 = true;
                    } else {
                        r10 = c1VarArr3;
                        if (iArr[i14] == i31) {
                            ia.p(r83 == 0);
                        }
                    }
                    i14++;
                    c1VarArr3 = r10;
                    i11 = i31;
                }
                c1[] c1VarArr6 = c1VarArr3;
                int i32 = i11;
                int i33 = i21;
                if (!z12) {
                    pVarArr[i33] = pVar;
                    i21 = i33 + 1;
                    if (i33 == 0) {
                        hVar.l = true;
                        if (!z11) {
                            p[] pVarArr4 = this.K;
                            if (pVarArr4.length != 0 && pVar == pVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.w.a).clear();
                        z14 = true;
                    } else {
                        hVar.l = i32 < this.L;
                    }
                }
                i20 = i32 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                pVarArr3 = pVarArr;
                c1VarArr5 = r29;
                uVarArr3 = uVarArr4;
                length2 = i10;
                z13 = false;
                i19 = i12;
                c1VarArr4 = c1VarArr6;
                length4 = i29;
            }
            iArr = iArr3;
            z9 = true;
            a3.u uVar22 = hVar2.r;
            boolean z162 = z9;
            a3.u uVar32 = uVar22;
            r92 = z13;
            while (r92 < length4) {
            }
            int i292 = length4;
            boolean z182 = z162;
            if (pVar3.U != 0) {
            }
            ArrayList arrayList22 = pVar.I;
            arrayList22.clear();
            while (i13 < i12) {
            }
            pVar.i0 = true;
            i14 = 0;
            z12 = false;
            while (i14 < uVarArr.length) {
            }
            c1[] c1VarArr62 = c1VarArr3;
            int i322 = i11;
            int i332 = i21;
            if (!z12) {
            }
            i20 = i322 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            pVarArr3 = pVarArr;
            c1VarArr5 = r29;
            uVarArr3 = uVarArr4;
            length2 = i10;
            z13 = false;
            i19 = i12;
            c1VarArr4 = c1VarArr62;
            length4 = i292;
        }
        boolean z20 = z13;
        System.arraycopy(c1VarArr4, z20 ? 1 : 0, c1VarArr, z20 ? 1 : 0, length2);
        p[] pVarArr5 = (p[]) m0.U(i21, pVarArr3);
        this.K = pVarArr5;
        t1 r11 = i0.r(pVarArr5);
        AbstractList y10 = h9.o.y(r11, new r0(23));
        this.x.getClass();
        this.M = new x2.n(r11, y10);
        return j3;
    }

    @Override // x2.e1
    public final boolean c(v0 v0Var) {
        if (this.I != null) {
            return this.M.c(v0Var);
        }
        for (p pVar : this.J) {
            if (!pVar.T) {
                u0 u0Var = new u0();
                u0Var.a = pVar.f0;
                pVar.c(new v0(u0Var));
            }
        }
        return false;
    }

    @Override // s2.u
    public final boolean d(Uri uri, f5.u uVar, boolean z9) {
        int i7;
        boolean z10;
        b3.i iVar;
        int u10;
        p[] pVarArr = this.J;
        int length = pVarArr.length;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < length) {
            p pVar = pVarArr[i10];
            h hVar = pVar.d;
            w[] wVarArr = hVar.e;
            s2.d dVar = hVar.g;
            int length2 = wVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                w wVar = wVarArr[i11];
                s2.c cVar = (s2.c) dVar.d.get(uri);
                if (wVar.equals(cVar != null ? cVar.a : null)) {
                    if (z9) {
                        iVar = null;
                    } else {
                        b3.h a10 = hVar.a(uri);
                        pVar.r.getClass();
                        iVar = pb.b.V0(a10, uVar);
                    }
                    hVar.o = uri;
                    if (iVar != null) {
                        int i12 = iVar.a;
                        i7 = i10;
                        long j3 = iVar.b;
                        if (i12 == 1) {
                            s2.c cVar2 = (s2.c) dVar.d.get(uri);
                            if (cVar2 != null) {
                                z10 = s2.c.c(cVar2, uri, j3);
                            }
                        } else {
                            if (i12 != 2) {
                                throw new IllegalStateException(jg.g.j(i12, "Invalid fallback selection type: "));
                            }
                            int i13 = 0;
                            while (true) {
                                if (i13 >= wVarArr.length) {
                                    i13 = -1;
                                    break;
                                }
                                w wVar2 = wVarArr[i13];
                                s2.c cVar3 = (s2.c) dVar.d.get(uri);
                                if (wVar2.equals(cVar3 != null ? cVar3.a : null)) {
                                    break;
                                }
                                i13++;
                            }
                            if (i13 != -1 && (u10 = hVar.r.u(i13)) != -1 && hVar.r.p(u10, j3)) {
                                s2.c cVar4 = (s2.c) dVar.d.get(uri);
                                if (cVar4 != null ? s2.c.c(cVar4, uri, j3) : false) {
                                    z10 = true;
                                }
                            }
                        }
                    }
                } else {
                    i11++;
                }
            }
            i7 = i10;
            z10 = false;
            z11 |= z10;
            i10 = i7 + 1;
        }
        this.G.d(this);
        return z11;
    }

    @Override // x2.e1
    public final long e() {
        return this.M.e();
    }

    public final p f(String str, int i7, w[] wVarArr, e2.u[] uVarArr, e2.u uVar, List list, Map map, long j3) {
        p pVar = new p(str, i7, this.F, new h(this.a, this.b, wVarArr, uVarArr, this.c, this.d, this.w, list, this.E), map, this.r, j3, uVar, this.e, this.f, this.h, this.n, this.D, null);
        long j10 = this.N;
        pVar.k0 = j10;
        if (pVar.S) {
            for (o oVar : pVar.L) {
                oVar.K(j10);
            }
        }
        return pVar;
    }

    @Override // x2.e1
    public final boolean g() {
        return this.M.g();
    }

    @Override // x2.e0
    public final long h(long j3, l2.t1 t1Var) {
        p[] pVarArr = this.K;
        int length = pVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            p pVar = pVarArr[i7];
            if (pVar.Q == 2) {
                h hVar = pVar.d;
                s2.d dVar = hVar.g;
                int d = hVar.r.d();
                w[] wVarArr = hVar.e;
                s2.m b10 = (d >= wVarArr.length || d == -1) ? null : dVar.b(wVarArr[hVar.r.m()].c(), true);
                if (b10 != null) {
                    i0 i0Var = b10.r;
                    if (!i0Var.isEmpty()) {
                        long j10 = b10.h - dVar.I;
                        long j11 = j3 - j10;
                        int d2 = m0.d(i0Var, Long.valueOf(j11), true);
                        long j12 = ((s2.j) i0Var.get(d2)).e;
                        return t1Var.a(j11, j12, (!b10.c || d2 == i0Var.size() - 1) ? j12 : ((s2.j) i0Var.get(d2 + 1)).e) + j10;
                    }
                }
            } else {
                i7++;
            }
        }
        return j3;
    }

    @Override // x2.e0
    public final void i() {
        for (p pVar : this.J) {
            pVar.A();
            if (pVar.j0 && !pVar.T) {
                throw t0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // x2.e0
    public final long j(long j3) {
        p[] pVarArr = this.K;
        if (pVarArr.length > 0) {
            boolean D = pVarArr[0].D(j3, false);
            int i7 = 1;
            while (true) {
                p[] pVarArr2 = this.K;
                if (i7 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i7].D(j3, D);
                i7++;
            }
            if (D) {
                ((SparseArray) this.w.a).clear();
            }
        }
        return j3;
    }

    @Override // x2.e0
    public final void k(long j3) {
        for (p pVar : this.K) {
            if (pVar.S && !pVar.y()) {
                int length = pVar.L.length;
                for (int i7 = 0; i7 < length; i7++) {
                    pVar.L[i7].k(j3, pVar.d0[i7]);
                }
            }
        }
    }

    @Override // x2.e0
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // x2.e0
    public final q1 o() {
        q1 q1Var = this.I;
        q1Var.getClass();
        return q1Var;
    }

    @Override // x2.e1
    public final long p() {
        return this.M.p();
    }

    @Override // x2.e0
    public final void q(d0 d0Var, long j3) {
        String str;
        c cVar;
        boolean z9;
        Map map;
        i0 i0Var;
        int i7;
        HashSet hashSet;
        int i10;
        HashSet hashSet2;
        i0 i0Var2;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        List list;
        this.G = d0Var;
        s2.d dVar = this.b;
        dVar.getClass();
        dVar.e.add(this);
        s2.p pVar = dVar.s;
        pVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        i0 c10 = dVar.c(0);
        c10.getClass();
        i0 c11 = dVar.c(2);
        c11.getClass();
        i0 c12 = dVar.c(3);
        c12.getClass();
        boolean isEmpty = c10.isEmpty();
        this.H = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.a;
        boolean z13 = this.y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z9 = z13;
            map = map3;
            i0Var = c12;
        } else {
            e2.u uVar = pVar.j;
            List list2 = pVar.k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < c10.size(); i14++) {
                e2.u uVar2 = ((w) c10.get(i14)).a.a;
                int i15 = uVar2.A;
                String str2 = uVar2.k;
                if (i15 > 0 || m0.w(2, str2) != null) {
                    int i16 = i13;
                    iArr[i14] = 2;
                    i12++;
                    i13 = i16;
                } else if (m0.w(1, str2) != null) {
                    iArr[i14] = 1;
                    i13++;
                } else {
                    iArr[i14] = -1;
                }
            }
            int i17 = i13;
            if (i12 > 0) {
                z11 = false;
                i11 = i12;
                z10 = true;
            } else if (i17 < size) {
                int i18 = size - i17;
                z10 = false;
                i11 = i18;
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
                i11 = size;
            }
            w[] wVarArr = new w[i11];
            e2.u[] uVarArr = new e2.u[i11];
            int[] iArr2 = new int[i11];
            int i19 = 0;
            boolean z14 = z10;
            int i20 = 0;
            while (i20 < c10.size()) {
                if (z14) {
                    list = list2;
                    if (iArr[i20] != 2) {
                        i20++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z11 || iArr[i20] != 1) {
                    w wVar = (w) c10.get(i20);
                    wVarArr[i19] = wVar;
                    uVarArr[i19] = wVar.a.a;
                    iArr2[i19] = i20;
                    i19++;
                }
                i20++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = uVarArr[0].k;
            int v = m0.v(2, str3);
            int i21 = 1;
            int v10 = m0.v(1, str3);
            boolean z15 = (v10 == 1 || (v10 == 0 && c11.isEmpty())) && v <= 1 && v10 + v > 0;
            if (z14 || v10 <= 0) {
                z12 = true;
                i21 = 0;
            } else {
                z12 = true;
            }
            z9 = z13;
            i0Var = c12;
            p f10 = f("main", i21, wVarArr, uVarArr, uVar, list3, map3, j3);
            arrayList3.add(f10);
            arrayList4.add(iArr2);
            if (z9 && z15) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    e2.u[] uVarArr2 = new e2.u[i11];
                    int i22 = 0;
                    while (i22 < i11) {
                        e2.u uVar3 = uVarArr[i22];
                        String w10 = m0.w(2, uVar3.k);
                        String d = s0.d(w10);
                        e2.u[] uVarArr3 = uVarArr;
                        t tVar = new t();
                        tVar.a = uVar3.a;
                        tVar.b = uVar3.b;
                        tVar.c = i0.q(uVar3.c);
                        tVar.q = s0.n(uVar3.r);
                        tVar.r = s0.n(d);
                        tVar.j = w10;
                        tVar.k = uVar3.l;
                        tVar.h = uVar3.h;
                        tVar.i = uVar3.i;
                        tVar.y = uVar3.z;
                        tVar.z = uVar3.A;
                        tVar.C = uVar3.D;
                        tVar.e = uVar3.e;
                        tVar.f = uVar3.f;
                        tVar.H = uVar3.I;
                        uVarArr2[i22] = new e2.u(tVar);
                        i22++;
                        uVarArr = uVarArr3;
                        map3 = map3;
                    }
                    e2.u[] uVarArr4 = uVarArr;
                    map = map3;
                    arrayList5.add(new m1("main", uVarArr2));
                    if (v10 > 0 && (uVar != null || c11.isEmpty())) {
                        t a10 = l(uVarArr4[0], uVar, false).a();
                        a10.l = "main";
                        arrayList5.add(new m1("main:audio", new e2.u(a10)));
                    }
                    if (list3 != null) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            String j10 = jg.g.j(i23, "main:cc:");
                            t a11 = cVar2.b((e2.u) list3.get(i23)).a();
                            a11.l = "main";
                            arrayList5.add(new m1(j10, new e2.u(a11)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    e2.u[] uVarArr5 = new e2.u[i11];
                    for (int i24 = 0; i24 < i11; i24++) {
                        uVarArr5[i24] = l(uVarArr[i24], uVar, true);
                    }
                    arrayList5.add(new m1("main", uVarArr5));
                }
                t tVar2 = new t();
                str = "ID3";
                tVar2.a = str;
                tVar2.r = s0.n("application/id3");
                tVar2.l = "main";
                m1 m1Var = new m1("main:id3", new e2.u(tVar2));
                arrayList5.add(m1Var);
                f10.B((m1[]) arrayList5.toArray(new m1[0]), arrayList5.indexOf(m1Var));
            } else {
                map = map3;
                str = "ID3";
                cVar = cVar2;
            }
        }
        ArrayList arrayList6 = new ArrayList(c11.size());
        ArrayList arrayList7 = new ArrayList(c11.size());
        ArrayList arrayList8 = new ArrayList(c11.size());
        HashSet hashSet3 = new HashSet();
        int i25 = 0;
        while (i25 < c11.size()) {
            String str4 = ((w) c11.get(i25)).a.c;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z16 = true;
                for (int i26 = 0; i26 < c11.size(); i26++) {
                    if (str4.equals(((w) c11.get(i26)).a.c)) {
                        w wVar2 = (w) c11.get(i26);
                        e2.u uVar4 = wVar2.a.a;
                        arrayList8.add(Integer.valueOf(i26));
                        arrayList6.add(wVar2);
                        arrayList7.add(uVar4);
                        z16 &= m0.v(1, uVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = m0.a;
                i10 = i25;
                hashSet2 = hashSet3;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                p f11 = f(concat, 1, (w[]) arrayList6.toArray(new w[0]), (e2.u[]) arrayList7.toArray(new e2.u[0]), null, Collections.EMPTY_LIST, map2, j3);
                arrayList4.add(e1.f(arrayList2));
                arrayList3.add(f11);
                if (z9 && z16) {
                    String r10 = rf.b.r(concat, ":id3");
                    t tVar3 = new t();
                    tVar3.a = str;
                    tVar3.r = s0.n("application/id3");
                    tVar3.l = concat;
                    f11.B(new m1[]{new m1(concat, (e2.u[]) arrayList.toArray(new e2.u[0])), new m1(r10, new e2.u(tVar3))}, 1);
                }
            } else {
                hashSet2 = hashSet3;
                i10 = i25;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            }
            i25 = i10 + 1;
            arrayList7 = arrayList;
            c11 = i0Var2;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
            map = map2;
        }
        Map map4 = map;
        this.L = arrayList3.size();
        ArrayList arrayList9 = new ArrayList(i0Var.size());
        ArrayList arrayList10 = new ArrayList(i0Var.size());
        ArrayList arrayList11 = new ArrayList(i0Var.size());
        HashSet hashSet4 = new HashSet();
        int i27 = 0;
        while (i27 < i0Var.size()) {
            i0 i0Var3 = i0Var;
            String str6 = ((w) i0Var3.get(i27)).a.c;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i28 = 0; i28 < i0Var3.size(); i28++) {
                    if (str6.equals(((w) i0Var3.get(i28)).a.c)) {
                        w wVar3 = (w) i0Var3.get(i28);
                        arrayList11.add(Integer.valueOf(i28));
                        arrayList9.add(wVar3);
                        arrayList10.add(wVar3.a.a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                e2.u[] uVarArr6 = (e2.u[]) arrayList10.toArray(new e2.u[0]);
                String str7 = m0.a;
                w[] wVarArr2 = (w[]) arrayList9.toArray(new w[0]);
                g0 g0Var = i0.b;
                i0Var = i0Var3;
                i7 = i27;
                hashSet = hashSet4;
                p f12 = f(concat2, 3, wVarArr2, uVarArr6, null, t1.e, map4, j3);
                arrayList4.add(e1.f(arrayList11));
                arrayList3.add(f12);
                int length = uVarArr6.length;
                e2.u[] uVarArr7 = new e2.u[length];
                for (int i29 = 0; i29 < length; i29++) {
                    uVarArr7[i29] = cVar.b(uVarArr6[i29]);
                }
                f12.B(new m1[]{new m1(concat2, uVarArr7)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i7 = i27;
                i0Var = i0Var3;
            }
            i27 = i7 + 1;
            hashSet4 = hashSet;
        }
        this.J = (p[]) arrayList3.toArray(new p[0]);
        this.H = this.J.length;
        for (int i30 = 0; i30 < this.L; i30++) {
            this.J[i30].d.l = true;
        }
        for (p pVar2 : this.J) {
            if (!pVar2.T) {
                u0 u0Var = new u0();
                u0Var.a = pVar2.f0;
                pVar2.c(new v0(u0Var));
            }
        }
        this.K = this.J;
    }

    @Override // x2.e1
    public final void r(long j3) {
        this.M.r(j3);
    }
}
