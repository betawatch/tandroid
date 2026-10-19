package p2;

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
import c3.c0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import gi.p2;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import k2.w0;
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
import org.telegram.ui.el;
import qg.a1;
import qg.d1;
import qg.f1;
import qg.t0;
import rg.k2;
import rg.m0;
import rg.n2;
import rg.y1;
import s4.b0;
import sg.a2;
import sg.i0;
import sg.j0;
import sg.k0;
import si.l0;
import si.s0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.b;
        b bVar = (b) this.c;
        cVar.c.n();
        r2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            bVar.run();
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

    /* JADX WARN: Code restructure failed: missing block: B:189:?, code lost:
    
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
                c cVar = (c) this.b;
                Uri uri = (Uri) this.c;
                cVar.s = false;
                cVar.b(uri);
                return;
            case 1:
                t0 t0Var = (t0) this.b;
                a1 a1Var = (a1) this.c;
                t0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) t0Var.h(t0Var.f(), true, false, false).c;
                RectF f7 = t0Var.f();
                Object obj = t0Var.a.b;
                t0Var.w = new a5.a(byteBuffer, 0, f7);
                t0Var.a(false);
                a1Var.run();
                return;
            case 2:
                f1 f1Var = (f1) this.b;
                Runnable runnable = (Runnable) this.c;
                d1 d1Var = f1Var.d;
                if (d1Var == null || !d1Var.f) {
                    return;
                }
                d1.b(d1Var);
                runnable.run();
                return;
            case 3:
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
            case 4:
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
            case 5:
                ((qi.i) this.b).k((byte[]) this.c);
                return;
            case 6:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 7:
                a();
                return;
            case 8:
                r2.r rVar = (r2.r) this.b;
                rVar.T.set(rVar.w((qf.b) this.c, rVar.N, 0));
                return;
            case 9:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i13 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 10:
                b();
                return;
            case 11:
                c();
                return;
            case 12:
                m0 m0Var = (m0) this.b;
                y1 y1Var = (y1) this.c;
                y1Var.m();
                m0Var.s0(y1Var, true);
                return;
            case 13:
                ((y1) this.b).s((Bitmap) this.c);
                return;
            case 14:
                n2 n2Var = (n2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                n2Var.G = false;
                k2[] k2VarArr = (k2[]) arrayList.toArray(new k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.b0.setScaleX(0.3f);
                    n2Var.b0.setScaleY(0.3f);
                    n2Var.b0.setAlpha(0.0f);
                    n2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(bs.f).start();
                    return;
                }
                return;
            case 15:
                s9.a aVar = (s9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 16:
                Callable callable = (Callable) this.b;
                s9.h hVar2 = (s9.h) ((le.b) this.c).b;
                try {
                    hVar2.k(callable.call());
                    return;
                } catch (Exception e7) {
                    hVar2.l(e7);
                    return;
                }
            case 17:
                k0 k0Var = (k0) this.b;
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
                        } else if (im0Var.getChildAt(i14) instanceof j0) {
                            i10 = im0Var.getChildAt(i14).getTop();
                        } else {
                            i14++;
                        }
                    }
                    k0Var.N1();
                    if (k0Var.l0 >= 0 && i10 != 0) {
                        ((b0) im0Var.getLayoutManager()).h1(k0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), k0Var.M0.b);
                k0Var.x0.g(max, false);
                k0Var.x0.setBagePosition(max / k0Var.M0.c);
                i0 i0Var = k0Var.x0;
                i0Var.H = true;
                i0Var.requestLayout();
                return;
            case 18:
                ((k0) this.b).n1((aa0) this.c, true);
                return;
            case 19:
                a2 a2Var = (a2) this.b;
                AndroidUtilities.runOnUIThread(new b(20, a2Var, FileLoader.getInstance(a2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 20:
                a2 a2Var2 = (a2) this.b;
                a2Var2.e = (File) this.c;
                a2Var2.a();
                return;
            case 21:
                ((si.j) this.b).a0((l0) this.c);
                return;
            case 22:
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
            case 23:
                si.t tVar2 = (si.t) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f();
                        tVar2.r0 = true;
                    } catch (RuntimeException e10) {
                        tVar2.w0 = e10;
                        tVar2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 24:
                w0 w0Var = (w0) this.b;
                l0 l0Var = (l0) this.c;
                s0 s0Var = (s0) w0Var.b;
                s0Var.N++;
                s0Var.w = true;
                s0Var.m.b("camera switch started: target=" + l0Var);
                l60 l60Var = (l60) s0Var.d.b;
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
                el elVar = l60Var.E;
                l60Var.v(false);
                Bitmap bitmap = l60Var.t0;
                if (bitmap != null) {
                    elVar.setImageBitmap(bitmap);
                    l60Var.m0 = true;
                    elVar.animate().cancel();
                    elVar.setAlpha(1.0f);
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
                s0Var.o();
                return;
            case 25:
                ((s0) ((w0) this.b).b).h((Exception) this.c);
                return;
            case 26:
                ((tg.f) this.b).c((ArrayList) this.c);
                return;
            case 27:
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
            case 28:
                ((e2.j) this.b).accept(this.c);
                return;
            default:
                ((u2.w0) this.b).A((c0) this.c);
                return;
        }
    }
}
