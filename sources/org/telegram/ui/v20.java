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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v20 extends tg.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ s50 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = s50Var;
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
        float f10;
        float f11;
        r50 r50Var;
        boolean z10;
        Paint paint;
        Matrix matrix;
        RadialProgressView radialProgressView;
        boolean z11;
        Canvas canvas2;
        Paint paint2;
        RadialProgressView radialProgressView2;
        Matrix matrix2;
        float f12;
        float f13;
        int i10;
        float f14;
        RadialProgressView radialProgressView3;
        org.telegram.ui.Components.s9 s9Var;
        org.telegram.ui.Components.s9 s9Var2;
        RectF rectF;
        float f15;
        int dp;
        float f16;
        float f17;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.s9 s9Var3;
        org.telegram.ui.Components.s9 s9Var4;
        org.telegram.ui.Components.s9 s9Var5;
        float f18;
        Paint paint3;
        float f19;
        float f20;
        int i11;
        boolean z12;
        boolean z13;
        r50 r50Var2;
        r50 r50Var3;
        int i12;
        int i13;
        int i14;
        int i15;
        s50 s50Var = this.f;
        Paint paint4 = s50Var.F1;
        org.telegram.ui.Components.voip.u2 u2Var = s50Var.r;
        org.telegram.ui.Components.voip.u2 u2Var2 = s50Var.v;
        Matrix matrix3 = s50Var.O0;
        org.telegram.ui.Components.s9 s9Var6 = s50Var.J0;
        org.telegram.ui.Components.s9 s9Var7 = s50Var.I0;
        RectF rectF2 = s50Var.r0;
        Paint paint5 = s50Var.P0;
        RadialProgressView radialProgressView5 = s50Var.a0;
        y30 y30Var = s50Var.P;
        int[] iArr = s50Var.T1;
        org.telegram.ui.Components.voip.u2 u2Var3 = s50Var.w;
        Paint paint6 = s50Var.E1;
        if (s50Var.h2 && s50Var.c2) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - s50Var.K1;
        s50Var.K1 = elapsedRealtime;
        if (j10 > 20) {
            j10 = 17;
        }
        long j11 = j10;
        r50 r50Var4 = s50Var.J1;
        if (r50Var4 != null) {
            r50Var4.b(0, measuredWidth, getMeasuredHeight(), j11, s50Var.K0);
        }
        s9Var7.a = AndroidUtilities.dp(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        s9Var7.b = com.google.android.recaptcha.internal.a.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(62.0f), 0.48076922f);
        s9Var6.a = AndroidUtilities.dp(65.0f) * 0.46296296f;
        s9Var6.b = com.google.android.recaptcha.internal.a.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(65.0f), 0.48076922f);
        float f21 = s50Var.L0;
        float f22 = s50Var.K0;
        if (f21 != f22) {
            f10 = 0.6f;
            float f23 = s50Var.M0;
            f11 = 0.0f;
            float f24 = (j11 * f23) + f22;
            s50Var.K0 = f24;
            if (f23 > 0.0f) {
                if (f24 > f21) {
                    s50Var.K0 = f21;
                }
            } else if (f24 < f21) {
                s50Var.K0 = f21;
            }
        } else {
            f10 = 0.6f;
            f11 = 0.0f;
        }
        r50 r50Var5 = s50Var.I1;
        if (r50Var5 != null && r50Var5.i == 3) {
            radialProgressView5.D = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z10 = false;
                if (z10) {
                }
                float interpolation = (this.d.getInterpolation(s50Var.L1) * f10) + 0.4f;
                s9Var6.e(s50Var.K0, 1.0f);
                s9Var7.e(s50Var.K0, 1.0f);
                if (s50Var.I1 != null) {
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f12 = 25.909092f;
                f13 = 25.0f;
                i10 = 0;
                while (i10 < 2) {
                }
                super.dispatchDraw(canvas);
                if (s50Var.W1.r == null) {
                }
            }
        } else if (r50Var5 != null && (r50Var = s50Var.J1) != null && r50Var.i == 3) {
            radialProgressView5.D = true;
            radialProgressView5.E = 1.0f;
            z10 = true;
            if (z10) {
                float f25 = s50Var.H1;
                if (f25 != 1.0f) {
                    r50 r50Var6 = s50Var.I1;
                    if (r50Var6 == null || r50Var6.i != 3) {
                        s50Var.H1 = (j11 / 180.0f) + f25;
                    } else {
                        s50Var.H1 = (j11 / 100.0f) + f25;
                    }
                    if (s50Var.H1 >= 1.0f) {
                        s50Var.H1 = 1.0f;
                        s50Var.I1 = null;
                        r50 r50Var7 = s50Var.J1;
                        if (r50Var7 != null && r50Var7.i == 3) {
                            radialProgressView5.D = false;
                        }
                    }
                    s50Var.S1 = true;
                }
                if (!s50Var.S1 || (r50Var3 = s50Var.J1) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    z11 = z10;
                } else {
                    s50Var.S1 = false;
                    r50 r50Var8 = s50Var.I1;
                    if (r50Var8 != null) {
                        s50.S(s50Var, r50Var8.i, iArr);
                        int i16 = iArr[0];
                        int i17 = iArr[1];
                        z11 = z10;
                        int i18 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i19 = iArr[3];
                        matrix = matrix3;
                        s50.S(s50Var, s50Var.J1.i, iArr);
                        paint = paint4;
                        i12 = i0.b.d(s50Var.H1, i16, iArr[0]);
                        i13 = i0.b.d(s50Var.H1, i17, iArr[1]);
                        i14 = i0.b.d(s50Var.H1, i18, iArr[2]);
                        i15 = i0.b.d(s50Var.H1, i19, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z11 = z10;
                        s50.S(s50Var, r50Var3.i, iArr);
                        i12 = iArr[0];
                        i13 = iArr[1];
                        i14 = iArr[2];
                        i15 = iArr[3];
                    }
                    if (this.e != i12) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{i0.b.k(i12, 60), i0.b.k(i12, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        s50Var.N0 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i12;
                    }
                    u2Var2.a(i14, i13);
                    u2Var.a(i14, i13);
                    s50Var.n.a(i14, i13);
                    s50Var.f.a(i14, i13);
                    org.telegram.ui.Components.voip.u2 u2Var4 = s50Var.s;
                    int i20 = org.telegram.ui.ActionBar.g6.Dg;
                    u2Var4.a(org.telegram.ui.ActionBar.g6.w0(null, i20, false), org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                    s50Var.h.a(i13, i15);
                }
                r50 r50Var9 = s50Var.J1;
                if (r50Var9 != null) {
                    int i21 = r50Var9.i;
                    z12 = i21 == 1 || i21 == 0 || s50.p1(i21);
                    i11 = 3;
                    if (s50Var.J1.i != 3) {
                        z13 = true;
                        if (s50Var.I1 == null && (r50Var2 = s50Var.J1) != null && r50Var2.i == i11) {
                            float f26 = s50Var.L1 - (j11 / 180.0f);
                            s50Var.L1 = f26;
                            if (f26 < f11) {
                                s50Var.L1 = 0.0f;
                            }
                        } else {
                            if (z12) {
                                float f27 = s50Var.L1;
                                if (f27 != 1.0f) {
                                    float f28 = (j11 / 350.0f) + f27;
                                    s50Var.L1 = f28;
                                    if (f28 > 1.0f) {
                                        s50Var.L1 = 1.0f;
                                    }
                                }
                            }
                            if (!z12) {
                                float f29 = s50Var.L1;
                                if (f29 != 0.0f) {
                                    float f30 = f29 - (j11 / 350.0f);
                                    s50Var.L1 = f30;
                                    if (f30 < 0.0f) {
                                        s50Var.L1 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            float f31 = s50Var.M1;
                            if (f31 != 1.0f) {
                                float f32 = (j11 / 350.0f) + f31;
                                s50Var.M1 = f32;
                                if (f32 > 1.0f) {
                                    s50Var.M1 = 1.0f;
                                }
                            }
                        }
                        if (!z13) {
                            float f33 = s50Var.M1;
                            if (f33 != 0.0f) {
                                float f34 = f33 - (j11 / 350.0f);
                                s50Var.M1 = f34;
                                if (f34 < 0.0f) {
                                    s50Var.M1 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i11 = 3;
                    z12 = false;
                }
                z13 = false;
                if (s50Var.I1 == null) {
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
            float interpolation2 = (this.d.getInterpolation(s50Var.L1) * f10) + 0.4f;
            s9Var6.e(s50Var.K0, 1.0f);
            s9Var7.e(s50Var.K0, 1.0f);
            if (s50Var.I1 != null || s50Var.J1 == null || s50Var.r1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f12 = 25.909092f;
                f13 = 25.0f;
            } else {
                r50 r50Var10 = s50Var.J1;
                f12 = 25.909092f;
                int i22 = r50Var10.i;
                f13 = 25.0f;
                if (i22 == 3 || s50Var.I1.i == 3) {
                    if (i22 == 3) {
                        f20 = s50Var.H1;
                        paint3 = paint6;
                        paint3.setShader(s50Var.I1.g);
                        f19 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f19 = 1.0f;
                        float f35 = 1.0f - s50Var.H1;
                        paint3.setShader(r50Var10.g);
                        f20 = f35;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Kg, false), s50Var.Q1, f19);
                    Paint paint7 = paint;
                    paint7.setColor(offsetColor);
                    float measuredWidth2 = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    float y10 = (int) (u2Var3.getY() + AndroidUtilities.dp(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y10);
                    s50Var.N0.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleY() * 1.0f, measuredWidth2, y10);
                    canvas.save();
                    float x8 = com.google.android.recaptcha.internal.a.x(0.807f, s50Var.K0, 0.5f, 0.878f) * s50Var.M1;
                    canvas.scale(x8, x8, measuredWidth2, y10);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y10);
                    canvas.drawCircle(measuredWidth2, y10, AndroidUtilities.dp(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (s50Var.W0 != null) {
                        canvas.save();
                        float B = com.google.android.recaptcha.internal.a.B(0.807f, s50Var.K0, 0.878f, interpolation2);
                        canvas.scale(B, B, measuredWidth2, y10);
                        s9Var6.a(measuredWidth2, y10, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float B2 = com.google.android.recaptcha.internal.a.B(0.704f, s50Var.K0, 0.926f, interpolation2);
                        canvas.scale(B2, B2, measuredWidth2, y10);
                        s9Var7.a(measuredWidth2, y10, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(255);
                    if (z11) {
                        canvas.drawCircle(measuredWidth2, y10, AndroidUtilities.dp(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Og, false));
                        if (f20 != 0.0f) {
                            paint3.setAlpha((int) (f20 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y10, AndroidUtilities.dp(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y10, AndroidUtilities.dp(25.0f) * f20, paint7);
                    if (!z11) {
                        radialProgressView.a(canvas, measuredWidth2, y10);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (s50Var.W1.r == null) {
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
                float dp2 = AndroidUtilities.dp(f12);
                if (i10 == 0 && s50Var.I1 != null) {
                    if (!s50Var.r1()) {
                        paint2.setShader(s50Var.I1.g);
                    }
                    f15 = 1.0f - s50Var.H1;
                    if (s50Var.I1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f15;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f16 = f15;
                    f17 = dp2;
                    if (s50Var.r1()) {
                    }
                    float measuredWidth3 = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    float y11 = (int) (u2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix2.setTranslate(measuredWidth3, y11);
                    s50Var.N0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (s50Var.R0 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleX() * 1.0f, measuredWidth3, y11);
                    canvas2.save();
                    float x10 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.807f, 0.5f, 0.878f);
                    float f36 = s50Var.M1;
                    canvas2.scale(f36 * x10, f36 * x10, measuredWidth3, y11);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (!s50Var.r1()) {
                    }
                    if (s50.B3) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp3 = AndroidUtilities.dp(24.0f);
                    float f37 = (f17 - measuredWidth4) + measuredWidth4;
                    float f38 = s50Var.R0;
                    float f39 = f37 * f38;
                    float f40 = ((f17 - dp3) + dp3) * f38;
                    float f41 = measuredWidth3 + f39;
                    f14 = interpolation2;
                    s9Var = s9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f39, y11 - f40, f41, y11 + f40);
                    float dp4 = (f17 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (s50Var.R0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp4, dp4, paint2);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (y30Var != null) {
                        paint2.setAlpha((int) (y30Var.getAlpha() * 255.0f));
                        float x11 = y30Var.getX() - getX();
                        float y12 = y30Var.getY() - getY();
                        rectF.set(x11, y12, y30Var.getMeasuredWidth() + x11, y30Var.getMeasuredHeight() + y12);
                        canvas2.save();
                        canvas2.scale(y30Var.getScaleX(), y30Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
                        canvas2.restore();
                    }
                } else if (i10 != 1 || s50Var.J1 == null) {
                    f14 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    s9Var = s9Var6;
                    s9Var2 = s9Var7;
                    rectF = rectF3;
                } else {
                    if (!s50Var.r1()) {
                        paint2.setShader(s50Var.J1.g);
                    }
                    f15 = s50Var.H1;
                    if (s50Var.J1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f15;
                    }
                    if (paint2.getShader() == null || s50Var.r1()) {
                        f16 = f15;
                        f17 = dp2;
                    } else {
                        f16 = f15;
                        f17 = dp2;
                        paint2.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Kg, false), s50Var.Q1, 1.0f));
                    }
                    if (s50Var.r1()) {
                        radialProgressView4 = radialProgressView2;
                        s9Var3 = s9Var6;
                        s9Var4 = s9Var7;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lg, false);
                        int i23 = org.telegram.ui.ActionBar.g6.Kg;
                        radialProgressView4 = radialProgressView2;
                        int offsetColor2 = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.g6.w0(null, i23, false), s50Var.Q1, 1.0f);
                        paint2.setColor(offsetColor2);
                        paint2.setShader(null);
                        int i24 = org.telegram.ui.ActionBar.g6.kg;
                        s9Var4 = s9Var7;
                        s9Var3 = s9Var6;
                        u2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false), org.telegram.ui.ActionBar.g6.w0(null, i23, false), s50Var.Q1, 1.0f), offsetColor2);
                        u2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false), org.telegram.ui.ActionBar.g6.w0(null, i23, false), s50Var.Q1, 1.0f), offsetColor2);
                    }
                    float measuredWidth32 = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    float y112 = (int) (u2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix2.setTranslate(measuredWidth32, y112);
                    s50Var.N0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (s50Var.R0 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleX() * 1.0f, measuredWidth32, y112);
                    canvas2.save();
                    float x102 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.807f, 0.5f, 0.878f);
                    float f362 = s50Var.M1;
                    canvas2.scale(f362 * x102, f362 * x102, measuredWidth32, y112);
                    if (i10 != 1 && !s50Var.r1() && LiteMode.isEnabled(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y112);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - s50Var.v3.e) * s50Var.R0 * alpha));
                        canvas2.drawCircle(measuredWidth32, y112, AndroidUtilities.dp(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!s50Var.r1()) {
                        s9Var2 = s9Var4;
                        s9Var5 = s9Var3;
                    } else if (s50Var.R0 > 0.0f) {
                        canvas2.save();
                        float x12 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(x12, x12, measuredWidth32, y112);
                        s9Var5 = s9Var3;
                        s9Var5.a(measuredWidth32, y112, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float x13 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(x13, x13, measuredWidth32, y112);
                        s9Var2 = s9Var4;
                        s9Var2.a(measuredWidth32, y112, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        s9Var2 = s9Var4;
                        s9Var5 = s9Var3;
                    }
                    if (s50.B3) {
                        if (i10 == 0) {
                            paint2.setAlpha(255);
                        } else {
                            paint2.setAlpha((int) (f16 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        paint2.setAlpha((int) (s50Var.S0 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (s50Var.S0 * f16 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp32 = AndroidUtilities.dp(24.0f);
                    float f372 = (f17 - measuredWidth42) + measuredWidth42;
                    float f382 = s50Var.R0;
                    float f392 = f372 * f382;
                    float f402 = ((f17 - dp32) + dp32) * f382;
                    float f412 = measuredWidth32 + f392;
                    f14 = interpolation2;
                    s9Var = s9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f392, y112 - f402, f412, y112 + f402);
                    float dp42 = (f17 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (s50Var.R0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp42, dp42, paint2);
                    if (i10 != 1) {
                        f18 = 4.0f;
                        if (s50Var.J1.i == 3) {
                            if (s50Var.r1()) {
                                radialProgressView3 = radialProgressView4;
                                radialProgressView3.setSize((int) ((dp42 * 2.0f) - AndroidUtilities.dp(4.0f)));
                            } else {
                                radialProgressView3 = radialProgressView4;
                            }
                            radialProgressView3.a(canvas2, measuredWidth32, y112);
                        } else {
                            radialProgressView3 = radialProgressView4;
                        }
                    } else {
                        radialProgressView3 = radialProgressView4;
                        f18 = 4.0f;
                    }
                    canvas2.restore();
                    if (y30Var != null && y30Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (y30Var.getAlpha() * 255.0f));
                        float x112 = y30Var.getX() - getX();
                        float y122 = y30Var.getY() - getY();
                        rectF.set(x112, y122, y30Var.getMeasuredWidth() + x112, y30Var.getMeasuredHeight() + y122);
                        canvas2.save();
                        canvas2.scale(y30Var.getScaleX(), y30Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
                        canvas2.restore();
                    }
                }
                i10++;
                rectF3 = rectF;
                s9Var7 = s9Var2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f14;
                s9Var6 = s9Var;
            }
            super.dispatchDraw(canvas);
            if (s50Var.W1.r == null) {
            }
        }
        z10 = true;
        if (z10) {
        }
        float interpolation22 = (this.d.getInterpolation(s50Var.L1) * f10) + 0.4f;
        s9Var6.e(s50Var.K0, 1.0f);
        s9Var7.e(s50Var.K0, 1.0f);
        if (s50Var.I1 != null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        radialProgressView2 = radialProgressView;
        matrix2 = matrix;
        f12 = 25.909092f;
        f13 = 25.0f;
        i10 = 0;
        while (i10 < 2) {
        }
        super.dispatchDraw(canvas);
        if (s50Var.W1.r == null) {
        }
    }
}
