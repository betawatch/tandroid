// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class t88 extends FrameLayout {
    public static final float O = hl.L(20.0f);
    public static final float P = hl.L(30.0f);
    public static final float Q = hl.L(30.0f);
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public Paint J;
    public Paint K;
    public boolean L;
    public s88 M;
    public int N;
    public PointF a;
    public float b;
    public float c;
    public qma d;
    public PointF e;
    public float f;
    public float h;
    public float n;
    public RectF r;
    public float s;
    public float w;
    public float x;
    public float y;

    public static float a(float f) {
        return (f * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = x - motionEvent.getX(1);
        float y2 = y - motionEvent.getY(1);
        return (float) Math.sqrt((y2 * y2) + (x2 * x2));
    }

    private PointF getActualCenterPoint() {
        float width = getWidth();
        qma qmaVar = this.d;
        float f = qmaVar.a;
        float f2 = (this.e.x * f) + ((width - f) / 2.0f);
        int i = !this.L ? hl.m : 0;
        float height = getHeight();
        float f3 = qmaVar.b;
        float z = bp1.z(height, f3, 2.0f, i);
        float f4 = qmaVar.a;
        return new PointF(f2, (this.e.y * f4) + qd4.x(f4, f3, 2.0f, z));
    }

    private float getActualInnerRadius() {
        qma qmaVar = this.d;
        return Math.min(qmaVar.a, qmaVar.b) * this.f;
    }

    private float getActualOuterRadius() {
        qma qmaVar = this.d;
        return Math.min(qmaVar.a, qmaVar.b) * this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, MotionEvent motionEvent) {
        float f;
        boolean z = this.L;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f2 = x - actualCenterPoint.x;
        float f3 = y - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        qma qmaVar = this.d;
        float min = Math.min(qmaVar.a, qmaVar.b);
        float f4 = this.f * min;
        float f5 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * f3) + (Math.cos(a(this.n) + 1.5707963267948966d) * f2));
        float f6 = 0.0f;
        if (i == 1) {
            this.s = motionEvent.getX();
            this.w = motionEvent.getY();
            float abs2 = Math.abs(f5 - f4);
            float f7 = O;
            float f8 = Q;
            if (abs2 < f7) {
                f = 0.0f;
            } else {
                f = f8;
                f6 = f;
            }
            int i2 = this.I;
            float f9 = P;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (sqrt < f9) {
                        this.N = 2;
                        this.a = actualCenterPoint;
                        return;
                    }
                    if (sqrt > f4 - f8 && sqrt < f + f4) {
                        this.N = 3;
                        this.b = sqrt;
                        this.c = f4;
                        return;
                    } else {
                        if (sqrt <= f5 - f6 || sqrt >= f8 + f5) {
                            return;
                        }
                        this.N = 4;
                        this.b = sqrt;
                        this.c = f5;
                        return;
                    }
                }
                return;
            }
            if (sqrt < f9) {
                this.N = 2;
                this.a = actualCenterPoint;
                return;
            }
            float f10 = f4 - f8;
            if (abs > f10 && abs < f + f4) {
                this.N = 3;
                this.b = abs;
                this.c = f4;
                return;
            } else if (abs > f5 - f6 && abs < f5 + f8) {
                this.N = 4;
                this.b = abs;
                this.c = f5;
                return;
            } else {
                if (abs <= f10 || abs >= f5 + f8) {
                    this.N = 6;
                    return;
                }
                return;
            }
        }
        if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                this.N = 1;
                return;
            }
            return;
        }
        int i3 = this.I;
        if (i3 == 0) {
            int F = ik8.F(this.N);
            if (F == 1) {
                float f11 = x - this.s;
                float f12 = y - this.w;
                float width = (getWidth() - qmaVar.a) / 2.0f;
                int i4 = !z ? hl.m : 0;
                float height = getHeight();
                float f13 = qmaVar.b;
                float z2 = bp1.z(height, f13, 2.0f, i4);
                PointF pointF = new PointF(xnb.f(this.a.x, f11, qmaVar.a + width, width), xnb.f(this.a.y, f12, f13 + z2, z2));
                float f14 = pointF.x - width;
                float f15 = qmaVar.a;
                this.e = new PointF(f14 / f15, (((f15 - qmaVar.b) / 2.0f) + (pointF.y - z2)) / f15);
            } else if (F == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (abs - this.b)) / min), this.h - 0.02f);
            } else if (F == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (abs - this.b)) / min);
            } else if (F == 5) {
                float f16 = x - this.s;
                float f17 = y - this.w;
                boolean z3 = x > actualCenterPoint.x;
                boolean z4 = y > actualCenterPoint.y;
                boolean z5 = Math.abs(f17) > Math.abs(f16);
                if (z3) {
                    if (z4) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                        if (z5) {
                        }
                    } else if (!z5) {
                    }
                    this.n = (((((float) Math.sqrt((f17 * f17) + (f16 * f16))) * ((r5 << 1) - 1)) / 3.1415927f) / 1.15f) + this.n;
                    this.s = x;
                    this.w = y;
                } else {
                    if (!z4) {
                        int i5 = !z5 ? 0 : 0;
                        this.n = (((((float) Math.sqrt((f17 * f17) + (f16 * f16))) * ((i5 << 1) - 1)) / 3.1415927f) / 1.15f) + this.n;
                        this.s = x;
                        this.w = y;
                    }
                    if (z5) {
                    }
                    this.n = (((((float) Math.sqrt((f17 * f17) + (f16 * f16))) * ((i5 << 1) - 1)) / 3.1415927f) / 1.15f) + this.n;
                    this.s = x;
                    this.w = y;
                }
            }
        } else if (i3 == 1) {
            int F2 = ik8.F(this.N);
            if (F2 == 1) {
                float f18 = x - this.s;
                float f19 = y - this.w;
                float width2 = (getWidth() - qmaVar.a) / 2.0f;
                int i6 = !z ? hl.m : 0;
                float height2 = getHeight();
                float f20 = qmaVar.b;
                float z6 = bp1.z(height2, f20, 2.0f, i6);
                PointF pointF2 = new PointF(xnb.f(this.a.x, f18, qmaVar.a + width2, width2), xnb.f(this.a.y, f19, f20 + z6, z6));
                float f21 = pointF2.x - width2;
                float f22 = qmaVar.a;
                this.e = new PointF(f21 / f22, (((f22 - qmaVar.b) / 2.0f) + (pointF2.y - z6)) / f22);
            } else if (F2 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (sqrt - this.b)) / min), this.h - 0.02f);
            } else if (F2 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (sqrt - this.b)) / min);
            }
        }
        invalidate();
        s88 s88Var = this.M;
        if (s88Var != null) {
            PointF pointF3 = this.e;
            float f23 = this.f;
            float f24 = this.h;
            float a = a(this.n) + 1.5707964f;
            c98 c98Var = ((w88) s88Var).a;
            c98Var.b0 = f24;
            c98Var.c0 = pointF3;
            c98Var.d0 = f23;
            c98Var.e0 = a;
            rf4 rf4Var = c98Var.m0;
            if (rf4Var != null) {
                rf4Var.b(false, false, false);
            }
        }
    }

    public final void d(int i, MotionEvent motionEvent) {
        if (i == 1) {
            this.x = b(motionEvent);
            this.y = 1.0f;
            this.N = 5;
        } else if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                this.N = 1;
                return;
            }
            return;
        }
        float b = b(motionEvent);
        float B = c00.B(b - this.x, hl.p, 0.01f, this.y);
        this.y = B;
        float max = Math.max(0.1f, this.f * B);
        this.f = max;
        this.h = Math.max(max + 0.02f, this.h * this.y);
        this.y = 1.0f;
        this.x = b;
        invalidate();
        s88 s88Var = this.M;
        if (s88Var != null) {
            PointF pointF = this.e;
            float f = this.f;
            float f2 = this.h;
            float a = a(this.n) + 1.5707964f;
            c98 c98Var = ((w88) s88Var).a;
            c98Var.b0 = f2;
            c98Var.c0 = pointF;
            c98Var.d0 = f;
            c98Var.e0 = a;
            rf4 rf4Var = c98Var.m0;
            if (rf4Var != null) {
                rf4Var.b(false, false, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.K;
        RectF rectF = this.r;
        Paint paint3 = paint2;
        Paint paint4 = this.J;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i = this.I;
        int i2 = 0;
        if (i == 0) {
            canvas2.rotate(this.n);
            float L = hl.L(6.0f);
            float L2 = hl.L(12.0f);
            float L3 = hl.L(1.5f);
            int i3 = 0;
            while (i3 < 30) {
                float f = L2 + L;
                float f2 = i3 * f;
                float f3 = -actualInnerRadius;
                float f4 = f2 + L2;
                float f5 = L3 - actualInnerRadius;
                canvas2.drawRect(f2, f3, f4, f5, paint4);
                float f6 = ((-i3) * f) - L;
                float f7 = f6 - L2;
                canvas.drawRect(f7, f3, f6, f5, paint4);
                float f8 = L3 + actualInnerRadius;
                float f9 = actualInnerRadius;
                canvas.drawRect(f2, f9, f4, f8, paint4);
                canvas.drawRect(f7, f9, f6, f8, paint4);
                i3++;
                canvas2 = canvas;
                actualInnerRadius = f9;
            }
            float L4 = hl.L(6.0f);
            while (i2 < 64) {
                float f10 = L4 + L;
                float f11 = i2 * f10;
                float f12 = -actualOuterRadius;
                float f13 = L4 + f11;
                float f14 = L3 - actualOuterRadius;
                canvas.drawRect(f11, f12, f13, f14, paint4);
                float f15 = ((-i2) * f10) - L;
                float f16 = f15 - L4;
                canvas.drawRect(f16, f12, f15, f14, paint4);
                float f17 = L3 + actualOuterRadius;
                float f18 = actualOuterRadius;
                canvas.drawRect(f11, f18, f13, f17, paint4);
                canvas.drawRect(f16, f18, f15, f17, paint4);
                i2++;
                actualOuterRadius = f18;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i == 1) {
                float f19 = -actualInnerRadius;
                rectF.set(f19, f19, actualInnerRadius, actualInnerRadius);
                int i4 = 0;
                while (i4 < 22) {
                    Paint paint5 = paint3;
                    RectF rectF2 = rectF;
                    canvas.drawArc(rectF2, i4 * 16.35f, 10.2f, false, paint5);
                    i4++;
                    rectF = rectF2;
                    paint3 = paint5;
                }
                RectF rectF3 = rectF;
                Paint paint6 = paint3;
                float f20 = -actualOuterRadius;
                rectF3.set(f20, f20, actualOuterRadius, actualOuterRadius);
                while (i2 < 64) {
                    canvas.drawArc(rectF3, 5.62f * i2, 3.6f, false, paint6);
                    i2++;
                }
            }
        }
        canvas.drawCircle(0.0f, 0.0f, hl.L(8.0f), paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r2 != 6) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r15;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                        }
                    }
                } else {
                    if (this.E) {
                        c(2, motionEvent);
                        return true;
                    }
                    if (this.F) {
                        d(2, motionEvent);
                        return true;
                    }
                }
                return true;
            }
            if (this.E) {
                c(3, motionEvent);
                this.E = false;
            } else if (this.F) {
                this.N = 1;
                this.F = false;
            }
            this.G = true;
            this.H = true;
            return true;
        }
        if (motionEvent.getPointerCount() != 1) {
            if (this.E) {
                c(3, motionEvent);
                this.G = true;
                this.E = false;
            }
            if (motionEvent.getPointerCount() != 2) {
                this.N = 1;
                this.H = true;
                this.F = false;
                return true;
            }
            if (!this.H || this.F) {
                return true;
            }
            d(1, motionEvent);
            this.F = true;
            return true;
        }
        if (this.G && !this.E) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            PointF actualCenterPoint = getActualCenterPoint();
            PointF pointF = new PointF(x - actualCenterPoint.x, y - actualCenterPoint.y);
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            float actualInnerRadius = getActualInnerRadius();
            float actualOuterRadius = getActualOuterRadius();
            float abs = Math.abs(actualOuterRadius - actualInnerRadius);
            float f3 = O;
            float f4 = Q;
            float f5 = abs < f3 ? 0.0f : f4;
            float f6 = f5;
            int i = this.I;
            float f7 = P;
            if (i == 0) {
                float abs2 = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * pointF.y) + (Math.cos(a(this.n) + 1.5707963267948966d) * pointF.x));
                r15 = 1;
                r15 = 1;
                if (sqrt < f7) {
                    this.E = true;
                } else {
                    float f8 = actualInnerRadius - f4;
                    if (abs2 <= f8 || abs2 >= actualInnerRadius + f6) {
                        if (abs2 > actualOuterRadius - f5 && abs2 < actualOuterRadius + f4) {
                            this.E = true;
                        } else if (abs2 <= f8 || abs2 >= actualOuterRadius + f4) {
                            r15 = 1;
                            this.E = true;
                        }
                        r15 = 1;
                    } else {
                        this.E = true;
                    }
                }
            } else {
                boolean z = true;
                r15 = z;
                if (i == 1) {
                    if (sqrt < f7) {
                        this.E = true;
                        r15 = z;
                    } else if (sqrt <= actualInnerRadius - f4 || sqrt >= actualInnerRadius + f6) {
                        r15 = z;
                        if (sqrt > actualOuterRadius - f5) {
                            r15 = z;
                            if (sqrt < actualOuterRadius + f4) {
                                this.E = true;
                                r15 = z;
                            }
                        }
                    } else {
                        this.E = true;
                        r15 = z;
                    }
                }
            }
            this.G = false;
            if (!this.E) {
                return r15;
            }
            c(r15, motionEvent);
            return r15;
        }
        return true;
    }

    public void setDelegate(s88 s88Var) {
        this.M = s88Var;
    }

    public void setType(int i) {
        this.I = i;
        invalidate();
    }
}
