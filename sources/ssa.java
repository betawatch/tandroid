// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ssa extends FrameLayout {
    public float A0;
    public ValueAnimator B0;
    public final RectF C0;
    public yxa D0;
    public final l66[] E;
    public final int[] E0;
    public final LinearLayout.LayoutParams[] F;
    public final int[] F0;
    public final hw4[] G;
    public final int[] G0;
    public final TextPaint H;
    public final qmb I;
    public final qw9[] J;
    public final qw9 K;
    public final FrameLayout L;
    public final bf0 M;
    public final ura N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final ylb a;
    public final View.OnClickListener a0;
    public final FrameLayout b;
    public xra b0;
    public final ksa c;
    public final TL_stars.starGiftAttributeBackdrop[] c0;
    public final bf0[] d;
    public ef0 d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public ef0 e0;
    public final LinearLayout[] f;
    public ef0 f0;
    public boolean g0;
    public final FrameLayout.LayoutParams[] h;
    public CharSequence h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public final px4 n;
    public float n0;
    public ValueAnimator o0;
    public final nsa p0;
    public final Paint[] q0;
    public final l66[] r;
    public final RadialGradient[] r0;
    public final l66 s;
    public final Matrix[] s0;
    public RadialGradient t0;
    public final Matrix u0;
    public final Paint v0;
    public final TextView w;
    public final TL_stars.starGiftAttributePattern[] w0;
    public int x;
    public final tm[] x0;
    public final FrameLayout y;
    public int y0;
    public float z0;

    public ssa(Context context, ylb ylbVar, Runnable runnable, View.OnClickListener onClickListener, lpa lpaVar, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f;
        float f2;
        float f3;
        int i;
        this.d = new bf0[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new l66[5];
        this.E = new l66[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new hw4[5];
        this.b0 = new xra(0, 0);
        this.c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.p0 = new nsa((Object) this, (byte) 0);
        this.q0 = new Paint[3];
        this.r0 = new RadialGradient[3];
        this.s0 = new Matrix[3];
        this.u0 = new Matrix();
        int i2 = 1;
        this.v0 = new Paint(1);
        int i3 = 2;
        this.w0 = new TL_stars.starGiftAttributePattern[2];
        this.x0 = new tm[2];
        int i4 = 0;
        while (true) {
            Paint[] paintArr = this.q0;
            if (i4 >= paintArr.length) {
                break;
            }
            paintArr[i4] = new Paint(1);
            i4++;
        }
        int i5 = 0;
        while (true) {
            tm[] tmVarArr = this.x0;
            f = 28.0f;
            if (i5 >= tmVarArr.length) {
                break;
            }
            tmVarArr[i5] = new tm(gm.L(28.0f), this);
            i5++;
        }
        this.A0 = 1.0f;
        this.C0 = new RectF();
        this.E0 = new int[12];
        this.F0 = new int[12];
        this.G0 = new int[12];
        this.a = ylbVar;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.a0 = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i6 = 0;
        while (true) {
            bf0[] bf0VarArr = this.d;
            float f4 = 0.0f;
            f2 = f;
            if (i6 >= bf0VarArr.length) {
                break;
            }
            bf0VarArr[i6] = new rt4(context, (byte) 1);
            this.d[i6].setLayerNum(6660);
            if (i6 > 0) {
                this.d[i6].getImageReceiver().t1 = (short) 1;
            }
            this.b.addView(this.d[i6], qoe.e(-1, -1, nm7.D1));
            bf0 bf0Var = this.d[i6];
            if (i6 == 0) {
                f4 = 1.0f;
            }
            bf0Var.setAlpha(f4);
            i6++;
            f = f2;
        }
        l66 l66Var = new l66(context, null);
        this.s = l66Var;
        l66Var.setTextSize(1, 12.0f);
        l66Var.setGravity(17);
        anb.X(l66Var, cmb.F6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        l66Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setOnClickListener(new osa(this, (byte) 0));
        rve.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(gm.L(7.0f), 0, gm.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(gm.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        rve.a(textView2);
        qmb qmbVar = new qmb((byte) 18, context, this);
        this.I = qmbVar;
        qmbVar.setOrientation(0);
        this.J = new qw9[3];
        int i7 = 0;
        while (true) {
            qw9[] qw9VarArr = this.J;
            if (i7 >= qw9VarArr.length) {
                break;
            }
            qw9VarArr[i7] = new qw9(context, (byte) 3);
            if (i7 == 0) {
                i = i2;
                this.J[i7].a(R.drawable.filled_gift_send, jb6.M0(2131750366, null), false);
                this.J[i7].setOnClickListener(onClickListener2);
            } else if (i7 == i2) {
                i = i2;
                this.J[i7].a(R.drawable.filled_crown_on, jb6.M0(2131750358, null), false);
                this.J[i7].setOnClickListener(onClickListener3);
            } else if (i7 != i3) {
                i = i2;
            } else {
                i = i2;
                this.J[i7].a(R.drawable.filled_share, jb6.M0(2131750371, null), false);
                this.J[i7].setOnClickListener(onClickListener4);
            }
            this.J[i7].setBackground(cmb.Z(0, 285212671, 16, 16));
            rve.b(this.J[i7], 0.075f, 1.5f);
            qmb qmbVar2 = this.I;
            qw9[] qw9VarArr2 = this.J;
            qmbVar2.addView(qw9VarArr2[i7], qoe.q(0, 56, 1.0f, nm7.D1, 0, 0, i7 != qw9VarArr2.length + (-1) ? 11 : 0, 0));
            i7++;
            i2 = i;
            i3 = 2;
        }
        qw9 qw9Var = new qw9(context, (byte) 3);
        this.K = qw9Var;
        qw9Var.a(R.drawable.filled_card_color, jb6.M0(2131742791, null), false);
        qw9Var.setBackground(cmb.Z(0, 285212671, 16, 16));
        rve.b(qw9Var, 0.075f, 1.5f);
        qw9Var.setVisibility(8);
        this.I.addView(qw9Var, i2, qoe.q(0, 56, 1.0f, nm7.D1, 0, 0, 11, 0));
        this.y = new FrameLayout(context);
        int i8 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f;
            if (i8 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i8] = new LinearLayout(context);
            this.f[i8].setOrientation(1);
            if (i8 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.L = frameLayout;
                this.f[i8].addView(frameLayout, qoe.r(-1, nm7.Z1, nm7.D1));
                bf0 bf0Var2 = new bf0(context);
                this.M = bf0Var2;
                bf0Var2.setRoundRadius(gm.L(41.0f));
                frameLayout.addView(bf0Var2, qoe.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i8] = new l66(context, null);
                this.r[i8].setTextColor(-1);
                this.r[i8].setTextSize(1, 20.0f);
                this.r[i8].setTypeface(gm.o());
                this.r[i8].setSingleLine();
                l66 l66Var2 = this.r[i8];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                l66Var2.setEllipsize(truncateAt);
                this.r[i8].setGravity(17);
                frameLayout.addView(this.r[i8], qoe.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i8] = new l66(context, null);
                this.E[i8].setTextColor(cmb.v0(cmb.i5, ylbVar));
                this.E[i8].setTextSize(1, 14.0f);
                anb.G(this.E[i8], cmb.Wc, ylbVar);
                this.E[i8].setLineSpacing(gm.L(2.0f), 1.0f);
                this.E[i8].setDisablePaddingsOffsetY(true);
                this.E[i8].setSingleLine();
                this.E[i8].setGravity(17);
                this.E[i8].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i8], qoe.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i8 == 4) {
                ura uraVar = new ura(context, ylbVar);
                this.N = uraVar;
                this.f[i8].addView(uraVar, qoe.o(-1, -2));
                View view = this.f[i8];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = qoe.d(-1, -2.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i8] = d;
                addView(view, d);
                i8++;
            } else {
                this.r[i8] = new l66(context, null);
                l66[] l66VarArr = this.r;
                if (i8 == 3) {
                    l66VarArr[i8].setTextColor(-1);
                } else {
                    l66VarArr[i8].setTextColor(cmb.v0(cmb.i5, ylbVar));
                }
                this.r[i8].setTextSize(1, 20.0f);
                this.r[i8].setTypeface(gm.o());
                this.r[i8].setGravity(17);
                this.f[i8].addView(this.r[i8], qoe.t(-1, -2, 17, 24, i8 == 3 ? 10 : 0, 24, 0));
                if (i8 == 0) {
                    this.f[i8].addView(this.s, qoe.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i8].addView(this.w, qoe.n(19.33f, -2, 17, 0, 6, 0, 2));
                    this.E[i8] = new l66(context, null);
                    l66[] l66VarArr2 = this.E;
                    if (i8 == 3) {
                        l66VarArr2[i8].setTextColor(cmb.p1(0.75f, -1));
                    } else {
                        l66VarArr2[i8].setTextColor(cmb.v0(cmb.i5, ylbVar));
                    }
                    this.E[i8].setTextSize(1, 14.0f);
                    this.E[i8].setGravity(17);
                    anb.G(this.E[i8], cmb.Wc, ylbVar);
                    this.E[i8].setLineSpacing(gm.L(2.0f), 1.0f);
                    this.E[i8].setDisablePaddingsOffsetY(true);
                    this.y.addView(this.E[i8], qoe.e(-2, -2, 17));
                    this.y.addView(this.P, qoe.d(-2, 20.33f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    LinearLayout linearLayout = this.f[i8];
                    FrameLayout frameLayout2 = this.y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    LinearLayout.LayoutParams t = qoe.t(-1, -2, 17, 24, 0, 24, i8 == 3 ? 6 : 0);
                    layoutParamsArr2[i8] = t;
                    linearLayout.addView(frameLayout2, t);
                } else {
                    this.E[i8] = new l66(context, null);
                    l66[] l66VarArr3 = this.E;
                    if (i8 == 3) {
                        l66VarArr3[i8].setTextColor(cmb.p1(0.75f, -1));
                    } else {
                        l66VarArr3[i8].setTextColor(cmb.v0(cmb.i5, ylbVar));
                    }
                    this.E[i8].setTextSize(1, 14.0f);
                    this.E[i8].setGravity(17);
                    anb.G(this.E[i8], cmb.Wc, ylbVar);
                    this.E[i8].setLineSpacing(gm.L(2.0f), 1.0f);
                    this.E[i8].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i8];
                    l66 l66Var3 = this.E[i8];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    LinearLayout.LayoutParams t2 = qoe.t(-1, -2, 17, 24, 0, 24, i8 == 3 ? 6 : 0);
                    layoutParamsArr3[i8] = t2;
                    linearLayout2.addView(l66Var3, t2);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i8];
                if (i8 == 3) {
                    f3 = 6.0f;
                } else {
                    f3 = (i8 == 1 ? 7.33f : this.c0[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = gm.L(f3);
                this.G[i8] = new hw4(context);
                this.G[i8].setVisibility(8);
                this.G[i8].setPadding(gm.L(30.0f), gm.L(2.0f), gm.L(30.0f), gm.L(2.0f));
                if (i8 == 0) {
                    this.H = this.G[i8].getTextPaint();
                }
                this.f[i8].addView(this.G[i8], qoe.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i8 == 0) {
                this.f[i8].addView(this.I, qoe.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i8];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d2 = qoe.d(-1, -2.0f, nm7.D1, 16.0f, i8 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i8] = d2;
            addView(view2, d2);
            i8++;
        }
        addView(this.b, qoe.d(nm7.p2, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        ksa ksaVar = new ksa(context);
        this.c = ksaVar;
        addView(ksaVar, qoe.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(cmb.K(gm.L(f2), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        rve.a(imageView);
        addView(imageView, qoe.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new xl3(runnable, (byte) 7));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(cmb.f0(553648127, 1, -1));
        rve.a(imageView2);
        if (lpaVar != null) {
            addView(imageView2, qoe.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(lpaVar);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(jb6.M0(2131754878, null));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(cmb.f0(553648127, 1, -1));
        rve.a(imageView3);
        addView(imageView3, qoe.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        px4 px4Var = new px4(context);
        this.n = px4Var;
        px4Var.b(jb6.M0(2131749686, null), true);
        rx4 rx4Var = px4Var.a;
        if (rx4Var.w == null) {
            yxa yxaVar = new yxa(2, 12);
            rx4Var.w = yxaVar;
            yxaVar.h = 5.0f;
        }
        Path path = rx4Var.f;
        float f5 = rx4Var.s;
        rx4Var.x = true;
        rx4.d(path, f5, true);
        px4Var.setScaleX(1.2f);
        px4Var.setScaleY(1.2f);
        addView(px4Var, qoe.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        px4Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new psa(this, (byte) 1));
        this.B0.addListener(new qsa(this, (byte) 4));
        this.B0.setDuration(320L);
        this.B0.setInterpolator(d53.g);
        this.B0.start();
    }

    public final int b(float f, float f2, float f3, float f4, Canvas canvas) {
        int i = this.y0;
        float f5 = this.z0;
        RadialGradient[] radialGradientArr = this.r0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        Matrix[] matrixArr = this.s0;
        Paint[] paintArr = this.q0;
        int i2 = 0;
        if (i != 0) {
            if (f5 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) (this.b0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f, f2);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                i2 = on2.l(on2.p(on2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
            }
            if (this.z0 <= 0.0f || stargiftattributebackdropArr[2] == null) {
                return i2;
            }
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f * this.z0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f, f2);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            return on2.l(on2.p(on2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i2);
        }
        if (f5 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f, f2);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i2 = on2.l(on2.p(on2.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
        }
        if (this.z0 >= 1.0f || stargiftattributebackdropArr[1] == null) {
            return i2;
        }
        paintArr[1].setAlpha((int) ((1.0f - this.z0) * this.b0.a(1) * 255.0f));
        matrixArr[1].reset();
        matrixArr[1].postTranslate(f, f2);
        radialGradientArr[1].setLocalMatrix(matrixArr[1]);
        canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[1]);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[1];
        return on2.l(on2.p(on2.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i2);
    }

    public final void c(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.save();
        canvas.translate(f, f2);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int f5 = on2.f(this.z0, i, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        tm[] tmVarArr = this.x0;
        tmVarArr[1].k(Integer.valueOf(f5));
        bpa.a(canvas, 0, tmVarArr[1], f3, f4, this.b0.a(1), this.A0);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(xra xraVar) {
        View[] viewArr;
        l66[] l66VarArr;
        float a;
        int i;
        boolean z;
        this.b0 = xraVar;
        int i2 = 0;
        while (true) {
            viewArr = this.f;
            if (i2 >= viewArr.length) {
                break;
            }
            float a2 = xraVar.a(i2);
            viewArr[i2].setAlpha(a2);
            viewArr[i2].setVisibility(a2 > 0.0f ? 0 : 4);
            i2++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? xraVar.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? xraVar.a(1) : 0.0f);
        ImageView imageView = this.Q;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || xraVar.b != 2) && (stargiftattributebackdropArr[1] == null || xraVar.b != 1)) ? 8 : 0);
        boolean z2 = stargiftattributebackdropArr[0] != null || this.T;
        float a3 = xraVar.a(0);
        byte b = xraVar.b;
        float T1 = gm.T1(false, z2, a3);
        ImageView imageView2 = this.S;
        imageView2.setAlpha(T1);
        imageView2.setVisibility((z2 && b == 0) ? 0 : 8);
        boolean z3 = stargiftattributebackdropArr[0] != null;
        Boolean bool = this.U;
        int i3 = -1;
        ylb ylbVar = this.a;
        if (bool == null || bool.booleanValue() != z3) {
            this.U = Boolean.valueOf(z3);
            if (z3) {
                imageView2.clearColorFilter();
                imageView2.setBackground(cmb.f0(553648127, 1, -1));
            } else {
                anb.s(imageView2, cmb.I5, ylbVar, PorterDuff.Mode.SRC_IN);
                int i4 = cmb.h6;
                fg0 f0 = cmb.f0(cmb.v0(i4, ylbVar), 1, -1);
                wmb M = anb.M(i4);
                imageView2.setBackground(f0);
                anb.j(imageView2, f0, null, M, ylbVar);
            }
        }
        if (!this.k0) {
            float T12 = gm.T1(false, this.O, xraVar.a(0));
            TextView textView = this.P;
            textView.setAlpha(T12);
            textView.setScaleX(gm.R1(0.4f, this.O ? 1.0f : 0.4f, xraVar.a(0)));
            textView.setScaleY(gm.R1(0.4f, this.O ? 1.0f : 0.4f, xraVar.a(0)));
            textView.setVisibility(!this.O ? 8 : b == 0 ? 0 : 4);
        }
        int v0 = cmb.v0(cmb.i5, ylbVar);
        int i5 = 0;
        while (true) {
            l66VarArr = this.E;
            if (i5 >= 2) {
                break;
            }
            this.r[i5].setTextColor(stargiftattributebackdropArr[Math.min(1, i5)] == null ? v0 : i3);
            l66 l66Var = l66VarArr[i5];
            if (i5 == 0 || i5 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i5];
                i = stargiftattributebackdrop == null ? v0 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i6 = stargiftattributebackdrop2 == null ? v0 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i = on2.f(this.z0, i6, stargiftattributebackdrop3 == null ? v0 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            l66Var.setTextColor(i);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i5];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                z = (gm.L(184.0f) == layoutParamsArr[i5].topMargin && viewArr[i5].getPaddingBottom() == gm.L(18.0f)) ? false : true;
                if (z) {
                    viewArr[i5].setPadding(0, 0, 0, gm.L(18.0f));
                    layoutParamsArr[i5].topMargin = gm.L(184.0f);
                }
            } else {
                z = (gm.L(170.0f) == layoutParamsArr[i5].topMargin && viewArr[i5].getPaddingBottom() == gm.L(3.0f)) ? false : true;
                if (z) {
                    viewArr[i5].setPadding(0, 0, 0, gm.L(3.0f));
                    layoutParamsArr[i5].topMargin = gm.L(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
            layoutParamsArr2[i5].topMargin = gm.L((i5 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z) {
                viewArr[i5].setLayoutParams(layoutParamsArr[i5]);
                if (i5 == 0) {
                    this.y.setLayoutParams(layoutParamsArr2[i5]);
                } else {
                    l66VarArr[i5].setLayoutParams(layoutParamsArr2[i5]);
                }
            }
            i5++;
            i3 = -1;
        }
        int L = gm.L(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.w.setBackground(cmb.b0(L, stargiftattributebackdrop5 == null ? 553648127 : on2.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        l66 l66Var2 = l66VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            v0 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        l66Var2.setTextColor(v0);
        bf0[] bf0VarArr = this.d;
        bf0 bf0Var = bf0VarArr[0];
        xra xraVar2 = this.b0;
        bf0Var.setAlpha(Math.max((xraVar2.b(0) && xraVar2.b(2)) ? 1.0f : Math.max(xraVar2.a(0), xraVar2.a(2)), this.b0.a(3)));
        bf0VarArr[1].setAlpha((1.0f - this.z0) * xraVar.a(1));
        bf0VarArr[2].setAlpha(xraVar.a(1) * this.z0);
        float R1 = gm.R1(1.0f, this.n0, xraVar.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(R1);
        frameLayout.setScaleY(gm.R1(1.0f, this.n0, xraVar.a(2)));
        frameLayout.setTranslationX(xraVar.a(2) * this.l0);
        frameLayout.setTranslationY((xraVar.a(2) * this.m0) + (xraVar.a(1) * gm.L(16.0f)));
        View view = viewArr[2];
        byte b2 = xraVar.a;
        if (b2 != 2) {
            b = b2;
        } else if (b == 2) {
            a = 0.0f;
            view.setTranslationY(a);
            int i7 = (this.g0 || !this.b0.b(0)) ? 8 : 0;
            px4 px4Var = this.n;
            px4Var.setVisibility(i7);
            px4Var.setAlpha(this.b0.a(0));
            int i8 = xraVar.a(4) <= 0.0f ? 8 : 0;
            ura uraVar = this.N;
            uraVar.setVisibility(i8);
            uraVar.setAlpha(xraVar.a(4));
            invalidate();
        }
        a = (1.0f - xraVar.a(2)) * (-(viewArr[b].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        view.setTranslationY(a);
        if (this.g0) {
        }
        px4 px4Var2 = this.n;
        px4Var2.setVisibility(i7);
        px4Var2.setAlpha(this.b0.a(0));
        if (xraVar.a(4) <= 0.0f) {
        }
        ura uraVar2 = this.N;
        uraVar2.setVisibility(i8);
        uraVar2.setAlpha(xraVar.a(4));
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        float f;
        float f2;
        float f3;
        int[] iArr;
        int[] iArr2;
        ssa ssaVar;
        int i;
        int[] iArr3;
        float f4;
        Canvas canvas2;
        ksa ksaVar;
        float realHeight = getRealHeight();
        canvas.save();
        float f5 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f6 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = gm.L(80.0f) + gm.U1(this.b0.a(1), gm.L(8.0f), gm.L(24.0f));
        xra xraVar = this.b0;
        float max = ((xraVar.b(0) && xraVar.b(2)) || (xraVar.b(2) && xraVar.b(3)) || (xraVar.b(3) && xraVar.b(0))) ? 1.0f : Math.max(xraVar.a(0), Math.max(xraVar.a(2), xraVar.a(3)));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.c0;
        if (max <= 0.0f || stargiftattributebackdropArr2[0] == null) {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        } else {
            if (this.t0 == null || this.b0.a(2) < 1.0f) {
                Paint[] paintArr = this.q0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.s0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.r0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            } else {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            }
            if (this.t0 != null && this.b0.a(2) > 0.0f) {
                int a = (int) (this.b0.a(2) * 255.0f);
                Paint paint = this.v0;
                paint.setAlpha(a);
                Matrix matrix = this.u0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.t0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        }
        if (this.b0.a(1) > 0.0f) {
            f = width;
            f2 = L;
            int b = b(f, f2, getWidth(), realHeight, canvas);
            realHeight = realHeight;
            k(b);
        } else {
            f = width;
            f2 = L;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.G0;
        int[] iArr5 = this.F0;
        int[] iArr6 = this.E0;
        if (stargiftattributebackdrop != null) {
            int i2 = 0;
            while (i2 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i2] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i2] = on2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i2] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i2++;
                f5 = f5;
                f6 = f6;
            }
        }
        float f7 = f5;
        float f8 = f6;
        ksa ksaVar2 = this.c;
        if (ksaVar2.s == null && ksaVar2.w == null && ksaVar2.x == null) {
            ssaVar = this;
            f4 = f;
            f3 = f2;
            iArr = iArr5;
            iArr2 = iArr6;
            i = 1;
            canvas2 = canvas;
            ksaVar = ksaVar2;
            iArr3 = iArr4;
        } else {
            float width2 = getWidth();
            float f9 = f2;
            esa esaVar = ksaVar2.s;
            float f10 = ksaVar2.y;
            int[] iArr7 = this.F0;
            int[] iArr8 = this.E0;
            int[] iArr9 = this.G0;
            f3 = f9;
            iArr = iArr5;
            iArr2 = iArr6;
            ssaVar = this;
            i = 1;
            iArr3 = iArr4;
            f4 = f;
            canvas2 = canvas;
            ksaVar2.a(canvas2, esaVar, f10, width2, realHeight, iArr7, iArr8, iArr9);
            ksaVar2.a(canvas2, ksaVar2.w, ksaVar2.E, width2, realHeight, iArr7, iArr8, iArr9);
            ksaVar2.a(canvas2, ksaVar2.x, ksaVar2.F, width2, realHeight, iArr7, iArr8, iArr9);
            ksaVar = ksaVar2;
            ssaVar.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i3 = iArr3[iArr3.length / 2];
            xra xraVar2 = ssaVar.b0;
            float max2 = (xraVar2.b(0) && xraVar2.b(3)) ? 1.0f : Math.max(xraVar2.a(0), xraVar2.a(3));
            tm[] tmVarArr = ssaVar.x0;
            if (max2 > f7) {
                canvas2.save();
                canvas2.translate(f4, f3);
                tmVarArr[0].k(Integer.valueOf(i3));
                float f11 = realHeight;
                bpa.a(canvas, 0, tmVarArr[0], ssaVar.getWidth(), f11, max2, 1.0f);
                realHeight = f11;
                canvas.restore();
            }
            if (ssaVar.b0.a(2) > f7) {
                canvas.save();
                tmVarArr[0].k(Integer.valueOf(i3));
                float f12 = realHeight;
                RectF rectF = gm.P;
                LinearLayout[] linearLayoutArr = ssaVar.f;
                float x = linearLayoutArr[2].getX();
                FrameLayout frameLayout = ssaVar.L;
                float x2 = frameLayout.getX() + x;
                bf0 bf0Var = ssaVar.M;
                rectF.set(bf0Var.getX() + x2, bf0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), bf0Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + bf0Var.getWidth(), bf0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + bf0Var.getHeight());
                bpa.c(canvas, tmVarArr[0], ssaVar.getWidth(), f12 * 0.7f, 1.0f, rectF, ssaVar.b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i4 = 0;
            while (true) {
                qw9[] qw9VarArr = ssaVar.J;
                if (i4 > qw9VarArr.length) {
                    break;
                }
                qw9 qw9Var = i4 < qw9VarArr.length ? qw9VarArr[i4] : ssaVar.K;
                int[] iArr10 = iArr2;
                if (cmb.F1(qw9Var.getBackground(), iArr10[Utilities.j(Math.round((((qw9Var.getWidth() / f8) + qw9Var.getX()) / ssaVar.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    qw9Var.invalidate();
                }
                i4++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i5 = iArr11[iArr11.length / 2];
            int i6 = iArr12[iArr12.length / 2];
            TextView textView = ssaVar.w;
            if (textView != null && ssaVar.x != i5) {
                ssaVar.x = i5;
                textView.setTextColor(i5);
                cmb.F1(textView.getBackground(), i6, false);
            }
            if (ksaVar.s != null || ksaVar.w != null || ksaVar.x != null) {
                ssaVar.E[0].setTextColor(i5);
            }
            if (ssaVar.b0.a(2) > f7) {
                if (ssaVar.D0 == null) {
                    ssaVar.D0 = new yxa(i, 12);
                }
                FrameLayout frameLayout2 = ssaVar.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f8) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f8;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f8) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f8;
                float f13 = measuredHeight + scaleY;
                RectF rectF2 = ssaVar.C0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f13);
                ssaVar.D0.g(rectF2);
                ssaVar.D0.d();
                ssaVar.D0.a(canvas2, cmb.p1(ssaVar.b0.a(2), -1));
                ssaVar.invalidate();
            }
        }
        if (ssaVar.b0.a(1) > f7) {
            ssaVar.c(f4, f3, ssaVar.getWidth(), ssaVar.getRealHeight(), canvas2);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gm.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.r0;
        radialGradientArr[i] = radialGradient;
        if (i == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, gm.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.t0 = radialGradient2;
            this.v0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.s0;
        if (matrixArr[i] == null) {
            matrixArr[i] = new Matrix();
        }
        this.q0[i].setShader(radialGradientArr[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3) {
        int i;
        nk resellAmount;
        boolean z4;
        char c;
        boolean z5;
        int i2;
        int i3;
        this.O = false;
        boolean z6 = z || z2;
        boolean z7 = starGift instanceof TL_stars.TL_starGiftUnique;
        qmb qmbVar = this.I;
        l66[] l66VarArr = this.E;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        if (z7) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) jva.i(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            l66VarArr[0].setTextSize(1, 13.0f);
            qmbVar.setVisibility(z6 ? 0 : 8);
            qw9[] qw9VarArr = this.J;
            qw9VarArr[2].setVisibility(0);
            if (z6) {
                qw9 qw9Var = qw9VarArr[1];
                if (z3) {
                    i2 = R.drawable.filled_crown_off;
                    i3 = 2131750355;
                } else {
                    i2 = R.drawable.filled_crown_on;
                    i3 = 2131750358;
                }
                qw9Var.a(i2, jb6.M0(i3, null), false);
            }
            CharSequence charSequence = this.h0;
            float f = 1.0f;
            TextView textView = this.P;
            if (charSequence != null) {
                this.O = true;
                textView.setText(charSequence);
                int L = gm.L(12.0f);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(cmb.b0(L, on2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                textView.setOnClickListener(null);
                textView.setStateListAnimator(null);
            } else if (starGift.resell_amount != null && !wsa.D1(z8c.t0, starGift)) {
                this.O = true;
                boolean m = fs7.m(starGift);
                ok okVar = ok.b;
                if (m && starGift.fixed_sale) {
                    resellAmount = starGift.getResellAmount(okVar);
                } else {
                    resellAmount = starGift.getResellAmount(starGift.resale_ton_only ? okVar : ok.a);
                }
                char c2 = 2;
                ok okVar2 = resellAmount.a;
                boolean z8 = false;
                textView.setText(nxa.t1(jb6.V(null, null, 2131749613, nxa.X0(okVar2 == okVar, "⭐️ " + ((Object) nxa.H0(resellAmount.q(), 1.0f, ',')), resellAmount.a == okVar ? 1.3f : 1.13f, null)), okVar2 == okVar));
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                textView.setBackground(cmb.b0(gm.L(12.0f), on2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216))));
                if (wsa.F1(z8c.t0, pg3.n(starGift.owner_id))) {
                    textView.setOnClickListener(new osa(this, (byte) 1));
                    rve.a(textView);
                    c = c2;
                    z4 = z8;
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                    c = c2;
                    z4 = z8;
                }
                this.j0 = z;
                m();
                qw9 qw9Var2 = qw9VarArr[1];
                if (!z && !z2) {
                    f = 0.5f;
                }
                qw9Var2.setAlpha(f);
                if (z) {
                    boolean z9 = z4;
                    qw9VarArr[c].a(R.drawable.filled_share, jb6.M0(2131750371, null), z9);
                    qw9VarArr[c].setOnClickListener(this.V);
                    z5 = z9;
                } else {
                    ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                    View.OnClickListener onClickListener = this.W;
                    if (arrayList != null) {
                        boolean z10 = z4;
                        qw9VarArr[c].a(R.drawable.filled_gift_sell_off, jb6.M0(2131750365, null), z10);
                        qw9VarArr[c].setOnClickListener(onClickListener);
                        z5 = z10;
                    } else {
                        boolean z11 = z4;
                        qw9VarArr[c].a(R.drawable.filled_gift_sell_on, jb6.M0(2131750379, null), z11);
                        qw9VarArr[c].setOnClickListener(onClickListener);
                        z5 = z11;
                    }
                }
                this.g0 = starGift.crafted;
                this.n.a.e(stargiftattributebackdropArr[z5 ? 1 : 0], z5, true);
                i = z5;
            }
            z4 = false;
            c = 2;
            this.j0 = z;
            m();
            qw9 qw9Var22 = qw9VarArr[1];
            if (!z) {
                f = 0.5f;
            }
            qw9Var22.setAlpha(f);
            if (z) {
            }
            this.g0 = starGift.crafted;
            this.n.a.e(stargiftattributebackdropArr[z5 ? 1 : 0], z5, true);
            i = z5;
        } else {
            i = 0;
            stargiftattributebackdropArr[0] = null;
            l66VarArr[0].setTextSize(1, 14.0f);
            this.g0 = false;
            qmbVar.setVisibility(8);
        }
        e(i, stargiftattributebackdropArr[i]);
        nxa.f1(this.d[i].getImageReceiver(), starGift, nm7.p2);
        this.e[i] = (TL_stars.starGiftAttributeModel) jva.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.b0);
    }

    public final void g(int i, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.w0;
            if (stargiftattributepatternArr[i] != stargiftattributepattern) {
                stargiftattributepatternArr[i] = stargiftattributepattern;
                this.x0[i].i(stargiftattributepattern.document, z);
            }
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.b0.d(0);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        LinearLayout[] linearLayoutArr = this.f;
        if (d) {
            return linearLayoutArr[0].getMeasuredHeight() + gm.L(160.0f) + gm.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.b0.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + gm.L(160.0f) + gm.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.b0.d(2)) {
            L = gm.L(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.b0.d(3)) {
                if (!this.b0.d(4)) {
                    return 0;
                }
                ura uraVar = this.N;
                return uraVar.getMeasuredHeight() > 0 ? uraVar.getMeasuredHeight() : gm.L(550.0f);
            }
            L = gm.L(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + L;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        int L = gm.L(160.0f) + gm.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.b0.a(4) * (this.N.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : gm.L(550.0f))) + (this.b0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + gm.L(160.0f) + gm.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.b0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + gm.L(64.0f))) + (this.b0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + gm.L(160.0f) + gm.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.b0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f = this.z0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        return f > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public bf0 getUpgradeImageView() {
        float f = this.z0;
        bf0[] bf0VarArr = this.d;
        return f > 0.5f ? bf0VarArr[2] : bf0VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f = this.z0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        return f > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.w0[1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, TLObject tLObject, Spannable spannable) {
        hw4 hw4Var;
        this.r[i].setText(charSequence);
        FrameLayout frameLayout = this.y;
        l66[] l66VarArr = this.E;
        l66 l66Var = this.s;
        TextView textView = this.w;
        if (i == 0) {
            if (!TextUtils.isEmpty(spannableStringBuilder)) {
                textView.setText(spannableStringBuilder);
                textView.setVisibility(0);
                l66Var.setVisibility(8);
                if (i == 0) {
                    frameLayout.setVisibility(8);
                } else {
                    l66VarArr[i].setVisibility(8);
                }
            } else if (!TextUtils.isEmpty(spannableStringBuilder2)) {
                l66Var.setText(spannableStringBuilder2);
                l66Var.setVisibility(0);
                textView.setVisibility(8);
                if (i == 0) {
                    frameLayout.setVisibility(8);
                } else {
                    l66VarArr[i].setVisibility(8);
                }
            }
            hw4[] hw4VarArr = this.G;
            hw4Var = hw4VarArr[i];
            if (hw4Var == null) {
                hw4Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
                hw4VarArr[i].setUser(tLObject);
                hw4VarArr[i].setMessage(spannable);
                return;
            }
            return;
        }
        l66VarArr[i].setText(charSequence2);
        if (i == 0) {
            frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        } else {
            l66VarArr[i].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        }
        l66Var.setVisibility(8);
        textView.setVisibility(8);
        hw4[] hw4VarArr2 = this.G;
        hw4Var = hw4VarArr2[i];
        if (hw4Var == null) {
        }
    }

    public final void i(int i, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z) {
        qmb qmbVar = this.I;
        qmbVar.setVisibility(0);
        qw9[] qw9VarArr = this.J;
        qw9VarArr[0].setAlpha(1.0f);
        qw9VarArr[0].a(R.drawable.filled_gift_send, jb6.M0(2131750366, null), false);
        qw9VarArr[0].setOnClickListener(onClickListener);
        int i = onClickListener2 != null ? 0 : 8;
        qw9 qw9Var = this.K;
        qw9Var.setVisibility(i);
        qw9Var.setOnClickListener(onClickListener2);
        qw9VarArr[1].a(R.drawable.filled_crown_on, jb6.M0(2131750358, null), false);
        qw9VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) qw9VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z);
        qw9VarArr[2].setVisibility(8);
        qmbVar.requestLayout();
    }

    public final void l() {
        l66[] l66VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        l66 l66Var;
        int i;
        l66[] l66VarArr2 = this.r;
        if (l66VarArr2 == null || (l66VarArr = this.E) == null || (stargiftattributebackdropArr = this.c0) == null) {
            return;
        }
        int v0 = cmb.v0(cmb.i5, this.a);
        for (int i2 = 0; i2 < 2; i2++) {
            l66 l66Var2 = l66VarArr2[i2];
            if (l66Var2 != null && l66VarArr[i2] != null) {
                l66Var2.setTextColor(stargiftattributebackdropArr[Math.min(1, i2)] == null ? v0 : -1);
                l66 l66Var3 = l66VarArr[i2];
                if (i2 == 0 || i2 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i2];
                    i = stargiftattributebackdrop == null ? v0 : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                    int i3 = stargiftattributebackdrop2 == null ? v0 : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                    i = on2.f(this.z0, i3, stargiftattributebackdrop3 == null ? v0 : stargiftattributebackdrop3.text_color | (-16777216));
                }
                l66Var3.setTextColor(i);
            }
        }
        if (l66VarArr.length <= 2 || (l66Var = l66VarArr[2]) == null) {
            return;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop4 != null) {
            v0 = stargiftattributebackdrop4.text_color | (-16777216);
        }
        l66Var.setTextColor(v0);
    }

    public final void m() {
        boolean z = this.j0;
        qw9[] qw9VarArr = this.J;
        if (z || this.i0) {
            qw9VarArr[0].setAlpha(1.0f);
            qw9VarArr[0].a(R.drawable.filled_gift_send, jb6.M0(2131750366, null), false);
            return;
        }
        qw9VarArr[0].setAlpha(0.5f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
        spannableStringBuilder.setSpan(new pn2(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) jb6.M0(2131750366, null));
        qw9VarArr[0].a(R.drawable.filled_gift_send, spannableStringBuilder, false);
    }

    public final void n() {
        this.n0 = gm.N(33.33f) / gm.N(160.0f);
        float f = -this.b.getLeft();
        l66[] l66VarArr = this.r;
        this.l0 = ((((Math.min(l66VarArr[2].getPaint().measureText(l66VarArr[2].getText().toString()), l66VarArr[2].getWidth()) + l66VarArr[2].getWidth()) / 2.0f) + (l66VarArr[2].getX() + f)) + gm.L(24.0f)) - (gm.L(126.67f) / 2.0f);
        this.m0 = (gm.L(124.0f) + (-r0.getTop())) - (gm.L(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tm[] tmVarArr = this.x0;
        tmVarArr[0].a();
        tmVarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tm[] tmVarArr = this.x0;
        tmVarArr[0].b();
        tmVarArr[1].b();
        gm.r(this.p0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b0.b(2)) {
            n();
            d(this.b0);
        }
    }

    public void setInWallet(boolean z) {
        if (this.i0 == z) {
            return;
        }
        this.i0 = z;
        m();
    }

    public void setPreviewAttributes(gpa gpaVar) {
        xra xraVar = this.b0;
        if (xraVar != null && xraVar.b == 1 && isAttachedToWindow()) {
            gm.r(this.p0);
            ValueAnimator valueAnimator = this.o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o0 = null;
            }
            int i = 1 - this.y0;
            this.y0 = i;
            bf0[] bf0VarArr = this.d;
            p09 y = bf0VarArr[2 - i].getImageReceiver().y();
            p09 y2 = bf0VarArr[this.y0 + 1].getImageReceiver().y();
            if (y2 != null && y != null) {
                y2.O(false, y.o());
            }
            int i2 = this.y0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = gpaVar.a;
            this.c0[i2] = stargiftattributebackdrop;
            e(i2, stargiftattributebackdrop);
            g(1, gpaVar.b, true);
            int i3 = this.y0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = gpaVar.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i3] = stargiftattributemodel;
            nxa.e1(bf0VarArr[i3].getImageReceiver(), stargiftattributemodelArr[this.y0 + 1].document, nm7.p2);
            a();
            float f = this.y0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f, f);
            this.o0 = ofFloat;
            ofFloat.addUpdateListener(new psa(this, (byte) 0));
            this.o0.addListener(new qsa(this, (byte) 3));
            this.o0.setDuration(320L);
            this.o0.setInterpolator(d53.h);
            this.o0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.d0 = new ef0(jva.j(arrayList, TL_stars.starGiftAttributeModel.class));
        this.e0 = new ef0(jva.j(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f0 = new ef0(jva.j(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.z0 = 0.0f;
        this.y0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.e0.b(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.d0.b();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        bf0[] bf0VarArr = this.d;
        nxa.e1(bf0VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, nm7.p2);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f0.b();
        this.c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.d0.f;
        nxa.e1(bf0VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, nm7.p2);
        nsa nsaVar = this.p0;
        gm.r(nsaVar);
        gm.d3(nsaVar, 2500L);
        invalidate();
    }

    public void setResellPrice(nk nkVar) {
        boolean l = nkVar.l();
        ok okVar = nkVar.a;
        this.O = !l;
        l66[] l66VarArr = this.E;
        TextView textView = this.P;
        if (l) {
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).setListener(new qsa(this, (byte) 2)).setListener(new qsa(this, (byte) 1)).start();
            l66VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(d53Var).start();
        } else {
            ok okVar2 = ok.b;
            textView.setText(nxa.t1(jb6.V(null, null, 2131749613, nxa.X0(okVar == okVar2, "⭐️ " + ((Object) nxa.H0(nkVar.q(), 1.0f, ',')), okVar == okVar2 ? 1.3f : 0.9f, null)), okVar == okVar2));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.c0[0];
            textView.setBackground(cmb.b0(gm.L(12.0f), on2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.k0 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            d53 d53Var2 = d53.h;
            duration2.setInterpolator(d53Var2).setListener(new qsa(this, (byte) 0)).start();
            l66VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(d53Var2).start();
        }
        boolean z = this.O;
        qw9[] qw9VarArr = this.J;
        if (z) {
            qw9VarArr[2].a(R.drawable.filled_gift_sell_off, jb6.M0(2131750365, null), true);
        } else {
            qw9VarArr[2].a(R.drawable.filled_gift_sell_on, jb6.M0(2131750379, null), true);
        }
        qw9VarArr[2].setOnClickListener(this.W);
    }

    public void setShowOptions(boolean z) {
        this.T = z;
        d(this.b0);
    }

    public void setStatusPill(CharSequence charSequence) {
        this.h0 = charSequence;
    }

    public void setWalletCard(boolean z) {
        int i;
        int i2;
        qw9 qw9Var = this.J[1];
        if (z) {
            i = R.drawable.filled_card_remove;
            i2 = 2131742784;
        } else {
            i = R.drawable.filled_card_add;
            i2 = 2131742792;
        }
        qw9Var.a(i, jb6.M0(i2, null), false);
    }

    public void setWalletDisplayed(boolean z) {
        this.J[1].setAlpha(z ? 1.0f : 0.5f);
    }

    public void setWearPreview(TLObject tLObject) {
        String H;
        String str;
        if (tLObject instanceof TLRPC.User) {
            str = m9c.r((TLRPC.User) tLObject);
            H = jb6.M0(2131747559, null);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str2 = chat.title;
            boolean V = sd2.V(chat);
            int i = chat.participants_count;
            H = V ? i > 1 ? jb6.H(',', "Subscribers", i) : jb6.M0(2131751327, null) : i > 1 ? jb6.H(',', "Members", i) : jb6.M0(2131754876, null).toLowerCase();
            str = str2;
        }
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        this.M.f(tLObject, pc0Var);
        this.r[2].setText(str);
        this.E[2].setText(H);
        n();
        d(this.b0);
    }

    public void k(int i) {
    }
}
