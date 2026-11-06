package ti;

import android.app.job.JobParameters;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import android.view.View;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.y1;
import org.telegram.ui.Components.z70;
import org.telegram.ui.an;
import ug.g0;
import ug.h0;
import ug.i0;
import ug.t1;
import v4.b0;
import wg.a0;
import wg.f1;
import wg.t0;
import wg.v;
import wi.m0;
import wi.t;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
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
        aVar.c(bVar);
    }

    private final void b() {
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

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        ui.i iVar = (ui.i) this.b;
        ui.h hVar = (ui.h) this.c;
        byte[] bArr = new byte[65536];
        try {
            InputStream inputStream = hVar.b.getInputStream();
            while (true) {
                synchronized (iVar.a) {
                    while (!iVar.u && iVar.m.get(Integer.valueOf(hVar.a)) == hVar && (!iVar.t || !hVar.e || hVar.c == 0)) {
                        try {
                            iVar.a.wait();
                        } finally {
                        }
                    }
                    if (iVar.u || iVar.m.get(Integer.valueOf(hVar.a)) != hVar) {
                        break;
                    }
                    int read = inputStream.read(bArr, 0, (int) Math.min(65536L, hVar.c));
                    if (read < 0) {
                        iVar.e(hVar, true);
                        return;
                    }
                    if (read != 0) {
                        byte[] bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                        synchronized (iVar.a) {
                            try {
                                if (iVar.u || iVar.m.get(Integer.valueOf(hVar.a)) != hVar || !iVar.t) {
                                    break;
                                }
                                hVar.c -= read;
                                iVar.n(2, hVar.a, bArr2);
                            } finally {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            iVar.e(hVar, true);
        }
    }

    private final void d() {
        int i7;
        vi.h hVar = (vi.h) this.b;
        File file = (File) this.c;
        synchronized (hVar.m) {
            while (i7 < hVar.m.size()) {
                try {
                    File file2 = (File) hVar.m.get(i7);
                    i7 = (file != null && file.equals(file2)) ? i7 + 1 : 0;
                    if (file2.exists() && !file2.delete()) {
                        hVar.h.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hVar.m.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        TLObject e22;
        TLObject e23;
        int i10 = 0;
        switch (this.a) {
            case 0:
                q qVar = (q) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                if (qVar.a == surfaceTexture && qVar.getSurfaceTexture() == null) {
                    qVar.setSurfaceTexture(surfaceTexture);
                    return;
                }
                return;
            case 1:
                u2.c cVar = (u2.c) this.b;
                p pVar = (p) this.c;
                cVar.c.i();
                u2.f fVar = cVar.b;
                synchronized (fVar.a) {
                    fVar.b();
                    pVar.run();
                }
                return;
            case 2:
                u2.r rVar = (u2.r) this.b;
                rVar.T.set(rVar.w((wf.b) this.c, rVar.N, 0));
                return;
            case 3:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i11 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 4:
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                l9 l9Var = (l9) this.b;
                View view = (View) this.c;
                ue.a aVar = (ue.a) l9Var.d;
                if ((2 & l9Var.a) != 0) {
                    if (!aVar.c1(view, l9Var.b, l9Var.c)) {
                        l9Var.a = 8 | l9Var.a;
                        return;
                    }
                    l9Var.a &= -3;
                    l9Var.e = null;
                    view.performHapticFeedback(0);
                    l9Var.a = (l9Var.a | 4) & (-11);
                    l9Var.e = null;
                    return;
                }
                return;
            case 7:
                i0 i0Var = (i0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = i0Var.a2;
                pj0 pj0Var = i0Var.k1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i0Var.A2 = false;
                    i0Var.B2.b(i0Var.f2 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= pj0Var.getChildCount()) {
                            i7 = 0;
                        } else if (pj0Var.getChildAt(i12) instanceof h0) {
                            i7 = pj0Var.getChildAt(i12).getTop();
                        } else {
                            i12++;
                        }
                    }
                    i0Var.G1();
                    if (i0Var.d2 >= 0 && i7 != 0) {
                        ((b0) pj0Var.getLayoutManager()).h1(i0Var.d2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList.size(), i0Var.E2.b);
                i0Var.p2.i(max, false);
                i0Var.p2.setBagePosition(max / i0Var.E2.c);
                g0 g0Var = i0Var.p2;
                g0Var.H = true;
                g0Var.requestLayout();
                return;
            case 8:
                ((i0) this.b).h1((z70) this.c, true);
                return;
            case 9:
                t1 t1Var = (t1) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                w7.G(t1Var.s);
                org.telegram.messenger.g0.h3(new p(10, t1Var, w7.I(document)));
                return;
            case 10:
                t1 t1Var2 = (t1) this.b;
                t1Var2.e = (File) this.c;
                t1Var2.a();
                return;
            case 11:
                c();
                return;
            case 12:
                ui.i iVar = (ui.i) this.b;
                try {
                    byte[] decode = Base64.decode(((String) this.c).substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        iVar.m(decode);
                        return;
                    }
                    iVar.h();
                    return;
                } catch (IllegalArgumentException e10) {
                    a8.g(e10, true);
                    iVar.h();
                    return;
                }
            case 13:
                ((ui.i) this.b).m((byte[]) this.c);
                return;
            case 14:
                v9.a aVar2 = (v9.a) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 15:
                Callable callable = (Callable) this.b;
                v9.h hVar = (v9.h) ((qt) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e11) {
                    hVar.l(e11);
                    return;
                }
            case 16:
                ((vg.e) this.b).c((ArrayList) this.c);
                return;
            case 17:
                vg.o oVar = (vg.o) this.b;
                vg.q qVar2 = (vg.q) this.c;
                oVar.getClass();
                try {
                    EGLDisplay eGLDisplay = oVar.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = oVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar.k);
                        EGLSurface eGLSurface2 = qVar2.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(oVar.j, eGLSurface2);
                        }
                        qVar2.h = EGL14.EGL_NO_SURFACE;
                        if (oVar.g.length == 0) {
                            oVar.b();
                        }
                    }
                    qVar2.b.release();
                    return;
                } catch (Throwable th2) {
                    qVar2.b.release();
                    throw th2;
                }
            case 18:
                vi.h hVar2 = (vi.h) this.b;
                Throwable th3 = (Throwable) this.c;
                hVar2.getClass();
                hVar2.g(th3 instanceof Exception ? (Exception) th3 : new RuntimeException(th3));
                return;
            case 19:
                d();
                return;
            case 20:
                ((t0) this.b).a((ArrayList) this.c);
                return;
            case 21:
                ((v) this.b).a((TLRPC.TL_error) this.c);
                return;
            case 22:
                yr yrVar = (yr) this.b;
                c20 c20Var = (c20) this.c;
                HashMap h02 = yrVar.h0();
                if (h02.isEmpty()) {
                    return;
                }
                org.telegram.messenger.g0.h3(new y1(c20Var, h02, 1));
                return;
            case 23:
                ((ex) this.b).a((ArrayList) this.c);
                return;
            case 24:
                cc I = hc.a0((an) this.b).I(R.raw.stars_send, hd.M0(2131745093, null), org.telegram.messenger.g0.X2(hd.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 25:
                qs.f(p10.s0).k(qs.V2, ((a0) this.b).T1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.c);
                return;
            case 26:
                f1 f1Var = (f1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = f1Var.c2;
                arrayList2.clear();
                f1Var.p2 = -1;
                if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                    qp s12 = qp.s1(f1Var.a);
                    s12.Y3(tL_contacts_found.users, false);
                    s12.S3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.my_results;
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.Peer peer = arrayList3.get(i13);
                        i13++;
                        long o4 = m5.o(peer);
                        if (!hashSet.contains(Long.valueOf(o4)) && (e23 = s12.e2(o4)) != null) {
                            arrayList2.add(e23);
                            hashSet.add(Long.valueOf(o4));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList4 = tL_contacts_found.results;
                    int size2 = arrayList4.size();
                    while (i10 < size2) {
                        TLRPC.Peer peer2 = arrayList4.get(i10);
                        i10++;
                        long o10 = m5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o10)) && (e22 = s12.e2(o10)) != null) {
                            arrayList2.add(e22);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                }
                f1Var.p1(true, true);
                return;
            case 27:
                wh.i iVar2 = (wh.i) this.b;
                iVar2.b.add((String) this.c);
                iVar2.invalidate();
                return;
            case 28:
                ((wi.j) this.b).a0((m0) this.c);
                return;
            default:
                wi.j jVar = (wi.j) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                jVar.k();
                wi.m mVar = jVar.x;
                if (mVar != null) {
                    long p10 = mVar.p();
                    t tVar = jVar.w;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.q = Math.max(0L, p10) * 1000;
                        Handler handler = tVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.x0);
                        }
                    }
                }
                jVar.p();
                wi.m mVar2 = jVar.x;
                if (mVar2 != null) {
                    mVar2.u();
                    jVar.x = null;
                }
                handlerThread.quitSafely();
                return;
        }
    }
}
