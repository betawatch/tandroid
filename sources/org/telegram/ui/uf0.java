package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class uf0 extends org.telegram.ui.Components.uv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int t0 = 0;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.bj0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public final org.telegram.ui.Components.yi0 N;
    public final org.telegram.ui.Components.yi0 O;
    public final org.telegram.ui.Components.yi0 P;
    public boolean Q;
    public Timer R;
    public Timer S;
    public int T;
    public final Object U;
    public int V;
    public int W;
    public final org.telegram.ui.Components.yi0 a;
    public double a0;
    public String b;
    public double b0;
    public String c;
    public boolean c0;
    public String d;
    public boolean d0;
    public String e;
    public String e0;
    public final zr f;
    public final int f0;
    public int g0;
    public final org.telegram.ui.Components.voip.n2 h;
    public int h0;
    public boolean i0;
    public String j0;
    public String k0;
    public String l0;
    public int m0;
    public final TextView n;
    public String n0;
    public Bundle o0;
    public TLRPC.TL_auth_sentCode p0;
    public boolean q0;
    public final TextView r;
    public final hf0 r0;
    public final org.telegram.ui.Components.bj0 s;
    public final /* synthetic */ rg0 s0;
    public final sf0 v;
    public final ae0 w;
    public final sf0 x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x047d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uf0(rg0 rg0Var, Context context, int i10) {
        super(context);
        ViewGroup viewGroup;
        this.s0 = rg0Var;
        this.U = new Object();
        this.V = 60000;
        this.W = 15000;
        this.e0 = "";
        this.i0 = false;
        this.j0 = "*";
        this.k0 = "";
        this.r0 = new hf0(this, 2);
        this.f0 = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        com.google.android.gms.internal.vision.e2.l(18.0f, 1, textView2);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        String string = rg0Var.F != 1 ? null : LocaleController.getString(R.string.CancelAccountReset);
        if (i10 == 11) {
            textView2.setText(string == null ? LocaleController.getString(R.string.MissedCallDescriptionTitle) : string);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.L = imageView;
            ImageView imageView2 = new ImageView(context);
            this.M = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, w7.x5.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, w7.x5.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.J = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.z0.m(R.string.MissedCallDescriptionSubtitle, textView3);
            addView(textView3, w7.x5.t(-1, -2, 49, 36, 16, 36, 0));
            rf0 rf0Var = new rf0(this, context, 0);
            this.f = rf0Var;
            LinearLayout f7 = org.telegram.messenger.ul.f(context, 0);
            TextView textView4 = new TextView(context);
            this.I = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            f7.addView(textView4, w7.x5.t(-2, -1, 16, 0, 0, 4, 0));
            f7.addView(rf0Var, w7.x5.n(-2, -1));
            addView(f7, w7.x5.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.K = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.z0.m(R.string.MissedCallDescriptionSubtitle2, textView5);
            addView(textView5, w7.x5.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            if (i10 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, w7.x5.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, w7.x5.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, w7.x5.e(-2, -2, 1));
                org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(context);
                this.s = bj0Var;
                org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.phone_flash_call, AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                this.a = yi0Var;
                bj0Var.setAnimation(yi0Var);
                frameLayout3.addView(bj0Var, w7.x5.c(64.0f, 64));
                textView2.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i10 != 11) {
                    rf0 rf0Var2 = new rf0(this, context, 1);
                    this.f = rf0Var2;
                    addView(rf0Var2, w7.x5.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i10 == 3) {
                    this.f.setVisibility(8);
                }
                org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(rg0Var, context);
                this.h = n2Var;
                int i11 = org.telegram.ui.ActionBar.h6.I6;
                n2Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                n2Var.setTextColor(rg0Var.getThemedColor(i11));
                n2Var.setTextSize(1, 14.0f);
                n2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                n2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i12 = 0;
                n2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pf0
                    public final /* synthetic */ uf0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i12) {
                            case 0:
                                this.b.c(true);
                                break;
                            case 1:
                                uf0 uf0Var = this.b;
                                sf0 sf0Var = uf0Var.v;
                                if (uf0Var.V <= 0 || uf0Var.R == null) {
                                    uf0Var.i0 = true;
                                    sf0Var.invalidate();
                                    sf0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false));
                                    int i14 = uf0Var.g0;
                                    if (i14 != 4 && i14 != 2 && i14 != 17 && i14 != 16 && i14 != 11 && i14 != 15) {
                                        if (i14 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(uf0Var, NotificationCenter.didReceiveSmsCode);
                                            uf0Var.c0 = false;
                                            uf0Var.v();
                                            uf0Var.i0 = false;
                                            uf0Var.x();
                                            break;
                                        }
                                    } else {
                                        if (i14 == 4 || i14 == 11) {
                                            sf0Var.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            sf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", uf0Var.b);
                                        bundle.putString("ephone", uf0Var.e);
                                        bundle.putString("phoneFormated", uf0Var.d);
                                        bundle.putInt("prevType", uf0Var.f0);
                                        uf0Var.s();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = uf0Var.d;
                                        tL_auth_resendCode.phone_code_hash = uf0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.n2) uf0Var.s0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new mf0(uf0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                uf0 uf0Var2 = this.b;
                                uf0Var2.getClass();
                                try {
                                    uf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uf0Var2.n0)));
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                        }
                    }
                });
                addView(n2Var, w7.x5.t(-2, -2, 1, 0, 18, 0, 0));
                n2Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.y = frameLayout4;
                sf0 sf0Var = new sf0(this, context, 0);
                this.v = sf0Var;
                sf0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                sf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                sf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                sf0Var.setTextSize(1, 15.0f);
                sf0Var.setGravity(51);
                final int i13 = 1;
                sf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pf0
                    public final /* synthetic */ uf0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i132;
                        switch (i13) {
                            case 0:
                                this.b.c(true);
                                break;
                            case 1:
                                uf0 uf0Var = this.b;
                                sf0 sf0Var2 = uf0Var.v;
                                if (uf0Var.V <= 0 || uf0Var.R == null) {
                                    uf0Var.i0 = true;
                                    sf0Var2.invalidate();
                                    sf0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false));
                                    int i14 = uf0Var.g0;
                                    if (i14 != 4 && i14 != 2 && i14 != 17 && i14 != 16 && i14 != 11 && i14 != 15) {
                                        if (i14 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(uf0Var, NotificationCenter.didReceiveSmsCode);
                                            uf0Var.c0 = false;
                                            uf0Var.v();
                                            uf0Var.i0 = false;
                                            uf0Var.x();
                                            break;
                                        }
                                    } else {
                                        if (i14 == 4 || i14 == 11) {
                                            sf0Var2.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            sf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", uf0Var.b);
                                        bundle.putString("ephone", uf0Var.e);
                                        bundle.putString("phoneFormated", uf0Var.d);
                                        bundle.putInt("prevType", uf0Var.f0);
                                        uf0Var.s();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = uf0Var.d;
                                        tL_auth_resendCode.phone_code_hash = uf0Var.c;
                                        i132 = ((org.telegram.ui.ActionBar.n2) uf0Var.s0).currentAccount;
                                        ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new mf0(uf0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                uf0 uf0Var2 = this.b;
                                uf0Var2.getClass();
                                try {
                                    uf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uf0Var2.n0)));
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                        }
                    }
                });
                frameLayout4.addView(sf0Var, w7.x5.e(-2, -2, 49));
                ae0 ae0Var = new ae0(context, 1);
                this.w = ae0Var;
                if (i10 == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = org.telegram.ui.Components.lt.e;
                    loadAnimation.setInterpolator(interpolator);
                    ae0Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    ae0Var.setOutAnimation(loadAnimation2);
                    sf0 sf0Var2 = new sf0(this, context, 1);
                    this.x = sf0Var2;
                    sf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    sf0Var2.setTextSize(1, 15.0f);
                    sf0Var2.setGravity(49);
                    sf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    frameLayout4.addView(sf0Var2, w7.x5.e(-1, -2, 17));
                    ae0Var.addView(frameLayout4, w7.x5.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = org.telegram.ui.Components.rr.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    ae0Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    ae0Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.F = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    int dp = AndroidUtilities.dp(6.0f);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Wh, false);
                    int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Q9, false);
                    linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, w02, w03, w03));
                    final int i14 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pf0
                        public final /* synthetic */ uf0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i132;
                            switch (i14) {
                                case 0:
                                    this.b.c(true);
                                    break;
                                case 1:
                                    uf0 uf0Var = this.b;
                                    sf0 sf0Var22 = uf0Var.v;
                                    if (uf0Var.V <= 0 || uf0Var.R == null) {
                                        uf0Var.i0 = true;
                                        sf0Var22.invalidate();
                                        sf0Var22.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false));
                                        int i142 = uf0Var.g0;
                                        if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                            if (i142 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                NotificationCenter.getGlobalInstance().removeObserver(uf0Var, NotificationCenter.didReceiveSmsCode);
                                                uf0Var.c0 = false;
                                                uf0Var.v();
                                                uf0Var.i0 = false;
                                                uf0Var.x();
                                                break;
                                            }
                                        } else {
                                            if (i142 == 4 || i142 == 11) {
                                                sf0Var22.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                sf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", uf0Var.b);
                                            bundle.putString("ephone", uf0Var.e);
                                            bundle.putString("phoneFormated", uf0Var.d);
                                            bundle.putInt("prevType", uf0Var.f0);
                                            uf0Var.s();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = uf0Var.d;
                                            tL_auth_resendCode.phone_code_hash = uf0Var.c;
                                            i132 = ((org.telegram.ui.ActionBar.n2) uf0Var.s0).currentAccount;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new mf0(uf0Var, bundle, 0), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    uf0 uf0Var2 = this.b;
                                    uf0Var2.getClass();
                                    try {
                                        uf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uf0Var2.n0)));
                                        break;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                            }
                        }
                    });
                    ae0Var.addView(linearLayout2, w7.x5.c(52.0f, -1));
                    org.telegram.ui.Components.bj0 bj0Var2 = new org.telegram.ui.Components.bj0(context);
                    this.G = bj0Var2;
                    bj0Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(bj0Var2, w7.x5.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(LocaleController.getString(R.string.OpenFragment));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(AndroidUtilities.bold());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.E = textView7;
                textView7.setLineSpacing(org.telegram.ui.Cells.q3.b(2.0f, R.string.WrongCode, textView7), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                ae0Var.addView(textView7, w7.x5.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(ae0Var, w7.x5.d(i10 == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, w7.x5.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(ae0Var, w7.x5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                n7.a1.j(ae0Var);
                if (i10 == 15) {
                    this.x.setOnClickListener(new pv(20, this, context));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, w7.x5.t(-2, -2, 49, 0, 16, 0, 0));
            int i15 = i10 == 1 ? 128 : 64;
            if (i10 == 1) {
                float f10 = i15;
                this.a = new org.telegram.ui.Components.yi0(R.raw.code_laptop, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
            } else {
                float f11 = i15;
                this.a = new org.telegram.ui.Components.yi0(R.raw.sms_incoming_info, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
                this.N = new org.telegram.ui.Components.yi0(R.raw.phone_stars_to_dots, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
                this.O = new org.telegram.ui.Components.yi0(R.raw.phone_dots, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
                this.P = new org.telegram.ui.Components.yi0(R.raw.phone_dots_to_stars, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
            }
            org.telegram.ui.Components.bj0 bj0Var3 = new org.telegram.ui.Components.bj0(context);
            this.s = bj0Var3;
            bj0Var3.setAnimation(this.a);
            if (i10 == 1 && !AndroidUtilities.isSmallScreen()) {
                bj0Var3.setTranslationY(-AndroidUtilities.dp(24.0f));
            }
            frameLayout6.addView(bj0Var3, w7.x5.d(i15, i15, 51, 0.0f, 0.0f, 0.0f, (i10 != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
            if (string == null) {
                string = LocaleController.getString(i10 == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
            }
            textView2.setText(string);
            addView(textView2, w7.x5.t(-2, -2, 49, 0, 18, 0, 0));
            int i16 = i10 == 15 ? 16 : 0;
            addView(textView, w7.x5.t(-2, -2, 49, i16, 17, i16, 0));
        }
        viewGroup = null;
        if (i10 != 11) {
        }
        if (i10 == 3) {
        }
        org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(rg0Var, context);
        this.h = n2Var2;
        int i112 = org.telegram.ui.ActionBar.h6.I6;
        n2Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, i112, false));
        n2Var2.setTextColor(rg0Var.getThemedColor(i112));
        n2Var2.setTextSize(1, 14.0f);
        n2Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        n2Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i122 = 0;
        n2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pf0
            public final /* synthetic */ uf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                switch (i122) {
                    case 0:
                        this.b.c(true);
                        break;
                    case 1:
                        uf0 uf0Var = this.b;
                        sf0 sf0Var22 = uf0Var.v;
                        if (uf0Var.V <= 0 || uf0Var.R == null) {
                            uf0Var.i0 = true;
                            sf0Var22.invalidate();
                            sf0Var22.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false));
                            int i142 = uf0Var.g0;
                            if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                if (i142 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(uf0Var, NotificationCenter.didReceiveSmsCode);
                                    uf0Var.c0 = false;
                                    uf0Var.v();
                                    uf0Var.i0 = false;
                                    uf0Var.x();
                                    break;
                                }
                            } else {
                                if (i142 == 4 || i142 == 11) {
                                    sf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    sf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", uf0Var.b);
                                bundle.putString("ephone", uf0Var.e);
                                bundle.putString("phoneFormated", uf0Var.d);
                                bundle.putInt("prevType", uf0Var.f0);
                                uf0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = uf0Var.d;
                                tL_auth_resendCode.phone_code_hash = uf0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.n2) uf0Var.s0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new mf0(uf0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        uf0 uf0Var2 = this.b;
                        uf0Var2.getClass();
                        try {
                            uf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uf0Var2.n0)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        addView(n2Var2, w7.x5.t(-2, -2, 1, 0, 18, 0, 0));
        n2Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.y = frameLayout42;
        sf0 sf0Var3 = new sf0(this, context, 0);
        this.v = sf0Var3;
        sf0Var3.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, i112, false));
        sf0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        sf0Var3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        sf0Var3.setTextSize(1, 15.0f);
        sf0Var3.setGravity(51);
        final int i132 = 1;
        sf0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pf0
            public final /* synthetic */ uf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1322;
                switch (i132) {
                    case 0:
                        this.b.c(true);
                        break;
                    case 1:
                        uf0 uf0Var = this.b;
                        sf0 sf0Var22 = uf0Var.v;
                        if (uf0Var.V <= 0 || uf0Var.R == null) {
                            uf0Var.i0 = true;
                            sf0Var22.invalidate();
                            sf0Var22.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false));
                            int i142 = uf0Var.g0;
                            if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                if (i142 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(uf0Var, NotificationCenter.didReceiveSmsCode);
                                    uf0Var.c0 = false;
                                    uf0Var.v();
                                    uf0Var.i0 = false;
                                    uf0Var.x();
                                    break;
                                }
                            } else {
                                if (i142 == 4 || i142 == 11) {
                                    sf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    sf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", uf0Var.b);
                                bundle.putString("ephone", uf0Var.e);
                                bundle.putString("phoneFormated", uf0Var.d);
                                bundle.putInt("prevType", uf0Var.f0);
                                uf0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = uf0Var.d;
                                tL_auth_resendCode.phone_code_hash = uf0Var.c;
                                i1322 = ((org.telegram.ui.ActionBar.n2) uf0Var.s0).currentAccount;
                                ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode, new mf0(uf0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        uf0 uf0Var2 = this.b;
                        uf0Var2.getClass();
                        try {
                            uf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uf0Var2.n0)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        frameLayout42.addView(sf0Var3, w7.x5.e(-2, -2, 49));
        ae0 ae0Var2 = new ae0(context, 1);
        this.w = ae0Var2;
        if (i10 == 15) {
        }
        TextView textView72 = new TextView(context);
        this.E = textView72;
        textView72.setLineSpacing(org.telegram.ui.Cells.q3.b(2.0f, R.string.WrongCode, textView72), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        ae0Var2.addView(textView72, w7.x5.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        n7.a1.j(ae0Var2);
        if (i10 == 15) {
        }
    }

    public static /* synthetic */ void o(uf0 uf0Var, Context context) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uf0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str);
            sb2.append(uf0Var.s0.e ? " #paidauth" : "");
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb3.append("Device: ");
            sb3.append(Build.MANUFACTURER);
            sb3.append(" ");
            sb3.append(Build.MODEL);
            sb3.append("\n");
            sb3.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb3.append(i10);
            sb3.append("\n");
            sb3.append("Locale: ");
            sb3.append(Locale.getDefault());
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Target Phone: +");
            sb3.append(uf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(uf0Var.getContext());
                    List<SubscriptionInfo> completeActiveSubscriptionInfoList = i10 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                    if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i10 >= 28) {
                        completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                        completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList != null) {
                        for (SubscriptionInfo subscriptionInfo : completeActiveSubscriptionInfoList) {
                            String number = subscriptionInfo.getNumber();
                            if (!TextUtils.isEmpty(number)) {
                                String str2 = "SIM" + subscriptionInfo.getSimSlotIndex();
                                sb3.append(str2);
                                sb3.append(".Phone: ");
                                sb3.append(number);
                                sb3.append("\n");
                                sb3.append(str2);
                                sb3.append(".MCC: ");
                                sb3.append(subscriptionInfo.getMcc());
                                sb3.append("\n");
                                sb3.append(str2);
                                sb3.append(".MNC: ");
                                sb3.append(subscriptionInfo.getMnc());
                                sb3.append("\n");
                                sb3.append(str2);
                                sb3.append(".Carrier: ");
                                sb3.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                                sb3.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb3.append("SIM0.Phone: ");
                            sb3.append(line1Number);
                            sb3.append("\n");
                            sb3.append("SIM0.MCC: unknown\n");
                            sb3.append("SIM0.MNC: unknown\n");
                            sb3.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb3.append("Signal: ");
                        sb3.append(signalStrength.getLevel());
                        sb3.append("/4\n");
                    } else {
                        sb3.append("Signal: unknown\n");
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                sb3.append("Signal: unknown\n");
            }
            sb3.append("Wi-Fi: ");
            sb3.append(AndroidUtilities.isWifiEnabled(context));
            sb3.append("\n");
            sb3.append("Airplane Mode: ");
            sb3.append(AndroidUtilities.isInAirplaneMode(context));
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("App: ");
            sb3.append(BuildVars.APP_ID);
            sb3.append("\n");
            int i11 = packageInfo.versionCode % 10;
            String str3 = (i11 == 1 || i11 == 2) ? "store" : ApplicationLoader.isStandaloneBuild() ? "direct" : ApplicationLoader.isBetaBuild() ? "beta" : ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
            sb3.append("App version: ");
            sb3.append(str);
            sb3.append(" ");
            sb3.append(str3);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Issue: ");
            sb3.append(uf0Var.s0.e ? "no_otp" : "no_otp_paid");
            sb3.append("\n");
            if (!TextUtils.isEmpty(uf0Var.e0)) {
                sb3.append("Error: ");
                sb3.append(uf0Var.e0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            uf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            uf0Var.s0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.yi0 yi0Var) {
        if (yi0Var != null) {
            yi0Var.Q(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.h6.G6;
            yi0Var.Q(org.telegram.ui.ActionBar.h6.w0(null, i10, false), "Phone");
            yi0Var.Q(org.telegram.ui.ActionBar.h6.w0(null, i10, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z10) {
        sf0 sf0Var = this.x;
        if (sf0Var == null) {
            return;
        }
        float f7 = z10 ? 1.0f : 0.0f;
        if (sf0Var.getAlpha() != f7) {
            sf0Var.animate().cancel();
            sf0Var.animate().alpha(f7).setDuration(150L).start();
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.yi0 yi0Var = this.N;
        if (yi0Var == null) {
            this.s0.n1(i10, true);
            return;
        }
        if (this.Q) {
            return;
        }
        this.Q = true;
        org.telegram.ui.Components.yi0 yi0Var2 = this.a;
        if (yi0Var2.a0 != yi0Var2.e[0] - 1) {
            yi0Var2.t0 = new nf0(this, i10, 0);
            return;
        }
        yi0Var.t0 = new hf0(this, 3);
        org.telegram.ui.Components.bj0 bj0Var = this.s;
        bj0Var.setAutoRepeat(false);
        yi0Var.N(0, false, false);
        bj0Var.setAnimation(yi0Var);
        bj0Var.d();
    }

    @Override // org.telegram.ui.Components.uv0
    public final boolean a() {
        return this.f0 != 3;
    }

    @Override // org.telegram.ui.Components.uv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.uv0
    public final boolean c(boolean z10) {
        int i10;
        rg0 rg0Var = this.s0;
        int i11 = 0;
        if (rg0Var.F != 0) {
            rg0Var.finishFragment();
            return false;
        }
        int i12 = this.h0;
        if (i12 != 0) {
            rg0Var.u1(i12, true, null, true);
            return false;
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new jf0(this, i11));
            rg0Var.showDialog(b2Var);
            return false;
        }
        this.d0 = false;
        z(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ai.u7(17), 10);
        w();
        v();
        this.H = null;
        int i13 = this.f0;
        if (i13 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i13 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i13 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.c0 = false;
        return true;
    }

    @Override // org.telegram.ui.Components.uv0
    public final void d() {
        this.d0 = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.c0) {
            zr zrVar = this.f;
            if (zrVar.f == null) {
                return;
            }
            if (i10 == NotificationCenter.didReceiveSmsCode) {
                zrVar.setText("" + objArr[0]);
                h(null);
                return;
            }
            if (i10 == NotificationCenter.didReceiveCall) {
                String str = "" + objArr[0];
                if (AndroidUtilities.checkPhonePattern(this.j0, str)) {
                    if (!this.j0.equals("*")) {
                        this.l0 = str;
                        AndroidUtilities.endIncomingCall();
                    }
                    h(str);
                    CallReceiver.clearLastCall();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uv0
    public final void f() {
        int i10 = this.f0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.c0 = false;
        w();
        v();
    }

    @Override // org.telegram.ui.Components.uv0
    public final void g() {
        Bundle bundle;
        this.i0 = false;
        this.d0 = false;
        if (this.h0 == 0 || (bundle = this.H) == null) {
            return;
        }
        bundle.putInt("timeout", this.V);
    }

    @Override // org.telegram.ui.Components.uv0
    public String getHeaderName() {
        int i10 = this.f0;
        return (i10 == 3 || i10 == 11) ? this.b : LocaleController.getString("YourCode", R.string.YourCode);
    }

    @Override // org.telegram.ui.Components.uv0
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        rg0 rg0Var = this.s0;
        int i13 = rg0Var.a;
        if (i13 == 11) {
            if (this.d0) {
                return;
            }
        } else {
            if (this.d0) {
                return;
            }
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        }
        zr zrVar = this.f;
        if (str == null) {
            str = zrVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            rg0.U0(rg0Var, zrVar, false);
            return;
        }
        int i15 = rg0Var.a;
        if (i15 < 1 || i15 > 4 || !zrVar.e) {
            this.d0 = true;
            int i16 = this.f0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.c0 = false;
            int i17 = rg0Var.F;
            if (i17 == 1) {
                this.d = rg0Var.G;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                w();
                zrVar.e = true;
                bs[] bsVarArr = zrVar.f;
                int length = bsVarArr.length;
                while (i14 < length) {
                    bsVarArr[i14].j(0.0f);
                    i14++;
                }
                i10 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new wb0(3, this, confirmphone), 2));
                return;
            }
            if (i17 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                w();
                zrVar.e = true;
                bs[] bsVarArr2 = zrVar.f;
                int length2 = bsVarArr2.length;
                while (i14 < length2) {
                    bsVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new m(this, 13), 2));
                rg0Var.v1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            w();
            zrVar.e = true;
            bs[] bsVarArr3 = zrVar.f;
            int length3 = bsVarArr3.length;
            while (i14 < length3) {
                bsVarArr3[i14].j(0.0f);
                i14++;
            }
            i12 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new if0(this, tL_auth_signIn, 0), 10));
            rg0Var.v1(true, true);
        }
    }

    @Override // org.telegram.ui.Components.uv0
    public final void j() {
        org.telegram.ui.Components.yi0 yi0Var = this.a;
        if (yi0Var != null) {
            yi0Var.M(0);
        }
        AndroidUtilities.runOnUIThread(new hf0(this, 0), rg0.t0);
    }

    @Override // org.telegram.ui.Components.uv0
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.l0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            zr zrVar = this.f;
            if (zrVar.f != null) {
                zrVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.V = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.T = i12;
        }
    }

    @Override // org.telegram.ui.Components.uv0
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        int i10 = this.f0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.l0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(hg.c.i(i10, "smsview_params_"), this.H);
        }
        int i11 = this.V;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.T;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x049d, code lost:
    
        if (r2 == 16) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0334  */
    @Override // org.telegram.ui.Components.uv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z10) {
        float f7;
        int i10;
        CharSequence charSequence;
        SpannableStringBuilder replaceTags;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        String string;
        int i17 = 8;
        if (bundle == null) {
            if (this.o0 == null || this.p0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.v.setVisibility(8);
            sf0 sf0Var = this.x;
            if (sf0Var != null) {
                sf0Var.setVisibility(0);
                this.x.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false));
                int i18 = this.g0;
                this.x.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i18 == 17 ? R.string.ReturnEnteringPhrase : i18 == 16 ? R.string.ReturnEnteringWord : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        this.c0 = true;
        int i19 = this.f0;
        if (i19 == 15) {
            f7 = 1.0f;
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
        } else {
            f7 = 1.0f;
            if (i19 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i19 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(23));
                }
            }
        }
        this.H = bundle;
        this.b = bundle.getString("phone");
        this.e = bundle.getString("ephone");
        this.d = bundle.getString("phoneFormated");
        this.c = bundle.getString("phoneHash");
        this.V = bundle.getInt("timeout");
        this.T = (int) (System.currentTimeMillis() / 1000);
        this.g0 = bundle.getInt("nextType");
        this.j0 = bundle.getString("pattern");
        this.k0 = bundle.getString("prefix");
        this.m0 = bundle.getInt("length");
        this.h0 = bundle.getInt("prevType", 0);
        if (this.m0 == 0) {
            this.m0 = 5;
        }
        this.n0 = bundle.getString("url");
        this.o0 = null;
        this.p0 = null;
        this.f.b(this.m0, this.f0);
        for (bs bsVar : this.f.f) {
            bsVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            bsVar.addTextChangedListener(new m0(this, 9));
            bsVar.setOnFocusChangeListener(new od(this, i17));
        }
        int i20 = this.h0;
        if (i20 == 17) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f7)));
        } else if (i20 == 16) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f7)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String b10 = gf.b.c().b(this.b);
        if (this.s0.i1()) {
            replaceTags = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, gf.b.c().b("+" + b10))));
            int indexOf = TextUtils.indexOf((CharSequence) replaceTags, '*');
            int lastIndexOf = TextUtils.lastIndexOf(replaceTags, '*');
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                replaceTags.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                replaceTags.replace(indexOf, indexOf + 1, (CharSequence) "");
                replaceTags.setSpan(new org.telegram.ui.Components.l51("tg://settings/change_number", (org.telegram.ui.Components.n01) null), indexOf, lastIndexOf - 1, 33);
            }
        } else {
            int i21 = this.f0;
            if (i21 == 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentAppCodeWithPhone", R.string.SentAppCodeWithPhone, LocaleController.addNbsp(b10)));
            } else if (i21 == 2) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(b10)));
            } else if (i21 == 3) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(b10)));
            } else {
                if (i21 != 4) {
                    if (i21 == 15) {
                        i10 = 4;
                        charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentFragmentCode", R.string.SentFragmentCode, LocaleController.addNbsp(b10)));
                    } else {
                        i10 = 4;
                        charSequence = "";
                    }
                    this.n.setText(charSequence);
                    i11 = this.f0;
                    if (i11 != 15) {
                        if (i11 == 1) {
                            int i22 = this.g0;
                            if (i22 == 3 || i22 == i10 || i22 == 11) {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                            } else if (i22 == 15) {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                            } else if (i22 == 0) {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                            } else {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
                            }
                        } else {
                            this.x.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                        }
                    }
                    if (this.f0 == 3) {
                        rg0.T0(this.s0, this.f.f[0]);
                        this.f.f[0].requestFocus();
                    } else {
                        AndroidUtilities.hideKeyboard(this.f.f[0]);
                    }
                    w();
                    v();
                    this.a0 = System.currentTimeMillis();
                    i12 = this.f0;
                    if (i12 != 1) {
                        setProblemTextVisible(true);
                        this.v.setVisibility(8);
                        sf0 sf0Var2 = this.x;
                        if (sf0Var2 != null) {
                            sf0Var2.setVisibility(0);
                        }
                    } else if (i12 == 3) {
                        int i23 = this.g0;
                        if (i23 == i10 || i23 == 2 || i23 == 17 || i23 == 16 || i23 == 11) {
                            setProblemTextVisible(false);
                            this.v.setVisibility(0);
                            this.x.setVisibility(8);
                            int i24 = this.g0;
                            if (i24 == i10 || i24 == 11) {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                            } else if (i24 == 2 || i24 == 17 || i24 == 16) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            }
                        } else {
                            this.v.setVisibility(8);
                        }
                        String obtainLoginPhoneCall = z10 ? AndroidUtilities.obtainLoginPhoneCall(this.j0) : null;
                        if (obtainLoginPhoneCall != null) {
                            h(obtainLoginPhoneCall);
                        } else {
                            String str2 = this.l0;
                            if (str2 != null) {
                                h(str2);
                            } else {
                                int i25 = this.g0;
                                if (i25 == i10 || i25 == 2 || i25 == 17 || i25 == 16 || i25 == 11) {
                                    u();
                                }
                            }
                        }
                    } else {
                        if (i12 == 2) {
                            int i26 = this.g0;
                            if (i26 != 2) {
                                i16 = 17;
                                i15 = 16;
                                if (i26 != 17 && i26 != 16 && i26 != i10 && i26 != 3) {
                                    i10 = 4;
                                }
                            } else {
                                i15 = 16;
                                i16 = 17;
                            }
                            if (i26 == 2 || i26 == i16 || i26 == i15) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            } else {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                            }
                            setProblemTextVisible(this.V < 1000);
                            this.v.setVisibility(this.V < 1000 ? 8 : 0);
                            sf0 sf0Var3 = this.x;
                            if (sf0Var3 != null) {
                                sf0Var3.setVisibility(this.V < 1000 ? 0 : 8);
                            }
                            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                            String string2 = sharedPreferences.getString("sms_hash", null);
                            if (!TextUtils.isEmpty(string2) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                                if (string.contains(string2 + "|") && !this.s0.x) {
                                    str = string.substring(string.indexOf(124) + 1);
                                    if (str == null) {
                                        this.f.setCode(str);
                                        h(null);
                                    } else {
                                        u();
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                        }
                        if (i12 == i10) {
                            int i27 = this.g0;
                            if (i27 != 2) {
                                i14 = 17;
                                i13 = (i27 == 17 || i27 == 11) ? 16 : 16;
                            } else {
                                i13 = 16;
                                i14 = 17;
                            }
                            if (i27 == 2 || i27 == i14 || i27 == i13) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            } else {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                            }
                            setProblemTextVisible(this.V < 1000);
                            this.v.setVisibility(this.V < 1000 ? 8 : 0);
                            sf0 sf0Var4 = this.x;
                            if (sf0Var4 != null) {
                                sf0Var4.setVisibility(this.V < 1000 ? 0 : 8);
                            }
                            u();
                        }
                        if (i12 == 11) {
                            int i28 = this.g0;
                            if (i28 == 4 || i28 == 2 || i28 == 17 || i28 == 16 || i28 == 11) {
                                setProblemTextVisible(false);
                                this.v.setVisibility(0);
                                this.x.setVisibility(8);
                                int i29 = this.g0;
                                if (i29 == 4 || i29 == 11) {
                                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                } else if (i29 == 2 || i29 == 17 || i29 == 16) {
                                    this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                }
                                u();
                            }
                        } else {
                            this.v.setVisibility(8);
                            sf0 sf0Var5 = this.x;
                            if (sf0Var5 != null) {
                                sf0Var5.setVisibility(0);
                            }
                            setProblemTextVisible(false);
                            s();
                        }
                    }
                    if (this.f0 != 11) {
                        String str3 = this.k0;
                        for (int i30 = 0; i30 < this.m0; i30++) {
                            str3 = w.c.g(str3, "0");
                        }
                        String b11 = gf.b.c().b("+" + str3);
                        for (int i31 = 0; i31 < this.m0; i31++) {
                            int lastIndexOf2 = b11.lastIndexOf("0");
                            if (lastIndexOf2 >= 0) {
                                b11 = b11.substring(0, lastIndexOf2);
                            }
                        }
                        this.I.setText(b11.replaceAll("\\)", "").replaceAll("\\(", ""));
                        return;
                    }
                    return;
                }
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(b10)));
            }
        }
        charSequence = replaceTags;
        i10 = 4;
        this.n.setText(charSequence);
        i11 = this.f0;
        if (i11 != 15) {
        }
        if (this.f0 == 3) {
        }
        w();
        v();
        this.a0 = System.currentTimeMillis();
        i12 = this.f0;
        if (i12 != 1) {
        }
        if (this.f0 != 11) {
        }
    }

    @Override // org.telegram.ui.Components.uv0
    public final void n() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, this.s0.i1() ? org.telegram.ui.ActionBar.h6.G6 : org.telegram.ui.ActionBar.h6.D6, false);
        TextView textView = this.n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.P9, false));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.r.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        int i11 = this.f0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.h6.y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.L.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.M.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i10, false), mode));
            this.I.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        }
        r(this.a);
        r(this.N);
        r(this.O);
        r(this.P);
        zr zrVar = this.f;
        if (zrVar != null) {
            zrVar.invalidate();
        }
        sf0 sf0Var = this.v;
        Integer num = (Integer) sf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.h6.D6);
        }
        sf0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, num.intValue(), false));
        if (i11 != 15) {
            this.x.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        bs[] bsVarArr;
        super.onConfigurationChanged(configuration);
        zr zrVar = this.f;
        if (zrVar == null || (bsVarArr = zrVar.f) == null) {
            return;
        }
        for (bs bsVar : bsVarArr) {
            bsVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.r0);
    }

    public final void q(Runnable runnable) {
        if (this.f0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            zr zrVar = this.f;
            if (i10 >= zrVar.f.length) {
                zrVar.postDelayed(new ia0(20, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                zrVar.postDelayed(new nf0(this, i10, 2), i10 * 75);
                i10++;
            }
        }
    }

    public final void s() {
        if (this.S != null) {
            return;
        }
        this.W = 15000;
        int i10 = this.V;
        if (i10 > 15000) {
            this.W = i10;
        }
        this.S = new Timer();
        this.b0 = System.currentTimeMillis();
        this.S.schedule(new ci.o2(this, 3), 0L, 1000L);
    }

    public final void u() {
        if (this.R != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.h6.D6;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        sf0 sf0Var = this.v;
        sf0Var.setTextColor(w02);
        sf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.R = timer;
        timer.schedule(new tf0(this), 0L, 1000L);
    }

    public final void v() {
        try {
            synchronized (this.U) {
                try {
                    Timer timer = this.S;
                    if (timer != null) {
                        timer.cancel();
                        this.S = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void w() {
        sf0 sf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.h6.D6;
        sf0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.U) {
                try {
                    Timer timer = this.R;
                    if (timer != null) {
                        timer.cancel();
                        this.R = null;
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void x() {
        int i10;
        if (this.d0 || this.i0) {
            return;
        }
        rg0 rg0Var = this.s0;
        if (rg0Var.o0) {
            return;
        }
        this.i0 = true;
        this.v.invalidate();
        this.x.invalidate();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.b);
        bundle.putString("ephone", this.e);
        bundle.putString("phoneFormated", this.d);
        bundle.putInt("prevType", this.f0);
        this.d0 = true;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.d;
        tL_auth_resendCode.phone_code_hash = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
        A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new mf0(this, bundle, 1), 10));
    }

    public final void y() {
        zr zrVar = this.f;
        try {
            zrVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            bs[] bsVarArr = zrVar.f;
            if (i10 >= bsVarArr.length) {
                break;
            }
            bsVarArr[i10].setText("");
            zrVar.f[i10].i(1.0f);
            i10++;
        }
        ae0 ae0Var = this.w;
        if (ae0Var.getCurrentView() != this.E) {
            ae0Var.showNext();
        }
        zrVar.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(zrVar, this.f0 == 11 ? 3.5f : 10.0f, new hf0(this, 7));
        hf0 hf0Var = this.r0;
        removeCallbacks(hf0Var);
        postDelayed(hf0Var, 5000L);
        this.q0 = true;
    }

    public final void z(boolean z10) {
        if (this.N == null) {
            this.s0.k1(z10, true);
            return;
        }
        if (this.Q) {
            this.Q = false;
            this.s.setAutoRepeat(false);
            org.telegram.ui.Components.yi0 yi0Var = this.O;
            yi0Var.K(0);
            yi0Var.S(yi0Var.e[0] - 1, new hf0(this, 1));
        }
    }
}
