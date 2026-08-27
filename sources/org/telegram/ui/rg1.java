package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rg1 extends org.telegram.ui.Components.p71 {
    public boolean P;
    public final Path Q;
    public final /* synthetic */ sg1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg1(sg1 sg1Var, Context context) {
        super(context, null);
        this.R = sg1Var;
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

    @Override // org.telegram.ui.Components.p71
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.p71
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.p71
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((qg0) this.R).X();
        if (X instanceof pg0) {
            return ((pg0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.p71
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((qg0) this.R).X();
        if (X instanceof pg0) {
            return ((pg0) X).S(motionEvent, true);
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

    @Override // org.telegram.ui.Components.p71
    public final void t(View view, View view2, int i10, int i11) {
        this.R.U();
    }

    @Override // org.telegram.ui.Components.p71
    public final void u() {
        gy gyVar;
        sg1 sg1Var = this.R;
        qg0 qg0Var = (qg0) sg1Var;
        if (qg0Var.B != null) {
            qg0Var.m0(qg0Var.c.getCurrentPosition(), true);
            qg0Var.n0(0.0f, false);
        }
        qg0Var.d0();
        rg1 rg1Var = qg0Var.c;
        if (rg1Var != null) {
            int currentPosition = rg1Var.getCurrentPosition();
            if (currentPosition != 2 && qg0Var.x) {
                qg0Var.W(2);
                qg0Var.x = false;
            }
            if (currentPosition != 3) {
                qg0Var.W(3);
            }
            Integer num = qg0Var.E;
            if (num != null && currentPosition == 0 && (gyVar = qg0Var.F) != null) {
                gyVar.w4(num.intValue());
                qg0Var.E = null;
            }
        }
        sg1Var.U();
    }

    @Override // org.telegram.ui.Components.p71
    public final void w(boolean z10) {
        sg1 sg1Var = this.R;
        qg0 qg0Var = (qg0) sg1Var;
        boolean z11 = !z10;
        if (qg0Var.B != null) {
            float positionAnimated = qg0Var.c.getPositionAnimated();
            qg0Var.n0(positionAnimated, z11);
            if (!z10) {
                qg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        qg0Var.h0();
        qg0Var.d0();
        qg0Var.b.invalidate();
        sg1Var.U();
        sg1Var.checkSystemBarColors();
    }
}
