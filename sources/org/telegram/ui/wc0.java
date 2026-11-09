package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ wc0(id0 id0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.a = i7;
        this.b = id0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final id0 id0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yc0
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
                        final id0 id0Var2 = id0Var;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = id0Var2.h0;
                                ee0 ee0Var = id0Var2.u0;
                                id0Var2.y(false);
                                int i18 = 2;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    id0Var2.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        id0Var2.f0 = false;
                                        ee0Var.N1(false, true);
                                        if ((i17 == 3 && ((i12 = id0Var2.i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = id0Var2.i0) == 4 || i11 == 3)) || (i17 == 4 && ((i10 = id0Var2.i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            id0Var2.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.qs.e().b(id0Var2, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(id0Var2, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(id0Var2, org.telegram.messenger.qs.h4);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(23));
                                        }
                                        id0Var2.e0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                id0Var2.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                id0Var2.c(true);
                                                ee0Var.M1(0, true, null, true);
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ee0Var.D1(M0, sb2.toString());
                                            }
                                            int i19 = 0;
                                            while (true) {
                                                ar arVar = id0Var2.f;
                                                dr[] drVarArr = arVar.f;
                                                if (i19 >= drVarArr.length) {
                                                    arVar.e = false;
                                                    drVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    drVarArr[i19].setText("");
                                                    i19++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new wc0(id0Var2, tL_auth_signIn2, i16), 10);
                                        id0Var2.u();
                                        id0Var2.t();
                                    }
                                } else {
                                    id0Var2.f0 = false;
                                    ee0Var.N1(false, true);
                                    id0Var2.u();
                                    id0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", id0Var2.d);
                                        bundle.putString("phoneHash", id0Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        id0Var2.p(new Runnable() { // from class: org.telegram.ui.cd0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        id0Var2.u0.M1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        id0Var2.u0.M1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        id0Var2.p(new bd0(i18, id0Var2, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    break;
                                }
                                break;
                            default:
                                id0Var2.f0 = false;
                                ee0 ee0Var2 = id0Var2.u0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ee0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", id0Var2.d);
                                        bundle2.putString("phoneHash", id0Var2.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        id0Var2.p(new Runnable() { // from class: org.telegram.ui.cd0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        id0Var2.u0.M1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        id0Var2.u0.M1(6, true, bundle2, false);
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
                final id0 id0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yc0
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
                        final id0 id0Var22 = id0Var2;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = id0Var22.h0;
                                ee0 ee0Var = id0Var22.u0;
                                id0Var22.y(false);
                                int i18 = 2;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    id0Var22.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        id0Var22.f0 = false;
                                        ee0Var.N1(false, true);
                                        if ((i17 == 3 && ((i12 = id0Var22.i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = id0Var22.i0) == 4 || i11 == 3)) || (i17 == 4 && ((i102 = id0Var22.i0) == 2 || i102 == 17 || i102 == 16)))) {
                                            id0Var22.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.qs.e().b(id0Var22, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(id0Var22, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(id0Var22, org.telegram.messenger.qs.h4);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(23));
                                        }
                                        id0Var22.e0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                id0Var22.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                id0Var22.c(true);
                                                ee0Var.M1(0, true, null, true);
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ee0Var.D1(M0, sb2.toString());
                                            }
                                            int i19 = 0;
                                            while (true) {
                                                ar arVar = id0Var22.f;
                                                dr[] drVarArr = arVar.f;
                                                if (i19 >= drVarArr.length) {
                                                    arVar.e = false;
                                                    drVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    drVarArr[i19].setText("");
                                                    i19++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new wc0(id0Var22, tL_auth_signIn22, i16), 10);
                                        id0Var22.u();
                                        id0Var22.t();
                                    }
                                } else {
                                    id0Var22.f0 = false;
                                    ee0Var.N1(false, true);
                                    id0Var22.u();
                                    id0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", id0Var22.d);
                                        bundle.putString("phoneHash", id0Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        id0Var22.p(new Runnable() { // from class: org.telegram.ui.cd0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        id0Var22.u0.M1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        id0Var22.u0.M1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        id0Var22.p(new bd0(i18, id0Var22, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    break;
                                }
                                break;
                            default:
                                id0Var22.f0 = false;
                                ee0 ee0Var2 = id0Var22.u0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ee0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", id0Var22.d);
                                        bundle2.putString("phoneHash", id0Var22.c);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        id0Var22.p(new Runnable() { // from class: org.telegram.ui.cd0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        id0Var22.u0.M1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        id0Var22.u0.M1(6, true, bundle2, false);
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
