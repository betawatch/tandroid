package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
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
public final /* synthetic */ class we0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ we0(jf0 jf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i9) {
        this.a = i9;
        this.b = jf0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final jf0 jf0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (i9) {
                            case 0:
                                final jf0 jf0Var2 = jf0Var;
                                int i14 = jf0Var2.b0;
                                fg0 fg0Var = jf0Var2.o0;
                                jf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    jf0Var2.a0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        jf0Var2.W = false;
                                        fg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = jf0Var2.c0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = jf0Var2.c0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = jf0Var2.c0) == 2 || i10 == 17 || i10 == 16)))) {
                                            jf0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(27));
                                        }
                                        jf0Var2.V = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                jf0Var2.y();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                jf0Var2.c(true);
                                                fg0Var.u1(0, true, null, true);
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                sr srVar = jf0Var2.f;
                                                vr[] vrVarArr = srVar.f;
                                                if (i15 >= vrVarArr.length) {
                                                    srVar.e = false;
                                                    vrVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    vrVarArr[i15].setText("");
                                                    i15++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new we0(jf0Var2, tL_auth_signIn2, 1), 10);
                                        jf0Var2.w();
                                        jf0Var2.v();
                                    }
                                } else {
                                    jf0Var2.W = false;
                                    fg0Var.v1(false, true);
                                    jf0Var2.w();
                                    jf0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.l0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", jf0Var2.d);
                                        bundle.putString("phoneHash", jf0Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        final int i16 = 0;
                                        jf0Var2.q(new Runnable() { // from class: org.telegram.ui.df0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        jf0Var2.o0.u1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        jf0Var2.o0.u1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        jf0Var2.q(new cf0(1, jf0Var2, tLObject2));
                                    }
                                }
                                if (i14 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                final jf0 jf0Var3 = jf0Var;
                                jf0Var3.W = false;
                                fg0 fg0Var2 = jf0Var3.o0;
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
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", jf0Var3.d);
                                        bundle2.putString("phoneHash", jf0Var3.c);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        final int i17 = 1;
                                        jf0Var3.q(new Runnable() { // from class: org.telegram.ui.df0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        jf0Var3.o0.u1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        jf0Var3.o0.u1(6, true, bundle2, false);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final jf0 jf0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11;
                        int i12;
                        int i13;
                        switch (i10) {
                            case 0:
                                final jf0 jf0Var22 = jf0Var2;
                                int i14 = jf0Var22.b0;
                                fg0 fg0Var = jf0Var22.o0;
                                jf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    jf0Var22.a0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        jf0Var22.W = false;
                                        fg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = jf0Var22.c0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = jf0Var22.c0) == 4 || i11 == 3)) || (i14 == 4 && ((i102 = jf0Var22.c0) == 2 || i102 == 17 || i102 == 16)))) {
                                            jf0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(27));
                                        }
                                        jf0Var22.V = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                jf0Var22.y();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                jf0Var22.c(true);
                                                fg0Var.u1(0, true, null, true);
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                sr srVar = jf0Var22.f;
                                                vr[] vrVarArr = srVar.f;
                                                if (i15 >= vrVarArr.length) {
                                                    srVar.e = false;
                                                    vrVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    vrVarArr[i15].setText("");
                                                    i15++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new we0(jf0Var22, tL_auth_signIn22, 1), 10);
                                        jf0Var22.w();
                                        jf0Var22.v();
                                    }
                                } else {
                                    jf0Var22.W = false;
                                    fg0Var.v1(false, true);
                                    jf0Var22.w();
                                    jf0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.l0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", jf0Var22.d);
                                        bundle.putString("phoneHash", jf0Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        final int i16 = 0;
                                        jf0Var22.q(new Runnable() { // from class: org.telegram.ui.df0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        jf0Var22.o0.u1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        jf0Var22.o0.u1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        jf0Var22.q(new cf0(1, jf0Var22, tLObject2));
                                    }
                                }
                                if (i14 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                final jf0 jf0Var3 = jf0Var2;
                                jf0Var3.W = false;
                                fg0 fg0Var2 = jf0Var3.o0;
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
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", jf0Var3.d);
                                        bundle2.putString("phoneHash", jf0Var3.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        final int i17 = 1;
                                        jf0Var3.q(new Runnable() { // from class: org.telegram.ui.df0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        jf0Var3.o0.u1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        jf0Var3.o0.u1(6, true, bundle2, false);
                                                        break;
                                                }
                                            }
                                        });
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
