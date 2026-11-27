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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tg6 extends cna implements fn7 {
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final e29 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final b29 Q;
    public final b29 R;
    public final b29 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final b29 a;
    public final Object a0;
    public String b;
    public int b0;
    public String c;
    public int c0;
    public String d;
    public double d0;
    public String e;
    public double e0;
    public final bk2 f;
    public boolean f0;
    public boolean g0;
    public final te6 h;
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
    public final e29 s;
    public TLRPC.TL_auth_sentCode s0;
    public boolean t0;
    public final gg6 u0;
    public final /* synthetic */ qh6 v0;
    public final rg6 w;
    public final cf6 x;
    public final rg6 y;

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
    public tg6(qh6 qh6Var, Context context, int i) {
        super(context);
        b29 b29Var;
        ViewGroup viewGroup;
        this.v0 = qh6Var;
        this.a0 = new Object();
        this.b0 = 60000;
        this.c0 = 15000;
        this.h0 = "";
        byte b = 0;
        this.l0 = false;
        this.m0 = "*";
        this.n0 = "";
        this.u0 = new gg6(this, (byte) 2);
        this.i0 = i;
        final byte b2 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(hl.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        bs2.t(textView2, 1, 18.0f);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        textView2.setGravity(49);
        String M0 = qh6Var.G != 1 ? null : ob6.M0(2131752569, null);
        if (i == 11) {
            textView2.setText(M0 == null ? ob6.M0(2131748165, null) : M0);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.M = imageView;
            ImageView imageView2 = new ImageView(context);
            this.N = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, tre.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, tre.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.K = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(hl.L(2.0f), 1.0f);
            textView3.setText(hl.S2(ob6.M0(2131748167, null)));
            addView(textView3, tre.t(-1, -2, 49, 36, 16, 36, 0));
            qg6 qg6Var = new qg6(this, context, b);
            this.f = qg6Var;
            LinearLayout j = uh9.j(context, 0);
            TextView textView4 = new TextView(context);
            this.J = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(hl.o());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            j.addView(textView4, tre.t(-2, -1, 16, 0, 0, 4, 0));
            j.addView(qg6Var, tre.o(-2, -1));
            addView(j, tre.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.L = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(hl.L(2.0f), 1.0f);
            textView5.setText(hl.S2(ob6.M0(2131748166, null)));
            addView(textView5, tre.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            int i2 = 64;
            if (i == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, tre.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, tre.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = hl.O1() ? 0 : hl.m;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, tre.e(-2, -2, 1));
                e29 e29Var = new e29(context);
                this.s = e29Var;
                b29 b29Var2 = new b29(R.raw.phone_flash_call, hl.L(64.0f), hl.L(64.0f), true, null);
                this.a = b29Var2;
                e29Var.setAnimation(b29Var2);
                frameLayout3.addView(e29Var, tre.c(64.0f, 64));
                textView2.setText(M0 == null ? ob6.M0(2131742458, null) : M0);
                linearLayout.addView(textView2, tre.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, tre.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i != 11) {
                    qg6 qg6Var2 = new qg6(this, context, b2);
                    this.f = qg6Var2;
                    addView(qg6Var2, tre.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i == 3) {
                    this.f.setVisibility(8);
                }
                te6 te6Var = new te6(qh6Var, context);
                this.h = te6Var;
                int i3 = aob.I6;
                yob.G(te6Var, i3, null);
                yob.X(te6Var, i3, qh6Var.getResourceProvider());
                te6Var.setTextSize(1, 14.0f);
                te6Var.setLineSpacing(hl.L(2.0f), 1.0f);
                te6Var.setPadding(hl.L(14.0f), hl.L(8.0f), hl.L(14.0f), hl.L(16.0f));
                final byte b3 = 0;
                te6Var.setOnClickListener(new View.OnClickListener(this) { // from class: ng6
                    public final /* synthetic */ tg6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4;
                        byte b4 = b3;
                        tg6 tg6Var = this.b;
                        switch (b4) {
                            case 0:
                                tg6Var.c(true);
                                break;
                            case 1:
                                rg6 rg6Var = tg6Var.w;
                                if (tg6Var.b0 <= 0 || tg6Var.U == null) {
                                    tg6Var.l0 = true;
                                    rg6Var.invalidate();
                                    yob.X(rg6Var, aob.I6, null);
                                    int i5 = tg6Var.j0;
                                    byte b5 = 0;
                                    if (i5 != 4 && i5 != 2 && i5 != 17 && i5 != 16 && i5 != 11 && i5 != 15) {
                                        if (i5 == 3) {
                                            hl.y3(false);
                                            jn7.e().n(tg6Var, jn7.j4);
                                            tg6Var.f0 = false;
                                            tg6Var.s();
                                            tg6Var.l0 = false;
                                            tg6Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i5 == 4 || i5 == 11) {
                                            rg6Var.setText(ob6.M0(2131752578, null));
                                        } else {
                                            rg6Var.setText(ob6.M0(2131745305, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", tg6Var.b);
                                        bundle.putString("ephone", tg6Var.e);
                                        bundle.putString("phoneFormated", tg6Var.d);
                                        bundle.putInt("prevType", tg6Var.i0);
                                        tg6Var.q();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = tg6Var.d;
                                        tL_auth_resendCode.phone_code_hash = tg6Var.c;
                                        i4 = ((e) tg6Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new kg6(tg6Var, bundle, b5), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    tg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tg6Var.q0)));
                                    break;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                        }
                    }
                });
                addView(te6Var, tre.t(-2, -2, 1, 0, 18, 0, 0));
                te6Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.E = frameLayout4;
                rg6 rg6Var = new rg6(this, context, (byte) 0);
                this.w = rg6Var;
                yob.G(rg6Var, i3, null);
                rg6Var.setLineSpacing(hl.L(2.0f), 1.0f);
                rg6Var.setPadding(hl.L(14.0f), hl.L(8.0f), hl.L(14.0f), hl.L(16.0f));
                rg6Var.setTextSize(1, 15.0f);
                rg6Var.setGravity(51);
                rg6Var.setOnClickListener(new View.OnClickListener(this) { // from class: ng6
                    public final /* synthetic */ tg6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4;
                        byte b4 = b2;
                        tg6 tg6Var = this.b;
                        switch (b4) {
                            case 0:
                                tg6Var.c(true);
                                break;
                            case 1:
                                rg6 rg6Var2 = tg6Var.w;
                                if (tg6Var.b0 <= 0 || tg6Var.U == null) {
                                    tg6Var.l0 = true;
                                    rg6Var2.invalidate();
                                    yob.X(rg6Var2, aob.I6, null);
                                    int i5 = tg6Var.j0;
                                    byte b5 = 0;
                                    if (i5 != 4 && i5 != 2 && i5 != 17 && i5 != 16 && i5 != 11 && i5 != 15) {
                                        if (i5 == 3) {
                                            hl.y3(false);
                                            jn7.e().n(tg6Var, jn7.j4);
                                            tg6Var.f0 = false;
                                            tg6Var.s();
                                            tg6Var.l0 = false;
                                            tg6Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i5 == 4 || i5 == 11) {
                                            rg6Var2.setText(ob6.M0(2131752578, null));
                                        } else {
                                            rg6Var2.setText(ob6.M0(2131745305, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", tg6Var.b);
                                        bundle.putString("ephone", tg6Var.e);
                                        bundle.putString("phoneFormated", tg6Var.d);
                                        bundle.putInt("prevType", tg6Var.i0);
                                        tg6Var.q();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = tg6Var.d;
                                        tL_auth_resendCode.phone_code_hash = tg6Var.c;
                                        i4 = ((e) tg6Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new kg6(tg6Var, bundle, b5), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    tg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tg6Var.q0)));
                                    break;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                        }
                    }
                });
                frameLayout4.addView(rg6Var, tre.e(-2, -2, 49));
                cf6 cf6Var = new cf6(context, b2);
                this.x = cf6Var;
                if (i == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = dt3.e;
                    loadAnimation.setInterpolator(interpolator);
                    cf6Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    cf6Var.setOutAnimation(loadAnimation2);
                    rg6 rg6Var2 = new rg6(this, context, (byte) 1);
                    this.y = rg6Var2;
                    rg6Var2.setLineSpacing(hl.L(2.0f), 1.0f);
                    rg6Var2.setTextSize(1, 15.0f);
                    rg6Var2.setGravity(49);
                    rg6Var2.setPadding(hl.L(14.0f), hl.L(8.0f), hl.L(14.0f), hl.L(16.0f));
                    frameLayout4.addView(rg6Var2, tre.e(-1, -2, 17));
                    cf6Var.addView(frameLayout4, tre.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = k43.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    cf6Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    cf6Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.G = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                    int L = hl.L(6.0f);
                    int i4 = aob.Ni;
                    int w0 = aob.w0(null, i4, false);
                    int i5 = aob.Q9;
                    int w02 = aob.w0(null, i5, false);
                    hf0 i0 = aob.i0(L, L, L, L, w0, w02, w02);
                    uob M = yob.M(i4);
                    uob M2 = yob.M(i5);
                    linearLayout2.setBackground(i0);
                    yob.j(linearLayout2, i0, M, M2, null);
                    final byte b4 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ng6
                        public final /* synthetic */ tg6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i42;
                            byte b42 = b4;
                            tg6 tg6Var = this.b;
                            switch (b42) {
                                case 0:
                                    tg6Var.c(true);
                                    break;
                                case 1:
                                    rg6 rg6Var22 = tg6Var.w;
                                    if (tg6Var.b0 <= 0 || tg6Var.U == null) {
                                        tg6Var.l0 = true;
                                        rg6Var22.invalidate();
                                        yob.X(rg6Var22, aob.I6, null);
                                        int i52 = tg6Var.j0;
                                        byte b5 = 0;
                                        if (i52 != 4 && i52 != 2 && i52 != 17 && i52 != 16 && i52 != 11 && i52 != 15) {
                                            if (i52 == 3) {
                                                hl.y3(false);
                                                jn7.e().n(tg6Var, jn7.j4);
                                                tg6Var.f0 = false;
                                                tg6Var.s();
                                                tg6Var.l0 = false;
                                                tg6Var.v();
                                                break;
                                            }
                                        } else {
                                            if (i52 == 4 || i52 == 11) {
                                                rg6Var22.setText(ob6.M0(2131752578, null));
                                            } else {
                                                rg6Var22.setText(ob6.M0(2131745305, null));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", tg6Var.b);
                                            bundle.putString("ephone", tg6Var.e);
                                            bundle.putString("phoneFormated", tg6Var.d);
                                            bundle.putInt("prevType", tg6Var.i0);
                                            tg6Var.q();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = tg6Var.d;
                                            tL_auth_resendCode.phone_code_hash = tg6Var.c;
                                            i42 = ((e) tg6Var.v0).currentAccount;
                                            ConnectionsManager.getInstance(i42).sendRequest(tL_auth_resendCode, new kg6(tg6Var, bundle, b5), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    try {
                                        tg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tg6Var.q0)));
                                        break;
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        return;
                                    }
                            }
                        }
                    });
                    cf6Var.addView(linearLayout2, tre.c(52.0f, -1));
                    e29 e29Var2 = new e29(context);
                    this.H = e29Var2;
                    e29Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(e29Var2, tre.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(ob6.M0(2131747532, null));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(hl.o());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.F = textView7;
                textView7.setText(ob6.M0(2131742492, null));
                textView7.setLineSpacing(hl.L(2.0f), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
                cf6Var.addView(textView7, tre.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(cf6Var, tre.d(i == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, tre.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(cf6Var, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                ko9.e(cf6Var);
                if (i == 15) {
                    this.y.setOnClickListener(new uv5(this, context, (byte) 9));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, tre.t(-2, -2, 49, 0, 16, 0, 0));
            if (i == 1) {
                i2 = 128;
                float f = 128;
                b29Var = new b29(R.raw.code_laptop, hl.L(f), hl.L(f), true, null);
                this.a = b29Var;
            } else {
                float f2 = 64;
                b29 b29Var3 = new b29(R.raw.sms_incoming_info, hl.L(f2), hl.L(f2), true, null);
                this.a = b29Var3;
                this.Q = new b29(R.raw.phone_stars_to_dots, hl.L(f2), hl.L(f2), true, null);
                this.R = new b29(R.raw.phone_dots, hl.L(f2), hl.L(f2), true, null);
                this.S = new b29(R.raw.phone_dots_to_stars, hl.L(f2), hl.L(f2), true, null);
                b29Var = b29Var3;
            }
            e29 e29Var3 = new e29(context);
            this.s = e29Var3;
            e29Var3.setAnimation(b29Var);
            if (i == 1 && !hl.M1()) {
                e29Var3.setTranslationY(-hl.L(24.0f));
            }
            frameLayout6.addView(e29Var3, tre.d(i2, i2, 51, 0.0f, 0.0f, 0.0f, (i != 1 || hl.M1()) ? 0.0f : -hl.L(16.0f)));
            if (M0 == null) {
                M0 = ob6.M0(i == 1 ? 2131745300 : 2131745294, null);
            }
            textView2.setText(M0);
            addView(textView2, tre.t(-2, -2, 49, 0, 18, 0, 0));
            int i6 = i == 15 ? 16 : 0;
            addView(textView, tre.t(-2, -2, 49, i6, 17, i6, 0));
        }
        viewGroup = null;
        if (i != 11) {
        }
        if (i == 3) {
        }
        te6 te6Var2 = new te6(qh6Var, context);
        this.h = te6Var2;
        int i32 = aob.I6;
        yob.G(te6Var2, i32, null);
        yob.X(te6Var2, i32, qh6Var.getResourceProvider());
        te6Var2.setTextSize(1, 14.0f);
        te6Var2.setLineSpacing(hl.L(2.0f), 1.0f);
        te6Var2.setPadding(hl.L(14.0f), hl.L(8.0f), hl.L(14.0f), hl.L(16.0f));
        final byte b32 = 0;
        te6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ng6
            public final /* synthetic */ tg6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42;
                byte b42 = b32;
                tg6 tg6Var = this.b;
                switch (b42) {
                    case 0:
                        tg6Var.c(true);
                        break;
                    case 1:
                        rg6 rg6Var22 = tg6Var.w;
                        if (tg6Var.b0 <= 0 || tg6Var.U == null) {
                            tg6Var.l0 = true;
                            rg6Var22.invalidate();
                            yob.X(rg6Var22, aob.I6, null);
                            int i52 = tg6Var.j0;
                            byte b5 = 0;
                            if (i52 != 4 && i52 != 2 && i52 != 17 && i52 != 16 && i52 != 11 && i52 != 15) {
                                if (i52 == 3) {
                                    hl.y3(false);
                                    jn7.e().n(tg6Var, jn7.j4);
                                    tg6Var.f0 = false;
                                    tg6Var.s();
                                    tg6Var.l0 = false;
                                    tg6Var.v();
                                    break;
                                }
                            } else {
                                if (i52 == 4 || i52 == 11) {
                                    rg6Var22.setText(ob6.M0(2131752578, null));
                                } else {
                                    rg6Var22.setText(ob6.M0(2131745305, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", tg6Var.b);
                                bundle.putString("ephone", tg6Var.e);
                                bundle.putString("phoneFormated", tg6Var.d);
                                bundle.putInt("prevType", tg6Var.i0);
                                tg6Var.q();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = tg6Var.d;
                                tL_auth_resendCode.phone_code_hash = tg6Var.c;
                                i42 = ((e) tg6Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i42).sendRequest(tL_auth_resendCode, new kg6(tg6Var, bundle, b5), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            tg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tg6Var.q0)));
                            break;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                }
            }
        });
        addView(te6Var2, tre.t(-2, -2, 1, 0, 18, 0, 0));
        te6Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.E = frameLayout42;
        rg6 rg6Var3 = new rg6(this, context, (byte) 0);
        this.w = rg6Var3;
        yob.G(rg6Var3, i32, null);
        rg6Var3.setLineSpacing(hl.L(2.0f), 1.0f);
        rg6Var3.setPadding(hl.L(14.0f), hl.L(8.0f), hl.L(14.0f), hl.L(16.0f));
        rg6Var3.setTextSize(1, 15.0f);
        rg6Var3.setGravity(51);
        rg6Var3.setOnClickListener(new View.OnClickListener(this) { // from class: ng6
            public final /* synthetic */ tg6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42;
                byte b42 = b2;
                tg6 tg6Var = this.b;
                switch (b42) {
                    case 0:
                        tg6Var.c(true);
                        break;
                    case 1:
                        rg6 rg6Var22 = tg6Var.w;
                        if (tg6Var.b0 <= 0 || tg6Var.U == null) {
                            tg6Var.l0 = true;
                            rg6Var22.invalidate();
                            yob.X(rg6Var22, aob.I6, null);
                            int i52 = tg6Var.j0;
                            byte b5 = 0;
                            if (i52 != 4 && i52 != 2 && i52 != 17 && i52 != 16 && i52 != 11 && i52 != 15) {
                                if (i52 == 3) {
                                    hl.y3(false);
                                    jn7.e().n(tg6Var, jn7.j4);
                                    tg6Var.f0 = false;
                                    tg6Var.s();
                                    tg6Var.l0 = false;
                                    tg6Var.v();
                                    break;
                                }
                            } else {
                                if (i52 == 4 || i52 == 11) {
                                    rg6Var22.setText(ob6.M0(2131752578, null));
                                } else {
                                    rg6Var22.setText(ob6.M0(2131745305, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", tg6Var.b);
                                bundle.putString("ephone", tg6Var.e);
                                bundle.putString("phoneFormated", tg6Var.d);
                                bundle.putInt("prevType", tg6Var.i0);
                                tg6Var.q();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = tg6Var.d;
                                tL_auth_resendCode.phone_code_hash = tg6Var.c;
                                i42 = ((e) tg6Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i42).sendRequest(tL_auth_resendCode, new kg6(tg6Var, bundle, b5), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            tg6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tg6Var.q0)));
                            break;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                }
            }
        });
        frameLayout42.addView(rg6Var3, tre.e(-2, -2, 49));
        cf6 cf6Var2 = new cf6(context, b2);
        this.x = cf6Var2;
        if (i == 15) {
        }
        TextView textView72 = new TextView(context);
        this.F = textView72;
        textView72.setText(ob6.M0(2131742492, null));
        textView72.setLineSpacing(hl.L(2.0f), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
        cf6Var2.addView(textView72, tre.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        ko9.e(cf6Var2);
        if (i == 15) {
        }
    }

    public static void p(b29 b29Var) {
        if (b29Var != null) {
            b29Var.L(aob.w0(null, aob.P9, false), "Bubble");
            int i = aob.G6;
            b29Var.L(aob.w0(null, i, false), "Phone");
            b29Var.L(aob.w0(null, i, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z) {
        rg6 rg6Var = this.y;
        if (rg6Var != null) {
            float f = z ? 1.0f : 0.0f;
            if (rg6Var.getAlpha() != f) {
                rg6Var.animate().cancel();
                rg6Var.animate().alpha(f).setDuration(150L).start();
            }
        }
    }

    @Override // cna
    public final boolean a() {
        return this.i0 != 3;
    }

    @Override // cna
    public final boolean b() {
        return true;
    }

    @Override // cna
    public final boolean c(boolean z) {
        int i;
        qh6 qh6Var = this.v0;
        byte b = 0;
        if (qh6Var.G != 0) {
            qh6Var.finishFragment();
            return false;
        }
        int i2 = this.k0;
        if (i2 != 0) {
            qh6Var.J1(i2, true, null, true);
            return false;
        }
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
            String M0 = ob6.M0(2131751228, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = hl.S2(ob6.a0("EditNumberInfo", null, 2131751227, this.b));
            alertDialog$Builder.j(ob6.M0(2131752006, null), null);
            alertDialog$Builder.g(ob6.M0(2131751300, null), new ig6(this, b));
            qh6Var.showDialog(idVar);
            return false;
        }
        this.g0 = false;
        y(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i = ((e) qh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_cancelCode, new xe2(b), 10);
        t();
        s();
        this.I = null;
        int i3 = jn7.j4;
        byte b2 = this.i0;
        if (b2 == 15) {
            jn7.e().n(this, i3);
        } else if (b2 == 2) {
            hl.y3(false);
            jn7.e().n(this, i3);
        } else if (b2 == 3) {
            hl.x3(false);
            jn7.e().n(this, jn7.k4);
        }
        this.f0 = false;
        return true;
    }

    @Override // cna
    public final void d() {
        this.g0 = false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.f0) {
            bk2 bk2Var = this.f;
            if (bk2Var.f != null) {
                if (i == jn7.j4) {
                    bk2Var.setText(String.valueOf(objArr[0]));
                    h(null);
                    return;
                }
                if (i == jn7.k4) {
                    String valueOf = String.valueOf(objArr[0]);
                    if (hl.x(this.m0, valueOf)) {
                        if (!this.m0.equals("*")) {
                            this.o0 = valueOf;
                            hl.T();
                        }
                        h(valueOf);
                        int i3 = CallReceiver.a;
                        xea.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override // cna
    public final void e() {
        int i = jn7.j4;
        byte b = this.i0;
        if (b == 15) {
            jn7.e().n(this, i);
        } else if (b == 2) {
            hl.y3(false);
            jn7.e().n(this, i);
        } else if (b == 3) {
            hl.x3(false);
            jn7.e().n(this, jn7.k4);
        }
        this.f0 = false;
        t();
        s();
    }

    @Override // cna
    public final void g() {
        Bundle bundle;
        this.l0 = false;
        this.g0 = false;
        if (this.k0 == 0 || (bundle = this.I) == null) {
            return;
        }
        bundle.putInt("timeout", this.b0);
    }

    @Override // cna
    public String getHeaderName() {
        byte b = this.i0;
        return (b == 3 || b == 11) ? this.b : ob6.M0(2131742458, "YourCode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cna
    public final void h(String str) {
        int i;
        int i2;
        int i3;
        qh6 qh6Var = this.v0;
        int i4 = qh6Var.a;
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
        bk2 bk2Var = this.f;
        if (str == null) {
            str = bk2Var.getCode();
        }
        byte b = 0;
        if (TextUtils.isEmpty(str)) {
            qh6.E1(bk2Var, false);
            return;
        }
        int i5 = qh6Var.a;
        if (i5 < 1 || i5 > 4 || !bk2Var.e) {
            this.g0 = true;
            int i6 = jn7.j4;
            byte b2 = this.i0;
            if (b2 == 15) {
                jn7.e().n(this, i6);
            } else if (b2 == 2) {
                hl.y3(false);
                jn7.e().n(this, i6);
            } else if (b2 == 3) {
                jn7.e().n(this, jn7.k4);
            }
            this.f0 = false;
            byte b3 = qh6Var.G;
            if (b3 == 1) {
                this.d = qh6Var.H;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                t();
                bk2Var.e = true;
                ok2[] ok2VarArr = bk2Var.f;
                int length = ok2VarArr.length;
                while (b < length) {
                    ok2VarArr[b].B(0.0f);
                    b++;
                }
                i = ((e) qh6Var).currentAccount;
                z(ConnectionsManager.getInstance(i).sendRequest(confirmphone, new mw3(this, confirmphone, (byte) 21), 2));
                return;
            }
            if (b3 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                t();
                bk2Var.e = true;
                for (ok2 ok2Var : bk2Var.f) {
                    ok2Var.B(0.0f);
                }
                i2 = ((e) qh6Var).currentAccount;
                z(ConnectionsManager.getInstance(i2).sendRequest(changephone, new w15(this, (byte) 8), 2));
                qh6Var.K1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            t();
            bk2Var.e = true;
            for (ok2 ok2Var2 : bk2Var.f) {
                ok2Var2.B(0.0f);
            }
            i3 = ((e) qh6Var).currentAccount;
            z(ConnectionsManager.getInstance(i3).sendRequest(tL_auth_signIn, new hg6(this, tL_auth_signIn, b), 10));
            qh6Var.K1(true, true);
        }
    }

    @Override // cna
    public final void j() {
        byte b = 0;
        b29 b29Var = this.a;
        if (b29Var != null) {
            b29Var.H(0);
        }
        hl.d3(new gg6(this, b), qh6.A0);
    }

    @Override // cna
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
            bk2 bk2Var = this.f;
            if (bk2Var.f != null) {
                bk2Var.setText(string2);
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

    @Override // cna
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
            bundle.putBundle(uh9.k(b, "smsview_params_"), this.I);
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
    @Override // cna
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
        int i2 = jn7.j4;
        byte b4 = 0;
        if (bundle == null) {
            if (this.r0 == null || this.s0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            rg6 rg6Var = this.y;
            if (rg6Var != null) {
                rg6Var.setVisibility(0);
                yob.X(this.y, aob.I6, null);
                int i3 = this.j0;
                this.y.setText(hl.E2(ob6.M0(i3 == 17 ? 2131745777 : i3 == 16 ? 2131745775 : 2131745776, null), true, hl.L(1.0f), hl.L(1.0f)));
                return;
            }
            return;
        }
        this.f0 = true;
        byte b5 = this.i0;
        if (b5 == 15) {
            jn7.e().a(this, i2);
        } else if (b5 == 2) {
            hl.y3(true);
            jn7.e().a(this, i2);
        } else if (b5 == 3) {
            hl.x3(true);
            jn7.e().a(this, jn7.k4);
            if (z) {
                hl.c3(new pg6(b4));
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
        for (ok2 ok2Var : this.f.f) {
            ok2Var.setShowSoftInputOnFocusCompat(!a() || hl.A1());
            ok2Var.addTextChangedListener(new c7(this, (byte) 29));
            ok2Var.setOnFocusChangeListener(new ts0(this, (byte) 12));
        }
        int i4 = this.k0;
        te6 te6Var = this.h;
        if (i4 == 17) {
            te6Var.setVisibility(0);
            this.h.setText(hl.E2(ob6.M0(2131753747, null), true, hl.L(-1.0f), hl.L(1.0f)));
        } else if (i4 == 16) {
            te6Var.setVisibility(0);
            this.h.setText(hl.E2(ob6.M0(2131753746, null), true, hl.L(-1.0f), hl.L(1.0f)));
        } else {
            te6Var.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String e = f78.f().e(this.b);
        if (this.v0.G == 1) {
            S22 = new SpannableStringBuilder(hl.S2(ob6.a0("CancelAccountResetInfo2", null, 2131752568, f78.f().e("+" + e))));
            int indexOf = TextUtils.indexOf((CharSequence) S22, '*');
            int lastIndexOf = TextUtils.lastIndexOf(S22, '*');
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new dl(b4));
                S22.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                S22.replace(indexOf, indexOf + 1, (CharSequence) "");
                S22.setSpan(new f8c("tg://settings/change_number", (rmb) null), indexOf, lastIndexOf - 1, 33);
            }
        } else {
            byte b6 = this.i0;
            if (b6 != 1) {
                S2 = b6 == 2 ? hl.S2(ob6.a0("SentSmsCode", null, 2131745295, ob6.a(e))) : b6 == 3 ? hl.S2(ob6.a0("SentCallCode", null, 2131745298, ob6.a(e))) : b6 == 4 ? hl.S2(ob6.a0("SentCallOnly", null, 2131745297, ob6.a(e))) : b6 == 15 ? hl.S2(ob6.a0("SentFragmentCode", null, 2131745296, ob6.a(e))) : "";
                this.n.setText(S2);
                b = this.i0;
                if (b != 15) {
                    if (b == 1) {
                        int i5 = this.j0;
                        if (i5 == 3 || i5 == 4 || i5 == 11) {
                            this.y.setText(ob6.M0(2131751409, null));
                        } else {
                            rg6 rg6Var2 = this.y;
                            if (i5 == 15) {
                                rg6Var2.setText(ob6.M0(2131751412, null));
                            } else if (i5 == 0) {
                                rg6Var2.setText(ob6.M0(2131751414, null));
                            } else {
                                rg6Var2.setText(ob6.M0(2131751408, null));
                            }
                        }
                    } else {
                        this.y.setText(ob6.M0(2131751414, null));
                    }
                }
                if (this.i0 == 3) {
                    this.v0.M1(this.f.f[0]);
                    this.f.f[0].requestFocus();
                } else {
                    hl.t1(this.f.f[0]);
                }
                t();
                s();
                this.d0 = System.currentTimeMillis();
                b2 = this.i0;
                if (b2 != 1) {
                    setProblemTextVisible(true);
                    this.w.setVisibility(8);
                    rg6 rg6Var3 = this.y;
                    if (rg6Var3 != null) {
                        rg6Var3.setVisibility(0);
                    }
                } else if (b2 == 3) {
                    int i6 = this.j0;
                    if (i6 == 4 || i6 == 2) {
                        i = 2131745025;
                    } else {
                        i = 2131745025;
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
                                            if (f11.a) {
                                                cc4.d("number = " + string2);
                                            }
                                            if (Math.abs(System.currentTimeMillis() - j) < 3600000 && hl.x(str3, string2)) {
                                                query.close();
                                                str2 = string2;
                                                break;
                                            }
                                        } finally {
                                        }
                                    }
                                    query.close();
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
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
                        this.w.setText(ob6.a0("CallAvailableIn", null, 2131752611, 1, 0));
                    } else if (i8 == 2 || i8 == 17 || i8 == 16) {
                        this.w.setText(ob6.a0("SmsAvailableIn", null, i, 1, 0));
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
                                this.w.setText(ob6.a0("SmsAvailableIn", null, 2131745025, 1, 0));
                            } else {
                                this.w.setText(ob6.a0("CallAvailableIn", null, 2131752611, 2, 0));
                            }
                            setProblemTextVisible(this.b0 < 1000);
                            this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                            rg6 rg6Var4 = this.y;
                            if (rg6Var4 != null) {
                                rg6Var4.setVisibility(this.b0 < 1000 ? 0 : 8);
                            }
                            SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
                            String string3 = sharedPreferences.getString("sms_hash", null);
                            if (!TextUtils.isEmpty(string3) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                                if (string.contains(string3 + "|") && !this.v0.y) {
                                    str = string.substring(string.indexOf(jn7.H1) + 1);
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
                            this.w.setText(ob6.a0("SmsAvailableIn", null, 2131745025, 1, 0));
                        } else {
                            this.w.setText(ob6.a0("CallAvailableIn", null, 2131752611, 2, 0));
                        }
                        setProblemTextVisible(this.b0 < 1000);
                        this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                        rg6 rg6Var5 = this.y;
                        if (rg6Var5 != null) {
                            rg6Var5.setVisibility(this.b0 < 1000 ? 0 : 8);
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
                                this.w.setText(ob6.a0("CallAvailableIn", null, 2131752611, 1, 0));
                            } else if (i13 == 2 || i13 == 17 || i13 == 16) {
                                this.w.setText(ob6.a0("SmsAvailableIn", null, 2131745025, 1, 0));
                            }
                            r();
                        }
                    } else {
                        this.w.setVisibility(8);
                        rg6 rg6Var6 = this.y;
                        if (rg6Var6 != null) {
                            rg6Var6.setVisibility(0);
                        }
                        setProblemTextVisible(false);
                        q();
                    }
                }
                if (this.i0 != 11) {
                    String str5 = this.n0;
                    for (int i14 = 0; i14 < this.p0; i14++) {
                        str5 = qd4.o(str5, "0");
                    }
                    String e3 = f78.f().e("+" + str5);
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
            S22 = hl.S2(ob6.a0("SentAppCodeWithPhone", null, 2131745299, ob6.a(e)));
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
            bk2 bk2Var = this.f;
            if (i >= bk2Var.f.length) {
                bk2Var.postDelayed(new z56(this, runnable, (byte) 21), (r2.length * 75) + 400);
                return;
            } else {
                bk2Var.postDelayed(new lg6(this, i, (byte) 2), i * 75);
                i++;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ok2[] ok2VarArr;
        super.onConfigurationChanged(configuration);
        bk2 bk2Var = this.f;
        if (bk2Var == null || (ok2VarArr = bk2Var.f) == null) {
            return;
        }
        for (ok2 ok2Var : ok2VarArr) {
            ok2Var.setShowSoftInputOnFocusCompat(!a() || hl.A1());
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
        this.V.schedule(new sg6(this, (byte) 0), 0L, 1000L);
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        int i = aob.D6;
        rg6 rg6Var = this.w;
        yob.X(rg6Var, i, null);
        rg6Var.setTag(R.id.color_key_tag, Integer.valueOf(i));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new sg6(this, (byte) 1), 0L, 1000L);
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
            cc4.g(e, true);
        }
    }

    public final void t() {
        rg6 rg6Var = this.w;
        int i = aob.D6;
        yob.X(rg6Var, i, null);
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
            cc4.g(e, true);
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
                cc4.g(e, true);
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
                    cc4.g(e2, true);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            Typeface typeface = hl.a;
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
                    sb2.append((int) f11.d);
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
            sb2.append((int) f11.d);
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
            this.v0.z1(ob6.M0(R.string.AppName, null), ob6.M0(2131747930, "NoMailInstalled"));
        }
    }

    @Override // cna
    public final void updateColors() {
        int w0 = aob.w0(null, this.v0.G == 1 ? aob.G6 : aob.D6, false);
        TextView textView = this.n;
        textView.setTextColor(w0);
        textView.setLinkTextColor(aob.w0(null, aob.P9, false));
        int i = aob.G6;
        this.r.setTextColor(aob.w0(null, i, false));
        byte b = this.i0;
        if (b == 11) {
            int i2 = aob.y6;
            this.K.setTextColor(aob.w0(null, i2, false));
            this.L.setTextColor(aob.w0(null, i2, false));
            int w02 = aob.w0(null, aob.l6, false);
            int i3 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            qh6.m1(this.M, w02, i3, mode);
            this.O = w02;
            int w03 = aob.w0(null, i, false);
            qh6.m1(this.N, w03, this.P, mode);
            this.P = w03;
            this.J.setTextColor(aob.w0(null, i, false));
        }
        p(this.a);
        p(this.Q);
        p(this.R);
        p(this.S);
        bk2 bk2Var = this.f;
        if (bk2Var != null) {
            bk2Var.invalidate();
        }
        rg6 rg6Var = this.w;
        Integer num = (Integer) rg6Var.getTag();
        if (num == null) {
            num = Integer.valueOf(aob.D6);
        }
        rg6Var.setTextColor(aob.w0(null, num.intValue(), false));
        if (b != 15) {
            this.y.setTextColor(aob.w0(null, aob.q6, false));
        }
        this.F.setTextColor(aob.w0(null, aob.q7, false));
    }

    public final void v() {
        int i;
        if (this.g0 || this.l0) {
            return;
        }
        qh6 qh6Var = this.v0;
        if (qh6Var.r0) {
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
        i = ((e) qh6Var).currentAccount;
        z(ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new kg6(this, bundle, (byte) 1), 10));
    }

    public final void w() {
        bk2 bk2Var = this.f;
        try {
            bk2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i = 0;
        while (true) {
            ok2[] ok2VarArr = bk2Var.f;
            if (i >= ok2VarArr.length) {
                break;
            }
            ok2VarArr[i].setText("");
            bk2Var.f[i].A(1.0f);
            i++;
        }
        cf6 cf6Var = this.x;
        if (cf6Var.getCurrentView() != this.F) {
            cf6Var.showNext();
        }
        bk2Var.f[0].requestFocus();
        hl.A3(this.i0 == 11 ? 3.5f : 10.0f, bk2Var, new gg6(this, (byte) 7));
        gg6 gg6Var = this.u0;
        removeCallbacks(gg6Var);
        postDelayed(gg6Var, 5000L);
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
            b29 b29Var = this.R;
            b29Var.F(0);
            b29Var.N(b29Var.e[0] - 1, new gg6(this, b));
        }
    }

    public final void z(int i) {
        b29 b29Var = this.Q;
        if (b29Var == null) {
            this.v0.B1(i, true);
            return;
        }
        if (this.T) {
            return;
        }
        this.T = true;
        b29 b29Var2 = this.a;
        byte b = 0;
        if (b29Var2.b0 != b29Var2.e[0] - 1) {
            b29Var2.u0 = new lg6(this, i, b);
            return;
        }
        b29Var.u0 = new gg6(this, (byte) 3);
        e29 e29Var = this.s;
        e29Var.setAutoRepeat(false);
        b29Var.I(0, false, false);
        e29Var.setAnimation(b29Var);
        e29Var.d();
    }
}
