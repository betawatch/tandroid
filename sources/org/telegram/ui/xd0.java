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
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xd0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static final int z0;
    public boolean E;
    public boolean F;
    public int G;
    public String H;
    public Bundle I;
    public TLRPC.TL_auth_sentCode J;
    public int K;
    public final AnimatorSet[] L;
    public AnimatorSet M;
    public org.telegram.ui.Components.n11 N;
    public org.telegram.ui.Components.l00 O;
    public k4.j P;
    public int Q;
    public final boolean[] R;
    public org.telegram.ui.ActionBar.s1 S;
    public ai.h5 T;
    public nd0 U;
    public ImageView V;
    public RadialProgressView W;
    public ImageView X;
    public org.telegram.ui.Components.lg0 Y;
    public LinearLayout Z;
    public int a;
    public l0 a0;
    public final org.telegram.ui.Components.vt0[] b;
    public boolean b0;
    public org.telegram.ui.Components.br c;
    public md0 c0;
    public ValueAnimator d;
    public boolean d0;
    public boolean e;
    public Runnable e0;
    public boolean f;
    public au f0;
    public TextView g0;
    public Dialog h;
    public boolean h0;
    public boolean i0;
    public final boolean[] j0;
    public final Runnable[] k0;
    public final boolean[] l0;
    public boolean m0;
    public Dialog n;
    public View n0;
    public boolean o0;
    public pp p0;
    public boolean q0;
    public final ArrayList r;
    public TLRPC.TL_help_termsOfService r0;
    public final ArrayList s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public boolean w;
    public int w0;
    public boolean x;
    public boolean x0;
    public boolean y;
    public ma0 y0;

    static {
        z0 = org.telegram.messenger.az.o() <= 1 ? org.telegram.messenger.hs.g2 : 100;
    }

    public xd0() {
        super(null);
        this.b = new org.telegram.ui.Components.vt0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.E = true;
        this.F = false;
        this.G = 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.b0 = false;
        this.j0 = new boolean[2];
        this.k0 = new Runnable[2];
        this.l0 = new boolean[2];
    }

    public static void A1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a1.g.C(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a1.g.C(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a1.g.C(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                A1((Bundle) obj, editor, str2);
            }
        }
    }

    public static void Z(xd0 xd0Var, String str, String str2, String str3) {
        xd0Var.w1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(xd0Var.currentAccount).sendRequest(deleteaccount, new ai.q1(xd0Var, str, str2, str3, 14), 10);
    }

    public static /* synthetic */ void a0(xd0 xd0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            org.telegram.messenger.a8.b("Resend firebase sms because integrity token = null");
            xd0Var.B1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(xd0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new sa0(1, bundle, auth_sentcode, xd0Var, z10), 10);
    }

    public static boolean a1(xd0 xd0Var, View view) {
        if (xd0Var.q1()) {
            return true;
        }
        return org.telegram.messenger.g0.K3(view);
    }

    public static void b0(xd0 xd0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        xd0Var.t1(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                xd0Var.D1(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            xd0Var.D1(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131746125, "ResetAccountCancelledAlert"));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(xd0Var.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        xd0Var.D1(8, true, bundle2, false);
    }

    public static void b1(xd0 xd0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.G3(3.5f, view, null);
        if (z10 && (view instanceof org.telegram.ui.Components.gb0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.gb0 gb0Var = (org.telegram.ui.Components.gb0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = gb0Var.getAttachedEditText();
            ai.a0 a0Var = new ai.a0(attachedEditText, atomicReference, false, 12);
            gb0Var.a(1.0f);
            org.telegram.ui.Components.v60 v60Var = new org.telegram.ui.Components.v60(gb0Var, view, attachedEditText, a0Var, 22);
            atomicReference.set(v60Var);
            view.postDelayed(v60Var, 2000L);
            view.setTag(R.id.timeout_callback, v60Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(a0Var);
            }
        }
    }

    public static void c0(xd0 xd0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, o8.d dVar) {
        o8.e eVar = ((d8.d) ((com.google.android.gms.common.api.q) dVar.a)).b;
        String str2 = eVar == null ? null : eVar.a;
        if (str2 == null) {
            org.telegram.messenger.a8.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            xd0Var.B1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] split = str2.split("\\.");
        if (split.length <= 0) {
            org.telegram.messenger.a8.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            xd0Var.B1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (optBoolean && optBoolean2) {
                    ConnectionsManager.getInstance(xd0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new sa0(0, bundle, auth_sentcode, xd0Var, z10), 10);
                    return;
                }
                if (!optBoolean && !optBoolean2) {
                    org.telegram.messenger.a8.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                    xd0Var.B1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                } else if (!optBoolean) {
                    org.telegram.messenger.a8.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                    xd0Var.B1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                } else {
                    if (optBoolean2) {
                        return;
                    }
                    org.telegram.messenger.a8.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    xd0Var.B1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                }
            } catch (JSONException e10) {
                e = e10;
                org.telegram.messenger.a8.g(e, true);
                org.telegram.messenger.a8.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                xd0Var.B1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    public static HashSet c1(xd0 xd0Var) {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            SubscriptionManager from = SubscriptionManager.from(xd0Var.getParentActivity());
            List<SubscriptionInfo> completeActiveSubscriptionInfoList = i3 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
            if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i3 >= 28) {
                completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList != null) {
                for (int i10 = 0; i10 < completeActiveSubscriptionInfoList.size(); i10++) {
                    String number = completeActiveSubscriptionInfoList.get(i10).getNumber();
                    if (!TextUtils.isEmpty(number)) {
                        hashSet.add(number);
                    }
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        return hashSet;
    }

    public static void l1(ImageView imageView, int i3, int i10, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i3 != i10 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i3, mode));
            }
        }
    }

    public static void m1(ImageView imageView, int i3, int i10) {
        if (imageView == null) {
            return;
        }
        Drawable background = imageView.getBackground();
        if (background == null) {
            imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(i3, 1, -1));
        } else if (i3 != i10) {
            org.telegram.ui.ActionBar.k6.H1(background, i3, true);
        }
    }

    public static String o1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(simpleName);
            l10.append(exc.getMessage());
            simpleName = l10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static void s0(xd0 xd0Var, String str, String str2, String str3) {
        if (xd0Var.W.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131746107, "ResetMyAccountWarningText");
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.U = M0;
        s1Var.S = org.telegram.messenger.bd.M0(2131746109, "ResetMyAccountWarning");
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746108, "ResetMyAccountWarningReset"), new a1.d(xd0Var, str, str2, str3, 15));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
        xd0Var.showDialog(s1Var);
    }

    public static Bundle s1(int i3, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            Context context = org.telegram.messenger.t0.b;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            sb2.append(z10 ? "_" + i3 : "");
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    public static void v1(org.telegram.ui.ActionBar.d2 d2Var, String str, k4.j jVar, boolean z10) {
        List list;
        if (d2Var == null || d2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        if (z10) {
            s1Var.S = org.telegram.messenger.bd.M0(2131746081, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131753725, "BannedPhoneNumber");
        } else if (jVar == null || (list = (List) jVar.a) == null || list.isEmpty() || ((ks) jVar.b) == null) {
            s1Var.S = org.telegram.messenger.bd.M0(2131746081, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131749187, null);
        } else {
            Iterator it = ((List) jVar.a).iterator();
            int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i3) {
                    i3 = length;
                }
            }
            if (mf.b.d(str, false).length() - ((ks) jVar.b).c.length() < i3) {
                s1Var.S = org.telegram.messenger.bd.M0(2131742867, null);
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("ShortNumberInfo", null, 2131745366, ((ks) jVar.b).a, (String) jVar.c));
            } else {
                s1Var.S = org.telegram.messenger.bd.M0(2131746081, null);
                s1Var.U = org.telegram.messenger.bd.M0(2131749187, null);
            }
        }
        alertDialog$Builder.i(org.telegram.messenger.bd.M0(2131753061, "BotHelp"), new ci.l3(str, d2Var, z10));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), null);
        d2Var.showDialog(s1Var);
    }

    public final void B1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.q0) {
            t1(false, true);
            this.q0 = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new xy(10, this, bundle), 10);
        }
    }

    public final void C1(boolean z10, boolean z11) {
        if (this.b0 == z10 && z11) {
            return;
        }
        this.b0 = z10;
        int i3 = 0;
        if (org.telegram.messenger.g0.C1()) {
            z10 = false;
        }
        int i10 = 2;
        if (!z10) {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
            if (!z11) {
                this.c.setVisibility(8);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration;
            duration.setInterpolator(org.telegram.ui.Components.ks.e);
            this.d.addUpdateListener(new na0(this, i3));
            this.d.addListener(new ya0(this, 1));
            this.d.start();
            return;
        }
        org.telegram.messenger.g0.v1(this.fragmentView);
        org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        if (!z11) {
            this.c.setVisibility(0);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.d = duration2;
        duration2.setInterpolator(org.telegram.ui.Components.xq.f);
        this.d.addUpdateListener(new na0(this, i10));
        this.d.addListener(new ya0(this, i3));
        this.d.start();
    }

    public final void D1(int i3, boolean z10, Bundle bundle, boolean z11) {
        boolean z12 = i3 == 0 || i3 == 5 || i3 == 6 || i3 == 9 || i3 == 10 || i3 == 12 || i3 == 17 || i3 == 16;
        if (i3 == this.a) {
            z10 = false;
        }
        if (z12) {
            if (i3 == 0) {
                this.w = true;
                this.x = true;
            }
            this.K = 1;
            E1(false, z10);
            F1(false, z10, false);
            this.K = 0;
            F1(false, z10, false);
            if (!z10) {
                E1(true, false);
            }
        } else {
            this.K = 0;
            E1(false, z10);
            F1(false, z10, false);
            if (i3 != 8) {
                this.K = 1;
            }
        }
        org.telegram.ui.Components.vt0[] vt0VarArr = this.b;
        if (!z10) {
            this.V.setVisibility((vt0VarArr[i3].b() || this.y) ? 0 : 8);
            vt0VarArr[this.a].setVisibility(8);
            vt0VarArr[this.a].g();
            this.a = i3;
            vt0VarArr[i3].m(bundle, false);
            vt0VarArr[i3].setVisibility(0);
            setParentActivityTitle(vt0VarArr[i3].getHeaderName());
            vt0VarArr[i3].j();
            C1(vt0VarArr[i3].a(), false);
            return;
        }
        org.telegram.ui.Components.vt0 vt0Var = vt0VarArr[this.a];
        org.telegram.ui.Components.vt0 vt0Var2 = vt0VarArr[i3];
        this.a = i3;
        this.V.setVisibility((vt0Var2.b() || this.y) ? 0 : 8);
        vt0Var2.m(bundle, false);
        setParentActivityTitle(vt0Var2.getHeaderName());
        vt0Var2.j();
        int i10 = org.telegram.messenger.g0.q.x;
        if (z11) {
            i10 = -i10;
        }
        vt0Var2.setX(i10);
        vt0Var2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new androidx.fragment.app.g(this, z12, vt0Var, 11));
        Property property = View.TRANSLATION_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(vt0Var, (Property<org.telegram.ui.Components.vt0, Float>) property, z11 ? org.telegram.messenger.g0.q.x : -org.telegram.messenger.g0.q.x), ObjectAnimator.ofFloat(vt0Var2, (Property<org.telegram.ui.Components.vt0, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        C1(vt0Var2.a(), true);
    }

    public final void E1(boolean z10, boolean z11) {
        TimeInterpolator timeInterpolator;
        int i3 = this.K;
        boolean z12 = i3 == 0;
        boolean[] zArr = this.R;
        if (zArr[i3] == z10) {
            return;
        }
        AnimatorSet[] animatorSetArr = this.L;
        AnimatorSet animatorSet = animatorSetArr[i3];
        if (animatorSet != null) {
            if (z11) {
                animatorSet.removeAllListeners();
            }
            animatorSetArr[this.K].cancel();
        }
        int i10 = this.K;
        zArr[i10] = z10;
        if (!z11) {
            if (z12) {
                this.O.e(z10, z11);
                return;
            }
            return;
        }
        animatorSetArr[i10] = new AnimatorSet();
        if (z12) {
            this.O.e(z10, z11);
        }
        animatorSetArr[this.K].addListener(new org.telegram.ui.ActionBar.g(this, z12, z10, 4));
        int i11 = org.telegram.messenger.hs.g2;
        if (!z12) {
            timeInterpolator = null;
        } else if (z10) {
            timeInterpolator = org.telegram.messenger.g0.F;
            i11 = org.telegram.messenger.hs.e3;
        } else {
            timeInterpolator = org.telegram.messenger.g0.G;
        }
        animatorSetArr[this.K].setDuration(i11);
        animatorSetArr[this.K].setInterpolator(timeInterpolator);
        animatorSetArr[this.K].start();
    }

    public final void F1(final boolean z10, final boolean z11, boolean z12) {
        boolean[] zArr = this.j0;
        if (z11 && zArr[this.K] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ny(this, z10, z11, z12, 1));
            return;
        }
        final int i3 = this.K;
        int i10 = 1;
        boolean z13 = i3 == 0;
        boolean[] zArr2 = this.l0;
        if (z12 || z13) {
            zArr2[i3] = false;
            zArr[i3] = z10;
        } else {
            zArr[i3] = z10;
            if (z11) {
                boolean z14 = zArr2[i3];
                Runnable[] runnableArr = this.k0;
                if (z14) {
                    org.telegram.messenger.g0.r(runnableArr[i3]);
                    zArr2[this.K] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.oa0
                        @Override // java.lang.Runnable
                        public final void run() {
                            xd0 xd0Var = xd0.this;
                            int i11 = xd0Var.K;
                            xd0Var.K = i3;
                            xd0Var.F1(z10, z11, true);
                            xd0Var.K = i11;
                        }
                    };
                    runnableArr[i3] = runnable;
                    org.telegram.messenger.g0.i3(runnable, 2000L);
                    zArr2[this.K] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.O.f(z10, z11);
            return;
        }
        if (z11) {
            this.M = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            ofFloat.addListener(new u40(i10, this, z10));
            ofFloat.addUpdateListener(new na0(this, i10));
            this.M.playTogether(ofFloat);
            this.M.setDuration(150L);
            this.M.start();
            return;
        }
        if (z10) {
            this.W.setVisibility(0);
            this.W.setScaleX(1.0f);
            this.W.setScaleY(1.0f);
            this.W.setAlpha(1.0f);
            return;
        }
        this.W.setTag(null);
        this.W.setVisibility(4);
        this.W.setScaleX(0.1f);
        this.W.setScaleY(0.1f);
        this.W.setAlpha(0.0f);
    }

    public final void G1(boolean z10, boolean z11) {
        if (z10 == this.x0) {
            return;
        }
        ma0 ma0Var = this.y0;
        if (ma0Var != null) {
            org.telegram.messenger.g0.r(ma0Var);
            this.y0 = null;
        }
        this.x0 = z10;
        this.X.clearAnimation();
        if (z11) {
            this.X.setVisibility(0);
            this.X.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new org.telegram.ui.Components.up0(9, this, z10)).start();
        } else {
            this.X.setVisibility(z10 ? 0 : 8);
            this.X.setAlpha(z10 ? 1.0f : 0.0f);
        }
    }

    public final void H1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        ImageView imageView = this.V;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        l1(imageView, x02, this.s0, PorterDuff.Mode.SRC_ATOP);
        this.s0 = x02;
        ImageView imageView2 = this.V;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        m1(imageView2, x03, this.t0);
        this.t0 = x03;
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        if (x04 != this.u0 || this.Y.getColorFilter() == null) {
            this.Y.setColorFilter(new PorterDuffColorFilter(x04, PorterDuff.Mode.SRC_IN));
            this.u0 = x04;
        }
        ImageView imageView3 = this.X;
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        m1(imageView3, x05, this.v0);
        this.v0 = x05;
        RadialProgressView radialProgressView = this.W;
        int i11 = org.telegram.ui.ActionBar.k6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.O.updateColors();
        this.N.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.N.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        for (org.telegram.ui.Components.vt0 vt0Var : this.b) {
            vt0Var.updateColors();
        }
        org.telegram.ui.Components.br brVar = this.c;
        org.telegram.ui.Components.zq zqVar = brVar.a;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        if (x06 != brVar.s || zqVar.getColorFilter() == null) {
            brVar.s = x06;
            zqVar.setColorFilter(x06, PorterDuff.Mode.SRC_ATOP);
        }
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
        int o10 = i0.a.o(x07, 30);
        boolean z10 = x07 != brVar.w;
        brVar.w = x07;
        int i12 = 0;
        while (true) {
            View[] viewArr = brVar.c;
            if (i12 >= viewArr.length) {
                break;
            }
            View view = viewArr[i12];
            if (view != null) {
                if (view.getBackground() == null) {
                    org.telegram.ui.Components.br.a(i12, view);
                } else if (z10) {
                    org.telegram.ui.ActionBar.k6.H1(view.getBackground(), x07, false);
                    org.telegram.ui.ActionBar.k6.H1(view.getBackground(), o10, true);
                }
                if (view instanceof org.telegram.ui.Components.ar) {
                    ((org.telegram.ui.Components.ar) view).updateColors();
                }
            }
            i12++;
        }
        md0 md0Var = this.c0;
        if (md0Var != null) {
            int i13 = md0.G;
            md0Var.b();
        }
    }

    public final void I1(boolean z10, boolean z11) {
        if (this.Y == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.w0 != connectionState || z11) {
            this.w0 = connectionState;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
            boolean z12 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i3 = this.w0;
            boolean z13 = i3 == 3 || i3 == 5;
            boolean z14 = i3 == 1 || i3 == 2 || i3 == 4;
            if (z12) {
                this.Y.b(true, z13, z10);
                G1(true, z10);
                return;
            }
            if ((!getMessagesController().z3 || org.telegram.messenger.az.z1.isEmpty()) && !z14) {
                G1(false, z10);
                return;
            }
            this.Y.b(true, z13, z10);
            if (this.x0) {
                return;
            }
            ma0 ma0Var = this.y0;
            if (ma0Var != null) {
                org.telegram.messenger.g0.r(ma0Var);
            }
            this.x0 = true;
            ma0 ma0Var2 = new ma0(this, 1);
            this.y0 = ma0Var2;
            org.telegram.messenger.g0.i3(ma0Var2, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.o0) {
                this.n0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.o0) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x043b, code lost:
    
        if (r1 != 4) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0435 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r8v68 */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        int i3;
        View view = this.n0;
        if (view != null) {
            this.fragmentView = view;
            this.n0 = null;
            return view;
        }
        final int i10 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 14));
        this.K = 0;
        boolean[] zArr = this.R;
        ?? r5 = 1;
        ?? r52 = 1;
        zArr[0] = true;
        zArr[1] = false;
        ai.h5 h5Var = new ai.h5(8, context, this);
        this.T = h5Var;
        h5Var.setDelegate(new ua0(i10, this));
        this.fragmentView = this.T;
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this, context, 3);
        k1Var.setFillViewport(true);
        this.T.addView(k1Var, b8.mf.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        k1Var.addView(this.Z, b8.mf.x(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m);
        this.Z.addView(space);
        l0 l0Var = new l0(13, context, this);
        this.a0 = l0Var;
        this.Z.addView(l0Var, b8.mf.l(1.0f, -1, 0));
        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(context);
        this.c = brVar;
        brVar.setViewToFindFocus(this.a0);
        this.Z.addView(this.c, b8.mf.o(-1, org.telegram.messenger.hs.G3));
        wd0 wd0Var = new wd0(this, context);
        org.telegram.ui.Components.vt0[] vt0VarArr = this.b;
        vt0VarArr[0] = wd0Var;
        vt0VarArr[1] = new dd0(this, context, 1);
        final int i11 = 2;
        vt0VarArr[2] = new dd0(this, context, 2);
        vt0VarArr[3] = new dd0(this, context, 3);
        vt0VarArr[4] = new dd0(this, context, 4);
        vt0VarArr[5] = new nc0(this, context);
        int i12 = 6;
        vt0VarArr[6] = new vb0(this, context);
        vt0VarArr[7] = new fc0(this, context);
        vt0VarArr[8] = new oc0(this, context);
        vt0VarArr[9] = new qb0(this, context, 0);
        vt0VarArr[10] = new qb0(this, context, 1);
        vt0VarArr[11] = new dd0(this, context, 11);
        vt0VarArr[12] = new qc0(this, context);
        vt0VarArr[13] = new lb0(this, context, true);
        vt0VarArr[14] = new lb0(this, context, false);
        vt0VarArr[15] = new dd0(this, context, 15);
        vt0VarArr[16] = new cc0(this, context, 16);
        vt0VarArr[17] = new cc0(this, context, 17);
        int i13 = 18;
        vt0VarArr[18] = new id0(this, context);
        int i14 = 0;
        while (i14 < vt0VarArr.length) {
            vt0VarArr[i14].setVisibility(i14 == 0 ? 0 : 8);
            this.a0.addView(vt0VarArr[i14], b8.mf.d(-1, -1.0f, 17, org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f, (i14 != i13) != false ? 30.0f : 0.0f, org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f, 0.0f));
            i14++;
            i13 = 18;
        }
        Bundle s12 = this.G == 0 ? s1(this.currentAccount, this.y) : null;
        if (s12 != null && ((i3 = s12.getInt("currentViewNum", 0)) < 0 || i3 >= vt0VarArr.length)) {
            s12 = null;
        }
        if (s12 != null) {
            this.a = s12.getInt("currentViewNum", 0);
            this.E = s12.getInt("syncContacts", 1) == 1;
            int i15 = this.a;
            if (i15 >= 1 && i15 <= 4) {
                int i16 = s12.getInt("open");
                if (i16 != 0 && Math.abs((System.currentTimeMillis() / 1000) - i16) >= 86400) {
                    this.a = 0;
                    n1();
                    s12 = null;
                }
            } else if (i15 == 6) {
                if (((vb0) vt0VarArr[6]).n == null) {
                    this.a = 0;
                    n1();
                    s12 = null;
                }
            } else if (i15 == 7 && ((fc0) vt0VarArr[7]).h == null) {
                this.a = 0;
                n1();
                s12 = null;
            }
        }
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.O = l00Var;
        l00Var.e(zArr[0], false);
        this.P = new k4.j(this.O);
        this.T.addView(this.O, b8.mf.d(56, 56.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.va0
            public final /* synthetic */ xd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.y1();
                        break;
                    case 1:
                        xd0 xd0Var = this.b;
                        if (xd0Var.onBackPressed(true)) {
                            xd0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        xd0 xd0Var2 = this.b;
                        au auVar = xd0Var2.f0;
                        if (auVar != null) {
                            auVar.run();
                        }
                        xd0Var2.finishFragment();
                        break;
                    default:
                        xd0 xd0Var3 = this.b;
                        xd0Var3.getClass();
                        xd0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((q1.g) this.P.b).b(new wa0(this, i10));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.V;
        final ?? r53 = r52 == true ? 1 : 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.va0
            public final /* synthetic */ xd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (r53) {
                    case 0:
                        this.b.y1();
                        break;
                    case 1:
                        xd0 xd0Var = this.b;
                        if (xd0Var.onBackPressed(true)) {
                            xd0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        xd0 xd0Var2 = this.b;
                        au auVar = xd0Var2.f0;
                        if (auVar != null) {
                            auVar.run();
                        }
                        xd0Var2.finishFragment();
                        break;
                    default:
                        xd0 xd0Var3 = this.b;
                        xd0Var3.getClass();
                        xd0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.V.setContentDescription(org.telegram.messenger.bd.M0(2131754878, null));
        int L = org.telegram.messenger.g0.L(4.0f);
        this.V.setPadding(L, L, L, L);
        this.T.addView(this.V, b8.mf.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.f0 != null && !this.h0 && this.i0) {
            TextView textView = new TextView(context);
            this.g0 = textView;
            textView.setGravity(19);
            this.g0.setTextSize(1, 15.0f);
            this.g0.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            this.g0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.g0.setText(org.telegram.messenger.bd.M0(2131742827, null));
            org.telegram.ui.ActionBar.r6.V(this.g0, org.telegram.ui.ActionBar.k6.q6, null);
            this.T.addView(this.g0, b8.mf.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            this.g0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.va0
                public final /* synthetic */ xd0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            this.b.y1();
                            break;
                        case 1:
                            xd0 xd0Var = this.b;
                            if (xd0Var.onBackPressed(true)) {
                                xd0Var.finishFragment();
                                break;
                            }
                            break;
                        case 2:
                            xd0 xd0Var2 = this.b;
                            au auVar = xd0Var2.f0;
                            if (auVar != null) {
                                auVar.run();
                            }
                            xd0Var2.finishFragment();
                            break;
                        default:
                            xd0 xd0Var3 = this.b;
                            xd0Var3.getClass();
                            xd0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
        }
        ?? imageView3 = new ImageView(context);
        this.X = imageView3;
        org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(context);
        this.Y = lg0Var;
        imageView3.setImageDrawable(lg0Var);
        final int i17 = 3;
        this.X.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.va0
            public final /* synthetic */ xd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.b.y1();
                        break;
                    case 1:
                        xd0 xd0Var = this.b;
                        if (xd0Var.onBackPressed(true)) {
                            xd0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        xd0 xd0Var2 = this.b;
                        au auVar = xd0Var2.f0;
                        if (auVar != null) {
                            auVar.run();
                        }
                        xd0Var2.finishFragment();
                        break;
                    default:
                        xd0 xd0Var3 = this.b;
                        xd0Var3.getClass();
                        xd0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.X.setAlpha(0.0f);
        this.X.setVisibility(8);
        this.T.addView(this.X, b8.mf.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        I1(false, true);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.W = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
        this.W.setAlpha(0.0f);
        this.W.setScaleX(0.1f);
        this.W.setScaleY(0.1f);
        this.T.addView(this.W, b8.mf.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.n11 n11Var = new org.telegram.ui.Components.n11(context);
        this.N = n11Var;
        n11Var.setTransformType(0);
        this.N.setProgress(1.0f);
        this.N.setDrawBackground(false);
        this.O.setContentDescription(org.telegram.messenger.bd.M0(2131751355, null));
        this.O.addView(this.N, b8.mf.e(56, 56, 17));
        this.O.a(this.N);
        if (s12 != null) {
            this.f = true;
        }
        int i18 = 0;
        while (i18 < vt0VarArr.length) {
            org.telegram.ui.Components.vt0 vt0Var = vt0VarArr[i18];
            if (s12 != null) {
                if (i18 < r5 || i18 > 4) {
                    vt0Var.k(s12);
                } else if (i18 == this.a) {
                    vt0Var.k(s12);
                }
            }
            if (this.a == i18) {
                this.V.setVisibility((vt0Var.b() || this.y || this.G == 2) ? 0 : 8);
                vt0Var.setVisibility(0);
                vt0Var.j();
                C1(vt0Var.a(), false);
                this.K = 0;
                if (i18 != 0 && i18 != 5 && i18 != i12) {
                    if (i18 != 9) {
                        if (i18 != 10 && i18 != 12) {
                            z10 = false;
                            E1(z10, false);
                            if (i18 == r5 && i18 != 2) {
                                if (i18 != 3) {
                                }
                            }
                            this.K = r5;
                        }
                        z10 = r5;
                        E1(z10, false);
                        if (i18 == r5) {
                        }
                        this.K = r5;
                    }
                }
                z10 = r5;
                E1(z10, false);
                if (i18 == r5) {
                }
                this.K = r5;
            } else if (vt0Var.getVisibility() != 8) {
                vt0Var.setVisibility(8);
                vt0Var.g();
            }
            i18++;
            r5 = 1;
            i12 = 6;
        }
        this.f = false;
        H1();
        if (r1()) {
            p1(this.I, this.J, false);
        }
        pp ppVar = this.p0;
        if (ppVar != null) {
            this.p0 = null;
            ppVar.run();
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T1) {
            I1(true, false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.s1 && this.i0) {
            org.telegram.messenger.hp messagesController = getMessagesController();
            if (messagesController.T3.contains("SETUP_LOGIN_EMAIL") || messagesController.T3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(11, this), org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.D6, org.telegram.ui.ActionBar.k6.H6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.O9, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.y6, org.telegram.ui.ActionBar.k6.i7, org.telegram.ui.ActionBar.k6.q6, org.telegram.ui.ActionBar.k6.Ki, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.J6, org.telegram.ui.ActionBar.k6.Y6, org.telegram.ui.ActionBar.k6.W6, org.telegram.ui.ActionBar.k6.X6, org.telegram.ui.ActionBar.k6.h5, org.telegram.ui.ActionBar.k6.q5, org.telegram.ui.ActionBar.k6.j5);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.i0;
    }

    public final void n1() {
        String str;
        Context context = org.telegram.messenger.t0.b;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.y) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        nc0 nc0Var = (nc0) this.b[5];
        if (nc0Var != null) {
            nc0Var.M.h(i3, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (!this.i0 || this.a != 12) {
            int i3 = this.a;
            org.telegram.ui.Components.vt0[] vt0VarArr = this.b;
            if (i3 == 0 || (this.G == 3 && i3 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.vt0 vt0Var : vt0VarArr) {
                        if (vt0Var != null) {
                            vt0Var.f();
                        }
                    }
                    n1();
                }
                return true;
            }
            if (i3 == 6) {
                if (z10) {
                    vt0VarArr[i3].c(true);
                    D1(0, true, null, true);
                    return false;
                }
            } else if (i3 == 7 || i3 == 8) {
                if (z10) {
                    vt0VarArr[i3].c(true);
                    D1(6, true, null, true);
                }
            } else if ((i3 >= 1 && i3 <= 4) || i3 == 11 || i3 == 15) {
                if (z10 && vt0VarArr[i3].c(false)) {
                    D1(0, true, null, true);
                    return false;
                }
            } else if (i3 == 5) {
                if (z10) {
                    ((nc0) vt0VarArr[i3]).x.callOnClick();
                    return false;
                }
            } else if (i3 == 9) {
                if (z10) {
                    vt0VarArr[i3].c(true);
                    D1(7, true, null, true);
                    return false;
                }
            } else if (i3 == 10) {
                if (z10) {
                    vt0VarArr[i3].c(true);
                    D1(9, true, null, true);
                    return false;
                }
            } else if (i3 == 13) {
                if (z10) {
                    vt0VarArr[i3].c(true);
                    D1(12, true, null, true);
                    return false;
                }
            } else if (z10 && vt0VarArr[i3].c(true)) {
                D1(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        C1(this.b[this.a].a(), false);
        md0 md0Var = this.c0;
        if (md0Var != null) {
            int i3 = md0.G;
            md0Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onDialogDismiss(Dialog dialog) {
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
                org.telegram.messenger.g0.i3(new ma0(this, 0), 200L);
                getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.T1);
        getNotificationCenter().c(this, org.telegram.messenger.hs.s1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i3 = 0;
        while (true) {
            org.telegram.ui.Components.vt0[] vt0VarArr = this.b;
            if (i3 >= vt0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.vt0 vt0Var = vt0VarArr[i3];
            if (vt0Var != null) {
                vt0Var.f();
            }
            i3++;
        }
        org.telegram.ui.ActionBar.s1 s1Var = this.S;
        if (s1Var != null) {
            s1Var.dismiss();
            this.S = null;
        }
        for (Runnable runnable : this.k0) {
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.hs.T1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.s1);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z10 = iArr[0] == 0;
        org.telegram.ui.Components.vt0[] vt0VarArr = this.b;
        if (i3 == 6) {
            this.w = false;
            int i10 = this.a;
            if (i10 == 0) {
                org.telegram.ui.Components.vt0 vt0Var = vt0VarArr[i10];
                ((wd0) vt0Var).O = true;
                vt0Var.h(null);
                return;
            }
            return;
        }
        if (i3 == 7) {
            this.x = false;
            int i11 = this.a;
            if (i11 == 0) {
                ((wd0) vt0VarArr[i11]).o();
                return;
            }
            return;
        }
        if (i3 == 20) {
            if (z10) {
                ((nc0) vt0VarArr[5]).M.l();
            }
        } else if (i3 == 151 && z10) {
            nc0 nc0Var = (nc0) vt0VarArr[5];
            nc0Var.post(new xa0(nc0Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        org.telegram.ui.Components.vt0 vt0Var;
        int i3;
        org.telegram.ui.Components.vt0[] vt0VarArr = this.b;
        super.onResume();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i10 = this.a;
            if (i10 >= 1 && i10 <= 4) {
                org.telegram.ui.Components.vt0 vt0Var2 = vt0VarArr[i10];
                if ((vt0Var2 instanceof dd0) && (i3 = ((dd0) vt0Var2).W) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i3) >= 86400) {
                    vt0VarArr[this.a].c(true);
                    D1(0, false, null, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        int i11 = this.a;
        if (i11 == 0 && !this.d0 && (vt0Var = vt0VarArr[i11]) != null) {
            vt0Var.j();
        }
        if (q1()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        }
        int i12 = this.a;
        if (i12 < 0 || i12 >= vt0VarArr.length) {
            return;
        }
        vt0VarArr[i12].i();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView != null && this.V != null && this.Y != null && this.X != null && this.W != null && this.O != null && this.N != null && this.c != null) {
                for (org.telegram.ui.Components.vt0 vt0Var : this.b) {
                    if (vt0Var == null) {
                        return;
                    }
                }
                H1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
        final int i3 = 1;
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            D1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        final int i10 = 0;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.q0) {
            if (!org.telegram.messenger.lt.b.hasServices()) {
                org.telegram.messenger.a8.b("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                B1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            w1(0, true);
            this.q0 = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                org.telegram.messenger.a8.b("getting classic integrity with nonce = ".concat(str));
                create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new qa0(this, bundle, auth_sentcode, string, z10)).addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.ra0
                    public final /* synthetic */ xd0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        switch (i10) {
                            case 0:
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + xd0.o1(exc);
                                org.telegram.messenger.a8.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                this.b.B1(bundle, auth_sentcode, str2);
                                break;
                            default:
                                org.telegram.messenger.a8.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + xd0.o1(exc);
                                org.telegram.messenger.a8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.b.B1(bundle, auth_sentcode, str3);
                                break;
                        }
                    }
                });
                return;
            }
            a9.j0 j0Var = new a9.j0(org.telegram.messenger.t0.b, o8.c.a, null, new mb.b(5));
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = org.telegram.messenger.r2.f;
            com.google.android.gms.common.api.internal.n0 n0Var = j0Var.i;
            a9.g0 g0Var = new a9.g0(n0Var, bArr, str2);
            n0Var.b.d(0, g0Var);
            p6.m.m(g0Var, new p6.n(new o8.d())).addOnSuccessListener(new qa0(this, string, auth_sentcode, bundle, z10)).addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.ra0
                public final /* synthetic */ xd0 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    switch (i3) {
                        case 0:
                            String str22 = "PLAYINTEGRITY_EXCEPTION_" + xd0.o1(exc);
                            org.telegram.messenger.a8.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                            this.b.B1(bundle, auth_sentcode, str22);
                            break;
                        default:
                            org.telegram.messenger.a8.g(exc, true);
                            String str3 = "SAFETYNET_EXCEPTION_" + xd0.o1(exc);
                            org.telegram.messenger.a8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                            this.b.B1(bundle, auth_sentcode, str3);
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
            D1(1, z10, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            boolean z11 = org.telegram.messenger.r2.a;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", auth_sentcode.type.length);
            D1(4, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            D1(3, z10, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            D1(2, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            D1(15, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            D1(11, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            D1(12, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            D1(14, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            D1(16, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            D1(17, z10, bundle, false);
        }
    }

    public final boolean q1() {
        return this.b[this.a].a() && !org.telegram.messenger.g0.C1();
    }

    public final boolean r1() {
        return this.G == 1;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.E ? 1 : 0);
            for (int i3 = 0; i3 <= this.a; i3++) {
                org.telegram.ui.Components.vt0 vt0Var = this.b[i3];
                if (vt0Var != null) {
                    vt0Var.l(bundle2);
                }
            }
            Context context = org.telegram.messenger.t0.b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            sb2.append(this.y ? "_" + this.currentAccount : "");
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            A1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void t1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.s1 s1Var;
        if (this.Q != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Q, true);
            }
            this.Q = 0;
        }
        if (r1() && (s1Var = this.S) != null) {
            s1Var.dismiss();
            this.S = null;
        }
        F1(false, z11, false);
    }

    public final void u1(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = str;
        s1Var.U = str2;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), null);
        showDialog(s1Var);
    }

    public final void w1(int i3, boolean z10) {
        if (!r1() || i3 != 0) {
            this.Q = i3;
            F1(true, z10, false);
        } else {
            if (this.S != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
            this.S = s1Var;
            s1Var.j0 = false;
            s1Var.show();
        }
    }

    public final void x1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        org.telegram.messenger.hp.s1(this.currentAccount).Q();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        org.telegram.messenger.h10.i(this.currentAccount).b();
        org.telegram.messenger.hp.s1(this.currentAccount).Q();
        org.telegram.messenger.h10.i(this.currentAccount).V = this.E;
        org.telegram.messenger.h10.i(this.currentAccount).w(tL_auth_authorization.user);
        org.telegram.messenger.h10.i(this.currentAccount).v(true);
        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(this.currentAccount);
        a02.a.c(new org.telegram.messenger.vq(a02, true, 1 == true ? 1 : 0));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        org.telegram.messenger.qr.a0(this.currentAccount).m1(arrayList, null, true, true);
        org.telegram.messenger.hp.s1(this.currentAccount).X3(tL_auth_authorization.user, false, false);
        org.telegram.messenger.g5 r5 = org.telegram.messenger.g5.r(this.currentAccount);
        r5.a = null;
        Utilities.e.c(new org.telegram.messenger.x4(r5, 0));
        Utilities.d.c(new org.telegram.messenger.mj(org.telegram.messenger.hp.s1(this.currentAccount), 26));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        org.telegram.messenger.hp.s1(this.currentAccount).R2(true);
        org.telegram.messenger.hp.s1(this.currentAccount).h3();
        org.telegram.messenger.hp.s1(this.currentAccount).M(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z11 = org.telegram.messenger.r2.a;
            org.telegram.messenger.a8.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b10 = org.telegram.messenger.v0.b();
            if (b10 == null) {
                b10 = new ArrayList();
            }
            b10.add(0, tL_auth_authorization);
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("saved_tokens_login", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences.edit().clear().apply();
            for (int i3 = 0; i3 < Math.min(20, b10.size()); i3++) {
                arrayList2.add((TLRPC.TL_auth_authorization) b10.get(i3));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("count", arrayList2.size());
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i10)).getObjectSize());
                    ((TLRPC.TL_auth_authorization) arrayList2.get(i10)).serializeToStream(serializedData);
                    edit.putString("log_in_token_" + i10, Utilities.f(serializedData.toByteArray()));
                }
                edit.apply();
                BackupAgent.a();
            }
        } else {
            org.telegram.messenger.a8.b("onAuthSuccess future_auth_token is empty");
        }
        if (z10) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.currentAccount);
            s12.c2.put(0, true);
            s12.d2.put(0, true);
        }
        org.telegram.messenger.li.b0(this.currentAccount).c1("tg_placeholders_android", false, true);
        boolean z12 = tL_auth_authorization.setup_password_required;
        int i11 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            org.telegram.messenger.g0.p3(getParentActivity(), false);
        }
        n1();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
                externalActionActivity.d(externalActionActivity.h, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s);
                externalActionActivity.c.a0();
                ActionBarLayout actionBarLayout = externalActionActivity.d;
                if (actionBarLayout != null) {
                    actionBarLayout.a0();
                }
                org.telegram.ui.Components.qt0 qt0Var = externalActionActivity.e;
                if (qt0Var != null) {
                    qt0Var.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 6;
        if (this.y) {
            this.y = false;
            this.o0 = true;
            ((LaunchActivity) getParentActivity()).P0(this.currentAccount, new k2.x(i12, z10));
            this.o0 = false;
            finishFragment();
            return;
        }
        if (z10 && z12) {
            ra1 ra1Var = new ra1(6, null);
            ra1Var.H = i11;
            ra1Var.I = true;
            presentFragment(ra1Var, true);
        } else {
            Bundle k10 = a1.g.k("afterSignup", z10);
            ee0 ee0Var = new ee0();
            ee0Var.r0(k10);
            presentFragment(ee0Var, true);
        }
        org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.j0, new Object[0]);
        org.telegram.messenger.bd.E0().V0(this.currentAccount, true);
        gy0.a0(true);
    }

    public final void y1() {
        if (this.R[this.K]) {
            if (this.W.getTag() == null) {
                this.b[this.a].h(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131744842, "StopLoadingTitle");
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131744843, "StopLoading");
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743223, "WaitMore"), null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131744851, "Stop"), new pa0(this, 0));
            showDialog(s1Var);
        }
    }

    public final void z1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.p0 = new pp(this, str, auth_sentcode, 26);
            return;
        }
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        p1(bundle, auth_sentcode, true);
    }

    public xd0(int i3) {
        super(null);
        this.b = new org.telegram.ui.Components.vt0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.E = true;
        this.F = false;
        this.G = 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.b0 = false;
        this.j0 = new boolean[2];
        this.k0 = new Runnable[2];
        this.l0 = new boolean[2];
        this.currentAccount = i3;
        this.y = true;
    }
}
