package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zd0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ rd0(zd0 zd0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = zd0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final zd0 zd0Var = this.b;
                wd0 wd0Var = zd0Var.a;
                og0 og0Var = zd0Var.T;
                og0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    zd0Var.B = false;
                    og0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", zd0Var.F);
                    bundle.putString("ephone", zd0Var.G);
                    bundle.putString("phoneFormated", zd0Var.I);
                    bundle.putString("phoneHash", zd0Var.J);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            og0Var.m0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        zd0Var.o(new Runnable() { // from class: org.telegram.ui.ud0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        zd0Var.T.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        zd0Var.T.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        zd0Var.o(new sq(zd0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new pd0(zd0Var, str, 1), 10);
                } else {
                    zd0Var.B = false;
                    og0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        sd0 sd0Var = zd0Var.P;
                        yd0 yd0Var = zd0Var.N;
                        try {
                            wd0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            cs[] csVarArr = wd0Var.f;
                            if (i12 < csVarArr.length) {
                                csVarArr[i12].setText("");
                                wd0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (yd0Var.getCurrentView() == zd0Var.e) {
                                    yd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(zd0Var.h, false, 1.0f, true);
                                }
                                wd0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(wd0Var, 10.0f, new sd0(zd0Var, 3));
                                zd0Var.removeCallbacks(sd0Var);
                                zd0Var.postDelayed(sd0Var, 5000L);
                                zd0Var.O = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        og0Var.u1(0, true, null, true);
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (wd0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            cs[] csVarArr2 = wd0Var.f;
                            if (i13 < csVarArr2.length) {
                                csVarArr2[i13].setText("");
                                i13++;
                            } else {
                                csVarArr2[0].requestFocus();
                            }
                        }
                    }
                    wd0Var.e = false;
                }
                zd0Var.C = null;
                break;
            default:
                final zd0 zd0Var2 = this.b;
                zd0Var2.B = false;
                og0 og0Var2 = zd0Var2.T;
                og0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.z4.x0(og0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", zd0Var2.I);
                        bundle2.putString("phoneHash", zd0Var2.J);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        zd0Var2.o(new Runnable() { // from class: org.telegram.ui.ud0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        zd0Var2.T.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        zd0Var2.T.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ rd0(zd0 zd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = zd0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
