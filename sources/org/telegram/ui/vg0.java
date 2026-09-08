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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vg0 extends org.telegram.ui.Components.tv0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
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
    public final ck0 a;
    public final sg0 b;
    public final TextView c;
    public final org.telegram.ui.Components.p01 d;
    public final org.telegram.ui.Components.zc0 e;
    public final org.telegram.ui.Components.zc0 f;
    public final TextView h;
    public final org.telegram.ui.Components.d90 n;
    public final View r;
    public final ImageView s;
    public final org.telegram.ui.Cells.z1 v;
    public final org.telegram.ui.Cells.z1 w;
    public int x;
    public vt y;

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
        com.google.android.gms.internal.vision.e2.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(wg0Var.F == 2 ? R.string.ChangePhoneNewNumber : R.string.YourNumber));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.x5.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new tv(21, this, context));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        this.n = d90Var;
        d90Var.setText(LocaleController.getString(wg0Var.F == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(17);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(d90Var, w7.x5.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.p01 p01Var = new org.telegram.ui.Components.p01(context);
        this.d = p01Var;
        p01Var.setFactory(new rg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.jt.e);
        p01Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(p01Var, w7.x5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.zc0 zc0Var = new org.telegram.ui.Components.zc0(context, null);
        this.e = zc0Var;
        zc0Var.setText(LocaleController.getString(R.string.Country));
        zc0Var.addView(linearLayout, w7.x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        zc0Var.setForceUseCenter(true);
        zc0Var.setFocusable(true);
        zc0Var.setContentDescription(LocaleController.getString(R.string.Country));
        zc0Var.setOnFocusChangeListener(new pd(this, 9));
        addView(zc0Var, w7.x5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        final int i11 = 1;
        zc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ng0
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
                            ((org.telegram.ui.Cells.z1) view).c(z10, true);
                            if (!wg0Var2.y) {
                                new org.telegram.ui.Components.yc(wg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                break;
                            } else {
                                new org.telegram.ui.Components.yc(wg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                break;
                            }
                        }
                        break;
                    default:
                        vg0 vg0Var = this.b;
                        bu buVar = new bu(vg0Var.E, true);
                        buVar.r = new iu(vg0Var, 20);
                        vg0Var.V.presentFragment(buVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.zc0 zc0Var2 = new org.telegram.ui.Components.zc0(context, null);
        this.f = zc0Var2;
        zc0Var2.addView(linearLayout2, w7.x5.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        zc0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(zc0Var2, w7.x5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.x5.n(-2, -2));
        ck0 ck0Var = new ck0(this, context, 2);
        this.a = ck0Var;
        ck0Var.setInputType(3);
        ck0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        ck0Var.setCursorWidth(1.5f);
        ck0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        ck0Var.setTextSize(1, 16.0f);
        ck0Var.setMaxLines(1);
        ck0Var.setGravity(19);
        ck0Var.setImeOptions(268435461);
        ck0Var.setBackground(null);
        ck0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        ck0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(ck0Var, w7.x5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ck0Var.addTextChangedListener(new l0(this, 10));
        final int i12 = 1;
        ck0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.mg0
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
        linearLayout2.addView(sg0Var, w7.x5.c(36.0f, -1));
        sg0Var.addTextChangedListener(new ds(this, 1));
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
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 2);
            this.v = z1Var;
            z1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", wg0Var.y, false, false);
            addView(z1Var, w7.x5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            final int i14 = 0;
            z1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ng0
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
                                ((org.telegram.ui.Cells.z1) view2).c(z10, true);
                                if (!wg0Var2.y) {
                                    new org.telegram.ui.Components.yc(wg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    break;
                                } else {
                                    new org.telegram.ui.Components.yc(wg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    break;
                                }
                            }
                            break;
                        default:
                            vg0 vg0Var = this.b;
                            bu buVar = new bu(vg0Var.E, true);
                            buVar.r = new iu(vg0Var, 20);
                            vg0Var.V.presentFragment(buVar);
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
            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 2);
            this.w = z1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = wg0Var.getConnectionsManager().isTestBackend();
            wg0Var.E = isTestBackend;
            z1Var2.e(string, "", isTestBackend, false, false);
            addView(z1Var2, w7.x5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            i10 -= 24;
            z1Var2.setOnClickListener(new bi.w2(8, this, z10));
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
                vt vtVar = new vt();
                vtVar.a = split[2];
                String str = split[0];
                vtVar.c = str;
                vtVar.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(vtVar.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(vtVar.d, countryName)) {
                        vtVar.b = vtVar.a;
                        vtVar.a = countryName;
                    }
                }
                this.E.add(0, vtVar);
                List list = (List) this.F.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.F;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(vtVar);
                if (split.length > 3) {
                    this.G.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        Collections.sort(this.E, Comparator$-CC.comparing(new l8(6)));
        try {
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        wg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new bc0(4, this, hashMap), 10);
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
        s();
    }

    public static void o(vg0 vg0Var, ArrayList arrayList) {
        wg0 wg0Var = vg0Var.V;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !wg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            wg0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.T = string;
        wg0Var.n = wg0Var.showDialog(b2Var, true, null);
        wg0Var.c0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.jt.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.zc0 zc0Var = this.e;
        float f7 = charSequence != null ? 1.0f : 0.0f;
        zc0Var.b(f7, f7, true);
    }

    @Override // org.telegram.ui.Components.tv0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.tv0
    public final void d() {
        this.K = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public final void f() {
        Runnable runnable = this.U;
        if (runnable != null) {
            runnable.run();
            this.U = null;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public String getHeaderName() {
        return LocaleController.getString("YourPhone", R.string.YourPhone);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.tv0
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
            duration.setInterpolator(org.telegram.ui.Components.pr.f);
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
        if (i16 < 23 || !isSimAvailable) {
            z10 = isSimAvailable;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
        } else {
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
                    alertDialog$Builder.m(i12, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                    wg0 wg0Var5 = this.V;
                    wg0Var5.h = wg0Var5.showDialog(alertDialog$Builder.a);
                    this.L = true;
                    return;
                }
            }
            z11 = true;
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
        String d = gf.b.d("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
        wg0 wg0Var6 = this.V;
        int i18 = 13;
        if (wg0Var6.F == 0 && (wg0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i19 = 0; i19 < 4; i19++) {
                UserConfig userConfig = UserConfig.getInstance(i19);
                if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i19).isTestBackend();
                    wg0 wg0Var7 = this.V;
                    if (isTestBackend == wg0Var7.E) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg0Var7.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder2.a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                        alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.t(this, i19, i18));
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
            for (int i20 = 0; i20 < savedLogInTokens.size(); i20++) {
                if (savedLogInTokens.get(i20).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i20).future_auth_token, StandardCharsets.UTF_8)));
                    }
                    tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i20).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
            }
        }
        ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
        if (savedLogOutTokens != null) {
            for (int i21 = 0; i21 < savedLogOutTokens.size(); i21++) {
                if (tL_codeSettings.logout_tokens == null) {
                    tL_codeSettings.logout_tokens = new ArrayList<>();
                }
                tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i21).future_auth_token);
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
                    tL_codeSettings.current_number = Collection.-EL.stream(V0).anyMatch(new s80(d, 1));
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
            bundle.putString("ephone", "+" + gf.b.d(this.a.getText().toString(), false) + " " + gf.b.d(this.b.getText().toString(), false));
        } catch (Exception e11) {
            FileLog.e(e11);
            bundle.putString("ephone", "+" + d);
        }
        bundle.putString("phoneFormated", d);
        vt vtVar = this.y;
        if (vtVar != null) {
            bundle.putString("country", vtVar.c);
        }
        this.K = true;
        m2.t tVar = new m2.t(i18, false);
        tVar.d = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        tVar.b = this.y;
        tVar.c = (List) this.G.get(this.a.getText().toString());
        i11 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
        this.V.n1(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_sendCode3, new di.kd(this, bundle, d, tVar, tL_auth_sendCode3, 9), 27), true);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void j() {
        q();
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            z1Var.c(this.V.y, false);
        }
        AndroidUtilities.runOnUIThread(new lg0(this, 0), wg0.t0);
    }

    @Override // org.telegram.ui.Components.tv0
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

    @Override // org.telegram.ui.Components.tv0
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

    @Override // org.telegram.ui.Components.tv0
    public final void n() {
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.d90 d90Var = this.n;
        d90Var.setTextColor(w02);
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.p01 p01Var = this.d;
            if (i10 >= p01Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) p01Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        ImageView imageView = this.s;
        imageView.setColorFilter(w03);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(this.V.getThemedColor(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        ck0 ck0Var = this.a;
        ck0Var.setTextColor(w04);
        int i13 = org.telegram.ui.ActionBar.j6.l6;
        ck0Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k6, false));
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        sg0 sg0Var = this.b;
        sg0Var.setTextColor(w05);
        sg0Var.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        sg0Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            int i14 = org.telegram.ui.ActionBar.j6.Y6;
            int i15 = org.telegram.ui.ActionBar.j6.W6;
            int i16 = org.telegram.ui.ActionBar.j6.X6;
            CheckBoxSquare checkBoxSquare = z1Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.w = i16;
                checkBoxSquare.invalidate();
            }
            z1Var.g();
        }
        org.telegram.ui.Cells.z1 z1Var2 = this.w;
        if (z1Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.j6.Y6;
            int i18 = org.telegram.ui.ActionBar.j6.W6;
            int i19 = org.telegram.ui.ActionBar.j6.X6;
            CheckBoxSquare checkBoxSquare2 = z1Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.w = i19;
                checkBoxSquare2.invalidate();
            }
            z1Var2.g();
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
        this.a.setText(((vt) this.E.get(i10)).c);
        this.I = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:6:0x000e, B:8:0x001e, B:10:0x0026, B:15:0x003b, B:19:0x004e, B:23:0x0058, B:25:0x005f, B:28:0x006a, B:29:0x0071, B:31:0x007b, B:35:0x008a, B:39:0x0096, B:41:0x00af, B:44:0x00b9, B:50:0x0118, B:52:0x0129, B:48:0x0123, B:53:0x00c9, B:55:0x00cf, B:57:0x00f5, B:59:0x00fe, B:65:0x0110, B:69:0x0138, B:70:0x014b, B:72:0x0155, B:74:0x0186), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:6:0x000e, B:8:0x001e, B:10:0x0026, B:15:0x003b, B:19:0x004e, B:23:0x0058, B:25:0x005f, B:28:0x006a, B:29:0x0071, B:31:0x007b, B:35:0x008a, B:39:0x0096, B:41:0x00af, B:44:0x00b9, B:50:0x0118, B:52:0x0129, B:48:0x0123, B:53:0x00c9, B:55:0x00cf, B:57:0x00f5, B:59:0x00fe, B:65:0x0110, B:69:0x0138, B:70:0x014b, B:72:0x0155, B:74:0x0186), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        boolean z10;
        boolean z11;
        boolean z12;
        vt vtVar;
        wg0 wg0Var;
        if (this.R || this.V.F != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (AndroidUtilities.isSimAvailable()) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    z10 = this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                    if (i10 >= 26 && this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z11 = false;
                        wg0Var = this.V;
                        if (wg0Var.w && (!z10 || !z11)) {
                            wg0Var.s.clear();
                            if (!z10) {
                                this.V.s.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z11 && i10 >= 26) {
                                this.V.s.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (this.V.s.isEmpty()) {
                                o(this, new ArrayList(this.V.s));
                                return;
                            }
                            return;
                        }
                    }
                    z11 = true;
                    wg0Var = this.V;
                    if (wg0Var.w) {
                        wg0Var.s.clear();
                        if (!z10) {
                        }
                        if (!z11) {
                            this.V.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.V.s.isEmpty()) {
                        }
                    }
                } else {
                    z10 = true;
                    z11 = true;
                }
                this.R = true;
                if (!this.V.x && z10 && z11) {
                    this.a.setAlpha(0.0f);
                    this.b.setAlpha(0.0f);
                    String d = gf.b.d(telephonyManager.getLine1Number(), false);
                    if (!TextUtils.isEmpty(d)) {
                        int i11 = 4;
                        String str = null;
                        if (d.length() > 4) {
                            while (true) {
                                if (i11 < 1) {
                                    z12 = false;
                                    break;
                                }
                                String substring = d.substring(0, i11);
                                List list = (List) this.F.get(substring);
                                if (list == null) {
                                    vtVar = null;
                                } else if (list.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                    vtVar = (vt) list.get(list.size() - 1);
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
                                            vt vtVar2 = (vt) obj;
                                            if (Objects.equals(vtVar2.d, string)) {
                                                vtVar = vtVar2;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    vtVar = (vt) list.get(0);
                                }
                                if (vtVar != null) {
                                    str = d.substring(i11);
                                    this.a.setText(substring);
                                    z12 = true;
                                    break;
                                }
                                i11--;
                            }
                            if (!z12) {
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
                    ck0 ck0Var = this.a;
                    Property property = View.ALPHA;
                    duration.playTogether(ObjectAnimator.ofFloat(ck0Var, (Property<ck0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<sg0, Float>) property, 1.0f));
                    duration.start();
                    this.L = true;
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void r() {
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

    public final void s() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        this.V.getConnectionsManager().sendRequest(tL_help_getCountriesList, new pg0(this, 0), 10);
    }

    public final void u(boolean z10) {
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

    public final void v(String str, vt vtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(vtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) vtVar.a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.P = str;
        this.Q = -1;
        r();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
