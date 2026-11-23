package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class rj extends ChatActivityEnterView {
    public int t7;
    public int u7;
    public int v7;
    public final /* synthetic */ bn w7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(bn bnVar, Activity activity, org.telegram.ui.Components.du0 du0Var, bn bnVar2, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, du0Var, bnVar2, z10, h6Var);
        this.w7 = bnVar;
    }

    public final void I2() {
        org.telegram.ui.ActionBar.k kVar;
        Interpolator interpolator;
        Interpolator interpolator2;
        bn bnVar = this.w7;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        final int i7 = 0;
        if (kVar.x() || bnVar.Y9()) {
            ValueAnimator valueAnimator = bnVar.N9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = bnVar.M9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            bnVar.d0 = 0;
            this.d4 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i10 = bnVar.d0;
        final int i11 = 1;
        if (i10 != 0 && backgroundTop != i10 && this.t7 == bnVar.m1.getMeasuredHeight()) {
            int i12 = (this.J2 + bnVar.d0) - backgroundTop;
            setAnimatedTop(i12);
            this.o2.invalidate();
            ValueAnimator valueAnimator3 = bnVar.M9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                bnVar.M9.cancel();
            }
            View view = this.w2;
            if (view != null && view.getVisibility() == 0) {
                this.w2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height) + this.J2);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i12, 0.0f);
            bnVar.M9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.qj
                public final /* synthetic */ rj b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i7) {
                        case 0:
                            rj rjVar = this.b;
                            bn bnVar2 = rjVar.w7;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            rjVar.setAnimatedTop((int) floatValue);
                            View view2 = rjVar.w2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                bnVar2.M9();
                                bnVar2.O9();
                            } else {
                                rjVar.w2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.w2.getLayoutParams().height) + floatValue);
                            }
                            rjVar.o2.invalidate();
                            rjVar.invalidate();
                            break;
                        default:
                            this.b.F0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            bnVar.M9.addListener(new org.telegram.ui.Cells.y9(this, 6));
            bnVar.M9.setDuration(E0());
            ValueAnimator valueAnimator4 = bnVar.M9;
            Interpolator interpolator3 = pi.k.V;
            if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (interpolator2 = this.H1) != null) {
                interpolator3 = interpolator2;
            }
            valueAnimator4.setInterpolator(interpolator3);
            bnVar.M9.setStartDelay(getLineAnimationDelay());
            if (!bnVar.L9) {
                bnVar.M9.start();
            }
            bnVar.M9();
            bnVar.O9();
            bnVar.d0 = 0;
        } else if (this.t7 != bnVar.m1.getMeasuredHeight()) {
            bnVar.d0 = 0;
        }
        if (this.d4) {
            float scrollY = (this.v7 - this.F0.getScrollY()) + (this.u7 - this.F0.getMeasuredHeight());
            org.telegram.ui.Components.gf gfVar = this.F0;
            gfVar.setOffsetY(gfVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.qj
                public final /* synthetic */ rj b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator42) {
                    switch (i11) {
                        case 0:
                            rj rjVar = this.b;
                            bn bnVar2 = rjVar.w7;
                            float floatValue = ((Float) valueAnimator42.getAnimatedValue()).floatValue();
                            rjVar.setAnimatedTop((int) floatValue);
                            View view2 = rjVar.w2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                bnVar2.M9();
                                bnVar2.O9();
                            } else {
                                rjVar.w2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.w2.getLayoutParams().height) + floatValue);
                            }
                            rjVar.o2.invalidate();
                            rjVar.invalidate();
                            break;
                        default:
                            this.b.F0.setOffsetY(((Float) valueAnimator42.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator5 = bnVar.N9;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
            bnVar.N9 = ofFloat2;
            ofFloat2.setDuration(E0());
            Interpolator interpolator4 = pi.k.V;
            if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (interpolator = this.H1) != null) {
                interpolator4 = interpolator;
            }
            ofFloat2.setInterpolator(interpolator4);
            ofFloat2.setStartDelay(getLineAnimationDelay());
            ofFloat2.start();
            this.d4 = false;
        }
        this.t7 = bnVar.m1.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void O0(boolean z10) {
        super.O0(z10);
        bn bnVar = this.w7;
        af afVar = bnVar.Rb;
        if (afVar != null) {
            org.telegram.messenger.g0.g3(afVar);
            bnVar.Rb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void b1(float f10) {
        this.w7.F7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void d1(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bn bnVar = this.w7;
        if (bnVar.a0 != null) {
            if (bnVar.A0 != null) {
                if (bnVar.bb > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    if (kVar2.x()) {
                        return;
                    }
                }
            }
            this.d4 = true;
            this.u7 = this.F0.getMeasuredHeight();
            this.v7 = this.F0.getScrollY();
            bnVar.m1.invalidate();
            bnVar.d0 = bnVar.a0.getBackgroundTop();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void i1() {
        if (this.w7.cb != null) {
            return;
        }
        super.i1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean o1() {
        return this.w7.f6;
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
        bn bnVar = this.w7;
        m6.n nVar = bnVar.jd;
        boolean z10 = false;
        boolean z11 = i7 == 0;
        if (getMeasuredWidth() > 0 && !bnVar.Zc) {
            z10 = true;
        }
        nVar.h(1, z11, z10);
    }
}
