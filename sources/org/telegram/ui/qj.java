package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qj extends ChatActivityEnterView {
    public int t5;
    public int u5;
    public int v5;
    public final /* synthetic */ an w5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(an anVar, Activity activity, org.telegram.ui.Components.rt0 rt0Var, an anVar2, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, rt0Var, anVar2, z9, f6Var);
        this.w5 = anVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        this.w5.E7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        an anVar = this.w5;
        if (anVar.Z != null) {
            if (anVar.z0 != null) {
                if (anVar.Xa > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    if (kVar2.v()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.u5 = this.E0.getMeasuredHeight();
            this.v5 = this.E0.getScrollY();
            anVar.l1.invalidate();
            anVar.c0 = anVar.Z.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void H0() {
        if (this.w5.Ya != null) {
            return;
        }
        super.H0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean N0() {
        return this.w5.d6;
    }

    public final void V1() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.w5;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        final int i7 = 0;
        if (kVar.v() || anVar.W9()) {
            ValueAnimator valueAnimator = anVar.J9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = anVar.I9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            anVar.c0 = 0;
            this.n3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i10 = anVar.c0;
        final int i11 = 1;
        if (i10 != 0 && backgroundTop != i10 && this.t5 == anVar.l1.getMeasuredHeight()) {
            int i12 = (this.T1 + anVar.c0) - backgroundTop;
            setAnimatedTop(i12);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = anVar.I9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                anVar.I9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i12, 0.0f);
            anVar.I9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                public final /* synthetic */ qj b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i7) {
                        case 0:
                            qj qjVar = this.b;
                            an anVar2 = qjVar.w5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            qjVar.setAnimatedTop((int) floatValue);
                            View view2 = qjVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                anVar2.K9();
                                anVar2.M9();
                            } else {
                                qjVar.G1.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.G1.getLayoutParams().height) + floatValue);
                            }
                            qjVar.y1.invalidate();
                            qjVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            anVar.I9.addListener(new va(this, 5));
            anVar.I9.setDuration(250L);
            anVar.I9.setInterpolator(mi.l.V);
            if (!anVar.H9) {
                anVar.I9.start();
            }
            anVar.K9();
            anVar.M9();
            anVar.c0 = 0;
        } else if (this.t5 != anVar.l1.getMeasuredHeight()) {
            anVar.c0 = 0;
        }
        if (this.n3) {
            float scrollY = (this.v5 - this.E0.getScrollY()) + (this.u5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.xe xeVar = this.E0;
            xeVar.setOffsetY(xeVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                public final /* synthetic */ qj b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i11) {
                        case 0:
                            qj qjVar = this.b;
                            an anVar2 = qjVar.w5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            qjVar.setAnimatedTop((int) floatValue);
                            View view2 = qjVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                anVar2.K9();
                                anVar2.M9();
                            } else {
                                qjVar.G1.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.G1.getLayoutParams().height) + floatValue);
                            }
                            qjVar.y1.invalidate();
                            qjVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = anVar.J9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            anVar.J9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(mi.l.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.t5 = anVar.l1.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void o0(boolean z9) {
        super.o0(z9);
        an anVar = this.w5;
        af afVar = anVar.Nb;
        if (afVar != null) {
            org.telegram.messenger.g0.h3(afVar);
            anVar.Nb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView, android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        an anVar = this.w5;
        m6.n nVar = anVar.fd;
        boolean z9 = false;
        boolean z10 = i7 == 0;
        if (getMeasuredWidth() > 0 && !anVar.Vc) {
            z9 = true;
        }
        nVar.h(1, z10, z9);
    }
}
