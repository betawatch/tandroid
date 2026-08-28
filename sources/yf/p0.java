package yf;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.wj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p0 extends j {
    public final n0 m0;
    public int n0;
    public int o0;
    public boolean p0;
    public m0 q0;

    public p0(Context context, PointF pointF, int i9, m0 m0Var, float f10, int i10) {
        super(context, pointF);
        n0 n0Var = new n0(context, f10);
        this.m0 = n0Var;
        n0Var.setMaxWidth(i10);
        this.q0 = m0Var;
        n0Var.b(i9, m0Var, false);
        m();
        this.o0 = 3;
        n0Var.c(3, this.n0);
        addView(n0Var, e6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // yf.j
    public final i a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.n0;
    }

    @Override // yf.j
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i9 = this.o0 + 1;
        return i9 == 4 ? !this.p0 ? 1 : 0 : i9;
    }

    @Override // yf.j
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new wj0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float v = ll.v(dp, 2.0f, getPositionX(), scaleX);
        return new wj0(v, ll.v(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override // yf.j
    public float getStickyPaddingBottom() {
        return this.m0.h;
    }

    @Override // yf.j
    public float getStickyPaddingLeft() {
        return this.m0.f;
    }

    @Override // yf.j
    public float getStickyPaddingRight() {
        return this.m0.f;
    }

    @Override // yf.j
    public float getStickyPaddingTop() {
        return this.m0.h;
    }

    public int getType() {
        return this.o0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        k();
    }

    public void setColor(int i9) {
        this.p0 = true;
        this.n0 = i9;
    }

    public void setMaxWidth(int i9) {
        this.m0.setMaxWidth(i9);
    }

    public void setType(int i9) {
        this.o0 = i9;
        this.m0.c(i9, this.n0);
    }
}
