package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ub0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        JSONException jSONException;
        wf.b e02;
        long[] jArr;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c30(this.b, tLObject, this.c, (Object) tL_error, 7));
                break;
            case 1:
                pg0 pg0Var = (pg0) this.b;
                Bundle bundle = (Bundle) this.c;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new tq(pg0Var, bundle, tLObject, 24));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ed0(pg0Var, 2));
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new c30(this.b, tLObject, this.c, (Object) tL_error, 10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new tq((tf0) this.b, tL_error, (TL_account.confirmPhone) this.c, 29));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new jf0((KeyEvent.Callback) this.b, tLObject, this.c, 4));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new c30(this.b, (Object) tL_error, tLObject, this.c, 14));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new jf0((KeyEvent.Callback) this.b, tLObject, this.c, 7));
                break;
            case 7:
                hm0 hm0Var = (hm0) this.b;
                TLRPC.TL_secureValue tL_secureValue = (TLRPC.TL_secureValue) this.c;
                hm0Var.getClass();
                hm0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, tL_secureValue);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new jf0(this.b, (Object) tL_error, this.c, 13));
                break;
            case 9:
                lo0 lo0Var = (lo0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new mn0(lo0Var, tL_error, tLObject2, 1));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ie0(25, lo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 10:
                lo0 lo0Var2 = (lo0) this.b;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) this.c;
                if (tLObject == null) {
                    j20 j20Var = lo0Var2.b1;
                    if (j20Var == null || !((Boolean) j20Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new jf0(lo0Var2, tL_error, tL_payments_sendPaymentForm, 15));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new gn0(lo0Var2, tLObject, 1));
                        break;
                    }
                } else {
                    Utilities.Callback callback = lo0Var2.Z0;
                    if (callback == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.Update update = updates.updates.get(i10);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        lo0Var2.getMessagesController().processUpdates(updates, false);
                        AndroidUtilities.runOnUIThread(new ie0(26, lo0Var2, messageArr));
                        break;
                    } else {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new c30(this.b, tLObject, (Object) tL_error, this.c, 18));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new c30(this.b, (Object) tL_error, tLObject, this.c, 23));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new c30(this.b, (Object) tL_error, tLObject, this.c, 24));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new gr0(14, (PrivacySettingsActivity) this.b, (org.telegram.ui.Cells.r8) this.c));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new c30(this.b, tLObject, (Object) tL_error, this.c, 27));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new c30(this.b, tLObject, this.c, (Object) tL_error, 28));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new dy0(this.b, (Object) tL_error, (Object) tLObject, this.c, 0));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new dy0(this.b, tLObject, this.c, (Object) tL_error, 2));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new jf0(this.b, (Object) tL_error, this.c, 27));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new jf0((f81) this.b, tL_error, (TLRPC.TL_authorization) this.c, 28));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new dy0((h81) this.b, tLObject, tL_error, (o9) this.c, false, 5));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new dy0(this.b, (Object) tL_error, (Object) tLObject, this.c, 6));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new b11(12, (w81) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 24:
                aa1 aa1Var = (aa1) this.b;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) this.c;
                int i11 = aa1Var.i;
                String str3 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            e02 = oa1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i11, aa1Var.m);
                        } catch (JSONException e) {
                            jSONException = e;
                            str2 = null;
                        }
                        try {
                            str3 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                            if (i11 == 4 && (jArr = e02.a) != null && jArr.length > 0) {
                                long j10 = jArr[jArr.length - 1];
                                aa1Var.e = new wf.e(e02, j10);
                                aa1Var.c = j10;
                            }
                            str2 = str3;
                            str3 = e02;
                        } catch (JSONException e6) {
                            jSONException = e6;
                            str2 = str3;
                            str3 = e02;
                            jSONException.printStackTrace();
                            if (tLObject instanceof TL_stats.TL_statsGraphError) {
                            }
                            str = str2;
                            AndroidUtilities.runOnUIThread(new dy0((Object) aa1Var, (Object) str3, str, (Object) callback0Return, 8));
                            return;
                        }
                    } else {
                        str2 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        aa1Var.l = false;
                        aa1Var.a = true;
                        aa1Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new dy0((Object) aa1Var, (Object) str3, str, (Object) callback0Return, 8));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new ld1((od1) this.b, (String) this.c, tL_error, 0));
                break;
            case 26:
                od1 od1Var = (od1) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    AndroidUtilities.runOnUIThread(new ld1(od1Var, tL_error, updatetheme));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new b11(20, od1Var, (TLRPC.TL_theme) tLObject));
                    break;
                }
            case 27:
                AndroidUtilities.runOnUIThread(new ld1((of1) this.b, (String) this.c, tLObject, 5));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new dy0(this.b, tLObject, this.c, (Object) tL_error, 11));
                break;
            default:
                wg1 wg1Var = (wg1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new rg1(wg1Var, tL_error, 3));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new pg1(wg1Var, bArr, 1));
                    break;
                }
        }
    }
}
