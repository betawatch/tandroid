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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class wu0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final o4 c;
    public final org.telegram.ui.Components.w9 d;
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
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        o4 o4Var = new o4(context);
        this.c = o4Var;
        o4Var.setBackgroundColor(0);
        frameLayout.addView(o4Var, w7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        o4Var.addView(textureView, w7.z5.d(-1.0f, -1));
        addView(frameLayout, w7.z5.d(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        xu0 xu0Var = this.e;
        float[] fArr = xu0Var.m;
        wh.g gVar = xu0Var.j;
        Path path = xu0Var.l;
        if (!xu0Var.n || xu0Var.e == null || xu0Var.a == null) {
            return;
        }
        xu0Var.i();
        float left = xu0Var.o - getLeft();
        float top = xu0Var.p - getTop();
        canvas.save();
        float f10 = xu0Var.O;
        float f11 = xu0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, xu0Var.s + left, xu0Var.t + top);
        float f13 = xu0Var.J;
        float f14 = xu0Var.A;
        canvas.translate((f13 * f14) + left, (xu0Var.K * f14) + top);
        ImageReceiver imageReceiver = xu0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = xu0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                xu0Var.B = f16;
                if (f16 > 1.0f) {
                    xu0Var.B = 1.0f;
                } else {
                    xu0Var.e();
                }
            }
            xu0Var.g.setAlpha(xu0Var.B);
        }
        float f17 = xu0Var.u;
        float f18 = xu0Var.v;
        float f19 = xu0Var.w;
        float f20 = xu0Var.y;
        if (f19 == f20 && xu0Var.x == xu0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = xu0Var.z;
            float f23 = xu0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = xu0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (xu0Var.R) {
            float f26 = xu0Var.s - xu0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(xu0Var.t - xu0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((xu0Var.J * f12 * xu0Var.A) + f17 + left);
            frameLayout.setTranslationY((xu0Var.K * f12 * xu0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = xu0Var.f;
            if (imageReceiver3 != null) {
                if (xu0Var.B != f7) {
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
            float f27 = roundRadius[0];
            fArr[1] = f27;
            fArr[0] = f27;
            float f28 = roundRadius[1];
            fArr[3] = f28;
            fArr[2] = f28;
            float f29 = roundRadius[2];
            fArr[5] = f29;
            fArr[4] = f29;
            float f30 = roundRadius[3];
            fArr[7] = f30;
            fArr[6] = f30;
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
                gVar.h(i0.b.o(-1, (int) (xu0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                gVar.setBounds((int) xu0Var.f.getImageX(), (int) xu0Var.f.getImageY(), (int) xu0Var.f.getImageX2(), (int) xu0Var.f.getImageY2());
                gVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
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
        float interpolation = org.telegram.ui.Components.bs.f.getInterpolation(xu0Var.P) * xu0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation == 1.0f || (uu0Var = xu0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        } else {
            uu0Var.b(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f10 = measuredHeight2;
            f7 = f14;
        }
        xu0Var.c(canvas, 1.0f - interpolation, xu0Var.o - getLeft(), xu0Var.p - getTop(), f7, f10);
    }
}
