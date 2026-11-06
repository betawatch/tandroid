package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zc0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int i10;
        char c10;
        String G;
        ?? r15;
        String a02;
        org.telegram.ui.ActionBar.f2 T;
        org.telegram.ui.Components.cc I;
        gl0 gl0Var;
        gl0 gl0Var2;
        qj qjVar;
        int i11 = 4;
        String str = "";
        int i12 = 2;
        switch (this.a) {
            case 0:
                gd0 gd0Var = (gd0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(2131752579, null);
                alertDialog$Builder.a.T = org.telegram.messenger.hd.a0("CancelLinkSuccess", null, 2131752580, org.telegram.messenger.k5.i(new StringBuilder("+"), gd0Var.b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                alertDialog$Builder.a.setOnDismissListener(new cd0(gd0Var, 0));
                alertDialog$Builder.p();
                break;
            case 1:
                gd0 gd0Var2 = (gd0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                gd0Var2.getClass();
                gd0Var2.g0 = tL_error.text;
                break;
            case 2:
                ((gd0) this.b).u0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 3:
                gd0 gd0Var3 = (gd0) this.b;
                Runnable runnable = (Runnable) this.c;
                yq yqVar = gd0Var3.f;
                int i13 = 0;
                while (true) {
                    br[] brVarArr = yqVar.f;
                    if (i13 >= brVarArr.length) {
                        runnable.run();
                        yqVar.e = false;
                        break;
                    } else {
                        brVarArr[i13].C(0.0f);
                        i13++;
                    }
                }
            case 4:
                ((r3) this.b).a((String) this.c);
                break;
            case 5:
                be0 be0Var = (be0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ce0 ce0Var = be0Var.g0;
                SharedPreferences e12 = org.telegram.messenger.qp.e1();
                if (!e12.getBoolean("firstloginshow", true) && !ce0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ce0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    e12.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ce0Var.getParentActivity());
                    int i14 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.k6.x0(null, i14, false), null);
                    alertDialog$Builder2.n(i14, null);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131751771, "Continue"), null);
                    String M0 = org.telegram.messenger.hd.M0(2131754278, "AllowFillNumber");
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.a;
                    u1Var.T = M0;
                    ce0Var.n = ce0Var.showDialog(u1Var, true, null);
                    ce0Var.c0 = true;
                    break;
                }
                break;
            case 6:
                be0 be0Var2 = (be0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                if (be0Var2.o()) {
                    org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, be0Var2.getContext(), null);
                    u1Var2.setOnCancelListener(new vf(cancellationTokenSource, i11));
                    u1Var2.show();
                    be0Var2.b0 = u1Var2;
                    break;
                }
                break;
            case 7:
                ee0.Z((ee0) this.b, (org.telegram.ui.ActionBar.u1) this.c);
                break;
            case 8:
                cf0 cf0Var = (cf0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                cf0Var.c0 = false;
                if (tL_error2 == null) {
                    ue0 l02 = cf0Var.l0();
                    cf0Var.j0.clear();
                    cf0Var.n0(l02);
                    break;
                }
                break;
            case 9:
                te0 te0Var = (te0) this.b;
                TLObject tLObject = (TLObject) this.c;
                cf0 cf0Var2 = te0Var.a;
                ue0 l03 = cf0Var2.l0();
                cf0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = cf0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    cf0Var2.getMessagesStorage().w1(cf0Var2.d.invitesCount, cf0Var2.n);
                }
                cf0Var2.n0(l03);
                break;
            case 10:
                jg0 jg0Var = (jg0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (jg0Var.getParentActivity() != null) {
                    Toast.makeText(jg0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 11:
                ah0 ah0Var = (ah0) this.b;
                String str2 = (String) this.c;
                ah0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", org.telegram.messenger.hd.a0(null, null, 2131749115, "https://telegram.org/dl"));
                ah0Var.getContext().startActivity(intent);
                break;
            case 12:
                ah0 ah0Var2 = (ah0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ah0Var2.dismiss();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.A4(user.id));
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Components.ex) this.b).a((TLRPC.User) this.c);
                break;
            case 14:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 15:
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                v2VarArr[0] = null;
                bi0.a = null;
                zArr[0] = true;
                break;
            case 16:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (br brVar : passcodeActivity.n.f) {
                    brVar.C(0.0f);
                }
                runnable2.run();
                break;
            case 17:
                hi0 hi0Var = (hi0) this.b;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) hi0Var.c;
                z0Var.setText(org.telegram.messenger.hd.M0(passcodeActivity2.D == 0 ? 2131747652 : 2131747653, null));
                z0Var.setIcon(passcodeActivity2.D == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.y0();
                if (passcodeActivity2.s0()) {
                    passcodeActivity2.h.setInputType(524417);
                    org.telegram.messenger.g0.Z3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 18:
                ((PasskeysActivity) this.b).d0((TL_account.Passkey) this.c);
                break;
            case 19:
                bk0 bk0Var = (bk0) this.b;
                org.telegram.messenger.zr zrVar = (org.telegram.messenger.zr) this.c;
                int[] iArr = bk0Var.y;
                int i15 = zrVar.a;
                if (i15 == 2) {
                    if (!(bk0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = bk0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) bk0Var.G.get(i16);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    bk0Var.F = tL_secureRequiredType;
                                    bk0Var.U1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i15 == 1) {
                    if (!(bk0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = bk0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) bk0Var.G.get(i17);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    bk0Var.F = tL_secureRequiredType2;
                                    bk0Var.U1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i15 == 3) {
                    if (!(bk0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = bk0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) bk0Var.G.get(i18);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    bk0Var.F = tL_secureRequiredType3;
                                    bk0Var.U1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i15 == 4 && !(bk0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = bk0Var.G.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) bk0Var.G.get(i19);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                bk0Var.F = tL_secureRequiredType4;
                                bk0Var.U1();
                            } else {
                                i19++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(zrVar.b)) {
                    bk0Var.Y[0].setText(zrVar.b);
                }
                if (!TextUtils.isEmpty(zrVar.d)) {
                    bk0Var.Y[1].setText(zrVar.d);
                }
                if (!TextUtils.isEmpty(zrVar.c)) {
                    bk0Var.Y[2].setText(zrVar.c);
                }
                if (!TextUtils.isEmpty(zrVar.e)) {
                    bk0Var.Y[7].setText(zrVar.e);
                }
                int i20 = zrVar.n;
                if (i20 != 0) {
                    if (i20 == 1) {
                        bk0Var.x = "male";
                        bk0Var.Y[4].setText(org.telegram.messenger.hd.M0(2131747507, null));
                    } else if (i20 == 2) {
                        bk0Var.x = "female";
                        bk0Var.Y[4].setText(org.telegram.messenger.hd.M0(2131747568, null));
                    }
                }
                if (!TextUtils.isEmpty(zrVar.m)) {
                    String str3 = zrVar.m;
                    bk0Var.s = str3;
                    String str4 = (String) bk0Var.Y0.get(str3);
                    if (str4 != null) {
                        bk0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(zrVar.l)) {
                    String str5 = zrVar.l;
                    bk0Var.w = str5;
                    String str6 = (String) bk0Var.Y0.get(str5);
                    if (str6 != null) {
                        bk0Var.Y[6].setText(str6);
                    }
                }
                int i21 = zrVar.k;
                if (i21 > 0 && zrVar.j > 0 && zrVar.i > 0) {
                    bk0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(zrVar.j), Integer.valueOf(zrVar.i)));
                }
                int i22 = zrVar.h;
                if (i22 <= 0 || (i7 = zrVar.g) <= 0 || (i10 = zrVar.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    bk0Var.Y[8].setText(org.telegram.messenger.hd.M0(2131747493, null));
                    break;
                } else {
                    iArr[0] = i10;
                    iArr[1] = i7;
                    iArr[2] = i22;
                    bk0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(zrVar.g), Integer.valueOf(zrVar.f)));
                    break;
                }
                break;
            case 20:
                bk0 bk0Var2 = (bk0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    bk0Var2.J = password;
                    if (TwoStepVerificationActivity.n0(password, false)) {
                        TwoStepVerificationActivity.r0(bk0Var2.J);
                        bk0Var2.W1();
                        if (bk0Var2.Z[0].getVisibility() == 0) {
                            bk0Var2.Y[0].requestFocus();
                            org.telegram.messenger.g0.K3(bk0Var2.Y[0]);
                        }
                        if (bk0Var2.N0 == 1) {
                            bk0Var2.F1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.v4.u0(bk0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
                        break;
                    }
                }
                break;
            case 21:
                bk0 bk0Var3 = (bk0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                if (tL_error3 == null) {
                    bk0Var3.f1 = true;
                    bk0Var3.a1(true);
                    bk0Var3.finishFragment();
                    break;
                } else {
                    bk0Var3.R1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error3.text)) {
                        org.telegram.ui.Components.v4.u0(bk0Var3.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
                        break;
                    } else {
                        bk0Var3.Q1(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error3.text);
                        break;
                    }
                }
            case 22:
                ((wj0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 23:
                hl0 hl0Var = (hl0) this.b;
                View view = (View) this.c;
                hl0Var.J0(false);
                view.callOnClick();
                break;
            case 24:
                hl0 hl0Var2 = (hl0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                hl0Var2.N0(true, false);
                if (tL_error4 != null) {
                    if (tL_error4.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.l3 l3Var = hl0Var2.S;
                        try {
                            l3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.G3(2.5f, l3Var, null);
                        org.telegram.ui.Cells.l3 l3Var2 = hl0Var2.S;
                        l3Var2.a.setText("");
                        l3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error4.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String M02 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        hl0Var2.L0(M02, org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, objArr));
                        break;
                    } else {
                        hl0Var2.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error4.text);
                        break;
                    }
                } else if (hl0Var2.getParentActivity() != null) {
                    ik0 ik0Var = hl0Var2.d0;
                    if (ik0Var != null) {
                        org.telegram.messenger.g0.r(ik0Var);
                        hl0Var2.d0 = null;
                    }
                    hl0Var2.z0();
                    break;
                }
                break;
            case 25:
                hl0.b0((hl0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 26:
                hl0 hl0Var3 = (hl0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Object parentActivity = hl0Var3.getParentActivity();
                Object obj = parentActivity;
                if (parentActivity == null) {
                    obj = org.telegram.messenger.t0.b;
                }
                if (obj == null) {
                    obj = LaunchActivity.G1;
                }
                if (obj != null) {
                    hl0Var3.a1 = true;
                    hl0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = hl0Var3.b1;
                    boolean z9 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z10 = z9 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z11 = z9 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z9 && (gl0Var2 = hl0Var3.Z0) != null) {
                        gl0Var2.b(1);
                    }
                    hl0Var3.z0();
                    if (z9 && (gl0Var = hl0Var3.Z0) != null) {
                        gl0Var.b(hl0Var3.f1);
                    }
                    long w02 = hl0Var3.w0();
                    if (w02 > 0) {
                        str = org.telegram.messenger.t10.k(hl0Var3.getMessagesController().a2(Long.valueOf(w02)));
                    } else if (w02 < 0) {
                        char c11 = 0;
                        TLRPC.Chat M03 = hl0Var3.getMessagesController().M0(Long.valueOf(-w02));
                        r15 = c11;
                        if (M03 != null) {
                            str = M03.title;
                            r15 = c11;
                        }
                        long v02 = hl0Var3.v0();
                        int i23 = !z9 ? (z10 || z11) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String M04 = z9 ? null : org.telegram.messenger.hd.M0(z11 ? 2131745093 : z10 ? 2131745101 : 2131745160, null);
                        if (z9) {
                            String str7 = hl0Var3.R0[r15];
                            String str8 = hl0Var3.q0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r15] = str7;
                            objArr2[1] = str8;
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131747400, objArr2);
                        } else if (z11) {
                            a02 = org.telegram.messenger.hd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                        } else {
                            String str9 = z10 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[r15] = str;
                            a02 = org.telegram.messenger.hd.K(str9, (int) v02, ',', objArr3);
                        }
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a02);
                        T = LaunchActivity.T();
                        if (T == null) {
                            org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(T);
                            if (w02 == 0 || M04 == null || z11) {
                                String str10 = M04;
                                I = str10 != null ? a03.I(i23, str10, X2) : a03.Q(i23, 36, X2);
                            } else {
                                I = a03.L(i23, M04, X2, org.telegram.messenger.hd.M0(2131743553, null), new bi.k4(w02, i12));
                            }
                            boolean z12 = r15;
                            org.telegram.ui.Components.cc ccVar = I;
                            ccVar.r = z12;
                            ccVar.j = 5000;
                            if (messageArr[z12 ? 1 : 0] != null) {
                                di.r3 r3Var = new di.r3(hl0Var3, ccVar, z10, messageArr, 3);
                                org.telegram.ui.Components.gb gbVar = ccVar.e;
                                if (gbVar != null) {
                                    gbVar.setOnClickListener(r3Var);
                                }
                            }
                            ccVar.k(z11);
                            break;
                        }
                    }
                    r15 = 0;
                    long v022 = hl0Var3.v0();
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
            case 27:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                sy0.d1(photoViewer.E, photoViewer.l4, false, (di.b) this.c, null);
                break;
            case 28:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ep0 ep0Var = (ep0) this.c;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (ep0Var.getWindow() != null) {
                    ep0Var.A0(true);
                    an anVar = photoViewer2.k4;
                    if (anVar != null && (qjVar = anVar.Z) != null) {
                        qjVar.k0(false);
                        break;
                    }
                }
                break;
            default:
                bi.r2 r2Var = (bi.r2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                r2Var.a(bitmap);
                break;
        }
    }
}
