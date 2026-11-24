// default package

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.CallLog;
import android.provider.Settings;
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
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rg6 extends kla implements jm7 {
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final s09 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final p09 Q;
    public final p09 R;
    public final p09 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final p09 a;
    public final Object a0;
    public String b;
    public int b0;
    public String c;
    public int c0;
    public String d;
    public double d0;
    public String e;
    public double e0;
    public final tk2 f;
    public boolean f0;
    public boolean g0;
    public final pe6 h;
    public String h0;
    public final byte i0;
    public int j0;
    public int k0;
    public boolean l0;
    public String m0;
    public final TextView n;
    public String n0;
    public String o0;
    public int p0;
    public String q0;
    public final TextView r;
    public Bundle r0;
    public final s09 s;
    public TLRPC.TL_auth_sentCode s0;
    public boolean t0;
    public final dg6 u0;
    public final /* synthetic */ mh6 v0;
    public final ng6 w;
    public final ye6 x;
    public final ng6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0490  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rg6(mh6 mh6Var, Context context, int i) {
        super(context);
        p09 p09Var;
        ViewGroup viewGroup;
        this.v0 = mh6Var;
        this.a0 = new Object();
        this.b0 = 60000;
        this.c0 = 15000;
        this.h0 = "";
        byte b = 0;
        this.l0 = false;
        this.m0 = "*";
        this.n0 = "";
        this.u0 = new dg6(this, (byte) 2);
        this.i0 = i;
        final byte b2 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(gm.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        ts2.s(textView2, 1, 18.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        textView2.setGravity(49);
        String M0 = mh6Var.G != 1 ? null : jb6.M0(2131752541, null);
        if (i == 11) {
            textView2.setText(M0 == null ? jb6.M0(2131748168, null) : M0);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.M = imageView;
            ImageView imageView2 = new ImageView(context);
            this.N = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, qoe.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, qoe.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.K = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(gm.L(2.0f), 1.0f);
            textView3.setText(gm.S2(jb6.M0(2131748170, null)));
            addView(textView3, qoe.t(-1, -2, 49, 36, 16, 36, 0));
            mg6 mg6Var = new mg6(this, context, b);
            this.f = mg6Var;
            LinearLayout i2 = hg9.i(context, 0);
            TextView textView4 = new TextView(context);
            this.J = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(gm.o());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            i2.addView(textView4, qoe.t(-2, -1, 16, 0, 0, 4, 0));
            i2.addView(mg6Var, qoe.o(-2, -1));
            addView(i2, qoe.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.L = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(gm.L(2.0f), 1.0f);
            textView5.setText(gm.S2(jb6.M0(2131748169, null)));
            addView(textView5, qoe.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            int i3 = 64;
            if (i == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, qoe.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, qoe.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = gm.O1() ? 0 : gm.m;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, qoe.e(-2, -2, 1));
                s09 s09Var = new s09(context);
                this.s = s09Var;
                p09 p09Var2 = new p09(R.raw.phone_flash_call, gm.L(64.0f), gm.L(64.0f), true, null);
                this.a = p09Var2;
                s09Var.setAnimation(p09Var2);
                frameLayout3.addView(s09Var, qoe.c(64.0f, 64));
                textView2.setText(M0 == null ? jb6.M0(2131742490, null) : M0);
                linearLayout.addView(textView2, qoe.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, qoe.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i != 11) {
                    mg6 mg6Var2 = new mg6(this, context, b2);
                    this.f = mg6Var2;
                    addView(mg6Var2, qoe.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i == 3) {
                    this.f.setVisibility(8);
                }
                pe6 pe6Var = new pe6(mh6Var, context);
                this.h = pe6Var;
                int i4 = cmb.H6;
                anb.G(pe6Var, i4, null);
                anb.X(pe6Var, i4, mh6Var.getResourceProvider());
                pe6Var.setTextSize(1, 14.0f);
                pe6Var.setLineSpacing(gm.L(2.0f), 1.0f);
                pe6Var.setPadding(gm.L(14.0f), gm.L(8.0f), gm.L(14.0f), gm.L(16.0f));
                final byte b3 = 0;
                pe6Var.setOnClickListener(new View.OnClickListener(this) { // from class: kg6
                    public final /* synthetic */ rg6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5;
                        byte b4 = b3;
                        rg6 rg6Var = this.b;
                        switch (b4) {
                            case 0:
                                rg6Var.d(true);
                                break;
                            case 1:
                                ng6 ng6Var = rg6Var.w;
                                if (rg6Var.b0 <= 0 || rg6Var.U == null) {
                                    rg6Var.l0 = true;
                                    ng6Var.invalidate();
                                    anb.X(ng6Var, cmb.H6, null);
                                    int i6 = rg6Var.j0;
                                    byte b5 = 0;
                                    if (i6 != 4 && i6 != 2 && i6 != 17 && i6 != 16 && i6 != 11 && i6 != 15) {
                                        if (i6 == 3) {
                                            gm.y3(false);
                                            nm7.e().n(rg6Var, nm7.k4);
                                            rg6Var.f0 = false;
                                            rg6Var.s();
                                            rg6Var.l0 = false;
                                            rg6Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i6 == 4 || i6 == 11) {
                                            ng6Var.setText(jb6.M0(2131752550, null));
                                        } else {
                                            ng6Var.setText(jb6.M0(2131745311, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", rg6Var.b);
                                        bundle.putString("ephone", rg6Var.e);
                                        bundle.putString("phoneFormated", rg6Var.d);
                                        bundle.putInt("prevType", rg6Var.i0);
                                        rg6Var.q();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = rg6Var.d;
                                        tL_auth_resendCode.phone_code_hash = rg6Var.c;
                                        i5 = ((d) rg6Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i5).sendRequest(tL_auth_resendCode, new hg6(rg6Var, bundle, b5), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    rg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(rg6Var.q0)));
                                    break;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                        }
                    }
                });
                addView(pe6Var, qoe.t(-2, -2, 1, 0, 18, 0, 0));
                pe6Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.E = frameLayout4;
                ng6 ng6Var = new ng6(this, context, (byte) 0);
                this.w = ng6Var;
                anb.G(ng6Var, i4, null);
                ng6Var.setLineSpacing(gm.L(2.0f), 1.0f);
                ng6Var.setPadding(gm.L(14.0f), gm.L(8.0f), gm.L(14.0f), gm.L(16.0f));
                ng6Var.setTextSize(1, 15.0f);
                ng6Var.setGravity(51);
                ng6Var.setOnClickListener(new View.OnClickListener(this) { // from class: kg6
                    public final /* synthetic */ rg6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5;
                        byte b4 = b2;
                        rg6 rg6Var = this.b;
                        switch (b4) {
                            case 0:
                                rg6Var.d(true);
                                break;
                            case 1:
                                ng6 ng6Var2 = rg6Var.w;
                                if (rg6Var.b0 <= 0 || rg6Var.U == null) {
                                    rg6Var.l0 = true;
                                    ng6Var2.invalidate();
                                    anb.X(ng6Var2, cmb.H6, null);
                                    int i6 = rg6Var.j0;
                                    byte b5 = 0;
                                    if (i6 != 4 && i6 != 2 && i6 != 17 && i6 != 16 && i6 != 11 && i6 != 15) {
                                        if (i6 == 3) {
                                            gm.y3(false);
                                            nm7.e().n(rg6Var, nm7.k4);
                                            rg6Var.f0 = false;
                                            rg6Var.s();
                                            rg6Var.l0 = false;
                                            rg6Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i6 == 4 || i6 == 11) {
                                            ng6Var2.setText(jb6.M0(2131752550, null));
                                        } else {
                                            ng6Var2.setText(jb6.M0(2131745311, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", rg6Var.b);
                                        bundle.putString("ephone", rg6Var.e);
                                        bundle.putString("phoneFormated", rg6Var.d);
                                        bundle.putInt("prevType", rg6Var.i0);
                                        rg6Var.q();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = rg6Var.d;
                                        tL_auth_resendCode.phone_code_hash = rg6Var.c;
                                        i5 = ((d) rg6Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i5).sendRequest(tL_auth_resendCode, new hg6(rg6Var, bundle, b5), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    rg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(rg6Var.q0)));
                                    break;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                        }
                    }
                });
                frameLayout4.addView(ng6Var, qoe.e(-2, -2, 49));
                ye6 ye6Var = new ye6(context, b2);
                this.x = ye6Var;
                if (i == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = vt3.e;
                    loadAnimation.setInterpolator(interpolator);
                    ye6Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    ye6Var.setOutAnimation(loadAnimation2);
                    ng6 ng6Var2 = new ng6(this, context, (byte) 1);
                    this.y = ng6Var2;
                    ng6Var2.setLineSpacing(gm.L(2.0f), 1.0f);
                    ng6Var2.setTextSize(1, 15.0f);
                    ng6Var2.setGravity(49);
                    ng6Var2.setPadding(gm.L(14.0f), gm.L(8.0f), gm.L(14.0f), gm.L(16.0f));
                    frameLayout4.addView(ng6Var2, qoe.e(-1, -2, 17));
                    ye6Var.addView(frameLayout4, qoe.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = d53.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    ye6Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    ye6Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.G = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                    int L = gm.L(6.0f);
                    int i5 = cmb.Mi;
                    int w0 = cmb.w0(null, i5, false);
                    int i6 = cmb.P9;
                    int w02 = cmb.w0(null, i6, false);
                    fg0 i0 = cmb.i0(L, L, L, L, w0, w02, w02);
                    wmb M = anb.M(i5);
                    wmb M2 = anb.M(i6);
                    linearLayout2.setBackground(i0);
                    anb.j(linearLayout2, i0, M, M2, null);
                    final byte b4 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: kg6
                        public final /* synthetic */ rg6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52;
                            byte b42 = b4;
                            rg6 rg6Var = this.b;
                            switch (b42) {
                                case 0:
                                    rg6Var.d(true);
                                    break;
                                case 1:
                                    ng6 ng6Var22 = rg6Var.w;
                                    if (rg6Var.b0 <= 0 || rg6Var.U == null) {
                                        rg6Var.l0 = true;
                                        ng6Var22.invalidate();
                                        anb.X(ng6Var22, cmb.H6, null);
                                        int i62 = rg6Var.j0;
                                        byte b5 = 0;
                                        if (i62 != 4 && i62 != 2 && i62 != 17 && i62 != 16 && i62 != 11 && i62 != 15) {
                                            if (i62 == 3) {
                                                gm.y3(false);
                                                nm7.e().n(rg6Var, nm7.k4);
                                                rg6Var.f0 = false;
                                                rg6Var.s();
                                                rg6Var.l0 = false;
                                                rg6Var.v();
                                                break;
                                            }
                                        } else {
                                            if (i62 == 4 || i62 == 11) {
                                                ng6Var22.setText(jb6.M0(2131752550, null));
                                            } else {
                                                ng6Var22.setText(jb6.M0(2131745311, null));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", rg6Var.b);
                                            bundle.putString("ephone", rg6Var.e);
                                            bundle.putString("phoneFormated", rg6Var.d);
                                            bundle.putInt("prevType", rg6Var.i0);
                                            rg6Var.q();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = rg6Var.d;
                                            tL_auth_resendCode.phone_code_hash = rg6Var.c;
                                            i52 = ((d) rg6Var.v0).currentAccount;
                                            ConnectionsManager.getInstance(i52).sendRequest(tL_auth_resendCode, new hg6(rg6Var, bundle, b5), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    try {
                                        rg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(rg6Var.q0)));
                                        break;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        return;
                                    }
                            }
                        }
                    });
                    ye6Var.addView(linearLayout2, qoe.c(52.0f, -1));
                    s09 s09Var2 = new s09(context);
                    this.H = s09Var2;
                    s09Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(s09Var2, qoe.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(jb6.M0(2131747538, null));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(gm.o());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.F = textView7;
                textView7.setText(jb6.M0(2131742524, null));
                textView7.setLineSpacing(gm.L(2.0f), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
                ye6Var.addView(textView7, qoe.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(ye6Var, qoe.d(i == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, qoe.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(ye6Var, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                wm9.c(ye6Var);
                if (i == 15) {
                    this.y.setOnClickListener(new n06(this, context, (byte) 7));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, qoe.t(-2, -2, 49, 0, 16, 0, 0));
            if (i == 1) {
                i3 = 128;
                float f = 128;
                p09Var = new p09(R.raw.code_laptop, gm.L(f), gm.L(f), true, null);
                this.a = p09Var;
            } else {
                float f2 = 64;
                p09 p09Var3 = new p09(R.raw.sms_incoming_info, gm.L(f2), gm.L(f2), true, null);
                this.a = p09Var3;
                this.Q = new p09(R.raw.phone_stars_to_dots, gm.L(f2), gm.L(f2), true, null);
                this.R = new p09(R.raw.phone_dots, gm.L(f2), gm.L(f2), true, null);
                this.S = new p09(R.raw.phone_dots_to_stars, gm.L(f2), gm.L(f2), true, null);
                p09Var = p09Var3;
            }
            s09 s09Var3 = new s09(context);
            this.s = s09Var3;
            s09Var3.setAnimation(p09Var);
            if (i == 1 && !gm.M1()) {
                s09Var3.setTranslationY(-gm.L(24.0f));
            }
            frameLayout6.addView(s09Var3, qoe.d(i3, i3, 51, 0.0f, 0.0f, 0.0f, (i != 1 || gm.M1()) ? 0.0f : -gm.L(16.0f)));
            if (M0 == null) {
                M0 = jb6.M0(i == 1 ? 2131745306 : 2131745300, null);
            }
            textView2.setText(M0);
            addView(textView2, qoe.t(-2, -2, 49, 0, 18, 0, 0));
            int i7 = i == 15 ? 16 : 0;
            addView(textView, qoe.t(-2, -2, 49, i7, 17, i7, 0));
        }
        viewGroup = null;
        if (i != 11) {
        }
        if (i == 3) {
        }
        pe6 pe6Var2 = new pe6(mh6Var, context);
        this.h = pe6Var2;
        int i42 = cmb.H6;
        anb.G(pe6Var2, i42, null);
        anb.X(pe6Var2, i42, mh6Var.getResourceProvider());
        pe6Var2.setTextSize(1, 14.0f);
        pe6Var2.setLineSpacing(gm.L(2.0f), 1.0f);
        pe6Var2.setPadding(gm.L(14.0f), gm.L(8.0f), gm.L(14.0f), gm.L(16.0f));
        final byte b32 = 0;
        pe6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: kg6
            public final /* synthetic */ rg6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52;
                byte b42 = b32;
                rg6 rg6Var = this.b;
                switch (b42) {
                    case 0:
                        rg6Var.d(true);
                        break;
                    case 1:
                        ng6 ng6Var22 = rg6Var.w;
                        if (rg6Var.b0 <= 0 || rg6Var.U == null) {
                            rg6Var.l0 = true;
                            ng6Var22.invalidate();
                            anb.X(ng6Var22, cmb.H6, null);
                            int i62 = rg6Var.j0;
                            byte b5 = 0;
                            if (i62 != 4 && i62 != 2 && i62 != 17 && i62 != 16 && i62 != 11 && i62 != 15) {
                                if (i62 == 3) {
                                    gm.y3(false);
                                    nm7.e().n(rg6Var, nm7.k4);
                                    rg6Var.f0 = false;
                                    rg6Var.s();
                                    rg6Var.l0 = false;
                                    rg6Var.v();
                                    break;
                                }
                            } else {
                                if (i62 == 4 || i62 == 11) {
                                    ng6Var22.setText(jb6.M0(2131752550, null));
                                } else {
                                    ng6Var22.setText(jb6.M0(2131745311, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", rg6Var.b);
                                bundle.putString("ephone", rg6Var.e);
                                bundle.putString("phoneFormated", rg6Var.d);
                                bundle.putInt("prevType", rg6Var.i0);
                                rg6Var.q();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = rg6Var.d;
                                tL_auth_resendCode.phone_code_hash = rg6Var.c;
                                i52 = ((d) rg6Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i52).sendRequest(tL_auth_resendCode, new hg6(rg6Var, bundle, b5), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            rg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(rg6Var.q0)));
                            break;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                }
            }
        });
        addView(pe6Var2, qoe.t(-2, -2, 1, 0, 18, 0, 0));
        pe6Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.E = frameLayout42;
        ng6 ng6Var3 = new ng6(this, context, (byte) 0);
        this.w = ng6Var3;
        anb.G(ng6Var3, i42, null);
        ng6Var3.setLineSpacing(gm.L(2.0f), 1.0f);
        ng6Var3.setPadding(gm.L(14.0f), gm.L(8.0f), gm.L(14.0f), gm.L(16.0f));
        ng6Var3.setTextSize(1, 15.0f);
        ng6Var3.setGravity(51);
        ng6Var3.setOnClickListener(new View.OnClickListener(this) { // from class: kg6
            public final /* synthetic */ rg6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52;
                byte b42 = b2;
                rg6 rg6Var = this.b;
                switch (b42) {
                    case 0:
                        rg6Var.d(true);
                        break;
                    case 1:
                        ng6 ng6Var22 = rg6Var.w;
                        if (rg6Var.b0 <= 0 || rg6Var.U == null) {
                            rg6Var.l0 = true;
                            ng6Var22.invalidate();
                            anb.X(ng6Var22, cmb.H6, null);
                            int i62 = rg6Var.j0;
                            byte b5 = 0;
                            if (i62 != 4 && i62 != 2 && i62 != 17 && i62 != 16 && i62 != 11 && i62 != 15) {
                                if (i62 == 3) {
                                    gm.y3(false);
                                    nm7.e().n(rg6Var, nm7.k4);
                                    rg6Var.f0 = false;
                                    rg6Var.s();
                                    rg6Var.l0 = false;
                                    rg6Var.v();
                                    break;
                                }
                            } else {
                                if (i62 == 4 || i62 == 11) {
                                    ng6Var22.setText(jb6.M0(2131752550, null));
                                } else {
                                    ng6Var22.setText(jb6.M0(2131745311, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", rg6Var.b);
                                bundle.putString("ephone", rg6Var.e);
                                bundle.putString("phoneFormated", rg6Var.d);
                                bundle.putInt("prevType", rg6Var.i0);
                                rg6Var.q();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = rg6Var.d;
                                tL_auth_resendCode.phone_code_hash = rg6Var.c;
                                i52 = ((d) rg6Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i52).sendRequest(tL_auth_resendCode, new hg6(rg6Var, bundle, b5), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            rg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(rg6Var.q0)));
                            break;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                }
            }
        });
        frameLayout42.addView(ng6Var3, qoe.e(-2, -2, 49));
        ye6 ye6Var2 = new ye6(context, b2);
        this.x = ye6Var2;
        if (i == 15) {
        }
        TextView textView72 = new TextView(context);
        this.F = textView72;
        textView72.setText(jb6.M0(2131742524, null));
        textView72.setLineSpacing(gm.L(2.0f), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
        ye6Var2.addView(textView72, qoe.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        wm9.c(ye6Var2);
        if (i == 15) {
        }
    }

    public static void p(p09 p09Var) {
        if (p09Var != null) {
            p09Var.L(cmb.w0(null, cmb.O9, false), "Bubble");
            int i = cmb.F6;
            p09Var.L(cmb.w0(null, i, false), "Phone");
            p09Var.L(cmb.w0(null, i, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z) {
        ng6 ng6Var = this.y;
        if (ng6Var != null) {
            float f = z ? 1.0f : 0.0f;
            if (ng6Var.getAlpha() != f) {
                ng6Var.animate().cancel();
                ng6Var.animate().alpha(f).setDuration(150L).start();
            }
        }
    }

    @Override // kla
    public final boolean a() {
        return this.i0 != 3;
    }

    @Override // kla
    public final boolean b() {
        return true;
    }

    @Override // kla
    public final boolean d(boolean z) {
        int i;
        mh6 mh6Var = this.v0;
        byte b = 0;
        if (mh6Var.G != 0) {
            mh6Var.finishFragment();
            return false;
        }
        int i2 = this.k0;
        if (i2 != 0) {
            mh6Var.J1(i2, true, null, true);
            return false;
        }
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
            String M0 = jb6.M0(2131751200, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = gm.S2(jb6.a0("EditNumberInfo", null, 2131751199, this.b));
            alertDialog$Builder.j(jb6.M0(2131751978, null), null);
            alertDialog$Builder.g(jb6.M0(2131751272, null), new fg6(this, b));
            mh6Var.showDialog(heVar);
            return false;
        }
        this.g0 = false;
        y(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i = ((d) mh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_cancelCode, new nf2(b), 10);
        t();
        s();
        this.I = null;
        int i3 = nm7.k4;
        byte b2 = this.i0;
        if (b2 == 15) {
            nm7.e().n(this, i3);
        } else if (b2 == 2) {
            gm.y3(false);
            nm7.e().n(this, i3);
        } else if (b2 == 3) {
            gm.x3(false);
            nm7.e().n(this, nm7.l4);
        }
        this.f0 = false;
        return true;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.f0) {
            tk2 tk2Var = this.f;
            if (tk2Var.f != null) {
                if (i == nm7.k4) {
                    tk2Var.setText(String.valueOf(objArr[0]));
                    h(null);
                    return;
                }
                if (i == nm7.l4) {
                    String valueOf = String.valueOf(objArr[0]);
                    if (gm.x(this.m0, valueOf)) {
                        if (!this.m0.equals("*")) {
                            this.o0 = valueOf;
                            gm.T();
                        }
                        h(valueOf);
                        int i3 = CallReceiver.a;
                        gda.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override // kla
    public final void e() {
        this.g0 = false;
    }

    @Override // kla
    public final void f() {
        int i = nm7.k4;
        byte b = this.i0;
        if (b == 15) {
            nm7.e().n(this, i);
        } else if (b == 2) {
            gm.y3(false);
            nm7.e().n(this, i);
        } else if (b == 3) {
            gm.x3(false);
            nm7.e().n(this, nm7.l4);
        }
        this.f0 = false;
        t();
        s();
    }

    @Override // kla
    public final void g() {
        Bundle bundle;
        this.l0 = false;
        this.g0 = false;
        if (this.k0 == 0 || (bundle = this.I) == null) {
            return;
        }
        bundle.putInt("timeout", this.b0);
    }

    @Override // kla
    public String getHeaderName() {
        byte b = this.i0;
        return (b == 3 || b == 11) ? this.b : jb6.M0(2131742490, "YourCode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kla
    public final void h(String str) {
        int i;
        int i2;
        int i3;
        mh6 mh6Var = this.v0;
        int i4 = mh6Var.a;
        boolean z = this.g0;
        if (i4 != 11) {
            if (z) {
                return;
            }
            if ((i4 < 1 || i4 > 4) && i4 != 15) {
                return;
            }
        } else if (z) {
            return;
        }
        tk2 tk2Var = this.f;
        if (str == null) {
            str = tk2Var.getCode();
        }
        byte b = 0;
        if (TextUtils.isEmpty(str)) {
            mh6.E1(tk2Var, false);
            return;
        }
        int i5 = mh6Var.a;
        if (i5 < 1 || i5 > 4 || !tk2Var.e) {
            this.g0 = true;
            int i6 = nm7.k4;
            byte b2 = this.i0;
            if (b2 == 15) {
                nm7.e().n(this, i6);
            } else if (b2 == 2) {
                gm.y3(false);
                nm7.e().n(this, i6);
            } else if (b2 == 3) {
                nm7.e().n(this, nm7.l4);
            }
            this.f0 = false;
            byte b3 = mh6Var.G;
            if (b3 == 1) {
                this.d = mh6Var.H;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                t();
                tk2Var.e = true;
                gl2[] gl2VarArr = tk2Var.f;
                int length = gl2VarArr.length;
                while (b < length) {
                    gl2VarArr[b].B(0.0f);
                    b++;
                }
                i = ((d) mh6Var).currentAccount;
                z(ConnectionsManager.getInstance(i).sendRequest(confirmphone, new cx3(this, confirmphone, (byte) 21), 2));
                return;
            }
            if (b3 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                t();
                tk2Var.e = true;
                for (gl2 gl2Var : tk2Var.f) {
                    gl2Var.B(0.0f);
                }
                i2 = ((d) mh6Var).currentAccount;
                z(ConnectionsManager.getInstance(i2).sendRequest(changephone, new r15(this, (byte) 8), 2));
                mh6Var.K1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            t();
            tk2Var.e = true;
            for (gl2 gl2Var2 : tk2Var.f) {
                gl2Var2.B(0.0f);
            }
            i3 = ((d) mh6Var).currentAccount;
            z(ConnectionsManager.getInstance(i3).sendRequest(tL_auth_signIn, new eg6(this, tL_auth_signIn, b), 10));
            mh6Var.K1(true, true);
        }
    }

    @Override // kla
    public final void j() {
        byte b = 0;
        p09 p09Var = this.a;
        if (p09Var != null) {
            p09Var.H(0);
        }
        gm.d3(new dg6(this, b), mh6.A0);
    }

    @Override // kla
    public final void k(Bundle bundle) {
        StringBuilder sb = new StringBuilder("smsview_params_");
        byte b = this.i0;
        sb.append((int) b);
        Bundle bundle2 = bundle.getBundle(sb.toString());
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.o0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + ((int) b));
        if (string2 != null) {
            tk2 tk2Var = this.f;
            if (tk2Var.f != null) {
                tk2Var.setText(string2);
            }
        }
        int i = bundle.getInt("time");
        if (i != 0) {
            this.b0 = i;
        }
        int i2 = bundle.getInt("open");
        if (i2 != 0) {
            this.W = i2;
        }
    }

    @Override // kla
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        byte b = this.i0;
        if (length != 0) {
            bundle.putString("smsview_code_" + ((int) b), code);
        }
        String str = this.o0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.I != null) {
            bundle.putBundle(hg9.j(b, "smsview_params_"), this.I);
        }
        int i = this.b0;
        if (i != 0) {
            bundle.putInt("time", i);
        }
        int i2 = this.W;
        if (i2 != 0) {
            bundle.putInt("open", i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0514, code lost:
    
        if (r7 == 16) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0327  */
    @Override // kla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z) {
        String S2;
        SpannableStringBuilder S22;
        byte b;
        byte b2;
        byte b3;
        String str;
        String string;
        int i;
        String str2;
        int i2 = nm7.k4;
        byte b4 = 0;
        if (bundle == null) {
            if (this.r0 == null || this.s0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            ng6 ng6Var = this.y;
            if (ng6Var != null) {
                ng6Var.setVisibility(0);
                anb.X(this.y, cmb.H6, null);
                int i3 = this.j0;
                this.y.setText(gm.E2(jb6.M0(i3 == 17 ? 2131745783 : i3 == 16 ? 2131745781 : 2131745782, null), true, gm.L(1.0f), gm.L(1.0f)));
                return;
            }
            return;
        }
        this.f0 = true;
        byte b5 = this.i0;
        if (b5 == 15) {
            nm7.e().a(this, i2);
        } else if (b5 == 2) {
            gm.y3(true);
            nm7.e().a(this, i2);
        } else if (b5 == 3) {
            gm.x3(true);
            nm7.e().a(this, nm7.l4);
            if (z) {
                gm.c3(new bn3((byte) 28));
            }
        }
        this.I = bundle;
        this.b = bundle.getString("phone");
        this.e = bundle.getString("ephone");
        this.d = bundle.getString("phoneFormated");
        this.c = bundle.getString("phoneHash");
        this.b0 = bundle.getInt("timeout");
        this.W = (int) (System.currentTimeMillis() / 1000);
        this.j0 = bundle.getInt("nextType");
        this.m0 = bundle.getString("pattern");
        this.n0 = bundle.getString("prefix");
        this.p0 = bundle.getInt("length");
        this.k0 = bundle.getInt("prevType", 0);
        if (this.p0 == 0) {
            this.p0 = 5;
        }
        this.q0 = bundle.getString("url");
        this.r0 = null;
        this.s0 = null;
        this.f.b(this.p0, this.i0);
        for (gl2 gl2Var : this.f.f) {
            gl2Var.setShowSoftInputOnFocusCompat(!a() || gm.A1());
            gl2Var.addTextChangedListener(new og6(this, b4));
            gl2Var.setOnFocusChangeListener(new tt0(this, (byte) 12));
        }
        int i4 = this.k0;
        pe6 pe6Var = this.h;
        if (i4 == 17) {
            pe6Var.setVisibility(0);
            this.h.setText(gm.E2(jb6.M0(2131753719, null), true, gm.L(-1.0f), gm.L(1.0f)));
        } else if (i4 == 16) {
            pe6Var.setVisibility(0);
            this.h.setText(gm.E2(jb6.M0(2131753718, null), true, gm.L(-1.0f), gm.L(1.0f)));
        } else {
            pe6Var.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String e = r58.f().e(this.b);
        if (this.v0.G == 1) {
            S22 = new SpannableStringBuilder(gm.S2(jb6.a0("CancelAccountResetInfo2", null, 2131752540, r58.f().e("+" + e))));
            int indexOf = TextUtils.indexOf((CharSequence) S22, '*');
            int lastIndexOf = TextUtils.lastIndexOf(S22, '*');
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new cm(b4));
                S22.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                S22.replace(indexOf, indexOf + 1, (CharSequence) "");
                S22.setSpan(new g6c("tg://settings/change_number", (wkb) null), indexOf, lastIndexOf - 1, 33);
            }
        } else {
            byte b6 = this.i0;
            if (b6 != 1) {
                S2 = b6 == 2 ? gm.S2(jb6.a0("SentSmsCode", null, 2131745301, jb6.a(e))) : b6 == 3 ? gm.S2(jb6.a0("SentCallCode", null, 2131745304, jb6.a(e))) : b6 == 4 ? gm.S2(jb6.a0("SentCallOnly", null, 2131745303, jb6.a(e))) : b6 == 15 ? gm.S2(jb6.a0("SentFragmentCode", null, 2131745302, jb6.a(e))) : "";
                this.n.setText(S2);
                b = this.i0;
                if (b != 15) {
                    if (b == 1) {
                        int i5 = this.j0;
                        if (i5 == 3 || i5 == 4 || i5 == 11) {
                            this.y.setText(jb6.M0(2131751381, null));
                        } else {
                            ng6 ng6Var2 = this.y;
                            if (i5 == 15) {
                                ng6Var2.setText(jb6.M0(2131751384, null));
                            } else if (i5 == 0) {
                                ng6Var2.setText(jb6.M0(2131751386, null));
                            } else {
                                ng6Var2.setText(jb6.M0(2131751380, null));
                            }
                        }
                    } else {
                        this.y.setText(jb6.M0(2131751386, null));
                    }
                }
                if (this.i0 == 3) {
                    this.v0.M1(this.f.f[0]);
                    this.f.f[0].requestFocus();
                } else {
                    gm.t1(this.f.f[0]);
                }
                t();
                s();
                this.d0 = System.currentTimeMillis();
                b2 = this.i0;
                if (b2 != 1) {
                    setProblemTextVisible(true);
                    this.w.setVisibility(8);
                    ng6 ng6Var3 = this.y;
                    if (ng6Var3 != null) {
                        ng6Var3.setVisibility(0);
                    }
                } else if (b2 == 3) {
                    int i6 = this.j0;
                    if (i6 == 4 || i6 == 2) {
                        i = 2131745031;
                    } else {
                        i = 2131745031;
                        if (i6 != 17 && i6 != 16 && i6 != 11) {
                            this.w.setVisibility(8);
                            if (z) {
                                String str3 = this.m0;
                                try {
                                    Cursor query = a.b.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "date"}, "type IN (3,1,5)", null, Build.VERSION.SDK_INT >= 26 ? "date DESC" : "date DESC LIMIT 5");
                                    while (query.moveToNext()) {
                                        try {
                                            String string2 = query.getString(0);
                                            long j = query.getLong(1);
                                            if (e21.a) {
                                                fc4.d("number = " + string2);
                                            }
                                            if (Math.abs(System.currentTimeMillis() - j) < 3600000 && gm.x(str3, string2)) {
                                                query.close();
                                                str2 = string2;
                                                break;
                                            }
                                        } finally {
                                        }
                                    }
                                    query.close();
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                }
                            }
                            str2 = null;
                            if (str2 == null) {
                                h(str2);
                            } else {
                                String str4 = this.o0;
                                if (str4 != null) {
                                    h(str4);
                                } else {
                                    int i7 = this.j0;
                                    if (i7 == 4 || i7 == 2 || i7 == 17 || i7 == 16 || i7 == 11) {
                                        r();
                                    }
                                }
                            }
                        }
                    }
                    setProblemTextVisible(false);
                    this.w.setVisibility(0);
                    this.y.setVisibility(8);
                    int i8 = this.j0;
                    if (i8 == 4 || i8 == 11) {
                        this.w.setText(jb6.a0("CallAvailableIn", null, 2131752583, 1, 0));
                    } else if (i8 == 2 || i8 == 17 || i8 == 16) {
                        this.w.setText(jb6.a0("SmsAvailableIn", null, i, 1, 0));
                    }
                    if (z) {
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                } else {
                    if (b2 == 2) {
                        int i9 = this.j0;
                        if (i9 == 2 || i9 == 17 || i9 == 16 || i9 == 4 || i9 == 3) {
                            if (i9 == 2 || i9 == 17 || i9 == 16) {
                                this.w.setText(jb6.a0("SmsAvailableIn", null, 2131745031, 1, 0));
                            } else {
                                this.w.setText(jb6.a0("CallAvailableIn", null, 2131752583, 2, 0));
                            }
                            setProblemTextVisible(this.b0 < 1000);
                            this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                            ng6 ng6Var4 = this.y;
                            if (ng6Var4 != null) {
                                ng6Var4.setVisibility(this.b0 < 1000 ? 0 : 8);
                            }
                            SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
                            String string3 = sharedPreferences.getString("sms_hash", null);
                            if (!TextUtils.isEmpty(string3) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                                if (string.contains(string3 + "|") && !this.v0.y) {
                                    str = string.substring(string.indexOf(nm7.H1) + 1);
                                    if (str == null) {
                                        this.f.setCode(str);
                                        h(null);
                                    } else {
                                        r();
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                        } else {
                            b3 = 4;
                        }
                    } else {
                        b3 = 4;
                    }
                    if (b2 == b3) {
                        int i10 = this.j0;
                        int i11 = (i10 == 2 || i10 == 17 || i10 == 11) ? 16 : 16;
                        if (i10 == 2 || i10 == 17 || i10 == i11) {
                            this.w.setText(jb6.a0("SmsAvailableIn", null, 2131745031, 1, 0));
                        } else {
                            this.w.setText(jb6.a0("CallAvailableIn", null, 2131752583, 2, 0));
                        }
                        setProblemTextVisible(this.b0 < 1000);
                        this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                        ng6 ng6Var5 = this.y;
                        if (ng6Var5 != null) {
                            ng6Var5.setVisibility(this.b0 < 1000 ? 0 : 8);
                        }
                        r();
                    }
                    if (b2 == 11) {
                        int i12 = this.j0;
                        if (i12 == 4 || i12 == 2 || i12 == 17 || i12 == 16 || i12 == 11) {
                            setProblemTextVisible(false);
                            this.w.setVisibility(0);
                            this.y.setVisibility(8);
                            int i13 = this.j0;
                            if (i13 == 4 || i13 == 11) {
                                this.w.setText(jb6.a0("CallAvailableIn", null, 2131752583, 1, 0));
                            } else if (i13 == 2 || i13 == 17 || i13 == 16) {
                                this.w.setText(jb6.a0("SmsAvailableIn", null, 2131745031, 1, 0));
                            }
                            r();
                        }
                    } else {
                        this.w.setVisibility(8);
                        ng6 ng6Var6 = this.y;
                        if (ng6Var6 != null) {
                            ng6Var6.setVisibility(0);
                        }
                        setProblemTextVisible(false);
                        q();
                    }
                }
                if (this.i0 != 11) {
                    String str5 = this.n0;
                    for (int i14 = 0; i14 < this.p0; i14++) {
                        str5 = td4.p(str5, "0");
                    }
                    String e3 = r58.f().e("+" + str5);
                    for (int i15 = 0; i15 < this.p0; i15++) {
                        int lastIndexOf2 = e3.lastIndexOf("0");
                        if (lastIndexOf2 >= 0) {
                            e3 = e3.substring(0, lastIndexOf2);
                        }
                    }
                    this.J.setText(e3.replaceAll("\\)", "").replaceAll("\\(", ""));
                    return;
                }
                return;
            }
            S22 = gm.S2(jb6.a0("SentAppCodeWithPhone", null, 2131745305, jb6.a(e)));
        }
        S2 = S22;
        this.n.setText(S2);
        b = this.i0;
        if (b != 15) {
        }
        if (this.i0 == 3) {
        }
        t();
        s();
        this.d0 = System.currentTimeMillis();
        b2 = this.i0;
        if (b2 != 1) {
        }
        if (this.i0 != 11) {
        }
    }

    public final void o(Runnable runnable) {
        if (this.i0 == 3) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            tk2 tk2Var = this.f;
            if (i >= tk2Var.f.length) {
                tk2Var.postDelayed(new k16(this, runnable, (byte) 25), (r2.length * 75) + 400);
                return;
            } else {
                tk2Var.postDelayed(new ig6(this, i, (byte) 2), i * 75);
                i++;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        gl2[] gl2VarArr;
        super.onConfigurationChanged(configuration);
        tk2 tk2Var = this.f;
        if (tk2Var == null || (gl2VarArr = tk2Var.f) == null) {
            return;
        }
        for (gl2 gl2Var : gl2VarArr) {
            gl2Var.setShowSoftInputOnFocusCompat(!a() || gm.A1());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.u0);
    }

    public final void q() {
        if (this.V != null) {
            return;
        }
        this.c0 = 15000;
        int i = this.b0;
        if (i > 15000) {
            this.c0 = i;
        }
        this.V = new Timer();
        this.e0 = System.currentTimeMillis();
        this.V.schedule(new qg6(this, (byte) 0), 0L, 1000L);
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        int i = cmb.C6;
        ng6 ng6Var = this.w;
        anb.X(ng6Var, i, null);
        ng6Var.setTag(R.id.color_key_tag, Integer.valueOf(i));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new qg6(this, (byte) 1), 0L, 1000L);
    }

    public final void s() {
        try {
            synchronized (this.a0) {
                Timer timer = this.V;
                if (timer != null) {
                    timer.cancel();
                    this.V = null;
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void t() {
        ng6 ng6Var = this.w;
        int i = cmb.C6;
        anb.X(ng6Var, i, null);
        this.w.setTag(R.id.color_key_tag, Integer.valueOf(i));
        try {
            synchronized (this.a0) {
                Timer timer = this.U;
                if (timer != null) {
                    timer.cancel();
                    this.U = null;
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:2|3|(1:5)(1:89)|6|7|8|9|(1:11)(1:86)|(1:85)|(1:82)|(3:19|(4:22|(5:24|25|(1:27)(1:31)|28|29)(1:32)|30|20)|33)|35|36|(4:73|74|(1:76)(1:79)|77)(1:38)|39|40|41|(2:43|(13:45|46|47|48|(1:50)|51|(1:67)(1:55)|56|(1:58)(1:66)|59|(1:61)|62|64))|71|46|47|48|(0)|51|(1:53)|67|56|(0)(0)|59|(0)|62|64) */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024d A[Catch: Exception -> 0x0281, TryCatch #4 {Exception -> 0x0281, blocks: (B:3:0x0005, B:6:0x006f, B:35:0x017f, B:39:0x01bb, B:46:0x01d9, B:51:0x01f1, B:55:0x0210, B:56:0x021b, B:59:0x023f, B:61:0x024d, B:62:0x025a, B:38:0x01b8, B:81:0x01b4, B:88:0x017c, B:9:0x00c8, B:11:0x00d4, B:13:0x00dc, B:16:0x00ec, B:19:0x00f8, B:20:0x00fc, B:22:0x0102, B:25:0x0112, B:28:0x0172, B:31:0x016e, B:82:0x00f2, B:85:0x00e6, B:74:0x0187, B:76:0x019d, B:79:0x01af), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Context context) {
        boolean z;
        int i;
        String str;
        WifiManager wifiManager;
        try {
            boolean z2 = false;
            PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
            Locale locale = Locale.US;
            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb = new StringBuilder();
            sb.append(this.e);
            sb.append(" Android Registration/Login Issue ");
            sb.append(str2);
            sb.append(this.v0.e ? " #paidauth" : "");
            intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb2.append("Device: ");
            sb2.append(Build.MANUFACTURER);
            sb2.append(" ");
            sb2.append(Build.MODEL);
            sb2.append("\n");
            sb2.append("OS version: SDK ");
            int i2 = Build.VERSION.SDK_INT;
            sb2.append(i2);
            sb2.append("\n");
            sb2.append("Locale: ");
            sb2.append(Locale.getDefault());
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Target Phone: +");
            sb2.append(this.d);
            sb2.append("\n");
            sb2.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(getContext());
                List<SubscriptionInfo> completeActiveSubscriptionInfoList = i2 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i2 >= 28) {
                    completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                    completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList != null) {
                    for (SubscriptionInfo subscriptionInfo : completeActiveSubscriptionInfoList) {
                        String number = subscriptionInfo.getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            String str3 = "SIM" + subscriptionInfo.getSimSlotIndex();
                            sb2.append(str3);
                            sb2.append(".Phone: ");
                            sb2.append(number);
                            sb2.append("\n");
                            sb2.append(str3);
                            sb2.append(".MCC: ");
                            sb2.append(subscriptionInfo.getMcc());
                            sb2.append("\n");
                            sb2.append(str3);
                            sb2.append(".MNC: ");
                            sb2.append(subscriptionInfo.getMnc());
                            sb2.append("\n");
                            sb2.append(str3);
                            sb2.append(".Carrier: ");
                            sb2.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                            sb2.append("\n\n");
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
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
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            Typeface typeface = gm.a;
            try {
                wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            } catch (Exception unused) {
            }
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    z = true;
                    sb2.append(z);
                    sb2.append("\n");
                    sb2.append("Airplane Mode: ");
                    if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                        z2 = true;
                    }
                    sb2.append(z2);
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("App: ");
                    sb2.append((int) e21.d);
                    sb2.append("\n");
                    i = packageInfo.versionCode % 10;
                    if (i != 1 || i == 2) {
                        str = "store";
                    } else {
                        a.t();
                        a.m();
                        str = "beta";
                    }
                    sb2.append("App version: ");
                    sb2.append(str2);
                    sb2.append(" ");
                    sb2.append(str);
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("Issue: ");
                    sb2.append(!this.v0.e ? "no_otp" : "no_otp_paid");
                    sb2.append("\n");
                    if (!TextUtils.isEmpty(this.h0)) {
                        sb2.append("Error: ");
                        sb2.append(this.h0);
                        sb2.append("\n");
                    }
                    sb2.append("\n\n================================================\n");
                    sb2.append("WRITE YOUR COMMENT HERE:\n");
                    sb2.append("\n");
                    sb2.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                }
            }
            z = false;
            sb2.append(z);
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
            }
            sb2.append(z2);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("App: ");
            sb2.append((int) e21.d);
            sb2.append("\n");
            i = packageInfo.versionCode % 10;
            if (i != 1) {
            }
            str = "store";
            sb2.append("App version: ");
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(str);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Issue: ");
            sb2.append(!this.v0.e ? "no_otp" : "no_otp_paid");
            sb2.append("\n");
            if (!TextUtils.isEmpty(this.h0)) {
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused2) {
            this.v0.z1(jb6.M0(R.string.AppName, null), jb6.M0(2131747933, "NoMailInstalled"));
        }
    }

    @Override // kla
    public final void updateColors() {
        int w0 = cmb.w0(null, this.v0.G == 1 ? cmb.F6 : cmb.C6, false);
        TextView textView = this.n;
        textView.setTextColor(w0);
        textView.setLinkTextColor(cmb.w0(null, cmb.O9, false));
        int i = cmb.F6;
        this.r.setTextColor(cmb.w0(null, i, false));
        byte b = this.i0;
        if (b == 11) {
            int i2 = cmb.x6;
            this.K.setTextColor(cmb.w0(null, i2, false));
            this.L.setTextColor(cmb.w0(null, i2, false));
            int w02 = cmb.w0(null, cmb.k6, false);
            int i3 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mh6.m1(this.M, w02, i3, mode);
            this.O = w02;
            int w03 = cmb.w0(null, i, false);
            mh6.m1(this.N, w03, this.P, mode);
            this.P = w03;
            this.J.setTextColor(cmb.w0(null, i, false));
        }
        p(this.a);
        p(this.Q);
        p(this.R);
        p(this.S);
        tk2 tk2Var = this.f;
        if (tk2Var != null) {
            tk2Var.invalidate();
        }
        ng6 ng6Var = this.w;
        Integer num = (Integer) ng6Var.getTag();
        if (num == null) {
            num = Integer.valueOf(cmb.C6);
        }
        ng6Var.setTextColor(cmb.w0(null, num.intValue(), false));
        if (b != 15) {
            this.y.setTextColor(cmb.w0(null, cmb.p6, false));
        }
        this.F.setTextColor(cmb.w0(null, cmb.p7, false));
    }

    public final void v() {
        int i;
        if (this.g0 || this.l0) {
            return;
        }
        mh6 mh6Var = this.v0;
        if (mh6Var.r0) {
            return;
        }
        this.l0 = true;
        this.w.invalidate();
        this.y.invalidate();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.b);
        bundle.putString("ephone", this.e);
        bundle.putString("phoneFormated", this.d);
        bundle.putInt("prevType", this.i0);
        this.g0 = true;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.d;
        tL_auth_resendCode.phone_code_hash = this.c;
        i = ((d) mh6Var).currentAccount;
        z(ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new hg6(this, bundle, (byte) 1), 10));
    }

    public final void x() {
        tk2 tk2Var = this.f;
        try {
            tk2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i = 0;
        while (true) {
            gl2[] gl2VarArr = tk2Var.f;
            if (i >= gl2VarArr.length) {
                break;
            }
            gl2VarArr[i].setText("");
            tk2Var.f[i].A(1.0f);
            i++;
        }
        ye6 ye6Var = this.x;
        if (ye6Var.getCurrentView() != this.F) {
            ye6Var.showNext();
        }
        tk2Var.f[0].requestFocus();
        gm.A3(this.i0 == 11 ? 3.5f : 10.0f, tk2Var, new dg6(this, (byte) 7));
        dg6 dg6Var = this.u0;
        removeCallbacks(dg6Var);
        postDelayed(dg6Var, 5000L);
        this.t0 = true;
    }

    public final void y(boolean z) {
        byte b = 1;
        if (this.Q == null) {
            this.v0.y1(z, true);
            return;
        }
        if (this.T) {
            this.T = false;
            this.s.setAutoRepeat(false);
            p09 p09Var = this.R;
            p09Var.F(0);
            p09Var.N(p09Var.e[0] - 1, new dg6(this, b));
        }
    }

    public final void z(int i) {
        p09 p09Var = this.Q;
        if (p09Var == null) {
            this.v0.B1(i, true);
            return;
        }
        if (this.T) {
            return;
        }
        this.T = true;
        p09 p09Var2 = this.a;
        byte b = 0;
        if (p09Var2.b0 != p09Var2.e[0] - 1) {
            p09Var2.u0 = new ig6(this, i, b);
            return;
        }
        p09Var.u0 = new dg6(this, (byte) 3);
        s09 s09Var = this.s;
        s09Var.setAutoRepeat(false);
        p09Var.I(0, false, false);
        s09Var.setAnimation(p09Var);
        s09Var.d();
    }
}
