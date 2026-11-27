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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t65 extends l95 {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ j95 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t65(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = j95Var;
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
        i95 i95Var;
        Canvas canvas2;
        Paint paint2;
        int i;
        int i2;
        float f4;
        RadialProgressView radialProgressView2;
        gk0 gk0Var;
        gk0 gk0Var2;
        RectF rectF;
        float f5;
        int L;
        float f6;
        float f7;
        RadialProgressView radialProgressView3;
        gk0 gk0Var3;
        gk0 gk0Var4;
        float measuredWidth;
        float y;
        gk0 gk0Var5;
        i95 i95Var2;
        Paint paint3;
        float f8;
        byte b;
        byte b2;
        boolean z2;
        boolean z3;
        i95 i95Var3;
        int i3;
        int i4;
        int i5;
        int i6;
        float f9;
        j95 j95Var = this.f;
        Paint paint4 = j95Var.C3;
        kmc kmcVar = j95Var.s1;
        kmc kmcVar2 = j95Var.u1;
        Matrix matrix2 = j95Var.M2;
        RadialProgressView radialProgressView4 = j95Var.X1;
        gk0 gk0Var6 = j95Var.H2;
        gk0 gk0Var7 = j95Var.G2;
        RectF rectF2 = j95Var.p2;
        Paint paint5 = j95Var.N2;
        x75 x75Var = j95Var.M1;
        int[] iArr = j95Var.Q3;
        kmc kmcVar3 = j95Var.v1;
        Paint paint6 = j95Var.B3;
        if (j95Var.d4 && j95Var.Z3) {
            return;
        }
        int measuredWidth2 = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - j95Var.H3;
        j95Var.H3 = elapsedRealtime;
        if (j > 20) {
            j = 17;
        }
        long j2 = j;
        i95 i95Var4 = j95Var.G3;
        if (i95Var4 != null) {
            i95Var4.b(0, measuredWidth2, getMeasuredHeight(), j2, j95Var.I2);
        }
        gk0Var7.a = hl.L(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        gk0Var7.b = xnb.z(hl.L(20.0f), 0.6f, hl.L(62.0f), 0.48076922f);
        gk0Var6.a = hl.L(65.0f) * 0.46296296f;
        gk0Var6.b = xnb.z(hl.L(20.0f), 0.6f, hl.L(65.0f), 0.48076922f);
        float f10 = j95Var.J2;
        float f11 = j95Var.I2;
        if (f10 != f11) {
            float f12 = j95Var.K2;
            f = 0.0f;
            float f13 = (j2 * f12) + f11;
            j95Var.I2 = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    j95Var.I2 = f10;
                }
            } else if (f13 < f10) {
                j95Var.I2 = f10;
            }
        } else {
            f = 0.0f;
        }
        i95 i95Var5 = j95Var.F3;
        if (i95Var5 != null) {
            if (i95Var5.i == 3) {
                radialProgressView4.I = true;
                if (Math.abs(radialProgressView4.n) < 360.0f) {
                    f3 = 1.0f;
                    z = false;
                    if (z) {
                        float f14 = j95Var.E3;
                        if (f14 != f3) {
                            i95 i95Var6 = j95Var.F3;
                            if (i95Var6 == null || i95Var6.i != 3) {
                                f9 = (j2 / 180.0f) + f14;
                                j95Var.E3 = f9;
                            } else {
                                f9 = (j2 / 100.0f) + f14;
                                j95Var.E3 = f9;
                            }
                            if (f9 >= 1.0f) {
                                j95Var.E3 = 1.0f;
                                j95Var.F3 = null;
                                i95 i95Var7 = j95Var.G3;
                                if (i95Var7 != null && i95Var7.i == 3) {
                                    radialProgressView4.I = false;
                                }
                            }
                            j95Var.P3 = true;
                        }
                        if (!j95Var.P3 || (i95Var3 = j95Var.G3) == null) {
                            paint = paint4;
                            matrix = matrix2;
                            radialProgressView = radialProgressView4;
                            b = 3;
                        } else {
                            j95Var.P3 = false;
                            i95 i95Var8 = j95Var.F3;
                            if (i95Var8 != null) {
                                j95Var.V0(iArr, i95Var8.i);
                                int i7 = iArr[0];
                                b = 3;
                                int i8 = iArr[1];
                                int i9 = iArr[2];
                                radialProgressView = radialProgressView4;
                                int i10 = iArr[3];
                                matrix = matrix2;
                                j95Var.V0(iArr, j95Var.G3.i);
                                paint = paint4;
                                i3 = vm2.f(j95Var.E3, i7, iArr[0]);
                                i4 = vm2.f(j95Var.E3, i8, iArr[1]);
                                i5 = vm2.f(j95Var.E3, i9, iArr[2]);
                                i6 = vm2.f(j95Var.E3, i10, iArr[3]);
                            } else {
                                paint = paint4;
                                matrix = matrix2;
                                radialProgressView = radialProgressView4;
                                b = 3;
                                j95Var.V0(iArr, i95Var3.i);
                                i3 = iArr[0];
                                i4 = iArr[1];
                                i5 = iArr[2];
                                i6 = iArr[3];
                            }
                            if (this.e != i3) {
                                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, hl.L(45.454548f), new int[]{vm2.o(i3, 60), vm2.o(i3, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                                j95Var.L2 = radialGradient;
                                paint5.setShader(radialGradient);
                                this.e = i3;
                            }
                            kmcVar2.a(i5, i4);
                            kmcVar.a(i5, i4);
                            j95Var.r1.a(i5, i4);
                            j95Var.p1.a(i5, i4);
                            kmc kmcVar4 = j95Var.t1;
                            int i11 = aob.uh;
                            kmcVar4.a(aob.w0(null, i11, false), aob.w0(null, i11, false));
                            j95Var.q1.a(i4, i6);
                        }
                        i95 i95Var9 = j95Var.G3;
                        if (i95Var9 != null) {
                            byte b3 = i95Var9.i;
                            boolean z4 = b3 == 1 || b3 == 0 || j95.i1(b3);
                            i95 i95Var10 = j95Var.G3;
                            b2 = b;
                            z3 = i95Var10.i != b2;
                            z2 = z4;
                            i95Var9 = i95Var10;
                        } else {
                            b2 = b;
                            z2 = false;
                            z3 = false;
                        }
                        if (j95Var.F3 == null || i95Var9 == null || i95Var9.i != b2) {
                            float f15 = j95Var.I3;
                            if (z2) {
                                if (f15 != 1.0f) {
                                    float f16 = (j2 / 350.0f) + f15;
                                    j95Var.I3 = f16;
                                    if (f16 > 1.0f) {
                                        j95Var.I3 = 1.0f;
                                    }
                                }
                            } else if (f15 != 0.0f) {
                                float f17 = f15 - (j2 / 350.0f);
                                j95Var.I3 = f17;
                                if (f17 < 0.0f) {
                                    j95Var.I3 = 0.0f;
                                }
                            }
                        } else {
                            float f18 = j95Var.I3 - (j2 / 180.0f);
                            j95Var.I3 = f18;
                            if (f18 < f) {
                                j95Var.I3 = f;
                            }
                        }
                        float f19 = j95Var.J3;
                        if (z3) {
                            if (f19 != 1.0f) {
                                float f20 = (j2 / 350.0f) + f19;
                                j95Var.J3 = f20;
                                if (f20 > 1.0f) {
                                    j95Var.J3 = 1.0f;
                                }
                            }
                        } else if (f19 != 0.0f) {
                            float f21 = f19 - (j2 / 350.0f);
                            j95Var.J3 = f21;
                            if (f21 < 0.0f) {
                                j95Var.J3 = 0.0f;
                            }
                        }
                    } else {
                        paint = paint4;
                        matrix = matrix2;
                        radialProgressView = radialProgressView4;
                    }
                    float interpolation = (this.d.getInterpolation(j95Var.I3) * 0.6f) + 0.4f;
                    gk0Var6.e(j95Var.I2, 1.0f);
                    gk0Var7.e(j95Var.I2, 1.0f);
                    i95Var = j95Var.F3;
                    if (i95Var == null && (i95Var2 = j95Var.G3) != null) {
                        if (i95Var2.i == 3) {
                            paint3 = paint6;
                            float f22 = j95Var.E3;
                            paint3.setShader(i95Var.g);
                            f8 = f22;
                        } else if (i95Var.i == 3) {
                            f8 = 1.0f - j95Var.E3;
                            Shader shader = i95Var2.g;
                            paint3 = paint6;
                            paint3.setShader(shader);
                        } else {
                            paint2 = paint6;
                            canvas2 = canvas;
                        }
                        Paint paint7 = paint;
                        paint7.setColor(hl.R0(j95Var.N3, 1.0f, aob.w0(null, aob.bh, false), aob.w0(null, aob.Bh, false)));
                        float measuredWidth3 = (int) ((kmcVar3.getMeasuredWidth() / 2.0f) + kmcVar3.getX());
                        float y2 = (int) (kmcVar3.getY() + hl.L(25.0f));
                        Matrix matrix3 = matrix;
                        matrix3.setTranslate(measuredWidth3, y2);
                        j95Var.L2.setLocalMatrix(matrix3);
                        paint3.setAlpha(76);
                        canvas.save();
                        canvas.scale(kmcVar3.getScaleX() * 1.0f, kmcVar3.getScaleY() * 1.0f, measuredWidth3, y2);
                        canvas.save();
                        float x = c00.x(0.807f, j95Var.I2, 0.5f, 0.878f) * j95Var.J3;
                        canvas.scale(x, x, measuredWidth3, y2);
                        canvas.save();
                        canvas.scale(1.2f, 1.2f, measuredWidth3, y2);
                        canvas.drawCircle(measuredWidth3, y2, hl.L(160.0f), paint5);
                        canvas.restore();
                        canvas.restore();
                        if (j95Var.T2 != null) {
                            canvas.save();
                            float z5 = xnb.z(0.807f, j95Var.I2, 0.878f, interpolation);
                            canvas.scale(z5, z5, measuredWidth3, y2);
                            gk0Var6.a(measuredWidth3, y2, canvas, paint3);
                            canvas.restore();
                            canvas.save();
                            float z6 = xnb.z(0.704f, j95Var.I2, 0.926f, interpolation);
                            canvas.scale(z6, z6, measuredWidth3, y2);
                            gk0Var7.a(measuredWidth3, y2, canvas, paint3);
                            canvas.restore();
                        }
                        paint3.setAlpha(jn7.d4);
                        if (z) {
                            canvas.drawCircle(measuredWidth3, y2, hl.L(25.909092f), paint3);
                            paint3.setColor(aob.w0(null, aob.Fh, false));
                            if (f8 != 0.0f) {
                                paint3.setAlpha((int) (f8 * 255.0f));
                                paint3.setShader(null);
                                canvas.drawCircle(measuredWidth3, y2, hl.L(25.909092f), paint3);
                            }
                        }
                        canvas.drawCircle(measuredWidth3, y2, hl.L(25.0f) * f8, paint7);
                        if (!z) {
                            radialProgressView.a(canvas, measuredWidth3, y2);
                        }
                        canvas.restore();
                        super.dispatchDraw(canvas);
                        if (j95Var.T3.r == null) {
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
                        float L2 = hl.L(25.909092f);
                        if (i2 == 0 && j95Var.F3 != null) {
                            if (!j95Var.j1()) {
                                paint2.setShader(j95Var.F3.g);
                            }
                            f5 = 1.0f - j95Var.E3;
                            if (j95Var.F3.i == 3) {
                                L = hl.L(2.0f);
                                L2 -= L * f5;
                            }
                            if (paint2.getShader() == null) {
                            }
                            f6 = L2;
                            f7 = f5;
                            if (j95Var.j1()) {
                            }
                            measuredWidth = (int) ((kmcVar3.getMeasuredWidth() / 2.0f) + kmcVar3.getX());
                            y = (int) (kmcVar3.getY() + hl.L(25.0f));
                            matrix4.setTranslate(measuredWidth, y);
                            j95Var.L2.setLocalMatrix(matrix4);
                            paint2.setAlpha((int) (f7 * 76.0f * j95Var.O2));
                            canvas2.save();
                            canvas2.scale(kmcVar3.getScaleX() * 1.0f, kmcVar3.getScaleX() * 1.0f, measuredWidth, y);
                            canvas2.save();
                            float x2 = c00.x(0.807f, j95Var.I2, 0.5f, 0.878f) * j95Var.J3;
                            canvas2.scale(x2, x2, measuredWidth, y);
                            if (i2 == 1) {
                                canvas2.save();
                                canvas2.scale(1.2f, 1.2f, measuredWidth, y);
                                int alpha = paint5.getAlpha();
                                paint5.setAlpha((int) ((1.0f - j95Var.o5.e) * alpha * j95Var.O2));
                                canvas2.drawCircle(measuredWidth, y, hl.L(160.0f), paint5);
                                paint5.setAlpha(alpha);
                                canvas2.restore();
                            }
                            canvas2.restore();
                            if (j95Var.j1()) {
                            }
                            gk0Var2 = gk0Var4;
                            gk0Var5 = gk0Var3;
                            if (j95.u5) {
                            }
                            float measuredWidth4 = (getMeasuredWidth() / 2.0f) - hl.L(21.0f);
                            float L3 = hl.L(24.0f);
                            float f23 = (f6 - measuredWidth4) + measuredWidth4;
                            float f24 = j95Var.O2;
                            float f25 = f23 * f24;
                            float f26 = ((f6 - L3) + L3) * f24;
                            float f27 = measuredWidth + f25;
                            f4 = interpolation;
                            gk0Var = gk0Var5;
                            rectF = rectF3;
                            rectF.set(measuredWidth - f25, y - f26, f27, y + f26);
                            float L4 = (f6 - hl.L(4.0f)) + hl.L(4.0f);
                            paint2.setAlpha((int) (paint2.getAlpha() * j95Var.O2));
                            canvas2.drawRoundRect(rectF, L4, L4, paint2);
                            if (i2 == 1) {
                            }
                            radialProgressView2 = radialProgressView3;
                            canvas2.restore();
                            if (x75Var != null) {
                                paint2.setAlpha((int) (x75Var.getAlpha() * 255.0f));
                                float x3 = x75Var.getX() - getX();
                                float y3 = x75Var.getY() - getY();
                                rectF.set(x3, y3, x75Var.getMeasuredWidth() + x3, x75Var.getMeasuredHeight() + y3);
                                canvas2.save();
                                canvas2.scale(x75Var.getScaleX(), x75Var.getScaleY(), rectF.centerX(), rectF.centerY());
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint2);
                                canvas2.restore();
                            }
                        } else if (i2 != 1 || j95Var.G3 == null) {
                            f4 = interpolation;
                            radialProgressView2 = radialProgressView5;
                            gk0Var = gk0Var6;
                            gk0Var2 = gk0Var7;
                            rectF = rectF3;
                        } else {
                            if (!j95Var.j1()) {
                                paint2.setShader(j95Var.G3.g);
                            }
                            f5 = j95Var.E3;
                            if (j95Var.G3.i == 3) {
                                L = hl.L(2.0f);
                                L2 -= L * f5;
                            }
                            if (paint2.getShader() == null || j95Var.j1()) {
                                f6 = L2;
                                f7 = f5;
                            } else {
                                f6 = L2;
                                f7 = f5;
                                paint2.setColor(hl.R0(j95Var.N3, 1.0f, aob.w0(null, aob.bh, false), aob.w0(null, aob.Bh, false)));
                            }
                            if (j95Var.j1()) {
                                radialProgressView3 = radialProgressView5;
                                gk0Var3 = gk0Var6;
                                gk0Var4 = gk0Var7;
                            } else {
                                int w0 = aob.w0(null, aob.Ch, false);
                                int i12 = aob.Bh;
                                radialProgressView3 = radialProgressView5;
                                int R0 = hl.R0(j95Var.N3, 1.0f, w0, aob.w0(null, i12, false));
                                paint2.setColor(R0);
                                paint2.setShader(null);
                                int i13 = aob.bh;
                                gk0Var4 = gk0Var7;
                                gk0Var3 = gk0Var6;
                                kmcVar.a(hl.R0(j95Var.N3, 1.0f, aob.w0(null, i13, false), aob.w0(null, i12, false)), R0);
                                kmcVar2.a(hl.R0(j95Var.N3, 1.0f, aob.w0(null, i13, false), aob.w0(null, i12, false)), R0);
                            }
                            measuredWidth = (int) ((kmcVar3.getMeasuredWidth() / 2.0f) + kmcVar3.getX());
                            y = (int) (kmcVar3.getY() + hl.L(25.0f));
                            matrix4.setTranslate(measuredWidth, y);
                            j95Var.L2.setLocalMatrix(matrix4);
                            paint2.setAlpha((int) (f7 * 76.0f * j95Var.O2));
                            canvas2.save();
                            canvas2.scale(kmcVar3.getScaleX() * 1.0f, kmcVar3.getScaleX() * 1.0f, measuredWidth, y);
                            canvas2.save();
                            float x22 = c00.x(0.807f, j95Var.I2, 0.5f, 0.878f) * j95Var.J3;
                            canvas2.scale(x22, x22, measuredWidth, y);
                            if (i2 == 1 && !j95Var.j1() && i86.e(512)) {
                                canvas2.save();
                                canvas2.scale(1.2f, 1.2f, measuredWidth, y);
                                int alpha2 = paint5.getAlpha();
                                paint5.setAlpha((int) ((1.0f - j95Var.o5.e) * alpha2 * j95Var.O2));
                                canvas2.drawCircle(measuredWidth, y, hl.L(160.0f), paint5);
                                paint5.setAlpha(alpha2);
                                canvas2.restore();
                            }
                            canvas2.restore();
                            if (!j95Var.j1() || j95Var.O2 <= 0.0f) {
                                gk0Var2 = gk0Var4;
                                gk0Var5 = gk0Var3;
                            } else {
                                canvas2.save();
                                float x4 = c00.x(0.807f, j95Var.I2, interpolation, 0.878f);
                                canvas2.scale(x4, x4, measuredWidth, y);
                                gk0Var5 = gk0Var3;
                                gk0Var5.a(measuredWidth, y, canvas2, paint2);
                                canvas2.restore();
                                canvas2.save();
                                float x5 = c00.x(0.704f, j95Var.I2, interpolation, 0.926f);
                                canvas2.scale(x5, x5, measuredWidth, y);
                                gk0Var2 = gk0Var4;
                                gk0Var2.a(measuredWidth, y, canvas2, paint2);
                                canvas2.restore();
                            }
                            if (j95.u5) {
                                if (i2 == 0) {
                                    paint2.setAlpha(jn7.d4);
                                } else {
                                    paint2.setAlpha((int) (f7 * 255.0f));
                                }
                            } else if (i2 == 0) {
                                paint2.setAlpha((int) (j95Var.P2 * 255.0f));
                            } else {
                                paint2.setAlpha((int) (f7 * 255.0f * j95Var.P2));
                            }
                            float measuredWidth42 = (getMeasuredWidth() / 2.0f) - hl.L(21.0f);
                            float L32 = hl.L(24.0f);
                            float f232 = (f6 - measuredWidth42) + measuredWidth42;
                            float f242 = j95Var.O2;
                            float f252 = f232 * f242;
                            float f262 = ((f6 - L32) + L32) * f242;
                            float f272 = measuredWidth + f252;
                            f4 = interpolation;
                            gk0Var = gk0Var5;
                            rectF = rectF3;
                            rectF.set(measuredWidth - f252, y - f262, f272, y + f262);
                            float L42 = (f6 - hl.L(4.0f)) + hl.L(4.0f);
                            paint2.setAlpha((int) (paint2.getAlpha() * j95Var.O2));
                            canvas2.drawRoundRect(rectF, L42, L42, paint2);
                            if (i2 == 1 || j95Var.G3.i != 3) {
                                radialProgressView2 = radialProgressView3;
                            } else {
                                radialProgressView2 = radialProgressView3;
                                radialProgressView2.a(canvas2, measuredWidth, y);
                            }
                            canvas2.restore();
                            if (x75Var != null && x75Var.getVisibility() == 0) {
                                paint2.setAlpha((int) (x75Var.getAlpha() * 255.0f));
                                float x32 = x75Var.getX() - getX();
                                float y32 = x75Var.getY() - getY();
                                rectF.set(x32, y32, x75Var.getMeasuredWidth() + x32, x75Var.getMeasuredHeight() + y32);
                                canvas2.save();
                                canvas2.scale(x75Var.getScaleX(), x75Var.getScaleY(), rectF.centerX(), rectF.centerY());
                                canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint2);
                                canvas2.restore();
                            }
                        }
                        i2++;
                        rectF3 = rectF;
                        gk0Var7 = gk0Var2;
                        radialProgressView5 = radialProgressView2;
                        interpolation = f4;
                        gk0Var6 = gk0Var;
                    }
                    super.dispatchDraw(canvas);
                    if (j95Var.T3.r == null) {
                    }
                }
            } else {
                i95 i95Var11 = j95Var.G3;
                if (i95Var11 != null && i95Var11.i == 3) {
                    radialProgressView4.I = true;
                    f2 = 1.0f;
                    radialProgressView4.J = 1.0f;
                    f3 = f2;
                    z = true;
                    if (z) {
                    }
                    float interpolation2 = (this.d.getInterpolation(j95Var.I3) * 0.6f) + 0.4f;
                    gk0Var6.e(j95Var.I2, 1.0f);
                    gk0Var7.e(j95Var.I2, 1.0f);
                    i95Var = j95Var.F3;
                    if (i95Var == null) {
                    }
                    canvas2 = canvas;
                    paint2 = paint6;
                    RadialProgressView radialProgressView52 = radialProgressView;
                    Matrix matrix42 = matrix;
                    i2 = 0;
                    while (i2 < i) {
                    }
                    super.dispatchDraw(canvas);
                    if (j95Var.T3.r == null) {
                    }
                }
            }
        }
        f2 = 1.0f;
        f3 = f2;
        z = true;
        if (z) {
        }
        float interpolation22 = (this.d.getInterpolation(j95Var.I3) * 0.6f) + 0.4f;
        gk0Var6.e(j95Var.I2, 1.0f);
        gk0Var7.e(j95Var.I2, 1.0f);
        i95Var = j95Var.F3;
        if (i95Var == null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        RadialProgressView radialProgressView522 = radialProgressView;
        Matrix matrix422 = matrix;
        i2 = 0;
        while (i2 < i) {
        }
        super.dispatchDraw(canvas);
        if (j95Var.T3.r == null) {
        }
    }
}
