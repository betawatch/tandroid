// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s66 extends h44 {
    public final h66 s0;
    public int t0;
    public int u0;
    public boolean v0;
    public g66 w0;

    public s66(Context context, PointF pointF, int i, g66 g66Var, float f, int i2) {
        super(context, pointF);
        h66 h66Var = new h66(context, f);
        this.s0 = h66Var;
        h66Var.setMaxWidth(i2);
        this.w0 = g66Var;
        h66Var.b(i, g66Var, false);
        m();
        this.u0 = 3;
        h66Var.c(3, this.t0);
        addView(h66Var, tre.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // h44
    public final g44 a() {
        return new r66(this, getContext());
    }

    public int getColor() {
        return this.t0;
    }

    @Override // h44
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i = this.u0 + 1;
        return i == 4 ? !this.v0 ? 1 : 0 : i;
    }

    @Override // h44
    public a69 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new a69();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (hl.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (hl.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float e = uh9.e(L, 2.0f, getPositionX(), scaleX);
        return new a69(e, uh9.e(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + e) - e, L2 * scaleX);
    }

    @Override // h44
    public float getStickyPaddingBottom() {
        return this.s0.h;
    }

    @Override // h44
    public float getStickyPaddingLeft() {
        return this.s0.f;
    }

    @Override // h44
    public float getStickyPaddingRight() {
        return this.s0.f;
    }

    @Override // h44
    public float getStickyPaddingTop() {
        return this.s0.h;
    }

    public int getType() {
        return this.u0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        k();
    }

    public void setColor(int i) {
        this.v0 = true;
        this.t0 = i;
    }

    public void setMaxWidth(int i) {
        this.s0.setMaxWidth(i);
    }

    public void setType(int i) {
        this.u0 = i;
        this.s0.c(i, this.t0);
    }
}
