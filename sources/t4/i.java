package t4;

import android.net.Uri;
import android.util.Pair;
import g5.v0;
import h5.d0;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k7.y7;
import o4.s0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zz;
import s8.i0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i {
    public final j a;
    public final g5.m b;
    public final g5.m c;
    public final tp0 d;
    public final Uri[] e;
    public final n0[] f;
    public final u4.c g;
    public final s0 h;
    public final List i;
    public final k3.k k;
    public boolean l;
    public o4.b n;
    public Uri o;
    public boolean p;
    public f5.c q;
    public boolean s;
    public final zz j = new zz(15);
    public byte[] m = d0.f;
    public long r = -9223372036854775807L;

    public i(j jVar, u4.c cVar, Uri[] uriArr, n0[] n0VarArr, o3.c cVar2, v0 v0Var, tp0 tp0Var, List list, k3.k kVar) {
        this.a = jVar;
        this.g = cVar;
        this.e = uriArr;
        this.f = n0VarArr;
        this.d = tp0Var;
        this.i = list;
        this.k = kVar;
        g5.m createDataSource = ((g5.l) cVar2.b).createDataSource();
        this.b = createDataSource;
        if (v0Var != null) {
            createDataSource.addTransferListener(v0Var);
        }
        this.c = ((g5.l) cVar2.b).createDataSource();
        this.h = new s0("", n0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((n0VarArr[i10].e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        s0 s0Var = this.h;
        int[] d = y7.d(arrayList);
        g gVar = new g(s0Var, d);
        gVar.g = gVar.n(s0Var.d[d[0]]);
        this.q = gVar;
    }

    public final q4.l[] a(k kVar, long j10) {
        List list;
        i iVar = this;
        k kVar2 = kVar;
        int a2 = kVar2 == null ? -1 : iVar.h.a(kVar2.d);
        int p10 = iVar.q.p();
        q4.l[] lVarArr = new q4.l[p10];
        boolean z4 = false;
        int i10 = 0;
        while (i10 < p10) {
            int f10 = iVar.q.f(i10);
            Uri uri = iVar.e[f10];
            u4.c cVar = iVar.g;
            if (cVar.c(uri)) {
                u4.i a10 = cVar.a(uri, z4);
                a10.getClass();
                long j11 = a10.h - cVar.y;
                Pair c3 = iVar.c(kVar2, f10 != a2, a10, j11, j10);
                long longValue = ((Long) c3.first).longValue();
                int intValue = ((Integer) c3.second).intValue();
                long j12 = a10.k;
                s8.v vVar = a10.s;
                s8.v vVar2 = a10.r;
                int i11 = (int) (longValue - j12);
                if (i11 < 0 || vVar2.size() < i11) {
                    s8.t tVar = s8.v.b;
                    list = i0.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < vVar2.size()) {
                        if (intValue != -1) {
                            u4.f fVar = (u4.f) vVar2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(fVar);
                            } else if (intValue < fVar.x.size()) {
                                s8.v vVar3 = fVar.x;
                                arrayList.addAll(vVar3.subList(intValue, vVar3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(vVar2.subList(i11, vVar2.size()));
                        intValue = 0;
                    }
                    if (a10.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < vVar.size()) {
                            arrayList.addAll(vVar.subList(intValue, vVar.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                lVarArr[i10] = new f(j11, list);
            } else {
                lVarArr[i10] = q4.l.z;
            }
            i10++;
            iVar = this;
            kVar2 = kVar;
            z4 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        int i10 = kVar.B;
        if (i10 == -1) {
            return 1;
        }
        u4.i a2 = this.g.a(this.e[this.h.a(kVar.d)], false);
        a2.getClass();
        s8.v vVar = a2.r;
        int i11 = (int) (kVar.s - a2.k);
        if (i11 < 0) {
            return 1;
        }
        s8.v vVar2 = i11 < vVar.size() ? ((u4.f) vVar.get(i11)).x : a2.s;
        if (i10 >= vVar2.size()) {
            return 2;
        }
        u4.d dVar = (u4.d) vVar2.get(i10);
        if (dVar.x) {
            return 0;
        }
        return d0.a(Uri.parse(h5.a.G(a2.a, dVar.a)), kVar.b.a) ? 1 : 2;
    }

    public final Pair c(k kVar, boolean z4, u4.i iVar, long j10, long j11) {
        boolean z10 = true;
        if (kVar != null) {
            long j12 = kVar.s;
            int i10 = kVar.B;
            if (!z4) {
                if (!kVar.U) {
                    return new Pair(Long.valueOf(j12), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    j12 = kVar.c();
                }
                return new Pair(Long.valueOf(j12), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j13 = iVar.u;
        s8.v vVar = iVar.s;
        long j14 = iVar.k;
        s8.v vVar2 = iVar.r;
        long j15 = j13 + j10;
        if (kVar != null && !this.p) {
            j11 = kVar.h;
        }
        if (!iVar.o && j11 >= j15) {
            return new Pair(Long.valueOf(j14 + vVar2.size()), -1);
        }
        long j16 = j11 - j10;
        Long valueOf = Long.valueOf(j16);
        int i11 = 0;
        if (this.g.x && kVar != null) {
            z10 = false;
        }
        int c3 = d0.c(vVar2, valueOf, z10);
        long j17 = c3 + j14;
        if (c3 >= 0) {
            u4.f fVar = (u4.f) vVar2.get(c3);
            s8.v vVar3 = j16 < fVar.e + fVar.c ? fVar.x : vVar;
            while (true) {
                if (i11 >= vVar3.size()) {
                    break;
                }
                u4.d dVar = (u4.d) vVar3.get(i11);
                if (j16 >= dVar.e + dVar.c) {
                    i11++;
                } else if (dVar.w) {
                    j17 += vVar3 == vVar ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j17), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e d(int i10, Uri uri, boolean z4) {
        if (uri == null) {
            return null;
        }
        zz zzVar = this.j;
        byte[] bArr = (byte[]) ((d) zzVar.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        Map map = Collections.EMPTY_MAP;
        g5.p pVar = new g5.p(uri, 1, null, s8.n0.h, 0L, -1L, null, 1);
        n0 n0Var = this.f[i10];
        int k10 = this.q.k();
        Object j10 = this.q.j();
        byte[] bArr2 = this.m;
        e eVar = new e(this.c, pVar, 3, n0Var, k10, j10, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = d0.f;
        }
        eVar.s = bArr2;
        return eVar;
    }
}
