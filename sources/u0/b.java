package u0;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import jb.m;
import jg.g3;
import m.p3;
import m.r1;
import org.telegram.tgnet.ConnectionsManager;
import r0.h0;
import vh.s7;
import x7.a7;
import x7.ga;
import x7.m7;
import x7.o7;
import x7.r0;
import x7.s0;
import x7.z6;
import xa.n;
import z7.de;
import z7.ed;
import z7.fb;
import z7.hb;
import z7.i1;
import z7.j1;
import z7.ma;
import z7.mg;
import z7.xf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        m mVar = m.a;
        double d = 75.0d;
        double d10 = 100.0d;
        e9.m mVar2 = null;
        int i11 = 3;
        Object obj = this.b;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                r1 r1Var = eVar.c;
                a aVar = eVar.a;
                if (eVar.E) {
                    if (eVar.y) {
                        eVar.y = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.i) || !eVar.e()) {
                        eVar.E = false;
                        return;
                    }
                    if (eVar.D) {
                        eVar.D = false;
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
                    long j10 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    eVar.G.scrollListBy((int) (j10 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = h0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                jg.j jVar = ((s7) obj).s0;
                if (jVar instanceof g3) {
                    ((g3) jVar).getEditText();
                    return;
                }
                return;
            case 2:
                ga gaVar = (ga) obj;
                HashMap hashMap = gaVar.j;
                o7 o7Var = o7.f;
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
                        Object obj2 = (Collection) fVar.c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list instanceof RandomAccess ? new x7.b(fVar, next, list, null) : new e9.m(fVar, next, list, (e9.m) null));
                        Collections.sort(arrayList);
                        z6 z6Var = new z6();
                        int size = arrayList.size();
                        long j11 = 0;
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj3 = arrayList.get(i12);
                            i12++;
                            j11 = ((Long) obj3).longValue() + j11;
                        }
                        z6Var.c = Long.valueOf((j11 / arrayList.size()) & Long.MAX_VALUE);
                        z6Var.a = Long.valueOf(ga.a(arrayList, d10) & Long.MAX_VALUE);
                        z6Var.f = Long.valueOf(ga.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        z6Var.e = Long.valueOf(ga.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        z6Var.d = Long.valueOf(ga.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        z6Var.b = Long.valueOf(ga.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        a7 a7Var = new a7(z6Var);
                        int size2 = arrayList.size();
                        j2.f fVar4 = new j2.f();
                        fVar4.c = m7.b;
                        q5.d dVar = new q5.d(19, false);
                        dVar.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        dVar.b = (r0) next;
                        dVar.d = a7Var;
                        fVar4.f = new s0(dVar);
                        mVar.execute(new o(gaVar, new a5.a(fVar4, 0), o7Var, gaVar.b(), 7));
                        d10 = 100.0d;
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 3:
                ((ThreadLocal) ((n) obj).d).set(Boolean.TRUE);
                return;
            case 4:
                ((y2.j) obj).b();
                return;
            case 5:
                z4.g gVar = (z4.g) obj;
                gVar.setScrollState(0);
                gVar.s();
                return;
            default:
                xf xfVar = (xf) obj;
                hb hbVar = hb.N1;
                HashMap hashMap2 = xfVar.j;
                mg mgVar = (mg) hashMap2.get(hbVar);
                if (mgVar != null) {
                    mg mgVar2 = mgVar;
                    ed edVar = mgVar2.a;
                    if (edVar == null) {
                        mg mgVar3 = mgVar2;
                        ed edVar2 = new ed(mgVar3, mgVar3.c);
                        mgVar2.a = edVar2;
                        edVar = edVar2;
                    }
                    Iterator it2 = edVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj4 = (Collection) mgVar.c.get(next2);
                        if (obj4 == null) {
                            obj4 = new ArrayList(i11);
                        }
                        List list2 = (List) obj4;
                        ArrayList arrayList2 = new ArrayList(list2 instanceof RandomAccess ? new de(mgVar, next2, list2, mVar2) : new e9.m(mgVar, next2, list2, mVar2));
                        Collections.sort(arrayList2);
                        z6 z6Var2 = new z6();
                        int size3 = arrayList2.size();
                        long j12 = 0;
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj5 = arrayList2.get(i13);
                            i13++;
                            j12 = ((Long) obj5).longValue() + j12;
                        }
                        z6Var2.c = Long.valueOf((j12 / arrayList2.size()) & Long.MAX_VALUE);
                        z6Var2.a = Long.valueOf(xf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        z6Var2.f = Long.valueOf(xf.a(arrayList2, d) & Long.MAX_VALUE);
                        z6Var2.e = Long.valueOf(xf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        z6Var2.d = Long.valueOf(xf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        z6Var2.b = Long.valueOf(xf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(z6Var2);
                        int size4 = arrayList2.size();
                        p3 p3Var = new p3();
                        p3Var.c = fb.b;
                        q5.d dVar2 = new q5.d(27, false);
                        dVar2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        dVar2.b = (i1) next2;
                        dVar2.d = maVar;
                        p3Var.h = new j1(dVar2);
                        xf xfVar2 = xfVar;
                        mVar.execute(new o(xfVar2, new a5.a(p3Var, 0), hbVar, xfVar.c(), 8));
                        xfVar = xfVar2;
                        d = 75.0d;
                        mVar2 = null;
                        i11 = 3;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b(xf xfVar) {
        this.a = 6;
        hb hbVar = hb.b;
        this.b = xfVar;
    }
}
