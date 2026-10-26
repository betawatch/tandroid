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
import android.widget.ImageView;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
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
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wb0(int i10, Object obj, Object obj2) {
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
                pc0 pc0Var = (pc0) this.b;
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
                    AndroidUtilities.runOnUIThread(new nq(pc0Var, createBitmap2, gLSurfaceView, 23));
                    break;
                }
                break;
            case 1:
                pc0 pc0Var2 = (pc0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                pc0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                pc0Var2.f0(sharingLocationInfo.proximityMeters);
                pc0Var2.G = false;
                break;
            case 2:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.bo) this.c);
                break;
            case 3:
                od0 od0Var = (od0) this.b;
                Runnable runnable = (Runnable) this.c;
                ld0 ld0Var = od0Var.a;
                int i17 = 0;
                while (true) {
                    xr[] xrVarArr = ld0Var.f;
                    if (i17 >= xrVarArr.length) {
                        runnable.run();
                        ld0Var.e = false;
                        break;
                    } else {
                        xrVarArr[i17].l(0.0f);
                        i17++;
                    }
                }
            case 4:
                yd0 yd0Var = (yd0) this.b;
                TLObject tLObject = (TLObject) this.c;
                gg0 gg0Var = yd0Var.y;
                gg0Var.p1(false, false);
                AndroidUtilities.hideKeyboard(yd0Var.a);
                gg0Var.t1((TLRPC.TL_auth_authorization) tLObject, false);
                break;
            case 5:
                yd0 yd0Var2 = (yd0) this.b;
                String str = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = yd0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x9 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                vd0 vd0Var = new vd0(yd0Var2, i15);
                if (z10) {
                    TL_account.Password password = yd0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x9, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck != null) {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.r2) yd0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, vd0Var, 10);
                        break;
                    } else {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        vd0Var.run(null, tL_error);
                        break;
                    }
                }
                break;
            case 6:
                re0 re0Var = (re0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                re0Var.O.p1(false, false);
                AndroidUtilities.hideKeyboard(re0Var.O.fragmentView.findFocus());
                re0Var.O.t1((TLRPC.TL_auth_authorization) tLObject2, true);
                TLRPC.FileLocation fileLocation = re0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new wb0(i14, re0Var, fileLocation));
                    break;
                }
                break;
            case 7:
                re0 re0Var2 = (re0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.r2) re0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 8:
                se0 se0Var = (se0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                gg0 gg0Var2 = se0Var.G;
                gg0Var2.p1(false, true);
                if (tL_error2 != null) {
                    if (!tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                        break;
                    } else {
                        gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                        break;
                    }
                } else if (se0Var.r != null && se0Var.s != null && se0Var.v != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", se0Var.r);
                    bundle.putString("phoneHash", se0Var.s);
                    bundle.putString("code", se0Var.v);
                    gg0Var2.z1(5, true, bundle, false);
                    break;
                } else {
                    gg0Var2.z1(0, true, null, true);
                    break;
                }
                break;
            case 9:
                jf0 jf0Var = (jf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.vh.g(new StringBuilder("+"), jf0Var.b, kf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new ff0(jf0Var, i16));
                alertDialog$Builder.p();
                break;
            case 10:
                jf0 jf0Var2 = (jf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                jf0Var2.getClass();
                jf0Var2.g0 = tL_error3.text;
                break;
            case 11:
                ((jf0) this.b).u0.t1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 12:
                jf0 jf0Var3 = (jf0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                vr vrVar = jf0Var3.f;
                int i18 = 0;
                while (true) {
                    xr[] xrVarArr2 = vrVar.f;
                    if (i18 >= xrVarArr2.length) {
                        runnable2.run();
                        vrVar.e = false;
                        break;
                    } else {
                        xrVarArr2[i18].l(0.0f);
                        i18++;
                    }
                }
            case 13:
                ((t3) this.b).run((String) this.c);
                break;
            case 14:
                fg0 fg0Var = (fg0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                gg0 gg0Var3 = fg0Var.a0;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !gg0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    gg0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gg0Var3.getParentActivity());
                    int i19 = R.raw.incoming_calls;
                    int i20 = org.telegram.ui.ActionBar.y6.L5;
                    alertDialog$Builder2.m(i19, 46, org.telegram.ui.ActionBar.y6.x0(null, i20, false), null);
                    alertDialog$Builder2.n(i20, null);
                    alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                    String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder2.a;
                    e2Var.T = string;
                    gg0Var3.n = gg0Var3.showDialog(e2Var, true, null);
                    gg0Var3.c0 = true;
                    break;
                }
            case 15:
                jg0.V((jg0) this.b, (org.telegram.ui.ActionBar.e2) this.c);
                break;
            case 16:
                jh0 jh0Var = (jh0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                jh0Var.c0 = false;
                if (tL_error4 == null) {
                    ah0 h02 = jh0Var.h0();
                    jh0Var.j0.clear();
                    jh0Var.j0(h02);
                    break;
                }
                break;
            case 17:
                zg0 zg0Var = (zg0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                jh0 jh0Var2 = zg0Var.a;
                ah0 h03 = jh0Var2.h0();
                jh0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject3);
                TLRPC.ChatFull chatFull = jh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    jh0Var2.getMessagesStorage().saveChatLinksCount(jh0Var2.n, jh0Var2.d.invitesCount);
                }
                jh0Var2.j0(h03);
                break;
            case 18:
                vi0 vi0Var = (vi0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (vi0Var.getParentActivity() != null) {
                    Toast.makeText(vi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 19:
                oj0 oj0Var = (oj0) this.b;
                String str2 = (String) this.c;
                oj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                oj0Var.getContext().startActivity(intent);
                break;
            case 20:
                oj0 oj0Var2 = (oj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                oj0Var2.dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.t4(user.id));
                    break;
                }
                break;
            case 21:
                ((org.telegram.ui.Components.oy) this.b).run((TLRPC.User) this.c);
                break;
            case 22:
                xj0 xj0Var = (xj0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList2 = xj0Var.c;
                vj0[] vj0VarArr = xj0Var.b;
                HashSet hashSet = xj0Var.e;
                HashSet hashSet2 = xj0Var.d;
                if (!xj0Var.h) {
                    xj0Var.n = false;
                    if (!(tLObject4 instanceof TL_feed.TL_interestCategories)) {
                        xj0Var.r = true;
                        xj0.o0(vj0VarArr[0]);
                        break;
                    } else {
                        TL_feed.TL_interestCategories tL_interestCategories = (TL_feed.TL_interestCategories) tLObject4;
                        arrayList2.clear();
                        arrayList2.addAll(tL_interestCategories.categories);
                        if (!xj0Var.f && hashSet2.equals(hashSet)) {
                            hashSet2.clear();
                            hashSet2.addAll(tL_interestCategories.selected);
                            hashSet.clear();
                            hashSet.addAll(tL_interestCategories.selected);
                        }
                        xj0Var.p0(false);
                        xj0.o0(vj0VarArr[0]);
                        break;
                    }
                }
                break;
            case 23:
                xj0.W((xj0) this.b, (ImageView) this.c);
                break;
            case 24:
                NotificationsCustomSettingsActivity.X((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 25:
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                k3VarArr[0] = null;
                dl0.a = null;
                zArr[0] = true;
                break;
            case 26:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable3 = (Runnable) this.c;
                xr[] xrVarArr3 = passcodeActivity.n.f;
                int length = xrVarArr3.length;
                while (i16 < length) {
                    xrVarArr3[i16].l(0.0f);
                    i16++;
                }
                runnable3.run();
                break;
            case 27:
                kl0 kl0Var = (kl0) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                PasscodeActivity passcodeActivity2 = kl0Var.b;
                g1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                g1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.u0();
                if (passcodeActivity2.o0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 28:
                ((PasskeysActivity) this.b).Z((TL_account.Passkey) this.c);
                break;
            default:
                in0 in0Var = (in0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = in0Var.x;
                int i21 = result.type;
                if (i21 == 2) {
                    if (!(in0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = in0Var.G.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) in0Var.G.get(i22);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    in0Var.F = tL_secureRequiredType;
                                    in0Var.Q1();
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                } else if (i21 == 1) {
                    if (!(in0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = in0Var.G.size();
                        int i23 = 0;
                        while (true) {
                            if (i23 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) in0Var.G.get(i23);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    in0Var.F = tL_secureRequiredType2;
                                    in0Var.Q1();
                                } else {
                                    i23++;
                                }
                            }
                        }
                    }
                } else if (i21 == 3) {
                    if (!(in0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = in0Var.G.size();
                        int i24 = 0;
                        while (true) {
                            if (i24 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) in0Var.G.get(i24);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    in0Var.F = tL_secureRequiredType3;
                                    in0Var.Q1();
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                } else if (i21 == 4 && !(in0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = in0Var.G.size();
                    int i25 = 0;
                    while (true) {
                        if (i25 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) in0Var.G.get(i25);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                in0Var.F = tL_secureRequiredType4;
                                in0Var.Q1();
                            } else {
                                i25++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    in0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    in0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    in0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    in0Var.Y[7].setText(result.number);
                }
                int i26 = result.gender;
                if (i26 != 0) {
                    if (i26 == 1) {
                        in0Var.w = "male";
                        in0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i26 == 2) {
                        in0Var.w = "female";
                        in0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    in0Var.s = str3;
                    String str4 = (String) in0Var.Y0.get(str3);
                    if (str4 != null) {
                        in0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    in0Var.v = str5;
                    String str6 = (String) in0Var.Y0.get(str5);
                    if (str6 != null) {
                        in0Var.Y[6].setText(str6);
                    }
                }
                int i27 = result.birthDay;
                if (i27 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    in0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i27), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i28 = result.expiryDay;
                if (i28 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i28;
                    in0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i28), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    in0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
        }
    }
}
