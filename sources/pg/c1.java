package pg;

import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.SystemClock;
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
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.oa;
import org.telegram.ui.au0;
import qg.v2;
import w7.n6;
import x7.a7;
import x7.ga;
import x7.n7;
import x7.p7;
import x7.z6;
import z7.de;
import z7.ed;
import z7.fb;
import z7.hb;
import z7.lg;
import z7.ma;
import z7.wf;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0432, code lost:
    
        if (r11 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0455, code lost:
    
        if (r11 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x040f, code lost:
    
        if (r10 > 0) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0498  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        float f7;
        int i10;
        int S;
        int i11;
        int i12;
        s4.c1 c1Var;
        e9.l lVar = null;
        int i13 = 3;
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.b;
                if (!d1Var.f || d1Var.y.y) {
                    return;
                }
                d1.b(d1Var);
                GLES20.glBindFramebuffer(36160, 0);
                d1 d1Var2 = (d1) this.b;
                GLES20.glViewport(0, 0, d1Var2.n, d1Var2.r);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                s0 s0Var = ((d1) this.b).y.c;
                if (s0Var.r != null) {
                    if (s0Var.D != null && s0Var.F != null && s0Var.E) {
                        GLES20.glBindFramebuffer(36160, 0);
                        g1 g1Var = (g1) s0Var.r.get("videoBlur");
                        if (g1Var != null) {
                            GLES20.glUseProgram(g1Var.a);
                            GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(s0Var.y));
                            GLES20.glUniform1f(g1Var.d("flipy"), 0.0f);
                            GLES20.glUniform1i(g1Var.d("texture"), 0);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, s0Var.D.c());
                            GLES20.glTexParameteri(3553, 10241, 9729);
                            GLES20.glUniform1i(g1Var.d("blured"), 1);
                            GLES20.glActiveTexture(33985);
                            oa oaVar = s0Var.F.m;
                            GLES20.glBindTexture(3553, oaVar != null ? oaVar.s[2] : -1);
                            if (s0Var.b == null || !(s0Var.i instanceof d)) {
                                GLES20.glUniform1f(g1Var.d("eraser"), 0.0f);
                            } else {
                                GLES20.glUniform1f(g1Var.d("eraser"), 1.0f);
                                GLES20.glUniform1i(g1Var.d("mask"), 2);
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
                        g1 g1Var2 = (g1) s0Var.r.get(s0Var.G ? "maskingBlit" : "blit");
                        if (j3 != 0 && g1Var2 != null) {
                            GLES20.glUseProgram(g1Var2.a);
                            f7 = 0.5f;
                            GLES20.glUniformMatrix4fv(g1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(s0Var.y));
                            GLES20.glUniform1f(g1Var2.d("alpha"), 1.0f);
                            if (s0Var.G) {
                                GLES20.glUniform1i(g1Var2.d("texture"), 1);
                                GLES20.glUniform1i(g1Var2.d("mask"), 0);
                                GLES20.glUniform1f(g1Var2.d("preview"), 0.4f);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j3);
                                GLES20.glActiveTexture(33985);
                                GLES20.glBindTexture(3553, s0Var.l.c());
                            } else {
                                GLES20.glUniform1i(g1Var2.d("texture"), 0);
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
                            if (i10 != 0 && s0Var.d != null && s0Var.I > 0.0f) {
                                s0Var.o(i10, s0Var.g(), s0Var.d, (s0Var.J * f7) + (s0Var.I * f7));
                            }
                        }
                    }
                    f7 = 0.5f;
                    i10 = s0Var.q;
                    if (i10 != 0) {
                        s0Var.o(i10, s0Var.g(), s0Var.d, (s0Var.J * f7) + (s0Var.I * f7));
                    }
                }
                GLES20.glBlendFunc(1, 771);
                d1 d1Var3 = (d1) this.b;
                d1Var3.b.eglSwapBuffers(d1Var3.c, d1Var3.e);
                f1 f1Var = ((d1) this.b).y;
                if (!f1Var.s) {
                    f1Var.s = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(this, 12));
                }
                if (((d1) this.b).h) {
                    return;
                }
                ((d1) this.b).h = true;
                return;
            case 1:
                qg.j jVar = ((au0) this.b).S0;
                if (jVar instanceof v2) {
                    ((v2) jVar).getEditText();
                    return;
                }
                return;
            case 2:
                rg.s0 s0Var2 = (rg.s0) this.b;
                ArrayList arrayList = s0Var2.g3;
                if (s0Var2.n3) {
                    if (!arrayList.isEmpty() && (S = RecyclerView.S((rg.n1) hg.k0.g(1, arrayList))) >= 0) {
                        View m10 = s0Var2.Y2.m(S + 1);
                        if (m10 != null) {
                            s0Var2.d3 = false;
                            s0Var2.x1(m10, true);
                            s0Var2.w0(0, m10.getTop() - ((s0Var2.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    s0Var2.y1();
                    return;
                }
                return;
            case 3:
                s4.y yVar = (s4.y) this.b;
                s4.v vVar = yVar.x;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = yVar.R;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
                    s4.o0 layoutManager = yVar.H.getLayoutManager();
                    if (yVar.Q == null) {
                        yVar.Q = new Rect();
                    }
                    layoutManager.c(yVar.c.a, yVar.Q);
                    if (layoutManager.d()) {
                        int i14 = (int) (yVar.s + yVar.n);
                        int paddingLeft = (i14 - yVar.Q.left) - yVar.H.getPaddingLeft();
                        float f10 = yVar.n;
                        if (f10 >= 0.0f || paddingLeft >= 0) {
                            if (f10 > 0.0f) {
                                i11 = ((yVar.c.a.getWidth() + i14) + yVar.Q.right) - (yVar.H.getWidth() - yVar.H.getPaddingRight());
                                break;
                            }
                        } else {
                            i11 = paddingLeft;
                        }
                        if (layoutManager.e()) {
                            int i15 = (int) (yVar.v + yVar.r);
                            i12 = (i15 - yVar.Q.top) - yVar.H.getPaddingTop();
                            float f11 = yVar.r;
                            if (f11 < 0.0f) {
                            }
                            if (f11 > 0.0f) {
                                i12 = ((yVar.c.a.getHeight() + i15) + yVar.Q.bottom) - (yVar.H.getHeight() - yVar.H.getPaddingBottom());
                                break;
                            }
                        }
                        i12 = 0;
                        if (i11 != 0) {
                            int width = yVar.c.a.getWidth();
                            yVar.H.getWidth();
                            i11 = vVar.i(width, i11, j11);
                        }
                        if (i12 != 0) {
                            int height = yVar.c.a.getHeight();
                            yVar.H.getHeight();
                            i12 = vVar.i(height, i12, j11);
                        }
                        if (i11 != 0 && i12 == 0) {
                            yVar.R = Long.MIN_VALUE;
                            return;
                        }
                        if (yVar.R == Long.MIN_VALUE) {
                            yVar.R = currentTimeMillis;
                        }
                        yVar.H.scrollBy(i11, i12);
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
                    if (layoutManager.e()) {
                    }
                    i12 = 0;
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (yVar.R == Long.MIN_VALUE) {
                    }
                    yVar.H.scrollBy(i11, i12);
                    c1Var = yVar.c;
                    if (c1Var != null) {
                    }
                    yVar.H.removeCallbacks(yVar.I);
                    RecyclerView recyclerView2 = yVar.H;
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    recyclerView2.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                tg.z0 z0Var = (tg.z0) this.b;
                String str = z0Var.n0;
                if (str != null) {
                    z0Var.T(z0Var.r0, str, false);
                    return;
                }
                return;
            case 5:
                tg.m1 m1Var = (tg.m1) this.b;
                String str2 = m1Var.o0;
                if (str2 != null) {
                    tg.m1.U(m1Var, str2);
                    return;
                }
                return;
            case 6:
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
                    long j12 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    dVar.G.scrollListBy((int) (j12 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap3 = r0.i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                ((ThreadLocal) ((com.google.firebase.messaging.t) this.b).e).set(Boolean.TRUE);
                return;
            case 8:
                ga gaVar = (ga) this.b;
                p7 p7Var = p7.f;
                HashMap hashMap = gaVar.j;
                x7.f fVar = (x7.f) hashMap.get(p7Var);
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
                        long j13 = 0;
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj2 = arrayList2.get(i16);
                            i16++;
                            j13 = ((Long) obj2).longValue() + j13;
                        }
                        z6Var.c = Long.valueOf((j13 / arrayList2.size()) & Long.MAX_VALUE);
                        z6Var.a = Long.valueOf(ga.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        z6Var.f = Long.valueOf(ga.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        z6Var.e = Long.valueOf(ga.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        z6Var.d = Long.valueOf(ga.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        z6Var.b = Long.valueOf(ga.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        a7 a7Var = new a7(z6Var);
                        int size2 = arrayList2.size();
                        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
                        nVar.c = n7.b;
                        v7.s1 s1Var = new v7.s1(7, false);
                        s1Var.d = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        s1Var.b = (x7.r0) next;
                        s1Var.c = a7Var;
                        nVar.f = new x7.s0(s1Var);
                        qb.m.a.execute(new com.google.android.gms.internal.cast.p(gaVar, new a5.a(nVar, 0), p7Var, gaVar.b(), 7));
                    }
                    hashMap.remove(p7Var);
                    return;
                }
                return;
            case 9:
                ((y2.k) this.b).b();
                return;
            case 10:
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
            case 11:
                yf.x xVar = (yf.x) this.b;
                if (xVar.F.get()) {
                    xVar.invalidate();
                    xVar.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 12:
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
                            obj3 = new ArrayList(i13);
                        }
                        List list2 = (List) obj3;
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new de(lgVar, next2, list2, lVar) : new e9.l(lgVar, next2, list2, lVar));
                        Collections.sort(arrayList3);
                        z6 z6Var2 = new z6();
                        int size3 = arrayList3.size();
                        long j14 = 0;
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList3.get(i17);
                            i17++;
                            j14 = ((Long) obj4).longValue() + j14;
                        }
                        HashMap hashMap3 = hashMap2;
                        z6Var2.c = Long.valueOf((j14 / arrayList3.size()) & Long.MAX_VALUE);
                        z6Var2.a = Long.valueOf(wf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        z6Var2.f = Long.valueOf(wf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        z6Var2.e = Long.valueOf(wf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        z6Var2.d = Long.valueOf(wf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        z6Var2.b = Long.valueOf(wf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(z6Var2);
                        int size4 = arrayList3.size();
                        p3 p3Var = new p3();
                        p3Var.c = fb.b;
                        v7.s1 s1Var2 = new v7.s1(13, false);
                        s1Var2.d = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        s1Var2.b = (z7.i1) next2;
                        s1Var2.c = maVar;
                        p3Var.h = new z7.j1(s1Var2);
                        wf wfVar2 = wfVar;
                        hb hbVar2 = hbVar;
                        qb.m.a.execute(new com.google.android.gms.internal.cast.p(wfVar2, new a5.a(p3Var, 0), hbVar2, wfVar.c(), 8));
                        hbVar = hbVar2;
                        hashMap2 = hashMap3;
                        wfVar = wfVar2;
                        i13 = 3;
                        lVar = null;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c1(wf wfVar) {
        this.a = 13;
        hb hbVar = hb.b;
        this.b = wfVar;
    }
}
