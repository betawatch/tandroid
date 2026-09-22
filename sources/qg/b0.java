package qg;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.au0;
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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03e4, code lost:
    
        if (r13 < 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x042b, code lost:
    
        if (r10 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x044e, code lost:
    
        if (r10 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0408, code lost:
    
        if (r13 > 0) goto L122;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int R;
        int i10;
        int i11;
        e9.l lVar = null;
        int i12 = 3;
        switch (this.a) {
            case 0:
                j jVar = ((au0) this.b).S0;
                if (jVar instanceof x2) {
                    ((x2) jVar).getEditText();
                    return;
                }
                return;
            case 1:
                rg.s0 s0Var = (rg.s0) this.b;
                ArrayList arrayList = s0Var.g3;
                if (s0Var.n3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((rg.n1) hg.c.h(1, arrayList))) >= 0) {
                        View m10 = s0Var.Y2.m(R + 1);
                        if (m10 != null) {
                            s0Var.d3 = false;
                            s0Var.w1(m10, true);
                            s0Var.v0(0, m10.getTop() - ((s0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    s0Var.x1();
                    return;
                }
                return;
            case 2:
                s4.y yVar = (s4.y) this.b;
                s4.v vVar = yVar.x;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = yVar.R;
                    long j10 = j3 != Long.MIN_VALUE ? currentTimeMillis - j3 : 0L;
                    s4.o0 layoutManager = yVar.H.getLayoutManager();
                    if (yVar.Q == null) {
                        yVar.Q = new Rect();
                    }
                    layoutManager.c(yVar.c.a, yVar.Q);
                    if (layoutManager.d()) {
                        int i13 = (int) (yVar.s + yVar.n);
                        i10 = (i13 - yVar.Q.left) - yVar.H.getPaddingLeft();
                        float f7 = yVar.n;
                        if (f7 < 0.0f) {
                        }
                        if (f7 > 0.0f) {
                            i10 = ((yVar.c.a.getWidth() + i13) + yVar.Q.right) - (yVar.H.getWidth() - yVar.H.getPaddingRight());
                            break;
                        }
                    }
                    i10 = 0;
                    if (layoutManager.e()) {
                        int i14 = (int) (yVar.v + yVar.r);
                        i11 = (i14 - yVar.Q.top) - yVar.H.getPaddingTop();
                        float f10 = yVar.r;
                        if (f10 < 0.0f) {
                        }
                        if (f10 > 0.0f) {
                            i11 = ((yVar.c.a.getHeight() + i14) + yVar.Q.bottom) - (yVar.H.getHeight() - yVar.H.getPaddingBottom());
                            break;
                        }
                    }
                    i11 = 0;
                    if (i10 != 0) {
                        int width = yVar.c.a.getWidth();
                        yVar.H.getWidth();
                        i10 = vVar.i(width, i10, j10);
                    }
                    if (i11 != 0) {
                        int height = yVar.c.a.getHeight();
                        yVar.H.getHeight();
                        i11 = vVar.i(height, i11, j10);
                    }
                    if (i10 == 0 && i11 == 0) {
                        yVar.R = Long.MIN_VALUE;
                        return;
                    }
                    if (yVar.R == Long.MIN_VALUE) {
                        yVar.R = currentTimeMillis;
                    }
                    yVar.H.scrollBy(i10, i11);
                    s4.c1 c1Var = yVar.c;
                    if (c1Var != null) {
                        yVar.n(c1Var);
                    }
                    yVar.H.removeCallbacks(yVar.I);
                    RecyclerView recyclerView = yVar.H;
                    WeakHashMap weakHashMap = r0.i0.a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                tg.a1 a1Var = (tg.a1) this.b;
                String str = a1Var.n0;
                if (str != null) {
                    a1Var.T(a1Var.r0, str, false);
                    return;
                }
                return;
            case 4:
                tg.n1 n1Var = (tg.n1) this.b;
                String str2 = n1Var.o0;
                if (str2 != null) {
                    tg.n1.U(n1Var, str2);
                    return;
                }
                return;
            case 5:
                u0.d dVar = (u0.d) this.b;
                m.r1 r1Var = dVar.c;
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
                    long j11 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    dVar.G.scrollListBy((int) (j11 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 6:
                ((ThreadLocal) ((com.google.firebase.messaging.t) this.b).e).set(Boolean.TRUE);
                return;
            case 7:
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
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new x7.b(fVar, next, list, null) : new e9.l(fVar, next, list, (e9.l) null));
                        Collections.sort(arrayList2);
                        z6 z6Var = new z6();
                        int size = arrayList2.size();
                        long j12 = 0;
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj2 = arrayList2.get(i15);
                            i15++;
                            j12 = ((Long) obj2).longValue() + j12;
                        }
                        z6Var.c = Long.valueOf((j12 / arrayList2.size()) & Long.MAX_VALUE);
                        z6Var.a = Long.valueOf(fa.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        z6Var.f = Long.valueOf(fa.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        z6Var.e = Long.valueOf(fa.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        z6Var.d = Long.valueOf(fa.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        z6Var.b = Long.valueOf(fa.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        a7 a7Var = new a7(z6Var);
                        int size2 = arrayList2.size();
                        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
                        nVar.c = m7.b;
                        v7.r1 r1Var2 = new v7.r1(7, false);
                        r1Var2.d = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        r1Var2.b = (x7.r0) next;
                        r1Var2.c = a7Var;
                        nVar.f = new x7.s0(r1Var2);
                        qb.m.a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a(nVar, 0), o7Var, faVar.b(), 7));
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 8:
                ((y2.k) this.b).b();
                return;
            case 9:
                for (Thread thread : yf.e.w.keySet()) {
                    if (!thread.isAlive()) {
                        yf.e.w.remove(thread);
                    }
                }
                if (yf.e.w.isEmpty()) {
                    yf.e.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((yf.e) this.b).p, 5000L);
                    return;
                }
            case 10:
                yf.x xVar = (yf.x) this.b;
                if (xVar.F.get()) {
                    xVar.invalidate();
                    xVar.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 11:
                z4.g gVar = (z4.g) this.b;
                gVar.setScrollState(0);
                gVar.s();
                return;
            default:
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
                            obj3 = new ArrayList(i12);
                        }
                        List list2 = (List) obj3;
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new de(lgVar, next2, list2, lVar) : new e9.l(lgVar, next2, list2, lVar));
                        Collections.sort(arrayList3);
                        z6 z6Var2 = new z6();
                        int size3 = arrayList3.size();
                        long j13 = 0;
                        int i16 = 0;
                        while (i16 < size3) {
                            Object obj4 = arrayList3.get(i16);
                            i16++;
                            j13 = ((Long) obj4).longValue() + j13;
                        }
                        hb hbVar2 = hbVar;
                        z6Var2.c = Long.valueOf((j13 / arrayList3.size()) & Long.MAX_VALUE);
                        z6Var2.a = Long.valueOf(wf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        z6Var2.f = Long.valueOf(wf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        z6Var2.e = Long.valueOf(wf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        z6Var2.d = Long.valueOf(wf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        z6Var2.b = Long.valueOf(wf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(z6Var2);
                        int size4 = arrayList3.size();
                        p3 p3Var = new p3();
                        p3Var.c = fb.b;
                        v7.r1 r1Var3 = new v7.r1(13, false);
                        r1Var3.d = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        r1Var3.b = (z7.i1) next2;
                        r1Var3.c = maVar;
                        p3Var.h = new z7.j1(r1Var3);
                        wf wfVar2 = wfVar;
                        qb.m.a.execute(new com.google.android.gms.internal.cast.p(wfVar2, new a5.a(p3Var, 0), hbVar2, wfVar.c(), 8));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        lVar = null;
                        i12 = 3;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b0(wf wfVar) {
        this.a = 12;
        hb hbVar = hb.b;
        this.b = wfVar;
    }
}
