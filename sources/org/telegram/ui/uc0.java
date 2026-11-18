package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ uc0(hd0 hd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.a = i7;
        this.b = hd0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final hd0 hd0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.wc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        int i14 = i7;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final hd0 hd0Var2 = hd0Var;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = hd0Var2.i0;
                                ee0 ee0Var = hd0Var2.v0;
                                hd0Var2.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    hd0Var2.h0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        hd0Var2.g0 = false;
                                        ee0Var.N1(false, true);
                                        if ((i17 == 3 && ((i12 = hd0Var2.j0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = hd0Var2.j0) == 4 || i11 == 3)) || (i17 == 4 && ((i10 = hd0Var2.j0) == 2 || i10 == 17 || i10 == 16)))) {
                                            hd0Var2.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.ks.e().b(hd0Var2, org.telegram.messenger.ks.j4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.C3(true);
                                            org.telegram.messenger.ks.e().b(hd0Var2, org.telegram.messenger.ks.j4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.B3(true);
                                            org.telegram.messenger.ks.e().b(hd0Var2, org.telegram.messenger.ks.k4);
                                            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(29));
                                        }
                                        hd0Var2.f0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                hd0Var2.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                hd0Var2.c(true);
                                                ee0Var.M1(0, true, null, true);
                                                ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751094, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ee0Var.D1(M0, sb2.toString());
                                            }
                                            int i18 = 0;
                                            while (true) {
                                                br brVar = hd0Var2.f;
                                                er[] erVarArr = brVar.f;
                                                if (i18 >= erVarArr.length) {
                                                    brVar.e = false;
                                                    erVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    erVarArr[i18].setText("");
                                                    i18++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new uc0(hd0Var2, tL_auth_signIn2, i16), 10);
                                        hd0Var2.u();
                                        hd0Var2.t();
                                    }
                                } else {
                                    hd0Var2.g0 = false;
                                    ee0Var.N1(false, true);
                                    hd0Var2.u();
                                    hd0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", hd0Var2.d);
                                        bundle.putString("phoneHash", hd0Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        hd0Var2.p(new Runnable() { // from class: org.telegram.ui.zc0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        hd0Var2.v0.M1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        hd0Var2.v0.M1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        hd0Var2.p(new o60(23, hd0Var2, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.B3(false);
                                    break;
                                }
                                break;
                            default:
                                hd0Var2.g0 = false;
                                ee0 ee0Var2 = hd0Var2.v0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.b5.u0(ee0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", hd0Var2.d);
                                        bundle2.putString("phoneHash", hd0Var2.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        hd0Var2.p(new Runnable() { // from class: org.telegram.ui.zc0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        hd0Var2.v0.M1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        hd0Var2.v0.M1(6, true, bundle2, false);
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
                final hd0 hd0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.wc0
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
                        final hd0 hd0Var22 = hd0Var2;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = hd0Var22.i0;
                                ee0 ee0Var = hd0Var22.v0;
                                hd0Var22.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    hd0Var22.h0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        hd0Var22.g0 = false;
                                        ee0Var.N1(false, true);
                                        if ((i17 == 3 && ((i12 = hd0Var22.j0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = hd0Var22.j0) == 4 || i11 == 3)) || (i17 == 4 && ((i102 = hd0Var22.j0) == 2 || i102 == 17 || i102 == 16)))) {
                                            hd0Var22.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.ks.e().b(hd0Var22, org.telegram.messenger.ks.j4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.C3(true);
                                            org.telegram.messenger.ks.e().b(hd0Var22, org.telegram.messenger.ks.j4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.B3(true);
                                            org.telegram.messenger.ks.e().b(hd0Var22, org.telegram.messenger.ks.k4);
                                            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(29));
                                        }
                                        hd0Var22.f0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                hd0Var22.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                hd0Var22.c(true);
                                                ee0Var.M1(0, true, null, true);
                                                ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751094, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ee0Var.D1(M0, sb2.toString());
                                            }
                                            int i18 = 0;
                                            while (true) {
                                                br brVar = hd0Var22.f;
                                                er[] erVarArr = brVar.f;
                                                if (i18 >= erVarArr.length) {
                                                    brVar.e = false;
                                                    erVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    erVarArr[i18].setText("");
                                                    i18++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new uc0(hd0Var22, tL_auth_signIn22, i16), 10);
                                        hd0Var22.u();
                                        hd0Var22.t();
                                    }
                                } else {
                                    hd0Var22.g0 = false;
                                    ee0Var.N1(false, true);
                                    hd0Var22.u();
                                    hd0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", hd0Var22.d);
                                        bundle.putString("phoneHash", hd0Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        hd0Var22.p(new Runnable() { // from class: org.telegram.ui.zc0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        hd0Var22.v0.M1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        hd0Var22.v0.M1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        hd0Var22.p(new o60(23, hd0Var22, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.B3(false);
                                    break;
                                }
                                break;
                            default:
                                hd0Var22.g0 = false;
                                ee0 ee0Var2 = hd0Var22.v0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.b5.u0(ee0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", hd0Var22.d);
                                        bundle2.putString("phoneHash", hd0Var22.c);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        hd0Var22.p(new Runnable() { // from class: org.telegram.ui.zc0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        hd0Var22.v0.M1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        hd0Var22.v0.M1(6, true, bundle2, false);
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
