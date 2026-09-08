package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ qe0(xe0 xe0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.a = i10;
        this.b = xe0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final xe0 xe0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.se0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        switch (i10) {
                            case 0:
                                xe0 xe0Var2 = xe0Var;
                                int i12 = xe0Var2.a;
                                di.h2 h2Var = xe0Var2.c;
                                wg0 wg0Var = xe0Var2.a0;
                                wg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        xe0Var2.R = false;
                                        if (i12 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                xe0Var2.s(false);
                                                h2Var.post(new ue0(xe0Var2, 0));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                xe0Var2.c(true);
                                                wg0Var.u1(0, true, null, true);
                                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            h2Var.setText("");
                                            h2Var.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i11).sendRequest(getpassword, new qe0(xe0Var2, tL_auth_signIn2, 1), 10);
                                        xe0Var2.r();
                                    }
                                } else {
                                    xe0Var2.R = false;
                                    wg0Var.v1(false, true);
                                    xe0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            wg0Var.p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", xe0Var2.G);
                                        bundle.putString("phoneHash", xe0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        wg0Var.u1(5, true, bundle, false);
                                    } else {
                                        wg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i12 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                xe0 xe0Var3 = xe0Var;
                                xe0Var3.R = false;
                                wg0 wg0Var2 = xe0Var3.a0;
                                wg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(wg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", xe0Var3.G);
                                        bundle2.putString("phoneHash", xe0Var3.H);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        wg0Var2.u1(6, true, bundle2, false);
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final xe0 xe0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.se0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        switch (i11) {
                            case 0:
                                xe0 xe0Var22 = xe0Var2;
                                int i12 = xe0Var22.a;
                                di.h2 h2Var = xe0Var22.c;
                                wg0 wg0Var = xe0Var22.a0;
                                wg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        xe0Var22.R = false;
                                        if (i12 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                xe0Var22.s(false);
                                                h2Var.post(new ue0(xe0Var22, 0));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                xe0Var22.c(true);
                                                wg0Var.u1(0, true, null, true);
                                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            h2Var.setText("");
                                            h2Var.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i112 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i112).sendRequest(getpassword, new qe0(xe0Var22, tL_auth_signIn22, 1), 10);
                                        xe0Var22.r();
                                    }
                                } else {
                                    xe0Var22.R = false;
                                    wg0Var.v1(false, true);
                                    xe0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            wg0Var.p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", xe0Var22.G);
                                        bundle.putString("phoneHash", xe0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        wg0Var.u1(5, true, bundle, false);
                                    } else {
                                        wg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i12 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                xe0 xe0Var3 = xe0Var2;
                                xe0Var3.R = false;
                                wg0 wg0Var2 = xe0Var3.a0;
                                wg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(wg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", xe0Var3.G);
                                        bundle2.putString("phoneHash", xe0Var3.H);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        wg0Var2.u1(6, true, bundle2, false);
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
        }
    }
}
