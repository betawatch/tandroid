package zh;

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
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xo0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [org.telegram.ui.ActionBar.n2] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.ActionBar.n2, org.telegram.ui.xo0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        long j10;
        ?? r16;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        ?? r52 = 0;
        SQLiteCursor sQLiteCursor = null;
        xo0 xo0Var = null;
        r5 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        xo0 xo0Var2 = null;
        Object obj = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        boolean z10 = false;
        int i13 = 0;
        switch (i11) {
            case 0:
                a0 a0Var = (a0) obj5;
                of.e eVar = (of.e) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                b1 b1Var = a0Var.q0;
                if (b1Var != null) {
                    b1Var.run();
                }
                eVar.c(false);
                b2Var.dismiss();
                a0Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates == null) {
                        yc.a0(U).d0(tL_error, false);
                        return;
                    }
                    qc M = yc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, a0Var.Z, DialogObject.getShortName(a0Var.a0))), R.raw.forward);
                    M.t = true;
                    M.j();
                    return;
                }
                return;
            case 1:
                s5 s5Var = (s5) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                bi.f0 f0Var = (bi.f0) obj4;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) obj2;
                if (tL_error2 != null) {
                    f0Var.run(Boolean.FALSE, tL_error2.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(s5Var.a).putUsers(paymentForm.users, false);
                    r52 = new xo0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    r52 = new xo0((TLRPC.PaymentReceipt) tLObject);
                }
                if (r52 == 0) {
                    f0Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                r52.Z0 = new rg.p2(f0Var, 25);
                ?? R = LaunchActivity.R();
                if (R == 0) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(r52);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                R.showAsSheet(r52, l2Var);
                return;
            case 2:
                s5 s5Var2 = (s5) obj5;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                d80 d80Var = (d80) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) obj2;
                if (tL_error3 != null) {
                    d80Var.run(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(s5Var2.a).putUsers(paymentForm2.users, false);
                    xo0Var2 = new xo0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    xo0Var2 = new xo0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (xo0Var2 == null) {
                    d80Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                xo0Var2.Z0 = new rg.p2(d80Var, 26);
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R2)) {
                    R2.presentFragment(xo0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                l2Var2.a = true;
                R2.showAsSheet(xo0Var2, l2Var2);
                return;
            case 3:
                ((boolean[]) obj4)[0] = true;
                ((s5) obj5).Z((String) obj3, (TLRPC.ChatInvite) obj2, new ii.a((Utilities.Callback2) obj, 25));
                return;
            case 4:
                MessagesStorage messagesStorage = (MessagesStorage) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList<TLRPC.Chat> arrayList2 = (ArrayList) obj3;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) obj2;
                rg.p2 p2Var = (rg.p2) obj;
                try {
                    try {
                        sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        ?? r72 = 0;
                        long j11 = 0;
                        while (sQLiteCursor.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    if (TLdeserialize != null) {
                                        arrayList.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    r72 = (int) sQLiteCursor.longValue(1);
                                    j11 = sQLiteCursor.longValue(2);
                                }
                            } catch (Exception e7) {
                                e = e7;
                                z10 = r72;
                                j3 = j11;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                j10 = j3;
                                r16 = z10;
                                AndroidUtilities.runOnUIThread(new fi.p3(p2Var, arrayList, (int) r16, j10, arrayList3, arrayList2));
                                return;
                            }
                        }
                        ArrayList<Long> arrayList4 = new ArrayList<>();
                        ArrayList arrayList5 = new ArrayList();
                        int size = arrayList.size();
                        while (i13 < size) {
                            Object obj6 = arrayList.get(i13);
                            i13++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj6).released_by;
                            if (peer != null) {
                                i10 = size;
                                long peerDialogId = DialogObject.getPeerDialogId(peer);
                                if (peerDialogId > 0) {
                                    arrayList4.add(Long.valueOf(peerDialogId));
                                } else if (peerDialogId < 0) {
                                    arrayList5.add(Long.valueOf(-peerDialogId));
                                }
                            } else {
                                i10 = size;
                            }
                            size = i10;
                        }
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList2);
                        }
                        if (!arrayList4.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList4, arrayList3);
                        }
                        sQLiteCursor.dispose();
                        j10 = j11;
                        r16 = r72;
                    } catch (Exception e10) {
                        e = e10;
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new fi.p3(p2Var, arrayList, (int) r16, j10, arrayList3, arrayList2));
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        r52.dispose();
                    }
                    throw th2;
                }
            case 5:
                TLObject tLObject3 = (TLObject) obj4;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                int i14 = ((s5) obj5).a;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i15 = 0; i15 < tL_payments_savedStarGifts.gifts.size(); i15++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i15);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                callback.run(savedStarGift);
                return;
            case 6:
                s5 s5Var3 = (s5) obj5;
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
                    MessagesController.getInstance(s5Var3.a).putUsers(paymentForm3.users, false);
                    xo0Var = new xo0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    xo0Var = new xo0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (xo0Var == null) {
                    callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                xo0Var.Z0 = new rg.p2(callback2, 24);
                org.telegram.ui.ActionBar.n2 R3 = LaunchActivity.R();
                if (R3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R3)) {
                    R3.presentFragment(xo0Var);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.a = true;
                R3.showAsSheet(xo0Var, l2Var3);
                return;
            default:
                List list = (List) obj5;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj4;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) obj3;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new b4(i12, callback22));
                    return;
                }
                c5.o oVar = (c5.o) list.get(0);
                c5.k a2 = oVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new b4(3, callback22));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(oVar.c, new di.e5(callback22, 6));
                BillingController.getInstance().setOnCanceled(new b4(z10 ? 1 : 0, callback22));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                pf.b bVar = new pf.b(7, z10);
                bVar.h0((c5.o) list.get(0));
                billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar.w()));
                return;
        }
    }

    public /* synthetic */ u(s5 s5Var, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i10) {
        this.a = i10;
        this.c = s5Var;
        this.b = tL_error;
        this.d = callback2;
        this.e = tLObject;
        this.f = tL_inputInvoiceStars;
    }

    public /* synthetic */ u(s5 s5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.a = 5;
        this.c = s5Var;
        this.e = b2Var;
        this.d = tLObject;
        this.f = inputSavedStarGift;
        this.b = callback;
    }
}
