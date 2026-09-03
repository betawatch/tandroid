package z3;

import android.util.Pair;
import android.util.SparseArray;
import b4.e0;
import h5.c0;
import h5.d0;
import h5.w;
import j$.util.DesugarCollections;
import j3.m0;
import j3.n0;
import j3.r1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jb;
import r3.s;
import r3.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i implements r3.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final n0 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int a;
    public final List b;
    public final byte[] g;
    public final w h;
    public final c0 i;
    public final v n;
    public int o;
    public int p;
    public long q;
    public int r;
    public w s;
    public long t;
    public int u;
    public h y;
    public int z;
    public final f7.b j = new f7.b(3, (byte) 0);
    public final w k = new w(16);
    public final w d = new w(h5.a.d);
    public final w e = new w(5);
    public final w f = new w();
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();
    public final SparseArray c = new SparseArray();
    public long w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long x = -9223372036854775807L;
    public r3.m D = r3.m.A;
    public v[] E = new v[0];
    public v[] F = new v[0];

    static {
        m0 m0Var = new m0();
        m0Var.o = "application/x-emsg";
        I = new n0(m0Var);
    }

    public i(int i10, c0 c0Var, List list, r4.n nVar) {
        this.a = i10;
        this.i = c0Var;
        this.b = DesugarCollections.unmodifiableList(list);
        this.n = nVar;
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new w(bArr);
    }

    public static o3.g a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            if (bVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.c.a;
                e0 e6 = j.e(bArr);
                UUID uuid = e6 == null ? null : (UUID) e6.c;
                if (uuid == null) {
                    h5.a.K("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new o3.f(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new o3.g(null, false, (o3.f[]) arrayList.toArray(new o3.f[0]));
    }

    public static void b(w wVar, int i10, q qVar) {
        wVar.F(i10 + 8);
        int g10 = wVar.g();
        if ((g10 & 1) != 0) {
            throw r1.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (g10 & 2) != 0;
        int x10 = wVar.x();
        if (x10 == 0) {
            Arrays.fill(qVar.l, 0, qVar.e, false);
            return;
        }
        int i11 = qVar.e;
        w wVar2 = qVar.n;
        if (x10 != i11) {
            StringBuilder m9 = l.d.m(x10, "Senc sample count ", " is different from fragment sample count");
            m9.append(qVar.e);
            throw r1.a(m9.toString(), null);
        }
        Arrays.fill(qVar.l, 0, x10, z4);
        wVar2.C(wVar.a());
        qVar.k = true;
        qVar.o = true;
        wVar.e(0, wVar2.c, wVar2.a);
        wVar2.F(0);
        qVar.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:389:0x072f, code lost:
    
        r50.o = 0;
        r50.r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0734, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0649  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j10) {
        f fVar;
        f fVar2;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        int i12;
        int i13;
        int size;
        int i14;
        int i15;
        boolean z4;
        int i16;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i17;
        int i18;
        int i19;
        f fVar3;
        int i20;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((a) arrayDeque.peek()).c != j10) {
                break;
            }
            a aVar = (a) arrayDeque.pop();
            int i21 = aVar.b;
            ArrayList arrayList6 = aVar.e;
            ArrayList arrayList7 = aVar.d;
            int i22 = this.a;
            int i23 = 12;
            SparseArray sparseArray = this.c;
            if (i21 == 1836019574) {
                o3.g a2 = a(arrayList7);
                a i24 = aVar.i(1836475768);
                i24.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList8 = i24.d;
                int size2 = arrayList8.size();
                int i25 = 0;
                long j11 = -9223372036854775807L;
                while (i25 < size2) {
                    b bVar = (b) arrayList8.get(i25);
                    int i26 = bVar.b;
                    w wVar = bVar.c;
                    if (i26 == 1953654136) {
                        wVar.F(i23);
                        arrayList = arrayList8;
                        Pair create = Pair.create(Integer.valueOf(wVar.g()), new f(wVar.g() - 1, wVar.g(), wVar.g(), wVar.g()));
                        sparseArray2.put(((Integer) create.first).intValue(), (f) create.second);
                    } else {
                        arrayList = arrayList8;
                        if (i26 == 1835362404) {
                            wVar.F(8);
                            j11 = n3.a.f(wVar.g()) == 0 ? wVar.v() : wVar.y();
                        }
                    }
                    i25++;
                    arrayList8 = arrayList;
                    i23 = 12;
                }
                ArrayList f10 = e.f(aVar, new r3.p(), j11, a2, (i22 & 16) != 0, false, new sf.h(this, 22));
                int size3 = f10.size();
                if (sparseArray.size() == 0) {
                    for (int i27 = 0; i27 < size3; i27++) {
                        r rVar = (r) f10.get(i27);
                        o oVar = rVar.a;
                        r3.m mVar = this.D;
                        int i28 = oVar.b;
                        int i29 = oVar.a;
                        v i210 = mVar.i2(i27, i28);
                        if (sparseArray2.size() == 1) {
                            fVar = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar = (f) sparseArray2.get(i29);
                            fVar.getClass();
                        }
                        sparseArray.put(i29, new h(i210, rVar, fVar));
                        this.w = Math.max(this.w, oVar.e);
                    }
                    this.D.i1();
                } else {
                    h5.a.i(sparseArray.size() == size3);
                    for (int i30 = 0; i30 < size3; i30++) {
                        r rVar2 = (r) f10.get(i30);
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
            } else if (i21 == 1836019558) {
                int size4 = arrayList6.size();
                int i32 = 0;
                while (i32 < size4) {
                    a aVar2 = (a) arrayList6.get(i32);
                    if (aVar2.b == 1953653094) {
                        b j12 = aVar2.j(1952868452);
                        ArrayList arrayList9 = aVar2.d;
                        j12.getClass();
                        w wVar2 = j12.c;
                        wVar2.F(8);
                        int g10 = wVar2.g();
                        h hVar2 = (h) sparseArray.get(wVar2.g());
                        if (hVar2 == null) {
                            i10 = size4;
                            hVar2 = null;
                        } else {
                            q qVar = hVar2.b;
                            if ((g10 & 1) != 0) {
                                long y10 = wVar2.y();
                                qVar.b = y10;
                                qVar.c = y10;
                            }
                            f fVar4 = hVar2.e;
                            int g11 = (g10 & 2) != 0 ? wVar2.g() - 1 : fVar4.a;
                            int g12 = (g10 & 8) != 0 ? wVar2.g() : fVar4.b;
                            if ((g10 & 16) != 0) {
                                i10 = size4;
                                i12 = wVar2.g();
                            } else {
                                i10 = size4;
                                i12 = fVar4.c;
                            }
                            qVar.a = new f(g11, g12, i12, (g10 & 32) != 0 ? wVar2.g() : fVar4.d);
                        }
                        if (hVar2 == null) {
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            i11 = i32;
                        } else {
                            q qVar2 = hVar2.b;
                            long j13 = qVar2.p;
                            boolean z10 = qVar2.q;
                            hVar2.d();
                            hVar2.l = true;
                            b j14 = aVar2.j(1952867444);
                            if (j14 == null || (i22 & 2) != 0) {
                                qVar2.p = j13;
                                qVar2.q = z10;
                            } else {
                                w wVar3 = j14.c;
                                wVar3.F(8);
                                qVar2.p = n3.a.f(wVar3.g()) == 1 ? wVar3.y() : wVar3.v();
                                qVar2.q = true;
                            }
                            int size5 = arrayList9.size();
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            while (true) {
                                i13 = 1953658222;
                                if (i33 >= size5) {
                                    break;
                                }
                                b bVar2 = (b) arrayList9.get(i33);
                                int i36 = i33;
                                if (bVar2.b == 1953658222) {
                                    w wVar4 = bVar2.c;
                                    wVar4.F(12);
                                    int x10 = wVar4.x();
                                    if (x10 > 0) {
                                        i35 += x10;
                                        i34++;
                                    }
                                }
                                i33 = i36 + 1;
                            }
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
                                long j15 = 0;
                                if (i38 < size5) {
                                    b bVar3 = (b) arrayList9.get(i38);
                                    int i41 = size5;
                                    if (bVar3.b == i13) {
                                        int i42 = i39 + 1;
                                        w wVar5 = bVar3.c;
                                        wVar5.F(8);
                                        int g13 = wVar5.g();
                                        o oVar3 = hVar2.d.a;
                                        i16 = i38;
                                        f fVar5 = qVar2.a;
                                        int i43 = d0.a;
                                        arrayList4 = arrayList6;
                                        qVar2.g[i39] = wVar5.x();
                                        long[] jArr = qVar2.f;
                                        arrayList5 = arrayList7;
                                        long j16 = qVar2.b;
                                        jArr[i39] = j16;
                                        if ((g13 & 1) != 0) {
                                            jArr[i39] = j16 + wVar5.g();
                                        }
                                        boolean z11 = (g13 & 4) != 0;
                                        int i44 = fVar5.d;
                                        if (z11) {
                                            i44 = wVar5.g();
                                        }
                                        boolean z12 = z11;
                                        boolean z13 = (g13 & 256) != 0;
                                        boolean z14 = (g13 & 512) != 0;
                                        boolean z15 = (g13 & 1024) != 0;
                                        boolean z16 = (g13 & 2048) != 0;
                                        boolean z17 = z15;
                                        long[] jArr2 = oVar3.h;
                                        int i45 = i44;
                                        long[] jArr3 = oVar3.i;
                                        if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                            long j17 = jArr2[0];
                                            if (j17 == 0 || d0.N(j17 + jArr3[0], 1000000L, oVar3.d) >= oVar3.e) {
                                                j15 = jArr3[0];
                                            }
                                        }
                                        int[] iArr = qVar2.h;
                                        long[] jArr4 = qVar2.i;
                                        boolean[] zArr = qVar2.j;
                                        boolean z18 = oVar3.b == 2 && (i22 & 1) != 0;
                                        int i46 = qVar2.g[i39] + i40;
                                        i17 = i32;
                                        long j18 = oVar3.c;
                                        long j19 = qVar2.p;
                                        while (i40 < i46) {
                                            int g14 = z13 ? wVar5.g() : fVar5.b;
                                            boolean z19 = z18;
                                            if (g14 < 0) {
                                                throw r1.a("Unexpected negative value: " + g14, null);
                                            }
                                            if (z14) {
                                                i18 = i46;
                                                i19 = wVar5.g();
                                            } else {
                                                i18 = i46;
                                                i19 = fVar5.c;
                                            }
                                            if (i19 < 0) {
                                                throw r1.a("Unexpected negative value: " + i19, null);
                                            }
                                            int g15 = z17 ? wVar5.g() : (i40 == 0 && z12) ? i45 : fVar5.d;
                                            if (z16) {
                                                fVar3 = fVar5;
                                                i20 = wVar5.g();
                                            } else {
                                                fVar3 = fVar5;
                                                i20 = 0;
                                            }
                                            int i47 = g15;
                                            long N = d0.N((i20 + j19) - j15, 1000000L, j18);
                                            jArr4[i40] = N;
                                            if (!qVar2.q) {
                                                jArr4[i40] = N + hVar2.d.h;
                                            }
                                            iArr[i40] = i19;
                                            zArr[i40] = ((i47 >> 16) & 1) == 0 && (!z19 || i40 == 0);
                                            j19 += g14;
                                            i40++;
                                            z18 = z19;
                                            i46 = i18;
                                            fVar5 = fVar3;
                                        }
                                        qVar2.p = j19;
                                        i39 = i42;
                                        i40 = i46;
                                    } else {
                                        i16 = i38;
                                        arrayList4 = arrayList6;
                                        arrayList5 = arrayList7;
                                        i17 = i32;
                                    }
                                    i38 = i16 + 1;
                                    size5 = i41;
                                    arrayList6 = arrayList4;
                                    arrayList7 = arrayList5;
                                    i32 = i17;
                                    i13 = 1953658222;
                                } else {
                                    arrayList2 = arrayList6;
                                    arrayList3 = arrayList7;
                                    i11 = i32;
                                    o oVar4 = hVar2.d.a;
                                    f fVar6 = qVar2.a;
                                    fVar6.getClass();
                                    p pVar = oVar4.k[fVar6.a];
                                    b j20 = aVar2.j(1935763834);
                                    if (j20 != null) {
                                        pVar.getClass();
                                        w wVar6 = j20.c;
                                        int i48 = pVar.d;
                                        wVar6.F(8);
                                        if ((wVar6.g() & 1) == 1) {
                                            wVar6.G(8);
                                        }
                                        int u10 = wVar6.u();
                                        int x11 = wVar6.x();
                                        if (x11 > qVar2.e) {
                                            StringBuilder m9 = l.d.m(x11, "Saiz sample count ", " is greater than fragment sample count");
                                            m9.append(qVar2.e);
                                            throw r1.a(m9.toString(), null);
                                        }
                                        if (u10 == 0) {
                                            boolean[] zArr2 = qVar2.l;
                                            i15 = 0;
                                            for (int i49 = 0; i49 < x11; i49++) {
                                                int u11 = wVar6.u();
                                                i15 += u11;
                                                zArr2[i49] = u11 > i48;
                                            }
                                            z4 = false;
                                        } else {
                                            boolean z20 = u10 > i48;
                                            i15 = u10 * x11;
                                            z4 = false;
                                            Arrays.fill(qVar2.l, 0, x11, z20);
                                        }
                                        Arrays.fill(qVar2.l, x11, qVar2.e, z4);
                                        if (i15 > 0) {
                                            qVar2.n.C(i15);
                                            qVar2.k = true;
                                            qVar2.o = true;
                                        }
                                    }
                                    b j21 = aVar2.j(1935763823);
                                    if (j21 != null) {
                                        w wVar7 = j21.c;
                                        wVar7.F(8);
                                        int g16 = wVar7.g();
                                        if ((g16 & 1) == 1) {
                                            wVar7.G(8);
                                        }
                                        int x12 = wVar7.x();
                                        if (x12 != 1) {
                                            throw r1.a("Unexpected saio entry count: " + x12, null);
                                        }
                                        qVar2.c += n3.a.f(g16) == 0 ? wVar7.v() : wVar7.y();
                                    }
                                    byte[] bArr = null;
                                    b j22 = aVar2.j(1936027235);
                                    if (j22 != null) {
                                        b(j22.c, 0, qVar2);
                                    }
                                    String str = pVar != null ? pVar.b : null;
                                    w wVar8 = null;
                                    w wVar9 = null;
                                    for (int i50 = 0; i50 < arrayList9.size(); i50++) {
                                        b bVar4 = (b) arrayList9.get(i50);
                                        w wVar10 = bVar4.c;
                                        int i51 = bVar4.b;
                                        if (i51 == 1935828848) {
                                            wVar10.F(12);
                                            if (wVar10.g() == 1936025959) {
                                                wVar9 = wVar10;
                                            }
                                        } else if (i51 == 1936158820) {
                                            wVar10.F(12);
                                            if (wVar10.g() == 1936025959) {
                                                wVar8 = wVar10;
                                            }
                                        }
                                    }
                                    if (wVar9 != null && wVar8 != null) {
                                        wVar9.F(8);
                                        int f11 = n3.a.f(wVar9.g());
                                        wVar9.G(4);
                                        if (f11 == 1) {
                                            wVar9.G(4);
                                        }
                                        if (wVar9.g() != 1) {
                                            throw r1.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        wVar8.F(8);
                                        int f12 = n3.a.f(wVar8.g());
                                        wVar8.G(4);
                                        if (f12 == 1) {
                                            if (wVar8.v() == 0) {
                                                throw r1.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (f12 >= 2) {
                                            wVar8.G(4);
                                        }
                                        if (wVar8.v() != 1) {
                                            throw r1.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        wVar8.G(1);
                                        int u12 = wVar8.u();
                                        int i52 = (u12 & 240) >> 4;
                                        int i53 = u12 & 15;
                                        boolean z21 = wVar8.u() == 1;
                                        if (z21) {
                                            int u13 = wVar8.u();
                                            byte[] bArr2 = new byte[16];
                                            wVar8.e(0, 16, bArr2);
                                            if (u13 == 0) {
                                                int u14 = wVar8.u();
                                                bArr = new byte[u14];
                                                wVar8.e(0, u14, bArr);
                                            }
                                            qVar2.k = true;
                                            qVar2.m = new p(z21, str, u13, bArr2, i52, i53, bArr);
                                            size = arrayList9.size();
                                            for (i14 = 0; i14 < size; i14++) {
                                                b bVar5 = (b) arrayList9.get(i14);
                                                if (bVar5.b == 1970628964) {
                                                    w wVar11 = bVar5.c;
                                                    wVar11.F(8);
                                                    byte[] bArr3 = this.g;
                                                    wVar11.e(0, 16, bArr3);
                                                    if (Arrays.equals(bArr3, H)) {
                                                        b(wVar11, 16, qVar2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList9.size();
                                    while (i14 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i10 = size4;
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i11 = i32;
                    }
                    i32 = i11 + 1;
                    size4 = i10;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                }
                o3.g a10 = a(arrayList7);
                if (a10 != null) {
                    int size6 = sparseArray.size();
                    for (int i54 = 0; i54 < size6; i54++) {
                        h hVar3 = (h) sparseArray.valueAt(i54);
                        o oVar5 = hVar3.d.a;
                        f fVar7 = hVar3.b.a;
                        int i55 = d0.a;
                        p pVar2 = oVar5.k[fVar7.a];
                        o3.g a11 = a10.a(pVar2 != null ? pVar2.b : null);
                        m0 a12 = hVar3.d.a.f.a();
                        a12.r = a11;
                        hVar3.a.b(new n0(a12));
                    }
                }
                if (this.v != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i56 = 0; i56 < size7; i56++) {
                        h hVar4 = (h) sparseArray.valueAt(i56);
                        long j23 = this.v;
                        int i57 = hVar4.f;
                        while (true) {
                            q qVar3 = hVar4.b;
                            if (i57 < qVar3.e && qVar3.i[i57] <= j23) {
                                if (qVar3.j[i57]) {
                                    hVar4.i = i57;
                                }
                                i57++;
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

    @Override // r3.k
    public final void d(long j10, long j11) {
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

    @Override // r3.k
    public final void e(r3.m mVar) {
        int i10;
        this.D = mVar;
        int i11 = 0;
        this.o = 0;
        this.r = 0;
        v[] vVarArr = new v[2];
        this.E = vVarArr;
        v vVar = this.n;
        if (vVar != null) {
            vVarArr[0] = vVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.a & 4) != 0) {
            vVarArr[i10] = mVar.i2(100, 5);
            i12 = 101;
            i10++;
        }
        v[] vVarArr2 = (v[]) d0.I(i10, this.E);
        this.E = vVarArr2;
        for (v vVar2 : vVarArr2) {
            vVar2.b(I);
        }
        List list = this.b;
        this.F = new v[list.size()];
        while (i11 < this.F.length) {
            v i22 = this.D.i2(i12, 3);
            i22.b((n0) list.get(i11));
            this.F[i11] = i22;
            i11++;
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0129, code lost:
    
        if (r2.d.a.g != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012b, code lost:
    
        r33.z = r4 - 8;
        ((r3.h) r34).s(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0145, code lost:
    
        if ("audio/ac4".equals(r2.d.a.f.C) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0147, code lost:
    
        r33.A = r2.c(r33.z, 7);
        r4 = r33.z;
        r7 = r33.h;
        l3.a.c(r4, r7);
        r2.a.d(7, r7);
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
    
        if (r33.A >= r33.z) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b1, code lost:
    
        r5 = r33.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b6, code lost:
    
        if (r5 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b8, code lost:
    
        r30 = r12;
        ((r3.h) r34).c(r11, r4, r8, false);
        r9.F(0);
        r5 = r9.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c9, code lost:
    
        if (r5 < 1) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cb, code lost:
    
        r33.B = r5 - 1;
        r5 = r33.d;
        r5.F(0);
        r7.d(4, r5);
        r7.d(1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e0, code lost:
    
        if (r33.F.length <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e2, code lost:
    
        r5 = r6.C;
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
    
        throw j3.r1.a("Invalid NAL length", null);
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
        r12.C(r5);
        r19 = r8;
        r22 = r9;
        ((r3.h) r34).c(r12.a, 0, r33.B, false);
        r7.d(r33.B, r12);
        r4 = r33.B;
        r5 = h5.a.J(r12.c, r12.a);
        r12.F("video/hevc".equals(r6.C) ? 1 : 0);
        r12.E(r5);
        k7.t6.a(r13, r12, r33.F);
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
        r4 = r7.e(r34, r5, false);
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
    
        if (r30.isEmpty() != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02de, code lost:
    
        r1 = (z3.g) r30.removeFirst();
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
    
        if (r12 >= r4) goto L437;
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
    
        if (r4 >= r5) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x028f, code lost:
    
        r33.A += r7.e(r34, r5 - r4, false);
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
    
        ((r3.h) r34).s(r4);
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
    
        r4.G(r1);
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
    
        r4.G(r4.z() * 6);
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
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(r3.l lVar, jb jbVar) {
        String p10;
        String p11;
        long j10;
        long j11;
        long N;
        long v;
        long y10;
        long y11;
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
                                boolean z4 = hVar3.l;
                                q qVar = hVar3.b;
                                if ((z4 || hVar3.f != hVar3.d.b) && (!z4 || hVar3.h != qVar.d)) {
                                    long j14 = !z4 ? hVar3.d.c[hVar3.f] : qVar.f[hVar3.h];
                                    if (j14 < j13) {
                                        hVar2 = hVar3;
                                        j13 = j14;
                                    }
                                }
                            }
                            c3 = 2;
                            if (hVar2 == null) {
                                int i12 = (int) (this.t - ((r3.h) lVar).d);
                                if (i12 < 0) {
                                    throw r1.a("Offset to end of mdat was negative.", null);
                                }
                                ((r3.h) lVar).s(i12);
                                this.o = 0;
                                this.r = 0;
                            } else {
                                int i13 = (int) ((!hVar2.l ? hVar2.d.c[hVar2.f] : hVar2.b.f[hVar2.h]) - ((r3.h) lVar).d);
                                if (i13 < 0) {
                                    h5.a.K("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i13 = 0;
                                }
                                ((r3.h) lVar).s(i13);
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
                                int i15 = (int) (j12 - ((r3.h) lVar).d);
                                if (i15 < 0) {
                                    throw r1.a("Offset to encryption data was negative.", null);
                                }
                                r3.h hVar5 = (r3.h) lVar;
                                hVar5.s(i15);
                                q qVar3 = hVar4.b;
                                w wVar = qVar3.n;
                                hVar5.c(wVar.a, 0, wVar.c, false);
                                wVar.F(0);
                                qVar3.o = false;
                            }
                        }
                    } else {
                        int i16 = ((int) this.q) - this.r;
                        w wVar2 = this.s;
                        if (wVar2 != null) {
                            ((r3.h) lVar).c(wVar2.a, 8, i16, false);
                            int i17 = this.p;
                            b bVar = new b(i17, wVar2);
                            long j16 = ((r3.h) lVar).d;
                            if (!arrayDeque.isEmpty()) {
                                ((a) arrayDeque.peek()).d.add(bVar);
                            } else if (i17 == 1936286840) {
                                wVar2.F(8);
                                int f10 = n3.a.f(wVar2.g());
                                wVar2.G(4);
                                long v10 = wVar2.v();
                                if (f10 == 0) {
                                    y10 = wVar2.v();
                                    y11 = wVar2.v();
                                } else {
                                    y10 = wVar2.y();
                                    y11 = wVar2.y();
                                }
                                long j17 = y11 + j16;
                                long j18 = y10;
                                long N2 = d0.N(j18, 1000000L, v10);
                                wVar2.G(2);
                                int z10 = wVar2.z();
                                int[] iArr = new int[z10];
                                long[] jArr = new long[z10];
                                long[] jArr2 = new long[z10];
                                long[] jArr3 = new long[z10];
                                long j19 = N2;
                                long j20 = j18;
                                int i18 = 0;
                                while (i18 < z10) {
                                    int g10 = wVar2.g();
                                    if ((g10 & TLObject.FLAG_31) != 0) {
                                        throw r1.a("Unhandled indirect reference", null);
                                    }
                                    long v11 = wVar2.v();
                                    iArr[i18] = g10 & ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    jArr[i18] = j17;
                                    jArr3[i18] = j19;
                                    long j21 = j20 + v11;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int i19 = i18;
                                    j19 = d0.N(j21, 1000000L, v10);
                                    jArr4[i19] = j19 - jArr5[i19];
                                    wVar2.G(4);
                                    j17 += iArr[i19];
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    i18 = i19 + 1;
                                    N2 = N2;
                                    j20 = j21;
                                }
                                Pair create = Pair.create(Long.valueOf(N2), new r3.f(iArr, jArr, jArr2, jArr3));
                                this.x = ((Long) create.first).longValue();
                                this.D.m2((s) create.second);
                                this.G = true;
                            } else if (i17 == 1701671783 && this.E.length != 0) {
                                wVar2.F(8);
                                int f11 = n3.a.f(wVar2.g());
                                if (f11 == 0) {
                                    p10 = wVar2.p();
                                    p10.getClass();
                                    p11 = wVar2.p();
                                    p11.getClass();
                                    long v12 = wVar2.v();
                                    long N3 = d0.N(wVar2.v(), 1000000L, v12);
                                    long j22 = this.x;
                                    long j23 = j22 != -9223372036854775807L ? j22 + N3 : -9223372036854775807L;
                                    j10 = N3;
                                    j11 = j23;
                                    N = d0.N(wVar2.v(), 1000L, v12);
                                    v = wVar2.v();
                                } else if (f11 != 1) {
                                    e2.c.q(f11, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                                } else {
                                    long v13 = wVar2.v();
                                    j11 = d0.N(wVar2.y(), 1000000L, v13);
                                    long N4 = d0.N(wVar2.v(), 1000L, v13);
                                    long v14 = wVar2.v();
                                    p10 = wVar2.p();
                                    p10.getClass();
                                    p11 = wVar2.p();
                                    p11.getClass();
                                    N = N4;
                                    v = v14;
                                    j10 = -9223372036854775807L;
                                }
                                String str = p10;
                                String str2 = p11;
                                byte[] bArr = new byte[wVar2.a()];
                                wVar2.e(0, wVar2.a(), bArr);
                                w wVar3 = new w(this.j.q(new g4.a(str, str2, N, v, bArr)));
                                int a2 = wVar3.a();
                                for (v vVar : this.E) {
                                    wVar3.F(0);
                                    vVar.d(a2, wVar3);
                                }
                                if (j11 == -9223372036854775807L) {
                                    arrayDeque2.addLast(new g(a2, j10, true));
                                    this.u += a2;
                                } else if (!arrayDeque2.isEmpty()) {
                                    arrayDeque2.addLast(new g(a2, j11, false));
                                    this.u += a2;
                                } else if (c0Var == null || c0Var.e()) {
                                    if (c0Var != null) {
                                        j11 = c0Var.a(j11);
                                    }
                                    long j24 = j11;
                                    for (v vVar2 : this.E) {
                                        vVar2.c(j24, 1, a2, 0, null);
                                    }
                                } else {
                                    arrayDeque2.addLast(new g(a2, j11, false));
                                    this.u += a2;
                                }
                            }
                        } else {
                            ((r3.h) lVar).s(i16);
                        }
                        c(((r3.h) lVar).d);
                    }
                } else {
                    int i20 = this.r;
                    w wVar4 = this.k;
                    if (i20 == 0) {
                        if (!((r3.h) lVar).c(wVar4.a, 0, 8, true)) {
                            return -1;
                        }
                        this.r = 8;
                        wVar4.F(0);
                        this.q = wVar4.v();
                        this.p = wVar4.g();
                    }
                    long j25 = this.q;
                    if (j25 == 1) {
                        ((r3.h) lVar).c(wVar4.a, 8, 8, false);
                        this.r += 8;
                        this.q = wVar4.y();
                    } else if (j25 == 0) {
                        long j26 = ((r3.h) lVar).c;
                        if (j26 == -1 && !arrayDeque.isEmpty()) {
                            j26 = ((a) arrayDeque.peek()).c;
                        }
                        if (j26 != -1) {
                            this.q = (j26 - ((r3.h) lVar).d) + this.r;
                        }
                    }
                    long j27 = this.q;
                    int i21 = this.r;
                    if (j27 < i21) {
                        throw r1.c("Atom size less than header length (unsupported).");
                    }
                    long j28 = ((r3.h) lVar).d - i21;
                    int i22 = this.p;
                    if ((i22 == 1836019558 || i22 == 1835295092) && !this.G) {
                        this.D.m2(new r3.n(this.w, j28));
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
                        long j29 = (((r3.h) lVar).d + this.q) - 8;
                        arrayDeque.push(new a(i24, j29));
                        if (this.q == this.r) {
                            c(j29);
                        } else {
                            this.o = 0;
                            this.r = 0;
                        }
                    } else if (i24 == 1751411826 || i24 == 1835296868 || i24 == 1836476516 || i24 == 1936286840 || i24 == 1937011556 || i24 == 1937011827 || i24 == 1668576371 || i24 == 1937011555 || i24 == 1937011578 || i24 == 1937013298 || i24 == 1937007471 || i24 == 1668232756 || i24 == 1937011571 || i24 == 1952867444 || i24 == 1952868452 || i24 == 1953196132 || i24 == 1953654136 || i24 == 1953658222 || i24 == 1886614376 || i24 == 1935763834 || i24 == 1935763823 || i24 == 1936027235 || i24 == 1970628964 || i24 == 1935828848 || i24 == 1936158820 || i24 == 1701606260 || i24 == 1835362404 || i24 == 1701671783) {
                        if (this.r != 8) {
                            throw r1.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.q > 2147483647L) {
                            throw r1.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        w wVar5 = new w((int) this.q);
                        System.arraycopy(wVar4.a, 0, wVar5.a, 0, 8);
                        this.s = wVar5;
                        this.o = 1;
                    } else {
                        if (this.q > 2147483647L) {
                            throw r1.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.s = null;
                        this.o = 1;
                    }
                }
            }
        }
    }

    @Override // r3.k
    public final boolean i(r3.l lVar) {
        return j.j(lVar, true, false);
    }

    @Override // r3.k
    public final void release() {
    }
}
