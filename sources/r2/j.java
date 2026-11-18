package r2;

import a8.la;
import a8.xa;
import android.net.Uri;
import android.util.SparseArray;
import c8.k1;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.t;
import e2.t0;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import j2.c0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l2.p1;
import l2.r0;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.of;
import p4.o0;
import r0.f1;
import s2.u;
import s2.w;
import x2.d0;
import x2.d1;
import x2.e0;
import x2.r1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class j implements e0, u {
    public final int E;
    public final m2.i F;
    public final of G = new of(this, 14);
    public d0 H;
    public int I;
    public r1 J;
    public p[] K;
    public p[] L;
    public int M;
    public x2.n N;
    public final long O;
    public final c a;
    public final s2.d b;
    public final c5 c;
    public final c0 d;
    public final q2.m e;
    public final q2.j f;
    public final qb.a h;
    public final xa n;
    public final h6.m r;
    public final IdentityHashMap s;
    public final c5 w;
    public final nb.a x;
    public final boolean y;

    public j(c cVar, s2.d dVar, c5 c5Var, c0 c0Var, q2.m mVar, q2.j jVar, qb.a aVar, xa xaVar, h6.m mVar2, nb.a aVar2, boolean z10, int i7, m2.i iVar) {
        this.a = cVar;
        this.b = dVar;
        this.c = c5Var;
        this.d = c0Var;
        this.e = mVar;
        this.f = jVar;
        this.h = aVar;
        this.n = xaVar;
        this.r = mVar2;
        this.x = aVar2;
        this.y = z10;
        this.E = i7;
        this.F = iVar;
        aVar2.getClass();
        g0 g0Var = i0.b;
        t1 t1Var = t1.e;
        this.N = new x2.n(t1Var, t1Var);
        this.s = new IdentityHashMap();
        this.w = new c5(17);
        this.K = new p[0];
        this.L = new p[0];
        this.O = Long.MIN_VALUE;
    }

    public static e2.u j(e2.u uVar, e2.u uVar2, boolean z10) {
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
            String w10 = l0.w(1, uVar.k);
            q0Var = uVar.l;
            if (z10) {
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
        int i12 = z10 ? uVar.h : -1;
        int i13 = z10 ? uVar.i : -1;
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
        for (p pVar : this.K) {
            b3.p pVar2 = pVar.s;
            h hVar = pVar.d;
            ArrayList arrayList = pVar.E;
            if (!arrayList.isEmpty()) {
                i iVar = (i) h9.o.n(arrayList);
                int c10 = hVar.c(iVar);
                int i7 = iVar.F;
                if (c10 == 1) {
                    if (!iVar.g()) {
                        la.p(i7 != -1);
                        s2.m b10 = hVar.g.b(iVar.y, false);
                        b10.getClass();
                        i0 i0Var = b10.r;
                        int i10 = (int) (iVar.s - b10.k);
                        iVar.b0 = i10 < 0 ? 0L : ((s2.h) (i10 < i0Var.size() ? ((s2.j) i0Var.get(i10)).y : b10.s).get(i7)).c;
                    }
                } else if (c10 == 0) {
                    pVar.I.post(new o0(6, pVar, iVar));
                } else if (c10 == 2 && !pVar.k0 && pVar2.d()) {
                    pVar2.b();
                }
            }
        }
        this.H.c0(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0120, code lost:
    
        if (r44 != r3.g0) goto L63;
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
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        d1[] d1VarArr2;
        int[] iArr;
        boolean z10;
        ?? r92;
        h hVar;
        int i7;
        int i10;
        d1[] d1VarArr3;
        int i11;
        int[] iArr2;
        p[] pVarArr;
        p pVar;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        boolean z13;
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
            d1 d1Var = d1VarArr[i17];
            iArr3[i17] = d1Var == null ? -1 : ((Integer) identityHashMap.get(d1Var)).intValue();
            iArr4[i17] = -1;
            a3.u uVar = uVarArr[i17];
            if (uVar != null) {
                m1 c10 = uVar.c();
                int i18 = 0;
                while (true) {
                    p[] pVarArr2 = this.K;
                    if (i18 < pVarArr2.length) {
                        p pVar2 = pVarArr2[i18];
                        pVar2.h();
                        if (pVar2.Z.b(c10) != -1) {
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
        d1[] d1VarArr4 = new d1[length2];
        int length3 = uVarArr.length;
        d1[] d1VarArr5 = new d1[length3];
        int length4 = uVarArr.length;
        a3.u[] uVarArr3 = new a3.u[length4];
        boolean z14 = false;
        p[] pVarArr3 = new p[this.K.length];
        int i19 = length3;
        int i20 = 0;
        int i21 = 0;
        boolean z15 = false;
        while (i20 < this.K.length) {
            int i22 = length2;
            ?? r72 = z14;
            while (true) {
                d1VarArr2 = d1VarArr4;
                if (r72 >= uVarArr.length) {
                    break;
                }
                d1VarArr5[r72] = iArr3[r72] == i20 ? d1VarArr[r72] : null;
                uVarArr3[r72] = iArr4[r72] == i20 ? uVarArr[r72] : null;
                d1VarArr4 = d1VarArr2;
                r72++;
            }
            p pVar3 = this.K[i20];
            b3.p pVar4 = pVar3.s;
            int i23 = i20;
            h hVar2 = pVar3.d;
            w[] wVarArr = hVar2.e;
            s2.d dVar = hVar2.g;
            ArrayList arrayList = pVar3.E;
            pVar3.h();
            int i24 = pVar3.V;
            ?? r29 = d1VarArr5;
            ?? r73 = z14;
            while (r73 < length4) {
                l lVar = (l) r29[r73];
                if (lVar == null || (uVarArr3[r73] != null && zArr[r73])) {
                    i16 = r73;
                    uVarArr2 = uVarArr3;
                } else {
                    i16 = r73;
                    pVar3.V--;
                    uVarArr2 = uVarArr3;
                    if (lVar.c != -1) {
                        p pVar5 = lVar.b;
                        int i25 = lVar.a;
                        pVar5.h();
                        pVar5.b0.getClass();
                        int i26 = pVar5.b0[i25];
                        if (i26 >= 0) {
                            la.p(pVar5.e0[i26]);
                            pVar5.e0[i26] = z14;
                        }
                        lVar.c = -1;
                    }
                    r29[i16] = 0;
                }
                uVarArr3 = uVarArr2;
                r73 = i16 + 1;
            }
            a3.u[] uVarArr4 = uVarArr3;
            boolean z16 = true;
            if (!z15) {
                if (!pVar3.j0) {
                    iArr = iArr3;
                } else if (i24 != 0) {
                    iArr = iArr3;
                }
                z10 = z14;
                a3.u uVar2 = hVar2.r;
                boolean z17 = z10;
                a3.u uVar3 = uVar2;
                r92 = z14;
                while (r92 < length4) {
                    int i27 = r92;
                    a3.u uVar4 = uVarArr4[i27];
                    if (uVar4 == null) {
                        i15 = length4;
                    } else {
                        i15 = length4;
                        boolean z18 = z17;
                        int b10 = pVar3.Z.b(uVar4.c());
                        if (b10 == pVar3.c0) {
                            Uri c11 = wVarArr[hVar2.r.m()].c();
                            s2.c cVar = (s2.c) dVar.d.get(c11);
                            if (cVar != null) {
                                s2.b bVar = (s2.b) p5.c.i(cVar.b, c11, c11);
                                bVar.getClass();
                                bVar.x = z14;
                            }
                            hVar2.r = uVar4;
                            uVar3 = uVar4;
                        }
                        if (r29[i27] == 0) {
                            pVar3.V++;
                            l lVar2 = new l(pVar3, b10);
                            r29[i27] = lVar2;
                            zArr2[i27] = z16;
                            if (pVar3.b0 != null) {
                                lVar2.b();
                                int i28 = pVar3.b0[b10];
                                if (!z18 && i28 >= 0) {
                                    o oVar = pVar3.M[i28];
                                    z17 = (oVar.v() == 0 || oVar.J(j3, z16)) ? false : true;
                                }
                            }
                        }
                        z17 = z18;
                    }
                    length4 = i15;
                    z14 = false;
                    z16 = true;
                    r92 = i27 + 1;
                }
                int i29 = length4;
                boolean z19 = z17;
                if (pVar3.V != 0) {
                    Uri c12 = wVarArr[hVar2.r.m()].c();
                    s2.c cVar2 = (s2.c) dVar.d.get(c12);
                    if (cVar2 != null) {
                        s2.b bVar2 = (s2.b) p5.c.i(cVar2.b, c12, c12);
                        bVar2.getClass();
                        bVar2.x = false;
                    }
                    hVar2.n = null;
                    pVar3.X = null;
                    pVar3.i0 = true;
                    arrayList.clear();
                    if (pVar4.d()) {
                        if (pVar3.T) {
                            for (o oVar2 : pVar3.M) {
                                oVar2.l();
                            }
                        }
                        pVar4.b();
                    } else {
                        pVar3.G();
                    }
                    hVar = hVar2;
                    i12 = i19;
                    i10 = i22;
                    d1VarArr3 = d1VarArr2;
                    i11 = i23;
                    z12 = z19;
                    iArr2 = iArr4;
                    pVarArr = pVarArr3;
                    pVar = pVar3;
                } else {
                    boolean z20 = true;
                    if (arrayList.isEmpty() || Objects.equals(uVar3, uVar2)) {
                        hVar = hVar2;
                        i7 = i19;
                        i10 = i22;
                        d1VarArr3 = d1VarArr2;
                        i11 = i23;
                        iArr2 = iArr4;
                        pVarArr = pVarArr3;
                        pVar = pVar3;
                    } else {
                        if (pVar3.j0) {
                            hVar = hVar2;
                            i7 = i19;
                            i10 = i22;
                            d1VarArr3 = d1VarArr2;
                            i11 = i23;
                            iArr2 = iArr4;
                            pVarArr = pVarArr3;
                            pVar = pVar3;
                        } else {
                            long j10 = j3 < 0 ? -j3 : 0L;
                            i A = pVar3.A();
                            long j11 = j10;
                            y2.m[] b11 = hVar2.b(A, j3);
                            hVar = hVar2;
                            List list = pVar3.F;
                            i7 = i19;
                            i10 = i22;
                            d1VarArr3 = d1VarArr2;
                            i11 = i23;
                            iArr2 = iArr4;
                            pVarArr = pVarArr3;
                            pVar = pVar3;
                            a3.u uVar5 = uVar3;
                            uVar5.e(j3, j11, -9223372036854775807L, list, b11);
                            if (uVar5.m() != hVar.h.a(A.d)) {
                                z20 = true;
                            } else {
                                z20 = true;
                            }
                        }
                        pVar.i0 = z20;
                        z11 = z20;
                        z12 = z11;
                        if (z12) {
                            i12 = i7;
                        } else {
                            pVar.H(j3, z11);
                            i12 = i7;
                            int i30 = 0;
                            while (i30 < i12) {
                                if (r29[i30] != 0) {
                                    zArr2[i30] = z20;
                                }
                                i30++;
                                z20 = true;
                            }
                        }
                    }
                    z11 = z15;
                    z12 = z19;
                    if (z12) {
                    }
                }
                ArrayList arrayList2 = pVar.J;
                arrayList2.clear();
                for (i13 = 0; i13 < i12; i13++) {
                    ?? r82 = r29[i13];
                    if (r82 != 0) {
                        arrayList2.add((l) r82);
                    }
                }
                pVar.j0 = true;
                i14 = 0;
                z13 = false;
                while (i14 < uVarArr.length) {
                    ?? r83 = r29[i14];
                    int i31 = i11;
                    if (iArr2[i14] == i31) {
                        r83.getClass();
                        r10 = d1VarArr3;
                        r10[i14] = r83;
                        identityHashMap.put(r83, Integer.valueOf(i31));
                        z13 = true;
                    } else {
                        r10 = d1VarArr3;
                        if (iArr[i14] == i31) {
                            la.p(r83 == 0);
                        }
                    }
                    i14++;
                    d1VarArr3 = r10;
                    i11 = i31;
                }
                d1[] d1VarArr6 = d1VarArr3;
                int i32 = i11;
                int i33 = i21;
                if (!z13) {
                    pVarArr[i33] = pVar;
                    i21 = i33 + 1;
                    if (i33 == 0) {
                        hVar.l = true;
                        if (!z12) {
                            p[] pVarArr4 = this.L;
                            if (pVarArr4.length != 0 && pVar == pVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.w.a).clear();
                        z15 = true;
                    } else {
                        hVar.l = i32 < this.M;
                    }
                }
                i20 = i32 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                pVarArr3 = pVarArr;
                d1VarArr5 = r29;
                uVarArr3 = uVarArr4;
                length2 = i10;
                z14 = false;
                i19 = i12;
                d1VarArr4 = d1VarArr6;
                length4 = i29;
            }
            iArr = iArr3;
            z10 = true;
            a3.u uVar22 = hVar2.r;
            boolean z172 = z10;
            a3.u uVar32 = uVar22;
            r92 = z14;
            while (r92 < length4) {
            }
            int i292 = length4;
            boolean z192 = z172;
            if (pVar3.V != 0) {
            }
            ArrayList arrayList22 = pVar.J;
            arrayList22.clear();
            while (i13 < i12) {
            }
            pVar.j0 = true;
            i14 = 0;
            z13 = false;
            while (i14 < uVarArr.length) {
            }
            d1[] d1VarArr62 = d1VarArr3;
            int i322 = i11;
            int i332 = i21;
            if (!z13) {
            }
            i20 = i322 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            pVarArr3 = pVarArr;
            d1VarArr5 = r29;
            uVarArr3 = uVarArr4;
            length2 = i10;
            z14 = false;
            i19 = i12;
            d1VarArr4 = d1VarArr62;
            length4 = i292;
        }
        boolean z21 = z14;
        System.arraycopy(d1VarArr4, z21 ? 1 : 0, d1VarArr, z21 ? 1 : 0, length2);
        p[] pVarArr5 = (p[]) l0.U(i21, pVarArr3);
        this.L = pVarArr5;
        t1 r11 = i0.r(pVarArr5);
        AbstractList y10 = h9.o.y(r11, new f1(1));
        this.x.getClass();
        this.N = new x2.n(r11, y10);
        return j3;
    }

    @Override // x2.f1
    public final boolean c(l2.s0 s0Var) {
        if (this.J != null) {
            return this.N.c(s0Var);
        }
        for (p pVar : this.K) {
            if (!pVar.U) {
                r0 r0Var = new r0();
                r0Var.a = pVar.g0;
                pVar.c(new l2.s0(r0Var));
            }
        }
        return false;
    }

    @Override // s2.u
    public final boolean d(Uri uri, b3.j jVar, boolean z10) {
        int i7;
        boolean z11;
        b3.i iVar;
        int u10;
        p[] pVarArr = this.K;
        int length = pVarArr.length;
        int i10 = 0;
        boolean z12 = false;
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
                    if (z10) {
                        iVar = null;
                    } else {
                        b3.h a10 = hVar.a(uri);
                        pVar.r.getClass();
                        iVar = qb.a.Q4(a10, jVar);
                    }
                    hVar.o = uri;
                    if (iVar != null) {
                        int i12 = iVar.a;
                        i7 = i10;
                        long j3 = iVar.b;
                        if (i12 == 1) {
                            s2.c cVar2 = (s2.c) dVar.d.get(uri);
                            if (cVar2 != null) {
                                z11 = s2.c.c(cVar2, uri, j3);
                            }
                        } else {
                            if (i12 != 2) {
                                throw new IllegalStateException(i5.c.i(i12, "Invalid fallback selection type: "));
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
                                    z11 = true;
                                }
                            }
                        }
                    }
                } else {
                    i11++;
                }
            }
            i7 = i10;
            z11 = false;
            z12 |= z11;
            i10 = i7 + 1;
        }
        this.H.c0(this);
        return z12;
    }

    @Override // x2.f1
    public final long e() {
        return this.N.e();
    }

    @Override // x2.e0
    public final long f(long j3, p1 p1Var) {
        p[] pVarArr = this.L;
        int length = pVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            p pVar = pVarArr[i7];
            if (pVar.R == 2) {
                h hVar = pVar.d;
                s2.d dVar = hVar.g;
                int d = hVar.r.d();
                w[] wVarArr = hVar.e;
                s2.m b10 = (d >= wVarArr.length || d == -1) ? null : dVar.b(wVarArr[hVar.r.m()].c(), true);
                if (b10 != null) {
                    i0 i0Var = b10.r;
                    if (!i0Var.isEmpty()) {
                        long j10 = b10.h - dVar.J;
                        long j11 = j3 - j10;
                        int d2 = l0.d(i0Var, Long.valueOf(j11), true);
                        long j12 = ((s2.j) i0Var.get(d2)).e;
                        return p1Var.a(j11, j12, (!b10.c || d2 == i0Var.size() - 1) ? j12 : ((s2.j) i0Var.get(d2 + 1)).e) + j10;
                    }
                }
            } else {
                i7++;
            }
        }
        return j3;
    }

    @Override // x2.f1
    public final boolean g() {
        return this.N.g();
    }

    public final p h(String str, int i7, w[] wVarArr, e2.u[] uVarArr, e2.u uVar, List list, Map map, long j3) {
        p pVar = new p(str, i7, this.G, new h(this.a, this.b, wVarArr, uVarArr, this.c, this.d, this.w, list, this.F), map, this.r, j3, uVar, this.e, this.f, this.h, this.n, this.E, null);
        long j10 = this.O;
        pVar.l0 = j10;
        if (pVar.T) {
            for (o oVar : pVar.M) {
                oVar.K(j10);
            }
        }
        return pVar;
    }

    @Override // x2.e0
    public final void i() {
        for (p pVar : this.K) {
            pVar.E();
            if (pVar.k0 && !pVar.U) {
                throw t0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // x2.e0
    public final long k(long j3) {
        p[] pVarArr = this.L;
        if (pVarArr.length > 0) {
            boolean H = pVarArr[0].H(j3, false);
            int i7 = 1;
            while (true) {
                p[] pVarArr2 = this.L;
                if (i7 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i7].H(j3, H);
                i7++;
            }
            if (H) {
                ((SparseArray) this.w.a).clear();
            }
        }
        return j3;
    }

    @Override // x2.e0
    public final void n(long j3) {
        for (p pVar : this.L) {
            if (pVar.T && !pVar.C()) {
                int length = pVar.M.length;
                for (int i7 = 0; i7 < length; i7++) {
                    pVar.M[i7].k(j3, pVar.e0[i7]);
                }
            }
        }
    }

    @Override // x2.e0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // x2.e0
    public final r1 q() {
        r1 r1Var = this.J;
        r1Var.getClass();
        return r1Var;
    }

    @Override // x2.f1
    public final long r() {
        return this.N.r();
    }

    @Override // x2.e0
    public final void t(d0 d0Var, long j3) {
        String str;
        c cVar;
        boolean z10;
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
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        List list;
        this.H = d0Var;
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
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.a;
        boolean z14 = this.y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z14;
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
                if (i15 > 0 || l0.w(2, str2) != null) {
                    int i16 = i13;
                    iArr[i14] = 2;
                    i12++;
                    i13 = i16;
                } else if (l0.w(1, str2) != null) {
                    iArr[i14] = 1;
                    i13++;
                } else {
                    iArr[i14] = -1;
                }
            }
            int i17 = i13;
            if (i12 > 0) {
                z12 = false;
                i11 = i12;
                z11 = true;
            } else if (i17 < size) {
                int i18 = size - i17;
                z11 = false;
                i11 = i18;
                z12 = true;
            } else {
                z11 = false;
                z12 = false;
                i11 = size;
            }
            w[] wVarArr = new w[i11];
            e2.u[] uVarArr = new e2.u[i11];
            int[] iArr2 = new int[i11];
            int i19 = 0;
            boolean z15 = z11;
            int i20 = 0;
            while (i20 < c10.size()) {
                if (z15) {
                    list = list2;
                    if (iArr[i20] != 2) {
                        i20++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z12 || iArr[i20] != 1) {
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
            int v = l0.v(2, str3);
            int i21 = 1;
            int v10 = l0.v(1, str3);
            boolean z16 = (v10 == 1 || (v10 == 0 && c11.isEmpty())) && v <= 1 && v10 + v > 0;
            if (z15 || v10 <= 0) {
                z13 = true;
                i21 = 0;
            } else {
                z13 = true;
            }
            z10 = z14;
            i0Var = c12;
            p h = h("main", i21, wVarArr, uVarArr, uVar, list3, map3, j3);
            arrayList3.add(h);
            arrayList4.add(iArr2);
            if (z10 && z16) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    e2.u[] uVarArr2 = new e2.u[i11];
                    int i22 = 0;
                    while (i22 < i11) {
                        e2.u uVar3 = uVarArr[i22];
                        String w10 = l0.w(2, uVar3.k);
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
                        t a10 = j(uVarArr4[0], uVar, false).a();
                        a10.l = "main";
                        arrayList5.add(new m1("main:audio", new e2.u(a10)));
                    }
                    if (list3 != null) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            String i24 = i5.c.i(i23, "main:cc:");
                            t a11 = cVar2.b((e2.u) list3.get(i23)).a();
                            a11.l = "main";
                            arrayList5.add(new m1(i24, new e2.u(a11)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    e2.u[] uVarArr5 = new e2.u[i11];
                    for (int i25 = 0; i25 < i11; i25++) {
                        uVarArr5[i25] = j(uVarArr[i25], uVar, true);
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
                h.F((m1[]) arrayList5.toArray(new m1[0]), arrayList5.indexOf(m1Var));
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
        int i26 = 0;
        while (i26 < c11.size()) {
            String str4 = ((w) c11.get(i26)).a.c;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z17 = true;
                for (int i27 = 0; i27 < c11.size(); i27++) {
                    if (str4.equals(((w) c11.get(i27)).a.c)) {
                        w wVar2 = (w) c11.get(i27);
                        e2.u uVar4 = wVar2.a.a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(wVar2);
                        arrayList7.add(uVar4);
                        z17 &= l0.v(1, uVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = l0.a;
                i10 = i26;
                hashSet2 = hashSet3;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                p h7 = h(concat, 1, (w[]) arrayList6.toArray(new w[0]), (e2.u[]) arrayList7.toArray(new e2.u[0]), null, Collections.EMPTY_LIST, map2, j3);
                arrayList4.add(k1.f(arrayList2));
                arrayList3.add(h7);
                if (z10 && z17) {
                    String v11 = p5.c.v(concat, ":id3");
                    t tVar3 = new t();
                    tVar3.a = str;
                    tVar3.r = s0.n("application/id3");
                    tVar3.l = concat;
                    h7.F(new m1[]{new m1(concat, (e2.u[]) arrayList.toArray(new e2.u[0])), new m1(v11, new e2.u(tVar3))}, 1);
                }
            } else {
                hashSet2 = hashSet3;
                i10 = i26;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            }
            i26 = i10 + 1;
            arrayList7 = arrayList;
            c11 = i0Var2;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
            map = map2;
        }
        Map map4 = map;
        this.M = arrayList3.size();
        ArrayList arrayList9 = new ArrayList(i0Var.size());
        ArrayList arrayList10 = new ArrayList(i0Var.size());
        ArrayList arrayList11 = new ArrayList(i0Var.size());
        HashSet hashSet4 = new HashSet();
        int i28 = 0;
        while (i28 < i0Var.size()) {
            i0 i0Var3 = i0Var;
            String str6 = ((w) i0Var3.get(i28)).a.c;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i29 = 0; i29 < i0Var3.size(); i29++) {
                    if (str6.equals(((w) i0Var3.get(i29)).a.c)) {
                        w wVar3 = (w) i0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(wVar3);
                        arrayList10.add(wVar3.a.a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                e2.u[] uVarArr6 = (e2.u[]) arrayList10.toArray(new e2.u[0]);
                String str7 = l0.a;
                w[] wVarArr2 = (w[]) arrayList9.toArray(new w[0]);
                g0 g0Var = i0.b;
                i0Var = i0Var3;
                i7 = i28;
                hashSet = hashSet4;
                p h10 = h(concat2, 3, wVarArr2, uVarArr6, null, t1.e, map4, j3);
                arrayList4.add(k1.f(arrayList11));
                arrayList3.add(h10);
                int length = uVarArr6.length;
                e2.u[] uVarArr7 = new e2.u[length];
                for (int i30 = 0; i30 < length; i30++) {
                    uVarArr7[i30] = cVar.b(uVarArr6[i30]);
                }
                h10.F(new m1[]{new m1(concat2, uVarArr7)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i7 = i28;
                i0Var = i0Var3;
            }
            i28 = i7 + 1;
            hashSet4 = hashSet;
        }
        this.K = (p[]) arrayList3.toArray(new p[0]);
        this.I = this.K.length;
        for (int i31 = 0; i31 < this.M; i31++) {
            this.K[i31].d.l = true;
        }
        for (p pVar2 : this.K) {
            if (!pVar2.U) {
                r0 r0Var = new r0();
                r0Var.a = pVar2.g0;
                pVar2.c(new l2.s0(r0Var));
            }
        }
        this.L = this.K;
    }

    @Override // x2.f1
    public final void u(long j3) {
        this.N.u(j3);
    }
}
