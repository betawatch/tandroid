// default package

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class y28 extends cja implements gk7 {
    public static final /* synthetic */ int U3 = 0;
    public final i28 A0;
    public boolean A1;
    public int A2;
    public long A3;
    public final l18 B0;
    public int B1;
    public boolean B2;
    public long B3;
    public final View C0;
    public int C1;
    public final c30 C2;
    public boolean C3;
    public final ImageView D0;
    public int D1;
    public final on D2;
    public TLRPC.TL_channels_sendAsPeers D3;
    public final LinearLayout E0;
    public final x28 E1;
    public final lm E2;
    public final e18 E3;
    public final y18 F0;
    public final ep F1;
    public final lm F2;
    public int F3;
    public gn G0;
    public t28 G1;
    public float G2;
    public final e18 G3;
    public gn H0;
    public boolean H1;
    public long H2;
    public final ArrayList H3;
    public lm I0;
    public g2b I1;
    public boolean I2;
    public final ArrayList I3;
    public lm J0;
    public boolean J1;
    public boolean J2;
    public boolean J3;
    public boolean K0;
    public boolean K1;
    public boolean K2;
    public boolean K3;
    public boolean L0;
    public boolean L1;
    public boolean L2;
    public final bg7 L3;
    public long M0;
    public y18 M1;
    public ke5 M2;
    public final lm M3;
    public long N0;
    public jm2 N1;
    public final ma8 N2;
    public final lm N3;
    public boolean O0;
    public vr7 O1;
    public boolean O2;
    public final lm O3;
    public boolean P0;
    public wr7 P1;
    public w18 P2;
    public float P3;
    public boolean Q0;
    public kh7 Q1;
    public FrameLayout Q2;
    public final Path Q3;
    public boolean R0;
    public q18 R1;
    public wb R2;
    public boolean R3;
    public final d28 S0;
    public dz1 S1;
    public boolean S2;
    public ValueAnimator S3;
    public final FrameLayout T0;
    public je5 T1;
    public s18 T2;
    public float T3;
    public final ml U0;
    public ValueAnimator U1;
    public float U2;
    public final ImageReceiver V0;
    public t09 V1;
    public boolean V2;
    public final ImageReceiver W0;
    public LinearLayout W1;
    public boolean W2;
    public final ArrayList X0;
    public TextView X1;
    public boolean X2;
    public Runnable Y0;
    public TextView Y1;
    public boolean Y2;
    public final b28 Z0;
    public g4b Z1;
    public boolean Z2;
    public final zu3 a1;
    public ViewPropertyAnimator a2;
    public boolean a3;
    public mz9 b1;
    public final il0 b2;
    public final ImageReceiver b3;
    public float c1;
    public final il0 c2;
    public xl c3;
    public final pb0 d1;
    public final Paint d2;
    public final ImageReceiver d3;
    public final v28 e1;
    public int e2;
    public vl e3;
    public final h4b f1;
    public ValueAnimator f2;
    public boolean f3;
    public igf g1;
    public float g2;
    public boolean g3;
    public int h1;
    public float h2;
    public t09 h3;
    public a8 i1;
    public float i2;
    public boolean i3;
    public s28 j1;
    public int j2;
    public float j3;
    public TL_stories.PeerStories k1;
    public boolean k2;
    public boolean k3;
    public final ArrayList l1;
    public boolean l2;
    public float l3;
    public final ImageView m0;
    public final ArrayList m1;
    public boolean m2;
    public int m3;
    public final ImageView n0;
    public final w28 n1;
    public boolean n2;
    public int n3;
    public final a6 o0;
    public final nj9 o1;
    public int o2;
    public int o3;
    public final ry8 p0;
    public ArrayList p1;
    public final int p2;
    public e18 p3;
    public final ImageView q0;
    public int q1;
    public TextView q2;
    public float q3;
    public final f53 r0;
    public long r1;
    public uy1 r2;
    public boolean r3;
    public final z5b s0;
    public boolean s1;
    public int s2;
    public mv6 s3;
    public final y18 t0;
    public boolean t1;
    public int t2;
    public a8 t3;
    public l2b u0;
    public boolean u1;
    public boolean u2;
    public a8 u3;
    public je5 v0;
    public boolean v1;
    public s71 v2;
    public final kl0 v3;
    public je5 w0;
    public boolean w1;
    public boolean w2;
    public final lx4 w3;
    public je5 x0;
    public long x1;
    public float x2;
    public final bl0 x3;
    public int y0;
    public final float y1;
    public x31 y2;
    public TL_stories.TL_premium_boostsStatus y3;
    public final m8b z0;
    public int z1;
    public q z2;
    public ng1 z3;

    /* JADX WARN: Multi-variable type inference failed */
    public y28(Context context, final m8b m8bVar, w28 w28Var, f53 f53Var) {
        super(context, null);
        this.R0 = true;
        this.X0 = new ArrayList();
        this.h1 = -5;
        this.y1 = 1.0f;
        x28 x28Var = new x28(this);
        this.E1 = x28Var;
        this.g2 = -1.0f;
        this.h2 = -1.0f;
        this.i2 = -1.0f;
        this.p2 = ConnectionsManager.generateClassGuid();
        this.E2 = new lm(this);
        this.F2 = new lm(this);
        ma8 ma8Var = new ma8();
        this.N2 = ma8Var;
        this.U2 = 1.0f;
        this.E3 = new e18(this, (byte) 4);
        this.G3 = new e18(this, (byte) 11);
        this.H3 = new ArrayList();
        this.I3 = new ArrayList();
        this.L3 = new bg7(this, (byte) 6);
        this.M3 = new lm(this);
        this.N3 = new lm(this);
        this.O3 = new lm(this);
        this.Q3 = new Path();
        ma8Var.E = new s34((Object) this, (byte) 21);
        c30 c30Var = new c30();
        c30Var.g = new ArrayList();
        this.C2 = c30Var;
        this.D2 = new on(null);
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        ml mlVar = new ml(this, (byte) 5);
        this.U0 = mlVar;
        final byte b = 0;
        mlVar.B0 = false;
        mlVar.A1 = true;
        mlVar.y = true;
        mlVar.T(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b3 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
        imageReceiver.T(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d3 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.y = true;
        imageReceiver2.T(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.V0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.y = true;
        imageReceiver3.T(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.W0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.y = true;
        imageReceiver4.T(0);
        mlVar.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.d1 = new pb0((wjb) null);
        this.z0 = m8bVar;
        this.n1 = w28Var;
        this.F1 = w28Var.g;
        this.I1 = na7.q1(y6c.t0).M1();
        w28Var.l.setColor(-16777216);
        this.d2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.r0 = f53Var;
        setClipChildren(false);
        b28 b28Var = new b28(this, context, this.S0, f53Var, m8bVar);
        this.Z0 = b28Var;
        bl0 bl0Var = new bl0(f53Var, bkb.Ie, 0.8f);
        this.x3 = bl0Var;
        ix4 ix4Var = new ix4();
        ix4Var.a(bm2.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !gba.e()) {
            this.w3 = null;
        } else {
            lx4 lx4Var = new lx4(ix4Var);
            this.w3 = lx4Var;
            lx4Var.l(gl.L(8.0f));
            ix4Var = lx4Var;
        }
        zec zecVar = new zec(this);
        kl0 kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
        kl0Var.h = zecVar;
        kl0Var.i = this;
        this.v3 = kl0Var;
        this.b2 = kl0Var.c(this, bl0Var, false);
        il0 c = kl0Var.c(this, bl0Var, false);
        this.c2 = c;
        c.u(gl.L(32.0f));
        d28 d28Var = new d28(this, context, w28Var, m8bVar);
        this.S0 = d28Var;
        d28Var.setClipChildren(false);
        this.a1 = new zu3(this.s2, d28Var);
        d28Var.addView(b28Var, nme.c(-1.0f, -1));
        i28 i28Var = new i28(this, getContext(), m8bVar.E, m8bVar, f53Var);
        this.A0 = i28Var;
        i28Var.b0.setOnClickListener(new g18(this, (byte) 10));
        ImageView imageView = new ImageView(context);
        this.D0 = imageView;
        imageView.setImageDrawable(w28Var.m);
        int L = gl.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new g18(this, (byte) 11));
        imageView.setContentDescription(k96.M0(2131745267, null));
        ote.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(w28Var.n);
        imageView2.setPadding(L, L, L, L);
        y18 y18Var = new y18(this, getContext(), (byte) 1);
        this.F0 = y18Var;
        gn gnVar = this.H0;
        if (gnVar != null) {
            gnVar.setCallback(y18Var);
        }
        y18Var.setWillNotDraw(false);
        y18Var.setOnClickListener(new g18(this, (byte) 12));
        y18 y18Var2 = new y18(this, getContext(), (byte) 2);
        this.t0 = y18Var2;
        gn gnVar2 = this.G0;
        if (gnVar2 != null) {
            gnVar2.setCallback(y18Var2);
        }
        y18Var2.setWillNotDraw(false);
        y18Var2.setOnClickListener(new g18(this, (byte) 13));
        y18Var2.setOnLongClickListener(new u0(this, m8bVar, (byte) 3));
        l2b l2bVar = new l2b(context, w28Var);
        this.u0 = l2bVar;
        l2bVar.setPadding(L, L, L, L);
        y18Var2.addView(this.u0, nme.e(40, 40, 3));
        y18Var.addView(imageView2, nme.e(40, 40, 3));
        ote.b(y18Var2, 0.3f, 5.0f);
        ote.b(y18Var, 0.3f, 5.0f);
        mlVar.A1 = true;
        mlVar.p0(d28Var);
        nj9 nj9Var = new nj9(10);
        this.o1 = nj9Var;
        d28Var.setOutlineProvider(nj9Var);
        d28Var.setClipToOutline(true);
        addView(d28Var);
        v28 v28Var = new v28(context, x28Var);
        this.e1 = v28Var;
        v28Var.setOnClickListener(new View.OnClickListener(this) { // from class: c18
            public final /* synthetic */ y28 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                m8b m8bVar2 = m8bVar;
                y28 y28Var = this.b;
                switch (b2) {
                    case 0:
                        long j = y6c.h(y28Var.s2).n;
                        long j2 = y28Var.r1;
                        if (j != j2) {
                            if (j2 <= 0) {
                                m8bVar2.L(mu1.U9(j2));
                                break;
                            } else {
                                m8bVar2.L(ProfileActivity.P2(j2));
                                break;
                            }
                        } else {
                            Bundle j3 = ls6.j(1, TeXSymbolParser.TYPE_ATTR);
                            j3.putLong("dialog_id", y28Var.r1);
                            m8bVar2.L(new zj6(j3, null));
                            break;
                        }
                    default:
                        if (!y28Var.E1.h()) {
                            y28Var.X0(true);
                            break;
                        } else {
                            m8bVar2.T();
                            if (!m8b.D1) {
                                na7.c1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            y28Var.o0.setContentDescription(k96.M0(!m8b.D1 ? 2131748122 : 2131743610, null));
                            break;
                        }
                }
            }
        });
        d28Var.addView(v28Var, nme.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, nme.r(40, 40, 5));
        linearLayout.addView(y18Var, nme.r(40, 40, 5));
        linearLayout.addView(y18Var2, nme.r(40, 40, 5));
        addView(linearLayout, nme.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.m0 = imageView3;
        imageView3.setImageDrawable(w28Var.q);
        imageView3.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        imageView3.setBackground(bkb.f0(-1, 1, -1));
        imageView3.setContentDescription(k96.M0(2131754838, null));
        d28Var.addView(imageView3, nme.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.n0 = imageView4;
        imageView4.setImageDrawable(w28Var.r);
        imageView4.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        imageView4.setBackground(bkb.f0(-1, 1, -1));
        imageView4.setContentDescription(k96.M0(2131754807, null));
        d28Var.addView(imageView4, nme.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new fr7(m8bVar, (byte) 7));
        imageView3.setOnClickListener(new ng(this, f53Var, m8bVar, context, w28Var, (byte) 11));
        a6 a6Var = new a6(context, (byte) 22);
        this.o0 = a6Var;
        d28Var.addView(a6Var, nme.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ry8 ry8Var = new ry8(context);
        this.p0 = ry8Var;
        ry8Var.setPadding(gl.L(6.0f), gl.L(6.0f), gl.L(6.0f), gl.L(6.0f));
        a6Var.addView(ry8Var);
        ImageView imageView5 = new ImageView(context);
        this.q0 = imageView5;
        imageView5.setPadding(gl.L(6.0f), gl.L(6.0f), gl.L(6.0f), gl.L(6.0f));
        imageView5.setImageDrawable(w28Var.t);
        a6Var.addView(imageView5);
        imageView5.setVisibility(8);
        z5b z5bVar = new z5b(context);
        this.s0 = z5bVar;
        z5bVar.setOnClickListener(new g18(this, (byte) 2));
        d28Var.addView(z5bVar, nme.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final byte b2 = 1;
        a6Var.setOnClickListener(new View.OnClickListener(this) { // from class: c18
            public final /* synthetic */ y28 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                m8b m8bVar2 = m8bVar;
                y28 y28Var = this.b;
                switch (b22) {
                    case 0:
                        long j = y6c.h(y28Var.s2).n;
                        long j2 = y28Var.r1;
                        if (j != j2) {
                            if (j2 <= 0) {
                                m8bVar2.L(mu1.U9(j2));
                                break;
                            } else {
                                m8bVar2.L(ProfileActivity.P2(j2));
                                break;
                            }
                        } else {
                            Bundle j3 = ls6.j(1, TeXSymbolParser.TYPE_ATTR);
                            j3.putLong("dialog_id", y28Var.r1);
                            m8bVar2.L(new zj6(j3, null));
                            break;
                        }
                    default:
                        if (!y28Var.E1.h()) {
                            y28Var.X0(true);
                            break;
                        } else {
                            m8bVar2.T();
                            if (!m8b.D1) {
                                na7.c1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            y28Var.o0.setContentDescription(k96.M0(!m8b.D1 ? 2131748122 : 2131743610, null));
                            break;
                        }
                }
            }
        });
        this.f1 = new h4b(this, w28Var);
        d28Var.addView(i28Var, nme.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.C0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        l18 l18Var = new l18(this, context, m8bVar, m8bVar.w, view, frameLayout, m8bVar);
        this.B0 = l18Var;
        d28Var.addView(view, nme.e(-1, kk7.d3, 87));
        d28Var.addView(l18Var, nme.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        d28Var.addView(frameLayout, nme.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = gl.L(20.0f);
        int o = bm2.o(-1, 100);
        a6Var.setBackground(bkb.i0(L2, L2, L2, L2, 0, o, o));
        int L3 = gl.L(20.0f);
        int o2 = bm2.o(-1, 100);
        imageView3.setBackground(bkb.i0(L3, L3, L3, L3, 0, o2, o2));
        int L4 = gl.L(20.0f);
        int o3 = bm2.o(-1, 100);
        imageView4.setBackground(bkb.i0(L4, L4, L4, L4, 0, o3, o3));
        int L5 = gl.L(20.0f);
        int o4 = bm2.o(-1, 100);
        imageView.setBackground(bkb.i0(L5, L5, L5, L5, 0, o4, o4));
        int L6 = gl.L(20.0f);
        int o5 = bm2.o(-1, 100);
        y18Var2.setBackground(bkb.i0(L6, L6, L6, L6, 0, o5, o5));
        int L7 = gl.L(20.0f);
        int o6 = bm2.o(-1, 100);
        y18Var.setBackground(bkb.i0(L7, L7, L7, L7, 0, o6, o6));
        oib oibVar = i28Var.W;
        View m = oibVar.m(context);
        gl.B2(m);
        addView(m);
        oibVar.D = new hr1(this, (byte) 2);
        oibVar.Q(this);
    }

    public static void Q0(f2b f2bVar, ImageReceiver imageReceiver, String str) {
        if (f2bVar.s) {
            imageReceiver.Y(null, null, gl5.g(f2bVar.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.Z(gl5.g(f2bVar.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j5 getAccountInstance() {
        return j5.a(this.s2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f = 1.0f - this.E2.c;
        n0a n0aVar = this.z0.x;
        return (1.0f - (n0aVar == null ? 0.0f : n0aVar.f)) * f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        m8b m8bVar;
        if (!this.E1.f || (m8bVar = this.z0) == null || m8bVar.B0 == null || v0(true)) {
            return 0L;
        }
        return m8bVar.B0.m();
    }

    public final boolean A0() {
        y1b y1bVar;
        m8b m8bVar = this.z0;
        return (m8bVar == null || (y1bVar = m8bVar.O0) == null || y1bVar.e != 4) ? false : true;
    }

    public final boolean B0() {
        TLRPC.User V1;
        return A0() && (V1 = na7.q1(this.s2).V1(Long.valueOf(this.z0.O0.d))) != null && V1.bot && V1.bot_can_edit;
    }

    public abstract boolean C0();

    public final void D0(ValueAnimator valueAnimator) {
        this.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = (-gl.L(8.0f)) * this.T3;
        v28 v28Var = this.e1;
        v28Var.setTranslationY(f);
        v28Var.setAlpha(1.0f - this.T3);
        float f2 = (-gl.L(8.0f)) * this.T3;
        ImageView imageView = this.m0;
        imageView.setTranslationY(f2);
        imageView.setAlpha(1.0f - this.T3);
        float f3 = (-gl.L(8.0f)) * this.T3;
        ImageView imageView2 = this.n0;
        imageView2.setTranslationY(f3);
        imageView2.setAlpha(1.0f - this.T3);
        float f4 = (-gl.L(8.0f)) * this.T3;
        a6 a6Var = this.o0;
        a6Var.setTranslationY(f4);
        a6Var.setAlpha((1.0f - this.T3) * this.U2);
        y18 y18Var = this.M1;
        if (y18Var != null) {
            y18Var.setTranslationY(gl.L(8.0f) * this.T3);
            this.M1.setAlpha(1.0f - this.T3);
        }
        z5b z5bVar = this.s0;
        if (z5bVar != null) {
            z5bVar.setTranslationY((-gl.L(8.0f)) * this.T3);
            z5bVar.setAlpha(1.0f - this.T3);
        }
        this.A0.setAlpha(1.0f - this.T3);
        t28 t28Var = this.G1;
        float f5 = t28Var == null ? 0.0f : ((d8b) t28Var).d.W;
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        y18 y18Var2 = this.t0;
        if (y18Var2 != null) {
            y18Var2.setAlpha((1.0f - this.T3) * (1.0f - f5) * hideInterfaceAlpha);
        }
        ImageView imageView3 = this.D0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - this.T3) * (1.0f - f5) * hideInterfaceAlpha);
        }
        y18 y18Var3 = this.F0;
        if (y18Var3 != null) {
            y18Var3.setAlpha((1.0f - this.T3) * (1.0f - f5) * hideInterfaceAlpha);
        }
        q18 q18Var = this.R1;
        if (q18Var != null) {
            q18Var.setAlpha(1.0f - this.T3);
            invalidate();
        }
        this.S0.invalidate();
    }

    public final void E0(h19 h19Var) {
        boolean z;
        TLRPC.Reaction reaction;
        x28 x28Var = this.E1;
        TL_stories.StoryItem storyItem = x28Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z2 = reaction2 != null;
        if (reaction2 != null && h19Var == null) {
            b0();
            this.I1.i0(this.r1, x28Var.a, null);
        } else if (h19Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(this.s2).r.get("❤");
            if (tL_availableReaction != null) {
                this.f3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a = d19.a();
                gl5 b = gl5.b(document);
                ImageReceiver imageReceiver = this.b3;
                imageReceiver.d0(b, a, null, null, null, 0);
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, true);
                }
                this.g3 = true;
                this.I1.i0(this.r1, x28Var.a, h19.c(tL_availableReaction));
            }
        } else {
            b0();
            this.I1.i0(this.r1, x28Var.a, h19Var);
        }
        TL_stories.StoryItem storyItem2 = x28Var.a;
        y18 y18Var = this.t0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.u0.setReaction(null);
            y18Var.setContentDescription(k96.M0(2131754850, null));
            z = false;
        } else {
            z2 = !z2;
            this.u0.setReaction(h19.d(reaction));
            y18Var.setContentDescription(k96.M0(2131754849, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z = true;
        }
        if (this.t1 && z2) {
            TL_stories.StoryItem storyItem3 = x28Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = x28Var.a.views;
            int i = storyViews.reactions_count + (z ? 1 : -1);
            storyViews.reactions_count = i;
            if (i < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = x28Var.a;
        k19.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void F0() {
        t76 t76Var;
        if (this.D3 == null) {
            m8b m8bVar = this.z0;
            if (m8bVar != null && (t76Var = m8bVar.B0) != null) {
                if (t76Var.s == null ? false : !r1.messages_enabled) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers J1 = na7.q1(this.s2).J1(this.r1, true);
            this.D3 = J1;
            q18 q18Var = this.R1;
            if (q18Var == null || J1 == null) {
                return;
            }
            q18Var.v2(true);
        }
    }

    public final boolean G0() {
        q18 q18Var = this.R1;
        if (q18Var == null) {
            return false;
        }
        boolean z = q18Var.p3;
        if (z) {
            q18Var.V1();
        }
        gl.e3(new e18(this, (byte) 3), 300L);
        return z;
    }

    public final void H0() {
        long j;
        i18 i18Var;
        CharSequence charSequence;
        int i;
        byte b = 3;
        na7.c1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.R1.getTextWithEntities();
        long e = y6c.h(this.s2).e();
        TLRPC.Peer l = this.z0.B0.l();
        if (l != null) {
            e = cf3.n(l);
        }
        Context context = getContext();
        int i2 = this.s2;
        String r = cf3.r(i2, this.r1);
        long messageMinPrice = getMessageMinPrice();
        long j2 = this.A3;
        i18 i18Var2 = new i18(this, (byte) 1);
        f53 f53Var = new f53();
        fx0 fx0Var = new fx0(1, (wjb) f53Var, context, false);
        fx0Var.K();
        fx0Var.w0 = false;
        LinearLayout j3 = de9.j(context, 1);
        fx0Var.O = j3;
        int[] iArr = na7.q1(i2).T3;
        CharSequence j0 = k27.j0(textWithEntities, false, false, new TextPaint());
        if (j0 instanceof Spannable) {
            Spannable spannable = (Spannable) j0;
            j = j2;
            i18Var = i18Var2;
            charSequence = j0;
            i = ((gm[]) spannable.getSpans(0, j0.length(), gm.class)).length + ((su3[]) spannable.getSpans(0, j0.length(), su3.class)).length;
        } else {
            j = j2;
            i18Var = i18Var2;
            charSequence = j0;
            i = 0;
        }
        int max = (int) Math.max(messageMinPrice, j <= 0 ? 100L : j);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            int i3 = length * 7;
            int i4 = iArr[i3];
            int[] iArr2 = iArr;
            int i5 = iArr2[i3 + 2];
            if (i <= iArr2[i3 + 3] && charSequence.length() <= i5) {
                max = Math.max(max, i4);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        long[] jArr = {max};
        u41 u41Var = new u41(null, context, true);
        i76 i76Var = new i76();
        i76Var.c = e;
        i76Var.f = textWithEntities;
        i76Var.g = jArr[0];
        d76 d76Var = new d76(i2, context, true);
        LinearLayout j4 = de9.j(context, 0);
        yc ycVar = new yc(context, k96.M0(2131748622, null), f53Var);
        j4.addView(ycVar, nme.q(-1, -1, 1.0f, kk7.w1, 0, 0, 5, 0));
        yc ycVar2 = new yc(context, k96.M0(2131748623, null), f53Var);
        j4.addView(ycVar2, nme.q(-1, -1, 1.0f, kk7.w1, 5, 0, 5, 0));
        yc ycVar3 = new yc(context, k96.M0(2131748624, null), f53Var);
        j4.addView(ycVar3, nme.q(-1, -1, 1.0f, kk7.w1, 5, 0, 0, 0));
        ce5 ce5Var = new ce5(context, f53Var, r3);
        i18 i18Var3 = i18Var;
        p8c[] p8cVarArr = {new be5(jArr, u41Var, new cm2[1], i76Var, d76Var, i2, ycVar, ycVar2, ycVar3, ce5Var, new boolean[]{true})};
        d76Var.set(i76Var);
        int i6 = 9;
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int f = na7.q1(i2).k4.L2.f();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            int[] iArr4 = iArr3;
            if (iArr3[i7] >= messageMinPrice) {
                if (i7 > 0 && arrayList.isEmpty() && iArr4[i7] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i8 = iArr4[i7];
                if (i8 > f) {
                    arrayList.add(Integer.valueOf(f));
                    break;
                } else {
                    arrayList.add(Integer.valueOf(i8));
                    if (iArr4[i7] == f) {
                        break;
                    }
                }
            }
            i7++;
            iArr3 = iArr4;
            i6 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) b00.f(1, arrayList)).intValue() < f) {
            arrayList.add(Integer.valueOf(f));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr5[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        ce5Var.f0 = iArr5;
        ce5Var.setValue((int) jArr[0]);
        j3.addView(ce5Var, nme.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        p8cVarArr[0].a(Integer.valueOf((int) jArr[0]));
        j3.addView(j4, nme.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i10 = bkb.i5;
        TextView b2 = hve.b(context, 20.0f, i10, true, f53Var);
        de9.q(b2, 17, null, 2131748619);
        j3.addView(b2, nme.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b3 = hve.b(context, 14.0f, i10, false, f53Var);
        b3.setGravity(17);
        de9.r(null, null, 2131748620, new Object[]{r}, b3);
        j3.addView(b3, nme.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        j3.addView(d76Var, nme.t(-2, -2, 17, 42, 22, 42, 20));
        j3.addView(u41Var, nme.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        fx0Var.show();
        u41Var.setOnClickListener(new hu4(i18Var3, jArr, fx0Var, b));
    }

    public final void I0() {
        x28 x28Var = this.E1;
        if (x28Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = x28Var.a.id;
        tL_stories_exportStoryLink.peer = na7.q1(this.s2).h1(this.r1);
        ConnectionsManager.getInstance(this.s2).sendRequest(tL_stories_exportStoryLink, new x18());
    }

    public final void J0() {
        if (this.R1 == null) {
            return;
        }
        j0();
        this.y2.d2.h0();
        this.y2.t1(-1, true);
        x31 x31Var = this.y2;
        x31Var.T1 = this.r1;
        x31Var.Z0();
        this.y2.U0().setText(this.R1.getFieldText());
        ((d8b) this.G1).h(this.y2);
    }

    public final void K0() {
        Bundle bundle = new Bundle();
        long j = this.r1;
        if (j < 0) {
            bundle.putLong("chat_id", -j);
        } else {
            bundle.putLong("user_id", j);
        }
        TLRPC.Dialog Q0 = na7.q1(this.s2).Q0(this.r1);
        if (Q0 != null) {
            bundle.putInt("message_id", Q0.top_message);
        }
        this.z0.L(new mu1(bundle));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        if (((um9) r5).U == r8) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
    
        if (((nm9) r5).b0 == r8) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(long j) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        t76 t76Var;
        xa8 xa8Var;
        xa8 xa8Var2;
        if (!this.A1) {
            this.C2.e = null;
            return;
        }
        x28 x28Var = this.E1;
        if (!x28Var.f) {
            if (!x28Var.e) {
                fa4.b("PeerStoriesView.requestVideoPlayer(" + j + "): null, not a video");
                ((d8b) this.G1).c(null, null, 0L, this.C2);
                c30 c30Var = this.C2;
                c30Var.e = null;
                c30Var.a = false;
                return;
            }
            if (x28Var.c() == null || !new File(this.E1.c()).exists()) {
                TL_stories.StoryItem storyItem = this.E1.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.r1;
                    try {
                        document2 = g2b.B(this.s2, storyItem);
                        try {
                            TL_stories.StoryItem storyItem2 = this.E1.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = ba4.G(this.s2).F(this.E1.a);
                            }
                            StringBuilder sb = new StringBuilder("?account=");
                            sb.append(this.s2);
                            sb.append("&id=");
                            sb.append(document2.id);
                            sb.append("&hash=");
                            sb.append(document2.access_hash);
                            sb.append("&dc=");
                            sb.append(document2.dc_id);
                            sb.append("&size=");
                            sb.append(document2.size);
                            sb.append("&mime=");
                            sb.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                            sb.append("&rid=");
                            sb.append(this.E1.a.fileReference);
                            sb.append("&name=");
                            sb.append(URLEncoder.encode(ba4.B(document2), "UTF-8"));
                            sb.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb.append(Utilities.f(bArr));
                            sb.append("&sid=");
                            sb.append(this.E1.a.id);
                            sb.append("&did=");
                            sb.append(this.E1.a.dialogId);
                            Uri parse = Uri.parse("tg://" + ba4.r(null, document2) + sb.toString());
                            fa4.b("StoryViewer requestVideoPlayer(" + j + "): playing from " + parse);
                            this.H2 = (long) (k27.H0(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((d8b) this.G1).c(document, uri, j, this.C2);
                            this.S0.invalidate();
                            return;
                        }
                    } catch (Exception unused2) {
                        document2 = null;
                    }
                } else {
                    document = null;
                    uri = null;
                }
            } else {
                Uri fromFile = Uri.fromFile(new File(this.E1.c()));
                fa4.b("StoryViewer requestVideoPlayer(" + j + "): playing from attachPath " + fromFile);
                this.H2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                fa4.b("PeerStoriesView.requestVideoPlayer(" + j + "): playing from null?");
            }
            ((d8b) this.G1).c(document, uri, j, this.C2);
            this.S0.invalidate();
            return;
        }
        t28 t28Var = this.G1;
        TL_stories.StoryItem storyItem3 = x28Var.a;
        long j2 = this.r1;
        int i = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        c30 c30Var2 = this.C2;
        d8b d8bVar = (d8b) t28Var;
        d8bVar.i(true, true);
        t76 t76Var2 = d8bVar.d.B0;
        if (t76Var2 == null || t76Var2.b != j2 || !t76Var2.i(inputGroupCall)) {
            u76 u76Var = d8bVar.d.E0;
            if (u76Var != null) {
                u76Var.e(j2, null);
                u76 u76Var2 = d8bVar.d.E0;
                u76Var2.getClass();
                TextureViewRenderer textureViewRenderer = u76Var2.c;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                a86 a86Var = u76Var2.e;
                if (a86Var != null) {
                    if (a86Var.d != 0 || a86Var.e != 0) {
                        a86Var.e = 0;
                        a86Var.d = 0;
                        a86Var.requestLayout();
                    }
                    s71 s71Var = u76Var2.f;
                    s71Var.c = null;
                    s71Var.invalidate();
                }
                u76Var2.y = false;
                u76Var2.f(false, false);
            }
            x76 x76Var = x76.E;
            if (x76Var == null || x76Var.b == null || (xa8Var2 = x76Var.a) == null || !xa8Var2.e() || !x76Var.b.i(inputGroupCall)) {
                t76Var = null;
            } else {
                t76Var = x76Var.b;
                if (x76Var.a != null) {
                    ta8 ta8Var = x76Var.e;
                    x76Var.e = null;
                    w76 w76Var = x76Var.d;
                    if (w76Var != null) {
                        w76Var.a = null;
                    }
                    z76 z76Var = x76Var.f;
                    x76Var.f = null;
                    x76Var.a.a(new x15(ta8Var, z76Var, (byte) 6));
                }
            }
            m8b m8bVar = d8bVar.d;
            t76 t76Var3 = m8bVar.B0;
            if (t76Var3 != null && t76Var3 != t76Var) {
                if (t76Var3.n || x76.a(t76Var3)) {
                    if (t76Var == null) {
                        m8b m8bVar2 = d8bVar.d;
                        u76 u76Var3 = m8bVar2.E0;
                        t76 t76Var4 = m8bVar2.B0;
                        if (t76Var4 instanceof um9) {
                            a86 a86Var2 = u76Var3.e;
                            if (a86Var2 != null) {
                            }
                        } else if (t76Var4 instanceof nm9) {
                            TextureViewRenderer textureViewRenderer2 = u76Var3.c;
                            if (textureViewRenderer2 == null) {
                                textureViewRenderer2 = null;
                            }
                            if (textureViewRenderer2 != null) {
                            }
                        } else {
                            u76Var3.getClass();
                        }
                    }
                    d8bVar.d.B0.d();
                } else {
                    d8bVar.d.B0.h();
                }
                m8bVar = d8bVar.d;
                m8bVar.B0 = null;
            }
            if (t76Var != null) {
                m8bVar.B0 = t76Var;
            }
            x76 x76Var2 = x76.E;
            if (x76Var2 != null && (xa8Var = x76Var2.a) != null && xa8Var.e()) {
                x76Var2.a.b();
            }
            m8b m8bVar3 = d8bVar.d;
            l8b l8bVar = m8bVar3.A0;
            if (l8bVar != null) {
                l8bVar.release(null);
                m8bVar3 = d8bVar.d;
                m8bVar3.A0 = null;
            }
            c30 c30Var3 = m8bVar3.G0;
            if (c30Var3 != null) {
                c30Var3.c = null;
                c30Var3.b = null;
                c30Var3.a = false;
                c30Var3.e = null;
                c30Var3.f = null;
                c30Var3.d = null;
                c30Var3.m();
                m8bVar3 = d8bVar.d;
                m8bVar3.G0 = null;
            }
            if (m8bVar3.B0 == null) {
                t76 t76Var5 = t76.N;
                if (t76Var5 == null || !t76Var5.i(inputGroupCall)) {
                    m8b m8bVar4 = d8bVar.d;
                    m8bVar4.B0 = t76.g(d8bVar.c, m8bVar4.h, storyItem3, j2, i, z, inputGroupCall, false, false);
                } else {
                    d8bVar.d.B0 = t76.N;
                }
            }
            m8b m8bVar5 = d8bVar.d;
            m8bVar5.E0.a(m8bVar5.B0);
            m8b m8bVar6 = d8bVar.d;
            t76 t76Var6 = m8bVar6.B0;
            x76 x76Var3 = x76.E;
            if (x76Var3 == null) {
                x76Var3 = new x76();
                x76.E = x76Var3;
            }
            xa8 xa8Var3 = x76Var3.a;
            if (xa8Var3 != null && xa8Var3.d()) {
                xa8 xa8Var4 = x76Var3.a;
                if (xa8Var4.c != 0) {
                    if (x76Var3.b != t76Var6) {
                        xa8Var4.b();
                    }
                    m8b m8bVar7 = d8bVar.d;
                    m8bVar7.G0 = c30Var2;
                    c30Var2.a = false;
                    c30Var2.e = m8bVar7.z0;
                    c30Var2.f = m8bVar7.E0.getVideoTextureView();
                    m8b m8bVar8 = d8bVar.d;
                    c30 c30Var4 = m8bVar8.G0;
                    u76 u76Var4 = m8bVar8.E0;
                    u76Var4.getClass();
                    c30Var4.d = null;
                    c30Var4.b = m8bVar8.B0;
                    u76Var4.e(j2, c30Var4);
                    d8bVar.d.G0.m();
                }
            }
            x76Var3.c = m8bVar6;
            x76Var3.b(t76Var6);
            xa8 xa8Var5 = x76Var3.a;
            if (xa8Var5 == null || !xa8Var5.d()) {
                x76Var3.a = mb3.c().k(x76Var3);
            }
            v76 v76Var = x76Var3.w;
            LaunchActivity launchActivity = LaunchActivity.H1;
            LaunchActivity launchActivity2 = x76Var3.x;
            if (launchActivity2 != launchActivity) {
                if (launchActivity2 != null) {
                    launchActivity2.a1.remove(v76Var);
                }
                x76Var3.x = launchActivity;
                if (launchActivity != null) {
                    launchActivity.a1.add(v76Var);
                }
            }
            x76Var3.a.c();
            m8b m8bVar72 = d8bVar.d;
            m8bVar72.G0 = c30Var2;
            c30Var2.a = false;
            c30Var2.e = m8bVar72.z0;
            c30Var2.f = m8bVar72.E0.getVideoTextureView();
            m8b m8bVar82 = d8bVar.d;
            c30 c30Var42 = m8bVar82.G0;
            u76 u76Var42 = m8bVar82.E0;
            u76Var42.getClass();
            c30Var42.d = null;
            c30Var42.b = m8bVar82.B0;
            u76Var42.e(j2, c30Var42);
            d8bVar.d.G0.m();
        }
        this.S0.invalidate();
    }

    public final void M0() {
        x28 x28Var = this.E1;
        TL_stories.StoryItem storyItem = x28Var.a;
        if ((storyItem == null && x28Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File f = x28Var.f();
        boolean z = x28Var.e;
        if (f == null || !f.exists()) {
            V0();
            return;
        }
        MediaController.d0(f.toString(), getContext(), z ? 1 : 0, null, null, new ra((byte) 4, this, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(Uri uri) {
        TL_stories.StoryItem storyItem;
        String str;
        int indexOf;
        Uri parse;
        String str2;
        if (uri == null || (storyItem = this.E1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        boolean z = true;
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                str = uri2.split("/1/")[1];
                indexOf = str.indexOf("/ACTUAL");
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (indexOf != -1) {
                parse = Uri.parse(URLDecoder.decode(str.substring(0, indexOf), "UTF-8"));
                String S0 = gl.S0(parse);
                if (w01.b) {
                    if (S0 == null) {
                        String uri3 = parse.toString();
                        String o = MediaController.o(-1L, parse, "file");
                        if (o == null) {
                            U0();
                            return;
                        }
                        str2 = uri3;
                        S0 = o;
                        z = false;
                        if (z) {
                            z3a.S(getAccountInstance(), null, null, parse, null, null, this.r1, null, null, storyItem, null, true, null, null);
                            return;
                        } else {
                            z3a.S(getAccountInstance(), S0, str2, null, null, null, this.r1, null, null, storyItem, null, true, null, null);
                            return;
                        }
                    }
                    z = false;
                }
                str2 = S0;
                if (z) {
                }
            }
        }
        parse = uri;
        String S02 = gl.S0(parse);
        if (w01.b) {
        }
        str2 = S02;
        if (z) {
        }
    }

    public final void O0(long j, boolean z) {
        if (this.A1 != z) {
            this.A1 = z;
            ry8 ry8Var = this.p0;
            if (z) {
                if (this.z0.a && Build.VERSION.SDK_INT < 33) {
                    m8b m8bVar = ((d8b) this.G1).d;
                    m8bVar.l1 = true;
                    m8bVar.U();
                    bg7 bg7Var = this.L3;
                    gl.r(bg7Var);
                    gl.e3(bg7Var, 100L);
                }
                L0(j);
                d1();
                ry8Var.setAnimation(this.n1.u);
                this.A1 = true;
                this.e1.a.getImageReceiver().v0(true, true);
                x28 x28Var = this.E1;
                if (x28Var.a != null) {
                    fa4.b("StoryViewer displayed story dialogId=" + this.r1 + " storyId=" + x28Var.a.id + " " + x28Var.d());
                }
            } else {
                f0();
                ry8Var.a();
                this.b1 = null;
                this.B2 = false;
                this.E2.e(true, 0.0f);
                this.S0.invalidate();
                invalidate();
                g0();
                m8b m8bVar2 = ((d8b) this.G1).d;
                m8bVar2.I0 = false;
                m8bVar2.U();
            }
            this.U0.T(this.A1 ? 3 : 2);
            this.V0.T(this.A1 ? 2 : 0);
            this.W0.T(this.A1 ? 2 : 0);
            if (this.s1 || this.t1) {
                g2b g2bVar = this.I1;
                long j2 = this.r1;
                boolean z2 = this.A1;
                vf6 vf6Var = g2bVar.m;
                ifc ifcVar = (ifc) vf6Var.f(j2);
                if (ifcVar == null) {
                    ifcVar = new ifc(g2bVar.a, j2, g2bVar);
                    vf6Var.k(ifcVar, j2);
                }
                ifcVar.b(z2);
            }
        }
    }

    public final void P0(int i, long j) {
        if (this.r1 != j) {
            x28 x28Var = this.E1;
            x28Var.b = null;
            x28Var.a = null;
        }
        this.r1 = j;
        this.p1 = null;
        e0(i);
        TL_stories.PeerStories peerStories = this.z0.Q0;
        g2b g2bVar = this.I1;
        boolean z = true;
        if (peerStories != null) {
            g2bVar.U(peerStories, true);
            return;
        }
        TL_stories.PeerStories x = g2bVar.x(j);
        if (x == null) {
            x = g2bVar.y(j);
        } else {
            z = false;
        }
        g2bVar.U(x, z);
    }

    public final void R0(long j, boolean z, boolean z2) {
        if (!z && j == this.B3 && this.C3 == z2) {
            return;
        }
        this.B3 = j;
        this.C3 = z2;
        v28 v28Var = this.e1;
        if (j < 0) {
            TLRPC.Chat K0 = na7.q1(this.s2).K0(Long.valueOf(-j));
            df0 df0Var = v28Var.b;
            df0 df0Var2 = v28Var.b;
            df0Var.l(gl.A2(K0 == null ? "" : K0.title), false);
            if (K0 == null || !K0.verified) {
                df0Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(kk7.d4);
            fm2 fm2Var = new fm2(mutate, null);
            fm2Var.x = true;
            int L = gl.L(16.0f);
            int L2 = gl.L(16.0f);
            fm2Var.h = L;
            fm2Var.n = L2;
            df0Var2.i(fm2Var);
            return;
        }
        if (this.s1 && !z2) {
            v28Var.b.l(k96.M0(2131745449, null), false);
            v28Var.b.i(null);
            return;
        }
        TLRPC.User V1 = na7.q1(this.s2).V1(Long.valueOf(j));
        if (V1 == null || !V1.verified) {
            v28Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(kk7.d4);
            fm2 fm2Var2 = new fm2(mutate2, null);
            fm2Var2.x = true;
            int L3 = gl.L(16.0f);
            int L4 = gl.L(16.0f);
            fm2Var2.h = L3;
            fm2Var2.n = L4;
            v28Var.b.i(fm2Var2);
        }
        if (V1 != null) {
            v28Var.b.l(vu3.m(gl.A2(qu2.p(V1)), v28Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
        } else {
            v28Var.b.l(null, false);
        }
    }

    public final void S0(float f, float f2, mz9 mz9Var) {
        this.c1 = f;
        this.q3 = 1.0f / f2;
        if (this.b1 != mz9Var) {
            this.b1 = mz9Var;
            if (mz9Var != null) {
                ImageReceiver imageReceiver = mz9Var.a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    ml mlVar = this.U0;
                    mlVar.d0 = null;
                    mlVar.a1.setShader(null);
                    mlVar.u0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void T0(boolean z) {
        x28 x28Var = this.E1;
        if (x28Var.a != null) {
            m8b m8bVar = this.z0;
            if (m8bVar.f != null) {
                String b = x28Var.b();
                if (!z) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", b);
                    LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                    return;
                }
                w18 w18Var = new w18(this, m8bVar.f.getContext(), b, b, na7.q1(this.s2).b5() && (!(this.t1 || l7c.B(this.r1)) || hc2.t0(this.t1 ? na7.q1(this.s2).K0(Long.valueOf(-this.r1)) : null)), new gu0(this.r0, (byte) 5));
                this.P2 = w18Var;
                w18Var.d2 = true;
                TL_stories.StoryItem storyItem = x28Var.a;
                storyItem.dialogId = this.r1;
                w18Var.A2 = storyItem;
                w18Var.n2 = new pj4((Object) this, (byte) 22);
                ((d8b) this.G1).h(w18Var);
            }
        }
    }

    public final void U0() {
        d28 d28Var = this.S0;
        f53 f53Var = this.r0;
        new u21(d28Var, f53Var).t(k96.M0(2131743594, null), f53Var).j();
    }

    public final void V0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
        String M0 = k96.M0(R.string.AppName, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        hdVar.U = k96.M0(2131747025, null);
        ((d8b) this.G1).h(hdVar);
    }

    public final void W0(boolean z) {
        if (this.i3 != z) {
            x28 x28Var = this.E1;
            if (x28Var.a != null) {
                this.i3 = z;
                byte b = 0;
                if (z) {
                    this.h3.setVisibility(0);
                }
                this.h3.setStoryItem(x28Var.a);
                m8b m8bVar = ((d8b) this.G1).d;
                m8bVar.p1 = z;
                m8bVar.U();
                if (!z) {
                    if (this.h3.getReactionsWindow() != null) {
                        this.h3.getReactionsWindow().e();
                    }
                    this.h3.animate().alpha(0.0f).setDuration(150L).setListener(new o18(this, b)).start();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j3, z ? 1.0f : 0.0f);
                this.h3.setTransitionProgress(this.j3);
                ofFloat.addUpdateListener(new f18(this, (byte) 1));
                ofFloat.addListener(new n18(this, z, b));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(s33.g);
                ofFloat.start();
            }
        }
    }

    public final void X0(boolean z) {
        if (this.w0 == null) {
            je5 je5Var = new je5(getContext(), 1);
            je5Var.n(1.0f, -56.0f);
            this.w0 = je5Var;
            je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
            this.S0.addView(this.w0, nme.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.w0.t(k96.M0(z ? 2131744367 : 2131744217, null));
        this.w0.v();
    }

    public final void Y0() {
        if (this.w1) {
            return;
        }
        byte b = 0;
        if (this.u1) {
            if (this.y3 != null && this.z3 != null) {
                h26.n1(new hu0(this, (byte) 9), this.y3, this.z3, this.r1, true);
                return;
            }
            m8b m8bVar = this.z0;
            if (m8bVar != null) {
                m8bVar.k1 = true;
                m8bVar.U();
            }
            na7.q1(this.s2).E0().a(this.r1, new i18(this, b));
            return;
        }
        q18 q18Var = this.R1;
        int i = -this.h1;
        this.h1 = i;
        gl.B3(i, q18Var, null);
        pw0.E.a();
        String q = this.r1 >= 0 ? l7c.q(na7.q1(this.s2).V1(Long.valueOf(this.r1))) : "";
        boolean E3 = na7.q1(this.s2).E3();
        f53 f53Var = this.r0;
        d28 d28Var = this.S0;
        (E3 ? new u21(d28Var, f53Var).Q(R.raw.star_premium_2, 36, gl.T2(k96.a0(null, null, 2131743519, q))) : new u21(d28Var, f53Var).K(R.raw.star_premium_2, gl.T2(k96.a0(null, null, 2131743519, q)), k96.M0(2131743520, null), new e18(this, (byte) 5))).j();
    }

    public final boolean Z0(boolean z) {
        if (this.z0.R0) {
            z = !z;
        }
        int i = this.z1;
        if (z) {
            if (i < getStoriesCount() - 1) {
                this.z1++;
                c1(false);
                return true;
            }
        } else if (i > 0) {
            this.z1 = i - 1;
            c1(false);
            return true;
        }
        return false;
    }

    public final void a0(boolean z) {
        y28 currentPeerView;
        q qVar = this.z2;
        if (qVar != null) {
            qVar.f(false);
        }
        long j = this.r1;
        TL_stories.StoryItem storyItem = this.E1.a;
        m8b m8bVar = this.z0;
        m8bVar.getClass();
        if (j != 0 && storyItem != null) {
            m8b.E1.remove(j + (j >> 16) + (storyItem.id << 16));
        }
        this.Y2 = true;
        c8b c8bVar = m8bVar.o0;
        if (c8bVar != null && (currentPeerView = c8bVar.getCurrentPeerView()) != null) {
            currentPeerView.i0();
        }
        if (z) {
            m21 J = new u21(this.S0, this.r0).J(R.raw.forward, k96.M0(2131748291, null), k96.M0(2131743310, null), 5000, false, new e18(this, (byte) 2));
            J.r = false;
            J.k(false);
        }
        na7.q1(this.s2).p0(this.r1, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a1(long j) {
        String str;
        boolean z;
        TLRPC.Chat chat;
        int i = this.s2;
        if (j > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            str = V1.first_name;
            z = V1.stories_hidden;
            chat = V1;
        } else {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            str = K0.title;
            z = K0.stories_hidden;
            chat = K0;
        }
        gl.e3(new ms0(this, na7.q1(this.s2), j, !z, str, chat), 200L);
    }

    public final void b0() {
        l2b l2bVar = this.u0;
        l2bVar.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new uk(l2bVar, (byte) 1)).setDuration(150L).start();
        int L = gl.L(8.0f);
        l2b l2bVar2 = new l2b(getContext(), this.n1);
        this.u0 = l2bVar2;
        l2bVar2.setPadding(L, L, L, L);
        this.u0.setAlpha(0.0f);
        this.u0.setScaleX(0.8f);
        this.u0.setScaleY(0.8f);
        this.u0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.t0.addView(this.u0, nme.e(40, 40, 3));
        this.g3 = false;
    }

    public final void b1() {
        if (na7.q1(this.s2).b5()) {
            File f = this.E1.f();
            if (f == null || !f.exists()) {
                V0();
                return;
            }
            w18 w18Var = this.P2;
            if (w18Var != null) {
                w18Var.dismiss();
            }
            gl.e3(new e18(this, (byte) 8), 120L);
        }
    }

    public final void c0(boolean z) {
        ValueAnimator valueAnimator = this.S3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T3, z ? 1.0f : 0.0f);
        this.S3 = ofFloat;
        ofFloat.addUpdateListener(new f18(this, (byte) 2));
        this.S3.addListener(new n18(this, z, (byte) 1));
        this.S3.setDuration(420L);
        this.S3.setInterpolator(s33.h);
        this.S3.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x092f, code lost:
    
        if (r1.g == (r6 == null && r6.translated && r6.translatedText != null && android.text.TextUtils.equals(r6.translatedLng, rzb.G0()))) goto L413;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0bc4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0c94  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0d72  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0dc0 A[EDGE_INSN: B:316:0x0dc0->B:317:0x0dc0 BREAK  A[LOOP:0: B:305:0x0d9a->B:314:0x0dbd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0ddf  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0e9a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0ebf  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0f5c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0f93  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0fa8  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0fce  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0fef  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x1025  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:415:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x1004  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0f07  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0e94  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0e5b  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0e40  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0910  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(boolean z) {
        TL_stories.StoryItem storyItem;
        f2b f2bVar;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        j8b j8bVar;
        ImageReceiver imageReceiver;
        boolean z6;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem2;
        TL_stories.StoryItem storyItem3;
        f2b f2bVar2;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem4;
        f4b f4bVar;
        f4b f4bVar2;
        m8b m8bVar;
        boolean z7;
        q18 q18Var;
        f2b f2bVar3;
        m21 m21Var;
        TL_stories.StoryItem storyItem5;
        f2b f2bVar4;
        long j;
        byte b;
        int i2;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem6;
        int i3;
        t76 t76Var;
        TLRPC.MessageMedia messageMedia2;
        je5 je5Var;
        je5 je5Var2;
        y1b y1bVar;
        TL_stories.StoryItem storyItem7;
        CharSequence charSequence2;
        TL_stories.StoryItem storyItem8;
        x28 x28Var;
        t28 t28Var;
        boolean z8;
        LinearLayout linearLayout;
        q18 q18Var2;
        byte b2;
        q18 q18Var3;
        dz1 dz1Var;
        jm2 jm2Var;
        kh7 kh7Var;
        x28 x28Var2;
        TL_stories.StoryItem storyItem9;
        boolean z9;
        boolean z10;
        f2b f2bVar5;
        f2b f2bVar6;
        je5 je5Var3;
        int i4;
        ImageView imageView;
        ImageView imageView2;
        x28 x28Var3;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem10;
        int i5;
        boolean z11;
        TL_stories.StoryItem storyItem11;
        int i6;
        t76 t76Var2;
        boolean z12;
        m8b m8bVar2;
        t76 t76Var3;
        String str;
        t76 t76Var4;
        int i7;
        TLRPC.GroupCall groupCall;
        BitmapDrawable bitmapDrawable;
        f2b f2bVar7;
        TLRPC.MessageMedia messageMedia3;
        y1b y1bVar2;
        if (this.l1.isEmpty() && this.m1.isEmpty()) {
            return;
        }
        this.L2 = true;
        x28 x28Var4 = this.E1;
        TL_stories.StoryItem storyItem12 = x28Var4.a;
        f2b f2bVar8 = x28Var4.b;
        String s = x2b.s();
        this.P0 = false;
        this.S2 = false;
        int i8 = this.z1;
        boolean z13 = this.J1;
        boolean z14 = this.K1;
        boolean z15 = this.L1;
        m8b m8bVar3 = this.z0;
        if (m8bVar3 == null || (y1bVar2 = m8bVar3.O0) == null || y1bVar2.e != 4) {
            storyItem = (i8 < 0 || i8 >= this.l1.size()) ? null : (TL_stories.StoryItem) this.l1.get(i8);
            int size = i8 - this.l1.size();
            f2bVar = (size < 0 || size >= this.m1.size()) ? null : (f2b) this.m1.get(size);
        } else {
            f2bVar = (i8 < 0 || i8 >= this.m1.size()) ? null : (f2b) this.m1.get(i8);
            int size2 = i8 - this.m1.size();
            storyItem = (size2 < 0 || size2 >= this.l1.size()) ? null : (TL_stories.StoryItem) this.l1.get(size2);
        }
        TL_stories.StoryItem storyItem13 = storyItem;
        this.E1.c = null;
        if (f2bVar != null) {
            this.K1 = false;
            boolean z16 = f2bVar.J;
            this.L1 = z16;
            this.J1 = !z16;
            ml mlVar = this.U0;
            mlVar.B0 = false;
            mlVar.t1 = (short) 150;
            Bitmap bitmap = f2bVar.c.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (f2bVar.s || f2bVar.I) {
                i = i8;
                z2 = z13;
                z3 = z14;
                z4 = z15;
                f2bVar7 = f2bVar;
                this.U0.Y(null, null, gl5.g(f2bVar7.f), s, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                z3 = z14;
                i = i8;
                z2 = z13;
                z4 = z15;
                f2bVar7 = f2bVar;
                this.U0.Y(null, null, gl5.g(f2bVar.e), s, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            x28 x28Var5 = this.E1;
            x28Var5.b = f2bVar7;
            x28Var5.j = null;
            x28Var5.i = null;
            x28Var5.a = null;
            x28Var5.d = false;
            x28Var5.e = x28Var5.j();
            TL_stories.StoryItem storyItem14 = x28Var5.a;
            x28Var5.f = (storyItem14 == null || (messageMedia3 = storyItem14.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            this.Z0.d(null, w4b.a(f2bVar7.c), this.a1);
            this.K2 = false;
            this.J2 = false;
            this.I2 = false;
        } else {
            i = i8;
            z2 = z13;
            z3 = z14;
            z4 = z15;
            this.J1 = false;
            this.K1 = false;
            this.L1 = false;
            if (storyItem13 == null) {
                m8b m8bVar4 = this.z0;
                if (m8bVar4 != null) {
                    m8bVar4.o(true);
                    return;
                }
                return;
            }
            f2b s2 = this.I1.s(this.r1, storyItem13);
            if (s2 != null) {
                this.K1 = true;
                ml mlVar2 = this.U0;
                mlVar2.B0 = false;
                mlVar2.t1 = this.Y0 != null ? (short) 0 : (short) 150;
                boolean z17 = s2.s;
                String str2 = s2.f;
                if (z17) {
                    f2bVar2 = s2;
                    mlVar2.Z(null, null, gl5.g(str2), s, null, 0L, null, null, 0);
                } else {
                    f2bVar2 = s2;
                    mlVar2.Z(null, null, gl5.g(str2), s, null, 0L, null, null, 0);
                }
                x28 x28Var6 = this.E1;
                x28Var6.b = f2bVar2;
                x28Var6.j = null;
                x28Var6.i = null;
                x28Var6.a = null;
                x28Var6.d = false;
                x28Var6.e = x28Var6.j();
                TL_stories.StoryItem storyItem15 = x28Var6.a;
                x28Var6.f = (storyItem15 == null || (messageMedia = storyItem15.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                this.Z0.d(null, w4b.a(f2bVar2.c), this.a1);
                this.E1.c = storyItem13;
                this.K2 = false;
                this.J2 = false;
                this.I2 = false;
            } else {
                TLRPC.MessageMedia messageMedia4 = storyItem13.media;
                boolean z18 = messageMedia4 != null && k27.J4(messageMedia4.getDocument());
                storyItem13.dialogId = this.r1;
                ml mlVar3 = this.U0;
                mlVar3.B0 = z3;
                mlVar3.t1 = (short) 150;
                TLRPC.MessageMedia messageMedia5 = storyItem13.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.S2 = true;
                    na7.q1(this.s2).M1().o(storyItem13.id, this.r1);
                    z6 = z3;
                } else {
                    String str3 = storyItem13.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z18 = str3.toLowerCase().endsWith(".mp4");
                        }
                        TLRPC.MessageMedia messageMedia6 = storyItem13.media;
                        if (z18) {
                            BitmapDrawable i9 = messageMedia6 != null ? fl5.i(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem13.firstFramePath != null) {
                                if (fl5.z().F(gl5.g(storyItem13.firstFramePath).q(null, null, false) + "@" + s, false)) {
                                    z5 = z3;
                                    storyItem2 = storyItem13;
                                    this.U0.Y(null, null, gl5.g(storyItem13.firstFramePath), s, null, null, i9, 0L, null, null, 0);
                                    storyItem13 = storyItem2;
                                }
                            }
                            z5 = z3;
                            storyItem2 = storyItem13;
                            this.U0.Y(null, null, gl5.g(storyItem2.attachPath), s.concat("_pframe"), null, null, i9, 0L, null, null, 0);
                            storyItem13 = storyItem2;
                        } else {
                            z5 = z3;
                            TLRPC.Photo photo = messageMedia6 != null ? messageMedia6.photo : null;
                            BitmapDrawable i10 = photo != null ? fl5.i(photo.sizes) : null;
                            ml mlVar4 = this.U0;
                            String str4 = storyItem13.attachPath;
                            if (z5) {
                                mlVar4.Z(gl5.g(str4), s, gl5.g(storyItem13.firstFramePath), s, i10, 0L, null, null, 0);
                            } else {
                                mlVar4.Z(gl5.g(str4), s, null, null, i10, 0L, null, null, 0);
                            }
                        }
                    } else {
                        z5 = z3;
                        m8b m8bVar5 = this.z0;
                        Drawable t = ((m8bVar5.O0 != null || m8bVar5.N0) && (j8bVar = m8bVar5.t0) != null && (imageReceiver = j8bVar.c) != null && j8bVar.o == storyItem13.id) ? imageReceiver.t() : null;
                        storyItem13.dialogId = this.r1;
                        TLRPC.MessageMedia messageMedia7 = storyItem13.media;
                        if (z18) {
                            TLRPC.PhotoSize u = ba4.u(1000, messageMedia7.getDocument().thumbs);
                            if (t == null) {
                                t = fl5.i(storyItem13.media.getDocument().thumbs);
                            }
                            this.U0.Y(null, null, gl5.b(g2b.B(this.s2, storyItem13)), s.concat("_pframe"), gl5.c(u, storyItem13.media.getDocument()), s, t, 0L, null, storyItem13, 0);
                        } else {
                            TLRPC.Photo photo2 = messageMedia7 != null ? messageMedia7.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                z6 = z5;
                                this.U0.f();
                            } else {
                                if (t == null) {
                                    t = fl5.i(arrayList);
                                }
                                TLRPC.PhotoSize u2 = ba4.u(ConnectionsManager.DEFAULT_DATACENTER_ID, photo2.sizes);
                                ba4.u(800, photo2.sizes);
                                ml mlVar5 = this.U0;
                                gl5 i11 = gl5.i(u2, photo2);
                                z6 = z5;
                                mlVar5.Y(null, null, i11, s, null, null, t, 0L, null, storyItem13, 0);
                            }
                        }
                    }
                    z6 = z5;
                }
                storyItem13.dialogId = this.r1;
                this.Z0.c(z ? null : storyItem13, this.a1);
                this.E1.k(storyItem13);
                boolean z19 = (this.S2 || (storyItem3 = this.E1.a) == null || (storyItem3 instanceof TL_stories.TL_storyItemDeleted) || (storyItem3 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.K2 = z19;
                this.I2 = z19;
                if (z19) {
                    z19 = this.E1.a() && this.E1.a.isPublic;
                    this.I2 = z19;
                }
                if (z19) {
                    TL_stories.StoryItem storyItem16 = this.E1.a;
                    z19 = storyItem16.pinned || !x2b.w(this.s2, storyItem16);
                    this.I2 = z19;
                }
                this.J2 = z19;
                if (z19 && this.t1) {
                    TLRPC.Chat K0 = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
                    this.J2 = K0 != null && hc2.t0(K0);
                }
                if (this.K2) {
                    boolean z20 = this.t1;
                    int i12 = this.s2;
                    if (z20) {
                        TLRPC.Chat K02 = na7.q1(i12).K0(Long.valueOf(-this.r1));
                        this.K2 = (K02 == null || hc2.K(K02, false) == null) ? false : true;
                    } else {
                        TLRPC.User V1 = na7.q1(i12).V1(Long.valueOf(this.r1));
                        this.K2 = (V1 == null || l7c.o(V1) == null || !this.E1.a.isPublic) ? false : true;
                    }
                }
                im7.l0.c(new zl7(im7.n(this.s2), this.r1, storyItem13.id, (byte) 1));
                storyItem4 = this.E1.a;
                if (storyItem4 != null && !z) {
                    this.z0.P0 = storyItem4.id;
                }
                this.z0.o0.A();
                this.O2 = true;
                if (!this.s1 || this.t1) {
                    i1(false);
                }
                x28 x28Var7 = this.E1;
                TL_stories.StoryItem storyItem17 = x28Var7.a;
                f2b f2bVar9 = x28Var7.b;
                boolean z21 = ((storyItem17 == null ? storyItem17.id : (f2bVar9 == null || (f4bVar = f2bVar9.c) == null) ? 0 : f4bVar.f) == (storyItem12 == null ? storyItem12.id : (f2bVar8 == null || (f4bVar2 = f2bVar8.c) == null) ? 0 : f4bVar2.f) && (f2bVar8 == null || storyItem17 == null || !TextUtils.equals(f2bVar8.e, storyItem17.attachPath))) ? false : true;
                boolean z22 = (z21 || (this.K1 == z6 && this.J1 == z2 && this.L1 == z4)) ? false : true;
                m8bVar = this.z0;
                if (m8bVar != null && (t76Var4 = m8bVar.B0) != null) {
                    i7 = this.F3;
                    groupCall = t76Var4.s;
                    if (i7 != Math.max(1, groupCall != null ? 0 : groupCall.participants_count)) {
                        z7 = true;
                        if ((f2bVar8 != null || (str = f2bVar8.e) == null || !str.equals(this.E1.c())) && (storyItem12 == null || (storyItem5 = this.E1.a) == null || storyItem12.id != storyItem5.id)) {
                            q18Var = this.R1;
                            if (q18Var != null) {
                                if (storyItem12 != null && !TextUtils.isEmpty(q18Var.getEditField().getText())) {
                                    m8b m8bVar6 = this.z0;
                                    long j2 = storyItem12.dialogId;
                                    Editable text = this.R1.getEditField().getText();
                                    m8bVar6.getClass();
                                    m8b.N(j2, storyItem12, text);
                                }
                                gt3 editField = this.R1.getEditField();
                                m8b m8bVar7 = this.z0;
                                long j3 = this.r1;
                                TL_stories.StoryItem storyItem18 = this.E1.a;
                                m8bVar7.getClass();
                                editField.setText(m8b.x(j3, storyItem18));
                                boolean z23 = this.E1.f;
                                q18 q18Var4 = this.R1;
                                if (z23) {
                                    q18Var4.w1(false, false, false);
                                } else {
                                    q18Var4.w1(true, true, false);
                                }
                            }
                            if (this.E1.f) {
                                F0();
                            }
                            this.a1.c();
                            this.M0 = 0L;
                            this.O0 = false;
                            f2bVar3 = this.E1.b;
                            if (f2bVar3 != null) {
                                ty8 ty8Var = this.e1.d;
                                if (ty8Var != null) {
                                    ty8Var.e(false, f2bVar3.h);
                                }
                                this.e1.a.invalidate();
                            } else if (!z22) {
                                this.e1.h = 0.0f;
                            }
                            d28 d28Var = this.S0;
                            m21Var = m21.w;
                            if (m21Var != null && m21Var.h == d28Var) {
                                m21Var.b();
                            }
                            this.A0.J();
                            g0();
                            z7 = true;
                        }
                        if (!z7 || (f2bVar8 != null && this.E1.b == null)) {
                            this.e1.setOnSubtitleClick(null);
                            this.F3 = 0;
                            R0(this.r1, false, this.E1.f);
                            f2bVar4 = this.E1.b;
                            if (f2bVar4 != null) {
                                charSequence2 = f2bVar4.J ? k96.L0(2131750832) : x2b.u(this.e1.c[0], this.K1);
                            } else {
                                boolean A0 = A0();
                                x28 x28Var8 = this.E1;
                                if (A0) {
                                    TL_stories.StoryItem storyItem19 = x28Var8.a;
                                    charSequence = "";
                                    if (storyItem19 != null && (messageMedia2 = storyItem19.media) != null) {
                                        if (messageMedia2.document != null) {
                                            charSequence2 = k96.X(r14.date);
                                        } else {
                                            if (messageMedia2.photo != null) {
                                                charSequence2 = k96.X(r11.date);
                                            }
                                        }
                                    }
                                    j = 0;
                                    b = 4;
                                    i2 = 2;
                                    if (charSequence != null) {
                                        m8b m8bVar8 = this.z0;
                                        if (m8bVar8 != null && (y1bVar = m8bVar8.O0) != null && (storyItem7 = this.E1.a) != null && y1bVar.m(storyItem7.id)) {
                                            if (!(charSequence instanceof SpannableStringBuilder)) {
                                                charSequence = new SpannableStringBuilder(charSequence);
                                            }
                                            SpannableString spannableString = new SpannableString("p ");
                                            spannableString.setSpan(new cm2(R.drawable.msg_pin_mini), 0, 1, 33);
                                            ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString);
                                        }
                                        this.e1.b(charSequence, z22);
                                    }
                                    je5Var = this.v0;
                                    if (je5Var != null) {
                                        je5Var.f(false);
                                    }
                                    je5Var2 = this.w0;
                                    if (je5Var2 != null) {
                                        je5Var2.f(false);
                                    }
                                } else {
                                    TL_stories.StoryItem storyItem20 = x28Var8.a;
                                    if (storyItem20 == null) {
                                        j = 0;
                                        b = 4;
                                        i2 = 2;
                                        charSequence = null;
                                    } else if (storyItem20.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.L0(2131748633));
                                        spannableStringBuilder.setSpan(new a76((byte) 1), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        m8b m8bVar9 = this.z0;
                                        if (m8bVar9 == null || (t76Var = m8bVar9.B0) == null) {
                                            i3 = 1;
                                        } else {
                                            TLRPC.GroupCall groupCall2 = t76Var.s;
                                            i3 = 1;
                                            this.F3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        }
                                        spannableStringBuilder.append((CharSequence) k96.I(Math.max(i3, this.F3), "LiveStoryWatching"));
                                        charSequence2 = spannableStringBuilder;
                                    } else if (storyItem20.date == -1) {
                                        charSequence2 = k96.L0(2131752632);
                                    } else {
                                        i2 = 2;
                                        if (x28Var8.g() != null) {
                                            f3b g = this.E1.g();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            j = 0;
                                            SpannableString spannableString2 = new SpannableString("r");
                                            spannableString2.setSpan(new cm2(R.drawable.mini_repost_story), 0, spannableString2.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                            if (g.b != null) {
                                                ec0 ec0Var = new ec0(15.0f, this.s2, this.e1.c[0]);
                                                SpannableString spannableString3 = new SpannableString("a");
                                                spannableString3.setSpan(ec0Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString3).append((CharSequence) " ");
                                                long longValue = g.b.longValue();
                                                int i13 = this.s2;
                                                if (longValue > 0) {
                                                    TLRPC.User V12 = na7.q1(i13).V1(g.b);
                                                    ec0Var.e(V12);
                                                    spannableStringBuilder2.append((CharSequence) l7c.q(V12));
                                                } else {
                                                    TLRPC.Chat K03 = na7.q1(i13).K0(Long.valueOf(-g.b.longValue()));
                                                    ec0Var.b(K03);
                                                    if (K03 != null) {
                                                        spannableStringBuilder2.append((CharSequence) K03.title);
                                                    }
                                                }
                                            } else {
                                                String str5 = this.E1.a.fwd_from.from_name;
                                                if (str5 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str5);
                                                }
                                            }
                                            this.e1.setOnSubtitleClick(new v16(this, g, (byte) 13));
                                            SpannableString spannableString4 = new SpannableString(".");
                                            wo3 wo3Var = new wo3();
                                            wo3Var.b = gl.L(1.5f);
                                            wo3Var.c = 5.0f;
                                            spannableString4.setSpan(wo3Var, 0, spannableString4.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString4).append((CharSequence) " ").append((CharSequence) k96.P(this.E1.a.date));
                                            charSequence = spannableStringBuilder2;
                                            z22 = false;
                                            b = 4;
                                        } else {
                                            j = 0;
                                            if (!this.u1 || (storyItem6 = this.E1.a) == null || storyItem6.from_id == null) {
                                                b = 4;
                                                String X = k96.X(this.E1.a.date);
                                                String str6 = X;
                                                if (this.E1.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X);
                                                    wo3 wo3Var2 = new wo3();
                                                    wo3Var2.b = gl.L(1.5f);
                                                    wo3Var2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(wo3Var2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) k96.L0(2131751198));
                                                    str6 = valueOf;
                                                }
                                                charSequence = str6;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                ec0 ec0Var2 = new ec0(15.0f, this.s2, this.e1.c[0]);
                                                SpannableString spannableString5 = new SpannableString("a");
                                                spannableString5.setSpan(ec0Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString5).append((CharSequence) " ");
                                                long n = cf3.n(this.E1.a.from_id);
                                                int i14 = this.s2;
                                                if (n > 0) {
                                                    TLRPC.User V13 = na7.q1(i14).V1(Long.valueOf(n));
                                                    ec0Var2.e(V13);
                                                    spannableStringBuilder3.append((CharSequence) l7c.q(V13));
                                                } else {
                                                    TLRPC.Chat K04 = na7.q1(i14).K0(Long.valueOf(-n));
                                                    ec0Var2.b(K04);
                                                    if (K04 != null) {
                                                        spannableStringBuilder3.append((CharSequence) K04.title);
                                                    }
                                                }
                                                b = 4;
                                                this.e1.setOnSubtitleClick(new ly(this, n, b));
                                                SpannableString spannableString6 = new SpannableString(".");
                                                wo3 wo3Var3 = new wo3();
                                                wo3Var3.b = gl.L(1.5f);
                                                wo3Var3.c = 5.0f;
                                                spannableString6.setSpan(wo3Var3, 0, spannableString6.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString6).append((CharSequence) " ").append((CharSequence) k96.P(this.E1.a.date));
                                                charSequence = spannableStringBuilder3;
                                                z22 = false;
                                            }
                                        }
                                    }
                                    if (charSequence != null) {
                                    }
                                    je5Var = this.v0;
                                    if (je5Var != null) {
                                    }
                                    je5Var2 = this.w0;
                                    if (je5Var2 != null) {
                                    }
                                }
                            }
                            j = 0;
                            charSequence = charSequence2;
                            b = 4;
                            i2 = 2;
                            if (charSequence != null) {
                            }
                            je5Var = this.v0;
                            if (je5Var != null) {
                            }
                            je5Var2 = this.w0;
                            if (je5Var2 != null) {
                            }
                        } else {
                            j = 0;
                            b = 4;
                            i2 = 2;
                        }
                        x28 x28Var9 = this.E1;
                        storyItem8 = x28Var9.a;
                        if (storyItem12 == storyItem8 && f2bVar8 == x28Var9.b) {
                        }
                        this.E1.l();
                        x28Var = this.E1;
                        if ((!x28Var.g || storyItem12 != x28Var.a) && (t28Var = this.G1) != null) {
                            m8b m8bVar10 = ((d8b) t28Var).d;
                            m8bVar10.Z0 = false;
                            m8bVar10.U();
                        }
                        x28 x28Var10 = this.E1;
                        z8 = (x28Var10.f || (m8bVar2 = this.z0) == null || (t76Var3 = m8bVar2.B0) == null || !x28Var10.i(t76Var3.j()) || !this.z0.B0.e()) ? false : true;
                        if (z8 != this.w1) {
                            this.w1 = z8;
                            if (z8) {
                                p0();
                            }
                            if (this.W1 != null && (this.v1 || this.w1)) {
                                e1();
                            }
                            q18 q18Var5 = this.R1;
                            if (q18Var5 != null) {
                                q18Var5.setEnabled((!this.v1 || this.E1.f) && !this.w1);
                                z12 = true;
                                this.R1.v2(true);
                            } else {
                                z12 = true;
                            }
                            h0(z12);
                        }
                        linearLayout = this.W1;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(((!this.v1 || this.E1.f) && !this.w1) ? 8 : 0);
                        }
                        if (this.S2) {
                            t0();
                            q0();
                            this.Q2.setVisibility(0);
                            this.R2.setVisibility(0);
                            this.K2 = false;
                            this.J2 = false;
                            this.I2 = false;
                            q18 q18Var6 = this.R1;
                            if (q18Var6 != null) {
                                q18Var6.setVisibility(8);
                            }
                            y18 y18Var = this.M1;
                            if (y18Var != null) {
                                y18Var.setVisibility(8);
                            }
                            LinearLayout linearLayout2 = this.E0;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat K05 = this.r1 < j ? na7.q1(this.s2).K0(Long.valueOf(-this.r1)) : null;
                            if (this.E1.f) {
                                if (this.R1 == null) {
                                    l0();
                                }
                                k0();
                                o0();
                                n0();
                                b2 = 0;
                                this.R1.setVisibility(0);
                            } else {
                                if ((l7c.B(this.r1) || A0()) && (q18Var2 = this.R1) != null) {
                                    q18Var2.setVisibility(8);
                                } else if (!this.s1 && ((!this.t1 || (this.u1 && (hc2.q(K05) || hc2.s0(K05)))) && (q18Var3 = this.R1) != null)) {
                                    b2 = 0;
                                    q18Var3.setVisibility(0);
                                }
                                b2 = 0;
                            }
                            q18 q18Var7 = this.R1;
                            if (q18Var7 != null) {
                                q18Var7.setOnSendButtonLongClick(this.E1.f ? new d18(this, b2) : null);
                                q18 q18Var8 = this.R1;
                                boolean z24 = this.E1.f;
                                v0(true);
                                q18Var8.J1(z24);
                                this.R1.Q1(this.E1.f && !v0(true) && (this.l2 || this.R1.X0), true);
                            }
                            if (this.v1 && this.W1 == null) {
                                p0();
                            }
                            if (this.W1 != null) {
                                if (this.v1 || this.w1) {
                                    e1();
                                }
                                this.W1.setVisibility(((!this.v1 || this.E1.f) && !this.w1) ? 8 : 0);
                            }
                            q18 q18Var9 = this.R1;
                            if (q18Var9 != null) {
                                q18Var9.setEnabled((!this.v1 || this.E1.f) && !this.w1);
                            }
                            y18 y18Var2 = this.M1;
                            if (y18Var2 != null) {
                                y18Var2.setVisibility((!this.s1 || this.E1.f) ? 8 : 0);
                            }
                            FrameLayout frameLayout = this.Q2;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (l7c.B(this.r1)) {
                                q0();
                                this.R2.setVisibility(0);
                            } else {
                                wb wbVar = this.R2;
                                if (wbVar != null) {
                                    wbVar.setVisibility(8);
                                }
                            }
                            LinearLayout linearLayout3 = this.E0;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(A0() ? 8 : 0);
                            }
                        }
                        dz1Var = this.S1;
                        if (dz1Var != null) {
                            q18 q18Var10 = this.R1;
                            dz1Var.setVisibility((q18Var10 == null || q18Var10.getVisibility() != 0 || this.E1.f) ? 8 : 0);
                        }
                        jm2Var = this.N1;
                        if (jm2Var != null) {
                            jm2Var.setVisibility((this.S2 || !this.E1.f) ? 8 : 0);
                            this.N1.a(this.B0.g0, false);
                            this.N1.setCount(this.B0.getUnreadMessagesCount());
                        }
                        kh7Var = this.Q1;
                        if (kh7Var != null) {
                            if (!this.S2) {
                                x28 x28Var11 = this.E1;
                                if (x28Var11.f && (t76Var2 = t76.N) != null && x28Var11.i(t76Var2.j())) {
                                    i6 = 0;
                                    kh7Var.setVisibility(i6);
                                    kh7 kh7Var2 = this.Q1;
                                    t76 t76Var5 = t76.N;
                                    kh7Var2.b(t76Var5 == null && t76Var5.r(), true);
                                    kh7 kh7Var3 = this.Q1;
                                    t76 t76Var6 = t76.N;
                                    kh7Var3.a(t76Var6 != null || t76Var6.G, true);
                                }
                            }
                            i6 = 8;
                            kh7Var.setVisibility(i6);
                            kh7 kh7Var22 = this.Q1;
                            t76 t76Var52 = t76.N;
                            kh7Var22.b(t76Var52 == null && t76Var52.r(), true);
                            kh7 kh7Var32 = this.Q1;
                            t76 t76Var62 = t76.N;
                            kh7Var32.a(t76Var62 != null || t76Var62.G, true);
                        }
                        if (this.P1 != null) {
                            this.O1.setVisibility((this.S2 || !this.E1.f) ? 8 : 0);
                            this.P1.setVisibility((this.S2 || !this.E1.f) ? 8 : 0);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P1.getLayoutParams();
                            kh7 kh7Var4 = this.Q1;
                            int L = gl.L((kh7Var4 == null || kh7Var4.getVisibility() != 0) ? 7.0f : 54.0f);
                            if (layoutParams.rightMargin != L) {
                                layoutParams.rightMargin = L;
                                this.P1.setLayoutParams(layoutParams);
                            }
                        }
                        x28Var2 = this.E1;
                        if (!x28Var2.f || ((x28Var2.h == null && x28Var2.g() == null && this.E1.e() == null) || this.S2)) {
                            if (this.A1) {
                                m8b m8bVar11 = ((d8b) this.G1).d;
                                m8bVar11.L0 = false;
                                m8bVar11.U();
                                t28 t28Var2 = this.G1;
                                this.Z2 = false;
                                ((d8b) t28Var2).e();
                            }
                            this.A0.setVisibility(8);
                        } else {
                            j3b j3bVar = this.A0.b0;
                            x28 x28Var12 = this.E1;
                            CharSequence charSequence3 = x28Var12.h;
                            f3b g2 = x28Var12.g();
                            f3b e = this.E1.e();
                            if (this.z0.Z0) {
                                x28 x28Var13 = this.E1;
                                if (!x28Var13.g && (storyItem11 = x28Var13.a) != null && storyItem11.translated) {
                                    z11 = true;
                                    j3bVar.b(charSequence3, g2, e, z11, storyItem12 != this.E1.a);
                                    this.A0.setVisibility(0);
                                }
                            }
                            z11 = false;
                            j3bVar.b(charSequence3, g2, e, z11, storyItem12 != this.E1.a);
                            this.A0.setVisibility(0);
                        }
                        storyItem9 = this.E1.a;
                        if (storyItem9 != null) {
                            TLRPC.MessageMedia messageMedia8 = storyItem9.media;
                            if (messageMedia8 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (this.B0.q(this.r1, ((TLRPC.TL_messageMediaVideoStream) messageMedia8).call)) {
                                    this.B0.p(false, false);
                                    this.A3 = j;
                                    q18 q18Var11 = this.R1;
                                    if (q18Var11 != null) {
                                        q18Var11.N(true);
                                        this.R1.x2();
                                        h0(true);
                                    }
                                }
                                this.B0.setVisibility(0);
                                this.S0.invalidate();
                                if (this.G1 != null && C0()) {
                                    ((d8b) this.G1).a(this.z1, this.r1);
                                }
                                z9 = this.t1;
                                ImageView imageView3 = this.D0;
                                boolean z25 = this.I2;
                                if (z9) {
                                    if (z25 && !this.E1.f) {
                                        b = 0;
                                    }
                                    imageView3.setVisibility(b);
                                    y18 y18Var3 = this.F0;
                                    if (y18Var3 != null) {
                                        y18Var3.setVisibility(8);
                                    }
                                    this.t0.setVisibility((this.s1 || this.E1.f) ? 8 : 0);
                                    this.t0.getLayoutParams().width = gl.L(40.0f);
                                } else {
                                    if (z25 && !this.E1.f) {
                                        b = 0;
                                    }
                                    imageView3.setVisibility(b);
                                    y18 y18Var4 = this.F0;
                                    if (y18Var4 != null) {
                                        y18Var4.setVisibility((!this.J2 || this.E1.f) ? 8 : 0);
                                    }
                                    this.t0.setVisibility((this.L1 || this.E1.f) ? 8 : 0);
                                }
                                this.t0.requestLayout();
                                this.z0.e1.append(this.r1, i);
                                if (this.A1) {
                                    L0(0L);
                                    d1();
                                    this.U0.b();
                                }
                                this.B0.setLivePlayer(this.z0.B0);
                                this.B1 = 0;
                                if (this.z0.O0 != null && (storyItem10 = this.E1.a) != null) {
                                    int i15 = storyItem10.id;
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < this.z0.O0.i.size()) {
                                            k27 k27Var = (k27) this.z0.O0.i.get(i5);
                                            if (k27Var != null && k27Var.e1() == i15) {
                                                this.B1 = i5;
                                                break;
                                            }
                                            i5++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                int i16 = this.z1;
                                this.C1 = i16;
                                int i17 = this.q1;
                                this.D1 = i17;
                                if (this.z0.R0) {
                                    this.C1 = (i17 - 1) - i16;
                                }
                                z10 = this.E1.e;
                                a6 a6Var = this.o0;
                                if (z10) {
                                    a6Var.setVisibility(8);
                                } else {
                                    a6Var.setVisibility(0);
                                    this.U2 = this.E1.h() ? 1.0f : 0.5f;
                                    boolean h = this.E1.h();
                                    ry8 ry8Var = this.p0;
                                    if (h) {
                                        ry8Var.setVisibility(0);
                                        this.q0.setVisibility(8);
                                        a6 a6Var2 = this.o0;
                                        this.z0.getClass();
                                        a6Var2.setContentDescription(k96.L0(!m8b.D1 ? 2131748122 : 2131743610));
                                    } else {
                                        ry8Var.setVisibility(8);
                                        this.q0.setVisibility(0);
                                        this.o0.setContentDescription(k96.L0(2131747959));
                                    }
                                    this.o0.setAlpha((1.0f - this.T3) * this.U2);
                                }
                                x28 x28Var14 = this.E1;
                                f2bVar5 = x28Var14.b;
                                if (f2bVar5 == null) {
                                    this.s0.a(this.s1, f2bVar5, z21 && this.R3);
                                } else {
                                    TL_stories.StoryItem storyItem21 = x28Var14.a;
                                    z5b z5bVar = this.s0;
                                    boolean z26 = this.s1;
                                    if (storyItem21 != null) {
                                        z5bVar.b(z26, storyItem21, z21 && this.R3);
                                    } else {
                                        z5bVar.b(z26, null, z21 && this.R3);
                                    }
                                }
                                this.R3 = false;
                                this.s0.setTranslationX(this.o0.getVisibility() != 0 ? -gl.L(44.0f) : 0.0f);
                                if (z7) {
                                    this.g3 = false;
                                    TL_stories.StoryItem storyItem22 = this.E1.a;
                                    if (storyItem22 == null || (reaction = storyItem22.sent_reaction) == null) {
                                        this.u0.setReaction(null);
                                    } else {
                                        this.u0.setReaction(h19.d(reaction));
                                    }
                                }
                                f2bVar6 = this.E1.b;
                                if (f2bVar6 == null && f2bVar6.J) {
                                    m0();
                                    this.Z1.set(this.E1.b.c.x);
                                    this.Z1.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.a2;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.a2 = null;
                                    }
                                    g4b g4bVar = this.Z1;
                                    if (z21) {
                                        ViewPropertyAnimator interpolator = g4bVar.animate().alpha(1.0f).setDuration(180L).setInterpolator(s33.h);
                                        this.a2 = interpolator;
                                        interpolator.start();
                                    } else {
                                        g4bVar.setAlpha(1.0f);
                                    }
                                } else if (this.Z1 != null) {
                                    ViewPropertyAnimator viewPropertyAnimator2 = this.a2;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                        this.a2 = null;
                                    }
                                    if (z21 && this.Z1.getVisibility() == 0) {
                                        ViewPropertyAnimator withEndAction = this.Z1.animate().alpha(0.0f).setDuration(180L).setInterpolator(s33.h).withEndAction(new e18(this, (byte) 0));
                                        this.a2 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.Z1.setAlpha(0.0f);
                                        this.Z1.setVisibility(8);
                                    }
                                }
                                w28 w28Var = this.n1;
                                this.z0.getClass();
                                w28Var.a(m8b.D1, false);
                                if (this.A1 && this.E1.a != null) {
                                    fa4.b("StoryViewer displayed story dialogId=" + this.r1 + " storyId=" + this.E1.a.id + " " + this.E1.d());
                                }
                                if (this.s1) {
                                    g0a.d(this.s2, this.r1, this.E1.a);
                                }
                                df0 df0Var = this.e1.b;
                                y1b y1bVar3 = this.z0.O0;
                                df0Var.setPadding(0, 0, (y1bVar3 != null || y1bVar3.g() == this.D1) ? 0 : gl.L(56.0f), 0);
                                na7.q1(this.s2).i4.k(this.E1.a);
                                if (!z && !this.s1 && this.p3 == null && !gba.S && gba.T) {
                                    e18 e18Var = new e18(this, (byte) 1);
                                    this.p3 = e18Var;
                                    gl.e3(e18Var, 500L);
                                }
                                je5Var3 = this.w0;
                                if ((je5Var3 != null || !je5Var3.W) && this.E1.h()) {
                                    this.z0.getClass();
                                    if (m8b.D1) {
                                        i4 = 0;
                                        if (na7.c1().getInt("taptostorysoundhint", 0) < i2) {
                                            gl.r(this.G3);
                                            gl.e3(this.G3, 250L);
                                        }
                                        imageView = this.m0;
                                        if (imageView != null) {
                                            imageView.setVisibility((!A0() || B0() || ((x28Var3 = this.E1) != null && x28Var3.e)) ? i4 : 8);
                                        }
                                        imageView2 = this.n0;
                                        if (imageView2 != null) {
                                            imageView2.setVisibility((!this.E1.f || this.s0.f) ? 8 : i4);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i4 = 0;
                                imageView = this.m0;
                                if (imageView != null) {
                                }
                                imageView2 = this.n0;
                                if (imageView2 != null) {
                                }
                            }
                        }
                        this.B0.q(this.r1, null);
                        this.B0.setVisibility(8);
                        this.S0.invalidate();
                        if (this.G1 != null) {
                            ((d8b) this.G1).a(this.z1, this.r1);
                        }
                        z9 = this.t1;
                        ImageView imageView32 = this.D0;
                        boolean z252 = this.I2;
                        if (z9) {
                        }
                        this.t0.requestLayout();
                        this.z0.e1.append(this.r1, i);
                        if (this.A1) {
                        }
                        this.B0.setLivePlayer(this.z0.B0);
                        this.B1 = 0;
                        if (this.z0.O0 != null) {
                            int i152 = storyItem10.id;
                            i5 = 0;
                            while (true) {
                                if (i5 < this.z0.O0.i.size()) {
                                }
                                i5++;
                            }
                        }
                        int i162 = this.z1;
                        this.C1 = i162;
                        int i172 = this.q1;
                        this.D1 = i172;
                        if (this.z0.R0) {
                        }
                        z10 = this.E1.e;
                        a6 a6Var3 = this.o0;
                        if (z10) {
                        }
                        x28 x28Var142 = this.E1;
                        f2bVar5 = x28Var142.b;
                        if (f2bVar5 == null) {
                        }
                        this.R3 = false;
                        this.s0.setTranslationX(this.o0.getVisibility() != 0 ? -gl.L(44.0f) : 0.0f);
                        if (z7) {
                        }
                        f2bVar6 = this.E1.b;
                        if (f2bVar6 == null) {
                        }
                        if (this.Z1 != null) {
                        }
                        w28 w28Var2 = this.n1;
                        this.z0.getClass();
                        w28Var2.a(m8b.D1, false);
                        if (this.A1) {
                            fa4.b("StoryViewer displayed story dialogId=" + this.r1 + " storyId=" + this.E1.a.id + " " + this.E1.d());
                        }
                        if (this.s1) {
                        }
                        df0 df0Var2 = this.e1.b;
                        y1b y1bVar32 = this.z0.O0;
                        df0Var2.setPadding(0, 0, (y1bVar32 != null || y1bVar32.g() == this.D1) ? 0 : gl.L(56.0f), 0);
                        na7.q1(this.s2).i4.k(this.E1.a);
                        if (!z) {
                            e18 e18Var2 = new e18(this, (byte) 1);
                            this.p3 = e18Var2;
                            gl.e3(e18Var2, 500L);
                        }
                        je5Var3 = this.w0;
                        if (je5Var3 != null) {
                        }
                        this.z0.getClass();
                        if (m8b.D1) {
                        }
                        i4 = 0;
                        imageView = this.m0;
                        if (imageView != null) {
                        }
                        imageView2 = this.n0;
                        if (imageView2 != null) {
                        }
                    }
                }
                z7 = false;
                if (f2bVar8 != null) {
                }
                q18Var = this.R1;
                if (q18Var != null) {
                }
                if (this.E1.f) {
                }
                this.a1.c();
                this.M0 = 0L;
                this.O0 = false;
                f2bVar3 = this.E1.b;
                if (f2bVar3 != null) {
                }
                d28 d28Var2 = this.S0;
                m21Var = m21.w;
                if (m21Var != null) {
                    m21Var.b();
                }
                this.A0.J();
                g0();
                z7 = true;
                if (z7) {
                }
                this.e1.setOnSubtitleClick(null);
                this.F3 = 0;
                R0(this.r1, false, this.E1.f);
                f2bVar4 = this.E1.b;
                if (f2bVar4 != null) {
                }
                j = 0;
                charSequence = charSequence2;
                b = 4;
                i2 = 2;
                if (charSequence != null) {
                }
                je5Var = this.v0;
                if (je5Var != null) {
                }
                je5Var2 = this.w0;
                if (je5Var2 != null) {
                }
                x28 x28Var92 = this.E1;
                storyItem8 = x28Var92.a;
                if (storyItem12 == storyItem8) {
                }
                this.E1.l();
                x28Var = this.E1;
                if (!x28Var.g) {
                }
                m8b m8bVar102 = ((d8b) t28Var).d;
                m8bVar102.Z0 = false;
                m8bVar102.U();
                x28 x28Var102 = this.E1;
                if (x28Var102.f) {
                }
                if (z8 != this.w1) {
                }
                linearLayout = this.W1;
                if (linearLayout != null) {
                }
                if (this.S2) {
                }
                dz1Var = this.S1;
                if (dz1Var != null) {
                }
                jm2Var = this.N1;
                if (jm2Var != null) {
                }
                kh7Var = this.Q1;
                if (kh7Var != null) {
                }
                if (this.P1 != null) {
                }
                x28Var2 = this.E1;
                if (x28Var2.f) {
                }
                if (this.A1) {
                }
                this.A0.setVisibility(8);
                storyItem9 = this.E1.a;
                if (storyItem9 != null) {
                }
                this.B0.q(this.r1, null);
                this.B0.setVisibility(8);
                this.S0.invalidate();
                if (this.G1 != null) {
                }
                z9 = this.t1;
                ImageView imageView322 = this.D0;
                boolean z2522 = this.I2;
                if (z9) {
                }
                this.t0.requestLayout();
                this.z0.e1.append(this.r1, i);
                if (this.A1) {
                }
                this.B0.setLivePlayer(this.z0.B0);
                this.B1 = 0;
                if (this.z0.O0 != null) {
                }
                int i1622 = this.z1;
                this.C1 = i1622;
                int i1722 = this.q1;
                this.D1 = i1722;
                if (this.z0.R0) {
                }
                z10 = this.E1.e;
                a6 a6Var32 = this.o0;
                if (z10) {
                }
                x28 x28Var1422 = this.E1;
                f2bVar5 = x28Var1422.b;
                if (f2bVar5 == null) {
                }
                this.R3 = false;
                this.s0.setTranslationX(this.o0.getVisibility() != 0 ? -gl.L(44.0f) : 0.0f);
                if (z7) {
                }
                f2bVar6 = this.E1.b;
                if (f2bVar6 == null) {
                }
                if (this.Z1 != null) {
                }
                w28 w28Var22 = this.n1;
                this.z0.getClass();
                w28Var22.a(m8b.D1, false);
                if (this.A1) {
                }
                if (this.s1) {
                }
                df0 df0Var22 = this.e1.b;
                y1b y1bVar322 = this.z0.O0;
                df0Var22.setPadding(0, 0, (y1bVar322 != null || y1bVar322.g() == this.D1) ? 0 : gl.L(56.0f), 0);
                na7.q1(this.s2).i4.k(this.E1.a);
                if (!z) {
                }
                je5Var3 = this.w0;
                if (je5Var3 != null) {
                }
                this.z0.getClass();
                if (m8b.D1) {
                }
                i4 = 0;
                imageView = this.m0;
                if (imageView != null) {
                }
                imageView2 = this.n0;
                if (imageView2 != null) {
                }
            }
        }
        z6 = z3;
        storyItem4 = this.E1.a;
        if (storyItem4 != null) {
            this.z0.P0 = storyItem4.id;
        }
        this.z0.o0.A();
        this.O2 = true;
        if (!this.s1) {
        }
        i1(false);
        x28 x28Var72 = this.E1;
        TL_stories.StoryItem storyItem172 = x28Var72.a;
        f2b f2bVar92 = x28Var72.b;
        if ((storyItem172 == null ? storyItem172.id : (f2bVar92 == null || (f4bVar = f2bVar92.c) == null) ? 0 : f4bVar.f) == (storyItem12 == null ? storyItem12.id : (f2bVar8 == null || (f4bVar2 = f2bVar8.c) == null) ? 0 : f4bVar2.f)) {
        }
        if (z21) {
        }
        m8bVar = this.z0;
        if (m8bVar != null) {
            i7 = this.F3;
            groupCall = t76Var4.s;
            if (i7 != Math.max(1, groupCall != null ? 0 : groupCall.participants_count)) {
            }
        }
        z7 = false;
        if (f2bVar8 != null) {
        }
        q18Var = this.R1;
        if (q18Var != null) {
        }
        if (this.E1.f) {
        }
        this.a1.c();
        this.M0 = 0L;
        this.O0 = false;
        f2bVar3 = this.E1.b;
        if (f2bVar3 != null) {
        }
        d28 d28Var22 = this.S0;
        m21Var = m21.w;
        if (m21Var != null) {
        }
        this.A0.J();
        g0();
        z7 = true;
        if (z7) {
        }
        this.e1.setOnSubtitleClick(null);
        this.F3 = 0;
        R0(this.r1, false, this.E1.f);
        f2bVar4 = this.E1.b;
        if (f2bVar4 != null) {
        }
        j = 0;
        charSequence = charSequence2;
        b = 4;
        i2 = 2;
        if (charSequence != null) {
        }
        je5Var = this.v0;
        if (je5Var != null) {
        }
        je5Var2 = this.w0;
        if (je5Var2 != null) {
        }
        x28 x28Var922 = this.E1;
        storyItem8 = x28Var922.a;
        if (storyItem12 == storyItem8) {
        }
        this.E1.l();
        x28Var = this.E1;
        if (!x28Var.g) {
        }
        m8b m8bVar1022 = ((d8b) t28Var).d;
        m8bVar1022.Z0 = false;
        m8bVar1022.U();
        x28 x28Var1022 = this.E1;
        if (x28Var1022.f) {
        }
        if (z8 != this.w1) {
        }
        linearLayout = this.W1;
        if (linearLayout != null) {
        }
        if (this.S2) {
        }
        dz1Var = this.S1;
        if (dz1Var != null) {
        }
        jm2Var = this.N1;
        if (jm2Var != null) {
        }
        kh7Var = this.Q1;
        if (kh7Var != null) {
        }
        if (this.P1 != null) {
        }
        x28Var2 = this.E1;
        if (x28Var2.f) {
        }
        if (this.A1) {
        }
        this.A0.setVisibility(8);
        storyItem9 = this.E1.a;
        if (storyItem9 != null) {
        }
        this.B0.q(this.r1, null);
        this.B0.setVisibility(8);
        this.S0.invalidate();
        if (this.G1 != null) {
        }
        z9 = this.t1;
        ImageView imageView3222 = this.D0;
        boolean z25222 = this.I2;
        if (z9) {
        }
        this.t0.requestLayout();
        this.z0.e1.append(this.r1, i);
        if (this.A1) {
        }
        this.B0.setLivePlayer(this.z0.B0);
        this.B1 = 0;
        if (this.z0.O0 != null) {
        }
        int i16222 = this.z1;
        this.C1 = i16222;
        int i17222 = this.q1;
        this.D1 = i17222;
        if (this.z0.R0) {
        }
        z10 = this.E1.e;
        a6 a6Var322 = this.o0;
        if (z10) {
        }
        x28 x28Var14222 = this.E1;
        f2bVar5 = x28Var14222.b;
        if (f2bVar5 == null) {
        }
        this.R3 = false;
        this.s0.setTranslationX(this.o0.getVisibility() != 0 ? -gl.L(44.0f) : 0.0f);
        if (z7) {
        }
        f2bVar6 = this.E1.b;
        if (f2bVar6 == null) {
        }
        if (this.Z1 != null) {
        }
        w28 w28Var222 = this.n1;
        this.z0.getClass();
        w28Var222.a(m8b.D1, false);
        if (this.A1) {
        }
        if (this.s1) {
        }
        df0 df0Var222 = this.e1.b;
        y1b y1bVar3222 = this.z0.O0;
        df0Var222.setPadding(0, 0, (y1bVar3222 != null || y1bVar3222.g() == this.D1) ? 0 : gl.L(56.0f), 0);
        na7.q1(this.s2).i4.k(this.E1.a);
        if (!z) {
        }
        je5Var3 = this.w0;
        if (je5Var3 != null) {
        }
        this.z0.getClass();
        if (m8b.D1) {
        }
        i4 = 0;
        imageView = this.m0;
        if (imageView != null) {
        }
        imageView2 = this.n0;
        if (imageView2 != null) {
        }
    }

    public final void d0(Runnable runnable) {
        if (na7.q1(this.s2).t2()) {
            h5.b(this.s2);
            return;
        }
        int i = gba.b0;
        if (i <= 0 || !this.a3) {
            runnable.run();
            return;
        }
        int i2 = i - 1;
        gba.b0 = i2;
        gba.Q(i2);
        hd hdVar = new hd(0, this.r0, getContext());
        hdVar.setTitle(k96.M0(2131744648, null));
        hdVar.m(k96.M0(2131744649, null));
        String M0 = k96.M0(2131746552, null);
        ce ceVar = new ce(runnable, (byte) 15);
        hdVar.m0 = M0;
        hdVar.n0 = ceVar;
        String M02 = k96.M0(2131752577, null);
        fi7 fi7Var = new fi7((byte) 25);
        hdVar.o0 = M02;
        hdVar.p0 = fi7Var;
        hdVar.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1() {
        ArrayList arrayList;
        int i;
        ImageReceiver imageReceiver;
        boolean isEmpty;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i2;
        String str;
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        int i3;
        String str2;
        TL_stories.StoryItem storyItem2;
        int i4;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String sb;
        int max = (int) (Math.max(gl.b1().x, gl.b1().y) / gl.p);
        String m = tb4.m(max, max, "_");
        ArrayList arrayList11 = this.H3;
        arrayList11.clear();
        ArrayList arrayList12 = this.I3;
        arrayList12.clear();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList = this.X0;
            if (i6 >= arrayList.size()) {
                break;
            }
            ((b09) arrayList.get(i6)).b(false);
            i6++;
        }
        arrayList.clear();
        int i7 = 0;
        while (i7 < 2) {
            int i8 = this.z1;
            if (i7 == 0) {
                i = i8 - 1;
                imageReceiver = this.V0;
                if (i < 0) {
                    imageReceiver.f();
                    int i9 = i5;
                    arrayList7 = arrayList11;
                    i4 = i9;
                    arrayList9 = arrayList;
                    arrayList8 = arrayList12;
                    i7++;
                    ArrayList arrayList13 = arrayList7;
                    i5 = i4;
                    arrayList11 = arrayList13;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                }
                ArrayList arrayList14 = this.m1;
                isEmpty = arrayList14.isEmpty();
                arrayList2 = this.l1;
                if (isEmpty && i >= arrayList2.size()) {
                    Q0((f2b) arrayList14.get(i - arrayList2.size()), imageReceiver, m);
                } else if (!arrayList2.isEmpty()) {
                    if (i < 0) {
                        i = i5;
                    }
                    if (i >= arrayList2.size()) {
                        i = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList2.get(i);
                    long j = this.r1;
                    storyItem3.dialogId = j;
                    f2b s = this.I1.s(j, storyItem3);
                    if (s != null) {
                        Q0(s, imageReceiver, m);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        i4 = i5;
                        arrayList5 = arrayList;
                        i2 = i7;
                        str = null;
                        storyItem = storyItem3;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        int i10 = (messageMedia == null || !k27.J4(messageMedia.getDocument())) ? i5 : 1;
                        String str3 = storyItem3.attachPath;
                        TLRPC.MessageMedia messageMedia2 = storyItem3.media;
                        int i11 = i10;
                        if (str3 != null) {
                            if (messageMedia2 == null) {
                                i11 = str3.toLowerCase().endsWith(".mp4");
                            }
                            String str4 = storyItem3.attachPath;
                            if (i11 != 0) {
                                str2 = null;
                                arrayList3 = arrayList11;
                                i2 = i7;
                                arrayList4 = arrayList12;
                                storyItem2 = storyItem3;
                                arrayList5 = arrayList;
                                i3 = i5;
                                imageReceiver.Y(gl5.g(str4), m.concat("_pframe"), gl5.g(storyItem3.firstFramePath), m, null, null, null, 0L, null, null, 0);
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                i3 = i5;
                                arrayList5 = arrayList;
                                i2 = i7;
                                str2 = null;
                                storyItem2 = storyItem3;
                                String str5 = m;
                                imageReceiver.Z(gl5.g(str4), str5, null, null, null, 0L, null, null, 0);
                                m = str5;
                            }
                            str = str2;
                            storyItem = storyItem2;
                            i4 = i3;
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            boolean z = i5;
                            arrayList5 = arrayList;
                            i2 = i7;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (i10 != 0) {
                                TLRPC.PhotoSize w = ba4.w(messageMedia2.getDocument().thumbs, 1000, z, null, z);
                                gl5 b = gl5.b(g2b.B(this.s2, storyItem3));
                                String concat = m.concat("_pframe");
                                gl5 c = gl5.c(w, storyItem3.media.getDocument());
                                storyItem = storyItem3;
                                str = null;
                                imageReceiver2.Y(b, concat, c, m, null, null, null, 0L, null, storyItem, 0);
                                i4 = z;
                            } else {
                                str = null;
                                storyItem = storyItem3;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.f();
                                    i4 = z;
                                } else {
                                    TLRPC.PhotoSize w2 = ba4.w(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID, z, null, z);
                                    ba4.u(800, photo.sizes);
                                    imageReceiver2.Y(null, null, gl5.i(w2, photo), m, null, null, null, 0L, null, storyItem, 0);
                                    i4 = z;
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (messageMedia3 == null || !k27.J4(messageMedia3.getDocument())) {
                        arrayList7 = arrayList3;
                        i7 = i2;
                        arrayList8 = arrayList4;
                    } else {
                        TLRPC.Document B = g2b.B(this.s2, storyItem);
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = ba4.G(this.s2).F(storyItem);
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("?account=");
                            sb2.append(this.s2);
                            sb2.append("&id=");
                            sb2.append(B.id);
                            sb2.append("&hash=");
                            sb2.append(B.access_hash);
                            sb2.append("&dc=");
                            sb2.append(B.dc_id);
                            sb2.append("&size=");
                            sb2.append(B.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(B.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(storyItem.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(ba4.B(B), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = B.file_reference;
                            if (bArr == null) {
                                bArr = new byte[i4];
                            }
                            sb2.append(Utilities.f(bArr));
                            sb2.append("&sid=");
                            sb2.append(storyItem.id);
                            sb2.append("&did=");
                            sb2.append(storyItem.dialogId);
                            sb = sb2.toString();
                            arrayList7 = arrayList3;
                        } catch (UnsupportedEncodingException e) {
                            e = e;
                            arrayList7 = arrayList3;
                        }
                        try {
                            arrayList7.add(Uri.parse("tg://" + ba4.r(str, B) + sb));
                            arrayList8 = arrayList4;
                            try {
                                arrayList8.add(B);
                                i7 = i2;
                                if (i7 == 1) {
                                    try {
                                        if (yp3.d()) {
                                            ba4.G(this.s2).X(B, storyItem, 1, 1);
                                        }
                                    } catch (UnsupportedEncodingException e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        if (storyItem.media_areas != null) {
                                        }
                                        arrayList9 = arrayList5;
                                        i7++;
                                        ArrayList arrayList132 = arrayList7;
                                        i5 = i4;
                                        arrayList11 = arrayList132;
                                        arrayList12 = arrayList8;
                                        arrayList = arrayList9;
                                    }
                                }
                            } catch (UnsupportedEncodingException e3) {
                                e = e3;
                                i7 = i2;
                            }
                        } catch (UnsupportedEncodingException e4) {
                            e = e4;
                            i7 = i2;
                            arrayList8 = arrayList4;
                            e.printStackTrace();
                            if (storyItem.media_areas != null) {
                            }
                            arrayList9 = arrayList5;
                            i7++;
                            ArrayList arrayList1322 = arrayList7;
                            i5 = i4;
                            arrayList11 = arrayList1322;
                            arrayList12 = arrayList8;
                            arrayList = arrayList9;
                        }
                    }
                    if (storyItem.media_areas != null) {
                        int i12 = i4;
                        while (i12 < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(i12) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i12);
                                b09 b09Var = new b09(this);
                                b09Var.e(h19.d(tL_mediaAreaSuggestedReaction.reaction));
                                b09Var.b(this.Q0);
                                arrayList10 = arrayList5;
                                arrayList10.add(b09Var);
                            } else {
                                arrayList10 = arrayList5;
                            }
                            i12++;
                            arrayList5 = arrayList10;
                        }
                    }
                    arrayList9 = arrayList5;
                    i7++;
                    ArrayList arrayList13222 = arrayList7;
                    i5 = i4;
                    arrayList11 = arrayList13222;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                }
                int i92 = i5;
                arrayList7 = arrayList11;
                i4 = i92;
                arrayList9 = arrayList;
                arrayList8 = arrayList12;
                i7++;
                ArrayList arrayList132222 = arrayList7;
                i5 = i4;
                arrayList11 = arrayList132222;
                arrayList12 = arrayList8;
                arrayList = arrayList9;
            } else {
                i = i8 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.W0;
                if (i >= storiesCount) {
                    imageReceiver3.f();
                    int i922 = i5;
                    arrayList7 = arrayList11;
                    i4 = i922;
                    arrayList9 = arrayList;
                    arrayList8 = arrayList12;
                    i7++;
                    ArrayList arrayList1322222 = arrayList7;
                    i5 = i4;
                    arrayList11 = arrayList1322222;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                } else {
                    imageReceiver = imageReceiver3;
                    ArrayList arrayList142 = this.m1;
                    isEmpty = arrayList142.isEmpty();
                    arrayList2 = this.l1;
                    if (isEmpty) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    int i9222 = i5;
                    arrayList7 = arrayList11;
                    i4 = i9222;
                    arrayList9 = arrayList;
                    arrayList8 = arrayList12;
                    i7++;
                    ArrayList arrayList13222222 = arrayList7;
                    i5 = i4;
                    arrayList11 = arrayList13222222;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                }
            }
        }
        int i13 = i5;
        ArrayList arrayList15 = arrayList11;
        ArrayList arrayList16 = arrayList12;
        d8b d8bVar = (d8b) this.G1;
        m8b m8bVar = d8bVar.d;
        if (gba.j() && gba.b()) {
            boolean z2 = m8bVar.H0;
            ArrayList arrayList17 = m8bVar.M0;
            if (z2) {
                return;
            }
            for (int i14 = i13; i14 < arrayList17.size(); i14++) {
                for (int i15 = i13; i15 < arrayList15.size(); i15++) {
                    if (((Uri) arrayList15.get(i15)).equals(((l8b) arrayList17.get(i14)).uri)) {
                        arrayList15.remove(i15);
                    }
                }
            }
            for (int i16 = i13; i16 < arrayList15.size(); i16++) {
                Uri uri = (Uri) arrayList15.get(i16);
                l8b l8bVar = new l8b(m8bVar, m8bVar.D0, m8bVar.C0);
                l8bVar.setOnSeekUpdate(new a5b((Object) d8bVar, (Object) l8bVar, (byte) 3));
                l8bVar.uri = uri;
                TLRPC.Document document = (TLRPC.Document) arrayList16.get(i16);
                l8bVar.document = document;
                if (document != null) {
                    kb4.J.put(Long.valueOf(document.id), Integer.valueOf(i13));
                } else {
                    ConcurrentHashMap concurrentHashMap = kb4.I;
                }
                l8bVar.preparePlayer(uri, m8b.D1, m8b.B1);
                arrayList17.add(l8bVar);
                if (arrayList17.size() > 2) {
                    ((l8b) arrayList17.remove(i13)).release(null);
                }
            }
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        t76 t76Var;
        int i3 = kk7.x5;
        m8b m8bVar = this.z0;
        boolean z = false;
        if (i == i3 || (i == kk7.z5 && m8bVar.O0 == objArr[0])) {
            t28 t28Var = this.G1;
            if (t28Var == null || !((d8b) t28Var).d.H0) {
                if (this.A1) {
                    h1();
                    if (this.q1 == 0) {
                        if (this.u2) {
                            return;
                        }
                        this.u2 = true;
                        ((d8b) this.G1).j();
                        return;
                    }
                    int i4 = this.z1;
                    ArrayList arrayList = this.l1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.m1;
                    if (i4 >= arrayList2.size() + size) {
                        this.z1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    c1(false);
                    if (this.s1 || this.t1) {
                        i1(true);
                    }
                }
                TL_stories.PeerStories peerStories = m8bVar.Q0;
                if (peerStories != null) {
                    this.I1.U(peerStories, true);
                } else {
                    long j = this.r1;
                    if (j != 0) {
                        g2b g2bVar = this.I1;
                        TL_stories.PeerStories x = g2bVar.x(j);
                        if (x == null) {
                            x = g2bVar.y(j);
                            z = true;
                        }
                        g2bVar.U(x, z);
                    }
                }
                a8 a8Var = this.i1;
                if (a8Var != null) {
                    a8Var.animate().alpha((this.I1.L(this.r1) && this.E1.e && !gba.b()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.n3) {
            c1(false);
            return;
        }
        if (i == kk7.k4) {
            this.A0.b0.invalidate();
            return;
        }
        if (i == kk7.F5) {
            h0(true);
            return;
        }
        if (i == kk7.c3) {
            wx n = na7.q1(this.s2).M1().n();
            if (n == null || !n.a(this.s2, 1) || this.G1 == null) {
                return;
            }
            hu0 hu0Var = new hu0(this, (byte) 9);
            Context W = gl.W(getContext());
            if (W == null) {
                W = LaunchActivity.H1;
            }
            ((d8b) this.G1).h(new h26(n.b(), this.s2, null, W, hu0Var));
            return;
        }
        if (i == kk7.j3) {
            TL_account.RequirementToContact I2 = na7.q1(this.s2).I2(this.r1);
            boolean z2 = this.r1 >= 0 && !y6c.h(this.s2).p() && (I2 instanceof TL_account.requirementToContactPremium);
            if (this.v1 == z2 && this.x1 == cf3.j(I2)) {
                return;
            }
            this.v1 = z2;
            this.x1 = cf3.j(I2);
            c1(false);
            h0(true);
            return;
        }
        if (i == kk7.S) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.r1 == (-((TLRPC.ChatFull) obj).id)) {
                c1(false);
                return;
            }
            return;
        }
        if (i != kk7.F2) {
            if (i == kk7.E && ((Boolean) objArr[2]).booleanValue()) {
                F0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (m8bVar == null || (t76Var = m8bVar.B0) == null || t76Var.j() != longValue) {
            return;
        }
        c1(false);
        q18 q18Var = this.R1;
        if (q18Var != null) {
            q18Var.N(true);
            this.R1.v2(true);
            h0(true);
        }
        l18 l18Var = this.B0;
        if (l18Var != null) {
            t76 t76Var2 = l18Var.Q;
            if (l18Var.I != (t76Var2 != null ? t76Var2.m() : 0L)) {
                l18Var.e.O(true);
            }
        }
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        cw1 cw1Var;
        Canvas canvas2;
        gn gnVar;
        gn gnVar2;
        j1();
        if (this.t1 && (gnVar2 = this.G0) != null) {
            gnVar2.setBounds(0, 0, getMeasuredWidth(), gl.L(40.0f));
        }
        if (this.t1 && (gnVar = this.H0) != null) {
            gnVar.setBounds(0, 0, getMeasuredWidth(), gl.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z = this.k3;
        LinearLayout linearLayout = this.E0;
        y18 y18Var = this.t0;
        if (z) {
            float measuredWidth = (y18Var.getMeasuredWidth() / 2.0f) + y18Var.getX() + linearLayout.getX();
            float measuredHeight = (y18Var.getMeasuredHeight() / 2.0f) + y18Var.getY() + linearLayout.getY();
            int L = gl.L(24.0f);
            float f = L / 2.0f;
            float R1 = gl.R1(this.m3, measuredWidth - f, s33.g.getInterpolation(this.l3));
            float R12 = gl.R1(this.n3, measuredHeight - f, this.l3);
            int U1 = gl.U1(this.l3, this.o3, L);
            if (this.f3) {
                vl vlVar = this.e3;
                if (vlVar != null) {
                    float f2 = U1;
                    vlVar.setBounds((int) R1, (int) R12, (int) (R1 + f2), (int) (R12 + f2));
                    this.e3.draw(canvas);
                }
            } else {
                float f3 = U1;
                ImageReceiver imageReceiver = this.d3;
                imageReceiver.i0(R1, R12, f3, f3);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.g3) {
            float measuredWidth2 = (y18Var.getMeasuredWidth() / 2.0f) + y18Var.getX() + linearLayout.getX();
            float measuredHeight2 = (y18Var.getMeasuredHeight() / 2.0f) + y18Var.getY() + linearLayout.getY();
            int L2 = gl.L(120.0f);
            if (this.f3) {
                xl xlVar = this.c3;
                if (xlVar != null) {
                    float f4 = L2 / 2.0f;
                    xlVar.e((int) (measuredWidth2 - f4), (int) (measuredHeight2 - f4), (int) (measuredWidth2 + f4), (int) (measuredHeight2 + f4));
                    this.c3.b(canvas);
                    if (this.c3.c()) {
                        this.c3.d(this);
                        this.c3 = null;
                        this.g3 = false;
                    }
                } else {
                    this.g3 = false;
                }
            } else {
                float f5 = L2;
                float f6 = f5 / 2.0f;
                float f7 = measuredWidth2 - f6;
                float f8 = measuredHeight2 - f6;
                ImageReceiver imageReceiver2 = this.b3;
                imageReceiver2.i0(f7, f8, f5, f5);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.y() != null && imageReceiver2.y().v()) {
                    this.g3 = false;
                }
            }
        }
        q18 q18Var = this.R1;
        if (q18Var != null) {
            cw1 cw1Var2 = q18Var.o2;
            cw1 cw1Var3 = q18Var.p2;
            if (q18Var.getAlpha() == 0.0f || (cw1Var = q18Var.f1) == null || cw1Var.getParent() == null || q18Var.f1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(q18Var.f1.getX() + cw1Var2.getX() + cw1Var3.getX() + q18Var.getX(), q18Var.f1.getY() + cw1Var2.getY() + cw1Var3.getY() + q18Var.getY());
            if (q18Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, q18Var.getMeasuredWidth(), q18Var.getMeasuredHeight(), (int) (q18Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            q18Var.f1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        lx4 lx4Var;
        float L;
        if (view == this.T2) {
            canvas.save();
            canvas.clipRect(0.0f, this.T2.getY(), getMeasuredWidth(), this.T2.getY() + this.T2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        q18 q18Var = this.R1;
        Paint paint = this.d2;
        y18 y18Var = this.t0;
        w28 w28Var = this.n1;
        if (view == q18Var) {
            float f = this.g2;
            x28 x28Var = this.E1;
            if (f > 0.0f && !x28Var.f) {
                w28Var.l.setAlpha((int) (f * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), w28Var.l);
            }
            RectF rectF = w28Var.h;
            RectF rectF2 = w28Var.i;
            RectF rectF3 = w28Var.j;
            rectF.set(this.R1.getX(), this.R1.getY() + this.R1.getAnimatedTop() + gl.L(1.33f), this.R1.getX() + this.R1.getMeasuredWidth(), this.R1.getY() + this.R1.getMeasuredHeight());
            float L2 = gl.L(40.0f);
            if (x28Var.f) {
                L = gl.L(46.0f);
                L2 = gl.L(46.0f);
                kh7 kh7Var = this.Q1;
                if (kh7Var != null && kh7Var.getVisibility() == 0) {
                    L2 += gl.L(46.0f);
                }
            } else {
                if (this.I2) {
                    L2 += gl.L(46.0f);
                }
                if (this.J2 && this.t1) {
                    L2 += gl.L(46.0f);
                }
                if (y18Var != null && y18Var.getVisibility() == 0) {
                    L2 = (L2 - gl.L(40.0f)) + y18Var.getLayoutParams().width;
                }
                L = 0.0f;
            }
            rectF2.set(gl.L(10.0f) + L, ((this.R1.getY() + this.R1.getMeasuredHeight()) - gl.L(5.0f)) - gl.L(38.0f), (getMeasuredWidth() - gl.L(10.0f)) - L2, (this.R1.getY() + this.R1.getMeasuredHeight()) - gl.L(5.0f));
            this.R1.setTranslationX((1.0f - this.g2) * L);
            this.R1.getEditField().setTranslationY(tb4.A(1.0f, this.g2, -gl.L(2.0f), this.R1.getMeasuredHeight() > gl.L(50.0f) ? ((1.0f - this.g2) * (this.R1.getMeasuredHeight() - gl.L(50.0f))) + 0.0f : 0.0f));
            float L3 = gl.L(50.0f) / 2.0f;
            gl.X1(rectF2, w28Var.h, this.g2, rectF3);
            il0 il0Var = this.b2;
            if (il0Var != null) {
                il0Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                il0Var.r(L3);
                il0Var.setAlpha((int) ((1.0f - this.T3) * (1.0f - this.h2) * 255.0f * getHideInterfaceAlpha()));
                il0Var.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.g2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (q18Var != null && q18Var.R0(view)) {
                float L4 = gl.L(30.0f);
                RectF rectF4 = w28Var.k;
                RectF rectF5 = w28Var.k;
                rectF4.set(0.0f, view.getY() + gl.L(1.0f), getWidth(), gl.L(20.0f) + getHeight());
                Path path = this.Q3;
                path.rewind();
                path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                il0 il0Var2 = this.c2;
                if (il0Var2 != null) {
                    il0Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    il0Var2.s(L4, L4, L4, L4);
                    il0Var2.setAlpha(kk7.d4);
                    il0Var2.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, L4, L4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.V1 || this.R1 == null) {
                if (view == this.h3) {
                    view.setTranslationY((this.E0.getY() + (y18Var.getY() + (-(r2.getMeasuredHeight() - this.h3.getPaddingBottom())))) - gl.L(18.0f));
                } else {
                    d28 d28Var = this.S0;
                    if (view == d28Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (lx4Var = this.w3) != null && !lx4Var.r) {
                        RecordingCanvas i = lx4Var.i(getMeasuredWidth(), getMeasuredHeight());
                        i.drawColor(bm2.f(0.2f, -16777216, -1));
                        i.translate(d28Var.getX(), d28Var.getY());
                        view.draw(i);
                        lx4Var.j();
                    }
                }
            } else {
                view.setTranslationY(((this.R1.getY() + this.R1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - gl.L(18.0f));
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i) {
        this.u2 = false;
        this.L2 = true;
        this.r3 = false;
        this.t1 = false;
        this.u1 = false;
        long j = this.r1;
        v28 v28Var = this.e1;
        pb0 pb0Var = this.d1;
        if (j >= 0) {
            this.s1 = j == y6c.h(this.s2).e();
            TLRPC.User V1 = na7.q1(this.s2).V1(Long.valueOf(this.r1));
            TL_account.RequirementToContact I2 = na7.q1(this.s2).I2(this.r1);
            this.v1 = !y6c.h(this.s2).p() && (I2 instanceof TL_account.requirementToContactPremium);
            this.x1 = cf3.j(I2);
            pb0Var.q(V1);
            v28Var.a.getImageReceiver().U(V1, pb0Var, null);
            R0(this.r1, true, false);
        } else {
            this.s1 = false;
            this.t1 = true;
            if (this.I1.g(j)) {
                this.r3 = true;
            } else {
                boolean z = w01.a;
            }
            TLRPC.Chat K0 = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
            boolean V = hc2.V(K0);
            this.u1 = !V;
            if (!V && na7.q1(this.s2).L0(-this.r1) == null) {
                ad7.Y(this.s2).C0(-this.r1, true, new CountDownLatch(1), false, false, 0);
            }
            this.v1 = this.u1 && !hc2.q(K0);
            this.x1 = na7.q1(this.s2).K1(this.r1);
            pb0Var.p(K0);
            v28Var.a.getImageReceiver().U(K0, pb0Var, null);
            R0(this.r1, true, false);
        }
        if (this.A1 && (this.s1 || this.t1)) {
            g2b g2bVar = this.I1;
            long j2 = this.r1;
            vf6 vf6Var = g2bVar.m;
            ifc ifcVar = (ifc) vf6Var.f(j2);
            if (ifcVar == null) {
                ifcVar = new ifc(g2bVar.a, j2, g2bVar);
                vf6Var.k(ifcVar, j2);
            }
            ifcVar.b(true);
        }
        h1();
        this.z1 = i;
        if (i < 0) {
            this.z1 = 0;
        }
        this.M0 = 0L;
        this.O0 = false;
        this.y3 = null;
        this.z3 = null;
        boolean z2 = this.t1;
        d28 d28Var = this.S0;
        m8b m8bVar = this.z0;
        int i2 = 8;
        x28 x28Var = this.E1;
        if (z2) {
            r0();
            if (this.R1 == null && (this.u1 || x28Var.f)) {
                l0();
            }
            if (this.R1 != null) {
                TLRPC.Chat K02 = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
                q18 q18Var = this.R1;
                if (x28Var.f || (!A0() && this.u1 && (hc2.q(K02) || hc2.s0(K02)))) {
                    i2 = 0;
                }
                q18Var.setVisibility(i2);
                q18 q18Var2 = this.R1;
                boolean z3 = x28Var.f;
                v0(true);
                q18Var2.J1(z3);
                this.R1.Q1(x28Var.f && !v0(true) && (this.l2 || this.R1.X0), true);
                gt3 editField = this.R1.getEditField();
                long j3 = this.r1;
                TL_stories.StoryItem storyItem = x28Var.a;
                m8bVar.getClass();
                editField.setText(m8b.x(j3, storyItem));
                this.R1.C1(this.s2, this.r1);
                this.R1.q2(K02, null);
            }
            gn gnVar = this.G0;
            f53 f53Var = this.r0;
            if (gnVar == null) {
                gn gnVar2 = new gn(false, false, false);
                this.G0 = gnVar2;
                y18 y18Var = this.t0;
                gnVar2.setCallback(y18Var);
                this.G0.u(f53Var.h(bkb.F6));
                this.G0.w(gl.L(14.0f));
                this.I0 = new lm(y18Var);
            }
            y18 y18Var2 = this.F0;
            if (y18Var2 != null && this.H0 == null) {
                gn gnVar3 = new gn(false, false, false);
                this.H0 = gnVar3;
                gnVar3.setCallback(y18Var2);
                this.H0.u(f53Var.h(bkb.F6));
                this.H0.w(gl.L(14.0f));
                this.J0 = new lm(y18Var2);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            this.q1 = getStoriesCount();
            d28Var.invalidate();
            invalidate();
        } else if (this.s1) {
            r0();
            boolean z4 = x28Var.f;
            y18 y18Var3 = this.M1;
            if (z4) {
                y18Var3.setVisibility(8);
                if (this.R1 == null) {
                    l0();
                }
                this.R1.setVisibility(0);
            } else {
                y18Var3.setVisibility(0);
                q18 q18Var3 = this.R1;
                if (q18Var3 != null) {
                    q18Var3.setVisibility(8);
                }
            }
            q18 q18Var4 = this.R1;
            if (q18Var4 != null) {
                boolean z5 = x28Var.f;
                v0(true);
                q18Var4.J1(z5);
                this.R1.Q1(x28Var.f && !v0(true) && (this.l2 || this.R1.X0), true);
            }
            if (i == -1) {
                ArrayList arrayList = this.p1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(m8bVar.P0));
                    if (indexOf < 0 && !this.p1.isEmpty()) {
                        if (m8bVar.P0 > ((Integer) this.p1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (m8bVar.P0 < ((Integer) b00.f(1, this.p1)).intValue()) {
                            indexOf = this.p1.size() - 1;
                        }
                    }
                    this.z1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.m1.isEmpty();
                    ArrayList arrayList2 = this.l1;
                    if (isEmpty) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i3)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i3)).id > this.I1.f.get(this.r1)) {
                                this.z1 = i3;
                                break;
                            }
                        }
                    } else {
                        this.z1 = arrayList2.size();
                    }
                }
            }
            c1(false);
            d28Var.invalidate();
            invalidate();
        } else {
            if (this.R1 == null) {
                l0();
            }
            if (this.v1 && this.W1 == null) {
                p0();
            }
            if (this.W1 != null) {
                if (this.v1 || this.w1) {
                    e1();
                }
                this.W1.setVisibility(((!this.v1 || x28Var.f) && !this.w1) ? 8 : 0);
            }
            g4b g4bVar = this.Z1;
            if (g4bVar != null) {
                g4bVar.setVisibility(8);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            q18 q18Var5 = this.R1;
            if (q18Var5 != null) {
                q18Var5.setVisibility((A0() || l7c.B(this.r1)) ? 8 : 0);
                q18 q18Var6 = this.R1;
                boolean z6 = x28Var.f;
                v0(true);
                q18Var6.J1(z6);
                this.R1.Q1(x28Var.f && !v0(true) && (this.l2 || this.R1.X0), true);
                gt3 editField2 = this.R1.getEditField();
                long j4 = this.r1;
                TL_stories.StoryItem storyItem2 = x28Var.a;
                m8bVar.getClass();
                editField2.setText(m8b.x(j4, storyItem2));
                this.R1.C1(this.s2, this.r1);
                TLRPC.UserFull W1 = na7.q1(this.s2).W1(this.r1);
                if (W1 != null) {
                    this.R1.q2(null, W1);
                } else {
                    na7.q1(this.s2).Y2(na7.q1(this.s2).V1(Long.valueOf(this.r1)), this.p2, false, null);
                }
            }
            this.q1 = getStoriesCount();
            y18 y18Var4 = this.M1;
            if (y18Var4 != null) {
                y18Var4.setVisibility(8);
            }
            d28Var.invalidate();
            invalidate();
        }
        h0(false);
    }

    public final void e1() {
        boolean z = this.w1;
        TextView textView = this.X1;
        if (z) {
            if (textView != null) {
                textView.setText(k96.M0(2131748631, null));
            }
            TextView textView2 = this.Y1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setText(k96.M0(this.u1 ? 2131744425 : 2131744253, null));
        }
        TextView textView3 = this.Y1;
        if (textView3 != null) {
            textView3.setVisibility(0);
            this.Y1.setText(k96.M0(2131744252, null));
        }
    }

    public final void f0() {
        i28 i28Var = this.A0;
        if (i28Var.W.w()) {
            i28Var.W.e(false);
        }
    }

    public final void f1() {
        TL_stories.PeerStories peerStories;
        int i;
        ArrayList arrayList = this.p1;
        m8b m8bVar = this.z0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.m1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i = 0;
            } else {
                i = arrayList2.size();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    long j = ((f2b) arrayList2.get(i2)).a;
                    if (((int) (j ^ (j >>> 32))) == m8bVar.P0) {
                        this.z1 = i2;
                        return;
                    }
                }
            }
            int indexOf = this.p1.indexOf(Integer.valueOf(m8bVar.P0));
            if (indexOf < 0 && !this.p1.isEmpty()) {
                if (m8bVar.P0 > ((Integer) this.p1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (m8bVar.P0 < ((Integer) b00.f(1, this.p1)).intValue()) {
                    indexOf = this.p1.size() - 1;
                }
            }
            this.z1 = i + indexOf;
        } else {
            int i3 = m8bVar.e1.get(this.r1, -1);
            this.z1 = i3;
            if (i3 == -1 && !m8bVar.N0 && (peerStories = this.k1) != null && peerStories.max_read_id > 0) {
                int i4 = 0;
                while (true) {
                    ArrayList arrayList3 = this.l1;
                    if (i4 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i4)).id > this.k1.max_read_id) {
                        this.z1 = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        if (this.z1 == -1) {
            this.z1 = 0;
        }
    }

    public final void g0() {
        if (this.A1) {
            ((d8b) this.G1).d.U();
        }
    }

    public final void g1(boolean z) {
        a8 a8Var = this.t3;
        if (a8Var == null || this.s3 == null || a8Var.getVisibility() != 0) {
            return;
        }
        if (z) {
            if (Math.abs(m8b.B1 - 0.2f) < 0.05f) {
                this.t3.setSubtext(k96.M0(2131743332, null));
            } else if (Math.abs(m8b.B1 - 0.5f) < 0.05f) {
                this.t3.setSubtext(k96.M0(2131743334, null));
            } else if (Math.abs(m8b.B1 - 1.0f) < 0.05f) {
                this.t3.setSubtext(k96.M0(2131743335, null));
            } else if (Math.abs(m8b.B1 - 1.5f) < 0.05f) {
                this.t3.setSubtext(k96.M0(2131743336, null));
            } else {
                float abs = Math.abs(m8b.B1 - 2.0f);
                a8 a8Var2 = this.t3;
                if (abs < 0.05f) {
                    a8Var2.setSubtext(k96.M0(2131743333, null));
                } else {
                    a8Var2.setSubtext(k96.a0(null, null, 2131743337, cla.a(m8b.B1).concat("x")));
                }
            }
        }
        this.s3.w0(z, m8b.B1);
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.p1;
    }

    public long getCurrentPeer() {
        return this.r1;
    }

    public int getListPosition() {
        return this.B1;
    }

    public Bitmap getPlayingBitmap() {
        d28 d28Var = this.S0;
        Bitmap createBitmap = Bitmap.createBitmap(d28Var.getWidth(), d28Var.getHeight(), Bitmap.Config.ARGB_8888);
        w0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.z1;
    }

    public g2b getStoriesController() {
        return na7.q1(this.s2).M1();
    }

    public int getStoriesCount() {
        return Math.max(this.t2, this.l1.size()) + this.m1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.l1;
    }

    public final void h0(boolean z) {
        if (this.R1 != null && this.V2 && this.Q0) {
            e18 e18Var = this.E3;
            gl.r(e18Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.I1.B;
            this.R1.N(true);
            boolean z2 = this.v1;
            x28 x28Var = this.E1;
            if ((z2 && !x28Var.f) || this.w1) {
                this.a3 = false;
                this.R1.setEnabled(false);
                this.R1.L1(" ", z);
                return;
            }
            if (this.x1 > 0) {
                this.a3 = false;
                this.R1.setEnabled(true);
                this.R1.L1(jva.S0(k96.a0(null, null, 2131743687, k96.E(this.x1, ','))), z);
                return;
            }
            if (!x28Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.s2).getCurrentTime();
                int i = tL_storiesStealthMode.active_until_date;
                if (currentTime < i) {
                    this.a3 = true;
                    int currentTime2 = i - ConnectionsManager.getInstance(this.s2).getCurrentTime();
                    int i2 = currentTime2 / 60;
                    int i3 = currentTime2 % 60;
                    Locale locale = Locale.US;
                    int measureText = (int) this.R1.getEditField().getPaint().measureText(k96.a0(null, null, 2131744651, String.format(locale, "%02d:%02d", 99, 99)));
                    this.R1.setEnabled(true);
                    float f = measureText * 1.2f;
                    float measuredWidth = this.R1.getEditField().getMeasuredWidth();
                    q18 q18Var = this.R1;
                    if (f >= measuredWidth) {
                        String a0 = k96.a0(null, null, 2131744651, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3));
                        q18Var.e = a0;
                        q18Var.f = format;
                        q18Var.m2(z);
                    } else {
                        q18Var.L1(k96.a0(null, null, 2131744652, String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3))), z);
                    }
                    gl.e3(e18Var, 1000L);
                    return;
                }
            }
            this.a3 = false;
            this.R1.setEnabled(true);
            boolean z3 = x28Var.f;
            q18 q18Var2 = this.R1;
            if (!z3) {
                q18Var2.L1(k96.M0(this.u1 ? 2131746057 : 2131746062, null), z);
                return;
            }
            long starsPrice = q18Var2.getStarsPrice();
            q18 q18Var3 = this.R1;
            if (starsPrice <= 0) {
                q18Var3.L1(k96.M0(2131751993, null), z);
                return;
            }
            q18Var3.L1(jva.Y0(false, k96.a0(null, null, 2131751992, k96.E((int) starsPrice, ',')), this.R1.K6), z);
            cm2 cm2Var = this.R1.K6[0];
            if (cm2Var != null) {
                cm2Var.H = 0.9f;
            }
        }
    }

    public final void h1() {
        TL_stories.PeerStories x;
        y1b y1bVar;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.l1;
        arrayList.clear();
        m8b m8bVar = this.z0;
        if (!m8bVar.N0) {
            ArrayList arrayList2 = this.p1;
            int i = 0;
            ArrayList arrayList3 = this.m1;
            if (arrayList2 != null && (y1bVar = m8bVar.O0) != null) {
                if (y1bVar instanceof s1b) {
                    arrayList3.clear();
                    ArrayList E = na7.q1(this.s2).M1().E(this.r1);
                    String str = ((s1b) m8bVar.O0).E;
                    if (E != null) {
                        for (int i2 = 0; i2 < E.size(); i2++) {
                            f2b f2bVar = (f2b) E.get(i2);
                            f4b f4bVar = f2bVar.c;
                            if (f4bVar != null && !f4bVar.g && TextUtils.equals(f4bVar.K0, str)) {
                                arrayList3.add(f2bVar);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.p1;
                int size = arrayList4.size();
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    k27 f = m8bVar.O0.f(((Integer) obj).intValue());
                    if (f != null && (storyItem = f.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (m8bVar.O0 != null) {
                while (i < m8bVar.O0.i.size()) {
                    arrayList.add(((k27) m8bVar.O0.i.get(i)).l);
                    i++;
                }
            } else {
                TL_stories.PeerStories peerStories = m8bVar.Q0;
                if (peerStories == null || cf3.n(peerStories.peer) != this.r1) {
                    x = this.I1.x(this.r1);
                    this.k1 = x;
                    if (x == null) {
                        x = this.I1.y(this.r1);
                        this.k1 = x;
                    }
                } else {
                    x = m8bVar.Q0;
                    this.k1 = x;
                }
                this.t2 = 0;
                if (x != null) {
                    this.t2 = x.stories.size();
                    arrayList.addAll(this.k1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.I1.E(this.r1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        } else if (!m8bVar.S0) {
            arrayList.add(m8bVar.T0);
        }
        this.q1 = getStoriesCount();
    }

    public final boolean i0() {
        byte b = 0;
        if (this.i3) {
            if (this.h3.getReactionsWindow() == null) {
                W0(false);
                return true;
            }
            int i = this.o2;
            t09 t09Var = this.h3;
            if (i > 0) {
                gl.t1(t09Var.getReactionsWindow().c);
                return true;
            }
            t09Var.getReactionsWindow().d();
            return true;
        }
        b28 b28Var = this.Z0;
        if (b28Var != null) {
            je5 je5Var = b28Var.c;
            if (je5Var != null) {
                je5Var.f(true);
                b28Var.c = null;
            }
            b28Var.b = null;
            b28Var.invalidate();
            b28Var.b(false);
        }
        i28 i28Var = this.A0;
        if (i28Var.W.w()) {
            i28Var.W.e(false);
            return true;
        }
        je5 je5Var2 = this.v0;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
        je5 je5Var3 = this.w0;
        if (je5Var3 != null) {
            je5Var3.f(true);
        }
        ke5 ke5Var = this.M2;
        if (ke5Var != null) {
            ke5Var.a();
        }
        s28 s28Var = this.j1;
        if (s28Var != null && s28Var.a) {
            s28Var.a();
            return true;
        }
        q18 q18Var = this.R1;
        if (q18Var != null && q18Var.S0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
            boolean z = this.R1.d1;
            hd hdVar = alertDialog$Builder.a;
            if (z) {
                hdVar.S = k96.M0(2131751383, null);
                hdVar.U = k96.M0(2131751384, null);
            } else {
                hdVar.S = k96.M0(2131751380, null);
                hdVar.U = k96.M0(2131751381, null);
            }
            alertDialog$Builder.j(k96.M0(2131751382, null), new b18(this, b));
            alertDialog$Builder.g(k96.M0(2131751759, null), null);
            ((d8b) this.G1).h(hdVar);
            return true;
        }
        t09 t09Var2 = this.V1;
        if (t09Var2 != null && t09Var2.getReactionsWindow() != null && !this.V1.getReactionsWindow().q) {
            this.V1.getReactionsWindow().d();
            return true;
        }
        q18 q18Var2 = this.R1;
        if (q18Var2 != null && q18Var2.Q0()) {
            int i2 = this.o2;
            q18 q18Var3 = this.R1;
            if (i2 > 0) {
                gl.t1(q18Var3.getEmojiView());
                return true;
            }
            q18Var3.K0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < gl.L(20.0f)) {
            if (i28Var.getVisibility() != 0 || i28Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            i28Var.D();
            this.W2 = false;
            this.S0.invalidate();
            return true;
        }
        q18 q18Var4 = this.R1;
        if (q18Var4 != null) {
            long j = this.r1;
            TL_stories.StoryItem storyItem = this.E1.a;
            Editable editText = q18Var4.getEditText();
            this.z0.getClass();
            m8b.N(j, storyItem, editText);
        }
        gl.t1(this.R1);
        return true;
    }

    public final void i1(boolean z) {
        int i;
        uy1 uy1Var;
        boolean z2;
        int i2;
        x28 x28Var = this.E1;
        TL_stories.StoryItem storyItem = x28Var.a;
        if (storyItem == null) {
            storyItem = x28Var.c;
        }
        boolean z3 = this.t1;
        if (z3 || this.s1) {
            if (storyItem == null) {
                this.q2.setText("");
                this.v2.setVisibility(8);
                this.r2.setVisibility(8);
                return;
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            m8b m8bVar = this.z0;
            y18 y18Var = this.t0;
            if (!z3) {
                int i3 = 3;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.q2.setText(m8bVar.O0 == null ? k96.M0(2131747931, null) : k96.M0(2131747930, null));
                    this.q2.setTranslationX(gl.L(16.0f));
                    this.r2.setVisibility(8);
                    this.v2.setVisibility(8);
                } else {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 >= storyItem.views.recent_viewers.size()) {
                            i = i3;
                            break;
                        }
                        TLObject Z1 = na7.q1(this.s2).Z1(storyItem.views.recent_viewers.get(i4).longValue());
                        if (Z1 != null) {
                            this.r2.b(i5, this.s2, Z1);
                            i5++;
                        }
                        i = i3;
                        if (i5 >= i) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                    int i6 = i5;
                    while (true) {
                        uy1Var = this.r2;
                        if (i6 >= i) {
                            break;
                        }
                        uy1Var.b(i6, this.s2, null);
                        i6++;
                    }
                    uy1Var.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        cm2 cm2Var = new cm2(R.drawable.mini_views_likes, 0);
                        cm2Var.y = -53704;
                        cm2Var.n = gl.L(0.2f);
                        spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        cm2 cm2Var2 = new cm2(R.drawable.mini_repost_story, 0);
                        cm2Var2.y = -14161823;
                        cm2Var2.n = gl.L(0.2f);
                        spannableStringBuilder.setSpan(cm2Var2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.q2.setText(spannableStringBuilder);
                    uy1 uy1Var2 = this.r2;
                    if (i5 == 0) {
                        uy1Var2.setVisibility(8);
                        this.q2.setTranslationX(gl.L(16.0f));
                    } else {
                        uy1Var2.setVisibility(0);
                        this.q2.setTranslationX(gl.L(10.0f) + oo1.h(i5, 1, gl.L(20.0f), gl.L(24.0f) + gl.L(13.0f)));
                    }
                    this.v2.setVisibility(0);
                }
                y18Var.getLayoutParams().width = gl.L(40.0f);
                this.E0.requestLayout();
                return;
            }
            if (storyViews == null) {
                storyViews = new TL_stories.TL_storyViews();
                storyItem.views = storyViews;
            }
            if (storyViews.views_count <= 0) {
                storyViews.views_count = 1;
            }
            gn gnVar = this.H0;
            if (gnVar == null || (i2 = storyViews.forwards_count) <= 0) {
                this.L0 = false;
            } else {
                gnVar.t(Integer.toString(i2), z && this.L0, true);
                this.L0 = true;
            }
            int i7 = storyItem.views.reactions_count;
            if (i7 > 0) {
                this.G0.t(Integer.toString(i7), z && this.K0, true);
                this.K0 = true;
                z2 = true;
            } else {
                this.K0 = false;
                z2 = false;
            }
            if (!z) {
                this.I0.e(true, z2 ? 1.0f : 0.0f);
                lm lmVar = this.J0;
                if (lmVar != null) {
                    lmVar.e(true, this.L0 ? 1.0f : 0.0f);
                }
            }
            TLRPC.Chat K0 = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
            if (!(this.u1 && (hc2.q(K0) || hc2.s0(K0))) && storyItem.views.views_count > 0) {
                this.q2.setText(m8bVar.O0 == null ? k96.M0(2131747931, null) : k96.M0(2131747930, null));
                this.q2.setTranslationX(gl.L(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new cm2(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) gl.o0(storyItem.views.views_count, 0));
                this.q2.setText(spannableStringBuilder2);
            } else {
                this.q2.setText("");
            }
            y18Var.getLayoutParams().width = (int) (gl.L(40.0f) + (this.K0 ? this.G0.d + gl.L(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.M1.getLayoutParams()).rightMargin = gl.L(40.0f) + y18Var.getLayoutParams().width;
            y18 y18Var2 = this.F0;
            if (y18Var2 != null) {
                y18Var2.getLayoutParams().width = (int) (gl.L(40.0f) + (this.L0 ? this.H0.d + gl.L(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.M1.getLayoutParams()).rightMargin += y18Var2.getLayoutParams().width;
                y18Var2.requestLayout();
            }
            this.M1.requestLayout();
            y18Var.requestLayout();
            this.r2.setVisibility(8);
            this.v2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = x28Var.a;
            b28 b28Var = this.Z0;
            if (storyItem2 == null) {
                b28Var.getClass();
                return;
            }
            for (int i8 = 0; i8 < b28Var.getChildCount(); i8++) {
                if (b28Var.getChildAt(i8) instanceof c6b) {
                    ((c6b) b28Var.getChildAt(i8)).c(storyItem2.views, z);
                }
            }
        }
    }

    public final void j0() {
        if (this.y2 == null) {
            x31 x31Var = new x31(this, getContext(), this.r0);
            this.y2 = x31Var;
            x31Var.W3 = new u18(this);
            x31Var.d2.h0();
            x31 x31Var2 = this.y2;
            x31Var2.Q1 = true;
            x31Var2.Z0();
            x31 x31Var3 = this.y2;
            x31Var3.R1 = new v18(this);
            x31Var3.U0().setText(this.R1.getFieldText());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void j1() {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y28.j1():void");
    }

    public final void k0() {
        if (this.N1 != null || getContext() == null) {
            return;
        }
        jm2 jm2Var = new jm2(getContext(), this.x3);
        this.N1 = jm2Var;
        jm2Var.setOnClickListener(new g18(this, (byte) 1));
        addView(this.N1, nme.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void l0() {
        f53 f53Var = this.r0;
        q18 q18Var = new q18(this, gl.W(getContext()), this, new gu0(f53Var, (byte) 4));
        this.R1 = q18Var;
        gt3 editField = q18Var.getEditField();
        editField.getClass();
        xs3 xs3Var = new xs3(editField, (byte) 0);
        editField.u0 = xs3Var;
        byte b = 1;
        xs3Var.q(true);
        editField.u0.u(editField.y0);
        editField.u0.w(editField.getPaint().getTextSize());
        xs3 xs3Var2 = new xs3(editField, b);
        editField.v0 = xs3Var2;
        xs3Var2.b = 5;
        xs3Var2.u(editField.y0);
        editField.v0.w(editField.getPaint().getTextSize());
        this.R1.getEditField().setScaleX(0.0f);
        this.R1.setOverrideKeyboardAnimation(true);
        this.R1.setClipChildren(false);
        this.R1.setDelegate(new r18(this));
        setDelegate(this.R1);
        q18 q18Var2 = this.R1;
        q18Var2.X5 = false;
        q18Var2.Y5 = true;
        if (this.E1.f) {
            q18Var2.w1(false, false, false);
        } else {
            q18Var2.w1(true, true, false);
        }
        this.R1.updateColors();
        q18 q18Var3 = this.R1;
        q18Var3.Z5 = true;
        addView(q18Var3, nme.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.D3 != null) {
            this.R1.v2(false);
        }
        this.R1.w3 = this.p2;
        c30 c30Var = this.C2;
        ((ArrayList) c30Var.g).add(this.S0);
        ((ArrayList) c30Var.g).add(this);
        if (this.Q0) {
            this.R1.e1();
        }
        h0(false);
        if (A0()) {
            this.R1.setVisibility(8);
        }
        dz1 dz1Var = new dz1(getContext(), f53Var, this.x3, this.v3);
        this.S1 = dz1Var;
        dz1Var.setOnClickListener(new b18(this, b));
        addView(this.S1, nme.e(57, kk7.W4, 85));
        this.S1.setVisibility(8);
        this.R1.setSideButtonsForAttach(this.S1);
        this.y0 = getChildCount();
    }

    public final void m0() {
        if (this.Z1 != null) {
            return;
        }
        g4b g4bVar = new g4b(getContext(), this.r0);
        this.Z1 = g4bVar;
        g4bVar.setOnClickListener(new g18(this, (byte) 4));
        this.Z1.setAlpha(0.0f);
        this.Z1.setVisibility(8);
        addView(this.Z1, nme.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void n0() {
        if (this.Q1 != null || getContext() == null) {
            return;
        }
        kh7 kh7Var = new kh7(getContext(), this.x3);
        this.Q1 = kh7Var;
        kh7Var.setOnClickListener(new g18(this, (byte) 5));
        kh7 kh7Var2 = this.Q1;
        t76 t76Var = t76.N;
        boolean z = true;
        kh7Var2.b(t76Var != null && t76Var.r(), false);
        kh7 kh7Var3 = this.Q1;
        t76 t76Var2 = t76.N;
        if (t76Var2 != null && !t76Var2.G) {
            z = false;
        }
        kh7Var3.a(z, false);
        addView(this.Q1, nme.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void o0() {
        if (this.P1 != null || getContext() == null) {
            return;
        }
        this.O1 = new vr7(getContext(), this.s2);
        wr7 wr7Var = new wr7(getContext(), this.O1, this.x3);
        this.P1 = wr7Var;
        wr7Var.setOnClickListener(new g18(this, (byte) 6));
        this.P1.setOnLongClickListener(new d18(this, (byte) 1));
        addView(this.P1, nme.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.O1, nme.d(kk7.d3, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q0 = true;
        this.U0.I();
        this.W0.I();
        this.V0.I();
        this.b3.I();
        this.d3.I();
        q18 q18Var = this.R1;
        if (q18Var != null) {
            q18Var.e1();
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i >= arrayList.size()) {
                kk7.f(this.s2).b(this, kk7.S);
                kk7.f(this.s2).b(this, kk7.F2);
                kk7.f(this.s2).b(this, kk7.x5);
                kk7.f(this.s2).b(this, kk7.n3);
                kk7.f(this.s2).b(this, kk7.z5);
                kk7.f(this.s2).b(this, kk7.F5);
                kk7.f(this.s2).b(this, kk7.c3);
                kk7.f(this.s2).b(this, kk7.j3);
                kk7.f(this.s2).b(this, kk7.E);
                kk7.e().b(this, kk7.k4);
                return;
            }
            ((b09) arrayList.get(i)).b(true);
            i++;
        }
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q0 = false;
        this.U0.K();
        this.W0.K();
        this.V0.K();
        this.b3.K();
        this.d3.K();
        q18 q18Var = this.R1;
        if (q18Var != null) {
            q18Var.d1();
        }
        vl vlVar = this.e3;
        if (vlVar != null) {
            vlVar.o(this);
            this.e3 = null;
        }
        xl xlVar = this.c3;
        if (xlVar != null) {
            xlVar.d(this);
            this.c3 = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i >= arrayList.size()) {
                kk7.f(this.s2).n(this, kk7.S);
                kk7.f(this.s2).n(this, kk7.F2);
                kk7.f(this.s2).n(this, kk7.x5);
                kk7.f(this.s2).n(this, kk7.n3);
                kk7.f(this.s2).n(this, kk7.z5);
                kk7.f(this.s2).n(this, kk7.F5);
                kk7.f(this.s2).n(this, kk7.c3);
                kk7.f(this.s2).n(this, kk7.j3);
                kk7.f(this.s2).n(this, kk7.E);
                kk7.e().n(this, kk7.k4);
                return;
            }
            ((b09) arrayList.get(i)).b(false);
            i++;
        }
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.n1.d.setBounds(0, 0, getMeasuredWidth(), gl.L(72.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        char c;
        q qVar;
        boolean z;
        float L;
        FrameLayout.LayoutParams layoutParams;
        t09 t09Var;
        s18 s18Var;
        m8b m8bVar = this.z0;
        if (m8bVar.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = gl.m;
        }
        byte b = 0;
        if (this.A1 && this.P2 == null) {
            this.o2 = ((d8b) this.G1).d.q0;
        } else {
            this.o2 = 0;
        }
        int size = m8bVar.b ? View.MeasureSpec.getSize(i2) : View.MeasureSpec.getSize(i2) + this.o2;
        int size2 = (int) ((View.MeasureSpec.getSize(i) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.o2 < gl.L(20.0f)) {
            this.o2 = 0;
        }
        int i3 = this.o2;
        t09 t09Var2 = this.h3;
        if (t09Var2 == null || t09Var2.getReactionsWindow() == null || this.h3.getReactionsWindow().q) {
            q18 q18Var = this.R1;
            if (q18Var != null && (q18Var.Q0() || this.R1.a4)) {
                int measuredHeight = this.R1.getEmojiView().getMeasuredHeight();
                q18 q18Var2 = this.R1;
                if (measuredHeight == 0) {
                    i3 = q18Var2.getEmojiPadding();
                } else if (q18Var2.p4) {
                    q18Var2.O();
                    i3 = this.R1.getStickersExpandedHeight();
                } else {
                    i3 = q18Var2.getVisibleEmojiPadding();
                }
            }
        } else {
            this.h3.getReactionsWindow().c.animate().translationY(-this.o2).setDuration(250L).setInterpolator(gb.w).start();
            i3 = 0;
        }
        boolean z2 = this.l2;
        int i4 = this.e2;
        v28 v28Var = this.e1;
        byte b2 = 1;
        if (i4 != i3) {
            this.l2 = false;
            x28 x28Var = this.E1;
            if (i3 <= 0 || !this.A1) {
                f = 8.0f;
                q18 q18Var3 = this.R1;
                if (q18Var3 != null) {
                    m8b.N(this.r1, x28Var.a, q18Var3.getEditText());
                }
            } else {
                this.l2 = true;
                this.Y2 = false;
                this.j2 = i3;
                if (this.V1 == null) {
                    f = 8.0f;
                    t09 t09Var3 = new t09(1, this.s2, new gu0(this.r0, (byte) 6), getContext(), LaunchActivity.Q());
                    this.V1 = t09Var3;
                    t09Var3.setHint(k96.M0(this.u1 ? 2131744426 : 2131744263, null));
                    t09 t09Var4 = this.V1;
                    t09Var4.O0 = true;
                    addView(t09Var4, this.y0, nme.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.V1.setDelegate(new a28(this));
                    this.V1.m(null, null, true);
                } else {
                    f = 8.0f;
                }
                this.V1.setFragment(LaunchActivity.Q());
                this.V1.setHint(k96.M0(this.u1 ? 2131744426 : 2131744263, null));
                d19 d19Var = d19.B;
                if (d19Var != null) {
                    d19Var.l = true;
                }
                d19 d19Var2 = d19.C;
                if (d19Var2 != null) {
                    d19Var2.l = true;
                }
            }
            q18 q18Var4 = this.R1;
            if (q18Var4 != null) {
                q18Var4.Q1(x28Var.f && !v0(true) && this.l2, true);
            }
            if (this.l2 && (s18Var = this.T2) != null) {
                s18Var.setVisibility(0);
            }
            if (!this.l2 && (t09Var = this.V1) != null) {
                t09Var.k();
            }
            v28Var.setEnabled(!this.l2);
            if (this.R1 != null) {
                gl.U3(null, !this.l2, 0.1f, true, true);
            }
            if (this.A1 && this.l2) {
                m8b m8bVar2 = ((d8b) this.G1).d;
                if (!m8bVar2.y) {
                    m8bVar2.y = true;
                    m8bVar2.U();
                }
            }
            this.e2 = i3;
            ValueAnimator valueAnimator = this.f2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.D2.d();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x2, i3);
            this.f2 = ofFloat;
            ofFloat.addUpdateListener(new f18(this, b));
            this.f2.addListener(new o18(this, b2));
            boolean z3 = this.l2;
            ValueAnimator valueAnimator2 = this.f2;
            if (z3) {
                valueAnimator2.setDuration(250L);
                this.f2.setInterpolator(gb.w);
                m8bVar.i();
            } else {
                valueAnimator2.setDuration(500L);
                this.f2.setInterpolator(s33.h);
            }
            this.f2.start();
            boolean z4 = this.l2;
            if (z4 != z2) {
                if (z4) {
                    ep epVar = this.F1;
                    Canvas canvas = (Canvas) epVar.b;
                    Bitmap bitmap = (Bitmap) epVar.c;
                    w0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (gl.B(gl.I0(bitmap)) < 0.15f) {
                        canvas.drawColor(bm2.o(-1, kk7.m1));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (x28Var.f) {
                        je5 je5Var = this.T1;
                        if (je5Var != null) {
                            if (!je5Var.W) {
                                removeView(je5Var);
                            }
                        }
                        if (!v0(true) && na7.c1().getInt("taptostoryhighlighthint", 0) < 3) {
                            na7.c1().edit().putInt("taptostoryhighlighthint", na7.c1().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            je5 je5Var2 = new je5(getContext(), 3);
                            this.T1 = je5Var2;
                            je5Var2.t(k96.M0(2131748621, null));
                            this.T1.setPadding(gl.L(f), 0, gl.L(f), 0);
                            je5 je5Var3 = this.T1;
                            je5Var3.L = Layout.Alignment.ALIGN_OPPOSITE;
                            je5Var3.r0 = new h18(this, je5Var2, b);
                            addView(je5Var3, nme.e(-1, 100, 87));
                            this.T1.v();
                            j1();
                        }
                    }
                } else {
                    q18 q18Var5 = this.R1;
                    if (q18Var5 != null) {
                        q18Var5.getEditField().clearFocus();
                    }
                    je5 je5Var4 = this.T1;
                    if (je5Var4 != null) {
                        je5Var4.f(true);
                    }
                }
                this.k2 = true;
            } else {
                this.k2 = false;
            }
        } else {
            f = 8.0f;
        }
        q18 q18Var6 = this.R1;
        if (q18Var6 != null && q18Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.R1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        d28 d28Var = this.S0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) d28Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z5 = size - size2 > gl.L(64.0f);
        this.n2 = z5;
        int L2 = (size - ((z5 ? gl.L(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = L2;
        if (this.n2) {
            this.A2 = (((-L2) + size) - size2) - gl.L(64.0f);
        } else {
            this.A2 = ((-L2) + size) - size2;
        }
        if (this.n2 != this.m2) {
            d28Var.setLayoutParams(layoutParams2);
        }
        y18 y18Var = this.M1;
        if (y18Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) y18Var.getLayoutParams();
            if (this.n2) {
                layoutParams3.topMargin = gl.L(f) + L2 + size2;
            } else {
                layoutParams3.topMargin = (L2 + size2) - gl.L(48.0f);
            }
        }
        wb wbVar = this.R2;
        if (wbVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wbVar.getLayoutParams();
            boolean z6 = this.n2;
            wb wbVar2 = this.R2;
            if (z6) {
                c = 0;
                wbVar2.setTextColor(bm2.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = gl.L(12.0f) + L2 + size2;
                qVar = this.z2;
                if (qVar != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
                    if (i3 == 0) {
                        layoutParams5.bottomMargin = de9.f(64.0f, L2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = gl.L(64.0f) + i3;
                    }
                }
                z = this.n2;
                i28 i28Var = this.A0;
                LinearLayout linearLayout = this.E0;
                if (z) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((L2 + size2) - gl.L(12.0f)) - gl.L(40.0f);
                    int L3 = this.s1 ? gl.L(40.0f) : gl.L(56.0f);
                    ((FrameLayout.LayoutParams) i28Var.getLayoutParams()).bottomMargin = L3;
                    if (this.m2 != this.n2) {
                        i28Var.setLayoutParams((FrameLayout.LayoutParams) i28Var.getLayoutParams());
                    }
                    i28Var.u0 = L3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = gl.L(12.0f) + L2 + size2;
                    ((FrameLayout.LayoutParams) i28Var.getLayoutParams()).bottomMargin = gl.L(f);
                    if (this.m2 != this.n2) {
                        i28Var.setLayoutParams((FrameLayout.LayoutParams) i28Var.getLayoutParams());
                    }
                    i28Var.u0 = gl.L(f);
                }
                this.L2 = true;
                L = gl.L(48.0f);
                if (this.s0.getVisibility() == 0) {
                    L += gl.L(60.0f);
                }
                if (this.o0.getVisibility() == 0) {
                    L += gl.L(40.0f);
                }
                df0 df0Var = v28Var.b;
                TextView[] textViewArr = v28Var.c;
                layoutParams = (FrameLayout.LayoutParams) df0Var.getLayoutParams();
                if (layoutParams.rightMargin != L) {
                    int i5 = (int) L;
                    layoutParams.rightMargin = i5;
                    ((FrameLayout.LayoutParams) textViewArr[c].getLayoutParams()).rightMargin = i5;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i5;
                    v28Var.forceLayout();
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.m2 = this.n2;
            }
            wbVar2.setTextColor(bm2.o(-1, kk7.U2));
            layoutParams4.topMargin = ((L2 + size2) - gl.L(12.0f)) - gl.L(40.0f);
        }
        c = 0;
        qVar = this.z2;
        if (qVar != null) {
        }
        z = this.n2;
        i28 i28Var2 = this.A0;
        LinearLayout linearLayout2 = this.E0;
        if (z) {
        }
        this.L2 = true;
        L = gl.L(48.0f);
        if (this.s0.getVisibility() == 0) {
        }
        if (this.o0.getVisibility() == 0) {
        }
        df0 df0Var2 = v28Var.b;
        TextView[] textViewArr2 = v28Var.c;
        layoutParams = (FrameLayout.LayoutParams) df0Var2.getLayoutParams();
        if (layoutParams.rightMargin != L) {
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.m2 = this.n2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g2 = -1.0f;
        this.L2 = true;
        invalidate();
    }

    public final void p0() {
        if (this.W1 != null) {
            return;
        }
        if (this.R1 == null) {
            l0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.W1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.X1 = textView;
        textView.setTextColor(-8026747);
        this.X1.setTextSize(1, 16.0f);
        this.X1.setText(k96.M0(this.u1 ? 2131744425 : 2131744253, null));
        TextView textView2 = new TextView(getContext());
        this.Y1 = textView2;
        textView2.setTextColor(-1);
        this.Y1.setTextSize(1, 12.0f);
        TextView textView3 = this.Y1;
        int L = gl.L(40.0f);
        textView3.setBackground(bkb.i0(L, L, L, L, 452984831, 855638015, 855638015));
        this.Y1.setGravity(17);
        ote.a(this.Y1);
        this.Y1.setText(k96.M0(2131744252, null));
        this.Y1.setPadding(gl.L(7.0f), 0, gl.L(7.0f), 0);
        this.W1.addView(imageView, nme.t(22, 22, 16, 12, 1, 4, 0));
        this.W1.addView(this.X1, nme.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.W1.addView(this.Y1, nme.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.R1.addView(this.W1, nme.d(-1, -1.0f, kk7.D1, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void q0() {
        if (this.R2 != null) {
            return;
        }
        wb wbVar = new wb(getContext(), (byte) 29);
        this.R2 = wbVar;
        wbVar.setTextSize(1, 14.0f);
        this.R2.setTextColor(bm2.f(0.5f, -16777216, -1));
        this.R2.setGravity(19);
        this.R2.setText(k96.M0(2131744251, null));
        addView(this.R2, nme.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0() {
        if (this.M1 != null) {
            return;
        }
        y18 y18Var = new y18(this, getContext(), (byte) 0);
        this.M1 = y18Var;
        y18Var.setClickable(true);
        addView(this.M1, nme.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        s71 s71Var = new s71(this, getContext());
        this.v2 = s71Var;
        s71Var.setOnClickListener(new g18(this, 0 == true ? 1 : 0));
        this.M1.addView(this.v2, nme.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        uy1 uy1Var = new uy1((byte) 1, getContext(), 0 == true ? 1 : 0);
        this.r2 = uy1Var;
        uy1Var.setAvatarsTextSize(gl.L(18.0f));
        this.M1.addView(this.r2, nme.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.q2 = textView;
        textView.setTextSize(1, 14.0f);
        this.q2.setTextColor(-1);
        this.M1.addView(this.q2, nme.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.n1.s);
        s71 s71Var2 = this.v2;
        int L = gl.L(15.0f);
        int o = bm2.o(-1, 120);
        s71Var2.setBackground(bkb.i0(L, L, L, L, 0, o, o));
        imageView.setBackground(bkb.N(bm2.o(-1, 120), -gl.L(2.0f), -gl.L(2.0f)));
    }

    public final void s0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (A0() || this.E1.f) {
            return;
        }
        boolean p = y6c.h(this.s2).p();
        f53 f53Var = this.r0;
        if (p) {
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, k96.M0(2131744650, null), false, f53Var).setOnClickListener(new g18(this, (byte) 8));
            return;
        }
        Drawable drawable = getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(bm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        m18 m18Var = new m18(getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, (byte) 0);
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, k96.M0(2131744650, null), false, f53Var);
        c.setOnClickListener(new g18(this, (byte) 9));
        c.setIcon(m18Var);
    }

    public void setAccount(int i) {
        this.s2 = i;
        this.I1 = na7.q1(i).e0;
        this.a1.b = i;
        t09 t09Var = this.V1;
        if (t09Var != null) {
            t09Var.setCurrentAccount(i);
            this.V1.m(null, null, true);
        }
        t09 t09Var2 = this.h3;
        if (t09Var2 != null) {
            t09Var2.setCurrentAccount(i);
        }
    }

    public void setActive(boolean z) {
        O0(0L, z);
    }

    public void setDelegate(t28 t28Var) {
        this.G1 = t28Var;
    }

    public void setIsVisible(boolean z) {
        if (this.V2 != z) {
            this.V2 = z;
            if (z) {
                this.U0.i1 = 1.0f;
                h0(false);
            }
        }
    }

    public void setLongpressed(boolean z) {
        if (this.A1) {
            this.B2 = z;
            invalidate();
        }
    }

    public void setOffset(float f) {
        boolean z = f == 0.0f;
        if (this.R0 != z) {
            this.R0 = z;
            this.S0.invalidate();
            if (this.A1 && this.z0.a && Build.VERSION.SDK_INT < 33) {
                bg7 bg7Var = this.L3;
                if (z) {
                    gl.r(bg7Var);
                    gl.e3(bg7Var, 250L);
                } else {
                    gl.r(bg7Var);
                    m8b m8bVar = ((d8b) this.G1).d;
                    m8bVar.l1 = true;
                    m8bVar.U();
                }
            }
        }
    }

    public void setPaused(boolean z) {
        if (this.H1 != z) {
            this.H1 = z;
            ml mlVar = this.U0;
            if (z) {
                mlVar.x0();
                mlVar.u0 = false;
            } else {
                mlVar.w0(false);
                mlVar.u0 = true;
            }
            this.N0 = 0L;
            this.S0.invalidate();
        }
    }

    public final void t0() {
        if (this.Q2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(gl.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(k96.M0(2131744213, null));
        int i = bkb.F6;
        f53 f53Var = this.r0;
        zkb.X(textView, i, f53Var);
        TextView textView2 = new TextView(getContext());
        ote.a(textView2);
        textView2.setText(k96.M0(2131754227, null));
        int i2 = bkb.Ii;
        zkb.X(textView2, i2, f53Var);
        textView2.setPadding(gl.L(16.0f), gl.L(12.0f), gl.L(16.0f), gl.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(gl.o());
        textView2.setTextSize(1, 15.0f);
        int L = gl.L(8.0f);
        int i3 = bkb.Ei;
        int v0 = bkb.v0(i3, f53Var);
        int o = bm2.o(bkb.v0(i2, f53Var), 30);
        ff0 i0 = bkb.i0(L, L, L, L, v0, o, o);
        vkb M = zkb.M(i3);
        vkb g = zkb.g(i2, 30);
        textView2.setBackground(i0);
        zkb.j(textView2, i0, M, g, f53Var);
        textView2.setOnClickListener(new g18(this, (byte) 3));
        linearLayout.addView(textView, nme.o(-1, -2));
        linearLayout.addView(textView2, nme.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, nme.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.S0.addView(frameLayout);
        this.Q2 = frameLayout;
    }

    public final void u0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
        String M0 = k96.M0(A0() ? 2131751552 : 2131751475, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(A0() ? 2131751553 : 2131751476, null);
        alertDialog$Builder.j(k96.M0(2131751586, null), new b18(this, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752577, null), new fi7((byte) 26));
        ((d8b) this.G1).h(hdVar);
        hdVar.h();
    }

    public final boolean v0(boolean z) {
        t76 t76Var;
        TLRPC.Peer l;
        long e = y6c.h(this.s2).e();
        long j = this.r1;
        m8b m8bVar = this.z0;
        if (j >= 0) {
            if (m8bVar == null || (t76Var = m8bVar.B0) == null || !t76Var.o()) {
                return false;
            }
            return !z || (l = m8bVar.B0.l()) == null || this.r1 == cf3.n(l) || cf3.n(l) == e || this.r1 == e;
        }
        t76 t76Var2 = m8bVar.B0;
        if (t76Var2 == null || !z) {
            return false;
        }
        TLRPC.Peer l2 = t76Var2.l();
        TLRPC.Chat K0 = na7.q1(this.s2).K0(Long.valueOf(-this.r1));
        if (m8bVar.B0.o() || hc2.w(14, K0)) {
            return l2 == null || this.r1 == cf3.n(l2) || cf3.n(l2) == y6c.h(this.s2).e();
        }
        return false;
    }

    public final void w0(Canvas canvas, int i, int i2) {
        c30 c30Var = this.C2;
        if (((ix) c30Var.e) != null) {
            if (((SurfaceView) c30Var.d) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                if (Build.VERSION.SDK_INT >= 24) {
                    gl.y0((SurfaceView) c30Var.d, createBitmap);
                }
                if (createBitmap != null) {
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            }
            TextureView textureView = (TextureView) c30Var.f;
            if (textureView != null) {
                Bitmap bitmap = textureView.getBitmap(i, i2);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            }
        }
        canvas.save();
        d28 d28Var = this.S0;
        canvas.scale(i / d28Var.getMeasuredWidth(), i2 / d28Var.getMeasuredHeight());
        this.U0.h(canvas, null);
        canvas.restore();
    }

    public final void x0(w5b w5bVar, TL_stories.StoryItem storyItem) {
        t28 t28Var = this.G1;
        y5b y5bVar = new y5b(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.r0);
        y5bVar.R0(w5bVar);
        vq1 vq1Var = y5bVar.l1;
        if (vq1Var != null) {
            for (View view : vq1Var.getViewPages()) {
                if (view instanceof t5b) {
                    ((t5b) view).f(false);
                }
            }
        }
        y5bVar.L0(true);
        y5bVar.N1 = new dx6((Object) this, (Object) storyItem, (byte) 12);
        ((d8b) t28Var).h(y5bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x017b, code lost:
    
        if (r3 == r10.V1) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y0(ViewGroup viewGroup, float f, float f2, boolean z) {
        je5 je5Var;
        c30 c30Var;
        ix ixVar;
        if (viewGroup != null) {
            je5 je5Var2 = this.v0;
            if ((je5Var2 == null || !je5Var2.W) && ((je5Var = this.w0) == null || !je5Var.W)) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        i28 i28Var = this.A0;
                        if (childAt == i28Var) {
                            Rect rect = gl.Q;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f, (int) f2)) {
                                float top = f2 - childAt.getTop();
                                j3b j3bVar = i28Var.b0;
                                if (j3bVar.x == 1.0f && !i28Var.s0) {
                                    if (top > j3bVar.getTranslationY() + (i28Var.r0.getTop() - i28Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = gl.Q;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.S0 || (c30Var = this.C2) == null || (ixVar = (ix) c30Var.e) == null || !y0(ixVar, f - childAt.getX(), f2 - childAt.getY(), z)) && (!childAt.isClickable() || !rect2.contains((int) f, (int) f2))) {
                            b28 b28Var = this.Z0;
                            if (childAt == b28Var && b28Var.b == null && (f < gl.L(60.0f) || f > viewGroup.getMeasuredWidth() - gl.L(60.0f))) {
                                Matrix matrix = b28Var.e;
                                float[] fArr = b28Var.f;
                                for (int i2 = 0; i2 < b28Var.getChildCount(); i2++) {
                                    View childAt2 = b28Var.getChildAt(i2);
                                    if (childAt2 != b28Var.d && (childAt2 instanceof c6b)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f;
                                        fArr[1] = f2;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                l18 l18Var = this.B0;
                                if (childAt == l18Var) {
                                    rkb rkbVar = l18Var.f;
                                    fu fuVar = l18Var.c;
                                    rkb rkbVar2 = l18Var.f;
                                    rkbVar.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f - l18Var.getX()) - rkbVar2.getX()), (int) ((f2 - l18Var.getY()) - rkbVar2.getY()))) {
                                        if (l18Var.g0) {
                                            continue;
                                        } else if (!this.l2) {
                                            if (f2 <= l18Var.r() + l18Var.getY() && fuVar.E(f, (f2 - l18Var.getY()) - fuVar.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.l2) {
                                        if (childAt == this.R1 && f2 > rect2.top) {
                                        }
                                    }
                                    if (!z) {
                                        if (rect2.contains((int) f, (int) f2)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            q18 q18Var = this.R1;
                                            if (q18Var != null && childAt == q18Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && y0((ViewGroup) childAt, f - childAt.getX(), f2 - childAt.getY(), z)) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean z0(View view, MotionEvent motionEvent) {
        float x = getX();
        d28 d28Var = this.S0;
        float x2 = view.getX() + d28Var.getX() + x;
        float y = view.getY() + d28Var.getY() + getY();
        return motionEvent.getX() >= x2 && motionEvent.getX() <= x2 + ((float) view.getWidth()) && motionEvent.getY() >= y && motionEvent.getY() <= y + ((float) view.getHeight());
    }
}
