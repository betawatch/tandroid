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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.fl;
import qg.c1;
import qg.e1;
import qg.s0;
import qg.z0;
import rg.l2;
import rg.m0;
import rg.o2;
import rg.z1;
import s4.b0;
import sg.a2;
import sg.h0;
import sg.i0;
import sg.j0;
import si.u0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        cVar.c.p();
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

    private final void d() {
        int i10;
        ri.o oVar = (ri.o) this.b;
        File file = (File) this.c;
        synchronized (oVar.m) {
            while (i10 < oVar.m.size()) {
                try {
                    File file2 = (File) oVar.m.get(i10);
                    i10 = (file != null && file.equals(file2)) ? i10 + 1 : 0;
                    if (file2.exists() && !file2.delete()) {
                        oVar.h.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            oVar.m.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:?, code lost:
    
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
                s0 s0Var = (s0) this.b;
                z0 z0Var = (z0) this.c;
                s0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) s0Var.h(s0Var.f(), true, false, false).c;
                RectF f7 = s0Var.f();
                Object obj = s0Var.a.b;
                s0Var.w = new a5.a(byteBuffer, 0, f7);
                s0Var.a(false);
                z0Var.run();
                return;
            case 2:
                e1 e1Var = (e1) this.b;
                Runnable runnable = (Runnable) this.c;
                c1 c1Var = e1Var.d;
                if (c1Var == null || !c1Var.f) {
                    return;
                }
                c1.b(c1Var);
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
                z1 z1Var = (z1) this.c;
                z1Var.m();
                m0Var.r0(z1Var, true);
                return;
            case 13:
                ((z1) this.b).s((Bitmap) this.c);
                return;
            case 14:
                o2 o2Var = (o2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                o2Var.G = false;
                l2[] l2VarArr = (l2[]) arrayList.toArray(new l2[0]);
                o2Var.H = l2VarArr;
                if (l2VarArr.length > 0) {
                    o2Var.b0.setScaleX(0.3f);
                    o2Var.b0.setScaleY(0.3f);
                    o2Var.b0.setAlpha(0.0f);
                    o2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(bs.f).start();
                    return;
                }
                return;
            case 15:
                ri.o oVar = (ri.o) this.b;
                Throwable th2 = (Throwable) this.c;
                oVar.getClass();
                oVar.g(th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2));
                return;
            case 16:
                d();
                return;
            case 17:
                s9.a aVar = (s9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 18:
                Callable callable = (Callable) this.b;
                s9.h hVar2 = (s9.h) ((le.b) this.c).b;
                try {
                    hVar2.k(callable.call());
                    return;
                } catch (Exception e7) {
                    hVar2.l(e7);
                    return;
                }
            case 19:
                j0 j0Var = (j0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = j0Var.i0;
                mm0 mm0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.n0 + 4);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= mm0Var.getChildCount()) {
                            i10 = 0;
                        } else if (mm0Var.getChildAt(i14) instanceof i0) {
                            i10 = mm0Var.getChildAt(i14).getTop();
                        } else {
                            i14++;
                        }
                    }
                    j0Var.Q1();
                    if (j0Var.l0 >= 0 && i10 != 0) {
                        ((b0) mm0Var.getLayoutManager()).h1(j0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), j0Var.M0.b);
                j0Var.x0.i(max, false);
                j0Var.x0.setBagePosition(max / j0Var.M0.c);
                h0 h0Var = j0Var.x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 20:
                ((j0) this.b).q1((ba0) this.c, true);
                return;
            case 21:
                a2 a2Var = (a2) this.b;
                AndroidUtilities.runOnUIThread(new b(22, a2Var, FileLoader.getInstance(a2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 22:
                a2 a2Var2 = (a2) this.b;
                a2Var2.e = (File) this.c;
                a2Var2.a();
                return;
            case 23:
                ((si.j) this.b).a0((si.m0) this.c);
                return;
            case 24:
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
            case 25:
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
            case 26:
                w0 w0Var = (w0) this.b;
                si.m0 m0Var2 = (si.m0) this.c;
                u0 u0Var = (u0) w0Var.b;
                u0Var.N++;
                u0Var.w = true;
                u0Var.m.b("camera switch started: target=" + m0Var2);
                m60 m60Var = (m60) u0Var.d.b;
                FrameLayout frameLayout = m60Var.x;
                m60Var.s0++;
                ValueAnimator valueAnimator = m60Var.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    m60Var.b0.cancel();
                    m60Var.b0 = null;
                }
                m60Var.n0 = true;
                m60Var.o0 = false;
                m60Var.p0 = false;
                m60Var.q0 = false;
                m60Var.r0 = SystemClock.elapsedRealtime();
                fl flVar = m60Var.E;
                m60Var.v(false);
                Bitmap bitmap = m60Var.t0;
                if (bitmap != null) {
                    flVar.setImageBitmap(bitmap);
                    m60Var.m0 = true;
                    flVar.animate().cancel();
                    flVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i15 = m60Var.s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                m60Var.b0 = ofFloat;
                ofFloat.setDuration(580L);
                m60Var.b0.setInterpolator(bs.h);
                m60Var.b0.addUpdateListener(new r2(m60Var, i15, i12));
                m60Var.b0.addListener(new p2(m60Var, i15, i11));
                m60Var.b0.start();
                FileLog.d("RoundVideo camera flip started: facing=" + m0Var2 + ", minimumDurationMs=580");
                m60Var.y();
                u0Var.o();
                return;
            case 27:
                ((u0) ((w0) this.b).b).h((Exception) this.c);
                return;
            case 28:
                ((tg.f) this.b).c((ArrayList) this.c);
                return;
            default:
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
        }
    }
}
