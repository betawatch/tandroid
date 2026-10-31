package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.w10;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class v8 extends View {
    public LinearGradient D;
    public final Matrix E;
    public boolean F;
    public final Drawable G;
    public final org.telegram.ui.Components.e6 H;
    public final org.telegram.ui.Components.e6 I;
    public final dq[] J;
    public final Paint K;
    public final qz0 L;
    public final org.telegram.ui.Components.t5 M;
    public final org.telegram.ui.Components.t5 N;
    public boolean O;
    public long P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final Path U;
    public final Path V;
    public final Path W;
    public final org.telegram.ui.ActionBar.p6 a;
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
    public final fe.b f0;
    public float g0;
    public final s8 h;
    public float h0;
    public long i0;
    public int j0;
    public boolean k0;
    public ValueAnimator l0;
    public final s8 n;
    public int r;
    public int s;
    public ValueAnimator w;
    public int x;
    public int y;

    public v8(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.h = new s8(0, zs.X4);
        this.n = new s8(2, 30);
        this.r = -1135603;
        this.s = -404714;
        this.x = -1135603;
        this.y = -404714;
        this.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = new Matrix();
        this.F = true;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.H = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, true, true);
        this.I = e6Var2;
        this.J = new dq[1];
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new qz0(cd.L0(2131745055, null), 14.0f, org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        gr grVar = gr.h;
        this.M = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.N = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
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
        this.f0 = new fe.b(this, grVar, 320L);
        this.a = p6Var;
        Drawable f7 = i0.a.f(context, R.drawable.msg_premium_liststar);
        this.G = f7;
        f7.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        e6Var.u(-1);
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.w(org.telegram.messenger.i0.L(21.0f));
        e6Var.setCallback(this);
        Point point = org.telegram.messenger.i0.q;
        e6Var.M = point.x;
        e6Var.b = 17;
        e6Var2.u(-570425345);
        e6Var2.w(org.telegram.messenger.i0.L(11.0f));
        e6Var2.setCallback(this);
        e6Var2.M = point.x;
        e6Var2.b = 17;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, p6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c0, f7);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 7));
        int value = getValue();
        this.l0.addListener(new qz(this, f7, value));
        this.l0.setDuration(320L);
        this.l0.setInterpolator(gr.h);
        this.l0.start();
        if (c(f7) != value) {
            e(c(f7));
        }
        org.telegram.ui.Components.e6 e6Var = this.H;
        e6Var.a();
        e6Var.t(h8.X0(false, cd.E(c(f7), ','), this.J), true, true);
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
        Paint paint;
        float f7;
        org.telegram.ui.Components.t5 t5Var;
        int i10;
        Path path;
        Paint paint2;
        RectF rectF;
        Canvas canvas2;
        int i11;
        float f10;
        float f11;
        float f12;
        super.dispatchDraw(canvas);
        Matrix matrix = this.E;
        matrix.reset();
        RectF rectF2 = this.Q;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.D.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.D;
        Paint paint3 = this.c;
        paint3.setShader(linearGradient);
        int f13 = i0.b.f(this.c0, this.r, this.s);
        Path path2 = this.U;
        path2.rewind();
        float L = org.telegram.messenger.i0.L(12.0f);
        float L2 = org.telegram.messenger.i0.L(12.0f);
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF2, L, L2, direction);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, this.r);
        Paint paint4 = this.b;
        paint4.setColor(r12);
        canvas.drawPath(path2, paint4);
        RectF rectF3 = this.R;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = org.telegram.messenger.i0.T1(rectF3.left + org.telegram.messenger.i0.L(24.0f), rectF3.right, b10);
        Path path3 = this.V;
        path3.rewind();
        path3.addRoundRect(rectF3, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), direction);
        s8 s8Var = this.h;
        s8Var.g(rectF2);
        float f14 = this.c0;
        s8Var.h = (f14 * 15.0f) + 1.0f;
        s8Var.j = (int) (s8Var.b.size() * ((f14 * 0.85f) + 0.15f));
        s8Var.d();
        canvas.save();
        canvas.clipPath(path2);
        s8Var.a(canvas, f13);
        long j10 = this.P;
        org.telegram.ui.Components.t5 t5Var2 = this.N;
        org.telegram.ui.Components.t5 t5Var3 = this.M;
        qz0 qz0Var = this.L;
        Paint paint5 = this.K;
        if (j10 == -1 || b((int) j10) >= 1.0f || b((int) this.P) <= 0.0f) {
            paint = paint4;
            f7 = b10;
            t5Var = t5Var2;
            i10 = f13;
            path = path3;
            paint2 = paint5;
            rectF = rectF3;
            canvas2 = canvas;
        } else {
            float L3 = rectF2.left + org.telegram.messenger.i0.L(12.0f) + (Utilities.l(b((int) this.P)) * (rectF2.width() - org.telegram.messenger.i0.L(24.0f)));
            float d = t5Var3.d(Math.abs((rectF3.right - ((float) org.telegram.messenger.i0.L(10.0f))) - L3) < ((float) org.telegram.messenger.i0.L(14.0f)));
            float W1 = org.telegram.messenger.i0.W1(t5Var2.d(Math.abs((rectF3.right - ((float) org.telegram.messenger.i0.L(10.0f))) - L3) < ((float) org.telegram.messenger.i0.L(12.0f))), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(16.0f));
            float f15 = (L3 + qz0Var.c) + ((float) (org.telegram.messenger.i0.L(16.0f) * 2)) > rectF2.right ? (L3 - W1) - qz0Var.c : L3 + W1;
            paint5.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.t6.r1(0.6f, f13));
            paint = paint4;
            f7 = b10;
            t5Var = t5Var2;
            i10 = f13;
            rectF = rectF3;
            canvas.drawLine(L3, org.telegram.messenger.i0.T1(rectF2.top, rectF2.centerY(), d), L3, org.telegram.messenger.i0.T1(rectF2.bottom, rectF2.centerY(), d), paint5);
            path = path3;
            paint2 = paint5;
            this.L.c(f15, rectF2.centerY(), 0.6f, i10, canvas);
            canvas2 = canvas;
        }
        Path path4 = path;
        canvas2.drawPath(path4, paint3);
        canvas2.clipPath(path4);
        s8Var.a(canvas2, -1);
        long j11 = this.P;
        if (j11 == -1 || b((int) j11) >= 1.0f || b((int) this.P) <= 0.0f) {
            i11 = i10;
        } else {
            float L4 = rectF2.left + org.telegram.messenger.i0.L(12.0f) + (Utilities.l(b((int) this.P)) * (rectF2.width() - org.telegram.messenger.i0.L(24.0f)));
            float d10 = t5Var3.d(Math.abs((rectF.right - ((float) org.telegram.messenger.i0.L(10.0f))) - L4) < ((float) org.telegram.messenger.i0.L(14.0f)));
            float W12 = org.telegram.messenger.i0.W1(t5Var.d(Math.abs((rectF.right - ((float) org.telegram.messenger.i0.L(10.0f))) - L4) < ((float) org.telegram.messenger.i0.L(12.0f))), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(16.0f));
            float f16 = (qz0Var.c + L4) + ((float) (org.telegram.messenger.i0.L(16.0f) * 2)) > rectF2.right ? (L4 - W12) - qz0Var.c : W12 + L4;
            paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.a)));
            i11 = i10;
            canvas2.drawLine(L4, org.telegram.messenger.i0.T1(rectF2.top, rectF2.centerY(), d10), L4, org.telegram.messenger.i0.T1(rectF2.bottom, rectF2.centerY(), d10), paint2);
            this.L.c(f16, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        }
        canvas2.restore();
        invalidate();
        if (this.O) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int f17 = i0.b.f(0.5f, paint.getColor(), this.s);
            Paint paint6 = this.d;
            paint6.setColor(f17);
            Path path5 = this.W;
            path5.rewind();
            f10 = 0.5f;
            f11 = 2.0f;
            f12 = 0.15f;
            path5.addRoundRect(height - org.telegram.messenger.i0.L(1.0f), centerY - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + height, centerY + org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), direction);
            path5.addRoundRect(height - org.telegram.messenger.i0.L(6.0f), centerY - org.telegram.messenger.i0.L(1.0f), height + org.telegram.messenger.i0.L(6.0f), centerY + org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), direction);
            canvas2.drawPath(path5, paint6);
        } else {
            f10 = 0.5f;
            f11 = 2.0f;
            f12 = 0.15f;
        }
        float L5 = (rectF.right - org.telegram.messenger.i0.L(16.0f)) - org.telegram.messenger.i0.L(4.0f);
        float centerY2 = rectF.centerY() - (org.telegram.messenger.i0.L(16.0f) / f11);
        float L6 = rectF.right - org.telegram.messenger.i0.L(4.0f);
        float L7 = (org.telegram.messenger.i0.L(16.0f) / f11) + rectF.centerY();
        RectF rectF4 = this.S;
        rectF4.set(L5, centerY2, L6, L7);
        canvas2.drawRoundRect(rectF4, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), this.e);
        float L8 = org.telegram.messenger.i0.L(9.0f) / rectF2.width();
        float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(rectF4.left, rectF4.right, f7), org.telegram.messenger.i0.T1(rectF4.left + org.telegram.messenger.i0.L(9.0f), rectF4.right - org.telegram.messenger.i0.L(9.0f), f7), Math.min(Utilities.l(f7 / L8), Utilities.l((1.0f - f7) / L8)));
        org.telegram.ui.Components.e6 e6Var = this.I;
        float c10 = e6Var.c() + org.telegram.messenger.i0.L(20.0f);
        org.telegram.ui.Components.e6 e6Var2 = this.H;
        float max = Math.max(c10, e6Var2.c() + org.telegram.messenger.i0.L(50.0f));
        float L9 = org.telegram.messenger.i0.L(44.0f);
        float i12 = Utilities.i(T1 - (max / f11), (rectF2.right - max) - org.telegram.messenger.i0.L(4.0f), rectF2.left + org.telegram.messenger.i0.L(4.0f));
        float L10 = rectF2.top - org.telegram.messenger.i0.L(21.0f);
        RectF rectF5 = this.a0;
        rectF5.set(i12, (rectF2.top - org.telegram.messenger.i0.L(21.0f)) - L9, max + i12, L10);
        float height2 = rectF5.height();
        float f18 = height2 / f11;
        float i13 = Utilities.i(T1, rectF5.right, rectF5.left);
        float i14 = Utilities.i(i13 - org.telegram.messenger.i0.L(9.0f), rectF5.right, rectF5.left);
        float i15 = Utilities.i(org.telegram.messenger.i0.L(9.0f) + i13, rectF5.right, rectF5.left);
        float i16 = Utilities.i(this.c0 - this.d0, 1.0f, -1.0f) * 60.0f;
        float f19 = f12;
        float L11 = rectF5.bottom + org.telegram.messenger.i0.L(8.0f);
        Path path6 = this.b0;
        path6.rewind();
        float f20 = rectF5.left;
        float f21 = rectF5.top;
        RectF rectF6 = this.T;
        rectF6.set(f20, f21, f20 + height2, f21 + height2);
        path6.arcTo(rectF6, -180.0f, 90.0f);
        float f22 = rectF5.right;
        float f23 = rectF5.top;
        rectF6.set(f22 - height2, f23, f22, f23 + height2);
        path6.arcTo(rectF6, -90.0f, 90.0f);
        float f24 = rectF5.right;
        float f25 = rectF5.bottom;
        rectF6.set(f24 - height2, f25 - height2, f24, f25);
        int i17 = i11;
        path6.arcTo(rectF6, 0.0f, (float) Utilities.h(((Math.acos(Utilities.l((i15 - rectF6.centerX()) / f18)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d));
        float f26 = 0.7f * height2;
        if (i14 < rectF5.right - f26) {
            path6.lineTo(i15, rectF5.bottom);
            path6.lineTo(i13 + f11, rectF5.bottom + org.telegram.messenger.i0.L(8.0f));
        }
        path6.lineTo(i13, rectF5.bottom + org.telegram.messenger.i0.L(8.0f) + 1.0f);
        if (i15 > rectF5.left + f26) {
            path6.lineTo(i13 - f11, rectF5.bottom + org.telegram.messenger.i0.L(8.0f));
            path6.lineTo(i14, rectF5.bottom);
        }
        float f27 = rectF5.left;
        float f28 = rectF5.bottom;
        rectF6.set(f27, f28 - height2, f27 + height2, f28);
        float h = ((float) Utilities.h(((Math.acos(Utilities.l((i14 - rectF6.left) / f18)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d)) + 90.0f;
        path6.arcTo(rectF6, h, 180.0f - h);
        path6.lineTo(rectF5.left, rectF5.bottom);
        path6.close();
        RectF rectF7 = org.telegram.messenger.i0.P;
        rectF7.set(rectF5);
        rectF7.inset(-org.telegram.messenger.i0.L(12.0f), -org.telegram.messenger.i0.L(12.0f));
        s8 s8Var2 = this.n;
        s8Var2.g(rectF7);
        s8Var2.h = (this.c0 * 15.0f) + 1.0f;
        s8Var2.d();
        canvas2.save();
        s8Var2.a(canvas2, i17);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(i16, i13, L11);
        if (Math.abs(this.c0 - this.d0) > 0.001f) {
            this.d0 = org.telegram.messenger.i0.T1(this.d0, this.c0, 0.1f);
            invalidate();
        }
        this.f.setShader(this.D);
        canvas2.drawPath(path6, this.f);
        canvas2.save();
        canvas2.clipPath(path6);
        canvas2.rotate(-i16, i13, L11);
        s8Var2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f29 = 1.0f - (this.f0.e * f19);
        canvas2.scale(f29, f29, rectF5.centerX(), rectF5.top - (rectF5.height() * f10));
        this.G.setBounds((int) ((rectF5.centerX() - (e6Var2.c() / f11)) + org.telegram.messenger.i0.L(-12.0f)), (int) (rectF5.centerY() - org.telegram.messenger.i0.L(10.0f)), (int) ((rectF5.centerX() - (e6Var2.c() / f11)) + org.telegram.messenger.i0.L(8.0f)), (int) (rectF5.centerY() + org.telegram.messenger.i0.L(10.0f)));
        if (this.F) {
            this.G.draw(canvas2);
        }
        e6Var2.o(rectF5.left + org.telegram.messenger.i0.L(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        e6Var2.draw(canvas2);
        canvas2.restore();
        e6Var.o(rectF5.left, rectF5.top + org.telegram.messenger.i0.L(10.0f), rectF5.right, rectF5.bottom + org.telegram.messenger.i0.L(10.0f));
        e6Var.B = (int) (this.f0.e * 255.0f);
        e6Var.draw(canvas2);
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
            if (!this.k0 && Math.abs(x10) > Math.abs(y3 * 1.5f) && Math.abs(x10) > org.telegram.messenger.i0.e) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.k0 = true;
                ValueAnimator valueAnimator = this.l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.k0) {
                int value = getValue();
                this.c0 = Utilities.l((x10 / (getWidth() * 1.0f)) + this.c0);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.e6 e6Var = this.H;
                    e6Var.a();
                    e6Var.t(h8.X0(false, cd.E(getValue(), ','), this.J), true, true);
                }
                this.g0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.k0 && motionEvent.getPointerId(0) == this.j0 && w7.z8.a(this.g0, this.h0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.i0.e && System.currentTimeMillis() - this.i0 <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.Q;
                    float l4 = Utilities.l((x12 - rectF.left) / rectF.width());
                    long j10 = this.P;
                    if (j10 > 0 && Math.abs(b((int) j10) - l4) < 0.035f) {
                        l4 = Utilities.l(b((int) this.P));
                    }
                    a(l4);
                }
            }
            this.k0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, boolean z10) {
        if (this.x == i10 && this.y == i11) {
            return;
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w = null;
        }
        if (!z10) {
            this.x = i10;
            this.r = i10;
            this.y = i11;
            this.s = i11;
            this.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            invalidate();
            return;
        }
        int i12 = this.r;
        int i13 = this.s;
        this.x = i10;
        this.y = i11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new w10(this, i12, i10, i13, i11, 2));
        this.w.addListener(new u8(this, i12, i10, i13, i11));
        this.w.setInterpolator(gr.h);
        this.w.setDuration(420L);
        this.w.start();
    }

    public final void g(String str) {
        this.f0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.e6 e6Var = this.I;
        e6Var.a();
        e6Var.t(str, true, true);
    }

    public float getProgress() {
        return this.c0;
    }

    public int getValue() {
        return c(this.c0);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        this.Q.set(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(135.0f), measuredWidth - r5, org.telegram.messenger.i0.L(24.0f) + r0);
        this.c.setColor(-1069811);
        this.e.setColor(-1);
    }

    public void setStarsTop(long j10) {
        this.P = j10;
        invalidate();
    }

    public void setTopText(String str) {
        this.L.q(str);
    }

    public void setValue(int i10) {
        float b10 = b(i10);
        this.c0 = b10;
        this.d0 = b10;
        org.telegram.ui.Components.e6 e6Var = this.H;
        e6Var.a();
        e6Var.t(h8.X0(false, cd.E(getValue(), ','), this.J), true, true);
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
