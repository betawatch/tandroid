package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class tg1 extends org.telegram.ui.Components.l91 {
    public boolean T;
    public final Path U;
    public final /* synthetic */ ug1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg1(ug1 ug1Var, Context context) {
        super(context, null);
        this.V = ug1Var;
        this.U = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.T) {
            Path path = this.U;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.T) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.l91
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.l91
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.l91
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((rg0) this.V).X();
        if (X instanceof qg0) {
            return ((qg0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.l91
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((rg0) this.V).X();
        if (X instanceof qg0) {
            return ((qg0) X).S(motionEvent, true);
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
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.l91
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override // org.telegram.ui.Components.l91
    public final void u() {
        ey eyVar;
        ug1 ug1Var = this.V;
        rg0 rg0Var = (rg0) ug1Var;
        if (rg0Var.F != null) {
            rg0Var.m0(rg0Var.c.getCurrentPosition(), true);
            rg0Var.n0(0.0f, false);
        }
        rg0Var.d0();
        tg1 tg1Var = rg0Var.c;
        if (tg1Var != null) {
            int currentPosition = tg1Var.getCurrentPosition();
            if (currentPosition != 2 && rg0Var.x) {
                rg0Var.W(2);
                rg0Var.x = false;
            }
            if (currentPosition != 3) {
                rg0Var.W(3);
            }
            Integer num = rg0Var.I;
            if (num != null && currentPosition == 0 && (eyVar = rg0Var.J) != null) {
                eyVar.u4(num.intValue());
                rg0Var.I = null;
            }
        }
        ug1Var.U();
    }

    @Override // org.telegram.ui.Components.l91
    public final void w(boolean z10) {
        ug1 ug1Var = this.V;
        rg0 rg0Var = (rg0) ug1Var;
        boolean z11 = !z10;
        if (rg0Var.F != null) {
            float positionAnimated = rg0Var.c.getPositionAnimated();
            rg0Var.n0(positionAnimated, z11);
            if (!z10) {
                rg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        rg0Var.h0();
        rg0Var.d0();
        rg0Var.b.invalidate();
        ug1Var.U();
        ug1Var.checkSystemBarColors();
    }
}
