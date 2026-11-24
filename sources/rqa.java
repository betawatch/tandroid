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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class rqa extends FrameLayout {
    public float A0;
    public ValueAnimator B0;
    public final RectF C0;
    public vva D0;
    public final l46[] E;
    public final int[] E0;
    public final LinearLayout.LayoutParams[] F;
    public final int[] F0;
    public final fu4[] G;
    public final int[] G0;
    public final TextPaint H;
    public final pkb I;
    public final gw9[] J;
    public final gw9 K;
    public final FrameLayout L;
    public final be0 M;
    public final upa N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final wjb a;
    public final View.OnClickListener a0;
    public final FrameLayout b;
    public xpa b0;
    public final kqa c;
    public final TL_stars.starGiftAttributeBackdrop[] c0;
    public final be0[] d;
    public ee0 d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public ee0 e0;
    public final LinearLayout[] f;
    public ee0 f0;
    public boolean g0;
    public final FrameLayout.LayoutParams[] h;
    public CharSequence h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public final ov4 n;
    public float n0;
    public ValueAnimator o0;
    public final z6a p0;
    public final Paint[] q0;
    public final l46[] r;
    public final RadialGradient[] r0;
    public final l46 s;
    public final Matrix[] s0;
    public RadialGradient t0;
    public final Matrix u0;
    public final Paint v0;
    public final TextView w;
    public final TL_stars.starGiftAttributePattern[] w0;
    public int x;
    public final tl[] x0;
    public final FrameLayout y;
    public int y0;
    public float z0;

    public rqa(Context context, wjb wjbVar, Runnable runnable, View.OnClickListener onClickListener, lna lnaVar, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f;
        float f2;
        float f3;
        int i;
        this.d = new be0[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new l46[5];
        this.E = new l46[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new fu4[5];
        this.b0 = new xpa(0, 0);
        this.c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.p0 = new z6a(this, (byte) 22);
        this.q0 = new Paint[3];
        this.r0 = new RadialGradient[3];
        this.s0 = new Matrix[3];
        this.u0 = new Matrix();
        int i2 = 1;
        this.v0 = new Paint(1);
        this.w0 = new TL_stars.starGiftAttributePattern[2];
        this.x0 = new tl[2];
        int i3 = 0;
        while (true) {
            Paint[] paintArr = this.q0;
            if (i3 >= paintArr.length) {
                break;
            }
            paintArr[i3] = new Paint(1);
            i3++;
        }
        int i4 = 0;
        while (true) {
            tl[] tlVarArr = this.x0;
            f = 28.0f;
            if (i4 >= tlVarArr.length) {
                break;
            }
            tlVarArr[i4] = new tl(gl.L(28.0f), this);
            i4++;
        }
        this.A0 = 1.0f;
        this.C0 = new RectF();
        this.E0 = new int[12];
        this.F0 = new int[12];
        this.G0 = new int[12];
        this.a = wjbVar;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.a0 = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i5 = 0;
        while (true) {
            be0[] be0VarArr = this.d;
            float f4 = 0.0f;
            f2 = f;
            if (i5 >= be0VarArr.length) {
                break;
            }
            be0VarArr[i5] = new qr4(context, (byte) 1);
            this.d[i5].setLayerNum(6660);
            if (i5 > 0) {
                this.d[i5].getImageReceiver().t1 = (short) 1;
            }
            this.b.addView(this.d[i5], nme.e(-1, -1, kk7.D1));
            be0 be0Var = this.d[i5];
            if (i5 == 0) {
                f4 = 1.0f;
            }
            be0Var.setAlpha(f4);
            i5++;
            f = f2;
        }
        l46 l46Var = new l46(context, null);
        this.s = l46Var;
        l46Var.setTextSize(1, 12.0f);
        l46Var.setGravity(17);
        zkb.X(l46Var, bkb.F6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setOnClickListener(new nqa(this, (byte) 0));
        ote.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(gl.L(7.0f), 0, gl.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(gl.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        ote.a(textView2);
        pkb pkbVar = new pkb((byte) 18, context, this);
        this.I = pkbVar;
        pkbVar.setOrientation(0);
        this.J = new gw9[3];
        int i6 = 0;
        while (true) {
            gw9[] gw9VarArr = this.J;
            if (i6 >= gw9VarArr.length) {
                break;
            }
            gw9VarArr[i6] = new gw9(context, (byte) 2);
            if (i6 == 0) {
                i = i2;
                this.J[i6].a(R.drawable.filled_gift_send, k96.M0(2131750417, null), false);
                this.J[i6].setOnClickListener(onClickListener2);
            } else if (i6 == i2) {
                i = i2;
                this.J[i6].a(R.drawable.filled_crown_on, k96.M0(2131750409, null), false);
                this.J[i6].setOnClickListener(onClickListener3);
            } else if (i6 != 2) {
                i = i2;
            } else {
                i = i2;
                this.J[i6].a(R.drawable.filled_share, k96.M0(2131750422, null), false);
                this.J[i6].setOnClickListener(onClickListener4);
            }
            this.J[i6].setBackground(bkb.Z(0, 285212671, 16, 16));
            ote.b(this.J[i6], 0.075f, 1.5f);
            pkb pkbVar2 = this.I;
            gw9[] gw9VarArr2 = this.J;
            pkbVar2.addView(gw9VarArr2[i6], nme.q(0, 56, 1.0f, kk7.D1, 0, 0, i6 != gw9VarArr2.length + (-1) ? 11 : 0, 0));
            i6++;
            i2 = i;
        }
        gw9 gw9Var = new gw9(context, (byte) 2);
        this.K = gw9Var;
        gw9Var.a(R.drawable.filled_card_color, k96.M0(2131742865, null), false);
        gw9Var.setBackground(bkb.Z(0, 285212671, 16, 16));
        ote.b(gw9Var, 0.075f, 1.5f);
        gw9Var.setVisibility(8);
        this.I.addView(gw9Var, i2, nme.q(0, 56, 1.0f, kk7.D1, 0, 0, 11, 0));
        this.y = new FrameLayout(context);
        int i7 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f;
            if (i7 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i7] = new LinearLayout(context);
            this.f[i7].setOrientation(1);
            if (i7 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.L = frameLayout;
                this.f[i7].addView(frameLayout, nme.r(-1, kk7.Z1, kk7.D1));
                be0 be0Var2 = new be0(context);
                this.M = be0Var2;
                be0Var2.setRoundRadius(gl.L(41.0f));
                frameLayout.addView(be0Var2, nme.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i7] = new l46(context, null);
                this.r[i7].setTextColor(-1);
                this.r[i7].setTextSize(1, 20.0f);
                this.r[i7].setTypeface(gl.o());
                this.r[i7].setSingleLine();
                l46 l46Var2 = this.r[i7];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                l46Var2.setEllipsize(truncateAt);
                this.r[i7].setGravity(17);
                frameLayout.addView(this.r[i7], nme.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i7] = new l46(context, null);
                this.E[i7].setTextColor(bkb.v0(bkb.i5, wjbVar));
                this.E[i7].setTextSize(1, 14.0f);
                zkb.G(this.E[i7], bkb.Wc, wjbVar);
                this.E[i7].setLineSpacing(gl.L(2.0f), 1.0f);
                this.E[i7].setDisablePaddingsOffsetY(true);
                this.E[i7].setSingleLine();
                this.E[i7].setGravity(17);
                this.E[i7].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i7], nme.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i7 == 4) {
                upa upaVar = new upa(context, wjbVar);
                this.N = upaVar;
                this.f[i7].addView(upaVar, nme.o(-1, -2));
                View view = this.f[i7];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = nme.d(-1, -2.0f, kk7.D1, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i7] = d;
                addView(view, d);
                i7++;
            } else {
                this.r[i7] = new l46(context, null);
                l46[] l46VarArr = this.r;
                if (i7 == 3) {
                    l46VarArr[i7].setTextColor(-1);
                } else {
                    l46VarArr[i7].setTextColor(bkb.v0(bkb.i5, wjbVar));
                }
                this.r[i7].setTextSize(1, 20.0f);
                this.r[i7].setTypeface(gl.o());
                this.r[i7].setGravity(17);
                this.f[i7].addView(this.r[i7], nme.t(-1, -2, 17, 24, i7 == 3 ? 10 : 0, 24, 0));
                if (i7 == 0) {
                    this.f[i7].addView(this.s, nme.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i7].addView(this.w, nme.n(19.33f, -2, 17, 0, 6, 0, 2));
                    this.E[i7] = new l46(context, null);
                    l46[] l46VarArr2 = this.E;
                    if (i7 == 3) {
                        l46VarArr2[i7].setTextColor(bkb.p1(0.75f, -1));
                    } else {
                        l46VarArr2[i7].setTextColor(bkb.v0(bkb.i5, wjbVar));
                    }
                    this.E[i7].setTextSize(1, 14.0f);
                    this.E[i7].setGravity(17);
                    zkb.G(this.E[i7], bkb.Wc, wjbVar);
                    this.E[i7].setLineSpacing(gl.L(2.0f), 1.0f);
                    this.E[i7].setDisablePaddingsOffsetY(true);
                    this.y.addView(this.E[i7], nme.e(-2, -2, 17));
                    this.y.addView(this.P, nme.d(-2, 20.33f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    LinearLayout linearLayout = this.f[i7];
                    FrameLayout frameLayout2 = this.y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    LinearLayout.LayoutParams t = nme.t(-1, -2, 17, 24, 0, 24, i7 == 3 ? 6 : 0);
                    layoutParamsArr2[i7] = t;
                    linearLayout.addView(frameLayout2, t);
                } else {
                    this.E[i7] = new l46(context, null);
                    l46[] l46VarArr3 = this.E;
                    if (i7 == 3) {
                        l46VarArr3[i7].setTextColor(bkb.p1(0.75f, -1));
                    } else {
                        l46VarArr3[i7].setTextColor(bkb.v0(bkb.i5, wjbVar));
                    }
                    this.E[i7].setTextSize(1, 14.0f);
                    this.E[i7].setGravity(17);
                    zkb.G(this.E[i7], bkb.Wc, wjbVar);
                    this.E[i7].setLineSpacing(gl.L(2.0f), 1.0f);
                    this.E[i7].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i7];
                    l46 l46Var3 = this.E[i7];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    LinearLayout.LayoutParams t2 = nme.t(-1, -2, 17, 24, 0, 24, i7 == 3 ? 6 : 0);
                    layoutParamsArr3[i7] = t2;
                    linearLayout2.addView(l46Var3, t2);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i7];
                if (i7 == 3) {
                    f3 = 6.0f;
                } else {
                    f3 = (i7 == 1 ? 7.33f : this.c0[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = gl.L(f3);
                this.G[i7] = new fu4(context);
                this.G[i7].setVisibility(8);
                this.G[i7].setPadding(gl.L(30.0f), gl.L(2.0f), gl.L(30.0f), gl.L(2.0f));
                if (i7 == 0) {
                    this.H = this.G[i7].getTextPaint();
                }
                this.f[i7].addView(this.G[i7], nme.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i7 == 0) {
                this.f[i7].addView(this.I, nme.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i7];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d2 = nme.d(-1, -2.0f, kk7.D1, 16.0f, i7 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i7] = d2;
            addView(view2, d2);
            i7++;
        }
        addView(this.b, nme.d(kk7.p2, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        kqa kqaVar = new kqa(context);
        this.c = kqaVar;
        addView(kqaVar, nme.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(bkb.K(gl.L(f2), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        ote.a(imageView);
        addView(imageView, nme.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new nk3(runnable, (byte) 7));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(bkb.f0(553648127, 1, -1));
        ote.a(imageView2);
        if (lnaVar != null) {
            addView(imageView2, nme.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(lnaVar);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(k96.M0(2131754878, null));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(bkb.f0(553648127, 1, -1));
        ote.a(imageView3);
        addView(imageView3, nme.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        ov4 ov4Var = new ov4(context);
        this.n = ov4Var;
        ov4Var.b(k96.M0(2131749737, null), true);
        qv4 qv4Var = ov4Var.a;
        if (qv4Var.w == null) {
            vva vvaVar = new vva(2, 12);
            qv4Var.w = vvaVar;
            vvaVar.h = 5.0f;
        }
        Path path = qv4Var.f;
        float f5 = qv4Var.s;
        qv4Var.x = true;
        qv4.d(path, f5, true);
        ov4Var.setScaleX(1.2f);
        ov4Var.setScaleY(1.2f);
        addView(ov4Var, nme.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ov4Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new oqa(this, (byte) 1));
        this.B0.addListener(new pqa(this, (byte) 4));
        this.B0.setDuration(320L);
        this.B0.setInterpolator(s33.g);
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
                i2 = bm2.k(bm2.o(bm2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
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
            return bm2.k(bm2.o(bm2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i2);
        }
        if (f5 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f, f2);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i2 = bm2.k(bm2.o(bm2.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
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
        return bm2.k(bm2.o(bm2.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i2);
    }

    public final void c(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.save();
        canvas.translate(f, f2);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int f5 = bm2.f(this.z0, i, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        tl[] tlVarArr = this.x0;
        tlVarArr[1].k(Integer.valueOf(f5));
        ana.a(canvas, 0, tlVarArr[1], f3, f4, this.b0.a(1), this.A0);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(xpa xpaVar) {
        View[] viewArr;
        l46[] l46VarArr;
        float a;
        int i;
        boolean z;
        this.b0 = xpaVar;
        int i2 = 0;
        while (true) {
            viewArr = this.f;
            if (i2 >= viewArr.length) {
                break;
            }
            float a2 = xpaVar.a(i2);
            viewArr[i2].setAlpha(a2);
            viewArr[i2].setVisibility(a2 > 0.0f ? 0 : 4);
            i2++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? xpaVar.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? xpaVar.a(1) : 0.0f);
        ImageView imageView = this.Q;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || xpaVar.b != 2) && (stargiftattributebackdropArr[1] == null || xpaVar.b != 1)) ? 8 : 0);
        boolean z2 = stargiftattributebackdropArr[0] != null || this.T;
        float a3 = xpaVar.a(0);
        byte b = xpaVar.b;
        float T1 = gl.T1(false, z2, a3);
        ImageView imageView2 = this.S;
        imageView2.setAlpha(T1);
        imageView2.setVisibility((z2 && b == 0) ? 0 : 8);
        boolean z3 = stargiftattributebackdropArr[0] != null;
        Boolean bool = this.U;
        int i3 = -1;
        wjb wjbVar = this.a;
        if (bool == null || bool.booleanValue() != z3) {
            this.U = Boolean.valueOf(z3);
            if (z3) {
                imageView2.clearColorFilter();
                imageView2.setBackground(bkb.f0(553648127, 1, -1));
            } else {
                zkb.s(imageView2, bkb.I5, wjbVar, PorterDuff.Mode.SRC_IN);
                int i4 = bkb.h6;
                ff0 f0 = bkb.f0(bkb.v0(i4, wjbVar), 1, -1);
                vkb M = zkb.M(i4);
                imageView2.setBackground(f0);
                zkb.j(imageView2, f0, null, M, wjbVar);
            }
        }
        if (!this.k0) {
            float T12 = gl.T1(false, this.O, xpaVar.a(0));
            TextView textView = this.P;
            textView.setAlpha(T12);
            textView.setScaleX(gl.R1(0.4f, this.O ? 1.0f : 0.4f, xpaVar.a(0)));
            textView.setScaleY(gl.R1(0.4f, this.O ? 1.0f : 0.4f, xpaVar.a(0)));
            textView.setVisibility(!this.O ? 8 : b == 0 ? 0 : 4);
        }
        int v0 = bkb.v0(bkb.i5, wjbVar);
        int i5 = 0;
        while (true) {
            l46VarArr = this.E;
            if (i5 >= 2) {
                break;
            }
            this.r[i5].setTextColor(stargiftattributebackdropArr[Math.min(1, i5)] == null ? v0 : i3);
            l46 l46Var = l46VarArr[i5];
            if (i5 == 0 || i5 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i5];
                i = stargiftattributebackdrop == null ? v0 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i6 = stargiftattributebackdrop2 == null ? v0 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i = bm2.f(this.z0, i6, stargiftattributebackdrop3 == null ? v0 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            l46Var.setTextColor(i);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i5];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                z = (gl.L(184.0f) == layoutParamsArr[i5].topMargin && viewArr[i5].getPaddingBottom() == gl.L(18.0f)) ? false : true;
                if (z) {
                    viewArr[i5].setPadding(0, 0, 0, gl.L(18.0f));
                    layoutParamsArr[i5].topMargin = gl.L(184.0f);
                }
            } else {
                z = (gl.L(170.0f) == layoutParamsArr[i5].topMargin && viewArr[i5].getPaddingBottom() == gl.L(3.0f)) ? false : true;
                if (z) {
                    viewArr[i5].setPadding(0, 0, 0, gl.L(3.0f));
                    layoutParamsArr[i5].topMargin = gl.L(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
            layoutParamsArr2[i5].topMargin = gl.L((i5 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z) {
                viewArr[i5].setLayoutParams(layoutParamsArr[i5]);
                if (i5 == 0) {
                    this.y.setLayoutParams(layoutParamsArr2[i5]);
                } else {
                    l46VarArr[i5].setLayoutParams(layoutParamsArr2[i5]);
                }
            }
            i5++;
            i3 = -1;
        }
        int L = gl.L(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.w.setBackground(bkb.b0(L, stargiftattributebackdrop5 == null ? 553648127 : bm2.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        l46 l46Var2 = l46VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            v0 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        l46Var2.setTextColor(v0);
        be0[] be0VarArr = this.d;
        be0 be0Var = be0VarArr[0];
        xpa xpaVar2 = this.b0;
        be0Var.setAlpha(Math.max((xpaVar2.b(0) && xpaVar2.b(2)) ? 1.0f : Math.max(xpaVar2.a(0), xpaVar2.a(2)), this.b0.a(3)));
        be0VarArr[1].setAlpha((1.0f - this.z0) * xpaVar.a(1));
        be0VarArr[2].setAlpha(xpaVar.a(1) * this.z0);
        float R1 = gl.R1(1.0f, this.n0, xpaVar.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(R1);
        frameLayout.setScaleY(gl.R1(1.0f, this.n0, xpaVar.a(2)));
        frameLayout.setTranslationX(xpaVar.a(2) * this.l0);
        frameLayout.setTranslationY((xpaVar.a(2) * this.m0) + (xpaVar.a(1) * gl.L(16.0f)));
        View view = viewArr[2];
        byte b2 = xpaVar.a;
        if (b2 != 2) {
            b = b2;
        } else if (b == 2) {
            a = 0.0f;
            view.setTranslationY(a);
            int i7 = (this.g0 || !this.b0.b(0)) ? 8 : 0;
            ov4 ov4Var = this.n;
            ov4Var.setVisibility(i7);
            ov4Var.setAlpha(this.b0.a(0));
            int i8 = xpaVar.a(4) <= 0.0f ? 8 : 0;
            upa upaVar = this.N;
            upaVar.setVisibility(i8);
            upaVar.setAlpha(xpaVar.a(4));
            invalidate();
        }
        a = (1.0f - xpaVar.a(2)) * (-(viewArr[b].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        view.setTranslationY(a);
        if (this.g0) {
        }
        ov4 ov4Var2 = this.n;
        ov4Var2.setVisibility(i7);
        ov4Var2.setAlpha(this.b0.a(0));
        if (xpaVar.a(4) <= 0.0f) {
        }
        upa upaVar2 = this.N;
        upaVar2.setVisibility(i8);
        upaVar2.setAlpha(xpaVar.a(4));
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
        rqa rqaVar;
        int i;
        int[] iArr3;
        float f4;
        Canvas canvas2;
        kqa kqaVar;
        float realHeight = getRealHeight();
        canvas.save();
        float f5 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f6 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = gl.L(80.0f) + gl.U1(this.b0.a(1), gl.L(8.0f), gl.L(24.0f));
        xpa xpaVar = this.b0;
        float max = ((xpaVar.b(0) && xpaVar.b(2)) || (xpaVar.b(2) && xpaVar.b(3)) || (xpaVar.b(3) && xpaVar.b(0))) ? 1.0f : Math.max(xpaVar.a(0), Math.max(xpaVar.a(2), xpaVar.a(3)));
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
                iArr6[i2] = bm2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i2] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i2++;
                f5 = f5;
                f6 = f6;
            }
        }
        float f7 = f5;
        float f8 = f6;
        kqa kqaVar2 = this.c;
        if (kqaVar2.s == null && kqaVar2.w == null && kqaVar2.x == null) {
            rqaVar = this;
            f4 = f;
            f3 = f2;
            iArr = iArr5;
            iArr2 = iArr6;
            i = 1;
            canvas2 = canvas;
            kqaVar = kqaVar2;
            iArr3 = iArr4;
        } else {
            float width2 = getWidth();
            float f9 = f2;
            eqa eqaVar = kqaVar2.s;
            float f10 = kqaVar2.y;
            int[] iArr7 = this.F0;
            int[] iArr8 = this.E0;
            int[] iArr9 = this.G0;
            f3 = f9;
            iArr = iArr5;
            iArr2 = iArr6;
            rqaVar = this;
            i = 1;
            iArr3 = iArr4;
            f4 = f;
            canvas2 = canvas;
            kqaVar2.a(canvas2, eqaVar, f10, width2, realHeight, iArr7, iArr8, iArr9);
            kqaVar2.a(canvas2, kqaVar2.w, kqaVar2.E, width2, realHeight, iArr7, iArr8, iArr9);
            kqaVar2.a(canvas2, kqaVar2.x, kqaVar2.F, width2, realHeight, iArr7, iArr8, iArr9);
            kqaVar = kqaVar2;
            rqaVar.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i3 = iArr3[iArr3.length / 2];
            xpa xpaVar2 = rqaVar.b0;
            float max2 = (xpaVar2.b(0) && xpaVar2.b(3)) ? 1.0f : Math.max(xpaVar2.a(0), xpaVar2.a(3));
            tl[] tlVarArr = rqaVar.x0;
            if (max2 > f7) {
                canvas2.save();
                canvas2.translate(f4, f3);
                tlVarArr[0].k(Integer.valueOf(i3));
                float f11 = realHeight;
                ana.a(canvas, 0, tlVarArr[0], rqaVar.getWidth(), f11, max2, 1.0f);
                realHeight = f11;
                canvas.restore();
            }
            if (rqaVar.b0.a(2) > f7) {
                canvas.save();
                tlVarArr[0].k(Integer.valueOf(i3));
                float f12 = realHeight;
                RectF rectF = gl.P;
                LinearLayout[] linearLayoutArr = rqaVar.f;
                float x = linearLayoutArr[2].getX();
                FrameLayout frameLayout = rqaVar.L;
                float x2 = frameLayout.getX() + x;
                be0 be0Var = rqaVar.M;
                rectF.set(be0Var.getX() + x2, be0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), be0Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + be0Var.getWidth(), be0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + be0Var.getHeight());
                ana.c(canvas, tlVarArr[0], rqaVar.getWidth(), f12 * 0.7f, 1.0f, rectF, rqaVar.b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i4 = 0;
            while (true) {
                gw9[] gw9VarArr = rqaVar.J;
                if (i4 > gw9VarArr.length) {
                    break;
                }
                gw9 gw9Var = i4 < gw9VarArr.length ? gw9VarArr[i4] : rqaVar.K;
                int[] iArr10 = iArr2;
                if (bkb.F1(gw9Var.getBackground(), iArr10[Utilities.j(Math.round((((gw9Var.getWidth() / f8) + gw9Var.getX()) / rqaVar.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    gw9Var.invalidate();
                }
                i4++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i5 = iArr11[iArr11.length / 2];
            int i6 = iArr12[iArr12.length / 2];
            TextView textView = rqaVar.w;
            if (textView != null && rqaVar.x != i5) {
                rqaVar.x = i5;
                textView.setTextColor(i5);
                bkb.F1(textView.getBackground(), i6, false);
            }
            if (kqaVar.s != null || kqaVar.w != null || kqaVar.x != null) {
                rqaVar.E[0].setTextColor(i5);
            }
            if (rqaVar.b0.a(2) > f7) {
                if (rqaVar.D0 == null) {
                    rqaVar.D0 = new vva(i, 12);
                }
                FrameLayout frameLayout2 = rqaVar.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f8) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f8;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f8) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f8;
                float f13 = measuredHeight + scaleY;
                RectF rectF2 = rqaVar.C0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f13);
                rqaVar.D0.g(rectF2);
                rqaVar.D0.d();
                rqaVar.D0.a(canvas2, bkb.p1(rqaVar.b0.a(2), -1));
                rqaVar.invalidate();
            }
        }
        if (rqaVar.b0.a(1) > f7) {
            rqaVar.c(f4, f3, rqaVar.getWidth(), rqaVar.getRealHeight(), canvas2);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gl.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.r0;
        radialGradientArr[i] = radialGradient;
        if (i == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, gl.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
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
        nj resellAmount;
        boolean z4;
        char c;
        boolean z5;
        int i2;
        int i3;
        this.O = false;
        boolean z6 = z || z2;
        boolean z7 = starGift instanceof TL_stars.TL_starGiftUnique;
        pkb pkbVar = this.I;
        l46[] l46VarArr = this.E;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        if (z7) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            l46VarArr[0].setTextSize(1, 13.0f);
            pkbVar.setVisibility(z6 ? 0 : 8);
            gw9[] gw9VarArr = this.J;
            gw9VarArr[2].setVisibility(0);
            if (z6) {
                gw9 gw9Var = gw9VarArr[1];
                if (z3) {
                    i2 = R.drawable.filled_crown_off;
                    i3 = 2131750406;
                } else {
                    i2 = R.drawable.filled_crown_on;
                    i3 = 2131750409;
                }
                gw9Var.a(i2, k96.M0(i3, null), false);
            }
            CharSequence charSequence = this.h0;
            float f = 1.0f;
            TextView textView = this.P;
            if (charSequence != null) {
                this.O = true;
                textView.setText(charSequence);
                int L = gl.L(12.0f);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(bkb.b0(L, bm2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                textView.setOnClickListener(null);
                textView.setStateListAnimator(null);
            } else if (starGift.resell_amount != null && !vqa.D1(y6c.t0, starGift)) {
                this.O = true;
                boolean m = cq7.m(starGift);
                oj ojVar = oj.b;
                if (m && starGift.fixed_sale) {
                    resellAmount = starGift.getResellAmount(ojVar);
                } else {
                    resellAmount = starGift.getResellAmount(starGift.resale_ton_only ? ojVar : oj.a);
                }
                char c2 = 2;
                oj ojVar2 = resellAmount.a;
                boolean z8 = false;
                textView.setText(jva.s1(k96.V(null, null, 2131749664, jva.W0(ojVar2 == ojVar, "⭐️ " + ((Object) jva.G0(resellAmount.q(), 1.0f, ',')), resellAmount.a == ojVar ? 1.3f : 1.13f, null)), ojVar2 == ojVar));
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                textView.setBackground(bkb.b0(gl.L(12.0f), bm2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216))));
                if (vqa.F1(y6c.t0, cf3.n(starGift.owner_id))) {
                    textView.setOnClickListener(new nqa(this, (byte) 1));
                    ote.a(textView);
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
                gw9 gw9Var2 = gw9VarArr[1];
                if (!z && !z2) {
                    f = 0.5f;
                }
                gw9Var2.setAlpha(f);
                if (z) {
                    boolean z9 = z4;
                    gw9VarArr[c].a(R.drawable.filled_share, k96.M0(2131750422, null), z9);
                    gw9VarArr[c].setOnClickListener(this.V);
                    z5 = z9;
                } else {
                    ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                    View.OnClickListener onClickListener = this.W;
                    if (arrayList != null) {
                        boolean z10 = z4;
                        gw9VarArr[c].a(R.drawable.filled_gift_sell_off, k96.M0(2131750416, null), z10);
                        gw9VarArr[c].setOnClickListener(onClickListener);
                        z5 = z10;
                    } else {
                        boolean z11 = z4;
                        gw9VarArr[c].a(R.drawable.filled_gift_sell_on, k96.M0(2131750430, null), z11);
                        gw9VarArr[c].setOnClickListener(onClickListener);
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
            gw9 gw9Var22 = gw9VarArr[1];
            if (!z) {
                f = 0.5f;
            }
            gw9Var22.setAlpha(f);
            if (z) {
            }
            this.g0 = starGift.crafted;
            this.n.a.e(stargiftattributebackdropArr[z5 ? 1 : 0], z5, true);
            i = z5;
        } else {
            i = 0;
            stargiftattributebackdropArr[0] = null;
            l46VarArr[0].setTextSize(1, 14.0f);
            this.g0 = false;
            pkbVar.setVisibility(8);
        }
        e(i, stargiftattributebackdropArr[i]);
        jva.e1(this.d[i].getImageReceiver(), starGift, kk7.p2);
        this.e[i] = (TL_stars.starGiftAttributeModel) gta.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
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
            return linearLayoutArr[0].getMeasuredHeight() + gl.L(160.0f) + gl.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.b0.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + gl.L(160.0f) + gl.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.b0.d(2)) {
            L = gl.L(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.b0.d(3)) {
                if (!this.b0.d(4)) {
                    return 0;
                }
                upa upaVar = this.N;
                return upaVar.getMeasuredHeight() > 0 ? upaVar.getMeasuredHeight() : gl.L(550.0f);
            }
            L = gl.L(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + L;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        int L = gl.L(160.0f) + gl.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.b0.a(4) * (this.N.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : gl.L(550.0f))) + (this.b0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + gl.L(160.0f) + gl.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.b0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + gl.L(64.0f))) + (this.b0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + gl.L(160.0f) + gl.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.b0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f = this.z0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        return f > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public be0 getUpgradeImageView() {
        float f = this.z0;
        be0[] be0VarArr = this.d;
        return f > 0.5f ? be0VarArr[2] : be0VarArr[1];
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
        fu4 fu4Var;
        this.r[i].setText(charSequence);
        FrameLayout frameLayout = this.y;
        l46[] l46VarArr = this.E;
        l46 l46Var = this.s;
        TextView textView = this.w;
        if (i == 0) {
            if (!TextUtils.isEmpty(spannableStringBuilder)) {
                textView.setText(spannableStringBuilder);
                textView.setVisibility(0);
                l46Var.setVisibility(8);
                if (i == 0) {
                    frameLayout.setVisibility(8);
                } else {
                    l46VarArr[i].setVisibility(8);
                }
            } else if (!TextUtils.isEmpty(spannableStringBuilder2)) {
                l46Var.setText(spannableStringBuilder2);
                l46Var.setVisibility(0);
                textView.setVisibility(8);
                if (i == 0) {
                    frameLayout.setVisibility(8);
                } else {
                    l46VarArr[i].setVisibility(8);
                }
            }
            fu4[] fu4VarArr = this.G;
            fu4Var = fu4VarArr[i];
            if (fu4Var == null) {
                fu4Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
                fu4VarArr[i].setUser(tLObject);
                fu4VarArr[i].setMessage(spannable);
                return;
            }
            return;
        }
        l46VarArr[i].setText(charSequence2);
        if (i == 0) {
            frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        } else {
            l46VarArr[i].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        }
        l46Var.setVisibility(8);
        textView.setVisibility(8);
        fu4[] fu4VarArr2 = this.G;
        fu4Var = fu4VarArr2[i];
        if (fu4Var == null) {
        }
    }

    public final void i(int i, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z) {
        pkb pkbVar = this.I;
        pkbVar.setVisibility(0);
        gw9[] gw9VarArr = this.J;
        gw9VarArr[0].setAlpha(1.0f);
        gw9VarArr[0].a(R.drawable.filled_gift_send, k96.M0(2131750417, null), false);
        gw9VarArr[0].setOnClickListener(onClickListener);
        int i = onClickListener2 != null ? 0 : 8;
        gw9 gw9Var = this.K;
        gw9Var.setVisibility(i);
        gw9Var.setOnClickListener(onClickListener2);
        gw9VarArr[1].a(R.drawable.filled_crown_on, k96.M0(2131750409, null), false);
        gw9VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) gw9VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z);
        gw9VarArr[2].setVisibility(8);
        pkbVar.requestLayout();
    }

    public final void l() {
        l46[] l46VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        l46 l46Var;
        int i;
        l46[] l46VarArr2 = this.r;
        if (l46VarArr2 == null || (l46VarArr = this.E) == null || (stargiftattributebackdropArr = this.c0) == null) {
            return;
        }
        int v0 = bkb.v0(bkb.i5, this.a);
        for (int i2 = 0; i2 < 2; i2++) {
            l46 l46Var2 = l46VarArr2[i2];
            if (l46Var2 != null && l46VarArr[i2] != null) {
                l46Var2.setTextColor(stargiftattributebackdropArr[Math.min(1, i2)] == null ? v0 : -1);
                l46 l46Var3 = l46VarArr[i2];
                if (i2 == 0 || i2 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i2];
                    i = stargiftattributebackdrop == null ? v0 : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                    int i3 = stargiftattributebackdrop2 == null ? v0 : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                    i = bm2.f(this.z0, i3, stargiftattributebackdrop3 == null ? v0 : stargiftattributebackdrop3.text_color | (-16777216));
                }
                l46Var3.setTextColor(i);
            }
        }
        if (l46VarArr.length <= 2 || (l46Var = l46VarArr[2]) == null) {
            return;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop4 != null) {
            v0 = stargiftattributebackdrop4.text_color | (-16777216);
        }
        l46Var.setTextColor(v0);
    }

    public final void m() {
        boolean z = this.j0;
        gw9[] gw9VarArr = this.J;
        if (z || this.i0) {
            gw9VarArr[0].setAlpha(1.0f);
            gw9VarArr[0].a(R.drawable.filled_gift_send, k96.M0(2131750417, null), false);
            return;
        }
        gw9VarArr[0].setAlpha(0.5f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
        spannableStringBuilder.setSpan(new cm2(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) k96.M0(2131750417, null));
        gw9VarArr[0].a(R.drawable.filled_gift_send, spannableStringBuilder, false);
    }

    public final void n() {
        this.n0 = gl.N(33.33f) / gl.N(160.0f);
        float f = -this.b.getLeft();
        l46[] l46VarArr = this.r;
        this.l0 = ((((Math.min(l46VarArr[2].getPaint().measureText(l46VarArr[2].getText().toString()), l46VarArr[2].getWidth()) + l46VarArr[2].getWidth()) / 2.0f) + (l46VarArr[2].getX() + f)) + gl.L(24.0f)) - (gl.L(126.67f) / 2.0f);
        this.m0 = (gl.L(124.0f) + (-r0.getTop())) - (gl.L(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tl[] tlVarArr = this.x0;
        tlVarArr[0].a();
        tlVarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tl[] tlVarArr = this.x0;
        tlVarArr[0].b();
        tlVarArr[1].b();
        gl.r(this.p0);
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

    public void setPreviewAttributes(gna gnaVar) {
        xpa xpaVar = this.b0;
        if (xpaVar != null && xpaVar.b == 1 && isAttachedToWindow()) {
            gl.r(this.p0);
            ValueAnimator valueAnimator = this.o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o0 = null;
            }
            int i = 1 - this.y0;
            this.y0 = i;
            be0[] be0VarArr = this.d;
            oy8 y = be0VarArr[2 - i].getImageReceiver().y();
            oy8 y2 = be0VarArr[this.y0 + 1].getImageReceiver().y();
            if (y2 != null && y != null) {
                y2.O(false, y.o());
            }
            int i2 = this.y0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = gnaVar.a;
            this.c0[i2] = stargiftattributebackdrop;
            e(i2, stargiftattributebackdrop);
            g(1, gnaVar.b, true);
            int i3 = this.y0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = gnaVar.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i3] = stargiftattributemodel;
            jva.d1(be0VarArr[i3].getImageReceiver(), stargiftattributemodelArr[this.y0 + 1].document, kk7.p2);
            a();
            float f = this.y0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f, f);
            this.o0 = ofFloat;
            ofFloat.addUpdateListener(new oqa(this, (byte) 0));
            this.o0.addListener(new pqa(this, (byte) 3));
            this.o0.setDuration(320L);
            this.o0.setInterpolator(s33.h);
            this.o0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.d0 = new ee0(gta.j(arrayList, TL_stars.starGiftAttributeModel.class));
        this.e0 = new ee0(gta.j(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f0 = new ee0(gta.j(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.z0 = 0.0f;
        this.y0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.e0.b(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.d0.b();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        be0[] be0VarArr = this.d;
        jva.d1(be0VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, kk7.p2);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f0.b();
        this.c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.d0.f;
        jva.d1(be0VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, kk7.p2);
        z6a z6aVar = this.p0;
        gl.r(z6aVar);
        gl.e3(z6aVar, 2500L);
        invalidate();
    }

    public void setResellPrice(nj njVar) {
        boolean l = njVar.l();
        oj ojVar = njVar.a;
        this.O = !l;
        l46[] l46VarArr = this.E;
        TextView textView = this.P;
        if (l) {
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).setListener(new pqa(this, (byte) 2)).setListener(new pqa(this, (byte) 1)).start();
            l46VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(s33Var).start();
        } else {
            oj ojVar2 = oj.b;
            textView.setText(jva.s1(k96.V(null, null, 2131749664, jva.W0(ojVar == ojVar2, "⭐️ " + ((Object) jva.G0(njVar.q(), 1.0f, ',')), ojVar == ojVar2 ? 1.3f : 0.9f, null)), ojVar == ojVar2));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.c0[0];
            textView.setBackground(bkb.b0(gl.L(12.0f), bm2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.k0 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            s33 s33Var2 = s33.h;
            duration2.setInterpolator(s33Var2).setListener(new pqa(this, (byte) 0)).start();
            l46VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(s33Var2).start();
        }
        boolean z = this.O;
        gw9[] gw9VarArr = this.J;
        if (z) {
            gw9VarArr[2].a(R.drawable.filled_gift_sell_off, k96.M0(2131750416, null), true);
        } else {
            gw9VarArr[2].a(R.drawable.filled_gift_sell_on, k96.M0(2131750430, null), true);
        }
        gw9VarArr[2].setOnClickListener(this.W);
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
        gw9 gw9Var = this.J[1];
        if (z) {
            i = R.drawable.filled_card_remove;
            i2 = 2131742858;
        } else {
            i = R.drawable.filled_card_add;
            i2 = 2131742866;
        }
        gw9Var.a(i, k96.M0(i2, null), false);
    }

    public void setWalletDisplayed(boolean z) {
        this.J[1].setAlpha(z ? 1.0f : 0.5f);
    }

    public void setWearPreview(TLObject tLObject) {
        String H;
        String str;
        if (tLObject instanceof TLRPC.User) {
            str = l7c.q((TLRPC.User) tLObject);
            H = k96.M0(2131747633, null);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str2 = chat.title;
            boolean V = hc2.V(chat);
            int i = chat.participants_count;
            H = V ? i > 1 ? k96.H(',', "Subscribers", i) : k96.M0(2131751378, null) : i > 1 ? k96.H(',', "Members", i) : k96.M0(2131754876, null).toLowerCase();
            str = str2;
        }
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        this.M.f(tLObject, pb0Var);
        this.r[2].setText(str);
        this.E[2].setText(H);
        n();
        d(this.b0);
    }

    public void k(int i) {
    }
}
