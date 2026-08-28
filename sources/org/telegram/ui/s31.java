package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s31 extends Fade {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SecretMediaViewer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i9) {
        super(1);
        this.a = i9;
        switch (i9) {
            case 1:
                this.d = secretMediaViewer;
                this.b = z10;
                this.c = z11;
                super(2);
                break;
            default:
                this.d = secretMediaViewer;
                this.b = z10;
                this.c = z11;
                break;
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.b && !this.c && view == this.d.V) {
                    onAppear.addListener(new bc0(this, 23));
                    ((ObjectAnimator) onAppear).addUpdateListener(new v01(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.b && this.c && view == this.d.V) {
                    onDisappear.addListener(new bc0(this, 24));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new v01(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
