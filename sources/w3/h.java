package w3;

import android.util.Pair;
import android.util.SparseArray;
import b2.p0;
import b2.r0;
import b2.s;
import b2.s0;
import c3.f0;
import c3.h0;
import c3.t;
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
import n4.y;
import org.telegram.tgnet.ConnectionsManager;
import v7.t6;
import v7.y7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h implements c3.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final s P;
    public long A;
    public long B;
    public g C;
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
    public final a4.m q;
    public a1 r;
    public int s;
    public int t;
    public long u;
    public int v;
    public v w;
    public long x;
    public int y;
    public long z;
    public final y k = new y(27);
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
        P = new s(rVar);
    }

    public h(z3.k kVar, int i10, b0 b0Var, List list, l2.n nVar) {
        this.a = kVar;
        this.b = i10;
        this.j = b0Var;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = nVar;
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
        this.o = new e2.c(new e(this));
        this.q = new a4.m(8);
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
                j6.l j3 = n.j(bArr);
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

    public static void e(v vVar, int i10, q qVar) {
        vVar.J(i10 + 8);
        int j3 = vVar.j();
        byte[] bArr = c.a;
        if ((j3 & 1) != 0) {
            throw s0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (j3 & 2) != 0;
        int B = vVar.B();
        if (B == 0) {
            Arrays.fill(qVar.l, 0, qVar.e, false);
            return;
        }
        int i11 = qVar.e;
        v vVar2 = qVar.n;
        if (B != i11) {
            StringBuilder l4 = i2.g.l(B, "Senc sample count ", " is different from fragment sample count");
            l4.append(qVar.e);
            throw s0.a(null, l4.toString());
        }
        Arrays.fill(qVar.l, 0, B, z10);
        vVar2.G(vVar.a());
        qVar.k = true;
        qVar.o = true;
        vVar.h(0, vVar2.c, vVar2.a);
        vVar2.J(0);
        qVar.o = false;
    }

    public static Pair f(long j3, v vVar) {
        long C;
        long C2;
        v vVar2 = vVar;
        vVar2.J(8);
        int e7 = c.e(vVar2.j());
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
        long Y = d0.Y(C, 1000000L, z10, RoundingMode.DOWN);
        vVar2.K(2);
        int D = vVar2.D();
        int[] iArr = new int[D];
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        long[] jArr3 = new long[D];
        long j11 = j10;
        long j12 = Y;
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
            long Y2 = d0.Y(C, 1000000L, z10, RoundingMode.DOWN);
            jArr4[i10] = Y2 - jArr5[i10];
            vVar2.K(4);
            j11 += iArr[i10];
            i10++;
            D = D;
            vVar2 = vVar;
            j12 = Y2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(Y), new c3.j(iArr, jArr, jArr2, jArr3));
    }

    public final void a() {
        this.s = 0;
        this.v = 0;
    }

    @Override // c3.o
    public final boolean b(c3.p pVar) {
        a1 a1Var;
        f0 n10 = n.n(pVar, true, false);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.b;
            a1Var = a1.e;
        }
        this.r = a1Var;
        return n10 == null;
    }

    @Override // c3.o
    public final void g(c3.q qVar) {
        int i10;
        int i11 = this.b;
        if ((i11 & 32) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.a);
        }
        this.I = qVar;
        a();
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
            h0VarArr[i10] = this.I.R1(100, 5);
            i13 = 101;
            i10++;
        }
        h0[] h0VarArr2 = (h0[]) d0.S(i10, this.J);
        this.J = h0VarArr2;
        for (h0 h0Var2 : h0VarArr2) {
            h0Var2.b(P);
        }
        List list = this.c;
        this.K = new h0[list.size()];
        while (i12 < this.K.length) {
            h0 R1 = this.I.R1(i13, 3);
            R1.b((s) list.get(i12));
            this.K[i12] = R1;
            i12++;
            i13++;
        }
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) sparseArray.valueAt(i10)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j10;
        this.m.clear();
        a();
    }

    @Override // c3.o
    public final List i() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x041f, code lost:
    
        if ((e2.d0.Y(r39, 1000000, r7, r45) + e2.d0.Y(r7[0], 1000000, r3.c, r45)) >= r3.e) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x07db, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x07de, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j3) {
        p0 p0Var;
        ArrayList arrayList;
        p0 p0Var2;
        d dVar;
        int i10;
        d dVar2;
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
        d dVar3;
        int i24;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((f2.d) arrayDeque.peek()).c != j3) {
                break;
            }
            f2.d dVar4 = (f2.d) arrayDeque.pop();
            int i25 = dVar4.b;
            ArrayList arrayList6 = dVar4.e;
            ArrayList arrayList7 = dVar4.d;
            int i26 = this.b;
            int i27 = 12;
            SparseArray sparseArray = this.d;
            if (i25 == 1836019574) {
                b2.o d = d(arrayList7);
                f2.d d10 = dVar4.d(1836475768);
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
                        Pair create = Pair.create(Integer.valueOf(vVar.j()), new d(vVar.j() - 1, vVar.j(), vVar.j(), vVar.j()));
                        sparseArray2.put(((Integer) create.first).intValue(), (d) create.second);
                    } else {
                        arrayList2 = arrayList8;
                        if (i29 == 1835362404) {
                            vVar.J(8);
                            j10 = c.e(vVar.j()) == 0 ? vVar.z() : vVar.C();
                        }
                    }
                    i28++;
                    arrayList8 = arrayList2;
                    i27 = 12;
                }
                char c10 = 0;
                f2.d d11 = dVar4.d(1835365473);
                p0 f7 = d11 != null ? c.f(d11) : null;
                w wVar = new w();
                f2.e e7 = dVar4.e(1969517665);
                if (e7 != null) {
                    p0 k10 = c.k(e7);
                    wVar.b(k10);
                    p0Var = k10;
                } else {
                    p0Var = null;
                }
                f2.e e10 = dVar4.e(1836476516);
                e10.getClass();
                p0 p0Var3 = new p0(c.g(e10.c));
                ArrayList j11 = c.j(dVar4, wVar, j10, d, (i26 & 16) != 0, false, new e(this));
                int size3 = j11.size();
                if (sparseArray.size() == 0) {
                    String c11 = n.c(j11);
                    int i30 = 0;
                    while (i30 < size3) {
                        r rVar = (r) j11.get(i30);
                        o oVar = rVar.a;
                        c3.q qVar = this.I;
                        int i31 = oVar.b;
                        int i32 = oVar.a;
                        s sVar = oVar.g;
                        int i33 = size3;
                        String str = c11;
                        long j12 = oVar.e;
                        h0 R1 = qVar.R1(i30, i31);
                        R1.getClass();
                        b2.r a2 = sVar.a();
                        int i34 = i30;
                        a2.p = r0.n(str);
                        if (i31 == 1) {
                            int i35 = wVar.a;
                            p0Var2 = p0Var3;
                            arrayList = j11;
                            if (i35 != -1 && (i10 = wVar.b) != -1) {
                                a2.L = i35;
                                a2.M = i10;
                            }
                        } else {
                            arrayList = j11;
                            p0Var2 = p0Var3;
                        }
                        p0 p0Var4 = sVar.l;
                        p0[] p0VarArr = new p0[2];
                        p0VarArr[c10] = p0Var;
                        p0VarArr[1] = p0Var2;
                        n.m(i31, f7, a2, p0Var4, p0VarArr);
                        if (sparseArray2.size() == 1) {
                            dVar = (d) sparseArray2.valueAt(0);
                        } else {
                            dVar = (d) sparseArray2.get(i32);
                            dVar.getClass();
                        }
                        sparseArray.put(i32, new g(R1, rVar, dVar, new s(a2)));
                        this.A = Math.max(this.A, j12);
                        i30 = i34 + 1;
                        size3 = i33;
                        c11 = str;
                        p0Var3 = p0Var2;
                        j11 = arrayList;
                        c10 = 0;
                    }
                    this.I.Z0();
                } else {
                    ArrayList arrayList9 = j11;
                    e2.d.g(sparseArray.size() == size3);
                    int i36 = 0;
                    while (i36 < size3) {
                        ArrayList arrayList10 = arrayList9;
                        r rVar2 = (r) arrayList10.get(i36);
                        o oVar2 = rVar2.a;
                        g gVar = (g) sparseArray.get(oVar2.a);
                        int i37 = oVar2.a;
                        if (sparseArray2.size() == 1) {
                            dVar2 = (d) sparseArray2.valueAt(0);
                        } else {
                            dVar2 = (d) sparseArray2.get(i37);
                            dVar2.getClass();
                        }
                        gVar.d = rVar2;
                        gVar.e = dVar2;
                        gVar.a.b(gVar.j);
                        gVar.e();
                        i36++;
                        arrayList9 = arrayList10;
                    }
                }
            } else if (i25 == 1836019558) {
                int size4 = arrayList6.size();
                int i38 = 0;
                while (i38 < size4) {
                    f2.d dVar5 = (f2.d) arrayList6.get(i38);
                    if (dVar5.b == 1953653094) {
                        f2.e e11 = dVar5.e(1952868452);
                        ArrayList arrayList11 = dVar5.d;
                        e11.getClass();
                        v vVar2 = e11.c;
                        vVar2.J(8);
                        int j13 = vVar2.j();
                        byte[] bArr2 = c.a;
                        g gVar2 = (g) sparseArray.get(vVar2.j());
                        if (gVar2 == null) {
                            i11 = size4;
                            gVar2 = null;
                        } else {
                            q qVar2 = gVar2.b;
                            if ((j13 & 1) != 0) {
                                long C = vVar2.C();
                                qVar2.b = C;
                                qVar2.c = C;
                            }
                            d dVar6 = gVar2.e;
                            int j14 = (j13 & 2) != 0 ? vVar2.j() - 1 : dVar6.a;
                            int j15 = (j13 & 8) != 0 ? vVar2.j() : dVar6.b;
                            if ((j13 & 16) != 0) {
                                i11 = size4;
                                i14 = vVar2.j();
                            } else {
                                i11 = size4;
                                i14 = dVar6.c;
                            }
                            qVar2.a = new d(j14, j15, i14, (j13 & 32) != 0 ? vVar2.j() : dVar6.d);
                        }
                        if (gVar2 == null) {
                            arrayList3 = arrayList6;
                            arrayList4 = arrayList7;
                            i12 = i38;
                            i13 = i26;
                        } else {
                            q qVar3 = gVar2.b;
                            long j16 = qVar3.p;
                            boolean z12 = qVar3.q;
                            gVar2.e();
                            gVar2.m = true;
                            f2.e e12 = dVar5.e(1952867444);
                            if (e12 == null || (i26 & 2) != 0) {
                                qVar3.p = j16;
                                qVar3.q = z12;
                            } else {
                                v vVar3 = e12.c;
                                vVar3.J(8);
                                qVar3.p = c.e(vVar3.j()) == 1 ? vVar3.C() : vVar3.z();
                                qVar3.q = true;
                            }
                            int size5 = arrayList11.size();
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            while (true) {
                                i15 = 1953658222;
                                if (i39 >= size5) {
                                    break;
                                }
                                f2.e eVar2 = (f2.e) arrayList11.get(i39);
                                ArrayList arrayList12 = arrayList6;
                                if (eVar2.b == 1953658222) {
                                    v vVar4 = eVar2.c;
                                    vVar4.J(12);
                                    int B = vVar4.B();
                                    if (B > 0) {
                                        i41 += B;
                                        i40++;
                                    }
                                }
                                i39++;
                                arrayList6 = arrayList12;
                            }
                            arrayList3 = arrayList6;
                            gVar2.h = 0;
                            gVar2.g = 0;
                            gVar2.f = 0;
                            qVar3.d = i40;
                            qVar3.e = i41;
                            if (qVar3.g.length < i40) {
                                qVar3.f = new long[i40];
                                qVar3.g = new int[i40];
                            }
                            if (qVar3.h.length < i41) {
                                int i42 = (i41 * 125) / 100;
                                qVar3.h = new int[i42];
                                qVar3.i = new long[i42];
                                qVar3.j = new boolean[i42];
                                qVar3.l = new boolean[i42];
                            }
                            int i43 = 0;
                            int i44 = 0;
                            int i45 = 0;
                            while (true) {
                                long j17 = 0;
                                if (i43 < size5) {
                                    f2.e eVar3 = (f2.e) arrayList11.get(i43);
                                    if (eVar3.b == i15) {
                                        int i46 = i44 + 1;
                                        v vVar5 = eVar3.c;
                                        vVar5.J(8);
                                        int j18 = vVar5.j();
                                        byte[] bArr3 = c.a;
                                        i18 = size5;
                                        o oVar3 = gVar2.d.a;
                                        i19 = i43;
                                        d dVar7 = qVar3.a;
                                        String str2 = d0.a;
                                        arrayList5 = arrayList7;
                                        qVar3.g[i44] = vVar5.B();
                                        long[] jArr = qVar3.f;
                                        i20 = i38;
                                        i21 = i26;
                                        long j19 = qVar3.b;
                                        jArr[i44] = j19;
                                        if ((j18 & 1) != 0) {
                                            jArr[i44] = j19 + vVar5.j();
                                        }
                                        boolean z13 = (j18 & 4) != 0;
                                        int i47 = dVar7.d;
                                        if (z13) {
                                            i47 = vVar5.j();
                                        }
                                        boolean z14 = (j18 & 256) != 0;
                                        boolean z15 = z13;
                                        boolean z16 = (j18 & 512) != 0;
                                        boolean z17 = (j18 & 1024) != 0;
                                        boolean z18 = (j18 & 2048) != 0;
                                        boolean z19 = z17;
                                        long[] jArr2 = oVar3.i;
                                        int i48 = i47;
                                        long[] jArr3 = oVar3.j;
                                        if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                            z11 = z14;
                                        } else {
                                            long j20 = jArr2[0];
                                            if (j20 == 0) {
                                                z11 = z14;
                                            } else {
                                                z11 = z14;
                                                long j21 = oVar3.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j17 = jArr3[0];
                                        }
                                        int[] iArr = qVar3.h;
                                        long[] jArr4 = qVar3.i;
                                        boolean z20 = z11;
                                        boolean[] zArr = qVar3.j;
                                        boolean z21 = oVar3.b == 2 && (i21 & 1) != 0;
                                        int i49 = qVar3.g[i44] + i45;
                                        long j22 = oVar3.c;
                                        long j23 = qVar3.p;
                                        while (i45 < i49) {
                                            int j24 = z20 ? vVar5.j() : dVar7.b;
                                            boolean z22 = z21;
                                            if (j24 < 0) {
                                                throw s0.a(null, "Unexpected negative value: " + j24);
                                            }
                                            if (z16) {
                                                i22 = i49;
                                                i23 = vVar5.j();
                                            } else {
                                                i22 = i49;
                                                i23 = dVar7.c;
                                            }
                                            if (i23 < 0) {
                                                throw s0.a(null, "Unexpected negative value: " + i23);
                                            }
                                            int j25 = z19 ? vVar5.j() : (i45 == 0 && z15) ? i48 : dVar7.d;
                                            if (z18) {
                                                dVar3 = dVar7;
                                                i24 = vVar5.j();
                                            } else {
                                                dVar3 = dVar7;
                                                i24 = 0;
                                            }
                                            int i50 = j25;
                                            long Y = d0.Y((i24 + j23) - j17, 1000000L, j22, RoundingMode.DOWN);
                                            jArr4[i45] = Y;
                                            if (!qVar3.q) {
                                                jArr4[i45] = Y + gVar2.d.h;
                                            }
                                            iArr[i45] = i23;
                                            zArr[i45] = ((i50 >> 16) & 1) == 0 && (!z22 || i45 == 0);
                                            j23 += j24;
                                            i45++;
                                            z21 = z22;
                                            i49 = i22;
                                            dVar7 = dVar3;
                                        }
                                        qVar3.p = j23;
                                        i44 = i46;
                                        i45 = i49;
                                    } else {
                                        i18 = size5;
                                        i19 = i43;
                                        arrayList5 = arrayList7;
                                        i20 = i38;
                                        i21 = i26;
                                    }
                                    i43 = i19 + 1;
                                    size5 = i18;
                                    arrayList7 = arrayList5;
                                    i26 = i21;
                                    i38 = i20;
                                    i15 = 1953658222;
                                } else {
                                    arrayList4 = arrayList7;
                                    i12 = i38;
                                    i13 = i26;
                                    o oVar4 = gVar2.d.a;
                                    d dVar8 = qVar3.a;
                                    dVar8.getClass();
                                    p pVar = oVar4.l[dVar8.a];
                                    f2.e e13 = dVar5.e(1935763834);
                                    if (e13 != null) {
                                        pVar.getClass();
                                        v vVar6 = e13.c;
                                        int i51 = pVar.d;
                                        vVar6.J(8);
                                        int j26 = vVar6.j();
                                        byte[] bArr4 = c.a;
                                        if ((j26 & 1) == 1) {
                                            vVar6.K(8);
                                        }
                                        int x10 = vVar6.x();
                                        int B2 = vVar6.B();
                                        if (B2 > qVar3.e) {
                                            StringBuilder l4 = i2.g.l(B2, "Saiz sample count ", " is greater than fragment sample count");
                                            l4.append(qVar3.e);
                                            throw s0.a(null, l4.toString());
                                        }
                                        if (x10 == 0) {
                                            boolean[] zArr2 = qVar3.l;
                                            i17 = 0;
                                            for (int i52 = 0; i52 < B2; i52++) {
                                                int x11 = vVar6.x();
                                                i17 += x11;
                                                zArr2[i52] = x11 > i51;
                                            }
                                            z10 = false;
                                        } else {
                                            boolean z23 = x10 > i51;
                                            i17 = x10 * B2;
                                            z10 = false;
                                            Arrays.fill(qVar3.l, 0, B2, z23);
                                        }
                                        Arrays.fill(qVar3.l, B2, qVar3.e, z10);
                                        if (i17 > 0) {
                                            qVar3.n.G(i17);
                                            qVar3.k = true;
                                            qVar3.o = true;
                                        }
                                    }
                                    f2.e e14 = dVar5.e(1935763823);
                                    if (e14 != null) {
                                        v vVar7 = e14.c;
                                        vVar7.J(8);
                                        int j27 = vVar7.j();
                                        byte[] bArr5 = c.a;
                                        if ((j27 & 1) == 1) {
                                            vVar7.K(8);
                                        }
                                        int B3 = vVar7.B();
                                        if (B3 != 1) {
                                            throw s0.a(null, "Unexpected saio entry count: " + B3);
                                        }
                                        qVar3.c += c.e(j27) == 0 ? vVar7.z() : vVar7.C();
                                    }
                                    f2.e e15 = dVar5.e(1936027235);
                                    if (e15 != null) {
                                        e(e15.c, 0, qVar3);
                                    }
                                    String str3 = pVar != null ? pVar.b : null;
                                    v vVar8 = null;
                                    v vVar9 = null;
                                    for (int i53 = 0; i53 < arrayList11.size(); i53++) {
                                        f2.e eVar4 = (f2.e) arrayList11.get(i53);
                                        v vVar10 = eVar4.c;
                                        int i54 = eVar4.b;
                                        if (i54 == 1935828848) {
                                            vVar10.J(12);
                                            if (vVar10.j() == 1936025959) {
                                                vVar8 = vVar10;
                                            }
                                        } else if (i54 == 1936158820) {
                                            vVar10.J(12);
                                            if (vVar10.j() == 1936025959) {
                                                vVar9 = vVar10;
                                            }
                                        }
                                    }
                                    if (vVar8 != null && vVar9 != null) {
                                        vVar8.J(8);
                                        int e16 = c.e(vVar8.j());
                                        vVar8.K(4);
                                        if (e16 == 1) {
                                            vVar8.K(4);
                                        }
                                        if (vVar8.j() != 1) {
                                            throw s0.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        vVar9.J(8);
                                        int e17 = c.e(vVar9.j());
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
                                        int i55 = (x12 & 240) >> 4;
                                        int i56 = x12 & 15;
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
                                            qVar3.k = true;
                                            qVar3.m = new p(z24, str3, x13, bArr6, i55, i56, bArr);
                                            size = arrayList11.size();
                                            for (i16 = 0; i16 < size; i16++) {
                                                f2.e eVar5 = (f2.e) arrayList11.get(i16);
                                                if (eVar5.b == 1970628964) {
                                                    v vVar11 = eVar5.c;
                                                    vVar11.J(8);
                                                    byte[] bArr8 = this.h;
                                                    vVar11.h(0, 16, bArr8);
                                                    if (Arrays.equals(bArr8, O)) {
                                                        e(vVar11, 16, qVar3);
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
                        i12 = i38;
                        i13 = i26;
                    }
                    i38 = i12 + 1;
                    size4 = i11;
                    arrayList6 = arrayList3;
                    arrayList7 = arrayList4;
                    i26 = i13;
                }
                b2.o d12 = d(arrayList7);
                if (d12 != null) {
                    int size6 = sparseArray.size();
                    for (int i57 = 0; i57 < size6; i57++) {
                        g gVar3 = (g) sparseArray.valueAt(i57);
                        o oVar5 = gVar3.d.a;
                        d dVar9 = gVar3.b.a;
                        String str4 = d0.a;
                        p pVar2 = oVar5.l[dVar9.a];
                        b2.o a10 = d12.a(pVar2 != null ? pVar2.b : null);
                        b2.r a11 = gVar3.j.a();
                        a11.u = a10;
                        gVar3.a.b(new s(a11));
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i58 = 0; i58 < size7; i58++) {
                        g gVar4 = (g) sparseArray.valueAt(i58);
                        long j28 = this.z;
                        int i59 = gVar4.f;
                        while (true) {
                            q qVar4 = gVar4.b;
                            if (i59 < qVar4.e && qVar4.i[i59] <= j28) {
                                if (qVar4.j[i59]) {
                                    gVar4.i = i59;
                                }
                                i59++;
                            }
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((f2.d) arrayDeque.peek()).e.add(dVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:369:0x00cb, code lost:
    
        r5 = r2.a;
        r6 = r2.b;
        r9 = r32.s;
        r12 = org.telegram.messenger.MediaController.VIDEO_MIME_TYPE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x00da, code lost:
    
        if (r9 != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x00de, code lost:
    
        if (r2.m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x00e0, code lost:
    
        r9 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00ef, code lost:
    
        r32.D = r9;
        r9 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00fd, code lost:
    
        if (j$.util.Objects.equals(r9.r, org.telegram.messenger.MediaController.VIDEO_MIME_TYPE) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0101, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0103, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0114, code lost:
    
        r32.G = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x011c, code lost:
    
        if (r2.f >= r2.i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x011e, code lost:
    
        r33.r(r32.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0127, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x012a, code lost:
    
        r3 = r6.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x012e, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0130, code lost:
    
        r3.K(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0133, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0137, code lost:
    
        if (r6.k == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x013d, code lost:
    
        if (r6.l[r1] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x013f, code lost:
    
        r3.K(r3.D() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x014c, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x014e, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0151, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0154, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x015c, code lost:
    
        if (r2.d.a.h != 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x015e, code lost:
    
        r32.D -= 8;
        r33.r(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0177, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.r) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0179, code lost:
    
        r32.E = r2.d(r32.D, 7);
        c3.b.g(r32.D, r8);
        r5.d(7, r8);
        r32.E += 7;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x019a, code lost:
    
        r32.D += r32.E;
        r32.s = 4;
        r32.F = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0191, code lost:
    
        r8 = 0;
        r32.E = r2.d(r32.D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0105, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x010d, code lost:
    
        if (j$.util.Objects.equals(r9.r, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0111, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x00e9, code lost:
    
        r9 = r6.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01a5, code lost:
    
        r4 = r2.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01ab, code lost:
    
        if (r2.m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01ad, code lost:
    
        r15 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01b3, code lost:
    
        r34 = "video/hevc";
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01be, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01c0, code lost:
    
        r10 = r14.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01c4, code lost:
    
        r4 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01c8, code lost:
    
        if (r4 == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01ca, code lost:
    
        r9 = r32.f;
        r15 = r9.a;
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r6 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01da, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01e0, code lost:
    
        if (r32.E >= r32.D) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x01e2, code lost:
    
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01e4, code lost:
    
        if (r2 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x01e9, code lost:
    
        if (r32.K.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01ed, code lost:
    
        if (r32.G != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0204, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0205, code lost:
    
        r33.readFully(r15, r6, r4 + r2);
        r9.J(0);
        r19 = r9.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0212, code lost:
    
        if (r19 < 0) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0214, code lost:
    
        r32.F = r19 - r2;
        r13 = r32.e;
        r25 = r4;
        r13.J(0);
        r5.d(4, r13);
        r32.E += 4;
        r32.D += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0231, code lost:
    
        if (r32.K.length <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0233, code lost:
    
        if (r2 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0235, code lost:
    
        r13 = r15[4];
        r4 = r8.r;
        r20 = r6;
        r6 = r8.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0241, code lost:
    
        if (j$.util.Objects.equals(r4, r12) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0247, code lost:
    
        if (b2.r0.b(r6, r12) == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x024a, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0255, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x025d, code lost:
    
        if (j$.util.Objects.equals(r8.r, r12) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0263, code lost:
    
        if (b2.r0.b(r6, r12) == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x027a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x027b, code lost:
    
        r32.H = r4;
        r5.d(r2, r9);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0285, code lost:
    
        if (r2 <= 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0289, code lost:
    
        if (r32.G != false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x028f, code lost:
    
        if (f2.p.c(r15, r2, r8) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0291, code lost:
    
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0294, code lost:
    
        r34 = r12;
        r6 = r20;
        r2 = r22;
        r4 = r25;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x026d, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0272, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x024e, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0253, code lost:
    
        if ((r13 & 31) == 6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0270, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0274, code lost:
    
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x02a7, code lost:
    
        throw b2.s0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x01ef, code lost:
    
        r2 = f2.p.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x01ff, code lost:
    
        if ((r4 + r2) > (r32.D - r32.E)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0201, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x02a8, code lost:
    
        r25 = r4;
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x02b2, code lost:
    
        if (r32.H == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x02b4, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:471:0x02db, code lost:
    
        if (r2 != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x02df, code lost:
    
        if (r7.a == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x02e1, code lost:
    
        r7.k(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x02ec, code lost:
    
        r7.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x02f8, code lost:
    
        if ((r22.a() & 4) == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x02fa, code lost:
    
        r7.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x02fd, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0307, code lost:
    
        r32.E += r2;
        r32.F -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x02e7, code lost:
    
        if (r7.a == r2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x02e9, code lost:
    
        r7.k(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0300, code lost:
    
        r2 = r5.a(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0326, code lost:
    
        r1 = r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x032c, code lost:
    
        if (r32.G != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x032e, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0331, code lost:
    
        r28 = r1;
        r1 = r22.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0337, code lost:
    
        if (r1 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0339, code lost:
    
        r31 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0340, code lost:
    
        r26 = r10;
        r5.c(r26, r28, r32.D, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0351, code lost:
    
        if (r3.isEmpty() != false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0353, code lost:
    
        r1 = (w3.f) r3.removeFirst();
        r32.y -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0364, code lost:
    
        if (r1.b == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0366, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0368, code lost:
    
        if (r14 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x036a, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x036e, code lost:
    
        r7 = r4;
        r2 = r32.J;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0373, code lost:
    
        if (r5 >= r4) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0375, code lost:
    
        r2[r5].c(r7, 1, r1.c, r32.y, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0387, code lost:
    
        if (r22.c() != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0389, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x038c, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0391, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x033e, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0312, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0314, code lost:
    
        r2 = r32.E;
        r4 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0318, code lost:
    
        if (r2 >= r4) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x031a, code lost:
    
        r32.E += r5.a(r33, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x01b7, code lost:
    
        r15 = r6.i[r2.f];
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(c3.p pVar, c3.s sVar) {
        char c10;
        int i10;
        String s10;
        String s11;
        long j3;
        long j10;
        long Y;
        long z10;
        while (true) {
            int i11 = this.s;
            ArrayDeque arrayDeque = this.m;
            e2.c cVar = this.o;
            v vVar = this.i;
            a4.m mVar = this.q;
            SparseArray sparseArray = this.d;
            if (i11 != 0) {
                ArrayDeque arrayDeque2 = this.n;
                int i12 = this.b;
                b0 b0Var = this.j;
                if (i11 != 1) {
                    long j11 = Long.MAX_VALUE;
                    if (i11 != 2) {
                        g gVar = this.C;
                        if (gVar != null) {
                            c10 = 2;
                            break;
                        }
                        int size = sparseArray.size();
                        g gVar2 = null;
                        int i13 = 0;
                        c10 = 2;
                        while (i13 < size) {
                            g gVar3 = (g) sparseArray.valueAt(i13);
                            boolean z11 = gVar3.m;
                            q qVar = gVar3.b;
                            if (z11) {
                                i10 = size;
                            } else {
                                i10 = size;
                                if (gVar3.f == gVar3.d.b) {
                                    i13++;
                                    size = i10;
                                }
                            }
                            if (!z11 || gVar3.h != qVar.d) {
                                long j12 = !z11 ? gVar3.d.c[gVar3.f] : qVar.f[gVar3.h];
                                if (j12 < j11) {
                                    gVar2 = gVar3;
                                    j11 = j12;
                                }
                            }
                            i13++;
                            size = i10;
                        }
                        if (gVar2 == null) {
                            int position = (int) (this.x - pVar.getPosition());
                            if (position < 0) {
                                throw s0.a(null, "Offset to end of mdat was negative.");
                            }
                            pVar.r(position);
                            a();
                        } else {
                            int position2 = (int) ((!gVar2.m ? gVar2.d.c[gVar2.f] : gVar2.b.f[gVar2.h]) - pVar.getPosition());
                            if (position2 < 0) {
                                e2.a.n("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            pVar.r(position2);
                            this.C = gVar2;
                            gVar = gVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        g gVar4 = null;
                        for (int i14 = 0; i14 < size2; i14++) {
                            q qVar2 = ((g) sparseArray.valueAt(i14)).b;
                            if (qVar2.o) {
                                long j13 = qVar2.c;
                                if (j13 < j11) {
                                    gVar4 = (g) sparseArray.valueAt(i14);
                                    j11 = j13;
                                }
                            }
                        }
                        if (gVar4 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j11 - pVar.getPosition());
                            if (position3 < 0) {
                                throw s0.a(null, "Offset to encryption data was negative.");
                            }
                            pVar.r(position3);
                            q qVar3 = gVar4.b;
                            v vVar2 = qVar3.n;
                            pVar.readFully(vVar2.a, 0, vVar2.c);
                            vVar2.J(0);
                            qVar3.o = false;
                        }
                    }
                } else {
                    int i15 = (int) (this.u - this.v);
                    v vVar3 = this.w;
                    if (vVar3 != null) {
                        pVar.readFully(vVar3.a, 8, i15);
                        int i16 = this.t;
                        f2.e eVar = new f2.e(i16, vVar3);
                        if (!arrayDeque.isEmpty()) {
                            ((f2.d) arrayDeque.peek()).d.add(eVar);
                        } else if (i16 == 1936286840) {
                            Pair f7 = f(pVar.getPosition(), vVar3);
                            mVar.v((c3.j) f7.second);
                            if (!this.L) {
                                this.B = ((Long) f7.first).longValue();
                                this.I.P1((c3.b0) f7.second);
                                this.L = true;
                            } else if ((i12 & 256) != 0 && !this.M && ((LinkedHashMap) mVar.b).size() > 1) {
                                this.N = pVar.getPosition();
                            }
                        } else if (i16 == 1701671783 && this.J.length != 0) {
                            vVar3.J(8);
                            int e7 = c.e(vVar3.j());
                            long j14 = -9223372036854775807L;
                            if (e7 == 0) {
                                s10 = vVar3.s();
                                s10.getClass();
                                s11 = vVar3.s();
                                s11.getClass();
                                long z12 = vVar3.z();
                                long z13 = vVar3.z();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long Y2 = d0.Y(z13, 1000000L, z12, roundingMode);
                                long j15 = this.B;
                                long j16 = j15 != -9223372036854775807L ? j15 + Y2 : -9223372036854775807L;
                                j3 = Y2;
                                j10 = j16;
                                Y = d0.Y(vVar3.z(), 1000L, z12, roundingMode);
                                z10 = vVar3.z();
                            } else if (e7 != 1) {
                                e2.n(e7, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long z14 = vVar3.z();
                                long C = vVar3.C();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j10 = d0.Y(C, 1000000L, z14, roundingMode2);
                                long Y3 = d0.Y(vVar3.z(), 1000L, z14, roundingMode2);
                                long z15 = vVar3.z();
                                s10 = vVar3.s();
                                s10.getClass();
                                s11 = vVar3.s();
                                s11.getClass();
                                Y = Y3;
                                z10 = z15;
                                j3 = -9223372036854775807L;
                            }
                            String str = s10;
                            String str2 = s11;
                            byte[] bArr = new byte[vVar3.a()];
                            vVar3.h(0, vVar3.a(), bArr);
                            v vVar4 = new v(this.k.E(new n3.a(str, str2, Y, z10, bArr)));
                            int a2 = vVar4.a();
                            h0[] h0VarArr = this.J;
                            int length = h0VarArr.length;
                            int i17 = 0;
                            while (i17 < length) {
                                h0 h0Var = h0VarArr[i17];
                                vVar4.J(0);
                                h0Var.d(a2, vVar4);
                                i17++;
                                j14 = j14;
                            }
                            if (j10 == j14) {
                                arrayDeque2.addLast(new f(a2, j3, true));
                                this.y += a2;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new f(a2, j10, false));
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
                                arrayDeque2.addLast(new f(a2, j10, false));
                                this.y += a2;
                            }
                        }
                    } else {
                        pVar.r(i15);
                    }
                    j(pVar.getPosition());
                }
            } else {
                int i18 = this.v;
                long j18 = 0;
                v vVar5 = this.l;
                if (i18 == 0) {
                    if (!pVar.d(vVar5.a, 0, 8, true)) {
                        long j19 = this.N;
                        if (j19 == -1) {
                            cVar.c(0);
                            return -1;
                        }
                        sVar.a = j19;
                        this.N = -1L;
                        c3.q qVar4 = this.I;
                        mVar.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (c3.j jVar : ((LinkedHashMap) mVar.b).values()) {
                            arrayList.add(jVar.b);
                            arrayList2.add(jVar.c);
                            arrayList3.add(jVar.d);
                            arrayList4.add(jVar.e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            j18 += iArr2.length;
                        }
                        int i19 = (int) j18;
                        t6.b(j18, "the total number of elements (%s) in the arrays must fit in an int", j18 == ((long) i19));
                        int[] iArr3 = new int[i19];
                        int i20 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, i20, iArr4.length);
                            i20 += iArr4.length;
                        }
                        qVar4.P1(new c3.j(iArr3, y7.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), y7.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), y7.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
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
                        mVar.v((c3.j) f(pVar.k(), vVar).second);
                    } else {
                        pVar.i((int) (j21 - j22), true);
                    }
                    a();
                } else {
                    long position4 = pVar.getPosition() - this.v;
                    int i21 = this.t;
                    if ((i21 == 1836019558 || i21 == 1835295092) && !this.L) {
                        this.I.P1(new t(this.A, position4));
                        this.L = true;
                    }
                    if (this.t == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i22 = 0; i22 < size3; i22++) {
                            q qVar5 = ((g) sparseArray.valueAt(i22)).b;
                            qVar5.getClass();
                            qVar5.c = position4;
                            qVar5.b = position4;
                        }
                    }
                    int i23 = this.t;
                    if (i23 == 1835295092) {
                        this.C = null;
                        this.x = position4 + this.u;
                        this.s = 2;
                    } else if (i23 == 1836019574 || i23 == 1953653099 || i23 == 1835297121 || i23 == 1835626086 || i23 == 1937007212 || i23 == 1836019558 || i23 == 1953653094 || i23 == 1836475768 || i23 == 1701082227 || i23 == 1835365473) {
                        long position5 = pVar.getPosition();
                        long j23 = this.u;
                        long j24 = (position5 + j23) - 8;
                        if (j23 != this.v && this.t == 1835365473) {
                            vVar.G(8);
                            pVar.b(0, 8, vVar.a);
                            c.a(vVar);
                            pVar.r(vVar.b);
                            pVar.q();
                        }
                        arrayDeque.push(new f2.d(this.t, j24));
                        if (this.u == this.v) {
                            j(j24);
                        } else {
                            a();
                        }
                    } else if (i23 == 1751411826 || i23 == 1835296868 || i23 == 1836476516 || i23 == 1936286840 || i23 == 1937011556 || i23 == 1937011827 || i23 == 1668576371 || i23 == 1937011555 || i23 == 1937011578 || i23 == 1937013298 || i23 == 1937007471 || i23 == 1668232756 || i23 == 1937011571 || i23 == 1952867444 || i23 == 1952868452 || i23 == 1953196132 || i23 == 1953654136 || i23 == 1953658222 || i23 == 1886614376 || i23 == 1935763834 || i23 == 1935763823 || i23 == 1936027235 || i23 == 1970628964 || i23 == 1935828848 || i23 == 1936158820 || i23 == 1701606260 || i23 == 1835362404 || i23 == 1701671783 || i23 == 1969517665 || i23 == 1801812339 || i23 == 1768715124) {
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
