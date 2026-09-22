package p2;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
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
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
import org.telegram.ui.mj0;
import pg.a1;
import pg.c1;
import pg.q0;
import pg.x0;
import qg.a2;
import qg.m2;
import qg.p0;
import qg.p2;
import rg.h0;
import rg.i0;
import rg.j0;
import rg.z1;
import s4.c0;
import tg.b0;
import tg.n1;
import tg.w;
import u2.u0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
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
        pa.a aVar;
        int i10;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                Uri uri = (Uri) this.c;
                cVar.r = false;
                cVar.d(uri);
                return;
            case 1:
                q0 q0Var = (q0) this.b;
                x0 x0Var = (x0) this.c;
                q0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) q0Var.h(q0Var.f(), true, false, false).c;
                RectF f7 = q0Var.f();
                Object obj = q0Var.a.b;
                q0Var.w = new a5.a(byteBuffer, 0, f7);
                q0Var.a(false);
                x0Var.run();
                return;
            case 2:
                c1 c1Var = (c1) this.b;
                Runnable runnable = (Runnable) this.c;
                a1 a1Var = c1Var.d;
                if (a1Var == null || !a1Var.f) {
                    return;
                }
                a1.b(a1Var);
                runnable.run();
                return;
            case 3:
                q9.p pVar = (q9.p) this.b;
                pa.b bVar = (pa.b) this.c;
                if (pVar.b != q9.p.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    aVar = pVar.a;
                    pVar.a = null;
                    pVar.b = bVar;
                }
                aVar.j(bVar);
                return;
            case 4:
                a();
                return;
            case 5:
                p0 p0Var = (p0) this.b;
                a2 a2Var = (a2) this.c;
                a2Var.m();
                p0Var.s0(a2Var, true);
                return;
            case 6:
                ((a2) this.b).s((Bitmap) this.c);
                return;
            case 7:
                p2 p2Var = (p2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                p2Var.G = false;
                m2[] m2VarArr = (m2[]) arrayList.toArray(new m2[0]);
                p2Var.H = m2VarArr;
                if (m2VarArr.length > 0) {
                    p2Var.b0.setScaleX(0.3f);
                    p2Var.b0.setScaleY(0.3f);
                    p2Var.b0.setAlpha(0.0f);
                    p2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(qr.f).start();
                    return;
                }
                return;
            case 8:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 9:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i11 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 10:
                r9.a aVar2 = (r9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 11:
                Callable callable = (Callable) this.b;
                r9.h hVar = (r9.h) ((k2.u) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 12:
                j0 j0Var = (j0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = j0Var.i0;
                ll0 ll0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.n0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= ll0Var.getChildCount()) {
                            i10 = 0;
                        } else if (ll0Var.getChildAt(i12) instanceof i0) {
                            i10 = ll0Var.getChildAt(i12).getTop();
                        } else {
                            i12++;
                        }
                    }
                    j0Var.M1();
                    if (j0Var.l0 >= 0 && i10 != 0) {
                        ((c0) ll0Var.getLayoutManager()).h1(j0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), j0Var.M0.b);
                j0Var.x0.g(max, false);
                j0Var.x0.setBagePosition(max / j0Var.M0.c);
                h0 h0Var = j0Var.x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 13:
                ((j0) this.b).m1((f90) this.c, true);
                return;
            case 14:
                z1 z1Var = (z1) this.b;
                AndroidUtilities.runOnUIThread(new b(15, z1Var, FileLoader.getInstance(z1Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 15:
                z1 z1Var2 = (z1) this.b;
                z1Var2.e = (File) this.c;
                z1Var2.a();
                return;
            case 16:
                com.google.android.gms.internal.cast.p pVar2 = (com.google.android.gms.internal.cast.p) this.b;
                rf.b bVar2 = (rf.b) this.c;
                if (((AtomicBoolean) pVar2.e).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 17:
                ((tg.x0) this.b).run((ArrayList) this.c);
                return;
            case 18:
                ((w) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 19:
                ((mj0) this.b).run((ArrayList) this.c);
                return;
            case 20:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a2(callback, smallGroupsParticipantsCount, 1));
                return;
            case 21:
                oc M = vc.a0((bo) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 22:
                b0 b0Var = (b0) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 23:
                n1.P((n1) this.b, (TLObject) this.c);
                return;
            case 24:
                ((e2.h) this.b).accept(this.c);
                return;
            case 25:
                ((u0) this.b).A((c3.b0) this.c);
                return;
            case 26:
                uf.c cVar2 = (uf.c) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar2.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList3 = tL_savedRingtones.ringtones;
                        ArrayList arrayList4 = cVar2.e;
                        if (!cVar2.f) {
                            cVar2.f(false);
                            cVar2.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList4.get(i13);
                            i13++;
                            uf.b bVar3 = (uf.b) obj2;
                            if (bVar3.b != null && (document = bVar3.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar3.b);
                            }
                        }
                        arrayList4.clear();
                        SharedPreferences d = cVar2.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList3.size());
                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                            TLRPC.Document document3 = arrayList3.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            uf.b bVar4 = new uf.b();
                            bVar4.a = document3;
                            bVar4.b = str;
                            int i15 = cVar2.d;
                            cVar2.d = i15 + 1;
                            bVar4.c = i15;
                            arrayList4.add(bVar4);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar2.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar2.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        uf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar2.b();
                    return;
                }
                return;
            case 27:
                uf.c cVar3 = (uf.c) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    uf.b bVar5 = (uf.b) arrayList5.get(i16);
                    if (bVar5 != null && ((TextUtils.isEmpty(bVar5.b) || !new File(bVar5.b).exists()) && (document2 = bVar5.a) != null && ((pathToAttach = FileLoader.getInstance(cVar3.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new b(28, cVar3, document2));
                    }
                }
                return;
            case 28:
                uf.c cVar4 = (uf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(cVar4.c).loadFile(document4, document4, 0, 0);
                return;
            default:
                uf.d dVar = (uf.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i17 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i17).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i17).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
        }
    }
}
