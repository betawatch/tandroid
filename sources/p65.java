// default package

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p65 extends i95 {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ g95 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p65(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = g95Var;
        this.d = new OvershootInterpolator(1.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x06c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        Paint paint;
        Matrix matrix;
        RadialProgressView radialProgressView;
        f95 f95Var;
        Canvas canvas2;
        Paint paint2;
        int i;
        int i2;
        float f4;
        RadialProgressView radialProgressView2;
        fl0 fl0Var;
        fl0 fl0Var2;
        RectF rectF;
        float f5;
        int L;
        float f6;
        float f7;
        RadialProgressView radialProgressView3;
        fl0 fl0Var3;
        fl0 fl0Var4;
        float measuredWidth;
        float y;
        fl0 fl0Var5;
        f95 f95Var2;
        Paint paint3;
        float f8;
        byte b;
        byte b2;
        boolean z2;
        boolean z3;
        f95 f95Var3;
        int i3;
        int i4;
        int i5;
        int i6;
        float f9;
        g95 g95Var = this.f;
        Paint paint4 = g95Var.C3;
        dkc dkcVar = g95Var.s1;
        dkc dkcVar2 = g95Var.u1;
        Matrix matrix2 = g95Var.M2;
        RadialProgressView radialProgressView4 = g95Var.X1;
        fl0 fl0Var6 = g95Var.H2;
        fl0 fl0Var7 = g95Var.G2;
        RectF rectF2 = g95Var.p2;
        Paint paint5 = g95Var.N2;
        t75 t75Var = g95Var.M1;
        int[] iArr = g95Var.Q3;
        dkc dkcVar3 = g95Var.v1;
        Paint paint6 = g95Var.B3;
        if (g95Var.d4 && g95Var.Z3) {
            return;
        }
        int measuredWidth2 = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - g95Var.H3;
        g95Var.H3 = elapsedRealtime;
        if (j > 20) {
            j = 17;
        }
        long j2 = j;
        f95 f95Var4 = g95Var.G3;
        if (f95Var4 != null) {
            f95Var4.b(0, measuredWidth2, getMeasuredHeight(), j2, g95Var.I2);
        }
        fl0Var7.a = gm.L(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        fl0Var7.b = mlb.A(gm.L(20.0f), 0.6f, gm.L(62.0f), 0.48076922f);
        fl0Var6.a = gm.L(65.0f) * 0.46296296f;
        fl0Var6.b = mlb.A(gm.L(20.0f), 0.6f, gm.L(65.0f), 0.48076922f);
        float f10 = g95Var.J2;
        float f11 = g95Var.I2;
        if (f10 != f11) {
            float f12 = g95Var.K2;
            f = 0.0f;
            float f13 = (j2 * f12) + f11;
            g95Var.I2 = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    g95Var.I2 = f10;
                }
            } else if (f13 < f10) {
                g95Var.I2 = f10;
            }
        } else {
            f = 0.0f;
        }
        f95 f95Var5 = g95Var.F3;
        if (f95Var5 != null) {
            if (f95Var5.i == 3) {
                radialProgressView4.I = true;
                if (Math.abs(radialProgressView4.n) < 360.0f) {
                    f3 = 1.0f;
                    z = false;
                    if (z) {
                        float f14 = g95Var.E3;
                        if (f14 != f3) {
                            f95 f95Var6 = g95Var.F3;
                            if (f95Var6 == null || f95Var6.i != 3) {
                                f9 = (j2 / 180.0f) + f14;
                                g95Var.E3 = f9;
                            } else {
                                f9 = (j2 / 100.0f) + f14;
                                g95Var.E3 = f9;
                            }
                            if (f9 >= 1.0f) {
                                g95Var.E3 = 1.0f;
                                g95Var.F3 = null;
                                f95 f95Var7 = g95Var.G3;
                                if (f95Var7 != null && f95Var7.i == 3) {
                                    radialProgressView4.I = false;
                                }
                            }
                            g95Var.P3 = true;
                        }
                        if (!g95Var.P3 || (f95Var3 = g95Var.G3) == null) {
                            paint = paint4;
                            matrix = matrix2;
                            radialProgressView = radialProgressView4;
                            b = 3;
                        } else {
                            g95Var.P3 = false;
                            f95 f95Var8 = g95Var.F3;
                            if (f95Var8 != null) {
                                g95Var.U0(iArr, f95Var8.i);
                                int i7 = iArr[0];
                                b = 3;
                                int i8 = iArr[1];
                                int i9 = iArr[2];
                                radialProgressView = radialProgressView4;
                                int i10 = iArr[3];
                                matrix = matrix2;
                                g95Var.U0(iArr, g95Var.G3.i);
                                paint = paint4;
                                i3 = on2.f(g95Var.E3, i7, iArr[0]);
                                i4 = on2.f(g95Var.E3, i8, iArr[1]);
                                i5 = on2.f(g95Var.E3, i9, iArr[2]);
                                i6 = on2.f(g95Var.E3, i10, iArr[3]);
                            } else {
                                paint = paint4;
                                matrix = matrix2;
                                radialProgressView = radialProgressView4;
                                b = 3;
                                g95Var.U0(iArr, f95Var3.i);
                                i3 = iArr[0];
                                i4 = iArr[1];
                                i5 = iArr[2];
                                i6 = iArr[3];
                            }
                            if (this.e != i3) {
                                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gm.L(45.454548f), new int[]{on2.p(i3, 60), on2.p(i3, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                                g95Var.L2 = radialGradient;
                                paint5.setShader(radialGradient);
                                this.e = i3;
                            }
                            dkcVar2.a(i5, i4);
                            dkcVar.a(i5, i4);
                            g95Var.r1.a(i5, i4);
                            g95Var.p1.a(i5, i4);
                            dkc dkcVar4 = g95Var.t1;
                            int i11 = cmb.th;
                            dkcVar4.a(cmb.w0(null, i11, false), cmb.w0(null, i11, false));
                            g95Var.q1.a(i4, i6);
                        }
                        f95 f95Var9 = g95Var.G3;
                        if (f95Var9 != null) {
                            byte b3 = f95Var9.i;
                            boolean z4 = b3 == 1 || b3 == 0 || g95.h1(b3);
                            f95 f95Var10 = g95Var.G3;
                            b2 = b;
                            z3 = f95Var10.i != b2;
                            z2 = z4;
                            f95Var9 = f95Var10;
                        } else {
                            b2 = b;
                            z2 = false;
                            z3 = false;
                        }
                        if (g95Var.F3 == null || f95Var9 == null || f95Var9.i != b2) {
                            float f15 = g95Var.I3;
                            if (z2) {
                                if (f15 != 1.0f) {
                                    float f16 = (j2 / 350.0f) + f15;
                                    g95Var.I3 = f16;
                                    if (f16 > 1.0f) {
                                        g95Var.I3 = 1.0f;
                                    }
                                }
                            } else if (f15 != 0.0f) {
                                float f17 = f15 - (j2 / 350.0f);
                                g95Var.I3 = f17;
                                if (f17 < 0.0f) {
                                    g95Var.I3 = 0.0f;
                                }
                            }
                        } else {
                            float f18 = g95Var.I3 - (j2 / 180.0f);
                            g95Var.I3 = f18;
                            if (f18 < f) {
                                g95Var.I3 = f;
                            }
                        }
                        float f19 = g95Var.J3;
                        if (z3) {
                            if (f19 != 1.0f) {
                                float f20 = (j2 / 350.0f) + f19;
                                g95Var.J3 = f20;
                                if (f20 > 1.0f) {
                                    g95Var.J3 = 1.0f;
                                }
                            }
                        } else if (f19 != 0.0f) {
                            float f21 = f19 - (j2 / 350.0f);
                            g95Var.J3 = f21;
                            if (f21 < 0.0f) {
                                g95Var.J3 = 0.0f;
                            }
                        }
                    } else {
                        paint = paint4;
                        matrix = matrix2;
                        radialProgressView = radialProgressView4;
                    }
                    float interpolation = (this.d.getInterpolation(g95Var.I3) * 0.6f) + 0.4f;
                    fl0Var6.e(g95Var.I2, 1.0f);
                    fl0Var7.e(g95Var.I2, 1.0f);
                    f95Var = g95Var.F3;
                    if (f95Var == null && (f95Var2 = g95Var.G3) != null) {
                        if (f95Var2.i == 3) {
                            paint3 = paint6;
                            float f22 = g95Var.E3;
                            paint3.setShader(f95Var.g);
                            f8 = f22;
                        } else if (f95Var.i == 3) {
                            f8 = 1.0f - g95Var.E3;
                            Shader shader = f95Var2.g;
                            paint3 = paint6;
                            paint3.setShader(shader);
                        } else {
                            paint2 = paint6;
                            canvas2 = canvas;
                        }
                        Paint paint7 = paint;
                        paint7.setColor(gm.R0(g95Var.N3, 1.0f, cmb.w0(null, cmb.ah, false), cmb.w0(null, cmb.Ah, false)));
                        float measuredWidth3 = (int) ((dkcVar3.getMeasuredWidth() / 2.0f) + dkcVar3.getX());
                        float y2 = (int) (dkcVar3.getY() + gm.L(25.0f));
                        Matrix matrix3 = matrix;
                        matrix3.setTranslate(measuredWidth3, y2);
                        g95Var.L2.setLocalMatrix(matrix3);
                        paint3.setAlpha(76);
                        canvas.save();
                        canvas.scale(dkcVar3.getScaleX() * 1.0f, dkcVar3.getScaleY() * 1.0f, measuredWidth3, y2);
                        canvas.save();
                        float w = b10.w(0.807f, g95Var.I2, 0.5f, 0.878f) * g95Var.J3;
                        canvas.scale(w, w, measuredWidth3, y2);
                        canvas.save();
                        canvas.scale(1.2f, 1.2f, measuredWidth3, y2);
                        canvas.drawCircle(measuredWidth3, y2, gm.L(160.0f), paint5);
                        canvas.restore();
                        canvas.restore();
                        if (g95Var.T2 != null) {
                            canvas.save();
                            float A = mlb.A(0.807f, g95Var.I2, 0.878f, interpolation);
                            canvas.scale(A, A, measuredWidth3, y2);
                            fl0Var6.a(measuredWidth3, y2, canvas, paint3);
                            canvas.restore();
                            canvas.save();
                            float A2 = mlb.A(0.704f, g95Var.I2, 0.926f, interpolation);
                            canvas.scale(A2, A2, measuredWidth3, y2);
                            fl0Var7.a(measuredWidth3, y2, canvas, paint3);
                            canvas.restore();
                        }
                        paint3.setAlpha(nm7.d4);
                        if (z) {
                            canvas.drawCircle(measuredWidth3, y2, gm.L(25.909092f), paint3);
                            paint3.setColor(cmb.w0(null, cmb.Eh, false));
                            if (f8 != 0.0f) {
                                paint3.setAlpha((int) (f8 * 255.0f));
                                paint3.setShader(null);
                                canvas.drawCircle(measuredWidth3, y2, gm.L(25.909092f), paint3);
                            }
                        }
                        canvas.drawCircle(measuredWidth3, y2, gm.L(25.0f) * f8, paint7);
                        if (!z) {
                            radialProgressView.a(canvas, measuredWidth3, y2);
                        }
                        canvas.restore();
                        super.dispatchDraw(canvas);
                        if (g95Var.T3.r == null) {
                            return;
                        }
                        invalidate();
                        return;
                    }
                    canvas2 = canvas;
                    paint2 = paint6;
                    RadialProgressView radialProgressView5 = radialProgressView;
                    Matrix matrix4 = matrix;
                    i2 = 0;
                    for (i = 2; i2 < i; i = 2) {
                        float L2 = gm.L(25.909092f);
                        if (i2 == 0 && g95Var.F3 != null) {
                            if (!g95Var.i1()) {
                                paint2.setShader(g95Var.F3.g);
                            }
                            f5 = 1.0f - g95Var.E3;
                            if (g95Var.F3.i == 3) {
                                L = gm.L(2.0f);
                                L2 -= L * f5;
                            }
                            if (paint2.getShader() == null) {
                            }
                            f6 = L2;
                            f7 = f5;
                            if (g95Var.i1()) {
                            }
                            measuredWidth = (int) ((dkcVar3.getMeasuredWidth() / 2.0f) + dkcVar3.getX());
                            y = (int) (dkcVar3.getY() + gm.L(25.0f));
                            matrix4.setTranslate(measuredWidth, y);
                            g95Var.L2.setLocalMatrix(matrix4);
                            paint2.setAlpha((int) (f7 * 76.0f * g95Var.O2));
                            canvas2.save();
                            canvas2.scale(dkcVar3.getScaleX() * 1.0f, dkcVar3.getScaleX() * 1.0f, measuredWidth, y);
                            canvas2.save();
                            float w2 = b10.w(0.807f, g95Var.I2, 0.5f, 0.878f) * g95Var.J3;
                            canvas2.scale(w2, w2, measuredWidth, y);
                            if (i2 == 1) {
                                canvas2.save();
                                canvas2.scale(1.2f, 1.2f, measuredWidth, y);
                                int alpha = paint5.getAlpha();
                                paint5.setAlpha((int) ((1.0f - g95Var.o5.e) * alpha * g95Var.O2));
                                canvas2.drawCircle(measuredWidth, y, gm.L(160.0f), paint5);
                                paint5.setAlpha(alpha);
                                canvas2.restore();
                            }
                            canvas2.restore();
                            if (g95Var.i1()) {
                            }
                            fl0Var2 = fl0Var4;
                            fl0Var5 = fl0Var3;
                            if (g95.u5) {
                            }
                            float measuredWidth4 = (getMeasuredWidth() / 2.0f) - gm.L(21.0f);
                            float L3 = gm.L(24.0f);
                            float f23 = (f6 - measuredWidth4) + measuredWidth4;
                            float f24 = g95Var.O2;
                            float f25 = f23 * f24;
                            float f26 = ((f6 - L3) + L3) * f24;
                            float f27 = measuredWidth + f25;
                            f4 = interpolation;
                            fl0Var = fl0Var5;
                            rectF = rectF3;
                            rectF.set(measuredWidth - f25, y - f26, f27, y + f26);
                            float L4 = (f6 - gm.L(4.0f)) + gm.L(4.0f);
                            paint2.setAlpha((int) (paint2.getAlpha() * g95Var.O2));
                            canvas2.drawRoundRect(rectF, L4, L4, paint2);
                            if (i2 == 1) {
                            }
                            radialProgressView2 = radialProgressView3;
                            canvas2.restore();
                            if (t75Var != null) {
                                paint2.setAlpha((int) (t75Var.getAlpha() * 255.0f));
                                float x = t75Var.getX() - getX();
                                float y3 = t75Var.getY() - getY();
                                rectF.set(x, y3, t75Var.getMeasuredWidth() + x, t75Var.getMeasuredHeight() + y3);
                                canvas2.save();
                                canvas2.scale(t75Var.getScaleX(), t75Var.getScaleY(), rectF.centerX(), rectF.centerY());
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint2);
                                canvas2.restore();
                            }
                        } else if (i2 != 1 || g95Var.G3 == null) {
                            f4 = interpolation;
                            radialProgressView2 = radialProgressView5;
                            fl0Var = fl0Var6;
                            fl0Var2 = fl0Var7;
                            rectF = rectF3;
                        } else {
                            if (!g95Var.i1()) {
                                paint2.setShader(g95Var.G3.g);
                            }
                            f5 = g95Var.E3;
                            if (g95Var.G3.i == 3) {
                                L = gm.L(2.0f);
                                L2 -= L * f5;
                            }
                            if (paint2.getShader() == null || g95Var.i1()) {
                                f6 = L2;
                                f7 = f5;
                            } else {
                                f6 = L2;
                                f7 = f5;
                                paint2.setColor(gm.R0(g95Var.N3, 1.0f, cmb.w0(null, cmb.ah, false), cmb.w0(null, cmb.Ah, false)));
                            }
                            if (g95Var.i1()) {
                                radialProgressView3 = radialProgressView5;
                                fl0Var3 = fl0Var6;
                                fl0Var4 = fl0Var7;
                            } else {
                                int w0 = cmb.w0(null, cmb.Bh, false);
                                int i12 = cmb.Ah;
                                radialProgressView3 = radialProgressView5;
                                int R0 = gm.R0(g95Var.N3, 1.0f, w0, cmb.w0(null, i12, false));
                                paint2.setColor(R0);
                                paint2.setShader(null);
                                int i13 = cmb.ah;
                                fl0Var4 = fl0Var7;
                                fl0Var3 = fl0Var6;
                                dkcVar.a(gm.R0(g95Var.N3, 1.0f, cmb.w0(null, i13, false), cmb.w0(null, i12, false)), R0);
                                dkcVar2.a(gm.R0(g95Var.N3, 1.0f, cmb.w0(null, i13, false), cmb.w0(null, i12, false)), R0);
                            }
                            measuredWidth = (int) ((dkcVar3.getMeasuredWidth() / 2.0f) + dkcVar3.getX());
                            y = (int) (dkcVar3.getY() + gm.L(25.0f));
                            matrix4.setTranslate(measuredWidth, y);
                            g95Var.L2.setLocalMatrix(matrix4);
                            paint2.setAlpha((int) (f7 * 76.0f * g95Var.O2));
                            canvas2.save();
                            canvas2.scale(dkcVar3.getScaleX() * 1.0f, dkcVar3.getScaleX() * 1.0f, measuredWidth, y);
                            canvas2.save();
                            float w22 = b10.w(0.807f, g95Var.I2, 0.5f, 0.878f) * g95Var.J3;
                            canvas2.scale(w22, w22, measuredWidth, y);
                            if (i2 == 1 && !g95Var.i1() && e86.e(512)) {
                                canvas2.save();
                                canvas2.scale(1.2f, 1.2f, measuredWidth, y);
                                int alpha2 = paint5.getAlpha();
                                paint5.setAlpha((int) ((1.0f - g95Var.o5.e) * alpha2 * g95Var.O2));
                                canvas2.drawCircle(measuredWidth, y, gm.L(160.0f), paint5);
                                paint5.setAlpha(alpha2);
                                canvas2.restore();
                            }
                            canvas2.restore();
                            if (!g95Var.i1() || g95Var.O2 <= 0.0f) {
                                fl0Var2 = fl0Var4;
                                fl0Var5 = fl0Var3;
                            } else {
                                canvas2.save();
                                float w3 = b10.w(0.807f, g95Var.I2, interpolation, 0.878f);
                                canvas2.scale(w3, w3, measuredWidth, y);
                                fl0Var5 = fl0Var3;
                                fl0Var5.a(measuredWidth, y, canvas2, paint2);
                                canvas2.restore();
                                canvas2.save();
                                float w4 = b10.w(0.704f, g95Var.I2, interpolation, 0.926f);
                                canvas2.scale(w4, w4, measuredWidth, y);
                                fl0Var2 = fl0Var4;
                                fl0Var2.a(measuredWidth, y, canvas2, paint2);
                                canvas2.restore();
                            }
                            if (g95.u5) {
                                if (i2 == 0) {
                                    paint2.setAlpha(nm7.d4);
                                } else {
                                    paint2.setAlpha((int) (f7 * 255.0f));
                                }
                            } else if (i2 == 0) {
                                paint2.setAlpha((int) (g95Var.P2 * 255.0f));
                            } else {
                                paint2.setAlpha((int) (f7 * 255.0f * g95Var.P2));
                            }
                            float measuredWidth42 = (getMeasuredWidth() / 2.0f) - gm.L(21.0f);
                            float L32 = gm.L(24.0f);
                            float f232 = (f6 - measuredWidth42) + measuredWidth42;
                            float f242 = g95Var.O2;
                            float f252 = f232 * f242;
                            float f262 = ((f6 - L32) + L32) * f242;
                            float f272 = measuredWidth + f252;
                            f4 = interpolation;
                            fl0Var = fl0Var5;
                            rectF = rectF3;
                            rectF.set(measuredWidth - f252, y - f262, f272, y + f262);
                            float L42 = (f6 - gm.L(4.0f)) + gm.L(4.0f);
                            paint2.setAlpha((int) (paint2.getAlpha() * g95Var.O2));
                            canvas2.drawRoundRect(rectF, L42, L42, paint2);
                            if (i2 == 1 || g95Var.G3.i != 3) {
                                radialProgressView2 = radialProgressView3;
                            } else {
                                radialProgressView2 = radialProgressView3;
                                radialProgressView2.a(canvas2, measuredWidth, y);
                            }
                            canvas2.restore();
                            if (t75Var != null && t75Var.getVisibility() == 0) {
                                paint2.setAlpha((int) (t75Var.getAlpha() * 255.0f));
                                float x2 = t75Var.getX() - getX();
                                float y32 = t75Var.getY() - getY();
                                rectF.set(x2, y32, t75Var.getMeasuredWidth() + x2, t75Var.getMeasuredHeight() + y32);
                                canvas2.save();
                                canvas2.scale(t75Var.getScaleX(), t75Var.getScaleY(), rectF.centerX(), rectF.centerY());
                                canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint2);
                                canvas2.restore();
                            }
                        }
                        i2++;
                        rectF3 = rectF;
                        fl0Var7 = fl0Var2;
                        radialProgressView5 = radialProgressView2;
                        interpolation = f4;
                        fl0Var6 = fl0Var;
                    }
                    super.dispatchDraw(canvas);
                    if (g95Var.T3.r == null) {
                    }
                }
            } else {
                f95 f95Var11 = g95Var.G3;
                if (f95Var11 != null && f95Var11.i == 3) {
                    radialProgressView4.I = true;
                    f2 = 1.0f;
                    radialProgressView4.J = 1.0f;
                    f3 = f2;
                    z = true;
                    if (z) {
                    }
                    float interpolation2 = (this.d.getInterpolation(g95Var.I3) * 0.6f) + 0.4f;
                    fl0Var6.e(g95Var.I2, 1.0f);
                    fl0Var7.e(g95Var.I2, 1.0f);
                    f95Var = g95Var.F3;
                    if (f95Var == null) {
                    }
                    canvas2 = canvas;
                    paint2 = paint6;
                    RadialProgressView radialProgressView52 = radialProgressView;
                    Matrix matrix42 = matrix;
                    i2 = 0;
                    while (i2 < i) {
                    }
                    super.dispatchDraw(canvas);
                    if (g95Var.T3.r == null) {
                    }
                }
            }
        }
        f2 = 1.0f;
        f3 = f2;
        z = true;
        if (z) {
        }
        float interpolation22 = (this.d.getInterpolation(g95Var.I3) * 0.6f) + 0.4f;
        fl0Var6.e(g95Var.I2, 1.0f);
        fl0Var7.e(g95Var.I2, 1.0f);
        f95Var = g95Var.F3;
        if (f95Var == null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        RadialProgressView radialProgressView522 = radialProgressView;
        Matrix matrix422 = matrix;
        i2 = 0;
        while (i2 < i) {
        }
        super.dispatchDraw(canvas);
        if (g95Var.T3.r == null) {
        }
    }
}
