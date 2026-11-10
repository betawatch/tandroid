package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ yc0(jd0 jd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.a = i7;
        this.b = jd0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final jd0 jd0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ad0
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
                        final jd0 jd0Var2 = jd0Var;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = jd0Var2.h0;
                                fe0 fe0Var = jd0Var2.u0;
                                jd0Var2.y(false);
                                int i18 = 3;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    jd0Var2.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        jd0Var2.f0 = false;
                                        fe0Var.N1(false, true);
                                        if ((i17 == 3 && ((i12 = jd0Var2.i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = jd0Var2.i0) == 4 || i11 == 3)) || (i17 == 4 && ((i10 = jd0Var2.i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            jd0Var2.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.qs.e().b(jd0Var2, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(jd0Var2, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(jd0Var2, org.telegram.messenger.qs.h4);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(23));
                                        }
                                        jd0Var2.e0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                jd0Var2.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                jd0Var2.c(true);
                                                fe0Var.M1(0, true, null, true);
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                fe0Var.D1(M0, sb2.toString());
                                            }
                                            int i19 = 0;
                                            while (true) {
                                                br brVar = jd0Var2.f;
                                                er[] erVarArr = brVar.f;
                                                if (i19 >= erVarArr.length) {
                                                    brVar.e = false;
                                                    erVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    erVarArr[i19].setText("");
                                                    i19++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new yc0(jd0Var2, tL_auth_signIn2, i16), 10);
                                        jd0Var2.u();
                                        jd0Var2.t();
                                    }
                                } else {
                                    jd0Var2.f0 = false;
                                    fe0Var.N1(false, true);
                                    jd0Var2.u();
                                    jd0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fe0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", jd0Var2.d);
                                        bundle.putString("phoneHash", jd0Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        jd0Var2.p(new Runnable() { // from class: org.telegram.ui.dd0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        jd0Var2.u0.M1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        jd0Var2.u0.M1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        jd0Var2.p(new tc0(i18, jd0Var2, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    break;
                                }
                                break;
                            default:
                                jd0Var2.f0 = false;
                                fe0 fe0Var2 = jd0Var2.u0;
                                fe0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.u4.u0(fe0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", jd0Var2.d);
                                        bundle2.putString("phoneHash", jd0Var2.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        jd0Var2.p(new Runnable() { // from class: org.telegram.ui.dd0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        jd0Var2.u0.M1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        jd0Var2.u0.M1(6, true, bundle2, false);
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
                final jd0 jd0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ad0
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
                        final jd0 jd0Var22 = jd0Var2;
                        final int i15 = 0;
                        final int i16 = 1;
                        switch (i14) {
                            case 0:
                                int i17 = jd0Var22.h0;
                                fe0 fe0Var = jd0Var22.u0;
                                jd0Var22.y(false);
                                int i18 = 3;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    jd0Var22.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        jd0Var22.f0 = false;
                                        fe0Var.N1(false, true);
                                        if ((i17 == 3 && ((i12 = jd0Var22.i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i17 == 2 && ((i11 = jd0Var22.i0) == 4 || i11 == 3)) || (i17 == 4 && ((i102 = jd0Var22.i0) == 2 || i102 == 17 || i102 == 16)))) {
                                            jd0Var22.s();
                                        }
                                        if (i17 == 15) {
                                            org.telegram.messenger.qs.e().b(jd0Var22, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(jd0Var22, org.telegram.messenger.qs.g4);
                                        } else if (i17 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(jd0Var22, org.telegram.messenger.qs.h4);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(23));
                                        }
                                        jd0Var22.e0 = true;
                                        if (i17 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                jd0Var22.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                jd0Var22.c(true);
                                                fe0Var.M1(0, true, null, true);
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                fe0Var.D1(M0, sb2.toString());
                                            }
                                            int i19 = 0;
                                            while (true) {
                                                br brVar = jd0Var22.f;
                                                er[] erVarArr = brVar.f;
                                                if (i19 >= erVarArr.length) {
                                                    brVar.e = false;
                                                    erVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    erVarArr[i19].setText("");
                                                    i19++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new yc0(jd0Var22, tL_auth_signIn22, i16), 10);
                                        jd0Var22.u();
                                        jd0Var22.t();
                                    }
                                } else {
                                    jd0Var22.f0 = false;
                                    fe0Var.N1(false, true);
                                    jd0Var22.u();
                                    jd0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fe0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", jd0Var22.d);
                                        bundle.putString("phoneHash", jd0Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        jd0Var22.p(new Runnable() { // from class: org.telegram.ui.dd0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        jd0Var22.u0.M1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        jd0Var22.u0.M1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        jd0Var22.p(new tc0(i18, jd0Var22, tLObject2));
                                    }
                                }
                                if (i17 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    break;
                                }
                                break;
                            default:
                                jd0Var22.f0 = false;
                                fe0 fe0Var2 = jd0Var22.u0;
                                fe0Var2.N1(false, true);
                                if (tL_error2 != null) {
                                    fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.u4.u0(fe0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", jd0Var22.d);
                                        bundle2.putString("phoneHash", jd0Var22.c);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        jd0Var22.p(new Runnable() { // from class: org.telegram.ui.dd0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        jd0Var22.u0.M1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        jd0Var22.u0.M1(6, true, bundle2, false);
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
