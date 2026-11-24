// default package

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class po8 extends r59 implements o4b {
    public final /* synthetic */ ProfileActivity f3;
    public VelocityTracker g3;
    public final /* synthetic */ ProfileActivity h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po8(ProfileActivity profileActivity, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.h3 = profileActivity;
        this.f3 = profileActivity;
    }

    @Override // r59
    public final boolean G0(View view) {
        return view != this.h3.O;
    }

    @Override // r59
    public final boolean I0(View view, float f, float f2) {
        return !(view instanceof s1);
    }

    @Override // o4b
    public final void b(int[] iArr) {
        a aVar;
        aVar = ((d) this.f3).actionBar;
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

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.h3;
        wp8 wp8Var = profileActivity.O;
        if (wp8Var != null) {
            if (wp8Var.p()) {
                wp8 wp8Var2 = profileActivity.O;
                if (wp8Var2.F1 && wp8Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.p()) {
                wp8 wp8Var3 = profileActivity.O;
                if (wp8Var3.F1 && (wp8Var3.getClosestTab() == 8 || nha.t0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            lea leaVar = profileActivity.O.b0;
            if (leaVar != null && leaVar.g()) {
                return false;
            }
            oea oeaVar = profileActivity.O.c0;
            if (oeaVar != null && oeaVar.f) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = ProfileActivity.e7;
        this.h3.M3();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m;
        a aVar;
        int Y1;
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
            aVar = ((d) profileActivity).actionBar;
            int i = currentActionBarHeight + (aVar.getOccupyStatusBar() ? gm.m : 0);
            if (!profileActivity.o2 || profileActivity.J0) {
                i = profileActivity.a.getMeasuredWidth();
                Y1 = profileActivity.Y1();
            } else {
                Y1 = profileActivity.e2();
            }
            if (profileActivity.Q1 >= (Y1 + i) - 1.0f) {
                profileActivity.d3(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m = profileActivity.c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
            }
            profileActivity.D3(m, profileActivity.j2);
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void s0(View view, View view2) {
    }
}
