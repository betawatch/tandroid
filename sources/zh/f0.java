package zh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AnimationUtils;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Consumer {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ s b;
    public final /* synthetic */ w c;

    public /* synthetic */ f0(m0 m0Var, s sVar, w wVar) {
        this.a = m0Var;
        this.b = sVar;
        this.c = wVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        float[] fArr;
        float f7;
        Paint paint;
        float max;
        Canvas canvas;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        s sVar;
        Canvas canvas2;
        boolean z10;
        float f15;
        float f16;
        float f17;
        k0 k0Var;
        Canvas canvas3 = (Canvas) obj;
        m0 m0Var = this.a;
        float[] fArr2 = m0Var.Q;
        RectF rectF = m0Var.P;
        RectF rectF2 = m0Var.a0;
        Paint paint2 = m0Var.M;
        Paint paint3 = m0Var.H;
        int[] iArr = m0Var.K;
        Paint paint4 = m0Var.Z;
        int[] iArr2 = m0Var.J;
        Paint paint5 = m0Var.O;
        Matrix matrix = m0Var.N;
        s sVar2 = this.b;
        if (sVar2.isVerticalScrollBarEnabled()) {
            sVar2.setVerticalScrollBarEnabled(false);
        }
        if (!m0Var.X && (k0Var = m0Var.h) != null) {
            m0Var.X = true;
            m0.W(k0Var);
        }
        if (m0Var.h == null || Float.isNaN(m0Var.I)) {
            return;
        }
        sVar2.getLocationOnScreen(iArr2);
        m0Var.h.getLocationOnScreen(iArr);
        float f18 = iArr2[1] - iArr[1];
        float width = sVar2.getWidth();
        if (m0Var.R == null) {
            LinearGradient d02 = m0.d0(false);
            m0Var.R = d02;
            paint3.setShader(d02);
            fArr = fArr2;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint3.setXfermode(new PorterDuffXfermode(mode));
            LinearGradient d03 = m0.d0(true);
            m0Var.L = d03;
            paint2.setShader(d03);
            paint2.setXfermode(new PorterDuffXfermode(mode));
            paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            fArr = fArr2;
        }
        w wVar = this.c;
        wVar.getLocationOnScreen(iArr2);
        float f19 = (iArr2[1] - iArr[1]) - f18;
        float height = wVar.getHeight() + f19 + AndroidUtilities.dp(12.0f);
        c cVar = m0Var.x;
        if (cVar != null) {
            f7 = height;
            float height2 = ((f19 + f18) + wVar.getHeight()) - m0Var.V;
            paint = paint2;
            if (cVar.K != height2) {
                cVar.K = height2;
                cVar.invalidate();
            }
        } else {
            f7 = height;
            paint = paint2;
        }
        int[] iArr3 = m0Var.b0;
        wVar.getLocationOnScreen(iArr3);
        int[] iArr4 = m0Var.c0;
        sVar2.getLocationOnScreen(iArr4);
        float f20 = iArr3[0] - iArr4[0];
        rectF2.set(m0Var.T + f20, m0Var.U + f19, (f20 + wVar.getWidth()) - m0Var.T, (wVar.getHeight() + f19) - m0Var.V);
        paint5.setAlpha(255);
        canvas3.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint5);
        matrix.setScale(1.0f, f7 - f19);
        matrix.postTranslate(0.0f, f19);
        m0Var.L.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, Math.min(f19, -f18), width, f7, paint);
        float dp = AndroidUtilities.dp(10.0f);
        float f21 = (m0Var.I - f18) - dp;
        matrix.setScale(1.0f, dp);
        matrix.postTranslate(0.0f, f21);
        m0Var.R.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, f21, width, Math.max(dp + f21, AndroidUtilities.dp(200.0f) + sVar2.getHeight()), paint3);
        b1 b1Var = m0Var.d;
        float clamp01 = b1Var != null ? b1Var.g1 < 0.5f ? (-Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - b1Var.J5) / 150.0f)) - 1.0E-4f : !b1Var.K5 ? 0.0f : Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - b1Var.I5) / 470.0f) : 1.0f;
        b1 b1Var2 = m0Var.d;
        boolean z11 = b1Var2 != null && b1Var2.g1 > 0.5f;
        float clamp012 = b1Var2 != null ? Utilities.clamp01(b1Var2.f1) : 1.0f;
        float f22 = 1.0f - clamp012;
        float z12 = org.telegram.ui.Cells.t0.z(f22, f22, f22, 1.0f);
        float O0 = z11 ? m0Var.d.O0() : -1.0f;
        if (O0 >= 0.0f) {
            float f23 = 1.0f - O0;
            max = ((1.0f - ((f23 * f23) * f23)) * 0.25f) + 0.75f;
        } else {
            max = clamp012 >= 0.999f ? 1.0f : Math.max(sVar2.getScaleX(), (z12 * 0.25f) + 0.75f);
        }
        if (z11) {
            canvas = canvas3;
            f10 = 1.0f;
            f11 = Math.min(1.0f, clamp012 / 0.55f);
        } else {
            canvas = canvas3;
            f10 = 1.0f;
            f11 = 1.0f;
        }
        if (O0 >= 0.0f && O0 < f10) {
            m0Var.d.invalidate();
        }
        if (sVar2.getScaleX() != max) {
            View view = sVar2;
            float f24 = 0.0f;
            while (true) {
                f17 = f24;
                if (view == null || view == m0Var.h || !(view.getParent() instanceof View)) {
                    break;
                }
                f24 = f17 + view.getTop();
                view = (View) view.getParent();
            }
            float height3 = Float.isNaN(m0Var.I) ? sVar2.getHeight() : Math.max(0.0f, Math.min(sVar2.getHeight(), m0Var.I - f17));
            sVar2.setPivotX(sVar2.getWidth() / 2.0f);
            sVar2.setPivotY(height3);
            sVar2.setScaleX(max);
            sVar2.setScaleY(max);
        }
        if (sVar2.getAlpha() != f11) {
            sVar2.setAlpha(f11);
        }
        boolean z13 = clamp01 < 1.0f && !z11;
        if (!z11) {
            clamp012 = clamp01;
        }
        b1 b1Var3 = m0Var.d;
        if (b1Var3 == null) {
            f12 = 90.0f;
        } else {
            m0Var.W = m0Var.r - (b1Var3.D0() - AndroidUtilities.dp(8.0f));
            float translationY = wVar.getTranslationY();
            float f25 = m0Var.W;
            if (translationY != f25) {
                wVar.setTranslationY(f25);
                wVar.invalidate();
            }
            if (clamp012 < 1.0f) {
                f12 = 90.0f;
                if (clamp012 >= 0.0f) {
                    float max2 = Math.max(0.0f, Math.min(1.0f, clamp012));
                    float f26 = 1.0f - max2;
                    f13 = Math.min(1.0f, max2 / 0.35f);
                    f14 = ((1.0f - ((f26 * f26) * f26)) * 0.15f) + 0.85f;
                } else {
                    float max3 = Math.max(0.0f, Math.min(1.0f, ((-clamp012) * 150.0f) / 90.0f));
                    f14 = org.telegram.ui.Cells.t0.z(max3, 0.15f, max3, 1.0f);
                    f13 = 1.0f - max3;
                }
            } else {
                f12 = 90.0f;
                f13 = 1.0f;
                f14 = 1.0f;
            }
            if (wVar.getScaleX() != f14) {
                wVar.setPivotX(wVar.getWidth() / 2.0f);
                wVar.setPivotY(wVar.getHeight() / 2.0f);
                wVar.setScaleX(f14);
                wVar.setScaleY(f14);
                wVar.invalidate();
            }
            if (wVar.getAlpha() != f13) {
                wVar.setAlpha(f13);
            }
            if ((f14 != 1.0f || f13 != 1.0f) && (sVar = m0Var.S) != null) {
                sVar.postInvalidateOnAnimation();
            }
        }
        float f27 = -f18;
        float max4 = Math.max(0.0f, f27);
        float f28 = m0Var.I - f18;
        int i10 = 0;
        float f29 = 0.0f;
        while (i10 < sVar2.getChildCount()) {
            View childAt = sVar2.getChildAt(i10);
            if (childAt instanceof r) {
                r rVar = (r) childAt;
                z10 = z13;
                if (f29 == 0.0f) {
                    f29 = childAt.getHeight();
                }
                if (!z10 || f29 <= 0.0f) {
                    f15 = max4;
                    f16 = 1.0f;
                } else {
                    f15 = max4;
                    float max5 = Math.max(1.0f, (f28 - max4) / f29);
                    float height4 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                    if (clamp01 >= 0.0f) {
                        f16 = (b1.R(Math.max(0.0f, Math.min(1.0f, ((clamp01 * 470.0f) - (Math.max(0.0f, ((f28 - height4) / f29) - 0.5f) * Math.min(45.0f, 250.0f / max5))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                    } else {
                        float max6 = Math.max(0.0f, Math.min(1.0f, (((-clamp01) * 150.0f) - (Math.max(0.0f, ((height4 - f15) / f29) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, max5 - 1.0f)))) / f12));
                        f16 = org.telegram.ui.Cells.t0.z(max6, 0.4f, max6, 1.0f);
                    }
                }
                if (rVar.r != f16) {
                    rVar.r = f16;
                    rVar.invalidate();
                }
            } else {
                z10 = z13;
                f15 = max4;
            }
            i10++;
            z13 = z10;
            max4 = f15;
        }
        float f30 = max4;
        if (!z13 || f29 <= 0.0f) {
            canvas2 = canvas;
        } else {
            float max7 = Math.max(1.0f, (f28 - f30) / f29);
            if (m0Var.Y == null) {
                m0Var.Y = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
            }
            if (clamp01 >= 0.0f) {
                float max8 = f28 - (Math.max(-1.0f, ((clamp01 * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / max7)) * f29);
                matrix.setScale(1.0f, f29);
                matrix.postTranslate(0.0f, max8 - (f29 / 2.0f));
            } else {
                float max9 = (Math.max(-1.0f, (((-clamp01) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, max7 - 1.0f))) * f29) + f30;
                matrix.setScale(1.0f, f29);
                matrix.postTranslate(0.0f, max9 - (f29 / 2.0f));
            }
            m0Var.Y.setLocalMatrix(matrix);
            paint4.setShader(m0Var.Y);
            if (paint4.getXfermode() == null) {
                paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, width, sVar2.getHeight(), paint4);
            sVar2.invalidate();
        }
        c cVar2 = m0Var.x;
        if (cVar2 != null) {
            RectF rectF3 = cVar2.F;
            if (cVar2.x <= 0.003f || rectF3.isEmpty()) {
                return;
            }
            rectF.set(rectF3);
            fArr[0] = rectF3.height() / 2.0f;
            fArr[1] = cVar2.y;
            rectF.offset(0.0f, f27);
            paint5.setAlpha((int) (fArr[1] * 255.0f));
            float f31 = fArr[0];
            canvas2.drawRoundRect(rectF, f31, f31, paint5);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
