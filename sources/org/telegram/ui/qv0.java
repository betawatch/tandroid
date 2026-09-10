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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final m4 c;
    public final org.telegram.ui.Components.w9 d;
    public final /* synthetic */ rv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv0(rv0 rv0Var, Context context) {
        super(context);
        this.e = rv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new pv0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        m4 m4Var = new m4(context);
        this.c = m4Var;
        m4Var.setBackgroundColor(0);
        frameLayout.addView(m4Var, w7.a6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        m4Var.addView(textureView, w7.a6.c(-1.0f, -1));
        addView(frameLayout, w7.a6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        rv0 rv0Var = this.e;
        float[] fArr = rv0Var.m;
        uh.h hVar = rv0Var.j;
        Path path = rv0Var.l;
        if (!rv0Var.n || rv0Var.e == null || rv0Var.a == null) {
            return;
        }
        rv0Var.i();
        float left = rv0Var.o - getLeft();
        float top = rv0Var.p - getTop();
        canvas.save();
        float f10 = rv0Var.O;
        float f11 = rv0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, rv0Var.s + left, rv0Var.t + top);
        float f13 = rv0Var.J;
        float f14 = rv0Var.A;
        canvas.translate((f13 * f14) + left, (rv0Var.K * f14) + top);
        ImageReceiver imageReceiver = rv0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = rv0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                rv0Var.B = f16;
                if (f16 > 1.0f) {
                    rv0Var.B = 1.0f;
                } else {
                    rv0Var.e();
                }
            }
            rv0Var.g.setAlpha(rv0Var.B);
        }
        float f17 = rv0Var.u;
        float f18 = rv0Var.v;
        float f19 = rv0Var.w;
        float f20 = rv0Var.y;
        if (f19 == f20 && rv0Var.x == rv0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = rv0Var.z;
            float f23 = rv0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = rv0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (rv0Var.R) {
            float f26 = rv0Var.s - rv0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(rv0Var.t - rv0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((rv0Var.J * f12 * rv0Var.A) + f17 + left);
            frameLayout.setTranslationY((rv0Var.K * f12 * rv0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = rv0Var.f;
            if (imageReceiver3 != null) {
                if (rv0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || rv0Var.f.getAnimation() != null || rv0Var.g.getLottieAnimation() != null || rv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    rv0Var.f.draw(canvas);
                    rv0Var.g.setImageCoords(rv0Var.f.getImageX(), rv0Var.f.getImageY(), rv0Var.f.getImageWidth(), rv0Var.f.getImageHeight());
                    rv0Var.g.draw(canvas);
                } else {
                    rv0Var.g.setImageCoords(imageReceiver3.getImageX(), rv0Var.f.getImageY(), rv0Var.f.getImageWidth(), rv0Var.f.getImageHeight());
                    rv0Var.g.draw(canvas);
                    if (rv0Var.g.getLottieAnimation() != null || rv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (rv0Var.i) {
            rv0Var.h.setAlpha(rv0Var.f.getAlpha());
            rv0Var.h.setRoundRadius(rv0Var.f.getRoundRadius(true));
            rv0Var.h.setImageCoords(rv0Var.f.getImageX(), rv0Var.f.getImageY(), rv0Var.f.getImageWidth(), rv0Var.f.getImageHeight());
            rv0Var.h.draw(canvas);
            int[] roundRadius = rv0Var.f.getRoundRadius(true);
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
            rectF.set(rv0Var.f.getImageX(), rv0Var.f.getImageY(), rv0Var.f.getImageX2(), rv0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (rv0Var.k != null) {
                canvas.translate(rv0Var.f.getImageX(), rv0Var.f.getImageY());
                rv0Var.k.c(canvas, rv0Var.d, (int) rv0Var.f.getImageWidth(), (int) rv0Var.f.getImageHeight(), 1.0f, false);
            } else {
                hVar.h(i0.a.k(-1, (int) (rv0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                hVar.setBounds((int) rv0Var.f.getImageX(), (int) rv0Var.f.getImageY(), (int) rv0Var.f.getImageX2(), (int) rv0Var.f.getImageY2());
                hVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ov0 ov0Var;
        rv0 rv0Var = this.e;
        float[] fArr = rv0Var.Q;
        if (rv0Var.C == null) {
            float f10 = rv0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                rv0Var.P = f11;
                if (f11 > 1.0f) {
                    rv0Var.P = 1.0f;
                } else {
                    rv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.wr.f.getInterpolation(rv0Var.P) * rv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation == 1.0f || (ov0Var = rv0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = measuredHeight;
        } else {
            ov0Var.h(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f7 = measuredHeight2;
            f12 = f14;
        }
        rv0Var.c(canvas, 1.0f - interpolation, rv0Var.o - getLeft(), rv0Var.p - getTop(), f12, f7);
    }
}
