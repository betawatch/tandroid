package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Base64;
import android.widget.FrameLayout;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import gi.p2;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.q2;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Wallet.v3;
import org.telegram.ui.gl;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.b;
        g2 g2Var = (g2) this.c;
        cVar.c.C();
        r2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            g2Var.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.b;
        qa.b bVar = (qa.b) this.c;
        if (pVar.b != r9.p.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (pVar) {
            aVar = pVar.a;
            pVar.a = null;
            pVar.b = bVar;
        }
        aVar.h(bVar);
    }

    private final void c() {
        r9.o oVar = (r9.o) this.b;
        qa.b bVar = (qa.b) this.c;
        synchronized (oVar) {
            try {
                if (oVar.b == null) {
                    oVar.a.add(bVar);
                } else {
                    oVar.b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        long j10 = 0;
        int i11 = 8;
        int i12 = 4;
        switch (this.a) {
            case 0:
                ((h2) this.b).m.remove((v3) this.c);
                return;
            case 1:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri);
                return;
            case 2:
                qg.s0 s0Var = (qg.s0) this.b;
                qg.z0 z0Var = (qg.z0) this.c;
                s0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) s0Var.h(s0Var.f(), true, false, false).c;
                RectF f7 = s0Var.f();
                Object obj = s0Var.a.b;
                s0Var.w = new a5.a(byteBuffer, 0, f7);
                s0Var.a(false);
                z0Var.run();
                return;
            case 3:
                qg.e1 e1Var = (qg.e1) this.b;
                Runnable runnable = (Runnable) this.c;
                qg.c1 c1Var = e1Var.d;
                if (c1Var == null || !c1Var.f) {
                    return;
                }
                qg.c1.b(c1Var);
                runnable.run();
                return;
            case 4:
                qi.i iVar = (qi.i) this.b;
                qi.h hVar = (qi.h) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = hVar.b.getInputStream();
                    while (true) {
                        synchronized (iVar.a) {
                            while (!iVar.u && iVar.m.get(Integer.valueOf(hVar.a)) == hVar && (!iVar.t || !hVar.e || hVar.c == j10)) {
                                try {
                                    iVar.a.wait();
                                } finally {
                                }
                            }
                            if (!iVar.u && iVar.m.get(Integer.valueOf(hVar.a)) == hVar) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, hVar.c));
                                if (read < 0) {
                                    iVar.c(hVar, true);
                                    return;
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (iVar.a) {
                                        try {
                                            if (!iVar.u && iVar.m.get(Integer.valueOf(hVar.a)) == hVar && iVar.t) {
                                                hVar.c -= read;
                                                iVar.l(2, hVar.a, bArr2);
                                            }
                                        } finally {
                                        }
                                    }
                                    j10 = 0;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception unused) {
                    iVar.c(hVar, true);
                    return;
                }
            case 5:
                qi.i iVar2 = (qi.i) this.b;
                String str = (String) this.c;
                iVar2.getClass();
                try {
                    byte[] decode = Base64.decode(str.substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        iVar2.k(decode);
                        return;
                    }
                    iVar2.f();
                    return;
                } catch (IllegalArgumentException e) {
                    FileLog.e(e);
                    iVar2.f();
                    return;
                }
            case 6:
                ((qi.i) this.b).k((byte[]) this.c);
                return;
            case 7:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 8:
                a();
                return;
            case 9:
                r2.r rVar = (r2.r) this.b;
                rVar.T.set(rVar.w((qf.b) this.c, rVar.N, 0));
                return;
            case 10:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i13 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 11:
                b();
                return;
            case 12:
                c();
                return;
            case 13:
                rg.m0 m0Var = (rg.m0) this.b;
                rg.x1 x1Var = (rg.x1) this.c;
                x1Var.m();
                m0Var.s0(x1Var, true);
                return;
            case 14:
                ((rg.x1) this.b).s((Bitmap) this.c);
                return;
            case 15:
                rg.m2 m2Var = (rg.m2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                m2Var.G = false;
                rg.j2[] j2VarArr = (rg.j2[]) arrayList.toArray(new rg.j2[0]);
                m2Var.H = j2VarArr;
                if (j2VarArr.length > 0) {
                    m2Var.b0.setScaleX(0.3f);
                    m2Var.b0.setScaleY(0.3f);
                    m2Var.b0.setAlpha(0.0f);
                    m2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(bs.f).start();
                    return;
                }
                return;
            case 16:
                s9.a aVar = (s9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 17:
                Callable callable = (Callable) this.b;
                s9.h hVar2 = (s9.h) ((k0.b) this.c).b;
                try {
                    hVar2.k(callable.call());
                    return;
                } catch (Exception e7) {
                    hVar2.l(e7);
                    return;
                }
            case 18:
                sg.k0 k0Var = (sg.k0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = k0Var.i0;
                im0 im0Var = k0Var.d;
                if (tLObject != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    k0Var.I0 = false;
                    k0Var.J0.b(k0Var.n0 + 4);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= im0Var.getChildCount()) {
                            i10 = 0;
                        } else if (im0Var.getChildAt(i14) instanceof sg.j0) {
                            i10 = im0Var.getChildAt(i14).getTop();
                        } else {
                            i14++;
                        }
                    }
                    k0Var.N1();
                    if (k0Var.l0 >= 0 && i10 != 0) {
                        ((s4.b0) im0Var.getLayoutManager()).h1(k0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), k0Var.M0.b);
                k0Var.x0.g(max, false);
                k0Var.x0.setBagePosition(max / k0Var.M0.c);
                sg.i0 i0Var = k0Var.x0;
                i0Var.H = true;
                i0Var.requestLayout();
                return;
            case 19:
                ((sg.k0) this.b).n1((aa0) this.c, true);
                return;
            case 20:
                sg.a2 a2Var = (sg.a2) this.b;
                AndroidUtilities.runOnUIThread(new g2(21, a2Var, FileLoader.getInstance(a2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 21:
                sg.a2 a2Var2 = (sg.a2) this.b;
                a2Var2.e = (File) this.c;
                a2Var2.a();
                return;
            case 22:
                ((si.j) this.b).a0((si.l0) this.c);
                return;
            case 23:
                si.j jVar = (si.j) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                jVar.k();
                si.m mVar = jVar.x;
                if (mVar != null) {
                    long l4 = mVar.l();
                    si.t tVar = jVar.w;
                    if (tVar != null && l4 != Long.MAX_VALUE) {
                        tVar.q = Math.max(0L, l4) * 1000;
                        Handler handler = tVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.x0);
                        }
                    }
                }
                jVar.p();
                si.m mVar2 = jVar.x;
                if (mVar2 != null) {
                    mVar2.q();
                    jVar.x = null;
                }
                handlerThread.quitSafely();
                return;
            case 24:
                si.t tVar2 = (si.t) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f();
                        tVar2.r0 = true;
                    } finally {
                        countDownLatch.countDown();
                    }
                } catch (RuntimeException e10) {
                    tVar2.w0 = e10;
                    tVar2.i();
                }
                return;
            case 25:
                l2.f fVar = (l2.f) this.b;
                si.l0 l0Var = (si.l0) this.c;
                si.s0 s0Var2 = (si.s0) fVar.b;
                s0Var2.N++;
                s0Var2.w = true;
                s0Var2.m.b("camera switch started: target=" + l0Var);
                l60 l60Var = (l60) s0Var2.d.b;
                FrameLayout frameLayout = l60Var.x;
                l60Var.s0++;
                ValueAnimator valueAnimator = l60Var.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    l60Var.b0.cancel();
                    l60Var.b0 = null;
                }
                l60Var.n0 = true;
                l60Var.o0 = false;
                l60Var.p0 = false;
                l60Var.q0 = false;
                l60Var.r0 = SystemClock.elapsedRealtime();
                gl glVar = l60Var.E;
                l60Var.v(false);
                Bitmap bitmap = l60Var.t0;
                if (bitmap != null) {
                    glVar.setImageBitmap(bitmap);
                    l60Var.m0 = true;
                    glVar.animate().cancel();
                    glVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i15 = l60Var.s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                l60Var.b0 = ofFloat;
                ofFloat.setDuration(580L);
                l60Var.b0.setInterpolator(bs.h);
                l60Var.b0.addUpdateListener(new q2(l60Var, i15, i12));
                l60Var.b0.addListener(new p2(l60Var, i15, i11));
                l60Var.b0.start();
                FileLog.d("RoundVideo camera flip started: facing=" + l0Var + ", minimumDurationMs=580");
                l60Var.y();
                s0Var2.o();
                return;
            case 26:
                ((si.s0) ((l2.f) this.b).b).h((Exception) this.c);
                return;
            case 27:
                ((tg.f) this.b).c((ArrayList) this.c);
                return;
            case 28:
                tg.q qVar = (tg.q) this.b;
                tg.s sVar = (tg.s) this.c;
                qVar.getClass();
                try {
                    EGLDisplay eGLDisplay = qVar.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = qVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, qVar.k);
                        EGLSurface eGLSurface2 = sVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(qVar.j, eGLSurface2);
                        }
                        sVar.h = EGL14.EGL_NO_SURFACE;
                        if (qVar.g.length == 0) {
                            qVar.b();
                        }
                    }
                    sVar.b.release();
                    return;
                } finally {
                    sVar.b.release();
                }
            default:
                ((e2.j) this.b).accept(this.c);
                return;
        }
    }
}
