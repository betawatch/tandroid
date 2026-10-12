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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r30 extends lh.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ n60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = n60Var;
        this.d = new OvershootInterpolator(1.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x073a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x042d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        m60 m60Var;
        float f10;
        float f11;
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
        int i11;
        float f14;
        RadialProgressView radialProgressView3;
        org.telegram.ui.Components.ea eaVar;
        org.telegram.ui.Components.ea eaVar2;
        RectF rectF;
        float f15;
        int dp;
        float f16;
        float f17;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.ea eaVar3;
        org.telegram.ui.Components.ea eaVar4;
        org.telegram.ui.Components.ea eaVar5;
        float f18;
        Paint paint3;
        float f19;
        float f20;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        m60 m60Var2;
        m60 m60Var3;
        int i14;
        int i15;
        int i16;
        int i17;
        n60 n60Var = this.f;
        Paint paint4 = n60Var.J1;
        org.telegram.ui.Components.voip.u2 u2Var = n60Var.r;
        org.telegram.ui.Components.voip.u2 u2Var2 = n60Var.v;
        Matrix matrix3 = n60Var.S0;
        org.telegram.ui.Components.ea eaVar6 = n60Var.N0;
        org.telegram.ui.Components.ea eaVar7 = n60Var.M0;
        RectF rectF2 = n60Var.v0;
        Paint paint5 = n60Var.T0;
        RadialProgressView radialProgressView5 = n60Var.e0;
        t40 t40Var = n60Var.T;
        int[] iArr = n60Var.X1;
        org.telegram.ui.Components.voip.u2 u2Var3 = n60Var.w;
        Paint paint6 = n60Var.I1;
        if (n60Var.l2 && n60Var.g2) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - n60Var.O1;
        n60Var.O1 = elapsedRealtime;
        if (j10 > 20) {
            j10 = 17;
        }
        long j11 = j10;
        m60 m60Var4 = n60Var.N1;
        if (m60Var4 != null) {
            m60Var4.b(0, measuredWidth, getMeasuredHeight(), j11, n60Var.O0);
        }
        eaVar7.a = AndroidUtilities.dp(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        eaVar7.b = com.google.android.gms.internal.play_billing.k3.A(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(62.0f), 0.48076922f);
        eaVar6.a = AndroidUtilities.dp(65.0f) * 0.46296296f;
        eaVar6.b = com.google.android.gms.internal.play_billing.k3.A(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(65.0f), 0.48076922f);
        float f21 = n60Var.P0;
        float f22 = n60Var.O0;
        if (f21 != f22) {
            float f23 = n60Var.Q0;
            f7 = 0.0f;
            float f24 = (j11 * f23) + f22;
            n60Var.O0 = f24;
            if (f23 > 0.0f) {
                if (f24 > f21) {
                    n60Var.O0 = f21;
                }
            } else if (f24 < f21) {
                n60Var.O0 = f21;
            }
        } else {
            f7 = 0.0f;
        }
        m60 m60Var5 = n60Var.M1;
        if (m60Var5 != null && m60Var5.i == 3) {
            radialProgressView5.H = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z10 = false;
                f11 = 1.0f;
                if (z10) {
                }
                float interpolation = (this.d.getInterpolation(n60Var.P1) * 0.6f) + 0.4f;
                eaVar6.e(n60Var.O0, 1.0f);
                eaVar7.e(n60Var.O0, 1.0f);
                if (n60Var.M1 != null) {
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f12 = 25.909092f;
                f13 = 25.0f;
                i11 = 0;
                for (i10 = 2; i11 < i10; i10 = 2) {
                }
                super.dispatchDraw(canvas);
                if (n60Var.a2.r == null) {
                }
            }
        } else if (m60Var5 != null && (m60Var = n60Var.N1) != null && m60Var.i == 3) {
            radialProgressView5.H = true;
            f10 = 1.0f;
            radialProgressView5.I = 1.0f;
            f11 = f10;
            z10 = true;
            if (z10) {
                float f25 = n60Var.L1;
                if (f25 != f11) {
                    m60 m60Var6 = n60Var.M1;
                    if (m60Var6 == null || m60Var6.i != 3) {
                        n60Var.L1 = (j11 / 180.0f) + f25;
                    } else {
                        n60Var.L1 = (j11 / 100.0f) + f25;
                    }
                    if (n60Var.L1 >= 1.0f) {
                        n60Var.L1 = 1.0f;
                        n60Var.M1 = null;
                        m60 m60Var7 = n60Var.N1;
                        if (m60Var7 != null && m60Var7.i == 3) {
                            radialProgressView5.H = false;
                        }
                    }
                    n60Var.W1 = true;
                }
                if (!n60Var.W1 || (m60Var3 = n60Var.N1) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    i12 = 3;
                    z11 = z10;
                } else {
                    n60Var.W1 = false;
                    m60 m60Var8 = n60Var.M1;
                    if (m60Var8 != null) {
                        n60.T(n60Var, m60Var8.i, iArr);
                        int i18 = iArr[0];
                        i12 = 3;
                        int i19 = iArr[1];
                        z11 = z10;
                        int i20 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i21 = iArr[3];
                        matrix = matrix3;
                        n60.T(n60Var, n60Var.N1.i, iArr);
                        paint = paint4;
                        i14 = i0.a.d(n60Var.L1, i18, iArr[0]);
                        i15 = i0.a.d(n60Var.L1, i19, iArr[1]);
                        i16 = i0.a.d(n60Var.L1, i20, iArr[2]);
                        i17 = i0.a.d(n60Var.L1, i21, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z11 = z10;
                        i12 = 3;
                        n60.T(n60Var, m60Var3.i, iArr);
                        i14 = iArr[0];
                        i15 = iArr[1];
                        i16 = iArr[2];
                        i17 = iArr[3];
                    }
                    if (this.e != i14) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{i0.a.k(i14, 60), i0.a.k(i14, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        n60Var.R0 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i14;
                    }
                    u2Var2.a(i16, i15);
                    u2Var.a(i16, i15);
                    n60Var.n.a(i16, i15);
                    n60Var.f.a(i16, i15);
                    org.telegram.ui.Components.voip.u2 u2Var4 = n60Var.s;
                    int i22 = org.telegram.ui.ActionBar.g6.Dg;
                    u2Var4.a(org.telegram.ui.ActionBar.g6.x0(null, i22, false), org.telegram.ui.ActionBar.g6.x0(null, i22, false));
                    n60Var.h.a(i15, i17);
                }
                m60 m60Var9 = n60Var.N1;
                if (m60Var9 != null) {
                    int i23 = m60Var9.i;
                    z12 = i23 == 1 || i23 == 0 || n60.q1(i23);
                    i13 = i12;
                    if (n60Var.N1.i != i13) {
                        z13 = true;
                        if (n60Var.M1 == null && (m60Var2 = n60Var.N1) != null && m60Var2.i == i13) {
                            float f26 = n60Var.P1 - (j11 / 180.0f);
                            n60Var.P1 = f26;
                            if (f26 < f7) {
                                n60Var.P1 = f7;
                            }
                        } else {
                            if (z12) {
                                float f27 = n60Var.P1;
                                if (f27 != 1.0f) {
                                    float f28 = (j11 / 350.0f) + f27;
                                    n60Var.P1 = f28;
                                    if (f28 > 1.0f) {
                                        n60Var.P1 = 1.0f;
                                    }
                                }
                            }
                            if (!z12) {
                                float f29 = n60Var.P1;
                                if (f29 != 0.0f) {
                                    float f30 = f29 - (j11 / 350.0f);
                                    n60Var.P1 = f30;
                                    if (f30 < 0.0f) {
                                        n60Var.P1 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            float f31 = n60Var.Q1;
                            if (f31 != 1.0f) {
                                float f32 = (j11 / 350.0f) + f31;
                                n60Var.Q1 = f32;
                                if (f32 > 1.0f) {
                                    n60Var.Q1 = 1.0f;
                                }
                            }
                        }
                        if (!z13) {
                            float f33 = n60Var.Q1;
                            if (f33 != 0.0f) {
                                float f34 = f33 - (j11 / 350.0f);
                                n60Var.Q1 = f34;
                                if (f34 < 0.0f) {
                                    n60Var.Q1 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i13 = i12;
                    z12 = false;
                }
                z13 = false;
                if (n60Var.M1 == null) {
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
            float interpolation2 = (this.d.getInterpolation(n60Var.P1) * 0.6f) + 0.4f;
            eaVar6.e(n60Var.O0, 1.0f);
            eaVar7.e(n60Var.O0, 1.0f);
            if (n60Var.M1 != null || n60Var.N1 == null || n60Var.s1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f12 = 25.909092f;
                f13 = 25.0f;
            } else {
                m60 m60Var10 = n60Var.N1;
                f12 = 25.909092f;
                int i24 = m60Var10.i;
                f13 = 25.0f;
                if (i24 == 3 || n60Var.M1.i == 3) {
                    if (i24 == 3) {
                        f20 = n60Var.L1;
                        paint3 = paint6;
                        paint3.setShader(n60Var.M1.g);
                        f19 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f19 = 1.0f;
                        float f35 = 1.0f - n60Var.L1;
                        paint3.setShader(m60Var10.g);
                        f20 = f35;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Kg, false), n60Var.U1, f19);
                    Paint paint7 = paint;
                    paint7.setColor(offsetColor);
                    float measuredWidth2 = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    float y3 = (int) (u2Var3.getY() + AndroidUtilities.dp(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y3);
                    n60Var.R0.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleY() * 1.0f, measuredWidth2, y3);
                    canvas.save();
                    float t10 = com.google.android.gms.internal.play_billing.k3.t(0.807f, n60Var.O0, 0.5f, 0.878f) * n60Var.Q1;
                    canvas.scale(t10, t10, measuredWidth2, y3);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y3);
                    canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (n60Var.a1 != null) {
                        canvas.save();
                        float A = com.google.android.gms.internal.play_billing.k3.A(0.807f, n60Var.O0, 0.878f, interpolation2);
                        canvas.scale(A, A, measuredWidth2, y3);
                        eaVar6.a(measuredWidth2, y3, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float A2 = com.google.android.gms.internal.play_billing.k3.A(0.704f, n60Var.O0, 0.926f, interpolation2);
                        canvas.scale(A2, A2, measuredWidth2, y3);
                        eaVar7.a(measuredWidth2, y3, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(255);
                    if (z11) {
                        canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Og, false));
                        if (f20 != 0.0f) {
                            paint3.setAlpha((int) (f20 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(25.0f) * f20, paint7);
                    if (!z11) {
                        radialProgressView.a(canvas, measuredWidth2, y3);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (n60Var.a2.r == null) {
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
            i11 = 0;
            while (i11 < i10) {
                float dp2 = AndroidUtilities.dp(f12);
                if (i11 == 0 && n60Var.M1 != null) {
                    if (!n60Var.s1()) {
                        paint2.setShader(n60Var.M1.g);
                    }
                    f15 = 1.0f - n60Var.L1;
                    if (n60Var.M1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f15;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f16 = f15;
                    f17 = dp2;
                    if (n60Var.s1()) {
                    }
                    float measuredWidth3 = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    float y10 = (int) (u2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix2.setTranslate(measuredWidth3, y10);
                    n60Var.R0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (n60Var.V0 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleX() * 1.0f, measuredWidth3, y10);
                    canvas2.save();
                    float t11 = com.google.android.gms.internal.play_billing.k3.t(n60Var.O0, 0.807f, 0.5f, 0.878f);
                    float f36 = n60Var.Q1;
                    canvas2.scale(f36 * t11, f36 * t11, measuredWidth3, y10);
                    if (i11 != 1) {
                    }
                    canvas2.restore();
                    if (!n60Var.s1()) {
                    }
                    if (n60.F3) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp3 = AndroidUtilities.dp(24.0f);
                    float f37 = (f17 - measuredWidth4) + measuredWidth4;
                    float f38 = n60Var.V0;
                    float f39 = f37 * f38;
                    float f40 = ((f17 - dp3) + dp3) * f38;
                    float f41 = measuredWidth3 + f39;
                    f14 = interpolation2;
                    eaVar = eaVar5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f39, y10 - f40, f41, y10 + f40);
                    float dp4 = (f17 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (n60Var.V0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp4, dp4, paint2);
                    if (i11 != 1) {
                    }
                    canvas2.restore();
                    if (t40Var != null) {
                        paint2.setAlpha((int) (t40Var.getAlpha() * 255.0f));
                        float x10 = t40Var.getX() - getX();
                        float y11 = t40Var.getY() - getY();
                        rectF.set(x10, y11, t40Var.getMeasuredWidth() + x10, t40Var.getMeasuredHeight() + y11);
                        canvas2.save();
                        canvas2.scale(t40Var.getScaleX(), t40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
                        canvas2.restore();
                    }
                } else if (i11 != 1) {
                    f14 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    eaVar = eaVar6;
                    eaVar2 = eaVar7;
                    rectF = rectF3;
                } else if (n60Var.N1 != null) {
                    if (!n60Var.s1()) {
                        paint2.setShader(n60Var.N1.g);
                    }
                    f15 = n60Var.L1;
                    if (n60Var.N1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f15;
                    }
                    if (paint2.getShader() == null || n60Var.s1()) {
                        f16 = f15;
                        f17 = dp2;
                    } else {
                        f16 = f15;
                        f17 = dp2;
                        paint2.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Kg, false), n60Var.U1, 1.0f));
                    }
                    if (n60Var.s1()) {
                        radialProgressView4 = radialProgressView2;
                        eaVar3 = eaVar6;
                        eaVar4 = eaVar7;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Lg, false);
                        int i25 = org.telegram.ui.ActionBar.g6.Kg;
                        radialProgressView4 = radialProgressView2;
                        int offsetColor2 = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.g6.x0(null, i25, false), n60Var.U1, 1.0f);
                        paint2.setColor(offsetColor2);
                        paint2.setShader(null);
                        int i26 = org.telegram.ui.ActionBar.g6.kg;
                        eaVar4 = eaVar7;
                        eaVar3 = eaVar6;
                        u2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, i26, false), org.telegram.ui.ActionBar.g6.x0(null, i25, false), n60Var.U1, 1.0f), offsetColor2);
                        u2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, i26, false), org.telegram.ui.ActionBar.g6.x0(null, i25, false), n60Var.U1, 1.0f), offsetColor2);
                    }
                    float measuredWidth32 = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    float y102 = (int) (u2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix2.setTranslate(measuredWidth32, y102);
                    n60Var.R0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (n60Var.V0 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleX() * 1.0f, measuredWidth32, y102);
                    canvas2.save();
                    float t112 = com.google.android.gms.internal.play_billing.k3.t(n60Var.O0, 0.807f, 0.5f, 0.878f);
                    float f362 = n60Var.Q1;
                    canvas2.scale(f362 * t112, f362 * t112, measuredWidth32, y102);
                    if (i11 != 1 && !n60Var.s1() && LiteMode.isEnabled(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y102);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - n60Var.z3.e) * n60Var.V0 * alpha));
                        canvas2.drawCircle(measuredWidth32, y102, AndroidUtilities.dp(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!n60Var.s1()) {
                        eaVar2 = eaVar4;
                        eaVar5 = eaVar3;
                    } else if (n60Var.V0 > 0.0f) {
                        canvas2.save();
                        float t12 = com.google.android.gms.internal.play_billing.k3.t(n60Var.O0, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(t12, t12, measuredWidth32, y102);
                        eaVar5 = eaVar3;
                        eaVar5.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float t13 = com.google.android.gms.internal.play_billing.k3.t(n60Var.O0, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(t13, t13, measuredWidth32, y102);
                        eaVar2 = eaVar4;
                        eaVar2.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        eaVar2 = eaVar4;
                        eaVar5 = eaVar3;
                    }
                    if (n60.F3) {
                        if (i11 == 0) {
                            paint2.setAlpha(255);
                        } else {
                            paint2.setAlpha((int) (f16 * 255.0f));
                        }
                    } else if (i11 == 0) {
                        paint2.setAlpha((int) (n60Var.W0 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (n60Var.W0 * f16 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp32 = AndroidUtilities.dp(24.0f);
                    float f372 = (f17 - measuredWidth42) + measuredWidth42;
                    float f382 = n60Var.V0;
                    float f392 = f372 * f382;
                    float f402 = ((f17 - dp32) + dp32) * f382;
                    float f412 = measuredWidth32 + f392;
                    f14 = interpolation2;
                    eaVar = eaVar5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f392, y102 - f402, f412, y102 + f402);
                    float dp42 = (f17 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (n60Var.V0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp42, dp42, paint2);
                    if (i11 != 1) {
                        f18 = 4.0f;
                        if (n60Var.N1.i == 3) {
                            if (n60Var.s1()) {
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
                        f18 = 4.0f;
                        radialProgressView3 = radialProgressView4;
                    }
                    canvas2.restore();
                    if (t40Var != null && t40Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (t40Var.getAlpha() * 255.0f));
                        float x102 = t40Var.getX() - getX();
                        float y112 = t40Var.getY() - getY();
                        rectF.set(x102, y112, t40Var.getMeasuredWidth() + x102, t40Var.getMeasuredHeight() + y112);
                        canvas2.save();
                        canvas2.scale(t40Var.getScaleX(), t40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
                        canvas2.restore();
                    }
                } else {
                    f14 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    eaVar = eaVar6;
                    eaVar2 = eaVar7;
                    rectF = rectF3;
                }
                i11++;
                rectF3 = rectF;
                eaVar7 = eaVar2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f14;
                eaVar6 = eaVar;
            }
            super.dispatchDraw(canvas);
            if (n60Var.a2.r == null) {
            }
        }
        f10 = 1.0f;
        f11 = f10;
        z10 = true;
        if (z10) {
        }
        float interpolation22 = (this.d.getInterpolation(n60Var.P1) * 0.6f) + 0.4f;
        eaVar6.e(n60Var.O0, 1.0f);
        eaVar7.e(n60Var.O0, 1.0f);
        if (n60Var.M1 != null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        radialProgressView2 = radialProgressView;
        matrix2 = matrix;
        f12 = 25.909092f;
        f13 = 25.0f;
        i11 = 0;
        while (i11 < i10) {
        }
        super.dispatchDraw(canvas);
        if (n60Var.a2.r == null) {
        }
    }
}
