package wh;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import bi.o4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import ug.n1;
import yh.b2;
import yh.h1;
import yh.m2;
import yh.t3;
import zh.s5;
import zh.w3;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i10) {
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
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                p pVar = (p) obj3;
                e90 e90Var = (e90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                c90 c90Var = pVar.y;
                if (c90Var != null && pVar.E == e90Var) {
                    c90Var.a(clickableSpan);
                    pVar.E = null;
                    pVar.s.d(true);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n2 n2Var = (n2) obj;
                ((nr0) obj3).H = -1;
                if (tL_error != null) {
                    yc.a0(n2Var).d0(tL_error, false);
                    break;
                }
                break;
            case 2:
                m2 m2Var = (m2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                nr0 nr0Var = m2Var.a;
                nr0Var.e.k(m2Var.e.d, savedStarGift);
                ((n70) obj).u();
                nr0Var.n();
                TL_stars.TL_starGiftCollection c10 = nr0Var.e.c(m2Var.e.d);
                if (c10 != null) {
                    yc.a0(nr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, w3.D1(savedStarGift.gift), c10.title))).j();
                    break;
                }
                break;
            case 3:
                m2 m2Var2 = (m2) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                h1 h1Var = (h1) obj;
                if (m2Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    h1Var.c(false, true);
                    m2Var2.e.m(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                h1Var.h(savedStarGift2, z10, m2Var2.d);
                m2Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = m2Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(m2Var2.b).sendRequest(savestargift, null);
                break;
            case 4:
                t3 t3Var = (t3) obj3;
                TLObject tLObject = (TLObject) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = t3Var.m;
                HashMap hashMap2 = t3Var.o;
                HashMap hashMap3 = t3Var.n;
                ArrayList arrayList = t3Var.h;
                ArrayList arrayList2 = t3Var.g;
                ArrayList arrayList3 = t3Var.f;
                int i11 = t3Var.a;
                ArrayList arrayList4 = t3Var.d;
                t3Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    MessagesController.getInstance(i11).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i11).putChats(resalestargifts.chats, false);
                    t3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i12);
                        i12++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    t3Var.u = arrayList4.size() >= t3Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    t3Var.q = resalestargifts.next_offset;
                    t3Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(s5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(s5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(s5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        t3Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i13);
                            i13++;
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
                    Utilities.Callback callback = t3Var.c;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z11));
                        break;
                    }
                }
                break;
            case 5:
                zh.g gVar = (zh.g) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    of.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject2).url);
                }
                AndroidUtilities.runOnUIThread(new zh.b(gVar, 5), 1000L);
                break;
            case 6:
                zh.g.a0((zh.g) obj3, (TLObject) obj2, (TLRPC.TL_error) obj);
                break;
            case 7:
                w3 w3Var = (w3) obj3;
                Long l4 = (Long) obj2;
                w3Var.Z1(l4.longValue(), new o4(w3Var, l4, (n1[]) obj, 10));
                break;
            case 8:
                w3.k0((w3) obj3, (TLObject) obj2, (MessageObject) obj);
                break;
            case 9:
                w3 w3Var2 = (w3) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                w3Var2.getClass();
                ((of.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                w3Var2.e0.setResellPrice(zf.a.i(0L, zf.b.a));
                b2 b2Var = w3Var2.d1;
                if (b2Var != null) {
                    b2Var.run();
                }
                i2.g.s(R.string.Gift2ResaleDisable, new Object[]{w3Var2.C1()}, w3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            case 10:
                w3 w3Var3 = (w3) obj3;
                w3Var3.getClass();
                ((of.e) obj2).c(false);
                w3Var3.getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                break;
            case 11:
                ((n1[]) obj3)[0].dismiss();
                ((of.e) obj2).c(false);
                w3.d2((TwoStepVerificationActivity) obj);
                break;
            case 12:
                w3.T((w3) obj3, (org.telegram.ui.ActionBar.b2) obj2, (MessageObject) obj);
                break;
            case 13:
                w3.V((w3) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
                break;
            case 14:
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback2.run((TLRPC.TL_payments_paymentFormStarGift) tLObject3);
                    break;
                } else {
                    s5.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                    callback2.run(null);
                    break;
                }
            case 15:
                s5 s5Var = (s5) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList8 = s5Var.v;
                boolean[] zArr = s5Var.r;
                ArrayList[] arrayListArr = s5Var.q;
                int i14 = s5Var.a;
                boolean z14 = !s5Var.e;
                s5Var.c = System.currentTimeMillis();
                if (tLObject4 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject4;
                    MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList9 = starsStatus.history;
                        int size3 = arrayList9.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList9.get(i15);
                            i15++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                        }
                        j3 = 0;
                        for (int i16 = 0; i16 < 3; i16++) {
                            zArr[i16] = !arrayListArr[i16].isEmpty() || zArr[i16];
                            boolean[] zArr2 = s5Var.u;
                            boolean z15 = (starsStatus.flags & 1) == 0;
                            zArr2[i16] = z15;
                            if (z15) {
                                s5Var.t[i16] = false;
                            }
                            s5Var.s[i16] = zArr2[i16] ? null : starsStatus.next_offset;
                        }
                        z13 = true;
                    } else {
                        j3 = 0;
                        z13 = false;
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList8.addAll(starsStatus.subscriptions);
                        s5Var.x = false;
                        s5Var.w = starsStatus.subscriptions_next_offset;
                        s5Var.y = (starsStatus.flags & 4) == 0;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    long j10 = s5Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z14 = true;
                    }
                    s5Var.f = starsAmount;
                    s5Var.g = j3;
                } else {
                    z12 = false;
                    z13 = false;
                }
                s5Var.d = false;
                s5Var.e = true;
                if (z14) {
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z13) {
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z12) {
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 16:
                s5 s5Var2 = (s5) obj3;
                Runnable runnable2 = (Runnable) obj;
                s5Var2.getClass();
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    s5Var2.Q.remove(num);
                    s5Var2.R.remove(num);
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

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
