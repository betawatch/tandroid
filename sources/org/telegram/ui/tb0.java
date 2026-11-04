package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 3;
        int i15 = 0;
        switch (this.a) {
            case 0:
                vb0 vb0Var = (vb0) this.b;
                TLObject tLObject = (TLObject) this.c;
                xd0 xd0Var = vb0Var.E;
                xd0Var.t1(false, false);
                org.telegram.messenger.g0.v1(vb0Var.a);
                xd0Var.x1((TLRPC.TL_auth_authorization) tLObject, false);
                break;
            case 1:
                vb0 vb0Var2 = (vb0) this.b;
                String str = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = vb0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] c2 = z10 ? org.telegram.messenger.hv.c(org.telegram.messenger.g0.h1(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                sb0 sb0Var = new sb0(vb0Var2, i13);
                if (z10) {
                    TL_account.Password password = vb0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.hv.d(c2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d != null) {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = d;
                        i3 = ((org.telegram.ui.ActionBar.d2) vb0Var2.E).currentAccount;
                        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_checkPassword, sb0Var, 10);
                        break;
                    } else {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        sb0Var.run(null, tL_error);
                        break;
                    }
                }
                break;
            case 2:
                nc0 nc0Var = (nc0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                nc0Var.P.t1(false, false);
                org.telegram.messenger.g0.v1(nc0Var.P.fragmentView.findFocus());
                nc0Var.P.x1((TLRPC.TL_auth_authorization) tLObject2, true);
                TLRPC.FileLocation fileLocation = nc0Var.O;
                if (fileLocation != null) {
                    Utilities.f.c(new tb0(i14, nc0Var, fileLocation));
                    break;
                }
                break;
            case 3:
                nc0 nc0Var2 = (nc0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i10 = ((org.telegram.ui.ActionBar.d2) nc0Var2.P).currentAccount;
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
                if (fileLocation2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(org.telegram.messenger.w7.z(4));
                    sb2.append("/");
                    sb2.append(fileLocation2.volume_id);
                    sb2.append("_");
                    s12.O2 = a1.g.o(fileLocation2.local_id, ".jpg", sb2);
                    s12.getFileLoader().i0(false, 16777216, s12.O2, true);
                    break;
                }
                break;
            case 4:
                oc0 oc0Var = (oc0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                xd0 xd0Var2 = oc0Var.H;
                xd0Var2.t1(false, true);
                if (tL_error2 != null) {
                    if (!tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                        break;
                    } else {
                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131746125, "ResetAccountCancelledAlert"));
                        break;
                    }
                } else if (oc0Var.r != null && oc0Var.s != null && oc0Var.w != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", oc0Var.r);
                    bundle.putString("phoneHash", oc0Var.s);
                    bundle.putString("code", oc0Var.w);
                    xd0Var2.D1(5, true, bundle, false);
                    break;
                } else {
                    xd0Var2.D1(0, true, null, true);
                    break;
                }
                break;
            case 5:
                dd0 dd0Var = (dd0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131752579, null);
                alertDialog$Builder.a.U = org.telegram.messenger.bd.a0("CancelLinkSuccess", null, 2131752580, org.telegram.messenger.k5.i(new StringBuilder("+"), dd0Var.b, mf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752041, null), null);
                alertDialog$Builder.a.setOnDismissListener(new zc0(dd0Var, i15));
                alertDialog$Builder.p();
                break;
            case 6:
                dd0 dd0Var2 = (dd0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                dd0Var2.getClass();
                dd0Var2.h0 = tL_error3.text;
                break;
            case 7:
                ((dd0) this.b).v0.x1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 8:
                dd0 dd0Var3 = (dd0) this.b;
                Runnable runnable = (Runnable) this.c;
                xq xqVar = dd0Var3.f;
                int i16 = 0;
                while (true) {
                    zq[] zqVarArr = xqVar.f;
                    if (i16 >= zqVarArr.length) {
                        runnable.run();
                        xqVar.e = false;
                        break;
                    } else {
                        zqVarArr[i16].C(0.0f);
                        i16++;
                    }
                }
            case 9:
                ((s3) this.b).a((String) this.c);
                break;
            case 10:
                wd0 wd0Var = (wd0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                xd0 xd0Var3 = wd0Var.b0;
                SharedPreferences e12 = org.telegram.messenger.hp.e1();
                if (!e12.getBoolean("firstloginshow", true) && !xd0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    xd0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    e12.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xd0Var3.getParentActivity());
                    int i17 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.k6.x0(null, i17, false), null);
                    alertDialog$Builder2.n(i17, null);
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751771, "Continue"), null);
                    String M0 = org.telegram.messenger.bd.M0(2131754278, "AllowFillNumber");
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.a;
                    s1Var.U = M0;
                    xd0Var3.n = xd0Var3.showDialog(s1Var, true, null);
                    xd0Var3.d0 = true;
                    break;
                }
            case 11:
                zd0.Z((zd0) this.b, (org.telegram.ui.ActionBar.s1) this.c);
                break;
            case 12:
                xe0 xe0Var = (xe0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                xe0Var.d0 = false;
                if (tL_error4 == null) {
                    pe0 l02 = xe0Var.l0();
                    xe0Var.k0.clear();
                    xe0Var.n0(l02);
                    break;
                }
                break;
            case 13:
                oe0 oe0Var = (oe0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                xe0 xe0Var2 = oe0Var.a;
                pe0 l03 = xe0Var2.l0();
                xe0Var2.j0.add(0, (TLRPC.TL_chatInviteExported) tLObject3);
                TLRPC.ChatFull chatFull = xe0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    xe0Var2.getMessagesStorage().w1(xe0Var2.d.invitesCount, xe0Var2.n);
                }
                xe0Var2.n0(l03);
                break;
            case 14:
                dg0 dg0Var = (dg0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (dg0Var.getParentActivity() != null) {
                    Toast.makeText(dg0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 15:
                vg0 vg0Var = (vg0) this.b;
                String str2 = (String) this.c;
                vg0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", org.telegram.messenger.bd.a0(null, null, 2131749124, "https://telegram.org/dl"));
                vg0Var.getContext().startActivity(intent);
                break;
            case 16:
                vg0 vg0Var2 = (vg0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                vg0Var2.dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.A4(user.id));
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Components.ei) this.b).a((TLRPC.User) this.c);
                break;
            case 18:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 19:
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                t2VarArr[0] = null;
                yh0.a = null;
                zArr[0] = true;
                break;
            case 20:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                zq[] zqVarArr2 = passcodeActivity.n.f;
                int length = zqVarArr2.length;
                while (i15 < length) {
                    zqVarArr2[i15].C(0.0f);
                    i15++;
                }
                runnable2.run();
                break;
            case 21:
                fi0 fi0Var = (fi0) this.b;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) fi0Var.c;
                y0Var.setText(org.telegram.messenger.bd.M0(passcodeActivity2.E == 0 ? 2131747661 : 2131747662, null));
                y0Var.setIcon(passcodeActivity2.E == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.y0();
                if (passcodeActivity2.s0()) {
                    passcodeActivity2.h.setInputType(524417);
                    org.telegram.messenger.g0.Z3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 22:
                ((PasskeysActivity) this.b).d0((TL_account.Passkey) this.c);
                break;
            case 23:
                yj0 yj0Var = (yj0) this.b;
                org.telegram.messenger.rr rrVar = (org.telegram.messenger.rr) this.c;
                int[] iArr = yj0Var.y;
                int i18 = rrVar.a;
                if (i18 == 2) {
                    if (!(yj0Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = yj0Var.H.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) yj0Var.H.get(i19);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    yj0Var.G = tL_secureRequiredType;
                                    yj0Var.U1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i18 == 1) {
                    if (!(yj0Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = yj0Var.H.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) yj0Var.H.get(i20);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    yj0Var.G = tL_secureRequiredType2;
                                    yj0Var.U1();
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                } else if (i18 == 3) {
                    if (!(yj0Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = yj0Var.H.size();
                        int i21 = 0;
                        while (true) {
                            if (i21 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) yj0Var.H.get(i21);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    yj0Var.G = tL_secureRequiredType3;
                                    yj0Var.U1();
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                } else if (i18 == 4 && !(yj0Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = yj0Var.H.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) yj0Var.H.get(i22);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                yj0Var.G = tL_secureRequiredType4;
                                yj0Var.U1();
                            } else {
                                i22++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(rrVar.b)) {
                    yj0Var.Z[0].setText(rrVar.b);
                }
                if (!TextUtils.isEmpty(rrVar.d)) {
                    yj0Var.Z[1].setText(rrVar.d);
                }
                if (!TextUtils.isEmpty(rrVar.c)) {
                    yj0Var.Z[2].setText(rrVar.c);
                }
                if (!TextUtils.isEmpty(rrVar.e)) {
                    yj0Var.Z[7].setText(rrVar.e);
                }
                int i23 = rrVar.n;
                if (i23 != 0) {
                    if (i23 == 1) {
                        yj0Var.x = "male";
                        yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747516, null));
                    } else if (i23 == 2) {
                        yj0Var.x = "female";
                        yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747577, null));
                    }
                }
                if (!TextUtils.isEmpty(rrVar.m)) {
                    String str3 = rrVar.m;
                    yj0Var.s = str3;
                    String str4 = (String) yj0Var.Z0.get(str3);
                    if (str4 != null) {
                        yj0Var.Z[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(rrVar.l)) {
                    String str5 = rrVar.l;
                    yj0Var.w = str5;
                    String str6 = (String) yj0Var.Z0.get(str5);
                    if (str6 != null) {
                        yj0Var.Z[6].setText(str6);
                    }
                }
                int i24 = rrVar.k;
                if (i24 > 0 && rrVar.j > 0 && rrVar.i > 0) {
                    yj0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i24), Integer.valueOf(rrVar.j), Integer.valueOf(rrVar.i)));
                }
                int i25 = rrVar.h;
                if (i25 > 0 && (i11 = rrVar.g) > 0 && (i12 = rrVar.f) > 0) {
                    iArr[0] = i12;
                    iArr[1] = i11;
                    iArr[2] = i25;
                    yj0Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i25), Integer.valueOf(rrVar.g), Integer.valueOf(rrVar.f)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    yj0Var.Z[8].setText(org.telegram.messenger.bd.M0(2131747502, null));
                    break;
                }
                break;
            case 24:
                yj0 yj0Var2 = (yj0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 != null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject4;
                    yj0Var2.K = password2;
                    if (!TwoStepVerificationActivity.n0(password2, false)) {
                        org.telegram.ui.Components.t4.w0(yj0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.r0(yj0Var2.K);
                        yj0Var2.W1();
                        if (yj0Var2.a0[0].getVisibility() == 0) {
                            yj0Var2.Z[0].requestFocus();
                            org.telegram.messenger.g0.K3(yj0Var2.Z[0]);
                        }
                        if (yj0Var2.O0 == 1) {
                            yj0Var2.F1(true);
                            break;
                        }
                    }
                }
                break;
            case 25:
                yj0 yj0Var3 = (yj0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                if (tL_error5 != null) {
                    yj0Var3.R1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error5.text)) {
                        yj0Var3.Q1(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error5.text);
                        break;
                    } else {
                        org.telegram.ui.Components.t4.w0(yj0Var3.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                        break;
                    }
                } else {
                    yj0Var3.g1 = true;
                    yj0Var3.a1(true);
                    yj0Var3.finishFragment();
                    break;
                }
            case 26:
                ((tj0) this.b).a.L = ((TLRPC.TL_error) this.c).text;
                break;
            case 27:
                dl0 dl0Var = (dl0) this.b;
                View view = (View) this.c;
                dl0Var.J0(false);
                view.callOnClick();
                break;
            case 28:
                dl0 dl0Var2 = (dl0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                dl0Var2.N0(true, false);
                if (tL_error6 != null) {
                    if (!tL_error6.text.startsWith("CODE_INVALID")) {
                        if (!tL_error6.text.startsWith("FLOOD_WAIT")) {
                            dl0Var2.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error6.text);
                            break;
                        } else {
                            int intValue = Utilities.z(tL_error6.text).intValue();
                            dl0Var2.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.l3 l3Var = dl0Var2.T;
                        try {
                            l3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.G3(2.5f, l3Var, null);
                        org.telegram.ui.Cells.l3 l3Var2 = dl0Var2.T;
                        l3Var2.a.setText("");
                        l3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (dl0Var2.getParentActivity() != null) {
                    ek0 ek0Var = dl0Var2.e0;
                    if (ek0Var != null) {
                        org.telegram.messenger.g0.r(ek0Var);
                        dl0Var2.e0 = null;
                    }
                    dl0Var2.z0();
                    break;
                }
                break;
            default:
                dl0.b0((dl0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
        }
    }
}
