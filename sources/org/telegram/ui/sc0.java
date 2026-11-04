package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ sc0(dd0 dd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i3) {
        this.a = i3;
        this.b = dd0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final dd0 dd0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.uc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        int i14 = i3;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final dd0 dd0Var2 = dd0Var;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = dd0Var2.i0;
                                xd0 xd0Var = dd0Var2.v0;
                                dd0Var2.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    dd0Var2.h0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        dd0Var2.g0 = false;
                                        xd0Var.E1(false, true);
                                        if ((i17 == 3 && ((i12 = dd0Var2.j0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = dd0Var2.j0) == 4 || i11 == 3)) || (i17 == 4 && ((i10 = dd0Var2.j0) == 2 || i10 == 17 || i10 == 16)))) {
                                            dd0Var2.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.hs.e().b(dd0Var2, org.telegram.messenger.hs.g4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.hs.e().b(dd0Var2, org.telegram.messenger.hs.g4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.hs.e().b(dd0Var2, org.telegram.messenger.hs.h4);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(22));
                                        }
                                        dd0Var2.f0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                dd0Var2.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                dd0Var2.c(true);
                                                xd0Var.D1(0, true, null, true);
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                xd0Var.u1(M0, sb2.toString());
                                            }
                                            int i18 = 0;
                                            while (true) {
                                                xq xqVar = dd0Var2.f;
                                                zq[] zqVarArr = xqVar.f;
                                                if (i18 >= zqVarArr.length) {
                                                    xqVar.e = false;
                                                    zqVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    zqVarArr[i18].setText("");
                                                    i18++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new sc0(dd0Var2, tL_auth_signIn2, i16), 10);
                                        dd0Var2.u();
                                        dd0Var2.t();
                                    }
                                } else {
                                    dd0Var2.g0 = false;
                                    xd0Var.E1(false, true);
                                    dd0Var2.u();
                                    dd0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xd0Var.r0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", dd0Var2.d);
                                        bundle.putString("phoneHash", dd0Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        dd0Var2.p(new Runnable() { // from class: org.telegram.ui.xc0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        dd0Var2.v0.D1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        dd0Var2.v0.D1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        dd0Var2.p(new tb0(7, dd0Var2, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    break;
                                }
                                break;
                            default:
                                dd0Var2.g0 = false;
                                xd0 xd0Var2 = dd0Var2.v0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 != null) {
                                    xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", dd0Var2.d);
                                        bundle2.putString("phoneHash", dd0Var2.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        dd0Var2.p(new Runnable() { // from class: org.telegram.ui.xc0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        dd0Var2.v0.D1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        dd0Var2.v0.D1(6, true, bundle2, false);
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
                final int i10 = 1;
                final dd0 dd0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.uc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11;
                        int i12;
                        int i13;
                        int i14 = i10;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final dd0 dd0Var22 = dd0Var2;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = dd0Var22.i0;
                                xd0 xd0Var = dd0Var22.v0;
                                dd0Var22.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    dd0Var22.h0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        dd0Var22.g0 = false;
                                        xd0Var.E1(false, true);
                                        if ((i17 == 3 && ((i12 = dd0Var22.j0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = dd0Var22.j0) == 4 || i11 == 3)) || (i17 == 4 && ((i102 = dd0Var22.j0) == 2 || i102 == 17 || i102 == 16)))) {
                                            dd0Var22.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.hs.e().b(dd0Var22, org.telegram.messenger.hs.g4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.hs.e().b(dd0Var22, org.telegram.messenger.hs.g4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.hs.e().b(dd0Var22, org.telegram.messenger.hs.h4);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(22));
                                        }
                                        dd0Var22.f0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                dd0Var22.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                dd0Var22.c(true);
                                                xd0Var.D1(0, true, null, true);
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                xd0Var.u1(M0, sb2.toString());
                                            }
                                            int i18 = 0;
                                            while (true) {
                                                xq xqVar = dd0Var22.f;
                                                zq[] zqVarArr = xqVar.f;
                                                if (i18 >= zqVarArr.length) {
                                                    xqVar.e = false;
                                                    zqVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    zqVarArr[i18].setText("");
                                                    i18++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new sc0(dd0Var22, tL_auth_signIn22, i16), 10);
                                        dd0Var22.u();
                                        dd0Var22.t();
                                    }
                                } else {
                                    dd0Var22.g0 = false;
                                    xd0Var.E1(false, true);
                                    dd0Var22.u();
                                    dd0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xd0Var.r0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", dd0Var22.d);
                                        bundle.putString("phoneHash", dd0Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        dd0Var22.p(new Runnable() { // from class: org.telegram.ui.xc0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        dd0Var22.v0.D1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        dd0Var22.v0.D1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        dd0Var22.p(new tb0(7, dd0Var22, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    break;
                                }
                                break;
                            default:
                                dd0Var22.g0 = false;
                                xd0 xd0Var2 = dd0Var22.v0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 != null) {
                                    xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", dd0Var22.d);
                                        bundle2.putString("phoneHash", dd0Var22.c);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        dd0Var22.p(new Runnable() { // from class: org.telegram.ui.xc0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        dd0Var22.v0.D1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        dd0Var22.v0.D1(6, true, bundle2, false);
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
