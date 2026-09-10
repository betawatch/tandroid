package sg;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import m.r1;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import v7.a6;
import x7.a7;
import x7.fa;
import x7.m7;
import x7.o7;
import x7.z6;
import z7.de;
import z7.ed;
import z7.fb;
import z7.hb;
import z7.lg;
import z7.ma;
import z7.wf;
import zh.a3;
import zh.g6;
import zh.k7;
import zh.l7;
import zh.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ a1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e9.l lVar = null;
        int i10 = 3;
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.b;
                String str = c1Var.n0;
                if (str != null) {
                    c1Var.T(c1Var.r0, str, false);
                    return;
                }
                return;
            case 1:
                p1 p1Var = (p1) this.b;
                String str2 = p1Var.o0;
                if (str2 != null) {
                    p1.U(p1Var, str2);
                    return;
                }
                return;
            case 2:
                u0.d dVar = (u0.d) this.b;
                r1 r1Var = dVar.c;
                u0.a aVar = dVar.a;
                if (dVar.E) {
                    if (dVar.x) {
                        dVar.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.i) || !dVar.e()) {
                        dVar.E = false;
                        return;
                    }
                    if (dVar.y) {
                        dVar.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    dVar.G.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = r0.i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ((ThreadLocal) ((com.google.firebase.messaging.s) this.b).e).set(Boolean.TRUE);
                return;
            case 4:
                fa faVar = (fa) this.b;
                o7 o7Var = o7.f;
                HashMap hashMap = faVar.j;
                x7.f fVar = (x7.f) hashMap.get(o7Var);
                if (fVar != null) {
                    x7.f fVar2 = fVar;
                    x7.a aVar2 = fVar2.a;
                    if (aVar2 == null) {
                        x7.f fVar3 = fVar2;
                        x7.a aVar3 = new x7.a(fVar3, fVar3.c);
                        fVar2.a = aVar3;
                        aVar2 = aVar3;
                    }
                    Iterator it = aVar2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj = (Collection) fVar.c.get(next);
                        if (obj == null) {
                            obj = new ArrayList(3);
                        }
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(list instanceof RandomAccess ? new x7.b(fVar, next, list, null) : new e9.l(fVar, next, list, (e9.l) null));
                        Collections.sort(arrayList);
                        z6 z6Var = new z6();
                        int size = arrayList.size();
                        long j10 = 0;
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            j10 = ((Long) obj2).longValue() + j10;
                        }
                        z6Var.c = Long.valueOf((j10 / arrayList.size()) & Long.MAX_VALUE);
                        z6Var.a = Long.valueOf(fa.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        z6Var.f = Long.valueOf(fa.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        z6Var.e = Long.valueOf(fa.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        z6Var.d = Long.valueOf(fa.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        z6Var.b = Long.valueOf(fa.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        a7 a7Var = new a7(z6Var);
                        int size2 = arrayList.size();
                        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
                        nVar.c = m7.b;
                        a6 a6Var = new a6(5, false);
                        a6Var.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        a6Var.b = (x7.r0) next;
                        a6Var.d = a7Var;
                        nVar.f = new x7.s0(a6Var);
                        qb.m.a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a(nVar, 0), o7Var, faVar.b(), 7));
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 5:
                for (Thread thread : xf.e.w.keySet()) {
                    if (!thread.isAlive()) {
                        xf.e.w.remove(thread);
                    }
                }
                if (xf.e.w.isEmpty()) {
                    xf.e.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((xf.e) this.b).p, 5000L);
                    return;
                }
            case 6:
                xf.y yVar = (xf.y) this.b;
                if (yVar.F.get()) {
                    yVar.invalidate();
                    yVar.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 7:
                ((y2.l) this.b).b();
                return;
            case 8:
                z4.g gVar = (z4.g) this.b;
                gVar.setScrollState(0);
                gVar.s();
                return;
            case 9:
                wf wfVar = (wf) this.b;
                hb hbVar = hb.N1;
                HashMap hashMap2 = wfVar.j;
                lg lgVar = (lg) hashMap2.get(hbVar);
                if (lgVar != null) {
                    lg lgVar2 = lgVar;
                    ed edVar = lgVar2.a;
                    if (edVar == null) {
                        lg lgVar3 = lgVar2;
                        ed edVar2 = new ed(lgVar3, lgVar3.c);
                        lgVar2.a = edVar2;
                        edVar = edVar2;
                    }
                    Iterator it2 = edVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj3 = (Collection) lgVar.c.get(next2);
                        if (obj3 == null) {
                            obj3 = new ArrayList(i10);
                        }
                        List list2 = (List) obj3;
                        ArrayList arrayList2 = new ArrayList(list2 instanceof RandomAccess ? new de(lgVar, next2, list2, lVar) : new e9.l(lgVar, next2, list2, lVar));
                        Collections.sort(arrayList2);
                        z6 z6Var2 = new z6();
                        int size3 = arrayList2.size();
                        long j11 = 0;
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj4 = arrayList2.get(i12);
                            i12++;
                            j11 = ((Long) obj4).longValue() + j11;
                        }
                        hb hbVar2 = hbVar;
                        z6Var2.c = Long.valueOf((j11 / arrayList2.size()) & Long.MAX_VALUE);
                        z6Var2.a = Long.valueOf(wf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        z6Var2.f = Long.valueOf(wf.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        z6Var2.e = Long.valueOf(wf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        z6Var2.d = Long.valueOf(wf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        z6Var2.b = Long.valueOf(wf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(z6Var2);
                        int size4 = arrayList2.size();
                        r3 r3Var = new r3();
                        r3Var.c = fb.b;
                        a6 a6Var2 = new a6(11, false);
                        a6Var2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        a6Var2.b = (z7.i1) next2;
                        a6Var2.d = maVar;
                        r3Var.h = new z7.j1(a6Var2);
                        wf wfVar2 = wfVar;
                        qb.m.a.execute(new com.google.android.gms.internal.cast.p(wfVar2, new a5.a(r3Var, 0), hbVar2, wfVar.c(), 8));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        lVar = null;
                        i10 = 3;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
            case 10:
                a3 a3Var = (a3) this.b;
                if (a3Var.K1 && a3Var.b1) {
                    u7 u7Var = ((l7) a3Var.Q1).d;
                    u7Var.l1 = false;
                    u7Var.P();
                    return;
                }
                return;
            case 11:
                ((k7) this.b).L0 = false;
                return;
            default:
                g6 g6Var = (g6) this.b;
                g6Var.b = false;
                g6Var.invalidate();
                return;
        }
    }

    public /* synthetic */ a1(wf wfVar) {
        this.a = 9;
        hb hbVar = hb.b;
        this.b = wfVar;
    }
}
