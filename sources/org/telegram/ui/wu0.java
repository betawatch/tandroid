package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wu0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final o4 c;
    public final org.telegram.ui.Components.p9 d;
    public final /* synthetic */ xu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu0(xu0 xu0Var, Context context) {
        super(context);
        this.e = xu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new vu0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        frameLayout.addView(p9Var);
        frameLayout.setWillNotDraw(false);
        o4 o4Var = new o4(context);
        this.c = o4Var;
        o4Var.setBackgroundColor(0);
        frameLayout.addView(o4Var, k7.c6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        o4Var.addView(textureView, k7.c6.c(-1.0f, -1));
        addView(frameLayout, k7.c6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        xu0 xu0Var = this.e;
        float[] fArr = xu0Var.m;
        jh.k kVar = xu0Var.j;
        Path path = xu0Var.l;
        if (!xu0Var.n || xu0Var.e == null || xu0Var.a == null) {
            return;
        }
        xu0Var.i();
        float left = xu0Var.o - getLeft();
        float top = xu0Var.p - getTop();
        canvas.save();
        float f11 = xu0Var.O;
        float f12 = xu0Var.A;
        float f13 = ((f11 * f12) + 1.0f) - f12;
        canvas.scale(f13, f13, xu0Var.s + left, xu0Var.t + top);
        float f14 = xu0Var.J;
        float f15 = xu0Var.A;
        canvas.translate((f14 * f15) + left, (xu0Var.K * f15) + top);
        ImageReceiver imageReceiver = xu0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f16 = xu0Var.B;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                xu0Var.B = f17;
                if (f17 > 1.0f) {
                    xu0Var.B = 1.0f;
                } else {
                    xu0Var.e();
                }
            }
            xu0Var.g.setAlpha(xu0Var.B);
        }
        float f18 = xu0Var.u;
        float f19 = xu0Var.v;
        float f20 = xu0Var.w;
        float f21 = xu0Var.y;
        if (f20 == f21 && xu0Var.x == xu0Var.z) {
            f10 = 1.0f;
        } else {
            float f22 = f13 < 1.0f ? 0.0f : f13 < 1.4f ? (f13 - 1.0f) / 0.4f : 1.0f;
            f10 = 1.0f;
            float f23 = xu0Var.z;
            float f24 = xu0Var.x;
            float f25 = ((f23 - f24) / 2.0f) * f22;
            f18 -= f25;
            float f26 = ((f21 - f20) / 2.0f) * f22;
            f19 -= f26;
            ImageReceiver imageReceiver2 = xu0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f18, f19, (f25 * 2.0f) + f24, (f26 * 2.0f) + f20);
            }
        }
        if (xu0Var.R) {
            float f27 = xu0Var.s - xu0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f27);
            frameLayout.setPivotY(xu0Var.t - xu0Var.v);
            frameLayout.setScaleY(f13);
            frameLayout.setScaleX(f13);
            frameLayout.setTranslationX((xu0Var.J * f13 * xu0Var.A) + f18 + left);
            frameLayout.setTranslationY((xu0Var.K * f13 * xu0Var.A) + f19 + top);
        } else {
            ImageReceiver imageReceiver3 = xu0Var.f;
            if (imageReceiver3 != null) {
                if (xu0Var.B != f10) {
                    if (imageReceiver3.getLottieAnimation() != null || xu0Var.f.getAnimation() != null || xu0Var.g.getLottieAnimation() != null || xu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    xu0Var.f.draw(canvas);
                    xu0Var.g.setImageCoords(xu0Var.f.getImageX(), xu0Var.f.getImageY(), xu0Var.f.getImageWidth(), xu0Var.f.getImageHeight());
                    xu0Var.g.draw(canvas);
                } else {
                    xu0Var.g.setImageCoords(imageReceiver3.getImageX(), xu0Var.f.getImageY(), xu0Var.f.getImageWidth(), xu0Var.f.getImageHeight());
                    xu0Var.g.draw(canvas);
                    if (xu0Var.g.getLottieAnimation() != null || xu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (xu0Var.i) {
            xu0Var.h.setAlpha(xu0Var.f.getAlpha());
            xu0Var.h.setRoundRadius(xu0Var.f.getRoundRadius(true));
            xu0Var.h.setImageCoords(xu0Var.f.getImageX(), xu0Var.f.getImageY(), xu0Var.f.getImageWidth(), xu0Var.f.getImageHeight());
            xu0Var.h.draw(canvas);
            int[] roundRadius = xu0Var.f.getRoundRadius(true);
            float f28 = roundRadius[0];
            fArr[1] = f28;
            fArr[0] = f28;
            float f29 = roundRadius[1];
            fArr[3] = f29;
            fArr[2] = f29;
            float f30 = roundRadius[2];
            fArr[5] = f30;
            fArr[4] = f30;
            float f31 = roundRadius[3];
            fArr[7] = f31;
            fArr[6] = f31;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(xu0Var.f.getImageX(), xu0Var.f.getImageY(), xu0Var.f.getImageX2(), xu0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (xu0Var.k != null) {
                canvas.translate(xu0Var.f.getImageX(), xu0Var.f.getImageY());
                xu0Var.k.c(canvas, xu0Var.d, (int) xu0Var.f.getImageWidth(), (int) xu0Var.f.getImageHeight(), 1.0f, false);
            } else {
                kVar.h(i0.a.k(-1, (int) (xu0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                kVar.setBounds((int) xu0Var.f.getImageX(), (int) xu0Var.f.getImageY(), (int) xu0Var.f.getImageX2(), (int) xu0Var.f.getImageY2());
                kVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        uu0 uu0Var;
        xu0 xu0Var = this.e;
        float[] fArr = xu0Var.Q;
        if (xu0Var.C == null) {
            float f11 = xu0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                xu0Var.P = f12;
                if (f12 > 1.0f) {
                    xu0Var.P = 1.0f;
                } else {
                    xu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.pr.f.getInterpolation(xu0Var.P) * xu0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation == 1.0f || (uu0Var = xu0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f10 = measuredHeight;
        } else {
            uu0Var.c(fArr);
            canvas.save();
            float f14 = 1.0f - interpolation;
            float f15 = fArr[0] * f14;
            float measuredHeight2 = (fArr[1] * f14) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f15, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f10 = measuredHeight2;
            f13 = f15;
        }
        xu0Var.c(canvas, 1.0f - interpolation, xu0Var.o - getLeft(), xu0Var.p - getTop(), f13, f10);
    }
}
