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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class xu0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final n4 c;
    public final org.telegram.ui.Components.w9 d;
    public final /* synthetic */ yu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(yu0 yu0Var, Context context) {
        super(context);
        this.e = yu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new wu0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        n4 n4Var = new n4(context);
        this.c = n4Var;
        n4Var.setBackgroundColor(0);
        frameLayout.addView(n4Var, w7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        n4Var.addView(textureView, w7.z5.c(-1.0f, -1));
        addView(frameLayout, w7.z5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        yu0 yu0Var = this.e;
        float[] fArr = yu0Var.m;
        wh.g gVar = yu0Var.j;
        Path path = yu0Var.l;
        if (!yu0Var.n || yu0Var.e == null || yu0Var.a == null) {
            return;
        }
        yu0Var.i();
        float left = yu0Var.o - getLeft();
        float top = yu0Var.p - getTop();
        canvas.save();
        float f10 = yu0Var.O;
        float f11 = yu0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, yu0Var.s + left, yu0Var.t + top);
        float f13 = yu0Var.J;
        float f14 = yu0Var.A;
        canvas.translate((f13 * f14) + left, (yu0Var.K * f14) + top);
        ImageReceiver imageReceiver = yu0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = yu0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                yu0Var.B = f16;
                if (f16 > 1.0f) {
                    yu0Var.B = 1.0f;
                } else {
                    yu0Var.e();
                }
            }
            yu0Var.g.setAlpha(yu0Var.B);
        }
        float f17 = yu0Var.u;
        float f18 = yu0Var.v;
        float f19 = yu0Var.w;
        float f20 = yu0Var.y;
        if (f19 == f20 && yu0Var.x == yu0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = yu0Var.z;
            float f23 = yu0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = yu0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (yu0Var.R) {
            float f26 = yu0Var.s - yu0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(yu0Var.t - yu0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((yu0Var.J * f12 * yu0Var.A) + f17 + left);
            frameLayout.setTranslationY((yu0Var.K * f12 * yu0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = yu0Var.f;
            if (imageReceiver3 != null) {
                if (yu0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || yu0Var.f.getAnimation() != null || yu0Var.g.getLottieAnimation() != null || yu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    yu0Var.f.draw(canvas);
                    yu0Var.g.setImageCoords(yu0Var.f.getImageX(), yu0Var.f.getImageY(), yu0Var.f.getImageWidth(), yu0Var.f.getImageHeight());
                    yu0Var.g.draw(canvas);
                } else {
                    yu0Var.g.setImageCoords(imageReceiver3.getImageX(), yu0Var.f.getImageY(), yu0Var.f.getImageWidth(), yu0Var.f.getImageHeight());
                    yu0Var.g.draw(canvas);
                    if (yu0Var.g.getLottieAnimation() != null || yu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (yu0Var.i) {
            yu0Var.h.setAlpha(yu0Var.f.getAlpha());
            yu0Var.h.setRoundRadius(yu0Var.f.getRoundRadius(true));
            yu0Var.h.setImageCoords(yu0Var.f.getImageX(), yu0Var.f.getImageY(), yu0Var.f.getImageWidth(), yu0Var.f.getImageHeight());
            yu0Var.h.draw(canvas);
            int[] roundRadius = yu0Var.f.getRoundRadius(true);
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
            rectF.set(yu0Var.f.getImageX(), yu0Var.f.getImageY(), yu0Var.f.getImageX2(), yu0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (yu0Var.k != null) {
                canvas.translate(yu0Var.f.getImageX(), yu0Var.f.getImageY());
                yu0Var.k.c(canvas, yu0Var.d, (int) yu0Var.f.getImageWidth(), (int) yu0Var.f.getImageHeight(), 1.0f, false);
            } else {
                gVar.h(i0.a.o(-1, (int) (yu0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                gVar.setBounds((int) yu0Var.f.getImageX(), (int) yu0Var.f.getImageY(), (int) yu0Var.f.getImageX2(), (int) yu0Var.f.getImageY2());
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
        vu0 vu0Var;
        yu0 yu0Var = this.e;
        float[] fArr = yu0Var.Q;
        if (yu0Var.C == null) {
            float f11 = yu0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                yu0Var.P = f12;
                if (f12 > 1.0f) {
                    yu0Var.P = 1.0f;
                } else {
                    yu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.bs.f.getInterpolation(yu0Var.P) * yu0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation == 1.0f || (vu0Var = yu0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        } else {
            vu0Var.b(fArr);
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
        yu0Var.c(canvas, 1.0f - interpolation, yu0Var.o - getLeft(), yu0Var.p - getTop(), f7, f10);
    }
}
