package pi;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.webkit.WebView;
import b2.p0;
import bi.q4;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import i2.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import qi.k;
import qi.l;
import qi.o;
import qi.q;
import ri.c0;
import ri.d0;
import ri.n0;
import ri.o0;
import ri.r0;
import ri.s;
import ri.v;
import ug.m1;
import ug.x0;
import w7.m7;
import wh.n;
import x9.w;
import yh.b2;
import yh.h1;
import yh.t3;
import zh.n5;
import zh.r3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        r0 r0Var = (r0) this.b;
        n0 n0Var = (n0) this.c;
        File file = (File) this.d;
        o0 o0Var = r0Var.e;
        long j10 = n0Var.a;
        d11 d11Var = (d11) o0Var;
        synchronized (d11Var) {
            if (d11Var.d) {
                return;
            }
            d11Var.c.put(Long.valueOf(j10), new b11(file));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [int] */
    /* JADX WARN: Type inference failed for: r6v28 */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.User user;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        boolean z16;
        int i10 = 3;
        ?? r11 = 0;
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                WebView webView = (WebView) this.c;
                b5.h hVar = (b5.h) this.d;
                synchronized (jVar.a) {
                    if (!jVar.u && jVar.o == webView && jVar.p == hVar && !jVar.r) {
                        if (jVar.s) {
                            FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            jVar.o();
                            return;
                        } else {
                            jVar.s = true;
                            FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                            jVar.f();
                            return;
                        }
                    }
                    return;
                }
            case 1:
                q qVar = (q) this.b;
                k kVar = (k) this.c;
                byte[] bArr = (byte[]) this.d;
                File file = kVar.b;
                if (qVar.m != o.d) {
                    return;
                }
                qVar.B = bArr;
                try {
                    qVar.o();
                    h0 a2 = new i2.o(qVar.a).a();
                    qVar.A = a2;
                    a2.p0(qVar.F);
                    qVar.A.r0(p0.b(Uri.fromFile(file)));
                    qVar.A.b();
                    qVar.r(o.e);
                    qi.h hVar2 = qVar.e;
                    long j11 = qVar.j();
                    long j12 = qVar.r;
                    long j13 = qVar.s;
                    byte[] bArr2 = qVar.B;
                    hVar2.onPreviewReady(j11, j12, j13, bArr2 == null ? null : (byte[]) bArr2.clone());
                    return;
                } catch (Throwable th2) {
                    qVar.g(th2 instanceof Exception ? th2 : new RuntimeException(th2));
                    return;
                }
            case 2:
                ((q) this.b).f.onOutputStarted(((k) this.c).a, (File) this.d);
                return;
            case 3:
                ((q) this.b).f.onOutputError(((k) this.c).a, (Exception) this.d);
                return;
            case 4:
                ((q) this.b).f.onOutputInvalidated(((k) this.c).a, (l) this.d);
                return;
            case 5:
                s sVar = (s) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                sVar.getClass();
                try {
                    sVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 6:
                r0 r0Var = (r0) this.b;
                v vVar = (v) this.c;
                File file2 = (File) this.d;
                Handler handler = r0Var.i;
                try {
                    vVar.c(file2);
                    r0Var.g();
                    long e = m7.e(file2) / 1000;
                    r0Var.m.b("preview snapshot completed: durationMs=" + e + ", size=" + file2.length() + ", elapsedMs=" + r0.f(r0Var.J));
                    handler.post(new d0(r0Var, e, 1));
                    return;
                } catch (Exception e7) {
                    handler.post(new c0(r0Var, e7, i10));
                    return;
                }
            case 7:
                a();
                return;
            case 8:
                ((x0) this.b).run(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 9:
                TLObject tLObject = (TLObject) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                x0 x0Var = (x0) this.d;
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_channels_channelParticipants.participants.size(); i11++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i11).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(messagesController.getInputPeer(peer));
                        }
                    }
                    x0Var.run(arrayList);
                    return;
                }
                return;
            case 10:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
            case 11:
                ((p1) this.b).run(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 12:
                wf.d dVar = (wf.d) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str = dVar.b;
                int i12 = dVar.a;
                if (tLObject2 != null) {
                    MediaDataController.getInstance(i12).onRingtoneUploaded(str, (TLRPC.Document) tLObject2, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i12).onRingtoneUploaded(str, null, true);
                    if (tL_error2 != null) {
                        NotificationCenter.getInstance(i12).doOnIdle(new s9.b(21, dVar, tL_error2));
                    }
                }
                dVar.a();
                return;
            case 13:
                n nVar = (n) this.b;
                ea0 ea0Var = (ea0) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                ca0 ca0Var = nVar.G;
                if (ca0Var == null || nVar.H != ea0Var) {
                    return;
                }
                ca0Var.a(clickableSpan);
                nVar.H = null;
                nVar.x.d(true);
                return;
            case 14:
                u4.f fVar = (u4.f) this.b;
                Executor executor = (Executor) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    ((Task) fVar.call()).continueWith(executor, new w(2, taskCompletionSource));
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 15:
                ns0 ns0Var = (ns0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                m2 m2Var = (m2) this.d;
                ns0Var.H = -1;
                if (tL_error3 != null) {
                    zc.a0(m2Var).f0(tL_error3, false);
                    return;
                }
                return;
            case 16:
                yh.m2 m2Var2 = (yh.m2) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                l80 l80Var = (l80) this.d;
                ns0 ns0Var2 = m2Var2.a;
                ns0Var2.e.k(m2Var2.e.d, savedStarGift);
                l80Var.u();
                ns0Var2.n();
                TL_stars.TL_starGiftCollection c10 = ns0Var2.e.c(m2Var2.e.d);
                if (c10 != null) {
                    zc.a0(ns0Var2.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, r3.E1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 17:
                yh.m2 m2Var3 = (yh.m2) this.b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                h1 h1Var = (h1) this.d;
                if (m2Var3.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    h1Var.c(false, true);
                    m2Var3.e.m(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                h1Var.h(savedStarGift2, z10, m2Var3.d);
                m2Var3.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = m2Var3.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(m2Var3.b).sendRequest(savestargift, null);
                return;
            case 18:
                t3 t3Var = (t3) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.d;
                HashMap hashMap = t3Var.m;
                HashMap hashMap2 = t3Var.o;
                HashMap hashMap3 = t3Var.n;
                ArrayList arrayList2 = t3Var.h;
                ArrayList arrayList3 = t3Var.g;
                ArrayList arrayList4 = t3Var.f;
                int i13 = t3Var.a;
                ArrayList arrayList5 = t3Var.d;
                t3Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i13).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i13).putChats(resalestargifts.chats, false);
                    t3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList5.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList6 = resalestargifts.gifts;
                    int size = arrayList6.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_stars.StarGift starGift = arrayList6.get(i14);
                        i14++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList5.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    t3Var.u = arrayList5.size() >= t3Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    t3Var.q = resalestargifts.next_offset;
                    t3Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList4.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        t3Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList8 = resalestargifts.counters;
                        int size2 = arrayList8.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList8.get(i15);
                            i15++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                hashMap3.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                hashMap2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                hashMap.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    Utilities.Callback callback3 = t3Var.c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                zh.g gVar = (zh.g) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                Context context = (Context) this.d;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    pf.d.r(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new zh.b(gVar, 5), 1000L);
                return;
            case 20:
                zh.g.a0((zh.g) this.b, (TLObject) this.c, (TLRPC.TL_error) this.d);
                return;
            case 21:
                r3 r3Var = (r3) this.b;
                Long l4 = (Long) this.c;
                r3Var.a2(l4.longValue(), new q4(r3Var, l4, (m1[]) this.d, 13));
                return;
            case 22:
                r3.k0((r3) this.b, (TLObject) this.c, (MessageObject) this.d);
                return;
            case 23:
                r3 r3Var2 = (r3) this.b;
                pf.c cVar = (pf.c) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                r3Var2.getClass();
                cVar.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                r3Var2.f0.setResellPrice(ag.a.i(0L, ag.b.a));
                b2 b2Var = r3Var2.e1;
                if (b2Var != null) {
                    b2Var.run();
                }
                i2.d.s(R.string.Gift2ResaleDisable, new Object[]{r3Var2.D1()}, r3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 24:
                r3 r3Var3 = (r3) this.b;
                pf.c cVar2 = (pf.c) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                r3Var3.getClass();
                cVar2.c(false);
                r3Var3.getBulletinFactory().f0(tL_error4, false);
                return;
            case 25:
                m1[] m1VarArr = (m1[]) this.b;
                pf.c cVar3 = (pf.c) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                m1VarArr[0].dismiss();
                cVar3.c(false);
                r3.e2(twoStepVerificationActivity);
                return;
            case 26:
                r3.U((r3) this.b, (a2) this.c, (MessageObject) this.d);
                return;
            case 27:
                r3.W((r3) this.b, (TL_stars.TL_starGiftUnique) this.c, (String) this.d);
                return;
            case 28:
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                Utilities.Callback callback4 = (Utilities.Callback) this.d;
                if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback4.run((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                    return;
                } else {
                    n5.e(tL_error5 != null ? tL_error5.text : "NO_PAYMENT_FORM");
                    callback4.run(null);
                    return;
                }
            default:
                n5 n5Var = (n5) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList9 = n5Var.v;
                boolean[] zArr = n5Var.r;
                ArrayList[] arrayListArr = n5Var.q;
                int i16 = n5Var.a;
                boolean z17 = !n5Var.e;
                n5Var.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    MessagesController.getInstance(i16).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i16).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        z12 = true;
                        int i17 = 0;
                        while (i17 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i17);
                            i17++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[r11].add(starsTransaction2);
                            boolean z18 = r11;
                            boolean[] zArr2 = zArr;
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                            r11 = z18;
                            zArr = zArr2;
                        }
                        z15 = r11;
                        boolean[] zArr3 = zArr;
                        j10 = 0;
                        for (?? r62 = z15; r62 < 3; r62++) {
                            zArr3[r62] = (!arrayListArr[r62].isEmpty() || zArr3[r62]) ? true : z15;
                            boolean[] zArr4 = n5Var.u;
                            boolean z19 = (starsStatus.flags & 1) == 0 ? true : z15;
                            zArr4[r62] = z19;
                            if (z19) {
                                n5Var.t[r62] = z15;
                            }
                            n5Var.s[r62] = zArr4[r62] ? null : starsStatus.next_offset;
                        }
                        z16 = true;
                    } else {
                        z12 = true;
                        z15 = false;
                        j10 = 0;
                        z16 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        n5Var.x = z15;
                        n5Var.w = starsStatus.subscriptions_next_offset;
                        n5Var.y = (starsStatus.flags & 4) == 0 ? z12 : false;
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    long j14 = n5Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j14 != starsAmount.amount) {
                        z17 = z12;
                    }
                    n5Var.f = starsAmount;
                    n5Var.g = j10;
                    z14 = z16;
                } else {
                    z12 = true;
                    z13 = false;
                    z14 = false;
                }
                n5Var.d = false;
                n5Var.e = z12;
                if (z17) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z14) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z13) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
