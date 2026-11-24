// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class w7 extends FrameLayout implements tjb {
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public float[] N;
    public boolean O;
    public LinearGradient P;
    public int Q;
    public int R;
    public Matrix S;
    public int T;
    public ValueAnimator U;
    public int V;
    public boolean W;
    public float a;
    public boolean a0;
    public i8c b;
    public final b1 b0;
    public final s7 c;
    public PorterDuffColorFilter c0;
    public final s7 d;
    public float d0;
    public final lm e;
    public float e0;
    public Bitmap f;
    public long f0;
    public boolean g0;
    public BitmapShader h;
    public Matrix n;
    public final int[] r;
    public float s;
    public boolean w;
    public boolean x;
    public final wjb y;

    public w7(Context context, wjb wjbVar) {
        super(context);
        this.a = 0.5f;
        s33 s33Var = s33.h;
        this.e = new lm(1.0f, this, 0L, 320L, s33Var);
        this.r = new int[2];
        this.s = 0.0f;
        Paint paint = new Paint(1);
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Paint(1);
        Paint paint3 = new Paint(1);
        this.H = paint3;
        Paint paint4 = new Paint(1);
        this.I = paint4;
        Paint paint5 = new Paint(1);
        this.J = paint5;
        this.K = new Paint(1);
        Paint paint6 = new Paint(1);
        this.L = paint6;
        this.O = true;
        this.a0 = false;
        this.b0 = new b1(this, (byte) 5);
        this.y = wjbVar;
        setWillNotDraw(false);
        s7 s7Var = new s7(this, (byte) 0);
        this.c = s7Var;
        s7Var.setCallback(this);
        s7Var.x(gl.o());
        s7Var.n(0.3f, 165L, s33Var);
        s7Var.w(gl.N(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = s7Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(gl.N(0.3f));
        s7Var.b = k96.a0 ? 5 : 3;
        s7 s7Var2 = new s7(this, (byte) 1);
        this.d = s7Var2;
        s7Var2.setCallback(this);
        s7Var2.x(gl.o());
        s7Var2.n(0.3f, 165L, s33Var);
        s7Var2.w(gl.N(14.0f));
        TextPaint textPaint2 = s7Var2.a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(gl.N(0.3f));
        s7Var2.b = k96.a0 ? 3 : 5;
        paint.setColor(0);
        paint.setShadowLayer(gl.N(1.33f), 0.0f, gl.N(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        gl.i(colorMatrix, -0.4f);
        gl.h(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        int v0 = bkb.v0(bkb.F8, wjbVar);
        this.V = v0;
        paint2.setColor(v0);
        boolean z = gl.B(paint2.getColor()) <= 0.721f;
        this.M = z;
        s7Var.u(z ? -1 : -16777216);
        s7Var2.u(this.M ? -1 : -16777216);
        paint4.setColor(bkb.p1(0.025f, -16777216));
        paint3.setColor(bkb.p1(0.35f, -1));
        paint6.setColor(bkb.p1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.N == null) {
            return;
        }
        int i = 0;
        while (true) {
            float[] fArr = this.N;
            if (i >= fArr.length) {
                return;
            }
            float f = fArr[i];
            RectF rectF = gl.P;
            canvas.drawRect((rectF.width() * f) + rectF.left, rectF.top, (rectF.width() * f) + rectF.left + gl.L(0.66f), rectF.bottom, this.L);
            i++;
        }
    }

    public final void b(Canvas canvas, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (z) {
            porterDuffColorFilter = this.c0;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.c0 = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        s7 s7Var = this.c;
        s7Var.setColorFilter(porterDuffColorFilter);
        s7Var.setBounds(gl.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - gl.L(20.0f), getMeasuredHeight() / 2);
        s7Var.draw(canvas);
        if (z && (porterDuffColorFilter2 = this.c0) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.c0 = porterDuffColorFilter2;
        }
        s7 s7Var2 = this.d;
        s7Var2.setColorFilter(porterDuffColorFilter2);
        s7Var2.setBounds(gl.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - gl.L(20.0f), getMeasuredHeight() / 2);
        s7Var2.draw(canvas);
    }

    public final int c(float f) {
        int i = bkb.ik;
        wjb wjbVar = this.y;
        return bm2.f(moe.a((((f * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), bkb.v0(i, wjbVar), bkb.v0(bkb.jk, wjbVar));
    }

    public final void d(boolean z, float f) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        float a = moe.a(f, 0.0f, 1.0f);
        byte b = 1;
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, a);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new f0(this, b));
            this.U.addListener(new t7(this, a, (byte) 0));
            this.U.setInterpolator(s33.h);
            this.U.setDuration(220L);
            this.U.start();
        } else {
            this.a = a;
            invalidate();
        }
        v7 v7Var = (v7) this;
        String str = v7Var.i0;
        if (str == null) {
            str = cla.a((a * 2.8f) + 0.2f).concat("x");
        }
        s7 s7Var = this.c;
        if (!TextUtils.equals(s7Var.i, str)) {
            s7Var.a();
            s7Var.t(str, true, true);
        }
        String concat = v7Var.i0 != null ? cla.a((2.8f * a) + 0.2f).concat("x") : null;
        if (concat != null) {
            s7 s7Var2 = this.d;
            if (!TextUtils.equals(s7Var2.i, concat)) {
                s7Var2.a();
                s7Var2.t(concat, true, true);
            }
        }
        this.K.setColor(c(a));
    }

    public float getValue() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = gl.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.w) {
            canvas.drawRoundRect(rectF, gl.L(this.s), gl.L(this.s), this.E);
        }
        boolean z = this.x;
        Paint paint = this.K;
        if (z) {
            float e = this.e.e(false, this.f != null ? 1.0f : 0.0f);
            if (e < 1.0f) {
                if (this.S == null || this.T != ((int) rectF.width())) {
                    Matrix matrix = this.S;
                    if (matrix == null) {
                        this.S = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.S;
                    int width = (int) rectF.width();
                    this.T = width;
                    matrix2.postScale(width, 1.0f);
                    this.P.setLocalMatrix(this.S);
                }
                Paint paint2 = this.J;
                paint2.setAlpha((int) ((1.0f - e) * 255.0f));
                canvas.drawRoundRect(rectF, gl.L(this.s), gl.L(this.s), paint2);
            }
            if (this.f != null && this.a < 1.0f && e > 0.0f) {
                Paint paint3 = this.G;
                paint3.setAlpha((int) (e * 255.0f));
                canvas.drawRoundRect(rectF, gl.L(this.s), gl.L(this.s), paint3);
            }
            canvas.drawRoundRect(rectF, gl.L(this.s), gl.L(this.s), this.H);
            canvas.drawRoundRect(rectF, gl.L(this.s), gl.L(this.s), this.I);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, gl.L(this.s), gl.L(this.s), this.F);
        }
        a(canvas);
        if (!this.M) {
            b(canvas, false);
        }
        if (this.a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, gl.L(this.s), gl.L(this.s), paint);
        a(canvas);
        if (!this.M) {
            b(canvas, true);
        }
        if (this.a < 1.0f) {
            canvas.restore();
        }
        if (this.M) {
            b(canvas, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int v0;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int[] iArr = this.r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.n;
        if (matrix != null) {
            matrix.reset();
            this.n.postScale(8.0f, 8.0f);
            this.n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.n);
                invalidate();
            }
        }
        boolean z2 = this.O;
        wjb wjbVar = this.y;
        if (z2) {
            Drawable r0 = bkb.r0();
            if (r0 instanceof ColorDrawable) {
                v0 = ((ColorDrawable) r0).getColor();
            } else {
                Pair pair = null;
                Bitmap bitmap = r0 instanceof ye7 ? ((ye7) r0).k : r0 instanceof BitmapDrawable ? ((BitmapDrawable) r0).getBitmap() : null;
                if (bitmap != null) {
                    int i6 = iArr[0];
                    Point point = gl.q;
                    float f = i6 / point.x;
                    int width = (int) (f * bitmap.getWidth());
                    int measuredWidth = (int) (((getMeasuredWidth() + i6) / point.x) * bitmap.getWidth());
                    int currentActionBarHeight = (int) ((((iArr[1] - gl.m) - a.getCurrentActionBarHeight()) / point.y) * bitmap.getHeight());
                    if (width >= 0 && width < bitmap.getWidth() && measuredWidth >= 0 && measuredWidth < bitmap.getWidth() && currentActionBarHeight >= 0 && currentActionBarHeight < bitmap.getHeight()) {
                        pair = new Pair(Integer.valueOf(bitmap.getPixel(width, currentActionBarHeight)), Integer.valueOf(bitmap.getPixel(measuredWidth, currentActionBarHeight)));
                    }
                }
                if (pair != null) {
                    v0 = ((Integer) pair.first).intValue();
                    i5 = ((Integer) pair.second).intValue();
                    if (this.P == null && this.Q == v0 && this.R == i5) {
                        return;
                    }
                    this.Q = v0;
                    this.R = i5;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v0, i5}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.P = linearGradient;
                    this.J.setShader(linearGradient);
                }
                v0 = bkb.p1(0.25f, bkb.v0(bkb.c6, wjbVar));
            }
        } else {
            v0 = bkb.v0(bkb.c6, wjbVar);
            if (!bkb.I.o()) {
                v0 = bkb.v(v0, bkb.p1(0.18f, -16777216));
            }
        }
        i5 = v0;
        if (this.P == null) {
        }
        this.Q = v0;
        this.R = i5;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v0, i5}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.P = linearGradient2;
        this.J.setShader(linearGradient2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.w) {
            i = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + gl.L(44.0f), TLObject.FLAG_30));
        boolean z = gba.o() >= 2 && e66.e(256);
        if (this.x && this.f == null && !this.a0 && z) {
            this.b0.run();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.g0 = true;
            this.d0 = x;
            this.e0 = this.a;
            this.f0 = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i = 0;
            if (action == 1) {
                this.g0 = false;
                if (System.currentTimeMillis() - this.f0 < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.N != null) {
                        while (true) {
                            float[] fArr = this.N;
                            if (i >= fArr.length) {
                                break;
                            }
                            if (Math.abs(paddingLeft - fArr[i]) < 0.1f) {
                                paddingLeft = this.N[i];
                                break;
                            }
                            i++;
                        }
                    }
                    i8c i8cVar = this.b;
                    if (i8cVar != null) {
                        i8cVar.a(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x - this.d0) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.e0;
            if (this.N != null) {
                int i2 = 0;
                while (true) {
                    float[] fArr2 = this.N;
                    if (i2 >= fArr2.length) {
                        break;
                    }
                    if (Math.abs(max - fArr2[i2]) < 0.05f) {
                        max = this.N[i2];
                        break;
                    }
                    i2++;
                }
            }
            boolean z = !this.g0;
            d(false, max);
            i8c i8cVar2 = this.b;
            if (i8cVar2 != null) {
                i8cVar2.a(Float.valueOf(this.a), Boolean.valueOf(z));
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Paint paint = this.F;
        paint.setColor(i);
        boolean z = gl.B(paint.getColor()) <= 0.721f;
        this.M = z;
        this.c.u(z ? -1 : -16777216);
        this.d.u(this.M ? -1 : -16777216);
    }

    public void setDrawBlur(boolean z) {
        this.x = z;
        invalidate();
    }

    public void setDrawShadow(boolean z) {
        this.w = z;
        int L = z ? gl.L(8.0f) : 0;
        setPadding(L, L, L, L);
        invalidate();
    }

    public void setOnValueChange(i8c i8cVar) {
        this.b = i8cVar;
    }

    public void setRoundRadiusDp(float f) {
        this.s = f;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.N = fArr;
    }

    public void setTextColor(int i) {
        this.W = true;
        this.c.u(i);
        this.d.u(i);
    }

    @Override // tjb
    public final void updateColors() {
        int v0;
        Paint paint = this.F;
        if (paint != null) {
            try {
                if (paint.getColor() == this.V && (v0 = bkb.v0(bkb.F8, this.y)) != this.V) {
                    this.V = v0;
                    paint.setColor(v0);
                    boolean z = gl.B(v0) <= 0.721f;
                    this.M = z;
                    if (!this.W) {
                        s7 s7Var = this.c;
                        if (s7Var != null) {
                            s7Var.u(z ? -1 : -16777216);
                        }
                        s7 s7Var2 = this.d;
                        if (s7Var2 != null) {
                            s7Var2.u(this.M ? -1 : -16777216);
                        }
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        Paint paint2 = this.K;
        if (paint2 != null) {
            paint2.setColor(c(this.a));
        }
        invalidate();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
