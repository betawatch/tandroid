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
import com.google.firebase.messaging.l;
import com.google.firebase.messaging.r;
import e9.m;
import i2.e;
import i2.i0;
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
import m.s1;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.pa;
import org.telegram.ui.gt0;
import org.telegram.ui.web.z1;
import qg.d;
import qg.d1;
import qg.f1;
import qg.g1;
import qg.t0;
import rg.j;
import rg.v2;
import s4.b1;
import s4.n0;
import s4.v;
import s4.y;
import sg.p1;
import si.s0;
import ug.m1;
import ug.y0;
import w7.q6;
import x7.a7;
import x7.f;
import x7.fa;
import x7.m7;
import x7.o7;
import x7.r0;
import x7.z6;
import z4.g;
import z7.ee;
import z7.fd;
import z7.gb;
import z7.i1;
import z7.ib;
import z7.j1;
import z7.ma;
import z7.mg;
import z7.xf;
import zf.x;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b(Object obj, int i10) {
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
        t0 t0Var = ((d1) this.b).y.c;
        if (t0Var.r != null) {
            if (t0Var.D != null && t0Var.F != null && t0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                g1 g1Var = (g1) t0Var.r.get("videoBlur");
                if (g1Var != null) {
                    GLES20.glUseProgram(g1Var.a);
                    GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(t0Var.y));
                    GLES20.glUniform1f(g1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(g1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, t0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(g1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    pa paVar = t0Var.F.m;
                    GLES20.glBindTexture(3553, paVar != null ? paVar.s[2] : -1);
                    if (t0Var.b == null || !(t0Var.i instanceof d)) {
                        GLES20.glUniform1f(g1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(g1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(g1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, t0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) t0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) t0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (t0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (t0Var.b != null) {
                t0Var.n(t0Var.g(), t0Var.b, (1.0f - (t0Var.I * 0.5f)) - (t0Var.J * 0.5f));
            } else if (t0Var.c != null) {
                t0Var.o(t0Var.j(), t0Var.g(), t0Var.c, 1.0f);
            } else {
                int j10 = t0Var.j();
                f7 = 0.0f;
                g1 g1Var2 = (g1) t0Var.r.get(t0Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && g1Var2 != null) {
                    GLES20.glUseProgram(g1Var2.a);
                    f10 = 0.5f;
                    GLES20.glUniformMatrix4fv(g1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(t0Var.y));
                    GLES20.glUniform1f(g1Var2.d("alpha"), 1.0f);
                    if (t0Var.G) {
                        GLES20.glUniform1i(g1Var2.d("texture"), 1);
                        GLES20.glUniform1i(g1Var2.d("mask"), 0);
                        GLES20.glUniform1f(g1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, t0Var.l.c());
                    } else {
                        GLES20.glUniform1i(g1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) t0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) t0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    q6.a();
                    i10 = t0Var.q;
                    if (i10 != 0 && t0Var.d != null && t0Var.I > f7) {
                        t0Var.o(i10, t0Var.g(), t0Var.d, (t0Var.J * f10) + (t0Var.I * f10));
                    }
                }
                f10 = 0.5f;
                i10 = t0Var.q;
                if (i10 != 0) {
                    t0Var.o(i10, t0Var.g(), t0Var.d, (t0Var.J * f10) + (t0Var.I * f10));
                }
            }
            f7 = 0.0f;
            f10 = 0.5f;
            i10 = t0Var.q;
            if (i10 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        d1 d1Var3 = (d1) this.b;
        d1Var3.b.eglSwapBuffers(d1Var3.c, d1Var3.e);
        f1 f1Var = ((d1) this.b).y;
        if (!f1Var.s) {
            f1Var.s = true;
            AndroidUtilities.runOnUIThread(new z1(this, 6));
        }
        if (((d1) this.b).h) {
            return;
        }
        ((d1) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x047e, code lost:
    
        if (r10 > 0) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0509  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        b1 b1Var;
        int height;
        int R;
        i0 i0Var;
        m mVar = null;
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
                j jVar = ((gt0) this.b).S0;
                if (jVar instanceof v2) {
                    ((v2) jVar).getEditText();
                    return;
                }
                return;
            case 3:
                y yVar = (y) this.b;
                v vVar = yVar.x;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = yVar.R;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
                    n0 layoutManager = yVar.H.getLayoutManager();
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
                                i10 = vVar.i(width, i10, j11);
                            }
                            if (i11 != 0) {
                                int height2 = yVar.c.a.getHeight();
                                yVar.H.getHeight();
                                i11 = vVar.i(height2, i11, j11);
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
            case 4:
                sg.t0 t0Var = (sg.t0) this.b;
                ArrayList arrayList = t0Var.e3;
                if (t0Var.l3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((p1) e.h(1, arrayList))) >= 0) {
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
            case 5:
                s0 s0Var = (s0) this.b;
                if (s0Var.W == 5 && (i0Var = s0Var.S) != null && s0Var.x) {
                    long M0 = i0Var.M0();
                    long j12 = s0Var.G;
                    if (M0 < j12 || M0 >= s0Var.H) {
                        s0Var.S.Z0(5, j12);
                    }
                    s0Var.d.getClass();
                    s0Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 6:
                u0.d dVar = (u0.d) this.b;
                s1 s1Var = dVar.c;
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
                        s1Var.onTouchEvent(obtain);
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
                    s1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                y0 y0Var = (y0) this.b;
                String str = y0Var.n0;
                if (str != null) {
                    y0Var.U(y0Var.r0, str, false);
                    return;
                }
                return;
            case 8:
                m1 m1Var = (m1) this.b;
                String str2 = m1Var.o0;
                if (str2 != null) {
                    m1.V(m1Var, str2);
                    return;
                }
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
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new x7.b(fVar, next, list, null) : new m(fVar, next, list, (m) null));
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
                        l lVar = new l();
                        lVar.c = m7.b;
                        u2.c cVar = new u2.c(10, false);
                        cVar.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        cVar.b = (r0) next;
                        cVar.d = a7Var;
                        lVar.f = new x7.s0(cVar);
                        rb.m.a.execute(new p(faVar, new a5.a(lVar, 0), o7Var, faVar.b(), 7));
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 10:
                ((ThreadLocal) ((r) this.b).e).set(Boolean.TRUE);
                return;
            case 11:
                ((y2.j) this.b).b();
                return;
            case 12:
                g gVar = (g) this.b;
                gVar.setScrollState(0);
                gVar.s();
                return;
            case 13:
                xf xfVar = (xf) this.b;
                ib ibVar = ib.N1;
                HashMap hashMap2 = xfVar.j;
                mg mgVar = (mg) hashMap2.get(ibVar);
                if (mgVar != null) {
                    mg mgVar2 = mgVar;
                    fd fdVar = mgVar2.a;
                    if (fdVar == null) {
                        mg mgVar3 = mgVar2;
                        fd fdVar2 = new fd(mgVar3, mgVar3.c);
                        mgVar2.a = fdVar2;
                        fdVar = fdVar2;
                    }
                    Iterator it2 = fdVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj3 = (Collection) mgVar.c.get(next2);
                        if (obj3 == null) {
                            obj3 = new ArrayList(i12);
                        }
                        List list2 = (List) obj3;
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new ee(mgVar, next2, list2, mVar) : new m(mgVar, next2, list2, mVar));
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
                        z6Var2.a = Long.valueOf(xf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        z6Var2.f = Long.valueOf(xf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        z6Var2.e = Long.valueOf(xf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        z6Var2.d = Long.valueOf(xf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        z6Var2.b = Long.valueOf(xf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(z6Var2);
                        int size4 = arrayList3.size();
                        s3 s3Var = new s3();
                        s3Var.c = gb.b;
                        u2.c cVar2 = new u2.c(16, false);
                        cVar2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        cVar2.b = (i1) next2;
                        cVar2.d = maVar;
                        s3Var.h = new j1(cVar2);
                        xf xfVar2 = xfVar;
                        ib ibVar2 = ibVar;
                        rb.m.a.execute(new p(xfVar2, new a5.a(s3Var, 0), ibVar2, xfVar.c(), 8));
                        ibVar = ibVar2;
                        xfVar = xfVar2;
                        hashMap2 = hashMap2;
                        mVar = null;
                        i12 = 3;
                    }
                    hashMap2.remove(ibVar);
                    return;
                }
                return;
            case 14:
                for (Thread thread : zf.e.w.keySet()) {
                    if (!thread.isAlive()) {
                        zf.e.w.remove(thread);
                    }
                }
                if (zf.e.w.isEmpty()) {
                    zf.e.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((zf.e) this.b).p, 5000L);
                    return;
                }
            default:
                x xVar = (x) this.b;
                if (xVar.F.get()) {
                    xVar.invalidate();
                    xVar.H.postDelayed(this, 300L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b(xf xfVar) {
        this.a = 13;
        ib ibVar = ib.b;
        this.b = xfVar;
    }
}
