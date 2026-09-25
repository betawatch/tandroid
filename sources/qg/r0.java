package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.sk0;
import w7.y5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class r0 extends j {
    public final p0 q0;
    public int r0;
    public int s0;
    public boolean t0;
    public o0 u0;

    public r0(Context context, PointF pointF, int i10, o0 o0Var, float f7, int i11) {
        super(context, pointF);
        p0 p0Var = new p0(context, f7);
        this.q0 = p0Var;
        p0Var.setMaxWidth(i11);
        this.u0 = o0Var;
        p0Var.b(i10, o0Var, false);
        m();
        this.s0 = 3;
        p0Var.c(3, this.r0);
        addView(p0Var, y5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // qg.j
    public final i a() {
        return new q0(this, getContext());
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
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new sk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = ok.x(dp, 2.0f, getPositionX(), scaleX);
        return new sk0(x10, ok.x(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + x10) - x10, dp2 * scaleX);
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
