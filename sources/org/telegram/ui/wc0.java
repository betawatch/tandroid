package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wc0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 7;
        int i15 = 2;
        int i16 = 0;
        switch (this.a) {
            case 0:
                nd0 nd0Var = (nd0) this.b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new br(nd0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 1:
                nd0 nd0Var2 = (nd0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                nd0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                nd0Var2.d0(sharingLocationInfo.proximityMeters);
                nd0Var2.G = false;
                break;
            case 2:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.eo) this.c);
                break;
            case 3:
                le0 le0Var = (le0) this.b;
                Runnable runnable = (Runnable) this.c;
                ie0 ie0Var = le0Var.a;
                int i17 = 0;
                while (true) {
                    ks[] ksVarArr = ie0Var.f;
                    if (i17 >= ksVarArr.length) {
                        runnable.run();
                        ie0Var.e = false;
                        break;
                    } else {
                        ksVarArr[i17].l(0.0f);
                        i17++;
                    }
                }
            case 4:
                ue0 ue0Var = (ue0) this.b;
                TLObject tLObject = (TLObject) this.c;
                bh0 bh0Var = ue0Var.y;
                bh0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(ue0Var.a);
                bh0Var.o1((TLRPC.TL_auth_authorization) tLObject, false);
                break;
            case 5:
                ue0 ue0Var2 = (ue0) this.b;
                String str = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ue0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                se0 se0Var = new se0(ue0Var2, i15);
                if (z10) {
                    TL_account.Password password = ue0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck != null) {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.m2) ue0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, se0Var, 10);
                        break;
                    } else {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        se0Var.run(null, tL_error);
                        break;
                    }
                }
                break;
            case 6:
                mf0 mf0Var = (mf0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                mf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(mf0Var.O.fragmentView.findFocus());
                mf0Var.O.o1((TLRPC.TL_auth_authorization) tLObject2, true);
                TLRPC.FileLocation fileLocation = mf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new wc0(i14, mf0Var, fileLocation));
                    break;
                }
                break;
            case 7:
                mf0 mf0Var2 = (mf0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.m2) mf0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 8:
                nf0 nf0Var = (nf0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                bh0 bh0Var2 = nf0Var.E;
                bh0Var2.k1(false, true);
                if (tL_error2 != null) {
                    if (!tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                        break;
                    } else {
                        bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                        break;
                    }
                } else if (nf0Var.r != null && nf0Var.s != null && nf0Var.v != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", nf0Var.r);
                    bundle.putString("phoneHash", nf0Var.s);
                    bundle.putString("code", nf0Var.v);
                    bh0Var2.u1(5, true, bundle, false);
                    break;
                } else {
                    bh0Var2.u1(0, true, null, true);
                    break;
                }
            case 9:
                eg0 eg0Var = (eg0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.yh.g(new StringBuilder("+"), eg0Var.b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new ag0(eg0Var, i16));
                alertDialog$Builder.o();
                break;
            case 10:
                eg0 eg0Var2 = (eg0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                eg0Var2.getClass();
                eg0Var2.e0 = tL_error3.text;
                break;
            case 11:
                ((eg0) this.b).s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 12:
                eg0 eg0Var3 = (eg0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                hs hsVar = eg0Var3.f;
                int i18 = 0;
                while (true) {
                    ks[] ksVarArr2 = hsVar.f;
                    if (i18 >= ksVarArr2.length) {
                        runnable2.run();
                        hsVar.e = false;
                        break;
                    } else {
                        ksVarArr2[i18].l(0.0f);
                        i18++;
                    }
                }
            case 13:
                ((v3) this.b).run((String) this.c);
                break;
            case 14:
                ah0 ah0Var = (ah0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                bh0 bh0Var3 = ah0Var.V;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !bh0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    bh0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bh0Var3.getParentActivity());
                    alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                    alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                    String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.a;
                    a2Var.T = string;
                    bh0Var3.n = bh0Var3.showDialog(a2Var, true, null);
                    bh0Var3.c0 = true;
                    break;
                }
            case 15:
                eh0.V((eh0) this.b, (org.telegram.ui.ActionBar.a2) this.c);
                break;
            case 16:
                ei0 ei0Var = (ei0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                ei0Var.c0 = false;
                if (tL_error4 == null) {
                    vh0 f02 = ei0Var.f0();
                    ei0Var.j0.clear();
                    ei0Var.h0(f02);
                    break;
                }
                break;
            case 17:
                uh0 uh0Var = (uh0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ei0 ei0Var2 = uh0Var.a;
                vh0 f03 = ei0Var2.f0();
                ei0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject3);
                TLRPC.ChatFull chatFull = ei0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ei0Var2.getMessagesStorage().saveChatLinksCount(ei0Var2.n, ei0Var2.d.invitesCount);
                }
                ei0Var2.h0(f03);
                break;
            case 18:
                qj0 qj0Var = (qj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (qj0Var.getParentActivity() != null) {
                    Toast.makeText(qj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 19:
                ik0 ik0Var = (ik0) this.b;
                String str2 = (String) this.c;
                ik0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ik0Var.getContext().startActivity(intent);
                break;
            case 20:
                ik0 ik0Var2 = (ik0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ik0Var2.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 21:
                ((mt) this.b).run((TLRPC.User) this.c);
                break;
            case 22:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 23:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                e3VarArr[0] = null;
                rl0.a = null;
                zArr[0] = true;
                break;
            case 24:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable3 = (Runnable) this.c;
                ks[] ksVarArr3 = passcodeActivity.n.f;
                int length = ksVarArr3.length;
                while (i16 < length) {
                    ksVarArr3[i16].l(0.0f);
                    i16++;
                }
                runnable3.run();
                break;
            case 25:
                wl0 wl0Var = (wl0) this.b;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                PasscodeActivity passcodeActivity2 = wl0Var.b;
                e1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                e1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.n0();
                if (passcodeActivity2.h0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 26:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 27:
                un0 un0Var = (un0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = un0Var.x;
                int i19 = result.type;
                if (i19 == 2) {
                    if (!(un0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = un0Var.G.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) un0Var.G.get(i20);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    un0Var.F = tL_secureRequiredType;
                                    un0Var.O1();
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                } else if (i19 == 1) {
                    if (!(un0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = un0Var.G.size();
                        int i21 = 0;
                        while (true) {
                            if (i21 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) un0Var.G.get(i21);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    un0Var.F = tL_secureRequiredType2;
                                    un0Var.O1();
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                } else if (i19 == 3) {
                    if (!(un0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = un0Var.G.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) un0Var.G.get(i22);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    un0Var.F = tL_secureRequiredType3;
                                    un0Var.O1();
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                } else if (i19 == 4 && !(un0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = un0Var.G.size();
                    int i23 = 0;
                    while (true) {
                        if (i23 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) un0Var.G.get(i23);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                un0Var.F = tL_secureRequiredType4;
                                un0Var.O1();
                            } else {
                                i23++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    un0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    un0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    un0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    un0Var.Y[7].setText(result.number);
                }
                int i24 = result.gender;
                if (i24 != 0) {
                    if (i24 == 1) {
                        un0Var.w = "male";
                        un0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i24 == 2) {
                        un0Var.w = "female";
                        un0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    un0Var.s = str3;
                    String str4 = (String) un0Var.Y0.get(str3);
                    if (str4 != null) {
                        un0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    un0Var.v = str5;
                    String str6 = (String) un0Var.Y0.get(str5);
                    if (str6 != null) {
                        un0Var.Y[6].setText(str6);
                    }
                }
                int i25 = result.birthDay;
                if (i25 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    un0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i25), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i26 = result.expiryDay;
                if (i26 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i26;
                    un0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i26), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    un0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
            case 28:
                un0 un0Var2 = (un0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 != null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject4;
                    un0Var2.J = password2;
                    if (!TwoStepVerificationActivity.i0(password2, false)) {
                        org.telegram.ui.Components.g5.w0(un0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.m0(un0Var2.J);
                        un0Var2.Q1();
                        if (un0Var2.Z[0].getVisibility() == 0) {
                            un0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(un0Var2.Y[0]);
                        }
                        if (un0Var2.N0 == 1) {
                            un0Var2.A1(true);
                            break;
                        }
                    }
                }
                break;
            default:
                un0 un0Var3 = (un0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                if (tL_error5 != null) {
                    un0Var3.M1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error5.text)) {
                        un0Var3.L1(LocaleController.getString(R.string.AppName), tL_error5.text);
                        break;
                    } else {
                        org.telegram.ui.Components.g5.w0(un0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    un0Var3.f1 = true;
                    un0Var3.V0(true);
                    un0Var3.finishFragment();
                    break;
                }
        }
    }
}
