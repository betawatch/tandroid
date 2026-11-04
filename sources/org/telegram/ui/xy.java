package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xy(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.a;
        int i10 = 18;
        int i11 = 2;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new pp((yy) obj2, tL_error, (wy) obj, 8));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ly(i13, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60((g30) obj2, tL_error, tLObject, (String) obj, 15));
                break;
            case 3:
                c50 c50Var = (c50) obj2;
                if (Objects.equals(c50Var.a.e, (String) obj)) {
                    org.telegram.messenger.g0.h3(new ly(9, c50Var, tLObject));
                    break;
                }
                break;
            case 4:
                o50 o50Var = (o50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.h3(new pp(o50Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 5:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new pp((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.j6) obj, i10));
                break;
            case 6:
                String str3 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60(obj2, (Object) tLObject, obj, tL_error, 19));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new pp((m90) obj2, tLObject, (String) obj, 21));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new pp((j90) obj2, tLObject, (TLRPC.User) obj, 22));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60(obj2, (Object) tLObject, obj, tL_error, 21));
                break;
            case 10:
                xd0 xd0Var = (xd0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.h3(new pp(xd0Var, bundle, tLObject, 27));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ma0(xd0Var, i11));
                    break;
                }
                break;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60(obj2, (Object) tLObject, obj, tL_error, 24));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new hc0((dd0) obj2, tL_error, (TL_account.confirmPhone) obj, false, 2));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new hc0((wd0) obj2, tLObject, (HashMap) obj, 7));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60((wd0) obj2, tL_error, tLObject, (String) obj, 28));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new hc0((vg0) obj2, tLObject, (org.telegram.ui.Components.ei) obj, 10));
                break;
            case 16:
                cj0 cj0Var = (cj0) obj2;
                cj0Var.getClass();
                cj0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 17:
                org.telegram.messenger.g0.h3(new hc0((uj0) obj2, tL_error, (TL_account.verifyPhone) obj, false, 16));
                break;
            case 18:
                dl0 dl0Var = (dl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.h3(new gk0(dl0Var, tL_error, tLObject2, i13));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new tb0(29, dl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 19:
                dl0 dl0Var2 = (dl0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    h00 h00Var = dl0Var2.f1;
                    if (h00Var == null || !((Boolean) h00Var.a(tL_error)).booleanValue()) {
                        org.telegram.messenger.g0.h3(new hc0(dl0Var2, tL_error, tL_payments_sendPaymentForm, false, 18));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.h3(new ck0(dl0Var2, tLObject, i13));
                        break;
                    }
                } else {
                    org.telegram.messenger.u10 u10Var = dl0Var2.d1;
                    if (u10Var == null) {
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
                        dl0Var2.getMessagesController().O3(updates, false);
                        org.telegram.messenger.g0.h3(new hk0(i12, dl0Var2, messageArr));
                        break;
                    } else {
                        u10Var.a((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.messenger.g0.h3(new ih0((dl0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 2));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new ih0((xr0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 7));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new ih0((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 8));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new hk0(i10, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.q8) obj));
                break;
            case 24:
                RectF rectF = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new ih0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 11));
                break;
            case 25:
                RectF rectF2 = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new ih0((ProfileActivity) obj2, tL_error, tLObject, (String) obj, 14));
                break;
            case 26:
                RectF rectF3 = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new ih0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 13));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new ih0((uv0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 16));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new wy0((j21) obj2, tL_error, (TLRPC.TL_authorization) obj, i13));
                break;
            default:
                org.telegram.messenger.g0.h3(new wy0((k21) obj2, tL_error, (TLRPC.TL_authorization) obj, i11));
                break;
        }
    }
}
