// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pa8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ pa8(PhotoViewer photoViewer, boolean z, byte b) {
        this.a = b;
        this.c = photoViewer;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 1:
                if (animator.equals(photoViewer.x)) {
                    photoViewer.x = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.M)) {
                    photoViewer.M = null;
                    break;
                }
                break;
            case 3:
                photoViewer.Z7 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 0:
                if (!z) {
                    photoViewer.i3.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (animator.equals(photoViewer.x)) {
                    if (!z) {
                        photoViewer.Y0.setVisibility(4);
                    }
                    photoViewer.x = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.M)) {
                    if (!z) {
                        photoViewer.G.setVisibility(4);
                        if (photoViewer.j0.getTag() != null) {
                            photoViewer.j0.setVisibility(4);
                        }
                        if (photoViewer.R1.getTag() != null) {
                            photoViewer.R1.setVisibility(4);
                        }
                    }
                    photoViewer.M = null;
                    break;
                }
                break;
            default:
                if (animator.equals(photoViewer.Z7)) {
                    photoViewer.Z7 = new AnimatorSet();
                    if (z) {
                        photoViewer.T7.setVisibility(0);
                        photoViewer.U7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.Z7;
                        rb8 rb8Var = photoViewer.T7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(rb8Var, (Property<rb8, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.U7, (Property<kb2, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.R4) {
                            photoViewer.k0.setVisibility(8);
                            photoViewer.k0.setAlpha(0.0f);
                            photoViewer.k0.setBackgroundColor(photoViewer.d2 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.T7.setVisibility(4);
                        photoViewer.U7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.Z7;
                        jp0 jp0Var = photoViewer.Q0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(jp0Var, (Property<jp0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.Q0, (Property<jp0, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.T0, (Property<vi3, Float>) property2, 0.0f));
                    }
                    photoViewer.Z7.addListener(new s38(this, (byte) 13));
                    photoViewer.Z7.setDuration(200L);
                    photoViewer.Z7.setInterpolator(gm.F);
                    photoViewer.Z7.start();
                    break;
                }
                break;
        }
    }
}
