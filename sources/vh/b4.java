package vh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hc;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.js;
import org.telegram.messenger.u20;
import org.telegram.messenger.ui;
import org.telegram.messenger.v20;
import org.telegram.messenger.vp;
import org.telegram.messenger.ye;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.do0;
import org.telegram.ui.yv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class b4 extends vu0 implements jg.x1, jg.h, jg.r1, tu0, k8 {
    public final x3 A0;
    public int A1;
    public final FrameLayout B0;
    public int B1;
    public final y3 C0;
    public ig.u C1;
    public final m3 D0;
    public final boolean D1;
    public final FrameLayout E0;
    public final File E1;
    public jg.d0 F0;
    public final boolean F1;
    public final View G0;
    public final boolean G1;
    public int H0;
    public boolean H1;
    public int I0;
    public mj0 I1;
    public float J0;
    public jg.h2 J1;
    public ValueAnimator K0;
    public float K1;
    public boolean L0;
    public boolean L1;
    public final jg.d2 M0;
    public boolean M1;
    public final r2.y N0;
    public s9 N1;
    public final int O0;
    public final j4 O1;
    public BigInteger P0;
    public final k4 P1;
    public TextView Q0;
    public boolean Q1;
    public TextView R0;
    public ObjectAnimator R1;
    public TextView S0;
    public final float[] S1;
    public final jg.y1 T0;
    public q3 T1;
    public final jg.t1 U0;
    public boolean U1;
    public final jg.a2 V0;
    public boolean V1;
    public final ImageView W0;
    public boolean W1;
    public final TextView X0;
    public final int[] X1;
    public final TextView Y0;
    public vy Y1;
    public final TextView Z0;
    public boolean Z1;
    public final Paint a1;
    public boolean a2;
    public final Paint b1;
    public boolean b2;
    public float c1;
    public int c2;
    public boolean d1;
    public boolean d2;
    public o1.j e1;
    public int e2;
    public final n3 f1;
    public int f2;
    public final Paint g1;
    public int g2;
    public final Paint h1;
    public boolean h2;
    public final Paint i1;
    public final jg.k1 j0;
    public final ig.q1 j1;
    public final jg.o1 k0;
    public boolean k1;
    public final Bitmap l0;
    public o1.j l1;
    public final ig.t1 m0;
    public float m1;
    public final org.telegram.messenger.s5 n0;
    public final Paint n1;
    public final ye o0;
    public final int o1;
    public boolean p0;
    public final org.telegram.ui.ActionBar.x4 p1;
    public pu0 q0;
    public org.telegram.ui.ActionBar.k1 q1;
    public boolean r0;
    public a4 r1;
    public jg.j s0;
    public Rect s1;
    public boolean t0;
    public Runnable t1;
    public int u0;
    public Runnable u1;
    public boolean v0;
    public final n8 v1;
    public final boolean w0;
    public AnimatorSet w1;
    public final v3 x0;
    public final o3 x1;
    public final do0 y0;
    public n5 y1;
    public final m3 z0;
    public ArrayList z1;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public b4(android.content.Context r32, boolean r33, java.io.File r34, boolean r35, boolean r36, vh.n8 r37, android.app.Activity r38, int r39, android.graphics.Bitmap r40, android.graphics.Bitmap r41, int r42, java.util.ArrayList r43, vh.n5 r44, int r45, int r46, org.telegram.messenger.ye r47, org.telegram.ui.Components.s9 r48, org.telegram.ui.ActionBar.p6 r49, vh.j4 r50, vh.k4 r51) {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.b4.<init>(android.content.Context, boolean, java.io.File, boolean, boolean, vh.n8, android.app.Activity, int, android.graphics.Bitmap, android.graphics.Bitmap, int, java.util.ArrayList, vh.n5, int, int, org.telegram.messenger.ye, org.telegram.ui.Components.s9, org.telegram.ui.ActionBar.p6, vh.j4, vh.k4):void");
    }

    public static void D0(jg.g3 g3Var, int i10) {
        g3Var.setAlign(i10);
        int i11 = 2;
        g3Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !cd.X : cd.X) {
            i11 = 3;
        }
        g3Var.getEditText().setTextAlignment(i11);
    }

    public static void X(s7 s7Var, ig.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        s7Var.setNewColor(num.intValue());
        s7Var.f1.setSelectedColorIndex(s0Var.d());
        s7Var.C1 = null;
    }

    public static /* synthetic */ void Y(s7 s7Var, Integer num) {
        s7Var.setNewColor(num.intValue());
        s7Var.F0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.H0 == 2 ? this.U0 : this.T0;
    }

    private int getFrameRotation() {
        int i10 = this.O0;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private pu0 getPaintingSize() {
        pu0 pu0Var = this.q0;
        if (pu0Var != null) {
            return pu0Var;
        }
        pu0 pu0Var2 = new pu0(1080.0f, 1920.0f);
        this.q0 = pu0Var2;
        return pu0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            x3 x3Var = this.A0;
            if (i10 >= x3Var.getChildCount()) {
                return;
            }
            View childAt = x3Var.getChildAt(i10);
            if (childAt instanceof jg.w2) {
                ImageReceiver imageReceiver = ((jg.w2) childAt).x0;
                bi0 B = imageReceiver.B();
                org.telegram.ui.Components.s5 m10 = imageReceiver.m();
                boolean z11 = !z10;
                imageReceiver.u0 = z11;
                imageReceiver.t0 = z11;
                if (B != null) {
                    if (z10) {
                        B.stop();
                    } else {
                        B.start();
                    }
                } else if (m10 != null) {
                    m10.D = z10;
                    if (z10) {
                        m10.x(false);
                    }
                    if (z10) {
                        m10.stop();
                    } else {
                        m10.start();
                    }
                }
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        ig.q1 q1Var = this.j1;
        int i11 = q1Var.a;
        q1Var.a = i10;
        B0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new jg.a0(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.u0 = i10;
        jg.j jVar = this.s0;
        if (jVar instanceof jg.g3) {
            ((jg.g3) jVar).setType(i10);
        }
        ig.s0 e = ig.s0.e(this.o1);
        e.h = i10;
        e.a.edit().putInt("text_type", i10).apply();
        this.U0.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        jg.d0 d0Var = new jg.d0(this, context);
        this.F0 = d0Var;
        final int i10 = 0;
        d0Var.setClipToPadding(false);
        this.F0.setOrientation(0);
        this.C0.addView(this.F0, w7.b6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.Q0 = textView;
        textView.setText(cd.L0(2131747293, null).toUpperCase());
        TextView textView2 = this.Q0;
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.x4 x4Var = this.p1;
        org.telegram.ui.ActionBar.a7.R(textView2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, x4Var), 7, -1), null, org.telegram.ui.ActionBar.a7.N(i11), x4Var);
        this.Q0.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.Q0.setTextColor(-1);
        final int i12 = 1;
        this.Q0.setTextSize(1, 14.0f);
        this.Q0.setGravity(1);
        this.Q0.setTypeface(org.telegram.messenger.i0.o());
        this.Q0.setSingleLine();
        this.Q0.setOnClickListener(new View.OnClickListener(this) { // from class: vh.a3
            public final /* synthetic */ b4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        b4 b4Var = this.b;
                        if (!b4Var.t0) {
                            b4Var.O0(0);
                            break;
                        } else {
                            b4Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        b4 b4Var2 = this.b;
                        b4Var2.O0(2);
                        if (!(b4Var2.s0 instanceof jg.g3)) {
                            b4Var2.U1 = true;
                            b4Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.F0.addView(this.Q0, w7.b6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.R0 = textView3;
        textView3.setText(cd.L0(2131747292, null).toUpperCase());
        org.telegram.ui.ActionBar.a7.R(this.R0, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, x4Var), 7, -1), null, org.telegram.ui.ActionBar.a7.N(i11), x4Var);
        this.R0.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.R0.setOnClickListener(new View.OnClickListener(this) { // from class: vh.a3
            public final /* synthetic */ b4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        b4 b4Var = this.b;
                        if (!b4Var.t0) {
                            b4Var.O0(0);
                            break;
                        } else {
                            b4Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        b4 b4Var2 = this.b;
                        b4Var2.O0(2);
                        if (!(b4Var2.s0 instanceof jg.g3)) {
                            b4Var2.U1 = true;
                            b4Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.R0.setTextColor(-1);
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.i0.o());
        this.R0.setAlpha(0.6f);
        this.R0.setSingleLine();
        this.F0.addView(this.R0, w7.b6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.S0 = textView4;
        textView4.setText(cd.L0(2131747291, null).toUpperCase());
        org.telegram.ui.ActionBar.a7.R(this.S0, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, x4Var), 7, -1), null, org.telegram.ui.ActionBar.a7.N(i11), x4Var);
        this.S0.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.S0.setTextColor(-1);
        this.S0.setTextSize(1, 14.0f);
        this.S0.setGravity(1);
        this.S0.setTypeface(org.telegram.messenger.i0.o());
        this.S0.setAlpha(0.6f);
        this.S0.setSingleLine();
        final int i13 = 2;
        this.S0.setOnClickListener(new View.OnClickListener(this) { // from class: vh.a3
            public final /* synthetic */ b4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        b4 b4Var = this.b;
                        if (!b4Var.t0) {
                            b4Var.O0(0);
                            break;
                        } else {
                            b4Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        b4 b4Var2 = this.b;
                        b4Var2.O0(2);
                        if (!(b4Var2.s0 instanceof jg.g3)) {
                            b4Var2.U1 = true;
                            b4Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.F0.addView(this.S0, w7.b6.l(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    @Override // jg.x1
    public final void A() {
        K0(new h3(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean A0(jg.j jVar, boolean z10) {
        boolean z11;
        z8 z8Var;
        z8 z8Var2;
        mj0 mj0Var;
        int i10;
        boolean z12 = jVar instanceof jg.g3;
        int i11 = 2;
        if (z12 && (((i10 = this.I0) == -1 && this.H0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.K0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.k1) {
                F0(false);
            }
            O0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            jg.g3 g3Var = (jg.g3) jVar;
            int gravity = g3Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            jg.t1 t1Var = this.U0;
            t1Var.setAlignment(i11);
            ig.h0 typeface = g3Var.getTypeface();
            if (typeface != null) {
                t1Var.setTypeface(typeface.a);
            }
            t1Var.e(g3Var.getType(), true);
            this.D0.invalidate();
        }
        jg.j jVar2 = this.s0;
        if (jVar2 == null) {
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.d0) {
                    if (jVar instanceof jg.z0) {
                        jg.z0 z0Var = (jg.z0) jVar;
                        z0Var.setType((z0Var.getType() + 1) % z0Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof jg.h3) {
                        jg.h3 h3Var = (jg.h3) jVar;
                        h3Var.setType((h3Var.getType() + 1) % h3Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof jg.v0) {
                        jg.v0 v0Var = (jg.v0) jVar;
                        jg.t0 t0Var = v0Var.q0;
                        if (t0Var.e()) {
                            t0Var.setPreviewType(t0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        v0Var.setType(v0Var.getNextType());
                        return true;
                    }
                    if (!this.t0) {
                        if (jVar instanceof jg.g3) {
                            this.v0 = true;
                            o0();
                            return true;
                        }
                        if (!(jVar instanceof jg.h2)) {
                            J0(jVar2);
                            return true;
                        }
                        jg.h2 h2Var = (jg.h2) jVar;
                        if (this.L1 && this.J1 == jVar) {
                            h2Var.q(true);
                            return true;
                        }
                        jg.h2 h2Var2 = this.J1;
                        if (h2Var2 != null && h2Var2 != h2Var && (mj0Var = this.I1) != null) {
                            mj0Var.animate().alpha(0.0f).setListener(new sg.r(mj0Var, 17));
                            this.I1 = null;
                            this.L1 = false;
                            this.K1 = 0.0f;
                        }
                        if (this.I1 == null) {
                            mj0 mj0Var2 = new mj0(2, this.o1, getContext(), LaunchActivity.Q(), new org.telegram.ui.web.a0(7, new th.b()));
                            this.I1 = mj0Var2;
                            w9 w9Var = new w9(this.N1, mj0Var2, 0, false);
                            this.I1.setPadding(0, org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f));
                            this.v1.addView(this.I1, w7.b6.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.b.o(-16777216, 120));
                            mj0 mj0Var3 = this.I1;
                            bh.d dVar = new bh.d();
                            dVar.e = this;
                            dVar.c = w9Var;
                            dVar.d = paint;
                            dVar.b = new Path();
                            mj0Var3.setDelegate(dVar);
                            this.I1.p(null, null, true);
                        }
                        this.I1.setFragment(LaunchActivity.Q());
                        this.J1 = h2Var;
                        L0(true);
                        return true;
                    }
                    if (jVar2 instanceof jg.g3) {
                        org.telegram.messenger.i0.J3(((jg.g3) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            jg.j jVar3 = this.s0;
            if (jVar3 instanceof jg.g3) {
                jg.g3 g3Var2 = (jg.g3) jVar3;
                jg.e3 e3Var = g3Var2.q0;
                e3Var.clearFocus();
                e3Var.setEnabled(false);
                e3Var.setClickable(false);
                g3Var2.m();
                if (!z12) {
                    this.t0 = false;
                    org.telegram.messenger.i0.v1(((jg.g3) this.s0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof jg.i2) && (z8Var2 = ((s7) this).j2.Z0) != null) {
                z8Var2.l(false);
            }
            z11 = true;
        }
        jg.j jVar4 = this.s0;
        this.s0 = jVar;
        if ((jVar4 instanceof jg.g3) && TextUtils.isEmpty(((jg.g3) jVar4).getText())) {
            z0(jVar4);
        }
        jg.j jVar5 = this.s0;
        if (jVar4 != jVar5 && (jVar5 instanceof jg.i2) && (z8Var = ((s7) this).j2.Z0) != null) {
            z8Var.l(true);
        }
        jg.j jVar6 = this.s0;
        r2.y yVar = this.N0;
        ig.q1 q1Var = this.j1;
        jg.d2 d2Var = this.M0;
        if (jVar6 != null) {
            m3 m3Var = this.z0;
            jVar6.m0 = m3Var;
            jVar6.l(m3Var, true);
            jg.j jVar7 = this.s0;
            if (jVar7 instanceof jg.g3) {
                jg.g3 g3Var3 = (jg.g3) jVar7;
                g3Var3.getSwatch().c = q1Var.c;
                g3Var3.z0 = false;
                C0(g3Var3.getSwatch());
                d2Var.setValueOverride(new jg.c0(g3Var3, (int) (this.q0.a / 9.0f), 1));
                d2Var.setShowPreview(false);
            } else {
                d2Var.setValueOverride(yVar);
                d2Var.setShowPreview(true);
                q1Var.c = yVar.get();
                B0(q1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.K0;
            if (valueAnimator2 != null && this.I0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.k1) {
                F0(false);
            }
            O0(0);
            d2Var.setValueOverride(yVar);
            d2Var.setShowPreview(true);
            q1Var.c = yVar.get();
            B0(q1Var, null, false);
            z13 = z11;
        }
        R0();
        return z13;
    }

    public final void B0(ig.q1 q1Var, Integer num, boolean z10) {
        ig.q1 q1Var2 = this.j1;
        if (q1Var2 != q1Var) {
            q1Var2.a = q1Var.a;
            q1Var2.b = q1Var.b;
            q1Var2.c = q1Var.c;
            int i10 = this.o1;
            ig.s0.e(i10).h(q1Var.a, true);
            ig.s0.e(i10).j(q1Var.c);
        }
        int i11 = q1Var.a;
        v3 v3Var = this.x0;
        v3Var.setColor(i11);
        v3Var.setBrushSize(q1Var.c);
        int i12 = q1Var2.a;
        int i13 = 3;
        if (num == null || num.intValue() == i12) {
            y3 y3Var = this.C0;
            if (y3Var != null) {
                y3Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new jg.p(this, num, i12, i13));
            duration.start();
        }
        jg.j jVar = this.s0;
        if (jVar instanceof jg.g3) {
            ((jg.g3) jVar).setSwatch(new ig.q1(q1Var.b, q1Var.c, q1Var.a));
            return;
        }
        if (z10 && (jVar instanceof jg.z0)) {
            ((jg.z0) jVar).setColor(q1Var.a);
            ((jg.z0) this.s0).setType(3);
        } else if (z10 && (jVar instanceof jg.h3)) {
            ((jg.h3) jVar).setColor(q1Var.a);
            ((jg.h3) this.s0).setType(3);
        } else if (z10 && (jVar instanceof jg.v0)) {
            ((jg.v0) jVar).setColor(q1Var.a);
            ((jg.v0) this.s0).setType(0);
        }
    }

    public final void C0(ig.q1 q1Var) {
        B0(q1Var, null, false);
    }

    @Override // jg.r1
    public final void D() {
        M0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, android.view.ViewGroup, vh.x3] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void E0() {
        int i10;
        float f7;
        org.telegram.messenger.h6[] h6VarArr;
        jg.j jVar;
        jg.j jVar2;
        ArrayList arrayList = this.z1;
        if (arrayList == null) {
            return;
        }
        n5 n5Var = this.y1;
        this.y1 = null;
        this.z1 = null;
        int size = arrayList.size();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ?? r14 = this.A0;
            if (i11 >= size) {
                r14.setVisibility(z10 ? 1 : 0);
                return;
            }
            v20 v20Var = (v20) arrayList.get(i11);
            byte b10 = v20Var.a;
            if (b10 == 0) {
                t3 k02 = k0(v20Var.C, v20Var.B);
                if ((2 & v20Var.b) != 0) {
                    k02.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                layoutParams.width = v20Var.q;
                layoutParams.height = v20Var.r;
                i10 = size;
                jVar2 = k02;
            } else if (b10 == 1) {
                jg.g3 l02 = l0(z10);
                l02.setType(v20Var.b);
                l02.setTypeface(v20Var.n);
                l02.setBaseFontSize(v20Var.m);
                SpannableString spannableString = new SpannableString(v20Var.j);
                ?? r42 = v20Var.k;
                int size2 = r42.size();
                for (?? r62 = z10; r62 < size2; r62++) {
                    u20 u20Var = (u20) r42.get(r62);
                    org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(u20Var.document_id, 1.0f, l02.getFontMetricsInt());
                    int i12 = u20Var.offset;
                    spannableString.setSpan(o5Var, i12, u20Var.length + i12, 33);
                    size = size;
                }
                i10 = size;
                CharSequence m10 = org.telegram.messenger.k6.m(spannableString, l02.getFontMetricsInt(), false, null, 0);
                if ((m10 instanceof Spanned) && (h6VarArr = (org.telegram.messenger.h6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.h6.class)) != null) {
                    for (org.telegram.messenger.h6 h6Var : h6VarArr) {
                        h6Var.b = 0.85f;
                    }
                }
                l02.setText(m10);
                D0(l02, v20Var.p);
                ig.q1 swatch = l02.getSwatch();
                swatch.a = v20Var.l;
                l02.setSwatch(swatch);
                jVar2 = l02;
            } else {
                i10 = size;
                if (b10 == 2) {
                    jg.e2 h02 = h0(v20Var.j, false);
                    h02.G0 = v20Var.u;
                    h02.B0 = false;
                    if ((2 & v20Var.b) != 0) {
                        h02.r(false);
                    }
                    if ((v20Var.b & 16) != 0) {
                        h02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                    layoutParams2.width = v20Var.q;
                    layoutParams2.height = v20Var.r;
                    jVar2 = h02;
                } else {
                    if (b10 == 6) {
                        ArrayList arrayList2 = n5Var.v;
                        boolean z11 = n5Var.K;
                        this.U1 = true;
                        f7 = 1.0f;
                        jg.j s3Var = new s3(this, getContext(), c0(), arrayList2, this.N1, z11, this.O1);
                        s3Var.setDelegate(this);
                        r14.addView(s3Var);
                        d0();
                        jVar = s3Var;
                        if (v20Var.q > 0) {
                            jVar = s3Var;
                            if (v20Var.r > 0) {
                                ViewGroup.LayoutParams layoutParams3 = s3Var.getLayoutParams();
                                layoutParams3.width = v20Var.q;
                                layoutParams3.height = v20Var.r;
                                jVar = s3Var;
                            }
                        }
                    } else {
                        f7 = 1.0f;
                        if (b10 == 3) {
                            jg.z0 g02 = g0(v20Var.N, v20Var.M);
                            int i13 = v20Var.l;
                            if (i13 != 0) {
                                g02.setColor(i13);
                            }
                            g02.setType(v20Var.b);
                            jVar = g02;
                        } else if (b10 == 8) {
                            k9 k9Var = v20Var.O;
                            if (k9Var == null) {
                                i11++;
                                size = i10;
                                z10 = false;
                            } else {
                                jg.h3 m0 = m0(k9Var);
                                int i14 = v20Var.l;
                                if (i14 != 0) {
                                    m0.setColor(i14);
                                }
                                m0.setType(v20Var.b);
                                jVar = m0;
                            }
                        } else if (b10 == 7) {
                            jg.v0 f02 = f0(v20Var.W);
                            jg.t0 t0Var = f02.q0;
                            int i15 = v20Var.l;
                            if (i15 != 0) {
                                f02.setColor(i15);
                            }
                            boolean e = t0Var.e();
                            int i16 = t0Var.h;
                            int i17 = t0Var.f;
                            if (e) {
                                t0Var.setPreviewType(v20Var.b);
                            }
                            byte b11 = v20Var.b;
                            if (b11 == -1) {
                                f02.setType(3);
                                t0Var.d();
                                v20Var.q = ((int) Math.ceil(t0Var.a0)) + i17 + i17;
                                v20Var.r = ((int) Math.ceil(t0Var.b0)) + i16 + i16;
                                PointF position = f02.getPosition();
                                position.y = (this.B1 * 0.3f) + position.y;
                                f02.setPosition(position);
                                i11++;
                                size = i10;
                                z10 = false;
                            } else {
                                f02.setType(b11);
                                jVar = f02;
                            }
                        } else if (b10 == 4) {
                            jg.h2 i02 = i0(false);
                            i02.s(sg.o0.d(v20Var.M.reaction), false);
                            if (v20Var.M.flipped) {
                                i02.r(false);
                            }
                            jVar = i02;
                            if (v20Var.M.dark) {
                                i02.q(false);
                                jVar = i02;
                            }
                        } else {
                            if (b10 == 5 && n5Var.o0 != null) {
                                jg.i2 j02 = j0(n5Var.p0, false);
                                o8 o8Var = ((s7) this).j2;
                                d8 d8Var = o8Var.X0;
                                if (d8Var != null) {
                                    d8Var.x = j02;
                                    u61 u61Var = d8Var.y;
                                    if (u61Var != null) {
                                        u61Var.A0(j02.u0);
                                    }
                                }
                                e8 e8Var = o8Var.c1;
                                if (e8Var != null) {
                                    e8Var.setHasRoundVideo(true);
                                }
                                jVar = j02;
                                if ((v20Var.b & 2) != 0) {
                                    boolean z12 = !j02.r0;
                                    j02.r0 = z12;
                                    j02.s0.f(z12, true);
                                    j02.invalidate();
                                    jVar = j02;
                                }
                            }
                            i11++;
                            size = i10;
                            z10 = false;
                        }
                    }
                    jVar.setX((v20Var.c * this.A1) - (((f7 - v20Var.v) * v20Var.q) / 2.0f));
                    jVar.setY((v20Var.d * this.B1) - (((f7 - v20Var.v) * v20Var.r) / 2.0f));
                    jVar.setPosition(new PointF((v20Var.q / 2.0f) + jVar.getX(), (v20Var.r / 2.0f) + jVar.getY()));
                    jVar.setScale(v20Var.v);
                    jVar.setRotation((float) (((-v20Var.e) / 3.141592653589793d) * 180.0d));
                    i11++;
                    size = i10;
                    z10 = false;
                }
            }
            f7 = 1.0f;
            jVar = jVar2;
            jVar.setX((v20Var.c * this.A1) - (((f7 - v20Var.v) * v20Var.q) / 2.0f));
            jVar.setY((v20Var.d * this.B1) - (((f7 - v20Var.v) * v20Var.r) / 2.0f));
            jVar.setPosition(new PointF((v20Var.q / 2.0f) + jVar.getX(), (v20Var.r / 2.0f) + jVar.getY()));
            jVar.setScale(v20Var.v);
            jVar.setRotation((float) (((-v20Var.e) / 3.141592653589793d) * 180.0d));
            i11++;
            size = i10;
            z10 = false;
        }
    }

    public final void F0(final boolean z10) {
        if (this.k1 != z10) {
            this.k1 = z10;
            o1.j jVar = this.l1;
            if (jVar != null) {
                jVar.d();
            }
            o1.j jVar2 = new o1.j(new o1.i(z10 ? 0.0f : 1000.0f));
            this.l1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.m = kVar;
            int i10 = 0;
            final boolean[] zArr = {this.x1.c() || this.c2 > 0};
            final float translationY = this.C0.getTranslationY();
            final float alpha = this.k0.getAlpha();
            final ViewGroup barView = getBarView();
            this.l1.b(new o1.g() { // from class: vh.b3
                @Override // o1.g
                public final void a(o1.j jVar3, float f7, float f10) {
                    b4 b4Var = b4.this;
                    y3 y3Var = b4Var.C0;
                    float f11 = f7 / 1000.0f;
                    b4Var.m1 = f11;
                    float f12 = ((1.0f - f11) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(b4Var.m1, 0.25f) * org.telegram.messenger.i0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(b4Var.m1, 0.25f) / 0.25f));
                    n3 n3Var = b4Var.f1;
                    float f13 = b4Var.m1;
                    boolean z11 = z10;
                    n3Var.B1(z11, f13);
                    jg.o1 o1Var = b4Var.k0;
                    o1Var.setProgress(b4Var.m1);
                    jg.k1 k1Var = b4Var.j0;
                    k1Var.setProgress(b4Var.m1);
                    b4Var.F0.setTranslationY(org.telegram.messenger.i0.L(32.0f) * b4Var.m1);
                    AnimatorSet animatorSet = b4Var.w1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f14 = b4Var.m1;
                        if (!z11) {
                            f14 = 1.0f - f14;
                        }
                        float f15 = z11 ? 1.0f : 0.0f;
                        float f16 = alpha;
                        o1Var.setAlpha(org.telegram.messenger.i0.T1(f16, f15, f14));
                        k1Var.setAlpha(org.telegram.messenger.i0.T1(f16, z11 ? 1.0f : 0.0f, f14));
                        y3Var.setTranslationY(translationY - ((org.telegram.messenger.i0.L(39.0f) * f14) * (z11 ? 1 : -1)));
                    }
                    y3Var.invalidate();
                    if (view == b4Var.U0) {
                        b4Var.D0.invalidate();
                    }
                }
            });
            this.l1.a(new c3(this, z10, i10));
            this.l1.h();
            if (z10) {
                n3 n3Var = this.f1;
                n3Var.setVisibility(0);
                n3Var.setSelectedColorIndex(ig.s0.e(this.o1).d());
            }
        }
    }

    public final void G0(int i10) {
        jg.t1 t1Var = this.U0;
        o3 o3Var = this.x1;
        int i11 = 1;
        if (i10 == 1) {
            vy vyVar = this.Y1;
            boolean z10 = vyVar != null && vyVar.getVisibility() == 0;
            vy vyVar2 = this.Y1;
            n8 n8Var = this.v1;
            if (vyVar2 != null && vyVar2.c1 != d20.s0) {
                n8Var.removeView(vyVar2);
                this.Y1 = null;
            }
            if (this.Y1 == null) {
                vy vyVar3 = new vy(null, true, false, false, getContext(), false, null, null, true, this.p1, false, false);
                this.Y1 = vyVar3;
                vyVar3.x2 = false;
                vyVar3.U0 = true;
                vyVar3.setVisibility(8);
                if (org.telegram.messenger.i0.Q1()) {
                    this.Y1.setForseMultiwindowLayout(true);
                }
                this.Y1.setDelegate(new u3(this));
                n8Var.addView(this.Y1);
            }
            this.Y1.setVisibility(0);
            this.Z1 = true;
            vy vyVar4 = this.Y1;
            if (this.e2 <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.e2 = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.e2 = vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
                }
            }
            if (this.f2 <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.f2 = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.f2 = vp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.i0.q;
            int paddingUnderContainer = n8Var.getPaddingUnderContainer() + (point.x > point.y ? this.f2 : this.e2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            vyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                jg.j jVar = this.s0;
                if (jVar instanceof jg.g3) {
                    org.telegram.messenger.i0.v1(((jg.g3) jVar).getEditText());
                }
            }
            this.c2 = paddingUnderContainer;
            o3Var.a();
            requestLayout();
            fg emojiButton = t1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(dg.d, true);
            }
            if (!z10) {
                if (this.a2) {
                    this.d2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c2, 0.0f);
                    ofFloat.addUpdateListener(new d3(this, i11));
                    ofFloat.addListener(new p3(this, i11));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                    ofFloat.start();
                }
            }
        } else {
            fg emojiButton2 = t1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(dg.e, true);
            }
            vy vyVar5 = this.Y1;
            if (vyVar5 != null) {
                this.Z1 = false;
                if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                    vyVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.c2 = 0;
                o3Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(jg.v0 v0Var) {
        t5 t5Var = new t5(getContext(), this.p1, this.P1, new rh.e3(6, this, v0Var));
        if (v0Var != null) {
            jg.s0 s0Var = v0Var.u0;
            t5Var.U1 = true;
            org.telegram.ui.Cells.m3 m3Var = t5Var.R1;
            org.telegram.ui.Cells.m3 m3Var2 = t5Var.Q1;
            if (s0Var != null) {
                t5Var.Y1 = s0Var.d;
                t5Var.Z1 = false;
                m3Var2.setText(s0Var.c);
                m3Var.setText(s0Var.b);
                t5Var.e2 = !TextUtils.isEmpty(s0Var.b);
                t5Var.f2 = s0Var.f;
                t5Var.g2 = s0Var.e;
            } else {
                m3Var2.setText("");
                m3Var.setText("");
                t5Var.f2 = true;
                t5Var.g2 = false;
            }
            String L0 = cd.L0(2131744660, null);
            d dVar = t5Var.T1;
            dVar.i(L0, false, true);
            rh.t tVar = t5Var.P1;
            if (tVar != null) {
                tVar.O(false);
            }
            dVar.setEnabled(t5Var.f1(m3Var2.getText().toString()));
            t5Var.U1 = false;
        }
        t5Var.setOnDismissListener(new k3(this, 1));
        t5Var.show();
        w0(true);
    }

    public final void I0(jg.z0 z0Var, j20 j20Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        bi biVar = new bi(getContext(), new r3(this, j20Var), false, true, false, this.p1);
        biVar.T3 = new hb.a(25);
        ah ahVar = biVar.r3;
        if (z0Var != null && (messageMedia = z0Var.u0) != null && (geoPoint = messageMedia.geo) != null) {
            biVar.u4 = new double[]{geoPoint.lat, geoPoint._long};
            biVar.F1 = true;
            ahVar.setVisibility(8);
        } else if (this.D1) {
            biVar.s4 = this.F1;
            biVar.t4 = this.E1;
            biVar.F1 = true;
            ahVar.setVisibility(8);
        } else {
            biVar.F1 = true;
            ahVar.setVisibility(8);
        }
        biVar.setOnDismissListener(new k3(this, 0));
        biVar.d1();
        biVar.show();
    }

    public final void J0(jg.j jVar) {
        if (jVar instanceof jg.j1) {
            org.telegram.ui.ActionBar.k1 k1Var = this.q1;
            if (k1Var == null || !k1Var.isShowing()) {
                return;
            }
            this.q1.d(true);
            return;
        }
        int[] iArr = this.X1;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        x3 x3Var = this.A0;
        float scaleX2 = x3Var.getScaleX() * scaleX;
        float scaleY = x3Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i11;
        K0(new g3(this, jVar, 1), this, 51, i10, i11 - org.telegram.messenger.i0.L(32.0f), true);
    }

    @Override // org.telegram.ui.Components.tu0
    public final void K(int i10, boolean z10) {
        boolean z11;
        if (i10 > org.telegram.messenger.i0.L(50.0f) && this.a2 && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            if (z10) {
                this.f2 = i10;
                vp.c1().edit().putInt("kbd_height_land3", this.f2).commit();
            } else {
                this.e2 = i10;
                vp.c1().edit().putInt("kbd_height", this.e2).commit();
            }
        }
        boolean z12 = this.Z1;
        o3 o3Var = this.x1;
        if (z12) {
            int paddingUnderContainer = this.v1.getPaddingUnderContainer() + (z10 ? this.f2 : this.e2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.i0.q.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.Y1.setLayoutParams(layoutParams);
                this.c2 = layoutParams.height;
                o3Var.a();
                requestLayout();
            }
        }
        if (this.g2 == i10 && this.h2 == z10) {
            return;
        }
        this.g2 = i10;
        this.h2 = z10;
        boolean z13 = this.a2;
        jg.j jVar = this.s0;
        if (jVar instanceof jg.g3) {
            this.a2 = ((jg.g3) jVar).getEditText().isFocused() && o3Var.c();
        } else {
            this.a2 = false;
        }
        if (this.a2 && this.Z1) {
            G0(0);
        }
        if (this.c2 != 0 && !(z11 = this.a2) && z11 != z13 && !this.Z1) {
            this.c2 = 0;
            o3Var.a();
            requestLayout();
        }
        R0();
        if (z13 && !this.a2 && this.c2 > 0 && this.d2) {
            this.d2 = false;
        }
        P0();
    }

    public final void K0(Runnable runnable, b4 b4Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.k1 k1Var = this.q1;
        if (k1Var != null && k1Var.isShowing()) {
            this.q1.d(true);
            return;
        }
        int i13 = 2;
        if (this.r1 == null) {
            this.s1 = new Rect();
            a4 a4Var = new a4(this, getContext());
            this.r1 = a4Var;
            a4Var.setAnimationEnabled(true);
            this.r1.setOnTouchListener(new jg.r(2, this));
            this.r1.setDispatchKeyEventListener(new i3(this));
            this.r1.setShownFromBottom(true);
        }
        a4 a4Var2 = this.r1;
        a4Var2.W = z10;
        a4Var2.d();
        runnable.run();
        if (this.q1 == null) {
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(this.r1, -2, -2);
            this.q1 = k1Var2;
            k1Var2.b = true;
            k1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.q1.setOutsideTouchable(true);
            this.q1.setClippingEnabled(true);
            this.q1.setInputMethodMode(2);
            this.q1.setSoftInputMode(0);
            this.q1.getContentView().setFocusableInTouchMode(true);
            this.q1.setOnDismissListener(new jg.t(i13, this));
        }
        this.r1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(10000.0f), TLObject.FLAG_31));
        this.q1.setFocusable(true);
        int measuredWidth = i11 - (this.r1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.r1.getMeasuredHeight();
        this.q1.showAtLocation(b4Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.k1.i(this.r1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            a4 a4Var3 = this.r1;
            a4Var3.setBackgroundDrawable(new v9(new w9(this.N1, a4Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.i0.N(8.3f)));
        } else {
            this.r1.setBackgroundDrawable(mutate);
            this.r1.setBackgroundColor(-14145495);
        }
    }

    public final void L0(boolean z10) {
        if (this.L1 != z10) {
            if (z10 || this.I1 != null) {
                this.L1 = z10;
                int i10 = 0;
                if (z10) {
                    this.I1.n();
                    this.I1.setVisibility(0);
                    this.I1.setSelectedReaction(this.J1.getCurrentReaction());
                    this.I1.getParent().bringChildToFront(this.I1);
                } else {
                    this.J1 = null;
                }
                if (!z10) {
                    if (this.I1.getReactionsWindow() != null) {
                        this.I1.getReactionsWindow().e();
                    }
                    this.I1.animate().alpha(0.0f).setDuration(150L).setListener(new p3(this, i10)).start();
                    return;
                }
                this.M1 = true;
                this.v1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K1, z10 ? 1.0f : 0.0f);
                this.I1.setTransitionProgress(this.K1);
                ofFloat.addUpdateListener(new d3(this, 2));
                ofFloat.addListener(new sg.y(12, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(gr.g);
                ofFloat.start();
            }
        }
    }

    public final void M0(boolean z10) {
        if (this.d1 != z10) {
            this.d1 = z10;
            o1.j jVar = this.e1;
            if (jVar != null) {
                jVar.d();
            }
            o1.j jVar2 = new o1.j(new o1.i(z10 ? 0.0f : 1000.0f));
            this.e1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.m = kVar;
            if (z10) {
                jg.a2 a2Var = this.V0;
                a2Var.setAlpha(0.0f);
                a2Var.setVisibility(0);
            }
            this.e1.b(new fg.c(3, this));
            this.e1.a(new c3(this, z10, 1));
            this.e1.h();
        }
    }

    public final PointF N0(jg.j jVar) {
        float f7;
        float f10;
        ye yeVar = this.o0;
        float f11 = yeVar != null ? 200.0f / yeVar.c : 200.0f;
        float f12 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f13 = yeVar != null ? 100.0f / yeVar.c : 100.0f;
        PointF c02 = c0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                x3 x3Var = this.A0;
                if (i11 >= x3Var.getChildCount()) {
                    break;
                }
                View childAt = x3Var.getChildAt(i11);
                if (!(childAt instanceof jg.j) || (childAt instanceof jg.j1)) {
                    f7 = f12;
                    f10 = f13;
                } else {
                    PointF position2 = ((jg.j) childAt).getPosition();
                    f7 = f12;
                    f10 = f13;
                    if (((float) Math.sqrt(Math.pow(position2.y - c02.y, 2.0d) + Math.pow(position2.x - c02.x, 2.0d))) < f10) {
                        f11 = Math.min(childAt.getHeight(), childAt.getWidth()) * f7;
                        z10 = true;
                    }
                }
                i11++;
                f13 = f10;
                f12 = f7;
            }
            float f14 = f12;
            float f15 = f13;
            if (!z10) {
                break;
            }
            i10++;
            c02 = new PointF(c02.x + f11, c02.y + f11);
            f12 = f14;
            f13 = f15;
        }
        return c02;
    }

    public final void O0(int i10) {
        if (this.H0 == i10 || this.I0 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.H0;
        ViewGroup viewGroup = this.U0;
        ViewGroup viewGroup2 = this.T0;
        ViewGroup viewGroup3 = i11 == 0 ? viewGroup2 : i11 == 2 ? viewGroup : null;
        this.I0 = i10;
        ViewGroup viewGroup4 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        int i12 = this.o1;
        ig.s0 e = ig.s0.e(i12);
        boolean z10 = i10 == 2;
        if (e.l != z10) {
            e.l = z10;
            if (z10) {
                e.i(-1, false);
            } else {
                e.i(e.a.getInt("brush", 0), false);
            }
        }
        int c10 = ig.s0.e(i12).c();
        ig.q1 q1Var = this.j1;
        q1Var.a = c10;
        B0(q1Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.K0 = duration;
        duration.setInterpolator(gr.f);
        this.K0.addUpdateListener(new ci.b(this, viewGroup3, viewGroup4, 3));
        this.K0.addListener(new ci.k(this, viewGroup3, viewGroup4, i10, 3));
        this.K0.start();
    }

    public final void P0() {
        o3 o3Var = this.x1;
        jg.t1 t1Var = this.U0;
        if (t1Var != null) {
            if (o3Var.c()) {
                t1Var.a(R.drawable.input_smile);
            } else if (this.Z1) {
                t1Var.a(R.drawable.input_keyboard);
            } else {
                t1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = o3Var.c() || this.Z1;
        boolean z11 = !z10;
        org.telegram.messenger.i0.T3(1.0f, this.X0, z11, false);
        org.telegram.messenger.i0.T3(1.0f, this.W0, z11, false);
        org.telegram.messenger.i0.T3(1.0f, this.Z0, z10, false);
        org.telegram.messenger.i0.T3(1.0f, this.Y0, z10, false);
    }

    @Override // org.telegram.ui.Components.vu0, org.telegram.ui.Components.uu0
    public final int Q() {
        return this.x1.l - this.v1.getBottomPadding2();
    }

    public final void Q0() {
        jg.j jVar;
        ObjectAnimator objectAnimator = this.R1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.x0.getParent();
        if (view == null) {
            return;
        }
        o3 o3Var = this.x1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!o3Var.c() || o3Var.d) && this.c2 <= 0) || (jVar = this.s0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.R1 = ofFloat;
        ofFloat.setDuration(350L);
        this.R1.setInterpolator(gr.h);
        this.R1.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0() {
        boolean z10;
        if (this.s0 instanceof jg.g3) {
            o3 o3Var = this.x1;
            if ((o3Var.c() || this.c2 > 0) && !o3Var.d) {
                z10 = true;
                View view = this.G0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new yv0(12, this, z10)).start();
            }
        }
        z10 = false;
        View view2 = this.G0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new yv0(12, this, z10)).start();
    }

    @Override // jg.x1, jg.r1
    public final void a() {
        F0(true);
    }

    @Override // org.telegram.ui.Components.uu0, org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a7));
    }

    @Override // jg.h
    public final void b(jg.j jVar) {
        L0(false);
        J0(jVar);
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new d1(2, this, view)).start();
    }

    @Override // jg.r1
    public final void c() {
        setTextType((this.u0 + 1) % 4);
    }

    public final PointF c0() {
        x3 x3Var = this.A0;
        int measuredWidth = x3Var.getMeasuredWidth();
        int measuredHeight = x3Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.A1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.B1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override // jg.r1
    public final void d(int i10) {
        jg.j jVar = this.s0;
        if (jVar instanceof jg.g3) {
            D0((jg.g3) jVar, i10);
            ig.s0 e = ig.s0.e(this.o1);
            e.g = i10;
            e.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void d0() {
        boolean z10 = this.F1;
        x3 x3Var = this.A0;
        boolean z11 = true;
        if (!z10 && !this.H1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 >= x3Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = x3Var.getChildAt(i10);
                boolean z12 = childAt instanceof jg.g3;
                int i11 = this.o1;
                if (z12) {
                    CharSequence text = ((jg.g3) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.o5 o5Var : (org.telegram.ui.Components.o5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.o5.class)) {
                            TLRPC.Document document = o5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.f5.e(i11, o5Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.f5.g(i11).e(document);
                            }
                            org.telegram.messenger.b8.G(i11);
                            if (n5.u(document, org.telegram.messenger.b8.K(document, null, true, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i10++;
                } else if (childAt instanceof jg.w2) {
                    TLRPC.Document sticker = ((jg.w2) childAt).getSticker();
                    org.telegram.messenger.b8.G(i11);
                    if (n5.u(sticker, org.telegram.messenger.b8.K(sticker, null, true, true).getAbsolutePath())) {
                        break;
                    } else {
                        i10++;
                    }
                } else if (childAt instanceof jg.i2) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        for (int i12 = 0; i12 < x3Var.getChildCount(); i12++) {
            View childAt2 = x3Var.getChildAt(i12);
            if (childAt2 instanceof jg.j) {
                ((jg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ye yeVar;
        if ((view == this.x0 || view == this.y0 || view == this.A0 || view == this.z0) && (yeVar = this.o0) != null) {
            canvas.save();
            r1 = this.w0 ? 0 : org.telegram.messenger.i0.m;
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = yeVar.k;
            if (i10 != 90 && i10 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * yeVar.e)) / yeVar.c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * yeVar.f)) / yeVar.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.i0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.i0.L(8.0f) + r1 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final TextView e0(int i10, String str) {
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.E8, this.p1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(str);
        return textView;
    }

    public final jg.v0 f0(jg.s0 s0Var) {
        int i10;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        x3 x3Var = this.A0;
        float measuredWidth = x3Var.getMeasuredWidth() <= 0 ? this.A1 : x3Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.i0.L(58.0f);
        jg.v0 v0Var = new jg.v0(getContext(), N0, this.o1, s0Var, measuredWidth / 360.0f, L);
        if (N0.x == x3Var.getMeasuredWidth() / 2.0f) {
            v0Var.setStickyX(2);
        }
        if (N0.y == x3Var.getMeasuredHeight() / 2.0f) {
            v0Var.setStickyY(2);
        }
        ig.q1 q1Var = this.j1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            v0Var.setColor(i10);
        }
        v0Var.setDelegate(this);
        v0Var.setMaxWidth(L);
        x3Var.addView(v0Var, w7.b6.c(-2.0f, -2));
        d0();
        ye yeVar = this.o0;
        if (yeVar != null) {
            v0Var.j(1.0f / yeVar.c);
            v0Var.f(-(yeVar.k + yeVar.d));
        }
        return v0Var;
    }

    public final jg.z0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i10;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        x3 x3Var = this.A0;
        float measuredWidth = x3Var.getMeasuredWidth() <= 0 ? this.A1 : x3Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.i0.L(58.0f);
        jg.z0 z0Var = new jg.z0(getContext(), N0, this.o1, messageMedia, mediaArea, measuredWidth / 240.0f, L);
        if (N0.x == x3Var.getMeasuredWidth() / 2.0f) {
            z0Var.setStickyX(2);
        }
        if (N0.y == x3Var.getMeasuredHeight() / 2.0f) {
            z0Var.setStickyY(2);
        }
        ig.q1 q1Var = this.j1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            z0Var.setColor(i10);
        }
        z0Var.setDelegate(this);
        z0Var.setMaxWidth(L);
        x3Var.addView(z0Var, w7.b6.c(-2.0f, -2));
        d0();
        ye yeVar = this.o0;
        if (yeVar != null) {
            z0Var.j(1.0f / yeVar.c);
            z0Var.f(-(yeVar.k + yeVar.d));
        }
        return z0Var;
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.x0.c(true, false);
    }

    public View getBottomLayout() {
        return this.C0;
    }

    public View getCancelView() {
        return this.j0;
    }

    public float getCropRotation() {
        ye yeVar = this.o0;
        if (yeVar != null) {
            return yeVar.d + yeVar.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.k0;
    }

    public View getEntitiesView() {
        return this.A0;
    }

    public long getLcm() {
        return this.P0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.o5[] o5VarArr;
        x3 x3Var = this.A0;
        int childCount = x3Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = x3Var.getChildAt(i10);
            if (childAt instanceof jg.w2) {
                TLRPC.Document sticker = ((jg.w2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof jg.g3) {
                CharSequence text = ((jg.g3) childAt).getText();
                if ((text instanceof Spanned) && (o5VarArr = (org.telegram.ui.Components.o5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.o5.class)) != null) {
                    for (org.telegram.ui.Components.o5 o5Var : o5VarArr) {
                        if (o5Var != null) {
                            TLRPC.Document document = o5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.f5.e(this.o1, o5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.x0, this.y0, this.A0, this.z0);
    }

    public View getRenderInputView() {
        return this.y0;
    }

    public ig.c1 getRenderView() {
        return this.x0;
    }

    public jg.j getSelectedEntity() {
        return this.s0;
    }

    public View getSelectionEntitiesView() {
        return this.z0;
    }

    public View getTextDimView() {
        return this.G0;
    }

    public View getTopLayout() {
        return this.B0;
    }

    public View getWeightChooserView() {
        return this.M0;
    }

    public final jg.e2 h0(String str, boolean z10) {
        float f7;
        pu0 pu0Var;
        this.U1 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            f7 = 1.0f;
        }
        x3 x3Var = this.A0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.A1, x3Var.getMeasuredWidth()) * 0.5d);
            pu0Var = new pu0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.B1, x3Var.getMeasuredHeight()) * 0.5d);
            pu0Var = new pu0(f7 * floor2, floor2);
        }
        pu0 pu0Var2 = pu0Var;
        Pair N0 = org.telegram.messenger.i0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f10 = pu0Var2.a;
            pu0Var2.a = pu0Var2.b;
            pu0Var2.b = f10;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        jg.e2 e2Var = new jg.e2(context, c02, pu0Var2, str, intValue);
        e2Var.setDelegate(this);
        x3Var.addView(e2Var);
        d0();
        return e2Var;
    }

    @Override // vh.k8
    public final boolean i(MotionEvent motionEvent) {
        if (this.V1) {
            return false;
        }
        if (this.s0 != null) {
            A0(null, true);
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y3);
        this.x0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final jg.h2 i0(boolean z10) {
        String str;
        pu0 pu0Var = new pu0(org.telegram.messenger.i0.L(106.0f), org.telegram.messenger.i0.L(106.0f));
        PointF c02 = c0();
        x3 x3Var = this.A0;
        if (x3Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < x3Var.getChildCount(); i10++) {
                    View childAt = x3Var.getChildAt(i10);
                    if (w7.z8.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.i0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (x3Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (x3Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, x3Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, x3Var.getMeasuredHeight(), 0.0f);
            }
        }
        jg.h2 h2Var = new jg.h2(getContext(), c02);
        h2Var.r0 = new th.u6(h2Var);
        h2Var.s0 = new th.u6(h2Var);
        h2Var.t0 = new sg.f0(h2Var);
        h2Var.u0 = new sg.f0(h2Var);
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(h2Var);
        h2Var.w0 = t5Var;
        org.telegram.ui.Components.t5 t5Var2 = new org.telegram.ui.Components.t5(h2Var);
        h2Var.x0 = t5Var2;
        h2Var.z0 = 1.0f;
        h2Var.q0 = pu0Var;
        t5Var2.e(true, 1.0f);
        t5Var.e(true, 1.0f);
        ArrayList arrayList = ui.b0(d20.s0).h;
        sg.f0 f0Var = h2Var.t0;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                str = ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
                break;
            }
            if (((TLRPC.TL_availableReaction) arrayList.get(i11)).title.equals("Red Heart")) {
                str = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                break;
            }
            i11++;
        }
        sg.o0 b10 = sg.o0.b(str);
        h2Var.v0 = b10;
        f0Var.e(b10);
        h2Var.k();
        h2Var.setDelegate(this);
        x3Var.addView(h2Var);
        d0();
        if (z10) {
            y0(h2Var);
            A0(h2Var, true);
        }
        return h2Var;
    }

    public final jg.i2 j0(String str, boolean z10) {
        this.U1 = true;
        this.W1 = true;
        n0();
        x3 x3Var = this.A0;
        int measuredWidth = x3Var.getMeasuredWidth();
        x3Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.A1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        pu0 pu0Var = new pu0(floor, floor);
        jg.i2 i2Var = new jg.i2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.i0.L(16.0f), (pu0Var.b / 2.0f) + org.telegram.messenger.i0.L(72.0f)), pu0Var, str);
        i2Var.setDelegate(this);
        x3Var.addView(i2Var);
        d0();
        if (z10) {
            y0(i2Var);
            post(new z2(this, i2Var, 0));
        }
        this.W1 = false;
        return i2Var;
    }

    public final t3 k0(Object obj, TLRPC.Document document) {
        float f7;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f10 = 0.75f;
        ye yeVar = this.o0;
        if (yeVar != null) {
            f7 = -(yeVar.k + yeVar.d);
            f10 = 0.75f / yeVar.c;
        } else {
            f7 = 0.0f;
        }
        jg.q0 q0Var = new jg.q0(c0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        t3 t3Var = new t3(this, context, q0Var.a, q0Var.c, q0Var.b, new pu0(floor, floor), document, obj);
        boolean C4 = jj.C4(document);
        ImageReceiver imageReceiver = t3Var.x0;
        if (C4) {
            imageReceiver.o1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        t3Var.setDelegate(this);
        this.A0.addView(t3Var);
        d0();
        return t3Var;
    }

    public final jg.g3 l0(boolean z10) {
        pu0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        jg.g3 g3Var = new jg.g3(getContext(), N0, (int) (paintingSize.a / 9.0f), "", this.j1, this.u0);
        float f7 = paintingSize.a / 9.0f;
        h3 h3Var = new h3(this, 0);
        g3Var.w0 = (int) (0.5f * f7);
        g3Var.x0 = (int) (f7 * 2.0f);
        g3Var.y0 = h3Var;
        float f10 = N0.x;
        x3 x3Var = this.A0;
        if (f10 == x3Var.getMeasuredWidth() / 2.0f) {
            g3Var.setStickyX(2);
        }
        if (N0.y == x3Var.getMeasuredHeight() / 2.0f) {
            g3Var.setStickyY(2);
        }
        g3Var.setDelegate(this);
        g3Var.setMaxWidth(this.A1 - org.telegram.messenger.i0.L(32.0f));
        int i10 = this.o1;
        g3Var.setTypeface(ig.s0.e(i10).j);
        g3Var.setType(ig.s0.e(i10).h);
        x3Var.addView(g3Var, w7.b6.c(-2.0f, -2));
        d0();
        ye yeVar = this.o0;
        if (yeVar != null) {
            g3Var.j(1.0f / yeVar.c);
            g3Var.f(-(yeVar.k + yeVar.d));
        }
        if (z10) {
            y0(g3Var);
            g3Var.q();
            A0(g3Var, false);
            g3Var.getFocusedView().requestFocus();
            org.telegram.messenger.i0.J3(g3Var.getFocusedView());
            this.t0 = true;
            int i11 = ig.s0.e(i10).g;
            jg.t1 t1Var = this.U0;
            t1Var.d(i11, true);
            t1Var.setOutlineType(ig.s0.e(i10).h);
        }
        return g3Var;
    }

    public final jg.h3 m0(k9 k9Var) {
        int i10;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        x3 x3Var = this.A0;
        float measuredWidth = x3Var.getMeasuredWidth() <= 0 ? this.A1 : x3Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.i0.L(58.0f);
        jg.h3 h3Var = new jg.h3(getContext(), N0, this.o1, k9Var, measuredWidth / 240.0f, L);
        if (N0.x == x3Var.getMeasuredWidth() / 2.0f) {
            h3Var.setStickyX(2);
        }
        if (N0.y == x3Var.getMeasuredHeight() / 2.0f) {
            h3Var.setStickyY(2);
        }
        ig.q1 q1Var = this.j1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            h3Var.setColor(i10);
        }
        h3Var.setDelegate(this);
        h3Var.setMaxWidth(L);
        x3Var.addView(h3Var, w7.b6.c(-2.0f, -2));
        d0();
        ye yeVar = this.o0;
        if (yeVar != null) {
            h3Var.j(1.0f / yeVar.c);
            h3Var.f(-(yeVar.k + yeVar.d));
        }
        return h3Var;
    }

    public final void n0() {
        int i10 = 0;
        while (true) {
            x3 x3Var = this.A0;
            if (i10 >= x3Var.getChildCount()) {
                return;
            }
            View childAt = x3Var.getChildAt(i10);
            if (childAt instanceof jg.i2) {
                if (this.s0 == childAt) {
                    A0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(gr.h).withEndAction(new z2(this, (jg.i2) childAt, 1)).start();
            }
            i10++;
        }
    }

    @Override // jg.h
    public final boolean o() {
        return !(this.s0 instanceof jg.j1);
    }

    public abstract void o0();

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        mj0 mj0Var = this.I1;
        if (mj0Var != null) {
            org.telegram.messenger.i0.E2(mj0Var);
            this.I1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.p0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.i0.L(48.0f);
        Bitmap bitmap = this.l0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(48.0f);
            f7 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f7)) > currentActionBarHeight2) {
            Math.floor((r3 * f7) / currentActionBarHeight);
        }
        float f10 = this.q0.a;
        jg.j jVar = this.s0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.C0, i10, i11);
        measureChild(this.M0, i10, i11);
        measureChild(this.E0, i10, i11);
        measureChild(this.D0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.c2 - this.v1.getPaddingUnderContainer(), Q()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.B0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.i0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.p0 = false;
        if (org.telegram.messenger.i0.L(20.0f) >= 0 && !this.Z1 && !this.b2) {
            this.p0 = true;
            t0();
            this.p0 = false;
        }
        if (org.telegram.messenger.i0.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override // jg.h
    public final boolean p() {
        return !this.t0;
    }

    public final jg.j1 p0() {
        int i10 = 0;
        while (true) {
            x3 x3Var = this.A0;
            if (i10 >= x3Var.getChildCount()) {
                return null;
            }
            View childAt = x3Var.getChildAt(i10);
            if (childAt instanceof jg.j1) {
                return (jg.j1) childAt;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap q0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, n5 n5Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i10;
        int i11;
        x3 x3Var;
        int i12;
        int i13;
        View view;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        byte b10;
        int i14;
        Canvas canvas;
        View view2;
        jg.j1 j1Var;
        jg.b1 b1Var;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.s0 s0Var;
        rh.g4 g4Var;
        ImageReceiver imageReceiver3;
        ImageReceiver imageReceiver4;
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        float scaleX;
        boolean z18;
        boolean z19;
        float radius;
        double d;
        float width;
        float height;
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        Spanned spanned;
        boolean z20;
        b4 b4Var = this;
        v3 v3Var = b4Var.x0;
        int i15 = 0;
        byte b11 = 1;
        x3 x3Var2 = b4Var.A0;
        if (z10) {
            createBitmap = v3Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, x3Var2.getMeasuredWidth()), Math.max(1, x3Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                b4Var.P0 = BigInteger.ONE;
                i11 = 0;
                for (i10 = 0; i10 < x3Var2.getChildCount(); i10++) {
                    if (x3Var2.getChildAt(i10) instanceof jg.j) {
                        i11++;
                    }
                }
                if (i11 > 0) {
                    int childCount = x3Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        View childAt = x3Var2.getChildAt(i16);
                        if (childAt instanceof jg.j) {
                            jg.j jVar = (jg.j) childAt;
                            jVar.getPosition();
                            v20 v20Var = new v20();
                            if (arrayList != null) {
                                boolean z21 = jVar instanceof jg.g3;
                                int i17 = b4Var.o1;
                                if (z21) {
                                    v20Var.a = b11;
                                    jg.g3 g3Var = (jg.g3) jVar;
                                    CharSequence text = g3Var.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned2 = (Spanned) text;
                                        x3Var = x3Var2;
                                        org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spanned2.getSpans(i15, text.length(), org.telegram.ui.Components.o5.class);
                                        if (o5VarArr != null) {
                                            int i18 = i15;
                                            while (i18 < o5VarArr.length) {
                                                org.telegram.ui.Components.o5 o5Var = o5VarArr[i18];
                                                org.telegram.ui.Components.o5[] o5VarArr2 = o5VarArr;
                                                TLRPC.Document document = o5Var.document;
                                                int i19 = i18;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.f5.e(i17, o5Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.f5.g(i17).e(document);
                                                }
                                                u20 u20Var = new u20();
                                                int i20 = childCount;
                                                int i21 = i16;
                                                u20Var.document_id = o5Var.getDocumentId();
                                                u20Var.document = document;
                                                u20Var.offset = spanned2.getSpanStart(o5Var);
                                                u20Var.length = spanned2.getSpanEnd(o5Var) - u20Var.offset;
                                                org.telegram.messenger.b8.G(i17);
                                                u20Var.a = org.telegram.messenger.b8.K(document, null, true, true).getAbsolutePath();
                                                int i22 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(u20Var.a).exists()) {
                                                        break;
                                                    }
                                                    org.telegram.messenger.b8.G(i17);
                                                    spanned = spanned2;
                                                    z20 = true;
                                                    u20Var.a = org.telegram.messenger.b8.K(document.thumbs.get(i22), null, true, true).getAbsolutePath();
                                                    i22++;
                                                    if (i22 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    spanned2 = spanned;
                                                }
                                                spanned = spanned2;
                                                z20 = true;
                                                boolean K2 = jj.K2(u20Var.document, z20);
                                                if (K2 || u0(u20Var.document)) {
                                                    u20Var.c = (byte) (u20Var.c | (K2 ? (byte) 1 : (byte) 4));
                                                }
                                                if (jj.C4(u20Var.document)) {
                                                    u20Var.c = (byte) (u20Var.c | 8);
                                                }
                                                v20Var.k.add(u20Var);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    b4Var.P0 = b4Var.P0.multiply(valueOf).divide(b4Var.P0.gcd(valueOf));
                                                }
                                                i18 = i19 + 1;
                                                o5VarArr = o5VarArr2;
                                                childCount = i20;
                                                i16 = i21;
                                                spanned2 = spanned;
                                            }
                                        }
                                    } else {
                                        x3Var = x3Var2;
                                    }
                                    i12 = childCount;
                                    i13 = i16;
                                    v20Var.j = text.toString();
                                    v20Var.b = (byte) g3Var.getType();
                                    v20Var.l = g3Var.getSwatch().a;
                                    v20Var.m = g3Var.getTextSize();
                                    v20Var.n = g3Var.getTypeface();
                                    v20Var.p = g3Var.getAlign();
                                } else {
                                    x3Var = x3Var2;
                                    i12 = childCount;
                                    i13 = i16;
                                    if (jVar instanceof jg.w2) {
                                        v20Var.a = (byte) 0;
                                        jg.w2 w2Var = (jg.w2) jVar;
                                        pu0 baseSize = w2Var.getBaseSize();
                                        v20Var.f = baseSize.a;
                                        v20Var.g = baseSize.b;
                                        v20Var.B = w2Var.getSticker();
                                        v20Var.C = w2Var.getParentObject();
                                        TLRPC.Document sticker = w2Var.getSticker();
                                        org.telegram.messenger.b8.G(d20.s0);
                                        v20Var.j = org.telegram.messenger.b8.K(sticker, null, true, true).getAbsolutePath();
                                        if (jj.K2(sticker, true) || u0(sticker)) {
                                            boolean K22 = jj.K2(sticker, true);
                                            v20Var.b = (byte) (v20Var.b | (K22 ? (byte) 1 : (byte) 4));
                                            r21 = (K22 || u0(sticker)) ? w2Var.getDuration() : 5000L;
                                            if (r21 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r21);
                                                b4Var.P0 = b4Var.P0.multiply(valueOf2).divide(b4Var.P0.gcd(valueOf2));
                                            }
                                        }
                                        if (jj.C4(sticker)) {
                                            v20Var.l = -1;
                                            v20Var.b = (byte) (v20Var.b | 8);
                                        }
                                        if (w2Var.t0) {
                                            v20Var.b = (byte) (v20Var.b | 2);
                                        }
                                    } else if (jVar instanceof jg.e2) {
                                        jg.e2 e2Var = (jg.e2) jVar;
                                        v20Var.a = (byte) 2;
                                        pu0 baseSize2 = e2Var.getBaseSize();
                                        v20Var.f = baseSize2.a;
                                        v20Var.g = baseSize2.b;
                                        v20Var.j = e2Var.q(i17);
                                        v20Var.u = e2Var.G0;
                                        if (e2Var.t0) {
                                            v20Var.b = (byte) (v20Var.b | 2);
                                        }
                                    } else if (jVar instanceof jg.z0) {
                                        jg.z0 z0Var = (jg.z0) jVar;
                                        jg.y0 y0Var = z0Var.q0;
                                        v20Var.a = (byte) 3;
                                        v20Var.b = (byte) z0Var.getType();
                                        v20Var.f = y0Var.getWidth();
                                        v20Var.g = y0Var.getHeight();
                                        v20Var.j = y0Var.getText();
                                        v20Var.l = z0Var.r0 ? z0Var.getColor() : 0;
                                        v20Var.P = y0Var.D;
                                        v20Var.N = z0Var.u0;
                                        TL_stories.MediaArea mediaArea2 = z0Var.v0;
                                        v20Var.M = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = y0Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            u20 u20Var2 = new u20();
                                            u20Var2.document_id = codeEmojiDocument.id;
                                            u20Var2.document = codeEmojiDocument;
                                            org.telegram.messenger.b8.G(i17);
                                            u20Var2.a = org.telegram.messenger.b8.K(codeEmojiDocument, null, true, true).getAbsolutePath();
                                            boolean K23 = jj.K2(u20Var2.document, true);
                                            if (K23 || u0(u20Var2.document)) {
                                                u20Var2.c = (byte) (u20Var2.c | (K23 ? (byte) 1 : (byte) 4));
                                            }
                                            v20Var.k.add(u20Var2);
                                        }
                                    } else if (jVar instanceof jg.h3) {
                                        jg.h3 h3Var = (jg.h3) jVar;
                                        jg.y0 y0Var2 = h3Var.q0;
                                        v20Var.a = (byte) 8;
                                        v20Var.b = (byte) h3Var.getType();
                                        v20Var.f = y0Var2.getWidth();
                                        v20Var.g = y0Var2.getHeight();
                                        v20Var.j = y0Var2.getText();
                                        v20Var.l = h3Var.r0 ? h3Var.getColor() : 0;
                                        v20Var.P = y0Var2.D;
                                        v20Var.O = h3Var.u0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = h3Var.u0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = y0Var2.f.getColor();
                                        v20Var.M = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = y0Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            u20 u20Var3 = new u20();
                                            u20Var3.document_id = codeEmojiDocument2.id;
                                            u20Var3.document = codeEmojiDocument2;
                                            org.telegram.messenger.b8.G(i17);
                                            u20Var3.a = org.telegram.messenger.b8.K(codeEmojiDocument2, null, true, true).getAbsolutePath();
                                            boolean K24 = jj.K2(u20Var3.document, true);
                                            if (K24 || u0(u20Var3.document)) {
                                                u20Var3.c = (byte) (u20Var3.c | (K24 ? (byte) 1 : (byte) 4));
                                            }
                                            v20Var.k.add(u20Var3);
                                        }
                                        view = childAt;
                                        z16 = false;
                                        z17 = false;
                                        imageReceiver = null;
                                        arrayList.add(v20Var);
                                        scaleX = view.getScaleX();
                                        float scaleY = view.getScaleY();
                                        float x10 = view.getX();
                                        float y3 = view.getY();
                                        v20Var.q = view.getWidth();
                                        v20Var.r = view.getHeight();
                                        v20Var.f = (view.getWidth() * scaleX) / x3Var.getMeasuredWidth();
                                        v20Var.g = (view.getHeight() * scaleY) / x3Var.getMeasuredHeight();
                                        v20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / x3Var.getMeasuredWidth();
                                        v20Var.d = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y3) / x3Var.getMeasuredHeight();
                                        v20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        v20Var.y = ((view.getWidth() / 2.0f) + x10) / x3Var.getMeasuredWidth();
                                        v20Var.z = ((view.getHeight() / 2.0f) + y3) / x3Var.getMeasuredHeight();
                                        v20Var.w = v20Var.q / x3Var.getMeasuredWidth();
                                        v20Var.x = v20Var.r / x3Var.getMeasuredHeight();
                                        v20Var.v = scaleX;
                                        if (jVar instanceof jg.j1) {
                                            z18 = z16;
                                            if (jVar instanceof jg.w2) {
                                                ImageReceiver imageReceiver5 = ((jg.w2) jVar).x0;
                                                RectF rectF = imageReceiver5.P0;
                                                if (imageReceiver5.U % zs.K2 != 0) {
                                                    width = rectF.height();
                                                    height = rectF.width();
                                                } else {
                                                    width = rectF.width();
                                                    height = rectF.height();
                                                }
                                                float f7 = width / height;
                                                float f10 = (v20Var.f / 2.0f) + v20Var.c;
                                                float f11 = (v20Var.g / 2.0f) + v20Var.d;
                                                float measuredWidth = x3Var.getMeasuredWidth() / x3Var.getMeasuredHeight();
                                                if (f7 > 1.0f) {
                                                    float f12 = (v20Var.f * measuredWidth) / f7;
                                                    v20Var.g = f12;
                                                    v20Var.r = (int) (v20Var.q / f7);
                                                    v20Var.d = f11 - (f12 / 2.0f);
                                                } else if (f7 < 1.0f) {
                                                    float f13 = (v20Var.g / measuredWidth) * f7;
                                                    v20Var.f = f13;
                                                    v20Var.q = (int) (v20Var.r * f7);
                                                    v20Var.c = f10 - (f13 / 2.0f);
                                                }
                                            } else {
                                                TL_stories.MediaArea mediaArea3 = v20Var.M;
                                                if (mediaArea3 != null && (((z19 = jVar instanceof jg.z0)) || (jVar instanceof jg.h3) || (jVar instanceof jg.v0) || (jVar instanceof jg.h2))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f14 = v20Var.c;
                                                    float f15 = v20Var.f;
                                                    mediaAreaCoordinates2.x = ((f15 / 2.0f) + f14) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((v20Var.g / 2.0f) + v20Var.d) * 100.0f;
                                                    if (z19) {
                                                        jg.y0 y0Var3 = ((jg.z0) jVar).q0;
                                                        mediaAreaCoordinates2.w = z20.x(y0Var3.I * 2 * scaleX, x3Var.getMeasuredWidth(), f15, 100.0f);
                                                        v20Var.M.coordinates.h = z20.x(y0Var3.J * 2 * scaleY, x3Var.getMeasuredHeight(), v20Var.g, 100.0f);
                                                    } else if (jVar instanceof jg.h3) {
                                                        jg.y0 y0Var4 = ((jg.h3) jVar).q0;
                                                        mediaAreaCoordinates2.w = z20.x(y0Var4.I * 2 * scaleX, x3Var.getMeasuredWidth(), f15, 100.0f);
                                                        v20Var.M.coordinates.h = z20.x(y0Var4.J * 2 * scaleY, x3Var.getMeasuredHeight(), v20Var.g, 100.0f);
                                                    } else if (jVar instanceof jg.v0) {
                                                        jg.t0 t0Var = ((jg.v0) jVar).q0;
                                                        mediaAreaCoordinates2.w = z20.x(t0Var.f * 2 * scaleX, x3Var.getMeasuredWidth(), f15, 100.0f);
                                                        v20Var.M.coordinates.h = z20.x(t0Var.h * 2 * scaleY, x3Var.getMeasuredHeight(), v20Var.g, 100.0f);
                                                    } else if (jVar instanceof jg.h2) {
                                                        jg.h2 h2Var = (jg.h2) jVar;
                                                        float padding = ((h2Var.getPadding() * 2) * scaleX) / x3Var.getMeasuredWidth();
                                                        float padding2 = ((h2Var.getPadding() * 2) * scaleX) / x3Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = v20Var.M.coordinates;
                                                        mediaAreaCoordinates3.w = (v20Var.f - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (v20Var.g - padding2) * 100.0f;
                                                    }
                                                    v20Var.M.coordinates.rotation = ((-v20Var.e) / 3.141592653589793d) * 180.0d;
                                                    if (z19) {
                                                        radius = ((jg.z0) jVar).q0.getRadius();
                                                    } else if (jVar instanceof jg.h3) {
                                                        radius = ((jg.h3) jVar).q0.getRadius();
                                                    } else if (jVar instanceof jg.v0) {
                                                        radius = ((jg.v0) jVar).q0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            jg.j1 j1Var2 = (jg.j1) jVar;
                                            jg.c1 c1Var = j1Var2.r0;
                                            jg.b1 b1Var2 = j1Var2.q0;
                                            RectF rectF2 = org.telegram.messenger.i0.P;
                                            z18 = z16;
                                            double r10 = j1Var2.r(rectF2);
                                            rectF2.offset(b1Var2.getX(), b1Var2.getY());
                                            rectF2.offset(c1Var.getX(), c1Var.getY());
                                            v20Var.M.coordinates.x = (((rectF2.centerX() * scaleX) + z20.v(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / x3Var.getMeasuredWidth()) * 100.0f;
                                            v20Var.M.coordinates.y = (((rectF2.centerY() * scaleY) + z20.v(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y3)) / x3Var.getMeasuredHeight()) * 100.0f;
                                            v20Var.M.coordinates.w = ((rectF2.width() * scaleX) / x3Var.getMeasuredWidth()) * 100.0f;
                                            v20Var.M.coordinates.h = ((rectF2.height() * scaleY) / x3Var.getMeasuredHeight()) * 100.0f;
                                            v20Var.M.coordinates.rotation = ((-v20Var.e) / 3.141592653589793d) * 180.0d;
                                            d = r10;
                                        }
                                        mediaArea = v20Var.M;
                                        if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                        }
                                        z14 = z17;
                                        z15 = z18;
                                    } else {
                                        if (jVar instanceof jg.v0) {
                                            jg.v0 v0Var = (jg.v0) jVar;
                                            jg.t0 t0Var2 = v0Var.q0;
                                            v20Var.a = (byte) 7;
                                            if (t0Var2.e()) {
                                                v20Var.b = (byte) t0Var2.getPreviewType();
                                            } else {
                                                v20Var.b = (byte) v0Var.getType();
                                            }
                                            v20Var.f = t0Var2.getWidth();
                                            v20Var.g = t0Var2.getHeight();
                                            v20Var.l = v0Var.t0 ? v0Var.getColor() : 0;
                                            v20Var.P = t0Var2.e;
                                            v20Var.W = v0Var.u0;
                                            if (t0Var2.R) {
                                                ImageReceiver imageReceiver6 = t0Var2.T;
                                                if (t0Var2.R && imageReceiver6.J() && imageReceiver6.n() != null) {
                                                    hc.D().O(new BitmapDrawable(imageReceiver6.n()), imageReceiver6.Q, false);
                                                }
                                                jg.s0 s0Var2 = v20Var.W;
                                                s0Var2.a |= 4;
                                                s0Var2.i = t0Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            v20Var.M = tL_mediaAreaUrl;
                                            jg.s0 s0Var3 = v0Var.u0;
                                            if (s0Var3 != null) {
                                                TLRPC.WebPage webPage = s0Var3.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? v0Var.u0.c : v0Var.u0.d.url;
                                                v20Var.M.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof jg.h2) {
                                                jg.h2 h2Var2 = (jg.h2) jVar;
                                                v20Var.a = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                v20Var.M = tL_mediaAreaSuggestedReaction;
                                                sg.o0 currentReaction = h2Var2.getCurrentReaction();
                                                if (currentReaction.f != null) {
                                                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                                                    tL_reactionEmoji.emoticon = currentReaction.f;
                                                    tL_reactionCustomEmoji = tL_reactionEmoji;
                                                } else {
                                                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                                                    tL_reactionCustomEmoji2.document_id = currentReaction.g;
                                                    tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
                                                }
                                                tL_mediaAreaSuggestedReaction.reaction = tL_reactionCustomEmoji;
                                                TL_stories.MediaArea mediaArea4 = v20Var.M;
                                                mediaArea4.dark = h2Var2.r0.a == 1;
                                                mediaArea4.flipped = h2Var2.y0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (jVar instanceof jg.i2) {
                                                jg.i2 i2Var = (jg.i2) jVar;
                                                pu0 baseSize3 = i2Var.getBaseSize();
                                                v20Var.f = baseSize3.a;
                                                v20Var.g = baseSize3.b;
                                                v20Var.a = (byte) 5;
                                                if (n5Var != null) {
                                                    v20Var.j = n5Var.o0.getAbsolutePath();
                                                    v20Var.Q = n5Var.r0;
                                                    long j10 = n5Var.q0;
                                                    v20Var.T = j10;
                                                    float f16 = j10;
                                                    v20Var.R = (long) (n5Var.s0 * f16);
                                                    v20Var.S = (long) (n5Var.t0 * f16);
                                                }
                                                v20Var.b = (byte) 4;
                                                if (i2Var.r0) {
                                                    v20Var.b = (byte) (v20Var.b | 2);
                                                }
                                            } else if (jVar instanceof jg.j1) {
                                                jg.j1 j1Var3 = (jg.j1) jVar;
                                                jg.b1 b1Var3 = j1Var3.q0;
                                                ArrayList arrayList3 = j1Var3.s0;
                                                jg.c1 c1Var2 = j1Var3.r0;
                                                v20Var.a = (byte) 6;
                                                int width2 = j1Var3.getWidth();
                                                v20Var.q = width2;
                                                v20Var.f = width2;
                                                int height2 = j1Var3.getHeight();
                                                v20Var.r = height2;
                                                v20Var.g = height2;
                                                jj jjVar = arrayList3.size() > 0 ? (jj) arrayList3.get(0) : null;
                                                if (jjVar != null && (message = jjVar.k) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                        TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                        v20Var.M = tL_mediaAreaStarGift;
                                                        tL_mediaAreaStarGift.slug = starGift.slug;
                                                        tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        int i23 = 0;
                                                        while (true) {
                                                            if (i23 >= c1Var2.getChildCount()) {
                                                                s0Var = null;
                                                                break;
                                                            }
                                                            View childAt2 = c1Var2.getChildAt(i23);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.s0) {
                                                                s0Var = (org.telegram.ui.Cells.s0) childAt2;
                                                                break;
                                                            }
                                                            i23++;
                                                        }
                                                        if (s0Var == null || (g4Var = s0Var.H0) == null || (imageReceiver3 = g4Var.d) == null) {
                                                            j1Var = j1Var3;
                                                            b1Var = b1Var3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z12) {
                                                                if (n5Var != null) {
                                                                    Matrix matrix = n5Var.n0;
                                                                    if (n5Var.K) {
                                                                        matrix.reset();
                                                                        if (c1Var2.getChildCount() == 1) {
                                                                            view3 = c1Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.q1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.q1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.w() / Math.max(1, n5Var.k0), imageReceiver2.v() / Math.max(1, n5Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.r() - ((n5Var.k0 * max) / 2.0f), imageReceiver2.s() - ((n5Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(b1Var.getX(), b1Var.getY());
                                                                                    matrix.postTranslate(c1Var2.getX(), c1Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(j1Var.getScaleX(), j1Var.getScaleY(), j1Var.getPivotX(), j1Var.getPivotY());
                                                                                    matrix.postRotate(j1Var.getRotation(), j1Var.getPivotX(), j1Var.getPivotY());
                                                                                    matrix.postTranslate(j1Var.getX(), j1Var.getY());
                                                                                    matrix.postScale(1.0f / x3Var.getWidth(), 1.0f / x3Var.getHeight());
                                                                                    matrix.postScale(n5Var.i0, n5Var.j0);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            view3 = null;
                                                                        }
                                                                        imageReceiver2 = null;
                                                                        if (imageReceiver2 != null) {
                                                                        }
                                                                    }
                                                                }
                                                                z16 = false;
                                                            } else {
                                                                z16 = true;
                                                            }
                                                            z17 = true;
                                                            arrayList.add(v20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY2 = view.getScaleY();
                                                            float x102 = view.getX();
                                                            float y32 = view.getY();
                                                            v20Var.q = view.getWidth();
                                                            v20Var.r = view.getHeight();
                                                            v20Var.f = (view.getWidth() * scaleX) / x3Var.getMeasuredWidth();
                                                            v20Var.g = (view.getHeight() * scaleY2) / x3Var.getMeasuredHeight();
                                                            v20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / x3Var.getMeasuredWidth();
                                                            v20Var.d = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y32) / x3Var.getMeasuredHeight();
                                                            v20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            v20Var.y = ((view.getWidth() / 2.0f) + x102) / x3Var.getMeasuredWidth();
                                                            v20Var.z = ((view.getHeight() / 2.0f) + y32) / x3Var.getMeasuredHeight();
                                                            v20Var.w = v20Var.q / x3Var.getMeasuredWidth();
                                                            v20Var.x = v20Var.r / x3Var.getMeasuredHeight();
                                                            v20Var.v = scaleX;
                                                            if (jVar instanceof jg.j1) {
                                                            }
                                                            mediaArea = v20Var.M;
                                                            if (mediaArea != null) {
                                                                mediaAreaCoordinates.flags |= 1;
                                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        } else {
                                                            imageReceiver3.O0(false, false);
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rh.e6.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float L = org.telegram.messenger.i0.L(110.0f);
                                                                float r11 = imageReceiver3.r() + s0Var.getX() + c1Var2.getX() + s0Var.F0;
                                                                float s10 = imageReceiver3.s() + s0Var.getY() + c1Var2.getY() + s0Var.G0;
                                                                j1Var = j1Var3;
                                                                v20 v20Var2 = new v20();
                                                                v20Var2.a = (byte) 0;
                                                                v20Var2.f = L;
                                                                v20Var2.g = L;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                v20Var2.B = document2;
                                                                v20Var2.C = starGift;
                                                                org.telegram.messenger.b8.G(d20.s0);
                                                                v20Var2.j = org.telegram.messenger.b8.L(document2, true).getAbsolutePath();
                                                                if (jj.K2(document2, true) || u0(document2)) {
                                                                    boolean K25 = jj.K2(document2, true);
                                                                    v20Var2.b = (byte) (v20Var2.b | (K25 ? (byte) 1 : (byte) 4));
                                                                    bi0 B = imageReceiver3.B();
                                                                    if (B != null && (K25 || u0(document2))) {
                                                                        r21 = B.r();
                                                                    }
                                                                    if (r21 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r21);
                                                                        b4Var.P0 = b4Var.P0.multiply(valueOf3).divide(b4Var.P0.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x11 = childAt.getX();
                                                                float y10 = childAt.getY();
                                                                int i24 = (int) L;
                                                                v20Var2.q = i24;
                                                                v20Var2.r = i24;
                                                                v20Var2.f = (L * scaleX2) / x3Var.getMeasuredWidth();
                                                                v20Var2.g = (L * scaleY3) / x3Var.getMeasuredHeight();
                                                                v20Var2.c = (childAt.getWidth() / 2.0f) + x11;
                                                                v20Var2.d = (childAt.getHeight() / 2.0f) + y10;
                                                                float v = z20.v(childAt.getWidth(), 2.0f, scaleX2, r11 * scaleX2);
                                                                b1Var = b1Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                                double d10 = v;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double v10 = z20.v(childAt.getHeight(), 2.0f, scaleY3, s10 * scaleY3);
                                                                v20Var2.c = (float) (((Math.cos(rotation) * d10) - (Math.sin(rotation) * v10)) + v20Var2.c);
                                                                float cos = (float) ((Math.cos(rotation) * v10) + (Math.sin(rotation) * d10) + v20Var2.d);
                                                                float f17 = (-L) / 2.0f;
                                                                float f18 = (f17 * scaleX2) + v20Var2.c;
                                                                v20Var2.c = f18;
                                                                v20Var2.d = (f17 * scaleY3) + cos;
                                                                v20Var2.c = f18 / x3Var.getMeasuredWidth();
                                                                v20Var2.d /= x3Var.getMeasuredHeight();
                                                                v20Var2.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                v20Var2.v = scaleX2;
                                                                arrayList.add(v20Var2);
                                                            } else {
                                                                j1Var = j1Var3;
                                                                b1Var = b1Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                            }
                                                            imageReceiver = imageReceiver4;
                                                            if (z12) {
                                                            }
                                                            z17 = true;
                                                            arrayList.add(v20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY22 = view.getScaleY();
                                                            float x1022 = view.getX();
                                                            float y322 = view.getY();
                                                            v20Var.q = view.getWidth();
                                                            v20Var.r = view.getHeight();
                                                            v20Var.f = (view.getWidth() * scaleX) / x3Var.getMeasuredWidth();
                                                            v20Var.g = (view.getHeight() * scaleY22) / x3Var.getMeasuredHeight();
                                                            v20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / x3Var.getMeasuredWidth();
                                                            v20Var.d = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y322) / x3Var.getMeasuredHeight();
                                                            v20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            v20Var.y = ((view.getWidth() / 2.0f) + x1022) / x3Var.getMeasuredWidth();
                                                            v20Var.z = ((view.getHeight() / 2.0f) + y322) / x3Var.getMeasuredHeight();
                                                            v20Var.w = v20Var.q / x3Var.getMeasuredWidth();
                                                            v20Var.x = v20Var.r / x3Var.getMeasuredHeight();
                                                            v20Var.v = scaleX;
                                                            if (jVar instanceof jg.j1) {
                                                            }
                                                            mediaArea = v20Var.M;
                                                            if (mediaArea != null) {
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        }
                                                    }
                                                }
                                                j1Var = j1Var3;
                                                b1Var = b1Var3;
                                                view = childAt;
                                                if (jjVar != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    v20Var.M = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) v20Var.M).channel = vp.r1(i17).g1(-n5.p(jjVar));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) v20Var.M;
                                                    Boolean D = n5.D(jjVar);
                                                    tL_inputMediaAreaChannelPost2.msg_id = D == null ? 0 : D.booleanValue() ? jjVar.k.fwd_from.channel_post : jjVar.f1();
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    v20Var.M = tL_inputMediaAreaChannelPost3;
                                                    tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                                if (z12) {
                                                }
                                                z17 = true;
                                                arrayList.add(v20Var);
                                                scaleX = view.getScaleX();
                                                float scaleY222 = view.getScaleY();
                                                float x10222 = view.getX();
                                                float y3222 = view.getY();
                                                v20Var.q = view.getWidth();
                                                v20Var.r = view.getHeight();
                                                v20Var.f = (view.getWidth() * scaleX) / x3Var.getMeasuredWidth();
                                                v20Var.g = (view.getHeight() * scaleY222) / x3Var.getMeasuredHeight();
                                                v20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / x3Var.getMeasuredWidth();
                                                v20Var.d = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y3222) / x3Var.getMeasuredHeight();
                                                v20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                v20Var.y = ((view.getWidth() / 2.0f) + x10222) / x3Var.getMeasuredWidth();
                                                v20Var.z = ((view.getHeight() / 2.0f) + y3222) / x3Var.getMeasuredHeight();
                                                v20Var.w = v20Var.q / x3Var.getMeasuredWidth();
                                                v20Var.x = v20Var.r / x3Var.getMeasuredHeight();
                                                v20Var.v = scaleX;
                                                if (jVar instanceof jg.j1) {
                                                }
                                                mediaArea = v20Var.M;
                                                if (mediaArea != null) {
                                                }
                                                z14 = z17;
                                                z15 = z18;
                                            }
                                            view = childAt;
                                            z16 = true;
                                            z17 = true;
                                            imageReceiver = null;
                                            arrayList.add(v20Var);
                                            scaleX = view.getScaleX();
                                            float scaleY2222 = view.getScaleY();
                                            float x102222 = view.getX();
                                            float y32222 = view.getY();
                                            v20Var.q = view.getWidth();
                                            v20Var.r = view.getHeight();
                                            v20Var.f = (view.getWidth() * scaleX) / x3Var.getMeasuredWidth();
                                            v20Var.g = (view.getHeight() * scaleY2222) / x3Var.getMeasuredHeight();
                                            v20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / x3Var.getMeasuredWidth();
                                            v20Var.d = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y32222) / x3Var.getMeasuredHeight();
                                            v20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            v20Var.y = ((view.getWidth() / 2.0f) + x102222) / x3Var.getMeasuredWidth();
                                            v20Var.z = ((view.getHeight() / 2.0f) + y32222) / x3Var.getMeasuredHeight();
                                            v20Var.w = v20Var.q / x3Var.getMeasuredWidth();
                                            v20Var.x = v20Var.r / x3Var.getMeasuredHeight();
                                            v20Var.v = scaleX;
                                            if (jVar instanceof jg.j1) {
                                            }
                                            mediaArea = v20Var.M;
                                            if (mediaArea != null) {
                                            }
                                            z14 = z17;
                                            z15 = z18;
                                        }
                                        b10 = 1;
                                        i14 = 0;
                                    }
                                }
                                view = childAt;
                                z16 = false;
                                z17 = true;
                                imageReceiver = null;
                                arrayList.add(v20Var);
                                scaleX = view.getScaleX();
                                float scaleY22222 = view.getScaleY();
                                float x1022222 = view.getX();
                                float y322222 = view.getY();
                                v20Var.q = view.getWidth();
                                v20Var.r = view.getHeight();
                                v20Var.f = (view.getWidth() * scaleX) / x3Var.getMeasuredWidth();
                                v20Var.g = (view.getHeight() * scaleY22222) / x3Var.getMeasuredHeight();
                                v20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / x3Var.getMeasuredWidth();
                                v20Var.d = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y322222) / x3Var.getMeasuredHeight();
                                v20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                v20Var.y = ((view.getWidth() / 2.0f) + x1022222) / x3Var.getMeasuredWidth();
                                v20Var.z = ((view.getHeight() / 2.0f) + y322222) / x3Var.getMeasuredHeight();
                                v20Var.w = v20Var.q / x3Var.getMeasuredWidth();
                                v20Var.x = v20Var.r / x3Var.getMeasuredHeight();
                                v20Var.v = scaleX;
                                if (jVar instanceof jg.j1) {
                                }
                                mediaArea = v20Var.M;
                                if (mediaArea != null) {
                                }
                                z14 = z17;
                                z15 = z18;
                            } else {
                                x3Var = x3Var2;
                                i12 = childCount;
                                i13 = i16;
                                view = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (z14 && ((z11 || (z12 && v20Var.a == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width3 = bitmap.getWidth() / x3Var.getMeasuredWidth();
                                int i25 = 0;
                                while (i25 < 2) {
                                    Canvas canvas3 = i25 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i25 == 0 && z15)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width3, width3);
                                        canvas3.translate(v20Var.c * x3Var.getMeasuredWidth(), v20Var.d * x3Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((v20Var.f / 2.0f) / view.getScaleX()) * x3Var.getMeasuredWidth(), ((v20Var.g / 2.0f) / view.getScaleY()) * x3Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof jg.g3) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof jg.j1) {
                                                jg.j1 j1Var4 = (jg.j1) view2;
                                                jg.c1 c1Var3 = j1Var4.r0;
                                                boolean z22 = true;
                                                j1Var4.u0 = true;
                                                int i26 = 0;
                                                while (i26 < c1Var3.getChildCount()) {
                                                    View childAt3 = c1Var3.getChildAt(i26);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                                                        ((org.telegram.ui.Cells.q1) childAt3).Ec = z22;
                                                    }
                                                    i26++;
                                                    z22 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z23 = false;
                                                j1Var4.u0 = false;
                                                int i27 = 0;
                                                while (i27 < c1Var3.getChildCount()) {
                                                    View childAt4 = c1Var3.getChildAt(i27);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                                        ((org.telegram.ui.Cells.q1) childAt4).Ec = z23;
                                                    }
                                                    i27++;
                                                    z23 = false;
                                                }
                                            } else {
                                                view2.draw(canvas3);
                                            }
                                        } else {
                                            int scaleX3 = (int) (view2.getScaleX() * view2.getWidth());
                                            int scaleY4 = (int) (view2.getScaleY() * view2.getHeight());
                                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                            Bitmap b12 = js.b(scaleX3, scaleY4);
                                            Canvas canvas4 = new Canvas(b12);
                                            canvas = canvas2;
                                            canvas4.scale(view2.getScaleX(), view2.getScaleY());
                                            view2.draw(canvas4);
                                            canvas3.scale(1.0f / view2.getScaleX(), 1.0f / view2.getScaleY());
                                            canvas3.drawBitmap(b12, (Rect) null, new Rect(0, 0, scaleX3, scaleY4), new Paint(3));
                                            try {
                                                canvas4.setBitmap(null);
                                            } catch (Exception e) {
                                                org.telegram.messenger.f8.f(e);
                                            }
                                            b12.recycle();
                                        }
                                        canvas3.restore();
                                    }
                                    i25++;
                                    canvas2 = canvas;
                                    view = view2;
                                }
                                if (imageReceiver != null) {
                                    b10 = 1;
                                    i14 = 0;
                                    imageReceiver.O0(true, false);
                                }
                            }
                            b10 = 1;
                            i14 = 0;
                        } else {
                            i14 = i15;
                            x3Var = x3Var2;
                            i12 = childCount;
                            i13 = i16;
                            b10 = b11;
                        }
                        i16 = i13 + 1;
                        b4Var = this;
                        b11 = b10;
                        i15 = i14;
                        x3Var2 = x3Var;
                        childCount = i12;
                    }
                }
                return bitmap;
            }
            Bitmap c10 = v3Var.c(false, false);
            createBitmap = c10 != null ? Bitmap.createBitmap(c10.getWidth(), c10.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        b4Var.P0 = BigInteger.ONE;
        i11 = 0;
        while (i10 < x3Var2.getChildCount()) {
        }
        if (i11 > 0) {
        }
        return bitmap;
    }

    @Override // jg.h
    public final int[] r(jg.j jVar) {
        int i10 = (int) jVar.getPosition().x;
        int[] iArr = this.X1;
        iArr[0] = i10;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final boolean r0() {
        return this.m0.a() || this.U1;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.p0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z10) {
        int i10 = 0;
        if (this.Z1) {
            G0(0);
        }
        if (z10) {
            vy vyVar = this.Y1;
            if (vyVar == null || vyVar.getVisibility() != 0) {
                t0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Y1.getMeasuredHeight());
            ofFloat.addUpdateListener(new d3(this, i10));
            this.b2 = true;
            ofFloat.addListener(new p3(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.w);
            ofFloat.start();
        }
    }

    public void setBlurManager(s9 s9Var) {
        this.N1 = s9Var;
    }

    public void setCoverPreview(boolean z10) {
        if (this.V1 != z10) {
            this.V1 = z10;
            if (z10) {
                A0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            x3 x3Var = this.A0;
            if (i10 >= x3Var.getChildCount()) {
                return;
            }
            View childAt = x3Var.getChildAt(i10);
            if (childAt instanceof jg.w2) {
                ImageReceiver imageReceiver = ((jg.w2) childAt).x0;
                bi0 B = imageReceiver.B();
                imageReceiver.m();
                if (B != null) {
                    B.N(Math.round(((j10 % B.r()) / B.r()) * B.e[0]), true, false);
                }
            }
            i10++;
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.H1) {
            this.H1 = z10;
            d0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.u1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.t1 = runnable;
    }

    @Override // jg.r1
    public final void t() {
        if (!this.a2 && !this.Z1) {
            this.U1 = true;
            l0(true);
            return;
        }
        if (this.Z1) {
            jg.j jVar = this.s0;
            if (jVar instanceof jg.g3) {
                this.x1.e = true;
                org.telegram.messenger.i0.J3(((jg.g3) jVar).getEditText());
            }
        }
        G0(!this.Z1 ? 1 : 0);
    }

    public final void t0() {
        vy vyVar;
        if (!this.Z1 && (vyVar = this.Y1) != null && vyVar.getVisibility() != 8) {
            this.Y1.setVisibility(8);
        }
        int i10 = this.c2;
        this.c2 = 0;
        if (i10 != 0) {
            this.x1.a();
        }
    }

    @Override // jg.h
    public final void u(float f7, float f10, float[] fArr) {
        View view;
        View view2 = (View) this.x0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f7 - view2.getX()) - view.getLeft();
        float y3 = (f10 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = ((y3 - view2.getPivotY()) / view2.getScaleY()) + view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    @Override // org.telegram.ui.Components.uu0, org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.n1.setColor(-15132391);
    }

    @Override // jg.x1
    public final ig.s0 v() {
        return ig.s0.e(this.o1);
    }

    public final boolean v0() {
        if (this.L1) {
            if (this.I1.getReactionsWindow() == null || this.I1.getReactionsWindow().q) {
                L0(false);
                return true;
            }
            this.I1.e();
            return true;
        }
        if (this.k1) {
            F0(false);
            return true;
        }
        if (this.Z1) {
            s0(true);
            return true;
        }
        if (!this.t0) {
            return false;
        }
        if (!this.v0) {
            A0(null, true);
            return true;
        }
        this.v0 = false;
        this.x1.b(true);
        return false;
    }

    public abstract void w0(boolean z10);

    public final void x0() {
        final int i10 = this.H0;
        O0(1);
        postDelayed(new r5.a(this, 15), 350L);
        q3 q3Var = new q3(this, getContext(), this.p1, i10);
        this.T1 = q3Var;
        n8 n8Var = this.v1;
        Objects.requireNonNull(n8Var);
        q3Var.t1 = new qh.d(n8Var, 20);
        final boolean[] zArr = {true};
        q3Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vh.l3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                b4 b4Var = b4.this;
                b4Var.T1 = null;
                if (zArr[0]) {
                    b4Var.w0(false);
                }
                b4Var.O0(i10);
            }
        });
        q3Var.v1 = new i3(this);
        q3Var.N0(new org.telegram.ui.Components.i(this, zArr, q3Var, 3));
        q3Var.show();
        w0(true);
    }

    @Override // jg.h
    public final boolean y(jg.j jVar) {
        return A0(jVar, true);
    }

    public final void y0(jg.j jVar) {
        this.m0.b(jVar.getUUID(), new g3(this, jVar, 0));
    }

    @Override // jg.x1
    public final void z(ig.h hVar) {
        boolean z10 = hVar instanceof ig.b;
        jg.d2 d2Var = this.M0;
        if (z10 || (hVar instanceof ig.d)) {
            d2Var.b(0.4f, 1.75f);
        } else {
            d2Var.b(0.05f, 1.0f);
        }
        d2Var.setDrawCenter(!(hVar instanceof ig.g));
        v3 v3Var = this.x0;
        if (v3Var.getCurrentBrush() instanceof ig.g) {
            this.L0 = true;
        }
        v3Var.setBrush(hVar);
        ig.q1 q1Var = this.j1;
        int i10 = q1Var.a;
        q1Var.a = ig.s0.e(this.o1).c();
        q1Var.c = this.N0.get();
        B0(q1Var, Integer.valueOf(i10), false);
        this.y0.invalidate();
    }

    public final void z0(jg.j jVar) {
        jg.j jVar2 = this.s0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            A0(null, true);
            if (jVar instanceof jg.g3) {
                ValueAnimator valueAnimator = this.K0;
                if (valueAnimator != null && this.I0 != 0) {
                    valueAnimator.cancel();
                }
                O0(0);
            }
        }
        this.A0.removeView(jVar);
        d0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            ig.t1 t1Var = this.m0;
            t1Var.b.remove(uuid);
            t1Var.c.remove(uuid);
            org.telegram.messenger.i0.g3(new gg.c(t1Var, 9));
        }
        jg.d2 d2Var = this.M0;
        r2.y yVar = this.N0;
        d2Var.setValueOverride(yVar);
        d2Var.setShowPreview(true);
        float f7 = yVar.get();
        ig.q1 q1Var = this.j1;
        q1Var.c = f7;
        B0(q1Var, null, false);
        if (this.W1 || !(jVar instanceof jg.i2)) {
            return;
        }
        o8 o8Var = ((s7) this).j2;
        d8 d8Var = o8Var.X0;
        if (d8Var != null) {
            d8Var.s(null, null, true);
        }
        s7 s7Var = o8Var.v1;
        if (s7Var != null) {
            s7Var.n0();
        }
        e8 e8Var = o8Var.c1;
        if (e8Var != null) {
            e8Var.setHasRoundVideo(false);
        }
        n5 n5Var = o8Var.K1;
        if (n5Var != null) {
            File file = n5Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                o8Var.K1.o0 = null;
            }
            if (o8Var.K1.p0 != null) {
                try {
                    new File(o8Var.K1.p0).delete();
                } catch (Exception unused2) {
                }
                o8Var.K1.p0 = null;
            }
        }
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}
