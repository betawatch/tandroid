package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class qh1 extends org.telegram.ui.Components.h91 {
    public boolean V;
    public final Path W;
    public final /* synthetic */ rh1 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh1(rh1 rh1Var, Context context) {
        super(context, null);
        this.a0 = rh1Var;
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

    @Override // org.telegram.ui.Components.h91
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.h91
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.h91
    public final boolean j(MotionEvent motionEvent) {
        Object W = ((ch0) this.a0).W();
        if (W instanceof bh0) {
            return ((bh0) W).Q(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.h91
    public final boolean k(MotionEvent motionEvent) {
        Object W = ((ch0) this.a0).W();
        if (W instanceof bh0) {
            return ((bh0) W).Q(motionEvent, true);
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

    @Override // org.telegram.ui.Components.h91
    public final void t(View view, View view2, int i10, int i11) {
        this.a0.S();
    }

    @Override // org.telegram.ui.Components.h91
    public final void u() {
        uy uyVar;
        rh1 rh1Var = this.a0;
        ch0 ch0Var = (ch0) rh1Var;
        if (ch0Var.F != null) {
            ch0Var.m0(ch0Var.c.getCurrentPosition(), true);
            ch0Var.n0(0.0f, false);
        }
        ch0Var.d0();
        qh1 qh1Var = ch0Var.c;
        if (qh1Var != null) {
            int currentPosition = qh1Var.getCurrentPosition();
            if (currentPosition != 2 && ch0Var.x) {
                ch0Var.U(2);
                ch0Var.x = false;
            }
            if (currentPosition != 3) {
                ch0Var.U(3);
            }
            Integer num = ch0Var.I;
            if (num != null && currentPosition == 0 && (uyVar = ch0Var.J) != null) {
                uyVar.F4(num.intValue());
                ch0Var.I = null;
            }
        }
        rh1Var.S();
    }

    @Override // org.telegram.ui.Components.h91
    public final void w(boolean z10) {
        rh1 rh1Var = this.a0;
        ch0 ch0Var = (ch0) rh1Var;
        boolean z11 = !z10;
        if (ch0Var.F != null) {
            float positionAnimated = ch0Var.c.getPositionAnimated();
            ch0Var.n0(positionAnimated, z11);
            if (!z10) {
                ch0Var.m0(Math.round(positionAnimated), true);
            }
        }
        ch0Var.h0();
        ch0Var.d0();
        ch0Var.b.invalidate();
        rh1Var.S();
        rh1Var.checkSystemBarColors();
    }
}
