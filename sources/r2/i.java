package r2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import c8.e1;
import e2.m1;
import e2.u;
import h2.m0;
import h9.g0;
import h9.h2;
import h9.i0;
import h9.t0;
import h9.t1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j2.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.uy;
import s2.w;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i {
    public final c a;
    public final j2.h b;
    public final j2.h c;
    public final org.telegram.ui.Components.n d;
    public final w[] e;
    public final u[] f;
    public final s2.d g;
    public final m1 h;
    public final List i;
    public final m2.j k;
    public boolean l;
    public x2.b n;
    public Uri o;
    public Uri p;
    public boolean q;
    public a3.u r;
    public final uy j = new uy(12);
    public byte[] m = m0.b;
    public long s = -9223372036854775807L;

    public i(c cVar, s2.d dVar, w[] wVarArr, u[] uVarArr, org.telegram.ui.Components.n nVar, d0 d0Var, org.telegram.ui.Components.n nVar2, List list, m2.j jVar) {
        this.a = cVar;
        this.g = dVar;
        this.e = wVarArr;
        this.f = uVarArr;
        this.d = nVar2;
        this.i = list;
        this.k = jVar;
        j2.h createDataSource = ((j2.g) nVar.a).createDataSource();
        this.b = createDataSource;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        this.c = ((j2.g) nVar.a).createDataSource();
        this.h = new m1("", uVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < wVarArr.length; i7++) {
            if ((uVarArr[i7].f & TLObject.FLAG_14) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        m1 m1Var = this.h;
        int[] f10 = e1.f(arrayList);
        g gVar = new g(m1Var, f10);
        gVar.g = gVar.b(m1Var.d[f10[0]]);
        this.r = gVar;
    }

    public static h f(s2.m mVar, long j3, int i7) {
        long j10 = mVar.k;
        i0 i0Var = mVar.s;
        int i10 = (int) (j3 - j10);
        i0 i0Var2 = mVar.r;
        if (i10 == i0Var2.size()) {
            if (i7 == -1) {
                i7 = 0;
            }
            if (i7 < i0Var.size()) {
                return new h((s2.k) i0Var.get(i7), j3, i7);
            }
            return null;
        }
        s2.j jVar = (s2.j) i0Var2.get(i10);
        if (i7 == -1) {
            return new h(jVar, j3, -1);
        }
        if (i7 < jVar.y.size()) {
            return new h((s2.k) jVar.y.get(i7), j3, i7);
        }
        int i11 = i10 + 1;
        if (i11 < i0Var2.size()) {
            return new h((s2.k) i0Var2.get(i11), j3 + 1, -1);
        }
        if (i0Var.isEmpty()) {
            return null;
        }
        return new h((s2.k) i0Var.get(0), j3 + 1, 0);
    }

    public final b3.h a(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        s2.d dVar = this.g;
        s2.c cVar = (s2.c) dVar.d.get(uri);
        w wVar = cVar != null ? cVar.a : null;
        wVar.getClass();
        HashMap hashMap = wVar.b;
        int size = hashMap.size();
        h2 it = t0.q(hashMap.values()).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            s2.c cVar2 = (s2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                s2.b bVar = (s2.b) f1.l(cVar2.b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.r) {
                    i7++;
                }
            }
        }
        return new b3.h(size, i7, this.r.length(), d(elapsedRealtime));
    }

    public final y2.m[] b(j jVar, long j3) {
        List list;
        i iVar = this;
        j jVar2 = jVar;
        int a10 = jVar2 == null ? -1 : iVar.h.a(jVar2.d);
        int length = iVar.r.length();
        y2.m[] mVarArr = new y2.m[length];
        boolean z9 = false;
        int i7 = 0;
        while (i7 < length) {
            int i10 = iVar.r.i(i7);
            Uri c10 = iVar.e[i10].c();
            s2.d dVar = iVar.g;
            if (dVar.f(c10)) {
                s2.m b10 = dVar.b(c10, z9);
                b10.getClass();
                long j10 = b10.h - dVar.I;
                Pair e10 = iVar.e(jVar2, i10 != a10 ? true : z9, b10, j10, j3);
                long longValue = ((Long) e10.first).longValue();
                int intValue = ((Integer) e10.second).intValue();
                long j11 = b10.k;
                i0 i0Var = b10.s;
                i0 i0Var2 = b10.r;
                int i11 = (int) (longValue - j11);
                if (i11 < 0 || i0Var2.size() < i11) {
                    g0 g0Var = i0.b;
                    list = t1.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            s2.j jVar3 = (s2.j) i0Var2.get(i11);
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
                mVarArr[i7] = new f(j10, list);
            } else {
                mVarArr[i7] = y2.m.C;
            }
            i7++;
            iVar = this;
            jVar2 = jVar;
            z9 = false;
        }
        return mVarArr;
    }

    public final int c(j jVar) {
        int i7 = jVar.E;
        if (i7 == -1) {
            return 1;
        }
        s2.m b10 = this.g.b(jVar.y, false);
        b10.getClass();
        i0 i0Var = b10.r;
        int i10 = (int) (jVar.s - b10.k);
        if (i10 < 0) {
            return 1;
        }
        i0 i0Var2 = i10 < i0Var.size() ? ((s2.j) i0Var.get(i10)).y : b10.s;
        if (i7 >= i0Var2.size()) {
            return 2;
        }
        s2.h hVar = (s2.h) i0Var2.get(i7);
        if (hVar.y) {
            return 0;
        }
        return Objects.equals(Uri.parse(h2.e.f(b10.a, hVar.a)), jVar.b.a) ? 1 : 2;
    }

    public final int d(long j3) {
        int i7;
        a3.u uVar = this.r;
        int length = uVar.length();
        int i10 = 0;
        while (i7 < length) {
            int i11 = uVar.i(i7);
            if (!uVar.a(i7, j3)) {
                i7 = this.g.e(this.e[i11], j3) ? 0 : i7 + 1;
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
    public final Pair e(j jVar, boolean z9, s2.m mVar, long j3, long j10) {
        i0 i0Var;
        int i7;
        boolean z10 = true;
        if (jVar != null) {
            long j11 = jVar.s;
            int i10 = jVar.E;
            if (!z9) {
                if (!jVar.X) {
                    return new Pair(Long.valueOf(j11), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    j11 = jVar.b();
                }
                return new Pair(Long.valueOf(j11), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j12 = mVar.u;
        long j13 = mVar.k;
        i0 i0Var2 = mVar.s;
        i0 i0Var3 = mVar.r;
        long j14 = j3 + j12;
        long j15 = (jVar == null || this.q) ? j10 : jVar.h;
        if (!mVar.o && j15 >= j14) {
            return new Pair(Long.valueOf(j13 + i0Var3.size()), -1);
        }
        long j16 = j15 - j3;
        Long valueOf = Long.valueOf(j16);
        s2.d dVar = this.g;
        if (dVar.H && jVar != null) {
            z10 = false;
        }
        int d = m0.d(i0Var3, valueOf, z10);
        long j17 = d + j13;
        if (!dVar.H) {
            return new Pair(Long.valueOf(j17), -1);
        }
        if (d >= 0) {
            if (!i0Var3.isEmpty()) {
                s2.j jVar2 = (s2.j) i0Var3.get(d);
                if (j16 < jVar2.e + jVar2.c) {
                    i0Var = jVar2.y;
                    i7 = 0;
                    while (true) {
                        if (i7 < i0Var.size()) {
                            break;
                        }
                        s2.h hVar = (s2.h) i0Var.get(i7);
                        if (j16 >= hVar.e + hVar.c) {
                            i7++;
                        } else if (hVar.x) {
                            j17 += (i0Var != i0Var2 || i0Var3.isEmpty()) ? 0L : 1L;
                            r3 = i7;
                        }
                    }
                }
            }
            i0Var = i0Var2;
            i7 = 0;
            while (true) {
                if (i7 < i0Var.size()) {
                }
                i7++;
            }
        }
        return new Pair(Long.valueOf(j17), Integer.valueOf(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e g(Uri uri, int i7, boolean z9) {
        if (uri == null) {
            return null;
        }
        uy uyVar = this.j;
        byte[] bArr = (byte[]) ((d) uyVar.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        j2.m mVar = new j2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        u uVar = this.f[i7];
        int o4 = this.r.o();
        Object r10 = this.r.r();
        byte[] bArr2 = this.m;
        e eVar = new e(this.c, mVar, 3, uVar, o4, r10, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = m0.b;
        }
        eVar.s = bArr2;
        return eVar;
    }
}
