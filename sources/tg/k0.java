package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k0 extends j {
    public final i0 r0;
    public int s0;
    public int t0;
    public boolean u0;
    public h0 v0;

    public k0(Context context, PointF pointF, int i7, h0 h0Var, float f10, int i10) {
        super(context, pointF);
        i0 i0Var = new i0(context, f10);
        this.r0 = i0Var;
        i0Var.setMaxWidth(i10);
        this.v0 = h0Var;
        i0Var.b(i7, h0Var, false);
        m();
        this.t0 = 3;
        i0Var.c(3, this.s0);
        addView(i0Var, ma.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // tg.j
    public final i a() {
        return new j0(this, getContext());
    }

    public int getColor() {
        return this.s0;
    }

    @Override // tg.j
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i7 = this.t0 + 1;
        return i7 == 4 ? !this.u0 ? 1 : 0 : i7;
    }

    @Override // tg.j
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yi0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = n10.y(L, 2.0f, getPositionX(), scaleX);
        return new yi0(y10, n10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override // tg.j
    public float getStickyPaddingBottom() {
        return this.r0.h;
    }

    @Override // tg.j
    public float getStickyPaddingLeft() {
        return this.r0.f;
    }

    @Override // tg.j
    public float getStickyPaddingRight() {
        return this.r0.f;
    }

    @Override // tg.j
    public float getStickyPaddingTop() {
        return this.r0.h;
    }

    public int getType() {
        return this.t0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public void setColor(int i7) {
        this.u0 = true;
        this.s0 = i7;
    }

    public void setMaxWidth(int i7) {
        this.r0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.t0 = i7;
        this.r0.c(i7, this.s0);
    }
}
