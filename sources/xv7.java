// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
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
import android.widget.LinearLayout;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class xv7 extends fla implements ku7, u44, gu7, dla, r9b {
    public boolean A0;
    public Runnable A1;
    public int B0;
    public Runnable B1;
    public boolean C0;
    public final u9b C1;
    public final boolean D0;
    public AnimatorSet D1;
    public final sv7 E0;
    public final kv7 E1;
    public final sb F0;
    public g6b F1;
    public final iv7 G0;
    public ArrayList G1;
    public final tv7 H0;
    public int H1;
    public final FrameLayout I0;
    public int I1;
    public final uv7 J0;
    public ln2 J1;
    public final iv7 K0;
    public final boolean K1;
    public final FrameLayout L0;
    public final File L1;
    public f7 M0;
    public final boolean M1;
    public final View N0;
    public final boolean N1;
    public int O0;
    public boolean O1;
    public int P0;
    public v29 P1;
    public float Q0;
    public g29 Q1;
    public ValueAnimator R0;
    public float R1;
    public boolean S0;
    public boolean S1;
    public final aw7 T0;
    public boolean T1;
    public final lj4 U0;
    public sm0 U1;
    public final int V0;
    public final n10 V1;
    public BigInteger W0;
    public final k9b W1;
    public TextView X0;
    public boolean X1;
    public TextView Y0;
    public ObjectAnimator Y1;
    public TextView Z0;
    public boolean Z1;
    public final lu7 a1;
    public final gd1 a2;
    public final iu7 b1;
    public final g6b b2;
    public final tu7 c1;
    public final k44 c2;
    public final ImageView d1;
    public final float[] d2;
    public final TextView e1;
    public nv7 e2;
    public final TextView f1;
    public boolean f2;
    public final TextView g1;
    public boolean g2;
    public final Paint h1;
    public boolean h2;
    public final Paint i1;
    public final int[] i2;
    public float j1;
    public e34 j2;
    public boolean k1;
    public boolean k2;
    public zna l1;
    public boolean l2;
    public final jv7 m1;
    public boolean m2;
    public final Paint n1;
    public int n2;
    public final Paint o1;
    public boolean o2;
    public final Paint p1;
    public int p2;
    public final yt7 q0;
    public final oeb q1;
    public int q2;
    public final du7 r0;
    public boolean r1;
    public int r2;
    public final Bitmap s0;
    public zna s1;
    public boolean s2;
    public final b7c t0;
    public float t1;
    public final np3 u0;
    public final Paint u1;
    public final ao6 v0;
    public final int v1;
    public boolean w0;
    public final rk5 w1;
    public xka x0;
    public m8 x1;
    public boolean y0;
    public wv7 y1;
    public w44 z0;
    public Rect z1;

    public xv7(Context context, boolean z, File file, boolean z2, boolean z3, u9b u9bVar, Activity activity, final int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, g6b g6bVar, int i3, int i4, ao6 ao6Var, sm0 sm0Var, r63 r63Var, n10 n10Var, k9b k9bVar) {
        super(context, activity);
        rk5 rk5Var;
        sm0 sm0Var2;
        this.O0 = 0;
        this.P0 = -1;
        final z8b z8bVar = (z8b) this;
        lj4 lj4Var = new lj4(z8bVar);
        this.U0 = lj4Var;
        Paint paint = new Paint(1);
        this.h1 = paint;
        Paint paint2 = new Paint(1);
        this.i1 = paint2;
        this.n1 = new Paint(1);
        this.o1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.p1 = paint3;
        oeb oebVar = new oeb(1.0f, 0.016773745f, -1);
        this.q1 = oebVar;
        this.u1 = new Paint(1);
        k44 k44Var = new k44(z8bVar, (byte) 21);
        this.c2 = k44Var;
        this.d2 = new float[2];
        this.g2 = false;
        this.i2 = new int[2];
        new ei7(z8bVar, (byte) 3);
        setDelegate(this);
        this.U1 = sm0Var;
        this.V1 = n10Var;
        this.K1 = z;
        this.L1 = file;
        this.M1 = z2;
        this.N1 = z3;
        this.C1 = u9bVar;
        this.H1 = i3;
        this.I1 = i4;
        this.W1 = k9bVar;
        this.v1 = i;
        if (z2 && !z3 && g6bVar != null && g6bVar.L != null && !g6bVar.v()) {
            this.b2 = g6bVar;
            File file2 = g6bVar.L;
            gd1 gd1Var = (file2 != null && file2.exists() && DictationAsr.C(i)) ? new gd1(file2, k44Var) : null;
            this.a2 = gd1Var;
            if (gd1Var != null) {
                gd1Var.d = new yu7(z8bVar, (byte) 0);
            }
        }
        rk5 rk5Var2 = new rk5(r63Var);
        this.w1 = rk5Var2;
        this.v0 = ao6Var;
        this.D0 = context instanceof BubbleActivity;
        m58 e = m58.e(i);
        e.i(0, true);
        oebVar.a = e.c();
        oebVar.c = e.i;
        np3 np3Var = new np3("Paint", true);
        this.u0 = np3Var;
        this.s0 = bitmap;
        this.V0 = i2;
        b7c b7cVar = new b7c();
        this.t0 = b7cVar;
        b7cVar.a = new cj6(z8bVar, (byte) 23);
        View view = new View(context);
        this.N0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        hw7 hw7Var = new hw7(getPaintingSize(), null, i2, sm0Var);
        if (g6bVar == null || !g6bVar.u) {
            rk5Var = rk5Var2;
            sm0Var2 = sm0Var;
        } else {
            rk5Var = rk5Var2;
            sm0Var2 = null;
        }
        sv7 sv7Var = new sv7(z8bVar, context, hw7Var, bitmap, bitmap2, sm0Var2);
        this.E0 = sv7Var;
        sv7Var.setDelegate(new ai4((Object) z8bVar, (byte) 18));
        sv7Var.setUndoStore(b7cVar);
        sv7Var.setQueue(np3Var);
        sv7Var.setVisibility(4);
        sb sbVar = new sb((byte) 23, context, z8bVar);
        this.F0 = sbVar;
        sbVar.setVisibility(4);
        tv7 tv7Var = new tv7(z8bVar, context, new fk3(z8bVar));
        this.H0 = tv7Var;
        this.F1 = g6bVar;
        this.G1 = arrayList;
        if (this.H1 > 0 && this.I1 > 0) {
            H0();
        }
        tv7Var.setVisibility(4);
        this.G0 = new iv7(z8bVar, context, (byte) 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I0 = frameLayout;
        frameLayout.setPadding(gm.L(4.0f), gm.L(12.0f), gm.L(4.0f), gm.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{TLObject.FLAG_30, 0}));
        addView(frameLayout, qoe.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.d1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
        final byte b = 1;
        imageView.setBackground(cmb.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: av7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                z8b z8bVar2 = z8bVar;
                switch (b2) {
                    case 0:
                        if (!z8bVar2.r1) {
                            if (!z8bVar2.k2) {
                                if (!z8bVar2.A0) {
                                    Runnable runnable = z8bVar2.B1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    z8bVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                z8bVar2.s0(true);
                                break;
                            }
                        } else {
                            z8bVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        sv7 sv7Var2 = z8bVar2.E0;
                        if (sv7Var2 != null && (sv7Var2.getCurrentBrush() instanceof t11)) {
                            sv7Var2.b();
                            z8bVar2.a1.setSelectedIndex(1);
                            z8bVar2.s((u11) u11.a.get(0));
                            break;
                        } else {
                            z8bVar2.t0.c();
                            break;
                        }
                        break;
                    case 2:
                        sv7 sv7Var3 = z8bVar2.E0;
                        b7c b7cVar2 = z8bVar2.t0;
                        if (b7cVar2.a()) {
                            if (sv7Var3 != null && (sv7Var3.getCurrentBrush() instanceof t11)) {
                                sv7Var3.b();
                                z8bVar2.a1.setSelectedIndex(1);
                                z8bVar2.s((u11) u11.a.get(0));
                            }
                            if (sv7Var3 != null) {
                                sv7Var3.a();
                            }
                            b7cVar2.c.clear();
                            b7cVar2.b.clear();
                            gm.c3(new zcb(b7cVar2, (byte) 28));
                            z8bVar2.H0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        w44 w44Var = z8bVar2.z0;
                        if (w44Var instanceof xjb) {
                            gm.t1(((xjb) w44Var).getFocusedView());
                        }
                        if (z8bVar2.k2) {
                            z8bVar2.s0(false);
                        }
                        z8bVar2.B0(z8bVar2.z0);
                        z8bVar2.D0(null, true);
                        break;
                    default:
                        z8bVar2.D0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, qoe.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(cmb.f0(822083583, 7, -1));
        linearLayout.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(jb6.M0(2131747000, null));
        linearLayout.addView(td4.k(context, R.drawable.photo_zoomout), qoe.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, qoe.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new x10((byte) 12));
        frameLayout.addView(linearLayout, qoe.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.e1 = textView2;
        textView2.setBackground(cmb.f0(822083583, 7, -1));
        textView2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        textView2.setText(jb6.M0(2131747012, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(gm.o());
        textView2.setTextSize(1, 16.0f);
        final byte b2 = 2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: av7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                z8b z8bVar2 = z8bVar;
                switch (b22) {
                    case 0:
                        if (!z8bVar2.r1) {
                            if (!z8bVar2.k2) {
                                if (!z8bVar2.A0) {
                                    Runnable runnable = z8bVar2.B1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    z8bVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                z8bVar2.s0(true);
                                break;
                            }
                        } else {
                            z8bVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        sv7 sv7Var2 = z8bVar2.E0;
                        if (sv7Var2 != null && (sv7Var2.getCurrentBrush() instanceof t11)) {
                            sv7Var2.b();
                            z8bVar2.a1.setSelectedIndex(1);
                            z8bVar2.s((u11) u11.a.get(0));
                            break;
                        } else {
                            z8bVar2.t0.c();
                            break;
                        }
                        break;
                    case 2:
                        sv7 sv7Var3 = z8bVar2.E0;
                        b7c b7cVar2 = z8bVar2.t0;
                        if (b7cVar2.a()) {
                            if (sv7Var3 != null && (sv7Var3.getCurrentBrush() instanceof t11)) {
                                sv7Var3.b();
                                z8bVar2.a1.setSelectedIndex(1);
                                z8bVar2.s((u11) u11.a.get(0));
                            }
                            if (sv7Var3 != null) {
                                sv7Var3.a();
                            }
                            b7cVar2.c.clear();
                            b7cVar2.b.clear();
                            gm.c3(new zcb(b7cVar2, (byte) 28));
                            z8bVar2.H0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        w44 w44Var = z8bVar2.z0;
                        if (w44Var instanceof xjb) {
                            gm.t1(((xjb) w44Var).getFocusedView());
                        }
                        if (z8bVar2.k2) {
                            z8bVar2.s0(false);
                        }
                        z8bVar2.B0(z8bVar2.z0);
                        z8bVar2.D0(null, true);
                        break;
                    default:
                        z8bVar2.D0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l = wi8.l(frameLayout, textView2, qoe.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f1 = l;
        l.setBackground(cmb.f0(822083583, 7, -1));
        l.setText(jb6.M0(2131752038, null));
        l.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        l.setGravity(16);
        l.setTextColor(-1);
        l.setTypeface(gm.o());
        l.setTextSize(1, 16.0f);
        final byte b3 = 3;
        l.setOnClickListener(new View.OnClickListener() { // from class: av7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                z8b z8bVar2 = z8bVar;
                switch (b22) {
                    case 0:
                        if (!z8bVar2.r1) {
                            if (!z8bVar2.k2) {
                                if (!z8bVar2.A0) {
                                    Runnable runnable = z8bVar2.B1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    z8bVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                z8bVar2.s0(true);
                                break;
                            }
                        } else {
                            z8bVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        sv7 sv7Var2 = z8bVar2.E0;
                        if (sv7Var2 != null && (sv7Var2.getCurrentBrush() instanceof t11)) {
                            sv7Var2.b();
                            z8bVar2.a1.setSelectedIndex(1);
                            z8bVar2.s((u11) u11.a.get(0));
                            break;
                        } else {
                            z8bVar2.t0.c();
                            break;
                        }
                        break;
                    case 2:
                        sv7 sv7Var3 = z8bVar2.E0;
                        b7c b7cVar2 = z8bVar2.t0;
                        if (b7cVar2.a()) {
                            if (sv7Var3 != null && (sv7Var3.getCurrentBrush() instanceof t11)) {
                                sv7Var3.b();
                                z8bVar2.a1.setSelectedIndex(1);
                                z8bVar2.s((u11) u11.a.get(0));
                            }
                            if (sv7Var3 != null) {
                                sv7Var3.a();
                            }
                            b7cVar2.c.clear();
                            b7cVar2.b.clear();
                            gm.c3(new zcb(b7cVar2, (byte) 28));
                            z8bVar2.H0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        w44 w44Var = z8bVar2.z0;
                        if (w44Var instanceof xjb) {
                            gm.t1(((xjb) w44Var).getFocusedView());
                        }
                        if (z8bVar2.k2) {
                            z8bVar2.s0(false);
                        }
                        z8bVar2.B0(z8bVar2.z0);
                        z8bVar2.D0(null, true);
                        break;
                    default:
                        z8bVar2.D0(null, true);
                        break;
                }
            }
        });
        l.setAlpha(0.0f);
        l.setVisibility(8);
        TextView l2 = wi8.l(frameLayout, l, qoe.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.g1 = l2;
        l2.setBackground(cmb.f0(822083583, 7, -1));
        l2.setText(jb6.M0(2131751291, null));
        l2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        l2.setGravity(16);
        l2.setTextColor(-1);
        l2.setTypeface(gm.o());
        l2.setTextSize(1, 16.0f);
        final byte b4 = 4;
        l2.setOnClickListener(new View.OnClickListener() { // from class: av7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                z8b z8bVar2 = z8bVar;
                switch (b22) {
                    case 0:
                        if (!z8bVar2.r1) {
                            if (!z8bVar2.k2) {
                                if (!z8bVar2.A0) {
                                    Runnable runnable = z8bVar2.B1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    z8bVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                z8bVar2.s0(true);
                                break;
                            }
                        } else {
                            z8bVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        sv7 sv7Var2 = z8bVar2.E0;
                        if (sv7Var2 != null && (sv7Var2.getCurrentBrush() instanceof t11)) {
                            sv7Var2.b();
                            z8bVar2.a1.setSelectedIndex(1);
                            z8bVar2.s((u11) u11.a.get(0));
                            break;
                        } else {
                            z8bVar2.t0.c();
                            break;
                        }
                        break;
                    case 2:
                        sv7 sv7Var3 = z8bVar2.E0;
                        b7c b7cVar2 = z8bVar2.t0;
                        if (b7cVar2.a()) {
                            if (sv7Var3 != null && (sv7Var3.getCurrentBrush() instanceof t11)) {
                                sv7Var3.b();
                                z8bVar2.a1.setSelectedIndex(1);
                                z8bVar2.s((u11) u11.a.get(0));
                            }
                            if (sv7Var3 != null) {
                                sv7Var3.a();
                            }
                            b7cVar2.c.clear();
                            b7cVar2.b.clear();
                            gm.c3(new zcb(b7cVar2, (byte) 28));
                            z8bVar2.H0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        w44 w44Var = z8bVar2.z0;
                        if (w44Var instanceof xjb) {
                            gm.t1(((xjb) w44Var).getFocusedView());
                        }
                        if (z8bVar2.k2) {
                            z8bVar2.s0(false);
                        }
                        z8bVar2.B0(z8bVar2.z0);
                        z8bVar2.D0(null, true);
                        break;
                    default:
                        z8bVar2.D0(null, true);
                        break;
                }
            }
        });
        l2.setAlpha(0.0f);
        l2.setVisibility(8);
        frameLayout.addView(l2, qoe.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        uv7 uv7Var = new uv7(z8bVar, context, e);
        this.J0 = uv7Var;
        uv7Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), 0);
        uv7Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(uv7Var, qoe.e(-1, nm7.o1, 80));
        lu7 lu7Var = new lu7(context, (g6bVar == null || g6bVar.v() || g6bVar.u || sm0Var == null) ? false : true);
        this.a1 = lu7Var;
        lu7Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        lu7Var.setDelegate(this);
        lu7Var.setSelectedIndex(1);
        uv7Var.addView(lu7Var, qoe.c(48.0f, -1));
        iu7 iu7Var = new iu7(context);
        this.b1 = iu7Var;
        iu7Var.setPadding(gm.L(16.0f), 0, gm.L(8.0f), 0);
        iu7Var.setVisibility(8);
        iu7Var.setDelegate(this);
        final byte b5 = 1;
        post(new Runnable() { // from class: bv7
            @Override // java.lang.Runnable
            public final void run() {
                byte b6 = b5;
                int i5 = i;
                z8b z8bVar2 = z8bVar;
                switch (b6) {
                    case 0:
                        oeb oebVar2 = z8bVar2.q1;
                        z8bVar2.F0(oebVar2);
                        m58.e(i5).j(oebVar2.c);
                        break;
                    default:
                        z8bVar2.b1.setTypeface(m58.e(i5).j);
                        break;
                }
            }
        });
        iu7Var.setAlignment(m58.e(i).g);
        uv7Var.addView(iu7Var, qoe.c(48.0f, -1));
        iv7 iv7Var = new iv7(z8bVar, context, (byte) 0);
        this.K0 = iv7Var;
        addView(iv7Var, qoe.c(-1.0f, -1));
        tu7 tu7Var = new tu7(context);
        this.c1 = tu7Var;
        tu7Var.setVisibility(8);
        tu7Var.setOnItemClickListener(new kg4(z8bVar, (byte) 16));
        iu7Var.setTypefaceListView(tu7Var);
        iv7Var.addView(tu7Var, qoe.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(cmb.v0(cmb.F8, rk5Var));
        jv7 jv7Var = new jv7(z8bVar, context);
        this.m1 = jv7Var;
        jv7Var.setVisibility(8);
        jv7Var.setColorPalette(m58.e(i));
        byte b6 = 11;
        jv7Var.setColorListener(new gx(z8bVar, b6));
        uv7Var.addView(jv7Var, qoe.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        yt7 yt7Var = new yt7(context);
        this.q0 = yt7Var;
        yt7Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        yt7Var.setBackground(cmb.f0(1090519039, 1, -1));
        uv7Var.addView(yt7Var, qoe.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final byte b7 = 0;
        yt7Var.setOnClickListener(new View.OnClickListener() { // from class: av7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b7;
                z8b z8bVar2 = z8bVar;
                switch (b22) {
                    case 0:
                        if (!z8bVar2.r1) {
                            if (!z8bVar2.k2) {
                                if (!z8bVar2.A0) {
                                    Runnable runnable = z8bVar2.B1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    z8bVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                z8bVar2.s0(true);
                                break;
                            }
                        } else {
                            z8bVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        sv7 sv7Var2 = z8bVar2.E0;
                        if (sv7Var2 != null && (sv7Var2.getCurrentBrush() instanceof t11)) {
                            sv7Var2.b();
                            z8bVar2.a1.setSelectedIndex(1);
                            z8bVar2.s((u11) u11.a.get(0));
                            break;
                        } else {
                            z8bVar2.t0.c();
                            break;
                        }
                        break;
                    case 2:
                        sv7 sv7Var3 = z8bVar2.E0;
                        b7c b7cVar2 = z8bVar2.t0;
                        if (b7cVar2.a()) {
                            if (sv7Var3 != null && (sv7Var3.getCurrentBrush() instanceof t11)) {
                                sv7Var3.b();
                                z8bVar2.a1.setSelectedIndex(1);
                                z8bVar2.s((u11) u11.a.get(0));
                            }
                            if (sv7Var3 != null) {
                                sv7Var3.a();
                            }
                            b7cVar2.c.clear();
                            b7cVar2.b.clear();
                            gm.c3(new zcb(b7cVar2, (byte) 28));
                            z8bVar2.H0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        w44 w44Var = z8bVar2.z0;
                        if (w44Var instanceof xjb) {
                            gm.t1(((xjb) w44Var).getFocusedView());
                        }
                        if (z8bVar2.k2) {
                            z8bVar2.s0(false);
                        }
                        z8bVar2.B0(z8bVar2.z0);
                        z8bVar2.D0(null, true);
                        break;
                    default:
                        z8bVar2.D0(null, true);
                        break;
                }
            }
        });
        du7 du7Var = new du7(context);
        this.r0 = du7Var;
        du7Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        du7Var.setBackground(cmb.f0(1090519039, 1, -1));
        du7Var.setOnClickListener(new jw4(z8bVar, context, e, b6));
        uv7Var.addView(du7Var, qoe.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        aw7 aw7Var = new aw7(context);
        this.T0 = aw7Var;
        aw7Var.setColorSwatch(oebVar);
        aw7Var.setRenderView(sv7Var);
        aw7Var.setValueOverride(lj4Var);
        oebVar.c = lj4Var.get();
        final byte b8 = 0;
        aw7Var.setOnUpdate(new Runnable() { // from class: bv7
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b8;
                int i5 = i;
                z8b z8bVar2 = z8bVar;
                switch (b62) {
                    case 0:
                        oeb oebVar2 = z8bVar2.q1;
                        z8bVar2.F0(oebVar2);
                        m58.e(i5).j(oebVar2.c);
                        break;
                    default:
                        z8bVar2.b1.setTypeface(m58.e(i5).j);
                        break;
                }
            }
        });
        addView(aw7Var, qoe.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L0 = frameLayout2;
        addView(frameLayout2, qoe.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(gm.L(2.0f));
        E0(oebVar, null, false);
        s((u11) u11.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = gm.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), gm.L(100.0f), (int) (point.y * 0.65d))));
        }
        this.E1 = new kv7(z8bVar, u9bVar, new u35(z8bVar, u9bVar, (byte) 15));
        px3.C1 = 1;
    }

    public static void G0(xjb xjbVar, int i) {
        xjbVar.setAlign(i);
        int i2 = 2;
        xjbVar.getEditText().setGravity(i != 1 ? i != 2 ? 19 : 21 : 17);
        if (i != 1) {
            boolean z = jb6.a0;
            if (i == 2 ? !z : z) {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        xjbVar.getEditText().setTextAlignment(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.O0 == 2 ? this.b1 : this.a1;
    }

    private int getFrameRotation() {
        int i = this.V0;
        if (i == 90) {
            return 1;
        }
        if (i != 180) {
            return i != 270 ? 0 : 3;
        }
        return 2;
    }

    private xka getPaintingSize() {
        xka xkaVar = this.x0;
        if (xkaVar != null) {
            return xkaVar;
        }
        xka xkaVar2 = new xka(1080.0f, 1920.0f);
        this.x0 = xkaVar2;
        return xkaVar2;
    }

    private void setCoverPause(boolean z) {
        int i = 0;
        while (true) {
            tv7 tv7Var = this.H0;
            if (i >= tv7Var.getChildCount()) {
                return;
            }
            View childAt = tv7Var.getChildAt(i);
            if (childAt instanceof z1b) {
                ImageReceiver imageReceiver = ((z1b) childAt).z0;
                p09 y = imageReceiver.y();
                kn m = imageReceiver.m();
                boolean z2 = !z;
                imageReceiver.v0 = z2;
                imageReceiver.u0 = z2;
                if (y != null) {
                    if (z) {
                        y.stop();
                    } else {
                        y.start();
                    }
                } else if (m != null) {
                    m.E = z;
                    if (z) {
                        m.x(false);
                        m.stop();
                    } else {
                        m.start();
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i) {
        oeb oebVar = this.q1;
        int i2 = oebVar.a;
        oebVar.a = i;
        E0(oebVar, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new bo(this, i2, i, (byte) 3));
        duration.start();
    }

    private void setTextType(int i) {
        this.B0 = i;
        w44 w44Var = this.z0;
        if (w44Var instanceof xjb) {
            ((xjb) w44Var).setType(i);
        }
        m58 e = m58.e(this.v1);
        e.h = i;
        e.a.edit().putInt("text_type", i).apply();
        this.b1.e(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextWeightRange(w44 w44Var) {
        boolean z = w44Var instanceof kd1;
        aw7 aw7Var = this.T0;
        if (z) {
            aw7Var.b(0.3f, 1.1f);
        } else {
            aw7Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        f7 f7Var = new f7(this, context);
        this.M0 = f7Var;
        final byte b = 0;
        f7Var.setClipToPadding(false);
        this.M0.setOrientation(0);
        this.J0.addView(this.M0, qoe.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.X0 = textView;
        textView.setText(jb6.M0(2131747010, null).toUpperCase());
        TextView textView2 = this.X0;
        int i = cmb.h6;
        rk5 rk5Var = this.w1;
        anb.R(textView2, cmb.f0(cmb.v0(i, rk5Var), 7, -1), null, anb.M(i), rk5Var);
        this.X0.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        this.X0.setTextColor(-1);
        final byte b2 = 1;
        this.X0.setTextSize(1, 14.0f);
        this.X0.setGravity(1);
        this.X0.setTypeface(gm.o());
        this.X0.setSingleLine();
        this.X0.setOnClickListener(new View.OnClickListener(this) { // from class: vu7
            public final /* synthetic */ xv7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                xv7 xv7Var = this.b;
                switch (b3) {
                    case 0:
                        if (!xv7Var.A0) {
                            xv7Var.R0(0);
                            break;
                        } else {
                            xv7Var.D0(null, true);
                            break;
                        }
                    case 1:
                        xv7Var.z0();
                        break;
                    default:
                        xv7Var.R0(2);
                        if (!(xv7Var.z0 instanceof xjb)) {
                            xv7Var.f2 = true;
                            xv7Var.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.M0.addView(this.X0, qoe.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.Y0 = textView3;
        textView3.setText(jb6.M0(2131747009, null).toUpperCase());
        anb.R(this.Y0, cmb.f0(cmb.v0(i, rk5Var), 7, -1), null, anb.M(i), rk5Var);
        this.Y0.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        this.Y0.setOnClickListener(new View.OnClickListener(this) { // from class: vu7
            public final /* synthetic */ xv7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                xv7 xv7Var = this.b;
                switch (b3) {
                    case 0:
                        if (!xv7Var.A0) {
                            xv7Var.R0(0);
                            break;
                        } else {
                            xv7Var.D0(null, true);
                            break;
                        }
                    case 1:
                        xv7Var.z0();
                        break;
                    default:
                        xv7Var.R0(2);
                        if (!(xv7Var.z0 instanceof xjb)) {
                            xv7Var.f2 = true;
                            xv7Var.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.Y0.setTextColor(-1);
        this.Y0.setTextSize(1, 14.0f);
        this.Y0.setGravity(1);
        this.Y0.setTypeface(gm.o());
        this.Y0.setAlpha(0.6f);
        this.Y0.setSingleLine();
        this.M0.addView(this.Y0, qoe.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.Z0 = textView4;
        textView4.setText(jb6.M0(2131747008, null).toUpperCase());
        anb.R(this.Z0, cmb.f0(cmb.v0(i, rk5Var), 7, -1), null, anb.M(i), rk5Var);
        this.Z0.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        this.Z0.setTextColor(-1);
        this.Z0.setTextSize(1, 14.0f);
        this.Z0.setGravity(1);
        this.Z0.setTypeface(gm.o());
        this.Z0.setAlpha(0.6f);
        this.Z0.setSingleLine();
        final byte b3 = 2;
        this.Z0.setOnClickListener(new View.OnClickListener(this) { // from class: vu7
            public final /* synthetic */ xv7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                xv7 xv7Var = this.b;
                switch (b32) {
                    case 0:
                        if (!xv7Var.A0) {
                            xv7Var.R0(0);
                            break;
                        } else {
                            xv7Var.D0(null, true);
                            break;
                        }
                    case 1:
                        xv7Var.z0();
                        break;
                    default:
                        xv7Var.R0(2);
                        if (!(xv7Var.z0 instanceof xjb)) {
                            xv7Var.f2 = true;
                            xv7Var.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.M0.addView(this.Z0, qoe.l(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    @Override // u44
    public final void A(w44 w44Var) {
        O0(false);
        M0(w44Var);
    }

    public final void A0(w44 w44Var) {
        this.t0.b(w44Var.getUUID(), new cv7(this, w44Var, (byte) 0));
    }

    public final void B0(w44 w44Var) {
        w44 w44Var2 = this.z0;
        if (w44Var == w44Var2 && w44Var2 != null) {
            w44Var2.l(w44Var2.o0, false);
            D0(null, true);
            if (w44Var instanceof xjb) {
                ValueAnimator valueAnimator = this.R0;
                if (valueAnimator != null && this.P0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.H0.removeView(w44Var);
        c0();
        if (w44Var != null) {
            UUID uuid = w44Var.getUUID();
            b7c b7cVar = this.t0;
            b7cVar.b.remove(uuid);
            b7cVar.c.remove(uuid);
            gm.c3(new zcb(b7cVar, (byte) 28));
        }
        aw7 aw7Var = this.T0;
        lj4 lj4Var = this.U0;
        aw7Var.setValueOverride(lj4Var);
        aw7Var.setShowPreview(true);
        float f = lj4Var.get();
        oeb oebVar = this.q1;
        oebVar.c = f;
        E0(oebVar, null, false);
        if (this.h2 || !(w44Var instanceof ao9)) {
            return;
        }
        v9b v9bVar = ((z8b) this).u2;
        k9b k9bVar = v9bVar.Y0;
        if (k9bVar != null) {
            k9bVar.s(null, null, true);
        }
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null) {
            z8bVar.n0();
        }
        l9b l9bVar = v9bVar.d1;
        if (l9bVar != null) {
            l9bVar.setHasRoundVideo(false);
        }
        g6b g6bVar = v9bVar.L1;
        if (g6bVar != null) {
            File file = g6bVar.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                g6bVar = v9bVar.L1;
                g6bVar.o0 = null;
            }
            if (g6bVar.p0 != null) {
                try {
                    new File(v9bVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                v9bVar.L1.p0 = null;
            }
        }
    }

    public final void C0(w44 w44Var) {
        D0(w44Var, true);
    }

    @Override // gu7
    public final void D() {
        P0(true);
    }

    public final boolean D0(w44 w44Var, boolean z) {
        boolean z2;
        lqb lqbVar;
        lqb lqbVar2;
        v29 v29Var;
        int i;
        boolean z3 = w44Var instanceof xjb;
        byte b = 2;
        if (z3 && ((i = this.P0) != -1 ? i != 2 : this.O0 != 2)) {
            ValueAnimator valueAnimator = this.R0;
            if (valueAnimator != null && i != 2) {
                valueAnimator.cancel();
            }
            if (this.r1) {
                I0(false);
            }
            R0(2);
        }
        boolean z4 = true;
        if (z3 && z) {
            xjb xjbVar = (xjb) w44Var;
            int gravity = xjbVar.getEditText().getGravity();
            int i2 = gravity != 17 ? gravity != 21 ? 0 : 2 : 1;
            iu7 iu7Var = this.b1;
            iu7Var.setAlignment(i2);
            ru7 typeface = xjbVar.getTypeface();
            if (typeface != null) {
                iu7Var.setTypeface(typeface.a);
            }
            iu7Var.e(xjbVar.getType(), true);
            this.K0.invalidate();
        }
        w44 w44Var2 = this.z0;
        if (w44Var2 == null) {
            z2 = false;
        } else {
            if (w44Var2 == w44Var) {
                if (!w44Var.f0) {
                    if (w44Var instanceof nd6) {
                        nd6 nd6Var = (nd6) w44Var;
                        nd6Var.setType((nd6Var.getType() + 1) % nd6Var.getTypesCount());
                        return true;
                    }
                    if (w44Var instanceof kuc) {
                        kuc kucVar = (kuc) w44Var;
                        kucVar.setType((kucVar.getType() + 1) % kucVar.getTypesCount());
                        return true;
                    }
                    if (w44Var instanceof o66) {
                        o66 o66Var = (o66) w44Var;
                        d66 d66Var = o66Var.s0;
                        if (d66Var.e()) {
                            d66Var.setPreviewType(d66Var.getPreviewType() == 0 ? (byte) 1 : (byte) 0);
                            return true;
                        }
                        o66Var.setType(o66Var.getNextType());
                        return true;
                    }
                    if (!this.A0) {
                        if (w44Var instanceof xjb) {
                            this.C0 = true;
                            o0();
                            return true;
                        }
                        if (!(w44Var instanceof g29)) {
                            M0(w44Var2);
                            return true;
                        }
                        g29 g29Var = (g29) w44Var;
                        if (this.S1 && this.Q1 == w44Var) {
                            g29Var.q(true);
                            return true;
                        }
                        g29 g29Var2 = this.Q1;
                        if (g29Var2 != null && g29Var2 != g29Var && (v29Var = this.P1) != null) {
                            v29Var.animate().alpha(0.0f).setListener(new lv7(v29Var, r2));
                            this.P1 = null;
                            this.S1 = false;
                            this.R1 = 0.0f;
                        }
                        if (this.P1 == null) {
                            v29 v29Var2 = new v29(2, this.v1, new pv0(new r63(), b), getContext(), LaunchActivity.Q());
                            this.P1 = v29Var2;
                            wm0 wm0Var = new wm0(this.U1, v29Var2, 0, false);
                            this.P1.setPadding(0, gm.L(22.0f), 0, gm.L(22.0f));
                            this.C1.addView(this.P1, qoe.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(on2.p(-16777216, nm7.E1));
                            this.P1.setDelegate(new sm2(this, wm0Var, paint));
                            this.P1.m(null, null, true);
                        }
                        this.P1.setFragment(LaunchActivity.Q());
                        this.Q1 = g29Var;
                        O0(true);
                        return true;
                    }
                    if (w44Var2 instanceof xjb) {
                        gm.E3(((xjb) w44Var2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            w44Var2.l(w44Var2.o0, false);
            w44 w44Var3 = this.z0;
            if (w44Var3 instanceof xjb) {
                ((xjb) w44Var3).r();
                if (!z3) {
                    this.A0 = false;
                    gm.t1(((xjb) this.z0).getFocusedView());
                    s0(false);
                }
            } else if ((w44Var3 instanceof ao9) && (lqbVar2 = ((z8b) this).u2.a1) != null) {
                lqbVar2.l(false);
            }
            z2 = true;
        }
        w44 w44Var4 = this.z0;
        this.z0 = w44Var;
        if ((w44Var4 instanceof xjb) && TextUtils.isEmpty(((xjb) w44Var4).getText()) && !(w44Var4 instanceof kd1)) {
            B0(w44Var4);
        }
        w44 w44Var5 = this.z0;
        if (w44Var4 != w44Var5 && (w44Var5 instanceof ao9) && (lqbVar = ((z8b) this).u2.a1) != null) {
            lqbVar.l(true);
        }
        w44 w44Var6 = this.z0;
        lj4 lj4Var = this.U0;
        oeb oebVar = this.q1;
        aw7 aw7Var = this.T0;
        if (w44Var6 != null) {
            iv7 iv7Var = this.G0;
            w44Var6.o0 = iv7Var;
            w44Var6.l(iv7Var, true);
            w44 w44Var7 = this.z0;
            if (w44Var7 instanceof xjb) {
                xjb xjbVar2 = (xjb) w44Var7;
                xjbVar2.getSwatch().c = oebVar.c;
                xjbVar2.B0 = false;
                F0(xjbVar2.getSwatch());
                float f = (int) (this.x0.a / 9.0f);
                setTextWeightRange(xjbVar2);
                aw7Var.setValueOverride(new fy5(xjbVar2, f, (byte) 1));
                aw7Var.setShowPreview(false);
            } else {
                aw7Var.setValueOverride(lj4Var);
                aw7Var.setShowPreview(true);
                oebVar.c = lj4Var.get();
                E0(oebVar, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.R0;
            if (valueAnimator2 != null && this.P0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.r1) {
                I0(false);
            }
            R0(0);
            aw7Var.setValueOverride(lj4Var);
            aw7Var.setShowPreview(true);
            oebVar.c = lj4Var.get();
            E0(oebVar, null, false);
            z4 = z2;
        }
        U0();
        return z4;
    }

    public final void E0(oeb oebVar, Integer num, boolean z) {
        oeb oebVar2 = this.q1;
        if (oebVar2 != oebVar) {
            oebVar2.a = oebVar.a;
            oebVar2.b = oebVar.b;
            oebVar2.c = oebVar.c;
            int i = this.v1;
            m58.e(i).h(oebVar.a, true);
            m58.e(i).j(oebVar.c);
        }
        int i2 = oebVar.a;
        sv7 sv7Var = this.E0;
        sv7Var.setColor(i2);
        sv7Var.setBrushSize(oebVar.c);
        int i3 = oebVar2.a;
        if (num == null || num.intValue() == i3) {
            uv7 uv7Var = this.J0;
            if (uv7Var != null) {
                uv7Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new u34(this, num, i3, (byte) 2));
            duration.start();
        }
        w44 w44Var = this.z0;
        if (w44Var instanceof xjb) {
            if (this.Z1) {
                return;
            }
            ((xjb) w44Var).setSwatch(new oeb(oebVar.b, oebVar.c, oebVar.a));
            return;
        }
        if (z) {
            if (w44Var instanceof nd6) {
                ((nd6) w44Var).setColor(oebVar.a);
                ((nd6) this.z0).setType(3);
            } else if (w44Var instanceof kuc) {
                ((kuc) w44Var).setColor(oebVar.a);
                ((kuc) this.z0).setType(3);
            } else if (w44Var instanceof o66) {
                ((o66) w44Var).setColor(oebVar.a);
                ((o66) this.z0).setType(0);
            }
        }
    }

    public final void F0(oeb oebVar) {
        E0(oebVar, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, android.view.ViewGroup, tv7] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    public final void H0() {
        int i;
        pcc pccVar;
        float f;
        w44 w44Var;
        w44 w44Var2;
        dw3[] dw3VarArr;
        w44 w44Var3;
        ArrayList arrayList = this.G1;
        if (arrayList == null) {
            return;
        }
        g6b g6bVar = this.F1;
        this.F1 = null;
        this.G1 = null;
        int size = arrayList.size();
        boolean z = false;
        kd1 kd1Var = null;
        int i2 = 0;
        while (true) {
            ?? r15 = this.H0;
            if (i2 >= size) {
                r15.setVisibility(z ? 1 : 0);
                return;
            }
            pcc pccVar2 = (pcc) arrayList.get(i2);
            byte b = pccVar2.a;
            if (b == 11) {
                if (kd1Var != null) {
                    kd1Var.u(pccVar2.V, pccVar2.W, pccVar2.j, pccVar2.X);
                    i = i2;
                    i2 = i + 1;
                    z = false;
                } else {
                    kd1 e0 = e0();
                    e0.setType(pccVar2.b);
                    e0.setTypeface(pccVar2.n);
                    e0.setBaseFontSize(pccVar2.m);
                    G0(e0, pccVar2.p);
                    oeb swatch = e0.getSwatch();
                    swatch.a = pccVar2.l;
                    e0.setSwatch(swatch);
                    e0.u(pccVar2.V, pccVar2.W, pccVar2.j, pccVar2.X);
                    f = 1.0f;
                    i = i2;
                    kd1Var = e0;
                    w44Var3 = e0;
                    pccVar = pccVar2;
                    w44Var = w44Var3;
                }
            } else if (b == 0) {
                qv7 k0 = k0(pccVar2.C, pccVar2.B);
                if ((pccVar2.b & 2) != 0) {
                    k0.r(z);
                }
                ViewGroup.LayoutParams layoutParams = k0.getLayoutParams();
                layoutParams.width = pccVar2.q;
                layoutParams.height = pccVar2.r;
                f = 1.0f;
                i = i2;
                w44Var3 = k0;
                pccVar = pccVar2;
                w44Var = w44Var3;
            } else {
                if (b == 1) {
                    xjb l0 = l0(z);
                    l0.setType(pccVar2.b);
                    l0.setTypeface(pccVar2.n);
                    l0.setBaseFontSize(pccVar2.m);
                    SpannableString spannableString = new SpannableString(pccVar2.j);
                    ArrayList arrayList2 = pccVar2.k;
                    int size2 = arrayList2.size();
                    ?? r3 = arrayList2;
                    for (?? r6 = z; r6 < size2; r6++) {
                        occ occVar = (occ) r3.get(r6);
                        Object obj = r3;
                        gn gnVar = new gn(occVar.document_id, 1.0f, l0.getFontMetricsInt());
                        int i3 = occVar.offset;
                        spannableString.setSpan(gnVar, i3, occVar.length + i3, 33);
                        i2 = i2;
                        r3 = obj;
                    }
                    i = i2;
                    CharSequence m = gw3.m(spannableString, l0.getFontMetricsInt(), false, null, 0);
                    if ((m instanceof Spanned) && (dw3VarArr = (dw3[]) ((Spanned) m).getSpans(0, m.length(), dw3.class)) != null) {
                        for (dw3 dw3Var : dw3VarArr) {
                            dw3Var.b = 0.85f;
                        }
                    }
                    l0.setText(m);
                    G0(l0, pccVar2.p);
                    oeb swatch2 = l0.getSwatch();
                    swatch2.a = pccVar2.l;
                    l0.setSwatch(swatch2);
                    w44Var2 = l0;
                } else {
                    i = i2;
                    if (b == 2) {
                        g88 h0 = h0(pccVar2.j, false);
                        h0.I0 = pccVar2.u;
                        h0.D0 = false;
                        if ((pccVar2.b & 2) != 0) {
                            h0.r(false);
                        }
                        if ((pccVar2.b & 16) != 0) {
                            h0.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = h0.getLayoutParams();
                        layoutParams2.width = pccVar2.q;
                        layoutParams2.height = pccVar2.r;
                        w44Var2 = h0;
                    } else if (b == 6) {
                        ArrayList arrayList3 = g6bVar.v;
                        boolean z2 = g6bVar.K;
                        this.f2 = true;
                        f = 1.0f;
                        pccVar = pccVar2;
                        w44 pv7Var = new pv7(this, getContext(), b0(), arrayList3, this.U1, z2, this.V1);
                        pv7Var.setDelegate(this);
                        r15.addView(pv7Var);
                        c0();
                        if (pccVar.q > 0 && pccVar.r > 0) {
                            ViewGroup.LayoutParams layoutParams3 = pv7Var.getLayoutParams();
                            layoutParams3.width = pccVar.q;
                            layoutParams3.height = pccVar.r;
                        }
                        w44Var = pv7Var;
                    } else {
                        pccVar = pccVar2;
                        f = 1.0f;
                        if (b == 3) {
                            nd6 g0 = g0(pccVar.O, pccVar.N);
                            int i4 = pccVar.l;
                            if (i4 != 0) {
                                g0.setColor(i4);
                            }
                            g0.setType(pccVar.b);
                            w44Var = g0;
                        } else {
                            if (b == 8) {
                                iuc iucVar = pccVar.P;
                                if (iucVar != null) {
                                    kuc m0 = m0(iucVar);
                                    int i5 = pccVar.l;
                                    if (i5 != 0) {
                                        m0.setColor(i5);
                                    }
                                    m0.setType(pccVar.b);
                                    w44Var = m0;
                                }
                            } else if (b == 7) {
                                o66 f0 = f0(pccVar.a0);
                                d66 d66Var = f0.s0;
                                int i6 = pccVar.l;
                                if (i6 != 0) {
                                    f0.setColor(i6);
                                }
                                boolean e = d66Var.e();
                                int i7 = d66Var.h;
                                int i8 = d66Var.f;
                                if (e) {
                                    d66Var.setPreviewType(pccVar.b);
                                }
                                byte b2 = pccVar.b;
                                if (b2 == -1) {
                                    f0.setType(3);
                                    d66Var.d();
                                    pccVar.q = ((int) Math.ceil(d66Var.b0)) + i8 + i8;
                                    pccVar.r = ((int) Math.ceil(d66Var.c0)) + i7 + i7;
                                    PointF position = f0.getPosition();
                                    position.y = (this.I1 * 0.3f) + position.y;
                                    f0.setPosition(position);
                                } else {
                                    f0.setType(b2);
                                    w44Var = f0;
                                }
                            } else if (b == 4) {
                                g29 i0 = i0(false);
                                i0.s(k39.d(pccVar.N.reaction), false);
                                if (pccVar.N.flipped) {
                                    i0.r(false);
                                }
                                w44Var = i0;
                                if (pccVar.N.dark) {
                                    i0.q(false);
                                    w44Var = i0;
                                }
                            } else if (b == 5 && g6bVar.o0 != null) {
                                ao9 j0 = j0(g6bVar.p0, false);
                                v9b v9bVar = ((z8b) this).u2;
                                k9b k9bVar = v9bVar.Y0;
                                if (k9bVar != null) {
                                    k9bVar.x = j0;
                                    ndc ndcVar = k9bVar.y;
                                    if (ndcVar != null) {
                                        ndcVar.z0(j0.w0);
                                    }
                                }
                                l9b l9bVar = v9bVar.d1;
                                if (l9bVar != null) {
                                    l9bVar.setHasRoundVideo(true);
                                }
                                w44Var = j0;
                                if ((pccVar.b & 2) != 0) {
                                    boolean z3 = !j0.t0;
                                    j0.t0 = z3;
                                    j0.u0.f(z3, true);
                                    j0.invalidate();
                                    w44Var = j0;
                                }
                            }
                            i2 = i + 1;
                            z = false;
                        }
                    }
                }
                pccVar = pccVar2;
                f = 1.0f;
                w44Var = w44Var2;
            }
            w44Var.setX((pccVar.c * this.H1) - (((f - pccVar.v) * pccVar.q) / 2.0f));
            w44Var.setY((pccVar.d * this.I1) - (((f - pccVar.v) * pccVar.r) / 2.0f));
            w44Var.setPosition(new PointF((pccVar.q / 2.0f) + w44Var.getX(), (pccVar.r / 2.0f) + w44Var.getY()));
            w44Var.setScale(pccVar.v);
            w44Var.setRotation((float) (((-pccVar.e) / 3.141592653589793d) * 180.0d));
            i2 = i + 1;
            z = false;
        }
    }

    public final void I0(final boolean z) {
        if (this.r1 != z) {
            this.r1 = z;
            zna znaVar = this.s1;
            if (znaVar != null) {
                znaVar.d();
            }
            zna znaVar2 = new zna(new xk4(z ? 0.0f : 1000.0f));
            this.s1 = znaVar2;
            aoa aoaVar = new aoa();
            aoaVar.i = z ? 1000.0f : 0.0f;
            aoaVar.b(1250.0f);
            aoaVar.a(1.0f);
            znaVar2.m = aoaVar;
            byte b = 0;
            final boolean[] zArr = {this.E1.c() || this.n2 > 0};
            final float translationY = this.J0.getTranslationY();
            final float alpha = this.r0.getAlpha();
            final ViewGroup barView = getBarView();
            this.s1.b(new it3() { // from class: wu7
                @Override // it3
                public final void a(zna znaVar3, float f, float f2) {
                    float f3;
                    xv7 xv7Var = xv7.this;
                    uv7 uv7Var = xv7Var.J0;
                    float f4 = f / 1000.0f;
                    xv7Var.t1 = f4;
                    float f5 = ((1.0f - f4) * 0.4f) + 0.6f;
                    ViewGroup viewGroup = barView;
                    viewGroup.setScaleX(f5);
                    viewGroup.setScaleY(f5);
                    viewGroup.setTranslationY((Math.min(xv7Var.t1, 0.25f) * gm.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(xv7Var.t1, 0.25f) / 0.25f));
                    jv7 jv7Var = xv7Var.m1;
                    float f6 = xv7Var.t1;
                    boolean z2 = z;
                    jv7Var.B1(z2, f6);
                    du7 du7Var = xv7Var.r0;
                    du7Var.setProgress(xv7Var.t1);
                    yt7 yt7Var = xv7Var.q0;
                    yt7Var.setProgress(xv7Var.t1);
                    xv7Var.M0.setTranslationY(gm.L(32.0f) * xv7Var.t1);
                    AnimatorSet animatorSet = xv7Var.D1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f7 = xv7Var.t1;
                        if (z2) {
                            f3 = 1.0f;
                        } else {
                            f7 = 1.0f - f7;
                            f3 = 0.0f;
                        }
                        float f8 = alpha;
                        du7Var.setAlpha(gm.R1(f8, f3, f7));
                        yt7Var.setAlpha(gm.R1(f8, z2 ? 1.0f : 0.0f, f7));
                        uv7Var.setTranslationY(translationY - ((gm.L(39.0f) * f7) * (z2 ? 1 : -1)));
                    }
                    uv7Var.invalidate();
                    if (viewGroup == xv7Var.b1) {
                        xv7Var.K0.invalidate();
                    }
                }
            });
            this.s1.a(new xu7(this, z, b));
            this.s1.h();
            if (z) {
                jv7 jv7Var = this.m1;
                jv7Var.setVisibility(0);
                jv7Var.setSelectedColorIndex(m58.e(this.v1).d());
            }
        }
    }

    public final void J0(int i) {
        iu7 iu7Var = this.b1;
        kv7 kv7Var = this.E1;
        byte b = 1;
        if (i == 1) {
            e34 e34Var = this.j2;
            boolean z = e34Var != null && e34Var.getVisibility() == 0;
            e34 e34Var2 = this.j2;
            u9b u9bVar = this.C1;
            if (e34Var2 != null && e34Var2.d1 != z8c.t0) {
                u9bVar.removeView(e34Var2);
                e34Var2 = null;
                this.j2 = null;
            }
            if (e34Var2 == null) {
                e34 e34Var3 = new e34(null, true, false, false, getContext(), false, null, null, true, this.w1, false, false);
                this.j2 = e34Var3;
                e34Var3.x2 = false;
                e34Var3.V0 = true;
                e34Var3.setVisibility(8);
                if (gm.O1()) {
                    this.j2.setForseMultiwindowLayout(true);
                }
                this.j2.setDelegate(new rv7(this));
                u9bVar.addView(this.j2);
            }
            this.j2.setVisibility(0);
            this.k2 = true;
            e34 e34Var4 = this.j2;
            if (this.p2 <= 0) {
                if (gm.O1()) {
                    this.p2 = gm.L(150.0f);
                } else {
                    this.p2 = oc7.c1().getInt("kbd_height", gm.L(200.0f));
                }
            }
            int i2 = this.q2;
            if (i2 <= 0) {
                if (gm.O1()) {
                    i2 = gm.L(150.0f);
                    this.q2 = i2;
                } else {
                    i2 = oc7.c1().getInt("kbd_height_land3", gm.L(200.0f));
                    this.q2 = i2;
                }
            }
            Point point = gm.q;
            if (point.x <= point.y) {
                i2 = this.p2;
            }
            int paddingUnderContainer = u9bVar.getPaddingUnderContainer() + i2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e34Var4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            e34Var4.setLayoutParams(layoutParams);
            if (!gm.E && !gm.O1()) {
                w44 w44Var = this.z0;
                if (w44Var instanceof xjb) {
                    gm.t1(((xjb) w44Var).getEditText());
                }
            }
            this.n2 = paddingUnderContainer;
            kv7Var.a();
            requestLayout();
            d02 emojiButton = iu7Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(b02.d, true);
            }
            if (!z) {
                if (this.l2) {
                    this.o2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n2, 0.0f);
                    ofFloat.addUpdateListener(new zu7(this, b));
                    ofFloat.addListener(new mv7(this, b));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(gb.w);
                    ofFloat.start();
                }
            }
        } else {
            d02 emojiButton2 = iu7Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(b02.e, true);
            }
            e34 e34Var5 = this.j2;
            if (e34Var5 != null) {
                this.k2 = false;
                if (gm.D || gm.E) {
                    e34Var5.setVisibility(8);
                }
            }
            if (i == 0) {
                this.n2 = 0;
                kv7Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(o66 o66Var) {
        u6b u6bVar = new u6b(getContext(), this.w1, this.W1, new u35(this, o66Var, (byte) 17));
        if (o66Var != null) {
            c66 c66Var = o66Var.w0;
            u6bVar.X1 = true;
            su3 su3Var = u6bVar.U1;
            su3 su3Var2 = u6bVar.T1;
            if (c66Var != null) {
                u6bVar.b2 = c66Var.d;
                u6bVar.c2 = false;
                su3Var2.setText(c66Var.c);
                su3Var.setText(c66Var.b);
                u6bVar.h2 = !TextUtils.isEmpty(c66Var.b);
                u6bVar.i2 = c66Var.f;
                u6bVar.j2 = c66Var.e;
            } else {
                su3Var2.setText("");
                su3Var.setText("");
                u6bVar.i2 = true;
                u6bVar.j2 = false;
            }
            String M0 = jb6.M0(2131744327, null);
            b61 b61Var = u6bVar.W1;
            b61Var.i(M0, false, true);
            x74 x74Var = u6bVar.S1;
            if (x74Var != null) {
                x74Var.O(false);
            }
            b61Var.setEnabled(u6bVar.a1(su3Var2.getText().toString()));
            u6bVar.X1 = false;
        }
        u6bVar.setOnDismissListener(new hv7(this, (byte) 1));
        u6bVar.show();
        y0(true);
    }

    @Override // dla
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        if (i > gm.L(50.0f) && this.l2 && !gm.E && !gm.O1()) {
            if (z) {
                this.q2 = i;
                oc7.c1().edit().putInt("kbd_height_land3", this.q2).commit();
            } else {
                this.p2 = i;
                oc7.c1().edit().putInt("kbd_height", this.p2).commit();
            }
        }
        boolean z4 = this.k2;
        kv7 kv7Var = this.E1;
        if (z4) {
            int paddingUnderContainer = this.C1.getPaddingUnderContainer() + (z ? this.q2 : this.p2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j2.getLayoutParams();
            int i2 = layoutParams.width;
            int i3 = gm.q.x;
            if (i2 != i3 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i3;
                layoutParams.height = paddingUnderContainer;
                this.j2.setLayoutParams(layoutParams);
                this.n2 = layoutParams.height;
                kv7Var.a();
                requestLayout();
            }
        }
        if (this.r2 == i && this.s2 == z) {
            return;
        }
        this.r2 = i;
        this.s2 = z;
        boolean z5 = this.l2;
        w44 w44Var = this.z0;
        if (w44Var instanceof xjb) {
            z2 = ((xjb) w44Var).getEditText().isFocused() && kv7Var.c();
            this.l2 = z2;
        } else {
            this.l2 = false;
            z2 = false;
        }
        if (z2 && this.k2) {
            J0(0);
        }
        if (this.n2 != 0 && !(z3 = this.l2) && z3 != z5 && !this.k2) {
            this.n2 = 0;
            kv7Var.a();
            requestLayout();
        }
        U0();
        if (z5 && !this.l2 && this.n2 > 0 && this.o2) {
            this.o2 = false;
        }
        S0();
    }

    public final void L0(nd6 nd6Var, jac jacVar) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        i22 i22Var = new i22(getContext(), new ov7(this, jacVar), false, true, false, this.w1);
        i22Var.W3 = new dhf((byte) 22);
        h12 h12Var = i22Var.u3;
        if (nd6Var != null && (messageMedia = nd6Var.w0) != null && (geoPoint = messageMedia.geo) != null) {
            i22Var.x4 = new double[]{geoPoint.lat, geoPoint._long};
            i22Var.I1 = true;
            h12Var.setVisibility(8);
        } else if (this.K1) {
            i22Var.v4 = this.M1;
            i22Var.w4 = this.L1;
            i22Var.I1 = true;
            h12Var.setVisibility(8);
        } else {
            i22Var.I1 = true;
            h12Var.setVisibility(8);
        }
        i22Var.setOnDismissListener(new hv7(this, (byte) 0));
        i22Var.Z0();
        i22Var.show();
    }

    public final void M0(w44 w44Var) {
        byte b = 1;
        if (w44Var instanceof u37) {
            m8 m8Var = this.x1;
            if (m8Var == null || !m8Var.isShowing()) {
                return;
            }
            this.x1.d(true);
            return;
        }
        int[] iArr = this.i2;
        w44Var.getLocationInWindow(iArr);
        float scaleX = w44Var.getScaleX() * w44Var.getWidth();
        tv7 tv7Var = this.H0;
        float scaleX2 = tv7Var.getScaleX() * scaleX;
        float scaleY = tv7Var.getScaleY() * w44Var.getScaleY() * w44Var.getHeight();
        int i = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i;
        int i2 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i2;
        N0(new cv7(this, w44Var, b), this, 51, i, i2 - gm.L(32.0f), true);
    }

    public final void N0(Runnable runnable, xv7 xv7Var, int i, int i2, int i3, boolean z) {
        m8 m8Var = this.x1;
        if (m8Var != null && m8Var.isShowing()) {
            this.x1.d(true);
            return;
        }
        if (this.y1 == null) {
            this.z1 = new Rect();
            wv7 wv7Var = new wv7(this, getContext());
            this.y1 = wv7Var;
            wv7Var.setAnimationEnabled(true);
            this.y1.setOnTouchListener(new a7(this, (byte) 12));
            this.y1.setDispatchKeyEventListener(new ev7(this));
            this.y1.setShownFromBottom(true);
        }
        wv7 wv7Var2 = this.y1;
        wv7Var2.a0 = z;
        wv7Var2.d();
        runnable.run();
        if (this.x1 == null) {
            m8 m8Var2 = new m8(this.y1, -2, -2);
            this.x1 = m8Var2;
            m8Var2.b = true;
            m8Var2.setAnimationStyle(R.style.PopupAnimation);
            this.x1.setOutsideTouchable(true);
            this.x1.setClippingEnabled(true);
            this.x1.setInputMethodMode(2);
            this.x1.setSoftInputMode(0);
            this.x1.getContentView().setFocusableInTouchMode(true);
            this.x1.setOnDismissListener(new x6(this, (byte) 6));
        }
        this.y1.measure(View.MeasureSpec.makeMeasureSpec(gm.L(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(10000.0f), TLObject.FLAG_31));
        this.x1.setFocusable(true);
        int measuredWidth = i2 - (this.y1.getMeasuredWidth() / 2);
        int measuredHeight = i3 - this.y1.getMeasuredHeight();
        this.x1.showAtLocation(xv7Var, i, measuredWidth, measuredHeight);
        m8.i(this.y1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        wv7 wv7Var3 = this.y1;
        if (z) {
            wv7Var3.setBackgroundDrawable(new vm0(new wm0(this.U1, wv7Var3, 5, false), measuredWidth, measuredHeight, mutate, gm.N(8.3f)));
        } else {
            wv7Var3.setBackgroundDrawable(mutate);
            this.y1.setBackgroundColor(-14145495);
        }
    }

    public final void O0(boolean z) {
        if (this.S1 != z) {
            if (z || this.P1 != null) {
                this.S1 = z;
                byte b = 0;
                if (!z) {
                    this.Q1 = null;
                    if (this.P1.getReactionsWindow() != null) {
                        this.P1.getReactionsWindow().e();
                    }
                    this.P1.animate().alpha(0.0f).setDuration(150L).setListener(new mv7(this, b)).start();
                    return;
                }
                this.P1.k();
                this.P1.setVisibility(0);
                this.P1.setSelectedReaction(this.Q1.getCurrentReaction());
                this.P1.getParent().bringChildToFront(this.P1);
                this.T1 = true;
                this.C1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R1, z ? 1.0f : 0.0f);
                this.P1.setTransitionProgress(this.R1);
                ofFloat.addUpdateListener(new zu7(this, (byte) 2));
                ofFloat.addListener(new jf4((byte) 17, this, z));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(d53.g);
                ofFloat.start();
            }
        }
    }

    public final void P0(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            zna znaVar = this.l1;
            if (znaVar != null) {
                znaVar.d();
            }
            zna znaVar2 = new zna(new xk4(z ? 0.0f : 1000.0f));
            this.l1 = znaVar2;
            aoa aoaVar = new aoa();
            aoaVar.i = z ? 1000.0f : 0.0f;
            aoaVar.b(1250.0f);
            aoaVar.a(1.0f);
            znaVar2.m = aoaVar;
            if (z) {
                tu7 tu7Var = this.c1;
                tu7Var.setAlpha(0.0f);
                tu7Var.setVisibility(0);
            }
            this.l1.b(new h20(this, (byte) 8));
            this.l1.a(new xu7(this, z, (byte) 1));
            this.l1.h();
        }
    }

    @Override // fla, ela
    public final int Q() {
        return this.E1.l - this.C1.getBottomPadding2();
    }

    public final PointF Q0(w44 w44Var) {
        float f;
        float f2;
        ao6 ao6Var = this.v0;
        float f3 = ao6Var != null ? 200.0f / ao6Var.c : 200.0f;
        float f4 = 0.2f;
        if (w44Var != null) {
            PointF position = w44Var.getPosition();
            float min = Math.min(w44Var.getHeight(), w44Var.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f5 = ao6Var != null ? 100.0f / ao6Var.c : 100.0f;
        PointF b0 = b0();
        int i = 0;
        while (i < 10) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                tv7 tv7Var = this.H0;
                if (i2 >= tv7Var.getChildCount()) {
                    break;
                }
                View childAt = tv7Var.getChildAt(i2);
                if (!(childAt instanceof w44) || (childAt instanceof u37)) {
                    f = f4;
                    f2 = f5;
                } else {
                    PointF position2 = ((w44) childAt).getPosition();
                    f = f4;
                    f2 = f5;
                    if (((float) Math.sqrt(Math.pow(position2.y - b0.y, 2.0d) + Math.pow(position2.x - b0.x, 2.0d))) < f2) {
                        f3 = Math.min(childAt.getHeight(), childAt.getWidth()) * f;
                        z = true;
                    }
                }
                i2++;
                f5 = f2;
                f4 = f;
            }
            float f6 = f4;
            float f7 = f5;
            if (!z) {
                break;
            }
            i++;
            b0 = new PointF(b0.x + f3, b0.y + f3);
            f4 = f6;
            f5 = f7;
        }
        return b0;
    }

    public final void R0(int i) {
        if (this.O0 == i || this.P0 == i) {
            return;
        }
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i2 = this.O0;
        ViewGroup viewGroup = this.b1;
        ViewGroup viewGroup2 = this.a1;
        ViewGroup viewGroup3 = i2 == 0 ? viewGroup2 : i2 == 2 ? viewGroup : null;
        this.P0 = i;
        ViewGroup viewGroup4 = i == 0 ? viewGroup2 : i == 2 ? viewGroup : null;
        int i3 = this.v1;
        m58 e = m58.e(i3);
        boolean z = i == 2;
        if (e.l != z) {
            e.l = z;
            if (z) {
                e.i(-1, false);
            } else {
                e.i(e.a.getInt("brush", 0), false);
            }
        }
        int c = m58.e(i3).c();
        oeb oebVar = this.q1;
        oebVar.a = c;
        this.Z1 = i != 2;
        E0(oebVar, null, false);
        this.Z1 = false;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.R0 = duration;
        duration.setInterpolator(d53.f);
        this.R0.addUpdateListener(new nl(this, viewGroup3, viewGroup4, (byte) 3));
        this.R0.addListener(new dr1(this, viewGroup3, viewGroup4, i, (byte) 4));
        this.R0.start();
    }

    public final void S0() {
        kv7 kv7Var = this.E1;
        iu7 iu7Var = this.b1;
        if (iu7Var != null) {
            if (kv7Var.c()) {
                iu7Var.a(R.drawable.input_smile);
            } else if (this.k2) {
                iu7Var.a(R.drawable.input_keyboard);
            } else {
                iu7Var.a(R.drawable.msg_add);
            }
        }
        boolean z = kv7Var.c() || this.k2;
        boolean z2 = !z;
        gm.O3(1.0f, this.e1, z2, false);
        gm.O3(1.0f, this.d1, z2, false);
        gm.O3(1.0f, this.g1, z, false);
        gm.O3(1.0f, this.f1, z, false);
    }

    public final void T0() {
        w44 w44Var;
        ObjectAnimator objectAnimator = this.Y1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.E0.getParent();
        if (view == null) {
            return;
        }
        kv7 kv7Var = this.E1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!kv7Var.c() || kv7Var.d) && this.n2 <= 0) || (w44Var = this.z0) == null) ? 0.0f : view.getScaleY() * (-(w44Var.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.Y1 = ofFloat;
        ofFloat.setDuration(350L);
        this.Y1.setInterpolator(d53.h);
        this.Y1.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        boolean z;
        if (this.z0 instanceof xjb) {
            kv7 kv7Var = this.E1;
            if ((kv7Var.c() || this.n2 > 0) && !kv7Var.d) {
                z = true;
                View view = this.N0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z ? 1.0f : 0.0f).withEndAction(new y8c((byte) 29, this, z)).start();
            }
        }
        z = false;
        View view2 = this.N0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z ? 1.0f : 0.0f).withEndAction(new y8c((byte) 29, this, z)).start();
    }

    @Override // ku7, gu7
    public final void a() {
        I0(true);
    }

    public final void a0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new bl7(this, view, (byte) 15)).start();
    }

    @Override // ela, vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F8));
        hashSet.add(Integer.valueOf(cmb.g5));
        hashSet.add(Integer.valueOf(cmb.i5));
        hashSet.add(Integer.valueOf(cmb.q5));
        hashSet.add(Integer.valueOf(cmb.yf));
        hashSet.add(Integer.valueOf(cmb.Bf));
        hashSet.add(Integer.valueOf(cmb.Ef));
        hashSet.add(Integer.valueOf(cmb.If));
        hashSet.add(Integer.valueOf(cmb.Df));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.Ci));
        hashSet.add(Integer.valueOf(cmb.vi));
        hashSet.add(Integer.valueOf(cmb.ui));
        hashSet.add(Integer.valueOf(cmb.wi));
        hashSet.add(Integer.valueOf(cmb.xi));
        hashSet.add(Integer.valueOf(cmb.Af));
        hashSet.add(Integer.valueOf(cmb.zf));
        hashSet.add(Integer.valueOf(cmb.Z6));
    }

    @Override // gu7
    public final void b() {
        setTextType((this.B0 + 1) % 4);
    }

    public final PointF b0() {
        tv7 tv7Var = this.H0;
        int measuredWidth = tv7Var.getMeasuredWidth();
        int measuredHeight = tv7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.H1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.I1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override // gu7
    public final void c(int i) {
        w44 w44Var = this.z0;
        if (w44Var instanceof xjb) {
            G0((xjb) w44Var, i);
            m58 e = m58.e(this.v1);
            e.g = i;
            e.a.edit().putInt("text_alignment", i).apply();
        }
    }

    public final void c0() {
        boolean z = this.M1;
        tv7 tv7Var = this.H0;
        boolean z2 = true;
        if (!z && !this.O1) {
            int i = 0;
            loop0: while (true) {
                if (i >= tv7Var.getChildCount()) {
                    z2 = false;
                    break;
                }
                View childAt = tv7Var.getChildAt(i);
                boolean z3 = childAt instanceof xjb;
                int i2 = this.v1;
                if (z3) {
                    CharSequence text = ((xjb) childAt).getText();
                    if (text instanceof Spanned) {
                        for (gn gnVar : (gn[]) ((Spanned) text).getSpans(0, text.length(), gn.class)) {
                            TLRPC.Document document = gnVar.document;
                            if (document == null) {
                                document = vm.e(i2, gnVar.getDocumentId());
                            }
                            if (document != null) {
                                vm.g(i2).e(document);
                            }
                            bc4.G(i2);
                            if (g6b.u(document, bc4.J(document, null, true, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i++;
                } else if (childAt instanceof z1b) {
                    TLRPC.Document sticker = ((z1b) childAt).getSticker();
                    bc4.G(i2);
                    if (g6b.u(sticker, bc4.J(sticker, null, true, true).getAbsolutePath())) {
                        break;
                    } else {
                        i++;
                    }
                } else if (childAt instanceof ao9) {
                    break;
                } else {
                    i++;
                }
            }
        }
        for (int i3 = 0; i3 < tv7Var.getChildCount(); i3++) {
            View childAt2 = tv7Var.getChildAt(i3);
            if (childAt2 instanceof w44) {
                ((w44) childAt2).setIsVideo(z2);
            }
        }
    }

    public final TextView d0(int i, String str) {
        TextView textView = new TextView(getContext());
        anb.X(textView, cmb.D8, this.w1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gm.o());
        textView.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i));
        textView.setText(str);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.g2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ao6 ao6Var;
        if ((view == this.E0 || view == this.F0 || view == this.H0 || view == this.G0) && (ao6Var = this.v0) != null) {
            canvas.save();
            r1 = this.D0 ? 0 : gm.m;
            int currentActionBarHeight = a.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i = ao6Var.k;
            if (i == 90 || i == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * ao6Var.e)) / ao6Var.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * ao6Var.f)) / ao6Var.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - gm.L(48.0f))) - scaleY) / 2.0f) + gm.L(8.0f) + r1 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final kd1 e0() {
        xka paintingSize = getPaintingSize();
        PointF b0 = b0();
        b0.y *= 1.5f;
        kd1 kd1Var = new kd1(getContext(), b0, (int) ((paintingSize.a / 9.0f) * 0.5f), new oeb(1.0f, this.q1.c, -1));
        float f = paintingSize.a / 9.0f;
        dv7 dv7Var = new dv7(this, (byte) 2);
        kd1Var.y0 = (int) (0.5f * f);
        kd1Var.z0 = (int) (f * 2.0f);
        kd1Var.A0 = dv7Var;
        final byte b = 1;
        kd1Var.B0 = true;
        kd1Var.setStickyX(2);
        kd1Var.setDelegate(this);
        kd1Var.setMaxWidth(this.H1 - gm.L(32.0f));
        kd1Var.setTypeface(m58.e(this.v1).j);
        kd1Var.setType(3);
        gd1 gd1Var = this.a2;
        if (gd1Var != null) {
            gd1Var.b(kd1Var);
        } else {
            final k44 k44Var = this.c2;
            Objects.requireNonNull(k44Var);
            kd1Var.setPositionProvider(new cj6(k44Var, (byte) 24));
            final byte b2 = 0;
            kd1Var.setOnEditing(new qac() { // from class: gv7
                @Override // qac
                public final void a(Object obj) {
                    switch (b2) {
                        case 0:
                            k44Var.o(((Boolean) obj).booleanValue());
                            break;
                        default:
                            k44Var.R(((Long) obj).longValue());
                            break;
                    }
                }
            });
            kd1Var.setOnSeek(new qac() { // from class: gv7
                @Override // qac
                public final void a(Object obj) {
                    switch (b) {
                        case 0:
                            k44Var.o(((Boolean) obj).booleanValue());
                            break;
                        default:
                            k44Var.R(((Long) obj).longValue());
                            break;
                    }
                }
            });
        }
        this.H0.addView(kd1Var, qoe.c(-2.0f, -2));
        G0(kd1Var, 1);
        c0();
        ao6 ao6Var = this.v0;
        if (ao6Var != null) {
            kd1Var.j(1.0f / ao6Var.c);
            kd1Var.f(-(ao6Var.k + ao6Var.d));
        }
        return kd1Var;
    }

    public final o66 f0(c66 c66Var) {
        int i;
        this.f2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        tv7 tv7Var = this.H0;
        float measuredWidth = tv7Var.getMeasuredWidth() <= 0 ? this.H1 : tv7Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - gm.L(58.0f);
        o66 o66Var = new o66(getContext(), Q0, this.v1, c66Var, measuredWidth / 360.0f, L);
        if (Q0.x == tv7Var.getMeasuredWidth() / 2.0f) {
            o66Var.setStickyX(2);
        }
        if (Q0.y == tv7Var.getMeasuredHeight() / 2.0f) {
            o66Var.setStickyY(2);
        }
        oeb oebVar = this.q1;
        if (oebVar != null && (i = oebVar.a) != -47814) {
            o66Var.setColor(i);
        }
        o66Var.setDelegate(this);
        o66Var.setMaxWidth(L);
        tv7Var.addView(o66Var, qoe.c(-2.0f, -2));
        c0();
        ao6 ao6Var = this.v0;
        if (ao6Var != null) {
            o66Var.j(1.0f / ao6Var.c);
            o66Var.f(-(ao6Var.k + ao6Var.d));
        }
        return o66Var;
    }

    public final nd6 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i;
        this.f2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        tv7 tv7Var = this.H0;
        float measuredWidth = tv7Var.getMeasuredWidth() <= 0 ? this.H1 : tv7Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - gm.L(58.0f);
        nd6 nd6Var = new nd6(getContext(), Q0, this.v1, messageMedia, mediaArea, measuredWidth / 240.0f, L);
        if (Q0.x == tv7Var.getMeasuredWidth() / 2.0f) {
            nd6Var.setStickyX(2);
        }
        if (Q0.y == tv7Var.getMeasuredHeight() / 2.0f) {
            nd6Var.setStickyY(2);
        }
        oeb oebVar = this.q1;
        if (oebVar != null && (i = oebVar.a) != -47814) {
            nd6Var.setColor(i);
        }
        nd6Var.setDelegate(this);
        nd6Var.setMaxWidth(L);
        tv7Var.addView(nd6Var, qoe.c(-2.0f, -2));
        c0();
        ao6 ao6Var = this.v0;
        if (ao6Var != null) {
            nd6Var.j(1.0f / ao6Var.c);
            nd6Var.f(-(ao6Var.k + ao6Var.d));
        }
        return nd6Var;
    }

    public int getAdditionalBottom() {
        return gm.L(24.0f);
    }

    public int getAdditionalTop() {
        return gm.L(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.E0.c(true, false);
    }

    public View getBottomLayout() {
        return this.J0;
    }

    public View getCancelView() {
        return this.q0;
    }

    public float getCropRotation() {
        ao6 ao6Var = this.v0;
        if (ao6Var != null) {
            return ao6Var.d + ao6Var.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.r0;
    }

    public View getEntitiesView() {
        return this.H0;
    }

    public long getLcm() {
        return this.W0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        gn[] gnVarArr;
        tv7 tv7Var = this.H0;
        int childCount = tv7Var.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = tv7Var.getChildAt(i);
            if (childAt instanceof z1b) {
                TLRPC.Document sticker = ((z1b) childAt).getSticker();
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
            } else if (childAt instanceof xjb) {
                CharSequence text = ((xjb) childAt).getText();
                if ((text instanceof Spanned) && (gnVarArr = (gn[]) ((Spanned) text).getSpans(0, text.length(), gn.class)) != null) {
                    for (gn gnVar : gnVarArr) {
                        if (gnVar != null) {
                            TLRPC.Document document = gnVar.document;
                            if (document == null) {
                                document = vm.e(this.v1, gnVar.getDocumentId());
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
        return Arrays.asList(this.E0, this.F0, this.H0, this.G0);
    }

    public View getRenderInputView() {
        return this.F0;
    }

    public e99 getRenderView() {
        return this.E0;
    }

    public w44 getSelectedEntity() {
        return this.z0;
    }

    public View getSelectionEntitiesView() {
        return this.G0;
    }

    public View getTextDimView() {
        return this.N0;
    }

    public View getTopLayout() {
        return this.I0;
    }

    public View getWeightChooserView() {
        return this.T0;
    }

    @Override // r9b
    public final boolean h(MotionEvent motionEvent) {
        if (this.g2) {
            return false;
        }
        if (this.z0 != null) {
            D0(null, true);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x, y);
        this.E0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final g88 h0(String str, boolean z) {
        float f;
        xka xkaVar;
        this.f2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            fc4.g(e, true);
            f = 1.0f;
        }
        tv7 tv7Var = this.H0;
        if (f > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.H1, tv7Var.getMeasuredWidth()) * 0.5d);
            xkaVar = new xka(floor, floor / f);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.I1, tv7Var.getMeasuredHeight()) * 0.5d);
            xkaVar = new xka(f * floor2, floor2);
        }
        xka xkaVar2 = xkaVar;
        Pair N0 = gm.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f2 = xkaVar2.a;
            xkaVar2.a = xkaVar2.b;
            xkaVar2.b = f2;
        }
        Context context = getContext();
        PointF b0 = b0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        g88 g88Var = new g88(context, b0, xkaVar2, str, intValue);
        g88Var.setDelegate(this);
        tv7Var.addView(g88Var);
        c0();
        return g88Var;
    }

    @Override // u44
    public final boolean i(w44 w44Var) {
        return D0(w44Var, true);
    }

    public final g29 i0(boolean z) {
        String str;
        xka xkaVar = new xka(gm.L(106.0f), gm.L(106.0f));
        PointF b0 = b0();
        tv7 tv7Var = this.H0;
        if (tv7Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i = 0; i < tv7Var.getChildCount(); i++) {
                    View childAt = tv7Var.getChildAt(i);
                    if (oqe.a(b0.x, b0.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < gm.L(6.0f)) {
                        break;
                    }
                }
                b0.x = (tv7Var.getMeasuredWidth() * 0.05f) + b0.x;
                b0.y = (tv7Var.getMeasuredHeight() * 0.05f) + b0.y;
                b0.x = Utilities.i(b0.x, tv7Var.getMeasuredWidth(), 0.0f);
                b0.y = Utilities.i(b0.y, tv7Var.getMeasuredHeight(), 0.0f);
            }
        }
        g29 g29Var = new g29(getContext(), b0);
        g29Var.t0 = new d8b(g29Var);
        g29Var.u0 = new d8b(g29Var);
        g29Var.v0 = new d29(g29Var);
        g29Var.w0 = new d29(g29Var);
        ln lnVar = new ln(g29Var);
        g29Var.y0 = lnVar;
        ln lnVar2 = new ln(g29Var);
        g29Var.z0 = lnVar2;
        g29Var.B0 = 1.0f;
        g29Var.s0 = xkaVar;
        lnVar2.e(true, 1.0f);
        lnVar.e(true, 1.0f);
        ArrayList arrayList = hs6.d0(z8c.t0).h;
        d29 d29Var = g29Var.v0;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                str = ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
                break;
            }
            if (((TLRPC.TL_availableReaction) arrayList.get(i2)).title.equals("Red Heart")) {
                str = ((TLRPC.TL_availableReaction) arrayList.get(i2)).reaction;
                break;
            }
            i2++;
        }
        k39 b = k39.b(str);
        g29Var.x0 = b;
        d29Var.e(b);
        g29Var.k();
        g29Var.setDelegate(this);
        tv7Var.addView(g29Var);
        c0();
        if (z) {
            A0(g29Var);
            C0(g29Var);
        }
        return g29Var;
    }

    public final ao9 j0(String str, boolean z) {
        this.f2 = true;
        this.h2 = true;
        n0();
        tv7 tv7Var = this.H0;
        int measuredWidth = tv7Var.getMeasuredWidth();
        tv7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.H1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        xka xkaVar = new xka(floor, floor);
        ao9 ao9Var = new ao9(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - gm.L(16.0f), (xkaVar.b / 2.0f) + gm.L(72.0f)), xkaVar, str);
        ao9Var.setDelegate(this);
        tv7Var.addView(ao9Var);
        c0();
        byte b = 0;
        if (z) {
            A0(ao9Var);
            post(new uu7(this, ao9Var, b));
        }
        this.h2 = false;
        return ao9Var;
    }

    public final qv7 k0(Object obj, TLRPC.Document document) {
        float f;
        for (int i = 0; i < document.attributes.size() && !(document.attributes.get(i) instanceof TLRPC.TL_documentAttributeSticker); i++) {
        }
        float f2 = 0.75f;
        ao6 ao6Var = this.v0;
        if (ao6Var != null) {
            f = -(ao6Var.k + ao6Var.d);
            f2 = 0.75f / ao6Var.c;
        } else {
            f = 0.0f;
        }
        qy5 qy5Var = new qy5(b0(), f2, f);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        qv7 qv7Var = new qv7(context, qy5Var.a, qy5Var.c, qy5Var.b, new xka(floor, floor), document, obj);
        boolean B4 = k47.B4(document);
        ImageReceiver imageReceiver = qv7Var.z0;
        if (B4) {
            imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.m0(12);
        qv7Var.setDelegate(this);
        this.H0.addView(qv7Var);
        c0();
        return qv7Var;
    }

    public final xjb l0(boolean z) {
        xka paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        xjb xjbVar = new xjb(getContext(), Q0, (int) (paintingSize.a / 9.0f), "", this.q1, this.B0);
        float f = paintingSize.a / 9.0f;
        dv7 dv7Var = new dv7(this, (byte) 0);
        xjbVar.y0 = (int) (0.5f * f);
        xjbVar.z0 = (int) (f * 2.0f);
        xjbVar.A0 = dv7Var;
        float f2 = Q0.x;
        tv7 tv7Var = this.H0;
        if (f2 == tv7Var.getMeasuredWidth() / 2.0f) {
            xjbVar.setStickyX(2);
        }
        if (Q0.y == tv7Var.getMeasuredHeight() / 2.0f) {
            xjbVar.setStickyY(2);
        }
        xjbVar.setDelegate(this);
        xjbVar.setMaxWidth(this.H1 - gm.L(32.0f));
        int i = this.v1;
        xjbVar.setTypeface(m58.e(i).j);
        xjbVar.setType(m58.e(i).h);
        tv7Var.addView(xjbVar, qoe.c(-2.0f, -2));
        c0();
        ao6 ao6Var = this.v0;
        if (ao6Var != null) {
            xjbVar.j(1.0f / ao6Var.c);
            xjbVar.f(-(ao6Var.k + ao6Var.d));
        }
        if (z) {
            A0(xjbVar);
            xjbVar.q();
            D0(xjbVar, false);
            xjbVar.getFocusedView().requestFocus();
            gm.E3(xjbVar.getFocusedView());
            this.A0 = true;
            int i2 = m58.e(i).g;
            iu7 iu7Var = this.b1;
            iu7Var.d(i2, true);
            iu7Var.setOutlineType(m58.e(i).h);
        }
        return xjbVar;
    }

    public final kuc m0(iuc iucVar) {
        int i;
        this.f2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        tv7 tv7Var = this.H0;
        float measuredWidth = tv7Var.getMeasuredWidth() <= 0 ? this.H1 : tv7Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - gm.L(58.0f);
        kuc kucVar = new kuc(getContext(), Q0, this.v1, iucVar, measuredWidth / 240.0f, L);
        if (Q0.x == tv7Var.getMeasuredWidth() / 2.0f) {
            kucVar.setStickyX(2);
        }
        if (Q0.y == tv7Var.getMeasuredHeight() / 2.0f) {
            kucVar.setStickyY(2);
        }
        oeb oebVar = this.q1;
        if (oebVar != null && (i = oebVar.a) != -47814) {
            kucVar.setColor(i);
        }
        kucVar.setDelegate(this);
        kucVar.setMaxWidth(L);
        tv7Var.addView(kucVar, qoe.c(-2.0f, -2));
        c0();
        ao6 ao6Var = this.v0;
        if (ao6Var != null) {
            kucVar.j(1.0f / ao6Var.c);
            kucVar.f(-(ao6Var.k + ao6Var.d));
        }
        return kucVar;
    }

    public final void n0() {
        int i = 0;
        while (true) {
            tv7 tv7Var = this.H0;
            if (i >= tv7Var.getChildCount()) {
                return;
            }
            View childAt = tv7Var.getChildAt(i);
            if (childAt instanceof ao9) {
                byte b = 1;
                if (this.z0 == childAt) {
                    D0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(d53.h).withEndAction(new uu7(this, (ao9) childAt, b)).start();
            }
            i++;
        }
    }

    @Override // u44
    public final boolean o() {
        return !(this.z0 instanceof u37);
    }

    public abstract void o0();

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        gd1 gd1Var = this.a2;
        if (gd1Var != null) {
            gd1Var.f(null);
            jd4 jd4Var = gd1Var.c;
            if (jd4Var != null) {
                jd4Var.f = null;
                u31 u31Var = (u31) jd4Var.g;
                if (u31Var != null) {
                    u31Var.b();
                    jd4Var.g = null;
                }
                gd1Var.c = null;
            }
            gd1Var.a.o(false);
        }
        this.c2.o(false);
        v29 v29Var = this.P1;
        if (v29Var != null) {
            gm.B2(v29Var);
            this.P1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ad1 ad1Var;
        this.w0 = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int i3 = gm.q.y;
        a.getCurrentActionBarHeight();
        getAdditionalTop();
        getAdditionalBottom();
        Bitmap bitmap = this.s0;
        if (bitmap != null) {
            bitmap.getWidth();
            bitmap.getHeight();
        } else {
            a.getCurrentActionBarHeight();
        }
        float f = this.x0.a;
        w44 w44Var = this.z0;
        if (w44Var != null) {
            w44Var.m();
        }
        measureChild(this.J0, i, i2);
        measureChild(this.T0, i, i2);
        measureChild(this.L0, i, i2);
        gd1 gd1Var = this.a2;
        if (gd1Var != null && (ad1Var = gd1Var.e) != null) {
            ad1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        measureChild(this.K0, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.n2 - this.C1.getPaddingUnderContainer(), Q()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.I0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), gm.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i, i2);
        this.w0 = false;
        if (gm.L(20.0f) >= 0 && !this.k2 && !this.m2) {
            this.w0 = true;
            t0();
            this.w0 = false;
        }
        if (gm.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override // u44
    public final boolean p() {
        return !this.A0;
    }

    public final u37 p0() {
        int i = 0;
        while (true) {
            tv7 tv7Var = this.H0;
            if (i >= tv7Var.getChildCount()) {
                return null;
            }
            View childAt = tv7Var.getChildAt(i);
            if (childAt instanceof u37) {
                return (u37) childAt;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap q0(ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, g6b g6bVar) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i;
        int i2;
        int i3;
        tv7 tv7Var;
        int i4;
        int i5;
        byte b;
        View view;
        boolean z5;
        boolean z6;
        ImageReceiver imageReceiver;
        Canvas canvas;
        View view2;
        u37 u37Var;
        jp0 jp0Var;
        boolean z7;
        ImageReceiver imageReceiver2;
        View view3;
        boolean z8;
        TLRPC.Message message;
        cm1 cm1Var;
        ysa ysaVar;
        ImageReceiver imageReceiver3;
        ImageReceiver imageReceiver4;
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        float scaleX;
        boolean z9;
        boolean z10;
        float radius;
        double d;
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        Spanned spanned;
        boolean z11;
        xv7 xv7Var = this;
        sv7 sv7Var = xv7Var.E0;
        int i6 = 0;
        tv7 tv7Var2 = xv7Var.H0;
        byte b2 = 1;
        if (z) {
            createBitmap = sv7Var.c(false, z4);
        } else if (z3) {
            createBitmap = Bitmap.createBitmap(Math.max(1, tv7Var2.getMeasuredWidth()), Math.max(1, tv7Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z2) {
                bitmap = null;
                xv7Var.W0 = BigInteger.ONE;
                i2 = 0;
                for (i = 0; i < tv7Var2.getChildCount(); i++) {
                    if (tv7Var2.getChildAt(i) instanceof w44) {
                        i2++;
                    }
                }
                if (i2 > 0) {
                    int childCount = tv7Var2.getChildCount();
                    int i7 = 0;
                    while (i7 < childCount) {
                        View childAt = tv7Var2.getChildAt(i7);
                        if (childAt instanceof w44) {
                            w44 w44Var = (w44) childAt;
                            w44Var.getPosition();
                            pcc pccVar = new pcc();
                            if (!(w44Var instanceof kd1)) {
                                if (arrayList != null) {
                                    boolean z12 = w44Var instanceof xjb;
                                    int i8 = xv7Var.v1;
                                    if (z12) {
                                        pccVar.a = b2;
                                        xjb xjbVar = (xjb) w44Var;
                                        CharSequence text = xjbVar.getText();
                                        if (text instanceof Spanned) {
                                            Spanned spanned2 = (Spanned) text;
                                            tv7Var = tv7Var2;
                                            gn[] gnVarArr = (gn[]) spanned2.getSpans(i6, text.length(), gn.class);
                                            if (gnVarArr != null) {
                                                int i9 = i6;
                                                while (i9 < gnVarArr.length) {
                                                    gn gnVar = gnVarArr[i9];
                                                    gn[] gnVarArr2 = gnVarArr;
                                                    TLRPC.Document document = gnVar.document;
                                                    int i10 = i9;
                                                    if (document == null) {
                                                        document = vm.e(i8, gnVar.getDocumentId());
                                                    }
                                                    if (document != null) {
                                                        vm.g(i8).e(document);
                                                    }
                                                    occ occVar = new occ();
                                                    int i11 = childCount;
                                                    int i12 = i7;
                                                    occVar.document_id = gnVar.getDocumentId();
                                                    occVar.document = document;
                                                    occVar.offset = spanned2.getSpanStart(gnVar);
                                                    occVar.length = spanned2.getSpanEnd(gnVar) - occVar.offset;
                                                    bc4.G(i8);
                                                    occVar.a = bc4.J(document, null, true, true).getAbsolutePath();
                                                    int i13 = 0;
                                                    while (document != null) {
                                                        ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                        if (arrayList2 == null || arrayList2.isEmpty() || new File(occVar.a).exists()) {
                                                            break;
                                                        }
                                                        bc4.G(i8);
                                                        spanned = spanned2;
                                                        z11 = true;
                                                        occVar.a = bc4.J(document.thumbs.get(i13), null, true, true).getAbsolutePath();
                                                        i13++;
                                                        if (i13 >= document.thumbs.size()) {
                                                            break;
                                                        }
                                                        spanned2 = spanned;
                                                    }
                                                    spanned = spanned2;
                                                    z11 = true;
                                                    boolean K2 = k47.K2(occVar.document, z11);
                                                    if (K2 || u0(occVar.document)) {
                                                        occVar.c = (byte) (occVar.c | (K2 ? (byte) 1 : (byte) 4));
                                                    }
                                                    if (k47.B4(occVar.document)) {
                                                        occVar.c = (byte) (occVar.c | 8);
                                                    }
                                                    pccVar.k.add(occVar);
                                                    if (document != null) {
                                                        BigInteger valueOf = BigInteger.valueOf(5000L);
                                                        xv7Var.W0 = xv7Var.W0.multiply(valueOf).divide(xv7Var.W0.gcd(valueOf));
                                                    }
                                                    i9 = i10 + 1;
                                                    gnVarArr = gnVarArr2;
                                                    childCount = i11;
                                                    i7 = i12;
                                                    spanned2 = spanned;
                                                }
                                            }
                                        } else {
                                            tv7Var = tv7Var2;
                                        }
                                        i4 = childCount;
                                        i5 = i7;
                                        pccVar.j = text.toString();
                                        pccVar.b = (byte) xjbVar.getType();
                                        pccVar.l = xjbVar.getSwatch().a;
                                        pccVar.m = xjbVar.getTextSize();
                                        pccVar.n = xjbVar.getTypeface();
                                        pccVar.p = xjbVar.getAlign();
                                    } else {
                                        tv7Var = tv7Var2;
                                        i4 = childCount;
                                        i5 = i7;
                                        if (w44Var instanceof z1b) {
                                            pccVar.a = (byte) 0;
                                            z1b z1bVar = (z1b) w44Var;
                                            xka baseSize = z1bVar.getBaseSize();
                                            pccVar.f = baseSize.a;
                                            pccVar.g = baseSize.b;
                                            pccVar.B = z1bVar.getSticker();
                                            pccVar.C = z1bVar.getParentObject();
                                            TLRPC.Document sticker = z1bVar.getSticker();
                                            bc4.G(z8c.t0);
                                            pccVar.j = bc4.J(sticker, null, true, true).getAbsolutePath();
                                            if (k47.K2(sticker, true) || u0(sticker)) {
                                                boolean K22 = k47.K2(sticker, true);
                                                pccVar.b = (byte) (pccVar.b | (K22 ? (byte) 1 : (byte) 4));
                                                r21 = (K22 || u0(sticker)) ? z1bVar.getDuration() : 5000L;
                                                if (r21 != 0) {
                                                    BigInteger valueOf2 = BigInteger.valueOf(r21);
                                                    xv7Var.W0 = xv7Var.W0.multiply(valueOf2).divide(xv7Var.W0.gcd(valueOf2));
                                                }
                                            }
                                            if (k47.B4(sticker)) {
                                                pccVar.l = -1;
                                                pccVar.b = (byte) (pccVar.b | 8);
                                            }
                                            if (z1bVar.v0) {
                                                pccVar.b = (byte) (pccVar.b | 2);
                                            }
                                        } else if (w44Var instanceof g88) {
                                            g88 g88Var = (g88) w44Var;
                                            pccVar.a = (byte) 2;
                                            xka baseSize2 = g88Var.getBaseSize();
                                            pccVar.f = baseSize2.a;
                                            pccVar.g = baseSize2.b;
                                            pccVar.j = g88Var.q(i8);
                                            pccVar.u = g88Var.I0;
                                            if (g88Var.v0) {
                                                pccVar.b = (byte) (pccVar.b | 2);
                                            }
                                        } else if (w44Var instanceof nd6) {
                                            nd6 nd6Var = (nd6) w44Var;
                                            gd6 gd6Var = nd6Var.s0;
                                            pccVar.a = (byte) 3;
                                            pccVar.b = (byte) nd6Var.getType();
                                            pccVar.f = gd6Var.getWidth();
                                            pccVar.g = gd6Var.getHeight();
                                            pccVar.j = gd6Var.getText();
                                            pccVar.l = nd6Var.t0 ? nd6Var.getColor() : 0;
                                            pccVar.Q = gd6Var.E;
                                            pccVar.O = nd6Var.w0;
                                            TL_stories.MediaArea mediaArea2 = nd6Var.x0;
                                            pccVar.N = mediaArea2;
                                            mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            TLRPC.Document codeEmojiDocument = gd6Var.getCodeEmojiDocument();
                                            if (codeEmojiDocument != null) {
                                                occ occVar2 = new occ();
                                                occVar2.document_id = codeEmojiDocument.id;
                                                occVar2.document = codeEmojiDocument;
                                                bc4.G(i8);
                                                occVar2.a = bc4.J(codeEmojiDocument, null, true, true).getAbsolutePath();
                                                boolean K23 = k47.K2(occVar2.document, true);
                                                if (K23 || u0(occVar2.document)) {
                                                    occVar2.c = (byte) (occVar2.c | (K23 ? (byte) 1 : (byte) 4));
                                                }
                                                pccVar.k.add(occVar2);
                                            }
                                        } else if (w44Var instanceof kuc) {
                                            kuc kucVar = (kuc) w44Var;
                                            gd6 gd6Var2 = kucVar.s0;
                                            pccVar.a = (byte) 8;
                                            pccVar.b = (byte) kucVar.getType();
                                            pccVar.f = gd6Var2.getWidth();
                                            pccVar.g = gd6Var2.getHeight();
                                            pccVar.j = gd6Var2.getText();
                                            pccVar.l = kucVar.t0 ? kucVar.getColor() : 0;
                                            pccVar.Q = gd6Var2.E;
                                            pccVar.P = kucVar.w0;
                                            TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                            tL_mediaAreaWeather.emoji = kucVar.w0.c;
                                            tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                            tL_mediaAreaWeather.color = gd6Var2.f.getColor();
                                            pccVar.N = tL_mediaAreaWeather;
                                            tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            TLRPC.Document codeEmojiDocument2 = gd6Var2.getCodeEmojiDocument();
                                            if (codeEmojiDocument2 != null) {
                                                occ occVar3 = new occ();
                                                occVar3.document_id = codeEmojiDocument2.id;
                                                occVar3.document = codeEmojiDocument2;
                                                bc4.G(i8);
                                                occVar3.a = bc4.J(codeEmojiDocument2, null, true, true).getAbsolutePath();
                                                boolean K24 = k47.K2(occVar3.document, true);
                                                if (K24 || u0(occVar3.document)) {
                                                    occVar3.c = (byte) (occVar3.c | (K24 ? (byte) 1 : (byte) 4));
                                                }
                                                pccVar.k.add(occVar3);
                                            }
                                            view = childAt;
                                            z7 = false;
                                            z8 = false;
                                            imageReceiver = null;
                                            arrayList.add(pccVar);
                                            scaleX = view.getScaleX();
                                            float scaleY = view.getScaleY();
                                            float x = view.getX();
                                            float y = view.getY();
                                            pccVar.q = view.getWidth();
                                            pccVar.r = view.getHeight();
                                            pccVar.f = (view.getWidth() * scaleX) / tv7Var.getMeasuredWidth();
                                            pccVar.g = (view.getHeight() * scaleY) / tv7Var.getMeasuredHeight();
                                            pccVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x) / tv7Var.getMeasuredWidth();
                                            pccVar.d = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y) / tv7Var.getMeasuredHeight();
                                            pccVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            pccVar.y = ((view.getWidth() / 2.0f) + x) / tv7Var.getMeasuredWidth();
                                            pccVar.z = ((view.getHeight() / 2.0f) + y) / tv7Var.getMeasuredHeight();
                                            pccVar.w = pccVar.q / tv7Var.getMeasuredWidth();
                                            pccVar.x = pccVar.r / tv7Var.getMeasuredHeight();
                                            pccVar.v = scaleX;
                                            if (w44Var instanceof u37) {
                                                z9 = z7;
                                                if (w44Var instanceof z1b) {
                                                    float v = ((z1b) w44Var).z0.v();
                                                    float f = (pccVar.f / 2.0f) + pccVar.c;
                                                    float f2 = (pccVar.g / 2.0f) + pccVar.d;
                                                    float measuredWidth = tv7Var.getMeasuredWidth() / tv7Var.getMeasuredHeight();
                                                    if (v > 1.0f) {
                                                        float f3 = (pccVar.f * measuredWidth) / v;
                                                        pccVar.g = f3;
                                                        pccVar.r = (int) (pccVar.q / v);
                                                        pccVar.d = f2 - (f3 / 2.0f);
                                                    } else if (v < 1.0f) {
                                                        float f4 = (pccVar.g / measuredWidth) * v;
                                                        pccVar.f = f4;
                                                        pccVar.q = (int) (pccVar.r * v);
                                                        pccVar.c = f - (f4 / 2.0f);
                                                    }
                                                } else {
                                                    TL_stories.MediaArea mediaArea3 = pccVar.N;
                                                    if (mediaArea3 != null && (((z10 = w44Var instanceof nd6)) || (w44Var instanceof kuc) || (w44Var instanceof o66) || (w44Var instanceof g29))) {
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                        float f5 = pccVar.c;
                                                        float f6 = pccVar.f;
                                                        mediaAreaCoordinates2.x = ((f6 / 2.0f) + f5) * 100.0f;
                                                        mediaAreaCoordinates2.y = ((pccVar.g / 2.0f) + pccVar.d) * 100.0f;
                                                        if (z10) {
                                                            gd6 gd6Var3 = ((nd6) w44Var).s0;
                                                            mediaAreaCoordinates2.w = hg9.e((gd6Var3.J << 1) * scaleX, tv7Var.getMeasuredWidth(), f6, 100.0f);
                                                            pccVar.N.coordinates.h = hg9.e((gd6Var3.K << 1) * scaleY, tv7Var.getMeasuredHeight(), pccVar.g, 100.0f);
                                                        } else if (w44Var instanceof kuc) {
                                                            gd6 gd6Var4 = ((kuc) w44Var).s0;
                                                            mediaAreaCoordinates2.w = hg9.e((gd6Var4.J << 1) * scaleX, tv7Var.getMeasuredWidth(), f6, 100.0f);
                                                            pccVar.N.coordinates.h = hg9.e((gd6Var4.K << 1) * scaleY, tv7Var.getMeasuredHeight(), pccVar.g, 100.0f);
                                                        } else if (w44Var instanceof o66) {
                                                            d66 d66Var = ((o66) w44Var).s0;
                                                            mediaAreaCoordinates2.w = hg9.e((d66Var.f << 1) * scaleX, tv7Var.getMeasuredWidth(), f6, 100.0f);
                                                            pccVar.N.coordinates.h = hg9.e((d66Var.h << 1) * scaleY, tv7Var.getMeasuredHeight(), pccVar.g, 100.0f);
                                                        } else if (w44Var instanceof g29) {
                                                            g29 g29Var = (g29) w44Var;
                                                            float padding = ((g29Var.getPadding() << 1) * scaleX) / tv7Var.getMeasuredWidth();
                                                            float padding2 = ((g29Var.getPadding() << 1) * scaleX) / tv7Var.getMeasuredHeight();
                                                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = pccVar.N.coordinates;
                                                            mediaAreaCoordinates3.w = (pccVar.f - padding) * 100.0f;
                                                            mediaAreaCoordinates3.h = (pccVar.g - padding2) * 100.0f;
                                                        }
                                                        pccVar.N.coordinates.rotation = ((-pccVar.e) / 3.141592653589793d) * 180.0d;
                                                        if (z10) {
                                                            radius = ((nd6) w44Var).s0.getRadius();
                                                        } else if (w44Var instanceof kuc) {
                                                            radius = ((kuc) w44Var).s0.getRadius();
                                                        } else if (w44Var instanceof o66) {
                                                            radius = ((o66) w44Var).s0.getRadius();
                                                        }
                                                        d = radius;
                                                    }
                                                }
                                                d = -1.0d;
                                            } else {
                                                u37 u37Var2 = (u37) w44Var;
                                                o37 o37Var = u37Var2.t0;
                                                jp0 jp0Var2 = u37Var2.s0;
                                                RectF rectF = gm.P;
                                                z9 = z7;
                                                double r = u37Var2.r(rectF);
                                                rectF.offset(jp0Var2.getX(), jp0Var2.getY());
                                                rectF.offset(o37Var.getX(), o37Var.getY());
                                                pccVar.N.coordinates.x = (((rectF.centerX() * scaleX) + hg9.x(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x)) / tv7Var.getMeasuredWidth()) * 100.0f;
                                                pccVar.N.coordinates.y = (((rectF.centerY() * scaleY) + hg9.x(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y)) / tv7Var.getMeasuredHeight()) * 100.0f;
                                                pccVar.N.coordinates.w = ((rectF.width() * scaleX) / tv7Var.getMeasuredWidth()) * 100.0f;
                                                pccVar.N.coordinates.h = ((rectF.height() * scaleY) / tv7Var.getMeasuredHeight()) * 100.0f;
                                                pccVar.N.coordinates.rotation = ((-pccVar.e) / 3.141592653589793d) * 180.0d;
                                                d = r;
                                            }
                                            mediaArea = pccVar.N;
                                            if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                                mediaAreaCoordinates.flags |= 1;
                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                            }
                                            z5 = z8;
                                            z6 = z9;
                                        } else {
                                            if (w44Var instanceof o66) {
                                                o66 o66Var = (o66) w44Var;
                                                d66 d66Var2 = o66Var.s0;
                                                pccVar.a = (byte) 7;
                                                if (d66Var2.e()) {
                                                    pccVar.b = (byte) d66Var2.getPreviewType();
                                                } else {
                                                    pccVar.b = (byte) o66Var.getType();
                                                }
                                                pccVar.f = d66Var2.getWidth();
                                                pccVar.g = d66Var2.getHeight();
                                                pccVar.l = o66Var.v0 ? o66Var.getColor() : 0;
                                                pccVar.Q = d66Var2.e;
                                                pccVar.a0 = o66Var.w0;
                                                boolean z13 = d66Var2.S;
                                                if (z13) {
                                                    ImageReceiver imageReceiver5 = d66Var2.U;
                                                    if (z13 && imageReceiver5.C() && imageReceiver5.n() != null) {
                                                        fn5.z().K(new BitmapDrawable(imageReceiver5.n()), imageReceiver5.R, false);
                                                    }
                                                    c66 c66Var = pccVar.a0;
                                                    c66Var.a |= 4;
                                                    c66Var.i = d66Var2.getPhotoSide();
                                                }
                                                TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                                pccVar.N = tL_mediaAreaUrl;
                                                c66 c66Var2 = o66Var.w0;
                                                if (c66Var2 != null) {
                                                    TLRPC.WebPage webPage = c66Var2.d;
                                                    tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? o66Var.w0.c : o66Var.w0.d.url;
                                                    pccVar.N.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                            } else {
                                                if (w44Var instanceof g29) {
                                                    g29 g29Var2 = (g29) w44Var;
                                                    pccVar.a = (byte) 4;
                                                    TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                    pccVar.N = tL_mediaAreaSuggestedReaction;
                                                    k39 currentReaction = g29Var2.getCurrentReaction();
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
                                                    pccVar.N.dark = g29Var2.t0.a == 1;
                                                    TL_stories.MediaArea mediaArea4 = pccVar.N;
                                                    mediaArea4.flipped = g29Var2.A0;
                                                    mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                } else if (w44Var instanceof ao9) {
                                                    ao9 ao9Var = (ao9) w44Var;
                                                    xka baseSize3 = ao9Var.getBaseSize();
                                                    pccVar.f = baseSize3.a;
                                                    pccVar.g = baseSize3.b;
                                                    pccVar.a = (byte) 5;
                                                    if (g6bVar != null) {
                                                        pccVar.j = g6bVar.o0.getAbsolutePath();
                                                        pccVar.R = g6bVar.r0;
                                                        long j = g6bVar.q0;
                                                        pccVar.U = j;
                                                        float f7 = j;
                                                        pccVar.S = (long) (g6bVar.s0 * f7);
                                                        pccVar.T = (long) (g6bVar.t0 * f7);
                                                    }
                                                    pccVar.b = (byte) 4;
                                                    if (ao9Var.t0) {
                                                        pccVar.b = (byte) 6;
                                                    }
                                                } else if (w44Var instanceof u37) {
                                                    u37 u37Var3 = (u37) w44Var;
                                                    jp0 jp0Var3 = u37Var3.s0;
                                                    ArrayList arrayList3 = u37Var3.u0;
                                                    o37 o37Var2 = u37Var3.t0;
                                                    pccVar.a = (byte) 6;
                                                    int width = u37Var3.getWidth();
                                                    pccVar.q = width;
                                                    pccVar.f = width;
                                                    int height = u37Var3.getHeight();
                                                    pccVar.r = height;
                                                    pccVar.g = height;
                                                    k47 k47Var = arrayList3.size() > 0 ? (k47) arrayList3.get(0) : null;
                                                    if (k47Var != null && (message = k47Var.k) != null) {
                                                        TLRPC.MessageAction messageAction = message.action;
                                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                            TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                            pccVar.N = tL_mediaAreaStarGift;
                                                            tL_mediaAreaStarGift.slug = starGift.slug;
                                                            tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                            int i14 = 0;
                                                            while (true) {
                                                                if (i14 >= o37Var2.getChildCount()) {
                                                                    cm1Var = null;
                                                                    break;
                                                                }
                                                                View childAt2 = o37Var2.getChildAt(i14);
                                                                if (childAt2 instanceof cm1) {
                                                                    cm1Var = (cm1) childAt2;
                                                                    break;
                                                                }
                                                                i14++;
                                                            }
                                                            if (cm1Var == null || (ysaVar = cm1Var.I0) == null || (imageReceiver3 = ysaVar.d) == null) {
                                                                u37Var = u37Var3;
                                                                jp0Var = jp0Var3;
                                                                view = childAt;
                                                                imageReceiver = null;
                                                                if (z3) {
                                                                    if (g6bVar != null) {
                                                                        Matrix matrix = g6bVar.n0;
                                                                        if (g6bVar.K) {
                                                                            matrix.reset();
                                                                            if (o37Var2.getChildCount() == 1) {
                                                                                view3 = o37Var2.getChildAt(0);
                                                                                imageReceiver2 = view3 instanceof rc2 ? ((rc2) view3).getPhotoImage() : null;
                                                                            } else {
                                                                                imageReceiver2 = null;
                                                                                view3 = null;
                                                                            }
                                                                            if (imageReceiver2 != null) {
                                                                                float max = Math.max(imageReceiver2.N0 / Math.max(1, g6bVar.k0), imageReceiver2.O0 / Math.max(1, g6bVar.l0));
                                                                                matrix.postScale(max, max);
                                                                                matrix.postTranslate(imageReceiver2.r() - ((g6bVar.k0 * max) / 2.0f), imageReceiver2.s() - ((g6bVar.l0 * max) / 2.0f));
                                                                                matrix.postTranslate(jp0Var.getX(), jp0Var.getY());
                                                                                matrix.postTranslate(o37Var2.getX(), o37Var2.getY());
                                                                                matrix.postTranslate(view3.getX(), view3.getY());
                                                                                matrix.postScale(u37Var.getScaleX(), u37Var.getScaleY(), u37Var.getPivotX(), u37Var.getPivotY());
                                                                                matrix.postRotate(u37Var.getRotation(), u37Var.getPivotX(), u37Var.getPivotY());
                                                                                matrix.postTranslate(u37Var.getX(), u37Var.getY());
                                                                                matrix.postScale(1.0f / tv7Var.getWidth(), 1.0f / tv7Var.getHeight());
                                                                                matrix.postScale(g6bVar.i0, g6bVar.j0);
                                                                            }
                                                                        }
                                                                    }
                                                                    z7 = false;
                                                                } else {
                                                                    z7 = true;
                                                                }
                                                                z8 = true;
                                                                arrayList.add(pccVar);
                                                                scaleX = view.getScaleX();
                                                                float scaleY2 = view.getScaleY();
                                                                float x2 = view.getX();
                                                                float y2 = view.getY();
                                                                pccVar.q = view.getWidth();
                                                                pccVar.r = view.getHeight();
                                                                pccVar.f = (view.getWidth() * scaleX) / tv7Var.getMeasuredWidth();
                                                                pccVar.g = (view.getHeight() * scaleY2) / tv7Var.getMeasuredHeight();
                                                                pccVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x2) / tv7Var.getMeasuredWidth();
                                                                pccVar.d = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y2) / tv7Var.getMeasuredHeight();
                                                                pccVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                pccVar.y = ((view.getWidth() / 2.0f) + x2) / tv7Var.getMeasuredWidth();
                                                                pccVar.z = ((view.getHeight() / 2.0f) + y2) / tv7Var.getMeasuredHeight();
                                                                pccVar.w = pccVar.q / tv7Var.getMeasuredWidth();
                                                                pccVar.x = pccVar.r / tv7Var.getMeasuredHeight();
                                                                pccVar.v = scaleX;
                                                                if (w44Var instanceof u37) {
                                                                }
                                                                mediaArea = pccVar.N;
                                                                if (mediaArea != null) {
                                                                    mediaAreaCoordinates.flags |= 1;
                                                                    mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                                }
                                                                z5 = z8;
                                                                z6 = z9;
                                                            } else {
                                                                imageReceiver3.v0(false, false);
                                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) jva.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                                if (stargiftattributemodel != null) {
                                                                    float L = gm.L(110.0f);
                                                                    float r2 = imageReceiver3.r() + cm1Var.getX() + o37Var2.getX() + cm1Var.G0;
                                                                    float s = imageReceiver3.s() + cm1Var.getY() + o37Var2.getY() + cm1Var.H0;
                                                                    pcc pccVar2 = new pcc();
                                                                    imageReceiver4 = imageReceiver3;
                                                                    pccVar2.a = (byte) 0;
                                                                    pccVar2.f = L;
                                                                    pccVar2.g = L;
                                                                    TLRPC.Document document2 = stargiftattributemodel.document;
                                                                    pccVar2.B = document2;
                                                                    pccVar2.C = starGift;
                                                                    bc4.G(z8c.t0);
                                                                    pccVar2.j = bc4.K(document2, true).getAbsolutePath();
                                                                    if (k47.K2(document2, true) || u0(document2)) {
                                                                        boolean K25 = k47.K2(document2, true);
                                                                        pccVar2.b = (byte) (pccVar2.b | (K25 ? (byte) 1 : (byte) 4));
                                                                        p09 y3 = imageReceiver4.y();
                                                                        if (y3 != null && (K25 || u0(document2))) {
                                                                            r21 = y3.m();
                                                                        }
                                                                        if (r21 != 0) {
                                                                            BigInteger valueOf3 = BigInteger.valueOf(r21);
                                                                            xv7Var.W0 = xv7Var.W0.multiply(valueOf3).divide(xv7Var.W0.gcd(valueOf3));
                                                                        }
                                                                    }
                                                                    float scaleX2 = childAt.getScaleX();
                                                                    float scaleY3 = childAt.getScaleY();
                                                                    float x3 = childAt.getX();
                                                                    float y4 = childAt.getY();
                                                                    int i15 = (int) L;
                                                                    pccVar2.q = i15;
                                                                    pccVar2.r = i15;
                                                                    pccVar2.f = (L * scaleX2) / tv7Var.getMeasuredWidth();
                                                                    pccVar2.g = (L * scaleY3) / tv7Var.getMeasuredHeight();
                                                                    pccVar2.c = (childAt.getWidth() / 2.0f) + x3;
                                                                    pccVar2.d = (childAt.getHeight() / 2.0f) + y4;
                                                                    float x4 = hg9.x(childAt.getWidth(), 2.0f, scaleX2, r2 * scaleX2);
                                                                    u37Var = u37Var3;
                                                                    jp0Var = jp0Var3;
                                                                    view = childAt;
                                                                    double d2 = x4;
                                                                    double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                    double x5 = hg9.x(childAt.getHeight(), 2.0f, scaleY3, s * scaleY3);
                                                                    pccVar2.c = (float) (((Math.cos(rotation) * d2) - (Math.sin(rotation) * x5)) + pccVar2.c);
                                                                    float cos = (float) ((Math.cos(rotation) * x5) + (Math.sin(rotation) * d2) + pccVar2.d);
                                                                    float f8 = (-L) / 2.0f;
                                                                    float f9 = (f8 * scaleX2) + pccVar2.c;
                                                                    pccVar2.c = f9;
                                                                    pccVar2.d = (f8 * scaleY3) + cos;
                                                                    pccVar2.c = f9 / tv7Var.getMeasuredWidth();
                                                                    pccVar2.d /= tv7Var.getMeasuredHeight();
                                                                    pccVar2.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                    pccVar2.v = scaleX2;
                                                                    arrayList.add(pccVar2);
                                                                } else {
                                                                    imageReceiver4 = imageReceiver3;
                                                                    u37Var = u37Var3;
                                                                    jp0Var = jp0Var3;
                                                                    view = childAt;
                                                                }
                                                                imageReceiver = imageReceiver4;
                                                                if (z3) {
                                                                }
                                                                z8 = true;
                                                                arrayList.add(pccVar);
                                                                scaleX = view.getScaleX();
                                                                float scaleY22 = view.getScaleY();
                                                                float x22 = view.getX();
                                                                float y22 = view.getY();
                                                                pccVar.q = view.getWidth();
                                                                pccVar.r = view.getHeight();
                                                                pccVar.f = (view.getWidth() * scaleX) / tv7Var.getMeasuredWidth();
                                                                pccVar.g = (view.getHeight() * scaleY22) / tv7Var.getMeasuredHeight();
                                                                pccVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x22) / tv7Var.getMeasuredWidth();
                                                                pccVar.d = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y22) / tv7Var.getMeasuredHeight();
                                                                pccVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                pccVar.y = ((view.getWidth() / 2.0f) + x22) / tv7Var.getMeasuredWidth();
                                                                pccVar.z = ((view.getHeight() / 2.0f) + y22) / tv7Var.getMeasuredHeight();
                                                                pccVar.w = pccVar.q / tv7Var.getMeasuredWidth();
                                                                pccVar.x = pccVar.r / tv7Var.getMeasuredHeight();
                                                                pccVar.v = scaleX;
                                                                if (w44Var instanceof u37) {
                                                                }
                                                                mediaArea = pccVar.N;
                                                                if (mediaArea != null) {
                                                                }
                                                                z5 = z8;
                                                                z6 = z9;
                                                            }
                                                        }
                                                    }
                                                    u37Var = u37Var3;
                                                    jp0Var = jp0Var3;
                                                    view = childAt;
                                                    if (k47Var != null) {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        pccVar.N = tL_inputMediaAreaChannelPost;
                                                        tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        ((TL_stories.TL_inputMediaAreaChannelPost) pccVar.N).channel = oc7.r1(i8).g1(-g6b.p(k47Var));
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) pccVar.N;
                                                        Boolean C = g6b.C(k47Var);
                                                        tL_inputMediaAreaChannelPost2.msg_id = C == null ? 0 : C.booleanValue() ? k47Var.k.fwd_from.channel_post : k47Var.e1();
                                                    } else {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        pccVar.N = tL_inputMediaAreaChannelPost3;
                                                        tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    }
                                                    imageReceiver = null;
                                                    if (z3) {
                                                    }
                                                    z8 = true;
                                                    arrayList.add(pccVar);
                                                    scaleX = view.getScaleX();
                                                    float scaleY222 = view.getScaleY();
                                                    float x222 = view.getX();
                                                    float y222 = view.getY();
                                                    pccVar.q = view.getWidth();
                                                    pccVar.r = view.getHeight();
                                                    pccVar.f = (view.getWidth() * scaleX) / tv7Var.getMeasuredWidth();
                                                    pccVar.g = (view.getHeight() * scaleY222) / tv7Var.getMeasuredHeight();
                                                    pccVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x222) / tv7Var.getMeasuredWidth();
                                                    pccVar.d = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y222) / tv7Var.getMeasuredHeight();
                                                    pccVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                    pccVar.y = ((view.getWidth() / 2.0f) + x222) / tv7Var.getMeasuredWidth();
                                                    pccVar.z = ((view.getHeight() / 2.0f) + y222) / tv7Var.getMeasuredHeight();
                                                    pccVar.w = pccVar.q / tv7Var.getMeasuredWidth();
                                                    pccVar.x = pccVar.r / tv7Var.getMeasuredHeight();
                                                    pccVar.v = scaleX;
                                                    if (w44Var instanceof u37) {
                                                    }
                                                    mediaArea = pccVar.N;
                                                    if (mediaArea != null) {
                                                    }
                                                    z5 = z8;
                                                    z6 = z9;
                                                }
                                                view = childAt;
                                                z7 = true;
                                                z8 = true;
                                                imageReceiver = null;
                                                arrayList.add(pccVar);
                                                scaleX = view.getScaleX();
                                                float scaleY2222 = view.getScaleY();
                                                float x2222 = view.getX();
                                                float y2222 = view.getY();
                                                pccVar.q = view.getWidth();
                                                pccVar.r = view.getHeight();
                                                pccVar.f = (view.getWidth() * scaleX) / tv7Var.getMeasuredWidth();
                                                pccVar.g = (view.getHeight() * scaleY2222) / tv7Var.getMeasuredHeight();
                                                pccVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x2222) / tv7Var.getMeasuredWidth();
                                                pccVar.d = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y2222) / tv7Var.getMeasuredHeight();
                                                pccVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                pccVar.y = ((view.getWidth() / 2.0f) + x2222) / tv7Var.getMeasuredWidth();
                                                pccVar.z = ((view.getHeight() / 2.0f) + y2222) / tv7Var.getMeasuredHeight();
                                                pccVar.w = pccVar.q / tv7Var.getMeasuredWidth();
                                                pccVar.x = pccVar.r / tv7Var.getMeasuredHeight();
                                                pccVar.v = scaleX;
                                                if (w44Var instanceof u37) {
                                                }
                                                mediaArea = pccVar.N;
                                                if (mediaArea != null) {
                                                }
                                                z5 = z8;
                                                z6 = z9;
                                            }
                                            b = 1;
                                            i3 = 0;
                                            i7 = i5 + 1;
                                            xv7Var = this;
                                            b2 = b;
                                            i6 = i3;
                                            tv7Var2 = tv7Var;
                                            childCount = i4;
                                        }
                                    }
                                    view = childAt;
                                    z7 = false;
                                    z8 = true;
                                    imageReceiver = null;
                                    arrayList.add(pccVar);
                                    scaleX = view.getScaleX();
                                    float scaleY22222 = view.getScaleY();
                                    float x22222 = view.getX();
                                    float y22222 = view.getY();
                                    pccVar.q = view.getWidth();
                                    pccVar.r = view.getHeight();
                                    pccVar.f = (view.getWidth() * scaleX) / tv7Var.getMeasuredWidth();
                                    pccVar.g = (view.getHeight() * scaleY22222) / tv7Var.getMeasuredHeight();
                                    pccVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x22222) / tv7Var.getMeasuredWidth();
                                    pccVar.d = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y22222) / tv7Var.getMeasuredHeight();
                                    pccVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                    pccVar.y = ((view.getWidth() / 2.0f) + x22222) / tv7Var.getMeasuredWidth();
                                    pccVar.z = ((view.getHeight() / 2.0f) + y22222) / tv7Var.getMeasuredHeight();
                                    pccVar.w = pccVar.q / tv7Var.getMeasuredWidth();
                                    pccVar.x = pccVar.r / tv7Var.getMeasuredHeight();
                                    pccVar.v = scaleX;
                                    if (w44Var instanceof u37) {
                                    }
                                    mediaArea = pccVar.N;
                                    if (mediaArea != null) {
                                    }
                                    z5 = z8;
                                    z6 = z9;
                                } else {
                                    tv7Var = tv7Var2;
                                    i4 = childCount;
                                    i5 = i7;
                                    view = childAt;
                                    z5 = true;
                                    z6 = false;
                                    imageReceiver = null;
                                }
                                if (z5 && ((z2 || (z3 && pccVar.a == 6)) && bitmap != null)) {
                                    Canvas canvas2 = new Canvas(bitmap);
                                    float width2 = bitmap.getWidth() / tv7Var.getMeasuredWidth();
                                    int i16 = 0;
                                    while (i16 < 2) {
                                        Canvas canvas3 = i16 == 0 ? canvas2 : null;
                                        if (canvas3 == null || (i16 == 0 && z6)) {
                                            canvas = canvas2;
                                            view2 = view;
                                        } else {
                                            canvas3.save();
                                            canvas3.scale(width2, width2);
                                            canvas3.translate(pccVar.c * tv7Var.getMeasuredWidth(), pccVar.d * tv7Var.getMeasuredHeight());
                                            canvas3.scale(view.getScaleX(), view.getScaleY());
                                            canvas3.rotate(view.getRotation(), ((pccVar.f / 2.0f) / view.getScaleX()) * tv7Var.getMeasuredWidth(), ((pccVar.g / 2.0f) / view.getScaleY()) * tv7Var.getMeasuredHeight());
                                            view2 = view;
                                            if (!(view2 instanceof xjb) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                                canvas = canvas2;
                                                if (view2 instanceof u37) {
                                                    u37 u37Var4 = (u37) view2;
                                                    o37 o37Var3 = u37Var4.t0;
                                                    boolean z14 = true;
                                                    u37Var4.w0 = true;
                                                    int i17 = 0;
                                                    while (i17 < o37Var3.getChildCount()) {
                                                        View childAt3 = o37Var3.getChildAt(i17);
                                                        if (childAt3 instanceof rc2) {
                                                            ((rc2) childAt3).Tc = z14;
                                                        }
                                                        i17++;
                                                        z14 = true;
                                                    }
                                                    view2.draw(canvas3);
                                                    boolean z15 = false;
                                                    u37Var4.w0 = false;
                                                    int i18 = 0;
                                                    while (i18 < o37Var3.getChildCount()) {
                                                        View childAt4 = o37Var3.getChildAt(i18);
                                                        if (childAt4 instanceof rc2) {
                                                            ((rc2) childAt4).Tc = z15;
                                                        }
                                                        i18++;
                                                        z15 = false;
                                                    }
                                                } else {
                                                    view2.draw(canvas3);
                                                }
                                            } else {
                                                int scaleX3 = (int) (view2.getScaleX() * view2.getWidth());
                                                int scaleY4 = (int) (view2.getScaleY() * view2.getHeight());
                                                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                                Bitmap a = ld1.a(scaleX3, scaleY4);
                                                Canvas canvas4 = new Canvas(a);
                                                canvas = canvas2;
                                                canvas4.scale(view2.getScaleX(), view2.getScaleY());
                                                view2.draw(canvas4);
                                                canvas3.scale(1.0f / view2.getScaleX(), 1.0f / view2.getScaleY());
                                                canvas3.drawBitmap(a, (Rect) null, new Rect(0, 0, scaleX3, scaleY4), new Paint(3));
                                                try {
                                                    canvas4.setBitmap(null);
                                                } catch (Exception e) {
                                                    fc4.f(e);
                                                }
                                                a.recycle();
                                            }
                                            canvas3.restore();
                                        }
                                        i16++;
                                        canvas2 = canvas;
                                        view = view2;
                                    }
                                    if (imageReceiver != null) {
                                        b = 1;
                                        i3 = 0;
                                        imageReceiver.v0(true, false);
                                        i7 = i5 + 1;
                                        xv7Var = this;
                                        b2 = b;
                                        i6 = i3;
                                        tv7Var2 = tv7Var;
                                        childCount = i4;
                                    }
                                }
                                b = 1;
                                i3 = 0;
                                i7 = i5 + 1;
                                xv7Var = this;
                                b2 = b;
                                i6 = i3;
                                tv7Var2 = tv7Var;
                                childCount = i4;
                            } else if (arrayList != null) {
                                ((kd1) w44Var).y(tv7Var2.getMeasuredWidth(), tv7Var2.getMeasuredHeight(), arrayList);
                            }
                        }
                        i3 = i6;
                        tv7Var = tv7Var2;
                        i4 = childCount;
                        i5 = i7;
                        b = b2;
                        i7 = i5 + 1;
                        xv7Var = this;
                        b2 = b;
                        i6 = i3;
                        tv7Var2 = tv7Var;
                        childCount = i4;
                    }
                }
                return bitmap;
            }
            Bitmap c = sv7Var.c(false, false);
            createBitmap = c != null ? Bitmap.createBitmap(c.getWidth(), c.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        xv7Var.W0 = BigInteger.ONE;
        i2 = 0;
        while (i < tv7Var2.getChildCount()) {
        }
        if (i2 > 0) {
        }
        return bitmap;
    }

    public final boolean r0() {
        return this.t0.a() || this.f2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w0) {
            return;
        }
        super.requestLayout();
    }

    @Override // ku7
    public final void s(u11 u11Var) {
        boolean z = u11Var instanceof o11;
        aw7 aw7Var = this.T0;
        if (z || (u11Var instanceof q11)) {
            aw7Var.b(0.4f, 1.75f);
        } else {
            aw7Var.b(0.05f, 1.0f);
        }
        aw7Var.setDrawCenter(!(u11Var instanceof t11));
        sv7 sv7Var = this.E0;
        if (sv7Var.getCurrentBrush() instanceof t11) {
            this.S0 = true;
        }
        sv7Var.setBrush(u11Var);
        oeb oebVar = this.q1;
        int i = oebVar.a;
        oebVar.a = m58.e(this.v1).c();
        oebVar.c = this.U0.get();
        E0(oebVar, Integer.valueOf(i), false);
        this.F0.invalidate();
    }

    public final void s0(boolean z) {
        byte b = 0;
        if (this.k2) {
            J0(0);
        }
        if (z) {
            e34 e34Var = this.j2;
            if (e34Var == null || e34Var.getVisibility() != 0) {
                t0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.j2.getMeasuredHeight());
            ofFloat.addUpdateListener(new zu7(this, b));
            this.m2 = true;
            ofFloat.addListener(new mv7(this, (byte) 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(gb.w);
            ofFloat.start();
        }
    }

    public void setBlurManager(sm0 sm0Var) {
        this.U1 = sm0Var;
    }

    public void setCoverPreview(boolean z) {
        if (this.g2 != z) {
            this.g2 = z;
            if (z) {
                D0(null, true);
            }
            setCoverPause(z);
        }
    }

    public void setCoverTime(long j) {
        int i = 0;
        while (true) {
            tv7 tv7Var = this.H0;
            if (i >= tv7Var.getChildCount()) {
                return;
            }
            View childAt = tv7Var.getChildAt(i);
            if (childAt instanceof z1b) {
                ImageReceiver imageReceiver = ((z1b) childAt).z0;
                p09 y = imageReceiver.y();
                imageReceiver.m();
                if (y != null) {
                    y.I(Math.round(((j % y.m()) / y.m()) * y.e[0]), true, false);
                }
            }
            i++;
        }
    }

    public void setHasAudio(boolean z) {
        if (z != this.O1) {
            this.O1 = z;
            c0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.B1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.A1 = runnable;
    }

    @Override // gu7
    public final void t() {
        if (!this.l2 && !this.k2) {
            this.f2 = true;
            l0(true);
            return;
        }
        if (this.k2) {
            w44 w44Var = this.z0;
            if (w44Var instanceof xjb) {
                this.E1.e = true;
                gm.E3(((xjb) w44Var).getEditText());
            }
        }
        J0(!this.k2 ? 1 : 0);
    }

    public final void t0() {
        e34 e34Var;
        if (!this.k2 && (e34Var = this.j2) != null && e34Var.getVisibility() != 8) {
            this.j2.setVisibility(8);
        }
        int i = this.n2;
        this.n2 = 0;
        if (i != 0) {
            this.E1.a();
        }
    }

    @Override // u44
    public final void u(float f, float f2, float[] fArr) {
        View view;
        View view2 = (View) this.E0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x = (f - view2.getX()) - view.getLeft();
        float y = (f2 - view2.getY()) - view.getTop();
        float pivotX = ((x - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = ((y - view2.getPivotY()) / view2.getScaleY()) + view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    @Override // ela, vlb
    public final void updateColors() {
        this.u1.setColor(-15132391);
    }

    @Override // u44
    public final int[] v(w44 w44Var) {
        int i = (int) w44Var.getPosition().x;
        int[] iArr = this.i2;
        iArr[0] = i;
        iArr[1] = (int) w44Var.getPosition().y;
        return iArr;
    }

    public final void v0(m58 m58Var, Integer num) {
        m58Var.h(num.intValue(), true);
        m58Var.g();
        setNewColor(num.intValue());
        this.m1.setSelectedColorIndex(m58Var.d());
        this.J1 = null;
    }

    @Override // ku7
    public final m58 w() {
        return m58.e(this.v1);
    }

    public final /* synthetic */ void w0(Integer num) {
        setNewColor(num.intValue());
        I0(false);
    }

    public final boolean x0() {
        if (this.S1) {
            if (this.P1.getReactionsWindow() == null || this.P1.getReactionsWindow().q) {
                O0(false);
                return true;
            }
            this.P1.b();
            return true;
        }
        if (this.r1) {
            I0(false);
            return true;
        }
        if (this.k2) {
            s0(true);
            return true;
        }
        if (!this.A0) {
            return false;
        }
        if (!this.C0) {
            D0(null, true);
            return true;
        }
        this.C0 = false;
        this.E1.b(true);
        return false;
    }

    public abstract void y0(boolean z);

    @Override // ku7
    public final void z() {
        N0(new dv7(this, (byte) 4), this, 53, 0, getHeight(), false);
    }

    public final void z0() {
        int i = this.O0;
        R0(1);
        postDelayed(new bo6((Object) this, (byte) 10), 350L);
        nv7 nv7Var = new nv7(this, getContext(), this.w1, i);
        this.e2 = nv7Var;
        u9b u9bVar = this.C1;
        Objects.requireNonNull(u9bVar);
        nv7Var.w1 = new vt4((Object) u9bVar, (byte) 26);
        boolean[] zArr = {true};
        nv7Var.setOnDismissListener(new by5(this, zArr, i, (byte) 1));
        nv7Var.y1 = new ev7(this);
        nv7Var.J0(new r(this, zArr, nv7Var, (byte) 2));
        nv7Var.show();
        y0(true);
    }

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f) {
    }
}
