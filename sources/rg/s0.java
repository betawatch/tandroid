package rg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.il0;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class s0 extends j {
    public final q0 q0;
    public int r0;
    public int s0;
    public boolean t0;
    public p0 u0;

    public s0(Context context, PointF pointF, int i10, p0 p0Var, float f7, int i11) {
        super(context, pointF);
        q0 q0Var = new q0(context, f7);
        this.q0 = q0Var;
        q0Var.setMaxWidth(i11);
        this.u0 = p0Var;
        q0Var.b(i10, p0Var, false);
        m();
        this.s0 = 3;
        q0Var.c(3, this.r0);
        addView(q0Var, z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // rg.j
    public final i a() {
        return new r0(this, getContext());
    }

    public int getColor() {
        return this.r0;
    }

    @Override // rg.j
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.s0 + 1;
        return i10 == 4 ? !this.t0 ? 1 : 0 : i10;
    }

    @Override // rg.j
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new il0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y3 = sk.y(dp, 2.0f, getPositionX(), scaleX);
        return new il0(y3, sk.y(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + y3) - y3, dp2 * scaleX);
    }

    @Override // rg.j
    public float getStickyPaddingBottom() {
        return this.q0.h;
    }

    @Override // rg.j
    public float getStickyPaddingLeft() {
        return this.q0.f;
    }

    @Override // rg.j
    public float getStickyPaddingRight() {
        return this.q0.f;
    }

    @Override // rg.j
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
