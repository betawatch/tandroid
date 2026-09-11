package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.l1;
import b2.m1;
import b2.q1;
import e2.d0;
import e9.a1;
import e9.i0;
import e9.w;
import e9.y0;
import i2.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.f11;
import u2.o1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class p extends u {
    public static final y0 l = new w(new f11(13));
    public final Object d;
    public final Context e;
    public final rb.a f;
    public i g;
    public Thread h;
    public k i;
    public b2.e j;
    public Boolean k;

    public p(Context context, rb.a aVar) {
        i iVar = i.x0;
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = aVar;
        if (iVar != null) {
            this.g = iVar;
        } else {
            iVar.getClass();
            h hVar = new h(iVar);
            hVar.d(iVar);
            this.g = new i(hVar);
        }
        this.j = b2.e.h;
        if (this.g.s0 && context == null) {
            e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(o1 o1Var, i iVar, HashMap hashMap) {
        for (int i10 = 0; i10 < o1Var.a; i10++) {
            m1 m1Var = (m1) iVar.D.get(o1Var.a(i10));
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

    public static boolean i(i iVar, int i10, b2.s sVar) {
        if ((i10 & 3584) == 0) {
            return false;
        }
        b2.o1 o1Var = iVar.u;
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

    public static Pair j(int i10, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i12 = tVar2.a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == tVar2.b[i13]) {
                o1 o1Var = tVar2.c[i13];
                for (int i14 = 0; i14 < o1Var.a; i14++) {
                    l1 a2 = o1Var.a(i14);
                    a1 b10 = mVar.b(i13, a2, iArr[i13][i14]);
                    int i15 = a2.a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) b10.get(i16);
                        int a10 = nVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = i0.z(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    n nVar2 = (n) b10.get(i17);
                                    int i18 = i12;
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
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
            tVar2 = tVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((n) list.get(i19)).c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(nVar3.b, iArr2), Integer.valueOf(nVar3.a));
    }

    @Override // x2.u
    public final void a() {
        k kVar;
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
        if (Build.VERSION.SDK_INT >= 32 && (kVar = this.i) != null) {
            kVar.d();
            this.i = null;
        }
        this.a = null;
        this.b = null;
    }

    @Override // x2.u
    public final void b(q1 q1Var) {
        if (q1Var instanceof i) {
            k((i) q1Var);
        }
        h hVar = new h(e());
        hVar.d(q1Var);
        k(new i(hVar));
    }

    public final i e() {
        i iVar;
        synchronized (this.d) {
            iVar = this.g;
        }
        return iVar;
    }

    public final void f() {
        boolean z10;
        o0 o0Var;
        k kVar;
        synchronized (this.d) {
            try {
                z10 = this.g.s0 && Build.VERSION.SDK_INT >= 32 && (kVar = this.i) != null && kVar.b;
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

    public final void k(i iVar) {
        boolean equals;
        iVar.getClass();
        synchronized (this.d) {
            equals = this.g.equals(iVar);
            this.g = iVar;
        }
        if (equals) {
            return;
        }
        if (iVar.s0 && this.e == null) {
            e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        o0 o0Var = this.a;
        if (o0Var != null) {
            o0Var.n.e(10);
        }
    }
}
