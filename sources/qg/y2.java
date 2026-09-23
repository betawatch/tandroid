package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import ci.kd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ul;
import org.telegram.ui.Components.ik0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y2 extends j {
    public final v0 q0;
    public boolean r0;
    public int s0;
    public int t0;
    public final kd u0;

    public y2(Context context, PointF pointF, int i10, kd kdVar, float f7, int i11) {
        super(context, pointF);
        v0 v0Var = new v0(context, f7);
        this.q0 = v0Var;
        v0Var.setMaxWidth(i11);
        v0Var.e(0, this.s0);
        this.u0 = kdVar;
        String str = kdVar.c;
        String a2 = kdVar.a();
        v0Var.d(i10, str);
        v0Var.setText(a2);
        m();
        addView(v0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // qg.j
    public final i a() {
        return new s0(this, getContext());
    }

    public int getColor() {
        return this.s0;
    }

    @Override // qg.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // qg.j
    public ik0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ik0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float v = ul.v(dp, 2.0f, getPositionX(), scaleX);
        return new ik0(v, ul.v(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override // qg.j
    public float getStickyPaddingBottom() {
        return this.q0.J;
    }

    @Override // qg.j
    public float getStickyPaddingLeft() {
        return this.q0.I;
    }

    @Override // qg.j
    public float getStickyPaddingRight() {
        return this.q0.I;
    }

    @Override // qg.j
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

    @Override // qg.j
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
