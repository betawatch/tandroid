package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zp0 extends Fade {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ PhotoViewer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(PhotoViewer photoViewer, boolean z9, boolean z10, int i7) {
        super(1);
        this.a = i7;
        switch (i7) {
            case 1:
                this.d = photoViewer;
                this.b = z9;
                this.c = z10;
                super(2);
                break;
            default:
                this.d = photoViewer;
                this.b = z9;
                this.c = z10;
                break;
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.b && !this.c && view == this.d.Q1) {
                    onAppear.addListener(new g30(this, 14));
                    ((ObjectAnimator) onAppear).addUpdateListener(new a3(this, 18));
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
                if (!this.b && this.c && view == this.d.Q1) {
                    onDisappear.addListener(new g30(this, 15));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new a3(this, 19));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
