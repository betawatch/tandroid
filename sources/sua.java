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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class sua extends FrameLayout {
    public float A0;
    public ValueAnimator B0;
    public final RectF C0;
    public yza D0;
    public final p66[] E;
    public final int[] E0;
    public final LinearLayout.LayoutParams[] F;
    public final int[] F0;
    public final jw4[] G;
    public final int[] G0;
    public final TextPaint H;
    public final oob I;
    public final iy9[] J;
    public final iy9 K;
    public final FrameLayout L;
    public final de0 M;
    public final vta N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final vnb a;
    public final View.OnClickListener a0;
    public final FrameLayout b;
    public yta b0;
    public final lua c;
    public final TL_stars.starGiftAttributeBackdrop[] c0;
    public final de0[] d;
    public ge0 d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public ge0 e0;
    public final LinearLayout[] f;
    public ge0 f0;
    public boolean g0;
    public final FrameLayout.LayoutParams[] h;
    public CharSequence h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public final tx4 n;
    public float n0;
    public ValueAnimator o0;
    public final uoa p0;
    public final Paint[] q0;
    public final p66[] r;
    public final RadialGradient[] r0;
    public final p66 s;
    public final Matrix[] s0;
    public RadialGradient t0;
    public final Matrix u0;
    public final Paint v0;
    public final TextView w;
    public final TL_stars.starGiftAttributePattern[] w0;
    public int x;
    public final ul[] x0;
    public final FrameLayout y;
    public int y0;
    public float z0;

    public sua(Context context, vnb vnbVar, Runnable runnable, View.OnClickListener onClickListener, hra hraVar, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f;
        float f2;
        float f3;
        int i;
        this.d = new de0[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new p66[5];
        this.E = new p66[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new jw4[5];
        this.b0 = new yta(0, 0);
        this.c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.p0 = new uoa((Object) this, (byte) 9);
        this.q0 = new Paint[3];
        this.r0 = new RadialGradient[3];
        this.s0 = new Matrix[3];
        this.u0 = new Matrix();
        int i2 = 1;
        this.v0 = new Paint(1);
        int i3 = 2;
        this.w0 = new TL_stars.starGiftAttributePattern[2];
        this.x0 = new ul[2];
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
            ul[] ulVarArr = this.x0;
            f = 28.0f;
            if (i5 >= ulVarArr.length) {
                break;
            }
            ulVarArr[i5] = new ul(hl.L(28.0f), this);
            i5++;
        }
        this.A0 = 1.0f;
        this.C0 = new RectF();
        this.E0 = new int[12];
        this.F0 = new int[12];
        this.G0 = new int[12];
        this.a = vnbVar;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.a0 = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i6 = 0;
        while (true) {
            de0[] de0VarArr = this.d;
            float f4 = 0.0f;
            f2 = f;
            if (i6 >= de0VarArr.length) {
                break;
            }
            de0VarArr[i6] = new ut4(context, (byte) 1);
            this.d[i6].setLayerNum(6660);
            if (i6 > 0) {
                this.d[i6].getImageReceiver().t1 = (short) 1;
            }
            this.b.addView(this.d[i6], tre.e(-1, -1, jn7.D1));
            de0 de0Var = this.d[i6];
            if (i6 == 0) {
                f4 = 1.0f;
            }
            de0Var.setAlpha(f4);
            i6++;
            f = f2;
        }
        p66 p66Var = new p66(context, null);
        this.s = p66Var;
        p66Var.setTextSize(1, 12.0f);
        p66Var.setGravity(17);
        yob.X(p66Var, aob.G6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        p66Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setOnClickListener(new oua(this, (byte) 0));
        iye.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(hl.L(7.0f), 0, hl.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(hl.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        iye.a(textView2);
        oob oobVar = new oob((byte) 18, context, this);
        this.I = oobVar;
        oobVar.setOrientation(0);
        this.J = new iy9[3];
        int i7 = 0;
        while (true) {
            iy9[] iy9VarArr = this.J;
            if (i7 >= iy9VarArr.length) {
                break;
            }
            iy9VarArr[i7] = new iy9(context, (byte) 3);
            if (i7 == 0) {
                i = i2;
                this.J[i7].a(R.drawable.filled_gift_send, ob6.M0(2131750394, null), false);
                this.J[i7].setOnClickListener(onClickListener2);
            } else if (i7 == i2) {
                i = i2;
                this.J[i7].a(R.drawable.filled_crown_on, ob6.M0(2131750386, null), false);
                this.J[i7].setOnClickListener(onClickListener3);
            } else if (i7 != i3) {
                i = i2;
            } else {
                i = i2;
                this.J[i7].a(R.drawable.filled_share, ob6.M0(2131750399, null), false);
                this.J[i7].setOnClickListener(onClickListener4);
            }
            this.J[i7].setBackground(aob.Z(0, 285212671, 16, 16));
            iye.b(this.J[i7], 0.075f, 1.5f);
            oob oobVar2 = this.I;
            iy9[] iy9VarArr2 = this.J;
            oobVar2.addView(iy9VarArr2[i7], tre.q(0, 56, 1.0f, jn7.D1, 0, 0, i7 != iy9VarArr2.length + (-1) ? 11 : 0, 0));
            i7++;
            i2 = i;
            i3 = 2;
        }
        iy9 iy9Var = new iy9(context, (byte) 3);
        this.K = iy9Var;
        iy9Var.a(R.drawable.filled_card_color, ob6.M0(2131742759, null), false);
        iy9Var.setBackground(aob.Z(0, 285212671, 16, 16));
        iye.b(iy9Var, 0.075f, 1.5f);
        iy9Var.setVisibility(8);
        this.I.addView(iy9Var, i2, tre.q(0, 56, 1.0f, jn7.D1, 0, 0, 11, 0));
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
                this.f[i8].addView(frameLayout, tre.r(-1, jn7.Z1, jn7.D1));
                de0 de0Var2 = new de0(context);
                this.M = de0Var2;
                de0Var2.setRoundRadius(hl.L(41.0f));
                frameLayout.addView(de0Var2, tre.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i8] = new p66(context, null);
                this.r[i8].setTextColor(-1);
                this.r[i8].setTextSize(1, 20.0f);
                this.r[i8].setTypeface(hl.o());
                this.r[i8].setSingleLine();
                p66 p66Var2 = this.r[i8];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                p66Var2.setEllipsize(truncateAt);
                this.r[i8].setGravity(17);
                frameLayout.addView(this.r[i8], tre.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i8] = new p66(context, null);
                this.E[i8].setTextColor(aob.v0(aob.j5, vnbVar));
                this.E[i8].setTextSize(1, 14.0f);
                yob.G(this.E[i8], aob.Xc, vnbVar);
                this.E[i8].setLineSpacing(hl.L(2.0f), 1.0f);
                this.E[i8].setDisablePaddingsOffsetY(true);
                this.E[i8].setSingleLine();
                this.E[i8].setGravity(17);
                this.E[i8].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i8], tre.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i8 == 4) {
                vta vtaVar = new vta(context, vnbVar);
                this.N = vtaVar;
                this.f[i8].addView(vtaVar, tre.o(-1, -2));
                View view = this.f[i8];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = tre.d(-1, -2.0f, jn7.D1, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i8] = d;
                addView(view, d);
                i8++;
            } else {
                this.r[i8] = new p66(context, null);
                p66[] p66VarArr = this.r;
                if (i8 == 3) {
                    p66VarArr[i8].setTextColor(-1);
                } else {
                    p66VarArr[i8].setTextColor(aob.v0(aob.j5, vnbVar));
                }
                this.r[i8].setTextSize(1, 20.0f);
                this.r[i8].setTypeface(hl.o());
                this.r[i8].setGravity(17);
                this.f[i8].addView(this.r[i8], tre.t(-1, -2, 17, 24, i8 == 3 ? 10 : 0, 24, 0));
                if (i8 == 0) {
                    this.f[i8].addView(this.s, tre.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i8].addView(this.w, tre.n(19.33f, -2, 17, 0, 6, 0, 2));
                    this.E[i8] = new p66(context, null);
                    p66[] p66VarArr2 = this.E;
                    if (i8 == 3) {
                        p66VarArr2[i8].setTextColor(aob.p1(0.75f, -1));
                    } else {
                        p66VarArr2[i8].setTextColor(aob.v0(aob.j5, vnbVar));
                    }
                    this.E[i8].setTextSize(1, 14.0f);
                    this.E[i8].setGravity(17);
                    yob.G(this.E[i8], aob.Xc, vnbVar);
                    this.E[i8].setLineSpacing(hl.L(2.0f), 1.0f);
                    this.E[i8].setDisablePaddingsOffsetY(true);
                    this.y.addView(this.E[i8], tre.e(-2, -2, 17));
                    this.y.addView(this.P, tre.d(-2, 20.33f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    LinearLayout linearLayout = this.f[i8];
                    FrameLayout frameLayout2 = this.y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    LinearLayout.LayoutParams t = tre.t(-1, -2, 17, 24, 0, 24, i8 == 3 ? 6 : 0);
                    layoutParamsArr2[i8] = t;
                    linearLayout.addView(frameLayout2, t);
                } else {
                    this.E[i8] = new p66(context, null);
                    p66[] p66VarArr3 = this.E;
                    if (i8 == 3) {
                        p66VarArr3[i8].setTextColor(aob.p1(0.75f, -1));
                    } else {
                        p66VarArr3[i8].setTextColor(aob.v0(aob.j5, vnbVar));
                    }
                    this.E[i8].setTextSize(1, 14.0f);
                    this.E[i8].setGravity(17);
                    yob.G(this.E[i8], aob.Xc, vnbVar);
                    this.E[i8].setLineSpacing(hl.L(2.0f), 1.0f);
                    this.E[i8].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i8];
                    p66 p66Var3 = this.E[i8];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    LinearLayout.LayoutParams t2 = tre.t(-1, -2, 17, 24, 0, 24, i8 == 3 ? 6 : 0);
                    layoutParamsArr3[i8] = t2;
                    linearLayout2.addView(p66Var3, t2);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i8];
                if (i8 == 3) {
                    f3 = 6.0f;
                } else {
                    f3 = (i8 == 1 ? 7.33f : this.c0[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = hl.L(f3);
                this.G[i8] = new jw4(context);
                this.G[i8].setVisibility(8);
                this.G[i8].setPadding(hl.L(30.0f), hl.L(2.0f), hl.L(30.0f), hl.L(2.0f));
                if (i8 == 0) {
                    this.H = this.G[i8].getTextPaint();
                }
                this.f[i8].addView(this.G[i8], tre.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i8 == 0) {
                this.f[i8].addView(this.I, tre.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i8];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d2 = tre.d(-1, -2.0f, jn7.D1, 16.0f, i8 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i8] = d2;
            addView(view2, d2);
            i8++;
        }
        addView(this.b, tre.d(jn7.p2, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        lua luaVar = new lua(context);
        this.c = luaVar;
        addView(luaVar, tre.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(aob.K(hl.L(f2), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        iye.a(imageView);
        addView(imageView, tre.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new el3(runnable, (byte) 7));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(aob.f0(553648127, 1, -1));
        iye.a(imageView2);
        if (hraVar != null) {
            addView(imageView2, tre.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(hraVar);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(ob6.M0(2131754874, null));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(aob.f0(553648127, 1, -1));
        iye.a(imageView3);
        addView(imageView3, tre.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        tx4 tx4Var = new tx4(context);
        this.n = tx4Var;
        tx4Var.b(ob6.M0(2131749699, null), true);
        vx4 vx4Var = tx4Var.a;
        if (vx4Var.w == null) {
            yza yzaVar = new yza(2, 12);
            vx4Var.w = yzaVar;
            yzaVar.h = 5.0f;
        }
        Path path = vx4Var.f;
        float f5 = vx4Var.s;
        vx4Var.x = true;
        vx4.d(path, f5, true);
        tx4Var.setScaleX(1.2f);
        tx4Var.setScaleY(1.2f);
        addView(tx4Var, tre.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        tx4Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new pua(this, (byte) 1));
        this.B0.addListener(new qua(this, (byte) 4));
        this.B0.setDuration(320L);
        this.B0.setInterpolator(k43.g);
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
                i2 = vm2.k(vm2.o(vm2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
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
            return vm2.k(vm2.o(vm2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i2);
        }
        if (f5 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f, f2);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i2 = vm2.k(vm2.o(vm2.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
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
        return vm2.k(vm2.o(vm2.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i2);
    }

    public final void c(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.save();
        canvas.translate(f, f2);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int f5 = vm2.f(this.z0, i, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        ul[] ulVarArr = this.x0;
        ulVarArr[1].k(Integer.valueOf(f5));
        xqa.a(canvas, 0, ulVarArr[1], f3, f4, this.b0.a(1), this.A0);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(yta ytaVar) {
        View[] viewArr;
        p66[] p66VarArr;
        float a;
        int i;
        boolean z;
        this.b0 = ytaVar;
        int i2 = 0;
        while (true) {
            viewArr = this.f;
            if (i2 >= viewArr.length) {
                break;
            }
            float a2 = ytaVar.a(i2);
            viewArr[i2].setAlpha(a2);
            viewArr[i2].setVisibility(a2 > 0.0f ? 0 : 4);
            i2++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? ytaVar.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? ytaVar.a(1) : 0.0f);
        ImageView imageView = this.Q;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || ytaVar.b != 2) && (stargiftattributebackdropArr[1] == null || ytaVar.b != 1)) ? 8 : 0);
        boolean z2 = stargiftattributebackdropArr[0] != null || this.T;
        float a3 = ytaVar.a(0);
        byte b = ytaVar.b;
        float T1 = hl.T1(false, z2, a3);
        ImageView imageView2 = this.S;
        imageView2.setAlpha(T1);
        imageView2.setVisibility((z2 && b == 0) ? 0 : 8);
        boolean z3 = stargiftattributebackdropArr[0] != null;
        Boolean bool = this.U;
        int i3 = -1;
        vnb vnbVar = this.a;
        if (bool == null || bool.booleanValue() != z3) {
            this.U = Boolean.valueOf(z3);
            if (z3) {
                imageView2.clearColorFilter();
                imageView2.setBackground(aob.f0(553648127, 1, -1));
            } else {
                yob.s(imageView2, aob.J5, vnbVar, PorterDuff.Mode.SRC_IN);
                int i4 = aob.i6;
                hf0 f0 = aob.f0(aob.v0(i4, vnbVar), 1, -1);
                uob M = yob.M(i4);
                imageView2.setBackground(f0);
                yob.j(imageView2, f0, null, M, vnbVar);
            }
        }
        if (!this.k0) {
            float T12 = hl.T1(false, this.O, ytaVar.a(0));
            TextView textView = this.P;
            textView.setAlpha(T12);
            textView.setScaleX(hl.R1(0.4f, this.O ? 1.0f : 0.4f, ytaVar.a(0)));
            textView.setScaleY(hl.R1(0.4f, this.O ? 1.0f : 0.4f, ytaVar.a(0)));
            textView.setVisibility(!this.O ? 8 : b == 0 ? 0 : 4);
        }
        int v0 = aob.v0(aob.j5, vnbVar);
        int i5 = 0;
        while (true) {
            p66VarArr = this.E;
            if (i5 >= 2) {
                break;
            }
            this.r[i5].setTextColor(stargiftattributebackdropArr[Math.min(1, i5)] == null ? v0 : i3);
            p66 p66Var = p66VarArr[i5];
            if (i5 == 0 || i5 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i5];
                i = stargiftattributebackdrop == null ? v0 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i6 = stargiftattributebackdrop2 == null ? v0 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i = vm2.f(this.z0, i6, stargiftattributebackdrop3 == null ? v0 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            p66Var.setTextColor(i);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i5];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                z = (hl.L(184.0f) == layoutParamsArr[i5].topMargin && viewArr[i5].getPaddingBottom() == hl.L(18.0f)) ? false : true;
                if (z) {
                    viewArr[i5].setPadding(0, 0, 0, hl.L(18.0f));
                    layoutParamsArr[i5].topMargin = hl.L(184.0f);
                }
            } else {
                z = (hl.L(170.0f) == layoutParamsArr[i5].topMargin && viewArr[i5].getPaddingBottom() == hl.L(3.0f)) ? false : true;
                if (z) {
                    viewArr[i5].setPadding(0, 0, 0, hl.L(3.0f));
                    layoutParamsArr[i5].topMargin = hl.L(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
            layoutParamsArr2[i5].topMargin = hl.L((i5 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z) {
                viewArr[i5].setLayoutParams(layoutParamsArr[i5]);
                if (i5 == 0) {
                    this.y.setLayoutParams(layoutParamsArr2[i5]);
                } else {
                    p66VarArr[i5].setLayoutParams(layoutParamsArr2[i5]);
                }
            }
            i5++;
            i3 = -1;
        }
        int L = hl.L(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.w.setBackground(aob.b0(L, stargiftattributebackdrop5 == null ? 553648127 : vm2.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        p66 p66Var2 = p66VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            v0 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        p66Var2.setTextColor(v0);
        de0[] de0VarArr = this.d;
        de0 de0Var = de0VarArr[0];
        yta ytaVar2 = this.b0;
        de0Var.setAlpha(Math.max((ytaVar2.b(0) && ytaVar2.b(2)) ? 1.0f : Math.max(ytaVar2.a(0), ytaVar2.a(2)), this.b0.a(3)));
        de0VarArr[1].setAlpha((1.0f - this.z0) * ytaVar.a(1));
        de0VarArr[2].setAlpha(ytaVar.a(1) * this.z0);
        float R1 = hl.R1(1.0f, this.n0, ytaVar.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(R1);
        frameLayout.setScaleY(hl.R1(1.0f, this.n0, ytaVar.a(2)));
        frameLayout.setTranslationX(ytaVar.a(2) * this.l0);
        frameLayout.setTranslationY((ytaVar.a(2) * this.m0) + (ytaVar.a(1) * hl.L(16.0f)));
        View view = viewArr[2];
        byte b2 = ytaVar.a;
        if (b2 != 2) {
            b = b2;
        } else if (b == 2) {
            a = 0.0f;
            view.setTranslationY(a);
            int i7 = (this.g0 || !this.b0.b(0)) ? 8 : 0;
            tx4 tx4Var = this.n;
            tx4Var.setVisibility(i7);
            tx4Var.setAlpha(this.b0.a(0));
            int i8 = ytaVar.a(4) <= 0.0f ? 8 : 0;
            vta vtaVar = this.N;
            vtaVar.setVisibility(i8);
            vtaVar.setAlpha(ytaVar.a(4));
            invalidate();
        }
        a = (1.0f - ytaVar.a(2)) * (-(viewArr[b].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        view.setTranslationY(a);
        if (this.g0) {
        }
        tx4 tx4Var2 = this.n;
        tx4Var2.setVisibility(i7);
        tx4Var2.setAlpha(this.b0.a(0));
        if (ytaVar.a(4) <= 0.0f) {
        }
        vta vtaVar2 = this.N;
        vtaVar2.setVisibility(i8);
        vtaVar2.setAlpha(ytaVar.a(4));
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
        sua suaVar;
        int i;
        int[] iArr3;
        float f4;
        Canvas canvas2;
        lua luaVar;
        float realHeight = getRealHeight();
        canvas.save();
        float f5 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f6 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = hl.L(80.0f) + hl.U1(this.b0.a(1), hl.L(8.0f), hl.L(24.0f));
        yta ytaVar = this.b0;
        float max = ((ytaVar.b(0) && ytaVar.b(2)) || (ytaVar.b(2) && ytaVar.b(3)) || (ytaVar.b(3) && ytaVar.b(0))) ? 1.0f : Math.max(ytaVar.a(0), Math.max(ytaVar.a(2), ytaVar.a(3)));
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
                iArr6[i2] = vm2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i2] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i2++;
                f5 = f5;
                f6 = f6;
            }
        }
        float f7 = f5;
        float f8 = f6;
        lua luaVar2 = this.c;
        if (luaVar2.s == null && luaVar2.w == null && luaVar2.x == null) {
            suaVar = this;
            f4 = f;
            f3 = f2;
            iArr = iArr5;
            iArr2 = iArr6;
            i = 1;
            canvas2 = canvas;
            luaVar = luaVar2;
            iArr3 = iArr4;
        } else {
            float width2 = getWidth();
            float f9 = f2;
            fua fuaVar = luaVar2.s;
            float f10 = luaVar2.y;
            int[] iArr7 = this.F0;
            int[] iArr8 = this.E0;
            int[] iArr9 = this.G0;
            f3 = f9;
            iArr = iArr5;
            iArr2 = iArr6;
            suaVar = this;
            i = 1;
            iArr3 = iArr4;
            f4 = f;
            canvas2 = canvas;
            luaVar2.a(canvas2, fuaVar, f10, width2, realHeight, iArr7, iArr8, iArr9);
            luaVar2.a(canvas2, luaVar2.w, luaVar2.E, width2, realHeight, iArr7, iArr8, iArr9);
            luaVar2.a(canvas2, luaVar2.x, luaVar2.F, width2, realHeight, iArr7, iArr8, iArr9);
            luaVar = luaVar2;
            suaVar.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i3 = iArr3[iArr3.length / 2];
            yta ytaVar2 = suaVar.b0;
            float max2 = (ytaVar2.b(0) && ytaVar2.b(3)) ? 1.0f : Math.max(ytaVar2.a(0), ytaVar2.a(3));
            ul[] ulVarArr = suaVar.x0;
            if (max2 > f7) {
                canvas2.save();
                canvas2.translate(f4, f3);
                ulVarArr[0].k(Integer.valueOf(i3));
                float f11 = realHeight;
                xqa.a(canvas, 0, ulVarArr[0], suaVar.getWidth(), f11, max2, 1.0f);
                realHeight = f11;
                canvas.restore();
            }
            if (suaVar.b0.a(2) > f7) {
                canvas.save();
                ulVarArr[0].k(Integer.valueOf(i3));
                float f12 = realHeight;
                RectF rectF = hl.P;
                LinearLayout[] linearLayoutArr = suaVar.f;
                float x = linearLayoutArr[2].getX();
                FrameLayout frameLayout = suaVar.L;
                float x2 = frameLayout.getX() + x;
                de0 de0Var = suaVar.M;
                rectF.set(de0Var.getX() + x2, de0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), de0Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + de0Var.getWidth(), de0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + de0Var.getHeight());
                xqa.c(canvas, ulVarArr[0], suaVar.getWidth(), f12 * 0.7f, 1.0f, rectF, suaVar.b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i4 = 0;
            while (true) {
                iy9[] iy9VarArr = suaVar.J;
                if (i4 > iy9VarArr.length) {
                    break;
                }
                iy9 iy9Var = i4 < iy9VarArr.length ? iy9VarArr[i4] : suaVar.K;
                int[] iArr10 = iArr2;
                if (aob.F1(iy9Var.getBackground(), iArr10[Utilities.j(Math.round((((iy9Var.getWidth() / f8) + iy9Var.getX()) / suaVar.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    iy9Var.invalidate();
                }
                i4++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i5 = iArr11[iArr11.length / 2];
            int i6 = iArr12[iArr12.length / 2];
            TextView textView = suaVar.w;
            if (textView != null && suaVar.x != i5) {
                suaVar.x = i5;
                textView.setTextColor(i5);
                aob.F1(textView.getBackground(), i6, false);
            }
            if (luaVar.s != null || luaVar.w != null || luaVar.x != null) {
                suaVar.E[0].setTextColor(i5);
            }
            if (suaVar.b0.a(2) > f7) {
                if (suaVar.D0 == null) {
                    suaVar.D0 = new yza(i, 12);
                }
                FrameLayout frameLayout2 = suaVar.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f8) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f8;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f8) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f8;
                float f13 = measuredHeight + scaleY;
                RectF rectF2 = suaVar.C0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f13);
                suaVar.D0.g(rectF2);
                suaVar.D0.d();
                suaVar.D0.a(canvas2, aob.p1(suaVar.b0.a(2), -1));
                suaVar.invalidate();
            }
        }
        if (suaVar.b0.a(1) > f7) {
            suaVar.c(f4, f3, suaVar.getWidth(), suaVar.getRealHeight(), canvas2);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, hl.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.r0;
        radialGradientArr[i] = radialGradient;
        if (i == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, hl.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
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
        oj resellAmount;
        boolean z4;
        char c;
        boolean z5;
        int i2;
        int i3;
        this.O = false;
        boolean z6 = z || z2;
        boolean z7 = starGift instanceof TL_stars.TL_starGiftUnique;
        oob oobVar = this.I;
        p66[] p66VarArr = this.E;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        if (z7) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) jxa.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) jxa.i(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            p66VarArr[0].setTextSize(1, 13.0f);
            oobVar.setVisibility(z6 ? 0 : 8);
            iy9[] iy9VarArr = this.J;
            iy9VarArr[2].setVisibility(0);
            if (z6) {
                iy9 iy9Var = iy9VarArr[1];
                if (z3) {
                    i2 = R.drawable.filled_crown_off;
                    i3 = 2131750383;
                } else {
                    i2 = R.drawable.filled_crown_on;
                    i3 = 2131750386;
                }
                iy9Var.a(i2, ob6.M0(i3, null), false);
            }
            CharSequence charSequence = this.h0;
            float f = 1.0f;
            TextView textView = this.P;
            if (charSequence != null) {
                this.O = true;
                textView.setText(charSequence);
                int L = hl.L(12.0f);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(aob.b0(L, vm2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                textView.setOnClickListener(null);
                textView.setStateListAnimator(null);
            } else if (starGift.resell_amount != null && !wua.E1(yac.t0, starGift)) {
                this.O = true;
                boolean n = it7.n(starGift);
                pj pjVar = pj.b;
                if (n && starGift.fixed_sale) {
                    resellAmount = starGift.getResellAmount(pjVar);
                } else {
                    resellAmount = starGift.getResellAmount(starGift.resale_ton_only ? pjVar : pj.a);
                }
                char c2 = 2;
                pj pjVar2 = resellAmount.a;
                boolean z8 = false;
                textView.setText(nza.t1(ob6.V(null, null, 2131749626, nza.X0(pjVar2 == pjVar, "⭐️ " + ((Object) nza.H0(resellAmount.q(), 1.0f, ',')), resellAmount.a == pjVar ? 1.3f : 1.13f, null)), pjVar2 == pjVar));
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                textView.setBackground(aob.b0(hl.L(12.0f), vm2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216))));
                if (wua.G1(yac.t0, wf3.n(starGift.owner_id))) {
                    textView.setOnClickListener(new oua(this, (byte) 1));
                    iye.a(textView);
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
                iy9 iy9Var2 = iy9VarArr[1];
                if (!z && !z2) {
                    f = 0.5f;
                }
                iy9Var2.setAlpha(f);
                if (z) {
                    boolean z9 = z4;
                    iy9VarArr[c].a(R.drawable.filled_share, ob6.M0(2131750399, null), z9);
                    iy9VarArr[c].setOnClickListener(this.V);
                    z5 = z9;
                } else {
                    ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                    View.OnClickListener onClickListener = this.W;
                    if (arrayList != null) {
                        boolean z10 = z4;
                        iy9VarArr[c].a(R.drawable.filled_gift_sell_off, ob6.M0(2131750393, null), z10);
                        iy9VarArr[c].setOnClickListener(onClickListener);
                        z5 = z10;
                    } else {
                        boolean z11 = z4;
                        iy9VarArr[c].a(R.drawable.filled_gift_sell_on, ob6.M0(2131750407, null), z11);
                        iy9VarArr[c].setOnClickListener(onClickListener);
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
            iy9 iy9Var22 = iy9VarArr[1];
            if (!z) {
                f = 0.5f;
            }
            iy9Var22.setAlpha(f);
            if (z) {
            }
            this.g0 = starGift.crafted;
            this.n.a.e(stargiftattributebackdropArr[z5 ? 1 : 0], z5, true);
            i = z5;
        } else {
            i = 0;
            stargiftattributebackdropArr[0] = null;
            p66VarArr[0].setTextSize(1, 14.0f);
            this.g0 = false;
            oobVar.setVisibility(8);
        }
        e(i, stargiftattributebackdropArr[i]);
        nza.f1(this.d[i].getImageReceiver(), starGift, jn7.p2);
        this.e[i] = (TL_stars.starGiftAttributeModel) jxa.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
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
            return linearLayoutArr[0].getMeasuredHeight() + hl.L(160.0f) + hl.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.b0.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + hl.L(160.0f) + hl.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.b0.d(2)) {
            L = hl.L(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.b0.d(3)) {
                if (!this.b0.d(4)) {
                    return 0;
                }
                vta vtaVar = this.N;
                return vtaVar.getMeasuredHeight() > 0 ? vtaVar.getMeasuredHeight() : hl.L(550.0f);
            }
            L = hl.L(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + L;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        int L = hl.L(160.0f) + hl.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.b0.a(4) * (this.N.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : hl.L(550.0f))) + (this.b0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + hl.L(160.0f) + hl.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.b0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + hl.L(64.0f))) + (this.b0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + hl.L(160.0f) + hl.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.b0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f = this.z0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        return f > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public de0 getUpgradeImageView() {
        float f = this.z0;
        de0[] de0VarArr = this.d;
        return f > 0.5f ? de0VarArr[2] : de0VarArr[1];
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
        jw4 jw4Var;
        this.r[i].setText(charSequence);
        FrameLayout frameLayout = this.y;
        p66[] p66VarArr = this.E;
        p66 p66Var = this.s;
        TextView textView = this.w;
        if (i == 0) {
            if (!TextUtils.isEmpty(spannableStringBuilder)) {
                textView.setText(spannableStringBuilder);
                textView.setVisibility(0);
                p66Var.setVisibility(8);
                if (i == 0) {
                    frameLayout.setVisibility(8);
                } else {
                    p66VarArr[i].setVisibility(8);
                }
            } else if (!TextUtils.isEmpty(spannableStringBuilder2)) {
                p66Var.setText(spannableStringBuilder2);
                p66Var.setVisibility(0);
                textView.setVisibility(8);
                if (i == 0) {
                    frameLayout.setVisibility(8);
                } else {
                    p66VarArr[i].setVisibility(8);
                }
            }
            jw4[] jw4VarArr = this.G;
            jw4Var = jw4VarArr[i];
            if (jw4Var == null) {
                jw4Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
                jw4VarArr[i].setUser(tLObject);
                jw4VarArr[i].setMessage(spannable);
                return;
            }
            return;
        }
        p66VarArr[i].setText(charSequence2);
        if (i == 0) {
            frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        } else {
            p66VarArr[i].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        }
        p66Var.setVisibility(8);
        textView.setVisibility(8);
        jw4[] jw4VarArr2 = this.G;
        jw4Var = jw4VarArr2[i];
        if (jw4Var == null) {
        }
    }

    public final void i(int i, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z) {
        oob oobVar = this.I;
        oobVar.setVisibility(0);
        iy9[] iy9VarArr = this.J;
        iy9VarArr[0].setAlpha(1.0f);
        iy9VarArr[0].a(R.drawable.filled_gift_send, ob6.M0(2131750394, null), false);
        iy9VarArr[0].setOnClickListener(onClickListener);
        int i = onClickListener2 != null ? 0 : 8;
        iy9 iy9Var = this.K;
        iy9Var.setVisibility(i);
        iy9Var.setOnClickListener(onClickListener2);
        iy9VarArr[1].a(R.drawable.filled_crown_on, ob6.M0(2131750386, null), false);
        iy9VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) iy9VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z);
        iy9VarArr[2].setVisibility(8);
        oobVar.requestLayout();
    }

    public final void l() {
        p66[] p66VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        p66 p66Var;
        int i;
        p66[] p66VarArr2 = this.r;
        if (p66VarArr2 == null || (p66VarArr = this.E) == null || (stargiftattributebackdropArr = this.c0) == null) {
            return;
        }
        int v0 = aob.v0(aob.j5, this.a);
        for (int i2 = 0; i2 < 2; i2++) {
            p66 p66Var2 = p66VarArr2[i2];
            if (p66Var2 != null && p66VarArr[i2] != null) {
                p66Var2.setTextColor(stargiftattributebackdropArr[Math.min(1, i2)] == null ? v0 : -1);
                p66 p66Var3 = p66VarArr[i2];
                if (i2 == 0 || i2 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i2];
                    i = stargiftattributebackdrop == null ? v0 : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                    int i3 = stargiftattributebackdrop2 == null ? v0 : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                    i = vm2.f(this.z0, i3, stargiftattributebackdrop3 == null ? v0 : stargiftattributebackdrop3.text_color | (-16777216));
                }
                p66Var3.setTextColor(i);
            }
        }
        if (p66VarArr.length <= 2 || (p66Var = p66VarArr[2]) == null) {
            return;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop4 != null) {
            v0 = stargiftattributebackdrop4.text_color | (-16777216);
        }
        p66Var.setTextColor(v0);
    }

    public final void m() {
        boolean z = this.j0;
        iy9[] iy9VarArr = this.J;
        if (z || this.i0) {
            iy9VarArr[0].setAlpha(1.0f);
            iy9VarArr[0].a(R.drawable.filled_gift_send, ob6.M0(2131750394, null), false);
            return;
        }
        iy9VarArr[0].setAlpha(0.5f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
        spannableStringBuilder.setSpan(new wm2(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) ob6.M0(2131750394, null));
        iy9VarArr[0].a(R.drawable.filled_gift_send, spannableStringBuilder, false);
    }

    public final void n() {
        this.n0 = hl.N(33.33f) / hl.N(160.0f);
        float f = -this.b.getLeft();
        p66[] p66VarArr = this.r;
        this.l0 = ((((Math.min(p66VarArr[2].getPaint().measureText(p66VarArr[2].getText().toString()), p66VarArr[2].getWidth()) + p66VarArr[2].getWidth()) / 2.0f) + (p66VarArr[2].getX() + f)) + hl.L(24.0f)) - (hl.L(126.67f) / 2.0f);
        this.m0 = (hl.L(124.0f) + (-r0.getTop())) - (hl.L(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ul[] ulVarArr = this.x0;
        ulVarArr[0].a();
        ulVarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ul[] ulVarArr = this.x0;
        ulVarArr[0].b();
        ulVarArr[1].b();
        hl.r(this.p0);
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

    public void setPreviewAttributes(cra craVar) {
        yta ytaVar = this.b0;
        if (ytaVar != null && ytaVar.b == 1 && isAttachedToWindow()) {
            hl.r(this.p0);
            ValueAnimator valueAnimator = this.o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o0 = null;
            }
            int i = 1 - this.y0;
            this.y0 = i;
            de0[] de0VarArr = this.d;
            b29 y = de0VarArr[2 - i].getImageReceiver().y();
            b29 y2 = de0VarArr[this.y0 + 1].getImageReceiver().y();
            if (y2 != null && y != null) {
                y2.O(false, y.o());
            }
            int i2 = this.y0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = craVar.a;
            this.c0[i2] = stargiftattributebackdrop;
            e(i2, stargiftattributebackdrop);
            g(1, craVar.b, true);
            int i3 = this.y0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = craVar.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i3] = stargiftattributemodel;
            nza.e1(de0VarArr[i3].getImageReceiver(), stargiftattributemodelArr[this.y0 + 1].document, jn7.p2);
            a();
            float f = this.y0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f, f);
            this.o0 = ofFloat;
            ofFloat.addUpdateListener(new pua(this, (byte) 0));
            this.o0.addListener(new qua(this, (byte) 3));
            this.o0.setDuration(320L);
            this.o0.setInterpolator(k43.h);
            this.o0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.d0 = new ge0(jxa.j(arrayList, TL_stars.starGiftAttributeModel.class));
        this.e0 = new ge0(jxa.j(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f0 = new ge0(jxa.j(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.z0 = 0.0f;
        this.y0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.e0.b(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.d0.b();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        de0[] de0VarArr = this.d;
        nza.e1(de0VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, jn7.p2);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f0.b();
        this.c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.d0.f;
        nza.e1(de0VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, jn7.p2);
        uoa uoaVar = this.p0;
        hl.r(uoaVar);
        hl.d3(uoaVar, 2500L);
        invalidate();
    }

    public void setResellPrice(oj ojVar) {
        boolean l = ojVar.l();
        pj pjVar = ojVar.a;
        this.O = !l;
        p66[] p66VarArr = this.E;
        TextView textView = this.P;
        if (l) {
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).setListener(new qua(this, (byte) 2)).setListener(new qua(this, (byte) 1)).start();
            p66VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(k43Var).start();
        } else {
            pj pjVar2 = pj.b;
            textView.setText(nza.t1(ob6.V(null, null, 2131749626, nza.X0(pjVar == pjVar2, "⭐️ " + ((Object) nza.H0(ojVar.q(), 1.0f, ',')), pjVar == pjVar2 ? 1.3f : 0.9f, null)), pjVar == pjVar2));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.c0[0];
            textView.setBackground(aob.b0(hl.L(12.0f), vm2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.k0 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            k43 k43Var2 = k43.h;
            duration2.setInterpolator(k43Var2).setListener(new qua(this, (byte) 0)).start();
            p66VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(k43Var2).start();
        }
        boolean z = this.O;
        iy9[] iy9VarArr = this.J;
        if (z) {
            iy9VarArr[2].a(R.drawable.filled_gift_sell_off, ob6.M0(2131750393, null), true);
        } else {
            iy9VarArr[2].a(R.drawable.filled_gift_sell_on, ob6.M0(2131750407, null), true);
        }
        iy9VarArr[2].setOnClickListener(this.W);
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
        iy9 iy9Var = this.J[1];
        if (z) {
            i = R.drawable.filled_card_remove;
            i2 = 2131742752;
        } else {
            i = R.drawable.filled_card_add;
            i2 = 2131742760;
        }
        iy9Var.a(i, ob6.M0(i2, null), false);
    }

    public void setWalletDisplayed(boolean z) {
        this.J[1].setAlpha(z ? 1.0f : 0.5f);
    }

    public void setWearPreview(TLObject tLObject) {
        String H;
        String str;
        if (tLObject instanceof TLRPC.User) {
            str = lbc.r((TLRPC.User) tLObject);
            H = ob6.M0(2131747553, null);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str2 = chat.title;
            boolean V = xc2.V(chat);
            int i = chat.participants_count;
            H = V ? i > 1 ? ob6.H(',', "Subscribers", i) : ob6.M0(2131751355, null) : i > 1 ? ob6.H(',', "Members", i) : ob6.M0(2131754872, null).toLowerCase();
            str = str2;
        }
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        this.M.f(tLObject, rb0Var);
        this.r[2].setText(str);
        this.E[2].setText(H);
        n();
        d(this.b0);
    }

    public void k(int i) {
    }
}
