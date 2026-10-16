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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class uv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final n4 c;
    public final org.telegram.ui.Components.z9 d;
    public final /* synthetic */ vv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv0(vv0 vv0Var, Context context) {
        super(context);
        this.e = vv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new tv0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        frameLayout.addView(z9Var);
        frameLayout.setWillNotDraw(false);
        n4 n4Var = new n4(context);
        this.c = n4Var;
        n4Var.setBackgroundColor(0);
        frameLayout.addView(n4Var, w7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        n4Var.addView(textureView, w7.z5.d(-1.0f, -1));
        addView(frameLayout, w7.z5.d(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        vv0 vv0Var = this.e;
        float[] fArr = vv0Var.m;
        wh.g gVar = vv0Var.j;
        Path path = vv0Var.l;
        if (!vv0Var.n || vv0Var.e == null || vv0Var.a == null) {
            return;
        }
        vv0Var.i();
        float left = vv0Var.o - getLeft();
        float top = vv0Var.p - getTop();
        canvas.save();
        float f10 = vv0Var.O;
        float f11 = vv0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, vv0Var.s + left, vv0Var.t + top);
        float f13 = vv0Var.J;
        float f14 = vv0Var.A;
        canvas.translate((f13 * f14) + left, (vv0Var.K * f14) + top);
        ImageReceiver imageReceiver = vv0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = vv0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                vv0Var.B = f16;
                if (f16 > 1.0f) {
                    vv0Var.B = 1.0f;
                } else {
                    vv0Var.e();
                }
            }
            vv0Var.g.setAlpha(vv0Var.B);
        }
        float f17 = vv0Var.u;
        float f18 = vv0Var.v;
        float f19 = vv0Var.w;
        float f20 = vv0Var.y;
        if (f19 == f20 && vv0Var.x == vv0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = vv0Var.z;
            float f23 = vv0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = vv0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (vv0Var.R) {
            float f26 = vv0Var.s - vv0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(vv0Var.t - vv0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((vv0Var.J * f12 * vv0Var.A) + f17 + left);
            frameLayout.setTranslationY((vv0Var.K * f12 * vv0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = vv0Var.f;
            if (imageReceiver3 != null) {
                if (vv0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || vv0Var.f.getAnimation() != null || vv0Var.g.getLottieAnimation() != null || vv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    vv0Var.f.draw(canvas);
                    vv0Var.g.setImageCoords(vv0Var.f.getImageX(), vv0Var.f.getImageY(), vv0Var.f.getImageWidth(), vv0Var.f.getImageHeight());
                    vv0Var.g.draw(canvas);
                } else {
                    vv0Var.g.setImageCoords(imageReceiver3.getImageX(), vv0Var.f.getImageY(), vv0Var.f.getImageWidth(), vv0Var.f.getImageHeight());
                    vv0Var.g.draw(canvas);
                    if (vv0Var.g.getLottieAnimation() != null || vv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (vv0Var.i) {
            vv0Var.h.setAlpha(vv0Var.f.getAlpha());
            vv0Var.h.setRoundRadius(vv0Var.f.getRoundRadius(true));
            vv0Var.h.setImageCoords(vv0Var.f.getImageX(), vv0Var.f.getImageY(), vv0Var.f.getImageWidth(), vv0Var.f.getImageHeight());
            vv0Var.h.draw(canvas);
            int[] roundRadius = vv0Var.f.getRoundRadius(true);
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
            rectF.set(vv0Var.f.getImageX(), vv0Var.f.getImageY(), vv0Var.f.getImageX2(), vv0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (vv0Var.k != null) {
                canvas.translate(vv0Var.f.getImageX(), vv0Var.f.getImageY());
                vv0Var.k.c(canvas, vv0Var.d, (int) vv0Var.f.getImageWidth(), (int) vv0Var.f.getImageHeight(), 1.0f, false);
            } else {
                gVar.h(i0.a.k(-1, (int) (vv0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                gVar.setBounds((int) vv0Var.f.getImageX(), (int) vv0Var.f.getImageY(), (int) vv0Var.f.getImageX2(), (int) vv0Var.f.getImageY2());
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
        sv0 sv0Var;
        vv0 vv0Var = this.e;
        float[] fArr = vv0Var.Q;
        if (vv0Var.C == null) {
            float f11 = vv0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                vv0Var.P = f12;
                if (f12 > 1.0f) {
                    vv0Var.P = 1.0f;
                } else {
                    vv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.es.f.getInterpolation(vv0Var.P) * vv0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation == 1.0f || (sv0Var = vv0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        } else {
            sv0Var.b(fArr);
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
        vv0Var.c(canvas, 1.0f - interpolation, vv0Var.o - getLeft(), vv0Var.p - getTop(), f7, f10);
    }
}
