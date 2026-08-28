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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ zd0(ge0 ge0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i9) {
        this.a = i9;
        this.b = ge0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final ge0 ge0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.be0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        switch (i9) {
                            case 0:
                                ge0 ge0Var2 = ge0Var;
                                int i11 = ge0Var2.a;
                                fg.g gVar = ge0Var2.c;
                                fg0 fg0Var = ge0Var2.T;
                                fg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        ge0Var2.N = false;
                                        if (i11 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                ge0Var2.s(false);
                                                gVar.post(new de0(ge0Var2, 0));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ge0Var2.c(true);
                                                fg0Var.u1(0, true, null, true);
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            gVar.setText("");
                                            gVar.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new zd0(ge0Var2, tL_auth_signIn2, 1), 10);
                                        ge0Var2.r();
                                    }
                                } else {
                                    ge0Var2.N = false;
                                    fg0Var.v1(false, true);
                                    ge0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.l0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ge0Var2.C);
                                        bundle.putString("phoneHash", ge0Var2.D);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        fg0Var.u1(5, true, bundle, false);
                                    } else {
                                        fg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i11 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                ge0 ge0Var3 = ge0Var;
                                ge0Var3.N = false;
                                fg0 fg0Var2 = ge0Var3.T;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.h0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", ge0Var3.C);
                                        bundle2.putString("phoneHash", ge0Var3.D);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        fg0Var2.u1(6, true, bundle2, false);
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final ge0 ge0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.be0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        switch (i10) {
                            case 0:
                                ge0 ge0Var22 = ge0Var2;
                                int i11 = ge0Var22.a;
                                fg.g gVar = ge0Var22.c;
                                fg0 fg0Var = ge0Var22.T;
                                fg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        ge0Var22.N = false;
                                        if (i11 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                ge0Var22.s(false);
                                                gVar.post(new de0(ge0Var22, 0));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ge0Var22.c(true);
                                                fg0Var.u1(0, true, null, true);
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            gVar.setText("");
                                            gVar.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i102 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i102).sendRequest(getpassword, new zd0(ge0Var22, tL_auth_signIn22, 1), 10);
                                        ge0Var22.r();
                                    }
                                } else {
                                    ge0Var22.N = false;
                                    fg0Var.v1(false, true);
                                    ge0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.l0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ge0Var22.C);
                                        bundle.putString("phoneHash", ge0Var22.D);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        fg0Var.u1(5, true, bundle, false);
                                    } else {
                                        fg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i11 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                ge0 ge0Var3 = ge0Var2;
                                ge0Var3.N = false;
                                fg0 fg0Var2 = ge0Var3.T;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.h0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", ge0Var3.C);
                                        bundle2.putString("phoneHash", ge0Var3.D);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        fg0Var2.u1(6, true, bundle2, false);
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
