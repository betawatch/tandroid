package org.telegram.ui;

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yj0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public org.telegram.ui.Cells.x6 A0;
    public String A1;
    public LinearLayout B0;
    public String B1;
    public ImageView C0;
    public pj0 C1;
    public TextView D0;
    public boolean D1;
    public TL_account.authorizationForm E;
    public TextView E0;
    public final zi0 E1;
    public final TLRPC.TL_secureRequiredType F;
    public TextView F0;
    public String F1;
    public TLRPC.TL_secureRequiredType G;
    public org.telegram.ui.Components.gy G0;
    public Runnable G1;
    public ArrayList H;
    public org.telegram.ui.Cells.y8 H0;
    public nj0 H1;
    public final TLRPC.TL_secureValue I;
    public org.telegram.ui.Cells.y8 I0;
    public pj0 I1;
    public final TLRPC.TL_secureValue J;
    public ImageView J0;
    public int J1;
    public TL_account.Password K;
    public TextView K0;
    public final org.telegram.ui.Components.vt0[] K1;
    public TLRPC.TL_auth_sentCode L;
    public TextView L0;
    public org.telegram.ui.ActionBar.s1 L1;
    public org.telegram.ui.ActionBar.q0 M;
    public FrameLayout M0;
    public Dialog M1;
    public AnimatorSet N;
    public TextView N0;
    public final ArrayList N1;
    public org.telegram.ui.Components.aq O;
    public int O0;
    public int O1;
    public TextView P;
    public final byte[] P0;
    public int P1;
    public org.telegram.ui.Components.aq Q;
    public final byte[] Q0;
    public int Q1;
    public FrameLayout R;
    public String R0;
    public org.telegram.ui.Cells.v9 S;
    public org.telegram.ui.Components.bi S0;
    public View T;
    public int T0;
    public View U;
    public int U0;
    public org.telegram.ui.Cells.x8 V;
    public final ArrayList V0;
    public org.telegram.ui.Cells.x8 W;
    public final HashMap W0;
    public org.telegram.ui.Cells.x8 X;
    public final HashMap X0;
    public org.telegram.ui.Cells.v9 Y;
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
    public yj0 i1;
    public LinearLayout j0;
    public final ArrayList j1;
    public org.telegram.ui.Cells.n4 k0;
    public org.telegram.messenger.wv k1;
    public final ArrayList l0;
    public final ArrayList l1;
    public org.telegram.ui.Cells.x6 m0;
    public org.telegram.messenger.wv m1;
    public final String n;
    public org.telegram.ui.Cells.x6 n0;
    public org.telegram.messenger.wv n1;
    public org.telegram.ui.Cells.y8 o0;
    public final HashMap o1;
    public org.telegram.ui.Cells.y8 p0;
    public final HashMap p1;
    public org.telegram.ui.Cells.y8 q0;
    public final HashMap q1;
    public final String r;
    public org.telegram.ui.Cells.y8 r0;
    public final HashMap r1;
    public String s;
    public org.telegram.ui.Cells.v9 s0;
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
    public org.telegram.ui.Cells.v9 y0;
    public HashMap y1;
    public org.telegram.ui.Cells.v9 z0;
    public final HashMap z1;

    public yj0(int i3, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.s = "";
        this.w = "";
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
        this.E1 = new zi0(this);
        this.b = i3;
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
        if (i3 == 3) {
            this.N1 = new ArrayList();
        } else if (i3 == 7) {
            this.K1 = new org.telegram.ui.Components.vt0[3];
        }
        if (hashMap == null) {
            this.t1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.u1 = new HashMap();
        }
        if (i3 == 5) {
            if (org.telegram.messenger.h10.i(this.currentAccount).k0 != null && org.telegram.messenger.h10.i(this.currentAccount).l0 != null) {
                this.O0 = 1;
                this.P0 = org.telegram.messenger.h10.i(this.currentAccount).k0;
                this.Q0 = org.telegram.messenger.h10.i(this.currentAccount).l0;
            }
            TL_account.Password password2 = this.K;
            if (password2 == null) {
                A1();
            } else {
                TwoStepVerificationActivity.r0(password2);
                if (this.O0 == 1) {
                    F1(true);
                }
            }
            if (org.telegram.messenger.az.j0 != null) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = org.telegram.messenger.az.k0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new ei.u5(24));
        }
    }

    public static int G0(yj0 yj0Var, String str) {
        yj0Var.getClass();
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

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ed, code lost:
    
        if (r7 != 5) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0261, code lost:
    
        if (r9 > 24) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x026d, code lost:
    
        if (r9 < 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x027c, code lost:
    
        if (r9 < 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0285, code lost:
    
        if (r9 > 10) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H0(yj0 yj0Var) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        boolean z10;
        View view;
        ArrayList arrayList = yj0Var.l1;
        ArrayList arrayList2 = yj0Var.j1;
        HashMap hashMap = yj0Var.o1;
        HashMap hashMap2 = yj0Var.z1;
        if (yj0Var.G != null) {
            if (hashMap2.containsKey("error_all") || hashMap2.containsKey("error_document_all")) {
                yj0Var.D1(yj0Var.q0);
                return true;
            }
            if (yj0Var.S != null) {
                if (arrayList2.isEmpty()) {
                    yj0Var.D1(yj0Var.S);
                    return true;
                }
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    org.telegram.messenger.wv wvVar = (org.telegram.messenger.wv) arrayList2.get(i3);
                    String str = "files" + r1(wvVar);
                    if (str != null && hashMap2.containsKey(str)) {
                        yj0Var.D1((View) hashMap.get(wvVar));
                        return true;
                    }
                }
            }
            if (hashMap2.containsKey("files_all") || hashMap2.containsKey("translation_all")) {
                yj0Var.D1(yj0Var.o0);
                return true;
            }
            View view2 = yj0Var.V;
            if (view2 != null) {
                if (yj0Var.m1 == null) {
                    yj0Var.D1(view2);
                    return true;
                }
                if (hashMap2.containsKey("front" + r1(yj0Var.m1))) {
                    yj0Var.D1((View) hashMap.get(yj0Var.m1));
                    return true;
                }
            }
            TLRPC.SecureValueType secureValueType = yj0Var.G.type;
            if (((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) && (view = yj0Var.W) != null) {
                if (yj0Var.n1 == null) {
                    yj0Var.D1(view);
                    return true;
                }
                if (hashMap2.containsKey("reverse" + r1(yj0Var.n1))) {
                    yj0Var.D1((View) hashMap.get(yj0Var.n1));
                    return true;
                }
            }
            View view3 = yj0Var.X;
            if (view3 != null && yj0Var.c != 0) {
                if (yj0Var.k1 == null) {
                    yj0Var.D1(view3);
                    return true;
                }
                if (hashMap2.containsKey("selfie" + r1(yj0Var.k1))) {
                    yj0Var.D1((View) hashMap.get(yj0Var.k1));
                    return true;
                }
            }
            if (yj0Var.Y != null && yj0Var.c != 0) {
                if (arrayList.isEmpty()) {
                    yj0Var.D1(yj0Var.Y);
                    return true;
                }
                int size2 = arrayList.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.wv wvVar2 = (org.telegram.messenger.wv) arrayList.get(i10);
                    if (hashMap2.containsKey("translation" + r1(wvVar2))) {
                        yj0Var.D1((View) hashMap.get(wvVar2));
                        return true;
                    }
                }
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                editTextBoldCursorArr = yj0Var.Z;
            } else {
                org.telegram.ui.Cells.y8 y8Var = yj0Var.r0;
                editTextBoldCursorArr = (y8Var == null || y8Var.getVisibility() != 0) ? null : yj0Var.b0;
            }
            if (editTextBoldCursorArr != null) {
                int i12 = 0;
                while (i12 < editTextBoldCursorArr.length) {
                    boolean z11 = !TextUtils.isEmpty(editTextBoldCursorArr[i12].x0);
                    if (!hashMap2.isEmpty()) {
                        TLRPC.SecureValueType secureValueType2 = yj0Var.F.type;
                        String str2 = "country_code";
                        if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (i12 == 0) {
                                    str2 = "street_line1";
                                } else if (i12 == 1) {
                                    str2 = "street_line2";
                                } else if (i12 == 2) {
                                    str2 = "post_code";
                                } else if (i12 == 3) {
                                    str2 = "city";
                                } else if (i12 == 4) {
                                    str2 = "state";
                                }
                                if (str2 != null) {
                                }
                            }
                            str2 = null;
                            if (str2 != null) {
                            }
                        } else if (i11 == 0) {
                            switch (i12) {
                                case 0:
                                    str2 = "first_name";
                                    break;
                                case 1:
                                    str2 = "middle_name";
                                    break;
                                case 2:
                                    str2 = "last_name";
                                    break;
                                case 3:
                                    str2 = "birth_date";
                                    break;
                                case 4:
                                    str2 = "gender";
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    str2 = "residence_country_code";
                                    break;
                                case 7:
                                    str2 = "document_no";
                                    break;
                                case 8:
                                    str2 = "expiry_date";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                String str3 = (String) hashMap2.get(str2);
                                if (!TextUtils.isEmpty(str3) && str3.equals(editTextBoldCursorArr[i12].getText().toString())) {
                                    z11 = true;
                                }
                            }
                        } else {
                            if (i12 == 0) {
                                str2 = "first_name_native";
                            } else if (i12 != 1) {
                                if (i12 == 2) {
                                    str2 = "last_name_native";
                                }
                                str2 = null;
                            } else {
                                str2 = "middle_name_native";
                            }
                            if (str2 != null) {
                            }
                        }
                    }
                    if (!yj0Var.w0 || yj0Var.G == null || i12 >= 7) {
                        if (!z11) {
                            int length = editTextBoldCursorArr[i12].length();
                            int i13 = yj0Var.b;
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    if (i12 == 1) {
                                        continue;
                                    } else if (i12 != 3) {
                                        if (i12 == 4) {
                                            if (!"US".equals(yj0Var.s)) {
                                                continue;
                                            }
                                        } else if (i12 == 2) {
                                            if (length >= 2) {
                                            }
                                            z10 = false;
                                            z11 = true;
                                        }
                                    }
                                }
                                z10 = false;
                            } else if (i12 != 8) {
                                if ((i11 == 0 && (i12 == 0 || i12 == 2 || i12 == 1)) || (i11 == 1 && (i12 == 0 || i12 == 1 || i12 == 2))) {
                                    if (length > 255) {
                                        z11 = true;
                                    }
                                    if ((i11 == 0 && i12 == 1) || (i11 == 1 && i12 == 1)) {
                                        z10 = true;
                                    }
                                } else if (i12 == 7) {
                                }
                                z10 = false;
                            } else {
                                continue;
                            }
                            if (!z11 && !z10 && length == 0) {
                                z11 = true;
                            }
                        }
                        if (z11) {
                            yj0Var.D1(editTextBoldCursorArr[i12]);
                            return true;
                        }
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    public static void N0(yj0 yj0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        HashMap hashMap = yj0Var.z1;
        if (hashMap == null || (str2 = (String) hashMap.get(str)) == null) {
            editTextBoldCursor.setErrorText(null);
        } else if (TextUtils.equals(str2, editable)) {
            HashMap hashMap2 = yj0Var.x1;
            if (hashMap2 == null || (str4 = (String) hashMap2.get(str)) == null) {
                HashMap hashMap3 = yj0Var.y1;
                if (hashMap3 != null && (str3 = (String) hashMap3.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str3);
                }
            } else {
                editTextBoldCursor.setErrorText(str4);
            }
        } else {
            editTextBoldCursor.setErrorText(null);
        }
        String str5 = z10 ? "error_document_all" : "error_all";
        if (hashMap == null || !hashMap.containsKey(str5)) {
            return;
        }
        hashMap.remove(str5);
        yj0Var.e1(false);
    }

    public static void T1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z10, boolean z11) {
        if (editTextBoldCursorArr == null) {
            return;
        }
        for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
                if (z10) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.k6.L6, null);
                    if (z11) {
                        int paddingLeft = editTextBoldCursor.getPaddingLeft();
                        int paddingTop = editTextBoldCursor.getPaddingTop();
                        int paddingRight = editTextBoldCursor.getPaddingRight();
                        int paddingBottom = editTextBoldCursor.getPaddingBottom();
                        org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
                        if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                            editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void Z(yj0 yj0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = yj0Var.K;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        yj0Var.presentFragment(new ra1(yj0Var.currentAccount, 4, password));
    }

    public static void a0(yj0 yj0Var) {
        ArrayList arrayList;
        int i3;
        int i10;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = yj0Var.s1;
        HashMap hashMap2 = yj0Var.r1;
        String str = yj0Var.r;
        ArrayList arrayList2 = new ArrayList();
        int size = yj0Var.E.required_types.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.SecureRequiredType secureRequiredType = yj0Var.E.required_types.get(i11);
            if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                tL_secureRequiredType = (TLRPC.TL_secureRequiredType) secureRequiredType;
            } else {
                if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                    TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                    if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                        TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                        if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                            int size2 = tL_secureRequiredTypeOneOf.types.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    tL_secureRequiredType = tL_secureRequiredType4;
                                    break;
                                }
                                TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i12);
                                if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                    if (yj0Var.v1(tL_secureRequiredType5, true) != null) {
                                        tL_secureRequiredType = tL_secureRequiredType5;
                                        break;
                                    }
                                }
                                i12++;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            TLRPC.TL_secureValue v12 = yj0Var.v1(tL_secureRequiredType, true);
            if (v12 == null) {
                Vibrator vibrator = (Vibrator) yj0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                xj0 xj0Var = (xj0) hashMap2.get(tL_secureRequiredType);
                if (xj0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    xj0Var = (xj0) hashMap2.get(tL_secureRequiredType2);
                }
                org.telegram.messenger.g0.F3(xj0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) yj0Var.v1.get(s1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) yj0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                xj0 xj0Var2 = (xj0) hashMap2.get(tL_secureRequiredType);
                if (xj0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    xj0Var2 = (xj0) hashMap2.get(tL_secureRequiredType3);
                }
                org.telegram.messenger.g0.F3(xj0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            aj0 aj0Var = new aj0();
            aj0Var.a = v12;
            aj0Var.b = z10;
            aj0Var.c = z11;
            arrayList2.add(aj0Var);
        }
        yj0Var.R1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = yj0Var.c;
        acceptauthorization.scope = yj0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            aj0 aj0Var2 = (aj0) arrayList2.get(i13);
            TLRPC.TL_secureValue tL_secureValue = aj0Var2.a;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData == null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] m1 = yj0Var.m1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(m1, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (tL_secureValue.files.isEmpty()) {
                        i3 = size3;
                        i10 = i13;
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        int i14 = 0;
                        for (int size4 = tL_secureValue.files.size(); i14 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i14);
                            i3 = size3;
                            try {
                                i10 = i13;
                                try {
                                    byte[] m12 = yj0Var.m1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(m12, 2));
                                    jSONArray.put(jSONObject4);
                                    i14++;
                                    size3 = i3;
                                    i13 = i10;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i3 = size3;
                        i10 = i13;
                        jSONObject3.put("files", jSONArray);
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] m13 = yj0Var.m1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(m13, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] m14 = yj0Var.m1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(m14, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (aj0Var2.b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] m15 = yj0Var.m1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(m15, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (aj0Var2.c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i15 = 0; i15 < size5; i15++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i15);
                            byte[] m16 = yj0Var.m1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(m16, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(s1(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i13 = i10 + 1;
                arrayList2 = arrayList;
                size3 = i3;
            } else if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
            }
            arrayList = arrayList2;
            i3 = size3;
            i10 = i13;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i13 = i10 + 1;
            arrayList2 = arrayList;
            size3 = i3;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj = yj0Var.d;
        if (obj != null) {
            try {
                jSONObject9.put("payload", obj);
            } catch (Exception unused6) {
            }
        }
        Object obj2 = yj0Var.e;
        if (obj2 != null) {
            try {
                jSONObject9.put("nonce", obj2);
            } catch (Exception unused7) {
            }
        }
        b8.ke o12 = yj0Var.o1(org.telegram.messenger.g0.h1(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) o12.e;
        tL_secureCredentialsEncrypted.data = (byte[]) o12.d;
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, rSAPublicKey);
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) o12.c);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ConnectionsManager.getInstance(yj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(yj0Var.currentAccount).sendRequest(acceptauthorization, new qi0(yj0Var, 1)), yj0Var.classGuid);
    }

    public static /* synthetic */ void b0(yj0 yj0Var, TLRPC.TL_error tL_error, String str, pj0 pj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error != null) {
            org.telegram.ui.Components.t4.e0(yj0Var.currentAccount, tL_error, yj0Var, sendverifyphonecode, str);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("phone", str);
        yj0 yj0Var2 = new yj0(7, yj0Var.E, yj0Var.K, yj0Var.F, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
        yj0Var2.currentAccount = yj0Var.currentAccount;
        yj0Var2.f1 = yj0Var.f1;
        yj0Var2.d1 = yj0Var.d1;
        yj0Var2.C1 = pj0Var;
        yj0Var2.L = (TLRPC.TL_auth_sentCode) tLObject;
        yj0Var.presentFragment(yj0Var2, true);
    }

    public static /* synthetic */ void c0(yj0 yj0Var, org.telegram.messenger.wv wvVar, int i3) {
        String str = wvVar.c;
        HashMap hashMap = yj0Var.o1;
        int i10 = yj0Var.T0;
        if (i10 == 1) {
            org.telegram.messenger.wv wvVar2 = yj0Var.k1;
            if (wvVar2 != null) {
                wj0 wj0Var = (wj0) hashMap.remove(wvVar2);
                if (wj0Var != null) {
                    yj0Var.h0.removeView(wj0Var);
                }
                yj0Var.k1 = null;
            }
        } else if (i10 == 4) {
            if (yj0Var.l1.size() >= 20) {
                return;
            }
        } else if (i10 == 2) {
            org.telegram.messenger.wv wvVar3 = yj0Var.m1;
            if (wvVar3 != null) {
                wj0 wj0Var2 = (wj0) hashMap.remove(wvVar3);
                if (wj0Var2 != null) {
                    yj0Var.f0.removeView(wj0Var2);
                }
                yj0Var.m1 = null;
            }
        } else if (i10 == 3) {
            org.telegram.messenger.wv wvVar4 = yj0Var.n1;
            if (wvVar4 != null) {
                wj0 wj0Var3 = (wj0) hashMap.remove(wvVar4);
                if (wj0Var3 != null) {
                    yj0Var.g0.removeView(wj0Var3);
                }
                yj0Var.n1 = null;
            }
        } else if (i10 == 0 && yj0Var.j1.size() >= 20) {
            return;
        }
        yj0Var.p1.put(str, wvVar);
        yj0Var.M.setEnabled(false);
        yj0Var.M.setAlpha(0.5f);
        org.telegram.messenger.w7.G(yj0Var.currentAccount).i0(false, 16777216, str, true);
        yj0Var.V0(wvVar, i3);
        yj0Var.X1(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void d0(yj0 yj0Var, boolean z10, String str) {
        byte[] bArr;
        byte[] c2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        if (z10) {
            c2 = yj0Var.P0;
        } else {
            if (!(yj0Var.K.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
                bArr = null;
                mj0 mj0Var = new mj0(yj0Var, z10, bArr, getpasswordsettings, str);
                TL_account.Password password = yj0Var.K;
                passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "PASSWORD_HASH_INVALID";
                    mj0Var.run(null, tL_error);
                    return;
                }
                TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.hv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                getpasswordsettings.password = d;
                if (d != null) {
                    ConnectionsManager.getInstance(yj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(yj0Var.currentAccount).sendRequest(getpasswordsettings, mj0Var, 10), yj0Var.classGuid);
                    return;
                } else {
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "ALGO_INVALID";
                    mj0Var.run(null, tL_error2);
                    return;
                }
            }
            c2 = org.telegram.messenger.hv.c(org.telegram.messenger.g0.h1(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) yj0Var.K.current_algo);
        }
        bArr = c2;
        mj0 mj0Var2 = new mj0(yj0Var, z10, bArr, getpasswordsettings, str);
        TL_account.Password password2 = yj0Var.K;
        passwordKdfAlgo = password2.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        }
    }

    public static boolean d1(byte[] bArr, Long l10) {
        if (bArr != null && bArr.length == 32) {
            int i3 = 0;
            for (byte b10 : bArr) {
                i3 += b10 & 255;
            }
            if (i3 % org.telegram.messenger.hs.e4 == 239 && (l10 == null || Utilities.g(Utilities.o(bArr.length, bArr)) == l10.longValue())) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void e0(int i3, String str, org.telegram.messenger.wv wvVar, wj0 wj0Var, yj0 yj0Var) {
        String str2 = wvVar.c;
        HashMap hashMap = yj0Var.p1;
        yj0Var.o1.remove(wvVar);
        if (i3 == 1) {
            yj0Var.k1 = null;
            yj0Var.h0.removeView(wj0Var);
        } else if (i3 == 4) {
            yj0Var.l1.remove(wvVar);
            yj0Var.i0.removeView(wj0Var);
        } else if (i3 == 2) {
            yj0Var.m1 = null;
            yj0Var.f0.removeView(wj0Var);
        } else if (i3 == 3) {
            yj0Var.n1 = null;
            yj0Var.g0.removeView(wj0Var);
        } else {
            yj0Var.j1.remove(wvVar);
            yj0Var.e0.removeView(wj0Var);
        }
        if (str != null) {
            HashMap hashMap2 = yj0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = yj0Var.z1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        yj0Var.X1(i3);
        if (str2 == null || hashMap.remove(str2) == null) {
            return;
        }
        if (hashMap.isEmpty()) {
            yj0Var.M.setEnabled(true);
            yj0Var.M.setAlpha(1.0f);
        }
        org.telegram.messenger.w7.G(yj0Var.currentAccount).b(str2, false);
    }

    public static /* synthetic */ void f0(yj0 yj0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i3 = 0; i3 < yj0Var.E.values.size(); i3++) {
            deletesecurevalue.types.add(yj0Var.E.values.get(i3).type);
        }
        yj0Var.C1();
        ConnectionsManager.getInstance(yj0Var.currentAccount).sendRequest(deletesecurevalue, new qi0(yj0Var, 2));
    }

    public static void g0(yj0 yj0Var) {
        ra1 ra1Var = new ra1(yj0Var.currentAccount, 0, yj0Var.K);
        ra1Var.Z = true;
        yj0Var.presentFragment(ra1Var);
    }

    public static void h0(yj0 yj0Var) {
        if (yj0Var.K.has_recovery) {
            yj0Var.C1();
            ConnectionsManager.getInstance(yj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(yj0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new qi0(yj0Var, 0), 10), yj0Var.classGuid);
            return;
        }
        if (yj0Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131746080, null), new pi0(yj0Var, 4));
        String M0 = org.telegram.messenger.bd.M0(2131746081, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131746083, null);
        yj0Var.showDialog(s1Var);
    }

    public static String l1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr2.length != 32 || bArr3 == null || bArr3.length != 32) {
            return null;
        }
        byte[] r5 = Utilities.r(bArr2, bArr3);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r5, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r5, 32, bArr5, 0, 16);
        int length = bArr.length;
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        Utilities.b(bArr6, bArr4, bArr5, 0, length, 0, 0);
        if (!Arrays.equals(Utilities.o(length, bArr6), bArr3)) {
            return null;
        }
        int i3 = bArr6[0] & 255;
        return new String(bArr6, i3, length - i3);
    }

    public static String r1(org.telegram.messenger.wv wvVar) {
        byte[] bArr;
        if (wvVar == null) {
            return "";
        }
        TLRPC.TL_secureFile tL_secureFile = wvVar.b;
        if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
            return Base64.encodeToString(bArr, 2);
        }
        byte[] bArr2 = wvVar.f;
        return bArr2 != null ? Base64.encodeToString(bArr2, 2) : "";
    }

    public static String s1(TLRPC.SecureValueType secureValueType) {
        return secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails ? "personal_details" : secureValueType instanceof TLRPC.TL_secureValueTypePassport ? "passport" : secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport ? "internal_passport" : secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense ? "driver_license" : secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard ? "identity_card" : secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill ? "utility_bill" : secureValueType instanceof TLRPC.TL_secureValueTypeAddress ? "address" : secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement ? "bank_statement" : secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement ? "rental_agreement" : secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration ? "temporary_registration" : secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration ? "passport_registration" : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? "email" : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? "phone" : "";
    }

    public static byte[] t1() {
        byte[] bArr = new byte[32];
        Utilities.b.nextBytes(bArr);
        int i3 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            i3 += 255 & bArr[i10];
        }
        int i11 = i3 % org.telegram.messenger.hs.e4;
        if (i11 != 239) {
            int i12 = org.telegram.messenger.hs.O3 - i11;
            int nextInt = Utilities.b.nextInt(32);
            int i13 = (bArr[nextInt] & 255) + i12;
            if (i13 < 255) {
                i13 += org.telegram.messenger.hs.e4;
            }
            bArr[nextInt] = (byte) (i13 % org.telegram.messenger.hs.e4);
        }
        return bArr;
    }

    public static String u1(TLRPC.SecureValueType secureValueType) {
        return secureValueType instanceof TLRPC.TL_secureValueTypePassport ? org.telegram.messenger.bd.M0(2131754676, null) : secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense ? org.telegram.messenger.bd.M0(2131754681, null) : secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard ? org.telegram.messenger.bd.M0(2131754678, null) : secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill ? org.telegram.messenger.bd.M0(2131754671, null) : secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement ? org.telegram.messenger.bd.M0(2131754682, null) : secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement ? org.telegram.messenger.bd.M0(2131754673, null) : secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport ? org.telegram.messenger.bd.M0(2131754677, null) : secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration ? org.telegram.messenger.bd.M0(2131754675, null) : secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration ? org.telegram.messenger.bd.M0(2131754672, null) : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? org.telegram.messenger.bd.M0(2131754674, null) : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? org.telegram.messenger.bd.M0(2131754680, null) : "";
    }

    public static boolean x1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) || (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) || (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement);
    }

    public static boolean z1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard);
    }

    public final void A1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new qi0(this, 3)), this.classGuid);
    }

    public final void B1() {
        org.telegram.ui.ActionBar.s1 s1Var = this.L1;
        if (s1Var == null) {
            return;
        }
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.L1 = null;
    }

    public final void C1() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.L1 != null) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
        this.L1 = s1Var;
        s1Var.j0 = false;
        s1Var.show();
    }

    public final void D1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        org.telegram.messenger.g0.F3(view);
        M1(view);
    }

    public final void E1(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z10) {
            this.Z[0].setText("");
        }
        org.telegram.messenger.g0.F3(this.Z[0]);
    }

    public final void F1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.Z[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E1(false);
                return;
            }
            R1(true, true);
        }
        Utilities.e.c(new a60(this, z10, obj, 3));
    }

    public final void G1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (w1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754674, null));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (w1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754680, null));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (w1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754679, null));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754676, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754677, null));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754675, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754672, null));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754678, null));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (w1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754681, null));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (w1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754683, null));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (w1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754671, null));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (w1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754682, null));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754673, null));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() == null || arrayList.isEmpty()) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131747504, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new u(8, this, arrayList2));
        showDialog(s1Var);
    }

    public final void H1() {
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i3 = this.T0;
        ArrayList arrayList = this.j1;
        int i10 = 1;
        if (i3 == 0 && arrayList.size() >= 20) {
            Q1(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.a0("PassportUploadMaxReached", null, 2131747459, org.telegram.messenger.bd.G(20, "Files", new Object[0])));
            return;
        }
        g1();
        org.telegram.ui.Components.bi biVar = this.S0;
        int i11 = this.T0;
        biVar.P3 = i11 == 1;
        if (i11 != 0) {
            if (i11 == 4) {
                size = this.l1.size();
            }
            biVar.y1(i10, false);
            this.S0.b2.i0();
            this.S0.e1();
            showDialog(this.S0);
        }
        size = arrayList.size();
        i10 = 20 - size;
        biVar.y1(i10, false);
        this.S0.b2.i0();
        this.S0.e1();
        showDialog(this.S0);
    }

    public final void I1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
        HashMap hashMap;
        HashMap hashMap2;
        int size = arrayList != null ? arrayList.size() : 0;
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2 != null ? tL_secureRequiredType2.type : null;
        int i3 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails ? 1 : secureValueType instanceof TLRPC.TL_secureValueTypeAddress ? 2 : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? 3 : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? 4 : -1;
        if (i3 != -1) {
            HashMap hashMap3 = this.v1;
            HashMap hashMap4 = !z10 ? (HashMap) hashMap3.get(s1(secureValueType)) : null;
            HashMap hashMap5 = (HashMap) hashMap3.get(s1(secureValueType2));
            TLRPC.TL_secureValue v12 = v1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap4;
            TL_account.authorizationForm authorizationform = this.E;
            int i10 = i3;
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
            yj0 yj0Var = new yj0(i10, authorizationform, password, tL_secureRequiredType, v12, tL_secureRequiredType2, v13, hashMap8, hashMap2);
            yj0Var.C1 = new dj0(this, secureValueType, z10, size);
            yj0Var.currentAccount = this.currentAccount;
            yj0Var.f1 = this.f1;
            yj0Var.d1 = this.d1;
            yj0Var.c = this.c;
            yj0Var.x1 = hashMap6;
            yj0Var.w0 = z10;
            yj0Var.y1 = hashMap;
            yj0Var.H = arrayList;
            if (i10 == 4) {
                yj0Var.e1 = this.e1;
            }
            presentFragment(yj0Var);
        }
    }

    public final void J1(int i3) {
        if (i3 == 0) {
            int i10 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.R0 = q02.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void K1(ArrayList arrayList) {
        boolean z10;
        if (arrayList.isEmpty()) {
            return;
        }
        int i3 = this.T0;
        boolean z11 = true;
        if (i3 == 1 || i3 == 4 || !(this.F.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            z10 = false;
        } else {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i10 < editTextBoldCursorArr.length) {
                    if (i10 != 5 && i10 != 8 && i10 != 4 && i10 != 6 && editTextBoldCursorArr[i10].length() > 0) {
                        z11 = false;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            z10 = z11;
        }
        Utilities.e.c(new org.telegram.messenger.voip.j0(this.T0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue L1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.E.values.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (tL_secureRequiredType.type.getClass() == this.E.values.get(i3).type.getClass()) {
                return this.E.values.remove(i3);
            }
        }
        return null;
    }

    public final void M1(View view) {
        while (view != null && this.d0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.c0.smoothScrollTo(0, view.getTop() - ((this.c0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void N1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
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
                            editTextBoldCursor.setText(org.telegram.messenger.bd.M0(2131747577, null));
                            break;
                        }
                    } else {
                        this.x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.bd.M0(2131747516, null));
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
                    editTextBoldCursor.setText(org.telegram.messenger.bd.M0(2131747502, null));
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

    public final void O1(Bundle bundle, int i3, boolean z10) {
        if (i3 == 3) {
            this.M.setVisibility(8);
        }
        int i10 = this.J1;
        org.telegram.ui.Components.vt0[] vt0VarArr = this.K1;
        org.telegram.ui.Components.vt0 vt0Var = vt0VarArr[i10];
        org.telegram.ui.Components.vt0 vt0Var2 = vt0VarArr[i3];
        this.J1 = i3;
        vt0Var2.m(bundle, false);
        vt0Var2.j();
        if (!z10) {
            vt0Var2.setTranslationX(0.0f);
            vt0Var2.setVisibility(0);
            if (vt0Var != vt0Var2) {
                vt0Var.setVisibility(8);
                return;
            }
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        vt0Var2.setTranslationX(point.x);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(vt0Var, "translationX", -point.x), ObjectAnimator.ofFloat(vt0Var2, "translationX", 0.0f));
        animatorSet.addListener(new org.telegram.ui.Components.ri0(vt0Var2, vt0Var, 9));
        animatorSet.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x031e, code lost:
    
        if (r4.equals("residence_country_code") != false) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022a A[Catch: all -> 0x023e, TryCatch #3 {all -> 0x023e, blocks: (B:180:0x0220, B:181:0x0224, B:183:0x022a, B:185:0x0236, B:188:0x0242), top: B:179:0x0220, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0256 A[Catch: Exception -> 0x036a, TryCatch #2 {Exception -> 0x036a, blocks: (B:273:0x01ec, B:192:0x0253, B:194:0x0256, B:197:0x0260, B:266:0x024e, B:279:0x0209, B:180:0x0220, B:181:0x0224, B:183:0x022a, B:185:0x0236, B:188:0x0242), top: B:272:0x01ec, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, boolean z10, int i3) {
        int i10;
        StringBuilder sb2;
        boolean z11;
        TLRPC.TL_secureValue tL_secureValue;
        xj0 xj0Var;
        String[] strArr;
        String[] strArr2;
        int i11;
        int i12;
        JSONObject jSONObject;
        int i13;
        String[] strArr3;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        String[] strArr4;
        StringBuilder sb3;
        int i14;
        String[] strArr5;
        HashMap hashMap3;
        HashMap hashMap4;
        JSONObject jSONObject3;
        Iterator<String> keys;
        String sb4;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap5;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4;
        HashMap hashMap6;
        TLRPC.SecureValueType secureValueType;
        boolean z12;
        boolean z13;
        xj0 xj0Var2;
        String str4 = str2;
        xj0 xj0Var3 = (xj0) this.r1.get(tL_secureRequiredType);
        if (xj0Var3 == null) {
            if (this.b != 8) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (tL_secureRequiredType2 != null) {
                arrayList.add(tL_secureRequiredType2);
            }
            LinearLayout linearLayout = this.d0;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
            if (childAt instanceof xj0) {
                ((xj0) childAt).setNeedDivider(true);
            }
            xj0Var3 = Y0(getParentActivity(), tL_secureRequiredType, arrayList, true, true);
            V1();
        }
        xj0 xj0Var4 = xj0Var3;
        HashMap hashMap7 = (HashMap) this.q1.get(tL_secureRequiredType);
        HashMap hashMap8 = tL_secureRequiredType2 != null ? (HashMap) this.q1.get(tL_secureRequiredType2) : null;
        TLRPC.TL_secureValue v12 = v1(tL_secureRequiredType, true);
        TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType2, true);
        if (str4 == null || this.Z0 != null) {
            i10 = 2;
            this.Z0 = null;
        } else {
            this.Z0 = new HashMap();
            try {
                i10 = 2;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(org.telegram.messenger.t0.b.getResources().getAssets().open("countries.txt")));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split(";");
                        this.Z0.put(split[1], split[2]);
                    }
                    bufferedReader.close();
                } catch (Exception e10) {
                    e = e10;
                    org.telegram.messenger.a8.g(e, true);
                    if (str == null) {
                    }
                    if (z10) {
                    }
                    if (tL_secureRequiredType2 == null) {
                    }
                    if (hashMap5 != null) {
                    }
                    secureValueType = tL_secureRequiredType3.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    }
                    xj0Var2.setValue(sb4);
                    org.telegram.ui.ActionBar.r6.V(xj0Var2.b, !z13 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.z6, null);
                    xj0Var2.setChecked((!z13 || this.b == 8 || ((!z10 || tL_secureRequiredType4 == null) && (z10 || tL_secureValue == null)) || (tL_secureRequiredType4 != null && v13 == null)) ? z11 : z12);
                }
            } catch (Exception e11) {
                e = e11;
                i10 = 2;
            }
        }
        if (str == null) {
            TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                sb4 = mf.b.c().b("+".concat(str));
                xj0Var = xj0Var4;
            } else {
                xj0Var = xj0Var4;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
                    sb4 = str;
                } else {
                    tL_secureValue = v12;
                    z11 = false;
                    sb4 = null;
                }
            }
            tL_secureValue = v12;
            z11 = false;
        } else {
            if (this.b == 8 || tL_secureRequiredType2 == null || (TextUtils.isEmpty(str3) && v13 == null)) {
                sb2 = null;
            } else {
                sb2 = new StringBuilder();
                if (i3 > 1) {
                    sb2.append(u1(tL_secureRequiredType2.type));
                } else if (TextUtils.isEmpty(str3)) {
                    sb2.append(org.telegram.messenger.bd.M0(2131747584, null));
                }
            }
            if (str4 == null && str3 == null) {
                xj0Var = xj0Var4;
                tL_secureValue = v12;
                z11 = false;
            } else {
                if (hashMap7 == null) {
                    return;
                }
                hashMap7.clear();
                TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
                z11 = false;
                boolean z14 = true;
                tL_secureValue = v12;
                xj0Var = xj0Var4;
                if (secureValueType3 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    int i15 = this.b;
                    if (i15 != 0 || z10) {
                        int i16 = i15 == 8 ? tL_secureRequiredType2 != null ? 8 : 8 : 8;
                        strArr2 = null;
                        if (i15 != 0 || (i15 == i16 && tL_secureRequiredType2 != null)) {
                            strArr = new String[i10];
                            strArr[0] = "document_no";
                            strArr[1] = "expiry_date";
                            if (strArr2 == null || strArr != null) {
                                StringBuilder sb5 = sb2;
                                String[] strArr6 = strArr;
                                i12 = 0;
                                JSONObject jSONObject4 = null;
                                String[] strArr7 = null;
                                while (i12 < 2) {
                                    if (i12 == 0) {
                                        if (str4 != null) {
                                            try {
                                                jSONObject = new JSONObject(str4);
                                                i13 = i12;
                                                strArr3 = strArr2;
                                                if (strArr3 != null && jSONObject != null) {
                                                    try {
                                                        keys = jSONObject.keys();
                                                        while (keys.hasNext()) {
                                                            Iterator<String> it = keys;
                                                            String next = keys.next();
                                                            if (i13 == 0) {
                                                                hashMap7.put(next, jSONObject.getString(next));
                                                            } else {
                                                                hashMap8.put(next, jSONObject.getString(next));
                                                            }
                                                            keys = it;
                                                        }
                                                    } catch (Throwable th2) {
                                                        org.telegram.messenger.a8.g(th2, z14);
                                                    }
                                                    i14 = 0;
                                                    while (i14 < strArr3.length) {
                                                        if (jSONObject.has(strArr3[i14])) {
                                                            sb2 = sb5 == null ? new StringBuilder() : sb5;
                                                            strArr5 = strArr3;
                                                            try {
                                                                String string = jSONObject.getString(strArr5[i14]);
                                                                if (string == null || TextUtils.isEmpty(string)) {
                                                                    hashMap3 = hashMap7;
                                                                } else {
                                                                    hashMap3 = hashMap7;
                                                                    if (!"first_name_native".equals(strArr5[i14]) && !"middle_name_native".equals(strArr5[i14]) && !"last_name_native".equals(strArr5[i14])) {
                                                                        if (sb2.length() > 0) {
                                                                            if (!"last_name".equals(strArr5[i14]) && !"last_name_native".equals(strArr5[i14]) && !"middle_name".equals(strArr5[i14]) && !"middle_name_native".equals(strArr5[i14])) {
                                                                                sb2.append(", ");
                                                                            }
                                                                            sb2.append(" ");
                                                                        }
                                                                        String str5 = strArr5[i14];
                                                                        hashMap4 = hashMap8;
                                                                        int hashCode = str5.hashCode();
                                                                        jSONObject3 = jSONObject;
                                                                        if (hashCode != -2006252145) {
                                                                            if (hashCode != -1249512767) {
                                                                                if (hashCode == 1481071862 && str5.equals("country_code")) {
                                                                                    String str6 = (String) this.Z0.get(string);
                                                                                    if (str6 != null) {
                                                                                        sb2.append(str6);
                                                                                    }
                                                                                }
                                                                            } else if (str5.equals("gender")) {
                                                                                if ("male".equals(string)) {
                                                                                    sb2.append(org.telegram.messenger.bd.M0(2131747516, null));
                                                                                } else if ("female".equals(string)) {
                                                                                    sb2.append(org.telegram.messenger.bd.M0(2131747577, null));
                                                                                }
                                                                            }
                                                                            sb2.append(string);
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
                                                            sb2 = sb5;
                                                        }
                                                        i14++;
                                                        sb5 = sb2;
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
                                                sb3 = sb5;
                                                i12 = i13 + 1;
                                                str4 = str2;
                                                sb5 = sb3;
                                                strArr7 = strArr4;
                                                hashMap7 = hashMap;
                                                hashMap8 = hashMap2;
                                                jSONObject4 = jSONObject2;
                                                z14 = true;
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        String[] strArr8 = strArr7;
                                        i13 = i12;
                                        strArr3 = strArr8;
                                        jSONObject = jSONObject4;
                                        if (strArr3 != null) {
                                            keys = jSONObject.keys();
                                            while (keys.hasNext()) {
                                            }
                                            i14 = 0;
                                            while (i14 < strArr3.length) {
                                            }
                                        }
                                        strArr4 = strArr3;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        jSONObject2 = jSONObject;
                                        sb3 = sb5;
                                        i12 = i13 + 1;
                                        str4 = str2;
                                        sb5 = sb3;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                        z14 = true;
                                    } else if (hashMap8 == null) {
                                        jSONObject2 = jSONObject4;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        strArr4 = strArr7;
                                        sb3 = sb5;
                                        i13 = i12;
                                        i12 = i13 + 1;
                                        str4 = str2;
                                        sb5 = sb3;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                        z14 = true;
                                    } else {
                                        if (str3 != null) {
                                            jSONObject = new JSONObject(str3);
                                            i13 = i12;
                                            strArr3 = strArr6;
                                            if (strArr3 != null) {
                                            }
                                            strArr4 = strArr3;
                                            hashMap = hashMap7;
                                            hashMap2 = hashMap8;
                                            jSONObject2 = jSONObject;
                                            sb3 = sb5;
                                            i12 = i13 + 1;
                                            str4 = str2;
                                            sb5 = sb3;
                                            strArr7 = strArr4;
                                            hashMap7 = hashMap;
                                            hashMap8 = hashMap2;
                                            jSONObject4 = jSONObject2;
                                            z14 = true;
                                        }
                                        String[] strArr82 = strArr7;
                                        i13 = i12;
                                        strArr3 = strArr82;
                                        jSONObject = jSONObject4;
                                        if (strArr3 != null) {
                                        }
                                        strArr4 = strArr3;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        jSONObject2 = jSONObject;
                                        sb3 = sb5;
                                        i12 = i13 + 1;
                                        str4 = str2;
                                        sb5 = sb3;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                        z14 = true;
                                    }
                                }
                                sb2 = sb5;
                            }
                        }
                        strArr = null;
                        if (strArr2 == null) {
                        }
                        StringBuilder sb52 = sb2;
                        String[] strArr62 = strArr;
                        i12 = 0;
                        JSONObject jSONObject42 = null;
                        String[] strArr72 = null;
                        while (i12 < 2) {
                        }
                        sb2 = sb52;
                    }
                    String[] strArr9 = new String[10];
                    strArr9[0] = "first_name";
                    strArr9[1] = "middle_name";
                    strArr9[i10] = "last_name";
                    strArr9[3] = "first_name_native";
                    strArr9[4] = "middle_name_native";
                    strArr9[5] = "last_name_native";
                    strArr9[6] = "birth_date";
                    strArr9[7] = "gender";
                    strArr2 = strArr9;
                    strArr2[8] = "country_code";
                    strArr2[9] = "residence_country_code";
                    if (i15 != 0) {
                    }
                    strArr = new String[i10];
                    strArr[0] = "document_no";
                    strArr[1] = "expiry_date";
                    if (strArr2 == null) {
                    }
                    StringBuilder sb522 = sb2;
                    String[] strArr622 = strArr;
                    i12 = 0;
                    JSONObject jSONObject422 = null;
                    String[] strArr722 = null;
                    while (i12 < 2) {
                    }
                    sb2 = sb522;
                } else if (!(secureValueType3 instanceof TLRPC.TL_secureValueTypeAddress) || (((i11 = this.b) != 0 || z10) && !(i11 == 8 && tL_secureRequiredType2 == null))) {
                    strArr = null;
                    strArr2 = null;
                    if (strArr2 == null) {
                    }
                    StringBuilder sb5222 = sb2;
                    String[] strArr6222 = strArr;
                    i12 = 0;
                    JSONObject jSONObject4222 = null;
                    String[] strArr7222 = null;
                    while (i12 < 2) {
                    }
                    sb2 = sb5222;
                } else {
                    strArr2 = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                    strArr = null;
                    if (strArr2 == null) {
                    }
                    StringBuilder sb52222 = sb2;
                    String[] strArr62222 = strArr;
                    i12 = 0;
                    JSONObject jSONObject42222 = null;
                    String[] strArr72222 = null;
                    while (i12 < 2) {
                    }
                    sb2 = sb52222;
                }
            }
            if (sb2 != null) {
                sb4 = sb2.toString();
            }
            sb4 = null;
        }
        if (z10) {
            tL_secureRequiredType3 = tL_secureRequiredType;
            hashMap5 = (HashMap) this.v1.get(s1(tL_secureRequiredType3.type));
        } else {
            tL_secureRequiredType3 = tL_secureRequiredType;
            hashMap5 = null;
        }
        if (tL_secureRequiredType2 == null) {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            hashMap6 = (HashMap) this.v1.get(s1(tL_secureRequiredType4.type));
        } else {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            hashMap6 = null;
        }
        if ((hashMap5 != null || hashMap5.size() <= 0) && (hashMap6 == null || hashMap6.size() <= 0)) {
            secureValueType = tL_secureRequiredType3.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                    if (TextUtils.isEmpty(sb4)) {
                        if (tL_secureRequiredType4 == null) {
                            sb4 = org.telegram.messenger.bd.M0(2131747607, null);
                        } else if (this.b == 8) {
                            sb4 = org.telegram.messenger.bd.M0(2131747584, null);
                        } else {
                            z12 = true;
                            if (i3 == 1) {
                                TLRPC.SecureValueType secureValueType4 = tL_secureRequiredType4.type;
                                if (secureValueType4 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                    sb4 = org.telegram.messenger.bd.M0(2131747633, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                    sb4 = org.telegram.messenger.bd.M0(2131747629, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                    sb4 = org.telegram.messenger.bd.M0(2131747619, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                    sb4 = org.telegram.messenger.bd.M0(2131747617, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                    sb4 = org.telegram.messenger.bd.M0(2131747631, null);
                                }
                            } else {
                                sb4 = org.telegram.messenger.bd.M0(2131747608, null);
                            }
                        }
                        z13 = z11;
                        xj0Var2 = xj0Var;
                        z12 = true;
                    }
                    z12 = true;
                } else {
                    z12 = true;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                        if (TextUtils.isEmpty(sb4)) {
                            sb4 = org.telegram.messenger.bd.M0(2131747495, null);
                        }
                    } else if ((secureValueType instanceof TLRPC.TL_secureValueTypeEmail) && TextUtils.isEmpty(sb4)) {
                        sb4 = org.telegram.messenger.bd.M0(2131747581, null);
                    }
                }
                z13 = z11;
                xj0Var2 = xj0Var;
            } else {
                if (TextUtils.isEmpty(sb4)) {
                    if (tL_secureRequiredType4 == null) {
                        sb4 = org.telegram.messenger.bd.M0(2131747498, null);
                    } else if (this.b == 8) {
                        sb4 = org.telegram.messenger.bd.M0(2131747584, null);
                    } else if (i3 == 1) {
                        TLRPC.SecureValueType secureValueType5 = tL_secureRequiredType4.type;
                        if (secureValueType5 instanceof TLRPC.TL_secureValueTypePassport) {
                            sb4 = org.telegram.messenger.bd.M0(2131747568, null);
                        } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                            sb4 = org.telegram.messenger.bd.M0(2131747569, null);
                        } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            sb4 = org.telegram.messenger.bd.M0(2131747571, null);
                        } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                            sb4 = org.telegram.messenger.bd.M0(2131747570, null);
                        }
                    } else {
                        sb4 = org.telegram.messenger.bd.M0(2131747572, null);
                    }
                    z13 = z11;
                    xj0Var2 = xj0Var;
                    z12 = true;
                }
                z12 = true;
                z13 = z11;
                xj0Var2 = xj0Var;
            }
        } else {
            sb4 = !z10 ? (String) this.w1.get(s1(tL_secureRequiredType3.type)) : null;
            if (sb4 == null) {
                sb4 = (String) this.w1.get(s1(tL_secureRequiredType4.type));
            }
            xj0Var2 = xj0Var;
            z12 = true;
            z13 = true;
        }
        xj0Var2.setValue(sb4);
        org.telegram.ui.ActionBar.r6.V(xj0Var2.b, !z13 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.z6, null);
        xj0Var2.setChecked((!z13 || this.b == 8 || ((!z10 || tL_secureRequiredType4 == null) && (z10 || tL_secureValue == null)) || (tL_secureRequiredType4 != null && v13 == null)) ? z11 : z12);
    }

    public final void Q1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = str;
        s1Var.U = str2;
        showDialog(s1Var);
    }

    public final void R1(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i3 = 1;
        int i10 = 0;
        if (z10 && this.M != null) {
            this.N = new AnimatorSet();
            if (z11) {
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
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.O, (Property<org.telegram.ui.Components.aq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.O, (Property<org.telegram.ui.Components.aq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.O, (Property<org.telegram.ui.Components.aq, Float>) property3, 1.0f));
            } else {
                this.M.getContentView().setVisibility(0);
                this.M.setEnabled(true);
                AnimatorSet animatorSet3 = this.N;
                org.telegram.ui.Components.aq aqVar = this.O;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aqVar, (Property<org.telegram.ui.Components.aq, Float>) property4, 0.1f);
                org.telegram.ui.Components.aq aqVar2 = this.O;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(aqVar2, (Property<org.telegram.ui.Components.aq, Float>) property5, 0.1f);
                org.telegram.ui.Components.aq aqVar3 = this.O;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(aqVar3, (Property<org.telegram.ui.Components.aq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.M.getContentView(), (Property<View, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), (Property<View, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), (Property<View, Float>) property6, 1.0f));
            }
            this.N.addListener(new ej0(this, z11, i10));
            this.N.setDuration(150L);
            this.N.start();
            return;
        }
        if (this.P != null) {
            this.N = new AnimatorSet();
            if (z11) {
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
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<org.telegram.ui.Components.aq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<org.telegram.ui.Components.aq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<org.telegram.ui.Components.aq, Float>) property9, 1.0f));
            } else {
                this.P.setVisibility(0);
                this.R.setEnabled(true);
                AnimatorSet animatorSet5 = this.N;
                org.telegram.ui.Components.aq aqVar4 = this.Q;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(aqVar4, (Property<org.telegram.ui.Components.aq, Float>) property10, 0.1f);
                org.telegram.ui.Components.aq aqVar5 = this.Q;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(aqVar5, (Property<org.telegram.ui.Components.aq, Float>) property11, 0.1f);
                org.telegram.ui.Components.aq aqVar6 = this.Q;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(aqVar6, (Property<org.telegram.ui.Components.aq, Float>) property12, 0.0f), ObjectAnimator.ofFloat(this.P, (Property<TextView, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.P, (Property<TextView, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.P, (Property<TextView, Float>) property12, 1.0f));
            }
            this.N.addListener(new ej0(this, z11, i3));
            this.N.setDuration(150L);
            this.N.start();
        }
    }

    public final void S1(boolean z10, String str, Runnable runnable, nj0 nj0Var, pj0 pj0Var) {
        boolean z11;
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
        boolean z12 = (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0) ? false : true;
        if (getParentActivity() == null || !z12) {
            z11 = true;
        } else {
            z11 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (z10) {
                this.N1.clear();
                if (!z11) {
                    this.N1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.N1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        String M0 = org.telegram.messenger.bd.M0(2131754275, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.U = M0;
                        this.M1 = showDialog(s1Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.N1.toArray(new String[0]), 6);
                    }
                    this.F1 = str;
                    this.H1 = nj0Var;
                    this.G1 = runnable;
                    this.I1 = pj0Var;
                    return;
                }
            }
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        tL_codeSettings.allow_flashcall = z12 && z11;
        tL_codeSettings.allow_app_hash = org.telegram.messenger.lt.b.hasServices();
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            boolean z13 = org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.u();
            edit.putString("sms_hash", "O2P2z+/jBpJ").commit();
        } else {
            sharedPreferences.edit().remove("sms_hash").commit();
        }
        if (sendverifyphonecode.settings.allow_flashcall) {
            try {
                String line1Number = telephonyManager.getLine1Number();
                if (TextUtils.isEmpty(line1Number)) {
                    TLRPC.TL_codeSettings tL_codeSettings2 = sendverifyphonecode.settings;
                    tL_codeSettings2.unknown_number = true;
                    tL_codeSettings2.current_number = false;
                } else {
                    sendverifyphonecode.settings.current_number = PhoneNumberUtils.compare(str, line1Number);
                    TLRPC.TL_codeSettings tL_codeSettings3 = sendverifyphonecode.settings;
                    if (!tL_codeSettings3.current_number) {
                        tL_codeSettings3.allow_flashcall = false;
                    }
                }
            } catch (Exception e10) {
                sendverifyphonecode.settings.allow_flashcall = false;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new ai.q1(this, str, pj0Var, sendverifyphonecode, 15), 2);
    }

    public final void U1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(u1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747500, null));
        }
        X1(2);
        X1(3);
        X1(1);
        X1(4);
    }

    public final void V0(final org.telegram.messenger.wv wvVar, final int i3) {
        String M0;
        final String str;
        String v;
        HashMap hashMap;
        if (i3 == 1) {
            this.k1 = wvVar;
            if (this.h0 == null) {
                return;
            }
        } else if (i3 == 4) {
            this.l1.add(wvVar);
            if (this.i0 == null) {
                return;
            }
        } else if (i3 == 2) {
            this.m1 = wvVar;
            if (this.f0 == null) {
                return;
            }
        } else if (i3 == 3) {
            this.n1 = wvVar;
            if (this.g0 == null) {
                return;
            }
        } else {
            this.j1.add(wvVar);
            if (this.e0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final wj0 wj0Var = new wj0(this, getParentActivity());
        wj0Var.setTag(wvVar);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
        wj0Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(wj0Var, N0, N, N2, null);
        this.o1.put(wvVar, wj0Var);
        String r12 = r1(wvVar);
        if (i3 == 1) {
            M0 = org.telegram.messenger.bd.M0(2131747471, null);
            this.h0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "selfie" + r12;
        } else if (i3 == 4) {
            M0 = org.telegram.messenger.bd.M0(2131753948, null);
            this.i0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "translation" + r12;
        } else if (i3 == 2) {
            TLRPC.SecureValueType secureValueType = this.G.type;
            M0 = ((secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) ? org.telegram.messenger.bd.M0(2131747518, null) : org.telegram.messenger.bd.M0(2131747576, null);
            this.f0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "front" + r12;
        } else if (i3 == 3) {
            M0 = org.telegram.messenger.bd.M0(2131747480, null);
            this.g0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "reverse" + r12;
        } else {
            M0 = org.telegram.messenger.bd.M0(2131753948, null);
            this.e0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "files" + r12;
        }
        TextView textView = wj0Var.b;
        if (str == null || (hashMap = this.y1) == null || (v = (String) hashMap.get(str)) == null) {
            v = org.telegram.messenger.bd.v(wvVar.b.date);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.p7, null);
            this.z1.put(str, "");
        }
        wj0Var.a.setText(M0);
        textView.setText(v);
        org.telegram.ui.Components.k9 k9Var = wj0Var.c;
        k9Var.getClass();
        org.telegram.messenger.ac acVar = new org.telegram.messenger.ac();
        acVar.h = wvVar;
        k9Var.n(acVar, "48_48", null, null, null, null, 0, null);
        wj0Var.f = wvVar;
        wj0Var.a(false);
        wj0Var.setOnClickListener(new bi.q(this, i3, 26));
        wj0Var.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.ri0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                yj0 yj0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
                int i10 = i3;
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                if (i10 == 1) {
                    s1Var.U = org.telegram.messenger.bd.M0(2131747590, null);
                } else {
                    s1Var.U = org.telegram.messenger.bd.M0(2131747592, null);
                }
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                s1Var.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new ai.m3(yj0Var, wvVar, i10, wj0Var, str, 5));
                yj0Var.showDialog(s1Var);
                return true;
            }
        });
    }

    public final void V1() {
        if (this.E.values.isEmpty()) {
            this.B0.setVisibility(0);
            this.m0.setVisibility(8);
            this.k0.setVisibility(8);
            this.y0.setVisibility(8);
            this.z0.setVisibility(8);
            this.A0.setVisibility(8);
            return;
        }
        this.B0.setVisibility(8);
        this.m0.setVisibility(0);
        this.k0.setVisibility(0);
        this.z0.setVisibility(0);
        this.A0.setVisibility(0);
        if (w1(TLRPC.TL_secureValueTypePhone.class) || w1(TLRPC.TL_secureValueTypeEmail.class) || w1(TLRPC.TL_secureValueTypePersonalDetails.class) || w1(TLRPC.TL_secureValueTypePassport.class) || w1(TLRPC.TL_secureValueTypeInternalPassport.class) || w1(TLRPC.TL_secureValueTypeIdentityCard.class) || w1(TLRPC.TL_secureValueTypeDriverLicense.class) || w1(TLRPC.TL_secureValueTypeAddress.class) || w1(TLRPC.TL_secureValueTypeUtilityBill.class) || w1(TLRPC.TL_secureValueTypePassportRegistration.class) || w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) || w1(TLRPC.TL_secureValueTypeBankStatement.class) || w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.y0.setVisibility(0);
        } else {
            this.y0.setVisibility(8);
        }
    }

    public final void W0(TLRPC.TL_secureFile tL_secureFile, int i3) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] r5 = Utilities.r(m1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(r5, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(r5, 32, bArr4, 0, 16);
        V0(new org.telegram.messenger.wv(new org.telegram.messenger.xv(bArr3, bArr4), tL_secureFile, null, null, null), i3);
    }

    public final void W1() {
        ImageView imageView = this.J0;
        if (imageView == null) {
            return;
        }
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
        if (!password.has_password) {
            this.H0.setVisibility(0);
            this.J0.setVisibility(0);
            this.K0.setVisibility(0);
            this.L0.setVisibility(0);
            this.M0.setVisibility(8);
            this.a0[0].setVisibility(8);
            this.M.setVisibility(8);
            this.N0.setVisibility(8);
            this.I0.setVisibility(8);
            this.H0.setLayoutParams(b8.mf.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
            this.G0.setVisibility(8);
            return;
        }
        this.H0.setVisibility(0);
        this.J0.setVisibility(8);
        this.K0.setVisibility(8);
        this.L0.setVisibility(8);
        this.G0.setVisibility(8);
        this.M0.setVisibility(0);
        this.a0[0].setVisibility(0);
        this.M.setVisibility(0);
        this.N0.setVisibility(0);
        this.I0.setVisibility(0);
        this.H0.setLayoutParams(b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        if (this.Z != null) {
            TL_account.Password password2 = this.K;
            if (password2 == null || TextUtils.isEmpty(password2.hint)) {
                this.Z[0].setHint(org.telegram.messenger.bd.M0(2131748734, null));
            } else {
                this.Z[0].setHint(this.K.hint);
            }
        }
    }

    public final void X0(ArrayList arrayList) {
        this.j1.clear();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i3);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_secureValueTypeDriverLicense) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X1(int i3) {
        TLRPC.SecureValueType secureValueType;
        boolean z10 = true;
        if (i3 == 0) {
            if (this.S == null) {
                return;
            }
            if (this.j1.size() >= 1) {
                this.S.b(org.telegram.messenger.bd.M0(2131747461, null), false);
                return;
            } else {
                this.S.b(org.telegram.messenger.bd.M0(2131747460, null), false);
                return;
            }
        }
        if (i3 == 1) {
            org.telegram.ui.Cells.x8 x8Var = this.X;
            if (x8Var == null) {
                return;
            }
            x8Var.setVisibility(this.k1 != null ? 8 : 0);
            return;
        }
        if (i3 == 4) {
            if (this.Y == null) {
                return;
            }
            if (this.l1.size() >= 1) {
                this.Y.b(org.telegram.messenger.bd.M0(2131747461, null), false);
                return;
            } else {
                this.Y.b(org.telegram.messenger.bd.M0(2131747460, null), false);
                return;
            }
        }
        if (i3 != 2) {
            if (i3 != 3 || this.W == null) {
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
        org.telegram.ui.Cells.x8 x8Var2 = this.V;
        if (x8Var2 == null) {
            return;
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        if (tL_secureRequiredType != null) {
            if (!tL_secureRequiredType.selfie_required) {
                TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
                if (!(secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                }
            }
            secureValueType = tL_secureRequiredType.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                x8Var2.a(org.telegram.messenger.bd.M0(2131747518, null), org.telegram.messenger.bd.M0(2131747517, null), z10);
            } else {
                x8Var2.a(org.telegram.messenger.bd.M0(2131747576, null), org.telegram.messenger.bd.M0(2131747575, null), z10);
            }
            this.V.setVisibility(this.m1 != null ? 8 : 0);
        }
        z10 = false;
        secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
        }
        x8Var2.a(org.telegram.messenger.bd.M0(2131747518, null), org.telegram.messenger.bd.M0(2131747517, null), z10);
        this.V.setVisibility(this.m1 != null ? 8 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xj0 Y0(Context context, TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        String str3;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        String str4;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        String str5;
        TLRPC.TL_secureValue v12;
        int size = arrayList != null ? arrayList.size() : 0;
        xj0 xj0Var = new xj0(context);
        int i3 = this.b;
        int i10 = i3 == 8 ? 21 : 51;
        TextView textView = new TextView(context);
        xj0Var.a = textView;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = null;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        boolean z12 = org.telegram.messenger.bd.a0;
        xj0Var.addView(textView, b8.mf.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? i10 : 21, 10.0f, z12 ? 21 : i10, 0.0f));
        TextView textView2 = new TextView(context);
        xj0Var.b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z13 = org.telegram.messenger.bd.a0;
        xj0Var.addView(textView2, b8.mf.d(-2, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i10 : 21, 35.0f, z13 ? 21 : i10, 0.0f));
        ImageView imageView = new ImageView(context);
        xj0Var.c = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ai, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageResource(R.drawable.sticker_added);
        xj0Var.addView(imageView, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
        xj0Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(xj0Var, N0, N, N2, null);
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            xj0Var.a((arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.bd.M0(2131747499, null) : (z10 && arrayList.size() == 1) ? u1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type) : (z10 && arrayList.size() == 2) ? org.telegram.messenger.bd.a0("PassportTwoDocuments", null, 2131747462, u1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), u1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : org.telegram.messenger.bd.M0(2131747573, null), !z11);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            xj0Var.a((arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.bd.M0(2131747610, null) : (z10 && arrayList.size() == 1) ? u1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type) : (z10 && arrayList.size() == 2) ? org.telegram.messenger.bd.a0("PassportTwoDocuments", null, 2131747462, u1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), u1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : org.telegram.messenger.bd.M0(2131747481, null), !z11);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            xj0Var.a(org.telegram.messenger.bd.M0(2131747496, null), !z11);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            xj0Var.a(org.telegram.messenger.bd.M0(2131747583, null), !z11);
        }
        if (i3 == 8) {
            this.d0.addView(xj0Var, r9.getChildCount() - 5, b8.mf.o(-1, -2));
        } else {
            this.d0.addView(xj0Var, b8.mf.o(-1, -2));
        }
        xj0Var.setOnClickListener(new ei.u3(arrayList, tL_secureRequiredType, this, z10));
        this.r1.put(tL_secureRequiredType, xj0Var);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.q1;
        hashMap2.put(tL_secureRequiredType, hashMap);
        TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType, false);
        if (v13 != null) {
            TLRPC.SecurePlainData securePlainData = v13.plain_data;
            if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                str = ((TLRPC.TL_securePlainEmail) securePlainData).email;
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                str = ((TLRPC.TL_securePlainPhone) securePlainData).phone;
            } else {
                TLRPC.TL_secureData tL_secureData = v13.data;
                if (tL_secureData != null) {
                    str2 = l1(tL_secureData.data, m1(tL_secureData.secret, tL_secureData.data_hash), v13.data.data_hash);
                    str = null;
                    if (arrayList != null || arrayList.isEmpty()) {
                        str3 = str;
                        tL_secureRequiredType2 = tL_secureRequiredType;
                        str4 = str2;
                        tL_secureRequiredType3 = null;
                        str5 = null;
                    } else {
                        int size2 = arrayList.size();
                        int i11 = 0;
                        boolean z14 = false;
                        String str6 = null;
                        while (i11 < size2) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList.get(i11);
                            hashMap2.put(tL_secureRequiredType5, new HashMap());
                            this.s1.put(tL_secureRequiredType5, tL_secureRequiredType);
                            String str7 = str;
                            if (!z14 && (v12 = v1(tL_secureRequiredType5, false)) != null) {
                                TLRPC.TL_secureData tL_secureData2 = v12.data;
                                if (tL_secureData2 != null) {
                                    str6 = l1(tL_secureData2.data, m1(tL_secureData2.secret, tL_secureData2.data_hash), v12.data.data_hash);
                                }
                                tL_secureRequiredType4 = tL_secureRequiredType5;
                                z14 = true;
                            }
                            i11++;
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
                    P1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z10, size);
                    return xj0Var;
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
            P1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z10, size);
            return xj0Var;
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
        P1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z10, size);
        return xj0Var;
    }

    public final void Z0(ArrayList arrayList) {
        this.l1.clear();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i3);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void a1(boolean z10) {
        if (this.h1) {
            return;
        }
        String str = this.n;
        boolean isEmpty = TextUtils.isEmpty(str);
        int i3 = this.b;
        if (isEmpty) {
            if (this.D1) {
                if (z10 || (!this.g1 && (i3 == 5 || i3 == 0))) {
                    getParentActivity().setResult(z10 ? -1 : 0);
                }
                this.h1 = true;
                return;
            }
            return;
        }
        if (z10) {
            sf.c.q(getParentActivity(), Uri.parse(str + "&tg_passport=success"), true, true);
        } else if (!this.g1 && (i3 == 5 || i3 == 0)) {
            sf.c.q(getParentActivity(), Uri.parse(str + "&tg_passport=cancel"), true, true);
        }
        this.h1 = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    public final boolean b1(boolean z10) {
        if (y1()) {
            return false;
        }
        int i3 = 1;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new pi0(this, i3));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            String M0 = org.telegram.messenger.bd.M0(2131751406, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131747587, null);
            showDialog(s1Var);
        }
        return true;
    }

    public final void c1(boolean z10) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.b0 == null) {
            return;
        }
        String str2 = (String) this.Z0.get(this.w);
        String str3 = (String) org.telegram.messenger.az.n().get(this.w);
        int i3 = 0;
        if (!this.F.native_names || TextUtils.isEmpty(this.w) || "EN".equals(str3)) {
            if (this.r0.getVisibility() != 8) {
                this.r0.setVisibility(8);
                this.k0.setVisibility(8);
                this.U.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.b0;
                    if (i3 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i3].getParent()).setVisibility(8);
                    i3++;
                }
                if (((this.c == 0 && this.G != null) || this.I == null || this.w0) && this.J == null) {
                    org.telegram.ui.ActionBar.r6.a0(this.n0, getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    return;
                } else {
                    org.telegram.ui.ActionBar.r6.a0(this.n0, getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                    return;
                }
            }
            return;
        }
        int i10 = 2;
        if (this.r0.getVisibility() != 0) {
            this.r0.setVisibility(0);
            this.k0.setVisibility(0);
            this.U.setVisibility(0);
            int i11 = 0;
            while (true) {
                editTextBoldCursorArr = this.b0;
                if (i11 >= editTextBoldCursorArr.length) {
                    break;
                }
                ((View) editTextBoldCursorArr[i11].getParent()).setVisibility(0);
                i11++;
            }
            if (editTextBoldCursorArr[0].length() == 0 && this.b0[1].length() == 0 && this.b0[2].length() == 0) {
                int i12 = 0;
                while (true) {
                    boolean[] zArr = this.u0;
                    if (i12 >= zArr.length) {
                        break;
                    }
                    if (zArr[i12]) {
                        this.b0[0].setText(this.Z[0].getText());
                        this.b0[1].setText(this.Z[1].getText());
                        this.b0[2].setText(this.Z[2].getText());
                        break;
                    }
                    i12++;
                }
            }
            org.telegram.ui.ActionBar.r6.a0(this.n0, getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
        }
        this.r0.setText(org.telegram.messenger.bd.a0("PassportNativeInfo", null, 2131747506, str2));
        if (str3 != null) {
            String concat = "PassportLanguage_".concat(str3);
            str = org.telegram.messenger.bd.E0().Y.b(concat);
            if (str == null) {
                org.telegram.messenger.bd E0 = org.telegram.messenger.bd.E0();
                E0.i();
                str = E0.W.b(concat);
            }
        } else {
            str = null;
        }
        if (str != null) {
            this.k0.setText(org.telegram.messenger.bd.a0("PassportNativeHeaderLang", null, 2131747507, str));
        } else {
            this.k0.setText(org.telegram.messenger.bd.M0(2131747508, null));
        }
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        if (str != null) {
                            this.b0[i13].setHintText(org.telegram.messenger.bd.M0(2131747466, null));
                        } else {
                            this.b0[i13].setHintText(org.telegram.messenger.bd.a0("PassportSurnameCountry", null, 2131747465, str2));
                        }
                    }
                } else if (str != null) {
                    this.b0[i13].setHintText(org.telegram.messenger.bd.M0(2131747515, null));
                } else {
                    this.b0[i13].setHintText(org.telegram.messenger.bd.a0("PassportMidnameCountry", null, 2131747514, str2));
                }
            } else if (str != null) {
                this.b0[i13].setHintText(org.telegram.messenger.bd.M0(2131747512, null));
            } else {
                this.b0[i13].setHintText(org.telegram.messenger.bd.a0("PassportNameCountry", null, 2131747510, str2));
            }
        }
        if (z10) {
            org.telegram.messenger.g0.h3(new mi0(this, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a67  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i3;
        int i10;
        TLRPC.User user;
        org.telegram.ui.ActionBar.e6 e6Var;
        ArrayList arrayList;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        boolean z10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        TLRPC.User f10;
        org.telegram.ui.Components.bi biVar;
        Context context2 = context;
        int i11 = 0;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z11 = true;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new hj0(this));
        int i12 = 4;
        int i13 = 3;
        int i14 = this.b;
        if (i14 == 7) {
            org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this, context2, i12);
            this.c0 = k1Var;
            this.fragmentView = k1Var;
            k1Var.setFillViewport(true);
            org.telegram.messenger.g0.z3(this.c0, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false));
        } else {
            FrameLayout frameLayout = new FrameLayout(context2);
            this.fragmentView = frameLayout;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
            ai.l4 l4Var = new ai.l4(context2, i13);
            this.c0 = l4Var;
            l4Var.setFillViewport(true);
            org.telegram.messenger.g0.z3(this.c0, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false));
            frameLayout.addView(this.c0, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i14 == 0 ? 48.0f : 0.0f));
            LinearLayout linearLayout = new LinearLayout(context2);
            this.d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.c0.addView(this.d0, new FrameLayout.LayoutParams(-1, -2));
        }
        if (i14 != 0 && i14 != 8) {
            this.M = this.actionBar.q().h(2, R.drawable.ic_ab_done, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.bd.M0(2131751355, null));
            org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context2, 1);
            this.O = aqVar;
            aqVar.setAlpha(0.0f);
            this.O.setScaleX(0.1f);
            this.O.setScaleY(0.1f);
            this.O.setVisibility(4);
            this.M.addView(this.O, b8.mf.c(-1.0f, -1));
            if ((i14 == 1 || i14 == 2) && (biVar = this.S0) != null) {
                try {
                    if (biVar.isShowing()) {
                        this.S0.dismiss();
                    }
                } catch (Exception unused) {
                }
                this.S0.j1();
                this.S0 = null;
            }
        }
        String str2 = "PassportRequest";
        if (i14 == 5) {
            if (this.E != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= this.E.users.size()) {
                        str = str2;
                        f10 = null;
                        break;
                    }
                    f10 = this.E.users.get(i15);
                    str = str2;
                    if (f10.id == this.c) {
                        break;
                    }
                    i15++;
                    str2 = str;
                }
            } else {
                str = "PassportRequest";
                f10 = org.telegram.messenger.h10.i(this.currentAccount).f();
            }
            FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131744247, null));
            org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context2, null);
            this.G0 = gyVar;
            gyVar.b();
            frameLayout2.addView(this.G0, b8.mf.c(-1.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context2);
            this.M0 = frameLayout3;
            this.d0.addView(frameLayout3, b8.mf.o(-1, 100));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context2);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
            this.M0.addView(k9Var, b8.mf.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            k9Var.e(f10, new org.telegram.ui.Components.u8(0, f10));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context2);
            this.H0 = y8Var;
            y8Var.getTextView().setGravity(1);
            if (this.c == 0) {
                this.H0.setText(org.telegram.messenger.bd.M0(2131747472, null));
            } else {
                this.H0.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(str, null, 2131747486, org.telegram.messenger.l10.j(f10, true))));
            }
            ((FrameLayout.LayoutParams) this.H0.getTextView().getLayoutParams()).gravity = 1;
            this.d0.addView(this.H0, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
            ImageView imageView = new ImageView(context2);
            this.J0 = imageView;
            imageView.setImageResource(R.drawable.no_password);
            org.telegram.ui.ActionBar.r6.t(this.J0, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
            this.d0.addView(this.J0, b8.mf.t(-2, -2, 49, 0, 13, 0, 0));
            TextView textView = new TextView(context2);
            this.K0 = textView;
            textView.setTextSize(1, 14.0f);
            this.K0.setGravity(1);
            this.K0.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(17.0f));
            org.telegram.ui.ActionBar.r6.V(this.K0, org.telegram.ui.ActionBar.k6.B6, null);
            this.K0.setText(org.telegram.messenger.bd.M0(2131744245, null));
            this.d0.addView(this.K0, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(context2);
            this.L0 = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r6, null);
            this.L0.setGravity(17);
            this.L0.setTextSize(1, 16.0f);
            this.L0.setTypeface(org.telegram.messenger.g0.o());
            this.L0.setText(org.telegram.messenger.bd.M0(2131744246, null));
            this.d0.addView(this.L0, b8.mf.d(-1, 24.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
            this.L0.setOnClickListener(new ni0(this, 10));
            this.Z = new EditTextBoldCursor[1];
            this.a0 = new ViewGroup[]{new FrameLayout(context2)};
            this.d0.addView(this.a0[0], b8.mf.o(-1, 50));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.a0[0], null);
            this.Z[0] = new EditTextBoldCursor(context2);
            this.Z[0].setTag(0);
            this.Z[0].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.E(this.Z[0], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Z[0];
            int i16 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i16, null);
            this.Z[0].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Z[0], i16, null);
            this.Z[0].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Z[0].setCursorWidth(1.5f);
            this.Z[0].setInputType(org.telegram.messenger.hs.N1);
            this.Z[0].setMaxLines(1);
            this.Z[0].setLines(1);
            this.Z[0].setSingleLine(true);
            this.Z[0].setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.Z[0].setTypeface(Typeface.DEFAULT);
            this.Z[0].setImeOptions(268435462);
            this.Z[0].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
            this.Z[0].setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
            this.a0[0].addView(this.Z[0], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.Z[0].setOnEditorActionListener(new li0(this, 5));
            this.Z[0].setCustomSelectionActionModeCallback(new mi.b1(3));
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context2);
            this.I0 = y8Var2;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
            this.I0.setText(org.telegram.messenger.bd.a0("PassportRequestPasswordInfo", null, 2131747485, new Object[0]));
            this.d0.addView(this.I0, b8.mf.o(-1, -2));
            TextView textView3 = new TextView(context2);
            this.N0 = textView3;
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q6, null);
            this.N0.setTextSize(1, 14.0f);
            this.N0.setText(org.telegram.messenger.bd.M0(2131750592, null));
            this.N0.setPadding(0, 0, 0, 0);
            this.d0.addView(this.N0, b8.mf.t(-2, 30, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 21, 0, 21, 0));
            this.N0.setOnClickListener(new ni0(this, 11));
            W1();
        } else {
            if (i14 == 0) {
                if (this.E != null) {
                    for (int i17 = 0; i17 < this.E.users.size(); i17++) {
                        TLRPC.User user2 = this.E.users.get(i17);
                        if (user2.id == this.c) {
                            user = user2;
                            break;
                        }
                    }
                }
                user = null;
                FrameLayout frameLayout4 = (FrameLayout) this.fragmentView;
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131744247, null));
                this.actionBar.q().a(1, R.drawable.msg_info);
                if (user != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context2);
                    this.d0.addView(frameLayout5, b8.mf.o(-1, 100));
                    org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context2);
                    k9Var2.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
                    frameLayout5.addView(k9Var2, b8.mf.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
                    k9Var2.e(user, new org.telegram.ui.Components.u8(0, user));
                    org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context2);
                    this.o0 = y8Var3;
                    org.telegram.ui.ActionBar.r6.a0(y8Var3, context2, R.drawable.greydivider_top, org.telegram.ui.ActionBar.k6.b7);
                    this.o0.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("PassportRequest", null, 2131747486, org.telegram.messenger.l10.j(user, true))));
                    this.o0.getTextView().setGravity(1);
                    ((FrameLayout.LayoutParams) this.o0.getTextView().getLayoutParams()).gravity = 1;
                    this.d0.addView(this.o0, b8.mf.o(-1, -2));
                }
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2);
                this.k0 = n4Var;
                n4Var.setText(org.telegram.messenger.bd.M0(2131747484, null));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.k0, null);
                this.d0.addView(this.k0, b8.mf.o(-1, -2));
                TL_account.authorizationForm authorizationform = this.E;
                if (authorizationform != null) {
                    int size = authorizationform.required_types.size();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int i18 = 0;
                    boolean z12 = false;
                    int i19 = 0;
                    boolean z13 = false;
                    int i20 = 0;
                    while (i18 < size) {
                        TLRPC.SecureRequiredType secureRequiredType = this.E.required_types.get(i18);
                        if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType;
                            if (z1(tL_secureRequiredType3.type)) {
                                arrayList4.add(tL_secureRequiredType3);
                                i19++;
                            } else if (x1(tL_secureRequiredType3.type)) {
                                arrayList5.add(tL_secureRequiredType3);
                                i20++;
                            } else {
                                TLRPC.SecureValueType secureValueType = tL_secureRequiredType3.type;
                                if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                    z12 = z11;
                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                    z13 = z11;
                                }
                            }
                        } else if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                            TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                            if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                                TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(i11);
                                if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                                    if (z1(tL_secureRequiredType4.type)) {
                                        int size2 = tL_secureRequiredTypeOneOf.types.size();
                                        for (int i21 = 0; i21 < size2; i21++) {
                                            TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i21);
                                            if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                                arrayList4.add((TLRPC.TL_secureRequiredType) secureRequiredType3);
                                            }
                                        }
                                        i19++;
                                    } else if (x1(tL_secureRequiredType4.type)) {
                                        int size3 = tL_secureRequiredTypeOneOf.types.size();
                                        for (int i22 = 0; i22 < size3; i22++) {
                                            TLRPC.SecureRequiredType secureRequiredType4 = tL_secureRequiredTypeOneOf.types.get(i22);
                                            if (secureRequiredType4 instanceof TLRPC.TL_secureRequiredType) {
                                                arrayList5.add((TLRPC.TL_secureRequiredType) secureRequiredType4);
                                            }
                                        }
                                        i20++;
                                    }
                                }
                            }
                        }
                        i18++;
                        i11 = 0;
                        z11 = true;
                    }
                    boolean z14 = !z12 || i19 > 1;
                    boolean z15 = !z13 || i20 > 1;
                    int i23 = 0;
                    while (i23 < size) {
                        TLRPC.SecureRequiredType secureRequiredType5 = this.E.required_types.get(i23);
                        if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType5;
                            TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType5.type;
                            if ((secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) {
                                tL_secureRequiredType2 = tL_secureRequiredType5;
                                arrayList = null;
                                z10 = false;
                            } else {
                                if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                    if (!z14) {
                                        arrayList3 = arrayList4;
                                        arrayList = arrayList3;
                                        z10 = false;
                                    }
                                    arrayList3 = null;
                                    arrayList = arrayList3;
                                    z10 = false;
                                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                    if (!z15) {
                                        arrayList3 = arrayList5;
                                        arrayList = arrayList3;
                                        z10 = false;
                                    }
                                    arrayList3 = null;
                                    arrayList = arrayList3;
                                    z10 = false;
                                } else {
                                    if (z14 && z1(secureValueType2)) {
                                        arrayList2 = new ArrayList();
                                        arrayList2.add(tL_secureRequiredType5);
                                        tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                    } else if (z15 && x1(tL_secureRequiredType5.type)) {
                                        arrayList2 = new ArrayList();
                                        arrayList2.add(tL_secureRequiredType5);
                                        tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypeAddress();
                                    }
                                    arrayList = arrayList2;
                                    z10 = true;
                                }
                                tL_secureRequiredType2 = tL_secureRequiredType5;
                            }
                            Y0(context, tL_secureRequiredType2, arrayList, z10, i23 != size + (-1));
                        } else if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                            TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf2 = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType5;
                            if (!tL_secureRequiredTypeOneOf2.types.isEmpty()) {
                                TLRPC.SecureRequiredType secureRequiredType6 = tL_secureRequiredTypeOneOf2.types.get(0);
                                if (secureRequiredType6 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType6 = (TLRPC.TL_secureRequiredType) secureRequiredType6;
                                    if ((z14 && z1(tL_secureRequiredType6.type)) || (z15 && x1(tL_secureRequiredType6.type))) {
                                        arrayList = new ArrayList();
                                        int size4 = tL_secureRequiredTypeOneOf2.types.size();
                                        for (int i24 = 0; i24 < size4; i24++) {
                                            TLRPC.SecureRequiredType secureRequiredType7 = tL_secureRequiredTypeOneOf2.types.get(i24);
                                            if (secureRequiredType7 instanceof TLRPC.TL_secureRequiredType) {
                                                arrayList.add((TLRPC.TL_secureRequiredType) secureRequiredType7);
                                            }
                                        }
                                        if (z1(tL_secureRequiredType6.type)) {
                                            tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                            tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                        } else {
                                            tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                            tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                                        }
                                        tL_secureRequiredType2 = tL_secureRequiredType;
                                        z10 = true;
                                        Y0(context, tL_secureRequiredType2, arrayList, z10, i23 != size + (-1));
                                    }
                                }
                            }
                        }
                        i23++;
                    }
                    context2 = context;
                }
                if (user != null) {
                    org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context2);
                    this.o0 = y8Var4;
                    org.telegram.ui.ActionBar.r6.a0(y8Var4, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    org.telegram.ui.Cells.y8 y8Var5 = this.o0;
                    int i25 = org.telegram.ui.ActionBar.k6.B6;
                    y8Var5.setLinkTextColorKey(i25);
                    if (TextUtils.isEmpty(this.E.privacy_policy_url)) {
                        e6Var = null;
                        this.o0.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("PassportNoPolicy", null, 2131747501, org.telegram.messenger.l10.j(user, true), user.username)));
                    } else {
                        String a02 = org.telegram.messenger.bd.a0("PassportPolicy", null, 2131747489, org.telegram.messenger.l10.j(user, true), user.username);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                        int indexOf = a02.indexOf(42);
                        int lastIndexOf = a02.lastIndexOf(42);
                        if (indexOf != -1 && lastIndexOf != -1) {
                            this.o0.getTextView().setMovementMethod(new org.telegram.messenger.c0(false));
                            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                            spannableStringBuilder.setSpan(new oj0(this), indexOf, lastIndexOf - 1, 33);
                        }
                        this.o0.setText(spannableStringBuilder);
                        e6Var = null;
                    }
                    org.telegram.ui.ActionBar.r6.D(this.o0.getTextView(), i25, e6Var);
                    this.o0.getTextView().setGravity(1);
                    this.d0.addView(this.o0, b8.mf.o(-1, -2));
                }
                FrameLayout frameLayout6 = new FrameLayout(context2);
                this.R = frameLayout6;
                int i26 = org.telegram.ui.ActionBar.k6.fi;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i26, false);
                int i27 = org.telegram.ui.ActionBar.k6.gi;
                org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(x02, org.telegram.ui.ActionBar.k6.x0(null, i27, false));
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i26);
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i27);
                frameLayout6.setBackground(i02);
                org.telegram.ui.ActionBar.r6.k(frameLayout6, i02, N, N2, null);
                frameLayout4.addView(this.R, b8.mf.e(-1, 48, 80));
                this.R.setOnClickListener(new ni0(this, 15));
                TextView textView4 = new TextView(context2);
                this.P = textView4;
                textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
                this.P.setCompoundDrawablesWithIntrinsicBounds(R.drawable.authorize, 0, 0, 0);
                org.telegram.ui.ActionBar.r6.V(this.P, org.telegram.ui.ActionBar.k6.hi, null);
                this.P.setText(org.telegram.messenger.bd.M0(2131747606, null));
                this.P.setTextSize(1, 14.0f);
                this.P.setGravity(17);
                this.P.setTypeface(org.telegram.messenger.g0.o());
                this.R.addView(this.P, b8.mf.e(-2, -1, 17));
                org.telegram.ui.Components.aq aqVar2 = new org.telegram.ui.Components.aq(context2, 0);
                this.Q = aqVar2;
                aqVar2.setVisibility(4);
                this.R.addView(this.Q, b8.mf.c(-1.0f, -1));
                View view = new View(context2);
                view.setBackgroundResource(R.drawable.header_shadow_reverse);
                frameLayout4.addView(view, b8.mf.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            } else if (i14 == 1) {
                i1(context);
                if (this.a == null) {
                    this.a = q1();
                }
            } else if (i14 == 2) {
                f1(context);
                if (this.a == null) {
                    this.a = q1();
                }
            } else if (i14 == 3) {
                k1(context);
            } else {
                int i28 = 6;
                if (i14 == 4) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747583, null));
                    if (TextUtils.isEmpty(this.e1)) {
                        i3 = -1;
                    } else {
                        org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context2);
                        org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.q6, null);
                        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
                        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
                        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
                        v9Var.setBackground(N0);
                        org.telegram.ui.ActionBar.r6.k(v9Var, N0, N3, N4, null);
                        v9Var.b(org.telegram.messenger.bd.a0("PassportPhoneUseSame", null, 2131747492, this.e1), false);
                        this.d0.addView(v9Var, b8.mf.o(-1, -2));
                        v9Var.setOnClickListener(new ni0(this, i28));
                        org.telegram.ui.Cells.y8 y8Var6 = new org.telegram.ui.Cells.y8(context2);
                        this.o0 = y8Var6;
                        org.telegram.ui.ActionBar.r6.a0(y8Var6, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                        this.o0.setText(org.telegram.messenger.bd.M0(2131747491, null));
                        i3 = -1;
                        this.d0.addView(this.o0, b8.mf.o(-1, -2));
                    }
                    this.Z = new EditTextBoldCursor[1];
                    FrameLayout frameLayout7 = new FrameLayout(context2);
                    this.d0.addView(frameLayout7, b8.mf.o(i3, 50));
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout7, null);
                    this.Z[0] = new EditTextBoldCursor(context2);
                    this.Z[0].setTag(0);
                    this.Z[0].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.E(this.Z[0], org.telegram.ui.ActionBar.k6.H6, null);
                    EditTextBoldCursor editTextBoldCursor2 = this.Z[0];
                    int i29 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i29, null);
                    this.Z[0].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.r6.w(this.Z[0], i29, null);
                    this.Z[0].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.Z[0].setCursorWidth(1.5f);
                    this.Z[0].setInputType(33);
                    this.Z[0].setImeOptions(268435462);
                    this.Z[0].setHint(org.telegram.messenger.bd.M0(2131747384, null));
                    TLRPC.TL_secureValue tL_secureValue = this.I;
                    if (tL_secureValue != null) {
                        TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
                        if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                            TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                            if (!TextUtils.isEmpty(tL_securePlainEmail.email)) {
                                i10 = 0;
                                this.Z[0].setText(tL_securePlainEmail.email);
                                EditTextBoldCursor editTextBoldCursor3 = this.Z[i10];
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                this.Z[i10].setPadding(i10, i10, i10, org.telegram.messenger.g0.L(6.0f));
                                this.Z[i10].setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                                frameLayout7.addView(this.Z[i10], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                                this.Z[i10].setOnEditorActionListener(new li0(this, 3));
                                org.telegram.ui.Cells.y8 y8Var7 = new org.telegram.ui.Cells.y8(context2);
                                this.o0 = y8Var7;
                                org.telegram.ui.ActionBar.r6.a0(y8Var7, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                                this.o0.setText(org.telegram.messenger.bd.M0(2131747580, null));
                                this.d0.addView(this.o0, b8.mf.o(-1, -2));
                            }
                        }
                    }
                    i10 = 0;
                    EditTextBoldCursor editTextBoldCursor32 = this.Z[i10];
                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                    this.Z[i10].setPadding(i10, i10, i10, org.telegram.messenger.g0.L(6.0f));
                    if (org.telegram.messenger.bd.a0) {
                    }
                    this.Z[i10].setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                    frameLayout7.addView(this.Z[i10], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    this.Z[i10].setOnEditorActionListener(new li0(this, 3));
                    org.telegram.ui.Cells.y8 y8Var72 = new org.telegram.ui.Cells.y8(context2);
                    this.o0 = y8Var72;
                    org.telegram.ui.ActionBar.r6.a0(y8Var72, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    this.o0.setText(org.telegram.messenger.bd.M0(2131747580, null));
                    this.d0.addView(this.o0, b8.mf.o(-1, -2));
                } else {
                    HashMap hashMap = this.t1;
                    if (i14 == 6) {
                        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747583, null));
                        this.Z = new EditTextBoldCursor[1];
                        FrameLayout frameLayout8 = new FrameLayout(context2);
                        this.d0.addView(frameLayout8, b8.mf.o(-1, 50));
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout8, null);
                        int i30 = 0;
                        this.Z[0] = new EditTextBoldCursor(context2);
                        this.Z[0].setTag(0);
                        this.Z[0].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.E(this.Z[0], org.telegram.ui.ActionBar.k6.H6, null);
                        EditTextBoldCursor editTextBoldCursor4 = this.Z[0];
                        int i31 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor4, i31, null);
                        this.Z[0].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.w(this.Z[0], i31, null);
                        this.Z[0].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.Z[0].setCursorWidth(1.5f);
                        this.Z[0].setInputType(3);
                        this.Z[0].setImeOptions(268435462);
                        this.Z[0].setHint(org.telegram.messenger.bd.M0(2131747582, null));
                        EditTextBoldCursor editTextBoldCursor5 = this.Z[0];
                        editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                        this.Z[0].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                        this.Z[0].setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                        frameLayout8.addView(this.Z[0], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        this.Z[0].setOnEditorActionListener(new li0(this, i28));
                        this.Z[0].addTextChangedListener(new ij0(this, i30));
                        org.telegram.ui.Cells.y8 y8Var8 = new org.telegram.ui.Cells.y8(context2);
                        this.o0 = y8Var8;
                        org.telegram.ui.ActionBar.r6.a0(y8Var8, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                        this.o0.setText(org.telegram.messenger.bd.a0("PassportEmailVerifyInfo", null, 2131747579, hashMap.get("email")));
                        this.d0.addView(this.o0, b8.mf.o(-1, -2));
                    } else if (i14 == 7) {
                        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747496, null));
                        FrameLayout frameLayout9 = new FrameLayout(context2);
                        this.c0.addView(frameLayout9, b8.mf.x(-1, -2, 51));
                        for (int i32 = 0; i32 < 3; i32++) {
                            uj0 uj0Var = new uj0(this, context2, i32 + 2);
                            org.telegram.ui.Components.vt0[] vt0VarArr = this.K1;
                            vt0VarArr[i32] = uj0Var;
                            uj0Var.setVisibility(8);
                            frameLayout9.addView(vt0VarArr[i32], b8.mf.d(-1, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f, 30.0f, org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f, 0.0f));
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("phone", (String) hashMap.get("phone"));
                        p1(bundle, this.L, false);
                    } else if (i14 == 8) {
                        j1(context);
                    }
                }
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        wj0 wj0Var;
        org.telegram.ui.ActionBar.q0 q0Var;
        if (i3 != org.telegram.messenger.hs.U1) {
            if (i3 != org.telegram.messenger.hs.V1 && i3 == org.telegram.messenger.hs.p0) {
                if (objArr.length > 0) {
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
                            this.O0 = 2;
                        }
                    }
                } else {
                    this.K = null;
                    A1();
                }
                W1();
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        HashMap hashMap = this.p1;
        org.telegram.messenger.wv wvVar = (org.telegram.messenger.wv) hashMap.get(str);
        if (wvVar != null) {
            wvVar.d = (TLRPC.TL_inputFile) objArr[1];
            hashMap.remove(str);
            if (hashMap.isEmpty() && (q0Var = this.M) != null) {
                q0Var.setEnabled(true);
                this.M.setAlpha(1.0f);
            }
            HashMap hashMap2 = this.o1;
            if (hashMap2 != null && (wj0Var = (wj0) hashMap2.get(wvVar)) != null) {
                wj0Var.a(true);
            }
            HashMap hashMap3 = this.z1;
            if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                hashMap3.remove("error_document_all");
                e1(false);
            }
            int i11 = wvVar.i;
            if (i11 == 0) {
                if (this.o0 != null && !TextUtils.isEmpty(this.A1)) {
                    this.o0.setText(this.A1);
                }
                hashMap3.remove("files_all");
                return;
            }
            if (i11 == 4) {
                if (this.p0 != null && !TextUtils.isEmpty(this.B1)) {
                    this.p0.setText(this.B1);
                }
                hashMap3.remove("translation_all");
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.bi biVar = this.S0;
        if (biVar == null || this.visibleDialog != biVar) {
            super.dismissCurrentDialog();
            return;
        }
        biVar.b2.d0(false);
        this.S0.K();
        this.S0.b2.g0(true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.S0 && super.dismissDialogOnPause(dialog);
    }

    public final void e1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.q0 == null) {
            return;
        }
        HashMap hashMap = this.x1;
        HashMap hashMap2 = this.z1;
        if (hashMap == null || (!(z10 || hashMap2.containsKey("error_all")) || (str2 = (String) this.x1.get("error_all")) == null)) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str2);
            if (z10) {
                hashMap2.put("error_all", "");
            }
        }
        if (this.y1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.y1.get("error_all")) != null)) {
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
            }
            if (z10) {
                hashMap2.put("error_document_all", "");
            }
        }
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.p7, null), 0, spannableStringBuilder.length(), 33);
            this.q0.setText(spannableStringBuilder);
            this.q0.setVisibility(0);
        } else if (this.q0.getVisibility() != 8) {
            this.q0.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f1(Context context) {
        long j10;
        String str;
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.q0 = y8Var;
        int i3 = org.telegram.ui.ActionBar.k6.b7;
        org.telegram.ui.ActionBar.r6.a0(y8Var, context, R.drawable.greydivider_top, i3);
        int i10 = 0;
        this.q0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.d0.addView(this.q0, b8.mf.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754673, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754682, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754671, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754675, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754672, null));
            }
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            this.k0 = n4Var;
            n4Var.setText(org.telegram.messenger.bd.M0(2131747584, null));
            org.telegram.ui.Cells.n4 n4Var2 = this.k0;
            int i11 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i11, n4Var2, null);
            j10 = 0;
            this.d0.addView(this.k0, b8.mf.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.d0.addView(this.e0, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
            this.S = v9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            int i12 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
            v9Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(v9Var, N0, N, N2, null);
            this.d0.addView(this.S, b8.mf.o(-1, -2));
            this.S.setOnClickListener(new ni0(this, 7));
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.o0 = y8Var2;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, context, R.drawable.greydivider, i3);
            if (this.c != 0) {
                this.A1 = org.telegram.messenger.bd.M0(2131747635, null);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.G.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747633, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747629, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747619, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747617, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747631, null);
                } else {
                    this.A1 = "";
                }
            }
            String str2 = this.A1;
            HashMap hashMap = this.y1;
            HashMap hashMap2 = this.z1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.A1);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.p7, null), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.o0.setText(str3);
            this.d0.addView(this.o0, b8.mf.o(-1, -2));
            if (this.G.translation_required) {
                org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
                this.k0 = n4Var3;
                n4Var3.setText(org.telegram.messenger.bd.M0(2131747463, null));
                org.telegram.ui.ActionBar.r6.i(i11, this.k0, null);
                this.d0.addView(this.k0, b8.mf.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.i0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.d0.addView(this.i0, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
                this.Y = v9Var2;
                org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i11);
                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i12);
                v9Var2.setBackground(N02);
                org.telegram.ui.ActionBar.r6.k(v9Var2, N02, N3, N4, null);
                this.d0.addView(this.Y, b8.mf.o(-1, -2));
                this.Y.setOnClickListener(new ni0(this, 8));
                org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                this.p0 = y8Var3;
                org.telegram.ui.ActionBar.r6.a0(y8Var3, context, R.drawable.greydivider, i3);
                if (this.c != 0) {
                    this.B1 = org.telegram.messenger.bd.M0(2131747611, null);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.G.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747616, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747614, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747613, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747612, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747615, null);
                    } else {
                        this.B1 = "";
                    }
                }
                String str5 = this.B1;
                HashMap hashMap3 = this.y1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.B1);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.p7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.p0.setText(str6);
                this.d0.addView(this.p0, b8.mf.o(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747610, null));
        }
        org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
        this.k0 = n4Var4;
        n4Var4.setText(org.telegram.messenger.bd.M0(2131747609, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.k0, null);
        this.d0.addView(this.k0, b8.mf.o(-1, -2));
        this.Z = new EditTextBoldCursor[6];
        int i13 = 0;
        while (true) {
            int i14 = 4;
            if (i13 >= 6) {
                break;
            }
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Z[i13] = editTextBoldCursor;
            vi0 vi0Var = new vi0(context, editTextBoldCursor, i10);
            vi0Var.setWillNotDraw(false);
            this.d0.addView(vi0Var, b8.mf.o(-1, -2));
            int i15 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i15, vi0Var, null);
            if (i13 == 5) {
                View view = new View(context);
                this.T = view;
                org.telegram.ui.ActionBar.r6.i(i15, view, null);
                this.d0.addView(this.T, b8.mf.o(-1, 6));
            }
            if (this.w0 && this.G != null) {
                vi0Var.setVisibility(8);
                View view2 = this.T;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Z[i13].setTag(Integer.valueOf(i13));
            this.Z[i13].setSupportRtlHint(true);
            this.Z[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.Z[i13], org.telegram.ui.ActionBar.k6.H6, null);
            org.telegram.ui.ActionBar.r6.A(this.Z[i13], org.telegram.ui.ActionBar.k6.L6, null);
            this.Z[i13].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i13];
            int i16 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i16, null);
            this.Z[i13].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Z[i13], i16, null);
            this.Z[i13].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Z[i13].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.r6.G(this.Z[i13], org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
            if (i13 == 5) {
                this.Z[i13].setOnTouchListener(new oi0(this, 2));
                this.Z[i13].setInputType(0);
                this.Z[i13].setFocusable(false);
            } else {
                this.Z[i13].setInputType(16385);
                this.Z[i13].setImeOptions(268435461);
            }
            if (i13 == 0) {
                this.Z[i13].setHintText(org.telegram.messenger.bd.M0(2131747468, null));
                str = "street_line1";
            } else if (i13 == 1) {
                this.Z[i13].setHintText(org.telegram.messenger.bd.M0(2131747467, null));
                str = "street_line2";
            } else if (i13 == 2) {
                this.Z[i13].setHintText(org.telegram.messenger.bd.M0(2131747488, null));
                str = "post_code";
            } else if (i13 == 3) {
                this.Z[i13].setHintText(org.telegram.messenger.bd.M0(2131747603, null));
                str = "city";
            } else if (i13 == 4) {
                this.Z[i13].setHintText(org.telegram.messenger.bd.M0(2131747469, null));
                str = "state";
            } else if (i13 != 5) {
                i13++;
            } else {
                this.Z[i13].setHintText(org.telegram.messenger.bd.M0(2131747602, null));
                str = "country_code";
            }
            N1(this.t1, this.Z[i13], str);
            if (i13 == 2) {
                this.Z[i13].addTextChangedListener(new wi0(this, editTextBoldCursor, str));
                this.Z[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Z[i13].addTextChangedListener(new xi0(this, editTextBoldCursor, str, i10));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Z[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Z[i13].setPadding(0, 0, 0, 0);
            this.Z[i13].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            vi0Var.addView(this.Z[i13], b8.mf.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Z[i13].setOnEditorActionListener(new li0(this, i14));
            i13++;
        }
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        this.m0 = x6Var;
        this.d0.addView(x6Var, b8.mf.o(-1, -2));
        if (this.w0 && this.G != null) {
            this.k0.setVisibility(8);
            this.m0.setVisibility(8);
        }
        long j11 = this.c;
        TLRPC.TL_secureValue tL_secureValue = this.J;
        if (((j11 == j10 && this.G != null) || this.I == null || this.w0) && tL_secureValue == null) {
            org.telegram.ui.Cells.x6 x6Var2 = this.m0;
            int i17 = org.telegram.ui.ActionBar.k6.b7;
            org.telegram.ui.ActionBar.r6.a0(x6Var2, context, R.drawable.greydivider_bottom, i17);
            if (this.w0 && this.G != null) {
                org.telegram.ui.ActionBar.r6.a0(this.o0, context, R.drawable.greydivider_bottom, i17);
            }
        } else {
            if (tL_secureValue != null) {
                X0(tL_secureValue.files);
                Z0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.x6 x6Var3 = this.m0;
            int i18 = org.telegram.ui.ActionBar.k6.b7;
            org.telegram.ui.ActionBar.r6.a0(x6Var3, context, R.drawable.greydivider, i18);
            org.telegram.ui.Cells.v9 v9Var3 = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.r6.V(v9Var3.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
            org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
            v9Var3.setBackground(N03);
            org.telegram.ui.ActionBar.r6.k(v9Var3, N03, N5, N6, null);
            if (this.G == null) {
                v9Var3.b(org.telegram.messenger.bd.M0(2131747595, null), false);
            } else {
                v9Var3.b(org.telegram.messenger.bd.M0(2131747600, null), false);
            }
            this.d0.addView(v9Var3, b8.mf.o(-1, -2));
            v9Var3.setOnClickListener(new ni0(this, 9));
            org.telegram.ui.Cells.x6 x6Var4 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
            this.m0 = x6Var4;
            org.telegram.ui.ActionBar.r6.a0(x6Var4, context, R.drawable.greydivider_bottom, i18);
            this.d0.addView(this.m0, b8.mf.o(-1, -2));
        }
        X1(0);
        X1(4);
    }

    public final void g1() {
        if (getParentActivity() != null && this.S0 == null) {
            org.telegram.ui.Components.bi biVar = new org.telegram.ui.Components.bi(getParentActivity(), this, false, false);
            this.S0 = biVar;
            biVar.U3 = new yi0(this);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.l0;
            if (i10 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i10), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d7));
            i10++;
        }
        Iterator it = this.o1.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new org.telegram.ui.ActionBar.t6((wj0) ((Map.Entry) it.next()).getValue(), TLObject.FLAG_28, new Class[]{wj0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        }
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d0, TLObject.FLAG_28, new Class[]{org.telegram.ui.Cells.x8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d0, TLObject.FLAG_28, new Class[]{org.telegram.ui.Cells.v9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d0, TLObject.FLAG_28, new Class[]{xj0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        if (this.Z != null) {
            int i12 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i12].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z[i12], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z[i12], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z[i12], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z[i12], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
                i12++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        }
        if (this.b0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.b0;
                if (i3 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr2[i3].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.b0[i3], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.b0[i3], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.b0[i3], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.b0[i3], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
                i3++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.fi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gi));
        return arrayList;
    }

    public final void h1() {
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i3 = 4;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new rb0(i3, this, zArr));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        boolean z10 = this.w0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (z10 && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            s1Var.U = org.telegram.messenger.bd.M0(2131747601, null);
        } else if (z10 && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            s1Var.U = org.telegram.messenger.bd.M0(2131747594, null);
        } else {
            s1Var.U = org.telegram.messenger.bd.M0(2131747598, null);
        }
        if (!this.w0 && this.G != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(getParentActivity(), 1);
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(false);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
            c2Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(c2Var, N0, null, N, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                c2Var.e(org.telegram.messenger.bd.M0(2131747599, null), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                c2Var.e(org.telegram.messenger.bd.M0(2131747597, null), "", true, false, false);
            }
            c2Var.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
            frameLayout.addView(c2Var, b8.mf.e(-1, 48, 51));
            c2Var.setOnClickListener(new k8(i3, zArr));
            alertDialog$Builder.o(frameLayout);
        }
        showDialog(s1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i1(Context context) {
        String str;
        int i3;
        String str2;
        String str3;
        this.Z0 = new HashMap();
        int i10 = 2;
        int i11 = 1;
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.q0 = y8Var;
        int i12 = org.telegram.ui.ActionBar.k6.b7;
        org.telegram.ui.ActionBar.r6.a0(y8Var, context, R.drawable.greydivider_top, i12);
        int i13 = 0;
        this.q0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        int i14 = -1;
        this.d0.addView(this.q0, b8.mf.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.F;
        int i15 = 3;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            this.k0 = n4Var;
            if (this.w0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131747584, null));
            } else {
                n4Var.setText(org.telegram.messenger.bd.M0(2131747483, null));
            }
            org.telegram.ui.Cells.n4 n4Var2 = this.k0;
            int i16 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i16, n4Var2, null);
            this.d0.addView(this.k0, b8.mf.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f0 = linearLayout;
            linearLayout.setOrientation(1);
            this.d0.addView(this.f0, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            this.V = x8Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
            int i17 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i17);
            x8Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(x8Var, N0, N, N2, null);
            this.d0.addView(this.V, b8.mf.o(-1, -2));
            this.V.setOnClickListener(new ni0(this, i13));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.g0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.d0.addView(this.g0, b8.mf.o(-1, -2));
            boolean z10 = this.G.selfie_required;
            org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
            this.W = x8Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
            org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i17);
            x8Var2.setBackground(N02);
            org.telegram.ui.ActionBar.r6.k(x8Var2, N02, N3, N4, null);
            this.W.a(org.telegram.messenger.bd.M0(2131747480, null), org.telegram.messenger.bd.M0(2131747479, null), z10);
            this.d0.addView(this.W, b8.mf.o(-1, -2));
            this.W.setOnClickListener(new ni0(this, i10));
            if (this.G.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.h0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.d0.addView(this.h0, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.x8 x8Var3 = new org.telegram.ui.Cells.x8(context);
                this.X = x8Var3;
                org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i16);
                org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i17);
                x8Var3.setBackground(N03);
                org.telegram.ui.ActionBar.r6.k(x8Var3, N03, N5, N6, null);
                this.X.a(org.telegram.messenger.bd.M0(2131747471, null), org.telegram.messenger.bd.M0(2131747470, null), tL_secureRequiredType2.translation_required);
                this.d0.addView(this.X, b8.mf.o(-1, -2));
                this.X.setOnClickListener(new ni0(this, i15));
            }
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.o0 = y8Var2;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, context, R.drawable.greydivider, i12);
            this.o0.setText(org.telegram.messenger.bd.M0(2131747497, null));
            this.d0.addView(this.o0, b8.mf.o(-1, -2));
            if (this.G.translation_required) {
                org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
                this.k0 = n4Var3;
                n4Var3.setText(org.telegram.messenger.bd.M0(2131747463, null));
                org.telegram.ui.ActionBar.r6.i(i16, this.k0, null);
                this.d0.addView(this.k0, b8.mf.o(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.i0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.d0.addView(this.i0, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
                this.Y = v9Var;
                org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N7 = org.telegram.ui.ActionBar.r6.N(i16);
                org.telegram.ui.ActionBar.n6 N8 = org.telegram.ui.ActionBar.r6.N(i17);
                v9Var.setBackground(N04);
                org.telegram.ui.ActionBar.r6.k(v9Var, N04, N7, N8, null);
                this.d0.addView(this.Y, b8.mf.o(-1, -2));
                this.Y.setOnClickListener(new ni0(this, 4));
                org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                this.p0 = y8Var3;
                org.telegram.ui.ActionBar.r6.a0(y8Var3, context, R.drawable.greydivider, i12);
                if (this.c != 0) {
                    this.B1 = org.telegram.messenger.bd.M0(2131747611, null);
                } else {
                    TLRPC.SecureValueType secureValueType = this.G.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747621, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747624, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747626, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747627, null);
                    } else {
                        this.B1 = "";
                    }
                }
                String str4 = this.B1;
                HashMap hashMap = this.y1;
                String str5 = str4;
                if (hashMap != null) {
                    String str6 = (String) hashMap.get("translation_all");
                    str5 = str4;
                    if (str6 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.B1);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.p7, null), 0, str6.length(), 33);
                        this.z1.put("translation_all", "");
                        str5 = spannableStringBuilder;
                    }
                }
                this.p0.setText(str5);
                this.d0.addView(this.p0, b8.mf.o(-1, -2));
            }
        } else {
            org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
            this.s0 = v9Var2;
            org.telegram.ui.Cells.y N05 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N9 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
            org.telegram.ui.ActionBar.n6 N10 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
            v9Var2.setBackground(N05);
            org.telegram.ui.ActionBar.r6.k(v9Var2, N05, N9, N10, null);
            this.s0.b(org.telegram.messenger.bd.M0(2131747478, null), false);
            this.d0.addView(this.s0, b8.mf.o(-1, -2));
            this.s0.setOnClickListener(new ni0(this, 5));
            org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context);
            this.o0 = y8Var4;
            org.telegram.ui.ActionBar.r6.a0(y8Var4, context, R.drawable.greydivider, i12);
            this.o0.setText(org.telegram.messenger.bd.M0(2131747477, null));
            this.d0.addView(this.o0, b8.mf.o(-1, -2));
        }
        org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
        this.k0 = n4Var4;
        if (this.w0) {
            n4Var4.setText(org.telegram.messenger.bd.M0(2131747586, null));
        } else {
            n4Var4.setText(org.telegram.messenger.bd.M0(2131747500, null));
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.k0, null);
        this.d0.addView(this.k0, b8.mf.o(-1, -2));
        int i18 = 7;
        int i19 = this.G != null ? 9 : 7;
        this.Z = new EditTextBoldCursor[i19];
        int i20 = 0;
        while (true) {
            int i21 = 6;
            HashMap hashMap2 = this.t1;
            if (i20 >= i19) {
                org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                this.n0 = x6Var;
                this.d0.addView(x6Var, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.n4 n4Var5 = new org.telegram.ui.Cells.n4(context);
                this.k0 = n4Var5;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var5, null);
                this.d0.addView(this.k0, b8.mf.o(-1, -2));
                int i22 = 3;
                this.b0 = new EditTextBoldCursor[3];
                int i23 = 0;
                while (i23 < i22) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.b0[i23] = editTextBoldCursor;
                    vi0 vi0Var = new vi0(context, editTextBoldCursor, 2);
                    vi0Var.setWillNotDraw(false);
                    this.d0.addView(vi0Var, b8.mf.o(-1, 64));
                    int i24 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.r6.i(i24, vi0Var, null);
                    if (i23 == 2) {
                        View view = new View(context);
                        this.U = view;
                        org.telegram.ui.ActionBar.r6.i(i24, view, null);
                        this.d0.addView(this.U, b8.mf.o(-1, i21));
                    }
                    this.b0[i23].setTag(Integer.valueOf(i23));
                    this.b0[i23].setSupportRtlHint(true);
                    this.b0[i23].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.B(this.b0[i23], org.telegram.ui.ActionBar.k6.H6, null);
                    EditTextBoldCursor editTextBoldCursor2 = this.b0[i23];
                    int i25 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i25, null);
                    org.telegram.ui.ActionBar.r6.A(this.b0[i23], org.telegram.ui.ActionBar.k6.L6, null);
                    this.b0[i23].setTransformHintToHeader(true);
                    this.b0[i23].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.r6.w(this.b0[i23], i25, null);
                    this.b0[i23].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.b0[i23].setCursorWidth(1.5f);
                    org.telegram.ui.ActionBar.r6.G(this.b0[i23], org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
                    this.b0[i23].setInputType(16385);
                    this.b0[i23].setImeOptions(268435461);
                    if (i23 == 0) {
                        str = "first_name_native";
                    } else if (i23 == 1) {
                        str = "middle_name_native";
                    } else if (i23 != 2) {
                        i23++;
                        i22 = 3;
                        i21 = 6;
                    } else {
                        str = "last_name_native";
                    }
                    N1(hashMap2, this.b0[i23], str);
                    EditTextBoldCursor editTextBoldCursor3 = this.b0[i23];
                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                    int i26 = 2;
                    if (i23 == 0 || i23 == 2 || i23 == 1) {
                        this.b0[i23].addTextChangedListener(new xi0(this, editTextBoldCursor, str, i26));
                    }
                    this.b0[i23].setPadding(0, 0, 0, 0);
                    this.b0[i23].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var.addView(this.b0[i23], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.b0[i23].setOnEditorActionListener(new li0(this, 2));
                    i23++;
                    i22 = 3;
                    i21 = 6;
                }
                org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(context);
                this.r0 = y8Var5;
                this.d0.addView(y8Var5, b8.mf.o(-1, -2));
                long j10 = this.c;
                TLRPC.TL_secureValue tL_secureValue = this.J;
                if (((j10 == 0 && this.G != null) || this.I == null || this.w0) && tL_secureValue == null) {
                    org.telegram.ui.ActionBar.r6.a0(this.r0, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                } else {
                    if (tL_secureValue != null) {
                        X0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        Z0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.v9 v9Var3 = new org.telegram.ui.Cells.v9(context);
                    org.telegram.ui.ActionBar.r6.V(v9Var3.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                    org.telegram.ui.Cells.y N06 = org.telegram.ui.ActionBar.k6.N0(true);
                    org.telegram.ui.ActionBar.n6 N11 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
                    org.telegram.ui.ActionBar.n6 N12 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
                    v9Var3.setBackground(N06);
                    org.telegram.ui.ActionBar.r6.k(v9Var3, N06, N11, N12, null);
                    if (this.G == null) {
                        v9Var3.b(org.telegram.messenger.bd.M0(2131747595, null), false);
                    } else {
                        v9Var3.b(org.telegram.messenger.bd.M0(2131747600, null), false);
                    }
                    this.d0.addView(v9Var3, b8.mf.o(-1, -2));
                    v9Var3.setOnClickListener(new ni0(this, i11));
                    org.telegram.ui.Cells.y8 y8Var6 = this.r0;
                    int i27 = org.telegram.ui.ActionBar.k6.b7;
                    org.telegram.ui.ActionBar.r6.a0(y8Var6, context, R.drawable.greydivider, i27);
                    org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                    this.m0 = x6Var2;
                    org.telegram.ui.ActionBar.r6.a0(x6Var2, context, R.drawable.greydivider_bottom, i27);
                    this.d0.addView(this.m0, b8.mf.o(-1, -2));
                }
                U1();
                c1(false);
                return;
            }
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            this.Z[i20] = editTextBoldCursor4;
            vi0 vi0Var2 = new vi0(context, editTextBoldCursor4, i11);
            vi0Var2.setWillNotDraw(false);
            this.d0.addView(vi0Var2, b8.mf.o(i14, 64));
            int i28 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i28, vi0Var2, e6Var);
            if (i20 == i19 - 1) {
                View view2 = new View(context);
                this.T = view2;
                org.telegram.ui.ActionBar.r6.i(i28, view2, e6Var);
                this.d0.addView(this.T, b8.mf.o(i14, 6));
            }
            if (this.w0 && this.G != null && i20 < i18) {
                vi0Var2.setVisibility(8);
                View view3 = this.T;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            this.Z[i20].setTag(Integer.valueOf(i20));
            this.Z[i20].setSupportRtlHint(true);
            this.Z[i20].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.Z[i20], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor5 = this.Z[i20];
            int i29 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor5, i29, null);
            org.telegram.ui.ActionBar.r6.A(this.Z[i20], org.telegram.ui.ActionBar.k6.L6, null);
            this.Z[i20].setTransformHintToHeader(true);
            this.Z[i20].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Z[i20], i29, null);
            this.Z[i20].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Z[i20].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.r6.G(this.Z[i20], org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
            if (i20 == 5 || i20 == 6) {
                i3 = 7;
                this.Z[i20].setOnTouchListener(new oi0(this, 0));
                this.Z[i20].setInputType(0);
            } else if (i20 == 3 || i20 == 8) {
                i3 = 7;
                this.Z[i20].setOnTouchListener(new gi.n1(i3, this, context));
                this.Z[i20].setInputType(0);
                this.Z[i20].setFocusable(false);
            } else {
                if (i20 == 4) {
                    this.Z[i20].setOnTouchListener(new oi0(this, i11));
                    this.Z[i20].setInputType(0);
                    this.Z[i20].setFocusable(false);
                } else {
                    this.Z[i20].setInputType(16385);
                    this.Z[i20].setImeOptions(268435461);
                }
                i3 = 7;
            }
            HashMap hashMap3 = this.u1;
            switch (i20) {
                case 0:
                    if (tL_secureRequiredType2.native_names) {
                        this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747509, null));
                    } else {
                        this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747512, null));
                    }
                    str2 = "first_name";
                    N1(hashMap2, this.Z[i20], str2);
                    EditTextBoldCursor editTextBoldCursor6 = this.Z[i20];
                    editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                    if (i20 != 0 || i20 == 2 || i20 == 1) {
                        this.Z[i20].addTextChangedListener(new xi0(this, editTextBoldCursor4, str2, i11));
                    } else {
                        this.Z[i20].addTextChangedListener(new org.telegram.ui.Components.kv0(this, editTextBoldCursor4, str2, hashMap2));
                    }
                    this.Z[i20].setPadding(0, 0, 0, 0);
                    this.Z[i20].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var2.addView(this.Z[i20], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i20].setOnEditorActionListener(new li0(this, i11));
                    break;
                case 1:
                    if (tL_secureRequiredType2.native_names) {
                        this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747513, null));
                    } else {
                        this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747515, null));
                    }
                    str2 = "middle_name";
                    N1(hashMap2, this.Z[i20], str2);
                    EditTextBoldCursor editTextBoldCursor62 = this.Z[i20];
                    editTextBoldCursor62.setSelection(editTextBoldCursor62.length());
                    if (i20 != 0) {
                        break;
                    }
                    this.Z[i20].addTextChangedListener(new xi0(this, editTextBoldCursor4, str2, i11));
                    this.Z[i20].setPadding(0, 0, 0, 0);
                    this.Z[i20].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var2.addView(this.Z[i20], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i20].setOnEditorActionListener(new li0(this, i11));
                    break;
                case 2:
                    if (tL_secureRequiredType2.native_names) {
                        this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747464, null));
                    } else {
                        this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747466, null));
                    }
                    str2 = "last_name";
                    N1(hashMap2, this.Z[i20], str2);
                    EditTextBoldCursor editTextBoldCursor622 = this.Z[i20];
                    editTextBoldCursor622.setSelection(editTextBoldCursor622.length());
                    if (i20 != 0) {
                    }
                    this.Z[i20].addTextChangedListener(new xi0(this, editTextBoldCursor4, str2, i11));
                    this.Z[i20].setPadding(0, 0, 0, 0);
                    this.Z[i20].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var2.addView(this.Z[i20], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i20].setOnEditorActionListener(new li0(this, i11));
                    break;
                case 3:
                    this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747605, null));
                    str2 = "birth_date";
                    N1(hashMap2, this.Z[i20], str2);
                    EditTextBoldCursor editTextBoldCursor6222 = this.Z[i20];
                    editTextBoldCursor6222.setSelection(editTextBoldCursor6222.length());
                    if (i20 != 0) {
                    }
                    this.Z[i20].addTextChangedListener(new xi0(this, editTextBoldCursor4, str2, i11));
                    this.Z[i20].setPadding(0, 0, 0, 0);
                    this.Z[i20].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var2.addView(this.Z[i20], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i20].setOnEditorActionListener(new li0(this, i11));
                    break;
                case 4:
                    this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747574, null));
                    str2 = "gender";
                    N1(hashMap2, this.Z[i20], str2);
                    EditTextBoldCursor editTextBoldCursor62222 = this.Z[i20];
                    editTextBoldCursor62222.setSelection(editTextBoldCursor62222.length());
                    if (i20 != 0) {
                    }
                    this.Z[i20].addTextChangedListener(new xi0(this, editTextBoldCursor4, str2, i11));
                    this.Z[i20].setPadding(0, 0, 0, 0);
                    this.Z[i20].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var2.addView(this.Z[i20], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i20].setOnEditorActionListener(new li0(this, i11));
                    break;
                case 5:
                    this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747604, null));
                    str2 = "country_code";
                    N1(hashMap2, this.Z[i20], str2);
                    EditTextBoldCursor editTextBoldCursor622222 = this.Z[i20];
                    editTextBoldCursor622222.setSelection(editTextBoldCursor622222.length());
                    if (i20 != 0) {
                    }
                    this.Z[i20].addTextChangedListener(new xi0(this, editTextBoldCursor4, str2, i11));
                    this.Z[i20].setPadding(0, 0, 0, 0);
                    this.Z[i20].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var2.addView(this.Z[i20], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i20].setOnEditorActionListener(new li0(this, i11));
                    break;
                case 6:
                    this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747482, null));
                    str2 = "residence_country_code";
                    N1(hashMap2, this.Z[i20], str2);
                    EditTextBoldCursor editTextBoldCursor6222222 = this.Z[i20];
                    editTextBoldCursor6222222.setSelection(editTextBoldCursor6222222.length());
                    if (i20 != 0) {
                    }
                    this.Z[i20].addTextChangedListener(new xi0(this, editTextBoldCursor4, str2, i11));
                    this.Z[i20].setPadding(0, 0, 0, 0);
                    this.Z[i20].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var2.addView(this.Z[i20], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i20].setOnEditorActionListener(new li0(this, i11));
                    break;
                case 7:
                    this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747585, null));
                    str3 = "document_no";
                    String str7 = str3;
                    hashMap2 = hashMap3;
                    str2 = str7;
                    N1(hashMap2, this.Z[i20], str2);
                    EditTextBoldCursor editTextBoldCursor62222222 = this.Z[i20];
                    editTextBoldCursor62222222.setSelection(editTextBoldCursor62222222.length());
                    if (i20 != 0) {
                    }
                    this.Z[i20].addTextChangedListener(new xi0(this, editTextBoldCursor4, str2, i11));
                    this.Z[i20].setPadding(0, 0, 0, 0);
                    this.Z[i20].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var2.addView(this.Z[i20], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i20].setOnEditorActionListener(new li0(this, i11));
                    break;
                case 8:
                    this.Z[i20].setHintText(org.telegram.messenger.bd.M0(2131747578, null));
                    str3 = "expiry_date";
                    String str72 = str3;
                    hashMap2 = hashMap3;
                    str2 = str72;
                    N1(hashMap2, this.Z[i20], str2);
                    EditTextBoldCursor editTextBoldCursor622222222 = this.Z[i20];
                    editTextBoldCursor622222222.setSelection(editTextBoldCursor622222222.length());
                    if (i20 != 0) {
                    }
                    this.Z[i20].addTextChangedListener(new xi0(this, editTextBoldCursor4, str2, i11));
                    this.Z[i20].setPadding(0, 0, 0, 0);
                    this.Z[i20].setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    vi0Var2.addView(this.Z[i20], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Z[i20].setOnEditorActionListener(new li0(this, i11));
                    break;
            }
            i20++;
            i18 = i3;
            i14 = -1;
            e6Var = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(Context context) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ArrayList arrayList;
        boolean z10;
        yj0 yj0Var = this;
        Context context2 = context;
        yj0Var.actionBar.setTitle(org.telegram.messenger.bd.M0(2131744247, null));
        yj0Var.actionBar.q().a(1, R.drawable.msg_info);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2);
        yj0Var.k0 = n4Var;
        n4Var.setText(org.telegram.messenger.bd.M0(2131747487, null));
        org.telegram.ui.Cells.n4 n4Var2 = yj0Var.k0;
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i3, n4Var2, null);
        yj0Var.d0.addView(yj0Var.k0, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.f1) null);
        yj0Var.m0 = x6Var;
        int i10 = org.telegram.ui.ActionBar.k6.b7;
        org.telegram.ui.ActionBar.r6.a0(x6Var, context2, R.drawable.greydivider, i10);
        yj0Var.d0.addView(yj0Var.m0, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context2);
        yj0Var.y0 = v9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        v9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(v9Var, N0, N, N2, null);
        yj0Var.y0.b(org.telegram.messenger.bd.M0(2131747504, null), true);
        yj0Var.d0.addView(yj0Var.y0, b8.mf.o(-1, -2));
        yj0Var.y0.setOnClickListener(new ni0(yj0Var, 12));
        org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context2);
        yj0Var.z0 = v9Var2;
        org.telegram.ui.ActionBar.r6.V(v9Var2.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
        org.telegram.ui.ActionBar.r6.R(yj0Var.z0, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i3), org.telegram.ui.ActionBar.r6.N(i11), null);
        yj0Var.z0.b(org.telegram.messenger.bd.M0(2131744244, null), false);
        yj0Var.d0.addView(yj0Var.z0, b8.mf.o(-1, -2));
        yj0Var.z0.setOnClickListener(new ni0(yj0Var, 13));
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.f1) null);
        yj0Var.A0 = x6Var2;
        org.telegram.ui.ActionBar.r6.a0(x6Var2, context2, R.drawable.greydivider_bottom, i10);
        yj0Var.d0.addView(yj0Var.A0, b8.mf.o(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context2);
        yj0Var.B0 = linearLayout;
        linearLayout.setOrientation(1);
        yj0Var.B0.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(yj0Var.B0, context2, R.drawable.greydivider_bottom, i10);
        if (org.telegram.messenger.g0.Q1()) {
            yj0Var.d0.addView(yj0Var.B0, new LinearLayout.LayoutParams(-1, org.telegram.messenger.g0.L(528.0f) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            yj0Var.d0.addView(yj0Var.B0, new LinearLayout.LayoutParams(-1, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        ImageView imageView = new ImageView(context2);
        yj0Var.C0 = imageView;
        imageView.setImageResource(R.drawable.no_passport);
        org.telegram.ui.ActionBar.r6.t(yj0Var.C0, org.telegram.ui.ActionBar.k6.qj, null, PorterDuff.Mode.MULTIPLY);
        yj0Var.B0.addView(yj0Var.C0, b8.mf.o(-2, -2));
        TextView textView = new TextView(context2);
        yj0Var.D0 = textView;
        int i12 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(textView, i12, null);
        yj0Var.D0.setGravity(17);
        yj0Var.D0.setTextSize(1, 15.0f);
        yj0Var.D0.setTypeface(org.telegram.messenger.g0.o());
        yj0Var.D0.setText(org.telegram.messenger.bd.M0(2131747505, null));
        TextView f10 = org.telegram.messenger.camera.q.f(yj0Var.B0, yj0Var.D0, b8.mf.t(-2, -2, 17, 0, 16, 0, 0), context2);
        yj0Var.E0 = f10;
        org.telegram.ui.ActionBar.r6.V(f10, i12, null);
        yj0Var.E0.setGravity(17);
        yj0Var.E0.setTextSize(1, 14.0f);
        yj0Var.E0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        yj0Var.E0.setText(org.telegram.messenger.bd.M0(2131747503, null));
        TextView f11 = org.telegram.messenger.camera.q.f(yj0Var.B0, yj0Var.E0, b8.mf.t(-2, -2, 17, 0, 14, 0, 0), context2);
        yj0Var.F0 = f11;
        int i13 = org.telegram.ui.ActionBar.k6.q6;
        org.telegram.ui.ActionBar.r6.V(f11, i13, null);
        yj0Var.F0.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.r6.R(yj0Var.F0, org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 32), 7, -1), null, org.telegram.ui.ActionBar.r6.h(i13, 32), null);
        yj0Var.F0.setGravity(17);
        yj0Var.F0.setTextSize(1, 15.0f);
        yj0Var.F0.setTypeface(org.telegram.messenger.g0.o());
        yj0Var.F0.setGravity(17);
        yj0Var.F0.setText(org.telegram.messenger.bd.M0(2131747504, null).toUpperCase());
        yj0Var.B0.addView(yj0Var.F0, b8.mf.t(-2, 30, 17, 0, 12, 0, 0));
        yj0Var.F0.setOnClickListener(new ni0(yj0Var, 14));
        int size = yj0Var.E.values.size();
        int i14 = 0;
        while (i14 < size) {
            TLRPC.TL_secureValue tL_secureValue = yj0Var.E.values.get(i14);
            if (z1(tL_secureValue.type)) {
                arrayList = new ArrayList();
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = tL_secureValue.type;
                tL_secureRequiredType2.selfie_required = true;
                tL_secureRequiredType2.translation_required = true;
                arrayList.add(tL_secureRequiredType2);
                tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
            } else if (x1(tL_secureValue.type)) {
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
                z10 = false;
                yj0Var.Y0(context2, tL_secureRequiredType, arrayList, z10, i14 != size + (-1));
                i14++;
                yj0Var = this;
                context2 = context;
            }
            z10 = true;
            yj0Var.Y0(context2, tL_secureRequiredType, arrayList, z10, i14 != size + (-1));
            i14++;
            yj0Var = this;
            context2 = context;
        }
        V1();
    }

    public final void k1(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747496, null));
        this.Z0 = new HashMap();
        int i3 = 3;
        int i10 = 1;
        int i11 = 0;
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.V0, new vg.i1(i10));
        String str3 = org.telegram.messenger.h10.i(this.currentAccount).f().phone;
        org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
        org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.q6, null);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
        v9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(v9Var, N0, N, N2, null);
        v9Var.b(org.telegram.messenger.bd.a0("PassportPhoneUseSame", null, 2131747492, mf.b.c().b("+" + str3)), false);
        this.d0.addView(v9Var, b8.mf.o(-1, -2));
        v9Var.setOnClickListener(new ni0(this, 16));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.o0 = y8Var;
        org.telegram.ui.ActionBar.r6.a0(y8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
        this.o0.setText(org.telegram.messenger.bd.M0(2131747490, null));
        this.d0.addView(this.o0, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.k0 = n4Var;
        n4Var.setText(org.telegram.messenger.bd.M0(2131747493, null));
        org.telegram.ui.ActionBar.r6.i(i12, this.k0, null);
        this.d0.addView(this.k0, b8.mf.o(-1, -2));
        this.Z = new EditTextBoldCursor[3];
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 2) {
                this.Z[i13] = new org.telegram.ui.Components.r20(context);
            } else {
                this.Z[i13] = new EditTextBoldCursor(context);
            }
            if (i13 == 1) {
                frameLayout = org.telegram.messenger.k5.f(context, 0);
                this.d0.addView(frameLayout, b8.mf.o(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, null);
            } else if (i13 == 2) {
                frameLayout = (ViewGroup) this.Z[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.d0.addView(frameLayout, b8.mf.o(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, null);
            }
            this.Z[i13].setTag(Integer.valueOf(i13));
            this.Z[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.E(this.Z[i13], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Z[i13];
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i14, null);
            this.Z[i13].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Z[i13], i14, null);
            this.Z[i13].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Z[i13].setCursorWidth(1.5f);
            if (i13 == 0) {
                this.Z[i13].setOnTouchListener(new oi0(this, i3));
                this.Z[i13].setText(org.telegram.messenger.bd.M0(2131752134, null));
                this.Z[i13].setInputType(0);
                this.Z[i13].setFocusable(false);
            } else {
                this.Z[i13].setInputType(3);
                if (i13 == 2) {
                    this.Z[i13].setImeOptions(268435462);
                } else {
                    this.Z[i13].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            if (i13 == 1) {
                TextView textView = new TextView(context);
                this.x0 = textView;
                textView.setText("+");
                org.telegram.ui.ActionBar.r6.V(this.x0, i14, null);
                this.x0.setTextSize(1, 16.0f);
                frameLayout.addView(this.x0, b8.mf.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Z[i13].setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
                this.Z[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Z[i13].setGravity(19);
                frameLayout.addView(this.Z[i13], b8.mf.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Z[i13].addTextChangedListener(new ij0(this, i10));
            } else if (i13 == 2) {
                this.Z[i13].setPadding(0, 0, 0, 0);
                this.Z[i13].setGravity(19);
                this.Z[i13].setHintText(null);
                this.Z[i13].setHint(org.telegram.messenger.bd.M0(2131747380, null));
                frameLayout.addView(this.Z[i13], b8.mf.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Z[i13].addTextChangedListener(new wq(this, i3));
            } else {
                this.Z[i13].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                this.Z[i13].setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                frameLayout.addView(this.Z[i13], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Z[i13].setOnEditorActionListener(new li0(this, i11));
            if (i13 == 2) {
                this.Z[i13].setOnKeyListener(new vf(this, i10));
            }
            if (i13 == 0) {
                View view = new View(context);
                this.l0.add(view);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, null);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Z0.get(str)) != null && this.V0.indexOf(str2) != -1) {
                this.Z[1].setText((CharSequence) this.W0.get(str2));
            }
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.o0 = y8Var2;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
            this.o0.setText(org.telegram.messenger.bd.M0(2131747494, null));
            this.d0.addView(this.o0, b8.mf.o(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Z[1].setText((CharSequence) this.W0.get(str2));
        }
        org.telegram.ui.Cells.y8 y8Var22 = new org.telegram.ui.Cells.y8(context);
        this.o0 = y8Var22;
        org.telegram.ui.ActionBar.r6.a0(y8Var22, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
        this.o0.setText(org.telegram.messenger.bd.M0(2131747494, null));
        this.d0.addView(this.o0, b8.mf.o(-1, -2));
    }

    public final byte[] m1(byte[] bArr, byte[] bArr2) {
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
        if (!d1(bArr5, null)) {
            return null;
        }
        byte[] r5 = Utilities.r(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(r5, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(r5, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public final void n1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final mi0 mi0Var, final pi0 pi0Var, final boolean z11) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (!z11 || tL_secureRequiredType2 == null) {
            if (z10) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        } else {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() { // from class: org.telegram.ui.si0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final yj0 yj0Var = yj0.this;
                final nj0 nj0Var = pi0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = mi0Var;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ui0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        yj0 yj0Var2 = yj0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str2 = null;
                        if (tL_error2 != null) {
                            nj0 nj0Var2 = nj0Var;
                            if (nj0Var2 != null) {
                                nj0Var2.f(tL_error2.text, null);
                            }
                            yj0Var2.Q1(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (!z14) {
                            if (z15) {
                                yj0Var2.L1(tL_secureRequiredType6);
                            }
                            yj0Var2.L1(tL_secureRequiredType5);
                        } else if (tL_secureRequiredType5 != null) {
                            yj0Var2.L1(tL_secureRequiredType5);
                        } else {
                            yj0Var2.L1(tL_secureRequiredType6);
                        }
                        if (yj0Var2.b == 8) {
                            xj0 xj0Var = (xj0) yj0Var2.r1.remove(tL_secureRequiredType6);
                            if (xj0Var != null) {
                                yj0Var2.d0.removeView(xj0Var);
                                View childAt = yj0Var2.d0.getChildAt(r1.getChildCount() - 6);
                                if (childAt instanceof xj0) {
                                    ((xj0) childAt).setNeedDivider(false);
                                }
                            }
                            yj0Var2.V1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 == null || arrayList3 == null || arrayList3.size() <= 1) {
                                str = null;
                            } else {
                                int size = arrayList3.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size) {
                                        str = null;
                                        break;
                                    }
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i3);
                                    TLRPC.TL_secureValue v12 = yj0Var2.v1(tL_secureRequiredType7, false);
                                    if (v12 != null) {
                                        TLRPC.TL_secureData tL_secureData2 = v12.data;
                                        str = tL_secureData2 != null ? yj0.l1(tL_secureData2.data, yj0Var2.m1(tL_secureData2.secret, tL_secureData2.data_hash), v12.data.data_hash) : null;
                                        tL_secureRequiredType5 = tL_secureRequiredType7;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (tL_secureRequiredType5 == null) {
                                    tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList3.get(0);
                                }
                            }
                            if (z15) {
                                yj0Var2.P1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, arrayList3 != null ? arrayList3.size() : 0);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str3 = str;
                                TLRPC.TL_secureValue v13 = yj0Var2.v1(tL_secureRequiredType6, false);
                                if (v13 != null && (tL_secureData = v13.data) != null) {
                                    str2 = yj0.l1(tL_secureData.data, yj0Var2.m1(tL_secureData.secret, tL_secureData.data_hash), v13.data.data_hash);
                                }
                                yj0Var2.P1(tL_secureRequiredType6, null, str2, tL_secureRequiredType8, str3, z14, arrayList3 != null ? arrayList3.size() : 0);
                            }
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
            }
        });
    }

    public final b8.ke o1(byte[] bArr) {
        byte[] t12 = t1();
        int nextInt = Utilities.b.nextInt(208) + 32;
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
        byte[] o10 = Utilities.o(length, bArr3);
        byte[] r5 = Utilities.r(t12, o10);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r5, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r5, 32, bArr5, 0, 16);
        Utilities.b(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.d1, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] r9 = Utilities.r(bArr8, o10);
        byte[] bArr9 = new byte[32];
        System.arraycopy(r9, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(r9, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(t12, 0, bArr11, 0, 32);
        Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        b8.ke keVar = new b8.ke(14);
        keVar.d = bArr3;
        keVar.b = bArr11;
        keVar.e = o10;
        keVar.c = t12;
        keVar.f = new org.telegram.messenger.xv(bArr4, bArr5);
        return keVar;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        if (i10 == -1) {
            if (i3 == 0 || i3 == 2) {
                g1();
                org.telegram.ui.Components.bi biVar = this.S0;
                if (biVar != null) {
                    biVar.b2.j0(i3, intent, this.R0);
                }
                this.R0 = null;
                return;
            }
            if (i3 == 1) {
                if (intent == null || intent.getData() == null) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    Toast.makeText(getParentActivity(), org.telegram.messenger.bd.M0(2131743843, null), 0).show();
                } else {
                    ArrayList arrayList = new ArrayList();
                    org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
                    xyVar.a = intent.getData();
                    arrayList.add(xyVar);
                    K1(arrayList);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        int i3 = this.b;
        if (i3 == 7) {
            if (z10) {
                int i10 = this.J1;
                org.telegram.ui.Components.vt0[] vt0VarArr = this.K1;
                vt0VarArr[i10].c(true);
                for (org.telegram.ui.Components.vt0 vt0Var : vt0VarArr) {
                    if (vt0Var != null) {
                        vt0Var.f();
                    }
                }
            }
        } else if (i3 == 0 || i3 == 5) {
            if (z10) {
                a1(false);
            }
        } else if (i3 == 1 || i3 == 2) {
            return !b1(z10);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onDialogDismiss(Dialog dialog) {
        if (this.b == 3 && dialog == this.M1) {
            ArrayList arrayList = this.N1;
            if (arrayList.isEmpty()) {
                return;
            }
            getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.U1);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.V1);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.p0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.r0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.U1);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.V1);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.p0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.r0);
        int i3 = 0;
        a1(false);
        org.telegram.ui.Components.bi biVar = this.S0;
        if (biVar != null) {
            biVar.K();
            this.S0.j1();
        }
        if (this.b == 7) {
            while (true) {
                org.telegram.ui.Components.vt0[] vt0VarArr = this.K1;
                if (i3 >= vt0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.vt0 vt0Var = vt0VarArr[i3];
                if (vt0Var != null) {
                    vt0Var.f();
                }
                i3++;
            }
            org.telegram.ui.ActionBar.s1 s1Var = this.L1;
            if (s1Var != null) {
                try {
                    s1Var.dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1 = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.bi biVar = this.S0;
        if (biVar != null) {
            biVar.l1();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.bi biVar;
        org.telegram.ui.Cells.v9 v9Var;
        int i10 = this.b;
        if ((i10 != 1 && i10 != 2) || (biVar = this.S0) == null) {
            if (i10 == 3 && i3 == 6) {
                S1(false, this.F1, this.G1, this.H1, this.I1);
                return;
            }
            return;
        }
        int i11 = 0;
        if (i3 == 17) {
            biVar.b2.W(false);
            return;
        }
        if (i3 == 21) {
            if (getParentActivity() == null || iArr == null || iArr.length == 0 || iArr[0] == 0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131747320, null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747308, null), new pi0(this, i11));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            alertDialog$Builder.p();
            return;
        }
        if (i3 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            J1(0);
            return;
        }
        if (i3 != 22 || iArr == null || iArr.length <= 0 || iArr[0] != 0 || (v9Var = this.s0) == null) {
            return;
        }
        v9Var.callOnClick();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.bi biVar = this.S0;
        if (biVar != null) {
            biVar.m1();
        }
        if (this.b == 5 && (viewGroupArr = this.a0) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Z[0].requestFocus();
            org.telegram.messenger.g0.K3(this.Z[0]);
            org.telegram.messenger.g0.i3(new mi0(this, 0), 200L);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[Catch: Exception -> 0x0011, TRY_LEAVE, TryCatch #0 {Exception -> 0x0011, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0013, B:11:0x001e, B:13:0x0032, B:15:0x0036, B:17:0x003a, B:20:0x003f, B:22:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onThemeColorsChanged() {
        boolean z10;
        try {
            ScrollView scrollView = this.c0;
            boolean z11 = false;
            if (scrollView != null) {
                org.telegram.messenger.g0.z3(scrollView, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false));
            }
            int i3 = this.b;
            if (i3 != 2 && i3 != 1) {
                z10 = false;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false);
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false);
                if (z10 && (x02 != this.O1 || x03 != this.P1 || x04 != this.Q1)) {
                    z11 = true;
                }
                T1(this.Z, z10, z11);
                T1(this.b0, z10, z11);
                if (z11) {
                    return;
                }
                this.O1 = x02;
                this.P1 = x03;
                this.Q1 = x04;
                return;
            }
            z10 = true;
            int x022 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k6, false);
            int x032 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false);
            int x042 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false);
            if (z10) {
                z11 = true;
            }
            T1(this.Z, z10, z11);
            T1(this.b0, z10, z11);
            if (z11) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.i1 != null) {
            org.telegram.messenger.g0.h3(new mi0(this, 1));
        }
        int i3 = this.b;
        if (i3 == 5) {
            if (z10) {
                if (this.a0[0].getVisibility() == 0) {
                    this.Z[0].requestFocus();
                    org.telegram.messenger.g0.K3(this.Z[0]);
                }
                if (this.O0 == 2) {
                    F1(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 7) {
            if (z10) {
                this.K1[this.J1].j();
                return;
            }
            return;
        }
        if (i3 == 4) {
            if (z10) {
                this.Z[0].requestFocus();
                org.telegram.messenger.g0.K3(this.Z[0]);
                return;
            }
            return;
        }
        if (i3 == 6) {
            if (z10) {
                this.Z[0].requestFocus();
                org.telegram.messenger.g0.K3(this.Z[0]);
                return;
            }
            return;
        }
        if (i3 == 2 || i3 == 1) {
            g1();
        }
    }

    public final void p1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z10) {
        bundle.putString("phoneHash", tL_auth_sentCode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = tL_auth_sentCode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        }
        if (tL_auth_sentCode.timeout == 0) {
            tL_auth_sentCode.timeout = 60;
        }
        bundle.putInt("timeout", tL_auth_sentCode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            O1(bundle, 2, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            O1(bundle, 1, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            O1(bundle, 0, z10);
        }
    }

    public final String q1() {
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
            if (i3 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i3].getText());
            sb2.append(",");
            i3++;
        }
        if (this.b0 != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.b0;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i10].getText());
                sb2.append(",");
                i10++;
            }
        }
        ArrayList arrayList = this.j1;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(((org.telegram.messenger.wv) arrayList.get(i11)).b.id);
        }
        org.telegram.messenger.wv wvVar = this.m1;
        if (wvVar != null) {
            sb2.append(wvVar.b.id);
        }
        org.telegram.messenger.wv wvVar2 = this.n1;
        if (wvVar2 != null) {
            sb2.append(wvVar2.b.id);
        }
        org.telegram.messenger.wv wvVar3 = this.k1;
        if (wvVar3 != null) {
            sb2.append(wvVar3.b.id);
        }
        ArrayList arrayList2 = this.l1;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            sb2.append(((org.telegram.messenger.wv) arrayList2.get(i12)).b.id);
        }
        return sb2.toString();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void restoreSelfArgs(Bundle bundle) {
        this.R0 = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.R0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final TLRPC.TL_secureValue v1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.E.values.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.TL_secureValue tL_secureValue = this.E.values.get(i3);
            if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                if (z10) {
                    if (tL_secureRequiredType.selfie_required && !(tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    if (tL_secureRequiredType.translation_required && tL_secureValue.translation.isEmpty()) {
                        return null;
                    }
                    if (x1(tL_secureRequiredType.type) && tL_secureValue.files.isEmpty()) {
                        return null;
                    }
                    if (z1(tL_secureRequiredType.type) && !(tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                    if (((secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) && !(tL_secureValue.reverse_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    boolean z11 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    if (z11 || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                        String[] strArr = z11 ? tL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                        try {
                            TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                            JSONObject jSONObject = new JSONObject(l1(tL_secureData.data, m1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
                            for (int i10 = 0; i10 < strArr.length; i10++) {
                                if (!jSONObject.has(strArr[i10]) || TextUtils.isEmpty(jSONObject.getString(strArr[i10]))) {
                                    return null;
                                }
                            }
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                }
                return tL_secureValue;
            }
        }
        return null;
    }

    public final boolean w1(Class cls) {
        int size = this.E.values.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.E.values.get(i3).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    public final boolean y1() {
        String str = this.a;
        return str == null || str.equals(q1());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public yj0(int i3, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i3, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i10;
        String s12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.c = j10;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.r = str2;
        this.n = str5;
        if (i3 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new fj0(this));
            int size = authorizationform.errors.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i11);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    s12 = s1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    s12 = s1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    s12 = s1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        s12 = s1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        s12 = s1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            s12 = s1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            s12 = s1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            s12 = s1(tL_secureValueError.type);
                            str6 = tL_secureValueError.text;
                            bArr = tL_secureValueError.hash;
                            str7 = null;
                            str8 = "error_all";
                        } else {
                            if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                                TLRPC.TL_secureValueErrorData tL_secureValueErrorData = (TLRPC.TL_secureValueErrorData) secureValueError;
                                int i12 = 0;
                                while (i12 < authorizationform.values.size()) {
                                    TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i12).data;
                                    if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                        i12++;
                                        size = size;
                                    } else {
                                        s12 = s1(tL_secureValueErrorData.type);
                                        str6 = tL_secureValueErrorData.text;
                                        String str10 = tL_secureValueErrorData.field;
                                        bArr = tL_secureValueErrorData.data_hash;
                                        str7 = str10;
                                        str8 = "data";
                                    }
                                }
                            }
                            i10 = size;
                            i11++;
                            size = i10;
                        }
                        str8 = "files";
                    }
                    str8 = "translation";
                }
                HashMap hashMap = (HashMap) this.v1.get(s12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i10 = size;
                    this.v1.put(s12, hashMap);
                    this.w1.put(s12, str6);
                } else {
                    i10 = size;
                }
                if (bArr != null) {
                    str9 = Base64.encodeToString(bArr, 2);
                } else {
                    str9 = "";
                }
                switch (str8.hashCode()) {
                    case -1840647503:
                        if (!str8.equals("translation")) {
                            break;
                        } else if (bArr != null) {
                            hashMap.put("translation" + str9, str6);
                            break;
                        } else {
                            hashMap.put("translation_all", str6);
                            break;
                        }
                    case -906020504:
                        if (!str8.equals("selfie")) {
                            break;
                        } else {
                            hashMap.put("selfie" + str9, str6);
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
                        } else if (bArr != null) {
                            hashMap.put("files" + str9, str6);
                            break;
                        } else {
                            hashMap.put("files_all", str6);
                            break;
                        }
                    case 97705513:
                        if (!str8.equals("front")) {
                            break;
                        } else {
                            hashMap.put("front" + str9, str6);
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
                            hashMap.put("reverse" + str9, str6);
                            break;
                        }
                }
                i11++;
                size = i10;
            }
        } catch (Exception unused) {
        }
    }
}
