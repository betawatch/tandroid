package w3;

import android.util.Pair;
import android.util.SparseArray;
import f5.c0;
import f5.d0;
import f5.w;
import j$.util.DesugarCollections;
import j3.s0;
import j3.t0;
import j3.t1;
import j7.l1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import o3.t;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import sf.f1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements o3.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final t0 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int a;
    public final List b;
    public final byte[] g;
    public final w h;
    public final c0 i;
    public final o3.w n;
    public int o;
    public int p;
    public long q;
    public int r;
    public w s;
    public long t;
    public int u;
    public h y;
    public int z;
    public final ze.b j = new ze.b(19, false);
    public final w k = new w(16);
    public final w d = new w(f5.a.d);
    public final w e = new w(5);
    public final w f = new w();
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();
    public final SparseArray c = new SparseArray();
    public long w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long x = -9223372036854775807L;
    public o3.m D = o3.m.u;
    public o3.w[] E = new o3.w[0];
    public o3.w[] F = new o3.w[0];

    static {
        s0 s0Var = new s0();
        s0Var.o = "application/x-emsg";
        I = new t0(s0Var);
    }

    public i(int i10, c0 c0Var, List list, o4.o oVar) {
        this.a = i10;
        this.i = c0Var;
        this.b = DesugarCollections.unmodifiableList(list);
        this.n = oVar;
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new w(bArr);
    }

    public static n3.c a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            if (bVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.c.a;
                o1.a e10 = j.e(bArr);
                UUID uuid = e10 == null ? null : (UUID) e10.b;
                if (uuid == null) {
                    f5.a.K("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new n3.b(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new n3.c(null, false, (n3.b[]) arrayList.toArray(new n3.b[0]));
    }

    public static void b(w wVar, int i10, q qVar) {
        wVar.C(i10 + 8);
        int e10 = wVar.e();
        if ((e10 & 1) != 0) {
            throw t1.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (e10 & 2) != 0;
        int u10 = wVar.u();
        if (u10 == 0) {
            Arrays.fill(qVar.l, 0, qVar.e, false);
            return;
        }
        int i11 = qVar.e;
        w wVar2 = qVar.n;
        if (u10 != i11) {
            StringBuilder o10 = l1.o(u10, "Senc sample count ", " is different from fragment sample count");
            o10.append(qVar.e);
            throw t1.a(o10.toString(), null);
        }
        Arrays.fill(qVar.l, 0, u10, z10);
        wVar2.z(wVar.a());
        qVar.k = true;
        qVar.o = true;
        wVar.c(0, wVar2.c, wVar2.a);
        wVar2.C(0);
        qVar.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:387:0x072e, code lost:
    
        r51.o = 0;
        r51.r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0733, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j10) {
        f fVar;
        f fVar2;
        n3.c cVar;
        int i10;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i18;
        boolean z11;
        int i19;
        int i20;
        int i21;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((a) arrayDeque.peek()).c != j10) {
                break;
            }
            a aVar = (a) arrayDeque.pop();
            int i22 = aVar.b;
            ArrayList arrayList5 = aVar.e;
            ArrayList arrayList6 = aVar.d;
            int i23 = this.a;
            int i24 = 12;
            SparseArray sparseArray = this.c;
            if (i22 == 1836019574) {
                n3.c a2 = a(arrayList6);
                a e10 = aVar.e(1836475768);
                e10.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList7 = e10.d;
                int size = arrayList7.size();
                int i25 = 0;
                long j11 = -9223372036854775807L;
                while (i25 < size) {
                    b bVar = (b) arrayList7.get(i25);
                    int i26 = bVar.b;
                    w wVar = bVar.c;
                    if (i26 == 1953654136) {
                        wVar.C(i24);
                        cVar = a2;
                        Pair create = Pair.create(Integer.valueOf(wVar.e()), new f(wVar.e() - 1, wVar.e(), wVar.e(), wVar.e()));
                        sparseArray2.put(((Integer) create.first).intValue(), (f) create.second);
                    } else {
                        cVar = a2;
                        if (i26 == 1835362404) {
                            wVar.C(8);
                            j11 = nc.k.b(wVar.e()) == 0 ? wVar.s() : wVar.v();
                        }
                    }
                    i25++;
                    a2 = cVar;
                    i24 = 12;
                }
                ArrayList e11 = e.e(aVar, new o3.q(), j11, a2, (i23 & 16) != 0, false, new f1(this, 15));
                int size2 = e11.size();
                if (sparseArray.size() == 0) {
                    for (int i27 = 0; i27 < size2; i27++) {
                        r rVar = (r) e11.get(i27);
                        o oVar = rVar.a;
                        o3.m mVar = this.D;
                        int i28 = oVar.b;
                        int i29 = oVar.a;
                        o3.w Z1 = mVar.Z1(i27, i28);
                        if (sparseArray2.size() == 1) {
                            fVar = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar = (f) sparseArray2.get(i29);
                            fVar.getClass();
                        }
                        sparseArray.put(i29, new h(Z1, rVar, fVar));
                        this.w = Math.max(this.w, oVar.e);
                    }
                    this.D.e1();
                } else {
                    f5.a.i(sparseArray.size() == size2);
                    for (int i30 = 0; i30 < size2; i30++) {
                        r rVar2 = (r) e11.get(i30);
                        o oVar2 = rVar2.a;
                        h hVar = (h) sparseArray.get(oVar2.a);
                        int i31 = oVar2.a;
                        if (sparseArray2.size() == 1) {
                            fVar2 = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar2 = (f) sparseArray2.get(i31);
                            fVar2.getClass();
                        }
                        hVar.d = rVar2;
                        hVar.e = fVar2;
                        hVar.a.b(rVar2.a.f);
                        hVar.d();
                    }
                }
            } else if (i22 == 1836019558) {
                int size3 = arrayList5.size();
                int i32 = 0;
                while (i32 < size3) {
                    a aVar2 = (a) arrayList5.get(i32);
                    if (aVar2.b == 1953653094) {
                        b f9 = aVar2.f(1952868452);
                        ArrayList arrayList8 = aVar2.d;
                        f9.getClass();
                        w wVar2 = f9.c;
                        wVar2.C(8);
                        int e12 = wVar2.e();
                        h hVar2 = (h) sparseArray.get(wVar2.e());
                        if (hVar2 == null) {
                            i10 = size3;
                            hVar2 = null;
                        } else {
                            q qVar = hVar2.b;
                            if ((e12 & 1) != 0) {
                                long v = wVar2.v();
                                qVar.b = v;
                                qVar.c = v;
                            }
                            f fVar3 = hVar2.e;
                            int e13 = (e12 & 2) != 0 ? wVar2.e() - 1 : fVar3.a;
                            int e14 = (e12 & 8) != 0 ? wVar2.e() : fVar3.b;
                            if ((e12 & 16) != 0) {
                                i10 = size3;
                                i13 = wVar2.e();
                            } else {
                                i10 = size3;
                                i13 = fVar3.c;
                            }
                            qVar.a = new f(e13, e14, i13, (e12 & 32) != 0 ? wVar2.e() : fVar3.d);
                        }
                        if (hVar2 == null) {
                            i11 = i32;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            i12 = i23;
                        } else {
                            q qVar2 = hVar2.b;
                            long j12 = qVar2.p;
                            boolean z12 = qVar2.q;
                            hVar2.d();
                            hVar2.l = true;
                            b f10 = aVar2.f(1952867444);
                            if (f10 == null || (i23 & 2) != 0) {
                                qVar2.p = j12;
                                qVar2.q = z12;
                            } else {
                                w wVar3 = f10.c;
                                wVar3.C(8);
                                qVar2.p = nc.k.b(wVar3.e()) == 1 ? wVar3.v() : wVar3.s();
                                qVar2.q = true;
                            }
                            int size4 = arrayList8.size();
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            while (true) {
                                i14 = 1953658222;
                                if (i33 >= size4) {
                                    break;
                                }
                                b bVar2 = (b) arrayList8.get(i33);
                                int i36 = i32;
                                if (bVar2.b == 1953658222) {
                                    w wVar4 = bVar2.c;
                                    wVar4.C(12);
                                    int u10 = wVar4.u();
                                    if (u10 > 0) {
                                        i35 += u10;
                                        i34++;
                                    }
                                }
                                i33++;
                                i32 = i36;
                            }
                            i11 = i32;
                            hVar2.h = 0;
                            hVar2.g = 0;
                            hVar2.f = 0;
                            qVar2.d = i34;
                            qVar2.e = i35;
                            if (qVar2.g.length < i34) {
                                qVar2.f = new long[i34];
                                qVar2.g = new int[i34];
                            }
                            if (qVar2.h.length < i35) {
                                int i37 = (i35 * 125) / 100;
                                qVar2.h = new int[i37];
                                qVar2.i = new long[i37];
                                qVar2.j = new boolean[i37];
                                qVar2.l = new boolean[i37];
                            }
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = 0;
                            while (true) {
                                long j13 = 0;
                                if (i38 < size4) {
                                    b bVar3 = (b) arrayList8.get(i38);
                                    if (bVar3.b == i14) {
                                        int i41 = i39 + 1;
                                        w wVar5 = bVar3.c;
                                        wVar5.C(8);
                                        int e15 = wVar5.e();
                                        i16 = i38;
                                        o oVar3 = hVar2.d.a;
                                        i17 = size4;
                                        f fVar4 = qVar2.a;
                                        int i42 = d0.a;
                                        arrayList3 = arrayList5;
                                        qVar2.g[i39] = wVar5.u();
                                        long[] jArr = qVar2.f;
                                        arrayList4 = arrayList6;
                                        long j14 = qVar2.b;
                                        jArr[i39] = j14;
                                        if ((e15 & 1) != 0) {
                                            jArr[i39] = j14 + wVar5.e();
                                        }
                                        boolean z13 = (e15 & 4) != 0;
                                        int i43 = fVar4.d;
                                        if (z13) {
                                            i43 = wVar5.e();
                                        }
                                        boolean z14 = z13;
                                        boolean z15 = (e15 & 256) != 0;
                                        boolean z16 = (e15 & 512) != 0;
                                        boolean z17 = (e15 & 1024) != 0;
                                        boolean z18 = (e15 & 2048) != 0;
                                        boolean z19 = z17;
                                        long[] jArr2 = oVar3.h;
                                        int i44 = i43;
                                        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                            j13 = oVar3.i[0];
                                        }
                                        int[] iArr = qVar2.h;
                                        long[] jArr3 = qVar2.i;
                                        boolean[] zArr = qVar2.j;
                                        boolean z20 = oVar3.b == 2 && (i23 & 1) != 0;
                                        int i45 = qVar2.g[i39] + i40;
                                        i18 = i23;
                                        long j15 = oVar3.c;
                                        long j16 = qVar2.p;
                                        int i46 = i40;
                                        while (i46 < i45) {
                                            int e16 = z15 ? wVar5.e() : fVar4.b;
                                            int i47 = i46;
                                            if (e16 < 0) {
                                                throw t1.a("Unexpected negative value: " + e16, null);
                                            }
                                            if (z16) {
                                                z11 = z20;
                                                i19 = wVar5.e();
                                            } else {
                                                z11 = z20;
                                                i19 = fVar4.c;
                                            }
                                            if (i19 < 0) {
                                                throw t1.a("Unexpected negative value: " + i19, null);
                                            }
                                            int e17 = z19 ? wVar5.e() : (i47 == 0 && z14) ? i44 : fVar4.d;
                                            if (z18) {
                                                i20 = e17;
                                                i21 = wVar5.e();
                                            } else {
                                                i20 = e17;
                                                i21 = 0;
                                            }
                                            f fVar5 = fVar4;
                                            long O = d0.O((i21 + j16) - j13, 1000000L, j15);
                                            jArr3[i47] = O;
                                            if (!qVar2.q) {
                                                jArr3[i47] = O + hVar2.d.h;
                                            }
                                            iArr[i47] = i19;
                                            zArr[i47] = ((i20 >> 16) & 1) == 0 && (!z11 || i47 == 0);
                                            j16 += e16;
                                            i46 = i47 + 1;
                                            z20 = z11;
                                            fVar4 = fVar5;
                                        }
                                        qVar2.p = j16;
                                        i40 = i45;
                                        i39 = i41;
                                    } else {
                                        i16 = i38;
                                        i17 = size4;
                                        arrayList3 = arrayList5;
                                        arrayList4 = arrayList6;
                                        i18 = i23;
                                    }
                                    i38 = i16 + 1;
                                    size4 = i17;
                                    arrayList5 = arrayList3;
                                    arrayList6 = arrayList4;
                                    i23 = i18;
                                    i14 = 1953658222;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList2 = arrayList6;
                                    i12 = i23;
                                    o oVar4 = hVar2.d.a;
                                    f fVar6 = qVar2.a;
                                    fVar6.getClass();
                                    p pVar = oVar4.k[fVar6.a];
                                    b f11 = aVar2.f(1935763834);
                                    if (f11 != null) {
                                        pVar.getClass();
                                        w wVar6 = f11.c;
                                        int i48 = pVar.d;
                                        wVar6.C(8);
                                        if ((wVar6.e() & 1) == 1) {
                                            wVar6.D(8);
                                        }
                                        int r6 = wVar6.r();
                                        int u11 = wVar6.u();
                                        if (u11 > qVar2.e) {
                                            StringBuilder o10 = l1.o(u11, "Saiz sample count ", " is greater than fragment sample count");
                                            o10.append(qVar2.e);
                                            throw t1.a(o10.toString(), null);
                                        }
                                        if (r6 == 0) {
                                            boolean[] zArr2 = qVar2.l;
                                            i15 = 0;
                                            for (int i49 = 0; i49 < u11; i49++) {
                                                int r9 = wVar6.r();
                                                i15 += r9;
                                                zArr2[i49] = r9 > i48;
                                            }
                                            z10 = false;
                                        } else {
                                            i15 = r6 * u11;
                                            z10 = false;
                                            Arrays.fill(qVar2.l, 0, u11, r6 > i48);
                                        }
                                        Arrays.fill(qVar2.l, u11, qVar2.e, z10);
                                        if (i15 > 0) {
                                            qVar2.n.z(i15);
                                            qVar2.k = true;
                                            qVar2.o = true;
                                        }
                                    }
                                    b f12 = aVar2.f(1935763823);
                                    if (f12 != null) {
                                        w wVar7 = f12.c;
                                        wVar7.C(8);
                                        int e18 = wVar7.e();
                                        if ((e18 & 1) == 1) {
                                            wVar7.D(8);
                                        }
                                        int u12 = wVar7.u();
                                        if (u12 != 1) {
                                            throw t1.a("Unexpected saio entry count: " + u12, null);
                                        }
                                        qVar2.c += nc.k.b(e18) == 0 ? wVar7.s() : wVar7.v();
                                    }
                                    byte[] bArr = null;
                                    b f13 = aVar2.f(1936027235);
                                    if (f13 != null) {
                                        b(f13.c, 0, qVar2);
                                    }
                                    String str = pVar != null ? pVar.b : null;
                                    w wVar8 = null;
                                    w wVar9 = null;
                                    for (int i50 = 0; i50 < arrayList8.size(); i50++) {
                                        b bVar4 = (b) arrayList8.get(i50);
                                        w wVar10 = bVar4.c;
                                        int i51 = bVar4.b;
                                        if (i51 == 1935828848) {
                                            wVar10.C(12);
                                            if (wVar10.e() == 1936025959) {
                                                wVar8 = wVar10;
                                            }
                                        } else if (i51 == 1936158820) {
                                            wVar10.C(12);
                                            if (wVar10.e() == 1936025959) {
                                                wVar9 = wVar10;
                                            }
                                        }
                                    }
                                    if (wVar8 != null && wVar9 != null) {
                                        wVar8.C(8);
                                        int b10 = nc.k.b(wVar8.e());
                                        wVar8.D(4);
                                        if (b10 == 1) {
                                            wVar8.D(4);
                                        }
                                        if (wVar8.e() != 1) {
                                            throw t1.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        wVar9.C(8);
                                        int b11 = nc.k.b(wVar9.e());
                                        wVar9.D(4);
                                        if (b11 == 1) {
                                            if (wVar9.s() == 0) {
                                                throw t1.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (b11 >= 2) {
                                            wVar9.D(4);
                                        }
                                        if (wVar9.s() != 1) {
                                            throw t1.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        wVar9.D(1);
                                        int r10 = wVar9.r();
                                        int i52 = (r10 & 240) >> 4;
                                        int i53 = r10 & 15;
                                        boolean z21 = wVar9.r() == 1;
                                        if (z21) {
                                            int r11 = wVar9.r();
                                            byte[] bArr2 = new byte[16];
                                            wVar9.c(0, 16, bArr2);
                                            if (r11 == 0) {
                                                int r12 = wVar9.r();
                                                bArr = new byte[r12];
                                                wVar9.c(0, r12, bArr);
                                            }
                                            qVar2.k = true;
                                            qVar2.m = new p(z21, str, r11, bArr2, i52, i53, bArr);
                                        }
                                    }
                                    int size5 = arrayList8.size();
                                    for (int i54 = 0; i54 < size5; i54++) {
                                        b bVar5 = (b) arrayList8.get(i54);
                                        if (bVar5.b == 1970628964) {
                                            w wVar11 = bVar5.c;
                                            wVar11.C(8);
                                            byte[] bArr3 = this.g;
                                            wVar11.c(0, 16, bArr3);
                                            if (Arrays.equals(bArr3, H)) {
                                                b(wVar11, 16, qVar2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i10 = size3;
                        i11 = i32;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        i12 = i23;
                    }
                    i32 = i11 + 1;
                    size3 = i10;
                    arrayList5 = arrayList;
                    arrayList6 = arrayList2;
                    i23 = i12;
                }
                n3.c a10 = a(arrayList6);
                if (a10 != null) {
                    int size6 = sparseArray.size();
                    for (int i55 = 0; i55 < size6; i55++) {
                        h hVar3 = (h) sparseArray.valueAt(i55);
                        o oVar5 = hVar3.d.a;
                        f fVar7 = hVar3.b.a;
                        int i56 = d0.a;
                        p pVar2 = oVar5.k[fVar7.a];
                        n3.c a11 = a10.a(pVar2 != null ? pVar2.b : null);
                        s0 a12 = hVar3.d.a.f.a();
                        a12.r = a11;
                        hVar3.a.b(new t0(a12));
                    }
                }
                if (this.v != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i57 = 0; i57 < size7; i57++) {
                        h hVar4 = (h) sparseArray.valueAt(i57);
                        long j17 = this.v;
                        int i58 = hVar4.f;
                        while (true) {
                            q qVar3 = hVar4.b;
                            if (i58 < qVar3.e && qVar3.i[i58] <= j17) {
                                if (qVar3.j[i58]) {
                                    hVar4.i = i58;
                                }
                                i58++;
                            }
                        }
                    }
                    this.v = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((a) arrayDeque.peek()).e.add(aVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0129, code lost:
    
        if (r2.d.a.g != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012b, code lost:
    
        r33.z = r4 - 8;
        ((o3.h) r34).t(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0145, code lost:
    
        if ("audio/ac4".equals(r2.d.a.f.B) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0147, code lost:
    
        r33.A = r2.c(r33.z, 7);
        r4 = r33.z;
        r7 = r33.h;
        l3.b.c(r4, r7);
        r2.a.e(7, r7);
        r33.A += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x016a, code lost:
    
        r33.z += r33.A;
        r33.o = 4;
        r33.B = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0162, code lost:
    
        r33.A = r2.c(r33.z, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00de, code lost:
    
        r4 = r3.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0176, code lost:
    
        r4 = r2.d;
        r6 = r4.a;
        r7 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017e, code lost:
    
        if (r2.l != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0180, code lost:
    
        r13 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018d, code lost:
    
        if (r15 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x018f, code lost:
    
        r13 = r15.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0193, code lost:
    
        r4 = r6.j;
        r6 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0197, code lost:
    
        if (r4 == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0199, code lost:
    
        r9 = r33.e;
        r11 = r9.a;
        r11[0] = 0;
        r11[1] = 0;
        r11[r35] = 0;
        r8 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01af, code lost:
    
        if (r33.A >= r33.z) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b1, code lost:
    
        r5 = r33.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b6, code lost:
    
        if (r5 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b8, code lost:
    
        r30 = r12;
        ((o3.h) r34).c(r11, r4, r8, false);
        r9.C(0);
        r5 = r9.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c9, code lost:
    
        if (r5 < 1) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cb, code lost:
    
        r33.B = r5 - 1;
        r5 = r33.d;
        r5.C(0);
        r7.e(4, r5);
        r7.e(1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e0, code lost:
    
        if (r33.F.length <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e2, code lost:
    
        r5 = r6.B;
        r19 = r11[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ed, code lost:
    
        if (org.telegram.messenger.MediaController.VIDEO_MIME_TYPE.equals(r5) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01ef, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01f4, code lost:
    
        if ((r19 & 31) == 6) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x020a, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0210, code lost:
    
        r33.C = r5;
        r33.A += 5;
        r33.z += r35;
        r4 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0220, code lost:
    
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01fe, code lost:
    
        if ("video/hevc".equals(r5) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0208, code lost:
    
        if (((r19 & 126) >> 1) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x020f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f7, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x020c, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x022b, code lost:
    
        throw j3.t1.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x022c, code lost:
    
        r35 = r4;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0233, code lost:
    
        if (r33.C == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0235, code lost:
    
        r12 = r33.f;
        r12.z(r5);
        r19 = r8;
        r22 = r9;
        ((o3.h) r34).c(r12.a, 0, r33.B, false);
        r7.e(r33.B, r12);
        r4 = r33.B;
        r5 = f5.a.J(r12.c, r12.a);
        r12.C("video/hevc".equals(r6.B) ? 1 : 0);
        r12.B(r5);
        i7.g0.a(r13, r12, r33.F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0273, code lost:
    
        r33.A += r4;
        r33.B -= r4;
        r4 = r35;
        r8 = r19;
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x026a, code lost:
    
        r19 = r8;
        r22 = r9;
        r4 = r7.a(r34, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0284, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x029d, code lost:
    
        if (r2.l != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x029f, code lost:
    
        r11 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02b7, code lost:
    
        if (r2.a() == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02b9, code lost:
    
        r11 = r11 | org.telegram.tgnet.TLObject.FLAG_30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02bc, code lost:
    
        r25 = r11;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c2, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c4, code lost:
    
        r28 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cb, code lost:
    
        r23 = r13;
        r7.c(r23, r25, r33.z, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02dc, code lost:
    
        if (r30.isEmpty() != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02de, code lost:
    
        r1 = (w3.g) r30.removeFirst();
        r33.u -= r1.c;
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ef, code lost:
    
        if (r1.b == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02f1, code lost:
    
        r3 = r3 + r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02f3, code lost:
    
        if (r15 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f5, code lost:
    
        r3 = r15.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f9, code lost:
    
        r6 = r3;
        r3 = r33.E;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02fe, code lost:
    
        if (r12 >= r4) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0300, code lost:
    
        r3[r12].c(r6, 1, r1.c, r33.u, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0312, code lost:
    
        if (r2.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0314, code lost:
    
        r33.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0317, code lost:
    
        r33.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x031c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02c9, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ae, code lost:
    
        if (r3.j[r2.f] == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02b0, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02b2, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0287, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0289, code lost:
    
        r4 = r33.A;
        r5 = r33.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x028d, code lost:
    
        if (r4 >= r5) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x028f, code lost:
    
        r33.A += r7.a(r34, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0187, code lost:
    
        r13 = r3.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c9, code lost:
    
        r3 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cf, code lost:
    
        if (r33.o != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d3, code lost:
    
        if (r2.l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d5, code lost:
    
        r4 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e4, code lost:
    
        r33.z = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ea, code lost:
    
        if (r2.f >= r2.i) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ec, code lost:
    
        ((o3.h) r34).t(r4);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r4 = r3.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00fc, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fe, code lost:
    
        r4.D(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0101, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0105, code lost:
    
        if (r3.k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010b, code lost:
    
        if (r3.l[r1] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010d, code lost:
    
        r4.D(r4.w() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011a, code lost:
    
        if (r2.b() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011c, code lost:
    
        r33.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011e, code lost:
    
        r33.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0121, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(o3.l lVar, o3.n nVar) {
        String m10;
        String m11;
        long j10;
        long j11;
        long O;
        long s10;
        long v;
        long v10;
        char c3;
        loop0: while (true) {
            while (true) {
                int i10 = this.o;
                ArrayDeque arrayDeque = this.l;
                SparseArray sparseArray = this.c;
                if (i10 != 0) {
                    ArrayDeque arrayDeque2 = this.m;
                    c0 c0Var = this.i;
                    if (i10 != 1) {
                        long j12 = Long.MAX_VALUE;
                        if (i10 != 2) {
                            h hVar = this.y;
                            if (hVar != null) {
                                c3 = 2;
                                break loop0;
                            }
                            int size = sparseArray.size();
                            long j13 = Long.MAX_VALUE;
                            h hVar2 = null;
                            for (int i11 = 0; i11 < size; i11++) {
                                h hVar3 = (h) sparseArray.valueAt(i11);
                                boolean z10 = hVar3.l;
                                q qVar = hVar3.b;
                                if ((z10 || hVar3.f != hVar3.d.b) && (!z10 || hVar3.h != qVar.d)) {
                                    long j14 = !z10 ? hVar3.d.c[hVar3.f] : qVar.f[hVar3.h];
                                    if (j14 < j13) {
                                        hVar2 = hVar3;
                                        j13 = j14;
                                    }
                                }
                            }
                            c3 = 2;
                            if (hVar2 == null) {
                                int i12 = (int) (this.t - ((o3.h) lVar).d);
                                if (i12 < 0) {
                                    throw t1.a("Offset to end of mdat was negative.", null);
                                }
                                ((o3.h) lVar).t(i12);
                                this.o = 0;
                                this.r = 0;
                            } else {
                                int i13 = (int) ((!hVar2.l ? hVar2.d.c[hVar2.f] : hVar2.b.f[hVar2.h]) - ((o3.h) lVar).d);
                                if (i13 < 0) {
                                    f5.a.K("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i13 = 0;
                                }
                                ((o3.h) lVar).t(i13);
                                this.y = hVar2;
                                hVar = hVar2;
                            }
                        } else {
                            int size2 = sparseArray.size();
                            h hVar4 = null;
                            for (int i14 = 0; i14 < size2; i14++) {
                                q qVar2 = ((h) sparseArray.valueAt(i14)).b;
                                if (qVar2.o) {
                                    long j15 = qVar2.c;
                                    if (j15 < j12) {
                                        hVar4 = (h) sparseArray.valueAt(i14);
                                        j12 = j15;
                                    }
                                }
                            }
                            if (hVar4 == null) {
                                this.o = 3;
                            } else {
                                int i15 = (int) (j12 - ((o3.h) lVar).d);
                                if (i15 < 0) {
                                    throw t1.a("Offset to encryption data was negative.", null);
                                }
                                o3.h hVar5 = (o3.h) lVar;
                                hVar5.t(i15);
                                q qVar3 = hVar4.b;
                                w wVar = qVar3.n;
                                hVar5.c(wVar.a, 0, wVar.c, false);
                                wVar.C(0);
                                qVar3.o = false;
                            }
                        }
                    } else {
                        int i16 = ((int) this.q) - this.r;
                        w wVar2 = this.s;
                        if (wVar2 != null) {
                            ((o3.h) lVar).c(wVar2.a, 8, i16, false);
                            int i17 = this.p;
                            b bVar = new b(i17, wVar2);
                            long j16 = ((o3.h) lVar).d;
                            if (!arrayDeque.isEmpty()) {
                                ((a) arrayDeque.peek()).d.add(bVar);
                            } else if (i17 == 1936286840) {
                                wVar2.C(8);
                                int b10 = nc.k.b(wVar2.e());
                                wVar2.D(4);
                                long s11 = wVar2.s();
                                if (b10 == 0) {
                                    v = wVar2.s();
                                    v10 = wVar2.s();
                                } else {
                                    v = wVar2.v();
                                    v10 = wVar2.v();
                                }
                                long j17 = v10 + j16;
                                long j18 = v;
                                long O2 = d0.O(j18, 1000000L, s11);
                                wVar2.D(2);
                                int w10 = wVar2.w();
                                int[] iArr = new int[w10];
                                long[] jArr = new long[w10];
                                long[] jArr2 = new long[w10];
                                long[] jArr3 = new long[w10];
                                long j19 = O2;
                                long j20 = j18;
                                int i18 = 0;
                                while (i18 < w10) {
                                    int e10 = wVar2.e();
                                    if ((e10 & TLObject.FLAG_31) != 0) {
                                        throw t1.a("Unhandled indirect reference", null);
                                    }
                                    long s12 = wVar2.s();
                                    iArr[i18] = e10 & ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    jArr[i18] = j17;
                                    jArr3[i18] = j19;
                                    long j21 = j20 + s12;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int i19 = i18;
                                    j19 = d0.O(j21, 1000000L, s11);
                                    jArr4[i19] = j19 - jArr5[i19];
                                    wVar2.D(4);
                                    j17 += iArr[i19];
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    i18 = i19 + 1;
                                    O2 = O2;
                                    j20 = j21;
                                }
                                Pair create = Pair.create(Long.valueOf(O2), new o3.f(iArr, jArr, jArr2, jArr3));
                                this.x = ((Long) create.first).longValue();
                                this.D.D1((t) create.second);
                                this.G = true;
                            } else if (i17 == 1701671783 && this.E.length != 0) {
                                wVar2.C(8);
                                int b11 = nc.k.b(wVar2.e());
                                if (b11 == 0) {
                                    m10 = wVar2.m();
                                    m10.getClass();
                                    m11 = wVar2.m();
                                    m11.getClass();
                                    long s13 = wVar2.s();
                                    long O3 = d0.O(wVar2.s(), 1000000L, s13);
                                    long j22 = this.x;
                                    long j23 = j22 != -9223372036854775807L ? j22 + O3 : -9223372036854775807L;
                                    j10 = O3;
                                    j11 = j23;
                                    O = d0.O(wVar2.s(), 1000L, s13);
                                    s10 = wVar2.s();
                                } else if (b11 != 1) {
                                    com.google.android.recaptcha.internal.a.s(b11, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                                } else {
                                    long s14 = wVar2.s();
                                    j11 = d0.O(wVar2.v(), 1000000L, s14);
                                    long O4 = d0.O(wVar2.s(), 1000L, s14);
                                    long s15 = wVar2.s();
                                    m10 = wVar2.m();
                                    m10.getClass();
                                    m11 = wVar2.m();
                                    m11.getClass();
                                    O = O4;
                                    s10 = s15;
                                    j10 = -9223372036854775807L;
                                }
                                String str = m10;
                                String str2 = m11;
                                byte[] bArr = new byte[wVar2.a()];
                                wVar2.c(0, wVar2.a(), bArr);
                                w wVar3 = new w(this.j.E(new d4.a(str, str2, O, s10, bArr)));
                                int a2 = wVar3.a();
                                for (o3.w wVar4 : this.E) {
                                    wVar3.C(0);
                                    wVar4.e(a2, wVar3);
                                }
                                if (j11 == -9223372036854775807L) {
                                    arrayDeque2.addLast(new g(a2, j10, true));
                                    this.u += a2;
                                } else if (arrayDeque2.isEmpty()) {
                                    if (c0Var != null) {
                                        j11 = c0Var.a(j11);
                                    }
                                    long j24 = j11;
                                    for (o3.w wVar5 : this.E) {
                                        wVar5.c(j24, 1, a2, 0, null);
                                    }
                                } else {
                                    arrayDeque2.addLast(new g(a2, j11, false));
                                    this.u += a2;
                                }
                            }
                        } else {
                            ((o3.h) lVar).t(i16);
                        }
                        c(((o3.h) lVar).d);
                    }
                } else {
                    int i20 = this.r;
                    w wVar6 = this.k;
                    if (i20 == 0) {
                        if (!((o3.h) lVar).c(wVar6.a, 0, 8, true)) {
                            return -1;
                        }
                        this.r = 8;
                        wVar6.C(0);
                        this.q = wVar6.s();
                        this.p = wVar6.e();
                    }
                    long j25 = this.q;
                    if (j25 == 1) {
                        ((o3.h) lVar).c(wVar6.a, 8, 8, false);
                        this.r += 8;
                        this.q = wVar6.v();
                    } else if (j25 == 0) {
                        long j26 = ((o3.h) lVar).c;
                        if (j26 == -1 && !arrayDeque.isEmpty()) {
                            j26 = ((a) arrayDeque.peek()).c;
                        }
                        if (j26 != -1) {
                            this.q = (j26 - ((o3.h) lVar).d) + this.r;
                        }
                    }
                    long j27 = this.q;
                    int i21 = this.r;
                    if (j27 < i21) {
                        throw t1.c("Atom size less than header length (unsupported).");
                    }
                    long j28 = ((o3.h) lVar).d - i21;
                    int i22 = this.p;
                    if ((i22 == 1836019558 || i22 == 1835295092) && !this.G) {
                        this.D.D1(new o3.o(this.w, j28));
                        this.G = true;
                    }
                    if (this.p == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i23 = 0; i23 < size3; i23++) {
                            q qVar4 = ((h) sparseArray.valueAt(i23)).b;
                            qVar4.getClass();
                            qVar4.c = j28;
                            qVar4.b = j28;
                        }
                    }
                    int i24 = this.p;
                    if (i24 == 1835295092) {
                        this.y = null;
                        this.t = j28 + this.q;
                        this.o = 2;
                    } else if (i24 == 1836019574 || i24 == 1953653099 || i24 == 1835297121 || i24 == 1835626086 || i24 == 1937007212 || i24 == 1836019558 || i24 == 1953653094 || i24 == 1836475768 || i24 == 1701082227) {
                        long j29 = (((o3.h) lVar).d + this.q) - 8;
                        arrayDeque.push(new a(i24, j29));
                        if (this.q == this.r) {
                            c(j29);
                        } else {
                            this.o = 0;
                            this.r = 0;
                        }
                    } else if (i24 == 1751411826 || i24 == 1835296868 || i24 == 1836476516 || i24 == 1936286840 || i24 == 1937011556 || i24 == 1937011827 || i24 == 1668576371 || i24 == 1937011555 || i24 == 1937011578 || i24 == 1937013298 || i24 == 1937007471 || i24 == 1668232756 || i24 == 1937011571 || i24 == 1952867444 || i24 == 1952868452 || i24 == 1953196132 || i24 == 1953654136 || i24 == 1953658222 || i24 == 1886614376 || i24 == 1935763834 || i24 == 1935763823 || i24 == 1936027235 || i24 == 1970628964 || i24 == 1935828848 || i24 == 1936158820 || i24 == 1701606260 || i24 == 1835362404 || i24 == 1701671783) {
                        if (this.r != 8) {
                            throw t1.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.q > 2147483647L) {
                            throw t1.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        w wVar7 = new w((int) this.q);
                        System.arraycopy(wVar6.a, 0, wVar7.a, 0, 8);
                        this.s = wVar7;
                        this.o = 1;
                    } else {
                        if (this.q > 2147483647L) {
                            throw t1.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.s = null;
                        this.o = 1;
                    }
                }
            }
        }
    }

    @Override // o3.k
    public final boolean e(o3.l lVar) {
        return j.i(lVar, true, false);
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h) sparseArray.valueAt(i10)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = j11;
        this.l.clear();
        this.o = 0;
        this.r = 0;
    }

    @Override // o3.k
    public final void i(o3.m mVar) {
        int i10;
        this.D = mVar;
        int i11 = 0;
        this.o = 0;
        this.r = 0;
        o3.w[] wVarArr = new o3.w[2];
        this.E = wVarArr;
        o3.w wVar = this.n;
        if (wVar != null) {
            wVarArr[0] = wVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.a & 4) != 0) {
            wVarArr[i10] = mVar.Z1(100, 5);
            i12 = 101;
            i10++;
        }
        o3.w[] wVarArr2 = (o3.w[]) d0.J(i10, this.E);
        this.E = wVarArr2;
        for (o3.w wVar2 : wVarArr2) {
            wVar2.b(I);
        }
        List list = this.b;
        this.F = new o3.w[list.size()];
        while (i11 < this.F.length) {
            o3.w Z1 = this.D.Z1(i12, 3);
            Z1.b((t0) list.get(i11));
            this.F[i11] = Z1;
            i11++;
            i12++;
        }
    }

    @Override // o3.k
    public final void release() {
    }
}
