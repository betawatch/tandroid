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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class pi4 extends View implements tjb {
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final wjb M;
    public float[] N;
    public Paint O;
    public int P;
    public int Q;
    public float R;
    public pi4 S;
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

    public pi4(Context context, wjb wjbVar) {
        super(context);
        this.c = new Paint();
        this.d = new Paint();
        this.n = new RectF();
        this.x = true;
        this.I = bkb.F8;
        this.J = bkb.h6;
        this.K = -1;
        this.L = 1;
        this.M = wjbVar;
        this.h = new Matrix();
    }

    public final float a(float f) {
        return k96.a0 ? getMeasuredWidth() - f : f;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.I));
        hashSet.add(Integer.valueOf(this.J));
    }

    public final void b(RectF rectF) {
        if (k96.a0) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i) {
        switch (getViewType()) {
            case 1:
                return gl.L(78.0f) + 1;
            case 2:
                return gl.L(2.0f) + ((i - ((getColumnsCount() - 1) * gl.L(2.0f))) / getColumnsCount());
            case 3:
            case 4:
                return gl.L(56.0f);
            case 5:
                return gl.L(80.0f);
            case 6:
            case 18:
                return gl.L(64.0f);
            case 7:
                return gl.L((gba.l1 ? 78 : 72) + 1);
            case 8:
                return gl.L(61.0f);
            case 9:
                return gl.L(66.0f);
            case 10:
                return gl.L(58.0f);
            case 11:
                return gl.L(36.0f);
            case 12:
                return gl.L(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return gl.L(107.0f);
            case 16:
            case 23:
                return gl.L(50.0f);
            case 19:
                return gl.L(58.0f);
            case 21:
                return gl.L(58.0f);
            case 22:
                return gl.L(60.0f);
            case 24:
                return gl.L((gba.l1 ? 76 : 64) + 1);
            case 25:
                return gl.L(51.0f);
            case 26:
                return gl.L(50.0f) + 1;
            case 28:
                return gl.L(58.0f);
            case 29:
                return gl.L(60.0f) + 1;
            case kk7.S /* 30 */:
                return gl.L(32.0f);
            case 31:
                return gl.L(48.0f) + 1;
            case 32:
                return gl.L(56.0f) + 1;
            case 33:
                return gl.L(58.0f);
            case 34:
                return gl.L(140.0f);
            case 35:
                return gl.L(112.0f);
            case 36:
                return gl.L(108.0f);
            case 37:
                return gl.L(73.0f);
            case 38:
                return gl.L(58.0f);
        }
    }

    public final int d(int i) {
        return bkb.v0(i, this.M);
    }

    public final void e(int i, int i2, int i3) {
        this.I = i;
        this.J = i2;
        this.K = i3;
        invalidate();
    }

    public final void f() {
        pi4 pi4Var = this.S;
        if (pi4Var != null) {
            pi4Var.f();
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
            i = Math.max(i, gl.q.x);
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
                pi4 pi4Var = this.S;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f2 = -getX();
                pi4Var.P = measuredWidth;
                pi4Var.Q = measuredHeight;
                pi4Var.R = f2;
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
            int L = gl.L(32.0f) + i;
            int i2 = this.K;
            Paint paint4 = this.d;
            if (i2 >= 0) {
                paint4.setColor(d(i2));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gl.L(32.0f), this.K >= 0 ? paint4 : paint3);
            canvas2 = canvas;
            i = L;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i3 = 0;
        RectF rectF = this.n;
        if (viewType == 7) {
            while (i <= getMeasuredHeight()) {
                int c = c(getMeasuredWidth());
                canvas2.drawCircle(a(gl.L(10.0f) + r4), (c >> 1) + i, gl.L(28.0f), paint3);
                rectF.set(gl.L(76.0f), gl.L(16.0f) + i, gl.L(148.0f), gl.L(24.0f) + i);
                b(rectF);
                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                rectF.set(gl.L(76.0f), gl.L(38.0f) + i, gl.L(268.0f), gl.L(46.0f) + i);
                b(rectF);
                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                if (gba.l1) {
                    rectF.set(gl.L(76.0f), gl.L(54.0f) + i, gl.L(220.0f), gl.L(62.0f) + i);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                }
                if (this.x) {
                    rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(16.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(24.0f) + i);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                }
                i = tb4.h(this, i);
                int i4 = i3 + 1;
                if (this.E && i4 >= this.L) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        } else {
            float f3 = 0.0f;
            if (getViewType() == 24) {
                while (i <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(gl.L(10.0f) + r3), de9.w(10.0f, i, r3), gl.L(14.0f), paint3);
                    canvas2.save();
                    canvas2.translate(0.0f, -gl.L(4.0f));
                    rectF.set(gl.L(50.0f), gl.L(16.0f) + i, gl.L(148.0f), gl.L(24.0f) + i);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                    rectF.set(gl.L(50.0f), gl.L(38.0f) + i, gl.L(268.0f), gl.L(46.0f) + i);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                    if (gba.l1) {
                        rectF.set(gl.L(50.0f), gl.L(54.0f) + i, gl.L(220.0f), gl.L(62.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                    }
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(16.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(24.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                    }
                    canvas2.restore();
                    i += c(getMeasuredWidth());
                    int i5 = i3 + 1;
                    if (this.E && i5 >= this.L) {
                        break;
                    } else {
                        i3 = i5;
                    }
                }
            } else if (getViewType() == 18) {
                int i6 = i;
                while (i6 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(de9.w(9.0f, this.H, r1)), gl.L(32.0f) + i6, gl.L(25.0f), paint3);
                    int i7 = i3 % 2 == 0 ? 52 : 72;
                    rectF.set(gl.L(76.0f), gl.L(20.0f) + i6, gl.L(i7 + 76), gl.L(28.0f) + i6);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                    rectF.set(gl.L(i7 + 84), gl.L(20.0f) + i6, gl.L(i7 + kk7.x2), gl.L(28.0f) + i6);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                    rectF.set(gl.L(76.0f), gl.L(42.0f) + i6, gl.L(140.0f), gl.L(50.0f) + i6);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint3);
                    Canvas canvas3 = canvas2;
                    Paint paint5 = paint3;
                    canvas3.drawLine(gl.L(76.0f), tb4.h(this, i6), getMeasuredWidth(), tb4.h(this, i6), paint5);
                    canvas2 = canvas3;
                    i6 = tb4.h(this, i6);
                    int i8 = i3 + 1;
                    if (this.E && i8 >= this.L) {
                        break;
                    }
                    i3 = i8;
                    paint3 = paint5;
                }
            } else {
                Paint paint6 = paint3;
                float f4 = 6.0f;
                float f5 = 8.0f;
                if (getViewType() == 37 || getViewType() == 38) {
                    boolean z = getViewType() == 37;
                    int c2 = c(getMeasuredWidth());
                    while (i <= getMeasuredHeight()) {
                        int i9 = this.H;
                        if (z) {
                            canvas2.drawCircle(gl.L(36.0f) + i9, gl.L(35.0f) + i, gl.L(23.0f), paint6);
                        } else {
                            rectF.set(gl.L(15.0f) + i9, gl.L(6.0f) + i, gl.L(61.0f) + this.H, gl.L(52.0f) + i);
                            canvas2.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint6);
                        }
                        float L2 = gl.L(71.0f) + this.H;
                        float max = Math.max(L2, getMeasuredWidth() - gl.L(z ? 76.0f : 20.0f));
                        rectF.set(L2, gl.L(14.0f) + i, Math.min(gl.L(100.0f) + L2, max), gl.L(22.0f) + i);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                        rectF.set(L2, gl.L(z ? 33.0f : 36.0f) + i, Math.min(gl.L(140.0f) + L2, max), gl.L(z ? 41.0f : 44.0f) + i);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                        if (z) {
                            rectF.set(L2, gl.L(51.0f) + i, Math.min(gl.L(80.0f) + L2, max), gl.L(59.0f) + i);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                            if (getMeasuredWidth() - gl.L(68.0f) >= L2) {
                                rectF.set(getMeasuredWidth() - gl.L(68.0f), gl.L(15.0f) + i, getMeasuredWidth() - gl.L(20.0f), gl.L(23.0f) + i);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                            }
                        }
                        i += c2;
                        int i10 = i3 + 1;
                        if (this.E && i10 >= this.L) {
                            break;
                        } else {
                            i3 = i10;
                        }
                    }
                } else if (getViewType() == 19) {
                    int i11 = i;
                    while (i11 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(de9.w(9.0f, this.H, r1)), gl.L(29.0f) + i11, gl.L(20.0f), paint6);
                        rectF.set(gl.L(76.0f), gl.L(16.0f) + i11, gl.L((i3 % 2 == 0 ? 92 : 128) + 76), gl.L(24.0f) + i11);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                        rectF.set(gl.L(76.0f), gl.L(38.0f) + i11, gl.L(240.0f), gl.L(46.0f) + i11);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                        Canvas canvas4 = canvas2;
                        Paint paint7 = paint6;
                        canvas4.drawLine(gl.L(76.0f), tb4.h(this, i11), getMeasuredWidth(), tb4.h(this, i11), paint7);
                        canvas2 = canvas4;
                        paint6 = paint7;
                        i11 = tb4.h(this, i11);
                        int i12 = i3 + 1;
                        if (this.E && i12 >= this.L) {
                            break;
                        } else {
                            i3 = i12;
                        }
                    }
                } else if (getViewType() == 1) {
                    while (i <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(gl.L(9.0f) + r4), (gl.L(78.0f) >> 1) + i, gl.L(25.0f), paint6);
                        rectF.set(gl.L(68.0f), gl.L(20.0f) + i, gl.L(140.0f), gl.L(28.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                        rectF.set(gl.L(68.0f), gl.L(42.0f) + i, gl.L(260.0f), gl.L(50.0f) + i);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(20.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(28.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                        }
                        i = tb4.h(this, i);
                        int i13 = i3 + 1;
                        if (this.E && i13 >= this.L) {
                            break;
                        } else {
                            i3 = i13;
                        }
                    }
                } else {
                    float f6 = 10.0f;
                    if (getViewType() == 2 || getViewType() == 27) {
                        int i14 = 2;
                        int measuredWidth2 = (getMeasuredWidth() - ((getColumnsCount() - 1) * gl.L(2.0f))) / getColumnsCount();
                        int i15 = getViewType() == 27 ? (int) (measuredWidth2 * 1.25f) : measuredWidth2;
                        int i16 = i;
                        int i17 = 0;
                        while (true) {
                            if (i16 >= getMeasuredHeight() && !this.E) {
                                break;
                            }
                            int i18 = 0;
                            while (i18 < getColumnsCount()) {
                                if (i17 != 0 || i18 >= this.w) {
                                    paint2 = paint6;
                                    canvas.drawRect((gl.L(2.0f) + measuredWidth2) * i18, i16, r1 + measuredWidth2, i16 + i15, paint2);
                                } else {
                                    paint2 = paint6;
                                }
                                i18++;
                                paint6 = paint2;
                            }
                            Paint paint8 = paint6;
                            i16 = de9.w(2.0f, i15, i16);
                            i17++;
                            int i19 = i14;
                            if (this.E && i17 >= i19) {
                                break;
                            }
                            i14 = i19;
                            paint6 = paint8;
                        }
                    } else if (getViewType() == 3) {
                        while (i <= getMeasuredHeight()) {
                            rectF.set(gl.L(12.0f), gl.L(8.0f) + i, gl.L(52.0f), gl.L(48.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                            rectF.set(gl.L(68.0f), gl.L(12.0f) + i, gl.L(140.0f), gl.L(20.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                            rectF.set(gl.L(68.0f), gl.L(34.0f) + i, gl.L(260.0f), gl.L(42.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                            if (this.x) {
                                rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(12.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(20.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                            }
                            i = tb4.h(this, i);
                            int i20 = i3 + 1;
                            if (this.E && i20 >= this.L) {
                                break;
                            } else {
                                i3 = i20;
                            }
                        }
                    } else if (getViewType() == 4) {
                        while (i <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(gl.L(12.0f) + r4), de9.w(6.0f, i, r4), gl.L(44.0f) >> 1, paint6);
                            rectF.set(gl.L(68.0f), gl.L(12.0f) + i, gl.L(140.0f), gl.L(20.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                            rectF.set(gl.L(68.0f), gl.L(34.0f) + i, gl.L(260.0f), gl.L(42.0f) + i);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                            if (this.x) {
                                rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(12.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(20.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                            }
                            i = tb4.h(this, i);
                            int i21 = i3 + 1;
                            if (this.E && i21 >= this.L) {
                                break;
                            } else {
                                i3 = i21;
                            }
                        }
                    } else {
                        float f7 = 2.0f;
                        float f8 = 16.0f;
                        if (getViewType() == 5) {
                            while (i <= getMeasuredHeight()) {
                                rectF.set(gl.L(10.0f), gl.L(11.0f) + i, gl.L(62.0f), gl.L(63.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                rectF.set(gl.L(68.0f), gl.L(12.0f) + i, gl.L(140.0f), gl.L(20.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                rectF.set(gl.L(68.0f), gl.L(34.0f) + i, gl.L(268.0f), gl.L(42.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                rectF.set(gl.L(68.0f), gl.L(54.0f) + i, gl.L(188.0f), gl.L(62.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(12.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(20.0f) + i);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                }
                                i = tb4.h(this, i);
                                int i22 = i3 + 1;
                                if (this.E && i22 >= this.L) {
                                    break;
                                } else {
                                    i3 = i22;
                                }
                            }
                        } else if (getViewType() == 6 || getViewType() == 10) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(de9.w(9.0f, this.H, r4)), (gl.L(64.0f) >> 1) + i, gl.L(23.0f), paint6);
                                rectF.set(gl.L(68.0f) + this.H, gl.L(17.0f) + i, gl.L(260.0f) + this.H, gl.L(25.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                rectF.set(gl.L(68.0f) + this.H, gl.L(39.0f) + i, gl.L(140.0f) + this.H, gl.L(47.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(20.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(28.0f) + i);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                }
                                i = tb4.h(this, i);
                                int i23 = i3 + 1;
                                if (this.E && i23 >= this.L) {
                                    break;
                                } else {
                                    i3 = i23;
                                }
                            }
                        } else if (getViewType() == 29) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(de9.w(9.0f, this.H, r4)), (gl.L(64.0f) >> 1) + i, gl.L(23.0f), paint6);
                                rectF.set(gl.L(68.0f) + this.H, gl.L(17.0f) + i, gl.L(260.0f) + this.H, gl.L(25.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                rectF.set(gl.L(68.0f) + this.H, gl.L(39.0f) + i, gl.L(140.0f) + this.H, gl.L(47.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                i = tb4.h(this, i);
                                int i24 = i3 + 1;
                                if (this.E && i24 >= this.L) {
                                    break;
                                } else {
                                    i3 = i24;
                                }
                            }
                        } else if (getViewType() == 33) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(de9.w(13.0f, this.H, r4)), (gl.L(58.0f) >> 1) + i, gl.L(23.0f), paint6);
                                rectF.set(gl.L(72.0f) + this.H, gl.L(17.0f) + i, gl.L(260.0f) + this.H, gl.L(25.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                rectF.set(gl.L(72.0f) + this.H, gl.L(39.0f) + i, gl.L(140.0f) + this.H, gl.L(47.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                i = tb4.h(this, i);
                                int i25 = i3 + 1;
                                if (this.E && i25 >= this.L) {
                                    break;
                                } else {
                                    i3 = i25;
                                }
                            }
                        } else if (getViewType() == 30) {
                            while (i <= getMeasuredHeight()) {
                                i += c(getMeasuredWidth());
                                rectF.set(0.0f, i, getMeasuredWidth(), i);
                                b(rectF);
                                canvas2.drawRect(rectF, paint6);
                                int i26 = i3 + 1;
                                if (this.E && i26 >= this.L) {
                                    break;
                                } else {
                                    i3 = i26;
                                }
                            }
                        } else if (getViewType() == 8) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(de9.w(11.0f, this.H, r4)), (gl.L(64.0f) >> 1) + i, gl.L(23.0f), paint6);
                                rectF.set(gl.L(68.0f) + this.H, gl.L(17.0f) + i, gl.L(140.0f) + this.H, gl.L(25.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                rectF.set(gl.L(68.0f) + this.H, gl.L(39.0f) + i, gl.L(260.0f) + this.H, gl.L(47.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(20.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(28.0f) + i);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                }
                                i = tb4.h(this, i);
                                int i27 = i3 + 1;
                                if (this.E && i27 >= this.L) {
                                    break;
                                } else {
                                    i3 = i27;
                                }
                            }
                        } else if (getViewType() == 9) {
                            while (i <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(gl.L(35.0f)), (c(getMeasuredWidth()) >> 1) + i, gl.L(32.0f) / 2, paint6);
                                rectF.set(gl.L(72.0f), gl.L(16.0f) + i, gl.L(268.0f), gl.L(24.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                rectF.set(gl.L(72.0f), gl.L(38.0f) + i, gl.L(140.0f), gl.L(46.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(16.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(24.0f) + i);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                }
                                i = tb4.h(this, i);
                                int i28 = i3 + 1;
                                if (this.E && i28 >= this.L) {
                                    break;
                                } else {
                                    i3 = i28;
                                }
                            }
                        } else if (getViewType() == 11) {
                            int i29 = 0;
                            while (i <= getMeasuredHeight()) {
                                rectF.set(gl.L(18.0f), gl.L(14.0f), (getMeasuredWidth() * 0.5f) + gl.L(this.N[0] * 40.0f), gl.L(8.0f) + gl.L(14.0f));
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                rectF.set(getMeasuredWidth() - gl.L(18.0f), gl.L(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - gl.L(this.N[0] * 20.0f), gl.L(8.0f) + gl.L(14.0f));
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                i = tb4.h(this, i);
                                i29++;
                                if (this.E && i29 >= this.L) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 12) {
                            int L3 = gl.L(14.0f) + i;
                            while (L3 <= getMeasuredHeight()) {
                                int measuredWidth3 = getMeasuredWidth() / 4;
                                for (int i30 = 0; i30 < 4; i30++) {
                                    float f9 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i30);
                                    canvas2.drawCircle(f9, (gl.L(56.0f) / 2.0f) + gl.L(7.0f) + L3, gl.L(28.0f), paint6);
                                    float L4 = gl.L(16.0f) + gl.L(56.0f) + gl.L(7.0f) + L3;
                                    RectF rectF2 = gl.P;
                                    rectF2.set(f9 - gl.L(24.0f), L4 - gl.L(4.0f), f9 + gl.L(24.0f), L4 + gl.L(4.0f));
                                    canvas2.drawRoundRect(rectF2, gl.L(4.0f), gl.L(4.0f), paint6);
                                }
                                L3 = tb4.h(this, L3);
                                if (this.E) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 13) {
                            float measuredHeight2 = getMeasuredHeight() / 2.0f;
                            RectF rectF3 = gl.P;
                            rectF3.set(gl.L(40.0f), measuredHeight2 - gl.L(4.0f), getMeasuredWidth() - gl.L(120.0f), gl.L(4.0f) + measuredHeight2);
                            canvas2.drawRoundRect(rectF3, gl.L(4.0f), gl.L(4.0f), paint6);
                            if (this.O == null) {
                                Paint paint9 = new Paint(1);
                                this.O = paint9;
                                paint9.setColor(bkb.u0(bkb.F8));
                            }
                            for (int i31 = 0; i31 < 3; i31++) {
                                canvas2.drawCircle(de9.y(12.0f, i31, gl.L(13.0f) + (getMeasuredWidth() - gl.L(56.0f))), measuredHeight2, gl.L(13.0f), this.O);
                                canvas2.drawCircle(de9.y(12.0f, i31, gl.L(13.0f) + (getMeasuredWidth() - gl.L(56.0f))), measuredHeight2, gl.L(12.0f), paint6);
                            }
                        } else {
                            float f10 = 21.0f;
                            if (getViewType() == 14 || getViewType() == 17) {
                                int L5 = gl.L(12.0f);
                                int L6 = gl.L(77.0f);
                                int L7 = gl.L(4.0f);
                                float L8 = gl.L(21.0f);
                                float L9 = gl.L(41.0f);
                                while (L5 < getMeasuredWidth()) {
                                    Paint paint10 = this.O;
                                    if (paint10 == null) {
                                        paint10 = new Paint(1);
                                        this.O = paint10;
                                    }
                                    paint10.setColor(bkb.v0(bkb.g5, this.M));
                                    RectF rectF4 = gl.P;
                                    int i32 = L5 + L6;
                                    float f11 = f10;
                                    float f12 = f4;
                                    rectF4.set(gl.L(4.0f) + L5, gl.L(4.0f), i32 - gl.L(4.0f), getMeasuredHeight() - gl.L(4.0f));
                                    canvas2.drawRoundRect(rectF4, gl.L(f12), gl.L(f12), paint6);
                                    if (getViewType() == 14) {
                                        float L10 = gl.L(f5) + L7;
                                        float f13 = L5;
                                        float L11 = gl.L(22.0f) + L7 + f13;
                                        rectF.set(L11, L10, L11 + L9, L10 + L8);
                                        canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                                        float L12 = gl.L(4.0f) + L8 + L10;
                                        float L13 = f13 + gl.L(5.0f) + L7;
                                        rectF.set(L13, L12, L13 + L9, L12 + L8);
                                        canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                                    } else if (getViewType() == 17) {
                                        float L14 = gl.L(5.0f);
                                        float L15 = gl.L(32.0f);
                                        f = f5;
                                        float z2 = oo1.z(L6, L15, f7, L5);
                                        rectF4.set(z2, gl.L(f11), L15 + z2, gl.L(32.0f) + r9);
                                        canvas2.drawRoundRect(rectF4, L14, L14, this.O);
                                        canvas2.drawCircle((L6 / 2) + L5, getMeasuredHeight() - gl.L(20.0f), gl.L(f), this.O);
                                        L5 = i32;
                                        f5 = f;
                                        f10 = f11;
                                        f4 = f12;
                                        f7 = 2.0f;
                                    }
                                    f = f5;
                                    canvas2.drawCircle((L6 / 2) + L5, getMeasuredHeight() - gl.L(20.0f), gl.L(f), this.O);
                                    L5 = i32;
                                    f5 = f;
                                    f10 = f11;
                                    f4 = f12;
                                    f7 = 2.0f;
                                }
                            } else if (getViewType() == 15) {
                                int L16 = gl.L(23.0f);
                                int L17 = gl.L(4.0f);
                                while (i <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(de9.w(12.0f, this.H, L16)), de9.w(8.0f, i, L16), L16, paint6);
                                    rectF.set(gl.L(74.0f) + this.H, gl.L(12.0f) + i, gl.L(260.0f) + this.H, gl.L(20.0f) + i);
                                    b(rectF);
                                    float f14 = L17;
                                    canvas2.drawRoundRect(rectF, f14, f14, paint6);
                                    float f15 = f3;
                                    rectF.set(gl.L(74.0f) + this.H, gl.L(36.0f) + i, gl.L(140.0f) + this.H, gl.L(42.0f) + i);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, f14, f14, paint6);
                                    if (this.U > f15) {
                                        rectF.set(gl.L(73.0f) + this.H, gl.L(62.0f) + i, gl.L(73.0f) + this.H + this.U, gl.L(94.0f) + i);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, f14, f14, paint6);
                                    }
                                    i = tb4.h(this, i);
                                    int i33 = i3 + 1;
                                    if (this.E && i33 >= this.L) {
                                        break;
                                    }
                                    i3 = i33;
                                    f3 = f15;
                                }
                            } else if (getViewType() == 16 || getViewType() == 23) {
                                int i34 = 0;
                                while (i <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(de9.w(8.0f, this.H, r5)), gl.L(24.0f) + i, gl.L(18.0f), paint6);
                                    rectF.set(gl.L(58.0f) + this.H, gl.L(20.0f) + i, getWidth() - gl.L(53.0f), gl.L(28.0f) + i);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint6);
                                    if (i34 < 4) {
                                        canvas2.drawCircle(a(ls6.x(12.0f, getWidth(), r5)), gl.L(24.0f) + i, gl.L(12.0f), paint6);
                                    }
                                    i = tb4.h(this, i);
                                    i34++;
                                    if (this.E && i34 >= this.L) {
                                        break;
                                    }
                                }
                                rectF.set(gl.L(8.0f) + this.H, gl.L(20.0f) + i, getWidth() - gl.L(8.0f), gl.L(28.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint6);
                                rectF.set(gl.L(8.0f) + this.H, gl.L(36.0f) + i, getWidth() - gl.L(53.0f), gl.L(44.0f) + i);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint6);
                            } else {
                                int i35 = this.F;
                                if (i35 == 21) {
                                    while (i <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(gl.L(20.0f) + r4), (gl.L(58.0f) >> 1) + i, gl.L(46.0f) >> 1, paint6);
                                        rectF.set(gl.L(74.0f), gl.L(16.0f) + i, gl.L(140.0f), gl.L(24.0f) + i);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        rectF.set(gl.L(74.0f), gl.L(38.0f) + i, gl.L(260.0f), gl.L(46.0f) + i);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        i = tb4.h(this, i);
                                        int i36 = i3 + 1;
                                        if (this.E && i36 >= this.L) {
                                            break;
                                        } else {
                                            i3 = i36;
                                        }
                                    }
                                } else if (i35 == 22) {
                                    while (i <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(gl.L(20.0f) + r4), de9.w(6.0f, i, r4), gl.L(48.0f) >> 1, paint6);
                                        rectF.set(gl.L(76.0f), gl.L(16.0f) + i, gl.L(140.0f), gl.L(24.0f) + i);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        rectF.set(gl.L(76.0f), gl.L(38.0f) + i, gl.L(260.0f), gl.L(46.0f) + i);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        i = tb4.h(this, i);
                                        int i37 = i3 + 1;
                                        if (this.E && i37 >= this.L) {
                                            break;
                                        } else {
                                            i3 = i37;
                                        }
                                    }
                                } else if (i35 == 25) {
                                    while (i <= getMeasuredHeight()) {
                                        canvas2.drawCircle(gl.L(17.0f) + r4, de9.w(6.0f, i, r4), gl.L(38.0f) >> 1, paint6);
                                        rectF.set(gl.L(76.0f), gl.L(21.0f) + i, gl.L(220.0f), gl.L(29.0f) + i);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        i = tb4.h(this, i);
                                        int i38 = i3 + 1;
                                        if (this.E && i38 >= this.L) {
                                            break;
                                        } else {
                                            i3 = i38;
                                        }
                                    }
                                } else if (i35 == 26) {
                                    while (i <= getMeasuredHeight()) {
                                        canvas2.drawCircle(k96.a0 ? ls6.x(21.0f, getMeasuredWidth(), r4) : gl.L(21.0f) + r4, de9.w(f8, i, r4), gl.L(21.0f) >> 1, paint6);
                                        rectF.set(gl.L(60.0f), gl.L(21.0f) + i, gl.L(190.0f), gl.L(29.0f) + i);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        f8 = 16.0f;
                                        rectF.set(getMeasuredWidth() - gl.L(16.0f), gl.L(21.0f) + i, getMeasuredWidth() - gl.L(62.0f), gl.L(29.0f) + i);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        i = tb4.h(this, i);
                                        int i39 = i3 + 1;
                                        if (this.E && i39 >= this.L) {
                                            break;
                                        } else {
                                            i3 = i39;
                                        }
                                    }
                                } else if (getViewType() == 28) {
                                    while (i <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(de9.w(f6, this.H, r4)), (gl.L(58.0f) >> 1) + i, gl.L(24.0f), paint6);
                                        rectF.set(gl.L(68.0f) + this.H, gl.L(17.0f) + i, gl.L(260.0f) + this.H, gl.L(25.0f) + i);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        rectF.set(gl.L(68.0f) + this.H, gl.L(39.0f) + i, gl.L(140.0f) + this.H, gl.L(47.0f) + i);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        if (this.x) {
                                            rectF.set(getMeasuredWidth() - gl.L(50.0f), gl.L(20.0f) + i, getMeasuredWidth() - gl.L(12.0f), gl.L(28.0f) + i);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        }
                                        i = tb4.h(this, i);
                                        int i40 = i3 + 1;
                                        if (this.E && i40 >= this.L) {
                                            break;
                                        }
                                        i3 = i40;
                                        f6 = 10.0f;
                                    }
                                } else if (getViewType() == 31) {
                                    while (i <= getMeasuredHeight()) {
                                        int c3 = c(getMeasuredWidth());
                                        float f16 = i;
                                        rectF.set(gl.L(18.0f) + this.H, ((c3 - gl.L(22.0f)) / 2.0f) + f16, gl.L(40.0f) + this.H, ((gl.L(22.0f) + c3) / 2.0f) + f16);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(11.0f), gl.L(11.0f), paint6);
                                        rectF.set(gl.L(58.0f) + this.H, ((c3 - gl.L(8.0f)) / 2.0f) + f16, b00.x(19.0f, getMeasuredWidth(), gl.L(132.0f) + this.H), ((gl.L(8.0f) + c3) / 2.0f) + f16);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        i += c3;
                                        int i41 = i3 + 1;
                                        if (this.E && i41 >= this.L) {
                                            break;
                                        } else {
                                            i3 = i41;
                                        }
                                    }
                                } else if (getViewType() == 32) {
                                    while (i <= getMeasuredHeight()) {
                                        int c4 = c(getMeasuredWidth());
                                        float f17 = i;
                                        rectF.set(gl.L(10.0f) + this.H, ((c4 - gl.L(32.0f)) / 2.0f) + f17, gl.L(42.0f) + this.H, ((gl.L(32.0f) + c4) / 2.0f) + f17);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint6);
                                        rectF.set(gl.L(64.0f) + this.H, (((c4 - gl.L(14.0f)) - gl.L(10.0f)) / 2.0f) + f17, b00.x(19.0f, getMeasuredWidth(), gl.L(118.0f) + this.H), ((gl.L(10.0f) + (c4 - gl.L(14.0f))) / 2.0f) + f17);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        rectF.set(gl.L(64.0f) + this.H, (((gl.L(14.0f) + c4) - gl.L(8.0f)) / 2.0f) + f17, b00.x(19.0f, getMeasuredWidth(), gl.L(144.0f) + this.H), ((gl.L(8.0f) + (gl.L(14.0f) + c4)) / 2.0f) + f17);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint6);
                                        i += c4;
                                        int i42 = i3 + 1;
                                        if (this.E && i42 >= this.L) {
                                            break;
                                        } else {
                                            i3 = i42;
                                        }
                                    }
                                } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                                    rectF.set(this.H, this.G, getMeasuredWidth() - this.H, getMeasuredHeight() - this.G);
                                    rectF.inset(gl.L(3.33f), gl.L(4.0f));
                                    canvas2.drawRoundRect(rectF, gl.L(11.0f), gl.L(11.0f), paint6);
                                }
                            }
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

    public void setGlobalGradientView(pi4 pi4Var) {
        this.S = pi4Var;
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
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(14.0f));
        this.U = textPaint.measureText(k96.M0(z ? 2131754375 : 2131754370, null)) + gl.L(34.0f);
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

    @Override // tjb
    public final void updateColors() {
        LinearGradient linearGradient;
        int i;
        pi4 pi4Var = this.S;
        if (pi4Var != null) {
            pi4Var.updateColors();
            return;
        }
        int i2 = this.I;
        wjb wjbVar = this.M;
        int v0 = bkb.v0(i2, wjbVar);
        int v02 = bkb.v0(this.J, wjbVar);
        if (this.s == v02 && this.r == v0) {
            return;
        }
        this.r = v0;
        this.s = v02;
        int i3 = this.F;
        if (i3 == 34 || i3 == 35 || i3 == 36) {
            this.a = gl.q.x;
        } else if (this.E || i3 == 13 || i3 == 14 || i3 == 17) {
            this.a = gl.L(200.0f);
        } else {
            this.a = gl.L(600.0f);
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

    public pi4(Context context) {
        this(context, null);
    }
}
