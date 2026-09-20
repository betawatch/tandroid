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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.pj0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1(int i10, Object obj, Object obj2) {
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
        r0 r0Var;
        pa.a aVar;
        int i10;
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                i1 i1Var = h1Var.h;
                ArrayList arrayList2 = i1Var.h;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                i1Var.n = false;
                m61 m61Var = i1Var.a;
                if (m61Var != null) {
                    m61Var.Y2.N(true);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.b;
                f1Var.setEnabled(((h2) this.c).b() != null);
                f1Var.animate().alpha(f1Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 2:
                ((org.telegram.ui.k0) this.b).f0.run((Integer) this.c);
                return;
            case 3:
                a2 a2Var = (a2) this.b;
                a2Var.getMessagesController().removeWebBrowserException((String) this.c);
                a2Var.a.Y2.N(true);
                return;
            case 4:
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
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (r0Var = h2Var.l) != null) {
                    r0Var.run();
                }
                h2Var.c();
                return;
            case 5:
                ((h2) this.b).m.remove((g1) this.c);
                return;
            case 6:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.r = false;
                bVar.d(uri);
                return;
            case 7:
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
            case 8:
                pg.e1 e1Var = (pg.e1) this.b;
                Runnable runnable = (Runnable) this.c;
                pg.c1 c1Var = e1Var.d;
                if (c1Var == null || !c1Var.f) {
                    return;
                }
                pg.c1.b(c1Var);
                runnable.run();
                return;
            case 9:
                q9.q qVar = (q9.q) this.b;
                pa.b bVar2 = (pa.b) this.c;
                if (qVar.b != q9.q.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (qVar) {
                    aVar = qVar.a;
                    qVar.a = null;
                    qVar.b = bVar2;
                }
                aVar.f(bVar2);
                return;
            case 10:
                a();
                return;
            case 11:
                qg.n0 n0Var = (qg.n0) this.b;
                qg.y1 y1Var = (qg.y1) this.c;
                y1Var.m();
                n0Var.r0(y1Var, true);
                return;
            case 12:
                ((qg.y1) this.b).s((Bitmap) this.c);
                return;
            case 13:
                qg.n2 n2Var = (qg.n2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                n2Var.G = false;
                qg.k2[] k2VarArr = (qg.k2[]) arrayList3.toArray(new qg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.b0.setScaleX(0.3f);
                    n2Var.b0.setScaleY(0.3f);
                    n2Var.b0.setAlpha(0.0f);
                    n2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(qr.f).start();
                    return;
                }
                return;
            case 14:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 15:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i12 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 16:
                r9.a aVar2 = (r9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 17:
                Callable callable = (Callable) this.b;
                r9.h hVar = (r9.h) ((n2.e) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 18:
                rg.j0 j0Var = (rg.j0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList4 = j0Var.i0;
                vl0 vl0Var = j0Var.d;
                if (tLObject2 != null) {
                    arrayList4.clear();
                    arrayList4.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= vl0Var.getChildCount()) {
                            i10 = 0;
                        } else if (vl0Var.getChildAt(i13) instanceof rg.i0) {
                            i10 = vl0Var.getChildAt(i13).getTop();
                        } else {
                            i13++;
                        }
                    }
                    j0Var.M1();
                    if (j0Var.l0 >= 0 && i10 != 0) {
                        ((s4.c0) vl0Var.getLayoutManager()).h1(j0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList4.size(), j0Var.M0.b);
                j0Var.x0.g(max, false);
                j0Var.x0.setBagePosition(max / j0Var.M0.c);
                rg.h0 h0Var = j0Var.x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 19:
                ((rg.j0) this.b).m1((n90) this.c, true);
                return;
            case 20:
                rg.z1 z1Var = (rg.z1) this.b;
                AndroidUtilities.runOnUIThread(new g1(21, z1Var, FileLoader.getInstance(z1Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 21:
                rg.z1 z1Var2 = (rg.z1) this.b;
                z1Var2.e = (File) this.c;
                z1Var2.a();
                return;
            case 22:
                com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.b;
                rf.b bVar3 = (rf.b) this.c;
                if (((AtomicBoolean) pVar.e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 23:
                ((tg.w0) this.b).run((ArrayList) this.c);
                return;
            case 24:
                ((tg.v) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 25:
                ((pj0) this.b).run((ArrayList) this.c);
                return;
            case 26:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a2(callback, smallGroupsParticipantsCount, 1));
                return;
            case 27:
                pc M = xc.a0((zn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 28:
                tg.a0 a0Var = (tg.a0) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            default:
                tg.m1.P((tg.m1) this.b, (TLObject) this.c);
                return;
        }
    }
}
