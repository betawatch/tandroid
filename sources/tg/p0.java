package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.na;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.aj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p0 extends n {
    public final n0 s0;
    public int t0;
    public int u0;
    public boolean v0;
    public m0 w0;

    public p0(Context context, PointF pointF, int i7, m0 m0Var, float f10, int i10) {
        super(context, pointF);
        n0 n0Var = new n0(context, f10);
        this.s0 = n0Var;
        n0Var.setMaxWidth(i10);
        this.w0 = m0Var;
        n0Var.b(i7, m0Var, false);
        m();
        this.u0 = 3;
        n0Var.c(3, this.t0);
        addView(n0Var, na.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // tg.n
    public final m a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.t0;
    }

    @Override // tg.n
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i7 = this.u0 + 1;
        return i7 == 4 ? !this.v0 ? 1 : 0 : i7;
    }

    @Override // tg.n
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new aj0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = m10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, m10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override // tg.n
    public float getStickyPaddingBottom() {
        return this.s0.h;
    }

    @Override // tg.n
    public float getStickyPaddingLeft() {
        return this.s0.f;
    }

    @Override // tg.n
    public float getStickyPaddingRight() {
        return this.s0.f;
    }

    @Override // tg.n
    public float getStickyPaddingTop() {
        return this.s0.h;
    }

    public int getType() {
        return this.u0;
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
        this.v0 = true;
        this.t0 = i7;
    }

    public void setMaxWidth(int i7) {
        this.s0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.u0 = i7;
        this.s0.c(i7, this.t0);
    }
}
