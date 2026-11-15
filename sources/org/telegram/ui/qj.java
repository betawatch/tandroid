package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class qj extends ChatActivityEnterView {
    public int O6;
    public int P6;
    public int Q6;
    public final /* synthetic */ an R6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(an anVar, Activity activity, org.telegram.ui.Components.st0 st0Var, an anVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, st0Var, anVar2, z10, e6Var);
        this.R6 = anVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(boolean z10) {
        super.C0(z10);
        an anVar = this.R6;
        ye yeVar = anVar.Qb;
        if (yeVar != null) {
            org.telegram.messenger.g0.h3(yeVar);
            anVar.Qb = null;
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void P0(float f10) {
        this.R6.F7();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void R0(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        an anVar = this.R6;
        if (anVar.a0 != null) {
            if (anVar.A0 != null) {
                if (anVar.ab > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    if (kVar2.x()) {
                        return;
                    }
                }
            }
            this.V3 = true;
            this.P6 = this.F0.getMeasuredHeight();
            this.Q6 = this.F0.getScrollY();
            anVar.m1.invalidate();
            anVar.d0 = anVar.a0.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void W0() {
        if (this.R6.bb != null) {
            return;
        }
        super.W0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean c1() {
        return this.R6.e6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
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
        an anVar = this.R6;
        m6.n nVar = anVar.id;
        boolean z10 = false;
        boolean z11 = i7 == 0;
        if (getMeasuredWidth() > 0 && !anVar.Yc) {
            z10 = true;
        }
        nVar.h(1, z11, z10);
    }

    public final void v2() {
        org.telegram.ui.ActionBar.k kVar;
        Interpolator interpolator;
        Interpolator interpolator2;
        an anVar = this.R6;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        final int i7 = 0;
        if (kVar.x() || anVar.Y9()) {
            ValueAnimator valueAnimator = anVar.M9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = anVar.L9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            anVar.d0 = 0;
            this.V3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i10 = anVar.d0;
        final int i11 = 1;
        if (i10 != 0 && backgroundTop != i10 && this.O6 == anVar.m1.getMeasuredHeight()) {
            int i12 = (this.B2 + anVar.d0) - backgroundTop;
            setAnimatedTop(i12);
            this.g2.invalidate();
            ValueAnimator valueAnimator3 = anVar.L9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                anVar.L9.cancel();
            }
            View view = this.o2;
            if (view != null && view.getVisibility() == 0) {
                this.o2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.o2.getLayoutParams().height) + this.B2);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i12, 0.0f);
            anVar.L9 = ofFloat;
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
                            an anVar2 = qjVar.R6;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            qjVar.setAnimatedTop((int) floatValue);
                            View view2 = qjVar.o2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                anVar2.M9();
                                anVar2.O9();
                            } else {
                                qjVar.o2.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.o2.getLayoutParams().height) + floatValue);
                            }
                            qjVar.g2.invalidate();
                            qjVar.invalidate();
                            break;
                        default:
                            this.b.F0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            anVar.L9.addListener(new org.telegram.ui.Cells.w9(this, 6));
            anVar.L9.setDuration(s0());
            ValueAnimator valueAnimator4 = anVar.L9;
            Interpolator interpolator3 = pi.k.V;
            if (this.y1 > 0 && SystemClock.uptimeMillis() < this.y1 && (interpolator2 = this.z1) != null) {
                interpolator3 = interpolator2;
            }
            valueAnimator4.setInterpolator(interpolator3);
            anVar.L9.setStartDelay(getLineAnimationDelay());
            if (!anVar.K9) {
                anVar.L9.start();
            }
            anVar.M9();
            anVar.O9();
            anVar.d0 = 0;
        } else if (this.O6 != anVar.m1.getMeasuredHeight()) {
            anVar.d0 = 0;
        }
        if (this.V3) {
            float scrollY = (this.Q6 - this.F0.getScrollY()) + (this.P6 - this.F0.getMeasuredHeight());
            org.telegram.ui.Components.xe xeVar = this.F0;
            xeVar.setOffsetY(xeVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                public final /* synthetic */ qj b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator42) {
                    switch (i11) {
                        case 0:
                            qj qjVar = this.b;
                            an anVar2 = qjVar.R6;
                            float floatValue = ((Float) valueAnimator42.getAnimatedValue()).floatValue();
                            qjVar.setAnimatedTop((int) floatValue);
                            View view2 = qjVar.o2;
                            if (view2 == null || view2.getVisibility() != 0) {
                                anVar2.M9();
                                anVar2.O9();
                            } else {
                                qjVar.o2.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.o2.getLayoutParams().height) + floatValue);
                            }
                            qjVar.g2.invalidate();
                            qjVar.invalidate();
                            break;
                        default:
                            this.b.F0.setOffsetY(((Float) valueAnimator42.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator5 = anVar.M9;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
            anVar.M9 = ofFloat2;
            ofFloat2.setDuration(s0());
            Interpolator interpolator4 = pi.k.V;
            if (this.y1 > 0 && SystemClock.uptimeMillis() < this.y1 && (interpolator = this.z1) != null) {
                interpolator4 = interpolator;
            }
            ofFloat2.setInterpolator(interpolator4);
            ofFloat2.setStartDelay(getLineAnimationDelay());
            ofFloat2.start();
            this.V3 = false;
        }
        this.O6 = anVar.m1.getMeasuredHeight();
    }
}
