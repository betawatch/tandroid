package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class y3 extends FrameLayout {
    public final int[] A0;
    public final int[] B0;
    public final int[] C0;
    public final p80[] D;
    public final LinearLayout.LayoutParams[] E;
    public final ph.m0[] F;
    public final TextPaint G;
    public final u71 H;
    public final ph.k[] I;
    public final ph.k J;
    public final FrameLayout K;
    public final g9 L;
    public final a3 M;
    public boolean N;
    public final TextView O;
    public final ImageView P;
    public final ImageView Q;
    public final ImageView R;
    public boolean S;
    public Boolean T;
    public final View.OnClickListener U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final org.telegram.ui.ActionBar.p6 a;
    public f4.d a0;
    public final FrameLayout b;
    public final TL_stars.starGiftAttributeBackdrop[] b0;
    public final q3 c;
    public com.google.android.gms.common.api.internal.r c0;
    public final g9[] d;
    public com.google.android.gms.common.api.internal.r d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public com.google.android.gms.common.api.internal.r e0;
    public final LinearLayout[] f;
    public boolean f0;
    public boolean g0;
    public final FrameLayout.LayoutParams[] h;
    public float h0;
    public float i0;
    public float j0;
    public ValueAnimator k0;
    public final ph.x1 l0;
    public final Paint[] m0;
    public final ph.d1 n;
    public final RadialGradient[] n0;
    public final Matrix[] o0;
    public RadialGradient p0;
    public final Matrix q0;
    public final p80[] r;
    public final Paint r0;
    public final p80 s;
    public final TL_stars.starGiftAttributePattern[] s0;
    public final org.telegram.ui.Components.d5[] t0;
    public int u0;
    public float v0;
    public final TextView w;
    public float w0;
    public int x;
    public ValueAnimator x0;
    public final FrameLayout y;
    public final RectF y0;
    public s8 z0;

    public y3(Context context, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable, View.OnClickListener onClickListener, v0 v0Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f7;
        float f10;
        float f11;
        int i10;
        this.d = new g9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new p80[5];
        this.D = new p80[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new ph.m0[5];
        this.a0 = new f4.d(0, 0);
        this.b0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.l0 = new ph.x1(this, 21);
        this.m0 = new Paint[3];
        this.n0 = new RadialGradient[3];
        this.o0 = new Matrix[3];
        this.q0 = new Matrix();
        int i11 = 1;
        this.r0 = new Paint(1);
        this.s0 = new TL_stars.starGiftAttributePattern[2];
        this.t0 = new org.telegram.ui.Components.d5[2];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = this.m0;
            if (i12 >= paintArr.length) {
                break;
            }
            paintArr[i12] = new Paint(1);
            i12++;
        }
        int i13 = 0;
        while (true) {
            org.telegram.ui.Components.d5[] d5VarArr = this.t0;
            f7 = 28.0f;
            if (i13 >= d5VarArr.length) {
                break;
            }
            d5VarArr[i13] = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(28.0f), this);
            i13++;
        }
        this.w0 = 1.0f;
        this.y0 = new RectF();
        this.A0 = new int[12];
        this.B0 = new int[12];
        this.C0 = new int[12];
        this.a = p6Var;
        this.U = onClickListener4;
        this.V = onClickListener5;
        this.W = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i14 = 0;
        while (true) {
            g9[] g9VarArr = this.d;
            float f12 = 0.0f;
            f10 = f7;
            if (i14 >= g9VarArr.length) {
                break;
            }
            g9VarArr[i14] = new v3(context, 0);
            this.d[i14].setLayerNum(6660);
            if (i14 > 0) {
                this.d[i14].getImageReceiver().s1 = 1;
            }
            this.b.addView(this.d[i14], w7.b6.e(-1, -1, zs.E1));
            g9 g9Var = this.d[i14];
            if (i14 == 0) {
                f12 = 1.0f;
            }
            g9Var.setAlpha(f12);
            i14++;
            f7 = f10;
        }
        p80 p80Var = new p80(context, null);
        this.s = p80Var;
        p80Var.setTextSize(1, 12.0f);
        p80Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setOnClickListener(new t3(this, 0));
        w7.e6.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        w7.e6.a(textView2);
        u71 u71Var = new u71(this, context, 22);
        this.H = u71Var;
        u71Var.setOrientation(0);
        this.I = new ph.k[3];
        int i15 = 0;
        while (true) {
            ph.k[] kVarArr = this.I;
            if (i15 >= kVarArr.length) {
                break;
            }
            kVarArr[i15] = new ph.k(context, 2);
            if (i15 == 0) {
                i10 = i11;
                this.I[i15].b(R.drawable.filled_gift_send, cd.L0(2131750442, null), false);
                this.I[i15].setOnClickListener(onClickListener2);
            } else if (i15 == i11) {
                i10 = i11;
                this.I[i15].b(R.drawable.filled_crown_on, cd.L0(2131750434, null), false);
                this.I[i15].setOnClickListener(onClickListener3);
            } else if (i15 != 2) {
                i10 = i11;
            } else {
                i10 = i11;
                this.I[i15].b(R.drawable.filled_share, cd.L0(2131750447, null), false);
                this.I[i15].setOnClickListener(onClickListener4);
            }
            this.I[i15].setBackground(org.telegram.ui.ActionBar.t6.b0(0, 285212671, 16, 16));
            w7.e6.b(this.I[i15], 0.075f, 1.5f);
            u71 u71Var2 = this.H;
            ph.k[] kVarArr2 = this.I;
            u71Var2.addView(kVarArr2[i15], w7.b6.q(0, 56, 1.0f, zs.E1, 0, 0, i15 != kVarArr2.length + (-1) ? 11 : 0, 0));
            i15++;
            i11 = i10;
        }
        ph.k kVar = new ph.k(context, 2);
        this.J = kVar;
        kVar.b(R.drawable.filled_card_color, cd.L0(2131743135, null), false);
        kVar.setBackground(org.telegram.ui.ActionBar.t6.b0(0, 285212671, 16, 16));
        w7.e6.b(kVar, 0.075f, 1.5f);
        kVar.setVisibility(8);
        this.H.addView(kVar, i11, w7.b6.q(0, 56, 1.0f, zs.E1, 0, 0, 11, 0));
        this.y = new FrameLayout(context);
        int i16 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f;
            if (i16 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i16] = new LinearLayout(context);
            this.f[i16].setOrientation(1);
            if (i16 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.K = frameLayout;
                this.f[i16].addView(frameLayout, w7.b6.r(-1, zs.a2, zs.E1));
                g9 g9Var2 = new g9(context);
                this.L = g9Var2;
                g9Var2.setRoundRadius(org.telegram.messenger.i0.L(41.0f));
                frameLayout.addView(g9Var2, w7.b6.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i16] = new p80(context, null);
                this.r[i16].setTextColor(-1);
                this.r[i16].setTextSize(1, 20.0f);
                this.r[i16].setTypeface(org.telegram.messenger.i0.o());
                this.r[i16].setSingleLine();
                p80 p80Var2 = this.r[i16];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                p80Var2.setEllipsize(truncateAt);
                this.r[i16].setGravity(17);
                frameLayout.addView(this.r[i16], w7.b6.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.D[i16] = new p80(context, null);
                this.D[i16].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, p6Var));
                this.D[i16].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.H(this.D[i16], org.telegram.ui.ActionBar.t6.Uc, p6Var);
                this.D[i16].setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                this.D[i16].setDisablePaddingsOffsetY(true);
                this.D[i16].setSingleLine();
                this.D[i16].setGravity(17);
                this.D[i16].setEllipsize(truncateAt);
                frameLayout.addView(this.D[i16], w7.b6.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i16 == 4) {
                a3 a3Var = new a3(context, p6Var);
                this.M = a3Var;
                this.f[i16].addView(a3Var, w7.b6.o(-1, -2));
                View view = this.f[i16];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = w7.b6.d(-1, -2.0f, zs.E1, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i16] = d;
                addView(view, d);
                i16++;
            } else {
                this.r[i16] = new p80(context, null);
                if (i16 == 3) {
                    this.r[i16].setTextColor(-1);
                } else {
                    this.r[i16].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, p6Var));
                }
                this.r[i16].setTextSize(1, 20.0f);
                this.r[i16].setTypeface(org.telegram.messenger.i0.o());
                this.r[i16].setGravity(17);
                this.f[i16].addView(this.r[i16], w7.b6.t(-1, -2, 17, 24, i16 == 3 ? 10 : 0, 24, 0));
                if (i16 == 0) {
                    this.f[i16].addView(this.s, w7.b6.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i16].addView(this.w, w7.b6.n(19.33f, -2, 17, 0, 6, 0, 2));
                }
                if (i16 == 0) {
                    this.D[i16] = new p80(context, null);
                    if (i16 == 3) {
                        this.D[i16].setTextColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
                    } else {
                        this.D[i16].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, p6Var));
                    }
                    this.D[i16].setTextSize(1, 14.0f);
                    this.D[i16].setGravity(17);
                    org.telegram.ui.ActionBar.a7.H(this.D[i16], org.telegram.ui.ActionBar.t6.Uc, p6Var);
                    this.D[i16].setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    this.D[i16].setDisablePaddingsOffsetY(true);
                    this.y.addView(this.D[i16], w7.b6.e(-2, -2, 17));
                    this.y.addView(this.O, w7.b6.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f[i16];
                    FrameLayout frameLayout2 = this.y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                    LinearLayout.LayoutParams t10 = w7.b6.t(-1, -2, 17, 24, 0, 24, i16 == 3 ? 6 : 0);
                    layoutParamsArr2[i16] = t10;
                    linearLayout.addView(frameLayout2, t10);
                } else {
                    this.D[i16] = new p80(context, null);
                    if (i16 == 3) {
                        this.D[i16].setTextColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
                    } else {
                        this.D[i16].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, p6Var));
                    }
                    this.D[i16].setTextSize(1, 14.0f);
                    this.D[i16].setGravity(17);
                    org.telegram.ui.ActionBar.a7.H(this.D[i16], org.telegram.ui.ActionBar.t6.Uc, p6Var);
                    this.D[i16].setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    this.D[i16].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i16];
                    p80 p80Var3 = this.D[i16];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                    LinearLayout.LayoutParams t11 = w7.b6.t(-1, -2, 17, 24, 0, 24, i16 == 3 ? 6 : 0);
                    layoutParamsArr3[i16] = t11;
                    linearLayout2.addView(p80Var3, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.E[i16];
                if (i16 == 3) {
                    f11 = 6.0f;
                } else {
                    f11 = (i16 == 1 ? 7.33f : this.b0[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = org.telegram.messenger.i0.L(f11);
                this.F[i16] = new ph.m0(context);
                this.F[i16].setVisibility(8);
                this.F[i16].setPadding(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(2.0f));
                if (i16 == 0) {
                    this.G = this.F[i16].getTextPaint();
                }
                this.f[i16].addView(this.F[i16], w7.b6.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i16 == 0) {
                this.f[i16].addView(this.H, w7.b6.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i16];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d10 = w7.b6.d(-1, -2.0f, zs.E1, 16.0f, i16 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i16] = d10;
            addView(view2, d10);
            i16++;
        }
        addView(this.b, w7.b6.d(zs.q2, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        q3 q3Var = new q3(context);
        this.c = q3Var;
        addView(q3Var, w7.b6.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(f10), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        w7.e6.a(imageView);
        addView(imageView, w7.b6.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new og.u(2, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.Q = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        w7.e6.a(imageView2);
        if (v0Var != null) {
            addView(imageView2, w7.b6.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(v0Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setContentDescription(cd.L0(2131754878, null));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        w7.e6.a(imageView3);
        addView(imageView3, w7.b6.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        ph.d1 d1Var = new ph.d1(context);
        this.n = d1Var;
        d1Var.b(cd.L0(2131749762, null), true);
        ph.f1 f1Var = d1Var.a;
        if (f1Var.w == null) {
            s8 s8Var = new s8(2, 12);
            f1Var.w = s8Var;
            s8Var.h = 5.0f;
        }
        Path path = f1Var.f;
        float f13 = f1Var.s;
        f1Var.x = true;
        ph.f1.d(path, f13, true);
        d1Var.setScaleX(1.2f);
        d1Var.setScaleY(1.2f);
        addView(d1Var, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.x0 = ofFloat;
        ofFloat.addUpdateListener(new u3(this, 1));
        this.x0.addListener(new w3(this, 4));
        this.x0.setDuration(320L);
        this.x0.setInterpolator(gr.g);
        this.x0.start();
    }

    public final int b(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10 = this.u0;
        RadialGradient[] radialGradientArr = this.n0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        Matrix[] matrixArr = this.o0;
        Paint[] paintArr = this.m0;
        int i11 = 0;
        if (i10 != 0) {
            if (this.v0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) (this.a0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f7, f10);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                i11 = i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
            }
            if (this.v0 <= 0.0f || stargiftattributebackdropArr[2] == null) {
                return i11;
            }
            paintArr[2].setAlpha((int) (this.a0.a(1) * 255.0f * this.v0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            return i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        if (this.v0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.a0.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i11 = i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
        }
        if (this.v0 >= 1.0f || stargiftattributebackdropArr[1] == null) {
            return i11;
        }
        paintArr[1].setAlpha((int) ((1.0f - this.v0) * this.a0.a(1) * 255.0f));
        matrixArr[1].reset();
        matrixArr[1].postTranslate(f7, f10);
        radialGradientArr[1].setLocalMatrix(matrixArr[1]);
        canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[1];
        return i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.translate(f7, f10);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i10 = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int f13 = i0.b.f(this.v0, i10, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        org.telegram.ui.Components.d5[] d5VarArr = this.t0;
        d5VarArr[1].k(Integer.valueOf(f13));
        j0.a(canvas, 0, d5VarArr[1], f11, f12, this.a0.a(1), this.w0);
        canvas.restore();
    }

    public void d(f4.d dVar) {
        View[] viewArr;
        p80[] p80VarArr;
        float a2;
        int i10;
        boolean z10;
        this.a0 = dVar;
        int i11 = 0;
        while (true) {
            viewArr = this.f;
            if (i11 >= viewArr.length) {
                break;
            }
            float a10 = dVar.a(i11);
            viewArr[i11].setAlpha(a10);
            viewArr[i11].setVisibility(a10 > 0.0f ? 0 : 4);
            i11++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? dVar.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? dVar.a(1) : 0.0f);
        ImageView imageView = this.P;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || dVar.b != 2) && (stargiftattributebackdropArr[1] == null || dVar.b != 1)) ? 8 : 0);
        boolean z11 = stargiftattributebackdropArr[0] != null || this.S;
        float a11 = dVar.a(0);
        int i12 = dVar.b;
        float V1 = org.telegram.messenger.i0.V1(false, z11, a11);
        ImageView imageView2 = this.R;
        imageView2.setAlpha(V1);
        imageView2.setVisibility((z11 && i12 == 0) ? 0 : 8);
        boolean z12 = stargiftattributebackdropArr[0] != null;
        Boolean bool = this.T;
        int i13 = -1;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        if (bool == null || bool.booleanValue() != z12) {
            this.T = Boolean.valueOf(z12);
            if (z12) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.J5, p6Var, PorterDuff.Mode.SRC_IN);
                int i14 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var), 1, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N, p6Var);
            }
        }
        if (!this.g0) {
            float V12 = org.telegram.messenger.i0.V1(false, this.N, dVar.a(0));
            TextView textView = this.O;
            textView.setAlpha(V12);
            textView.setScaleX(org.telegram.messenger.i0.T1(0.4f, this.N ? 1.0f : 0.4f, dVar.a(0)));
            textView.setScaleY(org.telegram.messenger.i0.T1(0.4f, this.N ? 1.0f : 0.4f, dVar.a(0)));
            textView.setVisibility((this.N && i12 == 0) ? 0 : 4);
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, p6Var);
        int i15 = 0;
        while (true) {
            p80VarArr = this.D;
            if (i15 >= 2) {
                break;
            }
            this.r[i15].setTextColor(stargiftattributebackdropArr[Math.min(1, i15)] == null ? w02 : i13);
            p80 p80Var = p80VarArr[i15];
            if (i15 == 0 || i15 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i15];
                i10 = stargiftattributebackdrop == null ? w02 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i16 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i10 = i0.b.f(this.v0, i16, stargiftattributebackdrop3 == null ? w02 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            p80Var.setTextColor(i10);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i15];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                z10 = (org.telegram.messenger.i0.L(184.0f) == layoutParamsArr[i15].topMargin && viewArr[i15].getPaddingBottom() == org.telegram.messenger.i0.L(18.0f)) ? false : true;
                if (z10) {
                    viewArr[i15].setPadding(0, 0, 0, org.telegram.messenger.i0.L(18.0f));
                    layoutParamsArr[i15].topMargin = org.telegram.messenger.i0.L(184.0f);
                }
            } else {
                z10 = (org.telegram.messenger.i0.L(170.0f) == layoutParamsArr[i15].topMargin && viewArr[i15].getPaddingBottom() == org.telegram.messenger.i0.L(3.0f)) ? false : true;
                if (z10) {
                    viewArr[i15].setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
                    layoutParamsArr[i15].topMargin = org.telegram.messenger.i0.L(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
            layoutParamsArr2[i15].topMargin = org.telegram.messenger.i0.L((i15 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z10) {
                viewArr[i15].setLayoutParams(layoutParamsArr[i15]);
                if (i15 == 0) {
                    this.y.setLayoutParams(layoutParamsArr2[i15]);
                } else {
                    p80VarArr[i15].setLayoutParams(layoutParamsArr2[i15]);
                }
            }
            i15++;
            i13 = -1;
        }
        int L = org.telegram.messenger.i0.L(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.w.setBackground(org.telegram.ui.ActionBar.t6.d0(L, stargiftattributebackdrop5 == null ? 553648127 : i0.b.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        p80 p80Var2 = p80VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        p80Var2.setTextColor(w02);
        g9[] g9VarArr = this.d;
        g9 g9Var = g9VarArr[0];
        f4.d dVar2 = this.a0;
        g9Var.setAlpha(Math.max((dVar2.b(0) && dVar2.b(2)) ? 1.0f : Math.max(dVar2.a(0), dVar2.a(2)), this.a0.a(3)));
        g9VarArr[1].setAlpha((1.0f - this.v0) * dVar.a(1));
        g9VarArr[2].setAlpha(dVar.a(1) * this.v0);
        float T1 = org.telegram.messenger.i0.T1(1.0f, this.j0, dVar.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(T1);
        frameLayout.setScaleY(org.telegram.messenger.i0.T1(1.0f, this.j0, dVar.a(2)));
        frameLayout.setTranslationX(dVar.a(2) * this.h0);
        frameLayout.setTranslationY((dVar.a(2) * this.i0) + (dVar.a(1) * org.telegram.messenger.i0.L(16.0f)));
        View view = viewArr[2];
        int i17 = dVar.a;
        if (i17 == 2 && i12 == 2) {
            a2 = 0.0f;
        } else {
            if (i17 != 2) {
                i12 = i17;
            }
            a2 = (1.0f - dVar.a(2)) * (-(viewArr[i12].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view.setTranslationY(a2);
        int i18 = (this.f0 && this.a0.b(0)) ? 0 : 8;
        ph.d1 d1Var = this.n;
        d1Var.setVisibility(i18);
        d1Var.setAlpha(this.a0.a(0));
        int i19 = dVar.a(4) <= 0.0f ? 8 : 0;
        a3 a3Var = this.M;
        a3Var.setVisibility(i19);
        a3Var.setAlpha(dVar.a(4));
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        float f7;
        float f10;
        float f11;
        int[] iArr;
        int[] iArr2;
        float f12;
        int i10;
        int[] iArr3;
        y3 y3Var;
        Canvas canvas2;
        q3 q3Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f13 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f14 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = org.telegram.messenger.i0.L(80.0f) + org.telegram.messenger.i0.W1(this.a0.a(1), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(24.0f));
        f4.d dVar = this.a0;
        float max = ((dVar.b(0) && dVar.b(2)) || (dVar.b(2) && dVar.b(3)) || (dVar.b(3) && dVar.b(0))) ? 1.0f : Math.max(dVar.a(0), Math.max(dVar.a(2), dVar.a(3)));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.b0;
        if (max <= 0.0f || stargiftattributebackdropArr2[0] == null) {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        } else {
            if (this.p0 == null || this.a0.a(2) < 1.0f) {
                Paint[] paintArr = this.m0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.o0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.n0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            } else {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            }
            if (this.p0 != null && this.a0.a(2) > 0.0f) {
                int a2 = (int) (this.a0.a(2) * 255.0f);
                Paint paint = this.r0;
                paint.setAlpha(a2);
                Matrix matrix = this.q0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.p0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        }
        if (this.a0.a(1) > 0.0f) {
            f7 = width;
            f10 = L;
            k(b(canvas, f7, f10, getWidth(), realHeight));
        } else {
            f7 = width;
            f10 = L;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.C0;
        int[] iArr5 = this.B0;
        int[] iArr6 = this.A0;
        if (stargiftattributebackdrop != null) {
            int i11 = 0;
            while (i11 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i11] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i11] = i0.b.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i11] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i11++;
                f13 = f13;
                f14 = f14;
            }
        }
        float f15 = f13;
        float f16 = f14;
        q3 q3Var2 = this.c;
        if (q3Var2.s == null && q3Var2.w == null && q3Var2.x == null) {
            y3Var = this;
            f12 = f7;
            f11 = f10;
            iArr = iArr5;
            iArr2 = iArr6;
            i10 = 1;
            q3Var = q3Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f17 = f7;
            k3 k3Var = q3Var2.s;
            float f18 = f10;
            float f19 = q3Var2.y;
            int[] iArr7 = this.B0;
            int[] iArr8 = this.A0;
            int[] iArr9 = this.C0;
            f11 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            f12 = f17;
            i10 = 1;
            iArr3 = iArr4;
            y3Var = this;
            canvas2 = canvas;
            q3Var2.a(canvas2, k3Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            q3Var2.a(canvas2, q3Var2.w, q3Var2.D, width2, realHeight, iArr7, iArr8, iArr9);
            q3Var2.a(canvas2, q3Var2.x, q3Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            q3Var = q3Var2;
            y3Var.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            f4.d dVar2 = y3Var.a0;
            float max2 = (dVar2.b(0) && dVar2.b(3)) ? 1.0f : Math.max(dVar2.a(0), dVar2.a(3));
            org.telegram.ui.Components.d5[] d5VarArr = y3Var.t0;
            if (max2 > f15) {
                canvas2.save();
                canvas2.translate(f12, f11);
                d5VarArr[0].k(Integer.valueOf(i12));
                j0.a(canvas, 0, d5VarArr[0], y3Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (y3Var.a0.a(2) > f15) {
                canvas.save();
                d5VarArr[0].k(Integer.valueOf(i12));
                float f20 = realHeight;
                RectF rectF = org.telegram.messenger.i0.P;
                LinearLayout[] linearLayoutArr = y3Var.f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = y3Var.K;
                float x11 = frameLayout.getX() + x10;
                g9 g9Var = y3Var.L;
                rectF.set(g9Var.getX() + x11, g9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), g9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + g9Var.getWidth(), g9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + g9Var.getHeight());
                j0.c(canvas, d5VarArr[0], y3Var.getWidth(), f20 * 0.7f, 1.0f, rectF, y3Var.a0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i13 = 0;
            while (true) {
                ph.k[] kVarArr = y3Var.I;
                if (i13 > kVarArr.length) {
                    break;
                }
                ph.k kVar = i13 < kVarArr.length ? kVarArr[i13] : y3Var.J;
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.t6.H1(kVar.getBackground(), iArr10[Utilities.j(Math.round((((kVar.getWidth() / f16) + kVar.getX()) / y3Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    kVar.invalidate();
                }
                i13++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i14 = iArr11[iArr11.length / 2];
            int i15 = iArr12[iArr12.length / 2];
            TextView textView = y3Var.w;
            if (textView != null && y3Var.x != i14) {
                y3Var.x = i14;
                textView.setTextColor(i14);
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), i15, false);
            }
            if (q3Var.s != null || q3Var.w != null || q3Var.x != null) {
                y3Var.D[0].setTextColor(i14);
            }
            if (y3Var.a0.a(2) > f15) {
                if (y3Var.z0 == null) {
                    y3Var.z0 = new s8(i10, 12);
                }
                FrameLayout frameLayout2 = y3Var.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f16) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f16;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f16) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f16;
                float f21 = measuredHeight + scaleY;
                RectF rectF2 = y3Var.y0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f21);
                y3Var.z0.g(rectF2);
                y3Var.z0.d();
                y3Var.z0.a(canvas2, org.telegram.ui.ActionBar.t6.r1(y3Var.a0.a(2), -1));
                y3Var.invalidate();
            }
        }
        if (y3Var.a0.a(1) > f15) {
            y3Var.c(canvas2, f12, f11, y3Var.getWidth(), y3Var.getRealHeight());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i10, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.n0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.p0 = radialGradient2;
            this.r0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.o0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.m0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        this.N = false;
        boolean z13 = z10 || z11;
        boolean z14 = starGift instanceof TL_stars.TL_starGiftUnique;
        u71 u71Var = this.H;
        p80[] p80VarArr = this.D;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        if (z14) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) e6.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) e6.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            p80VarArr[0].setTextSize(1, 13.0f);
            u71Var.setVisibility(z13 ? 0 : 8);
            ph.k[] kVarArr = this.I;
            kVarArr[2].setVisibility(0);
            if (z13) {
                kVarArr[1].b(z12 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, cd.L0(z12 ? 2131750431 : 2131750434, null), false);
            }
            float f7 = 1.0f;
            if (starGift.resell_amount != null) {
                this.N = true;
                boolean z15 = starGift.resale_ton_only;
                sf.b bVar = sf.b.b;
                sf.a resellAmount = starGift.getResellAmount(z15 ? bVar : sf.b.a);
                CharSequence V = cd.V(null, null, 2131749690, h8.U0("⭐️ " + ((Object) h8.L0(resellAmount.o(), 1.0f, ',')), resellAmount.a == bVar), Float.valueOf(0.9f));
                TextView textView = this.O;
                textView.setText(V);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (e4.K1(d20.s0, org.telegram.messenger.o5.o(starGift.owner_id))) {
                    textView.setOnClickListener(new t3(this, 1));
                    w7.e6.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                kVarArr[0].setAlpha(1.0f);
                kVarArr[0].b(R.drawable.filled_gift_send, cd.L0(2131750442, null), false);
            } else {
                kVarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new dq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) cd.L0(2131750442, null));
                kVarArr[0].b(R.drawable.filled_gift_send, spannableStringBuilder, false);
            }
            ph.k kVar = kVarArr[1];
            if (!z10 && !z11) {
                f7 = 0.5f;
            }
            kVar.setAlpha(f7);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.V;
                if (arrayList != null) {
                    kVarArr[2].b(R.drawable.filled_gift_sell_off, cd.L0(2131750441, null), false);
                    kVarArr[2].setOnClickListener(onClickListener);
                } else {
                    kVarArr[2].b(R.drawable.filled_gift_sell_on, cd.L0(2131750455, null), false);
                    kVarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                kVarArr[2].b(R.drawable.filled_share, cd.L0(2131750447, null), false);
                kVarArr[2].setOnClickListener(this.U);
            }
            this.f0 = starGift.crafted;
            this.n.a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            p80VarArr[0].setTextSize(1, 14.0f);
            this.f0 = false;
            u71Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        h8.c1(this.d[0].getImageReceiver(), starGift, zs.q2);
        this.e[0] = (TL_stars.starGiftAttributeModel) e6.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.a0);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.s0;
            if (stargiftattributepatternArr[i10] == stargiftattributepattern) {
                return;
            }
            stargiftattributepatternArr[i10] = stargiftattributepattern;
            this.t0[i10].i(stargiftattributepattern.document, z10);
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.a0.d(0);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        LinearLayout[] linearLayoutArr = this.f;
        if (d) {
            return linearLayoutArr[0].getMeasuredHeight() + org.telegram.messenger.i0.L(160.0f) + org.telegram.messenger.i0.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.a0.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.i0.L(160.0f) + org.telegram.messenger.i0.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.a0.d(2)) {
            L = org.telegram.messenger.i0.L(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.a0.d(3)) {
                if (!this.a0.d(4)) {
                    return 0;
                }
                a3 a3Var = this.M;
                return a3Var.getMeasuredHeight() > 0 ? a3Var.getMeasuredHeight() : org.telegram.messenger.i0.L(550.0f);
            }
            L = org.telegram.messenger.i0.L(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + L;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        int L = org.telegram.messenger.i0.L(160.0f) + org.telegram.messenger.i0.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.a0.a(4) * (this.M.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : org.telegram.messenger.i0.L(550.0f))) + (this.a0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + org.telegram.messenger.i0.L(160.0f) + org.telegram.messenger.i0.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.a0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + org.telegram.messenger.i0.L(64.0f))) + (this.a0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.i0.L(160.0f) + org.telegram.messenger.i0.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.a0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f7 = this.v0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        return f7 > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public g9 getUpgradeImageView() {
        float f7 = this.v0;
        g9[] g9VarArr = this.d;
        return f7 > 0.5f ? g9VarArr[2] : g9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f7 = this.v0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        return f7 > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.s0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        this.r[i10].setText(charSequence);
        FrameLayout frameLayout = this.y;
        p80[] p80VarArr = this.D;
        p80 p80Var = this.s;
        TextView textView = this.w;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            p80Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                p80VarArr[i10].setVisibility(8);
            }
        } else if (i10 != 0 || TextUtils.isEmpty(charSequence3)) {
            p80VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                p80VarArr[i10].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            p80Var.setVisibility(8);
            textView.setVisibility(8);
        } else {
            p80Var.setText(charSequence3);
            p80Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                p80VarArr[i10].setVisibility(8);
            }
        }
        ph.m0[] m0VarArr = this.F;
        ph.m0 m0Var = m0VarArr[i10];
        if (m0Var != null) {
            m0Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
            m0VarArr[i10].setUser(tLObject);
            m0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        u71 u71Var = this.H;
        u71Var.setVisibility(0);
        ph.k[] kVarArr = this.I;
        kVarArr[0].setAlpha(1.0f);
        kVarArr[0].b(R.drawable.filled_gift_send, cd.L0(2131750442, null), false);
        kVarArr[0].setOnClickListener(onClickListener);
        int i10 = onClickListener2 != null ? 0 : 8;
        ph.k kVar = this.J;
        kVar.setVisibility(i10);
        kVar.setOnClickListener(onClickListener2);
        kVarArr[1].b(R.drawable.filled_crown_on, cd.L0(2131750434, null), false);
        kVarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) kVarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        kVarArr[2].setVisibility(8);
        u71Var.requestLayout();
    }

    public final void l() {
        p80[] p80VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        p80 p80Var;
        int i10;
        p80[] p80VarArr2 = this.r;
        if (p80VarArr2 == null || (p80VarArr = this.D) == null || (stargiftattributebackdropArr = this.b0) == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, this.a);
        for (int i11 = 0; i11 < 2; i11++) {
            p80 p80Var2 = p80VarArr2[i11];
            if (p80Var2 != null && p80VarArr[i11] != null) {
                p80Var2.setTextColor(stargiftattributebackdropArr[Math.min(1, i11)] == null ? w02 : -1);
                p80 p80Var3 = p80VarArr[i11];
                if (i11 == 0 || i11 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i11];
                    i10 = stargiftattributebackdrop == null ? w02 : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                    int i12 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                    i10 = i0.b.f(this.v0, i12, stargiftattributebackdrop3 == null ? w02 : (-16777216) | stargiftattributebackdrop3.text_color);
                }
                p80Var3.setTextColor(i10);
            }
        }
        if (p80VarArr.length <= 2 || (p80Var = p80VarArr[2]) == null) {
            return;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop4 != null) {
            w02 = stargiftattributebackdrop4.text_color | (-16777216);
        }
        p80Var.setTextColor(w02);
    }

    public final void m() {
        this.j0 = org.telegram.messenger.i0.N(33.33f) / org.telegram.messenger.i0.N(160.0f);
        float f7 = -this.b.getLeft();
        p80[] p80VarArr = this.r;
        this.h0 = ((((Math.min(p80VarArr[2].getPaint().measureText(p80VarArr[2].getText().toString()), p80VarArr[2].getWidth()) + p80VarArr[2].getWidth()) / 2.0f) + (p80VarArr[2].getX() + f7)) + org.telegram.messenger.i0.L(24.0f)) - (org.telegram.messenger.i0.L(126.67f) / 2.0f);
        this.i0 = (org.telegram.messenger.i0.L(124.0f) + (-r0.getTop())) - (org.telegram.messenger.i0.L(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.d5[] d5VarArr = this.t0;
        d5VarArr[0].a();
        d5VarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.d5[] d5VarArr = this.t0;
        d5VarArr[0].b();
        d5VarArr[1].b();
        org.telegram.messenger.i0.r(this.l0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.a0.b(2)) {
            m();
            d(this.a0);
        }
    }

    public void setPreviewAttributes(o0 o0Var) {
        f4.d dVar = this.a0;
        if (dVar != null && dVar.b == 1 && isAttachedToWindow()) {
            org.telegram.messenger.i0.r(this.l0);
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.k0 = null;
            }
            int i10 = 1 - this.u0;
            this.u0 = i10;
            g9[] g9VarArr = this.d;
            bi0 B = g9VarArr[2 - i10].getImageReceiver().B();
            bi0 B2 = g9VarArr[this.u0 + 1].getImageReceiver().B();
            if (B2 != null && B != null) {
                B2.T(false, B.t());
            }
            int i11 = this.u0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.a;
            this.b0[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, o0Var.b, true);
            int i12 = this.u0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            h8.b1(g9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.u0 + 1].document, zs.q2);
            a();
            float f7 = this.u0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
            this.k0 = ofFloat;
            ofFloat.addUpdateListener(new u3(this, 0));
            this.k0.addListener(new w3(this, 3));
            this.k0.setDuration(320L);
            this.k0.setInterpolator(gr.h);
            this.k0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.c0 = new com.google.android.gms.common.api.internal.r(e6.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.d0 = new com.google.android.gms.common.api.internal.r(e6.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.e0 = new com.google.android.gms.common.api.internal.r(e6.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.D[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.v0 = 0.0f;
        this.u0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.d0.c(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.c0.c();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        g9[] g9VarArr = this.d;
        h8.b1(g9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, zs.q2);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.e0.c();
        this.b0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.c0.f;
        h8.b1(g9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, zs.q2);
        ph.x1 x1Var = this.l0;
        org.telegram.messenger.i0.r(x1Var);
        org.telegram.messenger.i0.h3(x1Var, 2500L);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setResellPrice(sf.a aVar) {
        boolean z10;
        boolean z11;
        boolean k10 = aVar.k();
        this.N = !k10;
        p80[] p80VarArr = this.D;
        TextView textView = this.O;
        boolean z12 = true;
        if (k10) {
            z10 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).setListener(new w3(this, 2)).setListener(new w3(this, 1)).start();
            p80VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(grVar).start();
        } else {
            if (aVar.a == sf.b.b) {
                z11 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            int i10 = z11;
            Object[] objArr = new Object[i10];
            objArr[0] = h8.W0(z12, "⭐️ " + ((Object) h8.L0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f);
            textView.setText(cd.V(null, null, 2131749690, objArr));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b0[0];
            textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.g0 = i10;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            gr grVar2 = gr.h;
            duration2.setInterpolator(grVar2).setListener(new w3(this, 0)).start();
            p80VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(grVar2).start();
            z10 = i10;
        }
        boolean z13 = this.N;
        ph.k[] kVarArr = this.I;
        if (z13) {
            kVarArr[2].b(R.drawable.filled_gift_sell_off, cd.L0(2131750441, null), z10);
        } else {
            kVarArr[2].b(R.drawable.filled_gift_sell_on, cd.L0(2131750455, null), z10);
        }
        kVarArr[2].setOnClickListener(this.V);
    }

    public void setShowOptions(boolean z10) {
        this.S = z10;
        d(this.a0);
    }

    public void setWalletCard(boolean z10) {
        this.I[1].b(z10 ? R.drawable.filled_card_remove : R.drawable.filled_card_add, cd.L0(z10 ? 2131743128 : 2131743136, null), false);
    }

    public void setWalletDisplayed(boolean z10) {
        this.I[1].setAlpha(z10 ? 1.0f : 0.5f);
    }

    public void setWearPreview(TLObject tLObject) {
        String H;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = h20.p((TLRPC.User) tLObject);
            str = cd.L0(2131747842, null);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (org.telegram.messenger.w3.V(chat)) {
                int i10 = chat.participants_count;
                H = i10 > 1 ? cd.H(',', "Subscribers", i10) : cd.L0(2131751391, null);
            } else {
                int i11 = chat.participants_count;
                H = i11 > 1 ? cd.H(',', "Members", i11) : cd.L0(2131754876, null).toLowerCase();
            }
            str = H;
            str2 = str3;
        }
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        this.L.e(tLObject, r8Var);
        this.r[2].setText(str2);
        this.D[2].setText(str);
        m();
        d(this.a0);
    }

    public void k(int i10) {
    }
}
