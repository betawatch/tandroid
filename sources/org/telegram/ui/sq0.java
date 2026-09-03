package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ sq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.f3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                CropAreaView cropAreaView = photoViewer.z1.b.a;
                float lerp = AndroidUtilities.lerp(photoViewer.X5, photoViewer.b6, photoViewer.i6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.U5, photoViewer.Z5, photoViewer.i6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.V5, photoViewer.a6, photoViewer.i6);
                cropAreaView.k0 = 0.0f;
                cropAreaView.l0 = lerp;
                cropAreaView.m0 = lerp2;
                cropAreaView.n0 = lerp3;
                cropAreaView.invalidate();
                break;
            case 2:
                photoViewer.I1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                photoViewer.I1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.j6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer.s3();
                break;
            case 6:
                photoViewer.I1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                photoViewer.I1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                mt0 mt0Var = photoViewer.I1;
                if (mt0Var != null) {
                    mt0Var.a1.invalidate();
                    break;
                }
                break;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Q8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.W5 = floatValue;
                mt0 mt0Var2 = photoViewer.I1;
                if (mt0Var2 != null && Math.abs(floatValue - mt0Var2.U1) > 0.1f) {
                    mt0Var2.U1 = floatValue;
                    mt0Var2.v0(mt0Var2.F0, mt0Var2.G0, mt0Var2.H0, mt0Var2.K0, mt0Var2.L0);
                }
                photoViewer.b0.invalidate();
                break;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.j6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                break;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.j6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.j6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                photoViewer.T0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.j6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
