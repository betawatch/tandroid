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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ae0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ sd0(ae0 ae0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = ae0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final ae0 ae0Var = this.b;
                xd0 xd0Var = ae0Var.a;
                pg0 pg0Var = ae0Var.T;
                pg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    ae0Var.B = false;
                    pg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ae0Var.F);
                    bundle.putString("ephone", ae0Var.G);
                    bundle.putString("phoneFormated", ae0Var.I);
                    bundle.putString("phoneHash", ae0Var.J);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            pg0Var.m0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        ae0Var.o(new Runnable() { // from class: org.telegram.ui.vd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        ae0Var.T.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        ae0Var.T.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        ae0Var.o(new tq(ae0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qd0(ae0Var, str, 1), 10);
                } else {
                    ae0Var.B = false;
                    pg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        td0 td0Var = ae0Var.P;
                        zd0 zd0Var = ae0Var.N;
                        try {
                            xd0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            ds[] dsVarArr = xd0Var.f;
                            if (i12 < dsVarArr.length) {
                                dsVarArr[i12].setText("");
                                xd0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (zd0Var.getCurrentView() == ae0Var.e) {
                                    zd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(ae0Var.h, false, 1.0f, true);
                                }
                                xd0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(xd0Var, 10.0f, new td0(ae0Var, 3));
                                ae0Var.removeCallbacks(td0Var);
                                ae0Var.postDelayed(td0Var, 5000L);
                                ae0Var.O = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        pg0Var.u1(0, true, null, true);
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (xd0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            ds[] dsVarArr2 = xd0Var.f;
                            if (i13 < dsVarArr2.length) {
                                dsVarArr2[i13].setText("");
                                i13++;
                            } else {
                                dsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    xd0Var.e = false;
                }
                ae0Var.C = null;
                break;
            default:
                final ae0 ae0Var2 = this.b;
                ae0Var2.B = false;
                pg0 pg0Var2 = ae0Var2.T;
                pg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.z4.x0(pg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", ae0Var2.I);
                        bundle2.putString("phoneHash", ae0Var2.J);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        ae0Var2.o(new Runnable() { // from class: org.telegram.ui.vd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        ae0Var2.T.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        ae0Var2.T.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ sd0(ae0 ae0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = ae0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
