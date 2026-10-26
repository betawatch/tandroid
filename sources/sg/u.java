package sg;

import a8.fg;
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
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.gl;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    private final void a() {
        int i10;
        ui.o oVar = (ui.o) this.c;
        File file = (File) this.b;
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

    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        long j10 = 0;
        int i11 = 4;
        int i12 = 8;
        int i13 = 1;
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.c;
                z1 z1Var = (z1) this.b;
                z1Var.m();
                n0Var.q0(z1Var, true);
                return;
            case 1:
                ((z1) this.b).s((Bitmap) this.c);
                return;
            case 2:
                p2 p2Var = (p2) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                p2Var.G = false;
                m2[] m2VarArr = (m2[]) arrayList.toArray(new m2[0]);
                p2Var.H = m2VarArr;
                if (m2VarArr.length > 0) {
                    p2Var.b0.setScaleX(0.3f);
                    p2Var.b0.setScaleY(0.3f);
                    p2Var.b0.setAlpha(0.0f);
                    p2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(ds.f).start();
                    return;
                }
                return;
            case 3:
                t9.a aVar = (t9.a) this.c;
                Runnable runnable = (Runnable) this.b;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 4:
                Callable callable = (Callable) this.c;
                t9.h hVar = (t9.h) ((e3) this.b).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 5:
                tg.j0 j0Var = (tg.j0) this.c;
                TLObject tLObject = (TLObject) this.b;
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
                        } else if (mm0Var.getChildAt(i14) instanceof tg.i0) {
                            i10 = mm0Var.getChildAt(i14).getTop();
                        } else {
                            i14++;
                        }
                    }
                    j0Var.Q1();
                    if (j0Var.l0 >= 0 && i10 != 0) {
                        ((s4.c0) mm0Var.getLayoutManager()).h1(j0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), j0Var.M0.b);
                j0Var.x0.i(max, false);
                j0Var.x0.setBagePosition(max / j0Var.M0.c);
                tg.h0 h0Var = j0Var.x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 6:
                ((tg.j0) this.c).q1((ca0) this.b, true);
                return;
            case 7:
                tg.a2 a2Var = (tg.a2) this.c;
                AndroidUtilities.runOnUIThread(new u(i12, a2Var, FileLoader.getInstance(a2Var.s).getPathToAttach((TLRPC.Document) this.b)));
                return;
            case 8:
                tg.a2 a2Var2 = (tg.a2) this.c;
                a2Var2.e = (File) this.b;
                a2Var2.a();
                return;
            case 9:
                ti.j jVar = (ti.j) this.c;
                ti.i iVar = (ti.i) this.b;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = iVar.b.getInputStream();
                    while (true) {
                        synchronized (jVar.a) {
                            while (!jVar.u && jVar.m.get(Integer.valueOf(iVar.a)) == iVar && (!jVar.t || !iVar.e || iVar.c == j10)) {
                                try {
                                    jVar.a.wait();
                                } finally {
                                }
                            }
                            if (!jVar.u && jVar.m.get(Integer.valueOf(iVar.a)) == iVar) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, iVar.c));
                                if (read < 0) {
                                    jVar.c(iVar, true);
                                    return;
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (jVar.a) {
                                        try {
                                            if (!jVar.u && jVar.m.get(Integer.valueOf(iVar.a)) == iVar && jVar.t) {
                                                iVar.c -= read;
                                                jVar.l(2, iVar.a, bArr2);
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
                    jVar.c(iVar, true);
                    return;
                }
            case 10:
                ti.j jVar2 = (ti.j) this.c;
                String str = (String) this.b;
                jVar2.getClass();
                try {
                    byte[] decode = Base64.decode(str.substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        jVar2.k(decode);
                        return;
                    }
                    jVar2.f();
                    return;
                } catch (IllegalArgumentException e10) {
                    FileLog.e(e10);
                    jVar2.f();
                    return;
                }
            case 11:
                ((ti.j) this.c).k((byte[]) this.b);
                return;
            case 12:
                ((e2.j) this.c).accept(this.b);
                return;
            case 13:
                ((u2.w0) this.c).y((c3.b0) this.b);
                return;
            case 14:
                ((ug.f) this.c).c((ArrayList) this.b);
                return;
            case 15:
                ug.p pVar = (ug.p) this.c;
                ug.r rVar = (ug.r) this.b;
                pVar.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar.k);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar.j, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar.g.length == 0) {
                            pVar.b();
                        }
                    }
                    rVar.b.release();
                    return;
                } finally {
                    rVar.b.release();
                }
            case 16:
                ui.o oVar = (ui.o) this.c;
                Throwable th2 = (Throwable) this.b;
                oVar.getClass();
                oVar.g(th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2));
                return;
            case 17:
                a();
                return;
            case 18:
                fg fgVar = (fg) this.c;
                uf.b bVar = (uf.b) this.b;
                if (((AtomicBoolean) fgVar.e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 19:
                ((vg.w0) this.c).run((ArrayList) this.b);
                return;
            case 20:
                ((vg.v) this.c).run((TLRPC.TL_error) this.b);
                return;
            case 21:
                ((oy) this.c).run((ArrayList) this.b);
                return;
            case 22:
                MessagesStorage messagesStorage = (MessagesStorage) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(callback, smallGroupsParticipantsCount, i13));
                return;
            case 23:
                qc M = wc.b0((un) this.c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.b).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 24:
                vg.a0 a0Var = (vg.a0) this.c;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 25:
                vg.n1.P((vg.n1) this.c, (TLObject) this.b);
                return;
            case 26:
                ((vi.j) this.c).a0((vi.l0) this.b);
                return;
            case 27:
                vi.j jVar3 = (vi.j) this.c;
                HandlerThread handlerThread = (HandlerThread) this.b;
                jVar3.k();
                vi.m mVar = jVar3.x;
                if (mVar != null) {
                    long l4 = mVar.l();
                    vi.s sVar = jVar3.w;
                    if (sVar != null && l4 != Long.MAX_VALUE) {
                        sVar.q = Math.max(0L, l4) * 1000;
                        Handler handler = sVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(sVar.x0);
                        }
                    }
                }
                jVar3.p();
                vi.m mVar2 = jVar3.x;
                if (mVar2 != null) {
                    mVar2.q();
                    jVar3.x = null;
                }
                handlerThread.quitSafely();
                return;
            case 28:
                vi.s sVar2 = (vi.s) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                sVar2.getClass();
                try {
                    try {
                        sVar2.f();
                        sVar2.r0 = true;
                    } catch (RuntimeException e11) {
                        sVar2.w0 = e11;
                        sVar2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            default:
                e3 e3Var = (e3) this.c;
                vi.l0 l0Var = (vi.l0) this.b;
                vi.s0 s0Var = (vi.s0) e3Var.b;
                s0Var.N++;
                s0Var.w = true;
                s0Var.m.b("camera switch started: target=" + l0Var);
                n60 n60Var = (n60) s0Var.d.b;
                FrameLayout frameLayout = n60Var.x;
                n60Var.s0++;
                ValueAnimator valueAnimator = n60Var.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    n60Var.b0.cancel();
                    n60Var.b0 = null;
                }
                n60Var.n0 = true;
                n60Var.o0 = false;
                n60Var.p0 = false;
                n60Var.q0 = false;
                n60Var.r0 = SystemClock.elapsedRealtime();
                gl glVar = n60Var.E;
                n60Var.v(false);
                Bitmap bitmap = n60Var.t0;
                if (bitmap != null) {
                    glVar.setImageBitmap(bitmap);
                    n60Var.m0 = true;
                    glVar.animate().cancel();
                    glVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i15 = n60Var.s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                n60Var.b0 = ofFloat;
                ofFloat.setDuration(580L);
                n60Var.b0.setInterpolator(ds.h);
                n60Var.b0.addUpdateListener(new org.telegram.ui.ActionBar.u2(n60Var, i15, i11));
                n60Var.b0.addListener(new hi.y2(n60Var, i15, i12));
                n60Var.b0.start();
                FileLog.d("RoundVideo camera flip started: facing=" + l0Var + ", minimumDurationMs=580");
                n60Var.y();
                s0Var.o();
                return;
        }
    }

    public /* synthetic */ u(z1 z1Var, Bitmap bitmap) {
        this.a = 1;
        this.b = z1Var;
        this.c = bitmap;
    }
}
