package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
        this.h = obj6;
        this.n = obj7;
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
        vo0 vo0Var;
        vo0 vo0Var2;
        int i14 = this.a;
        int i15 = 8;
        int i16 = 2;
        int i17 = 7;
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
                zn znVar = (zn) obj7;
                MessageObject messageObject = (MessageObject) obj5;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                org.telegram.ui.Components.gn0 gn0Var = (org.telegram.ui.Components.gn0) obj;
                znVar.getClass();
                ((org.telegram.ui.Components.p80) obj6).n0 = true;
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    str = u1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject.messageText)) {
                    str = u1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(znVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                gn0Var.dismiss();
                break;
            case 1:
                zn znVar2 = (zn) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                TLObject tLObject = (TLObject) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                df dfVar = (df) obj2;
                String str2 = (String) obj3;
                of.e eVar = (of.e) obj;
                if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                    z10 = true;
                }
                if (tLObject != null || (tL_error == null && (tLObject2 instanceof TLRPC.TL_boolTrue))) {
                    dfVar.run(tLObject, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    eVar.b = new jf(znVar2, znVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new ci.s1(znVar2, eVar, dfVar, z10, 2)), i17);
                    eVar.d();
                    break;
                }
            case 2:
                TLObject tLObject3 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject2 = (MessageObject) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                zn znVar3 = ((ln) obj7).a;
                ((org.telegram.ui.ActionBar.b2) obj6).dismiss();
                if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    znVar3.getMessagesController().putUsers(groupcall.users, false);
                    znVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        znVar3.showDialog(new bu(znVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = znVar3.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) znVar3).currentAccount;
                        org.telegram.ui.Components.voip.f2.g(parentActivity, i10, tL_inputGroupCallInviteMessage, messageObject2.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error2 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.ad.a0(znVar3).f0(tL_error2, false);
                        break;
                    }
                } else {
                    znVar3.showDialog(new bu(znVar3.getParentActivity(), hashSet));
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
                    org.telegram.ui.Components.g5.e0(launchActivity.O, tL_error3, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 4:
                fg0 fg0Var = (fg0) obj7;
                List<Purchase> list = (List) obj5;
                String str4 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                org.telegram.ui.Components.oo0 oo0Var = (org.telegram.ui.Components.oo0) obj;
                if (((c5.h) obj6).a == 0 && list != null && !list.isEmpty()) {
                    for (Purchase purchase : list) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            fg0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new ci.hd(fg0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore, oo0Var, 8), 74);
                            break;
                        }
                    }
                }
                oo0Var.run();
                break;
            case 5:
                vg0 vg0Var = (vg0) obj7;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj6;
                TLObject tLObject5 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str5 = (String) obj3;
                la.h hVar = (la.h) obj2;
                TLObject tLObject6 = (TLObject) obj;
                wg0 wg0Var2 = vg0Var.V;
                vg0Var.K = false;
                int i19 = 5;
                if (tL_error4 != null) {
                    String str6 = tL_error4.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new ac0(i19, vg0Var, str5), 10);
                        } else if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                            wg0.m1(wg0Var2, str5, hVar, false);
                        } else if (tL_error4.text.contains("PHONE_PASSWORD_FLOOD")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.text.contains("PHONE_NUMBER_FLOOD")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error4.text.contains("PHONE_NUMBER_BANNED")) {
                            wg0.m1(wg0Var2, str5, hVar, true);
                        } else if (tL_error4.text.contains("PHONE_CODE_EMPTY") || tL_error4.text.contains("PHONE_CODE_INVALID")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            wg0Var2.u1(0, true, null, true);
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                            org.telegram.ui.Components.g5.e0(i11, tL_error4, wg0Var2, tLObject6, (String) hVar.d);
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
                qm0 qm0Var = (qm0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                bn0 bn0Var = (bn0) obj;
                nn0 nn0Var = ((pm0) obj7).p.d;
                if (tLObject7 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject7;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    nn0 nn0Var2 = new nn0(6, nn0Var.y, nn0Var.J, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.n2) nn0Var2).currentAccount = i13;
                    nn0Var2.T0 = sentemailcode.length;
                    nn0Var2.e1 = nn0Var.e1;
                    nn0Var2.c1 = nn0Var.c1;
                    nn0Var2.B1 = qm0Var;
                    nn0Var.presentFragment(nn0Var2, true);
                    break;
                } else {
                    nn0Var.L1(LocaleController.getString(R.string.PassportEmail), tL_error5.text);
                    if (bn0Var != null) {
                        bn0Var.c(tL_error5.text, str7);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj7;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj6;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                String str8 = (String) obj3;
                byte[] bArr = (byte[]) obj4;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj2;
                ft ftVar = (ft) obj;
                d2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ai.a9(d2Var, str8, bArr, ftVar, tonconnectsession, org.telegram.ui.Wallet.d2.r(h0Var, tonconnectsession, str8, bArr, tonconnectnexteventid.event_id), 14));
                    break;
                } catch (Exception e7) {
                    ftVar.run(org.telegram.ui.Wallet.d2.h("prepare disconnect", e7));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) obj7;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj6;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj2;
                byte[] bArr2 = a2Var.b;
                ft ftVar2 = (ft) obj;
                if (d2Var2.c(y1Var, tonconnectsession2, (String) obj3, (byte[]) obj4)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession2.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr2;
                    tonconnectsubmitconnectresult.body = a2Var.c;
                    tonconnectsubmitconnectresult.trace_id = y1Var.c;
                    d2Var2.f.sendRequestTyped(tonconnectsubmitconnectresult, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.i(d2Var2, a2Var, ftVar2, i15));
                    break;
                } else {
                    Arrays.fill(bArr2, (byte) 0);
                    ftVar2.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 9:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) obj7;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj6;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj5;
                String str9 = (String) obj3;
                byte[] bArr3 = (byte[]) obj4;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) obj2;
                ft ftVar3 = (ft) obj;
                d2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ii.k(d2Var3, y1Var2, tonconnectsession3, str9, bArr3, org.telegram.ui.Wallet.d2.p(h0Var2, tonconnectsession3, str9, bArr3, y1Var2.a, y1Var2.b, y1Var2.d, null, d2Var3.f.getCurrentTime()), ftVar3, h0Var2, 6));
                    break;
                } catch (Exception e10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.b1(ftVar3, org.telegram.ui.Wallet.d2.h("prepare connect", e10), i18));
                    return;
                }
            case 10:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj7;
                int[] iArr = (int[]) obj6;
                File file = (File) obj5;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                String str10 = (String) obj3;
                String str11 = (String) obj2;
                String str12 = (String) obj;
                if (iArr[4] > 0) {
                    int i20 = iArr[1];
                    int i21 = iArr[2];
                    int photoSize = i20 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i20;
                    int photoSize2 = i21 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i21;
                    File w10 = ci.l8.w(UserConfig.selectedAccount, "jpg");
                    org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p5 = f6Var.p();
                    f6Var.u();
                    if (p5 != null) {
                        try {
                        } catch (Exception e11) {
                            e = e11;
                        }
                        try {
                            p5.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w10));
                        } catch (Exception e12) {
                            e = e12;
                            FileLog.e(e);
                            w10 = null;
                            m10 = ci.l8.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr[4]);
                            m10.k0 = i20;
                            m10.l0 = i21;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            b2Var.c(500L);
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
                    if (str10 != null) {
                        m10.C0 = str10;
                    }
                    if (!TextUtils.isEmpty(str11) && UserConfig.getInstance(b1Var.M).isPremium()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        qg.n0 n0Var = new qg.n0();
                        mediaEntity.linkSettings = n0Var;
                        n0Var.c = str11;
                        if (str12 != null) {
                            n0Var.a |= 2;
                            n0Var.b = str12;
                        }
                        m10.T0.add(mediaEntity);
                    }
                    ci.lc.D(b1Var.W, UserConfig.selectedAccount).T(null, m10);
                    b2Var.c(500L);
                    break;
                } else {
                    b2Var.c(500L);
                }
                break;
            case 11:
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj7;
                tg.v vVar = (tg.v) obj6;
                TLObject tLObject8 = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                tg.v vVar2 = (tg.v) obj;
                if (tL_error6 != null) {
                    vVar.run(tL_error6);
                    break;
                } else {
                    if (tLObject8 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        vo0Var = new vo0(paymentForm, tL_inputInvoicePremiumGiftCode, n2Var);
                    } else {
                        vo0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new vo0((TLRPC.PaymentReceipt) tLObject8) : null;
                    }
                    if (vo0Var != null) {
                        vo0Var.Z0 = new qg.x1(i17, vVar2, vVar);
                        LaunchActivity.R().showAsSheet(vo0Var, new org.telegram.ui.ActionBar.l2());
                        break;
                    } else {
                        vVar.run(null);
                        break;
                    }
                }
            case 12:
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
                        vo0Var2 = new vo0(paymentForm2, tL_inputInvoicePremiumGiftCode2, n2Var2);
                    } else {
                        vo0Var2 = tLObject9 instanceof TLRPC.PaymentReceipt ? new vo0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (vo0Var2 != null) {
                        vo0Var2.Z0 = new qg.x1(i15, callback2, callback);
                        LaunchActivity.R().showAsSheet(vo0Var2, new org.telegram.ui.ActionBar.l2());
                        break;
                    } else {
                        callback.run(null);
                        break;
                    }
                }
            case 13:
                ((boolean[]) obj6)[0] = true;
                ((yh.m5) obj7).Z((String) obj3, (TLRPC.ChatInvite) obj5, new yh.z3((boolean[]) obj4, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 14:
                yh.m5 m5Var = (yh.m5) obj7;
                TLObject tLObject10 = (TLObject) obj6;
                MessageObject messageObject3 = (MessageObject) obj5;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj4;
                Utilities.Callback callback3 = (Utilities.Callback) obj3;
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                if (tLObject10 instanceof TLRPC.TL_payments_paymentFormStars) {
                    m5Var.a0(messageObject3, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject10, callback3);
                    break;
                } else {
                    callback3.run(Boolean.FALSE);
                    hg.c.q(R.string.UnknownErrorCode, new Object[]{tL_error8 != null ? tL_error8.text : "FAILED_GETTING_FORM"}, adVar, R.raw.error, 36);
                    break;
                }
            case 15:
                yh.m5 m5Var2 = (yh.m5) obj7;
                List list2 = (List) obj6;
                org.telegram.ui.Components.f90 f90Var = (org.telegram.ui.Components.f90) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                c5.h hVar2 = (c5.h) obj2;
                Activity activity = (Activity) obj;
                if (list2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new yh.g4(f90Var, i18));
                    break;
                } else {
                    c5.o oVar = (c5.o) list2.get(0);
                    c5.k a2 = oVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new yh.g4(f90Var, i16));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(m5Var2.a).sendRequest(tL_payments_canPurchaseStore2, new mh1(oVar, hVar2, f90Var, activity, tL_inputStorePaymentStarsGift, list2, 4));
                        break;
                    }
                }
            default:
                yh.h8 h8Var = (yh.h8) obj7;
                ai.h1[] h1VarArr = (ai.h1[]) obj6;
                int[] iArr2 = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                zg.o0 o0Var = (zg.o0) obj2;
                zg.l0 l0Var = (zg.l0) obj;
                if (h8Var.d) {
                    ai.h1 h1Var = h1VarArr[0];
                    if (h1Var == null) {
                        h1Var = h8Var.O.d(h8Var.P);
                        h1VarArr[0] = h1Var;
                    }
                    if (h1Var != null) {
                        h1Var.setDrawStar(false);
                        h1Var.getLocationInWindow(iArr2);
                        TextView textView = h1Var.E;
                        org.telegram.ui.Components.er[] erVarArr = h1Var.G;
                        if (erVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + erVarArr[0].translateX;
                            float y3 = textView.getY() + textView.getPaddingTop() + erVarArr[0].translateY;
                            rectF.set(x10, y3, r2.drawable.getBounds().width() + x10, erVarArr[0].drawable.getBounds().height() + y3);
                        }
                        rectF.offset(iArr2[0], iArr2[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr2);
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr2[0] + o0Var.c + l0Var.x, ((l0Var.B - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr2[1] + o0Var.d + l0Var.y, AndroidUtilities.dp(26.0f) + iArr2[0] + o0Var.c + l0Var.x, ((AndroidUtilities.dp(22.0f) + l0Var.B) / 2.0f) + iArr2[1] + o0Var.d + l0Var.y);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ze(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = str;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ ze(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = tLObject;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ ze(ln lnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = lnVar;
        this.d = b2Var;
        this.f = tLObject;
        this.c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.n = tL_error;
    }

    public /* synthetic */ ze(zn znVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, df dfVar, String str, of.e eVar) {
        this.a = 1;
        this.b = znVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
        this.h = dfVar;
        this.c = str;
        this.n = eVar;
    }
}
