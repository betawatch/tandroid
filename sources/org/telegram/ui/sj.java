package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sj extends ChatActivityEnterView {
    public int t5;
    public int u5;
    public int v5;
    public final /* synthetic */ cn w5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(cn cnVar, Activity activity, org.telegram.ui.Components.tt0 tt0Var, cn cnVar2, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, tt0Var, cnVar2, z9, g6Var);
        this.w5 = cnVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        this.w5.F7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cn cnVar = this.w5;
        if (cnVar.Z != null) {
            if (cnVar.z0 != null) {
                if (cnVar.Za > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    if (kVar2.w()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.u5 = this.E0.getMeasuredHeight();
            this.v5 = this.E0.getScrollY();
            cnVar.l1.invalidate();
            cnVar.c0 = cnVar.Z.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void H0() {
        if (this.w5.ab != null) {
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
        cn cnVar = this.w5;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        final int i7 = 0;
        if (kVar.w() || cnVar.X9()) {
            ValueAnimator valueAnimator = cnVar.L9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = cnVar.K9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            cnVar.c0 = 0;
            this.n3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i10 = cnVar.c0;
        final int i11 = 1;
        if (i10 != 0 && backgroundTop != i10 && this.t5 == cnVar.l1.getMeasuredHeight()) {
            int i12 = (this.T1 + cnVar.c0) - backgroundTop;
            setAnimatedTop(i12);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = cnVar.K9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                cnVar.K9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i12, 0.0f);
            cnVar.K9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rj
                public final /* synthetic */ sj b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i7) {
                        case 0:
                            sj sjVar = this.b;
                            cn cnVar2 = sjVar.w5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            sjVar.setAnimatedTop((int) floatValue);
                            View view2 = sjVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                cnVar2.L9();
                                cnVar2.N9();
                            } else {
                                sjVar.G1.setTranslationY(((1.0f - sjVar.getTopViewEnterProgress()) * sjVar.G1.getLayoutParams().height) + floatValue);
                            }
                            sjVar.y1.invalidate();
                            sjVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            cnVar.K9.addListener(new va(this, 5));
            cnVar.K9.setDuration(250L);
            cnVar.K9.setInterpolator(mi.l.V);
            if (!cnVar.J9) {
                cnVar.K9.start();
            }
            cnVar.L9();
            cnVar.N9();
            cnVar.c0 = 0;
        } else if (this.t5 != cnVar.l1.getMeasuredHeight()) {
            cnVar.c0 = 0;
        }
        if (this.n3) {
            float scrollY = (this.v5 - this.E0.getScrollY()) + (this.u5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.xe xeVar = this.E0;
            xeVar.setOffsetY(xeVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rj
                public final /* synthetic */ sj b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i11) {
                        case 0:
                            sj sjVar = this.b;
                            cn cnVar2 = sjVar.w5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            sjVar.setAnimatedTop((int) floatValue);
                            View view2 = sjVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                cnVar2.L9();
                                cnVar2.N9();
                            } else {
                                sjVar.G1.setTranslationY(((1.0f - sjVar.getTopViewEnterProgress()) * sjVar.G1.getLayoutParams().height) + floatValue);
                            }
                            sjVar.y1.invalidate();
                            sjVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = cnVar.L9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            cnVar.L9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(mi.l.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.t5 = cnVar.l1.getMeasuredHeight();
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
        cn cnVar = this.w5;
        af afVar = cnVar.Pb;
        if (afVar != null) {
            org.telegram.messenger.g0.h3(afVar);
            cnVar.Pb = null;
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
        cn cnVar = this.w5;
        m6.n nVar = cnVar.hd;
        boolean z9 = false;
        boolean z10 = i7 == 0;
        if (getMeasuredWidth() > 0 && !cnVar.Xc) {
            z9 = true;
        }
        nVar.h(1, z10, z9);
    }
}
