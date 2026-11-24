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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r45 extends j75 {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ h75 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r45(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = h75Var;
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
        g75 g75Var;
        Canvas canvas2;
        Paint paint2;
        int i;
        int i2;
        float f4;
        RadialProgressView radialProgressView2;
        fk0 fk0Var;
        fk0 fk0Var2;
        RectF rectF;
        float f5;
        int L;
        float f6;
        float f7;
        RadialProgressView radialProgressView3;
        fk0 fk0Var3;
        fk0 fk0Var4;
        float measuredWidth;
        float y;
        fk0 fk0Var5;
        g75 g75Var2;
        Paint paint3;
        float f8;
        byte b;
        byte b2;
        boolean z2;
        boolean z3;
        g75 g75Var3;
        int i3;
        int i4;
        int i5;
        int i6;
        float f9;
        h75 h75Var = this.f;
        Paint paint4 = h75Var.C3;
        dic dicVar = h75Var.s1;
        dic dicVar2 = h75Var.u1;
        Matrix matrix2 = h75Var.M2;
        RadialProgressView radialProgressView4 = h75Var.X1;
        fk0 fk0Var6 = h75Var.H2;
        fk0 fk0Var7 = h75Var.G2;
        RectF rectF2 = h75Var.p2;
        Paint paint5 = h75Var.N2;
        v55 v55Var = h75Var.M1;
        int[] iArr = h75Var.Q3;
        dic dicVar3 = h75Var.v1;
        Paint paint6 = h75Var.B3;
        if (h75Var.d4 && h75Var.Z3) {
            return;
        }
        int measuredWidth2 = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - h75Var.H3;
        h75Var.H3 = elapsedRealtime;
        if (j > 20) {
            j = 17;
        }
        long j2 = j;
        g75 g75Var4 = h75Var.G3;
        if (g75Var4 != null) {
            g75Var4.b(0, measuredWidth2, getMeasuredHeight(), j2, h75Var.I2);
        }
        fk0Var7.a = gl.L(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        fk0Var7.b = yjb.z(gl.L(20.0f), 0.6f, gl.L(62.0f), 0.48076922f);
        fk0Var6.a = gl.L(65.0f) * 0.46296296f;
        fk0Var6.b = yjb.z(gl.L(20.0f), 0.6f, gl.L(65.0f), 0.48076922f);
        float f10 = h75Var.J2;
        float f11 = h75Var.I2;
        if (f10 != f11) {
            float f12 = h75Var.K2;
            f = 0.0f;
            float f13 = (j2 * f12) + f11;
            h75Var.I2 = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    h75Var.I2 = f10;
                }
            } else if (f13 < f10) {
                h75Var.I2 = f10;
            }
        } else {
            f = 0.0f;
        }
        g75 g75Var5 = h75Var.F3;
        if (g75Var5 != null) {
            if (g75Var5.i == 3) {
                radialProgressView4.I = true;
                if (Math.abs(radialProgressView4.n) < 360.0f) {
                    f3 = 1.0f;
                    z = false;
                    if (z) {
                        float f14 = h75Var.E3;
                        if (f14 != f3) {
                            g75 g75Var6 = h75Var.F3;
                            if (g75Var6 == null || g75Var6.i != 3) {
                                f9 = (j2 / 180.0f) + f14;
                                h75Var.E3 = f9;
                            } else {
                                f9 = (j2 / 100.0f) + f14;
                                h75Var.E3 = f9;
                            }
                            if (f9 >= 1.0f) {
                                h75Var.E3 = 1.0f;
                                h75Var.F3 = null;
                                g75 g75Var7 = h75Var.G3;
                                if (g75Var7 != null && g75Var7.i == 3) {
                                    radialProgressView4.I = false;
                                }
                            }
                            h75Var.P3 = true;
                        }
                        if (!h75Var.P3 || (g75Var3 = h75Var.G3) == null) {
                            paint = paint4;
                            matrix = matrix2;
                            radialProgressView = radialProgressView4;
                            b = 3;
                        } else {
                            h75Var.P3 = false;
                            g75 g75Var8 = h75Var.F3;
                            if (g75Var8 != null) {
                                h75Var.U0(iArr, g75Var8.i);
                                int i7 = iArr[0];
                                b = 3;
                                int i8 = iArr[1];
                                int i9 = iArr[2];
                                radialProgressView = radialProgressView4;
                                int i10 = iArr[3];
                                matrix = matrix2;
                                h75Var.U0(iArr, h75Var.G3.i);
                                paint = paint4;
                                i3 = bm2.f(h75Var.E3, i7, iArr[0]);
                                i4 = bm2.f(h75Var.E3, i8, iArr[1]);
                                i5 = bm2.f(h75Var.E3, i9, iArr[2]);
                                i6 = bm2.f(h75Var.E3, i10, iArr[3]);
                            } else {
                                paint = paint4;
                                matrix = matrix2;
                                radialProgressView = radialProgressView4;
                                b = 3;
                                h75Var.U0(iArr, g75Var3.i);
                                i3 = iArr[0];
                                i4 = iArr[1];
                                i5 = iArr[2];
                                i6 = iArr[3];
                            }
                            if (this.e != i3) {
                                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gl.L(45.454548f), new int[]{bm2.o(i3, 60), bm2.o(i3, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                                h75Var.L2 = radialGradient;
                                paint5.setShader(radialGradient);
                                this.e = i3;
                            }
                            dicVar2.a(i5, i4);
                            dicVar.a(i5, i4);
                            h75Var.r1.a(i5, i4);
                            h75Var.p1.a(i5, i4);
                            dic dicVar4 = h75Var.t1;
                            int i11 = bkb.th;
                            dicVar4.a(bkb.w0(null, i11, false), bkb.w0(null, i11, false));
                            h75Var.q1.a(i4, i6);
                        }
                        g75 g75Var9 = h75Var.G3;
                        if (g75Var9 != null) {
                            byte b3 = g75Var9.i;
                            boolean z4 = b3 == 1 || b3 == 0 || h75.h1(b3);
                            g75 g75Var10 = h75Var.G3;
                            b2 = b;
                            z3 = g75Var10.i != b2;
                            z2 = z4;
                            g75Var9 = g75Var10;
                        } else {
                            b2 = b;
                            z2 = false;
                            z3 = false;
                        }
                        if (h75Var.F3 == null || g75Var9 == null || g75Var9.i != b2) {
                            float f15 = h75Var.I3;
                            if (z2) {
                                if (f15 != 1.0f) {
                                    float f16 = (j2 / 350.0f) + f15;
                                    h75Var.I3 = f16;
                                    if (f16 > 1.0f) {
                                        h75Var.I3 = 1.0f;
                                    }
                                }
                            } else if (f15 != 0.0f) {
                                float f17 = f15 - (j2 / 350.0f);
                                h75Var.I3 = f17;
                                if (f17 < 0.0f) {
                                    h75Var.I3 = 0.0f;
                                }
                            }
                        } else {
                            float f18 = h75Var.I3 - (j2 / 180.0f);
                            h75Var.I3 = f18;
                            if (f18 < f) {
                                h75Var.I3 = f;
                            }
                        }
                        float f19 = h75Var.J3;
                        if (z3) {
                            if (f19 != 1.0f) {
                                float f20 = (j2 / 350.0f) + f19;
                                h75Var.J3 = f20;
                                if (f20 > 1.0f) {
                                    h75Var.J3 = 1.0f;
                                }
                            }
                        } else if (f19 != 0.0f) {
                            float f21 = f19 - (j2 / 350.0f);
                            h75Var.J3 = f21;
                            if (f21 < 0.0f) {
                                h75Var.J3 = 0.0f;
                            }
                        }
                    } else {
                        paint = paint4;
                        matrix = matrix2;
                        radialProgressView = radialProgressView4;
                    }
                    float interpolation = (this.d.getInterpolation(h75Var.I3) * 0.6f) + 0.4f;
                    fk0Var6.e(h75Var.I2, 1.0f);
                    fk0Var7.e(h75Var.I2, 1.0f);
                    g75Var = h75Var.F3;
                    if (g75Var == null && (g75Var2 = h75Var.G3) != null) {
                        if (g75Var2.i == 3) {
                            paint3 = paint6;
                            float f22 = h75Var.E3;
                            paint3.setShader(g75Var.g);
                            f8 = f22;
                        } else if (g75Var.i == 3) {
                            f8 = 1.0f - h75Var.E3;
                            Shader shader = g75Var2.g;
                            paint3 = paint6;
                            paint3.setShader(shader);
                        } else {
                            paint2 = paint6;
                            canvas2 = canvas;
                        }
                        Paint paint7 = paint;
                        paint7.setColor(gl.R0(h75Var.N3, 1.0f, bkb.w0(null, bkb.ah, false), bkb.w0(null, bkb.Ah, false)));
                        float measuredWidth3 = (int) ((dicVar3.getMeasuredWidth() / 2.0f) + dicVar3.getX());
                        float y2 = (int) (dicVar3.getY() + gl.L(25.0f));
                        Matrix matrix3 = matrix;
                        matrix3.setTranslate(measuredWidth3, y2);
                        h75Var.L2.setLocalMatrix(matrix3);
                        paint3.setAlpha(76);
                        canvas.save();
                        canvas.scale(dicVar3.getScaleX() * 1.0f, dicVar3.getScaleY() * 1.0f, measuredWidth3, y2);
                        canvas.save();
                        float w = b00.w(0.807f, h75Var.I2, 0.5f, 0.878f) * h75Var.J3;
                        canvas.scale(w, w, measuredWidth3, y2);
                        canvas.save();
                        canvas.scale(1.2f, 1.2f, measuredWidth3, y2);
                        canvas.drawCircle(measuredWidth3, y2, gl.L(160.0f), paint5);
                        canvas.restore();
                        canvas.restore();
                        if (h75Var.T2 != null) {
                            canvas.save();
                            float z5 = yjb.z(0.807f, h75Var.I2, 0.878f, interpolation);
                            canvas.scale(z5, z5, measuredWidth3, y2);
                            fk0Var6.a(measuredWidth3, y2, canvas, paint3);
                            canvas.restore();
                            canvas.save();
                            float z6 = yjb.z(0.704f, h75Var.I2, 0.926f, interpolation);
                            canvas.scale(z6, z6, measuredWidth3, y2);
                            fk0Var7.a(measuredWidth3, y2, canvas, paint3);
                            canvas.restore();
                        }
                        paint3.setAlpha(kk7.d4);
                        if (z) {
                            canvas.drawCircle(measuredWidth3, y2, gl.L(25.909092f), paint3);
                            paint3.setColor(bkb.w0(null, bkb.Eh, false));
                            if (f8 != 0.0f) {
                                paint3.setAlpha((int) (f8 * 255.0f));
                                paint3.setShader(null);
                                canvas.drawCircle(measuredWidth3, y2, gl.L(25.909092f), paint3);
                            }
                        }
                        canvas.drawCircle(measuredWidth3, y2, gl.L(25.0f) * f8, paint7);
                        if (!z) {
                            radialProgressView.a(canvas, measuredWidth3, y2);
                        }
                        canvas.restore();
                        super.dispatchDraw(canvas);
                        if (h75Var.T3.r == null) {
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
                        float L2 = gl.L(25.909092f);
                        if (i2 == 0 && h75Var.F3 != null) {
                            if (!h75Var.i1()) {
                                paint2.setShader(h75Var.F3.g);
                            }
                            f5 = 1.0f - h75Var.E3;
                            if (h75Var.F3.i == 3) {
                                L = gl.L(2.0f);
                                L2 -= L * f5;
                            }
                            if (paint2.getShader() == null) {
                            }
                            f6 = L2;
                            f7 = f5;
                            if (h75Var.i1()) {
                            }
                            measuredWidth = (int) ((dicVar3.getMeasuredWidth() / 2.0f) + dicVar3.getX());
                            y = (int) (dicVar3.getY() + gl.L(25.0f));
                            matrix4.setTranslate(measuredWidth, y);
                            h75Var.L2.setLocalMatrix(matrix4);
                            paint2.setAlpha((int) (f7 * 76.0f * h75Var.O2));
                            canvas2.save();
                            canvas2.scale(dicVar3.getScaleX() * 1.0f, dicVar3.getScaleX() * 1.0f, measuredWidth, y);
                            canvas2.save();
                            float w2 = b00.w(0.807f, h75Var.I2, 0.5f, 0.878f) * h75Var.J3;
                            canvas2.scale(w2, w2, measuredWidth, y);
                            if (i2 == 1) {
                                canvas2.save();
                                canvas2.scale(1.2f, 1.2f, measuredWidth, y);
                                int alpha = paint5.getAlpha();
                                paint5.setAlpha((int) ((1.0f - h75Var.o5.e) * alpha * h75Var.O2));
                                canvas2.drawCircle(measuredWidth, y, gl.L(160.0f), paint5);
                                paint5.setAlpha(alpha);
                                canvas2.restore();
                            }
                            canvas2.restore();
                            if (h75Var.i1()) {
                            }
                            fk0Var2 = fk0Var4;
                            fk0Var5 = fk0Var3;
                            if (h75.u5) {
                            }
                            float measuredWidth4 = (getMeasuredWidth() / 2.0f) - gl.L(21.0f);
                            float L3 = gl.L(24.0f);
                            float f23 = (f6 - measuredWidth4) + measuredWidth4;
                            float f24 = h75Var.O2;
                            float f25 = f23 * f24;
                            float f26 = ((f6 - L3) + L3) * f24;
                            float f27 = measuredWidth + f25;
                            f4 = interpolation;
                            fk0Var = fk0Var5;
                            rectF = rectF3;
                            rectF.set(measuredWidth - f25, y - f26, f27, y + f26);
                            float L4 = (f6 - gl.L(4.0f)) + gl.L(4.0f);
                            paint2.setAlpha((int) (paint2.getAlpha() * h75Var.O2));
                            canvas2.drawRoundRect(rectF, L4, L4, paint2);
                            if (i2 == 1) {
                            }
                            radialProgressView2 = radialProgressView3;
                            canvas2.restore();
                            if (v55Var != null) {
                                paint2.setAlpha((int) (v55Var.getAlpha() * 255.0f));
                                float x = v55Var.getX() - getX();
                                float y3 = v55Var.getY() - getY();
                                rectF.set(x, y3, v55Var.getMeasuredWidth() + x, v55Var.getMeasuredHeight() + y3);
                                canvas2.save();
                                canvas2.scale(v55Var.getScaleX(), v55Var.getScaleY(), rectF.centerX(), rectF.centerY());
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint2);
                                canvas2.restore();
                            }
                        } else if (i2 != 1 || h75Var.G3 == null) {
                            f4 = interpolation;
                            radialProgressView2 = radialProgressView5;
                            fk0Var = fk0Var6;
                            fk0Var2 = fk0Var7;
                            rectF = rectF3;
                        } else {
                            if (!h75Var.i1()) {
                                paint2.setShader(h75Var.G3.g);
                            }
                            f5 = h75Var.E3;
                            if (h75Var.G3.i == 3) {
                                L = gl.L(2.0f);
                                L2 -= L * f5;
                            }
                            if (paint2.getShader() == null || h75Var.i1()) {
                                f6 = L2;
                                f7 = f5;
                            } else {
                                f6 = L2;
                                f7 = f5;
                                paint2.setColor(gl.R0(h75Var.N3, 1.0f, bkb.w0(null, bkb.ah, false), bkb.w0(null, bkb.Ah, false)));
                            }
                            if (h75Var.i1()) {
                                radialProgressView3 = radialProgressView5;
                                fk0Var3 = fk0Var6;
                                fk0Var4 = fk0Var7;
                            } else {
                                int w0 = bkb.w0(null, bkb.Bh, false);
                                int i12 = bkb.Ah;
                                radialProgressView3 = radialProgressView5;
                                int R0 = gl.R0(h75Var.N3, 1.0f, w0, bkb.w0(null, i12, false));
                                paint2.setColor(R0);
                                paint2.setShader(null);
                                int i13 = bkb.ah;
                                fk0Var4 = fk0Var7;
                                fk0Var3 = fk0Var6;
                                dicVar.a(gl.R0(h75Var.N3, 1.0f, bkb.w0(null, i13, false), bkb.w0(null, i12, false)), R0);
                                dicVar2.a(gl.R0(h75Var.N3, 1.0f, bkb.w0(null, i13, false), bkb.w0(null, i12, false)), R0);
                            }
                            measuredWidth = (int) ((dicVar3.getMeasuredWidth() / 2.0f) + dicVar3.getX());
                            y = (int) (dicVar3.getY() + gl.L(25.0f));
                            matrix4.setTranslate(measuredWidth, y);
                            h75Var.L2.setLocalMatrix(matrix4);
                            paint2.setAlpha((int) (f7 * 76.0f * h75Var.O2));
                            canvas2.save();
                            canvas2.scale(dicVar3.getScaleX() * 1.0f, dicVar3.getScaleX() * 1.0f, measuredWidth, y);
                            canvas2.save();
                            float w22 = b00.w(0.807f, h75Var.I2, 0.5f, 0.878f) * h75Var.J3;
                            canvas2.scale(w22, w22, measuredWidth, y);
                            if (i2 == 1 && !h75Var.i1() && e66.e(512)) {
                                canvas2.save();
                                canvas2.scale(1.2f, 1.2f, measuredWidth, y);
                                int alpha2 = paint5.getAlpha();
                                paint5.setAlpha((int) ((1.0f - h75Var.o5.e) * alpha2 * h75Var.O2));
                                canvas2.drawCircle(measuredWidth, y, gl.L(160.0f), paint5);
                                paint5.setAlpha(alpha2);
                                canvas2.restore();
                            }
                            canvas2.restore();
                            if (!h75Var.i1() || h75Var.O2 <= 0.0f) {
                                fk0Var2 = fk0Var4;
                                fk0Var5 = fk0Var3;
                            } else {
                                canvas2.save();
                                float w3 = b00.w(0.807f, h75Var.I2, interpolation, 0.878f);
                                canvas2.scale(w3, w3, measuredWidth, y);
                                fk0Var5 = fk0Var3;
                                fk0Var5.a(measuredWidth, y, canvas2, paint2);
                                canvas2.restore();
                                canvas2.save();
                                float w4 = b00.w(0.704f, h75Var.I2, interpolation, 0.926f);
                                canvas2.scale(w4, w4, measuredWidth, y);
                                fk0Var2 = fk0Var4;
                                fk0Var2.a(measuredWidth, y, canvas2, paint2);
                                canvas2.restore();
                            }
                            if (h75.u5) {
                                if (i2 == 0) {
                                    paint2.setAlpha(kk7.d4);
                                } else {
                                    paint2.setAlpha((int) (f7 * 255.0f));
                                }
                            } else if (i2 == 0) {
                                paint2.setAlpha((int) (h75Var.P2 * 255.0f));
                            } else {
                                paint2.setAlpha((int) (f7 * 255.0f * h75Var.P2));
                            }
                            float measuredWidth42 = (getMeasuredWidth() / 2.0f) - gl.L(21.0f);
                            float L32 = gl.L(24.0f);
                            float f232 = (f6 - measuredWidth42) + measuredWidth42;
                            float f242 = h75Var.O2;
                            float f252 = f232 * f242;
                            float f262 = ((f6 - L32) + L32) * f242;
                            float f272 = measuredWidth + f252;
                            f4 = interpolation;
                            fk0Var = fk0Var5;
                            rectF = rectF3;
                            rectF.set(measuredWidth - f252, y - f262, f272, y + f262);
                            float L42 = (f6 - gl.L(4.0f)) + gl.L(4.0f);
                            paint2.setAlpha((int) (paint2.getAlpha() * h75Var.O2));
                            canvas2.drawRoundRect(rectF, L42, L42, paint2);
                            if (i2 == 1 || h75Var.G3.i != 3) {
                                radialProgressView2 = radialProgressView3;
                            } else {
                                radialProgressView2 = radialProgressView3;
                                radialProgressView2.a(canvas2, measuredWidth, y);
                            }
                            canvas2.restore();
                            if (v55Var != null && v55Var.getVisibility() == 0) {
                                paint2.setAlpha((int) (v55Var.getAlpha() * 255.0f));
                                float x2 = v55Var.getX() - getX();
                                float y32 = v55Var.getY() - getY();
                                rectF.set(x2, y32, v55Var.getMeasuredWidth() + x2, v55Var.getMeasuredHeight() + y32);
                                canvas2.save();
                                canvas2.scale(v55Var.getScaleX(), v55Var.getScaleY(), rectF.centerX(), rectF.centerY());
                                canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint2);
                                canvas2.restore();
                            }
                        }
                        i2++;
                        rectF3 = rectF;
                        fk0Var7 = fk0Var2;
                        radialProgressView5 = radialProgressView2;
                        interpolation = f4;
                        fk0Var6 = fk0Var;
                    }
                    super.dispatchDraw(canvas);
                    if (h75Var.T3.r == null) {
                    }
                }
            } else {
                g75 g75Var11 = h75Var.G3;
                if (g75Var11 != null && g75Var11.i == 3) {
                    radialProgressView4.I = true;
                    f2 = 1.0f;
                    radialProgressView4.J = 1.0f;
                    f3 = f2;
                    z = true;
                    if (z) {
                    }
                    float interpolation2 = (this.d.getInterpolation(h75Var.I3) * 0.6f) + 0.4f;
                    fk0Var6.e(h75Var.I2, 1.0f);
                    fk0Var7.e(h75Var.I2, 1.0f);
                    g75Var = h75Var.F3;
                    if (g75Var == null) {
                    }
                    canvas2 = canvas;
                    paint2 = paint6;
                    RadialProgressView radialProgressView52 = radialProgressView;
                    Matrix matrix42 = matrix;
                    i2 = 0;
                    while (i2 < i) {
                    }
                    super.dispatchDraw(canvas);
                    if (h75Var.T3.r == null) {
                    }
                }
            }
        }
        f2 = 1.0f;
        f3 = f2;
        z = true;
        if (z) {
        }
        float interpolation22 = (this.d.getInterpolation(h75Var.I3) * 0.6f) + 0.4f;
        fk0Var6.e(h75Var.I2, 1.0f);
        fk0Var7.e(h75Var.I2, 1.0f);
        g75Var = h75Var.F3;
        if (g75Var == null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        RadialProgressView radialProgressView522 = radialProgressView;
        Matrix matrix422 = matrix;
        i2 = 0;
        while (i2 < i) {
        }
        super.dispatchDraw(canvas);
        if (h75Var.T3.r == null) {
        }
    }
}
