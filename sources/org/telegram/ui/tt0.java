package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ tt0(PhotoViewer photoViewer, boolean z10, int i10) {
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
                this.c.U7 = null;
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
                if (animator.equals(photoViewer.U7)) {
                    photoViewer.U7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.O7.setVisibility(0);
                        photoViewer.P7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.U7;
                        fv0 fv0Var = photoViewer.O7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(fv0Var, (Property<fv0, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.P7, (Property<org.telegram.ui.Components.sf0, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.S4) {
                            photoViewer.j0.setVisibility(8);
                            photoViewer.j0.setAlpha(0.0f);
                            photoViewer.j0.setBackgroundColor(photoViewer.c2 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.O7.setVisibility(4);
                        photoViewer.P7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.U7;
                        t5 t5Var = photoViewer.P0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(t5Var, (Property<t5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.P0, (Property<t5, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.S0, (Property<ii.y1, Float>) property2, 0.0f));
                    }
                    photoViewer.U7.addListener(new cr0(this, 8));
                    photoViewer.U7.setDuration(200L);
                    photoViewer.U7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.U7.start();
                    break;
                }
                break;
        }
    }
}
