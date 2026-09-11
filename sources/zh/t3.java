package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public class t3 extends FrameLayout {
    public final LinearLayout.LayoutParams[] E;
    public final yh.l0[] F;
    public final TextPaint G;
    public final cc1 H;
    public final sg.v0[] I;
    public final FrameLayout J;
    public final x9 K;
    public final x2 L;
    public boolean M;
    public final TextView N;
    public final ImageView O;
    public final ImageView P;
    public final ImageView Q;
    public final View.OnClickListener R;
    public final View.OnClickListener S;
    public final View.OnClickListener T;
    public f4.d U;
    public final TL_stars.starGiftAttributeBackdrop[] V;
    public com.google.android.gms.common.api.internal.r W;
    public final org.telegram.ui.ActionBar.f6 a;
    public com.google.android.gms.common.api.internal.r a0;
    public final FrameLayout b;
    public com.google.android.gms.common.api.internal.r b0;
    public final m3 c;
    public boolean c0;
    public final x9[] d;
    public boolean d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public float e0;
    public final LinearLayout[] f;
    public float f0;
    public float g0;
    public final FrameLayout.LayoutParams[] h;
    public ValueAnimator h0;
    public final m2 i0;
    public final Paint[] j0;
    public final RadialGradient[] k0;
    public final Matrix[] l0;
    public RadialGradient m0;
    public final yh.i1 n;
    public final Matrix n0;
    public final Paint o0;
    public final TL_stars.starGiftAttributePattern[] p0;
    public final org.telegram.ui.Components.o5[] q0;
    public final d90[] r;
    public int r0;
    public final d90 s;
    public float s0;
    public float t0;
    public ValueAnimator u0;
    public final TextView v;
    public final RectF v0;
    public int w;
    public h8 w0;
    public final FrameLayout x;
    public final int[] x0;
    public final d90[] y;
    public final int[] y0;
    public final int[] z0;

    public t3(Context context, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable, View.OnClickListener onClickListener, u0 u0Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f7;
        this.d = new x9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new d90[5];
        this.y = new d90[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new yh.l0[5];
        this.U = new f4.d(0, 0);
        this.V = new TL_stars.starGiftAttributeBackdrop[3];
        this.i0 = new m2(this, 4);
        this.j0 = new Paint[3];
        this.k0 = new RadialGradient[3];
        this.l0 = new Matrix[3];
        this.n0 = new Matrix();
        this.o0 = new Paint(1);
        this.p0 = new TL_stars.starGiftAttributePattern[2];
        this.q0 = new org.telegram.ui.Components.o5[2];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.j0;
            if (i10 >= paintArr.length) {
                break;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.o5[] o5VarArr = this.q0;
            if (i11 >= o5VarArr.length) {
                break;
            }
            o5VarArr[i11] = new org.telegram.ui.Components.o5(AndroidUtilities.dp(28.0f), this);
            i11++;
        }
        this.t0 = 1.0f;
        this.v0 = new RectF();
        this.x0 = new int[12];
        this.y0 = new int[12];
        this.z0 = new int[12];
        this.a = f6Var;
        this.R = onClickListener4;
        this.S = onClickListener5;
        this.T = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i12 = 0;
        while (true) {
            x9[] x9VarArr = this.d;
            float f10 = 0.0f;
            if (i12 >= x9VarArr.length) {
                break;
            }
            x9VarArr[i12] = new di.v3(context, 1);
            this.d[i12].setLayerNum(6660);
            if (i12 > 0) {
                this.d[i12].getImageReceiver().setCrossfadeDuration(1);
            }
            this.b.addView(this.d[i12], w7.x5.e(-1, -1, 119));
            x9 x9Var = this.d[i12];
            if (i12 == 0) {
                f10 = 1.0f;
            }
            x9Var.setAlpha(f10);
            i12++;
        }
        d90 d90Var = new d90(context, null);
        this.s = d90Var;
        d90Var.setTextSize(1, 12.0f);
        d90Var.setGravity(17);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        d90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new p3(this, 0));
        w7.z5.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.N = textView2;
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        w7.z5.a(textView2);
        cc1 cc1Var = new cc1(this, context, 19);
        this.H = cc1Var;
        cc1Var.setOrientation(0);
        this.I = new sg.v0[3];
        int i13 = 0;
        while (true) {
            sg.v0[] v0VarArr = this.I;
            if (i13 >= v0VarArr.length) {
                break;
            }
            sg.v0 v0Var = new sg.v0(context);
            ImageView imageView = new ImageView(context);
            v0Var.b = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            v0Var.addView(imageView, w7.x5.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            v0Var.c = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(17);
            v0Var.addView(textView3, w7.x5.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
            v0VarArr[i13] = v0Var;
            if (i13 == 0) {
                this.I[i13].a(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.I[i13].setOnClickListener(onClickListener2);
            } else if (i13 == 1) {
                this.I[i13].a(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.I[i13].setOnClickListener(onClickListener3);
            } else if (i13 == 2) {
                this.I[i13].a(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.I[i13].setOnClickListener(onClickListener4);
            }
            this.I[i13].setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
            w7.z5.b(this.I[i13], 0.075f, 1.5f);
            cc1 cc1Var2 = this.H;
            sg.v0[] v0VarArr2 = this.I;
            cc1Var2.addView(v0VarArr2[i13], w7.x5.p(0, 56, 1.0f, 119, 0, 0, i13 != v0VarArr2.length - 1 ? 11 : 0, 0));
            i13++;
        }
        this.x = new FrameLayout(context);
        int i14 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f;
            if (i14 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i14] = new LinearLayout(context);
            this.f[i14].setOrientation(1);
            if (i14 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.J = frameLayout;
                this.f[i14].addView(frameLayout, w7.x5.q(-1, 144, 119));
                x9 x9Var2 = new x9(context);
                this.K = x9Var2;
                x9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(x9Var2, w7.x5.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i14] = new d90(context, null);
                this.r[i14].setTextColor(-1);
                this.r[i14].setTextSize(1, 20.0f);
                this.r[i14].setTypeface(AndroidUtilities.bold());
                this.r[i14].setSingleLine();
                d90 d90Var2 = this.r[i14];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                d90Var2.setEllipsize(truncateAt);
                this.r[i14].setGravity(17);
                frameLayout.addView(this.r[i14], w7.x5.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.y[i14] = new d90(context, null);
                this.y[i14].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
                this.y[i14].setTextSize(1, 14.0f);
                this.y[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
                this.y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.y[i14].setDisablePaddingsOffsetY(true);
                this.y[i14].setSingleLine();
                this.y[i14].setGravity(17);
                this.y[i14].setEllipsize(truncateAt);
                frameLayout.addView(this.y[i14], w7.x5.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i14 == 4) {
                x2 x2Var = new x2(context, f6Var);
                this.L = x2Var;
                this.f[i14].addView(x2Var, w7.x5.n(-1, -2));
                View view = this.f[i14];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = w7.x5.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i14] = d;
                addView(view, d);
                i14++;
            } else {
                this.r[i14] = new d90(context, null);
                this.r[i14].setTextColor(i14 == 3 ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
                this.r[i14].setTextSize(1, 20.0f);
                this.r[i14].setTypeface(AndroidUtilities.bold());
                this.r[i14].setGravity(17);
                this.f[i14].addView(this.r[i14], w7.x5.t(-1, -2, 17, 24, i14 == 3 ? 10 : 0, 24, 0));
                if (i14 == 0) {
                    this.f[i14].addView(this.s, w7.x5.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i14].addView(this.v, w7.x5.s(-2, 17, 0, 6, 0, 19.33f, 2));
                }
                if (i14 == 0) {
                    this.y[i14] = new d90(context, null);
                    this.y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.j6.l1(0.75f, -1) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
                    this.y[i14].setTextSize(1, 14.0f);
                    this.y[i14].setGravity(17);
                    this.y[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
                    this.y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.y[i14].setDisablePaddingsOffsetY(true);
                    this.x.addView(this.y[i14], w7.x5.e(-2, -2, 17));
                    this.x.addView(this.N, w7.x5.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f[i14];
                    FrameLayout frameLayout2 = this.x;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                    LinearLayout.LayoutParams t10 = w7.x5.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr2[i14] = t10;
                    linearLayout.addView(frameLayout2, t10);
                } else {
                    this.y[i14] = new d90(context, null);
                    this.y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.j6.l1(0.75f, -1) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
                    this.y[i14].setTextSize(1, 14.0f);
                    this.y[i14].setGravity(17);
                    this.y[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
                    this.y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.y[i14].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i14];
                    d90 d90Var3 = this.y[i14];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                    LinearLayout.LayoutParams t11 = w7.x5.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr3[i14] = t11;
                    linearLayout2.addView(d90Var3, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.E[i14];
                if (i14 == 3) {
                    f7 = 6.0f;
                } else {
                    f7 = (i14 == 1 ? 7.33f : this.V[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f7);
                this.F[i14] = new yh.l0(context);
                this.F[i14].setVisibility(8);
                this.F[i14].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                if (i14 == 0) {
                    this.G = this.F[i14].getTextPaint();
                }
                this.f[i14].addView(this.F[i14], w7.x5.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i14 == 0) {
                this.f[i14].addView(this.H, w7.x5.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i14];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d10 = w7.x5.d(-1, -2.0f, 119, 16.0f, i14 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i14] = d10;
            addView(view2, d10);
            i14++;
        }
        addView(this.b, w7.x5.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        m3 m3Var = new m3(context);
        this.c = m3Var;
        addView(m3Var, w7.x5.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(28.0f), 620756991));
        imageView2.setImageResource(R.drawable.msg_close);
        w7.z5.a(imageView2);
        addView(imageView2, w7.x5.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView2.setOnClickListener(new ci.o(6, runnable));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        w7.z5.a(imageView3);
        if (u0Var != null) {
            addView(imageView3, w7.x5.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView3.setOnClickListener(u0Var);
        }
        imageView3.setVisibility(8);
        ImageView imageView4 = new ImageView(context);
        this.Q = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView4.setImageResource(R.drawable.media_more);
        imageView4.setScaleType(scaleType);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        w7.z5.a(imageView4);
        addView(imageView4, w7.x5.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView4.setOnClickListener(onClickListener);
        imageView4.setVisibility(8);
        yh.i1 i1Var = new yh.i1(context);
        this.n = i1Var;
        i1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        yh.k1 k1Var = i1Var.a;
        if (k1Var.f == null) {
            h8 h8Var = new h8(2, 12);
            k1Var.f = h8Var;
            h8Var.h = 5.0f;
        }
        Path path = k1Var.c;
        float f11 = k1Var.e;
        k1Var.g = true;
        yh.k1.c(path, f11, true);
        i1Var.setScaleX(1.2f);
        i1Var.setScaleY(1.2f);
        addView(i1Var, w7.x5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        i1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.u0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 1));
        this.u0.addListener(new r3(this, 4));
        this.u0.setDuration(320L);
        this.u0.setInterpolator(pr.g);
        this.u0.start();
    }

    public final int b(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10 = this.r0;
        RadialGradient[] radialGradientArr = this.k0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        Matrix[] matrixArr = this.l0;
        Paint[] paintArr = this.j0;
        int i11 = 0;
        if (i10 != 0) {
            if (this.s0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) (this.U.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f7, f10);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
            }
            if (this.s0 <= 0.0f || stargiftattributebackdropArr[2] == null) {
                return i11;
            }
            paintArr[2].setAlpha((int) (this.U.a(1) * 255.0f * this.s0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        if (this.s0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.U.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
        }
        if (this.s0 >= 1.0f || stargiftattributebackdropArr[1] == null) {
            return i11;
        }
        paintArr[1].setAlpha((int) ((1.0f - this.s0) * this.U.a(1) * 255.0f));
        matrixArr[1].reset();
        matrixArr[1].postTranslate(f7, f10);
        radialGradientArr[1].setLocalMatrix(matrixArr[1]);
        canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[1];
        return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.translate(f7, f10);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i10 = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int d = i0.a.d(this.s0, i10, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        org.telegram.ui.Components.o5[] o5VarArr = this.q0;
        o5VarArr[1].k(Integer.valueOf(d));
        j0.a(canvas, 0, o5VarArr[1], f11, f12, this.U.a(1), this.t0);
        canvas.restore();
    }

    public void d(f4.d dVar) {
        View[] viewArr;
        d90[] d90VarArr;
        float a2;
        int i10;
        boolean z10;
        this.U = dVar;
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? dVar.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? dVar.a(1) : 0.0f);
        ImageView imageView = this.O;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || dVar.b != 2) && (stargiftattributebackdropArr[1] == null || dVar.b != 1)) ? 8 : 0);
        boolean z11 = stargiftattributebackdropArr[0] != null;
        float a11 = dVar.a(0);
        int i12 = dVar.b;
        float lerp = AndroidUtilities.lerp(false, z11, a11);
        ImageView imageView2 = this.Q;
        imageView2.setAlpha(lerp);
        imageView2.setVisibility((stargiftattributebackdropArr[0] == null || i12 != 0) ? 8 : 0);
        if (!this.d0) {
            float lerp2 = AndroidUtilities.lerp(false, this.M, dVar.a(0));
            TextView textView = this.N;
            textView.setAlpha(lerp2);
            textView.setScaleX(AndroidUtilities.lerp(0.4f, this.M ? 1.0f : 0.4f, dVar.a(0)));
            textView.setScaleY(AndroidUtilities.lerp(0.4f, this.M ? 1.0f : 0.4f, dVar.a(0)));
            textView.setVisibility((this.M && i12 == 0) ? 0 : 4);
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, this.a);
        int i13 = 0;
        while (true) {
            d90VarArr = this.y;
            if (i13 >= 2) {
                break;
            }
            this.r[i13].setTextColor(stargiftattributebackdropArr[Math.min(1, i13)] == null ? v02 : -1);
            d90 d90Var = d90VarArr[i13];
            if (i13 == 0 || i13 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i13];
                i10 = stargiftattributebackdrop == null ? v02 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i14 = stargiftattributebackdrop2 == null ? v02 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i10 = i0.a.d(this.s0, i14, stargiftattributebackdrop3 == null ? v02 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            d90Var.setTextColor(i10);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i13];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                z10 = (AndroidUtilities.dp(184.0f) == layoutParamsArr[i13].topMargin && viewArr[i13].getPaddingBottom() == AndroidUtilities.dp(18.0f)) ? false : true;
                if (z10) {
                    viewArr[i13].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                    layoutParamsArr[i13].topMargin = AndroidUtilities.dp(184.0f);
                }
            } else {
                z10 = (AndroidUtilities.dp(170.0f) == layoutParamsArr[i13].topMargin && viewArr[i13].getPaddingBottom() == AndroidUtilities.dp(3.0f)) ? false : true;
                if (z10) {
                    viewArr[i13].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    layoutParamsArr[i13].topMargin = AndroidUtilities.dp(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
            layoutParamsArr2[i13].topMargin = AndroidUtilities.dp((i13 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z10) {
                viewArr[i13].setLayoutParams(layoutParamsArr[i13]);
                if (i13 == 0) {
                    this.x.setLayoutParams(layoutParamsArr2[i13]);
                } else {
                    d90VarArr[i13].setLayoutParams(layoutParamsArr2[i13]);
                }
            }
            i13++;
        }
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.v.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, stargiftattributebackdrop5 == null ? 553648127 : i0.a.d(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        d90 d90Var2 = d90VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            v02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        d90Var2.setTextColor(v02);
        x9[] x9VarArr = this.d;
        x9 x9Var = x9VarArr[0];
        f4.d dVar2 = this.U;
        x9Var.setAlpha(Math.max((dVar2.b(0) && dVar2.b(2)) ? 1.0f : Math.max(dVar2.a(0), dVar2.a(2)), this.U.a(3)));
        x9VarArr[1].setAlpha((1.0f - this.s0) * dVar.a(1));
        x9VarArr[2].setAlpha(dVar.a(1) * this.s0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.g0, dVar.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.g0, dVar.a(2)));
        frameLayout.setTranslationX(dVar.a(2) * this.e0);
        frameLayout.setTranslationY((dVar.a(2) * this.f0) + (dVar.a(1) * AndroidUtilities.dp(16.0f)));
        View view = viewArr[2];
        int i15 = dVar.a;
        if (i15 == 2 && i12 == 2) {
            a2 = 0.0f;
        } else {
            if (i15 != 2) {
                i12 = i15;
            }
            a2 = (1.0f - dVar.a(2)) * (-(viewArr[i12].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view.setTranslationY(a2);
        int i16 = (this.c0 && this.U.b(0)) ? 0 : 8;
        yh.i1 i1Var = this.n;
        i1Var.setVisibility(i16);
        i1Var.setAlpha(this.U.a(0));
        int i17 = dVar.a(4) <= 0.0f ? 8 : 0;
        x2 x2Var = this.L;
        x2Var.setVisibility(i17);
        x2Var.setAlpha(dVar.a(4));
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
        int[] iArr3;
        float f12;
        t3 t3Var;
        Canvas canvas2;
        m3 m3Var;
        float realHeight = getRealHeight();
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.U.a(1));
        f4.d dVar = this.U;
        float max = ((dVar.b(0) && dVar.b(2)) || (dVar.b(2) && dVar.b(3)) || (dVar.b(3) && dVar.b(0))) ? 1.0f : Math.max(dVar.a(0), Math.max(dVar.a(2), dVar.a(3)));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.V;
        if (max <= 0.0f || stargiftattributebackdropArr2[0] == null) {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        } else {
            if (this.m0 == null || this.U.a(2) < 1.0f) {
                Paint[] paintArr = this.j0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.l0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.k0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            } else {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            }
            if (this.m0 != null && this.U.a(2) > 0.0f) {
                int a2 = (int) (this.U.a(2) * 255.0f);
                Paint paint = this.o0;
                paint.setAlpha(a2);
                Matrix matrix = this.n0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.m0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        }
        if (this.U.a(1) > 0.0f) {
            f7 = width;
            f10 = dp;
            j(b(canvas, f7, f10, getWidth(), realHeight));
        } else {
            f7 = width;
            f10 = dp;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.z0;
        int[] iArr5 = this.y0;
        int[] iArr6 = this.x0;
        if (stargiftattributebackdrop != null) {
            for (int i10 = 0; i10 < iArr6.length; i10++) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i10] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i10] = i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i10] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
            }
        }
        m3 m3Var2 = this.c;
        if (m3Var2.s == null && m3Var2.v == null && m3Var2.w == null) {
            t3Var = this;
            f12 = f7;
            f11 = f10;
            iArr3 = iArr4;
            iArr = iArr5;
            iArr2 = iArr6;
            m3Var = m3Var2;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f13 = f7;
            g3 g3Var = m3Var2.s;
            float f14 = f10;
            float f15 = m3Var2.x;
            int[] iArr7 = this.y0;
            int[] iArr8 = this.x0;
            int[] iArr9 = this.z0;
            f11 = f14;
            iArr = iArr5;
            iArr2 = iArr6;
            iArr3 = iArr4;
            f12 = f13;
            t3Var = this;
            canvas2 = canvas;
            m3Var2.a(canvas2, g3Var, f15, width2, realHeight, iArr7, iArr8, iArr9);
            m3Var2.a(canvas2, m3Var2.v, m3Var2.y, width2, realHeight, iArr7, iArr8, iArr9);
            m3Var2.a(canvas2, m3Var2.w, m3Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            m3Var = m3Var2;
            t3Var.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i11 = iArr3[iArr3.length / 2];
            f4.d dVar2 = t3Var.U;
            float max2 = (dVar2.b(0) && dVar2.b(3)) ? 1.0f : Math.max(dVar2.a(0), dVar2.a(3));
            org.telegram.ui.Components.o5[] o5VarArr = t3Var.q0;
            if (max2 > 0.0f) {
                canvas2.save();
                canvas2.translate(f12, f11);
                o5VarArr[0].k(Integer.valueOf(i11));
                j0.a(canvas, 0, o5VarArr[0], t3Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (t3Var.U.a(2) > 0.0f) {
                canvas.save();
                o5VarArr[0].k(Integer.valueOf(i11));
                float f16 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = t3Var.f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = t3Var.J;
                float x11 = frameLayout.getX() + x10;
                x9 x9Var = t3Var.K;
                rectF.set(x9Var.getX() + x11, x9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), x9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + x9Var.getWidth(), x9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + x9Var.getHeight());
                j0.c(canvas, o5VarArr[0], t3Var.getWidth(), f16 * 0.7f, 1.0f, rectF, t3Var.U.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            sg.v0[] v0VarArr = t3Var.I;
            int length = v0VarArr.length;
            int i12 = 0;
            while (i12 < length) {
                sg.v0 v0Var = v0VarArr[i12];
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.j6.B1(v0Var.getBackground(), iArr10[Utilities.clamp(Math.round((((v0Var.getWidth() / 2.0f) + v0Var.getX()) / t3Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    v0Var.invalidate();
                }
                i12++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i13 = iArr11[iArr11.length / 2];
            int i14 = iArr12[iArr12.length / 2];
            TextView textView = t3Var.v;
            if (textView != null && t3Var.w != i13) {
                t3Var.w = i13;
                textView.setTextColor(i13);
                org.telegram.ui.ActionBar.j6.B1(textView.getBackground(), i14, false);
            }
            if (m3Var.s != null || m3Var.v != null || m3Var.w != null) {
                t3Var.y[0].setTextColor(i13);
            }
            if (t3Var.U.a(2) > 0.0f) {
                if (t3Var.w0 == null) {
                    t3Var.w0 = new h8(1, 12);
                }
                FrameLayout frameLayout2 = t3Var.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / 2.0f) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / 2.0f;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / 2.0f) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / 2.0f;
                float f17 = measuredHeight + scaleY;
                RectF rectF2 = t3Var.v0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f17);
                t3Var.w0.g(rectF2);
                t3Var.w0.d();
                t3Var.w0.a(canvas2, org.telegram.ui.ActionBar.j6.l1(t3Var.U.a(2), -1));
                t3Var.invalidate();
            }
        }
        if (t3Var.U.a(1) > 0.0f) {
            t3Var.c(canvas2, f12, f11, t3Var.getWidth(), t3Var.getRealHeight());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i10, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.k0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.m0 = radialGradient2;
            this.o0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.l0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.j0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        this.M = false;
        int i10 = 1;
        boolean z13 = z10 || z11;
        boolean z14 = starGift instanceof TL_stars.TL_starGiftUnique;
        cc1 cc1Var = this.H;
        d90[] d90VarArr = this.y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        if (z14) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) s5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) s5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            d90VarArr[0].setTextSize(1, 13.0f);
            cc1Var.setVisibility(z13 ? 0 : 8);
            sg.v0[] v0VarArr = this.I;
            if (z13) {
                v0VarArr[1].a(z12 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z12 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), false);
            }
            float f7 = 1.0f;
            if (starGift.resell_amount != null) {
                this.M = true;
                boolean z15 = starGift.resale_ton_only;
                zf.b bVar = zf.b.b;
                zf.a resellAmount = starGift.getResellAmount(z15 ? bVar : zf.b.a);
                CharSequence formatSpannable = LocaleController.formatSpannable(R.string.GiftOnSale, v7.S0("⭐️ " + ((Object) v7.J0(resellAmount.o(), 1.0f, ',')), resellAmount.a == bVar), Float.valueOf(0.9f));
                TextView textView = this.N;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (w3.N1(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new p3(this, i10));
                    w7.z5.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                v0VarArr[0].setAlpha(1.0f);
                v0VarArr[0].a(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                v0VarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new nq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                v0VarArr[0].a(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
            }
            sg.v0 v0Var = v0VarArr[1];
            if (!z10 && !z11) {
                f7 = 0.5f;
            }
            v0Var.setAlpha(f7);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.S;
                if (arrayList != null) {
                    v0VarArr[2].a(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    v0VarArr[2].setOnClickListener(onClickListener);
                } else {
                    v0VarArr[2].a(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    v0VarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                v0VarArr[2].a(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                v0VarArr[2].setOnClickListener(this.R);
            }
            this.c0 = starGift.crafted;
            this.n.a.d(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            d90VarArr[0].setTextSize(1, 14.0f);
            this.c0 = false;
            cc1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        v7.a1(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) s5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.U);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.p0;
            if (stargiftattributepatternArr[i10] == stargiftattributepattern) {
                return;
            }
            stargiftattributepatternArr[i10] = stargiftattributepattern;
            this.q0[i10].i(stargiftattributepattern.document, z10);
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.U.d(0);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        LinearLayout[] linearLayoutArr = this.f;
        if (d) {
            return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.U.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.U.d(2)) {
            dp = AndroidUtilities.dp(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.U.d(3)) {
                if (!this.U.d(4)) {
                    return 0;
                }
                x2 x2Var = this.L;
                return x2Var.getMeasuredHeight() > 0 ? x2Var.getMeasuredHeight() : AndroidUtilities.dp(550.0f);
            }
            dp = AndroidUtilities.dp(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + dp;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        int dp = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.U.a(4) * (this.L.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : AndroidUtilities.dp(550.0f))) + (this.U.a(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.U.a(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.U.a(1) * (linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.U.a(0) * (linearLayoutArr[0].getMeasuredHeight() + dp)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f7 = this.s0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        return f7 > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public x9 getUpgradeImageView() {
        float f7 = this.s0;
        x9[] x9VarArr = this.d;
        return f7 > 0.5f ? x9VarArr[2] : x9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f7 = this.s0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        return f7 > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.p0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        this.r[i10].setText(charSequence);
        FrameLayout frameLayout = this.x;
        d90[] d90VarArr = this.y;
        d90 d90Var = this.s;
        TextView textView = this.v;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            d90Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                d90VarArr[i10].setVisibility(8);
            }
        } else if (i10 != 0 || TextUtils.isEmpty(charSequence3)) {
            d90VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                d90VarArr[i10].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            d90Var.setVisibility(8);
            textView.setVisibility(8);
        } else {
            d90Var.setText(charSequence3);
            d90Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                d90VarArr[i10].setVisibility(8);
            }
        }
        yh.l0[] l0VarArr = this.F;
        yh.l0 l0Var = l0VarArr[i10];
        if (l0Var != null) {
            l0Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
            l0VarArr[i10].setUser(tLObject);
            l0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void k() {
        this.g0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        float f7 = -this.b.getLeft();
        d90[] d90VarArr = this.r;
        this.e0 = ((((Math.min(d90VarArr[2].getPaint().measureText(d90VarArr[2].getText().toString()), d90VarArr[2].getWidth()) + d90VarArr[2].getWidth()) / 2.0f) + (d90VarArr[2].getX() + f7)) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.f0 = (AndroidUtilities.dp(124.0f) + (-r0.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.o5[] o5VarArr = this.q0;
        o5VarArr[0].a();
        o5VarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o5[] o5VarArr = this.q0;
        o5VarArr[0].b();
        o5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.i0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.U.b(2)) {
            k();
            d(this.U);
        }
    }

    public void setPreviewAttributes(o0 o0Var) {
        f4.d dVar = this.U;
        if (dVar != null && dVar.b == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.i0);
            ValueAnimator valueAnimator = this.h0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h0 = null;
            }
            int i10 = 1 - this.r0;
            this.r0 = i10;
            x9[] x9VarArr = this.d;
            xi0 lottieAnimation = x9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            xi0 lottieAnimation2 = x9VarArr[this.r0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.Q(lottieAnimation.r(), false);
            }
            int i11 = this.r0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.a;
            this.V[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, o0Var.b, true);
            int i12 = this.r0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            v7.Z0(x9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.r0 + 1].document, 160);
            a();
            float f7 = this.r0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
            this.h0 = ofFloat;
            ofFloat.addUpdateListener(new q3(this, 0));
            this.h0.addListener(new r3(this, 3));
            this.h0.setDuration(320L);
            this.h0.setInterpolator(pr.h);
            this.h0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.W = new com.google.android.gms.common.api.internal.r(s5.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.a0 = new com.google.android.gms.common.api.internal.r(s5.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.b0 = new com.google.android.gms.common.api.internal.r(s5.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.y[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.s0 = 0.0f;
        this.r0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.a0.c(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.W.c();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        x9[] x9VarArr = this.d;
        v7.Z0(x9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.b0.c();
        this.V[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.W.f;
        v7.Z0(x9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        m2 m2Var = this.i0;
        AndroidUtilities.cancelRunOnUIThread(m2Var);
        AndroidUtilities.runOnUIThread(m2Var, 2500L);
        invalidate();
    }

    public void setResellPrice(zf.a aVar) {
        boolean k10 = aVar.k();
        this.M = !k10;
        d90[] d90VarArr = this.y;
        TextView textView = this.N;
        if (k10) {
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).setListener(new r3(this, 2)).setListener(new r3(this, 1)).start();
            d90VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(prVar).start();
        } else {
            textView.setText(LocaleController.formatSpannable(R.string.GiftOnSale, v7.U0(aVar.a == zf.b.b, "⭐️ " + ((Object) v7.J0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.V[0];
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.d0 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            pr prVar2 = pr.h;
            duration2.setInterpolator(prVar2).setListener(new r3(this, 0)).start();
            d90VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(prVar2).start();
        }
        boolean z10 = this.M;
        sg.v0[] v0VarArr = this.I;
        if (z10) {
            v0VarArr[2].a(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            v0VarArr[2].a(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        v0VarArr[2].setOnClickListener(this.S);
    }

    public void setWearPreview(TLObject tLObject) {
        String formatPluralStringComma;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = UserObject.getUserName((TLRPC.User) tLObject);
            str = LocaleController.getString(R.string.Online);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                int i10 = chat.participants_count;
                formatPluralStringComma = i10 > 1 ? LocaleController.formatPluralStringComma("Subscribers", i10) : LocaleController.getString(R.string.DiscussChannel);
            } else {
                int i11 = chat.participants_count;
                formatPluralStringComma = i11 > 1 ? LocaleController.formatPluralStringComma("Members", i11) : LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
            }
            str = formatPluralStringComma;
            str2 = str3;
        }
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.p(tLObject);
        this.K.e(tLObject, i9Var);
        this.r[2].setText(str2);
        this.y[2].setText(str);
        k();
        d(this.U);
    }

    public void j(int i10) {
    }
}
