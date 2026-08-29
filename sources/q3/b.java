package q3;

import f5.d0;
import f5.o;
import f5.w;
import j3.s0;
import j3.t0;
import j3.t1;
import java.util.ArrayList;
import java.util.Arrays;
import o3.k;
import o3.l;
import o3.m;
import o3.n;
import q8.x;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements k {
    public int c;
    public c e;
    public long h;
    public e i;
    public int m;
    public boolean n;
    public final w a = new w(12);
    public final c8.a b = new c8.a();
    public m d = new ya.a(15);
    public e[] g = new e[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(l lVar, n nVar) {
        boolean z10;
        e eVar;
        int i10;
        e eVar2;
        long j10 = this.h;
        if (j10 != -1) {
            long j11 = ((o3.h) lVar).d;
            if (j10 < j11 || j10 > 262144 + j11) {
                nVar.a = j10;
                z10 = true;
                this.h = -1L;
                if (!z10) {
                    return 1;
                }
                int i11 = this.c;
                e eVar3 = null;
                c8.a aVar = this.b;
                w wVar = this.a;
                switch (i11) {
                    case 0:
                        if (!e(lVar)) {
                            throw t1.a("AVI Header List not found", null);
                        }
                        ((o3.h) lVar).t(12);
                        this.c = 1;
                        return 0;
                    case 1:
                        ((o3.h) lVar).c(wVar.a, 0, 12, false);
                        wVar.C(0);
                        aVar.getClass();
                        aVar.a = wVar.g();
                        aVar.b = wVar.g();
                        aVar.c = 0;
                        if (aVar.a != 1414744396) {
                            throw t1.a("LIST expected, found: " + aVar.a, null);
                        }
                        int g10 = wVar.g();
                        aVar.c = g10;
                        if (g10 == 1819436136) {
                            this.j = aVar.b;
                            this.c = 2;
                            return 0;
                        }
                        throw t1.a("hdrl expected, found: " + aVar.c, null);
                    case 2:
                        int i12 = this.j - 4;
                        w wVar2 = new w(i12);
                        ((o3.h) lVar).c(wVar2.a, 0, i12, false);
                        f b10 = f.b(1819436136, wVar2);
                        int i13 = b10.b;
                        if (i13 != 1819436136) {
                            throw t1.a("Unexpected header list type " + i13, null);
                        }
                        c cVar = (c) b10.a(c.class);
                        if (cVar == null) {
                            throw t1.a("AviHeader not found", null);
                        }
                        this.e = cVar;
                        this.f = cVar.c * cVar.a;
                        ArrayList arrayList = new ArrayList();
                        x listIterator = b10.a.listIterator(0);
                        int i14 = 0;
                        while (listIterator.hasNext()) {
                            a aVar2 = (a) listIterator.next();
                            if (aVar2.getType() == 1819440243) {
                                f fVar = (f) aVar2;
                                int i15 = i14 + 1;
                                d dVar = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar == null) {
                                    f5.a.K("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    f5.a.K("AviExtractor", "Missing Stream Format");
                                } else {
                                    long O = d0.O(dVar.d, dVar.b * 1000000, dVar.c);
                                    t0 t0Var = gVar.a;
                                    s0 a2 = t0Var.a();
                                    a2.a = Integer.toString(i14);
                                    int i16 = dVar.e;
                                    if (i16 != 0) {
                                        a2.p = i16;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a2.b = hVar.a;
                                    }
                                    int g11 = o.g(t0Var.B);
                                    if (g11 == 1 || g11 == 2) {
                                        o3.w Z1 = this.d.Z1(i14, g11);
                                        Z1.b(new t0(a2));
                                        eVar = new e(i14, g11, O, dVar.d, Z1);
                                        this.f = O;
                                        if (eVar != null) {
                                            arrayList.add(eVar);
                                        }
                                        i14 = i15;
                                    }
                                }
                                eVar = null;
                                if (eVar != null) {
                                }
                                i14 = i15;
                            }
                        }
                        this.g = (e[]) arrayList.toArray(new e[0]);
                        this.d.e1();
                        this.c = 3;
                        return 0;
                    case 3:
                        long j12 = this.k;
                        if (j12 != -1 && ((o3.h) lVar).d != j12) {
                            this.h = j12;
                            return 0;
                        }
                        ((o3.h) lVar).f(wVar.a, 0, 12, false);
                        o3.h hVar2 = (o3.h) lVar;
                        hVar2.f = 0;
                        wVar.C(0);
                        aVar.getClass();
                        aVar.a = wVar.g();
                        aVar.b = wVar.g();
                        aVar.c = 0;
                        int g12 = wVar.g();
                        int i17 = aVar.a;
                        if (i17 == 1179011410) {
                            hVar2.t(12);
                            return 0;
                        }
                        if (i17 != 1414744396 || g12 != 1769369453) {
                            this.h = hVar2.d + aVar.b + 8;
                            return 0;
                        }
                        long j13 = hVar2.d;
                        this.k = j13;
                        this.l = j13 + aVar.b + 8;
                        if (!this.n) {
                            c cVar2 = this.e;
                            cVar2.getClass();
                            if ((cVar2.b & 16) == 16) {
                                this.c = 4;
                                this.h = this.l;
                                return 0;
                            }
                            this.d.D1(new o3.o(this.f));
                            this.n = true;
                        }
                        this.h = hVar2.d + 12;
                        this.c = 6;
                        return 0;
                    case 4:
                        ((o3.h) lVar).c(wVar.a, 0, 8, false);
                        wVar.C(0);
                        int g13 = wVar.g();
                        int g14 = wVar.g();
                        if (g13 != 829973609) {
                            this.h = ((o3.h) lVar).d + g14;
                            return 0;
                        }
                        this.c = 5;
                        this.m = g14;
                        return 0;
                    case 5:
                        w wVar3 = new w(this.m);
                        ((o3.h) lVar).c(wVar3.a, 0, this.m, false);
                        if (wVar3.a() >= 16) {
                            int i18 = wVar3.b;
                            wVar3.D(8);
                            long g15 = wVar3.g();
                            long j14 = this.k;
                            r7 = g15 <= j14 ? j14 + 8 : 0L;
                            wVar3.C(i18);
                        }
                        while (wVar3.a() >= 16) {
                            int g16 = wVar3.g();
                            int g17 = wVar3.g();
                            long g18 = wVar3.g() + r7;
                            wVar3.g();
                            e[] eVarArr = this.g;
                            int length = eVarArr.length;
                            while (true) {
                                if (i10 < length) {
                                    eVar2 = eVarArr[i10];
                                    i10 = (eVar2.b == g16 || eVar2.c == g16) ? 0 : i10 + 1;
                                } else {
                                    eVar2 = null;
                                }
                            }
                            if (eVar2 != null) {
                                if ((g17 & 16) == 16) {
                                    if (eVar2.j == eVar2.l.length) {
                                        long[] jArr = eVar2.k;
                                        eVar2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = eVar2.l;
                                        eVar2.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = eVar2.k;
                                    int i19 = eVar2.j;
                                    jArr2[i19] = g18;
                                    eVar2.l[i19] = eVar2.i;
                                    eVar2.j = i19 + 1;
                                }
                                eVar2.i++;
                            }
                        }
                        for (e eVar4 : this.g) {
                            eVar4.k = Arrays.copyOf(eVar4.k, eVar4.j);
                            eVar4.l = Arrays.copyOf(eVar4.l, eVar4.j);
                        }
                        this.n = true;
                        this.d.D1(new o3.o(this, this.f, 2));
                        this.c = 6;
                        this.h = this.k;
                        return 0;
                    case 6:
                        if (((o3.h) lVar).d >= this.l) {
                            return -1;
                        }
                        e eVar5 = this.i;
                        if (eVar5 != null) {
                            int i20 = eVar5.g;
                            int a10 = i20 - eVar5.a.a(lVar, i20, false);
                            eVar5.g = a10;
                            boolean z11 = a10 == 0;
                            if (z11) {
                                if (eVar5.f > 0) {
                                    o3.w wVar4 = eVar5.a;
                                    int i21 = eVar5.h;
                                    wVar4.c((eVar5.d * i21) / eVar5.e, Arrays.binarySearch(eVar5.l, i21) >= 0 ? 1 : 0, eVar5.f, 0, null);
                                }
                                eVar5.h++;
                            }
                            if (z11) {
                                this.i = null;
                            }
                            return 0;
                        }
                        o3.h hVar3 = (o3.h) lVar;
                        if ((hVar3.d & 1) == 1) {
                            hVar3.t(1);
                        }
                        hVar3.f(wVar.a, 0, 12, false);
                        wVar.C(0);
                        int g19 = wVar.g();
                        if (g19 == 1414744396) {
                            wVar.C(8);
                            hVar3.t(wVar.g() == 1769369453 ? 12 : 8);
                            hVar3.f = 0;
                            return 0;
                        }
                        int g20 = wVar.g();
                        if (g19 == 1263424842) {
                            this.h = hVar3.d + g20 + 8;
                            return 0;
                        }
                        hVar3.t(8);
                        hVar3.f = 0;
                        for (e eVar6 : this.g) {
                            if (eVar6.b == g19 || eVar6.c == g19) {
                                eVar3 = eVar6;
                                if (eVar3 != null) {
                                    this.h = hVar3.d + g20;
                                    return 0;
                                }
                                eVar3.f = g20;
                                eVar3.g = g20;
                                this.i = eVar3;
                                return 0;
                            }
                        }
                        if (eVar3 != null) {
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                ((o3.h) lVar).t((int) (j10 - j11));
            }
        }
        z10 = false;
        this.h = -1L;
        if (!z10) {
        }
    }

    @Override // o3.k
    public final boolean e(l lVar) {
        w wVar = this.a;
        lVar.a(0, 12, wVar.a);
        wVar.C(0);
        if (wVar.g() == 1179011410) {
            wVar.D(4);
            if (wVar.g() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
        this.h = -1L;
        this.i = null;
        for (e eVar : this.g) {
            if (eVar.j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.l[d0.e(eVar.k, j10, true)];
            }
        }
        if (j10 != 0) {
            this.c = 6;
        } else if (this.g.length == 0) {
            this.c = 0;
        } else {
            this.c = 3;
        }
    }

    @Override // o3.k
    public final void i(m mVar) {
        this.c = 0;
        this.d = mVar;
        this.h = -1L;
    }

    @Override // o3.k
    public final void release() {
    }
}
