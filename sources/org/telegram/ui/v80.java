package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v80 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v80(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        String str3;
        sf.b e02;
        long[] jArr;
        int i10 = this.a;
        int i11 = 20;
        int i12 = 7;
        int i13 = 4;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new lq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, 17));
                break;
            case 1:
                Pattern pattern2 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 9));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new lq((ob0) obj2, tLObject, (String) obj, 19));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new lq((lb0) obj2, tLObject, (TLRPC.User) obj, i11));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((lb0) obj2, tLObject, (HashSet) obj, tL_error, 11));
                break;
            case 5:
                ig0 ig0Var = (ig0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new lq(ig0Var, bundle, tLObject, 24));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new vc0(ig0Var, 2));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((me0) obj2, tLObject, (String) obj, tL_error, 14));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new lq((mf0) obj2, tL_error, (TL_account.confirmPhone) obj, 29));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new bf0((KeyEvent.Callback) obj2, tLObject, obj, i13));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((hg0) obj2, tL_error, tLObject, (String) obj, 18));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new bf0((KeyEvent.Callback) obj2, tLObject, obj, i12));
                break;
            case 11:
                am0 am0Var = (am0) obj2;
                am0Var.getClass();
                am0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new bf0(obj2, (Object) tL_error, obj, 13));
                break;
            case 13:
                do0 do0Var = (do0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new en0(do0Var, tL_error, tLObject2, i15));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ff0(i11, do0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 14:
                do0 do0Var2 = (do0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    w10 w10Var = do0Var2.a1;
                    if (w10Var == null || !((Boolean) w10Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new bf0(do0Var2, tL_error, tL_payments_sendPaymentForm, 15));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new ym0(do0Var2, tLObject, i15));
                        break;
                    }
                } else {
                    Utilities.Callback callback = do0Var2.Y0;
                    if (callback == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.Update update = updates.updates.get(i16);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i16++;
                                }
                            }
                        }
                        do0Var2.getMessagesController().processUpdates(updates, false);
                        AndroidUtilities.runOnUIThread(new ff0(21, do0Var2, messageArr));
                        break;
                    } else {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((do0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 22));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((qv0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 27));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 28));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new zs0(9, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.p8) obj));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ex0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 1));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ex0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 2));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ex0((ProfileActivity) obj2, tL_error, tLObject, (String) obj, 4));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new ex0((oz0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 6));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new bf0(obj2, (Object) tL_error, obj, 27));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new bf0((g71) obj2, tL_error, (TLRPC.TL_authorization) obj, 28));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new ex0((i71) obj2, tLObject, tL_error, (k9) obj, 9));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new ex0((x71) obj2, tL_error, tLObject, (String) obj, 10));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new m21(i12, (x71) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 28:
                c91 c91Var = (c91) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                int i17 = c91Var.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            e02 = q91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i17, c91Var.m);
                        } catch (JSONException e9) {
                            e = e9;
                            str3 = null;
                        }
                        try {
                            str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                            if (i17 == 4 && (jArr = e02.a) != null && jArr.length > 0) {
                                long j10 = jArr[jArr.length - 1];
                                c91Var.e = new sf.e(e02, j10);
                                c91Var.c = j10;
                            }
                            str3 = str4;
                            str4 = e02;
                        } catch (JSONException e10) {
                            e = e10;
                            str3 = str4;
                            str4 = e02;
                            e.printStackTrace();
                            if (tLObject instanceof TL_stats.TL_statsGraphError) {
                            }
                            str = str4;
                            str2 = str3;
                            AndroidUtilities.runOnUIThread(new ex0(c91Var, str, str2, callback0Return, 12));
                            return;
                        }
                    } else {
                        str3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        c91Var.l = false;
                        c91Var.a = true;
                        c91Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str4;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                AndroidUtilities.runOnUIThread(new ex0(c91Var, str, str2, callback0Return, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new pc1((tc1) obj2, (String) obj, tL_error, i14));
                break;
        }
    }
}
