// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zma extends View {
    public float E;
    public int F;
    public String[] G;
    public int[] H;
    public Drawable[] I;
    public int J;
    public int K;
    public float L;
    public final mm M;
    public final mm N;
    public yma O;
    public final vnb P;
    public final m86 a;
    public final Paint b;
    public final Paint c;
    public final TextPaint d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public boolean x;
    public float y;

    public zma(Context context, vnb vnbVar) {
        super(context);
        this.s = -1;
        this.K = TLObject.FLAG_31;
        k43 k43Var = k43.f;
        this.M = new mm(120L, this, k43Var);
        this.N = new mm(150L, this, k43Var);
        this.P = vnbVar;
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(hl.L(13.0f));
        this.a = new m86(this, (byte) 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOption(int i) {
        if (this.J != i) {
            hl.W3(this);
        }
        this.J = i;
        yma ymaVar = this.O;
        if (ymaVar != null) {
            ymaVar.j(i);
        }
        invalidate();
    }

    public final void b(int i, Drawable[] drawableArr, String... strArr) {
        this.G = strArr;
        this.I = drawableArr;
        this.J = i;
        this.H = new int[strArr.length];
        int i2 = 0;
        while (true) {
            if (i2 >= this.G.length) {
                break;
            }
            this.H[i2] = (int) Math.ceil(this.d.measureText(r7[i2]));
            i2++;
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.J;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        int i2;
        Canvas canvas2 = canvas;
        boolean z = false;
        float e = this.M.e(false, this.J);
        float f3 = 0.0f;
        float f4 = 1.0f;
        float e2 = this.N.e(false, this.w ? 1.0f : 0.0f);
        int i3 = 2;
        int L = hl.L(11.0f) + (getMeasuredHeight() / 2);
        int i4 = 0;
        while (true) {
            int length = this.G.length;
            int i5 = this.n;
            int i6 = this.r;
            vnb vnbVar = this.P;
            Paint paint = this.b;
            if (i4 >= length) {
                int i7 = i6 + (this.h << 1);
                int i8 = this.f;
                float f5 = ((i7 + i8) * e) + i5 + (i8 / 2);
                int i9 = aob.N6;
                paint.setColor(vm2.o(aob.v0(i9, vnbVar), 80));
                float f6 = L;
                canvas2.drawCircle(f5, f6, hl.L(e2 * 12.0f), paint);
                paint.setColor(aob.v0(i9, vnbVar));
                canvas2.drawCircle(f5, f6, hl.L(6.0f), paint);
                return;
            }
            int i10 = i6 + (this.h << 1);
            int i11 = this.f;
            int i12 = (i11 / i3) + ((i10 + i11) * i4) + i5;
            float f7 = i4;
            float f8 = f7 - e;
            boolean z2 = z;
            float max = Math.max(f3, f4 - Math.abs(f8));
            float a = ete.a((e - f7) + f4, f3, f4);
            int v0 = aob.v0(aob.M6, vnbVar);
            float f9 = f4;
            int v02 = aob.v0(aob.N6, vnbVar);
            int i13 = this.K;
            int i14 = i3;
            int f10 = vm2.f(a, v0, aob.p1((i13 == Integer.MIN_VALUE || i4 > i13) ? f9 : 0.5f, v02));
            paint.setColor(f10);
            Paint paint2 = this.c;
            paint2.setColor(f10);
            float f11 = L;
            canvas2.drawCircle(i12, f11, hl.U1(max, this.f / 2, hl.L(6.0f)), paint);
            if (i4 != 0) {
                int i15 = (i12 - (this.f / 2)) - this.h;
                int i16 = this.r;
                int i17 = i15 - i16;
                f = 3.0f;
                int i18 = this.s;
                if (i18 == -1 || i4 - 1 < i18) {
                    i = i12;
                    float f12 = f8 - f9;
                    float a2 = ete.a(f9 - Math.abs(f12), 0.0f, f9);
                    int L2 = (int) (i16 - (hl.L(3.0f) * ete.a(f9 - Math.min(Math.abs(f8), Math.abs(f12)), 0.0f, f9)));
                    f9 = 1.0f;
                    canvas2 = canvas;
                    canvas2.drawRect((int) ((hl.L(3.0f) * a2) + i17), L - hl.L(1.0f), L2 + r2, hl.L(1.0f) + L, paint);
                } else {
                    int L3 = hl.L(3.0f) + i17;
                    int L4 = (i16 - hl.L(3.0f)) / hl.L(13.0f);
                    if (this.e != L4) {
                        i2 = L3;
                        i = i12;
                        float[] fArr = new float[i14];
                        fArr[z2 ? 1 : 0] = hl.L(6.0f);
                        fArr[1] = (r15 - (hl.L(8.0f) * L4)) / (L4 - 1);
                        paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                        this.e = L4;
                    } else {
                        i2 = L3;
                        i = i12;
                    }
                    canvas2 = canvas;
                    canvas2.drawLine(hl.L(f9) + i2, f11, (i2 + r15) - hl.L(f9), f11, paint2);
                }
            } else {
                i = i12;
                f = 3.0f;
            }
            int i19 = this.H[i4];
            String str = this.G[i4];
            int f13 = vm2.f(max, aob.v0(aob.y6, vnbVar), aob.v0(aob.n6, vnbVar));
            TextPaint textPaint = this.d;
            textPaint.setColor(f13);
            if (this.I != null) {
                canvas2.save();
                if (i4 == 0) {
                    canvas2.translate(hl.L(12.0f), hl.L(15.5f));
                } else if (i4 == this.G.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i19) - hl.L(22.0f)) - hl.L(10.0f), hl.L(28.0f) - hl.L(12.5f));
                } else {
                    canvas2.translate((i - (i19 / 2)) - hl.L(10.0f), hl.L(28.0f) - hl.L(12.5f));
                }
                this.I[i4].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.I[i4].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                f2 = 0.0f;
                canvas2.translate((this.I[i4].getIntrinsicWidth() / 2.0f) - hl.L(i4 == 0 ? f : 2.0f), 0.0f);
            } else {
                f2 = 0.0f;
            }
            if (i4 == 0) {
                canvas2.drawText(str, hl.L(22.0f), hl.L(28.0f), textPaint);
            } else if (i4 == this.G.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i19) - hl.L(22.0f), hl.L(28.0f), textPaint);
            } else {
                canvas2.drawText(str, i - (i19 / 2), hl.L(28.0f), textPaint);
            }
            if (this.I != null) {
                canvas2.restore();
            }
            i4++;
            f3 = f2;
            z = z2 ? 1 : 0;
            f4 = f9;
            i3 = 2;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.e(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(74.0f), TLObject.FLAG_30));
        this.f = hl.L(6.0f);
        this.h = hl.L(2.0f);
        this.n = hl.L(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f;
        String[] strArr = this.G;
        this.r = (((measuredWidth - (i3 * strArr.length)) - ((strArr.length - 1) * (this.h << 1))) - (this.n << 1)) / Math.max(1, strArr.length - 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float a = ete.a(((this.f / 2.0f) + (x - this.n)) / ((this.r + (this.h << 1)) + r3), 0.0f, this.G.length - 1);
        boolean z = Math.abs(a - ((float) Math.round(a))) < 0.35f;
        if (z) {
            a = Math.round(a);
        }
        int i = this.K;
        if (i != Integer.MIN_VALUE) {
            a = Math.max(a, i);
        }
        if (motionEvent.getAction() == 0) {
            this.y = x;
            this.E = y;
            this.L = a;
            this.F = this.J;
            this.x = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.w && Math.abs(this.y - x) > Math.abs(this.E - y)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.x && Math.abs(this.y - x) >= hl.e) {
                this.w = true;
                this.x = false;
            }
            if (this.w) {
                this.L = a;
                invalidate();
                if (Math.round(this.L) != this.J && z) {
                    setOption(Math.round(this.L));
                }
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (this.w) {
            int i2 = this.J;
            if (i2 != this.F) {
                setOption(i2);
            }
        } else {
            this.L = a;
            if (motionEvent.getAction() == 1 && Math.round(this.L) != this.J) {
                setOption(Math.round(this.L));
            }
        }
        yma ymaVar = this.O;
        if (ymaVar != null) {
            ymaVar.m();
        }
        this.x = false;
        this.w = false;
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(false);
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || this.a.g(this, i, bundle);
    }

    public void setCallback(yma ymaVar) {
        this.O = ymaVar;
    }

    public void setDashedFrom(int i) {
        this.s = i;
    }

    public void setMinAllowedIndex(int i) {
        String[] strArr;
        if (i != -1 && (strArr = this.G) != null) {
            i = Math.min(i, strArr.length - 1);
        }
        if (this.K != i) {
            this.K = i;
            if (this.J < i) {
                this.J = i;
            }
            invalidate();
        }
    }
}
