package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
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
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import org.telegram.ui.nj0;
import org.telegram.ui.r91;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.voip.x xVar;
        pa.a aVar;
        int i10;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        switch (this.a) {
            case 0:
                b2 b2Var = (b2) this.b;
                b2Var.getMessagesController().removeWebBrowserException((String) this.c);
                b2Var.a.Y2.N(true);
                return;
            case 1:
                i2 i2Var = (i2) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i11 = i2Var.a;
                i2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
                    i2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            i2Var.h = tL_webPage;
                        }
                    }
                    i2Var.h = null;
                }
                TLRPC.WebPage webPage = i2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    i2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && i2Var.h != null && (xVar = i2Var.l) != null) {
                    xVar.run();
                }
                i2Var.c();
                return;
            case 2:
                ((i2) this.b).m.remove((r91) this.c);
                return;
            case 3:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.r = false;
                bVar.d(uri);
                return;
            case 4:
                pg.m0 m0Var = (pg.m0) this.b;
                pg.x1 x1Var = (pg.x1) this.c;
                x1Var.m();
                m0Var.r0(x1Var, true);
                return;
            case 5:
                ((pg.x1) this.b).s((Bitmap) this.c);
                return;
            case 6:
                pg.n2 n2Var = (pg.n2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                n2Var.G = false;
                pg.k2[] k2VarArr = (pg.k2[]) arrayList.toArray(new pg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.b0.setScaleX(0.3f);
                    n2Var.b0.setScaleY(0.3f);
                    n2Var.b0.setAlpha(0.0f);
                    n2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(wr.f).start();
                    return;
                }
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
                aVar.j(bVar2);
                return;
            case 8:
                a();
                return;
            case 9:
                qg.k0 k0Var = (qg.k0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = k0Var.i0;
                vl0 vl0Var = k0Var.d;
                if (tLObject2 != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    k0Var.I0 = false;
                    k0Var.J0.b(k0Var.n0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= vl0Var.getChildCount()) {
                            i10 = 0;
                        } else if (vl0Var.getChildAt(i12) instanceof qg.j0) {
                            i10 = vl0Var.getChildAt(i12).getTop();
                        } else {
                            i12++;
                        }
                    }
                    k0Var.M1();
                    if (k0Var.l0 >= 0 && i10 != 0) {
                        ((s4.c0) vl0Var.getLayoutManager()).h1(k0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), k0Var.M0.b);
                k0Var.x0.g(max, false);
                k0Var.x0.setBagePosition(max / k0Var.M0.c);
                qg.i0 i0Var = k0Var.x0;
                i0Var.H = true;
                i0Var.requestLayout();
                return;
            case 10:
                ((qg.k0) this.b).m1((p90) this.c, true);
                return;
            case 11:
                qg.a2 a2Var = (qg.a2) this.b;
                AndroidUtilities.runOnUIThread(new x1(12, a2Var, FileLoader.getInstance(a2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 12:
                qg.a2 a2Var2 = (qg.a2) this.b;
                a2Var2.e = (File) this.c;
                a2Var2.a();
                return;
            case 13:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 14:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i13 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 15:
                r9.a aVar2 = (r9.a) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 16:
                Callable callable = (Callable) this.b;
                r9.h hVar = (r9.h) ((l2.h) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 17:
                com.google.android.gms.internal.cast.p pVar2 = (com.google.android.gms.internal.cast.p) this.b;
                rf.b bVar3 = (rf.b) this.c;
                if (((AtomicBoolean) pVar2.e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 18:
                ((sg.y0) this.b).run((ArrayList) this.c);
                return;
            case 19:
                ((sg.v) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 20:
                ((nj0) this.b).run((ArrayList) this.c);
                return;
            case 21:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(callback, smallGroupsParticipantsCount, 1));
                return;
            case 22:
                pc M = wc.a0((eo) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 23:
                sg.a0 a0Var = (sg.a0) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 24:
                sg.p1.P((sg.p1) this.b, (TLObject) this.c);
                return;
            case 25:
                tf.c cVar = (tf.c) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    if (tLObject3 instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject3 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject3;
                        ArrayList<TLRPC.Document> arrayList3 = tL_savedRingtones.ringtones;
                        ArrayList arrayList4 = cVar.e;
                        if (!cVar.f) {
                            cVar.f(false);
                            cVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList4.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList4.get(i14);
                            i14++;
                            tf.b bVar4 = (tf.b) obj;
                            if (bVar4.b != null && (document = bVar4.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar4.b);
                            }
                        }
                        arrayList4.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList3.size());
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            TLRPC.Document document3 = arrayList3.get(i15);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i15, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i15, str);
                            }
                            tf.b bVar5 = new tf.b();
                            bVar5.a = document3;
                            bVar5.b = str;
                            int i16 = cVar.d;
                            cVar.d = i16 + 1;
                            bVar5.c = i16;
                            arrayList4.add(bVar5);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        tf.c.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        tf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 26:
                tf.c cVar2 = (tf.c) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                    tf.b bVar6 = (tf.b) arrayList5.get(i17);
                    if (bVar6 != null && ((TextUtils.isEmpty(bVar6.b) || !new File(bVar6.b).exists()) && (document2 = bVar6.a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new x1(27, cVar2, document2));
                    }
                }
                return;
            case 27:
                tf.c cVar3 = (tf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(cVar3.c).loadFile(document4, document4, 0, 0);
                return;
            case 28:
                tf.d dVar = (tf.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i18 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i18).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i18).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            default:
                th.j jVar = (th.j) this.b;
                jVar.b.add((String) this.c);
                jVar.invalidate();
                return;
        }
    }
}
