package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae0 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.TL_auth_resetLoginEmail d;

    public /* synthetic */ rd0(ae0 ae0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.a = i10;
        this.b = ae0Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ae0 ae0Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ud0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i11;
                        String str2;
                        int i12;
                        int i13 = i10;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        ae0 ae0Var2 = ae0Var;
                        switch (i13) {
                            case 0:
                                pg0 pg0Var = ae0Var2.T;
                                if (pg0Var.getParentActivity() != null) {
                                    ae0Var2.S = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i11 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                                                    org.telegram.ui.Components.z4.f0(i11, tL_error2, pg0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                                    break;
                                                } else {
                                                    pg0Var.u1(0, true, null, true);
                                                    pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ae0Var2.getContext());
                                                String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                                d2Var.O = string;
                                                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(se.b.c().b("+" + ae0Var2.I))));
                                                kf.k0.C(R.string.OK, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        pg0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                pg0 pg0Var2 = ae0Var2.T;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i12 = ((org.telegram.ui.ActionBar.p2) pg0Var2).currentAccount;
                                            org.telegram.ui.Components.z4.f0(i12, tL_error2, pg0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                            break;
                                        } else {
                                            pg0Var2.u1(0, true, null, true);
                                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ae0Var2.y.getString("emailPattern");
                                        ae0Var2.x = true;
                                    }
                                    pg0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final ae0 ae0Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ud0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i112;
                        String str2;
                        int i12;
                        int i13 = i11;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        ae0 ae0Var22 = ae0Var2;
                        switch (i13) {
                            case 0:
                                pg0 pg0Var = ae0Var22.T;
                                if (pg0Var.getParentActivity() != null) {
                                    ae0Var22.S = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i112 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                                                    org.telegram.ui.Components.z4.f0(i112, tL_error2, pg0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                                    break;
                                                } else {
                                                    pg0Var.u1(0, true, null, true);
                                                    pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ae0Var22.getContext());
                                                String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                                d2Var.O = string;
                                                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(se.b.c().b("+" + ae0Var22.I))));
                                                kf.k0.C(R.string.OK, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        pg0Var.g1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                pg0 pg0Var2 = ae0Var22.T;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i12 = ((org.telegram.ui.ActionBar.p2) pg0Var2).currentAccount;
                                            org.telegram.ui.Components.z4.f0(i12, tL_error2, pg0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                            break;
                                        } else {
                                            pg0Var2.u1(0, true, null, true);
                                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ae0Var22.y.getString("emailPattern");
                                        ae0Var22.x = true;
                                    }
                                    pg0Var2.g1(bundle22, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
