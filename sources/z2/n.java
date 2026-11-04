package z2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b8.od;
import b8.zb;
import d2.o1;
import d2.p1;
import d2.s1;
import d2.v;
import d2.z;
import g2.n0;
import g9.i0;
import g9.q1;
import g9.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import k2.r0;
import org.telegram.tgnet.ConnectionsManager;
import vg.i1;
import w2.r1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n extends s {
    public static final q1 l = new g9.t(new i1(3));
    public final Object d;
    public final Context e;
    public final ra.e f;
    public i g;
    public Thread h;
    public b3.d i;
    public d2.f j;
    public Boolean k;

    public n(Context context, ra.e eVar) {
        i iVar = i.F0;
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = eVar;
        if (iVar != null) {
            this.g = iVar;
        } else {
            iVar.getClass();
            h hVar = new h(iVar);
            hVar.d(iVar);
            this.g = new i(hVar);
        }
        this.j = d2.f.i;
        if (this.g.A0 && context == null) {
            g2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int c(v vVar, i0 i0Var) {
        for (int i3 = 0; i3 < i0Var.size(); i3++) {
            for (int i10 = 0; i10 < vVar.c.size(); i10++) {
                if (((z) vVar.c.get(i10)).b.equals(i0Var.get(i3))) {
                    return i3;
                }
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static void d(r rVar, i iVar, o[] oVarArr) {
        int i3 = rVar.a;
        for (int i10 = 0; i10 < i3; i10++) {
            r1 r1Var = rVar.c[i10];
            Map map = (Map) iVar.D0.get(i10);
            if (map != null && map.containsKey(r1Var)) {
                Map map2 = (Map) iVar.D0.get(i10);
                if (map2 != null && map2.get(r1Var) != null) {
                    throw new ClassCastException();
                }
                oVarArr[i10] = null;
            }
        }
    }

    public static void e(r rVar, i iVar, o[] oVarArr) {
        for (int i3 = 0; i3 < rVar.a; i3++) {
            int i10 = rVar.b[i3];
            if (iVar.E0.get(i3) || iVar.I.contains(Integer.valueOf(i10))) {
                oVarArr[i3] = null;
            }
        }
    }

    public static void f(r rVar, i iVar, o[] oVarArr) {
        int i3 = rVar.a;
        r1[] r1VarArr = rVar.c;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < i3; i10++) {
            g(r1VarArr[i10], iVar, hashMap);
        }
        g(rVar.f, iVar, hashMap);
        for (int i11 = 0; i11 < i3; i11++) {
            p1 p1Var = (p1) hashMap.get(Integer.valueOf(rVar.b[i11]));
            if (p1Var != null) {
                o1 o1Var = p1Var.a;
                i0 i0Var = p1Var.b;
                oVarArr[i11] = (i0Var.isEmpty() || r1VarArr[i11].b(o1Var) == -1) ? null : new o(o1Var, od.f(i0Var));
            }
        }
    }

    public static void g(r1 r1Var, s1 s1Var, HashMap hashMap) {
        for (int i3 = 0; i3 < r1Var.a; i3++) {
            p1 p1Var = (p1) s1Var.H.get(r1Var.a(i3));
            if (p1Var != null) {
                o1 o1Var = p1Var.a;
                p1 p1Var2 = (p1) hashMap.get(Integer.valueOf(o1Var.c));
                if (p1Var2 == null || (p1Var2.b.isEmpty() && !p1Var.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(o1Var.c), p1Var);
                }
            }
        }
    }

    public static Pair h(o[] oVarArr, int i3) {
        for (int i10 = 0; i10 < oVarArr.length; i10++) {
            o oVar = oVarArr[i10];
            if (oVar != null && oVar.a.c == i3) {
                return Pair.create(oVar, Integer.valueOf(i10));
            }
        }
        return null;
    }

    public static int i(v vVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.d)) {
            return 4;
        }
        String l10 = l(str);
        String l11 = l(vVar.d);
        if (l11 == null || l10 == null) {
            return (z10 && l11 == null) ? 1 : 0;
        }
        if (l11.startsWith(l10) || l10.startsWith(l11)) {
            return 3;
        }
        String str2 = n0.a;
        return l11.split("-", 2)[0].equals(l10.split("-", 2)[0]) ? 2 : 0;
    }

    public static String l(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean n(i iVar, int i3, v vVar) {
        if ((i3 & 3584) == 0) {
            return false;
        }
        d2.q1 q1Var = iVar.w;
        if (q1Var.c && (i3 & 2048) == 0) {
            return false;
        }
        if (q1Var.b) {
            boolean z10 = (vVar.N == 0 && vVar.O == 0) ? false : true;
            boolean z11 = (i3 & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static o o(r1 r1Var, int[][] iArr, i iVar) {
        if (iVar.w.a != 2) {
            int i3 = 0;
            o1 o1Var = null;
            g gVar = null;
            for (int i10 = 0; i10 < r1Var.a; i10++) {
                o1 a10 = r1Var.a(i10);
                int[] iArr2 = iArr[i10];
                for (int i11 = 0; i11 < a10.a; i11++) {
                    if (k2.p1.b(iArr2[i11], iVar.B0)) {
                        g gVar2 = new g(a10.d[i11], iArr2[i11]);
                        if (gVar != null) {
                            if (w.a.c(gVar2.b, gVar.b).c(gVar2.a, gVar.a).e() <= 0) {
                            }
                        }
                        o1Var = a10;
                        i3 = i11;
                        gVar = gVar2;
                    }
                }
            }
            if (o1Var != null) {
                return new o(o1Var, i3);
            }
        }
        return null;
    }

    public static Pair p(int i3, r rVar, int[][][] iArr, k kVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccess;
        r rVar2 = rVar;
        ArrayList arrayList = new ArrayList();
        int i11 = rVar2.a;
        int i12 = 0;
        while (i12 < i11) {
            if (i3 == rVar2.b[i12]) {
                r1 r1Var = rVar2.c[i12];
                for (int i13 = 0; i13 < r1Var.a; i13++) {
                    o1 a10 = r1Var.a(i13);
                    g9.s1 c2 = kVar.c(i12, a10, iArr[i12][i13]);
                    int i14 = a10.a;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        l lVar = (l) c2.get(i15);
                        int a11 = lVar.a();
                        if (zArr[i15] || a11 == 0) {
                            i10 = i11;
                        } else {
                            if (a11 == 1) {
                                randomAccess = i0.u(lVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(lVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    l lVar2 = (l) c2.get(i16);
                                    int i17 = i11;
                                    if (lVar2.a() == 2 && lVar.b(lVar2)) {
                                        arrayList2.add(lVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i11 = i17;
                                }
                                randomAccess = arrayList2;
                            }
                            i10 = i11;
                            arrayList.add(randomAccess);
                        }
                        i15++;
                        i11 = i10;
                    }
                }
            }
            i12++;
            rVar2 = rVar;
            i11 = i11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((l) list.get(i18)).c;
        }
        l lVar3 = (l) list.get(0);
        return Pair.create(new o(lVar3.b, iArr2), Integer.valueOf(lVar3.a));
    }

    @Override // z2.s
    public final void a() {
        b3.d dVar;
        synchronized (this.d) {
            try {
                Thread thread = this.h;
                if (thread != null) {
                    zb.o("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.i) != null) {
            dVar.e();
            this.i = null;
        }
        this.a = null;
        this.b = null;
    }

    @Override // z2.s
    public final void b(s1 s1Var) {
        if (s1Var instanceof i) {
            q((i) s1Var);
        }
        h hVar = new h(j());
        hVar.d(s1Var);
        q(new i(hVar));
    }

    public final i j() {
        i iVar;
        synchronized (this.d) {
            iVar = this.g;
        }
        return iVar;
    }

    public final void k() {
        boolean z10;
        r0 r0Var;
        b3.d dVar;
        synchronized (this.d) {
            try {
                z10 = this.g.A0 && Build.VERSION.SDK_INT >= 32 && (dVar = this.i) != null && dVar.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (r0Var = this.a) == null) {
            return;
        }
        r0Var.n.f(10);
    }

    public final void m() {
        synchronized (this.d) {
            this.g.getClass();
        }
    }

    public final void q(i iVar) {
        boolean equals;
        iVar.getClass();
        synchronized (this.d) {
            equals = this.g.equals(iVar);
            this.g = iVar;
        }
        if (equals) {
            return;
        }
        if (iVar.A0 && this.e == null) {
            g2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        r0 r0Var = this.a;
        if (r0Var != null) {
            r0Var.n.f(10);
        }
    }
}
