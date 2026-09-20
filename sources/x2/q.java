package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.l1;
import b2.m1;
import b2.o1;
import b2.q1;
import e2.d0;
import e9.a1;
import e9.i0;
import e9.y0;
import i2.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.mb1;
import u2.p1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class q extends v {
    public static final y0 l = new e9.w(new mb1(11));
    public final Object d;
    public final Context e;
    public final qb.b f;
    public j g;
    public Thread h;
    public l i;
    public b2.e j;
    public Boolean k;

    public q(Context context, qb.b bVar) {
        j jVar = j.x0;
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = bVar;
        if (jVar != null) {
            this.g = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.d(jVar);
            this.g = new j(iVar);
        }
        this.j = b2.e.h;
        if (this.g.s0 && context == null) {
            e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(p1 p1Var, j jVar, HashMap hashMap) {
        for (int i10 = 0; i10 < p1Var.a; i10++) {
            m1 m1Var = (m1) jVar.D.get(p1Var.a(i10));
            if (m1Var != null) {
                l1 l1Var = m1Var.a;
                m1 m1Var2 = (m1) hashMap.get(Integer.valueOf(l1Var.c));
                if (m1Var2 == null || (m1Var2.b.isEmpty() && !m1Var.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(l1Var.c), m1Var);
                }
            }
        }
    }

    public static int d(b2.s sVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(sVar.d)) {
            return 4;
        }
        String g10 = g(str);
        String g11 = g(sVar.d);
        if (g11 == null || g10 == null) {
            return (z10 && g11 == null) ? 1 : 0;
        }
        if (g11.startsWith(g10) || g10.startsWith(g11)) {
            return 3;
        }
        String str2 = d0.a;
        return g11.split("-", 2)[0].equals(g10.split("-", 2)[0]) ? 2 : 0;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, TranslateController.UNKNOWN_LANGUAGE)) {
            return null;
        }
        return str;
    }

    public static boolean i(j jVar, int i10, b2.s sVar) {
        if ((i10 & 3584) == 0) {
            return false;
        }
        o1 o1Var = jVar.u;
        if (o1Var.c && (i10 & 2048) == 0) {
            return false;
        }
        if (o1Var.b) {
            boolean z10 = (sVar.M == 0 && sVar.N == 0) ? false : true;
            boolean z11 = (i10 & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static Pair j(int i10, u uVar, int[][][] iArr, n nVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i12 = uVar2.a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == uVar2.b[i13]) {
                p1 p1Var = uVar2.c[i13];
                for (int i14 = 0; i14 < p1Var.a; i14++) {
                    l1 a2 = p1Var.a(i14);
                    a1 b10 = nVar.b(i13, a2, iArr[i13][i14]);
                    int i15 = a2.a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        o oVar = (o) b10.get(i16);
                        int a10 = oVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = i0.z(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    o oVar2 = (o) b10.get(i17);
                                    int i18 = i12;
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
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
            uVar2 = uVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((o) list.get(i19)).c;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(oVar3.b, iArr2), Integer.valueOf(oVar3.a));
    }

    @Override // x2.v
    public final void a() {
        l lVar;
        synchronized (this.d) {
            try {
                Thread thread = this.h;
                if (thread != null) {
                    e2.d.f("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (lVar = this.i) != null) {
            lVar.d();
            this.i = null;
        }
        this.a = null;
        this.b = null;
    }

    @Override // x2.v
    public final void b(q1 q1Var) {
        if (q1Var instanceof j) {
            k((j) q1Var);
        }
        i iVar = new i(e());
        iVar.d(q1Var);
        k(new j(iVar));
    }

    public final j e() {
        j jVar;
        synchronized (this.d) {
            jVar = this.g;
        }
        return jVar;
    }

    public final void f() {
        boolean z10;
        o0 o0Var;
        l lVar;
        synchronized (this.d) {
            try {
                z10 = this.g.s0 && Build.VERSION.SDK_INT >= 32 && (lVar = this.i) != null && lVar.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (o0Var = this.a) == null) {
            return;
        }
        o0Var.n.e(10);
    }

    public final void h() {
        synchronized (this.d) {
            this.g.getClass();
        }
    }

    public final void k(j jVar) {
        boolean equals;
        jVar.getClass();
        synchronized (this.d) {
            equals = this.g.equals(jVar);
            this.g = jVar;
        }
        if (equals) {
            return;
        }
        if (jVar.s0 && this.e == null) {
            e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        o0 o0Var = this.a;
        if (o0Var != null) {
            o0Var.n.e(10);
        }
    }
}
