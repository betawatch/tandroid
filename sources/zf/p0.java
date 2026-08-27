package zf;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p0 extends j {
    public final n0 m0;
    public int n0;
    public int o0;
    public boolean p0;
    public m0 q0;

    public p0(Context context, PointF pointF, int i10, m0 m0Var, float f10, int i11) {
        super(context, pointF);
        n0 n0Var = new n0(context, f10);
        this.m0 = n0Var;
        n0Var.setMaxWidth(i11);
        this.q0 = m0Var;
        n0Var.b(i10, m0Var, false);
        m();
        this.o0 = 3;
        n0Var.c(3, this.n0);
        addView(n0Var, z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // zf.j
    public final i a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.n0;
    }

    @Override // zf.j
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.o0 + 1;
        return i10 == 4 ? !this.p0 ? 1 : 0 : i10;
    }

    @Override // zf.j
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float t10 = rl.t(dp, 2.0f, getPositionX(), scaleX);
        return new yj0(t10, rl.t(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + t10) - t10, dp2 * scaleX);
    }

    @Override // zf.j
    public float getStickyPaddingBottom() {
        return this.m0.h;
    }

    @Override // zf.j
    public float getStickyPaddingLeft() {
        return this.m0.f;
    }

    @Override // zf.j
    public float getStickyPaddingRight() {
        return this.m0.f;
    }

    @Override // zf.j
    public float getStickyPaddingTop() {
        return this.m0.h;
    }

    public int getType() {
        return this.o0;
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
        this.p0 = true;
        this.n0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.o0 = i10;
        this.m0.c(i10, this.n0);
    }
}
