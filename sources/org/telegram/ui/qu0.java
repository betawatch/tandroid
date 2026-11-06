package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class qu0 extends org.telegram.ui.Components.pj0 implements di.f7 {
    public final /* synthetic */ ProfileActivity e3;
    public VelocityTracker f3;
    public final /* synthetic */ ProfileActivity g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.g3 = profileActivity;
        this.e3 = profileActivity;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean F0(View view) {
        return view != this.g3.N;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean H0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override // di.f7
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.e3).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.g3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.g3;
        vv0 vv0Var = profileActivity.N;
        if (vv0Var != null) {
            if (vv0Var.H()) {
                vv0 vv0Var2 = profileActivity.N;
                if (vv0Var2.E1 && vv0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.N.H()) {
                vv0 vv0Var3 = profileActivity.N;
                if (vv0Var3.E1 && (vv0Var3.getClosestTab() == 8 || org.telegram.ui.Components.xs0.I0(profileActivity.N.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.up0 up0Var = profileActivity.N.a0;
            if (up0Var != null && up0Var.g()) {
                return false;
            }
            org.telegram.ui.Components.yp0 yp0Var = profileActivity.N.b0;
            if (yp0Var != null && yp0Var.f) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        RectF rectF = ProfileActivity.S6;
        this.g3.p5();
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        int e42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.g3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f3;
            if (velocityTracker2 == null) {
                this.f3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f3.computeCurrentVelocity(1000);
                profileActivity.h2 = this.f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f3.computeCurrentVelocity(1000);
                profileActivity.h2 = this.f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f3.recycle();
            this.f3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            int i7 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
            if (!profileActivity.m2 || profileActivity.I0) {
                i7 = profileActivity.a.getMeasuredWidth();
                e42 = profileActivity.e4();
            } else {
                e42 = profileActivity.j4();
            }
            if (profileActivity.P1 >= (e42 + i7) - 1.0f) {
                profileActivity.K4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.c.m(0)) != null) {
            if (profileActivity.N1) {
                profileActivity.N1 = false;
                profileActivity.a.O0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.h2);
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void r0(View view, View view2) {
    }
}
