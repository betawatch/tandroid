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
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.bt;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1(int i10, Object obj, Object obj2) {
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
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.b;
                e1Var.setEnabled(((g2) this.c).b() != null);
                e1Var.animate().alpha(e1Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 1:
                ((org.telegram.ui.l0) this.b).f0.run((Integer) this.c);
                return;
            case 2:
                z1 z1Var = (z1) this.b;
                z1Var.getMessagesController().removeWebBrowserException((String) this.c);
                z1Var.a.Y2.N(true);
                return;
            case 3:
                g2 g2Var = (g2) this.c;
                TLObject tLObject = (TLObject) this.b;
                int i11 = g2Var.a;
                g2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
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
            case 4:
                ((g2) this.c).m.remove((o1) this.b);
                return;
            case 5:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.r = false;
                bVar.d(uri);
                return;
            case 6:
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
            case 7:
                pg.f1 f1Var = (pg.f1) this.b;
                Runnable runnable = (Runnable) this.c;
                pg.d1 d1Var = f1Var.d;
                if (d1Var == null || !d1Var.f) {
                    return;
                }
                pg.d1.b(d1Var);
                runnable.run();
                return;
            case 8:
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
            case 9:
                a();
                return;
            case 10:
                qg.n0 n0Var = (qg.n0) this.b;
                qg.y1 y1Var = (qg.y1) this.c;
                y1Var.m();
                n0Var.s0(y1Var, true);
                return;
            case 11:
                ((qg.y1) this.b).s((Bitmap) this.c);
                return;
            case 12:
                qg.n2 n2Var = (qg.n2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                n2Var.G = false;
                qg.k2[] k2VarArr = (qg.k2[]) arrayList.toArray(new qg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.b0.setScaleX(0.3f);
                    n2Var.b0.setScaleY(0.3f);
                    n2Var.b0.setAlpha(0.0f);
                    n2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(rr.f).start();
                    return;
                }
                return;
            case 13:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 14:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i12 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 15:
                r9.a aVar2 = (r9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 16:
                Callable callable = (Callable) this.b;
                r9.h hVar = (r9.h) ((n2.e) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 17:
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
            case 18:
                ((rg.j0) this.b).m1((q90) this.c, true);
                return;
            case 19:
                rg.z1 z1Var2 = (rg.z1) this.b;
                AndroidUtilities.runOnUIThread(new o1(20, z1Var2, FileLoader.getInstance(z1Var2.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 20:
                rg.z1 z1Var3 = (rg.z1) this.b;
                z1Var3.e = (File) this.c;
                z1Var3.a();
                return;
            case 21:
                com.google.android.gms.internal.cast.p pVar2 = (com.google.android.gms.internal.cast.p) this.b;
                rf.b bVar3 = (rf.b) this.c;
                if (((AtomicBoolean) pVar2.e).compareAndSet(false, true)) {
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
                ((bt) this.b).run((ArrayList) this.c);
                return;
            case 25:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(callback, smallGroupsParticipantsCount, 1));
                return;
            case 26:
                qc M = xc.a0((wn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
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
                tg.m1.P((tg.m1) this.b, (TLObject) this.c);
                return;
            default:
                ((e2.h) this.b).accept(this.c);
                return;
        }
    }

    public /* synthetic */ o1(g2 g2Var, Object obj, int i10) {
        this.a = i10;
        this.c = g2Var;
        this.b = obj;
    }
}
