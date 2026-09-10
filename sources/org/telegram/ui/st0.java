package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class st0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ st0(PhotoViewer photoViewer, boolean z10, int i10) {
        this.a = i10;
        this.c = photoViewer;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                PhotoViewer photoViewer = this.c;
                if (animator.equals(photoViewer.w)) {
                    photoViewer.w = null;
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer2 = this.c;
                if (animator.equals(photoViewer2.L)) {
                    photoViewer2.L = null;
                    break;
                }
                break;
            case 3:
                this.c.T7 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        boolean z10 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (i10) {
            case 0:
                if (!z10) {
                    photoViewer.i3.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (animator.equals(photoViewer.w)) {
                    if (!z10) {
                        photoViewer.X0.setVisibility(4);
                    }
                    photoViewer.w = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.L)) {
                    if (!z10) {
                        photoViewer.F.setVisibility(4);
                        if (photoViewer.i0.getTag() != null) {
                            photoViewer.i0.setVisibility(4);
                        }
                        if (photoViewer.Q1.getTag() != null) {
                            photoViewer.Q1.setVisibility(4);
                        }
                    }
                    photoViewer.L = null;
                    break;
                }
                break;
            default:
                if (animator.equals(photoViewer.T7)) {
                    photoViewer.T7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.N7.setVisibility(0);
                        photoViewer.O7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.T7;
                        gv0 gv0Var = photoViewer.N7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(gv0Var, (Property<gv0, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.O7, (Property<org.telegram.ui.Components.bg0, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.S4) {
                            photoViewer.j0.setVisibility(8);
                            photoViewer.j0.setAlpha(0.0f);
                            photoViewer.j0.setBackgroundColor(photoViewer.c2 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.N7.setVisibility(4);
                        photoViewer.O7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.T7;
                        u5 u5Var = photoViewer.P0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(u5Var, (Property<u5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.P0, (Property<u5, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.S0, (Property<hi.b2, Float>) property2, 0.0f));
                    }
                    photoViewer.T7.addListener(new org.telegram.ui.Components.voip.v2(this, 28));
                    photoViewer.T7.setDuration(200L);
                    photoViewer.T7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.T7.start();
                    break;
                }
                break;
        }
    }
}
