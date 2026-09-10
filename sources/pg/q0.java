package pg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.rk0;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q0 extends j {
    public final o0 q0;
    public int r0;
    public int s0;
    public boolean t0;
    public n0 u0;

    public q0(Context context, PointF pointF, int i10, n0 n0Var, float f7, int i11) {
        super(context, pointF);
        o0 o0Var = new o0(context, f7);
        this.q0 = o0Var;
        o0Var.setMaxWidth(i11);
        this.u0 = n0Var;
        o0Var.b(i10, n0Var, false);
        m();
        this.s0 = 3;
        o0Var.c(3, this.r0);
        addView(o0Var, a6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // pg.j
    public final i a() {
        return new p0(this, getContext());
    }

    public int getColor() {
        return this.r0;
    }

    @Override // pg.j
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.s0 + 1;
        return i10 == 4 ? !this.t0 ? 1 : 0 : i10;
    }

    @Override // pg.j
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new rk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float u10 = em.u(dp, 2.0f, getPositionX(), scaleX);
        return new rk0(u10, em.u(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override // pg.j
    public float getStickyPaddingBottom() {
        return this.q0.h;
    }

    @Override // pg.j
    public float getStickyPaddingLeft() {
        return this.q0.f;
    }

    @Override // pg.j
    public float getStickyPaddingRight() {
        return this.q0.f;
    }

    @Override // pg.j
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
