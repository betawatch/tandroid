package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.e91;
import org.telegram.ui.ft;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x1(int i10, Object obj, Object obj2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        qi.j jVar = (qi.j) this.b;
        qi.i iVar = (qi.i) this.c;
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

    @Override // java.lang.Runnable
    public final void run() {
        u0 u0Var;
        pa.a aVar;
        int i10;
        switch (this.a) {
            case 0:
                a2 a2Var = (a2) this.b;
                a2Var.getMessagesController().removeWebBrowserException((String) this.c);
                a2Var.a.f3.N(true);
                return;
            case 1:
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
            case 2:
                ((h2) this.b).m.remove((e91) this.c);
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
                pg.f1 f1Var = (pg.f1) this.b;
                Runnable runnable = (Runnable) this.c;
                pg.d1 d1Var = f1Var.d;
                if (d1Var == null || !d1Var.f) {
                    return;
                }
                pg.d1.b(d1Var);
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
                aVar.f(bVar2);
                return;
            case 7:
                a();
                return;
            case 8:
                qg.m0 m0Var = (qg.m0) this.b;
                qg.x1 x1Var = (qg.x1) this.c;
                x1Var.m();
                m0Var.s0(x1Var, true);
                return;
            case 9:
                ((qg.x1) this.b).s((Bitmap) this.c);
                return;
            case 10:
                qg.n2 n2Var = (qg.n2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                n2Var.G = false;
                qg.k2[] k2VarArr = (qg.k2[]) arrayList.toArray(new qg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.b0.setScaleX(0.3f);
                    n2Var.b0.setScaleY(0.3f);
                    n2Var.b0.setAlpha(0.0f);
                    n2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(tr.f).start();
                    return;
                }
                return;
            case 11:
                b();
                return;
            case 12:
                qi.j jVar = (qi.j) this.b;
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
                } catch (IllegalArgumentException e7) {
                    FileLog.e(e7);
                    jVar.f();
                    return;
                }
            case 13:
                ((qi.j) this.b).k((byte[]) this.c);
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
                r9.h hVar = (r9.h) ((k2.e) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar.l(e10);
                    return;
                }
            case 18:
                rg.k0 k0Var = (rg.k0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = k0Var.i0;
                zl0 zl0Var = k0Var.d;
                if (tLObject2 != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    k0Var.I0 = false;
                    k0Var.J0.b(k0Var.n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= zl0Var.getChildCount()) {
                            i10 = 0;
                        } else if (zl0Var.getChildAt(i13) instanceof rg.j0) {
                            i10 = zl0Var.getChildAt(i13).getTop();
                        } else {
                            i13++;
                        }
                    }
                    k0Var.M1();
                    if (k0Var.l0 >= 0 && i10 != 0) {
                        ((s4.c0) zl0Var.getLayoutManager()).h1(k0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), k0Var.M0.b);
                k0Var.x0.g(max, false);
                k0Var.x0.setBagePosition(max / k0Var.M0.c);
                rg.i0 i0Var = k0Var.x0;
                i0Var.H = true;
                i0Var.requestLayout();
                return;
            case 19:
                ((rg.k0) this.b).m1((t90) this.c, true);
                return;
            case 20:
                rg.b2 b2Var = (rg.b2) this.b;
                AndroidUtilities.runOnUIThread(new x1(21, b2Var, FileLoader.getInstance(b2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 21:
                rg.b2 b2Var2 = (rg.b2) this.b;
                b2Var2.e = (File) this.c;
                b2Var2.a();
                return;
            case 22:
                com.google.android.gms.internal.cast.p pVar2 = (com.google.android.gms.internal.cast.p) this.b;
                rf.b bVar3 = (rf.b) this.c;
                if (((AtomicBoolean) pVar2.e).compareAndSet(false, true)) {
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
                ((ft) this.b).run((ArrayList) this.c);
                return;
            case 26:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(callback, smallGroupsParticipantsCount, 1));
                return;
            case 27:
                rc M = yc.a0((yn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
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
                tg.m1.N((tg.m1) this.b, (TLObject) this.c);
                return;
        }
    }
}
