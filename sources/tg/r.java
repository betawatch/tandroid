package tg;

import ai.c5;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.TwoStepVerificationActivity;
import xh.d2;
import xh.o2;
import xh.v3;
import yh.t5;
import yh.x3;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j3;
        int i10 = this.a;
        int i11 = 5;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                ((q1) obj3).run(new Pair((HashMap) obj2, (ArrayList) obj));
                break;
            case 1:
                uf.d dVar = (uf.d) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                String str = dVar.b;
                int i12 = dVar.a;
                if (tLObject != null) {
                    MediaDataController.getInstance(i12).onRingtoneUploaded(str, (TLRPC.Document) tLObject, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i12).onRingtoneUploaded(str, null, true);
                    if (tL_error != null) {
                        NotificationCenter.getInstance(i12).doOnIdle(new u2.i0(i11, dVar, tL_error));
                    }
                }
                dVar.a();
                break;
            case 2:
                vh.n nVar = (vh.n) obj3;
                o90 o90Var = (o90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                m90 m90Var = nVar.y;
                if (m90Var != null && nVar.E == o90Var) {
                    m90Var.a(clickableSpan);
                    nVar.E = null;
                    nVar.s.d(true);
                    break;
                }
                break;
            case 3:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    ((Task) ((u4.g) obj3).call()).continueWith((Executor) obj2, new w9.v(2, taskCompletionSource));
                    break;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m2 m2Var = (m2) obj;
                ((zr0) obj3).H = -1;
                if (tL_error2 != null) {
                    yc.a0(m2Var).d0(tL_error2, false);
                    break;
                }
                break;
            case 5:
                o2 o2Var = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                zr0 zr0Var = o2Var.a;
                zr0Var.e.k(o2Var.e.d, savedStarGift);
                ((y70) obj).u();
                zr0Var.n();
                TL_stars.TL_starGiftCollection c10 = zr0Var.e.c(o2Var.e.d);
                if (c10 != null) {
                    yc.a0(zr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, x3.D1(savedStarGift.gift), c10.title))).j();
                    break;
                }
                break;
            case 6:
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
            case 7:
                v3 v3Var = (v3) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = v3Var.m;
                HashMap hashMap2 = v3Var.o;
                HashMap hashMap3 = v3Var.n;
                ArrayList arrayList = v3Var.h;
                ArrayList arrayList2 = v3Var.g;
                ArrayList arrayList3 = v3Var.f;
                int i13 = v3Var.a;
                ArrayList arrayList4 = v3Var.d;
                v3Var.v = -1;
                if (tLObject2 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject2;
                    MessagesController.getInstance(i13).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i13).putChats(resalestargifts.chats, false);
                    v3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i14);
                        i14++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    v3Var.u = arrayList4.size() >= v3Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    v3Var.q = resalestargifts.next_offset;
                    v3Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        v3Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i15);
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
                    Utilities.Callback callback = v3Var.c;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z11));
                        break;
                    }
                }
                break;
            case 8:
                yh.g gVar = (yh.g) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    nf.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject3).url);
                }
                AndroidUtilities.runOnUIThread(new yh.b(gVar, i11), 1000L);
                break;
            case 9:
                yh.g.a0((yh.g) obj3, (TLObject) obj2, (TLRPC.TL_error) obj);
                break;
            case 10:
                x3 x3Var = (x3) obj3;
                Long l4 = (Long) obj2;
                x3Var.Z1(l4.longValue(), new c5(x3Var, l4, (m1[]) obj, 13));
                break;
            case 11:
                x3.j0((x3) obj3, (TLObject) obj2, (MessageObject) obj);
                break;
            case 12:
                x3 x3Var2 = (x3) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                x3Var2.getClass();
                ((nf.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                x3Var2.e0.setResellPrice(zf.a.i(0L, zf.b.a));
                d2 d2Var = x3Var2.d1;
                if (d2Var != null) {
                    d2Var.run();
                }
                hg.c.q(R.string.Gift2ResaleDisable, new Object[]{x3Var2.C1()}, x3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            case 13:
                x3 x3Var3 = (x3) obj3;
                x3Var3.getClass();
                ((nf.e) obj2).c(false);
                x3Var3.getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                break;
            case 14:
                ((m1[]) obj3)[0].dismiss();
                ((nf.e) obj2).c(false);
                x3.d2((TwoStepVerificationActivity) obj);
                break;
            case 15:
                x3.T((x3) obj3, (a2) obj2, (MessageObject) obj);
                break;
            case 16:
                x3.V((x3) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
                break;
            case 17:
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback2.run((TLRPC.TL_payments_paymentFormStarGift) tLObject4);
                    break;
                } else {
                    t5.e(tL_error3 == null ? "NO_PAYMENT_FORM" : tL_error3.text);
                    callback2.run(null);
                    break;
                }
            case 18:
                t5 t5Var = (t5) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList8 = t5Var.v;
                boolean[] zArr = t5Var.r;
                ArrayList[] arrayListArr = t5Var.q;
                int i16 = t5Var.a;
                boolean z14 = !t5Var.e;
                t5Var.c = System.currentTimeMillis();
                if (tLObject5 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                    MessagesController.getInstance(i16).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i16).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList9 = starsStatus.history;
                        int size3 = arrayList9.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList9.get(i17);
                            i17++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                        }
                        j3 = 0;
                        for (int i18 = 0; i18 < 3; i18++) {
                            zArr[i18] = !arrayListArr[i18].isEmpty() || zArr[i18];
                            boolean[] zArr2 = t5Var.u;
                            boolean z15 = (starsStatus.flags & 1) == 0;
                            zArr2[i18] = z15;
                            if (z15) {
                                t5Var.t[i18] = false;
                            }
                            t5Var.s[i18] = zArr2[i18] ? null : starsStatus.next_offset;
                        }
                        z13 = true;
                    } else {
                        j3 = 0;
                        z13 = false;
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList8.addAll(starsStatus.subscriptions);
                        t5Var.x = false;
                        t5Var.w = starsStatus.subscriptions_next_offset;
                        t5Var.y = (starsStatus.flags & 4) == 0;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    long j10 = t5Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z14 = true;
                    }
                    t5Var.f = starsAmount;
                    t5Var.g = j3;
                } else {
                    z12 = false;
                    z13 = false;
                }
                t5Var.d = false;
                t5Var.e = true;
                if (z14) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z13) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z12) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 19:
                t5 t5Var2 = (t5) obj3;
                Runnable runnable2 = (Runnable) obj;
                t5Var2.getClass();
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    t5Var2.Q.remove(num);
                    t5Var2.R.remove(num);
                }
                runnable2.run();
                break;
            default:
                ((boolean[]) obj3)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj2);
                ((e3[]) obj)[0].dismiss();
                break;
        }
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
