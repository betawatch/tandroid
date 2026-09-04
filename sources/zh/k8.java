package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q20;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public abstract class k8 extends View {
    public final Matrix E;
    public boolean F;
    public final Drawable G;
    public final org.telegram.ui.Components.p6 H;
    public final org.telegram.ui.Components.p6 I;
    public final nq[] J;
    public final Paint K;
    public final f01 L;
    public final org.telegram.ui.Components.e6 M;
    public final org.telegram.ui.Components.e6 N;
    public boolean O;
    public long P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final Path U;
    public final Path V;
    public final Path W;
    public final org.telegram.ui.ActionBar.f6 a;
    public final RectF a0;
    public final Paint b;
    public final Path b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public float d0;
    public final Paint e;
    public int[] e0;
    public final Paint f;
    public final le.b f0;
    public float g0;
    public final h8 h;
    public float h0;
    public long i0;
    public int j0;
    public boolean k0;
    public ValueAnimator l0;
    public final h8 n;
    public int r;
    public int s;
    public ValueAnimator v;
    public int w;
    public int x;
    public LinearGradient y;

    public k8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.h = new h8(0, 300);
        this.n = new h8(2, 30);
        this.r = -1135603;
        this.s = -404714;
        this.w = -1135603;
        this.x = -404714;
        this.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = new Matrix();
        this.F = true;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.H = p6Var;
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, true, true, false);
        this.I = p6Var2;
        this.J = new nq[1];
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new f01(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        pr prVar = pr.h;
        this.M = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.N = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.P = -1L;
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new Path();
        this.V = new Path();
        this.W = new Path();
        this.a0 = new RectF();
        this.b0 = new Path();
        this.c0 = 0.0f;
        this.f0 = new le.b(this, prVar, 320L);
        this.a = f6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.G = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        p6Var.r(-1);
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.t(AndroidUtilities.dp(21.0f));
        p6Var.setCallback(this);
        p6Var.G = AndroidUtilities.displaySize.x;
        p6Var.b = 17;
        p6Var2.r(-570425345);
        p6Var2.t(AndroidUtilities.dp(11.0f));
        p6Var2.setCallback(this);
        p6Var2.G = AndroidUtilities.displaySize.x;
        p6Var2.b = 17;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c0, f7);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new ki.a(this, 27));
        int value = getValue();
        this.l0.addListener(new h00(this, f7, value));
        this.l0.setDuration(320L);
        this.l0.setInterpolator(pr.h);
        this.l0.start();
        if (c(f7) != value) {
            e(c(f7));
        }
        org.telegram.ui.Components.p6 p6Var = this.H;
        p6Var.b();
        p6Var.q(v7.V0(false, LocaleController.formatNumber(c(f7), ','), this.J), true, true);
    }

    public final float b(int i10) {
        int i11 = 1;
        while (true) {
            int[] iArr = this.e0;
            if (i11 >= iArr.length) {
                return 1.0f;
            }
            if (i10 <= iArr[i11]) {
                int i12 = i11 - 1;
                int i13 = iArr[i12];
                return (i12 + ((i10 - i13) / (r3 - i13))) / (iArr.length - 1);
            }
            i11++;
        }
    }

    public final int c(float f7) {
        if (f7 <= 0.0f) {
            return this.e0[0];
        }
        if (f7 >= 1.0f) {
            return this.e0[r7.length - 1];
        }
        int[] iArr = this.e0;
        float length = f7 * (iArr.length - 1);
        int i10 = (int) length;
        float f10 = length - i10;
        float f11 = iArr[i10];
        int i11 = i10 + 1;
        if (i11 < iArr.length) {
            i10 = i11;
        }
        return Math.round((f10 * (iArr[i10] - r2)) + f11);
    }

    public boolean d(float f7) {
        return false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.e6 e6Var;
        RectF rectF;
        Paint paint;
        float f7;
        int i10;
        Path.Direction direction;
        Paint paint2;
        org.telegram.ui.Components.e6 e6Var2;
        Canvas canvas2;
        int i11;
        float f10;
        super.dispatchDraw(canvas);
        Matrix matrix = this.E;
        matrix.reset();
        RectF rectF2 = this.Q;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.y.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.y;
        Paint paint3 = this.c;
        paint3.setShader(linearGradient);
        int d = i0.a.d(this.c0, this.r, this.s);
        Path path = this.U;
        path.rewind();
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(12.0f);
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF2, dp, dp2, direction2);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, this.r);
        Paint paint4 = this.b;
        paint4.setColor(l1);
        canvas.drawPath(path, paint4);
        RectF rectF3 = this.R;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(24.0f), rectF3.right, b10);
        Path path2 = this.V;
        path2.rewind();
        path2.addRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        h8 h8Var = this.h;
        h8Var.g(rectF2);
        float f11 = this.c0;
        h8Var.h = (f11 * 15.0f) + 1.0f;
        h8Var.j = (int) (h8Var.b.size() * ((f11 * 0.85f) + 0.15f));
        h8Var.d();
        canvas.save();
        canvas.clipPath(path);
        h8Var.a(canvas, d);
        long j3 = this.P;
        org.telegram.ui.Components.e6 e6Var3 = this.N;
        org.telegram.ui.Components.e6 e6Var4 = this.M;
        f01 f01Var = this.L;
        Paint paint5 = this.K;
        if (j3 == -1 || b((int) j3) >= 1.0f || b((int) this.P) <= 0.0f) {
            e6Var = e6Var3;
            rectF = rectF3;
            paint = paint4;
            f7 = b10;
            i10 = d;
            direction = direction2;
            paint2 = paint5;
            e6Var2 = e6Var4;
            canvas2 = canvas;
        } else {
            float clamp01 = (Utilities.clamp01(b((int) this.P)) * (rectF2.width() - AndroidUtilities.dp(24.0f))) + rectF2.left + AndroidUtilities.dp(12.0f);
            float e7 = e6Var4.e(Math.abs((rectF3.right - ((float) AndroidUtilities.dp(10.0f))) - clamp01) < ((float) AndroidUtilities.dp(14.0f)));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), e6Var3.e(Math.abs((rectF3.right - ((float) AndroidUtilities.dp(10.0f))) - clamp01) < ((float) AndroidUtilities.dp(12.0f))));
            float f12 = (clamp01 + f01Var.c) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF2.right ? (clamp01 - lerp) - f01Var.c : clamp01 + lerp;
            paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.j6.l1(0.6f, d));
            e6Var = e6Var3;
            paint = paint4;
            rectF = rectF3;
            f7 = b10;
            i10 = d;
            e6Var2 = e6Var4;
            canvas.drawLine(clamp01, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e7), clamp01, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e7), paint5);
            direction = direction2;
            paint2 = paint5;
            this.L.c(f12, rectF2.centerY(), 0.6f, i10, canvas);
            canvas2 = canvas;
        }
        canvas2.drawPath(path2, paint3);
        canvas2.clipPath(path2);
        h8Var.a(canvas2, -1);
        long j10 = this.P;
        if (j10 == -1 || b((int) j10) >= 1.0f || b((int) this.P) <= 0.0f) {
            i11 = i10;
        } else {
            float dp3 = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.P)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            float e10 = e6Var2.e(Math.abs((rectF.right - ((float) AndroidUtilities.dp(10.0f))) - dp3) < ((float) AndroidUtilities.dp(14.0f)));
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), e6Var.e(Math.abs((rectF.right - ((float) AndroidUtilities.dp(10.0f))) - dp3) < ((float) AndroidUtilities.dp(12.0f))));
            float f13 = (f01Var.c + dp3) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF2.right ? (dp3 - lerp2) - f01Var.c : lerp2 + dp3;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.a)));
            i11 = i10;
            canvas2.drawLine(dp3, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e10), dp3, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e10), paint2);
            this.L.c(f13, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        }
        canvas2.restore();
        invalidate();
        if (this.O) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int d10 = i0.a.d(0.5f, paint.getColor(), this.s);
            Paint paint6 = this.d;
            paint6.setColor(d10);
            Path path3 = this.W;
            path3.rewind();
            f10 = 0.5f;
            Path.Direction direction3 = direction;
            path3.addRoundRect(height - AndroidUtilities.dp(1.0f), centerY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + height, centerY + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            path3.addRoundRect(height - AndroidUtilities.dp(6.0f), centerY - AndroidUtilities.dp(1.0f), height + AndroidUtilities.dp(6.0f), centerY + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            canvas2.drawPath(path3, paint6);
        } else {
            f10 = 0.5f;
        }
        float dp4 = (rectF.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f);
        float centerY2 = rectF.centerY() - (AndroidUtilities.dp(16.0f) / 2.0f);
        float dp5 = rectF.right - AndroidUtilities.dp(4.0f);
        float dp6 = (AndroidUtilities.dp(16.0f) / 2.0f) + rectF.centerY();
        RectF rectF4 = this.S;
        rectF4.set(dp4, centerY2, dp5, dp6);
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.e);
        float dp7 = AndroidUtilities.dp(9.0f) / rectF2.width();
        float f14 = f7;
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF4.left, rectF4.right, f14), AndroidUtilities.lerp(rectF4.left + AndroidUtilities.dp(9.0f), rectF4.right - AndroidUtilities.dp(9.0f), f14), Math.min(Utilities.clamp01(f14 / dp7), Utilities.clamp01((1.0f - f14) / dp7)));
        org.telegram.ui.Components.p6 p6Var = this.I;
        float d11 = p6Var.d() + AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.p6 p6Var2 = this.H;
        float max = Math.max(d11, p6Var2.d() + AndroidUtilities.dp(50.0f));
        float dp8 = AndroidUtilities.dp(44.0f);
        float clamp = Utilities.clamp(lerp3 - (max / 2.0f), (rectF2.right - max) - AndroidUtilities.dp(4.0f), rectF2.left + AndroidUtilities.dp(4.0f));
        float dp9 = rectF2.top - AndroidUtilities.dp(21.0f);
        RectF rectF5 = this.a0;
        rectF5.set(clamp, (rectF2.top - AndroidUtilities.dp(21.0f)) - dp8, max + clamp, dp9);
        float height2 = rectF5.height();
        float f15 = height2 / 2.0f;
        float clamp2 = Utilities.clamp(lerp3, rectF5.right, rectF5.left);
        float clamp3 = Utilities.clamp(clamp2 - AndroidUtilities.dp(9.0f), rectF5.right, rectF5.left);
        float clamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + clamp2, rectF5.right, rectF5.left);
        float clamp5 = Utilities.clamp(this.c0 - this.d0, 1.0f, -1.0f) * 60.0f;
        float dp10 = rectF5.bottom + AndroidUtilities.dp(8.0f);
        Path path4 = this.b0;
        path4.rewind();
        float f16 = rectF5.left;
        float f17 = rectF5.top;
        RectF rectF6 = this.T;
        rectF6.set(f16, f17, f16 + height2, f17 + height2);
        path4.arcTo(rectF6, -180.0f, 90.0f);
        float f18 = rectF5.right;
        float f19 = rectF5.top;
        rectF6.set(f18 - height2, f19, f18, f19 + height2);
        path4.arcTo(rectF6, -90.0f, 90.0f);
        float f20 = rectF5.right;
        float f21 = rectF5.bottom;
        rectF6.set(f20 - height2, f21 - height2, f20, f21);
        path4.arcTo(rectF6, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp4 - rectF6.centerX()) / f15)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
        float f22 = 0.7f * height2;
        if (clamp3 < rectF5.right - f22) {
            path4.lineTo(clamp4, rectF5.bottom);
            path4.lineTo(clamp2 + 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
        }
        path4.lineTo(clamp2, rectF5.bottom + AndroidUtilities.dp(8.0f) + 1.0f);
        if (clamp4 > rectF5.left + f22) {
            path4.lineTo(clamp2 - 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
            path4.lineTo(clamp3, rectF5.bottom);
        }
        float f23 = rectF5.left;
        float f24 = rectF5.bottom;
        rectF6.set(f23, f24 - height2, f23 + height2, f24);
        float clamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp3 - rectF6.left) / f15)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
        path4.arcTo(rectF6, clamp6, 180.0f - clamp6);
        path4.lineTo(rectF5.left, rectF5.bottom);
        path4.close();
        RectF rectF7 = AndroidUtilities.rectTmp;
        rectF7.set(rectF5);
        rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
        h8 h8Var2 = this.n;
        h8Var2.g(rectF7);
        h8Var2.h = (this.c0 * 15.0f) + 1.0f;
        h8Var2.d();
        canvas2.save();
        h8Var2.a(canvas2, i11);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(clamp5, clamp2, dp10);
        if (Math.abs(this.c0 - this.d0) > 0.001f) {
            this.d0 = AndroidUtilities.lerp(this.d0, this.c0, 0.1f);
            invalidate();
        }
        this.f.setShader(this.y);
        canvas2.drawPath(path4, this.f);
        canvas2.save();
        canvas2.clipPath(path4);
        canvas2.rotate(-clamp5, clamp2, dp10);
        h8Var2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f25 = 1.0f - (this.f0.e * 0.15f);
        canvas2.scale(f25, f25, rectF5.centerX(), rectF5.top - (rectF5.height() * f10));
        this.G.setBounds((int) ((rectF5.centerX() - (p6Var2.d() / 2.0f)) + AndroidUtilities.dp(-12.0f)), (int) (rectF5.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF5.centerX() - (p6Var2.d() / 2.0f)) + AndroidUtilities.dp(8.0f)), (int) (rectF5.centerY() + AndroidUtilities.dp(10.0f)));
        if (this.F) {
            this.G.draw(canvas2);
        }
        p6Var2.l(rectF5.left + AndroidUtilities.dp(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        p6Var2.draw(canvas2);
        canvas2.restore();
        p6Var.l(rectF5.left, rectF5.top + AndroidUtilities.dp(10.0f), rectF5.right, rectF5.bottom + AndroidUtilities.dp(10.0f));
        p6Var.w = (int) (this.f0.e * 255.0f);
        p6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g0 = motionEvent.getX();
            this.h0 = motionEvent.getY();
            this.j0 = motionEvent.getPointerId(0);
            this.i0 = System.currentTimeMillis();
            this.k0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.j0) {
            float x10 = motionEvent.getX() - this.g0;
            float y3 = motionEvent.getY() - this.h0;
            if (!this.k0 && Math.abs(x10) > Math.abs(y3 * 1.5f) && Math.abs(x10) > AndroidUtilities.touchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.k0 = true;
                ValueAnimator valueAnimator = this.l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.k0) {
                int value = getValue();
                this.c0 = Utilities.clamp01((x10 / (getWidth() * 1.0f)) + this.c0);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.p6 p6Var = this.H;
                    p6Var.b();
                    p6Var.q(v7.V0(false, LocaleController.formatNumber(getValue(), ','), this.J), true, true);
                }
                this.g0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.k0 && motionEvent.getPointerId(0) == this.j0 && v7.z6.a(this.g0, this.h0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && System.currentTimeMillis() - this.i0 <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.Q;
                    float clamp01 = Utilities.clamp01((x12 - rectF.left) / rectF.width());
                    long j3 = this.P;
                    if (j3 > 0 && Math.abs(b((int) j3) - clamp01) < 0.035f) {
                        clamp01 = Utilities.clamp01(b((int) this.P));
                    }
                    a(clamp01);
                }
            }
            this.k0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, boolean z10) {
        if (this.w == i10 && this.x == i11) {
            return;
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (!z10) {
            this.w = i10;
            this.r = i10;
            this.x = i11;
            this.s = i11;
            this.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            invalidate();
            return;
        }
        int i12 = this.r;
        int i13 = this.s;
        this.w = i10;
        this.x = i11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new q20(this, i12, i10, i13, i11, 2));
        this.v.addListener(new j8(this, i12, i10, i13, i11));
        this.v.setInterpolator(pr.h);
        this.v.setDuration(420L);
        this.v.start();
    }

    public final void g(String str) {
        this.f0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.p6 p6Var = this.I;
        p6Var.b();
        p6Var.q(str, true, true);
    }

    public float getProgress() {
        return this.c0;
    }

    public int getValue() {
        return c(this.c0);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        this.Q.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(135.0f), measuredWidth - r5, AndroidUtilities.dp(24.0f) + r0);
        this.c.setColor(-1069811);
        this.e.setColor(-1);
    }

    public void setStarsTop(long j3) {
        this.P = j3;
        invalidate();
    }

    public void setTopText(String str) {
        this.L.r(str);
    }

    public void setValue(int i10) {
        float b10 = b(i10);
        this.c0 = b10;
        this.d0 = b10;
        org.telegram.ui.Components.p6 p6Var = this.H;
        p6Var.b();
        p6Var.q(v7.V0(false, LocaleController.formatNumber(getValue(), ','), this.J), true, true);
    }

    public void setValueAnimated(int i10) {
        if (i10 == getValue()) {
            return;
        }
        a(b(i10));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.H || super.verifyDrawable(drawable);
    }
}
