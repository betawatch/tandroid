package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ uc0(gd0 gd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.a = i7;
        this.b = gd0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final gd0 gd0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wc0
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
                        final gd0 gd0Var2 = gd0Var;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = gd0Var2.h0;
                                ce0 ce0Var = gd0Var2.u0;
                                gd0Var2.y(false);
                                int i18 = 2;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    gd0Var2.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        gd0Var2.f0 = false;
                                        ce0Var.N1(false, true);
                                        if ((i17 == 3 && ((i12 = gd0Var2.i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = gd0Var2.i0) == 4 || i11 == 3)) || (i17 == 4 && ((i10 = gd0Var2.i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            gd0Var2.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.qs.e().b(gd0Var2, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(gd0Var2, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(gd0Var2, org.telegram.messenger.qs.h4);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l10(21));
                                        }
                                        gd0Var2.e0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749178, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                gd0Var2.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                gd0Var2.c(true);
                                                ce0Var.M1(0, true, null, true);
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131750688, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.hd.M0(2131746072, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ce0Var.D1(M0, sb2.toString());
                                            }
                                            int i19 = 0;
                                            while (true) {
                                                yq yqVar = gd0Var2.f;
                                                br[] brVarArr = yqVar.f;
                                                if (i19 >= brVarArr.length) {
                                                    yqVar.e = false;
                                                    brVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    brVarArr[i19].setText("");
                                                    i19++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new uc0(gd0Var2, tL_auth_signIn2, i16), 10);
                                        gd0Var2.u();
                                        gd0Var2.t();
                                    }
                                } else {
                                    gd0Var2.f0 = false;
                                    ce0Var.N1(false, true);
                                    gd0Var2.u();
                                    gd0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ce0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gd0Var2.d);
                                        bundle.putString("phoneHash", gd0Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        gd0Var2.p(new Runnable() { // from class: org.telegram.ui.ad0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        gd0Var2.u0.M1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        gd0Var2.u0.M1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        gd0Var2.p(new zc0(i18, gd0Var2, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    break;
                                }
                                break;
                            default:
                                gd0Var2.f0 = false;
                                ce0 ce0Var2 = gd0Var2.u0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", gd0Var2.d);
                                        bundle2.putString("phoneHash", gd0Var2.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        gd0Var2.p(new Runnable() { // from class: org.telegram.ui.ad0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        gd0Var2.u0.M1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        gd0Var2.u0.M1(6, true, bundle2, false);
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
                final gd0 gd0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wc0
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
                        final gd0 gd0Var22 = gd0Var2;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = gd0Var22.h0;
                                ce0 ce0Var = gd0Var22.u0;
                                gd0Var22.y(false);
                                int i18 = 2;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    gd0Var22.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        gd0Var22.f0 = false;
                                        ce0Var.N1(false, true);
                                        if ((i17 == 3 && ((i12 = gd0Var22.i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = gd0Var22.i0) == 4 || i11 == 3)) || (i17 == 4 && ((i102 = gd0Var22.i0) == 2 || i102 == 17 || i102 == 16)))) {
                                            gd0Var22.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.qs.e().b(gd0Var22, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(gd0Var22, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(gd0Var22, org.telegram.messenger.qs.h4);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l10(21));
                                        }
                                        gd0Var22.e0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749178, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                gd0Var22.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                gd0Var22.c(true);
                                                ce0Var.M1(0, true, null, true);
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131750688, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.hd.M0(2131746072, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ce0Var.D1(M0, sb2.toString());
                                            }
                                            int i19 = 0;
                                            while (true) {
                                                yq yqVar = gd0Var22.f;
                                                br[] brVarArr = yqVar.f;
                                                if (i19 >= brVarArr.length) {
                                                    yqVar.e = false;
                                                    brVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    brVarArr[i19].setText("");
                                                    i19++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new uc0(gd0Var22, tL_auth_signIn22, i16), 10);
                                        gd0Var22.u();
                                        gd0Var22.t();
                                    }
                                } else {
                                    gd0Var22.f0 = false;
                                    ce0Var.N1(false, true);
                                    gd0Var22.u();
                                    gd0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ce0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gd0Var22.d);
                                        bundle.putString("phoneHash", gd0Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        gd0Var22.p(new Runnable() { // from class: org.telegram.ui.ad0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        gd0Var22.u0.M1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        gd0Var22.u0.M1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        gd0Var22.p(new zc0(i18, gd0Var22, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    break;
                                }
                                break;
                            default:
                                gd0Var22.f0 = false;
                                ce0 ce0Var2 = gd0Var22.u0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", gd0Var22.d);
                                        bundle2.putString("phoneHash", gd0Var22.c);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        gd0Var22.p(new Runnable() { // from class: org.telegram.ui.ad0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        gd0Var22.u0.M1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        gd0Var22.u0.M1(6, true, bundle2, false);
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
