package p4;

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
import android.os.StrictMode;
import android.text.SpannableString;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import di.o9;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import org.telegram.messenger.a8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ph;
import tg.b2;
import tg.e2;
import ug.x1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.b;
        o0 o0Var = (o0) this.c;
        cVar.c.j();
        u2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            o0Var.run();
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
        ji.j jVar;
        ji.j jVar2;
        int i7;
        Object obj = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.b;
                l lVar = (l) this.c;
                ab.c0 c0Var = e1Var.b;
                v r10 = c0Var.r(lVar.asBinder());
                if (r10 != null) {
                    c0Var.K(r10);
                    return;
                }
                return;
            case 1:
                ((e1) this.b).b.l((v) this.c);
                return;
            case 2:
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
            case 3:
                ((o9) this.b).a((SpannableString) this.c);
                return;
            case 4:
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
                                    qi.l lVar2 = (qi.l) pVar.h.get(nVar);
                                    if (lVar2 != null) {
                                        jVar2 = lVar2.a;
                                    } else {
                                        int i12 = 26;
                                        if (pVar.a()) {
                                            try {
                                                com.google.android.gms.internal.play_billing.s0 c10 = pVar.w.a.c(nVar.a, nVar.b);
                                                c10.b();
                                                jVar = new ji.j(i12, c10, obj);
                                            } catch (LinkageError | OutOfMemoryError | RuntimeException e10) {
                                                if (pVar.c != null) {
                                                    try {
                                                        a8.g(e10, true);
                                                    } catch (LinkageError | RuntimeException unused) {
                                                    }
                                                }
                                                jVar = new ji.j(i12, obj, e10);
                                            }
                                            jVar2 = jVar;
                                        } else {
                                            jVar2 = new ji.j(i12, obj, pVar.x);
                                        }
                                    }
                                    synchronized (pVar.a) {
                                        try {
                                            if (pVar.s) {
                                                return;
                                            }
                                            if (lVar2 == null && ((Throwable) jVar2.c) == null) {
                                                pVar.c(nVar, jVar2);
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
                                                        mVar.a(jVar2);
                                                    }
                                                } catch (LinkageError | RuntimeException e11) {
                                                    if (pVar.c != null) {
                                                        try {
                                                            a8.g(e11, true);
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
            case 5:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 6:
                r2.p pVar2 = (r2.p) this.b;
                r2.i iVar = (r2.i) this.c;
                of ofVar = pVar2.c;
                Uri uri = iVar.y;
                s2.c cVar = (s2.c) ((r2.j) ofVar.b).b.d.get(uri);
                if (cVar != null) {
                    s2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 7:
                s2.b bVar = (s2.b) this.b;
                Uri uri2 = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri2);
                return;
            case 8:
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
            case 9:
                sg.u0 u0Var = (sg.u0) this.b;
                Runnable runnable = (Runnable) this.c;
                sg.s0 s0Var = u0Var.d;
                if (s0Var == null || !s0Var.f) {
                    return;
                }
                sg.s0.a(s0Var);
                runnable.run();
                return;
            case 10:
                tg.g0 g0Var = (tg.g0) this.b;
                tg.n1 n1Var = (tg.n1) this.c;
                n1Var.m();
                g0Var.r0(n1Var, true);
                return;
            case 11:
                ((tg.n1) this.b).s((Bitmap) this.c);
                return;
            case 12:
                e2 e2Var = (e2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                e2Var.H = false;
                b2[] b2VarArr = (b2[]) arrayList3.toArray(new b2[0]);
                e2Var.I = b2VarArr;
                if (b2VarArr.length > 0) {
                    e2Var.c0.setScaleX(0.3f);
                    e2Var.c0.setScaleY(0.3f);
                    e2Var.c0.setAlpha(0.0f);
                    e2Var.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(lr.f).start();
                    return;
                }
                return;
            case 13:
                a();
                return;
            case 14:
                u2.r rVar = (u2.r) this.b;
                rVar.U.set(rVar.w((k8.a) this.c, rVar.O, 0));
                return;
            case 15:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i13 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 16:
                b();
                return;
            case 17:
                c();
                return;
            case 18:
                m9 m9Var = (m9) this.b;
                View view = (View) this.c;
                ue.a aVar = (ue.a) m9Var.d;
                if ((m9Var.a & 2) != 0) {
                    if (!aVar.Z0(view, m9Var.b, m9Var.c)) {
                        m9Var.a |= 8;
                        return;
                    }
                    m9Var.a &= -3;
                    m9Var.e = null;
                    view.performHapticFeedback(0);
                    m9Var.a = (m9Var.a | 4) & (-11);
                    m9Var.e = null;
                    return;
                }
                return;
            case 19:
                ug.l0 l0Var = (ug.l0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList4 = l0Var.e2;
                ck0 ck0Var = l0Var.o1;
                if (tLObject != null) {
                    arrayList4.clear();
                    arrayList4.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    l0Var.E2 = false;
                    l0Var.F2.b(l0Var.j2 + 4);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= ck0Var.getChildCount()) {
                            i7 = 0;
                        } else if (ck0Var.getChildAt(i14) instanceof ug.k0) {
                            i7 = ck0Var.getChildAt(i14).getTop();
                        } else {
                            i14++;
                        }
                    }
                    l0Var.H1();
                    if (l0Var.h2 >= 0 && i7 != 0) {
                        ((v4.c0) ck0Var.getLayoutManager()).h1(l0Var.h2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList4.size(), l0Var.I2.b);
                l0Var.t2.i(max, false);
                l0Var.t2.setBagePosition(max / l0Var.I2.c);
                ug.j0 j0Var = l0Var.t2;
                j0Var.I = true;
                j0Var.requestLayout();
                return;
            case 20:
                ((ug.l0) this.b).i1((n80) this.c, true);
                return;
            case 21:
                x1 x1Var = (x1) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                w7.G(x1Var.s);
                org.telegram.messenger.g0.g3(new o0(22, x1Var, w7.I(document)));
                return;
            case 22:
                x1 x1Var2 = (x1) this.b;
                x1Var2.e = (File) this.c;
                x1Var2.a();
                return;
            case 23:
                v9.a aVar2 = (v9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 24:
                Callable callable = (Callable) this.b;
                v9.h hVar = (v9.h) ((v4.f0) this.c).a;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e12) {
                    hVar.l(e12);
                    return;
                }
            case 25:
                ((vg.e) this.b).c((ArrayList) this.c);
                return;
            case 26:
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
            case 27:
                ((wg.t0) this.b).a((ArrayList) this.c);
                return;
            case 28:
                ((wg.v) this.b).a((TLRPC.TL_error) this.c);
                return;
            default:
                ((ph) this.b).a((ArrayList) this.c);
                return;
        }
    }
}
