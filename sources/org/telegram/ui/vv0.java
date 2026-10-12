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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class vv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final n4 c;
    public final org.telegram.ui.Components.z9 d;
    public final /* synthetic */ wv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv0(wv0 wv0Var, Context context) {
        super(context);
        this.e = wv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new uv0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        frameLayout.addView(z9Var);
        frameLayout.setWillNotDraw(false);
        n4 n4Var = new n4(context);
        this.c = n4Var;
        n4Var.setBackgroundColor(0);
        frameLayout.addView(n4Var, w7.a6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        n4Var.addView(textureView, w7.a6.d(-1.0f, -1));
        addView(frameLayout, w7.a6.d(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        wv0 wv0Var = this.e;
        float[] fArr = wv0Var.m;
        wh.g gVar = wv0Var.j;
        Path path = wv0Var.l;
        if (!wv0Var.n || wv0Var.e == null || wv0Var.a == null) {
            return;
        }
        wv0Var.i();
        float left = wv0Var.o - getLeft();
        float top = wv0Var.p - getTop();
        canvas.save();
        float f10 = wv0Var.O;
        float f11 = wv0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, wv0Var.s + left, wv0Var.t + top);
        float f13 = wv0Var.J;
        float f14 = wv0Var.A;
        canvas.translate((f13 * f14) + left, (wv0Var.K * f14) + top);
        ImageReceiver imageReceiver = wv0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = wv0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                wv0Var.B = f16;
                if (f16 > 1.0f) {
                    wv0Var.B = 1.0f;
                } else {
                    wv0Var.e();
                }
            }
            wv0Var.g.setAlpha(wv0Var.B);
        }
        float f17 = wv0Var.u;
        float f18 = wv0Var.v;
        float f19 = wv0Var.w;
        float f20 = wv0Var.y;
        if (f19 == f20 && wv0Var.x == wv0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = wv0Var.z;
            float f23 = wv0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = wv0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (wv0Var.R) {
            float f26 = wv0Var.s - wv0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(wv0Var.t - wv0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((wv0Var.J * f12 * wv0Var.A) + f17 + left);
            frameLayout.setTranslationY((wv0Var.K * f12 * wv0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = wv0Var.f;
            if (imageReceiver3 != null) {
                if (wv0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || wv0Var.f.getAnimation() != null || wv0Var.g.getLottieAnimation() != null || wv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    wv0Var.f.draw(canvas);
                    wv0Var.g.setImageCoords(wv0Var.f.getImageX(), wv0Var.f.getImageY(), wv0Var.f.getImageWidth(), wv0Var.f.getImageHeight());
                    wv0Var.g.draw(canvas);
                } else {
                    wv0Var.g.setImageCoords(imageReceiver3.getImageX(), wv0Var.f.getImageY(), wv0Var.f.getImageWidth(), wv0Var.f.getImageHeight());
                    wv0Var.g.draw(canvas);
                    if (wv0Var.g.getLottieAnimation() != null || wv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (wv0Var.i) {
            wv0Var.h.setAlpha(wv0Var.f.getAlpha());
            wv0Var.h.setRoundRadius(wv0Var.f.getRoundRadius(true));
            wv0Var.h.setImageCoords(wv0Var.f.getImageX(), wv0Var.f.getImageY(), wv0Var.f.getImageWidth(), wv0Var.f.getImageHeight());
            wv0Var.h.draw(canvas);
            int[] roundRadius = wv0Var.f.getRoundRadius(true);
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
            rectF.set(wv0Var.f.getImageX(), wv0Var.f.getImageY(), wv0Var.f.getImageX2(), wv0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (wv0Var.k != null) {
                canvas.translate(wv0Var.f.getImageX(), wv0Var.f.getImageY());
                wv0Var.k.c(canvas, wv0Var.d, (int) wv0Var.f.getImageWidth(), (int) wv0Var.f.getImageHeight(), 1.0f, false);
            } else {
                gVar.h(i0.a.k(-1, (int) (wv0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                gVar.setBounds((int) wv0Var.f.getImageX(), (int) wv0Var.f.getImageY(), (int) wv0Var.f.getImageX2(), (int) wv0Var.f.getImageY2());
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
        tv0 tv0Var;
        wv0 wv0Var = this.e;
        float[] fArr = wv0Var.Q;
        if (wv0Var.C == null) {
            float f11 = wv0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                wv0Var.P = f12;
                if (f12 > 1.0f) {
                    wv0Var.P = 1.0f;
                } else {
                    wv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.es.f.getInterpolation(wv0Var.P) * wv0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation == 1.0f || (tv0Var = wv0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        } else {
            tv0Var.b(fArr);
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
        wv0Var.c(canvas, 1.0f - interpolation, wv0Var.o - getLeft(), wv0Var.p - getTop(), f7, f10);
    }
}
