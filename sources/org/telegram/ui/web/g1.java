package org.telegram.ui.web;

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
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        b bVar;
        pa.a aVar;
        int i10;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                i1 i1Var = h1Var.h;
                ArrayList arrayList2 = i1Var.f;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                i1Var.h = false;
                x51 x51Var = i1Var.a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
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
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (bVar = h2Var.l) != null) {
                    bVar.run();
                }
                h2Var.c();
                return;
            case 5:
                ((h2) this.b).m.remove((g1) this.c);
                return;
            case 6:
                p2.b bVar2 = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar2.r = false;
                bVar2.d(uri);
                return;
            case 7:
                q9.p pVar = (q9.p) this.b;
                pa.b bVar3 = (pa.b) this.c;
                if (pVar.b != q9.p.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    aVar = pVar.a;
                    pVar.a = null;
                    pVar.b = bVar3;
                }
                aVar.h(bVar3);
                return;
            case 8:
                a();
                return;
            case 9:
                qg.q0 q0Var = (qg.q0) this.b;
                qg.x0 x0Var = (qg.x0) this.c;
                q0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) q0Var.h(q0Var.f(), true, false, false).c;
                RectF f7 = q0Var.f();
                Object obj = q0Var.a.b;
                q0Var.w = new a5.a(byteBuffer, 0, f7);
                q0Var.a(false);
                x0Var.run();
                return;
            case 10:
                qg.c1 c1Var = (qg.c1) this.b;
                Runnable runnable = (Runnable) this.c;
                qg.a1 a1Var = c1Var.d;
                if (a1Var == null || !a1Var.f) {
                    return;
                }
                qg.a1.b(a1Var);
                runnable.run();
                return;
            case 11:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 12:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i12 = JobInfoSchedulerService.a;
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
                r9.h hVar = (r9.h) ((l.d) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e7) {
                    hVar.l(e7);
                    return;
                }
            case 15:
                rg.o0 o0Var = (rg.o0) this.b;
                rg.z1 z1Var = (rg.z1) this.c;
                z1Var.m();
                o0Var.r0(z1Var, true);
                return;
            case 16:
                ((rg.z1) this.b).s((Bitmap) this.c);
                return;
            case 17:
                rg.o2 o2Var = (rg.o2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                o2Var.G = false;
                rg.l2[] l2VarArr = (rg.l2[]) arrayList3.toArray(new rg.l2[0]);
                o2Var.H = l2VarArr;
                if (l2VarArr.length > 0) {
                    o2Var.b0.setScaleX(0.3f);
                    o2Var.b0.setScaleY(0.3f);
                    o2Var.b0.setAlpha(0.0f);
                    o2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(pr.f).start();
                    return;
                }
                return;
            case 18:
                sg.k0 k0Var = (sg.k0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList4 = k0Var.i0;
                ll0 ll0Var = k0Var.d;
                if (tLObject2 != null) {
                    arrayList4.clear();
                    arrayList4.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    k0Var.I0 = false;
                    k0Var.J0.b(k0Var.n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= ll0Var.getChildCount()) {
                            i10 = 0;
                        } else if (ll0Var.getChildAt(i13) instanceof sg.j0) {
                            i10 = ll0Var.getChildAt(i13).getTop();
                        } else {
                            i13++;
                        }
                    }
                    k0Var.M1();
                    if (k0Var.l0 >= 0 && i10 != 0) {
                        ((s4.c0) ll0Var.getLayoutManager()).h1(k0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList4.size(), k0Var.M0.b);
                k0Var.x0.g(max, false);
                k0Var.x0.setBagePosition(max / k0Var.M0.c);
                sg.i0 i0Var = k0Var.x0;
                i0Var.H = true;
                i0Var.requestLayout();
                return;
            case 19:
                ((sg.k0) this.b).m1((g90) this.c, true);
                return;
            case 20:
                sg.c2 c2Var = (sg.c2) this.b;
                AndroidUtilities.runOnUIThread(new g1(21, c2Var, FileLoader.getInstance(c2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 21:
                sg.c2 c2Var2 = (sg.c2) this.b;
                c2Var2.e = (File) this.c;
                c2Var2.a();
                return;
            case 22:
                com.google.android.gms.internal.cast.p pVar2 = (com.google.android.gms.internal.cast.p) this.b;
                sf.b bVar4 = (sf.b) this.c;
                if (((AtomicBoolean) pVar2.e).compareAndSet(false, true)) {
                    bVar4.a(true);
                    return;
                }
                return;
            case 23:
                ((e2.h) this.b).accept(this.c);
                return;
            case 24:
                ((u2.u0) this.b).B((c3.b0) this.c);
                return;
            case 25:
                uf.c cVar = (uf.c) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    if (tLObject3 instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject3 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject3;
                        ArrayList<TLRPC.Document> arrayList5 = tL_savedRingtones.ringtones;
                        ArrayList arrayList6 = cVar.e;
                        if (!cVar.f) {
                            cVar.f(false);
                            cVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList6.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList6.get(i14);
                            i14++;
                            uf.b bVar5 = (uf.b) obj2;
                            if (bVar5.b != null && (document = bVar5.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar5.b);
                            }
                        }
                        arrayList6.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList5.size());
                        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                            TLRPC.Document document3 = arrayList5.get(i15);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i15, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i15, str);
                            }
                            uf.b bVar6 = new uf.b();
                            bVar6.a = document3;
                            bVar6.b = str;
                            int i16 = cVar.d;
                            cVar.d = i16 + 1;
                            bVar6.c = i16;
                            arrayList6.add(bVar6);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        uf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 26:
                uf.c cVar2 = (uf.c) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                    uf.b bVar7 = (uf.b) arrayList7.get(i17);
                    if (bVar7 != null && ((TextUtils.isEmpty(bVar7.b) || !new File(bVar7.b).exists()) && (document2 = bVar7.a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new g1(27, cVar2, document2));
                    }
                }
                return;
            case 27:
                uf.c cVar3 = (uf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(cVar3.c).loadFile(document4, document4, 0, 0);
                return;
            case 28:
                uf.d dVar = (uf.d) this.b;
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
                ((ug.x0) this.b).run((ArrayList) this.c);
                return;
        }
    }
}
