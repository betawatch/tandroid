package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xg0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int t0;
    public boolean E;
    public int F;
    public String G;
    public Bundle H;
    public TLRPC.TL_auth_sentCode I;
    public int J;
    public final AnimatorSet[] K;
    public AnimatorSet L;
    public org.telegram.ui.Components.s31 M;
    public org.telegram.ui.Components.h20 N;
    public og.u0 O;
    public int P;
    public final boolean[] Q;
    public org.telegram.ui.ActionBar.d2 R;
    public w8 S;
    public lg0 T;
    public ImageView U;
    public RadialProgressView V;
    public ImageView W;
    public org.telegram.ui.Components.pi0 X;
    public LinearLayout Y;
    public k0 Z;
    public int a;
    public boolean a0;
    public final org.telegram.ui.Components.fw0[] b;
    public kg0 b0;
    public org.telegram.ui.Components.as c;
    public boolean c0;
    public ValueAnimator d;
    public Runnable d0;
    public boolean e;
    public kw e0;
    public boolean f;
    public TextView f0;
    public boolean g0;
    public Dialog h;
    public boolean h0;
    public final boolean[] i0;
    public final Runnable[] j0;
    public final boolean[] k0;
    public boolean l0;
    public View m0;
    public Dialog n;
    public boolean n0;
    public boolean o0;
    public TLRPC.TL_help_termsOfService p0;
    public int q0;
    public final ArrayList r;
    public boolean r0;
    public final ArrayList s;
    public kd0 s0;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    static {
        t0 = SharedConfig.getDevicePerformanceClass() <= 1 ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : 100;
    }

    public xg0() {
        super(null);
        this.b = new org.telegram.ui.Components.fw0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = true;
        this.w = true;
        this.y = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.a0 = false;
        this.i0 = new boolean[2];
        this.j0 = new Runnable[2];
        this.k0 = new boolean[2];
    }

    public static boolean T0(xg0 xg0Var, View view) {
        if (xg0Var.h1()) {
            return true;
        }
        return AndroidUtilities.showKeyboard(view);
    }

    public static void U(xg0 xg0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        xg0Var.k1(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                xg0Var.u1(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            xg0Var.u1(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(xg0Var.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        xg0Var.u1(8, true, bundle2, false);
    }

    public static void U0(xg0 xg0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z10 && (view instanceof org.telegram.ui.Components.hd0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.hd0 hd0Var = (org.telegram.ui.Components.hd0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = hd0Var.getAttachedEditText();
            og.x xVar = new og.x(attachedEditText, atomicReference, false, 3);
            hd0Var.a(1.0f);
            org.telegram.ui.Components.q01 q01Var = new org.telegram.ui.Components.q01(hd0Var, view, attachedEditText, xVar, 13);
            atomicReference.set(q01Var);
            view.postDelayed(q01Var, 2000L);
            view.setTag(R.id.timeout_callback, q01Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(xVar);
            }
        }
    }

    public static void V(xg0 xg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, m8.d dVar) {
        m8.e eVar = ((b8.f) ((com.google.android.gms.common.api.q) dVar.a)).b;
        String str2 = eVar == null ? null : eVar.a;
        if (str2 == null) {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            xg0Var.s1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] split = str2.split("\\.");
        if (split.length <= 0) {
            FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            xg0Var.s1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (optBoolean && optBoolean2) {
                    ConnectionsManager.getInstance(xg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new od0(1, bundle, auth_sentcode, xg0Var, z10), 10);
                    return;
                }
                if (!optBoolean && !optBoolean2) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                    xg0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                } else if (!optBoolean) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                    xg0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                } else {
                    if (optBoolean2) {
                        return;
                    }
                    FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    xg0Var.s1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                }
            } catch (JSONException e) {
                e = e;
                FileLog.e(e);
                FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                xg0Var.s1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
            }
        } catch (JSONException e7) {
            e = e7;
        }
    }

    public static HashSet V0(xg0 xg0Var) {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22) {
                SubscriptionManager from = SubscriptionManager.from(xg0Var.getParentActivity());
                List<SubscriptionInfo> completeActiveSubscriptionInfoList = i10 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i10 >= 28) {
                    completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                    completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList != null) {
                    for (int i11 = 0; i11 < completeActiveSubscriptionInfoList.size(); i11++) {
                        String number = completeActiveSubscriptionInfoList.get(i11).getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            hashSet.add(number);
                        }
                    }
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        return hashSet;
    }

    public static void W(xg0 xg0Var, String str, String str2, String str3) {
        xg0Var.n1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(xg0Var.currentAccount).sendRequest(deleteaccount, new bi.l9(xg0Var, str, str2, str3, 7), 10);
    }

    public static /* synthetic */ void X(xg0 xg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            xg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(xg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new od0(0, bundle, auth_sentcode, xg0Var, z10), 10);
    }

    public static String f1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder u10 = a4.a.u(simpleName);
            u10.append(exc.getMessage());
            simpleName = u10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle j1(int i10, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            sb2.append(z10 ? "_" + i10 : "");
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb2.toString(), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] split = key.split("_\\|_");
                if (split.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (split.length == 2) {
                    Bundle bundle2 = bundle.getBundle(split[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(split[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(split[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(split[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(split[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static void m1(org.telegram.ui.ActionBar.p2 p2Var, String str, m.e3 e3Var, boolean z10) {
        List list;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z10) {
            d2Var.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            d2Var.T = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
        } else if (e3Var == null || (list = (List) e3Var.c) == null || list.isEmpty() || ((wt) e3Var.b) == null) {
            d2Var.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            d2Var.T = LocaleController.getString(R.string.InvalidPhoneNumber);
        } else {
            Iterator it = ((List) e3Var.c).iterator();
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i10) {
                    i10 = length;
                }
            }
            if (gf.b.d(str, false).length() - ((wt) e3Var.b).c.length() < i10) {
                d2Var.R = LocaleController.getString(R.string.WrongNumberFormat);
                d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((wt) e3Var.b).a, (String) e3Var.d));
            } else {
                d2Var.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                d2Var.T = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
        }
        alertDialog$Builder.i(LocaleController.getString("BotHelp", R.string.BotHelp), new com.google.firebase.messaging.i(str, p2Var, z10));
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        p2Var.showDialog(d2Var);
    }

    public static void n0(xg0 xg0Var, String str, String str2, String str3) {
        if (xg0Var.V.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        alertDialog$Builder.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        alertDialog$Builder.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new a1.d(xg0Var, str, str2, str3, 13));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        xg0Var.showDialog(alertDialog$Builder.a);
    }

    public static void r1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a4.a.C(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a4.a.C(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a4.a.C(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                r1((Bundle) obj, editor, str2);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.n0) {
                this.m0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && !this.n0) {
            ViewGroup viewGroup2 = (ViewGroup) lVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0441, code lost:
    
        if (r1 != 4) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x043c A[ADDED_TO_REGION] */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        int i10;
        View view = this.m0;
        if (view != null) {
            this.fragmentView = view;
            this.m0 = null;
            return view;
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 5));
        this.J = 0;
        boolean[] zArr = this.Q;
        zArr[0] = true;
        zArr[1] = false;
        w8 w8Var = new w8(this, context, 5);
        this.S = w8Var;
        w8Var.setDelegate(new rd0(0, this));
        this.fragmentView = this.S;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 4);
        x1Var.setFillViewport(true);
        this.S.addView(x1Var, w7.a6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        x1Var.addView(this.Y, w7.a6.x(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
        this.Y.addView(space);
        k0 k0Var = new k0(this, context, 12);
        this.Z = k0Var;
        this.Y.addView(k0Var, w7.a6.l(1.0f, -1, 0));
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(context);
        this.c = asVar;
        asVar.setViewToFindFocus(this.Z);
        this.Y.addView(this.c, w7.a6.n(-1, 230));
        wg0 wg0Var = new wg0(this, context);
        org.telegram.ui.Components.fw0[] fw0VarArr = this.b;
        fw0VarArr[0] = wg0Var;
        fw0VarArr[1] = new zf0(this, context, 1);
        fw0VarArr[2] = new zf0(this, context, 2);
        fw0VarArr[3] = new zf0(this, context, 3);
        fw0VarArr[4] = new zf0(this, context, 4);
        fw0VarArr[5] = new hf0(this, context);
        fw0VarArr[6] = new pe0(this, context);
        fw0VarArr[7] = new af0(this, context);
        int i11 = 8;
        fw0VarArr[8] = new if0(this, context);
        fw0VarArr[9] = new me0(this, context, 0);
        fw0VarArr[10] = new me0(this, context, 1);
        fw0VarArr[11] = new zf0(this, context, 11);
        fw0VarArr[12] = new lf0(this, context);
        fw0VarArr[13] = new ge0(this, context, true);
        fw0VarArr[14] = new ge0(this, context, false);
        fw0VarArr[15] = new zf0(this, context, 15);
        fw0VarArr[16] = new xe0(this, context, 16);
        fw0VarArr[17] = new xe0(this, context, 17);
        int i12 = 18;
        fw0VarArr[18] = new fg0(this, context);
        int i13 = 0;
        while (i13 < fw0VarArr.length) {
            org.telegram.ui.Components.fw0 fw0Var = fw0VarArr[i13];
            if (i13 == 0) {
                i11 = 0;
            }
            fw0Var.setVisibility(i11);
            this.Z.addView(fw0VarArr[i13], w7.a6.d(-1, -1.0f, 17, AndroidUtilities.isTablet() ? 26.0f : 18.0f, i13 != i12 ? 30.0f : 0.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
            i13++;
            i12 = 18;
            i11 = 8;
        }
        Bundle j12 = this.F == 0 ? j1(this.currentAccount, this.x) : null;
        if (j12 != null && ((i10 = j12.getInt("currentViewNum", 0)) < 0 || i10 >= fw0VarArr.length)) {
            j12 = null;
        }
        if (j12 != null) {
            this.a = j12.getInt("currentViewNum", 0);
            this.y = j12.getInt("syncContacts", 1) == 1;
            int i14 = this.a;
            if (i14 >= 1 && i14 <= 4) {
                int i15 = j12.getInt("open");
                if (i15 != 0 && Math.abs((System.currentTimeMillis() / 1000) - i15) >= 86400) {
                    this.a = 0;
                    e1();
                    j12 = null;
                }
            } else if (i14 == 6) {
                if (((pe0) fw0VarArr[6]).n == null) {
                    this.a = 0;
                    e1();
                    j12 = null;
                }
            } else if (i14 == 7 && ((af0) fw0VarArr[7]).h == null) {
                this.a = 0;
                e1();
                j12 = null;
            }
        }
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.N = h20Var;
        h20Var.e(zArr[0], false);
        this.O = new og.u0(this.N);
        this.S.addView(this.N, w7.a6.d(56, 56.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        final int i16 = 0;
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.b.p1();
                        break;
                    case 1:
                        xg0 xg0Var = this.b;
                        if (xg0Var.onBackPressed(true)) {
                            xg0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        xg0 xg0Var2 = this.b;
                        kw kwVar = xg0Var2.e0;
                        if (kwVar != null) {
                            kwVar.run();
                        }
                        xg0Var2.finishFragment();
                        break;
                    default:
                        xg0 xg0Var3 = this.b;
                        xg0Var3.getClass();
                        xg0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((o1.k) this.O.c).b(new td0(this, i16));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        final int i17 = 1;
        this.U.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.b.p1();
                        break;
                    case 1:
                        xg0 xg0Var = this.b;
                        if (xg0Var.onBackPressed(true)) {
                            xg0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        xg0 xg0Var2 = this.b;
                        kw kwVar = xg0Var2.e0;
                        if (kwVar != null) {
                            kwVar.run();
                        }
                        xg0Var2.finishFragment();
                        break;
                    default:
                        xg0 xg0Var3 = this.b;
                        xg0Var3.getClass();
                        xg0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.U.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        int dp = AndroidUtilities.dp(4.0f);
        this.U.setPadding(dp, dp, dp, dp);
        this.S.addView(this.U, w7.a6.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.e0 != null && !this.g0 && this.h0) {
            TextView textView = new TextView(context);
            this.f0 = textView;
            textView.setGravity(19);
            this.f0.setTextSize(1, 15.0f);
            this.f0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.f0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.f0.setText(LocaleController.getString(R.string.YourEmailSkip));
            this.f0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
            this.S.addView(this.f0, w7.a6.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            final int i18 = 2;
            this.f0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd0
                public final /* synthetic */ xg0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            this.b.p1();
                            break;
                        case 1:
                            xg0 xg0Var = this.b;
                            if (xg0Var.onBackPressed(true)) {
                                xg0Var.finishFragment();
                                break;
                            }
                            break;
                        case 2:
                            xg0 xg0Var2 = this.b;
                            kw kwVar = xg0Var2.e0;
                            if (kwVar != null) {
                                kwVar.run();
                            }
                            xg0Var2.finishFragment();
                            break;
                        default:
                            xg0 xg0Var3 = this.b;
                            xg0Var3.getClass();
                            xg0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
        }
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.X = pi0Var;
        imageView2.setImageDrawable(pi0Var);
        final int i19 = 3;
        this.W.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        this.b.p1();
                        break;
                    case 1:
                        xg0 xg0Var = this.b;
                        if (xg0Var.onBackPressed(true)) {
                            xg0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        xg0 xg0Var2 = this.b;
                        kw kwVar = xg0Var2.e0;
                        if (kwVar != null) {
                            kwVar.run();
                        }
                        xg0Var2.finishFragment();
                        break;
                    default:
                        xg0 xg0Var3 = this.b;
                        xg0Var3.getClass();
                        xg0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.W.setAlpha(0.0f);
        this.W.setVisibility(8);
        this.S.addView(this.W, w7.a6.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        z1(false, true);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.V = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.V.setAlpha(0.0f);
        this.V.setScaleX(0.1f);
        this.V.setScaleY(0.1f);
        this.S.addView(this.V, w7.a6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.s31 s31Var = new org.telegram.ui.Components.s31(context);
        this.M = s31Var;
        s31Var.setTransformType(0);
        this.M.setProgress(1.0f);
        this.M.setDrawBackground(false);
        this.N.setContentDescription(LocaleController.getString(R.string.Done));
        this.N.addView(this.M, w7.a6.e(56, 56, 17));
        this.N.a(this.M);
        if (j12 != null) {
            this.f = true;
        }
        int i20 = 0;
        while (i20 < fw0VarArr.length) {
            org.telegram.ui.Components.fw0 fw0Var2 = fw0VarArr[i20];
            if (j12 != null) {
                if (i20 < 1 || i20 > 4) {
                    fw0Var2.k(j12);
                } else if (i20 == this.a) {
                    fw0Var2.k(j12);
                }
            }
            if (this.a == i20) {
                this.U.setVisibility((fw0Var2.b() || this.x || this.F == 2) ? 0 : 8);
                fw0Var2.setVisibility(0);
                fw0Var2.j();
                t1(fw0Var2.a(), false);
                this.J = 0;
                if (i20 != 0 && i20 != 5 && i20 != 6) {
                    if (i20 != 9) {
                        if (i20 != 10 && i20 != 12) {
                            z10 = false;
                            v1(z10, false);
                            if (i20 == 1 && i20 != 2) {
                                if (i20 != 3) {
                                }
                            }
                            this.J = 1;
                        }
                        z10 = true;
                        v1(z10, false);
                        if (i20 == 1) {
                        }
                        this.J = 1;
                    }
                }
                z10 = true;
                v1(z10, false);
                if (i20 == 1) {
                }
                this.J = 1;
            } else if (fw0Var2.getVisibility() != 8) {
                fw0Var2.setVisibility(8);
                fw0Var2.g();
            }
            i20++;
        }
        this.f = false;
        y1();
        if (i1()) {
            g1(this.H, this.I, false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            z1(true, false);
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && this.h0 && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public final void e1() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.x) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final void g1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            u1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.o0) {
            if (!PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                s1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            n1(0, true);
            this.o0 = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                FileLog.d("getting classic integrity with nonce = ".concat(str));
                Task<IntegrityTokenResponse> addOnSuccessListener = create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new ld0(this, bundle, auth_sentcode, string, z10));
                final int i10 = 0;
                addOnSuccessListener.addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.md0
                    public final /* synthetic */ xg0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        switch (i10) {
                            case 0:
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + xg0.f1(exc);
                                FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                this.b.s1(bundle, auth_sentcode, str2);
                                break;
                            default:
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + xg0.f1(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.b.s1(bundle, auth_sentcode, str3);
                                break;
                        }
                    }
                });
                return;
            }
            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(ApplicationLoader.applicationContext, m8.c.a, null, new com.google.android.gms.common.api.internal.a());
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = BuildVars.SAFETYNET_KEY;
            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
            b8.e eVar = new b8.e(t0Var, bArr, str2);
            t0Var.b.d(0, eVar);
            Task addOnSuccessListener2 = n6.l.n(eVar, new n6.m(new m8.d())).addOnSuccessListener(new ld0(this, string, auth_sentcode, bundle, z10));
            final int i11 = 1;
            addOnSuccessListener2.addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.md0
                public final /* synthetic */ xg0 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    switch (i11) {
                        case 0:
                            String str22 = "PLAYINTEGRITY_EXCEPTION_" + xg0.f1(exc);
                            FileLog.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                            this.b.s1(bundle, auth_sentcode, str22);
                            break;
                        default:
                            FileLog.e(exc);
                            String str3 = "SAFETYNET_EXCEPTION_" + xg0.f1(exc);
                            FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                            this.b.s1(bundle, auth_sentcode, str3);
                            break;
                    }
                }
            });
            return;
        }
        bundle.putString("phoneHash", auth_sentcode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = auth_sentcode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeMissedCall) {
            bundle.putInt("nextType", 11);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFragmentSms) {
            bundle.putInt("nextType", 15);
        }
        if (auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeApp) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(1, z10, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            auth_sentcode.timeout = BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * MediaDataController.MAX_STYLE_RUNS_COUNT);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(4, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            u1(3, z10, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            u1(2, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(15, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            u1(11, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            u1(12, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            u1(14, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            u1(16, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            u1(17, z10, bundle, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        return w7.d6.a(new e(this, 22), org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.D6, org.telegram.ui.ActionBar.j6.H6, org.telegram.ui.ActionBar.j6.i6, org.telegram.ui.ActionBar.j6.P9, org.telegram.ui.ActionBar.j6.O9, org.telegram.ui.ActionBar.j6.k6, org.telegram.ui.ActionBar.j6.l6, org.telegram.ui.ActionBar.j6.I6, org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.y6, org.telegram.ui.ActionBar.j6.i7, org.telegram.ui.ActionBar.j6.q6, org.telegram.ui.ActionBar.j6.Wh, org.telegram.ui.ActionBar.j6.Q9, org.telegram.ui.ActionBar.j6.p7, org.telegram.ui.ActionBar.j6.J6, org.telegram.ui.ActionBar.j6.Y6, org.telegram.ui.ActionBar.j6.W6, org.telegram.ui.ActionBar.j6.X6, org.telegram.ui.ActionBar.j6.h5, org.telegram.ui.ActionBar.j6.q5, org.telegram.ui.ActionBar.j6.j5);
    }

    public final boolean h1() {
        return this.b[this.a].a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final boolean i1() {
        return this.F == 1;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.h0;
    }

    public final void k1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (this.P != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.P, true);
            }
            this.P = 0;
        }
        if (i1() && (d2Var = this.R) != null) {
            d2Var.dismiss();
            this.R = null;
        }
        w1(false, z11, false);
    }

    public final void l1(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = str;
        d2Var.T = str2;
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void n1(int i10, boolean z10) {
        if (!i1() || i10 != 0) {
            this.P = i10;
            w1(true, z10, false);
        } else {
            if (this.R != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.R = d2Var;
            d2Var.g0 = false;
            d2Var.show();
        }
    }

    public final void o1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.y;
        UserConfig.getInstance(this.currentAccount).setCurrentUser(tL_auth_authorization.user);
        UserConfig.getInstance(this.currentAccount).saveConfig(true);
        MessagesStorage.getInstance(this.currentAccount).cleanup(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, true, true);
        MessagesController.getInstance(this.currentAccount).putUser(tL_auth_authorization.user, false);
        ContactsController.getInstance(this.currentAccount).checkAppAccount();
        MessagesController.getInstance(this.currentAccount).checkPromoInfo(true);
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        MessagesController.getInstance(this.currentAccount).loadAppConfig();
        MessagesController.getInstance(this.currentAccount).lambda$removeWebBrowserException$514();
        MessagesController.getInstance(this.currentAccount).checkPeerColors(false);
        if (tL_auth_authorization.future_auth_token != null) {
            AuthTokensHelper.saveLogInToken(tL_auth_authorization);
        } else {
            FileLog.d("onAuthSuccess future_auth_token is empty");
        }
        if (z10) {
            MessagesController.getInstance(this.currentAccount).putDialogsEndReachedAfterRegistration();
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, true);
        boolean z11 = tL_auth_authorization.setup_password_required;
        int i10 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        e1();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
                externalActionActivity.d(externalActionActivity.h, externalActionActivity.n, externalActionActivity.v, true, externalActionActivity.r, externalActionActivity.s);
                externalActionActivity.c.X();
                ActionBarLayout actionBarLayout = externalActionActivity.d;
                if (actionBarLayout != null) {
                    actionBarLayout.X();
                }
                org.telegram.ui.Components.aw0 aw0Var = externalActionActivity.e;
                if (aw0Var != null) {
                    aw0Var.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.x) {
            this.x = false;
            this.n0 = true;
            ((LaunchActivity) getParentActivity()).L0(this.currentAccount, new i2.x(3, z10));
            this.n0 = false;
            finishFragment();
            return;
        }
        if (z10 && z11) {
            mh1 mh1Var = new mh1(6, null);
            mh1Var.G = i10;
            mh1Var.H = true;
            presentFragment(mh1Var, true);
        } else {
            Bundle i11 = a4.a.i("afterSignup", z10);
            fh0 fh0Var = new fh0();
            fh0Var.l0(i11);
            presentFragment(fh0Var, true);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        k41.V(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        hf0 hf0Var = (hf0) this.b[5];
        if (hf0Var != null) {
            hf0Var.L.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        if (!this.h0 || this.a != 12) {
            int i10 = this.a;
            org.telegram.ui.Components.fw0[] fw0VarArr = this.b;
            if (i10 == 0 || (this.F == 3 && i10 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.fw0 fw0Var : fw0VarArr) {
                        if (fw0Var != null) {
                            fw0Var.f();
                        }
                    }
                    e1();
                }
                return true;
            }
            if (i10 == 6) {
                if (z10) {
                    fw0VarArr[i10].c(true);
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 7 || i10 == 8) {
                if (z10) {
                    fw0VarArr[i10].c(true);
                    u1(6, true, null, true);
                }
            } else if ((i10 >= 1 && i10 <= 4) || i10 == 11 || i10 == 15) {
                if (z10 && fw0VarArr[i10].c(false)) {
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 5) {
                if (z10) {
                    ((hf0) fw0VarArr[i10]).w.callOnClick();
                    return false;
                }
            } else if (i10 == 9) {
                if (z10) {
                    fw0VarArr[i10].c(true);
                    u1(7, true, null, true);
                    return false;
                }
            } else if (i10 == 10) {
                if (z10) {
                    fw0VarArr[i10].c(true);
                    u1(9, true, null, true);
                    return false;
                }
            } else if (i10 == 13) {
                if (z10) {
                    fw0VarArr[i10].c(true);
                    u1(12, true, null, true);
                    return false;
                }
            } else if (z10 && fw0VarArr[i10].c(true)) {
                u1(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        t1(this.b[this.a].a(), false);
        kg0 kg0Var = this.b0;
        if (kg0Var != null) {
            int i10 = kg0.E;
            kg0Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (dialog == this.h) {
                    ArrayList arrayList = this.r;
                    if (!arrayList.isEmpty() && getParentActivity() != null) {
                        getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                        return;
                    }
                }
                if (dialog == this.n) {
                    ArrayList arrayList2 = this.s;
                    if (arrayList2.isEmpty() || getParentActivity() == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new kd0(this, 1), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.fw0[] fw0VarArr = this.b;
            if (i10 >= fw0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.fw0 fw0Var = fw0VarArr[i10];
            if (fw0Var != null) {
                fw0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.R;
        if (d2Var != null) {
            d2Var.dismiss();
            this.R = null;
        }
        for (Runnable runnable : this.j0) {
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        if (this.x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z10 = iArr[0] == 0;
        org.telegram.ui.Components.fw0[] fw0VarArr = this.b;
        if (i10 == 6) {
            this.v = false;
            int i11 = this.a;
            if (i11 == 0) {
                org.telegram.ui.Components.fw0 fw0Var = fw0VarArr[i11];
                ((wg0) fw0Var).L = true;
                fw0Var.h(null);
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.w = false;
            int i12 = this.a;
            if (i12 == 0) {
                ((wg0) fw0VarArr[i12]).q();
                return;
            }
            return;
        }
        if (i10 == 20) {
            if (z10) {
                ((hf0) fw0VarArr[5]).L.m();
            }
        } else if (i10 == 151 && z10) {
            hf0 hf0Var = (hf0) fw0VarArr[5];
            hf0Var.post(new ud0(hf0Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        org.telegram.ui.Components.fw0 fw0Var;
        int i10;
        org.telegram.ui.Components.fw0[] fw0VarArr = this.b;
        super.onResume();
        if (this.x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i11 = this.a;
            if (i11 >= 1 && i11 <= 4) {
                org.telegram.ui.Components.fw0 fw0Var2 = fw0VarArr[i11];
                if ((fw0Var2 instanceof zf0) && (i10 = ((zf0) fw0Var2).T) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                    fw0VarArr[this.a].c(true);
                    u1(0, false, null, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        int i12 = this.a;
        if (i12 == 0 && !this.c0 && (fw0Var = fw0VarArr[i12]) != null) {
            fw0Var.j();
        }
        if (h1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i13 = this.a;
        if (i13 < 0 || i13 >= fw0VarArr.length) {
            return;
        }
        fw0VarArr[i13].i();
    }

    public final void p1() {
        if (this.Q[this.J]) {
            if (this.V.getTag() == null) {
                this.b[this.a].h(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
            alertDialog$Builder.a.T = LocaleController.getString("StopLoading", R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString("WaitMore", R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new pd0(this, 0));
            showDialog(alertDialog$Builder.a);
        }
    }

    public final void q1(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        g1(bundle, auth_sentcode, true);
    }

    public final void s1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.o0) {
            k1(false, true);
            this.o0 = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new org.telegram.ui.Components.th(26, this, bundle), 10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.y ? 1 : 0);
            for (int i10 = 0; i10 <= this.a; i10++) {
                org.telegram.ui.Components.fw0 fw0Var = this.b[i10];
                if (fw0Var != null) {
                    fw0Var.l(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            sb2.append(this.x ? "_" + this.currentAccount : "");
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            r1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t1(boolean z10, boolean z11) {
        if (this.a0 == z10 && z11) {
            return;
        }
        this.a0 = z10;
        int i10 = 0;
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            z10 = false;
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (!z11) {
                this.c.setVisibility(0);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.d = duration;
            duration.setInterpolator(org.telegram.ui.Components.wr.f);
            this.d.addUpdateListener(new jd0(this, i10));
            this.d.addListener(new vd0(this, i10));
            this.d.start();
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (!z11) {
            this.c.setVisibility(8);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        this.d = duration2;
        duration2.setInterpolator(org.telegram.ui.Components.pt.e);
        int i11 = 1;
        this.d.addUpdateListener(new jd0(this, i11));
        this.d.addListener(new vd0(this, i11));
        this.d.start();
    }

    public final void u1(int i10, boolean z10, Bundle bundle, boolean z11) {
        boolean z12 = i10 == 0 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 10 || i10 == 12 || i10 == 17 || i10 == 16;
        if (i10 == this.a) {
            z10 = false;
        }
        int i11 = 8;
        if (z12) {
            if (i10 == 0) {
                this.v = true;
                this.w = true;
            }
            this.J = 1;
            v1(false, z10);
            w1(false, z10, false);
            this.J = 0;
            w1(false, z10, false);
            if (!z10) {
                v1(true, false);
            }
        } else {
            this.J = 0;
            v1(false, z10);
            w1(false, z10, false);
            if (i10 != 8) {
                this.J = 1;
            }
        }
        org.telegram.ui.Components.fw0[] fw0VarArr = this.b;
        if (!z10) {
            this.U.setVisibility((fw0VarArr[i10].b() || this.x) ? 0 : 8);
            fw0VarArr[this.a].setVisibility(8);
            fw0VarArr[this.a].g();
            this.a = i10;
            fw0VarArr[i10].m(bundle, false);
            fw0VarArr[i10].setVisibility(0);
            setParentActivityTitle(fw0VarArr[i10].getHeaderName());
            fw0VarArr[i10].j();
            t1(fw0VarArr[i10].a(), false);
            return;
        }
        org.telegram.ui.Components.fw0 fw0Var = fw0VarArr[this.a];
        org.telegram.ui.Components.fw0 fw0Var2 = fw0VarArr[i10];
        this.a = i10;
        this.U.setVisibility((fw0Var2.b() || this.x) ? 0 : 8);
        fw0Var2.m(bundle, false);
        setParentActivityTitle(fw0Var2.getHeaderName());
        fw0Var2.j();
        int i12 = AndroidUtilities.displaySize.x;
        if (z11) {
            i12 = -i12;
        }
        fw0Var2.setX(i12);
        fw0Var2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new androidx.fragment.app.g(this, z12, fw0Var, i11));
        Property property = View.TRANSLATION_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(fw0Var, (Property<org.telegram.ui.Components.fw0, Float>) property, z11 ? AndroidUtilities.displaySize.x : -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(fw0Var2, (Property<org.telegram.ui.Components.fw0, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        t1(fw0Var2.a(), true);
    }

    public final void v1(boolean z10, boolean z11) {
        TimeInterpolator timeInterpolator;
        int i10 = this.J;
        boolean z12 = i10 == 0;
        boolean[] zArr = this.Q;
        if (zArr[i10] == z10) {
            return;
        }
        AnimatorSet[] animatorSetArr = this.K;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            if (z11) {
                animatorSet.removeAllListeners();
            }
            animatorSetArr[this.J].cancel();
        }
        int i11 = this.J;
        zArr[i11] = z10;
        if (!z11) {
            if (z12) {
                this.N.e(z10, z11);
                return;
            }
            return;
        }
        animatorSetArr[i11] = new AnimatorSet();
        if (z12) {
            this.N.e(z10, z11);
        }
        animatorSetArr[this.J].addListener(new org.telegram.ui.ActionBar.g(this, z12, z10, 5));
        int i12 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        if (!z12) {
            timeInterpolator = null;
        } else if (z10) {
            timeInterpolator = AndroidUtilities.decelerateInterpolator;
            i12 = 200;
        } else {
            timeInterpolator = AndroidUtilities.accelerateInterpolator;
        }
        animatorSetArr[this.J].setDuration(i12);
        animatorSetArr[this.J].setInterpolator(timeInterpolator);
        animatorSetArr[this.J].start();
    }

    public final void w1(final boolean z10, final boolean z11, boolean z12) {
        boolean[] zArr = this.i0;
        if (z11 && zArr[this.J] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a00(this, z10, z11, z12, 1));
            return;
        }
        final int i10 = this.J;
        boolean z13 = i10 == 0;
        boolean[] zArr2 = this.k0;
        if (z12 || z13) {
            zArr2[i10] = false;
            zArr[i10] = z10;
        } else {
            zArr[i10] = z10;
            if (z11) {
                boolean z14 = zArr2[i10];
                Runnable[] runnableArr = this.j0;
                if (z14) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i10]);
                    zArr2[this.J] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.nd0
                        @Override // java.lang.Runnable
                        public final void run() {
                            xg0 xg0Var = xg0.this;
                            int i11 = xg0Var.J;
                            xg0Var.J = i10;
                            xg0Var.w1(z10, z11, true);
                            xg0Var.J = i11;
                        }
                    };
                    runnableArr[i10] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    zArr2[this.J] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.N.f(z10, z11);
            return;
        }
        if (z11) {
            this.L = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            ofFloat.addListener(new org.telegram.ui.Components.yo(27, this, z10));
            ofFloat.addUpdateListener(new jd0(this, 2));
            this.L.playTogether(ofFloat);
            this.L.setDuration(150L);
            this.L.start();
            return;
        }
        if (z10) {
            this.V.setVisibility(0);
            this.V.setScaleX(1.0f);
            this.V.setScaleY(1.0f);
            this.V.setAlpha(1.0f);
            return;
        }
        this.V.setTag(null);
        this.V.setVisibility(4);
        this.V.setScaleX(0.1f);
        this.V.setScaleY(0.1f);
        this.V.setAlpha(0.0f);
    }

    public final void x1(boolean z10, boolean z11) {
        if (z10 == this.r0) {
            return;
        }
        kd0 kd0Var = this.s0;
        if (kd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kd0Var);
            this.s0 = null;
        }
        this.r0 = z10;
        this.W.clearAnimation();
        if (z11) {
            this.W.setVisibility(0);
            this.W.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new org.telegram.ui.Components.bs0(6, this, z10)).start();
        } else {
            this.W.setVisibility(z10 ? 0 : 8);
            this.W.setAlpha(z10 ? 1.0f : 0.0f);
        }
    }

    public final void y1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        ImageView imageView = this.U;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ImageView imageView2 = this.U;
        int i11 = org.telegram.ui.ActionBar.j6.i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, -1));
        this.X.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.W.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, -1));
        RadialProgressView radialProgressView = this.V;
        int i12 = org.telegram.ui.ActionBar.j6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.N.g();
        this.M.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
        this.M.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        for (org.telegram.ui.Components.fw0 fw0Var : this.b) {
            fw0Var.n();
        }
        org.telegram.ui.Components.as asVar = this.c;
        asVar.a.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i13 = 0;
        while (true) {
            View[] viewArr = asVar.c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                view.setBackground(org.telegram.ui.Components.as.a(i13));
                if (view instanceof org.telegram.ui.Components.zr) {
                    org.telegram.ui.Components.zr zrVar = (org.telegram.ui.Components.zr) view;
                    zrVar.a.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                    zrVar.b.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
                }
            }
            i13++;
        }
        kg0 kg0Var = this.b0;
        if (kg0Var != null) {
            int i14 = kg0.E;
            kg0Var.b();
        }
    }

    public final void z1(boolean z10, boolean z11) {
        if (this.X == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.q0 != connectionState || z11) {
            this.q0 = connectionState;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            boolean z12 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i10 = this.q0;
            boolean z13 = i10 == 3 || i10 == 5;
            boolean z14 = i10 == 1 || i10 == 2 || i10 == 4;
            if (z12) {
                this.X.b(true, z13, z10);
                x1(true, z10);
                return;
            }
            if ((!getMessagesController().blockedCountry || SharedConfig.proxyList.isEmpty()) && !z14) {
                x1(false, z10);
                return;
            }
            this.X.b(true, z13, z10);
            if (this.r0) {
                return;
            }
            kd0 kd0Var = this.s0;
            if (kd0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(kd0Var);
            }
            this.r0 = true;
            kd0 kd0Var2 = new kd0(this, 0);
            this.s0 = kd0Var2;
            AndroidUtilities.runOnUIThread(kd0Var2, 5000L);
        }
    }

    public xg0(int i10) {
        super(null);
        this.b = new org.telegram.ui.Components.fw0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = true;
        this.w = true;
        this.y = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.a0 = false;
        this.i0 = new boolean[2];
        this.j0 = new Runnable[2];
        this.k0 = new boolean[2];
        this.currentAccount = i10;
        this.x = true;
    }
}
