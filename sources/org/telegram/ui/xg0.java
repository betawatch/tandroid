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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xg0 extends org.telegram.ui.Components.vv0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
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
    public final /* synthetic */ yg0 V;
    public final ck0 a;
    public final ug0 b;
    public final TextView c;
    public final org.telegram.ui.Components.r01 d;
    public final org.telegram.ui.Components.yc0 e;
    public final org.telegram.ui.Components.yc0 f;
    public final TextView h;
    public final org.telegram.ui.Components.c90 n;
    public final View r;
    public final ImageView s;
    public final org.telegram.ui.Cells.z1 v;
    public final org.telegram.ui.Cells.z1 w;
    public int x;
    public xt y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(yg0 yg0Var, Context context) {
        super(context);
        int i10;
        this.V = yg0Var;
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
        textView.setText(LocaleController.getString(yg0Var.F == 2 ? R.string.ChangePhoneNewNumber : R.string.YourNumber));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.x5.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new uv(21, this, context));
        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(context, null);
        this.n = c90Var;
        c90Var.setText(LocaleController.getString(yg0Var.F == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
        c90Var.setTextSize(1, 14.0f);
        c90Var.setGravity(17);
        c90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(c90Var, w7.x5.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.r01 r01Var = new org.telegram.ui.Components.r01(context);
        this.d = r01Var;
        r01Var.setFactory(new tg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.kt.e);
        r01Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(r01Var, w7.x5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(context, null);
        this.e = yc0Var;
        yc0Var.setText(LocaleController.getString(R.string.Country));
        yc0Var.addView(linearLayout, w7.x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        yc0Var.setForceUseCenter(true);
        yc0Var.setFocusable(true);
        yc0Var.setContentDescription(LocaleController.getString(R.string.Country));
        yc0Var.setOnFocusChangeListener(new qd(this, 9));
        addView(yc0Var, w7.x5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        final int i11 = 1;
        yc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pg0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        yg0 yg0Var2 = this.b.V;
                        if (yg0Var2.getParentActivity() != null) {
                            boolean z10 = !yg0Var2.y;
                            yg0Var2.y = z10;
                            ((org.telegram.ui.Cells.z1) view).c(z10, true);
                            if (!yg0Var2.y) {
                                new org.telegram.ui.Components.vc(yg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                break;
                            } else {
                                new org.telegram.ui.Components.vc(yg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                break;
                            }
                        }
                        break;
                    default:
                        xg0 xg0Var = this.b;
                        cu cuVar = new cu(xg0Var.E, true);
                        cuVar.r = new gu(xg0Var, 21);
                        xg0Var.V.presentFragment(cuVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(context, null);
        this.f = yc0Var2;
        yc0Var2.addView(linearLayout2, w7.x5.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        yc0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(yc0Var2, w7.x5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
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
        ck0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.og0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        xg0 xg0Var = this.b;
                        if (i13 != 5) {
                            xg0Var.getClass();
                            return false;
                        }
                        mg0 mg0Var = xg0Var.V.b0;
                        if (mg0Var != null) {
                            mg0Var.h.callOnClick();
                            return true;
                        }
                        xg0Var.h(null);
                        return true;
                    default:
                        ug0 ug0Var = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        ug0Var.requestFocus();
                        ug0Var.setSelection(ug0Var.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k10 = w7.x5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        ug0 ug0Var = new ug0(this, context);
        this.b = ug0Var;
        ug0Var.setInputType(3);
        ug0Var.setPadding(0, 0, 0, 0);
        ug0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        ug0Var.setCursorWidth(1.5f);
        ug0Var.setTextSize(1, 16.0f);
        ug0Var.setMaxLines(1);
        ug0Var.setGravity(19);
        ug0Var.setImeOptions(268435461);
        ug0Var.setBackground(null);
        ug0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        ug0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(ug0Var, w7.x5.c(36.0f, -1));
        ug0Var.addTextChangedListener(new es(this, 1));
        final int i13 = 0;
        ug0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.og0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i132, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        xg0 xg0Var = this.b;
                        if (i132 != 5) {
                            xg0Var.getClass();
                            return false;
                        }
                        mg0 mg0Var = xg0Var.V.b0;
                        if (mg0Var != null) {
                            mg0Var.h.callOnClick();
                            return true;
                        }
                        xg0Var.h(null);
                        return true;
                    default:
                        ug0 ug0Var2 = this.b.b;
                        if (i132 != 5) {
                            return false;
                        }
                        ug0Var2.requestFocus();
                        ug0Var2.setSelection(ug0Var2.length());
                        return true;
                }
            }
        });
        if (yg0Var.x && yg0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 2);
            this.v = z1Var;
            z1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", yg0Var.y, false, false);
            addView(z1Var, w7.x5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            final int i14 = 0;
            z1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pg0
                public final /* synthetic */ xg0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            yg0 yg0Var2 = this.b.V;
                            if (yg0Var2.getParentActivity() != null) {
                                boolean z10 = !yg0Var2.y;
                                yg0Var2.y = z10;
                                ((org.telegram.ui.Cells.z1) view2).c(z10, true);
                                if (!yg0Var2.y) {
                                    new org.telegram.ui.Components.vc(yg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    break;
                                } else {
                                    new org.telegram.ui.Components.vc(yg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    break;
                                }
                            }
                            break;
                        default:
                            xg0 xg0Var = this.b;
                            cu cuVar = new cu(xg0Var.E, true);
                            cuVar.r = new gu(xg0Var, 21);
                            xg0Var.V.presentFragment(cuVar);
                            break;
                    }
                }
            });
            i10 = 48;
        } else {
            i10 = 72;
        }
        boolean z10 = BuildVars.DEBUG_VERSION || yg0Var.getConnectionsManager().isTestBackend();
        if (z10 && yg0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 2);
            this.w = z1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = yg0Var.getConnectionsManager().isTestBackend();
            yg0Var.E = isTestBackend;
            z1Var2.e(string, "", isTestBackend, false, false);
            addView(z1Var2, w7.x5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            i10 -= 24;
            z1Var2.setOnClickListener(new ai.j3(8, this, z10));
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
                xt xtVar = new xt();
                xtVar.a = split[2];
                String str = split[0];
                xtVar.c = str;
                xtVar.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(xtVar.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(xtVar.d, countryName)) {
                        xtVar.b = xtVar.a;
                        xtVar.a = countryName;
                    }
                }
                this.E.add(0, xtVar);
                List list = (List) this.F.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.F;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(xtVar);
                if (split.length > 3) {
                    this.G.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.E, Comparator$-CC.comparing(new n8(6)));
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        yg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new dc0(4, this, hashMap), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.x = 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            ug0 ug0Var2 = this.b;
            ug0Var2.setSelection(ug0Var2.length());
        } else {
            this.a.requestFocus();
        }
        s();
    }

    public static void o(xg0 xg0Var, ArrayList arrayList) {
        yg0 yg0Var = xg0Var.V;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !yg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            yg0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.T = string;
        yg0Var.n = yg0Var.showDialog(c2Var, true, null);
        yg0Var.c0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.kt.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.yc0 yc0Var = this.e;
        float f7 = charSequence != null ? 1.0f : 0.0f;
        yc0Var.b(f7, f7, true);
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.vv0
    public final void d() {
        this.K = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public final void f() {
        Runnable runnable = this.U;
        if (runnable != null) {
            runnable.run();
            this.U = null;
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public String getHeaderName() {
        return LocaleController.getString("YourPhone", R.string.YourPhone);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.vv0
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
            yg0.U0(this.V, this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        int i14 = 1;
        if (!this.L) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y && !this.V.h1() && this.V.S.R() > AndroidUtilities.dp(20.0f)) {
                yg0 yg0Var = this.V;
                yg0Var.T = new ng0(this, i14);
                AndroidUtilities.hideKeyboard(yg0Var.fragmentView);
                return;
            }
            yg0 yg0Var2 = this.V;
            Context context = this.V.fragmentView.getContext();
            yg0 yg0Var3 = this.V;
            yg0Var2.b0 = new mg0(context, (ViewGroup) yg0Var3.fragmentView, yg0Var3.N, str2, new wg0(this));
            mg0 mg0Var = this.V.b0;
            mg0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new lg0(mg0Var, i13));
            duration.addUpdateListener(new ig0(mg0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.qr.f);
            duration.start();
            return;
        }
        this.L = false;
        mg0 mg0Var2 = this.V.b0;
        if (mg0Var2 != null) {
            int i15 = mg0.E;
            mg0Var2.a();
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
            yg0 yg0Var4 = this.V;
            z10 = isSimAvailable;
            if (yg0Var4.v) {
                yg0Var4.r.clear();
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
                        } catch (Exception e) {
                            FileLog.e(e);
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
                    yg0 yg0Var5 = this.V;
                    yg0Var5.h = yg0Var5.showDialog(alertDialog$Builder.a);
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
        yg0 yg0Var6 = this.V;
        if (yg0Var6.F == 0 && (yg0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i18 = 0; i18 < 4; i18++) {
                UserConfig userConfig = UserConfig.getInstance(i18);
                if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i18).isTestBackend();
                    yg0 yg0Var7 = this.V;
                    if (isTestBackend == yg0Var7.E) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yg0Var7.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder2.a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                        alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.s(this, i18, 13));
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
                HashSet V0 = yg0.V0(this.V);
                if (V0.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (UserConfig.getActivatedAccountsCount() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(V0).anyMatch(new t80(d, 1));
                }
            } catch (Exception e7) {
                tL_codeSettings.unknown_number = true;
                FileLog.e(e7);
            }
        }
        yg0 yg0Var8 = this.V;
        if (yg0Var8.F == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = d;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) yg0Var8).currentAccount;
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
        } catch (Exception e10) {
            FileLog.e(e10);
            bundle.putString("ephone", "+" + d);
        }
        bundle.putString("phoneFormated", d);
        xt xtVar = this.y;
        if (xtVar != null) {
            bundle.putString("country", xtVar.c);
        }
        this.K = true;
        lf.i iVar = new lf.i(16, false);
        iVar.d = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        iVar.b = this.y;
        iVar.c = (List) this.G.get(this.a.getText().toString());
        i11 = ((org.telegram.ui.ActionBar.o2) this.V).currentAccount;
        this.V.n1(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_sendCode3, new ci.kd(this, bundle, d, iVar, tL_auth_sendCode3, 9), 27), true);
    }

    @Override // org.telegram.ui.Components.vv0
    public final void j() {
        q();
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            z1Var.c(this.V.y, false);
        }
        AndroidUtilities.runOnUIThread(new ng0(this, 0), yg0.t0);
    }

    @Override // org.telegram.ui.Components.vv0
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

    @Override // org.telegram.ui.Components.vv0
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

    @Override // org.telegram.ui.Components.vv0
    public final void n() {
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.c90 c90Var = this.n;
        c90Var.setTextColor(w02);
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.r01 r01Var = this.d;
            if (i10 >= r01Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) r01Var.getChildAt(i10);
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
        ug0 ug0Var = this.b;
        ug0Var.setTextColor(w05);
        ug0Var.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        ug0Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
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
        this.a.setText(((xt) this.E.get(i10)).c);
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
        xt xtVar;
        yg0 yg0Var;
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
                        yg0Var = this.V;
                        if (yg0Var.w && (!z10 || !z11)) {
                            yg0Var.s.clear();
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
                    yg0Var = this.V;
                    if (yg0Var.w) {
                        yg0Var.s.clear();
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
                                    xtVar = null;
                                } else if (list.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                    xtVar = (xt) list.get(list.size() - 1);
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
                                            xt xtVar2 = (xt) obj;
                                            if (Objects.equals(xtVar2.d, string)) {
                                                xtVar = xtVar2;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    xtVar = (xt) list.get(0);
                                }
                                if (xtVar != null) {
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
                            ug0 ug0Var = this.b;
                            ug0Var.setSelection(ug0Var.length());
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
                    duration.playTogether(ObjectAnimator.ofFloat(ck0Var, (Property<ck0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<ug0, Float>) property, 1.0f));
                    duration.start();
                    this.L = true;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void r() {
        int i10;
        String str = this.P;
        ug0 ug0Var = this.b;
        String replace = ug0Var.getText() != null ? ug0Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.G;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.Q != -1) {
                int selectionStart = ug0Var.getSelectionStart();
                int selectionEnd = ug0Var.getSelectionEnd();
                ug0Var.setHintText((String) null);
                ug0Var.setSelection(selectionStart, selectionEnd);
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
            int selectionStart2 = ug0Var.getSelectionStart();
            int selectionEnd2 = ug0Var.getSelectionEnd();
            ug0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            ug0Var.setSelection(Math.max(0, Math.min(ug0Var.length(), selectionStart2)), Math.max(0, Math.min(ug0Var.length(), selectionEnd2)));
            this.Q = i10;
        }
    }

    public final void s() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        this.V.getConnectionsManager().sendRequest(tL_help_getCountriesList, new rg0(this, 0), 10);
    }

    public final void u(boolean z10) {
        int i10;
        yg0 yg0Var = this.V;
        if (yg0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.T) {
            if (z10 || !this.S) {
                this.T = true;
                this.S = true;
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                this.U = PasskeysController.login(context, i10, z10, new qg0(this, 0));
            }
        }
    }

    public final void v(String str, xt xtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(xtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) xtVar.a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.P = str;
        this.Q = -1;
        r();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
