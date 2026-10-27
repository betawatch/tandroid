package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vg1 extends org.telegram.ui.Components.v91 {
    public boolean V;
    public final Path W;
    public final /* synthetic */ wg1 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg1(wg1 wg1Var, Context context) {
        super(context, null);
        this.a0 = wg1Var;
        this.W = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            Path path = this.W;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.V) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.v91
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.v91
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.v91
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((rg0) this.a0).X();
        if (X instanceof qg0) {
            return ((qg0) X).T(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.v91
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((rg0) this.a0).X();
        if (X instanceof qg0) {
            return ((qg0) X).T(motionEvent, true);
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
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.v91
    public final void t(View view, View view2, int i10, int i11) {
        this.a0.V();
    }

    @Override // org.telegram.ui.Components.v91
    public final void u() {
        ey eyVar;
        wg1 wg1Var = this.a0;
        rg0 rg0Var = (rg0) wg1Var;
        if (rg0Var.E != null) {
            rg0Var.j0(rg0Var.c.getCurrentPosition(), true);
            rg0Var.k0(0.0f, false);
        }
        rg0Var.b0();
        vg1 vg1Var = rg0Var.c;
        if (vg1Var != null) {
            int currentPosition = vg1Var.getCurrentPosition();
            if (currentPosition != 3) {
                SparseArray sparseArray = rg0Var.a;
                ug1 ug1Var = (ug1) sparseArray.get(3);
                if (ug1Var != null) {
                    org.telegram.ui.ActionBar.r2 r2Var = ug1Var.a;
                    if (ug1Var.c) {
                        r2Var.onBecomeFullyHidden();
                    }
                    if (ug1Var.d) {
                        r2Var.onPause();
                    }
                    r2Var.onFragmentDestroy();
                    r2Var.setParentLayout(null);
                }
                sparseArray.remove(3);
            }
            Integer num = rg0Var.H;
            if (num != null && currentPosition == 0 && (eyVar = rg0Var.I) != null) {
                eyVar.E4(num.intValue());
                rg0Var.H = null;
            }
        }
        wg1Var.V();
    }

    @Override // org.telegram.ui.Components.v91
    public final void w(boolean z10) {
        wg1 wg1Var = this.a0;
        rg0 rg0Var = (rg0) wg1Var;
        boolean z11 = !z10;
        if (rg0Var.E != null) {
            float positionAnimated = rg0Var.c.getPositionAnimated();
            rg0Var.k0(positionAnimated, z11);
            if (!z10) {
                rg0Var.j0(Math.round(positionAnimated), true);
            }
        }
        rg0Var.e0();
        rg0Var.b0();
        rg0Var.b.invalidate();
        wg1Var.V();
        wg1Var.checkSystemBarColors();
    }
}
