package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.b0;
import b2.p1;
import b2.q1;
import b2.s1;
import b2.u1;
import b2.x;
import e2.l0;
import e9.n0;
import e9.v1;
import e9.x1;
import e9.y;
import i2.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ex0;
import u2.r1;
import v7.c8;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o extends t {
    public static final v1 l = new y(new ex0(28));
    public final Object d;
    public final Context e;
    public final t7.u f;
    public j g;
    public Thread h;
    public z2.d i;
    public b2.f j;
    public Boolean k;

    public o(Context context, t7.u uVar) {
        j jVar = j.F0;
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = uVar;
        if (jVar != null) {
            this.g = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.d(jVar);
            this.g = new j(iVar);
        }
        this.j = b2.f.i;
        if (this.g.A0 && context == null) {
            e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int c(x xVar, n0 n0Var) {
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            for (int i11 = 0; i11 < xVar.c.size(); i11++) {
                if (((b0) xVar.c.get(i11)).b.equals(n0Var.get(i10))) {
                    return i10;
                }
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static void d(s sVar, j jVar, p[] pVarArr) {
        int i10 = sVar.a;
        for (int i11 = 0; i11 < i10; i11++) {
            r1 r1Var = sVar.c[i11];
            Map map = (Map) jVar.D0.get(i11);
            if (map != null && map.containsKey(r1Var)) {
                Map map2 = (Map) jVar.D0.get(i11);
                if (map2 != null && map2.get(r1Var) != null) {
                    throw new ClassCastException();
                }
                pVarArr[i11] = null;
            }
        }
    }

    public static void e(s sVar, j jVar, p[] pVarArr) {
        for (int i10 = 0; i10 < sVar.a; i10++) {
            int i11 = sVar.b[i10];
            if (jVar.E0.get(i10) || jVar.I.contains(Integer.valueOf(i11))) {
                pVarArr[i10] = null;
            }
        }
    }

    public static void f(s sVar, j jVar, p[] pVarArr) {
        int i10 = sVar.a;
        r1[] r1VarArr = sVar.c;
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            g(r1VarArr[i11], jVar, hashMap);
        }
        g(sVar.f, jVar, hashMap);
        for (int i12 = 0; i12 < i10; i12++) {
            q1 q1Var = (q1) hashMap.get(Integer.valueOf(sVar.b[i12]));
            if (q1Var != null) {
                p1 p1Var = q1Var.a;
                n0 n0Var = q1Var.b;
                pVarArr[i12] = (n0Var.isEmpty() || r1VarArr[i12].b(p1Var) == -1) ? null : new p(p1Var, c8.f(n0Var));
            }
        }
    }

    public static void g(r1 r1Var, u1 u1Var, HashMap hashMap) {
        for (int i10 = 0; i10 < r1Var.a; i10++) {
            q1 q1Var = (q1) u1Var.H.get(r1Var.a(i10));
            if (q1Var != null) {
                p1 p1Var = q1Var.a;
                q1 q1Var2 = (q1) hashMap.get(Integer.valueOf(p1Var.c));
                if (q1Var2 == null || (q1Var2.b.isEmpty() && !q1Var.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(p1Var.c), q1Var);
                }
            }
        }
    }

    public static Pair h(p[] pVarArr, int i10) {
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            p pVar = pVarArr[i11];
            if (pVar != null && pVar.a.c == i10) {
                return Pair.create(pVar, Integer.valueOf(i11));
            }
        }
        return null;
    }

    public static int i(x xVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(xVar.d)) {
            return 4;
        }
        String l4 = l(str);
        String l10 = l(xVar.d);
        if (l10 == null || l4 == null) {
            return (z10 && l10 == null) ? 1 : 0;
        }
        if (l10.startsWith(l4) || l4.startsWith(l10)) {
            return 3;
        }
        String str2 = l0.a;
        return l10.split("-", 2)[0].equals(l4.split("-", 2)[0]) ? 2 : 0;
    }

    public static String l(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean n(j jVar, int i10, x xVar) {
        if ((i10 & 3584) == 0) {
            return false;
        }
        s1 s1Var = jVar.w;
        if (s1Var.c && (i10 & 2048) == 0) {
            return false;
        }
        if (s1Var.b) {
            boolean z10 = (xVar.N == 0 && xVar.O == 0) ? false : true;
            boolean z11 = (i10 & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static p o(r1 r1Var, int[][] iArr, j jVar) {
        if (jVar.w.a != 2) {
            int i10 = 0;
            p1 p1Var = null;
            h hVar = null;
            for (int i11 = 0; i11 < r1Var.a; i11++) {
                p1 a2 = r1Var.a(i11);
                int[] iArr2 = iArr[i11];
                for (int i12 = 0; i12 < a2.a; i12++) {
                    if (i0.a.b(iArr2[i12], jVar.B0)) {
                        h hVar2 = new h(a2.d[i12], iArr2[i12]);
                        if (hVar != null) {
                            if (e9.b0.a.c(hVar2.b, hVar.b).c(hVar2.a, hVar.a).e() <= 0) {
                            }
                        }
                        p1Var = a2;
                        i10 = i12;
                        hVar = hVar2;
                    }
                }
            }
            if (p1Var != null) {
                return new p(p1Var, i10);
            }
        }
        return null;
    }

    public static Pair p(int i10, s sVar, int[][][] iArr, l lVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        int i12 = sVar2.a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == sVar2.b[i13]) {
                r1 r1Var = sVar2.c[i13];
                for (int i14 = 0; i14 < r1Var.a; i14++) {
                    p1 a2 = r1Var.a(i14);
                    x1 b10 = lVar.b(i13, a2, iArr[i13][i14]);
                    int i15 = a2.a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        m mVar = (m) b10.get(i16);
                        int a10 = mVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = n0.y(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    m mVar2 = (m) b10.get(i17);
                                    int i18 = i12;
                                    if (mVar2.a() == 2 && mVar.b(mVar2)) {
                                        arrayList2.add(mVar2);
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
            sVar2 = sVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((m) list.get(i19)).c;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new p(mVar3.b, iArr2), Integer.valueOf(mVar3.a));
    }

    @Override // x2.t
    public final void a() {
        z2.d dVar;
        synchronized (this.d) {
            try {
                Thread thread = this.h;
                if (thread != null) {
                    t6.o("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
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

    @Override // x2.t
    public final void b(u1 u1Var) {
        if (u1Var instanceof j) {
            q((j) u1Var);
        }
        i iVar = new i(j());
        iVar.d(u1Var);
        q(new j(iVar));
    }

    public final j j() {
        j jVar;
        synchronized (this.d) {
            jVar = this.g;
        }
        return jVar;
    }

    public final void k() {
        boolean z10;
        s0 s0Var;
        z2.d dVar;
        synchronized (this.d) {
            try {
                z10 = this.g.A0 && Build.VERSION.SDK_INT >= 32 && (dVar = this.i) != null && dVar.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (s0Var = this.a) == null) {
            return;
        }
        s0Var.n.f(10);
    }

    public final void m() {
        synchronized (this.d) {
            this.g.getClass();
        }
    }

    public final void q(j jVar) {
        boolean equals;
        jVar.getClass();
        synchronized (this.d) {
            equals = this.g.equals(jVar);
            this.g = jVar;
        }
        if (equals) {
            return;
        }
        if (jVar.A0 && this.e == null) {
            e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        s0 s0Var = this.a;
        if (s0Var != null) {
            s0Var.n.f(10);
        }
    }
}
