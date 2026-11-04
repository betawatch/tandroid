package q2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b8.od;
import d2.o1;
import d2.v;
import g2.n0;
import g9.g0;
import g9.g2;
import g9.i0;
import g9.s1;
import g9.t0;
import i2.d0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.y00;
import r2.w;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i {
    public final c a;
    public final i2.h b;
    public final i2.h c;
    public final i9 d;
    public final w[] e;
    public final v[] f;
    public final r2.d g;
    public final o1 h;
    public final List i;
    public final l2.k k;
    public boolean l;
    public w2.b n;
    public Uri o;
    public Uri p;
    public boolean q;
    public z2.p r;
    public final y00 j = new y00(10);
    public byte[] m = n0.b;
    public long s = -9223372036854775807L;

    public i(c cVar, r2.d dVar, w[] wVarArr, v[] vVarArr, i9 i9Var, d0 d0Var, i9 i9Var2, List list, l2.k kVar) {
        this.a = cVar;
        this.g = dVar;
        this.e = wVarArr;
        this.f = vVarArr;
        this.d = i9Var2;
        this.i = list;
        this.k = kVar;
        i2.h createDataSource = ((i2.g) i9Var.b).createDataSource();
        this.b = createDataSource;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        this.c = ((i2.g) i9Var.b).createDataSource();
        this.h = new o1("", vVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < wVarArr.length; i3++) {
            if ((vVarArr[i3].f & TLObject.FLAG_14) == 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        o1 o1Var = this.h;
        int[] f10 = od.f(arrayList);
        g gVar = new g(o1Var, f10);
        gVar.g = gVar.e(o1Var.d[f10[0]]);
        this.r = gVar;
    }

    public static h f(r2.m mVar, long j10, int i3) {
        long j11 = mVar.k;
        i0 i0Var = mVar.s;
        int i10 = (int) (j10 - j11);
        i0 i0Var2 = mVar.r;
        if (i10 == i0Var2.size()) {
            if (i3 == -1) {
                i3 = 0;
            }
            if (i3 < i0Var.size()) {
                return new h((r2.k) i0Var.get(i3), j10, i3);
            }
            return null;
        }
        r2.j jVar = (r2.j) i0Var2.get(i10);
        if (i3 == -1) {
            return new h(jVar, j10, -1);
        }
        if (i3 < jVar.y.size()) {
            return new h((r2.k) jVar.y.get(i3), j10, i3);
        }
        int i11 = i10 + 1;
        if (i11 < i0Var2.size()) {
            return new h((r2.k) i0Var2.get(i11), j10 + 1, -1);
        }
        if (i0Var.isEmpty()) {
            return null;
        }
        return new h((r2.k) i0Var.get(0), j10 + 1, 0);
    }

    public final a3.h a(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r2.d dVar = this.g;
        r2.c cVar = (r2.c) dVar.d.get(uri);
        w wVar = cVar != null ? cVar.a : null;
        wVar.getClass();
        HashMap hashMap = wVar.b;
        int size = hashMap.size();
        g2 it = t0.q(hashMap.values()).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            r2.c cVar2 = (r2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                r2.b bVar = (r2.b) f1.p(cVar2.b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.r) {
                    i3++;
                }
            }
        }
        return new a3.h(size, i3, this.r.length(), d(elapsedRealtime));
    }

    public final x2.m[] b(j jVar, long j10) {
        List list;
        i iVar = this;
        j jVar2 = jVar;
        int a10 = jVar2 == null ? -1 : iVar.h.a(jVar2.d);
        int length = iVar.r.length();
        x2.m[] mVarArr = new x2.m[length];
        boolean z10 = false;
        int i3 = 0;
        while (i3 < length) {
            int i10 = iVar.r.i(i3);
            Uri c2 = iVar.e[i10].c();
            r2.d dVar = iVar.g;
            if (dVar.f(c2)) {
                r2.m b10 = dVar.b(c2, z10);
                b10.getClass();
                long j11 = b10.h - dVar.J;
                Pair e10 = iVar.e(jVar2, i10 != a10 ? true : z10, b10, j11, j10);
                long longValue = ((Long) e10.first).longValue();
                int intValue = ((Integer) e10.second).intValue();
                long j12 = b10.k;
                i0 i0Var = b10.s;
                i0 i0Var2 = b10.r;
                int i11 = (int) (longValue - j12);
                if (i11 < 0 || i0Var2.size() < i11) {
                    g0 g0Var = i0.b;
                    list = s1.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            r2.j jVar3 = (r2.j) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.y.size()) {
                                i0 i0Var3 = jVar3.y;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                mVarArr[i3] = new f(j11, list);
            } else {
                mVarArr[i3] = x2.m.B;
            }
            i3++;
            iVar = this;
            jVar2 = jVar;
            z10 = false;
        }
        return mVarArr;
    }

    public final int c(j jVar) {
        int i3 = jVar.F;
        if (i3 == -1) {
            return 1;
        }
        r2.m b10 = this.g.b(jVar.y, false);
        b10.getClass();
        i0 i0Var = b10.r;
        int i10 = (int) (jVar.s - b10.k);
        if (i10 < 0) {
            return 1;
        }
        i0 i0Var2 = i10 < i0Var.size() ? ((r2.j) i0Var.get(i10)).y : b10.s;
        if (i3 >= i0Var2.size()) {
            return 2;
        }
        r2.h hVar = (r2.h) i0Var2.get(i3);
        if (hVar.y) {
            return 0;
        }
        return Objects.equals(Uri.parse(g2.f.f(b10.a, hVar.a)), jVar.b.a) ? 1 : 2;
    }

    public final int d(long j10) {
        int i3;
        z2.p pVar = this.r;
        int length = pVar.length();
        int i10 = 0;
        while (i3 < length) {
            int i11 = pVar.i(i3);
            if (!pVar.a(i3, j10)) {
                i3 = this.g.e(this.e[i11], j10) ? 0 : i3 + 1;
            }
            i10++;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da A[EDGE_INSN: B:58:0x00da->B:60:0x00da BREAK  A[LOOP:0: B:44:0x00ae->B:48:0x00d7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair e(j jVar, boolean z10, r2.m mVar, long j10, long j11) {
        i0 i0Var;
        int i3;
        boolean z11 = true;
        if (jVar != null) {
            long j12 = jVar.s;
            int i10 = jVar.F;
            if (!z10) {
                if (!jVar.Y) {
                    return new Pair(Long.valueOf(j12), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    j12 = jVar.b();
                }
                return new Pair(Long.valueOf(j12), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j13 = mVar.u;
        long j14 = mVar.k;
        i0 i0Var2 = mVar.s;
        i0 i0Var3 = mVar.r;
        long j15 = j10 + j13;
        long j16 = (jVar == null || this.q) ? j11 : jVar.h;
        if (!mVar.o && j16 >= j15) {
            return new Pair(Long.valueOf(j14 + i0Var3.size()), -1);
        }
        long j17 = j16 - j10;
        Long valueOf = Long.valueOf(j17);
        r2.d dVar = this.g;
        if (dVar.I && jVar != null) {
            z11 = false;
        }
        int d = n0.d(i0Var3, valueOf, z11);
        long j18 = d + j14;
        if (!dVar.I) {
            return new Pair(Long.valueOf(j18), -1);
        }
        if (d >= 0) {
            if (!i0Var3.isEmpty()) {
                r2.j jVar2 = (r2.j) i0Var3.get(d);
                if (j17 < jVar2.e + jVar2.c) {
                    i0Var = jVar2.y;
                    i3 = 0;
                    while (true) {
                        if (i3 < i0Var.size()) {
                            break;
                        }
                        r2.h hVar = (r2.h) i0Var.get(i3);
                        if (j17 >= hVar.e + hVar.c) {
                            i3++;
                        } else if (hVar.x) {
                            j18 += (i0Var != i0Var2 || i0Var3.isEmpty()) ? 0L : 1L;
                            r3 = i3;
                        }
                    }
                }
            }
            i0Var = i0Var2;
            i3 = 0;
            while (true) {
                if (i3 < i0Var.size()) {
                }
                i3++;
            }
        }
        return new Pair(Long.valueOf(j18), Integer.valueOf(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e g(Uri uri, int i3, boolean z10) {
        if (uri == null) {
            return null;
        }
        y00 y00Var = this.j;
        byte[] bArr = (byte[]) ((d) y00Var.a).remove(uri);
        if (bArr != null) {
            return null;
        }
        i2.n nVar = new i2.n(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        v vVar = this.f[i3];
        int o10 = this.r.o();
        Object r5 = this.r.r();
        byte[] bArr2 = this.m;
        e eVar = new e(this.c, nVar, 3, vVar, o10, r5, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = n0.b;
        }
        eVar.s = bArr2;
        return eVar;
    }
}
