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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ be0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ td0(be0 be0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = be0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final be0 be0Var = this.b;
                yd0 yd0Var = be0Var.a;
                rg0 rg0Var = be0Var.W;
                rg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    be0Var.E = false;
                    rg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", be0Var.I);
                    bundle.putString("ephone", be0Var.J);
                    bundle.putString("phoneFormated", be0Var.L);
                    bundle.putString("phoneHash", be0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            rg0Var.p0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        be0Var.o(new Runnable() { // from class: org.telegram.ui.wd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        be0Var.W.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        be0Var.W.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        be0Var.o(new tq(be0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new rd0(be0Var, str, 1), 10);
                } else {
                    be0Var.E = false;
                    rg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        ud0 ud0Var = be0Var.S;
                        ae0 ae0Var = be0Var.Q;
                        try {
                            yd0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            bs[] bsVarArr = yd0Var.f;
                            if (i12 < bsVarArr.length) {
                                bsVarArr[i12].setText("");
                                yd0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (ae0Var.getCurrentView() == be0Var.e) {
                                    ae0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(be0Var.h, false, 1.0f, true);
                                }
                                yd0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(yd0Var, 10.0f, new ud0(be0Var, 3));
                                be0Var.removeCallbacks(ud0Var);
                                be0Var.postDelayed(ud0Var, 5000L);
                                be0Var.R = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        rg0Var.u1(0, true, null, true);
                        rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (yd0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            bs[] bsVarArr2 = yd0Var.f;
                            if (i13 < bsVarArr2.length) {
                                bsVarArr2[i13].setText("");
                                i13++;
                            } else {
                                bsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    yd0Var.e = false;
                }
                be0Var.F = null;
                break;
            default:
                final be0 be0Var2 = this.b;
                be0Var2.E = false;
                rg0 rg0Var2 = be0Var2.W;
                rg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.e5.x0(rg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", be0Var2.L);
                        bundle2.putString("phoneHash", be0Var2.M);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        be0Var2.o(new Runnable() { // from class: org.telegram.ui.wd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        be0Var2.W.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        be0Var2.W.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ td0(be0 be0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = be0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
