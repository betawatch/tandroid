package u9;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import f3.c0;
import hi.m2;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
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
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x1;
import org.telegram.ui.Components.z70;
import org.telegram.ui.cn;
import org.telegram.ui.rk;
import ug.g0;
import ug.h0;
import ug.i0;
import ug.t1;
import v4.b0;
import wg.f1;
import wg.t0;
import wg.u;
import wg.z;
import wi.m0;
import wi.t;
import x2.v0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    private final void a() {
        o oVar = (o) this.c;
        ua.b bVar = (ua.b) this.b;
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

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        ui.i iVar = (ui.i) this.c;
        ui.h hVar = (ui.h) this.b;
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

    private final void c() {
        int i7;
        vi.h hVar = (vi.h) this.c;
        File file = (File) this.b;
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
        ua.a aVar;
        int i7;
        TLObject e22;
        TLObject e23;
        int i10 = 4;
        int i11 = 0;
        switch (this.a) {
            case 0:
                p pVar = (p) this.c;
                ua.b bVar = (ua.b) this.b;
                if (pVar.b != p.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    aVar = pVar.a;
                    pVar.a = null;
                    pVar.b = bVar;
                }
                aVar.c(bVar);
                return;
            case 1:
                a();
                return;
            case 2:
                l9 l9Var = (l9) this.c;
                View view = (View) this.b;
                ue.a aVar2 = (ue.a) l9Var.d;
                if ((2 & l9Var.a) != 0) {
                    if (!aVar2.c1(view, l9Var.b, l9Var.c)) {
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
            case 3:
                i0 i0Var = (i0) this.c;
                TLObject tLObject = (TLObject) this.b;
                ArrayList arrayList = i0Var.d2;
                pj0 pj0Var = i0Var.n1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i0Var.D2 = false;
                    i0Var.E2.b(i0Var.i2 + 4);
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
                    if (i0Var.g2 >= 0 && i7 != 0) {
                        ((b0) pj0Var.getLayoutManager()).h1(i0Var.g2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList.size(), i0Var.H2.b);
                i0Var.s2.i(max, false);
                i0Var.s2.setBagePosition(max / i0Var.H2.c);
                g0 g0Var = i0Var.s2;
                g0Var.H = true;
                g0Var.requestLayout();
                return;
            case 4:
                ((i0) this.c).h1((z70) this.b, true);
                return;
            case 5:
                t1 t1Var = (t1) this.c;
                TLRPC.Document document = (TLRPC.Document) this.b;
                w7.G(t1Var.s);
                org.telegram.messenger.g0.h3(new f(6, t1Var, w7.I(document)));
                return;
            case 6:
                t1 t1Var2 = (t1) this.c;
                t1Var2.e = (File) this.b;
                t1Var2.a();
                return;
            case 7:
                b();
                return;
            case 8:
                ui.i iVar = (ui.i) this.c;
                try {
                    byte[] decode = Base64.decode(((String) this.b).substring(14), 2);
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
            case 9:
                ((ui.i) this.c).m((byte[]) this.b);
                return;
            case 10:
                v9.a aVar3 = (v9.a) this.c;
                Runnable runnable = (Runnable) this.b;
                Process.setThreadPriority(aVar3.c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 11:
                Callable callable = (Callable) this.c;
                v9.h hVar = (v9.h) ((qt) this.b).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e11) {
                    hVar.l(e11);
                    return;
                }
            case 12:
                ((vg.e) this.c).c((ArrayList) this.b);
                return;
            case 13:
                vg.o oVar = (vg.o) this.c;
                vg.q qVar = (vg.q) this.b;
                oVar.getClass();
                try {
                    EGLDisplay eGLDisplay = oVar.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = oVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar.k);
                        EGLSurface eGLSurface2 = qVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(oVar.j, eGLSurface2);
                        }
                        qVar.h = EGL14.EGL_NO_SURFACE;
                        if (oVar.g.length == 0) {
                            oVar.b();
                        }
                    }
                    qVar.b.release();
                    return;
                } catch (Throwable th2) {
                    qVar.b.release();
                    throw th2;
                }
            case 14:
                vi.h hVar2 = (vi.h) this.c;
                Throwable th3 = (Throwable) this.b;
                hVar2.getClass();
                hVar2.g(th3 instanceof Exception ? (Exception) th3 : new RuntimeException(th3));
                return;
            case 15:
                c();
                return;
            case 16:
                ((t0) this.c).a((ArrayList) this.b);
                return;
            case 17:
                ((u) this.c).a((TLRPC.TL_error) this.b);
                return;
            case 18:
                yr yrVar = (yr) this.c;
                c20 c20Var = (c20) this.b;
                HashMap h02 = yrVar.h0();
                if (h02.isEmpty()) {
                    return;
                }
                org.telegram.messenger.g0.h3(new x1(c20Var, h02, 1));
                return;
            case 19:
                ((ex) this.c).a((ArrayList) this.b);
                return;
            case 20:
                bc I = gc.a0((cn) this.c).I(R.raw.stars_send, id.M0(2131745092, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.b).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 21:
                qs.f(p10.s0).k(qs.V2, ((z) this.c).W1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.b);
                return;
            case 22:
                f1 f1Var = (f1) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                ArrayList arrayList2 = f1Var.f2;
                arrayList2.clear();
                f1Var.s2 = -1;
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
                    while (i11 < size2) {
                        TLRPC.Peer peer2 = arrayList4.get(i11);
                        i11++;
                        long o10 = m5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o10)) && (e22 = s12.e2(o10)) != null) {
                            arrayList2.add(e22);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                }
                f1Var.p1(true, true);
                return;
            case 23:
                wh.i iVar2 = (wh.i) this.c;
                iVar2.b.add((String) this.b);
                iVar2.invalidate();
                return;
            case 24:
                ((wi.k) this.c).Y((m0) this.b);
                return;
            case 25:
                wi.k kVar = (wi.k) this.c;
                HandlerThread handlerThread = (HandlerThread) this.b;
                kVar.j();
                wi.n nVar = kVar.w;
                if (nVar != null) {
                    long p10 = nVar.p();
                    t tVar = kVar.v;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.q = Math.max(0L, p10) * 1000;
                        Handler handler = tVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.y0);
                        }
                    }
                }
                kVar.n();
                wi.n nVar2 = kVar.w;
                if (nVar2 != null) {
                    nVar2.u();
                    kVar.w = null;
                }
                if (kVar.w0 <= 0) {
                    handlerThread.quitSafely();
                    return;
                }
                kVar.j.b("release waits for camera open results: pending=" + kVar.w0);
                kVar.x0 = handlerThread;
                return;
            case 26:
                t tVar2 = (t) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f();
                        tVar2.r0 = true;
                    } finally {
                        countDownLatch.countDown();
                    }
                } catch (RuntimeException e12) {
                    tVar2.x0 = e12;
                    tVar2.i();
                }
                return;
            case 27:
                qt qtVar = (qt) this.c;
                m0 m0Var = (m0) this.b;
                wi.t0 t0Var = (wi.t0) qtVar.b;
                t0Var.R++;
                t0Var.y = true;
                t0Var.m.b("camera switch started: target=" + m0Var);
                n40 n40Var = (n40) t0Var.d.b;
                FrameLayout frameLayout = n40Var.x;
                n40Var.t0++;
                ValueAnimator valueAnimator = n40Var.c0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    n40Var.c0.cancel();
                    n40Var.c0 = null;
                }
                n40Var.o0 = true;
                n40Var.p0 = false;
                n40Var.q0 = false;
                n40Var.r0 = false;
                n40Var.s0 = SystemClock.elapsedRealtime();
                rk rkVar = n40Var.D;
                n40Var.A(false);
                Bitmap bitmap = n40Var.u0;
                if (bitmap != null) {
                    rkVar.setImageBitmap(bitmap);
                    n40Var.n0 = true;
                    rkVar.animate().cancel();
                    rkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i14 = n40Var.t0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                n40Var.c0 = ofFloat;
                ofFloat.setDuration(580L);
                n40Var.c0.setInterpolator(wq.h);
                n40Var.c0.addUpdateListener(new i2(n40Var, i14, i10));
                n40Var.c0.addListener(new m2(n40Var, i14, 10));
                n40Var.c0.start();
                a8.b("RoundVideo camera flip started: facing=" + m0Var + ", minimumDurationMs=580");
                n40Var.D();
                t0Var.o();
                return;
            case 28:
                ((h2.j) this.c).accept(this.b);
                return;
            default:
                ((v0) this.c).y((c0) this.b);
                return;
        }
    }
}
