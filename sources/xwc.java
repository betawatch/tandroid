// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xwc extends h44 {
    public final ld6 s0;
    public boolean t0;
    public int u0;
    public int v0;
    public final vwc w0;

    public xwc(Context context, PointF pointF, int i, vwc vwcVar, float f, int i2) {
        super(context, pointF);
        ld6 ld6Var = new ld6(context, f);
        this.s0 = ld6Var;
        ld6Var.setMaxWidth(i2);
        ld6Var.e(0, this.u0);
        this.w0 = vwcVar;
        String str = vwcVar.c;
        String a = vwcVar.a();
        ld6Var.d(i, str);
        ld6Var.setText(a);
        m();
        addView(ld6Var, tre.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // h44
    public final g44 a() {
        return new r66(this, getContext());
    }

    public int getColor() {
        return this.u0;
    }

    @Override // h44
    public float getMaxScale() {
        return 1.5f;
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
        return this.s0.K;
    }

    @Override // h44
    public float getStickyPaddingLeft() {
        return this.s0.J;
    }

    @Override // h44
    public float getStickyPaddingRight() {
        return this.s0.J;
    }

    @Override // h44
    public float getStickyPaddingTop() {
        return this.s0.K;
    }

    public int getType() {
        return this.v0;
    }

    public int getTypesCount() {
        return this.s0.getTypesCount() - (!this.t0 ? 1 : 0);
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
        this.t0 = true;
        this.u0 = i;
    }

    @Override // h44
    public void setIsVideo(boolean z) {
        this.s0.setIsVideo(true);
    }

    public void setMaxWidth(int i) {
        this.s0.setMaxWidth(i);
    }

    public void setType(int i) {
        this.v0 = i;
        this.s0.e(i, this.u0);
    }
}
