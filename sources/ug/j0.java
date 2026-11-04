package ug;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import b8.mf;
import org.telegram.ui.Components.ni0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j0 extends j {
    public final h0 r0;
    public int s0;
    public int t0;
    public boolean u0;
    public g0 v0;

    public j0(Context context, PointF pointF, int i3, g0 g0Var, float f10, int i10) {
        super(context, pointF);
        h0 h0Var = new h0(context, f10);
        this.r0 = h0Var;
        h0Var.setMaxWidth(i10);
        this.v0 = g0Var;
        h0Var.b(i3, g0Var, false);
        m();
        this.t0 = 3;
        h0Var.c(3, this.s0);
        addView(h0Var, mf.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // ug.j
    public final i a() {
        return new i0(this, getContext());
    }

    public int getColor() {
        return this.s0;
    }

    @Override // ug.j
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i3 = this.t0 + 1;
        return i3 == 4 ? !this.u0 ? 1 : 0 : i3;
    }

    @Override // ug.j
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ni0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ni0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override // ug.j
    public float getStickyPaddingBottom() {
        return this.r0.h;
    }

    @Override // ug.j
    public float getStickyPaddingLeft() {
        return this.r0.f;
    }

    @Override // ug.j
    public float getStickyPaddingRight() {
        return this.r0.f;
    }

    @Override // ug.j
    public float getStickyPaddingTop() {
        return this.r0.h;
    }

    public int getType() {
        return this.t0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        k();
    }

    public void setColor(int i3) {
        this.u0 = true;
        this.s0 = i3;
    }

    public void setMaxWidth(int i3) {
        this.r0.setMaxWidth(i3);
    }

    public void setType(int i3) {
        this.t0 = i3;
        this.r0.c(i3, this.s0);
    }
}
