package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ug1 extends org.telegram.ui.Components.z71 {
    public boolean P;
    public final Path Q;
    public final /* synthetic */ vg1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug1(vg1 vg1Var, Context context) {
        super(context, null);
        this.R = vg1Var;
        this.Q = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.P) {
            Path path = this.Q;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.P) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.z71
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.z71
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.z71
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((ng0) this.R).X();
        if (X instanceof mg0) {
            return ((mg0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.z71
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((ng0) this.R).X();
        if (X instanceof mg0) {
            return ((mg0) X).S(motionEvent, true);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.z71
    public final void t(View view, View view2, int i10, int i11) {
        this.R.U();
    }

    @Override // org.telegram.ui.Components.z71
    public final void u() {
        fy fyVar;
        vg1 vg1Var = this.R;
        ng0 ng0Var = (ng0) vg1Var;
        if (ng0Var.B != null) {
            ng0Var.m0(ng0Var.c.getCurrentPosition(), true);
            ng0Var.n0(0.0f, false);
        }
        ng0Var.d0();
        ug1 ug1Var = ng0Var.c;
        if (ug1Var != null) {
            int currentPosition = ug1Var.getCurrentPosition();
            if (currentPosition != 2 && ng0Var.x) {
                ng0Var.W(2);
                ng0Var.x = false;
            }
            if (currentPosition != 3) {
                ng0Var.W(3);
            }
            Integer num = ng0Var.E;
            if (num != null && currentPosition == 0 && (fyVar = ng0Var.F) != null) {
                fyVar.w4(num.intValue());
                ng0Var.E = null;
            }
        }
        vg1Var.U();
    }

    @Override // org.telegram.ui.Components.z71
    public final void w(boolean z10) {
        vg1 vg1Var = this.R;
        ng0 ng0Var = (ng0) vg1Var;
        boolean z11 = !z10;
        if (ng0Var.B != null) {
            float positionAnimated = ng0Var.c.getPositionAnimated();
            ng0Var.n0(positionAnimated, z11);
            if (!z10) {
                ng0Var.m0(Math.round(positionAnimated), true);
            }
        }
        ng0Var.h0();
        ng0Var.d0();
        ng0Var.b.invalidate();
        vg1Var.U();
        vg1Var.checkSystemBarColors();
    }
}
