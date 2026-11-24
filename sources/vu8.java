// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class vu8 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ue3 H;
    public rl0 I;
    public float J;
    public float K;
    public float L;
    public float M;
    public final CharSequence N;
    public StaticLayout O;
    public float P;
    public float Q;
    public float R;
    public final CharSequence S;
    public StaticLayout T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public boolean Y;
    public final float Z;
    public int a;
    public final uu8 a0;
    public final uu8 b0;
    public int c0;
    public final bg7 d0;
    public boolean e0;
    public final TextPaint k;
    public final vd1 l;
    public final Drawable m;
    public final Path n;
    public float o;
    public float p;
    public boolean q;
    public boolean r;
    public ValueAnimator s;
    public ValueAnimator t;
    public ValueAnimator u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public ValueAnimator z;
    public final int b = bkb.Q9;
    public final int c = bkb.R9;
    public final int d = bkb.M7;
    public final boolean e = true;
    public final Paint f = new Paint(1);
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i = new Paint();
    public final RectF j = new RectF();

    public vu8(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.k = textPaint;
        vd1 vd1Var = new vd1();
        vd1Var.c = new Path();
        vd1Var.d = new Paint(1);
        vd1Var.f();
        this.l = vd1Var;
        this.n = new Path();
        this.o = 1.0f;
        this.p = 1.0f;
        this.v = 1.0f;
        this.w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.a0 = new uu8(this, (byte) 3);
        this.b0 = new uu8(this, (byte) 4);
        this.d0 = new bg7(this, (byte) 10);
        this.e0 = false;
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(16.0f));
        this.Z = ViewConfiguration.get(a.b).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.m = a.b.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z) {
        if (this.G != z) {
            this.G = z;
            if (z) {
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.t = ofFloat;
                ofFloat.addUpdateListener(new uu8(this, (byte) 0));
                this.t.setInterpolator(gl.G);
                this.t.setDuration(230L);
                this.t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.u = null;
            }
            this.w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.u = ofFloat2;
            ofFloat2.addUpdateListener(new uu8(this, (byte) 1));
            this.u.setInterpolator(gl.G);
            this.u.setDuration(230L);
            this.u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ue3 ue3Var = this.H;
        if (ue3Var != null) {
            ue3Var.removeCallbacks(this.d0);
        }
        ValueAnimator valueAnimator3 = this.t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = false;
        this.r = false;
        this.y = false;
        this.e0 = false;
        this.x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Canvas canvas, boolean z) {
        ue3 ue3Var;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        float f;
        int i5;
        float f2;
        int i6;
        float f3;
        int i7;
        int i8;
        int w0;
        int i9;
        float f4;
        float f5;
        if (!this.X || this.Y || (ue3Var = this.H) == null || this.I == null) {
            return;
        }
        boolean z3 = ue3Var instanceof nvb;
        int L = gl.L(z3 ? 15.0f : 28.0f);
        int L2 = gl.L(8.0f);
        int L3 = gl.L(9.0f);
        int L4 = gl.L(18.0f);
        int d = (int) d();
        int height = (int) (this.H.getHeight() * this.J);
        boolean z4 = this.F;
        float f6 = this.D;
        float f7 = z4 ? (f6 * 0.07f) - 0.05f : f6 * 0.02f;
        int width = (this.H.getWidth() - (L << 2)) - gl.L(16.0f);
        if (width != this.c0) {
            int i10 = gl.q.x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            i2 = 0;
            CharSequence charSequence = this.N;
            TextPaint textPaint = this.k;
            this.O = new StaticLayout(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, false);
            float f8 = 0.0f;
            for (int i11 = 0; i11 < this.O.getLineCount(); i11++) {
                f8 = Math.max(f8, this.O.getLineWidth(i11));
            }
            float f9 = width;
            this.P = Math.min(1.0f, f9 / f8);
            int ceil = (int) Math.ceil(f8);
            if (this.P < 0.8f) {
                this.P = 0.8f;
                ceil = je5.a(this.N, textPaint);
            }
            int i12 = ceil;
            this.O = new StaticLayout(this.N, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.Q = i12;
            this.R = 0.0f;
            for (int i13 = 0; i13 < this.O.getLineCount(); i13++) {
                this.Q = Math.min(this.Q, this.O.getLineLeft(i13));
                this.R = Math.max(this.R, this.O.getLineWidth(i13));
            }
            this.T = new StaticLayout(this.S, textPaint, gl.q.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f10 = 0.0f;
            for (int i14 = 0; i14 < this.T.getLineCount(); i14++) {
                f10 = Math.max(f10, this.T.getLineWidth(i14));
            }
            this.U = Math.min(1.0f, f9 / f10);
            i = L4;
            int ceil2 = (int) Math.ceil(f10);
            if (this.U < 0.8f) {
                this.U = 0.8f;
                ceil2 = je5.a(this.S, textPaint);
            }
            int i15 = ceil2;
            this.T = new StaticLayout(this.S, textPaint, i15, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.V = i15;
            this.W = 0.0f;
            for (int i16 = 0; i16 < this.T.getLineCount(); i16++) {
                this.V = Math.min(this.V, this.T.getLineLeft(i16));
                this.W = Math.max(this.W, this.T.getLineWidth(i16));
            }
            this.c0 = width;
        } else {
            i = L4;
            i2 = 0;
        }
        boolean z5 = this.J > 0.85f ? 1 : i2;
        if (this.q != z5) {
            this.q = z5;
            float f11 = this.x;
            ValueAnimator valueAnimator = this.s;
            if (f11 == 0.0f) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.o = z5 != 0 ? 0.0f : 1.0f;
            } else {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f12 = this.o;
                float f13 = z5 != 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[i2] = f12;
                fArr[1] = f13;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.s = ofFloat;
                ofFloat.addUpdateListener(this.a0);
                this.s.setInterpolator(new LinearInterpolator());
                this.s.setDuration(170L);
                this.s.start();
            }
        }
        if (z5 != this.r) {
            this.r = z5;
            ValueAnimator valueAnimator2 = this.A;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f14 = this.p;
            float f15 = this.r ? 0.0f : 1.0f;
            float[] fArr2 = new float[2];
            fArr2[i2] = f14;
            fArr2[1] = f15;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            this.A = ofFloat2;
            ofFloat2.addUpdateListener(new uu8(this, (byte) 2));
            this.A.setInterpolator(s33.j);
            this.A.setDuration(250L);
            this.A.start();
        }
        float f16 = this.C * 2.0f;
        if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        float f17 = this.L;
        float f18 = this.K;
        if (z) {
            f18 += d;
        }
        int i17 = L + L3;
        int measuredHeight = (this.H.getMeasuredHeight() - L2) - L3;
        if (z) {
            measuredHeight += d;
        }
        int i18 = i + (L2 << 1);
        float f19 = f16;
        float f20 = height > i18 ? 1.0f : height / i18;
        canvas.save();
        float f21 = f20;
        if (z) {
            i3 = d;
            z2 = z3;
            int i19 = i2;
            canvas.clipRect(i19, i19, this.I.getMeasuredWidth(), i3 + 1);
        } else {
            i3 = d;
            z2 = z3;
        }
        float f22 = this.C;
        RectF rectF = this.j;
        Paint paint = this.i;
        if (f22 == 0.0f) {
            if (this.v != 1.0f && this.w != 1.0f) {
                canvas.drawPaint(paint);
            }
            f2 = f18;
            i4 = i;
            i5 = L3;
            f = f7;
        } else {
            float f23 = this.M;
            i4 = i;
            f = f7;
            i5 = L3;
            float A = tb4.A(1.0f, this.C, this.H.getWidth() - this.M, (f23 * f7) + f23);
            if (this.v != 1.0f && this.w != 1.0f) {
                canvas.drawCircle(f17, f18, A, paint);
            }
            Path path = this.n;
            path.reset();
            f2 = f18;
            rectF.set(f17 - A, f18 - A, f17 + A, f2 + A);
            path.addOval(rectF, Path.Direction.CW);
            canvas.clipPath(path);
        }
        boolean z6 = this.G;
        Paint paint2 = this.h;
        if (z6) {
            if (this.w > this.v) {
                canvas.save();
                float f24 = i17;
                float f25 = this.C;
                float f26 = measuredHeight;
                canvas.translate((f17 - f24) * f25, f25 * (f2 - f26));
                canvas.drawCircle(f24, f26, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
            if (this.v > 0.0f) {
                canvas.save();
                float f27 = i17;
                float f28 = this.C;
                float f29 = measuredHeight;
                canvas.translate((f17 - f27) * f28, (f2 - f29) * f28);
                canvas.drawCircle(f27, f29, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
        } else {
            if (this.v > this.w) {
                canvas.save();
                float f30 = i17;
                float f31 = this.C;
                float f32 = measuredHeight;
                canvas.translate((f17 - f30) * f31, f31 * (f2 - f32));
                canvas.drawCircle(f30, f32, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
            if (this.w > 0.0f) {
                canvas.save();
                float f33 = i17;
                float f34 = this.C;
                float f35 = measuredHeight;
                canvas.translate((f17 - f33) * f34, f34 * (f2 - f35));
                canvas.drawCircle(f33, f35, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
        }
        if (height > i18) {
            Paint paint3 = this.f;
            paint3.setAlpha((int) ((1.0f - f19) * 0.4f * f21 * 255.0f));
            float f36 = L;
            if (z) {
                rectF.set(f36, L2, L + i4, L2 + i3 + i5);
            } else {
                rectF.set(f36, ((this.H.getHeight() - height) + L2) - i3, L + i4, this.H.getHeight() - L2);
            }
            i6 = i5;
            float f37 = i6;
            canvas.drawRoundRect(rectF, f37, f37, paint3);
        } else {
            i6 = i5;
        }
        if (z) {
            canvas.restore();
            return;
        }
        if (z2) {
            measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - gl.L(41.0f)) * this.C));
        }
        float f38 = this.C;
        if (f38 == 0.0f || z2) {
            Paint paint4 = this.g;
            paint4.setAlpha((int) ((1.0f - f38) * f21 * 255.0f));
            float f39 = i17;
            float f40 = measuredHeight;
            canvas.drawCircle(f39, f40, i6, paint4);
            vd1 vd1Var = this.l;
            vd1Var.getClass();
            int L5 = gl.L(18.0f);
            int L6 = gl.L(18.0f) >> 1;
            f3 = 255.0f;
            int i20 = L5 >> 1;
            i7 = L;
            vd1Var.setBounds(i17 - L6, measuredHeight - i20, i17 + L6, measuredHeight + i20);
            float f41 = 1.0f - this.p;
            if (f41 < 0.0f) {
                f41 = 0.0f;
            }
            float f42 = 1.0f - f41;
            canvas.save();
            canvas.rotate(180.0f * f42, f39, f40);
            canvas.translate(0.0f, (gl.N(1.0f) * 1.0f) - f42);
            if (this.G) {
                w0 = paint2.getColor();
                i8 = 0;
            } else {
                i8 = 0;
                w0 = bkb.w0(null, this.b, false);
            }
            ((Paint) vd1Var.d).setColor(w0);
            vd1Var.draw(canvas);
            canvas.restore();
        } else {
            i7 = L;
            f3 = 255.0f;
            i8 = 0;
        }
        if (this.J > 0.0f && !this.y) {
            if (Math.abs(this.a) >= this.Z * 0.5f) {
                this.e0 = true;
                ue3 ue3Var2 = this.H;
                bg7 bg7Var = this.d0;
                ue3Var2.removeCallbacks(bg7Var);
                this.H.postDelayed(bg7Var, 200L);
            } else if (!this.e0) {
                this.x = 1.0f;
                this.y = true;
            }
        }
        float height2 = (this.H.getHeight() - (i18 / 2.0f)) + gl.L(6.0f);
        float width2 = (this.H.getWidth() + (z2 ? i7 << 1 : i8)) / 2.0f;
        if (this.O != null) {
            float f43 = this.o;
            if (f43 > 0.0f && f43 < 1.0f) {
                canvas.save();
                float f44 = (this.o * 0.2f) + 0.8f;
                canvas.scale(f44, f44, width2, tb4.A(1.0f, this.o, gl.L(16.0f), height2));
            }
            i9 = i17;
            f4 = f21;
            f5 = f2;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.o * f3 * f21 * this.x), 31);
            canvas.translate((width2 - this.Q) - (this.R / 2.0f), tb4.A(1.0f, this.o, gl.L(8.0f), height2) - this.O.getHeight());
            float f45 = this.P;
            canvas.scale(f45, f45, (this.R / 2.0f) + this.Q, this.O.getHeight());
            this.O.draw(canvas);
            canvas.restore();
            float f46 = this.o;
            if (f46 > 0.0f && f46 < 1.0f) {
                canvas.restore();
            }
        } else {
            i9 = i17;
            f4 = f21;
            f5 = f2;
        }
        if (this.T != null) {
            float f47 = this.o;
            if (f47 > 0.0f && f47 < 1.0f) {
                canvas.save();
                float A2 = tb4.A(1.0f, this.o, 0.1f, 0.9f);
                canvas.scale(A2, A2, width2, height2 - (gl.L(8.0f) * this.o));
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (tb4.z(1.0f, this.o, f3, f4) * this.x), 31);
            canvas.translate((width2 - this.V) - (this.W / 2.0f), ((gl.L(8.0f) * this.o) + height2) - this.T.getHeight());
            float f48 = this.U;
            canvas.scale(f48, f48, (this.W / 2.0f) + this.V, this.T.getHeight());
            this.T.draw(canvas);
            canvas.restore();
            float f49 = this.o;
            if (f49 > 0.0f && f49 < 1.0f) {
                canvas.restore();
            }
        }
        canvas.restore();
        if (z2 || !this.e || this.C <= 0.0f) {
            return;
        }
        canvas.save();
        int i21 = bkb.t1.b;
        int height3 = (this.H.getHeight() - L2) - i6;
        float f50 = i21;
        float L7 = gl.L(24.0f) / f50;
        float f51 = this.C;
        float i22 = ir2.i(1.0f - L7, f51, L7, f);
        float f52 = i9 - f17;
        float f53 = 1.0f - f51;
        canvas.translate(f52 * f53, (height3 - f5) * f53);
        canvas.scale(i22, i22, f17, f5);
        bkb.t1.O(true, 0.0f);
        if (!bkb.B1) {
            oy8 oy8Var = bkb.t1;
            oy8Var.a0 = true;
            int i23 = this.d;
            oy8Var.L(bkb.w0(null, i23, true), "Arrow1");
            bkb.t1.L(bkb.w0(null, i23, true), "Arrow2");
            bkb.t1.j();
            bkb.B1 = true;
        }
        float f54 = f50 / 2.0f;
        bkb.t1.setBounds((int) (f17 - f54), (int) (f5 - f54), (int) (f17 + f54), (int) (f54 + f5));
        bkb.t1.draw(canvas);
        canvas.restore();
    }

    public abstract float d();

    public final void e(float f) {
        this.C = f;
        int f2 = bm2.f(1.0f - this.C, bkb.w0(null, this.d, true), bkb.w0(null, this.c, true));
        this.h.setColor(f2);
        if (this.e && this.X && !this.Y) {
            oy8 oy8Var = bkb.t1;
            oy8Var.a0 = true;
            oy8Var.L(f2, "Arrow1");
            bkb.t1.L(f2, "Arrow2");
            bkb.t1.j();
            bkb.B1 = true;
        }
    }

    public final void f(float f) {
        if (this.J != f) {
            this.J = f;
            ue3 ue3Var = this.H;
            if (ue3Var != null) {
                ue3Var.invalidate();
            }
        }
    }

    public final void g() {
        AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.B.cancel();
        }
        e(0.0f);
        this.Y = false;
        this.E = false;
    }

    public final void h() {
        int w0 = bkb.w0(null, this.b, false);
        this.k.setColor(-1);
        this.g.setColor(-1);
        this.f.setColor(bm2.o(-1, 100));
        this.i.setColor(w0);
        ((Paint) this.l.d).setColor(w0);
        this.h.setColor(bkb.w0(null, this.d, false));
    }
}
