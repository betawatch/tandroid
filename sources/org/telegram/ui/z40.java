package org.telegram.ui;

import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z40 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z40(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 16;
        int i12 = 5;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(obj2, tL_error, tLObject, obj, 14));
                break;
            case 1:
                y60 y60Var = (y60) obj2;
                if (Objects.equals(y60Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new nt(26, y60Var, tLObject));
                    break;
                }
                break;
            case 2:
                l70 l70Var = (l70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new lq(l70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 3:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new lq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 18));
                break;
            case 4:
                Pattern pattern2 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(obj2, tLObject, obj, tL_error, 18));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new lq((kb0) obj2, tLObject, (String) obj, 20));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new lq((hb0) obj2, tLObject, (TLRPC.User) obj, 21));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(obj2, tLObject, obj, tL_error, 20));
                break;
            case 8:
                fg0 fg0Var = (fg0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new lq(fg0Var, bundle, tLObject, 25));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new qc0(fg0Var, 2));
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(obj2, tLObject, obj, tL_error, 23));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new xe0((jf0) obj2, tL_error, (TL_account.confirmPhone) obj, i13));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new xe0((eg0) obj2, tLObject, (HashMap) obj, i12));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(obj2, tL_error, tLObject, obj, 27));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new xe0((oj0) obj2, tLObject, (org.telegram.ui.Components.qy) obj, 8));
                break;
            case 14:
                am0 am0Var = (am0) obj2;
                am0Var.getClass();
                am0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new xe0((tm0) obj2, tL_error, (TL_account.verifyPhone) obj, 14));
                break;
            case 16:
                go0 go0Var = (go0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new en0(go0Var, tL_error, tLObject2, i14));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new zg0(i11, go0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 17:
                go0 go0Var2 = (go0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    v10 v10Var = go0Var2.e1;
                    if (v10Var == null || !((Boolean) v10Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new xe0(go0Var2, tL_error, tL_payments_sendPaymentForm, i11));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new ym0(go0Var2, tLObject, i14));
                        break;
                    }
                } else {
                    Utilities.Callback callback = go0Var2.c1;
                    if (callback == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.Update update = updates.updates.get(i15);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i15++;
                                }
                            }
                        }
                        go0Var2.getMessagesController().lambda$processUpdates$377(updates, false);
                        AndroidUtilities.runOnUIThread(new zg0(17, go0Var2, messageArr));
                        break;
                    } else {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new hn0((go0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 1));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new hn0((zv0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 6));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new hn0((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 7));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new lv0(i12, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.v8) obj));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new hn0((ProfileActivity) obj2, tL_error, tLObject, (String) obj, 13));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new hn0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 10));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new hn0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 11));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new hn0((wz0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 15));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new xe0((e71) obj2, tL_error, (TLRPC.TL_authorization) obj, 28));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new xe0((f71) obj2, tL_error, (TLRPC.TL_authorization) obj, 29));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new hn0((i71) obj2, tLObject, tL_error, (n9) obj, 18));
                break;
            default:
                AndroidUtilities.runOnUIThread(new hn0((z71) obj2, tL_error, tLObject, (String) obj, 19));
                break;
        }
    }
}
