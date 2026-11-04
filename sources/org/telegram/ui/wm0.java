package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ wm0(PhotoViewer photoViewer, int i3) {
        this.a = i3;
        this.b = photoViewer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i3) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.j3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.b6, photoViewer.f6, photoViewer.m6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.Y5, photoViewer.d6, photoViewer.m6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.Z5, photoViewer.e6, photoViewer.m6);
                cropAreaView.o0 = 0.0f;
                cropAreaView.p0 = T1;
                cropAreaView.q0 = T12;
                cropAreaView.r0 = T13;
                cropAreaView.invalidate();
                break;
            case 2:
                photoViewer.M1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.n6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer.v3();
                break;
            case 6:
                photoViewer.M1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                lp0 lp0Var = photoViewer.M1;
                if (lp0Var != null) {
                    lp0Var.N0.invalidate();
                    break;
                }
                break;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.V8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.a6 = floatValue;
                lp0 lp0Var2 = photoViewer.M1;
                if (lp0Var2 != null && Math.abs(floatValue - lp0Var2.H1) > 0.1f) {
                    lp0Var2.H1 = floatValue;
                    lp0Var2.v0(lp0Var2.s0, lp0Var2.t0, lp0Var2.u0, lp0Var2.x0, lp0Var2.y0);
                }
                photoViewer.f0.invalidate();
                break;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.V8;
                photoViewer.n6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.I1();
                break;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.n6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.n6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                photoViewer.X0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
            default:
                Drawable[] drawableArr8 = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.n6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
