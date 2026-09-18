package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
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
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.nj0;
import org.telegram.ui.x81;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1(int i10, Object obj, Object obj2) {
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
        u0 u0Var;
        pa.a aVar;
        int i10;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.k0) this.b).f0.run((Integer) this.c);
                return;
            case 1:
                a2 a2Var = (a2) this.b;
                a2Var.getMessagesController().removeWebBrowserException((String) this.c);
                a2Var.a.Y2.N(true);
                return;
            case 2:
                h2 h2Var = (h2) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i11 = h2Var.a;
                h2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
                    h2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            h2Var.h = tL_webPage;
                        }
                    }
                    h2Var.h = null;
                }
                TLRPC.WebPage webPage = h2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    h2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (u0Var = h2Var.l) != null) {
                    u0Var.run();
                }
                h2Var.c();
                return;
            case 3:
                ((h2) this.b).m.remove((x81) this.c);
                return;
            case 4:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.r = false;
                bVar.d(uri);
                return;
            case 5:
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
            case 6:
                pg.e1 e1Var = (pg.e1) this.b;
                Runnable runnable = (Runnable) this.c;
                pg.c1 c1Var = e1Var.d;
                if (c1Var == null || !c1Var.f) {
                    return;
                }
                pg.c1.b(c1Var);
                runnable.run();
                return;
            case 7:
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
            case 8:
                a();
                return;
            case 9:
                qg.m0 m0Var = (qg.m0) this.b;
                qg.x1 x1Var = (qg.x1) this.c;
                x1Var.m();
                m0Var.r0(x1Var, true);
                return;
            case 10:
                ((qg.x1) this.b).s((Bitmap) this.c);
                return;
            case 11:
                qg.m2 m2Var = (qg.m2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                m2Var.G = false;
                qg.j2[] j2VarArr = (qg.j2[]) arrayList.toArray(new qg.j2[0]);
                m2Var.H = j2VarArr;
                if (j2VarArr.length > 0) {
                    m2Var.b0.setScaleX(0.3f);
                    m2Var.b0.setScaleY(0.3f);
                    m2Var.b0.setAlpha(0.0f);
                    m2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(qr.f).start();
                    return;
                }
                return;
            case 12:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 13:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i12 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 14:
                r9.a aVar2 = (r9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 15:
                Callable callable = (Callable) this.b;
                r9.h hVar = (r9.h) ((n2.e) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 16:
                rg.j0 j0Var = (rg.j0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = j0Var.i0;
                wl0 wl0Var = j0Var.d;
                if (tLObject2 != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= wl0Var.getChildCount()) {
                            i10 = 0;
                        } else if (wl0Var.getChildAt(i13) instanceof rg.i0) {
                            i10 = wl0Var.getChildAt(i13).getTop();
                        } else {
                            i13++;
                        }
                    }
                    j0Var.M1();
                    if (j0Var.l0 >= 0 && i10 != 0) {
                        ((s4.c0) wl0Var.getLayoutManager()).h1(j0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), j0Var.M0.b);
                j0Var.x0.g(max, false);
                j0Var.x0.setBagePosition(max / j0Var.M0.c);
                rg.h0 h0Var = j0Var.x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 17:
                ((rg.j0) this.b).m1((o90) this.c, true);
                return;
            case 18:
                rg.z1 z1Var = (rg.z1) this.b;
                AndroidUtilities.runOnUIThread(new p1(19, z1Var, FileLoader.getInstance(z1Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 19:
                rg.z1 z1Var2 = (rg.z1) this.b;
                z1Var2.e = (File) this.c;
                z1Var2.a();
                return;
            case 20:
                com.google.android.gms.internal.cast.p pVar2 = (com.google.android.gms.internal.cast.p) this.b;
                rf.b bVar3 = (rf.b) this.c;
                if (((AtomicBoolean) pVar2.e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 21:
                ((tg.w0) this.b).run((ArrayList) this.c);
                return;
            case 22:
                ((tg.v) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 23:
                ((nj0) this.b).run((ArrayList) this.c);
                return;
            case 24:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a2(callback, smallGroupsParticipantsCount, 1));
                return;
            case 25:
                qc M = xc.a0((zn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 26:
                tg.a0 a0Var = (tg.a0) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 27:
                tg.m1.P((tg.m1) this.b, (TLObject) this.c);
                return;
            case 28:
                ((e2.h) this.b).accept(this.c);
                return;
            default:
                ((u2.u0) this.b).A((c3.b0) this.c);
                return;
        }
    }
}
