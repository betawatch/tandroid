package rg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import di.nd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vl;
import org.telegram.ui.Components.hk0;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class y2 extends k {
    public final u0 q0;
    public boolean r0;
    public int s0;
    public int t0;
    public final nd u0;

    public y2(Context context, PointF pointF, int i10, nd ndVar, float f7, int i11) {
        super(context, pointF);
        u0 u0Var = new u0(context, f7);
        this.q0 = u0Var;
        u0Var.setMaxWidth(i11);
        u0Var.e(0, this.s0);
        this.u0 = ndVar;
        String str = ndVar.c;
        String a2 = ndVar.a();
        u0Var.d(i10, str);
        u0Var.setText(a2);
        m();
        addView(u0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // rg.k
    public final j a() {
        return new r0(this, getContext());
    }

    public int getColor() {
        return this.s0;
    }

    @Override // rg.k
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // rg.k
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float u10 = vl.u(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(u10, vl.u(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override // rg.k
    public float getStickyPaddingBottom() {
        return this.q0.J;
    }

    @Override // rg.k
    public float getStickyPaddingLeft() {
        return this.q0.I;
    }

    @Override // rg.k
    public float getStickyPaddingRight() {
        return this.q0.I;
    }

    @Override // rg.k
    public float getStickyPaddingTop() {
        return this.q0.J;
    }

    public int getType() {
        return this.t0;
    }

    public int getTypesCount() {
        return this.q0.getTypesCount() - (!this.r0 ? 1 : 0);
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
        this.r0 = true;
        this.s0 = i10;
    }

    @Override // rg.k
    public void setIsVideo(boolean z10) {
        this.q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.t0 = i10;
        this.q0.e(i10, this.s0);
    }
}
