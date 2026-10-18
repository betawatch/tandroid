package p4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
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
import m.s1;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.pa;
import org.telegram.ui.it0;
import org.telegram.ui.web.z1;
import qg.c1;
import qg.e1;
import qg.f1;
import rg.v2;
import s4.b1;
import sg.o1;
import ug.m1;
import ug.y0;
import w7.t6;
import x7.a7;
import x7.fa;
import x7.m7;
import x7.o7;
import x7.z6;
import z7.ee;
import z7.fd;
import z7.gb;
import z7.i1;
import z7.ib;
import z7.j1;
import z7.ma;
import z7.mg;
import z7.xf;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        qg.s0 s0Var = ((c1) this.b).y.c;
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
                    if (s0Var.b == null || !(s0Var.i instanceof qg.d)) {
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
                int j10 = s0Var.j();
                f7 = 0.0f;
                f1 f1Var2 = (f1) s0Var.r.get(s0Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && f1Var2 != null) {
                    GLES20.glUseProgram(f1Var2.a);
                    f10 = 0.5f;
                    GLES20.glUniformMatrix4fv(f1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(s0Var.y));
                    GLES20.glUniform1f(f1Var2.d("alpha"), 1.0f);
                    if (s0Var.G) {
                        GLES20.glUniform1i(f1Var2.d("texture"), 1);
                        GLES20.glUniform1i(f1Var2.d("mask"), 0);
                        GLES20.glUniform1f(f1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, s0Var.l.c());
                    } else {
                        GLES20.glUniform1i(f1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) s0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) s0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    t6.a();
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
            AndroidUtilities.runOnUIThread(new z1(this, 6));
        }
        if (((c1) this.b).h) {
            return;
        }
        ((c1) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0517, code lost:
    
        if (r10 > 0) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x058b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05a2  */
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
        i2.h0 h0Var;
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
                rg.j jVar = ((it0) this.b).S0;
                if (jVar instanceof v2) {
                    ((v2) jVar).getEditText();
                    return;
                }
                return;
            case 4:
                s4.y yVar = (s4.y) this.b;
                s4.v vVar = yVar.x;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = yVar.R;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
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
            case 5:
                sg.s0 s0Var = (sg.s0) this.b;
                ArrayList arrayList = s0Var.e3;
                if (s0Var.l3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((o1) i2.d.h(1, arrayList))) >= 0) {
                        View m10 = s0Var.W2.m(R + 1);
                        if (m10 != null) {
                            s0Var.b3 = false;
                            s0Var.x1(m10, true);
                            s0Var.v0(0, m10.getTop() - ((s0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    s0Var.y1();
                    return;
                }
                return;
            case 6:
                si.s0 s0Var2 = (si.s0) this.b;
                if (s0Var2.W == 5 && (h0Var = s0Var2.S) != null && s0Var2.x) {
                    long M0 = h0Var.M0();
                    long j12 = s0Var2.G;
                    if (M0 < j12 || M0 >= s0Var2.H) {
                        s0Var2.S.Z0(5, j12);
                    }
                    s0Var2.d.getClass();
                    s0Var2.i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 7:
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
            case 8:
                y0 y0Var = (y0) this.b;
                String str = y0Var.n0;
                if (str != null) {
                    y0Var.U(y0Var.r0, str, false);
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
                        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
                        lVar.c = m7.b;
                        t0.h hVar = new t0.h(11, false);
                        hVar.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        hVar.b = (x7.r0) next;
                        hVar.d = a7Var;
                        lVar.f = new x7.s0(hVar);
                        rb.m.a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a(lVar, 0), o7Var, faVar.b(), 7));
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 11:
                ((ThreadLocal) ((com.google.firebase.messaging.r) this.b).e).set(Boolean.TRUE);
                return;
            case 12:
                ((y2.j) this.b).b();
                return;
            case 13:
                z4.g gVar = (z4.g) this.b;
                gVar.setScrollState(0);
                gVar.s();
                return;
            case 14:
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
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new ee(mgVar, next2, list2, mVar) : new e9.m(mgVar, next2, list2, mVar));
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
                        t0.h hVar2 = new t0.h(17, false);
                        hVar2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        hVar2.b = (i1) next2;
                        hVar2.d = maVar;
                        s3Var.h = new j1(hVar2);
                        xf xfVar2 = xfVar;
                        ib ibVar2 = ibVar;
                        rb.m.a.execute(new com.google.android.gms.internal.cast.p(xfVar2, new a5.a(s3Var, 0), ibVar2, xfVar.c(), 8));
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
            case 15:
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
            case 16:
                zf.x xVar = (zf.x) this.b;
                if (xVar.F.get()) {
                    xVar.invalidate();
                    xVar.H.postDelayed(this, 300L);
                    return;
                }
                return;
            default:
                zh.w wVar = (zh.w) this.b;
                CameraView cameraView = wVar.b;
                if (!wVar.b0 || cameraView == null) {
                    return;
                }
                TextureView textureView = cameraView.getTextureView();
                int width2 = textureView.getWidth();
                int height3 = textureView.getHeight();
                if (width2 > 0 && height3 > 0) {
                    if (width2 > 720 || height3 > 720) {
                        float f11 = width2;
                        float f12 = height3;
                        float min = Math.min(720.0f / f11, 720.0f / f12);
                        width2 = Math.max(1, (int) (f11 * min));
                        height3 = Math.max(1, (int) (f12 * min));
                    }
                    Bitmap bitmap = ((zh.w) this.b).e0;
                    if (bitmap == null || bitmap.getWidth() != width2 || ((zh.w) this.b).e0.getHeight() != height3) {
                        ((zh.w) this.b).e0 = Bitmap.createBitmap(width2, height3, Bitmap.Config.ARGB_8888);
                    }
                    try {
                        textureView.getBitmap(((zh.w) this.b).e0);
                        zh.w wVar2 = (zh.w) this.b;
                        xf.c a10 = zh.w.a(wVar2, wVar2.e0);
                        if (a10 != null) {
                            AndroidUtilities.runOnUIThread(new uf.c(24, this, a10));
                            return;
                        }
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                }
                if (((zh.w) this.b).b0) {
                    ((zh.w) this.b).a0.postDelayed(this, 150L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ s0(xf xfVar) {
        this.a = 14;
        ib ibVar = ib.b;
        this.b = xfVar;
    }
}
