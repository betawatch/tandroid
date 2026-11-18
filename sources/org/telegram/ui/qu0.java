package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class qu0 extends org.telegram.ui.Components.ck0 implements fi.w6 {
    public final /* synthetic */ ProfileActivity f3;
    public VelocityTracker g3;
    public final /* synthetic */ ProfileActivity h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.h3 = profileActivity;
        this.f3 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ck0
    public final boolean F0(View view) {
        return view != this.h3.O;
    }

    @Override // org.telegram.ui.Components.ck0
    public final boolean H0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override // fi.w6
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.h2) this.f3).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.h3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.h3;
        vv0 vv0Var = profileActivity.O;
        if (vv0Var != null) {
            if (vv0Var.H()) {
                vv0 vv0Var2 = profileActivity.O;
                if (vv0Var2.F1 && vv0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.H()) {
                vv0 vv0Var3 = profileActivity.O;
                if (vv0Var3.F1 && (vv0Var3.getClosestTab() == 8 || org.telegram.ui.Components.gt0.J0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.eq0 eq0Var = profileActivity.O.b0;
            if (eq0Var != null && eq0Var.g()) {
                return false;
            }
            org.telegram.ui.Components.hq0 hq0Var = profileActivity.O.c0;
            if (hq0Var != null && hq0Var.f) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        RectF rectF = ProfileActivity.Z6;
        this.h3.s5();
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        int e42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.h3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.g3;
            if (velocityTracker2 == null) {
                this.g3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.g3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.g3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.g3.computeCurrentVelocity(1000);
                profileActivity.j2 = this.g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.g3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.g3.computeCurrentVelocity(1000);
                profileActivity.j2 = this.g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.g3.recycle();
            this.g3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar = ((org.telegram.ui.ActionBar.h2) profileActivity).actionBar;
            int i7 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
            if (!profileActivity.o2 || profileActivity.J0) {
                i7 = profileActivity.a.getMeasuredWidth();
                e42 = profileActivity.e4();
            } else {
                e42 = profileActivity.j4();
            }
            if (profileActivity.Q1 >= (e42 + i7) - 1.0f) {
                profileActivity.N4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.j2);
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void r0(View view, View view2) {
    }
}
