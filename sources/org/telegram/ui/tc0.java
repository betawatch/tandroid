package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.tasks.CancellationTokenSource;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tc0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e1  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int i10;
        char c10;
        String G;
        ?? r16;
        String a02;
        org.telegram.ui.ActionBar.f2 T;
        org.telegram.ui.Components.bc I;
        jl0 jl0Var;
        jl0 jl0Var2;
        sj sjVar;
        int i11 = 4;
        String str = "";
        int i12 = 2;
        switch (this.a) {
            case 0:
                uc0 uc0Var = (uc0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                fe0 fe0Var = uc0Var.G;
                fe0Var.C1(false, true);
                if (tL_error == null) {
                    if (uc0Var.r != null && uc0Var.s != null && uc0Var.w != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", uc0Var.r);
                        bundle.putString("phoneHash", uc0Var.s);
                        bundle.putString("code", uc0Var.w);
                        fe0Var.M1(5, true, bundle, false);
                        break;
                    } else {
                        fe0Var.M1(0, true, null, true);
                        break;
                    }
                } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
                    fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131746115, "ResetAccountCancelledAlert"));
                    break;
                } else {
                    fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error.text);
                    break;
                }
                break;
            case 1:
                jd0 jd0Var = (jd0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131752579, null);
                alertDialog$Builder.a.T = org.telegram.messenger.id.a0("CancelLinkSuccess", null, 2131752580, org.telegram.messenger.k5.i(new StringBuilder("+"), jd0Var.b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752041, null), null);
                alertDialog$Builder.a.setOnDismissListener(new fd0(jd0Var, 0));
                alertDialog$Builder.p();
                break;
            case 2:
                jd0 jd0Var2 = (jd0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                jd0Var2.getClass();
                jd0Var2.g0 = tL_error2.text;
                break;
            case 3:
                ((jd0) this.b).u0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 4:
                jd0 jd0Var3 = (jd0) this.b;
                Runnable runnable = (Runnable) this.c;
                br brVar = jd0Var3.f;
                int i13 = 0;
                while (true) {
                    er[] erVarArr = brVar.f;
                    if (i13 >= erVarArr.length) {
                        runnable.run();
                        brVar.e = false;
                        break;
                    } else {
                        erVarArr[i13].C(0.0f);
                        i13++;
                    }
                }
            case 5:
                ((r3) this.b).a((String) this.c);
                break;
            case 6:
                ee0 ee0Var = (ee0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                fe0 fe0Var2 = ee0Var.g0;
                SharedPreferences e12 = org.telegram.messenger.qp.e1();
                if (!e12.getBoolean("firstloginshow", true) && !fe0Var2.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    fe0Var2.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    e12.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fe0Var2.getParentActivity());
                    int i14 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.m6.x0(null, i14, false), null);
                    alertDialog$Builder2.n(i14, null);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751771, "Continue"), null);
                    String M0 = org.telegram.messenger.id.M0(2131754278, "AllowFillNumber");
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.a;
                    u1Var.T = M0;
                    fe0Var2.n = fe0Var2.showDialog(u1Var, true, null);
                    fe0Var2.c0 = true;
                    break;
                }
                break;
            case 7:
                ee0 ee0Var2 = (ee0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                if (ee0Var2.o()) {
                    org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, ee0Var2.getContext(), null);
                    u1Var2.setOnCancelListener(new vf(cancellationTokenSource, i11));
                    u1Var2.show();
                    ee0Var2.b0 = u1Var2;
                    break;
                }
                break;
            case 8:
                he0.Z((he0) this.b, (org.telegram.ui.ActionBar.u1) this.c);
                break;
            case 9:
                ff0 ff0Var = (ff0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                ff0Var.c0 = false;
                if (tL_error3 == null) {
                    xe0 l02 = ff0Var.l0();
                    ff0Var.j0.clear();
                    ff0Var.n0(l02);
                    break;
                }
                break;
            case 10:
                we0 we0Var = (we0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ff0 ff0Var2 = we0Var.a;
                xe0 l03 = ff0Var2.l0();
                ff0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = ff0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ff0Var2.getMessagesStorage().w1(ff0Var2.d.invitesCount, ff0Var2.n);
                }
                ff0Var2.n0(l03);
                break;
            case 11:
                mg0 mg0Var = (mg0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (mg0Var.getParentActivity() != null) {
                    Toast.makeText(mg0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 12:
                dh0 dh0Var = (dh0) this.b;
                String str2 = (String) this.c;
                dh0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", org.telegram.messenger.id.a0(null, null, 2131749116, "https://telegram.org/dl"));
                dh0Var.getContext().startActivity(intent);
                break;
            case 13:
                dh0 dh0Var2 = (dh0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                dh0Var2.dismiss();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.D4(user.id));
                    break;
                }
                break;
            case 14:
                ((org.telegram.ui.Components.ex) this.b).a((TLRPC.User) this.c);
                break;
            case 15:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 16:
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                w2VarArr[0] = null;
                ei0.a = null;
                zArr[0] = true;
                break;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (er erVar : passcodeActivity.n.f) {
                    erVar.C(0.0f);
                }
                runnable2.run();
                break;
            case 18:
                ki0 ki0Var = (ki0) this.b;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) ki0Var.c;
                z0Var.setText(org.telegram.messenger.id.M0(passcodeActivity2.D == 0 ? 2131747653 : 2131747654, null));
                z0Var.setIcon(passcodeActivity2.D == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.y0();
                if (passcodeActivity2.s0()) {
                    passcodeActivity2.h.setInputType(524417);
                    org.telegram.messenger.g0.Z3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 19:
                ((PasskeysActivity) this.b).d0((TL_account.Passkey) this.c);
                break;
            case 20:
                ek0 ek0Var = (ek0) this.b;
                org.telegram.messenger.zr zrVar = (org.telegram.messenger.zr) this.c;
                int[] iArr = ek0Var.y;
                int i15 = zrVar.a;
                if (i15 == 2) {
                    if (!(ek0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = ek0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) ek0Var.G.get(i16);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    ek0Var.F = tL_secureRequiredType;
                                    ek0Var.U1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i15 == 1) {
                    if (!(ek0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = ek0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) ek0Var.G.get(i17);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    ek0Var.F = tL_secureRequiredType2;
                                    ek0Var.U1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i15 == 3) {
                    if (!(ek0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = ek0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) ek0Var.G.get(i18);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    ek0Var.F = tL_secureRequiredType3;
                                    ek0Var.U1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i15 == 4 && !(ek0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = ek0Var.G.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) ek0Var.G.get(i19);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                ek0Var.F = tL_secureRequiredType4;
                                ek0Var.U1();
                            } else {
                                i19++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(zrVar.b)) {
                    ek0Var.Y[0].setText(zrVar.b);
                }
                if (!TextUtils.isEmpty(zrVar.d)) {
                    ek0Var.Y[1].setText(zrVar.d);
                }
                if (!TextUtils.isEmpty(zrVar.c)) {
                    ek0Var.Y[2].setText(zrVar.c);
                }
                if (!TextUtils.isEmpty(zrVar.e)) {
                    ek0Var.Y[7].setText(zrVar.e);
                }
                int i20 = zrVar.n;
                if (i20 != 0) {
                    if (i20 == 1) {
                        ek0Var.x = "male";
                        ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
                    } else if (i20 == 2) {
                        ek0Var.x = "female";
                        ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
                    }
                }
                if (!TextUtils.isEmpty(zrVar.m)) {
                    String str3 = zrVar.m;
                    ek0Var.s = str3;
                    String str4 = (String) ek0Var.Y0.get(str3);
                    if (str4 != null) {
                        ek0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(zrVar.l)) {
                    String str5 = zrVar.l;
                    ek0Var.w = str5;
                    String str6 = (String) ek0Var.Y0.get(str5);
                    if (str6 != null) {
                        ek0Var.Y[6].setText(str6);
                    }
                }
                int i21 = zrVar.k;
                if (i21 > 0 && zrVar.j > 0 && zrVar.i > 0) {
                    ek0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(zrVar.j), Integer.valueOf(zrVar.i)));
                }
                int i22 = zrVar.h;
                if (i22 <= 0 || (i7 = zrVar.g) <= 0 || (i10 = zrVar.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    ek0Var.Y[8].setText(org.telegram.messenger.id.M0(2131747494, null));
                    break;
                } else {
                    iArr[0] = i10;
                    iArr[1] = i7;
                    iArr[2] = i22;
                    ek0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(zrVar.g), Integer.valueOf(zrVar.f)));
                    break;
                }
                break;
            case 21:
                ek0 ek0Var2 = (ek0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    ek0Var2.J = password;
                    if (TwoStepVerificationActivity.n0(password, false)) {
                        TwoStepVerificationActivity.r0(ek0Var2.J);
                        ek0Var2.W1();
                        if (ek0Var2.Z[0].getVisibility() == 0) {
                            ek0Var2.Y[0].requestFocus();
                            org.telegram.messenger.g0.K3(ek0Var2.Y[0]);
                        }
                        if (ek0Var2.N0 == 1) {
                            ek0Var2.F1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.u4.u0(ek0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                        break;
                    }
                }
                break;
            case 22:
                ek0 ek0Var3 = (ek0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                if (tL_error4 == null) {
                    ek0Var3.f1 = true;
                    ek0Var3.a1(true);
                    ek0Var3.finishFragment();
                    break;
                } else {
                    ek0Var3.R1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error4.text)) {
                        org.telegram.ui.Components.u4.u0(ek0Var3.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                        break;
                    } else {
                        ek0Var3.Q1(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error4.text);
                        break;
                    }
                }
            case 23:
                ((zj0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 24:
                kl0 kl0Var = (kl0) this.b;
                View view = (View) this.c;
                kl0Var.J0(false);
                view.callOnClick();
                break;
            case 25:
                kl0 kl0Var2 = (kl0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                kl0Var2.N0(true, false);
                if (tL_error5 != null) {
                    if (tL_error5.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.l3 l3Var = kl0Var2.S;
                        try {
                            l3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.G3(2.5f, l3Var, null);
                        org.telegram.ui.Cells.l3 l3Var2 = kl0Var2.S;
                        l3Var2.a.setText("");
                        l3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error5.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String M02 = org.telegram.messenger.id.M0(R.string.AppName, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        kl0Var2.L0(M02, org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, objArr));
                        break;
                    } else {
                        kl0Var2.L0(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error5.text);
                        break;
                    }
                } else if (kl0Var2.getParentActivity() != null) {
                    lk0 lk0Var = kl0Var2.d0;
                    if (lk0Var != null) {
                        org.telegram.messenger.g0.r(lk0Var);
                        kl0Var2.d0 = null;
                    }
                    kl0Var2.z0();
                    break;
                }
                break;
            case 26:
                kl0.b0((kl0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 27:
                kl0 kl0Var3 = (kl0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Object parentActivity = kl0Var3.getParentActivity();
                Object obj = parentActivity;
                if (parentActivity == null) {
                    obj = org.telegram.messenger.t0.b;
                }
                if (obj == null) {
                    obj = LaunchActivity.G1;
                }
                if (obj != null) {
                    kl0Var3.a1 = true;
                    kl0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = kl0Var3.b1;
                    boolean z9 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z10 = z9 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z11 = z9 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z9 && (jl0Var2 = kl0Var3.Z0) != null) {
                        jl0Var2.b(1);
                    }
                    kl0Var3.z0();
                    if (z9 && (jl0Var = kl0Var3.Z0) != null) {
                        jl0Var.b(kl0Var3.f1);
                    }
                    long w02 = kl0Var3.w0();
                    if (w02 > 0) {
                        str = org.telegram.messenger.t10.k(kl0Var3.getMessagesController().a2(Long.valueOf(w02)));
                    } else if (w02 < 0) {
                        char c11 = 0;
                        TLRPC.Chat M03 = kl0Var3.getMessagesController().M0(Long.valueOf(-w02));
                        r16 = c11;
                        if (M03 != null) {
                            str = M03.title;
                            r16 = c11;
                        }
                        long v02 = kl0Var3.v0();
                        int i23 = !z9 ? (z10 || z11) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String M04 = z9 ? null : org.telegram.messenger.id.M0(z11 ? 2131745092 : z10 ? 2131745100 : 2131745159, null);
                        if (z9) {
                            String str7 = kl0Var3.R0[r16];
                            String str8 = kl0Var3.q0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r16] = str7;
                            objArr2[1] = str8;
                            a02 = org.telegram.messenger.id.a0(null, null, 2131747401, objArr2);
                        } else if (z11) {
                            a02 = org.telegram.messenger.id.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                        } else {
                            String str9 = z10 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            int i24 = (int) v02;
                            Object[] objArr3 = new Object[1];
                            objArr3[r16] = str;
                            a02 = org.telegram.messenger.id.K(str9, i24, ',', objArr3);
                        }
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a02);
                        T = LaunchActivity.T();
                        if (T == null) {
                            org.telegram.ui.Components.gc a03 = org.telegram.ui.Components.gc.a0(T);
                            if (w02 == 0 || M04 == null || z11) {
                                String str10 = M04;
                                I = str10 != null ? a03.I(i23, str10, X2) : a03.Q(i23, 36, X2);
                            } else {
                                I = a03.L(i23, M04, X2, org.telegram.messenger.id.M0(2131743552, null), new bi.k4(w02, i12));
                            }
                            org.telegram.ui.Components.bc bcVar = I;
                            boolean z12 = r16;
                            bcVar.r = z12;
                            bcVar.j = 5000;
                            if (messageArr[z12 ? 1 : 0] != null) {
                                di.r3 r3Var = new di.r3(kl0Var3, bcVar, z10, messageArr, 3);
                                org.telegram.ui.Components.fb fbVar = bcVar.e;
                                if (fbVar != null) {
                                    fbVar.setOnClickListener(r3Var);
                                }
                            }
                            bcVar.k(z11);
                            break;
                        }
                    }
                    r16 = 0;
                    long v022 = kl0Var3.v0();
                    int i232 = !z9 ? (z10 || z11) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z9) {
                    }
                    if (z9) {
                    }
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(a02);
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                wy0.d1(photoViewer.E, photoViewer.l4, false, (di.b) this.c, null);
                break;
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                hp0 hp0Var = (hp0) this.c;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (hp0Var.getWindow() != null) {
                    hp0Var.A0(true);
                    cn cnVar = photoViewer2.k4;
                    if (cnVar != null && (sjVar = cnVar.Z) != null) {
                        sjVar.k0(false);
                        break;
                    }
                }
                break;
        }
    }
}
