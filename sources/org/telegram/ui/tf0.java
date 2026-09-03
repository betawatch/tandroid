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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tf0 extends org.telegram.ui.Components.vv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int q0 = 0;
    public final TextView B;
    public final LinearLayout C;
    public final org.telegram.ui.Components.jj0 D;
    public Bundle E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final ImageView I;
    public final ImageView J;
    public final org.telegram.ui.Components.gj0 K;
    public final org.telegram.ui.Components.gj0 L;
    public final org.telegram.ui.Components.gj0 M;
    public boolean N;
    public Timer O;
    public Timer P;
    public int Q;
    public final Object R;
    public int S;
    public int T;
    public double U;
    public double V;
    public boolean W;
    public final org.telegram.ui.Components.gj0 a;
    public boolean a0;
    public String b;
    public String b0;
    public String c;
    public final int c0;
    public String d;
    public int d0;
    public String e;
    public int e0;
    public final as f;
    public boolean f0;
    public String g0;
    public final org.telegram.ui.Components.voip.n2 h;
    public String h0;
    public String i0;
    public int j0;
    public String k0;
    public Bundle l0;
    public TLRPC.TL_auth_sentCode m0;
    public final TextView n;
    public boolean n0;
    public final gf0 o0;
    public final /* synthetic */ pg0 p0;
    public final TextView r;
    public final org.telegram.ui.Components.jj0 s;
    public final rf0 v;
    public final zd0 w;
    public final rf0 x;
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
    public tf0(pg0 pg0Var, Context context, int i10) {
        super(context);
        ViewGroup viewGroup;
        this.p0 = pg0Var;
        this.R = new Object();
        this.S = 60000;
        this.T = 15000;
        this.b0 = "";
        this.f0 = false;
        this.g0 = "*";
        this.h0 = "";
        this.o0 = new gf0(this, 2);
        this.c0 = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        ai.o(18.0f, 1, textView2);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        String string = pg0Var.C != 1 ? null : LocaleController.getString(R.string.CancelAccountReset);
        if (i10 == 11) {
            textView2.setText(string == null ? LocaleController.getString(R.string.MissedCallDescriptionTitle) : string);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.I = imageView;
            ImageView imageView2 = new ImageView(context);
            this.J = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, k7.b6.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, k7.b6.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.G = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.y3.q(R.string.MissedCallDescriptionSubtitle, textView3);
            addView(textView3, k7.b6.t(-1, -2, 49, 36, 16, 36, 0));
            qf0 qf0Var = new qf0(this, context, 0);
            this.f = qf0Var;
            LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
            TextView textView4 = new TextView(context);
            this.F = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            f10.addView(textView4, k7.b6.t(-2, -1, 16, 0, 0, 4, 0));
            f10.addView(qf0Var, k7.b6.n(-2, -1));
            addView(f10, k7.b6.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.H = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.y3.q(R.string.MissedCallDescriptionSubtitle2, textView5);
            addView(textView5, k7.b6.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            if (i10 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, k7.b6.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, k7.b6.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, k7.b6.e(-2, -2, 1));
                org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
                this.s = jj0Var;
                org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.phone_flash_call, AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                this.a = gj0Var;
                jj0Var.setAnimation(gj0Var);
                frameLayout3.addView(jj0Var, k7.b6.c(64.0f, 64));
                textView2.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                linearLayout.addView(textView2, k7.b6.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, k7.b6.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i10 != 11) {
                    qf0 qf0Var2 = new qf0(this, context, 1);
                    this.f = qf0Var2;
                    addView(qf0Var2, k7.b6.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i10 == 3) {
                    this.f.setVisibility(8);
                }
                org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(pg0Var, context);
                this.h = n2Var;
                int i11 = org.telegram.ui.ActionBar.j6.I6;
                n2Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                n2Var.setTextColor(pg0Var.getThemedColor(i11));
                n2Var.setTextSize(1, 14.0f);
                n2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                n2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i12 = 0;
                n2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of0
                    public final /* synthetic */ tf0 b;

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
                                tf0 tf0Var = this.b;
                                rf0 rf0Var = tf0Var.v;
                                if (tf0Var.S <= 0 || tf0Var.O == null) {
                                    tf0Var.f0 = true;
                                    rf0Var.invalidate();
                                    rf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                    int i14 = tf0Var.d0;
                                    if (i14 != 4 && i14 != 2 && i14 != 17 && i14 != 16 && i14 != 11 && i14 != 15) {
                                        if (i14 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                                            tf0Var.W = false;
                                            tf0Var.v();
                                            tf0Var.f0 = false;
                                            tf0Var.x();
                                            break;
                                        }
                                    } else {
                                        if (i14 == 4 || i14 == 11) {
                                            rf0Var.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            rf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", tf0Var.b);
                                        bundle.putString("ephone", tf0Var.e);
                                        bundle.putString("phoneFormated", tf0Var.d);
                                        bundle.putInt("prevType", tf0Var.c0);
                                        tf0Var.s();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = tf0Var.d;
                                        tL_auth_resendCode.phone_code_hash = tf0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.p2) tf0Var.p0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new lf0(tf0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                tf0 tf0Var2 = this.b;
                                tf0Var2.getClass();
                                try {
                                    tf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tf0Var2.k0)));
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                        }
                    }
                });
                addView(n2Var, k7.b6.t(-2, -2, 1, 0, 18, 0, 0));
                n2Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.y = frameLayout4;
                rf0 rf0Var = new rf0(this, context, 0);
                this.v = rf0Var;
                rf0Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                rf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                rf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                rf0Var.setTextSize(1, 15.0f);
                rf0Var.setGravity(51);
                final int i13 = 1;
                rf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of0
                    public final /* synthetic */ tf0 b;

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
                                tf0 tf0Var = this.b;
                                rf0 rf0Var2 = tf0Var.v;
                                if (tf0Var.S <= 0 || tf0Var.O == null) {
                                    tf0Var.f0 = true;
                                    rf0Var2.invalidate();
                                    rf0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                    int i14 = tf0Var.d0;
                                    if (i14 != 4 && i14 != 2 && i14 != 17 && i14 != 16 && i14 != 11 && i14 != 15) {
                                        if (i14 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                                            tf0Var.W = false;
                                            tf0Var.v();
                                            tf0Var.f0 = false;
                                            tf0Var.x();
                                            break;
                                        }
                                    } else {
                                        if (i14 == 4 || i14 == 11) {
                                            rf0Var2.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            rf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", tf0Var.b);
                                        bundle.putString("ephone", tf0Var.e);
                                        bundle.putString("phoneFormated", tf0Var.d);
                                        bundle.putInt("prevType", tf0Var.c0);
                                        tf0Var.s();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = tf0Var.d;
                                        tL_auth_resendCode.phone_code_hash = tf0Var.c;
                                        i132 = ((org.telegram.ui.ActionBar.p2) tf0Var.p0).currentAccount;
                                        ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new lf0(tf0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                tf0 tf0Var2 = this.b;
                                tf0Var2.getClass();
                                try {
                                    tf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tf0Var2.k0)));
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                        }
                    }
                });
                frameLayout4.addView(rf0Var, k7.b6.e(-2, -2, 49));
                zd0 zd0Var = new zd0(context, 1);
                this.w = zd0Var;
                if (i10 == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = org.telegram.ui.Components.ft.e;
                    loadAnimation.setInterpolator(interpolator);
                    zd0Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    zd0Var.setOutAnimation(loadAnimation2);
                    rf0 rf0Var2 = new rf0(this, context, 1);
                    this.x = rf0Var2;
                    rf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    rf0Var2.setTextSize(1, 15.0f);
                    rf0Var2.setGravity(49);
                    rf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    frameLayout4.addView(rf0Var2, k7.b6.e(-1, -2, 17));
                    zd0Var.addView(frameLayout4, k7.b6.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = org.telegram.ui.Components.mr.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    zd0Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    zd0Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.C = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    int dp = AndroidUtilities.dp(6.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wh, false);
                    int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Q9, false);
                    linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, w03, w03));
                    final int i14 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of0
                        public final /* synthetic */ tf0 b;

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
                                    tf0 tf0Var = this.b;
                                    rf0 rf0Var22 = tf0Var.v;
                                    if (tf0Var.S <= 0 || tf0Var.O == null) {
                                        tf0Var.f0 = true;
                                        rf0Var22.invalidate();
                                        rf0Var22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                                        int i142 = tf0Var.d0;
                                        if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                            if (i142 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                NotificationCenter.getGlobalInstance().removeObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                                                tf0Var.W = false;
                                                tf0Var.v();
                                                tf0Var.f0 = false;
                                                tf0Var.x();
                                                break;
                                            }
                                        } else {
                                            if (i142 == 4 || i142 == 11) {
                                                rf0Var22.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                rf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", tf0Var.b);
                                            bundle.putString("ephone", tf0Var.e);
                                            bundle.putString("phoneFormated", tf0Var.d);
                                            bundle.putInt("prevType", tf0Var.c0);
                                            tf0Var.s();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = tf0Var.d;
                                            tL_auth_resendCode.phone_code_hash = tf0Var.c;
                                            i132 = ((org.telegram.ui.ActionBar.p2) tf0Var.p0).currentAccount;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new lf0(tf0Var, bundle, 0), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    tf0 tf0Var2 = this.b;
                                    tf0Var2.getClass();
                                    try {
                                        tf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tf0Var2.k0)));
                                        break;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                            }
                        }
                    });
                    zd0Var.addView(linearLayout2, k7.b6.c(52.0f, -1));
                    org.telegram.ui.Components.jj0 jj0Var2 = new org.telegram.ui.Components.jj0(context);
                    this.D = jj0Var2;
                    jj0Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(jj0Var2, k7.b6.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(LocaleController.getString(R.string.OpenFragment));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(AndroidUtilities.bold());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.B = textView7;
                textView7.setLineSpacing(b.e(2.0f, R.string.WrongCode, textView7), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                zd0Var.addView(textView7, k7.b6.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(zd0Var, k7.b6.d(i10 == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, k7.b6.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(zd0Var, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                n7.qa.V(zd0Var);
                if (i10 == 15) {
                    this.x.setOnClickListener(new ib0(5, this, context));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, k7.b6.t(-2, -2, 49, 0, 16, 0, 0));
            int i15 = i10 == 1 ? 128 : 64;
            if (i10 == 1) {
                float f11 = i15;
                this.a = new org.telegram.ui.Components.gj0(R.raw.code_laptop, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
            } else {
                float f12 = i15;
                this.a = new org.telegram.ui.Components.gj0(R.raw.sms_incoming_info, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), true, null);
                this.K = new org.telegram.ui.Components.gj0(R.raw.phone_stars_to_dots, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), true, null);
                this.L = new org.telegram.ui.Components.gj0(R.raw.phone_dots, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), true, null);
                this.M = new org.telegram.ui.Components.gj0(R.raw.phone_dots_to_stars, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), true, null);
            }
            org.telegram.ui.Components.jj0 jj0Var3 = new org.telegram.ui.Components.jj0(context);
            this.s = jj0Var3;
            jj0Var3.setAnimation(this.a);
            if (i10 == 1 && !AndroidUtilities.isSmallScreen()) {
                jj0Var3.setTranslationY(-AndroidUtilities.dp(24.0f));
            }
            frameLayout6.addView(jj0Var3, k7.b6.d(i15, i15, 51, 0.0f, 0.0f, 0.0f, (i10 != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
            if (string == null) {
                string = LocaleController.getString(i10 == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
            }
            textView2.setText(string);
            addView(textView2, k7.b6.t(-2, -2, 49, 0, 18, 0, 0));
            int i16 = i10 == 15 ? 16 : 0;
            addView(textView, k7.b6.t(-2, -2, 49, i16, 17, i16, 0));
        }
        viewGroup = null;
        if (i10 != 11) {
        }
        if (i10 == 3) {
        }
        org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(pg0Var, context);
        this.h = n2Var2;
        int i112 = org.telegram.ui.ActionBar.j6.I6;
        n2Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i112, false));
        n2Var2.setTextColor(pg0Var.getThemedColor(i112));
        n2Var2.setTextSize(1, 14.0f);
        n2Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        n2Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i122 = 0;
        n2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of0
            public final /* synthetic */ tf0 b;

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
                        tf0 tf0Var = this.b;
                        rf0 rf0Var22 = tf0Var.v;
                        if (tf0Var.S <= 0 || tf0Var.O == null) {
                            tf0Var.f0 = true;
                            rf0Var22.invalidate();
                            rf0Var22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                            int i142 = tf0Var.d0;
                            if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                if (i142 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                                    tf0Var.W = false;
                                    tf0Var.v();
                                    tf0Var.f0 = false;
                                    tf0Var.x();
                                    break;
                                }
                            } else {
                                if (i142 == 4 || i142 == 11) {
                                    rf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    rf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", tf0Var.b);
                                bundle.putString("ephone", tf0Var.e);
                                bundle.putString("phoneFormated", tf0Var.d);
                                bundle.putInt("prevType", tf0Var.c0);
                                tf0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = tf0Var.d;
                                tL_auth_resendCode.phone_code_hash = tf0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.p2) tf0Var.p0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new lf0(tf0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        tf0 tf0Var2 = this.b;
                        tf0Var2.getClass();
                        try {
                            tf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tf0Var2.k0)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        addView(n2Var2, k7.b6.t(-2, -2, 1, 0, 18, 0, 0));
        n2Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.y = frameLayout42;
        rf0 rf0Var3 = new rf0(this, context, 0);
        this.v = rf0Var3;
        rf0Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i112, false));
        rf0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        rf0Var3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        rf0Var3.setTextSize(1, 15.0f);
        rf0Var3.setGravity(51);
        final int i132 = 1;
        rf0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of0
            public final /* synthetic */ tf0 b;

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
                        tf0 tf0Var = this.b;
                        rf0 rf0Var22 = tf0Var.v;
                        if (tf0Var.S <= 0 || tf0Var.O == null) {
                            tf0Var.f0 = true;
                            rf0Var22.invalidate();
                            rf0Var22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                            int i142 = tf0Var.d0;
                            if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                if (i142 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                                    tf0Var.W = false;
                                    tf0Var.v();
                                    tf0Var.f0 = false;
                                    tf0Var.x();
                                    break;
                                }
                            } else {
                                if (i142 == 4 || i142 == 11) {
                                    rf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    rf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", tf0Var.b);
                                bundle.putString("ephone", tf0Var.e);
                                bundle.putString("phoneFormated", tf0Var.d);
                                bundle.putInt("prevType", tf0Var.c0);
                                tf0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = tf0Var.d;
                                tL_auth_resendCode.phone_code_hash = tf0Var.c;
                                i1322 = ((org.telegram.ui.ActionBar.p2) tf0Var.p0).currentAccount;
                                ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode, new lf0(tf0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        tf0 tf0Var2 = this.b;
                        tf0Var2.getClass();
                        try {
                            tf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tf0Var2.k0)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        frameLayout42.addView(rf0Var3, k7.b6.e(-2, -2, 49));
        zd0 zd0Var2 = new zd0(context, 1);
        this.w = zd0Var2;
        if (i10 == 15) {
        }
        TextView textView72 = new TextView(context);
        this.B = textView72;
        textView72.setLineSpacing(b.e(2.0f, R.string.WrongCode, textView72), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        zd0Var2.addView(textView72, k7.b6.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        n7.qa.V(zd0Var2);
        if (i10 == 15) {
        }
    }

    public static /* synthetic */ void o(tf0 tf0Var, Context context) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb = new StringBuilder();
            sb.append(tf0Var.e);
            sb.append(" Android Registration/Login Issue ");
            sb.append(str);
            sb.append(tf0Var.p0.e ? " #paidauth" : "");
            intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb2.append("Device: ");
            sb2.append(Build.MANUFACTURER);
            sb2.append(" ");
            sb2.append(Build.MODEL);
            sb2.append("\n");
            sb2.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(i10);
            sb2.append("\n");
            sb2.append("Locale: ");
            sb2.append(Locale.getDefault());
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Target Phone: +");
            sb2.append(tf0Var.d);
            sb2.append("\n");
            sb2.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(tf0Var.getContext());
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
                                sb2.append(str2);
                                sb2.append(".Phone: ");
                                sb2.append(number);
                                sb2.append("\n");
                                sb2.append(str2);
                                sb2.append(".MCC: ");
                                sb2.append(subscriptionInfo.getMcc());
                                sb2.append("\n");
                                sb2.append(str2);
                                sb2.append(".MNC: ");
                                sb2.append(subscriptionInfo.getMnc());
                                sb2.append("\n");
                                sb2.append(str2);
                                sb2.append(".Carrier: ");
                                sb2.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                                sb2.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb2.append("SIM0.Phone: ");
                            sb2.append(line1Number);
                            sb2.append("\n");
                            sb2.append("SIM0.MCC: unknown\n");
                            sb2.append("SIM0.MNC: unknown\n");
                            sb2.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb2.append("Signal: ");
                        sb2.append(signalStrength.getLevel());
                        sb2.append("/4\n");
                    } else {
                        sb2.append("Signal: unknown\n");
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            sb2.append(AndroidUtilities.isWifiEnabled(context));
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            sb2.append(AndroidUtilities.isInAirplaneMode(context));
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("App: ");
            sb2.append(BuildVars.APP_ID);
            sb2.append("\n");
            int i11 = packageInfo.versionCode % 10;
            String str3 = (i11 == 1 || i11 == 2) ? "store" : ApplicationLoader.isStandaloneBuild() ? "direct" : ApplicationLoader.isBetaBuild() ? "beta" : ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
            sb2.append("App version: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str3);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Issue: ");
            sb2.append(tf0Var.p0.e ? "no_otp" : "no_otp_paid");
            sb2.append("\n");
            if (!TextUtils.isEmpty(tf0Var.b0)) {
                sb2.append("Error: ");
                sb2.append(tf0Var.b0);
                sb2.append("\n");
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            tf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            tf0Var.p0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.gj0 gj0Var) {
        if (gj0Var != null) {
            gj0Var.O(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            gj0Var.O(org.telegram.ui.ActionBar.j6.w0(null, i10, false), "Phone");
            gj0Var.O(org.telegram.ui.ActionBar.j6.w0(null, i10, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z4) {
        rf0 rf0Var = this.x;
        if (rf0Var == null) {
            return;
        }
        float f10 = z4 ? 1.0f : 0.0f;
        if (rf0Var.getAlpha() != f10) {
            rf0Var.animate().cancel();
            rf0Var.animate().alpha(f10).setDuration(150L).start();
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.gj0 gj0Var = this.K;
        if (gj0Var == null) {
            this.p0.n1(i10, true);
            return;
        }
        if (this.N) {
            return;
        }
        this.N = true;
        org.telegram.ui.Components.gj0 gj0Var2 = this.a;
        if (gj0Var2.Y != gj0Var2.e[0] - 1) {
            gj0Var2.r0 = new mf0(this, i10, 0);
            return;
        }
        gj0Var.r0 = new gf0(this, 3);
        org.telegram.ui.Components.jj0 jj0Var = this.s;
        jj0Var.setAutoRepeat(false);
        gj0Var.L(0, false, false);
        jj0Var.setAnimation(gj0Var);
        jj0Var.d();
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean a() {
        return this.c0 != 3;
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean c(boolean z4) {
        int i10;
        pg0 pg0Var = this.p0;
        int i11 = 0;
        if (pg0Var.C != 0) {
            pg0Var.finishFragment();
            return false;
        }
        int i12 = this.e0;
        if (i12 != 0) {
            pg0Var.u1(i12, true, null, true);
            return false;
        }
        if (!z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new if0(this, i11));
            pg0Var.showDialog(d2Var);
            return false;
        }
        this.a0 = false;
        z(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new nh.p5(13), 10);
        w();
        v();
        this.E = null;
        int i13 = this.c0;
        if (i13 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i13 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i13 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.W = false;
        return true;
    }

    @Override // org.telegram.ui.Components.vv0
    public final void d() {
        this.a0 = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.W) {
            as asVar = this.f;
            if (asVar.f == null) {
                return;
            }
            if (i10 == NotificationCenter.didReceiveSmsCode) {
                asVar.setText("" + objArr[0]);
                h(null);
                return;
            }
            if (i10 == NotificationCenter.didReceiveCall) {
                String str = "" + objArr[0];
                if (AndroidUtilities.checkPhonePattern(this.g0, str)) {
                    if (!this.g0.equals("*")) {
                        this.i0 = str;
                        AndroidUtilities.endIncomingCall();
                    }
                    h(str);
                    CallReceiver.clearLastCall();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public final void f() {
        int i10 = this.c0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.W = false;
        w();
        v();
    }

    @Override // org.telegram.ui.Components.vv0
    public final void g() {
        Bundle bundle;
        this.f0 = false;
        this.a0 = false;
        if (this.e0 == 0 || (bundle = this.E) == null) {
            return;
        }
        bundle.putInt("timeout", this.S);
    }

    @Override // org.telegram.ui.Components.vv0
    public String getHeaderName() {
        int i10 = this.c0;
        return (i10 == 3 || i10 == 11) ? this.b : LocaleController.getString("YourCode", R.string.YourCode);
    }

    @Override // org.telegram.ui.Components.vv0
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        pg0 pg0Var = this.p0;
        int i13 = pg0Var.a;
        if (i13 == 11) {
            if (this.a0) {
                return;
            }
        } else {
            if (this.a0) {
                return;
            }
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        }
        as asVar = this.f;
        if (str == null) {
            str = asVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            pg0.U0(pg0Var, asVar, false);
            return;
        }
        int i15 = pg0Var.a;
        if (i15 < 1 || i15 > 4 || !asVar.e) {
            this.a0 = true;
            int i16 = this.c0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.W = false;
            int i17 = pg0Var.C;
            if (i17 == 1) {
                this.d = pg0Var.D;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                w();
                asVar.e = true;
                ds[] dsVarArr = asVar.f;
                int length = dsVarArr.length;
                while (i14 < length) {
                    dsVarArr[i14].j(0.0f);
                    i14++;
                }
                i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new ub0(3, this, confirmphone), 2));
                return;
            }
            if (i17 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                w();
                asVar.e = true;
                ds[] dsVarArr2 = asVar.f;
                int length2 = dsVarArr2.length;
                while (i14 < length2) {
                    dsVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new o(this, 13), 2));
                pg0Var.v1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            w();
            asVar.e = true;
            ds[] dsVarArr3 = asVar.f;
            int length3 = dsVarArr3.length;
            while (i14 < length3) {
                dsVarArr3[i14].j(0.0f);
                i14++;
            }
            i12 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new hf0(this, tL_auth_signIn, 0), 10));
            pg0Var.v1(true, true);
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public final void j() {
        org.telegram.ui.Components.gj0 gj0Var = this.a;
        if (gj0Var != null) {
            gj0Var.K(0);
        }
        AndroidUtilities.runOnUIThread(new gf0(this, 0), pg0.q0);
    }

    @Override // org.telegram.ui.Components.vv0
    public final void k(Bundle bundle) {
        StringBuilder sb = new StringBuilder("smsview_params_");
        int i10 = this.c0;
        sb.append(i10);
        Bundle bundle2 = bundle.getBundle(sb.toString());
        this.E = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.i0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            as asVar = this.f;
            if (asVar.f != null) {
                asVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.S = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.Q = i12;
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        int i10 = this.c0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.i0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.E != null) {
            bundle.putBundle(kf.k0.j(i10, "smsview_params_"), this.E);
        }
        int i11 = this.S;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.Q;
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
    @Override // org.telegram.ui.Components.vv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z4) {
        float f10;
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
            if (this.l0 == null || this.m0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.v.setVisibility(8);
            rf0 rf0Var = this.x;
            if (rf0Var != null) {
                rf0Var.setVisibility(0);
                this.x.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                int i18 = this.d0;
                this.x.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i18 == 17 ? R.string.ReturnEnteringPhrase : i18 == 16 ? R.string.ReturnEnteringWord : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        this.W = true;
        int i19 = this.c0;
        if (i19 == 15) {
            f10 = 1.0f;
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
        } else {
            f10 = 1.0f;
            if (i19 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i19 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z4) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(26));
                }
            }
        }
        this.E = bundle;
        this.b = bundle.getString("phone");
        this.e = bundle.getString("ephone");
        this.d = bundle.getString("phoneFormated");
        this.c = bundle.getString("phoneHash");
        this.S = bundle.getInt("timeout");
        this.Q = (int) (System.currentTimeMillis() / 1000);
        this.d0 = bundle.getInt("nextType");
        this.g0 = bundle.getString("pattern");
        this.h0 = bundle.getString("prefix");
        this.j0 = bundle.getInt("length");
        this.e0 = bundle.getInt("prevType", 0);
        if (this.j0 == 0) {
            this.j0 = 5;
        }
        this.k0 = bundle.getString("url");
        this.l0 = null;
        this.m0 = null;
        this.f.b(this.j0, this.c0);
        for (ds dsVar : this.f.f) {
            dsVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            dsVar.addTextChangedListener(new p0(this, 9));
            dsVar.setOnFocusChangeListener(new sd(this, i17));
        }
        int i20 = this.e0;
        if (i20 == 17) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f10)));
        } else if (i20 == 16) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f10)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String b10 = se.b.c().b(this.b);
        if (this.p0.i1()) {
            replaceTags = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, se.b.c().b("+" + b10))));
            int indexOf = TextUtils.indexOf((CharSequence) replaceTags, '*');
            int lastIndexOf = TextUtils.lastIndexOf(replaceTags, '*');
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                replaceTags.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                replaceTags.replace(indexOf, indexOf + 1, (CharSequence) "");
                replaceTags.setSpan(new org.telegram.ui.Components.m51("tg://settings/change_number", (org.telegram.ui.Components.s01) null), indexOf, lastIndexOf - 1, 33);
            }
        } else {
            int i21 = this.c0;
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
                    i11 = this.c0;
                    if (i11 != 15) {
                        if (i11 == 1) {
                            int i22 = this.d0;
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
                    if (this.c0 == 3) {
                        pg0.T0(this.p0, this.f.f[0]);
                        this.f.f[0].requestFocus();
                    } else {
                        AndroidUtilities.hideKeyboard(this.f.f[0]);
                    }
                    w();
                    v();
                    this.U = System.currentTimeMillis();
                    i12 = this.c0;
                    if (i12 != 1) {
                        setProblemTextVisible(true);
                        this.v.setVisibility(8);
                        rf0 rf0Var2 = this.x;
                        if (rf0Var2 != null) {
                            rf0Var2.setVisibility(0);
                        }
                    } else if (i12 == 3) {
                        int i23 = this.d0;
                        if (i23 == i10 || i23 == 2 || i23 == 17 || i23 == 16 || i23 == 11) {
                            setProblemTextVisible(false);
                            this.v.setVisibility(0);
                            this.x.setVisibility(8);
                            int i24 = this.d0;
                            if (i24 == i10 || i24 == 11) {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                            } else if (i24 == 2 || i24 == 17 || i24 == 16) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            }
                        } else {
                            this.v.setVisibility(8);
                        }
                        String obtainLoginPhoneCall = z4 ? AndroidUtilities.obtainLoginPhoneCall(this.g0) : null;
                        if (obtainLoginPhoneCall != null) {
                            h(obtainLoginPhoneCall);
                        } else {
                            String str2 = this.i0;
                            if (str2 != null) {
                                h(str2);
                            } else {
                                int i25 = this.d0;
                                if (i25 == i10 || i25 == 2 || i25 == 17 || i25 == 16 || i25 == 11) {
                                    t();
                                }
                            }
                        }
                    } else {
                        if (i12 == 2) {
                            int i26 = this.d0;
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
                            setProblemTextVisible(this.S < 1000);
                            this.v.setVisibility(this.S < 1000 ? 8 : 0);
                            rf0 rf0Var3 = this.x;
                            if (rf0Var3 != null) {
                                rf0Var3.setVisibility(this.S < 1000 ? 0 : 8);
                            }
                            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                            String string2 = sharedPreferences.getString("sms_hash", null);
                            if (!TextUtils.isEmpty(string2) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                                if (string.contains(string2 + "|") && !this.p0.x) {
                                    str = string.substring(string.indexOf(124) + 1);
                                    if (str == null) {
                                        this.f.setCode(str);
                                        h(null);
                                    } else {
                                        t();
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                        }
                        if (i12 == i10) {
                            int i27 = this.d0;
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
                            setProblemTextVisible(this.S < 1000);
                            this.v.setVisibility(this.S < 1000 ? 8 : 0);
                            rf0 rf0Var4 = this.x;
                            if (rf0Var4 != null) {
                                rf0Var4.setVisibility(this.S < 1000 ? 0 : 8);
                            }
                            t();
                        }
                        if (i12 == 11) {
                            int i28 = this.d0;
                            if (i28 == 4 || i28 == 2 || i28 == 17 || i28 == 16 || i28 == 11) {
                                setProblemTextVisible(false);
                                this.v.setVisibility(0);
                                this.x.setVisibility(8);
                                int i29 = this.d0;
                                if (i29 == 4 || i29 == 11) {
                                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                } else if (i29 == 2 || i29 == 17 || i29 == 16) {
                                    this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                }
                                t();
                            }
                        } else {
                            this.v.setVisibility(8);
                            rf0 rf0Var5 = this.x;
                            if (rf0Var5 != null) {
                                rf0Var5.setVisibility(0);
                            }
                            setProblemTextVisible(false);
                            s();
                        }
                    }
                    if (this.c0 != 11) {
                        String str3 = this.h0;
                        for (int i30 = 0; i30 < this.j0; i30++) {
                            str3 = vh.w2.k(str3, "0");
                        }
                        String b11 = se.b.c().b("+" + str3);
                        for (int i31 = 0; i31 < this.j0; i31++) {
                            int lastIndexOf2 = b11.lastIndexOf("0");
                            if (lastIndexOf2 >= 0) {
                                b11 = b11.substring(0, lastIndexOf2);
                            }
                        }
                        this.F.setText(b11.replaceAll("\\)", "").replaceAll("\\(", ""));
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
        i11 = this.c0;
        if (i11 != 15) {
        }
        if (this.c0 == 3) {
        }
        w();
        v();
        this.U = System.currentTimeMillis();
        i12 = this.c0;
        if (i12 != 1) {
        }
        if (this.c0 != 11) {
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public final void n() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.p0.i1() ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.D6, false);
        TextView textView = this.n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = this.c0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.j6.y6;
            this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.H.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.I.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), mode));
            this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        r(this.a);
        r(this.K);
        r(this.L);
        r(this.M);
        as asVar = this.f;
        if (asVar != null) {
            asVar.invalidate();
        }
        rf0 rf0Var = this.v;
        Integer num = (Integer) rf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.j6.D6);
        }
        rf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, num.intValue(), false));
        if (i11 != 15) {
            this.x.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        }
        this.B.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ds[] dsVarArr;
        super.onConfigurationChanged(configuration);
        as asVar = this.f;
        if (asVar == null || (dsVarArr = asVar.f) == null) {
            return;
        }
        for (ds dsVar : dsVarArr) {
            dsVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.o0);
    }

    public final void q(Runnable runnable) {
        if (this.c0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            as asVar = this.f;
            if (i10 >= asVar.f.length) {
                asVar.postDelayed(new ie0(7, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                asVar.postDelayed(new mf0(this, i10, 2), i10 * 75);
                i10++;
            }
        }
    }

    public final void s() {
        if (this.P != null) {
            return;
        }
        this.T = 15000;
        int i10 = this.S;
        if (i10 > 15000) {
            this.T = i10;
        }
        this.P = new Timer();
        this.V = System.currentTimeMillis();
        this.P.schedule(new org.telegram.ui.Components.h50(this, 1), 0L, 1000L);
    }

    public final void t() {
        if (this.O != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.D6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        rf0 rf0Var = this.v;
        rf0Var.setTextColor(w02);
        rf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.O = timer;
        timer.schedule(new sf0(this), 0L, 1000L);
    }

    public final void v() {
        try {
            synchronized (this.R) {
                try {
                    Timer timer = this.P;
                    if (timer != null) {
                        timer.cancel();
                        this.P = null;
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
        rf0 rf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.j6.D6;
        rf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.R) {
                try {
                    Timer timer = this.O;
                    if (timer != null) {
                        timer.cancel();
                        this.O = null;
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
        if (this.a0 || this.f0) {
            return;
        }
        pg0 pg0Var = this.p0;
        if (pg0Var.l0) {
            return;
        }
        this.f0 = true;
        this.v.invalidate();
        this.x.invalidate();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.b);
        bundle.putString("ephone", this.e);
        bundle.putString("phoneFormated", this.d);
        bundle.putInt("prevType", this.c0);
        this.a0 = true;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.d;
        tL_auth_resendCode.phone_code_hash = this.c;
        i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
        A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new lf0(this, bundle, 1), 10));
    }

    public final void y() {
        as asVar = this.f;
        try {
            asVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            ds[] dsVarArr = asVar.f;
            if (i10 >= dsVarArr.length) {
                break;
            }
            dsVarArr[i10].setText("");
            asVar.f[i10].i(1.0f);
            i10++;
        }
        zd0 zd0Var = this.w;
        if (zd0Var.getCurrentView() != this.B) {
            zd0Var.showNext();
        }
        asVar.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(asVar, this.c0 == 11 ? 3.5f : 10.0f, new gf0(this, 7));
        gf0 gf0Var = this.o0;
        removeCallbacks(gf0Var);
        postDelayed(gf0Var, 5000L);
        this.n0 = true;
    }

    public final void z(boolean z4) {
        if (this.K == null) {
            this.p0.k1(z4, true);
            return;
        }
        if (this.N) {
            this.N = false;
            this.s.setAutoRepeat(false);
            org.telegram.ui.Components.gj0 gj0Var = this.L;
            gj0Var.I(0);
            gj0Var.P(gj0Var.e[0] - 1, new gf0(this, 1));
        }
    }
}
