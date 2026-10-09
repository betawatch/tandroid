package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Collection;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vg0 extends org.telegram.ui.Components.xw0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public final HashMap F;
    public final HashMap G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public long N;
    public Toast O;
    public String P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Runnable U;
    public final /* synthetic */ wg0 V;
    public final bk0 a;
    public final sg0 b;
    public final TextView c;
    public final org.telegram.ui.Components.v11 d;
    public final org.telegram.ui.Components.zd0 e;
    public final org.telegram.ui.Components.zd0 f;
    public final TextView h;
    public final org.telegram.ui.Components.ea0 n;
    public final View r;
    public final ImageView s;
    public final org.telegram.ui.Cells.a2 v;
    public final org.telegram.ui.Cells.a2 w;
    public int x;
    public ut y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg0(wg0 wg0Var, Context context) {
        super(context);
        int i10;
        this.V = wg0Var;
        this.x = 0;
        this.E = new ArrayList();
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = 0;
        this.N = 0L;
        this.Q = -1;
        this.S = false;
        this.T = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.c = textView;
        com.google.android.gms.internal.vision.e2.l(18.0f, 1, textView);
        textView.setText(LocaleController.getString(wg0Var.F == 2 ? R.string.ChangePhoneNewNumber : R.string.YourNumber));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.x5.a(-2.0f, 32.0f, 0.0f, 32.0f, 0.0f, -1, 1));
        textView.setOnClickListener(new rv(21, this, context));
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(context, null);
        this.n = ea0Var;
        ea0Var.setText(LocaleController.getString(wg0Var.F == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setGravity(17);
        ea0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(ea0Var, w7.x5.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.v11 v11Var = new org.telegram.ui.Components.v11(context);
        this.d = v11Var;
        v11Var.setFactory(new rg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.au.e);
        v11Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(v11Var, w7.x5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.zd0 zd0Var = new org.telegram.ui.Components.zd0(context, null);
        this.e = zd0Var;
        zd0Var.setText(LocaleController.getString(R.string.Country));
        zd0Var.addView(linearLayout, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        zd0Var.setForceUseCenter(true);
        zd0Var.setFocusable(true);
        zd0Var.setContentDescription(LocaleController.getString(R.string.Country));
        zd0Var.setOnFocusChangeListener(new pd(this, 9));
        addView(zd0Var, w7.x5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        final int i11 = 1;
        zd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ng0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        wg0 wg0Var2 = this.b.V;
                        if (wg0Var2.getParentActivity() != null) {
                            boolean z10 = !wg0Var2.y;
                            wg0Var2.y = z10;
                            ((org.telegram.ui.Cells.a2) view).c(z10, true);
                            if (!wg0Var2.y) {
                                new org.telegram.ui.Components.ad(wg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                break;
                            } else {
                                new org.telegram.ui.Components.ad(wg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                break;
                            }
                        }
                        break;
                    default:
                        vg0 vg0Var = this.b;
                        zt ztVar = new zt(vg0Var.E, true);
                        ztVar.r = new gu(vg0Var, 20);
                        vg0Var.V.presentFragment(ztVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.zd0 zd0Var2 = new org.telegram.ui.Components.zd0(context, null);
        this.f = zd0Var2;
        zd0Var2.addView(linearLayout2, w7.x5.a(-2.0f, 16.0f, 8.0f, 16.0f, 8.0f, -1, 16));
        zd0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(zd0Var2, w7.x5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.x5.n(-2, -2));
        bk0 bk0Var = new bk0(this, context, 2);
        this.a = bk0Var;
        bk0Var.setInputType(3);
        bk0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        bk0Var.setCursorWidth(1.5f);
        bk0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        bk0Var.setTextSize(1, 16.0f);
        bk0Var.setMaxLines(1);
        bk0Var.setGravity(19);
        bk0Var.setImeOptions(268435461);
        bk0Var.setBackground(null);
        bk0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        bk0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(bk0Var, w7.x5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        bk0Var.addTextChangedListener(new m0(this, 10));
        final int i12 = 1;
        bk0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.mg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        vg0 vg0Var = this.b;
                        if (i13 != 5) {
                            vg0Var.getClass();
                            return false;
                        }
                        kg0 kg0Var = vg0Var.V.b0;
                        if (kg0Var != null) {
                            kg0Var.h.callOnClick();
                            return true;
                        }
                        vg0Var.h(null);
                        return true;
                    default:
                        sg0 sg0Var = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        sg0Var.requestFocus();
                        sg0Var.setSelection(sg0Var.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k10 = w7.x5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        sg0 sg0Var = new sg0(this, context);
        this.b = sg0Var;
        sg0Var.setInputType(3);
        sg0Var.setPadding(0, 0, 0, 0);
        sg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        sg0Var.setCursorWidth(1.5f);
        sg0Var.setTextSize(1, 16.0f);
        sg0Var.setMaxLines(1);
        sg0Var.setGravity(19);
        sg0Var.setImeOptions(268435461);
        sg0Var.setBackground(null);
        sg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        sg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(sg0Var, w7.x5.d(36.0f, -1));
        sg0Var.addTextChangedListener(new bs(this, 1));
        final int i13 = 0;
        sg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.mg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i132, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        vg0 vg0Var = this.b;
                        if (i132 != 5) {
                            vg0Var.getClass();
                            return false;
                        }
                        kg0 kg0Var = vg0Var.V.b0;
                        if (kg0Var != null) {
                            kg0Var.h.callOnClick();
                            return true;
                        }
                        vg0Var.h(null);
                        return true;
                    default:
                        sg0 sg0Var2 = this.b.b;
                        if (i132 != 5) {
                            return false;
                        }
                        sg0Var2.requestFocus();
                        sg0Var2.setSelection(sg0Var2.length());
                        return true;
                }
            }
        });
        if (wg0Var.x && wg0Var.F == 0) {
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 2);
            this.v = a2Var;
            a2Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", wg0Var.y, false, false);
            addView(a2Var, w7.x5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            final int i14 = 0;
            a2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ng0
                public final /* synthetic */ vg0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            wg0 wg0Var2 = this.b.V;
                            if (wg0Var2.getParentActivity() != null) {
                                boolean z10 = !wg0Var2.y;
                                wg0Var2.y = z10;
                                ((org.telegram.ui.Cells.a2) view2).c(z10, true);
                                if (!wg0Var2.y) {
                                    new org.telegram.ui.Components.ad(wg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    break;
                                } else {
                                    new org.telegram.ui.Components.ad(wg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    break;
                                }
                            }
                            break;
                        default:
                            vg0 vg0Var = this.b;
                            zt ztVar = new zt(vg0Var.E, true);
                            ztVar.r = new gu(vg0Var, 20);
                            vg0Var.V.presentFragment(ztVar);
                            break;
                    }
                }
            });
            i10 = 48;
        } else {
            i10 = 72;
        }
        boolean z10 = BuildVars.DEBUG_VERSION || wg0Var.getConnectionsManager().isTestBackend();
        if (z10 && wg0Var.F == 0) {
            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context, 2);
            this.w = a2Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = wg0Var.getConnectionsManager().isTestBackend();
            wg0Var.E = isTestBackend;
            a2Var2.e(string, "", isTestBackend, false, false);
            addView(a2Var2, w7.x5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            i10 -= 24;
            a2Var2.setOnClickListener(new ai.k3(8, this, z10));
        }
        if (i10 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i10));
            addView(space, w7.x5.n(-2, -2));
        }
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                ut utVar = new ut();
                utVar.a = split[2];
                String str = split[0];
                utVar.c = str;
                utVar.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(utVar.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(utVar.d, countryName)) {
                        utVar.b = utVar.a;
                        utVar.a = countryName;
                    }
                }
                this.E.add(0, utVar);
                List list = (List) this.F.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.F;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(utVar);
                if (split.length > 3) {
                    this.G.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        Collections.sort(this.E, Comparator$-CC.comparing(new k8(6)));
        try {
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        wg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new ac0(4, this, hashMap), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.x = 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            sg0 sg0Var2 = this.b;
            sg0Var2.setSelection(sg0Var2.length());
        } else {
            this.a.requestFocus();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.au.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.zd0 zd0Var = this.e;
        float f7 = charSequence != null ? 1.0f : 0.0f;
        zd0Var.b(f7, f7, true);
    }

    @Override // org.telegram.ui.Components.xw0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.xw0
    public final void d() {
        this.K = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override // org.telegram.ui.Components.xw0
    public final void f() {
        Runnable runnable = this.U;
        if (runnable != null) {
            runnable.run();
            this.U = null;
        }
    }

    @Override // org.telegram.ui.Components.xw0
    public String getHeaderName() {
        return LocaleController.getString("YourPhone", R.string.YourPhone);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.xw0
    public final void h(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i11;
        int i12;
        if (this.V.getParentActivity() == null || this.K || this.V.o0) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("sim status = " + telephonyManager.getSimState());
        }
        int i13 = 0;
        if (this.a.length() == 0 || this.b.length() == 0) {
            wg0.U0(this.V, this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        int i14 = 1;
        if (!this.L) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y && !this.V.h1() && this.V.S.R() > AndroidUtilities.dp(20.0f)) {
                wg0 wg0Var = this.V;
                wg0Var.T = new lg0(this, i14);
                AndroidUtilities.hideKeyboard(wg0Var.fragmentView);
                return;
            }
            wg0 wg0Var2 = this.V;
            Context context = this.V.fragmentView.getContext();
            wg0 wg0Var3 = this.V;
            wg0Var2.b0 = new kg0(context, (ViewGroup) wg0Var3.fragmentView, wg0Var3.N, str2, new ug0(this));
            kg0 kg0Var = this.V.b0;
            kg0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new jg0(kg0Var, i13));
            duration.addUpdateListener(new gg0(kg0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.hs.f);
            duration.start();
            return;
        }
        this.L = false;
        kg0 kg0Var2 = this.V.b0;
        if (kg0Var2 != null) {
            int i15 = kg0.E;
            kg0Var2.a();
        }
        boolean isSimAvailable = AndroidUtilities.isSimAvailable();
        int i16 = Build.VERSION.SDK_INT;
        if (isSimAvailable) {
            z12 = this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z13 = this.V.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            z14 = i16 < 28 || this.V.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z15 = i16 < 26 || this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            wg0 wg0Var4 = this.V;
            z10 = isSimAvailable;
            if (wg0Var4.v) {
                wg0Var4.r.clear();
                if (!z12) {
                    this.V.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z13) {
                    this.V.r.add("android.permission.CALL_PHONE");
                }
                if (!z14) {
                    this.V.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z15 && i16 >= 26) {
                    this.V.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!this.V.r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            this.V.getParentActivity().requestPermissions((String[]) this.V.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.V.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z12 && (!z13 || !z14)) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i12 = R.raw.calls_log;
                    } else if (z13 && z14) {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i12 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i12 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i12, 46, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
                    wg0 wg0Var5 = this.V;
                    wg0Var5.h = wg0Var5.showDialog(alertDialog$Builder.a);
                    this.L = true;
                    return;
                }
            }
            z11 = true;
        } else {
            z10 = isSimAvailable;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
        }
        int i17 = this.x;
        if (i17 == z11) {
            this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
            this.V.k1(false, z11);
            return;
        }
        if (i17 == 2 && !BuildVars.DEBUG_VERSION) {
            this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
            this.V.k1(false, true);
            return;
        }
        String d = hf.b.d("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
        wg0 wg0Var6 = this.V;
        if (wg0Var6.F == 0 && (wg0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i18 = 0; i18 < 4; i18++) {
                UserConfig userConfig = UserConfig.getInstance(i18);
                if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i18).isTestBackend();
                    wg0 wg0Var7 = this.V;
                    if (isTestBackend == wg0Var7.E) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg0Var7.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder2.a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                        alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.s(this, i18, 14));
                        alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                        this.V.showDialog(alertDialog$Builder2.a);
                        this.V.k1(false, true);
                        return;
                    }
                }
            }
        }
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        tL_codeSettings.allow_flashcall = z10 && z12 && z13 && z14;
        tL_codeSettings.allow_missed_call = z10 && z12;
        boolean hasServices = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
        tL_codeSettings.allow_firebase = hasServices;
        tL_codeSettings.allow_app_hash = hasServices;
        if (this.V.l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
            tL_codeSettings.allow_firebase = false;
        }
        ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
        if (savedLogInTokens != null) {
            for (int i19 = 0; i19 < savedLogInTokens.size(); i19++) {
                if (savedLogInTokens.get(i19).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i19).future_auth_token, StandardCharsets.UTF_8)));
                    }
                    tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i19).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
            }
        }
        ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
        if (savedLogOutTokens != null) {
            for (int i20 = 0; i20 < savedLogOutTokens.size(); i20++) {
                if (tL_codeSettings.logout_tokens == null) {
                    tL_codeSettings.logout_tokens = new ArrayList<>();
                }
                tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i20).future_auth_token);
                if (tL_codeSettings.logout_tokens.size() >= 20) {
                    break;
                }
            }
            AuthTokensHelper.saveLogOutTokens(savedLogOutTokens);
        }
        if (tL_codeSettings.logout_tokens != null) {
            tL_codeSettings.flags |= 64;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        sharedPreferences.edit().remove("sms_hash_code").apply();
        if (tL_codeSettings.allow_app_hash) {
            sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).apply();
        } else {
            sharedPreferences.edit().remove("sms_hash").apply();
        }
        if (tL_codeSettings.allow_flashcall) {
            try {
                HashSet V0 = wg0.V0(this.V);
                if (V0.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (UserConfig.getActivatedAccountsCount() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(V0).anyMatch(new r80(d, 1));
                }
            } catch (Exception e10) {
                tL_codeSettings.unknown_number = true;
                FileLog.e(e10);
            }
        }
        wg0 wg0Var8 = this.V;
        if (wg0Var8.F == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = d;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) wg0Var8).currentAccount;
            ConnectionsManager.getInstance(i10).cleanup(false);
            TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
            tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
            tL_auth_sendCode2.api_id = BuildVars.APP_ID;
            tL_auth_sendCode2.phone_number = d;
            tL_auth_sendCode2.settings = tL_codeSettings;
            tL_auth_sendCode = tL_auth_sendCode2;
        }
        TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText()));
        try {
            bundle.putString("ephone", "+" + hf.b.d(this.a.getText().toString(), false) + " " + hf.b.d(this.b.getText().toString(), false));
        } catch (Exception e11) {
            FileLog.e(e11);
            bundle.putString("ephone", "+" + d);
        }
        bundle.putString("phoneFormated", d);
        ut utVar = this.y;
        if (utVar != null) {
            bundle.putString("country", utVar.c);
        }
        this.K = true;
        la.h hVar = new la.h(17, false);
        hVar.d = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        hVar.b = this.y;
        hVar.c = (List) this.G.get(this.a.getText().toString());
        i11 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
        this.V.n1(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_sendCode3, new ci.hd(this, bundle, d, hVar, tL_auth_sendCode3, 9), 27), true);
    }

    @Override // org.telegram.ui.Components.xw0
    public final void j() {
        p();
        org.telegram.ui.Cells.a2 a2Var = this.v;
        if (a2Var != null) {
            a2Var.c(this.V.y, false);
        }
        AndroidUtilities.runOnUIThread(new lg0(this, 0), wg0.t0);
    }

    @Override // org.telegram.ui.Components.xw0
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.b.setText(string2);
        }
    }

    @Override // org.telegram.ui.Components.xw0
    public final void l(Bundle bundle) {
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override // org.telegram.ui.Components.xw0
    public final void n() {
        this.c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false);
        org.telegram.ui.Components.ea0 ea0Var = this.n;
        ea0Var.setTextColor(x02);
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.v11 v11Var = this.d;
            if (i10 >= v11Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) v11Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.i6.H6;
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        ImageView imageView = this.s;
        imageView.setColorFilter(x03);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(this.V.getThemedColor(org.telegram.ui.ActionBar.i6.i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        bk0 bk0Var = this.a;
        bk0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.i6.l6;
        bk0Var.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.k6, false));
        int x05 = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        sg0 sg0Var = this.b;
        sg0Var.setTextColor(x05);
        sg0Var.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        sg0Var.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        org.telegram.ui.Cells.a2 a2Var = this.v;
        if (a2Var != null) {
            int i14 = org.telegram.ui.ActionBar.i6.Y6;
            int i15 = org.telegram.ui.ActionBar.i6.W6;
            int i16 = org.telegram.ui.ActionBar.i6.X6;
            CheckBoxSquare checkBoxSquare = a2Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.w = i16;
                checkBoxSquare.invalidate();
            }
            a2Var.g();
        }
        org.telegram.ui.Cells.a2 a2Var2 = this.w;
        if (a2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.i6.Y6;
            int i18 = org.telegram.ui.ActionBar.i6.W6;
            int i19 = org.telegram.ui.ActionBar.i6.X6;
            CheckBoxSquare checkBoxSquare2 = a2Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.w = i19;
                checkBoxSquare2.invalidate();
            }
            a2Var2.g();
        }
        this.f.f();
        this.e.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        if (this.H) {
            this.H = false;
            return;
        }
        this.I = true;
        this.a.setText(((ut) this.E.get(i10)).c);
        this.I = false;
    }

    public final void p() {
        boolean z10;
        wg0 wg0Var;
        boolean z11;
        ut utVar;
        if (this.R || this.V.F != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (AndroidUtilities.isSimAvailable()) {
                int i10 = Build.VERSION.SDK_INT;
                boolean z12 = this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                if (i10 >= 26 && this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                    z10 = false;
                    wg0Var = this.V;
                    if (!wg0Var.w && (!z12 || !z10)) {
                        wg0Var.s.clear();
                        if (!z12) {
                            this.V.s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z10 && i10 >= 26) {
                            this.V.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.V.s.isEmpty()) {
                            return;
                        }
                        new tf0(3, this, new ArrayList(this.V.s)).run();
                        return;
                    }
                    this.R = true;
                    if (wg0Var.x && z12 && z10) {
                        this.a.setAlpha(0.0f);
                        this.b.setAlpha(0.0f);
                        String d = hf.b.d(telephonyManager.getLine1Number(), false);
                        if (!TextUtils.isEmpty(d)) {
                            int i11 = 4;
                            String str = null;
                            if (d.length() > 4) {
                                while (true) {
                                    if (i11 < 1) {
                                        z11 = false;
                                        break;
                                    }
                                    String substring = d.substring(0, i11);
                                    List list = (List) this.F.get(substring);
                                    if (list == null) {
                                        utVar = null;
                                    } else if (list.size() > 1) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                        utVar = (ut) list.get(list.size() - 1);
                                        if (string != null) {
                                            ArrayList arrayList = this.E;
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= size) {
                                                    break;
                                                }
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                ut utVar2 = (ut) obj;
                                                if (Objects.equals(utVar2.d, string)) {
                                                    utVar = utVar2;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        utVar = (ut) list.get(0);
                                    }
                                    if (utVar != null) {
                                        str = d.substring(i11);
                                        this.a.setText(substring);
                                        z11 = true;
                                        break;
                                    }
                                    i11--;
                                }
                                if (!z11) {
                                    str = d.substring(1);
                                    this.a.setText(d.substring(0, 1));
                                }
                            }
                            if (str != null) {
                                this.b.requestFocus();
                                this.b.setText(str);
                                sg0 sg0Var = this.b;
                                sg0Var.setSelection(sg0Var.length());
                            }
                        }
                        if (this.b.length() <= 0) {
                            this.a.setAlpha(1.0f);
                            this.b.setAlpha(1.0f);
                            return;
                        }
                        AnimatorSet duration = new AnimatorSet().setDuration(300L);
                        bk0 bk0Var = this.a;
                        Property property = View.ALPHA;
                        duration.playTogether(ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<sg0, Float>) property, 1.0f));
                        duration.start();
                        this.L = true;
                        return;
                    }
                    return;
                }
                z10 = true;
                wg0Var = this.V;
                if (!wg0Var.w) {
                }
                this.R = true;
                if (wg0Var.x) {
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void q() {
        int i10;
        String str = this.P;
        sg0 sg0Var = this.b;
        String replace = sg0Var.getText() != null ? sg0Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.G;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.Q != -1) {
                int selectionStart = sg0Var.getSelectionStart();
                int selectionEnd = sg0Var.getSelectionEnd();
                sg0Var.setHintText((String) null);
                sg0Var.setSelection(selectionStart, selectionEnd);
                this.Q = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i10 = 0;
            while (i10 < list.size()) {
                if (replace.startsWith(((String) list.get(i10)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -1;
        if (i10 == -1) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str2 = (String) list.get(i11);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 == -1) {
                i10 = 0;
            }
        }
        if (this.Q != i10) {
            String str3 = (String) ((List) hashMap.get(str)).get(i10);
            int selectionStart2 = sg0Var.getSelectionStart();
            int selectionEnd2 = sg0Var.getSelectionEnd();
            sg0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            sg0Var.setSelection(Math.max(0, Math.min(sg0Var.length(), selectionStart2)), Math.max(0, Math.min(sg0Var.length(), selectionEnd2)));
            this.Q = i10;
        }
    }

    public final void r() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        this.V.getConnectionsManager().sendRequest(tL_help_getCountriesList, new pg0(this, 0), 10);
    }

    public final void s(boolean z10) {
        int i10;
        wg0 wg0Var = this.V;
        if (wg0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.T) {
            if (z10 || !this.S) {
                this.T = true;
                this.S = true;
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                this.U = PasskeysController.login(context, i10, z10, new og0(this, 0));
            }
        }
    }

    public final void t(String str, ut utVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(utVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.b00(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) utVar.a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.P = str;
        this.Q = -1;
        q();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
