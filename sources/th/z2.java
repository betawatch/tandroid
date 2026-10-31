package th;

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
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.dt;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hc;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ot;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.x8;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.pd;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dg0;
import org.telegram.ui.el0;
import org.telegram.ui.hk;
import org.telegram.ui.ly;
import org.telegram.ui.nb0;
import org.telegram.ui.nc;
import org.telegram.ui.qs0;
import org.telegram.ui.tk;
import org.telegram.ui.un;
import org.telegram.ui.w71;
import org.telegram.ui.zw0;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import rh.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class z2 extends uu0 implements us {
    public org.telegram.ui.Components.e6 A0;
    public boolean A1;
    public long A2;
    public final i1 A3;
    public org.telegram.ui.Components.t5 B0;
    public e5 B1;
    public boolean B2;
    public final ArrayList B3;
    public org.telegram.ui.Components.t5 C0;
    public boolean C1;
    public boolean C2;
    public final ArrayList C3;
    public boolean D0;
    public boolean D1;
    public boolean D2;
    public boolean D3;
    public boolean E0;
    public boolean E1;
    public boolean E2;
    public boolean E3;
    public long F0;
    public b2 F1;
    public q30 F2;
    public final ew F3;
    public long G0;
    public a G1;
    public final qs0 G2;
    public final org.telegram.ui.Components.t5 G3;
    public boolean H0;
    public d1 H1;
    public boolean H2;
    public final org.telegram.ui.Components.t5 H3;
    public boolean I0;
    public e1 I1;
    public z1 I2;
    public final org.telegram.ui.Components.t5 I3;
    public boolean J0;
    public a1 J1;
    public FrameLayout J2;
    public float J3;
    public boolean K0;
    public t1 K1;
    public el0 K2;
    public final Path K3;
    public final g2 L0;
    public bh.k L1;
    public boolean L2;
    public boolean L3;
    public final FrameLayout M0;
    public vh.p2 M1;
    public v1 M2;
    public ValueAnimator M3;
    public final ag.c2 N0;
    public ValueAnimator N1;
    public float N2;
    public float N3;
    public final ImageReceiver O0;
    public mj0 O1;
    public boolean O2;
    public final ImageReceiver P0;
    public LinearLayout P1;
    public boolean P2;
    public final ArrayList Q0;
    public TextView Q1;
    public boolean Q2;
    public Runnable R0;
    public TextView R1;
    public boolean R2;
    public final e2 S0;
    public o6 S1;
    public boolean S2;
    public final ly T0;
    public ViewPropertyAnimator T1;
    public boolean T2;
    public e3 U0;
    public final vg.f U1;
    public final ImageReceiver U2;
    public float V0;
    public final vg.f V1;
    public sg.d V2;
    public final r8 W0;
    public final Paint W1;
    public final ImageReceiver W2;
    public final w2 X0;
    public int X1;
    public org.telegram.ui.Components.f5 X2;
    public final p6 Y0;
    public ValueAnimator Y1;
    public boolean Y2;
    public j6.m Z0;
    public float Z1;
    public boolean Z2;
    public int a1;
    public float a2;
    public mj0 a3;
    public org.telegram.ui.ActionBar.b1 b1;
    public float b2;
    public boolean b3;
    public u2 c1;
    public int c2;
    public float c3;
    public TL_stories.PeerStories d1;
    public boolean d2;
    public boolean d3;
    public final ArrayList e1;
    public boolean e2;
    public float e3;
    public final ImageView f0;
    public final ArrayList f1;
    public boolean f2;
    public int f3;
    public final ImageView g0;
    public final x2 g1;
    public boolean g2;
    public int g3;
    public final dg0 h0;
    public final rf.b0 h1;
    public int h2;
    public int h3;
    public final ei0 i0;
    public ArrayList i1;
    public final int i2;
    public i1 i3;
    public final ImageView j0;
    public int j1;
    public TextView j2;
    public float j3;
    public final org.telegram.ui.ActionBar.p6 k0;
    public long k1;
    public oh.b k2;
    public boolean k3;
    public final t6 l0;
    public boolean l1;
    public int l2;
    public li.k l3;
    public final b2 m0;
    public boolean m1;
    public int m2;
    public org.telegram.ui.ActionBar.b1 m3;
    public j5 n0;
    public boolean n1;
    public boolean n2;
    public org.telegram.ui.ActionBar.b1 n3;
    public vh.p2 o0;
    public boolean o1;
    public ih.c o2;
    public final tg.b o3;
    public vh.p2 p0;
    public boolean p1;
    public boolean p2;
    public final hi.a p3;
    public vh.p2 q0;
    public long q1;
    public float q2;
    public final hi.f q3;
    public int r0;
    public final float r1;
    public ag.v r2;
    public final wg.b r3;
    public final o7 s0;
    public int s1;
    public e50 s2;
    public TL_stories.TL_premium_boostsStatus s3;
    public final k2 t0;
    public boolean t1;
    public int t2;
    public org.telegram.messenger.h3 t3;
    public final p1 u0;
    public int u1;
    public boolean u2;
    public long u3;
    public final View v0;
    public int v1;
    public final k2.t0 v2;
    public long v3;
    public final ImageView w0;
    public int w1;
    public final e2.f w2;
    public boolean w3;
    public final LinearLayout x0;
    public final y2 x1;
    public final org.telegram.ui.Components.t5 x2;
    public TLRPC.TL_channels_sendAsPeers x3;
    public final b2 y0;
    public final j2.f y1;
    public final org.telegram.ui.Components.t5 y2;
    public final i1 y3;
    public org.telegram.ui.Components.e6 z0;
    public v2 z1;
    public float z2;
    public int z3;

    public z2(Context context, final o7 o7Var, x2 x2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null);
        this.K0 = true;
        this.Q0 = new ArrayList();
        this.a1 = -5;
        this.r1 = 1.0f;
        y2 y2Var = new y2(this);
        this.x1 = y2Var;
        this.Z1 = -1.0f;
        this.a2 = -1.0f;
        this.b2 = -1.0f;
        this.i2 = ConnectionsManager.generateClassGuid();
        this.x2 = new org.telegram.ui.Components.t5(this);
        this.y2 = new org.telegram.ui.Components.t5(this);
        qs0 qs0Var = new qs0();
        this.G2 = qs0Var;
        this.N2 = 1.0f;
        this.y3 = new i1(this, 4);
        this.A3 = new i1(this, 11);
        this.B3 = new ArrayList();
        this.C3 = new ArrayList();
        this.F3 = new ew(this, 27);
        this.G3 = new org.telegram.ui.Components.t5(this);
        this.H3 = new org.telegram.ui.Components.t5(this);
        this.I3 = new org.telegram.ui.Components.t5(this);
        this.K3 = new Path();
        qs0Var.E = new s9.g(this);
        k2.t0 t0Var = new k2.t0();
        t0Var.g = new ArrayList();
        this.v2 = t0Var;
        this.w2 = new e2.f(null);
        this.e1 = new ArrayList();
        this.f1 = new ArrayList();
        ag.c2 c2Var = new ag.c2(this, 7);
        this.N0 = c2Var;
        final int i10 = 0;
        c2Var.A0 = false;
        c2Var.z1 = true;
        c2Var.y = true;
        c2Var.h0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U2 = imageReceiver;
        imageReceiver.z1 = true;
        imageReceiver.y = true;
        imageReceiver.h0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.W2 = imageReceiver2;
        imageReceiver2.z1 = true;
        imageReceiver2.y = true;
        imageReceiver2.h0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.O0 = imageReceiver3;
        imageReceiver3.z1 = true;
        imageReceiver3.y = true;
        imageReceiver3.h0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.P0 = imageReceiver4;
        imageReceiver4.z1 = true;
        imageReceiver4.y = true;
        imageReceiver4.h0(0);
        c2Var.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.W0 = new r8((org.telegram.ui.ActionBar.p6) null);
        this.s0 = o7Var;
        this.g1 = x2Var;
        this.y1 = x2Var.g;
        this.B1 = vp.r1(d20.s0).O1();
        x2Var.l.setColor(-16777216);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.k0 = p6Var;
        setClipChildren(false);
        e2 e2Var = new e2(this, context, this.L0, p6Var, o7Var);
        this.S0 = e2Var;
        wg.b bVar = new wg.b(p6Var, org.telegram.ui.ActionBar.t6.Ge, 0.8f);
        this.r3 = bVar;
        hi.c cVar = new hi.c();
        cVar.a(i0.b.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !tz.e()) {
            this.q3 = null;
            this.p3 = cVar;
        } else {
            hi.f fVar = new hi.f(cVar);
            this.q3 = fVar;
            fVar.f(org.telegram.messenger.i0.L(8.0f));
            this.p3 = fVar;
        }
        zg.h hVar = new zg.h(this);
        tg.b bVar2 = new tg.b(this.p3);
        bVar2.f = hVar;
        bVar2.g = this;
        this.o3 = bVar2;
        this.U1 = bVar2.c(this, bVar, false);
        vg.f c10 = bVar2.c(this, bVar, false);
        this.V1 = c10;
        c10.t(org.telegram.messenger.i0.L(32.0f));
        g2 g2Var = new g2(this, context, x2Var, o7Var);
        this.L0 = g2Var;
        g2Var.setClipChildren(false);
        this.T0 = new ly(this.l2, g2Var);
        g2Var.addView(e2Var, w7.b6.c(-1.0f, -1));
        k2 k2Var = new k2(this, getContext(), o7Var.D, o7Var, p6Var);
        this.t0 = k2Var;
        k2Var.b0.setOnClickListener(new k1(this, 10));
        ImageView imageView = new ImageView(context);
        this.w0 = imageView;
        imageView.setImageDrawable(x2Var.m);
        int L = org.telegram.messenger.i0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new k1(this, 11));
        imageView.setContentDescription(cd.L0(2131745477, null));
        w7.e6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(x2Var.n);
        imageView2.setPadding(L, L, L, L);
        b2 b2Var = new b2(this, getContext(), 1);
        this.y0 = b2Var;
        org.telegram.ui.Components.e6 e6Var = this.A0;
        if (e6Var != null) {
            e6Var.setCallback(b2Var);
        }
        b2Var.setWillNotDraw(false);
        b2Var.setOnClickListener(new k1(this, 12));
        b2 b2Var2 = new b2(this, getContext(), 2);
        this.m0 = b2Var2;
        org.telegram.ui.Components.e6 e6Var2 = this.z0;
        if (e6Var2 != null) {
            e6Var2.setCallback(b2Var2);
        }
        b2Var2.setWillNotDraw(false);
        b2Var2.setOnClickListener(new k1(this, 13));
        b2Var2.setOnLongClickListener(new org.telegram.ui.Components.b0(7, this, o7Var));
        j5 j5Var = new j5(context, x2Var);
        this.n0 = j5Var;
        j5Var.setPadding(L, L, L, L);
        b2Var2.addView(this.n0, w7.b6.e(40, 40, 3));
        b2Var.addView(imageView2, w7.b6.e(40, 40, 3));
        w7.e6.b(b2Var2, 0.3f, 5.0f);
        w7.e6.b(b2Var, 0.3f, 5.0f);
        c2Var.z1 = true;
        c2Var.H0(g2Var);
        rf.b0 b0Var = new rf.b0(10);
        this.h1 = b0Var;
        g2Var.setOutlineProvider(b0Var);
        g2Var.setClipToOutline(true);
        addView(g2Var);
        w2 w2Var = new w2(context, y2Var);
        this.X0 = w2Var;
        w2Var.setOnClickListener(new View.OnClickListener(this) { // from class: th.g1
            public final /* synthetic */ z2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                o7 o7Var2 = o7Var;
                z2 z2Var = this.b;
                switch (i11) {
                    case 0:
                        long j10 = d20.i(z2Var.l2).n;
                        long j11 = z2Var.k1;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                o7Var2.V(un.ha(j11));
                                break;
                            } else {
                                o7Var2.V(ProfileActivity.z4(j11));
                                break;
                            }
                        } else {
                            Bundle i12 = org.telegram.ui.Cells.f1.i(1, TeXSymbolParser.TYPE_ATTR);
                            i12.putLong("dialog_id", z2Var.k1);
                            o7Var2.V(new n90(i12, null));
                            break;
                        }
                    default:
                        if (!z2Var.x1.j()) {
                            z2Var.a1(true);
                            break;
                        } else {
                            o7Var2.c0();
                            if (!o7.D1) {
                                vp.d1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            z2Var.h0.setContentDescription(cd.L0(!o7.D1 ? 2131748329 : 2131743874, null));
                            break;
                        }
                }
            }
        });
        g2Var.addView(w2Var, w7.b6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.M0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.x0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.b6.r(40, 40, 5));
        linearLayout.addView(b2Var, w7.b6.r(40, 40, 5));
        linearLayout.addView(b2Var2, w7.b6.r(40, 40, 5));
        addView(linearLayout, w7.b6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f0 = imageView3;
        imageView3.setImageDrawable(x2Var.q);
        imageView3.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.h0(-1, 1, -1));
        imageView3.setContentDescription(cd.L0(2131754839, null));
        g2Var.addView(imageView3, w7.b6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.g0 = imageView4;
        imageView4.setImageDrawable(x2Var.r);
        imageView4.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.t6.h0(-1, 1, -1));
        imageView4.setContentDescription(cd.L0(2131754808, null));
        g2Var.addView(imageView4, w7.b6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new rh.s(o7Var, 12));
        imageView3.setOnClickListener(new bi.c(this, p6Var, o7Var, context, x2Var, 13));
        dg0 dg0Var = new dg0(context, 20);
        this.h0 = dg0Var;
        g2Var.addView(dg0Var, w7.b6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ei0 ei0Var = new ei0(context);
        this.i0 = ei0Var;
        ei0Var.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        dg0Var.addView(ei0Var);
        ImageView imageView5 = new ImageView(context);
        this.j0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        imageView5.setImageDrawable(x2Var.t);
        dg0Var.addView(imageView5);
        imageView5.setVisibility(8);
        t6 t6Var = new t6(context);
        this.l0 = t6Var;
        t6Var.setOnClickListener(new k1(this, 2));
        g2Var.addView(t6Var, w7.b6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i11 = 1;
        dg0Var.setOnClickListener(new View.OnClickListener(this) { // from class: th.g1
            public final /* synthetic */ z2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                o7 o7Var2 = o7Var;
                z2 z2Var = this.b;
                switch (i112) {
                    case 0:
                        long j10 = d20.i(z2Var.l2).n;
                        long j11 = z2Var.k1;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                o7Var2.V(un.ha(j11));
                                break;
                            } else {
                                o7Var2.V(ProfileActivity.z4(j11));
                                break;
                            }
                        } else {
                            Bundle i12 = org.telegram.ui.Cells.f1.i(1, TeXSymbolParser.TYPE_ATTR);
                            i12.putLong("dialog_id", z2Var.k1);
                            o7Var2.V(new n90(i12, null));
                            break;
                        }
                    default:
                        if (!z2Var.x1.j()) {
                            z2Var.a1(true);
                            break;
                        } else {
                            o7Var2.c0();
                            if (!o7.D1) {
                                vp.d1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            z2Var.h0.setContentDescription(cd.L0(!o7.D1 ? 2131748329 : 2131743874, null));
                            break;
                        }
                }
            }
        });
        this.Y0 = new p6(this, x2Var);
        g2Var.addView(k2Var, w7.b6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        p1 p1Var = new p1(this, context, o7Var, o7Var.w, view, frameLayout, o7Var);
        this.u0 = p1Var;
        g2Var.addView(view, w7.b6.e(-1, zs.e3, 87));
        g2Var.addView(p1Var, w7.b6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        g2Var.addView(frameLayout, w7.b6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.i0.L(20.0f);
        int o10 = i0.b.o(-1, 100);
        dg0Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, o10, o10));
        int L3 = org.telegram.messenger.i0.L(20.0f);
        int o11 = i0.b.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, o11, o11));
        int L4 = org.telegram.messenger.i0.L(20.0f);
        int o12 = i0.b.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.t6.k0(L4, L4, L4, L4, 0, o12, o12));
        int L5 = org.telegram.messenger.i0.L(20.0f);
        int o13 = i0.b.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.k0(L5, L5, L5, L5, 0, o13, o13));
        int L6 = org.telegram.messenger.i0.L(20.0f);
        int o14 = i0.b.o(-1, 100);
        b2Var2.setBackground(org.telegram.ui.ActionBar.t6.k0(L6, L6, L6, L6, 0, o14, o14));
        int L7 = org.telegram.messenger.i0.L(20.0f);
        int o15 = i0.b.o(-1, 100);
        b2Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L7, L7, L7, L7, 0, o15, o15));
        t9 t9Var = k2Var.W;
        View n10 = t9Var.n(context);
        if (n10 != null) {
            org.telegram.messenger.i0.E2(n10);
            addView(n10);
        }
        t9Var.D = new tk(this, 2);
        t9Var.S(this);
    }

    public static void T0(d5 d5Var, ImageReceiver imageReceiver, String str) {
        if (d5Var.s) {
            imageReceiver.u0(null, null, ic.g(d5Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(ic.g(d5Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(z2 z2Var, ValueAnimator valueAnimator) {
        t6 t6Var = z2Var.l0;
        z2Var.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w2 w2Var = z2Var.X0;
        w2Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
        w2Var.setAlpha(1.0f - z2Var.N3);
        ImageView imageView = z2Var.f0;
        imageView.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
        imageView.setAlpha(1.0f - z2Var.N3);
        ImageView imageView2 = z2Var.g0;
        imageView2.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
        imageView2.setAlpha(1.0f - z2Var.N3);
        dg0 dg0Var = z2Var.h0;
        dg0Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
        dg0Var.setAlpha((1.0f - z2Var.N3) * z2Var.N2);
        b2 b2Var = z2Var.F1;
        if (b2Var != null) {
            b2Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * z2Var.N3);
            z2Var.F1.setAlpha(1.0f - z2Var.N3);
        }
        if (t6Var != null) {
            t6Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
            t6Var.setAlpha(1.0f - z2Var.N3);
        }
        z2Var.t0.setAlpha(1.0f - z2Var.N3);
        v2 v2Var = z2Var.z1;
        float f7 = v2Var == null ? 0.0f : ((f7) v2Var).d.V;
        float hideInterfaceAlpha = z2Var.getHideInterfaceAlpha();
        b2 b2Var2 = z2Var.m0;
        if (b2Var2 != null) {
            b2Var2.setAlpha((1.0f - z2Var.N3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = z2Var.w0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - z2Var.N3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        b2 b2Var3 = z2Var.y0;
        if (b2Var3 != null) {
            b2Var3.setAlpha((1.0f - z2Var.N3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        t1 t1Var = z2Var.K1;
        if (t1Var != null) {
            t1Var.setAlpha(1.0f - z2Var.N3);
            z2Var.invalidate();
        }
        z2Var.L0.invalidate();
    }

    public static void Y(z2 z2Var, boolean z10) {
        org.telegram.ui.ActionBar.b1 b1Var = z2Var.m3;
        if (b1Var == null || z2Var.l3 == null || b1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(o7.B1 - 0.2f) < 0.05f) {
                z2Var.m3.setSubtext(cd.L0(2131743600, null));
            } else if (Math.abs(o7.B1 - 0.5f) < 0.05f) {
                z2Var.m3.setSubtext(cd.L0(2131743602, null));
            } else if (Math.abs(o7.B1 - 1.0f) < 0.05f) {
                z2Var.m3.setSubtext(cd.L0(2131743603, null));
            } else if (Math.abs(o7.B1 - 1.5f) < 0.05f) {
                z2Var.m3.setSubtext(cd.L0(2131743604, null));
            } else if (Math.abs(o7.B1 - 2.0f) < 0.05f) {
                z2Var.m3.setSubtext(cd.L0(2131743601, null));
            } else {
                z2Var.m3.setSubtext(cd.a0(null, null, 2131743605, jh.g.a(o7.B1) + "x"));
            }
        }
        z2Var.l3.L(z10, o7.B1);
    }

    public static void Z(z2 z2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (z2Var.G0() || z2Var.x1.f) {
            return;
        }
        if (d20.i(z2Var.l2).q()) {
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, cd.L0(2131744905, null), false, z2Var.k0).setOnClickListener(new k1(z2Var, 8));
            return;
        }
        Drawable drawable = z2Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        zw0 zw0Var = new zw0(z2Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 2);
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, cd.L0(2131744905, null), false, z2Var.k0);
        c10.setOnClickListener(new k1(z2Var, 9));
        c10.setIcon(zw0Var);
    }

    public static void b0(z2 z2Var) {
        y2 y2Var = z2Var.x1;
        TL_stories.StoryItem storyItem = y2Var.a;
        if ((storyItem == null && y2Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = y2Var.h();
        boolean z10 = y2Var.e;
        if (h == null || !h.exists()) {
            z2Var.Y0();
            return;
        }
        MediaController.d0(h.toString(), z2Var.getContext(), z10 ? 1 : 0, null, null, new nc(8, z2Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c0(z2 z2Var, long j10) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j10 > 0) {
            TLRPC.User Z1 = vp.r1(z2Var.l2).Z1(Long.valueOf(j10));
            str = Z1.first_name;
            z10 = Z1.stories_hidden;
            chat = Z1;
        } else {
            TLRPC.Chat L0 = vp.r1(z2Var.l2).L0(Long.valueOf(-j10));
            str = L0.title;
            z10 = L0.stories_hidden;
            chat = L0;
        }
        org.telegram.messenger.i0.h3(new hf(z2Var, vp.r1(z2Var.l2), j10, !z10, str, chat), 200L);
    }

    public static void d0(z2 z2Var) {
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, z2Var.getContext(), z2Var.k0);
        String L0 = cd.L0(z2Var.G0() ? 2131751565 : 2131751488, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = cd.L0(z2Var.G0() ? 2131751566 : 2131751489, null);
        alertDialog$Builder.k(cd.L0(2131751599, null), new f1(z2Var, 2));
        alertDialog$Builder.h(cd.L0(2131752589, null), new m1(i10));
        ((f7) z2Var.z1).h(x1Var);
        x1Var.i();
    }

    public static void f0(z2 z2Var) {
        org.telegram.ui.ActionBar.p6 p6Var = z2Var.k0;
        g2 g2Var = z2Var.L0;
        if (z2Var.p1) {
            return;
        }
        int i10 = 0;
        if (!z2Var.n1) {
            t1 t1Var = z2Var.K1;
            int i11 = -z2Var.a1;
            z2Var.a1 = i11;
            org.telegram.messenger.i0.F3(i11, t1Var, null);
            org.telegram.messenger.t2.D.a();
            String p5 = z2Var.k1 >= 0 ? h20.p(vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1))) : "";
            (vp.r1(z2Var.l2).A3() ? new cc(g2Var, p6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131743784, p5))) : new cc(g2Var, p6Var).K(R.raw.star_premium_2, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131743784, p5)), cd.L0(2131743785, null), new i1(z2Var, 5))).j();
            return;
        }
        if (z2Var.s3 != null && z2Var.t3 != null) {
            kg.q0.w1(new kg.q1(z2Var, 10), z2Var.s3, z2Var.t3, z2Var.k1, true);
            return;
        }
        o7 o7Var = z2Var.s0;
        if (o7Var != null) {
            o7Var.k1 = true;
            o7Var.d0();
        }
        vp.r1(z2Var.l2).G0().a(z2Var.k1, new l1(z2Var, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f7 = 1.0f - this.x2.c;
        f4 f4Var = this.s0.x;
        return (1.0f - (f4Var == null ? 0.0f : f4Var.f)) * f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        o7 o7Var;
        if (!this.x1.f || (o7Var = this.s0) == null || o7Var.A0 == null || B0(true)) {
            return 0L;
        }
        return o7Var.A0.j();
    }

    public static void h0(z2 z2Var) {
        y2 y2Var = z2Var.x1;
        if (y2Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = y2Var.a.id;
        tL_stories_exportStoryLink.peer = vp.r1(z2Var.l2).i1(z2Var.k1);
        ConnectionsManager.getInstance(z2Var.l2).sendRequest(tL_stories_exportStoryLink, new a2());
    }

    public final void A0() {
        if (this.J2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(cd.L0(2131744479, null));
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.k0;
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        TextView textView2 = new TextView(getContext());
        w7.e6.a(textView2);
        textView2.setText(cd.L0(2131754230, null));
        int i11 = org.telegram.ui.ActionBar.t6.Gi;
        org.telegram.ui.ActionBar.a7.V(textView2, i11, p6Var);
        textView2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.i0.L(8.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, o10, o10);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i11, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView2, k02, N, h, p6Var);
        textView2.setOnClickListener(new k1(this, 3));
        linearLayout.addView(textView, w7.b6.o(-1, -2));
        linearLayout.addView(textView2, w7.b6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.b6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.L0.addView(frameLayout);
        this.J2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        s0 s0Var;
        TLRPC.Peer i10;
        s0 s0Var2;
        long e = d20.i(this.l2).e();
        long j10 = this.k1;
        o7 o7Var = this.s0;
        if (j10 >= 0 || (s0Var2 = o7Var.A0) == null) {
            if (j10 < 0 || o7Var == null || (s0Var = o7Var.A0) == null || !s0Var.l()) {
                return false;
            }
            return !z10 || (i10 = o7Var.A0.i()) == null || this.k1 == org.telegram.messenger.o5.o(i10) || org.telegram.messenger.o5.o(i10) == e || this.k1 == e;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i11 = s0Var2.i();
        TLRPC.Chat L0 = vp.r1(this.l2).L0(Long.valueOf(-this.k1));
        if (o7Var.A0.l() || org.telegram.messenger.w3.w(14, L0)) {
            return i11 == null || this.k1 == org.telegram.messenger.o5.o(i11) || org.telegram.messenger.o5.o(i11) == d20.i(this.l2).e();
        }
        return false;
    }

    public final void C0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        k2.t0 t0Var = this.v2;
        org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) t0Var.e;
        if (k4Var != null && ((SurfaceView) t0Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.i0.z0((SurfaceView) t0Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (k4Var != null && (textureView = (TextureView) t0Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        g2 g2Var = this.L0;
        canvas.scale(i10 / g2Var.getMeasuredWidth(), i11 / g2Var.getMeasuredHeight());
        this.N0.h(canvas, null);
        canvas.restore();
    }

    public final void D0(vh.u6 u6Var, TL_stories.StoryItem storyItem) {
        v2 v2Var = this.z1;
        vh.w6 w6Var = new vh.w6(storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, getContext(), this.k0);
        w6Var.W0(u6Var);
        hk hkVar = w6Var.i1;
        if (hkVar != null) {
            for (View view : hkVar.getViewPages()) {
                if (view instanceof vh.r6) {
                    ((vh.r6) view).f(false);
                }
            }
        }
        w6Var.Q0(true);
        w6Var.K1 = new org.telegram.ui.web.k0(18, this, storyItem);
        ((f7) v2Var).h(w6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.O1) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(ViewGroup viewGroup, float f7, float f10, boolean z10) {
        vh.p2 p2Var;
        k2.t0 t0Var;
        org.telegram.ui.k4 k4Var;
        if (viewGroup != null) {
            vh.p2 p2Var2 = this.o0;
            if ((p2Var2 == null || !p2Var2.V) && ((p2Var = this.p0) == null || !p2Var.V)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        k2 k2Var = this.t0;
                        if (childAt == k2Var) {
                            Rect rect = org.telegram.messenger.i0.Q;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f7, (int) f10)) {
                                float top = f10 - childAt.getTop();
                                i6 i6Var = k2Var.b0;
                                if (i6Var.x == 1.0f && !k2Var.s0) {
                                    if (top > i6Var.getTranslationY() + (k2Var.r0.getTop() - k2Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = org.telegram.messenger.i0.Q;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.L0 || (t0Var = this.v2) == null || (k4Var = (org.telegram.ui.k4) t0Var.e) == null || !E0(k4Var, f7 - childAt.getX(), f10 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f7, (int) f10))) {
                            e2 e2Var = this.S0;
                            if (childAt == e2Var && e2Var.b == null && (f7 < org.telegram.messenger.i0.L(60.0f) || f7 > viewGroup.getMeasuredWidth() - org.telegram.messenger.i0.L(60.0f))) {
                                Matrix matrix = e2Var.e;
                                float[] fArr = e2Var.f;
                                for (int i11 = 0; i11 < e2Var.getChildCount(); i11++) {
                                    View childAt2 = e2Var.getChildAt(i11);
                                    if (childAt2 != e2Var.d && (childAt2 instanceof v6)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f7;
                                        fArr[1] = f10;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                p1 p1Var = this.u0;
                                if (childAt == p1Var) {
                                    w71 w71Var = p1Var.f;
                                    nb0 nb0Var = p1Var.c;
                                    w71 w71Var2 = p1Var.f;
                                    w71Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f7 - p1Var.getX()) - w71Var2.getX()), (int) ((f10 - p1Var.getY()) - w71Var2.getY()))) {
                                        if (p1Var.f0) {
                                            continue;
                                        } else if (!this.e2) {
                                            if (f10 <= p1Var.s() + p1Var.getY() && nb0Var.E(f7, (f10 - p1Var.getY()) - nb0Var.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.e2) {
                                        if (childAt == this.K1 && f10 > rect2.top) {
                                        }
                                    }
                                    if (!z10) {
                                        if (rect2.contains((int) f7, (int) f10)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            t1 t1Var = this.K1;
                                            if (t1Var != null && childAt == t1Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && E0((ViewGroup) childAt, f7 - childAt.getX(), f10 - childAt.getY(), z10)) {
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

    public final boolean F0(View view, MotionEvent motionEvent) {
        float x10 = getX();
        g2 g2Var = this.L0;
        float x11 = view.getX() + g2Var.getX() + x10;
        float y3 = view.getY() + g2Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ((float) view.getHeight());
    }

    public final boolean G0() {
        x4 x4Var;
        o7 o7Var = this.s0;
        return (o7Var == null || (x4Var = o7Var.O0) == null || x4Var.e != 4) ? false : true;
    }

    public final boolean H0() {
        TLRPC.User Z1;
        return G0() && (Z1 = vp.r1(this.l2).Z1(Long.valueOf(this.s0.O0.d))) != null && Z1.bot && Z1.bot_can_edit;
    }

    public abstract boolean I0();

    public final void J0(sg.o0 o0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        y2 y2Var = this.x1;
        TL_stories.StoryItem storyItem = y2Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && o0Var == null) {
            j0();
            this.B1.j0(this.k1, y2Var.a, null);
        } else if (o0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.l2).r.get("❤");
            if (tL_availableReaction != null) {
                this.Y2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = sg.k0.a();
                ic b10 = ic.b(document);
                ImageReceiver imageReceiver = this.U2;
                imageReceiver.q0(b10, a2, null, null, null, 0);
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                this.Z2 = true;
                this.B1.j0(this.k1, y2Var.a, sg.o0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.B1.j0(this.k1, y2Var.a, o0Var);
        }
        TL_stories.StoryItem storyItem2 = y2Var.a;
        b2 b2Var = this.m0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.n0.setReaction(null);
            b2Var.setContentDescription(cd.L0(2131754851, null));
            z10 = false;
        } else {
            z11 = !z11;
            this.n0.setReaction(sg.o0.d(reaction));
            b2Var.setContentDescription(cd.L0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.m1 && z11) {
            TL_stories.StoryItem storyItem3 = y2Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = y2Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = y2Var.a;
        sg.q0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        s0 s0Var;
        if (this.x3 != null) {
            return;
        }
        o7 o7Var = this.s0;
        if (o7Var != null && (s0Var = o7Var.A0) != null) {
            if (s0Var.w == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers L1 = vp.r1(this.l2).L1(this.k1, true);
        this.x3 = L1;
        t1 t1Var = this.K1;
        if (t1Var == null || L1 == null) {
            return;
        }
        t1Var.O1(true);
    }

    public final boolean L0() {
        t1 t1Var = this.K1;
        if (t1Var == null) {
            return false;
        }
        boolean z10 = t1Var.z2;
        if (z10) {
            t1Var.q1();
        }
        org.telegram.messenger.i0.h3(new i1(this, 3), 300L);
        return z10;
    }

    public final void M0() {
        l1 l1Var;
        int i10;
        long j10;
        int i11;
        vp.d1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.K1.getTextWithEntities();
        long e = d20.i(this.l2).e();
        TLRPC.Peer i12 = this.s0.A0.i();
        if (i12 != null) {
            e = org.telegram.messenger.o5.o(i12);
        }
        Context context = getContext();
        int i13 = this.l2;
        String s10 = org.telegram.messenger.o5.s(i13, this.k1);
        long messageMinPrice = getMessageMinPrice();
        long j11 = this.u3;
        l1 l1Var2 = new l1(this, 1);
        b bVar = new b();
        int i14 = 0;
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, context, (org.telegram.ui.ActionBar.p6) bVar, false);
        z2Var.O();
        z2Var.v0 = false;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        z2Var.N = f7;
        int[] iArr = vp.r1(i13).Y6;
        Spannable j02 = jj.j0(textWithEntities, false, false, new TextPaint());
        if (j02 != null) {
            l1Var = l1Var2;
            i10 = ((org.telegram.ui.Components.o5[]) j02.getSpans(0, j02.length(), org.telegram.ui.Components.o5.class)).length + ((org.telegram.messenger.h6[]) j02.getSpans(0, j02.length(), org.telegram.messenger.h6.class)).length;
        } else {
            l1Var = l1Var2;
            i10 = 0;
        }
        int max = (int) Math.max(messageMinPrice, j11 <= 0 ? 100L : j11);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                j10 = messageMinPrice;
                i11 = i14;
                break;
            }
            int i15 = length * 7;
            i11 = i14;
            int i16 = iArr[i15];
            Spannable spannable = j02;
            int i17 = iArr[i15 + 2];
            j10 = messageMinPrice;
            if (i10 <= iArr[i15 + 3] && spannable.length() <= i17) {
                max = Math.max(max, i16);
                break;
            }
            length--;
            i14 = i11;
            j02 = spannable;
            messageMinPrice = j10;
        }
        long[] jArr = new long[1];
        jArr[i11] = max;
        vh.d dVar = new vh.d(context, null, true);
        h0 h0Var = new h0();
        h0Var.c = e;
        h0Var.f = textWithEntities;
        h0Var.g = jArr[i11];
        c0 c0Var = new c0(i13, context, true);
        LinearLayout f10 = org.telegram.messenger.m5.f(context, i11);
        org.telegram.ui.Components.voip.i0 i0Var = new org.telegram.ui.Components.voip.i0(context, cd.L0(2131748824, null), bVar);
        f10.addView(i0Var, w7.b6.q(-1, -1, 1.0f, zs.x1, 0, 0, 5, 0));
        org.telegram.ui.Components.voip.i0 i0Var2 = new org.telegram.ui.Components.voip.i0(context, cd.L0(2131748825, null), bVar);
        f10.addView(i0Var2, w7.b6.q(-1, -1, 1.0f, zs.x1, 5, 0, 5, 0));
        org.telegram.ui.Components.voip.i0 i0Var3 = new org.telegram.ui.Components.voip.i0(context, cd.L0(2131748826, null), bVar);
        f10.addView(i0Var3, w7.b6.q(-1, -1, 1.0f, zs.x1, 5, 0, 0, 0));
        n nVar = new n(context, bVar, r0);
        l1 l1Var3 = l1Var;
        long j12 = j10;
        q20[] q20VarArr = {new org.telegram.ui.Wallet.q4(jArr, dVar, new dq[1], h0Var, c0Var, i13, i0Var, i0Var2, i0Var3, nVar, new boolean[]{true})};
        c0Var.set(h0Var);
        int i18 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i19 = vp.r1(i13).Z6;
        ArrayList arrayList = new ArrayList();
        int i20 = 0;
        while (true) {
            if (i20 >= i18) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i20] >= j12) {
                if (i20 > 0 && arrayList.isEmpty() && iArr3[i20] > j12) {
                    arrayList.add(Integer.valueOf((int) j12));
                }
                int i21 = iArr3[i20];
                if (i21 <= i19) {
                    arrayList.add(Integer.valueOf(i21));
                    if (iArr3[i20] == i19) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i19));
                    break;
                }
            }
            i20++;
            iArr2 = iArr3;
            i18 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) i0.a.g(1, arrayList)).intValue() < i19) {
            arrayList.add(Integer.valueOf(i19));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            iArr4[i22] = ((Integer) arrayList.get(i22)).intValue();
        }
        nVar.e0 = iArr4;
        nVar.setValue((int) jArr[0]);
        f7.addView(nVar, w7.b6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        q20VarArr[0].a(Integer.valueOf((int) jArr[0]));
        f7.addView(f10, w7.b6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i23 = org.telegram.ui.ActionBar.t6.j5;
        TextView b10 = w7.g6.b(context, 20.0f, i23, true, bVar);
        org.telegram.messenger.m5.l(b10, 17, null, 2131748821);
        f7.addView(b10, w7.b6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.g6.b(context, 14.0f, i23, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.m5.q(null, null, 2131748822, new Object[]{s10}, b11);
        f7.addView(b11, w7.b6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        f7.addView(c0Var, w7.b6.t(-2, -2, 17, 42, 22, 42, 20));
        f7.addView(dVar, w7.b6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        z2Var.show();
        dVar.setOnClickListener(new rh.e7(l1Var3, jArr, z2Var));
    }

    public final void N0() {
        if (this.K1 == null) {
            return;
        }
        r0();
        this.r2.a2.g0();
        this.r2.x1(-1, true);
        ag.v vVar = this.r2;
        vVar.Q1 = this.k1;
        vVar.d1();
        this.r2.Z0().setText(this.K1.getFieldText());
        ((f7) this.z1).h(this.r2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j10 = this.k1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog R0 = vp.r1(this.l2).R0(this.k1);
        if (R0 != null) {
            bundle.putInt("message_id", R0.top_message);
        }
        this.s0.V(new un(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(long j10) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        long j11;
        vh.s2 s2Var;
        s0 s0Var;
        boolean z10 = this.t1;
        k2.t0 t0Var = this.v2;
        if (!z10) {
            t0Var.e = null;
            return;
        }
        y2 y2Var = this.x1;
        boolean z11 = y2Var.f;
        g2 g2Var = this.L0;
        if (!z11) {
            if (!y2Var.e) {
                f8.b("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((f7) this.z1).c(null, null, 0L, this.v2);
                t0Var.e = null;
                t0Var.b = false;
                return;
            }
            if (y2Var.f() == null || !new File(y2Var.f()).exists()) {
                TL_stories.StoryItem storyItem = y2Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.k1;
                    try {
                        document2 = e5.C(this.l2, storyItem);
                        try {
                            TL_stories.StoryItem storyItem2 = y2Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = b8.G(this.l2).F(y2Var.a);
                            }
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(this.l2);
                            sb2.append("&id=");
                            sb2.append(document2.id);
                            sb2.append("&hash=");
                            sb2.append(document2.access_hash);
                            sb2.append("&dc=");
                            sb2.append(document2.dc_id);
                            sb2.append("&size=");
                            sb2.append(document2.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(y2Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(b8.B(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.f(bArr));
                            sb2.append("&sid=");
                            sb2.append(y2Var.a.id);
                            sb2.append("&did=");
                            sb2.append(y2Var.a.dialogId);
                            Uri parse = Uri.parse("tg://" + b8.r(null, document2) + sb2.toString());
                            f8.b("StoryViewer requestVideoPlayer(" + j10 + "): playing from " + parse);
                            this.A2 = (long) (jj.H0(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((f7) this.z1).c(document, uri, j10, this.v2);
                            g2Var.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(y2Var.f()));
                f8.b("StoryViewer requestVideoPlayer(" + j10 + "): playing from attachPath " + fromFile);
                this.A2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                f8.b("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((f7) this.z1).c(document, uri, j10, this.v2);
            g2Var.invalidate();
            return;
        }
        v2 v2Var = this.z1;
        TL_stories.StoryItem storyItem3 = y2Var.a;
        long j12 = this.k1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        f7 f7Var = (f7) v2Var;
        f7Var.i(true, true);
        o7 o7Var = f7Var.d;
        s0 s0Var2 = o7Var.A0;
        if (s0Var2 == null || s0Var2.b != j12 || !s0Var2.f(inputGroupCall)) {
            vh.s2 s2Var2 = o7Var.D0;
            if (s2Var2 != null) {
                s2Var2.d(j12, null);
                vh.s2 s2Var3 = o7Var.D0;
                SurfaceViewRenderer surfaceViewRenderer = s2Var3.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = s2Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                s2Var3.r = false;
                s2Var3.e(false, false);
            }
            w0 w0Var = w0.Z;
            if (w0Var.S && (s0Var = w0Var.w) != null && s0Var.f(inputGroupCall)) {
                s0 s0Var3 = w0Var.w;
                w0Var.w = null;
                o7Var.A0 = s0Var3;
                w0Var.d(false);
            } else {
                s0 s0Var4 = o7Var.A0;
                if (s0Var4 != null) {
                    if (!s0Var4.n && (!w0Var.S || w0Var.w != s0Var4)) {
                        s0Var4.e();
                    } else if (s0Var4.O != o7Var.D0.getSink()) {
                        o7Var.A0.s(null);
                    }
                    o7Var.A0 = null;
                }
            }
            if (w0Var.S) {
                w0.b();
            }
            n7 n7Var = o7Var.z0;
            if (n7Var != null) {
                n7Var.release(null);
                o7Var.z0 = null;
            }
            k2.t0 t0Var2 = o7Var.G0;
            if (t0Var2 != null) {
                t0Var2.c = null;
                t0Var2.a = null;
                t0Var2.b = false;
                t0Var2.e = null;
                t0Var2.f = null;
                t0Var2.d = null;
                t0Var2.b();
                o7Var.G0 = null;
            }
            if (o7Var.A0 == null) {
                s0 s0Var5 = s0.W;
                if (s0Var5 == null || !s0Var5.f(inputGroupCall)) {
                    s0 s0Var6 = new s0(f7Var.c, o7Var.h, storyItem3, j12, i10, z12, inputGroupCall, false, false);
                    j11 = j12;
                    o7Var.A0 = s0Var6;
                    s2Var = o7Var.E0;
                    if (s2Var == null) {
                        o7Var.A0.s(s2Var.getSink());
                    } else {
                        o7Var.A0.s(o7Var.D0.getSink());
                    }
                    o7Var.G0 = t0Var;
                    t0Var.b = false;
                    t0Var.e = o7Var.y0;
                    vh.s2 s2Var4 = o7Var.D0;
                    t0Var.f = s2Var4.d;
                    t0Var.d = s2Var4.c;
                    t0Var.a = o7Var.A0;
                    s2Var4.d(j11, t0Var);
                    o7Var.G0.b();
                } else {
                    o7Var.A0 = s0.W;
                }
            }
            j11 = j12;
            s2Var = o7Var.E0;
            if (s2Var == null) {
            }
            o7Var.G0 = t0Var;
            t0Var.b = false;
            t0Var.e = o7Var.y0;
            vh.s2 s2Var42 = o7Var.D0;
            t0Var.f = s2Var42.d;
            t0Var.d = s2Var42.c;
            t0Var.a = o7Var.A0;
            s2Var42.d(j11, t0Var);
            o7Var.G0.b();
        }
        g2Var.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(Uri uri) {
        TL_stories.StoryItem storyItem;
        Uri parse;
        String str;
        boolean z10;
        String str2;
        if (uri == null || (storyItem = this.x1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                String str3 = uri2.split("/1/")[1];
                int indexOf = str3.indexOf("/ACTUAL");
                parse = indexOf != -1 ? Uri.parse(URLDecoder.decode(str3.substring(0, indexOf), "UTF-8")) : uri;
            } catch (Exception e) {
                f8.g(e, true);
            }
            String T0 = org.telegram.messenger.i0.T0(parse);
            if (org.telegram.messenger.v2.b) {
                str2 = T0;
                z10 = true;
                str = str2;
            } else if (T0 == null) {
                String uri3 = parse.toString();
                String t10 = MediaController.t(-1L, parse, "file");
                if (t10 == null) {
                    X0();
                    return;
                } else {
                    str = uri3;
                    z10 = false;
                    str2 = t10;
                }
            } else {
                str = T0;
                z10 = false;
                str2 = str;
            }
            if (z10) {
                qz.T(getAccountInstance(), str2, str, null, null, null, this.k1, null, null, storyItem, null, true, null, null);
                return;
            } else {
                qz.T(getAccountInstance(), null, null, parse, null, null, this.k1, null, null, storyItem, null, true, null, null);
                return;
            }
        }
        parse = uri;
        String T02 = org.telegram.messenger.i0.T0(parse);
        if (org.telegram.messenger.v2.b) {
        }
        if (z10) {
        }
    }

    public final void R0(long j10, boolean z10) {
        if (this.t1 != z10) {
            this.t1 = z10;
            ei0 ei0Var = this.i0;
            if (z10) {
                if (this.s0.a && Build.VERSION.SDK_INT < 33) {
                    o7 o7Var = ((f7) this.z1).d;
                    o7Var.l1 = true;
                    o7Var.d0();
                    ew ewVar = this.F3;
                    org.telegram.messenger.i0.r(ewVar);
                    org.telegram.messenger.i0.h3(ewVar, 100L);
                }
                P0(j10);
                e1();
                ei0Var.setAnimation(this.g1.u);
                this.t1 = true;
                this.X0.a.getImageReceiver().O0(true, true);
                y2 y2Var = this.x1;
                if (y2Var.a != null) {
                    f8.b("StoryViewer displayed story dialogId=" + this.k1 + " storyId=" + y2Var.a.id + " " + y2.c(y2Var));
                }
            } else {
                n0();
                ei0Var.a();
                this.U0 = null;
                this.u2 = false;
                this.x2.e(true, 0.0f);
                this.L0.invalidate();
                invalidate();
                o0();
                o7 o7Var2 = ((f7) this.z1).d;
                o7Var2.I0 = false;
                o7Var2.d0();
            }
            this.N0.h0(this.t1 ? 3 : 2);
            this.O0.h0(this.t1 ? 2 : 0);
            this.P0.h0(this.t1 ? 2 : 0);
            if (this.l1 || this.m1) {
                e5 e5Var = this.B1;
                long j11 = this.k1;
                boolean z11 = this.t1;
                a0.h hVar = e5Var.m;
                x7 x7Var = (x7) hVar.f(j11);
                if (x7Var == null) {
                    x7Var = new x7(e5Var.a, j11, e5Var);
                    hVar.k(x7Var, j11);
                }
                x7Var.b(z11);
            }
        }
    }

    public final void S0(int i10, long j10) {
        if (this.k1 != j10) {
            y2 y2Var = this.x1;
            y2Var.b = null;
            y2Var.a = null;
        }
        this.k1 = j10;
        this.i1 = null;
        m0(i10);
        TL_stories.PeerStories peerStories = this.s0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.B1.V(peerStories, true);
            return;
        }
        e5 e5Var = this.B1;
        TL_stories.PeerStories y3 = e5Var.y(j10);
        if (y3 == null) {
            y3 = e5Var.z(j10);
        } else {
            z10 = false;
        }
        e5Var.V(y3, z10);
    }

    public final void U0(long j10, boolean z10, boolean z11) {
        if (!z10 && j10 == this.v3 && this.w3 == z11) {
            return;
        }
        this.v3 = j10;
        this.w3 = z11;
        w2 w2Var = this.X0;
        if (j10 < 0) {
            TLRPC.Chat L0 = vp.r1(this.l2).L0(Long.valueOf(-j10));
            og.c cVar = w2Var.b;
            og.c cVar2 = w2Var.b;
            cVar.l(org.telegram.messenger.i0.D2(L0 == null ? "" : L0.title), false);
            if (L0 == null || !L0.verified) {
                cVar2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(zs.e4);
            eq eqVar = new eq(mutate, null);
            eqVar.x = true;
            int L = org.telegram.messenger.i0.L(16.0f);
            int L2 = org.telegram.messenger.i0.L(16.0f);
            eqVar.h = L;
            eqVar.n = L2;
            cVar2.i(eqVar);
            return;
        }
        if (this.l1 && !z11) {
            w2Var.b.l(cd.L0(2131745658, null), false);
            w2Var.b.i(null);
            return;
        }
        TLRPC.User Z1 = vp.r1(this.l2).Z1(Long.valueOf(j10));
        if (Z1 == null || !Z1.verified) {
            w2Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(zs.e4);
            eq eqVar2 = new eq(mutate2, null);
            eqVar2.x = true;
            int L3 = org.telegram.messenger.i0.L(16.0f);
            int L4 = org.telegram.messenger.i0.L(16.0f);
            eqVar2.h = L3;
            eqVar2.n = L4;
            w2Var.b.i(eqVar2);
        }
        if (Z1 != null) {
            w2Var.b.l(org.telegram.messenger.k6.m(org.telegram.messenger.i0.D2(org.telegram.messenger.i5.p(Z1)), w2Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
        } else {
            w2Var.b.l(null, false);
        }
    }

    public final void V0(float f7, float f10, e3 e3Var) {
        this.V0 = f7;
        this.j3 = 1.0f / f10;
        if (this.U0 == e3Var) {
            return;
        }
        this.U0 = e3Var;
        if (e3Var != null) {
            ImageReceiver imageReceiver = e3Var.a;
            if (imageReceiver.n() != null) {
                Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                ag.c2 c2Var = this.N0;
                c2Var.c0 = null;
                c2Var.Z0.setShader(null);
                c2Var.N0(new BitmapDrawable(copy));
            }
        }
    }

    public final void W0(boolean z10) {
        y2 y2Var = this.x1;
        if (y2Var.a != null) {
            o7 o7Var = this.s0;
            if (o7Var.f != null) {
                String e = y2Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e);
                    LaunchActivity.I1.startActivityForResult(Intent.createChooser(intent, cd.L0(2131744864, null)), 500);
                    return;
                }
                z1 z1Var = new z1(this, o7Var.f.getContext(), e, e, vp.r1(this.l2).T4() && (!(this.m1 || h20.A(this.k1)) || org.telegram.messenger.w3.t0(this.m1 ? vp.r1(this.l2).L0(Long.valueOf(-this.k1)) : null)), new org.telegram.ui.web.a0(3, this.k0));
                this.I2 = z1Var;
                z1Var.a2 = true;
                TL_stories.StoryItem storyItem = y2Var.a;
                storyItem.dialogId = this.k1;
                z1Var.x2 = storyItem;
                z1Var.k2 = new n2.u(this, 26);
                ((f7) this.z1).h(z1Var);
            }
        }
    }

    public final void X0() {
        g2 g2Var = this.L0;
        org.telegram.ui.ActionBar.p6 p6Var = this.k0;
        org.telegram.messenger.m5.o(null, 2131743858, new cc(g2Var, p6Var), p6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.k0);
        String L0 = cd.L0(R.string.AppName, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        alertDialog$Builder.k(cd.L0(2131747847, null), null);
        x1Var.T = cd.L0(2131747233, null);
        ((f7) this.z1).h(x1Var);
    }

    public final void Z0(boolean z10) {
        if (this.b3 != z10) {
            y2 y2Var = this.x1;
            if (y2Var.a == null) {
                return;
            }
            this.b3 = z10;
            int i10 = 0;
            if (z10) {
                this.a3.setVisibility(0);
            }
            this.a3.setStoryItem(y2Var.a);
            o7 o7Var = ((f7) this.z1).d;
            o7Var.p1 = z10;
            o7Var.d0();
            if (!z10) {
                if (this.a3.getReactionsWindow() != null) {
                    this.a3.getReactionsWindow().e();
                }
                this.a3.animate().alpha(0.0f).setDuration(150L).setListener(new r1(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c3, z10 ? 1.0f : 0.0f);
            this.a3.setTransitionProgress(this.c3);
            ofFloat.addUpdateListener(new j1(this, 1));
            ofFloat.addListener(new q1(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.g);
            ofFloat.start();
        }
    }

    public final void a1(boolean z10) {
        if (this.p0 == null) {
            vh.p2 p2Var = new vh.p2(getContext(), 1);
            p2Var.l(1.0f, -56.0f);
            this.p0 = p2Var;
            p2Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
            this.L0.addView(this.p0, w7.b6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.p0.s(cd.L0(z10 ? 2131744626 : 2131744483, null));
        this.p0.u();
    }

    public final boolean b1(boolean z10) {
        if (this.s0.R0) {
            z10 = !z10;
        }
        if (!z10) {
            int i10 = this.s1;
            if (i10 > 0) {
                this.s1 = i10 - 1;
                d1(false);
                return true;
            }
        } else if (this.s1 < getStoriesCount() - 1) {
            this.s1++;
            d1(false);
            return true;
        }
        return false;
    }

    public final void c1() {
        if (vp.r1(this.l2).T4()) {
            File h = this.x1.h();
            if (h == null || !h.exists()) {
                Y0();
                return;
            }
            z1 z1Var = this.I2;
            if (z1Var != null) {
                z1Var.dismiss();
            }
            org.telegram.messenger.i0.h3(new i1(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x095b, code lost:
    
        if (r15.g == (r2 == null && r2.translated && r2.translatedText != null && android.text.TextUtils.equals(r2.translatedLng, org.telegram.ui.Components.m31.M0()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x09bb, code lost:
    
        if (r3 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x09e0, code lost:
    
        if (r3 != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0af3, code lost:
    
        if (r4 != false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0b0b, code lost:
    
        if (r4 != false) goto L558;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b5d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0cab  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0d04  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0da2  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0dba A[EDGE_INSN: B:311:0x0dba->B:312:0x0dba BREAK  A[LOOP:0: B:300:0x0d98->B:309:0x0db7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0dc6  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0dd7  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0e2f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0e7b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0e9d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0f33  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0f64  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0f73  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0f99  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0fba  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0fe8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x1004  */
    /* JADX WARN: Removed duplicated region for block: B:406:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0fda  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0ee5  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0e75  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e3f  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0e26  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0d38  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0d52  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x0408  */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72, types: [org.telegram.tgnet.tl.TL_stories$StoryItem, th.e6] */
    /* JADX WARN: Type inference failed for: r6v74 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(boolean z10) {
        d5 d5Var;
        TL_stories.StoryItem storyItem;
        d5 d5Var2;
        boolean z11;
        boolean z12;
        int i10;
        ly lyVar;
        int i11;
        TL_stories.StoryItem storyItem2;
        ag.c2 c2Var;
        boolean z13;
        l7 l7Var;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        o7 o7Var;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem4;
        boolean z14;
        boolean z15;
        TL_stories.StoryItem storyItem5;
        o7 o7Var2;
        d5 d5Var3;
        TLRPC.MessageMedia messageMedia;
        vh.n5 n5Var;
        TL_stories.StoryItem storyItem6;
        d5 d5Var4;
        int i12;
        vh.n5 n5Var2;
        boolean z16;
        g2 g2Var;
        k2 k2Var;
        w2 w2Var;
        t1 t1Var;
        boolean z17;
        d5 d5Var5;
        wb wbVar;
        boolean z18;
        TL_stories.StoryItem storyItem7;
        int i13;
        ag.c2 c2Var2;
        boolean z19;
        d5 d5Var6;
        y2 y2Var;
        boolean z20;
        boolean z21;
        g2 g2Var2;
        k2 k2Var2;
        boolean z22;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        CharSequence charSequence2;
        TLRPC.MessageMedia messageMedia2;
        boolean z23;
        vh.p2 p2Var;
        vh.p2 p2Var2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence4;
        TL_stories.StoryItem storyItem10;
        v2 v2Var;
        boolean z24;
        boolean z25;
        LinearLayout linearLayout;
        boolean z26;
        boolean z27;
        t1 t1Var2;
        int i15;
        t1 t1Var3;
        int i16;
        boolean z28;
        boolean z29;
        boolean z30;
        int i17;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        bh.k kVar;
        a aVar;
        a1 a1Var;
        boolean z35;
        TL_stories.StoryItem storyItem11;
        boolean z36;
        int i18;
        int i19;
        boolean z37;
        boolean z38;
        boolean l4;
        d5 d5Var7;
        d5 d5Var8;
        vh.p2 p2Var3;
        int i20;
        ImageView imageView;
        ImageView imageView2;
        boolean z39;
        int i21;
        boolean z40;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i22;
        int i23;
        int i24;
        boolean z41;
        int i25;
        boolean z42;
        boolean z43;
        TL_stories.StoryItem storyItem13;
        int i26;
        int i27;
        FrameLayout.LayoutParams layoutParams;
        int L;
        boolean z44;
        boolean z45;
        int i28;
        boolean z46;
        s0 s0Var;
        int i29;
        boolean z47;
        int i30;
        boolean z48;
        int i31;
        boolean z49;
        boolean z50;
        boolean z51;
        boolean z52;
        s0 s0Var2;
        String str;
        BitmapDrawable bitmapDrawable;
        ag.c2 c2Var3;
        boolean z53;
        o7 o7Var3;
        ly lyVar2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        x4 x4Var;
        ArrayList arrayList2 = this.e1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.E2 = true;
        y2 y2Var2 = this.x1;
        TL_stories.StoryItem storyItem14 = y2Var2.a;
        d5 d5Var9 = y2Var2.b;
        String s10 = w5.s();
        this.I0 = false;
        this.L2 = false;
        int i32 = this.s1;
        boolean z54 = this.C1;
        boolean z55 = this.D1;
        boolean z56 = this.E1;
        o7 o7Var4 = this.s0;
        if (o7Var4 == null || (x4Var = o7Var4.O0) == null || x4Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i32 < 0 || i32 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i32);
            int size = i32 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            d5Var = (size < 0 || size >= arrayList3.size()) ? null : (d5) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            d5Var = (i32 < 0 || i32 >= arrayList3.size()) ? null : (d5) arrayList3.get(i32);
            int size2 = i32 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        y2Var2.c = null;
        e2 e2Var = this.S0;
        int i33 = zs.g2;
        ly lyVar3 = this.T0;
        ag.c2 c2Var4 = this.N0;
        if (d5Var != null) {
            vh.n5 n5Var3 = d5Var.c;
            this.D1 = false;
            boolean z57 = d5Var.I;
            this.E1 = z57;
            this.C1 = !z57;
            c2Var4.c0(false);
            c2Var4.b0(zs.g2);
            Bitmap bitmap = n5Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (d5Var.s || d5Var.H) {
                d5Var2 = d5Var9;
                c2Var3 = c2Var4;
                z11 = z54;
                z53 = z55;
                z12 = z56;
                o7Var3 = o7Var4;
                i10 = i32;
                lyVar2 = lyVar3;
                r62 = 0;
                i11 = 4;
                this.N0.u0(null, null, ic.g(d5Var.f), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                i11 = 4;
                d5Var2 = d5Var9;
                lyVar2 = lyVar3;
                r62 = 0;
                c2Var3 = c2Var4;
                z11 = z54;
                z12 = z56;
                z53 = z55;
                o7Var3 = o7Var4;
                i10 = i32;
                this.N0.u0(null, null, ic.g(d5Var.e), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            y2Var2.b = d5Var;
            y2Var2.j = r62;
            y2Var2.i = r62;
            y2Var2.a = r62;
            y2Var2.d = false;
            y2Var2.e = y2Var2.m();
            TL_stories.StoryItem storyItem17 = y2Var2.a;
            y2Var2.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            lyVar = lyVar2;
            e2Var.c(r62, s6.a(n5Var3), lyVar);
            this.D2 = false;
            this.C2 = false;
            this.B2 = false;
            storyItem2 = storyItem14;
            z13 = z53;
            c2Var = c2Var3;
            o7Var = o7Var3;
        } else {
            d5Var2 = d5Var9;
            z11 = z54;
            z12 = z56;
            i10 = i32;
            lyVar = lyVar3;
            i11 = 4;
            this.C1 = false;
            this.D1 = false;
            this.E1 = false;
            if (storyItem == null) {
                if (o7Var4 != null) {
                    o7Var4.D(true);
                    return;
                }
                return;
            }
            d5 t10 = this.B1.t(this.k1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.D1 = true;
                c2Var4.c0(false);
                if (this.R0 != null) {
                    i33 = 0;
                }
                c2Var4.b0(i33);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    d5Var3 = t10;
                    c2Var = c2Var4;
                    o7Var2 = o7Var4;
                    this.N0.r0(null, null, ic.g(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    o7Var2 = o7Var4;
                    c2Var = c2Var4;
                    d5Var3 = t10;
                    this.N0.r0(null, null, ic.g(str2), s10, null, 0L, null, null, 0);
                }
                y2Var2.b = d5Var3;
                y2Var2.j = null;
                y2Var2.i = null;
                y2Var2.a = null;
                y2Var2.d = false;
                y2Var2.e = y2Var2.m();
                TL_stories.StoryItem storyItem18 = y2Var2.a;
                y2Var2.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                e2Var.c(null, s6.a(d5Var3.c), lyVar);
                y2Var2.c = storyItem;
                this.D2 = false;
                this.C2 = false;
                this.B2 = false;
                z13 = z55;
                o7Var = o7Var2;
            } else {
                storyItem2 = storyItem14;
                c2Var = c2Var4;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && jj.K4(messageMedia4.getDocument());
                storyItem.dialogId = this.k1;
                z13 = z55;
                c2Var.c0(z13);
                c2Var.b0(zs.g2);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.L2 = true;
                    vp.r1(this.l2).O1().p(storyItem.id, this.k1);
                } else {
                    String str3 = storyItem.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z58 = str3.toLowerCase().endsWith(".mp4");
                        }
                        if (z58) {
                            TLRPC.MessageMedia messageMedia6 = storyItem.media;
                            BitmapDrawable m10 = messageMedia6 != null ? hc.m(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (hc.D().J(ic.g(storyItem.firstFramePath).q(null, null, false) + "@" + s10, false)) {
                                    this.N0.u0(null, null, ic.g(storyItem.firstFramePath), s10, null, null, m10, 0L, null, null, 0);
                                }
                            }
                            this.N0.u0(null, null, ic.g(storyItem.attachPath), sc.e.A(s10, "_pframe"), null, null, m10, 0L, null, null, 0);
                        } else {
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            BitmapDrawable m11 = photo != null ? hc.m(photo.sizes) : null;
                            if (z13) {
                                this.N0.r0(ic.g(storyItem.attachPath), s10, ic.g(storyItem.firstFramePath), s10, m11, 0L, null, null, 0);
                            } else {
                                this.N0.r0(ic.g(storyItem.attachPath), s10, null, null, m11, 0L, null, null, 0);
                            }
                        }
                    } else {
                        Drawable t11 = ((o7Var4.O0 != null || o7Var4.N0) && (l7Var = o7Var4.s0) != null && (imageReceiver = l7Var.c) != null && l7Var.o == storyItem.id) ? imageReceiver.t() : null;
                        storyItem.dialogId = this.k1;
                        if (z58) {
                            TLRPC.PhotoSize u10 = b8.u(1000, storyItem.media.getDocument().thumbs);
                            if (t11 == null) {
                                t11 = hc.m(storyItem.media.getDocument().thumbs);
                            }
                            ic b10 = ic.b(e5.C(this.l2, storyItem));
                            String A = sc.e.A(s10, "_pframe");
                            ic c10 = ic.c(u10, storyItem.media.getDocument());
                            storyItem4 = storyItem;
                            o7Var = o7Var4;
                            this.N0.u0(null, null, b10, A, c10, s10, t11, 0L, null, storyItem4, 0);
                        } else {
                            storyItem3 = storyItem;
                            o7Var = o7Var4;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                c2Var.f();
                                storyItem3.dialogId = this.k1;
                                e2Var.d(z10 ? null : storyItem3, lyVar);
                                y2Var2.n(storyItem3);
                                z14 = (!this.L2 || (storyItem5 = y2Var2.a) == null || (storyItem5 instanceof TL_stories.TL_storyItemDeleted) || (storyItem5 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                                this.D2 = z14;
                                this.B2 = z14;
                                if (z14) {
                                    this.B2 = y2Var2.d() && y2Var2.a.isPublic;
                                }
                                if (this.B2) {
                                    TL_stories.StoryItem storyItem19 = y2Var2.a;
                                    this.B2 = storyItem19.pinned || !w5.w(this.l2, storyItem19);
                                }
                                z15 = this.B2;
                                this.C2 = z15;
                                if (z15 && this.m1) {
                                    TLRPC.Chat L0 = vp.r1(this.l2).L0(Long.valueOf(-this.k1));
                                    this.C2 = L0 == null && org.telegram.messenger.w3.t0(L0);
                                }
                                if (this.D2) {
                                    if (this.m1) {
                                        TLRPC.Chat L02 = vp.r1(this.l2).L0(Long.valueOf(-this.k1));
                                        this.D2 = (L02 == null || org.telegram.messenger.w3.K(L02, false) == null) ? false : true;
                                    } else {
                                        TLRPC.User Z1 = vp.r1(this.l2).Z1(Long.valueOf(this.k1));
                                        this.D2 = (Z1 == null || h20.n(Z1) == null || !y2Var2.a.isPublic) ? false : true;
                                    }
                                }
                                ot.k0.c(new dt(ot.t(this.l2), this.k1, storyItem3.id, 1));
                            } else {
                                if (t11 == null) {
                                    t11 = hc.m(arrayList);
                                }
                                TLRPC.PhotoSize u11 = b8.u(ConnectionsManager.DEFAULT_DATACENTER_ID, photo2.sizes);
                                b8.u(800, photo2.sizes);
                                storyItem4 = storyItem3;
                                this.N0.u0(null, null, ic.i(u11, photo2), s10, null, null, t11, 0L, null, storyItem4, 0);
                            }
                        }
                        storyItem3 = storyItem4;
                        storyItem3.dialogId = this.k1;
                        e2Var.d(z10 ? null : storyItem3, lyVar);
                        y2Var2.n(storyItem3);
                        if (!this.L2) {
                        }
                        this.D2 = z14;
                        this.B2 = z14;
                        if (z14) {
                        }
                        if (this.B2) {
                        }
                        z15 = this.B2;
                        this.C2 = z15;
                        if (z15) {
                            TLRPC.Chat L03 = vp.r1(this.l2).L0(Long.valueOf(-this.k1));
                            this.C2 = L03 == null && org.telegram.messenger.w3.t0(L03);
                        }
                        if (this.D2) {
                        }
                        ot.k0.c(new dt(ot.t(this.l2), this.k1, storyItem3.id, 1));
                    }
                }
                storyItem3 = storyItem;
                o7Var = o7Var4;
                storyItem3.dialogId = this.k1;
                e2Var.d(z10 ? null : storyItem3, lyVar);
                y2Var2.n(storyItem3);
                if (!this.L2) {
                }
                this.D2 = z14;
                this.B2 = z14;
                if (z14) {
                }
                if (this.B2) {
                }
                z15 = this.B2;
                this.C2 = z15;
                if (z15) {
                }
                if (this.D2) {
                }
                ot.k0.c(new dt(ot.t(this.l2), this.k1, storyItem3.id, 1));
            }
        }
        TL_stories.StoryItem storyItem20 = y2Var2.a;
        if (storyItem20 != null && !z10) {
            o7Var.P0 = storyItem20.id;
        }
        o7Var.n0.A();
        this.H2 = true;
        if (this.l1 || this.m1) {
            i1(false);
        }
        TL_stories.StoryItem storyItem21 = y2Var2.a;
        d5 d5Var10 = y2Var2.b;
        int i34 = storyItem21 != null ? storyItem21.id : (d5Var10 == null || (n5Var = d5Var10.c) == null) ? 0 : n5Var.f;
        if (storyItem2 != null) {
            storyItem6 = storyItem2;
            i12 = storyItem6.id;
            d5Var4 = d5Var2;
        } else {
            storyItem6 = storyItem2;
            d5Var4 = d5Var2;
            i12 = (d5Var2 == null || (n5Var2 = d5Var4.c) == null) ? 0 : n5Var2.f;
        }
        boolean z59 = i34 == i12 || !(d5Var4 == null || storyItem21 == null || !TextUtils.equals(d5Var4.e, storyItem21.attachPath));
        boolean z60 = z59 && !(this.D1 == z13 && this.C1 == z11 && this.E1 == z12);
        s0 s0Var3 = o7Var.A0;
        if (s0Var3 != null) {
            int i35 = this.z3;
            TLRPC.GroupCall groupCall = s0Var3.w;
            if (i35 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                z16 = true;
                g2Var = this.L0;
                k2Var = this.t0;
                w2Var = this.X0;
                if ((d5Var4 != null || (str = d5Var4.e) == null || !str.equals(y2Var2.f())) && (storyItem6 == null || (storyItem7 = y2Var2.a) == null || storyItem6.id != storyItem7.id)) {
                    t1Var = this.K1;
                    if (t1Var != null) {
                        if (storyItem6 != null && !TextUtils.isEmpty(t1Var.getEditField().getText())) {
                            o7.X(storyItem6.dialogId, storyItem6, this.K1.getEditField().getText());
                        }
                        this.K1.getEditField().setText(o7.I(this.k1, y2Var2.a));
                        z18 = y2Var2.f;
                        if (z18) {
                            this.K1.S0(false, false);
                        } else {
                            this.K1.S0(true, true);
                        }
                    }
                    z17 = y2Var2.f;
                    if (z17) {
                        K0();
                    }
                    lyVar.c();
                    this.F0 = 0L;
                    this.H0 = false;
                    d5Var5 = y2Var2.b;
                    if (d5Var5 == null) {
                        fi0 fi0Var = w2Var.d;
                        if (fi0Var != null) {
                            fi0Var.e(false, d5Var5.h);
                        }
                        w2Var.a.invalidate();
                    } else if (!z60) {
                        w2Var.h = 0.0f;
                    }
                    wbVar = wb.w;
                    if (wbVar != null && wbVar.h == g2Var) {
                        wbVar.b();
                    }
                    k2Var.J();
                    o0();
                    z16 = true;
                }
                if (!z16 || (d5Var4 != null && y2Var2.b == null)) {
                    w2Var.setOnSubtitleClick(null);
                    TextView[] textViewArr = w2Var.c;
                    this.z3 = 0;
                    boolean z61 = z60;
                    i13 = 2;
                    long j10 = this.k1;
                    c2Var2 = c2Var;
                    z19 = y2Var2.f;
                    U0(j10, false, z19);
                    d5Var6 = y2Var2.b;
                    if (d5Var6 == null) {
                        y2Var = y2Var2;
                        charSequence2 = d5Var6.I ? cd.K0(2131750845) : w5.u(textViewArr[0], this.D1);
                    } else if (G0()) {
                        TL_stories.StoryItem storyItem22 = y2Var2.a;
                        if (storyItem22 == null || (messageMedia2 = storyItem22.media) == null) {
                            y2Var = y2Var2;
                        } else {
                            if (messageMedia2.document != null) {
                                y2Var = y2Var2;
                                charSequence2 = cd.X(r13.date);
                            } else {
                                y2Var = y2Var2;
                                if (messageMedia2.photo != null) {
                                    charSequence2 = cd.X(r2.date);
                                }
                            }
                        }
                        charSequence2 = "";
                    } else {
                        y2Var = y2Var2;
                        TL_stories.StoryItem storyItem23 = y2Var.a;
                        if (storyItem23 == null) {
                            z20 = z16;
                            z21 = z59;
                            g2Var2 = g2Var;
                            k2Var2 = k2Var;
                            z22 = z61;
                            charSequence = null;
                        } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(cd.K0(2131748835));
                            spannableStringBuilder2.setSpan(new z(1), 0, spannableStringBuilder2.length(), 33);
                            spannableStringBuilder2.append((CharSequence) "  ");
                            s0 s0Var4 = o7Var.A0;
                            if (s0Var4 != null) {
                                TLRPC.GroupCall groupCall2 = s0Var4.w;
                                i14 = 1;
                                this.z3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                            } else {
                                i14 = 1;
                            }
                            spannableStringBuilder2.append((CharSequence) cd.I(Math.max(i14, this.z3), "LiveStoryWatching"));
                            charSequence2 = spannableStringBuilder2;
                        } else if (storyItem23.date == -1) {
                            charSequence2 = cd.K0(2131752644);
                        } else {
                            if (y2Var.i() != null) {
                                e6 i36 = y2Var.i();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                z20 = z16;
                                z21 = z59;
                                SpannableString spannableString = new SpannableString("r");
                                g2Var2 = g2Var;
                                k2Var2 = k2Var;
                                spannableString.setSpan(new dq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                spannableStringBuilder3.append((CharSequence) spannableString).append((CharSequence) " ");
                                if (i36.b != null) {
                                    org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(15.0f, this.l2, textViewArr[0]);
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(e5Var, 0, 1, 33);
                                    spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                    if (i36.b.longValue() > 0) {
                                        TLRPC.User Z12 = vp.r1(this.l2).Z1(i36.b);
                                        e5Var.e(Z12);
                                        spannableStringBuilder3.append((CharSequence) h20.p(Z12));
                                    } else {
                                        TLRPC.Chat L04 = vp.r1(this.l2).L0(Long.valueOf(-i36.b.longValue()));
                                        e5Var.b(L04);
                                        if (L04 != null) {
                                            spannableStringBuilder3.append((CharSequence) L04.title);
                                        }
                                    }
                                } else {
                                    String str4 = y2Var.a.fwd_from.from_name;
                                    if (str4 != null) {
                                        spannableStringBuilder3.append((CharSequence) str4);
                                    }
                                }
                                w2Var.setOnSubtitleClick(new rh.u1(5, this, i36));
                                SpannableString spannableString3 = new SpannableString(".");
                                qs qsVar = new qs();
                                qsVar.b = org.telegram.messenger.i0.L(1.5f);
                                qsVar.c = 5.0f;
                                spannableString3.setSpan(qsVar, 0, spannableString3.length(), 33);
                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) cd.P(y2Var.a.date));
                                spannableStringBuilder = spannableStringBuilder3;
                            } else {
                                z20 = z16;
                                z21 = z59;
                                g2Var2 = g2Var;
                                k2Var2 = k2Var;
                                if (!this.n1 || (storyItem8 = y2Var.a) == null || storyItem8.from_id == null) {
                                    String X = cd.X(y2Var.a.date);
                                    charSequence4 = X;
                                    if (y2Var.a.edited) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X);
                                        qs qsVar2 = new qs();
                                        qsVar2.b = org.telegram.messenger.i0.L(1.5f);
                                        qsVar2.c = 5.0f;
                                        valueOf.append((CharSequence) " . ").setSpan(qsVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                        valueOf.append((CharSequence) cd.K0(2131751211));
                                        charSequence4 = valueOf;
                                    }
                                    z22 = z61;
                                    charSequence = charSequence4;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    org.telegram.ui.e5 e5Var2 = new org.telegram.ui.e5(15.0f, this.l2, textViewArr[0]);
                                    SpannableString spannableString4 = new SpannableString("a");
                                    spannableString4.setSpan(e5Var2, 0, 1, 33);
                                    spannableStringBuilder4.append((CharSequence) spannableString4).append((CharSequence) " ");
                                    long o10 = org.telegram.messenger.o5.o(y2Var.a.from_id);
                                    if (o10 > 0) {
                                        TLRPC.User Z13 = vp.r1(this.l2).Z1(Long.valueOf(o10));
                                        e5Var2.e(Z13);
                                        spannableStringBuilder4.append((CharSequence) h20.p(Z13));
                                    } else {
                                        TLRPC.Chat L05 = vp.r1(this.l2).L0(Long.valueOf(-o10));
                                        e5Var2.b(L05);
                                        if (L05 != null) {
                                            spannableStringBuilder4.append((CharSequence) L05.title);
                                        }
                                    }
                                    w2Var.setOnSubtitleClick(new ih.p(this, o10, 5));
                                    SpannableString spannableString5 = new SpannableString(".");
                                    qs qsVar3 = new qs();
                                    qsVar3.b = org.telegram.messenger.i0.L(1.5f);
                                    qsVar3.c = 5.0f;
                                    spannableString5.setSpan(qsVar3, 0, spannableString5.length(), 33);
                                    spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) cd.P(y2Var.a.date));
                                    spannableStringBuilder = spannableStringBuilder4;
                                }
                            }
                            z22 = false;
                            charSequence = spannableStringBuilder;
                        }
                        if (charSequence != null) {
                            x4 x4Var2 = o7Var.O0;
                            if (x4Var2 == null || (storyItem9 = y2Var.a) == null || !x4Var2.m(storyItem9.id)) {
                                z23 = false;
                                charSequence3 = charSequence;
                            } else {
                                boolean z62 = charSequence instanceof SpannableStringBuilder;
                                CharSequence charSequence5 = charSequence;
                                if (!z62) {
                                    charSequence5 = new SpannableStringBuilder(charSequence);
                                }
                                SpannableString spannableString6 = new SpannableString("p ");
                                z23 = false;
                                spannableString6.setSpan(new dq(R.drawable.msg_pin_mini), 0, 1, 33);
                                ((SpannableStringBuilder) charSequence5).insert(0, (CharSequence) spannableString6);
                                charSequence3 = charSequence5;
                            }
                            w2Var.c(charSequence3, z22);
                        } else {
                            z23 = false;
                        }
                        p2Var = this.o0;
                        if (p2Var != null) {
                            p2Var.e(z23);
                        }
                        p2Var2 = this.p0;
                        if (p2Var2 != null) {
                            p2Var2.e(z23);
                        }
                    }
                    z20 = z16;
                    z21 = z59;
                    g2Var2 = g2Var;
                    k2Var2 = k2Var;
                    charSequence4 = charSequence2;
                    z22 = z61;
                    charSequence = charSequence4;
                    if (charSequence != null) {
                    }
                    p2Var = this.o0;
                    if (p2Var != null) {
                    }
                    p2Var2 = this.p0;
                    if (p2Var2 != null) {
                    }
                } else {
                    y2Var = y2Var2;
                    c2Var2 = c2Var;
                    z20 = z16;
                    z21 = z59;
                    g2Var2 = g2Var;
                    k2Var2 = k2Var;
                    i13 = 2;
                }
                storyItem10 = y2Var.a;
                if (storyItem6 == storyItem10 && d5Var4 == y2Var.b) {
                }
                y2Var.o();
                if ((!y2Var.g || storyItem6 != y2Var.a) && (v2Var = this.z1) != null) {
                    o7 o7Var5 = ((f7) v2Var).d;
                    o7Var5.Z0 = false;
                    o7Var5.d0();
                }
                z24 = y2Var.f;
                z25 = !z24 && (s0Var2 = o7Var.A0) != null && y2Var.k(s0Var2.g()) && o7Var.A0.b();
                if (z25 != this.p1) {
                    this.p1 = z25;
                    if (z25) {
                        x0();
                    }
                    if (this.P1 != null && (this.o1 || this.p1)) {
                        f1();
                    }
                    t1 t1Var4 = this.K1;
                    if (t1Var4 != null) {
                        if (this.o1) {
                            z52 = y2Var.f;
                        }
                        if (!this.p1) {
                            z51 = true;
                            t1Var4.setEnabled(z51);
                            z50 = true;
                            this.K1.O1(true);
                        }
                        z51 = false;
                        t1Var4.setEnabled(z51);
                        z50 = true;
                        this.K1.O1(true);
                    } else {
                        z50 = true;
                    }
                    p0(z50);
                }
                linearLayout = this.P1;
                int i37 = 8;
                if (linearLayout != null) {
                    if (this.o1) {
                        z49 = y2Var.f;
                    }
                    if (!this.p1) {
                        i31 = 8;
                        linearLayout.setVisibility(i31);
                    }
                    i31 = 0;
                    linearLayout.setVisibility(i31);
                }
                z26 = this.L2;
                LinearLayout linearLayout2 = this.x0;
                if (z26) {
                    TLRPC.Chat L06 = this.k1 < 0 ? vp.r1(this.l2).L0(Long.valueOf(-this.k1)) : null;
                    z27 = y2Var.f;
                    if (z27) {
                        if (this.K1 == null) {
                            t0();
                        }
                        s0();
                        w0();
                        v0();
                        i15 = 0;
                        this.K1.setVisibility(0);
                    } else {
                        if ((h20.A(this.k1) || G0()) && (t1Var2 = this.K1) != null) {
                            t1Var2.setVisibility(8);
                        } else if (!this.l1 && ((!this.m1 || (this.n1 && (org.telegram.messenger.w3.q(L06) || org.telegram.messenger.w3.s0(L06)))) && (t1Var3 = this.K1) != null)) {
                            i15 = 0;
                            t1Var3.setVisibility(0);
                        }
                        i15 = 0;
                    }
                    t1 t1Var5 = this.K1;
                    if (t1Var5 != null) {
                        z32 = y2Var.f;
                        t1Var5.setOnSendButtonLongClick(z32 ? new h1(this, i15) : null);
                        t1 t1Var6 = this.K1;
                        z33 = y2Var.f;
                        B0(true);
                        t1Var6.g1(z33);
                        t1 t1Var7 = this.K1;
                        z34 = y2Var.f;
                        t1Var7.m1(z34 && !B0(true) && (this.e2 || this.K1.W0), true);
                    }
                    if (this.o1 && this.P1 == null) {
                        x0();
                    }
                    if (this.P1 != null) {
                        if (this.o1 || this.p1) {
                            f1();
                        }
                        LinearLayout linearLayout3 = this.P1;
                        if (this.o1) {
                            z31 = y2Var.f;
                        }
                        if (!this.p1) {
                            i17 = 8;
                            linearLayout3.setVisibility(i17);
                        }
                        i17 = 0;
                        linearLayout3.setVisibility(i17);
                    }
                    t1 t1Var8 = this.K1;
                    if (t1Var8 != null) {
                        if (this.o1) {
                            z30 = y2Var.f;
                        }
                        if (!this.p1) {
                            z29 = true;
                            t1Var8.setEnabled(z29);
                        }
                        z29 = false;
                        t1Var8.setEnabled(z29);
                    }
                    b2 b2Var = this.F1;
                    if (b2Var != null) {
                        if (this.l1) {
                            z28 = y2Var.f;
                            if (!z28) {
                                i16 = 0;
                                b2Var.setVisibility(i16);
                            }
                        }
                        i16 = 8;
                        b2Var.setVisibility(i16);
                    }
                    FrameLayout frameLayout = this.J2;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (h20.A(this.k1)) {
                        y0();
                        this.K2.setVisibility(0);
                    } else {
                        el0 el0Var = this.K2;
                        if (el0Var != null) {
                            el0Var.setVisibility(8);
                        }
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(G0() ? 8 : 0);
                    }
                } else {
                    A0();
                    y0();
                    this.J2.setVisibility(0);
                    this.K2.setVisibility(0);
                    this.D2 = false;
                    this.C2 = false;
                    this.B2 = false;
                    t1 t1Var9 = this.K1;
                    if (t1Var9 != null) {
                        t1Var9.setVisibility(8);
                    }
                    b2 b2Var2 = this.F1;
                    if (b2Var2 != null) {
                        b2Var2.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                }
                kVar = this.L1;
                if (kVar != null) {
                    t1 t1Var10 = this.K1;
                    if (t1Var10 != null && t1Var10.getVisibility() == 0) {
                        z48 = y2Var.f;
                        if (!z48) {
                            i30 = 0;
                            kVar.setVisibility(i30);
                        }
                    }
                    i30 = 8;
                    kVar.setVisibility(i30);
                }
                aVar = this.G1;
                p1 p1Var = this.u0;
                if (aVar != null) {
                    if (!this.L2) {
                        z47 = y2Var.f;
                        if (z47) {
                            i29 = 0;
                            aVar.setVisibility(i29);
                            this.G1.a(p1Var.g(), false);
                            this.G1.setCount(p1Var.getUnreadMessagesCount());
                        }
                    }
                    i29 = 8;
                    aVar.setVisibility(i29);
                    this.G1.a(p1Var.g(), false);
                    this.G1.setCount(p1Var.getUnreadMessagesCount());
                }
                a1Var = this.J1;
                if (a1Var != null) {
                    if (!this.L2) {
                        z46 = y2Var.f;
                        if (z46 && (s0Var = s0.W) != null && y2Var.k(s0Var.g())) {
                            i28 = 0;
                            a1Var.setVisibility(i28);
                            a1 a1Var2 = this.J1;
                            s0 s0Var5 = s0.W;
                            a1Var2.b(s0Var5 == null && s0Var5.o(), true);
                            a1 a1Var3 = this.J1;
                            s0 s0Var6 = s0.W;
                            a1Var3.a(s0Var6 != null || s0Var6.m(), true);
                        }
                    }
                    i28 = 8;
                    a1Var.setVisibility(i28);
                    a1 a1Var22 = this.J1;
                    s0 s0Var52 = s0.W;
                    a1Var22.b(s0Var52 == null && s0Var52.o(), true);
                    a1 a1Var32 = this.J1;
                    s0 s0Var62 = s0.W;
                    a1Var32.a(s0Var62 != null || s0Var62.m(), true);
                }
                if (this.I1 != null) {
                    d1 d1Var = this.H1;
                    if (!this.L2) {
                        z45 = y2Var.f;
                        if (z45) {
                            i26 = 0;
                            d1Var.setVisibility(i26);
                            e1 e1Var = this.I1;
                            if (!this.L2) {
                                z44 = y2Var.f;
                                if (z44) {
                                    i27 = 0;
                                    e1Var.setVisibility(i27);
                                    layoutParams = (FrameLayout.LayoutParams) this.I1.getLayoutParams();
                                    a1 a1Var4 = this.J1;
                                    L = org.telegram.messenger.i0.L((a1Var4 == null && a1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != L) {
                                        layoutParams.rightMargin = L;
                                        this.I1.setLayoutParams(layoutParams);
                                    }
                                }
                            }
                            i27 = 8;
                            e1Var.setVisibility(i27);
                            layoutParams = (FrameLayout.LayoutParams) this.I1.getLayoutParams();
                            a1 a1Var42 = this.J1;
                            L = org.telegram.messenger.i0.L((a1Var42 == null && a1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != L) {
                            }
                        }
                    }
                    i26 = 8;
                    d1Var.setVisibility(i26);
                    e1 e1Var2 = this.I1;
                    if (!this.L2) {
                    }
                    i27 = 8;
                    e1Var2.setVisibility(i27);
                    layoutParams = (FrameLayout.LayoutParams) this.I1.getLayoutParams();
                    a1 a1Var422 = this.J1;
                    L = org.telegram.messenger.i0.L((a1Var422 == null && a1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                    if (layoutParams.rightMargin != L) {
                    }
                }
                z35 = y2Var.f;
                if (!z35 || ((y2Var.h == null && y2Var.i() == null && y2Var.g() == null) || this.L2)) {
                    k2 k2Var3 = k2Var2;
                    if (this.t1) {
                        o7 o7Var6 = ((f7) this.z1).d;
                        o7Var6.L0 = false;
                        o7Var6.d0();
                        v2 v2Var2 = this.z1;
                        this.S2 = false;
                        ((f7) v2Var2).e();
                    }
                    k2Var3.setVisibility(8);
                } else {
                    k2 k2Var4 = k2Var2;
                    k2Var4.b0.b(y2Var.h, y2Var.i(), y2Var.g(), o7Var.Z0 && !y2Var.g && (storyItem13 = y2Var.a) != null && storyItem13.translated, storyItem6 == y2Var.a);
                    k2Var4.setVisibility(0);
                }
                storyItem11 = y2Var.a;
                if (storyItem11 != null) {
                    TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                    if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                        if (p1Var.r(this.k1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                            p1Var.q(false, false);
                            this.u3 = 0L;
                            t1 t1Var11 = this.K1;
                            if (t1Var11 != null) {
                                t1Var11.F(true);
                                this.K1.Q1();
                                p0(true);
                            }
                        }
                        p1Var.setVisibility(0);
                        g2Var2.invalidate();
                        if (this.z1 != null && I0()) {
                            ((f7) this.z1).a(this.s1, this.k1);
                        }
                        z36 = this.m1;
                        b2 b2Var3 = this.y0;
                        ImageView imageView3 = this.w0;
                        b2 b2Var4 = this.m0;
                        if (z36) {
                            if (this.B2) {
                                z43 = y2Var.f;
                                if (!z43) {
                                    i23 = 0;
                                    imageView3.setVisibility(i23);
                                    if (b2Var3 != null) {
                                        if (this.C2) {
                                            z42 = y2Var.f;
                                            if (!z42) {
                                                i25 = 0;
                                                b2Var3.setVisibility(i25);
                                            }
                                        }
                                        i25 = 8;
                                        b2Var3.setVisibility(i25);
                                    }
                                    if (!this.E1) {
                                        z41 = y2Var.f;
                                        if (!z41) {
                                            i24 = 0;
                                            b2Var4.setVisibility(i24);
                                        }
                                    }
                                    i24 = 8;
                                    b2Var4.setVisibility(i24);
                                }
                            }
                            i23 = i11;
                            imageView3.setVisibility(i23);
                            if (b2Var3 != null) {
                            }
                            if (!this.E1) {
                            }
                            i24 = 8;
                            b2Var4.setVisibility(i24);
                        } else {
                            if (this.B2) {
                                z38 = y2Var.f;
                                if (!z38) {
                                    i18 = 0;
                                    imageView3.setVisibility(i18);
                                    if (b2Var3 != null) {
                                        b2Var3.setVisibility(8);
                                    }
                                    if (!this.l1) {
                                        z37 = y2Var.f;
                                        if (!z37) {
                                            i19 = 0;
                                            b2Var4.setVisibility(i19);
                                            b2Var4.getLayoutParams().width = org.telegram.messenger.i0.L(40.0f);
                                        }
                                    }
                                    i19 = 8;
                                    b2Var4.setVisibility(i19);
                                    b2Var4.getLayoutParams().width = org.telegram.messenger.i0.L(40.0f);
                                }
                            }
                            i18 = i11;
                            imageView3.setVisibility(i18);
                            if (b2Var3 != null) {
                            }
                            if (!this.l1) {
                            }
                            i19 = 8;
                            b2Var4.setVisibility(i19);
                            b2Var4.getLayoutParams().width = org.telegram.messenger.i0.L(40.0f);
                        }
                        b2Var4.requestLayout();
                        o7Var.e1.append(this.k1, i10);
                        if (this.t1) {
                            P0(0L);
                            e1();
                            c2Var2.b();
                        }
                        p1Var.setLivePlayer(o7Var.A0);
                        this.u1 = 0;
                        if (o7Var.O0 != null && (storyItem12 = y2Var.a) != null) {
                            int i38 = storyItem12.id;
                            i22 = 0;
                            while (true) {
                                if (i22 < o7Var.O0.i.size()) {
                                    jj jjVar = (jj) o7Var.O0.i.get(i22);
                                    if (jjVar != null && jjVar.f1() == i38) {
                                        this.u1 = i22;
                                        break;
                                    }
                                    i22++;
                                } else {
                                    break;
                                }
                            }
                        }
                        int i39 = this.s1;
                        this.v1 = i39;
                        int i40 = this.j1;
                        this.w1 = i40;
                        if (o7Var.R0) {
                            this.v1 = (i40 - 1) - i39;
                        }
                        l4 = y2Var.l();
                        dg0 dg0Var = this.h0;
                        if (l4) {
                            dg0Var.setVisibility(0);
                            this.N2 = y2Var.j() ? 1.0f : 0.5f;
                            boolean j11 = y2Var.j();
                            ImageView imageView4 = this.j0;
                            ei0 ei0Var = this.i0;
                            if (j11) {
                                ei0Var.setVisibility(0);
                                imageView4.setVisibility(8);
                                dg0Var.setContentDescription(cd.K0(!o7.D1 ? 2131748329 : 2131743874));
                            } else {
                                ei0Var.setVisibility(8);
                                imageView4.setVisibility(0);
                                dg0Var.setContentDescription(cd.K0(2131748167));
                            }
                            dg0Var.setAlpha((1.0f - this.N3) * this.N2);
                        } else {
                            dg0Var.setVisibility(8);
                        }
                        d5Var7 = y2Var.b;
                        t6 t6Var = this.l0;
                        if (d5Var7 != null) {
                            t6Var.b(this.l1, d5Var7, z21 && this.L3);
                        } else {
                            TL_stories.StoryItem storyItem24 = y2Var.a;
                            if (storyItem24 != null) {
                                t6Var.a(this.l1, storyItem24, z21 && this.L3);
                            } else {
                                t6Var.a(this.l1, null, z21 && this.L3);
                            }
                        }
                        this.L3 = false;
                        t6Var.setTranslationX(dg0Var.getVisibility() == 0 ? -org.telegram.messenger.i0.L(44.0f) : 0.0f);
                        if (z20) {
                            this.Z2 = false;
                            TL_stories.StoryItem storyItem25 = y2Var.a;
                            if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                this.n0.setReaction(null);
                            } else {
                                this.n0.setReaction(sg.o0.d(reaction));
                            }
                        }
                        d5Var8 = y2Var.b;
                        if (d5Var8 == null && d5Var8.I) {
                            u0();
                            this.S1.set(y2Var.b.c.x);
                            this.S1.setVisibility(0);
                            ViewPropertyAnimator viewPropertyAnimator = this.T1;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.T1 = null;
                            }
                            if (z21) {
                                ViewPropertyAnimator interpolator = this.S1.animate().alpha(1.0f).setDuration(180L).setInterpolator(gr.h);
                                this.T1 = interpolator;
                                interpolator.start();
                            } else {
                                this.S1.setAlpha(1.0f);
                            }
                        } else if (this.S1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator2 = this.T1;
                            if (viewPropertyAnimator2 != null) {
                                viewPropertyAnimator2.cancel();
                                this.T1 = null;
                            }
                            if (z21 && this.S1.getVisibility() == 0) {
                                ViewPropertyAnimator withEndAction = this.S1.animate().alpha(0.0f).setDuration(180L).setInterpolator(gr.h).withEndAction(new i1(this, 0));
                                this.T1 = withEndAction;
                                withEndAction.start();
                            } else {
                                this.S1.setAlpha(0.0f);
                                this.S1.setVisibility(8);
                            }
                        }
                        this.g1.a(o7.D1, false);
                        if (this.t1 && y2Var.a != null) {
                            f8.b("StoryViewer displayed story dialogId=" + this.k1 + " storyId=" + y2Var.a.id + " " + y2.c(y2Var));
                        }
                        if (this.l1) {
                            y3.f(this.l2, this.k1, y2Var.a);
                        }
                        og.c cVar = w2Var.b;
                        x4 x4Var3 = o7Var.O0;
                        cVar.setPadding(0, 0, (x4Var3 != null || x4Var3.g() == this.w1) ? 0 : org.telegram.messenger.i0.L(56.0f), 0);
                        vp.r1(this.l2).S1().l(y2Var.a);
                        if (!z10 && !this.l1 && this.i3 == null && !tz.T && tz.U) {
                            i1 i1Var = new i1(this, 1);
                            this.i3 = i1Var;
                            org.telegram.messenger.i0.h3(i1Var, 500L);
                        }
                        p2Var3 = this.p0;
                        if (!(p2Var3 == null && p2Var3.V) && y2Var.j() && o7.D1) {
                            i20 = 0;
                            if (vp.d1().getInt("taptostorysoundhint", 0) < i13) {
                                i1 i1Var2 = this.A3;
                                org.telegram.messenger.i0.r(i1Var2);
                                org.telegram.messenger.i0.h3(i1Var2, 250L);
                            }
                        } else {
                            i20 = 0;
                        }
                        imageView = this.f0;
                        if (imageView != null) {
                            if (G0() && !H0()) {
                                z40 = y2Var.e;
                                if (!z40) {
                                    i21 = 8;
                                    imageView.setVisibility(i21);
                                }
                            }
                            i21 = i20;
                            imageView.setVisibility(i21);
                        }
                        imageView2 = this.g0;
                        if (imageView2 != null) {
                            z39 = y2Var.f;
                            if (z39 && !t6Var.f) {
                                i37 = i20;
                            }
                            imageView2.setVisibility(i37);
                            return;
                        }
                        return;
                    }
                }
                p1Var.r(this.k1, null);
                p1Var.setVisibility(8);
                g2Var2.invalidate();
                if (this.z1 != null) {
                    ((f7) this.z1).a(this.s1, this.k1);
                }
                z36 = this.m1;
                b2 b2Var32 = this.y0;
                ImageView imageView32 = this.w0;
                b2 b2Var42 = this.m0;
                if (z36) {
                }
                b2Var42.requestLayout();
                o7Var.e1.append(this.k1, i10);
                if (this.t1) {
                }
                p1Var.setLivePlayer(o7Var.A0);
                this.u1 = 0;
                if (o7Var.O0 != null) {
                    int i382 = storyItem12.id;
                    i22 = 0;
                    while (true) {
                        if (i22 < o7Var.O0.i.size()) {
                        }
                        i22++;
                    }
                }
                int i392 = this.s1;
                this.v1 = i392;
                int i402 = this.j1;
                this.w1 = i402;
                if (o7Var.R0) {
                }
                l4 = y2Var.l();
                dg0 dg0Var2 = this.h0;
                if (l4) {
                }
                d5Var7 = y2Var.b;
                t6 t6Var2 = this.l0;
                if (d5Var7 != null) {
                }
                this.L3 = false;
                t6Var2.setTranslationX(dg0Var2.getVisibility() == 0 ? -org.telegram.messenger.i0.L(44.0f) : 0.0f);
                if (z20) {
                }
                d5Var8 = y2Var.b;
                if (d5Var8 == null) {
                }
                if (this.S1 != null) {
                }
                this.g1.a(o7.D1, false);
                if (this.t1) {
                    f8.b("StoryViewer displayed story dialogId=" + this.k1 + " storyId=" + y2Var.a.id + " " + y2.c(y2Var));
                }
                if (this.l1) {
                }
                og.c cVar2 = w2Var.b;
                x4 x4Var32 = o7Var.O0;
                cVar2.setPadding(0, 0, (x4Var32 != null || x4Var32.g() == this.w1) ? 0 : org.telegram.messenger.i0.L(56.0f), 0);
                vp.r1(this.l2).S1().l(y2Var.a);
                if (!z10) {
                    i1 i1Var3 = new i1(this, 1);
                    this.i3 = i1Var3;
                    org.telegram.messenger.i0.h3(i1Var3, 500L);
                }
                p2Var3 = this.p0;
                if (p2Var3 == null) {
                }
                i20 = 0;
                if (vp.d1().getInt("taptostorysoundhint", 0) < i13) {
                }
                imageView = this.f0;
                if (imageView != null) {
                }
                imageView2 = this.g0;
                if (imageView2 != null) {
                }
            }
        }
        z16 = false;
        g2Var = this.L0;
        k2Var = this.t0;
        w2Var = this.X0;
        if (d5Var4 != null) {
        }
        t1Var = this.K1;
        if (t1Var != null) {
        }
        z17 = y2Var2.f;
        if (z17) {
        }
        lyVar.c();
        this.F0 = 0L;
        this.H0 = false;
        d5Var5 = y2Var2.b;
        if (d5Var5 == null) {
        }
        wbVar = wb.w;
        if (wbVar != null) {
            wbVar.b();
        }
        k2Var.J();
        o0();
        z16 = true;
        if (z16) {
        }
        w2Var.setOnSubtitleClick(null);
        TextView[] textViewArr2 = w2Var.c;
        this.z3 = 0;
        boolean z612 = z60;
        i13 = 2;
        long j102 = this.k1;
        c2Var2 = c2Var;
        z19 = y2Var2.f;
        U0(j102, false, z19);
        d5Var6 = y2Var2.b;
        if (d5Var6 == null) {
        }
        z20 = z16;
        z21 = z59;
        g2Var2 = g2Var;
        k2Var2 = k2Var;
        charSequence4 = charSequence2;
        z22 = z612;
        charSequence = charSequence4;
        if (charSequence != null) {
        }
        p2Var = this.o0;
        if (p2Var != null) {
        }
        p2Var2 = this.p0;
        if (p2Var2 != null) {
        }
        storyItem10 = y2Var.a;
        if (storyItem6 == storyItem10) {
        }
        y2Var.o();
        if (!y2Var.g) {
        }
        o7 o7Var52 = ((f7) v2Var).d;
        o7Var52.Z0 = false;
        o7Var52.d0();
        z24 = y2Var.f;
        if (z24) {
        }
        if (z25 != this.p1) {
        }
        linearLayout = this.P1;
        int i372 = 8;
        if (linearLayout != null) {
        }
        z26 = this.L2;
        LinearLayout linearLayout22 = this.x0;
        if (z26) {
        }
        kVar = this.L1;
        if (kVar != null) {
        }
        aVar = this.G1;
        p1 p1Var2 = this.u0;
        if (aVar != null) {
        }
        a1Var = this.J1;
        if (a1Var != null) {
        }
        if (this.I1 != null) {
        }
        z35 = y2Var.f;
        if (z35) {
        }
        k2 k2Var32 = k2Var2;
        if (this.t1) {
        }
        k2Var32.setVisibility(8);
        storyItem11 = y2Var.a;
        if (storyItem11 != null) {
        }
        p1Var2.r(this.k1, null);
        p1Var2.setVisibility(8);
        g2Var2.invalidate();
        if (this.z1 != null) {
        }
        z36 = this.m1;
        b2 b2Var322 = this.y0;
        ImageView imageView322 = this.w0;
        b2 b2Var422 = this.m0;
        if (z36) {
        }
        b2Var422.requestLayout();
        o7Var.e1.append(this.k1, i10);
        if (this.t1) {
        }
        p1Var2.setLivePlayer(o7Var.A0);
        this.u1 = 0;
        if (o7Var.O0 != null) {
        }
        int i3922 = this.s1;
        this.v1 = i3922;
        int i4022 = this.j1;
        this.w1 = i4022;
        if (o7Var.R0) {
        }
        l4 = y2Var.l();
        dg0 dg0Var22 = this.h0;
        if (l4) {
        }
        d5Var7 = y2Var.b;
        t6 t6Var22 = this.l0;
        if (d5Var7 != null) {
        }
        this.L3 = false;
        t6Var22.setTranslationX(dg0Var22.getVisibility() == 0 ? -org.telegram.messenger.i0.L(44.0f) : 0.0f);
        if (z20) {
        }
        d5Var8 = y2Var.b;
        if (d5Var8 == null) {
        }
        if (this.S1 != null) {
        }
        this.g1.a(o7.D1, false);
        if (this.t1) {
        }
        if (this.l1) {
        }
        og.c cVar22 = w2Var.b;
        x4 x4Var322 = o7Var.O0;
        cVar22.setPadding(0, 0, (x4Var322 != null || x4Var322.g() == this.w1) ? 0 : org.telegram.messenger.i0.L(56.0f), 0);
        vp.r1(this.l2).S1().l(y2Var.a);
        if (!z10) {
        }
        p2Var3 = this.p0;
        if (p2Var3 == null) {
        }
        i20 = 0;
        if (vp.d1().getInt("taptostorysoundhint", 0) < i13) {
        }
        imageView = this.f0;
        if (imageView != null) {
        }
        imageView2 = this.g0;
        if (imageView2 != null) {
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s0 s0Var;
        int i12 = zs.v5;
        o7 o7Var = this.s0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == zs.x5 && o7Var.O0 == objArr[0])) {
            v2 v2Var = this.z1;
            if (v2Var == null || !((f7) v2Var).d.H0) {
                if (this.t1) {
                    h1();
                    if (this.j1 == 0) {
                        if (this.n2) {
                            return;
                        }
                        this.n2 = true;
                        ((f7) this.z1).j();
                        return;
                    }
                    int i13 = this.s1;
                    ArrayList arrayList = this.e1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.f1;
                    if (i13 >= arrayList2.size() + size) {
                        this.s1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    d1(false);
                    if (this.l1 || this.m1) {
                        i1(true);
                    }
                }
                TL_stories.PeerStories peerStories = o7Var.Q0;
                if (peerStories != null) {
                    this.B1.V(peerStories, true);
                } else {
                    long j10 = this.k1;
                    if (j10 != 0) {
                        e5 e5Var = this.B1;
                        TL_stories.PeerStories y3 = e5Var.y(j10);
                        if (y3 == null) {
                            y3 = e5Var.z(j10);
                            z10 = true;
                        }
                        e5Var.V(y3, z10);
                    }
                }
                org.telegram.ui.ActionBar.b1 b1Var = this.b1;
                if (b1Var != null) {
                    b1Var.animate().alpha((this.B1.M(this.k1) && this.x1.e && !tz.b()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == zs.m3) {
            d1(false);
            return;
        }
        if (i10 == zs.i4) {
            this.t0.b0.invalidate();
            return;
        }
        if (i10 == zs.D5) {
            p0(true);
            return;
        }
        if (i10 == zs.b3) {
            j4.w o10 = vp.r1(this.l2).O1().o();
            if (o10 == null || !o10.a(this.l2, 1) || this.z1 == null) {
                return;
            }
            kg.q1 q1Var = new kg.q1(this, 10);
            Context W = org.telegram.messenger.i0.W(getContext());
            if (W == null) {
                W = LaunchActivity.I1;
            }
            ((f7) this.z1).h(new kg.q0(o10.b(), this.l2, W, q1Var, null));
            return;
        }
        if (i10 == zs.i3) {
            TL_account.RequirementToContact H2 = vp.r1(this.l2).H2(this.k1);
            boolean z11 = this.k1 >= 0 && !d20.i(this.l2).q() && (H2 instanceof TL_account.requirementToContactPremium);
            if (this.o1 == z11 && this.q1 == org.telegram.messenger.o5.k(H2)) {
                return;
            }
            this.o1 = z11;
            this.q1 = org.telegram.messenger.o5.k(H2);
            d1(false);
            p0(true);
            return;
        }
        if (i10 == zs.T) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.k1 == (-((TLRPC.ChatFull) obj).id)) {
                d1(false);
                return;
            }
            return;
        }
        if (i10 != zs.G2) {
            if (i10 == zs.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (o7Var == null || (s0Var = o7Var.A0) == null || s0Var.g() != longValue) {
            return;
        }
        d1(false);
        t1 t1Var = this.K1;
        if (t1Var != null) {
            t1Var.F(true);
            this.K1.O1(true);
            p0(true);
        }
        p1 p1Var = this.u0;
        if (p1Var != null) {
            s0 s0Var2 = p1Var.P;
            if (p1Var.H != (s0Var2 != null ? s0Var2.j() : 0L)) {
                p1Var.e.O(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        pd pdVar;
        Canvas canvas2;
        org.telegram.ui.Components.e6 e6Var;
        org.telegram.ui.Components.e6 e6Var2;
        j1();
        if (this.m1 && (e6Var2 = this.z0) != null) {
            e6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(40.0f));
        }
        if (this.m1 && (e6Var = this.A0) != null) {
            e6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.d3;
        LinearLayout linearLayout = this.x0;
        b2 b2Var = this.m0;
        if (z10) {
            float measuredWidth = (b2Var.getMeasuredWidth() / 2.0f) + b2Var.getX() + linearLayout.getX();
            float measuredHeight = (b2Var.getMeasuredHeight() / 2.0f) + b2Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.i0.L(24.0f);
            float f7 = L / 2.0f;
            float T1 = org.telegram.messenger.i0.T1(this.f3, measuredWidth - f7, gr.g.getInterpolation(this.e3));
            float T12 = org.telegram.messenger.i0.T1(this.g3, measuredHeight - f7, this.e3);
            int W1 = org.telegram.messenger.i0.W1(this.e3, this.h3, L);
            if (this.Y2) {
                org.telegram.ui.Components.f5 f5Var = this.X2;
                if (f5Var != null) {
                    float f10 = W1;
                    f5Var.setBounds((int) T1, (int) T12, (int) (T1 + f10), (int) (T12 + f10));
                    this.X2.draw(canvas);
                }
            } else {
                float f11 = W1;
                ImageReceiver imageReceiver = this.W2;
                imageReceiver.y0(T1, T12, f11, f11);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.Z2) {
            float measuredWidth2 = (b2Var.getMeasuredWidth() / 2.0f) + b2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (b2Var.getMeasuredHeight() / 2.0f) + b2Var.getY() + linearLayout.getY();
            int L2 = org.telegram.messenger.i0.L(120.0f);
            if (this.Y2) {
                sg.d dVar = this.V2;
                if (dVar != null) {
                    float f12 = L2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f12), (int) (measuredHeight2 - f12), (int) (measuredWidth2 + f12), (int) (measuredHeight2 + f12));
                    this.V2.b(canvas);
                    if (this.V2.c()) {
                        this.V2.d(this);
                        this.V2 = null;
                        this.Z2 = false;
                    }
                } else {
                    this.Z2 = false;
                }
            } else {
                float f13 = L2;
                float f14 = f13 / 2.0f;
                float f15 = measuredWidth2 - f14;
                float f16 = measuredHeight2 - f14;
                ImageReceiver imageReceiver2 = this.U2;
                imageReceiver2.y0(f15, f16, f13, f13);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.B() != null && imageReceiver2.B().A()) {
                    this.Z2 = false;
                }
            }
        }
        t1 t1Var = this.K1;
        if (t1Var != null) {
            pd pdVar2 = t1Var.y1;
            pd pdVar3 = t1Var.z1;
            if (t1Var.getAlpha() == 0.0f || (pdVar = t1Var.e1) == null || pdVar.getParent() == null || t1Var.e1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(t1Var.e1.getX() + pdVar2.getX() + pdVar3.getX() + t1Var.getX(), t1Var.e1.getY() + pdVar2.getY() + pdVar3.getY() + t1Var.getY());
            if (t1Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, t1Var.getMeasuredWidth(), t1Var.getMeasuredHeight(), (int) (t1Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            t1Var.e1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        hi.f fVar;
        float L;
        if (view == this.M2) {
            canvas.save();
            canvas.clipRect(0.0f, this.M2.getY(), getMeasuredWidth(), this.M2.getY() + this.M2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        t1 t1Var = this.K1;
        Paint paint = this.W1;
        b2 b2Var = this.m0;
        x2 x2Var = this.g1;
        if (view == t1Var) {
            float f7 = this.Z1;
            y2 y2Var = this.x1;
            if (f7 > 0.0f && !y2Var.f) {
                x2Var.l.setAlpha((int) (f7 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x2Var.l);
            }
            RectF rectF = x2Var.h;
            RectF rectF2 = x2Var.i;
            RectF rectF3 = x2Var.j;
            rectF.set(this.K1.getX(), this.K1.getY() + this.K1.getAnimatedTop() + org.telegram.messenger.i0.L(1.33f), this.K1.getX() + this.K1.getMeasuredWidth(), this.K1.getY() + this.K1.getMeasuredHeight());
            float L2 = org.telegram.messenger.i0.L(40.0f);
            if (y2Var.f) {
                L = org.telegram.messenger.i0.L(46.0f);
                L2 = org.telegram.messenger.i0.L(46.0f);
                a1 a1Var = this.J1;
                if (a1Var != null && a1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.i0.L(46.0f);
                }
            } else {
                if (this.B2) {
                    L2 += org.telegram.messenger.i0.L(46.0f);
                }
                if (this.C2 && this.m1) {
                    L2 += org.telegram.messenger.i0.L(46.0f);
                }
                if (b2Var != null && b2Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.i0.L(40.0f)) + b2Var.getLayoutParams().width;
                }
                L = 0.0f;
            }
            rectF2.set(org.telegram.messenger.i0.L(10.0f) + L, ((this.K1.getY() + this.K1.getMeasuredHeight()) - org.telegram.messenger.i0.L(5.0f)) - org.telegram.messenger.i0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.i0.L(10.0f)) - L2, (this.K1.getY() + this.K1.getMeasuredHeight()) - org.telegram.messenger.i0.L(5.0f));
            this.K1.setTranslationX((1.0f - this.Z1) * L);
            this.K1.getEditField().setTranslationY(c3.i0.z(1.0f, this.Z1, -org.telegram.messenger.i0.L(2.0f), this.K1.getMeasuredHeight() > org.telegram.messenger.i0.L(50.0f) ? ((1.0f - this.Z1) * (this.K1.getMeasuredHeight() - org.telegram.messenger.i0.L(50.0f))) + 0.0f : 0.0f));
            float L3 = org.telegram.messenger.i0.L(50.0f) / 2.0f;
            org.telegram.messenger.i0.Z1(rectF2, x2Var.h, this.Z1, rectF3);
            vg.f fVar2 = this.U1;
            if (fVar2 != null) {
                fVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                fVar2.q(L3);
                fVar2.setAlpha((int) ((1.0f - this.N3) * (1.0f - this.a2) * 255.0f * getHideInterfaceAlpha()));
                fVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.Z1 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (t1Var != null && t1Var.r0(view)) {
                float L4 = org.telegram.messenger.i0.L(30.0f);
                RectF rectF4 = x2Var.k;
                RectF rectF5 = x2Var.k;
                rectF4.set(0.0f, view.getY() + org.telegram.messenger.i0.L(1.0f), getWidth(), org.telegram.messenger.i0.L(20.0f) + getHeight());
                Path path = this.K3;
                path.rewind();
                path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                vg.f fVar3 = this.V1;
                if (fVar3 != null) {
                    fVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    fVar3.r(L4, L4, L4, L4);
                    fVar3.setAlpha(zs.e4);
                    fVar3.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, L4, L4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.O1 || this.K1 == null) {
                if (view == this.a3) {
                    view.setTranslationY((this.x0.getY() + (b2Var.getY() + (-(r2.getMeasuredHeight() - this.a3.getPaddingBottom())))) - org.telegram.messenger.i0.L(18.0f));
                } else {
                    g2 g2Var = this.L0;
                    if (view == g2Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.q3) != null && !fVar.r) {
                        RecordingCanvas b10 = fVar.b(getMeasuredWidth(), getMeasuredHeight());
                        b10.drawColor(i0.b.f(0.2f, -16777216, -1));
                        b10.translate(g2Var.getX(), g2Var.getY());
                        view.draw(b10);
                        fVar.c();
                    }
                }
            } else {
                view.setTranslationY(((this.K1.getY() + this.K1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - org.telegram.messenger.i0.L(18.0f));
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1() {
        ArrayList arrayList;
        int i10;
        int i11;
        ImageReceiver imageReceiver;
        boolean isEmpty;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i12;
        TL_stories.StoryItem storyItem;
        String str;
        int i13;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        String str2;
        int i14;
        ArrayList arrayList7;
        int i15;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String sb2;
        int max = (int) (Math.max(org.telegram.messenger.i0.c1().x, org.telegram.messenger.i0.c1().y) / org.telegram.messenger.i0.p);
        String i16 = a1.g.i(max, max, "_");
        ArrayList arrayList11 = this.B3;
        arrayList11.clear();
        ArrayList arrayList12 = this.C3;
        arrayList12.clear();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.Q0;
            if (i18 >= arrayList.size()) {
                break;
            }
            ((sg.f0) arrayList.get(i18)).b(false);
            i18++;
        }
        arrayList.clear();
        int i19 = 0;
        while (i19 < 2) {
            int i20 = this.s1;
            if (i19 == 0) {
                i11 = i20 - 1;
                imageReceiver = this.O0;
                if (i11 < 0) {
                    imageReceiver.f();
                    arrayList7 = arrayList11;
                    arrayList9 = arrayList;
                    i15 = i19;
                    arrayList8 = arrayList12;
                    i19 = i15 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i17 = 0;
                }
                ArrayList arrayList13 = this.f1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.e1;
                if (isEmpty && i11 >= arrayList2.size()) {
                    T0((d5) arrayList13.get(i11 - arrayList2.size()), imageReceiver, i16);
                } else if (!arrayList2.isEmpty()) {
                    if (i11 < 0) {
                        i11 = i17;
                    }
                    if (i11 >= arrayList2.size()) {
                        i11 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i11);
                    long j10 = this.k1;
                    storyItem2.dialogId = j10;
                    d5 t10 = this.B1.t(j10, storyItem2);
                    if (t10 != null) {
                        T0(t10, imageReceiver, i16);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList;
                        i12 = i19;
                        str = null;
                        storyItem = storyItem2;
                        i13 = 1;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        int i21 = (messageMedia == null || !jj.K4(messageMedia.getDocument())) ? i17 : 1;
                        String str3 = storyItem2.attachPath;
                        if (str3 != null) {
                            int i22 = i21;
                            if (storyItem2.media == null) {
                                i22 = str3.toLowerCase().endsWith(".mp4");
                            }
                            if (i22 != 0) {
                                str2 = null;
                                i14 = 1;
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i12 = i19;
                                imageReceiver.u0(ic.g(storyItem2.attachPath), sc.e.A(i16, "_pframe"), ic.g(storyItem2.firstFramePath), i16, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i12 = i19;
                                str2 = null;
                                i14 = 1;
                                String str4 = i16;
                                imageReceiver.r0(ic.g(storyItem2.attachPath), str4, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                i16 = str4;
                            }
                            str = str2;
                            i13 = i14;
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i12 = i19;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (i21 != 0) {
                                TLRPC.PhotoSize w9 = b8.w(storyItem2.media.getDocument().thumbs, 1000, false, null, false);
                                ic b10 = ic.b(e5.C(this.l2, storyItem2));
                                String A = sc.e.A(i16, "_pframe");
                                ic c10 = ic.c(w9, storyItem2.media.getDocument());
                                storyItem = storyItem2;
                                str = null;
                                i13 = 1;
                                imageReceiver2.u0(b10, A, c10, i16, null, null, null, 0L, null, storyItem, 0);
                            } else {
                                storyItem = storyItem2;
                                str = null;
                                i13 = 1;
                                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.f();
                                } else {
                                    TLRPC.PhotoSize w10 = b8.w(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false);
                                    b8.u(800, photo.sizes);
                                    imageReceiver2.u0(null, null, ic.i(w10, photo), i16, null, null, null, 0L, null, storyItem, 0);
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (((messageMedia3 == null || !jj.K4(messageMedia3.getDocument())) ? 0 : i13) != 0) {
                        TLRPC.Document C = e5.C(this.l2, storyItem);
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = b8.G(this.l2).F(storyItem);
                        }
                        try {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("?account=");
                            sb3.append(this.l2);
                            sb3.append("&id=");
                            sb3.append(C.id);
                            sb3.append("&hash=");
                            sb3.append(C.access_hash);
                            sb3.append("&dc=");
                            sb3.append(C.dc_id);
                            sb3.append("&size=");
                            sb3.append(C.size);
                            sb3.append("&mime=");
                            sb3.append(URLEncoder.encode(C.mime_type, "UTF-8"));
                            sb3.append("&rid=");
                            sb3.append(storyItem.fileReference);
                            sb3.append("&name=");
                            sb3.append(URLEncoder.encode(b8.B(C), "UTF-8"));
                            sb3.append("&reference=");
                            byte[] bArr = C.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb3.append(Utilities.f(bArr));
                            sb3.append("&sid=");
                            sb3.append(storyItem.id);
                            sb3.append("&did=");
                            sb3.append(storyItem.dialogId);
                            sb2 = sb3.toString();
                            arrayList7 = arrayList3;
                        } catch (UnsupportedEncodingException e) {
                            e = e;
                            arrayList7 = arrayList3;
                        }
                        try {
                            arrayList7.add(Uri.parse("tg://" + b8.r(str, C) + sb2));
                            arrayList8 = arrayList4;
                            try {
                                arrayList8.add(C);
                                i15 = i12;
                                if (i15 == i13) {
                                    try {
                                        if (org.telegram.messenger.d6.g()) {
                                            b8.G(this.l2).X(C, storyItem, i13, i13);
                                        }
                                    } catch (UnsupportedEncodingException e7) {
                                        e = e7;
                                        e.printStackTrace();
                                        if (storyItem.media_areas != null) {
                                        }
                                        arrayList9 = arrayList5;
                                        i19 = i15 + 1;
                                        arrayList11 = arrayList7;
                                        arrayList12 = arrayList8;
                                        arrayList = arrayList9;
                                        i17 = 0;
                                    }
                                }
                            } catch (UnsupportedEncodingException e10) {
                                e = e10;
                                i15 = i12;
                            }
                        } catch (UnsupportedEncodingException e11) {
                            e = e11;
                            i15 = i12;
                            arrayList8 = arrayList4;
                            e.printStackTrace();
                            if (storyItem.media_areas != null) {
                            }
                            arrayList9 = arrayList5;
                            i19 = i15 + 1;
                            arrayList11 = arrayList7;
                            arrayList12 = arrayList8;
                            arrayList = arrayList9;
                            i17 = 0;
                        }
                    } else {
                        arrayList7 = arrayList3;
                        i15 = i12;
                        arrayList8 = arrayList4;
                    }
                    if (storyItem.media_areas != null) {
                        int i23 = 0;
                        while (i23 < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(i23) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i23);
                                sg.f0 f0Var = new sg.f0(this);
                                f0Var.e(sg.o0.d(tL_mediaAreaSuggestedReaction.reaction));
                                f0Var.b(this.J0);
                                arrayList10 = arrayList5;
                                arrayList10.add(f0Var);
                            } else {
                                arrayList10 = arrayList5;
                            }
                            i23++;
                            arrayList5 = arrayList10;
                        }
                    }
                    arrayList9 = arrayList5;
                    i19 = i15 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i17 = 0;
                }
                arrayList7 = arrayList11;
                arrayList9 = arrayList;
                i15 = i19;
                arrayList8 = arrayList12;
                i19 = i15 + 1;
                arrayList11 = arrayList7;
                arrayList12 = arrayList8;
                arrayList = arrayList9;
                i17 = 0;
            } else {
                i11 = i20 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.P0;
                if (i11 >= storiesCount) {
                    imageReceiver3.f();
                    arrayList7 = arrayList11;
                    arrayList9 = arrayList;
                    i15 = i19;
                    arrayList8 = arrayList12;
                    i19 = i15 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i17 = 0;
                } else {
                    imageReceiver = imageReceiver3;
                    ArrayList arrayList132 = this.f1;
                    isEmpty = arrayList132.isEmpty();
                    arrayList2 = this.e1;
                    if (isEmpty) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    arrayList7 = arrayList11;
                    arrayList9 = arrayList;
                    i15 = i19;
                    arrayList8 = arrayList12;
                    i19 = i15 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i17 = 0;
                }
            }
        }
        ArrayList arrayList14 = arrayList11;
        ArrayList arrayList15 = arrayList12;
        f7 f7Var = (f7) this.z1;
        o7 o7Var = f7Var.d;
        if (tz.j() && tz.b()) {
            boolean z10 = o7Var.H0;
            ArrayList arrayList16 = o7Var.M0;
            if (z10) {
                return;
            }
            for (int i24 = 0; i24 < arrayList16.size(); i24++) {
                for (int i25 = 0; i25 < arrayList14.size(); i25++) {
                    if (((Uri) arrayList14.get(i25)).equals(((n7) arrayList16.get(i24)).uri)) {
                        arrayList14.remove(i25);
                    }
                }
            }
            for (int i26 = 0; i26 < arrayList14.size(); i26++) {
                Uri uri = (Uri) arrayList14.get(i26);
                n7 n7Var = new n7(o7Var, o7Var.C0, o7Var.B0);
                n7Var.setOnSeekUpdate(new o0(24, f7Var, n7Var));
                n7Var.uri = uri;
                TLRPC.Document document = (TLRPC.Document) arrayList15.get(i26);
                n7Var.document = document;
                if (document != null) {
                    i10 = 0;
                    x8.I.put(Long.valueOf(document.id), 0);
                } else {
                    i10 = 0;
                    ConcurrentHashMap concurrentHashMap = x8.H;
                }
                n7Var.preparePlayer(uri, o7.D1, o7.B1);
                arrayList16.add(n7Var);
                if (arrayList16.size() > 2) {
                    ((n7) arrayList16.remove(i10)).release(null);
                }
            }
        }
    }

    public final void f1() {
        if (this.p1) {
            TextView textView = this.Q1;
            if (textView != null) {
                textView.setText(cd.L0(2131748833, null));
            }
            TextView textView2 = this.R1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.Q1;
        if (textView3 != null) {
            textView3.setText(cd.L0(this.n1 ? 2131744684 : 2131744519, null));
        }
        TextView textView4 = this.R1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.R1.setText(cd.L0(2131744518, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.i1;
        o7 o7Var = this.s0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((d5) arrayList2.get(i11)).a;
                    if (((int) (j10 ^ (j10 >>> 32))) == o7Var.P0) {
                        this.s1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.i1.indexOf(Integer.valueOf(o7Var.P0));
            if (indexOf < 0 && !this.i1.isEmpty()) {
                if (o7Var.P0 > ((Integer) this.i1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (o7Var.P0 < ((Integer) i0.a.g(1, this.i1)).intValue()) {
                    indexOf = this.i1.size() - 1;
                }
            }
            this.s1 = i10 + indexOf;
        } else {
            int i12 = o7Var.e1.get(this.k1, -1);
            this.s1 = i12;
            if (i12 == -1 && !o7Var.N0 && (peerStories = this.d1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.e1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i13)).id > this.d1.max_read_id) {
                        this.s1 = i13;
                        break;
                    }
                    i13++;
                }
            }
        }
        if (this.s1 == -1) {
            this.s1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.i1;
    }

    public long getCurrentPeer() {
        return this.k1;
    }

    public int getListPosition() {
        return this.u1;
    }

    public Bitmap getPlayingBitmap() {
        g2 g2Var = this.L0;
        Bitmap createBitmap = Bitmap.createBitmap(g2Var.getWidth(), g2Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.s1;
    }

    public e5 getStoriesController() {
        return vp.r1(this.l2).O1();
    }

    public int getStoriesCount() {
        return Math.max(this.m2, this.e1.size()) + this.f1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.e1;
    }

    public final void h1() {
        x4 x4Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.e1;
        arrayList.clear();
        o7 o7Var = this.s0;
        if (!o7Var.N0) {
            ArrayList arrayList2 = this.i1;
            int i10 = 0;
            ArrayList arrayList3 = this.f1;
            if (arrayList2 != null && (x4Var = o7Var.O0) != null) {
                if (x4Var instanceof q4) {
                    arrayList3.clear();
                    ArrayList F = vp.r1(this.l2).O1().F(this.k1);
                    String str = ((q4) o7Var.O0).E;
                    if (F != null) {
                        for (int i11 = 0; i11 < F.size(); i11++) {
                            d5 d5Var = (d5) F.get(i11);
                            vh.n5 n5Var = d5Var.c;
                            if (n5Var != null && !n5Var.g && TextUtils.equals(n5Var.K0, str)) {
                                arrayList3.add(d5Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.i1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    jj f7 = o7Var.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (o7Var.O0 != null) {
                while (i10 < o7Var.O0.i.size()) {
                    arrayList.add(((jj) o7Var.O0.i.get(i10)).l);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = o7Var.Q0;
                if (peerStories == null || org.telegram.messenger.o5.o(peerStories.peer) != this.k1) {
                    TL_stories.PeerStories y3 = this.B1.y(this.k1);
                    this.d1 = y3;
                    if (y3 == null) {
                        this.d1 = this.B1.z(this.k1);
                    }
                } else {
                    this.d1 = o7Var.Q0;
                }
                this.m2 = 0;
                TL_stories.PeerStories peerStories2 = this.d1;
                if (peerStories2 != null) {
                    this.m2 = peerStories2.stories.size();
                    arrayList.addAll(this.d1.stories);
                }
                arrayList3.clear();
                ArrayList F2 = this.B1.F(this.k1);
                if (F2 != null) {
                    arrayList3.addAll(F2);
                }
            }
        } else if (!o7Var.S0) {
            arrayList.add(o7Var.T0);
        }
        this.j1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        z2 currentPeerView;
        e50 e50Var = this.s2;
        if (e50Var != null) {
            e50Var.e0 = null;
            e50Var.a(false);
        }
        long j10 = this.k1;
        TL_stories.StoryItem storyItem = this.x1.a;
        o7 o7Var = this.s0;
        o7Var.getClass();
        if (j10 != 0 && storyItem != null) {
            o7.E1.remove(j10 + (j10 >> 16) + (storyItem.id << 16));
        }
        this.R2 = true;
        e7 e7Var = o7Var.n0;
        if (e7Var != null && (currentPeerView = e7Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            wb J = new cc(this.L0, this.k0).J(R.raw.forward, cd.L0(2131748498, null), cd.L0(2131743578, null), 5000, false, new i1(this, 2));
            J.r = false;
            J.k(false);
        }
        vp.r1(this.l2).s0(this.k1, 0, null);
    }

    public final void i1(boolean z10) {
        int i10;
        int i11;
        y2 y2Var = this.x1;
        TL_stories.StoryItem storyItem = y2Var.a;
        if (storyItem == null) {
            storyItem = y2Var.c;
        }
        boolean z11 = this.m1;
        if (z11 || this.l1) {
            if (storyItem == null) {
                this.j2.setText("");
                this.o2.setVisibility(8);
                this.k2.setVisibility(8);
                return;
            }
            o7 o7Var = this.s0;
            b2 b2Var = this.m0;
            if (!z11) {
                int i12 = 3;
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.j2.setText(o7Var.O0 == null ? cd.L0(2131748139, null) : cd.L0(2131748138, null));
                    this.j2.setTranslationX(org.telegram.messenger.i0.L(16.0f));
                    this.k2.setVisibility(8);
                    this.o2.setVisibility(8);
                } else {
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 >= storyItem.views.recent_viewers.size()) {
                            i10 = i12;
                            break;
                        }
                        TLObject d22 = vp.r1(this.l2).d2(storyItem.views.recent_viewers.get(i13).longValue());
                        if (d22 != null) {
                            this.k2.b(i14, this.l2, d22);
                            i14++;
                        }
                        i10 = i12;
                        if (i14 >= i10) {
                            break;
                        }
                        i13++;
                        i12 = i10;
                    }
                    for (int i15 = i14; i15 < i10; i15++) {
                        this.k2.b(i15, this.l2, null);
                    }
                    this.k2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        dq dqVar = new dq(R.drawable.mini_views_likes, 0);
                        dqVar.y = -53704;
                        dqVar.n = org.telegram.messenger.i0.L(0.2f);
                        spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        dq dqVar2 = new dq(R.drawable.mini_repost_story, 0);
                        dqVar2.y = -14161823;
                        dqVar2.n = org.telegram.messenger.i0.L(0.2f);
                        spannableStringBuilder.setSpan(dqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.j2.setText(spannableStringBuilder);
                    if (i14 == 0) {
                        this.k2.setVisibility(8);
                        this.j2.setTranslationX(org.telegram.messenger.i0.L(16.0f));
                    } else {
                        this.k2.setVisibility(0);
                        this.j2.setTranslationX(org.telegram.messenger.i0.L(10.0f) + i0.a.e(i14, 1, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(24.0f) + org.telegram.messenger.i0.L(13.0f)));
                    }
                    this.o2.setVisibility(0);
                }
                b2Var.getLayoutParams().width = org.telegram.messenger.i0.L(40.0f);
                this.x0.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            org.telegram.ui.Components.e6 e6Var = this.A0;
            if (e6Var == null || (i11 = storyViews2.forwards_count) <= 0) {
                this.E0 = false;
            } else {
                e6Var.t(Integer.toString(i11), z10 && this.E0, true);
                this.E0 = true;
            }
            int i16 = storyItem.views.reactions_count;
            if (i16 > 0) {
                this.z0.t(Integer.toString(i16), z10 && this.D0, true);
                this.D0 = true;
            } else {
                this.D0 = false;
            }
            if (!z10) {
                this.B0.e(true, this.D0 ? 1.0f : 0.0f);
                org.telegram.ui.Components.t5 t5Var = this.C0;
                if (t5Var != null) {
                    t5Var.e(true, this.E0 ? 1.0f : 0.0f);
                }
            }
            TLRPC.Chat L0 = vp.r1(this.l2).L0(Long.valueOf(-this.k1));
            if (!(this.n1 && (org.telegram.messenger.w3.q(L0) || org.telegram.messenger.w3.s0(L0))) && storyItem.views.views_count > 0) {
                this.j2.setText(o7Var.O0 == null ? cd.L0(2131748139, null) : cd.L0(2131748138, null));
                this.j2.setTranslationX(org.telegram.messenger.i0.L(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new dq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.o0(storyItem.views.views_count, 0));
                this.j2.setText(spannableStringBuilder2);
            } else {
                this.j2.setText("");
            }
            b2Var.getLayoutParams().width = (int) (org.telegram.messenger.i0.L(40.0f) + (this.D0 ? this.z0.d + org.telegram.messenger.i0.L(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.F1.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(40.0f) + b2Var.getLayoutParams().width;
            b2 b2Var2 = this.y0;
            if (b2Var2 != null) {
                b2Var2.getLayoutParams().width = (int) (org.telegram.messenger.i0.L(40.0f) + (this.E0 ? org.telegram.messenger.i0.L(4.0f) + this.A0.d : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.F1.getLayoutParams()).rightMargin += b2Var2.getLayoutParams().width;
                b2Var2.requestLayout();
            }
            this.F1.requestLayout();
            b2Var.requestLayout();
            this.k2.setVisibility(8);
            this.o2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = y2Var.a;
            e2 e2Var = this.S0;
            if (storyItem2 == null) {
                e2Var.getClass();
                return;
            }
            for (int i17 = 0; i17 < e2Var.getChildCount(); i17++) {
                if (e2Var.getChildAt(i17) instanceof v6) {
                    ((v6) e2Var.getChildAt(i17)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void j0() {
        j5 j5Var = this.n0;
        j5Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.messenger.x(1, j5Var)).setDuration(150L).start();
        int L = org.telegram.messenger.i0.L(8.0f);
        j5 j5Var2 = new j5(getContext(), this.g1);
        this.n0 = j5Var2;
        j5Var2.setPadding(L, L, L, L);
        this.n0.setAlpha(0.0f);
        this.n0.setScaleX(0.8f);
        this.n0.setScaleY(0.8f);
        this.n0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.m0.addView(this.n0, w7.b6.e(40, 40, 3));
        this.Z2 = false;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void j1() {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: th.z2.j1():void");
    }

    public final void k0(boolean z10) {
        ValueAnimator valueAnimator = this.M3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N3, z10 ? 1.0f : 0.0f);
        this.M3 = ofFloat;
        ofFloat.addUpdateListener(new j1(this, 2));
        this.M3.addListener(new q1(this, z10, 1));
        this.M3.setDuration(420L);
        this.M3.setInterpolator(gr.h);
        this.M3.start();
    }

    public final void l0(Runnable runnable) {
        if (vp.r1(this.l2).u2()) {
            org.telegram.ui.b.b(this.l2);
            return;
        }
        int i10 = tz.e0;
        if (i10 <= 0 || !this.T2) {
            runnable.run();
            return;
        }
        int i11 = i10 - 1;
        tz.e0 = i11;
        tz.T(i11);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(0, getContext(), this.k0);
        x1Var.setTitle(cd.L0(2131744903, null));
        x1Var.n(cd.L0(2131744904, null));
        String L0 = cd.L0(2131746758, null);
        rh.d0 d0Var = new rh.d0(runnable, 13);
        x1Var.n0 = L0;
        x1Var.o0 = d0Var;
        String L02 = cd.L0(2131752589, null);
        rh.x6 x6Var = new rh.x6(29);
        x1Var.p0 = L02;
        x1Var.q0 = x6Var;
        x1Var.show();
    }

    public final void m0(int i10) {
        this.n2 = false;
        this.E2 = true;
        this.k3 = false;
        this.m1 = false;
        this.n1 = false;
        long j10 = this.k1;
        w2 w2Var = this.X0;
        r8 r8Var = this.W0;
        if (j10 >= 0) {
            this.l1 = j10 == d20.i(this.l2).e();
            TLRPC.User Z1 = vp.r1(this.l2).Z1(Long.valueOf(this.k1));
            TL_account.RequirementToContact H2 = vp.r1(this.l2).H2(this.k1);
            this.o1 = !d20.i(this.l2).q() && (H2 instanceof TL_account.requirementToContactPremium);
            this.q1 = org.telegram.messenger.o5.k(H2);
            r8Var.r(Z1);
            w2Var.a.getImageReceiver().i0(Z1, r8Var, null);
            U0(this.k1, true, false);
        } else {
            this.l1 = false;
            this.m1 = true;
            if (this.B1.h(j10)) {
                this.k3 = true;
            } else {
                boolean z10 = org.telegram.messenger.v2.a;
            }
            TLRPC.Chat L0 = vp.r1(this.l2).L0(Long.valueOf(-this.k1));
            boolean V = org.telegram.messenger.w3.V(L0);
            this.n1 = !V;
            if (!V && vp.r1(this.l2).M0(-this.k1) == null) {
                hs.a0(this.l2).F0(-this.k1, true, new CountDownLatch(1), false, false, 0);
            }
            this.o1 = this.n1 && !org.telegram.messenger.w3.q(L0);
            this.q1 = vp.r1(this.l2).M1(this.k1);
            r8Var.q(L0);
            w2Var.a.getImageReceiver().i0(L0, r8Var, null);
            U0(this.k1, true, false);
        }
        if (this.t1 && (this.l1 || this.m1)) {
            e5 e5Var = this.B1;
            long j11 = this.k1;
            a0.h hVar = e5Var.m;
            x7 x7Var = (x7) hVar.f(j11);
            if (x7Var == null) {
                x7Var = new x7(e5Var.a, j11, e5Var);
                hVar.k(x7Var, j11);
            }
            x7Var.b(true);
        }
        h1();
        this.s1 = i10;
        if (i10 < 0) {
            this.s1 = 0;
        }
        this.F0 = 0L;
        this.H0 = false;
        this.s3 = null;
        this.t3 = null;
        boolean z11 = this.m1;
        g2 g2Var = this.L0;
        o7 o7Var = this.s0;
        int i11 = 8;
        y2 y2Var = this.x1;
        if (z11) {
            z0();
            if (this.K1 == null && (this.n1 || y2Var.f)) {
                t0();
            }
            if (this.K1 != null) {
                TLRPC.Chat L02 = vp.r1(this.l2).L0(Long.valueOf(-this.k1));
                t1 t1Var = this.K1;
                if (y2Var.f || (!G0() && this.n1 && (org.telegram.messenger.w3.q(L02) || org.telegram.messenger.w3.s0(L02)))) {
                    i11 = 0;
                }
                t1Var.setVisibility(i11);
                t1 t1Var2 = this.K1;
                boolean z12 = y2Var.f;
                B0(true);
                t1Var2.g1(z12);
                this.K1.m1(y2Var.f && !B0(true) && (this.e2 || this.K1.W0), true);
                mt editField = this.K1.getEditField();
                long j12 = this.k1;
                TL_stories.StoryItem storyItem = y2Var.a;
                o7Var.getClass();
                editField.setText(o7.I(j12, storyItem));
                this.K1.Z0(this.l2, this.k1);
                this.K1.J1(L02, null);
            }
            org.telegram.ui.Components.e6 e6Var = this.z0;
            org.telegram.ui.ActionBar.p6 p6Var = this.k0;
            if (e6Var == null) {
                org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, false, false);
                this.z0 = e6Var2;
                b2 b2Var = this.m0;
                e6Var2.setCallback(b2Var);
                this.z0.u(p6Var.h(org.telegram.ui.ActionBar.t6.G6));
                this.z0.w(org.telegram.messenger.i0.L(14.0f));
                this.B0 = new org.telegram.ui.Components.t5(b2Var);
            }
            b2 b2Var2 = this.y0;
            if (b2Var2 != null && this.A0 == null) {
                org.telegram.ui.Components.e6 e6Var3 = new org.telegram.ui.Components.e6(false, false, false);
                this.A0 = e6Var3;
                e6Var3.setCallback(b2Var2);
                this.A0.u(p6Var.h(org.telegram.ui.ActionBar.t6.G6));
                this.A0.w(org.telegram.messenger.i0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.t5(b2Var2);
            }
            if (i10 == -1) {
                g1();
            }
            d1(false);
            this.j1 = getStoriesCount();
            g2Var.invalidate();
            invalidate();
        } else if (this.l1) {
            z0();
            if (y2Var.f) {
                this.F1.setVisibility(8);
                if (this.K1 == null) {
                    t0();
                }
                this.K1.setVisibility(0);
            } else {
                this.F1.setVisibility(0);
                t1 t1Var3 = this.K1;
                if (t1Var3 != null) {
                    t1Var3.setVisibility(8);
                }
            }
            t1 t1Var4 = this.K1;
            if (t1Var4 != null) {
                boolean z13 = y2Var.f;
                B0(true);
                t1Var4.g1(z13);
                this.K1.m1(y2Var.f && !B0(true) && (this.e2 || this.K1.W0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.i1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(o7Var.P0));
                    if (indexOf < 0 && !this.i1.isEmpty()) {
                        if (o7Var.P0 > ((Integer) this.i1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (o7Var.P0 < ((Integer) i0.a.g(1, this.i1)).intValue()) {
                            indexOf = this.i1.size() - 1;
                        }
                    }
                    this.s1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f1.isEmpty();
                    ArrayList arrayList2 = this.e1;
                    if (isEmpty) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i12)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i12)).id > this.B1.f.get(this.k1)) {
                                this.s1 = i12;
                                break;
                            }
                        }
                    } else {
                        this.s1 = arrayList2.size();
                    }
                }
            }
            d1(false);
            g2Var.invalidate();
            invalidate();
        } else {
            if (this.K1 == null) {
                t0();
            }
            if (this.o1 && this.P1 == null) {
                x0();
            }
            if (this.P1 != null) {
                if (this.o1 || this.p1) {
                    f1();
                }
                this.P1.setVisibility(((!this.o1 || y2Var.f) && !this.p1) ? 8 : 0);
            }
            o6 o6Var = this.S1;
            if (o6Var != null) {
                o6Var.setVisibility(8);
            }
            if (i10 == -1) {
                g1();
            }
            d1(false);
            t1 t1Var5 = this.K1;
            if (t1Var5 != null) {
                t1Var5.setVisibility((G0() || h20.A(this.k1)) ? 8 : 0);
                t1 t1Var6 = this.K1;
                boolean z14 = y2Var.f;
                B0(true);
                t1Var6.g1(z14);
                this.K1.m1(y2Var.f && !B0(true) && (this.e2 || this.K1.W0), true);
                mt editField2 = this.K1.getEditField();
                long j13 = this.k1;
                TL_stories.StoryItem storyItem2 = y2Var.a;
                o7Var.getClass();
                editField2.setText(o7.I(j13, storyItem2));
                this.K1.Z0(this.l2, this.k1);
                TLRPC.UserFull a2 = vp.r1(this.l2).a2(this.k1);
                if (a2 != null) {
                    this.K1.J1(null, a2);
                } else {
                    vp.r1(this.l2).U2(vp.r1(this.l2).Z1(Long.valueOf(this.k1)), this.i2, false, null);
                }
            }
            this.j1 = getStoriesCount();
            b2 b2Var3 = this.F1;
            if (b2Var3 != null) {
                b2Var3.setVisibility(8);
            }
            g2Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        k2 k2Var = this.t0;
        if (k2Var.W.x()) {
            k2Var.W.f(false);
        }
    }

    public final void o0() {
        if (this.t1) {
            ((f7) this.z1).d.d0();
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J0 = true;
        this.N0.P();
        this.P0.P();
        this.O0.P();
        this.U2.P();
        this.W2.P();
        t1 t1Var = this.K1;
        if (t1Var != null) {
            t1Var.C0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Q0;
            if (i10 >= arrayList.size()) {
                zs.f(this.l2).c(this, zs.T);
                zs.f(this.l2).c(this, zs.G2);
                zs.f(this.l2).c(this, zs.v5);
                zs.f(this.l2).c(this, zs.m3);
                zs.f(this.l2).c(this, zs.x5);
                zs.f(this.l2).c(this, zs.D5);
                zs.f(this.l2).c(this, zs.b3);
                zs.f(this.l2).c(this, zs.i3);
                zs.f(this.l2).c(this, zs.F);
                zs.e().c(this, zs.i4);
                return;
            }
            ((sg.f0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J0 = false;
        this.N0.R();
        this.P0.R();
        this.O0.R();
        this.U2.R();
        this.W2.R();
        t1 t1Var = this.K1;
        if (t1Var != null) {
            t1Var.B0();
        }
        org.telegram.ui.Components.f5 f5Var = this.X2;
        if (f5Var != null) {
            f5Var.n(this);
            this.X2 = null;
        }
        sg.d dVar = this.V2;
        if (dVar != null) {
            dVar.d(this);
            this.V2 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Q0;
            if (i10 >= arrayList.size()) {
                zs.f(this.l2).n(this, zs.T);
                zs.f(this.l2).n(this, zs.G2);
                zs.f(this.l2).n(this, zs.v5);
                zs.f(this.l2).n(this, zs.m3);
                zs.f(this.l2).n(this, zs.x5);
                zs.f(this.l2).n(this, zs.D5);
                zs.f(this.l2).n(this, zs.b3);
                zs.f(this.l2).n(this, zs.i3);
                zs.f(this.l2).n(this, zs.F);
                zs.e().n(this, zs.i4);
                return;
            }
            ((sg.f0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.g1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(72.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0433  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        float f7;
        char c10;
        e50 e50Var;
        boolean z10;
        float L;
        FrameLayout.LayoutParams layoutParams;
        mj0 mj0Var;
        v1 v1Var;
        o7 o7Var = this.s0;
        if (o7Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.i0.m;
        }
        int i12 = 0;
        if (this.t1 && this.I2 == null) {
            this.h2 = ((f7) this.z1).d.p0;
        } else {
            this.h2 = 0;
        }
        int size = o7Var.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.h2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.h2 < org.telegram.messenger.i0.L(20.0f)) {
            this.h2 = 0;
        }
        int i13 = this.h2;
        mj0 mj0Var2 = this.a3;
        if (mj0Var2 == null || mj0Var2.getReactionsWindow() == null || this.a3.getReactionsWindow().q) {
            t1 t1Var = this.K1;
            if (t1Var != null && (t1Var.q0() || this.K1.k3)) {
                if (this.K1.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.K1.getEmojiPadding();
                } else {
                    t1 t1Var2 = this.K1;
                    if (t1Var2.z3) {
                        t1Var2.G();
                        i13 = this.K1.getStickersExpandedHeight();
                    } else {
                        i13 = t1Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.a3.getReactionsWindow().c.animate().translationY(-this.h2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.w).start();
            i13 = 0;
        }
        boolean z11 = this.e2;
        int i14 = this.X1;
        w2 w2Var = this.X0;
        int i15 = 1;
        if (i14 != i13) {
            this.e2 = false;
            y2 y2Var = this.x1;
            if (i13 <= 0 || !this.t1) {
                f7 = 8.0f;
                t1 t1Var3 = this.K1;
                if (t1Var3 != null) {
                    o7.X(this.k1, y2Var.a, t1Var3.getEditText());
                }
            } else {
                this.e2 = true;
                this.R2 = false;
                this.c2 = i13;
                if (this.O1 == null) {
                    f7 = 8.0f;
                    mj0 mj0Var3 = new mj0(1, this.l2, getContext(), LaunchActivity.Q(), new org.telegram.ui.web.a0(4, this.k0));
                    this.O1 = mj0Var3;
                    mj0Var3.setHint(cd.L0(this.n1 ? 2131744685 : 2131744529, null));
                    mj0 mj0Var4 = this.O1;
                    mj0Var4.N0 = true;
                    addView(mj0Var4, this.r0, w7.b6.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.O1.setDelegate(new d2(this));
                    this.O1.p(null, null, true);
                } else {
                    f7 = 8.0f;
                }
                this.O1.setFragment(LaunchActivity.Q());
                this.O1.setHint(cd.L0(this.n1 ? 2131744685 : 2131744529, null));
                sg.k0 k0Var = sg.k0.B;
                if (k0Var != null) {
                    k0Var.l = true;
                }
                sg.k0 k0Var2 = sg.k0.C;
                if (k0Var2 != null) {
                    k0Var2.l = true;
                }
            }
            t1 t1Var4 = this.K1;
            if (t1Var4 != null) {
                t1Var4.m1(y2Var.f && !B0(true) && this.e2, true);
            }
            if (this.e2 && (v1Var = this.M2) != null) {
                v1Var.setVisibility(0);
            }
            if (!this.e2 && (mj0Var = this.O1) != null) {
                mj0Var.n();
            }
            w2Var.setEnabled(!this.e2);
            if (this.K1 != null) {
                org.telegram.messenger.i0.Y3(null, !this.e2, 0.1f, true, true);
            }
            if (this.t1 && this.e2) {
                o7 o7Var2 = ((f7) this.z1).d;
                if (!o7Var2.y) {
                    o7Var2.y = true;
                    o7Var2.d0();
                }
            }
            this.X1 = i13;
            ValueAnimator valueAnimator = this.Y1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.w2.d();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q2, i13);
            this.Y1 = ofFloat;
            ofFloat.addUpdateListener(new j1(this, i12));
            this.Y1.addListener(new r1(this, i15));
            if (this.e2) {
                this.Y1.setDuration(250L);
                this.Y1.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                o7Var.y();
            } else {
                this.Y1.setDuration(500L);
                this.Y1.setInterpolator(gr.h);
            }
            this.Y1.start();
            boolean z12 = this.e2;
            if (z12 != z11) {
                if (z12) {
                    j2.f fVar = this.y1;
                    Canvas canvas = (Canvas) fVar.b;
                    Bitmap bitmap = (Bitmap) fVar.c;
                    C0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (org.telegram.messenger.i0.B(org.telegram.messenger.i0.J0(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.b.o(-1, zs.n1));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (y2Var.f) {
                        vh.p2 p2Var = this.M1;
                        if (p2Var != null) {
                            if (!p2Var.V) {
                                removeView(p2Var);
                            }
                        }
                        if (!B0(true) && vp.d1().getInt("taptostoryhighlighthint", 0) < 3) {
                            vp.d1().edit().putInt("taptostoryhighlighthint", vp.d1().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            vh.p2 p2Var2 = new vh.p2(getContext(), 3);
                            this.M1 = p2Var2;
                            p2Var2.s(cd.L0(2131748823, null));
                            this.M1.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
                            vh.p2 p2Var3 = this.M1;
                            p2Var3.K = Layout.Alignment.ALIGN_OPPOSITE;
                            p2Var3.l0 = new o0(i15, this, p2Var2);
                            addView(p2Var3, w7.b6.e(-1, 100, 87));
                            this.M1.u();
                            j1();
                        }
                    }
                } else {
                    t1 t1Var5 = this.K1;
                    if (t1Var5 != null) {
                        t1Var5.getEditField().clearFocus();
                    }
                    vh.p2 p2Var4 = this.M1;
                    if (p2Var4 != null) {
                        p2Var4.e(true);
                    }
                }
                this.d2 = true;
            } else {
                this.d2 = false;
            }
        } else {
            f7 = 8.0f;
        }
        t1 t1Var6 = this.K1;
        if (t1Var6 != null && t1Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.K1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        g2 g2Var = this.L0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g2Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z13 = size - size2 > org.telegram.messenger.i0.L(64.0f);
        this.g2 = z13;
        int L2 = (size - ((z13 ? org.telegram.messenger.i0.L(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = L2;
        if (this.g2) {
            this.t2 = (((-L2) + size) - size2) - org.telegram.messenger.i0.L(64.0f);
        } else {
            this.t2 = ((-L2) + size) - size2;
        }
        if (this.g2 != this.f2) {
            g2Var.setLayoutParams(layoutParams2);
        }
        b2 b2Var = this.F1;
        if (b2Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
            if (this.g2) {
                layoutParams3.topMargin = org.telegram.messenger.i0.L(f7) + L2 + size2;
            } else {
                layoutParams3.topMargin = (L2 + size2) - org.telegram.messenger.i0.L(48.0f);
            }
        }
        el0 el0Var = this.K2;
        if (el0Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) el0Var.getLayoutParams();
            if (this.g2) {
                c10 = 0;
                this.K2.setTextColor(i0.b.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = org.telegram.messenger.i0.L(12.0f) + L2 + size2;
                e50Var = this.s2;
                if (e50Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) e50Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.m5.B(64.0f, L2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = org.telegram.messenger.i0.L(64.0f) + i13;
                    }
                }
                z10 = this.g2;
                LinearLayout linearLayout = this.x0;
                k2 k2Var = this.t0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((L2 + size2) - org.telegram.messenger.i0.L(12.0f)) - org.telegram.messenger.i0.L(40.0f);
                    int L3 = this.l1 ? org.telegram.messenger.i0.L(40.0f) : org.telegram.messenger.i0.L(56.0f);
                    ((FrameLayout.LayoutParams) k2Var.getLayoutParams()).bottomMargin = L3;
                    if (this.f2 != this.g2) {
                        k2Var.setLayoutParams((FrameLayout.LayoutParams) k2Var.getLayoutParams());
                    }
                    k2Var.u0 = L3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(12.0f) + L2 + size2;
                    ((FrameLayout.LayoutParams) k2Var.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(f7);
                    if (this.f2 != this.g2) {
                        k2Var.setLayoutParams((FrameLayout.LayoutParams) k2Var.getLayoutParams());
                    }
                    k2Var.u0 = org.telegram.messenger.i0.L(f7);
                }
                this.E2 = true;
                L = org.telegram.messenger.i0.L(48.0f);
                if (this.l0.getVisibility() == 0) {
                    L += org.telegram.messenger.i0.L(60.0f);
                }
                if (this.h0.getVisibility() == 0) {
                    L += org.telegram.messenger.i0.L(40.0f);
                }
                og.c cVar = w2Var.b;
                TextView[] textViewArr = w2Var.c;
                layoutParams = (FrameLayout.LayoutParams) cVar.getLayoutParams();
                if (layoutParams.rightMargin != L) {
                    int i16 = (int) L;
                    layoutParams.rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i16;
                    w2Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.f2 = this.g2;
            }
            this.K2.setTextColor(i0.b.o(-1, zs.V2));
            layoutParams4.topMargin = ((L2 + size2) - org.telegram.messenger.i0.L(12.0f)) - org.telegram.messenger.i0.L(40.0f);
        }
        c10 = 0;
        e50Var = this.s2;
        if (e50Var != null) {
        }
        z10 = this.g2;
        LinearLayout linearLayout2 = this.x0;
        k2 k2Var2 = this.t0;
        if (z10) {
        }
        this.E2 = true;
        L = org.telegram.messenger.i0.L(48.0f);
        if (this.l0.getVisibility() == 0) {
        }
        if (this.h0.getVisibility() == 0) {
        }
        og.c cVar2 = w2Var.b;
        TextView[] textViewArr2 = w2Var.c;
        layoutParams = (FrameLayout.LayoutParams) cVar2.getLayoutParams();
        if (layoutParams.rightMargin != L) {
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.f2 = this.g2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.Z1 = -1.0f;
        this.E2 = true;
        invalidate();
    }

    public final void p0(boolean z10) {
        if (this.K1 != null && this.O2 && this.J0) {
            i1 i1Var = this.y3;
            org.telegram.messenger.i0.r(i1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.B1.B;
            this.K1.F(true);
            boolean z11 = this.o1;
            y2 y2Var = this.x1;
            if ((z11 && !y2Var.f) || this.p1) {
                this.T2 = false;
                this.K1.setEnabled(false);
                this.K1.h1(" ", z10);
                return;
            }
            if (this.q1 > 0) {
                this.T2 = false;
                this.K1.setEnabled(true);
                this.K1.h1(h8.S0(cd.a0(null, null, 2131743951, cd.E(this.q1, ','))), z10);
                return;
            }
            if (!y2Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.l2).getCurrentTime();
                int i10 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i10) {
                    this.T2 = true;
                    int currentTime2 = i10 - ConnectionsManager.getInstance(this.l2).getCurrentTime();
                    int i11 = currentTime2 / 60;
                    int i12 = currentTime2 % 60;
                    Locale locale = Locale.US;
                    int measureText = (int) this.K1.getEditField().getPaint().measureText(cd.a0(null, null, 2131744906, String.format(locale, "%02d:%02d", 99, 99)));
                    this.K1.setEnabled(true);
                    if (measureText * 1.2f >= this.K1.getEditField().getMeasuredWidth()) {
                        t1 t1Var = this.K1;
                        String a02 = cd.a0(null, null, 2131744906, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        t1Var.e = a02;
                        t1Var.f = format;
                        t1Var.F1(z10);
                    } else {
                        this.K1.h1(cd.a0(null, null, 2131744907, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    org.telegram.messenger.i0.h3(i1Var, 1000L);
                    return;
                }
            }
            this.T2 = false;
            this.K1.setEnabled(true);
            if (!y2Var.f) {
                this.K1.h1(cd.L0(this.n1 ? 2131746267 : 2131746272, null), z10);
                return;
            }
            if (this.K1.getStarsPrice() <= 0) {
                this.K1.h1(cd.L0(2131752005, null), z10);
                return;
            }
            this.K1.h1(h8.X0(false, cd.a0(null, null, 2131752004, cd.E((int) r0, ',')), this.K1.O4), z10);
            dq dqVar = this.K1.O4[0];
            if (dqVar != null) {
                dqVar.G = 0.9f;
            }
        }
    }

    public final boolean q0() {
        int i10 = 0;
        if (this.b3) {
            if (this.a3.getReactionsWindow() == null) {
                Z0(false);
                return true;
            }
            if (this.h2 > 0) {
                org.telegram.messenger.i0.v1(this.a3.getReactionsWindow().c);
                return true;
            }
            this.a3.getReactionsWindow().d();
            return true;
        }
        e2 e2Var = this.S0;
        if (e2Var != null) {
            vh.p2 p2Var = e2Var.c;
            if (p2Var != null) {
                p2Var.e(true);
                e2Var.c = null;
            }
            e2Var.b = null;
            e2Var.invalidate();
            e2Var.b(false);
        }
        k2 k2Var = this.t0;
        if (k2Var.W.x()) {
            k2Var.W.f(false);
            return true;
        }
        vh.p2 p2Var2 = this.o0;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
        vh.p2 p2Var3 = this.p0;
        if (p2Var3 != null) {
            p2Var3.e(true);
        }
        q30 q30Var = this.F2;
        if (q30Var != null) {
            q30Var.b(true);
        }
        u2 u2Var = this.c1;
        if (u2Var != null && u2Var.a) {
            u2Var.a();
            return true;
        }
        t1 t1Var = this.K1;
        if (t1Var != null && t1Var.s0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.k0);
            boolean z10 = this.K1.c1;
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            if (z10) {
                x1Var.R = cd.L0(2131751396, null);
                x1Var.T = cd.L0(2131751397, null);
            } else {
                x1Var.R = cd.L0(2131751393, null);
                x1Var.T = cd.L0(2131751394, null);
            }
            alertDialog$Builder.k(cd.L0(2131751395, null), new f1(this, i10));
            alertDialog$Builder.h(cd.L0(2131751771, null), null);
            ((f7) this.z1).h(x1Var);
            return true;
        }
        mj0 mj0Var = this.O1;
        if (mj0Var != null && mj0Var.getReactionsWindow() != null && !this.O1.getReactionsWindow().q) {
            this.O1.getReactionsWindow().d();
            return true;
        }
        t1 t1Var2 = this.K1;
        if (t1Var2 != null && t1Var2.q0()) {
            if (this.h2 > 0) {
                org.telegram.messenger.i0.v1(this.K1.getEmojiView());
                return true;
            }
            this.K1.j0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < org.telegram.messenger.i0.L(20.0f)) {
            if (k2Var.getVisibility() != 0 || k2Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            k2Var.D();
            this.P2 = false;
            this.L0.invalidate();
            return true;
        }
        t1 t1Var3 = this.K1;
        if (t1Var3 != null) {
            long j10 = this.k1;
            TL_stories.StoryItem storyItem = this.x1.a;
            Editable editText = t1Var3.getEditText();
            this.s0.getClass();
            o7.X(j10, storyItem, editText);
        }
        org.telegram.messenger.i0.v1(this.K1);
        return true;
    }

    public final void r0() {
        if (this.r2 == null) {
            ag.v vVar = new ag.v(this, getContext(), this.k0);
            this.r2 = vVar;
            vVar.T3 = new x1(this);
            vVar.a2.g0();
            ag.v vVar2 = this.r2;
            vVar2.N1 = true;
            vVar2.d1();
            ag.v vVar3 = this.r2;
            vVar3.O1 = new y1(this);
            vVar3.Z0().setText(this.K1.getFieldText());
        }
    }

    public final void s0() {
        if (this.G1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.r3);
        this.G1 = aVar;
        aVar.setOnClickListener(new k1(this, 1));
        addView(this.G1, w7.b6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public void setAccount(int i10) {
        this.l2 = i10;
        this.B1 = vp.r1(i10).h0;
        this.T0.b = i10;
        mj0 mj0Var = this.O1;
        if (mj0Var != null) {
            mj0Var.setCurrentAccount(i10);
            this.O1.p(null, null, true);
        }
        mj0 mj0Var2 = this.a3;
        if (mj0Var2 != null) {
            mj0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(v2 v2Var) {
        this.z1 = v2Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.O2 == z10) {
            return;
        }
        this.O2 = z10;
        if (z10) {
            this.N0.h1 = 1.0f;
            p0(false);
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.t1) {
            this.u2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f7) {
        boolean z10 = f7 == 0.0f;
        if (this.K0 != z10) {
            this.K0 = z10;
            this.L0.invalidate();
            if (this.t1 && this.s0.a && Build.VERSION.SDK_INT < 33) {
                ew ewVar = this.F3;
                if (z10) {
                    org.telegram.messenger.i0.r(ewVar);
                    org.telegram.messenger.i0.h3(ewVar, 250L);
                } else {
                    org.telegram.messenger.i0.r(ewVar);
                    o7 o7Var = ((f7) this.z1).d;
                    o7Var.l1 = true;
                    o7Var.d0();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.A1 != z10) {
            this.A1 = z10;
            ag.c2 c2Var = this.N0;
            if (z10) {
                c2Var.Q0();
                c2Var.t0 = false;
            } else {
                c2Var.P0(false);
                c2Var.t0 = true;
            }
            this.G0 = 0L;
            this.L0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.p6 p6Var = this.k0;
        t1 t1Var = new t1(this, org.telegram.messenger.i0.W(getContext()), this, new org.telegram.ui.web.a0(2, p6Var));
        this.K1 = t1Var;
        mt editField = t1Var.getEditField();
        editField.getClass();
        et etVar = new et(editField, 0);
        editField.t0 = etVar;
        etVar.q(true);
        editField.t0.u(editField.x0);
        editField.t0.w(editField.getPaint().getTextSize());
        et etVar2 = new et(editField, 1);
        editField.u0 = etVar2;
        etVar2.b = 5;
        etVar2.u(editField.x0);
        editField.u0.w(editField.getPaint().getTextSize());
        this.K1.getEditField().setScaleX(0.0f);
        this.K1.setOverrideKeyboardAnimation(true);
        this.K1.setClipChildren(false);
        this.K1.setDelegate(new u1(this));
        setDelegate(this.K1);
        t1 t1Var2 = this.K1;
        t1Var2.y4 = false;
        t1Var2.z4 = true;
        if (this.x1.f) {
            t1Var2.T0(false, false, false);
        } else {
            t1Var2.T0(true, true, false);
        }
        this.K1.updateColors();
        t1 t1Var3 = this.K1;
        t1Var3.A4 = true;
        addView(t1Var3, w7.b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.x3 != null) {
            this.K1.O1(false);
        }
        this.K1.G2 = this.i2;
        k2.t0 t0Var = this.v2;
        ((ArrayList) t0Var.g).add(this.L0);
        ((ArrayList) t0Var.g).add(this);
        if (this.J0) {
            this.K1.C0();
        }
        p0(false);
        if (G0()) {
            this.K1.setVisibility(8);
        }
        bh.k kVar = new bh.k(getContext(), p6Var, this.r3, this.o3);
        this.L1 = kVar;
        kVar.setOnClickListener(new f1(this, 1));
        addView(this.L1, w7.b6.e(57, zs.X4, 85));
        this.L1.setVisibility(8);
        this.K1.setSideButtonsForAttach(this.L1);
        this.r0 = getChildCount();
    }

    public final void u0() {
        if (this.S1 != null) {
            return;
        }
        o6 o6Var = new o6(getContext(), this.k0);
        this.S1 = o6Var;
        o6Var.setOnClickListener(new k1(this, 4));
        this.S1.setAlpha(0.0f);
        this.S1.setVisibility(8);
        addView(this.S1, w7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        if (this.J1 != null || getContext() == null) {
            return;
        }
        a1 a1Var = new a1(getContext(), this.r3);
        this.J1 = a1Var;
        a1Var.setOnClickListener(new k1(this, 5));
        a1 a1Var2 = this.J1;
        s0 s0Var = s0.W;
        boolean z10 = true;
        a1Var2.b(s0Var != null && s0Var.o(), false);
        a1 a1Var3 = this.J1;
        s0 s0Var2 = s0.W;
        if (s0Var2 != null && !s0Var2.m()) {
            z10 = false;
        }
        a1Var3.a(z10, false);
        addView(this.J1, w7.b6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void w0() {
        if (this.I1 != null || getContext() == null) {
            return;
        }
        this.H1 = new d1(getContext(), this.l2);
        e1 e1Var = new e1(getContext(), this.H1, this.r3);
        this.I1 = e1Var;
        e1Var.setOnClickListener(new k1(this, 6));
        this.I1.setOnLongClickListener(new h1(this, 1));
        addView(this.I1, w7.b6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.H1, w7.b6.d(zs.e3, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.P1 != null) {
            return;
        }
        if (this.K1 == null) {
            t0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.P1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.Q1 = textView;
        textView.setTextColor(-8026747);
        this.Q1.setTextSize(1, 16.0f);
        this.Q1.setText(cd.L0(this.n1 ? 2131744684 : 2131744519, null));
        TextView textView2 = new TextView(getContext());
        this.R1 = textView2;
        textView2.setTextColor(-1);
        this.R1.setTextSize(1, 12.0f);
        TextView textView3 = this.R1;
        int L = org.telegram.messenger.i0.L(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.R1.setGravity(17);
        w7.e6.a(this.R1);
        this.R1.setText(cd.L0(2131744518, null));
        this.R1.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
        this.P1.addView(imageView, w7.b6.t(22, 22, 16, 12, 1, 4, 0));
        this.P1.addView(this.Q1, w7.b6.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.P1.addView(this.R1, w7.b6.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.K1.addView(this.P1, w7.b6.d(-1, -1.0f, zs.E1, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.K2 != null) {
            return;
        }
        el0 el0Var = new el0(getContext(), 3);
        this.K2 = el0Var;
        el0Var.setTextSize(1, 14.0f);
        this.K2.setTextColor(i0.b.f(0.5f, -16777216, -1));
        this.K2.setGravity(19);
        this.K2.setText(cd.L0(2131744517, null));
        addView(this.K2, w7.b6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.F1 != null) {
            return;
        }
        b2 b2Var = new b2(this, getContext(), 0);
        this.F1 = b2Var;
        b2Var.setClickable(true);
        addView(this.F1, w7.b6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        ih.c cVar = new ih.c(this, getContext());
        this.o2 = cVar;
        cVar.setOnClickListener(new k1(this, 0));
        this.F1.addView(this.o2, w7.b6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        oh.b bVar = new oh.b(1, getContext(), false);
        this.k2 = bVar;
        bVar.setAvatarsTextSize(org.telegram.messenger.i0.L(18.0f));
        this.F1.addView(this.k2, w7.b6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.j2 = textView;
        textView.setTextSize(1, 14.0f);
        this.j2.setTextColor(-1);
        this.F1.addView(this.j2, w7.b6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.g1.s);
        ih.c cVar2 = this.o2;
        int L = org.telegram.messenger.i0.L(15.0f);
        int o10 = i0.b.o(-1, 120);
        cVar2.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, o10, o10));
        imageView.setBackground(org.telegram.ui.ActionBar.t6.O(i0.b.o(-1, 120), -org.telegram.messenger.i0.L(2.0f), -org.telegram.messenger.i0.L(2.0f)));
    }
}
