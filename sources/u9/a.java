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
import android.widget.FrameLayout;
import b8.cg;
import ii.m2;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m5;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.x1;
import org.telegram.ui.Components.xq;
import org.telegram.ui.lk;
import org.telegram.ui.wm;
import u4.b0;
import ug.c2;
import ug.f0;
import ug.n1;
import ug.z1;
import vg.g0;
import vg.h0;
import vg.i0;
import vg.w1;
import w2.w0;
import wg.o;
import wg.q;
import wi.m0;
import wi.s;
import wi.t0;
import xg.a0;
import xg.e1;
import xg.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        int i3;
        vi.j jVar = (vi.j) this.b;
        File file = (File) this.c;
        synchronized (jVar.m) {
            while (i3 < jVar.m.size()) {
                try {
                    File file2 = (File) jVar.m.get(i3);
                    i3 = (file != null && file.equals(file2)) ? i3 + 1 : 0;
                    if (file2.exists() && !file2.delete()) {
                        jVar.h.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jVar.m.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        TLObject e22;
        TLObject e23;
        long j10 = 0;
        int i10 = 4;
        int i11 = 0;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(bVar.c);
                StrictMode.ThreadPolicy threadPolicy = bVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 1:
                Callable callable = (Callable) this.b;
                i iVar = (i) ((i9) this.c).b;
                try {
                    iVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    iVar.l(e10);
                    return;
                }
            case 2:
                f0 f0Var = (f0) this.b;
                n1 n1Var = (n1) this.c;
                n1Var.m();
                f0Var.r0(n1Var, true);
                return;
            case 3:
                ((n1) this.b).s((Bitmap) this.c);
                return;
            case 4:
                c2 c2Var = (c2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                c2Var.H = false;
                z1[] z1VarArr = (z1[]) arrayList.toArray(new z1[0]);
                c2Var.I = z1VarArr;
                if (z1VarArr.length > 0) {
                    c2Var.c0.setScaleX(0.3f);
                    c2Var.c0.setScaleY(0.3f);
                    c2Var.c0.setAlpha(0.0f);
                    c2Var.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(xq.f).start();
                    return;
                }
                return;
            case 5:
                ui.j jVar = (ui.j) this.b;
                ui.i iVar2 = (ui.i) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = iVar2.b.getInputStream();
                    while (true) {
                        synchronized (jVar.a) {
                            while (!jVar.u && jVar.m.get(Integer.valueOf(iVar2.a)) == iVar2 && (!jVar.t || !iVar2.e || iVar2.c == j10)) {
                                try {
                                    jVar.a.wait();
                                } finally {
                                }
                            }
                            if (!jVar.u && jVar.m.get(Integer.valueOf(iVar2.a)) == iVar2) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, iVar2.c));
                                if (read < 0) {
                                    jVar.e(iVar2, true);
                                    return;
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (jVar.a) {
                                        try {
                                            if (!jVar.u && jVar.m.get(Integer.valueOf(iVar2.a)) == iVar2 && jVar.t) {
                                                iVar2.c -= read;
                                                jVar.n(2, iVar2.a, bArr2);
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
                    jVar.e(iVar2, true);
                    return;
                }
            case 6:
                ui.j jVar2 = (ui.j) this.b;
                try {
                    byte[] decode = Base64.decode(((String) this.c).substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        jVar2.m(decode);
                        return;
                    }
                    jVar2.h();
                    return;
                } catch (IllegalArgumentException e11) {
                    a8.g(e11, true);
                    jVar2.h();
                    return;
                }
            case 7:
                ((ui.j) this.b).m((byte[]) this.c);
                return;
            case 8:
                i0 i0Var = (i0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = i0Var.b2;
                tj0 tj0Var = i0Var.l1;
                if (tLObject != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i0Var.B2 = false;
                    i0Var.C2.b(i0Var.g2 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= tj0Var.getChildCount()) {
                            i3 = 0;
                        } else if (tj0Var.getChildAt(i12) instanceof h0) {
                            i3 = tj0Var.getChildAt(i12).getTop();
                        } else {
                            i12++;
                        }
                    }
                    i0Var.G1();
                    if (i0Var.e2 >= 0 && i3 != 0) {
                        ((b0) tj0Var.getLayoutManager()).h1(i0Var.e2 + 1, i3);
                    }
                }
                int max = Math.max(arrayList2.size(), i0Var.F2.b);
                i0Var.q2.i(max, false);
                i0Var.q2.setBagePosition(max / i0Var.F2.c);
                g0 g0Var = i0Var.q2;
                g0Var.I = true;
                g0Var.requestLayout();
                return;
            case 9:
                ((i0) this.b).h1((v70) this.c, true);
                return;
            case 10:
                w1 w1Var = (w1) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                w7.G(w1Var.s);
                org.telegram.messenger.g0.h3(new a(11, w1Var, w7.I(document)));
                return;
            case 11:
                w1 w1Var2 = (w1) this.b;
                w1Var2.e = (File) this.c;
                w1Var2.a();
                return;
            case 12:
                vi.j jVar3 = (vi.j) this.b;
                Throwable th2 = (Throwable) this.c;
                jVar3.getClass();
                jVar3.g(th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2));
                return;
            case 13:
                a();
                return;
            case 14:
                ((g2.k) this.b).accept(this.c);
                return;
            case 15:
                ((w0) this.b).A((e3.b0) this.c);
                return;
            case 16:
                ((wg.e) this.b).c((ArrayList) this.c);
                return;
            case 17:
                o oVar = (o) this.b;
                q qVar = (q) this.c;
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
                } finally {
                    qVar.b.release();
                }
            case 18:
                ((wi.j) this.b).a0((m0) this.c);
                return;
            case 19:
                wi.j jVar4 = (wi.j) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                jVar4.k();
                wi.m mVar = jVar4.x;
                if (mVar != null) {
                    long p10 = mVar.p();
                    s sVar = jVar4.w;
                    if (sVar != null && p10 != Long.MAX_VALUE) {
                        sVar.q = Math.max(0L, p10) * 1000;
                        Handler handler = sVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(sVar.x0);
                        }
                    }
                }
                jVar4.p();
                wi.m mVar2 = jVar4.x;
                if (mVar2 != null) {
                    mVar2.u();
                    jVar4.x = null;
                }
                handlerThread.quitSafely();
                return;
            case 20:
                s sVar2 = (s) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                sVar2.getClass();
                try {
                    try {
                        sVar2.f();
                        sVar2.r0 = true;
                    } catch (RuntimeException e12) {
                        sVar2.w0 = e12;
                        sVar2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 21:
                nh nhVar = (nh) this.b;
                m0 m0Var = (m0) this.c;
                t0 t0Var = (t0) nhVar.b;
                t0Var.Q++;
                t0Var.y = true;
                t0Var.m.b("camera switch started: target=" + m0Var);
                j40 j40Var = (j40) t0Var.d.a;
                FrameLayout frameLayout = j40Var.x;
                j40Var.t0++;
                ValueAnimator valueAnimator = j40Var.c0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    j40Var.c0.cancel();
                    j40Var.c0 = null;
                }
                j40Var.o0 = true;
                j40Var.p0 = false;
                j40Var.q0 = false;
                j40Var.r0 = false;
                j40Var.s0 = SystemClock.elapsedRealtime();
                lk lkVar = j40Var.E;
                j40Var.y(false);
                Bitmap bitmap = j40Var.u0;
                if (bitmap != null) {
                    lkVar.setImageBitmap(bitmap);
                    j40Var.n0 = true;
                    lkVar.animate().cancel();
                    lkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i13 = j40Var.t0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j40Var.c0 = ofFloat;
                ofFloat.setDuration(580L);
                j40Var.c0.setInterpolator(xq.h);
                j40Var.c0.addUpdateListener(new g2(j40Var, i13, i10));
                j40Var.c0.addListener(new m2(j40Var, i13, 10));
                j40Var.c0.start();
                a8.b("RoundVideo camera flip started: facing=" + m0Var + ", minimumDurationMs=580");
                j40Var.B();
                t0Var.o();
                return;
            case 22:
                cg cgVar = (cg) this.b;
                wf.b bVar2 = (wf.b) this.c;
                if (((AtomicBoolean) cgVar.e).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 23:
                ((xg.t0) this.b).a((ArrayList) this.c);
                return;
            case 24:
                ((v) this.b).a((TLRPC.TL_error) this.c);
                return;
            case 25:
                qr qrVar = (qr) this.b;
                u10 u10Var = (u10) this.c;
                HashMap h02 = qrVar.h0();
                if (h02.isEmpty()) {
                    return;
                }
                org.telegram.messenger.g0.h3(new x1(u10Var, h02, 1));
                return;
            case 26:
                ((ei) this.b).a((ArrayList) this.c);
                return;
            case 27:
                ac I = fc.a0((wm) this.b).I(R.raw.stars_send, bd.M0(2131745102, null), org.telegram.messenger.g0.X2(bd.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 28:
                hs.f(h10.t0).k(hs.V2, ((a0) this.b).U1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.c);
                return;
            default:
                e1 e1Var = (e1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = e1Var.d2;
                arrayList3.clear();
                e1Var.q2 = -1;
                if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                    hp s12 = hp.s1(e1Var.a);
                    s12.Y3(tL_contacts_found.users, false);
                    s12.S3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList4 = tL_contacts_found.my_results;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TLRPC.Peer peer = arrayList4.get(i14);
                        i14++;
                        long o10 = m5.o(peer);
                        if (!hashSet.contains(Long.valueOf(o10)) && (e23 = s12.e2(o10)) != null) {
                            arrayList3.add(e23);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList5 = tL_contacts_found.results;
                    int size2 = arrayList5.size();
                    while (i11 < size2) {
                        TLRPC.Peer peer2 = arrayList5.get(i11);
                        i11++;
                        long o11 = m5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o11)) && (e22 = s12.e2(o11)) != null) {
                            arrayList3.add(e22);
                            hashSet.add(Long.valueOf(o11));
                        }
                    }
                }
                e1Var.p1(true, true);
                return;
        }
    }
}
