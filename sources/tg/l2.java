package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ha;
import fi.sb;
import org.telegram.ui.Components.ki0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l2 extends j {
    public final m0 q0;
    public boolean r0;
    public int s0;
    public int t0;
    public final sb u0;

    public l2(Context context, PointF pointF, int i7, sb sbVar, float f10, int i10) {
        super(context, pointF);
        m0 m0Var = new m0(context, f10);
        this.q0 = m0Var;
        m0Var.setMaxWidth(i10);
        m0Var.e(0, this.s0);
        this.u0 = sbVar;
        String str = sbVar.c;
        String a10 = sbVar.a();
        m0Var.d(i7, str);
        m0Var.setText(a10);
        m();
        addView(m0Var, ha.e(-2, -2, 51));
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

    @Override // tg.j
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ki0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ki0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override // tg.j
    public float getStickyPaddingBottom() {
        return this.q0.J;
    }

    @Override // tg.j
    public float getStickyPaddingLeft() {
        return this.q0.I;
    }

    @Override // tg.j
    public float getStickyPaddingRight() {
        return this.q0.I;
    }

    @Override // tg.j
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public void setColor(int i7) {
        this.r0 = true;
        this.s0 = i7;
    }

    @Override // tg.j
    public void setIsVideo(boolean z9) {
        this.q0.setIsVideo(true);
    }

    public void setMaxWidth(int i7) {
        this.q0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.t0 = i7;
        this.q0.e(i7, this.s0);
    }
}
