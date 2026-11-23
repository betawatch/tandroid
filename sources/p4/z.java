package p4;

import a8.la;
import a8.xa;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Looper;
import android.os.Process;
import android.os.ResultReceiver;
import android.os.StrictMode;
import android.text.SpannableString;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import di.p9;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.a8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qf;
import tg.c2;
import tg.f2;
import ug.w1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.b;
        z zVar = (z) this.c;
        cVar.c.j();
        u2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            zVar.run();
        }
    }

    private final void b() {
        ua.a aVar;
        u9.o oVar = (u9.o) this.b;
        ua.b bVar = (ua.b) this.c;
        if (oVar.b != u9.o.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (oVar) {
            aVar = oVar.a;
            oVar.a = null;
            oVar.b = bVar;
        }
        aVar.b(bVar);
    }

    private final void c() {
        u9.n nVar = (u9.n) this.b;
        ua.b bVar = (ua.b) this.c;
        synchronized (nVar) {
            try {
                if (nVar.b == null) {
                    nVar.a.add(bVar);
                } else {
                    nVar.b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1 o1Var;
        ji.l lVar;
        ji.l lVar2;
        int i7;
        Object obj = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ((c0.i) this.c).a(Boolean.valueOf(((e0) this.b).o()));
                return;
            case 1:
                m9.w wVar = (m9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    o1Var = (o1) wVar.a;
                    la.k(o1Var, "SessionResult must not be null");
                } catch (InterruptedException e10) {
                    e = e10;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    o1Var = new o1(-1);
                } catch (CancellationException e11) {
                    h2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e11);
                    o1Var = new o1(1);
                } catch (ExecutionException e12) {
                    e = e12;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    o1Var = new o1(-1);
                }
                resultReceiver.send(o1Var.a, o1Var.b);
                return;
            case 2:
                e1 e1Var = (e1) this.b;
                l lVar3 = (l) this.c;
                ab.c0 c0Var = e1Var.b;
                v r10 = c0Var.r(lVar3.asBinder());
                if (r10 != null) {
                    c0Var.K(r10);
                    return;
                }
                return;
            case 3:
                ((e1) this.b).b.l((v) this.c);
                return;
            case 4:
                q2.d dVar = (q2.d) this.b;
                e2.u uVar = (e2.u) this.c;
                q2.e eVar = dVar.d;
                if (eVar.F == 0 || dVar.c) {
                    return;
                }
                Looper looper = eVar.J;
                looper.getClass();
                dVar.b = eVar.b(looper, dVar.a, uVar, false);
                eVar.y.add(dVar);
                return;
            case 5:
                ((p9) this.b).a((SpannableString) this.c);
                return;
            case 6:
                qi.p pVar = (qi.p) this.b;
                qi.n nVar = (qi.n) this.c;
                synchronized (pVar.a) {
                    try {
                        if (pVar.s) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) pVar.n.get(nVar);
                        if (arrayList != null) {
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj2 = arrayList.get(i11);
                                i11++;
                                if (((qi.o) obj2).a != null) {
                                    qi.l lVar4 = (qi.l) pVar.h.get(nVar);
                                    if (lVar4 != null) {
                                        lVar2 = lVar4.a;
                                    } else {
                                        int i12 = 26;
                                        if (pVar.a()) {
                                            try {
                                                com.google.android.gms.internal.play_billing.s0 c10 = pVar.w.a.c(nVar.a, nVar.b);
                                                c10.b();
                                                lVar = new ji.l(i12, c10, obj);
                                            } catch (LinkageError | OutOfMemoryError | RuntimeException e13) {
                                                if (pVar.c != null) {
                                                    try {
                                                        a8.g(e13, true);
                                                    } catch (LinkageError | RuntimeException unused) {
                                                    }
                                                }
                                                lVar = new ji.l(i12, obj, e13);
                                            }
                                            lVar2 = lVar;
                                        } else {
                                            lVar2 = new ji.l(i12, obj, pVar.x);
                                        }
                                    }
                                    synchronized (pVar.a) {
                                        try {
                                            if (pVar.s) {
                                                return;
                                            }
                                            if (lVar4 == null && ((Throwable) lVar2.c) == null) {
                                                pVar.c(nVar, lVar2);
                                            }
                                            ArrayList arrayList2 = (ArrayList) pVar.n.remove(nVar);
                                            if (arrayList2 == null) {
                                                return;
                                            }
                                            int size2 = arrayList2.size();
                                            while (i10 < size2) {
                                                Object obj3 = arrayList2.get(i10);
                                                i10++;
                                                qi.o oVar = (qi.o) obj3;
                                                try {
                                                    qi.m mVar = oVar.a;
                                                    oVar.a = null;
                                                    if (mVar != null) {
                                                        mVar.a(lVar2);
                                                    }
                                                } catch (LinkageError | RuntimeException e14) {
                                                    if (pVar.c != null) {
                                                        try {
                                                            a8.g(e14, true);
                                                        } catch (LinkageError | RuntimeException unused2) {
                                                        }
                                                    }
                                                }
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                        pVar.n.remove(nVar);
                        return;
                    } finally {
                    }
                }
            case 7:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 8:
                r2.p pVar2 = (r2.p) this.b;
                r2.i iVar = (r2.i) this.c;
                qf qfVar = pVar2.c;
                Uri uri = iVar.y;
                s2.c cVar = (s2.c) ((r2.j) qfVar.b).b.d.get(uri);
                if (cVar != null) {
                    s2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 9:
                s2.b bVar = (s2.b) this.b;
                Uri uri2 = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri2);
                return;
            case 10:
                sg.i0 i0Var = (sg.i0) this.b;
                sg.p0 p0Var = (sg.p0) this.c;
                i0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) i0Var.h(i0Var.f(), true, false, false).c;
                RectF f10 = i0Var.f();
                Object obj4 = i0Var.a.b;
                i0Var.w = new xa(byteBuffer, 0, f10);
                i0Var.a(false);
                p0Var.run();
                return;
            case 11:
                sg.u0 u0Var = (sg.u0) this.b;
                Runnable runnable = (Runnable) this.c;
                sg.s0 s0Var = u0Var.d;
                if (s0Var == null || !s0Var.f) {
                    return;
                }
                sg.s0.a(s0Var);
                runnable.run();
                return;
            case 12:
                tg.h0 h0Var = (tg.h0) this.b;
                View view = (View) this.c;
                h0Var.getClass();
                if (view instanceof tg.j) {
                    tg.j jVar = (tg.j) view;
                    jVar.m();
                    h0Var.r0(jVar, true);
                    return;
                }
                return;
            case 13:
                ((tg.p1) this.b).s((Bitmap) this.c);
                return;
            case 14:
                f2 f2Var = (f2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                f2Var.H = false;
                c2[] c2VarArr = (c2[]) arrayList3.toArray(new c2[0]);
                f2Var.I = c2VarArr;
                if (c2VarArr.length > 0) {
                    f2Var.c0.setScaleX(0.3f);
                    f2Var.c0.setScaleY(0.3f);
                    f2Var.c0.setAlpha(0.0f);
                    f2Var.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(nr.f).start();
                    return;
                }
                return;
            case 15:
                a();
                return;
            case 16:
                u2.r rVar = (u2.r) this.b;
                rVar.U.set(rVar.w((k8.a) this.c, rVar.O, 0));
                return;
            case 17:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i13 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 18:
                b();
                return;
            case 19:
                c();
                return;
            case 20:
                m9 m9Var = (m9) this.b;
                View view2 = (View) this.c;
                ue.a aVar = (ue.a) m9Var.d;
                if ((m9Var.a & 2) != 0) {
                    if (!aVar.Z0(view2, m9Var.b, m9Var.c)) {
                        m9Var.a |= 8;
                        return;
                    }
                    m9Var.a &= -3;
                    m9Var.e = null;
                    view2.performHapticFeedback(0);
                    m9Var.a = (m9Var.a | 4) & (-11);
                    m9Var.e = null;
                    return;
                }
                return;
            case 21:
                ug.k0 k0Var = (ug.k0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList4 = k0Var.e2;
                ek0 ek0Var = k0Var.o1;
                if (tLObject != null) {
                    arrayList4.clear();
                    arrayList4.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    k0Var.E2 = false;
                    k0Var.F2.b(k0Var.j2 + 4);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= ek0Var.getChildCount()) {
                            i7 = 0;
                        } else if (ek0Var.getChildAt(i14) instanceof ug.j0) {
                            i7 = ek0Var.getChildAt(i14).getTop();
                        } else {
                            i14++;
                        }
                    }
                    k0Var.H1();
                    if (k0Var.h2 >= 0 && i7 != 0) {
                        ((v4.c0) ek0Var.getLayoutManager()).h1(k0Var.h2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList4.size(), k0Var.I2.b);
                k0Var.t2.i(max, false);
                k0Var.t2.setBagePosition(max / k0Var.I2.c);
                ug.i0 i0Var2 = k0Var.t2;
                i0Var2.I = true;
                i0Var2.requestLayout();
                return;
            case 22:
                ((ug.k0) this.b).i1((p80) this.c, true);
                return;
            case 23:
                w1 w1Var = (w1) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                w7.G(w1Var.s);
                org.telegram.messenger.g0.g3(new z(24, w1Var, w7.I(document)));
                return;
            case 24:
                w1 w1Var2 = (w1) this.b;
                w1Var2.e = (File) this.c;
                w1Var2.a();
                return;
            case 25:
                v9.a aVar2 = (v9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 26:
                Callable callable = (Callable) this.b;
                v9.h hVar = (v9.h) ((v4.f0) this.c).a;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e15) {
                    hVar.l(e15);
                    return;
                }
            case 27:
                ((vg.e) this.b).c((ArrayList) this.c);
                return;
            case 28:
                vg.o oVar2 = (vg.o) this.b;
                vg.q qVar = (vg.q) this.c;
                oVar2.getClass();
                try {
                    EGLDisplay eGLDisplay = oVar2.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = oVar2.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar2.k);
                        EGLSurface eGLSurface2 = qVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(oVar2.j, eGLSurface2);
                        }
                        qVar.h = EGL14.EGL_NO_SURFACE;
                        if (oVar2.g.length == 0) {
                            oVar2.b();
                        }
                    }
                    qVar.b.release();
                    return;
                } finally {
                    qVar.b.release();
                }
            default:
                ((wg.t0) this.b).a((ArrayList) this.c);
                return;
        }
    }
}
