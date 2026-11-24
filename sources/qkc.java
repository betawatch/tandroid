// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qkc extends View {
    public ValueAnimator E;
    public final lhc F;
    public ValueAnimator G;
    public float H;
    public float I;
    public float J;
    public p09 a;
    public p09 b;
    public p09 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path h;
    public final int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public pkc y;

    public qkc(Context context, lhc lhcVar) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.h = new Path();
        int L = gm.L(26.0f);
        this.n = L;
        this.r = L;
        this.s = 0;
        this.w = false;
        this.x = 0;
        this.H = 1.0f;
        this.F = lhcVar;
        lhcVar.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, z ? 0.8f : 1.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new nkc(this, (byte) 0));
        this.G.setDuration(150L);
        this.G.start();
    }

    public final void a(int i, boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.E.removeAllUpdateListeners();
            this.E.cancel();
            z2 = false;
        }
        int i2 = this.n;
        if (z2) {
            p09 p09Var = this.c;
            ValueAnimator valueAnimator2 = this.E;
            if (p09Var != null) {
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.E.cancel();
                }
                ValueAnimator ofInt = z ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                this.E = ofInt;
                ofInt.addUpdateListener(new nkc(this, (byte) 1));
                this.E.setDuration(200L);
                this.E.start();
                if (i == 2) {
                    this.c.I(0, false, false);
                    this.c.start();
                }
            } else {
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.E.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i2);
                this.E = ofInt2;
                if (z) {
                    this.r = i2;
                    ofInt2.addUpdateListener(new nkc(this, (byte) 2));
                    this.E.addListener(new okc(this, (byte) 0));
                    this.E.setDuration(200L);
                    this.E.start();
                    this.b.I(0, false, false);
                    this.b.start();
                } else {
                    this.s = i2;
                    ofInt2.addUpdateListener(new nkc(this, (byte) 3));
                    this.E.setDuration(200L);
                    this.E.addListener(new okc(this, (byte) 1));
                    this.E.start();
                }
            }
        } else if (z) {
            this.s = i2;
            this.r = 0;
            this.x = 100;
            if (i == 3 || i == 1) {
                p09 p09Var2 = this.b;
                p09Var2.I(p09Var2.e[0] - 1, false, false);
            }
        } else {
            this.s = 0;
            this.r = i2;
            this.x = 20;
        }
        this.w = z;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Path path;
        canvas.save();
        float f = this.H;
        canvas.scale(f, f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x = ((View) getParent()).getX() + getX();
        float y = ((View) ((View) getParent()).getParent()).getY() + getY();
        lhc lhcVar = this.F;
        int i2 = lhcVar.g;
        Paint paint = lhcVar.j;
        eq eqVar = lhcVar.a;
        float f2 = lhcVar.g;
        float f3 = 1.12f * f2;
        float f4 = (f3 - lhcVar.f) / 2.0f;
        float f5 = (f3 - f2) / 2.0f;
        float f6 = -x;
        float f7 = f6 - f4;
        float f8 = -y;
        eqVar.k(f7, f8 - f5, (i2 * 1.12f) / ((Bitmap) eqVar.c).getHeight(), lhcVar.h);
        lhcVar.c.i(f6, f8, lhcVar.f - x, lhcVar.g - y);
        p09 p09Var = this.c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i3 = this.n;
        if (p09Var != null) {
            if (this.x > 20) {
                Paint paint4 = this.f;
                paint4.setAlpha((int) ((r1 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.x * nm7.d4) / 100.0f));
                canvas.drawCircle(width, height, i3, paint2);
                this.c.l(canvas, paint3, false, 0L, 0);
                this.c.l(canvas, paint4, false, 0L, 0);
                return;
            }
            float f9 = i3;
            if (!lhcVar.i) {
                paint = (Paint) eqVar.a;
            }
            canvas.drawCircle(width, height, f9, paint);
            if (lhcVar.e) {
                canvas.drawCircle(width, height, f9, (Paint) lhcVar.c.a);
            }
            this.c.draw(canvas);
            return;
        }
        if (this.b == null || this.a == null) {
            return;
        }
        int i4 = this.r;
        boolean z = i4 == i3 && this.s == 0;
        int i5 = this.s;
        boolean z2 = i5 == i3 && i4 == 0;
        Path path2 = this.h;
        if (i5 != i3 || i4 <= 0 || i4 == i3) {
            i = i3;
            path = path2;
        } else {
            canvas.drawCircle(width, height, i5, paint2);
            canvas.drawCircle(width, height, this.r, paint3);
            this.b.setAlpha(nm7.d4);
            i = i3;
            this.b.l(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
            path2.reset();
            path = path2;
            path.addCircle(width, height, this.r, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.r, paint3);
        }
        if (z || this.r > 0) {
            float f10 = this.r;
            if (!lhcVar.i) {
                paint = (Paint) eqVar.a;
            }
            canvas.drawCircle(width, height, f10, paint);
            if (lhcVar.e) {
                canvas.drawCircle(width, height, this.r, (Paint) lhcVar.c.a);
            }
            this.a.draw(canvas);
        }
        if (z2 || (this.s > 0 && this.r == i)) {
            path.reset();
            path.addCircle(width, height, this.s, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.s, paint2);
            this.b.setAlpha(nm7.d4);
            this.b.l(canvas, paint3, false, 0L, 0);
            this.b.setAlpha(35);
            this.b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pkc pkcVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressedBtn(true);
            this.I = motionEvent.getX();
            this.J = motionEvent.getY();
            return true;
        }
        boolean z = false;
        if (action == 1) {
            setPressedBtn(false);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = this.I;
            float f2 = this.J;
            float abs = Math.abs(f - x);
            float abs2 = Math.abs(f2 - y);
            if (abs <= gm.L(48.0f) && abs2 <= gm.L(48.0f)) {
                int i = this.r;
                int i2 = this.n;
                boolean z2 = i == i2 && this.s == 0;
                if (this.s == i2 && i == 0) {
                    z = true;
                }
                if ((z2 || z) && (pkcVar = this.y) != null) {
                    pkcVar.a(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(pkc pkcVar) {
        this.y = pkcVar;
    }
}
