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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ ze0(lf0 lf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.a = i10;
        this.b = lf0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final lf0 lf0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        int i13;
                        int i14;
                        switch (i10) {
                            case 0:
                                final lf0 lf0Var2 = lf0Var;
                                int i15 = lf0Var2.h0;
                                ig0 ig0Var = lf0Var2.u0;
                                lf0Var2.y(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    lf0Var2.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        lf0Var2.f0 = false;
                                        ig0Var.A1(false, true);
                                        if ((i15 == 3 && ((i13 = lf0Var2.i0) == 4 || i13 == 2 || i13 == 17 || i13 == 16)) || ((i15 == 2 && ((i12 = lf0Var2.i0) == 4 || i12 == 3)) || (i15 == 4 && ((i11 = lf0Var2.i0) == 2 || i11 == 17 || i11 == 16)))) {
                                            lf0Var2.s();
                                        }
                                        if (i15 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new w90(2));
                                        }
                                        lf0Var2.e0 = true;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                lf0Var2.x();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                lf0Var2.c(true);
                                                ig0Var.z1(0, true, null, true);
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                xr xrVar = lf0Var2.f;
                                                zr[] zrVarArr = xrVar.f;
                                                if (i16 >= zrVarArr.length) {
                                                    xrVar.e = false;
                                                    zrVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    zrVarArr[i16].setText("");
                                                    i16++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i14 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        ConnectionsManager.getInstance(i14).sendRequest(getpassword, new ze0(lf0Var2, tL_auth_signIn2, 1), 10);
                                        lf0Var2.v();
                                        lf0Var2.t();
                                    }
                                } else {
                                    lf0Var2.f0 = false;
                                    ig0Var.A1(false, true);
                                    lf0Var2.v();
                                    lf0Var2.t();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", lf0Var2.d);
                                        bundle.putString("phoneHash", lf0Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        final int i17 = 0;
                                        lf0Var2.p(new Runnable() { // from class: org.telegram.ui.ff0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        lf0Var2.u0.z1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        lf0Var2.u0.z1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        lf0Var2.p(new kb0(12, lf0Var2, tLObject2));
                                    }
                                }
                                if (i15 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                final lf0 lf0Var3 = lf0Var;
                                lf0Var3.f0 = false;
                                ig0 ig0Var2 = lf0Var3.u0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", lf0Var3.d);
                                        bundle2.putString("phoneHash", lf0Var3.c);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        final int i18 = 1;
                                        lf0Var3.p(new Runnable() { // from class: org.telegram.ui.ff0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        lf0Var3.u0.z1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        lf0Var3.u0.z1(6, true, bundle2, false);
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
                final int i11 = 1;
                final lf0 lf0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        int i13;
                        int i14;
                        switch (i11) {
                            case 0:
                                final lf0 lf0Var22 = lf0Var2;
                                int i15 = lf0Var22.h0;
                                ig0 ig0Var = lf0Var22.u0;
                                lf0Var22.y(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    lf0Var22.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        lf0Var22.f0 = false;
                                        ig0Var.A1(false, true);
                                        if ((i15 == 3 && ((i13 = lf0Var22.i0) == 4 || i13 == 2 || i13 == 17 || i13 == 16)) || ((i15 == 2 && ((i12 = lf0Var22.i0) == 4 || i12 == 3)) || (i15 == 4 && ((i112 = lf0Var22.i0) == 2 || i112 == 17 || i112 == 16)))) {
                                            lf0Var22.s();
                                        }
                                        if (i15 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new w90(2));
                                        }
                                        lf0Var22.e0 = true;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                lf0Var22.x();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                lf0Var22.c(true);
                                                ig0Var.z1(0, true, null, true);
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                xr xrVar = lf0Var22.f;
                                                zr[] zrVarArr = xrVar.f;
                                                if (i16 >= zrVarArr.length) {
                                                    xrVar.e = false;
                                                    zrVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    zrVarArr[i16].setText("");
                                                    i16++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i14 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        ConnectionsManager.getInstance(i14).sendRequest(getpassword, new ze0(lf0Var22, tL_auth_signIn22, 1), 10);
                                        lf0Var22.v();
                                        lf0Var22.t();
                                    }
                                } else {
                                    lf0Var22.f0 = false;
                                    ig0Var.A1(false, true);
                                    lf0Var22.v();
                                    lf0Var22.t();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", lf0Var22.d);
                                        bundle.putString("phoneHash", lf0Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        final int i17 = 0;
                                        lf0Var22.p(new Runnable() { // from class: org.telegram.ui.ff0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        lf0Var22.u0.z1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        lf0Var22.u0.z1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        lf0Var22.p(new kb0(12, lf0Var22, tLObject2));
                                    }
                                }
                                if (i15 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                final lf0 lf0Var3 = lf0Var2;
                                lf0Var3.f0 = false;
                                ig0 ig0Var2 = lf0Var3.u0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", lf0Var3.d);
                                        bundle2.putString("phoneHash", lf0Var3.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        final int i18 = 1;
                                        lf0Var3.p(new Runnable() { // from class: org.telegram.ui.ff0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        lf0Var3.u0.z1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        lf0Var3.u0.z1(6, true, bundle2, false);
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
