package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ye(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.a = i10;
        this.b = callback;
        this.d = obj;
        this.e = obj2;
        this.c = str;
        this.f = obj3;
        this.h = tLObject;
        this.n = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        ci.l8 m10;
        oo0 oo0Var;
        oo0 oo0Var2;
        int i14 = this.a;
        int i15 = 7;
        int i16 = 4;
        int i17 = 2;
        boolean z10 = false;
        int i18 = 1;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.c;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.b;
        switch (i14) {
            case 0:
                wn wnVar = (wn) obj7;
                MessageObject messageObject = (MessageObject) obj5;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) obj;
                wnVar.getClass();
                ((org.telegram.ui.Components.y70) obj6).n0 = true;
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    str = u1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject.messageText)) {
                    str = u1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(wnVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                mm0Var.dismiss();
                break;
            case 1:
                wn wnVar2 = (wn) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                TLObject tLObject = (TLObject) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                hg hgVar = (hg) obj2;
                String str2 = (String) obj3;
                nf.e eVar = (nf.e) obj;
                if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                    z10 = true;
                }
                if (tLObject != null || (tL_error == null && (tLObject2 instanceof TLRPC.TL_boolTrue))) {
                    hgVar.run(tLObject, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    eVar.b = new df(wnVar2, wnVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new ci.t1(wnVar2, eVar, hgVar, z10, 2)), i15);
                    eVar.d();
                    break;
                }
            case 2:
                TLObject tLObject3 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject2 = (MessageObject) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                wn wnVar3 = ((in) obj7).a;
                ((org.telegram.ui.ActionBar.a2) obj6).dismiss();
                if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    wnVar3.getMessagesController().putUsers(groupcall.users, false);
                    wnVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        wnVar3.showDialog(new yt(wnVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = wnVar3.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) wnVar3).currentAccount;
                        org.telegram.ui.Components.voip.g2.g(parentActivity, i10, tL_inputGroupCallInviteMessage, messageObject2.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error2 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.xc.a0(wnVar3).d0(tL_error2, false);
                        break;
                    }
                } else {
                    wnVar3.showDialog(new yt(wnVar3.getParentActivity(), hashSet));
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj5;
                String str3 = (String) obj3;
                Bundle bundle = (Bundle) obj4;
                TLObject tLObject4 = (TLObject) obj2;
                TL_account.sendConfirmPhoneCode sendconfirmphonecode = (TL_account.sendConfirmPhoneCode) obj;
                Pattern pattern = LaunchActivity.B1;
                ((org.telegram.ui.ActionBar.a2) obj6).dismiss();
                if (tL_error3 == null) {
                    qg0 qg0Var = new qg0();
                    qg0Var.G = str3;
                    qg0Var.H = bundle;
                    qg0Var.I = (TLRPC.TL_auth_sentCode) tLObject4;
                    qg0Var.F = 1;
                    launchActivity.p0(qg0Var);
                    break;
                } else {
                    org.telegram.ui.Components.e5.f0(launchActivity.O, tL_error3, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 4:
                zf0 zf0Var = (zf0) obj7;
                List<Purchase> list = (List) obj5;
                String str4 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                org.telegram.ui.Components.vn0 vn0Var = (org.telegram.ui.Components.vn0) obj;
                if (((c5.h) obj6).a == 0 && list != null && !list.isEmpty()) {
                    for (Purchase purchase : list) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            zf0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new ci.hd(zf0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore, vn0Var, 8), 74);
                            break;
                        }
                    }
                }
                vn0Var.run();
                break;
            case 5:
                pg0 pg0Var = (pg0) obj7;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj6;
                TLObject tLObject5 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str5 = (String) obj3;
                la.h hVar = (la.h) obj2;
                TLObject tLObject6 = (TLObject) obj;
                qg0 qg0Var2 = pg0Var.V;
                pg0Var.K = false;
                int i19 = 5;
                if (tL_error4 != null) {
                    String str6 = tL_error4.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((org.telegram.ui.ActionBar.m2) qg0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new vb0(i19, pg0Var, str5), 10);
                        } else if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                            qg0.m1(qg0Var2, str5, hVar, false);
                        } else if (tL_error4.text.contains("PHONE_PASSWORD_FLOOD")) {
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.text.contains("PHONE_NUMBER_FLOOD")) {
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error4.text.contains("PHONE_NUMBER_BANNED")) {
                            qg0.m1(qg0Var2, str5, hVar, true);
                        } else if (tL_error4.text.contains("PHONE_CODE_EMPTY") || tL_error4.text.contains("PHONE_CODE_INVALID")) {
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            qg0Var2.u1(0, true, null, true);
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.m2) qg0Var2).currentAccount;
                            org.telegram.ui.Components.e5.f0(i11, tL_error4, qg0Var2, tLObject6, (String) hVar.d);
                        }
                    }
                } else if (tLObject5 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject5).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            qg0Var2.p0 = tL_help_termsOfService;
                        }
                        qg0Var2.u1(5, true, bundle2, false);
                    } else {
                        qg0Var2.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    qg0Var2.g1(bundle2, (TLRPC.auth_SentCode) tLObject5, true);
                }
                if (!qg0Var2.o0) {
                    qg0Var2.k1(false, true);
                    break;
                }
                break;
            case 6:
                TLObject tLObject7 = (TLObject) obj6;
                String str7 = (String) obj3;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj5;
                jm0 jm0Var = (jm0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                um0 um0Var = (um0) obj;
                gn0 gn0Var = ((im0) obj7).p.d;
                if (tLObject7 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject7;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    gn0 gn0Var2 = new gn0(6, gn0Var.y, gn0Var.J, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.m2) gn0Var2).currentAccount = i13;
                    gn0Var2.T0 = sentemailcode.length;
                    gn0Var2.e1 = gn0Var.e1;
                    gn0Var2.c1 = gn0Var.c1;
                    gn0Var2.B1 = jm0Var;
                    gn0Var.presentFragment(gn0Var2, true);
                    break;
                } else {
                    gn0Var.M1(LocaleController.getString(R.string.PassportEmail), tL_error5.text);
                    if (um0Var != null) {
                        um0Var.c(tL_error5.text, str7);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj7;
                int[] iArr = (int[]) obj6;
                File file = (File) obj5;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                String str10 = (String) obj;
                if (iArr[4] > 0) {
                    int i20 = iArr[1];
                    int i21 = iArr[2];
                    int photoSize = i20 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i20;
                    int photoSize2 = i21 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i21;
                    File w10 = ci.l8.w(UserConfig.selectedAccount, "jpg");
                    org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p5 = d6Var.p();
                    d6Var.u();
                    if (p5 != null) {
                        try {
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            p5.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w10));
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            w10 = null;
                            m10 = ci.l8.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr[4]);
                            m10.k0 = i20;
                            m10.l0 = i21;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            a2Var.c(500L);
                            return;
                        }
                    }
                    m10 = ci.l8.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr[4]);
                    m10.k0 = i20;
                    m10.l0 = i21;
                    m10.A();
                } else {
                    m10 = ci.l8.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str8 != null) {
                        m10.C0 = str8;
                    }
                    if (!TextUtils.isEmpty(str9) && UserConfig.getInstance(b1Var.M).isPremium()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        qg.o0 o0Var = new qg.o0();
                        mediaEntity.linkSettings = o0Var;
                        o0Var.c = str9;
                        if (str10 != null) {
                            o0Var.a |= 2;
                            o0Var.b = str10;
                        }
                        m10.T0.add(mediaEntity);
                    }
                    ci.lc.E(b1Var.W, UserConfig.selectedAccount).U(null, m10);
                    a2Var.c(500L);
                    break;
                } else {
                    a2Var.c(500L);
                }
                break;
            case 8:
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj7;
                tg.v vVar = (tg.v) obj6;
                TLObject tLObject8 = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                tg.v vVar2 = (tg.v) obj;
                if (tL_error6 != null) {
                    vVar.run(tL_error6);
                    break;
                } else {
                    if (tLObject8 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        oo0Var = new oo0(paymentForm, tL_inputInvoicePremiumGiftCode, m2Var);
                    } else {
                        oo0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new oo0((TLRPC.PaymentReceipt) tLObject8) : null;
                    }
                    if (oo0Var != null) {
                        oo0Var.Z0 = new s5.e(3, vVar2, vVar);
                        LaunchActivity.R().showAsSheet(oo0Var, new org.telegram.ui.ActionBar.k2());
                        break;
                    } else {
                        vVar.run(null);
                        break;
                    }
                }
            case 9:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                Utilities.Callback callback = (Utilities.Callback) obj6;
                TLObject tLObject9 = (TLObject) obj5;
                MessagesController messagesController2 = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error7 != null) {
                    callback.run(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject9;
                        paymentForm2.invoice.recurring = true;
                        messagesController2.putUsers(paymentForm2.users, false);
                        oo0Var2 = new oo0(paymentForm2, tL_inputInvoicePremiumGiftCode2, m2Var2);
                    } else {
                        oo0Var2 = tLObject9 instanceof TLRPC.PaymentReceipt ? new oo0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (oo0Var2 != null) {
                        oo0Var2.Z0 = new s5.e(i16, callback2, callback);
                        LaunchActivity.R().showAsSheet(oo0Var2, new org.telegram.ui.ActionBar.k2());
                        break;
                    } else {
                        callback.run(null);
                        break;
                    }
                }
            case 10:
                ((boolean[]) obj6)[0] = true;
                ((yh.s5) obj7).Z((String) obj3, (TLRPC.ChatInvite) obj5, new yh.e4((boolean[]) obj4, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 11:
                yh.s5 s5Var = (yh.s5) obj7;
                TLObject tLObject10 = (TLObject) obj6;
                MessageObject messageObject3 = (MessageObject) obj5;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj4;
                Utilities.Callback callback3 = (Utilities.Callback) obj3;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                if (tLObject10 instanceof TLRPC.TL_payments_paymentFormStars) {
                    s5Var.a0(messageObject3, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject10, callback3);
                    break;
                } else {
                    callback3.run(Boolean.FALSE);
                    hg.c.q(R.string.UnknownErrorCode, new Object[]{tL_error8 != null ? tL_error8.text : "FAILED_GETTING_FORM"}, xcVar, R.raw.error, 36);
                    break;
                }
            case 12:
                yh.s5 s5Var2 = (yh.s5) obj7;
                List list2 = (List) obj6;
                org.telegram.ui.Components.o80 o80Var = (org.telegram.ui.Components.o80) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                c5.h hVar2 = (c5.h) obj2;
                Activity activity = (Activity) obj;
                if (list2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new yh.l4(o80Var, i18));
                    break;
                } else {
                    c5.o oVar = (c5.o) list2.get(0);
                    c5.k a2 = oVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new yh.l4(o80Var, i17));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(s5Var2.a).sendRequest(tL_payments_canPurchaseStore2, new dh1(oVar, hVar2, o80Var, activity, tL_inputStorePaymentStarsGift, list2, 4));
                        break;
                    }
                }
            default:
                yh.o8 o8Var = (yh.o8) obj7;
                ai.h1[] h1VarArr = (ai.h1[]) obj6;
                int[] iArr2 = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                zg.p0 p0Var = (zg.p0) obj2;
                zg.m0 m0Var = (zg.m0) obj;
                if (o8Var.d) {
                    ai.h1 h1Var = h1VarArr[0];
                    if (h1Var == null) {
                        h1Var = o8Var.N.d(o8Var.O);
                        h1VarArr[0] = h1Var;
                    }
                    if (h1Var != null) {
                        h1Var.setDrawStar(false);
                        h1Var.getLocationInWindow(iArr2);
                        TextView textView = h1Var.E;
                        org.telegram.ui.Components.pq[] pqVarArr = h1Var.G;
                        if (pqVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + pqVarArr[0].translateX;
                            float y3 = textView.getY() + textView.getPaddingTop() + pqVarArr[0].translateY;
                            rectF.set(x10, y3, r2.drawable.getBounds().width() + x10, pqVarArr[0].drawable.getBounds().height() + y3);
                        }
                        rectF.offset(iArr2[0], iArr2[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr2);
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr2[0] + p0Var.c + m0Var.x, ((m0Var.B - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr2[1] + p0Var.d + m0Var.y, AndroidUtilities.dp(26.0f) + iArr2[0] + p0Var.c + m0Var.x, ((AndroidUtilities.dp(22.0f) + m0Var.B) / 2.0f) + iArr2[1] + p0Var.d + m0Var.y);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ye(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
        this.h = obj6;
        this.n = obj7;
    }

    public /* synthetic */ ye(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = tLObject;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ ye(in inVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = inVar;
        this.d = a2Var;
        this.f = tLObject;
        this.c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.n = tL_error;
    }

    public /* synthetic */ ye(wn wnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, hg hgVar, String str, nf.e eVar) {
        this.a = 1;
        this.b = wnVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
        this.h = hgVar;
        this.c = str;
        this.n = eVar;
    }
}
