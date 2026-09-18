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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ he0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ zd0(he0 he0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = he0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final he0 he0Var = this.b;
                ee0 ee0Var = he0Var.a;
                xg0 xg0Var = he0Var.W;
                xg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    he0Var.E = false;
                    xg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", he0Var.I);
                    bundle.putString("ephone", he0Var.J);
                    bundle.putString("phoneFormated", he0Var.L);
                    bundle.putString("phoneHash", he0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            xg0Var.p0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        he0Var.o(new Runnable() { // from class: org.telegram.ui.ce0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        he0Var.W.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        he0Var.W.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        he0Var.o(new vq(he0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) xg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new xd0(he0Var, str, 1), 10);
                } else {
                    he0Var.E = false;
                    xg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        ae0 ae0Var = he0Var.S;
                        ge0 ge0Var = he0Var.Q;
                        try {
                            ee0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            gs[] gsVarArr = ee0Var.f;
                            if (i12 < gsVarArr.length) {
                                gsVarArr[i12].setText("");
                                ee0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (ge0Var.getCurrentView() == he0Var.e) {
                                    ge0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(he0Var.h, false, 1.0f, true);
                                }
                                ee0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(ee0Var, 10.0f, new ae0(he0Var, 3));
                                he0Var.removeCallbacks(ae0Var);
                                he0Var.postDelayed(ae0Var, 5000L);
                                he0Var.R = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        xg0Var.u1(0, true, null, true);
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (ee0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            gs[] gsVarArr2 = ee0Var.f;
                            if (i13 < gsVarArr2.length) {
                                gsVarArr2[i13].setText("");
                                i13++;
                            } else {
                                gsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    ee0Var.e = false;
                }
                he0Var.F = null;
                break;
            default:
                final he0 he0Var2 = this.b;
                he0Var2.E = false;
                xg0 xg0Var2 = he0Var2.W;
                xg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.e5.x0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", he0Var2.L);
                        bundle2.putString("phoneHash", he0Var2.M);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        he0Var2.o(new Runnable() { // from class: org.telegram.ui.ce0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        he0Var2.W.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        he0Var2.W.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ zd0(he0 he0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = he0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
