package yh;

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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public class p3 extends FrameLayout {
    public final LinearLayout.LayoutParams[] E;
    public final xh.n0[] F;
    public final TextPaint G;
    public final dc1 H;
    public final xh.m[] I;
    public final FrameLayout J;
    public final y9 K;
    public final t2 L;
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
    public final org.telegram.ui.ActionBar.e6 a;
    public com.google.android.gms.common.api.internal.r a0;
    public final FrameLayout b;
    public com.google.android.gms.common.api.internal.r b0;
    public final i3 c;
    public boolean c0;
    public final y9[] d;
    public boolean d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public float e0;
    public final LinearLayout[] f;
    public float f0;
    public float g0;
    public final FrameLayout.LayoutParams[] h;
    public ValueAnimator h0;
    public final f0 i0;
    public final Paint[] j0;
    public final RadialGradient[] k0;
    public final Matrix[] l0;
    public RadialGradient m0;
    public final xh.k1 n;
    public final Matrix n0;
    public final Paint o0;
    public final TL_stars.starGiftAttributePattern[] p0;
    public final org.telegram.ui.Components.q5[] q0;
    public final ea0[] r;
    public int r0;
    public final ea0 s;
    public float s0;
    public float t0;
    public ValueAnimator u0;
    public final TextView v;
    public final RectF v0;
    public int w;
    public b8 w0;
    public final FrameLayout x;
    public final int[] x0;
    public final ea0[] y;
    public final int[] y0;
    public final int[] z0;

    public p3(Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, View.OnClickListener onClickListener, t0 t0Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f7;
        float f10;
        int i10;
        float f11;
        this.d = new y9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new ea0[5];
        this.y = new ea0[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new xh.n0[5];
        int i11 = 0;
        this.U = new f4.d(0, 0);
        this.V = new TL_stars.starGiftAttributeBackdrop[3];
        this.i0 = new f0(this, 6);
        this.j0 = new Paint[3];
        this.k0 = new RadialGradient[3];
        this.l0 = new Matrix[3];
        this.n0 = new Matrix();
        this.o0 = new Paint(1);
        this.p0 = new TL_stars.starGiftAttributePattern[2];
        this.q0 = new org.telegram.ui.Components.q5[2];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = this.j0;
            if (i12 >= paintArr.length) {
                break;
            }
            paintArr[i12] = new Paint(1);
            i12++;
        }
        int i13 = 0;
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr = this.q0;
            f7 = 28.0f;
            if (i13 >= q5VarArr.length) {
                break;
            }
            q5VarArr[i13] = new org.telegram.ui.Components.q5(AndroidUtilities.dp(28.0f), this);
            i13++;
        }
        this.t0 = 1.0f;
        this.v0 = new RectF();
        this.x0 = new int[12];
        this.y0 = new int[12];
        this.z0 = new int[12];
        this.a = e6Var;
        this.R = onClickListener4;
        this.S = onClickListener5;
        this.T = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i14 = 0;
        while (true) {
            y9[] y9VarArr = this.d;
            float f12 = 0.0f;
            f10 = f7;
            if (i14 >= y9VarArr.length) {
                break;
            }
            y9VarArr[i14] = new ci.t3(context, 1);
            this.d[i14].setLayerNum(6660);
            if (i14 > 0) {
                this.d[i14].getImageReceiver().setCrossfadeDuration(1);
            }
            this.b.addView(this.d[i14], w7.x5.e(-1, -1, 119));
            y9 y9Var = this.d[i14];
            if (i14 == 0) {
                f12 = 1.0f;
            }
            y9Var.setAlpha(f12);
            i14++;
            f7 = f10;
        }
        ea0 ea0Var = new ea0(context, null);
        this.s = ea0Var;
        ea0Var.setTextSize(1, 12.0f);
        ea0Var.setGravity(17);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        ea0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new l3(this, 0));
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
        dc1 dc1Var = new dc1(this, context, 19);
        this.H = dc1Var;
        dc1Var.setOrientation(0);
        this.I = new xh.m[3];
        int i15 = 0;
        while (true) {
            xh.m[] mVarArr = this.I;
            if (i15 >= mVarArr.length) {
                break;
            }
            xh.m mVar = new xh.m(context);
            ImageView imageView = new ImageView(context);
            mVar.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mVar.addView(imageView, w7.x5.a(24.0f, 0.0f, 8.0f, 0.0f, 0.0f, 24, 49));
            TextView textView3 = new TextView(context);
            mVar.b = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(17);
            mVar.addView(textView3, w7.x5.a(-2.0f, 4.0f, 35.0f, 4.0f, 0.0f, -1, 49));
            mVarArr[i15] = mVar;
            if (i15 == 0) {
                this.I[i15].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.I[i15].setOnClickListener(onClickListener2);
            } else if (i15 == 1) {
                this.I[i15].b(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.I[i15].setOnClickListener(onClickListener3);
            } else if (i15 == 2) {
                this.I[i15].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.I[i15].setOnClickListener(onClickListener4);
            }
            this.I[i15].setBackground(org.telegram.ui.ActionBar.i6.a0(0, 285212671, 16, 16));
            w7.z5.b(this.I[i15], 0.075f, 1.5f);
            dc1 dc1Var2 = this.H;
            xh.m[] mVarArr2 = this.I;
            dc1Var2.addView(mVarArr2[i15], w7.x5.p(0, 56, 1.0f, 119, 0, 0, i15 != mVarArr2.length - 1 ? 11 : 0, 0));
            i15++;
        }
        this.x = new FrameLayout(context);
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
                this.J = frameLayout;
                this.f[i16].addView(frameLayout, w7.x5.q(-1, 144, 119));
                y9 y9Var2 = new y9(context);
                this.K = y9Var2;
                y9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(y9Var2, w7.x5.a(82.0f, 0.0f, 2.0f, 0.0f, 0.0f, 82, 49));
                i10 = i11;
                this.r[i16] = new ea0(context, null);
                this.r[i16].setTextColor(-1);
                this.r[i16].setTextSize(1, 20.0f);
                this.r[i16].setTypeface(AndroidUtilities.bold());
                this.r[i16].setSingleLine();
                ea0 ea0Var2 = this.r[i16];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                ea0Var2.setEllipsize(truncateAt);
                this.r[i16].setGravity(17);
                frameLayout.addView(this.r[i16], w7.x5.a(-2.0f, 16.0f, 95.33f, 16.0f, 0.0f, -1, 49));
                this.y[i16] = new ea0(context, null);
                this.y[i16].setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
                this.y[i16].setTextSize(1, 14.0f);
                this.y[i16].setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
                this.y[i16].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.y[i16].setDisablePaddingsOffsetY(true);
                this.y[i16].setSingleLine();
                this.y[i16].setGravity(17);
                this.y[i16].setEllipsize(truncateAt);
                frameLayout.addView(this.y[i16], w7.x5.a(-2.0f, 16.0f, 122.0f, 16.0f, 0.0f, -1, 49));
            } else {
                i10 = i11;
                if (i16 == 4) {
                    t2 t2Var = new t2(context, e6Var);
                    this.L = t2Var;
                    this.f[i16].addView(t2Var, w7.x5.n(-1, -2));
                    View view = this.f[i16];
                    FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                    ViewGroup.LayoutParams a2 = w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119);
                    layoutParamsArr[i16] = a2;
                    addView(view, a2);
                    i16++;
                    i11 = i10;
                } else {
                    this.r[i16] = new ea0(context, null);
                    this.r[i16].setTextColor(i16 == 3 ? -1 : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
                    this.r[i16].setTextSize(1, 20.0f);
                    this.r[i16].setTypeface(AndroidUtilities.bold());
                    this.r[i16].setGravity(17);
                    this.f[i16].addView(this.r[i16], w7.x5.t(-1, -2, 17, 24, i16 == 3 ? 10 : i10, 24, 0));
                    if (i16 == 0) {
                        this.f[i16].addView(this.s, w7.x5.t(-2, -2, 17, 0, 4, 0, 4));
                        this.f[i16].addView(this.v, w7.x5.s(-2, 17, 0, 6, 0, 19.33f, 2));
                    }
                    if (i16 == 0) {
                        this.y[i16] = new ea0(context, null);
                        this.y[i16].setTextColor(i16 == 3 ? org.telegram.ui.ActionBar.i6.m1(0.75f, -1) : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
                        this.y[i16].setTextSize(1, 14.0f);
                        this.y[i16].setGravity(17);
                        this.y[i16].setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
                        this.y[i16].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.y[i16].setDisablePaddingsOffsetY(true);
                        this.x.addView(this.y[i16], w7.x5.e(-2, -2, 17));
                        this.x.addView(this.N, w7.x5.b(-2.0f, 20.33f, 17));
                        LinearLayout linearLayout = this.f[i16];
                        FrameLayout frameLayout2 = this.x;
                        LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                        LinearLayout.LayoutParams t10 = w7.x5.t(-1, -2, 17, 24, 0, 24, i16 == 3 ? 6 : i10);
                        layoutParamsArr2[i16] = t10;
                        linearLayout.addView(frameLayout2, t10);
                    } else {
                        this.y[i16] = new ea0(context, null);
                        this.y[i16].setTextColor(i16 == 3 ? org.telegram.ui.ActionBar.i6.m1(0.75f, -1) : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
                        this.y[i16].setTextSize(1, 14.0f);
                        this.y[i16].setGravity(17);
                        this.y[i16].setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
                        this.y[i16].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.y[i16].setDisablePaddingsOffsetY(true);
                        LinearLayout linearLayout2 = this.f[i16];
                        ea0 ea0Var3 = this.y[i16];
                        LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                        LinearLayout.LayoutParams t11 = w7.x5.t(-1, -2, 17, 24, 0, 24, i16 == 3 ? 6 : i10);
                        layoutParamsArr3[i16] = t11;
                        linearLayout2.addView(ea0Var3, t11);
                    }
                    LinearLayout.LayoutParams layoutParams = this.E[i16];
                    if (i16 == 3) {
                        f11 = 6.0f;
                    } else {
                        f11 = (i16 == 1 ? 7.33f : this.V[i10] == null ? 9.0f : 5.66f) - 4.0f;
                    }
                    layoutParams.topMargin = AndroidUtilities.dp(f11);
                    this.F[i16] = new xh.n0(context);
                    this.F[i16].setVisibility(8);
                    this.F[i16].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                    if (i16 == 0) {
                        this.G = this.F[i16].getTextPaint();
                    }
                    this.f[i16].addView(this.F[i16], w7.x5.t(-1, -2, 17, 24, 8, 24, 0));
                }
            }
            if (i16 == 0) {
                this.f[i16].addView(this.H, w7.x5.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i16];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams a10 = w7.x5.a(-2.0f, 16.0f, i16 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f, -1, 119);
            layoutParamsArr4[i16] = a10;
            addView(view2, a10);
            i16++;
            i11 = i10;
        }
        addView(this.b, w7.x5.a(160.0f, 0.0f, 8.0f, 0.0f, 0.0f, 160, 49));
        i3 i3Var = new i3(context);
        this.c = i3Var;
        addView(i3Var, w7.x5.a(160.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 55));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(f10), 620756991));
        imageView2.setImageResource(R.drawable.msg_close);
        w7.z5.a(imageView2);
        addView(imageView2, w7.x5.a(28.0f, 0.0f, 12.0f, 12.0f, 0.0f, 28, 53));
        imageView2.setOnClickListener(new bi.p(6, runnable));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.i6.g0(553648127, 1, -1));
        w7.z5.a(imageView3);
        if (t0Var != null) {
            addView(imageView3, w7.x5.a(42.0f, 0.0f, 5.0f, 47.0f, 0.0f, 42, 53));
            imageView3.setOnClickListener(t0Var);
        }
        imageView3.setVisibility(8);
        ImageView imageView4 = new ImageView(context);
        this.Q = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView4.setImageResource(R.drawable.media_more);
        imageView4.setScaleType(scaleType);
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.g0(553648127, 1, -1));
        w7.z5.a(imageView4);
        addView(imageView4, w7.x5.a(42.0f, 0.0f, 5.0f, 5.0f, 0.0f, 42, 53));
        imageView4.setOnClickListener(onClickListener);
        imageView4.setVisibility(8);
        xh.k1 k1Var = new xh.k1(context);
        this.n = k1Var;
        k1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        xh.m1 m1Var = k1Var.a;
        if (m1Var.v == null) {
            b8 b8Var = new b8(2, 12);
            m1Var.v = b8Var;
            b8Var.h = 5.0f;
        }
        Path path = m1Var.f;
        float f13 = m1Var.s;
        m1Var.w = true;
        xh.m1.d(path, f13, true);
        k1Var.setScaleX(1.2f);
        k1Var.setScaleY(1.2f);
        addView(k1Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 51));
        k1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.u0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new m3(this, 1));
        this.u0.addListener(new n3(this, 4));
        this.u0.setDuration(320L);
        this.u0.setInterpolator(hs.g);
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
        org.telegram.ui.Components.q5[] q5VarArr = this.q0;
        q5VarArr[1].k(Integer.valueOf(d));
        i0.a(canvas, 0, q5VarArr[1], f11, f12, this.U.a(1), this.t0);
        canvas.restore();
    }

    public void d(f4.d dVar) {
        View[] viewArr;
        float f7;
        ea0[] ea0VarArr;
        float a2;
        int i10;
        boolean z10;
        this.U = dVar;
        int i11 = 0;
        while (true) {
            viewArr = this.f;
            f7 = 0.0f;
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
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, this.a);
        int i13 = 0;
        while (true) {
            ea0VarArr = this.y;
            if (i13 >= 2) {
                break;
            }
            float f10 = f7;
            this.r[i13].setTextColor(stargiftattributebackdropArr[Math.min(1, i13)] == null ? w02 : -1);
            ea0 ea0Var = ea0VarArr[i13];
            if (i13 == 0 || i13 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i13];
                i10 = stargiftattributebackdrop == null ? w02 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i14 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i10 = i0.a.d(this.s0, i14, stargiftattributebackdrop3 == null ? w02 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            ea0Var.setTextColor(i10);
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
                    ea0VarArr[i13].setLayoutParams(layoutParamsArr2[i13]);
                }
            }
            i13++;
            f7 = f10;
        }
        float f11 = f7;
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.v.setBackground(org.telegram.ui.ActionBar.i6.c0(dp, stargiftattributebackdrop5 == null ? 553648127 : i0.a.d(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        ea0 ea0Var2 = ea0VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        ea0Var2.setTextColor(w02);
        y9[] y9VarArr = this.d;
        y9 y9Var = y9VarArr[0];
        f4.d dVar2 = this.U;
        y9Var.setAlpha(Math.max((dVar2.b(0) && dVar2.b(2)) ? 1.0f : Math.max(dVar2.a(0), dVar2.a(2)), this.U.a(3)));
        y9VarArr[1].setAlpha((1.0f - this.s0) * dVar.a(1));
        y9VarArr[2].setAlpha(dVar.a(1) * this.s0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.g0, dVar.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.g0, dVar.a(2)));
        frameLayout.setTranslationX(dVar.a(2) * this.e0);
        frameLayout.setTranslationY((dVar.a(2) * this.f0) + (dVar.a(1) * AndroidUtilities.dp(16.0f)));
        View view = viewArr[2];
        int i15 = dVar.a;
        if (i15 == 2 && i12 == 2) {
            a2 = f11;
        } else {
            if (i15 != 2) {
                i12 = i15;
            }
            a2 = (1.0f - dVar.a(2)) * (-(viewArr[i12].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view.setTranslationY(a2);
        int i16 = (this.c0 && this.U.b(0)) ? 0 : 8;
        xh.k1 k1Var = this.n;
        k1Var.setVisibility(i16);
        k1Var.setAlpha(this.U.a(0));
        int i17 = dVar.a(4) <= f11 ? 8 : 0;
        t2 t2Var = this.L;
        t2Var.setVisibility(i17);
        t2Var.setAlpha(dVar.a(4));
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
        p3 p3Var;
        Canvas canvas2;
        i3 i3Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f13 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f14 = 2.0f;
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
            int i11 = 0;
            while (i11 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i11] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i11] = i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i11] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i11++;
                f13 = f13;
                f14 = f14;
            }
        }
        float f15 = f13;
        float f16 = f14;
        i3 i3Var2 = this.c;
        if (i3Var2.s == null && i3Var2.v == null && i3Var2.w == null) {
            p3Var = this;
            f12 = f7;
            f11 = f10;
            iArr = iArr5;
            iArr2 = iArr6;
            i10 = 1;
            i3Var = i3Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f17 = f7;
            c3 c3Var = i3Var2.s;
            float f18 = f10;
            float f19 = i3Var2.x;
            int[] iArr7 = this.y0;
            int[] iArr8 = this.x0;
            int[] iArr9 = this.z0;
            f11 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            f12 = f17;
            i10 = 1;
            iArr3 = iArr4;
            p3Var = this;
            canvas2 = canvas;
            i3Var2.a(canvas2, c3Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            i3Var2.a(canvas2, i3Var2.v, i3Var2.y, width2, realHeight, iArr7, iArr8, iArr9);
            i3Var2.a(canvas2, i3Var2.w, i3Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            i3Var = i3Var2;
            p3Var.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            f4.d dVar2 = p3Var.U;
            float max2 = (dVar2.b(0) && dVar2.b(3)) ? 1.0f : Math.max(dVar2.a(0), dVar2.a(3));
            org.telegram.ui.Components.q5[] q5VarArr = p3Var.q0;
            if (max2 > f15) {
                canvas2.save();
                canvas2.translate(f12, f11);
                q5VarArr[0].k(Integer.valueOf(i12));
                i0.a(canvas, 0, q5VarArr[0], p3Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (p3Var.U.a(2) > f15) {
                canvas.save();
                q5VarArr[0].k(Integer.valueOf(i12));
                float f20 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = p3Var.f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = p3Var.J;
                float x11 = frameLayout.getX() + x10;
                y9 y9Var = p3Var.K;
                rectF.set(y9Var.getX() + x11, y9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), y9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + y9Var.getWidth(), y9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + y9Var.getHeight());
                i0.c(canvas, q5VarArr[0], p3Var.getWidth(), f20 * 0.7f, 1.0f, rectF, p3Var.U.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            xh.m[] mVarArr = p3Var.I;
            int length = mVarArr.length;
            int i13 = 0;
            while (i13 < length) {
                xh.m mVar = mVarArr[i13];
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.i6.C1(mVar.getBackground(), iArr10[Utilities.clamp(Math.round((((mVar.getWidth() / f16) + mVar.getX()) / p3Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    mVar.invalidate();
                }
                i13++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i14 = iArr11[iArr11.length / 2];
            int i15 = iArr12[iArr12.length / 2];
            TextView textView = p3Var.v;
            if (textView != null && p3Var.w != i14) {
                p3Var.w = i14;
                textView.setTextColor(i14);
                org.telegram.ui.ActionBar.i6.C1(textView.getBackground(), i15, false);
            }
            if (i3Var.s != null || i3Var.v != null || i3Var.w != null) {
                p3Var.y[0].setTextColor(i14);
            }
            if (p3Var.U.a(2) > f15) {
                if (p3Var.w0 == null) {
                    p3Var.w0 = new b8(i10, 12);
                }
                FrameLayout frameLayout2 = p3Var.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f16) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f16;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f16) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f16;
                float f21 = measuredHeight + scaleY;
                RectF rectF2 = p3Var.v0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f21);
                p3Var.w0.g(rectF2);
                p3Var.w0.d();
                p3Var.w0.a(canvas2, org.telegram.ui.ActionBar.i6.m1(p3Var.U.a(2), -1));
                p3Var.invalidate();
            }
        }
        if (p3Var.U.a(1) > f15) {
            p3Var.c(canvas2, f12, f11, p3Var.getWidth(), p3Var.getRealHeight());
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
        boolean z13 = z10 || z11;
        boolean z14 = starGift instanceof TL_stars.TL_starGiftUnique;
        dc1 dc1Var = this.H;
        ea0[] ea0VarArr = this.y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        if (z14) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) m5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) m5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            ea0VarArr[0].setTextSize(1, 13.0f);
            dc1Var.setVisibility(z13 ? 0 : 8);
            xh.m[] mVarArr = this.I;
            if (z13) {
                mVarArr[1].b(z12 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z12 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), false);
            }
            float f7 = 1.0f;
            if (starGift.resell_amount != null) {
                this.M = true;
                boolean z15 = starGift.resale_ton_only;
                zf.b bVar = zf.b.b;
                zf.a resellAmount = starGift.getResellAmount(z15 ? bVar : zf.b.a);
                CharSequence formatSpannable = LocaleController.formatSpannable(R.string.GiftOnSale, p7.T0("⭐️ " + ((Object) p7.K0(resellAmount.o(), 1.0f, ',')), resellAmount.a == bVar), Float.valueOf(0.9f));
                TextView textView = this.N;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (s3.O1(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new l3(this, 1));
                    w7.z5.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                mVarArr[0].setAlpha(1.0f);
                mVarArr[0].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                mVarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new er(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                mVarArr[0].b(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
            }
            xh.m mVar = mVarArr[1];
            if (!z10 && !z11) {
                f7 = 0.5f;
            }
            mVar.setAlpha(f7);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.S;
                if (arrayList != null) {
                    mVarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    mVarArr[2].setOnClickListener(onClickListener);
                } else {
                    mVarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    mVarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                mVarArr[2].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                mVarArr[2].setOnClickListener(this.R);
            }
            this.c0 = starGift.crafted;
            this.n.a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            ea0VarArr[0].setTextSize(1, 14.0f);
            this.c0 = false;
            dc1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        p7.b1(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) m5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
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
                t2 t2Var = this.L;
                return t2Var.getMeasuredHeight() > 0 ? t2Var.getMeasuredHeight() : AndroidUtilities.dp(550.0f);
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

    public y9 getUpgradeImageView() {
        float f7 = this.s0;
        y9[] y9VarArr = this.d;
        return f7 > 0.5f ? y9VarArr[2] : y9VarArr[1];
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
        ea0[] ea0VarArr = this.y;
        ea0 ea0Var = this.s;
        TextView textView = this.v;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            ea0Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                ea0VarArr[i10].setVisibility(8);
            }
        } else if (i10 != 0 || TextUtils.isEmpty(charSequence3)) {
            ea0VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                ea0VarArr[i10].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            ea0Var.setVisibility(8);
            textView.setVisibility(8);
        } else {
            ea0Var.setText(charSequence3);
            ea0Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                ea0VarArr[i10].setVisibility(8);
            }
        }
        xh.n0[] n0VarArr = this.F;
        xh.n0 n0Var = n0VarArr[i10];
        if (n0Var != null) {
            n0Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
            n0VarArr[i10].setUser(tLObject);
            n0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void k() {
        this.g0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        float f7 = -this.b.getLeft();
        ea0[] ea0VarArr = this.r;
        this.e0 = ((((Math.min(ea0VarArr[2].getPaint().measureText(ea0VarArr[2].getText().toString()), ea0VarArr[2].getWidth()) + ea0VarArr[2].getWidth()) / 2.0f) + (ea0VarArr[2].getX() + f7)) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.f0 = (AndroidUtilities.dp(124.0f) + (-r0.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.q5[] q5VarArr = this.q0;
        q5VarArr[0].a();
        q5VarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.q5[] q5VarArr = this.q0;
        q5VarArr[0].b();
        q5VarArr[1].b();
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

    public void setPreviewAttributes(n0 n0Var) {
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
            y9[] y9VarArr = this.d;
            ck0 lottieAnimation = y9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            ck0 lottieAnimation2 = y9VarArr[this.r0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.T(lottieAnimation.t(), false);
            }
            int i11 = this.r0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = n0Var.a;
            this.V[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, n0Var.b, true);
            int i12 = this.r0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = n0Var.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            p7.a1(y9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.r0 + 1].document, 160);
            a();
            float f7 = this.r0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
            this.h0 = ofFloat;
            ofFloat.addUpdateListener(new m3(this, 0));
            this.h0.addListener(new n3(this, 3));
            this.h0.setDuration(320L);
            this.h0.setInterpolator(hs.h);
            this.h0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.W = new com.google.android.gms.common.api.internal.r(m5.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.a0 = new com.google.android.gms.common.api.internal.r(m5.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.b0 = new com.google.android.gms.common.api.internal.r(m5.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.y[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.s0 = 0.0f;
        this.r0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.a0.c(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.W.c();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        y9[] y9VarArr = this.d;
        p7.a1(y9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.b0.c();
        this.V[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.W.f;
        p7.a1(y9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        f0 f0Var = this.i0;
        AndroidUtilities.cancelRunOnUIThread(f0Var);
        AndroidUtilities.runOnUIThread(f0Var, 2500L);
        invalidate();
    }

    public void setResellPrice(zf.a aVar) {
        boolean k10 = aVar.k();
        this.M = !k10;
        ea0[] ea0VarArr = this.y;
        TextView textView = this.N;
        if (k10) {
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            hs hsVar = hs.h;
            duration.setInterpolator(hsVar).setListener(new n3(this, 2)).setListener(new n3(this, 1)).start();
            ea0VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(hsVar).start();
        } else {
            textView.setText(LocaleController.formatSpannable(R.string.GiftOnSale, p7.V0(aVar.a == zf.b.b, "⭐️ " + ((Object) p7.K0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.V[0];
            textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.d0 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            hs hsVar2 = hs.h;
            duration2.setInterpolator(hsVar2).setListener(new n3(this, 0)).start();
            ea0VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(hsVar2).start();
        }
        boolean z10 = this.M;
        xh.m[] mVarArr = this.I;
        if (z10) {
            mVarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            mVarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        mVarArr[2].setOnClickListener(this.S);
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
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.p(tLObject);
        this.K.e(tLObject, j9Var);
        this.r[2].setText(str2);
        this.y[2].setText(str);
        k();
        d(this.U);
    }

    public void j(int i10) {
    }
}
