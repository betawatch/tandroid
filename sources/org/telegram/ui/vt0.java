package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vt0 extends Fade {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ PhotoViewer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.b = z10;
                this.c = z11;
                super(2);
                break;
            default:
                this.d = photoViewer;
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
                if (this.b && !this.c && view == this.d.Q1) {
                    onAppear.addListener(new wq0(this, 5));
                    ((ObjectAnimator) onAppear).addUpdateListener(new c3(this, 20));
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
                    onDisappear.addListener(new wq0(this, 6));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new c3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
