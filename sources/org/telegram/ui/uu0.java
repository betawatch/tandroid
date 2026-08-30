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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uu0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final o4 c;
    public final org.telegram.ui.Components.p9 d;
    public final /* synthetic */ vu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(vu0 vu0Var, Context context) {
        super(context);
        this.e = vu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new tu0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        frameLayout.addView(p9Var);
        frameLayout.setWillNotDraw(false);
        o4 o4Var = new o4(context);
        this.c = o4Var;
        o4Var.setBackgroundColor(0);
        frameLayout.addView(o4Var, k7.b6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        o4Var.addView(textureView, k7.b6.c(-1.0f, -1));
        addView(frameLayout, k7.b6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        vu0 vu0Var = this.e;
        float[] fArr = vu0Var.m;
        ih.k kVar = vu0Var.j;
        Path path = vu0Var.l;
        if (!vu0Var.n || vu0Var.e == null || vu0Var.a == null) {
            return;
        }
        vu0Var.i();
        float left = vu0Var.o - getLeft();
        float top = vu0Var.p - getTop();
        canvas.save();
        float f11 = vu0Var.O;
        float f12 = vu0Var.A;
        float f13 = ((f11 * f12) + 1.0f) - f12;
        canvas.scale(f13, f13, vu0Var.s + left, vu0Var.t + top);
        float f14 = vu0Var.J;
        float f15 = vu0Var.A;
        canvas.translate((f14 * f15) + left, (vu0Var.K * f15) + top);
        ImageReceiver imageReceiver = vu0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f16 = vu0Var.B;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                vu0Var.B = f17;
                if (f17 > 1.0f) {
                    vu0Var.B = 1.0f;
                } else {
                    vu0Var.e();
                }
            }
            vu0Var.g.setAlpha(vu0Var.B);
        }
        float f18 = vu0Var.u;
        float f19 = vu0Var.v;
        float f20 = vu0Var.w;
        float f21 = vu0Var.y;
        if (f20 == f21 && vu0Var.x == vu0Var.z) {
            f10 = 1.0f;
        } else {
            float f22 = f13 < 1.0f ? 0.0f : f13 < 1.4f ? (f13 - 1.0f) / 0.4f : 1.0f;
            f10 = 1.0f;
            float f23 = vu0Var.z;
            float f24 = vu0Var.x;
            float f25 = ((f23 - f24) / 2.0f) * f22;
            f18 -= f25;
            float f26 = ((f21 - f20) / 2.0f) * f22;
            f19 -= f26;
            ImageReceiver imageReceiver2 = vu0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f18, f19, (f25 * 2.0f) + f24, (f26 * 2.0f) + f20);
            }
        }
        if (vu0Var.R) {
            float f27 = vu0Var.s - vu0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f27);
            frameLayout.setPivotY(vu0Var.t - vu0Var.v);
            frameLayout.setScaleY(f13);
            frameLayout.setScaleX(f13);
            frameLayout.setTranslationX((vu0Var.J * f13 * vu0Var.A) + f18 + left);
            frameLayout.setTranslationY((vu0Var.K * f13 * vu0Var.A) + f19 + top);
        } else {
            ImageReceiver imageReceiver3 = vu0Var.f;
            if (imageReceiver3 != null) {
                if (vu0Var.B != f10) {
                    if (imageReceiver3.getLottieAnimation() != null || vu0Var.f.getAnimation() != null || vu0Var.g.getLottieAnimation() != null || vu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    vu0Var.f.draw(canvas);
                    vu0Var.g.setImageCoords(vu0Var.f.getImageX(), vu0Var.f.getImageY(), vu0Var.f.getImageWidth(), vu0Var.f.getImageHeight());
                    vu0Var.g.draw(canvas);
                } else {
                    vu0Var.g.setImageCoords(imageReceiver3.getImageX(), vu0Var.f.getImageY(), vu0Var.f.getImageWidth(), vu0Var.f.getImageHeight());
                    vu0Var.g.draw(canvas);
                    if (vu0Var.g.getLottieAnimation() != null || vu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (vu0Var.i) {
            vu0Var.h.setAlpha(vu0Var.f.getAlpha());
            vu0Var.h.setRoundRadius(vu0Var.f.getRoundRadius(true));
            vu0Var.h.setImageCoords(vu0Var.f.getImageX(), vu0Var.f.getImageY(), vu0Var.f.getImageWidth(), vu0Var.f.getImageHeight());
            vu0Var.h.draw(canvas);
            int[] roundRadius = vu0Var.f.getRoundRadius(true);
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
            rectF.set(vu0Var.f.getImageX(), vu0Var.f.getImageY(), vu0Var.f.getImageX2(), vu0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (vu0Var.k != null) {
                canvas.translate(vu0Var.f.getImageX(), vu0Var.f.getImageY());
                vu0Var.k.c(canvas, vu0Var.d, (int) vu0Var.f.getImageWidth(), (int) vu0Var.f.getImageHeight(), 1.0f, false);
            } else {
                kVar.h(i0.a.k(-1, (int) (vu0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                kVar.setBounds((int) vu0Var.f.getImageX(), (int) vu0Var.f.getImageY(), (int) vu0Var.f.getImageX2(), (int) vu0Var.f.getImageY2());
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
        su0 su0Var;
        vu0 vu0Var = this.e;
        float[] fArr = vu0Var.Q;
        if (vu0Var.C == null) {
            float f11 = vu0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                vu0Var.P = f12;
                if (f12 > 1.0f) {
                    vu0Var.P = 1.0f;
                } else {
                    vu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.nr.f.getInterpolation(vu0Var.P) * vu0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation == 1.0f || (su0Var = vu0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f10 = measuredHeight;
        } else {
            su0Var.c(fArr);
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
        vu0Var.c(canvas, 1.0f - interpolation, vu0Var.o - getLeft(), vu0Var.p - getTop(), f13, f10);
    }
}
