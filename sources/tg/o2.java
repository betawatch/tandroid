package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ma;
import hi.pb;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.aj0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class o2 extends j {
    public final n0 r0;
    public boolean s0;
    public int t0;
    public int u0;
    public final pb v0;

    public o2(Context context, PointF pointF, int i7, pb pbVar, float f10, int i10) {
        super(context, pointF);
        n0 n0Var = new n0(context, f10);
        this.r0 = n0Var;
        n0Var.setMaxWidth(i10);
        n0Var.e(0, this.t0);
        this.v0 = pbVar;
        String str = pbVar.c;
        String a10 = pbVar.a();
        n0Var.d(i7, str);
        n0Var.setText(a10);
        m();
        addView(n0Var, ma.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // tg.j
    public final i a() {
        return new k0(this, getContext());
    }

    public int getColor() {
        return this.t0;
    }

    @Override // tg.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // tg.j
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new aj0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = o10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, o10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override // tg.j
    public float getStickyPaddingBottom() {
        return this.r0.K;
    }

    @Override // tg.j
    public float getStickyPaddingLeft() {
        return this.r0.J;
    }

    @Override // tg.j
    public float getStickyPaddingRight() {
        return this.r0.J;
    }

    @Override // tg.j
    public float getStickyPaddingTop() {
        return this.r0.K;
    }

    public int getType() {
        return this.u0;
    }

    public int getTypesCount() {
        return this.r0.getTypesCount() - (!this.s0 ? 1 : 0);
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
        this.s0 = true;
        this.t0 = i7;
    }

    @Override // tg.j
    public void setIsVideo(boolean z10) {
        this.r0.setIsVideo(true);
    }

    public void setMaxWidth(int i7) {
        this.r0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.u0 = i7;
        this.r0.e(i7, this.t0);
    }
}
