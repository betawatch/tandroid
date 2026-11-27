// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import java.util.Random;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class tk4 extends View implements snb {
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final vnb M;
    public float[] N;
    public Paint O;
    public int P;
    public int Q;
    public float R;
    public tk4 S;
    public boolean T;
    public float U;
    public int a;
    public LinearGradient b;
    public final Paint c;
    public final Paint d;
    public long e;
    public int f;
    public final Matrix h;
    public final RectF n;
    public int r;
    public int s;
    public int w;
    public boolean x;
    public boolean y;

    public tk4(Context context, vnb vnbVar) {
        super(context);
        this.c = new Paint();
        this.d = new Paint();
        this.n = new RectF();
        this.x = true;
        this.I = aob.G8;
        this.J = aob.i6;
        this.K = -1;
        this.L = 1;
        this.M = vnbVar;
        this.h = new Matrix();
    }

    public final float a(float f) {
        return ob6.a0 ? getMeasuredWidth() - f : f;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.I));
        hashSet.add(Integer.valueOf(this.J));
    }

    public final void b(RectF rectF) {
        if (ob6.a0) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i) {
        switch (getViewType()) {
            case 1:
                return hl.L(78.0f) + 1;
            case 2:
                return hl.L(2.0f) + ((i - ((getColumnsCount() - 1) * hl.L(2.0f))) / getColumnsCount());
            case 3:
            case 4:
                return hl.L(56.0f);
            case 5:
                return hl.L(80.0f);
            case 6:
            case 18:
                return hl.L(64.0f);
            case 7:
                return hl.L((xea.l1 ? 78 : 72) + 1);
            case 8:
                return hl.L(61.0f);
            case 9:
                return hl.L(66.0f);
            case 10:
                return hl.L(58.0f);
            case 11:
                return hl.L(36.0f);
            case 12:
                return hl.L(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return hl.L(107.0f);
            case 16:
            case 23:
                return hl.L(50.0f);
            case 19:
                return hl.L(58.0f);
            case 21:
                return hl.L(58.0f);
            case 22:
                return hl.L(60.0f);
            case 24:
                return hl.L((xea.l1 ? 76 : 64) + 1);
            case 25:
                return hl.L(51.0f);
            case 26:
                return hl.L(50.0f) + 1;
            case 28:
                return hl.L(58.0f);
            case 29:
                return hl.L(60.0f) + 1;
            case jn7.S /* 30 */:
                return hl.L(32.0f);
            case 31:
                return hl.L(48.0f) + 1;
            case 32:
                return hl.L(56.0f) + 1;
            case 33:
                return hl.L(58.0f);
            case 34:
                return hl.L(140.0f);
            case 35:
                return hl.L(112.0f);
            case 36:
                return hl.L(108.0f);
            case 37:
                return hl.L(73.0f);
            case 38:
                return hl.L(58.0f);
            case 39:
                return hl.L(99.0f);
        }
    }

    public final int d(int i) {
        return aob.v0(i, this.M);
    }

    public final void e(int i, int i2, int i3) {
        this.I = i;
        this.J = i2;
        this.K = i3;
        invalidate();
    }

    public final void f() {
        tk4 tk4Var = this.S;
        if (tk4Var != null) {
            tk4Var.f();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.e - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int i = this.P;
        if (i == 0) {
            i = getMeasuredWidth();
        }
        int i2 = this.F;
        if (i2 == 34 || i2 == 35 || i2 == 36) {
            i = Math.max(i, hl.q.x);
        }
        int i3 = this.Q;
        if (i3 == 0) {
            i3 = getMeasuredHeight();
        }
        this.e = elapsedRealtime;
        boolean z = this.E;
        Matrix matrix = this.h;
        if (z || this.F == 13 || getViewType() == 14 || getViewType() == 17) {
            int i4 = (int) (((abs * i) / 400.0f) + this.f);
            this.f = i4;
            if (i4 >= (i << 1)) {
                i4 = (-this.a) << 1;
                this.f = i4;
            }
            matrix.setTranslate(i4 + this.R, 0.0f);
        } else {
            int i5 = (int) (((abs * i3) / 400.0f) + this.f);
            this.f = i5;
            if (i5 >= (i3 << 1)) {
                i5 = (-this.a) << 1;
                this.f = i5;
            }
            matrix.setTranslate(this.R, i5);
        }
        LinearGradient linearGradient = this.b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public int getAdditionalHeight() {
        return 0;
    }

    public int getColumnsCount() {
        return 2;
    }

    public Paint getPaint() {
        return this.c;
    }

    public int getViewType() {
        return this.F;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        Paint paint2;
        float f;
        if (this.S != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                tk4 tk4Var = this.S;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f2 = -getX();
                tk4Var.P = measuredWidth;
                tk4Var.Q = measuredHeight;
                tk4Var.R = f2;
            }
            paint = this.S.c;
        } else {
            paint = this.c;
        }
        Paint paint3 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.R = -getX();
        }
        updateColors();
        f();
        int i = this.G;
        if (this.y) {
            int L = hl.L(32.0f) + i;
            int i2 = this.K;
            Paint paint4 = this.d;
            if (i2 >= 0) {
                paint4.setColor(d(i2));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hl.L(32.0f), this.K >= 0 ? paint4 : paint3);
            canvas2 = canvas;
            i = L;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        float f3 = 8.0f;
        float f4 = 2.0f;
        int i3 = 0;
        RectF rectF = this.n;
        if (viewType == 39) {
            canvas2.save();
            if (ob6.a0) {
                canvas2.scale(-1.0f, 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            }
            int i4 = 0;
            while (i < getMeasuredHeight()) {
                canvas2.drawCircle(hl.L(22.0f), hl.L(18.0f) + i, hl.L(f3), paint3);
                rectF.set(hl.L(36.0f), hl.L(12.0f) + i, hl.L(128.0f), hl.L(24.0f) + i);
                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                rectF.set(getMeasuredWidth() - hl.L(83.0f), hl.L(10.0f) + i, getMeasuredWidth() - hl.L(11.0f), hl.L(82.0f) + i);
                canvas2.drawRoundRect(rectF, hl.L(f3), hl.L(f3), paint3);
                int i5 = 0;
                while (i5 < 3) {
                    int i6 = i5 * 18;
                    rectF.set(hl.L(14.0f), hl.L(i6 + 33) + i, getMeasuredWidth() - hl.L(i5 == 2 ? 136.0f : 100.0f), hl.L(i6 + 45) + i);
                    canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    i5++;
                    f3 = f3;
                }
                float f5 = f3;
                i = qd4.h(this, i);
                if (this.E && (i4 = i4 + 1) >= this.L) {
                    break;
                } else {
                    f3 = f5;
                }
            }
            canvas2.restore();
        } else {
            float f6 = 8.0f;
            int i7 = 1;
            if (getViewType() == 7) {
                while (i <= getMeasuredHeight()) {
                    int c = c(getMeasuredWidth());
                    canvas2.drawCircle(a(hl.L(10.0f) + r4), (c >> 1) + i, hl.L(28.0f), paint3);
                    rectF.set(hl.L(76.0f), hl.L(16.0f) + i, hl.L(148.0f), hl.L(24.0f) + i);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    rectF.set(hl.L(76.0f), hl.L(38.0f) + i, hl.L(268.0f), hl.L(46.0f) + i);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    if (xea.l1) {
                        rectF.set(hl.L(76.0f), hl.L(54.0f) + i, hl.L(220.0f), hl.L(62.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    }
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(16.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(24.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    }
                    i = qd4.h(this, i);
                    int i8 = i3 + 1;
                    if (this.E && i8 >= this.L) {
                        break;
                    } else {
                        i3 = i8;
                    }
                }
            } else if (getViewType() == 24) {
                while (i <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(hl.L(10.0f) + r3), uh9.w(10.0f, i, r3), hl.L(14.0f), paint3);
                    canvas2.save();
                    canvas2.translate(0.0f, -hl.L(4.0f));
                    rectF.set(hl.L(50.0f), hl.L(16.0f) + i, hl.L(148.0f), hl.L(24.0f) + i);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    rectF.set(hl.L(50.0f), hl.L(38.0f) + i, hl.L(268.0f), hl.L(46.0f) + i);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    if (xea.l1) {
                        rectF.set(hl.L(50.0f), hl.L(54.0f) + i, hl.L(220.0f), hl.L(62.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    }
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(16.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(24.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    }
                    canvas2.restore();
                    i += c(getMeasuredWidth());
                    int i9 = i3 + 1;
                    if (this.E && i9 >= this.L) {
                        break;
                    } else {
                        i3 = i9;
                    }
                }
            } else if (getViewType() == 18) {
                int i10 = i;
                while (i10 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(uh9.w(9.0f, this.H, r1)), hl.L(32.0f) + i10, hl.L(25.0f), paint3);
                    int i11 = i3 % 2 == 0 ? 52 : 72;
                    rectF.set(hl.L(76.0f), hl.L(20.0f) + i10, hl.L(i11 + 76), hl.L(28.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    rectF.set(hl.L(i11 + 84), hl.L(20.0f) + i10, hl.L(i11 + jn7.x2), hl.L(28.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    rectF.set(hl.L(76.0f), hl.L(42.0f) + i10, hl.L(140.0f), hl.L(50.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint3);
                    Canvas canvas3 = canvas2;
                    Paint paint5 = paint3;
                    canvas3.drawLine(hl.L(76.0f), qd4.h(this, i10), getMeasuredWidth(), qd4.h(this, i10), paint5);
                    canvas2 = canvas3;
                    i10 = qd4.h(this, i10);
                    int i12 = i3 + 1;
                    if (this.E && i12 >= this.L) {
                        break;
                    }
                    i3 = i12;
                    paint3 = paint5;
                }
            } else {
                Paint paint6 = paint3;
                float f7 = 10.0f;
                float f8 = 6.0f;
                if (getViewType() == 37 || getViewType() == 38) {
                    boolean z = getViewType() == 37;
                    int c2 = c(getMeasuredWidth());
                    while (i <= getMeasuredHeight()) {
                        int i13 = this.H;
                        if (z) {
                            canvas2.drawCircle(hl.L(36.0f) + i13, hl.L(35.0f) + i, hl.L(23.0f), paint6);
                        } else {
                            rectF.set(hl.L(15.0f) + i13, hl.L(6.0f) + i, hl.L(61.0f) + this.H, hl.L(52.0f) + i);
                            canvas2.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint6);
                        }
                        float L2 = hl.L(71.0f) + this.H;
                        float max = Math.max(L2, getMeasuredWidth() - hl.L(z ? 76.0f : 20.0f));
                        rectF.set(L2, hl.L(14.0f) + i, Math.min(hl.L(100.0f) + L2, max), hl.L(22.0f) + i);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(L2, hl.L(z ? 33.0f : 36.0f) + i, Math.min(hl.L(140.0f) + L2, max), hl.L(z ? 41.0f : 44.0f) + i);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        if (z) {
                            rectF.set(L2, hl.L(51.0f) + i, Math.min(hl.L(80.0f) + L2, max), hl.L(59.0f) + i);
                            canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                            if (getMeasuredWidth() - hl.L(68.0f) >= L2) {
                                rectF.set(getMeasuredWidth() - hl.L(68.0f), hl.L(15.0f) + i, getMeasuredWidth() - hl.L(20.0f), hl.L(23.0f) + i);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                            }
                        }
                        i += c2;
                        int i14 = i3 + 1;
                        if (this.E && i14 >= this.L) {
                            break;
                        } else {
                            i3 = i14;
                        }
                    }
                } else if (getViewType() == 19) {
                    int i15 = i;
                    while (i15 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(uh9.w(9.0f, this.H, r1)), hl.L(29.0f) + i15, hl.L(20.0f), paint6);
                        rectF.set(hl.L(76.0f), hl.L(16.0f) + i15, hl.L((i3 % 2 == 0 ? 92 : 128) + 76), hl.L(24.0f) + i15);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(76.0f), hl.L(38.0f) + i15, hl.L(240.0f), hl.L(46.0f) + i15);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        Canvas canvas4 = canvas2;
                        Paint paint7 = paint6;
                        canvas4.drawLine(hl.L(76.0f), qd4.h(this, i15), getMeasuredWidth(), qd4.h(this, i15), paint7);
                        canvas2 = canvas4;
                        paint6 = paint7;
                        i15 = qd4.h(this, i15);
                        int i16 = i3 + 1;
                        if (this.E && i16 >= this.L) {
                            break;
                        } else {
                            i3 = i16;
                        }
                    }
                } else if (getViewType() == 1) {
                    while (i <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(hl.L(9.0f) + r4), (hl.L(78.0f) >> 1) + i, hl.L(25.0f), paint6);
                        rectF.set(hl.L(68.0f), hl.L(20.0f) + i, hl.L(140.0f), hl.L(28.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f), hl.L(42.0f) + i, hl.L(260.0f), hl.L(50.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(20.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(28.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        }
                        i = qd4.h(this, i);
                        int i17 = i3 + 1;
                        if (this.E && i17 >= this.L) {
                            break;
                        } else {
                            i3 = i17;
                        }
                    }
                } else if (getViewType() == 2 || getViewType() == 27) {
                    int i18 = 2;
                    int measuredWidth2 = (getMeasuredWidth() - ((getColumnsCount() - 1) * hl.L(2.0f))) / getColumnsCount();
                    int i19 = getViewType() == 27 ? (int) (measuredWidth2 * 1.25f) : measuredWidth2;
                    int i20 = i;
                    int i21 = 0;
                    while (true) {
                        if (i20 >= getMeasuredHeight() && !this.E) {
                            break;
                        }
                        int i22 = 0;
                        while (i22 < getColumnsCount()) {
                            if (i21 != 0 || i22 >= this.w) {
                                paint2 = paint6;
                                canvas.drawRect((hl.L(2.0f) + measuredWidth2) * i22, i20, r1 + measuredWidth2, i20 + i19, paint2);
                            } else {
                                paint2 = paint6;
                            }
                            i22++;
                            paint6 = paint2;
                        }
                        Paint paint8 = paint6;
                        i20 = uh9.w(2.0f, i19, i20);
                        i21++;
                        int i23 = i18;
                        if (this.E && i21 >= i23) {
                            break;
                        }
                        i18 = i23;
                        paint6 = paint8;
                    }
                } else if (getViewType() == 3) {
                    while (i <= getMeasuredHeight()) {
                        rectF.set(hl.L(12.0f), hl.L(8.0f) + i, hl.L(52.0f), hl.L(48.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f), hl.L(12.0f) + i, hl.L(140.0f), hl.L(20.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f), hl.L(34.0f) + i, hl.L(260.0f), hl.L(42.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(12.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(20.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        }
                        i = qd4.h(this, i);
                        int i24 = i3 + 1;
                        if (this.E && i24 >= this.L) {
                            break;
                        } else {
                            i3 = i24;
                        }
                    }
                } else if (getViewType() == 4) {
                    while (i <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(hl.L(12.0f) + r4), uh9.w(6.0f, i, r4), hl.L(44.0f) >> 1, paint6);
                        rectF.set(hl.L(68.0f), hl.L(12.0f) + i, hl.L(140.0f), hl.L(20.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f), hl.L(34.0f) + i, hl.L(260.0f), hl.L(42.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(12.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(20.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        }
                        i = qd4.h(this, i);
                        int i25 = i3 + 1;
                        if (this.E && i25 >= this.L) {
                            break;
                        } else {
                            i3 = i25;
                        }
                    }
                } else if (getViewType() == 5) {
                    while (i <= getMeasuredHeight()) {
                        rectF.set(hl.L(10.0f), hl.L(11.0f) + i, hl.L(62.0f), hl.L(63.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f), hl.L(12.0f) + i, hl.L(140.0f), hl.L(20.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f), hl.L(34.0f) + i, hl.L(268.0f), hl.L(42.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f), hl.L(54.0f) + i, hl.L(188.0f), hl.L(62.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(12.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(20.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        }
                        i = qd4.h(this, i);
                        int i26 = i3 + 1;
                        if (this.E && i26 >= this.L) {
                            break;
                        } else {
                            i3 = i26;
                        }
                    }
                } else if (getViewType() == 6 || getViewType() == 10) {
                    while (i <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(uh9.w(9.0f, this.H, r4)), (hl.L(64.0f) >> 1) + i, hl.L(23.0f), paint6);
                        rectF.set(hl.L(68.0f) + this.H, hl.L(17.0f) + i, hl.L(260.0f) + this.H, hl.L(25.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f) + this.H, hl.L(39.0f) + i, hl.L(140.0f) + this.H, hl.L(47.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(20.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(28.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        }
                        i = qd4.h(this, i);
                        int i27 = i3 + 1;
                        if (this.E && i27 >= this.L) {
                            break;
                        } else {
                            i3 = i27;
                        }
                    }
                } else if (getViewType() == 29) {
                    while (i <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(uh9.w(9.0f, this.H, r4)), (hl.L(64.0f) >> 1) + i, hl.L(23.0f), paint6);
                        rectF.set(hl.L(68.0f) + this.H, hl.L(17.0f) + i, hl.L(260.0f) + this.H, hl.L(25.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f) + this.H, hl.L(39.0f) + i, hl.L(140.0f) + this.H, hl.L(47.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        i = qd4.h(this, i);
                        int i28 = i3 + 1;
                        if (this.E && i28 >= this.L) {
                            break;
                        } else {
                            i3 = i28;
                        }
                    }
                } else if (getViewType() == 33) {
                    while (i <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(uh9.w(13.0f, this.H, r4)), (hl.L(58.0f) >> 1) + i, hl.L(23.0f), paint6);
                        rectF.set(hl.L(72.0f) + this.H, hl.L(17.0f) + i, hl.L(260.0f) + this.H, hl.L(25.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(72.0f) + this.H, hl.L(39.0f) + i, hl.L(140.0f) + this.H, hl.L(47.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        i = qd4.h(this, i);
                        int i29 = i3 + 1;
                        if (this.E && i29 >= this.L) {
                            break;
                        } else {
                            i3 = i29;
                        }
                    }
                } else if (getViewType() == 30) {
                    while (i <= getMeasuredHeight()) {
                        i += c(getMeasuredWidth());
                        rectF.set(0.0f, i, getMeasuredWidth(), i);
                        b(rectF);
                        canvas2.drawRect(rectF, paint6);
                        int i30 = i3 + 1;
                        if (this.E && i30 >= this.L) {
                            break;
                        } else {
                            i3 = i30;
                        }
                    }
                } else if (getViewType() == 8) {
                    while (i <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(uh9.w(11.0f, this.H, r4)), (hl.L(64.0f) >> 1) + i, hl.L(23.0f), paint6);
                        rectF.set(hl.L(68.0f) + this.H, hl.L(17.0f) + i, hl.L(140.0f) + this.H, hl.L(25.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(68.0f) + this.H, hl.L(39.0f) + i, hl.L(260.0f) + this.H, hl.L(47.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(20.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(28.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        }
                        i = qd4.h(this, i);
                        int i31 = i3 + 1;
                        if (this.E && i31 >= this.L) {
                            break;
                        } else {
                            i3 = i31;
                        }
                    }
                } else if (getViewType() == 9) {
                    while (i <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(hl.L(35.0f)), (c(getMeasuredWidth()) >> 1) + i, hl.L(32.0f) / 2, paint6);
                        rectF.set(hl.L(72.0f), hl.L(16.0f) + i, hl.L(268.0f), hl.L(24.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(hl.L(72.0f), hl.L(38.0f) + i, hl.L(140.0f), hl.L(46.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(16.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(24.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        }
                        i = qd4.h(this, i);
                        int i32 = i3 + 1;
                        if (this.E && i32 >= this.L) {
                            break;
                        } else {
                            i3 = i32;
                        }
                    }
                } else if (getViewType() == 11) {
                    int i33 = 0;
                    while (i <= getMeasuredHeight()) {
                        rectF.set(hl.L(18.0f), hl.L(14.0f), (getMeasuredWidth() * 0.5f) + hl.L(this.N[0] * 40.0f), hl.L(8.0f) + hl.L(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        rectF.set(getMeasuredWidth() - hl.L(18.0f), hl.L(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - hl.L(this.N[0] * 20.0f), hl.L(8.0f) + hl.L(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                        i = qd4.h(this, i);
                        i33++;
                        if (this.E && i33 >= this.L) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int L3 = hl.L(14.0f) + i;
                    while (L3 <= getMeasuredHeight()) {
                        int measuredWidth3 = getMeasuredWidth() / 4;
                        for (int i34 = 0; i34 < 4; i34++) {
                            float f9 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i34);
                            canvas2.drawCircle(f9, (hl.L(56.0f) / 2.0f) + hl.L(7.0f) + L3, hl.L(28.0f), paint6);
                            float L4 = hl.L(16.0f) + hl.L(56.0f) + hl.L(7.0f) + L3;
                            RectF rectF2 = hl.P;
                            rectF2.set(f9 - hl.L(24.0f), L4 - hl.L(4.0f), f9 + hl.L(24.0f), L4 + hl.L(4.0f));
                            canvas2.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), paint6);
                        }
                        L3 = qd4.h(this, L3);
                        if (this.E) {
                            break;
                        }
                    }
                } else if (getViewType() == 13) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    RectF rectF3 = hl.P;
                    rectF3.set(hl.L(40.0f), measuredHeight2 - hl.L(4.0f), getMeasuredWidth() - hl.L(120.0f), hl.L(4.0f) + measuredHeight2);
                    canvas2.drawRoundRect(rectF3, hl.L(4.0f), hl.L(4.0f), paint6);
                    if (this.O == null) {
                        Paint paint9 = new Paint(1);
                        this.O = paint9;
                        paint9.setColor(aob.u0(aob.G8));
                    }
                    for (int i35 = 0; i35 < 3; i35++) {
                        canvas2.drawCircle(uh9.y(12.0f, i35, hl.L(13.0f) + (getMeasuredWidth() - hl.L(56.0f))), measuredHeight2, hl.L(13.0f), this.O);
                        canvas2.drawCircle(uh9.y(12.0f, i35, hl.L(13.0f) + (getMeasuredWidth() - hl.L(56.0f))), measuredHeight2, hl.L(12.0f), paint6);
                    }
                } else {
                    float f10 = 21.0f;
                    if (getViewType() == 14 || getViewType() == 17) {
                        int L5 = hl.L(12.0f);
                        int L6 = hl.L(77.0f);
                        int L7 = hl.L(4.0f);
                        float L8 = hl.L(21.0f);
                        float L9 = hl.L(41.0f);
                        while (L5 < getMeasuredWidth()) {
                            Paint paint10 = this.O;
                            if (paint10 == null) {
                                paint10 = new Paint(i7);
                                this.O = paint10;
                            }
                            paint10.setColor(aob.v0(aob.h5, this.M));
                            RectF rectF4 = hl.P;
                            int i36 = L5 + L6;
                            int i37 = i7;
                            float f11 = f10;
                            rectF4.set(hl.L(4.0f) + L5, hl.L(4.0f), i36 - hl.L(4.0f), getMeasuredHeight() - hl.L(4.0f));
                            canvas2.drawRoundRect(rectF4, hl.L(f8), hl.L(f8), paint6);
                            if (getViewType() == 14) {
                                float L10 = hl.L(8.0f) + L7;
                                float f12 = L5;
                                float L11 = hl.L(22.0f) + L7 + f12;
                                rectF.set(L11, L10, L11 + L9, L10 + L8);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                                float L12 = hl.L(4.0f) + L8 + L10;
                                float L13 = f12 + hl.L(5.0f) + L7;
                                rectF.set(L13, L12, L13 + L9, L12 + L8);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                            } else if (getViewType() == 17) {
                                float L14 = hl.L(5.0f);
                                float L15 = hl.L(32.0f);
                                f = f8;
                                float z2 = bp1.z(L6, L15, f4, L5);
                                rectF4.set(z2, hl.L(f11), L15 + z2, hl.L(32.0f) + r13);
                                canvas2.drawRoundRect(rectF4, L14, L14, this.O);
                                canvas2.drawCircle((L6 / 2) + L5, getMeasuredHeight() - hl.L(20.0f), hl.L(8.0f), this.O);
                                L5 = i36;
                                i7 = i37;
                                f10 = f11;
                                f8 = f;
                                f4 = 2.0f;
                            }
                            f = f8;
                            canvas2.drawCircle((L6 / 2) + L5, getMeasuredHeight() - hl.L(20.0f), hl.L(8.0f), this.O);
                            L5 = i36;
                            i7 = i37;
                            f10 = f11;
                            f8 = f;
                            f4 = 2.0f;
                        }
                    } else if (getViewType() == 15) {
                        int L16 = hl.L(23.0f);
                        int L17 = hl.L(4.0f);
                        while (i <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(uh9.w(12.0f, this.H, L16)), uh9.w(f6, i, L16), L16, paint6);
                            rectF.set(hl.L(74.0f) + this.H, hl.L(12.0f) + i, hl.L(260.0f) + this.H, hl.L(20.0f) + i);
                            b(rectF);
                            float f13 = L17;
                            canvas2.drawRoundRect(rectF, f13, f13, paint6);
                            rectF.set(hl.L(74.0f) + this.H, hl.L(36.0f) + i, hl.L(140.0f) + this.H, hl.L(42.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, f13, f13, paint6);
                            if (this.U > 0.0f) {
                                rectF.set(hl.L(73.0f) + this.H, hl.L(62.0f) + i, hl.L(73.0f) + this.H + this.U, hl.L(94.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, f13, f13, paint6);
                            }
                            i = qd4.h(this, i);
                            int i38 = i3 + 1;
                            if (this.E && i38 >= this.L) {
                                break;
                            }
                            i3 = i38;
                            f6 = 8.0f;
                        }
                    } else if (getViewType() == 16 || getViewType() == 23) {
                        int i39 = 0;
                        while (i <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(uh9.w(8.0f, this.H, r5)), hl.L(24.0f) + i, hl.L(18.0f), paint6);
                            rectF.set(hl.L(58.0f) + this.H, hl.L(20.0f) + i, getWidth() - hl.L(53.0f), hl.L(28.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint6);
                            if (i39 < 4) {
                                canvas2.drawCircle(a(qu6.x(12.0f, getWidth(), r5)), hl.L(24.0f) + i, hl.L(12.0f), paint6);
                            }
                            i = qd4.h(this, i);
                            i39++;
                            if (this.E && i39 >= this.L) {
                                break;
                            }
                        }
                        rectF.set(hl.L(8.0f) + this.H, hl.L(20.0f) + i, getWidth() - hl.L(8.0f), hl.L(28.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint6);
                        rectF.set(hl.L(8.0f) + this.H, hl.L(36.0f) + i, getWidth() - hl.L(53.0f), hl.L(44.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint6);
                    } else {
                        int i40 = this.F;
                        if (i40 == 21) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(hl.L(20.0f) + r4), (hl.L(58.0f) >> 1) + i, hl.L(46.0f) >> 1, paint6);
                                rectF.set(hl.L(74.0f), hl.L(16.0f) + i, hl.L(140.0f), hl.L(24.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                rectF.set(hl.L(74.0f), hl.L(38.0f) + i, hl.L(260.0f), hl.L(46.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                i = qd4.h(this, i);
                                int i41 = i3 + 1;
                                if (this.E && i41 >= this.L) {
                                    break;
                                } else {
                                    i3 = i41;
                                }
                            }
                        } else if (i40 == 22) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(hl.L(20.0f) + r4), uh9.w(6.0f, i, r4), hl.L(48.0f) >> 1, paint6);
                                rectF.set(hl.L(76.0f), hl.L(16.0f) + i, hl.L(140.0f), hl.L(24.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                rectF.set(hl.L(76.0f), hl.L(38.0f) + i, hl.L(260.0f), hl.L(46.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                i = qd4.h(this, i);
                                int i42 = i3 + 1;
                                if (this.E && i42 >= this.L) {
                                    break;
                                } else {
                                    i3 = i42;
                                }
                            }
                        } else if (i40 == 25) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(hl.L(17.0f) + r4, uh9.w(6.0f, i, r4), hl.L(38.0f) >> 1, paint6);
                                rectF.set(hl.L(76.0f), hl.L(21.0f) + i, hl.L(220.0f), hl.L(29.0f) + i);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                i = qd4.h(this, i);
                                int i43 = i3 + 1;
                                if (this.E && i43 >= this.L) {
                                    break;
                                } else {
                                    i3 = i43;
                                }
                            }
                        } else if (i40 == 26) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(ob6.a0 ? qu6.x(21.0f, getMeasuredWidth(), r4) : hl.L(21.0f) + r4, uh9.w(16.0f, i, r4), hl.L(21.0f) >> 1, paint6);
                                rectF.set(hl.L(60.0f), hl.L(21.0f) + i, hl.L(190.0f), hl.L(29.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                rectF.set(getMeasuredWidth() - hl.L(16.0f), hl.L(21.0f) + i, getMeasuredWidth() - hl.L(62.0f), hl.L(29.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                i = qd4.h(this, i);
                                int i44 = i3 + 1;
                                if (this.E && i44 >= this.L) {
                                    break;
                                } else {
                                    i3 = i44;
                                }
                            }
                        } else if (getViewType() == 28) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(uh9.w(f7, this.H, r4)), (hl.L(58.0f) >> 1) + i, hl.L(24.0f), paint6);
                                rectF.set(hl.L(68.0f) + this.H, hl.L(17.0f) + i, hl.L(260.0f) + this.H, hl.L(25.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                rectF.set(hl.L(68.0f) + this.H, hl.L(39.0f) + i, hl.L(140.0f) + this.H, hl.L(47.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - hl.L(50.0f), hl.L(20.0f) + i, getMeasuredWidth() - hl.L(12.0f), hl.L(28.0f) + i);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                }
                                i = qd4.h(this, i);
                                int i45 = i3 + 1;
                                if (this.E && i45 >= this.L) {
                                    break;
                                }
                                i3 = i45;
                                f7 = 10.0f;
                            }
                        } else if (getViewType() == 31) {
                            while (i <= getMeasuredHeight()) {
                                int c3 = c(getMeasuredWidth());
                                float f14 = i;
                                rectF.set(hl.L(18.0f) + this.H, ((c3 - hl.L(22.0f)) / 2.0f) + f14, hl.L(40.0f) + this.H, ((hl.L(22.0f) + c3) / 2.0f) + f14);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(11.0f), hl.L(11.0f), paint6);
                                rectF.set(hl.L(58.0f) + this.H, ((c3 - hl.L(8.0f)) / 2.0f) + f14, c00.y(19.0f, getMeasuredWidth(), hl.L(132.0f) + this.H), ((hl.L(8.0f) + c3) / 2.0f) + f14);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                i += c3;
                                int i46 = i3 + 1;
                                if (this.E && i46 >= this.L) {
                                    break;
                                } else {
                                    i3 = i46;
                                }
                            }
                        } else if (getViewType() == 32) {
                            while (i <= getMeasuredHeight()) {
                                int c4 = c(getMeasuredWidth());
                                float f15 = i;
                                rectF.set(hl.L(10.0f) + this.H, ((c4 - hl.L(32.0f)) / 2.0f) + f15, hl.L(42.0f) + this.H, ((hl.L(32.0f) + c4) / 2.0f) + f15);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint6);
                                rectF.set(hl.L(64.0f) + this.H, (((c4 - hl.L(14.0f)) - hl.L(10.0f)) / 2.0f) + f15, c00.y(19.0f, getMeasuredWidth(), hl.L(118.0f) + this.H), ((hl.L(10.0f) + (c4 - hl.L(14.0f))) / 2.0f) + f15);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                rectF.set(hl.L(64.0f) + this.H, (((hl.L(14.0f) + c4) - hl.L(8.0f)) / 2.0f) + f15, c00.y(19.0f, getMeasuredWidth(), hl.L(144.0f) + this.H), ((hl.L(8.0f) + (hl.L(14.0f) + c4)) / 2.0f) + f15);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint6);
                                i += c4;
                                int i47 = i3 + 1;
                                if (this.E && i47 >= this.L) {
                                    break;
                                } else {
                                    i3 = i47;
                                }
                            }
                        } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                            rectF.set(this.H, this.G, getMeasuredWidth() - this.H, getMeasuredHeight() - this.G);
                            rectF.inset(hl.L(3.33f), hl.L(4.0f));
                            canvas2.drawRoundRect(rectF, hl.L(11.0f), hl.L(11.0f), paint6);
                        }
                    }
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.E) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = this.L;
        if (i3 > 1 && this.T) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i)) * this.L), TLObject.FLAG_30));
        } else if (i3 <= 1 || View.MeasureSpec.getSize(i2) <= 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i)), TLObject.FLAG_30));
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i2), c(View.MeasureSpec.getSize(i)) * this.L), TLObject.FLAG_30));
        }
    }

    public void setGlobalGradientView(tk4 tk4Var) {
        this.S = tk4Var;
    }

    public void setIgnoreHeightCheck(boolean z) {
        this.T = z;
    }

    public void setIsSingleCell(boolean z) {
        this.E = z;
    }

    public void setItemsCount(int i) {
        this.L = i;
    }

    public void setMemberRequestButton(boolean z) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.L(14.0f));
        this.U = textPaint.measureText(ob6.M0(z ? 2131754371 : 2131754366, null)) + hl.L(34.0f);
    }

    public void setPaddingLeft(int i) {
        this.H = i;
        invalidate();
    }

    public void setPaddingTop(int i) {
        this.G = i;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z) {
        this.y = z;
    }

    public void setViewType(int i) {
        this.F = i;
        if (i == 11) {
            Random random = new Random();
            this.N = new float[2];
            for (int i2 = 0; i2 < 2; i2++) {
                this.N[i2] = Math.abs(random.nextInt() % 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        LinearGradient linearGradient;
        int i;
        tk4 tk4Var = this.S;
        if (tk4Var != null) {
            tk4Var.updateColors();
            return;
        }
        int i2 = this.I;
        vnb vnbVar = this.M;
        int v0 = aob.v0(i2, vnbVar);
        int v02 = aob.v0(this.J, vnbVar);
        if (this.s == v02 && this.r == v0) {
            return;
        }
        this.r = v0;
        this.s = v02;
        int i3 = this.F;
        if (i3 == 34 || i3 == 35 || i3 == 36) {
            this.a = hl.q.x;
        } else if (this.E || i3 == 13 || i3 == 14 || i3 == 17) {
            this.a = hl.L(200.0f);
        } else {
            this.a = hl.L(600.0f);
        }
        if (this.E || (i = this.F) == 13 || i == 14 || i == 17) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, this.a, 0.0f, new int[]{v02, v0, v0, v02}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.b = linearGradient2;
            linearGradient = linearGradient2;
        } else {
            linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.a, new int[]{v02, v0, v0, v02}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.b = linearGradient;
        }
        this.c.setShader(linearGradient);
    }

    public tk4(Context context) {
        this(context, null);
    }
}
