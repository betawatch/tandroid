package q4;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.y0;
import f5.d0;
import i7.p7;
import j$.util.DesugarCollections;
import j3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.j1;
import nh.d6;
import q8.l0;
import q8.x;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i {
    public final j a;
    public final com.google.android.exoplayer2.upstream.m b;
    public final com.google.android.exoplayer2.upstream.m c;
    public final d6 d;
    public final Uri[] e;
    public final t0[] f;
    public final r4.c g;
    public final j1 h;
    public final List i;
    public final k3.k k;
    public boolean l;
    public l4.b n;
    public Uri o;
    public boolean p;
    public d5.r q;
    public boolean s;
    public final o4.g j = new o4.g(12);
    public byte[] m = d0.f;
    public long r = -9223372036854775807L;

    public i(j jVar, r4.c cVar, Uri[] uriArr, t0[] t0VarArr, o1.a aVar, y0 y0Var, d6 d6Var, List list, k3.k kVar) {
        this.a = jVar;
        this.g = cVar;
        this.e = uriArr;
        this.f = t0VarArr;
        this.d = d6Var;
        this.i = list;
        this.k = kVar;
        com.google.android.exoplayer2.upstream.m createDataSource = ((com.google.android.exoplayer2.upstream.l) aVar.b).createDataSource();
        this.b = createDataSource;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        this.c = ((com.google.android.exoplayer2.upstream.l) aVar.b).createDataSource();
        this.h = new j1("", t0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((t0VarArr[i10].e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        j1 j1Var = this.h;
        int[] e10 = p7.e(arrayList);
        g gVar = new g(j1Var, e10);
        gVar.g = gVar.m(j1Var.d[e10[0]]);
        this.q = gVar;
    }

    public final n4.l[] a(k kVar, long j10) {
        List list;
        i iVar = this;
        k kVar2 = kVar;
        int a2 = kVar2 == null ? -1 : iVar.h.a(kVar2.d);
        int length = iVar.q.length();
        n4.l[] lVarArr = new n4.l[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int i11 = iVar.q.i(i10);
            Uri uri = iVar.e[i11];
            r4.c cVar = iVar.g;
            if (cVar.c(uri)) {
                r4.j a10 = cVar.a(uri, z10);
                a10.getClass();
                long j11 = a10.h - cVar.y;
                Pair c3 = iVar.c(kVar2, i11 != a2, a10, j11, j10);
                long longValue = ((Long) c3.first).longValue();
                int intValue = ((Integer) c3.second).intValue();
                long j12 = a10.k;
                z zVar = a10.s;
                z zVar2 = a10.r;
                int i12 = (int) (longValue - j12);
                if (i12 < 0 || zVar2.size() < i12) {
                    x xVar = z.b;
                    list = l0.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i12 < zVar2.size()) {
                        if (intValue != -1) {
                            r4.g gVar = (r4.g) zVar2.get(i12);
                            if (intValue == 0) {
                                arrayList.add(gVar);
                            } else if (intValue < gVar.x.size()) {
                                z zVar3 = gVar.x;
                                arrayList.addAll(zVar3.subList(intValue, zVar3.size()));
                            }
                            i12++;
                        }
                        arrayList.addAll(zVar2.subList(i12, zVar2.size()));
                        intValue = 0;
                    }
                    if (a10.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < zVar.size()) {
                            arrayList.addAll(zVar.subList(intValue, zVar.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                lVarArr[i10] = new f(j11, list);
            } else {
                lVarArr[i10] = n4.l.p;
            }
            i10++;
            iVar = this;
            kVar2 = kVar;
            z10 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        int i10 = kVar.A;
        if (i10 == -1) {
            return 1;
        }
        r4.j a2 = this.g.a(this.e[this.h.a(kVar.d)], false);
        a2.getClass();
        z zVar = a2.r;
        int i11 = (int) (kVar.s - a2.k);
        if (i11 < 0) {
            return 1;
        }
        z zVar2 = i11 < zVar.size() ? ((r4.g) zVar.get(i11)).x : a2.s;
        if (i10 >= zVar2.size()) {
            return 2;
        }
        r4.e eVar = (r4.e) zVar2.get(i10);
        if (eVar.x) {
            return 0;
        }
        return d0.a(Uri.parse(f5.a.G(a2.a, eVar.a)), kVar.b.a) ? 1 : 2;
    }

    public final Pair c(k kVar, boolean z10, r4.j jVar, long j10, long j11) {
        boolean z11 = true;
        if (kVar != null) {
            long j12 = kVar.s;
            int i10 = kVar.A;
            if (!z10) {
                if (!kVar.T) {
                    return new Pair(Long.valueOf(j12), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    j12 = kVar.b();
                }
                return new Pair(Long.valueOf(j12), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j13 = jVar.u;
        z zVar = jVar.s;
        long j14 = jVar.k;
        z zVar2 = jVar.r;
        long j15 = j13 + j10;
        if (kVar != null && !this.p) {
            j11 = kVar.h;
        }
        if (!jVar.o && j11 >= j15) {
            return new Pair(Long.valueOf(j14 + zVar2.size()), -1);
        }
        long j16 = j11 - j10;
        Long valueOf = Long.valueOf(j16);
        int i11 = 0;
        if (this.g.x && kVar != null) {
            z11 = false;
        }
        int c3 = d0.c(zVar2, valueOf, z11);
        long j17 = c3 + j14;
        if (c3 >= 0) {
            r4.g gVar = (r4.g) zVar2.get(c3);
            z zVar3 = j16 < gVar.e + gVar.c ? gVar.x : zVar;
            while (true) {
                if (i11 >= zVar3.size()) {
                    break;
                }
                r4.e eVar = (r4.e) zVar3.get(i11);
                if (j16 >= eVar.e + eVar.c) {
                    i11++;
                } else if (eVar.w) {
                    j17 += zVar3 == zVar ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j17), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e d(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        o4.g gVar = this.j;
        byte[] bArr = (byte[]) ((d) gVar.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        com.google.android.exoplayer2.upstream.q qVar = new com.google.android.exoplayer2.upstream.q(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        t0 t0Var = this.f[i10];
        int o10 = this.q.o();
        Object r6 = this.q.r();
        byte[] bArr2 = this.m;
        e eVar = new e(this.c, qVar, 3, t0Var, o10, r6, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = d0.f;
        }
        eVar.s = bArr2;
        return eVar;
    }
}
