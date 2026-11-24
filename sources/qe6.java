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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qe6 extends jja implements gk7 {
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final ry8 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final oy8 Q;
    public final oy8 R;
    public final oy8 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final oy8 a;
    public final Object a0;
    public String b;
    public int b0;
    public String c;
    public int c0;
    public String d;
    public double d0;
    public String e;
    public double e0;
    public final fj2 f;
    public boolean f0;
    public boolean g0;
    public final qc6 h;
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
    public final ry8 s;
    public TLRPC.TL_auth_sentCode s0;
    public boolean t0;
    public final ee6 u0;
    public final /* synthetic */ mf6 v0;
    public final oe6 w;
    public final zc6 x;
    public final oe6 y;

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
    public qe6(mf6 mf6Var, Context context, int i) {
        super(context);
        oy8 oy8Var;
        ViewGroup viewGroup;
        this.v0 = mf6Var;
        this.a0 = new Object();
        this.b0 = 60000;
        this.c0 = 15000;
        this.h0 = "";
        byte b = 0;
        this.l0 = false;
        this.m0 = "*";
        this.n0 = "";
        this.u0 = new ee6(this, (byte) 2);
        this.i0 = i;
        final byte b2 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(gl.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        ir2.t(textView2, 1, 18.0f);
        textView2.setGravity(k96.a0 ? 5 : 3);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        textView2.setGravity(49);
        String M0 = mf6Var.G != 1 ? null : k96.M0(2131752576, null);
        if (i == 11) {
            textView2.setText(M0 == null ? k96.M0(2131748219, null) : M0);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.M = imageView;
            ImageView imageView2 = new ImageView(context);
            this.N = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, nme.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, nme.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.K = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(gl.L(2.0f), 1.0f);
            textView3.setText(gl.S2(k96.M0(2131748221, null)));
            addView(textView3, nme.t(-1, -2, 49, 36, 16, 36, 0));
            ne6 ne6Var = new ne6(this, context, b);
            this.f = ne6Var;
            LinearLayout j = de9.j(context, 0);
            TextView textView4 = new TextView(context);
            this.J = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(gl.o());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            j.addView(textView4, nme.t(-2, -1, 16, 0, 0, 4, 0));
            j.addView(ne6Var, nme.o(-2, -1));
            addView(j, nme.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.L = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(gl.L(2.0f), 1.0f);
            textView5.setText(gl.S2(k96.M0(2131748220, null)));
            addView(textView5, nme.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            int i2 = 64;
            if (i == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, nme.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, nme.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = gl.O1() ? 0 : gl.m;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, nme.e(-2, -2, 1));
                ry8 ry8Var = new ry8(context);
                this.s = ry8Var;
                oy8 oy8Var2 = new oy8(R.raw.phone_flash_call, gl.L(64.0f), gl.L(64.0f), true, null);
                this.a = oy8Var2;
                ry8Var.setAnimation(oy8Var2);
                frameLayout3.addView(ry8Var, nme.c(64.0f, 64));
                textView2.setText(M0 == null ? k96.M0(2131742564, null) : M0);
                linearLayout.addView(textView2, nme.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, nme.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i != 11) {
                    ne6 ne6Var2 = new ne6(this, context, b2);
                    this.f = ne6Var2;
                    addView(ne6Var2, nme.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i == 3) {
                    this.f.setVisibility(8);
                }
                qc6 qc6Var = new qc6(mf6Var, context);
                this.h = qc6Var;
                int i3 = bkb.H6;
                zkb.G(qc6Var, i3, null);
                zkb.X(qc6Var, i3, mf6Var.getResourceProvider());
                qc6Var.setTextSize(1, 14.0f);
                qc6Var.setLineSpacing(gl.L(2.0f), 1.0f);
                qc6Var.setPadding(gl.L(14.0f), gl.L(8.0f), gl.L(14.0f), gl.L(16.0f));
                final byte b3 = 0;
                qc6Var.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                    public final /* synthetic */ qe6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4;
                        byte b4 = b3;
                        qe6 qe6Var = this.b;
                        switch (b4) {
                            case 0:
                                qe6Var.d(true);
                                break;
                            case 1:
                                oe6 oe6Var = qe6Var.w;
                                if (qe6Var.b0 <= 0 || qe6Var.U == null) {
                                    qe6Var.l0 = true;
                                    oe6Var.invalidate();
                                    zkb.X(oe6Var, bkb.H6, null);
                                    int i5 = qe6Var.j0;
                                    byte b5 = 0;
                                    if (i5 != 4 && i5 != 2 && i5 != 17 && i5 != 16 && i5 != 11 && i5 != 15) {
                                        if (i5 == 3) {
                                            gl.y3(false);
                                            kk7.e().n(qe6Var, kk7.i4);
                                            qe6Var.f0 = false;
                                            qe6Var.s();
                                            qe6Var.l0 = false;
                                            qe6Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i5 == 4 || i5 == 11) {
                                            oe6Var.setText(k96.M0(2131752585, null));
                                        } else {
                                            oe6Var.setText(k96.M0(2131745385, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", qe6Var.b);
                                        bundle.putString("ephone", qe6Var.e);
                                        bundle.putString("phoneFormated", qe6Var.d);
                                        bundle.putInt("prevType", qe6Var.i0);
                                        qe6Var.q();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = qe6Var.d;
                                        tL_auth_resendCode.phone_code_hash = qe6Var.c;
                                        i4 = ((d) qe6Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new ie6(qe6Var, bundle, b5), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    qe6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(qe6Var.q0)));
                                    break;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                        }
                    }
                });
                addView(qc6Var, nme.t(-2, -2, 1, 0, 18, 0, 0));
                qc6Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.E = frameLayout4;
                oe6 oe6Var = new oe6(this, context, (byte) 0);
                this.w = oe6Var;
                zkb.G(oe6Var, i3, null);
                oe6Var.setLineSpacing(gl.L(2.0f), 1.0f);
                oe6Var.setPadding(gl.L(14.0f), gl.L(8.0f), gl.L(14.0f), gl.L(16.0f));
                oe6Var.setTextSize(1, 15.0f);
                oe6Var.setGravity(51);
                oe6Var.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                    public final /* synthetic */ qe6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4;
                        byte b4 = b2;
                        qe6 qe6Var = this.b;
                        switch (b4) {
                            case 0:
                                qe6Var.d(true);
                                break;
                            case 1:
                                oe6 oe6Var2 = qe6Var.w;
                                if (qe6Var.b0 <= 0 || qe6Var.U == null) {
                                    qe6Var.l0 = true;
                                    oe6Var2.invalidate();
                                    zkb.X(oe6Var2, bkb.H6, null);
                                    int i5 = qe6Var.j0;
                                    byte b5 = 0;
                                    if (i5 != 4 && i5 != 2 && i5 != 17 && i5 != 16 && i5 != 11 && i5 != 15) {
                                        if (i5 == 3) {
                                            gl.y3(false);
                                            kk7.e().n(qe6Var, kk7.i4);
                                            qe6Var.f0 = false;
                                            qe6Var.s();
                                            qe6Var.l0 = false;
                                            qe6Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i5 == 4 || i5 == 11) {
                                            oe6Var2.setText(k96.M0(2131752585, null));
                                        } else {
                                            oe6Var2.setText(k96.M0(2131745385, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", qe6Var.b);
                                        bundle.putString("ephone", qe6Var.e);
                                        bundle.putString("phoneFormated", qe6Var.d);
                                        bundle.putInt("prevType", qe6Var.i0);
                                        qe6Var.q();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = qe6Var.d;
                                        tL_auth_resendCode.phone_code_hash = qe6Var.c;
                                        i4 = ((d) qe6Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new ie6(qe6Var, bundle, b5), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    qe6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(qe6Var.q0)));
                                    break;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                        }
                    }
                });
                frameLayout4.addView(oe6Var, nme.e(-2, -2, 49));
                zc6 zc6Var = new zc6(context, b2);
                this.x = zc6Var;
                if (i == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = ls3.e;
                    loadAnimation.setInterpolator(interpolator);
                    zc6Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    zc6Var.setOutAnimation(loadAnimation2);
                    oe6 oe6Var2 = new oe6(this, context, (byte) 1);
                    this.y = oe6Var2;
                    oe6Var2.setLineSpacing(gl.L(2.0f), 1.0f);
                    oe6Var2.setTextSize(1, 15.0f);
                    oe6Var2.setGravity(49);
                    oe6Var2.setPadding(gl.L(14.0f), gl.L(8.0f), gl.L(14.0f), gl.L(16.0f));
                    frameLayout4.addView(oe6Var2, nme.e(-1, -2, 17));
                    zc6Var.addView(frameLayout4, nme.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = s33.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    zc6Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    zc6Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.G = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                    int L = gl.L(6.0f);
                    int i4 = bkb.Mi;
                    int w0 = bkb.w0(null, i4, false);
                    int i5 = bkb.P9;
                    int w02 = bkb.w0(null, i5, false);
                    ff0 i0 = bkb.i0(L, L, L, L, w0, w02, w02);
                    vkb M = zkb.M(i4);
                    vkb M2 = zkb.M(i5);
                    linearLayout2.setBackground(i0);
                    zkb.j(linearLayout2, i0, M, M2, null);
                    final byte b4 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: le6
                        public final /* synthetic */ qe6 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i42;
                            byte b42 = b4;
                            qe6 qe6Var = this.b;
                            switch (b42) {
                                case 0:
                                    qe6Var.d(true);
                                    break;
                                case 1:
                                    oe6 oe6Var22 = qe6Var.w;
                                    if (qe6Var.b0 <= 0 || qe6Var.U == null) {
                                        qe6Var.l0 = true;
                                        oe6Var22.invalidate();
                                        zkb.X(oe6Var22, bkb.H6, null);
                                        int i52 = qe6Var.j0;
                                        byte b5 = 0;
                                        if (i52 != 4 && i52 != 2 && i52 != 17 && i52 != 16 && i52 != 11 && i52 != 15) {
                                            if (i52 == 3) {
                                                gl.y3(false);
                                                kk7.e().n(qe6Var, kk7.i4);
                                                qe6Var.f0 = false;
                                                qe6Var.s();
                                                qe6Var.l0 = false;
                                                qe6Var.v();
                                                break;
                                            }
                                        } else {
                                            if (i52 == 4 || i52 == 11) {
                                                oe6Var22.setText(k96.M0(2131752585, null));
                                            } else {
                                                oe6Var22.setText(k96.M0(2131745385, null));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", qe6Var.b);
                                            bundle.putString("ephone", qe6Var.e);
                                            bundle.putString("phoneFormated", qe6Var.d);
                                            bundle.putInt("prevType", qe6Var.i0);
                                            qe6Var.q();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = qe6Var.d;
                                            tL_auth_resendCode.phone_code_hash = qe6Var.c;
                                            i42 = ((d) qe6Var.v0).currentAccount;
                                            ConnectionsManager.getInstance(i42).sendRequest(tL_auth_resendCode, new ie6(qe6Var, bundle, b5), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    try {
                                        qe6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(qe6Var.q0)));
                                        break;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                            }
                        }
                    });
                    zc6Var.addView(linearLayout2, nme.c(52.0f, -1));
                    ry8 ry8Var2 = new ry8(context);
                    this.H = ry8Var2;
                    ry8Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(ry8Var2, nme.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(k96.M0(2131747612, null));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(gl.o());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.F = textView7;
                textView7.setText(k96.M0(2131742598, null));
                textView7.setLineSpacing(gl.L(2.0f), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
                zc6Var.addView(textView7, nme.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(zc6Var, nme.d(i == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, nme.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(zc6Var, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                vk9.c(zc6Var);
                if (i == 15) {
                    this.y.setOnClickListener(new v16(this, context, (byte) 6));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, nme.t(-2, -2, 49, 0, 16, 0, 0));
            if (i == 1) {
                i2 = 128;
                float f = 128;
                oy8Var = new oy8(R.raw.code_laptop, gl.L(f), gl.L(f), true, null);
                this.a = oy8Var;
            } else {
                float f2 = 64;
                oy8 oy8Var3 = new oy8(R.raw.sms_incoming_info, gl.L(f2), gl.L(f2), true, null);
                this.a = oy8Var3;
                this.Q = new oy8(R.raw.phone_stars_to_dots, gl.L(f2), gl.L(f2), true, null);
                this.R = new oy8(R.raw.phone_dots, gl.L(f2), gl.L(f2), true, null);
                this.S = new oy8(R.raw.phone_dots_to_stars, gl.L(f2), gl.L(f2), true, null);
                oy8Var = oy8Var3;
            }
            ry8 ry8Var3 = new ry8(context);
            this.s = ry8Var3;
            ry8Var3.setAnimation(oy8Var);
            if (i == 1 && !gl.M1()) {
                ry8Var3.setTranslationY(-gl.L(24.0f));
            }
            frameLayout6.addView(ry8Var3, nme.d(i2, i2, 51, 0.0f, 0.0f, 0.0f, (i != 1 || gl.M1()) ? 0.0f : -gl.L(16.0f)));
            if (M0 == null) {
                M0 = k96.M0(i == 1 ? 2131745380 : 2131745374, null);
            }
            textView2.setText(M0);
            addView(textView2, nme.t(-2, -2, 49, 0, 18, 0, 0));
            int i6 = i == 15 ? 16 : 0;
            addView(textView, nme.t(-2, -2, 49, i6, 17, i6, 0));
        }
        viewGroup = null;
        if (i != 11) {
        }
        if (i == 3) {
        }
        qc6 qc6Var2 = new qc6(mf6Var, context);
        this.h = qc6Var2;
        int i32 = bkb.H6;
        zkb.G(qc6Var2, i32, null);
        zkb.X(qc6Var2, i32, mf6Var.getResourceProvider());
        qc6Var2.setTextSize(1, 14.0f);
        qc6Var2.setLineSpacing(gl.L(2.0f), 1.0f);
        qc6Var2.setPadding(gl.L(14.0f), gl.L(8.0f), gl.L(14.0f), gl.L(16.0f));
        final byte b32 = 0;
        qc6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: le6
            public final /* synthetic */ qe6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42;
                byte b42 = b32;
                qe6 qe6Var = this.b;
                switch (b42) {
                    case 0:
                        qe6Var.d(true);
                        break;
                    case 1:
                        oe6 oe6Var22 = qe6Var.w;
                        if (qe6Var.b0 <= 0 || qe6Var.U == null) {
                            qe6Var.l0 = true;
                            oe6Var22.invalidate();
                            zkb.X(oe6Var22, bkb.H6, null);
                            int i52 = qe6Var.j0;
                            byte b5 = 0;
                            if (i52 != 4 && i52 != 2 && i52 != 17 && i52 != 16 && i52 != 11 && i52 != 15) {
                                if (i52 == 3) {
                                    gl.y3(false);
                                    kk7.e().n(qe6Var, kk7.i4);
                                    qe6Var.f0 = false;
                                    qe6Var.s();
                                    qe6Var.l0 = false;
                                    qe6Var.v();
                                    break;
                                }
                            } else {
                                if (i52 == 4 || i52 == 11) {
                                    oe6Var22.setText(k96.M0(2131752585, null));
                                } else {
                                    oe6Var22.setText(k96.M0(2131745385, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", qe6Var.b);
                                bundle.putString("ephone", qe6Var.e);
                                bundle.putString("phoneFormated", qe6Var.d);
                                bundle.putInt("prevType", qe6Var.i0);
                                qe6Var.q();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = qe6Var.d;
                                tL_auth_resendCode.phone_code_hash = qe6Var.c;
                                i42 = ((d) qe6Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i42).sendRequest(tL_auth_resendCode, new ie6(qe6Var, bundle, b5), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            qe6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(qe6Var.q0)));
                            break;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                }
            }
        });
        addView(qc6Var2, nme.t(-2, -2, 1, 0, 18, 0, 0));
        qc6Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.E = frameLayout42;
        oe6 oe6Var3 = new oe6(this, context, (byte) 0);
        this.w = oe6Var3;
        zkb.G(oe6Var3, i32, null);
        oe6Var3.setLineSpacing(gl.L(2.0f), 1.0f);
        oe6Var3.setPadding(gl.L(14.0f), gl.L(8.0f), gl.L(14.0f), gl.L(16.0f));
        oe6Var3.setTextSize(1, 15.0f);
        oe6Var3.setGravity(51);
        oe6Var3.setOnClickListener(new View.OnClickListener(this) { // from class: le6
            public final /* synthetic */ qe6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42;
                byte b42 = b2;
                qe6 qe6Var = this.b;
                switch (b42) {
                    case 0:
                        qe6Var.d(true);
                        break;
                    case 1:
                        oe6 oe6Var22 = qe6Var.w;
                        if (qe6Var.b0 <= 0 || qe6Var.U == null) {
                            qe6Var.l0 = true;
                            oe6Var22.invalidate();
                            zkb.X(oe6Var22, bkb.H6, null);
                            int i52 = qe6Var.j0;
                            byte b5 = 0;
                            if (i52 != 4 && i52 != 2 && i52 != 17 && i52 != 16 && i52 != 11 && i52 != 15) {
                                if (i52 == 3) {
                                    gl.y3(false);
                                    kk7.e().n(qe6Var, kk7.i4);
                                    qe6Var.f0 = false;
                                    qe6Var.s();
                                    qe6Var.l0 = false;
                                    qe6Var.v();
                                    break;
                                }
                            } else {
                                if (i52 == 4 || i52 == 11) {
                                    oe6Var22.setText(k96.M0(2131752585, null));
                                } else {
                                    oe6Var22.setText(k96.M0(2131745385, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", qe6Var.b);
                                bundle.putString("ephone", qe6Var.e);
                                bundle.putString("phoneFormated", qe6Var.d);
                                bundle.putInt("prevType", qe6Var.i0);
                                qe6Var.q();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = qe6Var.d;
                                tL_auth_resendCode.phone_code_hash = qe6Var.c;
                                i42 = ((d) qe6Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i42).sendRequest(tL_auth_resendCode, new ie6(qe6Var, bundle, b5), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            qe6Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(qe6Var.q0)));
                            break;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                }
            }
        });
        frameLayout42.addView(oe6Var3, nme.e(-2, -2, 49));
        zc6 zc6Var2 = new zc6(context, b2);
        this.x = zc6Var2;
        if (i == 15) {
        }
        TextView textView72 = new TextView(context);
        this.F = textView72;
        textView72.setText(k96.M0(2131742598, null));
        textView72.setLineSpacing(gl.L(2.0f), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        zc6Var2.addView(textView72, nme.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        vk9.c(zc6Var2);
        if (i == 15) {
        }
    }

    public static void p(oy8 oy8Var) {
        if (oy8Var != null) {
            oy8Var.L(bkb.w0(null, bkb.O9, false), "Bubble");
            int i = bkb.F6;
            oy8Var.L(bkb.w0(null, i, false), "Phone");
            oy8Var.L(bkb.w0(null, i, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z) {
        oe6 oe6Var = this.y;
        if (oe6Var != null) {
            float f = z ? 1.0f : 0.0f;
            if (oe6Var.getAlpha() != f) {
                oe6Var.animate().cancel();
                oe6Var.animate().alpha(f).setDuration(150L).start();
            }
        }
    }

    @Override // jja
    public final boolean a() {
        return this.i0 != 3;
    }

    @Override // jja
    public final boolean b() {
        return true;
    }

    @Override // jja
    public final boolean d(boolean z) {
        int i;
        mf6 mf6Var = this.v0;
        byte b = 0;
        if (mf6Var.G != 0) {
            mf6Var.finishFragment();
            return false;
        }
        int i2 = this.k0;
        if (i2 != 0) {
            mf6Var.I1(i2, true, null, true);
            return false;
        }
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
            String M0 = k96.M0(2131751251, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = gl.S2(k96.a0("EditNumberInfo", null, 2131751250, this.b));
            alertDialog$Builder.j(k96.M0(2131752029, null), null);
            alertDialog$Builder.g(k96.M0(2131751323, null), new ge6(this, b));
            mf6Var.showDialog(hdVar);
            return false;
        }
        this.g0 = false;
        y(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i = ((d) mf6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_cancelCode, new ce2(b), 10);
        t();
        s();
        this.I = null;
        int i3 = kk7.i4;
        byte b2 = this.i0;
        if (b2 == 15) {
            kk7.e().n(this, i3);
        } else if (b2 == 2) {
            gl.y3(false);
            kk7.e().n(this, i3);
        } else if (b2 == 3) {
            gl.x3(false);
            kk7.e().n(this, kk7.j4);
        }
        this.f0 = false;
        return true;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.f0) {
            fj2 fj2Var = this.f;
            if (fj2Var.f != null) {
                if (i == kk7.i4) {
                    fj2Var.setText(String.valueOf(objArr[0]));
                    h(null);
                    return;
                }
                if (i == kk7.j4) {
                    String valueOf = String.valueOf(objArr[0]);
                    if (gl.x(this.m0, valueOf)) {
                        if (!this.m0.equals("*")) {
                            this.o0 = valueOf;
                            gl.T();
                        }
                        h(valueOf);
                        int i3 = CallReceiver.a;
                        gba.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override // jja
    public final void e() {
        this.g0 = false;
    }

    @Override // jja
    public final void f() {
        int i = kk7.i4;
        byte b = this.i0;
        if (b == 15) {
            kk7.e().n(this, i);
        } else if (b == 2) {
            gl.y3(false);
            kk7.e().n(this, i);
        } else if (b == 3) {
            gl.x3(false);
            kk7.e().n(this, kk7.j4);
        }
        this.f0 = false;
        t();
        s();
    }

    @Override // jja
    public final void g() {
        Bundle bundle;
        this.l0 = false;
        this.g0 = false;
        if (this.k0 == 0 || (bundle = this.I) == null) {
            return;
        }
        bundle.putInt("timeout", this.b0);
    }

    @Override // jja
    public String getHeaderName() {
        byte b = this.i0;
        return (b == 3 || b == 11) ? this.b : k96.M0(2131742564, "YourCode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jja
    public final void h(String str) {
        int i;
        int i2;
        int i3;
        mf6 mf6Var = this.v0;
        int i4 = mf6Var.a;
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
        fj2 fj2Var = this.f;
        if (str == null) {
            str = fj2Var.getCode();
        }
        byte b = 0;
        if (TextUtils.isEmpty(str)) {
            mf6.D1(fj2Var, false);
            return;
        }
        int i5 = mf6Var.a;
        if (i5 < 1 || i5 > 4 || !fj2Var.e) {
            this.g0 = true;
            int i6 = kk7.i4;
            byte b2 = this.i0;
            if (b2 == 15) {
                kk7.e().n(this, i6);
            } else if (b2 == 2) {
                gl.y3(false);
                kk7.e().n(this, i6);
            } else if (b2 == 3) {
                kk7.e().n(this, kk7.j4);
            }
            this.f0 = false;
            byte b3 = mf6Var.G;
            if (b3 == 1) {
                this.d = mf6Var.H;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                t();
                fj2Var.e = true;
                sj2[] sj2VarArr = fj2Var.f;
                int length = sj2VarArr.length;
                while (b < length) {
                    sj2VarArr[b].B(0.0f);
                    b++;
                }
                i = ((d) mf6Var).currentAccount;
                z(ConnectionsManager.getInstance(i).sendRequest(confirmphone, new rv3(this, confirmphone, (byte) 21), 2));
                return;
            }
            if (b3 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                t();
                fj2Var.e = true;
                for (sj2 sj2Var : fj2Var.f) {
                    sj2Var.B(0.0f);
                }
                i2 = ((d) mf6Var).currentAccount;
                z(ConnectionsManager.getInstance(i2).sendRequest(changephone, new n35(this, (byte) 7), 2));
                mf6Var.J1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            t();
            fj2Var.e = true;
            for (sj2 sj2Var2 : fj2Var.f) {
                sj2Var2.B(0.0f);
            }
            i3 = ((d) mf6Var).currentAccount;
            z(ConnectionsManager.getInstance(i3).sendRequest(tL_auth_signIn, new fe6(this, tL_auth_signIn, b), 10));
            mf6Var.J1(true, true);
        }
    }

    @Override // jja
    public final void j() {
        byte b = 0;
        oy8 oy8Var = this.a;
        if (oy8Var != null) {
            oy8Var.H(0);
        }
        gl.d3(new ee6(this, b), mf6.A0);
    }

    @Override // jja
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
            fj2 fj2Var = this.f;
            if (fj2Var.f != null) {
                fj2Var.setText(string2);
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

    @Override // jja
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
            bundle.putBundle(de9.k(b, "smsview_params_"), this.I);
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

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0516, code lost:
    
        if (r7 == 16) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0329  */
    @Override // jja
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
        int i2 = kk7.i4;
        byte b4 = 0;
        if (bundle == null) {
            if (this.r0 == null || this.s0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            oe6 oe6Var = this.y;
            if (oe6Var != null) {
                oe6Var.setVisibility(0);
                zkb.X(this.y, bkb.H6, null);
                int i3 = this.j0;
                this.y.setText(gl.E2(k96.M0(i3 == 17 ? 2131745857 : i3 == 16 ? 2131745855 : 2131745856, null), true, gl.L(1.0f), gl.L(1.0f)));
                return;
            }
            return;
        }
        this.f0 = true;
        byte b5 = this.i0;
        if (b5 == 15) {
            kk7.e().a(this, i2);
        } else if (b5 == 2) {
            gl.y3(true);
            kk7.e().a(this, i2);
        } else if (b5 == 3) {
            gl.x3(true);
            kk7.e().a(this, kk7.j4);
            if (z) {
                gl.c3(new ql3((byte) 28));
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
        for (sj2 sj2Var : this.f.f) {
            sj2Var.setShowSoftInputOnFocusCompat(!a() || gl.A1());
            sj2Var.addTextChangedListener(new b7(this, (byte) 29));
            sj2Var.setOnFocusChangeListener(new ls0(this, (byte) 12));
        }
        int i4 = this.k0;
        qc6 qc6Var = this.h;
        if (i4 == 17) {
            qc6Var.setVisibility(0);
            this.h.setText(gl.E2(k96.M0(2131753751, null), true, gl.L(-1.0f), gl.L(1.0f)));
        } else if (i4 == 16) {
            qc6Var.setVisibility(0);
            this.h.setText(gl.E2(k96.M0(2131753750, null), true, gl.L(-1.0f), gl.L(1.0f)));
        } else {
            qc6Var.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String e = p38.f().e(this.b);
        if (this.v0.G == 1) {
            S22 = new SpannableStringBuilder(gl.S2(k96.a0("CancelAccountResetInfo2", null, 2131752575, p38.f().e("+" + e))));
            int indexOf = TextUtils.indexOf((CharSequence) S22, '*');
            int lastIndexOf = TextUtils.lastIndexOf(S22, '*');
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new cl(b4));
                S22.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                S22.replace(indexOf, indexOf + 1, (CharSequence) "");
                S22.setSpan(new g4c("tg://settings/change_number", (vib) null), indexOf, lastIndexOf - 1, 33);
            }
        } else {
            byte b6 = this.i0;
            if (b6 != 1) {
                S2 = b6 == 2 ? gl.S2(k96.a0("SentSmsCode", null, 2131745375, k96.a(e))) : b6 == 3 ? gl.S2(k96.a0("SentCallCode", null, 2131745378, k96.a(e))) : b6 == 4 ? gl.S2(k96.a0("SentCallOnly", null, 2131745377, k96.a(e))) : b6 == 15 ? gl.S2(k96.a0("SentFragmentCode", null, 2131745376, k96.a(e))) : "";
                this.n.setText(S2);
                b = this.i0;
                if (b != 15) {
                    if (b == 1) {
                        int i5 = this.j0;
                        if (i5 == 3 || i5 == 4 || i5 == 11) {
                            this.y.setText(k96.M0(2131751432, null));
                        } else {
                            oe6 oe6Var2 = this.y;
                            if (i5 == 15) {
                                oe6Var2.setText(k96.M0(2131751435, null));
                            } else if (i5 == 0) {
                                oe6Var2.setText(k96.M0(2131751437, null));
                            } else {
                                oe6Var2.setText(k96.M0(2131751431, null));
                            }
                        }
                    } else {
                        this.y.setText(k96.M0(2131751437, null));
                    }
                }
                if (this.i0 == 3) {
                    this.v0.L1(this.f.f[0]);
                    this.f.f[0].requestFocus();
                } else {
                    gl.t1(this.f.f[0]);
                }
                t();
                s();
                this.d0 = System.currentTimeMillis();
                b2 = this.i0;
                if (b2 != 1) {
                    setProblemTextVisible(true);
                    this.w.setVisibility(8);
                    oe6 oe6Var3 = this.y;
                    if (oe6Var3 != null) {
                        oe6Var3.setVisibility(0);
                    }
                } else if (b2 == 3) {
                    int i6 = this.j0;
                    if (i6 == 4 || i6 == 2) {
                        i = 2131745105;
                    } else {
                        i = 2131745105;
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
                                            if (w01.a) {
                                                fa4.d("number = " + string2);
                                            }
                                            if (Math.abs(System.currentTimeMillis() - j) < 3600000 && gl.x(str3, string2)) {
                                                query.close();
                                                str2 = string2;
                                                break;
                                            }
                                        } finally {
                                        }
                                    }
                                    query.close();
                                } catch (Exception e2) {
                                    fa4.g(e2, true);
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
                        this.w.setText(k96.a0("CallAvailableIn", null, 2131752618, 1, 0));
                    } else if (i8 == 2 || i8 == 17 || i8 == 16) {
                        this.w.setText(k96.a0("SmsAvailableIn", null, i, 1, 0));
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
                                this.w.setText(k96.a0("SmsAvailableIn", null, 2131745105, 1, 0));
                            } else {
                                this.w.setText(k96.a0("CallAvailableIn", null, 2131752618, 2, 0));
                            }
                            setProblemTextVisible(this.b0 < 1000);
                            this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                            oe6 oe6Var4 = this.y;
                            if (oe6Var4 != null) {
                                oe6Var4.setVisibility(this.b0 < 1000 ? 0 : 8);
                            }
                            SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
                            String string3 = sharedPreferences.getString("sms_hash", null);
                            if (!TextUtils.isEmpty(string3) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                                if (string.contains(string3 + "|") && !this.v0.y) {
                                    str = string.substring(string.indexOf(kk7.H1) + 1);
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
                            this.w.setText(k96.a0("SmsAvailableIn", null, 2131745105, 1, 0));
                        } else {
                            this.w.setText(k96.a0("CallAvailableIn", null, 2131752618, 2, 0));
                        }
                        setProblemTextVisible(this.b0 < 1000);
                        this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                        oe6 oe6Var5 = this.y;
                        if (oe6Var5 != null) {
                            oe6Var5.setVisibility(this.b0 < 1000 ? 0 : 8);
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
                                this.w.setText(k96.a0("CallAvailableIn", null, 2131752618, 1, 0));
                            } else if (i13 == 2 || i13 == 17 || i13 == 16) {
                                this.w.setText(k96.a0("SmsAvailableIn", null, 2131745105, 1, 0));
                            }
                            r();
                        }
                    } else {
                        this.w.setVisibility(8);
                        oe6 oe6Var6 = this.y;
                        if (oe6Var6 != null) {
                            oe6Var6.setVisibility(0);
                        }
                        setProblemTextVisible(false);
                        q();
                    }
                }
                if (this.i0 != 11) {
                    String str5 = this.n0;
                    for (int i14 = 0; i14 < this.p0; i14++) {
                        str5 = tb4.o(str5, "0");
                    }
                    String e3 = p38.f().e("+" + str5);
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
            S22 = gl.S2(k96.a0("SentAppCodeWithPhone", null, 2131745379, k96.a(e)));
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
            fj2 fj2Var = this.f;
            if (i >= fj2Var.f.length) {
                fj2Var.postDelayed(new kz5(this, runnable, (byte) 24), (r2.length * 75) + 400);
                return;
            } else {
                fj2Var.postDelayed(new je6(this, i, (byte) 2), i * 75);
                i++;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        sj2[] sj2VarArr;
        super.onConfigurationChanged(configuration);
        fj2 fj2Var = this.f;
        if (fj2Var == null || (sj2VarArr = fj2Var.f) == null) {
            return;
        }
        for (sj2 sj2Var : sj2VarArr) {
            sj2Var.setShowSoftInputOnFocusCompat(!a() || gl.A1());
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
        this.V.schedule(new pe6(this, (byte) 0), 0L, 1000L);
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        int i = bkb.C6;
        oe6 oe6Var = this.w;
        zkb.X(oe6Var, i, null);
        oe6Var.setTag(R.id.color_key_tag, Integer.valueOf(i));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new pe6(this, (byte) 1), 0L, 1000L);
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
            fa4.g(e, true);
        }
    }

    public final void t() {
        oe6 oe6Var = this.w;
        int i = bkb.C6;
        zkb.X(oe6Var, i, null);
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
            fa4.g(e, true);
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
                fa4.g(e, true);
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
                    fa4.g(e2, true);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            Typeface typeface = gl.a;
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
                    sb2.append((int) w01.d);
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
            sb2.append((int) w01.d);
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
            this.v0.y1(k96.M0(R.string.AppName, null), k96.M0(2131748007, "NoMailInstalled"));
        }
    }

    @Override // jja
    public final void updateColors() {
        int w0 = bkb.w0(null, this.v0.G == 1 ? bkb.F6 : bkb.C6, false);
        TextView textView = this.n;
        textView.setTextColor(w0);
        textView.setLinkTextColor(bkb.w0(null, bkb.O9, false));
        int i = bkb.F6;
        this.r.setTextColor(bkb.w0(null, i, false));
        byte b = this.i0;
        if (b == 11) {
            int i2 = bkb.x6;
            this.K.setTextColor(bkb.w0(null, i2, false));
            this.L.setTextColor(bkb.w0(null, i2, false));
            int w02 = bkb.w0(null, bkb.k6, false);
            int i3 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mf6.l1(this.M, w02, i3, mode);
            this.O = w02;
            int w03 = bkb.w0(null, i, false);
            mf6.l1(this.N, w03, this.P, mode);
            this.P = w03;
            this.J.setTextColor(bkb.w0(null, i, false));
        }
        p(this.a);
        p(this.Q);
        p(this.R);
        p(this.S);
        fj2 fj2Var = this.f;
        if (fj2Var != null) {
            fj2Var.invalidate();
        }
        oe6 oe6Var = this.w;
        Integer num = (Integer) oe6Var.getTag();
        if (num == null) {
            num = Integer.valueOf(bkb.C6);
        }
        oe6Var.setTextColor(bkb.w0(null, num.intValue(), false));
        if (b != 15) {
            this.y.setTextColor(bkb.w0(null, bkb.p6, false));
        }
        this.F.setTextColor(bkb.w0(null, bkb.p7, false));
    }

    public final void v() {
        int i;
        if (this.g0 || this.l0) {
            return;
        }
        mf6 mf6Var = this.v0;
        if (mf6Var.r0) {
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
        i = ((d) mf6Var).currentAccount;
        z(ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new ie6(this, bundle, (byte) 1), 10));
    }

    public final void w() {
        fj2 fj2Var = this.f;
        try {
            fj2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i = 0;
        while (true) {
            sj2[] sj2VarArr = fj2Var.f;
            if (i >= sj2VarArr.length) {
                break;
            }
            sj2VarArr[i].setText("");
            fj2Var.f[i].A(1.0f);
            i++;
        }
        zc6 zc6Var = this.x;
        if (zc6Var.getCurrentView() != this.F) {
            zc6Var.showNext();
        }
        fj2Var.f[0].requestFocus();
        gl.A3(this.i0 == 11 ? 3.5f : 10.0f, fj2Var, new ee6(this, (byte) 7));
        ee6 ee6Var = this.u0;
        removeCallbacks(ee6Var);
        postDelayed(ee6Var, 5000L);
        this.t0 = true;
    }

    public final void y(boolean z) {
        byte b = 1;
        if (this.Q == null) {
            this.v0.x1(z, true);
            return;
        }
        if (this.T) {
            this.T = false;
            this.s.setAutoRepeat(false);
            oy8 oy8Var = this.R;
            oy8Var.F(0);
            oy8Var.N(oy8Var.e[0] - 1, new ee6(this, b));
        }
    }

    public final void z(int i) {
        oy8 oy8Var = this.Q;
        if (oy8Var == null) {
            this.v0.A1(i, true);
            return;
        }
        if (this.T) {
            return;
        }
        this.T = true;
        oy8 oy8Var2 = this.a;
        byte b = 0;
        if (oy8Var2.b0 != oy8Var2.e[0] - 1) {
            oy8Var2.u0 = new je6(this, i, b);
            return;
        }
        oy8Var.u0 = new ee6(this, (byte) 3);
        ry8 ry8Var = this.s;
        ry8Var.setAutoRepeat(false);
        oy8Var.I(0, false, false);
        ry8Var.setAnimation(oy8Var);
        ry8Var.d();
    }
}
