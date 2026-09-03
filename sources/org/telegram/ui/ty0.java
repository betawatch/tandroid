package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ty0 extends org.telegram.ui.Components.sl0 implements oh.a7 {
    public final /* synthetic */ ProfileActivity U2;
    public VelocityTracker V2;
    public final /* synthetic */ ProfileActivity W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.W2 = profileActivity;
        this.U2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean F0(View view) {
        return view != this.W2.L;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean H0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override // oh.a7
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.U2).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.W2.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.W2;
        zz0 zz0Var = profileActivity.L;
        if (zz0Var != null) {
            if (zz0Var.C()) {
                zz0 zz0Var2 = profileActivity.L;
                if (zz0Var2.z1 && zz0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.L.C()) {
                zz0 zz0Var3 = profileActivity.L;
                if (zz0Var3.z1 && (zz0Var3.getClosestTab() == 8 || org.telegram.ui.Components.yu0.w0(profileActivity.L.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.or0 or0Var = profileActivity.L.S;
            if (or0Var != null && or0Var.g()) {
                return false;
            }
            org.telegram.ui.Components.sr0 sr0Var = profileActivity.L.T;
            if (sr0Var != null && sr0Var.w) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.W2.U4();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m9;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int O3;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.W2;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.V2;
            if (velocityTracker2 == null) {
                this.V2 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.V2.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.V2;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.V2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.f2 = this.V2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.V2) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.V2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                profileActivity.f2 = this.V2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.V2.recycle();
            this.V2 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            int i10 = currentActionBarHeight + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            if (!profileActivity.k2 || profileActivity.F0) {
                i10 = profileActivity.a.getMeasuredWidth();
                O3 = profileActivity.O3();
            } else {
                O3 = profileActivity.T3();
            }
            if (profileActivity.N1 >= (O3 + i10) - 1.0f) {
                profileActivity.w4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m9 = profileActivity.c.m(0)) != null) {
            if (profileActivity.L1) {
                profileActivity.L1 = false;
                profileActivity.a.K0 = true;
            }
            if (profileActivity.l2) {
                if (!profileActivity.m2) {
                    profileActivity.a.v0(0, m9.getTop() - profileActivity.T3(), org.telegram.ui.Components.pr.h);
                    return onTouchEvent;
                }
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                profileActivity.a.v0(0, ((m9.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.O3()) + currentActionBarHeight2 + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), org.telegram.ui.Components.pr.h);
                return onTouchEvent;
            }
            boolean z4 = profileActivity.O3() > 0;
            if (z4) {
                float f10 = profileActivity.N1;
                if (f10 > 0.0f && ((f10 < profileActivity.T3() * 0.6f || profileActivity.f2 < -1000.0f) && profileActivity.N1 > profileActivity.O3() * 0.6f)) {
                    profileActivity.a.v0(0, (int) (profileActivity.N1 - profileActivity.O3()), org.telegram.ui.Components.pr.h);
                    return onTouchEvent;
                }
            }
            if (z4) {
                float f11 = profileActivity.N1;
                if (f11 > 0.0f && f11 < profileActivity.O3() * 0.6f) {
                    profileActivity.a.v0(0, (int) (profileActivity.O3() - profileActivity.N1), org.telegram.ui.Components.pr.h);
                    return onTouchEvent;
                }
            }
            if (!z4) {
                float f12 = profileActivity.N1;
                if (f12 > 0.0f && profileActivity.f2 < -1000.0f) {
                    profileActivity.a.v0(0, (int) f12, org.telegram.ui.Components.pr.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.N1 > 0.0f) {
                profileActivity.a.v0(0, m9.getTop() - profileActivity.T3(), org.telegram.ui.Components.pr.h);
            }
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void q0(View view, View view2) {
    }
}
