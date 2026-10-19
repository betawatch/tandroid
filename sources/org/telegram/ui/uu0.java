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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class uu0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final o4 c;
    public final org.telegram.ui.Components.w9 d;
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
        o4Var.addView(textureView, w7.z5.c(-1.0f, -1));
        addView(frameLayout, w7.z5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        vu0 vu0Var = this.e;
        float[] fArr = vu0Var.m;
        wh.g gVar = vu0Var.j;
        Path path = vu0Var.l;
        if (!vu0Var.n || vu0Var.e == null || vu0Var.a == null) {
            return;
        }
        vu0Var.i();
        float left = vu0Var.o - getLeft();
        float top = vu0Var.p - getTop();
        canvas.save();
        float f10 = vu0Var.O;
        float f11 = vu0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, vu0Var.s + left, vu0Var.t + top);
        float f13 = vu0Var.J;
        float f14 = vu0Var.A;
        canvas.translate((f13 * f14) + left, (vu0Var.K * f14) + top);
        ImageReceiver imageReceiver = vu0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = vu0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                vu0Var.B = f16;
                if (f16 > 1.0f) {
                    vu0Var.B = 1.0f;
                } else {
                    vu0Var.e();
                }
            }
            vu0Var.g.setAlpha(vu0Var.B);
        }
        float f17 = vu0Var.u;
        float f18 = vu0Var.v;
        float f19 = vu0Var.w;
        float f20 = vu0Var.y;
        if (f19 == f20 && vu0Var.x == vu0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = vu0Var.z;
            float f23 = vu0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = vu0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (vu0Var.R) {
            float f26 = vu0Var.s - vu0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(vu0Var.t - vu0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((vu0Var.J * f12 * vu0Var.A) + f17 + left);
            frameLayout.setTranslationY((vu0Var.K * f12 * vu0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = vu0Var.f;
            if (imageReceiver3 != null) {
                if (vu0Var.B != f7) {
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
            rectF.set(vu0Var.f.getImageX(), vu0Var.f.getImageY(), vu0Var.f.getImageX2(), vu0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (vu0Var.k != null) {
                canvas.translate(vu0Var.f.getImageX(), vu0Var.f.getImageY());
                vu0Var.k.c(canvas, vu0Var.d, (int) vu0Var.f.getImageWidth(), (int) vu0Var.f.getImageHeight(), 1.0f, false);
            } else {
                gVar.h(i0.a.o(-1, (int) (vu0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                gVar.setBounds((int) vu0Var.f.getImageX(), (int) vu0Var.f.getImageY(), (int) vu0Var.f.getImageX2(), (int) vu0Var.f.getImageY2());
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
        float interpolation = org.telegram.ui.Components.bs.f.getInterpolation(vu0Var.P) * vu0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation == 1.0f || (su0Var = vu0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        } else {
            su0Var.b(fArr);
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
        vu0Var.c(canvas, 1.0f - interpolation, vu0Var.o - getLeft(), vu0Var.p - getTop(), f7, f10);
    }
}
