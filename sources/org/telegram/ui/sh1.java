package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sh1 extends org.telegram.ui.Components.h81 {
    public boolean T;
    public final Path U;
    public final /* synthetic */ th1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh1(th1 th1Var, Context context) {
        super(context, null);
        this.V = th1Var;
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

    @Override // org.telegram.ui.Components.h81
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.h81
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.h81
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((zg0) this.V).X();
        if (X instanceof yg0) {
            return ((yg0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.h81
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((zg0) this.V).X();
        if (X instanceof yg0) {
            return ((yg0) X).S(motionEvent, true);
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

    @Override // org.telegram.ui.Components.h81
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override // org.telegram.ui.Components.h81
    public final void u() {
        ry ryVar;
        th1 th1Var = this.V;
        zg0 zg0Var = (zg0) th1Var;
        if (zg0Var.F != null) {
            zg0Var.m0(zg0Var.c.getCurrentPosition(), true);
            zg0Var.n0(0.0f, false);
        }
        zg0Var.d0();
        sh1 sh1Var = zg0Var.c;
        if (sh1Var != null) {
            int currentPosition = sh1Var.getCurrentPosition();
            if (currentPosition != 2 && zg0Var.x) {
                zg0Var.W(2);
                zg0Var.x = false;
            }
            if (currentPosition != 3) {
                zg0Var.W(3);
            }
            Integer num = zg0Var.I;
            if (num != null && currentPosition == 0 && (ryVar = zg0Var.J) != null) {
                ryVar.w4(num.intValue());
                zg0Var.I = null;
            }
        }
        th1Var.U();
    }

    @Override // org.telegram.ui.Components.h81
    public final void w(boolean z10) {
        th1 th1Var = this.V;
        zg0 zg0Var = (zg0) th1Var;
        boolean z11 = !z10;
        if (zg0Var.F != null) {
            float positionAnimated = zg0Var.c.getPositionAnimated();
            zg0Var.n0(positionAnimated, z11);
            if (!z10) {
                zg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        zg0Var.h0();
        zg0Var.d0();
        zg0Var.b.invalidate();
        th1Var.U();
        th1Var.checkSystemBarColors();
    }
}
