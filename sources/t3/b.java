package t3;

import h5.d0;
import h5.o;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.jb;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.v;
import s8.t;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b implements k {
    public int c;
    public c e;
    public long h;
    public e i;
    public int m;
    public boolean n;
    public final w a = new w(12);
    public final e8.a b = new e8.a();
    public m d = new db.a(21);
    public e[] g = new e[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    @Override // r3.k
    public final void d(long j10, long j11) {
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

    @Override // r3.k
    public final void e(m mVar) {
        this.c = 0;
        this.d = mVar;
        this.h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(l lVar, jb jbVar) {
        boolean z4;
        e eVar;
        int i10;
        e eVar2;
        long j10 = this.h;
        if (j10 != -1) {
            long j11 = ((r3.h) lVar).d;
            if (j10 < j11 || j10 > 262144 + j11) {
                jbVar.a = j10;
                z4 = true;
                this.h = -1L;
                if (!z4) {
                    return 1;
                }
                int i11 = this.c;
                e eVar3 = null;
                e8.a aVar = this.b;
                w wVar = this.a;
                switch (i11) {
                    case 0:
                        if (!i(lVar)) {
                            throw r1.a("AVI Header List not found", null);
                        }
                        ((r3.h) lVar).s(12);
                        this.c = 1;
                        return 0;
                    case 1:
                        ((r3.h) lVar).c(wVar.a, 0, 12, false);
                        wVar.F(0);
                        aVar.getClass();
                        aVar.a = wVar.i();
                        aVar.b = wVar.i();
                        aVar.c = 0;
                        if (aVar.a != 1414744396) {
                            throw r1.a("LIST expected, found: " + aVar.a, null);
                        }
                        int i12 = wVar.i();
                        aVar.c = i12;
                        if (i12 == 1819436136) {
                            this.j = aVar.b;
                            this.c = 2;
                            return 0;
                        }
                        throw r1.a("hdrl expected, found: " + aVar.c, null);
                    case 2:
                        int i13 = this.j - 4;
                        w wVar2 = new w(i13);
                        ((r3.h) lVar).c(wVar2.a, 0, i13, false);
                        f b10 = f.b(1819436136, wVar2);
                        int i14 = b10.b;
                        if (i14 != 1819436136) {
                            throw r1.a("Unexpected header list type " + i14, null);
                        }
                        c cVar = (c) b10.a(c.class);
                        if (cVar == null) {
                            throw r1.a("AviHeader not found", null);
                        }
                        this.e = cVar;
                        this.f = cVar.c * cVar.a;
                        ArrayList arrayList = new ArrayList();
                        t listIterator = b10.a.listIterator(0);
                        int i15 = 0;
                        while (listIterator.hasNext()) {
                            a aVar2 = (a) listIterator.next();
                            if (aVar2.getType() == 1819440243) {
                                f fVar = (f) aVar2;
                                int i16 = i15 + 1;
                                d dVar = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar == null) {
                                    h5.a.K("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    h5.a.K("AviExtractor", "Missing Stream Format");
                                } else {
                                    long N = d0.N(dVar.d, dVar.b * 1000000, dVar.c);
                                    n0 n0Var = gVar.a;
                                    m0 a2 = n0Var.a();
                                    a2.a = Integer.toString(i15);
                                    int i17 = dVar.e;
                                    if (i17 != 0) {
                                        a2.p = i17;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a2.b = hVar.a;
                                    }
                                    int g10 = o.g(n0Var.C);
                                    if (g10 == 1 || g10 == 2) {
                                        v i22 = this.d.i2(i15, g10);
                                        i22.b(new n0(a2));
                                        eVar = new e(i15, g10, N, dVar.d, i22);
                                        this.f = N;
                                        if (eVar != null) {
                                            arrayList.add(eVar);
                                        }
                                        i15 = i16;
                                    }
                                }
                                eVar = null;
                                if (eVar != null) {
                                }
                                i15 = i16;
                            }
                        }
                        this.g = (e[]) arrayList.toArray(new e[0]);
                        this.d.i1();
                        this.c = 3;
                        return 0;
                    case 3:
                        long j12 = this.k;
                        if (j12 != -1 && ((r3.h) lVar).d != j12) {
                            this.h = j12;
                            return 0;
                        }
                        ((r3.h) lVar).f(wVar.a, 0, 12, false);
                        r3.h hVar2 = (r3.h) lVar;
                        hVar2.f = 0;
                        wVar.F(0);
                        aVar.getClass();
                        aVar.a = wVar.i();
                        aVar.b = wVar.i();
                        aVar.c = 0;
                        int i18 = wVar.i();
                        int i19 = aVar.a;
                        if (i19 == 1179011410) {
                            hVar2.s(12);
                            return 0;
                        }
                        if (i19 != 1414744396 || i18 != 1769369453) {
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
                            this.d.m2(new n(this.f));
                            this.n = true;
                        }
                        this.h = hVar2.d + 12;
                        this.c = 6;
                        return 0;
                    case 4:
                        ((r3.h) lVar).c(wVar.a, 0, 8, false);
                        wVar.F(0);
                        int i20 = wVar.i();
                        int i21 = wVar.i();
                        if (i20 != 829973609) {
                            this.h = ((r3.h) lVar).d + i21;
                            return 0;
                        }
                        this.c = 5;
                        this.m = i21;
                        return 0;
                    case 5:
                        w wVar3 = new w(this.m);
                        ((r3.h) lVar).c(wVar3.a, 0, this.m, false);
                        if (wVar3.a() >= 16) {
                            int i23 = wVar3.b;
                            wVar3.G(8);
                            long i24 = wVar3.i();
                            long j14 = this.k;
                            r7 = i24 <= j14 ? j14 + 8 : 0L;
                            wVar3.F(i23);
                        }
                        while (wVar3.a() >= 16) {
                            int i25 = wVar3.i();
                            int i26 = wVar3.i();
                            long i27 = wVar3.i() + r7;
                            wVar3.i();
                            e[] eVarArr = this.g;
                            int length = eVarArr.length;
                            while (true) {
                                if (i10 < length) {
                                    eVar2 = eVarArr[i10];
                                    i10 = (eVar2.b == i25 || eVar2.c == i25) ? 0 : i10 + 1;
                                } else {
                                    eVar2 = null;
                                }
                            }
                            if (eVar2 != null) {
                                if ((i26 & 16) == 16) {
                                    if (eVar2.j == eVar2.l.length) {
                                        long[] jArr = eVar2.k;
                                        eVar2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = eVar2.l;
                                        eVar2.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = eVar2.k;
                                    int i28 = eVar2.j;
                                    jArr2[i28] = i27;
                                    eVar2.l[i28] = eVar2.i;
                                    eVar2.j = i28 + 1;
                                }
                                eVar2.i++;
                            }
                        }
                        for (e eVar4 : this.g) {
                            eVar4.k = Arrays.copyOf(eVar4.k, eVar4.j);
                            eVar4.l = Arrays.copyOf(eVar4.l, eVar4.j);
                        }
                        this.n = true;
                        this.d.m2(new n(this, this.f, 2));
                        this.c = 6;
                        this.h = this.k;
                        return 0;
                    case 6:
                        if (((r3.h) lVar).d >= this.l) {
                            return -1;
                        }
                        e eVar5 = this.i;
                        if (eVar5 != null) {
                            int i29 = eVar5.g;
                            int e6 = i29 - eVar5.a.e(lVar, i29, false);
                            eVar5.g = e6;
                            boolean z10 = e6 == 0;
                            if (z10) {
                                if (eVar5.f > 0) {
                                    v vVar = eVar5.a;
                                    int i30 = eVar5.h;
                                    vVar.c((eVar5.d * i30) / eVar5.e, Arrays.binarySearch(eVar5.l, i30) >= 0 ? 1 : 0, eVar5.f, 0, null);
                                }
                                eVar5.h++;
                            }
                            if (z10) {
                                this.i = null;
                            }
                            return 0;
                        }
                        r3.h hVar3 = (r3.h) lVar;
                        if ((hVar3.d & 1) == 1) {
                            hVar3.s(1);
                        }
                        hVar3.f(wVar.a, 0, 12, false);
                        wVar.F(0);
                        int i31 = wVar.i();
                        if (i31 == 1414744396) {
                            wVar.F(8);
                            hVar3.s(wVar.i() == 1769369453 ? 12 : 8);
                            hVar3.f = 0;
                            return 0;
                        }
                        int i32 = wVar.i();
                        if (i31 == 1263424842) {
                            this.h = hVar3.d + i32 + 8;
                            return 0;
                        }
                        hVar3.s(8);
                        hVar3.f = 0;
                        for (e eVar6 : this.g) {
                            if (eVar6.b == i31 || eVar6.c == i31) {
                                eVar3 = eVar6;
                                if (eVar3 != null) {
                                    this.h = hVar3.d + i32;
                                    return 0;
                                }
                                eVar3.f = i32;
                                eVar3.g = i32;
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
                ((r3.h) lVar).s((int) (j10 - j11));
            }
        }
        z4 = false;
        this.h = -1L;
        if (!z4) {
        }
    }

    @Override // r3.k
    public final boolean i(l lVar) {
        w wVar = this.a;
        lVar.b(0, 12, wVar.a);
        wVar.F(0);
        if (wVar.i() == 1179011410) {
            wVar.G(4);
            if (wVar.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // r3.k
    public final void release() {
    }
}
