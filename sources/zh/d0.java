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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Consumer {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ m b;
    public final /* synthetic */ q c;

    public /* synthetic */ d0(n0 n0Var, m mVar, q qVar) {
        this.a = n0Var;
        this.b = mVar;
        this.c = qVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        int[] iArr;
        int[] iArr2;
        float f7;
        float f10;
        float f11;
        float max;
        RectF rectF;
        float f12;
        float f13;
        float f14;
        Paint paint;
        int[] iArr3;
        Paint paint2;
        Canvas canvas;
        float f15;
        Canvas canvas2;
        float f16;
        float f17;
        float f18;
        m mVar;
        Canvas canvas3 = (Canvas) obj;
        n0 n0Var = this.a;
        int[] iArr4 = n0Var.U;
        int[] iArr5 = n0Var.T;
        float[] fArr = n0Var.S;
        RectF rectF2 = n0Var.R;
        RectF rectF3 = n0Var.h0;
        Paint paint3 = n0Var.O;
        Paint paint4 = n0Var.J;
        int[] iArr6 = n0Var.M;
        Paint paint5 = n0Var.g0;
        int[] iArr7 = n0Var.L;
        Paint paint6 = n0Var.Q;
        Matrix matrix = n0Var.P;
        m mVar2 = this.b;
        if (mVar2.isVerticalScrollBarEnabled()) {
            mVar2.setVerticalScrollBarEnabled(false);
        }
        if (n0Var.e0) {
            iArr = iArr4;
        } else {
            iArr = iArr4;
            k0 k0Var = n0Var.h;
            if (k0Var != null) {
                n0Var.e0 = true;
                n0.X(k0Var);
            }
        }
        if (n0Var.h == null || Float.isNaN(n0Var.K)) {
            return;
        }
        c1 c1Var = n0Var.d;
        if (c1Var != null) {
            f7 = 1.0f;
            if (c1Var.g1 < 0.5f) {
                iArr2 = iArr5;
                f10 = (-Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - c1Var.e6) / 150.0f)) - 1.0E-4f;
            } else {
                iArr2 = iArr5;
                f10 = !c1Var.f6 ? 0.0f : Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - c1Var.d6) / 470.0f);
            }
        } else {
            iArr2 = iArr5;
            f7 = 1.0f;
            f10 = 1.0f;
        }
        c1 c1Var2 = n0Var.d;
        int[] iArr8 = iArr2;
        boolean z10 = c1Var2 != null && c1Var2.g1 > 0.5f;
        float clamp01 = c1Var2 != null ? Utilities.clamp01(c1Var2.f1) : f7;
        float f19 = f7 - clamp01;
        boolean z11 = z10;
        float x10 = org.telegram.ui.Cells.b1.x(f19, f19, f19, f7);
        float V0 = z11 ? n0Var.d.V0() : -1.0f;
        if (V0 >= 0.0f) {
            float f20 = f7 - V0;
            max = ((f7 - ((f20 * f20) * f20)) * 0.25f) + 0.75f;
            f11 = V0;
        } else if (clamp01 >= 0.999f) {
            f11 = V0;
            max = 1.0f;
        } else {
            f11 = V0;
            max = Math.max(mVar2.getScaleX(), (0.25f * x10) + 0.75f);
        }
        if (z11) {
            rectF = rectF2;
            f12 = 1.0f;
            f13 = Math.min(1.0f, clamp01 / 0.55f);
        } else {
            rectF = rectF2;
            f12 = 1.0f;
            f13 = 1.0f;
        }
        if (V0 < 0.0f || f11 >= f12) {
            f14 = f12;
        } else {
            f14 = f12;
            n0Var.d.invalidate();
        }
        if (max < f14) {
            mVar2.postInvalidateOnAnimation();
        }
        if (mVar2.getScaleX() != max) {
            View view = mVar2;
            float f21 = 0.0f;
            while (true) {
                paint = paint5;
                if (view == null || view == n0Var.h || !(view.getParent() instanceof View)) {
                    break;
                }
                f21 += view.getTop();
                view = (View) view.getParent();
                paint5 = paint;
            }
            float height = Float.isNaN(n0Var.K) ? mVar2.getHeight() : Math.max(0.0f, Math.min(mVar2.getHeight(), n0Var.K - f21));
            mVar2.setPivotX(mVar2.getWidth() / 2.0f);
            mVar2.setPivotY(height);
            mVar2.setScaleX(max);
            mVar2.setScaleY(max);
        } else {
            paint = paint5;
        }
        if (mVar2.getAlpha() != f13) {
            mVar2.setAlpha(f13);
        }
        mVar2.getLocationOnScreen(iArr7);
        n0Var.h.getLocationOnScreen(iArr6);
        float f22 = iArr7[1] - iArr6[1];
        float scaleY = mVar2.getScaleY() > 0.01f ? mVar2.getScaleY() : 1.0f;
        float width = mVar2.getWidth();
        if (n0Var.V == null) {
            LinearGradient e02 = n0.e0(false);
            n0Var.V = e02;
            paint4.setShader(e02);
            iArr3 = iArr6;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint4.setXfermode(new PorterDuffXfermode(mode));
            LinearGradient e03 = n0.e0(true);
            n0Var.N = e03;
            paint3.setShader(e03);
            paint3.setXfermode(new PorterDuffXfermode(mode));
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            iArr3 = iArr6;
        }
        q qVar = this.c;
        qVar.getLocationOnScreen(iArr7);
        float f23 = iArr7[1] - iArr3[1];
        float f24 = (f23 - f22) / scaleY;
        float dp = ((AndroidUtilities.dp(12.0f) + qVar.getHeight()) / scaleY) + f24;
        c cVar = n0Var.x;
        if (cVar != null) {
            float height2 = (f23 + qVar.getHeight()) - n0Var.c0;
            paint2 = paint3;
            if (cVar.K != height2) {
                cVar.K = height2;
                cVar.invalidate();
            }
        } else {
            paint2 = paint3;
        }
        qVar.getLocationOnScreen(n0Var.i0);
        mVar2.getLocationOnScreen(n0Var.j0);
        float scaleX = (r0[0] - r3[0]) / mVar2.getScaleX();
        rectF3.set((n0Var.a0 / scaleY) + scaleX, (n0Var.b0 / scaleY) + f24, ((qVar.getWidth() - n0Var.a0) / scaleY) + scaleX, ((qVar.getHeight() - n0Var.c0) / scaleY) + f24);
        paint6.setAlpha(255);
        canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
        matrix.setScale(1.0f, dp - f24);
        matrix.postTranslate(0.0f, f24);
        n0Var.N.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, Math.min(f24, (-f22) / scaleY), width, dp, paint2);
        float dp2 = AndroidUtilities.dp(10.0f);
        float f25 = ((n0Var.K - f22) - dp2) / scaleY;
        float f26 = dp2 / scaleY;
        matrix.setScale(1.0f, f26);
        matrix.postTranslate(0.0f, f25);
        n0Var.V.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, f25, width, Math.max(f26 + f25, AndroidUtilities.dp(200.0f) + mVar2.getHeight()), paint4);
        boolean z12 = f10 < 1.0f && !z11;
        float f27 = z11 ? clamp01 : f10;
        c1 c1Var3 = n0Var.d;
        float f28 = 90.0f;
        if (c1Var3 != null) {
            n0Var.d0 = n0Var.r - (c1Var3.H0() - AndroidUtilities.dp(8.0f));
            float translationY = qVar.getTranslationY();
            float f29 = n0Var.d0;
            if (translationY != f29) {
                qVar.setTranslationY(f29);
                qVar.invalidate();
            }
            if (f27 >= 1.0f) {
                f17 = 1.0f;
                f18 = 1.0f;
            } else if (f27 >= 0.0f) {
                float max2 = Math.max(0.0f, Math.min(1.0f, f27));
                float f30 = 1.0f - max2;
                f17 = Math.min(1.0f, max2 / 0.35f);
                f18 = ((1.0f - ((f30 * f30) * f30)) * 0.15f) + 0.85f;
            } else {
                float max3 = Math.max(0.0f, Math.min(1.0f, ((-f27) * 150.0f) / 90.0f));
                f18 = org.telegram.ui.Cells.b1.x(max3, 0.15f, max3, 1.0f);
                f17 = 1.0f - max3;
            }
            if (qVar.getScaleX() != f18) {
                qVar.setPivotX(qVar.getWidth() / 2.0f);
                qVar.setPivotY(qVar.getHeight() / 2.0f);
                qVar.setScaleX(f18);
                qVar.setScaleY(f18);
                qVar.invalidate();
            }
            if (qVar.getAlpha() != f17) {
                qVar.setAlpha(f17);
            }
            if ((f18 != 1.0f || f17 != 1.0f) && (mVar = n0Var.Z) != null) {
                mVar.postInvalidateOnAnimation();
            }
        }
        float max4 = Math.max(0.0f, -f22);
        float f31 = n0Var.K - f22;
        int i10 = 0;
        float f32 = 0.0f;
        while (true) {
            float f33 = f28;
            if (i10 >= mVar2.getChildCount()) {
                break;
            }
            View childAt = mVar2.getChildAt(i10);
            if (childAt instanceof l) {
                l lVar = (l) childAt;
                if (f32 == 0.0f) {
                    f32 = childAt.getHeight();
                }
                if (!z12 || f32 <= 0.0f) {
                    canvas2 = canvas3;
                    f16 = 1.0f;
                } else {
                    float max5 = Math.max(1.0f, (f31 - max4) / f32);
                    float height3 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                    if (f10 >= 0.0f) {
                        canvas2 = canvas3;
                        f16 = (c1.S(Math.max(0.0f, Math.min(1.0f, ((f10 * 470.0f) - (Math.max(0.0f, ((f31 - height3) / f32) - 0.5f) * Math.min(45.0f, 250.0f / max5))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                    } else {
                        canvas2 = canvas3;
                        float max6 = Math.max(0.0f, Math.min(1.0f, (((-f10) * 150.0f) - (Math.max(0.0f, ((height3 - max4) / f32) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, max5 - 1.0f)))) / f33));
                        f16 = org.telegram.ui.Cells.b1.x(max6, 0.4f, max6, 1.0f);
                    }
                }
                if (lVar.r != f16) {
                    lVar.r = f16;
                    lVar.invalidate();
                }
            } else {
                canvas2 = canvas3;
            }
            i10++;
            f28 = f33;
            canvas3 = canvas2;
        }
        Canvas canvas4 = canvas3;
        if (!z12 || f32 <= 0.0f) {
            canvas = canvas4;
            f15 = 1.0f;
        } else {
            float max7 = Math.max(1.0f, (f31 - max4) / f32);
            if (n0Var.f0 == null) {
                n0Var.f0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
            }
            if (f10 >= 0.0f) {
                float max8 = f31 - (Math.max(-1.0f, ((f10 * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / max7)) * f32);
                f15 = 1.0f;
                matrix.setScale(1.0f, f32);
                matrix.postTranslate(0.0f, max8 - (f32 / 2.0f));
            } else {
                f15 = 1.0f;
                float max9 = (Math.max(-1.0f, (((-f10) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, max7 - 1.0f))) * f32) + max4;
                matrix.setScale(1.0f, f32);
                matrix.postTranslate(0.0f, max9 - (f32 / 2.0f));
            }
            n0Var.f0.setLocalMatrix(matrix);
            Paint paint7 = paint;
            paint7.setShader(n0Var.f0);
            if (paint7.getXfermode() == null) {
                paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
            canvas = canvas4;
            canvas.drawRect(0.0f, 0.0f, width, mVar2.getHeight(), paint7);
            mVar2.invalidate();
        }
        c cVar2 = n0Var.x;
        if (cVar2 != null) {
            RectF rectF4 = cVar2.F;
            if (cVar2.x <= 0.003f || rectF4.isEmpty()) {
                return;
            }
            RectF rectF5 = rectF;
            rectF5.set(rectF4);
            fArr[0] = rectF4.height() / 2.0f;
            fArr[1] = cVar2.y;
            n0Var.x.getLocationOnScreen(iArr8);
            int[] iArr9 = iArr;
            mVar2.getLocationOnScreen(iArr9);
            float scaleX2 = mVar2.getScaleX() > 0.01f ? mVar2.getScaleX() : f15;
            if (mVar2.getScaleY() > 0.01f) {
                f15 = mVar2.getScaleY();
            }
            float f34 = iArr8[0] - iArr9[0];
            float f35 = iArr8[1] - iArr9[1];
            rectF5.set((rectF5.left + f34) / scaleX2, (rectF5.top + f35) / f15, (rectF5.right + f34) / scaleX2, (rectF5.bottom + f35) / f15);
            fArr[0] = fArr[0] / f15;
            paint6.setAlpha((int) (fArr[1] * 255.0f));
            float f36 = fArr[0];
            canvas.drawRoundRect(rectF5, f36, f36, paint6);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
