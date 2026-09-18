package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ze0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ ve0(ze0 ze0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = ze0Var;
        this.e = tLObject;
        this.d = bundle;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ze0 ze0Var = this.b;
                yg0 yg0Var = ze0Var.a0;
                ze0Var.M = false;
                ze0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject == null) {
                    TLRPC.TL_error tL_error = this.c;
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                            StringBuilder sb2 = new StringBuilder();
                                            org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb2);
                                            sb2.append(tL_error.text);
                                            yg0Var.l1(string, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                                        break;
                                    }
                                } else {
                                    ze0Var.c(true);
                                    yg0Var.u1(0, true, null, true);
                                    yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                                    break;
                                }
                            } else {
                                yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                                break;
                            }
                        } else {
                            yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                            break;
                        }
                    }
                } else {
                    Bundle bundle = this.d;
                    ze0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ze0Var.T = tL_auth_sentCode;
                    yg0Var.g1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                ze0 ze0Var2 = this.b;
                yg0 yg0Var2 = ze0Var2.a0;
                ze0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 == null) {
                    yg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                            ze0Var2.c(true);
                            yg0Var2.u1(0, true, null, true);
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error2.code != -1000) {
                            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb3);
                            sb3.append(tL_error2.text);
                            yg0Var2.l1(string2, sb3.toString());
                        }
                    }
                }
                yg0Var2.k1(false, true);
                break;
        }
    }

    public /* synthetic */ ve0(ze0 ze0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = ze0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
