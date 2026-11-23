package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ yb0(ec0 ec0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.a = i7;
        this.b = ec0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final ec0 ec0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.ac0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11 = i7;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ec0 ec0Var2 = ec0Var;
                        int i12 = 1;
                        int i13 = 0;
                        switch (i11) {
                            case 0:
                                int i14 = ec0Var2.a;
                                ah.i iVar = ec0Var2.c;
                                de0 de0Var = ec0Var2.b0;
                                de0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        ec0Var2.S = false;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748986, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                ec0Var2.r(false);
                                                iVar.post(new cc0(ec0Var2, i13));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ec0Var2.c(true);
                                                de0Var.M1(0, true, null, true);
                                                de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, "FloodWait"));
                                            } else {
                                                String N0 = org.telegram.messenger.hd.N0(2131745875, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751093, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                de0Var.D1(N0, sb2.toString());
                                            }
                                            iVar.setText("");
                                            iVar.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                                        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new yb0(ec0Var2, tL_auth_signIn2, i12), 10);
                                        ec0Var2.q();
                                    }
                                } else {
                                    ec0Var2.S = false;
                                    de0Var.N1(false, true);
                                    ec0Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            de0Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ec0Var2.H);
                                        bundle.putString("phoneHash", ec0Var2.I);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        de0Var.M1(5, true, bundle, false);
                                    } else {
                                        de0Var.G1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i14 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.B3(false);
                                    break;
                                }
                                break;
                            default:
                                ec0Var2.S = false;
                                de0 de0Var2 = ec0Var2.b0;
                                de0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.c5.u0(de0Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743575, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", ec0Var2.H);
                                        bundle2.putString("phoneHash", ec0Var2.I);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        de0Var2.M1(6, true, bundle2, false);
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final ec0 ec0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.ac0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11 = i10;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ec0 ec0Var22 = ec0Var2;
                        int i12 = 1;
                        int i13 = 0;
                        switch (i11) {
                            case 0:
                                int i14 = ec0Var22.a;
                                ah.i iVar = ec0Var22.c;
                                de0 de0Var = ec0Var22.b0;
                                de0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        ec0Var22.S = false;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748986, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                ec0Var22.r(false);
                                                iVar.post(new cc0(ec0Var22, i13));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ec0Var22.c(true);
                                                de0Var.M1(0, true, null, true);
                                                de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, "FloodWait"));
                                            } else {
                                                String N0 = org.telegram.messenger.hd.N0(2131745875, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751093, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                de0Var.D1(N0, sb2.toString());
                                            }
                                            iVar.setText("");
                                            iVar.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i102 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                                        ConnectionsManager.getInstance(i102).sendRequest(getpassword, new yb0(ec0Var22, tL_auth_signIn22, i12), 10);
                                        ec0Var22.q();
                                    }
                                } else {
                                    ec0Var22.S = false;
                                    de0Var.N1(false, true);
                                    ec0Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            de0Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ec0Var22.H);
                                        bundle.putString("phoneHash", ec0Var22.I);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        de0Var.M1(5, true, bundle, false);
                                    } else {
                                        de0Var.G1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i14 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.B3(false);
                                    break;
                                }
                                break;
                            default:
                                ec0Var22.S = false;
                                de0 de0Var2 = ec0Var22.b0;
                                de0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.c5.u0(de0Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743575, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", ec0Var22.H);
                                        bundle2.putString("phoneHash", ec0Var22.I);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        de0Var2.M1(6, true, bundle2, false);
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
