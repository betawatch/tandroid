package p4;

import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
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
import m.t1;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.gu0;
import qg.a1;
import qg.c1;
import qg.d1;
import rg.x2;
import s4.b1;
import sg.p1;
import ug.m1;
import ug.z0;
import w7.s6;
import x7.a7;
import x7.fa;
import x7.m7;
import x7.o7;
import x7.z6;
import z7.de;
import z7.ed;
import z7.fb;
import z7.hb;
import z7.i1;
import z7.j1;
import z7.ma;
import z7.mg;
import z7.wf;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ s0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        float f7;
        float f10;
        int i10;
        a1 a1Var = (a1) this.b;
        if (!a1Var.f || a1Var.y.y) {
            return;
        }
        a1.b(a1Var);
        GLES20.glBindFramebuffer(36160, 0);
        a1 a1Var2 = (a1) this.b;
        GLES20.glViewport(0, 0, a1Var2.n, a1Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        qg.q0 q0Var = ((a1) this.b).y.c;
        if (q0Var.r != null) {
            if (q0Var.D != null && q0Var.F != null && q0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                d1 d1Var = (d1) q0Var.r.get("videoBlur");
                if (d1Var != null) {
                    GLES20.glUseProgram(d1Var.a);
                    GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.y));
                    GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, q0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(d1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ra raVar = q0Var.F.m;
                    GLES20.glBindTexture(3553, raVar != null ? raVar.s[2] : -1);
                    if (q0Var.b == null || !(q0Var.i instanceof qg.d)) {
                        GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(d1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(d1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, q0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (q0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (q0Var.b != null) {
                q0Var.n(q0Var.g(), q0Var.b, (1.0f - (q0Var.I * 0.5f)) - (q0Var.J * 0.5f));
            } else if (q0Var.c != null) {
                q0Var.o(q0Var.j(), q0Var.g(), q0Var.c, 1.0f);
            } else {
                int j10 = q0Var.j();
                f7 = 0.0f;
                d1 d1Var2 = (d1) q0Var.r.get(q0Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && d1Var2 != null) {
                    GLES20.glUseProgram(d1Var2.a);
                    f10 = 0.5f;
                    GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.y));
                    GLES20.glUniform1f(d1Var2.d("alpha"), 1.0f);
                    if (q0Var.G) {
                        GLES20.glUniform1i(d1Var2.d("texture"), 1);
                        GLES20.glUniform1i(d1Var2.d("mask"), 0);
                        GLES20.glUniform1f(d1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, q0Var.l.c());
                    } else {
                        GLES20.glUniform1i(d1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    s6.a();
                    i10 = q0Var.q;
                    if (i10 != 0 && q0Var.d != null && q0Var.I > f7) {
                        q0Var.o(i10, q0Var.g(), q0Var.d, (q0Var.J * f10) + (q0Var.I * f10));
                    }
                }
                f10 = 0.5f;
                i10 = q0Var.q;
                if (i10 != 0) {
                    q0Var.o(i10, q0Var.g(), q0Var.d, (q0Var.J * f10) + (q0Var.I * f10));
                }
            }
            f7 = 0.0f;
            f10 = 0.5f;
            i10 = q0Var.q;
            if (i10 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        a1 a1Var3 = (a1) this.b;
        a1Var3.b.eglSwapBuffers(a1Var3.c, a1Var3.e);
        c1 c1Var = ((a1) this.b).y;
        if (!c1Var.s) {
            c1Var.s = true;
            AndroidUtilities.runOnUIThread(new r2(this, 17));
        }
        if (((a1) this.b).h) {
            return;
        }
        ((a1) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x044a, code lost:
    
        if (r10 > 0) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        i2.h0 h0Var;
        int i10;
        int i11;
        b1 b1Var;
        int height;
        int R;
        e9.m mVar = null;
        int i12 = 3;
        switch (this.a) {
            case 0:
                ((t0) this.b).c();
                return;
            case 1:
                p8.a aVar = (p8.a) this.b;
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
            case 2:
                a();
                return;
            case 3:
                rg.j jVar = ((gu0) this.b).S0;
                if (jVar instanceof x2) {
                    ((x2) jVar).getEditText();
                    return;
                }
                return;
            case 4:
                ri.r0 r0Var = (ri.r0) this.b;
                if (r0Var.W == 5 && (h0Var = r0Var.S) != null && r0Var.x) {
                    long M0 = h0Var.M0();
                    long j10 = r0Var.G;
                    if (M0 < j10 || M0 >= r0Var.H) {
                        r0Var.S.Z0(5, j10);
                    }
                    r0Var.d.getClass();
                    r0Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 5:
                s4.y yVar = (s4.y) this.b;
                s4.v vVar = yVar.x;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = yVar.R;
                    long j12 = j11 != Long.MIN_VALUE ? currentTimeMillis - j11 : 0L;
                    s4.n0 layoutManager = yVar.H.getLayoutManager();
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
                            if (f10 < 0.0f && paddingTop < 0) {
                                i11 = paddingTop;
                            } else if (f10 > 0.0f && (height = ((yVar.c.a.getHeight() + i14) + yVar.Q.bottom) - (yVar.H.getHeight() - yVar.H.getPaddingBottom())) > 0) {
                                i11 = height;
                            }
                            if (i10 != 0) {
                                int width = yVar.c.a.getWidth();
                                yVar.H.getWidth();
                                i10 = vVar.i(width, i10, j12);
                            }
                            if (i11 != 0) {
                                int height2 = yVar.c.a.getHeight();
                                yVar.H.getHeight();
                                i11 = vVar.i(height2, i11, j12);
                            }
                            if (i10 != 0 && i11 == 0) {
                                yVar.R = Long.MIN_VALUE;
                                return;
                            }
                            if (yVar.R == Long.MIN_VALUE) {
                                yVar.R = currentTimeMillis;
                            }
                            yVar.H.scrollBy(i10, i11);
                            b1Var = yVar.c;
                            if (b1Var != null) {
                                yVar.n(b1Var);
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
                        b1Var = yVar.c;
                        if (b1Var != null) {
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
                    b1Var = yVar.c;
                    if (b1Var != null) {
                    }
                    yVar.H.removeCallbacks(yVar.I);
                    RecyclerView recyclerView22 = yVar.H;
                    WeakHashMap weakHashMap22 = r0.i0.a;
                    recyclerView22.postOnAnimation(this);
                    return;
                }
                return;
            case 6:
                sg.t0 t0Var = (sg.t0) this.b;
                ArrayList arrayList = t0Var.e3;
                if (t0Var.l3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((p1) i2.d.h(1, arrayList))) >= 0) {
                        View m10 = t0Var.W2.m(R + 1);
                        if (m10 != null) {
                            t0Var.b3 = false;
                            t0Var.x1(m10, true);
                            t0Var.v0(0, m10.getTop() - ((t0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    t0Var.y1();
                    return;
                }
                return;
            case 7:
                u0.d dVar = (u0.d) this.b;
                t1 t1Var = dVar.c;
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
                        t1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar2.a(currentAnimationTimeMillis2);
                    long j13 = currentAnimationTimeMillis2 - aVar2.f;
                    aVar2.f = currentAnimationTimeMillis2;
                    dVar.G.scrollListBy((int) (j13 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar2.d));
                    WeakHashMap weakHashMap3 = r0.i0.a;
                    t1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                z0 z0Var = (z0) this.b;
                String str = z0Var.n0;
                if (str != null) {
                    z0Var.U(z0Var.r0, str, false);
                    return;
                }
                return;
            case 9:
                m1 m1Var = (m1) this.b;
                String str2 = m1Var.o0;
                if (str2 != null) {
                    m1.V(m1Var, str2);
                    return;
                }
                return;
            case 10:
                fa faVar = (fa) this.b;
                o7 o7Var = o7.f;
                HashMap hashMap = faVar.j;
                x7.f fVar = (x7.f) hashMap.get(o7Var);
                if (fVar != null) {
                    x7.f fVar2 = fVar;
                    x7.a aVar3 = fVar2.a;
                    if (aVar3 == null) {
                        x7.f fVar3 = fVar2;
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
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new x7.b(fVar, next, list, null) : new e9.m(fVar, next, list, (e9.m) null));
                        Collections.sort(arrayList2);
                        z6 z6Var = new z6();
                        int size = arrayList2.size();
                        long j14 = 0;
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj2 = arrayList2.get(i15);
                            i15++;
                            j14 = ((Long) obj2).longValue() + j14;
                        }
                        z6Var.c = Long.valueOf((j14 / arrayList2.size()) & Long.MAX_VALUE);
                        z6Var.a = Long.valueOf(fa.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        z6Var.f = Long.valueOf(fa.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        z6Var.e = Long.valueOf(fa.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        z6Var.d = Long.valueOf(fa.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        z6Var.b = Long.valueOf(fa.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        a7 a7Var = new a7(z6Var);
                        int size2 = arrayList2.size();
                        com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
                        mVar2.c = m7.b;
                        u2.c cVar = new u2.c(10, false);
                        cVar.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        cVar.b = (x7.r0) next;
                        cVar.d = a7Var;
                        mVar2.f = new x7.s0(cVar);
                        rb.m.a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a(mVar2, 0), o7Var, faVar.b(), 7));
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 11:
                ((ThreadLocal) ((com.google.firebase.messaging.s) this.b).e).set(Boolean.TRUE);
                return;
            case 12:
                ((y2.j) this.b).a();
                return;
            case 13:
                z4.g gVar = (z4.g) this.b;
                gVar.setScrollState(0);
                gVar.s();
                return;
            case 14:
                wf wfVar = (wf) this.b;
                hb hbVar = hb.N1;
                HashMap hashMap2 = wfVar.j;
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
                        Object obj3 = (Collection) mgVar.c.get(next2);
                        if (obj3 == null) {
                            obj3 = new ArrayList(i12);
                        }
                        List list2 = (List) obj3;
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new de(mgVar, next2, list2, mVar) : new e9.m(mgVar, next2, list2, mVar));
                        Collections.sort(arrayList3);
                        z6 z6Var2 = new z6();
                        int size3 = arrayList3.size();
                        long j15 = 0;
                        int i16 = 0;
                        while (i16 < size3) {
                            Object obj4 = arrayList3.get(i16);
                            i16++;
                            j15 = ((Long) obj4).longValue() + j15;
                        }
                        z6Var2.c = Long.valueOf((j15 / arrayList3.size()) & Long.MAX_VALUE);
                        z6Var2.a = Long.valueOf(wf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        z6Var2.f = Long.valueOf(wf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        z6Var2.e = Long.valueOf(wf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        z6Var2.d = Long.valueOf(wf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        z6Var2.b = Long.valueOf(wf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(z6Var2);
                        int size4 = arrayList3.size();
                        t3 t3Var = new t3();
                        t3Var.c = fb.b;
                        u2.c cVar2 = new u2.c(16, false);
                        cVar2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        cVar2.b = (i1) next2;
                        cVar2.d = maVar;
                        t3Var.h = new j1(cVar2);
                        wf wfVar2 = wfVar;
                        hb hbVar2 = hbVar;
                        rb.m.a.execute(new com.google.android.gms.internal.cast.p(wfVar2, new a5.a(t3Var, 0), hbVar2, wfVar.c(), 8));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        hashMap2 = hashMap2;
                        mVar = null;
                        i12 = 3;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
            case 15:
                for (Thread thread : zf.f.w.keySet()) {
                    if (!thread.isAlive()) {
                        zf.f.w.remove(thread);
                    }
                }
                if (zf.f.w.isEmpty()) {
                    zf.f.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((zf.f) this.b).p, 5000L);
                    return;
                }
            default:
                zf.y yVar2 = (zf.y) this.b;
                if (yVar2.F.get()) {
                    yVar2.invalidate();
                    yVar2.H.postDelayed(this, 300L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ s0(wf wfVar) {
        this.a = 14;
        hb hbVar = hb.b;
        this.b = wfVar;
    }
}
