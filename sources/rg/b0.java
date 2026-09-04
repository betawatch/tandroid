package rg;

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
import org.telegram.ui.zt0;
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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0496, code lost:
    
        if (r11 > 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x044f, code lost:
    
        if (r10 > 0) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        s4.c1 c1Var;
        int R;
        e9.l lVar = null;
        int i12 = 3;
        switch (this.a) {
            case 0:
                k kVar = ((zt0) this.b).S0;
                if (kVar instanceof x2) {
                    ((x2) kVar).getEditText();
                    return;
                }
                return;
            case 1:
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
                        int paddingLeft = (i13 - yVar.Q.left) - yVar.H.getPaddingLeft();
                        float f7 = yVar.n;
                        if (f7 >= 0.0f || paddingLeft >= 0) {
                            if (f7 > 0.0f) {
                                i10 = ((yVar.c.a.getWidth() + i13) + yVar.Q.right) - (yVar.H.getWidth() - yVar.H.getPaddingRight());
                                break;
                            }
                        } else {
                            i10 = paddingLeft;
                        }
                        if (layoutManager.e()) {
                            int i14 = (int) (yVar.v + yVar.r);
                            int paddingTop = (i14 - yVar.Q.top) - yVar.H.getPaddingTop();
                            float f10 = yVar.r;
                            if (f10 >= 0.0f || paddingTop >= 0) {
                                if (f10 > 0.0f) {
                                    i11 = ((yVar.c.a.getHeight() + i14) + yVar.Q.bottom) - (yVar.H.getHeight() - yVar.H.getPaddingBottom());
                                    break;
                                }
                            } else {
                                i11 = paddingTop;
                            }
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
                            if (i10 != 0 && i11 == 0) {
                                yVar.R = Long.MIN_VALUE;
                                return;
                            }
                            if (yVar.R == Long.MIN_VALUE) {
                                yVar.R = currentTimeMillis;
                            }
                            yVar.H.scrollBy(i10, i11);
                            c1Var = yVar.c;
                            if (c1Var != null) {
                                yVar.n(c1Var);
                            }
                            yVar.H.removeCallbacks(yVar.I);
                            RecyclerView recyclerView = yVar.H;
                            WeakHashMap weakHashMap = r0.i0.a;
                            recyclerView.postOnAnimation(this);
                            return;
                        }
                        i11 = 0;
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (yVar.R == Long.MIN_VALUE) {
                        }
                        yVar.H.scrollBy(i10, i11);
                        c1Var = yVar.c;
                        if (c1Var != null) {
                        }
                        yVar.H.removeCallbacks(yVar.I);
                        RecyclerView recyclerView2 = yVar.H;
                        WeakHashMap weakHashMap2 = r0.i0.a;
                        recyclerView2.postOnAnimation(this);
                        return;
                    }
                    i10 = 0;
                    if (layoutManager.e()) {
                    }
                    i11 = 0;
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (yVar.R == Long.MIN_VALUE) {
                    }
                    yVar.H.scrollBy(i10, i11);
                    c1Var = yVar.c;
                    if (c1Var != null) {
                    }
                    yVar.H.removeCallbacks(yVar.I);
                    RecyclerView recyclerView22 = yVar.H;
                    WeakHashMap weakHashMap22 = r0.i0.a;
                    recyclerView22.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                sg.u0 u0Var = (sg.u0) this.b;
                ArrayList arrayList = u0Var.g3;
                if (u0Var.n3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((sg.r1) i2.g.h(1, arrayList))) >= 0) {
                        View m10 = u0Var.Y2.m(R + 1);
                        if (m10 != null) {
                            u0Var.d3 = false;
                            u0Var.v1(m10, true);
                            u0Var.v0(0, m10.getTop() - ((u0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    u0Var.w1();
                    return;
                }
                return;
            case 3:
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
                    WeakHashMap weakHashMap3 = r0.i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                ug.a1 a1Var = (ug.a1) this.b;
                String str = a1Var.n0;
                if (str != null) {
                    a1Var.T(a1Var.r0, str, false);
                    return;
                }
                return;
            case 5:
                ug.n1 n1Var = (ug.n1) this.b;
                String str2 = n1Var.o0;
                if (str2 != null) {
                    ug.n1.U(n1Var, str2);
                    return;
                }
                return;
            case 6:
                ((ThreadLocal) ((com.google.firebase.messaging.s) this.b).e).set(Boolean.TRUE);
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
            case 8:
                ((y2.k) this.b).a();
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
                yf.y yVar2 = (yf.y) this.b;
                if (yVar2.F.get()) {
                    yVar2.invalidate();
                    yVar2.H.postDelayed(this, 300L);
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
                        a6 a6Var2 = new a6(11, false);
                        a6Var2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        a6Var2.b = (z7.i1) next2;
                        a6Var2.d = maVar;
                        p3Var.h = new z7.j1(a6Var2);
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
