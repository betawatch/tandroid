package tg;

import ai.d5;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ii.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.TwoStepVerificationActivity;
import xh.d2;
import xh.o2;
import xh.v3;
import yh.m5;
import yh.s3;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.User user;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        int i10 = this.a;
        int i11 = 5;
        boolean z15 = true;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                x0 x0Var = (x0) obj;
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < tL_channels_channelParticipants.participants.size(); i12++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i12).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(messagesController.getInputPeer(peer));
                        }
                    }
                    x0Var.run(arrayList);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error != null) {
                    callback.run(tL_error);
                    break;
                } else {
                    callback2.run(null);
                    break;
                }
            case 2:
                ((q1) obj3).run(new Pair((HashMap) obj2, (ArrayList) obj));
                break;
            case 3:
                vf.d dVar = (vf.d) obj2;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                String str = dVar.b;
                int i13 = dVar.a;
                if (tLObject2 != null) {
                    MediaDataController.getInstance(i13).onRingtoneUploaded(str, (TLRPC.Document) tLObject2, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i13).onRingtoneUploaded(str, null, true);
                    if (tL_error2 != null) {
                        NotificationCenter.getInstance(i13).doOnIdle(new u2.p0(i11, dVar, tL_error2));
                    }
                }
                dVar.a();
                break;
            case 4:
                vh.n nVar = (vh.n) obj3;
                fa0 fa0Var = (fa0) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                da0 da0Var = nVar.G;
                if (da0Var != null && nVar.H == fa0Var) {
                    da0Var.a(clickableSpan);
                    nVar.H = null;
                    nVar.x.d(true);
                    break;
                }
                break;
            case 5:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    ((Task) ((u4.f) obj3).call()).continueWith((Executor) obj2, new w9.v(2, taskCompletionSource));
                    break;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 6:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                n2 n2Var = (n2) obj;
                ((rs0) obj3).H = -1;
                if (tL_error3 != null) {
                    ad.a0(n2Var).f0(tL_error3, false);
                    break;
                }
                break;
            case 7:
                o2 o2Var = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                rs0 rs0Var = o2Var.a;
                rs0Var.e.k(o2Var.e.d, savedStarGift);
                ((p80) obj).u();
                rs0Var.n();
                TL_stars.TL_starGiftCollection c10 = rs0Var.e.c(o2Var.e.d);
                if (c10 != null) {
                    ad.a0(rs0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, s3.E1(savedStarGift.gift), c10.title))).j();
                    break;
                }
                break;
            case 8:
                o2 o2Var2 = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                xh.j1 j1Var = (xh.j1) obj;
                if (o2Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    j1Var.c(false, true);
                    o2Var2.e.m(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                j1Var.h(savedStarGift2, z10, o2Var2.d);
                o2Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = o2Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(o2Var2.b).sendRequest(savestargift, null);
                break;
            case 9:
                v3 v3Var = (v3) obj2;
                TLObject tLObject3 = (TLObject) obj3;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = v3Var.m;
                HashMap hashMap2 = v3Var.o;
                HashMap hashMap3 = v3Var.n;
                ArrayList arrayList2 = v3Var.h;
                ArrayList arrayList3 = v3Var.g;
                ArrayList arrayList4 = v3Var.f;
                int i14 = v3Var.a;
                ArrayList arrayList5 = v3Var.d;
                v3Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i14).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i14).putChats(resalestargifts.chats, false);
                    v3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList5.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList6 = resalestargifts.gifts;
                    int size = arrayList6.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TL_stars.StarGift starGift = arrayList6.get(i15);
                        i15++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList5.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    v3Var.u = arrayList5.size() >= v3Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    v3Var.q = resalestargifts.next_offset;
                    v3Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList4.addAll(m5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(m5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(m5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        v3Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList8 = resalestargifts.counters;
                        int size2 = arrayList8.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList8.get(i16);
                            i16++;
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
                    Utilities.Callback callback3 = v3Var.c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z11));
                        break;
                    }
                }
                break;
            case 10:
                yh.g gVar = (yh.g) obj2;
                TLObject tLObject4 = (TLObject) obj3;
                Context context = (Context) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    of.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new yh.b(gVar, i11), 1000L);
                break;
            case 11:
                yh.g.a0((yh.g) obj2, (TLObject) obj3, (TLRPC.TL_error) obj);
                break;
            case 12:
                s3 s3Var = (s3) obj3;
                Long l4 = (Long) obj2;
                s3Var.a2(l4.longValue(), new d5(s3Var, l4, (m1[]) obj, 13));
                break;
            case 13:
                s3.k0((s3) obj2, (TLObject) obj3, (MessageObject) obj);
                break;
            case 14:
                s3 s3Var2 = (s3) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                s3Var2.getClass();
                ((of.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                s3Var2.f0.setResellPrice(zf.a.i(0L, zf.b.a));
                d2 d2Var = s3Var2.e1;
                if (d2Var != null) {
                    d2Var.run();
                }
                hg.c.q(R.string.Gift2ResaleDisable, new Object[]{s3Var2.D1()}, s3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            case 15:
                s3 s3Var3 = (s3) obj3;
                s3Var3.getClass();
                ((of.e) obj2).c(false);
                s3Var3.getBulletinFactory().f0((TLRPC.TL_error) obj, false);
                break;
            case 16:
                ((m1[]) obj3)[0].dismiss();
                ((of.e) obj2).c(false);
                s3.e2((TwoStepVerificationActivity) obj);
                break;
            case 17:
                s3.U((s3) obj3, (b2) obj2, (MessageObject) obj);
                break;
            case 18:
                s3.W((s3) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
                break;
            case 19:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                Utilities.Callback callback4 = (Utilities.Callback) obj;
                if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback4.run((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                    break;
                } else {
                    m5.e(tL_error4 == null ? "NO_PAYMENT_FORM" : tL_error4.text);
                    callback4.run(null);
                    break;
                }
            case 20:
                m5 m5Var = (m5) obj2;
                TLObject tLObject6 = (TLObject) obj3;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList9 = m5Var.v;
                boolean[] zArr = m5Var.r;
                ArrayList[] arrayListArr = m5Var.q;
                int i17 = m5Var.a;
                boolean z16 = !m5Var.e;
                m5Var.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    MessagesController.getInstance(i17).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i17).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        int i18 = 0;
                        while (i18 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i18);
                            i18++;
                            boolean z17 = z15;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            arrayListArr[starsTransaction2.amount.amount > 0 ? z17 : 2].add(starsTransaction2);
                            z15 = z17;
                        }
                        z12 = z15;
                        j3 = 0;
                        for (int i19 = 0; i19 < 3; i19++) {
                            zArr[i19] = (!arrayListArr[i19].isEmpty() || zArr[i19]) ? z12 : false;
                            boolean[] zArr2 = m5Var.u;
                            boolean z18 = (starsStatus.flags & 1) == 0 ? z12 : false;
                            zArr2[i19] = z18;
                            if (z18) {
                                m5Var.t[i19] = false;
                            }
                            m5Var.s[i19] = zArr2[i19] ? null : starsStatus.next_offset;
                        }
                        z14 = z12;
                    } else {
                        z12 = true;
                        j3 = 0;
                        z14 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        m5Var.x = false;
                        m5Var.w = starsStatus.subscriptions_next_offset;
                        m5Var.y = (starsStatus.flags & 4) == 0 ? z12 : false;
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    long j10 = m5Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z16 = z12;
                    }
                    m5Var.f = starsAmount;
                    m5Var.g = j3;
                } else {
                    z12 = true;
                    z13 = false;
                    z14 = false;
                }
                m5Var.d = false;
                m5Var.e = z12;
                if (z16) {
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z14) {
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z13) {
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 21:
                m5 m5Var2 = (m5) obj3;
                Runnable runnable2 = (Runnable) obj;
                m5Var2.getClass();
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    m5Var2.Q.remove(num);
                    m5Var2.R.remove(num);
                }
                runnable2.run();
                break;
            default:
                ((boolean[]) obj3)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj2);
                ((f3[]) obj)[0].dismiss();
                break;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ q(Object obj, TLObject tLObject, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = tLObject;
        this.d = obj2;
    }
}
