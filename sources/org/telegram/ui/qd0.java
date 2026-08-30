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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yd0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ qd0(yd0 yd0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = yd0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final yd0 yd0Var = this.b;
                vd0 vd0Var = yd0Var.a;
                ng0 ng0Var = yd0Var.T;
                ng0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    yd0Var.B = false;
                    ng0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", yd0Var.F);
                    bundle.putString("ephone", yd0Var.G);
                    bundle.putString("phoneFormated", yd0Var.I);
                    bundle.putString("phoneHash", yd0Var.J);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ng0Var.m0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        yd0Var.o(new Runnable() { // from class: org.telegram.ui.td0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        yd0Var.T.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        yd0Var.T.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        yd0Var.o(new rq(yd0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new od0(yd0Var, str, 1), 10);
                } else {
                    yd0Var.B = false;
                    ng0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        rd0 rd0Var = yd0Var.P;
                        xd0 xd0Var = yd0Var.N;
                        try {
                            vd0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            bs[] bsVarArr = vd0Var.f;
                            if (i12 < bsVarArr.length) {
                                bsVarArr[i12].setText("");
                                vd0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (xd0Var.getCurrentView() == yd0Var.e) {
                                    xd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(yd0Var.h, false, 1.0f, true);
                                }
                                vd0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(vd0Var, 10.0f, new rd0(yd0Var, 3));
                                yd0Var.removeCallbacks(rd0Var);
                                yd0Var.postDelayed(rd0Var, 5000L);
                                yd0Var.O = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        ng0Var.u1(0, true, null, true);
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (vd0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            bs[] bsVarArr2 = vd0Var.f;
                            if (i13 < bsVarArr2.length) {
                                bsVarArr2[i13].setText("");
                                i13++;
                            } else {
                                bsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    vd0Var.e = false;
                }
                yd0Var.C = null;
                break;
            default:
                final yd0 yd0Var2 = this.b;
                yd0Var2.B = false;
                ng0 ng0Var2 = yd0Var2.T;
                ng0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.z4.x0(ng0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", yd0Var2.I);
                        bundle2.putString("phoneHash", yd0Var2.J);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        yd0Var2.o(new Runnable() { // from class: org.telegram.ui.td0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        yd0Var2.T.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        yd0Var2.T.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ qd0(yd0 yd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = yd0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
