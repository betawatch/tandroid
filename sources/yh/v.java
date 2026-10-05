package yh;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.so0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0240  */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        long j3;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 2;
        so0 so0Var = 0;
        SQLiteCursor sQLiteCursor = null;
        so0 so0Var2 = null;
        r4 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        so0 so0Var3 = null;
        Object obj = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        ?? r11 = 0;
        switch (i13) {
            case 0:
                b0 b0Var = (b0) obj5;
                nf.e eVar = (nf.e) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                d1 d1Var = b0Var.q0;
                if (d1Var != null) {
                    d1Var.run();
                }
                eVar.c(false);
                b2Var.dismiss();
                b0Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        yc.a0(U).d0(tL_error, false);
                        return;
                    }
                    rc M = yc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, b0Var.Z, DialogObject.getShortName(b0Var.a0))), R.raw.forward);
                    M.t = true;
                    M.j();
                    return;
                }
                return;
            case 1:
                u5 u5Var = (u5) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                ai.m0 m0Var = (ai.m0) obj4;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) obj2;
                if (tL_error2 != null) {
                    m0Var.run(Boolean.FALSE, tL_error2.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(u5Var.a).putUsers(paymentForm.users, false);
                    so0Var = new so0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    so0Var = new so0((TLRPC.PaymentReceipt) tLObject);
                }
                if (so0Var == 0) {
                    m0Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                so0Var.Z0 = new r2.s(m0Var, 28);
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(so0Var);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                R.showAsSheet(so0Var, l2Var);
                return;
            case 2:
                u5 u5Var2 = (u5) obj5;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                r80 r80Var = (r80) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) obj2;
                if (tL_error3 != null) {
                    r80Var.run(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(u5Var2.a).putUsers(paymentForm2.users, false);
                    so0Var3 = new so0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    so0Var3 = new so0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (so0Var3 == null) {
                    r80Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                so0Var3.Z0 = new r2.s(r80Var, 29);
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(so0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                l2Var2.a = true;
                R2.showAsSheet(so0Var3, l2Var2);
                return;
            case 3:
                ((boolean[]) obj4)[0] = true;
                ((u5) obj5).Z((String) obj3, (TLRPC.ChatInvite) obj2, new hi.a((Utilities.Callback2) obj, 26));
                return;
            case 4:
                MessagesStorage messagesStorage = (MessagesStorage) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList<TLRPC.Chat> arrayList2 = (ArrayList) obj3;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) obj2;
                r2.s sVar = (r2.s) obj;
                long j10 = 0;
                try {
                    try {
                        SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        long j11 = 0;
                        int i15 = 0;
                        while (queryFinalized.next()) {
                            try {
                                try {
                                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r11);
                                    if (byteBufferValue != 0) {
                                        TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r11), r11);
                                        if (TLdeserialize != null) {
                                            arrayList.add(TLdeserialize);
                                        }
                                        byteBufferValue.reuse();
                                        i15 = (int) queryFinalized.longValue(1);
                                        j11 = queryFinalized.longValue(2);
                                    }
                                    r11 = 0;
                                } catch (Exception e7) {
                                    e = e7;
                                    i10 = i15;
                                    j10 = j11;
                                    sQLiteCursor = queryFinalized;
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    j3 = j10;
                                    i11 = i10;
                                    AndroidUtilities.runOnUIThread(new ei.q3(sVar, arrayList, i11, j3, arrayList3, arrayList2));
                                    return;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                i12 = i15;
                            }
                        }
                        ArrayList<Long> arrayList4 = new ArrayList<>();
                        ArrayList arrayList5 = new ArrayList();
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj6 = arrayList.get(i16);
                            i16++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj6).released_by;
                            if (peer != null) {
                                i12 = i15;
                                try {
                                    long peerDialogId = DialogObject.getPeerDialogId(peer);
                                    if (peerDialogId > 0) {
                                        arrayList4.add(Long.valueOf(peerDialogId));
                                    } else if (peerDialogId < 0) {
                                        arrayList5.add(Long.valueOf(-peerDialogId));
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    i10 = i12;
                                    j10 = j11;
                                    sQLiteCursor = queryFinalized;
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                    }
                                    j3 = j10;
                                    i11 = i10;
                                    AndroidUtilities.runOnUIThread(new ei.q3(sVar, arrayList, i11, j3, arrayList3, arrayList2));
                                    return;
                                }
                            } else {
                                i12 = i15;
                            }
                            i15 = i12;
                        }
                        i12 = i15;
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList2);
                        }
                        if (!arrayList4.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList4, arrayList3);
                        }
                        queryFinalized.dispose();
                        i11 = i12;
                        j3 = j11;
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            so0Var.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    i10 = 0;
                }
                AndroidUtilities.runOnUIThread(new ei.q3(sVar, arrayList, i11, j3, arrayList3, arrayList2));
                return;
            case 5:
                TLObject tLObject3 = (TLObject) obj4;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                int i17 = ((u5) obj5).a;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    MessagesController.getInstance(i17).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i17).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i18 = 0; i18 < tL_payments_savedStarGifts.gifts.size(); i18++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i18);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                callback.run(savedStarGift);
                return;
            case 6:
                u5 u5Var3 = (u5) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) obj2;
                if (tL_error4 != null) {
                    callback2.run(Boolean.FALSE, tL_error4.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject4;
                    paymentForm3.invoice.recurring = true;
                    MessagesController.getInstance(u5Var3.a).putUsers(paymentForm3.users, false);
                    so0Var2 = new so0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    so0Var2 = new so0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (so0Var2 == null) {
                    callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                so0Var2.Z0 = new r2.s(callback2, 27);
                org.telegram.ui.ActionBar.n2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(so0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.a = true;
                R3.showAsSheet(so0Var2, l2Var3);
                return;
            default:
                List list = (List) obj5;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj4;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) obj3;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new d4(i14, callback22));
                    return;
                }
                c5.o oVar = (c5.o) list.get(0);
                c5.k a2 = oVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new d4(3, callback22));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(oVar.c, new ci.d5(callback22, 6));
                BillingController.getInstance().setOnCanceled(new d4(r11 == true ? 1 : 0, callback22));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                of.b bVar = new of.b(7, (boolean) r11);
                bVar.O((c5.o) list.get(0));
                billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar.i()));
                return;
        }
    }

    public /* synthetic */ v(u5 u5Var, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i10) {
        this.a = i10;
        this.c = u5Var;
        this.b = tL_error;
        this.d = callback2;
        this.e = tLObject;
        this.f = tL_inputInvoiceStars;
    }

    public /* synthetic */ v(u5 u5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.a = 5;
        this.c = u5Var;
        this.e = b2Var;
        this.d = tLObject;
        this.f = inputSavedStarGift;
        this.b = callback;
    }
}
