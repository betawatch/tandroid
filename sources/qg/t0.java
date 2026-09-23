package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ul;
import org.telegram.ui.Components.ik0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class t0 extends j {
    public final r0 q0;
    public int r0;
    public int s0;
    public boolean t0;
    public q0 u0;

    public t0(Context context, PointF pointF, int i10, q0 q0Var, float f7, int i11) {
        super(context, pointF);
        r0 r0Var = new r0(context, f7);
        this.q0 = r0Var;
        r0Var.setMaxWidth(i11);
        this.u0 = q0Var;
        r0Var.b(i10, q0Var, false);
        m();
        this.s0 = 3;
        r0Var.c(3, this.r0);
        addView(r0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // qg.j
    public final i a() {
        return new s0(this, getContext());
    }

    public int getColor() {
        return this.r0;
    }

    @Override // qg.j
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.s0 + 1;
        return i10 == 4 ? !this.t0 ? 1 : 0 : i10;
    }

    @Override // qg.j
    public ik0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ik0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float v = ul.v(dp, 2.0f, getPositionX(), scaleX);
        return new ik0(v, ul.v(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override // qg.j
    public float getStickyPaddingBottom() {
        return this.q0.h;
    }

    @Override // qg.j
    public float getStickyPaddingLeft() {
        return this.q0.f;
    }

    @Override // qg.j
    public float getStickyPaddingRight() {
        return this.q0.f;
    }

    @Override // qg.j
    public float getStickyPaddingTop() {
        return this.q0.h;
    }

    public int getType() {
        return this.s0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public void setColor(int i10) {
        this.t0 = true;
        this.r0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.s0 = i10;
        this.q0.c(i10, this.r0);
    }
}
