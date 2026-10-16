package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class sk extends ChatActivityEnterView {
    public int o5;
    public int p5;
    public int q5;
    public final /* synthetic */ fo r5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(fo foVar, Activity activity, org.telegram.ui.Components.ow0 ow0Var, fo foVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, ow0Var, foVar2, z10, c6Var);
        this.r5 = foVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        fo foVar = this.r5;
        if (foVar.Y != null) {
            if (foVar.x0 != null) {
                if (foVar.Ea > 0.0f) {
                    return;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                    if (kVar2.t()) {
                        return;
                    }
                }
            }
            this.n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.q5 = this.E0.getScrollY();
            foVar.X0.invalidate();
            foVar.b0 = foVar.Y.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void F0() {
        if (this.r5.Fa != null) {
            return;
        }
        super.F0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean L0() {
        return this.r5.N5;
    }

    public final void Q1() {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.r5;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        final int i10 = 0;
        if (kVar.t() || foVar.F9()) {
            ValueAnimator valueAnimator = foVar.q9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = foVar.p9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            foVar.b0 = 0;
            this.n3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = foVar.b0;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.o5 == foVar.X0.getMeasuredHeight()) {
            int i13 = (this.T1 + foVar.b0) - backgroundTop;
            setAnimatedTop(i13);
            this.y1.invalidate();
            ValueAnimator valueAnimator3 = foVar.p9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                foVar.p9.cancel();
            }
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
            foVar.p9 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rk
                public final /* synthetic */ sk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            sk skVar = this.b;
                            fo foVar2 = skVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            skVar.setAnimatedTop((int) floatValue);
                            View view2 = skVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                foVar2.t9();
                                foVar2.w9();
                            } else {
                                skVar.G1.setTranslationY(((1.0f - skVar.getTopViewEnterProgress()) * skVar.G1.getLayoutParams().height) + floatValue);
                            }
                            skVar.y1.invalidate();
                            skVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            foVar.p9.addListener(new u0(this, 22));
            foVar.p9.setDuration(250L);
            foVar.p9.setInterpolator(ki.n.V);
            if (!foVar.o9) {
                foVar.p9.start();
            }
            foVar.t9();
            foVar.w9();
            foVar.b0 = 0;
        } else if (this.o5 != foVar.X0.getMeasuredHeight()) {
            foVar.b0 = 0;
        }
        if (this.n3) {
            float scrollY = (this.q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
            org.telegram.ui.Components.rf rfVar = this.E0;
            rfVar.setOffsetY(rfVar.getOffsetY() - scrollY);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rk
                public final /* synthetic */ sk b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            sk skVar = this.b;
                            fo foVar2 = skVar.r5;
                            float floatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            skVar.setAnimatedTop((int) floatValue);
                            View view2 = skVar.G1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                foVar2.t9();
                                foVar2.w9();
                            } else {
                                skVar.G1.setTranslationY(((1.0f - skVar.getTopViewEnterProgress()) * skVar.G1.getLayoutParams().height) + floatValue);
                            }
                            skVar.y1.invalidate();
                            skVar.invalidate();
                            break;
                        default:
                            this.b.E0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = foVar.q9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            foVar.q9 = ofFloat2;
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(ki.n.V);
            ofFloat2.start();
            this.n3 = false;
        }
        this.o5 = foVar.X0.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void o0(boolean z10) {
        super.o0(z10);
        fo foVar = this.r5;
        wf wfVar = foVar.nb;
        if (wfVar != null) {
            AndroidUtilities.runOnUIThread(wfVar);
            foVar.nb = null;
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
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        fo foVar = this.r5;
        j6.l lVar = foVar.Bc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !foVar.rc) {
            z10 = true;
        }
        lVar.i(1, z11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        this.r5.t7();
    }
}
