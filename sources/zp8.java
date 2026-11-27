// default package

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zp8 extends d79 implements j6b {
    public final /* synthetic */ ProfileActivity f3;
    public VelocityTracker g3;
    public final /* synthetic */ ProfileActivity h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp8(ProfileActivity profileActivity, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.h3 = profileActivity;
        this.f3 = profileActivity;
    }

    @Override // d79
    public final boolean H0(View view) {
        return view != this.h3.O;
    }

    @Override // d79
    public final boolean J0(View view, float f, float f2) {
        return !(view instanceof t1);
    }

    @Override // j6b
    public final void b(int[] iArr) {
        a aVar;
        aVar = ((e) this.f3).actionBar;
        iArr[0] = aVar.getMeasuredHeight();
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

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.h3;
        gr8 gr8Var = profileActivity.O;
        if (gr8Var != null) {
            if (gr8Var.p()) {
                gr8 gr8Var2 = profileActivity.O;
                if (gr8Var2.F1 && gr8Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.p()) {
                gr8 gr8Var3 = profileActivity.O;
                if (gr8Var3.F1 && (gr8Var3.getClosestTab() == 8 || eja.t0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            cga cgaVar = profileActivity.O.b0;
            if (cgaVar != null && cgaVar.g()) {
                return false;
            }
            fga fgaVar = profileActivity.O.c0;
            if (fgaVar != null && fgaVar.f) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = ProfileActivity.Z6;
        this.h3.J3();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m;
        a aVar;
        int X1;
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
            int currentActionBarHeight = a.getCurrentActionBarHeight();
            aVar = ((e) profileActivity).actionBar;
            int i = currentActionBarHeight + (aVar.getOccupyStatusBar() ? hl.m : 0);
            if (!profileActivity.o2 || profileActivity.J0) {
                i = profileActivity.a.getMeasuredWidth();
                X1 = profileActivity.X1();
            } else {
                X1 = profileActivity.d2();
            }
            if (profileActivity.Q1 >= (X1 + i) - 1.0f) {
                profileActivity.a3(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m = profileActivity.c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
            }
            profileActivity.A3(m, profileActivity.j2);
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void t0(View view, View view2) {
    }
}
