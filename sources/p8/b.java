package p8;

import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.p;
import com.google.firebase.messaging.n;
import com.google.firebase.messaging.t;
import e9.l;
import hg.k0;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import m.p3;
import m.r1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.pa;
import org.telegram.ui.au0;
import org.telegram.ui.web.u0;
import pg.c1;
import pg.d;
import pg.e1;
import pg.f1;
import pg.s0;
import qb.m;
import qg.j;
import qg.u2;
import r0.i0;
import rg.n1;
import s4.o0;
import s4.v;
import s4.y;
import tg.m1;
import tg.z0;
import w7.n6;
import x7.a7;
import x7.f;
import x7.fa;
import x7.m7;
import x7.o7;
import x7.r0;
import x7.z6;
import y2.k;
import yf.e;
import z4.g;
import z7.de;
import z7.ed;
import z7.fb;
import z7.hb;
import z7.i1;
import z7.j1;
import z7.lg;
import z7.ma;
import z7.wf;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        float f7;
        float f10;
        int i10;
        c1 c1Var = (c1) this.b;
        if (!c1Var.f || c1Var.y.y) {
            return;
        }
        c1.b(c1Var);
        GLES20.glBindFramebuffer(36160, 0);
        c1 c1Var2 = (c1) this.b;
        GLES20.glViewport(0, 0, c1Var2.n, c1Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        s0 s0Var = ((c1) this.b).y.c;
        if (s0Var.r != null) {
            if (s0Var.D != null && s0Var.F != null && s0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                f1 f1Var = (f1) s0Var.r.get("videoBlur");
                if (f1Var != null) {
                    GLES20.glUseProgram(f1Var.a);
                    GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(s0Var.y));
                    GLES20.glUniform1f(f1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, s0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(f1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    pa paVar = s0Var.F.m;
                    GLES20.glBindTexture(3553, paVar != null ? paVar.s[2] : -1);
                    if (s0Var.b == null || !(s0Var.i instanceof d)) {
                        GLES20.glUniform1f(f1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(f1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(f1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, s0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) s0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) s0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (s0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (s0Var.b != null) {
                s0Var.n(s0Var.g(), s0Var.b, (1.0f - (s0Var.I * 0.5f)) - (s0Var.J * 0.5f));
            } else if (s0Var.c != null) {
                s0Var.o(s0Var.j(), s0Var.g(), s0Var.c, 1.0f);
            } else {
                int j3 = s0Var.j();
                f7 = 0.0f;
                f1 f1Var2 = (f1) s0Var.r.get(s0Var.G ? "maskingBlit" : "blit");
                if (j3 != 0 && f1Var2 != null) {
                    GLES20.glUseProgram(f1Var2.a);
                    f10 = 0.5f;
                    GLES20.glUniformMatrix4fv(f1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(s0Var.y));
                    GLES20.glUniform1f(f1Var2.d("alpha"), 1.0f);
                    if (s0Var.G) {
                        GLES20.glUniform1i(f1Var2.d("texture"), 1);
                        GLES20.glUniform1i(f1Var2.d("mask"), 0);
                        GLES20.glUniform1f(f1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, s0Var.l.c());
                    } else {
                        GLES20.glUniform1i(f1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) s0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) s0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    n6.a();
                    i10 = s0Var.q;
                    if (i10 != 0 && s0Var.d != null && s0Var.I > f7) {
                        s0Var.o(i10, s0Var.g(), s0Var.d, (s0Var.J * f10) + (s0Var.I * f10));
                    }
                }
                f10 = 0.5f;
                i10 = s0Var.q;
                if (i10 != 0) {
                    s0Var.o(i10, s0Var.g(), s0Var.d, (s0Var.J * f10) + (s0Var.I * f10));
                }
            }
            f7 = 0.0f;
            f10 = 0.5f;
            i10 = s0Var.q;
            if (i10 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        c1 c1Var3 = (c1) this.b;
        c1Var3.b.eglSwapBuffers(c1Var3.c, c1Var3.e);
        e1 e1Var = ((c1) this.b).y;
        if (!e1Var.s) {
            e1Var.s = true;
            AndroidUtilities.runOnUIThread(new u0(this, 11));
        }
        if (((c1) this.b).h) {
            return;
        }
        ((c1) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03e5, code lost:
    
        if (r13 < 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0409, code lost:
    
        if (r13 > 0) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0493  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int S;
        int i10;
        int i11;
        s4.c1 c1Var;
        l lVar = null;
        int i12 = 3;
        switch (this.a) {
            case 0:
                a aVar = (a) this.b;
                synchronized (aVar.a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
                a();
                return;
            case 2:
                j jVar = ((au0) this.b).S0;
                if (jVar instanceof u2) {
                    ((u2) jVar).getEditText();
                    return;
                }
                return;
            case 3:
                rg.s0 s0Var = (rg.s0) this.b;
                ArrayList arrayList = s0Var.g3;
                if (s0Var.n3) {
                    if (!arrayList.isEmpty() && (S = RecyclerView.S((n1) k0.g(1, arrayList))) >= 0) {
                        View m10 = s0Var.Y2.m(S + 1);
                        if (m10 != null) {
                            s0Var.d3 = false;
                            s0Var.x1(m10, true);
                            s0Var.w0(0, m10.getTop() - ((s0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    s0Var.y1();
                    return;
                }
                return;
            case 4:
                y yVar = (y) this.b;
                v vVar = yVar.x;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = yVar.R;
                    long j10 = j3 != Long.MIN_VALUE ? currentTimeMillis - j3 : 0L;
                    o0 layoutManager = yVar.H.getLayoutManager();
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
                        int paddingTop = (i14 - yVar.Q.top) - yVar.H.getPaddingTop();
                        float f10 = yVar.r;
                        if ((f10 < 0.0f && paddingTop < 0) || (f10 > 0.0f && (paddingTop = ((yVar.c.a.getHeight() + i14) + yVar.Q.bottom) - (yVar.H.getHeight() - yVar.H.getPaddingBottom())) > 0)) {
                            i11 = paddingTop;
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
                            WeakHashMap weakHashMap = i0.a;
                            recyclerView.postOnAnimation(this);
                            return;
                        }
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
                    WeakHashMap weakHashMap2 = i0.a;
                    recyclerView2.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                z0 z0Var = (z0) this.b;
                String str = z0Var.n0;
                if (str != null) {
                    z0Var.T(z0Var.r0, str, false);
                    return;
                }
                return;
            case 6:
                m1 m1Var = (m1) this.b;
                String str2 = m1Var.o0;
                if (str2 != null) {
                    m1.U(m1Var, str2);
                    return;
                }
                return;
            case 7:
                u0.d dVar = (u0.d) this.b;
                r1 r1Var = dVar.c;
                u0.a aVar2 = dVar.a;
                if (dVar.E) {
                    if (dVar.x) {
                        dVar.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.e = currentAnimationTimeMillis;
                        aVar2.g = -1L;
                        aVar2.f = currentAnimationTimeMillis;
                        aVar2.h = 0.5f;
                    }
                    if ((aVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.g + aVar2.i) || !dVar.e()) {
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
                    if (aVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar2.a(currentAnimationTimeMillis2);
                    long j11 = currentAnimationTimeMillis2 - aVar2.f;
                    aVar2.f = currentAnimationTimeMillis2;
                    dVar.G.scrollListBy((int) (j11 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar2.d));
                    WeakHashMap weakHashMap3 = i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                ((ThreadLocal) ((t) this.b).e).set(Boolean.TRUE);
                return;
            case 9:
                fa faVar = (fa) this.b;
                o7 o7Var = o7.f;
                HashMap hashMap = faVar.j;
                f fVar = (f) hashMap.get(o7Var);
                if (fVar != null) {
                    f fVar2 = fVar;
                    x7.a aVar3 = fVar2.a;
                    if (aVar3 == null) {
                        f fVar3 = fVar2;
                        x7.a aVar4 = new x7.a(fVar3, fVar3.c);
                        fVar2.a = aVar4;
                        aVar3 = aVar4;
                    }
                    Iterator it = aVar3.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj = (Collection) fVar.c.get(next);
                        if (obj == null) {
                            obj = new ArrayList(3);
                        }
                        List list = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new x7.b(fVar, next, list, null) : new l(fVar, next, list, (l) null));
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
                        n nVar = new n();
                        nVar.c = m7.b;
                        v7.r1 r1Var2 = new v7.r1(7, false);
                        r1Var2.d = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        r1Var2.b = (r0) next;
                        r1Var2.c = a7Var;
                        nVar.f = new x7.s0(r1Var2);
                        m.a.execute(new p(faVar, new a5.a(nVar, 0), o7Var, faVar.b(), 7));
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 10:
                ((k) this.b).b();
                return;
            case 11:
                for (Thread thread : e.w.keySet()) {
                    if (!thread.isAlive()) {
                        e.w.remove(thread);
                    }
                }
                if (e.w.isEmpty()) {
                    e.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((e) this.b).p, 5000L);
                    return;
                }
            case 12:
                yf.y yVar2 = (yf.y) this.b;
                if (yVar2.F.get()) {
                    yVar2.invalidate();
                    yVar2.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 13:
                g gVar = (g) this.b;
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
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new de(lgVar, next2, list2, lVar) : new l(lgVar, next2, list2, lVar));
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
                        r1Var3.b = (i1) next2;
                        r1Var3.c = maVar;
                        p3Var.h = new j1(r1Var3);
                        wf wfVar2 = wfVar;
                        hb hbVar2 = hbVar;
                        m.a.execute(new p(wfVar2, new a5.a(p3Var, 0), hbVar2, wfVar.c(), 8));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        hashMap2 = hashMap2;
                        lVar = null;
                        i12 = 3;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b(wf wfVar) {
        this.a = 14;
        hb hbVar = hb.b;
        this.b = wfVar;
    }
}
