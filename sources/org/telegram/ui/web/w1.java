package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Process;
import android.os.StrictMode;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import m.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ft;
import org.telegram.ui.ii1;
import org.telegram.ui.zn;
import qg.o2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.b;
        pa.b bVar = (pa.b) this.c;
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

    @Override // java.lang.Runnable
    public final void run() {
        q0 q0Var;
        pa.a aVar;
        int i10;
        int i11 = 1;
        switch (this.a) {
            case 0:
                z1 z1Var = (z1) this.b;
                z1Var.getMessagesController().removeWebBrowserException((String) this.c);
                z1Var.a.W2.N(true);
                return;
            case 1:
                g2 g2Var = (g2) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i12 = g2Var.a;
                g2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i12).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i12).putChats(tL_messages_webPage.chats, false);
                    g2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            g2Var.h = tL_webPage;
                        }
                    }
                    g2Var.h = null;
                }
                TLRPC.WebPage webPage = g2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    g2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (q0Var = g2Var.l) != null) {
                    q0Var.run();
                }
                g2Var.c();
                return;
            case 2:
                ((g2) this.b).m.remove((ii1) this.c);
                return;
            case 3:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.r = false;
                bVar.d(uri);
                return;
            case 4:
                pg.s0 s0Var = (pg.s0) this.b;
                pg.z0 z0Var = (pg.z0) this.c;
                s0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) s0Var.h(s0Var.f(), true, false, false).c;
                RectF f7 = s0Var.f();
                Object obj = s0Var.a.b;
                s0Var.w = new a5.a(byteBuffer, 0, f7);
                s0Var.a(false);
                z0Var.run();
                return;
            case 5:
                pg.e1 e1Var = (pg.e1) this.b;
                Runnable runnable = (Runnable) this.c;
                pg.c1 c1Var = e1Var.d;
                if (c1Var == null || !c1Var.f) {
                    return;
                }
                pg.c1.b(c1Var);
                runnable.run();
                return;
            case 6:
                q9.p pVar = (q9.p) this.b;
                pa.b bVar2 = (pa.b) this.c;
                if (pVar.b != q9.p.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    aVar = pVar.a;
                    pVar.a = null;
                    pVar.b = bVar2;
                }
                aVar.g(bVar2);
                return;
            case 7:
                a();
                return;
            case 8:
                qg.m0 m0Var = (qg.m0) this.b;
                qg.y1 y1Var = (qg.y1) this.c;
                y1Var.m();
                m0Var.s0(y1Var, true);
                return;
            case 9:
                ((qg.y1) this.b).s((Bitmap) this.c);
                return;
            case 10:
                o2 o2Var = (o2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                o2Var.G = false;
                qg.l2[] l2VarArr = (qg.l2[]) arrayList.toArray(new qg.l2[0]);
                o2Var.H = l2VarArr;
                if (l2VarArr.length > 0) {
                    o2Var.b0.setScaleX(0.3f);
                    o2Var.b0.setScaleY(0.3f);
                    o2Var.b0.setAlpha(0.0f);
                    o2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(hs.f).start();
                    return;
                }
                return;
            case 11:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 12:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i13 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 13:
                r9.a aVar2 = (r9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 14:
                Callable callable = (Callable) this.b;
                r9.h hVar = (r9.h) ((f3) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e7) {
                    hVar.l(e7);
                    return;
                }
            case 15:
                rg.j0 j0Var = (rg.j0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = j0Var.i0;
                qm0 qm0Var = j0Var.d;
                if (tLObject2 != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.n0 + 4);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= qm0Var.getChildCount()) {
                            i10 = 0;
                        } else if (qm0Var.getChildAt(i14) instanceof rg.i0) {
                            i10 = qm0Var.getChildAt(i14).getTop();
                        } else {
                            i14++;
                        }
                    }
                    j0Var.N1();
                    if (j0Var.l0 >= 0 && i10 != 0) {
                        ((s4.d0) qm0Var.getLayoutManager()).h1(j0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), j0Var.M0.b);
                j0Var.x0.g(max, false);
                j0Var.x0.setBagePosition(max / j0Var.M0.c);
                rg.h0 h0Var = j0Var.x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 16:
                ((rg.j0) this.b).n1((ha0) this.c, true);
                return;
            case 17:
                rg.a2 a2Var = (rg.a2) this.b;
                AndroidUtilities.runOnUIThread(new w1(18, a2Var, FileLoader.getInstance(a2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 18:
                rg.a2 a2Var2 = (rg.a2) this.b;
                a2Var2.e = (File) this.c;
                a2Var2.a();
                return;
            case 19:
                ((sg.f) this.b).c((ArrayList) this.c);
                return;
            case 20:
                sg.p pVar2 = (sg.p) this.b;
                sg.r rVar = (sg.r) this.c;
                pVar2.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar2.i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar2.k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar2.j);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar2.i, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar2.f.length == 0) {
                            pVar2.b();
                        }
                    }
                    rVar.b.release();
                    return;
                } catch (Throwable th2) {
                    rVar.b.release();
                    throw th2;
                }
            case 21:
                com.google.android.gms.internal.cast.p pVar3 = (com.google.android.gms.internal.cast.p) this.b;
                sf.b bVar3 = (sf.b) this.c;
                if (((AtomicBoolean) pVar3.e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 22:
                ((tg.w0) this.b).run((ArrayList) this.c);
                return;
            case 23:
                ((tg.v) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 24:
                ((ft) this.b).run((ArrayList) this.c);
                return;
            case 25:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(callback, smallGroupsParticipantsCount, i11));
                return;
            case 26:
                tc M = ad.a0((zn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 27:
                tg.a0 a0Var = (tg.a0) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 28:
                tg.m1.Q((tg.m1) this.b, (TLObject) this.c);
                return;
            default:
                ((e2.h) this.b).accept(this.c);
                return;
        }
    }
}
