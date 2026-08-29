package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w20 extends vg.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ r50 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w20(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = r50Var;
        this.d = new OvershootInterpolator(1.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0737 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x042f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        q50 q50Var;
        boolean z10;
        Paint paint;
        Matrix matrix;
        RadialProgressView radialProgressView;
        boolean z11;
        Canvas canvas2;
        Paint paint2;
        RadialProgressView radialProgressView2;
        Matrix matrix2;
        float f11;
        float f12;
        int i10;
        float f13;
        RadialProgressView radialProgressView3;
        org.telegram.ui.Components.y9 y9Var;
        org.telegram.ui.Components.y9 y9Var2;
        RectF rectF;
        float f14;
        int dp;
        float f15;
        float f16;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.y9 y9Var3;
        org.telegram.ui.Components.y9 y9Var4;
        org.telegram.ui.Components.y9 y9Var5;
        float f17;
        Paint paint3;
        float f18;
        float f19;
        int i11;
        boolean z12;
        boolean z13;
        q50 q50Var2;
        q50 q50Var3;
        int i12;
        int i13;
        int i14;
        int i15;
        r50 r50Var = this.f;
        Paint paint4 = r50Var.F1;
        org.telegram.ui.Components.voip.x2 x2Var = r50Var.r;
        org.telegram.ui.Components.voip.x2 x2Var2 = r50Var.v;
        Matrix matrix3 = r50Var.O0;
        org.telegram.ui.Components.y9 y9Var6 = r50Var.J0;
        org.telegram.ui.Components.y9 y9Var7 = r50Var.I0;
        RectF rectF2 = r50Var.r0;
        Paint paint5 = r50Var.P0;
        RadialProgressView radialProgressView5 = r50Var.a0;
        y30 y30Var = r50Var.P;
        int[] iArr = r50Var.T1;
        org.telegram.ui.Components.voip.x2 x2Var3 = r50Var.w;
        Paint paint6 = r50Var.E1;
        if (r50Var.h2 && r50Var.c2) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - r50Var.K1;
        r50Var.K1 = elapsedRealtime;
        if (j10 > 20) {
            j10 = 17;
        }
        long j11 = j10;
        q50 q50Var4 = r50Var.J1;
        if (q50Var4 != null) {
            q50Var4.b(0, measuredWidth, getMeasuredHeight(), j11, r50Var.K0);
        }
        y9Var7.a = AndroidUtilities.dp(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        y9Var7.b = com.google.android.recaptcha.internal.a.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(62.0f), 0.48076922f);
        y9Var6.a = AndroidUtilities.dp(65.0f) * 0.46296296f;
        y9Var6.b = com.google.android.recaptcha.internal.a.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(65.0f), 0.48076922f);
        float f20 = r50Var.L0;
        float f21 = r50Var.K0;
        if (f20 != f21) {
            f9 = 0.6f;
            float f22 = r50Var.M0;
            f10 = 0.0f;
            float f23 = (j11 * f22) + f21;
            r50Var.K0 = f23;
            if (f22 > 0.0f) {
                if (f23 > f20) {
                    r50Var.K0 = f20;
                }
            } else if (f23 < f20) {
                r50Var.K0 = f20;
            }
        } else {
            f9 = 0.6f;
            f10 = 0.0f;
        }
        q50 q50Var5 = r50Var.I1;
        if (q50Var5 != null && q50Var5.i == 3) {
            radialProgressView5.D = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z10 = false;
                if (z10) {
                }
                float interpolation = (this.d.getInterpolation(r50Var.L1) * f9) + 0.4f;
                y9Var6.e(r50Var.K0, 1.0f);
                y9Var7.e(r50Var.K0, 1.0f);
                if (r50Var.I1 != null) {
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f11 = 25.909092f;
                f12 = 25.0f;
                i10 = 0;
                while (i10 < 2) {
                }
                super.dispatchDraw(canvas);
                if (r50Var.W1.r == null) {
                }
            }
        } else if (q50Var5 != null && (q50Var = r50Var.J1) != null && q50Var.i == 3) {
            radialProgressView5.D = true;
            radialProgressView5.E = 1.0f;
            z10 = true;
            if (z10) {
                float f24 = r50Var.H1;
                if (f24 != 1.0f) {
                    q50 q50Var6 = r50Var.I1;
                    if (q50Var6 == null || q50Var6.i != 3) {
                        r50Var.H1 = (j11 / 180.0f) + f24;
                    } else {
                        r50Var.H1 = (j11 / 100.0f) + f24;
                    }
                    if (r50Var.H1 >= 1.0f) {
                        r50Var.H1 = 1.0f;
                        r50Var.I1 = null;
                        q50 q50Var7 = r50Var.J1;
                        if (q50Var7 != null && q50Var7.i == 3) {
                            radialProgressView5.D = false;
                        }
                    }
                    r50Var.S1 = true;
                }
                if (!r50Var.S1 || (q50Var3 = r50Var.J1) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    z11 = z10;
                } else {
                    r50Var.S1 = false;
                    q50 q50Var8 = r50Var.I1;
                    if (q50Var8 != null) {
                        r50.S(r50Var, q50Var8.i, iArr);
                        int i16 = iArr[0];
                        int i17 = iArr[1];
                        z11 = z10;
                        int i18 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i19 = iArr[3];
                        matrix = matrix3;
                        r50.S(r50Var, r50Var.J1.i, iArr);
                        paint = paint4;
                        i12 = i0.a.d(r50Var.H1, i16, iArr[0]);
                        i13 = i0.a.d(r50Var.H1, i17, iArr[1]);
                        i14 = i0.a.d(r50Var.H1, i18, iArr[2]);
                        i15 = i0.a.d(r50Var.H1, i19, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z11 = z10;
                        r50.S(r50Var, q50Var3.i, iArr);
                        i12 = iArr[0];
                        i13 = iArr[1];
                        i14 = iArr[2];
                        i15 = iArr[3];
                    }
                    if (this.e != i12) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{i0.a.k(i12, 60), i0.a.k(i12, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        r50Var.N0 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i12;
                    }
                    x2Var2.a(i14, i13);
                    x2Var.a(i14, i13);
                    r50Var.n.a(i14, i13);
                    r50Var.f.a(i14, i13);
                    org.telegram.ui.Components.voip.x2 x2Var4 = r50Var.s;
                    int i20 = org.telegram.ui.ActionBar.g6.Dg;
                    x2Var4.a(org.telegram.ui.ActionBar.g6.w0(null, i20, false), org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                    r50Var.h.a(i13, i15);
                }
                q50 q50Var9 = r50Var.J1;
                if (q50Var9 != null) {
                    int i21 = q50Var9.i;
                    z12 = i21 == 1 || i21 == 0 || r50.p1(i21);
                    i11 = 3;
                    if (r50Var.J1.i != 3) {
                        z13 = true;
                        if (r50Var.I1 == null && (q50Var2 = r50Var.J1) != null && q50Var2.i == i11) {
                            float f25 = r50Var.L1 - (j11 / 180.0f);
                            r50Var.L1 = f25;
                            if (f25 < f10) {
                                r50Var.L1 = 0.0f;
                            }
                        } else {
                            if (z12) {
                                float f26 = r50Var.L1;
                                if (f26 != 1.0f) {
                                    float f27 = (j11 / 350.0f) + f26;
                                    r50Var.L1 = f27;
                                    if (f27 > 1.0f) {
                                        r50Var.L1 = 1.0f;
                                    }
                                }
                            }
                            if (!z12) {
                                float f28 = r50Var.L1;
                                if (f28 != 0.0f) {
                                    float f29 = f28 - (j11 / 350.0f);
                                    r50Var.L1 = f29;
                                    if (f29 < 0.0f) {
                                        r50Var.L1 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            float f30 = r50Var.M1;
                            if (f30 != 1.0f) {
                                float f31 = (j11 / 350.0f) + f30;
                                r50Var.M1 = f31;
                                if (f31 > 1.0f) {
                                    r50Var.M1 = 1.0f;
                                }
                            }
                        }
                        if (!z13) {
                            float f32 = r50Var.M1;
                            if (f32 != 0.0f) {
                                float f33 = f32 - (j11 / 350.0f);
                                r50Var.M1 = f33;
                                if (f33 < 0.0f) {
                                    r50Var.M1 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i11 = 3;
                    z12 = false;
                }
                z13 = false;
                if (r50Var.I1 == null) {
                }
                if (z12) {
                }
                if (!z12) {
                }
                if (z13) {
                }
                if (!z13) {
                }
            } else {
                paint = paint4;
                matrix = matrix3;
                radialProgressView = radialProgressView5;
                z11 = z10;
            }
            float interpolation2 = (this.d.getInterpolation(r50Var.L1) * f9) + 0.4f;
            y9Var6.e(r50Var.K0, 1.0f);
            y9Var7.e(r50Var.K0, 1.0f);
            if (r50Var.I1 != null || r50Var.J1 == null || r50Var.r1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f11 = 25.909092f;
                f12 = 25.0f;
            } else {
                q50 q50Var10 = r50Var.J1;
                f11 = 25.909092f;
                int i22 = q50Var10.i;
                f12 = 25.0f;
                if (i22 == 3 || r50Var.I1.i == 3) {
                    if (i22 == 3) {
                        f19 = r50Var.H1;
                        paint3 = paint6;
                        paint3.setShader(r50Var.I1.g);
                        f18 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f18 = 1.0f;
                        float f34 = 1.0f - r50Var.H1;
                        paint3.setShader(q50Var10.g);
                        f19 = f34;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Kg, false), r50Var.Q1, f18);
                    Paint paint7 = paint;
                    paint7.setColor(offsetColor);
                    float measuredWidth2 = (int) ((x2Var3.getMeasuredWidth() / 2.0f) + x2Var3.getX());
                    float y8 = (int) (x2Var3.getY() + AndroidUtilities.dp(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y8);
                    r50Var.N0.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(x2Var3.getScaleX() * 1.0f, x2Var3.getScaleY() * 1.0f, measuredWidth2, y8);
                    canvas.save();
                    float x4 = com.google.android.recaptcha.internal.a.x(0.807f, r50Var.K0, 0.5f, 0.878f) * r50Var.M1;
                    canvas.scale(x4, x4, measuredWidth2, y8);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y8);
                    canvas.drawCircle(measuredWidth2, y8, AndroidUtilities.dp(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (r50Var.W0 != null) {
                        canvas.save();
                        float B = com.google.android.recaptcha.internal.a.B(0.807f, r50Var.K0, 0.878f, interpolation2);
                        canvas.scale(B, B, measuredWidth2, y8);
                        y9Var6.a(measuredWidth2, y8, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float B2 = com.google.android.recaptcha.internal.a.B(0.704f, r50Var.K0, 0.926f, interpolation2);
                        canvas.scale(B2, B2, measuredWidth2, y8);
                        y9Var7.a(measuredWidth2, y8, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(255);
                    if (z11) {
                        canvas.drawCircle(measuredWidth2, y8, AndroidUtilities.dp(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Og, false));
                        if (f19 != 0.0f) {
                            paint3.setAlpha((int) (f19 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y8, AndroidUtilities.dp(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y8, AndroidUtilities.dp(25.0f) * f19, paint7);
                    if (!z11) {
                        radialProgressView.a(canvas, measuredWidth2, y8);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (r50Var.W1.r == null) {
                        return;
                    }
                    invalidate();
                    return;
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
            }
            i10 = 0;
            while (i10 < 2) {
                float dp2 = AndroidUtilities.dp(f11);
                if (i10 == 0 && r50Var.I1 != null) {
                    if (!r50Var.r1()) {
                        paint2.setShader(r50Var.I1.g);
                    }
                    f14 = 1.0f - r50Var.H1;
                    if (r50Var.I1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f14;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f15 = f14;
                    f16 = dp2;
                    if (r50Var.r1()) {
                    }
                    float measuredWidth3 = (int) ((x2Var3.getMeasuredWidth() / 2.0f) + x2Var3.getX());
                    float y10 = (int) (x2Var3.getY() + AndroidUtilities.dp(f12));
                    matrix2.setTranslate(measuredWidth3, y10);
                    r50Var.N0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (r50Var.R0 * 76.0f * f15));
                    canvas2.save();
                    canvas2.scale(x2Var3.getScaleX() * 1.0f, x2Var3.getScaleX() * 1.0f, measuredWidth3, y10);
                    canvas2.save();
                    float x10 = com.google.android.recaptcha.internal.a.x(r50Var.K0, 0.807f, 0.5f, 0.878f);
                    float f35 = r50Var.M1;
                    canvas2.scale(f35 * x10, f35 * x10, measuredWidth3, y10);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (!r50Var.r1()) {
                    }
                    if (r50.B3) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp3 = AndroidUtilities.dp(24.0f);
                    float f36 = (f16 - measuredWidth4) + measuredWidth4;
                    float f37 = r50Var.R0;
                    float f38 = f36 * f37;
                    float f39 = ((f16 - dp3) + dp3) * f37;
                    float f40 = measuredWidth3 + f38;
                    f13 = interpolation2;
                    y9Var = y9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f38, y10 - f39, f40, y10 + f39);
                    float dp4 = (f16 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (r50Var.R0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp4, dp4, paint2);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (y30Var != null) {
                        paint2.setAlpha((int) (y30Var.getAlpha() * 255.0f));
                        float x11 = y30Var.getX() - getX();
                        float y11 = y30Var.getY() - getY();
                        rectF.set(x11, y11, y30Var.getMeasuredWidth() + x11, y30Var.getMeasuredHeight() + y11);
                        canvas2.save();
                        canvas2.scale(y30Var.getScaleX(), y30Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint2);
                        canvas2.restore();
                    }
                } else if (i10 != 1 || r50Var.J1 == null) {
                    f13 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    y9Var = y9Var6;
                    y9Var2 = y9Var7;
                    rectF = rectF3;
                } else {
                    if (!r50Var.r1()) {
                        paint2.setShader(r50Var.J1.g);
                    }
                    f14 = r50Var.H1;
                    if (r50Var.J1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f14;
                    }
                    if (paint2.getShader() == null || r50Var.r1()) {
                        f15 = f14;
                        f16 = dp2;
                    } else {
                        f15 = f14;
                        f16 = dp2;
                        paint2.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Kg, false), r50Var.Q1, 1.0f));
                    }
                    if (r50Var.r1()) {
                        radialProgressView4 = radialProgressView2;
                        y9Var3 = y9Var6;
                        y9Var4 = y9Var7;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lg, false);
                        int i23 = org.telegram.ui.ActionBar.g6.Kg;
                        radialProgressView4 = radialProgressView2;
                        int offsetColor2 = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.g6.w0(null, i23, false), r50Var.Q1, 1.0f);
                        paint2.setColor(offsetColor2);
                        paint2.setShader(null);
                        int i24 = org.telegram.ui.ActionBar.g6.kg;
                        y9Var4 = y9Var7;
                        y9Var3 = y9Var6;
                        x2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false), org.telegram.ui.ActionBar.g6.w0(null, i23, false), r50Var.Q1, 1.0f), offsetColor2);
                        x2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false), org.telegram.ui.ActionBar.g6.w0(null, i23, false), r50Var.Q1, 1.0f), offsetColor2);
                    }
                    float measuredWidth32 = (int) ((x2Var3.getMeasuredWidth() / 2.0f) + x2Var3.getX());
                    float y102 = (int) (x2Var3.getY() + AndroidUtilities.dp(f12));
                    matrix2.setTranslate(measuredWidth32, y102);
                    r50Var.N0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (r50Var.R0 * 76.0f * f15));
                    canvas2.save();
                    canvas2.scale(x2Var3.getScaleX() * 1.0f, x2Var3.getScaleX() * 1.0f, measuredWidth32, y102);
                    canvas2.save();
                    float x102 = com.google.android.recaptcha.internal.a.x(r50Var.K0, 0.807f, 0.5f, 0.878f);
                    float f352 = r50Var.M1;
                    canvas2.scale(f352 * x102, f352 * x102, measuredWidth32, y102);
                    if (i10 != 1 && !r50Var.r1() && LiteMode.isEnabled(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y102);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - r50Var.v3.e) * r50Var.R0 * alpha));
                        canvas2.drawCircle(measuredWidth32, y102, AndroidUtilities.dp(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!r50Var.r1()) {
                        y9Var2 = y9Var4;
                        y9Var5 = y9Var3;
                    } else if (r50Var.R0 > 0.0f) {
                        canvas2.save();
                        float x12 = com.google.android.recaptcha.internal.a.x(r50Var.K0, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(x12, x12, measuredWidth32, y102);
                        y9Var5 = y9Var3;
                        y9Var5.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float x13 = com.google.android.recaptcha.internal.a.x(r50Var.K0, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(x13, x13, measuredWidth32, y102);
                        y9Var2 = y9Var4;
                        y9Var2.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        y9Var2 = y9Var4;
                        y9Var5 = y9Var3;
                    }
                    if (r50.B3) {
                        if (i10 == 0) {
                            paint2.setAlpha(255);
                        } else {
                            paint2.setAlpha((int) (f15 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        paint2.setAlpha((int) (r50Var.S0 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (r50Var.S0 * f15 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp32 = AndroidUtilities.dp(24.0f);
                    float f362 = (f16 - measuredWidth42) + measuredWidth42;
                    float f372 = r50Var.R0;
                    float f382 = f362 * f372;
                    float f392 = ((f16 - dp32) + dp32) * f372;
                    float f402 = measuredWidth32 + f382;
                    f13 = interpolation2;
                    y9Var = y9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f382, y102 - f392, f402, y102 + f392);
                    float dp42 = (f16 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (r50Var.R0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp42, dp42, paint2);
                    if (i10 != 1) {
                        f17 = 4.0f;
                        if (r50Var.J1.i == 3) {
                            if (r50Var.r1()) {
                                radialProgressView3 = radialProgressView4;
                                radialProgressView3.setSize((int) ((dp42 * 2.0f) - AndroidUtilities.dp(4.0f)));
                            } else {
                                radialProgressView3 = radialProgressView4;
                            }
                            radialProgressView3.a(canvas2, measuredWidth32, y102);
                        } else {
                            radialProgressView3 = radialProgressView4;
                        }
                    } else {
                        radialProgressView3 = radialProgressView4;
                        f17 = 4.0f;
                    }
                    canvas2.restore();
                    if (y30Var != null && y30Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (y30Var.getAlpha() * 255.0f));
                        float x112 = y30Var.getX() - getX();
                        float y112 = y30Var.getY() - getY();
                        rectF.set(x112, y112, y30Var.getMeasuredWidth() + x112, y30Var.getMeasuredHeight() + y112);
                        canvas2.save();
                        canvas2.scale(y30Var.getScaleX(), y30Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint2);
                        canvas2.restore();
                    }
                }
                i10++;
                rectF3 = rectF;
                y9Var7 = y9Var2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f13;
                y9Var6 = y9Var;
            }
            super.dispatchDraw(canvas);
            if (r50Var.W1.r == null) {
            }
        }
        z10 = true;
        if (z10) {
        }
        float interpolation22 = (this.d.getInterpolation(r50Var.L1) * f9) + 0.4f;
        y9Var6.e(r50Var.K0, 1.0f);
        y9Var7.e(r50Var.K0, 1.0f);
        if (r50Var.I1 != null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        radialProgressView2 = radialProgressView;
        matrix2 = matrix;
        f11 = 25.909092f;
        f12 = 25.0f;
        i10 = 0;
        while (i10 < 2) {
        }
        super.dispatchDraw(canvas);
        if (r50Var.W1.r == null) {
        }
    }
}
