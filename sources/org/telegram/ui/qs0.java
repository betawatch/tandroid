package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ qs0(PhotoViewer photoViewer, boolean z10, int i9) {
        this.a = i9;
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
                if (animator.equals(photoViewer2.H)) {
                    photoViewer2.H = null;
                    break;
                }
                break;
            case 3:
                this.c.P7 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i9 = this.a;
        boolean z10 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (i9) {
            case 0:
                if (!z10) {
                    photoViewer.e3.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (animator.equals(photoViewer.w)) {
                    if (!z10) {
                        photoViewer.T0.setVisibility(4);
                    }
                    photoViewer.w = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.H)) {
                    if (!z10) {
                        photoViewer.B.setVisibility(4);
                        if (photoViewer.e0.getTag() != null) {
                            photoViewer.e0.setVisibility(4);
                        }
                        if (photoViewer.M1.getTag() != null) {
                            photoViewer.M1.setVisibility(4);
                        }
                    }
                    photoViewer.H = null;
                    break;
                }
                break;
            default:
                if (animator.equals(photoViewer.P7)) {
                    photoViewer.P7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.J7.setVisibility(0);
                        photoViewer.K7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.P7;
                        du0 du0Var = photoViewer.J7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(du0Var, (Property<du0, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.K7, (Property<org.telegram.ui.Components.bf0, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.O4) {
                            photoViewer.f0.setVisibility(8);
                            photoViewer.f0.setAlpha(0.0f);
                            photoViewer.f0.setBackgroundColor(photoViewer.Y1 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.J7.setVisibility(4);
                        photoViewer.K7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.P7;
                        bh.g gVar = photoViewer.L0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(gVar, (Property<bh.g, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.L0, (Property<bh.g, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.O0, (Property<org.telegram.ui.Components.wo0, Float>) property2, 0.0f));
                    }
                    photoViewer.P7.addListener(new bc0(this, 14));
                    photoViewer.P7.setDuration(200L);
                    photoViewer.P7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.P7.start();
                    break;
                }
                break;
        }
    }
}
