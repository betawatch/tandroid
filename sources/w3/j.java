package w3;

import android.util.Pair;
import android.util.SparseArray;
import b2.p0;
import b2.r0;
import b2.s0;
import c3.f0;
import c3.h0;
import c3.w;
import com.google.android.gms.internal.vision.e2;
import e2.b0;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import n4.x;
import org.telegram.tgnet.ConnectionsManager;
import v7.t6;
import v7.w7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j implements c3.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final b2.s P;
    public long A;
    public long B;
    public i C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public c3.q I;
    public h0[] J;
    public h0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final z3.k a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final v i;
    public final b0 j;
    public final e2.c o;
    public final h0 p;
    public final xa.d q;
    public a1 r;
    public int s;
    public int t;
    public long u;
    public int v;
    public v w;
    public long x;
    public int y;
    public long z;
    public final x k = new x(28);
    public final v l = new v(16);
    public final v e = new v(f2.p.a);
    public final v f = new v(6);
    public final v g = new v();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        b2.r rVar = new b2.r();
        rVar.q = r0.n("application/x-emsg");
        P = new b2.s(rVar);
    }

    public j(z3.k kVar, int i10, b0 b0Var, List list, l2.o oVar) {
        this.a = kVar;
        this.b = i10;
        this.j = b0Var;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new v(bArr);
        g0 g0Var = i0.b;
        this.r = a1.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = c3.q.m;
        this.J = new h0[0];
        this.K = new h0[0];
        this.o = new e2.c(new g(this));
        this.q = new xa.d(7);
        this.N = -1L;
    }

    public static b2.o d(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            f2.e eVar = (f2.e) list.get(i10);
            if (eVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = eVar.c.a;
                j6.l j3 = p.j(bArr);
                UUID uuid = j3 == null ? null : (UUID) j3.b;
                if (uuid == null) {
                    e2.a.n("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new b2.n(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new b2.o(null, false, (b2.n[]) arrayList.toArray(new b2.n[0]));
    }

    public static void e(v vVar, int i10, s sVar) {
        vVar.J(i10 + 8);
        int j3 = vVar.j();
        byte[] bArr = e.a;
        if ((j3 & 1) != 0) {
            throw s0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (j3 & 2) != 0;
        int B = vVar.B();
        if (B == 0) {
            Arrays.fill(sVar.l, 0, sVar.e, false);
            return;
        }
        int i11 = sVar.e;
        v vVar2 = sVar.n;
        if (B != i11) {
            StringBuilder j10 = hg.c.j(B, "Senc sample count ", " is different from fragment sample count");
            j10.append(sVar.e);
            throw s0.a(null, j10.toString());
        }
        Arrays.fill(sVar.l, 0, B, z10);
        vVar2.G(vVar.a());
        sVar.k = true;
        sVar.o = true;
        vVar.h(0, vVar2.c, vVar2.a);
        vVar2.J(0);
        sVar.o = false;
    }

    public static Pair f(long j3, v vVar) {
        long C;
        long C2;
        v vVar2 = vVar;
        vVar2.J(8);
        int e7 = e.e(vVar2.j());
        vVar2.K(4);
        long z10 = vVar2.z();
        if (e7 == 0) {
            C = vVar2.z();
            C2 = vVar2.z();
        } else {
            C = vVar2.C();
            C2 = vVar2.C();
        }
        long j10 = C2 + j3;
        String str = d0.a;
        long X = d0.X(C, 1000000L, z10, RoundingMode.DOWN);
        vVar2.K(2);
        int D = vVar2.D();
        int[] iArr = new int[D];
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        long[] jArr3 = new long[D];
        long j11 = j10;
        long j12 = X;
        int i10 = 0;
        while (i10 < D) {
            int j13 = vVar2.j();
            if ((Integer.MIN_VALUE & j13) != 0) {
                throw s0.a(null, "Unhandled indirect reference");
            }
            long z11 = vVar2.z();
            iArr[i10] = j13 & ConnectionsManager.DEFAULT_DATACENTER_ID;
            jArr[i10] = j11;
            jArr3[i10] = j12;
            C += z11;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long X2 = d0.X(C, 1000000L, z10, RoundingMode.DOWN);
            jArr4[i10] = X2 - jArr5[i10];
            vVar2.K(4);
            j11 += iArr[i10];
            i10++;
            D = D;
            vVar2 = vVar;
            j12 = X2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(X), new c3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        a1 a1Var;
        f0 n10 = p.n(pVar, true, false);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.b;
            a1Var = a1.e;
        }
        this.r = a1Var;
        return n10 == null;
    }

    public final void b() {
        this.s = 0;
        this.v = 0;
    }

    @Override // c3.o
    public final void g(c3.q qVar) {
        int i10;
        int i11 = this.b;
        if ((i11 & 32) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.a);
        }
        this.I = qVar;
        b();
        h0[] h0VarArr = new h0[2];
        this.J = h0VarArr;
        int i12 = 0;
        h0 h0Var = this.p;
        if (h0Var != null) {
            h0VarArr[0] = h0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            h0VarArr[i10] = this.I.f2(100, 5);
            i13 = 101;
            i10++;
        }
        h0[] h0VarArr2 = (h0[]) d0.R(i10, this.J);
        this.J = h0VarArr2;
        for (h0 h0Var2 : h0VarArr2) {
            h0Var2.b(P);
        }
        List list = this.c;
        this.K = new h0[list.size()];
        while (i12 < this.K.length) {
            h0 f22 = this.I.f2(i13, 3);
            f22.b((b2.s) list.get(i12));
            this.K[i12] = f22;
            i12++;
            i13++;
        }
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i) sparseArray.valueAt(i10)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j10;
        this.m.clear();
        b();
    }

    @Override // c3.o
    public final List i() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0423, code lost:
    
        if ((e2.d0.X(r39, 1000000, r7, r45) + e2.d0.X(r7[0], 1000000, r3.c, r45)) >= r3.e) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x07df, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x07e2, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j3) {
        p0 p0Var;
        ArrayList arrayList;
        p0 p0Var2;
        f fVar;
        int i10;
        f fVar2;
        ArrayList arrayList2;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i12;
        int i13;
        int i14;
        int i15;
        int size;
        int i16;
        byte[] bArr;
        int i17;
        boolean z10;
        int i18;
        int i19;
        ArrayList arrayList5;
        int i20;
        int i21;
        boolean z11;
        int i22;
        int i23;
        f fVar3;
        int i24;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((f2.d) arrayDeque.peek()).c != j3) {
                break;
            }
            f2.d dVar = (f2.d) arrayDeque.pop();
            int i25 = dVar.b;
            ArrayList arrayList6 = dVar.e;
            ArrayList arrayList7 = dVar.d;
            int i26 = this.b;
            int i27 = 12;
            SparseArray sparseArray = this.d;
            if (i25 == 1836019574) {
                b2.o d = d(arrayList7);
                f2.d d10 = dVar.d(1836475768);
                d10.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList8 = d10.d;
                int size2 = arrayList8.size();
                long j10 = -9223372036854775807L;
                int i28 = 0;
                while (i28 < size2) {
                    f2.e eVar = (f2.e) arrayList8.get(i28);
                    int i29 = eVar.b;
                    v vVar = eVar.c;
                    if (i29 == 1953654136) {
                        vVar.J(i27);
                        arrayList2 = arrayList8;
                        Pair create = Pair.create(Integer.valueOf(vVar.j()), new f(vVar.j() - 1, vVar.j(), vVar.j(), vVar.j()));
                        sparseArray2.put(((Integer) create.first).intValue(), (f) create.second);
                    } else {
                        arrayList2 = arrayList8;
                        if (i29 == 1835362404) {
                            vVar.J(8);
                            j10 = e.e(vVar.j()) == 0 ? vVar.z() : vVar.C();
                        }
                    }
                    i28++;
                    arrayList8 = arrayList2;
                    i27 = 12;
                }
                int i30 = 0;
                f2.d d11 = dVar.d(1835365473);
                p0 f7 = d11 != null ? e.f(d11) : null;
                w wVar = new w();
                f2.e e7 = dVar.e(1969517665);
                if (e7 != null) {
                    p0 k10 = e.k(e7);
                    wVar.b(k10);
                    p0Var = k10;
                } else {
                    p0Var = null;
                }
                f2.e e10 = dVar.e(1836476516);
                e10.getClass();
                p0 p0Var3 = new p0(e.g(e10.c));
                ArrayList j11 = e.j(dVar, wVar, j10, d, (i26 & 16) != 0, false, new g(this));
                int size3 = j11.size();
                if (sparseArray.size() == 0) {
                    String c10 = p.c(j11);
                    int i31 = 0;
                    while (i31 < size3) {
                        t tVar = (t) j11.get(i31);
                        q qVar = tVar.a;
                        c3.q qVar2 = this.I;
                        int i32 = qVar.b;
                        int i33 = qVar.a;
                        b2.s sVar = qVar.g;
                        int i34 = size3;
                        String str = c10;
                        long j12 = qVar.e;
                        h0 f22 = qVar2.f2(i31, i32);
                        f22.getClass();
                        b2.r a2 = sVar.a();
                        int i35 = i31;
                        a2.p = r0.n(str);
                        if (i32 == 1) {
                            int i36 = wVar.a;
                            p0Var2 = p0Var3;
                            arrayList = j11;
                            if (i36 != -1 && (i10 = wVar.b) != -1) {
                                a2.L = i36;
                                a2.M = i10;
                            }
                        } else {
                            arrayList = j11;
                            p0Var2 = p0Var3;
                        }
                        p0 p0Var4 = sVar.l;
                        p0[] p0VarArr = new p0[2];
                        p0VarArr[i30] = p0Var;
                        p0VarArr[1] = p0Var2;
                        p.m(i32, f7, a2, p0Var4, p0VarArr);
                        if (sparseArray2.size() == 1) {
                            fVar = (f) sparseArray2.valueAt(i30);
                        } else {
                            fVar = (f) sparseArray2.get(i33);
                            fVar.getClass();
                        }
                        sparseArray.put(i33, new i(f22, tVar, fVar, new b2.s(a2)));
                        this.A = Math.max(this.A, j12);
                        i31 = i35 + 1;
                        size3 = i34;
                        c10 = str;
                        p0Var3 = p0Var2;
                        j11 = arrayList;
                        i30 = 0;
                    }
                    this.I.k1();
                } else {
                    ArrayList arrayList9 = j11;
                    e2.d.g(sparseArray.size() == size3);
                    int i37 = 0;
                    while (i37 < size3) {
                        ArrayList arrayList10 = arrayList9;
                        t tVar2 = (t) arrayList10.get(i37);
                        q qVar3 = tVar2.a;
                        i iVar = (i) sparseArray.get(qVar3.a);
                        int i38 = qVar3.a;
                        if (sparseArray2.size() == 1) {
                            fVar2 = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar2 = (f) sparseArray2.get(i38);
                            fVar2.getClass();
                        }
                        iVar.d = tVar2;
                        iVar.e = fVar2;
                        iVar.a.b(iVar.j);
                        iVar.e();
                        i37++;
                        arrayList9 = arrayList10;
                    }
                }
            } else if (i25 == 1836019558) {
                int size4 = arrayList6.size();
                int i39 = 0;
                while (i39 < size4) {
                    f2.d dVar2 = (f2.d) arrayList6.get(i39);
                    if (dVar2.b == 1953653094) {
                        f2.e e11 = dVar2.e(1952868452);
                        ArrayList arrayList11 = dVar2.d;
                        e11.getClass();
                        v vVar2 = e11.c;
                        vVar2.J(8);
                        int j13 = vVar2.j();
                        byte[] bArr2 = e.a;
                        i iVar2 = (i) sparseArray.get(vVar2.j());
                        if (iVar2 == null) {
                            i11 = size4;
                            iVar2 = null;
                        } else {
                            s sVar2 = iVar2.b;
                            if ((j13 & 1) != 0) {
                                long C = vVar2.C();
                                sVar2.b = C;
                                sVar2.c = C;
                            }
                            f fVar4 = iVar2.e;
                            int j14 = (j13 & 2) != 0 ? vVar2.j() - 1 : fVar4.a;
                            int j15 = (j13 & 8) != 0 ? vVar2.j() : fVar4.b;
                            if ((j13 & 16) != 0) {
                                i11 = size4;
                                i14 = vVar2.j();
                            } else {
                                i11 = size4;
                                i14 = fVar4.c;
                            }
                            sVar2.a = new f(j14, j15, i14, (j13 & 32) != 0 ? vVar2.j() : fVar4.d);
                        }
                        if (iVar2 == null) {
                            arrayList3 = arrayList6;
                            arrayList4 = arrayList7;
                            i12 = i39;
                            i13 = i26;
                        } else {
                            s sVar3 = iVar2.b;
                            long j16 = sVar3.p;
                            boolean z12 = sVar3.q;
                            iVar2.e();
                            iVar2.m = true;
                            f2.e e12 = dVar2.e(1952867444);
                            if (e12 == null || (i26 & 2) != 0) {
                                sVar3.p = j16;
                                sVar3.q = z12;
                            } else {
                                v vVar3 = e12.c;
                                vVar3.J(8);
                                sVar3.p = e.e(vVar3.j()) == 1 ? vVar3.C() : vVar3.z();
                                sVar3.q = true;
                            }
                            int size5 = arrayList11.size();
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            while (true) {
                                i15 = 1953658222;
                                if (i40 >= size5) {
                                    break;
                                }
                                f2.e eVar2 = (f2.e) arrayList11.get(i40);
                                ArrayList arrayList12 = arrayList6;
                                if (eVar2.b == 1953658222) {
                                    v vVar4 = eVar2.c;
                                    vVar4.J(12);
                                    int B = vVar4.B();
                                    if (B > 0) {
                                        i42 += B;
                                        i41++;
                                    }
                                }
                                i40++;
                                arrayList6 = arrayList12;
                            }
                            arrayList3 = arrayList6;
                            iVar2.h = 0;
                            iVar2.g = 0;
                            iVar2.f = 0;
                            sVar3.d = i41;
                            sVar3.e = i42;
                            if (sVar3.g.length < i41) {
                                sVar3.f = new long[i41];
                                sVar3.g = new int[i41];
                            }
                            if (sVar3.h.length < i42) {
                                int i43 = (i42 * 125) / 100;
                                sVar3.h = new int[i43];
                                sVar3.i = new long[i43];
                                sVar3.j = new boolean[i43];
                                sVar3.l = new boolean[i43];
                            }
                            int i44 = 0;
                            int i45 = 0;
                            int i46 = 0;
                            while (true) {
                                long j17 = 0;
                                if (i44 < size5) {
                                    f2.e eVar3 = (f2.e) arrayList11.get(i44);
                                    if (eVar3.b == i15) {
                                        int i47 = i45 + 1;
                                        v vVar5 = eVar3.c;
                                        vVar5.J(8);
                                        int j18 = vVar5.j();
                                        byte[] bArr3 = e.a;
                                        i18 = size5;
                                        q qVar4 = iVar2.d.a;
                                        i19 = i44;
                                        f fVar5 = sVar3.a;
                                        String str2 = d0.a;
                                        arrayList5 = arrayList7;
                                        sVar3.g[i45] = vVar5.B();
                                        long[] jArr = sVar3.f;
                                        i20 = i39;
                                        i21 = i26;
                                        long j19 = sVar3.b;
                                        jArr[i45] = j19;
                                        if ((j18 & 1) != 0) {
                                            jArr[i45] = j19 + vVar5.j();
                                        }
                                        boolean z13 = (j18 & 4) != 0;
                                        int i48 = fVar5.d;
                                        if (z13) {
                                            i48 = vVar5.j();
                                        }
                                        boolean z14 = (j18 & 256) != 0;
                                        boolean z15 = z13;
                                        boolean z16 = (j18 & 512) != 0;
                                        boolean z17 = (j18 & 1024) != 0;
                                        boolean z18 = (j18 & 2048) != 0;
                                        boolean z19 = z17;
                                        long[] jArr2 = qVar4.i;
                                        int i49 = i48;
                                        long[] jArr3 = qVar4.j;
                                        if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                            z11 = z14;
                                        } else {
                                            long j20 = jArr2[0];
                                            if (j20 == 0) {
                                                z11 = z14;
                                            } else {
                                                z11 = z14;
                                                long j21 = qVar4.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j17 = jArr3[0];
                                        }
                                        int[] iArr = sVar3.h;
                                        long[] jArr4 = sVar3.i;
                                        boolean z20 = z11;
                                        boolean[] zArr = sVar3.j;
                                        boolean z21 = qVar4.b == 2 && (i21 & 1) != 0;
                                        int i50 = sVar3.g[i45] + i46;
                                        long j22 = qVar4.c;
                                        long j23 = sVar3.p;
                                        while (i46 < i50) {
                                            int j24 = z20 ? vVar5.j() : fVar5.b;
                                            boolean z22 = z21;
                                            if (j24 < 0) {
                                                throw s0.a(null, "Unexpected negative value: " + j24);
                                            }
                                            if (z16) {
                                                i22 = i50;
                                                i23 = vVar5.j();
                                            } else {
                                                i22 = i50;
                                                i23 = fVar5.c;
                                            }
                                            if (i23 < 0) {
                                                throw s0.a(null, "Unexpected negative value: " + i23);
                                            }
                                            int j25 = z19 ? vVar5.j() : (i46 == 0 && z15) ? i49 : fVar5.d;
                                            if (z18) {
                                                fVar3 = fVar5;
                                                i24 = vVar5.j();
                                            } else {
                                                fVar3 = fVar5;
                                                i24 = 0;
                                            }
                                            int i51 = j25;
                                            long X = d0.X((i24 + j23) - j17, 1000000L, j22, RoundingMode.DOWN);
                                            jArr4[i46] = X;
                                            if (!sVar3.q) {
                                                jArr4[i46] = X + iVar2.d.h;
                                            }
                                            iArr[i46] = i23;
                                            zArr[i46] = ((i51 >> 16) & 1) == 0 && (!z22 || i46 == 0);
                                            j23 += j24;
                                            i46++;
                                            z21 = z22;
                                            i50 = i22;
                                            fVar5 = fVar3;
                                        }
                                        sVar3.p = j23;
                                        i45 = i47;
                                        i46 = i50;
                                    } else {
                                        i18 = size5;
                                        i19 = i44;
                                        arrayList5 = arrayList7;
                                        i20 = i39;
                                        i21 = i26;
                                    }
                                    i44 = i19 + 1;
                                    size5 = i18;
                                    arrayList7 = arrayList5;
                                    i26 = i21;
                                    i39 = i20;
                                    i15 = 1953658222;
                                } else {
                                    arrayList4 = arrayList7;
                                    i12 = i39;
                                    i13 = i26;
                                    q qVar5 = iVar2.d.a;
                                    f fVar6 = sVar3.a;
                                    fVar6.getClass();
                                    r rVar = qVar5.l[fVar6.a];
                                    f2.e e13 = dVar2.e(1935763834);
                                    if (e13 != null) {
                                        rVar.getClass();
                                        v vVar6 = e13.c;
                                        int i52 = rVar.d;
                                        vVar6.J(8);
                                        int j26 = vVar6.j();
                                        byte[] bArr4 = e.a;
                                        if ((j26 & 1) == 1) {
                                            vVar6.K(8);
                                        }
                                        int x10 = vVar6.x();
                                        int B2 = vVar6.B();
                                        if (B2 > sVar3.e) {
                                            StringBuilder j27 = hg.c.j(B2, "Saiz sample count ", " is greater than fragment sample count");
                                            j27.append(sVar3.e);
                                            throw s0.a(null, j27.toString());
                                        }
                                        if (x10 == 0) {
                                            boolean[] zArr2 = sVar3.l;
                                            i17 = 0;
                                            for (int i53 = 0; i53 < B2; i53++) {
                                                int x11 = vVar6.x();
                                                i17 += x11;
                                                zArr2[i53] = x11 > i52;
                                            }
                                            z10 = false;
                                        } else {
                                            boolean z23 = x10 > i52;
                                            i17 = x10 * B2;
                                            z10 = false;
                                            Arrays.fill(sVar3.l, 0, B2, z23);
                                        }
                                        Arrays.fill(sVar3.l, B2, sVar3.e, z10);
                                        if (i17 > 0) {
                                            sVar3.n.G(i17);
                                            sVar3.k = true;
                                            sVar3.o = true;
                                        }
                                    }
                                    f2.e e14 = dVar2.e(1935763823);
                                    if (e14 != null) {
                                        v vVar7 = e14.c;
                                        vVar7.J(8);
                                        int j28 = vVar7.j();
                                        byte[] bArr5 = e.a;
                                        if ((j28 & 1) == 1) {
                                            vVar7.K(8);
                                        }
                                        int B3 = vVar7.B();
                                        if (B3 != 1) {
                                            throw s0.a(null, "Unexpected saio entry count: " + B3);
                                        }
                                        sVar3.c += e.e(j28) == 0 ? vVar7.z() : vVar7.C();
                                    }
                                    f2.e e15 = dVar2.e(1936027235);
                                    if (e15 != null) {
                                        e(e15.c, 0, sVar3);
                                    }
                                    String str3 = rVar != null ? rVar.b : null;
                                    v vVar8 = null;
                                    v vVar9 = null;
                                    for (int i54 = 0; i54 < arrayList11.size(); i54++) {
                                        f2.e eVar4 = (f2.e) arrayList11.get(i54);
                                        v vVar10 = eVar4.c;
                                        int i55 = eVar4.b;
                                        if (i55 == 1935828848) {
                                            vVar10.J(12);
                                            if (vVar10.j() == 1936025959) {
                                                vVar8 = vVar10;
                                            }
                                        } else if (i55 == 1936158820) {
                                            vVar10.J(12);
                                            if (vVar10.j() == 1936025959) {
                                                vVar9 = vVar10;
                                            }
                                        }
                                    }
                                    if (vVar8 != null && vVar9 != null) {
                                        vVar8.J(8);
                                        int e16 = e.e(vVar8.j());
                                        vVar8.K(4);
                                        if (e16 == 1) {
                                            vVar8.K(4);
                                        }
                                        if (vVar8.j() != 1) {
                                            throw s0.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        vVar9.J(8);
                                        int e17 = e.e(vVar9.j());
                                        vVar9.K(4);
                                        if (e17 == 1) {
                                            if (vVar9.z() == 0) {
                                                throw s0.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (e17 >= 2) {
                                            vVar9.K(4);
                                        }
                                        if (vVar9.z() != 1) {
                                            throw s0.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        vVar9.K(1);
                                        int x12 = vVar9.x();
                                        int i56 = (x12 & 240) >> 4;
                                        int i57 = x12 & 15;
                                        boolean z24 = vVar9.x() == 1;
                                        if (z24) {
                                            int x13 = vVar9.x();
                                            byte[] bArr6 = new byte[16];
                                            vVar9.h(0, 16, bArr6);
                                            if (x13 == 0) {
                                                int x14 = vVar9.x();
                                                byte[] bArr7 = new byte[x14];
                                                vVar9.h(0, x14, bArr7);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            sVar3.k = true;
                                            sVar3.m = new r(z24, str3, x13, bArr6, i56, i57, bArr);
                                            size = arrayList11.size();
                                            for (i16 = 0; i16 < size; i16++) {
                                                f2.e eVar5 = (f2.e) arrayList11.get(i16);
                                                if (eVar5.b == 1970628964) {
                                                    v vVar11 = eVar5.c;
                                                    vVar11.J(8);
                                                    byte[] bArr8 = this.h;
                                                    vVar11.h(0, 16, bArr8);
                                                    if (Arrays.equals(bArr8, O)) {
                                                        e(vVar11, 16, sVar3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList11.size();
                                    while (i16 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i11 = size4;
                        arrayList3 = arrayList6;
                        arrayList4 = arrayList7;
                        i12 = i39;
                        i13 = i26;
                    }
                    i39 = i12 + 1;
                    size4 = i11;
                    arrayList6 = arrayList3;
                    arrayList7 = arrayList4;
                    i26 = i13;
                }
                b2.o d12 = d(arrayList7);
                if (d12 != null) {
                    int size6 = sparseArray.size();
                    for (int i58 = 0; i58 < size6; i58++) {
                        i iVar3 = (i) sparseArray.valueAt(i58);
                        q qVar6 = iVar3.d.a;
                        f fVar7 = iVar3.b.a;
                        String str4 = d0.a;
                        r rVar2 = qVar6.l[fVar7.a];
                        b2.o a10 = d12.a(rVar2 != null ? rVar2.b : null);
                        b2.r a11 = iVar3.j.a();
                        a11.u = a10;
                        iVar3.a.b(new b2.s(a11));
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i59 = 0; i59 < size7; i59++) {
                        i iVar4 = (i) sparseArray.valueAt(i59);
                        long j29 = this.z;
                        int i60 = iVar4.f;
                        while (true) {
                            s sVar4 = iVar4.b;
                            if (i60 < sVar4.e && sVar4.i[i60] <= j29) {
                                if (sVar4.j[i60]) {
                                    iVar4.i = i60;
                                }
                                i60++;
                            }
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((f2.d) arrayDeque.peek()).e.add(dVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:369:0x00ce, code lost:
    
        r5 = r2.a;
        r6 = r2.b;
        r9 = r32.s;
        r12 = org.telegram.messenger.MediaController.VIDEO_MIME_TYPE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x00dd, code lost:
    
        if (r9 != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x00e1, code lost:
    
        if (r2.m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x00e3, code lost:
    
        r9 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00f2, code lost:
    
        r32.D = r9;
        r9 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0100, code lost:
    
        if (j$.util.Objects.equals(r9.r, org.telegram.messenger.MediaController.VIDEO_MIME_TYPE) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0104, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0106, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0119, code lost:
    
        r32.G = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0121, code lost:
    
        if (r2.f >= r2.i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0123, code lost:
    
        r33.r(r32.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x012c, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x012f, code lost:
    
        r3 = r6.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0133, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0135, code lost:
    
        r3.K(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0138, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x013c, code lost:
    
        if (r6.k == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0142, code lost:
    
        if (r6.l[r1] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0144, code lost:
    
        r3.K(r3.D() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0150, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0152, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0155, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0158, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0161, code lost:
    
        if (r2.d.a.h != r21) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0163, code lost:
    
        r32.D -= 8;
        r33.r(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x017c, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.r) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x017e, code lost:
    
        r32.E = r2.d(r32.D, 7);
        c3.b.g(r32.D, r8);
        r5.d(7, r8);
        r32.E += 7;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x01a1, code lost:
    
        r32.D += r32.E;
        r32.s = 4;
        r32.F = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0197, code lost:
    
        r8 = 0;
        r32.E = r2.d(r32.D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0109, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0112, code lost:
    
        if (j$.util.Objects.equals(r9.r, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0116, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x00ec, code lost:
    
        r9 = r6.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01ac, code lost:
    
        r4 = r2.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01b2, code lost:
    
        if (r2.m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01b4, code lost:
    
        r15 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01ba, code lost:
    
        r34 = "video/hevc";
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01c5, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01c7, code lost:
    
        r10 = r14.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01cb, code lost:
    
        r4 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01cf, code lost:
    
        if (r4 == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01d1, code lost:
    
        r9 = r32.f;
        r15 = r9.a;
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r6 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01e1, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01e7, code lost:
    
        if (r32.E >= r32.D) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x01e9, code lost:
    
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01eb, code lost:
    
        if (r2 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x01f0, code lost:
    
        if (r32.K.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01f4, code lost:
    
        if (r32.G != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x020b, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x020c, code lost:
    
        r33.readFully(r15, r6, r4 + r2);
        r9.J(0);
        r19 = r9.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0219, code lost:
    
        if (r19 < 0) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x021b, code lost:
    
        r32.F = r19 - r2;
        r13 = r32.e;
        r25 = r4;
        r13.J(0);
        r5.d(4, r13);
        r32.E += 4;
        r32.D += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0238, code lost:
    
        if (r32.K.length <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x023a, code lost:
    
        if (r2 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x023c, code lost:
    
        r13 = r15[4];
        r4 = r8.r;
        r20 = r6;
        r6 = r8.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0248, code lost:
    
        if (j$.util.Objects.equals(r4, r12) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x024e, code lost:
    
        if (b2.r0.b(r6, r12) == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0251, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x025c, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0264, code lost:
    
        if (j$.util.Objects.equals(r8.r, r12) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x026a, code lost:
    
        if (b2.r0.b(r6, r12) == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0281, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0282, code lost:
    
        r32.H = r4;
        r5.d(r2, r9);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x028c, code lost:
    
        if (r2 <= 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0290, code lost:
    
        if (r32.G != false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0296, code lost:
    
        if (f2.p.c(r15, r2, r8) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0298, code lost:
    
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x029b, code lost:
    
        r34 = r12;
        r6 = r20;
        r2 = r22;
        r4 = r25;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0274, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0279, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0255, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x025a, code lost:
    
        if ((r13 & 31) == 6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0277, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x027b, code lost:
    
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x02ae, code lost:
    
        throw b2.s0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x01f6, code lost:
    
        r2 = f2.p.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0206, code lost:
    
        if ((r4 + r2) > (r32.D - r32.E)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0208, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x02af, code lost:
    
        r25 = r4;
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x02b9, code lost:
    
        if (r32.H == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x02bb, code lost:
    
        r4 = r32.g;
        r4.G(r2);
        r33.readFully(r4.a, 0, r32.F);
        r5.d(r32.F, r4);
        r2 = r32.F;
        r2 = f2.p.m(r4.c, r4.a);
        r4.J(0);
        r4.I(r2);
        r2 = r8.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x02e2, code lost:
    
        if (r2 != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x02e6, code lost:
    
        if (r7.a == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x02e8, code lost:
    
        r7.k(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x02f3, code lost:
    
        r7.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x02ff, code lost:
    
        if ((r22.a() & 4) == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0301, code lost:
    
        r7.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0304, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x030e, code lost:
    
        r32.E += r2;
        r32.F -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x02ee, code lost:
    
        if (r7.a == r2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x02f0, code lost:
    
        r7.k(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0307, code lost:
    
        r2 = r5.a(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x032d, code lost:
    
        r1 = r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0333, code lost:
    
        if (r32.G != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0335, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0338, code lost:
    
        r28 = r1;
        r1 = r22.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x033e, code lost:
    
        if (r1 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0340, code lost:
    
        r31 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0347, code lost:
    
        r26 = r10;
        r5.c(r26, r28, r32.D, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0358, code lost:
    
        if (r3.isEmpty() != false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x035a, code lost:
    
        r1 = (w3.h) r3.removeFirst();
        r32.y -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x036b, code lost:
    
        if (r1.b == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x036d, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x036f, code lost:
    
        if (r14 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0371, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0375, code lost:
    
        r7 = r4;
        r2 = r32.J;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x037a, code lost:
    
        if (r5 >= r4) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x037c, code lost:
    
        r2[r5].c(r7, 1, r1.c, r32.y, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x038e, code lost:
    
        if (r22.c() != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0390, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0393, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0398, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0345, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0319, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x031b, code lost:
    
        r2 = r32.E;
        r4 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x031f, code lost:
    
        if (r2 >= r4) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0321, code lost:
    
        r32.E += r5.a(r33, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x01be, code lost:
    
        r15 = r6.i[r2.f];
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(c3.p pVar, c3.s sVar) {
        char c10;
        boolean z10;
        int i10;
        int i11;
        String s10;
        String s11;
        long j3;
        long j10;
        long X;
        long z11;
        while (true) {
            int i12 = this.s;
            ArrayDeque arrayDeque = this.m;
            e2.c cVar = this.o;
            v vVar = this.i;
            xa.d dVar = this.q;
            SparseArray sparseArray = this.d;
            boolean z12 = true;
            if (i12 != 0) {
                ArrayDeque arrayDeque2 = this.n;
                int i13 = this.b;
                b0 b0Var = this.j;
                if (i12 != 1) {
                    long j11 = Long.MAX_VALUE;
                    if (i12 != 2) {
                        i iVar = this.C;
                        if (iVar != null) {
                            c10 = 2;
                            z10 = true;
                            i10 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        c10 = 2;
                        int i14 = 0;
                        i iVar2 = null;
                        while (i14 < size) {
                            i iVar3 = (i) sparseArray.valueAt(i14);
                            boolean z13 = z12;
                            boolean z14 = iVar3.m;
                            s sVar2 = iVar3.b;
                            if (z14) {
                                i11 = size;
                            } else {
                                i11 = size;
                                if (iVar3.f == iVar3.d.b) {
                                    i14++;
                                    z12 = z13;
                                    size = i11;
                                }
                            }
                            if (!z14 || iVar3.h != sVar2.d) {
                                long j12 = !z14 ? iVar3.d.c[iVar3.f] : sVar2.f[iVar3.h];
                                if (j12 < j11) {
                                    iVar2 = iVar3;
                                    j11 = j12;
                                }
                            }
                            i14++;
                            z12 = z13;
                            size = i11;
                        }
                        z10 = z12;
                        i10 = 8;
                        if (iVar2 == null) {
                            int position = (int) (this.x - pVar.getPosition());
                            if (position < 0) {
                                throw s0.a(null, "Offset to end of mdat was negative.");
                            }
                            pVar.r(position);
                            b();
                        } else {
                            int position2 = (int) ((!iVar2.m ? iVar2.d.c[iVar2.f] : iVar2.b.f[iVar2.h]) - pVar.getPosition());
                            if (position2 < 0) {
                                e2.a.n("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            pVar.r(position2);
                            this.C = iVar2;
                            iVar = iVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        i iVar4 = null;
                        for (int i15 = 0; i15 < size2; i15++) {
                            s sVar3 = ((i) sparseArray.valueAt(i15)).b;
                            if (sVar3.o) {
                                long j13 = sVar3.c;
                                if (j13 < j11) {
                                    iVar4 = (i) sparseArray.valueAt(i15);
                                    j11 = j13;
                                }
                            }
                        }
                        if (iVar4 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j11 - pVar.getPosition());
                            if (position3 < 0) {
                                throw s0.a(null, "Offset to encryption data was negative.");
                            }
                            pVar.r(position3);
                            s sVar4 = iVar4.b;
                            v vVar2 = sVar4.n;
                            pVar.readFully(vVar2.a, 0, vVar2.c);
                            vVar2.J(0);
                            sVar4.o = false;
                        }
                    }
                } else {
                    int i16 = (int) (this.u - this.v);
                    v vVar3 = this.w;
                    if (vVar3 != null) {
                        pVar.readFully(vVar3.a, 8, i16);
                        int i17 = this.t;
                        f2.e eVar = new f2.e(i17, vVar3);
                        if (!arrayDeque.isEmpty()) {
                            ((f2.d) arrayDeque.peek()).d.add(eVar);
                        } else if (i17 == 1936286840) {
                            Pair f7 = f(pVar.getPosition(), vVar3);
                            dVar.a((c3.j) f7.second);
                            if (!this.L) {
                                this.B = ((Long) f7.first).longValue();
                                this.I.d2((c3.b0) f7.second);
                                this.L = true;
                            } else if ((i13 & 256) != 0 && !this.M && ((LinkedHashMap) dVar.b).size() > 1) {
                                this.N = pVar.getPosition();
                            }
                        } else if (i17 == 1701671783 && this.J.length != 0) {
                            vVar3.J(8);
                            int e7 = e.e(vVar3.j());
                            long j14 = -9223372036854775807L;
                            if (e7 == 0) {
                                s10 = vVar3.s();
                                s10.getClass();
                                s11 = vVar3.s();
                                s11.getClass();
                                long z15 = vVar3.z();
                                long z16 = vVar3.z();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long X2 = d0.X(z16, 1000000L, z15, roundingMode);
                                long j15 = this.B;
                                long j16 = j15 != -9223372036854775807L ? j15 + X2 : -9223372036854775807L;
                                j3 = X2;
                                j10 = j16;
                                X = d0.X(vVar3.z(), 1000L, z15, roundingMode);
                                z11 = vVar3.z();
                            } else if (e7 != 1) {
                                e2.m(e7, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long z17 = vVar3.z();
                                long C = vVar3.C();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j10 = d0.X(C, 1000000L, z17, roundingMode2);
                                long X3 = d0.X(vVar3.z(), 1000L, z17, roundingMode2);
                                long z18 = vVar3.z();
                                s10 = vVar3.s();
                                s10.getClass();
                                s11 = vVar3.s();
                                s11.getClass();
                                X = X3;
                                z11 = z18;
                                j3 = -9223372036854775807L;
                            }
                            String str = s10;
                            String str2 = s11;
                            byte[] bArr = new byte[vVar3.a()];
                            vVar3.h(0, vVar3.a(), bArr);
                            v vVar4 = new v(this.k.P(new n3.a(str, str2, X, z11, bArr)));
                            int a2 = vVar4.a();
                            h0[] h0VarArr = this.J;
                            int length = h0VarArr.length;
                            int i18 = 0;
                            while (i18 < length) {
                                h0 h0Var = h0VarArr[i18];
                                vVar4.J(0);
                                h0Var.d(a2, vVar4);
                                i18++;
                                j14 = j14;
                            }
                            if (j10 == j14) {
                                arrayDeque2.addLast(new h(a2, j3, true));
                                this.y += a2;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new h(a2, j10, false));
                                this.y += a2;
                            } else if (b0Var == null || b0Var.f()) {
                                if (b0Var != null) {
                                    j10 = b0Var.a(j10);
                                }
                                long j17 = j10;
                                for (h0 h0Var2 : this.J) {
                                    h0Var2.c(j17, 1, a2, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new h(a2, j10, false));
                                this.y += a2;
                            }
                        }
                    } else {
                        pVar.r(i16);
                    }
                    j(pVar.getPosition());
                }
            } else {
                int i19 = this.v;
                long j18 = 0;
                v vVar5 = this.l;
                if (i19 == 0) {
                    if (!pVar.c(vVar5.a, 0, 8, true)) {
                        long j19 = this.N;
                        if (j19 == -1) {
                            cVar.c(0);
                            return -1;
                        }
                        sVar.a = j19;
                        this.N = -1L;
                        c3.q qVar = this.I;
                        dVar.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (c3.j jVar : ((LinkedHashMap) dVar.b).values()) {
                            arrayList.add(jVar.b);
                            arrayList2.add(jVar.c);
                            arrayList3.add(jVar.d);
                            arrayList4.add(jVar.e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            j18 += iArr2.length;
                        }
                        int i20 = (int) j18;
                        t6.b(j18, "the total number of elements (%s) in the arrays must fit in an int", j18 == ((long) i20));
                        int[] iArr3 = new int[i20];
                        int i21 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, i21, iArr4.length);
                            i21 += iArr4.length;
                        }
                        qVar.d2(new c3.j(iArr3, w7.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), w7.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), w7.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    vVar5.J(0);
                    this.u = vVar5.z();
                    this.t = vVar5.j();
                }
                long j20 = this.u;
                if (j20 == 1) {
                    pVar.readFully(vVar5.a, 8, 8);
                    this.v += 8;
                    this.u = vVar5.C();
                } else if (j20 == 0) {
                    long length2 = pVar.getLength();
                    if (length2 == -1 && !arrayDeque.isEmpty()) {
                        length2 = ((f2.d) arrayDeque.peek()).c;
                    }
                    if (length2 != -1) {
                        this.u = (length2 - pVar.getPosition()) + this.v;
                    }
                }
                long j21 = this.u;
                long j22 = this.v;
                if (j21 < j22) {
                    throw s0.c("Atom size less than header length (unsupported).");
                }
                if (this.N != -1) {
                    if (this.t == 1936286840) {
                        vVar.G((int) j21);
                        System.arraycopy(vVar5.a, 0, vVar.a, 0, 8);
                        pVar.readFully(vVar.a, 8, (int) (this.u - this.v));
                        dVar.a((c3.j) f(pVar.j(), vVar).second);
                    } else {
                        pVar.g((int) (j21 - j22), true);
                    }
                    b();
                } else {
                    long position4 = pVar.getPosition() - this.v;
                    int i22 = this.t;
                    if ((i22 == 1836019558 || i22 == 1835295092) && !this.L) {
                        this.I.d2(new c3.t(this.A, position4));
                        this.L = true;
                    }
                    if (this.t == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i23 = 0; i23 < size3; i23++) {
                            s sVar5 = ((i) sparseArray.valueAt(i23)).b;
                            sVar5.getClass();
                            sVar5.c = position4;
                            sVar5.b = position4;
                        }
                    }
                    int i24 = this.t;
                    if (i24 == 1835295092) {
                        this.C = null;
                        this.x = position4 + this.u;
                        this.s = 2;
                    } else if (i24 == 1836019574 || i24 == 1953653099 || i24 == 1835297121 || i24 == 1835626086 || i24 == 1937007212 || i24 == 1836019558 || i24 == 1953653094 || i24 == 1836475768 || i24 == 1701082227 || i24 == 1835365473) {
                        long position5 = pVar.getPosition();
                        long j23 = this.u;
                        long j24 = (position5 + j23) - 8;
                        if (j23 != this.v && this.t == 1835365473) {
                            vVar.G(8);
                            pVar.a(0, 8, vVar.a);
                            e.a(vVar);
                            pVar.r(vVar.b);
                            pVar.q();
                        }
                        arrayDeque.push(new f2.d(this.t, j24));
                        if (this.u == this.v) {
                            j(j24);
                        } else {
                            b();
                        }
                    } else if (i24 == 1751411826 || i24 == 1835296868 || i24 == 1836476516 || i24 == 1936286840 || i24 == 1937011556 || i24 == 1937011827 || i24 == 1668576371 || i24 == 1937011555 || i24 == 1937011578 || i24 == 1937013298 || i24 == 1937007471 || i24 == 1668232756 || i24 == 1937011571 || i24 == 1952867444 || i24 == 1952868452 || i24 == 1953196132 || i24 == 1953654136 || i24 == 1953658222 || i24 == 1886614376 || i24 == 1935763834 || i24 == 1935763823 || i24 == 1936027235 || i24 == 1970628964 || i24 == 1935828848 || i24 == 1936158820 || i24 == 1701606260 || i24 == 1835362404 || i24 == 1701671783 || i24 == 1969517665 || i24 == 1801812339 || i24 == 1768715124) {
                        if (this.v != 8) {
                            throw s0.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.u > 2147483647L) {
                            throw s0.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        v vVar6 = new v((int) this.u);
                        System.arraycopy(vVar5.a, 0, vVar6.a, 0, 8);
                        this.w = vVar6;
                        this.s = 1;
                    } else {
                        if (this.u > 2147483647L) {
                            throw s0.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.w = null;
                        this.s = 1;
                    }
                }
            }
        }
    }

    @Override // c3.o
    public final c3.o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
