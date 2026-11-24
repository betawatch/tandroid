// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vx7 extends d implements gk7 {
    public b9a A0;
    public String A1;
    public LinearLayout B0;
    public String B1;
    public ImageView C0;
    public bx7 C1;
    public TextView D0;
    public boolean D1;
    public TL_account.authorizationForm E;
    public TextView E0;
    public final xw7 E1;
    public final TLRPC.TL_secureRequiredType F;
    public TextView F0;
    public String F1;
    public TLRPC.TL_secureRequiredType G;
    public g24 G0;
    public oq7 G1;
    public ArrayList H;
    public mhb H0;
    public wk4 H1;
    public final TLRPC.TL_secureValue I;
    public mhb I0;
    public bx7 I1;
    public final TLRPC.TL_secureValue J;
    public ImageView J0;
    public byte J1;
    public TL_account.Password K;
    public TextView K0;
    public final jja[] K1;
    public TLRPC.TL_auth_sentCode L;
    public TextView L0;
    public hd L1;
    public r7 M;
    public FrameLayout M0;
    public Dialog M1;
    public AnimatorSet N;
    public TextView N0;
    public final ArrayList N1;
    public cw2 O;
    public byte O0;
    public int O1;
    public TextView P;
    public final byte[] P0;
    public int P1;
    public cw2 Q;
    public final byte[] Q0;
    public int Q1;
    public FrameLayout R;
    public String R0;
    public uib S;
    public x02 S0;
    public View T;
    public byte T0;
    public View U;
    public int U0;
    public hhb V;
    public final ArrayList V0;
    public hhb W;
    public final HashMap W0;
    public hhb X;
    public final HashMap X0;
    public uib Y;
    public final HashMap Y0;
    public EditTextBoldCursor[] Z;
    public HashMap Z0;
    public String a;
    public ViewGroup[] a0;
    public boolean a1;
    public final int b;
    public EditTextBoldCursor[] b0;
    public boolean b1;
    public long c;
    public ScrollView c0;
    public long c1;
    public final String d;
    public LinearLayout d0;
    public byte[] d1;
    public final String e;
    public LinearLayout e0;
    public String e1;
    public boolean f;
    public LinearLayout f0;
    public byte[] f1;
    public LinearLayout g0;
    public boolean g1;
    public final String h;
    public LinearLayout h0;
    public boolean h1;
    public LinearLayout i0;
    public vx7 i1;
    public LinearLayout j0;
    public final ArrayList j1;
    public ld5 k0;
    public uu9 k1;
    public final ArrayList l0;
    public final ArrayList l1;
    public b9a m0;
    public uu9 m1;
    public final String n;
    public b9a n0;
    public uu9 n1;
    public mhb o0;
    public final HashMap o1;
    public mhb p0;
    public final HashMap p1;
    public mhb q0;
    public final HashMap q1;
    public final String r;
    public mhb r0;
    public final HashMap r1;
    public String s;
    public uib s0;
    public final HashMap s1;
    public int t0;
    public final HashMap t1;
    public final boolean[] u0;
    public final HashMap u1;
    public boolean v0;
    public final HashMap v1;
    public String w;
    public boolean w0;
    public final HashMap w1;
    public String x;
    public TextView x0;
    public HashMap x1;
    public final int[] y;
    public uib y0;
    public HashMap y1;
    public uib z0;
    public final HashMap z1;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public vx7(int i, long j, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i2;
        String h1;
        String str6;
        String str7;
        String str8;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.r = str2;
        this.n = str5;
        if (i != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new dx7());
            int size = authorizationform.errors.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i3);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    h1 = h1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    h1 = h1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    h1 = h1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        h1 = h1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        h1 = h1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            h1 = h1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            h1 = h1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            h1 = h1(tL_secureValueError.type);
                            str6 = tL_secureValueError.text;
                            bArr = tL_secureValueError.hash;
                            str7 = null;
                            str8 = "error_all";
                        } else {
                            if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                                TLRPC.TL_secureValueErrorData tL_secureValueErrorData = (TLRPC.TL_secureValueErrorData) secureValueError;
                                int i4 = 0;
                                while (i4 < authorizationform.values.size()) {
                                    TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i4).data;
                                    if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                        i4++;
                                        size = size;
                                    } else {
                                        h1 = h1(tL_secureValueErrorData.type);
                                        str6 = tL_secureValueErrorData.text;
                                        String str9 = tL_secureValueErrorData.field;
                                        bArr = tL_secureValueErrorData.data_hash;
                                        str7 = str9;
                                        str8 = "data";
                                    }
                                }
                            }
                            i2 = size;
                            i3++;
                            size = i2;
                        }
                        str8 = "files";
                    }
                    str8 = "translation";
                }
                HashMap hashMap = (HashMap) this.v1.get(h1);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i2 = size;
                    this.v1.put(h1, hashMap);
                    this.w1.put(h1, str6);
                } else {
                    i2 = size;
                }
                String encodeToString = bArr != null ? Base64.encodeToString(bArr, 2) : "";
                switch (str8.hashCode()) {
                    case -1840647503:
                        if (!str8.equals("translation")) {
                            break;
                        } else if (bArr == null) {
                            hashMap.put("translation_all", str6);
                            break;
                        } else {
                            hashMap.put("translation" + encodeToString, str6);
                            break;
                        }
                    case -906020504:
                        if (!str8.equals("selfie")) {
                            break;
                        } else {
                            hashMap.put("selfie" + encodeToString, str6);
                            break;
                        }
                    case 3076010:
                        if (str8.equals("data") && str7 != null) {
                            hashMap.put(str7, str6);
                            break;
                        }
                        break;
                    case 97434231:
                        if (!str8.equals("files")) {
                            break;
                        } else if (bArr == null) {
                            hashMap.put("files_all", str6);
                            break;
                        } else {
                            hashMap.put("files" + encodeToString, str6);
                            break;
                        }
                    case 97705513:
                        if (!str8.equals("front")) {
                            break;
                        } else {
                            hashMap.put("front" + encodeToString, str6);
                            break;
                        }
                    case 329856746:
                        if (!str8.equals("error_all")) {
                            break;
                        } else {
                            hashMap.put("error_all", str6);
                            break;
                        }
                    case 1099846370:
                        if (!str8.equals("reverse")) {
                            break;
                        } else {
                            hashMap.put("reverse" + encodeToString, str6);
                            break;
                        }
                }
                i3++;
                size = i2;
            }
        } catch (Exception unused) {
        }
    }

    public static boolean R0(byte[] bArr, Long l) {
        if (bArr != null && bArr.length == 32) {
            int i = 0;
            for (byte b : bArr) {
                i += b & 255;
            }
            if (i % kk7.d4 == 239 && (l == null || Utilities.g(Utilities.o(bArr.length, bArr)) == l.longValue())) {
                return true;
            }
        }
        return false;
    }

    public static void R1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z, boolean z2) {
        if (editTextBoldCursorArr != null) {
            for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
                if (editTextBoldCursor != null) {
                    zkb.l(editTextBoldCursor, 30, bkb.F6, null);
                    if (z) {
                        zkb.l(editTextBoldCursor, 34, bkb.G6, null);
                        zkb.l(editTextBoldCursor, 35, bkb.K6, null);
                        if (z2) {
                            int paddingLeft = editTextBoldCursor.getPaddingLeft();
                            int paddingTop = editTextBoldCursor.getPaddingTop();
                            int paddingRight = editTextBoldCursor.getPaddingRight();
                            int paddingBottom = editTextBoldCursor.getPaddingBottom();
                            zkb.F(editTextBoldCursor, bkb.j6, bkb.k6, bkb.o7, null);
                            if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                                editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            }
                        }
                    }
                }
            }
        }
    }

    public static String Z0(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr2.length != 32 || bArr3 == null || bArr3.length != 32) {
            return null;
        }
        byte[] r = Utilities.r(bArr2, bArr3);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r, 32, bArr5, 0, 16);
        int length = bArr.length;
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        Utilities.b(bArr6, bArr4, bArr5, 0, length, 0, 0);
        if (!Arrays.equals(Utilities.o(length, bArr6), bArr3)) {
            return null;
        }
        int i = bArr6[0] & 255;
        return new String(bArr6, i, length - i);
    }

    public static String f1(uu9 uu9Var) {
        byte[] bArr;
        if (uu9Var == null) {
            return "";
        }
        TLRPC.TL_secureFile tL_secureFile = uu9Var.b;
        if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
            return Base64.encodeToString(bArr, 2);
        }
        byte[] bArr2 = uu9Var.f;
        return bArr2 != null ? Base64.encodeToString(bArr2, 2) : "";
    }

    public static int g1(String str) {
        str.getClass();
        switch (str) {
            case "residence_country_code":
                return 26;
            case "last_name_native":
            case "last_name":
                return 22;
            case "gender":
                return 24;
            case "street_line1":
                return 29;
            case "street_line2":
                return 30;
            case "first_name":
            case "first_name_native":
                return 20;
            case "city":
                return 32;
            case "state":
                return 33;
            case "middle_name":
            case "middle_name_native":
                return 21;
            case "expiry_date":
                return 28;
            case "document_no":
                return 27;
            case "birth_date":
                return 23;
            case "country_code":
                return 25;
            case "post_code":
                return 31;
            default:
                return 100;
        }
    }

    public static String h1(TLRPC.SecureValueType secureValueType) {
        return secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails ? "personal_details" : secureValueType instanceof TLRPC.TL_secureValueTypePassport ? "passport" : secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport ? "internal_passport" : secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense ? "driver_license" : secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard ? "identity_card" : secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill ? "utility_bill" : secureValueType instanceof TLRPC.TL_secureValueTypeAddress ? "address" : secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement ? "bank_statement" : secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement ? "rental_agreement" : secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration ? "temporary_registration" : secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration ? "passport_registration" : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? "email" : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? "phone" : "";
    }

    public static byte[] i1() {
        byte[] bArr = new byte[32];
        Utilities.b.nextBytes(bArr);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            i += bArr[i2] & 255;
        }
        int i3 = i % kk7.d4;
        if (i3 != 239) {
            int i4 = kk7.N3 - i3;
            int nextInt = Utilities.b.nextInt(32);
            int i5 = (bArr[nextInt] & 255) + i4;
            if (i5 < 255) {
                i5 += kk7.d4;
            }
            bArr[nextInt] = (byte) (i5 % kk7.d4);
        }
        return bArr;
    }

    public static String j1(TLRPC.SecureValueType secureValueType) {
        return secureValueType instanceof TLRPC.TL_secureValueTypePassport ? k96.M0(2131754675, null) : secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense ? k96.M0(2131754680, null) : secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard ? k96.M0(2131754677, null) : secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill ? k96.M0(2131754670, null) : secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement ? k96.M0(2131754681, null) : secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement ? k96.M0(2131754672, null) : secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport ? k96.M0(2131754676, null) : secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration ? k96.M0(2131754674, null) : secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration ? k96.M0(2131754671, null) : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? k96.M0(2131754673, null) : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? k96.M0(2131754679, null) : "";
    }

    public static boolean m1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) || (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) || (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement);
    }

    public static boolean n1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard);
    }

    public final void A1() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.L1 != null) {
            return;
        }
        hd hdVar = new hd(3, null, getParentActivity());
        this.L1 = hdVar;
        hdVar.j0 = false;
        hdVar.show();
    }

    public final void B1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        gl.z3(view);
        K1(view);
    }

    public final void C1(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z) {
            this.Z[0].setText("");
        }
        gl.z3(this.Z[0]);
    }

    public final void D1(boolean z) {
        String obj;
        if (z) {
            obj = null;
        } else {
            obj = this.Z[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                C1(false);
                return;
            }
            P1(true, true);
        }
        Utilities.e.c(new vj6((Object) this, z, (Object) obj, (byte) 9));
    }

    public final void E1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (l1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(k96.M0(2131754673, null));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (l1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(k96.M0(2131754679, null));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (l1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(k96.M0(2131754678, null));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (l1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(k96.M0(2131754675, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (l1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(k96.M0(2131754676, null));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (l1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(k96.M0(2131754674, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (l1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(k96.M0(2131754671, null));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (l1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(k96.M0(2131754677, null));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (l1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(k96.M0(2131754680, null));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (l1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(k96.M0(2131754682, null));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (l1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(k96.M0(2131754670, null));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (l1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(k96.M0(2131754681, null));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (l1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(k96.M0(2131754672, null));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() == null || arrayList.isEmpty()) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131747303, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.e((CharSequence[]) arrayList.toArray(new CharSequence[0]), new fe((Object) this, arrayList2, (byte) 7));
        showDialog(hdVar);
    }

    public final void F1() {
        int size;
        if (getParentActivity() == null) {
            return;
        }
        byte b = this.T0;
        ArrayList arrayList = this.j1;
        int i = 1;
        if (b == 0 && arrayList.size() >= 20) {
            O1(k96.M0(R.string.AppName, null), k96.a0("PassportUploadMaxReached", null, 2131747258, k96.G(20, "Files", new Object[0])));
            return;
        }
        U0();
        x02 x02Var = this.S0;
        byte b2 = this.T0;
        x02Var.R3 = b2 == 1;
        if (b2 != 0) {
            if (b2 == 4) {
                size = this.l1.size();
            }
            x02Var.t1(i, false);
            this.S0.d2.h0();
            this.S0.Z0();
            showDialog(this.S0);
        }
        size = arrayList.size();
        i = 20 - size;
        x02Var.t1(i, false);
        this.S0.d2.h0();
        this.S0.Z0();
        showDialog(this.S0);
    }

    public final void G1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        int size = arrayList != null ? arrayList.size() : 0;
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2 != null ? tL_secureRequiredType2.type : null;
        int i = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails ? 1 : secureValueType instanceof TLRPC.TL_secureValueTypeAddress ? 2 : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? 3 : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? 4 : -1;
        if (i != -1) {
            HashMap hashMap3 = this.v1;
            HashMap hashMap4 = !z ? (HashMap) hashMap3.get(h1(secureValueType)) : null;
            HashMap hashMap5 = (HashMap) hashMap3.get(h1(secureValueType2));
            TLRPC.TL_secureValue k1 = k1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue k12 = k1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap4;
            TL_account.authorizationForm authorizationform = this.E;
            int i2 = i;
            TL_account.Password password = this.K;
            HashMap hashMap7 = this.q1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap = hashMap5;
                hashMap2 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap = hashMap5;
                hashMap2 = null;
            }
            vx7 vx7Var = new vx7(i2, authorizationform, password, tL_secureRequiredType, k1, tL_secureRequiredType2, k12, hashMap8, hashMap2);
            vx7Var.C1 = new bx7(this, secureValueType, z, size);
            vx7Var.currentAccount = this.currentAccount;
            vx7Var.f1 = this.f1;
            vx7Var.d1 = this.d1;
            vx7Var.c = this.c;
            vx7Var.x1 = hashMap6;
            vx7Var.w0 = z;
            vx7Var.y1 = hashMap;
            vx7Var.H = arrayList;
            if (i2 == 4) {
                vx7Var.e1 = this.e1;
            }
            presentFragment(vx7Var);
        }
    }

    public final void H0(final uu9 uu9Var, final int i) {
        String M0;
        String str;
        String v;
        byte b = 4;
        if (i == 1) {
            this.k1 = uu9Var;
            if (this.h0 == null) {
                return;
            }
        } else if (i == 4) {
            this.l1.add(uu9Var);
            if (this.i0 == null) {
                return;
            }
        } else if (i == 2) {
            this.m1 = uu9Var;
            if (this.f0 == null) {
                return;
            }
        } else if (i == 3) {
            this.n1 = uu9Var;
            if (this.g0 == null) {
                return;
            }
        } else {
            this.j1.add(uu9Var);
            if (this.e0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final tx7 tx7Var = new tx7(this, getParentActivity());
        tx7Var.setTag(uu9Var);
        ff0 L0 = bkb.L0(true);
        vkb M = zkb.M(bkb.c6);
        vkb M2 = zkb.M(bkb.h6);
        tx7Var.setBackground(L0);
        zkb.j(tx7Var, L0, M, M2, null);
        this.o1.put(uu9Var, tx7Var);
        String f1 = f1(uu9Var);
        if (i == 1) {
            M0 = k96.M0(2131747270, null);
            this.h0.addView(tx7Var, nme.o(-1, -2));
            str = "selfie" + f1;
        } else if (i == 4) {
            M0 = k96.M0(2131753945, null);
            this.i0.addView(tx7Var, nme.o(-1, -2));
            str = "translation" + f1;
        } else if (i == 2) {
            TLRPC.SecureValueType secureValueType = this.G.type;
            M0 = ((secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) ? k96.M0(2131747317, null) : k96.M0(2131747375, null);
            this.f0.addView(tx7Var, nme.o(-1, -2));
            str = "front" + f1;
        } else if (i == 3) {
            M0 = k96.M0(2131747279, null);
            this.g0.addView(tx7Var, nme.o(-1, -2));
            str = "reverse" + f1;
        } else {
            M0 = k96.M0(2131753945, null);
            this.e0.addView(tx7Var, nme.o(-1, -2));
            str = "files" + f1;
        }
        HashMap hashMap = this.y1;
        TextView textView = tx7Var.b;
        if (hashMap == null || (v = (String) hashMap.get(str)) == null) {
            v = k96.v(uu9Var.b.date);
        } else {
            zkb.X(textView, bkb.o7, null);
            this.z1.put(str, "");
        }
        tx7Var.a.setText(M0);
        textView.setText(v);
        be0 be0Var = tx7Var.c;
        be0Var.getClass();
        gl5 gl5Var = new gl5();
        gl5Var.h = uu9Var;
        be0Var.k(gl5Var, "48_48", null, null, null, null, 0, null);
        tx7Var.f = uu9Var;
        tx7Var.a(false);
        tx7Var.setOnClickListener(new hb(this, i, b));
        final String str2 = str;
        tx7Var.setOnLongClickListener(new View.OnLongClickListener() { // from class: pw7
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final vx7 vx7Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vx7Var.getParentActivity());
                final byte b2 = i;
                hd hdVar = alertDialog$Builder.a;
                if (b2 == 1) {
                    hdVar.U = k96.M0(2131747389, null);
                } else {
                    hdVar.U = k96.M0(2131747391, null);
                }
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                hdVar.S = k96.M0(R.string.AppName, null);
                String M02 = k96.M0(2131747638, null);
                final tx7 tx7Var2 = tx7Var;
                final uu9 uu9Var2 = uu9Var;
                final String str3 = str2;
                alertDialog$Builder.j(M02, new ed() { // from class: rw7
                    @Override // ed
                    public final void u(hd hdVar2, int i2) {
                        vx7Var.o1(uu9Var2, b2, tx7Var2, str3);
                    }
                });
                vx7Var.showDialog(hdVar);
                return true;
            }
        });
    }

    public final void H1(int i) {
        if (i == 0) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q0 = gl.q0(null, false);
                if (q0 != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Activity parentActivity = getParentActivity();
                        a.d();
                        intent.putExtra("output", FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", q0));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q0));
                    }
                    this.R0 = q0.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void I0(TLRPC.TL_secureFile tL_secureFile, int i) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] r = Utilities.r(a1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(r, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(r, 32, bArr4, 0, 16);
        H0(new uu9(new vu9(bArr3, bArr4), tL_secureFile, null, null, null), i);
    }

    public final void I1(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        byte b = this.T0;
        boolean z = true;
        boolean z2 = false;
        if (b != 1 && b != 4 && (this.F.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i < editTextBoldCursorArr.length) {
                    if (i != 5 && i != 8 && i != 4 && i != 6 && editTextBoldCursorArr[i].length() > 0) {
                        z = false;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            z2 = z;
        }
        Utilities.e.c(new kn6(this, arrayList, this.T0, z2));
    }

    public final void J0(ArrayList arrayList) {
        this.j1.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                I0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final void J1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType != null) {
            int size = this.E.values.size();
            for (int i = 0; i < size; i++) {
                if (tL_secureRequiredType.type.getClass() == this.E.values.get(i).type.getClass()) {
                    this.E.values.remove(i);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ux7 K0(Context context, TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList arrayList, boolean z, boolean z2) {
        String M0;
        String str;
        String str2;
        String str3;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        String str4;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        String str5;
        TLRPC.TL_secureValue k1;
        String M02;
        int size = arrayList != null ? arrayList.size() : 0;
        ux7 ux7Var = new ux7(context);
        int i = this.b;
        int i2 = i == 8 ? 21 : 51;
        TextView textView = new TextView(context);
        ux7Var.a = textView;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = null;
        zkb.X(textView, bkb.F6, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        boolean z3 = k96.a0;
        ux7Var.addView(textView, nme.d(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? i2 : 21, 10.0f, z3 ? 21 : i2, 0.0f));
        TextView textView2 = new TextView(context);
        ux7Var.b = textView2;
        zkb.X(textView2, bkb.y6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(k96.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z4 = k96.a0;
        ux7Var.addView(textView2, nme.d(-2, -2.0f, (z4 ? 5 : 3) | 48, z4 ? i2 : 21, 35.0f, z4 ? 21 : i2, 0.0f));
        ImageView imageView = new ImageView(context);
        ux7Var.c = imageView;
        zkb.s(imageView, bkb.Ci, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageResource(R.drawable.sticker_added);
        ux7Var.addView(imageView, nme.d(-2, -2.0f, (k96.a0 ? 3 : 5) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        ff0 L0 = bkb.L0(true);
        vkb M = zkb.M(bkb.c6);
        vkb M2 = zkb.M(bkb.h6);
        ux7Var.setBackground(L0);
        zkb.j(ux7Var, L0, M, M2, null);
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            if (arrayList == null || arrayList.isEmpty()) {
                M02 = k96.M0(2131747298, null);
            } else {
                if (z) {
                    if (arrayList.size() == 1) {
                        M02 = j1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type);
                    } else if (arrayList.size() == 2) {
                        M02 = k96.a0("PassportTwoDocuments", null, 2131747261, j1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), j1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type));
                    }
                }
                M02 = k96.M0(2131747372, null);
            }
            ux7Var.a(M02, !z2);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            if (arrayList == null || arrayList.isEmpty()) {
                M0 = k96.M0(2131747409, null);
            } else {
                if (z) {
                    if (arrayList.size() == 1) {
                        M0 = j1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type);
                    } else if (arrayList.size() == 2) {
                        M0 = k96.a0("PassportTwoDocuments", null, 2131747261, j1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), j1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type));
                    }
                }
                M0 = k96.M0(2131747280, null);
            }
            ux7Var.a(M0, !z2);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            ux7Var.a(k96.M0(2131747295, null), !z2);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            ux7Var.a(k96.M0(2131747382, null), !z2);
        }
        LinearLayout linearLayout = this.d0;
        if (i == 8) {
            linearLayout.addView(ux7Var, linearLayout.getChildCount() - 5, nme.o(-1, -2));
        } else {
            linearLayout.addView(ux7Var, nme.o(-1, -2));
        }
        ux7Var.setOnClickListener(new l63(this, arrayList, tL_secureRequiredType, z));
        this.r1.put(tL_secureRequiredType, ux7Var);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.q1;
        hashMap2.put(tL_secureRequiredType, hashMap);
        TLRPC.TL_secureValue k12 = k1(tL_secureRequiredType, false);
        if (k12 != null) {
            TLRPC.SecurePlainData securePlainData = k12.plain_data;
            if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                str = ((TLRPC.TL_securePlainEmail) securePlainData).email;
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                str = ((TLRPC.TL_securePlainPhone) securePlainData).phone;
            } else {
                TLRPC.TL_secureData tL_secureData = k12.data;
                if (tL_secureData != null) {
                    str2 = Z0(tL_secureData.data, a1(tL_secureData.secret, tL_secureData.data_hash), k12.data.data_hash);
                    str = null;
                    if (arrayList != null || arrayList.isEmpty()) {
                        str3 = str;
                        tL_secureRequiredType2 = tL_secureRequiredType;
                        str4 = str2;
                        tL_secureRequiredType3 = null;
                        str5 = null;
                    } else {
                        int size2 = arrayList.size();
                        int i3 = 0;
                        boolean z5 = false;
                        String str6 = null;
                        while (i3 < size2) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList.get(i3);
                            hashMap2.put(tL_secureRequiredType5, new HashMap());
                            this.s1.put(tL_secureRequiredType5, tL_secureRequiredType);
                            String str7 = str;
                            if (!z5 && (k1 = k1(tL_secureRequiredType5, false)) != null) {
                                TLRPC.TL_secureData tL_secureData2 = k1.data;
                                if (tL_secureData2 != null) {
                                    str6 = Z0(tL_secureData2.data, a1(tL_secureData2.secret, tL_secureData2.data_hash), k1.data.data_hash);
                                }
                                tL_secureRequiredType4 = tL_secureRequiredType5;
                                z5 = true;
                            }
                            i3++;
                            str = str7;
                        }
                        str3 = str;
                        if (tL_secureRequiredType4 == null) {
                            tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) arrayList.get(0);
                        }
                        tL_secureRequiredType2 = tL_secureRequiredType;
                        str4 = str2;
                        str5 = str6;
                        tL_secureRequiredType3 = tL_secureRequiredType4;
                    }
                    N1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z, size);
                    return ux7Var;
                }
            }
            str2 = null;
            if (arrayList != null) {
            }
            str3 = str;
            tL_secureRequiredType2 = tL_secureRequiredType;
            str4 = str2;
            tL_secureRequiredType3 = null;
            str5 = null;
            N1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z, size);
            return ux7Var;
        }
        str = null;
        str2 = null;
        if (arrayList != null) {
        }
        str3 = str;
        tL_secureRequiredType2 = tL_secureRequiredType;
        str4 = str2;
        tL_secureRequiredType3 = null;
        str5 = null;
        N1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z, size);
        return ux7Var;
    }

    public final void K1(View view) {
        while (view != null) {
            if (this.d0.indexOfChild(view) >= 0) {
                this.c0.smoothScrollTo(0, view.getTop() - ((this.c0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
                return;
            }
            view = (View) view.getParent();
        }
    }

    public final void L0(ArrayList arrayList) {
        this.l1.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                I0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void L1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            switch (str) {
                case "residence_country_code":
                    this.w = str2;
                    CharSequence charSequence3 = (String) this.Z0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case "gender":
                    if (!"male".equals(str2)) {
                        if ("female".equals(str2)) {
                            this.x = str2;
                            editTextBoldCursor.setText(k96.M0(2131747376, null));
                            break;
                        }
                    } else {
                        this.x = str2;
                        editTextBoldCursor.setText(k96.M0(2131747315, null));
                        break;
                    }
                    break;
                case "expiry_date":
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.y;
                    if (!isEmpty) {
                        String[] split = str2.split("\\.");
                        if (split.length == 3) {
                            iArr[0] = Utilities.z(split[2]).intValue();
                            iArr[1] = Utilities.z(split[1]).intValue();
                            iArr[2] = Utilities.z(split[0]).intValue();
                            editTextBoldCursor.setText(str2);
                            break;
                        }
                    }
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    editTextBoldCursor.setText(k96.M0(2131747301, null));
                    break;
                case "country_code":
                    this.s = str2;
                    CharSequence charSequence4 = (String) this.Z0.get(str2);
                    if (charSequence4 != null) {
                        editTextBoldCursor.setText(charSequence4);
                        break;
                    }
                    break;
                default:
                    editTextBoldCursor.setText(str2);
                    break;
            }
        }
        HashMap hashMap2 = this.x1;
        HashMap hashMap3 = this.z1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.y1;
        if (hashMap4 == null || (charSequence = (String) hashMap4.get(str)) == null) {
            return;
        }
        editTextBoldCursor.setErrorText(charSequence);
        hashMap3.put(str, editTextBoldCursor.getText().toString());
    }

    public final void M0(boolean z) {
        if (this.h1) {
            return;
        }
        String str = this.n;
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = this.b;
        if (isEmpty) {
            if (this.D1) {
                if (z || (!this.g1 && (i == 5 || i == 0))) {
                    getParentActivity().setResult(z ? -1 : 0);
                }
                this.h1 = true;
                return;
            }
            return;
        }
        if (z) {
            d01.q(getParentActivity(), Uri.parse(str + "&tg_passport=success"), true, true);
        } else if (!this.g1 && (i == 5 || i == 0)) {
            d01.q(getParentActivity(), Uri.parse(str + "&tg_passport=cancel"), true, true);
        }
        this.h1 = true;
    }

    public final void M1(Bundle bundle, int i, boolean z) {
        if (i == 3) {
            this.M.setVisibility(8);
        }
        byte b = this.J1;
        jja[] jjaVarArr = this.K1;
        jja jjaVar = jjaVarArr[b];
        jja jjaVar2 = jjaVarArr[i];
        this.J1 = i;
        boolean z2 = false;
        jjaVar2.m(bundle, false);
        jjaVar2.j();
        if (!z) {
            jjaVar2.setTranslationX(0.0f);
            jjaVar2.setVisibility(0);
            if (jjaVar != jjaVar2) {
                jjaVar.setVisibility(8);
                return;
            }
            return;
        }
        Point point = gl.q;
        jjaVar2.setTranslationX(point.x);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(jjaVar, "translationX", -point.x), ObjectAnimator.ofFloat(jjaVar2, "translationX", 0.0f));
        animatorSet.addListener(new u5(jjaVar2, jjaVar, z2, (byte) 28));
        animatorSet.start();
    }

    public final boolean N0(boolean z) {
        String str = this.a;
        if (str == null || str.equals(e1())) {
            return false;
        }
        byte b = 1;
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.j(k96.M0(2131747387, null), new nw7(this, b));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            String M0 = k96.M0(2131751393, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131747386, null);
            showDialog(hdVar);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x030a, code lost:
    
        if (r4.equals("residence_country_code") != false) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0221 A[Catch: all -> 0x023f, TryCatch #3 {all -> 0x023f, blocks: (B:179:0x0217, B:180:0x021b, B:182:0x0221, B:184:0x022d, B:187:0x0235), top: B:178:0x0217, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024a A[Catch: Exception -> 0x035a, TryCatch #2 {Exception -> 0x035a, blocks: (B:270:0x01e5, B:191:0x0247, B:193:0x024a, B:196:0x0254, B:263:0x0242, B:276:0x0202, B:179:0x0217, B:180:0x021b, B:182:0x0221, B:184:0x022d, B:187:0x0235), top: B:269:0x01e5, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, boolean z, int i) {
        int i2;
        StringBuilder sb;
        boolean z2;
        TLRPC.TL_secureValue tL_secureValue;
        ux7 ux7Var;
        String[] strArr;
        String[] strArr2;
        int i3;
        int i4;
        JSONObject jSONObject;
        int i5;
        String[] strArr3;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        String[] strArr4;
        StringBuilder sb2;
        int i6;
        String[] strArr5;
        HashMap hashMap3;
        HashMap hashMap4;
        JSONObject jSONObject3;
        Iterator<String> keys;
        String sb3;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap5;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4;
        HashMap hashMap6;
        TLRPC.SecureValueType secureValueType;
        boolean z3;
        boolean z4;
        ux7 ux7Var2;
        String str4 = str2;
        ux7 ux7Var3 = (ux7) this.r1.get(tL_secureRequiredType);
        if (ux7Var3 == null) {
            if (this.b != 8) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (tL_secureRequiredType2 != null) {
                arrayList.add(tL_secureRequiredType2);
            }
            LinearLayout linearLayout = this.d0;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
            if (childAt instanceof ux7) {
                ((ux7) childAt).setNeedDivider(true);
            }
            ux7Var3 = K0(getParentActivity(), tL_secureRequiredType, arrayList, true, true);
            T1();
        }
        ux7 ux7Var4 = ux7Var3;
        HashMap hashMap7 = (HashMap) this.q1.get(tL_secureRequiredType);
        HashMap hashMap8 = tL_secureRequiredType2 != null ? (HashMap) this.q1.get(tL_secureRequiredType2) : null;
        TLRPC.TL_secureValue k1 = k1(tL_secureRequiredType, true);
        TLRPC.TL_secureValue k12 = k1(tL_secureRequiredType2, true);
        if (str4 == null || this.Z0 != null) {
            i2 = 2;
            this.Z0 = null;
        } else {
            this.Z0 = new HashMap();
            try {
                i2 = 2;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.b.getResources().getAssets().open("countries.txt")));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split(";");
                        this.Z0.put(split[1], split[2]);
                    }
                    bufferedReader.close();
                } catch (Exception e) {
                    e = e;
                    fa4.g(e, true);
                    if (str == null) {
                    }
                    if (z) {
                    }
                    if (tL_secureRequiredType2 == null) {
                    }
                    if (hashMap5 != null) {
                    }
                    secureValueType = tL_secureRequiredType3.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    }
                    ux7Var2.setValue(sb3);
                    zkb.X(ux7Var2.b, !z4 ? bkb.o7 : bkb.y6, null);
                    ux7Var2.setChecked((!z4 || this.b == 8 || (!z ? tL_secureValue != null : tL_secureRequiredType4 != null) || (tL_secureRequiredType4 != null && k12 == null)) ? z2 : z3);
                }
            } catch (Exception e2) {
                e = e2;
                i2 = 2;
            }
        }
        if (str == null) {
            TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                sb3 = p38.f().e("+".concat(str));
                ux7Var = ux7Var4;
            } else {
                ux7Var = ux7Var4;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
                    sb3 = str;
                } else {
                    tL_secureValue = k1;
                    z2 = false;
                    sb3 = null;
                }
            }
            tL_secureValue = k1;
            z2 = false;
        } else {
            if (this.b == 8 || tL_secureRequiredType2 == null || (TextUtils.isEmpty(str3) && k12 == null)) {
                sb = null;
            } else {
                sb = new StringBuilder();
                if (i > 1) {
                    sb.append(j1(tL_secureRequiredType2.type));
                } else if (TextUtils.isEmpty(str3)) {
                    sb.append(k96.M0(2131747383, null));
                }
            }
            if (str4 == null && str3 == null) {
                ux7Var = ux7Var4;
                tL_secureValue = k1;
                z2 = false;
            } else {
                if (hashMap7 == null) {
                    return;
                }
                hashMap7.clear();
                TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
                z2 = false;
                boolean z5 = true;
                tL_secureValue = k1;
                ux7Var = ux7Var4;
                if (secureValueType3 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    int i7 = this.b;
                    if (i7 != 0 || z) {
                        int i8 = i7 == 8 ? tL_secureRequiredType2 != null ? 8 : 8 : 8;
                        strArr2 = null;
                        if (i7 != 0 || (i7 == i8 && tL_secureRequiredType2 != null)) {
                            strArr = new String[i2];
                            strArr[0] = "document_no";
                            strArr[1] = "expiry_date";
                            if (strArr2 == null || strArr != null) {
                                StringBuilder sb4 = sb;
                                String[] strArr6 = strArr;
                                i4 = 0;
                                JSONObject jSONObject4 = null;
                                String[] strArr7 = null;
                                while (i4 < 2) {
                                    if (i4 == 0) {
                                        if (str4 != null) {
                                            try {
                                                jSONObject = new JSONObject(str4);
                                                i5 = i4;
                                                strArr3 = strArr2;
                                                if (strArr3 != null && jSONObject != null) {
                                                    try {
                                                        keys = jSONObject.keys();
                                                        while (keys.hasNext()) {
                                                            Iterator<String> it = keys;
                                                            String next = keys.next();
                                                            if (i5 == 0) {
                                                                hashMap7.put(next, jSONObject.getString(next));
                                                            } else {
                                                                hashMap8.put(next, jSONObject.getString(next));
                                                            }
                                                            keys = it;
                                                        }
                                                    } catch (Throwable th) {
                                                        fa4.g(th, z5);
                                                    }
                                                    i6 = 0;
                                                    while (i6 < strArr3.length) {
                                                        if (jSONObject.has(strArr3[i6])) {
                                                            sb = sb4 == null ? new StringBuilder() : sb4;
                                                            strArr5 = strArr3;
                                                            try {
                                                                String string = jSONObject.getString(strArr5[i6]);
                                                                if (string == null || TextUtils.isEmpty(string)) {
                                                                    hashMap3 = hashMap7;
                                                                } else {
                                                                    hashMap3 = hashMap7;
                                                                    if (!"first_name_native".equals(strArr5[i6]) && !"middle_name_native".equals(strArr5[i6]) && !"last_name_native".equals(strArr5[i6])) {
                                                                        if (sb.length() > 0) {
                                                                            if ("last_name".equals(strArr5[i6]) || "last_name_native".equals(strArr5[i6]) || "middle_name".equals(strArr5[i6]) || "middle_name_native".equals(strArr5[i6])) {
                                                                                sb.append(" ");
                                                                            } else {
                                                                                sb.append(", ");
                                                                            }
                                                                        }
                                                                        String str5 = strArr5[i6];
                                                                        hashMap4 = hashMap8;
                                                                        int hashCode = str5.hashCode();
                                                                        jSONObject3 = jSONObject;
                                                                        if (hashCode != -2006252145) {
                                                                            if (hashCode != -1249512767) {
                                                                                if (hashCode == 1481071862 && str5.equals("country_code")) {
                                                                                    String str6 = (String) this.Z0.get(string);
                                                                                    if (str6 != null) {
                                                                                        sb.append(str6);
                                                                                    }
                                                                                }
                                                                            } else if (str5.equals("gender")) {
                                                                                if ("male".equals(string)) {
                                                                                    sb.append(k96.M0(2131747315, null));
                                                                                } else if ("female".equals(string)) {
                                                                                    sb.append(k96.M0(2131747376, null));
                                                                                }
                                                                            }
                                                                            sb.append(string);
                                                                        }
                                                                    }
                                                                }
                                                                hashMap4 = hashMap8;
                                                                jSONObject3 = jSONObject;
                                                            } catch (Exception unused) {
                                                            }
                                                        } else {
                                                            strArr5 = strArr3;
                                                            hashMap3 = hashMap7;
                                                            hashMap4 = hashMap8;
                                                            jSONObject3 = jSONObject;
                                                            sb = sb4;
                                                        }
                                                        i6++;
                                                        sb4 = sb;
                                                        strArr3 = strArr5;
                                                        hashMap7 = hashMap3;
                                                        hashMap8 = hashMap4;
                                                        jSONObject = jSONObject3;
                                                    }
                                                }
                                                strArr4 = strArr3;
                                                hashMap = hashMap7;
                                                hashMap2 = hashMap8;
                                                jSONObject2 = jSONObject;
                                                sb2 = sb4;
                                                i4 = i5 + 1;
                                                str4 = str2;
                                                sb4 = sb2;
                                                strArr7 = strArr4;
                                                hashMap7 = hashMap;
                                                hashMap8 = hashMap2;
                                                jSONObject4 = jSONObject2;
                                                z5 = true;
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        String[] strArr8 = strArr7;
                                        i5 = i4;
                                        strArr3 = strArr8;
                                        jSONObject = jSONObject4;
                                        if (strArr3 != null) {
                                            keys = jSONObject.keys();
                                            while (keys.hasNext()) {
                                            }
                                            i6 = 0;
                                            while (i6 < strArr3.length) {
                                            }
                                        }
                                        strArr4 = strArr3;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        jSONObject2 = jSONObject;
                                        sb2 = sb4;
                                        i4 = i5 + 1;
                                        str4 = str2;
                                        sb4 = sb2;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                        z5 = true;
                                    } else if (hashMap8 == null) {
                                        jSONObject2 = jSONObject4;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        strArr4 = strArr7;
                                        sb2 = sb4;
                                        i5 = i4;
                                        i4 = i5 + 1;
                                        str4 = str2;
                                        sb4 = sb2;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                        z5 = true;
                                    } else {
                                        if (str3 != null) {
                                            jSONObject = new JSONObject(str3);
                                            i5 = i4;
                                            strArr3 = strArr6;
                                            if (strArr3 != null) {
                                            }
                                            strArr4 = strArr3;
                                            hashMap = hashMap7;
                                            hashMap2 = hashMap8;
                                            jSONObject2 = jSONObject;
                                            sb2 = sb4;
                                            i4 = i5 + 1;
                                            str4 = str2;
                                            sb4 = sb2;
                                            strArr7 = strArr4;
                                            hashMap7 = hashMap;
                                            hashMap8 = hashMap2;
                                            jSONObject4 = jSONObject2;
                                            z5 = true;
                                        }
                                        String[] strArr82 = strArr7;
                                        i5 = i4;
                                        strArr3 = strArr82;
                                        jSONObject = jSONObject4;
                                        if (strArr3 != null) {
                                        }
                                        strArr4 = strArr3;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        jSONObject2 = jSONObject;
                                        sb2 = sb4;
                                        i4 = i5 + 1;
                                        str4 = str2;
                                        sb4 = sb2;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                        z5 = true;
                                    }
                                }
                                sb = sb4;
                            }
                        }
                        strArr = null;
                        if (strArr2 == null) {
                        }
                        StringBuilder sb42 = sb;
                        String[] strArr62 = strArr;
                        i4 = 0;
                        JSONObject jSONObject42 = null;
                        String[] strArr72 = null;
                        while (i4 < 2) {
                        }
                        sb = sb42;
                    }
                    String[] strArr9 = new String[10];
                    strArr9[0] = "first_name";
                    strArr9[1] = "middle_name";
                    strArr9[i2] = "last_name";
                    strArr9[3] = "first_name_native";
                    strArr9[4] = "middle_name_native";
                    strArr9[5] = "last_name_native";
                    strArr9[6] = "birth_date";
                    strArr9[7] = "gender";
                    strArr2 = strArr9;
                    strArr2[8] = "country_code";
                    strArr2[9] = "residence_country_code";
                    if (i7 != 0) {
                    }
                    strArr = new String[i2];
                    strArr[0] = "document_no";
                    strArr[1] = "expiry_date";
                    if (strArr2 == null) {
                    }
                    StringBuilder sb422 = sb;
                    String[] strArr622 = strArr;
                    i4 = 0;
                    JSONObject jSONObject422 = null;
                    String[] strArr722 = null;
                    while (i4 < 2) {
                    }
                    sb = sb422;
                } else if (!(secureValueType3 instanceof TLRPC.TL_secureValueTypeAddress) || (((i3 = this.b) != 0 || z) && !(i3 == 8 && tL_secureRequiredType2 == null))) {
                    strArr = null;
                    strArr2 = null;
                    if (strArr2 == null) {
                    }
                    StringBuilder sb4222 = sb;
                    String[] strArr6222 = strArr;
                    i4 = 0;
                    JSONObject jSONObject4222 = null;
                    String[] strArr7222 = null;
                    while (i4 < 2) {
                    }
                    sb = sb4222;
                } else {
                    strArr2 = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                    strArr = null;
                    if (strArr2 == null) {
                    }
                    StringBuilder sb42222 = sb;
                    String[] strArr62222 = strArr;
                    i4 = 0;
                    JSONObject jSONObject42222 = null;
                    String[] strArr72222 = null;
                    while (i4 < 2) {
                    }
                    sb = sb42222;
                }
            }
            if (sb != null) {
                sb3 = sb.toString();
            }
            sb3 = null;
        }
        if (z) {
            tL_secureRequiredType3 = tL_secureRequiredType;
            hashMap5 = (HashMap) this.v1.get(h1(tL_secureRequiredType3.type));
        } else {
            tL_secureRequiredType3 = tL_secureRequiredType;
            hashMap5 = null;
        }
        if (tL_secureRequiredType2 == null) {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            hashMap6 = (HashMap) this.v1.get(h1(tL_secureRequiredType4.type));
        } else {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            hashMap6 = null;
        }
        if ((hashMap5 != null || hashMap5.size() <= 0) && (hashMap6 == null || hashMap6.size() <= 0)) {
            secureValueType = tL_secureRequiredType3.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                    if (TextUtils.isEmpty(sb3)) {
                        if (tL_secureRequiredType4 == null) {
                            sb3 = k96.M0(2131747406, null);
                        } else if (this.b == 8) {
                            sb3 = k96.M0(2131747383, null);
                        } else {
                            z3 = true;
                            if (i == 1) {
                                TLRPC.SecureValueType secureValueType4 = tL_secureRequiredType4.type;
                                if (secureValueType4 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                    sb3 = k96.M0(2131747432, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                    sb3 = k96.M0(2131747428, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                    sb3 = k96.M0(2131747418, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                    sb3 = k96.M0(2131747416, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                    sb3 = k96.M0(2131747430, null);
                                }
                            } else {
                                sb3 = k96.M0(2131747407, null);
                            }
                        }
                        z4 = z2;
                        ux7Var2 = ux7Var;
                        z3 = true;
                    }
                    z3 = true;
                } else {
                    z3 = true;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                        if (TextUtils.isEmpty(sb3)) {
                            sb3 = k96.M0(2131747294, null);
                        }
                    } else if ((secureValueType instanceof TLRPC.TL_secureValueTypeEmail) && TextUtils.isEmpty(sb3)) {
                        sb3 = k96.M0(2131747380, null);
                    }
                }
                z4 = z2;
                ux7Var2 = ux7Var;
            } else {
                if (TextUtils.isEmpty(sb3)) {
                    if (tL_secureRequiredType4 == null) {
                        sb3 = k96.M0(2131747297, null);
                    } else if (this.b == 8) {
                        sb3 = k96.M0(2131747383, null);
                    } else if (i == 1) {
                        TLRPC.SecureValueType secureValueType5 = tL_secureRequiredType4.type;
                        if (secureValueType5 instanceof TLRPC.TL_secureValueTypePassport) {
                            sb3 = k96.M0(2131747367, null);
                        } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                            sb3 = k96.M0(2131747368, null);
                        } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            sb3 = k96.M0(2131747370, null);
                        } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                            sb3 = k96.M0(2131747369, null);
                        }
                    } else {
                        sb3 = k96.M0(2131747371, null);
                    }
                    z4 = z2;
                    ux7Var2 = ux7Var;
                    z3 = true;
                }
                z3 = true;
                z4 = z2;
                ux7Var2 = ux7Var;
            }
        } else {
            sb3 = !z ? (String) this.w1.get(h1(tL_secureRequiredType3.type)) : null;
            if (sb3 == null) {
                sb3 = (String) this.w1.get(h1(tL_secureRequiredType4.type));
            }
            ux7Var2 = ux7Var;
            z3 = true;
            z4 = true;
        }
        ux7Var2.setValue(sb3);
        zkb.X(ux7Var2.b, !z4 ? bkb.o7 : bkb.y6, null);
        ux7Var2.setChecked((!z4 || this.b == 8 || (!z ? tL_secureValue != null : tL_secureRequiredType4 != null) || (tL_secureRequiredType4 != null && k12 == null)) ? z2 : z3);
    }

    public final void O0(EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z) {
        String str2;
        String str3;
        String str4;
        HashMap hashMap = this.z1;
        if (hashMap == null || (str2 = (String) hashMap.get(str)) == null) {
            editTextBoldCursor.setErrorText(null);
        } else if (TextUtils.equals(str2, editable)) {
            HashMap hashMap2 = this.x1;
            if (hashMap2 == null || (str4 = (String) hashMap2.get(str)) == null) {
                HashMap hashMap3 = this.y1;
                if (hashMap3 != null && (str3 = (String) hashMap3.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str3);
                }
            } else {
                editTextBoldCursor.setErrorText(str4);
            }
        } else {
            editTextBoldCursor.setErrorText(null);
        }
        String str5 = z ? "error_document_all" : "error_all";
        if (hashMap == null || !hashMap.containsKey(str5)) {
            return;
        }
        hashMap.remove(str5);
        S0(false);
    }

    public final void O1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = str2;
        showDialog(hdVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e3, code lost:
    
        if (r7 != 5) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0253, code lost:
    
        if (r9 > 24) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x025c, code lost:
    
        if (r9 < 2) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x026b, code lost:
    
        if (r9 < 2) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0274, code lost:
    
        if (r9 > 10) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P0() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        boolean z;
        View view;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        HashMap hashMap = this.z1;
        if (tL_secureRequiredType != null) {
            if (hashMap.containsKey("error_all") || hashMap.containsKey("error_document_all")) {
                B1(this.q0);
                return true;
            }
            uib uibVar = this.S;
            HashMap hashMap2 = this.o1;
            if (uibVar != null) {
                ArrayList arrayList = this.j1;
                if (arrayList.isEmpty()) {
                    B1(this.S);
                    return true;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    uu9 uu9Var = (uu9) arrayList.get(i);
                    if (hashMap.containsKey("files" + f1(uu9Var))) {
                        B1((View) hashMap2.get(uu9Var));
                        return true;
                    }
                }
            }
            if (hashMap.containsKey("files_all") || hashMap.containsKey("translation_all")) {
                B1(this.o0);
                return true;
            }
            View view2 = this.V;
            if (view2 != null) {
                if (this.m1 == null) {
                    B1(view2);
                    return true;
                }
                if (hashMap.containsKey("front" + f1(this.m1))) {
                    B1((View) hashMap2.get(this.m1));
                    return true;
                }
            }
            TLRPC.SecureValueType secureValueType = this.G.type;
            if (((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) && (view = this.W) != null) {
                if (this.n1 == null) {
                    B1(view);
                    return true;
                }
                if (hashMap.containsKey("reverse" + f1(this.n1))) {
                    B1((View) hashMap2.get(this.n1));
                    return true;
                }
            }
            View view3 = this.X;
            if (view3 != null && this.c != 0) {
                if (this.k1 == null) {
                    B1(view3);
                    return true;
                }
                if (hashMap.containsKey("selfie" + f1(this.k1))) {
                    B1((View) hashMap2.get(this.k1));
                    return true;
                }
            }
            if (this.Y != null && this.c != 0) {
                ArrayList arrayList2 = this.l1;
                if (arrayList2.isEmpty()) {
                    B1(this.Y);
                    return true;
                }
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    uu9 uu9Var2 = (uu9) arrayList2.get(i2);
                    if (hashMap.containsKey("translation" + f1(uu9Var2))) {
                        B1((View) hashMap2.get(uu9Var2));
                        return true;
                    }
                }
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                editTextBoldCursorArr = this.Z;
            } else {
                mhb mhbVar = this.r0;
                editTextBoldCursorArr = (mhbVar == null || mhbVar.getVisibility() != 0) ? null : this.b0;
            }
            if (editTextBoldCursorArr != null) {
                int i4 = 0;
                while (i4 < editTextBoldCursorArr.length) {
                    boolean z2 = !TextUtils.isEmpty(editTextBoldCursorArr[i4].x0);
                    if (!hashMap.isEmpty()) {
                        TLRPC.SecureValueType secureValueType2 = this.F.type;
                        String str = "country_code";
                        if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (i4 == 0) {
                                    str = "street_line1";
                                } else if (i4 == 1) {
                                    str = "street_line2";
                                } else if (i4 == 2) {
                                    str = "post_code";
                                } else if (i4 == 3) {
                                    str = "city";
                                } else if (i4 == 4) {
                                    str = "state";
                                }
                                if (str != null) {
                                }
                            }
                            str = null;
                            if (str != null) {
                            }
                        } else if (i3 == 0) {
                            switch (i4) {
                                case 0:
                                    str = "first_name";
                                    break;
                                case 1:
                                    str = "middle_name";
                                    break;
                                case 2:
                                    str = "last_name";
                                    break;
                                case 3:
                                    str = "birth_date";
                                    break;
                                case 4:
                                    str = "gender";
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    str = "residence_country_code";
                                    break;
                                case 7:
                                    str = "document_no";
                                    break;
                                case 8:
                                    str = "expiry_date";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                String str2 = (String) hashMap.get(str);
                                if (!TextUtils.isEmpty(str2) && str2.equals(editTextBoldCursorArr[i4].getText().toString())) {
                                    z2 = true;
                                }
                            }
                        } else {
                            if (i4 == 0) {
                                str = "first_name_native";
                            } else if (i4 != 1) {
                                if (i4 == 2) {
                                    str = "last_name_native";
                                }
                                str = null;
                            } else {
                                str = "middle_name_native";
                            }
                            if (str != null) {
                            }
                        }
                    }
                    if (!this.w0 || this.G == null || i4 >= 7) {
                        if (!z2) {
                            int length = editTextBoldCursorArr[i4].length();
                            int i5 = this.b;
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    if (i4 == 1) {
                                        continue;
                                    } else if (i4 != 3) {
                                        if (i4 == 4) {
                                            if (!"US".equals(this.s)) {
                                                continue;
                                            }
                                        } else if (i4 == 2) {
                                            if (length >= 2) {
                                            }
                                            z = false;
                                            z2 = true;
                                        }
                                    }
                                }
                                z = false;
                            } else if (i4 == 8) {
                                continue;
                            } else {
                                if ((i3 == 0 && (i4 == 0 || i4 == 2 || i4 == 1)) || (i3 == 1 && (i4 == 0 || i4 == 1 || i4 == 2))) {
                                    if (length > 255) {
                                        z2 = true;
                                    }
                                    if ((i3 == 0 && i4 == 1) || (i3 == 1 && i4 == 1)) {
                                        z = true;
                                    }
                                } else if (i4 == 7) {
                                }
                                z = false;
                            }
                            if (!z2 && !z && length == 0) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            B1(editTextBoldCursorArr[i4]);
                            return true;
                        }
                    }
                    i4++;
                }
            }
        }
        return false;
    }

    public final void P1(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        byte b = 1;
        byte b2 = 0;
        if (z && this.M != null) {
            this.N = new AnimatorSet();
            if (z2) {
                this.O.setVisibility(0);
                this.M.setEnabled(false);
                AnimatorSet animatorSet2 = this.N;
                View contentView = this.M.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property, 0.1f);
                View contentView2 = this.M.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property2, 0.1f);
                View contentView3 = this.M.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.O, (Property<cw2, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.O, (Property<cw2, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.O, (Property<cw2, Float>) property3, 1.0f));
            } else {
                this.M.getContentView().setVisibility(0);
                this.M.setEnabled(true);
                AnimatorSet animatorSet3 = this.N;
                cw2 cw2Var = this.O;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cw2Var, (Property<cw2, Float>) property4, 0.1f);
                cw2 cw2Var2 = this.O;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cw2Var2, (Property<cw2, Float>) property5, 0.1f);
                cw2 cw2Var3 = this.O;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(cw2Var3, (Property<cw2, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.M.getContentView(), (Property<View, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), (Property<View, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), (Property<View, Float>) property6, 1.0f));
            }
            this.N.addListener(new cx7(this, z2, b2));
            this.N.setDuration(150L);
            this.N.start();
            return;
        }
        if (this.P != null) {
            this.N = new AnimatorSet();
            if (z2) {
                this.Q.setVisibility(0);
                this.R.setEnabled(false);
                AnimatorSet animatorSet4 = this.N;
                TextView textView = this.P;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property7, 0.1f);
                TextView textView2 = this.P;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property8, 0.1f);
                TextView textView3 = this.P;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<cw2, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<cw2, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<cw2, Float>) property9, 1.0f));
            } else {
                this.P.setVisibility(0);
                this.R.setEnabled(true);
                AnimatorSet animatorSet5 = this.N;
                cw2 cw2Var4 = this.Q;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(cw2Var4, (Property<cw2, Float>) property10, 0.1f);
                cw2 cw2Var5 = this.Q;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(cw2Var5, (Property<cw2, Float>) property11, 0.1f);
                cw2 cw2Var6 = this.Q;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(cw2Var6, (Property<cw2, Float>) property12, 0.0f), ObjectAnimator.ofFloat(this.P, (Property<TextView, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.P, (Property<TextView, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.P, (Property<TextView, Float>) property12, 1.0f));
            }
            this.N.addListener(new cx7(this, z2, b));
            this.N.setDuration(150L);
            this.N.start();
        }
    }

    public final void Q0(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.b0 != null) {
            String str = (String) this.Z0.get(this.w);
            String str2 = (String) gba.n().get(this.w);
            int i = 0;
            if (!this.F.native_names || TextUtils.isEmpty(this.w) || "EN".equals(str2)) {
                if (this.r0.getVisibility() != 8) {
                    this.r0.setVisibility(8);
                    this.k0.setVisibility(8);
                    this.U.setVisibility(8);
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr2 = this.b0;
                        if (i >= editTextBoldCursorArr2.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr2[i].getParent()).setVisibility(8);
                        i++;
                    }
                    if (((this.c == 0 && this.G != null) || this.I == null || this.w0) && this.J == null) {
                        zkb.Z(this.n0, getParentActivity(), R.drawable.greydivider_bottom, bkb.a7);
                        return;
                    } else {
                        zkb.Z(this.n0, getParentActivity(), R.drawable.greydivider, bkb.a7);
                        return;
                    }
                }
                return;
            }
            byte b = 2;
            if (this.r0.getVisibility() != 0) {
                this.r0.setVisibility(0);
                this.k0.setVisibility(0);
                this.U.setVisibility(0);
                int i2 = 0;
                while (true) {
                    editTextBoldCursorArr = this.b0;
                    if (i2 >= editTextBoldCursorArr.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr[i2].getParent()).setVisibility(0);
                    i2++;
                }
                if (editTextBoldCursorArr[0].length() == 0 && this.b0[1].length() == 0 && this.b0[2].length() == 0) {
                    int i3 = 0;
                    while (true) {
                        boolean[] zArr = this.u0;
                        if (i3 >= zArr.length) {
                            break;
                        }
                        if (zArr[i3]) {
                            this.b0[0].setText(this.Z[0].getText());
                            this.b0[1].setText(this.Z[1].getText());
                            this.b0[2].setText(this.Z[2].getText());
                            break;
                        }
                        i3++;
                    }
                }
                zkb.Z(this.n0, getParentActivity(), R.drawable.greydivider, bkb.a7);
            }
            this.r0.setText(k96.a0("PassportNativeInfo", null, 2131747305, str));
            String K0 = str2 != null ? k96.K0("PassportLanguage_".concat(str2)) : null;
            ld5 ld5Var = this.k0;
            if (K0 != null) {
                ld5Var.setText(k96.a0("PassportNativeHeaderLang", null, 2131747306, K0));
            } else {
                ld5Var.setText(k96.M0(2131747307, null));
            }
            for (int i4 = 0; i4 < 3; i4++) {
                if (i4 == 0) {
                    EditTextBoldCursor[] editTextBoldCursorArr3 = this.b0;
                    if (K0 != null) {
                        editTextBoldCursorArr3[i4].setHintText(k96.M0(2131747311, null));
                    } else {
                        editTextBoldCursorArr3[i4].setHintText(k96.a0("PassportNameCountry", null, 2131747309, str));
                    }
                } else if (i4 == 1) {
                    EditTextBoldCursor[] editTextBoldCursorArr4 = this.b0;
                    if (K0 != null) {
                        editTextBoldCursorArr4[i4].setHintText(k96.M0(2131747314, null));
                    } else {
                        editTextBoldCursorArr4[i4].setHintText(k96.a0("PassportMidnameCountry", null, 2131747313, str));
                    }
                } else if (i4 == 2) {
                    EditTextBoldCursor[] editTextBoldCursorArr5 = this.b0;
                    if (K0 != null) {
                        editTextBoldCursorArr5[i4].setHintText(k96.M0(2131747265, null));
                    } else {
                        editTextBoldCursorArr5[i4].setHintText(k96.a0("PassportSurnameCountry", null, 2131747264, str));
                    }
                }
            }
            if (z) {
                gl.c3(new kw7(this, b));
            }
        }
    }

    public final void Q1(boolean z, String str, oq7 oq7Var, wk4 wk4Var, bx7 bx7Var) {
        boolean z2;
        TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
        boolean z3 = (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0) ? false : true;
        if (getParentActivity() == null || !z3) {
            z2 = true;
        } else {
            z2 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (z) {
                this.N1.clear();
                if (!z2) {
                    this.N1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.N1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.a.S = k96.M0(R.string.AppName, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        String M0 = k96.M0(2131754272, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.U = M0;
                        this.M1 = showDialog(hdVar);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.N1.toArray(new String[0]), 6);
                    }
                    this.F1 = str;
                    this.H1 = wk4Var;
                    this.G1 = oq7Var;
                    this.I1 = bx7Var;
                    return;
                }
            }
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        tL_codeSettings.allow_flashcall = z3 && z2;
        tL_codeSettings.allow_app_hash = b.b.hasServices();
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            boolean z4 = w01.a;
            a.t();
            edit.putString("sms_hash", "O2P2z+/jBpJ").commit();
        } else {
            sharedPreferences.edit().remove("sms_hash").commit();
        }
        if (sendverifyphonecode.settings.allow_flashcall) {
            try {
                String line1Number = telephonyManager.getLine1Number();
                boolean isEmpty = TextUtils.isEmpty(line1Number);
                TLRPC.TL_codeSettings tL_codeSettings2 = sendverifyphonecode.settings;
                if (isEmpty) {
                    tL_codeSettings2.unknown_number = true;
                    tL_codeSettings2.current_number = false;
                } else {
                    tL_codeSettings2.current_number = PhoneNumberUtils.compare(str, line1Number);
                    TLRPC.TL_codeSettings tL_codeSettings3 = sendverifyphonecode.settings;
                    if (!tL_codeSettings3.current_number) {
                        tL_codeSettings3.allow_flashcall = false;
                    }
                }
            } catch (Exception e) {
                sendverifyphonecode.settings.allow_flashcall = false;
                fa4.g(e, true);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new rt0((Object) this, str, (Object) bx7Var, (Object) sendverifyphonecode, (byte) 12), 2);
    }

    public final void S0(boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.q0 != null) {
            HashMap hashMap = this.x1;
            HashMap hashMap2 = this.z1;
            if (hashMap == null || (!(z || hashMap2.containsKey("error_all")) || (str2 = (String) this.x1.get("error_all")) == null)) {
                spannableStringBuilder = null;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z) {
                    hashMap2.put("error_all", "");
                }
            }
            if (this.y1 != null && ((z || hashMap2.containsKey("error_document_all")) && (str = (String) this.y1.get("error_all")) != null)) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
                }
                if (z) {
                    hashMap2.put("error_document_all", "");
                }
            }
            if (spannableStringBuilder != null) {
                spannableStringBuilder.setSpan(new cm4(bkb.o7, null), 0, spannableStringBuilder.length(), 33);
                this.q0.setText(spannableStringBuilder);
                this.q0.setVisibility(0);
            } else if (this.q0.getVisibility() != 8) {
                this.q0.setVisibility(8);
            }
        }
    }

    public final void S1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (tL_secureRequiredType != null) {
            aVar.setTitle(j1(tL_secureRequiredType.type));
        } else {
            aVar.setTitle(k96.M0(2131747299, null));
        }
        V1(2);
        V1(3);
        V1(1);
        V1(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T0(Context context) {
        long j;
        String str;
        String str2;
        String str3;
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        mhb mhbVar = new mhb(context);
        this.q0 = mhbVar;
        int i = bkb.a7;
        zkb.Z(mhbVar, context, R.drawable.greydivider_top, i);
        byte b = 0;
        this.q0.setPadding(0, gl.L(7.0f), 0, 0);
        this.d0.addView(this.q0, nme.o(-1, -2));
        S0(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(k96.M0(2131754672, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(k96.M0(2131754681, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(k96.M0(2131754670, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(k96.M0(2131754674, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(k96.M0(2131754671, null));
            }
            ld5 ld5Var = new ld5(context);
            this.k0 = ld5Var;
            ld5Var.setText(k96.M0(2131747383, null));
            ld5 ld5Var2 = this.k0;
            int i2 = bkb.c6;
            zkb.h(i2, null, ld5Var2);
            j = 0;
            this.d0.addView(this.k0, nme.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.d0.addView(this.e0, nme.o(-1, -2));
            uib uibVar = new uib(context);
            this.S = uibVar;
            ff0 L0 = bkb.L0(true);
            vkb M = zkb.M(i2);
            int i3 = bkb.h6;
            vkb M2 = zkb.M(i3);
            uibVar.setBackground(L0);
            zkb.j(uibVar, L0, M, M2, null);
            this.d0.addView(this.S, nme.o(-1, -2));
            this.S.setOnClickListener(new lw7(this, (byte) 7));
            mhb mhbVar2 = new mhb(context);
            this.o0 = mhbVar2;
            zkb.Z(mhbVar2, context, R.drawable.greydivider, i);
            if (this.c != 0) {
                String M0 = k96.M0(2131747434, null);
                this.A1 = M0;
                str2 = M0;
            } else {
                TLRPC.SecureValueType secureValueType2 = this.G.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    String M02 = k96.M0(2131747432, null);
                    this.A1 = M02;
                    str2 = M02;
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    String M03 = k96.M0(2131747428, null);
                    this.A1 = M03;
                    str2 = M03;
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    String M04 = k96.M0(2131747418, null);
                    this.A1 = M04;
                    str2 = M04;
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    String M05 = k96.M0(2131747416, null);
                    this.A1 = M05;
                    str2 = M05;
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    String M06 = k96.M0(2131747430, null);
                    this.A1 = M06;
                    str2 = M06;
                } else {
                    this.A1 = "";
                    str2 = "";
                }
            }
            HashMap hashMap = this.y1;
            HashMap hashMap2 = this.z1;
            String str4 = str2;
            if (hashMap != null) {
                String str5 = (String) hashMap.get("files_all");
                str4 = str2;
                if (str5 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.A1);
                    spannableStringBuilder.setSpan(new cm4(bkb.o7, null), 0, str5.length(), 33);
                    hashMap2.put("files_all", "");
                    str4 = spannableStringBuilder;
                }
            }
            this.o0.setText(str4);
            this.d0.addView(this.o0, nme.o(-1, -2));
            if (this.G.translation_required) {
                ld5 ld5Var3 = new ld5(context);
                this.k0 = ld5Var3;
                ld5Var3.setText(k96.M0(2131747262, null));
                zkb.h(i2, null, this.k0);
                this.d0.addView(this.k0, nme.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.i0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.d0.addView(this.i0, nme.o(-1, -2));
                uib uibVar2 = new uib(context);
                this.Y = uibVar2;
                ff0 L02 = bkb.L0(true);
                vkb M3 = zkb.M(i2);
                vkb M4 = zkb.M(i3);
                uibVar2.setBackground(L02);
                zkb.j(uibVar2, L02, M3, M4, null);
                this.d0.addView(this.Y, nme.o(-1, -2));
                this.Y.setOnClickListener(new lw7(this, (byte) 8));
                mhb mhbVar3 = new mhb(context);
                this.p0 = mhbVar3;
                zkb.Z(mhbVar3, context, R.drawable.greydivider, i);
                if (this.c != 0) {
                    String M07 = k96.M0(2131747410, null);
                    this.B1 = M07;
                    str3 = M07;
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.G.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        String M08 = k96.M0(2131747415, null);
                        this.B1 = M08;
                        str3 = M08;
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        String M09 = k96.M0(2131747413, null);
                        this.B1 = M09;
                        str3 = M09;
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        String M010 = k96.M0(2131747412, null);
                        this.B1 = M010;
                        str3 = M010;
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        String M011 = k96.M0(2131747411, null);
                        this.B1 = M011;
                        str3 = M011;
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        String M012 = k96.M0(2131747414, null);
                        this.B1 = M012;
                        str3 = M012;
                    } else {
                        this.B1 = "";
                        str3 = "";
                    }
                }
                HashMap hashMap3 = this.y1;
                String str6 = str3;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str3;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.B1);
                        spannableStringBuilder2.setSpan(new cm4(bkb.o7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.p0.setText(str6);
                this.d0.addView(this.p0, nme.o(-1, -2));
            }
        } else {
            j = 0;
            this.actionBar.setTitle(k96.M0(2131747409, null));
        }
        ld5 ld5Var4 = new ld5(context);
        this.k0 = ld5Var4;
        ld5Var4.setText(k96.M0(2131747408, null));
        zkb.h(bkb.c6, null, this.k0);
        this.d0.addView(this.k0, nme.o(-1, -2));
        this.Z = new EditTextBoldCursor[6];
        int i4 = 0;
        while (true) {
            byte b2 = 4;
            if (i4 >= 6) {
                break;
            }
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Z[i4] = editTextBoldCursor;
            tw7 tw7Var = new tw7(context, editTextBoldCursor, b);
            tw7Var.setWillNotDraw(false);
            this.d0.addView(tw7Var, nme.o(-1, -2));
            int i5 = bkb.c6;
            zkb.h(i5, null, tw7Var);
            if (i4 == 5) {
                View view = new View(context);
                this.T = view;
                zkb.h(i5, null, view);
                this.d0.addView(this.T, nme.o(-1, 6));
            }
            if (this.w0 && this.G != null) {
                tw7Var.setVisibility(8);
                View view2 = this.T;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Z[i4].setTag(Integer.valueOf(i4));
            this.Z[i4].setSupportRtlHint(true);
            this.Z[i4].setTextSize(1, 16.0f);
            zkb.A(this.Z[i4], bkb.G6, null);
            zkb.z(this.Z[i4], bkb.K6, null);
            this.Z[i4].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i4];
            int i6 = bkb.F6;
            zkb.X(editTextBoldCursor2, i6, null);
            this.Z[i4].setBackgroundDrawable(null);
            zkb.v(this.Z[i4], i6, null);
            this.Z[i4].setCursorSize(gl.L(20.0f));
            this.Z[i4].setCursorWidth(1.5f);
            zkb.F(this.Z[i4], bkb.j6, bkb.k6, bkb.o7, null);
            EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
            if (i4 == 5) {
                editTextBoldCursorArr[i4].setOnTouchListener(new mw7(this, (byte) 2));
                this.Z[i4].setInputType(0);
                this.Z[i4].setFocusable(false);
            } else {
                editTextBoldCursorArr[i4].setInputType(16385);
                this.Z[i4].setImeOptions(268435461);
            }
            if (i4 == 0) {
                this.Z[i4].setHintText(k96.M0(2131747267, null));
                str = "street_line1";
            } else if (i4 == 1) {
                this.Z[i4].setHintText(k96.M0(2131747266, null));
                str = "street_line2";
            } else if (i4 == 2) {
                this.Z[i4].setHintText(k96.M0(2131747287, null));
                str = "post_code";
            } else if (i4 == 3) {
                this.Z[i4].setHintText(k96.M0(2131747402, null));
                str = "city";
            } else if (i4 == 4) {
                this.Z[i4].setHintText(k96.M0(2131747268, null));
                str = "state";
            } else if (i4 == 5) {
                this.Z[i4].setHintText(k96.M0(2131747401, null));
                str = "country_code";
            } else {
                i4++;
            }
            L1(this.t1, this.Z[i4], str);
            EditTextBoldCursor[] editTextBoldCursorArr2 = this.Z;
            if (i4 == 2) {
                editTextBoldCursorArr2[i4].addTextChangedListener(new uw7(this, editTextBoldCursor, str));
                this.Z[i4].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                editTextBoldCursorArr2[i4].addTextChangedListener(new vw7(this, editTextBoldCursor, str, b));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Z[i4];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Z[i4].setPadding(0, 0, 0, 0);
            this.Z[i4].setGravity((k96.a0 ? 5 : 3) | 16);
            tw7Var.addView(this.Z[i4], nme.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Z[i4].setOnEditorActionListener(new jw7(this, b2));
            i4++;
        }
        b9a b9aVar = new b9a(context, (de9) null);
        this.m0 = b9aVar;
        this.d0.addView(b9aVar, nme.o(-1, -2));
        if (this.w0 && this.G != null) {
            this.k0.setVisibility(8);
            this.m0.setVisibility(8);
        }
        long j2 = this.c;
        TLRPC.TL_secureValue tL_secureValue = this.J;
        if (((j2 == j && this.G != null) || this.I == null || this.w0) && tL_secureValue == null) {
            b9a b9aVar2 = this.m0;
            int i7 = bkb.a7;
            zkb.Z(b9aVar2, context, R.drawable.greydivider_bottom, i7);
            if (this.w0 && this.G != null) {
                zkb.Z(this.o0, context, R.drawable.greydivider_bottom, i7);
            }
        } else {
            if (tL_secureValue != null) {
                J0(tL_secureValue.files);
                L0(tL_secureValue.translation);
            }
            b9a b9aVar3 = this.m0;
            int i8 = bkb.a7;
            zkb.Z(b9aVar3, context, R.drawable.greydivider, i8);
            uib uibVar3 = new uib(context);
            zkb.X(uibVar3.getTextView(), bkb.o7, null);
            ff0 L03 = bkb.L0(true);
            vkb M5 = zkb.M(bkb.c6);
            vkb M6 = zkb.M(bkb.h6);
            uibVar3.setBackground(L03);
            zkb.j(uibVar3, L03, M5, M6, null);
            if (this.G == null) {
                uibVar3.b(k96.M0(2131747394, null), false);
            } else {
                uibVar3.b(k96.M0(2131747399, null), false);
            }
            this.d0.addView(uibVar3, nme.o(-1, -2));
            uibVar3.setOnClickListener(new lw7(this, (byte) 9));
            b9a b9aVar4 = new b9a(context, (de9) null);
            this.m0 = b9aVar4;
            zkb.Z(b9aVar4, context, R.drawable.greydivider_bottom, i8);
            this.d0.addView(this.m0, nme.o(-1, -2));
        }
        V1(0);
        V1(4);
    }

    public final void T1() {
        boolean isEmpty = this.E.values.isEmpty();
        LinearLayout linearLayout = this.B0;
        if (isEmpty) {
            linearLayout.setVisibility(0);
            this.m0.setVisibility(8);
            this.k0.setVisibility(8);
            this.y0.setVisibility(8);
            this.z0.setVisibility(8);
            this.A0.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(8);
        this.m0.setVisibility(0);
        this.k0.setVisibility(0);
        this.z0.setVisibility(0);
        this.A0.setVisibility(0);
        if (l1(TLRPC.TL_secureValueTypePhone.class) || l1(TLRPC.TL_secureValueTypeEmail.class) || l1(TLRPC.TL_secureValueTypePersonalDetails.class) || l1(TLRPC.TL_secureValueTypePassport.class) || l1(TLRPC.TL_secureValueTypeInternalPassport.class) || l1(TLRPC.TL_secureValueTypeIdentityCard.class) || l1(TLRPC.TL_secureValueTypeDriverLicense.class) || l1(TLRPC.TL_secureValueTypeAddress.class) || l1(TLRPC.TL_secureValueTypeUtilityBill.class) || l1(TLRPC.TL_secureValueTypePassportRegistration.class) || l1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) || l1(TLRPC.TL_secureValueTypeBankStatement.class) || l1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.y0.setVisibility(0);
        } else {
            this.y0.setVisibility(8);
        }
    }

    public final void U0() {
        if (getParentActivity() == null || this.S0 != null) {
            return;
        }
        x02 x02Var = new x02(getParentActivity(), this, false, false);
        this.S0 = x02Var;
        x02Var.W3 = new gi3(this);
    }

    public final void U1() {
        ImageView imageView = this.J0;
        if (imageView != null) {
            TL_account.Password password = this.K;
            if (password == null || this.O0 != 0) {
                imageView.setVisibility(8);
                this.K0.setVisibility(8);
                this.L0.setVisibility(8);
                this.M0.setVisibility(8);
                this.a0[0].setVisibility(8);
                this.M.setVisibility(8);
                this.N0.setVisibility(8);
                this.I0.setVisibility(8);
                this.H0.setVisibility(8);
                this.G0.setVisibility(0);
                return;
            }
            boolean z = password.has_password;
            mhb mhbVar = this.H0;
            if (!z) {
                mhbVar.setVisibility(0);
                this.J0.setVisibility(0);
                this.K0.setVisibility(0);
                this.L0.setVisibility(0);
                this.M0.setVisibility(8);
                this.a0[0].setVisibility(8);
                this.M.setVisibility(8);
                this.N0.setVisibility(8);
                this.I0.setVisibility(8);
                this.H0.setLayoutParams(nme.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
                this.G0.setVisibility(8);
                return;
            }
            mhbVar.setVisibility(0);
            this.J0.setVisibility(8);
            this.K0.setVisibility(8);
            this.L0.setVisibility(8);
            this.G0.setVisibility(8);
            this.M0.setVisibility(0);
            this.a0[0].setVisibility(0);
            this.M.setVisibility(0);
            this.N0.setVisibility(0);
            this.I0.setVisibility(0);
            this.H0.setLayoutParams(nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            if (this.Z != null) {
                TL_account.Password password2 = this.K;
                if (password2 == null || TextUtils.isEmpty(password2.hint)) {
                    this.Z[0].setHint(k96.M0(2131748534, null));
                } else {
                    this.Z[0].setHint(this.K.hint);
                }
            }
        }
    }

    public final void V0() {
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(k96.M0(2131747638, null), new dx6((Object) this, (Object) zArr, (byte) 7));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        String M0 = k96.M0(R.string.AppName, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        boolean z = this.w0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (z && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            hdVar.U = k96.M0(2131747400, null);
        } else if (z && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            hdVar.U = k96.M0(2131747393, null);
        } else {
            hdVar.U = k96.M0(2131747397, null);
        }
        if (!this.w0 && this.G != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            ag2 ag2Var = new ag2(getParentActivity(), 1);
            ff0 L0 = bkb.L0(false);
            vkb M = zkb.M(bkb.h6);
            ag2Var.setBackground(L0);
            zkb.j(ag2Var, L0, null, M, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                ag2Var.e(k96.M0(2131747398, null), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                ag2Var.e(k96.M0(2131747396, null), "", true, false, false);
            }
            ag2Var.setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
            frameLayout.addView(ag2Var, nme.e(-1, 48, 51));
            ag2Var.setOnClickListener(new ge(zArr, (byte) 11));
            alertDialog$Builder.n(frameLayout);
        }
        showDialog(hdVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_secureValueTypeDriverLicense) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V1(int i) {
        TLRPC.SecureValueType secureValueType;
        boolean z = true;
        if (i == 0) {
            if (this.S != null) {
                int size = this.j1.size();
                uib uibVar = this.S;
                if (size >= 1) {
                    uibVar.b(k96.M0(2131747260, null), false);
                    return;
                } else {
                    uibVar.b(k96.M0(2131747259, null), false);
                    return;
                }
            }
            return;
        }
        if (i == 1) {
            hhb hhbVar = this.X;
            if (hhbVar != null) {
                hhbVar.setVisibility(this.k1 != null ? 8 : 0);
                return;
            }
            return;
        }
        if (i == 4) {
            if (this.Y != null) {
                int size2 = this.l1.size();
                uib uibVar2 = this.Y;
                if (size2 >= 1) {
                    uibVar2.b(k96.M0(2131747260, null), false);
                    return;
                } else {
                    uibVar2.b(k96.M0(2131747259, null), false);
                    return;
                }
            }
            return;
        }
        if (i != 2) {
            if (i != 3 || this.W == null) {
                return;
            }
            TLRPC.SecureValueType secureValueType2 = this.G.type;
            if ((secureValueType2 instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                this.g0.setVisibility(0);
                this.W.setVisibility(this.n1 != null ? 8 : 0);
                return;
            } else {
                this.g0.setVisibility(8);
                this.W.setVisibility(8);
                return;
            }
        }
        hhb hhbVar2 = this.V;
        if (hhbVar2 != null) {
            TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
            if (tL_secureRequiredType != null) {
                if (!tL_secureRequiredType.selfie_required) {
                    TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
                    if (!(secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                    }
                }
                secureValueType = tL_secureRequiredType.type;
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                    hhbVar2.a(k96.M0(2131747317, null), k96.M0(2131747316, null), z);
                } else {
                    hhbVar2.a(k96.M0(2131747375, null), k96.M0(2131747374, null), z);
                }
                this.V.setVisibility(this.m1 != null ? 8 : 0);
            }
            z = false;
            secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            }
            hhbVar2.a(k96.M0(2131747317, null), k96.M0(2131747316, null), z);
            this.V.setVisibility(this.m1 != null ? 8 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(Context context) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        this.Z0 = new HashMap();
        byte b = 2;
        byte b2 = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        mhb mhbVar = new mhb(context);
        this.q0 = mhbVar;
        int i2 = bkb.a7;
        zkb.Z(mhbVar, context, R.drawable.greydivider_top, i2);
        byte b3 = 0;
        this.q0.setPadding(0, gl.L(7.0f), 0, 0);
        int i3 = -1;
        this.d0.addView(this.q0, nme.o(-1, -2));
        S0(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.F;
        byte b4 = 3;
        wjb wjbVar = null;
        if (tL_secureRequiredType != null) {
            ld5 ld5Var = new ld5(context);
            this.k0 = ld5Var;
            if (this.w0) {
                ld5Var.setText(k96.M0(2131747383, null));
            } else {
                ld5Var.setText(k96.M0(2131747282, null));
            }
            ld5 ld5Var2 = this.k0;
            i = bkb.c6;
            zkb.h(i, null, ld5Var2);
            this.d0.addView(this.k0, nme.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f0 = linearLayout;
            linearLayout.setOrientation(1);
            this.d0.addView(this.f0, nme.o(-1, -2));
            hhb hhbVar = new hhb(context);
            this.V = hhbVar;
            ff0 L0 = bkb.L0(true);
            vkb M = zkb.M(i);
            int i4 = bkb.h6;
            vkb M2 = zkb.M(i4);
            hhbVar.setBackground(L0);
            zkb.j(hhbVar, L0, M, M2, null);
            this.d0.addView(this.V, nme.o(-1, -2));
            this.V.setOnClickListener(new lw7(this, b3));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.g0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.d0.addView(this.g0, nme.o(-1, -2));
            boolean z = this.G.selfie_required;
            hhb hhbVar2 = new hhb(context);
            this.W = hhbVar2;
            ff0 L02 = bkb.L0(true);
            vkb M3 = zkb.M(i);
            vkb M4 = zkb.M(i4);
            hhbVar2.setBackground(L02);
            zkb.j(hhbVar2, L02, M3, M4, null);
            this.W.a(k96.M0(2131747279, null), k96.M0(2131747278, null), z);
            this.d0.addView(this.W, nme.o(-1, -2));
            this.W.setOnClickListener(new lw7(this, b));
            if (this.G.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.h0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.d0.addView(this.h0, nme.o(-1, -2));
                hhb hhbVar3 = new hhb(context);
                this.X = hhbVar3;
                ff0 L03 = bkb.L0(true);
                vkb M5 = zkb.M(i);
                vkb M6 = zkb.M(i4);
                hhbVar3.setBackground(L03);
                zkb.j(hhbVar3, L03, M5, M6, null);
                this.X.a(k96.M0(2131747270, null), k96.M0(2131747269, null), tL_secureRequiredType2.translation_required);
                this.d0.addView(this.X, nme.o(-1, -2));
                this.X.setOnClickListener(new lw7(this, b4));
            }
            mhb mhbVar2 = new mhb(context);
            this.o0 = mhbVar2;
            zkb.Z(mhbVar2, context, R.drawable.greydivider, i2);
            this.o0.setText(k96.M0(2131747296, null));
            this.d0.addView(this.o0, nme.o(-1, -2));
            if (this.G.translation_required) {
                ld5 ld5Var3 = new ld5(context);
                this.k0 = ld5Var3;
                ld5Var3.setText(k96.M0(2131747262, null));
                zkb.h(i, null, this.k0);
                this.d0.addView(this.k0, nme.o(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.i0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.d0.addView(this.i0, nme.o(-1, -2));
                uib uibVar = new uib(context);
                this.Y = uibVar;
                ff0 L04 = bkb.L0(true);
                vkb M7 = zkb.M(i);
                vkb M8 = zkb.M(i4);
                uibVar.setBackground(L04);
                zkb.j(uibVar, L04, M7, M8, null);
                this.d0.addView(this.Y, nme.o(-1, -2));
                this.Y.setOnClickListener(new lw7(this, (byte) 4));
                mhb mhbVar3 = new mhb(context);
                this.p0 = mhbVar3;
                zkb.Z(mhbVar3, context, R.drawable.greydivider, i2);
                if (this.c != 0) {
                    String M0 = k96.M0(2131747410, null);
                    this.B1 = M0;
                    str4 = M0;
                } else {
                    TLRPC.SecureValueType secureValueType = this.G.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        String M02 = k96.M0(2131747420, null);
                        this.B1 = M02;
                        str4 = M02;
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        String M03 = k96.M0(2131747423, null);
                        this.B1 = M03;
                        str4 = M03;
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        String M04 = k96.M0(2131747425, null);
                        this.B1 = M04;
                        str4 = M04;
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        String M05 = k96.M0(2131747426, null);
                        this.B1 = M05;
                        str4 = M05;
                    } else {
                        this.B1 = "";
                        str4 = "";
                    }
                }
                HashMap hashMap = this.y1;
                String str5 = str4;
                if (hashMap != null) {
                    String str6 = (String) hashMap.get("translation_all");
                    str5 = str4;
                    if (str6 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.B1);
                        spannableStringBuilder.setSpan(new cm4(bkb.o7, null), 0, str6.length(), 33);
                        this.z1.put("translation_all", "");
                        str5 = spannableStringBuilder;
                    }
                }
                this.p0.setText(str5);
                this.d0.addView(this.p0, nme.o(-1, -2));
            }
        } else {
            uib uibVar2 = new uib(context);
            this.s0 = uibVar2;
            ff0 L05 = bkb.L0(true);
            i = bkb.c6;
            vkb M9 = zkb.M(i);
            vkb M10 = zkb.M(bkb.h6);
            uibVar2.setBackground(L05);
            zkb.j(uibVar2, L05, M9, M10, null);
            this.s0.b(k96.M0(2131747277, null), false);
            this.d0.addView(this.s0, nme.o(-1, -2));
            this.s0.setOnClickListener(new lw7(this, (byte) 5));
            mhb mhbVar4 = new mhb(context);
            this.o0 = mhbVar4;
            zkb.Z(mhbVar4, context, R.drawable.greydivider, i2);
            this.o0.setText(k96.M0(2131747276, null));
            this.d0.addView(this.o0, nme.o(-1, -2));
        }
        ld5 ld5Var4 = new ld5(context);
        this.k0 = ld5Var4;
        if (this.w0) {
            ld5Var4.setText(k96.M0(2131747385, null));
        } else {
            ld5Var4.setText(k96.M0(2131747299, null));
        }
        zkb.h(i, null, this.k0);
        this.d0.addView(this.k0, nme.o(-1, -2));
        int i5 = 7;
        int i6 = this.G != null ? 9 : 7;
        this.Z = new EditTextBoldCursor[i6];
        int i7 = 0;
        while (true) {
            byte b5 = 6;
            HashMap hashMap2 = this.t1;
            if (i7 >= i6) {
                b9a b9aVar = new b9a(context, (de9) null);
                this.n0 = b9aVar;
                this.d0.addView(b9aVar, nme.o(-1, -2));
                ld5 ld5Var5 = new ld5(context);
                this.k0 = ld5Var5;
                zkb.h(bkb.c6, null, ld5Var5);
                this.d0.addView(this.k0, nme.o(-1, -2));
                this.b0 = new EditTextBoldCursor[3];
                int i8 = 0;
                for (int i9 = 3; i8 < i9; i9 = 3) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.b0[i8] = editTextBoldCursor;
                    tw7 tw7Var = new tw7(context, editTextBoldCursor, (byte) 2);
                    tw7Var.setWillNotDraw(false);
                    this.d0.addView(tw7Var, nme.o(-1, 64));
                    int i10 = bkb.c6;
                    zkb.h(i10, null, tw7Var);
                    if (i8 == 2) {
                        View view = new View(context);
                        this.U = view;
                        zkb.h(i10, null, view);
                        this.d0.addView(this.U, nme.o(-1, 6));
                    }
                    this.b0[i8].setTag(Integer.valueOf(i8));
                    this.b0[i8].setSupportRtlHint(true);
                    this.b0[i8].setTextSize(1, 16.0f);
                    zkb.A(this.b0[i8], bkb.G6, null);
                    EditTextBoldCursor editTextBoldCursor2 = this.b0[i8];
                    int i11 = bkb.F6;
                    zkb.X(editTextBoldCursor2, i11, null);
                    zkb.z(this.b0[i8], bkb.K6, null);
                    this.b0[i8].setTransformHintToHeader(true);
                    this.b0[i8].setBackgroundDrawable(null);
                    zkb.v(this.b0[i8], i11, null);
                    this.b0[i8].setCursorSize(gl.L(20.0f));
                    this.b0[i8].setCursorWidth(1.5f);
                    zkb.F(this.b0[i8], bkb.j6, bkb.k6, bkb.o7, null);
                    this.b0[i8].setInputType(16385);
                    this.b0[i8].setImeOptions(268435461);
                    if (i8 == 0) {
                        str = "first_name_native";
                    } else if (i8 == 1) {
                        str = "middle_name_native";
                    } else if (i8 == 2) {
                        str = "last_name_native";
                    } else {
                        i8++;
                    }
                    L1(hashMap2, this.b0[i8], str);
                    EditTextBoldCursor editTextBoldCursor3 = this.b0[i8];
                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                    byte b6 = 2;
                    if (i8 == 0 || i8 == 2 || i8 == 1) {
                        this.b0[i8].addTextChangedListener(new vw7(this, editTextBoldCursor, str, b6));
                    }
                    this.b0[i8].setPadding(0, 0, 0, 0);
                    this.b0[i8].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var.addView(this.b0[i8], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.b0[i8].setOnEditorActionListener(new jw7(this, (byte) 2));
                    i8++;
                }
                mhb mhbVar5 = new mhb(context);
                this.r0 = mhbVar5;
                this.d0.addView(mhbVar5, nme.o(-1, -2));
                long j = this.c;
                TLRPC.TL_secureValue tL_secureValue = this.J;
                if (((j == 0 && this.G != null) || this.I == null || this.w0) && tL_secureValue == null) {
                    zkb.Z(this.r0, context, R.drawable.greydivider_bottom, bkb.a7);
                } else {
                    if (tL_secureValue != null) {
                        J0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            I0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            I0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            I0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        L0(tL_secureValue.translation);
                    }
                    uib uibVar3 = new uib(context);
                    zkb.X(uibVar3.getTextView(), bkb.o7, null);
                    ff0 L06 = bkb.L0(true);
                    vkb M11 = zkb.M(bkb.c6);
                    vkb M12 = zkb.M(bkb.h6);
                    uibVar3.setBackground(L06);
                    zkb.j(uibVar3, L06, M11, M12, null);
                    if (this.G == null) {
                        uibVar3.b(k96.M0(2131747394, null), false);
                    } else {
                        uibVar3.b(k96.M0(2131747399, null), false);
                    }
                    this.d0.addView(uibVar3, nme.o(-1, -2));
                    uibVar3.setOnClickListener(new lw7(this, b2));
                    mhb mhbVar6 = this.r0;
                    int i12 = bkb.a7;
                    zkb.Z(mhbVar6, context, R.drawable.greydivider, i12);
                    b9a b9aVar2 = new b9a(context, (de9) null);
                    this.m0 = b9aVar2;
                    zkb.Z(b9aVar2, context, R.drawable.greydivider_bottom, i12);
                    this.d0.addView(this.m0, nme.o(-1, -2));
                }
                S1();
                Q0(false);
                return;
            }
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            this.Z[i7] = editTextBoldCursor4;
            tw7 tw7Var2 = new tw7(context, editTextBoldCursor4, b2);
            tw7Var2.setWillNotDraw(false);
            this.d0.addView(tw7Var2, nme.o(i3, 64));
            int i13 = bkb.c6;
            zkb.h(i13, wjbVar, tw7Var2);
            if (i7 == i6 - 1) {
                View view2 = new View(context);
                this.T = view2;
                zkb.h(i13, wjbVar, view2);
                this.d0.addView(this.T, nme.o(i3, 6));
            }
            if (this.w0 && this.G != null && i7 < i5) {
                tw7Var2.setVisibility(8);
                View view3 = this.T;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            this.Z[i7].setTag(Integer.valueOf(i7));
            this.Z[i7].setSupportRtlHint(true);
            this.Z[i7].setTextSize(1, 16.0f);
            zkb.A(this.Z[i7], bkb.G6, null);
            EditTextBoldCursor editTextBoldCursor5 = this.Z[i7];
            int i14 = bkb.F6;
            zkb.X(editTextBoldCursor5, i14, null);
            zkb.z(this.Z[i7], bkb.K6, null);
            this.Z[i7].setTransformHintToHeader(true);
            this.Z[i7].setBackgroundDrawable(null);
            zkb.v(this.Z[i7], i14, null);
            this.Z[i7].setCursorSize(gl.L(20.0f));
            this.Z[i7].setCursorWidth(1.5f);
            zkb.F(this.Z[i7], bkb.j6, bkb.k6, bkb.o7, null);
            if (i7 == 5 || i7 == 6) {
                this.Z[i7].setOnTouchListener(new mw7(this, (byte) 0));
                this.Z[i7].setInputType(0);
            } else if (i7 == 3 || i7 == 8) {
                this.Z[i7].setOnTouchListener(new f8(this, context, b5));
                this.Z[i7].setInputType(0);
                this.Z[i7].setFocusable(false);
            } else {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i7 == 4) {
                    editTextBoldCursorArr[i7].setOnTouchListener(new mw7(this, b2));
                    this.Z[i7].setInputType(0);
                    this.Z[i7].setFocusable(false);
                } else {
                    editTextBoldCursorArr[i7].setInputType(16385);
                    this.Z[i7].setImeOptions(268435461);
                }
            }
            HashMap hashMap3 = this.u1;
            switch (i7) {
                case 0:
                    boolean z2 = tL_secureRequiredType2.native_names;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.Z;
                    if (z2) {
                        editTextBoldCursorArr2[i7].setHintText(k96.M0(2131747308, null));
                    } else {
                        editTextBoldCursorArr2[i7].setHintText(k96.M0(2131747311, null));
                    }
                    str2 = "first_name";
                    L1(hashMap2, this.Z[i7], str2);
                    EditTextBoldCursor editTextBoldCursor6 = this.Z[i7];
                    editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                    if (i7 != 0 || i7 == 2 || i7 == 1) {
                        this.Z[i7].addTextChangedListener(new vw7(this, editTextBoldCursor4, str2, b2));
                    } else {
                        this.Z[i7].addTextChangedListener(new ww7(this, editTextBoldCursor4, str2, hashMap2));
                    }
                    this.Z[i7].setPadding(0, 0, 0, 0);
                    this.Z[i7].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var2.addView(this.Z[i7], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i7].setOnEditorActionListener(new jw7(this, b2));
                    break;
                case 1:
                    boolean z3 = tL_secureRequiredType2.native_names;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = this.Z;
                    if (z3) {
                        editTextBoldCursorArr3[i7].setHintText(k96.M0(2131747312, null));
                    } else {
                        editTextBoldCursorArr3[i7].setHintText(k96.M0(2131747314, null));
                    }
                    str2 = "middle_name";
                    L1(hashMap2, this.Z[i7], str2);
                    EditTextBoldCursor editTextBoldCursor62 = this.Z[i7];
                    editTextBoldCursor62.setSelection(editTextBoldCursor62.length());
                    if (i7 != 0) {
                        break;
                    }
                    this.Z[i7].addTextChangedListener(new vw7(this, editTextBoldCursor4, str2, b2));
                    this.Z[i7].setPadding(0, 0, 0, 0);
                    this.Z[i7].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var2.addView(this.Z[i7], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i7].setOnEditorActionListener(new jw7(this, b2));
                    break;
                case 2:
                    boolean z4 = tL_secureRequiredType2.native_names;
                    EditTextBoldCursor[] editTextBoldCursorArr4 = this.Z;
                    if (z4) {
                        editTextBoldCursorArr4[i7].setHintText(k96.M0(2131747263, null));
                    } else {
                        editTextBoldCursorArr4[i7].setHintText(k96.M0(2131747265, null));
                    }
                    str2 = "last_name";
                    L1(hashMap2, this.Z[i7], str2);
                    EditTextBoldCursor editTextBoldCursor622 = this.Z[i7];
                    editTextBoldCursor622.setSelection(editTextBoldCursor622.length());
                    if (i7 != 0) {
                    }
                    this.Z[i7].addTextChangedListener(new vw7(this, editTextBoldCursor4, str2, b2));
                    this.Z[i7].setPadding(0, 0, 0, 0);
                    this.Z[i7].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var2.addView(this.Z[i7], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i7].setOnEditorActionListener(new jw7(this, b2));
                    break;
                case 3:
                    this.Z[i7].setHintText(k96.M0(2131747404, null));
                    str2 = "birth_date";
                    L1(hashMap2, this.Z[i7], str2);
                    EditTextBoldCursor editTextBoldCursor6222 = this.Z[i7];
                    editTextBoldCursor6222.setSelection(editTextBoldCursor6222.length());
                    if (i7 != 0) {
                    }
                    this.Z[i7].addTextChangedListener(new vw7(this, editTextBoldCursor4, str2, b2));
                    this.Z[i7].setPadding(0, 0, 0, 0);
                    this.Z[i7].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var2.addView(this.Z[i7], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i7].setOnEditorActionListener(new jw7(this, b2));
                    break;
                case 4:
                    this.Z[i7].setHintText(k96.M0(2131747373, null));
                    str2 = "gender";
                    L1(hashMap2, this.Z[i7], str2);
                    EditTextBoldCursor editTextBoldCursor62222 = this.Z[i7];
                    editTextBoldCursor62222.setSelection(editTextBoldCursor62222.length());
                    if (i7 != 0) {
                    }
                    this.Z[i7].addTextChangedListener(new vw7(this, editTextBoldCursor4, str2, b2));
                    this.Z[i7].setPadding(0, 0, 0, 0);
                    this.Z[i7].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var2.addView(this.Z[i7], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i7].setOnEditorActionListener(new jw7(this, b2));
                    break;
                case 5:
                    this.Z[i7].setHintText(k96.M0(2131747403, null));
                    str2 = "country_code";
                    L1(hashMap2, this.Z[i7], str2);
                    EditTextBoldCursor editTextBoldCursor622222 = this.Z[i7];
                    editTextBoldCursor622222.setSelection(editTextBoldCursor622222.length());
                    if (i7 != 0) {
                    }
                    this.Z[i7].addTextChangedListener(new vw7(this, editTextBoldCursor4, str2, b2));
                    this.Z[i7].setPadding(0, 0, 0, 0);
                    this.Z[i7].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var2.addView(this.Z[i7], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i7].setOnEditorActionListener(new jw7(this, b2));
                    break;
                case 6:
                    this.Z[i7].setHintText(k96.M0(2131747281, null));
                    str2 = "residence_country_code";
                    L1(hashMap2, this.Z[i7], str2);
                    EditTextBoldCursor editTextBoldCursor6222222 = this.Z[i7];
                    editTextBoldCursor6222222.setSelection(editTextBoldCursor6222222.length());
                    if (i7 != 0) {
                    }
                    this.Z[i7].addTextChangedListener(new vw7(this, editTextBoldCursor4, str2, b2));
                    this.Z[i7].setPadding(0, 0, 0, 0);
                    this.Z[i7].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var2.addView(this.Z[i7], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i7].setOnEditorActionListener(new jw7(this, b2));
                    break;
                case 7:
                    this.Z[i7].setHintText(k96.M0(2131747384, null));
                    str3 = "document_no";
                    str2 = str3;
                    hashMap2 = hashMap3;
                    L1(hashMap2, this.Z[i7], str2);
                    EditTextBoldCursor editTextBoldCursor62222222 = this.Z[i7];
                    editTextBoldCursor62222222.setSelection(editTextBoldCursor62222222.length());
                    if (i7 != 0) {
                    }
                    this.Z[i7].addTextChangedListener(new vw7(this, editTextBoldCursor4, str2, b2));
                    this.Z[i7].setPadding(0, 0, 0, 0);
                    this.Z[i7].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var2.addView(this.Z[i7], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i7].setOnEditorActionListener(new jw7(this, b2));
                    break;
                case 8:
                    this.Z[i7].setHintText(k96.M0(2131747377, null));
                    str3 = "expiry_date";
                    str2 = str3;
                    hashMap2 = hashMap3;
                    L1(hashMap2, this.Z[i7], str2);
                    EditTextBoldCursor editTextBoldCursor622222222 = this.Z[i7];
                    editTextBoldCursor622222222.setSelection(editTextBoldCursor622222222.length());
                    if (i7 != 0) {
                    }
                    this.Z[i7].addTextChangedListener(new vw7(this, editTextBoldCursor4, str2, b2));
                    this.Z[i7].setPadding(0, 0, 0, 0);
                    this.Z[i7].setGravity((k96.a0 ? 5 : 3) | 16);
                    tw7Var2.addView(this.Z[i7], nme.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i7].setOnEditorActionListener(new jw7(this, b2));
                    break;
            }
            i7++;
            i5 = 7;
            i3 = -1;
            wjbVar = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(Context context) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ArrayList arrayList;
        boolean z;
        vx7 vx7Var = this;
        Context context2 = context;
        vx7Var.actionBar.setTitle(k96.M0(2131743996, null));
        vx7Var.actionBar.t().a(1, R.drawable.msg_info);
        ld5 ld5Var = new ld5(context2);
        vx7Var.k0 = ld5Var;
        ld5Var.setText(k96.M0(2131747286, null));
        ld5 ld5Var2 = vx7Var.k0;
        int i = bkb.c6;
        zkb.h(i, null, ld5Var2);
        vx7Var.d0.addView(vx7Var.k0, nme.o(-1, -2));
        b9a b9aVar = new b9a(context2, (de9) null);
        vx7Var.m0 = b9aVar;
        int i2 = bkb.a7;
        zkb.Z(b9aVar, context2, R.drawable.greydivider, i2);
        vx7Var.d0.addView(vx7Var.m0, nme.o(-1, -2));
        uib uibVar = new uib(context2);
        vx7Var.y0 = uibVar;
        ff0 L0 = bkb.L0(true);
        vkb M = zkb.M(i);
        int i3 = bkb.h6;
        vkb M2 = zkb.M(i3);
        uibVar.setBackground(L0);
        zkb.j(uibVar, L0, M, M2, null);
        vx7Var.y0.b(k96.M0(2131747303, null), true);
        vx7Var.d0.addView(vx7Var.y0, nme.o(-1, -2));
        vx7Var.y0.setOnClickListener(new lw7(vx7Var, (byte) 12));
        uib uibVar2 = new uib(context2);
        vx7Var.z0 = uibVar2;
        zkb.X(uibVar2.getTextView(), bkb.o7, null);
        zkb.R(vx7Var.z0, bkb.L0(true), zkb.M(i), zkb.M(i3), null);
        vx7Var.z0.b(k96.M0(2131743993, null), false);
        vx7Var.d0.addView(vx7Var.z0, nme.o(-1, -2));
        vx7Var.z0.setOnClickListener(new lw7(vx7Var, (byte) 13));
        b9a b9aVar2 = new b9a(context2, (de9) null);
        vx7Var.A0 = b9aVar2;
        zkb.Z(b9aVar2, context2, R.drawable.greydivider_bottom, i2);
        vx7Var.d0.addView(vx7Var.A0, nme.o(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context2);
        vx7Var.B0 = linearLayout;
        linearLayout.setOrientation(1);
        vx7Var.B0.setGravity(17);
        zkb.Z(vx7Var.B0, context2, R.drawable.greydivider_bottom, i2);
        boolean O1 = gl.O1();
        LinearLayout linearLayout2 = vx7Var.d0;
        LinearLayout linearLayout3 = vx7Var.B0;
        if (O1) {
            linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, gl.L(528.0f) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()));
        } else {
            linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, gl.q.y - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()));
        }
        ImageView imageView = new ImageView(context2);
        vx7Var.C0 = imageView;
        imageView.setImageResource(R.drawable.no_passport);
        zkb.s(vx7Var.C0, bkb.sj, null, PorterDuff.Mode.MULTIPLY);
        vx7Var.B0.addView(vx7Var.C0, nme.o(-2, -2));
        TextView textView = new TextView(context2);
        vx7Var.D0 = textView;
        int i4 = bkb.y6;
        zkb.X(textView, i4, null);
        vx7Var.D0.setGravity(17);
        vx7Var.D0.setTextSize(1, 15.0f);
        vx7Var.D0.setTypeface(gl.o());
        vx7Var.D0.setText(k96.M0(2131747304, null));
        TextView m = ug8.m(vx7Var.B0, vx7Var.D0, nme.t(-2, -2, 17, 0, 16, 0, 0), context2);
        vx7Var.E0 = m;
        zkb.X(m, i4, null);
        vx7Var.E0.setGravity(17);
        vx7Var.E0.setTextSize(1, 14.0f);
        vx7Var.E0.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
        vx7Var.E0.setText(k96.M0(2131747302, null));
        TextView m2 = ug8.m(vx7Var.B0, vx7Var.E0, nme.t(-2, -2, 17, 0, 14, 0, 0), context2);
        vx7Var.F0 = m2;
        int i5 = bkb.p6;
        zkb.X(m2, i5, null);
        vx7Var.F0.setPadding(gl.L(12.0f), gl.L(4.0f), gl.L(12.0f), gl.L(4.0f));
        zkb.R(vx7Var.F0, bkb.f0(bm2.o(bkb.w0(null, i5, false), 32), 7, -1), null, zkb.g(i5, 32), null);
        vx7Var.F0.setGravity(17);
        vx7Var.F0.setTextSize(1, 15.0f);
        vx7Var.F0.setTypeface(gl.o());
        vx7Var.F0.setGravity(17);
        vx7Var.F0.setText(k96.M0(2131747303, null).toUpperCase());
        vx7Var.B0.addView(vx7Var.F0, nme.t(-2, 30, 17, 0, 12, 0, 0));
        vx7Var.F0.setOnClickListener(new lw7(vx7Var, (byte) 14));
        int size = vx7Var.E.values.size();
        int i6 = 0;
        while (i6 < size) {
            TLRPC.TL_secureValue tL_secureValue = vx7Var.E.values.get(i6);
            if (n1(tL_secureValue.type)) {
                arrayList = new ArrayList();
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = tL_secureValue.type;
                tL_secureRequiredType2.selfie_required = true;
                tL_secureRequiredType2.translation_required = true;
                arrayList.add(tL_secureRequiredType2);
                tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
            } else if (m1(tL_secureValue.type)) {
                arrayList = new ArrayList();
                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType3.type = tL_secureValue.type;
                tL_secureRequiredType3.translation_required = true;
                arrayList.add(tL_secureRequiredType3);
                tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
            } else {
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType4.type = tL_secureValue.type;
                tL_secureRequiredType = tL_secureRequiredType4;
                arrayList = null;
                z = false;
                vx7Var.K0(context2, tL_secureRequiredType, arrayList, z, i6 != size + (-1));
                i6++;
                vx7Var = this;
                context2 = context;
            }
            z = true;
            vx7Var.K0(context2, tL_secureRequiredType, arrayList, z, i6 != size + (-1));
            i6++;
            vx7Var = this;
            context2 = context;
        }
        T1();
    }

    public final void Y0(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(k96.M0(2131747295, null));
        this.Z0 = new HashMap();
        byte b = 3;
        byte b2 = 1;
        byte b3 = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.V0.add(0, split[2]);
                this.W0.put(split[2], split[0]);
                this.X0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.Y0.put(split[0], split[3]);
                }
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        Collections.sort(this.V0, new sa((byte) 9));
        String str3 = y6c.h(this.currentAccount).f().phone;
        uib uibVar = new uib(context);
        zkb.X(uibVar.getTextView(), bkb.p6, null);
        ff0 L0 = bkb.L0(true);
        int i = bkb.c6;
        vkb M = zkb.M(i);
        vkb M2 = zkb.M(bkb.h6);
        uibVar.setBackground(L0);
        zkb.j(uibVar, L0, M, M2, null);
        uibVar.b(k96.a0("PassportPhoneUseSame", null, 2131747291, p38.f().e("+" + str3)), false);
        this.d0.addView(uibVar, nme.o(-1, -2));
        uibVar.setOnClickListener(new lw7(this, (byte) 16));
        mhb mhbVar = new mhb(context);
        this.o0 = mhbVar;
        zkb.Z(mhbVar, context, R.drawable.greydivider_bottom, bkb.a7);
        this.o0.setText(k96.M0(2131747289, null));
        this.d0.addView(this.o0, nme.o(-1, -2));
        ld5 ld5Var = new ld5(context);
        this.k0 = ld5Var;
        ld5Var.setText(k96.M0(2131747292, null));
        zkb.h(i, null, this.k0);
        this.d0.addView(this.k0, nme.o(-1, -2));
        this.Z = new EditTextBoldCursor[3];
        for (int i2 = 0; i2 < 3; i2++) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
            if (i2 == 2) {
                editTextBoldCursorArr[i2] = new fe5(context);
            } else {
                editTextBoldCursorArr[i2] = new EditTextBoldCursor(context);
            }
            if (i2 == 1) {
                frameLayout = de9.j(context, 0);
                this.d0.addView(frameLayout, nme.o(-1, 50));
                zkb.h(bkb.c6, null, frameLayout);
            } else if (i2 == 2) {
                frameLayout = (ViewGroup) this.Z[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.d0.addView(frameLayout, nme.o(-1, 50));
                zkb.h(bkb.c6, null, frameLayout);
            }
            this.Z[i2].setTag(Integer.valueOf(i2));
            this.Z[i2].setTextSize(1, 16.0f);
            zkb.D(this.Z[i2], bkb.G6, null);
            EditTextBoldCursor editTextBoldCursor = this.Z[i2];
            int i3 = bkb.F6;
            zkb.X(editTextBoldCursor, i3, null);
            this.Z[i2].setBackgroundDrawable(null);
            zkb.v(this.Z[i2], i3, null);
            this.Z[i2].setCursorSize(gl.L(20.0f));
            this.Z[i2].setCursorWidth(1.5f);
            EditTextBoldCursor[] editTextBoldCursorArr2 = this.Z;
            if (i2 == 0) {
                editTextBoldCursorArr2[i2].setOnTouchListener(new mw7(this, b));
                this.Z[i2].setText(k96.M0(2131752122, null));
                this.Z[i2].setInputType(0);
                this.Z[i2].setFocusable(false);
            } else {
                editTextBoldCursorArr2[i2].setInputType(3);
                EditTextBoldCursor[] editTextBoldCursorArr3 = this.Z;
                if (i2 == 2) {
                    editTextBoldCursorArr3[i2].setImeOptions(268435462);
                } else {
                    editTextBoldCursorArr3[i2].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i2];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            if (i2 == 1) {
                TextView textView = new TextView(context);
                this.x0 = textView;
                textView.setText("+");
                zkb.X(this.x0, i3, null);
                this.x0.setTextSize(1, 16.0f);
                frameLayout.addView(this.x0, nme.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Z[i2].setPadding(gl.L(10.0f), 0, 0, 0);
                this.Z[i2].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Z[i2].setGravity(19);
                frameLayout.addView(this.Z[i2], nme.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Z[i2].addTextChangedListener(new hx7(this, b2));
            } else {
                EditTextBoldCursor[] editTextBoldCursorArr4 = this.Z;
                if (i2 == 2) {
                    editTextBoldCursorArr4[i2].setPadding(0, 0, 0, 0);
                    this.Z[i2].setGravity(19);
                    this.Z[i2].setHintText(null);
                    this.Z[i2].setHint(k96.M0(2131747179, null));
                    frameLayout.addView(this.Z[i2], nme.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                    this.Z[i2].addTextChangedListener(new ej2(this, b));
                } else {
                    editTextBoldCursorArr4[i2].setPadding(0, 0, 0, gl.L(6.0f));
                    this.Z[i2].setGravity(k96.a0 ? 5 : 3);
                    frameLayout.addView(this.Z[i2], nme.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                }
            }
            this.Z[i2].setOnEditorActionListener(new jw7(this, b3));
            if (i2 == 2) {
                this.Z[i2].setOnKeyListener(new w6(this, (byte) 4));
            }
            if (i2 == 0) {
                View view = new View(context);
                this.l0.add(view);
                zkb.h(bkb.c7, null, view);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Z0.get(str)) != null && this.V0.indexOf(str2) != -1) {
                this.Z[1].setText((CharSequence) this.W0.get(str2));
            }
            mhb mhbVar2 = new mhb(context);
            this.o0 = mhbVar2;
            zkb.Z(mhbVar2, context, R.drawable.greydivider_bottom, bkb.a7);
            this.o0.setText(k96.M0(2131747293, null));
            this.d0.addView(this.o0, nme.o(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Z[1].setText((CharSequence) this.W0.get(str2));
        }
        mhb mhbVar22 = new mhb(context);
        this.o0 = mhbVar22;
        zkb.Z(mhbVar22, context, R.drawable.greydivider_bottom, bkb.a7);
        this.o0.setText(k96.M0(2131747293, null));
        this.d0.addView(this.o0, nme.o(-1, -2));
    }

    public final byte[] a1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.d1, 0, bArr5, 0, 32);
        Utilities.b(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!R0(bArr5, null)) {
            return null;
        }
        byte[] r = Utilities.r(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(r, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(r, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.D7));
        hashSet.add(Integer.valueOf(bkb.C7));
        hashSet.add(Integer.valueOf(bkb.Ci));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z, final kw7 kw7Var, final nw7 nw7Var, final boolean z2) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (!z2 || tL_secureRequiredType2 == null) {
            if (z) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        } else {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() { // from class: qw7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gl.c3(new d77(vx7.this, tL_error, nw7Var, z2, tL_secureRequiredType2, tL_secureRequiredType, z, arrayList, kw7Var));
            }
        });
    }

    public final gl2 c1(byte[] bArr) {
        byte[] i1 = i1();
        int nextInt = Utilities.b.nextInt(kk7.l3) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.b.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] o = Utilities.o(length, bArr3);
        byte[] r = Utilities.r(i1, o);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r, 32, bArr5, 0, 16);
        Utilities.b(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.d1, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] r2 = Utilities.r(bArr8, o);
        byte[] bArr9 = new byte[32];
        System.arraycopy(r2, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(r2, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(i1, 0, bArr11, 0, 32);
        Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        gl2 gl2Var = new gl2((byte) 10, false);
        gl2Var.d = bArr3;
        gl2Var.b = bArr11;
        gl2Var.e = o;
        gl2Var.c = i1;
        gl2Var.f = new vu9(bArr4, bArr5);
        return gl2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0a3a  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i;
        int i2;
        TLRPC.User user;
        wjb wjbVar;
        ArrayList arrayList;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        boolean z;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.User f;
        x02 x02Var;
        Context context2 = context;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new gx7(this));
        byte b = 4;
        int i3 = this.b;
        if (i3 == 7) {
            xc xcVar = new xc(this, context2, b);
            this.c0 = xcVar;
            this.fragmentView = xcVar;
            xcVar.setFillViewport(true);
            gl.u3(this.c0, bkb.w0(null, bkb.r8, false));
        } else {
            FrameLayout frameLayout = new FrameLayout(context2);
            this.fragmentView = frameLayout;
            zkb.h(bkb.Z6, null, frameLayout);
            zh3 zh3Var = new zh3(context2, b);
            this.c0 = zh3Var;
            zh3Var.setFillViewport(true);
            gl.u3(this.c0, bkb.w0(null, bkb.r8, false));
            frameLayout.addView(this.c0, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i3 == 0 ? 48.0f : 0.0f));
            LinearLayout linearLayout = new LinearLayout(context2);
            this.d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.c0.addView(this.d0, new FrameLayout.LayoutParams(-1, -2));
        }
        if (i3 != 0 && i3 != 8) {
            this.M = this.actionBar.t().h(2, R.drawable.ic_ab_done, gl.L(56.0f), k96.M0(2131751342, null));
            cw2 cw2Var = new cw2(context2, 1);
            this.O = cw2Var;
            cw2Var.setAlpha(0.0f);
            this.O.setScaleX(0.1f);
            this.O.setScaleY(0.1f);
            this.O.setVisibility(4);
            this.M.addView(this.O, nme.c(-1.0f, -1));
            if ((i3 == 1 || i3 == 2) && (x02Var = this.S0) != null) {
                try {
                    if (x02Var.isShowing()) {
                        this.S0.dismiss();
                    }
                } catch (Exception unused) {
                }
                this.S0.e1();
                this.S0 = null;
            }
        }
        if (i3 == 5) {
            if (this.E != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.E.users.size()) {
                        f = null;
                        break;
                    }
                    TLRPC.User user2 = this.E.users.get(i4);
                    int i5 = i4;
                    if (user2.id == this.c) {
                        f = user2;
                        break;
                    }
                    i4 = i5 + 1;
                }
            } else {
                f = y6c.h(this.currentAccount).f();
            }
            FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(k96.M0(2131743996, null));
            g24 g24Var = new g24(context2, null);
            this.G0 = g24Var;
            g24Var.b();
            frameLayout2.addView(this.G0, nme.c(-1.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context2);
            this.M0 = frameLayout3;
            this.d0.addView(frameLayout3, nme.o(-1, 100));
            be0 be0Var = new be0(context2);
            be0Var.setRoundRadius(gl.L(32.0f));
            this.M0.addView(be0Var, nme.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            be0Var.f(f, new pb0(0, f));
            mhb mhbVar = new mhb(context2);
            this.H0 = mhbVar;
            mhbVar.getTextView().setGravity(1);
            long j = this.c;
            mhb mhbVar2 = this.H0;
            if (j == 0) {
                mhbVar2.setText(k96.M0(2131747271, null));
            } else {
                mhbVar2.setText(gl.S2(k96.a0("PassportRequest", null, 2131747285, l7c.k(f, true))));
            }
            ((FrameLayout.LayoutParams) this.H0.getTextView().getLayoutParams()).gravity = 1;
            this.d0.addView(this.H0, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
            ImageView imageView = new ImageView(context2);
            this.J0 = imageView;
            imageView.setImageResource(R.drawable.no_password);
            zkb.s(this.J0, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
            this.d0.addView(this.J0, nme.t(-2, -2, 49, 0, 13, 0, 0));
            TextView textView = new TextView(context2);
            this.K0 = textView;
            textView.setTextSize(1, 14.0f);
            this.K0.setGravity(1);
            this.K0.setPadding(gl.L(21.0f), gl.L(10.0f), gl.L(21.0f), gl.L(17.0f));
            zkb.X(this.K0, bkb.A6, null);
            this.K0.setText(k96.M0(2131743994, null));
            this.d0.addView(this.K0, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(context2);
            this.L0 = textView2;
            zkb.X(textView2, bkb.q6, null);
            this.L0.setGravity(17);
            this.L0.setTextSize(1, 16.0f);
            this.L0.setTypeface(gl.o());
            this.L0.setText(k96.M0(2131743995, null));
            this.d0.addView(this.L0, nme.d(-1, 24.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
            this.L0.setOnClickListener(new lw7(this, (byte) 10));
            this.Z = new EditTextBoldCursor[1];
            this.a0 = new ViewGroup[]{new FrameLayout(context2)};
            this.d0.addView(this.a0[0], nme.o(-1, 50));
            zkb.h(bkb.c6, null, this.a0[0]);
            this.Z[0] = new EditTextBoldCursor(context2);
            this.Z[0].setTag(0);
            this.Z[0].setTextSize(1, 16.0f);
            zkb.D(this.Z[0], bkb.G6, null);
            EditTextBoldCursor editTextBoldCursor = this.Z[0];
            int i6 = bkb.F6;
            zkb.X(editTextBoldCursor, i6, null);
            this.Z[0].setBackgroundDrawable(null);
            zkb.v(this.Z[0], i6, null);
            this.Z[0].setCursorSize(gl.L(20.0f));
            this.Z[0].setCursorWidth(1.5f);
            this.Z[0].setInputType(kk7.M1);
            this.Z[0].setMaxLines(1);
            this.Z[0].setLines(1);
            this.Z[0].setSingleLine(true);
            this.Z[0].setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.Z[0].setTypeface(Typeface.DEFAULT);
            this.Z[0].setImeOptions(268435462);
            this.Z[0].setPadding(0, 0, 0, gl.L(6.0f));
            this.Z[0].setGravity(k96.a0 ? 5 : 3);
            this.a0[0].addView(this.Z[0], nme.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.Z[0].setOnEditorActionListener(new jw7(this, r14));
            this.Z[0].setCustomSelectionActionModeCallback(new kv7((byte) 2));
            mhb mhbVar3 = new mhb(context2);
            this.I0 = mhbVar3;
            zkb.Z(mhbVar3, context2, R.drawable.greydivider_bottom, bkb.a7);
            this.I0.setText(k96.a0("PassportRequestPasswordInfo", null, 2131747284, new Object[0]));
            this.d0.addView(this.I0, nme.o(-1, -2));
            TextView textView3 = new TextView(context2);
            this.N0 = textView3;
            zkb.X(textView3, bkb.p6, null);
            this.N0.setTextSize(1, 14.0f);
            this.N0.setText(k96.M0(2131750574, null));
            this.N0.setPadding(0, 0, 0, 0);
            this.d0.addView(this.N0, nme.t(-2, 30, (k96.a0 ? (byte) 5 : (byte) 3) | 48, 21, 0, 21, 0));
            this.N0.setOnClickListener(new lw7(this, (byte) 11));
            U1();
        } else if (i3 == 0) {
            if (this.E != null) {
                for (int i7 = 0; i7 < this.E.users.size(); i7++) {
                    TLRPC.User user3 = this.E.users.get(i7);
                    if (user3.id == this.c) {
                        user = user3;
                        break;
                    }
                }
            }
            user = null;
            FrameLayout frameLayout4 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(k96.M0(2131743996, null));
            this.actionBar.t().a(1, R.drawable.msg_info);
            if (user != null) {
                FrameLayout frameLayout5 = new FrameLayout(context2);
                this.d0.addView(frameLayout5, nme.o(-1, 100));
                be0 be0Var2 = new be0(context2);
                be0Var2.setRoundRadius(gl.L(32.0f));
                frameLayout5.addView(be0Var2, nme.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
                be0Var2.f(user, new pb0(0, user));
                mhb mhbVar4 = new mhb(context2);
                this.o0 = mhbVar4;
                zkb.Z(mhbVar4, context2, R.drawable.greydivider_top, bkb.a7);
                this.o0.setText(gl.S2(k96.a0("PassportRequest", null, 2131747285, l7c.k(user, true))));
                this.o0.getTextView().setGravity(1);
                ((FrameLayout.LayoutParams) this.o0.getTextView().getLayoutParams()).gravity = 1;
                this.d0.addView(this.o0, nme.o(-1, -2));
            }
            ld5 ld5Var = new ld5(context2);
            this.k0 = ld5Var;
            ld5Var.setText(k96.M0(2131747283, null));
            zkb.h(bkb.c6, null, this.k0);
            this.d0.addView(this.k0, nme.o(-1, -2));
            TL_account.authorizationForm authorizationform = this.E;
            if (authorizationform != null) {
                int size = authorizationform.required_types.size();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                boolean z2 = false;
                boolean z3 = false;
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.SecureRequiredType secureRequiredType = this.E.required_types.get(i10);
                    if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType;
                        if (n1(tL_secureRequiredType3.type)) {
                            arrayList4.add(tL_secureRequiredType3);
                            i8++;
                        } else if (m1(tL_secureRequiredType3.type)) {
                            arrayList5.add(tL_secureRequiredType3);
                            i9++;
                        } else {
                            TLRPC.SecureValueType secureValueType = tL_secureRequiredType3.type;
                            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                z2 = true;
                            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                z3 = true;
                            }
                        }
                    } else if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                        if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                            if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                                if (n1(tL_secureRequiredType4.type)) {
                                    int size2 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i11);
                                        if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList4.add((TLRPC.TL_secureRequiredType) secureRequiredType3);
                                        }
                                    }
                                    i8++;
                                } else if (m1(tL_secureRequiredType4.type)) {
                                    int size3 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i12 = 0; i12 < size3; i12++) {
                                        TLRPC.SecureRequiredType secureRequiredType4 = tL_secureRequiredTypeOneOf.types.get(i12);
                                        if (secureRequiredType4 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList5.add((TLRPC.TL_secureRequiredType) secureRequiredType4);
                                        }
                                    }
                                    i9++;
                                }
                            }
                        }
                    }
                }
                boolean z4 = !z2 || i8 > 1;
                boolean z5 = !z3 || i9 > 1;
                int i13 = 0;
                while (i13 < size) {
                    TLRPC.SecureRequiredType secureRequiredType5 = this.E.required_types.get(i13);
                    if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType5;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType5.type;
                        if ((secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) {
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                            arrayList = null;
                            z = false;
                        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                            if (!z4) {
                                arrayList3 = arrayList4;
                                arrayList = arrayList3;
                                z = false;
                                tL_secureRequiredType2 = tL_secureRequiredType5;
                            }
                            arrayList3 = null;
                            arrayList = arrayList3;
                            z = false;
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                            if (!z5) {
                                arrayList3 = arrayList5;
                                arrayList = arrayList3;
                                z = false;
                                tL_secureRequiredType2 = tL_secureRequiredType5;
                            }
                            arrayList3 = null;
                            arrayList = arrayList3;
                            z = false;
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                        } else {
                            if (z4 && n1(secureValueType2)) {
                                arrayList2 = new ArrayList();
                                arrayList2.add(tL_secureRequiredType5);
                                tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypePersonalDetails();
                            } else {
                                if (z5 && m1(tL_secureRequiredType5.type)) {
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(tL_secureRequiredType5);
                                    tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypeAddress();
                                }
                                i13++;
                            }
                            arrayList = arrayList2;
                            z = true;
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                        }
                        K0(context, tL_secureRequiredType2, arrayList, z, i13 != size + (-1));
                        i13++;
                    } else {
                        if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                            TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf2 = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType5;
                            if (!tL_secureRequiredTypeOneOf2.types.isEmpty()) {
                                TLRPC.SecureRequiredType secureRequiredType6 = tL_secureRequiredTypeOneOf2.types.get(0);
                                if (secureRequiredType6 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType6 = (TLRPC.TL_secureRequiredType) secureRequiredType6;
                                    if ((z4 && n1(tL_secureRequiredType6.type)) || (z5 && m1(tL_secureRequiredType6.type))) {
                                        arrayList = new ArrayList();
                                        int size4 = tL_secureRequiredTypeOneOf2.types.size();
                                        for (int i14 = 0; i14 < size4; i14++) {
                                            TLRPC.SecureRequiredType secureRequiredType7 = tL_secureRequiredTypeOneOf2.types.get(i14);
                                            if (secureRequiredType7 instanceof TLRPC.TL_secureRequiredType) {
                                                arrayList.add((TLRPC.TL_secureRequiredType) secureRequiredType7);
                                            }
                                        }
                                        if (n1(tL_secureRequiredType6.type)) {
                                            tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                            tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                        } else {
                                            tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                            tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                                        }
                                        tL_secureRequiredType2 = tL_secureRequiredType;
                                        z = true;
                                        K0(context, tL_secureRequiredType2, arrayList, z, i13 != size + (-1));
                                    }
                                }
                            }
                        }
                        i13++;
                    }
                }
                context2 = context;
            }
            if (user != null) {
                mhb mhbVar5 = new mhb(context2);
                this.o0 = mhbVar5;
                zkb.Z(mhbVar5, context2, R.drawable.greydivider_bottom, bkb.a7);
                mhb mhbVar6 = this.o0;
                int i15 = bkb.A6;
                mhbVar6.setLinkTextColorKey(i15);
                if (TextUtils.isEmpty(this.E.privacy_policy_url)) {
                    wjbVar = null;
                    this.o0.setText(gl.S2(k96.a0("PassportNoPolicy", null, 2131747300, l7c.k(user, true), user.username)));
                } else {
                    String a0 = k96.a0("PassportPolicy", null, 2131747288, l7c.k(user, true), user.username);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                    int indexOf = a0.indexOf(42);
                    int lastIndexOf = a0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        this.o0.getTextView().setMovementMethod(new cl((byte) 0));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new mx7(this), indexOf, lastIndexOf - 1, 33);
                    }
                    this.o0.setText(spannableStringBuilder);
                    wjbVar = null;
                }
                zkb.C(this.o0.getTextView(), i15, wjbVar);
                this.o0.getTextView().setGravity(1);
                this.d0.addView(this.o0, nme.o(-1, -2));
            }
            FrameLayout frameLayout6 = new FrameLayout(context2);
            this.R = frameLayout6;
            int i16 = bkb.hi;
            int w0 = bkb.w0(null, i16, false);
            int i17 = bkb.ii;
            ff0 g0 = bkb.g0(w0, bkb.w0(null, i17, false));
            vkb M = zkb.M(i16);
            vkb M2 = zkb.M(i17);
            frameLayout6.setBackground(g0);
            zkb.j(frameLayout6, g0, M, M2, null);
            frameLayout4.addView(this.R, nme.e(-1, 48, 80));
            this.R.setOnClickListener(new lw7(this, (byte) 15));
            TextView textView4 = new TextView(context2);
            this.P = textView4;
            textView4.setCompoundDrawablePadding(gl.L(8.0f));
            this.P.setCompoundDrawablesWithIntrinsicBounds(R.drawable.authorize, 0, 0, 0);
            zkb.X(this.P, bkb.ji, null);
            this.P.setText(k96.M0(2131747405, null));
            this.P.setTextSize(1, 14.0f);
            this.P.setGravity(17);
            this.P.setTypeface(gl.o());
            this.R.addView(this.P, nme.e(-2, -1, 17));
            cw2 cw2Var2 = new cw2(context2, 0);
            this.Q = cw2Var2;
            cw2Var2.setVisibility(4);
            this.R.addView(this.Q, nme.c(-1.0f, -1));
            View view = new View(context2);
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            frameLayout4.addView(view, nme.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        } else if (i3 == 1) {
            W0(context);
            if (this.a == null) {
                this.a = e1();
            }
        } else if (i3 == 2) {
            T0(context);
            if (this.a == null) {
                this.a = e1();
            }
        } else if (i3 == 3) {
            Y0(context);
        } else {
            byte b2 = 6;
            if (i3 == 4) {
                this.actionBar.setTitle(k96.M0(2131747382, null));
                if (TextUtils.isEmpty(this.e1)) {
                    i = -1;
                } else {
                    uib uibVar = new uib(context2);
                    zkb.X(uibVar.getTextView(), bkb.p6, null);
                    ff0 L0 = bkb.L0(true);
                    vkb M3 = zkb.M(bkb.c6);
                    vkb M4 = zkb.M(bkb.h6);
                    uibVar.setBackground(L0);
                    zkb.j(uibVar, L0, M3, M4, null);
                    uibVar.b(k96.a0("PassportPhoneUseSame", null, 2131747291, this.e1), false);
                    this.d0.addView(uibVar, nme.o(-1, -2));
                    uibVar.setOnClickListener(new lw7(this, b2));
                    mhb mhbVar7 = new mhb(context2);
                    this.o0 = mhbVar7;
                    zkb.Z(mhbVar7, context2, R.drawable.greydivider_bottom, bkb.a7);
                    this.o0.setText(k96.M0(2131747290, null));
                    i = -1;
                    this.d0.addView(this.o0, nme.o(-1, -2));
                }
                this.Z = new EditTextBoldCursor[1];
                FrameLayout frameLayout7 = new FrameLayout(context2);
                this.d0.addView(frameLayout7, nme.o(i, 50));
                zkb.h(bkb.c6, null, frameLayout7);
                this.Z[0] = new EditTextBoldCursor(context2);
                this.Z[0].setTag(0);
                this.Z[0].setTextSize(1, 16.0f);
                zkb.D(this.Z[0], bkb.G6, null);
                EditTextBoldCursor editTextBoldCursor2 = this.Z[0];
                int i18 = bkb.F6;
                zkb.X(editTextBoldCursor2, i18, null);
                this.Z[0].setBackgroundDrawable(null);
                zkb.v(this.Z[0], i18, null);
                this.Z[0].setCursorSize(gl.L(20.0f));
                this.Z[0].setCursorWidth(1.5f);
                this.Z[0].setInputType(33);
                this.Z[0].setImeOptions(268435462);
                this.Z[0].setHint(k96.M0(2131747183, null));
                TLRPC.TL_secureValue tL_secureValue = this.I;
                if (tL_secureValue != null) {
                    TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
                    if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                        TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                        if (!TextUtils.isEmpty(tL_securePlainEmail.email)) {
                            i2 = 0;
                            this.Z[0].setText(tL_securePlainEmail.email);
                            EditTextBoldCursor editTextBoldCursor3 = this.Z[i2];
                            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                            this.Z[i2].setPadding(i2, i2, i2, gl.L(6.0f));
                            this.Z[i2].setGravity(k96.a0 ? (byte) 5 : (byte) 3);
                            frameLayout7.addView(this.Z[i2], nme.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            this.Z[i2].setOnEditorActionListener(new jw7(this, (byte) 3));
                            mhb mhbVar8 = new mhb(context2);
                            this.o0 = mhbVar8;
                            zkb.Z(mhbVar8, context2, R.drawable.greydivider_bottom, bkb.a7);
                            this.o0.setText(k96.M0(2131747379, null));
                            this.d0.addView(this.o0, nme.o(-1, -2));
                        }
                    }
                }
                i2 = 0;
                EditTextBoldCursor editTextBoldCursor32 = this.Z[i2];
                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                this.Z[i2].setPadding(i2, i2, i2, gl.L(6.0f));
                this.Z[i2].setGravity(k96.a0 ? (byte) 5 : (byte) 3);
                frameLayout7.addView(this.Z[i2], nme.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.Z[i2].setOnEditorActionListener(new jw7(this, (byte) 3));
                mhb mhbVar82 = new mhb(context2);
                this.o0 = mhbVar82;
                zkb.Z(mhbVar82, context2, R.drawable.greydivider_bottom, bkb.a7);
                this.o0.setText(k96.M0(2131747379, null));
                this.d0.addView(this.o0, nme.o(-1, -2));
            } else {
                HashMap hashMap = this.t1;
                if (i3 == 6) {
                    this.actionBar.setTitle(k96.M0(2131747382, null));
                    this.Z = new EditTextBoldCursor[1];
                    FrameLayout frameLayout8 = new FrameLayout(context2);
                    this.d0.addView(frameLayout8, nme.o(-1, 50));
                    zkb.h(bkb.c6, null, frameLayout8);
                    byte b3 = 0;
                    this.Z[0] = new EditTextBoldCursor(context2);
                    this.Z[0].setTag(0);
                    this.Z[0].setTextSize(1, 16.0f);
                    zkb.D(this.Z[0], bkb.G6, null);
                    EditTextBoldCursor editTextBoldCursor4 = this.Z[0];
                    int i19 = bkb.F6;
                    zkb.X(editTextBoldCursor4, i19, null);
                    this.Z[0].setBackgroundDrawable(null);
                    zkb.v(this.Z[0], i19, null);
                    this.Z[0].setCursorSize(gl.L(20.0f));
                    this.Z[0].setCursorWidth(1.5f);
                    this.Z[0].setInputType(3);
                    this.Z[0].setImeOptions(268435462);
                    this.Z[0].setHint(k96.M0(2131747381, null));
                    EditTextBoldCursor editTextBoldCursor5 = this.Z[0];
                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                    this.Z[0].setPadding(0, 0, 0, gl.L(6.0f));
                    this.Z[0].setGravity(k96.a0 ? (byte) 5 : (byte) 3);
                    frameLayout8.addView(this.Z[0], nme.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    this.Z[0].setOnEditorActionListener(new jw7(this, b2));
                    this.Z[0].addTextChangedListener(new hx7(this, b3));
                    mhb mhbVar9 = new mhb(context2);
                    this.o0 = mhbVar9;
                    zkb.Z(mhbVar9, context2, R.drawable.greydivider_bottom, bkb.a7);
                    this.o0.setText(k96.a0("PassportEmailVerifyInfo", null, 2131747378, hashMap.get("email")));
                    this.d0.addView(this.o0, nme.o(-1, -2));
                } else if (i3 == 7) {
                    this.actionBar.setTitle(k96.M0(2131747295, null));
                    FrameLayout frameLayout9 = new FrameLayout(context2);
                    this.c0.addView(frameLayout9, nme.x(-1, -2, 51));
                    for (int i20 = 0; i20 < 3; i20++) {
                        rx7 rx7Var = new rx7(this, context2, i20 + 2);
                        jja[] jjaVarArr = this.K1;
                        jjaVarArr[i20] = rx7Var;
                        rx7Var.setVisibility(8);
                        frameLayout9.addView(jjaVarArr[i20], nme.d(-1, -1.0f, 51, gl.O1() ? 26.0f : 18.0f, 30.0f, gl.O1() ? 26.0f : 18.0f, 0.0f));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", (String) hashMap.get("phone"));
                    d1(bundle, this.L, false);
                } else if (i3 == 8) {
                    X0(context);
                }
            }
        }
        return this.fragmentView;
    }

    public final void d1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z) {
        bundle.putString("phoneHash", tL_auth_sentCode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = tL_auth_sentCode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        }
        int i = tL_auth_sentCode.timeout;
        if (i == 0) {
            i = 60;
            tL_auth_sentCode.timeout = 60;
        }
        bundle.putInt("timeout", i * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            M1(bundle, 2, z);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            M1(bundle, 1, z);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            M1(bundle, 0, z);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        tx7 tx7Var;
        r7 r7Var;
        if (i != kk7.T1) {
            if (i == kk7.U1 || i != kk7.o0) {
                return;
            }
            if (objArr == null || objArr.length <= 0) {
                this.K = null;
                y1();
            } else {
                Object obj = objArr[7];
                if (obj != null && (editTextBoldCursor = this.Z[0]) != null) {
                    editTextBoldCursor.setText((String) obj);
                }
                if (objArr[6] == null) {
                    TL_account.TL_password tL_password = new TL_account.TL_password();
                    this.K = tL_password;
                    tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                    tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                    tL_password.secure_random = (byte[]) objArr[3];
                    tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                    TL_account.Password password = this.K;
                    password.hint = (String) objArr[5];
                    password.srp_id = -1L;
                    byte[] bArr = new byte[256];
                    password.srp_B = bArr;
                    Utilities.b.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.Z[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.O0 = (byte) 2;
                    }
                }
            }
            U1();
            return;
        }
        String str = (String) objArr[0];
        HashMap hashMap = this.p1;
        uu9 uu9Var = (uu9) hashMap.get(str);
        if (uu9Var != null) {
            uu9Var.d = (TLRPC.TL_inputFile) objArr[1];
            hashMap.remove(str);
            if (hashMap.isEmpty() && (r7Var = this.M) != null) {
                r7Var.setEnabled(true);
                this.M.setAlpha(1.0f);
            }
            HashMap hashMap2 = this.o1;
            if (hashMap2 != null && (tx7Var = (tx7) hashMap2.get(uu9Var)) != null) {
                tx7Var.a(true);
            }
            HashMap hashMap3 = this.z1;
            if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                hashMap3.remove("error_document_all");
                S0(false);
            }
            byte b = uu9Var.i;
            if (b == 0) {
                if (this.o0 != null && !TextUtils.isEmpty(this.A1)) {
                    this.o0.setText(this.A1);
                }
                hashMap3.remove("files_all");
                return;
            }
            if (b == 4) {
                if (this.p0 != null && !TextUtils.isEmpty(this.B1)) {
                    this.p0.setText(this.B1);
                }
                hashMap3.remove("translation_all");
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void dismissCurrentDialog() {
        x02 x02Var = this.S0;
        if (x02Var == null || this.visibleDialog != x02Var) {
            super.dismissCurrentDialog();
            return;
        }
        x02Var.d2.b0(false);
        this.S0.I();
        this.S0.d2.f0(true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.S0 && super.dismissDialogOnPause(dialog);
    }

    public final String e1() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
            if (i >= editTextBoldCursorArr.length) {
                break;
            }
            sb.append((CharSequence) editTextBoldCursorArr[i].getText());
            sb.append(",");
            i++;
        }
        if (this.b0 != null) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.b0;
                if (i2 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb.append((CharSequence) editTextBoldCursorArr2[i2].getText());
                sb.append(",");
                i2++;
            }
        }
        ArrayList arrayList = this.j1;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append(((uu9) arrayList.get(i3)).b.id);
        }
        uu9 uu9Var = this.m1;
        if (uu9Var != null) {
            sb.append(uu9Var.b.id);
        }
        uu9 uu9Var2 = this.n1;
        if (uu9Var2 != null) {
            sb.append(uu9Var2.b.id);
        }
        uu9 uu9Var3 = this.k1;
        if (uu9Var3 != null) {
            sb.append(uu9Var3.b.id);
        }
        ArrayList arrayList2 = this.l1;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sb.append(((uu9) arrayList2.get(i4)).b.id);
        }
        return sb.toString();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.c0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.B8));
        arrayList.add(new blb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C8));
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.l0;
            if (i2 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new blb((View) arrayList2.get(i2), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c7));
            i2++;
        }
        Iterator it = this.o1.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new blb((tx7) ((Map.Entry) it.next()).getValue(), TLObject.FLAG_28, new Class[]{tx7.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        }
        int i3 = bkb.c6;
        arrayList.add(new blb(this.d0, TLObject.FLAG_28, new Class[]{hhb.class}, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.d0, TLObject.FLAG_28, new Class[]{uib.class}, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.d0, TLObject.FLAG_28, new Class[]{ux7.class}, (Paint) null, (Drawable[]) null, (alb) null, i3));
        if (this.Z != null) {
            int i4 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i4 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new blb((View) editTextBoldCursorArr[i4].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
                arrayList.add(new blb(this.Z[i4], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.K6));
                arrayList.add(new blb(this.Z[i4], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
                arrayList.add(new blb(this.Z[i4], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
                arrayList.add(new blb(this.Z[i4], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.o7));
                i4++;
            }
        } else {
            arrayList.add(new blb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
            arrayList.add(new blb((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.G6));
            arrayList.add(new blb((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.K6));
            arrayList.add(new blb((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
            arrayList.add(new blb((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
            arrayList.add(new blb((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.o7));
        }
        if (this.b0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.b0;
                if (i >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new blb((View) editTextBoldCursorArr2[i].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
                arrayList.add(new blb(this.b0[i], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.K6));
                arrayList.add(new blb(this.b0[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
                arrayList.add(new blb(this.b0[i], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
                arrayList.add(new blb(this.b0[i], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.o7));
                i++;
            }
        }
        arrayList.add(new blb(this.G0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.R, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.hi));
        arrayList.add(new blb(this.R, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ii));
        return arrayList;
    }

    public final TLRPC.TL_secureValue k1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
        String[] strArr;
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.E.values.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_secureValue tL_secureValue = this.E.values.get(i);
            if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                if (z) {
                    if (tL_secureRequiredType.selfie_required && !(tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    if (tL_secureRequiredType.translation_required && tL_secureValue.translation.isEmpty()) {
                        return null;
                    }
                    if (m1(tL_secureRequiredType.type) && tL_secureValue.files.isEmpty()) {
                        return null;
                    }
                    if (n1(tL_secureRequiredType.type) && !(tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                    if (((secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) && !(tL_secureValue.reverse_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                        strArr = tL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"};
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                        strArr = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                    }
                    try {
                        TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                        JSONObject jSONObject = new JSONObject(Z0(tL_secureData.data, a1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
                        for (int i2 = 0; i2 < strArr.length; i2++) {
                            if (!jSONObject.has(strArr[i2]) || TextUtils.isEmpty(jSONObject.getString(strArr[i2]))) {
                                return null;
                            }
                        }
                    } catch (Throwable unused) {
                        return null;
                    }
                }
                return tL_secureValue;
            }
        }
        return null;
    }

    public final boolean l1(Class cls) {
        int size = this.E.values.size();
        for (int i = 0; i < size; i++) {
            if (this.E.values.get(i).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void o1(uu9 uu9Var, int i, tx7 tx7Var, String str) {
        String str2 = uu9Var.c;
        this.o1.remove(uu9Var);
        if (i == 1) {
            this.k1 = null;
            this.h0.removeView(tx7Var);
        } else if (i == 4) {
            this.l1.remove(uu9Var);
            this.i0.removeView(tx7Var);
        } else if (i == 2) {
            this.m1 = null;
            this.f0.removeView(tx7Var);
        } else if (i == 3) {
            this.n1 = null;
            this.g0.removeView(tx7Var);
        } else {
            this.j1.remove(uu9Var);
            this.e0.removeView(tx7Var);
        }
        HashMap hashMap = this.y1;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.z1;
        if (hashMap2 != null) {
            hashMap2.remove(str);
        }
        V1(i);
        if (str2 != null) {
            HashMap hashMap3 = this.p1;
            if (hashMap3.remove(str2) != null) {
                if (hashMap3.isEmpty()) {
                    this.M.setEnabled(true);
                    this.M.setAlpha(1.0f);
                }
                ba4.G(this.currentAccount).b(str2, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0 || i == 2) {
                U0();
                x02 x02Var = this.S0;
                if (x02Var != null) {
                    x02Var.d2.j0(i, intent, this.R0);
                }
                this.R0 = null;
                return;
            }
            if (i == 1) {
                if (intent == null || intent.getData() == null) {
                    if (getParentActivity() != null) {
                        Toast.makeText(getParentActivity(), k96.M0(2131743594, null), 0).show();
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    y3a y3aVar = new y3a();
                    y3aVar.a = intent.getData();
                    arrayList.add(y3aVar);
                    I1(arrayList);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        int i = this.b;
        if (i == 7) {
            if (z) {
                byte b = this.J1;
                jja[] jjaVarArr = this.K1;
                jjaVarArr[b].d(true);
                for (jja jjaVar : jjaVarArr) {
                    if (jjaVar != null) {
                        jjaVar.f();
                    }
                }
            }
        } else if (i == 0 || i == 5) {
            if (z) {
                M0(false);
            }
        } else if (i == 1 || i == 2) {
            return !N0(z);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        if (this.b == 3 && dialog == this.M1) {
            ArrayList arrayList = this.N1;
            if (arrayList.isEmpty()) {
                return;
            }
            getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.T1);
        kk7.f(this.currentAccount).b(this, kk7.U1);
        kk7.f(this.currentAccount).b(this, kk7.o0);
        kk7.f(this.currentAccount).b(this, kk7.q0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.T1);
        kk7.f(this.currentAccount).n(this, kk7.U1);
        kk7.f(this.currentAccount).n(this, kk7.o0);
        kk7.f(this.currentAccount).n(this, kk7.q0);
        int i = 0;
        M0(false);
        x02 x02Var = this.S0;
        if (x02Var != null) {
            x02Var.I();
            this.S0.e1();
        }
        if (this.b == 7) {
            while (true) {
                jja[] jjaVarArr = this.K1;
                if (i >= jjaVarArr.length) {
                    break;
                }
                jja jjaVar = jjaVarArr[i];
                if (jjaVar != null) {
                    jjaVar.f();
                }
                i++;
            }
            hd hdVar = this.L1;
            if (hdVar != null) {
                try {
                    hdVar.dismiss();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                this.L1 = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        x02 x02Var = this.S0;
        if (x02Var != null) {
            x02Var.g1();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        x02 x02Var;
        uib uibVar;
        int i2 = this.b;
        if ((i2 != 1 && i2 != 2) || (x02Var = this.S0) == null) {
            if (i2 == 3 && i == 6) {
                Q1(false, this.F1, this.G1, this.H1, this.I1);
                return;
            }
            return;
        }
        byte b = 0;
        if (i == 17) {
            x02Var.d2.V(false);
            return;
        }
        if (i == 21) {
            if (getParentActivity() == null || iArr == null || iArr.length == 0 || iArr[0] == 0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(R.string.AppName, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131747119, null);
            alertDialog$Builder.g(k96.M0(2131747107, null), new nw7(this, b));
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            alertDialog$Builder.o();
            return;
        }
        if (i == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            H1(0);
            return;
        }
        if (i != 22 || iArr == null || iArr.length <= 0 || iArr[0] != 0 || (uibVar = this.s0) == null) {
            return;
        }
        uibVar.callOnClick();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        super.onResume();
        x02 x02Var = this.S0;
        if (x02Var != null) {
            x02Var.h1();
        }
        if (this.b == 5 && (viewGroupArr = this.a0) != null) {
            byte b = 0;
            ViewGroup viewGroup = viewGroupArr[0];
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                this.Z[0].requestFocus();
                gl.E3(this.Z[0]);
                gl.d3(new kw7(this, b), 200L);
            }
        }
        gl.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.c0;
            boolean z = false;
            if (scrollView != null) {
                gl.u3(scrollView, bkb.w0(null, bkb.r8, false));
            }
            int i = this.b;
            boolean z2 = i == 2 || i == 1;
            int w0 = bkb.w0(null, bkb.j6, false);
            int w02 = bkb.w0(null, bkb.k6, false);
            int w03 = bkb.w0(null, bkb.o7, false);
            if (z2 && (w0 != this.O1 || w02 != this.P1 || w03 != this.Q1)) {
                z = true;
            }
            R1(this.Z, z2, z);
            R1(this.b0, z2, z);
            if (z) {
                this.O1 = w0;
                this.P1 = w02;
                this.Q1 = w03;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (this.i1 != null) {
            gl.c3(new kw7(this, (byte) 1));
        }
        int i = this.b;
        if (i == 5) {
            if (z) {
                if (this.a0[0].getVisibility() == 0) {
                    this.Z[0].requestFocus();
                    gl.E3(this.Z[0]);
                }
                if (this.O0 == 2) {
                    D1(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 7) {
            if (z) {
                this.K1[this.J1].j();
                return;
            }
            return;
        }
        if (i == 4) {
            if (z) {
                this.Z[0].requestFocus();
                gl.E3(this.Z[0]);
                return;
            }
            return;
        }
        if (i == 6) {
            if (z) {
                this.Z[0].requestFocus();
                gl.E3(this.Z[0]);
                return;
            }
            return;
        }
        if (i == 2 || i == 1) {
            U0();
        }
    }

    public final /* synthetic */ void p1() {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i = 0; i < this.E.values.size(); i++) {
            deletesecurevalue.types.add(this.E.values.get(i).type);
        }
        A1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new ow7(this, (byte) 2));
    }

    public final /* synthetic */ void q1() {
        d01.t(getParentActivity(), "https://telegram.org/deactivate?phone=".concat(y6c.h(this.currentAccount).d()));
    }

    public final void r1() {
        if (this.K.has_recovery) {
            A1();
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ow7(this, (byte) 0), 10), this.classGuid);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        alertDialog$Builder.g(k96.M0(2131745877, null), new nw7(this, (byte) 4));
        String M0 = k96.M0(2131745878, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131745880, null);
        showDialog(hdVar);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        this.R0 = bundle.getString("path");
    }

    public final void s1() {
        p3c p3cVar = new p3c(this.currentAccount, 0, this.K);
        p3cVar.Z = true;
        presentFragment(p3cVar);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.R0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final /* synthetic */ void t1(TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = this.K;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        presentFragment(new p3c(this.currentAccount, 4, password));
    }

    public final void u1() {
        byte b;
        ArrayList arrayList;
        int i;
        int i2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        ArrayList arrayList2 = new ArrayList();
        int size = this.E.required_types.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.SecureRequiredType secureRequiredType = this.E.required_types.get(i3);
            if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                tL_secureRequiredType = (TLRPC.TL_secureRequiredType) secureRequiredType;
            } else {
                if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                    TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                    if (tL_secureRequiredTypeOneOf.types.isEmpty()) {
                        continue;
                    } else {
                        TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                        if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                            int size2 = tL_secureRequiredTypeOneOf.types.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    tL_secureRequiredType = tL_secureRequiredType4;
                                    break;
                                }
                                TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i4);
                                if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                    if (k1(tL_secureRequiredType5, true) != null) {
                                        tL_secureRequiredType = tL_secureRequiredType5;
                                        break;
                                    }
                                }
                                i4++;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    continue;
                }
            }
            TLRPC.TL_secureValue k1 = k1(tL_secureRequiredType, true);
            HashMap hashMap = this.s1;
            HashMap hashMap2 = this.r1;
            if (k1 == null) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                ux7 ux7Var = (ux7) hashMap2.get(tL_secureRequiredType);
                if (ux7Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    ux7Var = (ux7) hashMap2.get(tL_secureRequiredType2);
                }
                gl.z3(ux7Var);
                return;
            }
            HashMap hashMap3 = (HashMap) this.v1.get(h1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                ux7 ux7Var2 = (ux7) hashMap2.get(tL_secureRequiredType);
                if (ux7Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    ux7Var2 = (ux7) hashMap2.get(tL_secureRequiredType3);
                }
                gl.z3(ux7Var2);
                return;
            }
            boolean z = tL_secureRequiredType.selfie_required;
            boolean z2 = tL_secureRequiredType.translation_required;
            yw7 yw7Var = new yw7();
            yw7Var.a = k1;
            yw7Var.b = z;
            yw7Var.c = z2;
            arrayList2.add(yw7Var);
        }
        P1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = this.c;
        acceptauthorization.scope = this.h;
        String str = this.r;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            yw7 yw7Var2 = (yw7) arrayList2.get(i5);
            TLRPC.TL_secureValue tL_secureValue = yw7Var2.a;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData == null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] a1 = a1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(a1, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (tL_secureValue.files.isEmpty()) {
                        i = size3;
                        i2 = i5;
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        int size4 = tL_secureValue.files.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i6);
                            int i7 = size4;
                            i = size3;
                            try {
                                byte[] a12 = a1(tL_secureFile.secret, tL_secureFile.file_hash);
                                JSONObject jSONObject4 = new JSONObject();
                                i2 = i5;
                                try {
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(a12, 2));
                                    jSONArray.put(jSONObject4);
                                    i6++;
                                    size4 = i7;
                                    size3 = i;
                                    i5 = i2;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i = size3;
                        i2 = i5;
                        jSONObject3.put("files", jSONArray);
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] a13 = a1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(a13, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] a14 = a1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(a14, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (yw7Var2.b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] a15 = a1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(a15, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (yw7Var2.c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i8);
                            byte[] a16 = a1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(a16, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(h1(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i5 = i2 + 1;
                arrayList2 = arrayList;
                size3 = i;
            } else if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
            }
            arrayList = arrayList2;
            i = size3;
            i2 = i5;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i5 = i2 + 1;
            arrayList2 = arrayList;
            size3 = i;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj = this.d;
        if (obj != null) {
            try {
                jSONObject9.put("payload", obj);
            } catch (Exception unused6) {
            }
        }
        Object obj2 = this.e;
        if (obj2 != null) {
            try {
                jSONObject9.put("nonce", obj2);
            } catch (Exception unused7) {
            }
        }
        gl2 c1 = c1(gl.g1(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) c1.e;
        tL_secureCredentialsEncrypted.data = (byte[]) c1.d;
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, rSAPublicKey);
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) c1.c);
            b = 1;
        } catch (Exception e) {
            b = 1;
            fa4.g(e, true);
        }
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(acceptauthorization, new ow7(this, b)), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void v1(String str, boolean z) {
        byte[] bArr;
        byte[] c;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        if (z) {
            c = this.P0;
        } else {
            if (!(this.K.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
                bArr = null;
                lx7 lx7Var = new lx7(this, z, bArr, getpasswordsettings, str);
                TL_account.Password password = this.K;
                passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "PASSWORD_HASH_INVALID";
                    lx7Var.run(null, tL_error);
                    return;
                }
                TLRPC.TL_inputCheckPasswordSRP d = mo9.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                getpasswordsettings.password = d;
                if (d != null) {
                    ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, lx7Var, 10), this.classGuid);
                    return;
                } else {
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "ALGO_INVALID";
                    lx7Var.run(null, tL_error2);
                    return;
                }
            }
            c = mo9.c(gl.g1(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) this.K.current_algo);
        }
        bArr = c;
        lx7 lx7Var2 = new lx7(this, z, bArr, getpasswordsettings, str);
        TL_account.Password password2 = this.K;
        passwordKdfAlgo = password2.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        }
    }

    public final /* synthetic */ void w1(uu9 uu9Var, int i) {
        String str = uu9Var.c;
        byte b = this.T0;
        HashMap hashMap = this.o1;
        if (b == 1) {
            uu9 uu9Var2 = this.k1;
            if (uu9Var2 != null) {
                tx7 tx7Var = (tx7) hashMap.remove(uu9Var2);
                if (tx7Var != null) {
                    this.h0.removeView(tx7Var);
                }
                this.k1 = null;
            }
        } else if (b == 4) {
            if (this.l1.size() >= 20) {
                return;
            }
        } else if (b == 2) {
            uu9 uu9Var3 = this.m1;
            if (uu9Var3 != null) {
                tx7 tx7Var2 = (tx7) hashMap.remove(uu9Var3);
                if (tx7Var2 != null) {
                    this.f0.removeView(tx7Var2);
                }
                this.m1 = null;
            }
        } else if (b == 3) {
            uu9 uu9Var4 = this.n1;
            if (uu9Var4 != null) {
                tx7 tx7Var3 = (tx7) hashMap.remove(uu9Var4);
                if (tx7Var3 != null) {
                    this.g0.removeView(tx7Var3);
                }
                this.n1 = null;
            }
        } else if (b == 0 && this.j1.size() >= 20) {
            return;
        }
        this.p1.put(str, uu9Var);
        this.M.setEnabled(false);
        this.M.setAlpha(0.5f);
        ba4.G(this.currentAccount).h0(false, 16777216, str, true);
        H0(uu9Var, i);
        V1(i);
    }

    public final /* synthetic */ void x1(TLRPC.TL_error tL_error, String str, bx7 bx7Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error != null) {
            ij.c0(this.currentAccount, tL_error, this, sendverifyphonecode, str);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("phone", str);
        vx7 vx7Var = new vx7(7, this.E, this.K, this.F, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
        vx7Var.currentAccount = this.currentAccount;
        vx7Var.f1 = this.f1;
        vx7Var.d1 = this.d1;
        vx7Var.C1 = bx7Var;
        vx7Var.L = (TLRPC.TL_auth_sentCode) tLObject;
        presentFragment(vx7Var, true);
    }

    public final void y1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ow7(this, (byte) 3)), this.classGuid);
    }

    public final void z1() {
        hd hdVar = this.L1;
        if (hdVar == null) {
            return;
        }
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        this.L1 = null;
    }

    public vx7(int i, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.s = "";
        this.w = "";
        byte b = 3;
        this.y = new int[3];
        this.l0 = new ArrayList();
        this.u0 = new boolean[3];
        this.v0 = true;
        this.V0 = new ArrayList();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.Y0 = new HashMap();
        this.j1 = new ArrayList();
        this.l1 = new ArrayList();
        this.o1 = new HashMap();
        this.p1 = new HashMap();
        this.q1 = new HashMap();
        this.r1 = new HashMap();
        this.s1 = new HashMap();
        this.v1 = new HashMap();
        this.w1 = new HashMap();
        this.z1 = new HashMap();
        this.E1 = new xw7(this);
        this.b = i;
        this.E = authorizationform;
        this.F = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.v0 = tL_secureRequiredType.native_names;
        }
        this.I = tL_secureValue;
        this.G = tL_secureRequiredType2;
        this.J = tL_secureValue2;
        this.K = password;
        this.t1 = hashMap;
        this.u1 = hashMap2;
        if (i == 3) {
            this.N1 = new ArrayList();
        } else if (i == 7) {
            this.K1 = new jja[3];
        }
        if (hashMap == null) {
            this.t1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.u1 = new HashMap();
        }
        if (i == 5) {
            if (y6c.h(this.currentAccount).k0 != null && y6c.h(this.currentAccount).l0 != null) {
                this.O0 = (byte) 1;
                this.P0 = y6c.h(this.currentAccount).k0;
                this.Q0 = y6c.h(this.currentAccount).l0;
            }
            TL_account.Password password2 = this.K;
            if (password2 == null) {
                y1();
            } else {
                TwoStepVerificationActivity.e0(password2);
                if (this.O0 == 1) {
                    D1(true);
                }
            }
            if (gba.g0 == null) {
                TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
                tL_help_getPassportConfig.hash = gba.h0;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new ce2(b));
            }
        }
    }
}
