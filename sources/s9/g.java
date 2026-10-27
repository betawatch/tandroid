package s9;

import a8.fg;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import c3.b0;
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
import org.telegram.ui.Components.c2;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;
import s4.c0;
import sg.l2;
import sg.m0;
import sg.o2;
import sg.y1;
import tg.a2;
import tg.h0;
import tg.i0;
import tg.j0;
import u2.w0;
import vg.a0;
import vg.n1;
import vg.v;
import vi.n0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        ti.j jVar = (ti.j) this.b;
        ti.i iVar = (ti.i) this.c;
        byte[] bArr = new byte[65536];
        try {
            InputStream inputStream = iVar.b.getInputStream();
            while (true) {
                synchronized (jVar.a) {
                    while (!jVar.u && jVar.m.get(Integer.valueOf(iVar.a)) == iVar && (!jVar.t || !iVar.e || iVar.c == 0)) {
                        try {
                            jVar.a.wait();
                        } finally {
                        }
                    }
                    if (jVar.u || jVar.m.get(Integer.valueOf(iVar.a)) != iVar) {
                        break;
                    }
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
                                if (jVar.u || jVar.m.get(Integer.valueOf(iVar.a)) != iVar || !jVar.t) {
                                    break;
                                }
                                iVar.c -= read;
                                jVar.l(2, iVar.a, bArr2);
                            } finally {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            jVar.c(iVar, true);
        }
    }

    private final void b() {
        int i10;
        ui.o oVar = (ui.o) this.b;
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

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = 1;
        switch (this.a) {
            case 0:
                p pVar = (p) this.b;
                ra.b bVar = (ra.b) this.c;
                synchronized (pVar) {
                    try {
                        if (pVar.b == null) {
                            pVar.a.add(bVar);
                        } else {
                            pVar.b.add(bVar.get());
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                m0 m0Var = (m0) this.b;
                y1 y1Var = (y1) this.c;
                y1Var.m();
                m0Var.q0(y1Var, true);
                return;
            case 2:
                ((y1) this.b).s((Bitmap) this.c);
                return;
            case 3:
                o2 o2Var = (o2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                o2Var.G = false;
                l2[] l2VarArr = (l2[]) arrayList.toArray(new l2[0]);
                o2Var.H = l2VarArr;
                if (l2VarArr.length > 0) {
                    o2Var.b0.setScaleX(0.3f);
                    o2Var.b0.setScaleY(0.3f);
                    o2Var.b0.setAlpha(0.0f);
                    o2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(ds.f).start();
                    return;
                }
                return;
            case 4:
                t9.a aVar = (t9.a) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 5:
                Callable callable = (Callable) this.b;
                t9.h hVar = (t9.h) ((e3) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 6:
                j0 j0Var = (j0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = j0Var.i0;
                nm0 nm0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.n0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= nm0Var.getChildCount()) {
                            i10 = 0;
                        } else if (nm0Var.getChildAt(i12) instanceof i0) {
                            i10 = nm0Var.getChildAt(i12).getTop();
                        } else {
                            i12++;
                        }
                    }
                    j0Var.Q1();
                    if (j0Var.l0 >= 0 && i10 != 0) {
                        ((c0) nm0Var.getLayoutManager()).h1(j0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), j0Var.M0.b);
                j0Var.x0.i(max, false);
                j0Var.x0.setBagePosition(max / j0Var.M0.c);
                h0 h0Var = j0Var.x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 7:
                ((j0) this.b).q1((da0) this.c, true);
                return;
            case 8:
                a2 a2Var = (a2) this.b;
                AndroidUtilities.runOnUIThread(new g(9, a2Var, FileLoader.getInstance(a2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 9:
                a2 a2Var2 = (a2) this.b;
                a2Var2.e = (File) this.c;
                a2Var2.a();
                return;
            case 10:
                a();
                return;
            case 11:
                ti.j jVar = (ti.j) this.b;
                String str = (String) this.c;
                jVar.getClass();
                try {
                    byte[] decode = Base64.decode(str.substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        jVar.k(decode);
                        return;
                    }
                    jVar.f();
                    return;
                } catch (IllegalArgumentException e10) {
                    FileLog.e(e10);
                    jVar.f();
                    return;
                }
            case 12:
                ((ti.j) this.b).k((byte[]) this.c);
                return;
            case 13:
                ((e2.j) this.b).accept(this.c);
                return;
            case 14:
                ((w0) this.b).y((b0) this.c);
                return;
            case 15:
                ((ug.f) this.b).c((ArrayList) this.c);
                return;
            case 16:
                ug.p pVar2 = (ug.p) this.b;
                ug.r rVar = (ug.r) this.c;
                pVar2.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar2.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar2.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar2.k);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar2.j, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar2.g.length == 0) {
                            pVar2.b();
                        }
                    }
                    rVar.b.release();
                    return;
                } catch (Throwable th2) {
                    rVar.b.release();
                    throw th2;
                }
            case 17:
                ui.o oVar = (ui.o) this.b;
                Throwable th3 = (Throwable) this.c;
                oVar.getClass();
                oVar.g(th3 instanceof Exception ? (Exception) th3 : new RuntimeException(th3));
                return;
            case 18:
                b();
                return;
            case 19:
                fg fgVar = (fg) this.b;
                uf.b bVar2 = (uf.b) this.c;
                if (((AtomicBoolean) fgVar.e).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 20:
                ((vg.w0) this.b).run((ArrayList) this.c);
                return;
            case 21:
                ((v) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 22:
                ((oy) this.b).run((ArrayList) this.c);
                return;
            case 23:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new c2(callback, smallGroupsParticipantsCount, i11));
                return;
            case 24:
                qc M = wc.b0((wn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 25:
                a0 a0Var = (a0) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 26:
                n1.P((n1) this.b, (TLObject) this.c);
                return;
            case 27:
                ((vi.j) this.b).a0((n0) this.c);
                return;
            case 28:
                vi.j jVar2 = (vi.j) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                jVar2.k();
                vi.m mVar = jVar2.x;
                if (mVar != null) {
                    long p10 = mVar.p();
                    vi.s sVar = jVar2.w;
                    if (sVar != null && p10 != Long.MAX_VALUE) {
                        sVar.q = Math.max(0L, p10) * 1000;
                        Handler handler = sVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(sVar.x0);
                        }
                    }
                }
                jVar2.p();
                vi.m mVar2 = jVar2.x;
                if (mVar2 != null) {
                    mVar2.u();
                    jVar2.x = null;
                }
                handlerThread.quitSafely();
                return;
            default:
                vi.s sVar2 = (vi.s) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
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
        }
    }
}
