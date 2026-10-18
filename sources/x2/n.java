package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.a0;
import b2.p1;
import b2.r1;
import b2.t1;
import b2.w;
import e2.m0;
import e9.b0;
import e9.n0;
import e9.v1;
import e9.x1;
import e9.y;
import i2.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.lg0;
import u2.q1;
import v7.b8;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class n extends s {
    public static final v1 l = new y(new lg0(18));
    public final Object d;
    public final Context e;
    public final oa.d f;
    public i g;
    public Thread h;
    public z2.d i;
    public b2.f j;
    public Boolean k;

    public n(Context context, oa.d dVar) {
        i iVar = i.F0;
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = dVar;
        if (iVar != null) {
            this.g = iVar;
        } else {
            iVar.getClass();
            h hVar = new h(iVar);
            hVar.d(iVar);
            this.g = new i(hVar);
        }
        this.j = b2.f.i;
        if (this.g.A0 && context == null) {
            e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int c(w wVar, n0 n0Var) {
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            for (int i11 = 0; i11 < wVar.c.size(); i11++) {
                if (((a0) wVar.c.get(i11)).b.equals(n0Var.get(i10))) {
                    return i10;
                }
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static void d(r rVar, i iVar, o[] oVarArr) {
        int i10 = rVar.a;
        for (int i11 = 0; i11 < i10; i11++) {
            q1 q1Var = rVar.c[i11];
            Map map = (Map) iVar.D0.get(i11);
            if (map != null && map.containsKey(q1Var)) {
                Map map2 = (Map) iVar.D0.get(i11);
                if (map2 != null && map2.get(q1Var) != null) {
                    throw new ClassCastException();
                }
                oVarArr[i11] = null;
            }
        }
    }

    public static void e(r rVar, i iVar, o[] oVarArr) {
        for (int i10 = 0; i10 < rVar.a; i10++) {
            int i11 = rVar.b[i10];
            if (iVar.E0.get(i10) || iVar.I.contains(Integer.valueOf(i11))) {
                oVarArr[i10] = null;
            }
        }
    }

    public static void f(r rVar, i iVar, o[] oVarArr) {
        int i10 = rVar.a;
        q1[] q1VarArr = rVar.c;
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            g(q1VarArr[i11], iVar, hashMap);
        }
        g(rVar.f, iVar, hashMap);
        for (int i12 = 0; i12 < i10; i12++) {
            b2.q1 q1Var = (b2.q1) hashMap.get(Integer.valueOf(rVar.b[i12]));
            if (q1Var != null) {
                p1 p1Var = q1Var.a;
                n0 n0Var = q1Var.b;
                oVarArr[i12] = (n0Var.isEmpty() || q1VarArr[i12].b(p1Var) == -1) ? null : new o(p1Var, b8.f(n0Var));
            }
        }
    }

    public static void g(q1 q1Var, t1 t1Var, HashMap hashMap) {
        for (int i10 = 0; i10 < q1Var.a; i10++) {
            b2.q1 q1Var2 = (b2.q1) t1Var.H.get(q1Var.a(i10));
            if (q1Var2 != null) {
                p1 p1Var = q1Var2.a;
                b2.q1 q1Var3 = (b2.q1) hashMap.get(Integer.valueOf(p1Var.c));
                if (q1Var3 == null || (q1Var3.b.isEmpty() && !q1Var2.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(p1Var.c), q1Var2);
                }
            }
        }
    }

    public static Pair h(o[] oVarArr, int i10) {
        for (int i11 = 0; i11 < oVarArr.length; i11++) {
            o oVar = oVarArr[i11];
            if (oVar != null && oVar.a.c == i10) {
                return Pair.create(oVar, Integer.valueOf(i11));
            }
        }
        return null;
    }

    public static int i(w wVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(wVar.d)) {
            return 4;
        }
        String l4 = l(str);
        String l10 = l(wVar.d);
        if (l10 == null || l4 == null) {
            return (z10 && l10 == null) ? 1 : 0;
        }
        if (l10.startsWith(l4) || l4.startsWith(l10)) {
            return 3;
        }
        String str2 = m0.a;
        return l10.split("-", 2)[0].equals(l4.split("-", 2)[0]) ? 2 : 0;
    }

    public static String l(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, TranslateController.UNKNOWN_LANGUAGE)) {
            return null;
        }
        return str;
    }

    public static boolean n(i iVar, int i10, w wVar) {
        if ((i10 & 3584) == 0) {
            return false;
        }
        r1 r1Var = iVar.w;
        if (r1Var.c && (i10 & 2048) == 0) {
            return false;
        }
        if (r1Var.b) {
            boolean z10 = (wVar.N == 0 && wVar.O == 0) ? false : true;
            boolean z11 = (i10 & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static o o(q1 q1Var, int[][] iArr, i iVar) {
        if (iVar.w.a != 2) {
            int i10 = 0;
            p1 p1Var = null;
            g gVar = null;
            for (int i11 = 0; i11 < q1Var.a; i11++) {
                p1 a2 = q1Var.a(i11);
                int[] iArr2 = iArr[i11];
                for (int i12 = 0; i12 < a2.a; i12++) {
                    if (i2.d.e(iArr2[i12], iVar.B0)) {
                        g gVar2 = new g(a2.d[i12], iArr2[i12]);
                        if (gVar != null) {
                            if (b0.a.c(gVar2.b, gVar.b).c(gVar2.a, gVar.a).e() <= 0) {
                            }
                        }
                        p1Var = a2;
                        i10 = i12;
                        gVar = gVar2;
                    }
                }
            }
            if (p1Var != null) {
                return new o(p1Var, i10);
            }
        }
        return null;
    }

    public static Pair p(int i10, r rVar, int[][][] iArr, k kVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        r rVar2 = rVar;
        ArrayList arrayList = new ArrayList();
        int i12 = rVar2.a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == rVar2.b[i13]) {
                q1 q1Var = rVar2.c[i13];
                for (int i14 = 0; i14 < q1Var.a; i14++) {
                    p1 a2 = q1Var.a(i14);
                    x1 b10 = kVar.b(i13, a2, iArr[i13][i14]);
                    int i15 = a2.a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        l lVar = (l) b10.get(i16);
                        int a10 = lVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = n0.y(lVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(lVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    l lVar2 = (l) b10.get(i17);
                                    int i18 = i12;
                                    if (lVar2.a() == 2 && lVar.b(lVar2)) {
                                        arrayList2.add(lVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                randomAccess = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccess);
                        }
                        i16++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            rVar2 = rVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((l) list.get(i19)).c;
        }
        l lVar3 = (l) list.get(0);
        return Pair.create(new o(lVar3.b, iArr2), Integer.valueOf(lVar3.a));
    }

    @Override // x2.s
    public final void a() {
        z2.d dVar;
        synchronized (this.d) {
            try {
                Thread thread = this.h;
                if (thread != null) {
                    u6.o("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
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

    @Override // x2.s
    public final void b(t1 t1Var) {
        if (t1Var instanceof i) {
            q((i) t1Var);
        }
        h hVar = new h(j());
        hVar.d(t1Var);
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
        q0 q0Var;
        z2.d dVar;
        synchronized (this.d) {
            try {
                z10 = this.g.A0 && Build.VERSION.SDK_INT >= 32 && (dVar = this.i) != null && dVar.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (q0Var = this.a) == null) {
            return;
        }
        q0Var.n.f(10);
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
            e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        q0 q0Var = this.a;
        if (q0Var != null) {
            q0Var.n.f(10);
        }
    }
}
