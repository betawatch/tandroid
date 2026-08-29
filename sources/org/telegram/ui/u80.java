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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u80 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u80(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        String str3;
        long[] jArr;
        int i10 = this.a;
        int i11 = 4;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new n20((org.telegram.ui.ActionBar.c2) obj2, tLObject, (i) obj, tL_error, 7));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new lq((mb0) obj2, tLObject, (String) obj, 19));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new lq((jb0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new n20((jb0) obj2, tLObject, (HashSet) obj, tL_error, 9));
                break;
            case 4:
                fg0 fg0Var = (fg0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new lq(fg0Var, bundle, tLObject, 24));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new tc0(fg0Var, 2));
                    break;
                }
            case 5:
                AndroidUtilities.runOnUIThread(new n20((ie0) obj2, tLObject, (String) obj, tL_error, 12));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new lq((if0) obj2, tL_error, (TL_account.confirmPhone) obj, 29));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new xe0((KeyEvent.Callback) obj2, tLObject, obj, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new n20((eg0) obj2, tL_error, tLObject, (String) obj, 16));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new xe0((KeyEvent.Callback) obj2, tLObject, obj, 7));
                break;
            case 10:
                xl0 xl0Var = (xl0) obj2;
                xl0Var.getClass();
                xl0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new xe0(obj2, (Object) tL_error, obj, 13));
                break;
            case 12:
                bo0 bo0Var = (bo0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new cn0(bo0Var, tL_error, tLObject2, i13));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new lf0(17, bo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 13:
                bo0 bo0Var2 = (bo0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    v10 v10Var = bo0Var2.a1;
                    if (v10Var == null || !((Boolean) v10Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new xe0(bo0Var2, tL_error, tL_payments_sendPaymentForm, 15));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new wm0(bo0Var2, tLObject, i13));
                        break;
                    }
                } else {
                    Utilities.Callback callback = bo0Var2.Y0;
                    if (callback == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                TLRPC.Update update = updates.updates.get(i14);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i14++;
                                }
                            }
                        }
                        bo0Var2.getMessagesController().processUpdates(updates, false);
                        AndroidUtilities.runOnUIThread(new lf0(18, bo0Var2, messageArr));
                        break;
                    } else {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new n20((bo0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 20));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new n20((pv0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 25));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new n20((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 26));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new av0(6, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.q8) obj));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new n20((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 29));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new lx0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 0));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new lx0((org.telegram.ui.ActionBar.o2) obj2, tL_error, tLObject, (String) obj, 2));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new lx0((oz0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 4));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new xe0(obj2, (Object) tL_error, obj, 27));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new xe0((k71) obj2, tL_error, (TLRPC.TL_authorization) obj, 28));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new lx0(obj2, (Object) tLObject, tL_error, obj, 7));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new lx0((org.telegram.ui.ActionBar.o2) obj2, tL_error, tLObject, (String) obj, 8));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new t31(i11, (b81) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 27:
                f91 f91Var = (f91) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                int i15 = f91Var.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            uf.b e02 = t91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i15, f91Var.m);
                            try {
                                str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i15 == 4 && (jArr = e02.a) != null && jArr.length > 0) {
                                    long j10 = jArr[jArr.length - 1];
                                    f91Var.e = new uf.e(e02, j10);
                                    f91Var.c = j10;
                                }
                                str4 = e02;
                                str3 = str4;
                            } catch (JSONException e10) {
                                e = e10;
                                String str5 = str4;
                                str4 = e02;
                                str3 = str5;
                                e.printStackTrace();
                                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                                }
                                str2 = str3;
                                str = str4;
                                AndroidUtilities.runOnUIThread(new lx0(f91Var, str, str2, callback0Return, 10));
                                return;
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            str3 = null;
                        }
                    } else {
                        str3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        f91Var.l = false;
                        f91Var.a = true;
                        f91Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str2 = str3;
                    str = str4;
                } else {
                    str = null;
                    str2 = null;
                }
                AndroidUtilities.runOnUIThread(new lx0(f91Var, str, str2, callback0Return, 10));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new sc1((vc1) obj2, (String) obj, tL_error, i12));
                break;
            default:
                vc1 vc1Var = (vc1) obj2;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) obj;
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    AndroidUtilities.runOnUIThread(new sc1(vc1Var, tL_error, updatetheme));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new t31(12, vc1Var, (TLRPC.TL_theme) tLObject));
                    break;
                }
        }
    }
}
