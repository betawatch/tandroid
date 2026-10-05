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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ee0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ wd0(ee0 ee0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = ee0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final ee0 ee0Var = this.b;
                be0 be0Var = ee0Var.a;
                ug0 ug0Var = ee0Var.W;
                ug0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    ee0Var.E = false;
                    ug0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ee0Var.I);
                    bundle.putString("ephone", ee0Var.J);
                    bundle.putString("phoneFormated", ee0Var.L);
                    bundle.putString("phoneHash", ee0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ug0Var.p0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        ee0Var.o(new Runnable() { // from class: org.telegram.ui.zd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        ee0Var.W.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        ee0Var.W.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        ee0Var.o(new uq(ee0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ud0(ee0Var, str, 1), 10);
                } else {
                    ee0Var.E = false;
                    ug0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        xd0 xd0Var = ee0Var.S;
                        de0 de0Var = ee0Var.Q;
                        try {
                            be0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            es[] esVarArr = be0Var.f;
                            if (i12 < esVarArr.length) {
                                esVarArr[i12].setText("");
                                be0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (de0Var.getCurrentView() == ee0Var.e) {
                                    de0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(ee0Var.h, false, 1.0f, true);
                                }
                                be0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(be0Var, 10.0f, new xd0(ee0Var, 3));
                                ee0Var.removeCallbacks(xd0Var);
                                ee0Var.postDelayed(xd0Var, 5000L);
                                ee0Var.R = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        ug0Var.u1(0, true, null, true);
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (be0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            es[] esVarArr2 = be0Var.f;
                            if (i13 < esVarArr2.length) {
                                esVarArr2[i13].setText("");
                                i13++;
                            } else {
                                esVarArr2[0].requestFocus();
                            }
                        }
                    }
                    be0Var.e = false;
                }
                ee0Var.F = null;
                break;
            default:
                final ee0 ee0Var2 = this.b;
                ee0Var2.E = false;
                ug0 ug0Var2 = ee0Var2.W;
                ug0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.e5.x0(ug0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", ee0Var2.L);
                        bundle2.putString("phoneHash", ee0Var2.M);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        ee0Var2.o(new Runnable() { // from class: org.telegram.ui.zd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        ee0Var2.W.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        ee0Var2.W.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ wd0(ee0 ee0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = ee0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
