// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Point;
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
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qh6 extends e implements fn7 {
    public static final short A0;
    public boolean E;
    public boolean F;
    public byte G;
    public String H;
    public Bundle I;
    public TLRPC.TL_auth_sentCode J;
    public boolean K;
    public final AnimatorSet[] L;
    public AnimatorSet M;
    public w2c N;
    public zp4 O;
    public ko9 P;
    public int Q;
    public final boolean[] R;
    public id S;
    public w81 T;
    public fh6 U;
    public ImageView V;
    public RadialProgressView W;
    public ImageView X;
    public cx8 Y;
    public LinearLayout Z;
    public int a;
    public d26 a0;
    public final cna[] b;
    public boolean b0;
    public k53 c;
    public eh6 c0;
    public ValueAnimator d;
    public boolean d0;
    public boolean e;
    public Runnable e0;
    public boolean f;
    public ch3 f0;
    public TextView g0;
    public Dialog h;
    public boolean h0;
    public boolean i0;
    public final boolean[] j0;
    public final Runnable[] k0;
    public final boolean[] l0;
    public boolean m0;
    public Dialog n;
    public Space n0;
    public View o0;
    public boolean p0;
    public ls5 q0;
    public final ArrayList r;
    public boolean r0;
    public final ArrayList s;
    public TLRPC.TL_help_termsOfService s0;
    public int t0;
    public int u0;
    public int v0;
    public boolean w;
    public int w0;
    public boolean x;
    public int x0;
    public boolean y;
    public boolean y0;
    public ie6 z0;

    static {
        A0 = xea.o() <= 1 ? (short) 150 : (short) 100;
    }

    public qh6(int i) {
        super(null);
        this.b = new cna[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.E = true;
        this.F = false;
        this.G = (byte) 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.b0 = false;
        this.j0 = new boolean[2];
        this.k0 = new Runnable[2];
        this.l0 = new boolean[2];
        this.currentAccount = i;
        this.y = true;
    }

    public static void A1(e eVar, String str, pm3 pm3Var, boolean z) {
        List list;
        if (eVar == null || eVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
        id idVar = alertDialog$Builder.a;
        if (z) {
            idVar.S = ob6.M0(2131745798, null);
            idVar.U = ob6.M0(2131753718, "BannedPhoneNumber");
        } else if (pm3Var == null || (list = (List) pm3Var.d) == null || list.isEmpty() || ((gy2) pm3Var.b) == null) {
            idVar.S = ob6.M0(2131745798, null);
            idVar.U = ob6.M0(2131748933, null);
        } else {
            Iterator it = ((List) pm3Var.d).iterator();
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i) {
                    i = length;
                }
            }
            if (f78.h(str, false).length() - ((gy2) pm3Var.b).c.length() < i) {
                idVar.S = ob6.M0(2131742488, null);
                idVar.U = hl.S2(ob6.a0("ShortNumberInfo", null, 2131745084, ((gy2) pm3Var.b).a, (String) pm3Var.c));
            } else {
                idVar.S = ob6.M0(2131745798, null);
                idVar.U = ob6.M0(2131748933, null);
            }
        }
        alertDialog$Builder.h(ob6.M0(2131753054, "BotHelp"), new bh(str, eVar, z));
        alertDialog$Builder.j(ob6.M0(2131747558, "OK"), null);
        eVar.showDialog(idVar);
    }

    public static void E1(View view, boolean z) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        hl.A3(3.5f, view, null);
        if (z && (view instanceof lu7)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            lu7 lu7Var = (lu7) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = lu7Var.getAttachedEditText();
            ry ryVar = new ry(attachedEditText, atomicReference, false, (byte) 5);
            lu7Var.a(1.0f);
            g65 g65Var = new g65(lu7Var, view, attachedEditText, ryVar, (byte) 15);
            atomicReference.set(g65Var);
            view.postDelayed(g65Var, 2000L);
            view.setTag(R.id.timeout_callback, g65Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(ryVar);
            }
        }
    }

    public static void G1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(qd4.y(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(qd4.y(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(qd4.y(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                G1((Bundle) obj, editor, str2);
            }
        }
    }

    public static void m1(ImageView imageView, int i, int i2, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i != i2 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i, mode));
            }
        }
    }

    public static void n1(ImageView imageView, int i, int i2) {
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            if (background == null) {
                imageView.setBackground(aob.f0(i, 1, -1));
            } else if (i != i2) {
                aob.F1(background, i, true);
            }
        }
    }

    public static String p1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            simpleName = simpleName + exc.getMessage();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle x1(int i, boolean z) {
        try {
            Bundle bundle = new Bundle();
            Context context = a.b;
            String str = z ? "_" + i : "";
            for (Map.Entry<String, ?> entry : context.getSharedPreferences("logininfo2".concat(str), 0).getAll().entrySet()) {
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
            cc4.g(e, true);
            return null;
        }
    }

    public final void B1(int i, boolean z) {
        if (this.G != 1 || i != 0) {
            this.Q = i;
            L1(true, z, false);
        } else {
            if (this.S != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            id idVar = new id(3, null, getParentActivity());
            this.S = idVar;
            idVar.j0 = false;
            idVar.show();
        }
    }

    public final void C1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z) {
        uc7.s1(this.currentAccount).O();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        yac.h(this.currentAccount).b();
        uc7.s1(this.currentAccount).O();
        yac.h(this.currentAccount).V = this.E;
        yac.h(this.currentAccount).v(tL_auth_authorization.user);
        yac.h(this.currentAccount).u(true);
        jf7 Y = jf7.Y(this.currentAccount);
        Y.a.c(new je7(Y, true, 1 == true ? 1 : 0));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        jf7.Y(this.currentAccount).j1(arrayList, null, true, true);
        uc7.s1(this.currentAccount).i4(tL_auth_authorization.user, false, false);
        lv2 r = lv2.r(this.currentAccount);
        r.a = null;
        Utilities.e.c(new pu2(r, (byte) 0));
        Utilities.d.c(new pa7(uc7.s1(this.currentAccount), (byte) 9));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        uc7.s1(this.currentAccount).a3(true);
        uc7.s1(this.currentAccount).p3();
        uc7.s1(this.currentAccount).K(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z2 = f11.a;
            cc4.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b = r40.b();
            if (b == null) {
                b = new ArrayList();
            }
            b.add(0, tL_auth_authorization);
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("saved_tokens_login", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences.edit().clear().apply();
            for (int i = 0; i < Math.min(20, b.size()); i++) {
                arrayList2.add((TLRPC.TL_auth_authorization) b.get(i));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("count", arrayList2.size());
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i2)).getObjectSize());
                    ((TLRPC.TL_auth_authorization) arrayList2.get(i2)).serializeToStream(serializedData);
                    edit.putString("log_in_token_" + i2, Utilities.f(serializedData.toByteArray()));
                }
                edit.apply();
                BackupAgent.a();
            }
        } else {
            cc4.b("onAuthSuccess future_auth_token is empty");
        }
        if (z) {
            uc7 s1 = uc7.s1(this.currentAccount);
            s1.U1.put(0, true);
            s1.V1.put(0, true);
        }
        ls6.d0(this.currentAccount).d1("tg_placeholders_android", false, true);
        boolean z3 = tL_auth_authorization.setup_password_required;
        int i3 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            hl.k3(getParentActivity(), false);
        }
        o1();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
                externalActionActivity.d(externalActionActivity.h, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s ? 1 : 0);
                externalActionActivity.c.Z();
                ActionBarLayout actionBarLayout = externalActionActivity.d;
                if (actionBarLayout != null) {
                    actionBarLayout.Z();
                }
                wma wmaVar = externalActionActivity.e;
                if (wmaVar != null) {
                    wmaVar.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.y) {
            this.y = false;
            this.p0 = true;
            ((LaunchActivity) getParentActivity()).O0(this.currentAccount, new k64((byte) 2, z));
            this.p0 = false;
            finishFragment();
            return;
        }
        if (z && z3) {
            o7c o7cVar = new o7c(6, null);
            o7cVar.H = i3;
            o7cVar.I = true;
            presentFragment(o7cVar, true);
        } else {
            Bundle l = bs2.l("afterSignup", z);
            fj6 fj6Var = new fj6();
            fj6Var.s0(l);
            presentFragment(fj6Var, true);
        }
        jn7.f(this.currentAccount).k(jn7.j0, new Object[0]);
        ob6.D0().V0(this.currentAccount, true);
        ee9.Y(true);
    }

    public final void D1() {
        if (this.R[this.K ? 1 : 0]) {
            if (this.W.getTag() == null) {
                this.b[this.a].h(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131744489, "StopLoadingTitle");
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131744490, "StopLoading");
            alertDialog$Builder.j(ob6.M0(2131742865, "WaitMore"), null);
            alertDialog$Builder.g(ob6.M0(2131744498, "Stop"), new ke6(this, (byte) 0));
            showDialog(idVar);
        }
    }

    public final void F1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.q0 = new ls5((Object) this, (Object) str, (Object) auth_sentcode, (byte) 21);
            return;
        }
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        q1(bundle, auth_sentcode, true);
    }

    public final void H1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.r0) {
            y1(false, true);
            this.r0 = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new mw3(this, bundle, (byte) 19), 10);
        }
    }

    public final void I1(boolean z, boolean z2) {
        if (this.b0 == z && z2) {
            return;
        }
        this.b0 = z;
        byte b = 0;
        if (hl.A1()) {
            z = false;
        }
        if (z) {
            hl.t1(this.fragmentView);
            hl.W2(getParentActivity(), this.classGuid);
            if (!z2) {
                this.c.setVisibility(0);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.d = duration;
            duration.setInterpolator(k43.f);
            this.d.addUpdateListener(new je6(this, b));
            this.d.addListener(new se6(this, b));
            this.d.start();
            return;
        }
        hl.z2(getParentActivity(), this.classGuid);
        if (!z2) {
            this.c.setVisibility(8);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        this.d = duration2;
        duration2.setInterpolator(dt3.e);
        byte b2 = 1;
        this.d.addUpdateListener(new je6(this, b2));
        this.d.addListener(new se6(this, b2));
        this.d.start();
    }

    public final void J1(int i, boolean z, Bundle bundle, boolean z2) {
        byte b = 6;
        boolean z3 = i == 0 || i == 5 || i == 6 || i == 9 || i == 10 || i == 12 || i == 17 || i == 16;
        if (i == this.a) {
            z = false;
        }
        if (z3) {
            if (i == 0) {
                this.w = true;
                this.x = true;
            }
            this.K = true;
            K1(false, z);
            L1(false, z, false);
            this.K = false;
            L1(false, z, false);
            if (!z) {
                K1(true, false);
            }
        } else {
            this.K = false;
            K1(false, z);
            L1(false, z, false);
            if (i != 8) {
                this.K = true;
            }
        }
        cna[] cnaVarArr = this.b;
        if (!z) {
            this.V.setVisibility((cnaVarArr[i].b() || this.y) ? 0 : 8);
            cnaVarArr[this.a].setVisibility(8);
            cnaVarArr[this.a].g();
            this.a = i;
            cnaVarArr[i].m(bundle, false);
            cnaVarArr[i].setVisibility(0);
            setParentActivityTitle(cnaVarArr[i].getHeaderName());
            cnaVarArr[i].j();
            I1(cnaVarArr[i].a(), false);
            return;
        }
        cna cnaVar = cnaVarArr[this.a];
        cna cnaVar2 = cnaVarArr[i];
        this.a = i;
        this.V.setVisibility((cnaVar2.b() || this.y) ? 0 : 8);
        cnaVar2.m(bundle, false);
        setParentActivityTitle(cnaVar2.getHeaderName());
        cnaVar2.j();
        Point point = hl.q;
        int i2 = point.x;
        if (z2) {
            i2 = -i2;
        }
        cnaVar2.setX(i2);
        cnaVar2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new rw(this, z3, cnaVar, b));
        Property property = View.TRANSLATION_X;
        int i3 = point.x;
        if (!z2) {
            i3 = -i3;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(cnaVar, (Property<cna, Float>) property, i3), ObjectAnimator.ofFloat(cnaVar2, (Property<cna, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        I1(cnaVar2.a(), true);
    }

    public final void K1(boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        boolean z3 = this.K;
        boolean z4 = !z3;
        boolean[] zArr = this.R;
        if (zArr[z3 ? 1 : 0] != z) {
            AnimatorSet[] animatorSetArr = this.L;
            AnimatorSet animatorSet = animatorSetArr[z3 ? 1 : 0];
            if (animatorSet != null) {
                if (z2) {
                    animatorSet.removeAllListeners();
                }
                animatorSetArr[this.K ? 1 : 0].cancel();
            }
            boolean z5 = this.K;
            zArr[z5 ? 1 : 0] = z;
            if (!z2) {
                if (z3) {
                    return;
                }
                this.O.e(z, z2);
                return;
            }
            animatorSetArr[z5 ? 1 : 0] = new AnimatorSet();
            if (!z3) {
                this.O.e(z, z2);
            }
            animatorSetArr[this.K ? 1 : 0].addListener(new y5(this, z4, z, (byte) 4));
            int i = jn7.f2;
            if (z3) {
                timeInterpolator = null;
            } else if (z) {
                timeInterpolator = hl.F;
                i = jn7.d3;
            } else {
                timeInterpolator = hl.G;
            }
            animatorSetArr[this.K ? 1 : 0].setDuration(i);
            animatorSetArr[this.K ? 1 : 0].setInterpolator(timeInterpolator);
            animatorSetArr[this.K ? 1 : 0].start();
        }
    }

    public final void L1(boolean z, boolean z2, boolean z3) {
        boolean[] zArr = this.j0;
        if (z2 && zArr[this.K ? 1 : 0] == z && !z3) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            hl.c3(new ne6(this, z, z2, z3));
            return;
        }
        boolean z4 = this.K;
        boolean[] zArr2 = this.l0;
        if (z3 || !z4) {
            zArr2[z4 ? 1 : 0] = false;
            zArr[z4 ? 1 : 0] = z;
        } else {
            zArr[z4 ? 1 : 0] = z;
            if (z2) {
                boolean z5 = zArr2[z4 ? 1 : 0];
                Runnable[] runnableArr = this.k0;
                if (z5) {
                    hl.r(runnableArr[z4 ? 1 : 0]);
                    zArr2[this.K ? 1 : 0] = false;
                    return;
                } else if (z) {
                    ne6 ne6Var = new ne6(this, z4 ? 1 : 0, z, z2);
                    runnableArr[z4 ? 1 : 0] = ne6Var;
                    hl.d3(ne6Var, 2000L);
                    zArr2[this.K ? 1 : 0] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (!z4) {
            this.O.f(z, z2);
            return;
        }
        float f = 0.0f;
        float f2 = 1.0f;
        if (z2) {
            this.M = new AnimatorSet();
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            ofFloat.addListener(new gf4((byte) 12, this, z));
            ofFloat.addUpdateListener(new je6(this, (byte) 2));
            this.M.playTogether(ofFloat);
            this.M.setDuration(150L);
            this.M.start();
            return;
        }
        RadialProgressView radialProgressView = this.W;
        if (z) {
            radialProgressView.setVisibility(0);
            this.W.setScaleX(1.0f);
            this.W.setScaleY(1.0f);
            this.W.setAlpha(1.0f);
            return;
        }
        radialProgressView.setTag(null);
        this.W.setVisibility(4);
        this.W.setScaleX(0.1f);
        this.W.setScaleY(0.1f);
        this.W.setAlpha(0.0f);
    }

    public final boolean M1(View view) {
        if (s1()) {
            return true;
        }
        return hl.E3(view);
    }

    public final void N1(boolean z, boolean z2) {
        if (z == this.y0) {
            return;
        }
        ie6 ie6Var = this.z0;
        if (ie6Var != null) {
            hl.r(ie6Var);
            this.z0 = null;
        }
        this.y0 = z;
        this.X.clearAnimation();
        ImageView imageView = this.X;
        if (z2) {
            imageView.setVisibility(0);
            this.X.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new xac((byte) 26, this, z)).start();
        } else {
            imageView.setVisibility(z ? 0 : 8);
            this.X.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public final void O1(String str, String str2, String str3) {
        if (this.W.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131745824, "ResetMyAccountWarningText");
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        idVar.S = ob6.M0(2131745826, "ResetMyAccountWarning");
        alertDialog$Builder.j(ob6.M0(2131745825, "ResetMyAccountWarningReset"), new pt((Object) this, (Object) str, (Object) str2, (Object) str3, (byte) 14));
        alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
        showDialog(idVar);
    }

    public final void P1() {
        this.fragmentView.setBackgroundColor(aob.w0(null, aob.d6, false));
        ImageView imageView = this.V;
        int i = aob.G6;
        int w0 = aob.w0(null, i, false);
        m1(imageView, w0, this.t0, PorterDuff.Mode.SRC_ATOP);
        this.t0 = w0;
        ImageView imageView2 = this.V;
        int i2 = aob.i6;
        int w02 = aob.w0(null, i2, false);
        n1(imageView2, w02, this.u0);
        this.u0 = w02;
        int w03 = aob.w0(null, i, false);
        if (w03 != this.v0 || this.Y.getColorFilter() == null) {
            this.Y.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            this.v0 = w03;
        }
        ImageView imageView3 = this.X;
        int w04 = aob.w0(null, i2, false);
        n1(imageView3, w04, this.w0);
        this.w0 = w04;
        RadialProgressView radialProgressView = this.W;
        int i3 = aob.P9;
        radialProgressView.setProgressColor(aob.w0(null, i3, false));
        this.O.updateColors();
        this.N.setColor(aob.w0(null, aob.O9, false));
        this.N.setBackgroundColor(aob.w0(null, i3, false));
        for (cna cnaVar : this.b) {
            cnaVar.updateColors();
        }
        k53 k53Var = this.c;
        i53 i53Var = k53Var.a;
        int w05 = aob.w0(null, aob.G6, false);
        if (w05 != k53Var.s || i53Var.getColorFilter() == null) {
            k53Var.s = w05;
            i53Var.setColorFilter(w05, PorterDuff.Mode.SRC_ATOP);
        }
        int w06 = aob.w0(null, aob.i6, false);
        int o = vm2.o(w06, 30);
        boolean z = w06 != k53Var.w;
        k53Var.w = w06;
        int i4 = 0;
        while (true) {
            View[] viewArr = k53Var.c;
            if (i4 >= viewArr.length) {
                break;
            }
            View view = viewArr[i4];
            if (view != null) {
                if (view.getBackground() == null) {
                    k53.a(i4, view);
                } else if (z) {
                    aob.F1(view.getBackground(), w06, false);
                    aob.F1(view.getBackground(), o, true);
                }
                if (view instanceof j53) {
                    ((j53) view).updateColors();
                }
            }
            i4++;
        }
        eh6 eh6Var = this.c0;
        if (eh6Var != null) {
            int i5 = eh6.G;
            eh6Var.b();
        }
    }

    public final void Q1(boolean z, boolean z2) {
        if (this.Y != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.x0 != connectionState || z2) {
                this.x0 = connectionState;
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
                byte b = 1;
                boolean z3 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
                int i = this.x0;
                boolean z4 = i == 3 || i == 5;
                boolean z5 = i == 1 || i == 2 || i == 4;
                if (z3) {
                    this.Y.b(true, z4, z);
                    N1(true, z);
                    return;
                }
                if ((!getMessagesController().l3 || xea.v1.isEmpty()) && !z5) {
                    N1(false, z);
                    return;
                }
                this.Y.b(true, z4, z);
                if (this.y0) {
                    return;
                }
                ie6 ie6Var = this.z0;
                if (ie6Var != null) {
                    hl.r(ie6Var);
                }
                this.y0 = true;
                ie6 ie6Var2 = new ie6(this, b);
                this.z0 = ie6Var2;
                hl.d3(ie6Var2, 5000L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            if (this.p0) {
                this.o0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && !this.p0) {
            ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03dc  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        cna[] cnaVarArr;
        int i;
        ls5 ls5Var;
        int i2;
        View view = this.o0;
        if (view != null) {
            this.fragmentView = view;
            this.o0 = null;
            return view;
        }
        final byte b = 0;
        this.actionBar.setAddToContainer(false);
        byte b2 = 6;
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, b2));
        this.K = false;
        boolean[] zArr = this.R;
        final byte b3 = 1;
        zArr[0] = true;
        zArr[1] = false;
        w81 w81Var = new w81((byte) 5, context, this);
        this.T = w81Var;
        w81Var.setDelegate(new yv0(this, b3));
        this.fragmentView = this.T;
        yc ycVar = new yc(this, context, (byte) 4);
        ycVar.setFillViewport(true);
        this.T.addView(ycVar, tre.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        ycVar.addView(this.Z, tre.x(-1, -2, 51));
        Space space = new Space(context);
        this.n0 = space;
        space.setMinimumHeight(hl.O1() ? 0 : hl.m);
        this.Z.addView(this.n0);
        d26 d26Var = new d26(b3, context, this);
        this.a0 = d26Var;
        this.Z.addView(d26Var, tre.l(1.0f, -1, 0));
        k53 k53Var = new k53(context);
        this.c = k53Var;
        k53Var.setViewToFindFocus(this.a0);
        this.Z.addView(this.c, tre.o(-1, 230));
        ph6 ph6Var = new ph6(this, context);
        cna[] cnaVarArr2 = this.b;
        cnaVarArr2[0] = ph6Var;
        cnaVarArr2[1] = new tg6(this, context, 1);
        final byte b4 = 2;
        cnaVarArr2[2] = new tg6(this, context, 2);
        cnaVarArr2[3] = new tg6(this, context, 3);
        cnaVarArr2[4] = new tg6(this, context, 4);
        cnaVarArr2[5] = new cg6(this, context);
        cnaVarArr2[6] = new lf6(this, context);
        byte b5 = 7;
        cnaVarArr2[7] = new vf6(this, context);
        cnaVarArr2[8] = new dg6(this, context);
        cnaVarArr2[9] = new if6(this, context, 0);
        cnaVarArr2[10] = new if6(this, context, 1);
        cnaVarArr2[11] = new tg6(this, context, 11);
        cnaVarArr2[12] = new fg6(this, context);
        cnaVarArr2[13] = new df6(this, context, true);
        cnaVarArr2[14] = new df6(this, context, false);
        cnaVarArr2[15] = new tg6(this, context, 15);
        cnaVarArr2[16] = new sf6(this, context, 16);
        cnaVarArr2[17] = new sf6(this, context, 17);
        int i3 = 18;
        cnaVarArr2[18] = new zg6(this, context);
        int i4 = 0;
        while (i4 < cnaVarArr2.length) {
            cnaVarArr2[i4].setVisibility(i4 == 0 ? 0 : 8);
            this.a0.addView(cnaVarArr2[i4], tre.d(-1, -1.0f, 17, hl.O1() ? 26.0f : 18.0f, i4 != i3 ? 30.0f : 0.0f, hl.O1() ? 26.0f : 18.0f, 0.0f));
            i4++;
            i3 = 18;
        }
        Bundle x1 = this.G == 0 ? x1(this.currentAccount, this.y) : null;
        if (x1 != null && ((i2 = x1.getInt("currentViewNum", 0)) < 0 || i2 >= cnaVarArr2.length)) {
            x1 = null;
        }
        if (x1 != null) {
            this.a = x1.getInt("currentViewNum", 0);
            this.E = x1.getInt("syncContacts", 1) == 1;
            int i5 = this.a;
            if (i5 < 1 || i5 > 4) {
                cnaVarArr = cnaVarArr2;
                if (i5 != 6) {
                    if (i5 == 7 && ((vf6) cnaVarArr[7]).h == null) {
                        this.a = 0;
                        o1();
                        x1 = null;
                    }
                    zp4 zp4Var = new zp4(this.resourceProvider, context, false);
                    this.O = zp4Var;
                    zp4Var.e(zArr[0], false);
                    this.P = new ko9(this.O);
                    this.T.addView(this.O, tre.d(56, 56.0f, (!ob6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.O.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                        public final /* synthetic */ qh6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b6 = b;
                            qh6 qh6Var = this.b;
                            switch (b6) {
                                case 0:
                                    qh6Var.D1();
                                    break;
                                case 1:
                                    if (qh6Var.onBackPressed(true)) {
                                        qh6Var.finishFragment();
                                        break;
                                    }
                                    break;
                                case 2:
                                    ch3 ch3Var = qh6Var.f0;
                                    if (ch3Var != null) {
                                        ch3Var.run();
                                    }
                                    qh6Var.finishFragment();
                                    break;
                                default:
                                    qh6Var.presentFragment(new ProxyListActivity());
                                    break;
                            }
                        }
                    });
                    ((vpa) this.P.c).b(new i10(this, b5));
                    ImageView imageView = new ImageView(context);
                    this.V = imageView;
                    imageView.setImageResource(R.drawable.ic_ab_back);
                    this.V.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                        public final /* synthetic */ qh6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b6 = b3;
                            qh6 qh6Var = this.b;
                            switch (b6) {
                                case 0:
                                    qh6Var.D1();
                                    break;
                                case 1:
                                    if (qh6Var.onBackPressed(true)) {
                                        qh6Var.finishFragment();
                                        break;
                                    }
                                    break;
                                case 2:
                                    ch3 ch3Var = qh6Var.f0;
                                    if (ch3Var != null) {
                                        ch3Var.run();
                                    }
                                    qh6Var.finishFragment();
                                    break;
                                default:
                                    qh6Var.presentFragment(new ProxyListActivity());
                                    break;
                            }
                        }
                    });
                    this.V.setContentDescription(ob6.M0(2131754874, null));
                    int L = hl.L(4.0f);
                    this.V.setPadding(L, L, L, L);
                    this.T.addView(this.V, tre.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
                    if (this.f0 != null) {
                        TextView textView = new TextView(context);
                        this.g0 = textView;
                        textView.setGravity(19);
                        this.g0.setTextSize(1, 15.0f);
                        this.g0.setLineSpacing(hl.L(2.0f), 1.0f);
                        this.g0.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                        this.g0.setText(ob6.M0(2131742448, null));
                        yob.X(this.g0, aob.q6, null);
                        this.T.addView(this.g0, tre.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                        this.g0.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                            public final /* synthetic */ qh6 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b6 = b4;
                                qh6 qh6Var = this.b;
                                switch (b6) {
                                    case 0:
                                        qh6Var.D1();
                                        break;
                                    case 1:
                                        if (qh6Var.onBackPressed(true)) {
                                            qh6Var.finishFragment();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        ch3 ch3Var = qh6Var.f0;
                                        if (ch3Var != null) {
                                            ch3Var.run();
                                        }
                                        qh6Var.finishFragment();
                                        break;
                                    default:
                                        qh6Var.presentFragment(new ProxyListActivity());
                                        break;
                                }
                            }
                        });
                    }
                    ImageView imageView2 = new ImageView(context);
                    this.X = imageView2;
                    cx8 cx8Var = new cx8(context);
                    this.Y = cx8Var;
                    imageView2.setImageDrawable(cx8Var);
                    final byte b6 = 3;
                    this.X.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                        public final /* synthetic */ qh6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b62 = b6;
                            qh6 qh6Var = this.b;
                            switch (b62) {
                                case 0:
                                    qh6Var.D1();
                                    break;
                                case 1:
                                    if (qh6Var.onBackPressed(true)) {
                                        qh6Var.finishFragment();
                                        break;
                                    }
                                    break;
                                case 2:
                                    ch3 ch3Var = qh6Var.f0;
                                    if (ch3Var != null) {
                                        ch3Var.run();
                                    }
                                    qh6Var.finishFragment();
                                    break;
                                default:
                                    qh6Var.presentFragment(new ProxyListActivity());
                                    break;
                            }
                        }
                    });
                    this.X.setAlpha(0.0f);
                    this.X.setVisibility(8);
                    this.T.addView(this.X, tre.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
                    Q1(false, true);
                    RadialProgressView radialProgressView = new RadialProgressView(context, null);
                    this.W = radialProgressView;
                    radialProgressView.setSize(hl.L(20.0f));
                    this.W.setAlpha(0.0f);
                    this.W.setScaleX(0.1f);
                    this.W.setScaleY(0.1f);
                    this.T.addView(this.W, tre.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                    w2c w2cVar = new w2c(context);
                    this.N = w2cVar;
                    w2cVar.setTransformType(0);
                    this.N.setProgress(1.0f);
                    this.N.setDrawBackground(false);
                    this.O.setContentDescription(ob6.M0(2131751319, null));
                    this.O.addView(this.N, tre.e(56, 56, 17));
                    this.O.a(this.N);
                    if (x1 != null) {
                    }
                    i = 0;
                    while (i < cnaVarArr.length) {
                    }
                    this.f = false;
                    P1();
                    if (this.G == 1) {
                    }
                    ls5Var = this.q0;
                    if (ls5Var != null) {
                    }
                    return this.fragmentView;
                }
                if (((lf6) cnaVarArr[6]).n == null) {
                    this.a = 0;
                    o1();
                    x1 = null;
                }
                zp4 zp4Var2 = new zp4(this.resourceProvider, context, false);
                this.O = zp4Var2;
                zp4Var2.e(zArr[0], false);
                this.P = new ko9(this.O);
                this.T.addView(this.O, tre.d(56, 56.0f, (!ob6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                this.O.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                    public final /* synthetic */ qh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b62 = b;
                        qh6 qh6Var = this.b;
                        switch (b62) {
                            case 0:
                                qh6Var.D1();
                                break;
                            case 1:
                                if (qh6Var.onBackPressed(true)) {
                                    qh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                ch3 ch3Var = qh6Var.f0;
                                if (ch3Var != null) {
                                    ch3Var.run();
                                }
                                qh6Var.finishFragment();
                                break;
                            default:
                                qh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                ((vpa) this.P.c).b(new i10(this, b5));
                ImageView imageView3 = new ImageView(context);
                this.V = imageView3;
                imageView3.setImageResource(R.drawable.ic_ab_back);
                this.V.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                    public final /* synthetic */ qh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b62 = b3;
                        qh6 qh6Var = this.b;
                        switch (b62) {
                            case 0:
                                qh6Var.D1();
                                break;
                            case 1:
                                if (qh6Var.onBackPressed(true)) {
                                    qh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                ch3 ch3Var = qh6Var.f0;
                                if (ch3Var != null) {
                                    ch3Var.run();
                                }
                                qh6Var.finishFragment();
                                break;
                            default:
                                qh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                this.V.setContentDescription(ob6.M0(2131754874, null));
                int L2 = hl.L(4.0f);
                this.V.setPadding(L2, L2, L2, L2);
                this.T.addView(this.V, tre.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
                if (this.f0 != null && !this.h0 && this.i0) {
                    TextView textView2 = new TextView(context);
                    this.g0 = textView2;
                    textView2.setGravity(19);
                    this.g0.setTextSize(1, 15.0f);
                    this.g0.setLineSpacing(hl.L(2.0f), 1.0f);
                    this.g0.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                    this.g0.setText(ob6.M0(2131742448, null));
                    yob.X(this.g0, aob.q6, null);
                    this.T.addView(this.g0, tre.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                    this.g0.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                        public final /* synthetic */ qh6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b62 = b4;
                            qh6 qh6Var = this.b;
                            switch (b62) {
                                case 0:
                                    qh6Var.D1();
                                    break;
                                case 1:
                                    if (qh6Var.onBackPressed(true)) {
                                        qh6Var.finishFragment();
                                        break;
                                    }
                                    break;
                                case 2:
                                    ch3 ch3Var = qh6Var.f0;
                                    if (ch3Var != null) {
                                        ch3Var.run();
                                    }
                                    qh6Var.finishFragment();
                                    break;
                                default:
                                    qh6Var.presentFragment(new ProxyListActivity());
                                    break;
                            }
                        }
                    });
                }
                ImageView imageView22 = new ImageView(context);
                this.X = imageView22;
                cx8 cx8Var2 = new cx8(context);
                this.Y = cx8Var2;
                imageView22.setImageDrawable(cx8Var2);
                final byte b62 = 3;
                this.X.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                    public final /* synthetic */ qh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b622 = b62;
                        qh6 qh6Var = this.b;
                        switch (b622) {
                            case 0:
                                qh6Var.D1();
                                break;
                            case 1:
                                if (qh6Var.onBackPressed(true)) {
                                    qh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                ch3 ch3Var = qh6Var.f0;
                                if (ch3Var != null) {
                                    ch3Var.run();
                                }
                                qh6Var.finishFragment();
                                break;
                            default:
                                qh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                this.X.setAlpha(0.0f);
                this.X.setVisibility(8);
                this.T.addView(this.X, tre.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
                Q1(false, true);
                RadialProgressView radialProgressView2 = new RadialProgressView(context, null);
                this.W = radialProgressView2;
                radialProgressView2.setSize(hl.L(20.0f));
                this.W.setAlpha(0.0f);
                this.W.setScaleX(0.1f);
                this.W.setScaleY(0.1f);
                this.T.addView(this.W, tre.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                w2c w2cVar2 = new w2c(context);
                this.N = w2cVar2;
                w2cVar2.setTransformType(0);
                this.N.setProgress(1.0f);
                this.N.setDrawBackground(false);
                this.O.setContentDescription(ob6.M0(2131751319, null));
                this.O.addView(this.N, tre.e(56, 56, 17));
                this.O.a(this.N);
                if (x1 != null) {
                    this.f = true;
                }
                i = 0;
                while (i < cnaVarArr.length) {
                    cna cnaVar = cnaVarArr[i];
                    if (x1 != null) {
                        if (i < 1 || i > 4) {
                            cnaVar.k(x1);
                        } else if (i == this.a) {
                            cnaVar.k(x1);
                        }
                    }
                    if (this.a == i) {
                        this.V.setVisibility((cnaVar.b() || this.y || this.G == 2) ? 0 : 8);
                        cnaVar.setVisibility(0);
                        cnaVar.j();
                        I1(cnaVar.a(), false);
                        this.K = false;
                        K1(i == 0 || i == 5 || i == b2 || i == 9 || i == 10 || i == 12, false);
                        if (i == 1 || i == 2 || i == 3 || i == 4) {
                            this.K = true;
                        }
                    } else if (cnaVar.getVisibility() != 8) {
                        cnaVar.setVisibility(8);
                        cnaVar.g();
                    }
                    i++;
                    b2 = 6;
                }
                this.f = false;
                P1();
                if (this.G == 1) {
                    q1(this.I, this.J, false);
                }
                ls5Var = this.q0;
                if (ls5Var != null) {
                    this.q0 = null;
                    ls5Var.run();
                }
                return this.fragmentView;
            }
            int i6 = x1.getInt("open");
            if (i6 != 0) {
                cnaVarArr = cnaVarArr2;
                if (Math.abs((System.currentTimeMillis() / 1000) - i6) >= 86400) {
                    this.a = 0;
                    o1();
                    x1 = null;
                }
                zp4 zp4Var22 = new zp4(this.resourceProvider, context, false);
                this.O = zp4Var22;
                zp4Var22.e(zArr[0], false);
                this.P = new ko9(this.O);
                this.T.addView(this.O, tre.d(56, 56.0f, (!ob6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                this.O.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                    public final /* synthetic */ qh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b622 = b;
                        qh6 qh6Var = this.b;
                        switch (b622) {
                            case 0:
                                qh6Var.D1();
                                break;
                            case 1:
                                if (qh6Var.onBackPressed(true)) {
                                    qh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                ch3 ch3Var = qh6Var.f0;
                                if (ch3Var != null) {
                                    ch3Var.run();
                                }
                                qh6Var.finishFragment();
                                break;
                            default:
                                qh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                ((vpa) this.P.c).b(new i10(this, b5));
                ImageView imageView32 = new ImageView(context);
                this.V = imageView32;
                imageView32.setImageResource(R.drawable.ic_ab_back);
                this.V.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                    public final /* synthetic */ qh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b622 = b3;
                        qh6 qh6Var = this.b;
                        switch (b622) {
                            case 0:
                                qh6Var.D1();
                                break;
                            case 1:
                                if (qh6Var.onBackPressed(true)) {
                                    qh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                ch3 ch3Var = qh6Var.f0;
                                if (ch3Var != null) {
                                    ch3Var.run();
                                }
                                qh6Var.finishFragment();
                                break;
                            default:
                                qh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                this.V.setContentDescription(ob6.M0(2131754874, null));
                int L22 = hl.L(4.0f);
                this.V.setPadding(L22, L22, L22, L22);
                this.T.addView(this.V, tre.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
                if (this.f0 != null) {
                }
                ImageView imageView222 = new ImageView(context);
                this.X = imageView222;
                cx8 cx8Var22 = new cx8(context);
                this.Y = cx8Var22;
                imageView222.setImageDrawable(cx8Var22);
                final byte b622 = 3;
                this.X.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
                    public final /* synthetic */ qh6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b6222 = b622;
                        qh6 qh6Var = this.b;
                        switch (b6222) {
                            case 0:
                                qh6Var.D1();
                                break;
                            case 1:
                                if (qh6Var.onBackPressed(true)) {
                                    qh6Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                ch3 ch3Var = qh6Var.f0;
                                if (ch3Var != null) {
                                    ch3Var.run();
                                }
                                qh6Var.finishFragment();
                                break;
                            default:
                                qh6Var.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
                this.X.setAlpha(0.0f);
                this.X.setVisibility(8);
                this.T.addView(this.X, tre.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
                Q1(false, true);
                RadialProgressView radialProgressView22 = new RadialProgressView(context, null);
                this.W = radialProgressView22;
                radialProgressView22.setSize(hl.L(20.0f));
                this.W.setAlpha(0.0f);
                this.W.setScaleX(0.1f);
                this.W.setScaleY(0.1f);
                this.T.addView(this.W, tre.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                w2c w2cVar22 = new w2c(context);
                this.N = w2cVar22;
                w2cVar22.setTransformType(0);
                this.N.setProgress(1.0f);
                this.N.setDrawBackground(false);
                this.O.setContentDescription(ob6.M0(2131751319, null));
                this.O.addView(this.N, tre.e(56, 56, 17));
                this.O.a(this.N);
                if (x1 != null) {
                }
                i = 0;
                while (i < cnaVarArr.length) {
                }
                this.f = false;
                P1();
                if (this.G == 1) {
                }
                ls5Var = this.q0;
                if (ls5Var != null) {
                }
                return this.fragmentView;
            }
        }
        cnaVarArr = cnaVarArr2;
        zp4 zp4Var222 = new zp4(this.resourceProvider, context, false);
        this.O = zp4Var222;
        zp4Var222.e(zArr[0], false);
        this.P = new ko9(this.O);
        this.T.addView(this.O, tre.d(56, 56.0f, (!ob6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
            public final /* synthetic */ qh6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b6222 = b;
                qh6 qh6Var = this.b;
                switch (b6222) {
                    case 0:
                        qh6Var.D1();
                        break;
                    case 1:
                        if (qh6Var.onBackPressed(true)) {
                            qh6Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        ch3 ch3Var = qh6Var.f0;
                        if (ch3Var != null) {
                            ch3Var.run();
                        }
                        qh6Var.finishFragment();
                        break;
                    default:
                        qh6Var.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((vpa) this.P.c).b(new i10(this, b5));
        ImageView imageView322 = new ImageView(context);
        this.V = imageView322;
        imageView322.setImageResource(R.drawable.ic_ab_back);
        this.V.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
            public final /* synthetic */ qh6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b6222 = b3;
                qh6 qh6Var = this.b;
                switch (b6222) {
                    case 0:
                        qh6Var.D1();
                        break;
                    case 1:
                        if (qh6Var.onBackPressed(true)) {
                            qh6Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        ch3 ch3Var = qh6Var.f0;
                        if (ch3Var != null) {
                            ch3Var.run();
                        }
                        qh6Var.finishFragment();
                        break;
                    default:
                        qh6Var.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.V.setContentDescription(ob6.M0(2131754874, null));
        int L222 = hl.L(4.0f);
        this.V.setPadding(L222, L222, L222, L222);
        this.T.addView(this.V, tre.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.f0 != null) {
        }
        ImageView imageView2222 = new ImageView(context);
        this.X = imageView2222;
        cx8 cx8Var222 = new cx8(context);
        this.Y = cx8Var222;
        imageView2222.setImageDrawable(cx8Var222);
        final byte b6222 = 3;
        this.X.setOnClickListener(new View.OnClickListener(this) { // from class: qe6
            public final /* synthetic */ qh6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b62222 = b6222;
                qh6 qh6Var = this.b;
                switch (b62222) {
                    case 0:
                        qh6Var.D1();
                        break;
                    case 1:
                        if (qh6Var.onBackPressed(true)) {
                            qh6Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        ch3 ch3Var = qh6Var.f0;
                        if (ch3Var != null) {
                            ch3Var.run();
                        }
                        qh6Var.finishFragment();
                        break;
                    default:
                        qh6Var.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.X.setAlpha(0.0f);
        this.X.setVisibility(8);
        this.T.addView(this.X, tre.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        Q1(false, true);
        RadialProgressView radialProgressView222 = new RadialProgressView(context, null);
        this.W = radialProgressView222;
        radialProgressView222.setSize(hl.L(20.0f));
        this.W.setAlpha(0.0f);
        this.W.setScaleX(0.1f);
        this.W.setScaleY(0.1f);
        this.T.addView(this.W, tre.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        w2c w2cVar222 = new w2c(context);
        this.N = w2cVar222;
        w2cVar222.setTransformType(0);
        this.N.setProgress(1.0f);
        this.N.setDrawBackground(false);
        this.O.setContentDescription(ob6.M0(2131751319, null));
        this.O.addView(this.N, tre.e(56, 56, 17));
        this.O.a(this.N);
        if (x1 != null) {
        }
        i = 0;
        while (i < cnaVarArr.length) {
        }
        this.f = false;
        P1();
        if (this.G == 1) {
        }
        ls5Var = this.q0;
        if (ls5Var != null) {
        }
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T1) {
            Q1(true, false);
            return;
        }
        if (i == jn7.s1 && this.i0) {
            uc7 messagesController = getMessagesController();
            if (messagesController.u3.contains("SETUP_LOGIN_EMAIL") || messagesController.u3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 9), aob.G6, aob.D6, aob.H6, aob.i6, aob.P9, aob.O9, aob.k6, aob.l6, aob.I6, aob.q7, aob.y6, aob.i7, aob.q6, aob.Ni, aob.Q9, aob.p7, aob.J6, aob.Y6, aob.W6, aob.X6, aob.h5, aob.q5, aob.j5);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.i0;
    }

    public final void o1() {
        String str;
        Context context = a.b;
        if (this.y) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("logininfo2".concat(str), 0).edit();
        edit.clear();
        edit.commit();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        cg6 cg6Var = (cg6) this.b[5];
        if (cg6Var != null) {
            cg6Var.N.h(i, i2, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (!this.i0 || this.a != 12) {
            int i = this.a;
            cna[] cnaVarArr = this.b;
            if (i == 0 || (this.G == 3 && i == 12)) {
                if (z) {
                    for (cna cnaVar : cnaVarArr) {
                        if (cnaVar != null) {
                            cnaVar.e();
                        }
                    }
                    o1();
                }
                return true;
            }
            if (i == 6) {
                if (z) {
                    cnaVarArr[i].c(true);
                    J1(0, true, null, true);
                    return false;
                }
            } else if (i == 7 || i == 8) {
                if (z) {
                    cnaVarArr[i].c(true);
                    J1(6, true, null, true);
                }
            } else if ((i >= 1 && i <= 4) || i == 11 || i == 15) {
                if (z && cnaVarArr[i].c(false)) {
                    J1(0, true, null, true);
                    return false;
                }
            } else if (i == 5) {
                if (z) {
                    ((cg6) cnaVarArr[i]).x.callOnClick();
                    return false;
                }
            } else if (i == 9) {
                if (z) {
                    cnaVarArr[i].c(true);
                    J1(7, true, null, true);
                    return false;
                }
            } else if (i == 10) {
                if (z) {
                    cnaVarArr[i].c(true);
                    J1(9, true, null, true);
                    return false;
                }
            } else if (i == 13) {
                if (z) {
                    cnaVarArr[i].c(true);
                    J1(12, true, null, true);
                    return false;
                }
            } else if (z && cnaVarArr[i].c(true)) {
                J1(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onConfigurationChanged(Configuration configuration) {
        I1(this.b[this.a].a(), false);
        eh6 eh6Var = this.c0;
        if (eh6Var != null) {
            int i = eh6.G;
            eh6Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onDialogDismiss(Dialog dialog) {
        byte b = 0;
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
                hl.d3(new ie6(this, b), 200L);
                getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.T1);
        getNotificationCenter().b(this, jn7.s1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i = 0;
        while (true) {
            cna[] cnaVarArr = this.b;
            if (i >= cnaVarArr.length) {
                break;
            }
            cna cnaVar = cnaVarArr[i];
            if (cnaVar != null) {
                cnaVar.e();
            }
            i++;
        }
        id idVar = this.S;
        if (idVar != null) {
            idVar.dismiss();
            this.S = null;
        }
        for (Runnable runnable : this.k0) {
            if (runnable != null) {
                hl.r(runnable);
            }
        }
        getNotificationCenter().n(this, jn7.T1);
        getNotificationCenter().n(this, jn7.s1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        hl.z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        byte b = 0;
        boolean z = iArr[0] == 0;
        cna[] cnaVarArr = this.b;
        if (i == 6) {
            this.w = false;
            int i2 = this.a;
            if (i2 == 0) {
                cna cnaVar = cnaVarArr[i2];
                ((ph6) cnaVar).O = true;
                cnaVar.h(null);
                return;
            }
            return;
        }
        if (i == 7) {
            this.x = false;
            int i3 = this.a;
            if (i3 == 0) {
                ((ph6) cnaVarArr[i3]).p();
                return;
            }
            return;
        }
        if (i == 20) {
            if (z) {
                ((cg6) cnaVarArr[5]).N.l();
            }
        } else if (i == 151 && z) {
            cg6 cg6Var = (cg6) cnaVarArr[5];
            cg6Var.post(new re6(cg6Var, b));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        cna cnaVar;
        int i;
        cna[] cnaVarArr = this.b;
        super.onResume();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        hl.V2(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i2 = this.a;
            if (i2 >= 1 && i2 <= 4) {
                cna cnaVar2 = cnaVarArr[i2];
                if ((cnaVar2 instanceof tg6) && (i = ((tg6) cnaVar2).W) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                    cnaVarArr[this.a].c(true);
                    J1(0, false, null, true);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        int i3 = this.a;
        if (i3 == 0 && !this.d0 && (cnaVar = cnaVarArr[i3]) != null) {
            cnaVar.j();
        }
        if (s1()) {
            hl.t1(this.fragmentView);
            hl.W2(getParentActivity(), this.classGuid);
        }
        int i4 = this.a;
        if (i4 < 0 || i4 >= cnaVarArr.length) {
            return;
        }
        cnaVarArr[i4].i();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView == null || this.V == null || this.Y == null || this.X == null || this.W == null || this.O == null || this.N == null || this.c == null) {
                return;
            }
            for (cna cnaVar : this.b) {
                if (cnaVar == null) {
                    return;
                }
            }
            P1();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void q1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z) {
        final byte b = 1;
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            J1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        final byte b2 = 0;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.r0) {
            if (!b.b.hasServices()) {
                cc4.b("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                H1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            B1(0, true);
            this.r0 = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                cc4.b("getting classic integrity with nonce = ".concat(str));
                create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new le6(this, bundle, auth_sentcode, string, z)).addOnFailureListener(new OnFailureListener(this) { // from class: me6
                    public final /* synthetic */ qh6 b;

                    {
                        this.b = this;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        byte b3 = b2;
                        TLRPC.auth_SentCode auth_sentcode2 = auth_sentcode;
                        Bundle bundle2 = bundle;
                        qh6 qh6Var = this.b;
                        switch (b3) {
                            case 0:
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + qh6.p1(exc);
                                cc4.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                qh6Var.H1(bundle2, auth_sentcode2, str2);
                                break;
                            default:
                                cc4.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + qh6.p1(exc);
                                cc4.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                qh6Var.H1(bundle2, auth_sentcode2, str3);
                                break;
                        }
                    }
                });
                return;
            }
            qa4 qa4Var = new qa4(a.b, ss9.a, null, new uif((byte) 13));
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = f11.f;
            o6d o6dVar = qa4Var.i;
            g5e g5eVar = new g5e(o6dVar, bArr, str2);
            o6dVar.b.d(0, g5eVar);
            pgd.a(g5eVar, new i09((Object) new ts9(), (byte) 26)).addOnSuccessListener(new le6(this, string, auth_sentcode, bundle, z)).addOnFailureListener(new OnFailureListener(this) { // from class: me6
                public final /* synthetic */ qh6 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    byte b3 = b;
                    TLRPC.auth_SentCode auth_sentcode2 = auth_sentcode;
                    Bundle bundle2 = bundle;
                    qh6 qh6Var = this.b;
                    switch (b3) {
                        case 0:
                            String str22 = "PLAYINTEGRITY_EXCEPTION_" + qh6.p1(exc);
                            cc4.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                            qh6Var.H1(bundle2, auth_sentcode2, str22);
                            break;
                        default:
                            cc4.g(exc, true);
                            String str3 = "SAFETYNET_EXCEPTION_" + qh6.p1(exc);
                            cc4.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                            qh6Var.H1(bundle2, auth_sentcode2, str3);
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
            J1(1, z, bundle, false);
            return;
        }
        int i = auth_sentcode.timeout;
        if (i == 0) {
            boolean z2 = f11.a;
            i = 60;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", i * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", auth_sentcode.type.length);
            J1(4, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            J1(3, z, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            J1(2, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            J1(15, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            J1(11, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            J1(12, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            J1(14, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            J1(16, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            J1(17, z, bundle, false);
        }
    }

    public final HashSet r1() {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) a.b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            SubscriptionManager from = SubscriptionManager.from(getParentActivity());
            int i = Build.VERSION.SDK_INT;
            List<SubscriptionInfo> completeActiveSubscriptionInfoList = i >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
            if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
                completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList != null) {
                for (int i2 = 0; i2 < completeActiveSubscriptionInfoList.size(); i2++) {
                    String number = completeActiveSubscriptionInfoList.get(i2).getNumber();
                    if (!TextUtils.isEmpty(number)) {
                        hashSet.add(number);
                    }
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        return hashSet;
    }

    public final boolean s1() {
        return this.b[this.a].a() && !hl.A1();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.E ? 1 : 0);
            for (int i = 0; i <= this.a; i++) {
                cna cnaVar = this.b[i];
                if (cnaVar != null) {
                    cnaVar.l(bundle2);
                }
            }
            Context context = a.b;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
            sb.append(this.y ? "_" + this.currentAccount : "");
            SharedPreferences.Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
            edit.clear();
            G1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final /* synthetic */ void t1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            cc4.b("Resend firebase sms because integrity token = null");
            H1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new oe6((byte) 1, this, bundle, auth_sentcode, z), 10);
    }

    public final void u1(String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z, ts9 ts9Var) {
        l9d l9dVar = ((zbf) ((ie9) ts9Var.a)).b;
        String str2 = l9dVar == null ? null : l9dVar.a;
        if (str2 == null) {
            cc4.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            H1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] split = str2.split("\\.");
        if (split.length <= 0) {
            cc4.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            H1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (!optBoolean) {
                    if (optBoolean2) {
                        cc4.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                        H1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        return;
                    } else {
                        cc4.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                        H1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        return;
                    }
                }
                if (optBoolean2) {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new oe6((byte) 0, this, bundle, auth_sentcode, z), 10);
                } else {
                    if (optBoolean2) {
                        return;
                    }
                    cc4.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    H1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                }
            } catch (JSONException e) {
                e = e;
                cc4.g(e, true);
                cc4.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                H1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public final void v1(TLRPC.TL_error tL_error, String str, String str2, String str3) {
        y1(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                J1(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            J1(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            z1(ob6.M0(2131745798, null), ob6.M0(2131745842, "ResetAccountCancelledAlert"));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            z1(ob6.M0(2131745798, null), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        J1(8, true, bundle2, false);
    }

    public final void w1(String str, String str2, String str3) {
        B1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteaccount, new au0(this, str, str2, str3), 10);
    }

    public final void y1(boolean z, boolean z2) {
        id idVar;
        if (this.Q != 0) {
            if (z) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Q, true);
            }
            this.Q = 0;
        }
        if (this.G == 1 && (idVar = this.S) != null) {
            idVar.dismiss();
            this.S = null;
        }
        L1(false, z2, false);
    }

    public final void z1(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        alertDialog$Builder.j(ob6.M0(2131747558, "OK"), null);
        showDialog(idVar);
    }

    public qh6() {
        super(null);
        this.b = new cna[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.E = true;
        this.F = false;
        this.G = (byte) 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.b0 = false;
        this.j0 = new boolean[2];
        this.k0 = new Runnable[2];
        this.l0 = new boolean[2];
    }
}
