package org.telegram.ui;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rg0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0179  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        JSONException jSONException;
        long[] jArr;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(this.b, tL_error, tLObject, this.c, 19));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new pf0((KeyEvent.Callback) this.b, tLObject, this.c, 7));
                break;
            case 2:
                qm0 qm0Var = (qm0) this.b;
                TLRPC.TL_secureValue tL_secureValue = (TLRPC.TL_secureValue) this.c;
                qm0Var.getClass();
                qm0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, tL_secureValue);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new pf0(this.b, (Object) tL_error, this.c, 13));
                break;
            case 4:
                wo0 wo0Var = (wo0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new ak0(11, wo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new vn0(wo0Var, tL_error, tLObject2, 1));
                    break;
                }
            case 5:
                wo0 wo0Var2 = (wo0) this.b;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) this.c;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        Utilities.Callback callback = wo0Var2.c1;
                        if (callback != null) {
                            callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                            break;
                        } else {
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
                            wo0Var2.getMessagesController().processUpdates(updates, false);
                            AndroidUtilities.runOnUIThread(new ak0(12, wo0Var2, messageArr));
                            break;
                        }
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new pn0(wo0Var2, tLObject, 1));
                        break;
                    }
                } else {
                    n20 n20Var = wo0Var2.e1;
                    if (n20Var == null || !((Boolean) n20Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new pf0(wo0Var2, tL_error, tL_payments_sendPaymentForm, 15));
                        break;
                    }
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01((wo0) this.b, tLObject, tL_error, (TL_account.getTmpPassword) this.c));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(this.b, tL_error, tLObject, this.c, 28));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(this.b, tL_error, tLObject, this.c, 29));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ey0(0, (PrivacySettingsActivity) this.b, (org.telegram.ui.Cells.x8) this.c));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, (Object) tL_error, this.c, 2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, this.c, (Object) tL_error, 3));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new fy0(this.b, (Object) tL_error, (Object) tLObject, this.c, 5));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, this.c, (Object) tL_error, 7));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new pf0(this.b, (Object) tL_error, this.c, 27));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new pf0((s81) this.b, tL_error, (TLRPC.TL_authorization) this.c, 28));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, (Object) tL_error, this.c, 10));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new fy0(this.b, (Object) tL_error, (Object) tLObject, this.c, 11));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ey0(28, (k91) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 19:
                ra1 ra1Var = (ra1) this.b;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) this.c;
                int i11 = ra1Var.i;
                String str3 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            ig.b e02 = fb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i11, ra1Var.m);
                            try {
                                str3 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i11 == 4 && (jArr = e02.a) != null && jArr.length > 0) {
                                    long j3 = jArr[jArr.length - 1];
                                    ra1Var.e = new ig.e(e02, j3);
                                    ra1Var.c = j3;
                                }
                                str2 = str3;
                                str3 = e02;
                            } catch (JSONException e) {
                                jSONException = e;
                                str2 = str3;
                                str3 = e02;
                                jSONException.printStackTrace();
                                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                                }
                                str = str2;
                                AndroidUtilities.runOnUIThread(new fy0(ra1Var, str3, str, callback0Return, 13));
                                return;
                            }
                        } catch (JSONException e7) {
                            jSONException = e7;
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        ra1Var.l = false;
                        ra1Var.a = true;
                        ra1Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new fy0(ra1Var, str3, str, callback0Return, 13));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ce1((fe1) this.b, (String) this.c, tL_error, 0));
                break;
            case 21:
                fe1 fe1Var = (fe1) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (tLObject instanceof TLRPC.TL_theme) {
                    AndroidUtilities.runOnUIThread(new r91(6, fe1Var, (TLRPC.TL_theme) tLObject));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ce1(fe1Var, tL_error, updatetheme));
                    break;
                }
            case 22:
                AndroidUtilities.runOnUIThread(new ce1((eg1) this.b, (String) this.c, tLObject, 5));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, this.c, (Object) tL_error, 16));
                break;
            case 24:
                mh1 mh1Var = (mh1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new gh1(mh1Var, bArr, 1));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ih1(mh1Var, tL_error, 3));
                    break;
                }
            case 25:
                AndroidUtilities.runOnUIThread(new r91(20, (hj1) this.b, (int[]) this.c));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, this.c, (Object) tL_error, 19));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sx0(tLObject, (MessagesController) this.b, (sg.z0) this.c));
                break;
            case 28:
                MessagesController messagesController = (MessagesController) this.b;
                nj0 nj0Var = (nj0) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < tL_contacts_found.users.size(); i12++) {
                        TLRPC.User user = tL_contacts_found.users.get(i12);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(20, nj0Var, arrayList));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sx0(this.b, (Object) tL_error, this.c, 23));
                break;
        }
    }
}
