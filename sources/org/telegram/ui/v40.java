package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v40 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v40(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        int i10 = 20;
        int i11 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((w40) obj2, tL_error, tLObject, (String) obj, 9));
                break;
            case 1:
                v60 v60Var = (v60) obj2;
                if (Objects.equals(v60Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new x20(3, v60Var, tLObject));
                    break;
                }
                break;
            case 2:
                i70 i70Var = (i70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new jq(i70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 3:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new jq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.e6) obj, 17));
                break;
            case 4:
                Pattern pattern2 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((org.telegram.ui.ActionBar.c2) obj2, tLObject, (h) obj, tL_error, 13));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new jq((kb0) obj2, tLObject, (String) obj, 19));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new jq((hb0) obj2, tLObject, (TLRPC.User) obj, i10));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((hb0) obj2, tLObject, (HashSet) obj, tL_error, 15));
                break;
            case 8:
                fg0 fg0Var = (fg0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new jq(fg0Var, bundle, tLObject, 24));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new rc0(fg0Var, 2));
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((je0) obj2, tLObject, (String) obj, tL_error, 18));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new jq((jf0) obj2, tL_error, (TL_account.confirmPhone) obj, 29));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ye0((KeyEvent.Callback) obj2, tLObject, obj, 4));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((eg0) obj2, tL_error, tLObject, (String) obj, 22));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ye0((KeyEvent.Callback) obj2, tLObject, obj, 7));
                break;
            case 14:
                zl0 zl0Var = (zl0) obj2;
                zl0Var.getClass();
                zl0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ye0(obj2, (Object) tL_error, obj, 13));
                break;
            case 16:
                co0 co0Var = (co0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new dn0(co0Var, tL_error, tLObject2, i11));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new cf0(i10, co0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 17:
                co0 co0Var2 = (co0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    t10 t10Var = co0Var2.a1;
                    if (t10Var == null || !((Boolean) t10Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new ye0(co0Var2, tL_error, tL_payments_sendPaymentForm, 15));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new xm0(co0Var2, tLObject, i11));
                        break;
                    }
                } else {
                    Utilities.Callback callback = co0Var2.Y0;
                    if (callback == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                TLRPC.Update update = updates.updates.get(i12);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i12++;
                                }
                            }
                        }
                        co0Var2.getMessagesController().processUpdates(updates, false);
                        AndroidUtilities.runOnUIThread(new cf0(21, co0Var2, messageArr));
                        break;
                    } else {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((co0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 26));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) obj2, (Object) tL_error, tLObject, obj, 1));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) obj2, (Object) tL_error, tLObject, obj, 2));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ys0(9, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.t8) obj));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new ir0(obj2, (Object) tLObject, (Object) tL_error, obj, 5));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new ir0(obj2, (Object) tLObject, obj, (Object) tL_error, 6));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) obj2, (Object) tL_error, tLObject, obj, 8));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new ir0((oz0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 10));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new ye0(obj2, (Object) tL_error, obj, 27));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new ye0((h71) obj2, tL_error, (TLRPC.TL_authorization) obj, 28));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new ir0((j71) obj2, tLObject, tL_error, (j9) obj, 13));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) obj2, (Object) tL_error, tLObject, obj, 14));
                break;
        }
    }
}
