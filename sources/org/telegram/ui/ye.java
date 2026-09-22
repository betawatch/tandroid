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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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

    /* JADX WARN: Removed duplicated region for block: B:109:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        ci.o8 m10;
        char c10;
        wo0 wo0Var;
        wo0 wo0Var2;
        int i14 = this.a;
        int i15 = 7;
        int i16 = 2;
        boolean z10 = false;
        int i17 = 1;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.c;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.b;
        switch (i14) {
            case 0:
                bo boVar = (bo) obj7;
                MessageObject messageObject = (MessageObject) obj5;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                org.telegram.ui.Components.am0 am0Var = (org.telegram.ui.Components.am0) obj;
                boVar.getClass();
                ((org.telegram.ui.Components.n70) obj6).n0 = true;
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    str = t1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject.messageText)) {
                    str = t1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(boVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                am0Var.dismiss();
                break;
            case 1:
                bo boVar2 = (bo) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                TLObject tLObject = (TLObject) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                mg mgVar = (mg) obj2;
                String str2 = (String) obj3;
                nf.e eVar = (nf.e) obj;
                if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                    z10 = true;
                }
                if (tLObject != null || (tL_error == null && (tLObject2 instanceof TLRPC.TL_boolTrue))) {
                    mgVar.run(tLObject, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    eVar.b = new ef(boVar2, boVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new ci.t1(boVar2, eVar, mgVar, z10, 2)), i15);
                    eVar.d();
                    break;
                }
                break;
            case 2:
                TLObject tLObject3 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject2 = (MessageObject) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                bo boVar3 = ((nn) obj7).a;
                ((org.telegram.ui.ActionBar.b2) obj6).dismiss();
                if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    boVar3.getMessagesController().putUsers(groupcall.users, false);
                    boVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        boVar3.showDialog(new cu(boVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = boVar3.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) boVar3).currentAccount;
                        org.telegram.ui.Components.voip.f2.g(parentActivity, i10, tL_inputGroupCallInviteMessage, messageObject2.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error2 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.vc.a0(boVar3).d0(tL_error2, false);
                        break;
                    }
                } else {
                    boVar3.showDialog(new cu(boVar3.getParentActivity(), hashSet));
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
                ((org.telegram.ui.ActionBar.b2) obj6).dismiss();
                if (tL_error3 == null) {
                    wg0 wg0Var = new wg0();
                    wg0Var.G = str3;
                    wg0Var.H = bundle;
                    wg0Var.I = (TLRPC.TL_auth_sentCode) tLObject4;
                    wg0Var.F = 1;
                    launchActivity.p0(wg0Var);
                    break;
                } else {
                    org.telegram.ui.Components.c5.f0(launchActivity.O, tL_error3, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 4:
                fg0 fg0Var = (fg0) obj7;
                List<Purchase> list = (List) obj5;
                String str4 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                org.telegram.ui.Components.jn0 jn0Var = (org.telegram.ui.Components.jn0) obj;
                if (((c5.h) obj6).a == 0 && list != null && !list.isEmpty()) {
                    for (Purchase purchase : list) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            fg0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new ci.kd(fg0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore, jn0Var, 8), 74);
                            break;
                        }
                    }
                }
                jn0Var.run();
                break;
            case 5:
                vg0 vg0Var = (vg0) obj7;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj6;
                TLObject tLObject5 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str5 = (String) obj3;
                lf.i iVar = (lf.i) obj2;
                TLObject tLObject6 = (TLObject) obj;
                wg0 wg0Var2 = vg0Var.V;
                vg0Var.K = false;
                int i18 = 5;
                if (tL_error4 != null) {
                    String str6 = tL_error4.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new bc0(i18, vg0Var, str5), 10);
                        } else if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                            wg0.m1(wg0Var2, str5, iVar, false);
                        } else if (tL_error4.text.contains("PHONE_PASSWORD_FLOOD")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.text.contains("PHONE_NUMBER_FLOOD")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error4.text.contains("PHONE_NUMBER_BANNED")) {
                            wg0.m1(wg0Var2, str5, iVar, true);
                        } else if (tL_error4.text.contains("PHONE_CODE_EMPTY") || tL_error4.text.contains("PHONE_CODE_INVALID")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            wg0Var2.u1(0, true, null, true);
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                            org.telegram.ui.Components.c5.f0(i11, tL_error4, wg0Var2, tLObject6, (String) iVar.d);
                        }
                    }
                } else if (tLObject5 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject5).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            wg0Var2.p0 = tL_help_termsOfService;
                        }
                        wg0Var2.u1(5, true, bundle2, false);
                    } else {
                        wg0Var2.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    wg0Var2.g1(bundle2, (TLRPC.auth_SentCode) tLObject5, true);
                }
                if (!wg0Var2.o0) {
                    wg0Var2.k1(false, true);
                    break;
                }
                break;
            case 6:
                TLObject tLObject7 = (TLObject) obj6;
                String str7 = (String) obj3;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj5;
                rm0 rm0Var = (rm0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                cn0 cn0Var = (cn0) obj;
                on0 on0Var = ((qm0) obj7).p.d;
                if (tLObject7 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject7;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    on0 on0Var2 = new on0(6, on0Var.y, on0Var.J, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((org.telegram.ui.ActionBar.n2) on0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.n2) on0Var2).currentAccount = i13;
                    on0Var2.T0 = sentemailcode.length;
                    on0Var2.e1 = on0Var.e1;
                    on0Var2.c1 = on0Var.c1;
                    on0Var2.B1 = rm0Var;
                    on0Var.presentFragment(on0Var2, true);
                    break;
                } else {
                    on0Var.M1(LocaleController.getString(R.string.PassportEmail), tL_error5.text);
                    if (cn0Var != null) {
                        cn0Var.b(tL_error5.text, str7);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj7;
                int[] iArr = (int[]) obj6;
                File file = (File) obj5;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                String str10 = (String) obj;
                if (iArr[4] > 0) {
                    int i19 = iArr[1];
                    int i20 = iArr[2];
                    int photoSize = i19 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i19;
                    int photoSize2 = i20 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i20;
                    File w10 = ci.o8.w(UserConfig.selectedAccount, "jpg");
                    org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p5 = b6Var.p();
                    b6Var.u();
                    if (p5 != null) {
                        try {
                            c10 = 4;
                        } catch (Exception e) {
                            e = e;
                            c10 = 4;
                        }
                        try {
                            p5.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w10));
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            w10 = null;
                            m10 = ci.o8.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr[c10]);
                            m10.k0 = i19;
                            m10.l0 = i20;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            b2Var.c(500L);
                            return;
                        }
                    } else {
                        c10 = 4;
                    }
                    m10 = ci.o8.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr[c10]);
                    m10.k0 = i19;
                    m10.l0 = i20;
                    m10.A();
                } else {
                    m10 = ci.o8.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str8 != null) {
                        m10.C0 = str8;
                    }
                    if (!TextUtils.isEmpty(str9) && UserConfig.getInstance(d1Var.M).isPremium()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        qg.q0 q0Var = new qg.q0();
                        mediaEntity.linkSettings = q0Var;
                        q0Var.c = str9;
                        if (str10 != null) {
                            q0Var.a |= 2;
                            q0Var.b = str10;
                        }
                        m10.T0.add(mediaEntity);
                    }
                    ci.oc.E(d1Var.W, UserConfig.selectedAccount).U(null, m10);
                    b2Var.c(500L);
                    break;
                } else {
                    b2Var.c(500L);
                }
                break;
            case 8:
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj7;
                tg.w wVar = (tg.w) obj6;
                TLObject tLObject8 = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                tg.w wVar2 = (tg.w) obj;
                if (tL_error6 != null) {
                    wVar.run(tL_error6);
                    break;
                } else {
                    if (tLObject8 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        wo0Var = new wo0(paymentForm, tL_inputInvoicePremiumGiftCode, n2Var);
                    } else {
                        wo0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new wo0((TLRPC.PaymentReceipt) tLObject8) : null;
                    }
                    if (wo0Var != null) {
                        wo0Var.Z0 = new tg.d(i16, wVar2, wVar);
                        LaunchActivity.R().showAsSheet(wo0Var, new org.telegram.ui.ActionBar.l2());
                        break;
                    } else {
                        wVar.run(null);
                        break;
                    }
                }
            case 9:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                Utilities.Callback callback = (Utilities.Callback) obj6;
                TLObject tLObject9 = (TLObject) obj5;
                MessagesController messagesController2 = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error7 != null) {
                    callback.run(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject9;
                        paymentForm2.invoice.recurring = true;
                        messagesController2.putUsers(paymentForm2.users, false);
                        wo0Var2 = new wo0(paymentForm2, tL_inputInvoicePremiumGiftCode2, n2Var2);
                    } else {
                        wo0Var2 = tLObject9 instanceof TLRPC.PaymentReceipt ? new wo0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (wo0Var2 != null) {
                        wo0Var2.Z0 = new tg.d(3, callback2, callback);
                        LaunchActivity.R().showAsSheet(wo0Var2, new org.telegram.ui.ActionBar.l2());
                        break;
                    } else {
                        callback.run(null);
                        break;
                    }
                }
            case 10:
                ((boolean[]) obj6)[0] = true;
                ((yh.u5) obj7).Z((String) obj3, (TLRPC.ChatInvite) obj5, new yh.g4((boolean[]) obj4, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 11:
                yh.u5 u5Var = (yh.u5) obj7;
                TLObject tLObject10 = (TLObject) obj6;
                MessageObject messageObject3 = (MessageObject) obj5;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj4;
                Utilities.Callback callback3 = (Utilities.Callback) obj3;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                if (tLObject10 instanceof TLRPC.TL_payments_paymentFormStars) {
                    u5Var.a0(messageObject3, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject10, callback3);
                    break;
                } else {
                    callback3.run(Boolean.FALSE);
                    hg.c.s(R.string.UnknownErrorCode, new Object[]{tL_error8 != null ? tL_error8.text : "FAILED_GETTING_FORM"}, vcVar, R.raw.error, 36);
                    break;
                }
            case 12:
                yh.u5 u5Var2 = (yh.u5) obj7;
                List list2 = (List) obj6;
                org.telegram.ui.Components.d80 d80Var = (org.telegram.ui.Components.d80) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                c5.h hVar = (c5.h) obj2;
                Activity activity = (Activity) obj;
                if (list2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new yh.n4(d80Var, i17));
                    break;
                } else {
                    c5.o oVar = (c5.o) list2.get(0);
                    c5.k a2 = oVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new yh.n4(d80Var, i16));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(u5Var2.a).sendRequest(tL_payments_canPurchaseStore2, new lh1(oVar, hVar, d80Var, activity, tL_inputStorePaymentStarsGift, list2, 4));
                        break;
                    }
                }
            default:
                yh.p8 p8Var = (yh.p8) obj7;
                ai.h1[] h1VarArr = (ai.h1[]) obj6;
                int[] iArr2 = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                zg.q0 q0Var2 = (zg.q0) obj2;
                zg.n0 n0Var = (zg.n0) obj;
                if (p8Var.d) {
                    ai.h1 h1Var = h1VarArr[0];
                    if (h1Var == null) {
                        h1Var = p8Var.N.d(p8Var.O);
                        h1VarArr[0] = h1Var;
                    }
                    if (h1Var != null) {
                        h1Var.setDrawStar(false);
                        h1Var.getLocationInWindow(iArr2);
                        TextView textView = h1Var.E;
                        org.telegram.ui.Components.oq[] oqVarArr = h1Var.G;
                        if (oqVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + oqVarArr[0].translateX;
                            float y3 = textView.getY() + textView.getPaddingTop() + oqVarArr[0].translateY;
                            rectF.set(x10, y3, r2.drawable.getBounds().width() + x10, oqVarArr[0].drawable.getBounds().height() + y3);
                        }
                        rectF.offset(iArr2[0], iArr2[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr2);
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr2[0] + q0Var2.c + n0Var.x, ((n0Var.B - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr2[1] + q0Var2.d + n0Var.y, AndroidUtilities.dp(26.0f) + iArr2[0] + q0Var2.c + n0Var.x, ((AndroidUtilities.dp(22.0f) + n0Var.B) / 2.0f) + iArr2[1] + q0Var2.d + n0Var.y);
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

    public /* synthetic */ ye(nn nnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = nnVar;
        this.d = b2Var;
        this.f = tLObject;
        this.c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.n = tL_error;
    }

    public /* synthetic */ ye(bo boVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, mg mgVar, String str, nf.e eVar) {
        this.a = 1;
        this.b = boVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
        this.h = mgVar;
        this.c = str;
        this.n = eVar;
    }
}
