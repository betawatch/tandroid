package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import ci.nd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.rk0;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class w2 extends j {
    public final t0 q0;
    public boolean r0;
    public int s0;
    public int t0;
    public final nd u0;

    public w2(Context context, PointF pointF, int i10, nd ndVar, float f7, int i11) {
        super(context, pointF);
        t0 t0Var = new t0(context, f7);
        this.q0 = t0Var;
        t0Var.setMaxWidth(i11);
        t0Var.e(0, this.s0);
        this.u0 = ndVar;
        String str = ndVar.c;
        String a2 = ndVar.a();
        t0Var.d(i10, str);
        t0Var.setText(a2);
        m();
        addView(t0Var, y5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // qg.j
    public final i a() {
        return new q0(this, getContext());
    }

    public int getColor() {
        return this.s0;
    }

    @Override // qg.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // qg.j
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new rk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float w10 = rk.w(dp, 2.0f, getPositionX(), scaleX);
        return new rk0(w10, rk.w(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + w10) - w10, dp2 * scaleX);
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
